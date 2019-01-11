package com.example.user.janacollection;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.user.janacollection.model.Jana;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDataFromApi();


    }

    private void getDataFromApi() {
        final ProgressDialog progressBar = new ProgressDialog(this);
        progressBar.show();
        RetrofitService service = RetrofitClient.getRetrofitInstance().create(RetrofitService.class);
        Call<List<Jana>> call = service.getNoticeData(3188, "2018-12-13");
        call.enqueue(new Callback<List<Jana>>() {
            @Override
            public void onResponse(Call<List<Jana>> call, Response<List<Jana>> response) {
                progressBar.dismiss();
                generateNoticeList(response.body());
            }

            @Override
            public void onFailure(Call<List<Jana>> call, Throwable t) {
                progressBar.dismiss();
            }
        });
    }

    private void generateNoticeList(List<Jana> noticeArrayList) {
        recyclerView = findViewById(R.id.recycler_view_notice_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                linearLayoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
        JanaAdapter adapter = new JanaAdapter(noticeArrayList);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }
}

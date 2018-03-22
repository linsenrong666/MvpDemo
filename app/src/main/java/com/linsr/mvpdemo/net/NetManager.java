package com.linsr.mvpdemo.net;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Description
 *
 * @author linsenrong on 2018/3/12 18:27
 */

public class NetManager {

    //创建接口
    public interface GitHub {
        @GET("/repos/{owner}/{repo}/contributors")
        Call<ResponseBody> contributors(
                @Path("owner") String owner,
                @Path("repo") String repo);
    }

    public NetManager() {
        //建造者模式
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://fanyi.youdao.com/") // 设置网络请求的Url地址
                .addConverterFactory(GsonConverterFactory.create()) // 设置数据解析器
                .build();

        GitHub gitHub = retrofit.create(GitHub.class);
        gitHub.contributors("aa", "bb");

    }
}

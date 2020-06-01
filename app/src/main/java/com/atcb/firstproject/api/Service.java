package com.atcb.firstproject.api;

import com.atcb.firstproject.model.Data;
import com.atcb.firstproject.model.Datum;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("list?tag=Sweet&cc=US&ftime=1584515945863&os_ver=5.1.1&o=0&p=48&spkg=com.amber.callerlive&sh=1600&brand=samsung&appver=14&lang=en_US&sw=900&uid=Z65D4019A98F75C0EBDE36884C4199E0F11&os_vcode=22&type=60&model=SM-G930K%22\"")
    Call<Data> getData();
}

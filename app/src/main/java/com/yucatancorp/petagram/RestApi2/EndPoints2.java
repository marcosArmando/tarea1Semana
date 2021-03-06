package com.yucatancorp.petagram.RestApi2;

import com.yucatancorp.petagram.RestApi2.model2.UsuarioResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;

/**
 * Created by marcos on 28/05/2017.
 */

public interface EndPoints2 {

    @FormUrlEncoded
    @POST(ConstantesRestAPI2.KEY_POST_ID_TOKEN2)
    Call<UsuarioResponse> registrarTokenID(@Field("token") String token, @Field("user") String user);

}

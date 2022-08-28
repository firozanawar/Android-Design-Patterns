package com.firozanwar.designpattern.Facade;

public class ApiManager {

    // Class code in commented due to error. This is only to review

    /*private static ApiService apiService;
    private static Retrofit retrofit;

    public static ApiService getApiClient() {
        if (apiService == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(ApiConfig.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            apiService = retrofit.create(ApiService.class);
        }
    }
    
    public interface ApiService {
        @FormUrlEncoded
        @POST(ApiConfig.EndPoint.SIGN_IN)
        Call<LoginResponse> login(@Field("email") String username,
                                  @Field("password") String password);
    }*/
}
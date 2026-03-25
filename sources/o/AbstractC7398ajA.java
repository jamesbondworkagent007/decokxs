package o;

import retrofit2.Call;
import retrofit2.Response;

/* JADX INFO: renamed from: o.ajA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC7398ajA<T> implements retrofit2.Callback<T> {
    public abstract void AEQbTJ(Call<T> call, Response<T> response);

    public abstract void copydefault(long j, long j2);

    @Override // retrofit2.Callback
    public void onResponse(Call<T> call, Response<T> response) {
        if (response.isSuccessful()) {
            AEQbTJ(call, response);
        } else {
            onFailure(call, new java.lang.Throwable(response.message()));
        }
    }
}

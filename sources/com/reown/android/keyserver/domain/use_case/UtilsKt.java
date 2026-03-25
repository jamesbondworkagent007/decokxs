package com.reown.android.keyserver.domain.use_case;

import com.reown.android.keyserver.model.KeyServerHttpResponse;
import com.reown.android.keyserver.model.KeyServerResponse;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes17.dex */
public final class UtilsKt {
    public static final /* synthetic */ void unwrapUnit(Response response) throws Throwable {
        Intrinsics.checkNotNullParameter(response, "");
        if (response.isSuccessful() && response.body() != null) {
            Object objBody = response.body();
            Intrinsics.copydefault(objBody);
            if (Intrinsics.EZpvd((Object) ((KeyServerHttpResponse) objBody).getStatus(), (Object) "SUCCESS")) {
                return;
            }
            Object objBody2 = response.body();
            Intrinsics.copydefault(objBody2);
            KeyServerHttpResponse.Error error = ((KeyServerHttpResponse) objBody2).getError();
            throw new Throwable(error != null ? error.getMessage() : null);
        }
        ResponseBody responseBodyErrorBody = response.errorBody();
        throw new Throwable(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null);
    }

    public static final /* synthetic */ KeyServerResponse unwrapValue(Response response) throws Throwable {
        Intrinsics.checkNotNullParameter(response, "");
        if (response.isSuccessful() && response.body() != null) {
            Object objBody = response.body();
            Intrinsics.copydefault(objBody);
            if (Intrinsics.EZpvd((Object) ((KeyServerHttpResponse) objBody).getStatus(), (Object) "SUCCESS")) {
                Object objBody2 = response.body();
                Intrinsics.copydefault(objBody2);
                if (((KeyServerHttpResponse) objBody2).getValue() != null) {
                    Object objBody3 = response.body();
                    Intrinsics.copydefault(objBody3);
                    Object value = ((KeyServerHttpResponse) objBody3).getValue();
                    Intrinsics.copydefault(value);
                    return (KeyServerResponse) value;
                }
                throw new Throwable("Expected value is null");
            }
            Object objBody4 = response.body();
            Intrinsics.copydefault(objBody4);
            KeyServerHttpResponse.Error error = ((KeyServerHttpResponse) objBody4).getError();
            throw new Throwable(error != null ? error.getMessage() : null);
        }
        ResponseBody responseBodyErrorBody = response.errorBody();
        throw new Throwable(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null);
    }
}

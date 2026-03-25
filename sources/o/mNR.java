package o;

import o.mJK;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes8.dex */
public class mNR implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws java.lang.Exception {
        Request request = chain.request();
        java.lang.System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            try {
                mJK.StateListAnimator stateListAnimator = mJK.Companion;
                if (stateListAnimator.EZpvd().AYXKKw()) {
                    stateListAnimator.EZpvd().AEQbTJ(request, responseProceed, OLrzqt(responseProceed));
                }
            } catch (java.lang.Exception unused) {
            }
            return responseProceed;
        } catch (java.lang.Exception e) {
            try {
                if (mJK.Companion.EZpvd().AYXKKw()) {
                    mJK.Companion.EZpvd().EZpvd(request, e);
                }
            } catch (java.lang.Exception unused2) {
            }
            throw e;
        }
    }

    public final ResponseBody OLrzqt(Response response) {
        try {
            ResponseBody responseBodyBody = response.body();
            BufferedSource bufferedSourceSource = responseBodyBody.source();
            bufferedSourceSource.request(Long.MAX_VALUE);
            okio.Buffer bufferClone = bufferedSourceSource.buffer().clone();
            return ResponseBody.create(responseBodyBody.contentType(), bufferClone.size(), bufferClone);
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}

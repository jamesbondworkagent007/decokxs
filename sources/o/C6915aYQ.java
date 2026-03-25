package o;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: o.aYQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6915aYQ extends Converter.Factory {
    public static C6915aYQ OLrzqt() {
        return new C6915aYQ();
    }

    private C6915aYQ() {
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, Retrofit retrofit) {
        return new C6920aYV();
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(java.lang.reflect.Type type, java.lang.annotation.Annotation[] annotationArr, java.lang.annotation.Annotation[] annotationArr2, Retrofit retrofit) {
        return new C6917aYS(type);
    }
}

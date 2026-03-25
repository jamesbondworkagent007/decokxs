package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: o.roU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43394roU extends Converter.Factory {
    public final Converter.Factory AEQbTJ;

    public C43394roU(@NotNull Converter.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "");
        this.AEQbTJ = factory;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(@NotNull java.lang.reflect.Type type, @NotNull java.lang.annotation.Annotation[] annotationArr, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        Intrinsics.checkNotNullParameter(retrofit, "");
        try {
            return this.AEQbTJ.responseBodyConverter(type, annotationArr, retrofit);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(@NotNull java.lang.reflect.Type type, @NotNull java.lang.annotation.Annotation[] annotationArr, @NotNull java.lang.annotation.Annotation[] annotationArr2, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        Intrinsics.checkNotNullParameter(annotationArr2, "");
        Intrinsics.checkNotNullParameter(retrofit, "");
        try {
            return this.AEQbTJ.requestBodyConverter(type, annotationArr, annotationArr2, retrofit);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}

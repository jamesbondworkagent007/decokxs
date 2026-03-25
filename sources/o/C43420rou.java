package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: o.rou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43420rou extends Converter.Factory {
    public final Converter.Factory EZpvd;

    public C43420rou(@NotNull Converter.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "");
        this.EZpvd = factory;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(@NotNull java.lang.reflect.Type type, @NotNull java.lang.annotation.Annotation[] annotationArr, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        Intrinsics.checkNotNullParameter(retrofit, "");
        return new C43374roA(this.EZpvd.responseBodyConverter(type, annotationArr, retrofit));
    }
}

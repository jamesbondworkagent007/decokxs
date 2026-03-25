package o;

import com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: o.auU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@ExperimentalSerializationApi
public final class C8001auU extends Converter.Factory {
    public final Serializer KWHzl;
    public final MediaType copydefault;

    public C8001auU(@NotNull MediaType mediaType, @NotNull Serializer serializer) {
        Intrinsics.checkNotNullParameter(mediaType, "");
        Intrinsics.checkNotNullParameter(serializer, "");
        this.copydefault = mediaType;
        this.KWHzl = serializer;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(@NotNull java.lang.reflect.Type type, @NotNull java.lang.annotation.Annotation[] annotationArr, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        Intrinsics.checkNotNullParameter(retrofit, "");
        return new C7998auR(this.KWHzl.serializer(type), this.KWHzl);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(@NotNull java.lang.reflect.Type type, @NotNull java.lang.annotation.Annotation[] annotationArr, @NotNull java.lang.annotation.Annotation[] annotationArr2, @NotNull Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(type, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        Intrinsics.checkNotNullParameter(annotationArr2, "");
        Intrinsics.checkNotNullParameter(retrofit, "");
        return new C8004auY(this.copydefault, this.KWHzl.serializer(type), this.KWHzl);
    }
}

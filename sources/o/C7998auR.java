package o;

import com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

/* JADX INFO: renamed from: o.auR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7998auR<T> implements Converter<ResponseBody, T> {
    public final Serializer EZpvd;
    public final DeserializationStrategy<T> OLrzqt;

    public C7998auR(@NotNull DeserializationStrategy<T> deserializationStrategy, @NotNull Serializer serializer) {
        Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        Intrinsics.checkNotNullParameter(serializer, "");
        this.OLrzqt = deserializationStrategy;
        this.EZpvd = serializer;
    }

    /* JADX DEBUG: Method merged with bridge method: convert(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // retrofit2.Converter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public T convert(@NotNull ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "");
        return (T) this.EZpvd.KWHzl(this.OLrzqt, responseBody);
    }
}

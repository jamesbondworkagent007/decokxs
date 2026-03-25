package o;

import com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

/* JADX INFO: renamed from: o.auY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8004auY<T> implements Converter<T, RequestBody> {
    public final Serializer EZpvd;
    public final SerializationStrategy<T> OLrzqt;
    public final MediaType copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.serialization.SerializationStrategy<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C8004auY(@NotNull MediaType mediaType, @NotNull SerializationStrategy<? super T> serializationStrategy, @NotNull Serializer serializer) {
        Intrinsics.checkNotNullParameter(mediaType, "");
        Intrinsics.checkNotNullParameter(serializationStrategy, "");
        Intrinsics.checkNotNullParameter(serializer, "");
        this.copydefault = mediaType;
        this.OLrzqt = serializationStrategy;
        this.EZpvd = serializer;
    }

    /* JADX DEBUG: Method merged with bridge method: convert(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // retrofit2.Converter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public RequestBody convert(T t) {
        return this.EZpvd.KWHzl(this.copydefault, this.OLrzqt, t);
    }
}

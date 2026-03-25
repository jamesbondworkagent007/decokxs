package o;

import com.jakewharton.retrofit2.converter.kotlinx.serialization.Serializer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.StringFormat;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

/* JADX INFO: renamed from: o.avb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8059avb {
    @ExperimentalSerializationApi
    public static final Converter.Factory KWHzl(@NotNull StringFormat stringFormat, @NotNull MediaType mediaType) {
        Intrinsics.checkNotNullParameter(stringFormat, "");
        Intrinsics.checkNotNullParameter(mediaType, "");
        return new C8001auU(mediaType, new Serializer.TaskDescription(stringFormat));
    }
}

package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;

/* JADX INFO: renamed from: o.roA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43374roA<T> implements Converter<ResponseBody, T> {
    public final Converter<ResponseBody, T> KWHzl;

    public C43374roA(Converter<ResponseBody, T> converter) {
        this.KWHzl = converter;
    }

    /* JADX DEBUG: Method merged with bridge method: convert(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // retrofit2.Converter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public T convert(@NotNull ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "");
        try {
            Converter<ResponseBody, T> converter = this.KWHzl;
            if (converter != null) {
                return converter.convert(responseBody);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
            pUU.copydefault("BaseRespConvertFactory", "ResponseBodyConverter exception: " + Unit.INSTANCE);
        }
        return null;
    }
}

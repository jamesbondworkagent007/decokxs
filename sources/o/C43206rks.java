package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import okhttp3.MediaType;
import retrofit2.Converter;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: renamed from: o.rks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43206rks extends C43280rmM {
    public final java.util.List<Converter.Factory> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43395roV
    public java.util.List<Converter.Factory> getConvertFactories() {
        return this.EZpvd;
    }

    public C43206rks() {
        super(null, 1, null);
        this.EZpvd = yDY.gEmmrt(GsonConverterFactory.create(), C8059avb.KWHzl(JsonKt.Json$default(null, new Function1() { // from class: o.rku
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43206rks.KWHzl((JsonBuilder) obj);
            }
        }, 1, null), MediaType.Companion.get("application/json")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setUseArrayPolymorphism(true);
        return Unit.INSTANCE;
    }
}

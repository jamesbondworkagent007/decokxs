package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: renamed from: o.tiH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47023tiH extends C43280rmM {
    public final java.util.List<Converter.Factory> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43395roV
    public java.util.List<Converter.Factory> getConvertFactories() {
        return this.KWHzl;
    }

    public C47023tiH() {
        super(null, 1, null);
        this.KWHzl = yDY.gEmmrt(GsonConverterFactory.create(), C8059avb.KWHzl(JsonKt.Json$default(null, new Function1() { // from class: o.tiI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47023tiH.OLrzqt((JsonBuilder) obj);
            }
        }, 1, null), MediaType.Companion.get("application/json")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setUseArrayPolymorphism(true);
        return Unit.INSTANCE;
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
        builderInitClientBuilder.addInterceptor(new C46980thR());
        return builderInitClientBuilder;
    }
}

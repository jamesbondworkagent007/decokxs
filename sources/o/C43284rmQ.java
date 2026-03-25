package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import okhttp3.MediaType;

/* JADX INFO: renamed from: o.rmQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43284rmQ {
    public static final Json AEQbTJ = JsonKt.Json$default(null, new Function1() { // from class: o.rmP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C43284rmQ.OLrzqt((JsonBuilder) obj);
        }
    }, 1, null);
    public static final MediaType EZpvd = MediaType.Companion.get("application/json");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Json KWHzl() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final MediaType copydefault() {
        return EZpvd;
    }

    public static final Unit OLrzqt(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(false);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setUseArrayPolymorphism(true);
        return Unit.INSTANCE;
    }
}

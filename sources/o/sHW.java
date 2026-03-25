package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: loaded from: classes10.dex */
public final class sHW {
    public static final sHY copydefault() {
        return new sHY(JsonKt.Json(C33489mxS.KWHzl.AEQbTJ(), new Function1() { // from class: o.sHX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sHW.EZpvd((JsonBuilder) obj);
            }
        }));
    }

    public static final Unit EZpvd(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setPrettyPrint(true);
        return Unit.INSTANCE;
    }
}

package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* JADX INFO: renamed from: o.mJr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31943mJr extends AbstractC33073mpa {
    public final Json zLjUOn = JsonKt.Json$default(null, new Function1() { // from class: o.mJu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C31943mJr.OLrzqt((JsonBuilder) obj);
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setIgnoreUnknownKeys(false);
        jsonBuilder.setEncodeDefaults(false);
        return Unit.INSTANCE;
    }
}

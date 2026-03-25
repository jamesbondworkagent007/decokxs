package o;

import com.okinc.components.track.ABTestManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class sEI {
    public static final sEI KWHzl = new sEI();

    private sEI() {
    }

    public final boolean EZpvd() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "im_emoji_reaction", null, 2, null), (java.lang.Object) "treatment");
    }

    public final int copydefault() {
        java.lang.Integer intOrNull;
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "im_suggested_contacts", null, 2, null);
        if (value$default == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(value$default)) == null) {
            return 20;
        }
        return intOrNull.intValue();
    }

    public final int KWHzl() {
        java.lang.Integer intOrNull;
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "im_conversation_count_suggested_contacts", null, 2, null);
        if (value$default == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(value$default)) == null) {
            return 30;
        }
        return intOrNull.intValue();
    }

    public final java.lang.Float AEQbTJ() {
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "im_text_bubble_width_multiplier", null, 2, null);
        if (value$default != null) {
            return C59443zhD.fIwbmz(value$default);
        }
        return null;
    }
}

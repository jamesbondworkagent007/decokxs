package o;

import com.okinc.business.dexlogic.track.enums.BusinessType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.heA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22370heA {
    public static boolean OLrzqt;
    public static final Function1<java.lang.String, java.lang.Boolean> AEQbTJ = new Function1() { // from class: o.heB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(C22370heA.KWHzl((java.lang.String) obj));
        }
    };
    public static final java.util.HashMap<java.lang.Long, java.lang.Long> copydefault = new java.util.HashMap<>();
    public static java.lang.String EZpvd = BusinessType.SWAP.getValue();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.HashMap<java.lang.Long, java.lang.Long> KWHzl() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String OLrzqt() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void copydefault(boolean z) {
        OLrzqt = z;
    }

    public static final boolean EZpvd(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "9004");
    }

    public static final boolean KWHzl(java.lang.String str) {
        return yDY.gEmmrt("4", "5").contains(str);
    }

    public static final int OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C23313hvq.OLrzqt(str, "12")) {
            str = "12";
        }
        return C33129mqd.AhwBna(str);
    }
}

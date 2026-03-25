package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xHk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54411xHk {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final java.lang.String AYXKKw = "0";
    public static final java.lang.String OLrzqt = MultiTransferSignData.DEFAULT_INTERVAL;
    public static final java.lang.String EZpvd = "1";
    public static final java.lang.String copydefault = "51171";
    public static final java.lang.String KWHzl = "1";
    public static final java.lang.String AEQbTJ = "2";

    /* JADX INFO: renamed from: o.xHk$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xHk.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final java.lang.String KWHzl() {
            return C54411xHk.AYXKKw;
        }

        public final java.lang.String OLrzqt() {
            return C54411xHk.OLrzqt;
        }

        public final java.lang.String AEQbTJ() {
            return C54411xHk.EZpvd;
        }

        public static /* synthetic */ java.lang.String getUrlKey$default(StateListAnimator stateListAnimator, boolean z, boolean z2, boolean z3, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z3 = false;
            }
            return stateListAnimator.EZpvd(z, z2, z3, str);
        }

        public final java.lang.String EZpvd(boolean z, boolean z2, boolean z3, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.String strSubstring = str.substring(StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) str, "/", 0, false, 6, (java.lang.Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            if (z2) {
                strSubstring = strSubstring + "needDisConnbg";
            }
            if (z3) {
                strSubstring = strSubstring + "Depth";
            }
            java.lang.String strAYXKKw = C55697xoo.OLrzqt.AYXKKw();
            if (!z) {
                return strSubstring;
            }
            return strSubstring + strAYXKKw;
        }
    }
}

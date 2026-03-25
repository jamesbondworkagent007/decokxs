package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55005xbl {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final java.util.Set<java.lang.String> EZpvd = yEE.AhwBna("0", "1", "2", "3", "4", "5", OrderDetailListItem.SLIP_OUT, "7", "8", "9");

    /* JADX INFO: renamed from: o.xbl$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xbl.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final java.util.Set<java.lang.String> copydefault() {
            return C55005xbl.EZpvd;
        }

        public static /* synthetic */ boolean isLegalSign$default(StateListAnimator stateListAnimator, java.lang.String str, int i, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 4) != 0) {
                z = false;
            }
            return stateListAnimator.KWHzl(str, i, z);
        }

        public final boolean KWHzl(@NotNull java.lang.String str, int i, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return i == 0 && z && Intrinsics.EZpvd((java.lang.Object) "-", (java.lang.Object) str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xbl$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean isLegalString$default(StateListAnimator stateListAnimator, java.lang.String str, java.util.Set set, java.util.Locale locale, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                set = null;
            }
            if ((i & 4) != 0) {
                locale = java.util.Locale.getDefault();
            }
            if ((i & 8) != 0) {
                z = false;
            }
            if ((i & 16) != 0) {
                z2 = false;
            }
            return stateListAnimator.AEQbTJ(str, set, locale, z, z2);
        }

        public final boolean AEQbTJ(java.lang.String str, java.util.Set<java.lang.String> set, @NotNull java.util.Locale locale, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(locale, "");
            if (android.text.TextUtils.isEmpty(str)) {
                return false;
            }
            Intrinsics.copydefault((java.lang.Object) str);
            int length = str.length();
            boolean z3 = true;
            for (int i = 0; i < length; i++) {
                java.lang.String strValueOf = java.lang.String.valueOf(str.charAt(i));
                boolean zKWHzl = KWHzl(strValueOf, i, z2);
                if (!zKWHzl) {
                    zKWHzl = copydefault().contains(strValueOf);
                }
                if (!zKWHzl) {
                    zKWHzl = android.text.TextUtils.equals(C38303pTu.EZpvd(locale), strValueOf);
                }
                if (!zKWHzl) {
                    zKWHzl = z && android.text.TextUtils.equals(C38303pTu.AEQbTJ(locale), strValueOf);
                }
                if (zKWHzl) {
                    z3 = zKWHzl;
                } else {
                    z3 = set != null && set.contains(strValueOf);
                }
                if (!z3) {
                    return false;
                }
            }
            return z3;
        }
    }
}

package o;

import com.okinc.base.thread.TPM;
import com.okinc.components.track.ABTestProvider;
import com.okinc.core.util.SPUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32909mmV {
    public static final C32909mmV KWHzl = new C32909mmV();

    /* JADX INFO: renamed from: o.mmV$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ABTestProvider.values().length];
            try {
                iArr[ABTestProvider.SKYLAB.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ABTestProvider.BYTEDANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public final boolean AEQbTJ() {
        return false;
    }

    private C32909mmV() {
    }

    public final void OLrzqt(@NotNull final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (AEQbTJ() && SPUtils.getBoolean("abtest_value_shown", false)) {
            TPM.AEQbTJ(new java.lang.Runnable() { // from class: o.mmU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C32909mmV.copydefault(str, str2);
                }
            });
        }
    }

    public static final void copydefault(java.lang.String str, java.lang.String str2) {
        android.widget.Toast.makeText(C43246rlf.OLrzqt.valueOf(), "key is : " + str + "\nvalue is : " + str2, 0).show();
    }

    public final InterfaceC32865mle KWHzl(@NotNull ABTestProvider aBTestProvider) {
        Intrinsics.checkNotNullParameter(aBTestProvider, "");
        int i = ActionBar.EZpvd[aBTestProvider.ordinal()];
        if (i == 1) {
            return C32905mmR.EZpvd;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C32902mmO.KWHzl;
    }
}

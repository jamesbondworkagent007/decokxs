package o;

import androidx.lifecycle.LiveData;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceSlippageCache;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25416iwM {
    public final C23314hvr<java.lang.Boolean> AEQbTJ = new C23314hvr<>();
    public AdvanceSlippageCache OLrzqt;

    /* JADX INFO: renamed from: o.iwM$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SlippageMode.values().length];
            try {
                iArr[SlippageMode.Dynamic.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull AdvanceSlippageCache advanceSlippageCache) {
        Intrinsics.checkNotNullParameter(advanceSlippageCache, "");
        this.OLrzqt = advanceSlippageCache;
    }

    @yCM
    public C25416iwM() {
    }

    public final void AhwBna() {
        this.OLrzqt = null;
        this.AEQbTJ.setValue(java.lang.Boolean.TRUE);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.mulS$default(str2, C33129mqd.subS$default(1, C33129mqd.divS$default(str, 100, null, null, null, 14, null), null, null, null, 14, null), null, null, null, 14, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hvq.mulCheckS$default(java.lang.Object, java.lang.Object, java.lang.Integer, java.lang.Boolean, java.math.RoundingMode, int, java.lang.Object):java.lang.String */
    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str.length() <= 0 || str2.length() <= 0) {
            return "--";
        }
        java.lang.String strCopydefault = copydefault(C23313hvq.mulCheckS$default(str, 100, null, null, null, 14, null), str2);
        if (C23313hvq.valueOf(strCopydefault, 0)) {
            return "<" + pTB.formatLocalized$default("0.000001", null, 1, null);
        }
        return C23271hvA.copydefault.EZpvd(strCopydefault, str3);
    }

    public final java.lang.String OLrzqt() {
        AdvanceSlippageCache advanceSlippageCache;
        AdvanceSlippageCache advanceSlippageCache2 = this.OLrzqt;
        SlippageMode slippageModeAEQbTJ = advanceSlippageCache2 != null ? advanceSlippageCache2.AEQbTJ() : null;
        if (slippageModeAEQbTJ == null || Activity.copydefault[slippageModeAEQbTJ.ordinal()] != 1 || (advanceSlippageCache = this.OLrzqt) == null) {
            return null;
        }
        return advanceSlippageCache.KWHzl();
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        AdvanceSlippageCache advanceSlippageCache = this.OLrzqt;
        if ((advanceSlippageCache != null ? advanceSlippageCache.AEQbTJ() : null) != SlippageMode.Fixed) {
            return str;
        }
        AdvanceSlippageCache advanceSlippageCache2 = this.OLrzqt;
        if (advanceSlippageCache2 != null) {
            return advanceSlippageCache2.EZpvd();
        }
        return null;
    }

    public final SlippageMode copydefault() {
        SlippageMode slippageModeAEQbTJ;
        AdvanceSlippageCache advanceSlippageCache = this.OLrzqt;
        return (advanceSlippageCache == null || (slippageModeAEQbTJ = advanceSlippageCache.AEQbTJ()) == null) ? SlippageMode.Dynamic : slippageModeAEQbTJ;
    }

    public final boolean EZpvd() {
        AdvanceSlippageCache advanceSlippageCache = this.OLrzqt;
        return (advanceSlippageCache != null ? advanceSlippageCache.AEQbTJ() : null) == SlippageMode.Fixed;
    }

    public final SlippageFeeType AEQbTJ() {
        AdvanceSlippageCache advanceSlippageCache = this.OLrzqt;
        if (advanceSlippageCache != null) {
            return advanceSlippageCache.copydefault();
        }
        return null;
    }
}

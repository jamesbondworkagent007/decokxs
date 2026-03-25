package o;

import androidx.lifecycle.LiveData;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.advanced.limit.slippage.AdvanceLimitSlippageCache;

/* JADX INFO: renamed from: o.iwL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25415iwL {
    public AdvanceLimitSlippageCache EZpvd;
    public final C23314hvr<java.lang.Boolean> copydefault = new C23314hvr<>();

    /* JADX INFO: renamed from: o.iwL$ActionBar */
    public final /* synthetic */ class ActionBar {
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
    public final LiveData<java.lang.Boolean> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(AdvanceLimitSlippageCache advanceLimitSlippageCache) {
        this.EZpvd = advanceLimitSlippageCache;
    }

    @yCM
    public C25415iwL() {
    }

    public final void OLrzqt() {
        this.EZpvd = null;
        this.copydefault.setValue(java.lang.Boolean.TRUE);
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        AdvanceLimitSlippageCache advanceLimitSlippageCache = this.EZpvd;
        if ((advanceLimitSlippageCache != null ? advanceLimitSlippageCache.copydefault() : null) != SlippageMode.Fixed) {
            return str;
        }
        AdvanceLimitSlippageCache advanceLimitSlippageCache2 = this.EZpvd;
        if (advanceLimitSlippageCache2 != null) {
            return advanceLimitSlippageCache2.OLrzqt();
        }
        return null;
    }

    public final SlippageMode EZpvd() {
        AdvanceLimitSlippageCache advanceLimitSlippageCache = this.EZpvd;
        if (advanceLimitSlippageCache == null) {
            return SlippageMode.Dynamic;
        }
        return advanceLimitSlippageCache.copydefault();
    }

    public final java.lang.String KWHzl() {
        AdvanceLimitSlippageCache advanceLimitSlippageCache = this.EZpvd;
        if (advanceLimitSlippageCache == null) {
            return null;
        }
        if (ActionBar.copydefault[advanceLimitSlippageCache.copydefault().ordinal()] == 1) {
            return advanceLimitSlippageCache.AEQbTJ();
        }
        return null;
    }

    public final SlippageFeeType copydefault() {
        AdvanceLimitSlippageCache advanceLimitSlippageCache = this.EZpvd;
        if (advanceLimitSlippageCache == null) {
            return SlippageFeeType.SlippageLow;
        }
        SlippageFeeType slippageFeeTypeKWHzl = advanceLimitSlippageCache.KWHzl();
        return slippageFeeTypeKWHzl == null ? SlippageFeeType.SlippageLow : slippageFeeTypeKWHzl;
    }
}

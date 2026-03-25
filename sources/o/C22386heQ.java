package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.heQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22386heQ {
    public static final C22386heQ EZpvd = new C22386heQ();

    private C22386heQ() {
    }

    public final boolean EZpvd(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull C9860bdZ c9860bdZ) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(c9860bdZ, "");
        java.lang.String amountNum = dexMultiTokenInfoBean.getAmountNum();
        java.lang.String strAEQbTJ = c9860bdZ.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "0";
        }
        if (!C23313hvq.AhwBna(amountNum, strAEQbTJ)) {
            java.lang.String currencyAmount = dexMultiTokenInfoBean.getCurrencyAmount();
            java.lang.String strEZpvd = c9860bdZ.EZpvd();
            if (!C23313hvq.AhwBna(currencyAmount, strEZpvd != null ? strEZpvd : "0")) {
                return false;
            }
        }
        return true;
    }

    public final void KWHzl(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull C9860bdZ c9860bdZ) {
        java.lang.Double dAuCTel;
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(c9860bdZ, "");
        java.lang.String strAEQbTJ = c9860bdZ.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "0";
        }
        dexMultiTokenInfoBean.setAmountNum(strAEQbTJ);
        java.lang.String strKWHzl = c9860bdZ.KWHzl();
        dexMultiTokenInfoBean.setAmountNumBigDecimal((strKWHzl == null || (dAuCTel = C59443zhD.AuCTel(strKWHzl)) == null) ? 0.0d : dAuCTel.doubleValue());
        if (dexMultiTokenInfoBean.getAmountNumBigDecimal() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            dexMultiTokenInfoBean.setCurrencyAmount("0");
        } else {
            java.lang.String strEZpvd = c9860bdZ.EZpvd();
            if (strEZpvd == null) {
                strEZpvd = "0";
            }
            dexMultiTokenInfoBean.setCurrencyAmount(strEZpvd);
        }
        java.lang.String strKWHzl2 = c9860bdZ.KWHzl();
        dexMultiTokenInfoBean.setAvailableAmountNum(strKWHzl2 != null ? strKWHzl2 : "0");
    }
}

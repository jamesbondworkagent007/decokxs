package o;

import com.okinc.business.defi.biz.net.bean.EosPayInfo;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bwH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10849bwH {
    public final double AEQbTJ;
    public final double AYXKKw;
    public final double EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final C10854bwM copydefault;
    public final EosPayInfo djBIcL;
    public final boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double gEmmrt() {
        return this.AYXKKw;
    }

    public C10849bwH(@NotNull C10854bwM c10854bwM, @NotNull EosPayInfo eosPayInfo) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(eosPayInfo, "");
        this.copydefault = c10854bwM;
        this.djBIcL = eosPayInfo;
        this.AEQbTJ = java.lang.Double.parseDouble(eosPayInfo.getCoinAmount());
        this.AYXKKw = java.lang.Double.parseDouble(eosPayInfo.getFee());
        this.EZpvd = java.lang.Double.parseDouble(eosPayInfo.getBaseCoinAmount());
        this.OLrzqt = eosPayInfo.getCurrencyAmount();
        this.gEmmrt = eosPayInfo.getRecommend();
        this.KWHzl = eosPayInfo.getMessage();
    }

    public final java.lang.String EZpvd() {
        return C54870xYj.EZpvd(this.djBIcL.getCoinAmount(), this.copydefault.valueOf(), this.copydefault.AkhnZx(), this.copydefault.fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public final java.lang.String KWHzl() {
        return C54880xYt.formatValuationFromAsset$default(this.OLrzqt, null, false, 0, false, 15, null);
    }
}

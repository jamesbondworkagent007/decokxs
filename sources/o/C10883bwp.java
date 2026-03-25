package o;

import com.okinc.business.defi.biz.net.bean.EosMarketBean;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.bwp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10883bwp {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final C10854bwM KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final EosMarketBean djBIcL;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    public C10883bwp(@NotNull EosMarketBean eosMarketBean) {
        Intrinsics.checkNotNullParameter(eosMarketBean, "");
        this.djBIcL = eosMarketBean;
        this.valueOf = eosMarketBean.getSumAmount();
        this.AYXKKw = C54862xYb.KWHzl(C33129mqd.OLrzqt((java.lang.Object) eosMarketBean.getSumCurrencyAmount()), 2);
        this.AhwBna = eosMarketBean.getRate();
        this.gEmmrt = eosMarketBean.getWeightAmount();
        this.copydefault = eosMarketBean.getCpuAmount();
        this.AEQbTJ = eosMarketBean.getNetAmount();
        this.OLrzqt = eosMarketBean.getRamAmount();
        this.EZpvd = eosMarketBean.getRamBytes();
        this.KWHzl = C10954byG.EZpvd.valueOf().AhwBna();
    }

    public final java.lang.String AkhnZx() {
        C10854bwM c10854bwMAhwBna = C10954byG.EZpvd.valueOf().AhwBna();
        java.lang.String strFJNWhG = c10854bwMAhwBna != null ? c10854bwMAhwBna.fJNWhG() : null;
        return strFJNWhG == null ? "" : strFJNWhG;
    }

    public final java.lang.String OLrzqt() {
        java.lang.String str = this.copydefault;
        C10854bwM c10854bwM = this.KWHzl;
        int iValueOf = c10854bwM != null ? c10854bwM.valueOf() : 0;
        C10854bwM c10854bwM2 = this.KWHzl;
        return C54870xYj.KWHzl(str, iValueOf, c10854bwM2 != null ? c10854bwM2.fZBcTu() : 0, AkhnZx(), (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public final java.lang.String KWHzl() {
        java.lang.String str = this.AEQbTJ;
        C10854bwM c10854bwM = this.KWHzl;
        int iValueOf = c10854bwM != null ? c10854bwM.valueOf() : 0;
        C10854bwM c10854bwM2 = this.KWHzl;
        return C54870xYj.KWHzl(str, iValueOf, c10854bwM2 != null ? c10854bwM2.fZBcTu() : 0, AkhnZx(), (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
    }

    public final java.lang.String valueOf() {
        return pTB.formatLocalizedWithMinPrecision$default(this.EZpvd, 0, null, 2, null) + " bytes";
    }

    public final java.lang.String djBIcL() {
        java.lang.String str = this.gEmmrt;
        C10854bwM c10854bwM = this.KWHzl;
        int iValueOf = c10854bwM != null ? c10854bwM.valueOf() : 0;
        C10854bwM c10854bwM2 = this.KWHzl;
        return C54870xYj.KWHzl(str, iValueOf, c10854bwM2 != null ? c10854bwM2.fZBcTu() : 0, AkhnZx(), (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
    }
}

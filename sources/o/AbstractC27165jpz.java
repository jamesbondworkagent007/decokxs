package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.logic.ResponseState;
import com.okinc.business.invest_biz.ui.bean.InvestConsumeData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jpz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC27165jpz extends AbstractC33073mpa implements InterfaceC27096joj {
    public boolean dxcTrN;
    public boolean fFgQHt;
    public int fZBcTu;
    public MutableLiveData<InvestGasPriceConfig> RcXXUw = new MutableLiveData<>();
    public MutableLiveData<InvestConsumeData<java.lang.Boolean>> QVAiDq = new MutableLiveData<>();
    public C27164jpy djSkpj = new C27164jpy();
    public final MutableLiveData<C23963iPv> finit = new MutableLiveData<>();
    public MutableLiveData<C23953iPl> RJOkX = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> UeEOUB = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> flVtFt = new MutableLiveData<>();
    public MutableLiveData<ResponseState> aKErDB = new MutableLiveData<>();
    public java.lang.String dvKsVJ = "";
    public boolean dNCPSb = true;

    public abstract void AuCTel();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23953iPl> AwvSrB() {
        return this.RJOkX;
    }

    public abstract long EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dvKsVJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.dNCPSb = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.dxcTrN = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27096joj
    public MutableLiveData<InvestGasPriceConfig> OLrzqt() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23963iPv> ORxRYg() {
        return this.finit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27164jpy OcIXYQ() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ResponseState> QOLQEE() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QUSxYX() {
        return this.dvKsVJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QVAiDq() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int QbewEr() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> QfsBiF() {
        return this.flVtFt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean RJOkX() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27096joj
    public MutableLiveData<InvestConsumeData<java.lang.Boolean>> copydefault() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> gHZMYf() {
        return this.UeEOUB;
    }

    public abstract void getFieldNames();

    public abstract void hDKMBd();

    public abstract void uzCIH();

    public void EZpvd(int i) {
        InvestGasPriceConfig value;
        InvestSlippageConfig investSlippage;
        int i2 = 0;
        this.dxcTrN = false;
        if (i != 2 || (value = OLrzqt().getValue()) == null || (investSlippage = value.getInvestSlippage()) == null) {
            return;
        }
        java.lang.String first = OLrzqt(OLrzqt().getValue()).getFirst();
        if (investSlippage.getType() == 2) {
            if (C33129mqd.AEQbTJ(investSlippage.getAutomaticValue(), investSlippage.getCustomMax())) {
                this.fFgQHt = true;
                this.dxcTrN = true;
                this.fZBcTu = 2;
                return;
            } else if (C33129mqd.OLrzqt(investSlippage.getAutomaticValue(), investSlippage.getCustomMax())) {
                this.fFgQHt = true;
                this.fZBcTu = 2;
                return;
            } else {
                if (C33129mqd.AEQbTJ(first, investSlippage.getCustomSafe())) {
                    this.fFgQHt = true;
                    this.fZBcTu = 1;
                    return;
                }
                return;
            }
        }
        if (!C33129mqd.AEQbTJ(first, investSlippage.getAutomaticValue()) || !C33129mqd.copydefault(first, investSlippage.getCustomSafe()) || !C33129mqd.valueOf(first, investSlippage.getCustomMax())) {
            if (C33129mqd.copydefault(first, investSlippage.getCustomSafe()) && C33129mqd.gEmmrt(first, investSlippage.getAutomaticValue())) {
                this.fFgQHt = true;
            }
            this.fZBcTu = i2;
        }
        this.fFgQHt = true;
        i2 = 1;
        this.fZBcTu = i2;
    }

    public final java.lang.String QKVWgx() {
        java.lang.String first = OLrzqt(OLrzqt().getValue()).getFirst();
        return first.length() > 0 ? C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, first, false, 2, null) : "--";
    }

    public final java.lang.String DTwDnp() {
        java.lang.String strEZpvd = this.djSkpj.EZpvd(java.lang.String.valueOf(EZpvd()));
        InvestGasPriceConfig value = OLrzqt().getValue();
        java.lang.String strCopydefault = value != null ? C27505jwU.copydefault(value, strEZpvd) : null;
        return (strCopydefault == null || strCopydefault.length() == 0) ? "--" : C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, strCopydefault, null, null, null, 14, null);
    }

    @Override // o.InterfaceC27096joj
    public void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djSkpj.AEQbTJ(str, z);
    }

    @Override // o.InterfaceC27096joj
    public void fARcdN() {
        InvestSlippageConfig investSlippage;
        C27164jpy c27164jpy = this.djSkpj;
        long jEZpvd = EZpvd();
        InvestGasPriceConfig value = OLrzqt().getValue();
        c27164jpy.AEQbTJ(java.lang.String.valueOf(jEZpvd), (value == null || (investSlippage = value.getInvestSlippage()) == null) ? null : java.lang.Integer.valueOf(investSlippage.getType()));
    }

    @Override // o.InterfaceC27096joj
    public kotlin.Pair<java.lang.String, java.lang.Boolean> djBIcL() {
        return OLrzqt(OLrzqt().getValue());
    }

    public final kotlin.Pair<java.lang.String, java.lang.Boolean> OLrzqt(InvestGasPriceConfig investGasPriceConfig) {
        InvestSlippageConfig investSlippage;
        InvestSlippageConfig investSlippage2;
        InvestSlippageConfig investSlippage3;
        C27164jpy c27164jpy = this.djSkpj;
        long jEZpvd = EZpvd();
        java.lang.Integer numValueOf = null;
        java.lang.String automaticValue = (investGasPriceConfig == null || (investSlippage3 = investGasPriceConfig.getInvestSlippage()) == null) ? null : investSlippage3.getAutomaticValue();
        java.lang.String customMax = (investGasPriceConfig == null || (investSlippage2 = investGasPriceConfig.getInvestSlippage()) == null) ? null : investSlippage2.getCustomMax();
        if (investGasPriceConfig != null && (investSlippage = investGasPriceConfig.getInvestSlippage()) != null) {
            numValueOf = java.lang.Integer.valueOf(investSlippage.getType());
        }
        return c27164jpy.AEQbTJ(java.lang.String.valueOf(jEZpvd), automaticValue, customMax, numValueOf);
    }

    public final java.lang.String sSMYrx() {
        java.lang.String strEZpvd = this.djSkpj.EZpvd(java.lang.String.valueOf(EZpvd()));
        InvestGasPriceConfig value = OLrzqt().getValue();
        return C33129mqd.gEmmrt(value != null ? C27505jwU.KWHzl(value, strEZpvd) : null);
    }

    public final java.lang.String AxsJAY() {
        java.lang.String strEZpvd = this.djSkpj.EZpvd(java.lang.String.valueOf(EZpvd()));
        InvestGasPriceConfig value = OLrzqt().getValue();
        return C33129mqd.gEmmrt(value != null ? C27505jwU.OLrzqt(value, strEZpvd) : null);
    }
}

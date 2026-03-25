package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CallDataError;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hpY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC22977hpY extends AbstractC33073mpa {
    public final MutableLiveData<java.lang.Boolean> AYXKKw;
    public final MutableLiveData<AbstractC9832bcy> AhwBna;
    public final C23314hvr<java.lang.Throwable> AkhnZx;
    public final MutableLiveData<QuotePriceRes> AuCTel;
    public final java.lang.String DbNXlk;
    public final MutableLiveData<java.lang.Boolean> KWHzl;
    public final InterfaceC56387yDm djBIcL;
    public final MutableLiveData<java.lang.String> ejfBZ;
    public TransactionBean fARcdN;
    public final MutableLiveData<InterfaceC9752bbX> fIwbmz;
    public final C23314hvr<java.lang.Boolean> fJNWhG;
    public final C23314hvr<java.lang.Boolean> fetchVPNInfo;
    public java.lang.Object gEmmrt;
    public final MutableLiveData<java.lang.Boolean> getFieldNames;
    public final C23314hvr<java.lang.Boolean> getNewProxyInstance;
    public final C25412iwI isConnected;
    public final MutableLiveData<java.lang.Boolean> iwGUEr;
    public final MutableLiveData<QuotePriceRes> uzCIH;
    public final MutableLiveData<CallDataError> valueOf;
    public final MutableLiveData<java.lang.Boolean> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AhwBna() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> DbNXlk() {
        return this.AYXKKw;
    }

    public abstract AbstractC22974hpV copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(TransactionBean transactionBean) {
        this.fARcdN = transactionBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23314hvr<java.lang.Boolean> ejfBZ() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23314hvr<java.lang.Throwable> fARcdN() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<InterfaceC9752bbX> fIwbmz() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionBean fJNWhG() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<CallDataError> gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<QuotePriceRes> getFieldNames() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> getNewProxyInstance() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<QuotePriceRes> hDKMBd() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23314hvr<java.lang.Boolean> isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23314hvr<java.lang.Boolean> iwGUEr() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> uzCIH() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<AbstractC9832bcy> valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> values() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> zLjUOn() {
        return this.getFieldNames;
    }

    public AbstractC22977hpY(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk = str;
        this.gEmmrt = new java.lang.Object();
        this.AYXKKw = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
        this.valueOf = new MutableLiveData<>();
        this.getFieldNames = new MutableLiveData<>();
        this.iwGUEr = new MutableLiveData<>();
        this.fIwbmz = new MutableLiveData<>();
        this.ejfBZ = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.AuCTel = new MutableLiveData<>();
        this.uzCIH = new MutableLiveData<>();
        this.fJNWhG = new C23314hvr<>();
        this.fetchVPNInfo = new C23314hvr<>();
        this.getNewProxyInstance = new C23314hvr<>();
        this.AkhnZx = new C23314hvr<>();
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.hpZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC22977hpY.EZpvd(this.AEQbTJ);
            }
        });
        this.isConnected = new C25412iwI();
    }

    public final AbstractC22974hpV AYXKKw() {
        return (AbstractC22974hpV) this.djBIcL.getValue();
    }

    public static final AbstractC22974hpV EZpvd(AbstractC22977hpY abstractC22977hpY) {
        return abstractC22977hpY.copydefault();
    }

    public static /* synthetic */ java.lang.String getWalletAddressByType$default(AbstractC22977hpY abstractC22977hpY, java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWalletAddressByType");
        }
        if ((i & 2) != 0) {
            interfaceC9738bbJ = null;
        }
        return abstractC22977hpY.EZpvd(str, interfaceC9738bbJ);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(str, "");
        C25412iwI c25412iwI = this.isConnected;
        if (interfaceC9738bbJ == null) {
            interfaceC9738bbJ = C22380heK.OLrzqt.copydefault(this.DbNXlk).fARcdN().AEQbTJ();
        }
        TransactionBean transactionBean = this.fARcdN;
        return c25412iwI.EZpvd(interfaceC9738bbJ, str, transactionBean != null ? transactionBean.getWalletAddressType() : null);
    }

    public final void gHZMYf() {
        this.fARcdN = null;
        C33050mpD.OLrzqt(this.gEmmrt);
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        gHZMYf();
    }

    public final TransactionType AuCTel() {
        TransactionType transactionType;
        TransactionBean transactionBean = this.fARcdN;
        return (transactionBean == null || (transactionType = transactionBean.getTransactionType()) == null) ? TransactionType.INQUIRY_TYPE : transactionType;
    }

    public final boolean AubY() {
        QuotePriceRes quotePriceRes;
        CommonDexInfo commonDexInfo;
        DexMultiTokenInfoBean fromToken;
        TransactionBean transactionBean = this.fARcdN;
        if (transactionBean == null || (quotePriceRes = transactionBean.getQuotePriceRes()) == null || (commonDexInfo = quotePriceRes.getCommonDexInfo()) == null || (fromToken = commonDexInfo.getFromToken()) == null) {
            return false;
        }
        return fromToken.getDisplayToken();
    }

    public final boolean zsXlph() {
        QuotePriceRes quotePriceRes;
        CommonDexInfo commonDexInfo;
        DexMultiTokenInfoBean toToken;
        TransactionBean transactionBean = this.fARcdN;
        if (transactionBean == null || (quotePriceRes = transactionBean.getQuotePriceRes()) == null || (commonDexInfo = quotePriceRes.getCommonDexInfo()) == null || (toToken = commonDexInfo.getToToken()) == null) {
            return false;
        }
        return toToken.getDisplayToken();
    }

    public final boolean wlaJM() {
        QuotePriceRes quotePriceResAkhnZx = AkhnZx();
        return quotePriceResAkhnZx != null && quotePriceResAkhnZx.isSingle();
    }

    public final boolean sSMYrx() {
        TransactionBean transactionBean = this.fARcdN;
        if (transactionBean != null) {
            return transactionBean.getSupportMev();
        }
        return false;
    }

    public final QuotePriceRes AkhnZx() {
        return this.AuCTel.getValue();
    }

    public final boolean AuCTelauCTel() {
        return AuCTel() == TransactionType.INQUIRY_TYPE && AkhnZx() != null;
    }
}

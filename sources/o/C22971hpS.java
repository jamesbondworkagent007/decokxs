package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CallDataError;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType;
import com.okinc.wallet.api.WalletDexService;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hpS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22971hpS extends AbstractC33073mpa {
    public TransactionBean AYXKKw;
    public java.lang.String gEmmrt;
    public java.util.List<WalletDexService.SupportedMevNodeBean> valueOf;
    public final MutableStateFlow<java.lang.Boolean> AhwBna = StateFlowKt.MutableStateFlow(null);
    public final MutableLiveData<java.lang.Boolean> AEQbTJ = new MutableLiveData<>();
    public final MutableLiveData<java.lang.String> EZpvd = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> KWHzl = new MutableLiveData<>();
    public final C25412iwI djBIcL = new C25412iwI();
    public final MutableLiveData<Triple<TransactionType, MergeCallData, CallDataError>> copydefault = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> OLrzqt = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(TransactionBean transactionBean) {
        this.AYXKKw = transactionBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> AYXKKw() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<WalletDexService.SupportedMevNodeBean> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<java.lang.Boolean> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.util.List<WalletDexService.SupportedMevNodeBean> list) {
        this.valueOf = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Triple<TransactionType, MergeCallData, CallDataError>> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL() {
        this.AYXKKw = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionBean valueOf() {
        return this.AYXKKw;
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.setValue(str);
    }

    public final void EZpvd(boolean z) {
        this.AEQbTJ.setValue(java.lang.Boolean.valueOf(z));
    }

    public final java.lang.String gEmmrt() {
        QuotePriceRes quotePriceRes;
        DeFiPlatformForSwap selectedDeFiPlatform;
        TransactionBean transactionBean = this.AYXKKw;
        if (((transactionBean == null || (quotePriceRes = transactionBean.getQuotePriceRes()) == null || (selectedDeFiPlatform = quotePriceRes.getSelectedDeFiPlatform()) == null) ? null : selectedDeFiPlatform.getPermit2Data()) != null) {
            return this.gEmmrt;
        }
        return null;
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        djBIcL();
    }

    public static /* synthetic */ java.lang.String getWalletAddressByType$default(C22971hpS c22971hpS, java.lang.String str, java.lang.String str2, InterfaceC9738bbJ interfaceC9738bbJ, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            interfaceC9738bbJ = null;
        }
        return c22971hpS.OLrzqt(str, str2, interfaceC9738bbJ);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C25412iwI c25412iwI = this.djBIcL;
        if (interfaceC9738bbJ == null) {
            interfaceC9738bbJ = C22380heK.OLrzqt.copydefault(str2).fARcdN().AEQbTJ();
        }
        TransactionBean transactionBean = this.AYXKKw;
        return c25412iwI.EZpvd(interfaceC9738bbJ, str, transactionBean != null ? transactionBean.getWalletAddressType() : null);
    }
}

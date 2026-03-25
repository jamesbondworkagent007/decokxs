package com.okinc.okex.center.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okex.center.bean.NetworkChain;
import com.okinc.okex.center.bean.TxnCurrencyBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC45235slv;
import o.C45069sio;
import o.C45072sir;
import o.C45350soD;
import o.C55167xeo;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportTroubleshootViewModel extends AbstractC33073mpa {
    public final MutableLiveData<Integer> AYXKKw;
    public final MutableStateFlow<AbstractC45235slv> AhwBna;
    public final C45350soD DbNXlk;
    public final MutableLiveData<List<TxnCurrencyBean>> EZpvd;
    public final MutableStateFlow<AbstractC45235slv> KWHzl;
    public final MutableLiveData<List<C45072sir>> OLrzqt;
    public final MutableLiveData<Integer> copydefault;
    public final MutableLiveData<Pair<String, String>> djBIcL;
    public List<C45072sir> fetchVPNInfo;
    public final MutableLiveData<String> gEmmrt;
    public final MutableLiveData<Integer> valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Pair<String, String>> DbNXlk() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<List<C45072sir>> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Integer> djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> fetchVPNInfo() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Integer> isConnected() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Integer> values() {
        return this.valueOf;
    }

    @yCM
    public SupportTroubleshootViewModel(@NotNull C45350soD c45350soD) {
        Intrinsics.checkNotNullParameter(c45350soD, "");
        this.DbNXlk = c45350soD;
        this.EZpvd = new MutableLiveData<>();
        this.AhwBna = StateFlowKt.MutableStateFlow(AbstractC45235slv.ActionBar.copydefault);
        this.KWHzl = StateFlowKt.MutableStateFlow(new AbstractC45235slv.Application(null, 1, null));
        this.OLrzqt = new MutableLiveData<>();
        this.fetchVPNInfo = new ArrayList();
        this.valueOf = new MutableLiveData<>();
        this.djBIcL = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.viewmodel.SupportTroubleshootViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final TxnCurrencyBean valueOf() {
        List<TxnCurrencyBean> value = this.EZpvd.getValue();
        Object obj = null;
        if (value == null) {
            return null;
        }
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int id = ((TxnCurrencyBean) next).getId();
            Integer value2 = values().getValue();
            if (value2 != null && id == value2.intValue()) {
                obj = next;
                break;
            }
        }
        return (TxnCurrencyBean) obj;
    }

    public final List<NetworkChain> AhwBna() {
        TxnCurrencyBean txnCurrencyBeanValueOf = valueOf();
        if (txnCurrencyBeanValueOf != null) {
            return txnCurrencyBeanValueOf.getChains();
        }
        return null;
    }

    public final boolean AYXKKw() {
        if (AhwBna() != null) {
            return !r0.isEmpty();
        }
        return false;
    }

    public final StateFlow<AbstractC45235slv> AkhnZx() {
        return FlowKt.asStateFlow(this.AhwBna);
    }

    public final StateFlow<AbstractC45235slv> AEQbTJ() {
        return FlowKt.asStateFlow(this.KWHzl);
    }

    public final boolean ejfBZ() {
        Integer value;
        Integer value2 = isConnected().getValue();
        return value2 != null && value2.intValue() == -2 ? !((value = values().getValue()) != null && value.intValue() == -1) : !(value2 != null && value2.intValue() == -1);
    }

    public final boolean fJNWhG() {
        Integer value = values().getValue();
        return (value == null || value.intValue() == -1) ? false : true;
    }

    public final void OLrzqt() {
        ArrayList arrayList = new ArrayList();
        List<TxnCurrencyBean> value = this.EZpvd.getValue();
        if (value != null) {
            for (TxnCurrencyBean txnCurrencyBean : value) {
                int id = txnCurrencyBean.getId();
                C55167xeo c55167xeo = new C55167xeo(0, txnCurrencyBean.getSymbol(), txnCurrencyBean.getFullName(), null, 0, 16, null);
                int id2 = txnCurrencyBean.getId();
                Integer value2 = values().getValue();
                arrayList.add(new C45072sir(id, c55167xeo, value2 != null && id2 == value2.intValue(), txnCurrencyBean.getIcon(), txnCurrencyBean.getId() != -1));
            }
        }
        this.fetchVPNInfo = arrayList;
        this.OLrzqt.setValue(arrayList);
    }

    public final List<C45069sio> gEmmrt() {
        ArrayList arrayList = new ArrayList();
        List<NetworkChain> listAhwBna = AhwBna();
        if (listAhwBna != null) {
            for (NetworkChain networkChain : listAhwBna) {
                int id = networkChain.getId();
                C55167xeo c55167xeo = new C55167xeo(-1, networkChain.getChainName(), networkChain.getDescription(), null, 0, 16, null);
                int id2 = networkChain.getId();
                Integer value = isConnected().getValue();
                arrayList.add(new C45069sio(id, c55167xeo, value != null && id2 == value.intValue()));
            }
        }
        OLrzqt();
        return arrayList;
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SupportTroubleshootViewModel$fetchData$1(this, null), 3, null);
    }

    public final void EZpvd() {
        this.copydefault.setValue(null);
    }

    public final void OLrzqt(int i) {
        this.valueOf.setValue(Integer.valueOf(i));
        TxnCurrencyBean txnCurrencyBeanValueOf = valueOf();
        if (txnCurrencyBeanValueOf != null) {
            this.djBIcL.setValue(new Pair<>(txnCurrencyBeanValueOf.getSymbol(), txnCurrencyBeanValueOf.getIcon()));
            this.KWHzl.setValue(new AbstractC45235slv.Application(txnCurrencyBeanValueOf));
        }
    }

    public final void EZpvd(int i) {
        NetworkChain networkChain;
        Object next;
        this.AYXKKw.setValue(Integer.valueOf(i));
        List<NetworkChain> listAhwBna = AhwBna();
        if (listAhwBna != null) {
            Iterator<T> it = listAhwBna.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((NetworkChain) next).getId() == i) {
                        break;
                    }
                }
            }
            networkChain = (NetworkChain) next;
        } else {
            networkChain = null;
        }
        MutableLiveData<String> mutableLiveData = this.gEmmrt;
        String chainName = networkChain != null ? networkChain.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        mutableLiveData.setValue(chainName);
        this.KWHzl.setValue(new AbstractC45235slv.Application(networkChain));
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            OLrzqt();
            return;
        }
        OLrzqt();
        MutableLiveData<List<C45072sir>> mutableLiveData = this.OLrzqt;
        List<C45072sir> value = mutableLiveData.getValue();
        mutableLiveData.setValue(value != null ? this.DbNXlk.EZpvd(value, str) : null);
    }

    public final boolean copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.DbNXlk.AEQbTJ(str);
    }

    public final boolean OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.DbNXlk.OLrzqt(this.valueOf.getValue(), this.AYXKKw.getValue(), AhwBna(), str);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SupportTroubleshootViewModel$fetchResult$1(this, str, null), 3, null);
    }
}

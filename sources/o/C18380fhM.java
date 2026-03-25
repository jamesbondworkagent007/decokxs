package o;

import androidx.autofill.HintConstants;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.defi.wallet.imported.SelectNetworkViewModel$createInitialWalletNetworkList$1;
import com.okinc.business.defi.wallet.imported.SelectNetworkViewModel$selectNetworkStateStream$1;
import com.okinc.business.defi.wallet.imported.SelectNetworkViewModel$walletNetworkList$1;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.wallet.api.bean.SupportedNetworkType;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC18379fhL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18380fhM extends ViewModel {
    public final java.lang.String AEQbTJ;
    public final StateFlow<C18377fhJ> AYXKKw;
    public final boolean AhwBna;
    public final C18373fhF EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final C18374fhG copydefault;
    public final java.lang.String djBIcL;
    public final Flow<java.util.List<InterfaceC18379fhL>> fetchVPNInfo;
    public final MutableStateFlow<java.lang.Long> gEmmrt;
    public final java.lang.String valueOf;
    public final java.util.List<SupportedNetworkType> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C18377fhJ> KWHzl() {
        return this.AYXKKw;
    }

    public C18380fhM(@NotNull C18374fhG c18374fhG, @NotNull C18373fhF c18373fhF, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(c18374fhG, "");
        Intrinsics.checkNotNullParameter(c18373fhF, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.copydefault = c18374fhG;
        this.EZpvd = c18373fhF;
        java.lang.String str = (java.lang.String) savedStateHandle.get(Web3SecurityTrackEvent.VALUE_PRIVATE_KEY);
        this.djBIcL = str == null ? "" : str;
        java.lang.String str2 = (java.lang.String) savedStateHandle.get(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
        this.KWHzl = str2 == null ? "" : str2;
        java.lang.Boolean bool = (java.lang.Boolean) savedStateHandle.get("isSmartContract");
        this.AhwBna = bool != null ? bool.booleanValue() : false;
        java.lang.String str3 = (java.lang.String) savedStateHandle.get(MTAnalysisConstants.Account.KEY_ACCOUNT);
        this.AEQbTJ = str3 == null ? "" : str3;
        java.lang.Boolean bool2 = (java.lang.Boolean) savedStateHandle.get("is_near_short_address");
        this.OLrzqt = bool2 != null ? bool2.booleanValue() : false;
        java.lang.String str4 = (java.lang.String) savedStateHandle.get(HintConstants.AUTOFILL_HINT_PASSWORD);
        this.valueOf = str4 != null ? str4 : "";
        java.util.List<SupportedNetworkType> list = (java.util.List) savedStateHandle.get("SUPPORTED_NETWORK_TYPES");
        this.values = list == null ? yDY.AhwBna() : list;
        Flow<java.util.List<InterfaceC18379fhL>> flow = FlowKt.flow(new SelectNetworkViewModel$walletNetworkList$1(this, null));
        this.fetchVPNInfo = flow;
        MutableStateFlow<java.lang.Long> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.gEmmrt = MutableStateFlow;
        this.AYXKKw = FlowKt.stateIn(FlowKt.combine(flow, MutableStateFlow, new SelectNetworkViewModel$selectNetworkStateStream$1(null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, null), new C18377fhJ(yDY.AhwBna(), false));
    }

    public final InterfaceC18392fhY copydefault() {
        java.lang.Object next;
        java.util.Iterator<T> it = this.AYXKKw.getValue().OLrzqt().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC18392fhY) next).OLrzqt()) {
                break;
            }
        }
        return (InterfaceC18392fhY) next;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0193 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super java.util.List<? extends InterfaceC18379fhL>> continuation) throws java.lang.Throwable {
        SelectNetworkViewModel$createInitialWalletNetworkList$1 selectNetworkViewModel$createInitialWalletNetworkList$1;
        C18380fhM c18380fhM;
        java.util.List<InterfaceC18379fhL.Activity> list;
        boolean z;
        if (continuation instanceof SelectNetworkViewModel$createInitialWalletNetworkList$1) {
            selectNetworkViewModel$createInitialWalletNetworkList$1 = (SelectNetworkViewModel$createInitialWalletNetworkList$1) continuation;
            int i = selectNetworkViewModel$createInitialWalletNetworkList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                selectNetworkViewModel$createInitialWalletNetworkList$1.label = i - Integer.MIN_VALUE;
            } else {
                selectNetworkViewModel$createInitialWalletNetworkList$1 = new SelectNetworkViewModel$createInitialWalletNetworkList$1(this, continuation);
            }
        }
        SelectNetworkViewModel$createInitialWalletNetworkList$1 selectNetworkViewModel$createInitialWalletNetworkList$12 = selectNetworkViewModel$createInitialWalletNetworkList$1;
        java.lang.Object objKWHzl = selectNetworkViewModel$createInitialWalletNetworkList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = selectNetworkViewModel$createInitialWalletNetworkList$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            if (this.djBIcL.length() == 0) {
                C18373fhF c18373fhF = this.EZpvd;
                java.lang.String str = this.KWHzl;
                boolean z2 = this.AhwBna;
                java.lang.String str2 = this.AEQbTJ;
                boolean z3 = this.OLrzqt;
                selectNetworkViewModel$createInitialWalletNetworkList$12.L$0 = this;
                selectNetworkViewModel$createInitialWalletNetworkList$12.label = 1;
                objKWHzl = c18373fhF.OLrzqt(str, z2, str2, z3, selectNetworkViewModel$createInitialWalletNetworkList$12);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c18380fhM = this;
                list = (java.util.List) objKWHzl;
            } else {
                C18374fhG c18374fhG = this.copydefault;
                java.lang.String str3 = this.djBIcL;
                java.lang.String str4 = this.valueOf;
                selectNetworkViewModel$createInitialWalletNetworkList$12.L$0 = this;
                selectNetworkViewModel$createInitialWalletNetworkList$12.label = 2;
                objKWHzl = c18374fhG.KWHzl(str3, str4, selectNetworkViewModel$createInitialWalletNetworkList$12);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c18380fhM = this;
                list = (java.util.List) objKWHzl;
            }
        } else if (i2 == 1) {
            c18380fhM = (C18380fhM) selectNetworkViewModel$createInitialWalletNetworkList$12.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            list = (java.util.List) objKWHzl;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c18380fhM = (C18380fhM) selectNetworkViewModel$createInitialWalletNetworkList$12.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            list = (java.util.List) objKWHzl;
        }
        java.util.HashMap map = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (InterfaceC18379fhL.Activity activity : list) {
            if (activity.AEQbTJ().RdAHlO()) {
                if (map.get(C56443yFo.AEQbTJ(activity.AEQbTJ().QOLQEE())) == null) {
                    map.put(C56443yFo.AEQbTJ(activity.AEQbTJ().QOLQEE()), new java.util.ArrayList());
                }
                java.lang.Object obj = map.get(C56443yFo.AEQbTJ(activity.AEQbTJ().QOLQEE()));
                Intrinsics.copydefault(obj);
                ((java.util.List) obj).add(activity);
            } else {
                arrayList.add(activity);
            }
        }
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.util.List<SupportedNetworkType> list2 = c18380fhM.values;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(C56443yFo.KWHzl(((SupportedNetworkType) it.next()).KWHzl()));
        }
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((java.lang.Number) entry.getKey()).intValue();
            java.util.List list3 = (java.util.List) entry.getValue();
            InterfaceC18379fhL.Activity activity2 = (InterfaceC18379fhL.Activity) CollectionsKt___CollectionsKt.firstOrNull(list3);
            if (activity2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list3, 10));
                java.util.Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((InterfaceC18379fhL.Activity) it2.next()).AEQbTJ());
                }
                java.lang.String strEZpvd = activity2.EZpvd();
                if ((list3 instanceof java.util.Collection) && list3.isEmpty()) {
                    z = false;
                    InterfaceC18379fhL.StateListAnimator stateListAnimator = new InterfaceC18379fhL.StateListAnimator(iIntValue, arrayList3, strEZpvd, z);
                    long jOLrzqt = C18388fhU.OLrzqt(arrayList3, iIntValue);
                    if (c18380fhM.djBIcL.length() != 0) {
                    }
                } else {
                    java.util.Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        if (((InterfaceC18379fhL.Activity) it3.next()).copydefault()) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    InterfaceC18379fhL.StateListAnimator stateListAnimator2 = new InterfaceC18379fhL.StateListAnimator(iIntValue, arrayList3, strEZpvd, z);
                    long jOLrzqt2 = C18388fhU.OLrzqt(arrayList3, iIntValue);
                    if (c18380fhM.djBIcL.length() != 0) {
                        C56443yFo.KWHzl(listOLrzqt.add(stateListAnimator2));
                    } else if (arrayList2.isEmpty() || arrayList2.contains(C56443yFo.KWHzl(jOLrzqt2))) {
                        listOLrzqt.add(stateListAnimator2);
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList) {
                if (arrayList2.contains(C56443yFo.KWHzl(((InterfaceC18379fhL.Activity) obj2).AEQbTJ().fetchVPNInfo()))) {
                    arrayList4.add(obj2);
                }
            }
            arrayList = arrayList4;
        }
        listOLrzqt.addAll(arrayList);
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final void copydefault(@NotNull InterfaceC18392fhY interfaceC18392fhY) {
        Intrinsics.checkNotNullParameter(interfaceC18392fhY, "");
        MutableStateFlow<java.lang.Long> mutableStateFlow = this.gEmmrt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), java.lang.Long.valueOf(interfaceC18392fhY.EZpvd().KWHzl()))) {
        }
    }
}

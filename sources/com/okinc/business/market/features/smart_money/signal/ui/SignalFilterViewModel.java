package com.okinc.business.market.features.smart_money.signal.ui;

import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.data.model.smart_money.SignalGemType;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalFilterBottomSheetParams;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter;
import com.okinc.business.market.features.smart_money.signal.ui.SignalFilterViewModel;
import com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsUiSortType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C29464kuD;
import o.C29481kuU;
import o.C29482kuV;
import o.C29601kwi;
import o.C29635kxP;
import o.C56402yEa;
import o.C56403yEb;
import o.InterfaceC28823khz;
import o.yCM;
import o.yDY;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalFilterViewModel extends ViewModel {
    public C29482kuV AEQbTJ;
    public final StateFlow<C29481kuU> EZpvd;
    public boolean KWHzl;
    public final MutableStateFlow<C29481kuU> OLrzqt;
    public final C29464kuD copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29481kuU> gEmmrt() {
        return this.EZpvd;
    }

    @yCM
    public SignalFilterViewModel(@NotNull C29464kuD c29464kuD) {
        Intrinsics.checkNotNullParameter(c29464kuD, "");
        this.copydefault = c29464kuD;
        this.AEQbTJ = new C29482kuV(null, null, null, 7, null);
        MutableStateFlow<C29481kuU> MutableStateFlow = StateFlowKt.MutableStateFlow(new C29481kuU(null, null, null, null, null, null, null, 127, null));
        this.OLrzqt = MutableStateFlow;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void copydefault(C29481kuU c29481kuU) {
        this.OLrzqt.setValue(c29481kuU);
    }

    public final void copydefault(@NotNull List<SignalMultiSelectUiModel> list, @NotNull List<C29635kxP> list2, @NotNull Map<String, ? extends List<SignalMultiSelectUiModel>> map) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (this.KWHzl) {
            return;
        }
        KWHzl(list);
        AEQbTJ(list2);
        OLrzqt(map);
        if (this.EZpvd.getValue().copydefault().AEQbTJ().length() <= 0) {
            List<SignalMultiSelectUiModel> listAEQbTJ = this.AEQbTJ.AEQbTJ();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList.add(((SignalMultiSelectUiModel) it.next()).copydefault());
            }
            OLrzqt(arrayList);
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (((C29635kxP) next).KWHzl()) {
                        break;
                    }
                }
            }
            C29635kxP c29635kxP = (C29635kxP) next;
            if (c29635kxP != null) {
                OLrzqt(c29635kxP);
                List<SignalMultiSelectUiModel> listCopydefault = copydefault(c29635kxP.valueOf());
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                Iterator<T> it3 = listCopydefault.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((SignalMultiSelectUiModel) it3.next()).copydefault());
                }
                copydefault(arrayList2);
            }
        }
        this.KWHzl = true;
    }

    public final void KWHzl(@NotNull List<SignalMultiSelectUiModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = C29482kuV.copy$default(this.AEQbTJ, list, null, null, 6, null);
    }

    public final void AEQbTJ(@NotNull List<C29635kxP> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = C29482kuV.copy$default(this.AEQbTJ, null, list, null, 5, null);
    }

    public final void OLrzqt(@NotNull Map<String, ? extends List<SignalMultiSelectUiModel>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.AEQbTJ = C29482kuV.copy$default(this.AEQbTJ, null, null, map, 3, null);
    }

    public final void OLrzqt(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<SignalMultiSelectUiModel> listAEQbTJ = this.AEQbTJ.AEQbTJ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAEQbTJ) {
            if (list.contains(((SignalMultiSelectUiModel) obj).copydefault())) {
                arrayList.add(obj);
            }
        }
        if (Intrinsics.EZpvd(arrayList, this.EZpvd.getValue().OLrzqt())) {
            return;
        }
        copydefault(C29481kuU.copy$default(this.EZpvd.getValue(), arrayList, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
    }

    public final void OLrzqt(@NotNull C29635kxP c29635kxP) {
        Intrinsics.checkNotNullParameter(c29635kxP, "");
        if (Intrinsics.EZpvd(c29635kxP, this.EZpvd.getValue().copydefault())) {
            return;
        }
        C29481kuU value = this.EZpvd.getValue();
        C29635kxP c29635kxPCopy$default = C29635kxP.copy$default(c29635kxP, null, null, null, null, true, null, 47, null);
        List<SignalMultiSelectUiModel> listCopydefault = copydefault(c29635kxP.valueOf());
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        Iterator<T> it = listCopydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(((SignalMultiSelectUiModel) it.next()).copydefault());
        }
        copydefault(C29481kuU.copy$default(value, null, c29635kxPCopy$default, arrayList, null, null, null, null, 121, null));
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalFilterViewModel$updateSelectedChain$2(this, c29635kxP, null), 3, null);
    }

    public final void copydefault(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (Intrinsics.EZpvd(list, this.EZpvd.getValue().AEQbTJ())) {
            return;
        }
        copydefault(C29481kuU.copy$default(this.EZpvd.getValue(), null, null, list, null, null, null, null, 123, null));
    }

    public final void copydefault(C29601kwi c29601kwi) {
        if (c29601kwi == null) {
            C29481kuU value = this.EZpvd.getValue();
            List supportedProtocolsForSelectedChain$default = getSupportedProtocolsForSelectedChain$default(this, null, 1, null);
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(supportedProtocolsForSelectedChain$default, 10));
            Iterator it = supportedProtocolsForSelectedChain$default.iterator();
            while (it.hasNext()) {
                arrayList.add(((SignalMultiSelectUiModel) it.next()).copydefault());
            }
            copydefault(C29481kuU.copy$default(value, null, null, arrayList, new SignalMetricsFilter(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null), new SignalsFilter(null, null, null, null, 15, null), null, null, 99, null));
            return;
        }
        C29481kuU value2 = this.EZpvd.getValue();
        List<InterfaceC28823khz.ActionBar> listOLrzqt = c29601kwi.OLrzqt();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listOLrzqt) {
            if (((InterfaceC28823khz.ActionBar) obj).EZpvd()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((InterfaceC28823khz.ActionBar) it2.next()).OLrzqt());
        }
        copydefault(C29481kuU.copy$default(value2, null, null, arrayList3, c29601kwi.EZpvd(), c29601kwi.AEQbTJ(), null, null, 99, null));
    }

    public final boolean AhwBna() {
        List supportedProtocolsForSelectedChain$default = getSupportedProtocolsForSelectedChain$default(this, null, 1, null);
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(supportedProtocolsForSelectedChain$default, 10));
        Iterator it = supportedProtocolsForSelectedChain$default.iterator();
        while (it.hasNext()) {
            arrayList.add(((SignalMultiSelectUiModel) it.next()).copydefault());
        }
        C29481kuU c29481kuU = new C29481kuU(null, null, arrayList, null, null, null, null, 123, null);
        C29481kuU value = this.EZpvd.getValue();
        return Intrinsics.EZpvd(value.AEQbTJ(), c29481kuU.AEQbTJ()) && Intrinsics.EZpvd(value.KWHzl(), c29481kuU.KWHzl()) && Intrinsics.EZpvd(value.AhwBna(), c29481kuU.AhwBna());
    }

    public final SignalFilterBottomSheetParams AEQbTJ() {
        List<SignalMultiSelectUiModel> supportedProtocolsForSelectedChain$default = getSupportedProtocolsForSelectedChain$default(this, null, 1, null);
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(supportedProtocolsForSelectedChain$default, 10));
        for (SignalMultiSelectUiModel signalMultiSelectUiModel : supportedProtocolsForSelectedChain$default) {
            arrayList.add(SignalMultiSelectUiModel.copy$default(signalMultiSelectUiModel, null, null, null, null, this.EZpvd.getValue().AEQbTJ().contains(signalMultiSelectUiModel.copydefault()), null, 47, null));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((SignalMultiSelectUiModel) obj).copydefault())) {
                arrayList2.add(obj);
            }
        }
        return new SignalFilterBottomSheetParams(arrayList2, this.EZpvd.getValue().KWHzl(), this.EZpvd.getValue().AhwBna());
    }

    public final List<SignalMultiSelectUiModel> copydefault() {
        boolean z;
        List<SignalMultiSelectUiModel> listAEQbTJ = this.AEQbTJ.AEQbTJ();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        for (SignalMultiSelectUiModel signalMultiSelectUiModel : listAEQbTJ) {
            List<SignalMultiSelectUiModel> listOLrzqt = this.EZpvd.getValue().OLrzqt();
            if ((listOLrzqt instanceof Collection) && listOLrzqt.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = listOLrzqt.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((Object) ((SignalMultiSelectUiModel) it.next()).copydefault(), (Object) signalMultiSelectUiModel.copydefault())) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            arrayList.add(SignalMultiSelectUiModel.copy$default(signalMultiSelectUiModel, null, null, null, null, z, null, 47, null));
        }
        return arrayList;
    }

    public final List<C29635kxP> OLrzqt() {
        List<C29635kxP> listKWHzl = this.AEQbTJ.KWHzl();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (C29635kxP c29635kxP : listKWHzl) {
            arrayList.add(C29635kxP.copy$default(c29635kxP, null, null, null, null, Intrinsics.EZpvd((Object) c29635kxP.valueOf(), (Object) this.EZpvd.getValue().copydefault().valueOf()), null, 47, null));
        }
        return arrayList;
    }

    public static /* synthetic */ List getSupportedProtocolsForSelectedChain$default(SignalFilterViewModel signalFilterViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return signalFilterViewModel.copydefault(str);
    }

    public final List<SignalMultiSelectUiModel> copydefault(String str) {
        if (str == null) {
            str = this.EZpvd.getValue().copydefault().valueOf();
        }
        return this.AEQbTJ.copydefault().getOrDefault(str, yDY.AhwBna());
    }

    public final List<String> KWHzl() {
        return C56402yEa.EZpvd(this.EZpvd.getValue().copydefault().valueOf());
    }

    public final String EZpvd() {
        List supportedProtocolsForSelectedChain$default = getSupportedProtocolsForSelectedChain$default(this, null, 1, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : supportedProtocolsForSelectedChain$default) {
            if (this.EZpvd.getValue().AEQbTJ().contains(((SignalMultiSelectUiModel) obj).copydefault())) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: o.kuT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return SignalFilterViewModel.KWHzl((SignalMultiSelectUiModel) obj2);
            }
        }, 30, null);
    }

    public static final CharSequence KWHzl(SignalMultiSelectUiModel signalMultiSelectUiModel) {
        Intrinsics.checkNotNullParameter(signalMultiSelectUiModel, "");
        return signalMultiSelectUiModel.KWHzl();
    }

    public final void OLrzqt(@NotNull SignalGemType signalGemType) {
        Intrinsics.checkNotNullParameter(signalGemType, "");
        if (signalGemType == this.EZpvd.getValue().EZpvd()) {
            return;
        }
        copydefault(C29481kuU.copy$default(this.EZpvd.getValue(), null, null, null, null, null, signalGemType, null, 95, null));
    }

    public final void EZpvd(@NotNull SignalGemsUiSortType signalGemsUiSortType) {
        Intrinsics.checkNotNullParameter(signalGemsUiSortType, "");
        if (signalGemsUiSortType == this.EZpvd.getValue().valueOf()) {
            return;
        }
        copydefault(C29481kuU.copy$default(this.EZpvd.getValue(), null, null, null, null, null, null, signalGemsUiSortType, 63, null));
    }

    public final boolean OLrzqt(C29481kuU c29481kuU) {
        if (c29481kuU == null) {
            return true;
        }
        C29481kuU value = this.EZpvd.getValue();
        return (c29481kuU.EZpvd() == value.EZpvd() && Intrinsics.EZpvd(c29481kuU.copydefault(), value.copydefault()) && c29481kuU.valueOf() == value.valueOf()) ? false : true;
    }

    public final boolean KWHzl(C29481kuU c29481kuU) {
        if (c29481kuU == null) {
            return true;
        }
        C29481kuU value = this.EZpvd.getValue();
        return (Intrinsics.EZpvd(c29481kuU.OLrzqt(), value.OLrzqt()) && Intrinsics.EZpvd(c29481kuU.copydefault(), value.copydefault()) && Intrinsics.EZpvd(c29481kuU.AEQbTJ(), value.AEQbTJ()) && Intrinsics.EZpvd(c29481kuU.KWHzl(), value.KWHzl()) && Intrinsics.EZpvd(c29481kuU.AhwBna(), value.AhwBna())) ? false : true;
    }
}

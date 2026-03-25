package com.okinc.business.defi.wallet.mine.addressbook.detail;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C56403yEb;
import o.yCM;
import o.yDY;
import o.yEJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressBookNetworkSelectionViewModel extends ViewModel {
    public final StateFlow<Boolean> AEQbTJ;
    public final StateFlow<Boolean> AYXKKw;
    public final Set<Long> AhwBna;
    public final List<AddressChainUiData> DbNXlk;
    public final Set<Long> EZpvd;
    public final Set<Long> KWHzl;
    public final MutableStateFlow<Set<Long>> OLrzqt;
    public final StateFlow<Boolean> copydefault;
    public final StateFlow<Boolean> djBIcL;
    public final Set<Long> gEmmrt;
    public final StateFlow<Boolean> isConnected;
    public final Set<Long> valueOf;
    public final StateFlow<Set<Long>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Set<Long>> AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressChainUiData> djBIcL() {
        return this.DbNXlk;
    }

    @yCM
    public AddressBookNetworkSelectionViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        List<AddressChainUiData> listAhwBna = (List) savedStateHandle.get("chain_ui_data");
        listAhwBna = listAhwBna == null ? yDY.AhwBna() : listAhwBna;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        for (AddressChainUiData addressChainUiData : listAhwBna) {
            arrayList.add(addressChainUiData.EZpvd((255 & 1) != 0 ? addressChainUiData.AEQbTJ : null, (255 & 2) != 0 ? addressChainUiData.EZpvd : 0L, (255 & 4) != 0 ? addressChainUiData.KWHzl : null, (255 & 8) != 0 ? addressChainUiData.gEmmrt : false, (255 & 16) != 0 ? addressChainUiData.AYXKKw : false, (255 & 32) != 0 ? addressChainUiData.OLrzqt : false, (255 & 64) != 0 ? addressChainUiData.copydefault : false, (255 & 128) != 0 ? addressChainUiData.AhwBna : false));
        }
        this.DbNXlk = arrayList;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((AddressChainUiData) it.next()).OLrzqt()));
        }
        this.valueOf = CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
        List<AddressChainUiData> list = this.DbNXlk;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (((AddressChainUiData) obj).valueOf()) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Long.valueOf(((AddressChainUiData) it2.next()).OLrzqt()));
        }
        this.gEmmrt = CollectionsKt___CollectionsKt.OqFWZa(arrayList4);
        List<AddressChainUiData> list2 = this.DbNXlk;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : list2) {
            if (((AddressChainUiData) obj2).AYXKKw()) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList(C56403yEb.AYXKKw(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(Long.valueOf(((AddressChainUiData) it3.next()).OLrzqt()));
        }
        this.AhwBna = CollectionsKt___CollectionsKt.OqFWZa(arrayList6);
        List<AddressChainUiData> list3 = this.DbNXlk;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj3 : list3) {
            if (((AddressChainUiData) obj3).AEQbTJ()) {
                arrayList7.add(obj3);
            }
        }
        ArrayList arrayList8 = new ArrayList(C56403yEb.AYXKKw(arrayList7, 10));
        Iterator it4 = arrayList7.iterator();
        while (it4.hasNext()) {
            arrayList8.add(Long.valueOf(((AddressChainUiData) it4.next()).OLrzqt()));
        }
        this.KWHzl = CollectionsKt___CollectionsKt.OqFWZa(arrayList8);
        List<AddressChainUiData> list4 = this.DbNXlk;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj4 : list4) {
            if (((AddressChainUiData) obj4).KWHzl()) {
                arrayList9.add(obj4);
            }
        }
        ArrayList arrayList10 = new ArrayList(C56403yEb.AYXKKw(arrayList9, 10));
        Iterator it5 = arrayList9.iterator();
        while (it5.hasNext()) {
            arrayList10.add(Long.valueOf(((AddressChainUiData) it5.next()).OLrzqt()));
        }
        this.EZpvd = CollectionsKt___CollectionsKt.OqFWZa(arrayList10);
        MutableStateFlow<Set<Long>> MutableStateFlow = StateFlowKt.MutableStateFlow(new LinkedHashSet());
        this.OLrzqt = MutableStateFlow;
        this.values = FlowKt.asStateFlow(MutableStateFlow);
        Flow flowMapLatest = FlowKt.mapLatest(MutableStateFlow, new AddressBookNetworkSelectionViewModel$allNetworksSelected$1(this, null));
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharingStarted eagerly = companion.getEagerly();
        Boolean bool = Boolean.FALSE;
        this.djBIcL = FlowKt.stateIn(flowMapLatest, viewModelScope, eagerly, bool);
        this.AYXKKw = FlowKt.stateIn(FlowKt.mapLatest(MutableStateFlow, new AddressBookNetworkSelectionViewModel$allEvmNetworksSelected$1(this, null)), ViewModelKt.getViewModelScope(this), companion.getEagerly(), bool);
        this.isConnected = FlowKt.stateIn(FlowKt.mapLatest(MutableStateFlow, new AddressBookNetworkSelectionViewModel$allSvmNetworksSelected$1(this, null)), ViewModelKt.getViewModelScope(this), companion.getEagerly(), bool);
        this.copydefault = FlowKt.stateIn(FlowKt.mapLatest(MutableStateFlow, new AddressBookNetworkSelectionViewModel$allAptosNetworksSelected$1(this, null)), ViewModelKt.getViewModelScope(this), companion.getEagerly(), bool);
        this.AEQbTJ = FlowKt.stateIn(FlowKt.mapLatest(MutableStateFlow, new AddressBookNetworkSelectionViewModel$allBTCNetworksSelected$1(this, null)), ViewModelKt.getViewModelScope(this), companion.getEagerly(), bool);
        List<AddressChainUiData> list5 = this.DbNXlk;
        ArrayList arrayList11 = new ArrayList();
        for (Object obj5 : list5) {
            if (((AddressChainUiData) obj5).AhwBna()) {
                arrayList11.add(obj5);
            }
        }
        ArrayList arrayList12 = new ArrayList(C56403yEb.AYXKKw(arrayList11, 10));
        Iterator it6 = arrayList11.iterator();
        while (it6.hasNext()) {
            arrayList12.add(Long.valueOf(((AddressChainUiData) it6.next()).OLrzqt()));
        }
        KWHzl(CollectionsKt___CollectionsKt.OqFWZa(arrayList12));
    }

    public final boolean gEmmrt() {
        return !this.gEmmrt.isEmpty();
    }

    public final boolean fetchVPNInfo() {
        return !this.AhwBna.isEmpty();
    }

    public final boolean valueOf() {
        return !this.KWHzl.isEmpty();
    }

    public final boolean AhwBna() {
        return !this.EZpvd.isEmpty();
    }

    public final void KWHzl(Set<Long> set) {
        Set<Long> value;
        MutableStateFlow<Set<Long>> mutableStateFlow = this.OLrzqt;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, yEJ.KWHzl(value, set)));
    }

    public final void EZpvd(long j, boolean z) {
        Set<Long> value;
        Set<Long> value2;
        if (z) {
            MutableStateFlow<Set<Long>> mutableStateFlow = this.OLrzqt;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, yEJ.OLrzqt(value2, Long.valueOf(j))));
        } else {
            MutableStateFlow<Set<Long>> mutableStateFlow2 = this.OLrzqt;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, yEJ.EZpvd((Set<? extends Long>) ((Set<? extends Object>) value), Long.valueOf(j))));
        }
    }

    public final void KWHzl(boolean z) {
        Set<Long> value;
        Set<Long> value2;
        if (z) {
            MutableStateFlow<Set<Long>> mutableStateFlow = this.OLrzqt;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, yEJ.KWHzl(value2, this.valueOf)));
        } else {
            MutableStateFlow<Set<Long>> mutableStateFlow2 = this.OLrzqt;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, yEJ.EZpvd((Set) value, (Iterable) this.valueOf)));
        }
    }

    public final void EZpvd(boolean z) {
        Set<Long> value;
        Set<Long> value2;
        if (z) {
            MutableStateFlow<Set<Long>> mutableStateFlow = this.OLrzqt;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, yEJ.KWHzl(value2, this.gEmmrt)));
        } else {
            MutableStateFlow<Set<Long>> mutableStateFlow2 = this.OLrzqt;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, yEJ.EZpvd((Set) value, (Iterable) this.gEmmrt)));
        }
    }

    public final void OLrzqt(boolean z) {
        Set<Long> value;
        Set<Long> value2;
        if (z) {
            MutableStateFlow<Set<Long>> mutableStateFlow = this.OLrzqt;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, yEJ.KWHzl(value2, this.AhwBna)));
        } else {
            MutableStateFlow<Set<Long>> mutableStateFlow2 = this.OLrzqt;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, yEJ.EZpvd((Set) value, (Iterable) this.AhwBna)));
        }
    }

    public final void AEQbTJ(boolean z) {
        Set<Long> value;
        Set<Long> value2;
        if (z) {
            MutableStateFlow<Set<Long>> mutableStateFlow = this.OLrzqt;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, yEJ.KWHzl(value2, this.KWHzl)));
        } else {
            MutableStateFlow<Set<Long>> mutableStateFlow2 = this.OLrzqt;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, yEJ.EZpvd((Set) value, (Iterable) this.KWHzl)));
        }
    }

    public final void copydefault(boolean z) {
        Set<Long> value;
        Set<Long> value2;
        if (z) {
            MutableStateFlow<Set<Long>> mutableStateFlow = this.OLrzqt;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value2, yEJ.KWHzl(value2, this.EZpvd)));
        } else {
            MutableStateFlow<Set<Long>> mutableStateFlow2 = this.OLrzqt;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, yEJ.EZpvd((Set) value, (Iterable) this.EZpvd)));
        }
    }
}

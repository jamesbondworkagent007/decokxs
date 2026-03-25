package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.data.model.alert.AlertDataUiItem;
import com.okinc.business.market.data.model.alert.AlertGroupUiItem;
import com.okinc.business.market.data.model.alert.AlertUiItem;
import com.okinc.business.market.features.alert.list.ui.Web3AlertListViewModel$deleteSelectedAlerts$1;
import com.okinc.business.market.features.alert.list.ui.Web3AlertListViewModel$fetchAlertList$2;
import com.okinc.business.market.features.alert.list.ui.Web3AlertListViewModel$fetchTokenAlertList$2;
import com.okinc.business.market.features.alert.list.ui.Web3AlertListViewModel$onEnableDisableAlertClickListener$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC25830jHy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jHx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25829jHx extends ViewModel {
    public java.lang.String AEQbTJ;
    public final C25802jGx EZpvd;
    public final MutableStateFlow<InterfaceC25830jHy> KWHzl;
    public java.lang.String OLrzqt;
    public final StateFlow<InterfaceC25830jHy> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC25830jHy> AEQbTJ() {
        return this.copydefault;
    }

    public C25829jHx(@NotNull C25802jGx c25802jGx) {
        Intrinsics.checkNotNullParameter(c25802jGx, "");
        this.EZpvd = c25802jGx;
        MutableStateFlow<InterfaceC25830jHy> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC25830jHy.StateListAnimator.OLrzqt);
        this.KWHzl = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        this.AEQbTJ = "";
        this.OLrzqt = "";
    }

    public final void EZpvd() {
        if (this.KWHzl.getValue() instanceof InterfaceC25830jHy.ActionBar) {
            InterfaceC25830jHy value = this.KWHzl.getValue();
            Intrinsics.copydefault(value, "");
            InterfaceC25830jHy.ActionBar actionBar = (InterfaceC25830jHy.ActionBar) value;
            MutableStateFlow<InterfaceC25830jHy> mutableStateFlow = this.KWHzl;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new InterfaceC25830jHy.ActionBar.FragmentManager(C25813jHh.copydefault(actionBar.EZpvd()), true))) {
            }
            return;
        }
        C43296rmc.KWHzl("Web3AlertListViewModel", "Cannot manage alert list, current state is not success");
    }

    public final void KWHzl() {
        if (this.KWHzl.getValue() instanceof InterfaceC25830jHy.ActionBar) {
            InterfaceC25830jHy value = this.KWHzl.getValue();
            Intrinsics.copydefault(value, "");
            InterfaceC25830jHy.ActionBar actionBar = (InterfaceC25830jHy.ActionBar) value;
            MutableStateFlow<InterfaceC25830jHy> mutableStateFlow = this.KWHzl;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new InterfaceC25830jHy.ActionBar.LoaderManager(C25813jHh.OLrzqt(actionBar.EZpvd()), false))) {
            }
            return;
        }
        C43296rmc.KWHzl("Web3AlertListViewModel", "Cannot mark done managing alert list, current state is not success");
    }

    public final void EZpvd(@NotNull AlertGroupUiItem alertGroupUiItem) {
        Intrinsics.checkNotNullParameter(alertGroupUiItem, "");
        if (this.KWHzl.getValue() instanceof InterfaceC25830jHy.ActionBar) {
            InterfaceC25830jHy value = this.KWHzl.getValue();
            Intrinsics.copydefault(value, "");
            InterfaceC25830jHy.ActionBar actionBar = (InterfaceC25830jHy.ActionBar) value;
            if (alertGroupUiItem.AhwBna()) {
                MutableStateFlow<InterfaceC25830jHy> mutableStateFlow = this.KWHzl;
                while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new InterfaceC25830jHy.ActionBar.PendingIntent(C25813jHh.KWHzl(actionBar.EZpvd()), actionBar.AEQbTJ()))) {
                }
                return;
            } else {
                MutableStateFlow<InterfaceC25830jHy> mutableStateFlow2 = this.KWHzl;
                while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), new InterfaceC25830jHy.ActionBar.VoiceInteractor(C25813jHh.EZpvd((java.util.List<? extends AlertUiItem>) actionBar.EZpvd(), alertGroupUiItem), actionBar.AEQbTJ()))) {
                }
                return;
            }
        }
        C43296rmc.KWHzl("Web3AlertListViewModel", "Cannot " + (alertGroupUiItem.AhwBna() ? "collapse" : "expand") + " alert list, current state is not success");
    }

    public final void OLrzqt(@NotNull AlertDataUiItem alertDataUiItem) {
        Intrinsics.checkNotNullParameter(alertDataUiItem, "");
        if (this.KWHzl.getValue() instanceof InterfaceC25830jHy.ActionBar) {
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new Web3AlertListViewModel$onEnableDisableAlertClickListener$1(this, alertDataUiItem, null), 3, null);
        } else {
            C43296rmc.KWHzl("Web3AlertListViewModel", "Cannot enable/disable alert from alert list, current state is not success");
        }
    }

    public final void EZpvd(@NotNull AlertUiItem alertUiItem) {
        Intrinsics.checkNotNullParameter(alertUiItem, "");
        if (this.KWHzl.getValue() instanceof InterfaceC25830jHy.ActionBar) {
            InterfaceC25830jHy value = this.KWHzl.getValue();
            Intrinsics.copydefault(value, "");
            InterfaceC25830jHy.ActionBar actionBar = (InterfaceC25830jHy.ActionBar) value;
            MutableStateFlow<InterfaceC25830jHy> mutableStateFlow = this.KWHzl;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new InterfaceC25830jHy.ActionBar.TaskStackBuilder(C25813jHh.EZpvd(actionBar.EZpvd(), alertUiItem), actionBar.AEQbTJ()))) {
            }
            return;
        }
        C43296rmc.KWHzl("Web3AlertListViewModel", "Cannot select item from alert list, current state is not success");
    }

    public final void KWHzl(boolean z) {
        if (this.KWHzl.getValue() instanceof InterfaceC25830jHy.ActionBar) {
            InterfaceC25830jHy value = this.KWHzl.getValue();
            Intrinsics.copydefault(value, "");
            InterfaceC25830jHy.ActionBar actionBar = (InterfaceC25830jHy.ActionBar) value;
            MutableStateFlow<InterfaceC25830jHy> mutableStateFlow = this.KWHzl;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new InterfaceC25830jHy.ActionBar.TaskStackBuilder(C25813jHh.EZpvd(actionBar.EZpvd(), z), actionBar.AEQbTJ()))) {
            }
            return;
        }
        C43296rmc.KWHzl("Web3AlertListViewModel", "Cannot select all in alert list, current state is not success");
    }

    public final void copydefault(@NotNull java.util.List<AlertDataUiItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new Web3AlertListViewModel$deleteSelectedAlerts$1(this, list, null), 3, null);
    }

    public final void AEQbTJ(@NotNull AlertDataUiItem alertDataUiItem) {
        Intrinsics.checkNotNullParameter(alertDataUiItem, "");
        if (this.KWHzl.getValue() instanceof InterfaceC25830jHy.ActionBar) {
            InterfaceC25830jHy value = this.KWHzl.getValue();
            Intrinsics.copydefault(value, "");
            InterfaceC25830jHy.ActionBar actionBar = (InterfaceC25830jHy.ActionBar) value;
            if (C25813jHh.KWHzl(actionBar.EZpvd(), C56402yEa.EZpvd(alertDataUiItem.OLrzqt())).isEmpty()) {
                MutableStateFlow<InterfaceC25830jHy> mutableStateFlow = this.KWHzl;
                while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new InterfaceC25830jHy.Application(true, false, 2, null))) {
                }
                return;
            } else {
                MutableStateFlow<InterfaceC25830jHy> mutableStateFlow2 = this.KWHzl;
                while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), new InterfaceC25830jHy.ActionBar.TaskDescription(C25813jHh.OLrzqt(C25813jHh.KWHzl(actionBar.EZpvd(), C56402yEa.EZpvd(alertDataUiItem.OLrzqt()))), false))) {
                }
                return;
            }
        }
        C43296rmc.KWHzl("Web3AlertListViewModel", "Cannot delete alert from alert list, current state is not success");
    }

    public final kotlin.Pair<java.util.List<AlertDataUiItem>, java.lang.Boolean> copydefault() {
        int size;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.KWHzl.getValue() instanceof InterfaceC25830jHy.ActionBar) {
            InterfaceC25830jHy value = this.KWHzl.getValue();
            Intrinsics.copydefault(value, "");
            java.util.List<AlertUiItem> listEZpvd = ((InterfaceC25830jHy.ActionBar) value).EZpvd();
            java.util.ArrayList<AlertGroupUiItem> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : listEZpvd) {
                if (obj instanceof AlertGroupUiItem) {
                    arrayList2.add(obj);
                }
            }
            size = 0;
            for (AlertGroupUiItem alertGroupUiItem : arrayList2) {
                size += alertGroupUiItem.EZpvd().size();
                java.util.List<AlertDataUiItem> listEZpvd2 = alertGroupUiItem.EZpvd();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : listEZpvd2) {
                    if (((AlertDataUiItem) obj2).fetchVPNInfo()) {
                        arrayList3.add(obj2);
                    }
                }
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList.add((AlertDataUiItem) it.next());
                }
            }
        } else {
            C43296rmc.KWHzl("Web3AlertListViewModel", "Cannot get selected alerts, current state is not success");
            size = 0;
        }
        return new kotlin.Pair<>(arrayList, java.lang.Boolean.valueOf(size == arrayList.size()));
    }

    public final void KWHzl(@NotNull AlertGroupUiItem alertGroupUiItem) {
        java.util.List<AlertUiItem> listAhwBna;
        Intrinsics.checkNotNullParameter(alertGroupUiItem, "");
        if ((this.KWHzl.getValue() instanceof InterfaceC25830jHy.ActionBar) || (this.KWHzl.getValue() instanceof InterfaceC25830jHy.Application)) {
            InterfaceC25830jHy value = this.KWHzl.getValue();
            InterfaceC25830jHy.ActionBar actionBar = value instanceof InterfaceC25830jHy.ActionBar ? (InterfaceC25830jHy.ActionBar) value : null;
            if (actionBar == null || (listAhwBna = actionBar.EZpvd()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            MutableStateFlow<InterfaceC25830jHy> mutableStateFlow = this.KWHzl;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new InterfaceC25830jHy.ActionBar.Activity(C25813jHh.EZpvd(listAhwBna, alertGroupUiItem, this.AEQbTJ, this.OLrzqt), false))) {
            }
            return;
        }
        C43296rmc.KWHzl("Web3AlertListViewModel", "Cannot get selected alerts, current state is not success");
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        MutableStateFlow<InterfaceC25830jHy> mutableStateFlow = this.KWHzl;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), InterfaceC25830jHy.StateListAnimator.OLrzqt)) {
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new Web3AlertListViewModel$fetchAlertList$2(this, str, str2, null), 3, null);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        MutableStateFlow<InterfaceC25830jHy> mutableStateFlow = this.KWHzl;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), InterfaceC25830jHy.StateListAnimator.OLrzqt)) {
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new Web3AlertListViewModel$fetchTokenAlertList$2(this, str, str2, null), 3, null);
    }

    public final void OLrzqt() {
        InterfaceC25830jHy value;
        InterfaceC25830jHy value2;
        MutableStateFlow<InterfaceC25830jHy> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
            value2 = this.KWHzl.getValue();
            if ((value2 instanceof InterfaceC25830jHy.ActionBar.TaskDescription) || (value2 instanceof InterfaceC25830jHy.ActionBar.Application) || (value2 instanceof InterfaceC25830jHy.ActionBar.C0856ActionBar) || (value2 instanceof InterfaceC25830jHy.ActionBar.StateListAnimator)) {
                InterfaceC25830jHy.ActionBar actionBar = (InterfaceC25830jHy.ActionBar) value2;
                value2 = new InterfaceC25830jHy.ActionBar.AssistContent(actionBar.EZpvd(), actionBar.AEQbTJ());
            } else if (value2 instanceof InterfaceC25830jHy.Application) {
                value2 = new InterfaceC25830jHy.Application(false, false, 3, null);
            }
        } while (!mutableStateFlow.compareAndSet(value, value2));
    }
}

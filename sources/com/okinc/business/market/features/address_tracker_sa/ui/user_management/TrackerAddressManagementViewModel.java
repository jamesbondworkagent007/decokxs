package com.okinc.business.market.features.address_tracker_sa.ui.user_management;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.data.constant.AddressTrackerSortType;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerAddressGroupUIModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC25769jFr;
import o.AbstractC25772jFu;
import o.C25389ivm;
import o.C25640jAx;
import o.C25642jAz;
import o.C25648jBe;
import o.C25749jEy;
import o.C27634jyr;
import o.C28586kda;
import o.C28603kdr;
import o.jAB;
import o.jAD;
import o.jAG;
import o.jAH;
import o.jEP;
import o.kKG;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerAddressManagementViewModel extends AbstractC25769jFr {
    public boolean AkhnZx;
    public final kKG AuCTel;
    public final jAB DbNXlk;
    public AddressTrackerSortType ejfBZ;
    public final StateFlow<AbstractC25772jFu> fARcdN;
    public boolean fJNWhG;
    public final jAG fetchVPNInfo;
    public final jAH isConnected;
    public final MutableStateFlow<AbstractC25772jFu> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC25772jFu> AYXKKw() {
        return this.fARcdN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public TrackerAddressManagementViewModel(@NotNull C25749jEy c25749jEy, @NotNull C25640jAx c25640jAx, @NotNull C25648jBe c25648jBe, @NotNull jAG jag, @NotNull jAB jab, @NotNull jAD jad, @NotNull C28586kda c28586kda, @NotNull kKG kkg, @NotNull C28603kdr c28603kdr, @NotNull C27634jyr c27634jyr, @NotNull jAH jah) {
        super(c25640jAx, c25648jBe, jad, c28586kda, c28603kdr, c25749jEy, c27634jyr);
        Intrinsics.checkNotNullParameter(c25749jEy, "");
        Intrinsics.checkNotNullParameter(c25640jAx, "");
        Intrinsics.checkNotNullParameter(c25648jBe, "");
        Intrinsics.checkNotNullParameter(jag, "");
        Intrinsics.checkNotNullParameter(jab, "");
        Intrinsics.checkNotNullParameter(jad, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(c27634jyr, "");
        Intrinsics.checkNotNullParameter(jah, "");
        this.fetchVPNInfo = jag;
        this.DbNXlk = jab;
        this.AuCTel = kkg;
        this.isConnected = jah;
        MutableStateFlow<AbstractC25772jFu> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC25772jFu.StateListAnimator.KWHzl);
        this.values = MutableStateFlow;
        this.fARcdN = FlowKt.asStateFlow(MutableStateFlow);
        this.ejfBZ = AddressTrackerSortType.TrackedTime;
        this.AkhnZx = true;
    }

    @Override // o.AbstractC25769jFr
    public void KWHzl(boolean z) {
        copydefault(this.ejfBZ, this.fJNWhG, z);
    }

    public static /* synthetic */ void loadAddresses$default(TrackerAddressManagementViewModel trackerAddressManagementViewModel, AddressTrackerSortType addressTrackerSortType, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            addressTrackerSortType = trackerAddressManagementViewModel.ejfBZ;
        }
        if ((i & 2) != 0) {
            z = trackerAddressManagementViewModel.fJNWhG;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        trackerAddressManagementViewModel.copydefault(addressTrackerSortType, z, z2);
    }

    public final void copydefault(@NotNull AddressTrackerSortType addressTrackerSortType, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(addressTrackerSortType, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerAddressManagementViewModel$loadAddresses$1(z2, this, addressTrackerSortType, z, null), 3, null);
    }

    public final void EZpvd(int i) {
        super.AEQbTJ(i);
    }

    @Override // o.AbstractC25769jFr
    public void valueOf() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerAddressManagementViewModel$loadGroup$1(this, null), 3, null);
    }

    @Override // o.AbstractC25769jFr
    public void KWHzl(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        MutableStateFlow<AbstractC25772jFu> mutableStateFlow = this.values;
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        mutableStateFlow.setValue(new AbstractC25772jFu.Application(message));
    }

    public final void gEmmrt() {
        List<jEP> listEZpvd;
        AbstractC25772jFu value = this.fARcdN.getValue();
        AbstractC25772jFu.Activity activity = value instanceof AbstractC25772jFu.Activity ? (AbstractC25772jFu.Activity) value : null;
        if (activity == null || (listEZpvd = activity.EZpvd()) == null) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerAddressManagementViewModel$enableNotifications$1(this, listEZpvd, null), 3, null);
    }

    public final void djBIcL() {
        List<jEP> listEZpvd;
        AbstractC25772jFu value = this.fARcdN.getValue();
        AbstractC25772jFu.Activity activity = value instanceof AbstractC25772jFu.Activity ? (AbstractC25772jFu.Activity) value : null;
        if (activity == null || (listEZpvd = activity.EZpvd()) == null) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerAddressManagementViewModel$closeBanner$1(this, listEZpvd, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.business.market.features.address_tracker_sa.ui.user_management.TrackerAddressManagementViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void followAddress$default(TrackerAddressManagementViewModel trackerAddressManagementViewModel, int i, List list, Function0 function0, Function0 function02, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function0 = null;
        }
        if ((i2 & 8) != 0) {
            function02 = null;
        }
        trackerAddressManagementViewModel.AEQbTJ(i, list, function0, function02);
    }

    public final void AEQbTJ(int i, @NotNull List<C25642jAz> list, Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(list, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerAddressManagementViewModel$followAddress$1(this, i, list, function02, function0, null), 3, null);
    }

    @Override // o.AbstractC25769jFr
    public void AEQbTJ(@NotNull List<TrackerAddressGroupUIModel> list) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((TrackerAddressGroupUIModel) next).EZpvd() == EZpvd()) {
                    break;
                }
            }
        }
        TrackerAddressGroupUIModel trackerAddressGroupUIModel = (TrackerAddressGroupUIModel) next;
        if (trackerAddressGroupUIModel != null) {
            trackerAddressGroupUIModel.OLrzqt(true);
        }
    }
}

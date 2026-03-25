package com.okinc.im.imui.group.giftcontact;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C35551nxW;
import o.C44157sFk;
import o.oDO;
import o.oDX;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class GiftContactSelectionViewModel extends ViewModel {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final MutableStateFlow<List<GroupMemberInfo>> AEQbTJ;
    public final SavedStateHandle AYXKKw;
    public final StateFlow<Boolean> AhwBna;
    public final MutableStateFlow<Boolean> EZpvd;
    public final oDO KWHzl;
    public final MutableStateFlow<String> copydefault;
    public final StateFlow<String> djBIcL;
    public final oDX gEmmrt;
    public final Flow<List<GroupMemberInfo>> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<List<GroupMemberInfo>> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> OLrzqt() {
        return this.AhwBna;
    }

    @yCM
    public GiftContactSelectionViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull oDX odx, @NotNull oDO odo) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(odx, "");
        Intrinsics.checkNotNullParameter(odo, "");
        this.AYXKKw = savedStateHandle;
        this.gEmmrt = odx;
        this.KWHzl = odo;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<GroupMemberInfo>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow2;
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow3;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow3);
        this.valueOf = FlowKt.combine(MutableStateFlow2, MutableStateFlow3, new GiftContactSelectionViewModel$uiState$1(null));
    }

    public final String EZpvd() {
        String str = (String) this.AYXKKw.get("groupID");
        return str == null ? "" : str;
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GiftContactSelectionViewModel$init$1(this, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.setValue(str);
    }

    public final List<GroupMemberInfo> copydefault(List<GroupMemberInfo> list) {
        C35551nxW c35551nxW = C35551nxW.copydefault;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.EZpvd((Object) ((GroupMemberInfo) obj).getMemberId(), (Object) C44157sFk.KWHzl())) {
                arrayList.add(obj);
            }
        }
        return c35551nxW.OLrzqt(c35551nxW.KWHzl(arrayList));
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.giftcontact.GiftContactSelectionViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}

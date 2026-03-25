package com.okinc.im.imui.group.create.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class InvitePermissionsViewModel extends ViewModel {
    public final MutableStateFlow<CreateGroupViewModel.InvitePermissions> EZpvd;
    public final StateFlow<Boolean> KWHzl;
    public final MutableStateFlow<CreateGroupViewModel.InvitePermissions> OLrzqt;
    public final StateFlow<CreateGroupViewModel.InvitePermissions> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<CreateGroupViewModel.InvitePermissions> copydefault() {
        return this.copydefault;
    }

    @yCM
    public InvitePermissionsViewModel() {
        boolean z = false;
        MutableStateFlow<CreateGroupViewModel.InvitePermissions> MutableStateFlow = StateFlowKt.MutableStateFlow(new CreateGroupViewModel.InvitePermissions(false, false, z, 7, null));
        this.OLrzqt = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<CreateGroupViewModel.InvitePermissions> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new CreateGroupViewModel.InvitePermissions(z, false, false, 7, null));
        this.EZpvd = MutableStateFlow2;
        this.KWHzl = FlowKt.stateIn(FlowKt.combine(MutableStateFlow, MutableStateFlow2, new InvitePermissionsViewModel$hasChanges$1(null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, null), Boolean.FALSE);
    }

    public final void OLrzqt(@NotNull CreateGroupViewModel.InvitePermissions invitePermissions) {
        Intrinsics.checkNotNullParameter(invitePermissions, "");
        this.OLrzqt.setValue(invitePermissions);
        this.EZpvd.setValue(invitePermissions);
    }

    public final void OLrzqt() {
        this.OLrzqt.setValue(CreateGroupViewModel.InvitePermissions.copy$default(this.OLrzqt.getValue(), !r1.copydefault(), false, !r1.copydefault(), 2, null));
    }

    public final void AEQbTJ() {
        this.OLrzqt.setValue(CreateGroupViewModel.InvitePermissions.copy$default(this.OLrzqt.getValue(), false, !r1.OLrzqt(), false, 5, null));
    }

    public final void valueOf() {
        this.OLrzqt.setValue(CreateGroupViewModel.InvitePermissions.copy$default(this.OLrzqt.getValue(), false, false, !r1.AEQbTJ(), 3, null));
    }

    public final CreateGroupViewModel.InvitePermissions EZpvd() {
        CreateGroupViewModel.InvitePermissions value = this.OLrzqt.getValue();
        return new CreateGroupViewModel.InvitePermissions(value.copydefault(), value.OLrzqt(), value.AEQbTJ());
    }

    public final void KWHzl() {
        this.EZpvd.setValue(this.OLrzqt.getValue());
    }
}

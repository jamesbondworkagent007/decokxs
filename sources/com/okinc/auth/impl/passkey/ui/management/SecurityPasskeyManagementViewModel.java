package com.okinc.auth.impl.passkey.ui.management;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.passkey.PasskeyManagementRequest;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C5982aGj;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityPasskeyManagementViewModel extends AbstractC33073mpa {
    public final PasskeyManagementRequest AEQbTJ;
    public final SharedFlow<Boolean> AYXKKw;
    public final LiveData<Boolean> AhwBna;
    public final String EZpvd;
    public final MutableSharedFlow<Boolean> KWHzl;
    public final MutableLiveData<Unit> OLrzqt;
    public final MutableLiveData<Boolean> copydefault;
    public final LiveData<Unit> gEmmrt;
    public final C5982aGj valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyManagementRequest AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Unit> KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> copydefault() {
        return this.AYXKKw;
    }

    @yCM
    public SecurityPasskeyManagementViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C5982aGj c5982aGj) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c5982aGj, "");
        this.valueOf = c5982aGj;
        this.EZpvd = "SecurityPasskeyManagementViewModel";
        this.AEQbTJ = (PasskeyManagementRequest) savedStateHandle.get("KEY_REQUEST");
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.copydefault = mutableLiveData;
        this.AhwBna = mutableLiveData;
        MutableLiveData<Unit> mutableLiveData2 = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData2;
        this.gEmmrt = mutableLiveData2;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final Job EZpvd() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityPasskeyManagementViewModel$initTabAndViewPager$1(this, null), 3, null);
    }

    public final void AhwBna() {
        pUU.KWHzl(this.EZpvd, "finishIfPossible: has okx pay passkey: " + this.copydefault.getValue());
        if (Intrinsics.EZpvd(this.copydefault.getValue(), Boolean.FALSE)) {
            this.OLrzqt.setValue(Unit.INSTANCE);
        }
    }
}

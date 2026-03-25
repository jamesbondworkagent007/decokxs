package com.okinc.auth.impl.passkey.ui.resetremove.selection;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.impl.passkey.model.AuthenticatorSelectModel;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.BatchResetRemovePasskeyViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C56403yEb;
import o.C5973aGa;
import o.InterfaceC8196ayF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class BatchResetRemovePasskeyViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<Boolean> AEQbTJ;
    public final SharedFlow<Boolean> AYXKKw;
    public final LiveData<Boolean> AhwBna;
    public final MutableSharedFlow<String> EZpvd;
    public final InterfaceC8196ayF KWHzl;
    public final MutableLiveData<List<AuthenticatorSelectModel>> OLrzqt;
    public final LiveData<List<AuthenticatorSelectModel>> copydefault;
    public final SharedFlow<String> djBIcL;
    public final C5973aGa gEmmrt;
    public final LiveData<List<AuthenticatorSelectModel>> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<AuthenticatorSelectModel>> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<AuthenticatorSelectModel>> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> copydefault() {
        return this.AhwBna;
    }

    @yCM
    public BatchResetRemovePasskeyViewModel(@NotNull C5973aGa c5973aGa, @NotNull InterfaceC8196ayF interfaceC8196ayF) {
        Intrinsics.checkNotNullParameter(c5973aGa, "");
        Intrinsics.checkNotNullParameter(interfaceC8196ayF, "");
        this.gEmmrt = c5973aGa;
        this.KWHzl = interfaceC8196ayF;
        MutableLiveData<List<AuthenticatorSelectModel>> mutableLiveData = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData;
        this.copydefault = mutableLiveData;
        LiveData<List<AuthenticatorSelectModel>> map = Transformations.map(mutableLiveData, new Function1() { // from class: o.aPJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BatchResetRemovePasskeyViewModel.copydefault((java.util.List) obj);
            }
        });
        this.valueOf = map;
        this.AhwBna = Transformations.map(map, new Function1() { // from class: o.aPK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(BatchResetRemovePasskeyViewModel.KWHzl((java.util.List) obj));
            }
        });
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default2;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    public static final boolean KWHzl(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return !list.isEmpty();
    }

    public final void djBIcL() {
        FlowKt.launchIn(FlowKt.m7441catch(FlowKt.onCompletion(FlowKt.onEach(FlowKt.onStart(this.gEmmrt.OLrzqt(), new BatchResetRemovePasskeyViewModel$refreshAuthenticatorList$1(this, null)), new BatchResetRemovePasskeyViewModel$refreshAuthenticatorList$2(this, null)), new BatchResetRemovePasskeyViewModel$refreshAuthenticatorList$3(this, null)), new BatchResetRemovePasskeyViewModel$refreshAuthenticatorList$4(this, null)), ViewModelKt.getViewModelScope(this));
    }

    public final void AEQbTJ(@NotNull AuthenticatorSelectModel authenticatorSelectModel) {
        Intrinsics.checkNotNullParameter(authenticatorSelectModel, "");
        MutableLiveData<List<AuthenticatorSelectModel>> mutableLiveData = this.OLrzqt;
        List<AuthenticatorSelectModel> value = mutableLiveData.getValue();
        ArrayList arrayList = null;
        if (value != null) {
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(value, 10));
            for (AuthenticatorSelectModel authenticatorSelectModelCopy$default : value) {
                if (Intrinsics.EZpvd(authenticatorSelectModelCopy$default, authenticatorSelectModel)) {
                    authenticatorSelectModelCopy$default = AuthenticatorSelectModel.copy$default(authenticatorSelectModelCopy$default, !authenticatorSelectModelCopy$default.EZpvd(), null, 2, null);
                }
                arrayList2.add(authenticatorSelectModelCopy$default);
            }
            arrayList = arrayList2;
        }
        mutableLiveData.setValue(arrayList);
    }

    public final Object EZpvd(@NotNull Continuation<? super Boolean> continuation) {
        return this.KWHzl.copydefault(PasskeyScenario.Account.AEQbTJ, true, continuation);
    }

    public static final List copydefault(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AuthenticatorSelectModel) obj).EZpvd()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}

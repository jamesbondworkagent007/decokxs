package com.okinc.auth.impl.passkey.ui.rename;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C32942mnB;
import o.C32989mnw;
import o.C5973aGa;
import o.C5987aGo;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2RenameViewModel extends AbstractC33073mpa {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final MutableSharedFlow<String> AEQbTJ;
    public final MutableLiveData<Boolean> AYXKKw;
    public final SharedFlow<Boolean> AhwBna;
    public final C5973aGa AkhnZx;
    public final SharedFlow<String> DbNXlk;
    public final MutableLiveData<String> KWHzl;
    public final MutableSharedFlow<C32989mnw<Unit>> OLrzqt;
    public final MutableSharedFlow<Boolean> copydefault;
    public final SharedFlow<C32989mnw<Unit>> djBIcL;
    public final SavedStateHandle fetchVPNInfo;
    public final AuthenticatorDisplayModel gEmmrt;
    public final C5987aGo valueOf;
    public final MutableLiveData<String> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<String> KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C32989mnw<Unit>> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> copydefault() {
        return this.AhwBna;
    }

    @yCM
    public SecurityFido2RenameViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C5973aGa c5973aGa, @NotNull C5987aGo c5987aGo) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c5973aGa, "");
        Intrinsics.checkNotNullParameter(c5987aGo, "");
        this.fetchVPNInfo = savedStateHandle;
        this.AkhnZx = c5973aGa;
        this.valueOf = c5987aGo;
        this.gEmmrt = (AuthenticatorDisplayModel) savedStateHandle.get("KEY_AUTHENTICATOR_MODEL");
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default2;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<C32989mnw<Unit>> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default3;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>("");
        this.KWHzl = mutableLiveData;
        this.values = C32942mnB.OLrzqt(mutableLiveData, new Function1() { // from class: o.aOq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2RenameViewModel.AEQbTJ((java.lang.String) obj);
            }
        });
        this.AYXKKw = C32942mnB.OLrzqt(mutableLiveData, new Function1() { // from class: o.aOr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityFido2RenameViewModel.EZpvd((java.lang.String) obj);
            }
        });
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.rename.SecurityFido2RenameViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final String AEQbTJ(String str) {
        return (str != null ? str.length() : 0) + "/40";
    }

    public static final Boolean EZpvd(String str) {
        return Boolean.valueOf(!(str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)));
    }

    public final Job OLrzqt(boolean z) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityFido2RenameViewModel$clickConfirm$1(z, this, null), 3, null);
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.setValue(str);
    }

    public final Job gEmmrt() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityFido2RenameViewModel$renameSuccessHandling$1(this, null), 3, null);
    }
}

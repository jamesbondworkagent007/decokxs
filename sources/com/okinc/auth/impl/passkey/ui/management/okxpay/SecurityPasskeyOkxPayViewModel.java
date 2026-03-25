package com.okinc.auth.impl.passkey.ui.management.okxpay;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import com.okinc.auth.impl.passkey.model.ButtonType;
import com.okinc.auth.impl.passkey.model.GetAuthenticationTypeResponse;
import com.okinc.auth.impl.passkey.model.UnlockTokenResponse;
import com.okinc.auth.impl.passkey.ui.management.okxpay.SecurityPasskeyOkxPayViewModel;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C33129mqd;
import o.C5980aGh;
import o.C5982aGj;
import o.C5985aGm;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityPasskeyOkxPayViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<Boolean> AEQbTJ;
    public final MutableSharedFlow<String> AYXKKw;
    public final MutableLiveData<UnlockTokenResponse> AhwBna;
    public final C5980aGh AkhnZx;
    public final LiveData<Boolean> DbNXlk;
    public final MutableLiveData<List<AuthenticatorDisplayModel>> EZpvd;
    public final MutableSharedFlow<GetAuthenticationTypeResponse> KWHzl;
    public final MutableLiveData<Boolean> OLrzqt;
    public final MutableLiveData<AuthenticatorDisplayModel> copydefault;
    public final MutableSharedFlow<Integer> djBIcL;
    public final MutableSharedFlow<String> ejfBZ;
    public final SharedFlow<GetAuthenticationTypeResponse> fARcdN;
    public final MutableSharedFlow<Integer> fJNWhG;
    public final C5982aGj fetchVPNInfo;
    public final SharedFlow<Boolean> gEmmrt;
    public final C5985aGm isConnected;
    public final LiveData<List<AuthenticatorDisplayModel>> valueOf;
    public final LiveData<Boolean> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> AEQbTJ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<String> AhwBna() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Boolean> EZpvd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<List<AuthenticatorDisplayModel>> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<Integer> djBIcL() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<GetAuthenticationTypeResponse> gEmmrt() {
        return this.fARcdN;
    }

    @yCM
    public SecurityPasskeyOkxPayViewModel(@NotNull C5982aGj c5982aGj, @NotNull C5980aGh c5980aGh, @NotNull C5985aGm c5985aGm) {
        Intrinsics.checkNotNullParameter(c5982aGj, "");
        Intrinsics.checkNotNullParameter(c5980aGh, "");
        Intrinsics.checkNotNullParameter(c5985aGm, "");
        this.fetchVPNInfo = c5982aGj;
        this.AkhnZx = c5980aGh;
        this.isConnected = c5985aGm;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default2;
        this.ejfBZ = mutableSharedFlowMutableSharedFlow$default2;
        MutableSharedFlow<Integer> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default3;
        this.fJNWhG = mutableSharedFlowMutableSharedFlow$default3;
        MutableSharedFlow<GetAuthenticationTypeResponse> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default4;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableLiveData<List<AuthenticatorDisplayModel>> mutableLiveData = new MutableLiveData<>();
        this.EZpvd = mutableLiveData;
        this.valueOf = mutableLiveData;
        this.OLrzqt = new MutableLiveData<>();
        this.values = Transformations.map(mutableLiveData, new Function1() { // from class: o.aLc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SecurityPasskeyOkxPayViewModel.AEQbTJ((java.util.List) obj));
            }
        });
        this.DbNXlk = Transformations.map(mutableLiveData, new Function1() { // from class: o.aLb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(SecurityPasskeyOkxPayViewModel.KWHzl((java.util.List) obj));
            }
        });
        this.AhwBna = new MutableLiveData<>(null);
        this.copydefault = new MutableLiveData<>(null);
    }

    public static final boolean AEQbTJ(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.isEmpty();
    }

    public static final boolean KWHzl(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.size() == 1;
    }

    public final void valueOf() {
        AkhnZx();
    }

    public final Job AkhnZx() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityPasskeyOkxPayViewModel$refreshAuthenticatorList$1(this, null), 3, null);
    }

    public final void AEQbTJ(@NotNull AuthenticatorDisplayModel authenticatorDisplayModel) {
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        copydefault(authenticatorDisplayModel);
        UnlockTokenResponse value = this.AhwBna.getValue();
        String token = value != null ? value.getToken() : null;
        String str = token != null ? token : "";
        if (str.length() == 0) {
            AYXKKw();
        } else {
            copydefault(authenticatorDisplayModel, str);
        }
    }

    public final Job copydefault(AuthenticatorDisplayModel authenticatorDisplayModel, String str) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityPasskeyOkxPayViewModel$unlinkAction$1(this, authenticatorDisplayModel, str, null), 3, null);
    }

    public final Job AYXKKw() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityPasskeyOkxPayViewModel$invalidUnlockTokenHandling$1(this, null), 3, null);
    }

    public final void EZpvd(UnlockTokenResponse unlockTokenResponse) {
        copydefault(unlockTokenResponse);
        String token = unlockTokenResponse != null ? unlockTokenResponse.getToken() : null;
        if (token == null) {
            token = "";
        }
        AuthenticatorDisplayModel value = this.copydefault.getValue();
        if (!C33129mqd.OLrzqt((CharSequence) token) || value == null) {
            return;
        }
        copydefault(value, token);
    }

    public final void copydefault(UnlockTokenResponse unlockTokenResponse) {
        this.AhwBna.setValue(unlockTokenResponse);
    }

    public final void copydefault(AuthenticatorDisplayModel authenticatorDisplayModel) {
        this.copydefault.setValue(authenticatorDisplayModel);
    }

    public final ButtonType KWHzl() {
        Boolean value = this.OLrzqt.getValue();
        return (value == null || value.booleanValue()) ? ButtonType.REMOVE_RENAME : ButtonType.RENAME;
    }
}

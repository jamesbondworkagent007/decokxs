package com.okinc.auth.impl.passkey.ui.register.okxpay;

import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.okinc.auth.api.passkey.PasskeyState;
import com.okinc.auth.impl.passkey.model.GetAuthenticationTypeResponse;
import com.okinc.auth.impl.passkey.model.UnlockTokenResponse;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC32955mnO;
import o.AbstractC33073mpa;
import o.AbstractC5991aGs;
import o.C5765aCe;
import o.C5895aFB;
import o.C5896aFC;
import o.C5898aFE;
import o.C5901aFH;
import o.InterfaceC8196ayF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityRegisterOkxPayPasskeyServiceViewModel extends AbstractC33073mpa {
    public final MutableSharedFlow<PasskeyState> AEQbTJ;
    public final C5896aFC AYXKKw;
    public final C5898aFE AhwBna;
    public final C5895aFB AkhnZx;
    public final C5901aFH DbNXlk;
    public final MutableSharedFlow<Boolean> EZpvd;
    public final MutableSharedFlow<String> KWHzl;
    public final MutableSharedFlow<AbstractC5991aGs> OLrzqt;
    public final MutableSharedFlow<AbstractC32955mnO<GetAuthenticationTypeResponse>> copydefault;
    public final SharedFlow<Boolean> djBIcL;
    public final SharedFlow<AbstractC5991aGs> ejfBZ;
    public final SharedFlow<String> fetchVPNInfo;
    public final SharedFlow<PasskeyState> gEmmrt;
    public final SharedFlow<AbstractC32955mnO<GetAuthenticationTypeResponse>> isConnected;
    public final C5765aCe valueOf;
    public final InterfaceC8196ayF values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC5991aGs> AEQbTJ() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> EZpvd() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<PasskeyState> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC32955mnO<GetAuthenticationTypeResponse>> copydefault() {
        return this.isConnected;
    }

    @yCM
    public SecurityRegisterOkxPayPasskeyServiceViewModel(@NotNull InterfaceC8196ayF interfaceC8196ayF, @NotNull C5898aFE c5898aFE, @NotNull C5895aFB c5895aFB, @NotNull C5896aFC c5896aFC, @NotNull C5765aCe c5765aCe, @NotNull C5901aFH c5901aFH) {
        Intrinsics.checkNotNullParameter(interfaceC8196ayF, "");
        Intrinsics.checkNotNullParameter(c5898aFE, "");
        Intrinsics.checkNotNullParameter(c5895aFB, "");
        Intrinsics.checkNotNullParameter(c5896aFC, "");
        Intrinsics.checkNotNullParameter(c5765aCe, "");
        Intrinsics.checkNotNullParameter(c5901aFH, "");
        this.values = interfaceC8196ayF;
        this.AhwBna = c5898aFE;
        this.AkhnZx = c5895aFB;
        this.AYXKKw = c5896aFC;
        this.valueOf = c5765aCe;
        this.DbNXlk = c5901aFH;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<AbstractC32955mnO<GetAuthenticationTypeResponse>> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default2;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<AbstractC5991aGs> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default3;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<PasskeyState> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default4;
        this.gEmmrt = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default5;
        this.fetchVPNInfo = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
    }

    public final Job AhwBna() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityRegisterOkxPayPasskeyServiceViewModel$start$1(this, null), 3, null);
    }

    public final Object EZpvd(@NotNull Continuation<? super PasskeyState> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SecurityRegisterOkxPayPasskeyServiceViewModel$checkPasskey$2(this, null), continuation);
    }

    public final Job valueOf() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityRegisterOkxPayPasskeyServiceViewModel$initiateToCheckNextStep$1(this, null), 3, null);
    }

    public final Job gEmmrt() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityRegisterOkxPayPasskeyServiceViewModel$start2fa$1(this, null), 3, null);
    }

    public final Job OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityRegisterOkxPayPasskeyServiceViewModel$getUnlockTokenFromMfaSessionId$1(this, str, null), 3, null);
    }

    public final Job copydefault(UnlockTokenResponse unlockTokenResponse) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityRegisterOkxPayPasskeyServiceViewModel$post2fa$1(unlockTokenResponse, this, null), 3, null);
    }

    public final Job KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityRegisterOkxPayPasskeyServiceViewModel$register$1(this, str, null), 3, null);
    }

    public final Job EZpvd(@NotNull PublicKeyCredential publicKeyCredential) {
        Intrinsics.checkNotNullParameter(publicKeyCredential, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityRegisterOkxPayPasskeyServiceViewModel$postRegister$1(this, publicKeyCredential, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job OLrzqt(Object obj) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SecurityRegisterOkxPayPasskeyServiceViewModel$handleRegistrationValidation$1(obj, this, null), 3, null);
    }
}

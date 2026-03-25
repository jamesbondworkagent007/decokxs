package com.okinc.auth.impl.passkey.ui.register;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import com.okinc.auth.api.passkey.PasskeyPromotionSource;
import com.okinc.auth.api.passkey.PasskeyScenario;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.InterfaceC8108awX;
import o.InterfaceC8196ayF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyPromotionServiceActivityViewModel extends AbstractC33073mpa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final MutableSharedFlow<Unit> AEQbTJ;
    public final MutableSharedFlow<Unit> AYXKKw;
    public final MutableSharedFlow<Unit> AhwBna;
    public final boolean AkhnZx;
    public final SharedFlow<Unit> AuCTel;
    public final boolean AuCTelauCTel;
    public final PasskeyScenario AubY;
    public final InterfaceC8196ayF DbNXlk;
    public final MutableSharedFlow<Unit> EZpvd;
    public final MutableSharedFlow<Unit> KWHzl;
    public final MutableSharedFlow<Unit> OLrzqt;
    public final MutableSharedFlow<Unit> djBIcL;
    public final SharedFlow<Unit> ejfBZ;
    public final PasskeyPromotionAuthenticator fARcdN;
    public final boolean fIwbmz;
    public final String fJNWhG;
    public final SharedFlow<Unit> fetchVPNInfo;
    public final MutableSharedFlow<Boolean> gEmmrt;
    public final SharedFlow<Unit> gHZMYf;
    public final SharedFlow<Unit> getFieldNames;
    public final SavedStateHandle getNewProxyInstance;
    public final SharedFlow<Unit> hDKMBd;
    public final MutableSharedFlow<Unit> isConnected;
    public final SharedFlow<Boolean> iwGUEr;
    public final SharedFlow<Unit> uzCIH;
    public final MutableSharedFlow<Unit> valueOf;
    public final InterfaceC8108awX values;
    public final SharedFlow<Unit> wlaJM;
    public final SharedFlow<Unit> zLjUOn;
    public final PasskeyPromotionSource zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AhwBna() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AkhnZx() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyScenario AuCTel() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> KWHzl() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> djBIcL() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyPromotionSource ejfBZ() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> fARcdN() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> fJNWhG() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> fetchVPNInfo() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyPromotionAuthenticator gEmmrt() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> getNewProxyInstance() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> isConnected() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> values() {
        return this.getFieldNames;
    }

    @yCM
    public PasskeyPromotionServiceActivityViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC8196ayF interfaceC8196ayF, @NotNull InterfaceC8108awX interfaceC8108awX) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(interfaceC8196ayF, "");
        Intrinsics.checkNotNullParameter(interfaceC8108awX, "");
        this.getNewProxyInstance = savedStateHandle;
        this.DbNXlk = interfaceC8196ayF;
        this.values = interfaceC8108awX;
        PasskeyScenario passkeyScenario = (PasskeyScenario) savedStateHandle.get("KEY_SCENARIO");
        this.AubY = passkeyScenario == null ? PasskeyScenario.Account.AEQbTJ : passkeyScenario;
        PasskeyPromotionSource passkeyPromotionSource = (PasskeyPromotionSource) savedStateHandle.get("KEY_SOURCE");
        this.zsXlph = passkeyPromotionSource == null ? PasskeyPromotionSource.SECURITY_CENTER : passkeyPromotionSource;
        Boolean bool = (Boolean) savedStateHandle.get("KEY_SKIP_CHECK_PASSKEY");
        this.AuCTelauCTel = bool != null ? bool.booleanValue() : false;
        String str = (String) savedStateHandle.get("KEY_EASY_REG_TOKEN");
        this.fJNWhG = str != null ? str : "";
        PasskeyPromotionAuthenticator passkeyPromotionAuthenticator = (PasskeyPromotionAuthenticator) savedStateHandle.get("KEY_PROMOTION_AUTHENTICATOR");
        this.fARcdN = passkeyPromotionAuthenticator == null ? PasskeyPromotionAuthenticator.All.KWHzl : passkeyPromotionAuthenticator;
        Boolean bool2 = (Boolean) savedStateHandle.get("KEY_ENABLE_EXIT_BOTTOM_SHEET");
        this.fIwbmz = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = (Boolean) savedStateHandle.get("KEY_ALLOW_FIDO1");
        this.AkhnZx = bool3 != null ? bool3.booleanValue() : false;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default;
        this.iwGUEr = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.isConnected = mutableSharedFlowMutableSharedFlow$default2;
        this.gHZMYf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default3;
        this.wlaJM = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default4;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default5;
        this.zLjUOn = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default6;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default7;
        this.hDKMBd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default8;
        this.AuCTel = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default8);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default9 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default9;
        this.fetchVPNInfo = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default9);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default10 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default10;
        this.uzCIH = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default10);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.register.PasskeyPromotionServiceActivityViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final String DbNXlk() {
        String str = (String) this.getNewProxyInstance.get("KEY_MFA_SESSION_ID");
        return str == null ? "" : str;
    }

    public final Job OLrzqt() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceActivityViewModel$checkPasskeyAndCheckNumberOfPasskey$1(this, null), 3, null);
    }

    public final Job KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceActivityViewModel$onMfaVerified$1(this, str, null), 3, null);
    }

    public final Job AEQbTJ() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceActivityViewModel$clickClose$1(this, null), 3, null);
    }

    public final Job getFieldNames() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceActivityViewModel$registerSuccess$1(this, null), 3, null);
    }

    public final Job copydefault() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceActivityViewModel$alreadyRegistered$1(this, null), 3, null);
    }

    public final Job uzCIH() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasskeyPromotionServiceActivityViewModel$reachMaximum$1(this, null), 3, null);
    }
}

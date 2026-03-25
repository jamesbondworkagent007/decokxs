package com.okinc.auth.impl.mfa.ui.passkey;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.okinc.auth.api.passkey.PasskeyFido1State;
import com.okinc.auth.api.passkey.PasskeySdkResult;
import com.okinc.auth.api.passkey.PasskeyVersionState;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaResult;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.model.OTP;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody;
import com.okinc.network.okg.cor.SubdomainStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C34703nhO;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.C5691aBJ;
import o.C5695aBN;
import o.C5764aCd;
import o.C5767aCg;
import o.C5768aCh;
import o.C5776aCp;
import o.C5790aDC;
import o.C58893zTh;
import o.C5937aFr;
import o.C5939aFt;
import o.C5941aFv;
import o.C60207zyQ;
import o.C6617aSi;
import o.InterfaceC5693aBL;
import o.InterfaceC58880zSu;
import o.InterfaceC58891zTf;
import o.InterfaceC8196ayF;
import o.pUU;
import o.yCM;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;
import uniffi.account.OkxPasskeyException;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyMfaPasskeyViewModel extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final MutableLiveData<AuthenticationStartResponse> AEQbTJ;
    public final MutableSharedFlow<Unit> AYXKKw;
    public final MutableLiveData<Boolean> AhwBna;
    public final MutableSharedFlow<Unit> AkhnZx;
    public final MutableSharedFlow<AuthenticationStartResponse> AuCTel;
    public final C5937aFr AuCTelauCTel;
    public final SharedFlow<Unit> AubY;
    public final SharedFlow<MfaFailure> AwvSrB;
    public final SharedFlow<MfaResponse> AxsJAY;
    public final SharedFlow<Unit> DTwDnp;
    public final MutableSharedFlow<Unit> DbNXlk;
    public final MutableSharedFlow<Unit> EZpvd;
    public final MutableSharedFlow<Unit> OLrzqt;
    public final SharedFlow<Unit> ORxRYg;
    public final C58893zTh OcIXYQ;
    public final SharedFlow<Unit> QKVWgx;
    public final InterfaceC58880zSu QOLQEE;
    public final SharedFlow<AuthenticationStartResponse> QUSxYX;
    public final SharedFlow<C5767aCg.ActionBar> QVAiDq;
    public final SharedFlow<AuthenticationStartResponse> QbewEr;
    public final SharedFlow<AuthenticationStartResponse> QfsBiF;
    public final SharedFlow<AuthenticationStartResponse> RJOkX;
    public final C5767aCg RcXXUw;
    public final C5776aCp UeEOUB;
    public final C5768aCh aKErDB;
    public final MutableSharedFlow<String> copydefault;
    public final SharedFlow<AuthenticationStartResponse> dNCPSb;
    public final MutableSharedFlow<MfaFailure> djBIcL;
    public final InterfaceC58891zTf djSkpj;
    public final SharedFlow<Boolean> dxcTrN;
    public final MutableSharedFlow<AuthenticationStartResponse> ejfBZ;
    public final MutableSharedFlow<AuthenticationStartResponse> fARcdN;
    public final C5695aBN fFgQHt;
    public final MutableSharedFlow<AuthenticationStartResponse> fIwbmz;
    public final MutableSharedFlow<AuthenticationStartResponse> fJNWhG;
    public final MutableSharedFlow<Unit> fetchVPNInfo;
    public final MutableSharedFlow<Boolean> gEmmrt;
    public final C5691aBJ gHZMYf;
    public final InterfaceC8196ayF getFieldNames;
    public final C5939aFt getNewProxyInstance;
    public final MutableSharedFlow<Boolean> hDKMBd;
    public final MutableSharedFlow<C5767aCg.ActionBar> isConnected;
    public final C5941aFv iwGUEr;
    public final SharedFlow<Boolean> sSMYrx;
    public final MutableLiveData<SubdomainStrategy> uzCIH;
    public final MutableSharedFlow<MfaResponse> valueOf;
    public final MutableLiveData<String> values;
    public final SharedFlow<String> wlaJM;
    public final SharedFlow<Unit> zLjUOn;
    public final C5764aCd zsXlph;
    public final SharedFlow<Unit> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> AEQbTJ() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AYXKKw() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<MfaResponse> AhwBna() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AkhnZx() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AuthenticationStartResponse> AuCTel() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<C5767aCg.ActionBar> DbNXlk() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> EZpvd() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> KWHzl() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> OLrzqt() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> djBIcL() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> ejfBZ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AuthenticationStartResponse> fARcdN() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> fIwbmz() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AuthenticationStartResponse> fetchVPNInfo() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> gEmmrt() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AuthenticationStartResponse> isConnected() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<SubdomainStrategy> iwGUEr() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<MfaFailure> valueOf() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AuthenticationStartResponse> values() {
        return this.RJOkX;
    }

    @yCM
    public VerifyMfaPasskeyViewModel(@NotNull C5768aCh c5768aCh, @NotNull C5767aCg c5767aCg, @NotNull C5764aCd c5764aCd, @NotNull C5776aCp c5776aCp, @NotNull InterfaceC8196ayF interfaceC8196ayF, @NotNull C5695aBN c5695aBN, @NotNull C5939aFt c5939aFt, @NotNull C5937aFr c5937aFr, @NotNull C5941aFv c5941aFv, @NotNull C5691aBJ c5691aBJ, @NotNull InterfaceC58891zTf interfaceC58891zTf, @NotNull InterfaceC58880zSu interfaceC58880zSu, @NotNull C58893zTh c58893zTh) {
        Intrinsics.checkNotNullParameter(c5768aCh, "");
        Intrinsics.checkNotNullParameter(c5767aCg, "");
        Intrinsics.checkNotNullParameter(c5764aCd, "");
        Intrinsics.checkNotNullParameter(c5776aCp, "");
        Intrinsics.checkNotNullParameter(interfaceC8196ayF, "");
        Intrinsics.checkNotNullParameter(c5695aBN, "");
        Intrinsics.checkNotNullParameter(c5939aFt, "");
        Intrinsics.checkNotNullParameter(c5937aFr, "");
        Intrinsics.checkNotNullParameter(c5941aFv, "");
        Intrinsics.checkNotNullParameter(c5691aBJ, "");
        Intrinsics.checkNotNullParameter(interfaceC58891zTf, "");
        Intrinsics.checkNotNullParameter(interfaceC58880zSu, "");
        Intrinsics.checkNotNullParameter(c58893zTh, "");
        this.aKErDB = c5768aCh;
        this.RcXXUw = c5767aCg;
        this.zsXlph = c5764aCd;
        this.UeEOUB = c5776aCp;
        this.getFieldNames = interfaceC8196ayF;
        this.fFgQHt = c5695aBN;
        this.getNewProxyInstance = c5939aFt;
        this.AuCTelauCTel = c5937aFr;
        this.iwGUEr = c5941aFv;
        this.gHZMYf = c5691aBJ;
        this.djSkpj = interfaceC58891zTf;
        this.QOLQEE = interfaceC58880zSu;
        this.OcIXYQ = c58893zTh;
        this.values = new MutableLiveData<>();
        this.uzCIH = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default;
        this.sSMYrx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<MfaResponse> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default2;
        this.AxsJAY = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default3;
        this.wlaJM = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<MfaFailure> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default4;
        this.AwvSrB = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<C5767aCg.ActionBar> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.isConnected = mutableSharedFlowMutableSharedFlow$default5;
        this.QVAiDq = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AkhnZx = mutableSharedFlowMutableSharedFlow$default6;
        this.DTwDnp = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fetchVPNInfo = mutableSharedFlowMutableSharedFlow$default7;
        this.ORxRYg = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.DbNXlk = mutableSharedFlowMutableSharedFlow$default8;
        this.QKVWgx = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default8);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default9 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default9;
        this.zuBGHE = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default9);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default10 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.hDKMBd = mutableSharedFlowMutableSharedFlow$default10;
        this.dxcTrN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default10);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default11 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default11;
        this.zLjUOn = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default11);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default12 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default12;
        this.AubY = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default12);
        MutableSharedFlow<AuthenticationStartResponse> mutableSharedFlowMutableSharedFlow$default13 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fARcdN = mutableSharedFlowMutableSharedFlow$default13;
        this.QfsBiF = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default13);
        MutableSharedFlow<AuthenticationStartResponse> mutableSharedFlowMutableSharedFlow$default14 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fJNWhG = mutableSharedFlowMutableSharedFlow$default14;
        this.RJOkX = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default14);
        MutableSharedFlow<AuthenticationStartResponse> mutableSharedFlowMutableSharedFlow$default15 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.ejfBZ = mutableSharedFlowMutableSharedFlow$default15;
        this.dNCPSb = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default15);
        MutableSharedFlow<AuthenticationStartResponse> mutableSharedFlowMutableSharedFlow$default16 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AuCTel = mutableSharedFlowMutableSharedFlow$default16;
        this.QUSxYX = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default16);
        MutableSharedFlow<AuthenticationStartResponse> mutableSharedFlowMutableSharedFlow$default17 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.fIwbmz = mutableSharedFlowMutableSharedFlow$default17;
        this.QbewEr = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default17);
        this.AEQbTJ = new MutableLiveData<>();
    }

    public final int fJNWhG() {
        List<AuthenticationStartResponse.AdditionalData> additionalData;
        Integer inHouseVer;
        AuthenticationStartResponse value = this.AEQbTJ.getValue();
        int i = 0;
        if (value != null && (additionalData = value.getAdditionalData()) != null && !additionalData.isEmpty()) {
            for (AuthenticationStartResponse.AdditionalData additionalData2 : additionalData) {
                if (Intrinsics.EZpvd(additionalData2.getInHouse(), Boolean.TRUE) && (inHouseVer = additionalData2.getInHouseVer()) != null && inHouseVer.intValue() == 1 && (i = i + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        return i;
    }

    public final Job OLrzqt(@NotNull String str, SubdomainStrategy subdomainStrategy, @NotNull MfaScenario mfaScenario, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mfaScenario, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaPasskeyViewModel$initFlow$1(this, str, subdomainStrategy, z, mfaScenario, null), 3, null);
    }

    public static /* synthetic */ Job clickVerify$default(VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel, boolean z, MfaScenario mfaScenario, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return verifyMfaPasskeyViewModel.EZpvd(z, mfaScenario);
    }

    public final Job EZpvd(boolean z, @NotNull MfaScenario mfaScenario) {
        Intrinsics.checkNotNullParameter(mfaScenario, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaPasskeyViewModel$clickVerify$1(this, mfaScenario, z, null), 3, null);
    }

    public final Job OLrzqt(@NotNull C5790aDC c5790aDC, @NotNull MfaScenario mfaScenario) {
        Intrinsics.checkNotNullParameter(c5790aDC, "");
        Intrinsics.checkNotNullParameter(mfaScenario, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaPasskeyViewModel$startFido1$1(this, c5790aDC, mfaScenario, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(Continuation<? super Boolean> continuation) throws Throwable {
        VerifyMfaPasskeyViewModel$canRunFido1v1Local$1 verifyMfaPasskeyViewModel$canRunFido1v1Local$1;
        Integer inHouseVer;
        Set set;
        if (continuation instanceof VerifyMfaPasskeyViewModel$canRunFido1v1Local$1) {
            verifyMfaPasskeyViewModel$canRunFido1v1Local$1 = (VerifyMfaPasskeyViewModel$canRunFido1v1Local$1) continuation;
            int i = verifyMfaPasskeyViewModel$canRunFido1v1Local$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                verifyMfaPasskeyViewModel$canRunFido1v1Local$1.label = i - Integer.MIN_VALUE;
            } else {
                verifyMfaPasskeyViewModel$canRunFido1v1Local$1 = new VerifyMfaPasskeyViewModel$canRunFido1v1Local$1(this, continuation);
            }
        }
        Object obj = verifyMfaPasskeyViewModel$canRunFido1v1Local$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = verifyMfaPasskeyViewModel$canRunFido1v1Local$1.label;
        boolean z = false;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            AuthenticationStartResponse value = this.AEQbTJ.getValue();
            if (value == null) {
                return C56443yFo.KWHzl(false);
            }
            List<AuthenticationStartResponse.AdditionalData> additionalData = value.getAdditionalData();
            if (additionalData != null && !additionalData.isEmpty()) {
                for (AuthenticationStartResponse.AdditionalData additionalData2 : additionalData) {
                    if (Intrinsics.EZpvd(additionalData2.getInHouse(), C56443yFo.KWHzl(true)) && Intrinsics.EZpvd(additionalData2.getCurrentDevice(), C56443yFo.KWHzl(true)) && (inHouseVer = additionalData2.getInHouseVer()) != null && inHouseVer.intValue() == 1) {
                        Set setAhwBna = yEE.AhwBna(PasskeyFido1State.Compatible.INSTANCE, PasskeyFido1State.BiometricNotEnrolled.INSTANCE);
                        C5939aFt c5939aFt = this.getNewProxyInstance;
                        verifyMfaPasskeyViewModel$canRunFido1v1Local$1.L$0 = setAhwBna;
                        verifyMfaPasskeyViewModel$canRunFido1v1Local$1.label = 1;
                        Object objEZpvd = c5939aFt.EZpvd(verifyMfaPasskeyViewModel$canRunFido1v1Local$1);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                        set = setAhwBna;
                        obj = objEZpvd;
                    }
                }
            }
            return C56443yFo.KWHzl(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        set = (Set) verifyMfaPasskeyViewModel$canRunFido1v1Local$1.L$0;
        C56391yDq.AEQbTJ(obj);
        if (set.contains(obj)) {
            z = true;
        }
        return C56443yFo.KWHzl(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Continuation<? super Boolean> continuation) throws Throwable {
        VerifyMfaPasskeyViewModel$canRunFido1v1External$1 verifyMfaPasskeyViewModel$canRunFido1v1External$1;
        Integer inHouseVer;
        if (continuation instanceof VerifyMfaPasskeyViewModel$canRunFido1v1External$1) {
            verifyMfaPasskeyViewModel$canRunFido1v1External$1 = (VerifyMfaPasskeyViewModel$canRunFido1v1External$1) continuation;
            int i = verifyMfaPasskeyViewModel$canRunFido1v1External$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                verifyMfaPasskeyViewModel$canRunFido1v1External$1.label = i - Integer.MIN_VALUE;
            } else {
                verifyMfaPasskeyViewModel$canRunFido1v1External$1 = new VerifyMfaPasskeyViewModel$canRunFido1v1External$1(this, continuation);
            }
        }
        Object objEZpvd = verifyMfaPasskeyViewModel$canRunFido1v1External$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = verifyMfaPasskeyViewModel$canRunFido1v1External$1.label;
        boolean z = false;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            AuthenticationStartResponse value = this.AEQbTJ.getValue();
            if (value == null) {
                return C56443yFo.KWHzl(false);
            }
            List<AuthenticationStartResponse.AdditionalData> additionalData = value.getAdditionalData();
            if (additionalData != null && !additionalData.isEmpty()) {
                for (AuthenticationStartResponse.AdditionalData additionalData2 : additionalData) {
                    if (Intrinsics.EZpvd(additionalData2.getInHouse(), C56443yFo.KWHzl(true)) && Intrinsics.EZpvd(additionalData2.getCurrentDevice(), C56443yFo.KWHzl(false)) && (inHouseVer = additionalData2.getInHouseVer()) != null && inHouseVer.intValue() == 1) {
                        C5939aFt c5939aFt = this.getNewProxyInstance;
                        verifyMfaPasskeyViewModel$canRunFido1v1External$1.label = 1;
                        objEZpvd = c5939aFt.EZpvd(verifyMfaPasskeyViewModel$canRunFido1v1External$1);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
            }
            return C56443yFo.KWHzl(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objEZpvd);
        if (!Intrinsics.EZpvd(objEZpvd, PasskeyFido1State.NotInGreyScale.INSTANCE)) {
            z = true;
        }
        return C56443yFo.KWHzl(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Continuation<? super Boolean> continuation) throws Throwable {
        VerifyMfaPasskeyViewModel$canRunFido1v2Local$1 verifyMfaPasskeyViewModel$canRunFido1v2Local$1;
        Integer inHouseVer;
        if (continuation instanceof VerifyMfaPasskeyViewModel$canRunFido1v2Local$1) {
            verifyMfaPasskeyViewModel$canRunFido1v2Local$1 = (VerifyMfaPasskeyViewModel$canRunFido1v2Local$1) continuation;
            int i = verifyMfaPasskeyViewModel$canRunFido1v2Local$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                verifyMfaPasskeyViewModel$canRunFido1v2Local$1.label = i - Integer.MIN_VALUE;
            } else {
                verifyMfaPasskeyViewModel$canRunFido1v2Local$1 = new VerifyMfaPasskeyViewModel$canRunFido1v2Local$1(this, continuation);
            }
        }
        Object objCopydefault = verifyMfaPasskeyViewModel$canRunFido1v2Local$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = verifyMfaPasskeyViewModel$canRunFido1v2Local$1.label;
        boolean z = false;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            AuthenticationStartResponse value = this.AEQbTJ.getValue();
            if (value == null) {
                return C56443yFo.KWHzl(false);
            }
            List<AuthenticationStartResponse.AdditionalData> additionalData = value.getAdditionalData();
            if (additionalData != null && !additionalData.isEmpty()) {
                for (AuthenticationStartResponse.AdditionalData additionalData2 : additionalData) {
                    if (Intrinsics.EZpvd(additionalData2.getInHouse(), C56443yFo.KWHzl(true)) && Intrinsics.EZpvd(additionalData2.getCurrentDevice(), C56443yFo.KWHzl(true)) && (inHouseVer = additionalData2.getInHouseVer()) != null && inHouseVer.intValue() == 2) {
                        C5937aFr c5937aFr = this.AuCTelauCTel;
                        verifyMfaPasskeyViewModel$canRunFido1v2Local$1.label = 1;
                        objCopydefault = c5937aFr.copydefault(verifyMfaPasskeyViewModel$canRunFido1v2Local$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                    }
                }
            }
            return C56443yFo.KWHzl(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objCopydefault);
        if (Intrinsics.EZpvd(objCopydefault, PasskeyVersionState.Fido1v2Compatible.INSTANCE)) {
            z = true;
        }
        return C56443yFo.KWHzl(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(Continuation<? super Boolean> continuation) throws Throwable {
        VerifyMfaPasskeyViewModel$canRunFido1v2External$1 verifyMfaPasskeyViewModel$canRunFido1v2External$1;
        Integer inHouseVer;
        List<AuthenticationStartResponse.DeviceWithV2Passkey> devicesWithV2Passkey;
        Integer inHouseVer2;
        if (continuation instanceof VerifyMfaPasskeyViewModel$canRunFido1v2External$1) {
            verifyMfaPasskeyViewModel$canRunFido1v2External$1 = (VerifyMfaPasskeyViewModel$canRunFido1v2External$1) continuation;
            int i = verifyMfaPasskeyViewModel$canRunFido1v2External$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                verifyMfaPasskeyViewModel$canRunFido1v2External$1.label = i - Integer.MIN_VALUE;
            } else {
                verifyMfaPasskeyViewModel$canRunFido1v2External$1 = new VerifyMfaPasskeyViewModel$canRunFido1v2External$1(this, continuation);
            }
        }
        Object objCopydefault = verifyMfaPasskeyViewModel$canRunFido1v2External$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = verifyMfaPasskeyViewModel$canRunFido1v2External$1.label;
        boolean z = false;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            AuthenticationStartResponse value = this.AEQbTJ.getValue();
            if (value == null) {
                return C56443yFo.KWHzl(false);
            }
            List<AuthenticationStartResponse.AdditionalData> additionalData = value.getAdditionalData();
            if (additionalData != null && !additionalData.isEmpty()) {
                for (AuthenticationStartResponse.AdditionalData additionalData2 : additionalData) {
                    if ((Intrinsics.EZpvd(additionalData2.getInHouse(), C56443yFo.KWHzl(true)) && Intrinsics.EZpvd(additionalData2.getCurrentDevice(), C56443yFo.KWHzl(false)) && (inHouseVer2 = additionalData2.getInHouseVer()) != null && inHouseVer2.intValue() == 2) || (Intrinsics.EZpvd(additionalData2.getInHouse(), C56443yFo.KWHzl(true)) && (inHouseVer = additionalData2.getInHouseVer()) != null && inHouseVer.intValue() == 2 && (devicesWithV2Passkey = additionalData2.getDevicesWithV2Passkey()) != null && devicesWithV2Passkey.size() > 1)) {
                        C5937aFr c5937aFr = this.AuCTelauCTel;
                        verifyMfaPasskeyViewModel$canRunFido1v2External$1.label = 1;
                        objCopydefault = c5937aFr.copydefault(verifyMfaPasskeyViewModel$canRunFido1v2External$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                    }
                }
            }
            return C56443yFo.KWHzl(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objCopydefault);
        if (Intrinsics.EZpvd(objCopydefault, PasskeyVersionState.Fido1v2Compatible.INSTANCE)) {
            z = true;
        }
        return C56443yFo.KWHzl(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(C5790aDC c5790aDC, MfaScenario mfaScenario, AuthenticationStartResponse authenticationStartResponse, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        VerifyMfaPasskeyViewModel$startFido1v1Local$1 verifyMfaPasskeyViewModel$startFido1v1Local$1;
        MfaScenario mfaScenario2;
        boolean z2;
        Object objKWHzl;
        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel;
        Object obj;
        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel2;
        AuthenticationStartResponse authenticationStartResponse2;
        boolean z3;
        AuthenticationStartResponse authenticationStartResponse3;
        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel3;
        MfaScenario mfaScenario3;
        C5695aBN.ActionBar actionBar;
        Object obj2;
        AuthenticationStartResponse authenticationStartResponse4;
        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel4;
        MfaResult mfaResult;
        Throwable thM7380exceptionOrNullimpl;
        AuthenticationStartResponse authenticationStartResponse5 = authenticationStartResponse;
        if (continuation instanceof VerifyMfaPasskeyViewModel$startFido1v1Local$1) {
            verifyMfaPasskeyViewModel$startFido1v1Local$1 = (VerifyMfaPasskeyViewModel$startFido1v1Local$1) continuation;
            int i = verifyMfaPasskeyViewModel$startFido1v1Local$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                verifyMfaPasskeyViewModel$startFido1v1Local$1.label = i - Integer.MIN_VALUE;
            } else {
                verifyMfaPasskeyViewModel$startFido1v1Local$1 = new VerifyMfaPasskeyViewModel$startFido1v1Local$1(this, continuation);
            }
        }
        Object obj3 = verifyMfaPasskeyViewModel$startFido1v1Local$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        switch (verifyMfaPasskeyViewModel$startFido1v1Local$1.label) {
            case 0:
                C56391yDq.AEQbTJ(obj3);
                C5695aBN.Application application = new C5695aBN.Application(c5790aDC, authenticationStartResponse5);
                C5695aBN c5695aBN = this.fFgQHt;
                verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0 = this;
                mfaScenario2 = mfaScenario;
                verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1 = mfaScenario2;
                verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2 = authenticationStartResponse5;
                z2 = z;
                verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0 = z2;
                verifyMfaPasskeyViewModel$startFido1v1Local$1.label = 1;
                objKWHzl = c5695aBN.KWHzl(application, (Continuation) verifyMfaPasskeyViewModel$startFido1v1Local$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                verifyMfaPasskeyViewModel = this;
                if (!Result.m7384isSuccessimpl(objKWHzl)) {
                    C5695aBN.ActionBar actionBar2 = (C5695aBN.ActionBar) objKWHzl;
                    MutableSharedFlow<Boolean> mutableSharedFlow = verifyMfaPasskeyViewModel.gEmmrt;
                    Boolean boolKWHzl = C56443yFo.KWHzl(false);
                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0 = verifyMfaPasskeyViewModel;
                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1 = mfaScenario2;
                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2 = authenticationStartResponse5;
                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$3 = objKWHzl;
                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$4 = actionBar2;
                    verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0 = z2;
                    verifyMfaPasskeyViewModel$startFido1v1Local$1.label = 2;
                    if (mutableSharedFlow.emit(boolKWHzl, verifyMfaPasskeyViewModel$startFido1v1Local$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    authenticationStartResponse3 = authenticationStartResponse5;
                    verifyMfaPasskeyViewModel3 = verifyMfaPasskeyViewModel;
                    mfaScenario3 = mfaScenario2;
                    z3 = z2;
                    actionBar = actionBar2;
                    if (!(actionBar instanceof C5695aBN.ActionBar.C0808ActionBar)) {
                        C5764aCd c5764aCd = verifyMfaPasskeyViewModel3.zsXlph;
                        String value = verifyMfaPasskeyViewModel3.values.getValue();
                        if (value == null) {
                            value = "";
                        }
                        UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBodyOLrzqt = ((C5695aBN.ActionBar.C0808ActionBar) actionBar).OLrzqt();
                        SubdomainStrategy value2 = verifyMfaPasskeyViewModel3.uzCIH.getValue();
                        verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0 = verifyMfaPasskeyViewModel3;
                        verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1 = authenticationStartResponse3;
                        verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2 = objKWHzl;
                        verifyMfaPasskeyViewModel$startFido1v1Local$1.L$3 = null;
                        verifyMfaPasskeyViewModel$startFido1v1Local$1.L$4 = null;
                        verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0 = z3;
                        verifyMfaPasskeyViewModel$startFido1v1Local$1.label = 3;
                        Object objAEQbTJ = c5764aCd.AEQbTJ(value, unlockTokenWithFidoRequestBodyOLrzqt, value2, mfaScenario3, verifyMfaPasskeyViewModel$startFido1v1Local$1);
                        if (objAEQbTJ == objCopydefault) {
                            return objCopydefault;
                        }
                        authenticationStartResponse4 = authenticationStartResponse3;
                        verifyMfaPasskeyViewModel4 = verifyMfaPasskeyViewModel3;
                        obj2 = objKWHzl;
                        obj3 = objAEQbTJ;
                        mfaResult = (MfaResult) obj3;
                        if (!(mfaResult instanceof MfaResult.Success)) {
                            MutableSharedFlow<MfaResponse> mutableSharedFlow2 = verifyMfaPasskeyViewModel4.valueOf;
                            MfaResponse mfaResponseKWHzl = ((MfaResult.Success) mfaResult).KWHzl();
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0 = verifyMfaPasskeyViewModel4;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1 = authenticationStartResponse4;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2 = obj2;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0 = z3;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.label = 4;
                            if (mutableSharedFlow2.emit(mfaResponseKWHzl, verifyMfaPasskeyViewModel$startFido1v1Local$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            if (!(mfaResult instanceof MfaResult.Failure)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            MutableSharedFlow<MfaFailure> mutableSharedFlow3 = verifyMfaPasskeyViewModel4.djBIcL;
                            MfaFailure mfaFailureKWHzl = ((MfaResult.Failure) mfaResult).KWHzl();
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0 = verifyMfaPasskeyViewModel4;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1 = authenticationStartResponse4;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2 = obj2;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0 = z3;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.label = 5;
                            if (mutableSharedFlow3.emit(mfaFailureKWHzl, verifyMfaPasskeyViewModel$startFido1v1Local$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        objKWHzl = obj2;
                        authenticationStartResponse3 = authenticationStartResponse4;
                        verifyMfaPasskeyViewModel3 = verifyMfaPasskeyViewModel4;
                        obj = objKWHzl;
                        authenticationStartResponse2 = authenticationStartResponse3;
                        verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel3;
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                        if (thM7380exceptionOrNullimpl != null) {
                            MutableSharedFlow<Boolean> mutableSharedFlow4 = verifyMfaPasskeyViewModel2.gEmmrt;
                            Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0 = verifyMfaPasskeyViewModel2;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1 = authenticationStartResponse2;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2 = obj;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$3 = thM7380exceptionOrNullimpl;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$4 = null;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0 = z3;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.label = 11;
                            if (mutableSharedFlow4.emit(boolKWHzl2, verifyMfaPasskeyViewModel$startFido1v1Local$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            if (!z3) {
                                MutableSharedFlow<AuthenticationStartResponse> mutableSharedFlow5 = verifyMfaPasskeyViewModel2.fARcdN;
                                verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0 = obj;
                                verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1 = null;
                                verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2 = null;
                                verifyMfaPasskeyViewModel$startFido1v1Local$1.L$3 = null;
                                verifyMfaPasskeyViewModel$startFido1v1Local$1.label = 12;
                                if (mutableSharedFlow5.emit(authenticationStartResponse2, verifyMfaPasskeyViewModel$startFido1v1Local$1) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                pUU.copydefault("VerifyMfaPasskeyViewModel", "startFido1 error: " + thM7380exceptionOrNullimpl.getMessage());
                                verifyMfaPasskeyViewModel2.getNewProxyInstance();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (actionBar instanceof C5695aBN.ActionBar.Application) {
                        C5695aBN.ActionBar.Application application2 = (C5695aBN.ActionBar.Application) actionBar;
                        InterfaceC5693aBL.StateListAnimator stateListAnimatorEZpvd = application2.EZpvd();
                        if (!(stateListAnimatorEZpvd instanceof InterfaceC5693aBL.StateListAnimator.ActionBar)) {
                            if (Intrinsics.EZpvd(stateListAnimatorEZpvd, InterfaceC5693aBL.StateListAnimator.TaskDescription.EZpvd) || Intrinsics.EZpvd(stateListAnimatorEZpvd, InterfaceC5693aBL.StateListAnimator.Application.EZpvd)) {
                                pUU.copydefault("VerifyMfaPasskeyViewModel", "startFido1 NotEnrolled or KeyInvalidated");
                                if (z3) {
                                    MutableSharedFlow<AuthenticationStartResponse> mutableSharedFlow6 = verifyMfaPasskeyViewModel3.AuCTel;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0 = verifyMfaPasskeyViewModel3;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1 = authenticationStartResponse3;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2 = objKWHzl;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$3 = null;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$4 = null;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0 = z3;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.label = 7;
                                    if (mutableSharedFlow6.emit(authenticationStartResponse3, verifyMfaPasskeyViewModel$startFido1v1Local$1) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                } else {
                                    MutableSharedFlow<AuthenticationStartResponse> mutableSharedFlow7 = verifyMfaPasskeyViewModel3.fIwbmz;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0 = verifyMfaPasskeyViewModel3;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1 = authenticationStartResponse3;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2 = objKWHzl;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$3 = null;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$4 = null;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0 = z3;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.label = 8;
                                    if (mutableSharedFlow7.emit(authenticationStartResponse3, verifyMfaPasskeyViewModel$startFido1v1Local$1) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                            } else {
                                if (!Intrinsics.EZpvd(stateListAnimatorEZpvd, InterfaceC5693aBL.StateListAnimator.Activity.copydefault)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (z3) {
                                    MutableSharedFlow<AuthenticationStartResponse> mutableSharedFlow8 = verifyMfaPasskeyViewModel3.fARcdN;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0 = verifyMfaPasskeyViewModel3;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1 = authenticationStartResponse3;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2 = objKWHzl;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$3 = null;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.L$4 = null;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0 = z3;
                                    verifyMfaPasskeyViewModel$startFido1v1Local$1.label = 9;
                                    if (mutableSharedFlow8.emit(authenticationStartResponse3, verifyMfaPasskeyViewModel$startFido1v1Local$1) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                obj = objKWHzl;
                                authenticationStartResponse2 = authenticationStartResponse3;
                                verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel3;
                                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                                if (thM7380exceptionOrNullimpl != null) {
                                }
                            }
                            obj2 = objKWHzl;
                            authenticationStartResponse4 = authenticationStartResponse3;
                            verifyMfaPasskeyViewModel4 = verifyMfaPasskeyViewModel3;
                            objKWHzl = obj2;
                            authenticationStartResponse3 = authenticationStartResponse4;
                            verifyMfaPasskeyViewModel3 = verifyMfaPasskeyViewModel4;
                            obj = objKWHzl;
                            authenticationStartResponse2 = authenticationStartResponse3;
                            verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel3;
                            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                            if (thM7380exceptionOrNullimpl != null) {
                            }
                        } else if (z3) {
                            MutableSharedFlow<AuthenticationStartResponse> mutableSharedFlow9 = verifyMfaPasskeyViewModel3.fARcdN;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0 = verifyMfaPasskeyViewModel3;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1 = authenticationStartResponse3;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2 = objKWHzl;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$3 = null;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$4 = null;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0 = z3;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.label = 6;
                            if (mutableSharedFlow9.emit(authenticationStartResponse3, verifyMfaPasskeyViewModel$startFido1v1Local$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            obj2 = objKWHzl;
                            authenticationStartResponse4 = authenticationStartResponse3;
                            verifyMfaPasskeyViewModel4 = verifyMfaPasskeyViewModel3;
                            objKWHzl = obj2;
                            authenticationStartResponse3 = authenticationStartResponse4;
                            verifyMfaPasskeyViewModel3 = verifyMfaPasskeyViewModel4;
                            obj = objKWHzl;
                            authenticationStartResponse2 = authenticationStartResponse3;
                            verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel3;
                            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                            if (thM7380exceptionOrNullimpl != null) {
                            }
                        } else {
                            pUU.copydefault("VerifyMfaPasskeyViewModel", "startFido1 OtherError: [" + ((InterfaceC5693aBL.StateListAnimator.ActionBar) application2.EZpvd()).AEQbTJ() + "] " + ((InterfaceC5693aBL.StateListAnimator.ActionBar) application2.EZpvd()).OLrzqt());
                            verifyMfaPasskeyViewModel3.getNewProxyInstance();
                            obj = objKWHzl;
                            authenticationStartResponse2 = authenticationStartResponse3;
                            verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel3;
                            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                            if (thM7380exceptionOrNullimpl != null) {
                            }
                        }
                    } else {
                        if (!(actionBar instanceof C5695aBN.ActionBar.Activity) && !Intrinsics.EZpvd(actionBar, C5695aBN.ActionBar.StateListAnimator.KWHzl)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (z3) {
                            MutableSharedFlow<AuthenticationStartResponse> mutableSharedFlow10 = verifyMfaPasskeyViewModel3.fARcdN;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0 = verifyMfaPasskeyViewModel3;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1 = authenticationStartResponse3;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2 = objKWHzl;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$3 = null;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.L$4 = null;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0 = z3;
                            verifyMfaPasskeyViewModel$startFido1v1Local$1.label = 10;
                            if (mutableSharedFlow10.emit(authenticationStartResponse3, verifyMfaPasskeyViewModel$startFido1v1Local$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            obj2 = objKWHzl;
                            authenticationStartResponse4 = authenticationStartResponse3;
                            verifyMfaPasskeyViewModel4 = verifyMfaPasskeyViewModel3;
                            objKWHzl = obj2;
                            authenticationStartResponse3 = authenticationStartResponse4;
                            verifyMfaPasskeyViewModel3 = verifyMfaPasskeyViewModel4;
                            obj = objKWHzl;
                            authenticationStartResponse2 = authenticationStartResponse3;
                            verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel3;
                            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                            if (thM7380exceptionOrNullimpl != null) {
                            }
                        } else {
                            pUU.copydefault("VerifyMfaPasskeyViewModel", "startFido1 SignError or UserKeyPairNotExist");
                            verifyMfaPasskeyViewModel3.getNewProxyInstance();
                            obj = objKWHzl;
                            authenticationStartResponse2 = authenticationStartResponse3;
                            verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel3;
                            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                            if (thM7380exceptionOrNullimpl != null) {
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                obj = objKWHzl;
                verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel;
                boolean z4 = z2;
                authenticationStartResponse2 = authenticationStartResponse5;
                z3 = z4;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 1:
                boolean z5 = verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0;
                AuthenticationStartResponse authenticationStartResponse6 = (AuthenticationStartResponse) verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2;
                mfaScenario2 = (MfaScenario) verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1;
                VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel5 = (VerifyMfaPasskeyViewModel) verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0;
                C56391yDq.AEQbTJ(obj3);
                objKWHzl = ((Result) obj3).m7386unboximpl();
                z2 = z5;
                authenticationStartResponse5 = authenticationStartResponse6;
                verifyMfaPasskeyViewModel = verifyMfaPasskeyViewModel5;
                if (!Result.m7384isSuccessimpl(objKWHzl)) {
                }
                break;
            case 2:
                z3 = verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0;
                actionBar = (C5695aBN.ActionBar) verifyMfaPasskeyViewModel$startFido1v1Local$1.L$4;
                Object obj4 = verifyMfaPasskeyViewModel$startFido1v1Local$1.L$3;
                AuthenticationStartResponse authenticationStartResponse7 = (AuthenticationStartResponse) verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2;
                MfaScenario mfaScenario4 = (MfaScenario) verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1;
                VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel6 = (VerifyMfaPasskeyViewModel) verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0;
                C56391yDq.AEQbTJ(obj3);
                objKWHzl = obj4;
                authenticationStartResponse3 = authenticationStartResponse7;
                verifyMfaPasskeyViewModel3 = verifyMfaPasskeyViewModel6;
                mfaScenario3 = mfaScenario4;
                if (!(actionBar instanceof C5695aBN.ActionBar.C0808ActionBar)) {
                }
                break;
            case 3:
                z3 = verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0;
                obj2 = verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2;
                authenticationStartResponse4 = (AuthenticationStartResponse) verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1;
                verifyMfaPasskeyViewModel4 = (VerifyMfaPasskeyViewModel) verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0;
                C56391yDq.AEQbTJ(obj3);
                mfaResult = (MfaResult) obj3;
                if (!(mfaResult instanceof MfaResult.Success)) {
                }
                objKWHzl = obj2;
                authenticationStartResponse3 = authenticationStartResponse4;
                verifyMfaPasskeyViewModel3 = verifyMfaPasskeyViewModel4;
                obj = objKWHzl;
                authenticationStartResponse2 = authenticationStartResponse3;
                verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel3;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                z3 = verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0;
                obj2 = verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2;
                authenticationStartResponse4 = (AuthenticationStartResponse) verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1;
                verifyMfaPasskeyViewModel4 = (VerifyMfaPasskeyViewModel) verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0;
                C56391yDq.AEQbTJ(obj3);
                objKWHzl = obj2;
                authenticationStartResponse3 = authenticationStartResponse4;
                verifyMfaPasskeyViewModel3 = verifyMfaPasskeyViewModel4;
                obj = objKWHzl;
                authenticationStartResponse2 = authenticationStartResponse3;
                verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel3;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 11:
                z3 = verifyMfaPasskeyViewModel$startFido1v1Local$1.Z$0;
                thM7380exceptionOrNullimpl = (Throwable) verifyMfaPasskeyViewModel$startFido1v1Local$1.L$3;
                obj = verifyMfaPasskeyViewModel$startFido1v1Local$1.L$2;
                authenticationStartResponse2 = (AuthenticationStartResponse) verifyMfaPasskeyViewModel$startFido1v1Local$1.L$1;
                verifyMfaPasskeyViewModel2 = (VerifyMfaPasskeyViewModel) verifyMfaPasskeyViewModel$startFido1v1Local$1.L$0;
                C56391yDq.AEQbTJ(obj3);
                if (!z3) {
                }
                return Unit.INSTANCE;
            case 12:
                C56391yDq.AEQbTJ(obj3);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object OLrzqt(AuthenticationStartResponse authenticationStartResponse, Continuation<? super Unit> continuation) {
        Object objEmit = this.fJNWhG.emit(authenticationStartResponse, continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:112:0x0289 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0070 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x008a */
    /* JADX DEBUG: Type inference failed for r5v9. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0236 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023e A[Catch: Exception -> 0x006d, OkxPasskeyException -> 0x027a, TryCatch #2 {Exception -> 0x006d, blocks: (B:15:0x0057, B:18:0x0066, B:91:0x0238, B:93:0x023e, B:96:0x0256, B:98:0x025a, B:101:0x0272, B:102:0x0277), top: B:157:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0256 A[Catch: Exception -> 0x006d, OkxPasskeyException -> 0x027a, TryCatch #2 {Exception -> 0x006d, blocks: (B:15:0x0057, B:18:0x0066, B:91:0x0238, B:93:0x023e, B:96:0x0256, B:98:0x025a, B:101:0x0272, B:102:0x0277), top: B:157:0x002a }] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v28, types: [com.okinc.auth.impl.passkey.model.AuthenticationStartResponse] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyViewModel] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v28, types: [com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyViewModel] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyViewModel] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(C5790aDC c5790aDC, MfaScenario mfaScenario, AuthenticationStartResponse authenticationStartResponse, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        VerifyMfaPasskeyViewModel$startFido1v2Local$1 verifyMfaPasskeyViewModel$startFido1v2Local$1;
        ?? r6;
        ?? r5;
        ?? r4;
        ?? r12;
        ?? r13;
        ?? r62;
        OkxPasskeyException okxPasskeyException;
        MutableSharedFlow<Unit> mutableSharedFlow;
        Unit unit;
        MutableSharedFlow<Boolean> mutableSharedFlow2;
        Boolean boolKWHzl;
        ?? r3;
        ?? r52;
        ?? r63;
        AuthenticationStartResponse authenticationStartResponse2;
        boolean z2;
        InterfaceC58880zSu interfaceC58880zSu;
        String challenge;
        String rpId;
        List<String> listAhwBna;
        C5691aBJ c5691aBJ;
        Context context;
        InterfaceC58880zSu interfaceC58880zSu2;
        Object objCopydefault;
        String str;
        Object obj;
        MfaScenario mfaScenario2;
        boolean z3;
        AuthenticationStartResponse authenticationStartResponse3;
        C5790aDC c5790aDC2;
        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel;
        List<AuthenticationStartResponse.CredentialDescriptor> allowCredentials;
        VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel2;
        boolean z4;
        String str2;
        Object objCopydefault2;
        MfaScenario mfaScenario3;
        ?? r9;
        ?? r132;
        ?? r122;
        String value;
        ?? r53;
        ?? r133;
        ?? r123;
        MfaResult mfaResult;
        if (continuation instanceof VerifyMfaPasskeyViewModel$startFido1v2Local$1) {
            verifyMfaPasskeyViewModel$startFido1v2Local$1 = (VerifyMfaPasskeyViewModel$startFido1v2Local$1) continuation;
            int i = verifyMfaPasskeyViewModel$startFido1v2Local$1.label;
            r4 = -2147483648;
            r5 = i & Integer.MIN_VALUE;
            if (r5 != 0) {
                verifyMfaPasskeyViewModel$startFido1v2Local$1.label = i - Integer.MIN_VALUE;
            } else {
                verifyMfaPasskeyViewModel$startFido1v2Local$1 = new VerifyMfaPasskeyViewModel$startFido1v2Local$1(this, continuation);
            }
        }
        Object objAEQbTJ = verifyMfaPasskeyViewModel$startFido1v2Local$1.result;
        Object objCopydefault3 = C56442yFn.copydefault();
        ?? r32 = verifyMfaPasskeyViewModel$startFido1v2Local$1.label;
        try {
            try {
            } catch (OkxPasskeyException e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            r6 = r5;
        }
        switch (r32) {
            case 0:
                C56391yDq.AEQbTJ(objAEQbTJ);
                try {
                    try {
                        this.OcIXYQ.copydefault();
                        interfaceC58880zSu = this.QOLQEE;
                        AuthenticationStartResponse.PublicKey publicKey = authenticationStartResponse.getPublicKey();
                        if (publicKey != null) {
                            try {
                                challenge = publicKey.getChallenge();
                            } catch (OkxPasskeyException e3) {
                                r13 = authenticationStartResponse;
                                r12 = z;
                                okxPasskeyException = e3;
                                r62 = this;
                                pUU.copydefault("VerifyMfaPasskeyViewModel", "getOkxPasskeyManager getAssertion OkxPasskeyException: " + okxPasskeyException + " " + okxPasskeyException.getMessage());
                                mutableSharedFlow2 = r62.gEmmrt;
                                boolKWHzl = C56443yFo.KWHzl(false);
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = r62;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = r13;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = okxPasskeyException;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = null;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = null;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = null;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = null;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = null;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0 = r12;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 6;
                                if (mutableSharedFlow2.emit(boolKWHzl, verifyMfaPasskeyViewModel$startFido1v2Local$1) != objCopydefault3) {
                                }
                            } catch (Exception e4) {
                                e = e4;
                                r6 = this;
                                pUU.copydefault("VerifyMfaPasskeyViewModel", "getOkxPasskeyManager getAssertion Exception: " + e + " " + e.getMessage());
                                mutableSharedFlow = r6.AYXKKw;
                                unit = Unit.INSTANCE;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = null;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = null;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = null;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = null;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = null;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = null;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = null;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = null;
                                verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 11;
                                if (mutableSharedFlow.emit(unit, verifyMfaPasskeyViewModel$startFido1v2Local$1) == objCopydefault3) {
                                    return objCopydefault3;
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            challenge = null;
                        }
                        if (challenge == null) {
                            challenge = "";
                        }
                        AuthenticationStartResponse.PublicKey publicKey2 = authenticationStartResponse.getPublicKey();
                        rpId = publicKey2 != null ? publicKey2.getRpId() : null;
                        if (rpId == null) {
                            rpId = "";
                        }
                        AuthenticationStartResponse.PublicKey publicKey3 = authenticationStartResponse.getPublicKey();
                        if (publicKey3 == null || (allowCredentials = publicKey3.getAllowCredentials()) == null) {
                            listAhwBna = yDY.AhwBna();
                        } else {
                            listAhwBna = new ArrayList<>(C56403yEb.AYXKKw(allowCredentials, 10));
                            Iterator it = allowCredentials.iterator();
                            while (it.hasNext()) {
                                listAhwBna.add(String.valueOf(((AuthenticationStartResponse.CredentialDescriptor) it.next()).getId()));
                            }
                        }
                        c5691aBJ = this.gHZMYf;
                        context = c5790aDC.getContext();
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = this;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = c5790aDC;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = mfaScenario;
                        authenticationStartResponse2 = authenticationStartResponse;
                    } catch (OkxPasskeyException e5) {
                        e = e5;
                        authenticationStartResponse2 = authenticationStartResponse;
                    }
                    try {
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = authenticationStartResponse2;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = interfaceC58880zSu;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = challenge;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = rpId;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = listAhwBna;
                        z2 = z;
                        try {
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0 = z2;
                            interfaceC58880zSu2 = interfaceC58880zSu;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 1;
                            objCopydefault = c5691aBJ.copydefault(context, verifyMfaPasskeyViewModel$startFido1v2Local$1);
                            break;
                        } catch (OkxPasskeyException e6) {
                            e = e6;
                            r62 = this;
                            okxPasskeyException = e;
                            boolean z5 = z2;
                            r13 = authenticationStartResponse2;
                            r12 = z5;
                            pUU.copydefault("VerifyMfaPasskeyViewModel", "getOkxPasskeyManager getAssertion OkxPasskeyException: " + okxPasskeyException + " " + okxPasskeyException.getMessage());
                            mutableSharedFlow2 = r62.gEmmrt;
                            boolKWHzl = C56443yFo.KWHzl(false);
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = r62;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = r13;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = okxPasskeyException;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = null;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = null;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = null;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = null;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = null;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0 = r12;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 6;
                            if (mutableSharedFlow2.emit(boolKWHzl, verifyMfaPasskeyViewModel$startFido1v2Local$1) != objCopydefault3) {
                            }
                        }
                    } catch (OkxPasskeyException e7) {
                        e = e7;
                        z2 = z;
                        r62 = this;
                        okxPasskeyException = e;
                        boolean z52 = z2;
                        r13 = authenticationStartResponse2;
                        r12 = z52;
                        pUU.copydefault("VerifyMfaPasskeyViewModel", "getOkxPasskeyManager getAssertion OkxPasskeyException: " + okxPasskeyException + " " + okxPasskeyException.getMessage());
                        mutableSharedFlow2 = r62.gEmmrt;
                        boolKWHzl = C56443yFo.KWHzl(false);
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = r62;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = r13;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = okxPasskeyException;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0 = r12;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 6;
                        if (mutableSharedFlow2.emit(boolKWHzl, verifyMfaPasskeyViewModel$startFido1v2Local$1) != objCopydefault3) {
                            return objCopydefault3;
                        }
                        r3 = r12;
                        r52 = r13;
                        r63 = r62;
                        if (okxPasskeyException instanceof OkxPasskeyException.KeyNotFound) {
                        }
                        return Unit.INSTANCE;
                    }
                    break;
                } catch (Exception e8) {
                    e = e8;
                    r6 = this;
                }
                if (objCopydefault == objCopydefault3) {
                    return objCopydefault3;
                }
                str = challenge;
                obj = objCopydefault;
                mfaScenario2 = mfaScenario;
                z3 = z2;
                authenticationStartResponse3 = authenticationStartResponse2;
                c5790aDC2 = c5790aDC;
                verifyMfaPasskeyViewModel = this;
                try {
                    String str3 = (String) obj;
                    String strKWHzl = C34703nhO.KWHzl(c5790aDC2.getContext());
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = verifyMfaPasskeyViewModel;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = mfaScenario2;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = authenticationStartResponse3;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0 = z3;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 2;
                    InterfaceC58880zSu interfaceC58880zSu3 = interfaceC58880zSu2;
                    verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel;
                    z4 = z3;
                    str2 = "";
                    try {
                        objCopydefault2 = interfaceC58880zSu3.copydefault(rpId, str, listAhwBna, str3, strKWHzl, null, verifyMfaPasskeyViewModel$startFido1v2Local$1);
                        break;
                    } catch (OkxPasskeyException e9) {
                        e = e9;
                        okxPasskeyException = e;
                        r62 = verifyMfaPasskeyViewModel2;
                        r12 = z4;
                        r13 = authenticationStartResponse3;
                        pUU.copydefault("VerifyMfaPasskeyViewModel", "getOkxPasskeyManager getAssertion OkxPasskeyException: " + okxPasskeyException + " " + okxPasskeyException.getMessage());
                        mutableSharedFlow2 = r62.gEmmrt;
                        boolKWHzl = C56443yFo.KWHzl(false);
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = r62;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = r13;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = okxPasskeyException;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0 = r12;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 6;
                        if (mutableSharedFlow2.emit(boolKWHzl, verifyMfaPasskeyViewModel$startFido1v2Local$1) != objCopydefault3) {
                        }
                    } catch (Exception e10) {
                        e = e10;
                        r6 = verifyMfaPasskeyViewModel2;
                        pUU.copydefault("VerifyMfaPasskeyViewModel", "getOkxPasskeyManager getAssertion Exception: " + e + " " + e.getMessage());
                        mutableSharedFlow = r6.AYXKKw;
                        unit = Unit.INSTANCE;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = null;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 11;
                        if (mutableSharedFlow.emit(unit, verifyMfaPasskeyViewModel$startFido1v2Local$1) == objCopydefault3) {
                        }
                        return Unit.INSTANCE;
                    }
                } catch (OkxPasskeyException e11) {
                    e = e11;
                    verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel;
                    z4 = z3;
                } catch (Exception e12) {
                    e = e12;
                    verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel;
                }
                if (objCopydefault2 != objCopydefault3) {
                    return objCopydefault3;
                }
                mfaScenario3 = mfaScenario2;
                objAEQbTJ = objCopydefault2;
                r9 = verifyMfaPasskeyViewModel2;
                r122 = z4;
                r132 = authenticationStartResponse3;
                try {
                    C60207zyQ c60207zyQ = (C60207zyQ) objAEQbTJ;
                    r9.OcIXYQ.KWHzl();
                    C5764aCd c5764aCd = r9.zsXlph;
                    value = r9.values.getValue();
                    if (value == null) {
                        value = str2;
                    }
                    String strAEQbTJ = C6617aSi.AEQbTJ(c60207zyQ.copydefault());
                    String string = PublicKeyCredentialType.PUBLIC_KEY.toString();
                    Intrinsics.checkNotNullExpressionValue(string, str2);
                    UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody = new UnlockTokenWithFidoRequestBody(string, strAEQbTJ, (String) null, MTPushConstants.PlatformNode.KEY_PLATFORM, new UnlockTokenWithFidoRequestBody.ResponseData(C6617aSi.AEQbTJ(c60207zyQ.EZpvd()), C6617aSi.AEQbTJ(c60207zyQ.AEQbTJ()), C6617aSi.AEQbTJ(c60207zyQ.KWHzl()), c60207zyQ.gEmmrt()), new UnlockTokenWithFidoRequestBody.ClientExtensionResultsData((UnlockTokenWithFidoRequestBody.CredPropsData) null, 1, (DefaultConstructorMarker) null), 4, (DefaultConstructorMarker) null);
                    SubdomainStrategy value2 = r9.uzCIH.getValue();
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = r9;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = r132;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0 = r122;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 3;
                    objAEQbTJ = c5764aCd.AEQbTJ(value, unlockTokenWithFidoRequestBody, value2, mfaScenario3, verifyMfaPasskeyViewModel$startFido1v2Local$1);
                    break;
                } catch (OkxPasskeyException e13) {
                    okxPasskeyException = e13;
                    r62 = r9;
                    r12 = r122;
                    r13 = r132;
                    pUU.copydefault("VerifyMfaPasskeyViewModel", "getOkxPasskeyManager getAssertion OkxPasskeyException: " + okxPasskeyException + " " + okxPasskeyException.getMessage());
                    mutableSharedFlow2 = r62.gEmmrt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = r62;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = r13;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = okxPasskeyException;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0 = r12;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 6;
                    if (mutableSharedFlow2.emit(boolKWHzl, verifyMfaPasskeyViewModel$startFido1v2Local$1) != objCopydefault3) {
                    }
                } catch (Exception e14) {
                    e = e14;
                    r6 = r9;
                    pUU.copydefault("VerifyMfaPasskeyViewModel", "getOkxPasskeyManager getAssertion Exception: " + e + " " + e.getMessage());
                    mutableSharedFlow = r6.AYXKKw;
                    unit = Unit.INSTANCE;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 11;
                    if (mutableSharedFlow.emit(unit, verifyMfaPasskeyViewModel$startFido1v2Local$1) == objCopydefault3) {
                    }
                }
                if (objAEQbTJ != objCopydefault3) {
                    return objCopydefault3;
                }
                r53 = r9;
                r123 = r122;
                r133 = r132;
                try {
                    mfaResult = (MfaResult) objAEQbTJ;
                    if (!(mfaResult instanceof MfaResult.Success)) {
                        MutableSharedFlow<MfaResponse> mutableSharedFlow3 = r53.valueOf;
                        MfaResponse mfaResponseKWHzl = ((MfaResult.Success) mfaResult).KWHzl();
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = r53;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = r133;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0 = r123;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 4;
                        if (mutableSharedFlow3.emit(mfaResponseKWHzl, verifyMfaPasskeyViewModel$startFido1v2Local$1) == objCopydefault3) {
                            return objCopydefault3;
                        }
                    } else {
                        if (!(mfaResult instanceof MfaResult.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MutableSharedFlow<MfaFailure> mutableSharedFlow4 = r53.djBIcL;
                        MfaFailure mfaFailureKWHzl = ((MfaResult.Failure) mfaResult).KWHzl();
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = r53;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = r133;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0 = r123;
                        verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 5;
                        if (mutableSharedFlow4.emit(mfaFailureKWHzl, verifyMfaPasskeyViewModel$startFido1v2Local$1) == objCopydefault3) {
                            return objCopydefault3;
                        }
                    }
                } catch (OkxPasskeyException e15) {
                    okxPasskeyException = e15;
                    r62 = r53;
                    r12 = r123;
                    r13 = r133;
                    pUU.copydefault("VerifyMfaPasskeyViewModel", "getOkxPasskeyManager getAssertion OkxPasskeyException: " + okxPasskeyException + " " + okxPasskeyException.getMessage());
                    mutableSharedFlow2 = r62.gEmmrt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = r62;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = r13;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = okxPasskeyException;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0 = r12;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 6;
                    if (mutableSharedFlow2.emit(boolKWHzl, verifyMfaPasskeyViewModel$startFido1v2Local$1) != objCopydefault3) {
                    }
                }
                return Unit.INSTANCE;
            case 1:
                boolean z6 = verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0;
                List<String> list = (List) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7;
                String str4 = (String) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6;
                String str5 = (String) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5;
                InterfaceC58880zSu interfaceC58880zSu4 = (InterfaceC58880zSu) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4;
                AuthenticationStartResponse authenticationStartResponse4 = (AuthenticationStartResponse) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3;
                MfaScenario mfaScenario4 = (MfaScenario) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2;
                c5790aDC2 = (C5790aDC) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1;
                VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel3 = (VerifyMfaPasskeyViewModel) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    interfaceC58880zSu2 = interfaceC58880zSu4;
                    obj = objAEQbTJ;
                    mfaScenario2 = mfaScenario4;
                    z3 = z6;
                    listAhwBna = list;
                    rpId = str4;
                    str = str5;
                    authenticationStartResponse3 = authenticationStartResponse4;
                    verifyMfaPasskeyViewModel = verifyMfaPasskeyViewModel3;
                    String str32 = (String) obj;
                    String strKWHzl2 = C34703nhO.KWHzl(c5790aDC2.getContext());
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = verifyMfaPasskeyViewModel;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = mfaScenario2;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = authenticationStartResponse3;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0 = z3;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 2;
                    InterfaceC58880zSu interfaceC58880zSu32 = interfaceC58880zSu2;
                    verifyMfaPasskeyViewModel2 = verifyMfaPasskeyViewModel;
                    z4 = z3;
                    str2 = "";
                    objCopydefault2 = interfaceC58880zSu32.copydefault(rpId, str, listAhwBna, str32, strKWHzl2, null, verifyMfaPasskeyViewModel$startFido1v2Local$1);
                    if (objCopydefault2 != objCopydefault3) {
                    }
                } catch (OkxPasskeyException e16) {
                    okxPasskeyException = e16;
                    r12 = z6;
                    r62 = verifyMfaPasskeyViewModel3;
                    r13 = authenticationStartResponse4;
                    pUU.copydefault("VerifyMfaPasskeyViewModel", "getOkxPasskeyManager getAssertion OkxPasskeyException: " + okxPasskeyException + " " + okxPasskeyException.getMessage());
                    mutableSharedFlow2 = r62.gEmmrt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = r62;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = r13;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = okxPasskeyException;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0 = r12;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 6;
                    if (mutableSharedFlow2.emit(boolKWHzl, verifyMfaPasskeyViewModel$startFido1v2Local$1) != objCopydefault3) {
                    }
                } catch (Exception e17) {
                    e = e17;
                    r6 = verifyMfaPasskeyViewModel3;
                    pUU.copydefault("VerifyMfaPasskeyViewModel", "getOkxPasskeyManager getAssertion Exception: " + e + " " + e.getMessage());
                    mutableSharedFlow = r6.AYXKKw;
                    unit = Unit.INSTANCE;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 11;
                    if (mutableSharedFlow.emit(unit, verifyMfaPasskeyViewModel$startFido1v2Local$1) == objCopydefault3) {
                    }
                    return Unit.INSTANCE;
                }
                break;
            case 2:
                r32 = verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0;
                r4 = (AuthenticationStartResponse) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2;
                MfaScenario mfaScenario5 = (MfaScenario) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1;
                r6 = (VerifyMfaPasskeyViewModel) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objAEQbTJ);
                    r122 = r32;
                    r132 = r4;
                    mfaScenario3 = mfaScenario5;
                    r9 = r6;
                    str2 = "";
                    C60207zyQ c60207zyQ2 = (C60207zyQ) objAEQbTJ;
                    r9.OcIXYQ.KWHzl();
                    C5764aCd c5764aCd2 = r9.zsXlph;
                    value = r9.values.getValue();
                    if (value == null) {
                    }
                    String strAEQbTJ2 = C6617aSi.AEQbTJ(c60207zyQ2.copydefault());
                    String string2 = PublicKeyCredentialType.PUBLIC_KEY.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, str2);
                    UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody2 = new UnlockTokenWithFidoRequestBody(string2, strAEQbTJ2, (String) null, MTPushConstants.PlatformNode.KEY_PLATFORM, new UnlockTokenWithFidoRequestBody.ResponseData(C6617aSi.AEQbTJ(c60207zyQ2.EZpvd()), C6617aSi.AEQbTJ(c60207zyQ2.AEQbTJ()), C6617aSi.AEQbTJ(c60207zyQ2.KWHzl()), c60207zyQ2.gEmmrt()), new UnlockTokenWithFidoRequestBody.ClientExtensionResultsData((UnlockTokenWithFidoRequestBody.CredPropsData) null, 1, (DefaultConstructorMarker) null), 4, (DefaultConstructorMarker) null);
                    SubdomainStrategy value22 = r9.uzCIH.getValue();
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = r9;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = r132;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0 = r122;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 3;
                    objAEQbTJ = c5764aCd2.AEQbTJ(value, unlockTokenWithFidoRequestBody2, value22, mfaScenario3, verifyMfaPasskeyViewModel$startFido1v2Local$1);
                    if (objAEQbTJ != objCopydefault3) {
                    }
                } catch (OkxPasskeyException e18) {
                    e = e18;
                    r5 = r6;
                    r12 = r32;
                    r13 = r4;
                    r62 = r5;
                    okxPasskeyException = e;
                    pUU.copydefault("VerifyMfaPasskeyViewModel", "getOkxPasskeyManager getAssertion OkxPasskeyException: " + okxPasskeyException + " " + okxPasskeyException.getMessage());
                    mutableSharedFlow2 = r62.gEmmrt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = r62;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = r13;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = okxPasskeyException;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0 = r12;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 6;
                    if (mutableSharedFlow2.emit(boolKWHzl, verifyMfaPasskeyViewModel$startFido1v2Local$1) != objCopydefault3) {
                    }
                } catch (Exception e19) {
                    e = e19;
                    pUU.copydefault("VerifyMfaPasskeyViewModel", "getOkxPasskeyManager getAssertion Exception: " + e + " " + e.getMessage());
                    mutableSharedFlow = r6.AYXKKw;
                    unit = Unit.INSTANCE;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$3 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$4 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$5 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$6 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$7 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 11;
                    if (mutableSharedFlow.emit(unit, verifyMfaPasskeyViewModel$startFido1v2Local$1) == objCopydefault3) {
                    }
                    return Unit.INSTANCE;
                }
                break;
            case 3:
                boolean z7 = verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0;
                AuthenticationStartResponse authenticationStartResponse5 = (AuthenticationStartResponse) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1;
                VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel4 = (VerifyMfaPasskeyViewModel) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                r123 = z7;
                r133 = authenticationStartResponse5;
                r53 = verifyMfaPasskeyViewModel4;
                mfaResult = (MfaResult) objAEQbTJ;
                if (!(mfaResult instanceof MfaResult.Success)) {
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
                boolean z8 = verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                return Unit.INSTANCE;
            case 6:
                boolean z9 = verifyMfaPasskeyViewModel$startFido1v2Local$1.Z$0;
                okxPasskeyException = (OkxPasskeyException) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2;
                AuthenticationStartResponse authenticationStartResponse6 = (AuthenticationStartResponse) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1;
                VerifyMfaPasskeyViewModel verifyMfaPasskeyViewModel5 = (VerifyMfaPasskeyViewModel) verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                r3 = z9;
                r52 = authenticationStartResponse6;
                r63 = verifyMfaPasskeyViewModel5;
                if (okxPasskeyException instanceof OkxPasskeyException.KeyNotFound) {
                    if (!(okxPasskeyException instanceof OkxPasskeyException.UserCancelled)) {
                        if (okxPasskeyException instanceof OkxPasskeyException.NoDevicePasscode) {
                            MutableSharedFlow<Unit> mutableSharedFlow5 = r63.AYXKKw;
                            Unit unit2 = Unit.INSTANCE;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = null;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = null;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = null;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 9;
                            if (mutableSharedFlow5.emit(unit2, verifyMfaPasskeyViewModel$startFido1v2Local$1) == objCopydefault3) {
                                return objCopydefault3;
                            }
                        } else {
                            MutableSharedFlow<Unit> mutableSharedFlow6 = r63.AYXKKw;
                            Unit unit3 = Unit.INSTANCE;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = null;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = null;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = null;
                            verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 10;
                            if (mutableSharedFlow6.emit(unit3, verifyMfaPasskeyViewModel$startFido1v2Local$1) == objCopydefault3) {
                                return objCopydefault3;
                            }
                        }
                    }
                } else if (r3 != 0) {
                    FlowCollector flowCollector = r63.ejfBZ;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 7;
                    if (flowCollector.emit(r52, verifyMfaPasskeyViewModel$startFido1v2Local$1) == objCopydefault3) {
                        return objCopydefault3;
                    }
                } else {
                    MutableSharedFlow<Unit> mutableSharedFlow7 = r63.AYXKKw;
                    Unit unit4 = Unit.INSTANCE;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$0 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$1 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.L$2 = null;
                    verifyMfaPasskeyViewModel$startFido1v2Local$1.label = 8;
                    if (mutableSharedFlow7.emit(unit4, verifyMfaPasskeyViewModel$startFido1v2Local$1) == objCopydefault3) {
                        return objCopydefault3;
                    }
                }
                return Unit.INSTANCE;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                C56391yDq.AEQbTJ(objAEQbTJ);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object KWHzl(AuthenticationStartResponse authenticationStartResponse, Continuation<? super Unit> continuation) {
        Object objEmit = this.ejfBZ.emit(authenticationStartResponse, continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    public final Job getNewProxyInstance() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaPasskeyViewModel$preparePasskeyNotCompatibleBottomSheet$1(this, null), 3, null);
    }

    public final Job copydefault() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaPasskeyViewModel$clickUnableToVerify$1(this, null), 3, null);
    }

    public final Job EZpvd(@NotNull PasskeySdkResult passkeySdkResult, @NotNull C5790aDC c5790aDC, @NotNull MfaScenario mfaScenario) {
        Intrinsics.checkNotNullParameter(passkeySdkResult, "");
        Intrinsics.checkNotNullParameter(c5790aDC, "");
        Intrinsics.checkNotNullParameter(mfaScenario, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaPasskeyViewModel$postVerify$1(passkeySdkResult, this, mfaScenario, c5790aDC, null), 3, null);
    }

    public final Job copydefault(@NotNull AuthenticationStartResponse authenticationStartResponse, @NotNull C5790aDC c5790aDC, String str, @NotNull MfaScenario mfaScenario) {
        Intrinsics.checkNotNullParameter(authenticationStartResponse, "");
        Intrinsics.checkNotNullParameter(c5790aDC, "");
        Intrinsics.checkNotNullParameter(mfaScenario, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaPasskeyViewModel$fido2FallbackToFido1IfPossible$1(authenticationStartResponse, this, c5790aDC, mfaScenario, str, null), 3, null);
    }

    public final Job OLrzqt(@NotNull OTP otp, @NotNull MfaScenario mfaScenario) {
        Intrinsics.checkNotNullParameter(otp, "");
        Intrinsics.checkNotNullParameter(mfaScenario, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaPasskeyViewModel$switchStep$1(this, otp, mfaScenario, null), 3, null);
    }

    public final Job OLrzqt(@NotNull C5790aDC c5790aDC, @NotNull MfaScenario mfaScenario, @NotNull String str) {
        Intrinsics.checkNotNullParameter(c5790aDC, "");
        Intrinsics.checkNotNullParameter(mfaScenario, "");
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaPasskeyViewModel$fido1v2ErrorFallbackToFido1v1$1(this, c5790aDC, mfaScenario, str, null), 3, null);
    }

    public final Job EZpvd(@NotNull MfaScenario mfaScenario) {
        Intrinsics.checkNotNullParameter(mfaScenario, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new VerifyMfaPasskeyViewModel$onCrossDeviceVerificationFinished$1(this, mfaScenario, null), 3, null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.ui.passkey.VerifyMfaPasskeyViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}

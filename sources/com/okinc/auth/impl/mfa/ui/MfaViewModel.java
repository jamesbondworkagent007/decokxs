package com.okinc.auth.impl.mfa.ui;

import android.content.Context;
import android.os.CountDownTimer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.auth.api.service.MfaState;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaNextStep;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaScenario;
import com.okinc.auth.impl.mfa.model.OTP;
import com.okinc.auth.impl.mfa.model.SwitchVerificationMethodRequest;
import com.okinc.auth.impl.mfa.ui.MfaViewModel;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.search.bean.SearchResultContentPo;
import com.okinc.unify_trade.biz.BotWebHook;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.AbstractC33073mpa;
import o.C32866mlf;
import o.C32868mlh;
import o.C33129mqd;
import o.C56390yDp;
import o.C5773aCm;
import o.C58893zTh;
import o.C5945aFz;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class MfaViewModel extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final MutableSharedFlow<Unit> AEQbTJ;
    public final MutableSharedFlow<MfaState> AYXKKw;
    public final MutableSharedFlow<OTP> AhwBna;
    public final MutableSharedFlow<SwitchVerificationMethodRequest> AkhnZx;
    public final SharedFlow<MfaState> AuCTel;
    public final SavedStateHandle AuCTelauCTel;
    public final SharedFlow<SwitchVerificationMethodRequest> AubY;
    public final SubdomainStrategy AwvSrB;
    public final C5773aCm AxsJAY;
    public final MutableLiveData<Triple<Integer, Integer, Boolean>> DbNXlk;
    public int EZpvd;
    public final MutableLiveData<Long> KWHzl;
    public final MutableSharedFlow<Unit> OLrzqt;
    public final MutableSharedFlow<Boolean> djBIcL;
    public CountDownTimer ejfBZ;
    public final SharedFlow<Unit> fARcdN;
    public final SharedFlow<Unit> fIwbmz;
    public final C5945aFz fJNWhG;
    public final MutableLiveData<String> fetchVPNInfo;
    public final MutableLiveData<MfaResponse> gEmmrt;
    public final SharedFlow<Unit> gHZMYf;
    public final C58893zTh getFieldNames;
    public final SharedFlow<Boolean> getNewProxyInstance;
    public final LiveData<MfaResponse> hDKMBd;
    public final MutableSharedFlow<Unit> isConnected;
    public final MfaScenario iwGUEr;
    public final SharedFlow<MfaFailure> uzCIH;
    public final MutableSharedFlow<MfaFailure> valueOf;
    public final MutableSharedFlow<Unit> values;
    public final LiveData<String> wlaJM;
    public final SharedFlow<OTP> zLjUOn;
    public final SharedFlow<Unit> zsXlph;
    public final LiveData<Triple<Integer, Integer, Boolean>> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AEQbTJ() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.EZpvd > 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<MfaState> AhwBna() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AkhnZx() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MfaScenario DbNXlk() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> EZpvd() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Long> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> djBIcL() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> ejfBZ() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Triple<Integer, Integer, Boolean>> fARcdN() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubdomainStrategy fIwbmz() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<OTP> fetchVPNInfo() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<MfaFailure> gEmmrt() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<SwitchVerificationMethodRequest> isConnected() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<MfaResponse> valueOf() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<String> values() {
        return this.wlaJM;
    }

    @yCM
    public MfaViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C5773aCm c5773aCm, @NotNull C5945aFz c5945aFz, @NotNull C58893zTh c58893zTh) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c5773aCm, "");
        Intrinsics.checkNotNullParameter(c5945aFz, "");
        Intrinsics.checkNotNullParameter(c58893zTh, "");
        this.AuCTelauCTel = savedStateHandle;
        this.AxsJAY = c5773aCm;
        this.fJNWhG = c5945aFz;
        this.getFieldNames = c58893zTh;
        this.AwvSrB = (SubdomainStrategy) savedStateHandle.get("KEY_SUBDOMAIN_STRATEGY");
        MfaScenario mfaScenario = (MfaScenario) savedStateHandle.get("KEY_MFA_SCENARIO");
        this.iwGUEr = mfaScenario == null ? MfaScenario.IsPostLogin : mfaScenario;
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.djBIcL = mutableSharedFlowMutableSharedFlow$default;
        this.getNewProxyInstance = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableLiveData<MfaResponse> mutableLiveData = new MutableLiveData<>();
        this.gEmmrt = mutableLiveData;
        this.hDKMBd = mutableLiveData;
        MutableLiveData<Triple<Integer, Integer, Boolean>> mutableLiveData2 = new MutableLiveData<>();
        this.DbNXlk = mutableLiveData2;
        this.zuBGHE = mutableLiveData2;
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.isConnected = mutableSharedFlowMutableSharedFlow$default2;
        this.gHZMYf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<MfaFailure> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default3;
        this.uzCIH = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<MfaState> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default4;
        this.AuCTel = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.values = mutableSharedFlowMutableSharedFlow$default5;
        this.zsXlph = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<SwitchVerificationMethodRequest> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AkhnZx = mutableSharedFlowMutableSharedFlow$default6;
        this.AubY = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<OTP> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default7;
        this.zLjUOn = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.fetchVPNInfo = mutableLiveData3;
        this.wlaJM = mutableLiveData3;
        this.KWHzl = new MutableLiveData<>();
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default8;
        this.fIwbmz = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default8);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default9 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default9;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default9);
    }

    public final boolean hDKMBd() {
        MfaResponse value = this.hDKMBd.getValue();
        return Intrinsics.EZpvd((Object) (value != null ? value.fetchVPNInfo() : null), (Object) "SYNC_OKX_PASSKEY");
    }

    public static final class ActionBar extends CountDownTimer {
        public ActionBar(long j) {
            super(j, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            MfaViewModel.this.KWHzl.postValue(Long.valueOf(j / 1000));
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            MfaViewModel.this.KWHzl.postValue(0L);
        }
    }

    public final CountDownTimer KWHzl(long j) {
        return new ActionBar(j * ((long) 1000));
    }

    public static /* synthetic */ void startTimer$default(MfaViewModel mfaViewModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 60;
        }
        mfaViewModel.EZpvd(j);
    }

    public final void EZpvd(long j) {
        QVAiDq();
        CountDownTimer countDownTimerKWHzl = KWHzl(j);
        this.ejfBZ = countDownTimerKWHzl;
        if (countDownTimerKWHzl != null) {
            countDownTimerKWHzl.start();
        }
    }

    private final void QVAiDq() {
        CountDownTimer countDownTimer = this.ejfBZ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final Job EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$start$1(this, str, null), 3, null);
    }

    public final Job copydefault(@NotNull MfaResponse mfaResponse) {
        Intrinsics.checkNotNullParameter(mfaResponse, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$nextStepAction$1(this, mfaResponse, null), 3, null);
    }

    public final Job uzCIH() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$setupStepperUi$1(this, null), 3, null);
    }

    public final Job iwGUEr() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$startResetMfaAction$1(this, null), 3, null);
    }

    public final Job copydefault() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$finishWithCloseState$1(this, null), 3, null);
    }

    public final Job EZpvd(@NotNull MfaFailure mfaFailure) {
        Intrinsics.checkNotNullParameter(mfaFailure, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$handleMfaFailure$1(this, mfaFailure, null), 3, null);
    }

    public final boolean getFieldNames() {
        MfaResponse value = this.hDKMBd.getValue();
        if (value == null) {
            return false;
        }
        List<String> listOLrzqt = value.OLrzqt();
        boolean z = listOLrzqt != null && listOLrzqt.isEmpty();
        Boolean boolCopydefault = value.copydefault();
        return fJNWhG() || !z || (boolCopydefault != null ? boolCopydefault.booleanValue() : false);
    }

    public final boolean fJNWhG() {
        MfaResponse value = this.hDKMBd.getValue();
        if (value == null) {
            return false;
        }
        List<String> listOLrzqt = value.OLrzqt();
        boolean z = listOLrzqt != null && listOLrzqt.isEmpty();
        boolean zEZpvd = Intrinsics.EZpvd((Object) value.djBIcL(), (Object) MfaNextStep.PASSKEY.getKey());
        Boolean boolEZpvd = value.EZpvd();
        return z && (zEZpvd && (boolEZpvd != null ? boolEZpvd.booleanValue() : false));
    }

    public final Job copydefault(OTP otp) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$showUnableVerifyMfaMethodBottomSheet$1(this, otp, null), 3, null);
    }

    public final Job wlaJM() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$startResetPasskey$1(this, null), 3, null);
    }

    public final Job AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$postUnableVerifyMfaMethodBottomSheet$1(str, this, null), 3, null);
    }

    public final Job getNewProxyInstance() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$passkeyNotCompatible$1(this, null), 3, null);
    }

    public static /* synthetic */ Job tryUpgrade$default(MfaViewModel mfaViewModel, Context context, RegistrationStartResponse registrationStartResponse, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return mfaViewModel.AEQbTJ(context, registrationStartResponse, z);
    }

    public final Job AEQbTJ(@NotNull Context context, @NotNull RegistrationStartResponse registrationStartResponse, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(registrationStartResponse, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$tryUpgrade$1(this, context, registrationStartResponse, z, null), 3, null);
    }

    public final Job OcIXYQ() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$trackViewOfGeneralDialog$1(this, null), 3, null);
    }

    public final void zsXlph() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("VerificationCenter_ExceptionReminder_Popup_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aCF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MfaViewModel.gEmmrt(this.AEQbTJ, (EventParamsList) obj);
            }
        });
    }

    public static final Unit gEmmrt(MfaViewModel mfaViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("business", mfaViewModel.OLrzqt().getFirst(), false);
        eventParamsList.put(BotWebHook.KEY_ACTION, mfaViewModel.OLrzqt().getSecond(), false);
        eventParamsList.put("unexception_confirm", SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_OKX, false);
        return Unit.INSTANCE;
    }

    public final void ORxRYg() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("VerificationCenter_TimeoutReminder_Popup_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aCG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MfaViewModel.fetchVPNInfo(this.AEQbTJ, (EventParamsList) obj);
            }
        });
    }

    public static final Unit fetchVPNInfo(MfaViewModel mfaViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("business", mfaViewModel.OLrzqt().getFirst(), false);
        eventParamsList.put(BotWebHook.KEY_ACTION, mfaViewModel.OLrzqt().getSecond(), false);
        return Unit.INSTANCE;
    }

    public final void AubY() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("VerificationCenter_TimeoutReminder_Popup_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aCA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MfaViewModel.valueOf(this.AEQbTJ, (EventParamsList) obj);
            }
        });
    }

    public static final Unit valueOf(MfaViewModel mfaViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("business", mfaViewModel.OLrzqt().getFirst(), false);
        eventParamsList.put(BotWebHook.KEY_ACTION, mfaViewModel.OLrzqt().getSecond(), false);
        eventParamsList.put("timeout_confirm", SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_OKX, false);
        return Unit.INSTANCE;
    }

    public final void QOLQEE() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("VerificationCenter_MaxoutReminder_Popup_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aCB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MfaViewModel.djBIcL(this.AEQbTJ, (EventParamsList) obj);
            }
        });
    }

    public static final Unit djBIcL(MfaViewModel mfaViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("business", mfaViewModel.OLrzqt().getFirst(), false);
        eventParamsList.put(BotWebHook.KEY_ACTION, mfaViewModel.OLrzqt().getSecond(), false);
        return Unit.INSTANCE;
    }

    public final void zLjUOn() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("VerificationCenter_MaxoutReminder_Popup_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aCx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MfaViewModel.AYXKKw(this.OLrzqt, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AYXKKw(MfaViewModel mfaViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("business", mfaViewModel.OLrzqt().getFirst(), false);
        eventParamsList.put(BotWebHook.KEY_ACTION, mfaViewModel.OLrzqt().getSecond(), false);
        eventParamsList.put("maxout_confirm", SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_OKX, false);
        return Unit.INSTANCE;
    }

    public final void RJOkX() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("VerificationCenter_SwitchToOtherMethod_Popup_View", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aCy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MfaViewModel.DbNXlk(this.KWHzl, (EventParamsList) obj);
            }
        });
    }

    public static final Unit DbNXlk(MfaViewModel mfaViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("business", mfaViewModel.OLrzqt().getFirst(), false);
        eventParamsList.put(BotWebHook.KEY_ACTION, mfaViewModel.OLrzqt().getSecond(), false);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final String str, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("VerificationCenter_SwitchToOtherMethod_Popup_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aCz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MfaViewModel.OLrzqt(this.EZpvd, str, z, z2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(MfaViewModel mfaViewModel, String str, boolean z, boolean z2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("business", mfaViewModel.OLrzqt().getFirst(), false);
        eventParamsList.put(BotWebHook.KEY_ACTION, mfaViewModel.OLrzqt().getSecond(), false);
        eventParamsList.put("other_methods_verify", str, false);
        eventParamsList.put("is_reset_2fa", z ? "yes" : "no", false);
        eventParamsList.put("is_reset_passkey", z2 ? "yes" : "no", false);
        return Unit.INSTANCE;
    }

    public final Job QUSxYX() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$trackViewOfVerifyPasskey$1(this, null), 3, null);
    }

    public final Job QKVWgx() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$trackClickVerifyOfVerifyPasskey$1(this, null), 3, null);
    }

    public final Job AxsJAY() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$trackClickUnableToVerifyOfVerifyPasskey$1(this, null), 3, null);
    }

    public final Job QfsBiF() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$trackViewOfVerifyPassword$1(this, null), 3, null);
    }

    public final Job zuBGHE() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$trackClickConfirmOfVerifyPassword$1(this, null), 3, null);
    }

    public final Job DTwDnp() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$trackClickUnableToVerifyOfVerifyPassword$1(this, null), 3, null);
    }

    public final Job QbewEr() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$trackViewOfVerifyOtp$1(this, null), 3, null);
    }

    public final Job AuCTelauCTel() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$trackClickCloseButton$1(this, null), 3, null);
    }

    public final Job gHZMYf() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$trackClickResendOfVerifyOtp$1(this, null), 3, null);
    }

    public final Job AwvSrB() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$trackClickUnableOfVerifyOtp$1(this, null), 3, null);
    }

    public final Job sSMYrx() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MfaViewModel$trackClickConfirmOfVerifyOtp$1(this, null), 3, null);
    }

    public final Pair<String, String> AuCTel() {
        Integer numAYXKKw;
        Integer numIsConnected;
        MfaResponse value = this.hDKMBd.getValue();
        int iIntValue = 0;
        int iIntValue2 = (value == null || (numIsConnected = value.isConnected()) == null) ? 0 : numIsConnected.intValue();
        if (value != null && (numAYXKKw = value.AYXKKw()) != null) {
            iIntValue = numAYXKKw.intValue();
        }
        return C56390yDp.OLrzqt(C33129mqd.gEmmrt(Integer.valueOf(iIntValue2)), C33129mqd.gEmmrt(Integer.valueOf(iIntValue - 1)));
    }

    public final Pair<String, String> OLrzqt() {
        MfaResponse value = this.hDKMBd.getValue();
        String strKWHzl = value != null ? value.KWHzl() : null;
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        String strFetchVPNInfo = value != null ? value.fetchVPNInfo() : null;
        return C56390yDp.OLrzqt(strKWHzl, strFetchVPNInfo != null ? strFetchVPNInfo : "");
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        QVAiDq();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.ui.MfaViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}

package com.okinc.im.imui.messageV2.view.keyboard;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.core.util.SPUtils;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.imui.messageV2.model.StringResource;
import com.okinc.im.imui.messageV2.view.keyboard.KeyboardViewModel;
import com.okinc.im.usecase.ObserveKeyboardInputStateUseCase;
import com.okinc.im.usecase.message.SendStopAgentBotMessageUseCase;
import com.okinc.okimcore.feature.config.TypingIndicatorConfig;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.other.GroupUserSettingInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import com.okinc.okimcore.usecase.ObserveShowAgentProcessingFlow;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C32979mnm;
import o.C32989mnw;
import o.C33129mqd;
import o.C33729nDr;
import o.C34703nhO;
import o.C35239nra;
import o.C35808oEl;
import o.C35810oEn;
import o.C35814oEr;
import o.C35863oGm;
import o.C36560odK;
import o.C36561odL;
import o.C36595odt;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC35277nsL;
import o.InterfaceC36569odT;
import o.InterfaceC44294sKm;
import o.oCI;
import o.oCN;
import o.oCP;
import o.oCU;
import o.oDG;
import o.oED;
import o.pUU;
import o.sDN;
import o.sKH;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KeyboardViewModel extends ViewModel {
    public final MutableLiveData<C32989mnw<Unit>> AYXKKw;
    public final MutableStateFlow<ObserveShowAgentProcessingFlow.AgentProcessingState> AhwBna;
    public final LiveData<C32989mnw<Unit>> AkhnZx;
    public final oCN AuCTel;
    public final LiveData<ObserveKeyboardInputStateUseCase.KeyboardInputState> AuCTelauCTel;
    public long AubY;
    public final ObserveKeyboardInputStateUseCase AwvSrB;
    public final C35863oGm AxsJAY;
    public IMPageType DTwDnp;
    public final MutableLiveData<C32989mnw<String>> DbNXlk;
    public final MutableLiveData<C32989mnw<String>> EZpvd;
    public final MutableLiveData<C32989mnw<GeneralAction>> KWHzl;
    public final MutableLiveData<C32989mnw<Unit>> OLrzqt;
    public final C36561odL ORxRYg;
    public final LiveData<RelationInfo> OcIXYQ;
    public final oCU QKVWgx;
    public Job QOLQEE;
    public final LiveData<C32989mnw<String>> QUSxYX;
    public final SendStopAgentBotMessageUseCase QVAiDq;
    public final LiveData<C32989mnw<StringResource>> QfsBiF;
    public final oED RJOkX;
    public final MutableLiveData<C32989mnw<StringResource>> copydefault;
    public final MutableLiveData<ObserveKeyboardInputStateUseCase.KeyboardInputState> djBIcL;
    public final C35810oEn ejfBZ;
    public final LiveData<C32989mnw<GeneralAction>> fARcdN;
    public final C35808oEl fIwbmz;
    public final LiveData<C32989mnw<StringResource>> fJNWhG;
    public final LiveData<OKConversation> fetchVPNInfo;
    public final MutableLiveData<C32989mnw<StringResource>> gEmmrt;
    public final oDG gHZMYf;
    public final StateFlow<ObserveShowAgentProcessingFlow.AgentProcessingState> getFieldNames;
    public final LiveData<C32989mnw<Unit>> getNewProxyInstance;
    public final oCP hDKMBd;
    public final MutableLiveData<CharSequence> isConnected;
    public final C35814oEr iwGUEr;
    public final ObserveShowAgentProcessingFlow sSMYrx;
    public final LiveData<GroupInfo> uzCIH;
    public final MutableLiveData<C32989mnw<C36560odK>> valueOf;
    public final MutableLiveData<String> values;
    public final InterfaceC44294sKm wlaJM;
    public final sKH zLjUOn;
    public final LiveData<C32989mnw<C36560odK>> zsXlph;
    public final oCI zuBGHE;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.PRIVATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OKConversationType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OKConversationType.CHATROOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> AEQbTJ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<ObserveKeyboardInputStateUseCase.KeyboardInputState> AYXKKw() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<GroupInfo> AhwBna() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> DbNXlk() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<String>> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<StringResource>> OLrzqt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<OKConversation> copydefault() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(IMPageType iMPageType) {
        if (iMPageType != null) {
            this.DTwDnp = iMPageType;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<GeneralAction>> djBIcL() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<RelationInfo> fetchVPNInfo() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<C36560odK>> gEmmrt() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<StringResource>> isConnected() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Unit>> valueOf() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ObserveShowAgentProcessingFlow.AgentProcessingState> values() {
        return this.getFieldNames;
    }

    @yCM
    public KeyboardViewModel(@NotNull oCI oci, @NotNull oCP ocp, @NotNull C35814oEr c35814oEr, @NotNull C35810oEn c35810oEn, @NotNull oDG odg, @NotNull C35863oGm c35863oGm, @NotNull C35808oEl c35808oEl, @NotNull ObserveKeyboardInputStateUseCase observeKeyboardInputStateUseCase, @NotNull sKH skh, @NotNull InterfaceC36569odT interfaceC36569odT, @NotNull oCU ocu, @NotNull oCN ocn, @NotNull SendStopAgentBotMessageUseCase sendStopAgentBotMessageUseCase, @NotNull oED oed, @NotNull ObserveShowAgentProcessingFlow observeShowAgentProcessingFlow) {
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(ocp, "");
        Intrinsics.checkNotNullParameter(c35814oEr, "");
        Intrinsics.checkNotNullParameter(c35810oEn, "");
        Intrinsics.checkNotNullParameter(odg, "");
        Intrinsics.checkNotNullParameter(c35863oGm, "");
        Intrinsics.checkNotNullParameter(c35808oEl, "");
        Intrinsics.checkNotNullParameter(observeKeyboardInputStateUseCase, "");
        Intrinsics.checkNotNullParameter(skh, "");
        Intrinsics.checkNotNullParameter(interfaceC36569odT, "");
        Intrinsics.checkNotNullParameter(ocu, "");
        Intrinsics.checkNotNullParameter(ocn, "");
        Intrinsics.checkNotNullParameter(sendStopAgentBotMessageUseCase, "");
        Intrinsics.checkNotNullParameter(oed, "");
        Intrinsics.checkNotNullParameter(observeShowAgentProcessingFlow, "");
        this.zuBGHE = oci;
        this.hDKMBd = ocp;
        this.iwGUEr = c35814oEr;
        this.ejfBZ = c35810oEn;
        this.gHZMYf = odg;
        this.AxsJAY = c35863oGm;
        this.fIwbmz = c35808oEl;
        this.AwvSrB = observeKeyboardInputStateUseCase;
        this.zLjUOn = skh;
        this.QKVWgx = ocu;
        this.AuCTel = ocn;
        this.QVAiDq = sendStopAgentBotMessageUseCase;
        this.RJOkX = oed;
        this.sSMYrx = observeShowAgentProcessingFlow;
        MutableLiveData<C32989mnw<GeneralAction>> mutableLiveData = new MutableLiveData<>();
        this.KWHzl = mutableLiveData;
        this.fARcdN = mutableLiveData;
        this.DTwDnp = IMPageType.NORMAL_IM;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>(null);
        this.values = mutableLiveData2;
        this.isConnected = new MutableLiveData<>(null);
        this.fetchVPNInfo = Transformations.switchMap(mutableLiveData2, new Function1() { // from class: o.okc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KeyboardViewModel.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        });
        this.uzCIH = Transformations.switchMap(mutableLiveData2, new Function1() { // from class: o.okb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KeyboardViewModel.AYXKKw(this.EZpvd, (java.lang.String) obj);
            }
        });
        this.OcIXYQ = Transformations.switchMap(mutableLiveData2, new Function1() { // from class: o.ojZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KeyboardViewModel.djBIcL(this.OLrzqt, (java.lang.String) obj);
            }
        });
        MutableLiveData<C32989mnw<C36560odK>> mutableLiveData3 = new MutableLiveData<>();
        this.valueOf = mutableLiveData3;
        this.zsXlph = mutableLiveData3;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData4 = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData4;
        this.AkhnZx = mutableLiveData4;
        MutableLiveData<C32989mnw<StringResource>> mutableLiveData5 = new MutableLiveData<>();
        this.gEmmrt = mutableLiveData5;
        this.QfsBiF = mutableLiveData5;
        MutableLiveData<C32989mnw<StringResource>> mutableLiveData6 = new MutableLiveData<>();
        this.copydefault = mutableLiveData6;
        this.fJNWhG = mutableLiveData6;
        MutableLiveData<C32989mnw<String>> mutableLiveData7 = new MutableLiveData<>();
        this.DbNXlk = mutableLiveData7;
        this.QUSxYX = mutableLiveData7;
        this.EZpvd = new MutableLiveData<>();
        MutableLiveData<ObserveKeyboardInputStateUseCase.KeyboardInputState> mutableLiveData8 = new MutableLiveData<>(ObserveKeyboardInputStateUseCase.KeyboardInputState.Unknown);
        this.djBIcL = mutableLiveData8;
        this.AuCTelauCTel = mutableLiveData8;
        MutableLiveData<C32989mnw<Unit>> mutableLiveData9 = new MutableLiveData<>();
        this.AYXKKw = mutableLiveData9;
        this.getNewProxyInstance = mutableLiveData9;
        this.ORxRYg = interfaceC36569odT.copydefault(300L);
        MutableStateFlow<ObserveShowAgentProcessingFlow.AgentProcessingState> MutableStateFlow = StateFlowKt.MutableStateFlow(ObserveShowAgentProcessingFlow.AgentProcessingState.IDLE);
        this.AhwBna = MutableStateFlow;
        this.getFieldNames = MutableStateFlow;
        this.wlaJM = new Application();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.view.keyboard.KeyboardViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final LiveData copydefault(KeyboardViewModel keyboardViewModel, String str) {
        return FlowLiveDataConversions.asLiveData$default(keyboardViewModel.zuBGHE.KWHzl(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final LiveData AYXKKw(KeyboardViewModel keyboardViewModel, String str) {
        return FlowLiveDataConversions.asLiveData$default(keyboardViewModel.gHZMYf.AEQbTJ(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final LiveData djBIcL(KeyboardViewModel keyboardViewModel, String str) {
        return FlowLiveDataConversions.asLiveData$default(keyboardViewModel.AxsJAY.EZpvd(str), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    public static final class Application implements InterfaceC44294sKm {
        public Application() {
        }

        @Override // o.InterfaceC44294sKm
        public boolean KWHzl(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            OKConversation value = KeyboardViewModel.this.copydefault().getValue();
            RelationInfo value2 = KeyboardViewModel.this.fetchVPNInfo().getValue();
            if (value == null) {
                return false;
            }
            C35239nra c35239nra = new C35239nra(oKMessage, value, value2);
            InterfaceC35277nsL interfaceC35277nsLKWHzl = C36595odt.EZpvd.KWHzl(KeyboardViewModel.this.DTwDnp);
            if (interfaceC35277nsLKWHzl == null) {
                String strEZpvd = KeyboardViewModel.this.EZpvd(c35239nra);
                if (strEZpvd != null) {
                    KeyboardViewModel.this.OLrzqt(strEZpvd);
                }
                return strEZpvd != null;
            }
            return interfaceC35277nsLKWHzl.copydefault(c35239nra);
        }
    }

    public final void OLrzqt(String str) {
        String displayName$default;
        if (Intrinsics.EZpvd((Object) str, (Object) "IMContactBlockedSendInterceptor")) {
            RelationInfo value = this.OcIXYQ.getValue();
            if (value == null || (displayName$default = C44157sFk.getDisplayName$default(value, null, 1, null)) == null) {
                displayName$default = "";
            }
            this.EZpvd.postValue(new C32989mnw<>(displayName$default));
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        AkhnZx();
        this.zLjUOn.AEQbTJ(this.wlaJM);
        this.ORxRYg.OLrzqt();
    }

    public final void AkhnZx() {
        String value = this.values.getValue();
        CharSequence value2 = this.isConnected.getValue();
        String string = value2 != null ? value2.toString() : null;
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KeyboardViewModel$maybeClearConversationReferenceDraftSequence$1(this, value, string, null), 3, null);
        }
    }

    public final String EZpvd(C35239nra c35239nra) {
        for (Map.Entry<String, InterfaceC35277nsL> entry : C36595odt.EZpvd.OLrzqt().entrySet()) {
            if (entry.getValue().copydefault(c35239nra)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public final void copydefault(String str, String str2, OKConversationType oKConversationType) {
        this.values.setValue(str);
        this.zLjUOn.EZpvd(this.wlaJM);
        if (C33129mqd.OLrzqt((CharSequence) str2)) {
            this.gEmmrt.setValue(new C32989mnw<>(new StringResource.Raw(str2)));
            this.AYXKKw.setValue(new C32989mnw<>(Unit.INSTANCE));
        } else {
            KWHzl(str);
        }
        copydefault(str);
        EZpvd(str);
    }

    public final void EZpvd(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KeyboardViewModel$observeAgentProcessingState$1(str, this, null), 3, null);
    }

    public final void copydefault(String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), sDN.copydefault.copydefault(), null, new KeyboardViewModel$observeKeyboardInputState$1(this, str, null), 2, null);
    }

    public final void KWHzl(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KeyboardViewModel$restoreDraftMessage$1(str, this, null), 3, null);
    }

    public final void OLrzqt(CharSequence charSequence) {
        this.isConnected.setValue(charSequence);
    }

    public final void KWHzl(CharSequence charSequence, @NotNull TypingIndicatorConfig typingIndicatorConfig) {
        Intrinsics.checkNotNullParameter(typingIndicatorConfig, "");
        String strEZpvd = EZpvd(charSequence, typingIndicatorConfig);
        if (strEZpvd == null) {
            return;
        }
        this.AubY = System.currentTimeMillis();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KeyboardViewModel$onUserTyping$1(this, strEZpvd, typingIndicatorConfig, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String EZpvd(CharSequence charSequence, TypingIndicatorConfig typingIndicatorConfig) {
        boolean individualChatEnabled;
        String value = this.values.getValue();
        if (value != null) {
            if (!(!StringsKt__StringsKt.fARcdN((CharSequence) value))) {
                value = null;
            }
            if (value != null && this.AuCTelauCTel.getValue() == ObserveKeyboardInputStateUseCase.KeyboardInputState.AllowInput && charSequence != null && !StringsKt__StringsKt.fARcdN(charSequence)) {
                OKConversation value2 = this.fetchVPNInfo.getValue();
                OKConversationType conversationType = value2 != null ? value2.getConversationType() : null;
                int i = conversationType == null ? -1 : TaskDescription.EZpvd[conversationType.ordinal()];
                if (i == 1) {
                    individualChatEnabled = typingIndicatorConfig.getIndividualChatEnabled();
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            individualChatEnabled = typingIndicatorConfig.getChatroomEnabled();
                        }
                        if (System.currentTimeMillis() - this.AubY >= typingIndicatorConfig.getThrottleIntervalMs()) {
                            return null;
                        }
                        return value;
                    }
                    individualChatEnabled = typingIndicatorConfig.getGroupChatEnabled();
                }
                if (!individualChatEnabled) {
                    return null;
                }
                if (System.currentTimeMillis() - this.AubY >= typingIndicatorConfig.getThrottleIntervalMs()) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(String str, TypingIndicatorConfig typingIndicatorConfig, Continuation<? super Unit> continuation) throws Throwable {
        KeyboardViewModel$sendTypingIndicatorIfAllowed$1 keyboardViewModel$sendTypingIndicatorIfAllowed$1;
        Object objM7377constructorimpl;
        GroupUserSettingInfo userSettingInfo;
        GroupRole role;
        if (continuation instanceof KeyboardViewModel$sendTypingIndicatorIfAllowed$1) {
            keyboardViewModel$sendTypingIndicatorIfAllowed$1 = (KeyboardViewModel$sendTypingIndicatorIfAllowed$1) continuation;
            int i = keyboardViewModel$sendTypingIndicatorIfAllowed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                keyboardViewModel$sendTypingIndicatorIfAllowed$1.label = i - Integer.MIN_VALUE;
            } else {
                keyboardViewModel$sendTypingIndicatorIfAllowed$1 = new KeyboardViewModel$sendTypingIndicatorIfAllowed$1(this, continuation);
            }
        }
        Object objEZpvd = keyboardViewModel$sendTypingIndicatorIfAllowed$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = keyboardViewModel$sendTypingIndicatorIfAllowed$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                OKConversation value = this.fetchVPNInfo.getValue();
                Integer numAEQbTJ = null;
                if ((value != null ? value.getConversationType() : null) == OKConversationType.GROUP) {
                    GroupInfo value2 = this.uzCIH.getValue();
                    if ((value2 != null ? value2.getGroupCount() : 0) > typingIndicatorConfig.getLargeGroupThreshold()) {
                        GroupInfo value3 = this.uzCIH.getValue();
                        if (value3 != null && (userSettingInfo = value3.getUserSettingInfo()) != null && (role = userSettingInfo.getRole()) != null) {
                            numAEQbTJ = C56443yFo.AEQbTJ(role.getCode());
                        }
                        if (numAEQbTJ == null || !typingIndicatorConfig.getAllowedRolesInLargeGroup().contains(numAEQbTJ)) {
                            return Unit.INSTANCE;
                        }
                    }
                }
                Result.Application application = Result.Companion;
                oED oed = this.RJOkX;
                keyboardViewModel$sendTypingIndicatorIfAllowed$1.label = 1;
                objEZpvd = oed.EZpvd(str, keyboardViewModel$sendTypingIndicatorIfAllowed$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) objEZpvd);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("KeyboardViewModel", "send typing indicator error", thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    public final void ejfBZ() {
        if (!C34703nhO.AhwBna(C32979mnm.EZpvd.OLrzqt()) || !SPUtils.getBoolean("ModifyIMAPIKeyActivity_KEY_AUTO_SEND_MSG_TOGGLE", false)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KeyboardViewModel$sendMessage$1(this, null), 3, null);
        } else {
            KWHzl();
        }
    }

    public final void fIwbmz() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KeyboardViewModel$stopAgentBotMessage$1(this, null), 3, null);
    }

    public final void KWHzl() {
        Job job = this.QOLQEE;
        if (job == null || !job.isActive()) {
            this.QOLQEE = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KeyboardViewModel$debugSendMessage$1(this, SPUtils.getInt("ModifyIMAPIKeyActivity_KEY_AUTO_SYNC_FREQ", 300), null), 3, null);
        } else {
            Job job2 = this.QOLQEE;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    public final void AEQbTJ(@NotNull C33729nDr c33729nDr, DraftMessageModel draftMessageModel) {
        Intrinsics.checkNotNullParameter(c33729nDr, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new KeyboardViewModel$handleReferenceEvent$1(this, c33729nDr, draftMessageModel, null), 3, null);
    }
}

package com.okinc.liveness.lca.ui;

import android.content.Context;
import android.util.Size;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.google.firebase.messaging.Constants;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.liveness.lca.KycSdkEventConst;
import com.okinc.liveness.lca.LcaColorChallengeSequenceConfig;
import com.okinc.liveness.lca.LcaSdkConfiguration;
import com.okinc.liveness.lca.ai.FaceDetector;
import com.okinc.liveness.lca.data.ColorChallengeElement;
import com.okinc.liveness.lca.data.ColorChallengeSequence;
import com.okinc.liveness.lca.data.FaceCheckState;
import com.okinc.liveness.lca.data.LcaJwstCollectCallback;
import com.okinc.liveness.lca.data.LcaJwstResultCallback;
import com.okinc.liveness.lca.data.LcaJwstWsCloseStatus;
import com.okinc.liveness.lca.data.LiveEvent;
import com.okinc.liveness.lca.data.RgbColor;
import com.okinc.liveness.lca.data.ScoreData;
import com.okinc.liveness.lca.data.VideoViewportSize;
import com.okinc.liveness.lca.data.WSAuthResponseMsgColorSequence;
import com.okinc.liveness.lca.data.WSAuthResponseMsgData;
import com.okinc.liveness.lca.data.WSVideoVerifyResultResponseMsgData;
import com.okinc.liveness.lca.debugtool.data.ColorEvent;
import com.okinc.liveness.lca.debugtool.data.LcaDebugAiAlgoRepository;
import com.okinc.liveness.lca.debugtool.data.LcaDebugInfo;
import com.okinc.liveness.lca.debugtool.data.LcaDebugJwstRepository;
import com.okinc.liveness.lca.debugtool.data.LcaJwstQueryResultData;
import com.okinc.liveness.lca.debugtool.data.LcaJwstWsSessionIdData;
import com.okinc.liveness.lca.debugtool.data.LivenessResponse;
import com.okinc.liveness.lca.manager.ConfigManager;
import com.okinc.liveness.lca.manager.FaceCaptchaManager;
import com.okinc.liveness.lca.manager.LcaSdkManager;
import com.okinc.liveness.lca.manager.TimeoutType;
import com.okinc.liveness.lca.manager.WebSocketManager;
import com.okinc.liveness.lca.ui.LcaLivenessScanViewModel;
import com.okinc.liveness.lca.ui.LivenessProcessState;
import com.okinc.liveness.lca.ui.LivenessUIState;
import com.okinc.ok_kyc_core.data.lca.LcaJwstWsSessionIdOriginalData;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C32866mlf;
import o.C32868mlh;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.rTL;
import o.yHT;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaLivenessScanViewModel extends ViewModel {
    public static final String LCA_LOG_TAG = "LCA liveness -";
    public final String KYC_LOG_TAG;
    public final String TAG;
    public final MutableLiveData<ColorChallengeSequence> _colorChallengeSequence;
    public final LiveEvent<Pair<String, Throwable>> _localErrorEvent;
    public final LiveEvent<Pair<String, Throwable>> _networkErrorEvent;
    public final MutableLiveData<LivenessProcessState> _processState;
    public final LiveEvent<Unit> _timeoutEvent;
    public final MutableStateFlow<LivenessUIState> _uiState;
    public boolean allReady;
    public String bizSessionId;
    public final LiveData<ColorChallengeSequence> colorChallengeSequence;
    public boolean colorChallenging;
    public LcaSdkLivenessConfig config;
    public final ConfigManager configManager;
    public final Context context;
    public FaceCaptchaManager faceCaptchaManager;
    public boolean faceOvalInited;
    public boolean freshnessTriggeredBefore;
    public boolean initFarFaceChecking;
    public LcaDebugJwstRepository lcaDebugJwstRepository;
    public final LiveEvent<Pair<String, Throwable>> localErrorEvent;
    public final LiveEvent<Pair<String, Throwable>> networkErrorEvent;
    public final LiveData<LivenessProcessState> processState;
    public boolean readyCamera;
    public boolean readyConfig;
    public boolean readyConnection;
    public boolean readyFaceOval;
    public boolean readyPreview;
    public boolean readySession;
    public final LiveEvent<Unit> timeoutEvent;
    public final StateFlow<LivenessUIState> uiState;
    public final InternalWebSocketManager webSocketManager;
    public String wsSessionId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<ColorChallengeSequence> getColorChallengeSequence() {
        return this.colorChallengeSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfig getConfig() {
        return this.config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceCaptchaManager getFaceCaptchaManager() {
        return this.faceCaptchaManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveEvent<Pair<String, Throwable>> getLocalErrorEvent() {
        return this.localErrorEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveEvent<Pair<String, Throwable>> getNetworkErrorEvent() {
        return this.networkErrorEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<LivenessProcessState> getProcessState() {
        return this.processState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveEvent<Unit> getTimeoutEvent() {
        return this.timeoutEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<LivenessUIState> getUiState() {
        return this.uiState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceCaptchaManager(FaceCaptchaManager faceCaptchaManager) {
        this.faceCaptchaManager = faceCaptchaManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void updateConfig(LcaSdkLivenessConfig lcaSdkLivenessConfig) {
        this.config = lcaSdkLivenessConfig;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public LcaLivenessScanViewModel(@NotNull Context context, @NotNull ConfigManager configManager) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(configManager, "");
        this.context = context;
        this.configManager = configManager;
        this.TAG = "LivenessScanViewModel";
        this.KYC_LOG_TAG = "kyc_in_house";
        MutableStateFlow<LivenessUIState> MutableStateFlow = StateFlowKt.MutableStateFlow(LivenessUIState.StartingUp.INSTANCE);
        this._uiState = MutableStateFlow;
        this.uiState = MutableStateFlow;
        MutableLiveData<LivenessProcessState> mutableLiveData = new MutableLiveData<>();
        this._processState = mutableLiveData;
        this.processState = mutableLiveData;
        LiveEvent<Pair<String, Throwable>> liveEvent = new LiveEvent<>();
        this._networkErrorEvent = liveEvent;
        this.networkErrorEvent = liveEvent;
        LiveEvent<Unit> liveEvent2 = new LiveEvent<>();
        this._timeoutEvent = liveEvent2;
        this.timeoutEvent = liveEvent2;
        LiveEvent<Pair<String, Throwable>> liveEvent3 = new LiveEvent<>();
        this._localErrorEvent = liveEvent3;
        this.localErrorEvent = liveEvent3;
        MutableLiveData<ColorChallengeSequence> mutableLiveData2 = new MutableLiveData<>();
        this._colorChallengeSequence = mutableLiveData2;
        this.colorChallengeSequence = mutableLiveData2;
        this.webSocketManager = new InternalWebSocketManager();
        this.bizSessionId = "";
        this.readySession = true;
        pUU.KWHzl("kyc_in_house", "LCA liveness - ViewModel initialized");
    }

    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 8;
        public final ConfigManager configManager;
        public final Context context;

        public Factory(@NotNull Context context, @NotNull ConfigManager configManager) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(configManager, "");
            this.context = context;
            this.configManager = configManager;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(@NotNull Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            if (cls.isAssignableFrom(LcaLivenessScanViewModel.class)) {
                return new LcaLivenessScanViewModel(this.context, this.configManager);
            }
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
    }

    public final class InternalWebSocketManager {
        public WebSocketManager webSocketManager;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public InternalWebSocketManager() {
        }

        public final void initialize(@NotNull String str, FacialExtParams facialExtParams) {
            Intrinsics.checkNotNullParameter(str, "");
            if (str.length() <= 0 || this.webSocketManager != null) {
                return;
            }
            pUU.KWHzl(LcaLivenessScanViewModel.this.KYC_LOG_TAG, "LCA liveness - initializing WebSocket manager");
            final LcaLivenessScanViewModel lcaLivenessScanViewModel = LcaLivenessScanViewModel.this;
            LcaJwstCollectCallback lcaJwstCollectCallback = new LcaJwstCollectCallback() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$InternalWebSocketManager$initialize$collectCallback$1
                @Override // com.okinc.liveness.lca.data.LcaJwstCollectCallback
                public void onWebSocketConnected(long j) {
                    pUU.KWHzl(lcaLivenessScanViewModel.KYC_LOG_TAG, "LCA liveness - on web socket connected, duration=" + j);
                    lcaLivenessScanViewModel.handleWebSocketConnected(j);
                }

                @Override // com.okinc.liveness.lca.data.LcaJwstCollectCallback
                public void onWebSocketError(String str2) {
                    Intrinsics.checkNotNullParameter(str2, "");
                    pUU.valueOf(lcaLivenessScanViewModel.KYC_LOG_TAG, "LCA liveness - on websocket error: " + str2);
                    lcaLivenessScanViewModel.handleWebSocketError(str2);
                }

                @Override // com.okinc.liveness.lca.data.LcaJwstCollectCallback
                public void onWebSocketClosed(LcaJwstWsCloseStatus lcaJwstWsCloseStatus) {
                    Intrinsics.checkNotNullParameter(lcaJwstWsCloseStatus, "");
                    pUU.valueOf(lcaLivenessScanViewModel.KYC_LOG_TAG, "LCA liveness - on websocket closed: closeStatus=" + lcaJwstWsCloseStatus);
                    lcaLivenessScanViewModel.handleWebSocketClosed(lcaJwstWsCloseStatus);
                }

                @Override // com.okinc.liveness.lca.data.LcaJwstCollectCallback
                public void onAuthResponse(WSAuthResponseMsgData wSAuthResponseMsgData) {
                    pUU.KWHzl(lcaLivenessScanViewModel.KYC_LOG_TAG, "LCA liveness - on websocket auth response");
                    lcaLivenessScanViewModel.handleAuthResponse(wSAuthResponseMsgData);
                }

                @Override // com.okinc.liveness.lca.data.LcaJwstCollectCallback
                public void onInvalidFinalParam(String str2) {
                    Intrinsics.checkNotNullParameter(str2, "");
                    pUU.KWHzl(lcaLivenessScanViewModel.KYC_LOG_TAG, "LCA liveness - on local final invalid param");
                    lcaLivenessScanViewModel.handleInvalidFinalParamError(str2);
                }

                @Override // com.okinc.liveness.lca.data.LcaJwstCollectCallback
                public void onFailEncryptFinalParam(String str2) {
                    Intrinsics.checkNotNullParameter(str2, "");
                    pUU.KWHzl(lcaLivenessScanViewModel.KYC_LOG_TAG, "LCA liveness - on local fail encrypt final param");
                    lcaLivenessScanViewModel.handleFailEncryptParamError(str2);
                }
            };
            final LcaLivenessScanViewModel lcaLivenessScanViewModel2 = LcaLivenessScanViewModel.this;
            WebSocketManager webSocketManager = new WebSocketManager(str, lcaJwstCollectCallback, new LcaJwstResultCallback() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$InternalWebSocketManager$initialize$resultCallback$1
                @Override // com.okinc.liveness.lca.data.LcaJwstResultCallback
                public void onLcaVideoVerifyResult(WSVideoVerifyResultResponseMsgData wSVideoVerifyResultResponseMsgData) {
                    Intrinsics.checkNotNullParameter(wSVideoVerifyResultResponseMsgData, "");
                    pUU.KWHzl(lcaLivenessScanViewModel2.KYC_LOG_TAG, "LCA liveness - on video verify result");
                    lcaLivenessScanViewModel2.handleVideoVerifyResult(wSVideoVerifyResultResponseMsgData);
                }
            }, facialExtParams);
            this.webSocketManager = webSocketManager;
            webSocketManager.connect();
        }

        public final void sendVideoSegment(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            WebSocketManager webSocketManager = this.webSocketManager;
            if (webSocketManager != null) {
                webSocketManager.sendVideoSegment(bArr);
            }
        }

        public final void sendFinalDescriptiveParams(long j, long j2, long j3, int i, int i2, long j4, @NotNull List<ColorEvent> list, @NotNull String str, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            WebSocketManager webSocketManager = this.webSocketManager;
            if (webSocketManager != null) {
                webSocketManager.sendFinalDescriptiveParams(j, j2, j3, i, i2, j4, list, str, map);
            }
        }

        public final void sendAuthEvent(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            WebSocketManager webSocketManager = this.webSocketManager;
            if (webSocketManager != null) {
                webSocketManager.sendAuthEvent(str, str2, z, z2);
            }
        }

        public final void sendFlashColorTimeoutEvent(long j) {
            WebSocketManager webSocketManager = this.webSocketManager;
            if (webSocketManager != null) {
                webSocketManager.sendFlashColorTimeoutEvent(j);
            }
        }

        public static /* synthetic */ void disconnect$default(InternalWebSocketManager internalWebSocketManager, LcaJwstWsCloseStatus lcaJwstWsCloseStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                lcaJwstWsCloseStatus = null;
            }
            internalWebSocketManager.disconnect(lcaJwstWsCloseStatus);
        }

        public final void disconnect(final LcaJwstWsCloseStatus lcaJwstWsCloseStatus) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd(KycSdkEventConst.LCA_Socket_Closing_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$InternalWebSocketManager$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LcaLivenessScanViewModel.InternalWebSocketManager.disconnect$lambda$0(lcaJwstWsCloseStatus, (EventParamsList) obj);
                }
            });
            WebSocketManager webSocketManager = this.webSocketManager;
            if (webSocketManager != null) {
                webSocketManager.disconnect(lcaJwstWsCloseStatus);
            }
            this.webSocketManager = null;
        }

        public static final Unit disconnect$lambda$0(LcaJwstWsCloseStatus lcaJwstWsCloseStatus, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "code", String.valueOf(lcaJwstWsCloseStatus != null ? Integer.valueOf(lcaJwstWsCloseStatus.getCode()) : null), false, 4, null);
            return Unit.INSTANCE;
        }
    }

    public final void initLiveness() {
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - init liveness in ViewModel");
        initCaptchaState();
        initConfig();
    }

    public final boolean initConfig() {
        LcaSdkManager.Companion companion = LcaSdkManager.Companion;
        int apiMode = companion.getInstance().getConfiguration().getApiMode();
        LcaSdkConfiguration.Companion companion2 = LcaSdkConfiguration.Companion;
        if (apiMode == companion2.getAPI_COMPLIANCE()) {
            pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - compliance API Mode");
            String bizSessionId = companion.getInstance().getConfiguration().getBizSessionId();
            if (bizSessionId == null || bizSessionId.length() == 0) {
                handleLocalError(companion2.getRETRY_REASON_BZ_SESSION_ID_INVALID(), new Throwable("biz session id is null or empty"));
                return true;
            }
            String faceSessionId = companion.getInstance().getConfiguration().getFaceSessionId();
            if (faceSessionId == null || faceSessionId.length() == 0) {
                handleLocalError(companion2.getRETRY_REASON_WS_SESSION_ID_INVALID(), new Throwable("face session id is null or empty"));
                return true;
            }
            String bizSessionId2 = companion.getInstance().getConfiguration().getBizSessionId();
            Intrinsics.copydefault((Object) bizSessionId2);
            this.bizSessionId = bizSessionId2;
            this.wsSessionId = companion.getInstance().getConfiguration().getFaceSessionId();
            this.lcaDebugJwstRepository = LcaDebugJwstRepository.Companion.getInstance(companion.getInstance().getConfiguration().getJwstHttpBaseUrl());
            return false;
        }
        if (apiMode == companion2.getAPI_MODE_JWST()) {
            pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - debug JWST Mode");
            this.bizSessionId = UUID.randomUUID().toString();
            this.lcaDebugJwstRepository = LcaDebugJwstRepository.Companion.getInstance(companion.getInstance().getConfiguration().getJwstHttpBaseUrl());
            return false;
        }
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - debug AI Api Mode");
        MutableLiveData<ColorChallengeSequence> mutableLiveData = this._colorChallengeSequence;
        LcaColorChallengeSequenceConfig forceColorSequence = companion.getInstance().getConfiguration().getForceColorSequence();
        mutableLiveData.setValue(forceColorSequence != null ? forceColorSequence.toColorChallengeSequence$OKCompliance_ok_compliance_dynamic_lca_impl() : null);
        return false;
    }

    public final void startLiveness() {
        this.readySession = true;
        int apiMode = LcaSdkManager.Companion.getInstance().getConfiguration().getApiMode();
        LcaSdkConfiguration.Companion companion = LcaSdkConfiguration.Companion;
        if (apiMode == companion.getAPI_COMPLIANCE()) {
            fetchComplianceConfiguration();
        } else if (apiMode == companion.getAPI_MODE_JWST()) {
            fetchJwstConfiguration();
        } else {
            fetchLocalDefaultConfiguration();
        }
    }

    public final void stopLiveness() {
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - cleaning up ViewModel resources");
        this.readySession = false;
        InternalWebSocketManager.disconnect$default(this.webSocketManager, null, 1, null);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$fetchComplianceConfiguration$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17131(Continuation<? super C17131> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new C17131(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                LcaSdkLivenessConfig localConfig = LcaLivenessScanViewModel.this.configManager.getLocalConfig();
                pUU.KWHzl(LcaLivenessScanViewModel.this.KYC_LOG_TAG, "LCA liveness - get local stored config: " + localConfig);
                LcaLivenessScanViewModel.this.updateConfig(localConfig);
                LcaSdkLivenessConfig livenessConfig = LcaSdkManager.Companion.getInstance().getConfiguration().getLivenessConfig();
                if (livenessConfig != null) {
                    LcaLivenessScanViewModel lcaLivenessScanViewModel = LcaLivenessScanViewModel.this;
                    pUU.KWHzl(lcaLivenessScanViewModel.KYC_LOG_TAG, "LCA liveness - remote liveness config is " + livenessConfig);
                    lcaLivenessScanViewModel.configManager.saveLocalConfig(livenessConfig);
                    lcaLivenessScanViewModel.updateConfig(livenessConfig);
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(LcaLivenessScanViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass2, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$fetchComplianceConfiguration$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ LcaLivenessScanViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LcaLivenessScanViewModel lcaLivenessScanViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = lcaLivenessScanViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.readyConfig = true;
                    this.this$0._processState.setValue(LivenessProcessState.ConfigurationReady.INSTANCE);
                    this.this$0.checkReady("init_config");
                    this.this$0.connectWebSocket();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void fetchComplianceConfiguration() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C17131(null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$fetchJwstConfiguration$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17141(Continuation<? super C17141> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17141 c17141 = LcaLivenessScanViewModel.this.new C17141(continuation);
            c17141.L$0 = obj;
            return c17141;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00b1 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Deferred deferred;
            LcaDebugJwstRepository.Result result;
            MainCoroutineDispatcher main;
            C05041 c05041;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                LcaSdkLivenessConfig localConfig = LcaLivenessScanViewModel.this.configManager.getLocalConfig();
                pUU.KWHzl(LcaLivenessScanViewModel.this.KYC_LOG_TAG, "LCA liveness - get local stored config: " + localConfig);
                LcaLivenessScanViewModel.this.updateConfig(localConfig);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new LcaLivenessScanViewModel$fetchJwstConfiguration$1$configDeferred$1(LcaLivenessScanViewModel.this, null), 3, null);
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new LcaLivenessScanViewModel$fetchJwstConfiguration$1$wsSessionDeferred$1(LcaLivenessScanViewModel.this, null), 3, null);
                this.L$0 = deferredAsync$default2;
                this.label = 1;
                Object objAwait = deferredAsync$default.await(this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                deferred = deferredAsync$default2;
                obj = objAwait;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    result = (LcaDebugJwstRepository.Result) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    main = Dispatchers.getMain();
                    c05041 = new C05041(result, LcaLivenessScanViewModel.this, (LcaDebugJwstRepository.Result) obj, null);
                    this.L$0 = null;
                    this.label = 3;
                    if (BuildersKt.withContext(main, c05041, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                deferred = (Deferred) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            LcaDebugJwstRepository.Result result2 = (LcaDebugJwstRepository.Result) obj;
            this.L$0 = result2;
            this.label = 2;
            Object objAwait2 = deferred.await(this);
            if (objAwait2 == objCopydefault) {
                return objCopydefault;
            }
            result = result2;
            obj = objAwait2;
            main = Dispatchers.getMain();
            c05041 = new C05041(result, LcaLivenessScanViewModel.this, (LcaDebugJwstRepository.Result) obj, null);
            this.L$0 = null;
            this.label = 3;
            if (BuildersKt.withContext(main, c05041, this) == objCopydefault) {
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$fetchJwstConfiguration$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LcaDebugJwstRepository.Result<LcaSdkLivenessConfig> $configResult;
            final /* synthetic */ LcaDebugJwstRepository.Result<LcaJwstWsSessionIdData> $wsSessionResult;
            int label;
            final /* synthetic */ LcaLivenessScanViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05041(LcaDebugJwstRepository.Result<LcaSdkLivenessConfig> result, LcaLivenessScanViewModel lcaLivenessScanViewModel, LcaDebugJwstRepository.Result<LcaJwstWsSessionIdData> result2, Continuation<? super C05041> continuation) {
                super(2, continuation);
                this.$configResult = result;
                this.this$0 = lcaLivenessScanViewModel;
                this.$wsSessionResult = result2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05041(this.$configResult, this.this$0, this.$wsSessionResult, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    LcaDebugJwstRepository.Result<LcaSdkLivenessConfig> result = this.$configResult;
                    if (result instanceof LcaDebugJwstRepository.Result.Error) {
                        pUU.valueOf(this.this$0.KYC_LOG_TAG, "LCA liveness - get remote config fail: " + ((LcaDebugJwstRepository.Result.Error) this.$configResult).getMessage());
                    } else if (result instanceof LcaDebugJwstRepository.Result.Success) {
                        pUU.KWHzl(this.this$0.KYC_LOG_TAG, "LCA liveness - get remote config success: " + ((LcaDebugJwstRepository.Result.Success) this.$configResult).getData());
                        ConfigManager configManager = this.this$0.configManager;
                        Object data = ((LcaDebugJwstRepository.Result.Success) this.$configResult).getData();
                        Intrinsics.copydefault(data);
                        configManager.saveLocalConfig((LcaSdkLivenessConfig) data);
                        this.this$0.updateConfig((LcaSdkLivenessConfig) ((LcaDebugJwstRepository.Result.Success) this.$configResult).getData());
                    } else if (result != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LcaDebugJwstRepository.Result<LcaJwstWsSessionIdData> result2 = this.$wsSessionResult;
                    if (result2 instanceof LcaDebugJwstRepository.Result.Error) {
                        this.this$0.handleNetworkError(LcaSdkConfiguration.Companion.getRETRY_REASON_HTTP_ERROR(), new Throwable("jwst rest api - get wsSessionId fail, message=" + ((LcaDebugJwstRepository.Result.Error) this.$wsSessionResult).getMessage()));
                    } else if (result2 instanceof LcaDebugJwstRepository.Result.Success) {
                        LcaLivenessScanViewModel lcaLivenessScanViewModel = this.this$0;
                        rTL rtl = rTL.OLrzqt;
                        Object data2 = ((LcaDebugJwstRepository.Result.Success) result2).getData();
                        Intrinsics.copydefault(data2);
                        LcaJwstWsSessionIdOriginalData lcaJwstWsSessionIdOriginalData = (LcaJwstWsSessionIdOriginalData) rtl.EZpvd(((LcaJwstWsSessionIdData) data2).getObfuscateData(), LcaJwstWsSessionIdOriginalData.class);
                        lcaLivenessScanViewModel.wsSessionId = lcaJwstWsSessionIdOriginalData != null ? lcaJwstWsSessionIdOriginalData.getWsSessionId() : null;
                        this.this$0.readyConfig = true;
                        this.this$0._processState.setValue(LivenessProcessState.ConfigurationReady.INSTANCE);
                        this.this$0.checkReady("init_config");
                        this.this$0.connectWebSocket();
                    } else if (result2 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void fetchJwstConfiguration() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C17141(null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$fetchLocalDefaultConfiguration$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17151(Continuation<? super C17151> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new C17151(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                LcaLivenessScanViewModel.this.updateConfig(LcaLivenessScanViewModel.this.configManager.getDefaultConfig());
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C05051 c05051 = new C05051(LcaLivenessScanViewModel.this, null);
                this.label = 1;
                if (BuildersKt.withContext(main, c05051, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$fetchLocalDefaultConfiguration$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ LcaLivenessScanViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05051(LcaLivenessScanViewModel lcaLivenessScanViewModel, Continuation<? super C05051> continuation) {
                super(2, continuation);
                this.this$0 = lcaLivenessScanViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05051(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.readyConfig = true;
                    this.this$0._processState.setValue(LivenessProcessState.ConfigurationReady.INSTANCE);
                    this.this$0.checkReady("init_config");
                    this.this$0.readyConnection = true;
                    this.this$0.checkReady("init_connection");
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void fetchLocalDefaultConfiguration() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C17151(null), 2, null);
    }

    public final void initCaptchaState() {
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - init core face captcha state");
        this.faceCaptchaManager = new FaceCaptchaManager(this.context, new Function1() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LcaLivenessScanViewModel.initCaptchaState$lambda$0(this.f$0, ((Long) obj).longValue());
            }
        }, new Function0() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LcaLivenessScanViewModel.initCaptchaState$lambda$1(this.f$0);
            }
        }, new Function0() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LcaLivenessScanViewModel.initCaptchaState$lambda$2(this.f$0);
            }
        }, new yHT() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$$ExternalSyntheticLambda4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHT
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return LcaLivenessScanViewModel.initCaptchaState$lambda$3(this.f$0, (FaceCheckState) obj, (FaceDetector.QCLabel) obj2, (Float) obj3, (Float) obj4);
            }
        }, new Function0() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$$ExternalSyntheticLambda5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LcaLivenessScanViewModel.initCaptchaState$lambda$4(this.f$0);
            }
        });
    }

    public static final Unit initCaptchaState$lambda$0(LcaLivenessScanViewModel lcaLivenessScanViewModel, long j) {
        pUU.KWHzl(lcaLivenessScanViewModel.KYC_LOG_TAG, "LCA liveness - on face show, all state ready? " + lcaLivenessScanViewModel.allReady);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(lcaLivenessScanViewModel), Dispatchers.getMain(), null, new LcaLivenessScanViewModel$initCaptchaState$1$1(lcaLivenessScanViewModel, j, null), 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit initCaptchaState$lambda$1(LcaLivenessScanViewModel lcaLivenessScanViewModel) {
        pUU.KWHzl(lcaLivenessScanViewModel.KYC_LOG_TAG, "LCA liveness - on face distance check started");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(lcaLivenessScanViewModel), Dispatchers.getMain(), null, new LcaLivenessScanViewModel$initCaptchaState$2$1(lcaLivenessScanViewModel, null), 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit initCaptchaState$lambda$2(LcaLivenessScanViewModel lcaLivenessScanViewModel) {
        pUU.KWHzl(lcaLivenessScanViewModel.KYC_LOG_TAG, "LCA liveness - on far face check passed");
        FaceCaptchaManager faceCaptchaManager = lcaLivenessScanViewModel.faceCaptchaManager;
        if (faceCaptchaManager != null) {
            faceCaptchaManager.onHolding(false);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(lcaLivenessScanViewModel), Dispatchers.getMain(), null, new LcaLivenessScanViewModel$initCaptchaState$3$1(lcaLivenessScanViewModel, null), 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit initCaptchaState$lambda$3(LcaLivenessScanViewModel lcaLivenessScanViewModel, FaceCheckState faceCheckState, FaceDetector.QCLabel qCLabel, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(faceCheckState, "");
        if (lcaLivenessScanViewModel.allReady && faceCheckState.getInstructionId() != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(lcaLivenessScanViewModel), Dispatchers.getMain(), null, new LcaLivenessScanViewModel$initCaptchaState$4$1(lcaLivenessScanViewModel, faceCheckState, qCLabel, f2, f, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit initCaptchaState$lambda$4(LcaLivenessScanViewModel lcaLivenessScanViewModel) {
        pUU.valueOf(lcaLivenessScanViewModel.KYC_LOG_TAG, "LCA liveness - on face model load failed");
        lcaLivenessScanViewModel.handleLocalError(LcaSdkConfiguration.Companion.getRETRY_REASON_LOAD_JNI_LIB_FAIL(), null);
        return Unit.INSTANCE;
    }

    public final void connectWebSocket() {
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - init websocket connection start");
        LcaSdkManager.Companion companion = LcaSdkManager.Companion;
        int apiMode = companion.getInstance().getConfiguration().getApiMode();
        LcaSdkConfiguration.Companion companion2 = LcaSdkConfiguration.Companion;
        if (apiMode == companion2.getAPI_COMPLIANCE() || companion.getInstance().getConfiguration().getApiMode() == companion2.getAPI_MODE_JWST()) {
            this.webSocketManager.initialize(companion.getInstance().getConfiguration().getJwstWsBaseUrl(), companion.getInstance().getConfiguration().getExtParams());
        } else {
            this.readyConnection = true;
            checkReady("init_connection");
        }
    }

    public final void handleWebSocketConnected(long j) {
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - handle web socket connected, sending auth event");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C17231(j, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C17242(null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$handleWebSocketConnected$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $connectionDuration;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17231(long j, Continuation<? super C17231> continuation) {
            super(2, continuation);
            this.$connectionDuration = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new C17231(this.$connectionDuration, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                LcaLivenessScanViewModel.this._processState.setValue(new LivenessProcessState.SocketConnected(this.$connectionDuration));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$handleWebSocketConnected$2, reason: invalid class name and case insensitive filesystem */
    public static final class C17242 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17242(Continuation<? super C17242> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new C17242(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17242) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                String str = LcaLivenessScanViewModel.this.wsSessionId;
                if (str != null) {
                    LcaLivenessScanViewModel lcaLivenessScanViewModel = LcaLivenessScanViewModel.this;
                    pUU.KWHzl(lcaLivenessScanViewModel.KYC_LOG_TAG, "LCA liveness - send auth frame");
                    InternalWebSocketManager internalWebSocketManager = lcaLivenessScanViewModel.webSocketManager;
                    String str2 = lcaLivenessScanViewModel.bizSessionId;
                    LcaSdkManager.Companion companion = LcaSdkManager.Companion;
                    internalWebSocketManager.sendAuthEvent(str2, str, companion.getInstance().getConfiguration().isEnableDataSign(), companion.getInstance().getConfiguration().isEnableDataObfuscation());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$sendSplashColorTimeoutEvent$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17281(Continuation<? super C17281> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new C17281(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (LcaLivenessScanViewModel.this.wsSessionId != null) {
                    LcaLivenessScanViewModel lcaLivenessScanViewModel = LcaLivenessScanViewModel.this;
                    pUU.KWHzl(lcaLivenessScanViewModel.KYC_LOG_TAG, "LCA liveness - send splash color timeout");
                    lcaLivenessScanViewModel.webSocketManager.sendFlashColorTimeoutEvent(System.currentTimeMillis());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void sendSplashColorTimeoutEvent() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C17281(null), 2, null);
    }

    public final void handleWebSocketError(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - handle websocket error: " + str);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(KycSdkEventConst.LCA_Socket_ReceivedErrorEvent_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LcaLivenessScanViewModel.handleWebSocketError$lambda$5(str, (EventParamsList) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C17252(str, null), 2, null);
    }

    public static final Unit handleWebSocketError$lambda$5(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "code", str, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$handleWebSocketError$2, reason: invalid class name and case insensitive filesystem */
    public static final class C17252 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $error;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17252(String str, Continuation<? super C17252> continuation) {
            super(2, continuation);
            this.$error = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new C17252(this.$error, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17252) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InternalWebSocketManager.disconnect$default(LcaLivenessScanViewModel.this.webSocketManager, null, 1, null);
                LcaLivenessScanViewModel.this.handleNetworkError(LcaSdkConfiguration.Companion.getRETRY_REASON_WS_ERROR(), new Throwable("web socket error, reason=" + this.$error));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void handleInvalidFinalParamError(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.valueOf(this.KYC_LOG_TAG, "LCA liveness - handle local final invalid param error: " + str);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C17181(str, null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$handleInvalidFinalParamError$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $error;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17181(String str, Continuation<? super C17181> continuation) {
            super(2, continuation);
            this.$error = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new C17181(this.$error, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InternalWebSocketManager.disconnect$default(LcaLivenessScanViewModel.this.webSocketManager, null, 1, null);
                LcaLivenessScanViewModel.this.handleLocalError(LcaSdkConfiguration.Companion.getRETRY_REASON_FINAL_PARAM_INVALID(), new Throwable("invalid final param error, reason=" + this.$error));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void handleFailEncryptParamError(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.valueOf(this.KYC_LOG_TAG, "LCA liveness - handle fail encrypt local final param error: " + str);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C17171(str, null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$handleFailEncryptParamError$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $error;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17171(String str, Continuation<? super C17171> continuation) {
            super(2, continuation);
            this.$error = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new C17171(this.$error, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InternalWebSocketManager.disconnect$default(LcaLivenessScanViewModel.this.webSocketManager, null, 1, null);
                LcaLivenessScanViewModel.this.handleLocalError(LcaSdkConfiguration.Companion.getRETRY_REASON_FINAL_ENCRYPT_FAIL(), new Throwable("fail encrypt final param, reason=" + this.$error));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void handleWebSocketClosed(@NotNull final LcaJwstWsCloseStatus lcaJwstWsCloseStatus) {
        Intrinsics.checkNotNullParameter(lcaJwstWsCloseStatus, "");
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - handle websocket closed: closeStatus=" + lcaJwstWsCloseStatus + " reason=" + lcaJwstWsCloseStatus.getReason() + " code=" + lcaJwstWsCloseStatus.getCode());
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(KycSdkEventConst.LCA_Socket_Closed_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$$ExternalSyntheticLambda6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LcaLivenessScanViewModel.handleWebSocketClosed$lambda$6(lcaJwstWsCloseStatus, (EventParamsList) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new AnonymousClass2(lcaJwstWsCloseStatus, this, null), 2, null);
    }

    public static final Unit handleWebSocketClosed$lambda$6(LcaJwstWsCloseStatus lcaJwstWsCloseStatus, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "code", String.valueOf(lcaJwstWsCloseStatus.getCode()), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$handleWebSocketClosed$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LcaJwstWsCloseStatus $closeStatus;
        int label;
        final /* synthetic */ LcaLivenessScanViewModel this$0;

        /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$handleWebSocketClosed$2$WhenMappings */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[LcaJwstWsCloseStatus.HandleStrategy.values().length];
                try {
                    iArr[LcaJwstWsCloseStatus.HandleStrategy.ACKNOWLEDGE_ONLY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LcaJwstWsCloseStatus.HandleStrategy.CONNECT_FAIL_RETRY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LcaJwstWsCloseStatus.HandleStrategy.AUTH_FAIL_RETRY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LcaJwstWsCloseStatus.HandleStrategy.TIMEOUT_RETRY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LcaJwstWsCloseStatus lcaJwstWsCloseStatus, LcaLivenessScanViewModel lcaLivenessScanViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$closeStatus = lcaJwstWsCloseStatus;
            this.this$0 = lcaLivenessScanViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$closeStatus, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                int i = WhenMappings.$EnumSwitchMapping$0[this.$closeStatus.getStrategy().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        this.this$0.handleNetworkError(LcaSdkConfiguration.Companion.getRETRY_REASON_WS_CLOSE(), new Throwable("web socket closed, error_code=" + this.$closeStatus.getCode() + ", error_message=" + this.$closeStatus.getReason()));
                    } else if (i == 3) {
                        this.this$0.handleNetworkError(LcaSdkConfiguration.Companion.getRETRY_REASON_AUTH_FAIL(), new Throwable("web socket closed, error_code=" + this.$closeStatus.getCode() + ", error_message=" + this.$closeStatus.getReason()));
                    } else {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.this$0.handleTimeout(TimeoutType.LIVENESS_TIMEOUT_TYPE);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void handleAuthResponse(WSAuthResponseMsgData wSAuthResponseMsgData) {
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - handle auth response: status=" + (wSAuthResponseMsgData != null ? Boolean.valueOf(wSAuthResponseMsgData.getSuccess()) : null));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C17161(wSAuthResponseMsgData, this, null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$handleAuthResponse$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WSAuthResponseMsgData $response;
        int label;
        final /* synthetic */ LcaLivenessScanViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17161(WSAuthResponseMsgData wSAuthResponseMsgData, LcaLivenessScanViewModel lcaLivenessScanViewModel, Continuation<? super C17161> continuation) {
            super(2, continuation);
            this.$response = wSAuthResponseMsgData;
            this.this$0 = lcaLivenessScanViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17161(this.$response, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                WSAuthResponseMsgData wSAuthResponseMsgData = this.$response;
                if (wSAuthResponseMsgData != null && wSAuthResponseMsgData.getSuccess()) {
                    this.this$0.readyConnection = true;
                    this.this$0.setupColorChallengePool(this.$response.getColorSequences());
                    C56443yFo.KWHzl(this.this$0.checkReady("auth_response_success"));
                } else if (this.$response == null) {
                    pUU.copydefault(this.this$0.KYC_LOG_TAG, "LCA liveness - websocket auth failed, response decrypt null");
                    this.this$0.handleNetworkError(LcaSdkConfiguration.Companion.getRETRY_REASON_DECRYPT_FAIL(), new Throwable("websocket auth response decrypt failed"));
                } else {
                    pUU.copydefault(this.this$0.KYC_LOG_TAG, "LCA liveness - websocket auth failed");
                    this.this$0.handleNetworkError(LcaSdkConfiguration.Companion.getRETRY_REASON_AUTH_FAIL(), new Throwable("websocket auth response failed"));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void handleVideoVerifyResult(@NotNull WSVideoVerifyResultResponseMsgData wSVideoVerifyResultResponseMsgData) {
        Intrinsics.checkNotNullParameter(wSVideoVerifyResultResponseMsgData, "");
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - handle video verify result: response=" + wSVideoVerifyResultResponseMsgData);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C17221(wSVideoVerifyResultResponseMsgData, this, null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$handleVideoVerifyResult$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WSVideoVerifyResultResponseMsgData $response;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LcaLivenessScanViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17221(WSVideoVerifyResultResponseMsgData wSVideoVerifyResultResponseMsgData, LcaLivenessScanViewModel lcaLivenessScanViewModel, Continuation<? super C17221> continuation) {
            super(2, continuation);
            this.$response = wSVideoVerifyResultResponseMsgData;
            this.this$0 = lcaLivenessScanViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C17221 c17221 = new C17221(this.$response, this.this$0, continuation);
            c17221.L$0 = obj;
            return c17221;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                if (Intrinsics.EZpvd((Object) this.$response.getStatus(), (Object) "FINISH")) {
                    pUU.KWHzl(this.this$0.KYC_LOG_TAG, "LCA liveness - video verify result FINISH");
                    if (LcaSdkManager.Companion.getInstance().getConfiguration().getApiMode() != LcaSdkConfiguration.Companion.getAPI_COMPLIANCE()) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new C05061(this.this$0, null), 2, null);
                    } else {
                        this.this$0._processState.setValue(new LivenessProcessState.Success(null));
                    }
                } else {
                    this.this$0.handleNetworkError(LcaSdkConfiguration.Companion.getRETRY_REASON_WS_RSP_FAIL(), new Throwable("websocket video verify result fail, status=" + this.$response.getStatus()));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$handleVideoVerifyResult$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C05061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ LcaLivenessScanViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05061(LcaLivenessScanViewModel lcaLivenessScanViewModel, Continuation<? super C05061> continuation) {
                super(2, continuation);
                this.this$0 = lcaLivenessScanViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05061(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                LcaDebugJwstRepository.Result result;
                MainCoroutineDispatcher main;
                C05071 c05071;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    LcaDebugJwstRepository lcaDebugJwstRepository = this.this$0.lcaDebugJwstRepository;
                    if (lcaDebugJwstRepository != null) {
                        String str = this.this$0.bizSessionId;
                        String str2 = this.this$0.wsSessionId;
                        Intrinsics.copydefault((Object) str2);
                        this.label = 1;
                        obj = lcaDebugJwstRepository.queryResult(str, str2, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        result = null;
                        main = Dispatchers.getMain();
                        c05071 = new C05071(result, this.this$0, null);
                        this.label = 2;
                        if (BuildersKt.withContext(main, c05071, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                result = (LcaDebugJwstRepository.Result) obj;
                main = Dispatchers.getMain();
                c05071 = new C05071(result, this.this$0, null);
                this.label = 2;
                if (BuildersKt.withContext(main, c05071, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$handleVideoVerifyResult$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C05071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ LcaDebugJwstRepository.Result<LcaJwstQueryResultData> $queryResultResult;
                int label;
                final /* synthetic */ LcaLivenessScanViewModel this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C05071(LcaDebugJwstRepository.Result<LcaJwstQueryResultData> result, LcaLivenessScanViewModel lcaLivenessScanViewModel, Continuation<? super C05071> continuation) {
                    super(2, continuation);
                    this.$queryResultResult = result;
                    this.this$0 = lcaLivenessScanViewModel;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C05071(this.$queryResultResult, this.this$0, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C05071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        LcaDebugJwstRepository.Result<LcaJwstQueryResultData> result = this.$queryResultResult;
                        if (result instanceof LcaDebugJwstRepository.Result.Error) {
                            pUU.KWHzl(this.this$0.KYC_LOG_TAG, "LCA liveness - query result via lca jwst api error");
                            this.this$0.handleNetworkError(LcaSdkConfiguration.Companion.getRETRY_REASON_HTTP_ERROR(), new Throwable("jwst rest API - query result error, message=" + ((LcaDebugJwstRepository.Result.Error) this.$queryResultResult).getMessage()));
                        } else if (result instanceof LcaDebugJwstRepository.Result.Success) {
                            pUU.KWHzl(this.this$0.KYC_LOG_TAG, "LCA liveness - query result via lca jwst api success");
                            this.this$0._processState.setValue(new LivenessProcessState.Success((LivenessResponse) ((LcaDebugJwstRepository.Result.Success) this.$queryResultResult).getData()));
                        } else if (result != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final VideoViewportSize calculateVideoViewportSize(@NotNull Size size, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(size, "");
        Intrinsics.checkNotNullParameter(context, "");
        LcaSdkLivenessConfig lcaSdkLivenessConfig = this.config;
        if (lcaSdkLivenessConfig == null) {
            return null;
        }
        VideoViewportSize.Companion companion = VideoViewportSize.Companion;
        Integer resolutionWidth = lcaSdkLivenessConfig.getCollectedVideoConfig().getResolutionWidth();
        Intrinsics.copydefault(resolutionWidth);
        int iIntValue = resolutionWidth.intValue();
        Integer resolutionHeight = lcaSdkLivenessConfig.getCollectedVideoConfig().getResolutionHeight();
        Intrinsics.copydefault(resolutionHeight);
        return companion.create(size, context, iIntValue, resolutionHeight.intValue());
    }

    public final void updateVideoViewportSize(@NotNull VideoViewportSize videoViewportSize) {
        FaceCaptchaManager faceCaptchaManager;
        Intrinsics.checkNotNullParameter(videoViewportSize, "");
        LcaSdkLivenessConfig lcaSdkLivenessConfig = this.config;
        if (lcaSdkLivenessConfig == null || (faceCaptchaManager = this.faceCaptchaManager) == null) {
            return;
        }
        faceCaptchaManager.updateVideoViewportSize(videoViewportSize, lcaSdkLivenessConfig);
    }

    public final void startColorChallenge() {
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - start color challenge");
        this.colorChallenging = true;
        FaceCaptchaManager faceCaptchaManager = this.faceCaptchaManager;
        if (faceCaptchaManager != null) {
            faceCaptchaManager.splash();
        }
        FaceCaptchaManager faceCaptchaManager2 = this.faceCaptchaManager;
        if (faceCaptchaManager2 != null) {
            faceCaptchaManager2.addSensorReadingWithEvent("color_challenging");
        }
        this._processState.setValue(LivenessProcessState.ColorChallengeStart.INSTANCE);
    }

    public final void onColorDisplayed(@NotNull RgbColor rgbColor, RgbColor rgbColor2, int i, long j) {
        ScoreData qcScoreResult;
        ArrayList<ColorEvent> colorDisplayList;
        Intrinsics.checkNotNullParameter(rgbColor, "");
        LcaSdkManager.Companion companion = LcaSdkManager.Companion;
        if (companion.getInstance().getConfiguration().getDebugMode()) {
            pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - on color changed, currentColor=" + rgbColor);
        }
        FaceCaptchaManager faceCaptchaManager = this.faceCaptchaManager;
        if (faceCaptchaManager != null) {
            faceCaptchaManager.setColorDisplayInfo(faceCaptchaManager.getColorDisplayInfo() + "SequenceNumber=" + i + " CurrentColor=" + rgbColor + " CurrentColorStartTimestamp=" + j + " PreviousColor=" + rgbColor2 + "\n");
        }
        String str = "[" + rgbColor.getRed() + ", " + rgbColor.getGreen() + ", " + rgbColor.getBlue() + ", " + rgbColor.getAlpha() + "]";
        this._processState.setValue(new LivenessProcessState.ColorChanged(j));
        ColorEvent colorEvent = new ColorEvent(Long.valueOf(j), null, new int[]{rgbColor.getRed(), rgbColor.getGreen(), rgbColor.getBlue(), rgbColor.getAlpha()}, null, null, null, 2, null);
        FaceCaptchaManager faceCaptchaManager2 = this.faceCaptchaManager;
        if (faceCaptchaManager2 != null && (colorDisplayList = faceCaptchaManager2.getColorDisplayList()) != null) {
            colorDisplayList.add(colorEvent);
        }
        if (companion.getInstance().getConfiguration().getDebugMode()) {
            pUU.EZpvd(this.TAG, "onColorDisplayed, colorDisplayList add " + colorEvent);
            FaceCaptchaManager faceCaptchaManager3 = this.faceCaptchaManager;
            if (faceCaptchaManager3 == null || (qcScoreResult = faceCaptchaManager3.getQcScoreResult()) == null) {
                return;
            }
            qcScoreResult.addColor("color:" + str);
        }
    }

    public final void onColorChallengeComplete(long j) {
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - color challenge complete");
        FaceCaptchaManager faceCaptchaManager = this.faceCaptchaManager;
        if (faceCaptchaManager != null) {
            faceCaptchaManager.onFreshnessComplete();
        }
        this._processState.setValue(new LivenessProcessState.ColorChallengeComplete(j));
        transitionToFinalCheckView();
    }

    public final void freshnessStarted() {
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - color freshness started");
        this._processState.setValue(LivenessProcessState.ColorFreshnessStarted.INSTANCE);
    }

    public final void freshnessCompleted() {
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - color freshness completed");
        this._processState.setValue(LivenessProcessState.ColorFreshnessCompleted.INSTANCE);
    }

    public final void cancelColorChallenge() {
        this.colorChallenging = false;
        pUU.valueOf(this.TAG, "cancelColorChallenge, colorDisplayList clear()");
        FaceCaptchaManager faceCaptchaManager = this.faceCaptchaManager;
        if (faceCaptchaManager != null) {
            faceCaptchaManager.splashInterrupt();
        }
        this._processState.setValue(LivenessProcessState.ColorChallengeCancelled.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$onVideoSegmentReady$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $bytes;
        final /* synthetic */ long $timestamp;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17271(byte[] bArr, long j, Continuation<? super C17271> continuation) {
            super(2, continuation);
            this.$bytes = bArr;
            this.$timestamp = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new C17271(this.$bytes, this.$timestamp, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                LcaLivenessScanViewModel.this.webSocketManager.sendVideoSegment(this.$bytes);
                Function2<byte[], Long, Unit> videoSegmentCallback = LcaSdkManager.Companion.getInstance().getVideoSegmentCallback();
                if (videoSegmentCallback != null) {
                    videoSegmentCallback.invoke(this.$bytes, C56443yFo.KWHzl(this.$timestamp));
                }
                LcaLivenessScanViewModel.this._processState.setValue(new LivenessProcessState.VideoSegmentReady(this.$bytes, this.$timestamp));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onVideoSegmentReady(@NotNull byte[] bArr, long j) {
        Intrinsics.checkNotNullParameter(bArr, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C17271(bArr, j, null), 2, null);
    }

    public final void onVideoRecordingComplete(long j, @NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "");
        if (this.readySession) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C17261(j, file, null), 3, null);
        } else {
            pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - session stopped, skip video param upload");
        }
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$onVideoRecordingComplete$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ File $file;
        final /* synthetic */ long $timestamp;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17261(long j, File file, Continuation<? super C17261> continuation) {
            super(2, continuation);
            this.$timestamp = j;
            this.$file = file;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new C17261(this.$timestamp, this.$file, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                FaceCaptchaManager faceCaptchaManager = LcaLivenessScanViewModel.this.getFaceCaptchaManager();
                if (faceCaptchaManager != null) {
                    faceCaptchaManager.setDeviceToken(rTL.OLrzqt.EZpvd());
                }
                FaceCaptchaManager faceCaptchaManager2 = LcaLivenessScanViewModel.this.getFaceCaptchaManager();
                if (faceCaptchaManager2 != null) {
                    faceCaptchaManager2.setVideoEndTimestamp(this.$timestamp);
                }
                FaceCaptchaManager faceCaptchaManager3 = LcaLivenessScanViewModel.this.getFaceCaptchaManager();
                if (faceCaptchaManager3 != null) {
                    faceCaptchaManager3.setTempOutputFile(this.$file);
                }
                LcaSdkManager.Companion companion = LcaSdkManager.Companion;
                Function1<LcaDebugInfo, Unit> debugInfoCallback = companion.getInstance().getDebugInfoCallback();
                if (debugInfoCallback != null) {
                    debugInfoCallback.invoke(new LcaDebugInfo(null, null, this.$file, null, 11, null));
                }
                int apiMode = companion.getInstance().getConfiguration().getApiMode();
                LcaSdkConfiguration.Companion companion2 = LcaSdkConfiguration.Companion;
                if (apiMode == companion2.getAPI_COMPLIANCE()) {
                    LcaLivenessScanViewModel.this.uploadDescriptiveDataJwst(true);
                } else if (companion.getInstance().getConfiguration().getApiMode() == companion2.getAPI_MODE_JWST()) {
                    LcaLivenessScanViewModel.this.uploadDescriptiveDataJwst(false);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final boolean checkReady(String str) {
        boolean z = this.readySession;
        this.allReady = z && this.readyCamera && this.readyPreview && this.readyConfig && this.readyConnection && this.readyFaceOval;
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - trigger check ready, label: " + str + ", readySession=" + z + " readyCamera=" + this.readyCamera + " readyPreview=" + this.readyPreview + " readyConfig=" + this.readyConfig + " readyConnection=" + this.readyConnection + " readyFaceOval=" + this.readyFaceOval);
        if (this.readyCamera && this.readyConfig && this.readyPreview && !this.faceOvalInited) {
            this.faceOvalInited = true;
            this._processState.setValue(LivenessProcessState.FaceOvalInitialized.INSTANCE);
        }
        if (this.allReady) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        }
        return this.allReady;
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$checkReady$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                LcaLivenessScanViewModel.this.transitionToFarSelfieView();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$transitionToFarSelfieView$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17301(Continuation<? super C17301> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new C17301(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                LcaLivenessScanViewModel.this._uiState.setValue(LivenessUIState.FarSelfie.INSTANCE);
                LcaLivenessScanViewModel.this.allReady = true;
                FaceCaptchaManager faceCaptchaManager = LcaLivenessScanViewModel.this.getFaceCaptchaManager();
                if (faceCaptchaManager != null) {
                    faceCaptchaManager.onCaptchaReady();
                }
                FaceCaptchaManager faceCaptchaManager2 = LcaLivenessScanViewModel.this.getFaceCaptchaManager();
                if (faceCaptchaManager2 != null) {
                    faceCaptchaManager2.addSensorReadingWithEvent("selfie_far");
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void transitionToFarSelfieView() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C17301(null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$transitionToCloseSelfieView$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17291(Continuation<? super C17291> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new C17291(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                long jCurrentTimeMillis = System.currentTimeMillis();
                FaceCaptchaManager faceCaptchaManager = LcaLivenessScanViewModel.this.getFaceCaptchaManager();
                if (faceCaptchaManager != null) {
                    faceCaptchaManager.setFaceDistanceCheckEndTime(jCurrentTimeMillis);
                }
                LcaLivenessScanViewModel.this._processState.setValue(new LivenessProcessState.FaceDistanceCheckEnded(jCurrentTimeMillis));
                LcaLivenessScanViewModel.this._uiState.setValue(LivenessUIState.CloseSelfie.INSTANCE);
                FaceCaptchaManager faceCaptchaManager2 = LcaLivenessScanViewModel.this.getFaceCaptchaManager();
                if (faceCaptchaManager2 != null) {
                    faceCaptchaManager2.addSensorReadingWithEvent("selfie_close");
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void transitionToCloseSelfieView() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C17291(null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$transitionToFinalCheckView$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17311(Continuation<? super C17311> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new C17311(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                LcaLivenessScanViewModel.this._uiState.setValue(LivenessUIState.FinalCheck.INSTANCE);
                FaceCaptchaManager faceCaptchaManager = LcaLivenessScanViewModel.this.getFaceCaptchaManager();
                if (faceCaptchaManager != null) {
                    faceCaptchaManager.addSensorReadingWithEvent("final_check");
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void transitionToFinalCheckView() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C17311(null), 2, null);
    }

    public final void uploadDescriptiveDataJwst(boolean z) {
        FaceCaptchaManager faceCaptchaManager;
        ArrayList<ColorEvent> colorDisplayList;
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - upload whole final descriptive params");
        if (z && (faceCaptchaManager = this.faceCaptchaManager) != null && (colorDisplayList = faceCaptchaManager.getColorDisplayList()) != null) {
            Iterator<T> it = colorDisplayList.iterator();
            while (it.hasNext()) {
                List<Double> qcScores = ((ColorEvent) it.next()).getQcScores();
                if (qcScores != null) {
                    qcScores.clear();
                }
            }
        }
        FaceCaptchaManager faceCaptchaManager2 = this.faceCaptchaManager;
        if (faceCaptchaManager2 != null) {
            LivenessProcessState.DescriptiveDataReady descriptiveDataReady = new LivenessProcessState.DescriptiveDataReady(faceCaptchaManager2.getVideoStartTimestamp(), faceCaptchaManager2.getVideoEndTimestamp(), faceCaptchaManager2.getFaceDistanceCheckStartTime(), faceCaptchaManager2.getFaceDistanceCheckStartIndex(), faceCaptchaManager2.getFaceDistanceCheckEndIndex(), faceCaptchaManager2.getFaceDistanceCheckEndTime() - faceCaptchaManager2.getFaceDistanceCheckStartTime(), faceCaptchaManager2.getColorDisplayList(), faceCaptchaManager2.getDeviceToken(), faceCaptchaManager2.getExtras());
            pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - Extras before WebSocket send:");
            Map<String, Object> extras = descriptiveDataReady.getExtras();
            if (extras != null) {
                for (Map.Entry<String, Object> entry : extras.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness -   - " + key + ": " + value);
                }
            }
            this.webSocketManager.sendFinalDescriptiveParams(descriptiveDataReady.getVideoStartTimestamp(), descriptiveDataReady.getVideoEndTimestamp(), descriptiveDataReady.getFaceDistanceCheckStartTime(), descriptiveDataReady.getFaceDistanceCheckStartIndex(), descriptiveDataReady.getFaceDistanceCheckEndIndex(), descriptiveDataReady.getFaceDistanceCheckDuration(), descriptiveDataReady.getColorDisplayList(), descriptiveDataReady.getDeviceToken(), descriptiveDataReady.getExtras());
            this._processState.setValue(descriptiveDataReady);
        }
    }

    public final void uploadDescriptiveDataAiAlgoApi() throws JSONException {
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - upload descriptive data to test AI api");
        FaceCaptchaManager faceCaptchaManager = this.faceCaptchaManager;
        if (faceCaptchaManager != null) {
            LcaDebugAiAlgoRepository.Companion.getInstance().uploadVideo(faceCaptchaManager.getTempOutputFile(), faceCaptchaManager.getVideoStartTimestamp(), faceCaptchaManager.getVideoEndTimestamp(), faceCaptchaManager.getFaceDistanceCheckStartTime(), faceCaptchaManager.getFaceDistanceCheckStartIndex(), faceCaptchaManager.getFaceDistanceCheckEndIndex(), faceCaptchaManager.getFaceDistanceCheckEndTime() - faceCaptchaManager.getFaceDistanceCheckStartTime(), faceCaptchaManager.getColorDisplayList(), LcaSdkManager.Companion.getInstance().getConfiguration().getApiMode(), new Function1() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$$ExternalSyntheticLambda7
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LcaLivenessScanViewModel.uploadDescriptiveDataAiAlgoApi$lambda$15$lambda$13(this.f$0, (LivenessResponse) obj);
                }
            }, new Function1() { // from class: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$$ExternalSyntheticLambda8
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LcaLivenessScanViewModel.uploadDescriptiveDataAiAlgoApi$lambda$15$lambda$14(this.f$0, (String) obj);
                }
            });
        }
    }

    public static final Unit uploadDescriptiveDataAiAlgoApi$lambda$15$lambda$13(LcaLivenessScanViewModel lcaLivenessScanViewModel, LivenessResponse livenessResponse) {
        Intrinsics.checkNotNullParameter(livenessResponse, "");
        pUU.KWHzl(lcaLivenessScanViewModel.KYC_LOG_TAG, "LCA liveness - AI api success");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(lcaLivenessScanViewModel), Dispatchers.getMain(), null, new LcaLivenessScanViewModel$uploadDescriptiveDataAiAlgoApi$1$1$1(lcaLivenessScanViewModel, livenessResponse, null), 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit uploadDescriptiveDataAiAlgoApi$lambda$15$lambda$14(LcaLivenessScanViewModel lcaLivenessScanViewModel, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(lcaLivenessScanViewModel.KYC_LOG_TAG, "LCA liveness - AI api error");
        lcaLivenessScanViewModel.handleNetworkError(LcaSdkConfiguration.Companion.getRETRY_REASON_HTTP_ERROR(), new Throwable("AI internal API error=" + str));
        return Unit.INSTANCE;
    }

    public final void setCameraReady(boolean z) {
        this.readyCamera = z;
        checkReady("camera_ready_" + z);
    }

    public final void setPreviewReady(boolean z) {
        this.readyPreview = z;
        checkReady("preview_ready_" + z);
    }

    public final void setFaceOvalReady(boolean z) {
        this.readyFaceOval = z;
        checkReady("face_oval_ready_" + z);
    }

    public final void handleTimeout(@NotNull TimeoutType timeoutType) {
        Intrinsics.checkNotNullParameter(timeoutType, "");
        pUU.KWHzl(this.KYC_LOG_TAG, "LCA liveness - timeout occurred");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C17211(timeoutType, this, null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$handleTimeout$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TimeoutType $type;
        int label;
        final /* synthetic */ LcaLivenessScanViewModel this$0;

        /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$handleTimeout$1$WhenMappings */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TimeoutType.values().length];
                try {
                    iArr[TimeoutType.FLASH_TIMEOUT_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TimeoutType.LIVENESS_TIMEOUT_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17211(TimeoutType timeoutType, LcaLivenessScanViewModel lcaLivenessScanViewModel, Continuation<? super C17211> continuation) {
            super(2, continuation);
            this.$type = timeoutType;
            this.this$0 = lcaLivenessScanViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17211(this.$type, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LcaJwstWsCloseStatus livenessFlashTimeoutError;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                int i = WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()];
                if (i == 1) {
                    livenessFlashTimeoutError = new LcaJwstWsCloseStatus.LivenessFlashTimeoutError(null, 1, null);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    livenessFlashTimeoutError = new LcaJwstWsCloseStatus.LivenessTimeoutError(null, 1, null);
                }
                this.this$0.webSocketManager.disconnect(livenessFlashTimeoutError);
                LiveEvent liveEvent = this.this$0._timeoutEvent;
                Unit unit = Unit.INSTANCE;
                liveEvent.setValue(unit);
                return unit;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void handleLocalError(String str, Throwable th) {
        pUU.valueOf(this.KYC_LOG_TAG, "LCA liveness - handle local error: reason=" + str + ", exception=" + th);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C17191(str, th, null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$handleLocalError$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Throwable $exception;
        final /* synthetic */ String $reason;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17191(String str, Throwable th, Continuation<? super C17191> continuation) {
            super(2, continuation);
            this.$reason = str;
            this.$exception = th;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new C17191(this.$reason, this.$exception, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                LcaLivenessScanViewModel.this._localErrorEvent.setValue(new Pair(this.$reason, this.$exception));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void handleNetworkError(String str, Throwable th) {
        pUU.valueOf(this.KYC_LOG_TAG, "LCA liveness - handle network error: reason=" + str + ", exception=" + th);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new C17201(str, th, null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.ui.LcaLivenessScanViewModel$handleNetworkError$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Throwable $exception;
        final /* synthetic */ String $reason;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17201(String str, Throwable th, Continuation<? super C17201> continuation) {
            super(2, continuation);
            this.$reason = str;
            this.$exception = th;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LcaLivenessScanViewModel.this.new C17201(this.$reason, this.$exception, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                LcaLivenessScanViewModel.this._networkErrorEvent.setValue(new Pair(this.$reason, this.$exception));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final String getCurrentProcessState() {
        String str;
        LivenessUIState value = this._uiState.getValue();
        if (Intrinsics.EZpvd(value, LivenessUIState.StartingUp.INSTANCE)) {
            str = "starting_up";
        } else if (Intrinsics.EZpvd(value, LivenessUIState.FarSelfie.INSTANCE)) {
            str = this.colorChallenging ? "color_challenging" : "selfie_far";
        } else if (Intrinsics.EZpvd(value, LivenessUIState.CloseSelfie.INSTANCE)) {
            str = "selfie_close";
        } else if (Intrinsics.EZpvd(value, LivenessUIState.FinalCheck.INSTANCE)) {
            str = "final_check";
        } else {
            if (!Intrinsics.EZpvd(value, LivenessUIState.Error.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            str = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
        }
        FaceCaptchaManager faceCaptchaManager = this.faceCaptchaManager;
        if (faceCaptchaManager != null) {
            faceCaptchaManager.addSensorReadingWithEvent(str);
        }
        return str;
    }

    public final void setupColorChallengePool(List<WSAuthResponseMsgColorSequence> list) {
        MutableLiveData<ColorChallengeSequence> mutableLiveData = this._colorChallengeSequence;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (WSAuthResponseMsgColorSequence wSAuthResponseMsgColorSequence : list) {
            arrayList.add(new ColorChallengeElement(new RgbColor(wSAuthResponseMsgColorSequence.getRgba().get(0).intValue(), wSAuthResponseMsgColorSequence.getRgba().get(1).intValue(), wSAuthResponseMsgColorSequence.getRgba().get(2).intValue(), wSAuthResponseMsgColorSequence.getRgba().get(3).intValue()), wSAuthResponseMsgColorSequence.getDuration()));
        }
        mutableLiveData.setValue(new ColorChallengeSequence(arrayList));
    }
}

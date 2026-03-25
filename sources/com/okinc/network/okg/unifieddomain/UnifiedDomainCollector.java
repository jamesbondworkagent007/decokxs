package com.okinc.network.okg.unifieddomain;

import android.content.Context;
import android.net.NetworkInfo;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.network.okg.unifieddomain.UnifiedDomainCollector;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C32979mnm;
import o.C43292rmY;
import o.C43381roH;
import o.C43385roL;
import o.C43417ror;
import o.C43457rpe;
import o.C54819xWm;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC43387roN;
import o.InterfaceC54816xWj;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class UnifiedDomainCollector {
    private static final String CONST_KEY_COUNTRY_CODE = "countryCode";
    private static final String DEFAULT_COUNTRY_CODE = "CN";
    private static final String PREFIX_DOMAIN_CONTENT = "DOMAIN_URL_";
    private static final String PREFIX_HEADER_NAME = "HEADER_NAME_";
    private static final long RETRY_INTERVAL_MILLIS = 60000;
    private static final String TAG = "UnifiedDomainCollector";
    private final InterfaceC43387roN apiService;
    private final InterfaceC54816xWj appBackground;
    private String countryCode;
    private final CoroutineDispatcher dispatcher;
    private final C43381roH domainProcessor;
    private final C43385roL domainRegistry;
    private final Map<String, String> headersMap;
    private final AtomicBoolean isInitSuccess;
    private AtomicBoolean mIsEnterForeground;
    private final C43457rpe.ActionBar networkMonitor;
    private final Function0<Unit> reportIPInfoCallback;
    private Job retryJob;
    private final ConcurrentHashMap<DomainConfigType, String> type2DomainMap;
    private final Map<DomainConfigType, String> type2HeaderMap;
    private final Channel<Unit> updateChannel;
    private final Set<String> xCdnDomains;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.okinc.network.okg.unifieddomain.UnifiedDomainCollector$handleResponse$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnifiedDomainCollector.this.handleResponse(null, this);
        }
    }

    /* JADX INFO: renamed from: com.okinc.network.okg.unifieddomain.UnifiedDomainCollector$performUpdate$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17391 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17391(Continuation<? super C17391> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnifiedDomainCollector.this.performUpdate(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnifiedDomainCollector() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ void getAppBackground$OKNetwork_network$annotations() {
    }

    public static /* synthetic */ void getNetworkMonitor$OKNetwork_network$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC54816xWj getAppBackground$OKNetwork_network() {
        return this.appBackground;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getHeadersMap() {
        return this.headersMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43457rpe.ActionBar getNetworkMonitor$OKNetwork_network() {
        return this.networkMonitor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<String> getXCdnDomains() {
        return this.xCdnDomains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AtomicBoolean isInitSuccess() {
        return this.isInitSuccess;
    }

    public UnifiedDomainCollector(@NotNull CoroutineDispatcher coroutineDispatcher, Function0<Unit> function0, @NotNull C43381roH c43381roH, @NotNull C43385roL c43385roL, @NotNull InterfaceC43387roN interfaceC43387roN) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c43381roH, "");
        Intrinsics.checkNotNullParameter(c43385roL, "");
        Intrinsics.checkNotNullParameter(interfaceC43387roN, "");
        this.dispatcher = coroutineDispatcher;
        this.reportIPInfoCallback = function0;
        this.domainProcessor = c43381roH;
        this.domainRegistry = c43385roL;
        this.apiService = interfaceC43387roN;
        this.mIsEnterForeground = new AtomicBoolean(false);
        this.type2DomainMap = new ConcurrentHashMap<>();
        Map<DomainConfigType, String> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "");
        this.type2HeaderMap = mapSynchronizedMap;
        this.updateChannel = ChannelKt.Channel$default(0, null, null, 6, null);
        this.countryCode = DEFAULT_COUNTRY_CODE;
        this.isInitSuccess = new AtomicBoolean(false);
        this.xCdnDomains = new LinkedHashSet();
        this.headersMap = new ConcurrentHashMap();
        this.appBackground = new Application();
        this.networkMonitor = new C43457rpe.ActionBar() { // from class: o.roO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C43457rpe.ActionBar
            public final void copydefault(boolean z, android.net.NetworkInfo networkInfo) {
                UnifiedDomainCollector.networkMonitor$lambda$0(this.EZpvd, z, networkInfo);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UnifiedDomainCollector(CoroutineDispatcher coroutineDispatcher, Function0 function0, C43381roH c43381roH, C43385roL c43385roL, InterfaceC43387roN interfaceC43387roN, int i, DefaultConstructorMarker defaultConstructorMarker) {
        coroutineDispatcher = (i & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher;
        this(coroutineDispatcher, (i & 2) != 0 ? C43292rmY.OLrzqt.getNewProxyInstance() : function0, (i & 4) != 0 ? new C43381roH(null, coroutineDispatcher, null, 5, null) : c43381roH, (i & 8) != 0 ? C43385roL.Companion.EZpvd() : c43385roL, (i & 16) != 0 ? (InterfaceC43387roN) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC43387roN.class)) : interfaceC43387roN);
    }

    public static final class Application implements InterfaceC54816xWj {
        public Application() {
        }

        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            UnifiedDomainCollector.this.mIsEnterForeground.set(true);
            UnifiedDomainCollector.this.requestDomainsConfig();
            Function0 function0 = UnifiedDomainCollector.this.reportIPInfoCallback;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
            UnifiedDomainCollector.this.mIsEnterForeground.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void networkMonitor$lambda$0(UnifiedDomainCollector unifiedDomainCollector, boolean z, NetworkInfo networkInfo) {
        pUU.EZpvd(TAG, "onNetworkStatusChanged isConnected:" + z);
        if (z && unifiedDomainCollector.mIsEnterForeground.get()) {
            unifiedDomainCollector.requestDomainsConfig();
            Function0<Unit> function0 = unifiedDomainCollector.reportIPInfoCallback;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        readFromLocal();
        C54819xWm.KWHzl().AEQbTJ(this.appBackground);
        C43457rpe.OLrzqt(context).EZpvd(this.networkMonitor);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(this.dispatcher)), null, null, new C17381(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.network.okg.unifieddomain.UnifiedDomainCollector$init$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17381(Continuation<? super C17381> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UnifiedDomainCollector.this.new C17381(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow flowReceiveAsFlow = FlowKt.receiveAsFlow(UnifiedDomainCollector.this.updateChannel);
                final UnifiedDomainCollector unifiedDomainCollector = UnifiedDomainCollector.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.network.okg.unifieddomain.UnifiedDomainCollector.init.1.1
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) throws Throwable {
                        Object objPerformUpdate = unifiedDomainCollector.performUpdate(continuation);
                        return objPerformUpdate == C56442yFn.copydefault() ? objPerformUpdate : Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowReceiveAsFlow.collect(flowCollector, this) == objCopydefault) {
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
    }

    private final Map<String, String> generateHeadersMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<DomainConfigType, String> entry : this.type2HeaderMap.entrySet()) {
            DomainConfigType key = entry.getKey();
            String value = entry.getValue();
            String str = this.type2DomainMap.get(key);
            if (value != null && !StringsKt__StringsKt.fARcdN((CharSequence) value) && str != null && !StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                linkedHashMap.put(value, str);
            }
        }
        return linkedHashMap;
    }

    public final String getDomainByType(@NotNull DomainConfigType domainConfigType) {
        Intrinsics.checkNotNullParameter(domainConfigType, "");
        return this.type2DomainMap.get(domainConfigType);
    }

    private final void readFromLocal() {
        this.countryCode = SPUtils.getString(CONST_KEY_COUNTRY_CODE, DEFAULT_COUNTRY_CODE);
        for (DomainConfigType domainConfigType : DomainConfigType.values()) {
            StateListAnimator stateListAnimator = Companion;
            String string = SPUtils.getString(stateListAnimator.OLrzqt(domainConfigType.getTypeName()), domainConfigType.getFallbackHeaderName());
            String string2 = SPUtils.getString(stateListAnimator.AEQbTJ(domainConfigType.getTypeName()), domainConfigType.getFallbackDomain());
            Intrinsics.checkNotNullExpressionValue(string2, "");
            applyTypeConfig(domainConfigType, string, string2);
        }
        Map<String, String> mapGenerateHeadersMap = generateHeadersMap();
        this.headersMap.clear();
        this.headersMap.putAll(mapGenerateHeadersMap);
        for (Map.Entry<String, String> entry : this.headersMap.entrySet()) {
            pUU.KWHzl(TAG, "unified domain map: " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    private final void applyTypeConfig(DomainConfigType domainConfigType, String str, String str2) {
        pUU.KWHzl(TAG, "applyTypeConfig- type: " + domainConfigType + ", headerName: " + str + ", domain: " + str2);
        this.type2HeaderMap.put(domainConfigType, str);
        StateListAnimator stateListAnimator = Companion;
        String strOLrzqt = stateListAnimator.OLrzqt(domainConfigType.getTypeName());
        if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            SPUtils.remove(strOLrzqt);
        } else {
            SPUtils.put(strOLrzqt, str);
        }
        if (str2 == null || StringsKt__StringsKt.fARcdN((CharSequence) str2)) {
            return;
        }
        this.type2DomainMap.put(domainConfigType, str2);
        SPUtils.put(stateListAnimator.AEQbTJ(domainConfigType.getTypeName()), str2);
        this.domainRegistry.AEQbTJ(domainConfigType.toDomainType(), str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestDomainsConfig() {
        pUU.KWHzl(TAG, "requestDomainsConfig, domain configuration update");
        this.updateChannel.mo5769trySendJP2dKIU(Unit.INSTANCE);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.roN.ActionBar.requestUnifyDomains$default(o.roN, com.okinc.network.okg.unifieddomain.DomainConfigRequest, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object performUpdate(Continuation<? super Unit> continuation) throws Throwable {
        C17391 c17391;
        UnifiedDomainCollector unifiedDomainCollector;
        UnifiedDomainCollector unifiedDomainCollector2;
        ResponseData responseData;
        Object data;
        if (continuation instanceof C17391) {
            c17391 = (C17391) continuation;
            int i = c17391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17391.label = i - Integer.MIN_VALUE;
            } else {
                c17391 = new C17391(continuation);
            }
        }
        Object objRequestUnifyDomains$default = c17391.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c17391.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objRequestUnifyDomains$default);
            pUU.KWHzl(TAG, "Starting domain configuration update");
            try {
                InterfaceC43387roN interfaceC43387roN = this.apiService;
                c17391.L$0 = this;
                c17391.label = 1;
                objRequestUnifyDomains$default = InterfaceC43387roN.ActionBar.requestUnifyDomains$default(interfaceC43387roN, null, c17391, 1, null);
                if (objRequestUnifyDomains$default == objCopydefault) {
                    return objCopydefault;
                }
                unifiedDomainCollector2 = this;
                responseData = (ResponseData) objRequestUnifyDomains$default;
                unifiedDomainCollector2.isInitSuccess.set(true);
                unifiedDomainCollector2.stopRetryTimer();
                pUU.KWHzl(TAG, "Domain update successful: " + responseData.getData());
                if (responseData.getCode() == 0) {
                    data = responseData.getData();
                    Intrinsics.copydefault(data);
                    c17391.L$0 = unifiedDomainCollector2;
                    c17391.label = 2;
                    if (unifiedDomainCollector2.handleResponse((DomainConfigResponse) data, c17391) == objCopydefault) {
                    }
                }
            } catch (Exception e) {
                e = e;
                unifiedDomainCollector = this;
                pUU.valueOf(TAG, "Domain update failed: " + e);
                if (!unifiedDomainCollector.isInitSuccess.get()) {
                }
            }
        } else if (i2 == 1) {
            unifiedDomainCollector2 = (UnifiedDomainCollector) c17391.L$0;
            try {
                C56391yDq.AEQbTJ(objRequestUnifyDomains$default);
                responseData = (ResponseData) objRequestUnifyDomains$default;
                unifiedDomainCollector2.isInitSuccess.set(true);
                unifiedDomainCollector2.stopRetryTimer();
                pUU.KWHzl(TAG, "Domain update successful: " + responseData.getData());
                if (responseData.getCode() == 0 && responseData.getData() != null) {
                    data = responseData.getData();
                    Intrinsics.copydefault(data);
                    c17391.L$0 = unifiedDomainCollector2;
                    c17391.label = 2;
                    if (unifiedDomainCollector2.handleResponse((DomainConfigResponse) data, c17391) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                unifiedDomainCollector = unifiedDomainCollector2;
                pUU.valueOf(TAG, "Domain update failed: " + e);
                if (!unifiedDomainCollector.isInitSuccess.get()) {
                    unifiedDomainCollector.startRetryTimer();
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            unifiedDomainCollector = (UnifiedDomainCollector) c17391.L$0;
            try {
                C56391yDq.AEQbTJ(objRequestUnifyDomains$default);
            } catch (Exception e3) {
                e = e3;
                pUU.valueOf(TAG, "Domain update failed: " + e);
                if (!unifiedDomainCollector.isInitSuccess.get()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleResponse(DomainConfigResponse domainConfigResponse, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        UnifiedDomainCollector unifiedDomainCollector;
        DomainConfigType domainConfigType;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objEZpvd = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            for (DomainConfig domainConfig : domainConfigResponse.getScenarios()) {
                if ((!domainConfig.getDomains().isEmpty()) && (domainConfigType = parseDomainConfigType(domainConfig.getScenario())) != null && !this.type2DomainMap.containsKey(domainConfigType)) {
                    applyTypeConfig(domainConfigType, domainConfig.getHeaderIdentifier(), domainConfig.getDomains().get(0));
                }
            }
            C43381roH c43381roH = this.domainProcessor;
            List<DomainConfig> scenarios = domainConfigResponse.getScenarios();
            String countryCode = domainConfigResponse.getCountryCode();
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = domainConfigResponse;
            anonymousClass1.label = 1;
            objEZpvd = c43381roH.EZpvd(scenarios, countryCode, anonymousClass1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            unifiedDomainCollector = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return Unit.INSTANCE;
            }
            domainConfigResponse = (DomainConfigResponse) anonymousClass1.L$1;
            unifiedDomainCollector = (UnifiedDomainCollector) anonymousClass1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        Map map = (Map) objEZpvd;
        String countryCode2 = domainConfigResponse.getCountryCode();
        unifiedDomainCollector.countryCode = countryCode2;
        SPUtils.put(CONST_KEY_COUNTRY_CODE, countryCode2);
        unifiedDomainCollector.xCdnDomains.clear();
        for (DomainConfig domainConfig2 : domainConfigResponse.getScenarios()) {
            String scenario = domainConfig2.getScenario();
            DomainConfigType domainConfigType2 = DomainConfigType.CDN;
            if (Intrinsics.EZpvd((Object) scenario, (Object) domainConfigType2.getTypeName())) {
                unifiedDomainCollector.xCdnDomains.addAll(domainConfig2.getDomains());
            }
            DomainConfigType domainConfigType3 = unifiedDomainCollector.parseDomainConfigType(domainConfig2.getScenario());
            if (domainConfigType3 != null) {
                unifiedDomainCollector.applyTypeConfig(domainConfigType3, domainConfig2.getHeaderIdentifier(), (String) map.get(domainConfig2.getScenario()));
                if (domainConfigType3 == domainConfigType2) {
                    unifiedDomainCollector.xCdnDomains.addAll(domainConfig2.getDomains());
                }
            }
        }
        Map<String, String> mapGenerateHeadersMap = unifiedDomainCollector.generateHeadersMap();
        unifiedDomainCollector.headersMap.clear();
        unifiedDomainCollector.headersMap.putAll(mapGenerateHeadersMap);
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        if (unifiedDomainCollector.checkCurrentAvailability$OKNetwork_network(domainConfigResponse, anonymousClass1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final Object checkCurrentAvailability$OKNetwork_network(@NotNull DomainConfigResponse domainConfigResponse, @NotNull Continuation<? super Unit> continuation) {
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<DomainConfigType, String> entry : this.type2DomainMap.entrySet()) {
            Iterator<T> it = domainConfigResponse.getScenarios().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((DomainConfig) next).getScenario(), (Object) entry.getKey().getTypeName())) {
                    break;
                }
            }
            DomainConfig domainConfig = (DomainConfig) next;
            if (domainConfig != null) {
                linkedHashMap.put(entry.getKey(), C56390yDp.OLrzqt(entry.getValue(), domainConfig.getDetectionPath()));
            }
        }
        Object objOLrzqt = this.domainProcessor.OLrzqt(linkedHashMap, continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    private final DomainConfigType parseDomainConfigType(String str) {
        DomainConfigType domainConfigTypeKWHzl = DomainConfigType.Companion.KWHzl(str);
        if (domainConfigTypeKWHzl == null) {
            pUU.valueOf(TAG, "Unknown domain config type: " + str);
        }
        return domainConfigTypeKWHzl;
    }

    /* JADX INFO: renamed from: com.okinc.network.okg.unifieddomain.UnifiedDomainCollector$startRetryTimer$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17401(Continuation<? super C17401> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UnifiedDomainCollector.this.new C17401(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C17401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002f -> B:14:0x0032). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!UnifiedDomainCollector.this.isInitSuccess().get()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd(UnifiedDomainCollector.TAG, "Retrying domain configuration update");
                UnifiedDomainCollector.this.updateChannel.mo5769trySendJP2dKIU(Unit.INSTANCE);
                if (!UnifiedDomainCollector.this.isInitSuccess().get()) {
                    this.label = 1;
                    if (DelayKt.delay(60000L, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    pUU.EZpvd(UnifiedDomainCollector.TAG, "Retrying domain configuration update");
                    UnifiedDomainCollector.this.updateChannel.mo5769trySendJP2dKIU(Unit.INSTANCE);
                    if (!UnifiedDomainCollector.this.isInitSuccess().get()) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    private final void startRetryTimer() {
        Job job = this.retryJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.retryJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(this.dispatcher)), null, null, new C17401(null), 3, null);
    }

    private final void stopRetryTimer() {
        Job job = this.retryJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.retryJob = null;
    }

    public final void cleanup() {
        stopRetryTimer();
        C54819xWm.KWHzl().KWHzl(this.appBackground);
        C43457rpe.OLrzqt(C32979mnm.EZpvd.OLrzqt()).AEQbTJ(this.networkMonitor);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.network.okg.unifieddomain.UnifiedDomainCollector.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String OLrzqt(String str) {
            return UnifiedDomainCollector.PREFIX_HEADER_NAME + str;
        }

        public final String AEQbTJ(String str) {
            return UnifiedDomainCollector.PREFIX_DOMAIN_CONTENT + str;
        }
    }
}

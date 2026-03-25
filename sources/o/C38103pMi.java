package o;

import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import com.okinc.lifecycle.impl.deeplink.processor.DeeplinkProcessorImpl$checkForCompliance$1;
import com.okinc.lifecycle.impl.deeplink.processor.DeeplinkProcessorImpl$observeLockScreenState$$inlined$filter$1$2$1;
import com.okinc.lifecycle.impl.deeplink.processor.DeeplinkProcessorImpl$observeLockScreenState$3;
import com.okinc.lifecycle.impl.deeplink.processor.DeeplinkProcessorImpl$proceedToModeSwitching$1;
import com.okinc.lifecycle.impl.deeplink.processor.DeeplinkProcessorImpl$processDeeplinkMetaData$1;
import com.okinc.lifecycle.impl.deeplink.processor.DeeplinkProcessorImpl$resolveDeeplinkHandler$1;
import com.okinc.lifecycle.impl.deeplink.processor.DeeplinkProcessorImpl$validate$1;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pMi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38103pMi extends C38097pMc implements InterfaceC38101pMg {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC38089pLv AEQbTJ;
    public final pMX AYXKKw;
    public final C38064pKx AhwBna;
    public final Function2<java.lang.String, java.lang.String, Unit> AkhnZx;
    public final InterfaceC38118pMx EZpvd;
    public final InterfaceC38114pMt OLrzqt;
    public final InterfaceC38081pLn copydefault;
    public final Function0<java.lang.Boolean> djBIcL;
    public final InterfaceC47278tmy fIwbmz;
    public boolean fetchVPNInfo;
    public final pMV gEmmrt;
    public final Function1<java.lang.String, Unit> isConnected;
    public final InterfaceC38084pLq valueOf;

    /* JADX INFO: renamed from: o.pMi$TaskDescription */
    public static final class TaskDescription implements Flow<java.lang.Boolean> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.pMi$TaskDescription$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                DeeplinkProcessorImpl$observeLockScreenState$$inlined$filter$1$2$1 deeplinkProcessorImpl$observeLockScreenState$$inlined$filter$1$2$1;
                if (continuation instanceof DeeplinkProcessorImpl$observeLockScreenState$$inlined$filter$1$2$1) {
                    deeplinkProcessorImpl$observeLockScreenState$$inlined$filter$1$2$1 = (DeeplinkProcessorImpl$observeLockScreenState$$inlined$filter$1$2$1) continuation;
                    int i = deeplinkProcessorImpl$observeLockScreenState$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        deeplinkProcessorImpl$observeLockScreenState$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        deeplinkProcessorImpl$observeLockScreenState$$inlined$filter$1$2$1 = new DeeplinkProcessorImpl$observeLockScreenState$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = deeplinkProcessorImpl$observeLockScreenState$$inlined$filter$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = deeplinkProcessorImpl$observeLockScreenState$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        deeplinkProcessorImpl$observeLockScreenState$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, deeplinkProcessorImpl$observeLockScreenState$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Boolean> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @yCM
    public C38103pMi(@NotNull pMX pmx, @NotNull pMV pmv, @NotNull C38064pKx c38064pKx, @NotNull InterfaceC38081pLn interfaceC38081pLn, @NotNull InterfaceC38084pLq interfaceC38084pLq, @NotNull InterfaceC38089pLv interfaceC38089pLv, @NotNull InterfaceC38118pMx interfaceC38118pMx, @NotNull InterfaceC38114pMt interfaceC38114pMt, @NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2, @NotNull Function0<java.lang.Boolean> function0, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        super(pmx, pmv, interfaceC38081pLn, interfaceC38084pLq);
        Intrinsics.checkNotNullParameter(pmx, "");
        Intrinsics.checkNotNullParameter(pmv, "");
        Intrinsics.checkNotNullParameter(c38064pKx, "");
        Intrinsics.checkNotNullParameter(interfaceC38081pLn, "");
        Intrinsics.checkNotNullParameter(interfaceC38084pLq, "");
        Intrinsics.checkNotNullParameter(interfaceC38089pLv, "");
        Intrinsics.checkNotNullParameter(interfaceC38118pMx, "");
        Intrinsics.checkNotNullParameter(interfaceC38114pMt, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.AYXKKw = pmx;
        this.gEmmrt = pmv;
        this.AhwBna = c38064pKx;
        this.copydefault = interfaceC38081pLn;
        this.valueOf = interfaceC38084pLq;
        this.AEQbTJ = interfaceC38089pLv;
        this.EZpvd = interfaceC38118pMx;
        this.OLrzqt = interfaceC38114pMt;
        this.isConnected = function1;
        this.AkhnZx = function2;
        this.djBIcL = function0;
        this.fIwbmz = interfaceC47278tmy;
    }

    /* JADX INFO: renamed from: o.pMi$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pMi.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC38101pMg
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull pLI pli, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        this.AkhnZx.invoke("DeeplinkProcessorImpl", "process deeplink - " + str);
        OLrzqt(pli, z);
        if (this.AYXKKw.AEQbTJ()) {
            java.lang.Object objEZpvd = EZpvd(str, continuation);
            return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
        }
        java.lang.Object objAEQbTJ = AEQbTJ(str, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    public final java.lang.Object EZpvd(java.lang.String str, Continuation<? super java.lang.Boolean> continuation) {
        return FlowKt.first(new TaskDescription(this.AYXKKw.EZpvd()), new DeeplinkProcessorImpl$observeLockScreenState$3(this, str, null), continuation);
    }

    public final java.lang.Object AEQbTJ(java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        this.AkhnZx.invoke("DeeplinkProcessorImpl", "startProcessingDeeplink deeplink - " + str);
        this.fetchVPNInfo = false;
        pMC pmcEZpvd = this.EZpvd.EZpvd(str);
        kotlin.Pair<InterfaceC43233rlS, java.util.Map<java.lang.String, java.lang.Object>> pairCopydefault = copydefault(pmcEZpvd.copydefault());
        if (pairCopydefault.getFirst() != null) {
            InterfaceC43233rlS first = pairCopydefault.getFirst();
            Intrinsics.copydefault(first);
            java.lang.Object objEZpvd = EZpvd(new kotlin.Pair<>(first, pairCopydefault.getSecond()), pmcEZpvd.copydefault(), continuation);
            return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
        }
        C38097pMc.finishProcessing$default(this, LinkState.NO_SUPPORTED_HANDLER, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(kotlin.Pair<? extends InterfaceC43233rlS, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> pair, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        DeeplinkProcessorImpl$processDeeplinkMetaData$1 deeplinkProcessorImpl$processDeeplinkMetaData$1;
        C38103pMi c38103pMi;
        kotlin.Pair<? extends InterfaceC43233rlS, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> pair2;
        C38103pMi c38103pMi2;
        java.lang.String strCopydefault;
        InterfaceC43233rlS first;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map;
        if (continuation instanceof DeeplinkProcessorImpl$processDeeplinkMetaData$1) {
            deeplinkProcessorImpl$processDeeplinkMetaData$1 = (DeeplinkProcessorImpl$processDeeplinkMetaData$1) continuation;
            int i = deeplinkProcessorImpl$processDeeplinkMetaData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deeplinkProcessorImpl$processDeeplinkMetaData$1.label = i - Integer.MIN_VALUE;
            } else {
                deeplinkProcessorImpl$processDeeplinkMetaData$1 = new DeeplinkProcessorImpl$processDeeplinkMetaData$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = deeplinkProcessorImpl$processDeeplinkMetaData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deeplinkProcessorImpl$processDeeplinkMetaData$1.label;
        boolean zBooleanValue = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (this.fIwbmz.fetchVPNInfo() && !pair.getFirst().EZpvd()) {
                C38097pMc.finishProcessing$default(this, LinkState.DEEPLINK_NOT_SUPPORTED_IN_RBAC_ACCOUNT, false, 2, null);
                return Unit.INSTANCE;
            }
            if (this.fIwbmz.isConnected() && !pair.getFirst().AYXKKw()) {
                C38097pMc.finishProcessing$default(this, LinkState.DEEPLINK_NOT_SUPPORTED_IN_RM_ACCOUNT, false, 2, null);
                return Unit.INSTANCE;
            }
            if (this.djBIcL.invoke().booleanValue() && (pair.getFirst().copydefault() || (pair.getFirst().KWHzl() != DeeplinkMode.WALLET && pair.getFirst().KWHzl() != DeeplinkMode.APP))) {
                C38097pMc.finishProcessing$default(this, LinkState.DEEPLINK_NOT_SUPPORTED_IN_WALLET_APP, false, 2, null);
                return Unit.INSTANCE;
            }
            java.lang.Object orDefault = pair.getSecond().getOrDefault("shortCode", null);
            if (orDefault != null) {
                this.valueOf.KWHzl(orDefault.toString());
            }
            if (pair.getSecond().getOrDefault("isOpenInAppCTA", null) != null) {
                this.valueOf.copydefault();
                this.AhwBna.EZpvd(str);
            }
            this.AYXKKw.OLrzqt(pair.getSecond(), str);
            this.fetchVPNInfo = pair.getFirst().copydefault() && !this.AYXKKw.KWHzl();
            if (!pair.getFirst().copydefault()) {
                c38103pMi = this;
                if (!zBooleanValue) {
                    if (c38103pMi.fetchVPNInfo) {
                        deeplinkProcessorImpl$processDeeplinkMetaData$1.L$0 = c38103pMi;
                        deeplinkProcessorImpl$processDeeplinkMetaData$1.L$1 = pair;
                        deeplinkProcessorImpl$processDeeplinkMetaData$1.L$2 = str;
                        deeplinkProcessorImpl$processDeeplinkMetaData$1.label = 2;
                        if (DelayKt.delay(500L, deeplinkProcessorImpl$processDeeplinkMetaData$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        pair2 = pair;
                        c38103pMi2 = c38103pMi;
                        strCopydefault = c38103pMi2.OLrzqt.copydefault(str);
                        InterfaceC38089pLv interfaceC38089pLv = c38103pMi2.AEQbTJ;
                        if (strCopydefault != null) {
                            strCopydefault = str;
                            kotlin.Pair<InterfaceC43233rlS, java.util.Map<java.lang.String, java.lang.Object>> pairOLrzqt = interfaceC38089pLv.OLrzqt(pair2, strCopydefault);
                            first = pairOLrzqt.getFirst();
                            map = (java.util.Map) pairOLrzqt.getSecond();
                            deeplinkProcessorImpl$processDeeplinkMetaData$1.L$0 = c38103pMi2;
                            deeplinkProcessorImpl$processDeeplinkMetaData$1.L$1 = null;
                            deeplinkProcessorImpl$processDeeplinkMetaData$1.L$2 = null;
                            deeplinkProcessorImpl$processDeeplinkMetaData$1.label = 3;
                            if (c38103pMi2.KWHzl(first, str, map, deeplinkProcessorImpl$processDeeplinkMetaData$1) == objCopydefault) {
                            }
                            c38103pMi2.fetchVPNInfo = false;
                        }
                        return Unit.INSTANCE;
                    }
                    InterfaceC43233rlS first2 = pair.getFirst();
                    java.util.Map<java.lang.String, ? extends java.lang.Object> second = pair.getSecond();
                    deeplinkProcessorImpl$processDeeplinkMetaData$1.L$0 = null;
                    deeplinkProcessorImpl$processDeeplinkMetaData$1.L$1 = null;
                    deeplinkProcessorImpl$processDeeplinkMetaData$1.L$2 = null;
                    deeplinkProcessorImpl$processDeeplinkMetaData$1.label = 4;
                    if (c38103pMi.KWHzl(first2, str, second, deeplinkProcessorImpl$processDeeplinkMetaData$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C38097pMc.finishProcessing$default(c38103pMi, LinkState.AUTH_FAILED, false, 2, null);
                return Unit.INSTANCE;
            }
            pMX pmx = this.AYXKKw;
            boolean zEZpvd = Intrinsics.EZpvd(pair.getSecond().getOrDefault("shouldSignUp", "false"), (java.lang.Object) "true");
            deeplinkProcessorImpl$processDeeplinkMetaData$1.L$0 = this;
            deeplinkProcessorImpl$processDeeplinkMetaData$1.L$1 = pair;
            deeplinkProcessorImpl$processDeeplinkMetaData$1.L$2 = str;
            deeplinkProcessorImpl$processDeeplinkMetaData$1.label = 1;
            objEZpvd = pmx.EZpvd(zEZpvd, deeplinkProcessorImpl$processDeeplinkMetaData$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c38103pMi = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(objEZpvd);
                        return Unit.INSTANCE;
                    }
                    c38103pMi2 = (C38103pMi) deeplinkProcessorImpl$processDeeplinkMetaData$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    c38103pMi2.fetchVPNInfo = false;
                    return Unit.INSTANCE;
                }
                java.lang.String str2 = (java.lang.String) deeplinkProcessorImpl$processDeeplinkMetaData$1.L$2;
                kotlin.Pair<? extends InterfaceC43233rlS, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> pair3 = (kotlin.Pair) deeplinkProcessorImpl$processDeeplinkMetaData$1.L$1;
                c38103pMi = (C38103pMi) deeplinkProcessorImpl$processDeeplinkMetaData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                pair2 = pair3;
                str = str2;
                c38103pMi2 = c38103pMi;
                strCopydefault = c38103pMi2.OLrzqt.copydefault(str);
                InterfaceC38089pLv interfaceC38089pLv2 = c38103pMi2.AEQbTJ;
                if (strCopydefault != null || !C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
                    strCopydefault = str;
                }
                kotlin.Pair<InterfaceC43233rlS, java.util.Map<java.lang.String, java.lang.Object>> pairOLrzqt2 = interfaceC38089pLv2.OLrzqt(pair2, strCopydefault);
                first = pairOLrzqt2.getFirst();
                map = (java.util.Map) pairOLrzqt2.getSecond();
                deeplinkProcessorImpl$processDeeplinkMetaData$1.L$0 = c38103pMi2;
                deeplinkProcessorImpl$processDeeplinkMetaData$1.L$1 = null;
                deeplinkProcessorImpl$processDeeplinkMetaData$1.L$2 = null;
                deeplinkProcessorImpl$processDeeplinkMetaData$1.label = 3;
                if (c38103pMi2.KWHzl(first, str, map, deeplinkProcessorImpl$processDeeplinkMetaData$1) == objCopydefault) {
                    return objCopydefault;
                }
                c38103pMi2.fetchVPNInfo = false;
                return Unit.INSTANCE;
            }
            java.lang.String str3 = (java.lang.String) deeplinkProcessorImpl$processDeeplinkMetaData$1.L$2;
            kotlin.Pair<? extends InterfaceC43233rlS, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> pair4 = (kotlin.Pair) deeplinkProcessorImpl$processDeeplinkMetaData$1.L$1;
            c38103pMi = (C38103pMi) deeplinkProcessorImpl$processDeeplinkMetaData$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            str = str3;
            pair = pair4;
        }
        zBooleanValue = ((java.lang.Boolean) objEZpvd).booleanValue();
        if (!zBooleanValue) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(InterfaceC43233rlS interfaceC43233rlS, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        DeeplinkProcessorImpl$checkForCompliance$1 deeplinkProcessorImpl$checkForCompliance$1;
        java.lang.Object obj;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map2;
        java.lang.String str2;
        C38103pMi c38103pMi;
        java.lang.String str3;
        if (continuation instanceof DeeplinkProcessorImpl$checkForCompliance$1) {
            deeplinkProcessorImpl$checkForCompliance$1 = (DeeplinkProcessorImpl$checkForCompliance$1) continuation;
            int i = deeplinkProcessorImpl$checkForCompliance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deeplinkProcessorImpl$checkForCompliance$1.label = i - Integer.MIN_VALUE;
            } else {
                deeplinkProcessorImpl$checkForCompliance$1 = new DeeplinkProcessorImpl$checkForCompliance$1(this, continuation);
            }
        }
        java.lang.Object obj2 = deeplinkProcessorImpl$checkForCompliance$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deeplinkProcessorImpl$checkForCompliance$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            pMX pmx = this.AYXKKw;
            DeeplinkMode deeplinkModeKWHzl = interfaceC43233rlS.KWHzl();
            deeplinkProcessorImpl$checkForCompliance$1.L$0 = this;
            deeplinkProcessorImpl$checkForCompliance$1.L$1 = interfaceC43233rlS;
            deeplinkProcessorImpl$checkForCompliance$1.L$2 = str;
            deeplinkProcessorImpl$checkForCompliance$1.L$3 = map;
            deeplinkProcessorImpl$checkForCompliance$1.label = 1;
            java.lang.Object objEZpvd = pmx.EZpvd(deeplinkModeKWHzl, deeplinkProcessorImpl$checkForCompliance$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            obj = objEZpvd;
            map2 = map;
            str2 = str;
            c38103pMi = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (java.lang.String) deeplinkProcessorImpl$checkForCompliance$1.L$1;
                c38103pMi = (C38103pMi) deeplinkProcessorImpl$checkForCompliance$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                c38103pMi.AkhnZx.invoke("DeeplinkProcessorImpl", "checkForCompliance passed deeplink - " + str3);
                return Unit.INSTANCE;
            }
            java.util.Map<java.lang.String, ? extends java.lang.Object> map3 = (java.util.Map) deeplinkProcessorImpl$checkForCompliance$1.L$3;
            java.lang.String str4 = (java.lang.String) deeplinkProcessorImpl$checkForCompliance$1.L$2;
            interfaceC43233rlS = (InterfaceC43233rlS) deeplinkProcessorImpl$checkForCompliance$1.L$1;
            C38103pMi c38103pMi2 = (C38103pMi) deeplinkProcessorImpl$checkForCompliance$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            str2 = str4;
            c38103pMi = c38103pMi2;
            obj = obj2;
            map2 = map3;
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            deeplinkProcessorImpl$checkForCompliance$1.L$0 = c38103pMi;
            deeplinkProcessorImpl$checkForCompliance$1.L$1 = str2;
            deeplinkProcessorImpl$checkForCompliance$1.L$2 = null;
            deeplinkProcessorImpl$checkForCompliance$1.L$3 = null;
            deeplinkProcessorImpl$checkForCompliance$1.label = 2;
            if (c38103pMi.AEQbTJ(interfaceC43233rlS, str2, map2, deeplinkProcessorImpl$checkForCompliance$1) == objCopydefault) {
                return objCopydefault;
            }
            str3 = str2;
            c38103pMi.AkhnZx.invoke("DeeplinkProcessorImpl", "checkForCompliance passed deeplink - " + str3);
            return Unit.INSTANCE;
        }
        C38097pMc.finishProcessing$default(c38103pMi, LinkState.MODE_NOT_SUPPORTED, false, 2, null);
        c38103pMi.AkhnZx.invoke("DeeplinkProcessorImpl", "checkForCompliance failed deeplink - " + str2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(InterfaceC43233rlS interfaceC43233rlS, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        DeeplinkProcessorImpl$proceedToModeSwitching$1 deeplinkProcessorImpl$proceedToModeSwitching$1;
        java.lang.Object obj;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map2;
        java.lang.String str2;
        C38103pMi c38103pMi;
        java.lang.String str3;
        if (continuation instanceof DeeplinkProcessorImpl$proceedToModeSwitching$1) {
            deeplinkProcessorImpl$proceedToModeSwitching$1 = (DeeplinkProcessorImpl$proceedToModeSwitching$1) continuation;
            int i = deeplinkProcessorImpl$proceedToModeSwitching$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deeplinkProcessorImpl$proceedToModeSwitching$1.label = i - Integer.MIN_VALUE;
            } else {
                deeplinkProcessorImpl$proceedToModeSwitching$1 = new DeeplinkProcessorImpl$proceedToModeSwitching$1(this, continuation);
            }
        }
        java.lang.Object obj2 = deeplinkProcessorImpl$proceedToModeSwitching$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deeplinkProcessorImpl$proceedToModeSwitching$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            pMX pmx = this.AYXKKw;
            DeeplinkMode deeplinkModeKWHzl = interfaceC43233rlS.KWHzl();
            java.lang.String strOLrzqt = interfaceC43233rlS.OLrzqt();
            deeplinkProcessorImpl$proceedToModeSwitching$1.L$0 = this;
            deeplinkProcessorImpl$proceedToModeSwitching$1.L$1 = interfaceC43233rlS;
            deeplinkProcessorImpl$proceedToModeSwitching$1.L$2 = str;
            deeplinkProcessorImpl$proceedToModeSwitching$1.L$3 = map;
            deeplinkProcessorImpl$proceedToModeSwitching$1.label = 1;
            java.lang.Object objCopydefault2 = pmx.copydefault(deeplinkModeKWHzl, strOLrzqt, deeplinkProcessorImpl$proceedToModeSwitching$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            obj = objCopydefault2;
            map2 = map;
            str2 = str;
            c38103pMi = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (java.lang.String) deeplinkProcessorImpl$proceedToModeSwitching$1.L$1;
                c38103pMi = (C38103pMi) deeplinkProcessorImpl$proceedToModeSwitching$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                c38103pMi.AkhnZx.invoke("DeeplinkProcessorImpl", "proceedToModeSwitching passed deeplink - " + str3);
                return Unit.INSTANCE;
            }
            java.util.Map<java.lang.String, ? extends java.lang.Object> map3 = (java.util.Map) deeplinkProcessorImpl$proceedToModeSwitching$1.L$3;
            java.lang.String str4 = (java.lang.String) deeplinkProcessorImpl$proceedToModeSwitching$1.L$2;
            interfaceC43233rlS = (InterfaceC43233rlS) deeplinkProcessorImpl$proceedToModeSwitching$1.L$1;
            C38103pMi c38103pMi2 = (C38103pMi) deeplinkProcessorImpl$proceedToModeSwitching$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            str2 = str4;
            c38103pMi = c38103pMi2;
            obj = obj2;
            map2 = map3;
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            java.util.Map<java.lang.String, java.lang.Object> mapIsConnected = C56424yEw.isConnected(map2);
            deeplinkProcessorImpl$proceedToModeSwitching$1.L$0 = c38103pMi;
            deeplinkProcessorImpl$proceedToModeSwitching$1.L$1 = str2;
            deeplinkProcessorImpl$proceedToModeSwitching$1.L$2 = null;
            deeplinkProcessorImpl$proceedToModeSwitching$1.L$3 = null;
            deeplinkProcessorImpl$proceedToModeSwitching$1.label = 2;
            if (c38103pMi.OLrzqt(interfaceC43233rlS, str2, mapIsConnected, deeplinkProcessorImpl$proceedToModeSwitching$1) == objCopydefault) {
                return objCopydefault;
            }
            str3 = str2;
            c38103pMi.AkhnZx.invoke("DeeplinkProcessorImpl", "proceedToModeSwitching passed deeplink - " + str3);
            return Unit.INSTANCE;
        }
        C38097pMc.finishProcessing$default(c38103pMi, LinkState.MODE_SWITCH_CANCELLED, false, 2, null);
        c38103pMi.AkhnZx.invoke("DeeplinkProcessorImpl", "proceedToModeSwitching failed deeplink - " + str2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(InterfaceC43233rlS interfaceC43233rlS, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        DeeplinkProcessorImpl$resolveDeeplinkHandler$1 deeplinkProcessorImpl$resolveDeeplinkHandler$1;
        C38103pMi c38103pMi;
        if (continuation instanceof DeeplinkProcessorImpl$resolveDeeplinkHandler$1) {
            deeplinkProcessorImpl$resolveDeeplinkHandler$1 = (DeeplinkProcessorImpl$resolveDeeplinkHandler$1) continuation;
            int i = deeplinkProcessorImpl$resolveDeeplinkHandler$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deeplinkProcessorImpl$resolveDeeplinkHandler$1.label = i - Integer.MIN_VALUE;
            } else {
                deeplinkProcessorImpl$resolveDeeplinkHandler$1 = new DeeplinkProcessorImpl$resolveDeeplinkHandler$1(this, continuation);
            }
        }
        java.lang.Object obj = deeplinkProcessorImpl$resolveDeeplinkHandler$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deeplinkProcessorImpl$resolveDeeplinkHandler$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC43234rlT interfaceC43234rlTEZpvd = this.AEQbTJ.EZpvd(interfaceC43233rlS);
            if (interfaceC43234rlTEZpvd == null) {
                deeplinkProcessorImpl$resolveDeeplinkHandler$1.L$0 = this;
                deeplinkProcessorImpl$resolveDeeplinkHandler$1.L$1 = str;
                deeplinkProcessorImpl$resolveDeeplinkHandler$1.label = 1;
                if (OLrzqt(str, deeplinkProcessorImpl$resolveDeeplinkHandler$1) == objCopydefault) {
                    return objCopydefault;
                }
                c38103pMi = this;
            } else {
                C38097pMc.finishProcessing$default(this, LinkState.SUCCESS, false, 2, null);
                OLrzqt(map, str);
                this.gEmmrt.EZpvd(interfaceC43234rlTEZpvd, interfaceC43233rlS, map);
                this.AkhnZx.invoke("DeeplinkProcessorImpl", "resolveDeeplinkHandler handler called deeplink - " + str + " handler - " + interfaceC43234rlTEZpvd.getClass());
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) deeplinkProcessorImpl$resolveDeeplinkHandler$1.L$1;
            c38103pMi = (C38103pMi) deeplinkProcessorImpl$resolveDeeplinkHandler$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        c38103pMi.AkhnZx.invoke("DeeplinkProcessorImpl", "resolveDeeplinkHandler legacy deeplink - " + str);
        return Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.String strCopydefault = this.OLrzqt.copydefault(str);
        if (strCopydefault == null || strCopydefault.length() == 0) {
            C38097pMc.finishProcessing$default(this, LinkState.NO_SUPPORTED_HANDLER, false, 2, null);
            return Unit.INSTANCE;
        }
        this.copydefault.OLrzqt(strCopydefault);
        this.valueOf.copydefault(str, strCopydefault);
        java.lang.Object objAEQbTJ = AEQbTJ(strCopydefault, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC38101pMg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        DeeplinkProcessorImpl$validate$1 deeplinkProcessorImpl$validate$1;
        if (continuation instanceof DeeplinkProcessorImpl$validate$1) {
            deeplinkProcessorImpl$validate$1 = (DeeplinkProcessorImpl$validate$1) continuation;
            int i = deeplinkProcessorImpl$validate$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deeplinkProcessorImpl$validate$1.label = i - Integer.MIN_VALUE;
            } else {
                deeplinkProcessorImpl$validate$1 = new DeeplinkProcessorImpl$validate$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = deeplinkProcessorImpl$validate$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deeplinkProcessorImpl$validate$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC43233rlS first = copydefault(str).getFirst();
            if (first == null) {
                return C56443yFo.KWHzl(false);
            }
            if (first.copydefault() && !this.AYXKKw.KWHzl()) {
                return C56443yFo.KWHzl(false);
            }
            pMX pmx = this.AYXKKw;
            DeeplinkMode deeplinkModeKWHzl = first.KWHzl();
            deeplinkProcessorImpl$validate$1.label = 1;
            objEZpvd = pmx.EZpvd(deeplinkModeKWHzl, deeplinkProcessorImpl$validate$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return !((java.lang.Boolean) objEZpvd).booleanValue() ? C56443yFo.KWHzl(false) : C56443yFo.KWHzl(true);
    }

    @Override // o.InterfaceC38101pMg
    public java.lang.String copydefault() {
        return this.EZpvd.KWHzl();
    }

    public final kotlin.Pair<InterfaceC43233rlS, java.util.Map<java.lang.String, java.lang.Object>> copydefault(java.lang.String str) {
        kotlin.Pair<InterfaceC43233rlS, java.util.Map<java.lang.String, java.lang.Object>> pairEZpvd = this.AEQbTJ.EZpvd(str);
        if (pairEZpvd.getFirst() != null) {
            return pairEZpvd;
        }
        InterfaceC38089pLv interfaceC38089pLv = this.AEQbTJ;
        java.lang.String strCopydefault = this.OLrzqt.copydefault(str);
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        return interfaceC38089pLv.EZpvd(strCopydefault);
    }

    @Override // o.InterfaceC38101pMg
    public java.util.Map<java.lang.String, java.lang.String> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.KWHzl(str);
    }
}

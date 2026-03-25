package o;

import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import com.okinc.lifecycle.impl.deeplink.processor.NonOKXSchemeProcessorImpl$checkForCompliance$1;
import com.okinc.lifecycle.impl.deeplink.processor.NonOKXSchemeProcessorImpl$proceedToModeSwitching$1;
import com.okinc.lifecycle.impl.deeplink.processor.NonOKXSchemeProcessorImpl$process$1;
import com.okinc.lifecycle.impl.deeplink.processor.NonOKXSchemeProcessorImpl$processLinkMetaData$1;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC43233rlS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pMh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38102pMh extends C38097pMc implements InterfaceC38100pMf {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final C43239rlY AEQbTJ;
    public final Function2<java.lang.String, java.lang.String, Unit> AhwBna;
    public final pMX EZpvd;
    public final InterfaceC38089pLv KWHzl;
    public final pMV copydefault;
    public final InterfaceC47278tmy djBIcL;

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @yCM
    public C38102pMh(@NotNull pMV pmv, @NotNull pMX pmx, @NotNull InterfaceC38089pLv interfaceC38089pLv, @NotNull InterfaceC38084pLq interfaceC38084pLq, @NotNull InterfaceC38081pLn interfaceC38081pLn, @NotNull C43239rlY c43239rlY, @NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        super(pmx, pmv, interfaceC38081pLn, interfaceC38084pLq);
        Intrinsics.checkNotNullParameter(pmv, "");
        Intrinsics.checkNotNullParameter(pmx, "");
        Intrinsics.checkNotNullParameter(interfaceC38089pLv, "");
        Intrinsics.checkNotNullParameter(interfaceC38084pLq, "");
        Intrinsics.checkNotNullParameter(interfaceC38081pLn, "");
        Intrinsics.checkNotNullParameter(c43239rlY, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.copydefault = pmv;
        this.EZpvd = pmx;
        this.KWHzl = interfaceC38089pLv;
        this.AEQbTJ = c43239rlY;
        this.AhwBna = function2;
        this.djBIcL = interfaceC47278tmy;
    }

    /* JADX INFO: renamed from: o.pMh$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pMh.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC38100pMf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, boolean z, @NotNull pLI pli, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        NonOKXSchemeProcessorImpl$process$1 nonOKXSchemeProcessorImpl$process$1;
        C38102pMh c38102pMh;
        if (continuation instanceof NonOKXSchemeProcessorImpl$process$1) {
            nonOKXSchemeProcessorImpl$process$1 = (NonOKXSchemeProcessorImpl$process$1) continuation;
            int i = nonOKXSchemeProcessorImpl$process$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nonOKXSchemeProcessorImpl$process$1.label = i - Integer.MIN_VALUE;
            } else {
                nonOKXSchemeProcessorImpl$process$1 = new NonOKXSchemeProcessorImpl$process$1(this, continuation);
            }
        }
        java.lang.Object obj = nonOKXSchemeProcessorImpl$process$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = nonOKXSchemeProcessorImpl$process$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            OLrzqt(pli, z);
            InterfaceC43233rlS interfaceC43233rlSCopydefault = copydefault((java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null)));
            if (interfaceC43233rlSCopydefault != null) {
                nonOKXSchemeProcessorImpl$process$1.L$0 = this;
                nonOKXSchemeProcessorImpl$process$1.L$1 = str;
                nonOKXSchemeProcessorImpl$process$1.label = 1;
                if (AEQbTJ(interfaceC43233rlSCopydefault, str, nonOKXSchemeProcessorImpl$process$1) == objCopydefault) {
                    return objCopydefault;
                }
                c38102pMh = this;
            } else {
                djBIcL(str);
                this.AhwBna.invoke("NonOKXSchemeProcessorImpl", "processNonOKXSchemeLink opened externally - " + str);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) nonOKXSchemeProcessorImpl$process$1.L$1;
            c38102pMh = (C38102pMh) nonOKXSchemeProcessorImpl$process$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        c38102pMh.AhwBna.invoke("NonOKXSchemeProcessorImpl", "processNonOKXSchemeLink - " + str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(InterfaceC43233rlS interfaceC43233rlS, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        NonOKXSchemeProcessorImpl$processLinkMetaData$1 nonOKXSchemeProcessorImpl$processLinkMetaData$1;
        C38102pMh c38102pMh;
        if (continuation instanceof NonOKXSchemeProcessorImpl$processLinkMetaData$1) {
            nonOKXSchemeProcessorImpl$processLinkMetaData$1 = (NonOKXSchemeProcessorImpl$processLinkMetaData$1) continuation;
            int i = nonOKXSchemeProcessorImpl$processLinkMetaData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nonOKXSchemeProcessorImpl$processLinkMetaData$1.label = i - Integer.MIN_VALUE;
            } else {
                nonOKXSchemeProcessorImpl$processLinkMetaData$1 = new NonOKXSchemeProcessorImpl$processLinkMetaData$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = nonOKXSchemeProcessorImpl$processLinkMetaData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = nonOKXSchemeProcessorImpl$processLinkMetaData$1.label;
        boolean zBooleanValue = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (this.djBIcL.fetchVPNInfo() && !interfaceC43233rlS.EZpvd()) {
                C38097pMc.finishProcessing$default(this, LinkState.DEEPLINK_NOT_SUPPORTED_IN_RBAC_ACCOUNT, false, 2, null);
                return Unit.INSTANCE;
            }
            if (this.djBIcL.isConnected() && !interfaceC43233rlS.AYXKKw()) {
                C38097pMc.finishProcessing$default(this, LinkState.DEEPLINK_NOT_SUPPORTED_IN_RM_ACCOUNT, false, 2, null);
                return Unit.INSTANCE;
            }
            if (!interfaceC43233rlS.copydefault()) {
                c38102pMh = this;
                if (!zBooleanValue) {
                    nonOKXSchemeProcessorImpl$processLinkMetaData$1.L$0 = null;
                    nonOKXSchemeProcessorImpl$processLinkMetaData$1.L$1 = null;
                    nonOKXSchemeProcessorImpl$processLinkMetaData$1.L$2 = null;
                    nonOKXSchemeProcessorImpl$processLinkMetaData$1.label = 2;
                    if (c38102pMh.EZpvd(interfaceC43233rlS, str, nonOKXSchemeProcessorImpl$processLinkMetaData$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C38097pMc.finishProcessing$default(c38102pMh, LinkState.AUTH_FAILED, false, 2, null);
                return Unit.INSTANCE;
            }
            pMX pmx = this.EZpvd;
            boolean zEZpvd = Intrinsics.EZpvd(OLrzqt(str).getSecond().getOrDefault("shouldSignUp", "false"), (java.lang.Object) "true");
            nonOKXSchemeProcessorImpl$processLinkMetaData$1.L$0 = this;
            nonOKXSchemeProcessorImpl$processLinkMetaData$1.L$1 = interfaceC43233rlS;
            nonOKXSchemeProcessorImpl$processLinkMetaData$1.L$2 = str;
            nonOKXSchemeProcessorImpl$processLinkMetaData$1.label = 1;
            objEZpvd = pmx.EZpvd(zEZpvd, nonOKXSchemeProcessorImpl$processLinkMetaData$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c38102pMh = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return Unit.INSTANCE;
            }
            str = (java.lang.String) nonOKXSchemeProcessorImpl$processLinkMetaData$1.L$2;
            interfaceC43233rlS = (InterfaceC43233rlS) nonOKXSchemeProcessorImpl$processLinkMetaData$1.L$1;
            c38102pMh = (C38102pMh) nonOKXSchemeProcessorImpl$processLinkMetaData$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        zBooleanValue = ((java.lang.Boolean) objEZpvd).booleanValue();
        if (!zBooleanValue) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(InterfaceC43233rlS interfaceC43233rlS, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        NonOKXSchemeProcessorImpl$checkForCompliance$1 nonOKXSchemeProcessorImpl$checkForCompliance$1;
        C38102pMh c38102pMh;
        if (continuation instanceof NonOKXSchemeProcessorImpl$checkForCompliance$1) {
            nonOKXSchemeProcessorImpl$checkForCompliance$1 = (NonOKXSchemeProcessorImpl$checkForCompliance$1) continuation;
            int i = nonOKXSchemeProcessorImpl$checkForCompliance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nonOKXSchemeProcessorImpl$checkForCompliance$1.label = i - Integer.MIN_VALUE;
            } else {
                nonOKXSchemeProcessorImpl$checkForCompliance$1 = new NonOKXSchemeProcessorImpl$checkForCompliance$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = nonOKXSchemeProcessorImpl$checkForCompliance$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = nonOKXSchemeProcessorImpl$checkForCompliance$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pMX pmx = this.EZpvd;
            DeeplinkMode deeplinkModeKWHzl = interfaceC43233rlS.KWHzl();
            nonOKXSchemeProcessorImpl$checkForCompliance$1.L$0 = this;
            nonOKXSchemeProcessorImpl$checkForCompliance$1.L$1 = interfaceC43233rlS;
            nonOKXSchemeProcessorImpl$checkForCompliance$1.L$2 = str;
            nonOKXSchemeProcessorImpl$checkForCompliance$1.label = 1;
            objEZpvd = pmx.EZpvd(deeplinkModeKWHzl, nonOKXSchemeProcessorImpl$checkForCompliance$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c38102pMh = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return Unit.INSTANCE;
            }
            str = (java.lang.String) nonOKXSchemeProcessorImpl$checkForCompliance$1.L$2;
            interfaceC43233rlS = (InterfaceC43233rlS) nonOKXSchemeProcessorImpl$checkForCompliance$1.L$1;
            c38102pMh = (C38102pMh) nonOKXSchemeProcessorImpl$checkForCompliance$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        if (((java.lang.Boolean) objEZpvd).booleanValue()) {
            nonOKXSchemeProcessorImpl$checkForCompliance$1.L$0 = null;
            nonOKXSchemeProcessorImpl$checkForCompliance$1.L$1 = null;
            nonOKXSchemeProcessorImpl$checkForCompliance$1.L$2 = null;
            nonOKXSchemeProcessorImpl$checkForCompliance$1.label = 2;
            if (c38102pMh.OLrzqt(interfaceC43233rlS, str, nonOKXSchemeProcessorImpl$checkForCompliance$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        C38097pMc.finishProcessing$default(c38102pMh, LinkState.MODE_NOT_SUPPORTED, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(InterfaceC43233rlS interfaceC43233rlS, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        NonOKXSchemeProcessorImpl$proceedToModeSwitching$1 nonOKXSchemeProcessorImpl$proceedToModeSwitching$1;
        C38102pMh c38102pMh;
        if (continuation instanceof NonOKXSchemeProcessorImpl$proceedToModeSwitching$1) {
            nonOKXSchemeProcessorImpl$proceedToModeSwitching$1 = (NonOKXSchemeProcessorImpl$proceedToModeSwitching$1) continuation;
            int i = nonOKXSchemeProcessorImpl$proceedToModeSwitching$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nonOKXSchemeProcessorImpl$proceedToModeSwitching$1.label = i - Integer.MIN_VALUE;
            } else {
                nonOKXSchemeProcessorImpl$proceedToModeSwitching$1 = new NonOKXSchemeProcessorImpl$proceedToModeSwitching$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = nonOKXSchemeProcessorImpl$proceedToModeSwitching$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = nonOKXSchemeProcessorImpl$proceedToModeSwitching$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            pMX pmx = this.EZpvd;
            DeeplinkMode deeplinkModeKWHzl = interfaceC43233rlS.KWHzl();
            java.lang.String strOLrzqt = interfaceC43233rlS.OLrzqt();
            nonOKXSchemeProcessorImpl$proceedToModeSwitching$1.L$0 = this;
            nonOKXSchemeProcessorImpl$proceedToModeSwitching$1.L$1 = str;
            nonOKXSchemeProcessorImpl$proceedToModeSwitching$1.label = 1;
            objCopydefault = pmx.copydefault(deeplinkModeKWHzl, strOLrzqt, nonOKXSchemeProcessorImpl$proceedToModeSwitching$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c38102pMh = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) nonOKXSchemeProcessorImpl$proceedToModeSwitching$1.L$1;
            c38102pMh = (C38102pMh) nonOKXSchemeProcessorImpl$proceedToModeSwitching$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        if (((java.lang.Boolean) objCopydefault).booleanValue()) {
            c38102pMh.AEQbTJ(str);
        } else {
            C38097pMc.finishProcessing$default(c38102pMh, LinkState.MODE_SWITCH_CANCELLED, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str) {
        InterfaceC43234rlT interfaceC43234rlTKWHzl = KWHzl((java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null)));
        if (interfaceC43234rlTKWHzl != null) {
            kotlin.Pair<InterfaceC43233rlS, java.util.Map<java.lang.String, java.lang.Object>> pairOLrzqt = OLrzqt(str);
            C38097pMc.finishProcessing$default(this, LinkState.SUCCESS, false, 2, null);
            java.util.Map<java.lang.String, ? extends java.lang.Object> mapIsConnected = C56424yEw.isConnected(pairOLrzqt.getSecond());
            OLrzqt(mapIsConnected, str);
            this.copydefault.EZpvd(interfaceC43234rlTKWHzl, pairOLrzqt.getFirst(), mapIsConnected);
            this.AhwBna.invoke("NonOKXSchemeProcessorImpl", "resolveDeeplinkHandler success - " + str);
            return;
        }
        C38097pMc.finishProcessing$default(this, LinkState.NO_SUPPORTED_HANDLER, false, 2, null);
        this.AhwBna.invoke("NonOKXSchemeProcessorImpl", "resolveDeeplinkHandler failed - " + str);
    }

    @Override // o.InterfaceC38100pMf
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null));
        if (str2 == null) {
            str2 = "";
        }
        return C56443yFo.KWHzl(KWHzl(str2) != null);
    }

    /* JADX INFO: renamed from: o.pMh$Application */
    public static final class Application implements InterfaceC43233rlS {
        public final /* synthetic */ java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43233rlS
        public java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        public Application(java.lang.String str) {
            this.KWHzl = str;
        }

        @Override // o.InterfaceC43233rlS
        public java.util.List<C43240rlZ> AEQbTJ() {
            return InterfaceC43233rlS.Application.copydefault(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean AYXKKw() {
            return InterfaceC43233rlS.Application.AEQbTJ(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean EZpvd() {
            return InterfaceC43233rlS.Application.OLrzqt(this);
        }

        @Override // o.InterfaceC43233rlS
        public boolean copydefault() {
            return InterfaceC43233rlS.Application.EZpvd(this);
        }

        @Override // o.InterfaceC43233rlS
        public DeeplinkMode KWHzl() {
            return DeeplinkMode.APP;
        }
    }

    public final kotlin.Pair<InterfaceC43233rlS, java.util.Map<java.lang.String, java.lang.Object>> OLrzqt(java.lang.String str) {
        return new kotlin.Pair<>(new Application(str), this.KWHzl.KWHzl(str));
    }

    public final InterfaceC43234rlT KWHzl(java.lang.String str) {
        InterfaceC56387yDm<InterfaceC43234rlT> orDefault = this.AEQbTJ.AEQbTJ().getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault.getValue();
        }
        return null;
    }

    public final InterfaceC43233rlS copydefault(java.lang.String str) {
        return this.AEQbTJ.copydefault().getOrDefault(str, null);
    }
}

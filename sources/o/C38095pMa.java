package o;

import com.okinc.lifecycle.impl.deeplink.core.AnalyticsLinkType;
import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import com.okinc.lifecycle.impl.deeplink.processor.AppLinkProcessorImpl$checkForCompliance$1;
import com.okinc.lifecycle.impl.deeplink.processor.AppLinkProcessorImpl$proceedToModeSwitching$1;
import com.okinc.lifecycle.impl.deeplink.processor.AppLinkProcessorImpl$processAppLink$1;
import com.okinc.lifecycle.impl.deeplink.processor.AppLinkProcessorImpl$processLinkMetaData$1;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC43232rlR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pMa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38095pMa extends C38097pMc implements InterfaceC38098pMd {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC38089pLv AEQbTJ;
    public final Function2<java.lang.String, java.lang.String, Unit> AYXKKw;
    public final pMV AhwBna;
    public final pKI AkhnZx;
    public final Function1<java.lang.String, java.lang.Boolean> EZpvd;
    public final C43239rlY OLrzqt;
    public final InterfaceC38081pLn copydefault;
    public final pLH djBIcL;
    public final C38104pMj fetchVPNInfo;
    public final pMX gEmmrt;
    public final InterfaceC47278tmy isConnected;
    public final kOG valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @yCM
    public C38095pMa(@NotNull InterfaceC38084pLq interfaceC38084pLq, @NotNull pMV pmv, @NotNull pMX pmx, @NotNull InterfaceC38081pLn interfaceC38081pLn, @NotNull InterfaceC38089pLv interfaceC38089pLv, @NotNull C43239rlY c43239rlY, @NotNull kOG kog, pKI pki, @NotNull C38104pMj c38104pMj, @NotNull pLH plh, @NotNull Function1<? super java.lang.String, java.lang.Boolean> function1, @NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2, @NotNull InterfaceC47278tmy interfaceC47278tmy) {
        super(pmx, pmv, interfaceC38081pLn, interfaceC38084pLq);
        Intrinsics.checkNotNullParameter(interfaceC38084pLq, "");
        Intrinsics.checkNotNullParameter(pmv, "");
        Intrinsics.checkNotNullParameter(pmx, "");
        Intrinsics.checkNotNullParameter(interfaceC38081pLn, "");
        Intrinsics.checkNotNullParameter(interfaceC38089pLv, "");
        Intrinsics.checkNotNullParameter(c43239rlY, "");
        Intrinsics.checkNotNullParameter(kog, "");
        Intrinsics.checkNotNullParameter(c38104pMj, "");
        Intrinsics.checkNotNullParameter(plh, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.AhwBna = pmv;
        this.gEmmrt = pmx;
        this.copydefault = interfaceC38081pLn;
        this.AEQbTJ = interfaceC38089pLv;
        this.OLrzqt = c43239rlY;
        this.valueOf = kog;
        this.AkhnZx = pki;
        this.fetchVPNInfo = c38104pMj;
        this.djBIcL = plh;
        this.EZpvd = function1;
        this.AYXKKw = function2;
        this.isConnected = interfaceC47278tmy;
    }

    /* JADX INFO: renamed from: o.pMa$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pMa.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC38098pMd
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, boolean z, @NotNull pLI pli, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        OLrzqt(pli, z);
        java.lang.Object objAEQbTJ = AEQbTJ(str, z, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(final java.lang.String str, boolean z, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AppLinkProcessorImpl$processAppLink$1 appLinkProcessorImpl$processAppLink$1;
        C38095pMa c38095pMa;
        C38095pMa c38095pMa2;
        if (continuation instanceof AppLinkProcessorImpl$processAppLink$1) {
            appLinkProcessorImpl$processAppLink$1 = (AppLinkProcessorImpl$processAppLink$1) continuation;
            int i = appLinkProcessorImpl$processAppLink$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                appLinkProcessorImpl$processAppLink$1.label = i - Integer.MIN_VALUE;
            } else {
                appLinkProcessorImpl$processAppLink$1 = new AppLinkProcessorImpl$processAppLink$1(this, continuation);
            }
        }
        AppLinkProcessorImpl$processAppLink$1 appLinkProcessorImpl$processAppLink$12 = appLinkProcessorImpl$processAppLink$1;
        java.lang.Object obj = appLinkProcessorImpl$processAppLink$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = appLinkProcessorImpl$processAppLink$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC43232rlR interfaceC43232rlRAYXKKw = AYXKKw(str);
            if (interfaceC43232rlRAYXKKw != null && this.isConnected.fetchVPNInfo() && !interfaceC43232rlRAYXKKw.KWHzl()) {
                C38097pMc.finishProcessing$default(this, LinkState.DEEPLINK_NOT_SUPPORTED_IN_RBAC_ACCOUNT, false, 2, null);
                return Unit.INSTANCE;
            }
            if (interfaceC43232rlRAYXKKw != null && this.isConnected.isConnected() && !interfaceC43232rlRAYXKKw.OLrzqt()) {
                C38097pMc.finishProcessing$default(this, LinkState.DEEPLINK_NOT_SUPPORTED_IN_RM_ACCOUNT, false, 2, null);
                return Unit.INSTANCE;
            }
            if (interfaceC43232rlRAYXKKw != null && KWHzl(str, interfaceC43232rlRAYXKKw)) {
                appLinkProcessorImpl$processAppLink$12.L$0 = this;
                appLinkProcessorImpl$processAppLink$12.L$1 = str;
                appLinkProcessorImpl$processAppLink$12.label = 1;
                if (AEQbTJ(interfaceC43232rlRAYXKKw, str, appLinkProcessorImpl$processAppLink$12) == objCopydefault) {
                    return objCopydefault;
                }
                c38095pMa2 = this;
                c38095pMa2.AYXKKw.invoke("AppLinkProcessorImpl", "processAppLink - " + str);
            } else {
                try {
                    C38104pMj c38104pMj = this.fetchVPNInfo;
                    boolean zCopydefault = this.djBIcL.copydefault(str);
                    Function1<? super LinkState, Unit> function1 = new Function1() { // from class: o.pMe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return C38095pMa.copydefault(this.KWHzl, str, (LinkState) obj2);
                        }
                    };
                    appLinkProcessorImpl$processAppLink$12.L$0 = this;
                    appLinkProcessorImpl$processAppLink$12.L$1 = str;
                    appLinkProcessorImpl$processAppLink$12.label = 2;
                    if (c38104pMj.AEQbTJ(str, zCopydefault, z, function1, appLinkProcessorImpl$processAppLink$12) == objCopydefault) {
                        return objCopydefault;
                    }
                    c38095pMa = this;
                    c38095pMa.AYXKKw.invoke("AppLinkProcessorImpl", "unknownAppLinkProcessor start - " + str);
                } catch (java.lang.Exception unused) {
                    c38095pMa = this;
                    c38095pMa.AYXKKw.invoke("AppLinkProcessorImpl", "openLinkExternally - " + str);
                    c38095pMa.djBIcL(str);
                }
            }
        } else if (i2 == 1) {
            str = (java.lang.String) appLinkProcessorImpl$processAppLink$12.L$1;
            c38095pMa2 = (C38095pMa) appLinkProcessorImpl$processAppLink$12.L$0;
            C56391yDq.AEQbTJ(obj);
            c38095pMa2.AYXKKw.invoke("AppLinkProcessorImpl", "processAppLink - " + str);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) appLinkProcessorImpl$processAppLink$12.L$1;
            c38095pMa = (C38095pMa) appLinkProcessorImpl$processAppLink$12.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                c38095pMa.AYXKKw.invoke("AppLinkProcessorImpl", "unknownAppLinkProcessor start - " + str);
            } catch (java.lang.Exception unused2) {
                c38095pMa.AYXKKw.invoke("AppLinkProcessorImpl", "openLinkExternally - " + str);
                c38095pMa.djBIcL(str);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C38095pMa c38095pMa, java.lang.String str, LinkState linkState) {
        Intrinsics.checkNotNullParameter(linkState, "");
        C38097pMc.finishProcessing$default(c38095pMa, linkState, false, 2, null);
        c38095pMa.AYXKKw.invoke("AppLinkProcessorImpl", "unknownAppLinkProcessor complete - " + str + " " + linkState);
        return Unit.INSTANCE;
    }

    public final boolean KWHzl(java.lang.String str, InterfaceC43232rlR interfaceC43232rlR) {
        java.lang.Object obj;
        if (interfaceC43232rlR.djBIcL().isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = interfaceC43232rlR.djBIcL().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (C59449zhJ.startsWith$default(str, (java.lang.String) next, false, 2, null)) {
                obj = next;
                break;
            }
        }
        return C33129mqd.OLrzqt((java.lang.CharSequence) obj);
    }

    public final InterfaceC43232rlR AYXKKw(java.lang.String str) {
        kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ = AEQbTJ(str);
        InterfaceC43232rlR interfaceC43232rlRValueOf = valueOf(pairAEQbTJ.getFirst());
        if (interfaceC43232rlRValueOf != null) {
            return interfaceC43232rlRValueOf;
        }
        if (pairAEQbTJ.getSecond() == null || !this.EZpvd.invoke(pairAEQbTJ.getFirst()).booleanValue()) {
            return null;
        }
        java.lang.String second = pairAEQbTJ.getSecond();
        if (second == null) {
            second = "";
        }
        return valueOf(second);
    }

    public final InterfaceC43236rlV copydefault(java.lang.String str) {
        kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ = AEQbTJ(str);
        InterfaceC43236rlV interfaceC43236rlVKWHzl = KWHzl(pairAEQbTJ.getFirst());
        if (interfaceC43236rlVKWHzl != null) {
            return interfaceC43236rlVKWHzl;
        }
        if (pairAEQbTJ.getSecond() == null || !this.EZpvd.invoke(pairAEQbTJ.getFirst()).booleanValue()) {
            return null;
        }
        java.lang.String second = pairAEQbTJ.getSecond();
        if (second == null) {
            second = "";
        }
        return KWHzl(second);
    }

    @Override // o.InterfaceC38098pMd
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C56443yFo.KWHzl(copydefault(str) != null);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(java.lang.String str) {
        kotlin.Pair<java.lang.String, java.lang.String> pair;
        java.lang.String str2 = "";
        try {
            java.net.URL url = new java.net.URL(str);
            java.lang.String path = url.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "");
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) path, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null);
            if (this.djBIcL.copydefault(str)) {
                java.lang.String str3 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listSplit$default, 1);
                if (str3 != null) {
                    str2 = str3;
                }
                pair = new kotlin.Pair<>(str2, CollectionsKt___CollectionsKt.AkhnZx(listSplit$default, 2));
            } else {
                pair = new kotlin.Pair<>(url.getHost(), null);
            }
            return pair;
        } catch (java.lang.Exception unused) {
            return new kotlin.Pair<>(str, null);
        }
    }

    public final InterfaceC43236rlV KWHzl(java.lang.String str) {
        InterfaceC56387yDm<InterfaceC43236rlV> interfaceC56387yDm = this.OLrzqt.OLrzqt().get(str);
        if (interfaceC56387yDm != null) {
            return interfaceC56387yDm.getValue();
        }
        return null;
    }

    public final InterfaceC43232rlR valueOf(java.lang.String str) {
        return this.OLrzqt.KWHzl().get(str);
    }

    /* JADX INFO: renamed from: o.pMa$ActionBar */
    public static final class ActionBar implements InterfaceC43232rlR {
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC43232rlR
        public java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        public ActionBar(java.lang.String str) {
            this.copydefault = str;
        }

        @Override // o.InterfaceC43232rlR
        public boolean EZpvd() {
            return InterfaceC43232rlR.TaskDescription.OLrzqt(this);
        }

        @Override // o.InterfaceC43232rlR
        public boolean KWHzl() {
            return InterfaceC43232rlR.TaskDescription.copydefault(this);
        }

        @Override // o.InterfaceC43232rlR
        public boolean OLrzqt() {
            return InterfaceC43232rlR.TaskDescription.AEQbTJ(this);
        }

        @Override // o.InterfaceC43232rlR
        public java.util.List<java.lang.String> djBIcL() {
            return InterfaceC43232rlR.TaskDescription.EZpvd(this);
        }

        @Override // o.InterfaceC43232rlR
        public DeeplinkMode copydefault() {
            return DeeplinkMode.APP;
        }
    }

    private final kotlin.Pair<InterfaceC43232rlR, java.util.Map<java.lang.String, java.lang.Object>> AkhnZx(java.lang.String str) {
        return new kotlin.Pair<>(new ActionBar(str), this.AEQbTJ.KWHzl(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(InterfaceC43232rlR interfaceC43232rlR, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AppLinkProcessorImpl$processLinkMetaData$1 appLinkProcessorImpl$processLinkMetaData$1;
        java.lang.String str2;
        C38095pMa c38095pMa;
        C38095pMa c38095pMa2;
        java.lang.String str3;
        if (continuation instanceof AppLinkProcessorImpl$processLinkMetaData$1) {
            appLinkProcessorImpl$processLinkMetaData$1 = (AppLinkProcessorImpl$processLinkMetaData$1) continuation;
            int i = appLinkProcessorImpl$processLinkMetaData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                appLinkProcessorImpl$processLinkMetaData$1.label = i - Integer.MIN_VALUE;
            } else {
                appLinkProcessorImpl$processLinkMetaData$1 = new AppLinkProcessorImpl$processLinkMetaData$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = appLinkProcessorImpl$processLinkMetaData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = appLinkProcessorImpl$processLinkMetaData$1.label;
        boolean zBooleanValue = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.util.Map<java.lang.String, java.lang.String> mapKWHzl = this.AEQbTJ.KWHzl(str);
            pLF.AEQbTJ(mapKWHzl, this.valueOf);
            pLF.KWHzl(mapKWHzl, this.AkhnZx, str);
            pLF.OLrzqt(mapKWHzl, this.AkhnZx, str);
            if (!interfaceC43232rlR.EZpvd()) {
                str2 = str;
                c38095pMa = this;
                if (!zBooleanValue) {
                    appLinkProcessorImpl$processLinkMetaData$1.L$0 = c38095pMa;
                    appLinkProcessorImpl$processLinkMetaData$1.L$1 = str2;
                    appLinkProcessorImpl$processLinkMetaData$1.L$2 = null;
                    appLinkProcessorImpl$processLinkMetaData$1.label = 2;
                    if (c38095pMa.KWHzl(interfaceC43232rlR, str2, appLinkProcessorImpl$processLinkMetaData$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    str3 = str2;
                    c38095pMa.AYXKKw.invoke("AppLinkProcessorImpl", "processLinkMetaData - Auth passed - " + str3);
                    return Unit.INSTANCE;
                }
                C38097pMc.finishProcessing$default(c38095pMa, LinkState.AUTH_FAILED, false, 2, null);
                c38095pMa.AYXKKw.invoke("AppLinkProcessorImpl", "processLinkMetaData - Auth failed - " + str2);
                return Unit.INSTANCE;
            }
            pMX pmx = this.gEmmrt;
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) mapKWHzl.getOrDefault("shouldSignUp", "false"), (java.lang.Object) "true");
            appLinkProcessorImpl$processLinkMetaData$1.L$0 = this;
            appLinkProcessorImpl$processLinkMetaData$1.L$1 = interfaceC43232rlR;
            appLinkProcessorImpl$processLinkMetaData$1.L$2 = str;
            appLinkProcessorImpl$processLinkMetaData$1.label = 1;
            objEZpvd = pmx.EZpvd(zEZpvd, appLinkProcessorImpl$processLinkMetaData$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c38095pMa2 = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (java.lang.String) appLinkProcessorImpl$processLinkMetaData$1.L$1;
                c38095pMa = (C38095pMa) appLinkProcessorImpl$processLinkMetaData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                c38095pMa.AYXKKw.invoke("AppLinkProcessorImpl", "processLinkMetaData - Auth passed - " + str3);
                return Unit.INSTANCE;
            }
            str = (java.lang.String) appLinkProcessorImpl$processLinkMetaData$1.L$2;
            interfaceC43232rlR = (InterfaceC43232rlR) appLinkProcessorImpl$processLinkMetaData$1.L$1;
            c38095pMa2 = (C38095pMa) appLinkProcessorImpl$processLinkMetaData$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        zBooleanValue = ((java.lang.Boolean) objEZpvd).booleanValue();
        str2 = str;
        c38095pMa = c38095pMa2;
        if (!zBooleanValue) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(InterfaceC43232rlR interfaceC43232rlR, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AppLinkProcessorImpl$checkForCompliance$1 appLinkProcessorImpl$checkForCompliance$1;
        java.lang.Object obj;
        java.lang.String str2;
        C38095pMa c38095pMa;
        java.lang.String str3;
        if (continuation instanceof AppLinkProcessorImpl$checkForCompliance$1) {
            appLinkProcessorImpl$checkForCompliance$1 = (AppLinkProcessorImpl$checkForCompliance$1) continuation;
            int i = appLinkProcessorImpl$checkForCompliance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                appLinkProcessorImpl$checkForCompliance$1.label = i - Integer.MIN_VALUE;
            } else {
                appLinkProcessorImpl$checkForCompliance$1 = new AppLinkProcessorImpl$checkForCompliance$1(this, continuation);
            }
        }
        java.lang.Object obj2 = appLinkProcessorImpl$checkForCompliance$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = appLinkProcessorImpl$checkForCompliance$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            pMX pmx = this.gEmmrt;
            DeeplinkMode deeplinkModeCopydefault = interfaceC43232rlR.copydefault();
            appLinkProcessorImpl$checkForCompliance$1.L$0 = this;
            appLinkProcessorImpl$checkForCompliance$1.L$1 = interfaceC43232rlR;
            appLinkProcessorImpl$checkForCompliance$1.L$2 = str;
            appLinkProcessorImpl$checkForCompliance$1.label = 1;
            java.lang.Object objEZpvd = pmx.EZpvd(deeplinkModeCopydefault, appLinkProcessorImpl$checkForCompliance$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            obj = objEZpvd;
            str2 = str;
            c38095pMa = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (java.lang.String) appLinkProcessorImpl$checkForCompliance$1.L$1;
                c38095pMa = (C38095pMa) appLinkProcessorImpl$checkForCompliance$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                c38095pMa.AYXKKw.invoke("AppLinkProcessorImpl", "checkForCompliance - compliance passed - " + str3);
                return Unit.INSTANCE;
            }
            java.lang.String str4 = (java.lang.String) appLinkProcessorImpl$checkForCompliance$1.L$2;
            interfaceC43232rlR = (InterfaceC43232rlR) appLinkProcessorImpl$checkForCompliance$1.L$1;
            C38095pMa c38095pMa2 = (C38095pMa) appLinkProcessorImpl$checkForCompliance$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            str2 = str4;
            c38095pMa = c38095pMa2;
            obj = obj2;
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            appLinkProcessorImpl$checkForCompliance$1.L$0 = c38095pMa;
            appLinkProcessorImpl$checkForCompliance$1.L$1 = str2;
            appLinkProcessorImpl$checkForCompliance$1.L$2 = null;
            appLinkProcessorImpl$checkForCompliance$1.label = 2;
            if (c38095pMa.EZpvd(interfaceC43232rlR, str2, appLinkProcessorImpl$checkForCompliance$1) == objCopydefault) {
                return objCopydefault;
            }
            str3 = str2;
            c38095pMa.AYXKKw.invoke("AppLinkProcessorImpl", "checkForCompliance - compliance passed - " + str3);
            return Unit.INSTANCE;
        }
        C38097pMc.finishProcessing$default(c38095pMa, LinkState.MODE_NOT_SUPPORTED, false, 2, null);
        c38095pMa.AYXKKw.invoke("AppLinkProcessorImpl", "checkForCompliance - compliance failed - " + str2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(InterfaceC43232rlR interfaceC43232rlR, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AppLinkProcessorImpl$proceedToModeSwitching$1 appLinkProcessorImpl$proceedToModeSwitching$1;
        C38095pMa c38095pMa;
        if (continuation instanceof AppLinkProcessorImpl$proceedToModeSwitching$1) {
            appLinkProcessorImpl$proceedToModeSwitching$1 = (AppLinkProcessorImpl$proceedToModeSwitching$1) continuation;
            int i = appLinkProcessorImpl$proceedToModeSwitching$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                appLinkProcessorImpl$proceedToModeSwitching$1.label = i - Integer.MIN_VALUE;
            } else {
                appLinkProcessorImpl$proceedToModeSwitching$1 = new AppLinkProcessorImpl$proceedToModeSwitching$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = appLinkProcessorImpl$proceedToModeSwitching$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = appLinkProcessorImpl$proceedToModeSwitching$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            pMX pmx = this.gEmmrt;
            DeeplinkMode deeplinkModeCopydefault = interfaceC43232rlR.copydefault();
            java.lang.String strAEQbTJ = interfaceC43232rlR.AEQbTJ();
            appLinkProcessorImpl$proceedToModeSwitching$1.L$0 = this;
            appLinkProcessorImpl$proceedToModeSwitching$1.L$1 = str;
            appLinkProcessorImpl$proceedToModeSwitching$1.label = 1;
            objCopydefault = pmx.copydefault(deeplinkModeCopydefault, strAEQbTJ, appLinkProcessorImpl$proceedToModeSwitching$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c38095pMa = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) appLinkProcessorImpl$proceedToModeSwitching$1.L$1;
            c38095pMa = (C38095pMa) appLinkProcessorImpl$proceedToModeSwitching$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        if (((java.lang.Boolean) objCopydefault).booleanValue()) {
            c38095pMa.AhwBna(str);
            c38095pMa.AYXKKw.invoke("AppLinkProcessorImpl", "proceedToModeSwitching - modeCheckPassed - " + str);
        } else {
            C38097pMc.finishProcessing$default(c38095pMa, LinkState.MODE_SWITCH_CANCELLED, false, 2, null);
            c38095pMa.AYXKKw.invoke("AppLinkProcessorImpl", "proceedToModeSwitching - modeCheck failed - " + str);
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna(java.lang.String str) {
        InterfaceC43236rlV interfaceC43236rlVCopydefault = copydefault(str);
        if (interfaceC43236rlVCopydefault != null) {
            kotlin.Pair<InterfaceC43232rlR, java.util.Map<java.lang.String, java.lang.Object>> pairAkhnZx = AkhnZx(str);
            KWHzl(LinkState.SUCCESS, this.copydefault.copydefault());
            java.util.Map<java.lang.String, ? extends java.lang.Object> mapIsConnected = C56424yEw.isConnected(pairAkhnZx.getSecond());
            OLrzqt(mapIsConnected, str);
            this.AhwBna.AEQbTJ(interfaceC43236rlVCopydefault, pairAkhnZx.getFirst(), mapIsConnected);
            this.AYXKKw.invoke("AppLinkProcessorImpl", "resolveLinkHandler - passed - " + str + " - " + interfaceC43236rlVCopydefault.getClass());
            return;
        }
        C38097pMc.finishProcessing$default(this, LinkState.NO_SUPPORTED_HANDLER, false, 2, null);
        this.AYXKKw.invoke("AppLinkProcessorImpl", "resolveLinkHandler - no handler - " + str);
    }

    @Override // o.InterfaceC38098pMd
    public AnalyticsLinkType OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.djBIcL.copydefault(str)) {
            return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "/download", false, 2, (java.lang.Object) null) ? AnalyticsLinkType.DOWNLOAD_LINK : StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "/ul/", false, 2, (java.lang.Object) null) ? AnalyticsLinkType.SHORTCODE_LINK : StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "/campaigns/", false, 2, (java.lang.Object) null) ? AnalyticsLinkType.CAMPAIGN_LINK : AnalyticsLinkType.OTHER_UNIVERSAL_LINK;
        }
        return AnalyticsLinkType.NON_OKX_UNIVERSAL_LINK;
    }

    @Override // o.InterfaceC38098pMd
    public boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ = AEQbTJ(str);
            if (this.djBIcL.copydefault(str)) {
                if (!copydefault(pairAEQbTJ) && !OLrzqt(pairAEQbTJ)) {
                    if (gEmmrt(str)) {
                    }
                }
                return true;
            }
        } catch (java.lang.Exception unused) {
        }
        return false;
    }

    public final boolean gEmmrt(java.lang.String str) {
        InterfaceC43232rlR interfaceC43232rlRAYXKKw = AYXKKw(str);
        return interfaceC43232rlRAYXKKw != null && KWHzl(str, interfaceC43232rlRAYXKKw);
    }

    public final boolean OLrzqt(kotlin.Pair<java.lang.String, java.lang.String> pair) {
        return Intrinsics.EZpvd((java.lang.Object) pair.getFirst(), (java.lang.Object) "download") || (this.EZpvd.invoke(pair.getFirst()).booleanValue() && Intrinsics.EZpvd((java.lang.Object) pair.getSecond(), (java.lang.Object) "download"));
    }

    public final boolean copydefault(kotlin.Pair<java.lang.String, java.lang.String> pair) {
        return Intrinsics.EZpvd((java.lang.Object) pair.getFirst(), (java.lang.Object) "ul");
    }
}

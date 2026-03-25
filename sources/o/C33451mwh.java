package o;

import com.okinc.core.ok_app.modeswitch.repository.AppSubModeRepository$appModeSwitchCallback$1;
import com.okinc.core.ok_app.modeswitch.repository.AppSubModeRepository$complianceUpdatedCallback$1;
import com.okinc.core.ok_app.modeswitch.repository.AppSubModeRepository$setAppSubMode$1;
import com.okinc.core.ok_app.modeswitch.repository.AppSubModeRepository$tradeModePolicyMonitor$1;
import com.okinc.core.ok_app.modeswitch.repository.AppSubModeRepository$tradeModePolicyMonitor$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33249msr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C33451mwh {
    public static C33451mwh EZpvd;
    public Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> AYXKKw;
    public final StateFlow<AbstractC33249msr> AhwBna;
    public final C33446mwc KWHzl;
    public final MutableStateFlow<AbstractC33249msr> OLrzqt;
    public Function2<? super java.lang.Integer, ? super Continuation<? super Unit>, ? extends java.lang.Object> copydefault;
    public final AbstractC33249msr.TaskDescription valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC33249msr.TaskDescription AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AYXKKw = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC33249msr> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>, kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> */
    public final Function2<java.lang.Integer, Continuation<? super Unit>, java.lang.Object> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>, kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> */
    public final Function1<Continuation<? super Unit>, java.lang.Object> copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Function2<? super java.lang.Integer, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.copydefault = function2;
    }

    @yCM
    public C33451mwh(@NotNull C33446mwc c33446mwc) {
        Intrinsics.checkNotNullParameter(c33446mwc, "");
        this.KWHzl = c33446mwc;
        AbstractC33249msr.TaskDescription taskDescription = AbstractC33249msr.TaskDescription.KWHzl;
        this.valueOf = taskDescription;
        this.AYXKKw = new AppSubModeRepository$complianceUpdatedCallback$1(null);
        this.copydefault = new AppSubModeRepository$appModeSwitchCallback$1(null);
        MutableStateFlow<AbstractC33249msr> MutableStateFlow = StateFlowKt.MutableStateFlow(taskDescription);
        this.OLrzqt = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        pUU.EZpvd("ModeSwitch", "AppSubModeRepository init");
        AEQbTJ(GlobalScope.INSTANCE);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull AbstractC33249msr abstractC33249msr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC33249msr, "");
        pUU.KWHzl("ModeSwitch", "setup: from=" + this.OLrzqt.getValue() + ", to=" + abstractC33249msr + ", uid=" + str);
        this.OLrzqt.setValue(abstractC33249msr);
        AEQbTJ(abstractC33249msr, str);
        pUU.KWHzl("ModeSwitch", "setup: Mode set and stored successfully");
    }

    public final void KWHzl(@NotNull AbstractC33249msr abstractC33249msr, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC33249msr, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("ModeSwitch", "setAppSubMode: from=" + this.OLrzqt.getValue() + ", to=" + abstractC33249msr + ", uid=" + str);
        this.KWHzl.KWHzl("LAST_CEFI_APP_SUB_MODE_SP_KEY", abstractC33249msr.KWHzl());
        AEQbTJ(abstractC33249msr, str);
        this.OLrzqt.setValue(abstractC33249msr);
        pUU.KWHzl("ModeSwitch", "setAppSubMode: Mode set and stored successfully");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull AbstractC33249msr abstractC33249msr, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AppSubModeRepository$setAppSubMode$1 appSubModeRepository$setAppSubMode$1;
        if (continuation instanceof AppSubModeRepository$setAppSubMode$1) {
            appSubModeRepository$setAppSubMode$1 = (AppSubModeRepository$setAppSubMode$1) continuation;
            int i = appSubModeRepository$setAppSubMode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                appSubModeRepository$setAppSubMode$1.label = i - Integer.MIN_VALUE;
            } else {
                appSubModeRepository$setAppSubMode$1 = new AppSubModeRepository$setAppSubMode$1(this, continuation);
            }
        }
        java.lang.Object obj = appSubModeRepository$setAppSubMode$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = appSubModeRepository$setAppSubMode$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("ModeSwitch", "setAppSubMode: from=" + this.OLrzqt.getValue() + ", to=" + abstractC33249msr + ", uid=" + str);
            this.KWHzl.KWHzl("LAST_CEFI_APP_SUB_MODE_SP_KEY", abstractC33249msr.KWHzl());
            AEQbTJ(abstractC33249msr, str);
            MutableStateFlow<AbstractC33249msr> mutableStateFlow = this.OLrzqt;
            appSubModeRepository$setAppSubMode$1.label = 1;
            if (mutableStateFlow.emit(abstractC33249msr, appSubModeRepository$setAppSubMode$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        pUU.KWHzl("ModeSwitch", "setAppSubMode: Mode set and stored successfully");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ AbstractC33249msr getLastAppSubMode$default(C33451mwh c33451mwh, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c33451mwh.KWHzl(str);
    }

    public final AbstractC33249msr KWHzl(java.lang.String str) {
        java.lang.String strCopydefault;
        AbstractC33249msr.Activity activity = AbstractC33249msr.Companion;
        C33446mwc c33446mwc = this.KWHzl;
        if (str == null || (strCopydefault = copydefault(str)) == null) {
            strCopydefault = "LAST_CEFI_APP_SUB_MODE_SP_KEY";
        }
        return activity.OLrzqt(c33446mwc.EZpvd(strCopydefault, this.valueOf.KWHzl()));
    }

    public final void AEQbTJ(AbstractC33249msr abstractC33249msr, java.lang.String str) {
        this.KWHzl.KWHzl(copydefault(str), abstractC33249msr.KWHzl());
        if (!C33367mvC.valueOf() || C33431mwN.EZpvd.KWHzl()) {
            return;
        }
        C33404mvn.Companion.copydefault().AEQbTJ(C33250mss.KWHzl(abstractC33249msr), str);
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return "APP_SUB_MODE_SP_KEY_" + str;
    }

    public final void AEQbTJ(CoroutineScope coroutineScope) {
        pUU.EZpvd("ModeSwitch", "tradeModePolicyMonitor: Starting policy monitors");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AppSubModeRepository$tradeModePolicyMonitor$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AppSubModeRepository$tradeModePolicyMonitor$2(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.mwh$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mwh.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C33451mwh OLrzqt() {
            C33451mwh c33451mwh = C33451mwh.EZpvd;
            if (c33451mwh == null) {
                synchronized (this) {
                    c33451mwh = C33451mwh.EZpvd;
                    if (c33451mwh == null) {
                        c33451mwh = new C33451mwh(C33446mwc.Companion.EZpvd());
                        Application application = C33451mwh.Companion;
                        C33451mwh.EZpvd = c33451mwh;
                    }
                }
            }
            return c33451mwh;
        }
    }
}

package o;

import com.okinc.core.ok_app.modeswitch.repository.LiteSubModeRepository$appModeSwitchCallback$1;
import com.okinc.core.ok_app.modeswitch.repository.LiteSubModeRepository$complianceUpdatedCallback$1;
import com.okinc.core.ok_app.modeswitch.repository.LiteSubModeRepository$setTradeMode$1;
import com.okinc.core.ok_app.modeswitch.repository.LiteSubModeRepository$tradeModePolicyMonitor$1;
import com.okinc.core.ok_app.modeswitch.repository.LiteSubModeRepository$tradeModePolicyMonitor$2;
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
import o.AbstractC33240msi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C33447mwd {
    public static C33447mwd copydefault;
    public final C33449mwf AhwBna;
    public final MutableStateFlow<AbstractC33240msi> EZpvd;
    public Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> KWHzl;
    public Function2<? super java.lang.Integer, ? super Continuation<? super Unit>, ? extends java.lang.Object> OLrzqt;
    public final StateFlow<AbstractC33240msi> djBIcL;
    public final AbstractC33240msi.Application valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC33240msi> AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>, kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> */
    public final Function1<Continuation<? super Unit>, java.lang.Object> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function2<? super java.lang.Integer, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>, kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> */
    public final Function2<java.lang.Integer, Continuation<? super Unit>, java.lang.Object> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC33240msi.Application copydefault() {
        return this.valueOf;
    }

    @yCM
    public C33447mwd(@NotNull C33449mwf c33449mwf) {
        Intrinsics.checkNotNullParameter(c33449mwf, "");
        this.AhwBna = c33449mwf;
        AbstractC33240msi.Application application = AbstractC33240msi.Application.copydefault;
        this.valueOf = application;
        this.KWHzl = new LiteSubModeRepository$complianceUpdatedCallback$1(null);
        this.OLrzqt = new LiteSubModeRepository$appModeSwitchCallback$1(null);
        MutableStateFlow<AbstractC33240msi> MutableStateFlow = StateFlowKt.MutableStateFlow(application);
        this.EZpvd = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull AbstractC33240msi abstractC33240msi) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC33240msi, "");
        pUU.KWHzl("ModeSwitch", "setup: uid=" + str + ", isMainAccount=" + z + ", isSubAccount=" + z2 + ", primaryMode=" + abstractC33240msi);
        copydefault(GlobalScope.INSTANCE);
        KWHzl(str, z, z2);
        AbstractC33240msi abstractC33240msiAEQbTJ = AbstractC33240msi.Companion.AEQbTJ(this.AhwBna.EZpvd(AEQbTJ(str), abstractC33240msi.AEQbTJ()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("setup: storedMode=");
        sb.append(abstractC33240msiAEQbTJ);
        pUU.KWHzl("ModeSwitch", sb.toString());
        this.EZpvd.setValue(abstractC33240msiAEQbTJ);
    }

    public final void KWHzl(java.lang.String str, boolean z, boolean z2) {
        java.lang.String strEZpvd = this.AhwBna.EZpvd("LITE_SUB_MODE_SP_KEY", "");
        if (strEZpvd.length() > 0 && z) {
            this.AhwBna.copydefault(AEQbTJ(str), strEZpvd);
            this.AhwBna.copydefault("LITE_SUB_MODE_SP_KEY", "");
            return;
        }
        java.lang.String strEZpvd2 = this.AhwBna.EZpvd("LITE_SUB_MODE_SP_KEY_SUB_ACCOUNT", "");
        if (strEZpvd2.length() <= 0 || !z2) {
            return;
        }
        this.AhwBna.copydefault(AEQbTJ(str), strEZpvd2);
        this.AhwBna.copydefault("LITE_SUB_MODE_SP_KEY_SUB_ACCOUNT", "");
    }

    public final void OLrzqt(@NotNull AbstractC33240msi abstractC33240msi, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC33240msi, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("ModeSwitch", "setTradeMode: from=" + this.EZpvd.getValue() + ", to=" + abstractC33240msi + ", uid=" + str);
        this.EZpvd.setValue(abstractC33240msi);
        KWHzl(abstractC33240msi, str);
        pUU.KWHzl("ModeSwitch", "setTradeMode: Mode set and stored successfully");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull AbstractC33240msi abstractC33240msi, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        LiteSubModeRepository$setTradeMode$1 liteSubModeRepository$setTradeMode$1;
        C33447mwd c33447mwd;
        if (continuation instanceof LiteSubModeRepository$setTradeMode$1) {
            liteSubModeRepository$setTradeMode$1 = (LiteSubModeRepository$setTradeMode$1) continuation;
            int i = liteSubModeRepository$setTradeMode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liteSubModeRepository$setTradeMode$1.label = i - Integer.MIN_VALUE;
            } else {
                liteSubModeRepository$setTradeMode$1 = new LiteSubModeRepository$setTradeMode$1(this, continuation);
            }
        }
        java.lang.Object obj = liteSubModeRepository$setTradeMode$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = liteSubModeRepository$setTradeMode$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("ModeSwitch", "setTradeMode: from=" + this.EZpvd.getValue() + ", to=" + abstractC33240msi + ", uid=" + str);
            MutableStateFlow<AbstractC33240msi> mutableStateFlow = this.EZpvd;
            liteSubModeRepository$setTradeMode$1.L$0 = this;
            liteSubModeRepository$setTradeMode$1.L$1 = abstractC33240msi;
            liteSubModeRepository$setTradeMode$1.L$2 = str;
            liteSubModeRepository$setTradeMode$1.label = 1;
            if (mutableStateFlow.emit(abstractC33240msi, liteSubModeRepository$setTradeMode$1) == objCopydefault) {
                return objCopydefault;
            }
            c33447mwd = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) liteSubModeRepository$setTradeMode$1.L$2;
            abstractC33240msi = (AbstractC33240msi) liteSubModeRepository$setTradeMode$1.L$1;
            c33447mwd = (C33447mwd) liteSubModeRepository$setTradeMode$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        c33447mwd.KWHzl(abstractC33240msi, str);
        pUU.KWHzl("ModeSwitch", "setTradeMode: Mode set and stored successfully");
        return Unit.INSTANCE;
    }

    public final java.lang.Object KWHzl(@NotNull AbstractC33240msi abstractC33240msi, @NotNull Continuation<? super Unit> continuation) {
        pUU.KWHzl("ModeSwitch", "setLastCefiTradeMode: mode=" + abstractC33240msi);
        EZpvd(abstractC33240msi);
        return Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull AbstractC33240msi abstractC33240msi, @NotNull Continuation<? super java.lang.String> continuation) {
        KWHzl(str, z, z2);
        return this.AhwBna.EZpvd(AEQbTJ(str), abstractC33240msi.AEQbTJ());
    }

    public final AbstractC33240msi AEQbTJ() {
        return AbstractC33240msi.Companion.AEQbTJ(this.AhwBna.EZpvd("LAST_CEFI_LITE_SUB_MODE_SP_KEY", this.valueOf.AEQbTJ()));
    }

    public final void KWHzl(AbstractC33240msi abstractC33240msi, java.lang.String str) {
        this.AhwBna.copydefault(AEQbTJ(str), abstractC33240msi.AEQbTJ());
        if (!C33367mvC.copydefault() || C33431mwN.EZpvd.KWHzl()) {
            return;
        }
        C33404mvn.Companion.copydefault().AEQbTJ(C33239msh.OLrzqt(abstractC33240msi), str);
    }

    public final void EZpvd(AbstractC33240msi abstractC33240msi) {
        this.AhwBna.copydefault("LAST_CEFI_LITE_SUB_MODE_SP_KEY", abstractC33240msi.AEQbTJ());
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return "LITE_SUB_MODE_SP_KEY_" + str;
    }

    public final void copydefault(CoroutineScope coroutineScope) {
        pUU.EZpvd("ModeSwitch", "tradeModePolicyMonitor: Starting policy monitors");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LiteSubModeRepository$tradeModePolicyMonitor$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LiteSubModeRepository$tradeModePolicyMonitor$2(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.mwd$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mwd.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C33447mwd EZpvd() {
            C33447mwd c33447mwd = C33447mwd.copydefault;
            if (c33447mwd == null) {
                synchronized (this) {
                    c33447mwd = C33447mwd.copydefault;
                    if (c33447mwd == null) {
                        c33447mwd = new C33447mwd(C33449mwf.Companion.copydefault());
                        Activity activity = C33447mwd.Companion;
                        C33447mwd.copydefault = c33447mwd;
                    }
                }
            }
            return c33447mwd;
        }
    }
}

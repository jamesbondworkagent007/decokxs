package o;

import com.okinc.core.ok_app.modeswitch.usecase.AppSubModeUseCase$1;
import com.okinc.core.ok_app.modeswitch.usecase.AppSubModeUseCase$2;
import com.okinc.core.ok_app.modeswitch.usecase.AppSubModeUseCase$onComplianceChange$1;
import com.okinc.core.ok_app.modeswitch.usecase.AppSubModeUseCase$switchSubMode$1;
import com.okinc.core.ok_app.modeswitch.usecase.AppSubModeUseCase$switchSubMode$2;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC33249msr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33453mwj {
    public static C33453mwj OLrzqt;
    public final InterfaceC56387yDm AhwBna;
    public final C33448mwe EZpvd;
    public final C33451mwh KWHzl;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C33453mwj() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public C33453mwj(@NotNull C33448mwe c33448mwe, @NotNull C33451mwh c33451mwh) {
        Intrinsics.checkNotNullParameter(c33448mwe, "");
        Intrinsics.checkNotNullParameter(c33451mwh, "");
        this.EZpvd = c33448mwe;
        this.KWHzl = c33451mwh;
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.mwl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33453mwj.djBIcL();
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.mwk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33453mwj.valueOf();
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mwm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33453mwj.OLrzqt();
            }
        });
        pUU.EZpvd("ModeSwitch", "AppSubModeUseCase init started");
        c33451mwh.copydefault(new AppSubModeUseCase$1(this));
        c33451mwh.EZpvd(new AppSubModeUseCase$2(this));
        AkhnZx();
        pUU.KWHzl("ModeSwitch", "AppSubModeUseCase init done, currentMode: " + AYXKKw().getValue());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:o.mwe:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.mwe:0x0006: INVOKE (wrap:o.mwe$TaskDescription:0x0004: SGET  A[WRAPPED] (LINE:25) o.mwe.Companion o.mwe$TaskDescription) VIRTUAL call: o.mwe.TaskDescription.OLrzqt():o.mwe A[MD:():o.mwe (m), WRAPPED] (LINE:25)) : (r1v0 o.mwe))
  (wrap:o.mwh:?: TERNARY null = ((wrap:int:0x000a: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.mwh:0x0010: INVOKE (wrap:o.mwh$Application:0x000e: SGET  A[WRAPPED] (LINE:26) o.mwh.Companion o.mwh$Application) VIRTUAL call: o.mwh.Application.OLrzqt():o.mwh A[MD:():o.mwh (m), WRAPPED] (LINE:26)) : (r2v0 o.mwh))
 A[MD:(o.mwe, o.mwh):void (m)] (LINE:24) call: o.mwj.<init>(o.mwe, o.mwh):void type: THIS */
    public /* synthetic */ C33453mwj(C33448mwe c33448mwe, C33451mwh c33451mwh, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C33448mwe.Companion.OLrzqt() : c33448mwe, (i & 2) != 0 ? C33451mwh.Companion.OLrzqt() : c33451mwh);
    }

    public static final OKComplianceRestrictionService djBIcL() {
        return (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);
    }

    public final InterfaceC47278tmy values() {
        return (InterfaceC47278tmy) this.AhwBna.getValue();
    }

    public static final InterfaceC47278tmy valueOf() {
        return ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf().getApplicationContext(), InterfaceC47230tmC.class)).fmB();
    }

    public final InterfaceC33171mrS AhwBna() {
        return (InterfaceC33171mrS) this.copydefault.getValue();
    }

    public static final InterfaceC33171mrS OLrzqt() {
        return (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
    }

    public final void AkhnZx() {
        AbstractC33249msr abstractC33249msrGEmmrt;
        java.lang.String strCopydefault = C33460mwq.copydefault(values());
        int iIntValue = AhwBna().isConnected().getValue().intValue();
        boolean z = iIntValue == 3;
        boolean z2 = iIntValue == 5;
        if (z) {
            abstractC33249msrGEmmrt = AbstractC33249msr.ActionBar.EZpvd;
        } else {
            abstractC33249msrGEmmrt = gEmmrt();
        }
        AbstractC33249msr abstractC33249msrKWHzl = this.KWHzl.KWHzl(strCopydefault);
        AbstractC33249msr value = AYXKKw().getValue();
        boolean zFetchVPNInfo = fetchVPNInfo();
        pUU.KWHzl("ModeSwitch", "setupCurrentMode: uid=" + strCopydefault + ", appMode=" + iIntValue + ", isWeb3CurrentMode=" + z + ", isPayCurrentMode=" + z2 + ", primaryMode=" + abstractC33249msrGEmmrt + ", lastMode=" + abstractC33249msrKWHzl + ", currentMode=" + value + ", modeSwitchEnabled=" + zFetchVPNInfo);
        if (z2) {
            AbstractC33249msr.Application application = AbstractC33249msr.Application.AEQbTJ;
            boolean zCopydefault = copydefault(application);
            pUU.KWHzl("ModeSwitch", "setupCurrentMode: App is in Pay mode, payPassesCompliance=" + zCopydefault);
            if (zCopydefault) {
                pUU.KWHzl("ModeSwitch", "setupCurrentMode: Setting to Pay mode");
                abstractC33249msrGEmmrt = application;
            } else {
                boolean zCopydefault2 = copydefault(abstractC33249msrKWHzl);
                pUU.KWHzl("ModeSwitch", "setupCurrentMode: Pay doesn't pass compliance, lastModePassesCompliance=" + zCopydefault2);
                if (zCopydefault2) {
                    abstractC33249msrGEmmrt = abstractC33249msrKWHzl;
                } else {
                    pUU.valueOf("ModeSwitch", "setupCurrentMode: lastMode doesn't pass compliance, using primaryMode");
                }
            }
        } else if (!zFetchVPNInfo && Intrinsics.EZpvd(abstractC33249msrKWHzl, AbstractC33249msr.Application.AEQbTJ)) {
            pUU.KWHzl("ModeSwitch", "setupCurrentMode: Mode switch not enabled and lastMode is Pay, using primaryMode");
        } else if (z) {
            pUU.KWHzl("ModeSwitch", "setupCurrentMode: Forcing to Web3 mode");
            abstractC33249msrGEmmrt = AbstractC33249msr.ActionBar.EZpvd;
        } else {
            boolean zCopydefault3 = copydefault(value);
            pUU.KWHzl("ModeSwitch", "setupCurrentMode: Not pay/web3, currentPassesCompliance=" + zCopydefault3);
            if (zCopydefault3) {
                abstractC33249msrGEmmrt = value;
            } else {
                pUU.valueOf("ModeSwitch", "setupCurrentMode: currentMode doesn't pass compliance, using primaryMode");
            }
        }
        pUU.KWHzl("ModeSwitch", "setupCurrentMode: nextMode=" + abstractC33249msrGEmmrt);
        this.KWHzl.KWHzl(strCopydefault, abstractC33249msrGEmmrt);
    }

    public final StateFlow<AbstractC33249msr> AYXKKw() {
        return this.KWHzl.KWHzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull AbstractC33249msr abstractC33249msr, @NotNull android.content.Context context, android.os.Bundle bundle, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        AppSubModeUseCase$switchSubMode$1 appSubModeUseCase$switchSubMode$1;
        C33453mwj c33453mwj;
        if (continuation instanceof AppSubModeUseCase$switchSubMode$1) {
            appSubModeUseCase$switchSubMode$1 = (AppSubModeUseCase$switchSubMode$1) continuation;
            int i = appSubModeUseCase$switchSubMode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                appSubModeUseCase$switchSubMode$1.label = i - Integer.MIN_VALUE;
            } else {
                appSubModeUseCase$switchSubMode$1 = new AppSubModeUseCase$switchSubMode$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = appSubModeUseCase$switchSubMode$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = appSubModeUseCase$switchSubMode$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            AbstractC33249msr value = AYXKKw().getValue();
            pUU.KWHzl("ModeSwitch", "switchSubMode: Attempting to switch from " + value + " to " + abstractC33249msr + " with context");
            if (!EZpvd(value, abstractC33249msr)) {
                pUU.valueOf("ModeSwitch", "switchSubMode: Cannot switch from " + value + " to " + abstractC33249msr);
                return C56443yFo.KWHzl(false);
            }
            pUU.KWHzl("ModeSwitch", "switchSubMode: Triggering animation");
            C33448mwe c33448mwe = this.EZpvd;
            appSubModeUseCase$switchSubMode$1.L$0 = this;
            appSubModeUseCase$switchSubMode$1.L$1 = abstractC33249msr;
            appSubModeUseCase$switchSubMode$1.label = 1;
            if (c33448mwe.OLrzqt(abstractC33249msr, context, value, bundle, appSubModeUseCase$switchSubMode$1) == objCopydefault2) {
                return objCopydefault2;
            }
            c33453mwj = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                boolean zBooleanValue = ((java.lang.Boolean) objCopydefault).booleanValue();
                pUU.KWHzl("ModeSwitch", "switchSubMode: Mode switch result=" + zBooleanValue);
                return C56443yFo.KWHzl(zBooleanValue);
            }
            abstractC33249msr = (AbstractC33249msr) appSubModeUseCase$switchSubMode$1.L$1;
            c33453mwj = (C33453mwj) appSubModeUseCase$switchSubMode$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        appSubModeUseCase$switchSubMode$1.L$0 = null;
        appSubModeUseCase$switchSubMode$1.L$1 = null;
        appSubModeUseCase$switchSubMode$1.label = 2;
        objCopydefault = c33453mwj.copydefault(abstractC33249msr, appSubModeUseCase$switchSubMode$1);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        boolean zBooleanValue2 = ((java.lang.Boolean) objCopydefault).booleanValue();
        pUU.KWHzl("ModeSwitch", "switchSubMode: Mode switch result=" + zBooleanValue2);
        return C56443yFo.KWHzl(zBooleanValue2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull AbstractC33249msr abstractC33249msr, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        AppSubModeUseCase$switchSubMode$2 appSubModeUseCase$switchSubMode$2;
        if (continuation instanceof AppSubModeUseCase$switchSubMode$2) {
            appSubModeUseCase$switchSubMode$2 = (AppSubModeUseCase$switchSubMode$2) continuation;
            int i = appSubModeUseCase$switchSubMode$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                appSubModeUseCase$switchSubMode$2.label = i - Integer.MIN_VALUE;
            } else {
                appSubModeUseCase$switchSubMode$2 = new AppSubModeUseCase$switchSubMode$2(this, continuation);
            }
        }
        java.lang.Object obj = appSubModeUseCase$switchSubMode$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = appSubModeUseCase$switchSubMode$2.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC33249msr value = AYXKKw().getValue();
            java.lang.String strCopydefault = C33460mwq.copydefault(values());
            pUU.KWHzl("ModeSwitch", "switchSubMode: currentMode=" + value + ", nextMode=" + abstractC33249msr + ", uid=" + strCopydefault);
            if (!EZpvd(value, abstractC33249msr)) {
                pUU.valueOf("ModeSwitch", "switchSubMode: Cannot switch from " + value + " to " + abstractC33249msr);
                return C56443yFo.KWHzl(false);
            }
            pUU.KWHzl("ModeSwitch", "switchSubMode: Setting app sub mode to " + abstractC33249msr + " for uid=" + strCopydefault);
            C33451mwh c33451mwh = this.KWHzl;
            appSubModeUseCase$switchSubMode$2.L$0 = abstractC33249msr;
            appSubModeUseCase$switchSubMode$2.label = 1;
            if (c33451mwh.AEQbTJ(abstractC33249msr, strCopydefault, appSubModeUseCase$switchSubMode$2) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC33249msr = (AbstractC33249msr) appSubModeUseCase$switchSubMode$2.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        pUU.KWHzl("ModeSwitch", "switchSubMode: Mode switched successfully to " + abstractC33249msr);
        return C56443yFo.KWHzl(true);
    }

    public final boolean EZpvd(AbstractC33249msr abstractC33249msr, AbstractC33249msr abstractC33249msr2) {
        boolean zCopydefault = copydefault(abstractC33249msr2);
        boolean zEZpvd = Intrinsics.EZpvd(abstractC33249msr2, abstractC33249msr);
        pUU.EZpvd("ModeSwitch", "canSwitchTo: from=" + abstractC33249msr + ", to=" + abstractC33249msr2 + ", passesCompliance=" + zCopydefault + ", isSameMode=" + zEZpvd + ", isProAvailable=" + C33367mvC.valueOf());
        if (!zCopydefault) {
            pUU.copydefault("ModeSwitch", "canSwitchTo: " + abstractC33249msr2 + " does not pass compliance. Contact Compliance team.");
            return false;
        }
        if (zEZpvd) {
            pUU.EZpvd("ModeSwitch", "canSwitchTo: Already in " + abstractC33249msr2 + " mode");
            return false;
        }
        if (!C33367mvC.valueOf()) {
            pUU.copydefault("ModeSwitch", "canSwitchTo: Pro mode not available");
            return false;
        }
        pUU.EZpvd("ModeSwitch", "canSwitchTo: Can switch from " + abstractC33249msr + " to " + abstractC33249msr2);
        return true;
    }

    public final boolean fetchVPNInfo() {
        InterfaceC33174mrV interfaceC33174mrV;
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33174mrV.class));
        return (listKWHzl == null || (interfaceC33174mrV = (InterfaceC33174mrV) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null || !interfaceC33174mrV.AEQbTJ()) ? false : true;
    }

    public final boolean copydefault(AbstractC33249msr abstractC33249msr) {
        if (!fetchVPNInfo()) {
            return false;
        }
        if (Intrinsics.EZpvd(abstractC33249msr, AbstractC33249msr.TaskDescription.KWHzl)) {
            return C33367mvC.AEQbTJ() && C33367mvC.valueOf();
        }
        if (Intrinsics.EZpvd(abstractC33249msr, AbstractC33249msr.ActionBar.EZpvd)) {
            return DbNXlk();
        }
        if (Intrinsics.EZpvd(abstractC33249msr, AbstractC33249msr.Application.AEQbTJ)) {
            return fetchVPNInfo();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final AbstractC33249msr gEmmrt() {
        return AhwBna().iwGUEr() ? AbstractC33249msr.ActionBar.EZpvd : this.KWHzl.AEQbTJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AppSubModeUseCase$onComplianceChange$1 appSubModeUseCase$onComplianceChange$1;
        C33453mwj c33453mwj;
        if (continuation instanceof AppSubModeUseCase$onComplianceChange$1) {
            appSubModeUseCase$onComplianceChange$1 = (AppSubModeUseCase$onComplianceChange$1) continuation;
            int i = appSubModeUseCase$onComplianceChange$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                appSubModeUseCase$onComplianceChange$1.label = i - Integer.MIN_VALUE;
            } else {
                appSubModeUseCase$onComplianceChange$1 = new AppSubModeUseCase$onComplianceChange$1(this, continuation);
            }
        }
        java.lang.Object obj = appSubModeUseCase$onComplianceChange$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = appSubModeUseCase$onComplianceChange$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33453mwj = (C33453mwj) appSubModeUseCase$onComplianceChange$1.L$0;
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("ModeSwitch", "onComplianceChange: Calling setupCurrentMode");
            c33453mwj.AkhnZx();
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        int iIntValue = AhwBna().isConnected().getValue().intValue();
        AbstractC33249msr value = AYXKKw().getValue();
        boolean zFetchVPNInfo = fetchVPNInfo();
        java.lang.String strCopydefault = C33460mwq.copydefault(values());
        pUU.KWHzl("ModeSwitch", "onComplianceChange: isProAvailable=" + C33367mvC.valueOf() + ", currentAppMode=" + iIntValue + ", currentProSubMode=" + value + ", modeSwitchEnabled=" + zFetchVPNInfo + ", uid=" + strCopydefault);
        if (!C33367mvC.valueOf()) {
            AbstractC33249msr abstractC33249msrGEmmrt = gEmmrt();
            pUU.KWHzl("ModeSwitch", "onComplianceChange: Pro not available, setting to primaryMode=" + abstractC33249msrGEmmrt);
            C33451mwh c33451mwh = this.KWHzl;
            appSubModeUseCase$onComplianceChange$1.label = 1;
            if (c33451mwh.AEQbTJ(abstractC33249msrGEmmrt, strCopydefault, appSubModeUseCase$onComplianceChange$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
        if (iIntValue == 3) {
            pUU.KWHzl("ModeSwitch", "onComplianceChange: User in Web3, keeping Web3 mode");
            C33451mwh c33451mwh2 = this.KWHzl;
            AbstractC33249msr.ActionBar actionBar = AbstractC33249msr.ActionBar.EZpvd;
            appSubModeUseCase$onComplianceChange$1.L$0 = this;
            appSubModeUseCase$onComplianceChange$1.label = 2;
            if (c33451mwh2.AEQbTJ(actionBar, strCopydefault, appSubModeUseCase$onComplianceChange$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        c33453mwj = this;
        pUU.EZpvd("ModeSwitch", "onComplianceChange: Calling setupCurrentMode");
        c33453mwj.AkhnZx();
        return Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(int i, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.String strCopydefault = C33460mwq.copydefault(values());
        pUU.KWHzl("ModeSwitch", "onAppModeChange: appMode=" + i + ", isProAvailable=" + C33367mvC.valueOf() + ", uid=" + strCopydefault);
        if (!C33367mvC.valueOf()) {
            AbstractC33249msr abstractC33249msrGEmmrt = gEmmrt();
            pUU.KWHzl("ModeSwitch", "onAppModeChange: Pro not available, setting to primaryMode=" + abstractC33249msrGEmmrt);
            java.lang.Object objAEQbTJ = this.KWHzl.AEQbTJ(abstractC33249msrGEmmrt, strCopydefault, continuation);
            return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
        }
        AbstractC33249msr abstractC33249msrEZpvd = C33250mss.EZpvd(i);
        if (abstractC33249msrEZpvd == null) {
            pUU.valueOf("ModeSwitch", "onAppModeChange: Cannot convert appMode=" + i + " to ProSubMode");
            return Unit.INSTANCE;
        }
        pUU.KWHzl("ModeSwitch", "onAppModeChange: Setting app sub mode to " + abstractC33249msrEZpvd);
        java.lang.Object objAEQbTJ2 = this.KWHzl.AEQbTJ(abstractC33249msrEZpvd, strCopydefault, continuation);
        return objAEQbTJ2 == C56442yFn.copydefault() ? objAEQbTJ2 : Unit.INSTANCE;
    }

    public final boolean DbNXlk() {
        if (C33366mvB.KWHzl.EZpvd()) {
            return C33367mvC.djBIcL();
        }
        return true;
    }

    /* JADX INFO: renamed from: o.mwj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mwj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C33453mwj OLrzqt() {
            C33453mwj c33453mwj = C33453mwj.OLrzqt;
            if (c33453mwj == null) {
                synchronized (this) {
                    c33453mwj = C33453mwj.OLrzqt;
                    if (c33453mwj == null) {
                        c33453mwj = new C33453mwj(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                        ActionBar actionBar = C33453mwj.Companion;
                        C33453mwj.OLrzqt = c33453mwj;
                    }
                }
            }
            return c33453mwj;
        }
    }
}

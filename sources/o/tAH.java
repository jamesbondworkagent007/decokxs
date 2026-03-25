package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.biz_orbit_upgrade.OrbitUpgradeViewModel$requestRefreshAfterProfileSave$1;
import com.okinc.planet.biz_orbit_upgrade.OrbitUpgradeViewModel$upgradeOrbit$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tAH extends AbstractC33073mpa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final StateFlow<java.lang.Boolean> AEQbTJ;
    public final InterfaceC46387tSl EZpvd;
    public final MutableStateFlow<java.lang.Boolean> KWHzl;
    public Function1<? super java.lang.Boolean, Unit> copydefault;
    public final tAK djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public tAH() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super java.lang.Boolean, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> */
    public final Function1<java.lang.Boolean, Unit> OLrzqt() {
        Function1 function1 = this.copydefault;
        this.copydefault = null;
        return function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:o.tSl:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tSl:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:16) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.alsFma():o.tSm A[MD:():o.tSm (m), WRAPPED] (LINE:16)) : (r1v0 o.tSl))
  (wrap:o.tAK:?: TERNARY null = ((wrap:int:0x000a: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tAK:0x0010: INVOKE (wrap:o.tPF:0x000e: SGET  A[WRAPPED] (LINE:17) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.hvKCwS():o.tAK A[MD:():o.tAK (m), WRAPPED] (LINE:17)) : (r2v0 o.tAK))
 A[MD:(o.tSl, o.tAK):void (m)] (LINE:15) call: o.tAH.<init>(o.tSl, o.tAK):void type: THIS */
    public /* synthetic */ tAH(InterfaceC46387tSl interfaceC46387tSl, tAK tak, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.alsFma() : interfaceC46387tSl, (i & 2) != 0 ? tPF.copydefault.hvKCwS() : tak);
    }

    public tAH(@NotNull InterfaceC46387tSl interfaceC46387tSl, @NotNull tAK tak) {
        Intrinsics.checkNotNullParameter(interfaceC46387tSl, "");
        Intrinsics.checkNotNullParameter(tak, "");
        this.EZpvd = interfaceC46387tSl;
        this.djBIcL = tak;
        MutableStateFlow<java.lang.Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tAH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OrbitUpgradeViewModel$requestRefreshAfterProfileSave$1(this, null), 3, null);
    }

    public final void KWHzl() {
        this.KWHzl.setValue(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super kotlin.Pair<java.lang.Boolean, OKServerException>> continuation) throws java.lang.Throwable {
        OrbitUpgradeViewModel$upgradeOrbit$1 orbitUpgradeViewModel$upgradeOrbit$1;
        tAH tah;
        OKServerException oKServerException;
        if (continuation instanceof OrbitUpgradeViewModel$upgradeOrbit$1) {
            orbitUpgradeViewModel$upgradeOrbit$1 = (OrbitUpgradeViewModel$upgradeOrbit$1) continuation;
            int i = orbitUpgradeViewModel$upgradeOrbit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orbitUpgradeViewModel$upgradeOrbit$1.label = i - Integer.MIN_VALUE;
            } else {
                orbitUpgradeViewModel$upgradeOrbit$1 = new OrbitUpgradeViewModel$upgradeOrbit$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = orbitUpgradeViewModel$upgradeOrbit$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = orbitUpgradeViewModel$upgradeOrbit$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            tAK tak = this.djBIcL;
            orbitUpgradeViewModel$upgradeOrbit$1.L$0 = this;
            orbitUpgradeViewModel$upgradeOrbit$1.label = 1;
            objCopydefault = tak.copydefault(1, orbitUpgradeViewModel$upgradeOrbit$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            tah = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oKServerException = (OKServerException) orbitUpgradeViewModel$upgradeOrbit$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                if (((OrbitBeanResp) objCopydefault) == null) {
                    return C56390yDp.OLrzqt(C56443yFo.KWHzl(true), null);
                }
                return C56390yDp.OLrzqt(C56443yFo.KWHzl(false), oKServerException);
            }
            tah = (tAH) orbitUpgradeViewModel$upgradeOrbit$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        kotlin.Pair pair = (kotlin.Pair) objCopydefault;
        OrbitBeanResp orbitBeanResp = (OrbitBeanResp) pair.component1();
        OKServerException oKServerException2 = (OKServerException) pair.component2();
        if (orbitBeanResp != null) {
            InterfaceC46387tSl interfaceC46387tSl = tah.EZpvd;
            orbitUpgradeViewModel$upgradeOrbit$1.L$0 = oKServerException2;
            orbitUpgradeViewModel$upgradeOrbit$1.label = 2;
            java.lang.Object objEZpvd = interfaceC46387tSl.EZpvd(orbitUpgradeViewModel$upgradeOrbit$1);
            if (objEZpvd == objCopydefault2) {
                return objCopydefault2;
            }
            oKServerException = oKServerException2;
            objCopydefault = objEZpvd;
            if (((OrbitBeanResp) objCopydefault) == null) {
            }
        } else {
            return C56390yDp.OLrzqt(C56443yFo.KWHzl(false), oKServerException2);
        }
    }
}

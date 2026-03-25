package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.biz_orbit_upgrade.OrbitVipUpgradeViewModel$upgradeOrbit$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tAE extends AbstractC33073mpa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final tAK EZpvd;
    public final InterfaceC46387tSl copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public tAE() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:o.tSl:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tSl:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:11) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.alsFma():o.tSm A[MD:():o.tSm (m), WRAPPED] (LINE:11)) : (r1v0 o.tSl))
  (wrap:o.tAK:?: TERNARY null = ((wrap:int:0x000a: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tAK:0x0010: INVOKE (wrap:o.tPF:0x000e: SGET  A[WRAPPED] (LINE:12) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.hvKCwS():o.tAK A[MD:():o.tAK (m), WRAPPED] (LINE:12)) : (r2v0 o.tAK))
 A[MD:(o.tSl, o.tAK):void (m)] (LINE:10) call: o.tAE.<init>(o.tSl, o.tAK):void type: THIS */
    public /* synthetic */ tAE(InterfaceC46387tSl interfaceC46387tSl, tAK tak, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.alsFma() : interfaceC46387tSl, (i & 2) != 0 ? tPF.copydefault.hvKCwS() : tak);
    }

    public tAE(@NotNull InterfaceC46387tSl interfaceC46387tSl, @NotNull tAK tak) {
        Intrinsics.checkNotNullParameter(interfaceC46387tSl, "");
        Intrinsics.checkNotNullParameter(tak, "");
        this.copydefault = interfaceC46387tSl;
        this.EZpvd = tak;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tAE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super kotlin.Pair<java.lang.Boolean, OKServerException>> continuation) throws java.lang.Throwable {
        OrbitVipUpgradeViewModel$upgradeOrbit$1 orbitVipUpgradeViewModel$upgradeOrbit$1;
        tAE tae;
        OKServerException oKServerException;
        if (continuation instanceof OrbitVipUpgradeViewModel$upgradeOrbit$1) {
            orbitVipUpgradeViewModel$upgradeOrbit$1 = (OrbitVipUpgradeViewModel$upgradeOrbit$1) continuation;
            int i = orbitVipUpgradeViewModel$upgradeOrbit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                orbitVipUpgradeViewModel$upgradeOrbit$1.label = i - Integer.MIN_VALUE;
            } else {
                orbitVipUpgradeViewModel$upgradeOrbit$1 = new OrbitVipUpgradeViewModel$upgradeOrbit$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = orbitVipUpgradeViewModel$upgradeOrbit$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = orbitVipUpgradeViewModel$upgradeOrbit$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            tAK tak = this.EZpvd;
            orbitVipUpgradeViewModel$upgradeOrbit$1.L$0 = this;
            orbitVipUpgradeViewModel$upgradeOrbit$1.label = 1;
            objCopydefault = tak.copydefault(2, orbitVipUpgradeViewModel$upgradeOrbit$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            tae = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oKServerException = (OKServerException) orbitVipUpgradeViewModel$upgradeOrbit$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                if (((OrbitBeanResp) objCopydefault) == null) {
                    return C56390yDp.OLrzqt(C56443yFo.KWHzl(true), null);
                }
                return C56390yDp.OLrzqt(C56443yFo.KWHzl(false), oKServerException);
            }
            tae = (tAE) orbitVipUpgradeViewModel$upgradeOrbit$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        kotlin.Pair pair = (kotlin.Pair) objCopydefault;
        OrbitBeanResp orbitBeanResp = (OrbitBeanResp) pair.component1();
        OKServerException oKServerException2 = (OKServerException) pair.component2();
        if (orbitBeanResp != null) {
            InterfaceC46387tSl interfaceC46387tSl = tae.copydefault;
            orbitVipUpgradeViewModel$upgradeOrbit$1.L$0 = oKServerException2;
            orbitVipUpgradeViewModel$upgradeOrbit$1.label = 2;
            java.lang.Object objEZpvd = interfaceC46387tSl.EZpvd(orbitVipUpgradeViewModel$upgradeOrbit$1);
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

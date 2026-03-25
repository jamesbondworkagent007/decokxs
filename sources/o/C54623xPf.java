package o;

import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import kotlin.jvm.functions.Function0;
import o.xOV;

/* JADX INFO: renamed from: o.xPf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C54623xPf implements xOV {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.xPj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C54623xPf.fJNWhG();
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.xPk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C54623xPf.DbNXlk();
        }
    });

    public boolean AEQbTJ() {
        return xOV.StateListAnimator.djBIcL(this);
    }

    @Override // o.InterfaceC54621xPd
    public boolean AYXKKw() {
        return xOV.StateListAnimator.EZpvd(this);
    }

    @Override // o.xOZ
    public boolean EZpvd() {
        return xOV.StateListAnimator.AEQbTJ(this);
    }

    @Override // o.xOZ
    public boolean KWHzl() {
        return xOV.StateListAnimator.copydefault(this);
    }

    @Override // o.xOZ
    public boolean OLrzqt() {
        return xOV.StateListAnimator.KWHzl(this);
    }

    @Override // o.xOZ
    public boolean copydefault() {
        return xOV.StateListAnimator.OLrzqt(this);
    }

    public static final xLY fJNWhG() {
        return new xLY(BizInfoConfig.DefaultBizConfig.copydefault);
    }

    public static final xOQ DbNXlk() {
        return new xOQ();
    }
}

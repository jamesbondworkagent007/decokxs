package o;

import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.ranking.core.model.RankingNewSpotVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.qvt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41709qvt extends C40512qYp {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C41709qvt() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:37) call: o.qvt.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C41709qvt(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }

    public C41709qvt(Function0<Unit> function0) {
        register(RankingHotCryptoVo.class, new C41708qvs(function0));
        register(RankingNewSpotVo.class, new C41666qvC(function0));
    }
}

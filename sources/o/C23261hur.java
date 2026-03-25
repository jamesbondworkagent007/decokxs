package o;

import androidx.lifecycle.Observer;
import com.okinc.business.dexlogic.main.limmitorder.LimitWsHandle;
import com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitState;
import com.okinc.business.dexlogic.main.swap.trade.bean.LimitStateData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23261hur {
    public final LimitWsHandle AEQbTJ;
    public Observer<LimitState> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23261hur() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitWsHandle EZpvd() {
        return this.AEQbTJ;
    }

    public C23261hur(@NotNull LimitWsHandle limitWsHandle) {
        Intrinsics.checkNotNullParameter(limitWsHandle, "");
        this.AEQbTJ = limitWsHandle;
        this.KWHzl = new Observer() { // from class: o.huv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C23261hur.copydefault(this.KWHzl, (LimitState) obj);
            }
        };
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.main.limmitorder.LimitWsHandle:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.dexlogic.main.limmitorder.LimitWsHandle:0x0008: CONSTRUCTOR ("default_trade") A[MD:(java.lang.String):void (m), WRAPPED] (LINE:17) call: com.okinc.business.dexlogic.main.limmitorder.LimitWsHandle.<init>(java.lang.String):void type: CONSTRUCTOR) : (r1v0 com.okinc.business.dexlogic.main.limmitorder.LimitWsHandle))
 A[MD:(com.okinc.business.dexlogic.main.limmitorder.LimitWsHandle):void (m)] (LINE:16) call: o.hur.<init>(com.okinc.business.dexlogic.main.limmitorder.LimitWsHandle):void type: THIS */
    public /* synthetic */ C23261hur(LimitWsHandle limitWsHandle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LimitWsHandle("default_trade") : limitWsHandle);
    }

    public static final void copydefault(C23261hur c23261hur, LimitState limitState) {
        Intrinsics.checkNotNullParameter(limitState, "");
        if (limitState.isCheckSubmitToastState()) {
            java.lang.String status = limitState.getStatus();
            android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
            int i = C23274hvD.Fragment.toBundle;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            FromChildOrderDetailVO fromChildOrderDetailVO = limitState.getFromChildOrderDetailVO();
            java.lang.String fromTokenSymbol = fromChildOrderDetailVO != null ? fromChildOrderDetailVO.getFromTokenSymbol() : null;
            if (fromTokenSymbol == null) {
                fromTokenSymbol = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("fromToken", fromTokenSymbol);
            FromChildOrderDetailVO fromChildOrderDetailVO2 = limitState.getFromChildOrderDetailVO();
            java.lang.String toTokenSymbol = fromChildOrderDetailVO2 != null ? fromChildOrderDetailVO2.getToTokenSymbol() : null;
            if (toTokenSymbol == null) {
                toTokenSymbol = "";
            }
            pairArr[1] = C56390yDp.OLrzqt("toToken", toTokenSymbol);
            C25352ivB.copydefault(new LimitStateData(status, C33069mpW.KWHzl(applicationOLrzqt, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairArr)), "", limitState.getUserWalletAddress()));
            return;
        }
        kotlin.Pair<java.lang.String, java.lang.String> wsShowData = c23261hur.AEQbTJ.getWsShowData(limitState);
        java.lang.String first = wsShowData.getFirst();
        java.lang.String second = wsShowData.getSecond();
        if (!(first.length() == 0 && second.length() == 0) && C22522hgu.copydefault(limitState.getStatus())) {
            C25352ivB.copydefault(new LimitStateData(limitState.getStatus(), second, first, limitState.getUserWalletAddress()));
        }
    }

    public final void KWHzl() {
        this.AEQbTJ.subWs();
        if (this.AEQbTJ.getInnerLimitState().hasActiveObservers()) {
            return;
        }
        this.AEQbTJ.getInnerLimitState().observeForever(this.KWHzl);
    }

    public final void OLrzqt() {
        this.AEQbTJ.releaseChangeWallet();
        this.AEQbTJ.getInnerLimitState().removeObserver(this.KWHzl);
    }
}

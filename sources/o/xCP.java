package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.TradeStrategyPositionReqGroup;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xCP extends xKJ<C55804xqp<java.util.List<? extends BizTradeStrategyInfo>>> {
    public java.lang.String copydefault = "";
    public java.lang.String OLrzqt = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<BizTradeStrategyInfo>>>> EZpvd() {
        final TradeStrategyPositionReqGroup tradeStrategyPositionReqGroup = new TradeStrategyPositionReqGroup(true, this.copydefault, this.OLrzqt);
        AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<BizTradeStrategyInfo>>>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xCO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                xCP.KWHzl(this.EZpvd, tradeStrategyPositionReqGroup, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.xCV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                xCP.copydefault(this.AEQbTJ);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final class StateListAnimator extends AbstractC55714xpE {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<BizTradeStrategyInfo>>>> EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(TradeStrategyPositionReqGroup tradeStrategyPositionReqGroup, InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<BizTradeStrategyInfo>>>> interfaceC58184ywW, java.lang.String str) {
            super(tradeStrategyPositionReqGroup, str);
            this.EZpvd = interfaceC58184ywW;
        }

        @Override // o.AbstractC55714xpE
        public void KWHzl(java.lang.String str, java.util.List<? extends BizTradeStrategyInfo> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd.onNext(new ResponseData<>(0, null, null, null, new C55804xqp(str, list, null, null, 12, null), null, 46, null));
        }
    }

    public static final void KWHzl(xCP xcp, TradeStrategyPositionReqGroup tradeStrategyPositionReqGroup, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        xcp.EZpvd(yDY.copydefault(new StateListAnimator(tradeStrategyPositionReqGroup, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())))));
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = xcp.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault(arrayListEjfBZ);
    }

    public static final void copydefault(xCP xcp) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = xcp.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(arrayListEjfBZ);
    }
}

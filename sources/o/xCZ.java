package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsReq;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsReqGroup;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xCZ extends xKJ<C55804xqp<java.util.List<? extends StrategyOrderBillDetailsResponse>>> {
    public boolean AEQbTJ;
    public StrategyOrderBillDetailsReq KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xCZ KWHzl(boolean z) {
        this.AEQbTJ = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xCZ OLrzqt(@NotNull StrategyOrderBillDetailsReq strategyOrderBillDetailsReq) {
        Intrinsics.checkNotNullParameter(strategyOrderBillDetailsReq, "");
        this.KWHzl = strategyOrderBillDetailsReq;
        return this;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>>>> EZpvd() {
        boolean z = this.AEQbTJ;
        StrategyOrderBillDetailsReq strategyOrderBillDetailsReq = this.KWHzl;
        StrategyOrderBillDetailsReq strategyOrderBillDetailsReq2 = null;
        if (strategyOrderBillDetailsReq == null) {
            Intrinsics.gEmmrt("");
            strategyOrderBillDetailsReq = null;
        }
        StrategyOrderBillDetailsReq strategyOrderBillDetailsReq3 = this.KWHzl;
        if (strategyOrderBillDetailsReq3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            strategyOrderBillDetailsReq2 = strategyOrderBillDetailsReq3;
        }
        final StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroup = new StrategyOrderBillDetailsReqGroup(z, strategyOrderBillDetailsReq, strategyOrderBillDetailsReq2.getOrdType());
        AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>>>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xDa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                xCZ.EZpvd(this.KWHzl, strategyOrderBillDetailsReqGroup, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.xDb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                xCZ.EZpvd(this.OLrzqt);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final class ActionBar extends AbstractC55733xpX {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>>>> AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroup, InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>>>> interfaceC58184ywW, java.lang.String str) {
            super(strategyOrderBillDetailsReqGroup, str);
            this.AEQbTJ = interfaceC58184ywW;
        }

        @Override // o.AbstractC55733xpX
        public void AEQbTJ(java.lang.String str, java.util.List<StrategyOrderBillDetailsResponse> list, InterfaceC55705xow interfaceC55705xow, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(interfaceC55705xow, "");
            this.AEQbTJ.onNext(new ResponseData<>(0, null, null, null, new C55804xqp(str, list, interfaceC55705xow, bool), null, 46, null));
        }

        @Override // o.AbstractC55733xpX
        public void KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ.onNext(new ResponseData<>(-1, str, null, null, null, null, 60, null));
        }
    }

    public static final void EZpvd(xCZ xcz, StrategyOrderBillDetailsReqGroup strategyOrderBillDetailsReqGroup, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        xcz.EZpvd(yDY.copydefault(new ActionBar(strategyOrderBillDetailsReqGroup, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())))));
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = xcz.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault(arrayListEjfBZ);
    }

    public static final void EZpvd(xCZ xcz) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = xcz.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(arrayListEjfBZ);
    }
}

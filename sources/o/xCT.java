package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyGridDealOrderGroup;
import com.okinc.unify_trade.biz.StrategyGridTradeOrderDetailsResponse;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xCT extends xKJ<C55804xqp<java.util.List<? extends StrategyGridTradeOrderDetailsResponse>>> {
    public java.lang.String copydefault = "";
    public java.lang.String OLrzqt = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xCT AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xCT EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        return this;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<StrategyGridTradeOrderDetailsResponse>>>> EZpvd() {
        final StrategyGridDealOrderGroup strategyGridDealOrderGroup = new StrategyGridDealOrderGroup(false, this.copydefault, this.OLrzqt);
        AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<StrategyGridTradeOrderDetailsResponse>>>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xCX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                xCT.copydefault(this.AEQbTJ, strategyGridDealOrderGroup, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.xCY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                xCT.KWHzl(this.copydefault);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final class TaskDescription extends AbstractC55725xpP {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<StrategyGridTradeOrderDetailsResponse>>>> EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(StrategyGridDealOrderGroup strategyGridDealOrderGroup, InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<StrategyGridTradeOrderDetailsResponse>>>> interfaceC58184ywW, java.lang.String str) {
            super(strategyGridDealOrderGroup, str);
            this.EZpvd = interfaceC58184ywW;
        }

        @Override // o.AbstractC55725xpP
        public void AEQbTJ(java.lang.String str, java.util.List<StrategyGridTradeOrderDetailsResponse> list, InterfaceC55705xow interfaceC55705xow, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(interfaceC55705xow, "");
            this.EZpvd.onNext(new ResponseData<>(0, null, null, null, new C55804xqp(str, list, interfaceC55705xow, bool), null, 46, null));
        }

        @Override // o.AbstractC55725xpP
        public void EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd.onNext(new ResponseData<>(-1, str, null, null, null, null, 60, null));
        }
    }

    public static final void copydefault(xCT xct, StrategyGridDealOrderGroup strategyGridDealOrderGroup, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        xct.EZpvd(yDY.copydefault(new TaskDescription(strategyGridDealOrderGroup, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())))));
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = xct.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault(arrayListEjfBZ);
    }

    public static final void KWHzl(xCT xct) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = xct.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(arrayListEjfBZ);
    }
}

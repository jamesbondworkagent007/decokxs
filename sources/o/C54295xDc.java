package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.biz.TradeStrategyPositionReqGroup;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xDc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54295xDc extends xKJ<C55804xqp<java.util.List<? extends StrategyPositionResponse>>> {
    public java.lang.String AEQbTJ = "";
    public java.lang.String EZpvd = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54295xDc EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54295xDc KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        return this;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<StrategyPositionResponse>>>> EZpvd() {
        final TradeStrategyPositionReqGroup tradeStrategyPositionReqGroup = new TradeStrategyPositionReqGroup(true, this.AEQbTJ, this.EZpvd);
        AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<StrategyPositionResponse>>>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xDe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C54295xDc.KWHzl(this.EZpvd, tradeStrategyPositionReqGroup, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.xDg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C54295xDc.copydefault(this.OLrzqt);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX INFO: renamed from: o.xDc$ActionBar */
    public static final class ActionBar extends AbstractC55715xpF {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<StrategyPositionResponse>>>> copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(TradeStrategyPositionReqGroup tradeStrategyPositionReqGroup, InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<StrategyPositionResponse>>>> interfaceC58184ywW, java.lang.String str) {
            super(tradeStrategyPositionReqGroup, str);
            this.copydefault = interfaceC58184ywW;
        }

        @Override // o.AbstractC55715xpF
        public void AEQbTJ(java.lang.String str, java.util.ArrayList<StrategyPositionResponse> arrayList) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.copydefault.onNext(new ResponseData<>(0, null, null, null, new C55804xqp(str, arrayList, null, null, 12, null), null, 46, null));
        }

        @Override // o.AbstractC55715xpF
        public void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault.onNext(new ResponseData<>(-1, str, null, null, null, null, 60, null));
        }
    }

    public static final void KWHzl(C54295xDc c54295xDc, TradeStrategyPositionReqGroup tradeStrategyPositionReqGroup, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        c54295xDc.EZpvd(yDY.copydefault(new ActionBar(tradeStrategyPositionReqGroup, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())))));
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = c54295xDc.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault(arrayListEjfBZ);
    }

    public static final void copydefault(C54295xDc c54295xDc) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = c54295xDc.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(arrayListEjfBZ);
    }
}

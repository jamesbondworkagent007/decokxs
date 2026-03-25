package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.BotOrderListReqGroup;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import io.reactivex.BackpressureStrategy;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xCK extends xKJ<C55804xqp<java.util.List<? extends BizTradeStrategyInfo>>> {
    public boolean AEQbTJ = true;
    public Function0<? extends CopyOnWriteArrayList<BizTradeStrategyInfo>> OLrzqt;
    public BotOrderListReqGroup copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z, @NotNull Function0<? extends CopyOnWriteArrayList<BizTradeStrategyInfo>> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull BotOrderListReqGroup botOrderListReqGroup) {
        Intrinsics.checkNotNullParameter(botOrderListReqGroup, "");
        this.copydefault = botOrderListReqGroup;
    }

    public static final class ActionBar extends AbstractC55720xpK {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<BizTradeStrategyInfo>>>> djBIcL;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<BizTradeStrategyInfo>>>> interfaceC58184ywW, BotOrderListReqGroup botOrderListReqGroup, java.lang.String str, boolean z, Function0<? extends CopyOnWriteArrayList<BizTradeStrategyInfo>> function0) {
            super(botOrderListReqGroup, str, z, function0);
            this.djBIcL = interfaceC58184ywW;
        }

        @Override // o.AbstractC55720xpK
        public void OLrzqt(java.lang.String str, java.util.List<? extends BizTradeStrategyInfo> list, InterfaceC55705xow interfaceC55705xow, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(interfaceC55705xow, "");
            this.djBIcL.onNext(new ResponseData<>(0, null, null, null, new C55804xqp(str, list, interfaceC55705xow, bool), null, 46, null));
        }

        @Override // o.AbstractC55720xpK
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.djBIcL.onNext(new ResponseData<>(-1, str, null, null, null, null, 60, null));
        }
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<BizTradeStrategyInfo>>>> EZpvd() {
        AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<BizTradeStrategyInfo>>>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xCQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                xCK.EZpvd(this.EZpvd, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.xCS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                xCK.AEQbTJ(this.KWHzl);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final void EZpvd(xCK xck, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        java.lang.Object[] objArr = new java.lang.Object[1];
        BotOrderListReqGroup botOrderListReqGroup = xck.copydefault;
        if (botOrderListReqGroup == null) {
            Intrinsics.gEmmrt("");
            botOrderListReqGroup = null;
        }
        objArr[0] = new ActionBar(interfaceC58184ywW, botOrderListReqGroup, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), xck.AEQbTJ, xck.OLrzqt);
        xck.EZpvd(yDY.copydefault(objArr));
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = xck.ejfBZ();
        if (arrayListEjfBZ != null) {
            pUU.KWHzl("WbTaskUseCase", "bind for " + CollectionsKt___CollectionsKt.AuCTelauCTel(arrayListEjfBZ).getClass().getName() + " ， id is : " + CollectionsKt___CollectionsKt.AuCTelauCTel(arrayListEjfBZ).hashCode());
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                interfaceC54581xNrOLrzqt.copydefault(arrayListEjfBZ);
            }
        }
    }

    public static final void AEQbTJ(xCK xck) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = xck.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(arrayListEjfBZ);
    }
}

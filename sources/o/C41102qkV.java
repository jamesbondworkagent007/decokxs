package o;

import com.okinc.market.discover.features.markets.sub.rank.futures.domain.GetMarketDiscoverFuturesHotVosUseCase$onExecute$1;
import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.ranking.core.model.po.FuturesRankItemPo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41102qkV extends AbstractC49400uno<C41101qkU, C41467qrP> {
    public final CoroutineDispatcher KWHzl;
    public final C41103qkW OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C41102qkV(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41103qkW c41103qkW) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41103qkW, "");
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = c41103qkW;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41101qkU c41101qkU, @NotNull Continuation<? super C41467qrP> continuation) throws java.lang.Throwable {
        GetMarketDiscoverFuturesHotVosUseCase$onExecute$1 getMarketDiscoverFuturesHotVosUseCase$onExecute$1;
        C41467qrP c41467qrP;
        if (continuation instanceof GetMarketDiscoverFuturesHotVosUseCase$onExecute$1) {
            getMarketDiscoverFuturesHotVosUseCase$onExecute$1 = (GetMarketDiscoverFuturesHotVosUseCase$onExecute$1) continuation;
            int i = getMarketDiscoverFuturesHotVosUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMarketDiscoverFuturesHotVosUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMarketDiscoverFuturesHotVosUseCase$onExecute$1 = new GetMarketDiscoverFuturesHotVosUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = getMarketDiscoverFuturesHotVosUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMarketDiscoverFuturesHotVosUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C41467qrP c41467qrPKWHzl = c41101qkU.KWHzl();
            FuturesTypeEnum futuresTypeEnumCopydefault = c41101qkU.copydefault();
            FuturesUnitVo futuresUnitVoOLrzqt = c41101qkU.OLrzqt();
            PeriodEnum periodEnumEZpvd = c41101qkU.EZpvd();
            C41103qkW c41103qkW = this.OLrzqt;
            C41098qkR c41098qkR = new C41098qkR(futuresTypeEnumCopydefault, futuresUnitVoOLrzqt, periodEnumEZpvd);
            getMarketDiscoverFuturesHotVosUseCase$onExecute$1.L$0 = c41467qrPKWHzl;
            getMarketDiscoverFuturesHotVosUseCase$onExecute$1.label = 1;
            java.lang.Object objEZpvd = c41103qkW.EZpvd(c41098qkR, (Continuation) getMarketDiscoverFuturesHotVosUseCase$onExecute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c41467qrP = c41467qrPKWHzl;
            obj = objEZpvd;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C41467qrP c41467qrP2 = (C41467qrP) getMarketDiscoverFuturesHotVosUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            c41467qrP = c41467qrP2;
        }
        java.util.List list = (java.util.List) obj;
        if (list == null || list.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((FuturesRankItemPo) it.next()).getInstId());
        }
        java.util.Map mapOLrzqt = C56423yEv.OLrzqt();
        java.util.List<InterfaceC41638qub> listAhwBna = c41467qrP.AhwBna();
        if (listAhwBna != null) {
            for (InterfaceC41638qub interfaceC41638qub : listAhwBna) {
                mapOLrzqt.put(interfaceC41638qub.values().getInstId(), interfaceC41638qub);
            }
        }
        java.util.List<InterfaceC41638qub> listEZpvd = c41467qrP.EZpvd();
        if (listEZpvd != null) {
            for (InterfaceC41638qub interfaceC41638qub2 : listEZpvd) {
                mapOLrzqt.put(interfaceC41638qub2.values().getInstId(), interfaceC41638qub2);
            }
        }
        java.util.List<InterfaceC41638qub> listDjBIcL = c41467qrP.djBIcL();
        if (listDjBIcL != null) {
            for (InterfaceC41638qub interfaceC41638qub3 : listDjBIcL) {
                mapOLrzqt.put(interfaceC41638qub3.values().getInstId(), interfaceC41638qub3);
            }
        }
        java.util.Map mapAYXKKw = C56423yEv.AYXKKw(mapOLrzqt);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            InterfaceC41638qub interfaceC41638qub4 = (InterfaceC41638qub) mapAYXKKw.get((java.lang.String) it2.next());
            if (interfaceC41638qub4 != null) {
                arrayList2.add(interfaceC41638qub4);
            }
        }
        return C41467qrP.copy$default(c41467qrP, arrayList2, yDY.AhwBna(), yDY.AhwBna(), null, null, 0L, 56, null);
    }
}

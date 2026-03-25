package o;

import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventReq;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventResp;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import com.okinc.kline.features.kline.bottom.marketevents.domain.usecase.MarketEventsUseCase$onExecute$1;
import com.okinc.localization.util.format.OKDateEnum;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oQn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36134oQn extends AbstractC49400uno<MarketEventReq, Triple<? extends java.lang.String, ? extends java.lang.Integer, ? extends java.util.List<? extends MarketEventsVo>>> {
    public final CoroutineDispatcher AEQbTJ;
    public final C36130oQj OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public C36134oQn(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C36130oQj c36130oQj) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c36130oQj, "");
        this.AEQbTJ = coroutineDispatcher;
        this.OLrzqt = c36130oQj;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull MarketEventReq marketEventReq, @NotNull Continuation<? super Triple<java.lang.String, java.lang.Integer, ? extends java.util.List<? extends MarketEventsVo>>> continuation) throws java.lang.Throwable {
        MarketEventsUseCase$onExecute$1 marketEventsUseCase$onExecute$1;
        java.util.List<MarketEventResp.BigEventPo> listAhwBna;
        java.lang.Object objAEQbTJ;
        C36134oQn c36134oQn;
        java.util.List<MarketEventResp.BigEventPo> listAhwBna2;
        java.util.List<MarketEventResp.BigEventPo> listAhwBna3;
        if (continuation instanceof MarketEventsUseCase$onExecute$1) {
            marketEventsUseCase$onExecute$1 = (MarketEventsUseCase$onExecute$1) continuation;
            int i = marketEventsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketEventsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                marketEventsUseCase$onExecute$1 = new MarketEventsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = marketEventsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketEventsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<MarketEventsVo> currentList = marketEventReq.getCurrentList();
            if (currentList == null || (listAhwBna = AEQbTJ(currentList)) == null) {
                listAhwBna = yDY.AhwBna();
            }
            C36130oQj c36130oQj = this.OLrzqt;
            marketEventsUseCase$onExecute$1.L$0 = this;
            marketEventsUseCase$onExecute$1.L$1 = marketEventReq;
            marketEventsUseCase$onExecute$1.L$2 = listAhwBna;
            marketEventsUseCase$onExecute$1.label = 1;
            objAEQbTJ = c36130oQj.AEQbTJ(marketEventReq, marketEventsUseCase$onExecute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c36134oQn = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.List<MarketEventResp.BigEventPo> list = (java.util.List) marketEventsUseCase$onExecute$1.L$2;
            MarketEventReq marketEventReq2 = (MarketEventReq) marketEventsUseCase$onExecute$1.L$1;
            C36134oQn c36134oQn2 = (C36134oQn) marketEventsUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            listAhwBna = list;
            marketEventReq = marketEventReq2;
            c36134oQn = c36134oQn2;
            objAEQbTJ = obj;
        }
        MarketEventResp marketEventResp = (MarketEventResp) objAEQbTJ;
        if (marketEventReq.isWsForceRequest()) {
            if (marketEventResp == null || (listAhwBna3 = c36134oQn.copydefault(marketEventResp, listAhwBna)) == null) {
                listAhwBna3 = yDY.AhwBna();
            }
            return new Triple("", C56443yFo.AEQbTJ(listAhwBna3.size()), c36134oQn.KWHzl(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAhwBna3, (java.lang.Iterable) listAhwBna)));
        }
        if (marketEventResp == null || (listAhwBna2 = marketEventResp.getBigEventDataList()) == null) {
            listAhwBna2 = yDY.AhwBna();
        }
        return new Triple(marketEventResp != null ? marketEventResp.getNextCursor() : null, C56443yFo.AEQbTJ(0), c36134oQn.KWHzl(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAhwBna, (java.lang.Iterable) listAhwBna2)));
    }

    public final java.util.List<MarketEventResp.BigEventPo> copydefault(MarketEventResp marketEventResp, java.util.List<MarketEventResp.BigEventPo> list) {
        java.util.ArrayList arrayList = null;
        if (list.isEmpty()) {
            return null;
        }
        long timeStamp = ((MarketEventResp.BigEventPo) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getTimeStamp();
        java.util.List<MarketEventResp.BigEventPo> bigEventDataList = marketEventResp.getBigEventDataList();
        if (bigEventDataList != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : bigEventDataList) {
                if (((MarketEventResp.BigEventPo) obj).getTimeStamp() > timeStamp) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final java.util.List<MarketEventsVo> KWHzl(java.util.List<MarketEventResp.BigEventPo> list) {
        MarketEventResp.BigEventPo bigEventPoDjBIcL;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (MarketEventResp.BigEventPo bigEventPo : list) {
            arrayList2.add(new MarketEventsVo.Content(bigEventPo, bigEventPo.getEventDetail(), bigEventPo.getTypeTitle(), false, bigEventPo.getNewTitle(), bigEventPo.getNewContent(), bigEventPo.getExplanation(), bigEventPo.getAddress(), bigEventPo.getAuthorList(), 8, null));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : arrayList2) {
            java.lang.String date$default = pTA.formatDate$default(new Date(((MarketEventsVo.Content) obj).djBIcL().getTimeStamp()), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null);
            java.lang.Object arrayList3 = linkedHashMap.get(date$default);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                linkedHashMap.put(date$default, arrayList3);
            }
            ((java.util.List) arrayList3).add(obj);
        }
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.List list2 = (java.util.List) ((Map.Entry) it.next()).getValue();
            MarketEventsVo.Content content = (MarketEventsVo.Content) CollectionsKt___CollectionsKt.firstOrNull(list2);
            arrayList.add(new MarketEventsVo.TaskDescription((content == null || (bigEventPoDjBIcL = content.djBIcL()) == null) ? 0L : bigEventPoDjBIcL.getTimeStamp()));
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    public final java.util.List<MarketEventResp.BigEventPo> AEQbTJ(java.util.List<? extends MarketEventsVo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (MarketEventsVo marketEventsVo : list) {
            MarketEventResp.BigEventPo bigEventPoDjBIcL = marketEventsVo instanceof MarketEventsVo.Content ? ((MarketEventsVo.Content) marketEventsVo).djBIcL() : null;
            if (bigEventPoDjBIcL != null) {
                arrayList.add(bigEventPoDjBIcL);
            }
        }
        return arrayList;
    }
}

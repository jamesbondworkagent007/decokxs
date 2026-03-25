package com.okinc.business.market.home.favorites;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.home.favorites.viewmodel.MarketFavChildViewModel;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27807kEa;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC27808kEb;
import o.qTA;
import o.qWJ;
import o.qWK;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavQuoteFragment$onUserActionEnd$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<?> $data;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MarketFavQuoteFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavQuoteFragment$onUserActionEnd$1(List<?> list, MarketFavQuoteFragment marketFavQuoteFragment, Continuation<? super MarketFavQuoteFragment$onUserActionEnd$1> continuation) {
        super(2, continuation);
        this.$data = list;
        this.this$0 = marketFavQuoteFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketFavQuoteFragment$onUserActionEnd$1(this.$data, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketFavQuoteFragment$onUserActionEnd$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116 A[Catch: all -> 0x0150, Exception -> 0x0157, TryCatch #2 {Exception -> 0x0157, all -> 0x0150, blocks: (B:6:0x0010, B:57:0x00f4, B:59:0x0116, B:61:0x0122, B:63:0x0132, B:65:0x013a, B:66:0x0148, B:11:0x0025, B:54:0x00e5, B:14:0x002d, B:16:0x0031, B:17:0x003a, B:19:0x0040, B:21:0x0048, B:23:0x004c, B:26:0x0053, B:27:0x0057, B:29:0x005f, B:34:0x007b, B:37:0x0089, B:38:0x008d, B:39:0x00a2, B:41:0x00a8, B:43:0x00b0, B:49:0x00c5, B:44:0x00b7, B:46:0x00bb, B:50:0x00c9), top: B:74:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listAhwBna;
        List<WatchListData> arrayList;
        MarketFavChildViewModel marketFavChildViewModel;
        WatchListData watchListDataFJNWhG;
        InterfaceC27808kEb interfaceC27808kEbEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.this$0.KWHzl(false);
            throw th;
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<?> list = this.$data;
            if (list != null) {
                listAhwBna = new ArrayList();
                for (Object obj2 : list) {
                    if ((obj2 instanceof CoinQuote) || (obj2 instanceof qWK)) {
                        listAhwBna.add(obj2);
                    }
                }
            } else {
                listAhwBna = null;
            }
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            List list2 = this.this$0.values;
            if (list2 != null) {
                if (!C33129mqd.AEQbTJ(C56443yFo.AEQbTJ(list2.size()), C56443yFo.AEQbTJ(this.this$0.gEmmrt()))) {
                    list2 = null;
                }
                List listDjBIcL = list2 != null ? CollectionsKt___CollectionsKt.djBIcL((Iterable) list2, this.this$0.gEmmrt()) : null;
                if (listDjBIcL == null) {
                    listDjBIcL = yDY.AhwBna();
                }
                List listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((Collection) listAhwBna, (Iterable) listDjBIcL);
                this.this$0.getTAG();
                listDjBIcL2.size();
                arrayList = new ArrayList<>();
                for (Object obj3 : listDjBIcL2) {
                    if (obj3 instanceof CoinQuote) {
                        watchListDataFJNWhG = qWJ.AEQbTJ((CoinQuote) obj3);
                    } else {
                        watchListDataFJNWhG = obj3 instanceof qWK ? ((qWK) obj3).fJNWhG() : null;
                    }
                    if (watchListDataFJNWhG != null) {
                        arrayList.add(watchListDataFJNWhG);
                    }
                }
                MarketFavChildViewModel marketFavChildViewModelFIwbmz = this.this$0.fIwbmz();
                MarketHomeV2ViewModel marketHomeV2ViewModelEjfBZ = this.this$0.ejfBZ();
                this.L$0 = marketFavChildViewModelFIwbmz;
                this.L$1 = arrayList;
                this.label = 1;
                Object objAEQbTJ = marketHomeV2ViewModelEjfBZ.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                marketFavChildViewModel = marketFavChildViewModelFIwbmz;
                obj = objAEQbTJ;
            }
            this.this$0.KWHzl(false);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            Triple tripleFARcdN = this.this$0.fARcdN();
            String str = (String) tripleFARcdN.component1();
            String str2 = (String) tripleFARcdN.component2();
            String str3 = (String) tripleFARcdN.component3();
            interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this.this$0);
            if (interfaceC27808kEbEZpvd != null) {
                String strAEQbTJ = qTA.AEQbTJ(str2);
                List list3 = this.this$0.values;
                String strGEmmrt = C33129mqd.gEmmrt(list3 != null ? C56443yFo.AEQbTJ(CollectionsKt___CollectionsKt.copydefault((List<? extends Object>) list3, this.this$0.uzCIH)) : null);
                List<?> list4 = this.$data;
                interfaceC27808kEbEZpvd.EZpvd(str, strAEQbTJ, strGEmmrt, C33129mqd.gEmmrt(list4 != null ? C56443yFo.AEQbTJ(list4.indexOf(this.this$0.uzCIH)) : null), str3);
            }
            this.this$0.KWHzl(false);
            return Unit.INSTANCE;
        }
        arrayList = (List) this.L$1;
        marketFavChildViewModel = (MarketFavChildViewModel) this.L$0;
        C56391yDq.AEQbTJ(obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (marketFavChildViewModel.KWHzl(arrayList, (String) obj, this) == objCopydefault) {
            return objCopydefault;
        }
        Triple tripleFARcdN2 = this.this$0.fARcdN();
        String str4 = (String) tripleFARcdN2.component1();
        String str22 = (String) tripleFARcdN2.component2();
        String str32 = (String) tripleFARcdN2.component3();
        interfaceC27808kEbEZpvd = C27807kEa.EZpvd(this.this$0);
        if (interfaceC27808kEbEZpvd != null) {
        }
        this.this$0.KWHzl(false);
        return Unit.INSTANCE;
    }
}

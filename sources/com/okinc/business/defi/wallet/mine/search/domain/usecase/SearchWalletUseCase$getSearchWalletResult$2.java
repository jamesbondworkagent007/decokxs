package com.okinc.business.defi.wallet.mine.search.domain.usecase;

import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchResultBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C10329bmR;
import o.C10404bnn;
import o.C10407bnq;
import o.C10525bqB;
import o.C10527bqD;
import o.C10528bqE;
import o.C10594brR;
import o.C15934eaS;
import o.C18916frT;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.C59449zhJ;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchWalletUseCase$getSearchWalletResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WalletSearchResultBean>, Object> {
    final /* synthetic */ String $searchKeyword;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C18916frT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchWalletUseCase$getSearchWalletResult$2(C18916frT c18916frT, String str, Continuation<? super SearchWalletUseCase$getSearchWalletResult$2> continuation) {
        super(2, continuation);
        this.this$0 = c18916frT;
        this.$searchKeyword = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchWalletUseCase$getSearchWalletResult$2(this.this$0, this.$searchKeyword, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WalletSearchResultBean> continuation) {
        return ((SearchWalletUseCase$getSearchWalletResult$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [28=4] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0253 A[LOOP:0: B:96:0x024d->B:98:0x0253, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAwait;
        AbstractC12782ctV abstractC12782ctV;
        Object objAwait2;
        List<C10525bqB> coinAssets;
        List<C10525bqB> listInvokeSuspend$matchCoinAssets;
        WalletSearchResultBean walletSearchResultBean;
        List arrayList;
        WalletSearchResultBean walletSearchResultBean2;
        List arrayList2;
        WalletSearchResultBean walletSearchResultBean3;
        List list;
        Object objAwaitLast;
        HashMap map;
        List list2;
        List<C10527bqD> defiAssets;
        List<C10528bqE> nftAssets;
        List<C10594brR> customCoinAsset;
        List listAhwBna;
        Long l;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.OLrzqt == null) {
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.this$0.AEQbTJ.copydefault(false);
                this.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            }
            WalletSearchResultBean walletSearchResultBean4 = this.this$0.OLrzqt;
            if (walletSearchResultBean4 != null) {
            }
            if (coinAssets == null) {
            }
            listInvokeSuspend$matchCoinAssets = invokeSuspend$matchCoinAssets(coinAssets, this.$searchKeyword);
            walletSearchResultBean = this.this$0.OLrzqt;
            if (walletSearchResultBean == null) {
                arrayList = null;
                walletSearchResultBean2 = this.this$0.OLrzqt;
                if (walletSearchResultBean2 != null) {
                    arrayList2 = null;
                    walletSearchResultBean3 = this.this$0.OLrzqt;
                    if (walletSearchResultBean3 != null) {
                        list = null;
                        if (C33129mqd.KWHzl((Collection) listInvokeSuspend$matchCoinAssets)) {
                        }
                    }
                }
            }
            return new WalletSearchResultBean(listInvokeSuspend$matchCoinAssets, arrayList, list, arrayList2);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (HashMap) this.L$4;
                list = (List) this.L$3;
                List list3 = (List) this.L$2;
                list2 = (List) this.L$1;
                listInvokeSuspend$matchCoinAssets = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                arrayList2 = list3;
                objAwaitLast = obj;
                WalletTickerManager.CoinPriceBean coinPriceBean = (WalletTickerManager.CoinPriceBean) objAwaitLast;
                HashMap map2 = new HashMap();
                for (WalletTickerManager.CoinPrice coinPrice : coinPriceBean.getCoinPriceList()) {
                    map2.put(C56443yFo.KWHzl(coinPrice.getCoinId()), coinPrice);
                }
                for (Map.Entry entry : map.entrySet()) {
                    WalletTickerManager.CoinPrice coinPrice2 = (WalletTickerManager.CoinPrice) map2.get(entry.getKey());
                    if (coinPrice2 != null) {
                        if (((C10525bqB) entry.getValue()).ORxRYg()) {
                            Map<Long, Long> bestPriceRelations = coinPriceBean.getBestPriceRelations();
                            WalletTickerManager.CoinPrice coinPrice3 = (WalletTickerManager.CoinPrice) map2.get(C56443yFo.KWHzl((bestPriceRelations == null || (l = bestPriceRelations.get(entry.getKey())) == null) ? 0L : l.longValue()));
                            if (coinPrice3 != null) {
                                coinPrice2 = coinPrice3;
                            }
                            ((C10525bqB) entry.getValue()).OLrzqt(coinPrice2.getPrice());
                            ((C10525bqB) entry.getValue()).AhwBna(coinPrice2.getPriceChangePercent24h());
                        } else {
                            ((C10525bqB) entry.getValue()).OLrzqt(coinPrice2.getPrice());
                            ((C10525bqB) entry.getValue()).AhwBna(coinPrice2.getPriceChangePercent24h());
                        }
                    }
                }
                arrayList = list2;
                return new WalletSearchResultBean(listInvokeSuspend$matchCoinAssets, arrayList, list, arrayList2);
            }
            abstractC12782ctV = (AbstractC12782ctV) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAwait2 = obj;
            C10404bnn c10404bnn = (C10404bnn) objAwait2;
            Intrinsics.copydefault(abstractC12782ctV);
            if (C15934eaS.OLrzqt(abstractC12782ctV)) {
                List<C10528bqE> listEZpvd = c10404bnn.EZpvd();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : listEZpvd) {
                    if (!((C10528bqE) obj2).AhwBna()) {
                        arrayList3.add(obj2);
                    }
                }
                listAhwBna = arrayList3;
            } else {
                listAhwBna = yDY.AhwBna();
            }
            this.this$0.OLrzqt = new WalletSearchResultBean(c10404bnn.copydefault(), abstractC12782ctV.QkdxfA(), this.this$0.copydefault.isConnected() ? c10404bnn.AEQbTJ() : yDY.AhwBna(), listAhwBna);
            WalletSearchResultBean walletSearchResultBean42 = this.this$0.OLrzqt;
            coinAssets = walletSearchResultBean42 != null ? walletSearchResultBean42.getCoinAssets() : null;
            if (coinAssets == null) {
                coinAssets = yDY.AhwBna();
            }
            listInvokeSuspend$matchCoinAssets = invokeSuspend$matchCoinAssets(coinAssets, this.$searchKeyword);
            walletSearchResultBean = this.this$0.OLrzqt;
            if (walletSearchResultBean == null || (customCoinAsset = walletSearchResultBean.getCustomCoinAsset()) == null) {
                arrayList = null;
            } else {
                String str = this.$searchKeyword;
                arrayList = new ArrayList();
                for (Object obj3 : customCoinAsset) {
                    if (StringsKt__StringsKt.AhwBna((CharSequence) ((C10594brR) obj3).KWHzl().fJNWhG(), (CharSequence) str, true)) {
                        arrayList.add(obj3);
                    }
                }
            }
            walletSearchResultBean2 = this.this$0.OLrzqt;
            if (walletSearchResultBean2 != null || (nftAssets = walletSearchResultBean2.getNftAssets()) == null) {
                arrayList2 = null;
            } else {
                String str2 = this.$searchKeyword;
                arrayList2 = new ArrayList();
                for (Object obj4 : nftAssets) {
                    C10528bqE c10528bqE = (C10528bqE) obj4;
                    if (StringsKt__StringsKt.AhwBna((CharSequence) c10528bqE.AEQbTJ(), (CharSequence) str2, true) || StringsKt__StringsKt.AhwBna((CharSequence) c10528bqE.copydefault(), (CharSequence) str2, true)) {
                        arrayList2.add(obj4);
                    }
                }
            }
            walletSearchResultBean3 = this.this$0.OLrzqt;
            if (walletSearchResultBean3 != null || (defiAssets = walletSearchResultBean3.getDefiAssets()) == null) {
                list = null;
            } else {
                String str3 = this.$searchKeyword;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : defiAssets) {
                    C10527bqD c10527bqD = (C10527bqD) obj5;
                    if (StringsKt__StringsKt.AhwBna((CharSequence) c10527bqD.AYXKKw(), (CharSequence) str3, true) || StringsKt__StringsKt.AhwBna((CharSequence) c10527bqD.AEQbTJ(), (CharSequence) str3, true)) {
                        arrayList4.add(obj5);
                    }
                }
                list = arrayList4;
            }
            if (C33129mqd.KWHzl((Collection) listInvokeSuspend$matchCoinAssets)) {
                ArrayList<C10525bqB> arrayList5 = new ArrayList();
                HashMap map3 = new HashMap();
                if (listInvokeSuspend$matchCoinAssets != null) {
                    for (C10525bqB c10525bqB : listInvokeSuspend$matchCoinAssets) {
                        arrayList5.add(c10525bqB);
                        map3.put(C56443yFo.KWHzl(c10525bqB.OLrzqt()), c10525bqB);
                    }
                }
                WalletTickerManager walletTickerManager = this.this$0.EZpvd;
                ArrayList arrayList6 = new ArrayList(C56403yEb.AYXKKw(arrayList5, 10));
                for (C10525bqB c10525bqB2 : arrayList5) {
                    arrayList6.add(new WalletTickerManager.CoinInfo(c10525bqB2.gEmmrt(), c10525bqB2.OLrzqt(), c10525bqB2.KWHzl().OLrzqt(), c10525bqB2.ORxRYg()));
                }
                AbstractC58185ywX<WalletTickerManager.CoinPriceBean> abstractC58185ywXCopydefault = walletTickerManager.copydefault(arrayList6);
                this.L$0 = listInvokeSuspend$matchCoinAssets;
                this.L$1 = arrayList;
                this.L$2 = arrayList2;
                this.L$3 = list;
                this.L$4 = map3;
                this.label = 3;
                objAwaitLast = AwaitKt.awaitLast(abstractC58185ywXCopydefault, this);
                if (objAwaitLast == objCopydefault) {
                    return objCopydefault;
                }
                map = map3;
                list2 = arrayList;
                WalletTickerManager.CoinPriceBean coinPriceBean2 = (WalletTickerManager.CoinPriceBean) objAwaitLast;
                HashMap map22 = new HashMap();
                while (r7.hasNext()) {
                }
                while (r1.hasNext()) {
                }
                arrayList = list2;
            }
            return new WalletSearchResultBean(listInvokeSuspend$matchCoinAssets, arrayList, list, arrayList2);
        }
        C56391yDq.AEQbTJ(obj);
        objAwait = obj;
        abstractC12782ctV = (AbstractC12782ctV) objAwait;
        C10407bnq c10407bnq = this.this$0.KWHzl;
        Intrinsics.copydefault(abstractC12782ctV);
        AbstractC58260yxt<C10404bnn> abstractC58260yxtOLrzqt = c10407bnq.OLrzqt(abstractC12782ctV, C10329bmR.EZpvd(), true, false);
        this.L$0 = abstractC12782ctV;
        this.label = 2;
        objAwait2 = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        C10404bnn c10404bnn2 = (C10404bnn) objAwait2;
        Intrinsics.copydefault(abstractC12782ctV);
        if (C15934eaS.OLrzqt(abstractC12782ctV)) {
        }
        this.this$0.OLrzqt = new WalletSearchResultBean(c10404bnn2.copydefault(), abstractC12782ctV.QkdxfA(), this.this$0.copydefault.isConnected() ? c10404bnn2.AEQbTJ() : yDY.AhwBna(), listAhwBna);
        WalletSearchResultBean walletSearchResultBean422 = this.this$0.OLrzqt;
        if (walletSearchResultBean422 != null) {
        }
        if (coinAssets == null) {
        }
        listInvokeSuspend$matchCoinAssets = invokeSuspend$matchCoinAssets(coinAssets, this.$searchKeyword);
        walletSearchResultBean = this.this$0.OLrzqt;
        if (walletSearchResultBean == null) {
        }
        return new WalletSearchResultBean(listInvokeSuspend$matchCoinAssets, arrayList, list, arrayList2);
    }

    private static final List<C10525bqB> invokeSuspend$matchCoinAssets(List<C10525bqB> list, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C10525bqB c10525bqB : list) {
            String strFJNWhG = c10525bqB.KWHzl().fJNWhG();
            if (C59449zhJ.gEmmrt(strFJNWhG, str, true)) {
                arrayList.add(c10525bqB);
            } else if (C59449zhJ.AYXKKw(strFJNWhG, str, true)) {
                arrayList2.add(c10525bqB);
            } else if (StringsKt__StringsKt.AhwBna((CharSequence) strFJNWhG, (CharSequence) str, true)) {
                arrayList3.add(c10525bqB);
            }
        }
        return CollectionsKt___CollectionsKt.djBIcL((Collection) CollectionsKt___CollectionsKt.djBIcL((Collection) arrayList, (Iterable) arrayList2), (Iterable) arrayList3);
    }
}

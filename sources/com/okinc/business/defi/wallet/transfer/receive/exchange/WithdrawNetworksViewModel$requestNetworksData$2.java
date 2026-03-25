package com.okinc.business.defi.wallet.transfer.receive.exchange;

import com.okinc.business.defi.biz.net.bean.CoinInfoResponse;
import com.okinc.business.defi.wallet.transfer.receive.exchange.WithdrawNetworksViewModel$requestNetworksData$2;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.AssetWalletNetwork;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeSelectNetworkBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.Bitmap;
import o.C14316djE;
import o.C21085gtB;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;
import o.C59467zhb;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class WithdrawNetworksViewModel$requestNetworksData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ArrayList<AssetWalletNetwork> $networks;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C21085gtB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawNetworksViewModel$requestNetworksData$2(ArrayList<AssetWalletNetwork> arrayList, C21085gtB c21085gtB, Continuation<? super WithdrawNetworksViewModel$requestNetworksData$2> continuation) {
        super(2, continuation);
        this.$networks = arrayList;
        this.this$0 = c21085gtB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WithdrawNetworksViewModel$requestNetworksData$2 withdrawNetworksViewModel$requestNetworksData$2 = new WithdrawNetworksViewModel$requestNetworksData$2(this.$networks, this.this$0, continuation);
        withdrawNetworksViewModel$requestNetworksData$2.L$0 = obj;
        return withdrawNetworksViewModel$requestNetworksData$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WithdrawNetworksViewModel$requestNetworksData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object value;
        ArrayList<AssetWalletNetwork> arrayList;
        Object objAwaitAll;
        C21085gtB c21085gtB;
        Object value2;
        Object value3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c21085gtB = (C21085gtB) this.L$1;
                ArrayList<AssetWalletNetwork> arrayList2 = (ArrayList) this.L$0;
                C56391yDq.AEQbTJ(obj);
                arrayList = arrayList2;
                objAwaitAll = obj;
            } else {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                arrayList = this.$networks;
                C21085gtB c21085gtB2 = this.this$0;
                Result.Application application = Result.Companion;
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    Integer subCurrencyId = ((AssetWalletNetwork) it.next()).getSubCurrencyId();
                    if (subCurrencyId != null) {
                        arrayList3.add(subCurrencyId);
                    }
                }
                List listValueOf = CollectionsKt___CollectionsKt.valueOf((Iterable) arrayList3, 100);
                ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
                Iterator it2 = listValueOf.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new WithdrawNetworksViewModel$requestNetworksData$2$1$deferredResults$1$1(c21085gtB2, (List) it2.next(), null), 3, null));
                }
                this.L$0 = arrayList;
                this.L$1 = c21085gtB2;
                this.label = 1;
                objAwaitAll = AwaitKt.awaitAll(arrayList4, this);
                if (objAwaitAll == objCopydefault) {
                    return objCopydefault;
                }
                c21085gtB = c21085gtB2;
            }
            List listQOLQEE = C56403yEb.QOLQEE((Iterable) objAwaitAll);
            final LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
            for (Object obj2 : arrayList) {
                linkedHashMap.put(((AssetWalletNetwork) obj2).getSubCurrencyId(), obj2);
            }
            c21085gtB.copydefault.addAll(C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(CollectionsKt___CollectionsKt.QVAiDq(listQOLQEE), new Function1() { // from class: o.gtG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return WithdrawNetworksViewModel$requestNetworksData$2.invokeSuspend$lambda$6$lambda$3(linkedHashMap, (CoinInfoResponse) obj3);
                }
            })));
            boolean zIsEmpty = c21085gtB.copydefault.isEmpty();
            if (zIsEmpty) {
                MutableStateFlow mutableStateFlow = c21085gtB.KWHzl;
                do {
                    value3 = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value3, new Bitmap.StateListAnimator(yDY.copydefault(new C14316djE(null, 0, 2, null)))));
            } else if (!zIsEmpty) {
                MutableStateFlow mutableStateFlow2 = c21085gtB.KWHzl;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, new Bitmap.StateListAnimator(c21085gtB.copydefault)));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C21085gtB c21085gtB3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WithdrawNetworksViewModel", "requestNetworksData error: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
            MutableStateFlow mutableStateFlow3 = c21085gtB3.KWHzl;
            do {
                value = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value, new Bitmap.ActionBar(thM7380exceptionOrNullimpl.getLocalizedMessage(), null, 2, null)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExchangeSelectNetworkBean invokeSuspend$lambda$6$lambda$3(Map map, CoinInfoResponse coinInfoResponse) {
        AssetWalletNetwork assetWalletNetwork = (AssetWalletNetwork) map.get(coinInfoResponse.getCurrencyId());
        return new ExchangeSelectNetworkBean(coinInfoResponse.getChainImageUrl(), coinInfoResponse.getChainName(), assetWalletNetwork != null ? assetWalletNetwork.getGasFee() : null, assetWalletNetwork != null ? assetWalletNetwork.getGasFeeSymbol() : null, assetWalletNetwork != null ? assetWalletNetwork.getUsdGasFee() : null, assetWalletNetwork != null ? assetWalletNetwork.getEstimatedArrivalTime() : null, assetWalletNetwork != null ? assetWalletNetwork.getSubCurrencyId() : null, assetWalletNetwork != null ? assetWalletNetwork.getUsdGasFeeSymbol() : null, coinInfoResponse.getCoinId(), coinInfoResponse.getChainId(), assetWalletNetwork != null ? assetWalletNetwork.getNetworkName() : null, assetWalletNetwork != null ? assetWalletNetwork.getAssetAccountWalletCurrencies() : null, coinInfoResponse.getSymbol(), coinInfoResponse.getAddress());
    }
}

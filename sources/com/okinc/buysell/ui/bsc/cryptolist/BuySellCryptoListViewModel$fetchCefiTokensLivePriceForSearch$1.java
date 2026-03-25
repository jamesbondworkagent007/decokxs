package com.okinc.buysell.ui.bsc.cryptolist;

import androidx.camera.video.AudioStats;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
import com.okinc.okex.lite_market_api.bean.FairPriceTickerData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C31661lzi;
import o.C31785mDv;
import o.C33129mqd;
import o.C38307pTy;
import o.C54573xNj;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellCryptoListViewModel$fetchCefiTokensLivePriceForSearch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StateFlow<Map<String, FairPriceTickerData>> $flow;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BuySellCryptoListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.flow.StateFlow<? extends java.util.Map<java.lang.String, com.okinc.okex.lite_market_api.bean.FairPriceTickerData>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BuySellCryptoListViewModel$fetchCefiTokensLivePriceForSearch$1(StateFlow<? extends Map<String, FairPriceTickerData>> stateFlow, BuySellCryptoListViewModel buySellCryptoListViewModel, Continuation<? super BuySellCryptoListViewModel$fetchCefiTokensLivePriceForSearch$1> continuation) {
        super(2, continuation);
        this.$flow = stateFlow;
        this.this$0 = buySellCryptoListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BuySellCryptoListViewModel$fetchCefiTokensLivePriceForSearch$1 buySellCryptoListViewModel$fetchCefiTokensLivePriceForSearch$1 = new BuySellCryptoListViewModel$fetchCefiTokensLivePriceForSearch$1(this.$flow, this.this$0, continuation);
        buySellCryptoListViewModel$fetchCefiTokensLivePriceForSearch$1.L$0 = obj;
        return buySellCryptoListViewModel$fetchCefiTokensLivePriceForSearch$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuySellCryptoListViewModel$fetchCefiTokensLivePriceForSearch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListViewModel$fetchCefiTokensLivePriceForSearch$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Map<String, ? extends FairPriceTickerData>, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $$this$launch;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BuySellCryptoListViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BuySellCryptoListViewModel buySellCryptoListViewModel, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = buySellCryptoListViewModel;
            this.$$this$launch = coroutineScope;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$launch, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends FairPriceTickerData> map, Continuation<? super Unit> continuation) {
            return invoke2((Map<String, FairPriceTickerData>) map, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Map<String, FairPriceTickerData> map, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:78:0x01cf  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            String strGEmmrt;
            String strPrependFiatSymbol$default;
            String strOLrzqt;
            CryptoListItem.BuyCryptoListItem.PercentageChange percentageChangeCopydefault;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Map map = (Map) this.L$0;
                if (!map.isEmpty()) {
                    List<CryptoListItem> list = this.this$0.DbNXlk;
                    BuySellCryptoListViewModel buySellCryptoListViewModel = this.this$0;
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (CryptoListItem cryptoListItemAEQbTJ : list) {
                        FairPriceTickerData fairPriceTickerData = (FairPriceTickerData) map.get(cryptoListItemAEQbTJ.getCryptoId());
                        if (cryptoListItemAEQbTJ instanceof CryptoListItem.BuyCryptoListItem) {
                            int iAEQbTJ = 2;
                            if (fairPriceTickerData != null && fairPriceTickerData.isConverterNeeded()) {
                                String strMulS$default = C33129mqd.mulS$default(fairPriceTickerData.getPrice(), C56443yFo.AEQbTJ(buySellCryptoListViewModel.copydefault().AEQbTJ()), null, null, null, 14, null);
                                if (!fairPriceTickerData.isStableCoin()) {
                                    List<String> listOLrzqt = C31785mDv.EZpvd.OLrzqt();
                                    if ((listOLrzqt instanceof Collection) && listOLrzqt.isEmpty()) {
                                        iAEQbTJ = C54573xNj.copydefault.AEQbTJ(C33129mqd.AEQbTJ(strMulS$default));
                                    } else {
                                        Iterator<T> it = listOLrzqt.iterator();
                                        while (it.hasNext()) {
                                            if (StringsKt__StringsKt.AhwBna((CharSequence) it.next(), (CharSequence) ((CryptoListItem.BuyCryptoListItem) cryptoListItemAEQbTJ).getCryptoId(), true)) {
                                                break;
                                            }
                                        }
                                        iAEQbTJ = C54573xNj.copydefault.AEQbTJ(C33129mqd.AEQbTJ(strMulS$default));
                                    }
                                }
                                if (buySellCryptoListViewModel.copydefault().OLrzqt()) {
                                    strPrependFiatSymbol$default = C31661lzi.appendCryptoSymbol$default(strMulS$default, buySellCryptoListViewModel.copydefault().EZpvd(), 0, C38307pTy.Companion.EZpvd(iAEQbTJ), null, null, 26, null);
                                } else {
                                    strPrependFiatSymbol$default = C31661lzi.prependFiatSymbol$default(strMulS$default, buySellCryptoListViewModel.copydefault().EZpvd(), buySellCryptoListViewModel.copydefault().EZpvd(), C38307pTy.Companion.EZpvd(iAEQbTJ), null, false, 24, null);
                                }
                            } else {
                                if (fairPriceTickerData == null || (strGEmmrt = fairPriceTickerData.getPrice()) == null) {
                                    strGEmmrt = ((CryptoListItem.BuyCryptoListItem) cryptoListItemAEQbTJ).gEmmrt();
                                }
                                String str = strGEmmrt;
                                if (fairPriceTickerData == null || !fairPriceTickerData.isStableCoin()) {
                                    List<String> listOLrzqt2 = C31785mDv.EZpvd.OLrzqt();
                                    if ((listOLrzqt2 instanceof Collection) && listOLrzqt2.isEmpty()) {
                                        iAEQbTJ = C54573xNj.copydefault.AEQbTJ(C33129mqd.AEQbTJ(str));
                                    } else {
                                        Iterator<T> it2 = listOLrzqt2.iterator();
                                        while (it2.hasNext()) {
                                            if (StringsKt__StringsKt.AhwBna((CharSequence) it2.next(), (CharSequence) ((CryptoListItem.BuyCryptoListItem) cryptoListItemAEQbTJ).getCryptoId(), true)) {
                                                break;
                                            }
                                        }
                                        iAEQbTJ = C54573xNj.copydefault.AEQbTJ(C33129mqd.AEQbTJ(str));
                                    }
                                }
                                if (buySellCryptoListViewModel.copydefault().OLrzqt()) {
                                    strPrependFiatSymbol$default = C31661lzi.appendCryptoSymbol$default(str, buySellCryptoListViewModel.copydefault().EZpvd(), 0, C38307pTy.Companion.EZpvd(iAEQbTJ), null, null, 26, null);
                                } else {
                                    strPrependFiatSymbol$default = C31661lzi.prependFiatSymbol$default(str, buySellCryptoListViewModel.copydefault().EZpvd(), buySellCryptoListViewModel.copydefault().EZpvd(), C38307pTy.Companion.EZpvd(iAEQbTJ), null, false, 24, null);
                                }
                            }
                            String str2 = strPrependFiatSymbol$default;
                            if (fairPriceTickerData == null || (strOLrzqt = fairPriceTickerData.getPercentToDisplay()) == null) {
                                strOLrzqt = ((CryptoListItem.BuyCryptoListItem) cryptoListItemAEQbTJ).OLrzqt();
                            }
                            String str3 = strOLrzqt;
                            if (fairPriceTickerData != null) {
                                double percent = fairPriceTickerData.getPercent();
                                if (percent > AudioStats.AUDIO_AMPLITUDE_NONE) {
                                    percentageChangeCopydefault = CryptoListItem.BuyCryptoListItem.PercentageChange.UP;
                                } else if (percent < AudioStats.AUDIO_AMPLITUDE_NONE) {
                                    percentageChangeCopydefault = CryptoListItem.BuyCryptoListItem.PercentageChange.DOWN;
                                } else {
                                    percentageChangeCopydefault = CryptoListItem.BuyCryptoListItem.PercentageChange.NO_CHANGE;
                                }
                                if (percentageChangeCopydefault == null) {
                                    percentageChangeCopydefault = ((CryptoListItem.BuyCryptoListItem) cryptoListItemAEQbTJ).copydefault();
                                }
                                CryptoListItem.BuyCryptoListItem buyCryptoListItem = (CryptoListItem.BuyCryptoListItem) cryptoListItemAEQbTJ;
                                cryptoListItemAEQbTJ = buyCryptoListItem.AEQbTJ((575 & 1) != 0 ? buyCryptoListItem.KWHzl : null, (575 & 2) != 0 ? buyCryptoListItem.AEQbTJ : null, (575 & 4) != 0 ? buyCryptoListItem.values : null, (575 & 8) != 0 ? buyCryptoListItem.DbNXlk : null, (575 & 16) != 0 ? buyCryptoListItem.OLrzqt : null, (575 & 32) != 0 ? buyCryptoListItem.gEmmrt : null, (575 & 64) != 0 ? buyCryptoListItem.valueOf : str2, (575 & 128) != 0 ? buyCryptoListItem.AYXKKw : str3, (575 & 256) != 0 ? buyCryptoListItem.djBIcL : percentageChangeCopydefault, (575 & 512) != 0 ? buyCryptoListItem.EZpvd : null, (575 & 1024) != 0 ? buyCryptoListItem.AhwBna : fairPriceTickerData != null ? fairPriceTickerData.isStableCoin() : false);
                            }
                        }
                        arrayList.add(cryptoListItemAEQbTJ);
                    }
                    this.this$0.DbNXlk = arrayList;
                    this.label = 1;
                    if (YieldKt.yield(this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.AkhnZx()) {
                mHA.OLrzqt.OLrzqt(this.this$0.AEQbTJ, this.this$0.DbNXlk);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            StateFlow<Map<String, FairPriceTickerData>> stateFlow = this.$flow;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, coroutineScope, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}

package com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel;

import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundingFeePo;
import com.okinc.business.market.features.analysis.futures.sub.funding.ui.model.CoinPairVo;
import com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.FundingFeeViewModel;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C25874jJo;
import o.C25878jJs;
import o.C25879jJt;
import o.C25883jJx;
import o.C25902jKp;
import o.C25904jKr;
import o.C25905jKs;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes23.dex */
public final class FundingFeeViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoinPairVo $coinPair;
    final /* synthetic */ FuturesAnalysisRankingPeriod $period;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ FundingFeeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundingFeeViewModel$loadData$1(FundingFeeViewModel fundingFeeViewModel, FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriod, CoinPairVo coinPairVo, Continuation<? super FundingFeeViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = fundingFeeViewModel;
        this.$period = futuresAnalysisRankingPeriod;
        this.$coinPair = coinPairVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FundingFeeViewModel$loadData$1 fundingFeeViewModel$loadData$1 = new FundingFeeViewModel$loadData$1(this.this$0, this.$period, this.$coinPair, continuation);
        fundingFeeViewModel$loadData$1.L$0 = obj;
        return fundingFeeViewModel$loadData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FundingFeeViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [72=8] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0157 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0223 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0252 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0280 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02da  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        FundingFeeViewModel fundingFeeViewModel;
        FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriod;
        CoinPairVo coinPairVo;
        ValuationCurrency value;
        Object objOLrzqt;
        Object objCopydefault;
        FundingFeeViewModel fundingFeeViewModel2;
        List list;
        FundingFeePo fundingFeePo;
        Object objEZpvd;
        ValuationCurrency valuationCurrency;
        FundingFeePo fundingFeePo2;
        Object objEZpvd2;
        ValuationCurrency valuationCurrency2;
        C25902jKp c25902jKp;
        Object objEZpvd3;
        FundingFeeViewModel fundingFeeViewModel3;
        C25902jKp c25902jKp2;
        Object objEZpvd4;
        FundingFeePo fundingFeePo3;
        C25902jKp c25902jKp3;
        ValuationCurrency valuationCurrency3;
        C25902jKp c25902jKp4;
        C25902jKp c25902jKp5;
        Object objEZpvd5;
        C25902jKp c25902jKp6;
        List list2;
        FundingFeeViewModel fundingFeeViewModel4;
        C25902jKp c25902jKp7;
        Object objEZpvd6;
        C25902jKp c25902jKp8;
        List list3;
        C25902jKp c25902jKp9;
        C25902jKp c25902jKp10;
        C25904jKr c25904jKr;
        Object objCopydefault2 = C56442yFn.copydefault();
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FundingFeeViewModel fundingFeeViewModel5 = this.this$0;
                AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.FundingFeeViewModel$loadData$1.1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((FundingFeeViewModel.Activity) obj2).KWHzl();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((FundingFeeViewModel.Activity) obj2).OLrzqt((InterfaceC49371unL<C25905jKs>) obj3);
                    }
                };
                InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
                this.L$0 = coroutineScope;
                this.label = 1;
                if (fundingFeeViewModel5.KWHzl(anonymousClass1, actionBar, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                fundingFeeViewModel = this.this$0;
                futuresAnalysisRankingPeriod = this.$period;
                coinPairVo = this.$coinPair;
                Result.Application application2 = Result.Companion;
                value = fundingFeeViewModel.EZpvd().OLrzqt().getValue();
                this.L$0 = fundingFeeViewModel;
                this.L$1 = futuresAnalysisRankingPeriod;
                this.L$2 = coinPairVo;
                this.L$3 = value;
                this.label = 2;
                objOLrzqt = fundingFeeViewModel.OLrzqt(fundingFeeViewModel, this);
                if (objOLrzqt == objCopydefault2) {
                    return objCopydefault2;
                }
                FundingFeeViewModel fundingFeeViewModel6 = fundingFeeViewModel;
                String strAEQbTJ = ((FundingFeeViewModel.Activity) objOLrzqt).AEQbTJ();
                C25878jJs c25878jJsGEmmrt = fundingFeeViewModel6.gEmmrt();
                String unit = value.getUnit();
                String value2 = futuresAnalysisRankingPeriod.getPayload().getValue();
                String instId = coinPairVo.getInstId();
                this.L$0 = fundingFeeViewModel6;
                this.L$1 = value;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                objCopydefault = c25878jJsGEmmrt.copydefault(unit, value2, instId, strAEQbTJ, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                fundingFeeViewModel2 = fundingFeeViewModel6;
                list = (List) objCopydefault;
                if (list != null || (fundingFeePo = (FundingFeePo) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) {
                    throw new FundingFeeViewModel.EmptytException();
                }
                C25874jJo c25874jJoKWHzl = fundingFeeViewModel2.KWHzl();
                Pair pairOLrzqt = C56390yDp.OLrzqt(fundingFeePo.getFundingFee(), value);
                this.L$0 = fundingFeeViewModel2;
                this.L$1 = value;
                this.L$2 = fundingFeePo;
                this.label = 4;
                objEZpvd = c25874jJoKWHzl.EZpvd(pairOLrzqt, this);
                if (objEZpvd == objCopydefault2) {
                    return objCopydefault2;
                }
                valuationCurrency = value;
                fundingFeePo2 = fundingFeePo;
                C25902jKp c25902jKp11 = (C25902jKp) objEZpvd;
                C25874jJo c25874jJoKWHzl2 = fundingFeeViewModel2.KWHzl();
                Pair pairOLrzqt2 = C56390yDp.OLrzqt(fundingFeePo2.getLossFundingFee(), valuationCurrency);
                this.L$0 = fundingFeeViewModel2;
                this.L$1 = valuationCurrency;
                this.L$2 = c25902jKp11;
                this.L$3 = fundingFeePo2;
                this.label = 5;
                objEZpvd2 = c25874jJoKWHzl2.EZpvd(pairOLrzqt2, this);
                if (objEZpvd2 != objCopydefault2) {
                    return objCopydefault2;
                }
                valuationCurrency2 = valuationCurrency;
                c25902jKp = c25902jKp11;
                C25902jKp c25902jKp12 = (C25902jKp) objEZpvd2;
                C25874jJo c25874jJoKWHzl3 = fundingFeeViewModel2.KWHzl();
                Pair pairOLrzqt3 = C56390yDp.OLrzqt(fundingFeePo2.getWinFundingFee(), valuationCurrency2);
                this.L$0 = fundingFeeViewModel2;
                this.L$1 = valuationCurrency2;
                this.L$2 = c25902jKp;
                this.L$3 = c25902jKp12;
                this.L$4 = fundingFeePo2;
                this.label = 6;
                objEZpvd3 = c25874jJoKWHzl3.EZpvd(pairOLrzqt3, this);
                if (objEZpvd3 != objCopydefault2) {
                    return objCopydefault2;
                }
                fundingFeeViewModel3 = fundingFeeViewModel2;
                c25902jKp2 = c25902jKp12;
                C25902jKp c25902jKp13 = (C25902jKp) objEZpvd3;
                C25879jJt c25879jJtOLrzqt = fundingFeeViewModel3.OLrzqt();
                Pair pairOLrzqt4 = C56390yDp.OLrzqt(fundingFeePo2, valuationCurrency2);
                this.L$0 = fundingFeeViewModel3;
                this.L$1 = valuationCurrency2;
                this.L$2 = c25902jKp;
                this.L$3 = c25902jKp2;
                this.L$4 = fundingFeePo2;
                this.L$5 = c25902jKp13;
                this.label = 7;
                objEZpvd4 = c25879jJtOLrzqt.EZpvd(pairOLrzqt4, this);
                if (objEZpvd4 != objCopydefault2) {
                    return objCopydefault2;
                }
                C25902jKp c25902jKp14 = c25902jKp2;
                fundingFeePo3 = fundingFeePo2;
                c25902jKp3 = c25902jKp13;
                valuationCurrency3 = valuationCurrency2;
                c25902jKp4 = c25902jKp;
                c25902jKp5 = c25902jKp14;
                List list4 = (List) objEZpvd4;
                C25883jJx c25883jJxAYXKKw = fundingFeeViewModel3.AYXKKw();
                Pair pairOLrzqt5 = C56390yDp.OLrzqt(fundingFeePo3.getLossFundingFeeList(), valuationCurrency3);
                this.L$0 = fundingFeeViewModel3;
                this.L$1 = valuationCurrency3;
                this.L$2 = c25902jKp4;
                this.L$3 = c25902jKp5;
                this.L$4 = fundingFeePo3;
                this.L$5 = c25902jKp3;
                this.L$6 = list4;
                this.label = 8;
                objEZpvd5 = c25883jJxAYXKKw.EZpvd(pairOLrzqt5, (Continuation) this);
                if (objEZpvd5 != objCopydefault2) {
                    return objCopydefault2;
                }
                C25902jKp c25902jKp15 = c25902jKp4;
                c25902jKp6 = c25902jKp5;
                list2 = list4;
                fundingFeeViewModel4 = fundingFeeViewModel3;
                c25902jKp7 = c25902jKp15;
                C25904jKr c25904jKr2 = (C25904jKr) objEZpvd5;
                C25883jJx c25883jJxAYXKKw2 = fundingFeeViewModel4.AYXKKw();
                Pair pairOLrzqt6 = C56390yDp.OLrzqt(fundingFeePo3.getWinFundingFeeList(), valuationCurrency3);
                this.L$0 = c25902jKp7;
                this.L$1 = c25902jKp6;
                this.L$2 = c25902jKp3;
                this.L$3 = list2;
                this.L$4 = c25904jKr2;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 9;
                objEZpvd6 = c25883jJxAYXKKw2.EZpvd(pairOLrzqt6, (Continuation) this);
                if (objEZpvd6 != objCopydefault2) {
                    return objCopydefault2;
                }
                c25902jKp8 = c25902jKp3;
                list3 = list2;
                c25902jKp9 = c25902jKp6;
                c25902jKp10 = c25902jKp7;
                c25904jKr = c25904jKr2;
                objM7377constructorimpl = Result.m7377constructorimpl(new C25905jKs(c25902jKp10, list3, c25904jKr, (C25904jKr) objEZpvd6, c25902jKp8, c25902jKp9));
                FundingFeeViewModel fundingFeeViewModel7 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    FundingFeeViewModel$loadData$1$3$1 fundingFeeViewModel$loadData$1$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.FundingFeeViewModel$loadData$1$3$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj2) {
                            return ((FundingFeeViewModel.Activity) obj2).KWHzl();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj2, Object obj3) {
                            ((FundingFeeViewModel.Activity) obj2).OLrzqt((InterfaceC49371unL<C25905jKs>) obj3);
                        }
                    };
                    InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity((C25905jKs) objM7377constructorimpl);
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 10;
                    if (fundingFeeViewModel7.KWHzl(fundingFeeViewModel$loadData$1$3$1, activity, this) == objCopydefault2) {
                        return objCopydefault2;
                    }
                }
                FundingFeeViewModel fundingFeeViewModel8 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    if (thM7380exceptionOrNullimpl instanceof FundingFeeViewModel.EmptytException) {
                        FundingFeeViewModel$loadData$1$4$1 fundingFeeViewModel$loadData$1$4$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.FundingFeeViewModel$loadData$1$4$1
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj2) {
                                return ((FundingFeeViewModel.Activity) obj2).KWHzl();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj2, Object obj3) {
                                ((FundingFeeViewModel.Activity) obj2).OLrzqt((InterfaceC49371unL<C25905jKs>) obj3);
                            }
                        };
                        InterfaceC49371unL.TaskDescription taskDescription = new InterfaceC49371unL.TaskDescription(null, 1, null);
                        this.L$0 = objM7377constructorimpl;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.label = 11;
                        if (fundingFeeViewModel8.KWHzl(fundingFeeViewModel$loadData$1$4$1, taskDescription, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                    } else {
                        FundingFeeViewModel$loadData$1$4$2 fundingFeeViewModel$loadData$1$4$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.FundingFeeViewModel$loadData$1$4$2
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj2) {
                                return ((FundingFeeViewModel.Activity) obj2).KWHzl();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj2, Object obj3) {
                                ((FundingFeeViewModel.Activity) obj2).OLrzqt((InterfaceC49371unL<C25905jKs>) obj3);
                            }
                        };
                        InterfaceC49371unL.Application application3 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                        this.L$0 = objM7377constructorimpl;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.label = 12;
                        if (fundingFeeViewModel8.KWHzl(fundingFeeViewModel$loadData$1$4$2, application3, this) == objCopydefault2) {
                            return objCopydefault2;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                fundingFeeViewModel = this.this$0;
                futuresAnalysisRankingPeriod = this.$period;
                coinPairVo = this.$coinPair;
                Result.Application application22 = Result.Companion;
                value = fundingFeeViewModel.EZpvd().OLrzqt().getValue();
                this.L$0 = fundingFeeViewModel;
                this.L$1 = futuresAnalysisRankingPeriod;
                this.L$2 = coinPairVo;
                this.L$3 = value;
                this.label = 2;
                objOLrzqt = fundingFeeViewModel.OLrzqt(fundingFeeViewModel, this);
                if (objOLrzqt == objCopydefault2) {
                }
                FundingFeeViewModel fundingFeeViewModel62 = fundingFeeViewModel;
                String strAEQbTJ2 = ((FundingFeeViewModel.Activity) objOLrzqt).AEQbTJ();
                C25878jJs c25878jJsGEmmrt2 = fundingFeeViewModel62.gEmmrt();
                String unit2 = value.getUnit();
                String value22 = futuresAnalysisRankingPeriod.getPayload().getValue();
                String instId2 = coinPairVo.getInstId();
                this.L$0 = fundingFeeViewModel62;
                this.L$1 = value;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                objCopydefault = c25878jJsGEmmrt2.copydefault(unit2, value22, instId2, strAEQbTJ2, this);
                if (objCopydefault == objCopydefault2) {
                }
                break;
            case 2:
                value = (ValuationCurrency) this.L$3;
                coinPairVo = (CoinPairVo) this.L$2;
                futuresAnalysisRankingPeriod = (FuturesAnalysisRankingPeriod) this.L$1;
                fundingFeeViewModel = (FundingFeeViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                FundingFeeViewModel fundingFeeViewModel622 = fundingFeeViewModel;
                String strAEQbTJ22 = ((FundingFeeViewModel.Activity) objOLrzqt).AEQbTJ();
                C25878jJs c25878jJsGEmmrt22 = fundingFeeViewModel622.gEmmrt();
                String unit22 = value.getUnit();
                String value222 = futuresAnalysisRankingPeriod.getPayload().getValue();
                String instId22 = coinPairVo.getInstId();
                this.L$0 = fundingFeeViewModel622;
                this.L$1 = value;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                objCopydefault = c25878jJsGEmmrt22.copydefault(unit22, value222, instId22, strAEQbTJ22, this);
                if (objCopydefault == objCopydefault2) {
                }
                break;
            case 3:
                value = (ValuationCurrency) this.L$1;
                FundingFeeViewModel fundingFeeViewModel9 = (FundingFeeViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                fundingFeeViewModel2 = fundingFeeViewModel9;
                objCopydefault = obj;
                list = (List) objCopydefault;
                if (list != null) {
                    break;
                }
                throw new FundingFeeViewModel.EmptytException();
            case 4:
                fundingFeePo2 = (FundingFeePo) this.L$2;
                valuationCurrency = (ValuationCurrency) this.L$1;
                fundingFeeViewModel2 = (FundingFeeViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = obj;
                C25902jKp c25902jKp112 = (C25902jKp) objEZpvd;
                C25874jJo c25874jJoKWHzl22 = fundingFeeViewModel2.KWHzl();
                Pair pairOLrzqt22 = C56390yDp.OLrzqt(fundingFeePo2.getLossFundingFee(), valuationCurrency);
                this.L$0 = fundingFeeViewModel2;
                this.L$1 = valuationCurrency;
                this.L$2 = c25902jKp112;
                this.L$3 = fundingFeePo2;
                this.label = 5;
                objEZpvd2 = c25874jJoKWHzl22.EZpvd(pairOLrzqt22, this);
                if (objEZpvd2 != objCopydefault2) {
                }
                break;
            case 5:
                fundingFeePo2 = (FundingFeePo) this.L$3;
                c25902jKp = (C25902jKp) this.L$2;
                ValuationCurrency valuationCurrency4 = (ValuationCurrency) this.L$1;
                FundingFeeViewModel fundingFeeViewModel10 = (FundingFeeViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd2 = obj;
                valuationCurrency2 = valuationCurrency4;
                fundingFeeViewModel2 = fundingFeeViewModel10;
                C25902jKp c25902jKp122 = (C25902jKp) objEZpvd2;
                C25874jJo c25874jJoKWHzl32 = fundingFeeViewModel2.KWHzl();
                Pair pairOLrzqt32 = C56390yDp.OLrzqt(fundingFeePo2.getWinFundingFee(), valuationCurrency2);
                this.L$0 = fundingFeeViewModel2;
                this.L$1 = valuationCurrency2;
                this.L$2 = c25902jKp;
                this.L$3 = c25902jKp122;
                this.L$4 = fundingFeePo2;
                this.label = 6;
                objEZpvd3 = c25874jJoKWHzl32.EZpvd(pairOLrzqt32, this);
                if (objEZpvd3 != objCopydefault2) {
                }
                break;
            case 6:
                fundingFeePo2 = (FundingFeePo) this.L$4;
                C25902jKp c25902jKp16 = (C25902jKp) this.L$3;
                C25902jKp c25902jKp17 = (C25902jKp) this.L$2;
                valuationCurrency2 = (ValuationCurrency) this.L$1;
                fundingFeeViewModel3 = (FundingFeeViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd3 = obj;
                c25902jKp2 = c25902jKp16;
                c25902jKp = c25902jKp17;
                C25902jKp c25902jKp132 = (C25902jKp) objEZpvd3;
                C25879jJt c25879jJtOLrzqt2 = fundingFeeViewModel3.OLrzqt();
                Pair pairOLrzqt42 = C56390yDp.OLrzqt(fundingFeePo2, valuationCurrency2);
                this.L$0 = fundingFeeViewModel3;
                this.L$1 = valuationCurrency2;
                this.L$2 = c25902jKp;
                this.L$3 = c25902jKp2;
                this.L$4 = fundingFeePo2;
                this.L$5 = c25902jKp132;
                this.label = 7;
                objEZpvd4 = c25879jJtOLrzqt2.EZpvd(pairOLrzqt42, this);
                if (objEZpvd4 != objCopydefault2) {
                }
                break;
            case 7:
                c25902jKp3 = (C25902jKp) this.L$5;
                FundingFeePo fundingFeePo4 = (FundingFeePo) this.L$4;
                C25902jKp c25902jKp18 = (C25902jKp) this.L$3;
                c25902jKp4 = (C25902jKp) this.L$2;
                ValuationCurrency valuationCurrency5 = (ValuationCurrency) this.L$1;
                FundingFeeViewModel fundingFeeViewModel11 = (FundingFeeViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd4 = obj;
                fundingFeePo3 = fundingFeePo4;
                c25902jKp5 = c25902jKp18;
                valuationCurrency3 = valuationCurrency5;
                fundingFeeViewModel3 = fundingFeeViewModel11;
                List list42 = (List) objEZpvd4;
                C25883jJx c25883jJxAYXKKw3 = fundingFeeViewModel3.AYXKKw();
                Pair pairOLrzqt52 = C56390yDp.OLrzqt(fundingFeePo3.getLossFundingFeeList(), valuationCurrency3);
                this.L$0 = fundingFeeViewModel3;
                this.L$1 = valuationCurrency3;
                this.L$2 = c25902jKp4;
                this.L$3 = c25902jKp5;
                this.L$4 = fundingFeePo3;
                this.L$5 = c25902jKp3;
                this.L$6 = list42;
                this.label = 8;
                objEZpvd5 = c25883jJxAYXKKw3.EZpvd(pairOLrzqt52, (Continuation) this);
                if (objEZpvd5 != objCopydefault2) {
                }
                break;
            case 8:
                List list5 = (List) this.L$6;
                C25902jKp c25902jKp19 = (C25902jKp) this.L$5;
                fundingFeePo3 = (FundingFeePo) this.L$4;
                c25902jKp6 = (C25902jKp) this.L$3;
                c25902jKp7 = (C25902jKp) this.L$2;
                valuationCurrency3 = (ValuationCurrency) this.L$1;
                fundingFeeViewModel4 = (FundingFeeViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd5 = obj;
                list2 = list5;
                c25902jKp3 = c25902jKp19;
                C25904jKr c25904jKr22 = (C25904jKr) objEZpvd5;
                C25883jJx c25883jJxAYXKKw22 = fundingFeeViewModel4.AYXKKw();
                Pair pairOLrzqt62 = C56390yDp.OLrzqt(fundingFeePo3.getWinFundingFeeList(), valuationCurrency3);
                this.L$0 = c25902jKp7;
                this.L$1 = c25902jKp6;
                this.L$2 = c25902jKp3;
                this.L$3 = list2;
                this.L$4 = c25904jKr22;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 9;
                objEZpvd6 = c25883jJxAYXKKw22.EZpvd(pairOLrzqt62, (Continuation) this);
                if (objEZpvd6 != objCopydefault2) {
                }
                break;
            case 9:
                C25904jKr c25904jKr3 = (C25904jKr) this.L$4;
                List list6 = (List) this.L$3;
                C25902jKp c25902jKp20 = (C25902jKp) this.L$2;
                C25902jKp c25902jKp21 = (C25902jKp) this.L$1;
                C25902jKp c25902jKp22 = (C25902jKp) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c25904jKr = c25904jKr3;
                list3 = list6;
                c25902jKp8 = c25902jKp20;
                c25902jKp9 = c25902jKp21;
                c25902jKp10 = c25902jKp22;
                objEZpvd6 = obj;
                objM7377constructorimpl = Result.m7377constructorimpl(new C25905jKs(c25902jKp10, list3, c25904jKr, (C25904jKr) objEZpvd6, c25902jKp8, c25902jKp9));
                FundingFeeViewModel fundingFeeViewModel72 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                FundingFeeViewModel fundingFeeViewModel82 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 10:
                objM7377constructorimpl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                FundingFeeViewModel fundingFeeViewModel822 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 11:
            case 12:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

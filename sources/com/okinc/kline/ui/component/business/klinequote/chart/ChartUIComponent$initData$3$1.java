package com.okinc.kline.ui.component.business.klinequote.chart;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.KlineTimeAnchorType;
import com.okinc.kline.data.KlineTimeToolType;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.kline.ui.component.business.klinequote.KlineQuoteDataComponent;
import com.okinc.kline.ui.viewmodel.KlineTimeAnchorViewModel;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionCoolState;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC39028pka;
import o.C33129mqd;
import o.C36250oUv;
import o.C37925pFu;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC39563puh;
import o.oLT;
import o.oML;
import o.pFP;

/* JADX INFO: loaded from: classes8.dex */
public final class ChartUIComponent$initData$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $it;
    long J$0;
    int label;
    final /* synthetic */ ChartUIComponent this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartUIComponent$initData$3$1(ChartUIComponent chartUIComponent, int i, Continuation<? super ChartUIComponent$initData$3$1> continuation) {
        super(2, continuation);
        this.this$0 = chartUIComponent;
        this.$it = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartUIComponent$initData$3$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartUIComponent$initData$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        C36250oUv c36250oUv;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        String mode;
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH;
        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH2;
        C36250oUv c36250oUv2;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
        KlineSpotAverageBean klineSpotAverageBean;
        oML oml;
        C36250oUv c36250oUv3;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx3;
        C36250oUv c36250oUv4;
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx4;
        oML oml2;
        C36250oUv c36250oUv5;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            long jAEQbTJ = ((KlineTimeAnchorViewModel) this.this$0.sSMYrx().getValue()).AEQbTJ();
            KlineTimeAnchorViewModel klineTimeAnchorViewModel = (KlineTimeAnchorViewModel) this.this$0.sSMYrx().getValue();
            oML oml3 = (oML) this.this$0.isConnected().KWHzl();
            String str = (oml3 == null || (c36250oUv = oml3.AuCTel) == null || (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) == null || (mode = chartViewOutSideConfigAkhnZx.getMode()) == null) ? "" : mode;
            TemplateSetting templateSettingGEmmrt = this.this$0.gEmmrt();
            int sPTimeInterval = templateSettingGEmmrt != null ? templateSettingGEmmrt.getSPTimeInterval() : 1440;
            String strAuCTel = this.this$0.AYXKKw().AuCTel();
            if (!klineTimeAnchorViewModel.AEQbTJ(str, jAEQbTJ, sPTimeInterval, strAuCTel == null ? "" : strAuCTel)) {
                this.this$0.EZpvd(this.$it);
                ((KlineTimeAnchorViewModel) this.this$0.sSMYrx().getValue()).OLrzqt();
                if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && this.$it != -2) {
                    if (!this.this$0.AYXKKw().QVAiDq()) {
                        if (Intrinsics.EZpvd(this.this$0.AYXKKw().AubY().KWHzl().getValue(), C56443yFo.KWHzl(false)) && (oml2 = (oML) this.this$0.isConnected().KWHzl()) != null && (c36250oUv5 = oml2.AuCTel) != null) {
                            c36250oUv5.AYXKKw();
                        }
                    } else {
                        this.this$0.AYXKKw().copydefault(true);
                    }
                    if (Intrinsics.EZpvd((Object) this.this$0.AYXKKw().getNewProxyInstance(), (Object) "TYPE_KLINE")) {
                        if (Intrinsics.EZpvd((Object) this.this$0.AYXKKw().AuCTel(), (Object) oLT.AuCTel()) || Intrinsics.EZpvd((Object) this.this$0.AYXKKw().AuCTel(), (Object) oLT.KWHzl())) {
                            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.this$0.AYXKKw()), null, null, new AnonymousClass1(this.this$0, null), 3, null);
                        } else {
                            oML oml4 = (oML) this.this$0.isConnected().KWHzl();
                            if (oml4 != null && (c36250oUv4 = oml4.AuCTel) != null && (chartViewOutSideConfigAkhnZx4 = c36250oUv4.AkhnZx()) != null) {
                                chartViewOutSideConfigAkhnZx4.setOpenCoolTime(false);
                            }
                        }
                        if (Intrinsics.EZpvd((Object) this.this$0.AYXKKw().AuCTel(), (Object) oLT.fetchVPNInfo()) && (oml = (oML) this.this$0.isConnected().KWHzl()) != null && (c36250oUv3 = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx3 = c36250oUv3.AkhnZx()) != null && chartViewOutSideConfigAkhnZx3.isShowSpotAveragePrice()) {
                            String strFIwbmz = this.this$0.AYXKKw().fIwbmz();
                            if (strFIwbmz != null) {
                                ChartUIComponent chartUIComponent = this.this$0;
                                int iAEQbTJ = C37925pFu.KWHzl.AEQbTJ(chartUIComponent.AYXKKw().AuCTel(), chartUIComponent.AYXKKw().fJNWhG());
                                InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH3 = chartUIComponent.AYXKKw().uzCIH();
                                if (stateListAnimatorUzCIH3 != null) {
                                    AbstractC39028pka abstractC39028pkaOLrzqt = chartUIComponent.AYXKKw().OLrzqt();
                                    String strAuCTel2 = chartUIComponent.AYXKKw().AuCTel();
                                    Intrinsics.copydefault((Object) strAuCTel2);
                                    InterfaceC39563puh.StateListAnimator.TaskDescription.loadCumulativeCost$default(stateListAnimatorUzCIH3, abstractC39028pkaOLrzqt, strAuCTel2, strFIwbmz, iAEQbTJ, false, 16, null);
                                }
                            }
                        } else {
                            oML oml5 = (oML) this.this$0.isConnected().KWHzl();
                            if (oml5 != null && (c36250oUv2 = oml5.AuCTel) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv2.AkhnZx()) != null && (klineSpotAverageBean = chartViewOutSideConfigAkhnZx2.getKlineSpotAverageBean()) != null) {
                                klineSpotAverageBean.setShowSpotAverageLine(false);
                            }
                        }
                        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH4 = this.this$0.AYXKKw().uzCIH();
                        if (stateListAnimatorUzCIH4 != null) {
                            InterfaceC39563puh.StateListAnimator.TaskDescription.loadTradePosition$default(stateListAnimatorUzCIH4, this.this$0.AYXKKw().OLrzqt(), false, 2, null);
                        }
                        InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH5 = this.this$0.AYXKKw().uzCIH();
                        if (stateListAnimatorUzCIH5 != null) {
                            InterfaceC39563puh.StateListAnimator.TaskDescription.loadOpenOrder$default(stateListAnimatorUzCIH5, this.this$0.AYXKKw().OLrzqt(), false, 2, null);
                        }
                    }
                    stateListAnimatorUzCIH = this.this$0.AYXKKw().uzCIH();
                    if (stateListAnimatorUzCIH != null) {
                        stateListAnimatorUzCIH.copydefault(this.this$0.AYXKKw().OLrzqt());
                    }
                    String string = SPUtils.getString("kline_indicator_version", "0");
                    stateListAnimatorUzCIH2 = this.this$0.AYXKKw().uzCIH();
                    if (stateListAnimatorUzCIH2 != null) {
                        AbstractC39028pka abstractC39028pkaOLrzqt2 = this.this$0.AYXKKw().OLrzqt();
                        Intrinsics.copydefault((Object) string);
                        stateListAnimatorUzCIH2.copydefault(abstractC39028pkaOLrzqt2, "ALL", string);
                    }
                }
                this.this$0.AYXKKw().AubY().valueOf().setValue(C56443yFo.KWHzl(true));
                return Unit.INSTANCE;
            }
            InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH6 = this.this$0.AYXKKw().uzCIH();
            if (stateListAnimatorUzCIH6 != null) {
                stateListAnimatorUzCIH6.AEQbTJ();
            }
            ChartUIComponent chartUIComponent2 = this.this$0;
            this.J$0 = jAEQbTJ;
            this.label = 1;
            obj = chartUIComponent2.EZpvd((Continuation<? super Long>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            j = jAEQbTJ;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = this.J$0;
            C56391yDq.AEQbTJ(obj);
            j = j2;
        }
        long jLongValue = ((Number) obj).longValue();
        if (jLongValue <= j) {
            this.this$0.KWHzl(j, jLongValue, KlineTimeAnchorType.AnchorLeft, KlineTimeToolType.KLineTimeAnchor, false);
            this.this$0.AwvSrB();
            KlineQuoteDataComponent klineQuoteDataComponentAYXKKw = this.this$0.AYXKKw();
            MarketCoinInfo marketCoinInfoHDKMBd = this.this$0.AYXKKw().hDKMBd();
            Intrinsics.copydefault(marketCoinInfoHDKMBd);
            klineQuoteDataComponentAYXKKw.EZpvd(marketCoinInfoHDKMBd.getInstrumentId());
        } else {
            this.this$0.EZpvd(this.$it);
        }
        ((KlineTimeAnchorViewModel) this.this$0.sSMYrx().getValue()).OLrzqt();
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null)) {
            if (!this.this$0.AYXKKw().QVAiDq()) {
            }
            if (Intrinsics.EZpvd((Object) this.this$0.AYXKKw().getNewProxyInstance(), (Object) "TYPE_KLINE")) {
            }
            stateListAnimatorUzCIH = this.this$0.AYXKKw().uzCIH();
            if (stateListAnimatorUzCIH != null) {
            }
            String string2 = SPUtils.getString("kline_indicator_version", "0");
            stateListAnimatorUzCIH2 = this.this$0.AYXKKw().uzCIH();
            if (stateListAnimatorUzCIH2 != null) {
            }
        }
        this.this$0.AYXKKw().AubY().valueOf().setValue(C56443yFo.KWHzl(true));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.component.business.klinequote.chart.ChartUIComponent$initData$3$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ChartUIComponent this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChartUIComponent chartUIComponent, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chartUIComponent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ArrayList arrayList;
            oML oml;
            C36250oUv c36250oUv;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
            C36250oUv c36250oUv2;
            ChartViewOutSideConfig chartViewOutSideConfigAkhnZx2;
            String tradeSymbol;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC39563puh.StateListAnimator stateListAnimatorUzCIH = this.this$0.AYXKKw().uzCIH();
                if (stateListAnimatorUzCIH == null) {
                    arrayList = null;
                    if (arrayList == null && !arrayList.isEmpty()) {
                        this.this$0.isConnected = C33129mqd.valueOf(((OptionCoolState) arrayList.get(0)).getCoolingEndTime());
                        oML oml2 = (oML) this.this$0.isConnected().KWHzl();
                        if (oml2 != null && (c36250oUv2 = oml2.AuCTel) != null && (chartViewOutSideConfigAkhnZx2 = c36250oUv2.AkhnZx()) != null) {
                            OptionCoolState optionCoolState = (OptionCoolState) CollectionsKt___CollectionsKt.AkhnZx(arrayList, 0);
                            if (optionCoolState == null) {
                                z = false;
                                chartViewOutSideConfigAkhnZx2.setOpenCoolTime(z);
                            } else {
                                BizInstrument bizInstrumentAYXKKw = this.this$0.AYXKKw().AYXKKw();
                                if (bizInstrumentAYXKKw == null || (tradeSymbol = bizInstrumentAYXKKw.getTradeSymbol()) == null) {
                                    tradeSymbol = "";
                                }
                                if (!optionCoolState.isInCoolTime(tradeSymbol)) {
                                }
                                chartViewOutSideConfigAkhnZx2.setOpenCoolTime(z);
                            }
                        }
                    } else {
                        oml = (oML) this.this$0.isConnected().KWHzl();
                        if (oml != null && (c36250oUv = oml.AuCTel) != null && (chartViewOutSideConfigAkhnZx = c36250oUv.AkhnZx()) != null) {
                            chartViewOutSideConfigAkhnZx.setOpenCoolTime(false);
                        }
                    }
                    return Unit.INSTANCE;
                }
                AbstractC39028pka abstractC39028pkaOLrzqt = this.this$0.AYXKKw().OLrzqt();
                this.label = 1;
                obj = stateListAnimatorUzCIH.KWHzl(abstractC39028pkaOLrzqt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            arrayList = (ArrayList) obj;
            if (arrayList == null) {
                oml = (oML) this.this$0.isConnected().KWHzl();
                if (oml != null) {
                    chartViewOutSideConfigAkhnZx.setOpenCoolTime(false);
                }
            }
            return Unit.INSTANCE;
        }
    }
}

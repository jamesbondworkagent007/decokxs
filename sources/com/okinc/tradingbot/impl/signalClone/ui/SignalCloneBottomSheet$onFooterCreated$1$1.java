package com.okinc.tradingbot.impl.signalClone.ui;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.bot.util.recurring.RecurringCycleConfigNew;
import com.okinc.unify_trade.bot.util.recurring.RecurringHourlyConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC50583vTu;
import o.C33129mqd;
import o.C49662usl;
import o.C53258wiB;
import o.C53784wry;
import o.C53826wsn;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.pUU;
import o.vDY;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalCloneBottomSheet$onFooterCreated$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StrategyDetailsResponse $currentBotInfo;
    int label;
    final /* synthetic */ SignalCloneBottomSheet this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCloneBottomSheet$onFooterCreated$1$1(SignalCloneBottomSheet signalCloneBottomSheet, StrategyDetailsResponse strategyDetailsResponse, Continuation<? super SignalCloneBottomSheet$onFooterCreated$1$1> continuation) {
        super(2, continuation);
        this.this$0 = signalCloneBottomSheet;
        this.$currentBotInfo = strategyDetailsResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SignalCloneBottomSheet$onFooterCreated$1$1(this.this$0, this.$currentBotInfo, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalCloneBottomSheet$onFooterCreated$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [206=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0136, code lost:
    
        if (r2.equals("grid") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0143, code lost:
    
        if (r2.equals("smart_arbitrage") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0150, code lost:
    
        if (r2.equals("smart_portfolio") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0152, code lost:
    
        r3 = r35;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d7 A[PHI: r1 r3 r4
  0x01d7: PHI (r1v18 java.lang.String) = (r1v3 java.lang.String), (r1v5 java.lang.String), (r1v9 java.lang.String), (r1v19 java.lang.String) binds: [B:55:0x01ba, B:49:0x0194, B:46:0x0152, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x01d7: PHI (r3v17 com.okinc.unify_trade.biz.StrategyReqGroup) = 
  (r3v1 com.okinc.unify_trade.biz.StrategyReqGroup)
  (r3v2 com.okinc.unify_trade.biz.StrategyReqGroup)
  (r3v5 com.okinc.unify_trade.biz.StrategyReqGroup)
  (r3v18 com.okinc.unify_trade.biz.StrategyReqGroup)
 binds: [B:55:0x01ba, B:49:0x0194, B:46:0x0152, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x01d7: PHI (r4v15 java.lang.String) = (r4v1 java.lang.String), (r4v3 java.lang.String), (r4v7 java.lang.String), (r4v16 java.lang.String) binds: [B:55:0x01ba, B:49:0x0194, B:46:0x0152, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objBuildOrderRequest$default;
        StrategyReqGroup strategyReqGroupOLrzqt;
        final StrategyReqGroup strategyReqGroup;
        String str;
        String str2;
        StrategyReqGroup strategyReqGroup2;
        AbstractC50583vTu abstractC50583vTuNewInstance$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SignalCloneBottomSheet signalCloneBottomSheet = this.this$0;
            this.label = 1;
            objBuildOrderRequest$default = SignalCloneBottomSheet.buildOrderRequest$default(signalCloneBottomSheet, false, this, 1, null);
            if (objBuildOrderRequest$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objBuildOrderRequest$default = obj;
        }
        C53784wry.ActionBar actionBar = (C53784wry.ActionBar) objBuildOrderRequest$default;
        if (actionBar == null || (strategyReqGroupOLrzqt = actionBar.OLrzqt()) == null) {
            return Unit.INSTANCE;
        }
        String ordType = this.$currentBotInfo.getOrdType();
        switch (ordType.hashCode()) {
            case -1831183611:
                strategyReqGroup = strategyReqGroupOLrzqt;
                str = "BotConfirmationSheet";
                str2 = "";
                if (ordType.equals("spot_dca")) {
                    DcaOrderReq dcaRequest = strategyReqGroup.getDcaRequest();
                    if (dcaRequest != null) {
                        SignalCloneBottomSheet signalCloneBottomSheet2 = this.this$0;
                        C53258wiB.StateListAnimator stateListAnimator = C53258wiB.Companion;
                        FragmentManager childFragmentManager = signalCloneBottomSheet2.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, str2);
                        stateListAnimator.OLrzqt(dcaRequest, childFragmentManager, new Application(signalCloneBottomSheet2, strategyReqGroup));
                    }
                } else {
                    abstractC50583vTuNewInstance$default = AbstractC50583vTu.Application.newInstance$default(AbstractC50583vTu.Companion, this.$currentBotInfo.getInstId(), this.$currentBotInfo.getInstType(), strategyReqGroup, false, 8, null);
                    if (abstractC50583vTuNewInstance$default != null) {
                        FragmentManager childFragmentManager2 = this.this$0.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, str2);
                        C49662usl.EZpvd(abstractC50583vTuNewInstance$default, childFragmentManager2, str);
                    }
                }
                FragmentManager childFragmentManager3 = this.this$0.getChildFragmentManager();
                LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
                final SignalCloneBottomSheet signalCloneBottomSheet3 = this.this$0;
                childFragmentManager3.setFragmentResultListener("bot_order", viewLifecycleOwner, new FragmentResultListener() { // from class: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$onFooterCreated$1$1.5
                    @Override // androidx.fragment.app.FragmentResultListener
                    public final void onFragmentResult(String str3, Bundle bundle) {
                        Intrinsics.checkNotNullParameter(str3, "");
                        Intrinsics.checkNotNullParameter(bundle, "");
                        signalCloneBottomSheet3.AYXKKw().copydefault(new C53826wsn.StateListAnimator.Activity(strategyReqGroup));
                    }
                });
                return Unit.INSTANCE;
            case -1402017003:
                strategyReqGroup = strategyReqGroupOLrzqt;
                str = "BotConfirmationSheet";
                str2 = "";
                if (ordType.equals("contract_dca")) {
                    DcaOrderReq dcaRequest2 = strategyReqGroup.getDcaRequest();
                    if (dcaRequest2 != null) {
                        SignalCloneBottomSheet signalCloneBottomSheet4 = this.this$0;
                        vDY.StateListAnimator stateListAnimator2 = vDY.Companion;
                        FragmentManager childFragmentManager4 = signalCloneBottomSheet4.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager4, str2);
                        stateListAnimator2.AEQbTJ(dcaRequest2, childFragmentManager4, new Activity(signalCloneBottomSheet4, strategyReqGroup));
                    }
                }
                FragmentManager childFragmentManager32 = this.this$0.getChildFragmentManager();
                LifecycleOwner viewLifecycleOwner2 = this.this$0.getViewLifecycleOwner();
                final SignalCloneBottomSheet signalCloneBottomSheet32 = this.this$0;
                childFragmentManager32.setFragmentResultListener("bot_order", viewLifecycleOwner2, new FragmentResultListener() { // from class: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$onFooterCreated$1$1.5
                    @Override // androidx.fragment.app.FragmentResultListener
                    public final void onFragmentResult(String str3, Bundle bundle) {
                        Intrinsics.checkNotNullParameter(str3, "");
                        Intrinsics.checkNotNullParameter(bundle, "");
                        signalCloneBottomSheet32.AYXKKw().copydefault(new C53826wsn.StateListAnimator.Activity(strategyReqGroup));
                    }
                });
                return Unit.INSTANCE;
            case -1216369070:
                strategyReqGroup2 = strategyReqGroupOLrzqt;
                str = "BotConfirmationSheet";
                str2 = "";
                break;
            case -557961837:
                strategyReqGroup2 = strategyReqGroupOLrzqt;
                str = "BotConfirmationSheet";
                str2 = "";
                break;
            case 3181382:
                strategyReqGroup2 = strategyReqGroupOLrzqt;
                str = "BotConfirmationSheet";
                str2 = "";
                break;
            case 1165749981:
                if (ordType.equals("recurring")) {
                    RecurringOrderData recurringOrderData = strategyReqGroupOLrzqt.getRecurringOrderData();
                    if (recurringOrderData != null) {
                        final RecurringOrderData recurringOrderDataCopy = recurringOrderData.copy((16371 & 1) != 0 ? recurringOrderData.recurringList : null, (16371 & 2) != 0 ? recurringOrderData.stgyName : null, (16371 & 4) != 0 ? recurringOrderData.period : C33129mqd.gEmmrt(C56443yFo.AEQbTJ(RecurringCycleConfigNew.Companion.OLrzqt(recurringOrderData.getPeriod()))), (16371 & 8) != 0 ? recurringOrderData.recurringDay : Intrinsics.EZpvd((Object) recurringOrderData.getPeriod(), (Object) "hourly") ? C33129mqd.gEmmrt(C56443yFo.AEQbTJ(RecurringHourlyConfig.Companion.OLrzqt(recurringOrderData.getRecurringHour()))) : C33129mqd.gEmmrt(C56443yFo.AEQbTJ(C56548yJl.copydefault(C33129mqd.AhwBna(recurringOrderData.getRecurringDay()) - 1, 0))), (16371 & 16) != 0 ? recurringOrderData.recurringTime : null, (16371 & 32) != 0 ? recurringOrderData.recurringHour : null, (16371 & 64) != 0 ? recurringOrderData.timeZone : null, (16371 & 128) != 0 ? recurringOrderData.amt : null, (16371 & 256) != 0 ? recurringOrderData.investCcy : null, (16371 & 512) != 0 ? recurringOrderData.tdMode : null, (16371 & 1024) != 0 ? recurringOrderData.sourceAlgoId : null, (16371 & 2048) != 0 ? recurringOrderData.tradeQuoteCcy : null, (16371 & 4096) != 0 ? recurringOrderData.availableAccountList : null, (16371 & 8192) != 0 ? recurringOrderData.recurringTimeType : null);
                        if (recurringOrderDataCopy != null) {
                            BotOrderConfirmFragment.TaskDescription taskDescription = BotOrderConfirmFragment.Companion;
                            String instId = this.$currentBotInfo.getInstId();
                            String instType = this.$currentBotInfo.getInstType();
                            StrategyReqGroup strategyReqGroupCopy = strategyReqGroupOLrzqt.copy((32511 & 1) != 0 ? strategyReqGroupOLrzqt.baseReq : null, (32511 & 2) != 0 ? strategyReqGroupOLrzqt.iceBergReq : null, (32511 & 4) != 0 ? strategyReqGroupOLrzqt.twapReq : null, (32511 & 8) != 0 ? strategyReqGroupOLrzqt.gridReq : null, (32511 & 16) != 0 ? strategyReqGroupOLrzqt.contractGridReq : null, (32511 & 32) != 0 ? strategyReqGroupOLrzqt.movingProfitReq : null, (32511 & 64) != 0 ? strategyReqGroupOLrzqt.signalBotReq : null, (32511 & 128) != 0 ? strategyReqGroupOLrzqt.smartArbitrageReq : null, (32511 & 256) != 0 ? strategyReqGroupOLrzqt.recurringOrderData : recurringOrderDataCopy, (32511 & 512) != 0 ? strategyReqGroupOLrzqt.smartPortfolioReq : null, (32511 & 1024) != 0 ? strategyReqGroupOLrzqt.dcdReq : null, (32511 & 2048) != 0 ? strategyReqGroupOLrzqt.isQuoteSize : false, (32511 & 4096) != 0 ? strategyReqGroupOLrzqt.vipProfit : null, (32511 & 8192) != 0 ? strategyReqGroupOLrzqt.dcaRequest : null, (32511 & 16384) != 0 ? strategyReqGroupOLrzqt.aiBotReq : null);
                            final SignalCloneBottomSheet signalCloneBottomSheet5 = this.this$0;
                            BotOrderConfirmFragment botOrderConfirmFragmentCopydefault = taskDescription.copydefault(instId, instType, strategyReqGroupCopy, (248 & 8) != 0 ? false : false, (248 & 16) != 0 ? null : null, (248 & 32) != 0 ? "" : null, (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : new Function1<String, Unit>() { // from class: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$onFooterCreated$1$1.3
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                @Override // kotlin.jvm.functions.Function1
                                public /* synthetic */ Unit invoke(String str3) {
                                    OLrzqt(str3);
                                    return Unit.INSTANCE;
                                }

                                public final void OLrzqt(String str3) {
                                    Intrinsics.checkNotNullParameter(str3, "");
                                    if (Intrinsics.EZpvd((Object) str3, (Object) "price_setting")) {
                                        SignalCloneBottomSheet signalCloneBottomSheet6 = signalCloneBottomSheet5;
                                        List<CoinRatioParam> recurringList = recurringOrderDataCopy.getRecurringList();
                                        if (recurringList == null) {
                                            recurringList = yDY.AhwBna();
                                        }
                                        signalCloneBottomSheet6.EZpvd((List<CoinRatioParam>) recurringList);
                                        return;
                                    }
                                    if (Intrinsics.EZpvd((Object) str3, (Object) "coins")) {
                                        SignalCloneBottomSheet signalCloneBottomSheet7 = signalCloneBottomSheet5;
                                        List<CoinRatioParam> recurringList2 = recurringOrderDataCopy.getRecurringList();
                                        if (recurringList2 == null) {
                                            recurringList2 = yDY.AhwBna();
                                        }
                                        signalCloneBottomSheet7.OLrzqt((List<CoinRatioParam>) recurringList2);
                                    }
                                }
                            });
                            FragmentManager childFragmentManager5 = this.this$0.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager5, "");
                            C49662usl.EZpvd(botOrderConfirmFragmentCopydefault, childFragmentManager5, "BotConfirmationSheet");
                            strategyReqGroup = strategyReqGroupOLrzqt;
                            FragmentManager childFragmentManager322 = this.this$0.getChildFragmentManager();
                            LifecycleOwner viewLifecycleOwner22 = this.this$0.getViewLifecycleOwner();
                            final SignalCloneBottomSheet signalCloneBottomSheet322 = this.this$0;
                            childFragmentManager322.setFragmentResultListener("bot_order", viewLifecycleOwner22, new FragmentResultListener() { // from class: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$onFooterCreated$1$1.5
                                @Override // androidx.fragment.app.FragmentResultListener
                                public final void onFragmentResult(String str3, Bundle bundle) {
                                    Intrinsics.checkNotNullParameter(str3, "");
                                    Intrinsics.checkNotNullParameter(bundle, "");
                                    signalCloneBottomSheet322.AYXKKw().copydefault(new C53826wsn.StateListAnimator.Activity(strategyReqGroup));
                                }
                            });
                            return Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
                strategyReqGroup = strategyReqGroupOLrzqt;
                str = "BotConfirmationSheet";
                str2 = "";
                abstractC50583vTuNewInstance$default = AbstractC50583vTu.Application.newInstance$default(AbstractC50583vTu.Companion, this.$currentBotInfo.getInstId(), this.$currentBotInfo.getInstType(), strategyReqGroup, false, 8, null);
                if (abstractC50583vTuNewInstance$default != null) {
                }
                FragmentManager childFragmentManager3222 = this.this$0.getChildFragmentManager();
                LifecycleOwner viewLifecycleOwner222 = this.this$0.getViewLifecycleOwner();
                final SignalCloneBottomSheet signalCloneBottomSheet3222 = this.this$0;
                childFragmentManager3222.setFragmentResultListener("bot_order", viewLifecycleOwner222, new FragmentResultListener() { // from class: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$onFooterCreated$1$1.5
                    @Override // androidx.fragment.app.FragmentResultListener
                    public final void onFragmentResult(String str3, Bundle bundle) {
                        Intrinsics.checkNotNullParameter(str3, "");
                        Intrinsics.checkNotNullParameter(bundle, "");
                        signalCloneBottomSheet3222.AYXKKw().copydefault(new C53826wsn.StateListAnimator.Activity(strategyReqGroup));
                    }
                });
                return Unit.INSTANCE;
            case 1485620813:
                if (ordType.equals("dcd_bot")) {
                    strategyReqGroup2 = strategyReqGroupOLrzqt;
                    str = "BotConfirmationSheet";
                    str2 = "";
                    BotOrderConfirmFragment.TaskDescription taskDescription2 = BotOrderConfirmFragment.Companion;
                    String instId2 = this.$currentBotInfo.getInstId();
                    String instType2 = this.$currentBotInfo.getInstType();
                    final SignalCloneBottomSheet signalCloneBottomSheet6 = this.this$0;
                    final StrategyDetailsResponse strategyDetailsResponse = this.$currentBotInfo;
                    final StrategyReqGroup strategyReqGroup3 = strategyReqGroup2;
                    Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$onFooterCreated$1$1.2
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* synthetic */ Unit invoke(String str3) {
                            EZpvd(str3);
                            return Unit.INSTANCE;
                        }

                        public final void EZpvd(String str3) {
                            List<CoinRatioParam> listAhwBna;
                            Intrinsics.checkNotNullParameter(str3, "");
                            if (Intrinsics.EZpvd((Object) str3, (Object) "coins")) {
                                SignalCloneBottomSheet signalCloneBottomSheet7 = signalCloneBottomSheet6;
                                if (Intrinsics.EZpvd((Object) strategyDetailsResponse.getOrdType(), (Object) "smart_portfolio")) {
                                    SmartPortfolioReq smartPortfolioReq = strategyReqGroup3.getSmartPortfolioReq();
                                    listAhwBna = smartPortfolioReq != null ? smartPortfolioReq.getPortfolioList() : null;
                                    if (listAhwBna == null) {
                                        listAhwBna = yDY.AhwBna();
                                    }
                                } else {
                                    listAhwBna = yDY.AhwBna();
                                }
                                signalCloneBottomSheet7.OLrzqt((List<CoinRatioParam>) listAhwBna);
                            }
                        }
                    };
                    strategyReqGroup = strategyReqGroup3;
                    BotOrderConfirmFragment botOrderConfirmFragmentCopydefault2 = taskDescription2.copydefault(instId2, instType2, strategyReqGroup3, (248 & 8) != 0 ? false : false, (248 & 16) != 0 ? null : null, (248 & 32) != 0 ? "" : null, (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : function1);
                    FragmentManager childFragmentManager6 = this.this$0.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager6, str2);
                    C49662usl.EZpvd(botOrderConfirmFragmentCopydefault2, childFragmentManager6, str);
                    FragmentManager childFragmentManager32222 = this.this$0.getChildFragmentManager();
                    LifecycleOwner viewLifecycleOwner2222 = this.this$0.getViewLifecycleOwner();
                    final SignalCloneBottomSheet signalCloneBottomSheet32222 = this.this$0;
                    childFragmentManager32222.setFragmentResultListener("bot_order", viewLifecycleOwner2222, new FragmentResultListener() { // from class: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$onFooterCreated$1$1.5
                        @Override // androidx.fragment.app.FragmentResultListener
                        public final void onFragmentResult(String str3, Bundle bundle) {
                            Intrinsics.checkNotNullParameter(str3, "");
                            Intrinsics.checkNotNullParameter(bundle, "");
                            signalCloneBottomSheet32222.AYXKKw().copydefault(new C53826wsn.StateListAnimator.Activity(strategyReqGroup));
                        }
                    });
                    return Unit.INSTANCE;
                }
                strategyReqGroup = strategyReqGroupOLrzqt;
                str = "BotConfirmationSheet";
                str2 = "";
                abstractC50583vTuNewInstance$default = AbstractC50583vTu.Application.newInstance$default(AbstractC50583vTu.Companion, this.$currentBotInfo.getInstId(), this.$currentBotInfo.getInstType(), strategyReqGroup, false, 8, null);
                if (abstractC50583vTuNewInstance$default != null) {
                }
                FragmentManager childFragmentManager322222 = this.this$0.getChildFragmentManager();
                LifecycleOwner viewLifecycleOwner22222 = this.this$0.getViewLifecycleOwner();
                final SignalCloneBottomSheet signalCloneBottomSheet322222 = this.this$0;
                childFragmentManager322222.setFragmentResultListener("bot_order", viewLifecycleOwner22222, new FragmentResultListener() { // from class: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$onFooterCreated$1$1.5
                    @Override // androidx.fragment.app.FragmentResultListener
                    public final void onFragmentResult(String str3, Bundle bundle) {
                        Intrinsics.checkNotNullParameter(str3, "");
                        Intrinsics.checkNotNullParameter(bundle, "");
                        signalCloneBottomSheet322222.AYXKKw().copydefault(new C53826wsn.StateListAnimator.Activity(strategyReqGroup));
                    }
                });
                return Unit.INSTANCE;
            default:
                strategyReqGroup = strategyReqGroupOLrzqt;
                str = "BotConfirmationSheet";
                str2 = "";
                abstractC50583vTuNewInstance$default = AbstractC50583vTu.Application.newInstance$default(AbstractC50583vTu.Companion, this.$currentBotInfo.getInstId(), this.$currentBotInfo.getInstType(), strategyReqGroup, false, 8, null);
                if (abstractC50583vTuNewInstance$default != null) {
                }
                FragmentManager childFragmentManager3222222 = this.this$0.getChildFragmentManager();
                LifecycleOwner viewLifecycleOwner222222 = this.this$0.getViewLifecycleOwner();
                final SignalCloneBottomSheet signalCloneBottomSheet3222222 = this.this$0;
                childFragmentManager3222222.setFragmentResultListener("bot_order", viewLifecycleOwner222222, new FragmentResultListener() { // from class: com.okinc.tradingbot.impl.signalClone.ui.SignalCloneBottomSheet$onFooterCreated$1$1.5
                    @Override // androidx.fragment.app.FragmentResultListener
                    public final void onFragmentResult(String str3, Bundle bundle) {
                        Intrinsics.checkNotNullParameter(str3, "");
                        Intrinsics.checkNotNullParameter(bundle, "");
                        signalCloneBottomSheet3222222.AYXKKw().copydefault(new C53826wsn.StateListAnimator.Activity(strategyReqGroup));
                    }
                });
                return Unit.INSTANCE;
        }
    }

    public static final class Activity implements Function0<Unit> {
        public final /* synthetic */ StrategyReqGroup EZpvd;
        public final /* synthetic */ SignalCloneBottomSheet KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(SignalCloneBottomSheet signalCloneBottomSheet, StrategyReqGroup strategyReqGroup) {
            this.KWHzl = signalCloneBottomSheet;
            this.EZpvd = strategyReqGroup;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            pUU.KWHzl("SignalCloneBottomSheet", "ContractDca Start Order");
            this.KWHzl.AYXKKw().copydefault(new C53826wsn.StateListAnimator.Activity(this.EZpvd));
        }
    }

    public static final class Application implements Function0<Unit> {
        public final /* synthetic */ StrategyReqGroup AEQbTJ;
        public final /* synthetic */ SignalCloneBottomSheet OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(SignalCloneBottomSheet signalCloneBottomSheet, StrategyReqGroup strategyReqGroup) {
            this.OLrzqt = signalCloneBottomSheet;
            this.AEQbTJ = strategyReqGroup;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            pUU.KWHzl("SignalCloneBottomSheet", "SpotDca Start Order");
            this.OLrzqt.AYXKKw().copydefault(new C53826wsn.StateListAnimator.Activity(this.AEQbTJ));
        }
    }
}

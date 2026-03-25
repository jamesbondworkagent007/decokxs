package com.okinc.tradingbot.impl.share;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradingbot.impl.share.BotShareUtil$Companion$share$3;
import com.okinc.tradingbot.impl.signalClone.dto.SignalCloneCreateLinkResponse;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.bot.data.ShareData;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractActivityC33041mov;
import o.AbstractC56429yFa;
import o.C33129mqd;
import o.C53698wqR;
import o.C53734wrA;
import o.C53738wrE;
import o.C53780wru;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.wUL;
import o.yDY;

/* JADX INFO: loaded from: classes11.dex */
public final class BotShareUtil$Companion$share$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ComponentActivity $activity;
    final /* synthetic */ List<StrategyProfitResponse> $chartData;
    final /* synthetic */ boolean $isShareSelf;
    final /* synthetic */ ShareData $shareData;
    final /* synthetic */ C53780wru $shareParams;
    final /* synthetic */ boolean $shouldEnableShareToFeed;
    final /* synthetic */ TacticsData $tacticsData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotShareUtil$Companion$share$3(ShareData shareData, TacticsData tacticsData, ComponentActivity componentActivity, List<StrategyProfitResponse> list, boolean z, boolean z2, C53780wru c53780wru, Continuation<? super BotShareUtil$Companion$share$3> continuation) {
        super(2, continuation);
        this.$shareData = shareData;
        this.$tacticsData = tacticsData;
        this.$activity = componentActivity;
        this.$chartData = list;
        this.$isShareSelf = z;
        this.$shouldEnableShareToFeed = z2;
        this.$shareParams = c53780wru;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotShareUtil$Companion$share$3 botShareUtil$Companion$share$3 = new BotShareUtil$Companion$share$3(this.$shareData, this.$tacticsData, this.$activity, this.$chartData, this.$isShareSelf, this.$shouldEnableShareToFeed, this.$shareParams, continuation);
        botShareUtil$Companion$share$3.L$0 = obj;
        return botShareUtil$Companion$share$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotShareUtil$Companion$share$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ ComponentActivity EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(CoroutineExceptionHandler.Key key, ComponentActivity componentActivity) {
            super(key);
            this.EZpvd = componentActivity;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            if (th instanceof CancellationException) {
                return;
            }
            ((AbstractActivityC33041mov) this.EZpvd).dismissLoading();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC56387yDm viewModelLazy;
        String str;
        Object objKWHzl;
        InterfaceC56387yDm interfaceC56387yDm;
        String str2;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        final Function0 function0 = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String str3 = "";
            if (C33129mqd.OLrzqt((CharSequence) this.$shareData.getQrCode())) {
                ComponentActivity componentActivity = this.$activity;
                TacticsData tacticsData = this.$tacticsData;
                ShareData shareData = this.$shareData;
                List<StrategyProfitResponse> list = this.$chartData;
                boolean z = this.$isShareSelf;
                boolean z2 = this.$shouldEnableShareToFeed;
                C53780wru c53780wru = this.$shareParams;
                String qrCode = shareData.getQrCode();
                invokeSuspend$initShare(componentActivity, tacticsData, shareData, list, z, z2, c53780wru, qrCode == null ? "" : qrCode, this.$tacticsData.getDeeplink());
                return Unit.INSTANCE;
            }
            final ComponentActivity componentActivity2 = this.$activity;
            viewModelLazy = new ViewModelLazy(C56524yIo.AEQbTJ(FetchBotShareUrlPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.share.BotShareUtil$Companion$share$3$invokeSuspend$$inlined$viewModels$default$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStore invoke() {
                    ViewModelStore viewModelStore = componentActivity2.getViewModelStore();
                    Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                    return viewModelStore;
                }
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.share.BotShareUtil$Companion$share$3$invokeSuspend$$inlined$viewModels$default$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelProvider.Factory invoke() {
                    ViewModelProvider.Factory defaultViewModelProviderFactory = componentActivity2.getDefaultViewModelProviderFactory();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                    return defaultViewModelProviderFactory;
                }
            }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.share.BotShareUtil$Companion$share$3$invokeSuspend$$inlined$viewModels$default$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final CreationExtras invoke() {
                    CreationExtras creationExtras;
                    Function0 function02 = function0;
                    if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                        return creationExtras;
                    }
                    CreationExtras defaultViewModelCreationExtras = componentActivity2.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                    return defaultViewModelCreationExtras;
                }
            });
            if (!C53734wrA.Companion.EZpvd().copydefault(this.$tacticsData.getOrderType())) {
                FetchBotShareUrlPresenter fetchBotShareUrlPresenterInvokeSuspend$lambda$2 = invokeSuspend$lambda$2(viewModelLazy);
                final TacticsData tacticsData2 = this.$tacticsData;
                final ComponentActivity componentActivity3 = this.$activity;
                final ShareData shareData2 = this.$shareData;
                final List<StrategyProfitResponse> list2 = this.$chartData;
                final boolean z3 = this.$isShareSelf;
                final boolean z4 = this.$shouldEnableShareToFeed;
                final C53780wru c53780wru2 = this.$shareParams;
                fetchBotShareUrlPresenterInvokeSuspend$lambda$2.copydefault(tacticsData2, new Function2() { // from class: o.wre
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return BotShareUtil$Companion$share$3.invokeSuspend$lambda$3(componentActivity3, tacticsData2, shareData2, list2, z3, z4, c53780wru2, (java.lang.String) obj2, (java.lang.String) obj3);
                    }
                });
                return Unit.INSTANCE;
            }
            TacticsData tacticsData3 = this.$tacticsData;
            try {
                Result.Application application = Result.Companion;
                C53738wrE c53738wrEAEQbTJ = C53738wrE.Companion.AEQbTJ();
                String algoId = tacticsData3.getAlgoId();
                String orderType = tacticsData3.getOrderType();
                String copyType = tacticsData3.getCopyType();
                String str4 = copyType == null ? "" : copyType;
                String instId = tacticsData3.getInstId();
                if (instId.length() == 0) {
                    String orderType2 = tacticsData3.getOrderType();
                    if (!Intrinsics.EZpvd((Object) orderType2, (Object) "recurring")) {
                        if (Intrinsics.EZpvd((Object) orderType2, (Object) "smart_portfolio")) {
                            Iterable hoardItemList = tacticsData3.getHoardItemList();
                            if (hoardItemList == null) {
                                hoardItemList = yDY.AhwBna();
                            }
                            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(hoardItemList, 10));
                            Iterator it = hoardItemList.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((SmartPortfolioListItem) it.next()).getCcy());
                            }
                            str2 = (String) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                        } else {
                            str2 = null;
                        }
                    } else {
                        Iterable recItemList = tacticsData3.getRecItemList();
                        if (recItemList == null) {
                            recItemList = yDY.AhwBna();
                        }
                        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(recItemList, 10));
                        Iterator it2 = recItemList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((RecurringListItem) it2.next()).getCcy());
                        }
                        str2 = (String) CollectionsKt___CollectionsKt.firstOrNull(arrayList2);
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    String investCcy = tacticsData3.getInvestCcy();
                    if (investCcy == null) {
                        investCcy = "";
                    }
                    if (investCcy.length() == 0) {
                        String ccy = tacticsData3.getCcy();
                        if (ccy != null) {
                            str3 = ccy;
                        }
                        investCcy = str3;
                    }
                    if (investCcy.length() == 0) {
                        investCcy = tacticsData3.getTradeQuoteCcy();
                    }
                    str = str2 + "-" + ((Object) investCcy);
                } else {
                    str = instId;
                }
                C53738wrE.ActionBar actionBar = new C53738wrE.ActionBar(algoId, orderType, str4, str, tacticsData3.getInstType());
                this.L$0 = viewModelLazy;
                this.label = 1;
                objKWHzl = c53738wrEAEQbTJ.KWHzl(actionBar, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                interfaceC56387yDm = viewModelLazy;
                objM7377constructorimpl = Result.m7377constructorimpl((SignalCloneCreateLinkResponse) objKWHzl);
            } catch (Throwable th) {
                th = th;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                interfaceC56387yDm = viewModelLazy;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            interfaceC56387yDm = (InterfaceC56387yDm) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
                objM7377constructorimpl = Result.m7377constructorimpl((SignalCloneCreateLinkResponse) objKWHzl);
            } catch (Throwable th2) {
                th = th2;
                viewModelLazy = interfaceC56387yDm;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                interfaceC56387yDm = viewModelLazy;
            }
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        SignalCloneCreateLinkResponse signalCloneCreateLinkResponse = (SignalCloneCreateLinkResponse) objM7377constructorimpl;
        if (signalCloneCreateLinkResponse != null) {
            this.$tacticsData.setDeeplink(signalCloneCreateLinkResponse.OLrzqt());
            this.$shareData.setQrCode(signalCloneCreateLinkResponse.AEQbTJ());
            C53698wqR.TaskDescription taskDescription = C53698wqR.Companion;
            AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) this.$activity;
            String strKWHzl = signalCloneCreateLinkResponse.KWHzl();
            TacticsData tacticsData4 = this.$tacticsData;
            List<StrategyProfitResponse> list3 = this.$chartData;
            boolean z5 = this.$isShareSelf;
            boolean z6 = this.$shouldEnableShareToFeed;
            C53780wru c53780wru3 = this.$shareParams;
            this.L$0 = null;
            this.label = 2;
            if (taskDescription.OLrzqt(abstractActivityC33041mov, tacticsData4, list3, z5, z6, strKWHzl, true, c53780wru3, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            FetchBotShareUrlPresenter fetchBotShareUrlPresenterInvokeSuspend$lambda$22 = invokeSuspend$lambda$2(interfaceC56387yDm);
            final TacticsData tacticsData5 = this.$tacticsData;
            final ComponentActivity componentActivity4 = this.$activity;
            final ShareData shareData3 = this.$shareData;
            final List<StrategyProfitResponse> list4 = this.$chartData;
            final boolean z7 = this.$isShareSelf;
            final boolean z8 = this.$shouldEnableShareToFeed;
            final C53780wru c53780wru4 = this.$shareParams;
            fetchBotShareUrlPresenterInvokeSuspend$lambda$22.copydefault(tacticsData5, new Function2() { // from class: o.wrc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return BotShareUtil$Companion$share$3.invokeSuspend$lambda$10(componentActivity4, tacticsData5, shareData3, list4, z7, z8, c53780wru4, (java.lang.String) obj2, (java.lang.String) obj3);
                }
            });
        }
        return Unit.INSTANCE;
    }

    private static final void invokeSuspend$initShare(final ComponentActivity componentActivity, final TacticsData tacticsData, final ShareData shareData, final List<StrategyProfitResponse> list, final boolean z, final boolean z2, final C53780wru c53780wru, String str, final String str2) {
        C53698wqR.Companion.AEQbTJ((AbstractActivityC33041mov) componentActivity, str, str2, new Function1() { // from class: o.wrf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BotShareUtil$Companion$share$3.invokeSuspend$initShare$lambda$1(tacticsData, str2, shareData, componentActivity, list, z, z2, c53780wru, (java.lang.String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$initShare$lambda$1(TacticsData tacticsData, String str, ShareData shareData, ComponentActivity componentActivity, List list, boolean z, boolean z2, C53780wru c53780wru, String str2) {
        tacticsData.setDeeplink(str);
        shareData.setQrCode(str2);
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(componentActivity), Dispatchers.getMain().plus(new TaskDescription(CoroutineExceptionHandler.Key, componentActivity)), null, new BotShareUtil$Companion$share$3$initShare$1$2(componentActivity, tacticsData, list, z, z2, c53780wru, null), 2, null);
        return Unit.INSTANCE;
    }

    private static final FetchBotShareUrlPresenter invokeSuspend$lambda$2(InterfaceC56387yDm<FetchBotShareUrlPresenter> interfaceC56387yDm) {
        return interfaceC56387yDm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3(ComponentActivity componentActivity, TacticsData tacticsData, ShareData shareData, List list, boolean z, boolean z2, C53780wru c53780wru, String str, String str2) {
        invokeSuspend$initShare(componentActivity, tacticsData, shareData, list, z, z2, c53780wru, str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$10(ComponentActivity componentActivity, TacticsData tacticsData, ShareData shareData, List list, boolean z, boolean z2, C53780wru c53780wru, String str, String str2) {
        invokeSuspend$initShare(componentActivity, tacticsData, shareData, list, z, z2, c53780wru, str, str2);
        return Unit.INSTANCE;
    }
}

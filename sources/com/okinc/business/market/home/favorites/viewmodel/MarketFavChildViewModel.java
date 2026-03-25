package com.okinc.business.market.home.favorites.viewmodel;

import com.okinc.business.market.home.favorites.viewmodel.MarketFavChildViewModel;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC49408unw;
import o.AbstractC49411unz;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.kER;
import o.pUU;
import o.qWH;
import o.qWM;
import o.qWT;
import o.qWV;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavChildViewModel extends AbstractC49411unz<ActionBar> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final qWT AEQbTJ;
    public final kER EZpvd;
    public String KWHzl;
    public final qWV OLrzqt;
    public final qWM djBIcL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public MarketFavChildViewModel(@NotNull qWM qwm, @NotNull qWV qwv, @NotNull kER ker, @NotNull qWT qwt) {
        super(new ActionBar(new InterfaceC49371unL.ActionBar(null, 1, null)));
        Intrinsics.checkNotNullParameter(qwm, "");
        Intrinsics.checkNotNullParameter(qwv, "");
        Intrinsics.checkNotNullParameter(ker, "");
        Intrinsics.checkNotNullParameter(qwt, "");
        this.djBIcL = qwm;
        this.OLrzqt = qwv;
        this.EZpvd = ker;
        this.AEQbTJ = qwt;
        this.KWHzl = "ALL";
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.home.favorites.viewmodel.MarketFavChildViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final class ActionBar extends AbstractC49408unw<ActionBar> {
        public InterfaceC49371unL<? extends Pair<? extends List<? extends qWH>, String>> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.home.favorites.viewmodel.MarketFavChildViewModel$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, InterfaceC49371unL interfaceC49371unL, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC49371unL = actionBar.EZpvd;
            }
            return actionBar.KWHzl((InterfaceC49371unL<? extends Pair<? extends List<? extends qWH>, String>>) interfaceC49371unL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends kotlin.Pair<? extends java.util.List<? extends o.qWH>, java.lang.String>>, o.unL<kotlin.Pair<java.util.List<o.qWH>, java.lang.String>> */
        public final InterfaceC49371unL<Pair<List<qWH>, String>> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull InterfaceC49371unL<? extends Pair<? extends List<? extends qWH>, String>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.EZpvd = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull InterfaceC49371unL<? extends Pair<? extends List<? extends qWH>, String>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            return new ActionBar(interfaceC49371unL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.EZpvd, ((ActionBar) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "GroupWatchChildUIState(datas=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull InterfaceC49371unL<? extends Pair<? extends List<? extends qWH>, String>> interfaceC49371unL) {
            super(new Function1() { // from class: o.kEP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MarketFavChildViewModel.ActionBar.KWHzl((MarketFavChildViewModel.ActionBar) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.EZpvd = interfaceC49371unL;
        }

        public static final ActionBar KWHzl(ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            return copy$default(actionBar, null, 1, null);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x007b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0028 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, o.unz] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.okinc.business.market.home.favorites.viewmodel.MarketFavChildViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        MarketFavChildViewModel$loadData$1 marketFavChildViewModel$loadData$1;
        Object objM7377constructorimpl;
        ?? r12;
        Throwable thM7380exceptionOrNullimpl;
        ?? r2;
        MarketFavChildViewModel marketFavChildViewModel;
        MarketFavChildViewModel marketFavChildViewModel2;
        if (continuation instanceof MarketFavChildViewModel$loadData$1) {
            marketFavChildViewModel$loadData$1 = (MarketFavChildViewModel$loadData$1) continuation;
            int i = marketFavChildViewModel$loadData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketFavChildViewModel$loadData$1.label = i - Integer.MIN_VALUE;
            } else {
                marketFavChildViewModel$loadData$1 = new MarketFavChildViewModel$loadData$1(this, continuation);
            }
        }
        Object objEZpvd = marketFavChildViewModel$loadData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketFavChildViewModel$loadData$1.label;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pUU.KWHzl("MarketFavChildViewModel", "loadData: [clue]: " + ((String) str2) + ", type=" + str + " start");
            try {
                Result.Application application = Result.Companion;
                qWM qwm = this.djBIcL;
                marketFavChildViewModel$loadData$1.L$0 = this;
                marketFavChildViewModel$loadData$1.L$1 = str;
                marketFavChildViewModel$loadData$1.label = 1;
                if (qwm.AEQbTJ(marketFavChildViewModel$loadData$1) == objCopydefault) {
                    return objCopydefault;
                }
                marketFavChildViewModel = this;
            } catch (Throwable th2) {
                th = th2;
                str2 = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                r12 = str2;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    str = (String) marketFavChildViewModel$loadData$1.L$1;
                    MarketFavChildViewModel marketFavChildViewModel3 = (MarketFavChildViewModel) marketFavChildViewModel$loadData$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    marketFavChildViewModel2 = marketFavChildViewModel3;
                    pUU.KWHzl("MarketFavChildViewModel", "get flow of groupWatchListSubscribeUseCase");
                    kER ker = marketFavChildViewModel2.EZpvd;
                    marketFavChildViewModel$loadData$1.L$0 = marketFavChildViewModel2;
                    marketFavChildViewModel$loadData$1.L$1 = str;
                    marketFavChildViewModel$loadData$1.label = 3;
                    objEZpvd = ker.EZpvd((Flow) objEZpvd, marketFavChildViewModel$loadData$1);
                    str2 = marketFavChildViewModel2;
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    Flow flowConflate = FlowKt.conflate((Flow) objEZpvd);
                    pUU.KWHzl("MarketFavChildViewModel", "loadData: get favVoFlow，type=" + str);
                    objM7377constructorimpl = Result.m7377constructorimpl(flowConflate);
                    r12 = str2;
                    ?? r22 = r12;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    r2 = r22;
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    }
                    pUU.KWHzl("MarketFavChildViewModel", "loadData: " + str + " end");
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) marketFavChildViewModel$loadData$1.L$0;
                        C56391yDq.AEQbTJ(objEZpvd);
                        pUU.KWHzl("MarketFavChildViewModel", "loadData: " + str + " end");
                        return Unit.INSTANCE;
                    }
                    Object obj = marketFavChildViewModel$loadData$1.L$2;
                    String str3 = (String) marketFavChildViewModel$loadData$1.L$1;
                    MarketFavChildViewModel marketFavChildViewModel4 = (MarketFavChildViewModel) marketFavChildViewModel$loadData$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    objM7377constructorimpl = obj;
                    str = str3;
                    r2 = marketFavChildViewModel4;
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                        pUU.KWHzl("MarketFavChildViewModel", "loadData: 开始处理flow，type=" + str);
                        Flow flowM7441catch = FlowKt.m7441catch(FlowKt.retryWhen(FlowKt.onCompletion(FlowKt.conflate((Flow) objM7377constructorimpl), new MarketFavChildViewModel$loadData$4$1(str, null)), new MarketFavChildViewModel$loadData$4$2(str, null)), new MarketFavChildViewModel$loadData$4$3(str, null));
                        MarketFavChildViewModel$loadData$4$4 marketFavChildViewModel$loadData$4$4 = new MarketFavChildViewModel$loadData$4$4(str, r2, null);
                        marketFavChildViewModel$loadData$1.L$0 = str;
                        marketFavChildViewModel$loadData$1.L$1 = objM7377constructorimpl;
                        marketFavChildViewModel$loadData$1.L$2 = null;
                        marketFavChildViewModel$loadData$1.label = 5;
                        if (FlowKt.collectLatest(flowM7441catch, marketFavChildViewModel$loadData$4$4, marketFavChildViewModel$loadData$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    pUU.KWHzl("MarketFavChildViewModel", "loadData: " + str + " end");
                    return Unit.INSTANCE;
                }
                str = (String) marketFavChildViewModel$loadData$1.L$1;
                MarketFavChildViewModel marketFavChildViewModel5 = (MarketFavChildViewModel) marketFavChildViewModel$loadData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                str2 = marketFavChildViewModel5;
                Flow flowConflate2 = FlowKt.conflate((Flow) objEZpvd);
                pUU.KWHzl("MarketFavChildViewModel", "loadData: get favVoFlow，type=" + str);
                objM7377constructorimpl = Result.m7377constructorimpl(flowConflate2);
                r12 = str2;
                ?? r222 = r12;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                r2 = r222;
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("MarketFavChildViewModel", "loadData: error, type=" + str, thM7380exceptionOrNullimpl);
                    if (thM7380exceptionOrNullimpl instanceof CancellationException) {
                        pUU.AEQbTJ("MarketFavChildViewModel", "loadData: error catched, type=" + str, thM7380exceptionOrNullimpl);
                        r2 = r222;
                    } else {
                        MarketFavChildViewModel$loadData$3$1 marketFavChildViewModel$loadData$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.home.favorites.viewmodel.MarketFavChildViewModel$loadData$3$1
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj2) {
                                return ((MarketFavChildViewModel.ActionBar) obj2).EZpvd();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj2, Object obj3) {
                                ((MarketFavChildViewModel.ActionBar) obj2).EZpvd((InterfaceC49371unL) obj3);
                            }
                        };
                        InterfaceC49371unL.Application application3 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                        marketFavChildViewModel$loadData$1.L$0 = r222;
                        marketFavChildViewModel$loadData$1.L$1 = str;
                        marketFavChildViewModel$loadData$1.L$2 = objM7377constructorimpl;
                        marketFavChildViewModel$loadData$1.label = 4;
                        Object objKWHzl = r222.KWHzl(marketFavChildViewModel$loadData$3$1, application3, marketFavChildViewModel$loadData$1);
                        r2 = r222;
                        if (objKWHzl == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                pUU.KWHzl("MarketFavChildViewModel", "loadData: " + str + " end");
                return Unit.INSTANCE;
            }
            str = (String) marketFavChildViewModel$loadData$1.L$1;
            MarketFavChildViewModel marketFavChildViewModel6 = (MarketFavChildViewModel) marketFavChildViewModel$loadData$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            marketFavChildViewModel = marketFavChildViewModel6;
        }
        marketFavChildViewModel.KWHzl = str;
        qWV qwv = marketFavChildViewModel.OLrzqt;
        marketFavChildViewModel$loadData$1.L$0 = marketFavChildViewModel;
        marketFavChildViewModel$loadData$1.L$1 = str;
        marketFavChildViewModel$loadData$1.label = 2;
        objEZpvd = qwv.EZpvd(str, (Continuation) marketFavChildViewModel$loadData$1);
        marketFavChildViewModel2 = marketFavChildViewModel;
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        pUU.KWHzl("MarketFavChildViewModel", "get flow of groupWatchListSubscribeUseCase");
        kER ker2 = marketFavChildViewModel2.EZpvd;
        marketFavChildViewModel$loadData$1.L$0 = marketFavChildViewModel2;
        marketFavChildViewModel$loadData$1.L$1 = str;
        marketFavChildViewModel$loadData$1.label = 3;
        objEZpvd = ker2.EZpvd((Flow) objEZpvd, marketFavChildViewModel$loadData$1);
        str2 = marketFavChildViewModel2;
        if (objEZpvd == objCopydefault) {
        }
        Flow flowConflate22 = FlowKt.conflate((Flow) objEZpvd);
        pUU.KWHzl("MarketFavChildViewModel", "loadData: get favVoFlow，type=" + str);
        objM7377constructorimpl = Result.m7377constructorimpl(flowConflate22);
        r12 = str2;
        ?? r2222 = r12;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        r2 = r2222;
        if (thM7380exceptionOrNullimpl != null) {
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        pUU.KWHzl("MarketFavChildViewModel", "loadData: " + str + " end");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(List<WatchListData> list, @NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        MarketFavChildViewModel$updateSort$1 marketFavChildViewModel$updateSort$1;
        if (continuation instanceof MarketFavChildViewModel$updateSort$1) {
            marketFavChildViewModel$updateSort$1 = (MarketFavChildViewModel$updateSort$1) continuation;
            int i = marketFavChildViewModel$updateSort$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketFavChildViewModel$updateSort$1.label = i - Integer.MIN_VALUE;
            } else {
                marketFavChildViewModel$updateSort$1 = new MarketFavChildViewModel$updateSort$1(this, continuation);
            }
        }
        Object obj = marketFavChildViewModel$updateSort$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketFavChildViewModel$updateSort$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                if (list == null || list.isEmpty()) {
                    return Unit.INSTANCE;
                }
                Result.Application application = Result.Companion;
                qWT qwt = this.AEQbTJ;
                Pair pairOLrzqt = C56390yDp.OLrzqt(list, str);
                marketFavChildViewModel$updateSort$1.label = 1;
                if (qwt.EZpvd(pairOLrzqt, marketFavChildViewModel$updateSort$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }
}

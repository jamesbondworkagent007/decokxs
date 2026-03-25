package com.okinc.business.market.watch.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinWatchInstrument;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC49411unz;
import o.C27996kLa;
import o.C27997kLb;
import o.C33070mpX;
import o.C40483qXn;
import o.C55326xho;
import o.C55686xod;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC49371unL;
import o.pUU;
import o.qWJ;
import o.qWM;
import o.qWQ;
import o.qWX;
import o.qZH;
import o.xUD;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListViewModel extends AbstractC49411unz<C27996kLa> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = (qWX.copydefault | C40483qXn.copydefault) | qWM.KWHzl;
    public final qWM AEQbTJ;
    public final C40483qXn OLrzqt;
    public final qWX copydefault;

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.watch.ui.viewmodel.GroupWatchListViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public GroupWatchListViewModel(@NotNull qWM qwm, @NotNull C40483qXn c40483qXn, @NotNull qWX qwx) {
        super(new C27996kLa(null, null, null, 7, null));
        Intrinsics.checkNotNullParameter(qwm, "");
        Intrinsics.checkNotNullParameter(c40483qXn, "");
        Intrinsics.checkNotNullParameter(qwx, "");
        this.AEQbTJ = qwm;
        this.OLrzqt = c40483qXn;
        this.copydefault = qwx;
    }

    public final void EZpvd(int i) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupWatchListViewModel$userSelectTab$1(this, i, null), 3, null);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x0058 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:80:0x0024 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v17, resolved type: kotlin.Unit */
    /* JADX DEBUG: Multi-variable search result rejected for r4v18, resolved type: kotlin.Unit */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: kotlin.Unit */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        GroupWatchListViewModel$loadGroupData$1 groupWatchListViewModel$loadGroupData$1;
        GroupWatchListViewModel groupWatchListViewModel;
        Object obj;
        Object objM7377constructorimpl;
        Unit unit;
        Flow flow;
        GroupWatchListViewModel groupWatchListViewModel2;
        qWM qwm;
        Object objM7377constructorimpl2;
        Throwable thM7380exceptionOrNullimpl;
        Object objEZpvd;
        Object obj2;
        Flow flowDistinctUntilChanged;
        if (continuation instanceof GroupWatchListViewModel$loadGroupData$1) {
            groupWatchListViewModel$loadGroupData$1 = (GroupWatchListViewModel$loadGroupData$1) continuation;
            int i = groupWatchListViewModel$loadGroupData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupWatchListViewModel$loadGroupData$1.label = i - Integer.MIN_VALUE;
            } else {
                groupWatchListViewModel$loadGroupData$1 = new GroupWatchListViewModel$loadGroupData$1(this, continuation);
            }
        }
        Object objEZpvd2 = groupWatchListViewModel$loadGroupData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        Object obj3 = "GroupWatchListViewModel";
        try {
        } catch (Throwable th) {
            th = th;
        }
        switch (groupWatchListViewModel$loadGroupData$1.label) {
            case 0:
                C56391yDq.AEQbTJ(objEZpvd2);
                pUU.KWHzl("GroupWatchListViewModel", "loadGroupData start");
                try {
                    Result.Application application = Result.Companion;
                    qwm = this.AEQbTJ;
                    groupWatchListViewModel$loadGroupData$1.L$0 = this;
                    groupWatchListViewModel$loadGroupData$1.label = 1;
                    break;
                } catch (Throwable th2) {
                    th = th2;
                    groupWatchListViewModel2 = this;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (qwm.AEQbTJ(groupWatchListViewModel$loadGroupData$1) == objCopydefault) {
                    return objCopydefault;
                }
                groupWatchListViewModel2 = this;
                objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
                obj = objM7377constructorimpl2;
                groupWatchListViewModel = groupWatchListViewModel2;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                if (thM7380exceptionOrNullimpl != null) {
                    if (thM7380exceptionOrNullimpl instanceof CancellationException) {
                        pUU.KWHzl("GroupWatchListViewModel", "watchBizRep initWatchBiz has catched error " + thM7380exceptionOrNullimpl);
                    } else {
                        GroupWatchListViewModel$loadGroupData$3$1 groupWatchListViewModel$loadGroupData$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.watch.ui.viewmodel.GroupWatchListViewModel$loadGroupData$3$1
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj4) {
                                return ((C27996kLa) obj4).KWHzl();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj4, Object obj5) {
                                ((C27996kLa) obj4).OLrzqt((InterfaceC49371unL<C27997kLb>) obj5);
                            }
                        };
                        InterfaceC49371unL.Application application3 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                        groupWatchListViewModel$loadGroupData$1.L$0 = groupWatchListViewModel;
                        groupWatchListViewModel$loadGroupData$1.L$1 = obj;
                        groupWatchListViewModel$loadGroupData$1.L$2 = thM7380exceptionOrNullimpl;
                        groupWatchListViewModel$loadGroupData$1.label = 2;
                        if (groupWatchListViewModel.KWHzl(groupWatchListViewModel$loadGroupData$3$1, application3, groupWatchListViewModel$loadGroupData$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        pUU.KWHzl("GroupWatchListViewModel", "watchBizRep initWatchBiz error " + thM7380exceptionOrNullimpl);
                    }
                }
                if (Result.m7384isSuccessimpl(obj)) {
                    Object obj4 = (Unit) obj;
                    pUU.KWHzl("GroupWatchListViewModel", "watchBizRep initWatchBiz success");
                    try {
                        Result.Application application4 = Result.Companion;
                        C40483qXn c40483qXn = groupWatchListViewModel.OLrzqt;
                        Boolean boolKWHzl = C56443yFo.KWHzl(false);
                        groupWatchListViewModel$loadGroupData$1.L$0 = groupWatchListViewModel;
                        groupWatchListViewModel$loadGroupData$1.L$1 = obj;
                        groupWatchListViewModel$loadGroupData$1.L$2 = obj4;
                        groupWatchListViewModel$loadGroupData$1.label = 3;
                        objEZpvd = c40483qXn.EZpvd(boolKWHzl, groupWatchListViewModel$loadGroupData$1);
                    } catch (Throwable th3) {
                        obj3 = obj4;
                        th = th3;
                        Result.Application application5 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        unit = obj3;
                    }
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = obj4;
                    objEZpvd2 = objEZpvd;
                    flowDistinctUntilChanged = FlowKt.distinctUntilChanged((Flow) objEZpvd2);
                    qWX qwx = groupWatchListViewModel.copydefault;
                    Unit unit2 = Unit.INSTANCE;
                    groupWatchListViewModel$loadGroupData$1.L$0 = groupWatchListViewModel;
                    groupWatchListViewModel$loadGroupData$1.L$1 = obj;
                    groupWatchListViewModel$loadGroupData$1.L$2 = obj2;
                    groupWatchListViewModel$loadGroupData$1.L$3 = flowDistinctUntilChanged;
                    groupWatchListViewModel$loadGroupData$1.label = 4;
                    objEZpvd2 = qwx.EZpvd(unit2, groupWatchListViewModel$loadGroupData$1);
                    obj3 = obj2;
                    if (objEZpvd2 == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(FlowKt.flowCombine(flowDistinctUntilChanged, FlowKt.distinctUntilChanged((Flow) objEZpvd2), new GroupWatchListViewModel$loadGroupData$4$flow$1$1(null)));
                    unit = obj3;
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = null;
                    }
                    flow = (Flow) objM7377constructorimpl;
                    if (flow == null) {
                        GroupWatchListViewModel$loadGroupData$4$1 groupWatchListViewModel$loadGroupData$4$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.watch.ui.viewmodel.GroupWatchListViewModel$loadGroupData$4$1
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj5) {
                                return ((C27996kLa) obj5).KWHzl();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj5, Object obj6) {
                                ((C27996kLa) obj5).OLrzqt((InterfaceC49371unL<C27997kLb>) obj6);
                            }
                        };
                        InterfaceC49371unL.Application application6 = new InterfaceC49371unL.Application(new NullPointerException("flow is null"), null, 2, null);
                        groupWatchListViewModel$loadGroupData$1.L$0 = obj;
                        groupWatchListViewModel$loadGroupData$1.L$1 = null;
                        groupWatchListViewModel$loadGroupData$1.L$2 = null;
                        groupWatchListViewModel$loadGroupData$1.L$3 = null;
                        groupWatchListViewModel$loadGroupData$1.label = 5;
                        if (groupWatchListViewModel.KWHzl(groupWatchListViewModel$loadGroupData$4$1, application6, groupWatchListViewModel$loadGroupData$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        Flow flowOnCompletion = FlowKt.onCompletion(FlowKt.m7441catch(flow, new GroupWatchListViewModel$loadGroupData$4$2(unit, groupWatchListViewModel, null)), new GroupWatchListViewModel$loadGroupData$4$3(null));
                        GroupWatchListViewModel$loadGroupData$4$4 groupWatchListViewModel$loadGroupData$4$4 = new GroupWatchListViewModel$loadGroupData$4$4(groupWatchListViewModel, null);
                        groupWatchListViewModel$loadGroupData$1.L$0 = obj;
                        groupWatchListViewModel$loadGroupData$1.L$1 = null;
                        groupWatchListViewModel$loadGroupData$1.L$2 = null;
                        groupWatchListViewModel$loadGroupData$1.L$3 = null;
                        groupWatchListViewModel$loadGroupData$1.label = 6;
                        if (FlowKt.collectLatest(flowOnCompletion, groupWatchListViewModel$loadGroupData$4$4, groupWatchListViewModel$loadGroupData$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    break;
                }
                return Unit.INSTANCE;
            case 1:
                groupWatchListViewModel2 = (GroupWatchListViewModel) groupWatchListViewModel$loadGroupData$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objEZpvd2);
                    objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
                    break;
                } catch (Throwable th4) {
                    th = th4;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                obj = objM7377constructorimpl2;
                groupWatchListViewModel = groupWatchListViewModel2;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                if (thM7380exceptionOrNullimpl != null) {
                }
                if (Result.m7384isSuccessimpl(obj)) {
                }
                return Unit.INSTANCE;
            case 2:
                thM7380exceptionOrNullimpl = (Throwable) groupWatchListViewModel$loadGroupData$1.L$2;
                obj = groupWatchListViewModel$loadGroupData$1.L$1;
                groupWatchListViewModel = (GroupWatchListViewModel) groupWatchListViewModel$loadGroupData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd2);
                pUU.KWHzl("GroupWatchListViewModel", "watchBizRep initWatchBiz error " + thM7380exceptionOrNullimpl);
                if (Result.m7384isSuccessimpl(obj)) {
                }
                return Unit.INSTANCE;
            case 3:
                Object obj5 = (Unit) groupWatchListViewModel$loadGroupData$1.L$2;
                obj = groupWatchListViewModel$loadGroupData$1.L$1;
                groupWatchListViewModel = (GroupWatchListViewModel) groupWatchListViewModel$loadGroupData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd2);
                obj2 = obj5;
                flowDistinctUntilChanged = FlowKt.distinctUntilChanged((Flow) objEZpvd2);
                qWX qwx2 = groupWatchListViewModel.copydefault;
                Unit unit22 = Unit.INSTANCE;
                groupWatchListViewModel$loadGroupData$1.L$0 = groupWatchListViewModel;
                groupWatchListViewModel$loadGroupData$1.L$1 = obj;
                groupWatchListViewModel$loadGroupData$1.L$2 = obj2;
                groupWatchListViewModel$loadGroupData$1.L$3 = flowDistinctUntilChanged;
                groupWatchListViewModel$loadGroupData$1.label = 4;
                objEZpvd2 = qwx2.EZpvd(unit22, groupWatchListViewModel$loadGroupData$1);
                obj3 = obj2;
                if (objEZpvd2 == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(FlowKt.flowCombine(flowDistinctUntilChanged, FlowKt.distinctUntilChanged((Flow) objEZpvd2), new GroupWatchListViewModel$loadGroupData$4$flow$1$1(null)));
                unit = obj3;
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                flow = (Flow) objM7377constructorimpl;
                if (flow == null) {
                }
                return Unit.INSTANCE;
            case 4:
                flowDistinctUntilChanged = (Flow) groupWatchListViewModel$loadGroupData$1.L$3;
                Object obj6 = (Unit) groupWatchListViewModel$loadGroupData$1.L$2;
                obj = groupWatchListViewModel$loadGroupData$1.L$1;
                groupWatchListViewModel = (GroupWatchListViewModel) groupWatchListViewModel$loadGroupData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd2);
                obj3 = obj6;
                objM7377constructorimpl = Result.m7377constructorimpl(FlowKt.flowCombine(flowDistinctUntilChanged, FlowKt.distinctUntilChanged((Flow) objEZpvd2), new GroupWatchListViewModel$loadGroupData$4$flow$1$1(null)));
                unit = obj3;
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                flow = (Flow) objM7377constructorimpl;
                if (flow == null) {
                }
                return Unit.INSTANCE;
            case 5:
            case 6:
                C56391yDq.AEQbTJ(objEZpvd2);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(CoinQuote coinQuote, @NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        GroupWatchListViewModel$unStar$1 groupWatchListViewModel$unStar$1;
        Object objM7377constructorimpl;
        String message;
        if (continuation instanceof GroupWatchListViewModel$unStar$1) {
            groupWatchListViewModel$unStar$1 = (GroupWatchListViewModel$unStar$1) continuation;
            int i = groupWatchListViewModel$unStar$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupWatchListViewModel$unStar$1.label = i - Integer.MIN_VALUE;
            } else {
                groupWatchListViewModel$unStar$1 = new GroupWatchListViewModel$unStar$1(this, continuation);
            }
        }
        Object obj = groupWatchListViewModel$unStar$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupWatchListViewModel$unStar$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                if (coinQuote == null) {
                    return Unit.INSTANCE;
                }
                BizInstrument bizInstrumentKWHzl = KWHzl(coinQuote.getInstId(), coinQuote.getInstType());
                if (bizInstrumentKWHzl == null) {
                    return Unit.INSTANCE;
                }
                Result.Application application = Result.Companion;
                qWQ qwqOLrzqt = this.OLrzqt.OLrzqt();
                List<MarketUserFavorite> listEZpvd = C56402yEa.EZpvd(qWJ.EZpvd(bizInstrumentKWHzl, C55686xod.KWHzl()));
                groupWatchListViewModel$unStar$1.label = 1;
                if (qwqOLrzqt.copydefault(listEZpvd, str, groupWatchListViewModel$unStar$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(qZH.PendingIntent.gHZMYf), 0, 1, (Object) null);
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null && (message = thM7380exceptionOrNullimpl.getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    private final BizInstrument KWHzl(String str, String str2) {
        return Intrinsics.EZpvd((Object) str2, (Object) "COIN") ? new CoinWatchInstrument(str, str2) : xUD.getWatchMarketInstrument$default(str2, str, null, null, false, 28, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("GroupWatchListViewModel", "selectPendingTab " + str + " called ");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GroupWatchListViewModel$selectPendingTab$1(str, this, null), 3, null);
    }
}

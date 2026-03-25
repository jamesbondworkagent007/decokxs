package com.okinc.business.market.market.fragment.watchlist;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.market.fragment.watchlist.GroupWatchListChildViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.widget.SortTextView;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC49408unw;
import o.AbstractC49411unz;
import o.C27985kKq;
import o.C27989kKu;
import o.C32866mlf;
import o.C40431qVp;
import o.C40470qXa;
import o.C41301qoI;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.pUU;
import o.qWJ;
import o.qWT;
import o.qWU;
import o.qWZ;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListChildViewModel extends AbstractC49411unz<TaskDescription> {
    public final qWZ AYXKKw;
    public final MutableStateFlow<String> AhwBna;
    public String EZpvd;
    public final C40470qXa KWHzl;
    public final qWU OLrzqt;
    public final qWT copydefault;
    public String gEmmrt;
    public final C40431qVp valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<String> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public GroupWatchListChildViewModel(@NotNull qWU qwu, @NotNull C40431qVp c40431qVp, @NotNull C40470qXa c40470qXa, @NotNull qWZ qwz, @NotNull qWT qwt) {
        super(new TaskDescription(new InterfaceC49371unL.ActionBar(null, 1, null), ""));
        Intrinsics.checkNotNullParameter(qwu, "");
        Intrinsics.checkNotNullParameter(c40431qVp, "");
        Intrinsics.checkNotNullParameter(c40470qXa, "");
        Intrinsics.checkNotNullParameter(qwz, "");
        Intrinsics.checkNotNullParameter(qwt, "");
        this.OLrzqt = qwu;
        this.valueOf = c40431qVp;
        this.KWHzl = c40470qXa;
        this.AYXKKw = qwz;
        this.copydefault = qwt;
        this.EZpvd = "";
        this.AhwBna = StateFlowKt.MutableStateFlow("");
        this.gEmmrt = "ALL";
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.market.fragment.watchlist.GroupWatchListChildViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void KWHzl(String str) {
        AEQbTJ(str, this.EZpvd);
        if (!Intrinsics.EZpvd((Object) str, (Object) this.EZpvd)) {
            this.EZpvd = str;
        }
        this.AhwBna.setValue(this.EZpvd);
    }

    public final void AEQbTJ(final String str, final String str2) {
        C32866mlf.onEvent$default("Markets_Category_TabSorting_Click", (TrackChannel[]) null, new Function1() { // from class: o.kIh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return GroupWatchListChildViewModel.AEQbTJ(this.AEQbTJ, str, str2, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(GroupWatchListChildViewModel groupWatchListChildViewModel, String str, String str2, EventParamsList eventParamsList) {
        String str3;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", "markets", false, 4, null);
        EventParamsList.put$default(eventParamsList, C27989kKu.Companion.AhwBna(), "favorites", false, 4, null);
        EventParamsList.put$default(eventParamsList, "l3_tab", groupWatchListChildViewModel.gEmmrt, false, 4, null);
        C41301qoI c41301qoI = C41301qoI.KWHzl;
        if (str == null) {
            str3 = "";
        } else if (str.length() != 0) {
            str3 = str;
        } else if (str2 != null) {
            str3 = str2;
        }
        EventParamsList.put$default(eventParamsList, "sorting_criteria", c41301qoI.EZpvd(str3), false, 4, null);
        EventParamsList.put$default(eventParamsList, "sort_order", c41301qoI.AEQbTJ(str != null ? str : ""), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0081 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0030 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, o.unz] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.okinc.business.market.market.fragment.watchlist.GroupWatchListChildViewModel] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.okinc.business.market.market.fragment.watchlist.GroupWatchListChildViewModel] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        GroupWatchListChildViewModel$loadData$1 groupWatchListChildViewModel$loadData$1;
        Object objM7377constructorimpl;
        ?? r5;
        Object obj;
        String str2;
        Throwable thM7380exceptionOrNullimpl;
        ?? r7;
        ?? r0;
        Object obj2;
        String str3;
        GroupWatchListChildViewModel groupWatchListChildViewModel;
        GroupWatchListChildViewModel groupWatchListChildViewModel2;
        String str4 = str;
        if (continuation instanceof GroupWatchListChildViewModel$loadData$1) {
            groupWatchListChildViewModel$loadData$1 = (GroupWatchListChildViewModel$loadData$1) continuation;
            int i = groupWatchListChildViewModel$loadData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupWatchListChildViewModel$loadData$1.label = i - Integer.MIN_VALUE;
            } else {
                groupWatchListChildViewModel$loadData$1 = new GroupWatchListChildViewModel$loadData$1(this, continuation);
            }
        }
        Object objEZpvd = groupWatchListChildViewModel$loadData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r52 = groupWatchListChildViewModel$loadData$1.label;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (r52 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            pUU.KWHzl("GroupWatchListChildViewModel", "loadData: " + str4 + " start");
            try {
                Result.Application application = Result.Companion;
                this.gEmmrt = str4;
                qWU qwu = this.OLrzqt;
                groupWatchListChildViewModel$loadData$1.L$0 = this;
                groupWatchListChildViewModel$loadData$1.L$1 = str4;
                groupWatchListChildViewModel$loadData$1.label = 1;
                objEZpvd = qwu.EZpvd(str4, groupWatchListChildViewModel$loadData$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                groupWatchListChildViewModel = this;
            } catch (Throwable th2) {
                th = th2;
                r52 = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                r5 = r52;
            }
        } else {
            if (r52 != 1) {
                if (r52 == 2) {
                    str4 = (String) groupWatchListChildViewModel$loadData$1.L$1;
                    GroupWatchListChildViewModel groupWatchListChildViewModel3 = (GroupWatchListChildViewModel) groupWatchListChildViewModel$loadData$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    groupWatchListChildViewModel2 = groupWatchListChildViewModel3;
                    Flow flowConflate = FlowKt.conflate((Flow) objEZpvd);
                    qWZ qwz = groupWatchListChildViewModel2.AYXKKw;
                    groupWatchListChildViewModel$loadData$1.L$0 = groupWatchListChildViewModel2;
                    groupWatchListChildViewModel$loadData$1.L$1 = str4;
                    groupWatchListChildViewModel$loadData$1.label = 3;
                    objEZpvd = qwz.EZpvd(flowConflate, (Continuation) groupWatchListChildViewModel$loadData$1);
                    r52 = groupWatchListChildViewModel2;
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(FlowKt.flowOn(FlowKt.flowCombine(FlowKt.conflate((Flow) objEZpvd), r52.AhwBna, new GroupWatchListChildViewModel$loadData$2$1(null)), Dispatchers.getDefault()));
                    r5 = r52;
                    String str5 = str4;
                    obj = objM7377constructorimpl;
                    ?? r02 = r5;
                    str2 = str5;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                    r0 = r02;
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    String str6 = str2;
                    obj2 = obj;
                    str3 = str6;
                    if (Result.m7384isSuccessimpl(obj2)) {
                    }
                    pUU.KWHzl("GroupWatchListChildViewModel", "loadData: " + str3 + " end");
                    return Unit.INSTANCE;
                }
                if (r52 != 3) {
                    if (r52 != 4) {
                        if (r52 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = (String) groupWatchListChildViewModel$loadData$1.L$0;
                        C56391yDq.AEQbTJ(objEZpvd);
                        pUU.KWHzl("GroupWatchListChildViewModel", "loadData: " + str3 + " end");
                        return Unit.INSTANCE;
                    }
                    obj = groupWatchListChildViewModel$loadData$1.L$2;
                    str2 = (String) groupWatchListChildViewModel$loadData$1.L$1;
                    GroupWatchListChildViewModel groupWatchListChildViewModel4 = (GroupWatchListChildViewModel) groupWatchListChildViewModel$loadData$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    r7 = groupWatchListChildViewModel4;
                    r0 = r7;
                    String str62 = str2;
                    obj2 = obj;
                    str3 = str62;
                    if (Result.m7384isSuccessimpl(obj2)) {
                        Flow flowM7441catch = FlowKt.m7441catch(FlowKt.retryWhen(FlowKt.onCompletion(FlowKt.conflate((Flow) obj2), new GroupWatchListChildViewModel$loadData$4$1(str3, null)), new GroupWatchListChildViewModel$loadData$4$2(null)), new GroupWatchListChildViewModel$loadData$4$3(null));
                        GroupWatchListChildViewModel$loadData$4$4 groupWatchListChildViewModel$loadData$4$4 = new GroupWatchListChildViewModel$loadData$4$4(r0, null);
                        groupWatchListChildViewModel$loadData$1.L$0 = str3;
                        groupWatchListChildViewModel$loadData$1.L$1 = obj2;
                        groupWatchListChildViewModel$loadData$1.L$2 = null;
                        groupWatchListChildViewModel$loadData$1.label = 5;
                        if (FlowKt.collectLatest(flowM7441catch, groupWatchListChildViewModel$loadData$4$4, groupWatchListChildViewModel$loadData$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    pUU.KWHzl("GroupWatchListChildViewModel", "loadData: " + str3 + " end");
                    return Unit.INSTANCE;
                }
                str4 = (String) groupWatchListChildViewModel$loadData$1.L$1;
                GroupWatchListChildViewModel groupWatchListChildViewModel5 = (GroupWatchListChildViewModel) groupWatchListChildViewModel$loadData$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                r52 = groupWatchListChildViewModel5;
                objM7377constructorimpl = Result.m7377constructorimpl(FlowKt.flowOn(FlowKt.flowCombine(FlowKt.conflate((Flow) objEZpvd), r52.AhwBna, new GroupWatchListChildViewModel$loadData$2$1(null)), Dispatchers.getDefault()));
                r5 = r52;
                String str52 = str4;
                obj = objM7377constructorimpl;
                ?? r022 = r5;
                str2 = str52;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                r0 = r022;
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("GroupWatchListChildViewModel", "loadData: error", thM7380exceptionOrNullimpl);
                    if (thM7380exceptionOrNullimpl instanceof CancellationException) {
                        pUU.AEQbTJ("GroupWatchListChildViewModel", "loadData: error catched  ", thM7380exceptionOrNullimpl);
                        r0 = r022;
                    } else {
                        GroupWatchListChildViewModel$loadData$3$1 groupWatchListChildViewModel$loadData$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.market.fragment.watchlist.GroupWatchListChildViewModel$loadData$3$1
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj3) {
                                return ((GroupWatchListChildViewModel.TaskDescription) obj3).EZpvd();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj3, Object obj4) {
                                ((GroupWatchListChildViewModel.TaskDescription) obj3).EZpvd((InterfaceC49371unL<? extends List<CoinQuote>>) obj4);
                            }
                        };
                        InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(yDY.AhwBna());
                        groupWatchListChildViewModel$loadData$1.L$0 = r022;
                        groupWatchListChildViewModel$loadData$1.L$1 = str2;
                        groupWatchListChildViewModel$loadData$1.L$2 = obj;
                        groupWatchListChildViewModel$loadData$1.label = 4;
                        if (r022.KWHzl(groupWatchListChildViewModel$loadData$3$1, activity, groupWatchListChildViewModel$loadData$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        r7 = r022;
                        r0 = r7;
                    }
                }
                String str622 = str2;
                obj2 = obj;
                str3 = str622;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                pUU.KWHzl("GroupWatchListChildViewModel", "loadData: " + str3 + " end");
                return Unit.INSTANCE;
            }
            str4 = (String) groupWatchListChildViewModel$loadData$1.L$1;
            GroupWatchListChildViewModel groupWatchListChildViewModel6 = (GroupWatchListChildViewModel) groupWatchListChildViewModel$loadData$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            groupWatchListChildViewModel = groupWatchListChildViewModel6;
        }
        Flow flow = (Flow) objEZpvd;
        Flow flowConflate2 = FlowKt.conflate((Flow) groupWatchListChildViewModel.valueOf.OLrzqt(flow));
        C40470qXa c40470qXa = groupWatchListChildViewModel.KWHzl;
        Pair pair = new Pair(flow, flowConflate2);
        groupWatchListChildViewModel$loadData$1.L$0 = groupWatchListChildViewModel;
        groupWatchListChildViewModel$loadData$1.L$1 = str4;
        groupWatchListChildViewModel$loadData$1.label = 2;
        objEZpvd = c40470qXa.EZpvd(pair, groupWatchListChildViewModel$loadData$1);
        groupWatchListChildViewModel2 = groupWatchListChildViewModel;
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        Flow flowConflate3 = FlowKt.conflate((Flow) objEZpvd);
        qWZ qwz2 = groupWatchListChildViewModel2.AYXKKw;
        groupWatchListChildViewModel$loadData$1.L$0 = groupWatchListChildViewModel2;
        groupWatchListChildViewModel$loadData$1.L$1 = str4;
        groupWatchListChildViewModel$loadData$1.label = 3;
        objEZpvd = qwz2.EZpvd(flowConflate3, (Continuation) groupWatchListChildViewModel$loadData$1);
        r52 = groupWatchListChildViewModel2;
        if (objEZpvd == objCopydefault) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(FlowKt.flowOn(FlowKt.flowCombine(FlowKt.conflate((Flow) objEZpvd), r52.AhwBna, new GroupWatchListChildViewModel$loadData$2$1(null)), Dispatchers.getDefault()));
        r5 = r52;
        String str522 = str4;
        obj = objM7377constructorimpl;
        ?? r0222 = r5;
        str2 = str522;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
        r0 = r0222;
        if (thM7380exceptionOrNullimpl != null) {
        }
        String str6222 = str2;
        obj2 = obj;
        str3 = str6222;
        if (Result.m7384isSuccessimpl(obj2)) {
        }
        pUU.KWHzl("GroupWatchListChildViewModel", "loadData: " + str3 + " end");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.market.market.fragment.watchlist.GroupWatchListChildViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupWatchListChildViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.market.market.fragment.watchlist.GroupWatchListChildViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03731 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ GroupWatchListChildViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03731(GroupWatchListChildViewModel groupWatchListChildViewModel, Continuation<? super C03731> continuation) {
                super(2, continuation);
                this.this$0 = groupWatchListChildViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03731 c03731 = new C03731(this.this$0, continuation);
                c03731.L$0 = obj;
                return c03731;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((C03731) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    String str = (String) this.L$0;
                    GroupWatchListChildViewModel groupWatchListChildViewModel = this.this$0;
                    C03741 c03741 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.market.fragment.watchlist.GroupWatchListChildViewModel.1.1.1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj2) {
                            return ((TaskDescription) obj2).OLrzqt();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj2, Object obj3) {
                            ((TaskDescription) obj2).AEQbTJ((String) obj3);
                        }
                    };
                    this.label = 1;
                    if (groupWatchListChildViewModel.KWHzl(c03741, str, this) == objCopydefault) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow<String> mutableStateFlowEZpvd = GroupWatchListChildViewModel.this.EZpvd();
                C03731 c03731 = new C03731(GroupWatchListChildViewModel.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlowEZpvd, c03731, this) == objCopydefault) {
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

    public static final class TaskDescription extends AbstractC49408unw<TaskDescription> {
        public String AEQbTJ;
        public InterfaceC49371unL<? extends List<CoinQuote>> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.market.fragment.watchlist.GroupWatchListChildViewModel$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, InterfaceC49371unL interfaceC49371unL, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC49371unL = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                str = taskDescription.AEQbTJ;
            }
            return taskDescription.EZpvd(interfaceC49371unL, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull InterfaceC49371unL<? extends List<CoinQuote>> interfaceC49371unL, String str) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            return new TaskDescription(interfaceC49371unL, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends java.util.List<com.okinc.business.market.bean.CoinQuote>>, o.unL<java.util.List<com.okinc.business.market.bean.CoinQuote>> */
        public final InterfaceC49371unL<List<CoinQuote>> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull InterfaceC49371unL<? extends List<CoinQuote>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.KWHzl = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            String str = this.AEQbTJ;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "GroupWatchChildUIState(datas=" + this.KWHzl + ", sortType=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull InterfaceC49371unL<? extends List<CoinQuote>> interfaceC49371unL, String str) {
            super(new Function1() { // from class: o.kIp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return GroupWatchListChildViewModel.TaskDescription.EZpvd((GroupWatchListChildViewModel.TaskDescription) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.KWHzl = interfaceC49371unL;
            this.AEQbTJ = str;
        }

        public static final TaskDescription EZpvd(TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            return copy$default(taskDescription, null, null, 3, null);
        }
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r3v0, r4v1 */
    public final void KWHzl(int i, @NotNull SortTextView.SortType sortType) {
        Intrinsics.checkNotNullParameter(sortType, "");
        if (i == 3) {
            KWHzl(C27985kKq.ActionBar.copydefault.OLrzqt(sortType.ordinal()));
            return;
        }
        Map<String, String> mapKWHzl = C27985kKq.ActionBar.copydefault.KWHzl();
        int iOrdinal = sortType.ordinal();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(iOrdinal);
        KWHzl(mapKWHzl.get(sb.toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(List<CoinQuote> list, @NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        GroupWatchListChildViewModel$updateSort$1 groupWatchListChildViewModel$updateSort$1;
        if (continuation instanceof GroupWatchListChildViewModel$updateSort$1) {
            groupWatchListChildViewModel$updateSort$1 = (GroupWatchListChildViewModel$updateSort$1) continuation;
            int i = groupWatchListChildViewModel$updateSort$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupWatchListChildViewModel$updateSort$1.label = i - Integer.MIN_VALUE;
            } else {
                groupWatchListChildViewModel$updateSort$1 = new GroupWatchListChildViewModel$updateSort$1(this, continuation);
            }
        }
        Object obj = groupWatchListChildViewModel$updateSort$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupWatchListChildViewModel$updateSort$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                if (list == null || list.isEmpty()) {
                    return Unit.INSTANCE;
                }
                Result.Application application = Result.Companion;
                qWT qwt = this.copydefault;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    WatchListData watchListDataAEQbTJ = qWJ.AEQbTJ((CoinQuote) it.next());
                    if (watchListDataAEQbTJ != null) {
                        arrayList.add(watchListDataAEQbTJ);
                    }
                }
                Pair pairOLrzqt = C56390yDp.OLrzqt(arrayList, str);
                groupWatchListChildViewModel$updateSort$1.label = 1;
                if (qwt.EZpvd(pairOLrzqt, groupWatchListChildViewModel$updateSort$1) == objCopydefault) {
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

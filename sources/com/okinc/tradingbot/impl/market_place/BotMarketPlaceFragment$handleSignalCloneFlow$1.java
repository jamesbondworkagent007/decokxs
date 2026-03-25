package com.okinc.tradingbot.impl.market_place;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.WithLifecycleStateKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ActivityC52122vzt;
import o.C51055vfm;
import o.C53734wrA;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class BotMarketPlaceFragment$handleSignalCloneFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C53734wrA.Application $result;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C51055vfm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotMarketPlaceFragment$handleSignalCloneFlow$1(C51055vfm c51055vfm, C53734wrA.Application application, Continuation<? super BotMarketPlaceFragment$handleSignalCloneFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c51055vfm;
        this.$result = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotMarketPlaceFragment$handleSignalCloneFlow$1 botMarketPlaceFragment$handleSignalCloneFlow$1 = new BotMarketPlaceFragment$handleSignalCloneFlow$1(this.this$0, this.$result, continuation);
        botMarketPlaceFragment$handleSignalCloneFlow$1.L$0 = obj;
        return botMarketPlaceFragment$handleSignalCloneFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotMarketPlaceFragment$handleSignalCloneFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C51055vfm c51055vfm;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            c51055vfm = this.this$0;
            C53734wrA.Application application2 = this.$result;
            Result.Application application3 = Result.Companion;
            C53734wrA c53734wrAFIwbmz = c51055vfm.fIwbmz();
            String strEZpvd = ((C53734wrA.Application.ActionBar) application2).EZpvd();
            this.L$0 = c51055vfm;
            this.label = 1;
            obj = c53734wrAFIwbmz.KWHzl(strEZpvd, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            c51055vfm = (C51055vfm) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Activity activity = new Activity(c51055vfm);
        this.L$0 = null;
        this.label = 2;
        if (((Flow) obj).collect(activity, this) == objCopydefault) {
            return objCopydefault;
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }

    public static final class Activity<T> implements FlowCollector {
        public final /* synthetic */ C51055vfm copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(C51055vfm c51055vfm) {
            this.copydefault = c51055vfm;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(final C53734wrA.Application.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
            final C51055vfm c51055vfm = this.copydefault;
            Lifecycle lifecycle = c51055vfm.getLifecycle();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
            boolean zIsDispatchNeeded = immediate.isDispatchNeeded(continuation.getContext());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                }
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    ActivityC52122vzt.Application application = ActivityC52122vzt.Companion;
                    Context contextRequireContext = c51055vfm.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    application.OLrzqt(contextRequireContext, stateListAnimator.EZpvd(), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                Object objSuspendWithStateAtLeastUnchecked = WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, new Function0<Unit>() { // from class: com.okinc.tradingbot.impl.market_place.BotMarketPlaceFragment$handleSignalCloneFlow$1$1$1$emit$$inlined$withResumed$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Unit invoke() {
                        ActivityC52122vzt.Application application2 = ActivityC52122vzt.Companion;
                        Context contextRequireContext2 = c51055vfm.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                        application2.OLrzqt(contextRequireContext2, stateListAnimator.EZpvd(), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
                        return Unit.INSTANCE;
                    }
                }, continuation);
                if (objSuspendWithStateAtLeastUnchecked == C56442yFn.copydefault()) {
                    return objSuspendWithStateAtLeastUnchecked;
                }
            }
            return Unit.INSTANCE;
        }
    }
}

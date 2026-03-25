package com.okinc.business.market.home.favorites;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.market.home.favorites.MarketFavQuoteFragment;
import com.okinc.business.market.home.favorites.MarketFavQuoteFragment.Activity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C43246rlf;
import o.C56391yDq;
import o.C56442yFn;
import o.C58113yvE;
import o.InterfaceC44589sZl;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavQuoteFragment$setCallAuctionListener$$inlined$repeatOnLifecycleResume$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Fragment $this_repeatOnLifecycle;
    int label;
    final /* synthetic */ MarketFavQuoteFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavQuoteFragment$setCallAuctionListener$$inlined$repeatOnLifecycleResume$1(Fragment fragment, Lifecycle.State state, Continuation continuation, MarketFavQuoteFragment marketFavQuoteFragment) {
        super(2, continuation);
        this.$this_repeatOnLifecycle = fragment;
        this.$minState = state;
        this.this$0 = marketFavQuoteFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketFavQuoteFragment$setCallAuctionListener$$inlined$repeatOnLifecycleResume$1(this.$this_repeatOnLifecycle, this.$minState, continuation, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketFavQuoteFragment$setCallAuctionListener$$inlined$repeatOnLifecycleResume$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Fragment fragment = this.$this_repeatOnLifecycle;
            Lifecycle.State state = this.$minState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.this$0);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(fragment, state, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.market.home.favorites.MarketFavQuoteFragment$setCallAuctionListener$$inlined$repeatOnLifecycleResume$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ MarketFavQuoteFragment this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, MarketFavQuoteFragment marketFavQuoteFragment) {
            super(2, continuation);
            this.this$0 = marketFavQuoteFragment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation, this.this$0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(((InterfaceC44589sZl) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC44589sZl.class)).DrNnAm().OLrzqt());
                MarketFavQuoteFragment.Activity activity = this.this$0.new Activity();
                this.label = 1;
                if (flowDistinctUntilChanged.collect(activity, this) == objCopydefault) {
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
}

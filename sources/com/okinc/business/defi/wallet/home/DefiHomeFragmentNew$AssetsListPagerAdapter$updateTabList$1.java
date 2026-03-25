package com.okinc.business.defi.wallet.home;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.PausingDispatcherKt;
import com.okinc.business.defi.common.HomeTabTypeBean;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C10856bwO;
import o.C15572eNh;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeFragmentNew$AssetsListPagerAdapter$updateTabList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<HomeTabTypeBean> $filteredTabList;
    final /* synthetic */ int $resetIndex;
    int label;
    final /* synthetic */ C15572eNh this$0;
    final /* synthetic */ C15572eNh.ActionBar this$1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeFragmentNew$AssetsListPagerAdapter$updateTabList$1(C15572eNh c15572eNh, C15572eNh.ActionBar actionBar, List<HomeTabTypeBean> list, int i, Continuation<? super DefiHomeFragmentNew$AssetsListPagerAdapter$updateTabList$1> continuation) {
        super(2, continuation);
        this.this$0 = c15572eNh;
        this.this$1 = actionBar;
        this.$filteredTabList = list;
        this.$resetIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeFragmentNew$AssetsListPagerAdapter$updateTabList$1(this.this$0, this.this$1, this.$filteredTabList, this.$resetIndex, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeFragmentNew$AssetsListPagerAdapter$updateTabList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$AssetsListPagerAdapter$updateTabList$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<HomeTabTypeBean> $filteredTabList;
        final /* synthetic */ int $resetIndex;
        int label;
        final /* synthetic */ C15572eNh.ActionBar this$0;
        final /* synthetic */ C15572eNh this$1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C15572eNh.ActionBar actionBar, List<HomeTabTypeBean> list, C15572eNh c15572eNh, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = actionBar;
            this.$filteredTabList = list;
            this.this$1 = c15572eNh;
            this.$resetIndex = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$filteredTabList, this.this$1, this.$resetIndex, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                try {
                    this.this$0.copydefault = this.$filteredTabList;
                    this.this$0.notifyDataSetChanged();
                    C15572eNh.ActionBar.OLrzqt(this.this$1, this.$resetIndex, this.$filteredTabList);
                } catch (Exception e) {
                    C10856bwO.copydefault(this.this$1.getTAG(), 0, "notifyDataSetChanged setOnlySupportTableList whenResumed error " + e.getMessage());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$1, this.$filteredTabList, this.this$0, this.$resetIndex, null);
            this.label = 1;
            if (PausingDispatcherKt.whenResumed(lifecycle, anonymousClass1, this) == objCopydefault) {
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

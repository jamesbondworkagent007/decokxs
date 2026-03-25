package com.okinc.planet.biz_content.input;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.planet.domain.remote.dto.PublisherTokenInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C47576tsi;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.tNJ;

/* JADX INFO: loaded from: classes19.dex */
public final class GenericInputFragment$setupTopicProviderIntegration$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GenericInputParentViewModel $provider;
    int label;
    final /* synthetic */ C47576tsi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericInputFragment$setupTopicProviderIntegration$1$3(C47576tsi c47576tsi, GenericInputParentViewModel genericInputParentViewModel, Continuation<? super GenericInputFragment$setupTopicProviderIntegration$1$3> continuation) {
        super(2, continuation);
        this.this$0 = c47576tsi;
        this.$provider = genericInputParentViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenericInputFragment$setupTopicProviderIntegration$1$3(this.this$0, this.$provider, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GenericInputFragment$setupTopicProviderIntegration$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_content.input.GenericInputFragment$setupTopicProviderIntegration$1$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GenericInputParentViewModel $provider;
        int label;
        final /* synthetic */ C47576tsi this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GenericInputParentViewModel genericInputParentViewModel, C47576tsi c47576tsi, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$provider = genericInputParentViewModel;
            this.this$0 = c47576tsi;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$provider, this.this$0, continuation);
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
                SharedFlow<ArrayList<PublisherTokenInfo>> sharedFlowEZpvd = this.$provider.EZpvd();
                final C47576tsi c47576tsi = this.this$0;
                FlowCollector<? super ArrayList<PublisherTokenInfo>> flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_content.input.GenericInputFragment.setupTopicProviderIntegration.1.3.1.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(ArrayList<PublisherTokenInfo> arrayList, Continuation<? super Unit> continuation) {
                        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                        Iterator<T> it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((PublisherTokenInfo) it.next()).getName());
                        }
                        tNJ tnj = c47576tsi.KWHzl;
                        if (tnj == null) {
                            Intrinsics.gEmmrt("");
                            tnj = null;
                        }
                        tnj.valueOf.AEQbTJ(arrayList2);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$provider, this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
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

package com.okinc.ok_kyc_core_okx_impl.foebidden.service;

import com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class FeatureRestrictionCoreRepository$setCallBack$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isSuccess;
    int label;
    final /* synthetic */ FeatureRestrictionCoreRepository this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureRestrictionCoreRepository$setCallBack$1(FeatureRestrictionCoreRepository featureRestrictionCoreRepository, boolean z, Continuation<? super FeatureRestrictionCoreRepository$setCallBack$1> continuation) {
        super(2, continuation);
        this.this$0 = featureRestrictionCoreRepository;
        this.$isSuccess = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FeatureRestrictionCoreRepository$setCallBack$1(this.this$0, this.$isSuccess, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FeatureRestrictionCoreRepository$setCallBack$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd(this.this$0.copydefault, "setCallBack | Thread: " + Thread.currentThread());
            List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.this$0.AYXKKw);
            this.this$0.AYXKKw.clear();
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(listAxsJAYsNCnLh, this.this$0, this.$isSuccess, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$setCallBack$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isSuccess;
        final /* synthetic */ List<FeatureRestrictionCoreRepository.Activity> $snapshot;
        int label;
        final /* synthetic */ FeatureRestrictionCoreRepository this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.okinc.ok_kyc_core_okx_impl.foebidden.service.FeatureRestrictionCoreRepository$Activity> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends FeatureRestrictionCoreRepository.Activity> list, FeatureRestrictionCoreRepository featureRestrictionCoreRepository, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$snapshot = list;
            this.this$0 = featureRestrictionCoreRepository;
            this.$isSuccess = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$snapshot, this.this$0, this.$isSuccess, continuation);
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
                    List<FeatureRestrictionCoreRepository.Activity> list = this.$snapshot;
                    boolean z = this.$isSuccess;
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((FeatureRestrictionCoreRepository.Activity) it.next()).EZpvd(z);
                    }
                } catch (Exception e) {
                    pUU.AEQbTJ(this.this$0.copydefault, "Callback execution crashed", e);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

package com.okinc.cache;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C30360lVm;
import o.C43296rmc;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes18.dex */
public final class CacheManager$getCacheSize$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Long, Unit> $callback;
    final /* synthetic */ Context $context;
    final /* synthetic */ CoroutineDispatcher $mainDispatcher;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CacheManager$getCacheSize$1(CoroutineDispatcher coroutineDispatcher, Context context, Function1<? super Long, Unit> function1, Continuation<? super CacheManager$getCacheSize$1> continuation) {
        super(2, continuation);
        this.$mainDispatcher = coroutineDispatcher;
        this.$context = context;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CacheManager$getCacheSize$1(this.$mainDispatcher, this.$context, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CacheManager$getCacheSize$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.LongRef longRef = new Ref.LongRef();
            List list = C30360lVm.EZpvd;
            Context context = this.$context;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    long jOLrzqt = longRef.element + ((C30360lVm.StateListAnimator) it.next()).OLrzqt(context);
                    longRef.element = jOLrzqt;
                    C43296rmc.AEQbTJ("CacheManager", "size: " + jOLrzqt);
                } catch (Exception e) {
                    C43296rmc.EZpvd("CacheManager", "getCacheSize failed", e);
                }
            }
            CoroutineDispatcher coroutineDispatcher = this.$mainDispatcher;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(longRef, this.$callback, null);
            this.label = 1;
            if (BuildersKt.withContext(coroutineDispatcher, anonymousClass2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C30360lVm c30360lVm = C30360lVm.KWHzl;
        C30360lVm.OLrzqt = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.cache.CacheManager$getCacheSize$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Long, Unit> $callback;
        final /* synthetic */ Ref.LongRef $size;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Ref.LongRef longRef, Function1<? super Long, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$size = longRef;
            this.$callback = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$size, this.$callback, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C43296rmc.AEQbTJ("CacheManager", "total size: " + this.$size.element);
                this.$callback.invoke(C56443yFo.KWHzl(this.$size.element));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

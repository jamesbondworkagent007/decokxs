package com.okinc.planet.biz_userprofile.common;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C46388tSm;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.tKX;
import o.tTY;

/* JADX INFO: loaded from: classes16.dex */
public final class PlanetOrbitProfileHelper$openProfileEditPage$1$onProfileUpdated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ Function2<Boolean, String, Unit> $callback;
    final /* synthetic */ boolean $showSuccessSnakeBar;
    final /* synthetic */ String $successMsg;
    int label;
    final /* synthetic */ tKX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlanetOrbitProfileHelper$openProfileEditPage$1$onProfileUpdated$1(Function2<? super Boolean, ? super String, Unit> function2, String str, boolean z, tKX tkx, FragmentActivity fragmentActivity, Continuation<? super PlanetOrbitProfileHelper$openProfileEditPage$1$onProfileUpdated$1> continuation) {
        super(2, continuation);
        this.$callback = function2;
        this.$successMsg = str;
        this.$showSuccessSnakeBar = z;
        this.this$0 = tkx;
        this.$activity = fragmentActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetOrbitProfileHelper$openProfileEditPage$1$onProfileUpdated$1(this.$callback, this.$successMsg, this.$showSuccessSnakeBar, this.this$0, this.$activity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetOrbitProfileHelper$openProfileEditPage$1$onProfileUpdated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C46388tSm c46388tSmKWHzl = C46388tSm.Companion.KWHzl();
            this.label = 1;
            if (c46388tSmKWHzl.EZpvd(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, this.$successMsg, this.$showSuccessSnakeBar, this.this$0, this.$activity, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_userprofile.common.PlanetOrbitProfileHelper$openProfileEditPage$1$onProfileUpdated$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ Function2<Boolean, String, Unit> $callback;
        final /* synthetic */ boolean $showSuccessSnakeBar;
        final /* synthetic */ String $successMsg;
        int label;
        final /* synthetic */ tKX this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super Boolean, ? super String, Unit> function2, String str, boolean z, tKX tkx, FragmentActivity fragmentActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$callback = function2;
            this.$successMsg = str;
            this.$showSuccessSnakeBar = z;
            this.this$0 = tkx;
            this.$activity = fragmentActivity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$callback, this.$successMsg, this.$showSuccessSnakeBar, this.this$0, this.$activity, continuation);
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
                Function2<Boolean, String, Unit> function2 = this.$callback;
                if (function2 != null) {
                    function2.invoke(C56443yFo.KWHzl(true), this.$successMsg);
                }
                if (this.$showSuccessSnakeBar) {
                    tTY.EZpvd.AEQbTJ(this.this$0.copydefault(this.$activity), this.$successMsg);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

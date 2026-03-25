package com.okinc.planet.biz_home.root;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.im.bean.ChatOrigin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C43251rlk;
import o.C47861tyB;
import o.C47893tyh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetRootFragment$observeChatUnreadCount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47893tyh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetRootFragment$observeChatUnreadCount$1(C47893tyh c47893tyh, Continuation<? super PlanetRootFragment$observeChatUnreadCount$1> continuation) {
        super(2, continuation);
        this.this$0 = c47893tyh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetRootFragment$observeChatUnreadCount$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetRootFragment$observeChatUnreadCount$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C47893tyh c47893tyh = this.this$0;
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(c47893tyh, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(c47893tyh, state, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            pUU.AEQbTJ(this.this$0.getTAG(), "Error observing chat unread count", e);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.planet.biz_home.root.PlanetRootFragment$observeChatUnreadCount$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C47893tyh this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C47893tyh c47893tyh, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c47893tyh;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Flow<Integer> flowAEQbTJ;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                if (interfaceC35180nqU != null && (flowAEQbTJ = interfaceC35180nqU.AEQbTJ(ChatOrigin.PLANET)) != null) {
                    C06071 c06071 = new C06071(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowAEQbTJ, c06071, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.planet.biz_home.root.PlanetRootFragment$observeChatUnreadCount$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06071 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
            /* synthetic */ int I$0;
            int label;
            final /* synthetic */ C47893tyh this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06071(C47893tyh c47893tyh, Continuation<? super C06071> continuation) {
                super(2, continuation);
                this.this$0 = c47893tyh;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06071 c06071 = new C06071(this.this$0, continuation);
                c06071.I$0 = ((Number) obj).intValue();
                return c06071;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(int i, Continuation<? super Unit> continuation) {
                return ((C06071) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
                return invoke(num.intValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    int i = this.I$0;
                    C47861tyB value = this.this$0.KWHzl().AYXKKw().getValue();
                    if (value.copydefault() != i) {
                        this.this$0.KWHzl().AYXKKw().setValue(value.EZpvd((253 & 1) != 0 ? value.copydefault : null, (253 & 2) != 0 ? value.EZpvd : 0, (253 & 4) != 0 ? value.AEQbTJ : false, (253 & 8) != 0 ? value.valueOf : false, (253 & 16) != 0 ? value.gEmmrt : false, (253 & 32) != 0 ? value.AYXKKw : false, (253 & 64) != 0 ? value.KWHzl : i, (253 & 128) != 0 ? value.OLrzqt : 0));
                        pUU.KWHzl(this.this$0.getTAG(), "Chat unread count updated: " + i);
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}

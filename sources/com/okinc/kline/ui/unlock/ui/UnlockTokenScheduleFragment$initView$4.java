package com.okinc.kline.ui.unlock.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C36097oPd;
import o.C39702pxN;
import o.C39713pxY;
import o.C54984xbQ;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49361unB;

/* JADX INFO: loaded from: classes23.dex */
public final class UnlockTokenScheduleFragment$initView$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C39702pxN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockTokenScheduleFragment$initView$4(C39702pxN c39702pxN, Continuation<? super UnlockTokenScheduleFragment$initView$4> continuation) {
        super(2, continuation);
        this.this$0 = c39702pxN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnlockTokenScheduleFragment$initView$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnlockTokenScheduleFragment$initView$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.unlock.ui.UnlockTokenScheduleFragment$initView$4$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C39702pxN this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C39702pxN c39702pxN, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c39702pxN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C54984xbQ c54984xbQ;
            C54984xbQ c54984xbQ2;
            C54984xbQ c54984xbQ3;
            C54984xbQ c54984xbQ4;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                String str = (String) this.L$0;
                C36097oPd c36097oPdAEQbTJ = this.this$0.AEQbTJ();
                if (c36097oPdAEQbTJ != null && (c54984xbQ4 = c36097oPdAEQbTJ.DbNXlk) != null) {
                    c54984xbQ4.setSelectedStyle(Intrinsics.EZpvd((Object) str, (Object) "1W"), 4);
                }
                C36097oPd c36097oPdAEQbTJ2 = this.this$0.AEQbTJ();
                if (c36097oPdAEQbTJ2 != null && (c54984xbQ3 = c36097oPdAEQbTJ2.gEmmrt) != null) {
                    c54984xbQ3.setSelectedStyle(Intrinsics.EZpvd((Object) str, (Object) "1M"), 4);
                }
                C36097oPd c36097oPdAEQbTJ3 = this.this$0.AEQbTJ();
                if (c36097oPdAEQbTJ3 != null && (c54984xbQ2 = c36097oPdAEQbTJ3.AkhnZx) != null) {
                    c54984xbQ2.setSelectedStyle(Intrinsics.EZpvd((Object) str, (Object) "1Y"), 4);
                }
                C36097oPd c36097oPdAEQbTJ4 = this.this$0.AEQbTJ();
                if (c36097oPdAEQbTJ4 != null && (c54984xbQ = c36097oPdAEQbTJ4.EZpvd) != null) {
                    c54984xbQ.setSelectedStyle(Intrinsics.EZpvd((Object) str, (Object) "ALL"), 4);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C39702pxN c39702pxN = this.this$0;
            InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(c39702pxN, c39702pxN.valueOf(), new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.UnlockTokenScheduleFragment$initView$4.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C39713pxY) obj2).OLrzqt();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C39713pxY) obj2).copydefault((String) obj3);
                }
            }, null, new AnonymousClass2(this.this$0, null), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

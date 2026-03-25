package com.okinc.planet.biz_feed_kline;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C47809txC;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C7323ahf;
import o.tWP;

/* JADX INFO: loaded from: classes19.dex */
public final class KlineDefiFeedCombineFragment$onResume$1$onEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ tWP $event;
    int label;
    final /* synthetic */ C47809txC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineDefiFeedCombineFragment$onResume$1$onEvent$1(tWP twp, C47809txC c47809txC, Continuation<? super KlineDefiFeedCombineFragment$onResume$1$onEvent$1> continuation) {
        super(2, continuation);
        this.$event = twp;
        this.this$0 = c47809txC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineDefiFeedCombineFragment$onResume$1$onEvent$1(this.$event, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineDefiFeedCombineFragment$onResume$1$onEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(20L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (Intrinsics.EZpvd((Object) this.$event.AEQbTJ(), (Object) "news")) {
            C7323ahf.KWHzl().AEQbTJ("kline_feed_set_select_tab_notification_key", null, C56424yEw.gEmmrt(C56390yDp.OLrzqt("selectTabName", "news"), C56390yDp.OLrzqt("entryIdentifier", String.valueOf(this.this$0.hashCode())), C56390yDp.OLrzqt("important", "selected")));
        }
        return Unit.INSTANCE;
    }
}

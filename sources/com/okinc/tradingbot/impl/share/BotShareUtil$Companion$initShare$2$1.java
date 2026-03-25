package com.okinc.tradingbot.impl.share;

import androidx.lifecycle.Lifecycle;
import com.okinc.rxutils.RxBus;
import com.okinc.tradingbot.impl.share.BotShareUtil$Companion$initShare$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC58185ywX;
import o.C33070mpX;
import o.C33527myD;
import o.C48033uCm;
import o.C49286ulg;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C58156yvv;
import o.InterfaceC48892ueJ;

/* JADX INFO: loaded from: classes11.dex */
public final class BotShareUtil$Companion$initShare$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC48892ueJ $this_apply;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotShareUtil$Companion$initShare$2$1(InterfaceC48892ueJ interfaceC48892ueJ, Continuation<? super BotShareUtil$Companion$initShare$2$1> continuation) {
        super(2, continuation);
        this.$this_apply = interfaceC48892ueJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotShareUtil$Companion$initShare$2$1(this.$this_apply, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotShareUtil$Companion$initShare$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C49286ulg.class, new String[0]);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            C33527myD.subscribeByUI$default(C58156yvv.OLrzqt(abstractC58185ywXKWHzl, this.$this_apply.EZpvd(), Lifecycle.Event.ON_DESTROY), (Function1) null, (Function0) null, new Function1() { // from class: o.wrd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return BotShareUtil$Companion$initShare$2$1.invokeSuspend$lambda$0((C49286ulg) obj2);
                }
            }, 3, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C49286ulg c49286ulg) {
        if (Intrinsics.EZpvd((Object) c49286ulg.EZpvd(), (Object) "true") && Intrinsics.EZpvd((Object) c49286ulg.AEQbTJ(), (Object) "CopyLink")) {
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C48033uCm.Fragment.sEcTXd), 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }
}

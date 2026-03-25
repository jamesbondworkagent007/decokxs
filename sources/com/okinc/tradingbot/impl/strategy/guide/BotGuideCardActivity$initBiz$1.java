package com.okinc.tradingbot.impl.strategy.guide;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC52405wKe;
import o.AbstractC54531xLw;
import o.ActivityC52394wJu;
import o.C54589xNz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;

/* JADX INFO: loaded from: classes11.dex */
public final class BotGuideCardActivity$initBiz$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC52394wJu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotGuideCardActivity$initBiz$1(ActivityC52394wJu activityC52394wJu, Continuation<? super BotGuideCardActivity$initBiz$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC52394wJu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotGuideCardActivity$initBiz$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotGuideCardActivity$initBiz$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC54531xLw abstractC54531xLw;
        AbstractC52405wKe abstractC52405wKe;
        BizInstrument bizInstrumentValueOf;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        AbstractC52405wKe abstractC52405wKe2 = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 == null) {
                abstractC54531xLw = null;
                if (abstractC54531xLw != null && (bizInstrumentValueOf = abstractC54531xLw.valueOf(ActivityC52394wJu.copydefault(this.this$0).copydefault())) != null && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null) {
                    interfaceC54581xNrOLrzqt.KWHzl(bizInstrumentValueOf);
                }
                this.this$0.AkhnZx();
                abstractC52405wKe = this.this$0.EZpvd;
                if (abstractC52405wKe != null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC52405wKe2 = abstractC52405wKe;
                }
                abstractC52405wKe2.copydefault();
                return Unit.INSTANCE;
            }
            String strAEQbTJ = ActivityC52394wJu.copydefault(this.this$0).AEQbTJ();
            this.label = 1;
            obj = interfaceC54581xNrOLrzqt2.EZpvd(strAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        abstractC54531xLw = (AbstractC54531xLw) obj;
        if (abstractC54531xLw != null) {
            interfaceC54581xNrOLrzqt.KWHzl(bizInstrumentValueOf);
        }
        this.this$0.AkhnZx();
        abstractC52405wKe = this.this$0.EZpvd;
        if (abstractC52405wKe != null) {
        }
        abstractC52405wKe2.copydefault();
        return Unit.INSTANCE;
    }
}

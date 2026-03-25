package com.okinc.im.imui.livestream.viewmodel;

import com.okinc.im.imui.livestream.model.UXBehavior;
import java.util.Iterator;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C36498ocB;
import o.C36499ocC;
import o.C36547ocy;
import o.C44464sQu;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class LivestreamChatViewModel$onRecallEvent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ C44464sQu $recallEvent;
    int label;
    final /* synthetic */ C36547ocy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamChatViewModel$onRecallEvent$1(C36547ocy c36547ocy, C44464sQu c44464sQu, Continuation<? super LivestreamChatViewModel$onRecallEvent$1> continuation) {
        super(1, continuation);
        this.this$0 = c36547ocy;
        this.$recallEvent = c44464sQu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new LivestreamChatViewModel$onRecallEvent$1(this.this$0, this.$recallEvent, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((LivestreamChatViewModel$onRecallEvent$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C36547ocy c36547ocy = this.this$0;
            C44464sQu c44464sQu = this.$recallEvent;
            try {
                Result.Application application = Result.Companion;
                pUU.EZpvd("LivestreamChatViewModel", "onRecallEvent processing - seq:" + c44464sQu.AEQbTJ().getSeq());
                Iterator it = c36547ocy.fetchVPNInfo.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((C36498ocB) it.next()).EZpvd() == c44464sQu.AEQbTJ().getSeq()) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    C36498ocB c36498ocB = (C36498ocB) c36547ocy.fetchVPNInfo.get(i);
                    c36547ocy.fetchVPNInfo.set(i, c36498ocB.AEQbTJ((1023 & 1) != 0 ? c36498ocB.AhwBna : 0L, (1023 & 2) != 0 ? c36498ocB.OLrzqt : null, (1023 & 4) != 0 ? c36498ocB.gEmmrt : null, (1023 & 8) != 0 ? c36498ocB.AkhnZx : null, (1023 & 16) != 0 ? c36498ocB.EZpvd : null, (1023 & 32) != 0 ? c36498ocB.copydefault : null, (1023 & 64) != 0 ? c36498ocB.djBIcL : 0L, (1023 & 128) != 0 ? c36498ocB.valueOf : null, (1023 & 256) != 0 ? c36498ocB.AYXKKw : null, (1023 & 512) != 0 ? c36498ocB.KWHzl : null, (1023 & 1024) != 0 ? c36498ocB.AEQbTJ : true));
                    c36547ocy.djBIcL.setValue(new C36499ocC(CollectionsKt___CollectionsKt.gkJEwt(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c36547ocy.fetchVPNInfo)), UXBehavior.NoOperation, ((C36499ocC) c36547ocy.djBIcL.getValue()).copydefault()));
                } else {
                    pUU.valueOf("LivestreamChatViewModel", "onRecallEvent - message not found with id: " + c44464sQu.AEQbTJ().getSeq());
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

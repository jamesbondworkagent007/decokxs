package com.okinc.im.imui.livestream.viewmodel;

import com.okinc.im.imui.livestream.model.UXBehavior;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C36498ocB;
import o.C36499ocC;
import o.C36547ocy;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sQA;

/* JADX INFO: loaded from: classes23.dex */
public final class LivestreamChatViewModel$onRefreshEvent$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ sQA $refreshEvent;
    int label;
    final /* synthetic */ C36547ocy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamChatViewModel$onRefreshEvent$1(C36547ocy c36547ocy, sQA sqa, Continuation<? super LivestreamChatViewModel$onRefreshEvent$1> continuation) {
        super(1, continuation);
        this.this$0 = c36547ocy;
        this.$refreshEvent = sqa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new LivestreamChatViewModel$onRefreshEvent$1(this.this$0, this.$refreshEvent, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((LivestreamChatViewModel$onRefreshEvent$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C36547ocy c36547ocy = this.this$0;
            sQA sqa = this.$refreshEvent;
            try {
                Result.Application application = Result.Companion;
                pUU.EZpvd("LivestreamChatViewModel", "onRefreshEvent processing - seq:" + sqa.EZpvd().getSeq());
                C36498ocB c36498ocBEZpvd = c36547ocy.EZpvd(sqa.EZpvd());
                Iterator it = c36547ocy.fetchVPNInfo.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((C36498ocB) it.next()).EZpvd() == c36498ocBEZpvd.EZpvd()) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    c36547ocy.fetchVPNInfo.set(i, c36498ocBEZpvd);
                    MutableStateFlow mutableStateFlow = c36547ocy.djBIcL;
                    List listGkJEwt = CollectionsKt___CollectionsKt.gkJEwt(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c36547ocy.fetchVPNInfo));
                    UXBehavior uXBehavior = UXBehavior.Init;
                    C36498ocB c36498ocB = (C36498ocB) CollectionsKt___CollectionsKt.firstOrNull(c36547ocy.fetchVPNInfo);
                    mutableStateFlow.setValue(new C36499ocC(listGkJEwt, uXBehavior, c36498ocB != null ? C56443yFo.KWHzl(c36498ocB.EZpvd()) : null));
                } else {
                    pUU.valueOf("LivestreamChatViewModel", "onRefreshEvent - message not found with id: " + c36498ocBEZpvd.EZpvd());
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

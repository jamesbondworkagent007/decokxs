package com.okinc.im.imui.livestream.viewmodel;

import com.okinc.im.imui.livestream.model.UXBehavior;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C33129mqd;
import o.C36498ocB;
import o.C36499ocC;
import o.C36547ocy;
import o.C44454sQk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class LivestreamChatViewModel$onDeleteMessage$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ C44454sQk $deleteEvent;
    int label;
    final /* synthetic */ C36547ocy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamChatViewModel$onDeleteMessage$1(C36547ocy c36547ocy, C44454sQk c44454sQk, Continuation<? super LivestreamChatViewModel$onDeleteMessage$1> continuation) {
        super(1, continuation);
        this.this$0 = c36547ocy;
        this.$deleteEvent = c44454sQk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new LivestreamChatViewModel$onDeleteMessage$1(this.this$0, this.$deleteEvent, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((LivestreamChatViewModel$onDeleteMessage$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C36547ocy c36547ocy = this.this$0;
            C44454sQk c44454sQk = this.$deleteEvent;
            try {
                Result.Application application = Result.Companion;
                pUU.EZpvd("LivestreamChatViewModel", "onDeleteMessage - clientMessageIds:" + c44454sQk.AEQbTJ());
                List list = c36547ocy.fetchVPNInfo;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!c44454sQk.AEQbTJ().contains(C33129mqd.gEmmrt(C56443yFo.KWHzl(((C36498ocB) obj2).EZpvd())))) {
                        arrayList.add(obj2);
                    }
                }
                c36547ocy.fetchVPNInfo.clear();
                c36547ocy.fetchVPNInfo.addAll(arrayList);
                c36547ocy.djBIcL.setValue(new C36499ocC(CollectionsKt___CollectionsKt.gkJEwt(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c36547ocy.fetchVPNInfo)), UXBehavior.NoOperation, ((C36499ocC) c36547ocy.djBIcL.getValue()).copydefault()));
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

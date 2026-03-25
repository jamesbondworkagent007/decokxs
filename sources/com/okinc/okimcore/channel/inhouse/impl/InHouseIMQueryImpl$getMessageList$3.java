package com.okinc.okimcore.channel.inhouse.impl;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C44136sEq;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sNH;
import o.sNQ;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMQueryImpl$getMessageList$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ sNH $request;
    final /* synthetic */ Pair<sNQ, Long> $response;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44136sEq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMQueryImpl$getMessageList$3(C44136sEq c44136sEq, sNH snh, Pair<sNQ, Long> pair, Continuation<? super InHouseIMQueryImpl$getMessageList$3> continuation) {
        super(2, continuation);
        this.this$0 = c44136sEq;
        this.$request = snh;
        this.$response = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMQueryImpl$getMessageList$3 inHouseIMQueryImpl$getMessageList$3 = new InHouseIMQueryImpl$getMessageList$3(this.this$0, this.$request, this.$response, continuation);
        inHouseIMQueryImpl$getMessageList$3.L$0 = obj;
        return inHouseIMQueryImpl$getMessageList$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMQueryImpl$getMessageList$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                C44136sEq c44136sEq = this.this$0;
                sNH snh = this.$request;
                Pair<sNQ, Long> pair = this.$response;
                Result.Application application = Result.Companion;
                String strCopydefault = snh.copydefault();
                List<InHouseIMMessageWithReactions> listEZpvd = pair.getFirst().EZpvd();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listEZpvd) {
                    if (!((InHouseIMMessageWithReactions) obj2).getImMessageEntity().isRecalled()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C56443yFo.KWHzl(C33129mqd.valueOf(C56443yFo.KWHzl(((InHouseIMMessageWithReactions) it.next()).getImMessageEntity().getSeq()))));
                }
                this.label = 1;
                if (c44136sEq.EZpvd(strCopydefault, arrayList2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C44136sEq c44136sEq2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ(c44136sEq2.EZpvd, "ReactionTimeUseCase execution failed", thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}

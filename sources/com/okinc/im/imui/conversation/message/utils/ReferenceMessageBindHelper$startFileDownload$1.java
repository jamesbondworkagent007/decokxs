package com.okinc.im.imui.conversation.message.utils;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C35777oDh;
import o.C56391yDq;
import o.C56442yFn;
import o.sDN;
import o.sIS;

/* JADX INFO: loaded from: classes18.dex */
public final class ReferenceMessageBindHelper$startFileDownload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKMessage $message;
    final /* synthetic */ String $messageId;
    final /* synthetic */ C35777oDh $useCase;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferenceMessageBindHelper$startFileDownload$1(C35777oDh c35777oDh, OKMessage oKMessage, String str, Continuation<? super ReferenceMessageBindHelper$startFileDownload$1> continuation) {
        super(2, continuation);
        this.$useCase = c35777oDh;
        this.$message = oKMessage;
        this.$messageId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferenceMessageBindHelper$startFileDownload$1(this.$useCase, this.$message, this.$messageId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReferenceMessageBindHelper$startFileDownload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35777oDh c35777oDh = this.$useCase;
            OKMessage oKMessage = this.$message;
            this.label = 1;
            obj = c35777oDh.OLrzqt(oKMessage, this);
            if (obj == objCopydefault) {
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
        final String str = this.$messageId;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.im.imui.conversation.message.utils.ReferenceMessageBindHelper$startFileDownload$1.2
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public final Object emit(sIS sis, Continuation<? super Unit> continuation) {
                Object objWithContext = BuildersKt.withContext(sDN.copydefault.AEQbTJ(), new ReferenceMessageBindHelper$startFileDownload$1$1$1(str, sis, null), continuation);
                return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
            }
        };
        this.label = 2;
        if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}

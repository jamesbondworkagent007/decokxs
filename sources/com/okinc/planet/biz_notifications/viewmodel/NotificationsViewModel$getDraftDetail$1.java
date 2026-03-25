package com.okinc.planet.biz_notifications.viewmodel;

import com.okinc.planet.biz_content.draft.DraftDataInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C46356tRh;
import o.C47931tzS;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class NotificationsViewModel$getDraftDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $draftId;
    final /* synthetic */ Function1<String, Unit> $error;
    final /* synthetic */ Function1<DraftDataInfo, Unit> $success;
    int label;
    final /* synthetic */ C47931tzS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.biz_content.draft.DraftDataInfo, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NotificationsViewModel$getDraftDetail$1(C47931tzS c47931tzS, String str, Function1<? super DraftDataInfo, Unit> function1, Function1<? super String, Unit> function12, Continuation<? super NotificationsViewModel$getDraftDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = c47931tzS;
        this.$draftId = str;
        this.$success = function1;
        this.$error = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationsViewModel$getDraftDetail$1(this.this$0, this.$draftId, this.$success, this.$error, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationsViewModel$getDraftDetail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C46356tRh c46356tRh = this.this$0.KWHzl;
                String str = this.$draftId;
                this.label = 1;
                obj = c46356tRh.copydefault(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Pair pair = (Pair) obj;
            DraftDataInfo draftDataInfo = (DraftDataInfo) pair.component1();
            String str2 = (String) pair.component2();
            if (draftDataInfo != null) {
                this.$success.invoke(draftDataInfo);
            } else {
                Function1<String, Unit> function1 = this.$error;
                if (str2 == null) {
                    str2 = "";
                }
                function1.invoke(str2);
            }
        } catch (Exception unused) {
            this.$error.invoke("");
        }
        return Unit.INSTANCE;
    }
}

package com.okinc.im.imui.contacts.addcontact;

import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C33632nAb;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes8.dex */
public final class AddContactDialogViewModel$addContact$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $contactId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C33632nAb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddContactDialogViewModel$addContact$1(C33632nAb c33632nAb, String str, Continuation<? super AddContactDialogViewModel$addContact$1> continuation) {
        super(2, continuation);
        this.this$0 = c33632nAb;
        this.$contactId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AddContactDialogViewModel$addContact$1 addContactDialogViewModel$addContact$1 = new AddContactDialogViewModel$addContact$1(this.this$0, this.$contactId, continuation);
        addContactDialogViewModel$addContact$1.L$0 = obj;
        return addContactDialogViewModel$addContact$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddContactDialogViewModel$addContact$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.AEQbTJ.setValue(C56443yFo.KWHzl(true));
                C33632nAb c33632nAb = this.this$0;
                String str = this.$contactId;
                Result.Application application = Result.Companion;
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AddContactDialogViewModel$addContact$1$1$1 addContactDialogViewModel$addContact$1$1$1 = new AddContactDialogViewModel$addContact$1$1$1(c33632nAb, str, null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, addContactDialogViewModel$addContact$1$1$1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((RelationInfo) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C33632nAb c33632nAb2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            c33632nAb2.AEQbTJ.setValue(C56443yFo.KWHzl(false));
            c33632nAb2.EZpvd((RelationInfo) objM7377constructorimpl);
        }
        C33632nAb c33632nAb3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            c33632nAb3.AEQbTJ.setValue(C56443yFo.KWHzl(false));
            c33632nAb3.EZpvd(thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}

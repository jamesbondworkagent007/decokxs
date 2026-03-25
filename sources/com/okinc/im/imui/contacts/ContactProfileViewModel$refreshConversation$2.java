package com.okinc.im.imui.contacts;

import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sGF;

/* JADX INFO: loaded from: classes8.dex */
public final class ContactProfileViewModel$refreshConversation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ContactProfileViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactProfileViewModel$refreshConversation$2(ContactProfileViewModel contactProfileViewModel, Continuation<? super ContactProfileViewModel$refreshConversation$2> continuation) {
        super(2, continuation);
        this.this$0 = contactProfileViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactProfileViewModel$refreshConversation$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ContactProfileViewModel$refreshConversation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Result resultM7376boximpl;
        sGF sgfKWHzl;
        Object objM8708initConversationByRelationIdBWLJW6A$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        OKConversation oKConversation = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35180nqU interfaceC35180nqU = this.this$0.gEmmrt;
            if (interfaceC35180nqU == null || (sgfKWHzl = interfaceC35180nqU.KWHzl()) == null) {
                resultM7376boximpl = null;
                if (resultM7376boximpl != null) {
                    Object objM7386unboximpl = resultM7376boximpl.m7386unboximpl();
                    C56391yDq.AEQbTJ(objM7386unboximpl);
                    oKConversation = (OKConversation) objM7386unboximpl;
                }
                this.this$0.DbNXlk.set("conversation", oKConversation);
                return Unit.INSTANCE;
            }
            String strKWHzl = this.this$0.KWHzl();
            this.label = 1;
            objM8708initConversationByRelationIdBWLJW6A$default = sGF.Activity.m8708initConversationByRelationIdBWLJW6A$default(sgfKWHzl, strKWHzl, null, null, this, 2, null);
            if (objM8708initConversationByRelationIdBWLJW6A$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8708initConversationByRelationIdBWLJW6A$default = ((Result) obj).m7386unboximpl();
        }
        resultM7376boximpl = Result.m7376boximpl(objM8708initConversationByRelationIdBWLJW6A$default);
        if (resultM7376boximpl != null) {
        }
        this.this$0.DbNXlk.set("conversation", oKConversation);
        return Unit.INSTANCE;
    }
}

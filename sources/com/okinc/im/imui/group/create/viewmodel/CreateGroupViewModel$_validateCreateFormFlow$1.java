package com.okinc.im.imui.group.create.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHT;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateGroupViewModel$_validateCreateFormFlow$1 extends SuspendLambda implements yHT<String, String, Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ CreateGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateGroupViewModel$_validateCreateFormFlow$1(CreateGroupViewModel createGroupViewModel, Continuation<? super CreateGroupViewModel$_validateCreateFormFlow$1> continuation) {
        super(4, continuation);
        this.this$0 = createGroupViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(String str, String str2, Boolean bool, Continuation<? super Boolean> continuation) {
        return invoke(str, str2, bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(String str, String str2, boolean z, Continuation<? super Boolean> continuation) {
        CreateGroupViewModel$_validateCreateFormFlow$1 createGroupViewModel$_validateCreateFormFlow$1 = new CreateGroupViewModel$_validateCreateFormFlow$1(this.this$0, continuation);
        createGroupViewModel$_validateCreateFormFlow$1.L$0 = str;
        createGroupViewModel$_validateCreateFormFlow$1.L$1 = str2;
        createGroupViewModel$_validateCreateFormFlow$1.Z$0 = z;
        return createGroupViewModel$_validateCreateFormFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56443yFo.KWHzl(this.this$0.KWHzl((String) this.L$0, (String) this.L$1, this.Z$0));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

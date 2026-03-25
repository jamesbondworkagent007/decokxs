package com.okinc.im.imui.group.create.viewmodel;

import com.okinc.im.imui.group.create.model.CreateGroupDisplayItem;
import com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateGroupViewModel$_contentUpdateFlow$2 extends SuspendLambda implements Function2<List<? extends CreateGroupDisplayItem>, Continuation<? super CreateGroupViewModel.Activity.C0415Activity>, Object> {
    /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CreateGroupViewModel$_contentUpdateFlow$2(Continuation<? super CreateGroupViewModel$_contentUpdateFlow$2> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateGroupViewModel$_contentUpdateFlow$2 createGroupViewModel$_contentUpdateFlow$2 = new CreateGroupViewModel$_contentUpdateFlow$2(continuation);
        createGroupViewModel$_contentUpdateFlow$2.L$0 = obj;
        return createGroupViewModel$_contentUpdateFlow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends CreateGroupDisplayItem> list, Continuation<? super CreateGroupViewModel.Activity.C0415Activity> continuation) {
        return ((CreateGroupViewModel$_contentUpdateFlow$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return new CreateGroupViewModel.Activity.C0415Activity((List) this.L$0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

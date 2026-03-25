package com.okinc.im.imui.group.create.viewmodel;

import com.okinc.im.imui.group.create.model.CreateGroupDisplayItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateGroupViewModel$_memberListFlow$2 extends SuspendLambda implements Function2<List<? extends String>, Continuation<? super List<? extends CreateGroupDisplayItem.MemberItem>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CreateGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateGroupViewModel$_memberListFlow$2(CreateGroupViewModel createGroupViewModel, Continuation<? super CreateGroupViewModel$_memberListFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = createGroupViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateGroupViewModel$_memberListFlow$2 createGroupViewModel$_memberListFlow$2 = new CreateGroupViewModel$_memberListFlow$2(this.this$0, continuation);
        createGroupViewModel$_memberListFlow$2.L$0 = obj;
        return createGroupViewModel$_memberListFlow$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends String> list, Continuation<? super List<? extends CreateGroupDisplayItem.MemberItem>> continuation) {
        return invoke2((List<String>) list, (Continuation<? super List<CreateGroupDisplayItem.MemberItem>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<String> list, Continuation<? super List<CreateGroupDisplayItem.MemberItem>> continuation) {
        return ((CreateGroupViewModel$_memberListFlow$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            CreateGroupViewModel createGroupViewModel = this.this$0;
            this.label = 1;
            obj = createGroupViewModel.KWHzl((List<String>) list, (Continuation<? super List<CreateGroupDisplayItem.MemberItem>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}

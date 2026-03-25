package com.okinc.im.imui.group.create.viewmodel;

import com.okinc.im.imui.group.create.model.CreateGroupDisplayItem;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.yHS;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateGroupViewModel$_contentUpdateFlow$1 extends SuspendLambda implements yHS<String, Boolean, Boolean, List<? extends CreateGroupDisplayItem.MemberItem>, Continuation<? super List<? extends CreateGroupDisplayItem>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ CreateGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateGroupViewModel$_contentUpdateFlow$1(CreateGroupViewModel createGroupViewModel, Continuation<? super CreateGroupViewModel$_contentUpdateFlow$1> continuation) {
        super(5, continuation);
        this.this$0 = createGroupViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHS
    public /* synthetic */ Object invoke(String str, Boolean bool, Boolean bool2, List<? extends CreateGroupDisplayItem.MemberItem> list, Continuation<? super List<? extends CreateGroupDisplayItem>> continuation) {
        return invoke(str, bool.booleanValue(), bool2.booleanValue(), (List<CreateGroupDisplayItem.MemberItem>) list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(String str, boolean z, boolean z2, List<CreateGroupDisplayItem.MemberItem> list, Continuation<? super List<? extends CreateGroupDisplayItem>> continuation) {
        CreateGroupViewModel$_contentUpdateFlow$1 createGroupViewModel$_contentUpdateFlow$1 = new CreateGroupViewModel$_contentUpdateFlow$1(this.this$0, continuation);
        createGroupViewModel$_contentUpdateFlow$1.L$0 = str;
        createGroupViewModel$_contentUpdateFlow$1.Z$0 = z;
        createGroupViewModel$_contentUpdateFlow$1.Z$1 = z2;
        createGroupViewModel$_contentUpdateFlow$1.L$1 = list;
        return createGroupViewModel$_contentUpdateFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String str = (String) this.L$0;
            boolean z = this.Z$0;
            boolean z2 = this.Z$1;
            List list = (List) this.L$1;
            CreateGroupViewModel createGroupViewModel = this.this$0;
            return createGroupViewModel.copydefault(str, (String) createGroupViewModel.OLrzqt.getValue(), z, z2, list);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

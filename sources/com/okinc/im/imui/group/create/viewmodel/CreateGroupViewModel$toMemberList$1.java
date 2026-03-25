package com.okinc.im.imui.group.create.viewmodel;

import com.okinc.im.imui.group.create.model.CreateGroupDisplayItem;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateGroupViewModel$toMemberList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CreateGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateGroupViewModel$toMemberList$1(CreateGroupViewModel createGroupViewModel, Continuation<? super CreateGroupViewModel$toMemberList$1> continuation) {
        super(continuation);
        this.this$0 = createGroupViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.KWHzl((List<String>) null, (Continuation<? super List<CreateGroupDisplayItem.MemberItem>>) this);
    }
}

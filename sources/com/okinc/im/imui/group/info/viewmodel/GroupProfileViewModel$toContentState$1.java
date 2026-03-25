package com.okinc.im.imui.group.info.viewmodel;

import com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.oDF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class GroupProfileViewModel$toContentState$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GroupProfileViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupProfileViewModel$toContentState$1(GroupProfileViewModel groupProfileViewModel, Continuation<? super GroupProfileViewModel$toContentState$1> continuation) {
        super(continuation);
        this.this$0 = groupProfileViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((oDF.StateListAnimator) null, (Continuation<? super GroupProfileViewModel.TaskDescription>) this);
    }
}

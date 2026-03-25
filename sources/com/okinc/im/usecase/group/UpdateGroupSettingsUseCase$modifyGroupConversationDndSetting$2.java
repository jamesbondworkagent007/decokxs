package com.okinc.im.usecase.group;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35782oDm;
import o.C56391yDq;
import o.C56442yFn;
import o.sGF;
import o.sNF;

/* JADX INFO: loaded from: classes8.dex */
public final class UpdateGroupSettingsUseCase$modifyGroupConversationDndSetting$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ boolean $noDisturb;
    int label;
    final /* synthetic */ C35782oDm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateGroupSettingsUseCase$modifyGroupConversationDndSetting$2(C35782oDm c35782oDm, String str, boolean z, Continuation<? super UpdateGroupSettingsUseCase$modifyGroupConversationDndSetting$2> continuation) {
        super(2, continuation);
        this.this$0 = c35782oDm;
        this.$groupId = str;
        this.$noDisturb = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdateGroupSettingsUseCase$modifyGroupConversationDndSetting$2(this.this$0, this.$groupId, this.$noDisturb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((UpdateGroupSettingsUseCase$modifyGroupConversationDndSetting$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sGF sgf = this.this$0.AEQbTJ;
            String str = this.$groupId;
            boolean z = this.$noDisturb;
            this.label = 1;
            obj = sgf.EZpvd(str, z, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        sNF.Application application = (sNF.Application) obj;
        if (application instanceof sNF.Application.C0941Application) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } else {
            if (!(application instanceof sNF.Application.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(((sNF.Application.StateListAnimator) application).EZpvd()));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}

package com.okinc.im.imui.group.publicgroup;

import android.content.Context;
import com.okinc.im.imui.group.publicgroup.PublicGroupInfoBottomsheetFragment$handleGroupClick$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33916nKp;
import o.C34168nTy;
import o.C56391yDq;
import o.C56442yFn;
import o.nZO;

/* JADX INFO: loaded from: classes16.dex */
public final class PublicGroupInfoBottomsheetFragment$handleGroupClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ String $invitationId;
    int label;
    final /* synthetic */ nZO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublicGroupInfoBottomsheetFragment$handleGroupClick$1(nZO nzo, String str, String str2, Continuation<? super PublicGroupInfoBottomsheetFragment$handleGroupClick$1> continuation) {
        super(2, continuation);
        this.this$0 = nzo;
        this.$groupId = str;
        this.$invitationId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PublicGroupInfoBottomsheetFragment$handleGroupClick$1(this.this$0, this.$groupId, this.$invitationId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PublicGroupInfoBottomsheetFragment$handleGroupClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C34168nTy c34168nTyAEQbTJ = this.this$0.AEQbTJ();
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String str = this.$groupId;
            String str2 = this.$invitationId;
            final nZO nzo = this.this$0;
            Function0<Unit> function0 = new Function0() { // from class: o.nZX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return PublicGroupInfoBottomsheetFragment$handleGroupClick$1.invokeSuspend$lambda$0(nzo);
                }
            };
            this.label = 1;
            if (c34168nTyAEQbTJ.EZpvd(contextRequireContext, str, str2, false, function0, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(nZO nzo) {
        C33916nKp c33916nKp = nzo.AEQbTJ;
        if (c33916nKp == null) {
            Intrinsics.gEmmrt("");
            c33916nKp = null;
        }
        c33916nKp.AEQbTJ.copydefault();
        nzo.EZpvd = false;
        nzo.dismiss();
        return Unit.INSTANCE;
    }
}

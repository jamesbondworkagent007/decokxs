package com.okinc.im.imui.messages.audio.call;

import com.okinc.im.imui.messages.audio.call.OKIMAudioCallViewModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC44427sPk;
import o.C35797oEa;
import o.C44124sEe;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class OKIMAudioCallViewModel$ringSelectedMembers$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currentGroupId;
    final /* synthetic */ List<String> $targetUids;
    int label;
    final /* synthetic */ OKIMAudioCallViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMAudioCallViewModel$ringSelectedMembers$1(List<String> list, OKIMAudioCallViewModel oKIMAudioCallViewModel, String str, Continuation<? super OKIMAudioCallViewModel$ringSelectedMembers$1> continuation) {
        super(2, continuation);
        this.$targetUids = list;
        this.this$0 = oKIMAudioCallViewModel;
        this.$currentGroupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKIMAudioCallViewModel$ringSelectedMembers$1(this.$targetUids, this.this$0, this.$currentGroupId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMAudioCallViewModel$ringSelectedMembers$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C44124sEe.imLogVoiceCall$default("ViewModel: ringing selected members - targetUids=" + this.$targetUids, null, 2, null);
            C35797oEa c35797oEa = this.this$0.fIwbmz;
            String str = this.$currentGroupId;
            List<String> list = this.$targetUids;
            this.label = 1;
            obj = c35797oEa.OLrzqt(str, list, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC44427sPk abstractC44427sPk = (AbstractC44427sPk) obj;
        if (abstractC44427sPk instanceof AbstractC44427sPk.StateListAnimator) {
            C44124sEe.imLogVoiceCall$default("ViewModel: ring members success", null, 2, null);
            MutableSharedFlow mutableSharedFlow = this.this$0.AhwBna;
            OKIMAudioCallViewModel.Application.C0465Application c0465Application = OKIMAudioCallViewModel.Application.C0465Application.KWHzl;
            this.label = 2;
            if (mutableSharedFlow.emit(c0465Application, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (!(abstractC44427sPk instanceof AbstractC44427sPk.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC44427sPk.Activity activity = (AbstractC44427sPk.Activity) abstractC44427sPk;
            C44124sEe.imLogVoiceCall$default("ViewModel: ring members failed - code=" + activity.OLrzqt(), null, 2, null);
            MutableSharedFlow mutableSharedFlow2 = this.this$0.AhwBna;
            OKIMAudioCallViewModel.Application.TaskDescription taskDescription = new OKIMAudioCallViewModel.Application.TaskDescription(activity.OLrzqt(), activity.KWHzl());
            this.label = 3;
            if (mutableSharedFlow2.emit(taskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}

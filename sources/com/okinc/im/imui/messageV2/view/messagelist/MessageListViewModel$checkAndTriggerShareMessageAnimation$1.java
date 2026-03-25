package com.okinc.im.imui.messageV2.view.messagelist;

import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel$checkAndTriggerShareMessageAnimation$1;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKShareMessage;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C35254nrp;
import o.C35872oGv;
import o.C36558odI;
import o.C56391yDq;
import o.C56442yFn;
import o.C59467zhb;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$checkAndTriggerShareMessageAnimation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $firstVisiblePosition;
    final /* synthetic */ int $lastVisiblePosition;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$checkAndTriggerShareMessageAnimation$1(int i, int i2, MessageListViewModel messageListViewModel, Continuation<? super MessageListViewModel$checkAndTriggerShareMessageAnimation$1> continuation) {
        super(2, continuation);
        this.$firstVisiblePosition = i;
        this.$lastVisiblePosition = i2;
        this.this$0 = messageListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListViewModel$checkAndTriggerShareMessageAnimation$1(this.$firstVisiblePosition, this.$lastVisiblePosition, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$checkAndTriggerShareMessageAnimation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C36558odI c36558odIKWHzl;
        final List<C35254nrp> listAEQbTJ;
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("MessageListViewModel", "checkAndTriggerShareMessageAnimation - range: " + this.$firstVisiblePosition + ".." + this.$lastVisiblePosition);
            MessageListViewModel.ActionBar value = this.this$0.AhwBna().getValue();
            if (value == null || (c36558odIKWHzl = value.KWHzl()) == null || (listAEQbTJ = c36558odIKWHzl.AEQbTJ()) == null) {
                return Unit.INSTANCE;
            }
            Sequence sequenceFJNWhG = C59467zhb.fJNWhG(CollectionsKt___CollectionsKt.QVAiDq(new IntRange(this.$firstVisiblePosition, this.$lastVisiblePosition)), new Function1() { // from class: o.omS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return MessageListViewModel$checkAndTriggerShareMessageAnimation$1.invokeSuspend$lambda$0(listAEQbTJ, ((java.lang.Integer) obj2).intValue());
                }
            });
            MessageListViewModel messageListViewModel = this.this$0;
            Iterator it = sequenceFJNWhG.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (messageListViewModel.AuCTel.AEQbTJ(((OKShareMessage) next).getShareExtra()) != null) {
                    break;
                }
            }
            OKShareMessage oKShareMessage = (OKShareMessage) next;
            String strAEQbTJ = this.this$0.AuCTel.AEQbTJ(oKShareMessage != null ? oKShareMessage.getShareExtra() : null);
            pUU.EZpvd("MessageListViewModel", "checkAndTriggerShareMessageAnimation - foundShareMessage: " + (oKShareMessage != null) + ", path: " + strAEQbTJ);
            C35872oGv c35872oGv = this.this$0.AuCTel;
            this.label = 1;
            obj = c35872oGv.copydefault(strAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C35872oGv.Activity activity = (C35872oGv.Activity) obj;
        if (activity instanceof C35872oGv.Activity.TaskDescription) {
            C35872oGv.Activity.TaskDescription taskDescription = (C35872oGv.Activity.TaskDescription) activity;
            pUU.KWHzl("MessageListViewModel", "checkAndTriggerShareMessageAnimation - triggering animation: " + taskDescription.OLrzqt());
            MutableSharedFlow mutableSharedFlow = this.this$0.DbNXlk;
            String strOLrzqt = taskDescription.OLrzqt();
            this.label = 2;
            if (mutableSharedFlow.emit(strOLrzqt, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            pUU.EZpvd("MessageListViewModel", "checkAndTriggerShareMessageAnimation - animation skipped");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OKShareMessage invokeSuspend$lambda$0(List list, int i) {
        OKMessage oKMessageOLrzqt;
        C35254nrp c35254nrp = (C35254nrp) CollectionsKt___CollectionsKt.AkhnZx(list, i);
        OKMessageContent content = (c35254nrp == null || (oKMessageOLrzqt = c35254nrp.OLrzqt()) == null) ? null : oKMessageOLrzqt.getContent();
        if (content instanceof OKShareMessage) {
            return (OKShareMessage) content;
        }
        return null;
    }
}

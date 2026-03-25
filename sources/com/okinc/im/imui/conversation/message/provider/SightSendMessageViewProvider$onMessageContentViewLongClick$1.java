package com.okinc.im.imui.conversation.message.provider;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuInfoAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuRecallAction;
import com.okinc.im.imui.conversation.message.provider.base.moreaction.MenuReplyAction;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC44112sDu;
import o.C33129mqd;
import o.C35254nrp;
import o.C35802oEf;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.nCE;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class SightSendMessageViewProvider$onMessageContentViewLongClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C35254nrp $item;
    final /* synthetic */ ViewBinding $parentView;
    Object L$0;
    int label;
    final /* synthetic */ nCE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SightSendMessageViewProvider$onMessageContentViewLongClick$1(C35254nrp c35254nrp, nCE nce, ViewBinding viewBinding, Continuation<? super SightSendMessageViewProvider$onMessageContentViewLongClick$1> continuation) {
        super(2, continuation);
        this.$item = c35254nrp;
        this.this$0 = nce;
        this.$parentView = viewBinding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SightSendMessageViewProvider$onMessageContentViewLongClick$1(this.$item, this.this$0, this.$parentView, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SightSendMessageViewProvider$onMessageContentViewLongClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        ArrayList arrayList2;
        LinearLayoutCompat linearLayoutCompat;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            arrayList = new ArrayList();
            if (this.$item.OLrzqt().getConversationType() != OKConversationType.BROADCAST) {
                if (C44157sFk.EZpvd(this.$item.OLrzqt())) {
                    arrayList.add(new MenuReplyAction());
                }
                C35802oEf c35802oEfValueOf = this.this$0.valueOf();
                OKMessage oKMessageOLrzqt = this.$item.OLrzqt();
                this.L$0 = arrayList;
                this.label = 1;
                Object objKWHzl = c35802oEfValueOf.KWHzl(oKMessageOLrzqt, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                arrayList2 = arrayList;
                obj = objKWHzl;
            }
            arrayList.add(new MenuInfoAction());
            if (C33129mqd.KWHzl((Collection) arrayList)) {
                ViewBinding viewBinding = this.$parentView;
                AbstractC44112sDu abstractC44112sDu = viewBinding instanceof AbstractC44112sDu ? (AbstractC44112sDu) viewBinding : null;
                if (abstractC44112sDu != null && (linearLayoutCompat = abstractC44112sDu.AhwBna) != null) {
                    nCE nce = this.this$0;
                    C35254nrp c35254nrp = this.$item;
                    yHO yhoAuCTel = nce.AuCTel();
                    if (yhoAuCTel != null) {
                        yhoAuCTel.invoke(linearLayoutCompat, arrayList, c35254nrp);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        arrayList2 = (ArrayList) this.L$0;
        C56391yDq.AEQbTJ(obj);
        if (((Boolean) obj).booleanValue()) {
            arrayList2.add(new MenuRecallAction());
        }
        arrayList = arrayList2;
        arrayList.add(new MenuInfoAction());
        if (C33129mqd.KWHzl((Collection) arrayList)) {
        }
        return Unit.INSTANCE;
    }
}

package com.okinc.im.imui.conversation.message.provider;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.menu.MenuActionBase;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC44111sDt;
import o.C33129mqd;
import o.C33670nBm;
import o.C35254nrp;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class FileReceiveMessageViewProvider$onMessageContentViewLongClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C35254nrp $item;
    final /* synthetic */ ViewBinding $parentView;
    int label;
    final /* synthetic */ C33670nBm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileReceiveMessageViewProvider$onMessageContentViewLongClick$1(C33670nBm c33670nBm, C35254nrp c35254nrp, ViewBinding viewBinding, Continuation<? super FileReceiveMessageViewProvider$onMessageContentViewLongClick$1> continuation) {
        super(2, continuation);
        this.this$0 = c33670nBm;
        this.$item = c35254nrp;
        this.$parentView = viewBinding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FileReceiveMessageViewProvider$onMessageContentViewLongClick$1(this.this$0, this.$item, this.$parentView, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FileReceiveMessageViewProvider$onMessageContentViewLongClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LinearLayoutCompat linearLayoutCompat;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C33670nBm c33670nBm = this.this$0;
            C35254nrp c35254nrp = this.$item;
            this.label = 1;
            obj = c33670nBm.AEQbTJ(c35254nrp, (Continuation<? super List<? extends MenuActionBase>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        if (C33129mqd.KWHzl((Collection) list)) {
            ViewBinding viewBinding = this.$parentView;
            AbstractC44111sDt abstractC44111sDt = viewBinding instanceof AbstractC44111sDt ? (AbstractC44111sDt) viewBinding : null;
            if (abstractC44111sDt != null && (linearLayoutCompat = abstractC44111sDt.AhwBna) != null) {
                yHO yhoAuCTel = this.this$0.AuCTel();
                if (yhoAuCTel != null) {
                    yhoAuCTel.invoke(linearLayoutCompat, list, this.$item);
                }
            } else {
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}

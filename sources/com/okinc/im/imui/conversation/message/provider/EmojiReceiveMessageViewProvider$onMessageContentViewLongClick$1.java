package com.okinc.im.imui.conversation.message.provider;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.okinc.im.imui.conversation.message.provider.EmojiReceiveMessageViewProvider$onMessageContentViewLongClick$1;
import com.okinc.okimcore.model.im.OKConversation;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC44111sDt;
import o.C33664nBg;
import o.C33733nDv;
import o.C35254nrp;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class EmojiReceiveMessageViewProvider$onMessageContentViewLongClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C35254nrp $item;
    final /* synthetic */ ViewBinding $parentView;
    int label;
    final /* synthetic */ C33664nBg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiReceiveMessageViewProvider$onMessageContentViewLongClick$1(C35254nrp c35254nrp, C33664nBg c33664nBg, ViewBinding viewBinding, Continuation<? super EmojiReceiveMessageViewProvider$onMessageContentViewLongClick$1> continuation) {
        super(2, continuation);
        this.$item = c35254nrp;
        this.this$0 = c33664nBg;
        this.$parentView = viewBinding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmojiReceiveMessageViewProvider$onMessageContentViewLongClick$1(this.$item, this.this$0, this.$parentView, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EmojiReceiveMessageViewProvider$onMessageContentViewLongClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LinearLayoutCompat linearLayoutCompat;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C33733nDv c33733nDv = C33733nDv.copydefault;
            final C35254nrp c35254nrp = this.$item;
            final C33664nBg c33664nBg = this.this$0;
            Function0<Boolean> function0 = new Function0() { // from class: o.nBj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(EmojiReceiveMessageViewProvider$onMessageContentViewLongClick$1.invokeSuspend$lambda$0(c33664nBg, c35254nrp));
                }
            };
            Function0<OKConversation> function0FetchVPNInfo = this.this$0.fetchVPNInfo();
            this.label = 1;
            obj = c33733nDv.OLrzqt(c35254nrp, function0, function0FetchVPNInfo, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        ArrayList arrayList = (ArrayList) obj;
        if (!arrayList.isEmpty()) {
            ViewBinding viewBinding = this.$parentView;
            AbstractC44111sDt abstractC44111sDt = viewBinding instanceof AbstractC44111sDt ? (AbstractC44111sDt) viewBinding : null;
            if (abstractC44111sDt != null && (linearLayoutCompat = abstractC44111sDt.AhwBna) != null) {
                C33664nBg c33664nBg2 = this.this$0;
                C35254nrp c35254nrp2 = this.$item;
                yHO yhoAuCTel = c33664nBg2.AuCTel();
                if (yhoAuCTel != null) {
                    yhoAuCTel.invoke(linearLayoutCompat, arrayList, c35254nrp2);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(C33664nBg c33664nBg, C35254nrp c35254nrp) {
        return c33664nBg.copydefault(c35254nrp.OLrzqt());
    }
}

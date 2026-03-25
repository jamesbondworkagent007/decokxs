package com.okinc.im.imui.messageV2.view.banner.replymessage;

import androidx.lifecycle.LiveDataScope;
import com.okinc.im.imui.messageV2.view.banner.replymessage.ReplyMessageBannerViewModel;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C37683oyU;
import o.C44461sQr;
import o.C56391yDq;
import o.C56442yFn;
import o.sKH;

/* JADX INFO: loaded from: classes8.dex */
public final class ReplyMessageBannerViewModel$referenceMessageData$1$2$1 extends SuspendLambda implements Function2<LiveDataScope<ReplyMessageBannerViewModel.ActionBar>, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKMessage $message;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReplyMessageBannerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplyMessageBannerViewModel$referenceMessageData$1$2$1(OKMessage oKMessage, ReplyMessageBannerViewModel replyMessageBannerViewModel, Continuation<? super ReplyMessageBannerViewModel$referenceMessageData$1$2$1> continuation) {
        super(2, continuation);
        this.$message = oKMessage;
        this.this$0 = replyMessageBannerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ReplyMessageBannerViewModel$referenceMessageData$1$2$1 replyMessageBannerViewModel$referenceMessageData$1$2$1 = new ReplyMessageBannerViewModel$referenceMessageData$1$2$1(this.$message, this.this$0, continuation);
        replyMessageBannerViewModel$referenceMessageData$1$2$1.L$0 = obj;
        return replyMessageBannerViewModel$referenceMessageData$1$2$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ReplyMessageBannerViewModel.ActionBar> liveDataScope, Continuation<? super Unit> continuation) {
        return ((ReplyMessageBannerViewModel$referenceMessageData$1$2$1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        LiveDataScope liveDataScope;
        ReplyMessageBannerViewModel.ActionBar actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    liveDataScope = (LiveDataScope) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    C44461sQr c44461sQr = (C44461sQr) obj;
                    actionBar = new ReplyMessageBannerViewModel.ActionBar(this.$message, c44461sQr == null ? C37683oyU.copydefault(c44461sQr) : null);
                    this.L$0 = null;
                    this.label = 3;
                    if (liveDataScope.emit(actionBar, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            liveDataScope = (LiveDataScope) this.L$0;
            OKMessage oKMessage = this.$message;
            if (oKMessage != null) {
                sKH skh = this.this$0.OLrzqt;
                this.L$0 = liveDataScope;
                this.label = 2;
                obj = skh.OLrzqt(oKMessage, (String) null, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                C44461sQr c44461sQr2 = (C44461sQr) obj;
                actionBar = new ReplyMessageBannerViewModel.ActionBar(this.$message, c44461sQr2 == null ? C37683oyU.copydefault(c44461sQr2) : null);
                this.L$0 = null;
                this.label = 3;
                if (liveDataScope.emit(actionBar, this) == objCopydefault) {
                }
            } else {
                this.label = 1;
                if (liveDataScope.emit(null, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        return Unit.INSTANCE;
    }
}

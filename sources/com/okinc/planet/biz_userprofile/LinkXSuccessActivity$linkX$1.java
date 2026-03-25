package com.okinc.planet.biz_userprofile;

import android.graphics.drawable.Drawable;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.AbstractC46226tMm;
import o.ActivityC46157tJy;
import o.C43393roT;
import o.C43401rob;
import o.C43422row;
import o.C52794wYp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.pUU;
import o.tQP;

/* JADX INFO: loaded from: classes10.dex */
public final class LinkXSuccessActivity$linkX$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $finish;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC46157tJy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkXSuccessActivity$linkX$1(boolean z, ActivityC46157tJy activityC46157tJy, Continuation<? super LinkXSuccessActivity$linkX$1> continuation) {
        super(2, continuation);
        this.$finish = z;
        this.this$0 = activityC46157tJy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LinkXSuccessActivity$linkX$1 linkXSuccessActivity$linkX$1 = new LinkXSuccessActivity$linkX$1(this.$finish, this.this$0, continuation);
        linkXSuccessActivity$linkX$1.L$0 = obj;
        return linkXSuccessActivity$linkX$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LinkXSuccessActivity$linkX$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                tQP tqp = (tQP) C43393roT.httpService$default(C56524yIo.AEQbTJ(tQP.class), null, 1, null);
                Object obj2 = new Object();
                this.label = 1;
                obj = tqp.copydefault(obj2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0) {
                actionBar = new AbstractC43419rot.StateListAnimator(responseData.getData());
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            if (this.$finish) {
                AbstractC46226tMm abstractC46226tMm = this.this$0.AEQbTJ;
                if (abstractC46226tMm != null && (c52794wYp2 = abstractC46226tMm.OLrzqt) != null) {
                    c52794wYp2.fIwbmz();
                }
                this.this$0.setResult(-1);
                this.this$0.finish();
            } else {
                this.this$0.copydefault = true;
            }
        } else {
            if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.$finish) {
                AbstractC46226tMm abstractC46226tMm2 = this.this$0.AEQbTJ;
                if (abstractC46226tMm2 != null && (c52794wYp = abstractC46226tMm2.OLrzqt) != null) {
                    c52794wYp.fIwbmz();
                }
                C55326xho.toast$default(((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()).getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }
}

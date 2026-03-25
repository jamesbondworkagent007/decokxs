package com.okinc.auth.impl.facerecognition.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.activity.result.ActivityResultLauncher;
import com.okinc.auth.api.facerecognition.FacialRecognitionResponse;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC5688aBG;
import o.ActivityC5732aBy;
import o.C33129mqd;
import o.C43251rlk;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.pUU;
import o.rTU;

/* JADX INFO: loaded from: classes14.dex */
public final class FaceRecognitionActivity$observeFaceVerify$1 extends SuspendLambda implements Function2<AbstractC5688aBG, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC5732aBy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceRecognitionActivity$observeFaceVerify$1(ActivityC5732aBy activityC5732aBy, Continuation<? super FaceRecognitionActivity$observeFaceVerify$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC5732aBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FaceRecognitionActivity$observeFaceVerify$1 faceRecognitionActivity$observeFaceVerify$1 = new FaceRecognitionActivity$observeFaceVerify$1(this.this$0, continuation);
        faceRecognitionActivity$observeFaceVerify$1.L$0 = obj;
        return faceRecognitionActivity$observeFaceVerify$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC5688aBG abstractC5688aBG, Continuation<? super Unit> continuation) {
        return ((FaceRecognitionActivity$observeFaceVerify$1) create(abstractC5688aBG, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map mapEZpvd;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC5688aBG abstractC5688aBG = (AbstractC5688aBG) this.L$0;
            if (abstractC5688aBG instanceof AbstractC5688aBG.StateListAnimator) {
                AbstractC5688aBG.StateListAnimator stateListAnimator = (AbstractC5688aBG.StateListAnimator) abstractC5688aBG;
                pUU.KWHzl("FacialRecognitionActivity", "Face Verify Failed: " + stateListAnimator.copydefault() + ", " + stateListAnimator.AEQbTJ());
                this.this$0.KWHzl(new FacialRecognitionResponse.Failure(stateListAnimator.copydefault(), stateListAnimator.AEQbTJ()));
            } else if (abstractC5688aBG instanceof AbstractC5688aBG.ActionBar) {
                AbstractC5688aBG.ActionBar actionBar = (AbstractC5688aBG.ActionBar) abstractC5688aBG;
                pUU.KWHzl("FacialRecognitionActivity", "Start Face Verify SDK: " + actionBar.KWHzl());
                rTU rtu = (rTU) C43251rlk.OLrzqt(rTU.class);
                if (rtu != null) {
                    ActivityC5732aBy activityC5732aBy = this.this$0;
                    String strKWHzl = actionBar.KWHzl();
                    ActivityResultLauncher<Intent> activityResultLauncher = this.this$0.KWHzl;
                    if (C33129mqd.OLrzqt((CharSequence) actionBar.OLrzqt())) {
                        String strOLrzqt = actionBar.OLrzqt();
                        if (strOLrzqt == null) {
                            strOLrzqt = "";
                        }
                        mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt("Subdomain-Strategy", strOLrzqt));
                    } else {
                        mapEZpvd = null;
                    }
                    rtu.AEQbTJ(activityC5732aBy, strKWHzl, activityResultLauncher, new FacialExtParams(mapEZpvd, actionBar.copydefault()));
                }
            } else if (abstractC5688aBG instanceof AbstractC5688aBG.TaskDescription) {
                AbstractC5688aBG.TaskDescription taskDescription = (AbstractC5688aBG.TaskDescription) abstractC5688aBG;
                pUU.KWHzl("FacialRecognitionActivity", "Face Verify Error: " + taskDescription.OLrzqt());
                C55326xho.toast$default(taskDescription.OLrzqt(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                this.this$0.KWHzl(FacialRecognitionResponse.Cancel.OLrzqt);
            } else if (abstractC5688aBG instanceof AbstractC5688aBG.Activity) {
                pUU.KWHzl("FacialRecognitionActivity", "SuccessVerify");
                this.this$0.KWHzl(new FacialRecognitionResponse.Success(((AbstractC5688aBG.Activity) abstractC5688aBG).copydefault()));
            } else {
                if (!(abstractC5688aBG instanceof AbstractC5688aBG.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                pUU.KWHzl("FacialRecognitionActivity", "MaxTry");
                this.this$0.KWHzl(new FacialRecognitionResponse.MaxTry(((AbstractC5688aBG.Application) abstractC5688aBG).AEQbTJ()));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package com.okinc.planet.biz_setting;

import android.content.Intent;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC46100tHv;
import o.ActivityC46157tJy;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.tKR;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetProfileSettingActivity$handleXAccountClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC46100tHv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetProfileSettingActivity$handleXAccountClick$1(ActivityC46100tHv activityC46100tHv, Continuation<? super PlanetProfileSettingActivity$handleXAccountClick$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC46100tHv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetProfileSettingActivity$handleXAccountClick$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetProfileSettingActivity$handleXAccountClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.showLoading();
                tKR tkr = tKR.KWHzl;
                this.label = 1;
                objAEQbTJ = tkr.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
            boolean zBooleanValue = ((Boolean) objAEQbTJ).booleanValue();
            this.this$0.dismissLoading();
            if (!zBooleanValue) {
                this.this$0.djBIcL.launch(Unit.INSTANCE);
            } else {
                this.this$0.startActivity(new Intent(this.this$0, (Class<?>) ActivityC46157tJy.class));
            }
        } catch (Exception e) {
            this.this$0.dismissLoading();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pUU.valueOf("LinkX pre-check failed", message);
        }
        return Unit.INSTANCE;
    }
}

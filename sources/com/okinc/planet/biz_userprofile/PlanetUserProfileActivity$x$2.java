package com.okinc.planet.biz_userprofile;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC46157tJy;
import o.C47501trL;
import o.C55284xgz;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.tJI;
import o.tKR;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetUserProfileActivity$x$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ tJI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetUserProfileActivity$x$2(tJI tji, Continuation<? super PlanetUserProfileActivity$x$2> continuation) {
        super(2, continuation);
        this.this$0 = tji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetUserProfileActivity$x$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetUserProfileActivity$x$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (zBooleanValue) {
                ActivityResultLauncher activityResultLauncher = this.this$0.fetchVPNInfo;
                if (activityResultLauncher == null) {
                    Intrinsics.gEmmrt("");
                    activityResultLauncher = null;
                }
                activityResultLauncher.launch(new Intent(this.this$0, (Class<?>) ActivityC46157tJy.class));
            } else {
                this.this$0.AkhnZx.launch(Unit.INSTANCE);
            }
        } catch (Exception e) {
            this.this$0.dismissLoading();
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pUU.valueOf("LinkX pre-check failed", message);
            C55284xgz.Activity activity = C55284xgz.Companion;
            ConstraintLayout root = this.this$0.gEmmrt().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            String message2 = e.getMessage();
            if (message2 == null) {
                message2 = String.valueOf(C47501trL.Fragment.apAOXX);
            }
            C55284xgz c55284xgzKWHzl = activity.KWHzl(root, message2);
            if (c55284xgzKWHzl != null) {
                c55284xgzKWHzl.isConnected(2);
                c55284xgzKWHzl.hDKMBd();
            }
        }
        return Unit.INSTANCE;
    }
}

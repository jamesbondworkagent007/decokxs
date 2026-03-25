package com.okinc.liveness.lca.debugtool.ui;

import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.liveness.lca.debugtool.data.LcaDebugDataManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import o.C45694suq;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaDebugResultActivity$handlePredictionResponse$1$11$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LcaDebugResultActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LcaDebugResultActivity$handlePredictionResponse$1$11$1(LcaDebugResultActivity lcaDebugResultActivity, Continuation<? super LcaDebugResultActivity$handlePredictionResponse$1$11$1> continuation) {
        super(2, continuation);
        this.this$0 = lcaDebugResultActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LcaDebugResultActivity$handlePredictionResponse$1$11$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LcaDebugResultActivity$handlePredictionResponse$1$11$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        C45694suq c45694suq = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C45694suq c45694suq2 = this.this$0.binding;
                if (c45694suq2 == null) {
                    Intrinsics.gEmmrt("");
                    c45694suq2 = null;
                }
                ProgressBar progressBar = c45694suq2.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(progressBar, "");
                progressBar.setVisibility(0);
                C45694suq c45694suq3 = this.this$0.binding;
                if (c45694suq3 == null) {
                    Intrinsics.gEmmrt("");
                    c45694suq3 = null;
                }
                c45694suq3.AEQbTJ.setEnabled(false);
                Deferred jsonAsync = this.this$0.formatJsonAsync(LcaDebugDataManager.INSTANCE.getResponseRawJson());
                this.label = 1;
                obj = jsonAsync.await(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            final String str = (String) obj;
            C45694suq c45694suq4 = this.this$0.binding;
            if (c45694suq4 == null) {
                Intrinsics.gEmmrt("");
                c45694suq4 = null;
            }
            ProgressBar progressBar2 = c45694suq4.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(progressBar2, "");
            progressBar2.setVisibility(8);
            C45694suq c45694suq5 = this.this$0.binding;
            if (c45694suq5 == null) {
                Intrinsics.gEmmrt("");
                c45694suq5 = null;
            }
            c45694suq5.AEQbTJ.setEnabled(true);
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.this$0);
            final LcaDebugResultActivity lcaDebugResultActivity = this.this$0;
            viewOnClickListenerC54939xaY.setTitle("Response JSON");
            viewOnClickListenerC54939xaY.EZpvd(str);
            viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) "OK", (View.OnClickListener) null);
            viewOnClickListenerC54939xaY.AEQbTJ("Copy", new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$handlePredictionResponse$1$11$1$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LcaDebugResultActivity$handlePredictionResponse$1$11$1.invokeSuspend$lambda$1$lambda$0(viewOnClickListenerC54939xaY, lcaDebugResultActivity, str, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        } catch (Exception unused) {
            C45694suq c45694suq6 = this.this$0.binding;
            if (c45694suq6 == null) {
                Intrinsics.gEmmrt("");
                c45694suq6 = null;
            }
            ProgressBar progressBar3 = c45694suq6.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(progressBar3, "");
            progressBar3.setVisibility(8);
            C45694suq c45694suq7 = this.this$0.binding;
            if (c45694suq7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c45694suq = c45694suq7;
            }
            c45694suq.AEQbTJ.setEnabled(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1$lambda$0(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, LcaDebugResultActivity lcaDebugResultActivity, String str, View view) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewOnClickListenerC54939xaY), Dispatchers.getIO(), null, new LcaDebugResultActivity$handlePredictionResponse$1$11$1$1$1$1(lcaDebugResultActivity, str, null), 2, null);
    }
}

package com.okinc.liveness.lca.debugtool.ui;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.liveness.lca.debugtool.data.LcaDebugDataManager;
import com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$handleJwstQueryResultResponse$6$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaDebugResultActivity$handleJwstQueryResultResponse$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LcaDebugResultActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LcaDebugResultActivity$handleJwstQueryResultResponse$6$1(LcaDebugResultActivity lcaDebugResultActivity, Continuation<? super LcaDebugResultActivity$handleJwstQueryResultResponse$6$1> continuation) {
        super(2, continuation);
        this.this$0 = lcaDebugResultActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LcaDebugResultActivity$handleJwstQueryResultResponse$6$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LcaDebugResultActivity$handleJwstQueryResultResponse$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Deferred jsonAsync = this.this$0.formatJsonAsync(LcaDebugDataManager.INSTANCE.getRequestRawJson());
            this.label = 1;
            obj = jsonAsync.await(this);
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
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, (String) obj, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$handleJwstQueryResultResponse$6$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $formattedJson;
        int label;
        final /* synthetic */ LcaDebugResultActivity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LcaDebugResultActivity lcaDebugResultActivity, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = lcaDebugResultActivity;
            this.$formattedJson = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$formattedJson, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.this$0);
                final String str = this.$formattedJson;
                final LcaDebugResultActivity lcaDebugResultActivity = this.this$0;
                viewOnClickListenerC54939xaY.setTitle("Request JSON (WSLightCaptchaVideoParamsRequestCommand)");
                viewOnClickListenerC54939xaY.EZpvd(str);
                viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) "OK", (View.OnClickListener) null);
                viewOnClickListenerC54939xaY.AEQbTJ("Copy", new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugResultActivity$handleJwstQueryResultResponse$6$1$1$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LcaDebugResultActivity$handleJwstQueryResultResponse$6$1.AnonymousClass1.invokeSuspend$lambda$1$lambda$0(viewOnClickListenerC54939xaY, lcaDebugResultActivity, str, view);
                    }
                });
                viewOnClickListenerC54939xaY.show();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1$lambda$0(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, LcaDebugResultActivity lcaDebugResultActivity, String str, View view) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewOnClickListenerC54939xaY), Dispatchers.getMain(), null, new LcaDebugResultActivity$handleJwstQueryResultResponse$6$1$1$1$1$1(lcaDebugResultActivity, str, null), 2, null);
        }
    }
}

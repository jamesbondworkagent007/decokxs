package com.okinc.planet.utils;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import o.C46355tRg;
import o.C46388tSm;
import o.C55284xgz;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;
import o.tQP;
import o.tQQ;
import o.tQS;
import o.wYK;

/* JADX INFO: loaded from: classes10.dex */
public final class OpenPublisherUiUtil$showAgreeTncDialog$dialog$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ View $anchorView;
    final /* synthetic */ wYK $checkBox;
    final /* synthetic */ String $description;
    final /* synthetic */ Function0<Unit> $nextCallBack;
    final /* synthetic */ ViewOnClickListenerC54939xaY $this_apply;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPublisherUiUtil$showAgreeTncDialog$dialog$1$1$2(wYK wyk, Function0<Unit> function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view, String str, Continuation<? super OpenPublisherUiUtil$showAgreeTncDialog$dialog$1$1$2> continuation) {
        super(2, continuation);
        this.$checkBox = wyk;
        this.$nextCallBack = function0;
        this.$this_apply = viewOnClickListenerC54939xaY;
        this.$anchorView = view;
        this.$description = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OpenPublisherUiUtil$showAgreeTncDialog$dialog$1$1$2(this.$checkBox, this.$nextCallBack, this.$this_apply, this.$anchorView, this.$description, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OpenPublisherUiUtil$showAgreeTncDialog$dialog$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        C55284xgz c55284xgzKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C46355tRg c46355tRg = new C46355tRg(new tQQ(new Application().AEQbTJ(), Dispatchers.getIO()));
            boolean zIsChecked = this.$checkBox.isChecked();
            this.label = 1;
            obj = c46355tRg.EZpvd(zIsChecked, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
            this.$nextCallBack.invoke();
            this.$this_apply.dismiss();
        } else {
            View view = this.$anchorView;
            if (view != null && (c55284xgzKWHzl = C55284xgz.Companion.KWHzl(view, (str = this.$description))) != null) {
                c55284xgzKWHzl.isConnected(1);
                c55284xgzKWHzl.djBIcL(0);
                c55284xgzKWHzl.AEQbTJ(str);
                c55284xgzKWHzl.hDKMBd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements tQS {
        public tQP AEQbTJ() {
            return tQS.TaskDescription.EZpvd(this);
        }
    }

    /* JADX INFO: renamed from: com.okinc.planet.utils.OpenPublisherUiUtil$showAgreeTncDialog$dialog$1$1$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C46388tSm c46388tSmKWHzl = C46388tSm.Companion.KWHzl();
                this.label = 1;
                if (c46388tSmKWHzl.KWHzl(this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }
}

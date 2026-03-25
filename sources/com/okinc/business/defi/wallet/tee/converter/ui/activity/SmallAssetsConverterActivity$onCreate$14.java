package com.okinc.business.defi.wallet.tee.converter.ui.activity;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.dex.api.bean.sa_small_assets.CheckRepeatResult;
import com.okinc.network.okg.response.OKServerException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC43419rot;
import o.ActivityC17837fUc;
import o.C16434ejp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.fUF;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterActivity$onCreate$14 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC17837fUc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallAssetsConverterActivity$onCreate$14(ActivityC17837fUc activityC17837fUc, Continuation<? super SmallAssetsConverterActivity$onCreate$14> continuation) {
        super(2, continuation);
        this.this$0 = activityC17837fUc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmallAssetsConverterActivity$onCreate$14(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmallAssetsConverterActivity$onCreate$14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterActivity$onCreate$14$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC43419rot<? extends CheckRepeatResult, ? extends OKServerException>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ActivityC17837fUc this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC17837fUc activityC17837fUc, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC17837fUc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AbstractC43419rot<? extends CheckRepeatResult, ? extends OKServerException> abstractC43419rot, Continuation<? super Unit> continuation) {
            return invoke2((AbstractC43419rot<CheckRepeatResult, OKServerException>) abstractC43419rot, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AbstractC43419rot<CheckRepeatResult, OKServerException> abstractC43419rot, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(abstractC43419rot, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC43419rot abstractC43419rot = (AbstractC43419rot) this.L$0;
                C16434ejp c16434ejp = null;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    C16434ejp c16434ejp2 = this.this$0.valueOf;
                    if (c16434ejp2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c16434ejp = c16434ejp2;
                    }
                    c16434ejp.EZpvd.fIwbmz();
                    if (!((CheckRepeatResult) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).AEQbTJ()).getCanOrder()) {
                        this.this$0.DbNXlk();
                    } else {
                        fUF fuf = new fUF();
                        FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        fuf.show(supportFragmentManager);
                    }
                } else {
                    if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String message = ((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getMessage();
                    if (message != null) {
                        C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.AYXKKw().AYXKKw());
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == objCopydefault) {
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

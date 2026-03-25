package com.okinc.business.market.features.address_tracker.domain;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25352ivB;
import o.C33070mpX;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC25657jBn;
import o.jAC;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerApiKt$handleFollow$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Boolean, Unit> $callback;
    final /* synthetic */ Context $context;
    final /* synthetic */ jAC $it;
    final /* synthetic */ InterfaceC25657jBn $selectionChangeType;
    final /* synthetic */ boolean $showToast;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TrackerApiKt$handleFollow$2$1(jAC jac, Function1<? super Boolean, Unit> function1, InterfaceC25657jBn interfaceC25657jBn, boolean z, Context context, Continuation<? super TrackerApiKt$handleFollow$2$1> continuation) {
        super(2, continuation);
        this.$it = jac;
        this.$callback = function1;
        this.$selectionChangeType = interfaceC25657jBn;
        this.$showToast = z;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerApiKt$handleFollow$2$1(this.$it, this.$callback, this.$selectionChangeType, this.$showToast, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerApiKt$handleFollow$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (Intrinsics.EZpvd(this.$it, jAC.ActionBar.copydefault)) {
                Function1<Boolean, Unit> function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(C56443yFo.KWHzl(!Intrinsics.EZpvd(this.$selectionChangeType, InterfaceC25657jBn.StateListAnimator.KWHzl)));
                }
                if (this.$showToast) {
                    String string = this.$context.getString(jAC.Companion.OLrzqt(this.$it, this.$selectionChangeType));
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.FYtjSf);
                    this.label = 1;
                    if (C25352ivB.AEQbTJ(string, drawableKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else if (this.$showToast) {
                String string2 = this.$context.getString(jAC.Companion.OLrzqt(this.$it, this.$selectionChangeType));
                Intrinsics.checkNotNullExpressionValue(string2, "");
                Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.dPkBzA);
                this.label = 2;
                if (C25352ivB.AEQbTJ(string2, drawableKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}

package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.graphics.drawable.Drawable;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C55326xho;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$displayToast$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ boolean $hasFailedIcon;
    final /* synthetic */ boolean $hasSuccessIcon;
    final /* synthetic */ boolean $isLong;
    final /* synthetic */ int $messageResId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$displayToast$2(boolean z, int i, boolean z2, boolean z3, Continuation<? super DAppMethodHelper$displayToast$2> continuation) {
        super(2, continuation);
        this.$isLong = z;
        this.$messageResId = i;
        this.$hasSuccessIcon = z2;
        this.$hasFailedIcon = z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DAppMethodHelper$displayToast$2 dAppMethodHelper$displayToast$2 = new DAppMethodHelper$displayToast$2(this.$isLong, this.$messageResId, this.$hasSuccessIcon, this.$hasFailedIcon, continuation);
        dAppMethodHelper$displayToast$2.L$0 = obj;
        return dAppMethodHelper$displayToast$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((DAppMethodHelper$displayToast$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean z = this.$isLong;
            int i = this.$messageResId;
            boolean z2 = this.$hasSuccessIcon;
            boolean z3 = this.$hasFailedIcon;
            try {
                Result.Application application = Result.Companion;
                if (!C55328xhq.OLrzqt.EZpvd()) {
                    if (z) {
                        C55326xho.EZpvd(i);
                    } else if (z2) {
                        C55326xho.toastWithSuccessfulIcon$default(i, 0, 1, (Object) null);
                    } else if (z3) {
                        C55326xho.toastWithFailedIcon$default(i, 0, 1, (Object) null);
                    } else {
                        C55326xho.toast$default(i, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    }
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("DAppMethodHelper", "Failed to displayToast, " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
            }
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

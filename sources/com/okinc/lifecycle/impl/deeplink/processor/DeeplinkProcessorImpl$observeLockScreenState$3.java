package com.okinc.lifecycle.impl.deeplink.processor;

import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import o.C38097pMc;
import o.C38103pMi;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes9.dex */
public final class DeeplinkProcessorImpl$observeLockScreenState$3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $deeplink;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C38103pMi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkProcessorImpl$observeLockScreenState$3(C38103pMi c38103pMi, String str, Continuation<? super DeeplinkProcessorImpl$observeLockScreenState$3> continuation) {
        super(2, continuation);
        this.this$0 = c38103pMi;
        this.$deeplink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DeeplinkProcessorImpl$observeLockScreenState$3 deeplinkProcessorImpl$observeLockScreenState$3 = new DeeplinkProcessorImpl$observeLockScreenState$3(this.this$0, this.$deeplink, continuation);
        deeplinkProcessorImpl$observeLockScreenState$3.Z$0 = ((Boolean) obj).booleanValue();
        return deeplinkProcessorImpl$observeLockScreenState$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
        return ((DeeplinkProcessorImpl$observeLockScreenState$3) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C38103pMi c38103pMi;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.Z$0) {
                this.label = 1;
                if (DelayKt.delay(100L, this) == objCopydefault) {
                    return objCopydefault;
                }
                c38103pMi = this.this$0;
                str = this.$deeplink;
                this.label = 2;
                if (c38103pMi.AEQbTJ(str, this) == objCopydefault) {
                }
            } else {
                C38097pMc.finishProcessing$default(this.this$0, LinkState.UNLOCK_FAILED, false, 2, null);
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            c38103pMi = this.this$0;
            str = this.$deeplink;
            this.label = 2;
            if (c38103pMi.AEQbTJ(str, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return C56443yFo.KWHzl(true);
    }
}

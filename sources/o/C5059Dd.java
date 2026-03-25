package o;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import aws.smithy.kotlin.runtime.io.internal.AwaitingSlot$sleep$1;
import aws.smithy.kotlin.runtime.io.internal.AwaitingSlot$trySuspend$1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5059Dd {
    public static final /* synthetic */ AtomicReferenceFieldUpdater KWHzl = AtomicReferenceFieldUpdater.newUpdater(C5059Dd.class, java.lang.Object.class, "AEQbTJ");
    public volatile /* synthetic */ java.lang.Object AEQbTJ = null;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Function0<java.lang.Boolean> function0, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AwaitingSlot$sleep$1 awaitingSlot$sleep$1;
        C5059Dd c5059Dd;
        if (continuation instanceof AwaitingSlot$sleep$1) {
            awaitingSlot$sleep$1 = (AwaitingSlot$sleep$1) continuation;
            int i = awaitingSlot$sleep$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                awaitingSlot$sleep$1.label = i - Integer.MIN_VALUE;
            } else {
                awaitingSlot$sleep$1 = new AwaitingSlot$sleep$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = awaitingSlot$sleep$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = awaitingSlot$sleep$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            awaitingSlot$sleep$1.L$0 = this;
            awaitingSlot$sleep$1.label = 1;
            objCopydefault = copydefault(function0, awaitingSlot$sleep$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c5059Dd = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5059Dd = (C5059Dd) awaitingSlot$sleep$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        if (((java.lang.Boolean) objCopydefault).booleanValue()) {
            return Unit.INSTANCE;
        }
        c5059Dd.KWHzl();
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        CompletableJob completableJob = (CompletableJob) KWHzl.getAndSet(this, null);
        if (completableJob != null) {
            completableJob.complete();
        }
    }

    public final void AEQbTJ(java.lang.Throwable th) {
        CompletableJob completableJob = (CompletableJob) KWHzl.getAndSet(this, null);
        if (completableJob == null) {
            return;
        }
        if (th != null) {
            completableJob.completeExceptionally(th);
        } else {
            completableJob.complete();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Function0<java.lang.Boolean> function0, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        AwaitingSlot$trySuspend$1 awaitingSlot$trySuspend$1;
        if (continuation instanceof AwaitingSlot$trySuspend$1) {
            awaitingSlot$trySuspend$1 = (AwaitingSlot$trySuspend$1) continuation;
            int i = awaitingSlot$trySuspend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                awaitingSlot$trySuspend$1.label = i - Integer.MIN_VALUE;
            } else {
                awaitingSlot$trySuspend$1 = new AwaitingSlot$trySuspend$1(this, continuation);
            }
        }
        java.lang.Object obj = awaitingSlot$trySuspend$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = awaitingSlot$trySuspend$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            CompletableJob completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null);
            if (AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(KWHzl, this, null, completableJobJob$default) && function0.invoke().booleanValue()) {
                awaitingSlot$trySuspend$1.I$0 = 1;
                awaitingSlot$trySuspend$1.label = 1;
                if (completableJobJob$default.join(awaitingSlot$trySuspend$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = awaitingSlot$trySuspend$1.I$0;
            C56391yDq.AEQbTJ(obj);
            if (i3 == 0) {
                z = false;
            }
        }
        return C56443yFo.KWHzl(z);
    }
}

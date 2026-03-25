package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ivo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25391ivo {

    /* JADX INFO: renamed from: o.ivo$StateListAnimator */
    public interface StateListAnimator {
        java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation);
    }

    Job KWHzl(@NotNull CoroutineScope coroutineScope, long j, @NotNull StateListAnimator stateListAnimator);
}

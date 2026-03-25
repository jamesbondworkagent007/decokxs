package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yDi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56383yDi<T, R> {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yDi.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC56383yDi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.Object copydefault(T t, @NotNull Continuation<? super R> continuation);

    private AbstractC56383yDi() {
    }
}

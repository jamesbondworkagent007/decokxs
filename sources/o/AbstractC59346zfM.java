package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59346zfM<T> implements java.lang.Iterable<T>, InterfaceC56535yIz {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zfM.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC59346zfM(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract T AEQbTJ(int i);

    public abstract int OLrzqt();

    public abstract void OLrzqt(int i, @NotNull T t);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private AbstractC59346zfM() {
    }
}

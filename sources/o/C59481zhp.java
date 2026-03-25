package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59481zhp implements java.util.Iterator<java.lang.String>, InterfaceC56535yIz {
    public static final Application AEQbTJ = new Application(null);
    public int AYXKKw;
    public final java.lang.CharSequence EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: o.zhp$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zhp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public C59481zhp(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.EZpvd = charSequence;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i;
        int i2;
        int i3 = this.KWHzl;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.OLrzqt < 0) {
            this.KWHzl = 2;
            return false;
        }
        int length = this.EZpvd.length();
        int length2 = this.EZpvd.length();
        for (int i4 = this.AYXKKw; i4 < length2; i4++) {
            char cCharAt = this.EZpvd.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < this.EZpvd.length() && this.EZpvd.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.KWHzl = 1;
                this.OLrzqt = i;
                this.copydefault = length;
                return true;
            }
        }
        i = -1;
        this.KWHzl = 1;
        this.OLrzqt = i;
        this.copydefault = length;
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.KWHzl = 0;
        int i = this.copydefault;
        int i2 = this.AYXKKw;
        this.AYXKKw = this.OLrzqt + i;
        return this.EZpvd.subSequence(i2, i).toString();
    }
}

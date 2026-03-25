package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yFM implements Sequence<java.lang.String> {
    public final java.io.BufferedReader KWHzl;

    public yFM(@NotNull java.io.BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "");
        this.KWHzl = bufferedReader;
    }

    public static final class StateListAnimator implements java.util.Iterator<java.lang.String>, InterfaceC56535yIz {
        public java.lang.String AEQbTJ;
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public StateListAnimator() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws java.io.IOException {
            if (this.AEQbTJ == null && !this.copydefault) {
                java.lang.String line = yFM.this.KWHzl.readLine();
                this.AEQbTJ = line;
                if (line == null) {
                    this.copydefault = true;
                }
            }
            return this.AEQbTJ != null;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public java.lang.String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            java.lang.String str = this.AEQbTJ;
            this.AEQbTJ = null;
            Intrinsics.copydefault((java.lang.Object) str);
            return str;
        }
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<java.lang.String> iterator() {
        return new StateListAnimator();
    }
}

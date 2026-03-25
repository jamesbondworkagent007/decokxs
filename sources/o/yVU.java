package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yVU<T> {
    public int AEQbTJ;
    public T EZpvd;
    public final yVY<T> KWHzl;

    public void EZpvd() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault() {
        if (this.EZpvd == null) {
            this.AEQbTJ++;
        }
    }

    public void copydefault(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        AEQbTJ(t);
    }

    public final void AEQbTJ(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        if (this.EZpvd == null) {
            if (this.AEQbTJ > 0) {
                t = this.KWHzl.KWHzl(C59449zhJ.copydefault("[", this.AEQbTJ) + this.KWHzl.OLrzqt(t));
            }
            this.EZpvd = t;
        }
    }

    public void AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull T t) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(t, "");
        AEQbTJ(t);
    }
}

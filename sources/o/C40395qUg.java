package o;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qUg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40395qUg extends ViewModel {
    public static final int copydefault = C56131xwy.AEQbTJ;
    public final qTT OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qTT KWHzl() {
        return this.OLrzqt;
    }

    public C40395qUg(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        qTT qtt = new qTT(str, str2, null, 4, null);
        this.OLrzqt = qtt;
        addCloseable(qtt);
    }
}

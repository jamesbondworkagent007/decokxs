package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mPZ {
    public C32116mQb AEQbTJ;
    public mQN EZpvd;
    public final C32165mRx OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mQO AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC32117mQc KWHzl() {
        return this.AEQbTJ;
    }

    public mPZ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32165mRx c32165mRx = new C32165mRx();
        this.OLrzqt = c32165mRx;
        this.EZpvd = new mQN(str);
        this.AEQbTJ = new C32116mQb(c32165mRx);
    }
}

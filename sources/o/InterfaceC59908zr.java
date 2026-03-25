package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC59908zr {
    byte[] AEQbTJ();

    void EZpvd();

    int copydefault();

    void copydefault(@NotNull byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: o.zr$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ void update$default(InterfaceC59908zr interfaceC59908zr, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length - i;
            }
            interfaceC59908zr.copydefault(bArr, i, i2);
        }
    }
}

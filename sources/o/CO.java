package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface CO extends InterfaceC5058Dc, java.nio.channels.WritableByteChannel {
    void AEQbTJ() throws java.io.IOException;

    long KWHzl(@NotNull InterfaceC5060De interfaceC5060De) throws java.io.IOException;

    void OLrzqt(@NotNull java.lang.String str, int i, int i2) throws java.io.IOException;

    void OLrzqt(@NotNull byte[] bArr, int i, int i2) throws java.io.IOException;

    CQ copydefault();

    public static final class Application {
        public static /* synthetic */ void write$default(CO co2, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) throws java.io.IOException {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length - i;
            }
            co2.OLrzqt(bArr, i, i2);
        }

        public static /* synthetic */ void writeUtf8$default(CO co2, java.lang.String str, int i, int i2, int i3, java.lang.Object obj) throws java.io.IOException {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeUtf8");
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = str.length();
            }
            co2.OLrzqt(str, i, i2);
        }
    }
}

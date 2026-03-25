package o;

import aws.smithy.kotlin.runtime.io.InputAdapter$readBlocking$1;
import com.google.common.primitives.UnsignedBytes;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CI extends java.io.InputStream {
    public final CQ AEQbTJ;
    public final CS copydefault;

    @Override // java.io.InputStream
    public int read() {
        if (this.copydefault.KWHzl() && this.AEQbTJ.AhwBna() == 0) {
            return -1;
        }
        if (this.AEQbTJ.AhwBna() == 0 && OLrzqt() == -1) {
            return -1;
        }
        return this.AEQbTJ.valueOf() & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.copydefault.KWHzl() && this.AEQbTJ.AhwBna() == 0) {
            return -1;
        }
        if (this.AEQbTJ.AhwBna() == 0 && OLrzqt() == -1) {
            return -1;
        }
        return this.AEQbTJ.AEQbTJ(bArr, i, i2);
    }

    public final long OLrzqt() {
        return ((java.lang.Number) BuildersKt__BuildersKt.runBlocking$default(null, new InputAdapter$readBlocking$1(this, null), 1, null)).longValue();
    }

    @Override // java.io.InputStream
    public int available() {
        return this.copydefault.AEQbTJ();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        super.close();
        this.copydefault.OLrzqt(null);
    }
}

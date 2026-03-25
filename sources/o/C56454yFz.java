package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.yFz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56454yFz extends java.io.ByteArrayOutputStream {
    public C56454yFz(int i) {
        super(i);
    }

    public final byte[] EZpvd() {
        byte[] bArr = ((java.io.ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(bArr, "");
        return bArr;
    }
}

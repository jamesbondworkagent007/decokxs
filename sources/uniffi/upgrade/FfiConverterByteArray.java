package uniffi.upgrade;

import o.BuB;
import uniffi.BaseFfiConverterByteArray;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterByteArray extends BaseFfiConverterByteArray {
    public static final int $stable = 0;
    public static final FfiConverterByteArray INSTANCE = new FfiConverterByteArray();

    private FfiConverterByteArray() {
        super(BuB.uniffiRustBuffer);
    }
}

package uniffi.growth;

import o.ANQ;
import uniffi.BaseFfiConverterByteArray;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterByteArray extends BaseFfiConverterByteArray {
    public static final int $stable = 0;
    public static final FfiConverterByteArray INSTANCE = new FfiConverterByteArray();

    private FfiConverterByteArray() {
        super(ANQ.uniffiRustBuffer);
    }
}

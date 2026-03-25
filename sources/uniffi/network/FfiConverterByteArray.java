package uniffi.network;

import o.C4298Bav;
import uniffi.BaseFfiConverterByteArray;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterByteArray extends BaseFfiConverterByteArray {
    public static final int $stable = 0;
    public static final FfiConverterByteArray INSTANCE = new FfiConverterByteArray();

    private FfiConverterByteArray() {
        super(C4298Bav.uniffiRustBuffer);
    }
}

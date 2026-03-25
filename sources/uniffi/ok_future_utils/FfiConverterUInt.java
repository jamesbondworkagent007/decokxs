package uniffi.ok_future_utils;

import o.BfS;
import uniffi.BaseFfiConverterUInt;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterUInt extends BaseFfiConverterUInt {
    public static final int $stable = 0;
    public static final FfiConverterUInt INSTANCE = new FfiConverterUInt();

    private FfiConverterUInt() {
        super(BfS.uniffiRustBuffer);
    }
}

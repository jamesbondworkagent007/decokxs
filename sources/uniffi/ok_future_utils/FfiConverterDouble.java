package uniffi.ok_future_utils;

import o.BfS;
import uniffi.BaseFfiConverterDouble;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterDouble extends BaseFfiConverterDouble {
    public static final int $stable = 0;
    public static final FfiConverterDouble INSTANCE = new FfiConverterDouble();

    private FfiConverterDouble() {
        super(BfS.uniffiRustBuffer);
    }
}

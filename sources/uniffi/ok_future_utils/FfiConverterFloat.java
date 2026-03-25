package uniffi.ok_future_utils;

import o.BfS;
import uniffi.BaseFfiConverterFloat;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterFloat extends BaseFfiConverterFloat {
    public static final int $stable = 0;
    public static final FfiConverterFloat INSTANCE = new FfiConverterFloat();

    private FfiConverterFloat() {
        super(BfS.uniffiRustBuffer);
    }
}

package uniffi.ok_future_utils;

import o.BfS;
import uniffi.BaseFfiConverterLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterLong extends BaseFfiConverterLong {
    public static final int $stable = 0;
    public static final FfiConverterLong INSTANCE = new FfiConverterLong();

    private FfiConverterLong() {
        super(BfS.uniffiRustBuffer);
    }
}

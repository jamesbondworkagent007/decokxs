package uniffi.ok_future_utils;

import o.BfS;
import uniffi.BaseFfiConverterInt;

/* JADX INFO: loaded from: classes20.dex */
public final class FfiConverterInt extends BaseFfiConverterInt {
    public static final int $stable = 0;
    public static final FfiConverterInt INSTANCE = new FfiConverterInt();

    private FfiConverterInt() {
        super(BfS.uniffiRustBuffer);
    }
}

package uniffi.oklogging;

import o.BfX;
import uniffi.BaseFfiConverterInt;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterInt extends BaseFfiConverterInt {
    public static final int $stable = 0;
    public static final FfiConverterInt INSTANCE = new FfiConverterInt();

    private FfiConverterInt() {
        super(BfX.uniffiRustBuffer);
    }
}

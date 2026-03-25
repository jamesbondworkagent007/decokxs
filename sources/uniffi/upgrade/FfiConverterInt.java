package uniffi.upgrade;

import o.BuB;
import uniffi.BaseFfiConverterInt;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterInt extends BaseFfiConverterInt {
    public static final int $stable = 0;
    public static final FfiConverterInt INSTANCE = new FfiConverterInt();

    private FfiConverterInt() {
        super(BuB.uniffiRustBuffer);
    }
}

package uniffi.upgrade;

import o.BuB;
import uniffi.BaseFfiConverterUInt;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterUInt extends BaseFfiConverterUInt {
    public static final int $stable = 0;
    public static final FfiConverterUInt INSTANCE = new FfiConverterUInt();

    private FfiConverterUInt() {
        super(BuB.uniffiRustBuffer);
    }
}

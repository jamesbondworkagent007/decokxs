package uniffi.oklogging;

import o.BfX;
import uniffi.BaseFfiConverterUInt;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterUInt extends BaseFfiConverterUInt {
    public static final int $stable = 0;
    public static final FfiConverterUInt INSTANCE = new FfiConverterUInt();

    private FfiConverterUInt() {
        super(BfX.uniffiRustBuffer);
    }
}

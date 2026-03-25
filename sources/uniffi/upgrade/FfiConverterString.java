package uniffi.upgrade;

import o.BuB;
import uniffi.BaseFfiConverterString;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterString extends BaseFfiConverterString {
    public static final int $stable = 0;
    public static final FfiConverterString INSTANCE = new FfiConverterString();

    private FfiConverterString() {
        super(BuB.uniffiRustBuffer);
    }
}

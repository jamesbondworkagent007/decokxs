package uniffi.path_provider;

import o.BgU;
import uniffi.BaseFfiConverterString;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterString extends BaseFfiConverterString {
    public static final int $stable = 0;
    public static final FfiConverterString INSTANCE = new FfiConverterString();

    private FfiConverterString() {
        super(BgU.uniffiRustBuffer);
    }
}

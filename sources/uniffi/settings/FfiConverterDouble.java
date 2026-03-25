package uniffi.settings;

import o.BoN;
import uniffi.BaseFfiConverterDouble;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterDouble extends BaseFfiConverterDouble {
    public static final int $stable = 0;
    public static final FfiConverterDouble INSTANCE = new FfiConverterDouble();

    private FfiConverterDouble() {
        super(BoN.uniffiRustBuffer);
    }
}

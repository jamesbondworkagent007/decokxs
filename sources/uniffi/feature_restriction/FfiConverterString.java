package uniffi.feature_restriction;

import o.ALB;
import uniffi.BaseFfiConverterString;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterString extends BaseFfiConverterString {
    public static final int $stable = 0;
    public static final FfiConverterString INSTANCE = new FfiConverterString();

    /* JADX DEBUG: Class process forced to load method for inline: o.ALB.access$getUniffiRustBuffer$p():uniffi.RustBuffer */
    private FfiConverterString() {
        super(ALB.uniffiRustBuffer);
    }
}

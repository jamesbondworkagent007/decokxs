package uniffi.dex;

import java.util.List;
import uniffi.FfiConverterOptional;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterOptionalSequenceSequenceString extends FfiConverterOptional<List<? extends List<? extends String>>> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalSequenceSequenceString INSTANCE = new FfiConverterOptionalSequenceSequenceString();

    private FfiConverterOptionalSequenceSequenceString() {
        super(FfiConverterSequenceSequenceString.INSTANCE);
    }
}

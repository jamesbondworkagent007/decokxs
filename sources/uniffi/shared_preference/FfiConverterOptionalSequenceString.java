package uniffi.shared_preference;

import java.util.List;
import uniffi.FfiConverterOptional;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterOptionalSequenceString extends FfiConverterOptional<List<? extends String>> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalSequenceString INSTANCE = new FfiConverterOptionalSequenceString();

    private FfiConverterOptionalSequenceString() {
        super(FfiConverterSequenceString.INSTANCE);
    }
}

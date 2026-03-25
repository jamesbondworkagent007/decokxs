package uniffi.dex;

import java.util.List;
import uniffi.FfiConverterOptional;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterOptionalSequenceLong extends FfiConverterOptional<List<? extends Long>> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalSequenceLong INSTANCE = new FfiConverterOptionalSequenceLong();

    private FfiConverterOptionalSequenceLong() {
        super(FfiConverterSequenceLong.INSTANCE);
    }
}

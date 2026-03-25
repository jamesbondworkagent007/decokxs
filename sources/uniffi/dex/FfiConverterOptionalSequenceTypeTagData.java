package uniffi.dex;

import java.util.List;
import o.AGM;
import uniffi.FfiConverterOptional;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterOptionalSequenceTypeTagData extends FfiConverterOptional<List<? extends AGM>> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalSequenceTypeTagData INSTANCE = new FfiConverterOptionalSequenceTypeTagData();

    private FfiConverterOptionalSequenceTypeTagData() {
        super(FfiConverterSequenceTypeTagData.INSTANCE);
    }
}

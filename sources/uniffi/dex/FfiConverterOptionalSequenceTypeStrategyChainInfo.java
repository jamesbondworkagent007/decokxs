package uniffi.dex;

import java.util.List;
import o.AGE;
import uniffi.FfiConverterOptional;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterOptionalSequenceTypeStrategyChainInfo extends FfiConverterOptional<List<? extends AGE>> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalSequenceTypeStrategyChainInfo INSTANCE = new FfiConverterOptionalSequenceTypeStrategyChainInfo();

    private FfiConverterOptionalSequenceTypeStrategyChainInfo() {
        super(FfiConverterSequenceTypeStrategyChainInfo.INSTANCE);
    }
}

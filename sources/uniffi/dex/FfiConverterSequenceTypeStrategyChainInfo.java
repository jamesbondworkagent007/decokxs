package uniffi.dex;

import o.AGE;
import uniffi.FfiConverterSequence;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterSequenceTypeStrategyChainInfo extends FfiConverterSequence<AGE> {
    public static final int $stable = 0;
    public static final FfiConverterSequenceTypeStrategyChainInfo INSTANCE = new FfiConverterSequenceTypeStrategyChainInfo();

    private FfiConverterSequenceTypeStrategyChainInfo() {
        super(FfiConverterTypeStrategyChainInfo.INSTANCE);
    }
}

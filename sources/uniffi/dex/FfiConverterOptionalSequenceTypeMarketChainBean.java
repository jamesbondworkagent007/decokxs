package uniffi.dex;

import java.util.List;
import o.ABP;
import uniffi.FfiConverterOptional;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterOptionalSequenceTypeMarketChainBean extends FfiConverterOptional<List<? extends ABP>> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalSequenceTypeMarketChainBean INSTANCE = new FfiConverterOptionalSequenceTypeMarketChainBean();

    private FfiConverterOptionalSequenceTypeMarketChainBean() {
        super(FfiConverterSequenceTypeMarketChainBean.INSTANCE);
    }
}

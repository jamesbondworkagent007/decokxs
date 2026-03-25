package uniffi.growth;

import uniffi.FfiConverterSequence;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterSequenceInt extends FfiConverterSequence<Integer> {
    public static final int $stable = 0;
    public static final FfiConverterSequenceInt INSTANCE = new FfiConverterSequenceInt();

    private FfiConverterSequenceInt() {
        super(FfiConverterInt.INSTANCE);
    }
}

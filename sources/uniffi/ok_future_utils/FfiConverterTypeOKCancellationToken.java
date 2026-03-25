package uniffi.ok_future_utils;

import o.BdU;
import o.BfS;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKCancellationToken extends BaseFfiConverterTypeLong<BdU> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKCancellationToken INSTANCE = new FfiConverterTypeOKCancellationToken();

    private FfiConverterTypeOKCancellationToken() {
        super(BfS.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public BdU lift(long j) {
        return new BdU(C60184zxu.INSTANCE, j);
    }
}

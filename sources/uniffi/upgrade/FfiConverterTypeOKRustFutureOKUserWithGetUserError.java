package uniffi.upgrade;

import o.BuB;
import o.C4857Btp;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOKRustFutureOKUserWithGetUserError extends BaseFfiConverterTypeLong<C4857Btp> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureOKUserWithGetUserError INSTANCE = new FfiConverterTypeOKRustFutureOKUserWithGetUserError();

    private FfiConverterTypeOKRustFutureOKUserWithGetUserError() {
        super(BuB.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4857Btp lift(long j) {
        return new C4857Btp(C60184zxu.INSTANCE, j);
    }
}

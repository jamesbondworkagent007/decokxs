package uniffi.account;

import o.C58547zGk;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeMfaPasskeyInteractor extends BaseFfiConverterTypeLong<C58547zGk> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaPasskeyInteractor INSTANCE = new FfiConverterTypeMfaPasskeyInteractor();

    private FfiConverterTypeMfaPasskeyInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58547zGk lift(long j) {
        return new C58547zGk(C60184zxu.INSTANCE, j);
    }
}

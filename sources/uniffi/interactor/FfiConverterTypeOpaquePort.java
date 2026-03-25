package uniffi.interactor;

import o.C2576ARb;
import o.C2585ARk;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeOpaquePort extends BaseFfiConverterTypeLong<C2585ARk> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOpaquePort INSTANCE = new FfiConverterTypeOpaquePort();

    private FfiConverterTypeOpaquePort() {
        super(C2576ARb.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C2585ARk lift(long j) {
        return new C2585ARk(C60184zxu.INSTANCE, j);
    }
}

package uniffi.account;

import o.C58678zLg;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeNewDeviceInfoInteractor extends BaseFfiConverterTypeLong<C58678zLg> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceInfoInteractor INSTANCE = new FfiConverterTypeNewDeviceInfoInteractor();

    private FfiConverterTypeNewDeviceInfoInteractor() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58678zLg lift(long j) {
        return new C58678zLg(C60184zxu.INSTANCE, j);
    }
}

package uniffi.network;

import o.C4298Bav;
import o.C4358BcB;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeWsConfigProvider extends BaseFfiConverterTypeLong<C4358BcB> {
    public static final int $stable = 0;
    public static final FfiConverterTypeWsConfigProvider INSTANCE = new FfiConverterTypeWsConfigProvider();

    private FfiConverterTypeWsConfigProvider() {
        super(C4298Bav.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4358BcB lift(long j) {
        return new C4358BcB(C60184zxu.INSTANCE, j);
    }
}

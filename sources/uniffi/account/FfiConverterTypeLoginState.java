package uniffi.account;

import o.C58485zEc;
import o.C60184zxu;
import o.C60230zyn;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLoginState extends BaseFfiConverterTypeLong<C58485zEc> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginState INSTANCE = new FfiConverterTypeLoginState();

    private FfiConverterTypeLoginState() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C58485zEc lift(long j) {
        return new C58485zEc(C60184zxu.INSTANCE, j);
    }
}

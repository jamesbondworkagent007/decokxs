package uniffi.settings;

import o.BoN;
import o.C4718Bol;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeLanguageSelectInteractor extends BaseFfiConverterTypeLong<C4718Bol> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLanguageSelectInteractor INSTANCE = new FfiConverterTypeLanguageSelectInteractor();

    private FfiConverterTypeLanguageSelectInteractor() {
        super(BoN.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C4718Bol lift(long j) {
        return new C4718Bol(C60184zxu.INSTANCE, j);
    }
}

package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C59059zZr;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC59061zZt;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePayPasskeyListEventCallback extends BaseFfiConverterType<InterfaceC59061zZt> {
    public static final int $stable = 0;
    public static final FfiConverterTypePayPasskeyListEventCallback INSTANCE = new FfiConverterTypePayPasskeyListEventCallback();

    private FfiConverterTypePayPasskeyListEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC59061zZt interfaceC59061zZt) {
        Intrinsics.checkNotNullParameter(interfaceC59061zZt, "");
        if (interfaceC59061zZt instanceof C59059zZr) {
            return Long.valueOf(((C59059zZr) interfaceC59061zZt).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC59061zZt createFromHandle(long j) {
        return new C59059zZr(C60184zxu.INSTANCE, j);
    }
}

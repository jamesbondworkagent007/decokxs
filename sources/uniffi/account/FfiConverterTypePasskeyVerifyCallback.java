package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C59051zZj;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC59050zZi;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePasskeyVerifyCallback extends BaseFfiConverterType<InterfaceC59050zZi> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeyVerifyCallback INSTANCE = new FfiConverterTypePasskeyVerifyCallback();

    private FfiConverterTypePasskeyVerifyCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC59050zZi interfaceC59050zZi) {
        Intrinsics.checkNotNullParameter(interfaceC59050zZi, "");
        if (interfaceC59050zZi instanceof C59051zZj) {
            return Long.valueOf(((C59051zZj) interfaceC59050zZi).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC59050zZi createFromHandle(long j) {
        return new C59051zZj(C60184zxu.INSTANCE, j);
    }
}

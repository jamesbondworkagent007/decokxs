package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58916zUe;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58915zUd;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyUpgradeCallback extends BaseFfiConverterType<InterfaceC58915zUd> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyUpgradeCallback INSTANCE = new FfiConverterTypeOkxPasskeyUpgradeCallback();

    private FfiConverterTypeOkxPasskeyUpgradeCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58915zUd interfaceC58915zUd) {
        Intrinsics.checkNotNullParameter(interfaceC58915zUd, "");
        if (interfaceC58915zUd instanceof C58916zUe) {
            return Long.valueOf(((C58916zUe) interfaceC58915zUd).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58915zUd createFromHandle(long j) {
        return new C58916zUe(C60184zxu.INSTANCE, j);
    }
}

package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60202zyL;
import o.C60230zyn;
import o.InterfaceC60197zyG;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeAccountsStateCallback extends BaseFfiConverterType<InterfaceC60197zyG> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAccountsStateCallback INSTANCE = new FfiConverterTypeAccountsStateCallback();

    private FfiConverterTypeAccountsStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC60197zyG interfaceC60197zyG) {
        Intrinsics.checkNotNullParameter(interfaceC60197zyG, "");
        if (interfaceC60197zyG instanceof C60202zyL) {
            return Long.valueOf(((C60202zyL) interfaceC60197zyG).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC60197zyG createFromHandle(long j) {
        return new C60202zyL(C60184zxu.INSTANCE, j);
    }
}

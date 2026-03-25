package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C59019zYd;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC59023zYh;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePasskeySupportCheckerTrait extends BaseFfiConverterType<InterfaceC59023zYh> {
    public static final int $stable = 0;
    public static final FfiConverterTypePasskeySupportCheckerTrait INSTANCE = new FfiConverterTypePasskeySupportCheckerTrait();

    private FfiConverterTypePasskeySupportCheckerTrait() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC59023zYh interfaceC59023zYh) {
        Intrinsics.checkNotNullParameter(interfaceC59023zYh, "");
        if (interfaceC59023zYh instanceof C59019zYd) {
            return Long.valueOf(((C59019zYd) interfaceC59023zYh).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC59023zYh createFromHandle(long j) {
        return new C59019zYd(C60184zxu.INSTANCE, j);
    }
}

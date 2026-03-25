package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C3266Aih;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC3262Aid;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeUserCenterEventCallback extends BaseFfiConverterType<InterfaceC3262Aid> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUserCenterEventCallback INSTANCE = new FfiConverterTypeUserCenterEventCallback();

    private FfiConverterTypeUserCenterEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3262Aid interfaceC3262Aid) {
        Intrinsics.checkNotNullParameter(interfaceC3262Aid, "");
        if (interfaceC3262Aid instanceof C3266Aih) {
            return Long.valueOf(((C3266Aih) interfaceC3262Aid).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3262Aid createFromHandle(long j) {
        return new C3266Aih(C60184zxu.INSTANCE, j);
    }
}

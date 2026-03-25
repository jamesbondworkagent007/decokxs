package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C2818AaJ;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC2817AaI;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeProfileListStateChangeCallback extends BaseFfiConverterType<InterfaceC2817AaI> {
    public static final int $stable = 0;
    public static final FfiConverterTypeProfileListStateChangeCallback INSTANCE = new FfiConverterTypeProfileListStateChangeCallback();

    private FfiConverterTypeProfileListStateChangeCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2817AaI interfaceC2817AaI) {
        Intrinsics.checkNotNullParameter(interfaceC2817AaI, "");
        if (interfaceC2817AaI instanceof C2818AaJ) {
            return Long.valueOf(((C2818AaJ) interfaceC2817AaI).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2817AaI createFromHandle(long j) {
        return new C2818AaJ(C60184zxu.INSTANCE, j);
    }
}

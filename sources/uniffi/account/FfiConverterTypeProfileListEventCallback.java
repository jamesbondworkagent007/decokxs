package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C2846Aal;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC2848Aan;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeProfileListEventCallback extends BaseFfiConverterType<InterfaceC2848Aan> {
    public static final int $stable = 0;
    public static final FfiConverterTypeProfileListEventCallback INSTANCE = new FfiConverterTypeProfileListEventCallback();

    private FfiConverterTypeProfileListEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2848Aan interfaceC2848Aan) {
        Intrinsics.checkNotNullParameter(interfaceC2848Aan, "");
        if (interfaceC2848Aan instanceof C2846Aal) {
            return Long.valueOf(((C2846Aal) interfaceC2848Aan).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2848Aan createFromHandle(long j) {
        return new C2846Aal(C60184zxu.INSTANCE, j);
    }
}

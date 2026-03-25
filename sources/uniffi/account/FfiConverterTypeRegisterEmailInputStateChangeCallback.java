package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C2943Acc;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC2945Ace;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterEmailInputStateChangeCallback extends BaseFfiConverterType<InterfaceC2945Ace> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterEmailInputStateChangeCallback INSTANCE = new FfiConverterTypeRegisterEmailInputStateChangeCallback();

    private FfiConverterTypeRegisterEmailInputStateChangeCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2945Ace interfaceC2945Ace) {
        Intrinsics.checkNotNullParameter(interfaceC2945Ace, "");
        if (interfaceC2945Ace instanceof C2943Acc) {
            return Long.valueOf(((C2943Acc) interfaceC2945Ace).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2945Ace createFromHandle(long j) {
        return new C2943Acc(C60184zxu.INSTANCE, j);
    }
}

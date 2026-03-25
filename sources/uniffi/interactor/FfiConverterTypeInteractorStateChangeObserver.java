package uniffi.interactor;

import kotlin.jvm.internal.Intrinsics;
import o.C2576ARb;
import o.C2582ARh;
import o.C60184zxu;
import o.InterfaceC2579ARe;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeInteractorStateChangeObserver extends BaseFfiConverterType<InterfaceC2579ARe> {
    public static final int $stable = 0;
    public static final FfiConverterTypeInteractorStateChangeObserver INSTANCE = new FfiConverterTypeInteractorStateChangeObserver();

    private FfiConverterTypeInteractorStateChangeObserver() {
        super(C2576ARb.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2579ARe interfaceC2579ARe) {
        Intrinsics.checkNotNullParameter(interfaceC2579ARe, "");
        if (interfaceC2579ARe instanceof C2582ARh) {
            return Long.valueOf(((C2582ARh) interfaceC2579ARe).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2579ARe createFromHandle(long j) {
        return new C2582ARh(C60184zxu.INSTANCE, j);
    }
}

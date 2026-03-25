package uniffi.shared_preference;

import kotlin.jvm.internal.Intrinsics;
import o.BrC;
import o.C4832Bsr;
import o.C60184zxu;
import o.InterfaceC4812Bry;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeSharedPreferencesInterface extends BaseFfiConverterType<InterfaceC4812Bry> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSharedPreferencesInterface INSTANCE = new FfiConverterTypeSharedPreferencesInterface();

    private FfiConverterTypeSharedPreferencesInterface() {
        super(C4832Bsr.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4812Bry interfaceC4812Bry) {
        Intrinsics.checkNotNullParameter(interfaceC4812Bry, "");
        if (interfaceC4812Bry instanceof BrC) {
            return Long.valueOf(((BrC) interfaceC4812Bry).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4812Bry createFromHandle(long j) {
        return new BrC(C60184zxu.INSTANCE, j);
    }
}

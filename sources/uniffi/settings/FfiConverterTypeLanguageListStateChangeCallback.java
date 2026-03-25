package uniffi.settings;

import kotlin.jvm.internal.Intrinsics;
import o.BnZ;
import o.BoN;
import o.C60184zxu;
import o.InterfaceC4707Boa;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLanguageListStateChangeCallback extends BaseFfiConverterType<InterfaceC4707Boa> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLanguageListStateChangeCallback INSTANCE = new FfiConverterTypeLanguageListStateChangeCallback();

    private FfiConverterTypeLanguageListStateChangeCallback() {
        super(BoN.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4707Boa interfaceC4707Boa) {
        Intrinsics.checkNotNullParameter(interfaceC4707Boa, "");
        if (interfaceC4707Boa instanceof BnZ) {
            return Long.valueOf(((BnZ) interfaceC4707Boa).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4707Boa createFromHandle(long j) {
        return new BnZ(C60184zxu.INSTANCE, j);
    }
}

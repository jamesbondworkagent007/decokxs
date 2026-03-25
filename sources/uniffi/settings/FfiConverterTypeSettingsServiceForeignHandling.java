package uniffi.settings;

import kotlin.jvm.internal.Intrinsics;
import o.BoN;
import o.BoZ;
import o.C60184zxu;
import o.InterfaceC4736Bpc;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeSettingsServiceForeignHandling extends BaseFfiConverterType<InterfaceC4736Bpc> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSettingsServiceForeignHandling INSTANCE = new FfiConverterTypeSettingsServiceForeignHandling();

    private FfiConverterTypeSettingsServiceForeignHandling() {
        super(BoN.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4736Bpc interfaceC4736Bpc) {
        Intrinsics.checkNotNullParameter(interfaceC4736Bpc, "");
        if (interfaceC4736Bpc instanceof BoZ) {
            return Long.valueOf(((BoZ) interfaceC4736Bpc).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4736Bpc createFromHandle(long j) {
        return new BoZ(C60184zxu.INSTANCE, j);
    }
}

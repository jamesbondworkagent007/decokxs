package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58375zAa;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC60266zzW;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeChangePasswordJourneyStepCallback extends BaseFfiConverterType<InterfaceC60266zzW> {
    public static final int $stable = 0;
    public static final FfiConverterTypeChangePasswordJourneyStepCallback INSTANCE = new FfiConverterTypeChangePasswordJourneyStepCallback();

    private FfiConverterTypeChangePasswordJourneyStepCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC60266zzW interfaceC60266zzW) {
        Intrinsics.checkNotNullParameter(interfaceC60266zzW, "");
        if (interfaceC60266zzW instanceof C58375zAa) {
            return Long.valueOf(((C58375zAa) interfaceC60266zzW).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC60266zzW createFromHandle(long j) {
        return new C58375zAa(C60184zxu.INSTANCE, j);
    }
}

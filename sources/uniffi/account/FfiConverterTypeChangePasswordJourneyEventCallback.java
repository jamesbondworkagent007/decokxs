package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.C60257zzN;
import o.InterfaceC60260zzQ;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeChangePasswordJourneyEventCallback extends BaseFfiConverterType<InterfaceC60260zzQ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeChangePasswordJourneyEventCallback INSTANCE = new FfiConverterTypeChangePasswordJourneyEventCallback();

    private FfiConverterTypeChangePasswordJourneyEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC60260zzQ interfaceC60260zzQ) {
        Intrinsics.checkNotNullParameter(interfaceC60260zzQ, "");
        if (interfaceC60260zzQ instanceof C60257zzN) {
            return Long.valueOf(((C60257zzN) interfaceC60260zzQ).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC60260zzQ createFromHandle(long j) {
        return new C60257zzN(C60184zxu.INSTANCE, j);
    }
}

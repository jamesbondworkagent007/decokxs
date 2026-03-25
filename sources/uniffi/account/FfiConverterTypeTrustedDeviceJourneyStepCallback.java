package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C3097AfX;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC3098AfY;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeTrustedDeviceJourneyStepCallback extends BaseFfiConverterType<InterfaceC3098AfY> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTrustedDeviceJourneyStepCallback INSTANCE = new FfiConverterTypeTrustedDeviceJourneyStepCallback();

    private FfiConverterTypeTrustedDeviceJourneyStepCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3098AfY interfaceC3098AfY) {
        Intrinsics.checkNotNullParameter(interfaceC3098AfY, "");
        if (interfaceC3098AfY instanceof C3097AfX) {
            return Long.valueOf(((C3097AfX) interfaceC3098AfY).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3098AfY createFromHandle(long j) {
        return new C3097AfX(C60184zxu.INSTANCE, j);
    }
}

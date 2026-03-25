package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60218zyb;
import o.C60230zyn;
import o.InterfaceC60160zxW;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeAccountConnectJourneyCallback extends BaseFfiConverterType<InterfaceC60160zxW> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAccountConnectJourneyCallback INSTANCE = new FfiConverterTypeAccountConnectJourneyCallback();

    private FfiConverterTypeAccountConnectJourneyCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC60160zxW interfaceC60160zxW) {
        Intrinsics.checkNotNullParameter(interfaceC60160zxW, "");
        if (interfaceC60160zxW instanceof C60218zyb) {
            return Long.valueOf(((C60218zyb) interfaceC60160zxW).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC60160zxW createFromHandle(long j) {
        return new C60218zyb(C60184zxu.INSTANCE, j);
    }
}

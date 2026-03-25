package uniffi.retail_trading;

import kotlin.jvm.internal.Intrinsics;
import o.BlA;
import o.C4643Blr;
import o.C60184zxu;
import o.InterfaceC4642Blq;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeRetailTradingNativeApi extends BaseFfiConverterType<InterfaceC4642Blq> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRetailTradingNativeApi INSTANCE = new FfiConverterTypeRetailTradingNativeApi();

    private FfiConverterTypeRetailTradingNativeApi() {
        super(BlA.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4642Blq interfaceC4642Blq) {
        Intrinsics.checkNotNullParameter(interfaceC4642Blq, "");
        if (interfaceC4642Blq instanceof C4643Blr) {
            return Long.valueOf(((C4643Blr) interfaceC4642Blq).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4642Blq createFromHandle(long j) {
        return new C4643Blr(C60184zxu.INSTANCE, j);
    }
}

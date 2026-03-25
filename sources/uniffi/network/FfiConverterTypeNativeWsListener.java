package uniffi.network;

import kotlin.jvm.internal.Intrinsics;
import o.C4286Baj;
import o.C4298Bav;
import o.C60184zxu;
import o.InterfaceC4285Bai;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNativeWsListener extends BaseFfiConverterType<InterfaceC4285Bai> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeWsListener INSTANCE = new FfiConverterTypeNativeWsListener();

    private FfiConverterTypeNativeWsListener() {
        super(C4298Bav.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4285Bai interfaceC4285Bai) {
        Intrinsics.checkNotNullParameter(interfaceC4285Bai, "");
        if (interfaceC4285Bai instanceof C4286Baj) {
            return Long.valueOf(((C4286Baj) interfaceC4285Bai).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4285Bai createFromHandle(long j) {
        return new C4286Baj(C60184zxu.INSTANCE, j);
    }
}

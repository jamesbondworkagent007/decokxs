package uniffi.network;

import kotlin.jvm.internal.Intrinsics;
import o.C4298Bav;
import o.C4328BbY;
import o.C60184zxu;
import o.InterfaceC4325BbV;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRustWsDataCallback extends BaseFfiConverterType<InterfaceC4325BbV> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRustWsDataCallback INSTANCE = new FfiConverterTypeRustWsDataCallback();

    private FfiConverterTypeRustWsDataCallback() {
        super(C4298Bav.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4325BbV interfaceC4325BbV) {
        Intrinsics.checkNotNullParameter(interfaceC4325BbV, "");
        if (interfaceC4325BbV instanceof C4328BbY) {
            return Long.valueOf(((C4328BbY) interfaceC4325BbV).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4325BbV createFromHandle(long j) {
        return new C4328BbY(C60184zxu.INSTANCE, j);
    }
}

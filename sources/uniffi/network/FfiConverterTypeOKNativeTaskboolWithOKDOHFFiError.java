package uniffi.network;

import kotlin.jvm.internal.Intrinsics;
import o.C4275BaY;
import o.C4298Bav;
import o.C60184zxu;
import o.InterfaceC4274BaX;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKNativeTaskboolWithOKDOHFFiError extends BaseFfiConverterType<InterfaceC4274BaX> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKNativeTaskboolWithOKDOHFFiError INSTANCE = new FfiConverterTypeOKNativeTaskboolWithOKDOHFFiError();

    private FfiConverterTypeOKNativeTaskboolWithOKDOHFFiError() {
        super(C4298Bav.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4274BaX interfaceC4274BaX) {
        Intrinsics.checkNotNullParameter(interfaceC4274BaX, "");
        if (interfaceC4274BaX instanceof C4275BaY) {
            return Long.valueOf(((C4275BaY) interfaceC4274BaX).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4274BaX createFromHandle(long j) {
        return new C4275BaY(C60184zxu.INSTANCE, j);
    }
}

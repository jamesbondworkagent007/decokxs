package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60210zyT;
import o.C60230zyn;
import o.InterfaceC60214zyX;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeBleConnectionCallback extends BaseFfiConverterType<InterfaceC60214zyX> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBleConnectionCallback INSTANCE = new FfiConverterTypeBleConnectionCallback();

    private FfiConverterTypeBleConnectionCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC60214zyX interfaceC60214zyX) {
        Intrinsics.checkNotNullParameter(interfaceC60214zyX, "");
        if (interfaceC60214zyX instanceof C60210zyT) {
            return Long.valueOf(((C60210zyT) interfaceC60214zyX).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC60214zyX createFromHandle(long j) {
        return new C60210zyT(C60184zxu.INSTANCE, j);
    }
}

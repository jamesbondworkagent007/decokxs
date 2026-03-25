package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C2865AbD;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC2867AbF;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterEmailInputEventCallback extends BaseFfiConverterType<InterfaceC2867AbF> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterEmailInputEventCallback INSTANCE = new FfiConverterTypeRegisterEmailInputEventCallback();

    private FfiConverterTypeRegisterEmailInputEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2867AbF interfaceC2867AbF) {
        Intrinsics.checkNotNullParameter(interfaceC2867AbF, "");
        if (interfaceC2867AbF instanceof C2865AbD) {
            return Long.valueOf(((C2865AbD) interfaceC2867AbF).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2867AbF createFromHandle(long j) {
        return new C2865AbD(C60184zxu.INSTANCE, j);
    }
}

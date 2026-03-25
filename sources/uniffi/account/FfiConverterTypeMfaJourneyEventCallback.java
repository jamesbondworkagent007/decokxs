package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58516zFg;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58518zFi;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaJourneyEventCallback extends BaseFfiConverterType<InterfaceC58518zFi> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaJourneyEventCallback INSTANCE = new FfiConverterTypeMfaJourneyEventCallback();

    private FfiConverterTypeMfaJourneyEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58518zFi interfaceC58518zFi) {
        Intrinsics.checkNotNullParameter(interfaceC58518zFi, "");
        if (interfaceC58518zFi instanceof C58516zFg) {
            return Long.valueOf(((C58516zFg) interfaceC58518zFi).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58518zFi createFromHandle(long j) {
        return new C58516zFg(C60184zxu.INSTANCE, j);
    }
}

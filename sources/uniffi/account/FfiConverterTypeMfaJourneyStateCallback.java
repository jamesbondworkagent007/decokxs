package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58526zFq;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58527zFr;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaJourneyStateCallback extends BaseFfiConverterType<InterfaceC58527zFr> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaJourneyStateCallback INSTANCE = new FfiConverterTypeMfaJourneyStateCallback();

    private FfiConverterTypeMfaJourneyStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58527zFr interfaceC58527zFr) {
        Intrinsics.checkNotNullParameter(interfaceC58527zFr, "");
        if (interfaceC58527zFr instanceof C58526zFq) {
            return Long.valueOf(((C58526zFq) interfaceC58527zFr).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58527zFr createFromHandle(long j) {
        return new C58526zFq(C60184zxu.INSTANCE, j);
    }
}

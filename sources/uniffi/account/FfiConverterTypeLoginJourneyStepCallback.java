package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58477zDv;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58480zDy;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLoginJourneyStepCallback extends BaseFfiConverterType<InterfaceC58480zDy> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginJourneyStepCallback INSTANCE = new FfiConverterTypeLoginJourneyStepCallback();

    private FfiConverterTypeLoginJourneyStepCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58480zDy interfaceC58480zDy) {
        Intrinsics.checkNotNullParameter(interfaceC58480zDy, "");
        if (interfaceC58480zDy instanceof C58477zDv) {
            return Long.valueOf(((C58477zDv) interfaceC58480zDy).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58480zDy createFromHandle(long j) {
        return new C58477zDv(C60184zxu.INSTANCE, j);
    }
}

package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58466zDk;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58467zDl;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLoginJourneyEventCallback extends BaseFfiConverterType<InterfaceC58467zDl> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLoginJourneyEventCallback INSTANCE = new FfiConverterTypeLoginJourneyEventCallback();

    private FfiConverterTypeLoginJourneyEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58467zDl interfaceC58467zDl) {
        Intrinsics.checkNotNullParameter(interfaceC58467zDl, "");
        if (interfaceC58467zDl instanceof C58466zDk) {
            return Long.valueOf(((C58466zDk) interfaceC58467zDl).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58467zDl createFromHandle(long j) {
        return new C58466zDk(C60184zxu.INSTANCE, j);
    }
}

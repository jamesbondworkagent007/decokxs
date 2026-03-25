package uniffi.localization;

import kotlin.jvm.internal.Intrinsics;
import o.AYE;
import o.AYF;
import o.C2775AYt;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKNativeTaskAppLanguageListWithOKFFIError extends BaseFfiConverterType<AYE> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKNativeTaskAppLanguageListWithOKFFIError INSTANCE = new FfiConverterTypeOKNativeTaskAppLanguageListWithOKFFIError();

    private FfiConverterTypeOKNativeTaskAppLanguageListWithOKFFIError() {
        super(C2775AYt.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull AYE aye) {
        Intrinsics.checkNotNullParameter(aye, "");
        if (aye instanceof AYF) {
            return Long.valueOf(((AYF) aye).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public AYE createFromHandle(long j) {
        return new AYF(C60184zxu.INSTANCE, j);
    }
}

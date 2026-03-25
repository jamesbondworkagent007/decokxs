package uniffi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.FfiConverter;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public interface BaseFfiConverterRustBuffer<KotlinType> extends FfiConverter<KotlinType, RustBuffer.ByValue> {
    /* JADX INFO: renamed from: lift */
    KotlinType lift2(@NotNull RustBuffer.ByValue byValue);

    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lower */
    RustBuffer.ByValue lower2(KotlinType kotlintype);

    public static final class DefaultImpls {
        public static <KotlinType> KotlinType liftFromRustBuffer(@NotNull BaseFfiConverterRustBuffer<KotlinType> baseFfiConverterRustBuffer, @NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return (KotlinType) FfiConverter.DefaultImpls.liftFromRustBuffer(baseFfiConverterRustBuffer, byValue);
        }

        public static <KotlinType> RustBuffer.ByValue lowerIntoRustBuffer(@NotNull BaseFfiConverterRustBuffer<KotlinType> baseFfiConverterRustBuffer, KotlinType kotlintype) {
            return FfiConverter.DefaultImpls.lowerIntoRustBuffer(baseFfiConverterRustBuffer, kotlintype);
        }

        public static <KotlinType> KotlinType lift(@NotNull BaseFfiConverterRustBuffer<KotlinType> baseFfiConverterRustBuffer, @NotNull RustBuffer.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            return baseFfiConverterRustBuffer.liftFromRustBuffer(byValue);
        }

        public static <KotlinType> RustBuffer.ByValue lower(@NotNull BaseFfiConverterRustBuffer<KotlinType> baseFfiConverterRustBuffer, KotlinType kotlintype) {
            return baseFfiConverterRustBuffer.lowerIntoRustBuffer(kotlintype);
        }
    }
}

package uniffi.lifecycle;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C56423yEv;
import o.yEK;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.lifecycle.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterMapStringString implements FfiConverterRustBuffer<Map<String, ? extends String>> {
    public static final int $stable = 0;
    public static final FfiConverterMapStringString INSTANCE = new FfiConverterMapStringString();

    private FfiConverterMapStringString() {
    }

    @Override // uniffi.lifecycle.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public Map<String, String> lift2(@NotNull RustBuffer.ByValue byValue) {
        return (Map) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public Map<String, String> liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (Map) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull Map<String, String> map) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, map);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull Map<String, String> map) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, map);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public Map<String, String> read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        Map mapEZpvd = C56423yEv.EZpvd(i);
        for (int i2 = 0; i2 < i; i2++) {
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            mapEZpvd.put(ffiConverterString.read(byteBuffer), ffiConverterString.read(byteBuffer));
        }
        return C56423yEv.AYXKKw(mapEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull Map<String, String> map, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.putInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            ffiConverterString.write(key, byteBuffer);
            ffiConverterString.write(value, byteBuffer);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
            arrayList.add(C56396yDv.KWHzl(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(key) + ffiConverterString.mo9529allocationSizeI7RO_PI(value))));
        }
        return C56396yDv.copydefault(yEK.EZpvd(arrayList) + 4);
    }
}

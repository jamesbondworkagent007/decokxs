package uniffi.growth;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C56423yEv;
import o.yEK;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.growth.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterMapIntInt implements FfiConverterRustBuffer<Map<Integer, ? extends Integer>> {
    public static final int $stable = 0;
    public static final FfiConverterMapIntInt INSTANCE = new FfiConverterMapIntInt();

    private FfiConverterMapIntInt() {
    }

    @Override // uniffi.growth.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public Map<Integer, Integer> lift2(@NotNull RustBuffer.ByValue byValue) {
        return (Map) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public Map<Integer, Integer> liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (Map) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull Map<Integer, Integer> map) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, map);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull Map<Integer, Integer> map) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, map);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public Map<Integer, Integer> read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        Map mapEZpvd = C56423yEv.EZpvd(i);
        for (int i2 = 0; i2 < i; i2++) {
            FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
            mapEZpvd.put(Integer.valueOf(ffiConverterInt.read(byteBuffer).intValue()), Integer.valueOf(ffiConverterInt.read(byteBuffer).intValue()));
        }
        return C56423yEv.AYXKKw(mapEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull Map<Integer, Integer> map, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.putInt(map.size());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
            ffiConverterInt.write(iIntValue, byteBuffer);
            ffiConverterInt.write(iIntValue2, byteBuffer);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull Map<Integer, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            FfiConverterInt ffiConverterInt = FfiConverterInt.INSTANCE;
            arrayList.add(C56396yDv.KWHzl(C56396yDv.copydefault(ffiConverterInt.m9536allocationSizeI7RO_PI(iIntValue) + ffiConverterInt.m9536allocationSizeI7RO_PI(iIntValue2))));
        }
        return C56396yDv.copydefault(yEK.EZpvd(arrayList) + 4);
    }
}

package uniffi;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56396yDv;
import o.C56403yEb;
import o.yEK;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterRustBuffer;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public abstract class FfiConverterSequence<T> implements BaseFfiConverterRustBuffer<List<? extends T>> {
    public static final int $stable = 8;
    private final FfiConverter<T, ?> c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FfiConverter<T, ?> getC() {
        return this.c;
    }

    public FfiConverterSequence(@NotNull FfiConverter<T, ?> ffiConverter) {
        Intrinsics.checkNotNullParameter(ffiConverter, "");
        this.c = ffiConverter;
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public List<T> lift2(@NotNull RustBuffer.ByValue byValue) {
        return (List) BaseFfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public List<T> liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (List) BaseFfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull List<? extends T> list) {
        return BaseFfiConverterRustBuffer.DefaultImpls.lower(this, list);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull List<? extends T> list) {
        return BaseFfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, list);
    }

    @Override // uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return this.c.getRustBuffer();
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public List<T> read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        int i = byteBuffer.getInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(this.c.read(byteBuffer));
        }
        return arrayList;
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull List<? extends T> list, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byteBuffer.putInt(list.size());
        Iterator<? extends T> it = list.iterator();
        while (it.hasNext()) {
            this.c.write(it.next(), byteBuffer);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C56396yDv.KWHzl(this.c.mo9529allocationSizeI7RO_PI(it.next())));
        }
        return C56396yDv.copydefault(yEK.EZpvd(arrayList) + 4);
    }
}

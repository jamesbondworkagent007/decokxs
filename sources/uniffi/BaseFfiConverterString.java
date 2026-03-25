package uniffi;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.FfiConverter;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class BaseFfiConverterString implements FfiConverter<String, RustBuffer.ByValue> {
    public static final int $stable = 8;
    private final RustBuffer rustBuffer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return this.rustBuffer;
    }

    public BaseFfiConverterString(@NotNull RustBuffer rustBuffer) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        this.rustBuffer = rustBuffer;
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public String liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (String) FfiConverter.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull String str) {
        return FfiConverter.DefaultImpls.lowerIntoRustBuffer(this, str);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift, reason: avoid collision after fix types in other method */
    public String lift2(@NotNull RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        try {
            byte[] bArr = new byte[(int) byValue.len];
            ByteBuffer byteBufferAsByteBuffer = byValue.asByteBuffer();
            Intrinsics.copydefault(byteBufferAsByteBuffer);
            byteBufferAsByteBuffer.get(bArr);
            return new String(bArr, Charsets.UTF_8);
        } finally {
            getRustBuffer().free(byValue);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public String read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        byte[] bArr = new byte[byteBuffer.getInt()];
        byteBuffer.get(bArr);
        return new String(bArr, Charsets.UTF_8);
    }

    public final ByteBuffer toUtf8(@NotNull String str) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(str, "");
        CharsetEncoder charsetEncoderNewEncoder = Charsets.UTF_8.newEncoder();
        charsetEncoderNewEncoder.onMalformedInput(CodingErrorAction.REPORT);
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.encode(CharBuffer.wrap(str));
        Intrinsics.checkNotNullExpressionValue(byteBufferEncode, "");
        return byteBufferEncode;
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: avoid collision after fix types in other method */
    public RustBuffer.ByValue lower2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ByteBuffer utf8 = toUtf8(str);
        RustBuffer.ByValue byValueM9575allocVKZWuLQ = getRustBuffer().m9575allocVKZWuLQ(C56396yDv.copydefault(utf8.limit()));
        ByteBuffer byteBufferAsByteBuffer = byValueM9575allocVKZWuLQ.asByteBuffer();
        Intrinsics.copydefault(byteBufferAsByteBuffer);
        byteBufferAsByteBuffer.put(utf8);
        return byValueM9575allocVKZWuLQ;
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(str.length()) * 3) + 4);
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull String str, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        ByteBuffer utf8 = toUtf8(str);
        byteBuffer.putInt(utf8.limit());
        byteBuffer.put(utf8);
    }
}

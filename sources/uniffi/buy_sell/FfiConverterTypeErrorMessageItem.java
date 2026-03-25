package uniffi.buy_sell;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import o.C3792Asd;
import o.C56396yDv;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.buy_sell.FfiConverterRustBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeErrorMessageItem implements FfiConverterRustBuffer<C3792Asd> {
    public static final int $stable = 0;
    public static final FfiConverterTypeErrorMessageItem INSTANCE = new FfiConverterTypeErrorMessageItem();

    private FfiConverterTypeErrorMessageItem() {
    }

    @Override // uniffi.buy_sell.FfiConverterRustBuffer, uniffi.FfiConverter
    public RustBuffer getRustBuffer() {
        return FfiConverterRustBuffer.DefaultImpls.getRustBuffer(this);
    }

    /* JADX DEBUG: Method merged with bridge method: lift(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lift(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterRustBuffer
    /* JADX INFO: renamed from: lift */
    public C3792Asd lift2(@NotNull RustBuffer.ByValue byValue) {
        return (C3792Asd) FfiConverterRustBuffer.DefaultImpls.lift(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: liftFromRustBuffer(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3792Asd liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (C3792Asd) FfiConverterRustBuffer.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: lower(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.BaseFfiConverterRustBuffer, uniffi.FfiConverter
    /* JADX INFO: renamed from: lower, reason: merged with bridge method [inline-methods] */
    public RustBuffer.ByValue lower2(@NotNull C3792Asd c3792Asd) {
        return FfiConverterRustBuffer.DefaultImpls.lower(this, c3792Asd);
    }

    /* JADX DEBUG: Method merged with bridge method: lowerIntoRustBuffer(Ljava/lang/Object;)Luniffi/RustBuffer$ByValue; */
    @Override // uniffi.FfiConverter
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull C3792Asd c3792Asd) {
        return FfiConverterRustBuffer.DefaultImpls.lowerIntoRustBuffer(this, c3792Asd);
    }

    /* JADX DEBUG: Method merged with bridge method: read(Ljava/nio/ByteBuffer;)Ljava/lang/Object; */
    @Override // uniffi.FfiConverter
    public C3792Asd read(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        String str = ffiConverterString.read(byteBuffer);
        String str2 = ffiConverterString.read(byteBuffer);
        String str3 = ffiConverterString.read(byteBuffer);
        String str4 = ffiConverterString.read(byteBuffer);
        String str5 = ffiConverterString.read(byteBuffer);
        String str6 = ffiConverterString.read(byteBuffer);
        String str7 = ffiConverterString.read(byteBuffer);
        String str8 = ffiConverterString.read(byteBuffer);
        String str9 = ffiConverterString.read(byteBuffer);
        String str10 = ffiConverterString.read(byteBuffer);
        String str11 = ffiConverterString.read(byteBuffer);
        String str12 = ffiConverterString.read(byteBuffer);
        String str13 = ffiConverterString.read(byteBuffer);
        String str14 = ffiConverterString.read(byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new C3792Asd(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), ffiConverterBoolean.read(byteBuffer).booleanValue(), FfiConverterTypeBuySellTokenType.INSTANCE.read(byteBuffer));
    }

    /* JADX DEBUG: Method merged with bridge method: allocationSize-I7RO_PI(Ljava/lang/Object;)J */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo9529allocationSizeI7RO_PI(@NotNull C3792Asd c3792Asd) {
        Intrinsics.checkNotNullParameter(c3792Asd, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jCopydefault = C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(ffiConverterString.mo9529allocationSizeI7RO_PI(c3792Asd.AEQbTJ()) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3792Asd.ejfBZ())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3792Asd.AkhnZx())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3792Asd.AYXKKw())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3792Asd.valueOf())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3792Asd.AhwBna())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3792Asd.djBIcL())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3792Asd.KWHzl())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3792Asd.gEmmrt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3792Asd.copydefault())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3792Asd.OLrzqt())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3792Asd.fetchVPNInfo())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3792Asd.isConnected())) + ffiConverterString.mo9529allocationSizeI7RO_PI(c3792Asd.DbNXlk()));
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(C56396yDv.copydefault(jCopydefault + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3792Asd.iwGUEr())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3792Asd.fJNWhG())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3792Asd.AuCTel())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3792Asd.EZpvd())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3792Asd.fARcdN())) + ffiConverterBoolean.m9530allocationSizeI7RO_PI(c3792Asd.values())) + FfiConverterTypeBuySellTokenType.INSTANCE.mo9529allocationSizeI7RO_PI(c3792Asd.fIwbmz()));
    }

    /* JADX DEBUG: Method merged with bridge method: write(Ljava/lang/Object;Ljava/nio/ByteBuffer;)V */
    @Override // uniffi.FfiConverter
    public void write(@NotNull C3792Asd c3792Asd, @NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(c3792Asd, "");
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(c3792Asd.AEQbTJ(), byteBuffer);
        ffiConverterString.write(c3792Asd.ejfBZ(), byteBuffer);
        ffiConverterString.write(c3792Asd.AkhnZx(), byteBuffer);
        ffiConverterString.write(c3792Asd.AYXKKw(), byteBuffer);
        ffiConverterString.write(c3792Asd.valueOf(), byteBuffer);
        ffiConverterString.write(c3792Asd.AhwBna(), byteBuffer);
        ffiConverterString.write(c3792Asd.djBIcL(), byteBuffer);
        ffiConverterString.write(c3792Asd.KWHzl(), byteBuffer);
        ffiConverterString.write(c3792Asd.gEmmrt(), byteBuffer);
        ffiConverterString.write(c3792Asd.copydefault(), byteBuffer);
        ffiConverterString.write(c3792Asd.OLrzqt(), byteBuffer);
        ffiConverterString.write(c3792Asd.fetchVPNInfo(), byteBuffer);
        ffiConverterString.write(c3792Asd.isConnected(), byteBuffer);
        ffiConverterString.write(c3792Asd.DbNXlk(), byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(c3792Asd.iwGUEr(), byteBuffer);
        ffiConverterBoolean.write(c3792Asd.fJNWhG(), byteBuffer);
        ffiConverterBoolean.write(c3792Asd.AuCTel(), byteBuffer);
        ffiConverterBoolean.write(c3792Asd.EZpvd(), byteBuffer);
        ffiConverterBoolean.write(c3792Asd.fARcdN(), byteBuffer);
        ffiConverterBoolean.write(c3792Asd.values(), byteBuffer);
        FfiConverterTypeBuySellTokenType.INSTANCE.write(c3792Asd.fIwbmz(), byteBuffer);
    }
}

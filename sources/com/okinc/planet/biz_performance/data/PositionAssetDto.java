package com.okinc.planet.biz_performance.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33129mqd;
import o.C46414tTl;
import o.InterfaceC46504tWu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PositionAssetDto implements Parcelable, InterfaceC46504tWu {
    public final String currency;
    public final BigDecimal percent;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PositionAssetDto> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PositionAssetDto> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionAssetDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PositionAssetDto(parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionAssetDto[] newArray(int i) {
            return new PositionAssetDto[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PositionAssetDto copy$default(PositionAssetDto positionAssetDto, String str, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            str = positionAssetDto.currency;
        }
        if ((i & 2) != 0) {
            bigDecimal = positionAssetDto.percent;
        }
        return positionAssetDto.copydefault(str, bigDecimal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46504tWu
    public String AEQbTJ() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal EZpvd() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionAssetDto copydefault(@NotNull String str, @NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return new PositionAssetDto(str, bigDecimal);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PositionAssetDto)) {
            return false;
        }
        PositionAssetDto positionAssetDto = (PositionAssetDto) obj;
        return Intrinsics.EZpvd((Object) this.currency, (Object) positionAssetDto.currency) && Intrinsics.EZpvd(this.percent, positionAssetDto.percent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.currency.hashCode() * 31) + this.percent.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PositionAssetDto(currency=" + this.currency + ", percent=" + this.percent + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.currency);
        parcel.writeSerializable(this.percent);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_performance.data.PositionAssetDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PositionAssetDto> serializer() {
            return PositionAssetDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PositionAssetDto(int i, String str, BigDecimal bigDecimal, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PositionAssetDto$$serializer.INSTANCE.getDescriptor());
        }
        this.currency = str;
        this.percent = bigDecimal;
    }

    public static final /* synthetic */ void EZpvd(PositionAssetDto positionAssetDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, positionAssetDto.currency);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, C46414tTl.KWHzl, positionAssetDto.percent);
    }

    public PositionAssetDto(@NotNull String str, @NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        this.currency = str;
        this.percent = bigDecimal;
    }

    @Override // o.InterfaceC46504tWu
    public BigDecimal OLrzqt() {
        return C33129mqd.EZpvd(this.percent);
    }
}

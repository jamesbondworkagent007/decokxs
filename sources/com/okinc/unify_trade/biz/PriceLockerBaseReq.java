package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class PriceLockerBaseReq implements Parcelable {
    private String amt;
    private String date;
    private boolean isBuy;
    private String lockedAmt;
    private String ratio;
    private String strike;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PriceLockerBaseReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PriceLockerBaseReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceLockerBaseReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PriceLockerBaseReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceLockerBaseReq[] newArray(int i) {
            return new PriceLockerBaseReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PriceLockerBaseReq copy$default(PriceLockerBaseReq priceLockerBaseReq, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = priceLockerBaseReq.strike;
        }
        if ((i & 2) != 0) {
            str2 = priceLockerBaseReq.amt;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = priceLockerBaseReq.lockedAmt;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = priceLockerBaseReq.date;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            z = priceLockerBaseReq.isBuy;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = priceLockerBaseReq.ratio;
        }
        return priceLockerBaseReq.copy(str, str6, str7, str8, z2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.lockedAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceLockerBaseReq copy(String str, String str2, String str3, String str4, boolean z, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str5, "");
        return new PriceLockerBaseReq(str, str2, str3, str4, z, str5);
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
        if (!(obj instanceof PriceLockerBaseReq)) {
            return false;
        }
        PriceLockerBaseReq priceLockerBaseReq = (PriceLockerBaseReq) obj;
        return Intrinsics.EZpvd((Object) this.strike, (Object) priceLockerBaseReq.strike) && Intrinsics.EZpvd((Object) this.amt, (Object) priceLockerBaseReq.amt) && Intrinsics.EZpvd((Object) this.lockedAmt, (Object) priceLockerBaseReq.lockedAmt) && Intrinsics.EZpvd((Object) this.date, (Object) priceLockerBaseReq.date) && this.isBuy == priceLockerBaseReq.isBuy && Intrinsics.EZpvd((Object) this.ratio, (Object) priceLockerBaseReq.ratio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmt() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDate() {
        return this.date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLockedAmt() {
        return this.lockedAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatio() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrike() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.strike;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.amt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.lockedAmt;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.date;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.isBuy)) * 31) + this.ratio.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBuy() {
        return this.isBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmt(String str) {
        this.amt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuy(boolean z) {
        this.isBuy = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDate(String str) {
        this.date = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLockedAmt(String str) {
        this.lockedAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ratio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrike(String str) {
        this.strike = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriceLockerBaseReq(strike=" + this.strike + ", amt=" + this.amt + ", lockedAmt=" + this.lockedAmt + ", date=" + this.date + ", isBuy=" + this.isBuy + ", ratio=" + this.ratio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.strike);
        parcel.writeString(this.amt);
        parcel.writeString(this.lockedAmt);
        parcel.writeString(this.date);
        parcel.writeInt(this.isBuy ? 1 : 0);
        parcel.writeString(this.ratio);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.PriceLockerBaseReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriceLockerBaseReq> serializer() {
            return PriceLockerBaseReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriceLockerBaseReq(int i, String str, String str2, String str3, String str4, boolean z, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, PriceLockerBaseReq$$serializer.INSTANCE.getDescriptor());
        }
        this.strike = str;
        this.amt = str2;
        this.lockedAmt = str3;
        this.date = str4;
        this.isBuy = z;
        this.ratio = str5;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PriceLockerBaseReq priceLockerBaseReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, priceLockerBaseReq.strike);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, priceLockerBaseReq.amt);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, priceLockerBaseReq.lockedAmt);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, priceLockerBaseReq.date);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, priceLockerBaseReq.isBuy);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, priceLockerBaseReq.ratio);
    }

    public PriceLockerBaseReq(String str, String str2, String str3, String str4, boolean z, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str5, "");
        this.strike = str;
        this.amt = str2;
        this.lockedAmt = str3;
        this.date = str4;
        this.isBuy = z;
        this.ratio = str5;
    }
}

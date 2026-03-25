package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class PriceLockerStateVolume implements Parcelable {
    private String savedVolume;
    private String savedVolumePrecision;
    private String totalVolume;
    private String totalVolumePrecision;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PriceLockerStateVolume> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<PriceLockerStateVolume> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceLockerStateVolume createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PriceLockerStateVolume(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceLockerStateVolume[] newArray(int i) {
            return new PriceLockerStateVolume[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PriceLockerStateVolume() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PriceLockerStateVolume copy$default(PriceLockerStateVolume priceLockerStateVolume, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = priceLockerStateVolume.totalVolumePrecision;
        }
        if ((i & 2) != 0) {
            str2 = priceLockerStateVolume.savedVolumePrecision;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = priceLockerStateVolume.savedVolume;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = priceLockerStateVolume.totalVolume;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = priceLockerStateVolume.type;
        }
        return priceLockerStateVolume.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalVolumePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.savedVolumePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.savedVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceLockerStateVolume copy(String str, String str2, String str3, String str4, String str5) {
        return new PriceLockerStateVolume(str, str2, str3, str4, str5);
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
        if (!(obj instanceof PriceLockerStateVolume)) {
            return false;
        }
        PriceLockerStateVolume priceLockerStateVolume = (PriceLockerStateVolume) obj;
        return Intrinsics.EZpvd((Object) this.totalVolumePrecision, (Object) priceLockerStateVolume.totalVolumePrecision) && Intrinsics.EZpvd((Object) this.savedVolumePrecision, (Object) priceLockerStateVolume.savedVolumePrecision) && Intrinsics.EZpvd((Object) this.savedVolume, (Object) priceLockerStateVolume.savedVolume) && Intrinsics.EZpvd((Object) this.totalVolume, (Object) priceLockerStateVolume.totalVolume) && Intrinsics.EZpvd((Object) this.type, (Object) priceLockerStateVolume.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSavedVolume() {
        return this.savedVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSavedVolumePrecision() {
        return this.savedVolumePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalVolume() {
        return this.totalVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalVolumePrecision() {
        return this.totalVolumePrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.totalVolumePrecision;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.savedVolumePrecision;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.savedVolume;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.totalVolume;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.type;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSavedVolume(String str) {
        this.savedVolume = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSavedVolumePrecision(String str) {
        this.savedVolumePrecision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalVolume(String str) {
        this.totalVolume = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalVolumePrecision(String str) {
        this.totalVolumePrecision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriceLockerStateVolume(totalVolumePrecision=" + this.totalVolumePrecision + ", savedVolumePrecision=" + this.savedVolumePrecision + ", savedVolume=" + this.savedVolume + ", totalVolume=" + this.totalVolume + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalVolumePrecision);
        parcel.writeString(this.savedVolumePrecision);
        parcel.writeString(this.savedVolume);
        parcel.writeString(this.totalVolume);
        parcel.writeString(this.type);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.PriceLockerStateVolume.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriceLockerStateVolume> serializer() {
            return PriceLockerStateVolume$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriceLockerStateVolume(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalVolumePrecision = null;
        } else {
            this.totalVolumePrecision = str;
        }
        if ((i & 2) == 0) {
            this.savedVolumePrecision = null;
        } else {
            this.savedVolumePrecision = str2;
        }
        if ((i & 4) == 0) {
            this.savedVolume = null;
        } else {
            this.savedVolume = str3;
        }
        if ((i & 8) == 0) {
            this.totalVolume = null;
        } else {
            this.totalVolume = str4;
        }
        if ((i & 16) == 0) {
            this.type = null;
        } else {
            this.type = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(PriceLockerStateVolume priceLockerStateVolume, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || priceLockerStateVolume.totalVolumePrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, priceLockerStateVolume.totalVolumePrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || priceLockerStateVolume.savedVolumePrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, priceLockerStateVolume.savedVolumePrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || priceLockerStateVolume.savedVolume != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, priceLockerStateVolume.savedVolume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || priceLockerStateVolume.totalVolume != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, priceLockerStateVolume.totalVolume);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && priceLockerStateVolume.type == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, priceLockerStateVolume.type);
    }

    public PriceLockerStateVolume(String str, String str2, String str3, String str4, String str5) {
        this.totalVolumePrecision = str;
        this.savedVolumePrecision = str2;
        this.savedVolume = str3;
        this.totalVolume = str4;
        this.type = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:322) call: com.okinc.unify_trade.biz.PriceLockerStateVolume.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PriceLockerStateVolume(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}

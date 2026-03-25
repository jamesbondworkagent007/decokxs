package com.okinc.business.defi.api.bean;

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

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class SuiSignData implements Parcelable {
    public static final int $stable = 0;
    private final String from;
    private final String to;
    private final String txBytes;
    private final String txSerialize;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SuiSignData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SuiSignData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SuiSignData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SuiSignData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SuiSignData[] newArray(int i) {
            return new SuiSignData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SuiSignData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SuiSignData copy$default(SuiSignData suiSignData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suiSignData.from;
        }
        if ((i & 2) != 0) {
            str2 = suiSignData.to;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = suiSignData.value;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = suiSignData.txSerialize;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = suiSignData.txBytes;
        }
        return suiSignData.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.txSerialize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.txBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SuiSignData copy(String str, String str2, String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SuiSignData(str, str2, str3, str4, str5);
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
        if (!(obj instanceof SuiSignData)) {
            return false;
        }
        SuiSignData suiSignData = (SuiSignData) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) suiSignData.from) && Intrinsics.EZpvd((Object) this.to, (Object) suiSignData.to) && Intrinsics.EZpvd((Object) this.value, (Object) suiSignData.value) && Intrinsics.EZpvd((Object) this.txSerialize, (Object) suiSignData.txSerialize) && Intrinsics.EZpvd((Object) this.txBytes, (Object) suiSignData.txBytes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxBytes() {
        return this.txBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxSerialize() {
        return this.txSerialize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.from;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.to;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.txSerialize.hashCode()) * 31) + this.txBytes.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SuiSignData(from=" + this.from + ", to=" + this.to + ", value=" + this.value + ", txSerialize=" + this.txSerialize + ", txBytes=" + this.txBytes + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeString(this.value);
        parcel.writeString(this.txSerialize);
        parcel.writeString(this.txBytes);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.SuiSignData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SuiSignData> serializer() {
            return SuiSignData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SuiSignData(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.from = null;
        } else {
            this.from = str;
        }
        if ((i & 2) == 0) {
            this.to = null;
        } else {
            this.to = str2;
        }
        if ((i & 4) == 0) {
            this.value = null;
        } else {
            this.value = str3;
        }
        if ((i & 8) == 0) {
            this.txSerialize = "";
        } else {
            this.txSerialize = str4;
        }
        if ((i & 16) == 0) {
            this.txBytes = "";
        } else {
            this.txBytes = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(SuiSignData suiSignData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || suiSignData.from != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, suiSignData.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || suiSignData.to != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, suiSignData.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || suiSignData.value != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, suiSignData.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) suiSignData.txSerialize, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, suiSignData.txSerialize);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) suiSignData.txBytes, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, suiSignData.txBytes);
    }

    public SuiSignData(String str, String str2, String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.from = str;
        this.to = str2;
        this.value = str3;
        this.txSerialize = str4;
        this.txBytes = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:233) call: com.okinc.business.defi.api.bean.SuiSignData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SuiSignData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? str3 : null, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}

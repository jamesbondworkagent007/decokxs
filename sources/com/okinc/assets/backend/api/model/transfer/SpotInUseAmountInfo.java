package com.okinc.assets.backend.api.model.transfer;

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

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class SpotInUseAmountInfo implements Parcelable {
    public static final int $stable = 0;
    private final String clSpotInUseAmt;
    private final String maxSpotInUseAmt;
    private final String spotInUseAmt;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SpotInUseAmountInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SpotInUseAmountInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotInUseAmountInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotInUseAmountInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotInUseAmountInfo[] newArray(int i) {
            return new SpotInUseAmountInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotInUseAmountInfo() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpotInUseAmountInfo copy$default(SpotInUseAmountInfo spotInUseAmountInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotInUseAmountInfo.spotInUseAmt;
        }
        if ((i & 2) != 0) {
            str2 = spotInUseAmountInfo.maxSpotInUseAmt;
        }
        if ((i & 4) != 0) {
            str3 = spotInUseAmountInfo.clSpotInUseAmt;
        }
        return spotInUseAmountInfo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.spotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxSpotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.clSpotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotInUseAmountInfo copy(String str, String str2, String str3) {
        return new SpotInUseAmountInfo(str, str2, str3);
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
        if (!(obj instanceof SpotInUseAmountInfo)) {
            return false;
        }
        SpotInUseAmountInfo spotInUseAmountInfo = (SpotInUseAmountInfo) obj;
        return Intrinsics.EZpvd((Object) this.spotInUseAmt, (Object) spotInUseAmountInfo.spotInUseAmt) && Intrinsics.EZpvd((Object) this.maxSpotInUseAmt, (Object) spotInUseAmountInfo.maxSpotInUseAmt) && Intrinsics.EZpvd((Object) this.clSpotInUseAmt, (Object) spotInUseAmountInfo.clSpotInUseAmt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClSpotInUseAmt() {
        return this.clSpotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSpotInUseAmt() {
        return this.maxSpotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotInUseAmt() {
        return this.spotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.spotInUseAmt;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.maxSpotInUseAmt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.clSpotInUseAmt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotInUseAmountInfo(spotInUseAmt=" + this.spotInUseAmt + ", maxSpotInUseAmt=" + this.maxSpotInUseAmt + ", clSpotInUseAmt=" + this.clSpotInUseAmt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.spotInUseAmt);
        parcel.writeString(this.maxSpotInUseAmt);
        parcel.writeString(this.clSpotInUseAmt);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.transfer.SpotInUseAmountInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotInUseAmountInfo> serializer() {
            return SpotInUseAmountInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotInUseAmountInfo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.spotInUseAmt = null;
        } else {
            this.spotInUseAmt = str;
        }
        if ((i & 2) == 0) {
            this.maxSpotInUseAmt = null;
        } else {
            this.maxSpotInUseAmt = str2;
        }
        if ((i & 4) == 0) {
            this.clSpotInUseAmt = null;
        } else {
            this.clSpotInUseAmt = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(SpotInUseAmountInfo spotInUseAmountInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spotInUseAmountInfo.spotInUseAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spotInUseAmountInfo.spotInUseAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || spotInUseAmountInfo.maxSpotInUseAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, spotInUseAmountInfo.maxSpotInUseAmt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && spotInUseAmountInfo.clSpotInUseAmt == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, spotInUseAmountInfo.clSpotInUseAmt);
    }

    public SpotInUseAmountInfo(String str, String str2, String str3) {
        this.spotInUseAmt = str;
        this.maxSpotInUseAmt = str2;
        this.clSpotInUseAmt = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.assets.backend.api.model.transfer.SpotInUseAmountInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotInUseAmountInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}

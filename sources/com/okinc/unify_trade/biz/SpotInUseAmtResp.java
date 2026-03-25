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
public final class SpotInUseAmtResp implements Parcelable {
    private String ccy;
    private String clSpotInUseAmt;
    private String maxSpotInUseAmt;
    private String spotInUseAmt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SpotInUseAmtResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SpotInUseAmtResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotInUseAmtResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotInUseAmtResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotInUseAmtResp[] newArray(int i) {
            return new SpotInUseAmtResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotInUseAmtResp() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpotInUseAmtResp copy$default(SpotInUseAmtResp spotInUseAmtResp, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotInUseAmtResp.ccy;
        }
        if ((i & 2) != 0) {
            str2 = spotInUseAmtResp.spotInUseAmt;
        }
        if ((i & 4) != 0) {
            str3 = spotInUseAmtResp.maxSpotInUseAmt;
        }
        if ((i & 8) != 0) {
            str4 = spotInUseAmtResp.clSpotInUseAmt;
        }
        return spotInUseAmtResp.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.spotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxSpotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.clSpotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotInUseAmtResp copy(String str, String str2, String str3, String str4) {
        return new SpotInUseAmtResp(str, str2, str3, str4);
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
        if (!(obj instanceof SpotInUseAmtResp)) {
            return false;
        }
        SpotInUseAmtResp spotInUseAmtResp = (SpotInUseAmtResp) obj;
        return Intrinsics.EZpvd((Object) this.ccy, (Object) spotInUseAmtResp.ccy) && Intrinsics.EZpvd((Object) this.spotInUseAmt, (Object) spotInUseAmtResp.spotInUseAmt) && Intrinsics.EZpvd((Object) this.maxSpotInUseAmt, (Object) spotInUseAmtResp.maxSpotInUseAmt) && Intrinsics.EZpvd((Object) this.clSpotInUseAmt, (Object) spotInUseAmtResp.clSpotInUseAmt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
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
        String str = this.ccy;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.spotInUseAmt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxSpotInUseAmt;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.clSpotInUseAmt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(String str) {
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClSpotInUseAmt(String str) {
        this.clSpotInUseAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSpotInUseAmt(String str) {
        this.maxSpotInUseAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotInUseAmt(String str) {
        this.spotInUseAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotInUseAmtResp(ccy=" + this.ccy + ", spotInUseAmt=" + this.spotInUseAmt + ", maxSpotInUseAmt=" + this.maxSpotInUseAmt + ", clSpotInUseAmt=" + this.clSpotInUseAmt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ccy);
        parcel.writeString(this.spotInUseAmt);
        parcel.writeString(this.maxSpotInUseAmt);
        parcel.writeString(this.clSpotInUseAmt);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpotInUseAmtResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotInUseAmtResp> serializer() {
            return SpotInUseAmtResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotInUseAmtResp(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = null;
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.spotInUseAmt = null;
        } else {
            this.spotInUseAmt = str2;
        }
        if ((i & 4) == 0) {
            this.maxSpotInUseAmt = null;
        } else {
            this.maxSpotInUseAmt = str3;
        }
        if ((i & 8) == 0) {
            this.clSpotInUseAmt = null;
        } else {
            this.clSpotInUseAmt = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpotInUseAmtResp spotInUseAmtResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spotInUseAmtResp.ccy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spotInUseAmtResp.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || spotInUseAmtResp.spotInUseAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, spotInUseAmtResp.spotInUseAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || spotInUseAmtResp.maxSpotInUseAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, spotInUseAmtResp.maxSpotInUseAmt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && spotInUseAmtResp.clSpotInUseAmt == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, spotInUseAmtResp.clSpotInUseAmt);
    }

    public SpotInUseAmtResp(String str, String str2, String str3, String str4) {
        this.ccy = str;
        this.spotInUseAmt = str2;
        this.maxSpotInUseAmt = str3;
        this.clSpotInUseAmt = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4314) call: com.okinc.unify_trade.biz.SpotInUseAmtResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotInUseAmtResp(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}

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
public final class SpotInUseConfirmResp implements Parcelable {
    private String mgnRatio;
    private String mgnRatioAft;
    private String mmr;
    private String mmrAft;
    private String mmrVar;
    private String spotInUseAmt;
    private String spotInUseAmtAft;
    private String spotInUseAmtVar;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SpotInUseConfirmResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<SpotInUseConfirmResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotInUseConfirmResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotInUseConfirmResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotInUseConfirmResp[] newArray(int i) {
            return new SpotInUseConfirmResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotInUseConfirmResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.mgnRatioAft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.mmrVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mmrAft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.spotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.spotInUseAmtVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.spotInUseAmtAft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotInUseConfirmResp copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new SpotInUseConfirmResp(str, str2, str3, str4, str5, str6, str7, str8);
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
        if (!(obj instanceof SpotInUseConfirmResp)) {
            return false;
        }
        SpotInUseConfirmResp spotInUseConfirmResp = (SpotInUseConfirmResp) obj;
        return Intrinsics.EZpvd((Object) this.mgnRatio, (Object) spotInUseConfirmResp.mgnRatio) && Intrinsics.EZpvd((Object) this.mgnRatioAft, (Object) spotInUseConfirmResp.mgnRatioAft) && Intrinsics.EZpvd((Object) this.mmr, (Object) spotInUseConfirmResp.mmr) && Intrinsics.EZpvd((Object) this.mmrVar, (Object) spotInUseConfirmResp.mmrVar) && Intrinsics.EZpvd((Object) this.mmrAft, (Object) spotInUseConfirmResp.mmrAft) && Intrinsics.EZpvd((Object) this.spotInUseAmt, (Object) spotInUseConfirmResp.spotInUseAmt) && Intrinsics.EZpvd((Object) this.spotInUseAmtVar, (Object) spotInUseConfirmResp.spotInUseAmtVar) && Intrinsics.EZpvd((Object) this.spotInUseAmtAft, (Object) spotInUseConfirmResp.spotInUseAmtAft);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnRatio() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnRatioAft() {
        return this.mgnRatioAft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMmr() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMmrAft() {
        return this.mmrAft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMmrVar() {
        return this.mmrVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotInUseAmt() {
        return this.spotInUseAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotInUseAmtAft() {
        return this.spotInUseAmtAft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotInUseAmtVar() {
        return this.spotInUseAmtVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.mgnRatio;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.mgnRatioAft;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.mmr;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.mmrVar;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.mmrAft;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.spotInUseAmt;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.spotInUseAmtVar;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.spotInUseAmtAft;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnRatio(String str) {
        this.mgnRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnRatioAft(String str) {
        this.mgnRatioAft = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMmr(String str) {
        this.mmr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMmrAft(String str) {
        this.mmrAft = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMmrVar(String str) {
        this.mmrVar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotInUseAmt(String str) {
        this.spotInUseAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotInUseAmtAft(String str) {
        this.spotInUseAmtAft = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotInUseAmtVar(String str) {
        this.spotInUseAmtVar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotInUseConfirmResp(mgnRatio=" + this.mgnRatio + ", mgnRatioAft=" + this.mgnRatioAft + ", mmr=" + this.mmr + ", mmrVar=" + this.mmrVar + ", mmrAft=" + this.mmrAft + ", spotInUseAmt=" + this.spotInUseAmt + ", spotInUseAmtVar=" + this.spotInUseAmtVar + ", spotInUseAmtAft=" + this.spotInUseAmtAft + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.mgnRatio);
        parcel.writeString(this.mgnRatioAft);
        parcel.writeString(this.mmr);
        parcel.writeString(this.mmrVar);
        parcel.writeString(this.mmrAft);
        parcel.writeString(this.spotInUseAmt);
        parcel.writeString(this.spotInUseAmtVar);
        parcel.writeString(this.spotInUseAmtAft);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpotInUseConfirmResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotInUseConfirmResp> serializer() {
            return SpotInUseConfirmResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotInUseConfirmResp(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.mgnRatio = null;
        } else {
            this.mgnRatio = str;
        }
        if ((i & 2) == 0) {
            this.mgnRatioAft = null;
        } else {
            this.mgnRatioAft = str2;
        }
        if ((i & 4) == 0) {
            this.mmr = null;
        } else {
            this.mmr = str3;
        }
        if ((i & 8) == 0) {
            this.mmrVar = null;
        } else {
            this.mmrVar = str4;
        }
        if ((i & 16) == 0) {
            this.mmrAft = null;
        } else {
            this.mmrAft = str5;
        }
        if ((i & 32) == 0) {
            this.spotInUseAmt = null;
        } else {
            this.spotInUseAmt = str6;
        }
        if ((i & 64) == 0) {
            this.spotInUseAmtVar = null;
        } else {
            this.spotInUseAmtVar = str7;
        }
        if ((i & 128) == 0) {
            this.spotInUseAmtAft = null;
        } else {
            this.spotInUseAmtAft = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpotInUseConfirmResp spotInUseConfirmResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spotInUseConfirmResp.mgnRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spotInUseConfirmResp.mgnRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || spotInUseConfirmResp.mgnRatioAft != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, spotInUseConfirmResp.mgnRatioAft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || spotInUseConfirmResp.mmr != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, spotInUseConfirmResp.mmr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || spotInUseConfirmResp.mmrVar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, spotInUseConfirmResp.mmrVar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || spotInUseConfirmResp.mmrAft != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, spotInUseConfirmResp.mmrAft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || spotInUseConfirmResp.spotInUseAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, spotInUseConfirmResp.spotInUseAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || spotInUseConfirmResp.spotInUseAmtVar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, spotInUseConfirmResp.spotInUseAmtVar);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && spotInUseConfirmResp.spotInUseAmtAft == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, spotInUseConfirmResp.spotInUseAmtAft);
    }

    public SpotInUseConfirmResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.mgnRatio = str;
        this.mgnRatioAft = str2;
        this.mmr = str3;
        this.mmrVar = str4;
        this.mmrAft = str5;
        this.spotInUseAmt = str6;
        this.spotInUseAmtVar = str7;
        this.spotInUseAmtAft = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4340) call: com.okinc.unify_trade.biz.SpotInUseConfirmResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotInUseConfirmResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null);
    }
}

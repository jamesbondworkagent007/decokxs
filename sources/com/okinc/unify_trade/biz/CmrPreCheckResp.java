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
public final class CmrPreCheckResp implements Parcelable {
    private String changeEquity;
    private String changeImr;
    private String changeMgnRatio;
    private String changeMmr;
    private String equity;
    private String imr;
    private String mgnRatio;
    private String mmr;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CmrPreCheckResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<CmrPreCheckResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CmrPreCheckResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CmrPreCheckResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CmrPreCheckResp[] newArray(int i) {
            return new CmrPreCheckResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CmrPreCheckResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.changeMgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.equity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.changeImr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.changeMmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.changeEquity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CmrPreCheckResp copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new CmrPreCheckResp(str, str2, str3, str4, str5, str6, str7, str8);
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
        if (!(obj instanceof CmrPreCheckResp)) {
            return false;
        }
        CmrPreCheckResp cmrPreCheckResp = (CmrPreCheckResp) obj;
        return Intrinsics.EZpvd((Object) this.mgnRatio, (Object) cmrPreCheckResp.mgnRatio) && Intrinsics.EZpvd((Object) this.changeMgnRatio, (Object) cmrPreCheckResp.changeMgnRatio) && Intrinsics.EZpvd((Object) this.imr, (Object) cmrPreCheckResp.imr) && Intrinsics.EZpvd((Object) this.mmr, (Object) cmrPreCheckResp.mmr) && Intrinsics.EZpvd((Object) this.equity, (Object) cmrPreCheckResp.equity) && Intrinsics.EZpvd((Object) this.changeImr, (Object) cmrPreCheckResp.changeImr) && Intrinsics.EZpvd((Object) this.changeMmr, (Object) cmrPreCheckResp.changeMmr) && Intrinsics.EZpvd((Object) this.changeEquity, (Object) cmrPreCheckResp.changeEquity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeEquity() {
        return this.changeEquity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeImr() {
        return this.changeImr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeMgnRatio() {
        return this.changeMgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeMmr() {
        return this.changeMmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEquity() {
        return this.equity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImr() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnRatio() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMmr() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.mgnRatio;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.changeMgnRatio;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.imr;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.mmr;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.equity;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.changeImr;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.changeMmr;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.changeEquity;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeEquity(String str) {
        this.changeEquity = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeImr(String str) {
        this.changeImr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeMgnRatio(String str) {
        this.changeMgnRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeMmr(String str) {
        this.changeMmr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEquity(String str) {
        this.equity = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImr(String str) {
        this.imr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnRatio(String str) {
        this.mgnRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMmr(String str) {
        this.mmr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CmrPreCheckResp(mgnRatio=" + this.mgnRatio + ", changeMgnRatio=" + this.changeMgnRatio + ", imr=" + this.imr + ", mmr=" + this.mmr + ", equity=" + this.equity + ", changeImr=" + this.changeImr + ", changeMmr=" + this.changeMmr + ", changeEquity=" + this.changeEquity + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.mgnRatio);
        parcel.writeString(this.changeMgnRatio);
        parcel.writeString(this.imr);
        parcel.writeString(this.mmr);
        parcel.writeString(this.equity);
        parcel.writeString(this.changeImr);
        parcel.writeString(this.changeMmr);
        parcel.writeString(this.changeEquity);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.CmrPreCheckResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CmrPreCheckResp> serializer() {
            return CmrPreCheckResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CmrPreCheckResp(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.mgnRatio = null;
        } else {
            this.mgnRatio = str;
        }
        if ((i & 2) == 0) {
            this.changeMgnRatio = null;
        } else {
            this.changeMgnRatio = str2;
        }
        if ((i & 4) == 0) {
            this.imr = null;
        } else {
            this.imr = str3;
        }
        if ((i & 8) == 0) {
            this.mmr = null;
        } else {
            this.mmr = str4;
        }
        if ((i & 16) == 0) {
            this.equity = null;
        } else {
            this.equity = str5;
        }
        if ((i & 32) == 0) {
            this.changeImr = null;
        } else {
            this.changeImr = str6;
        }
        if ((i & 64) == 0) {
            this.changeMmr = null;
        } else {
            this.changeMmr = str7;
        }
        if ((i & 128) == 0) {
            this.changeEquity = null;
        } else {
            this.changeEquity = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CmrPreCheckResp cmrPreCheckResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cmrPreCheckResp.mgnRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, cmrPreCheckResp.mgnRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || cmrPreCheckResp.changeMgnRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, cmrPreCheckResp.changeMgnRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || cmrPreCheckResp.imr != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, cmrPreCheckResp.imr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || cmrPreCheckResp.mmr != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, cmrPreCheckResp.mmr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || cmrPreCheckResp.equity != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, cmrPreCheckResp.equity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || cmrPreCheckResp.changeImr != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, cmrPreCheckResp.changeImr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || cmrPreCheckResp.changeMmr != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, cmrPreCheckResp.changeMmr);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && cmrPreCheckResp.changeEquity == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, cmrPreCheckResp.changeEquity);
    }

    public CmrPreCheckResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.mgnRatio = str;
        this.changeMgnRatio = str2;
        this.imr = str3;
        this.mmr = str4;
        this.equity = str5;
        this.changeImr = str6;
        this.changeMmr = str7;
        this.changeEquity = str8;
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:159) call: com.okinc.unify_trade.biz.CmrPreCheckResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CmrPreCheckResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null);
    }
}

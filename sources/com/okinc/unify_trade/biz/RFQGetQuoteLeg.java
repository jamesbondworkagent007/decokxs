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

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class RFQGetQuoteLeg implements Parcelable {
    public static final int $stable = 0;
    private final String instId;
    private final String px;
    private final String side;
    private final String sz;
    private final String tgtCcy;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RFQGetQuoteLeg> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RFQGetQuoteLeg> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQGetQuoteLeg createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RFQGetQuoteLeg(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RFQGetQuoteLeg[] newArray(int i) {
            return new RFQGetQuoteLeg[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RFQGetQuoteLeg() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RFQGetQuoteLeg copy$default(RFQGetQuoteLeg rFQGetQuoteLeg, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rFQGetQuoteLeg.px;
        }
        if ((i & 2) != 0) {
            str2 = rFQGetQuoteLeg.sz;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = rFQGetQuoteLeg.instId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = rFQGetQuoteLeg.side;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = rFQGetQuoteLeg.tgtCcy;
        }
        return rFQGetQuoteLeg.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RFQGetQuoteLeg copy(String str, String str2, String str3, String str4, String str5) {
        return new RFQGetQuoteLeg(str, str2, str3, str4, str5);
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
        if (!(obj instanceof RFQGetQuoteLeg)) {
            return false;
        }
        RFQGetQuoteLeg rFQGetQuoteLeg = (RFQGetQuoteLeg) obj;
        return Intrinsics.EZpvd((Object) this.px, (Object) rFQGetQuoteLeg.px) && Intrinsics.EZpvd((Object) this.sz, (Object) rFQGetQuoteLeg.sz) && Intrinsics.EZpvd((Object) this.instId, (Object) rFQGetQuoteLeg.instId) && Intrinsics.EZpvd((Object) this.side, (Object) rFQGetQuoteLeg.side) && Intrinsics.EZpvd((Object) this.tgtCcy, (Object) rFQGetQuoteLeg.tgtCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTgtCcy() {
        return this.tgtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.px;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.sz;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.instId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.side;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tgtCcy;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RFQGetQuoteLeg(px=" + this.px + ", sz=" + this.sz + ", instId=" + this.instId + ", side=" + this.side + ", tgtCcy=" + this.tgtCcy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.px);
        parcel.writeString(this.sz);
        parcel.writeString(this.instId);
        parcel.writeString(this.side);
        parcel.writeString(this.tgtCcy);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RFQGetQuoteLeg.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RFQGetQuoteLeg> serializer() {
            return RFQGetQuoteLeg$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RFQGetQuoteLeg(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.px = null;
        } else {
            this.px = str;
        }
        if ((i & 2) == 0) {
            this.sz = null;
        } else {
            this.sz = str2;
        }
        if ((i & 4) == 0) {
            this.instId = null;
        } else {
            this.instId = str3;
        }
        if ((i & 8) == 0) {
            this.side = null;
        } else {
            this.side = str4;
        }
        if ((i & 16) == 0) {
            this.tgtCcy = null;
        } else {
            this.tgtCcy = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RFQGetQuoteLeg rFQGetQuoteLeg, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rFQGetQuoteLeg.px != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, rFQGetQuoteLeg.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rFQGetQuoteLeg.sz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, rFQGetQuoteLeg.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rFQGetQuoteLeg.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, rFQGetQuoteLeg.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || rFQGetQuoteLeg.side != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, rFQGetQuoteLeg.side);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && rFQGetQuoteLeg.tgtCcy == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, rFQGetQuoteLeg.tgtCcy);
    }

    public RFQGetQuoteLeg(String str, String str2, String str3, String str4, String str5) {
        this.px = str;
        this.sz = str2;
        this.instId = str3;
        this.side = str4;
        this.tgtCcy = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5359) call: com.okinc.unify_trade.biz.RFQGetQuoteLeg.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RFQGetQuoteLeg(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}

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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TwapModifyReq implements Parcelable {
    public static final int $stable = 0;
    private final String algoId;
    private final String pxLimit;
    private final String pxSpread;
    private final String pxVar;
    private final String sz;
    private final String szLimit;
    private final String timeInterval;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TwapModifyReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TwapModifyReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TwapModifyReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TwapModifyReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TwapModifyReq[] newArray(int i) {
            return new TwapModifyReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TwapModifyReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TwapModifyReq copy$default(TwapModifyReq twapModifyReq, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = twapModifyReq.algoId;
        }
        if ((i & 2) != 0) {
            str2 = twapModifyReq.pxLimit;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = twapModifyReq.pxSpread;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = twapModifyReq.pxVar;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = twapModifyReq.szLimit;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = twapModifyReq.timeInterval;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = twapModifyReq.sz;
        }
        return twapModifyReq.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.szLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TwapModifyReq copy(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new TwapModifyReq(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof TwapModifyReq)) {
            return false;
        }
        TwapModifyReq twapModifyReq = (TwapModifyReq) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) twapModifyReq.algoId) && Intrinsics.EZpvd((Object) this.pxLimit, (Object) twapModifyReq.pxLimit) && Intrinsics.EZpvd((Object) this.pxSpread, (Object) twapModifyReq.pxSpread) && Intrinsics.EZpvd((Object) this.pxVar, (Object) twapModifyReq.pxVar) && Intrinsics.EZpvd((Object) this.szLimit, (Object) twapModifyReq.szLimit) && Intrinsics.EZpvd((Object) this.timeInterval, (Object) twapModifyReq.timeInterval) && Intrinsics.EZpvd((Object) this.sz, (Object) twapModifyReq.sz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxLimit() {
        return this.pxLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxSpread() {
        return this.pxSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxVar() {
        return this.pxVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSzLimit() {
        return this.szLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeInterval() {
        return this.timeInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        int iHashCode2 = this.pxLimit.hashCode();
        String str = this.pxSpread;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.pxVar;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.szLimit.hashCode()) * 31) + this.timeInterval.hashCode()) * 31) + this.sz.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TwapModifyReq(algoId=" + this.algoId + ", pxLimit=" + this.pxLimit + ", pxSpread=" + this.pxSpread + ", pxVar=" + this.pxVar + ", szLimit=" + this.szLimit + ", timeInterval=" + this.timeInterval + ", sz=" + this.sz + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.pxLimit);
        parcel.writeString(this.pxSpread);
        parcel.writeString(this.pxVar);
        parcel.writeString(this.szLimit);
        parcel.writeString(this.timeInterval);
        parcel.writeString(this.sz);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TwapModifyReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TwapModifyReq> serializer() {
            return TwapModifyReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TwapModifyReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.pxLimit = "";
        } else {
            this.pxLimit = str2;
        }
        if ((i & 4) == 0) {
            this.pxSpread = null;
        } else {
            this.pxSpread = str3;
        }
        if ((i & 8) == 0) {
            this.pxVar = null;
        } else {
            this.pxVar = str4;
        }
        if ((i & 16) == 0) {
            this.szLimit = "";
        } else {
            this.szLimit = str5;
        }
        if ((i & 32) == 0) {
            this.timeInterval = "";
        } else {
            this.timeInterval = str6;
        }
        if ((i & 64) == 0) {
            this.sz = "";
        } else {
            this.sz = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TwapModifyReq twapModifyReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) twapModifyReq.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, twapModifyReq.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) twapModifyReq.pxLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, twapModifyReq.pxLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || twapModifyReq.pxSpread != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, twapModifyReq.pxSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || twapModifyReq.pxVar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, twapModifyReq.pxVar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) twapModifyReq.szLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, twapModifyReq.szLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) twapModifyReq.timeInterval, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, twapModifyReq.timeInterval);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) twapModifyReq.sz, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, twapModifyReq.sz);
    }

    public TwapModifyReq(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.algoId = str;
        this.pxLimit = str2;
        this.pxSpread = str3;
        this.pxVar = str4;
        this.szLimit = str5;
        this.timeInterval = str6;
        this.sz = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:885) call: com.okinc.unify_trade.biz.TwapModifyReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TwapModifyReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}

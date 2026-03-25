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
public final class YieldHunterPreviewCloseResp implements Parcelable {
    private String estPnl;
    private String estPnlRatio;
    private String estUpl;
    private String estUplRatio;
    private String expTime;
    private String opType;
    private String settleCcy;
    private String stk;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<YieldHunterPreviewCloseResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<YieldHunterPreviewCloseResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YieldHunterPreviewCloseResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new YieldHunterPreviewCloseResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YieldHunterPreviewCloseResp[] newArray(int i) {
            return new YieldHunterPreviewCloseResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public YieldHunterPreviewCloseResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.estUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.estUplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.estPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.estPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.settleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.stk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.opType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final YieldHunterPreviewCloseResp copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new YieldHunterPreviewCloseResp(str, str2, str3, str4, str5, str6, str7, str8);
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
        if (!(obj instanceof YieldHunterPreviewCloseResp)) {
            return false;
        }
        YieldHunterPreviewCloseResp yieldHunterPreviewCloseResp = (YieldHunterPreviewCloseResp) obj;
        return Intrinsics.EZpvd((Object) this.estUpl, (Object) yieldHunterPreviewCloseResp.estUpl) && Intrinsics.EZpvd((Object) this.estUplRatio, (Object) yieldHunterPreviewCloseResp.estUplRatio) && Intrinsics.EZpvd((Object) this.estPnl, (Object) yieldHunterPreviewCloseResp.estPnl) && Intrinsics.EZpvd((Object) this.estPnlRatio, (Object) yieldHunterPreviewCloseResp.estPnlRatio) && Intrinsics.EZpvd((Object) this.settleCcy, (Object) yieldHunterPreviewCloseResp.settleCcy) && Intrinsics.EZpvd((Object) this.expTime, (Object) yieldHunterPreviewCloseResp.expTime) && Intrinsics.EZpvd((Object) this.stk, (Object) yieldHunterPreviewCloseResp.stk) && Intrinsics.EZpvd((Object) this.opType, (Object) yieldHunterPreviewCloseResp.opType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstPnl() {
        return this.estPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstPnlRatio() {
        return this.estPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstUpl() {
        return this.estUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstUplRatio() {
        return this.estUplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpTime() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpType() {
        return this.opType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettleCcy() {
        return this.settleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStk() {
        return this.stk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.estUpl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.estUplRatio;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.estPnl;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.estPnlRatio;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.settleCcy;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.expTime;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.stk;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.opType;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstPnl(String str) {
        this.estPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstPnlRatio(String str) {
        this.estPnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstUpl(String str) {
        this.estUpl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstUplRatio(String str) {
        this.estUplRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpTime(String str) {
        this.expTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpType(String str) {
        this.opType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettleCcy(String str) {
        this.settleCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStk(String str) {
        this.stk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "YieldHunterPreviewCloseResp(estUpl=" + this.estUpl + ", estUplRatio=" + this.estUplRatio + ", estPnl=" + this.estPnl + ", estPnlRatio=" + this.estPnlRatio + ", settleCcy=" + this.settleCcy + ", expTime=" + this.expTime + ", stk=" + this.stk + ", opType=" + this.opType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.estUpl);
        parcel.writeString(this.estUplRatio);
        parcel.writeString(this.estPnl);
        parcel.writeString(this.estPnlRatio);
        parcel.writeString(this.settleCcy);
        parcel.writeString(this.expTime);
        parcel.writeString(this.stk);
        parcel.writeString(this.opType);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.YieldHunterPreviewCloseResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<YieldHunterPreviewCloseResp> serializer() {
            return YieldHunterPreviewCloseResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ YieldHunterPreviewCloseResp(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.estUpl = null;
        } else {
            this.estUpl = str;
        }
        if ((i & 2) == 0) {
            this.estUplRatio = null;
        } else {
            this.estUplRatio = str2;
        }
        if ((i & 4) == 0) {
            this.estPnl = null;
        } else {
            this.estPnl = str3;
        }
        if ((i & 8) == 0) {
            this.estPnlRatio = null;
        } else {
            this.estPnlRatio = str4;
        }
        if ((i & 16) == 0) {
            this.settleCcy = null;
        } else {
            this.settleCcy = str5;
        }
        if ((i & 32) == 0) {
            this.expTime = null;
        } else {
            this.expTime = str6;
        }
        if ((i & 64) == 0) {
            this.stk = null;
        } else {
            this.stk = str7;
        }
        if ((i & 128) == 0) {
            this.opType = null;
        } else {
            this.opType = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(YieldHunterPreviewCloseResp yieldHunterPreviewCloseResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || yieldHunterPreviewCloseResp.estUpl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, yieldHunterPreviewCloseResp.estUpl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || yieldHunterPreviewCloseResp.estUplRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, yieldHunterPreviewCloseResp.estUplRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || yieldHunterPreviewCloseResp.estPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, yieldHunterPreviewCloseResp.estPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || yieldHunterPreviewCloseResp.estPnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, yieldHunterPreviewCloseResp.estPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || yieldHunterPreviewCloseResp.settleCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, yieldHunterPreviewCloseResp.settleCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || yieldHunterPreviewCloseResp.expTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, yieldHunterPreviewCloseResp.expTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || yieldHunterPreviewCloseResp.stk != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, yieldHunterPreviewCloseResp.stk);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && yieldHunterPreviewCloseResp.opType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, yieldHunterPreviewCloseResp.opType);
    }

    public YieldHunterPreviewCloseResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.estUpl = str;
        this.estUplRatio = str2;
        this.estPnl = str3;
        this.estPnlRatio = str4;
        this.settleCcy = str5;
        this.expTime = str6;
        this.stk = str7;
        this.opType = str8;
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:80) call: com.okinc.unify_trade.biz.YieldHunterPreviewCloseResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ YieldHunterPreviewCloseResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null);
    }
}

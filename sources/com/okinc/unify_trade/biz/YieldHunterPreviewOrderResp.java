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
public final class YieldHunterPreviewOrderResp implements Parcelable {
    private String breakevenPx;
    private String estApl;
    private String estAplRatio;
    private String estPnl;
    private String estPnlPlusCost;
    private String estPnlRatio;
    private String expTime;
    private String idxPx;
    private String lever;
    private String liqPx;
    private String maxCost;
    private String minCost;
    private String stk;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<YieldHunterPreviewOrderResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<YieldHunterPreviewOrderResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YieldHunterPreviewOrderResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new YieldHunterPreviewOrderResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final YieldHunterPreviewOrderResp[] newArray(int i) {
            return new YieldHunterPreviewOrderResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public YieldHunterPreviewOrderResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.estApl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.minCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.maxCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.estPnlPlusCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.breakevenPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.estAplRatio;
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
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.idxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.stk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final YieldHunterPreviewOrderResp copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        return new YieldHunterPreviewOrderResp(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
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
        if (!(obj instanceof YieldHunterPreviewOrderResp)) {
            return false;
        }
        YieldHunterPreviewOrderResp yieldHunterPreviewOrderResp = (YieldHunterPreviewOrderResp) obj;
        return Intrinsics.EZpvd((Object) this.estApl, (Object) yieldHunterPreviewOrderResp.estApl) && Intrinsics.EZpvd((Object) this.estAplRatio, (Object) yieldHunterPreviewOrderResp.estAplRatio) && Intrinsics.EZpvd((Object) this.estPnl, (Object) yieldHunterPreviewOrderResp.estPnl) && Intrinsics.EZpvd((Object) this.estPnlRatio, (Object) yieldHunterPreviewOrderResp.estPnlRatio) && Intrinsics.EZpvd((Object) this.liqPx, (Object) yieldHunterPreviewOrderResp.liqPx) && Intrinsics.EZpvd((Object) this.idxPx, (Object) yieldHunterPreviewOrderResp.idxPx) && Intrinsics.EZpvd((Object) this.lever, (Object) yieldHunterPreviewOrderResp.lever) && Intrinsics.EZpvd((Object) this.expTime, (Object) yieldHunterPreviewOrderResp.expTime) && Intrinsics.EZpvd((Object) this.stk, (Object) yieldHunterPreviewOrderResp.stk) && Intrinsics.EZpvd((Object) this.minCost, (Object) yieldHunterPreviewOrderResp.minCost) && Intrinsics.EZpvd((Object) this.maxCost, (Object) yieldHunterPreviewOrderResp.maxCost) && Intrinsics.EZpvd((Object) this.estPnlPlusCost, (Object) yieldHunterPreviewOrderResp.estPnlPlusCost) && Intrinsics.EZpvd((Object) this.breakevenPx, (Object) yieldHunterPreviewOrderResp.breakevenPx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBreakevenPx() {
        return this.breakevenPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstApl() {
        return this.estApl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstAplRatio() {
        return this.estAplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstPnl() {
        return this.estPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstPnlPlusCost() {
        return this.estPnlPlusCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstPnlRatio() {
        return this.estPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpTime() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdxPx() {
        return this.idxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPx() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxCost() {
        return this.maxCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinCost() {
        return this.minCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStk() {
        return this.stk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.estApl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.estAplRatio;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.estPnl;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.estPnlRatio;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.liqPx;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.idxPx;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.lever;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.expTime;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.stk;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.minCost;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.maxCost;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.estPnlPlusCost;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.breakevenPx;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str13 != null ? str13.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBreakevenPx(String str) {
        this.breakevenPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstApl(String str) {
        this.estApl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstAplRatio(String str) {
        this.estAplRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstPnl(String str) {
        this.estPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstPnlPlusCost(String str) {
        this.estPnlPlusCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstPnlRatio(String str) {
        this.estPnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpTime(String str) {
        this.expTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIdxPx(String str) {
        this.idxPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(String str) {
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiqPx(String str) {
        this.liqPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxCost(String str) {
        this.maxCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinCost(String str) {
        this.minCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStk(String str) {
        this.stk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "YieldHunterPreviewOrderResp(estApl=" + this.estApl + ", estAplRatio=" + this.estAplRatio + ", estPnl=" + this.estPnl + ", estPnlRatio=" + this.estPnlRatio + ", liqPx=" + this.liqPx + ", idxPx=" + this.idxPx + ", lever=" + this.lever + ", expTime=" + this.expTime + ", stk=" + this.stk + ", minCost=" + this.minCost + ", maxCost=" + this.maxCost + ", estPnlPlusCost=" + this.estPnlPlusCost + ", breakevenPx=" + this.breakevenPx + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.estApl);
        parcel.writeString(this.estAplRatio);
        parcel.writeString(this.estPnl);
        parcel.writeString(this.estPnlRatio);
        parcel.writeString(this.liqPx);
        parcel.writeString(this.idxPx);
        parcel.writeString(this.lever);
        parcel.writeString(this.expTime);
        parcel.writeString(this.stk);
        parcel.writeString(this.minCost);
        parcel.writeString(this.maxCost);
        parcel.writeString(this.estPnlPlusCost);
        parcel.writeString(this.breakevenPx);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.YieldHunterPreviewOrderResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<YieldHunterPreviewOrderResp> serializer() {
            return YieldHunterPreviewOrderResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ YieldHunterPreviewOrderResp(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.estApl = null;
        } else {
            this.estApl = str;
        }
        if ((i & 2) == 0) {
            this.estAplRatio = null;
        } else {
            this.estAplRatio = str2;
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
            this.liqPx = null;
        } else {
            this.liqPx = str5;
        }
        if ((i & 32) == 0) {
            this.idxPx = null;
        } else {
            this.idxPx = str6;
        }
        if ((i & 64) == 0) {
            this.lever = null;
        } else {
            this.lever = str7;
        }
        if ((i & 128) == 0) {
            this.expTime = null;
        } else {
            this.expTime = str8;
        }
        if ((i & 256) == 0) {
            this.stk = null;
        } else {
            this.stk = str9;
        }
        if ((i & 512) == 0) {
            this.minCost = null;
        } else {
            this.minCost = str10;
        }
        if ((i & 1024) == 0) {
            this.maxCost = null;
        } else {
            this.maxCost = str11;
        }
        if ((i & 2048) == 0) {
            this.estPnlPlusCost = null;
        } else {
            this.estPnlPlusCost = str12;
        }
        if ((i & 4096) == 0) {
            this.breakevenPx = null;
        } else {
            this.breakevenPx = str13;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(YieldHunterPreviewOrderResp yieldHunterPreviewOrderResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || yieldHunterPreviewOrderResp.estApl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, yieldHunterPreviewOrderResp.estApl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || yieldHunterPreviewOrderResp.estAplRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, yieldHunterPreviewOrderResp.estAplRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || yieldHunterPreviewOrderResp.estPnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, yieldHunterPreviewOrderResp.estPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || yieldHunterPreviewOrderResp.estPnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, yieldHunterPreviewOrderResp.estPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || yieldHunterPreviewOrderResp.liqPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, yieldHunterPreviewOrderResp.liqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || yieldHunterPreviewOrderResp.idxPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, yieldHunterPreviewOrderResp.idxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || yieldHunterPreviewOrderResp.lever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, yieldHunterPreviewOrderResp.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || yieldHunterPreviewOrderResp.expTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, yieldHunterPreviewOrderResp.expTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || yieldHunterPreviewOrderResp.stk != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, yieldHunterPreviewOrderResp.stk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || yieldHunterPreviewOrderResp.minCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, yieldHunterPreviewOrderResp.minCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || yieldHunterPreviewOrderResp.maxCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, yieldHunterPreviewOrderResp.maxCost);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || yieldHunterPreviewOrderResp.estPnlPlusCost != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, yieldHunterPreviewOrderResp.estPnlPlusCost);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && yieldHunterPreviewOrderResp.breakevenPx == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, yieldHunterPreviewOrderResp.breakevenPx);
    }

    public YieldHunterPreviewOrderResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.estApl = str;
        this.estAplRatio = str2;
        this.estPnl = str3;
        this.estPnlRatio = str4;
        this.liqPx = str5;
        this.idxPx = str6;
        this.lever = str7;
        this.expTime = str8;
        this.stk = str9;
        this.minCost = str10;
        this.maxCost = str11;
        this.estPnlPlusCost = str12;
        this.breakevenPx = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0084: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.unify_trade.biz.YieldHunterPreviewOrderResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ YieldHunterPreviewOrderResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) == 0 ? str13 : null);
    }
}

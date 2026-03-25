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
public final class BotLeadProfitProfitOrderDetails implements Parcelable {
    private String accumulatedProfitSharing;
    private String cTime;
    private String estimatedProfitSharing;
    private String followerAssets;
    private String followerCount;
    private String leadAlgoCount;
    private String pTime;
    private String pnlRatio;
    private String profitSharingCcy;
    private String profitSharingRatio;
    private String status;
    private String totalPnl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotLeadProfitProfitOrderDetails> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<BotLeadProfitProfitOrderDetails> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadProfitProfitOrderDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotLeadProfitProfitOrderDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadProfitProfitOrderDetails[] newArray(int i) {
            return new BotLeadProfitProfitOrderDetails[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotLeadProfitProfitOrderDetails() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.estimatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.profitSharingCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accumulatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.leadAlgoCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.followerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadProfitProfitOrderDetails copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str12, "");
        return new BotLeadProfitProfitOrderDetails(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
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
        if (!(obj instanceof BotLeadProfitProfitOrderDetails)) {
            return false;
        }
        BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails = (BotLeadProfitProfitOrderDetails) obj;
        return Intrinsics.EZpvd((Object) this.estimatedProfitSharing, (Object) botLeadProfitProfitOrderDetails.estimatedProfitSharing) && Intrinsics.EZpvd((Object) this.accumulatedProfitSharing, (Object) botLeadProfitProfitOrderDetails.accumulatedProfitSharing) && Intrinsics.EZpvd((Object) this.totalPnl, (Object) botLeadProfitProfitOrderDetails.totalPnl) && Intrinsics.EZpvd((Object) this.leadAlgoCount, (Object) botLeadProfitProfitOrderDetails.leadAlgoCount) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) botLeadProfitProfitOrderDetails.pnlRatio) && Intrinsics.EZpvd((Object) this.cTime, (Object) botLeadProfitProfitOrderDetails.cTime) && Intrinsics.EZpvd((Object) this.pTime, (Object) botLeadProfitProfitOrderDetails.pTime) && Intrinsics.EZpvd((Object) this.followerCount, (Object) botLeadProfitProfitOrderDetails.followerCount) && Intrinsics.EZpvd((Object) this.followerAssets, (Object) botLeadProfitProfitOrderDetails.followerAssets) && Intrinsics.EZpvd((Object) this.profitSharingCcy, (Object) botLeadProfitProfitOrderDetails.profitSharingCcy) && Intrinsics.EZpvd((Object) this.profitSharingRatio, (Object) botLeadProfitProfitOrderDetails.profitSharingRatio) && Intrinsics.EZpvd((Object) this.status, (Object) botLeadProfitProfitOrderDetails.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccumulatedProfitSharing() {
        return this.accumulatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedProfitSharing() {
        return this.estimatedProfitSharing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowerAssets() {
        return this.followerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFollowerCount() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLeadAlgoCount() {
        return this.leadAlgoCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPTime() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingCcy() {
        return this.profitSharingCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingRatio() {
        return this.profitSharingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.estimatedProfitSharing;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.accumulatedProfitSharing;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.totalPnl;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.leadAlgoCount;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.pnlRatio;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.cTime;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.pTime;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.followerCount;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.followerAssets;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.profitSharingCcy;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.profitSharingRatio;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str11 != null ? str11.hashCode() : 0)) * 31) + this.status.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccumulatedProfitSharing(String str) {
        this.accumulatedProfitSharing = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCTime(String str) {
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedProfitSharing(String str) {
        this.estimatedProfitSharing = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFollowerAssets(String str) {
        this.followerAssets = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFollowerCount(String str) {
        this.followerCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeadAlgoCount(String str) {
        this.leadAlgoCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPTime(String str) {
        this.pTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatio(String str) {
        this.pnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingCcy(String str) {
        this.profitSharingCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingRatio(String str) {
        this.profitSharingRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnl(String str) {
        this.totalPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotLeadProfitProfitOrderDetails(estimatedProfitSharing=" + this.estimatedProfitSharing + ", accumulatedProfitSharing=" + this.accumulatedProfitSharing + ", totalPnl=" + this.totalPnl + ", leadAlgoCount=" + this.leadAlgoCount + ", pnlRatio=" + this.pnlRatio + ", cTime=" + this.cTime + ", pTime=" + this.pTime + ", followerCount=" + this.followerCount + ", followerAssets=" + this.followerAssets + ", profitSharingCcy=" + this.profitSharingCcy + ", profitSharingRatio=" + this.profitSharingRatio + ", status=" + this.status + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.estimatedProfitSharing);
        parcel.writeString(this.accumulatedProfitSharing);
        parcel.writeString(this.totalPnl);
        parcel.writeString(this.leadAlgoCount);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.cTime);
        parcel.writeString(this.pTime);
        parcel.writeString(this.followerCount);
        parcel.writeString(this.followerAssets);
        parcel.writeString(this.profitSharingCcy);
        parcel.writeString(this.profitSharingRatio);
        parcel.writeString(this.status);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotLeadProfitProfitOrderDetails> serializer() {
            return BotLeadProfitProfitOrderDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotLeadProfitProfitOrderDetails(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.estimatedProfitSharing = "";
        } else {
            this.estimatedProfitSharing = str;
        }
        if ((i & 2) == 0) {
            this.accumulatedProfitSharing = "";
        } else {
            this.accumulatedProfitSharing = str2;
        }
        if ((i & 4) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str3;
        }
        if ((i & 8) == 0) {
            this.leadAlgoCount = "";
        } else {
            this.leadAlgoCount = str4;
        }
        if ((i & 16) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str5;
        }
        if ((i & 32) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str6;
        }
        if ((i & 64) == 0) {
            this.pTime = "";
        } else {
            this.pTime = str7;
        }
        if ((i & 128) == 0) {
            this.followerCount = "";
        } else {
            this.followerCount = str8;
        }
        if ((i & 256) == 0) {
            this.followerAssets = "";
        } else {
            this.followerAssets = str9;
        }
        if ((i & 512) == 0) {
            this.profitSharingCcy = "";
        } else {
            this.profitSharingCcy = str10;
        }
        if ((i & 1024) == 0) {
            this.profitSharingRatio = "";
        } else {
            this.profitSharingRatio = str11;
        }
        if ((i & 2048) == 0) {
            this.status = "";
        } else {
            this.status = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) botLeadProfitProfitOrderDetails.estimatedProfitSharing, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, botLeadProfitProfitOrderDetails.estimatedProfitSharing);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) botLeadProfitProfitOrderDetails.accumulatedProfitSharing, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, botLeadProfitProfitOrderDetails.accumulatedProfitSharing);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) botLeadProfitProfitOrderDetails.totalPnl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, botLeadProfitProfitOrderDetails.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) botLeadProfitProfitOrderDetails.leadAlgoCount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, botLeadProfitProfitOrderDetails.leadAlgoCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) botLeadProfitProfitOrderDetails.pnlRatio, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, botLeadProfitProfitOrderDetails.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) botLeadProfitProfitOrderDetails.cTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, botLeadProfitProfitOrderDetails.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) botLeadProfitProfitOrderDetails.pTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, botLeadProfitProfitOrderDetails.pTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) botLeadProfitProfitOrderDetails.followerCount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, botLeadProfitProfitOrderDetails.followerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) botLeadProfitProfitOrderDetails.followerAssets, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, botLeadProfitProfitOrderDetails.followerAssets);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) botLeadProfitProfitOrderDetails.profitSharingCcy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, botLeadProfitProfitOrderDetails.profitSharingCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) botLeadProfitProfitOrderDetails.profitSharingRatio, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, botLeadProfitProfitOrderDetails.profitSharingRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) botLeadProfitProfitOrderDetails.status, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, botLeadProfitProfitOrderDetails.status);
    }

    public BotLeadProfitProfitOrderDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str12, "");
        this.estimatedProfitSharing = str;
        this.accumulatedProfitSharing = str2;
        this.totalPnl = str3;
        this.leadAlgoCount = str4;
        this.pnlRatio = str5;
        this.cTime = str6;
        this.pTime = str7;
        this.followerCount = str8;
        this.followerAssets = str9;
        this.profitSharingCcy = str10;
        this.profitSharingRatio = str11;
        this.status = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3789) call: com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BotLeadProfitProfitOrderDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) == 0 ? str12 : "");
    }
}

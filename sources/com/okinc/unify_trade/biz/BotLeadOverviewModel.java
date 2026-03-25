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
public final class BotLeadOverviewModel implements Parcelable {
    private String avatar;
    private String followerAssets;
    private String followerCount;
    private String followerTotalProfit;
    private String historicalProfitLossRatio;
    private String historicalWinRate;
    private String lossCount;
    private String profitCount;
    private String profitSharingCcy;
    private String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotLeadOverviewModel> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<BotLeadOverviewModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadOverviewModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotLeadOverviewModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadOverviewModel[] newArray(int i) {
            return new BotLeadOverviewModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotLeadOverviewModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.historicalWinRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.followerAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.historicalProfitLossRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.profitCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lossCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.followerTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.profitSharingCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadOverviewModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return new BotLeadOverviewModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
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
        if (!(obj instanceof BotLeadOverviewModel)) {
            return false;
        }
        BotLeadOverviewModel botLeadOverviewModel = (BotLeadOverviewModel) obj;
        return Intrinsics.EZpvd((Object) this.historicalWinRate, (Object) botLeadOverviewModel.historicalWinRate) && Intrinsics.EZpvd((Object) this.historicalProfitLossRatio, (Object) botLeadOverviewModel.historicalProfitLossRatio) && Intrinsics.EZpvd((Object) this.profitCount, (Object) botLeadOverviewModel.profitCount) && Intrinsics.EZpvd((Object) this.lossCount, (Object) botLeadOverviewModel.lossCount) && Intrinsics.EZpvd((Object) this.followerTotalProfit, (Object) botLeadOverviewModel.followerTotalProfit) && Intrinsics.EZpvd((Object) this.followerCount, (Object) botLeadOverviewModel.followerCount) && Intrinsics.EZpvd((Object) this.username, (Object) botLeadOverviewModel.username) && Intrinsics.EZpvd((Object) this.avatar, (Object) botLeadOverviewModel.avatar) && Intrinsics.EZpvd((Object) this.profitSharingCcy, (Object) botLeadOverviewModel.profitSharingCcy) && Intrinsics.EZpvd((Object) this.followerAssets, (Object) botLeadOverviewModel.followerAssets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
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
    public final String getFollowerTotalProfit() {
        return this.followerTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHistoricalProfitLossRatio() {
        return this.historicalProfitLossRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHistoricalWinRate() {
        return this.historicalWinRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLossCount() {
        return this.lossCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitCount() {
        return this.profitCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingCcy() {
        return this.profitSharingCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsername() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.historicalWinRate;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.historicalProfitLossRatio;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.profitCount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.lossCount;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.followerTotalProfit;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.followerCount;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.username;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.avatar;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.profitSharingCcy;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.followerAssets;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str10 != null ? str10.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvatar(String str) {
        this.avatar = str;
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
    public final void setFollowerTotalProfit(String str) {
        this.followerTotalProfit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHistoricalProfitLossRatio(String str) {
        this.historicalProfitLossRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHistoricalWinRate(String str) {
        this.historicalWinRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLossCount(String str) {
        this.lossCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitCount(String str) {
        this.profitCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingCcy(String str) {
        this.profitSharingCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsername(String str) {
        this.username = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotLeadOverviewModel(historicalWinRate=" + this.historicalWinRate + ", historicalProfitLossRatio=" + this.historicalProfitLossRatio + ", profitCount=" + this.profitCount + ", lossCount=" + this.lossCount + ", followerTotalProfit=" + this.followerTotalProfit + ", followerCount=" + this.followerCount + ", username=" + this.username + ", avatar=" + this.avatar + ", profitSharingCcy=" + this.profitSharingCcy + ", followerAssets=" + this.followerAssets + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.historicalWinRate);
        parcel.writeString(this.historicalProfitLossRatio);
        parcel.writeString(this.profitCount);
        parcel.writeString(this.lossCount);
        parcel.writeString(this.followerTotalProfit);
        parcel.writeString(this.followerCount);
        parcel.writeString(this.username);
        parcel.writeString(this.avatar);
        parcel.writeString(this.profitSharingCcy);
        parcel.writeString(this.followerAssets);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotLeadOverviewModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotLeadOverviewModel> serializer() {
            return BotLeadOverviewModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotLeadOverviewModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.historicalWinRate = null;
        } else {
            this.historicalWinRate = str;
        }
        if ((i & 2) == 0) {
            this.historicalProfitLossRatio = null;
        } else {
            this.historicalProfitLossRatio = str2;
        }
        if ((i & 4) == 0) {
            this.profitCount = null;
        } else {
            this.profitCount = str3;
        }
        if ((i & 8) == 0) {
            this.lossCount = null;
        } else {
            this.lossCount = str4;
        }
        if ((i & 16) == 0) {
            this.followerTotalProfit = null;
        } else {
            this.followerTotalProfit = str5;
        }
        if ((i & 32) == 0) {
            this.followerCount = null;
        } else {
            this.followerCount = str6;
        }
        if ((i & 64) == 0) {
            this.username = null;
        } else {
            this.username = str7;
        }
        if ((i & 128) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str8;
        }
        if ((i & 256) == 0) {
            this.profitSharingCcy = null;
        } else {
            this.profitSharingCcy = str9;
        }
        if ((i & 512) == 0) {
            this.followerAssets = null;
        } else {
            this.followerAssets = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotLeadOverviewModel botLeadOverviewModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || botLeadOverviewModel.historicalWinRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, botLeadOverviewModel.historicalWinRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || botLeadOverviewModel.historicalProfitLossRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, botLeadOverviewModel.historicalProfitLossRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || botLeadOverviewModel.profitCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, botLeadOverviewModel.profitCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || botLeadOverviewModel.lossCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, botLeadOverviewModel.lossCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || botLeadOverviewModel.followerTotalProfit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, botLeadOverviewModel.followerTotalProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || botLeadOverviewModel.followerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, botLeadOverviewModel.followerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || botLeadOverviewModel.username != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, botLeadOverviewModel.username);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || botLeadOverviewModel.avatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, botLeadOverviewModel.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || botLeadOverviewModel.profitSharingCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, botLeadOverviewModel.profitSharingCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && botLeadOverviewModel.followerAssets == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, botLeadOverviewModel.followerAssets);
    }

    public BotLeadOverviewModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.historicalWinRate = str;
        this.historicalProfitLossRatio = str2;
        this.profitCount = str3;
        this.lossCount = str4;
        this.followerTotalProfit = str5;
        this.followerCount = str6;
        this.username = str7;
        this.avatar = str8;
        this.profitSharingCcy = str9;
        this.followerAssets = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3638) call: com.okinc.unify_trade.biz.BotLeadOverviewModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BotLeadOverviewModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) == 0 ? str10 : null);
    }
}

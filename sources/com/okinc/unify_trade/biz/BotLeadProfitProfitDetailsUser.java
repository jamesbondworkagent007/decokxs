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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class BotLeadProfitProfitDetailsUser implements Parcelable {
    private String amount;
    private String avatar;
    private boolean isTopTime;
    private String profitSharingCcy;
    private String settlementTime;
    private String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotLeadProfitProfitDetailsUser> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BotLeadProfitProfitDetailsUser> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadProfitProfitDetailsUser createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotLeadProfitProfitDetailsUser(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotLeadProfitProfitDetailsUser[] newArray(int i) {
            return new BotLeadProfitProfitDetailsUser[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotLeadProfitProfitDetailsUser() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, false, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotLeadProfitProfitDetailsUser copy$default(BotLeadProfitProfitDetailsUser botLeadProfitProfitDetailsUser, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botLeadProfitProfitDetailsUser.username;
        }
        if ((i & 2) != 0) {
            str2 = botLeadProfitProfitDetailsUser.avatar;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = botLeadProfitProfitDetailsUser.amount;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = botLeadProfitProfitDetailsUser.profitSharingCcy;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = botLeadProfitProfitDetailsUser.settlementTime;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            z = botLeadProfitProfitDetailsUser.isTopTime;
        }
        return botLeadProfitProfitDetailsUser.copy(str, str6, str7, str8, str9, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.profitSharingCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isTopTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotLeadProfitProfitDetailsUser copy(String str, String str2, String str3, String str4, String str5, boolean z) {
        return new BotLeadProfitProfitDetailsUser(str, str2, str3, str4, str5, z);
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
        if (!(obj instanceof BotLeadProfitProfitDetailsUser)) {
            return false;
        }
        BotLeadProfitProfitDetailsUser botLeadProfitProfitDetailsUser = (BotLeadProfitProfitDetailsUser) obj;
        return Intrinsics.EZpvd((Object) this.username, (Object) botLeadProfitProfitDetailsUser.username) && Intrinsics.EZpvd((Object) this.avatar, (Object) botLeadProfitProfitDetailsUser.avatar) && Intrinsics.EZpvd((Object) this.amount, (Object) botLeadProfitProfitDetailsUser.amount) && Intrinsics.EZpvd((Object) this.profitSharingCcy, (Object) botLeadProfitProfitDetailsUser.profitSharingCcy) && Intrinsics.EZpvd((Object) this.settlementTime, (Object) botLeadProfitProfitDetailsUser.settlementTime) && this.isTopTime == botLeadProfitProfitDetailsUser.isTopTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitSharingCcy() {
        return this.profitSharingCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementTime() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsername() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.username;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.avatar;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.amount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.profitSharingCcy;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.settlementTime;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.isTopTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTopTime() {
        return this.isTopTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvatar(String str) {
        this.avatar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfitSharingCcy(String str) {
        this.profitSharingCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettlementTime(String str) {
        this.settlementTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopTime(boolean z) {
        this.isTopTime = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsername(String str) {
        this.username = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotLeadProfitProfitDetailsUser(username=" + this.username + ", avatar=" + this.avatar + ", amount=" + this.amount + ", profitSharingCcy=" + this.profitSharingCcy + ", settlementTime=" + this.settlementTime + ", isTopTime=" + this.isTopTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.username);
        parcel.writeString(this.avatar);
        parcel.writeString(this.amount);
        parcel.writeString(this.profitSharingCcy);
        parcel.writeString(this.settlementTime);
        parcel.writeInt(this.isTopTime ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotLeadProfitProfitDetailsUser.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotLeadProfitProfitDetailsUser> serializer() {
            return BotLeadProfitProfitDetailsUser$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotLeadProfitProfitDetailsUser(int i, String str, String str2, String str3, String str4, String str5, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.username = "";
        } else {
            this.username = str;
        }
        if ((i & 2) == 0) {
            this.avatar = "";
        } else {
            this.avatar = str2;
        }
        if ((i & 4) == 0) {
            this.amount = "";
        } else {
            this.amount = str3;
        }
        if ((i & 8) == 0) {
            this.profitSharingCcy = "";
        } else {
            this.profitSharingCcy = str4;
        }
        if ((i & 16) == 0) {
            this.settlementTime = "";
        } else {
            this.settlementTime = str5;
        }
        if ((i & 32) == 0) {
            this.isTopTime = false;
        } else {
            this.isTopTime = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotLeadProfitProfitDetailsUser botLeadProfitProfitDetailsUser, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) botLeadProfitProfitDetailsUser.username, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, botLeadProfitProfitDetailsUser.username);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) botLeadProfitProfitDetailsUser.avatar, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, botLeadProfitProfitDetailsUser.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) botLeadProfitProfitDetailsUser.amount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, botLeadProfitProfitDetailsUser.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) botLeadProfitProfitDetailsUser.profitSharingCcy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, botLeadProfitProfitDetailsUser.profitSharingCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) botLeadProfitProfitDetailsUser.settlementTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, botLeadProfitProfitDetailsUser.settlementTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || botLeadProfitProfitDetailsUser.isTopTime) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, botLeadProfitProfitDetailsUser.isTopTime);
        }
    }

    public BotLeadProfitProfitDetailsUser(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.username = str;
        this.avatar = str2;
        this.amount = str3;
        this.profitSharingCcy = str4;
        this.settlementTime = str5;
        this.isTopTime = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:3776) call: com.okinc.unify_trade.biz.BotLeadProfitProfitDetailsUser.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ BotLeadProfitProfitDetailsUser(String str, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? false : z);
    }
}

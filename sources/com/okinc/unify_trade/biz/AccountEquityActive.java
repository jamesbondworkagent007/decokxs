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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class AccountEquityActive implements Parcelable {
    private final String activeMsg;
    private final String isActive;
    private String isEnough;
    private final String isUpgrade;
    private final String limitEq;
    private final String totalEq;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountEquityActive> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<AccountEquityActive> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountEquityActive createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AccountEquityActive(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountEquityActive[] newArray(int i) {
            return new AccountEquityActive[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountEquityActive() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AccountEquityActive copy$default(AccountEquityActive accountEquityActive, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountEquityActive.totalEq;
        }
        if ((i & 2) != 0) {
            str2 = accountEquityActive.limitEq;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = accountEquityActive.isEnough;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = accountEquityActive.isActive;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = accountEquityActive.isUpgrade;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = accountEquityActive.activeMsg;
        }
        return accountEquityActive.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.limitEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.isEnough;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.isUpgrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.activeMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountEquityActive copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new AccountEquityActive(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof AccountEquityActive)) {
            return false;
        }
        AccountEquityActive accountEquityActive = (AccountEquityActive) obj;
        return Intrinsics.EZpvd((Object) this.totalEq, (Object) accountEquityActive.totalEq) && Intrinsics.EZpvd((Object) this.limitEq, (Object) accountEquityActive.limitEq) && Intrinsics.EZpvd((Object) this.isEnough, (Object) accountEquityActive.isEnough) && Intrinsics.EZpvd((Object) this.isActive, (Object) accountEquityActive.isActive) && Intrinsics.EZpvd((Object) this.isUpgrade, (Object) accountEquityActive.isUpgrade) && Intrinsics.EZpvd((Object) this.activeMsg, (Object) accountEquityActive.activeMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActiveMsg() {
        return this.activeMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitEq() {
        return this.limitEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalEq() {
        return this.totalEq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.totalEq.hashCode() * 31) + this.limitEq.hashCode()) * 31) + this.isEnough.hashCode()) * 31) + this.isActive.hashCode()) * 31) + this.isUpgrade.hashCode()) * 31) + this.activeMsg.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isActive() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isEnough() {
        return this.isEnough;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isUpgrade() {
        return this.isUpgrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnough(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isEnough = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountEquityActive(totalEq=" + this.totalEq + ", limitEq=" + this.limitEq + ", isEnough=" + this.isEnough + ", isActive=" + this.isActive + ", isUpgrade=" + this.isUpgrade + ", activeMsg=" + this.activeMsg + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalEq);
        parcel.writeString(this.limitEq);
        parcel.writeString(this.isEnough);
        parcel.writeString(this.isActive);
        parcel.writeString(this.isUpgrade);
        parcel.writeString(this.activeMsg);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AccountEquityActive.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountEquityActive> serializer() {
            return AccountEquityActive$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountEquityActive(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalEq = "";
        } else {
            this.totalEq = str;
        }
        if ((i & 2) == 0) {
            this.limitEq = "";
        } else {
            this.limitEq = str2;
        }
        if ((i & 4) == 0) {
            this.isEnough = "";
        } else {
            this.isEnough = str3;
        }
        if ((i & 8) == 0) {
            this.isActive = "";
        } else {
            this.isActive = str4;
        }
        if ((i & 16) == 0) {
            this.isUpgrade = "";
        } else {
            this.isUpgrade = str5;
        }
        if ((i & 32) == 0) {
            this.activeMsg = "";
        } else {
            this.activeMsg = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AccountEquityActive accountEquityActive, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountEquityActive.totalEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, accountEquityActive.totalEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountEquityActive.limitEq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, accountEquityActive.limitEq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) accountEquityActive.isEnough, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, accountEquityActive.isEnough);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) accountEquityActive.isActive, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, accountEquityActive.isActive);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) accountEquityActive.isUpgrade, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, accountEquityActive.isUpgrade);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) accountEquityActive.activeMsg, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, accountEquityActive.activeMsg);
    }

    public AccountEquityActive(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.totalEq = str;
        this.limitEq = str2;
        this.isEnough = str3;
        this.isActive = str4;
        this.isUpgrade = str5;
        this.activeMsg = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:284) call: com.okinc.unify_trade.biz.AccountEquityActive.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AccountEquityActive(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}

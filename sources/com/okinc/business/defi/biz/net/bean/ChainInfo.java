package com.okinc.business.defi.biz.net.bean;

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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ChainInfo implements Parcelable {
    private boolean canRecharge;
    private boolean canWithdraw;
    private Notice notice;
    private String rechargeMsg;
    private String withdrawMsg;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChainInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ChainInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChainInfo(parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Notice.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChainInfo[] newArray(int i) {
            return new ChainInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChainInfo() {
        this(false, (String) null, false, (String) null, (Notice) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChainInfo copy$default(ChainInfo chainInfo, boolean z, String str, boolean z2, String str2, Notice notice, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chainInfo.canRecharge;
        }
        if ((i & 2) != 0) {
            str = chainInfo.rechargeMsg;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            z2 = chainInfo.canWithdraw;
        }
        boolean z3 = z2;
        if ((i & 8) != 0) {
            str2 = chainInfo.withdrawMsg;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            notice = chainInfo.notice;
        }
        return chainInfo.copy(z, str3, z3, str4, notice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.canRecharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rechargeMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.canWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.withdrawMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Notice component5() {
        return this.notice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainInfo copy(boolean z, @NotNull String str, boolean z2, @NotNull String str2, Notice notice) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ChainInfo(z, str, z2, str2, notice);
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
        if (!(obj instanceof ChainInfo)) {
            return false;
        }
        ChainInfo chainInfo = (ChainInfo) obj;
        return this.canRecharge == chainInfo.canRecharge && Intrinsics.EZpvd((Object) this.rechargeMsg, (Object) chainInfo.rechargeMsg) && this.canWithdraw == chainInfo.canWithdraw && Intrinsics.EZpvd((Object) this.withdrawMsg, (Object) chainInfo.withdrawMsg) && Intrinsics.EZpvd(this.notice, chainInfo.notice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanRecharge() {
        return this.canRecharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanWithdraw() {
        return this.canWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Notice getNotice() {
        return this.notice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRechargeMsg() {
        return this.rechargeMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWithdrawMsg() {
        return this.withdrawMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.canRecharge);
        int iHashCode2 = this.rechargeMsg.hashCode();
        int iHashCode3 = Boolean.hashCode(this.canWithdraw);
        int iHashCode4 = this.withdrawMsg.hashCode();
        Notice notice = this.notice;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (notice == null ? 0 : notice.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanRecharge(boolean z) {
        this.canRecharge = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanWithdraw(boolean z) {
        this.canWithdraw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotice(Notice notice) {
        this.notice = notice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRechargeMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rechargeMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWithdrawMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.withdrawMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChainInfo(canRecharge=" + this.canRecharge + ", rechargeMsg=" + this.rechargeMsg + ", canWithdraw=" + this.canWithdraw + ", withdrawMsg=" + this.withdrawMsg + ", notice=" + this.notice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.canRecharge ? 1 : 0);
        parcel.writeString(this.rechargeMsg);
        parcel.writeInt(this.canWithdraw ? 1 : 0);
        parcel.writeString(this.withdrawMsg);
        Notice notice = this.notice;
        if (notice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notice.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ChainInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChainInfo> serializer() {
            return ChainInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChainInfo(int i, boolean z, String str, boolean z2, String str2, Notice notice, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.canRecharge = false;
        } else {
            this.canRecharge = z;
        }
        if ((i & 2) == 0) {
            this.rechargeMsg = "";
        } else {
            this.rechargeMsg = str;
        }
        if ((i & 4) == 0) {
            this.canWithdraw = false;
        } else {
            this.canWithdraw = z2;
        }
        if ((i & 8) == 0) {
            this.withdrawMsg = "";
        } else {
            this.withdrawMsg = str2;
        }
        if ((i & 16) == 0) {
            this.notice = null;
        } else {
            this.notice = notice;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ChainInfo chainInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || chainInfo.canRecharge) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, chainInfo.canRecharge);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) chainInfo.rechargeMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, chainInfo.rechargeMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || chainInfo.canWithdraw) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, chainInfo.canWithdraw);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) chainInfo.withdrawMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, chainInfo.withdrawMsg);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && chainInfo.notice == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, Notice$$serializer.INSTANCE, chainInfo.notice);
    }

    public ChainInfo(boolean z, @NotNull String str, boolean z2, @NotNull String str2, Notice notice) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.canRecharge = z;
        this.rechargeMsg = str;
        this.canWithdraw = z2;
        this.withdrawMsg = str2;
        this.notice = notice;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:com.okinc.business.defi.biz.net.bean.Notice:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.Notice) : (r8v0 com.okinc.business.defi.biz.net.bean.Notice))
 A[MD:(boolean, java.lang.String, boolean, java.lang.String, com.okinc.business.defi.biz.net.bean.Notice):void (m)] (LINE:27) call: com.okinc.business.defi.biz.net.bean.ChainInfo.<init>(boolean, java.lang.String, boolean, java.lang.String, com.okinc.business.defi.biz.net.bean.Notice):void type: THIS */
    public /* synthetic */ ChainInfo(boolean z, String str, boolean z2, String str2, Notice notice, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? z2 : false, (i & 8) == 0 ? str2 : "", (i & 16) != 0 ? null : notice);
    }
}

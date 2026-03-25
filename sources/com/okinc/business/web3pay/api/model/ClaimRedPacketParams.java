package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ClaimRedPacketParams implements Parcelable {
    public static final int $stable = 0;
    public static final String KEY_CLAIM_RED_PACKET_DATA = "key_claim_red_packet_data";
    private final String chainIndex;
    private final String giftId;
    private final String groupId;
    private final Web3PayProjectId projectId;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final Parcelable.Creator<ClaimRedPacketParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ClaimRedPacketParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClaimRedPacketParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ClaimRedPacketParams(parcel.readString(), parcel.readString(), parcel.readString(), Web3PayProjectId.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClaimRedPacketParams[] newArray(int i) {
            return new ClaimRedPacketParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ClaimRedPacketParams copy$default(ClaimRedPacketParams claimRedPacketParams, String str, String str2, String str3, Web3PayProjectId web3PayProjectId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = claimRedPacketParams.giftId;
        }
        if ((i & 2) != 0) {
            str2 = claimRedPacketParams.groupId;
        }
        if ((i & 4) != 0) {
            str3 = claimRedPacketParams.chainIndex;
        }
        if ((i & 8) != 0) {
            web3PayProjectId = claimRedPacketParams.projectId;
        }
        return claimRedPacketParams.copy(str, str2, str3, web3PayProjectId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.giftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3PayProjectId component4() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClaimRedPacketParams copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Web3PayProjectId web3PayProjectId) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(web3PayProjectId, "");
        return new ClaimRedPacketParams(str, str2, str3, web3PayProjectId);
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
        if (!(obj instanceof ClaimRedPacketParams)) {
            return false;
        }
        ClaimRedPacketParams claimRedPacketParams = (ClaimRedPacketParams) obj;
        return Intrinsics.EZpvd((Object) this.giftId, (Object) claimRedPacketParams.giftId) && Intrinsics.EZpvd((Object) this.groupId, (Object) claimRedPacketParams.groupId) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) claimRedPacketParams.chainIndex) && this.projectId == claimRedPacketParams.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGiftId() {
        return this.giftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3PayProjectId getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.giftId.hashCode() * 31) + this.groupId.hashCode()) * 31) + this.chainIndex.hashCode()) * 31) + this.projectId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ClaimRedPacketParams(giftId=" + this.giftId + ", groupId=" + this.groupId + ", chainIndex=" + this.chainIndex + ", projectId=" + this.projectId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.giftId);
        parcel.writeString(this.groupId);
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.projectId.name());
    }

    public ClaimRedPacketParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Web3PayProjectId web3PayProjectId) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(web3PayProjectId, "");
        this.giftId = str;
        this.groupId = str2;
        this.chainIndex = str3;
        this.projectId = web3PayProjectId;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:com.okinc.business.web3pay.api.model.Web3PayProjectId:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.web3pay.api.model.Web3PayProjectId:0x0004: SGET  A[WRAPPED] (LINE:13) com.okinc.business.web3pay.api.model.Web3PayProjectId.GIFT_PAY com.okinc.business.web3pay.api.model.Web3PayProjectId) : (r4v0 com.okinc.business.web3pay.api.model.Web3PayProjectId))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.api.model.Web3PayProjectId):void (m)] (LINE:9) call: com.okinc.business.web3pay.api.model.ClaimRedPacketParams.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.web3pay.api.model.Web3PayProjectId):void type: THIS */
    public /* synthetic */ ClaimRedPacketParams(String str, String str2, String str3, Web3PayProjectId web3PayProjectId, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? Web3PayProjectId.GIFT_PAY : web3PayProjectId);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.ClaimRedPacketParams.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}

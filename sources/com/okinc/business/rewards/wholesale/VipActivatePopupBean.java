package com.okinc.business.rewards.wholesale;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class VipActivatePopupBean implements Parcelable {
    public static final int $stable = 0;
    private final String bizId;
    private final String code;
    private final String inviterName;
    private final String tradingFee;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VipActivatePopupBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VipActivatePopupBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipActivatePopupBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VipActivatePopupBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipActivatePopupBean[] newArray(int i) {
            return new VipActivatePopupBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VipActivatePopupBean() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VipActivatePopupBean copy$default(VipActivatePopupBean vipActivatePopupBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vipActivatePopupBean.bizId;
        }
        if ((i & 2) != 0) {
            str2 = vipActivatePopupBean.code;
        }
        if ((i & 4) != 0) {
            str3 = vipActivatePopupBean.inviterName;
        }
        if ((i & 8) != 0) {
            str4 = vipActivatePopupBean.tradingFee;
        }
        return vipActivatePopupBean.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bizId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.inviterName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tradingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipActivatePopupBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new VipActivatePopupBean(str, str2, str3, str4);
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
        if (!(obj instanceof VipActivatePopupBean)) {
            return false;
        }
        VipActivatePopupBean vipActivatePopupBean = (VipActivatePopupBean) obj;
        return Intrinsics.EZpvd((Object) this.bizId, (Object) vipActivatePopupBean.bizId) && Intrinsics.EZpvd((Object) this.code, (Object) vipActivatePopupBean.code) && Intrinsics.EZpvd((Object) this.inviterName, (Object) vipActivatePopupBean.inviterName) && Intrinsics.EZpvd((Object) this.tradingFee, (Object) vipActivatePopupBean.tradingFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizId() {
        return this.bizId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviterName() {
        return this.inviterName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradingFee() {
        return this.tradingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.bizId.hashCode() * 31) + this.code.hashCode()) * 31) + this.inviterName.hashCode()) * 31) + this.tradingFee.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VipActivatePopupBean(bizId=" + this.bizId + ", code=" + this.code + ", inviterName=" + this.inviterName + ", tradingFee=" + this.tradingFee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.bizId);
        parcel.writeString(this.code);
        parcel.writeString(this.inviterName);
        parcel.writeString(this.tradingFee);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.wholesale.VipActivatePopupBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VipActivatePopupBean> serializer() {
            return VipActivatePopupBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VipActivatePopupBean(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bizId = "";
        } else {
            this.bizId = str;
        }
        if ((i & 2) == 0) {
            this.code = "";
        } else {
            this.code = str2;
        }
        if ((i & 4) == 0) {
            this.inviterName = "";
        } else {
            this.inviterName = str3;
        }
        if ((i & 8) == 0) {
            this.tradingFee = "";
        } else {
            this.tradingFee = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_rewards_api(VipActivatePopupBean vipActivatePopupBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) vipActivatePopupBean.bizId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, vipActivatePopupBean.bizId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) vipActivatePopupBean.code, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, vipActivatePopupBean.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) vipActivatePopupBean.inviterName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, vipActivatePopupBean.inviterName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) vipActivatePopupBean.tradingFee, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, vipActivatePopupBean.tradingFee);
    }

    public VipActivatePopupBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.bizId = str;
        this.code = str2;
        this.inviterName = str3;
        this.tradingFee = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.business.rewards.wholesale.VipActivatePopupBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ VipActivatePopupBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}

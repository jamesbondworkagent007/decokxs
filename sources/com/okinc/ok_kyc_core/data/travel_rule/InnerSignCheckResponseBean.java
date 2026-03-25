package com.okinc.ok_kyc_core.data.travel_rule;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class InnerSignCheckResponseBean implements Parcelable {
    public static final int SIGN_ERROR_CODE_BACKUP_ERROR = 7;
    public static final int SIGN_ERROR_CODE_NOT_SUPPORT_CHAIN_FOR_SIGN = 4;
    public static final int SIGN_ERROR_CODE_NOT_SUPPORT_CHAIN_IN_COINS = 3;
    public static final int SIGN_ERROR_CODE_NO_BACKUP = 6;
    public static final int SIGN_ERROR_CODE_NO_MATCH_WALLET = 5;
    public static final int SIGN_ERROR_CODE_REJECT = 2;
    public static final int SIGN_ERROR_CODE_SUCCESS = 0;
    public static final int SIGN_ERROR_CODE_UNKNOWN = 100;
    public static final int SIGN_ERROR_CODE_WALLET_INITIALIZED_ERROR = 1;
    private InnerSignDataResultBean signDataResultBean;
    private int signErrorCode;
    private String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InnerSignCheckResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<InnerSignCheckResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InnerSignCheckResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InnerSignCheckResponseBean(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : InnerSignDataResultBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InnerSignCheckResponseBean[] newArray(int i) {
            return new InnerSignCheckResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InnerSignCheckResponseBean copy$default(InnerSignCheckResponseBean innerSignCheckResponseBean, int i, String str, InnerSignDataResultBean innerSignDataResultBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = innerSignCheckResponseBean.signErrorCode;
        }
        if ((i2 & 2) != 0) {
            str = innerSignCheckResponseBean.walletId;
        }
        if ((i2 & 4) != 0) {
            innerSignDataResultBean = innerSignCheckResponseBean.signDataResultBean;
        }
        return innerSignCheckResponseBean.copy(i, str, innerSignDataResultBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.signErrorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InnerSignDataResultBean component3() {
        return this.signDataResultBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InnerSignCheckResponseBean copy(int i, @NotNull String str, InnerSignDataResultBean innerSignDataResultBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InnerSignCheckResponseBean(i, str, innerSignDataResultBean);
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
        if (!(obj instanceof InnerSignCheckResponseBean)) {
            return false;
        }
        InnerSignCheckResponseBean innerSignCheckResponseBean = (InnerSignCheckResponseBean) obj;
        return this.signErrorCode == innerSignCheckResponseBean.signErrorCode && Intrinsics.EZpvd((Object) this.walletId, (Object) innerSignCheckResponseBean.walletId) && Intrinsics.EZpvd(this.signDataResultBean, innerSignCheckResponseBean.signDataResultBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InnerSignDataResultBean getSignDataResultBean() {
        return this.signDataResultBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSignErrorCode() {
        return this.signErrorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.signErrorCode);
        int iHashCode2 = this.walletId.hashCode();
        InnerSignDataResultBean innerSignDataResultBean = this.signDataResultBean;
        return (((iHashCode * 31) + iHashCode2) * 31) + (innerSignDataResultBean == null ? 0 : innerSignDataResultBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignDataResultBean(InnerSignDataResultBean innerSignDataResultBean) {
        this.signDataResultBean = innerSignDataResultBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignErrorCode(int i) {
        this.signErrorCode = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InnerSignCheckResponseBean(signErrorCode=" + this.signErrorCode + ", walletId=" + this.walletId + ", signDataResultBean=" + this.signDataResultBean + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.signErrorCode);
        parcel.writeString(this.walletId);
        InnerSignDataResultBean innerSignDataResultBean = this.signDataResultBean;
        if (innerSignDataResultBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            innerSignDataResultBean.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ InnerSignCheckResponseBean(int i, int i2, String str, InnerSignDataResultBean innerSignDataResultBean, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, InnerSignCheckResponseBean$$serializer.INSTANCE.getDescriptor());
        }
        this.signErrorCode = i2;
        if ((i & 2) == 0) {
            this.walletId = "";
        } else {
            this.walletId = str;
        }
        if ((i & 4) == 0) {
            this.signDataResultBean = null;
        } else {
            this.signDataResultBean = innerSignDataResultBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InnerSignCheckResponseBean innerSignCheckResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, innerSignCheckResponseBean.signErrorCode);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) innerSignCheckResponseBean.walletId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, innerSignCheckResponseBean.walletId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && innerSignCheckResponseBean.signDataResultBean == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, InnerSignDataResultBean$$serializer.INSTANCE, innerSignCheckResponseBean.signDataResultBean);
    }

    public InnerSignCheckResponseBean(int i, @NotNull String str, InnerSignDataResultBean innerSignDataResultBean) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signErrorCode = i;
        this.walletId = str;
        this.signDataResultBean = innerSignDataResultBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.travel_rule.InnerSignDataResultBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.travel_rule.InnerSignDataResultBean) : (r3v0 com.okinc.ok_kyc_core.data.travel_rule.InnerSignDataResultBean))
 A[MD:(int, java.lang.String, com.okinc.ok_kyc_core.data.travel_rule.InnerSignDataResultBean):void (m)] (LINE:14) call: com.okinc.ok_kyc_core.data.travel_rule.InnerSignCheckResponseBean.<init>(int, java.lang.String, com.okinc.ok_kyc_core.data.travel_rule.InnerSignDataResultBean):void type: THIS */
    public /* synthetic */ InnerSignCheckResponseBean(int i, String str, InnerSignDataResultBean innerSignDataResultBean, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : innerSignDataResultBean);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.travel_rule.InnerSignCheckResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InnerSignCheckResponseBean> serializer() {
            return InnerSignCheckResponseBean$$serializer.INSTANCE;
        }
    }
}

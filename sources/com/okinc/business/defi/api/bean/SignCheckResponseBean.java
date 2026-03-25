package com.okinc.business.defi.api.bean;

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

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class SignCheckResponseBean implements Parcelable {
    public static final int SIGN_ERROR_CODE_BACKUP_ERROR = 7;
    public static final int SIGN_ERROR_CODE_HARDWARE_WALLET_CHAIN_UNSUPPORTED = 8;
    public static final int SIGN_ERROR_CODE_NOT_SUPPORT_CHAIN_FOR_SIGN = 4;
    public static final int SIGN_ERROR_CODE_NOT_SUPPORT_CHAIN_IN_COINS = 3;
    public static final int SIGN_ERROR_CODE_NO_BACKUP = 6;
    public static final int SIGN_ERROR_CODE_NO_MATCH_WALLET = 5;
    public static final int SIGN_ERROR_CODE_REJECT = 2;
    public static final int SIGN_ERROR_CODE_SUCCESS = 0;
    public static final int SIGN_ERROR_CODE_UNKNOWN = 100;
    public static final int SIGN_ERROR_CODE_WALLET_INITIALIZED_ERROR = 1;
    private SignDataResultBean signDataResultBean;
    private int signErrorCode;
    private String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignCheckResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<SignCheckResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignCheckResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignCheckResponseBean(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : SignDataResultBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignCheckResponseBean[] newArray(int i) {
            return new SignCheckResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignCheckResponseBean copy$default(SignCheckResponseBean signCheckResponseBean, int i, String str, SignDataResultBean signDataResultBean, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = signCheckResponseBean.signErrorCode;
        }
        if ((i2 & 2) != 0) {
            str = signCheckResponseBean.walletId;
        }
        if ((i2 & 4) != 0) {
            signDataResultBean = signCheckResponseBean.signDataResultBean;
        }
        return signCheckResponseBean.copy(i, str, signDataResultBean);
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
    public final SignDataResultBean component3() {
        return this.signDataResultBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignCheckResponseBean copy(int i, @NotNull String str, SignDataResultBean signDataResultBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SignCheckResponseBean(i, str, signDataResultBean);
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
        if (!(obj instanceof SignCheckResponseBean)) {
            return false;
        }
        SignCheckResponseBean signCheckResponseBean = (SignCheckResponseBean) obj;
        return this.signErrorCode == signCheckResponseBean.signErrorCode && Intrinsics.EZpvd((Object) this.walletId, (Object) signCheckResponseBean.walletId) && Intrinsics.EZpvd(this.signDataResultBean, signCheckResponseBean.signDataResultBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignDataResultBean getSignDataResultBean() {
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
        SignDataResultBean signDataResultBean = this.signDataResultBean;
        return (((iHashCode * 31) + iHashCode2) * 31) + (signDataResultBean == null ? 0 : signDataResultBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignDataResultBean(SignDataResultBean signDataResultBean) {
        this.signDataResultBean = signDataResultBean;
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
        return "SignCheckResponseBean(signErrorCode=" + this.signErrorCode + ", walletId=" + this.walletId + ", signDataResultBean=" + this.signDataResultBean + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.signErrorCode);
        parcel.writeString(this.walletId);
        SignDataResultBean signDataResultBean = this.signDataResultBean;
        if (signDataResultBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            signDataResultBean.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SignCheckResponseBean(int i, int i2, String str, SignDataResultBean signDataResultBean, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SignCheckResponseBean$$serializer.INSTANCE.getDescriptor());
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
            this.signDataResultBean = signDataResultBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(SignCheckResponseBean signCheckResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, signCheckResponseBean.signErrorCode);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) signCheckResponseBean.walletId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, signCheckResponseBean.walletId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && signCheckResponseBean.signDataResultBean == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, SignDataResultBean$$serializer.INSTANCE, signCheckResponseBean.signDataResultBean);
    }

    public SignCheckResponseBean(int i, @NotNull String str, SignDataResultBean signDataResultBean) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signErrorCode = i;
        this.walletId = str;
        this.signDataResultBean = signDataResultBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.SignDataResultBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.SignDataResultBean) : (r3v0 com.okinc.business.defi.api.bean.SignDataResultBean))
 A[MD:(int, java.lang.String, com.okinc.business.defi.api.bean.SignDataResultBean):void (m)] (LINE:343) call: com.okinc.business.defi.api.bean.SignCheckResponseBean.<init>(int, java.lang.String, com.okinc.business.defi.api.bean.SignDataResultBean):void type: THIS */
    public /* synthetic */ SignCheckResponseBean(int i, String str, SignDataResultBean signDataResultBean, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : signDataResultBean);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.SignCheckResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SignCheckResponseBean> serializer() {
            return SignCheckResponseBean$$serializer.INSTANCE;
        }
    }
}

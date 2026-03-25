package com.okinc.business.defi.jsbridge;

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

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class JsBridgeWalletBean implements Parcelable {
    public static final int $stable = 0;
    private final String walletId;
    private final int walletType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<JsBridgeWalletBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<JsBridgeWalletBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsBridgeWalletBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new JsBridgeWalletBean(parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsBridgeWalletBean[] newArray(int i) {
            return new JsBridgeWalletBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsBridgeWalletBean() {
        this((String) null, 0, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ JsBridgeWalletBean copy$default(JsBridgeWalletBean jsBridgeWalletBean, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = jsBridgeWalletBean.walletId;
        }
        if ((i2 & 2) != 0) {
            i = jsBridgeWalletBean.walletType;
        }
        return jsBridgeWalletBean.copy(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsBridgeWalletBean copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new JsBridgeWalletBean(str, i);
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
        if (!(obj instanceof JsBridgeWalletBean)) {
            return false;
        }
        JsBridgeWalletBean jsBridgeWalletBean = (JsBridgeWalletBean) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) jsBridgeWalletBean.walletId) && this.walletType == jsBridgeWalletBean.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWalletType() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.walletId.hashCode() * 31) + Integer.hashCode(this.walletType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JsBridgeWalletBean(walletId=" + this.walletId + ", walletType=" + this.walletType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.walletId);
        parcel.writeInt(this.walletType);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.jsbridge.JsBridgeWalletBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JsBridgeWalletBean> serializer() {
            return JsBridgeWalletBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ JsBridgeWalletBean(int i, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.walletId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.walletType = -1;
        } else {
            this.walletType = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(JsBridgeWalletBean jsBridgeWalletBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) jsBridgeWalletBean.walletId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, jsBridgeWalletBean.walletId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && jsBridgeWalletBean.walletType == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 1, jsBridgeWalletBean.walletType);
    }

    public JsBridgeWalletBean(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
        this.walletType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r2v0 int))
 A[MD:(java.lang.String, int):void (m)] (LINE:45) call: com.okinc.business.defi.jsbridge.JsBridgeWalletBean.<init>(java.lang.String, int):void type: THIS */
    public /* synthetic */ JsBridgeWalletBean(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i);
    }
}

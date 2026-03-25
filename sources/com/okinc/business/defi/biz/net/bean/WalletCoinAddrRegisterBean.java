package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletCoinAddrRegisterBean implements Parcelable {
    public static final int $stable = 0;
    private final String accountId;
    private final Long coinId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<WalletCoinAddrRegisterBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletCoinAddrRegisterBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletCoinAddrRegisterBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletCoinAddrRegisterBean(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletCoinAddrRegisterBean[] newArray(int i) {
            return new WalletCoinAddrRegisterBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletCoinAddrRegisterBean() {
        this((String) null, (Long) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletCoinAddrRegisterBean copy$default(WalletCoinAddrRegisterBean walletCoinAddrRegisterBean, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletCoinAddrRegisterBean.accountId;
        }
        if ((i & 2) != 0) {
            l = walletCoinAddrRegisterBean.coinId;
        }
        return walletCoinAddrRegisterBean.copy(str, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletCoinAddrRegisterBean copy(@NotNull String str, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WalletCoinAddrRegisterBean(str, l);
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
        if (!(obj instanceof WalletCoinAddrRegisterBean)) {
            return false;
        }
        WalletCoinAddrRegisterBean walletCoinAddrRegisterBean = (WalletCoinAddrRegisterBean) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) walletCoinAddrRegisterBean.accountId) && Intrinsics.EZpvd(this.coinId, walletCoinAddrRegisterBean.coinId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        Long l = this.coinId;
        return (iHashCode * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletCoinAddrRegisterBean(accountId=" + this.accountId + ", coinId=" + this.coinId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletCoinAddrRegisterBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletCoinAddrRegisterBean> serializer() {
            return WalletCoinAddrRegisterBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletCoinAddrRegisterBean(int i, String str, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        this.accountId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.coinId = null;
        } else {
            this.coinId = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletCoinAddrRegisterBean walletCoinAddrRegisterBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) walletCoinAddrRegisterBean.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, walletCoinAddrRegisterBean.accountId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && walletCoinAddrRegisterBean.coinId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, walletCoinAddrRegisterBean.coinId);
    }

    public WalletCoinAddrRegisterBean(@NotNull String str, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
        this.coinId = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.Long):void (m)] (LINE:113) call: com.okinc.business.defi.biz.net.bean.WalletCoinAddrRegisterBean.<init>(java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ WalletCoinAddrRegisterBean(String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : l);
    }
}

package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class WithdrawFromExchangeBean implements Parcelable {
    public static final int $stable = 0;
    private final String address;
    private final Long coinId;
    private final Integer currencyId;
    private final Integer subCurrencyId;
    private final String walletDisplayName;
    private final String walletIcon;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<WithdrawFromExchangeBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<WithdrawFromExchangeBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawFromExchangeBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WithdrawFromExchangeBean(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawFromExchangeBean[] newArray(int i) {
            return new WithdrawFromExchangeBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WithdrawFromExchangeBean copy$default(WithdrawFromExchangeBean withdrawFromExchangeBean, Integer num, Integer num2, String str, String str2, String str3, Long l, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = withdrawFromExchangeBean.currencyId;
        }
        if ((i & 2) != 0) {
            num2 = withdrawFromExchangeBean.subCurrencyId;
        }
        Integer num3 = num2;
        if ((i & 4) != 0) {
            str = withdrawFromExchangeBean.address;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = withdrawFromExchangeBean.walletDisplayName;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = withdrawFromExchangeBean.walletId;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            l = withdrawFromExchangeBean.coinId;
        }
        Long l2 = l;
        if ((i & 64) != 0) {
            str4 = withdrawFromExchangeBean.walletIcon;
        }
        return withdrawFromExchangeBean.copy(num, num3, str5, str6, str7, l2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.walletDisplayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.walletIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawFromExchangeBean copy(Integer num, Integer num2, String str, String str2, String str3, Long l, String str4) {
        return new WithdrawFromExchangeBean(num, num2, str, str2, str3, l, str4);
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
        if (!(obj instanceof WithdrawFromExchangeBean)) {
            return false;
        }
        WithdrawFromExchangeBean withdrawFromExchangeBean = (WithdrawFromExchangeBean) obj;
        return Intrinsics.EZpvd(this.currencyId, withdrawFromExchangeBean.currencyId) && Intrinsics.EZpvd(this.subCurrencyId, withdrawFromExchangeBean.subCurrencyId) && Intrinsics.EZpvd((Object) this.address, (Object) withdrawFromExchangeBean.address) && Intrinsics.EZpvd((Object) this.walletDisplayName, (Object) withdrawFromExchangeBean.walletDisplayName) && Intrinsics.EZpvd((Object) this.walletId, (Object) withdrawFromExchangeBean.walletId) && Intrinsics.EZpvd(this.coinId, withdrawFromExchangeBean.coinId) && Intrinsics.EZpvd((Object) this.walletIcon, (Object) withdrawFromExchangeBean.walletIcon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletDisplayName() {
        return this.walletDisplayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletIcon() {
        return this.walletIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.currencyId;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.subCurrencyId;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        String str = this.address;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.walletDisplayName;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.walletId;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        Long l = this.coinId;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        String str4 = this.walletIcon;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawFromExchangeBean(currencyId=" + this.currencyId + ", subCurrencyId=" + this.subCurrencyId + ", address=" + this.address + ", walletDisplayName=" + this.walletDisplayName + ", walletId=" + this.walletId + ", coinId=" + this.coinId + ", walletIcon=" + this.walletIcon + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.currencyId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.subCurrencyId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.address);
        parcel.writeString(this.walletDisplayName);
        parcel.writeString(this.walletId);
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.walletIcon);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.bean.WithdrawFromExchangeBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WithdrawFromExchangeBean> serializer() {
            return WithdrawFromExchangeBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WithdrawFromExchangeBean(int i, Integer num, Integer num2, String str, String str2, String str3, Long l, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, WithdrawFromExchangeBean$$serializer.INSTANCE.getDescriptor());
        }
        this.currencyId = num;
        this.subCurrencyId = num2;
        this.address = str;
        this.walletDisplayName = str2;
        this.walletId = str3;
        this.coinId = l;
        this.walletIcon = str4;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(WithdrawFromExchangeBean withdrawFromExchangeBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, intSerializer, withdrawFromExchangeBean.currencyId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, intSerializer, withdrawFromExchangeBean.subCurrencyId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, withdrawFromExchangeBean.address);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, withdrawFromExchangeBean.walletDisplayName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, withdrawFromExchangeBean.walletId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, withdrawFromExchangeBean.coinId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, withdrawFromExchangeBean.walletIcon);
    }

    public WithdrawFromExchangeBean(Integer num, Integer num2, String str, String str2, String str3, Long l, String str4) {
        this.currencyId = num;
        this.subCurrencyId = num2;
        this.address = str;
        this.walletDisplayName = str2;
        this.walletId = str3;
        this.coinId = l;
        this.walletIcon = str4;
    }
}

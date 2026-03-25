package com.okinc.okx.paymentapi.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class AddCardParameter implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddCardParameter> CREATOR = new Creator();
    private final ChannelCategoryCode categoryCode;
    private final Channel channel;
    private final String currency;
    private final String paymentMethodType;
    private final String platformCode;

    public static final class Creator implements Parcelable.Creator<AddCardParameter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddCardParameter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddCardParameter(ChannelCategoryCode.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Channel.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddCardParameter[] newArray(int i) {
            return new AddCardParameter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddCardParameter copy$default(AddCardParameter addCardParameter, ChannelCategoryCode channelCategoryCode, String str, String str2, String str3, Channel channel, int i, Object obj) {
        if ((i & 1) != 0) {
            channelCategoryCode = addCardParameter.categoryCode;
        }
        if ((i & 2) != 0) {
            str = addCardParameter.platformCode;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = addCardParameter.currency;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = addCardParameter.paymentMethodType;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            channel = addCardParameter.channel;
        }
        return addCardParameter.copy(channelCategoryCode, str4, str5, str6, channel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelCategoryCode component1() {
        return this.categoryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.platformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.paymentMethodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Channel component5() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddCardParameter copy(@NotNull ChannelCategoryCode channelCategoryCode, @NotNull String str, @NotNull String str2, @NotNull String str3, Channel channel) {
        Intrinsics.checkNotNullParameter(channelCategoryCode, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AddCardParameter(channelCategoryCode, str, str2, str3, channel);
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
        if (!(obj instanceof AddCardParameter)) {
            return false;
        }
        AddCardParameter addCardParameter = (AddCardParameter) obj;
        return this.categoryCode == addCardParameter.categoryCode && Intrinsics.EZpvd((Object) this.platformCode, (Object) addCardParameter.platformCode) && Intrinsics.EZpvd((Object) this.currency, (Object) addCardParameter.currency) && Intrinsics.EZpvd((Object) this.paymentMethodType, (Object) addCardParameter.paymentMethodType) && Intrinsics.EZpvd(this.channel, addCardParameter.channel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelCategoryCode getCategoryCode() {
        return this.categoryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Channel getChannel() {
        return this.channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformCode() {
        return this.platformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.categoryCode.hashCode();
        int iHashCode2 = this.platformCode.hashCode();
        int iHashCode3 = this.currency.hashCode();
        int iHashCode4 = this.paymentMethodType.hashCode();
        Channel channel = this.channel;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (channel == null ? 0 : channel.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddCardParameter(categoryCode=" + this.categoryCode + ", platformCode=" + this.platformCode + ", currency=" + this.currency + ", paymentMethodType=" + this.paymentMethodType + ", channel=" + this.channel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.categoryCode.writeToParcel(parcel, i);
        parcel.writeString(this.platformCode);
        parcel.writeString(this.currency);
        parcel.writeString(this.paymentMethodType);
        Channel channel = this.channel;
        if (channel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channel.writeToParcel(parcel, i);
        }
    }

    public AddCardParameter(@NotNull ChannelCategoryCode channelCategoryCode, @NotNull String str, @NotNull String str2, @NotNull String str3, Channel channel) {
        Intrinsics.checkNotNullParameter(channelCategoryCode, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.categoryCode = channelCategoryCode;
        this.platformCode = str;
        this.currency = str2;
        this.paymentMethodType = str3;
        this.channel = channel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode:0x0004: SGET  A[WRAPPED] (LINE:14) com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode.NATIVE com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode) : (r7v0 com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode))
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.Channel:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.Channel) : (r11v0 com.okinc.okpaymentapi.data.remote.model.management.Channel))
 A[MD:(com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.Channel):void (m)] (LINE:13) call: com.okinc.okx.paymentapi.presentation.AddCardParameter.<init>(com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.Channel):void type: THIS */
    public /* synthetic */ AddCardParameter(ChannelCategoryCode channelCategoryCode, String str, String str2, String str3, Channel channel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ChannelCategoryCode.NATIVE : channelCategoryCode, str, str2, str3, (i & 16) != 0 ? null : channel);
    }
}

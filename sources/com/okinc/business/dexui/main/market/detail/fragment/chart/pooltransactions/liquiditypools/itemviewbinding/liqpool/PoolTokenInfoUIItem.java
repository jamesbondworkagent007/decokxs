package com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class PoolTokenInfoUIItem implements Parcelable {
    public static final int $stable = 0;
    private final String amount;
    private final String tokenAmountUsd;
    private final String tokenContractAddress;
    private final String tokenLogoUrl;
    private final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PoolTokenInfoUIItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PoolTokenInfoUIItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PoolTokenInfoUIItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PoolTokenInfoUIItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PoolTokenInfoUIItem[] newArray(int i) {
            return new PoolTokenInfoUIItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PoolTokenInfoUIItem copy$default(PoolTokenInfoUIItem poolTokenInfoUIItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poolTokenInfoUIItem.amount;
        }
        if ((i & 2) != 0) {
            str2 = poolTokenInfoUIItem.tokenAmountUsd;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = poolTokenInfoUIItem.tokenContractAddress;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = poolTokenInfoUIItem.tokenLogoUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = poolTokenInfoUIItem.tokenSymbol;
        }
        return poolTokenInfoUIItem.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PoolTokenInfoUIItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new PoolTokenInfoUIItem(str, str2, str3, str4, str5);
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
        if (!(obj instanceof PoolTokenInfoUIItem)) {
            return false;
        }
        PoolTokenInfoUIItem poolTokenInfoUIItem = (PoolTokenInfoUIItem) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) poolTokenInfoUIItem.amount) && Intrinsics.EZpvd((Object) this.tokenAmountUsd, (Object) poolTokenInfoUIItem.tokenAmountUsd) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) poolTokenInfoUIItem.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) poolTokenInfoUIItem.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) poolTokenInfoUIItem.tokenSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmountUsd() {
        return this.tokenAmountUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.amount.hashCode() * 31) + this.tokenAmountUsd.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.tokenSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PoolTokenInfoUIItem(amount=" + this.amount + ", tokenAmountUsd=" + this.tokenAmountUsd + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenSymbol=" + this.tokenSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.amount);
        parcel.writeString(this.tokenAmountUsd);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.tokenLogoUrl);
        parcel.writeString(this.tokenSymbol);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.PoolTokenInfoUIItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PoolTokenInfoUIItem> serializer() {
            return PoolTokenInfoUIItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PoolTokenInfoUIItem(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, PoolTokenInfoUIItem$$serializer.INSTANCE.getDescriptor());
        }
        this.amount = str;
        this.tokenAmountUsd = str2;
        this.tokenContractAddress = str3;
        this.tokenLogoUrl = str4;
        this.tokenSymbol = str5;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PoolTokenInfoUIItem poolTokenInfoUIItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, poolTokenInfoUIItem.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, poolTokenInfoUIItem.tokenAmountUsd);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, poolTokenInfoUIItem.tokenContractAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, poolTokenInfoUIItem.tokenLogoUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, poolTokenInfoUIItem.tokenSymbol);
    }

    public PoolTokenInfoUIItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.amount = str;
        this.tokenAmountUsd = str2;
        this.tokenContractAddress = str3;
        this.tokenLogoUrl = str4;
        this.tokenSymbol = str5;
    }
}

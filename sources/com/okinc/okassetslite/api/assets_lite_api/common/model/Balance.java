package com.okinc.okassetslite.api.assets_lite_api.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class Balance implements Parcelable {
    public static final Parcelable.Creator<Balance> CREATOR = new Creator();

    @SerializedName("associatedFiat")
    private final String associatedFiat;

    @SerializedName("balance")
    private final String balance;

    @SerializedName("currency")
    private final String currency;

    @SerializedName("currencyId")
    private final int currencyId;

    @SerializedName("fiatCategory")
    private final Boolean fiatCategory;

    @SerializedName("fullName")
    private final String fullName;

    @SerializedName(RemoteMessageConst.Notification.ICON)
    private final String icon;

    @SerializedName("isEntitySupported")
    private final boolean isEntitySupported;

    @SerializedName("pnlPercentage")
    private final String pnlPercentage;

    @SerializedName("pnlValue")
    private final String pnlValue;

    @SerializedName("sign")
    private final String sign;

    @SerializedName("tradable")
    private final boolean tradable;

    @SerializedName("unitCost")
    private final String unitCost;

    @SerializedName("unitPrice")
    private final String unitPrice;

    @SerializedName("usdValuation")
    private final String usdValuation;

    @SerializedName("valuation")
    private final String valuation;

    public static final class Creator implements Parcelable.Creator<Balance> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Balance createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Balance(string, string2, i, string3, string4, string5, string6, string7, z, string8, string9, string10, string11, z2, boolValueOf, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Balance[] newArray(int i) {
            return new Balance[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Balance KWHzl(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z2, Boolean bool, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new Balance(str, str2, i, str3, str4, str5, str6, str7, z, str8, str9, str10, str11, z2, bool, str12);
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
        if (!(obj instanceof Balance)) {
            return false;
        }
        Balance balance = (Balance) obj;
        return Intrinsics.EZpvd((Object) this.balance, (Object) balance.balance) && Intrinsics.EZpvd((Object) this.currency, (Object) balance.currency) && this.currencyId == balance.currencyId && Intrinsics.EZpvd((Object) this.fullName, (Object) balance.fullName) && Intrinsics.EZpvd((Object) this.icon, (Object) balance.icon) && Intrinsics.EZpvd((Object) this.pnlPercentage, (Object) balance.pnlPercentage) && Intrinsics.EZpvd((Object) this.pnlValue, (Object) balance.pnlValue) && Intrinsics.EZpvd((Object) this.sign, (Object) balance.sign) && this.tradable == balance.tradable && Intrinsics.EZpvd((Object) this.unitCost, (Object) balance.unitCost) && Intrinsics.EZpvd((Object) this.unitPrice, (Object) balance.unitPrice) && Intrinsics.EZpvd((Object) this.valuation, (Object) balance.valuation) && Intrinsics.EZpvd((Object) this.usdValuation, (Object) balance.usdValuation) && this.isEntitySupported == balance.isEntitySupported && Intrinsics.EZpvd(this.fiatCategory, balance.fiatCategory) && Intrinsics.EZpvd((Object) this.associatedFiat, (Object) balance.associatedFiat);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.balance.hashCode();
        int iHashCode2 = this.currency.hashCode();
        int iHashCode3 = Integer.hashCode(this.currencyId);
        int iHashCode4 = this.fullName.hashCode();
        int iHashCode5 = this.icon.hashCode();
        int iHashCode6 = this.pnlPercentage.hashCode();
        int iHashCode7 = this.pnlValue.hashCode();
        int iHashCode8 = this.sign.hashCode();
        int iHashCode9 = Boolean.hashCode(this.tradable);
        int iHashCode10 = this.unitCost.hashCode();
        int iHashCode11 = this.unitPrice.hashCode();
        int iHashCode12 = this.valuation.hashCode();
        int iHashCode13 = this.usdValuation.hashCode();
        int iHashCode14 = Boolean.hashCode(this.isEntitySupported);
        Boolean bool = this.fiatCategory;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + this.associatedFiat.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Balance(balance=" + this.balance + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ", fullName=" + this.fullName + ", icon=" + this.icon + ", pnlPercentage=" + this.pnlPercentage + ", pnlValue=" + this.pnlValue + ", sign=" + this.sign + ", tradable=" + this.tradable + ", unitCost=" + this.unitCost + ", unitPrice=" + this.unitPrice + ", valuation=" + this.valuation + ", usdValuation=" + this.usdValuation + ", isEntitySupported=" + this.isEntitySupported + ", fiatCategory=" + this.fiatCategory + ", associatedFiat=" + this.associatedFiat + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.balance);
        parcel.writeString(this.currency);
        parcel.writeInt(this.currencyId);
        parcel.writeString(this.fullName);
        parcel.writeString(this.icon);
        parcel.writeString(this.pnlPercentage);
        parcel.writeString(this.pnlValue);
        parcel.writeString(this.sign);
        parcel.writeInt(this.tradable ? 1 : 0);
        parcel.writeString(this.unitCost);
        parcel.writeString(this.unitPrice);
        parcel.writeString(this.valuation);
        parcel.writeString(this.usdValuation);
        parcel.writeInt(this.isEntitySupported ? 1 : 0);
        Boolean bool = this.fiatCategory;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.associatedFiat);
    }

    public Balance(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z2, Boolean bool, @NotNull String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.balance = str;
        this.currency = str2;
        this.currencyId = i;
        this.fullName = str3;
        this.icon = str4;
        this.pnlPercentage = str5;
        this.pnlValue = str6;
        this.sign = str7;
        this.tradable = z;
        this.unitCost = str8;
        this.unitPrice = str9;
        this.valuation = str10;
        this.usdValuation = str11;
        this.isEntitySupported = z2;
        this.fiatCategory = bool;
        this.associatedFiat = str12;
    }
}

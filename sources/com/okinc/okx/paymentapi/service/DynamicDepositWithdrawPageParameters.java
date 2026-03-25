package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class DynamicDepositWithdrawPageParameters implements Parcelable {
    public static final Parcelable.Creator<DynamicDepositWithdrawPageParameters> CREATOR = new Creator();
    public final String AEQbTJ;
    public final TradeType AhwBna;
    public final boolean EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final Map<String, String> copydefault;
    public final boolean djBIcL;
    public final String gEmmrt;
    public final String valueOf;

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<DynamicDepositWithdrawPageParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DynamicDepositWithdrawPageParameters createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            TradeType tradeTypeCreateFromParcel = TradeType.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new DynamicDepositWithdrawPageParameters(z, string, string2, string3, tradeTypeCreateFromParcel, string4, string5, linkedHashMap, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DynamicDepositWithdrawPageParameters[] newArray(int i) {
            return new DynamicDepositWithdrawPageParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DynamicDepositWithdrawPageParameters copydefault(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TradeType tradeType, @NotNull String str4, String str5, Map<String, String> map, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DynamicDepositWithdrawPageParameters(z, str, str2, str3, tradeType, str4, str5, map, z2);
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
        if (!(obj instanceof DynamicDepositWithdrawPageParameters)) {
            return false;
        }
        DynamicDepositWithdrawPageParameters dynamicDepositWithdrawPageParameters = (DynamicDepositWithdrawPageParameters) obj;
        return this.djBIcL == dynamicDepositWithdrawPageParameters.djBIcL && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) dynamicDepositWithdrawPageParameters.AEQbTJ) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) dynamicDepositWithdrawPageParameters.gEmmrt) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) dynamicDepositWithdrawPageParameters.OLrzqt) && this.AhwBna == dynamicDepositWithdrawPageParameters.AhwBna && Intrinsics.EZpvd((Object) this.KWHzl, (Object) dynamicDepositWithdrawPageParameters.KWHzl) && Intrinsics.EZpvd((Object) this.valueOf, (Object) dynamicDepositWithdrawPageParameters.valueOf) && Intrinsics.EZpvd(this.copydefault, dynamicDepositWithdrawPageParameters.copydefault) && this.EZpvd == dynamicDepositWithdrawPageParameters.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.djBIcL);
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.gEmmrt.hashCode();
        int iHashCode4 = this.OLrzqt.hashCode();
        int iHashCode5 = this.AhwBna.hashCode();
        int iHashCode6 = this.KWHzl.hashCode();
        String str = this.valueOf;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        Map<String, String> map = this.copydefault;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (map != null ? map.hashCode() : 0)) * 31) + Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DynamicDepositWithdrawPageParameters(shouldCreateVA=" + this.djBIcL + ", paymentMethodString=" + this.AEQbTJ + ", target=" + this.gEmmrt + ", depositCode=" + this.OLrzqt + ", tradeType=" + this.AhwBna + ", currency=" + this.KWHzl + ", sourcePage=" + this.valueOf + ", carryOver=" + this.copydefault + ", allowDirectInputPage=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.djBIcL ? 1 : 0);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.OLrzqt);
        this.AhwBna.writeToParcel(parcel, i);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.valueOf);
        Map<String, String> map = this.copydefault;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeInt(this.EZpvd ? 1 : 0);
    }

    public DynamicDepositWithdrawPageParameters(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull TradeType tradeType, @NotNull String str4, String str5, Map<String, String> map, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.djBIcL = z;
        this.AEQbTJ = str;
        this.gEmmrt = str2;
        this.OLrzqt = str3;
        this.AhwBna = tradeType;
        this.KWHzl = str4;
        this.valueOf = str5;
        this.copydefault = map;
        this.EZpvd = z2;
    }
}

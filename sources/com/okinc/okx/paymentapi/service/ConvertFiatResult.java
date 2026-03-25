package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ConvertFiatResult implements Parcelable {
    public final OKPaymentConvertResultState AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final Parcelable.Creator<ConvertFiatResult> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ConvertFiatResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertFiatResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ConvertFiatResult(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), OKPaymentConvertResultState.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConvertFiatResult[] newArray(int i) {
            return new ConvertFiatResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConvertFiatResult copy$default(ConvertFiatResult convertFiatResult, String str, String str2, String str3, String str4, OKPaymentConvertResultState oKPaymentConvertResultState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = convertFiatResult.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = convertFiatResult.copydefault;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = convertFiatResult.KWHzl;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = convertFiatResult.OLrzqt;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            oKPaymentConvertResultState = convertFiatResult.AEQbTJ;
        }
        return convertFiatResult.KWHzl(str, str5, str6, str7, oKPaymentConvertResultState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertFiatResult KWHzl(String str, @NotNull String str2, String str3, String str4, @NotNull OKPaymentConvertResultState oKPaymentConvertResultState) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(oKPaymentConvertResultState, "");
        return new ConvertFiatResult(str, str2, str3, str4, oKPaymentConvertResultState);
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
        if (!(obj instanceof ConvertFiatResult)) {
            return false;
        }
        ConvertFiatResult convertFiatResult = (ConvertFiatResult) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) convertFiatResult.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) convertFiatResult.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) convertFiatResult.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) convertFiatResult.OLrzqt) && this.AEQbTJ == convertFiatResult.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        String str2 = this.KWHzl;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConvertFiatResult(fiatAmount=" + this.EZpvd + ", fiatCurrency=" + this.copydefault + ", cryptoAmount=" + this.KWHzl + ", price=" + this.OLrzqt + ", resultState=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ.name());
    }

    public ConvertFiatResult(String str, @NotNull String str2, String str3, String str4, @NotNull OKPaymentConvertResultState oKPaymentConvertResultState) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(oKPaymentConvertResultState, "");
        this.EZpvd = str;
        this.copydefault = str2;
        this.KWHzl = str3;
        this.OLrzqt = str4;
        this.AEQbTJ = oKPaymentConvertResultState;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.service.ConvertFiatResult.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}

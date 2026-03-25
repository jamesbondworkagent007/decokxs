package com.okinc.buysell.ui.paymentmethod.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethodCategory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class SelectionRow implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.paymentmethod.data.SelectionRow.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SelectionRow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SelectionRow() {
    }

    public static final class PaymentMethodItem extends SelectionRow implements Parcelable {
        public static final Parcelable.Creator<PaymentMethodItem> CREATOR = new Creator();
        public final boolean AEQbTJ;
        public final boolean AYXKKw;
        public final String AhwBna;
        public final String AkhnZx;
        public final String EZpvd;
        public final int KWHzl;
        public final String OLrzqt;
        public final String copydefault;
        public boolean djBIcL;
        public final String fetchVPNInfo;
        public final boolean gEmmrt;
        public final String isConnected;
        public final String valueOf;
        public final String values;

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<PaymentMethodItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PaymentMethodItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodItem[] newArray(int i) {
                return new PaymentMethodItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String DbNXlk() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PaymentMethodItem copydefault(String str, String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, int i, boolean z2, String str8, @NotNull String str9, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str9, "");
            return new PaymentMethodItem(str, str2, str3, str4, str5, str6, z, str7, i, z2, str8, str9, z3, z4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.djBIcL = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethodItem)) {
                return false;
            }
            PaymentMethodItem paymentMethodItem = (PaymentMethodItem) obj;
            return Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) paymentMethodItem.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.values, (Object) paymentMethodItem.values) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) paymentMethodItem.AkhnZx) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) paymentMethodItem.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) paymentMethodItem.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) paymentMethodItem.EZpvd) && this.djBIcL == paymentMethodItem.djBIcL && Intrinsics.EZpvd((Object) this.AhwBna, (Object) paymentMethodItem.AhwBna) && this.KWHzl == paymentMethodItem.KWHzl && this.AYXKKw == paymentMethodItem.AYXKKw && Intrinsics.EZpvd((Object) this.valueOf, (Object) paymentMethodItem.valueOf) && Intrinsics.EZpvd((Object) this.isConnected, (Object) paymentMethodItem.isConnected) && this.AEQbTJ == paymentMethodItem.AEQbTJ && this.gEmmrt == paymentMethodItem.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean fetchVPNInfo() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.fetchVPNInfo;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.values;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.AkhnZx;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            int iHashCode4 = this.OLrzqt.hashCode();
            int iHashCode5 = this.copydefault.hashCode();
            int iHashCode6 = this.EZpvd.hashCode();
            int iHashCode7 = Boolean.hashCode(this.djBIcL);
            int iHashCode8 = this.AhwBna.hashCode();
            int iHashCode9 = Integer.hashCode(this.KWHzl);
            int iHashCode10 = Boolean.hashCode(this.AYXKKw);
            String str4 = this.valueOf;
            return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.isConnected.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isConnected() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PaymentMethodItem(startTitle1=" + this.fetchVPNInfo + ", startTitle2=" + this.values + ", startSubtitle=" + this.AkhnZx + ", iconUrl=" + this.OLrzqt + ", endTitle=" + this.copydefault + ", endSubtitle=" + this.EZpvd + ", isSelected=" + this.djBIcL + ", platformCode=" + this.AhwBna + ", categoryCode=" + this.KWHzl + ", showLimitIcon=" + this.AYXKKw + ", paymentAccountId=" + this.valueOf + ", supportCurrency=" + this.isConnected + ", googlePaySupportedButNotSetup=" + this.AEQbTJ + ", isRestrictedForRecurringEdit=" + this.gEmmrt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.fetchVPNInfo);
            parcel.writeString(this.values);
            parcel.writeString(this.AkhnZx);
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.copydefault);
            parcel.writeString(this.EZpvd);
            parcel.writeInt(this.djBIcL ? 1 : 0);
            parcel.writeString(this.AhwBna);
            parcel.writeInt(this.KWHzl);
            parcel.writeInt(this.AYXKKw ? 1 : 0);
            parcel.writeString(this.valueOf);
            parcel.writeString(this.isConnected);
            parcel.writeInt(this.AEQbTJ ? 1 : 0);
            parcel.writeInt(this.gEmmrt ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentMethodItem(String str, String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, int i, boolean z2, String str8, @NotNull String str9, boolean z3, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str9, "");
            this.fetchVPNInfo = str;
            this.values = str2;
            this.AkhnZx = str3;
            this.OLrzqt = str4;
            this.copydefault = str5;
            this.EZpvd = str6;
            this.djBIcL = z;
            this.AhwBna = str7;
            this.KWHzl = i;
            this.AYXKKw = z2;
            this.valueOf = str8;
            this.isConnected = str9;
            this.AEQbTJ = z3;
            this.gEmmrt = z4;
        }
    }

    public static final class CardVerificationItem extends SelectionRow implements Parcelable {
        public final String AEQbTJ;
        public final String AYXKKw;
        public final String AhwBna;
        public final String KWHzl;
        public final Channel OLrzqt;
        public final String copydefault;
        public final boolean djBIcL;
        public final String gEmmrt;
        public final String valueOf;
        public static final int EZpvd = Channel.$stable;
        public static final Parcelable.Creator<CardVerificationItem> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<CardVerificationItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardVerificationItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new CardVerificationItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (Channel) parcel.readParcelable(CardVerificationItem.class.getClassLoader()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardVerificationItem[] newArray(int i) {
                return new CardVerificationItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Channel EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CardVerificationItem copydefault(String str, String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, String str7, Channel channel) {
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new CardVerificationItem(str, str2, str3, str4, str5, str6, z, str7, channel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.gEmmrt;
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
            if (!(obj instanceof CardVerificationItem)) {
                return false;
            }
            CardVerificationItem cardVerificationItem = (CardVerificationItem) obj;
            return Intrinsics.EZpvd((Object) this.AhwBna, (Object) cardVerificationItem.AhwBna) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) cardVerificationItem.gEmmrt) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) cardVerificationItem.AYXKKw) && Intrinsics.EZpvd((Object) this.copydefault, (Object) cardVerificationItem.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) cardVerificationItem.KWHzl) && Intrinsics.EZpvd((Object) this.valueOf, (Object) cardVerificationItem.valueOf) && this.djBIcL == cardVerificationItem.djBIcL && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) cardVerificationItem.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, cardVerificationItem.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.AhwBna;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.gEmmrt;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.AYXKKw;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            int iHashCode4 = this.copydefault.hashCode();
            int iHashCode5 = this.KWHzl.hashCode();
            int iHashCode6 = this.valueOf.hashCode();
            int iHashCode7 = Boolean.hashCode(this.djBIcL);
            String str4 = this.AEQbTJ;
            int iHashCode8 = str4 == null ? 0 : str4.hashCode();
            Channel channel = this.OLrzqt;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (channel != null ? channel.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CardVerificationItem(startTitle1=" + this.AhwBna + ", startTitle2=" + this.gEmmrt + ", startSubtitle=" + this.AYXKKw + ", iconUrl=" + this.copydefault + ", endTitle=" + this.KWHzl + ", platformCode=" + this.valueOf + ", showLimitIcon=" + this.djBIcL + ", paymentAccountId=" + this.AEQbTJ + ", channel=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AhwBna);
            parcel.writeString(this.gEmmrt);
            parcel.writeString(this.AYXKKw);
            parcel.writeString(this.copydefault);
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.valueOf);
            parcel.writeInt(this.djBIcL ? 1 : 0);
            parcel.writeString(this.AEQbTJ);
            parcel.writeParcelable(this.OLrzqt, i);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.Channel:?: TERNARY null = ((wrap:int:0x0023: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.Channel) : (r22v0 com.okinc.okpaymentapi.data.remote.model.management.Channel))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.Channel):void (m)] (LINE:29) call: com.okinc.buysell.ui.paymentmethod.data.SelectionRow.CardVerificationItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.Channel):void type: THIS */
        public /* synthetic */ CardVerificationItem(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, Channel channel, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, str5, str6, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : channel);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardVerificationItem(String str, String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, String str7, Channel channel) {
            super(null);
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.AhwBna = str;
            this.gEmmrt = str2;
            this.AYXKKw = str3;
            this.copydefault = str4;
            this.KWHzl = str5;
            this.valueOf = str6;
            this.djBIcL = z;
            this.AEQbTJ = str7;
            this.OLrzqt = channel;
        }
    }

    public static final class AchRelinkItem extends SelectionRow implements Parcelable {
        public final String AEQbTJ;
        public final boolean AYXKKw;
        public final String AhwBna;
        public final String EZpvd;
        public final Channel KWHzl;
        public final String OLrzqt;
        public final String djBIcL;
        public final String gEmmrt;
        public final String valueOf;
        public static final int copydefault = Channel.$stable;
        public static final Parcelable.Creator<AchRelinkItem> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<AchRelinkItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AchRelinkItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new AchRelinkItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (Channel) parcel.readParcelable(AchRelinkItem.class.getClassLoader()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AchRelinkItem[] newArray(int i) {
                return new AchRelinkItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AchRelinkItem OLrzqt(String str, String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, String str7, Channel channel) {
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new AchRelinkItem(str, str2, str3, str4, str5, str6, z, str7, channel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.valueOf;
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
            if (!(obj instanceof AchRelinkItem)) {
                return false;
            }
            AchRelinkItem achRelinkItem = (AchRelinkItem) obj;
            return Intrinsics.EZpvd((Object) this.valueOf, (Object) achRelinkItem.valueOf) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) achRelinkItem.gEmmrt) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) achRelinkItem.AhwBna) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) achRelinkItem.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) achRelinkItem.EZpvd) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) achRelinkItem.djBIcL) && this.AYXKKw == achRelinkItem.AYXKKw && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) achRelinkItem.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, achRelinkItem.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.valueOf;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.gEmmrt;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.AhwBna;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            int iHashCode4 = this.AEQbTJ.hashCode();
            int iHashCode5 = this.EZpvd.hashCode();
            int iHashCode6 = this.djBIcL.hashCode();
            int iHashCode7 = Boolean.hashCode(this.AYXKKw);
            String str4 = this.OLrzqt;
            int iHashCode8 = str4 == null ? 0 : str4.hashCode();
            Channel channel = this.KWHzl;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (channel != null ? channel.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AchRelinkItem(startTitle1=" + this.valueOf + ", startTitle2=" + this.gEmmrt + ", startSubtitle=" + this.AhwBna + ", iconUrl=" + this.AEQbTJ + ", endTitle=" + this.EZpvd + ", platformCode=" + this.djBIcL + ", showLimitIcon=" + this.AYXKKw + ", paymentAccountId=" + this.OLrzqt + ", channel=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.valueOf);
            parcel.writeString(this.gEmmrt);
            parcel.writeString(this.AhwBna);
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.djBIcL);
            parcel.writeInt(this.AYXKKw ? 1 : 0);
            parcel.writeString(this.OLrzqt);
            parcel.writeParcelable(this.KWHzl, i);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.Channel:?: TERNARY null = ((wrap:int:0x0023: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.Channel) : (r22v0 com.okinc.okpaymentapi.data.remote.model.management.Channel))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.Channel):void (m)] (LINE:42) call: com.okinc.buysell.ui.paymentmethod.data.SelectionRow.AchRelinkItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.Channel):void type: THIS */
        public /* synthetic */ AchRelinkItem(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, Channel channel, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, str5, str6, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : channel);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AchRelinkItem(String str, String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, String str7, Channel channel) {
            super(null);
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.valueOf = str;
            this.gEmmrt = str2;
            this.AhwBna = str3;
            this.AEQbTJ = str4;
            this.EZpvd = str5;
            this.djBIcL = str6;
            this.AYXKKw = z;
            this.OLrzqt = str7;
            this.KWHzl = channel;
        }
    }

    public static final class PaymentMethodCashItem extends SelectionRow implements Parcelable {
        public static final Parcelable.Creator<PaymentMethodCashItem> CREATOR = new Creator();
        public final String AEQbTJ;
        public final boolean AYXKKw;
        public final boolean AhwBna;
        public final String AkhnZx;
        public final int DbNXlk;
        public final String EZpvd;
        public final String KWHzl;
        public final int OLrzqt;
        public final String copydefault;
        public final boolean djBIcL;
        public final String ejfBZ;
        public final String fJNWhG;
        public final String fetchVPNInfo;
        public final PaymentMethodCategory gEmmrt;
        public final boolean isConnected;
        public boolean valueOf;
        public final String values;

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<PaymentMethodCashItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodCashItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PaymentMethodCashItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), (PaymentMethodCategory) parcel.readParcelable(PaymentMethodCashItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodCashItem[] newArray(int i) {
                return new PaymentMethodCashItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.valueOf = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AhwBna() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AkhnZx() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String DbNXlk() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PaymentMethodCashItem KWHzl(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, int i, @NotNull PaymentMethodCategory paymentMethodCategory, boolean z2, @NotNull String str6, int i2, boolean z3, boolean z4, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z5) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(paymentMethodCategory, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            return new PaymentMethodCashItem(str, str2, str3, str4, z, str5, i, paymentMethodCategory, z2, str6, i2, z3, z4, str7, str8, str9, z5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.AEQbTJ;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethodCashItem)) {
                return false;
            }
            PaymentMethodCashItem paymentMethodCashItem = (PaymentMethodCashItem) obj;
            return Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) paymentMethodCashItem.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) paymentMethodCashItem.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) paymentMethodCashItem.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) paymentMethodCashItem.AEQbTJ) && this.valueOf == paymentMethodCashItem.valueOf && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) paymentMethodCashItem.AkhnZx) && this.OLrzqt == paymentMethodCashItem.OLrzqt && this.gEmmrt == paymentMethodCashItem.gEmmrt && this.isConnected == paymentMethodCashItem.isConnected && Intrinsics.EZpvd((Object) this.values, (Object) paymentMethodCashItem.values) && this.DbNXlk == paymentMethodCashItem.DbNXlk && this.AhwBna == paymentMethodCashItem.AhwBna && this.AYXKKw == paymentMethodCashItem.AYXKKw && Intrinsics.EZpvd((Object) this.copydefault, (Object) paymentMethodCashItem.copydefault) && Intrinsics.EZpvd((Object) this.ejfBZ, (Object) paymentMethodCashItem.ejfBZ) && Intrinsics.EZpvd((Object) this.fJNWhG, (Object) paymentMethodCashItem.fJNWhG) && this.djBIcL == paymentMethodCashItem.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean fetchVPNInfo() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.fetchVPNInfo;
            return ((((((((((((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.valueOf)) * 31) + this.AkhnZx.hashCode()) * 31) + Integer.hashCode(this.OLrzqt)) * 31) + this.gEmmrt.hashCode()) * 31) + Boolean.hashCode(this.isConnected)) * 31) + this.values.hashCode()) * 31) + Integer.hashCode(this.DbNXlk)) * 31) + Boolean.hashCode(this.AhwBna)) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + this.copydefault.hashCode()) * 31) + this.ejfBZ.hashCode()) * 31) + this.fJNWhG.hashCode()) * 31) + Boolean.hashCode(this.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isConnected() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PaymentMethodCashItem(startTitle1=" + this.fetchVPNInfo + ", iconUrl=" + this.KWHzl + ", endTitle=" + this.EZpvd + ", endSubtitle=" + this.AEQbTJ + ", isSelected=" + this.valueOf + ", platformCode=" + this.AkhnZx + ", categoryCode=" + this.OLrzqt + ", paymentMethodCategory=" + this.gEmmrt + ", showTransfer=" + this.isConnected + ", supportCurrency=" + this.values + ", supportCurrencyScale=" + this.DbNXlk + ", isBuyFlow=" + this.AhwBna + ", isDexTokenSelected=" + this.AYXKKw + ", availableBalance=" + this.copydefault + ", unavailableBalance=" + this.ejfBZ + ", totalBalance=" + this.fJNWhG + ", isRestrictedForRecurringEdit=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean values() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.fetchVPNInfo);
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.AEQbTJ);
            parcel.writeInt(this.valueOf ? 1 : 0);
            parcel.writeString(this.AkhnZx);
            parcel.writeInt(this.OLrzqt);
            parcel.writeParcelable(this.gEmmrt, i);
            parcel.writeInt(this.isConnected ? 1 : 0);
            parcel.writeString(this.values);
            parcel.writeInt(this.DbNXlk);
            parcel.writeInt(this.AhwBna ? 1 : 0);
            parcel.writeInt(this.AYXKKw ? 1 : 0);
            parcel.writeString(this.copydefault);
            parcel.writeString(this.ejfBZ);
            parcel.writeString(this.fJNWhG);
            parcel.writeInt(this.djBIcL ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentMethodCashItem(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, int i, @NotNull PaymentMethodCategory paymentMethodCategory, boolean z2, @NotNull String str6, int i2, boolean z3, boolean z4, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z5) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(paymentMethodCategory, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            this.fetchVPNInfo = str;
            this.KWHzl = str2;
            this.EZpvd = str3;
            this.AEQbTJ = str4;
            this.valueOf = z;
            this.AkhnZx = str5;
            this.OLrzqt = i;
            this.gEmmrt = paymentMethodCategory;
            this.isConnected = z2;
            this.values = str6;
            this.DbNXlk = i2;
            this.AhwBna = z3;
            this.AYXKKw = z4;
            this.copydefault = str7;
            this.ejfBZ = str8;
            this.fJNWhG = str9;
            this.djBIcL = z5;
        }
    }

    public static final class PaymentMethodStablecoinItem extends SelectionRow implements Parcelable {
        public static final Parcelable.Creator<PaymentMethodStablecoinItem> CREATOR = new Creator();
        public final String AEQbTJ;
        public final boolean AYXKKw;
        public final boolean AhwBna;
        public final PaymentMethodCategory AkhnZx;
        public final String AuCTel;
        public final String DbNXlk;
        public final String EZpvd;
        public final String KWHzl;
        public final int OLrzqt;
        public final String copydefault;
        public boolean djBIcL;
        public final String ejfBZ;
        public final int fIwbmz;
        public final String fJNWhG;
        public final String fetchVPNInfo;
        public final String gEmmrt;
        public final String isConnected;
        public final boolean valueOf;
        public final boolean values;

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<PaymentMethodStablecoinItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodStablecoinItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PaymentMethodStablecoinItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), (PaymentMethodCategory) parcel.readParcelable(PaymentMethodStablecoinItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodStablecoinItem[] newArray(int i) {
                return new PaymentMethodStablecoinItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.djBIcL = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AkhnZx() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean DbNXlk() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PaymentMethodStablecoinItem OLrzqt(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, int i, @NotNull PaymentMethodCategory paymentMethodCategory, boolean z2, @NotNull String str6, int i2, boolean z3, boolean z4, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z5) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(paymentMethodCategory, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            return new PaymentMethodStablecoinItem(str, str2, str3, str4, z, str5, i, paymentMethodCategory, z2, str6, i2, z3, z4, str7, str8, str9, str10, str11, z5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.copydefault;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethodStablecoinItem)) {
                return false;
            }
            PaymentMethodStablecoinItem paymentMethodStablecoinItem = (PaymentMethodStablecoinItem) obj;
            return Intrinsics.EZpvd((Object) this.isConnected, (Object) paymentMethodStablecoinItem.isConnected) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) paymentMethodStablecoinItem.gEmmrt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) paymentMethodStablecoinItem.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) paymentMethodStablecoinItem.AEQbTJ) && this.djBIcL == paymentMethodStablecoinItem.djBIcL && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) paymentMethodStablecoinItem.fetchVPNInfo) && this.OLrzqt == paymentMethodStablecoinItem.OLrzqt && this.AkhnZx == paymentMethodStablecoinItem.AkhnZx && this.values == paymentMethodStablecoinItem.values && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) paymentMethodStablecoinItem.DbNXlk) && this.fIwbmz == paymentMethodStablecoinItem.fIwbmz && this.AYXKKw == paymentMethodStablecoinItem.AYXKKw && this.valueOf == paymentMethodStablecoinItem.valueOf && Intrinsics.EZpvd((Object) this.copydefault, (Object) paymentMethodStablecoinItem.copydefault) && Intrinsics.EZpvd((Object) this.fJNWhG, (Object) paymentMethodStablecoinItem.fJNWhG) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) paymentMethodStablecoinItem.EZpvd) && Intrinsics.EZpvd((Object) this.AuCTel, (Object) paymentMethodStablecoinItem.AuCTel) && Intrinsics.EZpvd((Object) this.ejfBZ, (Object) paymentMethodStablecoinItem.ejfBZ) && this.AhwBna == paymentMethodStablecoinItem.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean fetchVPNInfo() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int gEmmrt() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.isConnected;
            return ((((((((((((((((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.djBIcL)) * 31) + this.fetchVPNInfo.hashCode()) * 31) + Integer.hashCode(this.OLrzqt)) * 31) + this.AkhnZx.hashCode()) * 31) + Boolean.hashCode(this.values)) * 31) + this.DbNXlk.hashCode()) * 31) + Integer.hashCode(this.fIwbmz)) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + Boolean.hashCode(this.valueOf)) * 31) + this.copydefault.hashCode()) * 31) + this.fJNWhG.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AuCTel.hashCode()) * 31) + this.ejfBZ.hashCode()) * 31) + Boolean.hashCode(this.AhwBna);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String isConnected() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PaymentMethodStablecoinItem(startTitle1=" + this.isConnected + ", iconUrl=" + this.gEmmrt + ", endTitle=" + this.KWHzl + ", endSubtitle=" + this.AEQbTJ + ", isSelected=" + this.djBIcL + ", platformCode=" + this.fetchVPNInfo + ", categoryCode=" + this.OLrzqt + ", paymentMethodCategory=" + this.AkhnZx + ", showTransfer=" + this.values + ", supportCurrency=" + this.DbNXlk + ", supportCurrencyScale=" + this.fIwbmz + ", isBuyFlow=" + this.AYXKKw + ", isDexTokenSelected=" + this.valueOf + ", displayCurrency=" + this.copydefault + ", tagString=" + this.fJNWhG + ", availableBalance=" + this.EZpvd + ", unavailableBalance=" + this.AuCTel + ", totalBalance=" + this.ejfBZ + ", isRestrictedForRecurringEdit=" + this.AhwBna + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String values() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.isConnected);
            parcel.writeString(this.gEmmrt);
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.AEQbTJ);
            parcel.writeInt(this.djBIcL ? 1 : 0);
            parcel.writeString(this.fetchVPNInfo);
            parcel.writeInt(this.OLrzqt);
            parcel.writeParcelable(this.AkhnZx, i);
            parcel.writeInt(this.values ? 1 : 0);
            parcel.writeString(this.DbNXlk);
            parcel.writeInt(this.fIwbmz);
            parcel.writeInt(this.AYXKKw ? 1 : 0);
            parcel.writeInt(this.valueOf ? 1 : 0);
            parcel.writeString(this.copydefault);
            parcel.writeString(this.fJNWhG);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.AuCTel);
            parcel.writeString(this.ejfBZ);
            parcel.writeInt(this.AhwBna ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentMethodStablecoinItem(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, int i, @NotNull PaymentMethodCategory paymentMethodCategory, boolean z2, @NotNull String str6, int i2, boolean z3, boolean z4, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z5) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(paymentMethodCategory, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            this.isConnected = str;
            this.gEmmrt = str2;
            this.KWHzl = str3;
            this.AEQbTJ = str4;
            this.djBIcL = z;
            this.fetchVPNInfo = str5;
            this.OLrzqt = i;
            this.AkhnZx = paymentMethodCategory;
            this.values = z2;
            this.DbNXlk = str6;
            this.fIwbmz = i2;
            this.AYXKKw = z3;
            this.valueOf = z4;
            this.copydefault = str7;
            this.fJNWhG = str8;
            this.EZpvd = str9;
            this.AuCTel = str10;
            this.ejfBZ = str11;
            this.AhwBna = z5;
        }
    }

    public static final class PaymentMethodCryptoItem extends SelectionRow implements Parcelable {
        public static final Parcelable.Creator<PaymentMethodCryptoItem> CREATOR = new Creator();
        public final String AEQbTJ;
        public final boolean AYXKKw;
        public final boolean AhwBna;
        public final String AkhnZx;
        public final String AuCTel;
        public boolean DbNXlk;
        public final String EZpvd;
        public final int KWHzl;
        public final String OLrzqt;
        public final String copydefault;
        public final boolean djBIcL;
        public final String ejfBZ;
        public final String fARcdN;
        public final String fIwbmz;
        public final int fJNWhG;
        public final String fetchVPNInfo;
        public final boolean gEmmrt;
        public final PaymentMethodCategory isConnected;
        public final String valueOf;
        public final boolean values;

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<PaymentMethodCryptoItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodCryptoItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PaymentMethodCryptoItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), (PaymentMethodCategory) parcel.readParcelable(PaymentMethodCryptoItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentMethodCryptoItem[] newArray(int i) {
                return new PaymentMethodCryptoItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PaymentMethodCryptoItem AEQbTJ(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, int i, @NotNull PaymentMethodCategory paymentMethodCategory, boolean z2, @NotNull String str6, int i2, boolean z3, boolean z4, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z5, boolean z6) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(paymentMethodCategory, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            return new PaymentMethodCryptoItem(str, str2, str3, str4, z, str5, i, paymentMethodCategory, z2, str6, i2, z3, z4, str7, str8, str9, str10, str11, z5, z6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AkhnZx() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean DbNXlk() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.DbNXlk = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.copydefault;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethodCryptoItem)) {
                return false;
            }
            PaymentMethodCryptoItem paymentMethodCryptoItem = (PaymentMethodCryptoItem) obj;
            return Intrinsics.EZpvd((Object) this.AkhnZx, (Object) paymentMethodCryptoItem.AkhnZx) && Intrinsics.EZpvd((Object) this.valueOf, (Object) paymentMethodCryptoItem.valueOf) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) paymentMethodCryptoItem.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) paymentMethodCryptoItem.AEQbTJ) && this.DbNXlk == paymentMethodCryptoItem.DbNXlk && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) paymentMethodCryptoItem.fetchVPNInfo) && this.KWHzl == paymentMethodCryptoItem.KWHzl && this.isConnected == paymentMethodCryptoItem.isConnected && this.values == paymentMethodCryptoItem.values && Intrinsics.EZpvd((Object) this.fARcdN, (Object) paymentMethodCryptoItem.fARcdN) && this.fJNWhG == paymentMethodCryptoItem.fJNWhG && this.gEmmrt == paymentMethodCryptoItem.gEmmrt && this.AYXKKw == paymentMethodCryptoItem.AYXKKw && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) paymentMethodCryptoItem.OLrzqt) && Intrinsics.EZpvd((Object) this.AuCTel, (Object) paymentMethodCryptoItem.AuCTel) && Intrinsics.EZpvd((Object) this.copydefault, (Object) paymentMethodCryptoItem.copydefault) && Intrinsics.EZpvd((Object) this.fIwbmz, (Object) paymentMethodCryptoItem.fIwbmz) && Intrinsics.EZpvd((Object) this.ejfBZ, (Object) paymentMethodCryptoItem.ejfBZ) && this.djBIcL == paymentMethodCryptoItem.djBIcL && this.AhwBna == paymentMethodCryptoItem.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String fetchVPNInfo() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.AkhnZx;
            return ((((((((((((((((((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.DbNXlk)) * 31) + this.fetchVPNInfo.hashCode()) * 31) + Integer.hashCode(this.KWHzl)) * 31) + this.isConnected.hashCode()) * 31) + Boolean.hashCode(this.values)) * 31) + this.fARcdN.hashCode()) * 31) + Integer.hashCode(this.fJNWhG)) * 31) + Boolean.hashCode(this.gEmmrt)) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + this.OLrzqt.hashCode()) * 31) + this.AuCTel.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.fIwbmz.hashCode()) * 31) + this.ejfBZ.hashCode()) * 31) + Boolean.hashCode(this.djBIcL)) * 31) + Boolean.hashCode(this.AhwBna);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isConnected() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PaymentMethodCryptoItem(startTitle1=" + this.AkhnZx + ", iconUrl=" + this.valueOf + ", endTitle=" + this.EZpvd + ", endSubtitle=" + this.AEQbTJ + ", isSelected=" + this.DbNXlk + ", platformCode=" + this.fetchVPNInfo + ", categoryCode=" + this.KWHzl + ", paymentMethodCategory=" + this.isConnected + ", showTransfer=" + this.values + ", supportCurrency=" + this.fARcdN + ", supportCurrencyScale=" + this.fJNWhG + ", isBuyFlow=" + this.gEmmrt + ", isDexTokenSelected=" + this.AYXKKw + ", displayCurrency=" + this.OLrzqt + ", tagString=" + this.AuCTel + ", availableBalance=" + this.copydefault + ", unavailableBalance=" + this.fIwbmz + ", totalBalance=" + this.ejfBZ + ", isPeggedCurrencyTradeable=" + this.djBIcL + ", isRestrictedForRecurringEdit=" + this.AhwBna + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean values() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AkhnZx);
            parcel.writeString(this.valueOf);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.AEQbTJ);
            parcel.writeInt(this.DbNXlk ? 1 : 0);
            parcel.writeString(this.fetchVPNInfo);
            parcel.writeInt(this.KWHzl);
            parcel.writeParcelable(this.isConnected, i);
            parcel.writeInt(this.values ? 1 : 0);
            parcel.writeString(this.fARcdN);
            parcel.writeInt(this.fJNWhG);
            parcel.writeInt(this.gEmmrt ? 1 : 0);
            parcel.writeInt(this.AYXKKw ? 1 : 0);
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.AuCTel);
            parcel.writeString(this.copydefault);
            parcel.writeString(this.fIwbmz);
            parcel.writeString(this.ejfBZ);
            parcel.writeInt(this.djBIcL ? 1 : 0);
            parcel.writeInt(this.AhwBna ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentMethodCryptoItem(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, int i, @NotNull PaymentMethodCategory paymentMethodCategory, boolean z2, @NotNull String str6, int i2, boolean z3, boolean z4, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, boolean z5, boolean z6) {
            super(null);
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(paymentMethodCategory, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            this.AkhnZx = str;
            this.valueOf = str2;
            this.EZpvd = str3;
            this.AEQbTJ = str4;
            this.DbNXlk = z;
            this.fetchVPNInfo = str5;
            this.KWHzl = i;
            this.isConnected = paymentMethodCategory;
            this.values = z2;
            this.fARcdN = str6;
            this.fJNWhG = i2;
            this.gEmmrt = z3;
            this.AYXKKw = z4;
            this.OLrzqt = str7;
            this.AuCTel = str8;
            this.copydefault = str9;
            this.fIwbmz = str10;
            this.ejfBZ = str11;
            this.djBIcL = z5;
            this.AhwBna = z6;
        }
    }

    public static final class AddPaymentMethodItem extends SelectionRow implements Parcelable {
        public final Channel AEQbTJ;
        public final String AYXKKw;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String djBIcL;
        public final String gEmmrt;
        public final String valueOf;
        public static final int copydefault = Channel.$stable;
        public static final Parcelable.Creator<AddPaymentMethodItem> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<AddPaymentMethodItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddPaymentMethodItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new AddPaymentMethodItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Channel) parcel.readParcelable(AddPaymentMethodItem.class.getClassLoader()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddPaymentMethodItem[] newArray(int i) {
                return new AddPaymentMethodItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AddPaymentMethodItem EZpvd(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, Channel channel) {
            Intrinsics.checkNotNullParameter(str, "");
            return new AddPaymentMethodItem(str, str2, str3, str4, str5, str6, str7, channel);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Channel OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.OLrzqt;
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
            if (!(obj instanceof AddPaymentMethodItem)) {
                return false;
            }
            AddPaymentMethodItem addPaymentMethodItem = (AddPaymentMethodItem) obj;
            return Intrinsics.EZpvd((Object) this.gEmmrt, (Object) addPaymentMethodItem.gEmmrt) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) addPaymentMethodItem.AYXKKw) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) addPaymentMethodItem.djBIcL) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) addPaymentMethodItem.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) addPaymentMethodItem.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) addPaymentMethodItem.KWHzl) && Intrinsics.EZpvd((Object) this.valueOf, (Object) addPaymentMethodItem.valueOf) && Intrinsics.EZpvd(this.AEQbTJ, addPaymentMethodItem.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.gEmmrt.hashCode();
            String str = this.AYXKKw;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.djBIcL;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.OLrzqt;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.EZpvd;
            int iHashCode5 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.KWHzl;
            int iHashCode6 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.valueOf;
            int iHashCode7 = str6 == null ? 0 : str6.hashCode();
            Channel channel = this.AEQbTJ;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (channel != null ? channel.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AddPaymentMethodItem(startTitle=" + this.gEmmrt + ", startSubtitle1=" + this.AYXKKw + ", startSubtitle2=" + this.djBIcL + ", iconUrl=" + this.OLrzqt + ", doColorTagForFee=" + this.EZpvd + ", doColorTagForLimit=" + this.KWHzl + ", platformCode=" + this.valueOf + ", channel=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.gEmmrt);
            parcel.writeString(this.AYXKKw);
            parcel.writeString(this.djBIcL);
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.valueOf);
            parcel.writeParcelable(this.AEQbTJ, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddPaymentMethodItem(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, Channel channel) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.gEmmrt = str;
            this.AYXKKw = str2;
            this.djBIcL = str3;
            this.OLrzqt = str4;
            this.EZpvd = str5;
            this.KWHzl = str6;
            this.valueOf = str7;
            this.AEQbTJ = channel;
        }
    }

    public static final class SectionHeader extends SelectionRow {
        public static final Parcelable.Creator<SectionHeader> CREATOR = new Creator();
        public final boolean AEQbTJ;
        public final boolean KWHzl;
        public final String OLrzqt;

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<SectionHeader> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SectionHeader createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SectionHeader(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SectionHeader[] newArray(int i) {
                return new SectionHeader[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SectionHeader copy$default(SectionHeader sectionHeader, String str, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sectionHeader.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = sectionHeader.AEQbTJ;
            }
            if ((i & 4) != 0) {
                z2 = sectionHeader.KWHzl;
            }
            return sectionHeader.AEQbTJ(str, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SectionHeader AEQbTJ(@NotNull String str, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SectionHeader(str, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.AEQbTJ;
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
            if (!(obj instanceof SectionHeader)) {
                return false;
            }
            SectionHeader sectionHeader = (SectionHeader) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) sectionHeader.OLrzqt) && this.AEQbTJ == sectionHeader.AEQbTJ && this.KWHzl == sectionHeader.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.OLrzqt.hashCode() * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SectionHeader(title=" + this.OLrzqt + ", hasDivider=" + this.AEQbTJ + ", isMiddleHeader=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeInt(this.AEQbTJ ? 1 : 0);
            parcel.writeInt(this.KWHzl ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionHeader(@NotNull String str, boolean z, boolean z2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
            this.AEQbTJ = z;
            this.KWHzl = z2;
        }
    }
}

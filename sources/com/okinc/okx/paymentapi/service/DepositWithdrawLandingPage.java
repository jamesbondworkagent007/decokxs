package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class DepositWithdrawLandingPage implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DepositWithdrawLandingPage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DepositWithdrawLandingPage() {
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class DepositPage extends DepositWithdrawLandingPage {
        public static final Parcelable.Creator<DepositPage> CREATOR = new Creator();
        public final String AEQbTJ;
        public final SDUISourcePage EZpvd;
        public final String OLrzqt;

        public static final class Creator implements Parcelable.Creator<DepositPage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DepositPage(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SDUISourcePage.valueOf(parcel.readString()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositPage[] newArray(int i) {
                return new DepositPage[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DepositPage() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DepositPage copy$default(DepositPage depositPage, String str, String str2, SDUISourcePage sDUISourcePage, int i, Object obj) {
            if ((i & 1) != 0) {
                str = depositPage.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = depositPage.OLrzqt;
            }
            if ((i & 4) != 0) {
                sDUISourcePage = depositPage.EZpvd;
            }
            return depositPage.copydefault(str, str2, sDUISourcePage);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DepositPage copydefault(@NotNull String str, @NotNull String str2, SDUISourcePage sDUISourcePage) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new DepositPage(str, str2, sDUISourcePage);
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
            if (!(obj instanceof DepositPage)) {
                return false;
            }
            DepositPage depositPage = (DepositPage) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) depositPage.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) depositPage.OLrzqt) && this.EZpvd == depositPage.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            SDUISourcePage sDUISourcePage = this.EZpvd;
            return (((iHashCode * 31) + iHashCode2) * 31) + (sDUISourcePage == null ? 0 : sDUISourcePage.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DepositPage(currency=" + this.AEQbTJ + ", depositPlatformCode=" + this.OLrzqt + ", sourcePage=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.OLrzqt);
            SDUISourcePage sDUISourcePage = this.EZpvd;
            if (sDUISourcePage == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(sDUISourcePage.name());
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:com.okinc.okx.paymentapi.service.SDUISourcePage:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.service.SDUISourcePage) : (r4v0 com.okinc.okx.paymentapi.service.SDUISourcePage))
 A[MD:(java.lang.String, java.lang.String, com.okinc.okx.paymentapi.service.SDUISourcePage):void (m)] (LINE:566) call: com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage.DepositPage.<init>(java.lang.String, java.lang.String, com.okinc.okx.paymentapi.service.SDUISourcePage):void type: THIS */
        public /* synthetic */ DepositPage(String str, String str2, SDUISourcePage sDUISourcePage, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : sDUISourcePage);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepositPage(@NotNull String str, @NotNull String str2, SDUISourcePage sDUISourcePage) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = str;
            this.OLrzqt = str2;
            this.EZpvd = sDUISourcePage;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class WithdrawPage extends DepositWithdrawLandingPage {
        public static final Parcelable.Creator<WithdrawPage> CREATOR = new Creator();
        public final String KWHzl;

        public static final class Creator implements Parcelable.Creator<WithdrawPage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new WithdrawPage(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawPage[] newArray(int i) {
                return new WithdrawPage[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public WithdrawPage() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ WithdrawPage copy$default(WithdrawPage withdrawPage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = withdrawPage.KWHzl;
            }
            return withdrawPage.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WithdrawPage copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new WithdrawPage(str);
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
            return (obj instanceof WithdrawPage) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((WithdrawPage) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WithdrawPage(currency=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.KWHzl);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:573) call: com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage.WithdrawPage.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ WithdrawPage(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithdrawPage(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }

    public static final class DepositPaymentSelectionPage extends DepositWithdrawLandingPage {
        public static final Parcelable.Creator<DepositPaymentSelectionPage> CREATOR = new Creator();
        public final String KWHzl;

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Creator implements Parcelable.Creator<DepositPaymentSelectionPage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositPaymentSelectionPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DepositPaymentSelectionPage(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositPaymentSelectionPage[] newArray(int i) {
                return new DepositPaymentSelectionPage[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DepositPaymentSelectionPage copy$default(DepositPaymentSelectionPage depositPaymentSelectionPage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = depositPaymentSelectionPage.KWHzl;
            }
            return depositPaymentSelectionPage.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DepositPaymentSelectionPage KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new DepositPaymentSelectionPage(str);
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
            return (obj instanceof DepositPaymentSelectionPage) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((DepositPaymentSelectionPage) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DepositPaymentSelectionPage(currency=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.KWHzl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepositPaymentSelectionPage(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class WithdrawPaymentSelectionPage extends DepositWithdrawLandingPage {
        public static final Parcelable.Creator<WithdrawPaymentSelectionPage> CREATOR = new Creator();
        public final String KWHzl;

        public static final class Creator implements Parcelable.Creator<WithdrawPaymentSelectionPage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawPaymentSelectionPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new WithdrawPaymentSelectionPage(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawPaymentSelectionPage[] newArray(int i) {
                return new WithdrawPaymentSelectionPage[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ WithdrawPaymentSelectionPage copy$default(WithdrawPaymentSelectionPage withdrawPaymentSelectionPage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = withdrawPaymentSelectionPage.KWHzl;
            }
            return withdrawPaymentSelectionPage.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WithdrawPaymentSelectionPage KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new WithdrawPaymentSelectionPage(str);
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
            return (obj instanceof WithdrawPaymentSelectionPage) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((WithdrawPaymentSelectionPage) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WithdrawPaymentSelectionPage(currency=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.KWHzl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithdrawPaymentSelectionPage(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }

    public static final class DepositHistoryDetailPage extends DepositWithdrawLandingPage {
        public static final Parcelable.Creator<DepositHistoryDetailPage> CREATOR = new Creator();
        public final String OLrzqt;
        public final String copydefault;

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<DepositHistoryDetailPage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositHistoryDetailPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DepositHistoryDetailPage(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositHistoryDetailPage[] newArray(int i) {
                return new DepositHistoryDetailPage[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DepositHistoryDetailPage copy$default(DepositHistoryDetailPage depositHistoryDetailPage, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = depositHistoryDetailPage.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = depositHistoryDetailPage.copydefault;
            }
            return depositHistoryDetailPage.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DepositHistoryDetailPage AEQbTJ(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new DepositHistoryDetailPage(str, str2);
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
            if (!(obj instanceof DepositHistoryDetailPage)) {
                return false;
            }
            DepositHistoryDetailPage depositHistoryDetailPage = (DepositHistoryDetailPage) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) depositHistoryDetailPage.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) depositHistoryDetailPage.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DepositHistoryDetailPage(orderNo=" + this.OLrzqt + ", tradeType=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.copydefault);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:588) call: com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage.DepositHistoryDetailPage.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ DepositHistoryDetailPage(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepositHistoryDetailPage(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.copydefault = str2;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class WithdrawHistoryDetailPage extends DepositWithdrawLandingPage {
        public static final Parcelable.Creator<WithdrawHistoryDetailPage> CREATOR = new Creator();
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<WithdrawHistoryDetailPage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawHistoryDetailPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new WithdrawHistoryDetailPage(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithdrawHistoryDetailPage[] newArray(int i) {
                return new WithdrawHistoryDetailPage[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ WithdrawHistoryDetailPage copy$default(WithdrawHistoryDetailPage withdrawHistoryDetailPage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = withdrawHistoryDetailPage.copydefault;
            }
            return withdrawHistoryDetailPage.AEQbTJ(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WithdrawHistoryDetailPage AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new WithdrawHistoryDetailPage(str);
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
            return (obj instanceof WithdrawHistoryDetailPage) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((WithdrawHistoryDetailPage) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WithdrawHistoryDetailPage(orderNo=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithdrawHistoryDetailPage(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class DepositInputPage extends DepositWithdrawLandingPage {
        public static final Parcelable.Creator<DepositInputPage> CREATOR = new Creator();
        public final String EZpvd;

        public static final class Creator implements Parcelable.Creator<DepositInputPage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositInputPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DepositInputPage(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositInputPage[] newArray(int i) {
                return new DepositInputPage[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DepositInputPage() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DepositInputPage copy$default(DepositInputPage depositInputPage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = depositInputPage.EZpvd;
            }
            return depositInputPage.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DepositInputPage EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new DepositInputPage(str);
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
            return (obj instanceof DepositInputPage) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((DepositInputPage) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DepositInputPage(currency=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.EZpvd);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:599) call: com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage.DepositInputPage.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ DepositInputPage(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DepositInputPage(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }
}

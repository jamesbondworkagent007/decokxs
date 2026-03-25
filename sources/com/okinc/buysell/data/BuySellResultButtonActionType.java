package com.okinc.buysell.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class BuySellResultButtonActionType implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.data.BuySellResultButtonActionType.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BuySellResultButtonActionType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BuySellResultButtonActionType() {
    }

    public static final class StartBuySellOrderDetail extends BuySellResultButtonActionType {
        public static final StartBuySellOrderDetail EZpvd = new StartBuySellOrderDetail();
        public static final Parcelable.Creator<StartBuySellOrderDetail> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<StartBuySellOrderDetail> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartBuySellOrderDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return StartBuySellOrderDetail.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartBuySellOrderDetail[] newArray(int i) {
                return new StartBuySellOrderDetail[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private StartBuySellOrderDetail() {
            super(null);
        }
    }

    public static final class StartBuySellRecurringOrderDetail extends BuySellResultButtonActionType {
        public static final StartBuySellRecurringOrderDetail copydefault = new StartBuySellRecurringOrderDetail();
        public static final Parcelable.Creator<StartBuySellRecurringOrderDetail> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<StartBuySellRecurringOrderDetail> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartBuySellRecurringOrderDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return StartBuySellRecurringOrderDetail.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartBuySellRecurringOrderDetail[] newArray(int i) {
                return new StartBuySellRecurringOrderDetail[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private StartBuySellRecurringOrderDetail() {
            super(null);
        }
    }

    public static final class StartContactSupport extends BuySellResultButtonActionType {
        public static final StartContactSupport EZpvd = new StartContactSupport();
        public static final Parcelable.Creator<StartContactSupport> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<StartContactSupport> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartContactSupport createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return StartContactSupport.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartContactSupport[] newArray(int i) {
                return new StartContactSupport[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private StartContactSupport() {
            super(null);
        }
    }

    public static final class Dismiss extends BuySellResultButtonActionType {
        public static final Dismiss KWHzl = new Dismiss();
        public static final Parcelable.Creator<Dismiss> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Dismiss> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Dismiss createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Dismiss.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Dismiss[] newArray(int i) {
                return new Dismiss[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private Dismiss() {
            super(null);
        }
    }

    public static final class Done extends BuySellResultButtonActionType {
        public static final Done AEQbTJ = new Done();
        public static final Parcelable.Creator<Done> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Done> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Done createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Done.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Done[] newArray(int i) {
                return new Done[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private Done() {
            super(null);
        }
    }

    public static final class BackToPay extends BuySellResultButtonActionType {
        public static final BackToPay AEQbTJ = new BackToPay();
        public static final Parcelable.Creator<BackToPay> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<BackToPay> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BackToPay createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return BackToPay.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BackToPay[] newArray(int i) {
                return new BackToPay[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private BackToPay() {
            super(null);
        }
    }

    public static final class TryAgain extends BuySellResultButtonActionType {
        public static final TryAgain AEQbTJ = new TryAgain();
        public static final Parcelable.Creator<TryAgain> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<TryAgain> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TryAgain createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return TryAgain.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TryAgain[] newArray(int i) {
                return new TryAgain[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private TryAgain() {
            super(null);
        }
    }

    public static final class StartBuyRecurringOrderDetail extends BuySellResultButtonActionType {
        public static final Parcelable.Creator<StartBuyRecurringOrderDetail> CREATOR = new Creator();
        public final String EZpvd;

        public static final class Creator implements Parcelable.Creator<StartBuyRecurringOrderDetail> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartBuyRecurringOrderDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new StartBuyRecurringOrderDetail(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartBuyRecurringOrderDetail[] newArray(int i) {
                return new StartBuyRecurringOrderDetail[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StartBuyRecurringOrderDetail copy$default(StartBuyRecurringOrderDetail startBuyRecurringOrderDetail, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = startBuyRecurringOrderDetail.EZpvd;
            }
            return startBuyRecurringOrderDetail.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StartBuyRecurringOrderDetail OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StartBuyRecurringOrderDetail(str);
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
            return (obj instanceof StartBuyRecurringOrderDetail) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((StartBuyRecurringOrderDetail) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "StartBuyRecurringOrderDetail(planId=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.EZpvd);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartBuyRecurringOrderDetail(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }

    public static final class TryAgainWithExtra extends BuySellResultButtonActionType {
        public static final Parcelable.Creator<TryAgainWithExtra> CREATOR = new Creator();
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<TryAgainWithExtra> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TryAgainWithExtra createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TryAgainWithExtra(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TryAgainWithExtra[] newArray(int i) {
                return new TryAgainWithExtra[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TryAgainWithExtra copy$default(TryAgainWithExtra tryAgainWithExtra, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tryAgainWithExtra.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = tryAgainWithExtra.OLrzqt;
            }
            if ((i & 4) != 0) {
                str3 = tryAgainWithExtra.copydefault;
            }
            if ((i & 8) != 0) {
                str4 = tryAgainWithExtra.KWHzl;
            }
            return tryAgainWithExtra.EZpvd(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TryAgainWithExtra EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new TryAgainWithExtra(str, str2, str3, str4);
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
            if (!(obj instanceof TryAgainWithExtra)) {
                return false;
            }
            TryAgainWithExtra tryAgainWithExtra = (TryAgainWithExtra) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) tryAgainWithExtra.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) tryAgainWithExtra.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) tryAgainWithExtra.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) tryAgainWithExtra.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TryAgainWithExtra(baseCurrency=" + this.EZpvd + ", baseAmount=" + this.OLrzqt + ", quoteCurrency=" + this.copydefault + ", quoteAmount=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.copydefault);
            parcel.writeString(this.KWHzl);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TryAgainWithExtra(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
            this.copydefault = str3;
            this.KWHzl = str4;
        }
    }

    public static final class StartDepositOrderDetail extends BuySellResultButtonActionType {
        public static final Parcelable.Creator<StartDepositOrderDetail> CREATOR = new Creator();
        public final String OLrzqt;

        public static final class Creator implements Parcelable.Creator<StartDepositOrderDetail> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartDepositOrderDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new StartDepositOrderDetail(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartDepositOrderDetail[] newArray(int i) {
                return new StartDepositOrderDetail[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StartDepositOrderDetail copy$default(StartDepositOrderDetail startDepositOrderDetail, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = startDepositOrderDetail.OLrzqt;
            }
            return startDepositOrderDetail.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StartDepositOrderDetail EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StartDepositOrderDetail(str);
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
            return (obj instanceof StartDepositOrderDetail) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((StartDepositOrderDetail) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "StartDepositOrderDetail(orderNo=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartDepositOrderDetail(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }
    }

    public static final class StartWithdrawOrderDetail extends BuySellResultButtonActionType {
        public static final Parcelable.Creator<StartWithdrawOrderDetail> CREATOR = new Creator();
        public final String EZpvd;

        public static final class Creator implements Parcelable.Creator<StartWithdrawOrderDetail> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartWithdrawOrderDetail createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new StartWithdrawOrderDetail(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartWithdrawOrderDetail[] newArray(int i) {
                return new StartWithdrawOrderDetail[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StartWithdrawOrderDetail copy$default(StartWithdrawOrderDetail startWithdrawOrderDetail, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = startWithdrawOrderDetail.EZpvd;
            }
            return startWithdrawOrderDetail.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StartWithdrawOrderDetail EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StartWithdrawOrderDetail(str);
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
            return (obj instanceof StartWithdrawOrderDetail) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((StartWithdrawOrderDetail) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "StartWithdrawOrderDetail(orderNo=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.EZpvd);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartWithdrawOrderDetail(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }

    public static final class StartPlaidFlow extends BuySellResultButtonActionType {
        public static final StartPlaidFlow OLrzqt = new StartPlaidFlow();
        public static final Parcelable.Creator<StartPlaidFlow> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<StartPlaidFlow> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartPlaidFlow createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return StartPlaidFlow.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StartPlaidFlow[] newArray(int i) {
                return new StartPlaidFlow[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private StartPlaidFlow() {
            super(null);
        }
    }

    public static final class ConvertSuccessDismissButtonBuySell extends BuySellResultButtonActionType {
        public static final ConvertSuccessDismissButtonBuySell EZpvd = new ConvertSuccessDismissButtonBuySell();
        public static final Parcelable.Creator<ConvertSuccessDismissButtonBuySell> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<ConvertSuccessDismissButtonBuySell> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConvertSuccessDismissButtonBuySell createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return ConvertSuccessDismissButtonBuySell.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConvertSuccessDismissButtonBuySell[] newArray(int i) {
                return new ConvertSuccessDismissButtonBuySell[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private ConvertSuccessDismissButtonBuySell() {
            super(null);
        }
    }

    public static final class GoToTradingButtonBuySell extends BuySellResultButtonActionType {
        public static final GoToTradingButtonBuySell EZpvd = new GoToTradingButtonBuySell();
        public static final Parcelable.Creator<GoToTradingButtonBuySell> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<GoToTradingButtonBuySell> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GoToTradingButtonBuySell createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return GoToTradingButtonBuySell.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GoToTradingButtonBuySell[] newArray(int i) {
                return new GoToTradingButtonBuySell[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private GoToTradingButtonBuySell() {
            super(null);
        }
    }
}

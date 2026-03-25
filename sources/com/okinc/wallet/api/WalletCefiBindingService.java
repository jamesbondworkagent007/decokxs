package com.okinc.wallet.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33041mov;
import o.C56444yFp;
import o.InterfaceC43217rlC;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface WalletCefiBindingService extends InterfaceC43217rlC {
    public static final TaskDescription Companion = TaskDescription.copydefault;

    /* JADX INFO: loaded from: classes17.dex */
    public interface Application {
        void OLrzqt();

        void copydefault();
    }

    /* JADX INFO: loaded from: classes17.dex */
    public interface StateListAnimator {
        void KWHzl(@NotNull WalletCefiBindingResult walletCefiBindingResult);
    }

    Object EZpvd(@NotNull Continuation<? super Boolean> continuation);

    Object copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull FragmentManager fragmentManager2, Application application, StateListAnimator stateListAnimator, @NotNull Continuation<? super Unit> continuation);

    String copydefault();

    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar {
        public static /* synthetic */ Object startCefiBindingProcess$default(WalletCefiBindingService walletCefiBindingService, AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, FragmentManager fragmentManager2, Application application, StateListAnimator stateListAnimator, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return walletCefiBindingService.copydefault(abstractActivityC33041mov, fragmentManager, fragmentManager2, (i & 8) != 0 ? null : application, (i & 16) != 0 ? null : stateListAnimator, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCefiBindingProcess");
        }
    }

    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription copydefault = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static abstract class WalletCefiBindingResult implements Parcelable {
        public static final int KWHzl = 0;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.WalletCefiBindingService.WalletCefiBindingResult.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ WalletCefiBindingResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private WalletCefiBindingResult() {
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Cancel extends WalletCefiBindingResult {
            public static final Cancel EZpvd = new Cancel();
            public static final Parcelable.Creator<Cancel> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<Cancel> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cancel createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Cancel.EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cancel[] newArray(int i) {
                    return new Cancel[i];
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

            private Cancel() {
                super(null);
            }
        }

        public static final class Success extends WalletCefiBindingResult {
            public static final Parcelable.Creator<Success> CREATOR = new Creator();
            public final WalletCefiBoundAccount AEQbTJ;
            public final boolean copydefault;

            /* JADX INFO: loaded from: classes19.dex */
            public static final class Creator implements Parcelable.Creator<Success> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new Success(WalletCefiBoundAccount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success[] newArray(int i) {
                    return new Success[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Success copy$default(Success success, WalletCefiBoundAccount walletCefiBoundAccount, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    walletCefiBoundAccount = success.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    z = success.copydefault;
                }
                return success.copydefault(walletCefiBoundAccount, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final WalletCefiBoundAccount OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Success copydefault(@NotNull WalletCefiBoundAccount walletCefiBoundAccount, boolean z) {
                Intrinsics.checkNotNullParameter(walletCefiBoundAccount, "");
                return new Success(walletCefiBoundAccount, z);
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
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.EZpvd(this.AEQbTJ, success.AEQbTJ) && this.copydefault == success.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.AEQbTJ.hashCode() * 31) + Boolean.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(boundAccount=" + this.AEQbTJ + ", isPayout=" + this.copydefault + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                this.AEQbTJ.writeToParcel(parcel, i);
                parcel.writeInt(this.copydefault ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull WalletCefiBoundAccount walletCefiBoundAccount, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(walletCefiBoundAccount, "");
                this.AEQbTJ = walletCefiBoundAccount;
                this.copydefault = z;
            }
        }

        public static final class WalletAlreadyBound extends WalletCefiBindingResult {
            public static final Parcelable.Creator<WalletAlreadyBound> CREATOR = new Creator();
            public final String AEQbTJ;
            public final String OLrzqt;

            /* JADX INFO: loaded from: classes19.dex */
            public static final class Creator implements Parcelable.Creator<WalletAlreadyBound> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final WalletAlreadyBound createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new WalletAlreadyBound(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final WalletAlreadyBound[] newArray(int i) {
                    return new WalletAlreadyBound[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ WalletAlreadyBound copy$default(WalletAlreadyBound walletAlreadyBound, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = walletAlreadyBound.OLrzqt;
                }
                if ((i & 2) != 0) {
                    str2 = walletAlreadyBound.AEQbTJ;
                }
                return walletAlreadyBound.AEQbTJ(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final WalletAlreadyBound AEQbTJ(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new WalletAlreadyBound(str, str2);
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
                if (!(obj instanceof WalletAlreadyBound)) {
                    return false;
                }
                WalletAlreadyBound walletAlreadyBound = (WalletAlreadyBound) obj;
                return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) walletAlreadyBound.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) walletAlreadyBound.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "WalletAlreadyBound(walletAddress=" + this.OLrzqt + ", chainId=" + this.AEQbTJ + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.OLrzqt);
                parcel.writeString(this.AEQbTJ);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WalletAlreadyBound(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.OLrzqt = str;
                this.AEQbTJ = str2;
            }
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class WalletCefiBoundAccount implements Parcelable {
        public static final Parcelable.Creator<WalletCefiBoundAccount> CREATOR = new Creator();
        public final boolean AEQbTJ;
        public final String AhwBna;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;
        public final String valueOf;

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Creator implements Parcelable.Creator<WalletCefiBoundAccount> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WalletCefiBoundAccount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new WalletCefiBoundAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WalletCefiBoundAccount[] newArray(int i) {
                return new WalletCefiBoundAccount[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ WalletCefiBoundAccount copy$default(WalletCefiBoundAccount walletCefiBoundAccount, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = walletCefiBoundAccount.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = walletCefiBoundAccount.copydefault;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = walletCefiBoundAccount.EZpvd;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = walletCefiBoundAccount.valueOf;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = walletCefiBoundAccount.AhwBna;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = walletCefiBoundAccount.OLrzqt;
            }
            String str11 = str6;
            if ((i & 64) != 0) {
                z = walletCefiBoundAccount.AEQbTJ;
            }
            return walletCefiBoundAccount.copydefault(str, str7, str8, str9, str10, str11, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WalletCefiBoundAccount copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new WalletCefiBoundAccount(str, str2, str3, str4, str5, str6, z);
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
            if (!(obj instanceof WalletCefiBoundAccount)) {
                return false;
            }
            WalletCefiBoundAccount walletCefiBoundAccount = (WalletCefiBoundAccount) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) walletCefiBoundAccount.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) walletCefiBoundAccount.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) walletCefiBoundAccount.EZpvd) && Intrinsics.EZpvd((Object) this.valueOf, (Object) walletCefiBoundAccount.valueOf) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) walletCefiBoundAccount.AhwBna) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) walletCefiBoundAccount.OLrzqt) && this.AEQbTJ == walletCefiBoundAccount.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WalletCefiBoundAccount(accountId=" + this.KWHzl + ", userName=" + this.copydefault + ", walletAccountName=" + this.EZpvd + ", walletIcon=" + this.valueOf + ", walletAddress=" + this.AhwBna + ", payoutWalletAddress=" + this.OLrzqt + ", isCurrentPayoutWallet=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.copydefault);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.valueOf);
            parcel.writeString(this.AhwBna);
            parcel.writeString(this.OLrzqt);
            parcel.writeInt(this.AEQbTJ ? 1 : 0);
        }

        public WalletCefiBoundAccount(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.KWHzl = str;
            this.copydefault = str2;
            this.EZpvd = str3;
            this.valueOf = str4;
            this.AhwBna = str5;
            this.OLrzqt = str6;
            this.AEQbTJ = z;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WalletCefiBindingStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ WalletCefiBindingStatus[] $VALUES;
        public static final Activity Companion;
        private final int statusValue;
        public static final WalletCefiBindingStatus CANCEL = new WalletCefiBindingStatus("CANCEL", 0, -1);
        public static final WalletCefiBindingStatus SUCCESS = new WalletCefiBindingStatus("SUCCESS", 1, 0);
        public static final WalletCefiBindingStatus ALREADY_BOUND = new WalletCefiBindingStatus("ALREADY_BOUND", 2, 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ WalletCefiBindingStatus[] $values() {
            return new WalletCefiBindingStatus[]{CANCEL, SUCCESS, ALREADY_BOUND};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<WalletCefiBindingStatus> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getStatusValue() {
            return this.statusValue;
        }

        private WalletCefiBindingStatus(String str, int i, int i2) {
            this.statusValue = i2;
        }

        static {
            WalletCefiBindingStatus[] walletCefiBindingStatusArr$values = $values();
            $VALUES = walletCefiBindingStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(walletCefiBindingStatusArr$values);
            Companion = new Activity(null);
        }

        public static final class Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.WalletCefiBindingService.WalletCefiBindingStatus.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Activity() {
            }

            public final WalletCefiBindingStatus AEQbTJ(int i) {
                for (WalletCefiBindingStatus walletCefiBindingStatus : WalletCefiBindingStatus.values()) {
                    if (walletCefiBindingStatus.getStatusValue() == i) {
                        return walletCefiBindingStatus;
                    }
                }
                return null;
            }
        }

        public static WalletCefiBindingStatus valueOf(String str) {
            return (WalletCefiBindingStatus) Enum.valueOf(WalletCefiBindingStatus.class, str);
        }

        public static WalletCefiBindingStatus[] values() {
            return (WalletCefiBindingStatus[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class FragmentManager {
        public final Source AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, String str, String str2, Source source, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fragmentManager.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = fragmentManager.copydefault;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                source = fragmentManager.AEQbTJ;
            }
            Source source2 = source;
            if ((i & 8) != 0) {
                str3 = fragmentManager.KWHzl;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                str4 = fragmentManager.OLrzqt;
            }
            return fragmentManager.copydefault(str, str5, source2, str6, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Source OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager copydefault(@NotNull String str, @NotNull String str2, @NotNull Source source, @NotNull String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(source, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new FragmentManager(str, str2, source, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FragmentManager)) {
                return false;
            }
            FragmentManager fragmentManager = (FragmentManager) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) fragmentManager.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) fragmentManager.copydefault) && this.AEQbTJ == fragmentManager.AEQbTJ && Intrinsics.EZpvd((Object) this.KWHzl, (Object) fragmentManager.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) fragmentManager.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            int iHashCode3 = this.AEQbTJ.hashCode();
            int iHashCode4 = this.KWHzl.hashCode();
            String str = this.OLrzqt;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WalletCefiBindingConfig(walletAddress=" + this.EZpvd + ", chainId=" + this.copydefault + ", source=" + this.AEQbTJ + ", requestId=" + this.KWHzl + ", redirect=" + this.OLrzqt + ")";
        }

        public FragmentManager(@NotNull String str, @NotNull String str2, @NotNull Source source, @NotNull String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(source, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.EZpvd = str;
            this.copydefault = str2;
            this.AEQbTJ = source;
            this.KWHzl = str3;
            this.OLrzqt = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 com.okinc.wallet.api.WalletCefiBindingService$Source)
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.okinc.wallet.api.WalletCefiBindingService$Source, java.lang.String, java.lang.String):void (m)] (LINE:77) call: com.okinc.wallet.api.WalletCefiBindingService.FragmentManager.<init>(java.lang.String, java.lang.String, com.okinc.wallet.api.WalletCefiBindingService$Source, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ FragmentManager(String str, String str2, Source source, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, source, str3, (i & 16) != 0 ? null : str4);
        }
    }

    public static final class Activity implements RxBus.Application {
        public final String OLrzqt;
        public final Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, Integer num, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                num = activity.copydefault;
            }
            if ((i & 2) != 0) {
                str = activity.OLrzqt;
            }
            return activity.EZpvd(num, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(Integer num, String str) {
            return new Activity(num, str);
        }

        @Override // com.okinc.rxutils.RxBus.Application
        public boolean check(String str) {
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.copydefault;
            int iHashCode = num == null ? 0 : num.hashCode();
            String str = this.OLrzqt;
            return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WalletCeFiBindingEvent(status=" + this.copydefault + ", requestId=" + this.OLrzqt + ")";
        }

        public Activity(Integer num, String str) {
            this.copydefault = num;
            this.OLrzqt = str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Source {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final ActionBar Companion;
        private final String value;
        public static final Source WALLET = new Source("WALLET", 0, "wallet");
        public static final Source NATIVE = new Source("NATIVE", 1, "native");
        public static final Source PLUGIN = new Source("PLUGIN", 2, "plugin");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Source[] $values() {
            return new Source[]{WALLET, NATIVE, PLUGIN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Source> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private Source(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            Source[] sourceArr$values = $values();
            $VALUES = sourceArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(sourceArr$values);
            Companion = new ActionBar(null);
        }

        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.WalletCefiBindingService.Source.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }

            public final Source EZpvd(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                for (Source source : Source.values()) {
                    if (Intrinsics.EZpvd((Object) source.getValue(), (Object) str)) {
                        return source;
                    }
                }
                return null;
            }
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }
}

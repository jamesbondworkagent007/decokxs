package com.okinc.buysell.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class BSCResultButtonActionType implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.data.BSCResultButtonActionType.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BSCResultButtonActionType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BSCResultButtonActionType() {
    }

    public static final class GoToAsset extends BSCResultButtonActionType {
        public static final GoToAsset copydefault = new GoToAsset();
        public static final Parcelable.Creator<GoToAsset> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<GoToAsset> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GoToAsset createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return GoToAsset.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GoToAsset[] newArray(int i) {
                return new GoToAsset[i];
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

        private GoToAsset() {
            super(null);
        }
    }

    public static final class ConvertSuccessDismissButtonBuySell extends BSCResultButtonActionType {
        public static final ConvertSuccessDismissButtonBuySell copydefault = new ConvertSuccessDismissButtonBuySell();
        public static final Parcelable.Creator<ConvertSuccessDismissButtonBuySell> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<ConvertSuccessDismissButtonBuySell> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ConvertSuccessDismissButtonBuySell createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return ConvertSuccessDismissButtonBuySell.copydefault;
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

    public static final class Dismiss extends BSCResultButtonActionType {
        public static final Dismiss copydefault = new Dismiss();
        public static final Parcelable.Creator<Dismiss> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Dismiss> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Dismiss createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Dismiss.copydefault;
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

    public static final class TryAgain extends BSCResultButtonActionType {
        public static final TryAgain EZpvd = new TryAgain();
        public static final Parcelable.Creator<TryAgain> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<TryAgain> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TryAgain createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return TryAgain.EZpvd;
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
}

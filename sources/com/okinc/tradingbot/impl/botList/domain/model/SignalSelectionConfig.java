package com.okinc.tradingbot.impl.botList.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class SignalSelectionConfig implements Parcelable {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.botList.domain.model.SignalSelectionConfig.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SignalSelectionConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SignalSelectionConfig() {
    }

    public static final class SignalTypeSelection extends SignalSelectionConfig {
        public static final Parcelable.Creator<SignalTypeSelection> CREATOR = new Creator();
        public final SignalTypeConfig OLrzqt;

        public static final class Creator implements Parcelable.Creator<SignalTypeSelection> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignalTypeSelection createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SignalTypeSelection(SignalTypeConfig.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignalTypeSelection[] newArray(int i) {
                return new SignalTypeSelection[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SignalTypeSelection copy$default(SignalTypeSelection signalTypeSelection, SignalTypeConfig signalTypeConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                signalTypeConfig = signalTypeSelection.OLrzqt;
            }
            return signalTypeSelection.OLrzqt(signalTypeConfig);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignalTypeConfig AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignalTypeSelection OLrzqt(@NotNull SignalTypeConfig signalTypeConfig) {
            Intrinsics.checkNotNullParameter(signalTypeConfig, "");
            return new SignalTypeSelection(signalTypeConfig);
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
            return (obj instanceof SignalTypeSelection) && Intrinsics.EZpvd(this.OLrzqt, ((SignalTypeSelection) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SignalTypeSelection(config=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this.OLrzqt.writeToParcel(parcel, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignalTypeSelection(@NotNull SignalTypeConfig signalTypeConfig) {
            super(null);
            Intrinsics.checkNotNullParameter(signalTypeConfig, "");
            this.OLrzqt = signalTypeConfig;
        }
    }

    public static final class BacktestFilterSelection extends SignalSelectionConfig {
        public static final Parcelable.Creator<BacktestFilterSelection> CREATOR = new Creator();
        public final BacktestFilterConfig copydefault;

        public static final class Creator implements Parcelable.Creator<BacktestFilterSelection> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BacktestFilterSelection createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new BacktestFilterSelection(BacktestFilterConfig.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BacktestFilterSelection[] newArray(int i) {
                return new BacktestFilterSelection[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ BacktestFilterSelection copy$default(BacktestFilterSelection backtestFilterSelection, BacktestFilterConfig backtestFilterConfig, int i, Object obj) {
            if ((i & 1) != 0) {
                backtestFilterConfig = backtestFilterSelection.copydefault;
            }
            return backtestFilterSelection.OLrzqt(backtestFilterConfig);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BacktestFilterConfig OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BacktestFilterSelection OLrzqt(@NotNull BacktestFilterConfig backtestFilterConfig) {
            Intrinsics.checkNotNullParameter(backtestFilterConfig, "");
            return new BacktestFilterSelection(backtestFilterConfig);
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
            return (obj instanceof BacktestFilterSelection) && Intrinsics.EZpvd(this.copydefault, ((BacktestFilterSelection) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BacktestFilterSelection(config=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this.copydefault.writeToParcel(parcel, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BacktestFilterSelection(@NotNull BacktestFilterConfig backtestFilterConfig) {
            super(null);
            Intrinsics.checkNotNullParameter(backtestFilterConfig, "");
            this.copydefault = backtestFilterConfig;
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.botList.domain.model.SignalSelectionConfig.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ SignalTypeSelection forSignalType$default(TaskDescription taskDescription, int i, SignalType signalType, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                signalType = null;
            }
            return taskDescription.KWHzl(i, signalType);
        }

        public final SignalTypeSelection KWHzl(int i, SignalType signalType) {
            return new SignalTypeSelection(SignalTypeConfig.Companion.AEQbTJ(i, signalType));
        }

        public static /* synthetic */ BacktestFilterSelection forBacktestFilter$default(TaskDescription taskDescription, int i, int i2, int i3, BacktestFilter backtestFilter, int i4, Object obj) {
            if ((i4 & 8) != 0) {
                backtestFilter = null;
            }
            return taskDescription.AEQbTJ(i, i2, i3, backtestFilter);
        }

        public final BacktestFilterSelection AEQbTJ(int i, int i2, int i3, BacktestFilter backtestFilter) {
            return new BacktestFilterSelection(BacktestFilterConfig.Companion.AEQbTJ(i, i2, i3, backtestFilter));
        }
    }
}

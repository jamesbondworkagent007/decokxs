package com.okinc.tradingbot.impl.botList.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C48033uCm;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BacktestFilterConfig implements Parcelable {
    public final BacktestFilter AEQbTJ;
    public final List<SignalSelectionItem<BacktestFilter>> copydefault;
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public static final Parcelable.Creator<BacktestFilterConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BacktestFilterConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BacktestFilterConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SignalSelectionItem.CREATOR.createFromParcel(parcel));
            }
            return new BacktestFilterConfig(arrayList, parcel.readInt() == 0 ? null : BacktestFilter.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BacktestFilterConfig[] newArray(int i) {
            return new BacktestFilterConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.botList.domain.model.BacktestFilterConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BacktestFilterConfig copy$default(BacktestFilterConfig backtestFilterConfig, List list, BacktestFilter backtestFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            list = backtestFilterConfig.copydefault;
        }
        if ((i & 2) != 0) {
            backtestFilter = backtestFilterConfig.AEQbTJ;
        }
        return backtestFilterConfig.OLrzqt(list, backtestFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalSelectionItem<BacktestFilter>> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BacktestFilter OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BacktestFilterConfig OLrzqt(@NotNull List<SignalSelectionItem<BacktestFilter>> list, BacktestFilter backtestFilter) {
        Intrinsics.checkNotNullParameter(list, "");
        return new BacktestFilterConfig(list, backtestFilter);
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
        if (!(obj instanceof BacktestFilterConfig)) {
            return false;
        }
        BacktestFilterConfig backtestFilterConfig = (BacktestFilterConfig) obj;
        return Intrinsics.EZpvd(this.copydefault, backtestFilterConfig.copydefault) && this.AEQbTJ == backtestFilterConfig.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        BacktestFilter backtestFilter = this.AEQbTJ;
        return (iHashCode * 31) + (backtestFilter == null ? 0 : backtestFilter.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BacktestFilterConfig(items=" + this.copydefault + ", selectedId=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<SignalSelectionItem<BacktestFilter>> list = this.copydefault;
        parcel.writeInt(list.size());
        Iterator<SignalSelectionItem<BacktestFilter>> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        BacktestFilter backtestFilter = this.AEQbTJ;
        if (backtestFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(backtestFilter.name());
        }
    }

    public BacktestFilterConfig(@NotNull List<SignalSelectionItem<BacktestFilter>> list, BacktestFilter backtestFilter) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.AEQbTJ = backtestFilter;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.botList.domain.model.BacktestFilterConfig.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ BacktestFilterConfig create$default(Application application, int i, int i2, int i3, BacktestFilter backtestFilter, int i4, Object obj) {
            if ((i4 & 8) != 0) {
                backtestFilter = null;
            }
            return application.AEQbTJ(i, i2, i3, backtestFilter);
        }

        public final BacktestFilterConfig AEQbTJ(int i, int i2, int i3, BacktestFilter backtestFilter) {
            return new BacktestFilterConfig(yDY.gEmmrt(new SignalSelectionItem(BacktestFilter.ALL, C33070mpX.AYXKKw(C48033uCm.Fragment.AwvSrB), Integer.valueOf(i)), new SignalSelectionItem(BacktestFilter.RUNNING, C33070mpX.AYXKKw(C48033uCm.Fragment.gHZMYf), Integer.valueOf(i2)), new SignalSelectionItem(BacktestFilter.COMPLETED, C33070mpX.AYXKKw(C48033uCm.Fragment.sSMYrx), Integer.valueOf(i3))), backtestFilter);
        }
    }
}

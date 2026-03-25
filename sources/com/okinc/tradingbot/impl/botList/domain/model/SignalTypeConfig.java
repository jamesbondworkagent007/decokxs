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
public final class SignalTypeConfig implements Parcelable {
    public final List<SignalSelectionItem<SignalType>> AEQbTJ;
    public final SignalType KWHzl;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public static final Parcelable.Creator<SignalTypeConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SignalTypeConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalTypeConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SignalSelectionItem.CREATOR.createFromParcel(parcel));
            }
            return new SignalTypeConfig(arrayList, parcel.readInt() == 0 ? null : SignalType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalTypeConfig[] newArray(int i) {
            return new SignalTypeConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.botList.domain.model.SignalTypeConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalTypeConfig copy$default(SignalTypeConfig signalTypeConfig, List list, SignalType signalType, int i, Object obj) {
        if ((i & 1) != 0) {
            list = signalTypeConfig.AEQbTJ;
        }
        if ((i & 2) != 0) {
            signalType = signalTypeConfig.KWHzl;
        }
        return signalTypeConfig.KWHzl(list, signalType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalTypeConfig KWHzl(@NotNull List<SignalSelectionItem<SignalType>> list, SignalType signalType) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SignalTypeConfig(list, signalType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalSelectionItem<SignalType>> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalType copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof SignalTypeConfig)) {
            return false;
        }
        SignalTypeConfig signalTypeConfig = (SignalTypeConfig) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, signalTypeConfig.AEQbTJ) && this.KWHzl == signalTypeConfig.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        SignalType signalType = this.KWHzl;
        return (iHashCode * 31) + (signalType == null ? 0 : signalType.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalTypeConfig(items=" + this.AEQbTJ + ", selectedId=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<SignalSelectionItem<SignalType>> list = this.AEQbTJ;
        parcel.writeInt(list.size());
        Iterator<SignalSelectionItem<SignalType>> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        SignalType signalType = this.KWHzl;
        if (signalType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(signalType.name());
        }
    }

    public SignalTypeConfig(@NotNull List<SignalSelectionItem<SignalType>> list, SignalType signalType) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        this.KWHzl = signalType;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.botList.domain.model.SignalTypeConfig.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ SignalTypeConfig create$default(TaskDescription taskDescription, int i, SignalType signalType, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                signalType = null;
            }
            return taskDescription.AEQbTJ(i, signalType);
        }

        public final SignalTypeConfig AEQbTJ(int i, SignalType signalType) {
            return new SignalTypeConfig(yDY.gEmmrt(new SignalSelectionItem(SignalType.AI_BACKTESTS, C33070mpX.AYXKKw(C48033uCm.Fragment.AxsJAY), Integer.valueOf(i)), new SignalSelectionItem(SignalType.BOT_SIGNALS, C33070mpX.AYXKKw(C48033uCm.Fragment.zuBGHE), null, 4, null)), signalType);
        }
    }
}

package com.okinc.tradingbot.impl.strategy.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SignalTriggerCard implements Parcelable {
    public static final Parcelable.Creator<SignalTriggerCard> CREATOR = new Creator();
    public final List<SignalTriggerData> EZpvd;
    public final boolean copydefault;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SignalTriggerCard> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalTriggerCard createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SignalTriggerData.CREATOR.createFromParcel(parcel));
            }
            return new SignalTriggerCard(arrayList, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalTriggerCard[] newArray(int i) {
            return new SignalTriggerCard[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.strategy.bean.SignalTriggerCard */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalTriggerCard copy$default(SignalTriggerCard signalTriggerCard, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = signalTriggerCard.EZpvd;
        }
        if ((i & 2) != 0) {
            z = signalTriggerCard.copydefault;
        }
        return signalTriggerCard.KWHzl(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalTriggerCard KWHzl(@NotNull List<SignalTriggerData> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SignalTriggerCard(list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalTriggerData> copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof SignalTriggerCard)) {
            return false;
        }
        SignalTriggerCard signalTriggerCard = (SignalTriggerCard) obj;
        return Intrinsics.EZpvd(this.EZpvd, signalTriggerCard.EZpvd) && this.copydefault == signalTriggerCard.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalTriggerCard(triggerList=" + this.EZpvd + ", checkAll=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<SignalTriggerData> list = this.EZpvd;
        parcel.writeInt(list.size());
        Iterator<SignalTriggerData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.copydefault ? 1 : 0);
    }

    public SignalTriggerCard(@NotNull List<SignalTriggerData> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
        this.copydefault = z;
    }
}

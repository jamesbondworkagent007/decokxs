package com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotExplainGatherData implements Parcelable {
    public static final Parcelable.Creator<BotExplainGatherData> CREATOR = new Creator();
    public final String AEQbTJ;
    public final ArrayList<ExplainItemModel> copydefault;

    public static final class Creator implements Parcelable.Creator<BotExplainGatherData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotExplainGatherData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ExplainItemModel.CREATOR.createFromParcel(parcel));
            }
            return new BotExplainGatherData(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotExplainGatherData[] newArray(int i) {
            return new BotExplainGatherData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.BotExplainGatherData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotExplainGatherData copy$default(BotExplainGatherData botExplainGatherData, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botExplainGatherData.AEQbTJ;
        }
        if ((i & 2) != 0) {
            arrayList = botExplainGatherData.copydefault;
        }
        return botExplainGatherData.AEQbTJ(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotExplainGatherData AEQbTJ(@NotNull String str, @NotNull ArrayList<ExplainItemModel> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new BotExplainGatherData(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ExplainItemModel> KWHzl() {
        return this.copydefault;
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
        if (!(obj instanceof BotExplainGatherData)) {
            return false;
        }
        BotExplainGatherData botExplainGatherData = (BotExplainGatherData) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) botExplainGatherData.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, botExplainGatherData.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotExplainGatherData(explainTitle=" + this.AEQbTJ + ", explainItems=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        ArrayList<ExplainItemModel> arrayList = this.copydefault;
        parcel.writeInt(arrayList.size());
        Iterator<ExplainItemModel> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public BotExplainGatherData(@NotNull String str, @NotNull ArrayList<ExplainItemModel> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.AEQbTJ = str;
        this.copydefault = arrayList;
    }
}

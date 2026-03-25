package com.okinc.tradingbot.impl.order.strategy.signalbot.ui.itembinder;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SignalBotConfirmData implements Parcelable {
    public static final Parcelable.Creator<SignalBotConfirmData> CREATOR = new Creator();
    public final List<String> OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<SignalBotConfirmData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotConfirmData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalBotConfirmData(parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotConfirmData[] newArray(int i) {
            return new SignalBotConfirmData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.order.strategy.signalbot.ui.itembinder.SignalBotConfirmData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalBotConfirmData copy$default(SignalBotConfirmData signalBotConfirmData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signalBotConfirmData.copydefault;
        }
        if ((i & 2) != 0) {
            list = signalBotConfirmData.OLrzqt;
        }
        return signalBotConfirmData.AEQbTJ(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalBotConfirmData AEQbTJ(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SignalBotConfirmData(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
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
        if (!(obj instanceof SignalBotConfirmData)) {
            return false;
        }
        SignalBotConfirmData signalBotConfirmData = (SignalBotConfirmData) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) signalBotConfirmData.copydefault) && Intrinsics.EZpvd(this.OLrzqt, signalBotConfirmData.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalBotConfirmData(title=" + this.copydefault + ", ccyList=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeStringList(this.OLrzqt);
    }

    public SignalBotConfirmData(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = str;
        this.OLrzqt = list;
    }
}

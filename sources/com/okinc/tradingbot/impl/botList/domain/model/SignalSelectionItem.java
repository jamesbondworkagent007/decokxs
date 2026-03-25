package com.okinc.tradingbot.impl.botList.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.Enum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalSelectionItem<T extends Enum<T>> implements Parcelable {
    public static final Parcelable.Creator<SignalSelectionItem<?>> CREATOR = new Creator();
    public final Integer KWHzl;
    public final String OLrzqt;
    public final T copydefault;

    public static final class Creator implements Parcelable.Creator<SignalSelectionItem<?>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalSelectionItem<?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalSelectionItem<>((Enum) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalSelectionItem<?>[] newArray(int i) {
            return new SignalSelectionItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.botList.domain.model.SignalSelectionItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalSelectionItem copy$default(SignalSelectionItem signalSelectionItem, Enum r1, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            r1 = signalSelectionItem.copydefault;
        }
        if ((i & 2) != 0) {
            str = signalSelectionItem.OLrzqt;
        }
        if ((i & 4) != 0) {
            num = signalSelectionItem.KWHzl;
        }
        return signalSelectionItem.OLrzqt(r1, str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalSelectionItem<T> OLrzqt(@NotNull T t, @NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new SignalSelectionItem<>(t, str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof SignalSelectionItem)) {
            return false;
        }
        SignalSelectionItem signalSelectionItem = (SignalSelectionItem) obj;
        return Intrinsics.EZpvd(this.copydefault, signalSelectionItem.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) signalSelectionItem.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, signalSelectionItem.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        Integer num = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalSelectionItem(id=" + this.copydefault + ", label=" + this.OLrzqt + ", count=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeSerializable(this.copydefault);
        parcel.writeString(this.OLrzqt);
        Integer num = this.KWHzl;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public SignalSelectionItem(@NotNull T t, @NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = t;
        this.OLrzqt = str;
        this.KWHzl = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Enum)
  (r2v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(T extends java.lang.Enum<T>, java.lang.String, java.lang.Integer):void (m)] (LINE:41) call: com.okinc.tradingbot.impl.botList.domain.model.SignalSelectionItem.<init>(java.lang.Enum, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ SignalSelectionItem(Enum r1, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, str, (i & 4) != 0 ? null : num);
    }
}

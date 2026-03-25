package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class EnableState implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EnableState[] $VALUES;
    public static final Parcelable.Creator<EnableState> CREATOR;
    public static final EnableState ABLE_SELECT = new EnableState("ABLE_SELECT", 0);
    public static final EnableState ABLE_UNSELECT = new EnableState("ABLE_UNSELECT", 1);
    public static final EnableState DISABLE_SELECT = new EnableState("DISABLE_SELECT", 2);
    public static final EnableState DISABLE_UNSELECT = new EnableState("DISABLE_UNSELECT", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EnableState[] $values() {
        return new EnableState[]{ABLE_SELECT, ABLE_UNSELECT, DISABLE_SELECT, DISABLE_UNSELECT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EnableState> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private EnableState(String str, int i) {
    }

    static {
        EnableState[] enableStateArr$values = $values();
        $VALUES = enableStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(enableStateArr$values);
        CREATOR = new Parcelable.Creator<EnableState>() { // from class: com.okinc.unify_trade.bot.data.EnableState.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EnableState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return EnableState.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EnableState[] newArray(int i) {
                return new EnableState[i];
            }
        };
    }

    public static EnableState valueOf(String str) {
        return (EnableState) Enum.valueOf(EnableState.class, str);
    }

    public static EnableState[] values() {
        return (EnableState[]) $VALUES.clone();
    }
}

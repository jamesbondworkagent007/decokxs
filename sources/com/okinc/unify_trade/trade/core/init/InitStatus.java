package com.okinc.unify_trade.trade.core.init;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class InitStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InitStatus[] $VALUES;
    public static final Parcelable.Creator<InitStatus> CREATOR;
    public static final InitStatus LOADING = new InitStatus("LOADING", 0);
    public static final InitStatus SUCCESS = new InitStatus("SUCCESS", 1);
    public static final InitStatus FAILURE = new InitStatus("FAILURE", 2);
    public static final InitStatus UNINIT = new InitStatus("UNINIT", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InitStatus[] $values() {
        return new InitStatus[]{LOADING, SUCCESS, FAILURE, UNINIT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InitStatus> getEntries() {
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

    private InitStatus(String str, int i) {
    }

    static {
        InitStatus[] initStatusArr$values = $values();
        $VALUES = initStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(initStatusArr$values);
        CREATOR = new Parcelable.Creator<InitStatus>() { // from class: com.okinc.unify_trade.trade.core.init.InitStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return InitStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitStatus[] newArray(int i) {
                return new InitStatus[i];
            }
        };
    }

    public static InitStatus valueOf(String str) {
        return (InitStatus) Enum.valueOf(InitStatus.class, str);
    }

    public static InitStatus[] values() {
        return (InitStatus[]) $VALUES.clone();
    }
}

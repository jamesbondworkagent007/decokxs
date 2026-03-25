package com.okinc.okx.paymentapi.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class BSCLevel implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BSCLevel[] $VALUES;
    public static final Parcelable.Creator<BSCLevel> CREATOR;
    public static final BSCLevel LEVEL1 = new BSCLevel("LEVEL1", 0);
    public static final BSCLevel LEVEL2 = new BSCLevel("LEVEL2", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BSCLevel[] $values() {
        return new BSCLevel[]{LEVEL1, LEVEL2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BSCLevel> getEntries() {
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

    private BSCLevel(String str, int i) {
    }

    static {
        BSCLevel[] bSCLevelArr$values = $values();
        $VALUES = bSCLevelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bSCLevelArr$values);
        CREATOR = new Parcelable.Creator<BSCLevel>() { // from class: com.okinc.okx.paymentapi.presentation.BSCLevel.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BSCLevel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return BSCLevel.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BSCLevel[] newArray(int i) {
                return new BSCLevel[i];
            }
        };
    }

    public static BSCLevel valueOf(String str) {
        return (BSCLevel) Enum.valueOf(BSCLevel.class, str);
    }

    public static BSCLevel[] values() {
        return (BSCLevel[]) $VALUES.clone();
    }
}

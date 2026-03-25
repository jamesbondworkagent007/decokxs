package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class ThemeType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ThemeType[] $VALUES;
    public static final Parcelable.Creator<ThemeType> CREATOR;
    public static final ThemeType NIGHT = new ThemeType("NIGHT", 0);
    public static final ThemeType DEFAULT = new ThemeType("DEFAULT", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ThemeType[] $values() {
        return new ThemeType[]{NIGHT, DEFAULT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ThemeType> getEntries() {
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

    private ThemeType(String str, int i) {
    }

    static {
        ThemeType[] themeTypeArr$values = $values();
        $VALUES = themeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(themeTypeArr$values);
        CREATOR = new Parcelable.Creator<ThemeType>() { // from class: com.okinc.wallet.api.bean.ThemeType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ThemeType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ThemeType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ThemeType[] newArray(int i) {
                return new ThemeType[i];
            }
        };
    }

    public static ThemeType valueOf(String str) {
        return (ThemeType) Enum.valueOf(ThemeType.class, str);
    }

    public static ThemeType[] values() {
        return (ThemeType[]) $VALUES.clone();
    }
}

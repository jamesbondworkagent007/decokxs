package com.okinc.auth.impl.passkey.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class ButtonType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ButtonType[] $VALUES;
    public static final Parcelable.Creator<ButtonType> CREATOR;
    public static final ButtonType REMOVE_RENAME = new ButtonType("REMOVE_RENAME", 0);
    public static final ButtonType RESET_RENAME = new ButtonType("RESET_RENAME", 1);
    public static final ButtonType RENAME = new ButtonType("RENAME", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ButtonType[] $values() {
        return new ButtonType[]{REMOVE_RENAME, RESET_RENAME, RENAME};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ButtonType> getEntries() {
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

    private ButtonType(String str, int i) {
    }

    static {
        ButtonType[] buttonTypeArr$values = $values();
        $VALUES = buttonTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(buttonTypeArr$values);
        CREATOR = new Parcelable.Creator<ButtonType>() { // from class: com.okinc.auth.impl.passkey.model.ButtonType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ButtonType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ButtonType[] newArray(int i) {
                return new ButtonType[i];
            }
        };
    }

    public static ButtonType valueOf(String str) {
        return (ButtonType) Enum.valueOf(ButtonType.class, str);
    }

    public static ButtonType[] values() {
        return (ButtonType[]) $VALUES.clone();
    }
}

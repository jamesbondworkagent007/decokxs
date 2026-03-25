package com.okinc.im.imui.sticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class SettingsAction implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SettingsAction[] $VALUES;
    public static final Parcelable.Creator<SettingsAction> CREATOR;
    public static final SettingsAction Idle = new SettingsAction("Idle", 0);
    public static final SettingsAction RemoveStickers = new SettingsAction("RemoveStickers", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SettingsAction[] $values() {
        return new SettingsAction[]{Idle, RemoveStickers};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SettingsAction> getEntries() {
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

    private SettingsAction(String str, int i) {
    }

    static {
        SettingsAction[] settingsActionArr$values = $values();
        $VALUES = settingsActionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(settingsActionArr$values);
        CREATOR = new Parcelable.Creator<SettingsAction>() { // from class: com.okinc.im.imui.sticker.model.SettingsAction.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SettingsAction createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return SettingsAction.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SettingsAction[] newArray(int i) {
                return new SettingsAction[i];
            }
        };
    }

    public static SettingsAction valueOf(String str) {
        return (SettingsAction) Enum.valueOf(SettingsAction.class, str);
    }

    public static SettingsAction[] values() {
        return (SettingsAction[]) $VALUES.clone();
    }
}

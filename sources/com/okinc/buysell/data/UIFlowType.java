package com.okinc.buysell.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class UIFlowType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UIFlowType[] $VALUES;
    public static final Parcelable.Creator<UIFlowType> CREATOR;
    public static final UIFlowType SIMPLE_MODE = new UIFlowType("SIMPLE_MODE", 0);
    public static final UIFlowType DEFAULT = new UIFlowType("DEFAULT", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UIFlowType[] $values() {
        return new UIFlowType[]{SIMPLE_MODE, DEFAULT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UIFlowType> getEntries() {
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

    private UIFlowType(String str, int i) {
    }

    static {
        UIFlowType[] uIFlowTypeArr$values = $values();
        $VALUES = uIFlowTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(uIFlowTypeArr$values);
        CREATOR = new Parcelable.Creator<UIFlowType>() { // from class: com.okinc.buysell.data.UIFlowType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UIFlowType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return UIFlowType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UIFlowType[] newArray(int i) {
                return new UIFlowType[i];
            }
        };
    }

    public static UIFlowType valueOf(String str) {
        return (UIFlowType) Enum.valueOf(UIFlowType.class, str);
    }

    public static UIFlowType[] values() {
        return (UIFlowType[]) $VALUES.clone();
    }
}

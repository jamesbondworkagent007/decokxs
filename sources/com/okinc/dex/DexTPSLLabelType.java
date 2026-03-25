package com.okinc.dex;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class DexTPSLLabelType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ DexTPSLLabelType[] $VALUES;
    public static final Parcelable.Creator<DexTPSLLabelType> CREATOR;
    public static final DexTPSLLabelType TP = new DexTPSLLabelType("TP", 0);
    public static final DexTPSLLabelType SL = new DexTPSLLabelType("SL", 1);
    public static final DexTPSLLabelType BUY = new DexTPSLLabelType("BUY", 2);
    public static final DexTPSLLabelType SELL = new DexTPSLLabelType("SELL", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ DexTPSLLabelType[] $values() {
        return new DexTPSLLabelType[]{TP, SL, BUY, SELL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<DexTPSLLabelType> getEntries() {
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

    private DexTPSLLabelType(String str, int i) {
    }

    static {
        DexTPSLLabelType[] dexTPSLLabelTypeArr$values = $values();
        $VALUES = dexTPSLLabelTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(dexTPSLLabelTypeArr$values);
        CREATOR = new Parcelable.Creator<DexTPSLLabelType>() { // from class: com.okinc.dex.DexTPSLLabelType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DexTPSLLabelType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return DexTPSLLabelType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DexTPSLLabelType[] newArray(int i) {
                return new DexTPSLLabelType[i];
            }
        };
    }

    public static DexTPSLLabelType valueOf(String str) {
        return (DexTPSLLabelType) Enum.valueOf(DexTPSLLabelType.class, str);
    }

    public static DexTPSLLabelType[] values() {
        return (DexTPSLLabelType[]) $VALUES.clone();
    }
}

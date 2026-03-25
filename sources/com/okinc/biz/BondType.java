package com.okinc.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class BondType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BondType[] $VALUES;
    public static final Parcelable.Creator<BondType> CREATOR;
    public static final BondType CROSS_MARGIN = new BondType("CROSS_MARGIN", 0);
    public static final BondType FIXED_MARGIN = new BondType("FIXED_MARGIN", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BondType[] $values() {
        return new BondType[]{CROSS_MARGIN, FIXED_MARGIN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BondType> getEntries() {
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

    private BondType(String str, int i) {
    }

    static {
        BondType[] bondTypeArr$values = $values();
        $VALUES = bondTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bondTypeArr$values);
        CREATOR = new Parcelable.Creator<BondType>() { // from class: com.okinc.biz.BondType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BondType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return BondType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BondType[] newArray(int i) {
                return new BondType[i];
            }
        };
    }

    public static BondType valueOf(String str) {
        return (BondType) Enum.valueOf(BondType.class, str);
    }

    public static BondType[] values() {
        return (BondType[]) $VALUES.clone();
    }
}

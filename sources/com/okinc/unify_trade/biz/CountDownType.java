package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class CountDownType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CountDownType[] $VALUES;
    public static final Parcelable.Creator<CountDownType> CREATOR;
    public static final CountDownType SHOW_COUNT_DOWN = new CountDownType("SHOW_COUNT_DOWN", 0);
    public static final CountDownType SHOW_EXPECT = new CountDownType("SHOW_EXPECT", 1);
    public static final CountDownType SHOW_CANCEL = new CountDownType("SHOW_CANCEL", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CountDownType[] $values() {
        return new CountDownType[]{SHOW_COUNT_DOWN, SHOW_EXPECT, SHOW_CANCEL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CountDownType> getEntries() {
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

    private CountDownType(String str, int i) {
    }

    static {
        CountDownType[] countDownTypeArr$values = $values();
        $VALUES = countDownTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(countDownTypeArr$values);
        CREATOR = new Parcelable.Creator<CountDownType>() { // from class: com.okinc.unify_trade.biz.CountDownType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CountDownType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return CountDownType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CountDownType[] newArray(int i) {
                return new CountDownType[i];
            }
        };
    }

    public static CountDownType valueOf(String str) {
        return (CountDownType) Enum.valueOf(CountDownType.class, str);
    }

    public static CountDownType[] values() {
        return (CountDownType[]) $VALUES.clone();
    }
}

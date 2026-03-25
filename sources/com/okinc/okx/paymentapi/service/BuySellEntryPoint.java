package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class BuySellEntryPoint implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BuySellEntryPoint[] $VALUES;
    public static final Parcelable.Creator<BuySellEntryPoint> CREATOR;
    public static final BuySellEntryPoint PRO = new BuySellEntryPoint("PRO", 0, "pro");
    private final String entry;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BuySellEntryPoint[] $values() {
        return new BuySellEntryPoint[]{PRO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BuySellEntryPoint> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntry() {
        return this.entry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private BuySellEntryPoint(String str, int i, String str2) {
        this.entry = str2;
    }

    static {
        BuySellEntryPoint[] buySellEntryPointArr$values = $values();
        $VALUES = buySellEntryPointArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(buySellEntryPointArr$values);
        CREATOR = new Parcelable.Creator<BuySellEntryPoint>() { // from class: com.okinc.okx.paymentapi.service.BuySellEntryPoint.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BuySellEntryPoint createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return BuySellEntryPoint.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BuySellEntryPoint[] newArray(int i) {
                return new BuySellEntryPoint[i];
            }
        };
    }

    public static BuySellEntryPoint valueOf(String str) {
        return (BuySellEntryPoint) Enum.valueOf(BuySellEntryPoint.class, str);
    }

    public static BuySellEntryPoint[] values() {
        return (BuySellEntryPoint[]) $VALUES.clone();
    }
}

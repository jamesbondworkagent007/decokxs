package com.okinc.okassetslite.api.assets_lite_api.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class EarnUIGroup implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ EarnUIGroup[] $VALUES;
    public static final Parcelable.Creator<EarnUIGroup> CREATOR;
    private final int group;
    public static final EarnUIGroup NO_AVAIL_EARN_PRODUCT = new EarnUIGroup("NO_AVAIL_EARN_PRODUCT", 0, 1);
    public static final EarnUIGroup TRY_EARN = new EarnUIGroup("TRY_EARN", 1, 2);
    public static final EarnUIGroup USDG_EARN = new EarnUIGroup("USDG_EARN", 2, 3);
    public static final EarnUIGroup CRYPTO_EARN = new EarnUIGroup("CRYPTO_EARN", 3, 4);
    public static final EarnUIGroup LIQUIDITY_STAKING = new EarnUIGroup("LIQUIDITY_STAKING", 4, 5);
    public static final EarnUIGroup BUIDL_EARN = new EarnUIGroup("BUIDL_EARN", 5, 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ EarnUIGroup[] $values() {
        return new EarnUIGroup[]{NO_AVAIL_EARN_PRODUCT, TRY_EARN, USDG_EARN, CRYPTO_EARN, LIQUIDITY_STAKING, BUIDL_EARN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<EarnUIGroup> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGroup() {
        return this.group;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private EarnUIGroup(String str, int i, int i2) {
        this.group = i2;
    }

    static {
        EarnUIGroup[] earnUIGroupArr$values = $values();
        $VALUES = earnUIGroupArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(earnUIGroupArr$values);
        CREATOR = new Parcelable.Creator<EarnUIGroup>() { // from class: com.okinc.okassetslite.api.assets_lite_api.common.model.EarnUIGroup.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EarnUIGroup createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return EarnUIGroup.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EarnUIGroup[] newArray(int i) {
                return new EarnUIGroup[i];
            }
        };
    }

    public static EarnUIGroup valueOf(String str) {
        return (EarnUIGroup) Enum.valueOf(EarnUIGroup.class, str);
    }

    public static EarnUIGroup[] values() {
        return (EarnUIGroup[]) $VALUES.clone();
    }
}

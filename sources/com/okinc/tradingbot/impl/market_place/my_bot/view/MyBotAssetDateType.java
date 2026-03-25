package com.okinc.tradingbot.impl.market_place.my_bot.view;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class MyBotAssetDateType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MyBotAssetDateType[] $VALUES;
    public static final Parcelable.Creator<MyBotAssetDateType> CREATOR;
    private final String type;
    public static final MyBotAssetDateType ONE_DAY = new MyBotAssetDateType("ONE_DAY", 0, "1d");
    public static final MyBotAssetDateType ONE_WEEK = new MyBotAssetDateType("ONE_WEEK", 1, "1w");
    public static final MyBotAssetDateType ONE_MONTH = new MyBotAssetDateType("ONE_MONTH", 2, "1m");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MyBotAssetDateType[] $values() {
        return new MyBotAssetDateType[]{ONE_DAY, ONE_WEEK, ONE_MONTH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MyBotAssetDateType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private MyBotAssetDateType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        MyBotAssetDateType[] myBotAssetDateTypeArr$values = $values();
        $VALUES = myBotAssetDateTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(myBotAssetDateTypeArr$values);
        CREATOR = new Parcelable.Creator<MyBotAssetDateType>() { // from class: com.okinc.tradingbot.impl.market_place.my_bot.view.MyBotAssetDateType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MyBotAssetDateType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return MyBotAssetDateType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MyBotAssetDateType[] newArray(int i) {
                return new MyBotAssetDateType[i];
            }
        };
    }

    public final String getXAxisString() {
        String str = this.type;
        return Intrinsics.EZpvd((Object) str, (Object) ONE_DAY.type) ? C33070mpX.AYXKKw(C55688xof.Application.onComplete) : Intrinsics.EZpvd((Object) str, (Object) ONE_WEEK.type) ? C33070mpX.AYXKKw(C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegate) : Intrinsics.EZpvd((Object) str, (Object) ONE_MONTH.type) ? C33070mpX.AYXKKw(C55688xof.Application.onClick) : "";
    }

    public static MyBotAssetDateType valueOf(String str) {
        return (MyBotAssetDateType) Enum.valueOf(MyBotAssetDateType.class, str);
    }

    public static MyBotAssetDateType[] values() {
        return (MyBotAssetDateType[]) $VALUES.clone();
    }
}

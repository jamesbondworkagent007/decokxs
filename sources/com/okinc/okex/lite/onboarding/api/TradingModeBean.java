package com.okinc.okex.lite.onboarding.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class TradingModeBean implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradingModeBean[] $VALUES;
    public static final Parcelable.Creator<TradingModeBean> CREATOR;
    private final String value;
    public static final TradingModeBean SIMPLE = new TradingModeBean("SIMPLE", 0, "SIMPLE");
    public static final TradingModeBean ADVANCED = new TradingModeBean("ADVANCED", 1, "ADVANCED");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradingModeBean[] $values() {
        return new TradingModeBean[]{SIMPLE, ADVANCED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradingModeBean> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private TradingModeBean(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        TradingModeBean[] tradingModeBeanArr$values = $values();
        $VALUES = tradingModeBeanArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradingModeBeanArr$values);
        CREATOR = new Parcelable.Creator<TradingModeBean>() { // from class: com.okinc.okex.lite.onboarding.api.TradingModeBean.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TradingModeBean createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TradingModeBean.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TradingModeBean[] newArray(int i) {
                return new TradingModeBean[i];
            }
        };
    }

    public static TradingModeBean valueOf(String str) {
        return (TradingModeBean) Enum.valueOf(TradingModeBean.class, str);
    }

    public static TradingModeBean[] values() {
        return (TradingModeBean[]) $VALUES.clone();
    }
}

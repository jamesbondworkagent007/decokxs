package com.okinc.okex.lite.home.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class AssetChartSource implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AssetChartSource[] $VALUES;
    public static final Parcelable.Creator<AssetChartSource> CREATOR;
    public static final AssetChartSource SIMPLE_HOME = new AssetChartSource("SIMPLE_HOME", 0);
    public static final AssetChartSource SIMPLE_PORTFOLIO = new AssetChartSource("SIMPLE_PORTFOLIO", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AssetChartSource[] $values() {
        return new AssetChartSource[]{SIMPLE_HOME, SIMPLE_PORTFOLIO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AssetChartSource> getEntries() {
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

    private AssetChartSource(String str, int i) {
    }

    static {
        AssetChartSource[] assetChartSourceArr$values = $values();
        $VALUES = assetChartSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(assetChartSourceArr$values);
        CREATOR = new Parcelable.Creator<AssetChartSource>() { // from class: com.okinc.okex.lite.home.bean.AssetChartSource.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AssetChartSource createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return AssetChartSource.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AssetChartSource[] newArray(int i) {
                return new AssetChartSource[i];
            }
        };
    }

    public static AssetChartSource valueOf(String str) {
        return (AssetChartSource) Enum.valueOf(AssetChartSource.class, str);
    }

    public static AssetChartSource[] values() {
        return (AssetChartSource[]) $VALUES.clone();
    }
}

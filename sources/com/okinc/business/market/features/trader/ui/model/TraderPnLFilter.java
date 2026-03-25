package com.okinc.business.market.features.trader.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TraderPnLFilter implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TraderPnLFilter[] $VALUES;
    public static final Parcelable.Creator<TraderPnLFilter> CREATOR;
    private final int title;
    public static final TraderPnLFilter TOTAL = new TraderPnLFilter("TOTAL", 0, C23274hvD.Fragment.getFullyDrawnReporter);
    public static final TraderPnLFilter REALIZED = new TraderPnLFilter("REALIZED", 1, C23274hvD.Fragment.OmPrLP);
    public static final TraderPnLFilter UNREALIZED = new TraderPnLFilter("UNREALIZED", 2, C23274hvD.Fragment.RYPzIz);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TraderPnLFilter[] $values() {
        return new TraderPnLFilter[]{TOTAL, REALIZED, UNREALIZED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TraderPnLFilter> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private TraderPnLFilter(String str, int i, int i2) {
        this.title = i2;
    }

    static {
        TraderPnLFilter[] traderPnLFilterArr$values = $values();
        $VALUES = traderPnLFilterArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(traderPnLFilterArr$values);
        CREATOR = new Parcelable.Creator<TraderPnLFilter>() { // from class: com.okinc.business.market.features.trader.ui.model.TraderPnLFilter.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TraderPnLFilter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TraderPnLFilter.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TraderPnLFilter[] newArray(int i) {
                return new TraderPnLFilter[i];
            }
        };
    }

    public static TraderPnLFilter valueOf(String str) {
        return (TraderPnLFilter) Enum.valueOf(TraderPnLFilter.class, str);
    }

    public static TraderPnLFilter[] values() {
        return (TraderPnLFilter[]) $VALUES.clone();
    }
}

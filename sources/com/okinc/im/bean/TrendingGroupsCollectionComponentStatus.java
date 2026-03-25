package com.okinc.im.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import com.reown.android.pulse.model.EventType;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class TrendingGroupsCollectionComponentStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TrendingGroupsCollectionComponentStatus[] $VALUES;
    public static final Parcelable.Creator<TrendingGroupsCollectionComponentStatus> CREATOR;
    private final String value;
    public static final TrendingGroupsCollectionComponentStatus ERROR = new TrendingGroupsCollectionComponentStatus(EventType.ERROR, 0, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
    public static final TrendingGroupsCollectionComponentStatus EMPTY = new TrendingGroupsCollectionComponentStatus("EMPTY", 1, "empty");
    public static final TrendingGroupsCollectionComponentStatus NORMAL = new TrendingGroupsCollectionComponentStatus("NORMAL", 2, "normal");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TrendingGroupsCollectionComponentStatus[] $values() {
        return new TrendingGroupsCollectionComponentStatus[]{ERROR, EMPTY, NORMAL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TrendingGroupsCollectionComponentStatus> getEntries() {
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

    private TrendingGroupsCollectionComponentStatus(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        TrendingGroupsCollectionComponentStatus[] trendingGroupsCollectionComponentStatusArr$values = $values();
        $VALUES = trendingGroupsCollectionComponentStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(trendingGroupsCollectionComponentStatusArr$values);
        CREATOR = new Parcelable.Creator<TrendingGroupsCollectionComponentStatus>() { // from class: com.okinc.im.bean.TrendingGroupsCollectionComponentStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TrendingGroupsCollectionComponentStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TrendingGroupsCollectionComponentStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TrendingGroupsCollectionComponentStatus[] newArray(int i) {
                return new TrendingGroupsCollectionComponentStatus[i];
            }
        };
    }

    public static TrendingGroupsCollectionComponentStatus valueOf(String str) {
        return (TrendingGroupsCollectionComponentStatus) Enum.valueOf(TrendingGroupsCollectionComponentStatus.class, str);
    }

    public static TrendingGroupsCollectionComponentStatus[] values() {
        return (TrendingGroupsCollectionComponentStatus[]) $VALUES.clone();
    }
}

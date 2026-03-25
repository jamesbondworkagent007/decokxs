package com.okinc.business.defi.wallet.mine.search.domain.type;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class SearchSortType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SearchSortType[] $VALUES;
    public static final Parcelable.Creator<SearchSortType> CREATOR;
    public static final SearchSortType DEFAULT = new SearchSortType("DEFAULT", 0);
    public static final SearchSortType TURNOVER = new SearchSortType("TURNOVER", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SearchSortType[] $values() {
        return new SearchSortType[]{DEFAULT, TURNOVER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SearchSortType> getEntries() {
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

    private SearchSortType(String str, int i) {
    }

    static {
        SearchSortType[] searchSortTypeArr$values = $values();
        $VALUES = searchSortTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(searchSortTypeArr$values);
        CREATOR = new Parcelable.Creator<SearchSortType>() { // from class: com.okinc.business.defi.wallet.mine.search.domain.type.SearchSortType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SearchSortType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return SearchSortType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SearchSortType[] newArray(int i) {
                return new SearchSortType[i];
            }
        };
    }

    public static SearchSortType valueOf(String str) {
        return (SearchSortType) Enum.valueOf(SearchSortType.class, str);
    }

    public static SearchSortType[] values() {
        return (SearchSortType[]) $VALUES.clone();
    }
}

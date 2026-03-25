package com.okinc.business.market.features.favorites.editing.ui.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class FavoriteCrypotsInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FavoriteCrypotsInfo> CREATOR = new Creator();
    private final List<MarketFavoritesGroupPo.FavoritesPo> cryptoList;
    private final String currentGroupName;
    private final String pageType;

    public static final class Creator implements Parcelable.Creator<FavoriteCrypotsInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FavoriteCrypotsInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(MarketFavoritesGroupPo.FavoritesPo.CREATOR.createFromParcel(parcel));
            }
            return new FavoriteCrypotsInfo(string, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FavoriteCrypotsInfo[] newArray(int i) {
            return new FavoriteCrypotsInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.favorites.editing.ui.dialog.FavoriteCrypotsInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoriteCrypotsInfo copy$default(FavoriteCrypotsInfo favoriteCrypotsInfo, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = favoriteCrypotsInfo.currentGroupName;
        }
        if ((i & 2) != 0) {
            list = favoriteCrypotsInfo.cryptoList;
        }
        if ((i & 4) != 0) {
            str2 = favoriteCrypotsInfo.pageType;
        }
        return favoriteCrypotsInfo.copy(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currentGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MarketFavoritesGroupPo.FavoritesPo> component2() {
        return this.cryptoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavoriteCrypotsInfo copy(String str, @NotNull List<MarketFavoritesGroupPo.FavoritesPo> list, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new FavoriteCrypotsInfo(str, list, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteCrypotsInfo)) {
            return false;
        }
        FavoriteCrypotsInfo favoriteCrypotsInfo = (FavoriteCrypotsInfo) obj;
        return Intrinsics.EZpvd((Object) this.currentGroupName, (Object) favoriteCrypotsInfo.currentGroupName) && Intrinsics.EZpvd(this.cryptoList, favoriteCrypotsInfo.cryptoList) && Intrinsics.EZpvd((Object) this.pageType, (Object) favoriteCrypotsInfo.pageType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MarketFavoritesGroupPo.FavoritesPo> getCryptoList() {
        return this.cryptoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentGroupName() {
        return this.currentGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageType() {
        return this.pageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.currentGroupName;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.cryptoList.hashCode()) * 31) + this.pageType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FavoriteCrypotsInfo(currentGroupName=" + this.currentGroupName + ", cryptoList=" + this.cryptoList + ", pageType=" + this.pageType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.currentGroupName);
        List<MarketFavoritesGroupPo.FavoritesPo> list = this.cryptoList;
        parcel.writeInt(list.size());
        Iterator<MarketFavoritesGroupPo.FavoritesPo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.pageType);
    }

    public FavoriteCrypotsInfo(String str, @NotNull List<MarketFavoritesGroupPo.FavoritesPo> list, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.currentGroupName = str;
        this.cryptoList = list;
        this.pageType = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (r2v0 java.util.List)
  (r3v0 java.lang.String)
 A[MD:(java.lang.String, java.util.List<com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupPo$FavoritesPo>, java.lang.String):void (m)] (LINE:289) call: com.okinc.business.market.features.favorites.editing.ui.dialog.FavoriteCrypotsInfo.<init>(java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ FavoriteCrypotsInfo(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, list, str2);
    }
}

package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.CoinRatioParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TacticsCoinsInsideItemData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TacticsCoinsInsideItemData> CREATOR = new Creator();
    private List<CoinRatioParam> coins;
    private String title;
    private final int titleColor;
    private final int titleStyle;

    public static final class Creator implements Parcelable.Creator<TacticsCoinsInsideItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsCoinsInsideItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CoinRatioParam.CREATOR.createFromParcel(parcel));
            }
            return new TacticsCoinsInsideItemData(string, arrayList, parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsCoinsInsideItemData[] newArray(int i) {
            return new TacticsCoinsInsideItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsCoinsInsideItemData() {
        this(null, null, 0, 0, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.bot.data.TacticsCoinsInsideItemData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TacticsCoinsInsideItemData copy$default(TacticsCoinsInsideItemData tacticsCoinsInsideItemData, String str, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = tacticsCoinsInsideItemData.title;
        }
        if ((i3 & 2) != 0) {
            list = tacticsCoinsInsideItemData.coins;
        }
        if ((i3 & 4) != 0) {
            i = tacticsCoinsInsideItemData.titleStyle;
        }
        if ((i3 & 8) != 0) {
            i2 = tacticsCoinsInsideItemData.titleColor;
        }
        return tacticsCoinsInsideItemData.copy(str, list, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinRatioParam> component2() {
        return this.coins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.titleStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.titleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsCoinsInsideItemData copy(@NotNull String str, @NotNull List<CoinRatioParam> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TacticsCoinsInsideItemData(str, list, i, i2);
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
        if (!(obj instanceof TacticsCoinsInsideItemData)) {
            return false;
        }
        TacticsCoinsInsideItemData tacticsCoinsInsideItemData = (TacticsCoinsInsideItemData) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) tacticsCoinsInsideItemData.title) && Intrinsics.EZpvd(this.coins, tacticsCoinsInsideItemData.coins) && this.titleStyle == tacticsCoinsInsideItemData.titleStyle && this.titleColor == tacticsCoinsInsideItemData.titleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinRatioParam> getCoins() {
        return this.coins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleColor() {
        return this.titleColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleStyle() {
        return this.titleStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.coins.hashCode()) * 31) + Integer.hashCode(this.titleStyle)) * 31) + Integer.hashCode(this.titleColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoins(@NotNull List<CoinRatioParam> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.coins = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TacticsCoinsInsideItemData(title=" + this.title + ", coins=" + this.coins + ", titleStyle=" + this.titleStyle + ", titleColor=" + this.titleColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        List<CoinRatioParam> list = this.coins;
        parcel.writeInt(list.size());
        Iterator<CoinRatioParam> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.titleStyle);
        parcel.writeInt(this.titleColor);
    }

    public TacticsCoinsInsideItemData(@NotNull String str, @NotNull List<CoinRatioParam> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.title = str;
        this.coins = list;
        this.titleStyle = i;
        this.titleColor = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:1342) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0015: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(java.lang.String, java.util.List<com.okinc.unify_trade.biz.CoinRatioParam>, int, int):void (m)] (LINE:1340) call: com.okinc.unify_trade.bot.data.TacticsCoinsInsideItemData.<init>(java.lang.String, java.util.List, int, int):void type: THIS */
    public /* synthetic */ TacticsCoinsInsideItemData(String str, List list, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? new ArrayList() : list, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}

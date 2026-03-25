package com.okinc.market.common.biz_spot.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class TokenTradeInfoData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TokenTradeInfoData> CREATOR = new Creator();
    private List<TokenInfoOriginData> futures;
    private List<TokenInfoOriginData> margin;
    private List<TokenInfoOriginData> option;
    private List<TokenInfoOriginData> spot;
    private List<TokenInfoOriginData> swap;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<TokenTradeInfoData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenTradeInfoData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (true) {
                TokenInfoOriginData tokenInfoOriginDataCreateFromParcel = null;
                if (i2 == i) {
                    break;
                }
                if (parcel.readInt() != 0) {
                    tokenInfoOriginDataCreateFromParcel = TokenInfoOriginData.CREATOR.createFromParcel(parcel);
                }
                arrayList.add(tokenInfoOriginDataCreateFromParcel);
                i2++;
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readInt() == 0 ? null : TokenInfoOriginData.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(parcel.readInt() == 0 ? null : TokenInfoOriginData.CREATOR.createFromParcel(parcel));
            }
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList4.add(parcel.readInt() == 0 ? null : TokenInfoOriginData.CREATOR.createFromParcel(parcel));
            }
            int i9 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i9);
            for (int i10 = 0; i10 != i9; i10++) {
                arrayList5.add(parcel.readInt() == 0 ? null : TokenInfoOriginData.CREATOR.createFromParcel(parcel));
            }
            return new TokenTradeInfoData(arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenTradeInfoData[] newArray(int i) {
            return new TokenTradeInfoData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenTradeInfoData() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.market.common.biz_spot.bean.TokenTradeInfoData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TokenTradeInfoData copy$default(TokenTradeInfoData tokenTradeInfoData, List list, List list2, List list3, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tokenTradeInfoData.spot;
        }
        if ((i & 2) != 0) {
            list2 = tokenTradeInfoData.margin;
        }
        List list6 = list2;
        if ((i & 4) != 0) {
            list3 = tokenTradeInfoData.futures;
        }
        List list7 = list3;
        if ((i & 8) != 0) {
            list4 = tokenTradeInfoData.swap;
        }
        List list8 = list4;
        if ((i & 16) != 0) {
            list5 = tokenTradeInfoData.option;
        }
        return tokenTradeInfoData.copy(list, list6, list7, list8, list5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfoOriginData> component1() {
        return this.spot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfoOriginData> component2() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfoOriginData> component3() {
        return this.futures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfoOriginData> component4() {
        return this.swap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfoOriginData> component5() {
        return this.option;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenTradeInfoData copy(@NotNull List<TokenInfoOriginData> list, @NotNull List<TokenInfoOriginData> list2, @NotNull List<TokenInfoOriginData> list3, @NotNull List<TokenInfoOriginData> list4, @NotNull List<TokenInfoOriginData> list5) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        return new TokenTradeInfoData(list, list2, list3, list4, list5);
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
        if (!(obj instanceof TokenTradeInfoData)) {
            return false;
        }
        TokenTradeInfoData tokenTradeInfoData = (TokenTradeInfoData) obj;
        return Intrinsics.EZpvd(this.spot, tokenTradeInfoData.spot) && Intrinsics.EZpvd(this.margin, tokenTradeInfoData.margin) && Intrinsics.EZpvd(this.futures, tokenTradeInfoData.futures) && Intrinsics.EZpvd(this.swap, tokenTradeInfoData.swap) && Intrinsics.EZpvd(this.option, tokenTradeInfoData.option);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfoOriginData> getFutures() {
        return this.futures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfoOriginData> getMargin() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfoOriginData> getOption() {
        return this.option;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfoOriginData> getSpot() {
        return this.spot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfoOriginData> getSwap() {
        return this.swap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.spot.hashCode() * 31) + this.margin.hashCode()) * 31) + this.futures.hashCode()) * 31) + this.swap.hashCode()) * 31) + this.option.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFutures(@NotNull List<TokenInfoOriginData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.futures = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMargin(@NotNull List<TokenInfoOriginData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.margin = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOption(@NotNull List<TokenInfoOriginData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.option = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpot(@NotNull List<TokenInfoOriginData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.spot = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSwap(@NotNull List<TokenInfoOriginData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.swap = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenTradeInfoData(spot=" + this.spot + ", margin=" + this.margin + ", futures=" + this.futures + ", swap=" + this.swap + ", option=" + this.option + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<TokenInfoOriginData> list = this.spot;
        parcel.writeInt(list.size());
        for (TokenInfoOriginData tokenInfoOriginData : list) {
            if (tokenInfoOriginData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tokenInfoOriginData.writeToParcel(parcel, i);
            }
        }
        List<TokenInfoOriginData> list2 = this.margin;
        parcel.writeInt(list2.size());
        for (TokenInfoOriginData tokenInfoOriginData2 : list2) {
            if (tokenInfoOriginData2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tokenInfoOriginData2.writeToParcel(parcel, i);
            }
        }
        List<TokenInfoOriginData> list3 = this.futures;
        parcel.writeInt(list3.size());
        for (TokenInfoOriginData tokenInfoOriginData3 : list3) {
            if (tokenInfoOriginData3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tokenInfoOriginData3.writeToParcel(parcel, i);
            }
        }
        List<TokenInfoOriginData> list4 = this.swap;
        parcel.writeInt(list4.size());
        for (TokenInfoOriginData tokenInfoOriginData4 : list4) {
            if (tokenInfoOriginData4 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tokenInfoOriginData4.writeToParcel(parcel, i);
            }
        }
        List<TokenInfoOriginData> list5 = this.option;
        parcel.writeInt(list5.size());
        for (TokenInfoOriginData tokenInfoOriginData5 : list5) {
            if (tokenInfoOriginData5 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tokenInfoOriginData5.writeToParcel(parcel, i);
            }
        }
    }

    public TokenTradeInfoData(@NotNull List<TokenInfoOriginData> list, @NotNull List<TokenInfoOriginData> list2, @NotNull List<TokenInfoOriginData> list3, @NotNull List<TokenInfoOriginData> list4, @NotNull List<TokenInfoOriginData> list5) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        this.spot = list;
        this.margin = list2;
        this.futures = list3;
        this.swap = list4;
        this.option = list5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r4v0 java.util.List))
  (wrap:java.util.List:0x0010: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r5v0 java.util.List))
  (wrap:java.util.List:0x0019: TERNARY null = ((wrap:int:0x0011: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r6v0 java.util.List))
  (wrap:java.util.List:0x0022: TERNARY null = ((wrap:int:0x001a: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r7v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0023: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0027: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r8v0 java.util.List))
 A[MD:(java.util.List<com.okinc.market.common.biz_spot.bean.TokenInfoOriginData>, java.util.List<com.okinc.market.common.biz_spot.bean.TokenInfoOriginData>, java.util.List<com.okinc.market.common.biz_spot.bean.TokenInfoOriginData>, java.util.List<com.okinc.market.common.biz_spot.bean.TokenInfoOriginData>, java.util.List<com.okinc.market.common.biz_spot.bean.TokenInfoOriginData>):void (m)] (LINE:12) call: com.okinc.market.common.biz_spot.bean.TokenTradeInfoData.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ TokenTradeInfoData(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3, (i & 8) != 0 ? yDY.AhwBna() : list4, (i & 16) != 0 ? yDY.AhwBna() : list5);
    }
}

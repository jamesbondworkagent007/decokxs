package com.okinc.market.common.bean;

import com.google.gson.annotations.SerializedName;
import com.okinc.unify_trade.biz.FavoriteBizConfig;
import com.okinc.unify_trade.biz.FavoriteBizConfig$$serializer;
import com.okinc.unify_trade.biz.FavoriteBizInst;
import com.okinc.unify_trade.biz.FavoriteBizInst$$serializer;
import com.okinc.unify_trade.biz.FavouriteDexCoin;
import com.okinc.unify_trade.biz.FavouriteDexCoin$$serializer;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TradeCoinInfo$$serializer;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import com.okinc.unify_trade.biz.subscribe.WatchListData$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56402yEa;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class FavoriteInfo {

    @SerializedName("coins")
    private final List<TradeCoinInfo> coins;

    @SerializedName("configs")
    private final List<FavoriteBizConfig> configs;

    @SerializedName("dexCoins")
    private final List<FavouriteDexCoin> dexCoins;

    @SerializedName("favorites")
    private final List<WatchListData> favorites;

    @SerializedName("simpleProduct")
    private final FavoriteBizInst simpleProduct;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TradeCoinInfo$$serializer.INSTANCE), new ArrayListSerializer(WatchListData$$serializer.INSTANCE), null, new ArrayListSerializer(FavoriteBizConfig$$serializer.INSTANCE), new ArrayListSerializer(FavouriteDexCoin$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.market.common.bean.FavoriteInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoriteInfo copy$default(FavoriteInfo favoriteInfo, List list, List list2, FavoriteBizInst favoriteBizInst, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = favoriteInfo.coins;
        }
        if ((i & 2) != 0) {
            list2 = favoriteInfo.favorites;
        }
        List list5 = list2;
        if ((i & 4) != 0) {
            favoriteBizInst = favoriteInfo.simpleProduct;
        }
        FavoriteBizInst favoriteBizInst2 = favoriteBizInst;
        if ((i & 8) != 0) {
            list3 = favoriteInfo.configs;
        }
        List list6 = list3;
        if ((i & 16) != 0) {
            list4 = favoriteInfo.dexCoins;
        }
        return favoriteInfo.copy(list, list5, favoriteBizInst2, list6, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeCoinInfo> component1() {
        return this.coins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WatchListData> component2() {
        return this.favorites;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavoriteBizInst component3() {
        return this.simpleProduct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FavoriteBizConfig> component4() {
        return this.configs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FavouriteDexCoin> component5() {
        return this.dexCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavoriteInfo copy(@NotNull List<TradeCoinInfo> list, @NotNull List<WatchListData> list2, FavoriteBizInst favoriteBizInst, List<FavoriteBizConfig> list3, @NotNull List<FavouriteDexCoin> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new FavoriteInfo(list, list2, favoriteBizInst, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteInfo)) {
            return false;
        }
        FavoriteInfo favoriteInfo = (FavoriteInfo) obj;
        return Intrinsics.EZpvd(this.coins, favoriteInfo.coins) && Intrinsics.EZpvd(this.favorites, favoriteInfo.favorites) && Intrinsics.EZpvd(this.simpleProduct, favoriteInfo.simpleProduct) && Intrinsics.EZpvd(this.configs, favoriteInfo.configs) && Intrinsics.EZpvd(this.dexCoins, favoriteInfo.dexCoins);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeCoinInfo> getCoins() {
        return this.coins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FavoriteBizConfig> getConfigs() {
        return this.configs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FavouriteDexCoin> getDexCoins() {
        return this.dexCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<WatchListData> getFavorites() {
        return this.favorites;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavoriteBizInst getSimpleProduct() {
        return this.simpleProduct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.coins.hashCode();
        int iHashCode2 = this.favorites.hashCode();
        FavoriteBizInst favoriteBizInst = this.simpleProduct;
        int iHashCode3 = favoriteBizInst == null ? 0 : favoriteBizInst.hashCode();
        List<FavoriteBizConfig> list = this.configs;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.dexCoins.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FavoriteInfo(coins=" + this.coins + ", favorites=" + this.favorites + ", simpleProduct=" + this.simpleProduct + ", configs=" + this.configs + ", dexCoins=" + this.dexCoins + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.market.common.bean.FavoriteInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FavoriteInfo> serializer() {
            return FavoriteInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FavoriteInfo(int i, List list, List list2, FavoriteBizInst favoriteBizInst, List list3, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        this.coins = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.favorites = yDY.AhwBna();
        } else {
            this.favorites = list2;
        }
        if ((i & 4) == 0) {
            this.simpleProduct = null;
        } else {
            this.simpleProduct = favoriteBizInst;
        }
        if ((i & 8) == 0) {
            this.configs = null;
        } else {
            this.configs = list3;
        }
        if ((i & 16) == 0) {
            this.dexCoins = yDY.AhwBna();
        } else {
            this.dexCoins = list4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [12=4] */
    public static final /* synthetic */ void write$Self$OKMarket_market_api(FavoriteInfo favoriteInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(favoriteInfo.coins, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], favoriteInfo.coins);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(favoriteInfo.favorites, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], favoriteInfo.favorites);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || favoriteInfo.simpleProduct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, FavoriteBizInst$$serializer.INSTANCE, favoriteInfo.simpleProduct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || favoriteInfo.configs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], favoriteInfo.configs);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(favoriteInfo.dexCoins, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], favoriteInfo.dexCoins);
    }

    public FavoriteInfo(@NotNull List<TradeCoinInfo> list, @NotNull List<WatchListData> list2, FavoriteBizInst favoriteBizInst, List<FavoriteBizConfig> list3, @NotNull List<FavouriteDexCoin> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.coins = list;
        this.favorites = list2;
        this.simpleProduct = favoriteBizInst;
        this.configs = list3;
        this.dexCoins = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r4v0 java.util.List))
  (wrap:java.util.List:0x0010: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:18)) : (r5v0 java.util.List))
  (wrap:com.okinc.unify_trade.biz.FavoriteBizInst:?: TERNARY null = ((wrap:int:0x0011: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.FavoriteBizInst) : (r6v0 com.okinc.unify_trade.biz.FavoriteBizInst))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0019: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.util.List) : (null java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001f: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0023: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:24)) : (r8v0 java.util.List))
 A[MD:(java.util.List<com.okinc.unify_trade.biz.TradeCoinInfo>, java.util.List<com.okinc.unify_trade.biz.subscribe.WatchListData>, com.okinc.unify_trade.biz.FavoriteBizInst, java.util.List<com.okinc.unify_trade.biz.FavoriteBizConfig>, java.util.List<com.okinc.unify_trade.biz.FavouriteDexCoin>):void (m)] (LINE:14) call: com.okinc.market.common.bean.FavoriteInfo.<init>(java.util.List, java.util.List, com.okinc.unify_trade.biz.FavoriteBizInst, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ FavoriteInfo(List list, List list2, FavoriteBizInst favoriteBizInst, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? null : favoriteBizInst, (i & 8) == 0 ? list3 : null, (i & 16) != 0 ? yDY.AhwBna() : list4);
    }

    public FavoriteInfo() {
        this(yDY.AhwBna(), yDY.AhwBna(), new FavoriteBizInst((List) null, (List) null, (List) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null), C56402yEa.EZpvd(new FavoriteBizConfig((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0))), yDY.AhwBna());
    }
}

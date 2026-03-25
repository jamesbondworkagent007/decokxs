package com.okinc.unify_trade.biz;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class FavoriteBizInfo {
    private FavoriteBizConfig mBizConfigList;
    private FavoriteBizInst mBizInstList;
    private List<TradeCoinInfo> mCoinList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(TradeCoinInfo$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FavoriteBizInfo() {
        this((FavoriteBizInst) null, (FavoriteBizConfig) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.FavoriteBizInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoriteBizInfo copy$default(FavoriteBizInfo favoriteBizInfo, FavoriteBizInst favoriteBizInst, FavoriteBizConfig favoriteBizConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            favoriteBizInst = favoriteBizInfo.mBizInstList;
        }
        if ((i & 2) != 0) {
            favoriteBizConfig = favoriteBizInfo.mBizConfigList;
        }
        if ((i & 4) != 0) {
            list = favoriteBizInfo.mCoinList;
        }
        return favoriteBizInfo.copy(favoriteBizInst, favoriteBizConfig, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavoriteBizInst component1() {
        return this.mBizInstList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavoriteBizConfig component2() {
        return this.mBizConfigList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeCoinInfo> component3() {
        return this.mCoinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavoriteBizInfo copy(FavoriteBizInst favoriteBizInst, FavoriteBizConfig favoriteBizConfig, List<TradeCoinInfo> list) {
        return new FavoriteBizInfo(favoriteBizInst, favoriteBizConfig, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteBizInfo)) {
            return false;
        }
        FavoriteBizInfo favoriteBizInfo = (FavoriteBizInfo) obj;
        return Intrinsics.EZpvd(this.mBizInstList, favoriteBizInfo.mBizInstList) && Intrinsics.EZpvd(this.mBizConfigList, favoriteBizInfo.mBizConfigList) && Intrinsics.EZpvd(this.mCoinList, favoriteBizInfo.mCoinList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavoriteBizConfig getMBizConfigList() {
        return this.mBizConfigList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavoriteBizInst getMBizInstList() {
        return this.mBizInstList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeCoinInfo> getMCoinList() {
        return this.mCoinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        FavoriteBizInst favoriteBizInst = this.mBizInstList;
        int iHashCode = favoriteBizInst == null ? 0 : favoriteBizInst.hashCode();
        FavoriteBizConfig favoriteBizConfig = this.mBizConfigList;
        int iHashCode2 = favoriteBizConfig == null ? 0 : favoriteBizConfig.hashCode();
        List<TradeCoinInfo> list = this.mCoinList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMBizConfigList(FavoriteBizConfig favoriteBizConfig) {
        this.mBizConfigList = favoriteBizConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMBizInstList(FavoriteBizInst favoriteBizInst) {
        this.mBizInstList = favoriteBizInst;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMCoinList(List<TradeCoinInfo> list) {
        this.mCoinList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FavoriteBizInfo(mBizInstList=" + this.mBizInstList + ", mBizConfigList=" + this.mBizConfigList + ", mCoinList=" + this.mCoinList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.FavoriteBizInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FavoriteBizInfo> serializer() {
            return FavoriteBizInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FavoriteBizInfo(int i, FavoriteBizInst favoriteBizInst, FavoriteBizConfig favoriteBizConfig, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.mBizInstList = null;
        } else {
            this.mBizInstList = favoriteBizInst;
        }
        if ((i & 2) == 0) {
            this.mBizConfigList = null;
        } else {
            this.mBizConfigList = favoriteBizConfig;
        }
        if ((i & 4) == 0) {
            this.mCoinList = null;
        } else {
            this.mCoinList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FavoriteBizInfo favoriteBizInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || favoriteBizInfo.mBizInstList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, FavoriteBizInst$$serializer.INSTANCE, favoriteBizInfo.mBizInstList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || favoriteBizInfo.mBizConfigList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, FavoriteBizConfig$$serializer.INSTANCE, favoriteBizInfo.mBizConfigList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && favoriteBizInfo.mCoinList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], favoriteBizInfo.mCoinList);
    }

    public FavoriteBizInfo(FavoriteBizInst favoriteBizInst, FavoriteBizConfig favoriteBizConfig, List<TradeCoinInfo> list) {
        this.mBizInstList = favoriteBizInst;
        this.mBizConfigList = favoriteBizConfig;
        this.mCoinList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.unify_trade.biz.FavoriteBizInst:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.FavoriteBizInst) : (r2v0 com.okinc.unify_trade.biz.FavoriteBizInst))
  (wrap:com.okinc.unify_trade.biz.FavoriteBizConfig:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.FavoriteBizConfig) : (r3v0 com.okinc.unify_trade.biz.FavoriteBizConfig))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(com.okinc.unify_trade.biz.FavoriteBizInst, com.okinc.unify_trade.biz.FavoriteBizConfig, java.util.List<com.okinc.unify_trade.biz.TradeCoinInfo>):void (m)] (LINE:1197) call: com.okinc.unify_trade.biz.FavoriteBizInfo.<init>(com.okinc.unify_trade.biz.FavoriteBizInst, com.okinc.unify_trade.biz.FavoriteBizConfig, java.util.List):void type: THIS */
    public /* synthetic */ FavoriteBizInfo(FavoriteBizInst favoriteBizInst, FavoriteBizConfig favoriteBizConfig, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : favoriteBizInst, (i & 2) != 0 ? null : favoriteBizConfig, (i & 4) != 0 ? null : list);
    }
}

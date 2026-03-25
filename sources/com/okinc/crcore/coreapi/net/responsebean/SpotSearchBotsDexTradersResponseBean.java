package com.okinc.crcore.coreapi.net.responsebean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SpotSearchBotsDexTradersResponseBean {
    private final List<SpotSearchDexTokenResponseBean> defiCoins;
    private final List<SpotSearchTraderResponseBean> social;
    private final List<SpotSearchBotResponseBean> tradingBot;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SpotSearchDexTokenResponseBean$$serializer.INSTANCE), new ArrayListSerializer(SpotSearchTraderResponseBean$$serializer.INSTANCE), new ArrayListSerializer(SpotSearchBotResponseBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotSearchBotsDexTradersResponseBean() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.SpotSearchBotsDexTradersResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpotSearchBotsDexTradersResponseBean copy$default(SpotSearchBotsDexTradersResponseBean spotSearchBotsDexTradersResponseBean, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = spotSearchBotsDexTradersResponseBean.defiCoins;
        }
        if ((i & 2) != 0) {
            list2 = spotSearchBotsDexTradersResponseBean.social;
        }
        if ((i & 4) != 0) {
            list3 = spotSearchBotsDexTradersResponseBean.tradingBot;
        }
        return spotSearchBotsDexTradersResponseBean.copy(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotSearchDexTokenResponseBean> component1() {
        return this.defiCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotSearchTraderResponseBean> component2() {
        return this.social;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotSearchBotResponseBean> component3() {
        return this.tradingBot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotSearchBotsDexTradersResponseBean copy(@NotNull List<SpotSearchDexTokenResponseBean> list, @NotNull List<SpotSearchTraderResponseBean> list2, @NotNull List<SpotSearchBotResponseBean> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new SpotSearchBotsDexTradersResponseBean(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpotSearchBotsDexTradersResponseBean)) {
            return false;
        }
        SpotSearchBotsDexTradersResponseBean spotSearchBotsDexTradersResponseBean = (SpotSearchBotsDexTradersResponseBean) obj;
        return Intrinsics.EZpvd(this.defiCoins, spotSearchBotsDexTradersResponseBean.defiCoins) && Intrinsics.EZpvd(this.social, spotSearchBotsDexTradersResponseBean.social) && Intrinsics.EZpvd(this.tradingBot, spotSearchBotsDexTradersResponseBean.tradingBot);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotSearchDexTokenResponseBean> getDefiCoins() {
        return this.defiCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotSearchTraderResponseBean> getSocial() {
        return this.social;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotSearchBotResponseBean> getTradingBot() {
        return this.tradingBot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.defiCoins.hashCode() * 31) + this.social.hashCode()) * 31) + this.tradingBot.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotSearchBotsDexTradersResponseBean(defiCoins=" + this.defiCoins + ", social=" + this.social + ", tradingBot=" + this.tradingBot + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.SpotSearchBotsDexTradersResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotSearchBotsDexTradersResponseBean> serializer() {
            return SpotSearchBotsDexTradersResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotSearchBotsDexTradersResponseBean(int i, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        this.defiCoins = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.social = yDY.AhwBna();
        } else {
            this.social = list2;
        }
        if ((i & 4) == 0) {
            this.tradingBot = yDY.AhwBna();
        } else {
            this.tradingBot = list3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [7=4] */
    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SpotSearchBotsDexTradersResponseBean spotSearchBotsDexTradersResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(spotSearchBotsDexTradersResponseBean.defiCoins, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], spotSearchBotsDexTradersResponseBean.defiCoins);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(spotSearchBotsDexTradersResponseBean.social, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], spotSearchBotsDexTradersResponseBean.social);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(spotSearchBotsDexTradersResponseBean.tradingBot, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], spotSearchBotsDexTradersResponseBean.tradingBot);
    }

    public SpotSearchBotsDexTradersResponseBean(@NotNull List<SpotSearchDexTokenResponseBean> list, @NotNull List<SpotSearchTraderResponseBean> list2, @NotNull List<SpotSearchBotResponseBean> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.defiCoins = list;
        this.social = list2;
        this.tradingBot = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.crcore.coreapi.net.responsebean.SpotSearchDexTokenResponseBean>, java.util.List<com.okinc.crcore.coreapi.net.responsebean.SpotSearchTraderResponseBean>, java.util.List<com.okinc.crcore.coreapi.net.responsebean.SpotSearchBotResponseBean>):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.SpotSearchBotsDexTradersResponseBean.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SpotSearchBotsDexTradersResponseBean(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3);
    }
}

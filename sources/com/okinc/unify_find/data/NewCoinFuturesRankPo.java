package com.okinc.unify_find.data;

import androidx.core.app.FrameMetricsAggregator;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56390yDp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class NewCoinFuturesRankPo extends BaseRank {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String alias;
    private final String changePerDay24h;
    private final String changePerDayUtc0;
    private final String changePerDayUtc8;
    private final String expTime;
    private final String icon;
    private final String lastPrice;
    private final String onlineTs;
    private final String ruleType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewCoinFuturesRankPo() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.changePerDay24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.changePerDayUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.changePerDayUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewCoinFuturesRankPo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new NewCoinFuturesRankPo(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewCoinFuturesRankPo)) {
            return false;
        }
        NewCoinFuturesRankPo newCoinFuturesRankPo = (NewCoinFuturesRankPo) obj;
        return Intrinsics.EZpvd((Object) this.lastPrice, (Object) newCoinFuturesRankPo.lastPrice) && Intrinsics.EZpvd((Object) this.changePerDay24h, (Object) newCoinFuturesRankPo.changePerDay24h) && Intrinsics.EZpvd((Object) this.changePerDayUtc0, (Object) newCoinFuturesRankPo.changePerDayUtc0) && Intrinsics.EZpvd((Object) this.changePerDayUtc8, (Object) newCoinFuturesRankPo.changePerDayUtc8) && Intrinsics.EZpvd((Object) this.icon, (Object) newCoinFuturesRankPo.icon) && Intrinsics.EZpvd((Object) this.onlineTs, (Object) newCoinFuturesRankPo.onlineTs) && Intrinsics.EZpvd((Object) this.alias, (Object) newCoinFuturesRankPo.alias) && Intrinsics.EZpvd((Object) this.expTime, (Object) newCoinFuturesRankPo.expTime) && Intrinsics.EZpvd((Object) this.ruleType, (Object) newCoinFuturesRankPo.ruleType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDay24h() {
        return this.changePerDay24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDayUtc0() {
        return this.changePerDayUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePerDayUtc8() {
        return this.changePerDayUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpTime() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOnlineTs() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuleType() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.lastPrice.hashCode();
        int iHashCode2 = this.changePerDay24h.hashCode();
        int iHashCode3 = this.changePerDayUtc0.hashCode();
        int iHashCode4 = this.changePerDayUtc8.hashCode();
        int iHashCode5 = this.icon.hashCode();
        int iHashCode6 = this.onlineTs.hashCode();
        String str = this.alias;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.expTime;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ruleType;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewCoinFuturesRankPo(lastPrice=" + this.lastPrice + ", changePerDay24h=" + this.changePerDay24h + ", changePerDayUtc0=" + this.changePerDayUtc0 + ", changePerDayUtc8=" + this.changePerDayUtc8 + ", icon=" + this.icon + ", onlineTs=" + this.onlineTs + ", alias=" + this.alias + ", expTime=" + this.expTime + ", ruleType=" + this.ruleType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_find.data.NewCoinFuturesRankPo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewCoinFuturesRankPo> serializer() {
            return NewCoinFuturesRankPo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewCoinFuturesRankPo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, str2, serializationConstructorMarker);
        if ((i & 4) == 0) {
            this.lastPrice = "";
        } else {
            this.lastPrice = str3;
        }
        if ((i & 8) == 0) {
            this.changePerDay24h = "";
        } else {
            this.changePerDay24h = str4;
        }
        if ((i & 16) == 0) {
            this.changePerDayUtc0 = "";
        } else {
            this.changePerDayUtc0 = str5;
        }
        if ((i & 32) == 0) {
            this.changePerDayUtc8 = "";
        } else {
            this.changePerDayUtc8 = str6;
        }
        if ((i & 64) == 0) {
            this.icon = "";
        } else {
            this.icon = str7;
        }
        if ((i & 128) == 0) {
            this.onlineTs = "";
        } else {
            this.onlineTs = str8;
        }
        if ((i & 256) == 0) {
            this.alias = "";
        } else {
            this.alias = str9;
        }
        if ((i & 512) == 0) {
            this.expTime = "";
        } else {
            this.expTime = str10;
        }
        if ((i & 1024) == 0) {
            this.ruleType = "";
        } else {
            this.ruleType = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(NewCoinFuturesRankPo newCoinFuturesRankPo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseRank.write$Self(newCoinFuturesRankPo, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) newCoinFuturesRankPo.lastPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, newCoinFuturesRankPo.lastPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) newCoinFuturesRankPo.changePerDay24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, newCoinFuturesRankPo.changePerDay24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) newCoinFuturesRankPo.changePerDayUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, newCoinFuturesRankPo.changePerDayUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) newCoinFuturesRankPo.changePerDayUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, newCoinFuturesRankPo.changePerDayUtc8);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) newCoinFuturesRankPo.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, newCoinFuturesRankPo.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) newCoinFuturesRankPo.onlineTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, newCoinFuturesRankPo.onlineTs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) newCoinFuturesRankPo.alias, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, newCoinFuturesRankPo.alias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) newCoinFuturesRankPo.expTime, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, newCoinFuturesRankPo.expTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) newCoinFuturesRankPo.ruleType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, newCoinFuturesRankPo.ruleType);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:181) call: com.okinc.unify_find.data.NewCoinFuturesRankPo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NewCoinFuturesRankPo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCoinFuturesRankPo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, String str8, String str9) {
        super((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.lastPrice = str;
        this.changePerDay24h = str2;
        this.changePerDayUtc0 = str3;
        this.changePerDayUtc8 = str4;
        this.icon = str5;
        this.onlineTs = str6;
        this.alias = str7;
        this.expTime = str8;
        this.ruleType = str9;
    }

    public final WatchListData toFuturesWatchingListData$OKMarket_market_impl() {
        Pair pairOLrzqt;
        if (Intrinsics.EZpvd((Object) getInstType(), (Object) "PREMARKET") || Intrinsics.EZpvd((Object) getInstType(), (Object) "FUTURES")) {
            pairOLrzqt = C56390yDp.OLrzqt(StringsKt__StringsKt.substringBeforeLast$default(getInstId(), "-", (String) null, 2, (Object) null), "FUTURES");
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(getInstId(), "SWAP");
        }
        String str = (String) pairOLrzqt.component1();
        String str2 = (String) pairOLrzqt.component2();
        String str3 = this.alias;
        if (str3 == null) {
            str3 = "";
        }
        return new WatchListData(str3, "", str, str2, (String) null, (String) null, (String) null, (String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null);
    }
}

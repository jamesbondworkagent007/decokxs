package com.okinc.unify_find.data;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class WaitOnlineRank extends BaseRank {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String displayId;
    private final String icon;
    private final String noticeUrlCn;
    private final String noticeUrlEn;
    private final String onlineTs;
    private final String ruleType;
    private final int tradeReady;
    private final String type;
    private final String waitOnlineTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WaitOnlineRank() {
        this(null, null, null, null, null, null, 0, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.noticeUrlCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.noticeUrlEn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.waitOnlineTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.tradeReady;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WaitOnlineRank copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new WaitOnlineRank(str, str2, str3, str4, str5, str6, i, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaitOnlineRank)) {
            return false;
        }
        WaitOnlineRank waitOnlineRank = (WaitOnlineRank) obj;
        return Intrinsics.EZpvd((Object) this.icon, (Object) waitOnlineRank.icon) && Intrinsics.EZpvd((Object) this.onlineTs, (Object) waitOnlineRank.onlineTs) && Intrinsics.EZpvd((Object) this.noticeUrlCn, (Object) waitOnlineRank.noticeUrlCn) && Intrinsics.EZpvd((Object) this.noticeUrlEn, (Object) waitOnlineRank.noticeUrlEn) && Intrinsics.EZpvd((Object) this.waitOnlineTime, (Object) waitOnlineRank.waitOnlineTime) && Intrinsics.EZpvd((Object) this.type, (Object) waitOnlineRank.type) && this.tradeReady == waitOnlineRank.tradeReady && Intrinsics.EZpvd((Object) this.displayId, (Object) waitOnlineRank.displayId) && Intrinsics.EZpvd((Object) this.ruleType, (Object) waitOnlineRank.ruleType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNoticeUrlCn() {
        return this.noticeUrlCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNoticeUrlEn() {
        return this.noticeUrlEn;
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
    public final int getTradeReady() {
        return this.tradeReady;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWaitOnlineTime() {
        return this.waitOnlineTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.icon.hashCode() * 31) + this.onlineTs.hashCode()) * 31) + this.noticeUrlCn.hashCode()) * 31) + this.noticeUrlEn.hashCode()) * 31) + this.waitOnlineTime.hashCode()) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.tradeReady)) * 31) + this.displayId.hashCode()) * 31) + this.ruleType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WaitOnlineRank(icon=" + this.icon + ", onlineTs=" + this.onlineTs + ", noticeUrlCn=" + this.noticeUrlCn + ", noticeUrlEn=" + this.noticeUrlEn + ", waitOnlineTime=" + this.waitOnlineTime + ", type=" + this.type + ", tradeReady=" + this.tradeReady + ", displayId=" + this.displayId + ", ruleType=" + this.ruleType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_find.data.WaitOnlineRank.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WaitOnlineRank> serializer() {
            return WaitOnlineRank$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WaitOnlineRank(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, str2, serializationConstructorMarker);
        if ((i & 4) == 0) {
            this.icon = "";
        } else {
            this.icon = str3;
        }
        if ((i & 8) == 0) {
            this.onlineTs = "";
        } else {
            this.onlineTs = str4;
        }
        if ((i & 16) == 0) {
            this.noticeUrlCn = "";
        } else {
            this.noticeUrlCn = str5;
        }
        if ((i & 32) == 0) {
            this.noticeUrlEn = "";
        } else {
            this.noticeUrlEn = str6;
        }
        if ((i & 64) == 0) {
            this.waitOnlineTime = "";
        } else {
            this.waitOnlineTime = str7;
        }
        if ((i & 128) == 0) {
            this.type = "";
        } else {
            this.type = str8;
        }
        if ((i & 256) == 0) {
            this.tradeReady = 1;
        } else {
            this.tradeReady = i2;
        }
        if ((i & 512) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str9;
        }
        if ((i & 1024) == 0) {
            this.ruleType = "";
        } else {
            this.ruleType = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(WaitOnlineRank waitOnlineRank, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BaseRank.write$Self(waitOnlineRank, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) waitOnlineRank.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, waitOnlineRank.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) waitOnlineRank.onlineTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, waitOnlineRank.onlineTs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) waitOnlineRank.noticeUrlCn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, waitOnlineRank.noticeUrlCn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) waitOnlineRank.noticeUrlEn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, waitOnlineRank.noticeUrlEn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) waitOnlineRank.waitOnlineTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, waitOnlineRank.waitOnlineTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) waitOnlineRank.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, waitOnlineRank.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || waitOnlineRank.tradeReady != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, waitOnlineRank.tradeReady);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) waitOnlineRank.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, waitOnlineRank.displayId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) waitOnlineRank.ruleType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, waitOnlineRank.ruleType);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r17v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:219) call: com.okinc.unify_find.data.WaitOnlineRank.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WaitOnlineRank(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? 1 : i, (i2 & 128) != 0 ? "" : str7, (i2 & 256) == 0 ? str8 : "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaitOnlineRank(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, @NotNull String str7, @NotNull String str8) {
        super((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.icon = str;
        this.onlineTs = str2;
        this.noticeUrlCn = str3;
        this.noticeUrlEn = str4;
        this.waitOnlineTime = str5;
        this.type = str6;
        this.tradeReady = i;
        this.displayId = str7;
        this.ruleType = str8;
    }
}

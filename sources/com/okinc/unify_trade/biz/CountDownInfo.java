package com.okinc.unify_trade.biz;

import com.okinc.unify_trade.constants.MarketTypeEnum;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33129mqd;
import o.C33490mxT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class CountDownInfo {
    private String displayId;
    private String icon;
    private String instId;
    private String instType;
    private String noticeUrlCn;
    private String noticeUrlEn;
    private String onlineTime;
    private String onlineTs;
    private String openMethod;
    private String type;
    private String waitOnlineTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CountDownType.values().length];
            try {
                iArr[CountDownType.SHOW_COUNT_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountDownType.SHOW_EXPECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountDownType.SHOW_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CountDownInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.openMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.onlineTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.waitOnlineTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.noticeUrlEn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.noticeUrlCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CountDownInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new CountDownInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountDownInfo)) {
            return false;
        }
        CountDownInfo countDownInfo = (CountDownInfo) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) countDownInfo.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) countDownInfo.instType) && Intrinsics.EZpvd((Object) this.icon, (Object) countDownInfo.icon) && Intrinsics.EZpvd((Object) this.onlineTs, (Object) countDownInfo.onlineTs) && Intrinsics.EZpvd((Object) this.onlineTime, (Object) countDownInfo.onlineTime) && Intrinsics.EZpvd((Object) this.waitOnlineTime, (Object) countDownInfo.waitOnlineTime) && Intrinsics.EZpvd((Object) this.type, (Object) countDownInfo.type) && Intrinsics.EZpvd((Object) this.noticeUrlEn, (Object) countDownInfo.noticeUrlEn) && Intrinsics.EZpvd((Object) this.noticeUrlCn, (Object) countDownInfo.noticeUrlCn) && Intrinsics.EZpvd((Object) this.openMethod, (Object) countDownInfo.openMethod) && Intrinsics.EZpvd((Object) this.displayId, (Object) countDownInfo.displayId);
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
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
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
    public final String getOnlineTime() {
        return this.onlineTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOnlineTs() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenMethod() {
        return this.openMethod;
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
        return (((((((((((((((((((this.instId.hashCode() * 31) + this.instType.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.onlineTs.hashCode()) * 31) + this.onlineTime.hashCode()) * 31) + this.waitOnlineTime.hashCode()) * 31) + this.type.hashCode()) * 31) + this.noticeUrlEn.hashCode()) * 31) + this.noticeUrlCn.hashCode()) * 31) + this.openMethod.hashCode()) * 31) + this.displayId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNoticeUrlCn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.noticeUrlCn = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNoticeUrlEn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.noticeUrlEn = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnlineTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onlineTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnlineTs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onlineTs = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.openMethod = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWaitOnlineTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.waitOnlineTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CountDownInfo(instId=" + this.instId + ", instType=" + this.instType + ", icon=" + this.icon + ", onlineTs=" + this.onlineTs + ", onlineTime=" + this.onlineTime + ", waitOnlineTime=" + this.waitOnlineTime + ", type=" + this.type + ", noticeUrlEn=" + this.noticeUrlEn + ", noticeUrlCn=" + this.noticeUrlCn + ", openMethod=" + this.openMethod + ", displayId=" + this.displayId + ")";
    }

    public /* synthetic */ CountDownInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.instType = "";
        } else {
            this.instType = str2;
        }
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
            this.onlineTime = "";
        } else {
            this.onlineTime = str5;
        }
        if ((i & 32) == 0) {
            this.waitOnlineTime = "";
        } else {
            this.waitOnlineTime = str6;
        }
        if ((i & 64) == 0) {
            this.type = "";
        } else {
            this.type = str7;
        }
        if ((i & 128) == 0) {
            this.noticeUrlEn = "";
        } else {
            this.noticeUrlEn = str8;
        }
        if ((i & 256) == 0) {
            this.noticeUrlCn = "";
        } else {
            this.noticeUrlCn = str9;
        }
        if ((i & 512) == 0) {
            this.openMethod = "";
        } else {
            this.openMethod = str10;
        }
        if ((i & 1024) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(CountDownInfo countDownInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) countDownInfo.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, countDownInfo.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) countDownInfo.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, countDownInfo.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) countDownInfo.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, countDownInfo.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) countDownInfo.onlineTs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, countDownInfo.onlineTs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) countDownInfo.onlineTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, countDownInfo.onlineTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) countDownInfo.waitOnlineTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, countDownInfo.waitOnlineTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) countDownInfo.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, countDownInfo.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) countDownInfo.noticeUrlEn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, countDownInfo.noticeUrlEn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) countDownInfo.noticeUrlCn, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, countDownInfo.noticeUrlCn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) countDownInfo.openMethod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, countDownInfo.openMethod);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) countDownInfo.displayId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, countDownInfo.displayId);
    }

    public CountDownInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.instId = str;
        this.instType = str2;
        this.icon = str3;
        this.onlineTs = str4;
        this.onlineTime = str5;
        this.waitOnlineTime = str6;
        this.type = str7;
        this.noticeUrlEn = str8;
        this.noticeUrlCn = str9;
        this.openMethod = str10;
        this.displayId = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:22) call: com.okinc.unify_trade.biz.CountDownInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CountDownInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) == 0 ? str11 : "");
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.CountDownInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CountDownInfo> serializer() {
            return CountDownInfo$$serializer.INSTANCE;
        }

        public final List<CountDownInfo> EZpvd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List<CountDownInfo> listAEQbTJ = C33490mxT.AEQbTJ(str, CountDownInfo.class);
                for (CountDownInfo countDownInfo : listAEQbTJ) {
                    countDownInfo.setOnlineTime(C33129mqd.addS$default(C33129mqd.gEmmrt(Long.valueOf(System.currentTimeMillis())), C33129mqd.mulS$default(countDownInfo.getWaitOnlineTime(), 1000, null, null, null, 14, null), null, null, null, 14, null));
                }
                return listAEQbTJ;
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final CountDownType getShowType() {
        String str = this.type;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    return CountDownType.SHOW_COUNT_DOWN;
                }
                return null;
            case 49:
                if (str.equals("1")) {
                    return CountDownType.SHOW_EXPECT;
                }
                return null;
            case 50:
                if (str.equals("2")) {
                    return CountDownType.SHOW_CANCEL;
                }
                return null;
            default:
                return null;
        }
    }

    public final boolean countDownTimeExpire() {
        return C33129mqd.valueOf(C33129mqd.subS$default(this.onlineTime, C33129mqd.gEmmrt(Long.valueOf(System.currentTimeMillis())), null, null, null, 14, null), 0);
    }

    public final boolean isInvalidForBot() {
        CountDownType showType = getShowType();
        int i = showType == null ? -1 : TaskDescription.AEQbTJ[showType.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return true;
            }
        } else if (!countDownTimeExpire()) {
            return true;
        }
        return false;
    }

    public final boolean isNextStageCallAuction() {
        return Intrinsics.EZpvd((Object) this.openMethod, (Object) "0");
    }

    public final boolean isNextStagePreQuote() {
        return Intrinsics.EZpvd((Object) this.openMethod, (Object) "2");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final MarketTypeEnum getNextStage() {
        String str = this.openMethod;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    return MarketTypeEnum.CALL_AUCTION;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    return MarketTypeEnum.TRADING;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    return MarketTypeEnum.PRE_QUOTE;
                }
                break;
        }
        return MarketTypeEnum.TRADING;
    }
}

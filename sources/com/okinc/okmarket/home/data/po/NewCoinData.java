package com.okinc.okmarket.home.data.po;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class NewCoinData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Boolean canTrade;
    private final String displayId;
    private final String icon;
    private final String instId;
    private final String instType;
    private final String noticeUrlCn;
    private final String noticeUrlEn;
    private final String onlineTs;
    private final String openMethod;
    private final String tradeReady;
    private final String type;
    private final String waitOnlineTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewCoinData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tradeReady;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.openMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.canTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.waitOnlineTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.noticeUrlCn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.noticeUrlEn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewCoinData copy(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11) {
        return new NewCoinData(str, str2, str3, str4, str5, bool, str6, str7, str8, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewCoinData)) {
            return false;
        }
        NewCoinData newCoinData = (NewCoinData) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) newCoinData.instId) && Intrinsics.EZpvd((Object) this.icon, (Object) newCoinData.icon) && Intrinsics.EZpvd((Object) this.onlineTs, (Object) newCoinData.onlineTs) && Intrinsics.EZpvd((Object) this.displayId, (Object) newCoinData.displayId) && Intrinsics.EZpvd((Object) this.instType, (Object) newCoinData.instType) && Intrinsics.EZpvd(this.canTrade, newCoinData.canTrade) && Intrinsics.EZpvd((Object) this.waitOnlineTime, (Object) newCoinData.waitOnlineTime) && Intrinsics.EZpvd((Object) this.noticeUrlCn, (Object) newCoinData.noticeUrlCn) && Intrinsics.EZpvd((Object) this.noticeUrlEn, (Object) newCoinData.noticeUrlEn) && Intrinsics.EZpvd((Object) this.type, (Object) newCoinData.type) && Intrinsics.EZpvd((Object) this.tradeReady, (Object) newCoinData.tradeReady) && Intrinsics.EZpvd((Object) this.openMethod, (Object) newCoinData.openMethod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanTrade() {
        return this.canTrade;
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
    public final String getOnlineTs() {
        return this.onlineTs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenMethod() {
        return this.openMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeReady() {
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
        String str = this.instId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.icon;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.onlineTs;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.displayId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.instType;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        Boolean bool = this.canTrade;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        String str6 = this.waitOnlineTime;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.noticeUrlCn;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.noticeUrlEn;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.type;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.tradeReady;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.openMethod;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewCoinData(instId=" + this.instId + ", icon=" + this.icon + ", onlineTs=" + this.onlineTs + ", displayId=" + this.displayId + ", instType=" + this.instType + ", canTrade=" + this.canTrade + ", waitOnlineTime=" + this.waitOnlineTime + ", noticeUrlCn=" + this.noticeUrlCn + ", noticeUrlEn=" + this.noticeUrlEn + ", type=" + this.type + ", tradeReady=" + this.tradeReady + ", openMethod=" + this.openMethod + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okmarket.home.data.po.NewCoinData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewCoinData> serializer() {
            return NewCoinData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewCoinData(int i, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = null;
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.icon = null;
        } else {
            this.icon = str2;
        }
        if ((i & 4) == 0) {
            this.onlineTs = null;
        } else {
            this.onlineTs = str3;
        }
        if ((i & 8) == 0) {
            this.displayId = null;
        } else {
            this.displayId = str4;
        }
        if ((i & 16) == 0) {
            this.instType = null;
        } else {
            this.instType = str5;
        }
        if ((i & 32) == 0) {
            this.canTrade = null;
        } else {
            this.canTrade = bool;
        }
        if ((i & 64) == 0) {
            this.waitOnlineTime = null;
        } else {
            this.waitOnlineTime = str6;
        }
        if ((i & 128) == 0) {
            this.noticeUrlCn = null;
        } else {
            this.noticeUrlCn = str7;
        }
        if ((i & 256) == 0) {
            this.noticeUrlEn = null;
        } else {
            this.noticeUrlEn = str8;
        }
        if ((i & 512) == 0) {
            this.type = null;
        } else {
            this.type = str9;
        }
        if ((i & 1024) == 0) {
            this.tradeReady = null;
        } else {
            this.tradeReady = str10;
        }
        if ((i & 2048) == 0) {
            this.openMethod = null;
        } else {
            this.openMethod = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(NewCoinData newCoinData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || newCoinData.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, newCoinData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || newCoinData.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, newCoinData.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || newCoinData.onlineTs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, newCoinData.onlineTs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || newCoinData.displayId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, newCoinData.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || newCoinData.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, newCoinData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || newCoinData.canTrade != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, newCoinData.canTrade);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || newCoinData.waitOnlineTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, newCoinData.waitOnlineTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || newCoinData.noticeUrlCn != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, newCoinData.noticeUrlCn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || newCoinData.noticeUrlEn != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, newCoinData.noticeUrlEn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || newCoinData.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, newCoinData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || newCoinData.tradeReady != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, newCoinData.tradeReady);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && newCoinData.openMethod == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, newCoinData.openMethod);
    }

    public NewCoinData(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.instId = str;
        this.icon = str2;
        this.onlineTs = str3;
        this.displayId = str4;
        this.instType = str5;
        this.canTrade = bool;
        this.waitOnlineTime = str6;
        this.noticeUrlCn = str7;
        this.noticeUrlEn = str8;
        this.type = str9;
        this.tradeReady = str10;
        this.openMethod = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:36) call: com.okinc.okmarket.home.data.po.NewCoinData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NewCoinData(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) == 0 ? str11 : null);
    }
}

package com.okinc.crcore.coreapi.net.responsebean;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ActivityCurrencyVO {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainIconUrl;
    private final Integer chainIndex;
    private final String currencyFullName;
    private final Integer currencyId;
    private final String currencyName;
    private final Integer currencySource;
    private final String darkIconUrl;
    private final String lightIconUrl;
    private final String tokenAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ActivityCurrencyVO() {
        this((String) null, (Integer) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.currencySource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.darkIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.lightIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.chainIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityCurrencyVO copy(String str, Integer num, String str2, Integer num2, String str3, String str4, String str5, Integer num3, String str6) {
        return new ActivityCurrencyVO(str, num, str2, num2, str3, str4, str5, num3, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityCurrencyVO)) {
            return false;
        }
        ActivityCurrencyVO activityCurrencyVO = (ActivityCurrencyVO) obj;
        return Intrinsics.EZpvd((Object) this.currencyFullName, (Object) activityCurrencyVO.currencyFullName) && Intrinsics.EZpvd(this.currencyId, activityCurrencyVO.currencyId) && Intrinsics.EZpvd((Object) this.currencyName, (Object) activityCurrencyVO.currencyName) && Intrinsics.EZpvd(this.currencySource, activityCurrencyVO.currencySource) && Intrinsics.EZpvd((Object) this.darkIconUrl, (Object) activityCurrencyVO.darkIconUrl) && Intrinsics.EZpvd((Object) this.lightIconUrl, (Object) activityCurrencyVO.lightIconUrl) && Intrinsics.EZpvd((Object) this.chainIconUrl, (Object) activityCurrencyVO.chainIconUrl) && Intrinsics.EZpvd(this.chainIndex, activityCurrencyVO.chainIndex) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) activityCurrencyVO.tokenAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIconUrl() {
        return this.chainIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencySource() {
        return this.currencySource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDarkIconUrl() {
        return this.darkIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLightIconUrl() {
        return this.lightIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.currencyFullName;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.currencyId;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.currencyName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.currencySource;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.darkIconUrl;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.lightIconUrl;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.chainIconUrl;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        Integer num3 = this.chainIndex;
        int iHashCode8 = num3 == null ? 0 : num3.hashCode();
        String str6 = this.tokenAddress;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActivityCurrencyVO(currencyFullName=" + this.currencyFullName + ", currencyId=" + this.currencyId + ", currencyName=" + this.currencyName + ", currencySource=" + this.currencySource + ", darkIconUrl=" + this.darkIconUrl + ", lightIconUrl=" + this.lightIconUrl + ", chainIconUrl=" + this.chainIconUrl + ", chainIndex=" + this.chainIndex + ", tokenAddress=" + this.tokenAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.ActivityCurrencyVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActivityCurrencyVO> serializer() {
            return ActivityCurrencyVO$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActivityCurrencyVO(int i, String str, Integer num, String str2, Integer num2, String str3, String str4, String str5, Integer num3, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currencyFullName = null;
        } else {
            this.currencyFullName = str;
        }
        if ((i & 2) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num;
        }
        if ((i & 4) == 0) {
            this.currencyName = null;
        } else {
            this.currencyName = str2;
        }
        if ((i & 8) == 0) {
            this.currencySource = null;
        } else {
            this.currencySource = num2;
        }
        if ((i & 16) == 0) {
            this.darkIconUrl = null;
        } else {
            this.darkIconUrl = str3;
        }
        if ((i & 32) == 0) {
            this.lightIconUrl = null;
        } else {
            this.lightIconUrl = str4;
        }
        if ((i & 64) == 0) {
            this.chainIconUrl = null;
        } else {
            this.chainIconUrl = str5;
        }
        if ((i & 128) == 0) {
            this.chainIndex = null;
        } else {
            this.chainIndex = num3;
        }
        if ((i & 256) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(ActivityCurrencyVO activityCurrencyVO, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || activityCurrencyVO.currencyFullName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, activityCurrencyVO.currencyFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || activityCurrencyVO.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, activityCurrencyVO.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || activityCurrencyVO.currencyName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, activityCurrencyVO.currencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || activityCurrencyVO.currencySource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, activityCurrencyVO.currencySource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || activityCurrencyVO.darkIconUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, activityCurrencyVO.darkIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || activityCurrencyVO.lightIconUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, activityCurrencyVO.lightIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || activityCurrencyVO.chainIconUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, activityCurrencyVO.chainIconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || activityCurrencyVO.chainIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, activityCurrencyVO.chainIndex);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && activityCurrencyVO.tokenAddress == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, activityCurrencyVO.tokenAddress);
    }

    public ActivityCurrencyVO(String str, Integer num, String str2, Integer num2, String str3, String str4, String str5, Integer num3, String str6) {
        this.currencyFullName = str;
        this.currencyId = num;
        this.currencyName = str2;
        this.currencySource = num2;
        this.darkIconUrl = str3;
        this.lightIconUrl = str4;
        this.chainIconUrl = str5;
        this.chainIndex = num3;
        this.tokenAddress = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:123) call: com.okinc.crcore.coreapi.net.responsebean.ActivityCurrencyVO.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ ActivityCurrencyVO(String str, Integer num, String str2, Integer num2, String str3, String str4, String str5, Integer num3, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num3, (i & 256) == 0 ? str6 : null);
    }
}

package com.okinc.business.invest_biz.data.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestmentBonusInfo {
    private static final KSerializer<Object>[] $childSerializers;
    private final String apyCalDesc;
    private final List<InvestApyDetailInfo> apyDetailInfo;
    private final String bonusDes;
    private final long bonusEndTime;
    private final List<InvestTipInfoVo> bonusInfoTips;
    private final String bonusName;
    private final List<BonusRewards> bonusRewards;
    private final InvestBonusRules bonusRules;
    private final long bonusStartTime;
    private final String bonusTotalAmount;
    private final List<String> headers;
    private final InvestTipInfoVo templateTip;
    private final String title;
    private final List<String> tokenLogos;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestmentBonusInfo() {
        this((String) null, (String) null, (List) null, (List) null, (InvestBonusRules) null, 0L, 0L, (String) null, (String) null, (List) null, (List) null, (List) null, (InvestTipInfoVo) null, (String) null, 16383, (DefaultConstructorMarker) null);
    }

    @SerialName("apyCalDesc")
    public static /* synthetic */ void getApyCalDesc$annotations() {
    }

    @SerialName("apyDetailInfo")
    public static /* synthetic */ void getApyDetailInfo$annotations() {
    }

    @SerialName("bonusDes")
    public static /* synthetic */ void getBonusDes$annotations() {
    }

    @SerialName("bonusEndTime")
    public static /* synthetic */ void getBonusEndTime$annotations() {
    }

    @SerialName("bonusInfoTips")
    public static /* synthetic */ void getBonusInfoTips$annotations() {
    }

    @SerialName("bonusName")
    public static /* synthetic */ void getBonusName$annotations() {
    }

    @SerialName("bonusRewards")
    public static /* synthetic */ void getBonusRewards$annotations() {
    }

    @SerialName("bonusRules")
    public static /* synthetic */ void getBonusRules$annotations() {
    }

    @SerialName("bonusStartTime")
    public static /* synthetic */ void getBonusStartTime$annotations() {
    }

    @SerialName("bonusTotalAmount")
    public static /* synthetic */ void getBonusTotalAmount$annotations() {
    }

    @SerialName("headers")
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @SerialName("templateTip")
    public static /* synthetic */ void getTemplateTip$annotations() {
    }

    @SerialName("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @SerialName("tokenLogos")
    public static /* synthetic */ void getTokenLogos$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bonusName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestApyDetailInfo> component10() {
        return this.apyDetailInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BonusRewards> component11() {
        return this.bonusRewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component12() {
        return this.tokenLogos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component13() {
        return this.templateTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bonusDes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.headers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTipInfoVo> component4() {
        return this.bonusInfoTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestBonusRules component5() {
        return this.bonusRules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.bonusEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.bonusStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.bonusTotalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.apyCalDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentBonusInfo copy(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull List<InvestTipInfoVo> list2, InvestBonusRules investBonusRules, long j, long j2, @NotNull String str3, @NotNull String str4, @NotNull List<InvestApyDetailInfo> list3, @NotNull List<BonusRewards> list4, @NotNull List<String> list5, InvestTipInfoVo investTipInfoVo, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        return new InvestmentBonusInfo(str, str2, list, list2, investBonusRules, j, j2, str3, str4, list3, list4, list5, investTipInfoVo, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestmentBonusInfo)) {
            return false;
        }
        InvestmentBonusInfo investmentBonusInfo = (InvestmentBonusInfo) obj;
        return Intrinsics.EZpvd((Object) this.bonusName, (Object) investmentBonusInfo.bonusName) && Intrinsics.EZpvd((Object) this.bonusDes, (Object) investmentBonusInfo.bonusDes) && Intrinsics.EZpvd(this.headers, investmentBonusInfo.headers) && Intrinsics.EZpvd(this.bonusInfoTips, investmentBonusInfo.bonusInfoTips) && Intrinsics.EZpvd(this.bonusRules, investmentBonusInfo.bonusRules) && this.bonusEndTime == investmentBonusInfo.bonusEndTime && this.bonusStartTime == investmentBonusInfo.bonusStartTime && Intrinsics.EZpvd((Object) this.bonusTotalAmount, (Object) investmentBonusInfo.bonusTotalAmount) && Intrinsics.EZpvd((Object) this.apyCalDesc, (Object) investmentBonusInfo.apyCalDesc) && Intrinsics.EZpvd(this.apyDetailInfo, investmentBonusInfo.apyDetailInfo) && Intrinsics.EZpvd(this.bonusRewards, investmentBonusInfo.bonusRewards) && Intrinsics.EZpvd(this.tokenLogos, investmentBonusInfo.tokenLogos) && Intrinsics.EZpvd(this.templateTip, investmentBonusInfo.templateTip) && Intrinsics.EZpvd((Object) this.title, (Object) investmentBonusInfo.title);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApyCalDesc() {
        return this.apyCalDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestApyDetailInfo> getApyDetailInfo() {
        return this.apyDetailInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBonusDes() {
        return this.bonusDes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBonusEndTime() {
        return this.bonusEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTipInfoVo> getBonusInfoTips() {
        return this.bonusInfoTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBonusName() {
        return this.bonusName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BonusRewards> getBonusRewards() {
        return this.bonusRewards;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestBonusRules getBonusRules() {
        return this.bonusRules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBonusStartTime() {
        return this.bonusStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBonusTotalAmount() {
        return this.bonusTotalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getHeaders() {
        return this.headers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getTemplateTip() {
        return this.templateTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTokenLogos() {
        return this.tokenLogos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.bonusName.hashCode();
        int iHashCode2 = this.bonusDes.hashCode();
        int iHashCode3 = this.headers.hashCode();
        int iHashCode4 = this.bonusInfoTips.hashCode();
        InvestBonusRules investBonusRules = this.bonusRules;
        int iHashCode5 = investBonusRules == null ? 0 : investBonusRules.hashCode();
        int iHashCode6 = Long.hashCode(this.bonusEndTime);
        int iHashCode7 = Long.hashCode(this.bonusStartTime);
        int iHashCode8 = this.bonusTotalAmount.hashCode();
        int iHashCode9 = this.apyCalDesc.hashCode();
        int iHashCode10 = this.apyDetailInfo.hashCode();
        int iHashCode11 = this.bonusRewards.hashCode();
        int iHashCode12 = this.tokenLogos.hashCode();
        InvestTipInfoVo investTipInfoVo = this.templateTip;
        int iHashCode13 = investTipInfoVo == null ? 0 : investTipInfoVo.hashCode();
        String str = this.title;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestmentBonusInfo(bonusName=" + this.bonusName + ", bonusDes=" + this.bonusDes + ", headers=" + this.headers + ", bonusInfoTips=" + this.bonusInfoTips + ", bonusRules=" + this.bonusRules + ", bonusEndTime=" + this.bonusEndTime + ", bonusStartTime=" + this.bonusStartTime + ", bonusTotalAmount=" + this.bonusTotalAmount + ", apyCalDesc=" + this.apyCalDesc + ", apyDetailInfo=" + this.apyDetailInfo + ", bonusRewards=" + this.bonusRewards + ", tokenLogos=" + this.tokenLogos + ", templateTip=" + this.templateTip + ", title=" + this.title + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestmentBonusInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestmentBonusInfo> serializer() {
            return InvestmentBonusInfo$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(BuiltinSerializersKt.getNullable(InvestTipInfoVo$$serializer.INSTANCE)), null, null, null, null, null, new ArrayListSerializer(InvestApyDetailInfo$$serializer.INSTANCE), new ArrayListSerializer(BonusRewards$$serializer.INSTANCE), new ArrayListSerializer(stringSerializer), null, null};
    }

    public /* synthetic */ InvestmentBonusInfo(int i, String str, String str2, List list, List list2, InvestBonusRules investBonusRules, long j, long j2, String str3, String str4, List list3, List list4, List list5, InvestTipInfoVo investTipInfoVo, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bonusName = "";
        } else {
            this.bonusName = str;
        }
        if ((i & 2) == 0) {
            this.bonusDes = "";
        } else {
            this.bonusDes = str2;
        }
        this.headers = (i & 4) == 0 ? yDY.AhwBna() : list;
        this.bonusInfoTips = (i & 8) == 0 ? yDY.AhwBna() : list2;
        if ((i & 16) == 0) {
            this.bonusRules = null;
        } else {
            this.bonusRules = investBonusRules;
        }
        if ((i & 32) == 0) {
            this.bonusEndTime = 0L;
        } else {
            this.bonusEndTime = j;
        }
        this.bonusStartTime = (i & 64) != 0 ? j2 : 0L;
        if ((i & 128) == 0) {
            this.bonusTotalAmount = "";
        } else {
            this.bonusTotalAmount = str3;
        }
        if ((i & 256) == 0) {
            this.apyCalDesc = "";
        } else {
            this.apyCalDesc = str4;
        }
        this.apyDetailInfo = (i & 512) == 0 ? yDY.AhwBna() : list3;
        this.bonusRewards = (i & 1024) == 0 ? yDY.AhwBna() : list4;
        this.tokenLogos = (i & 2048) == 0 ? yDY.AhwBna() : list5;
        if ((i & 4096) == 0) {
            this.templateTip = null;
        } else {
            this.templateTip = investTipInfoVo;
        }
        if ((i & 8192) == 0) {
            this.title = "";
        } else {
            this.title = str5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [443=6] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestmentBonusInfo investmentBonusInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investmentBonusInfo.bonusName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investmentBonusInfo.bonusName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investmentBonusInfo.bonusDes, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investmentBonusInfo.bonusDes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(investmentBonusInfo.headers, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], investmentBonusInfo.headers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(investmentBonusInfo.bonusInfoTips, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], investmentBonusInfo.bonusInfoTips);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investmentBonusInfo.bonusRules != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, InvestBonusRules$$serializer.INSTANCE, investmentBonusInfo.bonusRules);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investmentBonusInfo.bonusEndTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 5, investmentBonusInfo.bonusEndTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investmentBonusInfo.bonusStartTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 6, investmentBonusInfo.bonusStartTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investmentBonusInfo.bonusTotalAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, investmentBonusInfo.bonusTotalAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investmentBonusInfo.apyCalDesc, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investmentBonusInfo.apyCalDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(investmentBonusInfo.apyDetailInfo, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], investmentBonusInfo.apyDetailInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(investmentBonusInfo.bonusRewards, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], investmentBonusInfo.bonusRewards);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(investmentBonusInfo.tokenLogos, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], investmentBonusInfo.tokenLogos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || investmentBonusInfo.templateTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, InvestTipInfoVo$$serializer.INSTANCE, investmentBonusInfo.templateTip);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) investmentBonusInfo.title, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, investmentBonusInfo.title);
    }

    public InvestmentBonusInfo(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull List<InvestTipInfoVo> list2, InvestBonusRules investBonusRules, long j, long j2, @NotNull String str3, @NotNull String str4, @NotNull List<InvestApyDetailInfo> list3, @NotNull List<BonusRewards> list4, @NotNull List<String> list5, InvestTipInfoVo investTipInfoVo, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        this.bonusName = str;
        this.bonusDes = str2;
        this.headers = list;
        this.bonusInfoTips = list2;
        this.bonusRules = investBonusRules;
        this.bonusEndTime = j;
        this.bonusStartTime = j2;
        this.bonusTotalAmount = str3;
        this.apyCalDesc = str4;
        this.apyDetailInfo = list3;
        this.bonusRewards = list4;
        this.tokenLogos = list5;
        this.templateTip = investTipInfoVo;
        this.title = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a5: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0014: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:451)) : (r19v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001f: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0023: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:453)) : (r20v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestBonusRules:?: TERNARY null = ((wrap:int:0x002a: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestBonusRules) : (r21v0 com.okinc.business.invest_biz.data.bean.InvestBonusRules))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0032: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r22v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x003c: ARITH (r33v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r24v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0053: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0057: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:465)) : (r28v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005e: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0062: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:467)) : (r29v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0069: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:469)) : (r30v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0076: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (r31v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007e: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<com.okinc.business.invest_biz.data.bean.InvestTipInfoVo>, com.okinc.business.invest_biz.data.bean.InvestBonusRules, long, long, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestApyDetailInfo>, java.util.List<com.okinc.business.invest_biz.data.bean.BonusRewards>, java.util.List<java.lang.String>, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, java.lang.String):void (m)] (LINE:445) call: com.okinc.business.invest_biz.data.bean.InvestmentBonusInfo.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List, com.okinc.business.invest_biz.data.bean.InvestBonusRules, long, long, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, java.lang.String):void type: THIS */
    public /* synthetic */ InvestmentBonusInfo(String str, String str2, List list, List list2, InvestBonusRules investBonusRules, long j, long j2, String str3, String str4, List list3, List list4, List list5, InvestTipInfoVo investTipInfoVo, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? yDY.AhwBna() : list2, (i & 16) != 0 ? null : investBonusRules, (i & 32) != 0 ? 0L : j, (i & 64) == 0 ? j2 : 0L, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? yDY.AhwBna() : list3, (i & 1024) != 0 ? yDY.AhwBna() : list4, (i & 2048) != 0 ? yDY.AhwBna() : list5, (i & 4096) != 0 ? null : investTipInfoVo, (i & 8192) != 0 ? "" : str5);
    }
}

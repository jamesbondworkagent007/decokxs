package com.okinc.planet.biz_positions.data;

import com.okinc.planet.biz_positions.data.YieldDetails;
import com.okinc.planet.format.InstId;
import com.okinc.planet.format.InstId$$serializer;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.planet.serializer.PlanetNumericString$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33129mqd;
import o.C46063tGl;
import o.C46417tTo;
import o.C46419tTq;
import o.InterfaceC46073tGv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class ProfilePositionHistoryDto implements InterfaceC46073tGv {
    public static final int $stable = 0;
    private final String alias;
    private final long cTime;
    private final String ccy;
    private final String closeAmount;
    private final String closeAvgPx;
    private final String closePnl;
    private final ClosePositionType closePositionType;
    private final String closeTotalPos;
    private final String compensationTicketAmount;
    private final boolean compensationTicketFlag;
    private final String compensationTicketName;
    private final CouponItemState compensationTicketState;
    private final String compensationTicketUnit;
    private final String contractVal;
    private final String fee;
    private final String fundingFee;
    private final String id;
    private final String instFamily;
    private final String instId;
    private final String instType;
    private final String lever;
    private final String liquidationFee;
    private final String liquidationStatus;
    private final String marginCcy;
    private final String mgnMode;
    private final String openAvgPx;
    private final String openMaxAmount;
    private final float pnlRatio;
    private final String posSide;
    private final HistoryPosType posType;
    private final String realizedPnl;
    private final long uTime;
    private final String uly;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, HistoryPosType.Companion.serializer(), null, null, null, null, null, CouponItemState.Companion.serializer(), null};

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 int)
  (r3v0 java.lang.String)
  (r4v0 long)
  (r6v0 java.lang.String)
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 long)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 float)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 com.okinc.planet.biz_positions.data.ClosePositionType)
  (r29v0 java.lang.String)
  (r30v0 com.okinc.planet.biz_positions.data.HistoryPosType)
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 boolean)
  (r34v0 java.lang.String)
  (r35v0 java.lang.String)
  (r36v0 com.okinc.planet.biz_positions.data.CouponItemState)
  (r37v0 java.lang.String)
  (r38v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, int, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, java.lang.String, java.lang.String, com.okinc.planet.biz_positions.data.ClosePositionType, java.lang.String, com.okinc.planet.biz_positions.data.HistoryPosType, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.planet.biz_positions.data.CouponItemState, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] call: com.okinc.planet.biz_positions.data.ProfilePositionHistoryDto.<init>(int, int, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, java.lang.String, java.lang.String, com.okinc.planet.biz_positions.data.ClosePositionType, java.lang.String, com.okinc.planet.biz_positions.data.HistoryPosType, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, com.okinc.planet.biz_positions.data.CouponItemState, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ProfilePositionHistoryDto(int i, int i2, String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j2, String str14, String str15, String str16, String str17, String str18, float f, String str19, String str20, ClosePositionType closePositionType, String str21, HistoryPosType historyPosType, String str22, String str23, boolean z, String str24, String str25, CouponItemState couponItemState, String str26, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, j, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, j2, str14, str15, str16, str17, str18, f, str19, str20, closePositionType, str21, historyPosType, str22, str23, z, str24, str25, couponItemState, str26, serializationConstructorMarker);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 long)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 java.lang.String)
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 long)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 float)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 com.okinc.planet.biz_positions.data.ClosePositionType)
  (r27v0 java.lang.String)
 A[MD:(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, java.lang.String, java.lang.String, com.okinc.planet.biz_positions.data.ClosePositionType, java.lang.String):void (m)] call: com.okinc.planet.biz_positions.data.ProfilePositionHistoryDto.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, java.lang.String, java.lang.String, com.okinc.planet.biz_positions.data.ClosePositionType, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ProfilePositionHistoryDto(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j2, String str14, String str15, String str16, String str17, String str18, float f, String str19, String str20, ClosePositionType closePositionType, String str21, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, j2, str14, str15, str16, str17, str18, f, str19, str20, closePositionType, str21);
    }

    @Serializable(with = C46417tTo.class)
    public static /* synthetic */ void getCTime$annotations() {
    }

    @SerialName("quoteCcy")
    /* JADX INFO: renamed from: getCcy-FeEHGxI$annotations, reason: not valid java name */
    public static /* synthetic */ void m7006getCcyFeEHGxI$annotations() {
    }

    @SerialName("pnl")
    /* JADX INFO: renamed from: getClosePnl-8XBoXJE$annotations, reason: not valid java name */
    public static /* synthetic */ void m7007getClosePnl8XBoXJE$annotations() {
    }

    @SerialName("closeType")
    @Serializable(with = C46063tGl.class)
    public static /* synthetic */ void getClosePositionType$annotations() {
    }

    @SerialName("ctVal")
    /* JADX INFO: renamed from: getContractVal-8XBoXJE$annotations, reason: not valid java name */
    public static /* synthetic */ void m7008getContractVal8XBoXJE$annotations() {
    }

    @SerialName("posId")
    public static /* synthetic */ void getId$annotations() {
    }

    @Serializable(with = C46419tTq.class)
    public static /* synthetic */ void getPnlRatio$annotations() {
    }

    @Serializable(with = C46417tTo.class)
    public static /* synthetic */ void getUTime$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component11-8XBoXJE, reason: not valid java name */
    public final String m7009component118XBoXJE() {
        return this.closeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component12-8XBoXJE, reason: not valid java name */
    public final String m7010component128XBoXJE() {
        return this.openMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component15() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component17-8XBoXJE, reason: not valid java name */
    public final String m7011component178XBoXJE() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component18-8XBoXJE, reason: not valid java name */
    public final String m7012component188XBoXJE() {
        return this.closePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component19-8XBoXJE, reason: not valid java name */
    public final String m7013component198XBoXJE() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component20-8XBoXJE, reason: not valid java name */
    public final String m7014component208XBoXJE() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component21() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component22-FeEHGxI, reason: not valid java name */
    public final String m7015component22FeEHGxI() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component23-FeEHGxI, reason: not valid java name */
    public final String m7016component23FeEHGxI() {
        return this.marginCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClosePositionType component24() {
        return this.closePositionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.liquidationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component3-8XBoXJE, reason: not valid java name */
    public final String m7017component38XBoXJE() {
        return this.closeAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component4-8XBoXJE, reason: not valid java name */
    public final String m7018component48XBoXJE() {
        return this.openAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component5-8XBoXJE, reason: not valid java name */
    public final String m7019component58XBoXJE() {
        return this.contractVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component7-y_k7uyA, reason: not valid java name */
    public final String m7020component7y_k7uyA() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component9-8XBoXJE, reason: not valid java name */
    public final String m7021component98XBoXJE() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-58uaofE, reason: not valid java name */
    public final ProfilePositionHistoryDto m7022copy58uaofE(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, long j2, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, float f, @NotNull String str19, @NotNull String str20, ClosePositionType closePositionType, @NotNull String str21) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        return new ProfilePositionHistoryDto(str, j, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, j2, str14, str15, str16, str17, str18, f, str19, str20, closePositionType, str21, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfilePositionHistoryDto)) {
            return false;
        }
        ProfilePositionHistoryDto profilePositionHistoryDto = (ProfilePositionHistoryDto) obj;
        return Intrinsics.EZpvd((Object) this.alias, (Object) profilePositionHistoryDto.alias) && this.cTime == profilePositionHistoryDto.cTime && PlanetNumericString.EZpvd(this.closeAvgPx, profilePositionHistoryDto.closeAvgPx) && PlanetNumericString.EZpvd(this.openAvgPx, profilePositionHistoryDto.openAvgPx) && PlanetNumericString.EZpvd(this.contractVal, profilePositionHistoryDto.contractVal) && Intrinsics.EZpvd((Object) this.instFamily, (Object) profilePositionHistoryDto.instFamily) && InstId.copydefault(this.instId, profilePositionHistoryDto.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) profilePositionHistoryDto.instType) && PlanetNumericString.EZpvd(this.lever, profilePositionHistoryDto.lever) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) profilePositionHistoryDto.mgnMode) && PlanetNumericString.EZpvd(this.closeAmount, profilePositionHistoryDto.closeAmount) && PlanetNumericString.EZpvd(this.openMaxAmount, profilePositionHistoryDto.openMaxAmount) && Intrinsics.EZpvd((Object) this.id, (Object) profilePositionHistoryDto.id) && Intrinsics.EZpvd((Object) this.posSide, (Object) profilePositionHistoryDto.posSide) && this.uTime == profilePositionHistoryDto.uTime && Intrinsics.EZpvd((Object) this.uly, (Object) profilePositionHistoryDto.uly) && PlanetNumericString.EZpvd(this.realizedPnl, profilePositionHistoryDto.realizedPnl) && PlanetNumericString.EZpvd(this.closePnl, profilePositionHistoryDto.closePnl) && PlanetNumericString.EZpvd(this.fee, profilePositionHistoryDto.fee) && PlanetNumericString.EZpvd(this.fundingFee, profilePositionHistoryDto.fundingFee) && Float.compare(this.pnlRatio, profilePositionHistoryDto.pnlRatio) == 0 && Ccy.m6965equalsimpl0(this.ccy, profilePositionHistoryDto.ccy) && Ccy.m6965equalsimpl0(this.marginCcy, profilePositionHistoryDto.marginCcy) && this.closePositionType == profilePositionHistoryDto.closePositionType && Intrinsics.EZpvd((Object) this.liquidationStatus, (Object) profilePositionHistoryDto.liquidationStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46073tGv
    public long getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getCcy-FeEHGxI, reason: not valid java name */
    public String m7023getCcyFeEHGxI() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getCloseAmount-8XBoXJE, reason: not valid java name */
    public final String m7024getCloseAmount8XBoXJE() {
        return this.closeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46073tGv
    /* JADX INFO: renamed from: getCloseAvgPx-8XBoXJE, reason: not valid java name */
    public String mo7025getCloseAvgPx8XBoXJE() {
        return this.closeAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getClosePnl-8XBoXJE, reason: not valid java name */
    public String m7026getClosePnl8XBoXJE() {
        return this.closePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ClosePositionType getClosePositionType() {
        return this.closePositionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46073tGv
    /* JADX INFO: renamed from: getCloseTotalPos-8XBoXJE, reason: not valid java name */
    public String mo7027getCloseTotalPos8XBoXJE() {
        return this.closeTotalPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getCompensationTicketAmount-8XBoXJE, reason: not valid java name */
    public String m7028getCompensationTicketAmount8XBoXJE() {
        return this.compensationTicketAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getCompensationTicketFlag() {
        return this.compensationTicketFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getCompensationTicketName() {
        return this.compensationTicketName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CouponItemState getCompensationTicketState() {
        return this.compensationTicketState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getCompensationTicketUnit() {
        return this.compensationTicketUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46073tGv
    /* JADX INFO: renamed from: getContractVal-8XBoXJE, reason: not valid java name */
    public String mo7029getContractVal8XBoXJE() {
        return this.contractVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getFee-8XBoXJE, reason: not valid java name */
    public String m7030getFee8XBoXJE() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getFundingFee-8XBoXJE, reason: not valid java name */
    public String m7031getFundingFee8XBoXJE() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46073tGv
    /* JADX INFO: renamed from: getInstId-y_k7uyA, reason: not valid java name */
    public String mo7032getInstIdy_k7uyA() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46073tGv
    public String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getLever-8XBoXJE, reason: not valid java name */
    public String m7033getLever8XBoXJE() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getLiquidationFee-8XBoXJE, reason: not valid java name */
    public String m7034getLiquidationFee8XBoXJE() {
        return this.liquidationFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getLiquidationStatus() {
        return this.liquidationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46073tGv
    /* JADX INFO: renamed from: getMarginCcy-FeEHGxI, reason: not valid java name */
    public String mo7035getMarginCcyFeEHGxI() {
        return this.marginCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMgnMode() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46073tGv
    /* JADX INFO: renamed from: getOpenAvgPx-8XBoXJE, reason: not valid java name */
    public String mo7036getOpenAvgPx8XBoXJE() {
        return this.openAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getOpenMaxAmount-8XBoXJE, reason: not valid java name */
    public final String m7037getOpenMaxAmount8XBoXJE() {
        return this.openMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46073tGv
    public String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HistoryPosType getPosType() {
        return this.posType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46073tGv
    /* JADX INFO: renamed from: getRealizedPnl-8XBoXJE, reason: not valid java name */
    public String mo7038getRealizedPnl8XBoXJE() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC46073tGv
    public long getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.alias.hashCode();
        int iHashCode2 = Long.hashCode(this.cTime);
        int iEZpvd = PlanetNumericString.EZpvd(this.closeAvgPx);
        int iEZpvd2 = PlanetNumericString.EZpvd(this.openAvgPx);
        int iEZpvd3 = PlanetNumericString.EZpvd(this.contractVal);
        int iHashCode3 = this.instFamily.hashCode();
        int iOLrzqt = InstId.OLrzqt(this.instId);
        int iHashCode4 = this.instType.hashCode();
        int iEZpvd4 = PlanetNumericString.EZpvd(this.lever);
        int iHashCode5 = this.mgnMode.hashCode();
        int iEZpvd5 = PlanetNumericString.EZpvd(this.closeAmount);
        int iEZpvd6 = PlanetNumericString.EZpvd(this.openMaxAmount);
        int iHashCode6 = this.id.hashCode();
        int iHashCode7 = this.posSide.hashCode();
        int iHashCode8 = Long.hashCode(this.uTime);
        int iHashCode9 = this.uly.hashCode();
        int iEZpvd7 = PlanetNumericString.EZpvd(this.realizedPnl);
        int iEZpvd8 = PlanetNumericString.EZpvd(this.closePnl);
        int iEZpvd9 = PlanetNumericString.EZpvd(this.fee);
        int iEZpvd10 = PlanetNumericString.EZpvd(this.fundingFee);
        int iHashCode10 = Float.hashCode(this.pnlRatio);
        int iM6966hashCodeimpl = Ccy.m6966hashCodeimpl(this.ccy);
        int iM6966hashCodeimpl2 = Ccy.m6966hashCodeimpl(this.marginCcy);
        ClosePositionType closePositionType = this.closePositionType;
        return (((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iEZpvd) * 31) + iEZpvd2) * 31) + iEZpvd3) * 31) + iHashCode3) * 31) + iOLrzqt) * 31) + iHashCode4) * 31) + iEZpvd4) * 31) + iHashCode5) * 31) + iEZpvd5) * 31) + iEZpvd6) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iEZpvd7) * 31) + iEZpvd8) * 31) + iEZpvd9) * 31) + iEZpvd10) * 31) + iHashCode10) * 31) + iM6966hashCodeimpl) * 31) + iM6966hashCodeimpl2) * 31) + (closePositionType == null ? 0 : closePositionType.hashCode())) * 31) + this.liquidationStatus.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProfilePositionHistoryDto(alias=" + this.alias + ", cTime=" + this.cTime + ", closeAvgPx=" + PlanetNumericString.copydefault(this.closeAvgPx) + ", openAvgPx=" + PlanetNumericString.copydefault(this.openAvgPx) + ", contractVal=" + PlanetNumericString.copydefault(this.contractVal) + ", instFamily=" + this.instFamily + ", instId=" + InstId.AEQbTJ(this.instId) + ", instType=" + this.instType + ", lever=" + PlanetNumericString.copydefault(this.lever) + ", mgnMode=" + this.mgnMode + ", closeAmount=" + PlanetNumericString.copydefault(this.closeAmount) + ", openMaxAmount=" + PlanetNumericString.copydefault(this.openMaxAmount) + ", id=" + this.id + ", posSide=" + this.posSide + ", uTime=" + this.uTime + ", uly=" + this.uly + ", realizedPnl=" + PlanetNumericString.copydefault(this.realizedPnl) + ", closePnl=" + PlanetNumericString.copydefault(this.closePnl) + ", fee=" + PlanetNumericString.copydefault(this.fee) + ", fundingFee=" + PlanetNumericString.copydefault(this.fundingFee) + ", pnlRatio=" + this.pnlRatio + ", ccy=" + Ccy.m6967toStringimpl(this.ccy) + ", marginCcy=" + Ccy.m6967toStringimpl(this.marginCcy) + ", closePositionType=" + this.closePositionType + ", liquidationStatus=" + this.liquidationStatus + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_positions.data.ProfilePositionHistoryDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ProfilePositionHistoryDto> serializer() {
            return ProfilePositionHistoryDto$$serializer.INSTANCE;
        }
    }

    private /* synthetic */ ProfilePositionHistoryDto(int i, int i2, String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j2, String str14, String str15, String str16, String str17, String str18, float f, String str19, String str20, ClosePositionType closePositionType, String str21, HistoryPosType historyPosType, String str22, String str23, boolean z, String str24, String str25, CouponItemState couponItemState, String str26, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.alias = "";
        } else {
            this.alias = str;
        }
        if ((i & 2) == 0) {
            this.cTime = 0L;
        } else {
            this.cTime = j;
        }
        this.closeAvgPx = (i & 4) == 0 ? PlanetNumericString.Companion.EZpvd() : str2;
        this.openAvgPx = (i & 8) == 0 ? PlanetNumericString.Companion.EZpvd() : str3;
        this.contractVal = (i & 16) == 0 ? PlanetNumericString.Companion.EZpvd() : str4;
        if ((i & 32) == 0) {
            this.instFamily = "";
        } else {
            this.instFamily = str5;
        }
        this.instId = (i & 64) == 0 ? InstId.Companion.KWHzl() : str6;
        if ((i & 128) == 0) {
            this.instType = "";
        } else {
            this.instType = str7;
        }
        this.lever = (i & 256) == 0 ? PlanetNumericString.Companion.EZpvd() : str8;
        if ((i & 512) == 0) {
            this.mgnMode = "";
        } else {
            this.mgnMode = str9;
        }
        this.closeAmount = (i & 1024) == 0 ? PlanetNumericString.Companion.EZpvd() : str10;
        this.openMaxAmount = (i & 2048) == 0 ? PlanetNumericString.Companion.EZpvd() : str11;
        if ((i & 4096) == 0) {
            this.id = "";
        } else {
            this.id = str12;
        }
        if ((i & 8192) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str13;
        }
        this.uTime = (i & 16384) != 0 ? j2 : 0L;
        if ((32768 & i) == 0) {
            this.uly = "";
        } else {
            this.uly = str14;
        }
        this.realizedPnl = (65536 & i) == 0 ? PlanetNumericString.Companion.EZpvd() : str15;
        this.closePnl = (131072 & i) == 0 ? PlanetNumericString.Companion.EZpvd() : str16;
        this.fee = (262144 & i) == 0 ? PlanetNumericString.Companion.EZpvd() : str17;
        this.fundingFee = (524288 & i) == 0 ? PlanetNumericString.Companion.EZpvd() : str18;
        this.pnlRatio = (1048576 & i) == 0 ? 0.0f : f;
        this.ccy = (2097152 & i) == 0 ? Ccy.Companion.KWHzl() : str19;
        this.marginCcy = (4194304 & i) == 0 ? Ccy.Companion.KWHzl() : str20;
        this.closePositionType = (8388608 & i) == 0 ? null : closePositionType;
        if ((16777216 & i) == 0) {
            this.liquidationStatus = "";
        } else {
            this.liquidationStatus = str21;
        }
        this.posType = (33554432 & i) == 0 ? HistoryPosType.InvalidPosType : historyPosType;
        this.closeTotalPos = (67108864 & i) == 0 ? PlanetNumericString.Companion.EZpvd() : str22;
        this.compensationTicketAmount = (134217728 & i) == 0 ? PlanetNumericString.Companion.EZpvd() : str23;
        this.compensationTicketFlag = (268435456 & i) == 0 ? false : z;
        if ((536870912 & i) == 0) {
            this.compensationTicketUnit = "";
        } else {
            this.compensationTicketUnit = str24;
        }
        if ((1073741824 & i) == 0) {
            this.compensationTicketName = "";
        } else {
            this.compensationTicketName = str25;
        }
        this.compensationTicketState = (i & Integer.MIN_VALUE) == 0 ? CouponItemState.Empty : couponItemState;
        this.liquidationFee = (i2 & 1) == 0 ? PlanetNumericString.Companion.EZpvd() : str26;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [43=19] */
    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(ProfilePositionHistoryDto profilePositionHistoryDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) profilePositionHistoryDto.alias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, profilePositionHistoryDto.alias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || profilePositionHistoryDto.getCTime() != 0) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, C46417tTo.KWHzl, Long.valueOf(profilePositionHistoryDto.getCTime()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !PlanetNumericString.EZpvd(profilePositionHistoryDto.mo7025getCloseAvgPx8XBoXJE(), PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(profilePositionHistoryDto.mo7025getCloseAvgPx8XBoXJE()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !PlanetNumericString.EZpvd(profilePositionHistoryDto.mo7036getOpenAvgPx8XBoXJE(), PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(profilePositionHistoryDto.mo7036getOpenAvgPx8XBoXJE()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !PlanetNumericString.EZpvd(profilePositionHistoryDto.mo7029getContractVal8XBoXJE(), PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(profilePositionHistoryDto.mo7029getContractVal8XBoXJE()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) profilePositionHistoryDto.instFamily, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, profilePositionHistoryDto.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !InstId.copydefault(profilePositionHistoryDto.mo7032getInstIdy_k7uyA(), InstId.Companion.KWHzl())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, InstId$$serializer.INSTANCE, InstId.copydefault(profilePositionHistoryDto.mo7032getInstIdy_k7uyA()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) profilePositionHistoryDto.getInstType(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, profilePositionHistoryDto.getInstType());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !PlanetNumericString.EZpvd(profilePositionHistoryDto.m7033getLever8XBoXJE(), PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(profilePositionHistoryDto.m7033getLever8XBoXJE()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) profilePositionHistoryDto.getMgnMode(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, profilePositionHistoryDto.getMgnMode());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !PlanetNumericString.EZpvd(profilePositionHistoryDto.closeAmount, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(profilePositionHistoryDto.closeAmount));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !PlanetNumericString.EZpvd(profilePositionHistoryDto.openMaxAmount, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(profilePositionHistoryDto.openMaxAmount));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) profilePositionHistoryDto.getId(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, profilePositionHistoryDto.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) profilePositionHistoryDto.getPosSide(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, profilePositionHistoryDto.getPosSide());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || profilePositionHistoryDto.getUTime() != 0) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, C46417tTo.KWHzl, Long.valueOf(profilePositionHistoryDto.getUTime()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) profilePositionHistoryDto.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, profilePositionHistoryDto.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !PlanetNumericString.EZpvd(profilePositionHistoryDto.mo7038getRealizedPnl8XBoXJE(), PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(profilePositionHistoryDto.mo7038getRealizedPnl8XBoXJE()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !PlanetNumericString.EZpvd(profilePositionHistoryDto.m7026getClosePnl8XBoXJE(), PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(profilePositionHistoryDto.m7026getClosePnl8XBoXJE()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !PlanetNumericString.EZpvd(profilePositionHistoryDto.m7030getFee8XBoXJE(), PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(profilePositionHistoryDto.m7030getFee8XBoXJE()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !PlanetNumericString.EZpvd(profilePositionHistoryDto.m7031getFundingFee8XBoXJE(), PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 19, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(profilePositionHistoryDto.m7031getFundingFee8XBoXJE()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || Float.compare(profilePositionHistoryDto.getPnlRatio(), 0.0f) != 0) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 20, C46419tTq.EZpvd, Float.valueOf(profilePositionHistoryDto.getPnlRatio()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Ccy.m6965equalsimpl0(profilePositionHistoryDto.m7023getCcyFeEHGxI(), Ccy.Companion.KWHzl())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 21, Ccy$$serializer.INSTANCE, Ccy.m6961boximpl(profilePositionHistoryDto.m7023getCcyFeEHGxI()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Ccy.m6965equalsimpl0(profilePositionHistoryDto.mo7035getMarginCcyFeEHGxI(), Ccy.Companion.KWHzl())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 22, Ccy$$serializer.INSTANCE, Ccy.m6961boximpl(profilePositionHistoryDto.mo7035getMarginCcyFeEHGxI()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || profilePositionHistoryDto.getClosePositionType() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, C46063tGl.KWHzl, profilePositionHistoryDto.getClosePositionType());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) profilePositionHistoryDto.getLiquidationStatus(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, profilePositionHistoryDto.getLiquidationStatus());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || profilePositionHistoryDto.getPosType() != HistoryPosType.InvalidPosType) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 25, kSerializerArr[25], profilePositionHistoryDto.getPosType());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !PlanetNumericString.EZpvd(profilePositionHistoryDto.mo7027getCloseTotalPos8XBoXJE(), PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 26, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(profilePositionHistoryDto.mo7027getCloseTotalPos8XBoXJE()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !PlanetNumericString.EZpvd(profilePositionHistoryDto.m7028getCompensationTicketAmount8XBoXJE(), PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 27, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(profilePositionHistoryDto.m7028getCompensationTicketAmount8XBoXJE()));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || profilePositionHistoryDto.getCompensationTicketFlag()) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 28, profilePositionHistoryDto.getCompensationTicketFlag());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) profilePositionHistoryDto.getCompensationTicketUnit(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, profilePositionHistoryDto.getCompensationTicketUnit());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) profilePositionHistoryDto.getCompensationTicketName(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, profilePositionHistoryDto.getCompensationTicketName());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || profilePositionHistoryDto.getCompensationTicketState() != CouponItemState.Empty) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 31, kSerializerArr[31], profilePositionHistoryDto.getCompensationTicketState());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) && PlanetNumericString.EZpvd(profilePositionHistoryDto.m7034getLiquidationFee8XBoXJE(), PlanetNumericString.Companion.EZpvd())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 32, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(profilePositionHistoryDto.m7034getLiquidationFee8XBoXJE()));
    }

    private ProfilePositionHistoryDto(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j2, String str14, String str15, String str16, String str17, String str18, float f, String str19, String str20, ClosePositionType closePositionType, String str21) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        this.alias = str;
        this.cTime = j;
        this.closeAvgPx = str2;
        this.openAvgPx = str3;
        this.contractVal = str4;
        this.instFamily = str5;
        this.instId = str6;
        this.instType = str7;
        this.lever = str8;
        this.mgnMode = str9;
        this.closeAmount = str10;
        this.openMaxAmount = str11;
        this.id = str12;
        this.posSide = str13;
        this.uTime = j2;
        this.uly = str14;
        this.realizedPnl = str15;
        this.closePnl = str16;
        this.fee = str17;
        this.fundingFee = str18;
        this.pnlRatio = f;
        this.ccy = str19;
        this.marginCcy = str20;
        this.closePositionType = closePositionType;
        this.liquidationStatus = str21;
        this.posType = HistoryPosType.InvalidPosType;
        PlanetNumericString.Companion companion = PlanetNumericString.Companion;
        this.closeTotalPos = companion.EZpvd();
        this.compensationTicketAmount = companion.EZpvd();
        this.compensationTicketUnit = "";
        this.compensationTicketName = "";
        this.compensationTicketState = CouponItemState.Empty;
        this.liquidationFee = companion.EZpvd();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0164: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r56v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r56v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r30v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r56v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001b: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x0019: SGET  A[WRAPPED] (LINE:49) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:49)) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r56v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x0026: SGET  A[WRAPPED] (LINE:50) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:50)) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r56v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0035: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x0033: SGET  A[WRAPPED] (LINE:52) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:52)) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r56v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r56v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: INVOKE 
  (wrap:com.okinc.planet.format.InstId$Companion:0x0048: SGET  A[WRAPPED] (LINE:54) com.okinc.planet.format.InstId.Companion com.okinc.planet.format.InstId$Companion)
 VIRTUAL call: com.okinc.planet.format.InstId.Companion.KWHzl():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:54)) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r56v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r56v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005f: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x005d: SGET  A[WRAPPED] (LINE:56) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:56)) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r56v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r56v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0074: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x0072: SGET  A[WRAPPED] (LINE:58) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:58)) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r56v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0081: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x007f: SGET  A[WRAPPED] (LINE:59) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:59)) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r56v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:0x009b: TERNARY null = ((wrap:int:0x0092: ARITH (r56v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x009d: ARITH (r56v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r44v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (32768 int) & (r56v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r56v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b9: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x00b7: SGET  A[WRAPPED] (LINE:66) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:66)) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c2: ARITH (r56v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c8: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x00c6: SGET  A[WRAPPED] (LINE:68) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:68)) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r56v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00d7: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x00d5: SGET  A[WRAPPED] (LINE:69) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:69)) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r56v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00e6: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x00e4: SGET  A[WRAPPED] (LINE:70) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:70)) : (r50v0 java.lang.String))
  (wrap:float:?: TERNARY null = ((wrap:int:0x00ef: ARITH (r56v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r51v0 float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r56v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0100: INVOKE 
  (wrap:com.okinc.planet.biz_positions.data.Ccy$Companion:0x00fe: SGET  A[WRAPPED] (LINE:74) com.okinc.planet.biz_positions.data.Ccy.Companion com.okinc.planet.biz_positions.data.Ccy$Companion)
 VIRTUAL call: com.okinc.planet.biz_positions.data.Ccy.Companion.KWHzl():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:74)) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0109: ARITH (r56v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x010f: INVOKE 
  (wrap:com.okinc.planet.biz_positions.data.Ccy$Companion:0x010d: SGET  A[WRAPPED] (LINE:75) com.okinc.planet.biz_positions.data.Ccy.Companion com.okinc.planet.biz_positions.data.Ccy$Companion)
 VIRTUAL call: com.okinc.planet.biz_positions.data.Ccy.Companion.KWHzl():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:75)) : (r53v0 java.lang.String))
  (wrap:com.okinc.planet.biz_positions.data.ClosePositionType:?: TERNARY null = ((wrap:int:0x0118: ARITH (r56v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet.biz_positions.data.ClosePositionType) : (r54v0 com.okinc.planet.biz_positions.data.ClosePositionType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0123: ARITH (r56v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, java.lang.String, java.lang.String, com.okinc.planet.biz_positions.data.ClosePositionType, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:45) call: com.okinc.planet.biz_positions.data.ProfilePositionHistoryDto.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, java.lang.String, java.lang.String, com.okinc.planet.biz_positions.data.ClosePositionType, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ ProfilePositionHistoryDto(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j2, String str14, String str15, String str16, String str17, String str18, float f, String str19, String str20, ClosePositionType closePositionType, String str21, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? PlanetNumericString.Companion.EZpvd() : str2, (i & 8) != 0 ? PlanetNumericString.Companion.EZpvd() : str3, (i & 16) != 0 ? PlanetNumericString.Companion.EZpvd() : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? InstId.Companion.KWHzl() : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? PlanetNumericString.Companion.EZpvd() : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? PlanetNumericString.Companion.EZpvd() : str10, (i & 2048) != 0 ? PlanetNumericString.Companion.EZpvd() : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? 0L : j2, (32768 & i) != 0 ? "" : str14, (i & 65536) != 0 ? PlanetNumericString.Companion.EZpvd() : str15, (i & 131072) != 0 ? PlanetNumericString.Companion.EZpvd() : str16, (i & 262144) != 0 ? PlanetNumericString.Companion.EZpvd() : str17, (i & 524288) != 0 ? PlanetNumericString.Companion.EZpvd() : str18, (i & 1048576) != 0 ? 0.0f : f, (i & 2097152) != 0 ? Ccy.Companion.KWHzl() : str19, (i & 4194304) != 0 ? Ccy.Companion.KWHzl() : str20, (i & 8388608) != 0 ? null : closePositionType, (i & 16777216) != 0 ? "" : str21, null);
    }

    public YieldDetails mapPnlYieldData() {
        return new YieldDetails.ContractHistoryYieldDetails(C33129mqd.EZpvd(PlanetNumericString.OLrzqt(m7030getFee8XBoXJE())), C33129mqd.EZpvd(PlanetNumericString.OLrzqt(m7026getClosePnl8XBoXJE())), C33129mqd.EZpvd(PlanetNumericString.OLrzqt(m7031getFundingFee8XBoXJE())), C33129mqd.EZpvd(PlanetNumericString.OLrzqt(m7034getLiquidationFee8XBoXJE())), m7023getCcyFeEHGxI(), getPosType(), C33129mqd.EZpvd(PlanetNumericString.OLrzqt(mo7038getRealizedPnl8XBoXJE())), null);
    }
}

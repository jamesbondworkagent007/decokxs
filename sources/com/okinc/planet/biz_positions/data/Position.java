package com.okinc.planet.biz_positions.data;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.planet.serializer.PlanetNumericString$$serializer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C38307pTy;
import o.C46414tTl;
import o.pTB;
import o.tIX;
import o.tTN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class Position {
    private final String alias;
    private final String avgPx;
    private final String bePx;
    private final String cTime;
    private final BigDecimal fee;
    private final BigDecimal fundingFee;
    private final String instId;
    private final String instType;
    private final String last;
    private final String lever;
    private final String liqPx;
    private final String margin;
    private final String marginCcy;
    private final String markPx;
    private final String mgnMode;
    private final BigDecimal mgnRatio;
    private final String notionalUsd;
    private final BigDecimal pnl;
    private final String pos;
    private final String posCcy;
    private final String posId;
    private final String posSide;
    private final String posSpace;
    private final String quoteCcy;
    private final BigDecimal realizedPnl;
    private final BigDecimal upl;
    private final String uplRatio;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
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
  (r16v0 java.lang.String)
  (r17v0 java.math.BigDecimal)
  (r18v0 java.lang.String)
  (r19v0 java.math.BigDecimal)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.math.BigDecimal)
  (r23v0 java.math.BigDecimal)
  (r24v0 java.math.BigDecimal)
  (r25v0 java.math.BigDecimal)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] call: com.okinc.planet.biz_positions.data.Position.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Position(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, BigDecimal bigDecimal, String str16, BigDecimal bigDecimal2, String str17, String str18, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str19, String str20, String str21, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, bigDecimal, str16, bigDecimal2, str17, str18, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, str19, str20, str21, serializationConstructorMarker);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
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
  (r16v0 java.math.BigDecimal)
  (r17v0 java.lang.String)
  (r18v0 java.math.BigDecimal)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.math.BigDecimal)
  (r22v0 java.math.BigDecimal)
  (r23v0 java.math.BigDecimal)
  (r24v0 java.math.BigDecimal)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String):void (m)] call: com.okinc.planet.biz_positions.data.Position.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Position(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, BigDecimal bigDecimal, String str16, BigDecimal bigDecimal2, String str17, String str18, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str19, String str20, String str21, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, bigDecimal, str16, bigDecimal2, str17, str18, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, str19, str20, str21);
    }

    @Serializable(with = C46414tTl.class)
    public static /* synthetic */ void getFee$annotations() {
    }

    @Serializable(with = C46414tTl.class)
    public static /* synthetic */ void getFundingFee$annotations() {
    }

    @Serializable(with = C46414tTl.class)
    public static /* synthetic */ void getMgnRatio$annotations() {
    }

    @Serializable(with = C46414tTl.class)
    public static /* synthetic */ void getPnl$annotations() {
    }

    @Serializable(with = C46414tTl.class)
    public static /* synthetic */ void getRealizedPnl$annotations() {
    }

    @Serializable(with = C46414tTl.class)
    public static /* synthetic */ void getUpl$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.uplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.posSpace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.posId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component15-8XBoXJE, reason: not valid java name */
    public final String m6994component158XBoXJE() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal component16() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component17-8XBoXJE, reason: not valid java name */
    public final String m6995component178XBoXJE() {
        return this.markPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal component18() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.marginCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal component21() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal component22() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal component23() {
        return this.fundingFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal component24() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component25-8XBoXJE, reason: not valid java name */
    public final String m6996component258XBoXJE() {
        return this.bePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component26-8XBoXJE, reason: not valid java name */
    public final String m6997component268XBoXJE() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component27-8XBoXJE, reason: not valid java name */
    public final String m6998component278XBoXJE() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.pos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.posCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-3-eOtPE, reason: not valid java name */
    public final Position m6999copy3eOtPE(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull BigDecimal bigDecimal, @NotNull String str16, @NotNull BigDecimal bigDecimal2, @NotNull String str17, @NotNull String str18, @NotNull BigDecimal bigDecimal3, @NotNull BigDecimal bigDecimal4, @NotNull BigDecimal bigDecimal5, @NotNull BigDecimal bigDecimal6, @NotNull String str19, @NotNull String str20, @NotNull String str21) {
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
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(bigDecimal2, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(bigDecimal3, "");
        Intrinsics.checkNotNullParameter(bigDecimal4, "");
        Intrinsics.checkNotNullParameter(bigDecimal5, "");
        Intrinsics.checkNotNullParameter(bigDecimal6, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        return new Position(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, bigDecimal, str16, bigDecimal2, str17, str18, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, str19, str20, str21, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return Intrinsics.EZpvd((Object) this.avgPx, (Object) position.avgPx) && Intrinsics.EZpvd((Object) this.cTime, (Object) position.cTime) && Intrinsics.EZpvd((Object) this.instId, (Object) position.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) position.instType) && Intrinsics.EZpvd((Object) this.lever, (Object) position.lever) && Intrinsics.EZpvd((Object) this.alias, (Object) position.alias) && Intrinsics.EZpvd((Object) this.posSide, (Object) position.posSide) && Intrinsics.EZpvd((Object) this.pos, (Object) position.pos) && Intrinsics.EZpvd((Object) this.posCcy, (Object) position.posCcy) && Intrinsics.EZpvd((Object) this.liqPx, (Object) position.liqPx) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) position.mgnMode) && Intrinsics.EZpvd((Object) this.uplRatio, (Object) position.uplRatio) && Intrinsics.EZpvd((Object) this.posSpace, (Object) position.posSpace) && Intrinsics.EZpvd((Object) this.posId, (Object) position.posId) && PlanetNumericString.EZpvd(this.margin, position.margin) && Intrinsics.EZpvd(this.mgnRatio, position.mgnRatio) && PlanetNumericString.EZpvd(this.markPx, position.markPx) && Intrinsics.EZpvd(this.upl, position.upl) && Intrinsics.EZpvd((Object) this.quoteCcy, (Object) position.quoteCcy) && Intrinsics.EZpvd((Object) this.marginCcy, (Object) position.marginCcy) && Intrinsics.EZpvd(this.realizedPnl, position.realizedPnl) && Intrinsics.EZpvd(this.pnl, position.pnl) && Intrinsics.EZpvd(this.fundingFee, position.fundingFee) && Intrinsics.EZpvd(this.fee, position.fee) && PlanetNumericString.EZpvd(this.bePx, position.bePx) && PlanetNumericString.EZpvd(this.last, position.last) && PlanetNumericString.EZpvd(this.notionalUsd, position.notionalUsd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvgPx() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getBePx-8XBoXJE, reason: not valid java name */
    public final String m7000getBePx8XBoXJE() {
        return this.bePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal getFundingFee() {
        return this.fundingFee;
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
    /* JADX INFO: renamed from: getLast-8XBoXJE, reason: not valid java name */
    public final String m7001getLast8XBoXJE() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPx() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getMargin-8XBoXJE, reason: not valid java name */
    public final String m7002getMargin8XBoXJE() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarginCcy() {
        return this.marginCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getMarkPx-8XBoXJE, reason: not valid java name */
    public final String m7003getMarkPx8XBoXJE() {
        return this.markPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnMode() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal getMgnRatio() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getNotionalUsd-8XBoXJE, reason: not valid java name */
    public final String m7004getNotionalUsd8XBoXJE() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPos() {
        return this.pos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosCcy() {
        return this.posCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosId() {
        return this.posId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSpace() {
        return this.posSpace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCcy() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal getRealizedPnl() {
        return this.realizedPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal getUpl() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUplRatio() {
        return this.uplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((this.avgPx.hashCode() * 31) + this.cTime.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.lever.hashCode()) * 31) + this.alias.hashCode()) * 31) + this.posSide.hashCode()) * 31) + this.pos.hashCode()) * 31) + this.posCcy.hashCode()) * 31) + this.liqPx.hashCode()) * 31) + this.mgnMode.hashCode()) * 31) + this.uplRatio.hashCode()) * 31) + this.posSpace.hashCode()) * 31) + this.posId.hashCode()) * 31) + PlanetNumericString.EZpvd(this.margin)) * 31) + this.mgnRatio.hashCode()) * 31) + PlanetNumericString.EZpvd(this.markPx)) * 31) + this.upl.hashCode()) * 31) + this.quoteCcy.hashCode()) * 31) + this.marginCcy.hashCode()) * 31) + this.realizedPnl.hashCode()) * 31) + this.pnl.hashCode()) * 31) + this.fundingFee.hashCode()) * 31) + this.fee.hashCode()) * 31) + PlanetNumericString.EZpvd(this.bePx)) * 31) + PlanetNumericString.EZpvd(this.last)) * 31) + PlanetNumericString.EZpvd(this.notionalUsd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Position(avgPx=" + this.avgPx + ", cTime=" + this.cTime + ", instId=" + this.instId + ", instType=" + this.instType + ", lever=" + this.lever + ", alias=" + this.alias + ", posSide=" + this.posSide + ", pos=" + this.pos + ", posCcy=" + this.posCcy + ", liqPx=" + this.liqPx + ", mgnMode=" + this.mgnMode + ", uplRatio=" + this.uplRatio + ", posSpace=" + this.posSpace + ", posId=" + this.posId + ", margin=" + PlanetNumericString.copydefault(this.margin) + ", mgnRatio=" + this.mgnRatio + ", markPx=" + PlanetNumericString.copydefault(this.markPx) + ", upl=" + this.upl + ", quoteCcy=" + this.quoteCcy + ", marginCcy=" + this.marginCcy + ", realizedPnl=" + this.realizedPnl + ", pnl=" + this.pnl + ", fundingFee=" + this.fundingFee + ", fee=" + this.fee + ", bePx=" + PlanetNumericString.copydefault(this.bePx) + ", last=" + PlanetNumericString.copydefault(this.last) + ", notionalUsd=" + PlanetNumericString.copydefault(this.notionalUsd) + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_positions.data.Position.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Position> serializer() {
            return Position$$serializer.INSTANCE;
        }
    }

    private /* synthetic */ Position(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, BigDecimal bigDecimal, String str16, BigDecimal bigDecimal2, String str17, String str18, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str19, String str20, String str21, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str;
        }
        if ((i & 2) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str2;
        }
        if ((i & 4) == 0) {
            this.instId = "";
        } else {
            this.instId = str3;
        }
        if ((i & 8) == 0) {
            this.instType = "";
        } else {
            this.instType = str4;
        }
        if ((i & 16) == 0) {
            this.lever = "";
        } else {
            this.lever = str5;
        }
        if ((i & 32) == 0) {
            this.alias = "";
        } else {
            this.alias = str6;
        }
        if ((i & 64) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str7;
        }
        if ((i & 128) == 0) {
            this.pos = "";
        } else {
            this.pos = str8;
        }
        if ((i & 256) == 0) {
            this.posCcy = "";
        } else {
            this.posCcy = str9;
        }
        if ((i & 512) == 0) {
            this.liqPx = "";
        } else {
            this.liqPx = str10;
        }
        if ((i & 1024) == 0) {
            this.mgnMode = "";
        } else {
            this.mgnMode = str11;
        }
        if ((i & 2048) == 0) {
            this.uplRatio = "";
        } else {
            this.uplRatio = str12;
        }
        if ((i & 4096) == 0) {
            this.posSpace = "";
        } else {
            this.posSpace = str13;
        }
        if ((i & 8192) == 0) {
            this.posId = "";
        } else {
            this.posId = str14;
        }
        this.margin = (i & 16384) == 0 ? PlanetNumericString.Companion.EZpvd() : str15;
        this.mgnRatio = (32768 & i) == 0 ? BigDecimal.ZERO : bigDecimal;
        this.markPx = (65536 & i) == 0 ? PlanetNumericString.Companion.EZpvd() : str16;
        this.upl = (131072 & i) == 0 ? BigDecimal.ZERO : bigDecimal2;
        if ((262144 & i) == 0) {
            this.quoteCcy = "";
        } else {
            this.quoteCcy = str17;
        }
        if ((524288 & i) == 0) {
            this.marginCcy = "";
        } else {
            this.marginCcy = str18;
        }
        this.realizedPnl = (1048576 & i) == 0 ? BigDecimal.ZERO : bigDecimal3;
        this.pnl = (2097152 & i) == 0 ? BigDecimal.ZERO : bigDecimal4;
        this.fundingFee = (4194304 & i) == 0 ? BigDecimal.ZERO : bigDecimal5;
        this.fee = (8388608 & i) == 0 ? BigDecimal.ZERO : bigDecimal6;
        this.bePx = (16777216 & i) == 0 ? PlanetNumericString.Companion.EZpvd() : str19;
        this.last = (33554432 & i) == 0 ? PlanetNumericString.Companion.EZpvd() : str20;
        this.notionalUsd = (i & 67108864) == 0 ? PlanetNumericString.Companion.EZpvd() : str21;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [17=12] */
    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(Position position, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) position.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, position.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) position.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, position.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) position.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, position.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) position.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, position.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) position.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, position.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) position.alias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, position.alias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) position.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, position.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) position.pos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, position.pos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) position.posCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, position.posCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) position.liqPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, position.liqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) position.mgnMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, position.mgnMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) position.uplRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, position.uplRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) position.posSpace, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, position.posSpace);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) position.posId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, position.posId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !PlanetNumericString.EZpvd(position.margin, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(position.margin));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(position.mgnRatio, BigDecimal.ZERO)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 15, C46414tTl.KWHzl, position.mgnRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !PlanetNumericString.EZpvd(position.markPx, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(position.markPx));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(position.upl, BigDecimal.ZERO)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, C46414tTl.KWHzl, position.upl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) position.quoteCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, position.quoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) position.marginCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, position.marginCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd(position.realizedPnl, BigDecimal.ZERO)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 20, C46414tTl.KWHzl, position.realizedPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd(position.pnl, BigDecimal.ZERO)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 21, C46414tTl.KWHzl, position.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd(position.fundingFee, BigDecimal.ZERO)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 22, C46414tTl.KWHzl, position.fundingFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd(position.fee, BigDecimal.ZERO)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 23, C46414tTl.KWHzl, position.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !PlanetNumericString.EZpvd(position.bePx, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 24, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(position.bePx));
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !PlanetNumericString.EZpvd(position.last, PlanetNumericString.Companion.EZpvd())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 25, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(position.last));
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) && PlanetNumericString.EZpvd(position.notionalUsd, PlanetNumericString.Companion.EZpvd())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 26, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(position.notionalUsd));
    }

    private Position(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, BigDecimal bigDecimal, String str16, BigDecimal bigDecimal2, String str17, String str18, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str19, String str20, String str21) {
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
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(bigDecimal2, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(bigDecimal3, "");
        Intrinsics.checkNotNullParameter(bigDecimal4, "");
        Intrinsics.checkNotNullParameter(bigDecimal5, "");
        Intrinsics.checkNotNullParameter(bigDecimal6, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        this.avgPx = str;
        this.cTime = str2;
        this.instId = str3;
        this.instType = str4;
        this.lever = str5;
        this.alias = str6;
        this.posSide = str7;
        this.pos = str8;
        this.posCcy = str9;
        this.liqPx = str10;
        this.mgnMode = str11;
        this.uplRatio = str12;
        this.posSpace = str13;
        this.posId = str14;
        this.margin = str15;
        this.mgnRatio = bigDecimal;
        this.markPx = str16;
        this.upl = bigDecimal2;
        this.quoteCcy = str17;
        this.marginCcy = str18;
        this.realizedPnl = bigDecimal3;
        this.pnl = bigDecimal4;
        this.fundingFee = bigDecimal5;
        this.fee = bigDecimal6;
        this.bePx = str19;
        this.last = str20;
        this.notionalUsd = str21;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0154: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r56v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r56v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r56v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r56v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r56v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r56v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r56v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r56v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r56v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r56v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r56v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r56v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r56v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r56v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r56v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007c: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x007a: SGET  A[WRAPPED] (LINE:34) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:34)) : (r43v0 java.lang.String))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x0086: ARITH (r56v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008a: SGET  A[WRAPPED] (LINE:36) java.math.BigDecimal.ZERO java.math.BigDecimal) : (r44v0 java.math.BigDecimal))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0091: ARITH (r56v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0097: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x0095: SGET  A[WRAPPED] (LINE:37) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:37)) : (r45v0 java.lang.String))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x00a0: ARITH (r56v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a4: SGET  A[WRAPPED] (LINE:39) java.math.BigDecimal.ZERO java.math.BigDecimal) : (r46v0 java.math.BigDecimal))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ab: ARITH (r56v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b6: ARITH (r56v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x00c1: ARITH (r56v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c5: SGET  A[WRAPPED] (LINE:43) java.math.BigDecimal.ZERO java.math.BigDecimal) : (r49v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x00cc: ARITH (r56v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00d0: SGET  A[WRAPPED] (LINE:45) java.math.BigDecimal.ZERO java.math.BigDecimal) : (r50v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x00d7: ARITH (r56v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00db: SGET  A[WRAPPED] (LINE:47) java.math.BigDecimal.ZERO java.math.BigDecimal) : (r51v0 java.math.BigDecimal))
  (wrap:java.math.BigDecimal:?: TERNARY null = ((wrap:int:0x00e2: ARITH (r56v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00e6: SGET  A[WRAPPED] (LINE:49) java.math.BigDecimal.ZERO java.math.BigDecimal) : (r52v0 java.math.BigDecimal))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ed: ARITH (r56v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00f3: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x00f1: SGET  A[WRAPPED] (LINE:50) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:50)) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fc: ARITH (r56v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0102: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x0100: SGET  A[WRAPPED] (LINE:51) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:51)) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010b: ARITH (r56v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0111: INVOKE 
  (wrap:com.okinc.planet.serializer.PlanetNumericString$Companion:0x010f: SGET  A[WRAPPED] (LINE:52) com.okinc.planet.serializer.PlanetNumericString.Companion com.okinc.planet.serializer.PlanetNumericString$Companion)
 VIRTUAL call: com.okinc.planet.serializer.PlanetNumericString.Companion.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:52)) : (r55v0 java.lang.String))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:19) call: com.okinc.planet.biz_positions.data.Position.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ Position(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, BigDecimal bigDecimal, String str16, BigDecimal bigDecimal2, String str17, String str18, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, String str19, String str20, String str21, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? PlanetNumericString.Companion.EZpvd() : str15, (i & 32768) != 0 ? BigDecimal.ZERO : bigDecimal, (i & 65536) != 0 ? PlanetNumericString.Companion.EZpvd() : str16, (i & 131072) != 0 ? BigDecimal.ZERO : bigDecimal2, (i & 262144) != 0 ? "" : str17, (i & 524288) != 0 ? "" : str18, (i & 1048576) != 0 ? BigDecimal.ZERO : bigDecimal3, (i & 2097152) != 0 ? BigDecimal.ZERO : bigDecimal4, (i & 4194304) != 0 ? BigDecimal.ZERO : bigDecimal5, (i & 8388608) != 0 ? BigDecimal.ZERO : bigDecimal6, (i & 16777216) != 0 ? PlanetNumericString.Companion.EZpvd() : str19, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? PlanetNumericString.Companion.EZpvd() : str20, (i & 67108864) != 0 ? PlanetNumericString.Companion.EZpvd() : str21, null);
    }

    public final String getMgnModeText() {
        return tTN.Companion.copydefault(this.mgnMode);
    }

    public final String getOpenAvgPrice() {
        tIX tix = tIX.KWHzl;
        String str = this.instType;
        String str2 = this.instId;
        return tix.AEQbTJ(str, str2, this.avgPx, tTN.Companion.EZpvd(str, str2, this.posSide, this.pos, this.posCcy));
    }

    public final String getLipPrice() {
        tIX tix = tIX.KWHzl;
        String str = this.instType;
        String str2 = this.instId;
        return tix.AEQbTJ(str, str2, this.liqPx, tTN.Companion.EZpvd(str, str2, this.posSide, this.pos, this.posCcy));
    }

    public final String getAmt() {
        return pTB.formatICUPercent$default(pTB.OLrzqt((Object) this.posSpace), RoundingMode.UP, C38307pTy.Companion.KWHzl(2, 2), null, Double.valueOf(100.0d), null, 20, null);
    }
}

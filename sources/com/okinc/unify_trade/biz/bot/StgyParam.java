package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.AdvancedTriggerSign$$serializer;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.DcaTriggerParam$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StgyParam implements Parcelable {
    private final String algoId;
    private final String algoOrdType;
    private final String balType;
    private final boolean basePos;
    private final String cTime;
    private final String deltaRatio;
    private String direction;
    private final String displayName;
    private final String duration;
    private final SmartEarnParam earnParams;
    private String gridNum;
    private final String initOrdAmt;
    private final String initOrdPct;
    private final String instId;
    private final String instType;
    private final String interval;
    private final String investCcy;
    private final String lever;
    private String maxPx;
    private final String maxSafetyOrds;
    private String minPx;
    private final String ordType;
    private final String pTime;
    private final String perGridProfitRatio;
    private final String perMaxProfitRate;
    private final String perMinProfitRate;
    private String pnlRatio;
    private final List<Portfolio> portfolioList;
    private final String pxSteps;
    private final String pxStepsMult;
    private final String quoteSz;
    private final boolean reserveFunds;
    private final String runType;
    private final String safetyOrdAmt;
    private final List<AdvancedTriggerSign> signParams;
    private final String slMode;
    private final String slPct;
    private final String slRatio;
    private final String slTriggerPx;
    private final String sz;
    private final String tpPct;
    private final String tpRatio;
    private final String tpTriggerPx;
    private TpSlTriggerParamReqResp tpslTriggerParam;
    private final List<DcaTriggerParam> triggerParams;
    private final String triggerType;
    private final String userRiskMode;
    private final String volMult;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StgyParam> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(Portfolio$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(DcaTriggerParam$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(AdvancedTriggerSign$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<StgyParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StgyParam createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String str;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Portfolio.CREATOR.createFromParcel(parcel));
                }
            }
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            String string20 = parcel.readString();
            String string21 = parcel.readString();
            String string22 = parcel.readString();
            String string23 = parcel.readString();
            String string24 = parcel.readString();
            String string25 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string26 = parcel.readString();
            String string27 = parcel.readString();
            String string28 = parcel.readString();
            String string29 = parcel.readString();
            String string30 = parcel.readString();
            String string31 = parcel.readString();
            String string32 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string12;
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i3);
                str = string12;
                int i4 = 0;
                while (i4 != i3) {
                    arrayList4.add(DcaTriggerParam.CREATOR.createFromParcel(parcel));
                    i4++;
                    i3 = i3;
                }
                arrayList2 = arrayList4;
            }
            String string33 = parcel.readString();
            String string34 = parcel.readString();
            String string35 = parcel.readString();
            String string36 = parcel.readString();
            String string37 = parcel.readString();
            String string38 = parcel.readString();
            TpSlTriggerParamReqResp tpSlTriggerParamReqRespCreateFromParcel = TpSlTriggerParamReqResp.CREATOR.createFromParcel(parcel);
            String string39 = parcel.readString();
            String string40 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i5);
                int i6 = 0;
                while (i6 != i5) {
                    arrayList5.add(AdvancedTriggerSign.CREATOR.createFromParcel(parcel));
                    i6++;
                    i5 = i5;
                }
                arrayList3 = arrayList5;
            }
            return new StgyParam(string, string2, string3, string4, string5, string6, string7, string8, string9, arrayList, string10, string11, str, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, z, string26, string27, string28, string29, string30, string31, string32, arrayList2, string33, string34, string35, string36, string37, string38, tpSlTriggerParamReqRespCreateFromParcel, string39, string40, z2, arrayList3, parcel.readInt() == 0 ? null : SmartEarnParam.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StgyParam[] newArray(int i) {
            return new StgyParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StgyParam() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, false, (List) null, (SmartEarnParam) null, (String) null, -1, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Portfolio> component10() {
        return this.portfolioList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.perMinProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.perMaxProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.initOrdPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component27() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.balType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.safetyOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.userRiskMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.perGridProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> component35() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.slMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp component42() {
        return this.tpslTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component45() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AdvancedTriggerSign> component46() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnParam component47() {
        return this.earnParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.deltaRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StgyParam copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<Portfolio> list, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z, String str26, String str27, String str28, String str29, String str30, String str31, String str32, List<DcaTriggerParam> list2, String str33, String str34, String str35, String str36, String str37, String str38, @NotNull TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str39, String str40, boolean z2, List<AdvancedTriggerSign> list3, SmartEarnParam smartEarnParam, String str41) {
        Intrinsics.checkNotNullParameter(tpSlTriggerParamReqResp, "");
        return new StgyParam(str, str2, str3, str4, str5, str6, str7, str8, str9, list, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, z, str26, str27, str28, str29, str30, str31, str32, list2, str33, str34, str35, str36, str37, str38, tpSlTriggerParamReqResp, str39, str40, z2, list3, smartEarnParam, str41);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StgyParam)) {
            return false;
        }
        StgyParam stgyParam = (StgyParam) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) stgyParam.algoId) && Intrinsics.EZpvd((Object) this.algoOrdType, (Object) stgyParam.algoOrdType) && Intrinsics.EZpvd((Object) this.balType, (Object) stgyParam.balType) && Intrinsics.EZpvd((Object) this.cTime, (Object) stgyParam.cTime) && Intrinsics.EZpvd((Object) this.deltaRatio, (Object) stgyParam.deltaRatio) && Intrinsics.EZpvd((Object) this.instType, (Object) stgyParam.instType) && Intrinsics.EZpvd((Object) this.investCcy, (Object) stgyParam.investCcy) && Intrinsics.EZpvd((Object) this.ordType, (Object) stgyParam.ordType) && Intrinsics.EZpvd((Object) this.pTime, (Object) stgyParam.pTime) && Intrinsics.EZpvd(this.portfolioList, stgyParam.portfolioList) && Intrinsics.EZpvd((Object) this.interval, (Object) stgyParam.interval) && Intrinsics.EZpvd((Object) this.duration, (Object) stgyParam.duration) && Intrinsics.EZpvd((Object) this.minPx, (Object) stgyParam.minPx) && Intrinsics.EZpvd((Object) this.maxPx, (Object) stgyParam.maxPx) && Intrinsics.EZpvd((Object) this.gridNum, (Object) stgyParam.gridNum) && Intrinsics.EZpvd((Object) this.perMinProfitRate, (Object) stgyParam.perMinProfitRate) && Intrinsics.EZpvd((Object) this.perMaxProfitRate, (Object) stgyParam.perMaxProfitRate) && Intrinsics.EZpvd((Object) this.runType, (Object) stgyParam.runType) && Intrinsics.EZpvd((Object) this.lever, (Object) stgyParam.lever) && Intrinsics.EZpvd((Object) this.displayName, (Object) stgyParam.displayName) && Intrinsics.EZpvd((Object) this.direction, (Object) stgyParam.direction) && Intrinsics.EZpvd((Object) this.triggerType, (Object) stgyParam.triggerType) && Intrinsics.EZpvd((Object) this.initOrdPct, (Object) stgyParam.initOrdPct) && Intrinsics.EZpvd((Object) this.maxSafetyOrds, (Object) stgyParam.maxSafetyOrds) && Intrinsics.EZpvd((Object) this.tpPct, (Object) stgyParam.tpPct) && Intrinsics.EZpvd((Object) this.pxSteps, (Object) stgyParam.pxSteps) && this.reserveFunds == stgyParam.reserveFunds && Intrinsics.EZpvd((Object) this.volMult, (Object) stgyParam.volMult) && Intrinsics.EZpvd((Object) this.pxStepsMult, (Object) stgyParam.pxStepsMult) && Intrinsics.EZpvd((Object) this.slPct, (Object) stgyParam.slPct) && Intrinsics.EZpvd((Object) this.initOrdAmt, (Object) stgyParam.initOrdAmt) && Intrinsics.EZpvd((Object) this.safetyOrdAmt, (Object) stgyParam.safetyOrdAmt) && Intrinsics.EZpvd((Object) this.userRiskMode, (Object) stgyParam.userRiskMode) && Intrinsics.EZpvd((Object) this.perGridProfitRatio, (Object) stgyParam.perGridProfitRatio) && Intrinsics.EZpvd(this.triggerParams, stgyParam.triggerParams) && Intrinsics.EZpvd((Object) this.slMode, (Object) stgyParam.slMode) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) stgyParam.pnlRatio) && Intrinsics.EZpvd((Object) this.instId, (Object) stgyParam.instId) && Intrinsics.EZpvd((Object) this.sz, (Object) stgyParam.sz) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) stgyParam.slTriggerPx) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) stgyParam.tpTriggerPx) && Intrinsics.EZpvd(this.tpslTriggerParam, stgyParam.tpslTriggerParam) && Intrinsics.EZpvd((Object) this.tpRatio, (Object) stgyParam.tpRatio) && Intrinsics.EZpvd((Object) this.slRatio, (Object) stgyParam.slRatio) && this.basePos == stgyParam.basePos && Intrinsics.EZpvd(this.signParams, stgyParam.signParams) && Intrinsics.EZpvd(this.earnParams, stgyParam.earnParams) && Intrinsics.EZpvd((Object) this.quoteSz, (Object) stgyParam.quoteSz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoOrdType() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalType() {
        return this.balType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBasePos() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeltaRatio() {
        return this.deltaRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartEarnParam getEarnParams() {
        return this.earnParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridNum() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOrdAmt() {
        return this.initOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitOrdPct() {
        return this.initOrdPct;
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
    public final String getInterval() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestCcy() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPx() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSafetyOrds() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPx() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPTime() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerGridProfitRatio() {
        return this.perGridProfitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerMaxProfitRate() {
        return this.perMaxProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerMinProfitRate() {
        return this.perMinProfitRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Portfolio> getPortfolioList() {
        return this.portfolioList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxSteps() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxStepsMult() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSz() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReserveFunds() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRunType() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafetyOrdAmt() {
        return this.safetyOrdAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AdvancedTriggerSign> getSignParams() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlMode() {
        return this.slMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlPct() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlRatio() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpPct() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpRatio() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp getTpslTriggerParam() {
        return this.tpslTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> getTriggerParams() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerType() {
        return this.triggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserRiskMode() {
        return this.userRiskMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolMult() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.algoId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.algoOrdType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.balType;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.cTime;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.deltaRatio;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.instType;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.investCcy;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.ordType;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.pTime;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        List<Portfolio> list = this.portfolioList;
        int iHashCode10 = list == null ? 0 : list.hashCode();
        String str10 = this.interval;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.duration;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.minPx;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.maxPx;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.gridNum;
        int iHashCode15 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.perMinProfitRate;
        int iHashCode16 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.perMaxProfitRate;
        int iHashCode17 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.runType;
        int iHashCode18 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.lever;
        int iHashCode19 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.displayName;
        int iHashCode20 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.direction;
        int iHashCode21 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.triggerType;
        int iHashCode22 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.initOrdPct;
        int iHashCode23 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.maxSafetyOrds;
        int iHashCode24 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.tpPct;
        int iHashCode25 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.pxSteps;
        int iHashCode26 = str25 == null ? 0 : str25.hashCode();
        int iHashCode27 = Boolean.hashCode(this.reserveFunds);
        String str26 = this.volMult;
        int iHashCode28 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.pxStepsMult;
        int iHashCode29 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.slPct;
        int iHashCode30 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.initOrdAmt;
        int iHashCode31 = str29 == null ? 0 : str29.hashCode();
        String str30 = this.safetyOrdAmt;
        int iHashCode32 = str30 == null ? 0 : str30.hashCode();
        String str31 = this.userRiskMode;
        int iHashCode33 = str31 == null ? 0 : str31.hashCode();
        String str32 = this.perGridProfitRatio;
        int iHashCode34 = str32 == null ? 0 : str32.hashCode();
        List<DcaTriggerParam> list2 = this.triggerParams;
        int iHashCode35 = list2 == null ? 0 : list2.hashCode();
        String str33 = this.slMode;
        int iHashCode36 = str33 == null ? 0 : str33.hashCode();
        String str34 = this.pnlRatio;
        int iHashCode37 = str34 == null ? 0 : str34.hashCode();
        String str35 = this.instId;
        int iHashCode38 = str35 == null ? 0 : str35.hashCode();
        String str36 = this.sz;
        int iHashCode39 = str36 == null ? 0 : str36.hashCode();
        String str37 = this.slTriggerPx;
        int iHashCode40 = str37 == null ? 0 : str37.hashCode();
        String str38 = this.tpTriggerPx;
        int iHashCode41 = str38 == null ? 0 : str38.hashCode();
        int iHashCode42 = this.tpslTriggerParam.hashCode();
        String str39 = this.tpRatio;
        int iHashCode43 = str39 == null ? 0 : str39.hashCode();
        String str40 = this.slRatio;
        int iHashCode44 = str40 == null ? 0 : str40.hashCode();
        int iHashCode45 = Boolean.hashCode(this.basePos);
        List<AdvancedTriggerSign> list3 = this.signParams;
        int iHashCode46 = list3 == null ? 0 : list3.hashCode();
        SmartEarnParam smartEarnParam = this.earnParams;
        int iHashCode47 = smartEarnParam == null ? 0 : smartEarnParam.hashCode();
        String str41 = this.quoteSz;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + (str41 == null ? 0 : str41.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(String str) {
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridNum(String str) {
        this.gridNum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPx(String str) {
        this.maxPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinPx(String str) {
        this.minPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatio(String str) {
        this.pnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpslTriggerParam(@NotNull TpSlTriggerParamReqResp tpSlTriggerParamReqResp) {
        Intrinsics.checkNotNullParameter(tpSlTriggerParamReqResp, "");
        this.tpslTriggerParam = tpSlTriggerParamReqResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StgyParam(algoId=" + this.algoId + ", algoOrdType=" + this.algoOrdType + ", balType=" + this.balType + ", cTime=" + this.cTime + ", deltaRatio=" + this.deltaRatio + ", instType=" + this.instType + ", investCcy=" + this.investCcy + ", ordType=" + this.ordType + ", pTime=" + this.pTime + ", portfolioList=" + this.portfolioList + ", interval=" + this.interval + ", duration=" + this.duration + ", minPx=" + this.minPx + ", maxPx=" + this.maxPx + ", gridNum=" + this.gridNum + ", perMinProfitRate=" + this.perMinProfitRate + ", perMaxProfitRate=" + this.perMaxProfitRate + ", runType=" + this.runType + ", lever=" + this.lever + ", displayName=" + this.displayName + ", direction=" + this.direction + ", triggerType=" + this.triggerType + ", initOrdPct=" + this.initOrdPct + ", maxSafetyOrds=" + this.maxSafetyOrds + ", tpPct=" + this.tpPct + ", pxSteps=" + this.pxSteps + ", reserveFunds=" + this.reserveFunds + ", volMult=" + this.volMult + ", pxStepsMult=" + this.pxStepsMult + ", slPct=" + this.slPct + ", initOrdAmt=" + this.initOrdAmt + ", safetyOrdAmt=" + this.safetyOrdAmt + ", userRiskMode=" + this.userRiskMode + ", perGridProfitRatio=" + this.perGridProfitRatio + ", triggerParams=" + this.triggerParams + ", slMode=" + this.slMode + ", pnlRatio=" + this.pnlRatio + ", instId=" + this.instId + ", sz=" + this.sz + ", slTriggerPx=" + this.slTriggerPx + ", tpTriggerPx=" + this.tpTriggerPx + ", tpslTriggerParam=" + this.tpslTriggerParam + ", tpRatio=" + this.tpRatio + ", slRatio=" + this.slRatio + ", basePos=" + this.basePos + ", signParams=" + this.signParams + ", earnParams=" + this.earnParams + ", quoteSz=" + this.quoteSz + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.algoOrdType);
        parcel.writeString(this.balType);
        parcel.writeString(this.cTime);
        parcel.writeString(this.deltaRatio);
        parcel.writeString(this.instType);
        parcel.writeString(this.investCcy);
        parcel.writeString(this.ordType);
        parcel.writeString(this.pTime);
        List<Portfolio> list = this.portfolioList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Portfolio> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.interval);
        parcel.writeString(this.duration);
        parcel.writeString(this.minPx);
        parcel.writeString(this.maxPx);
        parcel.writeString(this.gridNum);
        parcel.writeString(this.perMinProfitRate);
        parcel.writeString(this.perMaxProfitRate);
        parcel.writeString(this.runType);
        parcel.writeString(this.lever);
        parcel.writeString(this.displayName);
        parcel.writeString(this.direction);
        parcel.writeString(this.triggerType);
        parcel.writeString(this.initOrdPct);
        parcel.writeString(this.maxSafetyOrds);
        parcel.writeString(this.tpPct);
        parcel.writeString(this.pxSteps);
        parcel.writeInt(this.reserveFunds ? 1 : 0);
        parcel.writeString(this.volMult);
        parcel.writeString(this.pxStepsMult);
        parcel.writeString(this.slPct);
        parcel.writeString(this.initOrdAmt);
        parcel.writeString(this.safetyOrdAmt);
        parcel.writeString(this.userRiskMode);
        parcel.writeString(this.perGridProfitRatio);
        List<DcaTriggerParam> list2 = this.triggerParams;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<DcaTriggerParam> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.slMode);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.instId);
        parcel.writeString(this.sz);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.tpTriggerPx);
        this.tpslTriggerParam.writeToParcel(parcel, i);
        parcel.writeString(this.tpRatio);
        parcel.writeString(this.slRatio);
        parcel.writeInt(this.basePos ? 1 : 0);
        List<AdvancedTriggerSign> list3 = this.signParams;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<AdvancedTriggerSign> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        SmartEarnParam smartEarnParam = this.earnParams;
        if (smartEarnParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            smartEarnParam.writeToParcel(parcel, i);
        }
        parcel.writeString(this.quoteSz);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.StgyParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StgyParam> serializer() {
            return StgyParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StgyParam(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z, String str26, String str27, String str28, String str29, String str30, String str31, String str32, List list2, String str33, String str34, String str35, String str36, String str37, String str38, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str39, String str40, boolean z2, List list3, SmartEarnParam smartEarnParam, String str41, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = null;
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.algoOrdType = null;
        } else {
            this.algoOrdType = str2;
        }
        if ((i & 4) == 0) {
            this.balType = null;
        } else {
            this.balType = str3;
        }
        if ((i & 8) == 0) {
            this.cTime = null;
        } else {
            this.cTime = str4;
        }
        if ((i & 16) == 0) {
            this.deltaRatio = null;
        } else {
            this.deltaRatio = str5;
        }
        if ((i & 32) == 0) {
            this.instType = null;
        } else {
            this.instType = str6;
        }
        if ((i & 64) == 0) {
            this.investCcy = null;
        } else {
            this.investCcy = str7;
        }
        if ((i & 128) == 0) {
            this.ordType = null;
        } else {
            this.ordType = str8;
        }
        if ((i & 256) == 0) {
            this.pTime = null;
        } else {
            this.pTime = str9;
        }
        if ((i & 512) == 0) {
            this.portfolioList = null;
        } else {
            this.portfolioList = list;
        }
        if ((i & 1024) == 0) {
            this.interval = null;
        } else {
            this.interval = str10;
        }
        if ((i & 2048) == 0) {
            this.duration = null;
        } else {
            this.duration = str11;
        }
        if ((i & 4096) == 0) {
            this.minPx = null;
        } else {
            this.minPx = str12;
        }
        if ((i & 8192) == 0) {
            this.maxPx = null;
        } else {
            this.maxPx = str13;
        }
        if ((i & 16384) == 0) {
            this.gridNum = null;
        } else {
            this.gridNum = str14;
        }
        if ((i & 32768) == 0) {
            this.perMinProfitRate = null;
        } else {
            this.perMinProfitRate = str15;
        }
        if ((65536 & i) == 0) {
            this.perMaxProfitRate = null;
        } else {
            this.perMaxProfitRate = str16;
        }
        if ((131072 & i) == 0) {
            this.runType = null;
        } else {
            this.runType = str17;
        }
        if ((262144 & i) == 0) {
            this.lever = null;
        } else {
            this.lever = str18;
        }
        if ((524288 & i) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str19;
        }
        if ((1048576 & i) == 0) {
            this.direction = null;
        } else {
            this.direction = str20;
        }
        if ((2097152 & i) == 0) {
            this.triggerType = null;
        } else {
            this.triggerType = str21;
        }
        if ((4194304 & i) == 0) {
            this.initOrdPct = null;
        } else {
            this.initOrdPct = str22;
        }
        if ((8388608 & i) == 0) {
            this.maxSafetyOrds = null;
        } else {
            this.maxSafetyOrds = str23;
        }
        if ((16777216 & i) == 0) {
            this.tpPct = null;
        } else {
            this.tpPct = str24;
        }
        if ((33554432 & i) == 0) {
            this.pxSteps = null;
        } else {
            this.pxSteps = str25;
        }
        this.reserveFunds = (67108864 & i) == 0 ? true : z;
        if ((134217728 & i) == 0) {
            this.volMult = null;
        } else {
            this.volMult = str26;
        }
        if ((268435456 & i) == 0) {
            this.pxStepsMult = null;
        } else {
            this.pxStepsMult = str27;
        }
        if ((536870912 & i) == 0) {
            this.slPct = null;
        } else {
            this.slPct = str28;
        }
        if ((1073741824 & i) == 0) {
            this.initOrdAmt = null;
        } else {
            this.initOrdAmt = str29;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.safetyOrdAmt = null;
        } else {
            this.safetyOrdAmt = str30;
        }
        if ((i2 & 1) == 0) {
            this.userRiskMode = null;
        } else {
            this.userRiskMode = str31;
        }
        if ((i2 & 2) == 0) {
            this.perGridProfitRatio = null;
        } else {
            this.perGridProfitRatio = str32;
        }
        if ((i2 & 4) == 0) {
            this.triggerParams = null;
        } else {
            this.triggerParams = list2;
        }
        if ((i2 & 8) == 0) {
            this.slMode = null;
        } else {
            this.slMode = str33;
        }
        if ((i2 & 16) == 0) {
            this.pnlRatio = null;
        } else {
            this.pnlRatio = str34;
        }
        if ((i2 & 32) == 0) {
            this.instId = null;
        } else {
            this.instId = str35;
        }
        if ((i2 & 64) == 0) {
            this.sz = null;
        } else {
            this.sz = str36;
        }
        if ((i2 & 128) == 0) {
            this.slTriggerPx = null;
        } else {
            this.slTriggerPx = str37;
        }
        if ((i2 & 256) == 0) {
            this.tpTriggerPx = null;
        } else {
            this.tpTriggerPx = str38;
        }
        this.tpslTriggerParam = (i2 & 512) == 0 ? new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null) : tpSlTriggerParamReqResp;
        if ((i2 & 1024) == 0) {
            this.tpRatio = null;
        } else {
            this.tpRatio = str39;
        }
        if ((i2 & 2048) == 0) {
            this.slRatio = null;
        } else {
            this.slRatio = str40;
        }
        this.basePos = (i2 & 4096) == 0 ? false : z2;
        if ((i2 & 8192) == 0) {
            this.signParams = null;
        } else {
            this.signParams = list3;
        }
        if ((i2 & 16384) == 0) {
            this.earnParams = null;
        } else {
            this.earnParams = smartEarnParam;
        }
        if ((i2 & 32768) == 0) {
            this.quoteSz = null;
        } else {
            this.quoteSz = str41;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(StgyParam stgyParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || stgyParam.algoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, stgyParam.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || stgyParam.algoOrdType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, stgyParam.algoOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || stgyParam.balType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, stgyParam.balType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || stgyParam.cTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, stgyParam.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || stgyParam.deltaRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, stgyParam.deltaRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || stgyParam.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, stgyParam.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || stgyParam.investCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, stgyParam.investCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || stgyParam.ordType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, stgyParam.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || stgyParam.pTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, stgyParam.pTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || stgyParam.portfolioList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], stgyParam.portfolioList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || stgyParam.interval != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, stgyParam.interval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || stgyParam.duration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, stgyParam.duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || stgyParam.minPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, stgyParam.minPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || stgyParam.maxPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, stgyParam.maxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || stgyParam.gridNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, stgyParam.gridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || stgyParam.perMinProfitRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, stgyParam.perMinProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || stgyParam.perMaxProfitRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, stgyParam.perMaxProfitRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || stgyParam.runType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, stgyParam.runType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || stgyParam.lever != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, stgyParam.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || stgyParam.displayName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, stgyParam.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || stgyParam.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, stgyParam.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || stgyParam.triggerType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, stgyParam.triggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || stgyParam.initOrdPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, stgyParam.initOrdPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || stgyParam.maxSafetyOrds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, stgyParam.maxSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || stgyParam.tpPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, stgyParam.tpPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || stgyParam.pxSteps != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, stgyParam.pxSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !stgyParam.reserveFunds) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 26, stgyParam.reserveFunds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || stgyParam.volMult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, stgyParam.volMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || stgyParam.pxStepsMult != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, stgyParam.pxStepsMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || stgyParam.slPct != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, stgyParam.slPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || stgyParam.initOrdAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, stgyParam.initOrdAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || stgyParam.safetyOrdAmt != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, stgyParam.safetyOrdAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || stgyParam.userRiskMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, StringSerializer.INSTANCE, stgyParam.userRiskMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || stgyParam.perGridProfitRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, StringSerializer.INSTANCE, stgyParam.perGridProfitRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || stgyParam.triggerParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, kSerializerArr[34], stgyParam.triggerParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || stgyParam.slMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, stgyParam.slMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || stgyParam.pnlRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, StringSerializer.INSTANCE, stgyParam.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || stgyParam.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 37, StringSerializer.INSTANCE, stgyParam.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || stgyParam.sz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 38, StringSerializer.INSTANCE, stgyParam.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || stgyParam.slTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 39, StringSerializer.INSTANCE, stgyParam.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || stgyParam.tpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 40, StringSerializer.INSTANCE, stgyParam.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd(stgyParam.tpslTriggerParam, new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 41, TpSlTriggerParamReqResp$$serializer.INSTANCE, stgyParam.tpslTriggerParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || stgyParam.tpRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 42, StringSerializer.INSTANCE, stgyParam.tpRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || stgyParam.slRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 43, StringSerializer.INSTANCE, stgyParam.slRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || stgyParam.basePos) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 44, stgyParam.basePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || stgyParam.signParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 45, kSerializerArr[45], stgyParam.signParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || stgyParam.earnParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 46, SmartEarnParam$$serializer.INSTANCE, stgyParam.earnParams);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) && stgyParam.quoteSz == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 47, StringSerializer.INSTANCE, stgyParam.quoteSz);
    }

    public StgyParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<Portfolio> list, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z, String str26, String str27, String str28, String str29, String str30, String str31, String str32, List<DcaTriggerParam> list2, String str33, String str34, String str35, String str36, String str37, String str38, @NotNull TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str39, String str40, boolean z2, List<AdvancedTriggerSign> list3, SmartEarnParam smartEarnParam, String str41) {
        Intrinsics.checkNotNullParameter(tpSlTriggerParamReqResp, "");
        this.algoId = str;
        this.algoOrdType = str2;
        this.balType = str3;
        this.cTime = str4;
        this.deltaRatio = str5;
        this.instType = str6;
        this.investCcy = str7;
        this.ordType = str8;
        this.pTime = str9;
        this.portfolioList = list;
        this.interval = str10;
        this.duration = str11;
        this.minPx = str12;
        this.maxPx = str13;
        this.gridNum = str14;
        this.perMinProfitRate = str15;
        this.perMaxProfitRate = str16;
        this.runType = str17;
        this.lever = str18;
        this.displayName = str19;
        this.direction = str20;
        this.triggerType = str21;
        this.initOrdPct = str22;
        this.maxSafetyOrds = str23;
        this.tpPct = str24;
        this.pxSteps = str25;
        this.reserveFunds = z;
        this.volMult = str26;
        this.pxStepsMult = str27;
        this.slPct = str28;
        this.initOrdAmt = str29;
        this.safetyOrdAmt = str30;
        this.userRiskMode = str31;
        this.perGridProfitRatio = str32;
        this.triggerParams = list2;
        this.slMode = str33;
        this.pnlRatio = str34;
        this.instId = str35;
        this.sz = str36;
        this.slTriggerPx = str37;
        this.tpTriggerPx = str38;
        this.tpslTriggerParam = tpSlTriggerParamReqResp;
        this.tpRatio = str39;
        this.slRatio = str40;
        this.basePos = z2;
        this.signParams = list3;
        this.earnParams = smartEarnParam;
        this.quoteSz = str41;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x024c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r97v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r97v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r97v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r97v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r97v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r97v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r97v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r97v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r97v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004c: ARITH (r97v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r58v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r97v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r97v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r97v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.String:0x0074: TERNARY null = ((wrap:int:0x006c: ARITH (r97v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r97v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0081: ARITH (r97v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008c: ARITH (r97v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0097: ARITH (r97v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r97v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r97v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b8: ARITH (r97v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c3: ARITH (r97v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ce: ARITH (r97v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d9: ARITH (r97v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e4: ARITH (r97v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ef: ARITH (r97v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r74v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00fa: ARITH (r97v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? true : (r75v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0105: ARITH (r97v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0110: ARITH (r97v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011b: ARITH (r97v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0126: ARITH (r97v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0131: ARITH (r97v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0139: ARITH (r98v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0142: ARITH (r98v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r82v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x014b: ARITH (r98v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r83v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0154: ARITH (r98v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015d: ARITH (r98v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r85v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0166: ARITH (r98v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r86v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016f: ARITH (r98v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r87v0 java.lang.String))
  (wrap:java.lang.String:0x0182: TERNARY null = ((wrap:int:0x017a: ARITH (r98v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r88v0 java.lang.String))
  (wrap:java.lang.String:0x018c: TERNARY null = ((wrap:int:0x0184: ARITH (r98v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r89v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp:0x01b0: TERNARY null = ((wrap:int:0x018e: ARITH (r98v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01aa: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.ArrayList:?: CAST (java.util.ArrayList) (null java.util.ArrayList))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:108) call: com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp.<init>(java.lang.String, java.lang.String, java.util.ArrayList, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r90v0 com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp))
  (wrap:java.lang.String:0x01ba: TERNARY null = ((wrap:int:0x01b2: ARITH (r98v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r91v0 java.lang.String))
  (wrap:java.lang.String:0x01c4: TERNARY null = ((wrap:int:0x01bc: ARITH (r98v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r92v0 java.lang.String))
  (wrap:boolean:0x01ce: TERNARY null = ((wrap:int:0x01c6: ARITH (r98v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r93v0 boolean))
  (wrap:java.util.List:0x01d8: TERNARY null = ((wrap:int:0x01d0: ARITH (r98v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r94v0 java.util.List))
  (wrap:com.okinc.unify_trade.biz.bot.SmartEarnParam:?: TERNARY null = ((wrap:int:0x01da: ARITH (r98v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.SmartEarnParam) : (r95v0 com.okinc.unify_trade.biz.bot.SmartEarnParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e2: ARITH (r98v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r96v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.bot.Portfolio>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.DcaTriggerParam>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.unify_trade.biz.AdvancedTriggerSign>, com.okinc.unify_trade.biz.bot.SmartEarnParam, java.lang.String):void (m)] (LINE:66) call: com.okinc.unify_trade.biz.bot.StgyParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp, java.lang.String, java.lang.String, boolean, java.util.List, com.okinc.unify_trade.biz.bot.SmartEarnParam, java.lang.String):void type: THIS */
    public /* synthetic */ StgyParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, boolean z, String str26, String str27, String str28, String str29, String str30, String str31, String str32, List list2, String str33, String str34, String str35, String str36, String str37, String str38, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, String str39, String str40, boolean z2, List list3, SmartEarnParam smartEarnParam, String str41, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : str17, (i & 262144) != 0 ? null : str18, (i & 524288) != 0 ? null : str19, (i & 1048576) != 0 ? null : str20, (i & 2097152) != 0 ? null : str21, (i & 4194304) != 0 ? null : str22, (i & 8388608) != 0 ? null : str23, (i & 16777216) != 0 ? null : str24, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str25, (i & 67108864) != 0 ? true : z, (i & 134217728) != 0 ? null : str26, (i & 268435456) != 0 ? null : str27, (i & 536870912) != 0 ? null : str28, (i & 1073741824) != 0 ? null : str29, (i & Integer.MIN_VALUE) != 0 ? null : str30, (i2 & 1) != 0 ? null : str31, (i2 & 2) != 0 ? null : str32, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : str33, (i2 & 16) != 0 ? null : str34, (i2 & 32) != 0 ? null : str35, (i2 & 64) != 0 ? null : str36, (i2 & 128) != 0 ? null : str37, (i2 & 256) != 0 ? null : str38, (i2 & 512) != 0 ? new TpSlTriggerParamReqResp((String) null, (String) null, (ArrayList) null, 7, (DefaultConstructorMarker) null) : tpSlTriggerParamReqResp, (i2 & 1024) != 0 ? null : str39, (i2 & 2048) != 0 ? null : str40, (i2 & 4096) != 0 ? false : z2, (i2 & 8192) != 0 ? null : list3, (i2 & 16384) != 0 ? null : smartEarnParam, (i2 & 32768) != 0 ? null : str41);
    }
}

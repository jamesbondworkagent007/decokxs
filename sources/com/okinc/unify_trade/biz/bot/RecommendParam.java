package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class RecommendParam implements Parcelable {
    private final boolean basePos;
    private final String direction;
    private final EarnParam earnParam;
    private final String gridNum;
    private final String initOrdPct;
    private final String instId;
    private final String instType;
    private final String lever;
    private final String maxPx;
    private final String maxSafetyOrds;
    private final String minPx;
    private final String ordType;
    private final String pnlRatio;
    private final String pxSteps;
    private final String pxStepsMult;
    private final String quoteSz;
    private final boolean reserveFunds;
    private final String runType;
    private final List<SignParam> signParams;
    private final String slMode;
    private final String slPct;
    private final String slRatio;
    private final String slTriggerPx;
    private final String sz;
    private final String tag;
    private final String tpPct;
    private final String tpRatio;
    private final String tpTriggerPx;
    private final TpSlTriggerParamReqResp tpslTriggerParam;
    private final List<TriggerParam> triggerParams;
    private final String userRiskMode;
    private final String volMult;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecommendParam> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(TriggerParam$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SignParam$$serializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<RecommendParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = 0;
            boolean z = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(TriggerParam.CREATOR.createFromParcel(parcel));
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
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
            boolean z2 = parcel.readInt() != 0;
            String string25 = parcel.readString();
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            while (i != i4) {
                arrayList2.add(SignParam.CREATOR.createFromParcel(parcel));
                i++;
                i4 = i4;
            }
            return new RecommendParam(string, z, string2, string3, string4, string5, string6, arrayList, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, z2, string25, arrayList2, parcel.readInt() == 0 ? null : EarnParam.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? TpSlTriggerParamReqResp.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendParam[] newArray(int i) {
            return new RecommendParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecommendParam() {
        this(null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, -1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.pxStepsMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.volMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.tpPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.slPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.pxSteps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.initOrdPct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.gridNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.minPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.reserveFunds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.maxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.runType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.tpRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.slRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component27() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignParam> component29() {
        return this.signParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnParam component30() {
        return this.earnParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TpSlTriggerParamReqResp component32() {
        return this.tpslTriggerParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.userRiskMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.slMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TriggerParam> component8() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.maxSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendParam copy(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<TriggerParam> list, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, boolean z2, @NotNull String str25, @NotNull List<SignParam> list2, EarnParam earnParam, String str26, TpSlTriggerParamReqResp tpSlTriggerParamReqResp) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
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
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new RecommendParam(str, z, str2, str3, str4, str5, str6, list, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, z2, str25, list2, earnParam, str26, tpSlTriggerParamReqResp);
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
        if (!(obj instanceof RecommendParam)) {
            return false;
        }
        RecommendParam recommendParam = (RecommendParam) obj;
        return Intrinsics.EZpvd((Object) this.pnlRatio, (Object) recommendParam.pnlRatio) && this.reserveFunds == recommendParam.reserveFunds && Intrinsics.EZpvd((Object) this.direction, (Object) recommendParam.direction) && Intrinsics.EZpvd((Object) this.instId, (Object) recommendParam.instId) && Intrinsics.EZpvd((Object) this.userRiskMode, (Object) recommendParam.userRiskMode) && Intrinsics.EZpvd((Object) this.lever, (Object) recommendParam.lever) && Intrinsics.EZpvd((Object) this.slMode, (Object) recommendParam.slMode) && Intrinsics.EZpvd(this.triggerParams, recommendParam.triggerParams) && Intrinsics.EZpvd((Object) this.maxSafetyOrds, (Object) recommendParam.maxSafetyOrds) && Intrinsics.EZpvd((Object) this.pxStepsMult, (Object) recommendParam.pxStepsMult) && Intrinsics.EZpvd((Object) this.volMult, (Object) recommendParam.volMult) && Intrinsics.EZpvd((Object) this.tag, (Object) recommendParam.tag) && Intrinsics.EZpvd((Object) this.tpPct, (Object) recommendParam.tpPct) && Intrinsics.EZpvd((Object) this.slPct, (Object) recommendParam.slPct) && Intrinsics.EZpvd((Object) this.pxSteps, (Object) recommendParam.pxSteps) && Intrinsics.EZpvd((Object) this.initOrdPct, (Object) recommendParam.initOrdPct) && Intrinsics.EZpvd((Object) this.instType, (Object) recommendParam.instType) && Intrinsics.EZpvd((Object) this.gridNum, (Object) recommendParam.gridNum) && Intrinsics.EZpvd((Object) this.minPx, (Object) recommendParam.minPx) && Intrinsics.EZpvd((Object) this.maxPx, (Object) recommendParam.maxPx) && Intrinsics.EZpvd((Object) this.sz, (Object) recommendParam.sz) && Intrinsics.EZpvd((Object) this.runType, (Object) recommendParam.runType) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) recommendParam.slTriggerPx) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) recommendParam.tpTriggerPx) && Intrinsics.EZpvd((Object) this.tpRatio, (Object) recommendParam.tpRatio) && Intrinsics.EZpvd((Object) this.slRatio, (Object) recommendParam.slRatio) && this.basePos == recommendParam.basePos && Intrinsics.EZpvd((Object) this.ordType, (Object) recommendParam.ordType) && Intrinsics.EZpvd(this.signParams, recommendParam.signParams) && Intrinsics.EZpvd(this.earnParam, recommendParam.earnParam) && Intrinsics.EZpvd((Object) this.quoteSz, (Object) recommendParam.quoteSz) && Intrinsics.EZpvd(this.tpslTriggerParam, recommendParam.tpslTriggerParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBasePos() {
        return this.basePos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnParam getEarnParam() {
        return this.earnParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridNum() {
        return this.gridNum;
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
    public final String getPnlRatio() {
        return this.pnlRatio;
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
    public final List<SignParam> getSignParams() {
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
    public final String getTag() {
        return this.tag;
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
    public final List<TriggerParam> getTriggerParams() {
        return this.triggerParams;
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
        int iHashCode = this.pnlRatio.hashCode();
        int iHashCode2 = Boolean.hashCode(this.reserveFunds);
        int iHashCode3 = this.direction.hashCode();
        int iHashCode4 = this.instId.hashCode();
        int iHashCode5 = this.userRiskMode.hashCode();
        int iHashCode6 = this.lever.hashCode();
        int iHashCode7 = this.slMode.hashCode();
        int iHashCode8 = this.triggerParams.hashCode();
        int iHashCode9 = this.maxSafetyOrds.hashCode();
        int iHashCode10 = this.pxStepsMult.hashCode();
        int iHashCode11 = this.volMult.hashCode();
        int iHashCode12 = this.tag.hashCode();
        int iHashCode13 = this.tpPct.hashCode();
        int iHashCode14 = this.slPct.hashCode();
        int iHashCode15 = this.pxSteps.hashCode();
        int iHashCode16 = this.initOrdPct.hashCode();
        int iHashCode17 = this.instType.hashCode();
        int iHashCode18 = this.gridNum.hashCode();
        int iHashCode19 = this.minPx.hashCode();
        int iHashCode20 = this.maxPx.hashCode();
        int iHashCode21 = this.sz.hashCode();
        int iHashCode22 = this.runType.hashCode();
        int iHashCode23 = this.slTriggerPx.hashCode();
        int iHashCode24 = this.tpTriggerPx.hashCode();
        int iHashCode25 = this.tpRatio.hashCode();
        int iHashCode26 = this.slRatio.hashCode();
        int iHashCode27 = Boolean.hashCode(this.basePos);
        int iHashCode28 = this.ordType.hashCode();
        int iHashCode29 = this.signParams.hashCode();
        EarnParam earnParam = this.earnParam;
        int iHashCode30 = earnParam == null ? 0 : earnParam.hashCode();
        String str = this.quoteSz;
        int iHashCode31 = str == null ? 0 : str.hashCode();
        TpSlTriggerParamReqResp tpSlTriggerParamReqResp = this.tpslTriggerParam;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + (tpSlTriggerParamReqResp != null ? tpSlTriggerParamReqResp.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecommendParam(pnlRatio=" + this.pnlRatio + ", reserveFunds=" + this.reserveFunds + ", direction=" + this.direction + ", instId=" + this.instId + ", userRiskMode=" + this.userRiskMode + ", lever=" + this.lever + ", slMode=" + this.slMode + ", triggerParams=" + this.triggerParams + ", maxSafetyOrds=" + this.maxSafetyOrds + ", pxStepsMult=" + this.pxStepsMult + ", volMult=" + this.volMult + ", tag=" + this.tag + ", tpPct=" + this.tpPct + ", slPct=" + this.slPct + ", pxSteps=" + this.pxSteps + ", initOrdPct=" + this.initOrdPct + ", instType=" + this.instType + ", gridNum=" + this.gridNum + ", minPx=" + this.minPx + ", maxPx=" + this.maxPx + ", sz=" + this.sz + ", runType=" + this.runType + ", slTriggerPx=" + this.slTriggerPx + ", tpTriggerPx=" + this.tpTriggerPx + ", tpRatio=" + this.tpRatio + ", slRatio=" + this.slRatio + ", basePos=" + this.basePos + ", ordType=" + this.ordType + ", signParams=" + this.signParams + ", earnParam=" + this.earnParam + ", quoteSz=" + this.quoteSz + ", tpslTriggerParam=" + this.tpslTriggerParam + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.pnlRatio);
        parcel.writeInt(this.reserveFunds ? 1 : 0);
        parcel.writeString(this.direction);
        parcel.writeString(this.instId);
        parcel.writeString(this.userRiskMode);
        parcel.writeString(this.lever);
        parcel.writeString(this.slMode);
        List<TriggerParam> list = this.triggerParams;
        parcel.writeInt(list.size());
        Iterator<TriggerParam> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.maxSafetyOrds);
        parcel.writeString(this.pxStepsMult);
        parcel.writeString(this.volMult);
        parcel.writeString(this.tag);
        parcel.writeString(this.tpPct);
        parcel.writeString(this.slPct);
        parcel.writeString(this.pxSteps);
        parcel.writeString(this.initOrdPct);
        parcel.writeString(this.instType);
        parcel.writeString(this.gridNum);
        parcel.writeString(this.minPx);
        parcel.writeString(this.maxPx);
        parcel.writeString(this.sz);
        parcel.writeString(this.runType);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.tpRatio);
        parcel.writeString(this.slRatio);
        parcel.writeInt(this.basePos ? 1 : 0);
        parcel.writeString(this.ordType);
        List<SignParam> list2 = this.signParams;
        parcel.writeInt(list2.size());
        Iterator<SignParam> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        EarnParam earnParam = this.earnParam;
        if (earnParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            earnParam.writeToParcel(parcel, i);
        }
        parcel.writeString(this.quoteSz);
        TpSlTriggerParamReqResp tpSlTriggerParamReqResp = this.tpslTriggerParam;
        if (tpSlTriggerParamReqResp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tpSlTriggerParamReqResp.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.RecommendParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecommendParam> serializer() {
            return RecommendParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecommendParam(int i, int i2, String str, boolean z, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, boolean z2, String str25, List list2, EarnParam earnParam, String str26, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str;
        }
        if ((i & 2) == 0) {
            this.reserveFunds = false;
        } else {
            this.reserveFunds = z;
        }
        if ((i & 4) == 0) {
            this.direction = "";
        } else {
            this.direction = str2;
        }
        if ((i & 8) == 0) {
            this.instId = "";
        } else {
            this.instId = str3;
        }
        if ((i & 16) == 0) {
            this.userRiskMode = "";
        } else {
            this.userRiskMode = str4;
        }
        if ((i & 32) == 0) {
            this.lever = "";
        } else {
            this.lever = str5;
        }
        if ((i & 64) == 0) {
            this.slMode = "";
        } else {
            this.slMode = str6;
        }
        this.triggerParams = (i & 128) == 0 ? yDY.AhwBna() : list;
        if ((i & 256) == 0) {
            this.maxSafetyOrds = "";
        } else {
            this.maxSafetyOrds = str7;
        }
        if ((i & 512) == 0) {
            this.pxStepsMult = "";
        } else {
            this.pxStepsMult = str8;
        }
        if ((i & 1024) == 0) {
            this.volMult = "";
        } else {
            this.volMult = str9;
        }
        if ((i & 2048) == 0) {
            this.tag = "";
        } else {
            this.tag = str10;
        }
        if ((i & 4096) == 0) {
            this.tpPct = "";
        } else {
            this.tpPct = str11;
        }
        if ((i & 8192) == 0) {
            this.slPct = "";
        } else {
            this.slPct = str12;
        }
        if ((i & 16384) == 0) {
            this.pxSteps = "";
        } else {
            this.pxSteps = str13;
        }
        if ((32768 & i) == 0) {
            this.initOrdPct = "";
        } else {
            this.initOrdPct = str14;
        }
        if ((65536 & i) == 0) {
            this.instType = "";
        } else {
            this.instType = str15;
        }
        if ((131072 & i) == 0) {
            this.gridNum = "";
        } else {
            this.gridNum = str16;
        }
        if ((262144 & i) == 0) {
            this.minPx = "";
        } else {
            this.minPx = str17;
        }
        if ((524288 & i) == 0) {
            this.maxPx = "";
        } else {
            this.maxPx = str18;
        }
        if ((1048576 & i) == 0) {
            this.sz = "";
        } else {
            this.sz = str19;
        }
        if ((2097152 & i) == 0) {
            this.runType = "";
        } else {
            this.runType = str20;
        }
        if ((4194304 & i) == 0) {
            this.slTriggerPx = "";
        } else {
            this.slTriggerPx = str21;
        }
        if ((8388608 & i) == 0) {
            this.tpTriggerPx = "";
        } else {
            this.tpTriggerPx = str22;
        }
        if ((16777216 & i) == 0) {
            this.tpRatio = "";
        } else {
            this.tpRatio = str23;
        }
        if ((33554432 & i) == 0) {
            this.slRatio = "";
        } else {
            this.slRatio = str24;
        }
        this.basePos = (67108864 & i) != 0 ? z2 : false;
        if ((134217728 & i) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str25;
        }
        this.signParams = (268435456 & i) == 0 ? yDY.AhwBna() : list2;
        if ((536870912 & i) == 0) {
            this.earnParam = null;
        } else {
            this.earnParam = earnParam;
        }
        if ((1073741824 & i) == 0) {
            this.quoteSz = null;
        } else {
            this.quoteSz = str26;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.tpslTriggerParam = null;
        } else {
            this.tpslTriggerParam = tpSlTriggerParamReqResp;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RecommendParam recommendParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) recommendParam.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, recommendParam.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || recommendParam.reserveFunds) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, recommendParam.reserveFunds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) recommendParam.direction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, recommendParam.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) recommendParam.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, recommendParam.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) recommendParam.userRiskMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, recommendParam.userRiskMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) recommendParam.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, recommendParam.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) recommendParam.slMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, recommendParam.slMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(recommendParam.triggerParams, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], recommendParam.triggerParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) recommendParam.maxSafetyOrds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, recommendParam.maxSafetyOrds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) recommendParam.pxStepsMult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, recommendParam.pxStepsMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) recommendParam.volMult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, recommendParam.volMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) recommendParam.tag, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, recommendParam.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) recommendParam.tpPct, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, recommendParam.tpPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) recommendParam.slPct, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, recommendParam.slPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) recommendParam.pxSteps, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, recommendParam.pxSteps);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) recommendParam.initOrdPct, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, recommendParam.initOrdPct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) recommendParam.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, recommendParam.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) recommendParam.gridNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, recommendParam.gridNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) recommendParam.minPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, recommendParam.minPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) recommendParam.maxPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, recommendParam.maxPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) recommendParam.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, recommendParam.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) recommendParam.runType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, recommendParam.runType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) recommendParam.slTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, recommendParam.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) recommendParam.tpTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, recommendParam.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) recommendParam.tpRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, recommendParam.tpRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) recommendParam.slRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, recommendParam.slRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || recommendParam.basePos) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 26, recommendParam.basePos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) recommendParam.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, recommendParam.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd(recommendParam.signParams, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 28, kSerializerArr[28], recommendParam.signParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || recommendParam.earnParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, EarnParam$$serializer.INSTANCE, recommendParam.earnParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || recommendParam.quoteSz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, recommendParam.quoteSz);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) && recommendParam.tpslTriggerParam == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, TpSlTriggerParamReqResp$$serializer.INSTANCE, recommendParam.tpslTriggerParam);
    }

    public RecommendParam(@NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<TriggerParam> list, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, boolean z2, @NotNull String str25, @NotNull List<SignParam> list2, EarnParam earnParam, String str26, TpSlTriggerParamReqResp tpSlTriggerParamReqResp) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
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
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.pnlRatio = str;
        this.reserveFunds = z;
        this.direction = str2;
        this.instId = str3;
        this.userRiskMode = str4;
        this.lever = str5;
        this.slMode = str6;
        this.triggerParams = list;
        this.maxSafetyOrds = str7;
        this.pxStepsMult = str8;
        this.volMult = str9;
        this.tag = str10;
        this.tpPct = str11;
        this.slPct = str12;
        this.pxSteps = str13;
        this.initOrdPct = str14;
        this.instType = str15;
        this.gridNum = str16;
        this.minPx = str17;
        this.maxPx = str18;
        this.sz = str19;
        this.runType = str20;
        this.slTriggerPx = str21;
        this.tpTriggerPx = str22;
        this.tpRatio = str23;
        this.slRatio = str24;
        this.basePos = z2;
        this.ordType = str25;
        this.signParams = list2;
        this.earnParam = earnParam;
        this.quoteSz = str26;
        this.tpslTriggerParam = tpSlTriggerParamReqResp;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0182: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r67v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r67v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r36v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r67v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r67v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r67v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r67v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r67v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003c: ARITH (r67v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0040: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:63)) : (r42v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r67v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r67v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r67v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r67v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r67v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006f: ARITH (r67v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0079: ARITH (r67v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (r67v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0090: ARITH (r67v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009b: ARITH (r67v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r67v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b1: ARITH (r67v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r67v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c7: ARITH (r67v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d2: ARITH (r67v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dd: ARITH (r67v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e8: ARITH (r67v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f3: ARITH (r67v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00fe: ARITH (r67v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? false : (r61v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0109: ARITH (r67v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0114: ARITH (r67v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0118: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:84)) : (r63v0 java.util.List))
  (wrap:com.okinc.unify_trade.biz.bot.EarnParam:?: TERNARY null = ((wrap:int:0x0121: ARITH (r67v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.EarnParam) : (r64v0 com.okinc.unify_trade.biz.bot.EarnParam))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012e: ARITH (r67v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp:?: TERNARY null = ((wrap:int:0x0139: ARITH (r67v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) == (0 int)) ? (r66v0 com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp) : (null com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp))
 A[MD:(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.bot.TriggerParam>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List<com.okinc.unify_trade.biz.bot.SignParam>, com.okinc.unify_trade.biz.bot.EarnParam, java.lang.String, com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp):void (m)] (LINE:55) call: com.okinc.unify_trade.biz.bot.RecommendParam.<init>(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List, com.okinc.unify_trade.biz.bot.EarnParam, java.lang.String, com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp):void type: THIS */
    public /* synthetic */ RecommendParam(String str, boolean z, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, boolean z2, String str25, List list2, EarnParam earnParam, String str26, TpSlTriggerParamReqResp tpSlTriggerParamReqResp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? yDY.AhwBna() : list, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11, (i & 8192) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? "" : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? "" : str16, (i & 262144) != 0 ? "" : str17, (i & 524288) != 0 ? "" : str18, (i & 1048576) != 0 ? "" : str19, (i & 2097152) != 0 ? "" : str20, (i & 4194304) != 0 ? "" : str21, (i & 8388608) != 0 ? "" : str22, (i & 16777216) != 0 ? "" : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str24, (i & 67108864) != 0 ? false : z2, (i & 134217728) != 0 ? "" : str25, (i & 268435456) != 0 ? yDY.AhwBna() : list2, (i & 536870912) != 0 ? null : earnParam, (i & 1073741824) != 0 ? null : str26, (i & Integer.MIN_VALUE) == 0 ? tpSlTriggerParamReqResp : null);
    }
}

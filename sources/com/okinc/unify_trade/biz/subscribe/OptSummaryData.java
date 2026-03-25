package com.okinc.unify_trade.biz.subscribe;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class OptSummaryData {
    private String askVol;
    private String bidVol;
    private String buyApr;
    private String delta;
    private String deltaBS;
    private String distance;
    private String fwdPx;
    private String gamma;
    private String gammaBS;
    private String instId;
    private String instType;
    private String lever;
    private String markVol;
    private String realVol;
    private String sellApr;
    private String theta;
    private String thetaBS;
    private String ts;
    private String uly;
    private String vega;
    private String vegaBS;
    private String volLv;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OptSummaryData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4194303, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.vegaBS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.thetaBS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.markVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.bidVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.askVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.realVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.fwdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.volLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.buyApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.sellApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.distance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.delta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.gamma;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.vega;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.theta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.deltaBS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.gammaBS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptSummaryData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22) {
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
        Intrinsics.checkNotNullParameter(str22, "");
        return new OptSummaryData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptSummaryData)) {
            return false;
        }
        OptSummaryData optSummaryData = (OptSummaryData) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) optSummaryData.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) optSummaryData.instId) && Intrinsics.EZpvd((Object) this.uly, (Object) optSummaryData.uly) && Intrinsics.EZpvd((Object) this.delta, (Object) optSummaryData.delta) && Intrinsics.EZpvd((Object) this.gamma, (Object) optSummaryData.gamma) && Intrinsics.EZpvd((Object) this.vega, (Object) optSummaryData.vega) && Intrinsics.EZpvd((Object) this.theta, (Object) optSummaryData.theta) && Intrinsics.EZpvd((Object) this.deltaBS, (Object) optSummaryData.deltaBS) && Intrinsics.EZpvd((Object) this.gammaBS, (Object) optSummaryData.gammaBS) && Intrinsics.EZpvd((Object) this.vegaBS, (Object) optSummaryData.vegaBS) && Intrinsics.EZpvd((Object) this.thetaBS, (Object) optSummaryData.thetaBS) && Intrinsics.EZpvd((Object) this.lever, (Object) optSummaryData.lever) && Intrinsics.EZpvd((Object) this.markVol, (Object) optSummaryData.markVol) && Intrinsics.EZpvd((Object) this.bidVol, (Object) optSummaryData.bidVol) && Intrinsics.EZpvd((Object) this.askVol, (Object) optSummaryData.askVol) && Intrinsics.EZpvd((Object) this.realVol, (Object) optSummaryData.realVol) && Intrinsics.EZpvd((Object) this.ts, (Object) optSummaryData.ts) && Intrinsics.EZpvd((Object) this.fwdPx, (Object) optSummaryData.fwdPx) && Intrinsics.EZpvd((Object) this.volLv, (Object) optSummaryData.volLv) && Intrinsics.EZpvd((Object) this.buyApr, (Object) optSummaryData.buyApr) && Intrinsics.EZpvd((Object) this.sellApr, (Object) optSummaryData.sellApr) && Intrinsics.EZpvd((Object) this.distance, (Object) optSummaryData.distance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAskVol() {
        return this.askVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBidVol() {
        return this.bidVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyApr() {
        return this.buyApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDelta() {
        return this.delta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeltaBS() {
        return this.deltaBS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDistance() {
        return this.distance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFwdPx() {
        return this.fwdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGamma() {
        return this.gamma;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGammaBS() {
        return this.gammaBS;
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
    public final String getMarkVol() {
        return this.markVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealVol() {
        return this.realVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellApr() {
        return this.sellApr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTheta() {
        return this.theta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThetaBS() {
        return this.thetaBS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVega() {
        return this.vega;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVegaBS() {
        return this.vegaBS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolLv() {
        return this.volLv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((this.instType.hashCode() * 31) + this.instId.hashCode()) * 31) + this.uly.hashCode()) * 31) + this.delta.hashCode()) * 31) + this.gamma.hashCode()) * 31) + this.vega.hashCode()) * 31) + this.theta.hashCode()) * 31) + this.deltaBS.hashCode()) * 31) + this.gammaBS.hashCode()) * 31) + this.vegaBS.hashCode()) * 31) + this.thetaBS.hashCode()) * 31) + this.lever.hashCode()) * 31) + this.markVol.hashCode()) * 31) + this.bidVol.hashCode()) * 31) + this.askVol.hashCode()) * 31) + this.realVol.hashCode()) * 31) + this.ts.hashCode()) * 31) + this.fwdPx.hashCode()) * 31) + this.volLv.hashCode()) * 31) + this.buyApr.hashCode()) * 31) + this.sellApr.hashCode()) * 31) + this.distance.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAskVol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.askVol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBidVol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bidVol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyApr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.buyApr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDelta(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.delta = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeltaBS(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deltaBS = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDistance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.distance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFwdPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fwdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGamma(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gamma = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGammaBS(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gammaBS = str;
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
    public final void setLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarkVol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.markVol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealVol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.realVol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellApr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sellApr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTheta(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.theta = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setThetaBS(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.thetaBS = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ts = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUly(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVega(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.vega = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVegaBS(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.vegaBS = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolLv(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.volLv = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OptSummaryData(instType=" + this.instType + ", instId=" + this.instId + ", uly=" + this.uly + ", delta=" + this.delta + ", gamma=" + this.gamma + ", vega=" + this.vega + ", theta=" + this.theta + ", deltaBS=" + this.deltaBS + ", gammaBS=" + this.gammaBS + ", vegaBS=" + this.vegaBS + ", thetaBS=" + this.thetaBS + ", lever=" + this.lever + ", markVol=" + this.markVol + ", bidVol=" + this.bidVol + ", askVol=" + this.askVol + ", realVol=" + this.realVol + ", ts=" + this.ts + ", fwdPx=" + this.fwdPx + ", volLv=" + this.volLv + ", buyApr=" + this.buyApr + ", sellApr=" + this.sellApr + ", distance=" + this.distance + ")";
    }

    public /* synthetic */ OptSummaryData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = "";
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.uly = "";
        } else {
            this.uly = str3;
        }
        if ((i & 8) == 0) {
            this.delta = "";
        } else {
            this.delta = str4;
        }
        if ((i & 16) == 0) {
            this.gamma = "";
        } else {
            this.gamma = str5;
        }
        if ((i & 32) == 0) {
            this.vega = "";
        } else {
            this.vega = str6;
        }
        if ((i & 64) == 0) {
            this.theta = "";
        } else {
            this.theta = str7;
        }
        if ((i & 128) == 0) {
            this.deltaBS = "";
        } else {
            this.deltaBS = str8;
        }
        if ((i & 256) == 0) {
            this.gammaBS = "";
        } else {
            this.gammaBS = str9;
        }
        if ((i & 512) == 0) {
            this.vegaBS = "";
        } else {
            this.vegaBS = str10;
        }
        if ((i & 1024) == 0) {
            this.thetaBS = "";
        } else {
            this.thetaBS = str11;
        }
        if ((i & 2048) == 0) {
            this.lever = "";
        } else {
            this.lever = str12;
        }
        if ((i & 4096) == 0) {
            this.markVol = "";
        } else {
            this.markVol = str13;
        }
        if ((i & 8192) == 0) {
            this.bidVol = "";
        } else {
            this.bidVol = str14;
        }
        if ((i & 16384) == 0) {
            this.askVol = "";
        } else {
            this.askVol = str15;
        }
        if ((32768 & i) == 0) {
            this.realVol = "";
        } else {
            this.realVol = str16;
        }
        if ((65536 & i) == 0) {
            this.ts = "";
        } else {
            this.ts = str17;
        }
        if ((131072 & i) == 0) {
            this.fwdPx = "";
        } else {
            this.fwdPx = str18;
        }
        if ((262144 & i) == 0) {
            this.volLv = "";
        } else {
            this.volLv = str19;
        }
        if ((524288 & i) == 0) {
            this.buyApr = "";
        } else {
            this.buyApr = str20;
        }
        if ((1048576 & i) == 0) {
            this.sellApr = "";
        } else {
            this.sellApr = str21;
        }
        if ((i & 2097152) == 0) {
            this.distance = "";
        } else {
            this.distance = str22;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OptSummaryData optSummaryData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) optSummaryData.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, optSummaryData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) optSummaryData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, optSummaryData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) optSummaryData.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, optSummaryData.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) optSummaryData.delta, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, optSummaryData.delta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) optSummaryData.gamma, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, optSummaryData.gamma);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) optSummaryData.vega, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, optSummaryData.vega);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) optSummaryData.theta, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, optSummaryData.theta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) optSummaryData.deltaBS, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, optSummaryData.deltaBS);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) optSummaryData.gammaBS, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, optSummaryData.gammaBS);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) optSummaryData.vegaBS, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, optSummaryData.vegaBS);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) optSummaryData.thetaBS, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, optSummaryData.thetaBS);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) optSummaryData.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, optSummaryData.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) optSummaryData.markVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, optSummaryData.markVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) optSummaryData.bidVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, optSummaryData.bidVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) optSummaryData.askVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, optSummaryData.askVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) optSummaryData.realVol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, optSummaryData.realVol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) optSummaryData.ts, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, optSummaryData.ts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) optSummaryData.fwdPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, optSummaryData.fwdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) optSummaryData.volLv, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, optSummaryData.volLv);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) optSummaryData.buyApr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, optSummaryData.buyApr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) optSummaryData.sellApr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, optSummaryData.sellApr);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && Intrinsics.EZpvd((Object) optSummaryData.distance, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 21, optSummaryData.distance);
    }

    public OptSummaryData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22) {
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
        Intrinsics.checkNotNullParameter(str22, "");
        this.instType = str;
        this.instId = str2;
        this.uly = str3;
        this.delta = str4;
        this.gamma = str5;
        this.vega = str6;
        this.theta = str7;
        this.deltaBS = str8;
        this.gammaBS = str9;
        this.vegaBS = str10;
        this.thetaBS = str11;
        this.lever = str12;
        this.markVol = str13;
        this.bidVol = str14;
        this.askVol = str15;
        this.realVol = str16;
        this.ts = str17;
        this.fwdPx = str18;
        this.volLv = str19;
        this.buyApr = str20;
        this.sellApr = str21;
        this.distance = str22;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00fb: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r46v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r46v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r46v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r46v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r46v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r46v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r46v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r46v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r46v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r46v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r46v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r46v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r46v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r46v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r46v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r46v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r46v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r46v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r46v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r46v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r46v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r46v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.unify_trade.biz.subscribe.OptSummaryData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OptSummaryData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22);
    }

    public static final class Companion {

        public static final class StateListAnimator extends TypeToken<List<? extends OptSummaryData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.OptSummaryData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OptSummaryData> serializer() {
            return OptSummaryData$$serializer.INSTANCE;
        }

        public final List<OptSummaryData> AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List list = (List) new Gson().fromJson(str, new StateListAnimator().getType());
                if (list != null && !list.isEmpty()) {
                    return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
                }
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "OptSummaryData-jsonConvert" + e.getMessage());
            }
            return null;
        }
    }
}

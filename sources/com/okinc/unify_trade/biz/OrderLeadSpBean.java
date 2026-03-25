package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33129mqd;
import o.C54589xNz;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class OrderLeadSpBean implements Parcelable {
    private String availSubPos;
    private String ccy;
    private String detailIds;
    private String instId;
    private String instType;
    private String last;
    private String lever;
    private String margin;
    private String markPx;
    private String mgnMode;
    private String notionalUsd;
    private String openAvgPx;
    private String openTime;
    private String pnl;
    private String pnlRatio;
    private String posSide;
    private final String slOrdPx;
    private String slTriggerPx;
    private String slTriggerType;
    private String subPos;
    private final String tpOrdPx;
    private String tpTriggerPx;
    private String tpTriggerType;
    private String tradeItemId;
    private String uTime;
    private String uniqueName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OrderLeadSpBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<OrderLeadSpBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderLeadSpBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OrderLeadSpBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderLeadSpBean[] newArray(int i) {
            return new OrderLeadSpBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderLeadSpBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 67108863, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.availSubPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.openTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.tradeItemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.detailIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.uniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.markPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.tpTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.slTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.openAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.subPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderLeadSpBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26) {
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
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        return new OrderLeadSpBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26);
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
        if (!(obj instanceof OrderLeadSpBean)) {
            return false;
        }
        OrderLeadSpBean orderLeadSpBean = (OrderLeadSpBean) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) orderLeadSpBean.instId) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) orderLeadSpBean.mgnMode) && Intrinsics.EZpvd((Object) this.lever, (Object) orderLeadSpBean.lever) && Intrinsics.EZpvd((Object) this.posSide, (Object) orderLeadSpBean.posSide) && Intrinsics.EZpvd((Object) this.openAvgPx, (Object) orderLeadSpBean.openAvgPx) && Intrinsics.EZpvd((Object) this.subPos, (Object) orderLeadSpBean.subPos) && Intrinsics.EZpvd((Object) this.margin, (Object) orderLeadSpBean.margin) && Intrinsics.EZpvd((Object) this.pnl, (Object) orderLeadSpBean.pnl) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) orderLeadSpBean.pnlRatio) && Intrinsics.EZpvd((Object) this.availSubPos, (Object) orderLeadSpBean.availSubPos) && Intrinsics.EZpvd((Object) this.openTime, (Object) orderLeadSpBean.openTime) && Intrinsics.EZpvd((Object) this.uTime, (Object) orderLeadSpBean.uTime) && Intrinsics.EZpvd((Object) this.last, (Object) orderLeadSpBean.last) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) orderLeadSpBean.tpTriggerPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) orderLeadSpBean.slTriggerPx) && Intrinsics.EZpvd((Object) this.notionalUsd, (Object) orderLeadSpBean.notionalUsd) && Intrinsics.EZpvd((Object) this.ccy, (Object) orderLeadSpBean.ccy) && Intrinsics.EZpvd((Object) this.instType, (Object) orderLeadSpBean.instType) && Intrinsics.EZpvd((Object) this.tradeItemId, (Object) orderLeadSpBean.tradeItemId) && Intrinsics.EZpvd((Object) this.detailIds, (Object) orderLeadSpBean.detailIds) && Intrinsics.EZpvd((Object) this.uniqueName, (Object) orderLeadSpBean.uniqueName) && Intrinsics.EZpvd((Object) this.markPx, (Object) orderLeadSpBean.markPx) && Intrinsics.EZpvd((Object) this.tpTriggerType, (Object) orderLeadSpBean.tpTriggerType) && Intrinsics.EZpvd((Object) this.slTriggerType, (Object) orderLeadSpBean.slTriggerType) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) orderLeadSpBean.tpOrdPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) orderLeadSpBean.slOrdPx);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailSubPos() {
        return this.availSubPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetailIds() {
        return this.detailIds;
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
    public final String getLast() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMargin() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarkPx() {
        return this.markPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnMode() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsd() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenAvgPx() {
        return this.openAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenTime() {
        return this.openTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrdPx() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerType() {
        return this.slTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubPos() {
        return this.subPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrdPx() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerType() {
        return this.tpTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeItemId() {
        return this.tradeItemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUTime() {
        return this.uTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.instId.hashCode() * 31) + this.mgnMode.hashCode()) * 31) + this.lever.hashCode()) * 31) + this.posSide.hashCode()) * 31) + this.openAvgPx.hashCode()) * 31) + this.subPos.hashCode()) * 31) + this.margin.hashCode()) * 31) + this.pnl.hashCode()) * 31) + this.pnlRatio.hashCode()) * 31) + this.availSubPos.hashCode()) * 31) + this.openTime.hashCode()) * 31) + this.uTime.hashCode()) * 31) + this.last.hashCode()) * 31) + this.tpTriggerPx.hashCode()) * 31) + this.slTriggerPx.hashCode()) * 31) + this.notionalUsd.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.tradeItemId.hashCode()) * 31) + this.detailIds.hashCode()) * 31) + this.uniqueName.hashCode()) * 31) + this.markPx.hashCode()) * 31) + this.tpTriggerType.hashCode()) * 31) + this.slTriggerType.hashCode()) * 31) + this.tpOrdPx.hashCode()) * 31) + this.slOrdPx.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailSubPos(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.availSubPos = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDetailIds(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.detailIds = str;
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
    public final void setLast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.last = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLever(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lever = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMargin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.margin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarkPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.markPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMgnMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mgnMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notionalUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.openAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.openTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.posSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slTriggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubPos(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subPos = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpTriggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeItemId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeItemId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUniqueName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uniqueName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderLeadSpBean(instId=" + this.instId + ", mgnMode=" + this.mgnMode + ", lever=" + this.lever + ", posSide=" + this.posSide + ", openAvgPx=" + this.openAvgPx + ", subPos=" + this.subPos + ", margin=" + this.margin + ", pnl=" + this.pnl + ", pnlRatio=" + this.pnlRatio + ", availSubPos=" + this.availSubPos + ", openTime=" + this.openTime + ", uTime=" + this.uTime + ", last=" + this.last + ", tpTriggerPx=" + this.tpTriggerPx + ", slTriggerPx=" + this.slTriggerPx + ", notionalUsd=" + this.notionalUsd + ", ccy=" + this.ccy + ", instType=" + this.instType + ", tradeItemId=" + this.tradeItemId + ", detailIds=" + this.detailIds + ", uniqueName=" + this.uniqueName + ", markPx=" + this.markPx + ", tpTriggerType=" + this.tpTriggerType + ", slTriggerType=" + this.slTriggerType + ", tpOrdPx=" + this.tpOrdPx + ", slOrdPx=" + this.slOrdPx + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.mgnMode);
        parcel.writeString(this.lever);
        parcel.writeString(this.posSide);
        parcel.writeString(this.openAvgPx);
        parcel.writeString(this.subPos);
        parcel.writeString(this.margin);
        parcel.writeString(this.pnl);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.availSubPos);
        parcel.writeString(this.openTime);
        parcel.writeString(this.uTime);
        parcel.writeString(this.last);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.notionalUsd);
        parcel.writeString(this.ccy);
        parcel.writeString(this.instType);
        parcel.writeString(this.tradeItemId);
        parcel.writeString(this.detailIds);
        parcel.writeString(this.uniqueName);
        parcel.writeString(this.markPx);
        parcel.writeString(this.tpTriggerType);
        parcel.writeString(this.slTriggerType);
        parcel.writeString(this.tpOrdPx);
        parcel.writeString(this.slOrdPx);
    }

    public /* synthetic */ OrderLeadSpBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.mgnMode = "";
        } else {
            this.mgnMode = str2;
        }
        if ((i & 4) == 0) {
            this.lever = "";
        } else {
            this.lever = str3;
        }
        if ((i & 8) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str4;
        }
        if ((i & 16) == 0) {
            this.openAvgPx = "";
        } else {
            this.openAvgPx = str5;
        }
        if ((i & 32) == 0) {
            this.subPos = "";
        } else {
            this.subPos = str6;
        }
        if ((i & 64) == 0) {
            this.margin = "";
        } else {
            this.margin = str7;
        }
        if ((i & 128) == 0) {
            this.pnl = "";
        } else {
            this.pnl = str8;
        }
        if ((i & 256) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str9;
        }
        if ((i & 512) == 0) {
            this.availSubPos = "";
        } else {
            this.availSubPos = str10;
        }
        if ((i & 1024) == 0) {
            this.openTime = "";
        } else {
            this.openTime = str11;
        }
        if ((i & 2048) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str12;
        }
        if ((i & 4096) == 0) {
            this.last = "";
        } else {
            this.last = str13;
        }
        if ((i & 8192) == 0) {
            this.tpTriggerPx = "";
        } else {
            this.tpTriggerPx = str14;
        }
        if ((i & 16384) == 0) {
            this.slTriggerPx = "";
        } else {
            this.slTriggerPx = str15;
        }
        if ((32768 & i) == 0) {
            this.notionalUsd = "";
        } else {
            this.notionalUsd = str16;
        }
        if ((65536 & i) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str17;
        }
        if ((131072 & i) == 0) {
            this.instType = "";
        } else {
            this.instType = str18;
        }
        if ((262144 & i) == 0) {
            this.tradeItemId = "";
        } else {
            this.tradeItemId = str19;
        }
        if ((524288 & i) == 0) {
            this.detailIds = "";
        } else {
            this.detailIds = str20;
        }
        if ((1048576 & i) == 0) {
            this.uniqueName = "";
        } else {
            this.uniqueName = str21;
        }
        if ((2097152 & i) == 0) {
            this.markPx = "";
        } else {
            this.markPx = str22;
        }
        if ((4194304 & i) == 0) {
            this.tpTriggerType = "";
        } else {
            this.tpTriggerType = str23;
        }
        if ((8388608 & i) == 0) {
            this.slTriggerType = "";
        } else {
            this.slTriggerType = str24;
        }
        if ((16777216 & i) == 0) {
            this.tpOrdPx = "";
        } else {
            this.tpOrdPx = str25;
        }
        if ((i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
            this.slOrdPx = "";
        } else {
            this.slOrdPx = str26;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OrderLeadSpBean orderLeadSpBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) orderLeadSpBean.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, orderLeadSpBean.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) orderLeadSpBean.mgnMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, orderLeadSpBean.mgnMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) orderLeadSpBean.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, orderLeadSpBean.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) orderLeadSpBean.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, orderLeadSpBean.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) orderLeadSpBean.openAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, orderLeadSpBean.openAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) orderLeadSpBean.subPos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, orderLeadSpBean.subPos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) orderLeadSpBean.margin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, orderLeadSpBean.margin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) orderLeadSpBean.pnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, orderLeadSpBean.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) orderLeadSpBean.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, orderLeadSpBean.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) orderLeadSpBean.availSubPos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, orderLeadSpBean.availSubPos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) orderLeadSpBean.openTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, orderLeadSpBean.openTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) orderLeadSpBean.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, orderLeadSpBean.uTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) orderLeadSpBean.last, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, orderLeadSpBean.last);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) orderLeadSpBean.tpTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, orderLeadSpBean.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) orderLeadSpBean.slTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, orderLeadSpBean.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) orderLeadSpBean.notionalUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, orderLeadSpBean.notionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) orderLeadSpBean.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, orderLeadSpBean.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) orderLeadSpBean.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, orderLeadSpBean.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) orderLeadSpBean.tradeItemId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, orderLeadSpBean.tradeItemId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) orderLeadSpBean.detailIds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, orderLeadSpBean.detailIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) orderLeadSpBean.uniqueName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, orderLeadSpBean.uniqueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) orderLeadSpBean.markPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, orderLeadSpBean.markPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) orderLeadSpBean.tpTriggerType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, orderLeadSpBean.tpTriggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) orderLeadSpBean.slTriggerType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, orderLeadSpBean.slTriggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) orderLeadSpBean.tpOrdPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, orderLeadSpBean.tpOrdPx);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) && Intrinsics.EZpvd((Object) orderLeadSpBean.slOrdPx, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 25, orderLeadSpBean.slOrdPx);
    }

    public OrderLeadSpBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26) {
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
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        this.instId = str;
        this.mgnMode = str2;
        this.lever = str3;
        this.posSide = str4;
        this.openAvgPx = str5;
        this.subPos = str6;
        this.margin = str7;
        this.pnl = str8;
        this.pnlRatio = str9;
        this.availSubPos = str10;
        this.openTime = str11;
        this.uTime = str12;
        this.last = str13;
        this.tpTriggerPx = str14;
        this.slTriggerPx = str15;
        this.notionalUsd = str16;
        this.ccy = str17;
        this.instType = str18;
        this.tradeItemId = str19;
        this.detailIds = str20;
        this.uniqueName = str21;
        this.markPx = str22;
        this.tpTriggerType = str23;
        this.slTriggerType = str24;
        this.tpOrdPx = str25;
        this.slOrdPx = str26;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x012f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r54v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r54v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r54v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r54v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r54v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r54v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r54v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r54v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r54v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r54v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r54v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r54v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r54v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r54v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r54v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r54v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r54v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r54v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r54v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r54v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r54v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r54v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r54v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r54v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r54v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r54v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:3256) call: com.okinc.unify_trade.biz.OrderLeadSpBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OrderLeadSpBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OrderLeadSpBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OrderLeadSpBean> serializer() {
            return OrderLeadSpBean$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getPositionsSide() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, this.instType, this.instId, null, null, 12, null) : null;
        if (Intrinsics.EZpvd((Object) this.instType, (Object) "MARGIN")) {
            if (!Intrinsics.EZpvd((Object) this.ccy, (Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null))) {
                if (this.ccy.length() == 0) {
                    return "";
                }
                return "netSell";
            }
            return "netBuy";
        }
        if (!Intrinsics.EZpvd((Object) this.posSide, (Object) "net")) {
            return this.posSide;
        }
        if (C33129mqd.AEQbTJ(this.subPos) <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            if (C33129mqd.AEQbTJ(this.subPos) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            }
        }
        return "netBuy";
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r2.equals("short") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r2.equals("long") == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getSide() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, this.instType, this.instId, null, null, 12, null) : null;
        String str = this.posSide;
        int iHashCode = str.hashCode();
        if (iHashCode != 108957) {
            if (iHashCode != 3327612) {
                if (iHashCode == 109413500) {
                }
            }
            return this.posSide;
        }
        if (str.equals("net")) {
            if (Intrinsics.EZpvd((Object) this.instType, (Object) "MARGIN")) {
                return Intrinsics.EZpvd((Object) this.ccy, (Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null)) ? "buy" : "sell";
            }
            if (C33129mqd.AEQbTJ(this.subPos) > AudioStats.AUDIO_AMPLITUDE_NONE) {
            }
        }
        return this.posSide;
    }

    public final boolean isQuickMarginPosition() {
        return Intrinsics.EZpvd((Object) this.instType, (Object) "MARGIN") && Intrinsics.EZpvd((Object) this.mgnMode, (Object) "isolated");
    }
}

package com.okinc.kline.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.oLT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class KlineOpenOrderBean implements Parcelable {
    private int SLLeft;
    private int TPLeft;
    private String accAvgPx;
    private String activePx;
    private String amount;
    private String amountNoSign;
    private String attachAlgoId;
    private String cTime;
    private String callback;
    private String callbackRatio;
    private String callbackSpread;
    private String costBE;
    private String costLiq;
    private int costPos;
    private String costPrice;
    private boolean haveSL;
    private boolean haveTP;
    private String instType;
    private boolean isChangePrice;
    private boolean isCopyOrder;
    private boolean isCostConnect;
    private boolean isDragging;
    private boolean isMainOrder;
    private boolean isMultipleOrder;
    private boolean isShowTempPnl;
    private boolean isSupportDragAndCancel;
    private boolean isTemp;
    private String isTpLimit;
    private String lineColor;
    private boolean longClick;
    private String mainPrice;
    private String moveTriggerPx;
    private int multipleOrderNum;
    private String notionalUsd;
    private String oldPrice;
    private String ordId;
    private String ordPx;
    private String ordType;
    private String orderSize;
    private String originOrdType;
    private int originPos;
    private String pnl;
    private String pnlRatio;
    private String posSide;
    private String price;
    private String reduceOnly;
    private boolean selected;
    private boolean showDragCircle;
    private boolean showSolid;
    private String side;
    private String slOrdPx;
    private String slTriggerPx;
    private String slTriggerPxType;
    private String tdMode;
    private String tpOrdPx;
    private String tpTriggerPxType;
    private String triggerPxType;
    private String uPrice;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<KlineOpenOrderBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<KlineOpenOrderBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineOpenOrderBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new KlineOpenOrderBean();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineOpenOrderBean[] newArray(int i) {
            return new KlineOpenOrderBean[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccAvgPx() {
        return this.accAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivePx() {
        return this.activePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmountNoSign() {
        return this.amountNoSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAttachAlgoId() {
        return this.attachAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallback() {
        return this.callback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallbackRatio() {
        return this.callbackRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallbackSpread() {
        return this.callbackSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCostBE() {
        return this.costBE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCostLiq() {
        return this.costLiq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCostPos() {
        return this.costPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCostPrice() {
        return this.costPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHaveSL() {
        return this.haveSL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHaveTP() {
        return this.haveTP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLineColor() {
        return this.lineColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLongClick() {
        return this.longClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainPrice() {
        return this.mainPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMoveTriggerPx() {
        return this.moveTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMultipleOrderNum() {
        return this.multipleOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalUsd() {
        return this.notionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOldPrice() {
        return this.oldPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdPx() {
        return this.ordPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderSize() {
        return this.orderSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginOrdType() {
        return this.originOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOriginPos() {
        return this.originPos;
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
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSLLeft() {
        return this.SLLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowDragCircle() {
        return this.showDragCircle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowSolid() {
        return this.showSolid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSide() {
        return this.side;
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
    public final String getSlTriggerPxType() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTPLeft() {
        return this.TPLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrdPx() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPxType() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPxType() {
        return this.triggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUPrice() {
        return this.uPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isChangePrice() {
        return this.isChangePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCopyOrder() {
        return this.isCopyOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCostConnect() {
        return this.isCostConnect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDragging() {
        return this.isDragging;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMainOrder() {
        return this.isMainOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMultipleOrder() {
        return this.isMultipleOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowTempPnl() {
        return this.isShowTempPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupportDragAndCancel() {
        return this.isSupportDragAndCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTemp() {
        return this.isTemp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isTpLimit() {
        return this.isTpLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivePx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.activePx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountNoSign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amountNoSign = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.attachAlgoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.callback = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallbackRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.callbackRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallbackSpread(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.callbackSpread = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangePrice(boolean z) {
        this.isChangePrice = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCopyOrder(boolean z) {
        this.isCopyOrder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCostBE(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.costBE = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCostConnect(boolean z) {
        this.isCostConnect = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCostLiq(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.costLiq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCostPos(int i) {
        this.costPos = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCostPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.costPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDragging(boolean z) {
        this.isDragging = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHaveSL(boolean z) {
        this.haveSL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHaveTP(boolean z) {
        this.haveTP = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLineColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lineColor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLongClick(boolean z) {
        this.longClick = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainOrder(boolean z) {
        this.isMainOrder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mainPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMoveTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.moveTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMultipleOrder(boolean z) {
        this.isMultipleOrder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMultipleOrderNum(int i) {
        this.multipleOrderNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotionalUsd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.notionalUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOldPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.oldPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginPos(int i) {
        this.originPos = i;
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
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReduceOnly(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reduceOnly = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSLLeft(int i) {
        this.SLLeft = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.selected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowDragCircle(boolean z) {
        this.showDragCircle = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSolid(boolean z) {
        this.showSolid = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowTempPnl(boolean z) {
        this.isShowTempPnl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.side = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrdPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPxType(String str) {
        this.slTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportDragAndCancel(boolean z) {
        this.isSupportDragAndCancel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTPLeft(int i) {
        this.TPLeft = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTdMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tdMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTemp(boolean z) {
        this.isTemp = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isTpLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrdPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPxType(String str) {
        this.tpTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPxType(String str) {
        this.triggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.data.KlineOpenOrderBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KlineOpenOrderBean> serializer() {
            return KlineOpenOrderBean$$serializer.INSTANCE;
        }
    }

    public KlineOpenOrderBean() {
        this.instType = "";
        this.ordId = "";
        this.ordType = "";
        this.originOrdType = "";
        this.amount = "";
        this.notionalUsd = "";
        this.amountNoSign = "";
        this.orderSize = "";
        this.cTime = "";
        this.side = "";
        this.posSide = "";
        this.price = "";
        this.mainPrice = "";
        this.uPrice = "";
        this.oldPrice = "";
        this.slTriggerPx = "";
        this.tpOrdPx = "";
        this.slOrdPx = "";
        this.ordPx = "";
        this.activePx = "";
        this.moveTriggerPx = "";
        this.callbackRatio = "";
        this.callbackSpread = "";
        this.callback = "";
        this.isMainOrder = true;
        this.reduceOnly = "";
        this.tdMode = "";
        this.attachAlgoId = "";
        this.lineColor = "";
        this.costPrice = "";
        this.costLiq = "";
        this.costBE = "";
        this.isShowTempPnl = true;
        this.SLLeft = -1;
        this.TPLeft = -1;
        this.pnl = "";
        this.pnlRatio = "";
        this.isSupportDragAndCancel = true;
        this.isTpLimit = "";
        this.accAvgPx = "";
    }

    public /* synthetic */ KlineOpenOrderBean(int i, int i2, String str, int i3, int i4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, boolean z, String str28, String str29, String str30, boolean z2, boolean z3, boolean z4, String str31, boolean z5, String str32, String str33, String str34, boolean z6, boolean z7, boolean z8, boolean z9, int i5, int i6, String str35, String str36, boolean z10, boolean z11, int i7, boolean z12, String str37, String str38, boolean z13, boolean z14, boolean z15, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = "";
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.originPos = 0;
        } else {
            this.originPos = i3;
        }
        if ((i & 4) == 0) {
            this.costPos = 0;
        } else {
            this.costPos = i4;
        }
        if ((i & 8) == 0) {
            this.ordId = "";
        } else {
            this.ordId = str2;
        }
        if ((i & 16) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str3;
        }
        if ((i & 32) == 0) {
            this.originOrdType = "";
        } else {
            this.originOrdType = str4;
        }
        if ((i & 64) == 0) {
            this.amount = "";
        } else {
            this.amount = str5;
        }
        if ((i & 128) == 0) {
            this.notionalUsd = "";
        } else {
            this.notionalUsd = str6;
        }
        if ((i & 256) == 0) {
            this.amountNoSign = "";
        } else {
            this.amountNoSign = str7;
        }
        if ((i & 512) == 0) {
            this.orderSize = "";
        } else {
            this.orderSize = str8;
        }
        if ((i & 1024) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str9;
        }
        if ((i & 2048) == 0) {
            this.side = "";
        } else {
            this.side = str10;
        }
        if ((i & 4096) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str11;
        }
        if ((i & 8192) == 0) {
            this.price = "";
        } else {
            this.price = str12;
        }
        if ((i & 16384) == 0) {
            this.mainPrice = "";
        } else {
            this.mainPrice = str13;
        }
        if ((i & 32768) == 0) {
            this.uPrice = "";
        } else {
            this.uPrice = str14;
        }
        if ((i & 65536) == 0) {
            this.oldPrice = "";
        } else {
            this.oldPrice = str15;
        }
        if ((i & 131072) == 0) {
            this.slTriggerPx = "";
        } else {
            this.slTriggerPx = str16;
        }
        if ((i & 262144) == 0) {
            this.triggerPxType = null;
        } else {
            this.triggerPxType = str17;
        }
        if ((524288 & i) == 0) {
            this.tpTriggerPxType = null;
        } else {
            this.tpTriggerPxType = str18;
        }
        if ((1048576 & i) == 0) {
            this.slTriggerPxType = null;
        } else {
            this.slTriggerPxType = str19;
        }
        if ((2097152 & i) == 0) {
            this.tpOrdPx = "";
        } else {
            this.tpOrdPx = str20;
        }
        if ((4194304 & i) == 0) {
            this.slOrdPx = "";
        } else {
            this.slOrdPx = str21;
        }
        if ((8388608 & i) == 0) {
            this.ordPx = "";
        } else {
            this.ordPx = str22;
        }
        if ((16777216 & i) == 0) {
            this.activePx = "";
        } else {
            this.activePx = str23;
        }
        if ((33554432 & i) == 0) {
            this.moveTriggerPx = "";
        } else {
            this.moveTriggerPx = str24;
        }
        if ((67108864 & i) == 0) {
            this.callbackRatio = "";
        } else {
            this.callbackRatio = str25;
        }
        if ((134217728 & i) == 0) {
            this.callbackSpread = "";
        } else {
            this.callbackSpread = str26;
        }
        if ((268435456 & i) == 0) {
            this.callback = "";
        } else {
            this.callback = str27;
        }
        if ((536870912 & i) == 0) {
            this.isMainOrder = true;
        } else {
            this.isMainOrder = z;
        }
        if ((1073741824 & i) == 0) {
            this.reduceOnly = "";
        } else {
            this.reduceOnly = str28;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str29;
        }
        if ((i2 & 1) == 0) {
            this.attachAlgoId = "";
        } else {
            this.attachAlgoId = str30;
        }
        if ((i2 & 2) == 0) {
            this.selected = false;
        } else {
            this.selected = z2;
        }
        if ((i2 & 4) == 0) {
            this.showSolid = false;
        } else {
            this.showSolid = z3;
        }
        if ((i2 & 8) == 0) {
            this.showDragCircle = false;
        } else {
            this.showDragCircle = z4;
        }
        if ((i2 & 16) == 0) {
            this.lineColor = "";
        } else {
            this.lineColor = str31;
        }
        if ((i2 & 32) == 0) {
            this.longClick = false;
        } else {
            this.longClick = z5;
        }
        if ((i2 & 64) == 0) {
            this.costPrice = "";
        } else {
            this.costPrice = str32;
        }
        if ((i2 & 128) == 0) {
            this.costLiq = "";
        } else {
            this.costLiq = str33;
        }
        if ((i2 & 256) == 0) {
            this.costBE = "";
        } else {
            this.costBE = str34;
        }
        if ((i2 & 512) == 0) {
            this.haveSL = false;
        } else {
            this.haveSL = z6;
        }
        if ((i2 & 1024) == 0) {
            this.haveTP = false;
        } else {
            this.haveTP = z7;
        }
        if ((i2 & 2048) == 0) {
            this.isTemp = false;
        } else {
            this.isTemp = z8;
        }
        if ((i2 & 4096) == 0) {
            this.isShowTempPnl = true;
        } else {
            this.isShowTempPnl = z9;
        }
        this.SLLeft = (i2 & 8192) == 0 ? -1 : i5;
        this.TPLeft = (i2 & 16384) == 0 ? -1 : i6;
        if ((i2 & 32768) == 0) {
            this.pnl = "";
        } else {
            this.pnl = str35;
        }
        if ((i2 & 65536) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str36;
        }
        if ((i2 & 131072) == 0) {
            this.isSupportDragAndCancel = true;
        } else {
            this.isSupportDragAndCancel = z10;
        }
        if ((i2 & 262144) == 0) {
            this.isMultipleOrder = false;
        } else {
            this.isMultipleOrder = z11;
        }
        if ((524288 & i2) == 0) {
            this.multipleOrderNum = 0;
        } else {
            this.multipleOrderNum = i7;
        }
        if ((1048576 & i2) == 0) {
            this.isCostConnect = false;
        } else {
            this.isCostConnect = z12;
        }
        if ((2097152 & i2) == 0) {
            this.isTpLimit = "";
        } else {
            this.isTpLimit = str37;
        }
        if ((4194304 & i2) == 0) {
            this.accAvgPx = "";
        } else {
            this.accAvgPx = str38;
        }
        if ((8388608 & i2) == 0) {
            this.isDragging = false;
        } else {
            this.isDragging = z13;
        }
        if ((16777216 & i2) == 0) {
            this.isChangePrice = false;
        } else {
            this.isChangePrice = z14;
        }
        if ((33554432 & i2) == 0) {
            this.isCopyOrder = false;
        } else {
            this.isCopyOrder = z15;
        }
    }

    public static final /* synthetic */ void write$Self$OKCandleStickChart_chart_impl(KlineOpenOrderBean klineOpenOrderBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, klineOpenOrderBean.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || klineOpenOrderBean.originPos != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, klineOpenOrderBean.originPos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || klineOpenOrderBean.costPos != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, klineOpenOrderBean.costPos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.ordId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, klineOpenOrderBean.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, klineOpenOrderBean.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.originOrdType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, klineOpenOrderBean.originOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, klineOpenOrderBean.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.notionalUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, klineOpenOrderBean.notionalUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.amountNoSign, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, klineOpenOrderBean.amountNoSign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.orderSize, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, klineOpenOrderBean.orderSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, klineOpenOrderBean.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, klineOpenOrderBean.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, klineOpenOrderBean.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, klineOpenOrderBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.mainPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, klineOpenOrderBean.mainPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.uPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, klineOpenOrderBean.uPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.oldPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, klineOpenOrderBean.oldPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.slTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, klineOpenOrderBean.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || klineOpenOrderBean.triggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, klineOpenOrderBean.triggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || klineOpenOrderBean.tpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, klineOpenOrderBean.tpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || klineOpenOrderBean.slTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, klineOpenOrderBean.slTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.tpOrdPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, klineOpenOrderBean.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.slOrdPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, klineOpenOrderBean.slOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.ordPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, klineOpenOrderBean.ordPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.activePx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, klineOpenOrderBean.activePx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.moveTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, klineOpenOrderBean.moveTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.callbackRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, klineOpenOrderBean.callbackRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.callbackSpread, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, klineOpenOrderBean.callbackSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.callback, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, klineOpenOrderBean.callback);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !klineOpenOrderBean.isMainOrder) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 29, klineOpenOrderBean.isMainOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.reduceOnly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, klineOpenOrderBean.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, klineOpenOrderBean.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.attachAlgoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, klineOpenOrderBean.attachAlgoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || klineOpenOrderBean.selected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 33, klineOpenOrderBean.selected);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || klineOpenOrderBean.showSolid) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 34, klineOpenOrderBean.showSolid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || klineOpenOrderBean.showDragCircle) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 35, klineOpenOrderBean.showDragCircle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.lineColor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, klineOpenOrderBean.lineColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || klineOpenOrderBean.longClick) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 37, klineOpenOrderBean.longClick);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.costPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, klineOpenOrderBean.costPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.costLiq, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, klineOpenOrderBean.costLiq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.costBE, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, klineOpenOrderBean.costBE);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || klineOpenOrderBean.haveSL) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 41, klineOpenOrderBean.haveSL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || klineOpenOrderBean.haveTP) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 42, klineOpenOrderBean.haveTP);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || klineOpenOrderBean.isTemp) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 43, klineOpenOrderBean.isTemp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !klineOpenOrderBean.isShowTempPnl) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 44, klineOpenOrderBean.isShowTempPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || klineOpenOrderBean.SLLeft != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 45, klineOpenOrderBean.SLLeft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || klineOpenOrderBean.TPLeft != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 46, klineOpenOrderBean.TPLeft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.pnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, klineOpenOrderBean.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, klineOpenOrderBean.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !klineOpenOrderBean.isSupportDragAndCancel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 49, klineOpenOrderBean.isSupportDragAndCancel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || klineOpenOrderBean.isMultipleOrder) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 50, klineOpenOrderBean.isMultipleOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || klineOpenOrderBean.multipleOrderNum != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 51, klineOpenOrderBean.multipleOrderNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || klineOpenOrderBean.isCostConnect) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 52, klineOpenOrderBean.isCostConnect);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.isTpLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, klineOpenOrderBean.isTpLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) klineOpenOrderBean.accAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, klineOpenOrderBean.accAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || klineOpenOrderBean.isDragging) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 55, klineOpenOrderBean.isDragging);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || klineOpenOrderBean.isChangePrice) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 56, klineOpenOrderBean.isChangePrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || klineOpenOrderBean.isCopyOrder) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 57, klineOpenOrderBean.isCopyOrder);
        }
    }

    public final boolean isOrderCanDrag() {
        return this.isSupportDragAndCancel && (Intrinsics.EZpvd((Object) this.ordType, (Object) "limit") || Intrinsics.EZpvd((Object) this.ordType, (Object) "post_only") || ((Intrinsics.EZpvd((Object) this.ordType, (Object) "TP_Limit") || Intrinsics.EZpvd((Object) this.ordType, (Object) "TP_Market") || Intrinsics.EZpvd((Object) this.ordType, (Object) "SL_Limit") || Intrinsics.EZpvd((Object) this.ordType, (Object) "SL_Market")) && (Intrinsics.EZpvd((Object) this.instType, (Object) oLT.AuCTel()) || Intrinsics.EZpvd((Object) this.instType, (Object) oLT.KWHzl()))));
    }
}

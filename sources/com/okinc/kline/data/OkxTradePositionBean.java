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
import o.C54589xNz;
import o.InterfaceC39510pth;
import o.InterfaceC54581xNr;
import o.oLW;
import o.xOW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class OkxTradePositionBean implements InterfaceC39510pth, Parcelable {
    private String tAvgPx;
    private String tBSSide;
    private String tBePx;
    private boolean tBeSelected;
    private String tCcy;
    private boolean tDragSL;
    private boolean tDragTP;
    private String tImr;
    private String tImrSign;
    private int tIndex;
    private String tInstId;
    private String tInstType;
    private boolean tIsMainOrder;
    private boolean tIsSupportPR;
    private String tLast;
    private String tLiqPx;
    private boolean tLiqSelected;
    private boolean tLongClick;
    private String tMargin;
    private String tMarginSign;
    private String tMgnMode;
    private String tPos;
    private String tPosCcy;
    private String tPosId;
    private String tPosSide;
    private String tPosSign;
    private int tSLLeft;
    private boolean tSelected;
    private boolean tShowSolid;
    private boolean tShowSolidBE;
    private boolean tShowSolidLiq;
    private String tSize;
    private int tTPLeft;
    private String tUpl;
    private String tUplLastPx;
    private String tUplRatio;
    private String tUplRatioLastPx;
    private String tUplSign;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OkxTradePositionBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OkxTradePositionBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkxTradePositionBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new OkxTradePositionBean();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkxTradePositionBean[] newArray(int i) {
            return new OkxTradePositionBean[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getAvgPx() {
        return this.tAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getBSSide() {
        return this.tBSSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getBePx() {
        return this.tBePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public boolean getBeSelected() {
        return this.tBeSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getCcy() {
        return this.tCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getImr() {
        return this.tImr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getImrSign() {
        return this.tImrSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public int getIndex() {
        return this.tIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getInstType() {
        return this.tInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean getIsMainOrder() {
        return this.tIsMainOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getLiqPx() {
        return this.tLiqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public boolean getLiqSelected() {
        return this.tLiqSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public boolean getLongClick() {
        return this.tLongClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getMargin() {
        return this.tMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getMarginSign() {
        return this.tMarginSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getMgnMode() {
        return this.tMgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getPos() {
        return this.tPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getPosId() {
        return this.tPosId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPosSide() {
        return this.tPosSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPosSign() {
        return this.tPosSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public int getSLLeft() {
        return this.tSLLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public boolean getSelected() {
        return this.tSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public boolean getShowSolid() {
        return this.tShowSolid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public boolean getShowSolidBE() {
        return this.tShowSolidBE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public boolean getShowSolidLiq() {
        return this.tShowSolidLiq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getSize() {
        return this.tSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTAvgPx() {
        return this.tAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTBSSide() {
        return this.tBSSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTBePx() {
        return this.tBePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTBeSelected() {
        return this.tBeSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTCcy() {
        return this.tCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTDragSL() {
        return this.tDragSL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTDragTP() {
        return this.tDragTP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTImr() {
        return this.tImr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTImrSign() {
        return this.tImrSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTIndex() {
        return this.tIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTInstId() {
        return this.tInstId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTInstType() {
        return this.tInstType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTIsMainOrder() {
        return this.tIsMainOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTIsSupportPR() {
        return this.tIsSupportPR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTLast() {
        return this.tLast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTLiqPx() {
        return this.tLiqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTLiqSelected() {
        return this.tLiqSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTLongClick() {
        return this.tLongClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTMargin() {
        return this.tMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTMarginSign() {
        return this.tMarginSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTMgnMode() {
        return this.tMgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public int getTPLeft() {
        return this.tTPLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTPos() {
        return this.tPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTPosCcy() {
        return this.tPosCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTPosId() {
        return this.tPosId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTPosSide() {
        return this.tPosSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTPosSign() {
        return this.tPosSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTSLLeft() {
        return this.tSLLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTSelected() {
        return this.tSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTShowSolid() {
        return this.tShowSolid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTShowSolidBE() {
        return this.tShowSolidBE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTShowSolidLiq() {
        return this.tShowSolidLiq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTSize() {
        return this.tSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTTPLeft() {
        return this.tTPLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTUpl() {
        return this.tUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTUplLastPx() {
        return this.tUplLastPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTUplRatio() {
        return this.tUplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTUplRatioLastPx() {
        return this.tUplRatioLastPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTUplSign() {
        return this.tUplSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getUpl() {
        return this.tUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUplLastPx() {
        return this.tUplLastPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getUplRatio() {
        return this.tUplRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUplRatioLastPx() {
        return this.tUplRatioLastPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public String getUplSign() {
        return this.tUplSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public boolean isDragSL() {
        return this.tDragSL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public boolean isDragTP() {
        return this.tDragTP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public boolean isSupportPR() {
        return this.tIsSupportPR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public void setBeSelected(boolean z) {
        this.tBeSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public void setDragSL(boolean z) {
        this.tDragSL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public void setDragTP(boolean z) {
        this.tDragTP = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setIsMainOrder(boolean z) {
        this.tIsMainOrder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public void setLiqSelected(boolean z) {
        this.tLiqSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public void setLongClick(boolean z) {
        this.tLongClick = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public void setSLLeft(int i) {
        this.tSLLeft = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public void setSelected(boolean z) {
        this.tSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public void setShowSolid(boolean z) {
        this.tShowSolid = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public void setShowSolidBE(boolean z) {
        this.tShowSolidBE = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public void setShowSolidLiq(boolean z) {
        this.tShowSolidLiq = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTBSSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tBSSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTBePx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tBePx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTBeSelected(boolean z) {
        this.tBeSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTDragSL(boolean z) {
        this.tDragSL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTDragTP(boolean z) {
        this.tDragTP = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTImr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tImr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTImrSign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tImrSign = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTIndex(int i) {
        this.tIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tInstId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tInstType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTIsMainOrder(boolean z) {
        this.tIsMainOrder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTIsSupportPR(boolean z) {
        this.tIsSupportPR = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTLast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tLast = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTLiqPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tLiqPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTLiqSelected(boolean z) {
        this.tLiqSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTLongClick(boolean z) {
        this.tLongClick = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTMargin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tMargin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTMarginSign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tMarginSign = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTMgnMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tMgnMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39510pth
    public void setTPLeft(int i) {
        this.tTPLeft = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTPos(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tPos = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTPosCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tPosCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTPosId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tPosId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTPosSide(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tPosSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTPosSign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tPosSign = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTSLLeft(int i) {
        this.tSLLeft = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTSelected(boolean z) {
        this.tSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTShowSolid(boolean z) {
        this.tShowSolid = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTShowSolidBE(boolean z) {
        this.tShowSolidBE = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTShowSolidLiq(boolean z) {
        this.tShowSolidLiq = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTSize(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTTPLeft(int i) {
        this.tTPLeft = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTUpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tUpl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTUplLastPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tUplLastPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTUplRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tUplRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTUplRatioLastPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tUplRatioLastPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTUplSign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tUplSign = str;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.data.OkxTradePositionBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OkxTradePositionBean> serializer() {
            return OkxTradePositionBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OkxTradePositionBean(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i4, int i5, boolean z9, boolean z10, boolean z11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tIndex = -1;
        } else {
            this.tIndex = i3;
        }
        if ((i & 2) == 0) {
            this.tInstId = "";
        } else {
            this.tInstId = str;
        }
        if ((i & 4) == 0) {
            this.tInstType = "";
        } else {
            this.tInstType = str2;
        }
        if ((i & 8) == 0) {
            this.tLast = "";
        } else {
            this.tLast = str3;
        }
        if ((i & 16) == 0) {
            this.tPosCcy = "";
        } else {
            this.tPosCcy = str4;
        }
        if ((i & 32) == 0) {
            this.tPosId = "";
        } else {
            this.tPosId = str5;
        }
        if ((i & 64) == 0) {
            this.tPos = "";
        } else {
            this.tPos = str6;
        }
        if ((i & 128) == 0) {
            this.tPosSign = "";
        } else {
            this.tPosSign = str7;
        }
        if ((i & 256) == 0) {
            this.tSize = "";
        } else {
            this.tSize = str8;
        }
        if ((i & 512) == 0) {
            this.tPosSide = "";
        } else {
            this.tPosSide = str9;
        }
        if ((i & 1024) == 0) {
            this.tBSSide = "";
        } else {
            this.tBSSide = str10;
        }
        if ((i & 2048) == 0) {
            this.tCcy = "";
        } else {
            this.tCcy = str11;
        }
        if ((i & 4096) == 0) {
            this.tImr = "";
        } else {
            this.tImr = str12;
        }
        if ((i & 8192) == 0) {
            this.tImrSign = "";
        } else {
            this.tImrSign = str13;
        }
        if ((i & 16384) == 0) {
            this.tMargin = "";
        } else {
            this.tMargin = str14;
        }
        if ((32768 & i) == 0) {
            this.tMarginSign = "";
        } else {
            this.tMarginSign = str15;
        }
        if ((65536 & i) == 0) {
            this.tMgnMode = "";
        } else {
            this.tMgnMode = str16;
        }
        if ((131072 & i) == 0) {
            this.tLiqPx = "";
        } else {
            this.tLiqPx = str17;
        }
        if ((262144 & i) == 0) {
            this.tBePx = "";
        } else {
            this.tBePx = str18;
        }
        if ((524288 & i) == 0) {
            this.tAvgPx = "";
        } else {
            this.tAvgPx = str19;
        }
        if ((1048576 & i) == 0) {
            this.tUpl = "";
        } else {
            this.tUpl = str20;
        }
        if ((2097152 & i) == 0) {
            this.tUplSign = "";
        } else {
            this.tUplSign = str21;
        }
        if ((4194304 & i) == 0) {
            this.tUplRatio = "";
        } else {
            this.tUplRatio = str22;
        }
        if ((8388608 & i) == 0) {
            this.tUplLastPx = "";
        } else {
            this.tUplLastPx = str23;
        }
        if ((16777216 & i) == 0) {
            this.tUplRatioLastPx = "";
        } else {
            this.tUplRatioLastPx = str24;
        }
        if ((33554432 & i) == 0) {
            this.tLongClick = false;
        } else {
            this.tLongClick = z;
        }
        this.tIsMainOrder = (67108864 & i) == 0 ? true : z2;
        if ((134217728 & i) == 0) {
            this.tSelected = false;
        } else {
            this.tSelected = z3;
        }
        if ((268435456 & i) == 0) {
            this.tLiqSelected = false;
        } else {
            this.tLiqSelected = z4;
        }
        if ((536870912 & i) == 0) {
            this.tBeSelected = false;
        } else {
            this.tBeSelected = z5;
        }
        if ((1073741824 & i) == 0) {
            this.tShowSolid = false;
        } else {
            this.tShowSolid = z6;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.tShowSolidLiq = false;
        } else {
            this.tShowSolidLiq = z7;
        }
        if ((i2 & 1) == 0) {
            this.tShowSolidBE = false;
        } else {
            this.tShowSolidBE = z8;
        }
        if ((i2 & 2) == 0) {
            this.tSLLeft = -1;
        } else {
            this.tSLLeft = i4;
        }
        if ((i2 & 4) == 0) {
            this.tTPLeft = -1;
        } else {
            this.tTPLeft = i5;
        }
        if ((i2 & 8) == 0) {
            this.tDragTP = false;
        } else {
            this.tDragTP = z9;
        }
        if ((i2 & 16) == 0) {
            this.tDragSL = false;
        } else {
            this.tDragSL = z10;
        }
        if ((i2 & 32) == 0) {
            this.tIsSupportPR = false;
        } else {
            this.tIsSupportPR = z11;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(OkxTradePositionBean okxTradePositionBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || okxTradePositionBean.tIndex != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, okxTradePositionBean.tIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tInstId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, okxTradePositionBean.tInstId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tInstType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, okxTradePositionBean.tInstType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tLast, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, okxTradePositionBean.tLast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tPosCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, okxTradePositionBean.tPosCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tPosId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, okxTradePositionBean.tPosId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tPos, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, okxTradePositionBean.tPos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tPosSign, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, okxTradePositionBean.tPosSign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tSize, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, okxTradePositionBean.tSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tPosSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, okxTradePositionBean.tPosSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tBSSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, okxTradePositionBean.tBSSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, okxTradePositionBean.tCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tImr, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, okxTradePositionBean.tImr);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tImrSign, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, okxTradePositionBean.tImrSign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tMargin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, okxTradePositionBean.tMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tMarginSign, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, okxTradePositionBean.tMarginSign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tMgnMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, okxTradePositionBean.tMgnMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tLiqPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, okxTradePositionBean.tLiqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tBePx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, okxTradePositionBean.tBePx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, okxTradePositionBean.tAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tUpl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, okxTradePositionBean.tUpl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tUplSign, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, okxTradePositionBean.tUplSign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tUplRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, okxTradePositionBean.tUplRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tUplLastPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, okxTradePositionBean.tUplLastPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) okxTradePositionBean.tUplRatioLastPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, okxTradePositionBean.tUplRatioLastPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || okxTradePositionBean.tLongClick) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 25, okxTradePositionBean.tLongClick);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !okxTradePositionBean.tIsMainOrder) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 26, okxTradePositionBean.tIsMainOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || okxTradePositionBean.tSelected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 27, okxTradePositionBean.tSelected);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || okxTradePositionBean.tLiqSelected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 28, okxTradePositionBean.tLiqSelected);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || okxTradePositionBean.tBeSelected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 29, okxTradePositionBean.tBeSelected);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || okxTradePositionBean.tShowSolid) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 30, okxTradePositionBean.tShowSolid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || okxTradePositionBean.tShowSolidLiq) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 31, okxTradePositionBean.tShowSolidLiq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || okxTradePositionBean.tShowSolidBE) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 32, okxTradePositionBean.tShowSolidBE);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || okxTradePositionBean.tSLLeft != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 33, okxTradePositionBean.tSLLeft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || okxTradePositionBean.tTPLeft != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 34, okxTradePositionBean.tTPLeft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || okxTradePositionBean.tDragTP) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 35, okxTradePositionBean.tDragTP);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || okxTradePositionBean.tDragSL) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 36, okxTradePositionBean.tDragSL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || okxTradePositionBean.tIsSupportPR) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 37, okxTradePositionBean.tIsSupportPR);
        }
    }

    public OkxTradePositionBean() {
        this.tIndex = -1;
        this.tInstId = "";
        this.tInstType = "";
        this.tLast = "";
        this.tPosCcy = "";
        this.tPosId = "";
        this.tPos = "";
        this.tPosSign = "";
        this.tSize = "";
        this.tPosSide = "";
        this.tBSSide = "";
        this.tCcy = "";
        this.tImr = "";
        this.tImrSign = "";
        this.tMargin = "";
        this.tMarginSign = "";
        this.tMgnMode = "";
        this.tLiqPx = "";
        this.tBePx = "";
        this.tAvgPx = "";
        this.tUpl = "";
        this.tUplSign = "";
        this.tUplRatio = "";
        this.tUplLastPx = "";
        this.tUplRatioLastPx = "";
        this.tIsMainOrder = true;
        this.tSLLeft = -1;
        this.tTPLeft = -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OkxTradePositionBean(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, boolean z) {
        this();
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
        this.tIndex = i;
        this.tInstId = str;
        this.tInstType = str2;
        this.tLast = str3;
        this.tPosCcy = str4;
        this.tPosId = str5;
        this.tPos = (Intrinsics.EZpvd((Object) str2, (Object) "MARGIN") ? oLW.AEQbTJ.OLrzqt(str, str2, str8, str4) : oLW.AEQbTJ.KWHzl(str, str2, str8, str3)).getFirst();
        this.tPosSign = (Intrinsics.EZpvd((Object) this.tInstType, (Object) "MARGIN") ? oLW.AEQbTJ.OLrzqt(str, str2, str8, str4) : oLW.AEQbTJ.KWHzl(str, str2, str8, str3)).getSecond();
        this.tSize = str8;
        this.tPosSide = str6;
        this.tBSSide = str7;
        this.tCcy = str9;
        this.tImr = (Intrinsics.EZpvd((Object) str2, (Object) "MARGIN") ? oLW.AEQbTJ.EZpvd(str, str2, str9, str10) : oLW.AEQbTJ.KWHzl(str, str2, str10)).getFirst();
        this.tImrSign = (Intrinsics.EZpvd((Object) str2, (Object) "MARGIN") ? oLW.AEQbTJ.EZpvd(str, str2, str9, str10) : oLW.AEQbTJ.KWHzl(str, str2, str10)).getSecond();
        this.tMargin = (Intrinsics.EZpvd((Object) str2, (Object) "MARGIN") ? oLW.AEQbTJ.EZpvd(str, str2, str9, str11) : oLW.AEQbTJ.AEQbTJ(str, str2, str11)).getFirst();
        this.tMarginSign = (Intrinsics.EZpvd((Object) str2, (Object) "MARGIN") ? oLW.AEQbTJ.EZpvd(str, str2, str9, str11) : oLW.AEQbTJ.AEQbTJ(str, str2, str11)).getSecond();
        this.tMgnMode = str12;
        this.tLiqPx = str13;
        this.tBePx = str14;
        this.tAvgPx = str15;
        oLW olw = oLW.AEQbTJ;
        this.tUpl = olw.AEQbTJ(str, str2, getUplPrice(str16, str18), str9).getFirst();
        this.tUplSign = olw.AEQbTJ(str, str2, str16, str9).getSecond();
        this.tUplRatio = getRatio(str17, str19);
        this.tIsSupportPR = z;
    }

    private final String getUplPrice(String str, String str2) {
        String strAubY;
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (strAubY = newProxyInstance.AubY()) == null) {
            strAubY = "";
        }
        return (!Intrinsics.EZpvd((Object) strAubY, (Object) "1") || Intrinsics.EZpvd((Object) this.tInstType, (Object) "OPTION")) ? str : str2;
    }

    private final String getRatio(String str, String str2) {
        String strAubY;
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (strAubY = newProxyInstance.AubY()) == null) {
            strAubY = "";
        }
        return (!Intrinsics.EZpvd((Object) strAubY, (Object) "1") || Intrinsics.EZpvd((Object) this.tInstType, (Object) "OPTION")) ? str : str2;
    }
}

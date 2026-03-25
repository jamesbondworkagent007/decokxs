package com.okinc.kline.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class KlineSpotAverageBean implements Parcelable {
    private String accAvgPx;
    private String cashBal;
    public String ccy;
    private List<KlineDexAvgDataBean> dexAvgDataList;
    private String formatAccAvgPx;
    private String formatOpenAvgPx;
    private boolean isOpenAvgPx;
    private String openAvgPx;
    private String originAccAvgPx;
    private String originOpenAvgPx;
    private String quoteUnit;
    private int sLLeft;
    private boolean showSpotAverageLine;
    private String slOrdPx;
    private String spotBal;
    private String spotUpl;
    private String spotUplRatio;
    private boolean tDragSL;
    private boolean tDragTP;
    private boolean tLongClick;
    private int tPLeft;
    private boolean tSelected;
    private boolean tShowSolid;
    private String tUplRatioLastPx;
    private String totalPnl;
    private String totalPnlRatio;
    private String tpOrdPx;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<KlineSpotAverageBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(KlineDexAvgDataBean$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<KlineSpotAverageBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineSpotAverageBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return new KlineSpotAverageBean();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KlineSpotAverageBean[] newArray(int i) {
            return new KlineSpotAverageBean[i];
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
    public final String getCashBal() {
        return this.cashBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KlineDexAvgDataBean> getDexAvgDataList() {
        return this.dexAvgDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFormatAccAvgPx() {
        return this.formatAccAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFormatOpenAvgPx() {
        return this.formatOpenAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenAvgPx() {
        return this.openAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginAccAvgPx() {
        return this.originAccAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginOpenAvgPx() {
        return this.originOpenAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteUnit() {
        return this.quoteUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSLLeft() {
        return this.sLLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowSpotAverageLine() {
        return this.showSpotAverageLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrdPx() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotBal() {
        return this.spotBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotUpl() {
        return this.spotUpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotUplRatio() {
        return this.spotUplRatio;
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
    public final boolean getTLongClick() {
        return this.tLongClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTPLeft() {
        return this.tPLeft;
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
    public final String getTUplRatioLastPx() {
        return this.tUplRatioLastPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnl() {
        return this.totalPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPnlRatio() {
        return this.totalPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrdPx() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOpenAvgPx() {
        return this.isOpenAvgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCashBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cashBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexAvgDataList(@NotNull List<KlineDexAvgDataBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.dexAvgDataList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFormatAccAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.formatAccAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFormatOpenAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.formatOpenAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.openAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenAvgPx(boolean z) {
        this.isOpenAvgPx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginAccAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originAccAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginOpenAvgPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originOpenAvgPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSLLeft(int i) {
        this.sLLeft = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSpotAverageLine(boolean z) {
        this.showSpotAverageLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrdPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotBal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.spotBal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotUpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.spotUpl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotUplRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.spotUplRatio = str;
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
    public final void setTLongClick(boolean z) {
        this.tLongClick = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTPLeft(int i) {
        this.tPLeft = i;
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
    public final void setTUplRatioLastPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tUplRatioLastPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalPnlRatio(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalPnlRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrdPx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpOrdPx = str;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kline.data.KlineSpotAverageBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KlineSpotAverageBean> serializer() {
            return KlineSpotAverageBean$$serializer.INSTANCE;
        }
    }

    public KlineSpotAverageBean() {
        this.ccy = "";
        this.quoteUnit = "";
        this.sLLeft = -1;
        this.tPLeft = -1;
        this.isOpenAvgPx = true;
        this.openAvgPx = "";
        this.formatOpenAvgPx = "";
        this.accAvgPx = "";
        this.formatAccAvgPx = "";
        this.originOpenAvgPx = "";
        this.originAccAvgPx = "";
        this.tUplRatioLastPx = "";
        this.cashBal = "";
        this.tpOrdPx = "";
        this.slOrdPx = "";
        this.spotUpl = "";
        this.spotUplRatio = "";
        this.spotBal = "";
        this.totalPnl = "";
        this.totalPnlRatio = "";
        this.dexAvgDataList = new ArrayList();
    }

    public /* synthetic */ KlineSpotAverageBean(int i, String str, String str2, int i2, int i3, boolean z, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str;
        }
        if ((i & 2) == 0) {
            this.quoteUnit = "";
        } else {
            this.quoteUnit = str2;
        }
        if ((i & 4) == 0) {
            this.sLLeft = -1;
        } else {
            this.sLLeft = i2;
        }
        if ((i & 8) == 0) {
            this.tPLeft = -1;
        } else {
            this.tPLeft = i3;
        }
        if ((i & 16) == 0) {
            this.showSpotAverageLine = false;
        } else {
            this.showSpotAverageLine = z;
        }
        this.isOpenAvgPx = (i & 32) == 0 ? true : z2;
        if ((i & 64) == 0) {
            this.openAvgPx = "";
        } else {
            this.openAvgPx = str3;
        }
        if ((i & 128) == 0) {
            this.formatOpenAvgPx = "";
        } else {
            this.formatOpenAvgPx = str4;
        }
        if ((i & 256) == 0) {
            this.accAvgPx = "";
        } else {
            this.accAvgPx = str5;
        }
        if ((i & 512) == 0) {
            this.formatAccAvgPx = "";
        } else {
            this.formatAccAvgPx = str6;
        }
        if ((i & 1024) == 0) {
            this.originOpenAvgPx = "";
        } else {
            this.originOpenAvgPx = str7;
        }
        if ((i & 2048) == 0) {
            this.originAccAvgPx = "";
        } else {
            this.originAccAvgPx = str8;
        }
        if ((i & 4096) == 0) {
            this.tUplRatioLastPx = "";
        } else {
            this.tUplRatioLastPx = str9;
        }
        if ((i & 8192) == 0) {
            this.cashBal = "";
        } else {
            this.cashBal = str10;
        }
        if ((i & 16384) == 0) {
            this.tLongClick = false;
        } else {
            this.tLongClick = z3;
        }
        if ((32768 & i) == 0) {
            this.tSelected = false;
        } else {
            this.tSelected = z4;
        }
        if ((65536 & i) == 0) {
            this.tShowSolid = false;
        } else {
            this.tShowSolid = z5;
        }
        if ((131072 & i) == 0) {
            this.tDragTP = false;
        } else {
            this.tDragTP = z6;
        }
        if ((262144 & i) == 0) {
            this.tDragSL = false;
        } else {
            this.tDragSL = z7;
        }
        if ((524288 & i) == 0) {
            this.tpOrdPx = "";
        } else {
            this.tpOrdPx = str11;
        }
        if ((1048576 & i) == 0) {
            this.slOrdPx = "";
        } else {
            this.slOrdPx = str12;
        }
        if ((2097152 & i) == 0) {
            this.spotUpl = "";
        } else {
            this.spotUpl = str13;
        }
        if ((4194304 & i) == 0) {
            this.spotUplRatio = "";
        } else {
            this.spotUplRatio = str14;
        }
        if ((8388608 & i) == 0) {
            this.spotBal = "";
        } else {
            this.spotBal = str15;
        }
        if ((16777216 & i) == 0) {
            this.totalPnl = "";
        } else {
            this.totalPnl = str16;
        }
        if ((33554432 & i) == 0) {
            this.totalPnlRatio = "";
        } else {
            this.totalPnlRatio = str17;
        }
        this.dexAvgDataList = (i & 67108864) == 0 ? new ArrayList() : list;
    }

    public static final /* synthetic */ void write$Self$OKCandleStickChart_chart_impl(KlineSpotAverageBean klineSpotAverageBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, klineSpotAverageBean.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.quoteUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, klineSpotAverageBean.quoteUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || klineSpotAverageBean.sLLeft != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, klineSpotAverageBean.sLLeft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || klineSpotAverageBean.tPLeft != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, klineSpotAverageBean.tPLeft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || klineSpotAverageBean.showSpotAverageLine) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, klineSpotAverageBean.showSpotAverageLine);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !klineSpotAverageBean.isOpenAvgPx) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, klineSpotAverageBean.isOpenAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.openAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, klineSpotAverageBean.openAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.formatOpenAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, klineSpotAverageBean.formatOpenAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.accAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, klineSpotAverageBean.accAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.formatAccAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, klineSpotAverageBean.formatAccAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.originOpenAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, klineSpotAverageBean.originOpenAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.originAccAvgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, klineSpotAverageBean.originAccAvgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.tUplRatioLastPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, klineSpotAverageBean.tUplRatioLastPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.cashBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, klineSpotAverageBean.cashBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || klineSpotAverageBean.tLongClick) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, klineSpotAverageBean.tLongClick);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || klineSpotAverageBean.tSelected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, klineSpotAverageBean.tSelected);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || klineSpotAverageBean.tShowSolid) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, klineSpotAverageBean.tShowSolid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || klineSpotAverageBean.tDragTP) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, klineSpotAverageBean.tDragTP);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || klineSpotAverageBean.tDragSL) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, klineSpotAverageBean.tDragSL);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.tpOrdPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, klineSpotAverageBean.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.slOrdPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, klineSpotAverageBean.slOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.spotUpl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, klineSpotAverageBean.spotUpl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.spotUplRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, klineSpotAverageBean.spotUplRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.spotBal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, klineSpotAverageBean.spotBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.totalPnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, klineSpotAverageBean.totalPnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) klineSpotAverageBean.totalPnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, klineSpotAverageBean.totalPnlRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) && Intrinsics.EZpvd(klineSpotAverageBean.dexAvgDataList, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 26, kSerializerArr[26], klineSpotAverageBean.dexAvgDataList);
    }
}

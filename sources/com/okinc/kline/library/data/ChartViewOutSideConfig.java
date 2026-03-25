package com.okinc.kline.library.data;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import androidx.camera.video.AudioStats;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.BotPendingLineVo;
import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineQuickOrderPriceBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.kline.library.template.TemplateSetting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC49408unw;
import o.C43246rlf;
import o.C55298xhM;
import o.InterfaceC39506ptd;
import o.InterfaceC39510pth;
import o.oLS;
import o.oLZ;
import o.oUI;
import o.oUL;
import o.oUO;
import o.oWK;
import o.oWN;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ChartViewOutSideConfig extends AbstractC49408unw<ChartViewOutSideConfig> {
    public static final int $stable = 8;
    private String amountDisplaySymbol;
    private final LinkedHashMap<String, ChartArea> areas;
    private BotPendingLineVo botOrdersBean;
    private RectF bsRect;
    private boolean canShowQuickOrder;
    private String chartFromType;
    private int chartMode;
    private final HashMap<String, Integer> chartStyles;
    private String chartTag;
    private int chartYAxisNum;
    private List<Bitmap> compareBitmapList;
    private oUL controlBeanAfterInit;
    private String currentMode;
    private HashMap<String, DataSource> dataSources;
    private int defaultTime;
    private String dexChartSource;
    private boolean economicDefaultStatus;
    private String endTime;
    private oUI fastKLineBean;
    private RectF fullScreenRect;
    private BotPendingLineVo gridPendingData;
    private InterfaceC39506ptd gridPriceData;
    private boolean isAutoYScaleClick;
    private boolean isBotKLine;
    private boolean isCeFiMCapMode;
    private boolean isColumnChart;
    private boolean isCompareKLine;
    private boolean isDragSubIndicatorOrNot;
    private boolean isDrawing;
    private boolean isFastKLineMode;
    private boolean isFastKLineMoveEnd;
    private boolean isFromCompare;
    private boolean isFromFormula;
    private boolean isFullScreenMode;
    private boolean isHideMainIndex;
    private boolean isHideTradeDrawingLine;
    private boolean isHistoryCandlesLoading;
    private boolean isKLineInfiniteScale;
    private boolean isMarketCap;
    private boolean isOpenCoolTime;
    private boolean isOrderSupportClick;
    private boolean isPortraitChart;
    private boolean isRightHistoryCandlesLoading;
    private boolean isScreen;
    private boolean isScreenChange;
    private boolean isShowBe;
    private boolean isShowEmptyUi;
    private boolean isShowLiq;
    private boolean isShowPanel;
    private boolean isShowPastEvents;
    private boolean isShowPriceType;
    private boolean isShowSpotAveragePrice;
    private boolean isShowUpcomingEvents;
    private boolean isSimulateLine;
    private boolean isSpotCostSupportClick;
    private boolean isSupportDragOrder;
    private boolean isUtc8;
    private float klineDefaultOffset;
    private ArrayList<KLineEventBean> klineEventList;
    private List<oLS> klineEventMergeList;
    private String klinePriceType;
    private KlineSpotAverageBean klineSpotAverageBean;
    private int landscapeKLineScrollY;
    private oUO lastCandleItem;
    private ArrayList<DrawLineData.DrawLineItem> linesList;
    private int mAvgCustomColor;
    private String mCandleDownColor;
    private String mCandleRiseColor;
    private int mCandlestickType;
    private boolean mChartHistoryOrder;
    private volatile boolean mChartOffsetInit;
    private int mChartPosition;
    private int mCoinVol;
    private boolean mConvertCNY;
    private boolean mDexAvgExtend;
    private boolean mDexAvgShowPnlAmt;
    private boolean mDexAvgShowRight;
    private boolean mDrawLineEnable;
    private boolean mHideKlineDrawingData;
    private int mKlineAbstractType;
    private float mKlineCurrentOffset;
    private float mKlineInitOffset;
    private float mKlineLastOffset;
    private int mKlineYScaleAutoType;
    private int mMaxEfficientDigits;
    private String mMoneySymbol;
    private int mNegativeColor;
    private boolean mOpenOrderShowRight;
    private boolean mOrderCancelConfirm;
    private int mOrdinateType;
    private int mPositiveColor;
    private int mPriceFractionDigits;
    private boolean mShowAxis;
    private boolean mShowCostLine;
    private boolean mShowCountdown;
    private boolean mShowCurrentOrder;
    private boolean mShowHistoryOrder;
    private boolean mShowOpenOrderExtendedLine;
    private boolean mShowPriceLine;
    private boolean mShowPriceWarning;
    private boolean mShowTradePosExtendedLine;
    private boolean mShowVolume;
    private String mTitle;
    private boolean mTradePosShowPnl;
    private boolean mTradePosShowRight;
    private double mUsdCnyRate;
    private String mode;
    private String moveInterceptMode;
    private boolean needUpdateInYScale;
    private final List<KlineOpenOrderBean> openOrderDataList;
    private String preMode;
    private List<PriceWarningItemBean> priceWarningDataList;
    private KlineQuickOrderPriceBean quickOrderPriceBean;
    private int screenType;
    private boolean showCurPotionTabMSA;
    private boolean showHistoryOrderTabMSA;
    private String startTime;
    private oLZ supportResistance;
    private final HashMap<String, TemplateSetting> templateSettings;
    private final HashMap<String, oWK> themes;
    private final HashMap<String, oWN> timelines;
    private int topPanelHeight;
    private final List<InterfaceC39510pth> tradePositionDataList;
    private String tradeSymbol;
    private String turnoverDisplaySymbol;
    private int volTransparent;
    private int volTransparentSub;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChartViewOutSideConfig() {
        this(false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, Integer.MAX_VALUE, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: com.okinc.kline.library.data.ChartViewOutSideConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChartViewOutSideConfig copy$default(ChartViewOutSideConfig chartViewOutSideConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ArrayList arrayList, ArrayList arrayList2, List list, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i, int i2, boolean z30, boolean z31, boolean z32, float f, float f2, float f3, float f4, int i3, int i4, RectF rectF, boolean z33, RectF rectF2, boolean z34, List list2, List list3, List list4, List list5, KlineQuickOrderPriceBean klineQuickOrderPriceBean, boolean z35, String str, String str2, String str3, boolean z36, boolean z37, String str4, int i5, int i6, BotPendingLineVo botPendingLineVo, InterfaceC39506ptd interfaceC39506ptd, BotPendingLineVo botPendingLineVo2, oLZ olz, String str5, String str6, String str7, String str8, int i7, boolean z38, int i8, String str9, String str10, int i9, int i10, int i11, String str11, String str12, String str13, int i12, int i13, boolean z39, boolean z40, boolean z41, boolean z42, boolean z43, oUO ouo, oUI oui, boolean z44, int i14, boolean z45, boolean z46, boolean z47, boolean z48, double d, int i15, int i16, int i17, int i18, String str14, int i19, boolean z49, String str15, String str16, boolean z50, HashMap map, HashMap map2, HashMap map3, LinkedHashMap linkedHashMap, HashMap map4, HashMap map5, boolean z51, boolean z52, String str17, boolean z53, boolean z54, boolean z55, boolean z56, KlineSpotAverageBean klineSpotAverageBean, boolean z57, boolean z58, oUL oul, boolean z59, boolean z60, boolean z61, boolean z62, int i20, int i21, int i22, int i23, Object obj) {
        return chartViewOutSideConfig.copy((i20 & 1) != 0 ? chartViewOutSideConfig.mShowAxis : z, (i20 & 2) != 0 ? chartViewOutSideConfig.mShowVolume : z2, (i20 & 4) != 0 ? chartViewOutSideConfig.isUtc8 : z3, (i20 & 8) != 0 ? chartViewOutSideConfig.isHideMainIndex : z4, (i20 & 16) != 0 ? chartViewOutSideConfig.isPortraitChart : z5, (i20 & 32) != 0 ? chartViewOutSideConfig.isOrderSupportClick : z6, (i20 & 64) != 0 ? chartViewOutSideConfig.isSpotCostSupportClick : z7, (i20 & 128) != 0 ? chartViewOutSideConfig.linesList : arrayList, (i20 & 256) != 0 ? chartViewOutSideConfig.klineEventList : arrayList2, (i20 & 512) != 0 ? chartViewOutSideConfig.klineEventMergeList : list, (i20 & 1024) != 0 ? chartViewOutSideConfig.showHistoryOrderTabMSA : z8, (i20 & 2048) != 0 ? chartViewOutSideConfig.showCurPotionTabMSA : z9, (i20 & 4096) != 0 ? chartViewOutSideConfig.isColumnChart : z10, (i20 & 8192) != 0 ? chartViewOutSideConfig.mShowPriceLine : z11, (i20 & 16384) != 0 ? chartViewOutSideConfig.economicDefaultStatus : z12, (i20 & 32768) != 0 ? chartViewOutSideConfig.mShowHistoryOrder : z13, (i20 & 65536) != 0 ? chartViewOutSideConfig.mChartHistoryOrder : z14, (i20 & 131072) != 0 ? chartViewOutSideConfig.mShowCurrentOrder : z15, (i20 & 262144) != 0 ? chartViewOutSideConfig.mShowCostLine : z16, (i20 & 524288) != 0 ? chartViewOutSideConfig.mShowCountdown : z17, (i20 & 1048576) != 0 ? chartViewOutSideConfig.mHideKlineDrawingData : z18, (i20 & 2097152) != 0 ? chartViewOutSideConfig.mShowPriceWarning : z19, (i20 & 4194304) != 0 ? chartViewOutSideConfig.mShowOpenOrderExtendedLine : z20, (i20 & 8388608) != 0 ? chartViewOutSideConfig.mShowTradePosExtendedLine : z21, (i20 & 16777216) != 0 ? chartViewOutSideConfig.mOpenOrderShowRight : z22, (i20 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? chartViewOutSideConfig.mDexAvgShowRight : z23, (i20 & 67108864) != 0 ? chartViewOutSideConfig.mDexAvgShowPnlAmt : z24, (i20 & 134217728) != 0 ? chartViewOutSideConfig.mDexAvgExtend : z25, (i20 & 268435456) != 0 ? chartViewOutSideConfig.mTradePosShowRight : z26, (i20 & 536870912) != 0 ? chartViewOutSideConfig.mTradePosShowPnl : z27, (i20 & 1073741824) != 0 ? chartViewOutSideConfig.isShowPastEvents : z28, (i20 & Integer.MIN_VALUE) != 0 ? chartViewOutSideConfig.isShowUpcomingEvents : z29, (i21 & 1) != 0 ? chartViewOutSideConfig.volTransparent : i, (i21 & 2) != 0 ? chartViewOutSideConfig.volTransparentSub : i2, (i21 & 4) != 0 ? chartViewOutSideConfig.isHistoryCandlesLoading : z30, (i21 & 8) != 0 ? chartViewOutSideConfig.isRightHistoryCandlesLoading : z31, (i21 & 16) != 0 ? chartViewOutSideConfig.mChartOffsetInit : z32, (i21 & 32) != 0 ? chartViewOutSideConfig.mKlineInitOffset : f, (i21 & 64) != 0 ? chartViewOutSideConfig.klineDefaultOffset : f2, (i21 & 128) != 0 ? chartViewOutSideConfig.mKlineCurrentOffset : f3, (i21 & 256) != 0 ? chartViewOutSideConfig.mKlineLastOffset : f4, (i21 & 512) != 0 ? chartViewOutSideConfig.topPanelHeight : i3, (i21 & 1024) != 0 ? chartViewOutSideConfig.screenType : i4, (i21 & 2048) != 0 ? chartViewOutSideConfig.bsRect : rectF, (i21 & 4096) != 0 ? chartViewOutSideConfig.isAutoYScaleClick : z33, (i21 & 8192) != 0 ? chartViewOutSideConfig.fullScreenRect : rectF2, (i21 & 16384) != 0 ? chartViewOutSideConfig.isShowPanel : z34, (i21 & 32768) != 0 ? chartViewOutSideConfig.priceWarningDataList : list2, (i21 & 65536) != 0 ? chartViewOutSideConfig.tradePositionDataList : list3, (i21 & 131072) != 0 ? chartViewOutSideConfig.openOrderDataList : list4, (i21 & 262144) != 0 ? chartViewOutSideConfig.compareBitmapList : list5, (i21 & 524288) != 0 ? chartViewOutSideConfig.quickOrderPriceBean : klineQuickOrderPriceBean, (i21 & 1048576) != 0 ? chartViewOutSideConfig.isShowEmptyUi : z35, (i21 & 2097152) != 0 ? chartViewOutSideConfig.startTime : str, (i21 & 4194304) != 0 ? chartViewOutSideConfig.endTime : str2, (i21 & 8388608) != 0 ? chartViewOutSideConfig.klinePriceType : str3, (i21 & 16777216) != 0 ? chartViewOutSideConfig.isScreen : z36, (i21 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? chartViewOutSideConfig.isSimulateLine : z37, (i21 & 67108864) != 0 ? chartViewOutSideConfig.chartTag : str4, (i21 & 134217728) != 0 ? chartViewOutSideConfig.defaultTime : i5, (i21 & 268435456) != 0 ? chartViewOutSideConfig.landscapeKLineScrollY : i6, (i21 & 536870912) != 0 ? chartViewOutSideConfig.botOrdersBean : botPendingLineVo, (i21 & 1073741824) != 0 ? chartViewOutSideConfig.gridPriceData : interfaceC39506ptd, (i21 & Integer.MIN_VALUE) != 0 ? chartViewOutSideConfig.gridPendingData : botPendingLineVo2, (i22 & 1) != 0 ? chartViewOutSideConfig.supportResistance : olz, (i22 & 2) != 0 ? chartViewOutSideConfig.mode : str5, (i22 & 4) != 0 ? chartViewOutSideConfig.preMode : str6, (i22 & 8) != 0 ? chartViewOutSideConfig.chartFromType : str7, (i22 & 16) != 0 ? chartViewOutSideConfig.dexChartSource : str8, (i22 & 32) != 0 ? chartViewOutSideConfig.chartYAxisNum : i7, (i22 & 64) != 0 ? chartViewOutSideConfig.needUpdateInYScale : z38, (i22 & 128) != 0 ? chartViewOutSideConfig.chartMode : i8, (i22 & 256) != 0 ? chartViewOutSideConfig.amountDisplaySymbol : str9, (i22 & 512) != 0 ? chartViewOutSideConfig.turnoverDisplaySymbol : str10, (i22 & 1024) != 0 ? chartViewOutSideConfig.mPositiveColor : i9, (i22 & 2048) != 0 ? chartViewOutSideConfig.mNegativeColor : i10, (i22 & 4096) != 0 ? chartViewOutSideConfig.mAvgCustomColor : i11, (i22 & 8192) != 0 ? chartViewOutSideConfig.mCandleRiseColor : str11, (i22 & 16384) != 0 ? chartViewOutSideConfig.mCandleDownColor : str12, (i22 & 32768) != 0 ? chartViewOutSideConfig.mMoneySymbol : str13, (i22 & 65536) != 0 ? chartViewOutSideConfig.mOrdinateType : i12, (i22 & 131072) != 0 ? chartViewOutSideConfig.mKlineAbstractType : i13, (i22 & 262144) != 0 ? chartViewOutSideConfig.isBotKLine : z39, (i22 & 524288) != 0 ? chartViewOutSideConfig.isCompareKLine : z40, (i22 & 1048576) != 0 ? chartViewOutSideConfig.isKLineInfiniteScale : z41, (i22 & 2097152) != 0 ? chartViewOutSideConfig.isFastKLineMode : z42, (i22 & 4194304) != 0 ? chartViewOutSideConfig.isScreenChange : z43, (i22 & 8388608) != 0 ? chartViewOutSideConfig.lastCandleItem : ouo, (i22 & 16777216) != 0 ? chartViewOutSideConfig.fastKLineBean : oui, (i22 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? chartViewOutSideConfig.isFastKLineMoveEnd : z44, (i22 & 67108864) != 0 ? chartViewOutSideConfig.mKlineYScaleAutoType : i14, (i22 & 134217728) != 0 ? chartViewOutSideConfig.isShowPriceType : z45, (i22 & 268435456) != 0 ? chartViewOutSideConfig.isHideTradeDrawingLine : z46, (i22 & 536870912) != 0 ? chartViewOutSideConfig.isDrawing : z47, (i22 & 1073741824) != 0 ? chartViewOutSideConfig.mConvertCNY : z48, (i22 & Integer.MIN_VALUE) != 0 ? chartViewOutSideConfig.mUsdCnyRate : d, (i23 & 1) != 0 ? chartViewOutSideConfig.mPriceFractionDigits : i15, (i23 & 2) != 0 ? chartViewOutSideConfig.mMaxEfficientDigits : i16, (i23 & 4) != 0 ? chartViewOutSideConfig.mCoinVol : i17, (i23 & 8) != 0 ? chartViewOutSideConfig.mCandlestickType : i18, (i23 & 16) != 0 ? chartViewOutSideConfig.mTitle : str14, (i23 & 32) != 0 ? chartViewOutSideConfig.mChartPosition : i19, (i23 & 64) != 0 ? chartViewOutSideConfig.mDrawLineEnable : z49, (i23 & 128) != 0 ? chartViewOutSideConfig.currentMode : str15, (i23 & 256) != 0 ? chartViewOutSideConfig.moveInterceptMode : str16, (i23 & 512) != 0 ? chartViewOutSideConfig.isFullScreenMode : z50, (i23 & 1024) != 0 ? chartViewOutSideConfig.dataSources : map, (i23 & 2048) != 0 ? chartViewOutSideConfig.themes : map2, (i23 & 4096) != 0 ? chartViewOutSideConfig.templateSettings : map3, (i23 & 8192) != 0 ? chartViewOutSideConfig.areas : linkedHashMap, (i23 & 16384) != 0 ? chartViewOutSideConfig.timelines : map4, (i23 & 32768) != 0 ? chartViewOutSideConfig.chartStyles : map5, (i23 & 65536) != 0 ? chartViewOutSideConfig.isDragSubIndicatorOrNot : z51, (i23 & 131072) != 0 ? chartViewOutSideConfig.isMarketCap : z52, (i23 & 262144) != 0 ? chartViewOutSideConfig.tradeSymbol : str17, (i23 & 524288) != 0 ? chartViewOutSideConfig.mOrderCancelConfirm : z53, (i23 & 1048576) != 0 ? chartViewOutSideConfig.isShowSpotAveragePrice : z54, (i23 & 2097152) != 0 ? chartViewOutSideConfig.isShowBe : z55, (i23 & 4194304) != 0 ? chartViewOutSideConfig.isShowLiq : z56, (i23 & 8388608) != 0 ? chartViewOutSideConfig.klineSpotAverageBean : klineSpotAverageBean, (i23 & 16777216) != 0 ? chartViewOutSideConfig.isOpenCoolTime : z57, (i23 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? chartViewOutSideConfig.canShowQuickOrder : z58, (i23 & 67108864) != 0 ? chartViewOutSideConfig.controlBeanAfterInit : oul, (i23 & 134217728) != 0 ? chartViewOutSideConfig.isCeFiMCapMode : z59, (i23 & 268435456) != 0 ? chartViewOutSideConfig.isFromFormula : z60, (i23 & 536870912) != 0 ? chartViewOutSideConfig.isFromCompare : z61, (i23 & 1073741824) != 0 ? chartViewOutSideConfig.isSupportDragOrder : z62);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.mShowAxis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<oLS> component10() {
        return this.klineEventMergeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component100() {
        return this.mCandlestickType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component101() {
        return this.mTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component102() {
        return this.mChartPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component103() {
        return this.mDrawLineEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component104() {
        return this.currentMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component105() {
        return this.moveInterceptMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component106() {
        return this.isFullScreenMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, DataSource> component107() {
        return this.dataSources;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, oWK> component108() {
        return this.themes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, TemplateSetting> component109() {
        return this.templateSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.showHistoryOrderTabMSA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashMap<String, ChartArea> component110() {
        return this.areas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, oWN> component111() {
        return this.timelines;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, Integer> component112() {
        return this.chartStyles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component113() {
        return this.isDragSubIndicatorOrNot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component114() {
        return this.isMarketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component115() {
        return this.tradeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component116() {
        return this.mOrderCancelConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component117() {
        return this.isShowSpotAveragePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component118() {
        return this.isShowBe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component119() {
        return this.isShowLiq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.showCurPotionTabMSA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineSpotAverageBean component120() {
        return this.klineSpotAverageBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component121() {
        return this.isOpenCoolTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component122() {
        return this.canShowQuickOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oUL component123() {
        return this.controlBeanAfterInit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component124() {
        return this.isCeFiMCapMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component125() {
        return this.isFromFormula;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component126() {
        return this.isFromCompare;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component127() {
        return this.isSupportDragOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.isColumnChart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.mShowPriceLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.economicDefaultStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.mShowHistoryOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.mChartHistoryOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.mShowCurrentOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.mShowCostLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.mShowVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component20() {
        return this.mShowCountdown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component21() {
        return this.mHideKlineDrawingData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.mShowPriceWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.mShowOpenOrderExtendedLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component24() {
        return this.mShowTradePosExtendedLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component25() {
        return this.mOpenOrderShowRight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component26() {
        return this.mDexAvgShowRight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component27() {
        return this.mDexAvgShowPnlAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component28() {
        return this.mDexAvgExtend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component29() {
        return this.mTradePosShowRight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component30() {
        return this.mTradePosShowPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component31() {
        return this.isShowPastEvents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component32() {
        return this.isShowUpcomingEvents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component33() {
        return this.volTransparent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component34() {
        return this.volTransparentSub;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component35() {
        return this.isHistoryCandlesLoading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component36() {
        return this.isRightHistoryCandlesLoading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component37() {
        return this.mChartOffsetInit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component38() {
        return this.mKlineInitOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component39() {
        return this.klineDefaultOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isHideMainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component40() {
        return this.mKlineCurrentOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component41() {
        return this.mKlineLastOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component42() {
        return this.topPanelHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component43() {
        return this.screenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF component44() {
        return this.bsRect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component45() {
        return this.isAutoYScaleClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF component46() {
        return this.fullScreenRect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component47() {
        return this.isShowPanel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PriceWarningItemBean> component48() {
        return this.priceWarningDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InterfaceC39510pth> component49() {
        return this.tradePositionDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isPortraitChart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KlineOpenOrderBean> component50() {
        return this.openOrderDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Bitmap> component51() {
        return this.compareBitmapList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineQuickOrderPriceBean component52() {
        return this.quickOrderPriceBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component53() {
        return this.isShowEmptyUi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.klinePriceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component57() {
        return this.isScreen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component58() {
        return this.isSimulateLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.chartTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isOrderSupportClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component60() {
        return this.defaultTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component61() {
        return this.landscapeKLineScrollY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotPendingLineVo component62() {
        return this.botOrdersBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC39506ptd component63() {
        return this.gridPriceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotPendingLineVo component64() {
        return this.gridPendingData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oLZ component65() {
        return this.supportResistance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.preMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component68() {
        return this.chartFromType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.dexChartSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isSpotCostSupportClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component70() {
        return this.chartYAxisNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component71() {
        return this.needUpdateInYScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component72() {
        return this.chartMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component73() {
        return this.amountDisplaySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component74() {
        return this.turnoverDisplaySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component75() {
        return this.mPositiveColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component76() {
        return this.mNegativeColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component77() {
        return this.mAvgCustomColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component78() {
        return this.mCandleRiseColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component79() {
        return this.mCandleDownColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DrawLineData.DrawLineItem> component8() {
        return this.linesList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component80() {
        return this.mMoneySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component81() {
        return this.mOrdinateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component82() {
        return this.mKlineAbstractType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component83() {
        return this.isBotKLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component84() {
        return this.isCompareKLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component85() {
        return this.isKLineInfiniteScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component86() {
        return this.isFastKLineMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component87() {
        return this.isScreenChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oUO component88() {
        return this.lastCandleItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oUI component89() {
        return this.fastKLineBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<KLineEventBean> component9() {
        return this.klineEventList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component90() {
        return this.isFastKLineMoveEnd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component91() {
        return this.mKlineYScaleAutoType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component92() {
        return this.isShowPriceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component93() {
        return this.isHideTradeDrawingLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component94() {
        return this.isDrawing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component95() {
        return this.mConvertCNY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component96() {
        return this.mUsdCnyRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component97() {
        return this.mPriceFractionDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component98() {
        return this.mMaxEfficientDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component99() {
        return this.mCoinVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartViewOutSideConfig copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, @NotNull ArrayList<DrawLineData.DrawLineItem> arrayList, @NotNull ArrayList<KLineEventBean> arrayList2, @NotNull List<oLS> list, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i, int i2, boolean z30, boolean z31, boolean z32, float f, float f2, float f3, float f4, int i3, int i4, RectF rectF, boolean z33, RectF rectF2, boolean z34, @NotNull List<PriceWarningItemBean> list2, @NotNull List<InterfaceC39510pth> list3, @NotNull List<KlineOpenOrderBean> list4, @NotNull List<Bitmap> list5, KlineQuickOrderPriceBean klineQuickOrderPriceBean, boolean z35, String str, String str2, @NotNull String str3, boolean z36, boolean z37, @NotNull String str4, int i5, int i6, BotPendingLineVo botPendingLineVo, InterfaceC39506ptd interfaceC39506ptd, BotPendingLineVo botPendingLineVo2, oLZ olz, @NotNull String str5, @NotNull String str6, String str7, String str8, int i7, boolean z38, int i8, String str9, String str10, int i9, int i10, int i11, String str11, String str12, String str13, int i12, int i13, boolean z39, boolean z40, boolean z41, boolean z42, boolean z43, oUO ouo, @NotNull oUI oui, boolean z44, int i14, boolean z45, boolean z46, boolean z47, boolean z48, double d, int i15, int i16, int i17, int i18, String str14, int i19, boolean z49, String str15, String str16, boolean z50, @NotNull HashMap<String, DataSource> map, @NotNull HashMap<String, oWK> map2, @NotNull HashMap<String, TemplateSetting> map3, @NotNull LinkedHashMap<String, ChartArea> linkedHashMap, @NotNull HashMap<String, oWN> map4, @NotNull HashMap<String, Integer> map5, boolean z51, boolean z52, @NotNull String str17, boolean z53, boolean z54, boolean z55, boolean z56, KlineSpotAverageBean klineSpotAverageBean, boolean z57, boolean z58, @NotNull oUL oul, boolean z59, boolean z60, boolean z61, boolean z62) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(oui, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(map3, "");
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
        Intrinsics.checkNotNullParameter(map4, "");
        Intrinsics.checkNotNullParameter(map5, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(oul, "");
        return new ChartViewOutSideConfig(z, z2, z3, z4, z5, z6, z7, arrayList, arrayList2, list, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, i, i2, z30, z31, z32, f, f2, f3, f4, i3, i4, rectF, z33, rectF2, z34, list2, list3, list4, list5, klineQuickOrderPriceBean, z35, str, str2, str3, z36, z37, str4, i5, i6, botPendingLineVo, interfaceC39506ptd, botPendingLineVo2, olz, str5, str6, str7, str8, i7, z38, i8, str9, str10, i9, i10, i11, str11, str12, str13, i12, i13, z39, z40, z41, z42, z43, ouo, oui, z44, i14, z45, z46, z47, z48, d, i15, i16, i17, i18, str14, i19, z49, str15, str16, z50, map, map2, map3, linkedHashMap, map4, map5, z51, z52, str17, z53, z54, z55, z56, klineSpotAverageBean, z57, z58, oul, z59, z60, z61, z62);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChartViewOutSideConfig)) {
            return false;
        }
        ChartViewOutSideConfig chartViewOutSideConfig = (ChartViewOutSideConfig) obj;
        return this.mShowAxis == chartViewOutSideConfig.mShowAxis && this.mShowVolume == chartViewOutSideConfig.mShowVolume && this.isUtc8 == chartViewOutSideConfig.isUtc8 && this.isHideMainIndex == chartViewOutSideConfig.isHideMainIndex && this.isPortraitChart == chartViewOutSideConfig.isPortraitChart && this.isOrderSupportClick == chartViewOutSideConfig.isOrderSupportClick && this.isSpotCostSupportClick == chartViewOutSideConfig.isSpotCostSupportClick && Intrinsics.EZpvd(this.linesList, chartViewOutSideConfig.linesList) && Intrinsics.EZpvd(this.klineEventList, chartViewOutSideConfig.klineEventList) && Intrinsics.EZpvd(this.klineEventMergeList, chartViewOutSideConfig.klineEventMergeList) && this.showHistoryOrderTabMSA == chartViewOutSideConfig.showHistoryOrderTabMSA && this.showCurPotionTabMSA == chartViewOutSideConfig.showCurPotionTabMSA && this.isColumnChart == chartViewOutSideConfig.isColumnChart && this.mShowPriceLine == chartViewOutSideConfig.mShowPriceLine && this.economicDefaultStatus == chartViewOutSideConfig.economicDefaultStatus && this.mShowHistoryOrder == chartViewOutSideConfig.mShowHistoryOrder && this.mChartHistoryOrder == chartViewOutSideConfig.mChartHistoryOrder && this.mShowCurrentOrder == chartViewOutSideConfig.mShowCurrentOrder && this.mShowCostLine == chartViewOutSideConfig.mShowCostLine && this.mShowCountdown == chartViewOutSideConfig.mShowCountdown && this.mHideKlineDrawingData == chartViewOutSideConfig.mHideKlineDrawingData && this.mShowPriceWarning == chartViewOutSideConfig.mShowPriceWarning && this.mShowOpenOrderExtendedLine == chartViewOutSideConfig.mShowOpenOrderExtendedLine && this.mShowTradePosExtendedLine == chartViewOutSideConfig.mShowTradePosExtendedLine && this.mOpenOrderShowRight == chartViewOutSideConfig.mOpenOrderShowRight && this.mDexAvgShowRight == chartViewOutSideConfig.mDexAvgShowRight && this.mDexAvgShowPnlAmt == chartViewOutSideConfig.mDexAvgShowPnlAmt && this.mDexAvgExtend == chartViewOutSideConfig.mDexAvgExtend && this.mTradePosShowRight == chartViewOutSideConfig.mTradePosShowRight && this.mTradePosShowPnl == chartViewOutSideConfig.mTradePosShowPnl && this.isShowPastEvents == chartViewOutSideConfig.isShowPastEvents && this.isShowUpcomingEvents == chartViewOutSideConfig.isShowUpcomingEvents && this.volTransparent == chartViewOutSideConfig.volTransparent && this.volTransparentSub == chartViewOutSideConfig.volTransparentSub && this.isHistoryCandlesLoading == chartViewOutSideConfig.isHistoryCandlesLoading && this.isRightHistoryCandlesLoading == chartViewOutSideConfig.isRightHistoryCandlesLoading && this.mChartOffsetInit == chartViewOutSideConfig.mChartOffsetInit && Float.compare(this.mKlineInitOffset, chartViewOutSideConfig.mKlineInitOffset) == 0 && Float.compare(this.klineDefaultOffset, chartViewOutSideConfig.klineDefaultOffset) == 0 && Float.compare(this.mKlineCurrentOffset, chartViewOutSideConfig.mKlineCurrentOffset) == 0 && Float.compare(this.mKlineLastOffset, chartViewOutSideConfig.mKlineLastOffset) == 0 && this.topPanelHeight == chartViewOutSideConfig.topPanelHeight && this.screenType == chartViewOutSideConfig.screenType && Intrinsics.EZpvd(this.bsRect, chartViewOutSideConfig.bsRect) && this.isAutoYScaleClick == chartViewOutSideConfig.isAutoYScaleClick && Intrinsics.EZpvd(this.fullScreenRect, chartViewOutSideConfig.fullScreenRect) && this.isShowPanel == chartViewOutSideConfig.isShowPanel && Intrinsics.EZpvd(this.priceWarningDataList, chartViewOutSideConfig.priceWarningDataList) && Intrinsics.EZpvd(this.tradePositionDataList, chartViewOutSideConfig.tradePositionDataList) && Intrinsics.EZpvd(this.openOrderDataList, chartViewOutSideConfig.openOrderDataList) && Intrinsics.EZpvd(this.compareBitmapList, chartViewOutSideConfig.compareBitmapList) && Intrinsics.EZpvd(this.quickOrderPriceBean, chartViewOutSideConfig.quickOrderPriceBean) && this.isShowEmptyUi == chartViewOutSideConfig.isShowEmptyUi && Intrinsics.EZpvd((Object) this.startTime, (Object) chartViewOutSideConfig.startTime) && Intrinsics.EZpvd((Object) this.endTime, (Object) chartViewOutSideConfig.endTime) && Intrinsics.EZpvd((Object) this.klinePriceType, (Object) chartViewOutSideConfig.klinePriceType) && this.isScreen == chartViewOutSideConfig.isScreen && this.isSimulateLine == chartViewOutSideConfig.isSimulateLine && Intrinsics.EZpvd((Object) this.chartTag, (Object) chartViewOutSideConfig.chartTag) && this.defaultTime == chartViewOutSideConfig.defaultTime && this.landscapeKLineScrollY == chartViewOutSideConfig.landscapeKLineScrollY && Intrinsics.EZpvd(this.botOrdersBean, chartViewOutSideConfig.botOrdersBean) && Intrinsics.EZpvd(this.gridPriceData, chartViewOutSideConfig.gridPriceData) && Intrinsics.EZpvd(this.gridPendingData, chartViewOutSideConfig.gridPendingData) && Intrinsics.EZpvd(this.supportResistance, chartViewOutSideConfig.supportResistance) && Intrinsics.EZpvd((Object) this.mode, (Object) chartViewOutSideConfig.mode) && Intrinsics.EZpvd((Object) this.preMode, (Object) chartViewOutSideConfig.preMode) && Intrinsics.EZpvd((Object) this.chartFromType, (Object) chartViewOutSideConfig.chartFromType) && Intrinsics.EZpvd((Object) this.dexChartSource, (Object) chartViewOutSideConfig.dexChartSource) && this.chartYAxisNum == chartViewOutSideConfig.chartYAxisNum && this.needUpdateInYScale == chartViewOutSideConfig.needUpdateInYScale && this.chartMode == chartViewOutSideConfig.chartMode && Intrinsics.EZpvd((Object) this.amountDisplaySymbol, (Object) chartViewOutSideConfig.amountDisplaySymbol) && Intrinsics.EZpvd((Object) this.turnoverDisplaySymbol, (Object) chartViewOutSideConfig.turnoverDisplaySymbol) && this.mPositiveColor == chartViewOutSideConfig.mPositiveColor && this.mNegativeColor == chartViewOutSideConfig.mNegativeColor && this.mAvgCustomColor == chartViewOutSideConfig.mAvgCustomColor && Intrinsics.EZpvd((Object) this.mCandleRiseColor, (Object) chartViewOutSideConfig.mCandleRiseColor) && Intrinsics.EZpvd((Object) this.mCandleDownColor, (Object) chartViewOutSideConfig.mCandleDownColor) && Intrinsics.EZpvd((Object) this.mMoneySymbol, (Object) chartViewOutSideConfig.mMoneySymbol) && this.mOrdinateType == chartViewOutSideConfig.mOrdinateType && this.mKlineAbstractType == chartViewOutSideConfig.mKlineAbstractType && this.isBotKLine == chartViewOutSideConfig.isBotKLine && this.isCompareKLine == chartViewOutSideConfig.isCompareKLine && this.isKLineInfiniteScale == chartViewOutSideConfig.isKLineInfiniteScale && this.isFastKLineMode == chartViewOutSideConfig.isFastKLineMode && this.isScreenChange == chartViewOutSideConfig.isScreenChange && Intrinsics.EZpvd(this.lastCandleItem, chartViewOutSideConfig.lastCandleItem) && Intrinsics.EZpvd(this.fastKLineBean, chartViewOutSideConfig.fastKLineBean) && this.isFastKLineMoveEnd == chartViewOutSideConfig.isFastKLineMoveEnd && this.mKlineYScaleAutoType == chartViewOutSideConfig.mKlineYScaleAutoType && this.isShowPriceType == chartViewOutSideConfig.isShowPriceType && this.isHideTradeDrawingLine == chartViewOutSideConfig.isHideTradeDrawingLine && this.isDrawing == chartViewOutSideConfig.isDrawing && this.mConvertCNY == chartViewOutSideConfig.mConvertCNY && Double.compare(this.mUsdCnyRate, chartViewOutSideConfig.mUsdCnyRate) == 0 && this.mPriceFractionDigits == chartViewOutSideConfig.mPriceFractionDigits && this.mMaxEfficientDigits == chartViewOutSideConfig.mMaxEfficientDigits && this.mCoinVol == chartViewOutSideConfig.mCoinVol && this.mCandlestickType == chartViewOutSideConfig.mCandlestickType && Intrinsics.EZpvd((Object) this.mTitle, (Object) chartViewOutSideConfig.mTitle) && this.mChartPosition == chartViewOutSideConfig.mChartPosition && this.mDrawLineEnable == chartViewOutSideConfig.mDrawLineEnable && Intrinsics.EZpvd((Object) this.currentMode, (Object) chartViewOutSideConfig.currentMode) && Intrinsics.EZpvd((Object) this.moveInterceptMode, (Object) chartViewOutSideConfig.moveInterceptMode) && this.isFullScreenMode == chartViewOutSideConfig.isFullScreenMode && Intrinsics.EZpvd(this.dataSources, chartViewOutSideConfig.dataSources) && Intrinsics.EZpvd(this.themes, chartViewOutSideConfig.themes) && Intrinsics.EZpvd(this.templateSettings, chartViewOutSideConfig.templateSettings) && Intrinsics.EZpvd(this.areas, chartViewOutSideConfig.areas) && Intrinsics.EZpvd(this.timelines, chartViewOutSideConfig.timelines) && Intrinsics.EZpvd(this.chartStyles, chartViewOutSideConfig.chartStyles) && this.isDragSubIndicatorOrNot == chartViewOutSideConfig.isDragSubIndicatorOrNot && this.isMarketCap == chartViewOutSideConfig.isMarketCap && Intrinsics.EZpvd((Object) this.tradeSymbol, (Object) chartViewOutSideConfig.tradeSymbol) && this.mOrderCancelConfirm == chartViewOutSideConfig.mOrderCancelConfirm && this.isShowSpotAveragePrice == chartViewOutSideConfig.isShowSpotAveragePrice && this.isShowBe == chartViewOutSideConfig.isShowBe && this.isShowLiq == chartViewOutSideConfig.isShowLiq && Intrinsics.EZpvd(this.klineSpotAverageBean, chartViewOutSideConfig.klineSpotAverageBean) && this.isOpenCoolTime == chartViewOutSideConfig.isOpenCoolTime && this.canShowQuickOrder == chartViewOutSideConfig.canShowQuickOrder && Intrinsics.EZpvd(this.controlBeanAfterInit, chartViewOutSideConfig.controlBeanAfterInit) && this.isCeFiMCapMode == chartViewOutSideConfig.isCeFiMCapMode && this.isFromFormula == chartViewOutSideConfig.isFromFormula && this.isFromCompare == chartViewOutSideConfig.isFromCompare && this.isSupportDragOrder == chartViewOutSideConfig.isSupportDragOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmountDisplaySymbol() {
        return this.amountDisplaySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkedHashMap<String, ChartArea> getAreas() {
        return this.areas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotPendingLineVo getBotOrdersBean() {
        return this.botOrdersBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF getBsRect() {
        return this.bsRect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanShowQuickOrder() {
        return this.canShowQuickOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChartFromType() {
        return this.chartFromType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChartMode() {
        return this.chartMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, Integer> getChartStyles() {
        return this.chartStyles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChartTag() {
        return this.chartTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChartYAxisNum() {
        return this.chartYAxisNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Bitmap> getCompareBitmapList() {
        return this.compareBitmapList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oUL getControlBeanAfterInit() {
        return this.controlBeanAfterInit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentMode() {
        return this.currentMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, DataSource> getDataSources() {
        return this.dataSources;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDefaultTime() {
        return this.defaultTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexChartSource() {
        return this.dexChartSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEconomicDefaultStatus() {
        return this.economicDefaultStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oUI getFastKLineBean() {
        return this.fastKLineBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF getFullScreenRect() {
        return this.fullScreenRect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotPendingLineVo getGridPendingData() {
        return this.gridPendingData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC39506ptd getGridPriceData() {
        return this.gridPriceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getKlineDefaultOffset() {
        return this.klineDefaultOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<KLineEventBean> getKlineEventList() {
        return this.klineEventList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<oLS> getKlineEventMergeList() {
        return this.klineEventMergeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKlinePriceType() {
        return this.klinePriceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineSpotAverageBean getKlineSpotAverageBean() {
        return this.klineSpotAverageBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLandscapeKLineScrollY() {
        return this.landscapeKLineScrollY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oUO getLastCandleItem() {
        return this.lastCandleItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DrawLineData.DrawLineItem> getLinesList() {
        return this.linesList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMAvgCustomColor() {
        return this.mAvgCustomColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMCandleDownColor() {
        return this.mCandleDownColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMCandleRiseColor() {
        return this.mCandleRiseColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMCandlestickType() {
        return this.mCandlestickType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMChartHistoryOrder() {
        return this.mChartHistoryOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMChartOffsetInit() {
        return this.mChartOffsetInit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMChartPosition() {
        return this.mChartPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMCoinVol() {
        return this.mCoinVol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMConvertCNY() {
        return this.mConvertCNY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMDexAvgExtend() {
        return this.mDexAvgExtend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMDexAvgShowPnlAmt() {
        return this.mDexAvgShowPnlAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMDexAvgShowRight() {
        return this.mDexAvgShowRight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMDrawLineEnable() {
        return this.mDrawLineEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMHideKlineDrawingData() {
        return this.mHideKlineDrawingData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMKlineAbstractType() {
        return this.mKlineAbstractType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getMKlineCurrentOffset() {
        return this.mKlineCurrentOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getMKlineInitOffset() {
        return this.mKlineInitOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getMKlineLastOffset() {
        return this.mKlineLastOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMKlineYScaleAutoType() {
        return this.mKlineYScaleAutoType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMMaxEfficientDigits() {
        return this.mMaxEfficientDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMMoneySymbol() {
        return this.mMoneySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMNegativeColor() {
        return this.mNegativeColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMOpenOrderShowRight() {
        return this.mOpenOrderShowRight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMOrderCancelConfirm() {
        return this.mOrderCancelConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMOrdinateType() {
        return this.mOrdinateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMPositiveColor() {
        return this.mPositiveColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMPriceFractionDigits() {
        return this.mPriceFractionDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMShowAxis() {
        return this.mShowAxis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMShowCostLine() {
        return this.mShowCostLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMShowCountdown() {
        return this.mShowCountdown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMShowCurrentOrder() {
        return this.mShowCurrentOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMShowHistoryOrder() {
        return this.mShowHistoryOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMShowOpenOrderExtendedLine() {
        return this.mShowOpenOrderExtendedLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMShowPriceLine() {
        return this.mShowPriceLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMShowPriceWarning() {
        return this.mShowPriceWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMShowTradePosExtendedLine() {
        return this.mShowTradePosExtendedLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMShowVolume() {
        return this.mShowVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMTitle() {
        return this.mTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMTradePosShowPnl() {
        return this.mTradePosShowPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMTradePosShowRight() {
        return this.mTradePosShowRight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getMUsdCnyRate() {
        return this.mUsdCnyRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMoveInterceptMode() {
        return this.moveInterceptMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedUpdateInYScale() {
        return this.needUpdateInYScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<KlineOpenOrderBean> getOpenOrderDataList() {
        return this.openOrderDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreMode() {
        return this.preMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PriceWarningItemBean> getPriceWarningDataList() {
        return this.priceWarningDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineQuickOrderPriceBean getQuickOrderPriceBean() {
        return this.quickOrderPriceBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getScreenType() {
        return this.screenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowCurPotionTabMSA() {
        return this.showCurPotionTabMSA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowHistoryOrderTabMSA() {
        return this.showHistoryOrderTabMSA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oLZ getSupportResistance() {
        return this.supportResistance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, TemplateSetting> getTemplateSettings() {
        return this.templateSettings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, oWK> getThemes() {
        return this.themes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<String, oWN> getTimelines() {
        return this.timelines;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTopPanelHeight() {
        return this.topPanelHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InterfaceC39510pth> getTradePositionDataList() {
        return this.tradePositionDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeSymbol() {
        return this.tradeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTurnoverDisplaySymbol() {
        return this.turnoverDisplaySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVolTransparent() {
        return this.volTransparent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVolTransparentSub() {
        return this.volTransparentSub;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.mShowAxis);
        int iHashCode2 = Boolean.hashCode(this.mShowVolume);
        int iHashCode3 = Boolean.hashCode(this.isUtc8);
        int iHashCode4 = Boolean.hashCode(this.isHideMainIndex);
        int iHashCode5 = Boolean.hashCode(this.isPortraitChart);
        int iHashCode6 = Boolean.hashCode(this.isOrderSupportClick);
        int iHashCode7 = Boolean.hashCode(this.isSpotCostSupportClick);
        int iHashCode8 = this.linesList.hashCode();
        int iHashCode9 = this.klineEventList.hashCode();
        int iHashCode10 = this.klineEventMergeList.hashCode();
        int iHashCode11 = Boolean.hashCode(this.showHistoryOrderTabMSA);
        int iHashCode12 = Boolean.hashCode(this.showCurPotionTabMSA);
        int iHashCode13 = Boolean.hashCode(this.isColumnChart);
        int iHashCode14 = Boolean.hashCode(this.mShowPriceLine);
        int iHashCode15 = Boolean.hashCode(this.economicDefaultStatus);
        int iHashCode16 = Boolean.hashCode(this.mShowHistoryOrder);
        int iHashCode17 = Boolean.hashCode(this.mChartHistoryOrder);
        int iHashCode18 = Boolean.hashCode(this.mShowCurrentOrder);
        int iHashCode19 = Boolean.hashCode(this.mShowCostLine);
        int iHashCode20 = Boolean.hashCode(this.mShowCountdown);
        int iHashCode21 = Boolean.hashCode(this.mHideKlineDrawingData);
        int iHashCode22 = Boolean.hashCode(this.mShowPriceWarning);
        int iHashCode23 = Boolean.hashCode(this.mShowOpenOrderExtendedLine);
        int iHashCode24 = Boolean.hashCode(this.mShowTradePosExtendedLine);
        int iHashCode25 = Boolean.hashCode(this.mOpenOrderShowRight);
        int iHashCode26 = Boolean.hashCode(this.mDexAvgShowRight);
        int iHashCode27 = Boolean.hashCode(this.mDexAvgShowPnlAmt);
        int iHashCode28 = Boolean.hashCode(this.mDexAvgExtend);
        int iHashCode29 = Boolean.hashCode(this.mTradePosShowRight);
        int iHashCode30 = Boolean.hashCode(this.mTradePosShowPnl);
        int iHashCode31 = Boolean.hashCode(this.isShowPastEvents);
        int iHashCode32 = Boolean.hashCode(this.isShowUpcomingEvents);
        int iHashCode33 = Integer.hashCode(this.volTransparent);
        int iHashCode34 = Integer.hashCode(this.volTransparentSub);
        int iHashCode35 = Boolean.hashCode(this.isHistoryCandlesLoading);
        int iHashCode36 = Boolean.hashCode(this.isRightHistoryCandlesLoading);
        int iHashCode37 = Boolean.hashCode(this.mChartOffsetInit);
        int iHashCode38 = Float.hashCode(this.mKlineInitOffset);
        int iHashCode39 = Float.hashCode(this.klineDefaultOffset);
        int iHashCode40 = Float.hashCode(this.mKlineCurrentOffset);
        int iHashCode41 = Float.hashCode(this.mKlineLastOffset);
        int iHashCode42 = Integer.hashCode(this.topPanelHeight);
        int iHashCode43 = Integer.hashCode(this.screenType);
        RectF rectF = this.bsRect;
        int iHashCode44 = rectF == null ? 0 : rectF.hashCode();
        int iHashCode45 = Boolean.hashCode(this.isAutoYScaleClick);
        RectF rectF2 = this.fullScreenRect;
        int iHashCode46 = rectF2 == null ? 0 : rectF2.hashCode();
        int iHashCode47 = Boolean.hashCode(this.isShowPanel);
        int iHashCode48 = this.priceWarningDataList.hashCode();
        int iHashCode49 = this.tradePositionDataList.hashCode();
        int iHashCode50 = this.openOrderDataList.hashCode();
        int iHashCode51 = this.compareBitmapList.hashCode();
        KlineQuickOrderPriceBean klineQuickOrderPriceBean = this.quickOrderPriceBean;
        int iHashCode52 = klineQuickOrderPriceBean == null ? 0 : klineQuickOrderPriceBean.hashCode();
        int iHashCode53 = Boolean.hashCode(this.isShowEmptyUi);
        String str = this.startTime;
        int iHashCode54 = str == null ? 0 : str.hashCode();
        String str2 = this.endTime;
        int iHashCode55 = str2 == null ? 0 : str2.hashCode();
        int iHashCode56 = this.klinePriceType.hashCode();
        int iHashCode57 = Boolean.hashCode(this.isScreen);
        int iHashCode58 = Boolean.hashCode(this.isSimulateLine);
        int iHashCode59 = this.chartTag.hashCode();
        int iHashCode60 = Integer.hashCode(this.defaultTime);
        int iHashCode61 = Integer.hashCode(this.landscapeKLineScrollY);
        BotPendingLineVo botPendingLineVo = this.botOrdersBean;
        int iHashCode62 = botPendingLineVo == null ? 0 : botPendingLineVo.hashCode();
        InterfaceC39506ptd interfaceC39506ptd = this.gridPriceData;
        int iHashCode63 = interfaceC39506ptd == null ? 0 : interfaceC39506ptd.hashCode();
        BotPendingLineVo botPendingLineVo2 = this.gridPendingData;
        int iHashCode64 = botPendingLineVo2 == null ? 0 : botPendingLineVo2.hashCode();
        oLZ olz = this.supportResistance;
        int iHashCode65 = olz == null ? 0 : olz.hashCode();
        int iHashCode66 = this.mode.hashCode();
        int iHashCode67 = this.preMode.hashCode();
        String str3 = this.chartFromType;
        int iHashCode68 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.dexChartSource;
        int iHashCode69 = str4 == null ? 0 : str4.hashCode();
        int iHashCode70 = Integer.hashCode(this.chartYAxisNum);
        int iHashCode71 = Boolean.hashCode(this.needUpdateInYScale);
        int iHashCode72 = Integer.hashCode(this.chartMode);
        String str5 = this.amountDisplaySymbol;
        int iHashCode73 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.turnoverDisplaySymbol;
        int iHashCode74 = str6 == null ? 0 : str6.hashCode();
        int iHashCode75 = Integer.hashCode(this.mPositiveColor);
        int iHashCode76 = Integer.hashCode(this.mNegativeColor);
        int iHashCode77 = Integer.hashCode(this.mAvgCustomColor);
        String str7 = this.mCandleRiseColor;
        int iHashCode78 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.mCandleDownColor;
        int iHashCode79 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.mMoneySymbol;
        int iHashCode80 = str9 == null ? 0 : str9.hashCode();
        int iHashCode81 = Integer.hashCode(this.mOrdinateType);
        int iHashCode82 = Integer.hashCode(this.mKlineAbstractType);
        int iHashCode83 = Boolean.hashCode(this.isBotKLine);
        int iHashCode84 = Boolean.hashCode(this.isCompareKLine);
        int iHashCode85 = Boolean.hashCode(this.isKLineInfiniteScale);
        int iHashCode86 = Boolean.hashCode(this.isFastKLineMode);
        int iHashCode87 = Boolean.hashCode(this.isScreenChange);
        oUO ouo = this.lastCandleItem;
        int iHashCode88 = ouo == null ? 0 : ouo.hashCode();
        int iHashCode89 = this.fastKLineBean.hashCode();
        int iHashCode90 = Boolean.hashCode(this.isFastKLineMoveEnd);
        int iHashCode91 = Integer.hashCode(this.mKlineYScaleAutoType);
        int iHashCode92 = Boolean.hashCode(this.isShowPriceType);
        int iHashCode93 = Boolean.hashCode(this.isHideTradeDrawingLine);
        int iHashCode94 = Boolean.hashCode(this.isDrawing);
        int iHashCode95 = Boolean.hashCode(this.mConvertCNY);
        int iHashCode96 = Double.hashCode(this.mUsdCnyRate);
        int iHashCode97 = Integer.hashCode(this.mPriceFractionDigits);
        int iHashCode98 = Integer.hashCode(this.mMaxEfficientDigits);
        int iHashCode99 = Integer.hashCode(this.mCoinVol);
        int iHashCode100 = Integer.hashCode(this.mCandlestickType);
        String str10 = this.mTitle;
        int iHashCode101 = str10 == null ? 0 : str10.hashCode();
        int iHashCode102 = Integer.hashCode(this.mChartPosition);
        int iHashCode103 = Boolean.hashCode(this.mDrawLineEnable);
        String str11 = this.currentMode;
        int iHashCode104 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.moveInterceptMode;
        int iHashCode105 = str12 == null ? 0 : str12.hashCode();
        int iHashCode106 = Boolean.hashCode(this.isFullScreenMode);
        int iHashCode107 = this.dataSources.hashCode();
        int iHashCode108 = this.themes.hashCode();
        int iHashCode109 = this.templateSettings.hashCode();
        int iHashCode110 = this.areas.hashCode();
        int iHashCode111 = this.timelines.hashCode();
        int iHashCode112 = this.chartStyles.hashCode();
        int iHashCode113 = Boolean.hashCode(this.isDragSubIndicatorOrNot);
        int iHashCode114 = Boolean.hashCode(this.isMarketCap);
        int iHashCode115 = this.tradeSymbol.hashCode();
        int iHashCode116 = Boolean.hashCode(this.mOrderCancelConfirm);
        int iHashCode117 = Boolean.hashCode(this.isShowSpotAveragePrice);
        int iHashCode118 = Boolean.hashCode(this.isShowBe);
        int iHashCode119 = Boolean.hashCode(this.isShowLiq);
        KlineSpotAverageBean klineSpotAverageBean = this.klineSpotAverageBean;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + iHashCode72) * 31) + iHashCode73) * 31) + iHashCode74) * 31) + iHashCode75) * 31) + iHashCode76) * 31) + iHashCode77) * 31) + iHashCode78) * 31) + iHashCode79) * 31) + iHashCode80) * 31) + iHashCode81) * 31) + iHashCode82) * 31) + iHashCode83) * 31) + iHashCode84) * 31) + iHashCode85) * 31) + iHashCode86) * 31) + iHashCode87) * 31) + iHashCode88) * 31) + iHashCode89) * 31) + iHashCode90) * 31) + iHashCode91) * 31) + iHashCode92) * 31) + iHashCode93) * 31) + iHashCode94) * 31) + iHashCode95) * 31) + iHashCode96) * 31) + iHashCode97) * 31) + iHashCode98) * 31) + iHashCode99) * 31) + iHashCode100) * 31) + iHashCode101) * 31) + iHashCode102) * 31) + iHashCode103) * 31) + iHashCode104) * 31) + iHashCode105) * 31) + iHashCode106) * 31) + iHashCode107) * 31) + iHashCode108) * 31) + iHashCode109) * 31) + iHashCode110) * 31) + iHashCode111) * 31) + iHashCode112) * 31) + iHashCode113) * 31) + iHashCode114) * 31) + iHashCode115) * 31) + iHashCode116) * 31) + iHashCode117) * 31) + iHashCode118) * 31) + iHashCode119) * 31) + (klineSpotAverageBean != null ? klineSpotAverageBean.hashCode() : 0)) * 31) + Boolean.hashCode(this.isOpenCoolTime)) * 31) + Boolean.hashCode(this.canShowQuickOrder)) * 31) + this.controlBeanAfterInit.hashCode()) * 31) + Boolean.hashCode(this.isCeFiMCapMode)) * 31) + Boolean.hashCode(this.isFromFormula)) * 31) + Boolean.hashCode(this.isFromCompare)) * 31) + Boolean.hashCode(this.isSupportDragOrder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void initKlineOffset(float f) {
        this.klineDefaultOffset = f;
        this.mKlineCurrentOffset = f;
        this.mKlineLastOffset = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAutoYScaleClick() {
        return this.isAutoYScaleClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBotKLine() {
        return this.isBotKLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCeFiMCapMode() {
        return this.isCeFiMCapMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isColumnChart() {
        return this.isColumnChart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCompareKLine() {
        return this.isCompareKLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDragSubIndicatorOrNot() {
        return this.isDragSubIndicatorOrNot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDrawing() {
        return this.isDrawing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFastKLineMode() {
        return this.isFastKLineMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFastKLineMoveEnd() {
        return this.isFastKLineMoveEnd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFromCompare() {
        return this.isFromCompare;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFromFormula() {
        return this.isFromFormula;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFullScreenMode() {
        return this.isFullScreenMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHideMainIndex() {
        return this.isHideMainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHideTradeDrawingLine() {
        return this.isHideTradeDrawingLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHistoryCandlesLoading() {
        return this.isHistoryCandlesLoading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isKLineInfiniteScale() {
        return this.isKLineInfiniteScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMarketCap() {
        return this.isMarketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOpenCoolTime() {
        return this.isOpenCoolTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOrderCancelConfirm() {
        return this.mOrderCancelConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOrderSupportClick() {
        return this.isOrderSupportClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPortraitChart() {
        return this.isPortraitChart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isRightHistoryCandlesLoading() {
        return this.isRightHistoryCandlesLoading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isScreen() {
        return this.isScreen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isScreenChange() {
        return this.isScreenChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowBe() {
        return this.isShowBe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowEmptyUi() {
        return this.isShowEmptyUi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowLiq() {
        return this.isShowLiq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowPanel() {
        return this.isShowPanel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowPastEvents() {
        return this.isShowPastEvents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowPriceType() {
        return this.isShowPriceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSpotAveragePrice() {
        return this.isShowSpotAveragePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowUpcomingEvents() {
        return this.isShowUpcomingEvents;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSimulateLine() {
        return this.isSimulateLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSpotCostSupportClick() {
        return this.isSpotCostSupportClick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupportDragOrder() {
        return this.isSupportDragOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUtc8() {
        return this.isUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountDisplaySymbol(String str) {
        this.amountDisplaySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoYScaleClick(boolean z) {
        this.isAutoYScaleClick = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBotKLine(boolean z) {
        this.isBotKLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBotOrdersBean(BotPendingLineVo botPendingLineVo) {
        this.botOrdersBean = botPendingLineVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBsRect(RectF rectF) {
        this.bsRect = rectF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanShowQuickOrder(boolean z) {
        this.canShowQuickOrder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCeFiMCapMode(boolean z) {
        this.isCeFiMCapMode = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChartFromType(String str) {
        this.chartFromType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChartMode(int i) {
        this.chartMode = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChartTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chartTag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChartYAxisNum(int i) {
        this.chartYAxisNum = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColumnChart(boolean z) {
        this.isColumnChart = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCompareBitmapList(@NotNull List<Bitmap> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.compareBitmapList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCompareKLine(boolean z) {
        this.isCompareKLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setControlBeanAfterInit(@NotNull oUL oul) {
        Intrinsics.checkNotNullParameter(oul, "");
        this.controlBeanAfterInit = oul;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentMode(String str) {
        this.currentMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDataSources(@NotNull HashMap<String, DataSource> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.dataSources = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultTime(int i) {
        this.defaultTime = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexChartSource(String str) {
        this.dexChartSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDragSubIndicatorOrNot(boolean z) {
        this.isDragSubIndicatorOrNot = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDrawing(boolean z) {
        this.isDrawing = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEconomicDefaultStatus(boolean z) {
        this.economicDefaultStatus = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndTime(String str) {
        this.endTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFastKLineBean(@NotNull oUI oui) {
        Intrinsics.checkNotNullParameter(oui, "");
        this.fastKLineBean = oui;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFastKLineMode(boolean z) {
        this.isFastKLineMode = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFastKLineMoveEnd(boolean z) {
        this.isFastKLineMoveEnd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromCompare(boolean z) {
        this.isFromCompare = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromFormula(boolean z) {
        this.isFromFormula = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullScreenMode(boolean z) {
        this.isFullScreenMode = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullScreenRect(RectF rectF) {
        this.fullScreenRect = rectF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridPendingData(BotPendingLineVo botPendingLineVo) {
        this.gridPendingData = botPendingLineVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridPriceData(InterfaceC39506ptd interfaceC39506ptd) {
        this.gridPriceData = interfaceC39506ptd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHideMainIndex(boolean z) {
        this.isHideMainIndex = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHideTradeDrawingLine(boolean z) {
        this.isHideTradeDrawingLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHistoryCandlesLoading(boolean z) {
        this.isHistoryCandlesLoading = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKLineInfiniteScale(boolean z) {
        this.isKLineInfiniteScale = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKlineDefaultOffset(float f) {
        this.klineDefaultOffset = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKlineEventList(@NotNull ArrayList<KLineEventBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.klineEventList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKlineEventMergeList(@NotNull List<oLS> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.klineEventMergeList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKlinePriceType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.klinePriceType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKlineSpotAverageBean(KlineSpotAverageBean klineSpotAverageBean) {
        this.klineSpotAverageBean = klineSpotAverageBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLandscapeKLineScrollY(int i) {
        this.landscapeKLineScrollY = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastCandleItem(oUO ouo) {
        this.lastCandleItem = ouo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinesList(@NotNull ArrayList<DrawLineData.DrawLineItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.linesList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMAvgCustomColor(int i) {
        this.mAvgCustomColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMCandleDownColor(String str) {
        this.mCandleDownColor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMCandleRiseColor(String str) {
        this.mCandleRiseColor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMCandlestickType(int i) {
        this.mCandlestickType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMChartHistoryOrder(boolean z) {
        this.mChartHistoryOrder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMChartOffsetInit(boolean z) {
        this.mChartOffsetInit = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMChartPosition(int i) {
        this.mChartPosition = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMCoinVol(int i) {
        this.mCoinVol = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMConvertCNY(boolean z) {
        this.mConvertCNY = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMDexAvgExtend(boolean z) {
        this.mDexAvgExtend = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMDexAvgShowPnlAmt(boolean z) {
        this.mDexAvgShowPnlAmt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMDexAvgShowRight(boolean z) {
        this.mDexAvgShowRight = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMDrawLineEnable(boolean z) {
        this.mDrawLineEnable = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMHideKlineDrawingData(boolean z) {
        this.mHideKlineDrawingData = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMKlineAbstractType(int i) {
        this.mKlineAbstractType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMKlineCurrentOffset(float f) {
        this.mKlineCurrentOffset = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMKlineInitOffset(float f) {
        this.mKlineInitOffset = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMKlineLastOffset(float f) {
        this.mKlineLastOffset = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMKlineYScaleAutoType(int i) {
        this.mKlineYScaleAutoType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMMaxEfficientDigits(int i) {
        this.mMaxEfficientDigits = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMMoneySymbol(String str) {
        this.mMoneySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMNegativeColor(int i) {
        this.mNegativeColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMOpenOrderShowRight(boolean z) {
        this.mOpenOrderShowRight = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMOrderCancelConfirm(boolean z) {
        this.mOrderCancelConfirm = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMOrdinateType(int i) {
        this.mOrdinateType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMPositiveColor(int i) {
        this.mPositiveColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMPriceFractionDigits(int i) {
        this.mPriceFractionDigits = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMShowAxis(boolean z) {
        this.mShowAxis = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMShowCostLine(boolean z) {
        this.mShowCostLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMShowCountdown(boolean z) {
        this.mShowCountdown = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMShowCurrentOrder(boolean z) {
        this.mShowCurrentOrder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMShowHistoryOrder(boolean z) {
        this.mShowHistoryOrder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMShowOpenOrderExtendedLine(boolean z) {
        this.mShowOpenOrderExtendedLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMShowPriceLine(boolean z) {
        this.mShowPriceLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMShowPriceWarning(boolean z) {
        this.mShowPriceWarning = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMShowTradePosExtendedLine(boolean z) {
        this.mShowTradePosExtendedLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMShowVolume(boolean z) {
        this.mShowVolume = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMTitle(String str) {
        this.mTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMTradePosShowPnl(boolean z) {
        this.mTradePosShowPnl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMTradePosShowRight(boolean z) {
        this.mTradePosShowRight = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMUsdCnyRate(double d) {
        this.mUsdCnyRate = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarketCap(boolean z) {
        this.isMarketCap = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMoveInterceptMode(String str) {
        this.moveInterceptMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedUpdateInYScale(boolean z) {
        this.needUpdateInYScale = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenCoolTime(boolean z) {
        this.isOpenCoolTime = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderSupportClick(boolean z) {
        this.isOrderSupportClick = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPortraitChart(boolean z) {
        this.isPortraitChart = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.preMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceWarningDataList(@NotNull List<PriceWarningItemBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.priceWarningDataList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuickOrderPriceBean(KlineQuickOrderPriceBean klineQuickOrderPriceBean) {
        this.quickOrderPriceBean = klineQuickOrderPriceBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightHistoryCandlesLoading(boolean z) {
        this.isRightHistoryCandlesLoading = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScreen(boolean z) {
        this.isScreen = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScreenChange(boolean z) {
        this.isScreenChange = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScreenType(int i) {
        this.screenType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowBe(boolean z) {
        this.isShowBe = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCurPotionTabMSA(boolean z) {
        this.showCurPotionTabMSA = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowEmptyUi(boolean z) {
        this.isShowEmptyUi = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowHistoryOrderTabMSA(boolean z) {
        this.showHistoryOrderTabMSA = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowLiq(boolean z) {
        this.isShowLiq = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowPanel(boolean z) {
        this.isShowPanel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowPastEvents(boolean z) {
        this.isShowPastEvents = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowPriceType(boolean z) {
        this.isShowPriceType = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSpotAveragePrice(boolean z) {
        this.isShowSpotAveragePrice = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowUpcomingEvents(boolean z) {
        this.isShowUpcomingEvents = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimulateLine(boolean z) {
        this.isSimulateLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotCostSupportClick(boolean z) {
        this.isSpotCostSupportClick = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStartTime(String str) {
        this.startTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportDragOrder(boolean z) {
        this.isSupportDragOrder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportResistance(oLZ olz) {
        this.supportResistance = olz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopPanelHeight(int i) {
        this.topPanelHeight = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTurnoverDisplaySymbol(String str) {
        this.turnoverDisplaySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUtc8(boolean z) {
        this.isUtc8 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolTransparent(int i) {
        this.volTransparent = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolTransparentSub(int i) {
        this.volTransparentSub = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChartViewOutSideConfig(mShowAxis=" + this.mShowAxis + ", mShowVolume=" + this.mShowVolume + ", isUtc8=" + this.isUtc8 + ", isHideMainIndex=" + this.isHideMainIndex + ", isPortraitChart=" + this.isPortraitChart + ", isOrderSupportClick=" + this.isOrderSupportClick + ", isSpotCostSupportClick=" + this.isSpotCostSupportClick + ", linesList=" + this.linesList + ", klineEventList=" + this.klineEventList + ", klineEventMergeList=" + this.klineEventMergeList + ", showHistoryOrderTabMSA=" + this.showHistoryOrderTabMSA + ", showCurPotionTabMSA=" + this.showCurPotionTabMSA + ", isColumnChart=" + this.isColumnChart + ", mShowPriceLine=" + this.mShowPriceLine + ", economicDefaultStatus=" + this.economicDefaultStatus + ", mShowHistoryOrder=" + this.mShowHistoryOrder + ", mChartHistoryOrder=" + this.mChartHistoryOrder + ", mShowCurrentOrder=" + this.mShowCurrentOrder + ", mShowCostLine=" + this.mShowCostLine + ", mShowCountdown=" + this.mShowCountdown + ", mHideKlineDrawingData=" + this.mHideKlineDrawingData + ", mShowPriceWarning=" + this.mShowPriceWarning + ", mShowOpenOrderExtendedLine=" + this.mShowOpenOrderExtendedLine + ", mShowTradePosExtendedLine=" + this.mShowTradePosExtendedLine + ", mOpenOrderShowRight=" + this.mOpenOrderShowRight + ", mDexAvgShowRight=" + this.mDexAvgShowRight + ", mDexAvgShowPnlAmt=" + this.mDexAvgShowPnlAmt + ", mDexAvgExtend=" + this.mDexAvgExtend + ", mTradePosShowRight=" + this.mTradePosShowRight + ", mTradePosShowPnl=" + this.mTradePosShowPnl + ", isShowPastEvents=" + this.isShowPastEvents + ", isShowUpcomingEvents=" + this.isShowUpcomingEvents + ", volTransparent=" + this.volTransparent + ", volTransparentSub=" + this.volTransparentSub + ", isHistoryCandlesLoading=" + this.isHistoryCandlesLoading + ", isRightHistoryCandlesLoading=" + this.isRightHistoryCandlesLoading + ", mChartOffsetInit=" + this.mChartOffsetInit + ", mKlineInitOffset=" + this.mKlineInitOffset + ", klineDefaultOffset=" + this.klineDefaultOffset + ", mKlineCurrentOffset=" + this.mKlineCurrentOffset + ", mKlineLastOffset=" + this.mKlineLastOffset + ", topPanelHeight=" + this.topPanelHeight + ", screenType=" + this.screenType + ", bsRect=" + this.bsRect + ", isAutoYScaleClick=" + this.isAutoYScaleClick + ", fullScreenRect=" + this.fullScreenRect + ", isShowPanel=" + this.isShowPanel + ", priceWarningDataList=" + this.priceWarningDataList + ", tradePositionDataList=" + this.tradePositionDataList + ", openOrderDataList=" + this.openOrderDataList + ", compareBitmapList=" + this.compareBitmapList + ", quickOrderPriceBean=" + this.quickOrderPriceBean + ", isShowEmptyUi=" + this.isShowEmptyUi + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", klinePriceType=" + this.klinePriceType + ", isScreen=" + this.isScreen + ", isSimulateLine=" + this.isSimulateLine + ", chartTag=" + this.chartTag + ", defaultTime=" + this.defaultTime + ", landscapeKLineScrollY=" + this.landscapeKLineScrollY + ", botOrdersBean=" + this.botOrdersBean + ", gridPriceData=" + this.gridPriceData + ", gridPendingData=" + this.gridPendingData + ", supportResistance=" + this.supportResistance + ", mode=" + this.mode + ", preMode=" + this.preMode + ", chartFromType=" + this.chartFromType + ", dexChartSource=" + this.dexChartSource + ", chartYAxisNum=" + this.chartYAxisNum + ", needUpdateInYScale=" + this.needUpdateInYScale + ", chartMode=" + this.chartMode + ", amountDisplaySymbol=" + this.amountDisplaySymbol + ", turnoverDisplaySymbol=" + this.turnoverDisplaySymbol + ", mPositiveColor=" + this.mPositiveColor + ", mNegativeColor=" + this.mNegativeColor + ", mAvgCustomColor=" + this.mAvgCustomColor + ", mCandleRiseColor=" + this.mCandleRiseColor + ", mCandleDownColor=" + this.mCandleDownColor + ", mMoneySymbol=" + this.mMoneySymbol + ", mOrdinateType=" + this.mOrdinateType + ", mKlineAbstractType=" + this.mKlineAbstractType + ", isBotKLine=" + this.isBotKLine + ", isCompareKLine=" + this.isCompareKLine + ", isKLineInfiniteScale=" + this.isKLineInfiniteScale + ", isFastKLineMode=" + this.isFastKLineMode + ", isScreenChange=" + this.isScreenChange + ", lastCandleItem=" + this.lastCandleItem + ", fastKLineBean=" + this.fastKLineBean + ", isFastKLineMoveEnd=" + this.isFastKLineMoveEnd + ", mKlineYScaleAutoType=" + this.mKlineYScaleAutoType + ", isShowPriceType=" + this.isShowPriceType + ", isHideTradeDrawingLine=" + this.isHideTradeDrawingLine + ", isDrawing=" + this.isDrawing + ", mConvertCNY=" + this.mConvertCNY + ", mUsdCnyRate=" + this.mUsdCnyRate + ", mPriceFractionDigits=" + this.mPriceFractionDigits + ", mMaxEfficientDigits=" + this.mMaxEfficientDigits + ", mCoinVol=" + this.mCoinVol + ", mCandlestickType=" + this.mCandlestickType + ", mTitle=" + this.mTitle + ", mChartPosition=" + this.mChartPosition + ", mDrawLineEnable=" + this.mDrawLineEnable + ", currentMode=" + this.currentMode + ", moveInterceptMode=" + this.moveInterceptMode + ", isFullScreenMode=" + this.isFullScreenMode + ", dataSources=" + this.dataSources + ", themes=" + this.themes + ", templateSettings=" + this.templateSettings + ", areas=" + this.areas + ", timelines=" + this.timelines + ", chartStyles=" + this.chartStyles + ", isDragSubIndicatorOrNot=" + this.isDragSubIndicatorOrNot + ", isMarketCap=" + this.isMarketCap + ", tradeSymbol=" + this.tradeSymbol + ", mOrderCancelConfirm=" + this.mOrderCancelConfirm + ", isShowSpotAveragePrice=" + this.isShowSpotAveragePrice + ", isShowBe=" + this.isShowBe + ", isShowLiq=" + this.isShowLiq + ", klineSpotAverageBean=" + this.klineSpotAverageBean + ", isOpenCoolTime=" + this.isOpenCoolTime + ", canShowQuickOrder=" + this.canShowQuickOrder + ", controlBeanAfterInit=" + this.controlBeanAfterInit + ", isCeFiMCapMode=" + this.isCeFiMCapMode + ", isFromFormula=" + this.isFromFormula + ", isFromCompare=" + this.isFromCompare + ", isSupportDragOrder=" + this.isSupportDragOrder + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChartViewOutSideConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ArrayList arrayList, ArrayList arrayList2, List list, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i, int i2, boolean z30, boolean z31, boolean z32, float f, float f2, float f3, float f4, int i3, int i4, RectF rectF, boolean z33, RectF rectF2, boolean z34, List list2, List list3, List list4, List list5, KlineQuickOrderPriceBean klineQuickOrderPriceBean, boolean z35, String str, String str2, String str3, boolean z36, boolean z37, String str4, int i5, int i6, BotPendingLineVo botPendingLineVo, InterfaceC39506ptd interfaceC39506ptd, BotPendingLineVo botPendingLineVo2, oLZ olz, String str5, String str6, String str7, String str8, int i7, boolean z38, int i8, String str9, String str10, int i9, int i10, int i11, String str11, String str12, String str13, int i12, int i13, boolean z39, boolean z40, boolean z41, boolean z42, boolean z43, oUO ouo, oUI oui, boolean z44, int i14, boolean z45, boolean z46, boolean z47, boolean z48, double d, int i15, int i16, int i17, int i18, String str14, int i19, boolean z49, String str15, String str16, boolean z50, HashMap map, HashMap map2, HashMap map3, LinkedHashMap linkedHashMap, HashMap map4, HashMap map5, boolean z51, boolean z52, String str17, boolean z53, boolean z54, boolean z55, boolean z56, KlineSpotAverageBean klineSpotAverageBean, boolean z57, boolean z58, oUL oul, boolean z59, boolean z60, boolean z61, boolean z62, int i20, int i21, int i22, int i23, DefaultConstructorMarker defaultConstructorMarker) {
        ArrayList arrayList3;
        boolean z63;
        boolean z64;
        boolean z65;
        boolean z66;
        boolean z67;
        boolean z68;
        boolean z69;
        boolean z70;
        boolean z71;
        boolean z72;
        boolean z73;
        boolean z74;
        boolean z75;
        boolean z76;
        boolean z77;
        boolean z78;
        boolean z79;
        boolean z80;
        boolean z81;
        boolean z82;
        boolean z83;
        boolean z84;
        boolean z85;
        boolean z86;
        boolean z87;
        boolean z88;
        boolean z89;
        boolean z90;
        boolean z91;
        boolean z92;
        boolean z93;
        boolean z94;
        boolean z95;
        boolean z96;
        boolean z97;
        int iIntValue;
        int i24;
        int iIntValue2;
        int i25;
        boolean z98;
        float fCopydefault;
        String str18;
        HashMap map6;
        boolean z99;
        boolean z100;
        boolean z101;
        boolean z102;
        boolean z103;
        boolean z104;
        boolean z105;
        boolean z106;
        boolean z107;
        boolean z108 = (i20 & 1) != 0 ? SPUtils.getBoolean("chart_axis", true) : z;
        boolean z109 = (i20 & 2) != 0 ? true : z2;
        boolean z110 = (i20 & 4) != 0 ? true : z3;
        boolean z111 = (i20 & 8) != 0 ? false : z4;
        boolean z112 = (i20 & 16) != 0 ? false : z5;
        boolean z113 = (i20 & 32) != 0 ? false : z6;
        boolean z114 = (i20 & 64) != 0 ? false : z7;
        ArrayList arrayList4 = (i20 & 128) != 0 ? new ArrayList() : arrayList;
        ArrayList arrayList5 = (i20 & 256) != 0 ? new ArrayList() : arrayList2;
        List listAhwBna = (i20 & 512) != 0 ? yDY.AhwBna() : list;
        boolean z115 = (i20 & 1024) != 0 ? true : z8;
        boolean z116 = (i20 & 2048) != 0 ? true : z9;
        List list6 = listAhwBna;
        if ((i20 & 4096) != 0) {
            arrayList3 = arrayList5;
            z63 = SPUtils.getBoolean("kline_zoom_type_column_chart", true);
        } else {
            arrayList3 = arrayList5;
            z63 = z10;
        }
        boolean z117 = (i20 & 8192) != 0 ? true : z11;
        boolean z118 = (i20 & 16384) != 0 ? false : z12;
        if ((i20 & 32768) != 0) {
            z64 = z118;
            z65 = z63;
            z66 = SPUtils.getBoolean("chart_history_order", true) && z115;
        } else {
            z64 = z118;
            z65 = z63;
            z66 = z13;
        }
        boolean z119 = (i20 & 65536) != 0 ? true : z14;
        if ((i20 & 131072) != 0) {
            z67 = z66;
            z68 = SPUtils.getBoolean("chart_current_order", true) && z116;
        } else {
            z67 = z66;
            z68 = z15;
        }
        if ((i20 & 262144) != 0) {
            z69 = z68;
            z70 = SPUtils.getBoolean("chart_cost_line", true) && z116;
        } else {
            z69 = z68;
            z70 = z16;
        }
        if ((524288 & i20) != 0) {
            z71 = z70;
            z72 = SPUtils.getBoolean("chart_countdown", true);
        } else {
            z71 = z70;
            z72 = z17;
        }
        if ((1048576 & i20) != 0) {
            z73 = z72;
            z74 = SPUtils.getBoolean("hide_kline_drawing_data", false);
        } else {
            z73 = z72;
            z74 = z18;
        }
        if ((2097152 & i20) != 0) {
            z75 = z74;
            z76 = SPUtils.getBoolean("chart_price_warning", true);
        } else {
            z75 = z74;
            z76 = z19;
        }
        if ((4194304 & i20) != 0) {
            z77 = z76;
            z78 = SPUtils.getBoolean("kline_open_order_extended_line", false);
        } else {
            z77 = z76;
            z78 = z20;
        }
        if ((8388608 & i20) != 0) {
            z79 = z78;
            z80 = SPUtils.getBoolean("kline_trade_position_extended_line", true);
        } else {
            z79 = z78;
            z80 = z21;
        }
        if ((16777216 & i20) != 0) {
            z81 = z80;
            z82 = false;
            z83 = SPUtils.getBoolean("kline_open_order_show_right", false);
        } else {
            z81 = z80;
            z82 = false;
            z83 = z22;
        }
        if ((i20 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0) {
            z85 = z83;
            z84 = z115;
            z86 = SPUtils.getBoolean("kline_dex_avg_show_right", z82, "dex_market");
        } else {
            z84 = z115;
            z85 = z83;
            z86 = z23;
        }
        if ((67108864 & i20) != 0) {
            z87 = z86;
            z88 = true;
            z89 = SPUtils.getBoolean("kline_dex_avg_show_pnl_amt", true, "dex_market");
        } else {
            z87 = z86;
            z88 = true;
            z89 = z24;
        }
        if ((134217728 & i20) != 0) {
            z90 = z89;
            z91 = SPUtils.getBoolean("kline_dex_avg_extend_line", z88, "dex_market");
        } else {
            z90 = z89;
            z91 = z25;
        }
        boolean z120 = (268435456 & i20) != 0 ? SPUtils.getBoolean("kline_trade_position_show_right", false) : z26;
        if ((536870912 & i20) != 0) {
            z92 = z120;
            z93 = SPUtils.getBoolean("kline_trade_position_show_pnl", true);
        } else {
            z92 = z120;
            z93 = z27;
        }
        if ((1073741824 & i20) != 0) {
            z94 = z93;
            z95 = false;
            z96 = SPUtils.getBoolean("kline_past_events", false);
        } else {
            z94 = z93;
            z95 = false;
            z96 = z28;
        }
        boolean z121 = (i20 & Integer.MIN_VALUE) != 0 ? SPUtils.getBoolean("kline_upcoming_events", z95) : z29;
        if ((i21 & 1) != 0) {
            z97 = z121;
            iIntValue = SPUtils.getInt("key_vol_transparency", 127).intValue();
        } else {
            z97 = z121;
            iIntValue = i;
        }
        if ((i21 & 2) != 0) {
            i24 = iIntValue;
            iIntValue2 = SPUtils.getInt("key_vol_transparency_sub", 127).intValue();
        } else {
            i24 = iIntValue;
            iIntValue2 = i2;
        }
        boolean z122 = (i21 & 4) != 0 ? false : z30;
        boolean z123 = (i21 & 8) != 0 ? false : z31;
        boolean z124 = (i21 & 16) != 0 ? false : z32;
        float f5 = (i21 & 32) != 0 ? 0.0f : f;
        if ((i21 & 64) != 0) {
            z98 = z122;
            i25 = iIntValue2;
            fCopydefault = C55298xhM.copydefault(50.0f, (Context) C43246rlf.OLrzqt.valueOf());
        } else {
            i25 = iIntValue2;
            z98 = z122;
            fCopydefault = f2;
        }
        float f6 = (i21 & 128) != 0 ? fCopydefault : f3;
        float f7 = (i21 & 256) != 0 ? fCopydefault : f4;
        int i26 = (i21 & 512) != 0 ? 0 : i3;
        int i27 = (i21 & 1024) != 0 ? 1 : i4;
        RectF rectF3 = (i21 & 2048) != 0 ? null : rectF;
        boolean z125 = (i21 & 4096) != 0 ? false : z33;
        RectF rectF4 = (i21 & 8192) != 0 ? null : rectF2;
        boolean z126 = (i21 & 16384) != 0 ? false : z34;
        List arrayList6 = (i21 & 32768) != 0 ? new ArrayList() : list2;
        List arrayList7 = (i21 & 65536) != 0 ? new ArrayList() : list3;
        List arrayList8 = (i21 & 131072) != 0 ? new ArrayList() : list4;
        List arrayList9 = (i21 & 262144) != 0 ? new ArrayList() : list5;
        KlineQuickOrderPriceBean klineQuickOrderPriceBean2 = (i21 & 524288) != 0 ? null : klineQuickOrderPriceBean;
        boolean z127 = (i21 & 1048576) != 0 ? false : z35;
        String str19 = (i21 & 2097152) != 0 ? "" : str;
        String str20 = (i21 & 4194304) != 0 ? "" : str2;
        String str21 = (i21 & 8388608) != 0 ? "TYPE_KLINE" : str3;
        boolean z128 = (i21 & 16777216) != 0 ? false : z36;
        boolean z129 = (i21 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? false : z37;
        String str22 = (i21 & 67108864) != 0 ? "sp_timeinterval_okx_pro" : str4;
        int i28 = (i21 & 134217728) != 0 ? 1440 : i5;
        int i29 = (i21 & 268435456) != 0 ? 0 : i6;
        BotPendingLineVo botPendingLineVo3 = (i21 & 536870912) != 0 ? null : botPendingLineVo;
        InterfaceC39506ptd interfaceC39506ptd2 = (i21 & 1073741824) != 0 ? null : interfaceC39506ptd;
        BotPendingLineVo botPendingLineVo4 = (i21 & Integer.MIN_VALUE) != 0 ? null : botPendingLineVo2;
        oLZ olz2 = (i22 & 1) != 0 ? null : olz;
        String str23 = (i22 & 2) != 0 ? "" : str5;
        String str24 = (i22 & 4) != 0 ? str23 : str6;
        String str25 = (i22 & 8) != 0 ? "" : str7;
        String str26 = (i22 & 16) != 0 ? "" : str8;
        int i30 = (i22 & 32) != 0 ? 5 : i7;
        boolean z130 = (i22 & 64) != 0 ? false : z38;
        BotPendingLineVo botPendingLineVo5 = botPendingLineVo4;
        int i31 = (i22 & 128) != 0 ? -1 : i8;
        String str27 = (i22 & 256) != 0 ? "" : str9;
        String str28 = (i22 & 512) != 0 ? "" : str10;
        int i32 = (i22 & 1024) != 0 ? 0 : i9;
        int i33 = (i22 & 2048) != 0 ? 0 : i10;
        int i34 = (i22 & 4096) != 0 ? 0 : i11;
        String str29 = (i22 & 8192) != 0 ? "" : str11;
        String str30 = (i22 & 16384) != 0 ? "" : str12;
        String str31 = (i22 & 32768) != 0 ? "" : str13;
        int i35 = (i22 & 65536) != 0 ? 0 : i12;
        int i36 = (i22 & 131072) != 0 ? 1 : i13;
        boolean z131 = (i22 & 262144) != 0 ? false : z39;
        boolean z132 = (i22 & 524288) != 0 ? false : z40;
        boolean z133 = (i22 & 1048576) != 0 ? false : z41;
        boolean z134 = (i22 & 2097152) != 0 ? false : z42;
        boolean z135 = (i22 & 4194304) != 0 ? false : z43;
        oUO ouo2 = (i22 & 8388608) != 0 ? null : ouo;
        oUI oui2 = (i22 & 16777216) != 0 ? new oUI(0, 0L, 0L, 7, null) : oui;
        boolean z136 = (i22 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? true : z44;
        int i37 = (i22 & 67108864) != 0 ? 1 : i14;
        boolean z137 = (i22 & 134217728) != 0 ? false : z45;
        boolean z138 = (i22 & 268435456) != 0 ? false : z46;
        boolean z139 = (i22 & 536870912) != 0 ? false : z47;
        boolean z140 = (i22 & 1073741824) != 0 ? false : z48;
        double d2 = (i22 & Integer.MIN_VALUE) != 0 ? 1.0d : d;
        int i38 = (i23 & 1) != 0 ? 2 : i15;
        int i39 = (i23 & 2) != 0 ? 4 : i16;
        int i40 = (i23 & 4) != 0 ? 0 : i17;
        int i41 = (i23 & 8) != 0 ? 0 : i18;
        String str32 = (i23 & 16) == 0 ? str14 : null;
        int i42 = (i23 & 32) != 0 ? 1 : i19;
        boolean z141 = (i23 & 64) != 0 ? false : z49;
        int i43 = i38;
        String str33 = (i23 & 128) != 0 ? "NORMAL" : str15;
        String str34 = (i23 & 256) != 0 ? "XMove" : str16;
        boolean z142 = (i23 & 512) != 0 ? false : z50;
        HashMap map7 = (i23 & 1024) != 0 ? new HashMap() : map;
        HashMap map8 = (i23 & 2048) != 0 ? new HashMap() : map2;
        HashMap map9 = (i23 & 4096) != 0 ? new HashMap() : map3;
        LinkedHashMap linkedHashMap2 = (i23 & 8192) != 0 ? new LinkedHashMap() : linkedHashMap;
        HashMap map10 = (i23 & 16384) != 0 ? new HashMap() : map4;
        HashMap map11 = (i23 & 32768) != 0 ? new HashMap() : map5;
        boolean z143 = (i23 & 65536) != 0 ? false : z51;
        boolean z144 = (i23 & 131072) != 0 ? false : z52;
        String str35 = (i23 & 262144) == 0 ? str17 : "";
        if ((i23 & 524288) != 0) {
            map6 = map10;
            str18 = str30;
            z99 = true;
            z100 = SPUtils.getBoolean("kline_order_cancel_confirm", true);
        } else {
            str18 = str30;
            map6 = map10;
            z99 = true;
            z100 = z53;
        }
        if ((i23 & 1048576) != 0) {
            z101 = z100;
            z102 = (SPUtils.getBoolean("chart_spot_average", z99) && z116) ? z99 : false;
        } else {
            z101 = z100;
            z102 = z54;
        }
        if ((i23 & 2097152) != 0) {
            z103 = z102;
            z104 = SPUtils.getBoolean("cost_be", false) && z116;
        } else {
            z103 = z102;
            z104 = z55;
        }
        if ((4194304 & i23) != 0) {
            z105 = z104;
            z106 = false;
            z107 = SPUtils.getBoolean("cost_liq", false) && z116;
        } else {
            z105 = z104;
            z106 = false;
            z107 = z56;
        }
        this(z108, z109, z110, z111, z112, z113, z114, arrayList4, arrayList3, list6, z84, z116, z65, z117, z64, z67, z119, z69, z71, z73, z75, z77, z79, z81, z85, z87, z90, z91, z92, z94, z96, z97, i24, i25, z98, z123, z124, f5, fCopydefault, f6, f7, i26, i27, rectF3, z125, rectF4, z126, arrayList6, arrayList7, arrayList8, arrayList9, klineQuickOrderPriceBean2, z127, str19, str20, str21, z128, z129, str22, i28, i29, botPendingLineVo3, interfaceC39506ptd2, botPendingLineVo5, olz2, str23, str24, str25, str26, i30, z130, i31, str27, str28, i32, i33, i34, str29, str18, str31, i35, i36, z131, z132, z133, z134, z135, ouo2, oui2, z136, i37, z137, z138, z139, z140, d2, i43, i39, i40, i41, str32, i42, z141, str33, str34, z142, map7, map8, map9, linkedHashMap2, map6, map11, z143, z144, str35, z101, z103, z105, z107, (8388608 & i23) != 0 ? new KlineSpotAverageBean() : klineSpotAverageBean, (i23 & 16777216) != 0 ? z106 : z57, (i23 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? z106 : z58, (i23 & 67108864) != 0 ? new oUL(false, false, false, false, 15, null) : oul, (i23 & 134217728) != 0 ? z106 : z59, (i23 & 268435456) != 0 ? z106 : z60, (i23 & 536870912) != 0 ? z106 : z61, (i23 & 1073741824) == 0 ? z62 : z106);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartViewOutSideConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, @NotNull ArrayList<DrawLineData.DrawLineItem> arrayList, @NotNull ArrayList<KLineEventBean> arrayList2, @NotNull List<oLS> list, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i, int i2, boolean z30, boolean z31, boolean z32, float f, float f2, float f3, float f4, int i3, int i4, RectF rectF, boolean z33, RectF rectF2, boolean z34, @NotNull List<PriceWarningItemBean> list2, @NotNull List<InterfaceC39510pth> list3, @NotNull List<KlineOpenOrderBean> list4, @NotNull List<Bitmap> list5, KlineQuickOrderPriceBean klineQuickOrderPriceBean, boolean z35, String str, String str2, @NotNull String str3, boolean z36, boolean z37, @NotNull String str4, int i5, int i6, BotPendingLineVo botPendingLineVo, InterfaceC39506ptd interfaceC39506ptd, BotPendingLineVo botPendingLineVo2, oLZ olz, @NotNull String str5, @NotNull String str6, String str7, String str8, int i7, boolean z38, int i8, String str9, String str10, int i9, int i10, int i11, String str11, String str12, String str13, int i12, int i13, boolean z39, boolean z40, boolean z41, boolean z42, boolean z43, oUO ouo, @NotNull oUI oui, boolean z44, int i14, boolean z45, boolean z46, boolean z47, boolean z48, double d, int i15, int i16, int i17, int i18, String str14, int i19, boolean z49, String str15, String str16, boolean z50, @NotNull HashMap<String, DataSource> map, @NotNull HashMap<String, oWK> map2, @NotNull HashMap<String, TemplateSetting> map3, @NotNull LinkedHashMap<String, ChartArea> linkedHashMap, @NotNull HashMap<String, oWN> map4, @NotNull HashMap<String, Integer> map5, boolean z51, boolean z52, @NotNull String str17, boolean z53, boolean z54, boolean z55, boolean z56, KlineSpotAverageBean klineSpotAverageBean, boolean z57, boolean z58, @NotNull oUL oul, boolean z59, boolean z60, boolean z61, boolean z62) {
        super(new Function1() { // from class: o.oUH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ChartViewOutSideConfig._init_$lambda$0((ChartViewOutSideConfig) obj);
            }
        });
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(oui, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(map3, "");
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
        Intrinsics.checkNotNullParameter(map4, "");
        Intrinsics.checkNotNullParameter(map5, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(oul, "");
        this.mShowAxis = z;
        this.mShowVolume = z2;
        this.isUtc8 = z3;
        this.isHideMainIndex = z4;
        this.isPortraitChart = z5;
        this.isOrderSupportClick = z6;
        this.isSpotCostSupportClick = z7;
        this.linesList = arrayList;
        this.klineEventList = arrayList2;
        this.klineEventMergeList = list;
        this.showHistoryOrderTabMSA = z8;
        this.showCurPotionTabMSA = z9;
        this.isColumnChart = z10;
        this.mShowPriceLine = z11;
        this.economicDefaultStatus = z12;
        this.mShowHistoryOrder = z13;
        this.mChartHistoryOrder = z14;
        this.mShowCurrentOrder = z15;
        this.mShowCostLine = z16;
        this.mShowCountdown = z17;
        this.mHideKlineDrawingData = z18;
        this.mShowPriceWarning = z19;
        this.mShowOpenOrderExtendedLine = z20;
        this.mShowTradePosExtendedLine = z21;
        this.mOpenOrderShowRight = z22;
        this.mDexAvgShowRight = z23;
        this.mDexAvgShowPnlAmt = z24;
        this.mDexAvgExtend = z25;
        this.mTradePosShowRight = z26;
        this.mTradePosShowPnl = z27;
        this.isShowPastEvents = z28;
        this.isShowUpcomingEvents = z29;
        this.volTransparent = i;
        this.volTransparentSub = i2;
        this.isHistoryCandlesLoading = z30;
        this.isRightHistoryCandlesLoading = z31;
        this.mChartOffsetInit = z32;
        this.mKlineInitOffset = f;
        this.klineDefaultOffset = f2;
        this.mKlineCurrentOffset = f3;
        this.mKlineLastOffset = f4;
        this.topPanelHeight = i3;
        this.screenType = i4;
        this.bsRect = rectF;
        this.isAutoYScaleClick = z33;
        this.fullScreenRect = rectF2;
        this.isShowPanel = z34;
        this.priceWarningDataList = list2;
        this.tradePositionDataList = list3;
        this.openOrderDataList = list4;
        this.compareBitmapList = list5;
        this.quickOrderPriceBean = klineQuickOrderPriceBean;
        this.isShowEmptyUi = z35;
        this.startTime = str;
        this.endTime = str2;
        this.klinePriceType = str3;
        this.isScreen = z36;
        this.isSimulateLine = z37;
        this.chartTag = str4;
        this.defaultTime = i5;
        this.landscapeKLineScrollY = i6;
        this.botOrdersBean = botPendingLineVo;
        this.gridPriceData = interfaceC39506ptd;
        this.gridPendingData = botPendingLineVo2;
        this.supportResistance = olz;
        this.mode = str5;
        this.preMode = str6;
        this.chartFromType = str7;
        this.dexChartSource = str8;
        this.chartYAxisNum = i7;
        this.needUpdateInYScale = z38;
        this.chartMode = i8;
        this.amountDisplaySymbol = str9;
        this.turnoverDisplaySymbol = str10;
        this.mPositiveColor = i9;
        this.mNegativeColor = i10;
        this.mAvgCustomColor = i11;
        this.mCandleRiseColor = str11;
        this.mCandleDownColor = str12;
        this.mMoneySymbol = str13;
        this.mOrdinateType = i12;
        this.mKlineAbstractType = i13;
        this.isBotKLine = z39;
        this.isCompareKLine = z40;
        this.isKLineInfiniteScale = z41;
        this.isFastKLineMode = z42;
        this.isScreenChange = z43;
        this.lastCandleItem = ouo;
        this.fastKLineBean = oui;
        this.isFastKLineMoveEnd = z44;
        this.mKlineYScaleAutoType = i14;
        this.isShowPriceType = z45;
        this.isHideTradeDrawingLine = z46;
        this.isDrawing = z47;
        this.mConvertCNY = z48;
        this.mUsdCnyRate = d;
        this.mPriceFractionDigits = i15;
        this.mMaxEfficientDigits = i16;
        this.mCoinVol = i17;
        this.mCandlestickType = i18;
        this.mTitle = str14;
        this.mChartPosition = i19;
        this.mDrawLineEnable = z49;
        this.currentMode = str15;
        this.moveInterceptMode = str16;
        this.isFullScreenMode = z50;
        this.dataSources = map;
        this.themes = map2;
        this.templateSettings = map3;
        this.areas = linkedHashMap;
        this.timelines = map4;
        this.chartStyles = map5;
        this.isDragSubIndicatorOrNot = z51;
        this.isMarketCap = z52;
        this.tradeSymbol = str17;
        this.mOrderCancelConfirm = z53;
        this.isShowSpotAveragePrice = z54;
        this.isShowBe = z55;
        this.isShowLiq = z56;
        this.klineSpotAverageBean = klineSpotAverageBean;
        this.isOpenCoolTime = z57;
        this.canShowQuickOrder = z58;
        this.controlBeanAfterInit = oul;
        this.isCeFiMCapMode = z59;
        this.isFromFormula = z60;
        this.isFromCompare = z61;
        this.isSupportDragOrder = z62;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChartViewOutSideConfig _init_$lambda$0(ChartViewOutSideConfig chartViewOutSideConfig) {
        Intrinsics.checkNotNullParameter(chartViewOutSideConfig, "");
        return copy$default(chartViewOutSideConfig, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0, false, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, null, false, null, false, null, null, null, null, null, false, null, null, null, false, false, null, 0, 0, null, null, null, null, null, null, null, null, 0, false, 0, null, null, 0, 0, 0, null, null, null, 0, 0, false, false, false, false, false, null, null, false, 0, false, false, false, false, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 0, 0, null, 0, false, null, null, false, null, null, null, null, null, null, false, false, null, false, false, false, false, null, false, false, null, false, false, false, false, -1, -1, -1, Integer.MAX_VALUE, null);
    }

    public final boolean isSupportQuickOrder() {
        String str = this.mode;
        if (str == "pro_mode" && this.canShowQuickOrder && !this.isCeFiMCapMode) {
            return this.controlBeanAfterInit.OLrzqt();
        }
        return Intrinsics.EZpvd((Object) str, (Object) "lite_mode") && this.screenType != 0;
    }

    public final void setSupportQuickOrder(boolean z) {
        this.controlBeanAfterInit.AEQbTJ(z);
    }

    public final void setOrderCancelConfirm(boolean z) {
        this.mOrderCancelConfirm = z;
        SPUtils.put("kline_order_cancel_confirm", Boolean.valueOf(z));
    }

    public final boolean isShowPriceChange() {
        return ((Intrinsics.EZpvd((Object) this.mode, (Object) "pro_mode") || Intrinsics.EZpvd((Object) this.mode, (Object) "lite_mode")) && !this.isCeFiMCapMode) || (Intrinsics.EZpvd((Object) this.mode, (Object) "cedefi_mode") && !this.isMarketCap);
    }

    public final void setShowPriceChange(boolean z) {
        if (Intrinsics.EZpvd((Object) this.mode, (Object) "pro_mode") || Intrinsics.EZpvd((Object) this.mode, (Object) "lite_mode")) {
            this.controlBeanAfterInit.KWHzl(z);
        }
    }

    public final void setShowPriceWarning(boolean z) {
        this.mShowPriceWarning = z;
        Iterator<PriceWarningItemBean> it = this.priceWarningDataList.iterator();
        while (it.hasNext()) {
            it.next().setSelected(false);
        }
    }

    public final void setShotLifeCycleCountDown(boolean z) {
        this.controlBeanAfterInit.EZpvd(z);
    }

    public final boolean isShotLifeCycleCountDown() {
        return this.controlBeanAfterInit.AEQbTJ();
    }

    public final void setShowCountdown(boolean z) {
        if (Intrinsics.EZpvd((Object) this.chartTag, (Object) "sp_timeinterval_okx_nft")) {
            setShotLifeCycleCountDown(z);
        } else {
            if (Intrinsics.EZpvd((Object) this.chartTag, (Object) "kline_dex_market_time_preference") || Intrinsics.EZpvd((Object) this.chartTag, (Object) "sp_timeinterval_okx_cedefi")) {
                return;
            }
            this.mShowCountdown = z;
        }
    }

    public final boolean isShowCountdown() {
        if (Intrinsics.EZpvd((Object) this.chartTag, (Object) "sp_timeinterval_okx_nft")) {
            return this.controlBeanAfterInit.AEQbTJ();
        }
        return (Intrinsics.EZpvd((Object) this.chartTag, (Object) "kline_dex_market_time_preference") || Intrinsics.EZpvd((Object) this.chartTag, (Object) "sp_timeinterval_okx_cedefi")) ? this.controlBeanAfterInit.KWHzl() : this.mShowCountdown;
    }

    public final void setOpenOrderDataList(@NotNull List<KlineOpenOrderBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.openOrderDataList.clear();
        this.openOrderDataList.addAll(list);
    }

    public final void setTradePositionDataList(@NotNull List<? extends InterfaceC39510pth> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.tradePositionDataList.clear();
        this.tradePositionDataList.addAll(list);
    }

    public final void setFastKLineIndex(int i) {
        this.fastKLineBean.KWHzl(i);
    }

    public final int getFastKLineIndex() {
        return this.fastKLineBean.KWHzl();
    }

    public final void setFastKLineSelectAndStartTime(long j, long j2) {
        this.fastKLineBean.EZpvd(j);
        this.fastKLineBean.copydefault(j2);
    }

    public final long getFastKLineSelectTime() {
        return this.fastKLineBean.EZpvd();
    }

    public final boolean isSelectTimeEarlier() {
        return this.fastKLineBean.EZpvd() < this.fastKLineBean.AEQbTJ();
    }

    public final void clearFastKLineBean() {
        this.fastKLineBean.KWHzl(-1);
        this.fastKLineBean.EZpvd(-1L);
        this.fastKLineBean.copydefault(-1L);
    }

    public final void updateLastCandleItem(@NotNull oUO ouo) {
        oUO ouo2;
        Intrinsics.checkNotNullParameter(ouo, "");
        if (ouo.valueOf > AudioStats.AUDIO_AMPLITUDE_NONE || (ouo2 = this.lastCandleItem) == null) {
            this.lastCandleItem = ouo;
        } else {
            this.lastCandleItem = new oUO(ouo2.EZpvd, ouo2.valueOf, Math.max(ouo2.copydefault, ouo.KWHzl), Math.min(ouo2.OLrzqt, ouo.KWHzl), ouo.KWHzl, ouo2.djBIcL, ouo2.AhwBna, ouo2.gEmmrt);
        }
    }
}

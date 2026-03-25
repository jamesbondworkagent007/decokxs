package o;

import android.graphics.RectF;
import androidx.camera.core.ImageAnalysis$$ExternalSyntheticBackport3;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.BotPendingLineVo;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineQuickOrderPriceBean;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.indicator.Expression;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.kline.library.template.TemplateSetting;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: o.oUr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36246oUr {
    public static boolean EZpvd = false;
    public static C36246oUr KWHzl;
    public ChartViewOutSideConfig AYXKKw;
    public boolean AhwBna;
    public float AkhnZx;
    public oUE OLrzqt;
    public int ejfBZ;
    public int fARcdN;
    public float isConnected;
    public android.content.Context values;
    public boolean djBIcL = false;
    public boolean valueOf = SPUtils.getBoolean("kline_double_click", true);
    public boolean fetchVPNInfo = SPUtils.getBoolean("kline_cost_y", true);
    public final LinkedHashMap<java.lang.String, AbstractC36302oWt> copydefault = new LinkedHashMap<>();
    public float hDKMBd = 0.0f;
    public float fIwbmz = 0.0f;
    public float AuCTel = 0.0f;
    public float gEmmrt = 0.0f;
    public int AEQbTJ = 0;
    public java.lang.String DbNXlk = "";
    public boolean fJNWhG = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean EZpvd() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void copydefault(boolean z) {
        EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.content.Context AubY() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OBJEWx() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OHqIaq() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OcIXYQ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean QVsKAR() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(ChartViewOutSideConfig chartViewOutSideConfig) {
        this.AYXKKw = chartViewOutSideConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void djBIcL(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fFgQHt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fetchVPNInfo(boolean z) {
        this.fJNWhG = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void gEmmrt(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hBpjJd() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void isConnected(java.lang.String str) {
        this.DbNXlk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public oUE iwGUEr() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChartViewOutSideConfig zLjUOn() {
        return this.AYXKKw;
    }

    public void uzCIH(java.lang.String str) {
        this.AYXKKw.setTradeSymbol(str);
    }

    public int AxsJAY() {
        return this.OLrzqt.DbNXlk();
    }

    public void AEQbTJ(int i) {
        this.OLrzqt.copydefault(i);
    }

    public int ffGIBT() {
        return this.AYXKKw.getVolTransparent();
    }

    public void values(int i) {
        this.AYXKKw.setVolTransparent(i);
    }

    public int QkdxfA() {
        return this.AYXKKw.getVolTransparentSub();
    }

    public void AkhnZx(int i) {
        this.AYXKKw.setVolTransparentSub(i);
    }

    public java.lang.String AkhnZx() {
        return this.AYXKKw.getAmountDisplaySymbol();
    }

    public void AkhnZx(java.lang.String str) {
        this.AYXKKw.setAmountDisplaySymbol(str);
    }

    public java.lang.String OuxcSI() {
        return this.AYXKKw.getTurnoverDisplaySymbol();
    }

    public void getFieldNames(java.lang.String str) {
        this.AYXKKw.setTurnoverDisplaySymbol(str);
    }

    public boolean RVsVBY() {
        if (!EZpvd) {
            return false;
        }
        java.lang.String strAkhnZx = AkhnZx();
        java.lang.String strOuxcSI = OuxcSI();
        return (strAkhnZx == null || strAkhnZx.isEmpty() || strOuxcSI == null || strOuxcSI.isEmpty()) ? false : true;
    }

    public void fJNWhG(java.lang.String str) {
        iwGUEr(this.AYXKKw.getMode());
        this.AYXKKw.setMode(str);
    }

    public void iwGUEr(java.lang.String str) {
        this.AYXKKw.setPreMode(str);
    }

    public java.lang.String fZBcTu() {
        return this.AYXKKw.getMode();
    }

    public boolean DLWbHP() {
        return Objects.equals(fZBcTu(), "defi_mode_dex") || Objects.equals(fZBcTu(), "defi_mode_wallet") || Objects.equals(fZBcTu(), "cedefi_mode");
    }

    public boolean OFhtUX() {
        return Objects.equals(fZBcTu(), "defi_mode_dex") || Objects.equals(fZBcTu(), "defi_mode_wallet");
    }

    public boolean RdAHlO() {
        return Objects.equals(fZBcTu(), "pro_mode") || Objects.equals(fZBcTu(), "lite_mode");
    }

    public boolean RKDWNf() {
        return Objects.equals(fZBcTu(), "cedefi_mode");
    }

    public java.lang.String AxsJAYaxsJAY() {
        return this.AYXKKw.getPreMode();
    }

    public boolean aUsmxb() {
        return this.AYXKKw.isHideMainIndex();
    }

    public void fIwbmz(boolean z) {
        this.AYXKKw.setScreen(z);
    }

    public boolean Dmq() {
        return this.AYXKKw.isScreen();
    }

    public int ODWQjV() {
        return this.OLrzqt.djSkpj();
    }

    public void isConnected(int i) {
        this.OLrzqt.EZpvd(i);
    }

    public void values(java.lang.String str) {
        this.AYXKKw.setChartTag(str);
    }

    public java.lang.String getFieldNames() {
        return this.AYXKKw.getChartTag();
    }

    public int AwvSrB() {
        return this.AYXKKw.getDefaultTime();
    }

    public int RcXXUw() {
        return this.AYXKKw.getLandscapeKLineScrollY();
    }

    public boolean OTwTPd() {
        return this.AYXKKw.isSimulateLine();
    }

    public java.lang.String fIwbmz() {
        return this.AYXKKw.getChartFromType();
    }

    public boolean heceqZ() {
        return this.OLrzqt.gasjUx();
    }

    public void zsXlph(boolean z) {
        this.OLrzqt.AYXKKw(z);
    }

    public int zsXlph() {
        return this.AYXKKw.getChartYAxisNum();
    }

    public void EZpvd(int i) {
        this.AYXKKw.setChartYAxisNum(i);
    }

    public boolean gGvvIC() {
        return this.AYXKKw.getNeedUpdateInYScale();
    }

    public int getNewProxyInstance() {
        return this.AYXKKw.getChartMode();
    }

    public boolean gwTjWJ() {
        return this.OLrzqt.dxcTrN();
    }

    public void KWHzl(boolean z) {
        this.OLrzqt.copydefault(z);
    }

    public final void AhwBna(java.lang.String str) {
        oWK owk = this.AYXKKw.getThemes().get(str);
        if (owk == null) {
            return;
        }
        for (ChartArea chartArea : this.AYXKKw.getAreas().values()) {
            if (chartArea.copydefault().equals(str) && (chartArea instanceof oVT)) {
                ((oVT) chartArea).copydefault(owk);
            }
        }
        for (AbstractC36302oWt abstractC36302oWt : this.copydefault.values()) {
            if (abstractC36302oWt.copydefault().equals(str)) {
                abstractC36302oWt.KWHzl();
                abstractC36302oWt.OLrzqt(owk);
            }
        }
    }

    public TemplateSetting KWHzl(java.lang.String str) {
        TemplateSetting templateSetting = this.AYXKKw.getTemplateSettings().get(str);
        if (templateSetting != null && AxsJAYaxsJAY() == fZBcTu()) {
            return templateSetting;
        }
        iwGUEr(fZBcTu());
        this.fJNWhG = true;
        TemplateSetting templateSettingLoad = TemplateSetting.load(str);
        this.AYXKKw.getTemplateSettings().put(str, templateSettingLoad);
        return templateSettingLoad;
    }

    public TemplateSetting EZpvd(java.lang.String str, boolean z) {
        TemplateSetting templateSettingLoad = this.AYXKKw.getTemplateSettings().get(str);
        if (templateSettingLoad == null || AxsJAYaxsJAY() != fZBcTu()) {
            iwGUEr(fZBcTu());
            this.fJNWhG = true;
            templateSettingLoad = TemplateSetting.load(str);
            this.AYXKKw.getTemplateSettings().put(str, templateSettingLoad);
        }
        if (z) {
            templateSettingLoad.getMainIndicatorNames().clear();
        }
        return templateSettingLoad;
    }

    public int iZzfmt() {
        return this.AYXKKw.getMPositiveColor();
    }

    public void valueOf(int i) {
        this.AYXKKw.setMPositiveColor(i);
    }

    public int giSNqX() {
        return this.AYXKKw.getMNegativeColor();
    }

    public void AhwBna(int i) {
        this.AYXKKw.setMNegativeColor(i);
    }

    public java.lang.String fvQaOB() {
        return this.AYXKKw.getMConvertCNY() ? "¥" : this.AYXKKw.getMMoneySymbol();
    }

    public int hUfVAv() {
        return this.AYXKKw.getMOrdinateType();
    }

    public boolean dHguZz() {
        return this.AYXKKw.isCompareKLine();
    }

    public void gEmmrt(int i) {
        this.AYXKKw.setMOrdinateType(i);
    }

    public int QVAiDq() {
        return this.AYXKKw.getMKlineAbstractType();
    }

    public void djBIcL(int i) {
        this.AYXKKw.setMKlineAbstractType(i);
    }

    public void ejfBZ(java.lang.String str) {
        this.AYXKKw.setMMoneySymbol(str);
    }

    public void AubY(boolean z) {
        this.OLrzqt.djBIcL(z);
    }

    public boolean OxVOHk() {
        return this.OLrzqt.finit();
    }

    public void DbNXlk(boolean z) {
        this.OLrzqt.OLrzqt(z);
    }

    public boolean DGUQLI() {
        return this.AYXKKw.isShowPriceType();
    }

    public boolean QwvEab() {
        return this.AYXKKw.getMHideKlineDrawingData();
    }

    public void AkhnZx(boolean z) {
        this.AYXKKw.setMHideKlineDrawingData(z);
    }

    public boolean OJuSTm() {
        return this.AYXKKw.isDrawing();
    }

    public boolean USBtdM() {
        return this.AYXKKw.isHideTradeDrawingLine();
    }

    public boolean AuCTelauCTel() {
        return this.AYXKKw.getMConvertCNY();
    }

    public void AYXKKw(boolean z) {
        this.AYXKKw.setMConvertCNY(z);
    }

    public double getPostValueLengthLimit() {
        return this.AYXKKw.getMUsdCnyRate();
    }

    public void KWHzl(double d) {
        this.AYXKKw.setMUsdCnyRate(d);
    }

    public java.lang.String DarRvM() {
        return this.OLrzqt.getFieldNames();
    }

    public boolean isConnected(java.lang.String str, java.lang.String str2) {
        if ("light".equalsIgnoreCase(str)) {
            if (this.OLrzqt.wlaJM() == null) {
                this.OLrzqt.KWHzl(new oWG());
            }
            this.AYXKKw.getThemes().put(str2, this.OLrzqt.wlaJM());
            this.OLrzqt.copydefault(str);
            return true;
        }
        if ("dark".equalsIgnoreCase(str)) {
            if (this.OLrzqt.getNewProxyInstance() == null) {
                this.OLrzqt.EZpvd(new oWI());
            }
            this.AYXKKw.getThemes().put(str2, this.OLrzqt.getNewProxyInstance());
            this.OLrzqt.copydefault(str);
            return true;
        }
        pUU.KWHzl("ChartView", "setTheme themeName = " + str + " dataSourceName = " + str2);
        return false;
    }

    public int gkJEwt() {
        return this.AYXKKw.getMPriceFractionDigits();
    }

    public void DbNXlk(int i) {
        if (i == this.AYXKKw.getMPriceFractionDigits()) {
            return;
        }
        this.AYXKKw.setMPriceFractionDigits(i);
        java.util.Iterator<oWC> it = this.OLrzqt.QVAiDq().values().iterator();
        while (it.hasNext()) {
            it.next().AuCTelauCTel();
        }
        java.util.Iterator<AbstractC36302oWt> it2 = this.copydefault.values().iterator();
        while (it2.hasNext()) {
            it2.next().KWHzl();
        }
    }

    public void AYXKKw(int i) {
        if (i == this.AYXKKw.getMMaxEfficientDigits()) {
            return;
        }
        this.AYXKKw.setMMaxEfficientDigits(i);
    }

    public int dvKsVJ() {
        return this.AYXKKw.getMMaxEfficientDigits();
    }

    public int wlaJM() {
        return this.AYXKKw.getMCoinVol();
    }

    public void KWHzl(int i) {
        this.AYXKKw.setMCoinVol(i);
    }

    public void getNewProxyInstance(java.lang.String str) {
        this.AYXKKw.setMTitle(str);
    }

    public void copydefault(int i) {
        this.AYXKKw.setMCandlestickType(i);
    }

    public java.lang.String AuCTel() {
        return this.AYXKKw.getMCandleRiseColor();
    }

    public java.lang.String ejfBZ() {
        return this.AYXKKw.getMCandleDownColor();
    }

    public int hDKMBd() {
        return this.AYXKKw.getMChartPosition();
    }

    public void OLrzqt(int i) {
        this.AYXKKw.setMChartPosition(i);
    }

    public boolean fERRXa() {
        return this.AYXKKw.isPortraitChart();
    }

    public boolean dUDNAs() {
        return this.AYXKKw.isOpenCoolTime();
    }

    public boolean fdOvFl() {
        return this.AYXKKw.isOrderSupportClick();
    }

    public boolean DaRZkR() {
        return this.AYXKKw.isSpotCostSupportClick();
    }

    public boolean zblBkD() {
        return this.AYXKKw.getMShowAxis();
    }

    public void fARcdN(boolean z) {
        this.AYXKKw.setMShowAxis(z);
    }

    public boolean DGgnkA() {
        return this.AYXKKw.getMShowVolume();
    }

    public void AuCTelauCTel(boolean z) {
        this.AYXKKw.setMShowVolume(z);
    }

    public boolean RKcVTr() {
        return this.AYXKKw.isColumnChart();
    }

    public boolean DNMMPQ() {
        return (this.AYXKKw.isShowUpcomingEvents() || this.AYXKKw.getEconomicDefaultStatus()) && !zLjUOn().isCeFiMCapMode();
    }

    public boolean DcqEDu() {
        return this.AYXKKw.isShowPastEvents() && !zLjUOn().isCeFiMCapMode();
    }

    public boolean call() {
        return DNMMPQ() || DcqEDu();
    }

    public boolean KDccX() {
        return this.AYXKKw.getMShowPriceLine();
    }

    public void getFieldNames(boolean z) {
        this.AYXKKw.setMShowHistoryOrder(z);
    }

    public boolean DWgRXt() {
        return this.AYXKKw.getMShowHistoryOrder();
    }

    public void AEQbTJ(boolean z) {
        this.AYXKKw.setMChartHistoryOrder(z);
    }

    public boolean fJNWhG() {
        return this.AYXKKw.getMChartHistoryOrder();
    }

    public void hDKMBd(boolean z) {
        this.AYXKKw.setMShowCurrentOrder(z);
    }

    public boolean WS() {
        return this.AYXKKw.getMShowCurrentOrder();
    }

    public void ejfBZ(boolean z) {
        this.AYXKKw.setMShowCostLine(z);
    }

    public boolean run() {
        return this.AYXKKw.getMShowCostLine();
    }

    public boolean DCUTEIdCUTEI() {
        return this.AYXKKw.isShowBe();
    }

    public void AuCTel(boolean z) {
        this.AYXKKw.setShowBe(z);
    }

    public boolean DCUTEIddSDPG() {
        return this.AYXKKw.isShowLiq();
    }

    public void fJNWhG(boolean z) {
        this.AYXKKw.setShowLiq(z);
    }

    public boolean DBxZfM() {
        return this.AYXKKw.isShowSpotAveragePrice();
    }

    public void iwGUEr(boolean z) {
        this.AYXKKw.setShowSpotAveragePrice(z);
    }

    public boolean fHqPtx() {
        return this.AYXKKw.getMShowOpenOrderExtendedLine();
    }

    public boolean DGOPHZDGOPHZ() {
        return this.AYXKKw.getMShowTradePosExtendedLine();
    }

    public boolean igXuih() {
        return this.AYXKKw.getMOpenOrderShowRight();
    }

    public boolean ODXsMY() {
        return this.AYXKKw.getMDexAvgShowRight();
    }

    public boolean dmfpNf() {
        return this.AYXKKw.getMDexAvgExtend();
    }

    public boolean hrNTAI() {
        return this.AYXKKw.getMDexAvgShowPnlAmt();
    }

    public boolean QDqgQU() {
        return this.AYXKKw.getMTradePosShowRight();
    }

    public boolean QIZEnU() {
        return this.AYXKKw.getMTradePosShowPnl();
    }

    public boolean hCLrkq() {
        return this.AYXKKw.getMShowPriceWarning();
    }

    public boolean QCjLjM() {
        return this.AYXKKw.getMDrawLineEnable();
    }

    public void valueOf(boolean z) {
        this.AYXKKw.setMDrawLineEnable(z);
    }

    public int RlQdEF() {
        return C55298xhM.OLrzqt(320, this.values);
    }

    public int accept() {
        return C55298xhM.OLrzqt(64, this.values);
    }

    public int aKErDB() {
        return C55298xhM.OLrzqt(64, this.values);
    }

    private C36246oUr() {
        float f = 0;
        this.isConnected = f;
        this.AkhnZx = f;
        C43246rlf c43246rlf = C43246rlf.OLrzqt;
        this.ejfBZ = C55298xhM.copydefault(6.0f, (android.content.Context) c43246rlf.valueOf());
        this.fARcdN = C55298xhM.copydefault(24.0f, (android.content.Context) c43246rlf.valueOf());
        this.AhwBna = false;
        this.OLrzqt = null;
        this.AYXKKw = null;
        if (this.values == null) {
            this.values = c43246rlf.valueOf().getApplicationContext();
        }
        this.OLrzqt = new oUE();
        this.AYXKKw = new ChartViewOutSideConfig();
    }

    public static C36246oUr copydefault() {
        if (KWHzl == null) {
            KWHzl = new C36246oUr();
        }
        return KWHzl;
    }

    public void AuCTel(java.lang.String str) {
        this.AYXKKw.setKlinePriceType(str);
    }

    public java.lang.String UeEOUB() {
        return this.AYXKKw.getKlinePriceType();
    }

    public java.lang.Boolean DGOPHZ() {
        return java.lang.Boolean.valueOf(this.AYXKKw.isShowEmptyUi());
    }

    public void uzCIH(boolean z) {
        this.AYXKKw.setShowEmptyUi(z);
    }

    public void AEQbTJ(java.util.List<KlineOpenOrderBean> list) {
        this.AYXKKw.setOpenOrderDataList(list);
    }

    public java.util.List<KlineOpenOrderBean> gasjUx() {
        return this.AYXKKw.getOpenOrderDataList();
    }

    public java.util.List<? extends InterfaceC39510pth> DCUTEI() {
        return this.AYXKKw.getTradePositionDataList();
    }

    public void EZpvd(java.util.List<? extends InterfaceC39510pth> list) {
        this.AYXKKw.setTradePositionDataList(list);
    }

    public java.util.List<PriceWarningItemBean> iRxXKY() {
        return this.AYXKKw.getPriceWarningDataList();
    }

    public void copydefault(java.util.List<PriceWarningItemBean> list) {
        this.AYXKKw.setPriceWarningDataList(list);
    }

    public BotPendingLineVo fetchVPNInfo() {
        return this.AYXKKw.getBotOrdersBean();
    }

    public void EZpvd(BotPendingLineVo botPendingLineVo) {
        this.AYXKKw.setBotOrdersBean(botPendingLineVo);
    }

    public BotPendingLineVo QKVWgx() {
        return this.AYXKKw.getGridPendingData();
    }

    public void AEQbTJ(BotPendingLineVo botPendingLineVo) {
        this.AYXKKw.setGridPendingData(botPendingLineVo);
    }

    public oLZ OqFWZa() {
        return this.AYXKKw.getSupportResistance();
    }

    public void AEQbTJ(oLZ olz) {
        this.AYXKKw.setSupportResistance(olz);
    }

    public InterfaceC39506ptd ORxRYg() {
        return this.AYXKKw.getGridPriceData();
    }

    public void EZpvd(InterfaceC39506ptd interfaceC39506ptd) {
        this.AYXKKw.setGridPriceData(interfaceC39506ptd);
    }

    public void OLrzqt(KlineQuickOrderPriceBean klineQuickOrderPriceBean) {
        this.AYXKKw.setQuickOrderPriceBean(klineQuickOrderPriceBean);
    }

    public KlineQuickOrderPriceBean DAIeex() {
        return this.AYXKKw.getQuickOrderPriceBean();
    }

    public void getNewProxyInstance(boolean z) {
        this.AYXKKw.setShowPanel(z);
    }

    public boolean UrRBLY() {
        return this.AYXKKw.isShowPanel();
    }

    public void AEQbTJ(RectF rectF) {
        this.AYXKKw.setFullScreenRect(rectF);
    }

    public RectF QOLQEE() {
        return this.AYXKKw.getFullScreenRect();
    }

    public boolean QHmsKR() {
        return this.AYXKKw.isAutoYScaleClick();
    }

    public void EZpvd(boolean z) {
        this.AYXKKw.setAutoYScaleClick(z);
    }

    public void zLjUOn(boolean z) {
        SPUtils.put("chart_axis", java.lang.Boolean.valueOf(z));
        fARcdN(z);
        EZpvd(false);
        DbNXlk("NORMAL");
        EZpvd(5);
        AhwBna(false);
    }

    public void EZpvd(RectF rectF) {
        this.AYXKKw.setBsRect(rectF);
    }

    public RectF fARcdN() {
        return this.AYXKKw.getBsRect();
    }

    public int QKudOq() {
        return this.AYXKKw.getScreenType();
    }

    public int zuWLRA() {
        return this.AYXKKw.getTopPanelHeight();
    }

    public void fetchVPNInfo(int i) {
        this.AYXKKw.setTopPanelHeight(i);
    }

    public float QUSxYX() {
        return this.AYXKKw.getKlineDefaultOffset();
    }

    public void copydefault(float f) {
        this.AYXKKw.setKlineDefaultOffset(f);
    }

    public void KWHzl(float f) {
        if (this.AYXKKw.isFastKLineMode() || this.AYXKKw.isScreenChange()) {
            this.AYXKKw.setMKlineCurrentOffset(0.0f);
        } else {
            this.AYXKKw.setMKlineCurrentOffset(f);
        }
    }

    public float QfsBiF() {
        return this.AYXKKw.getMKlineCurrentOffset();
    }

    public float djSkpj() {
        return this.AYXKKw.getMKlineLastOffset();
    }

    public void EZpvd(float f) {
        this.AYXKKw.setMKlineLastOffset(f);
    }

    public void EZpvd(java.lang.Float f) {
        this.AYXKKw.setMKlineInitOffset(f.floatValue());
    }

    public java.lang.Float RJOkX() {
        return java.lang.Float.valueOf(this.AYXKKw.getMKlineInitOffset());
    }

    public void AhwBna(boolean z) {
        this.AYXKKw.setMChartOffsetInit(z);
    }

    public boolean uzCIH() {
        return this.AYXKKw.getMChartOffsetInit();
    }

    public boolean UlJrfe() {
        return this.AYXKKw.isHistoryCandlesLoading();
    }

    public void isConnected(boolean z) {
        this.AYXKKw.setHistoryCandlesLoading(z);
    }

    public boolean ixgjPv() {
        return this.AYXKKw.isRightHistoryCandlesLoading();
    }

    public void values(boolean z) {
        this.AYXKKw.setRightHistoryCandlesLoading(z);
    }

    public void DbNXlk(java.lang.String str) {
        this.AYXKKw.setCurrentMode(str);
    }

    public java.lang.String gHZMYf() {
        return this.AYXKKw.getCurrentMode();
    }

    public void fIwbmz(java.lang.String str) {
        this.AYXKKw.setMoveInterceptMode(str);
    }

    public java.lang.String flVtFt() {
        return this.AYXKKw.getMoveInterceptMode();
    }

    public void djBIcL(java.lang.String str, java.lang.String str2) {
        synchronized (this.OLrzqt.fetchVPNInfo()) {
            com.okinc.kline.library.data.DataSource dataSource = this.OLrzqt.fetchVPNInfo().get(str2);
            if (dataSource == null) {
                dataSource = new com.okinc.kline.library.data.DataSource(str2);
                this.OLrzqt.fetchVPNInfo().put(str2, dataSource);
            }
            this.AYXKKw.getDataSources().put(str, dataSource);
            copydefault(str, (java.util.List<? extends oUO>) null);
        }
    }

    public java.util.HashMap<java.lang.String, oWN> DCJXGO() {
        return this.AYXKKw.getTimelines();
    }

    public LinkedHashMap<java.lang.String, ChartArea> values() {
        return this.AYXKKw.getAreas();
    }

    public java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> sSMYrx() {
        return this.AYXKKw.getDataSources();
    }

    public void EZpvd(java.lang.String str, java.util.List<HistoryOrderData> list, java.lang.Boolean bool) {
        com.okinc.kline.library.data.DataSource dataSource = this.AYXKKw.getDataSources().get(str);
        if (dataSource == null || list == null) {
            return;
        }
        dataSource.EZpvd(list, bool);
    }

    public void KWHzl(java.lang.String str, java.util.List<oUF> list, java.lang.String str2) {
        com.okinc.kline.library.data.DataSource dataSource = this.AYXKKw.getDataSources().get(str);
        if (dataSource == null || list == null) {
            return;
        }
        dataSource.OLrzqt(list, str2);
        java.lang.String[] strArr = {com.ibm.icu.text.DateFormat.SECOND};
        for (ChartArea chartArea : this.AYXKKw.getAreas().values()) {
            if (!(chartArea instanceof oVT) && chartArea.copydefault().equals(str) && chartArea.AEQbTJ().contains(str2)) {
                java.lang.String str3 = strArr[0];
                oUG oug = this.OLrzqt.AkhnZx().get(chartArea.AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + str3);
                if (oug != null) {
                    oug.EZpvd(true);
                }
            }
        }
    }

    public void AEQbTJ(java.lang.String str, java.util.List<? extends oUO> list) {
        com.okinc.kline.library.data.DataSource dataSource = this.AYXKKw.getDataSources().get(str);
        if (dataSource == null || list == null) {
            return;
        }
        dataSource.EZpvd(list);
        oWN own = DCJXGO().get(str);
        if (own != null) {
            own.OLrzqt(list);
        }
        java.lang.String[] strArr = {com.ibm.icu.text.DateFormat.MINUTE, com.ibm.icu.text.DateFormat.SECOND, "l"};
        for (ChartArea chartArea : this.AYXKKw.getAreas().values()) {
            if (!(chartArea instanceof oVT) && chartArea.copydefault().equals(str)) {
                for (int i = 0; i < 3; i++) {
                    java.lang.String str2 = strArr[i];
                    oUG oug = this.OLrzqt.AkhnZx().get(chartArea.AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + str2);
                    if (oug != null) {
                        oug.EZpvd(false);
                    }
                    if (str2.equals(com.ibm.icu.text.DateFormat.SECOND)) {
                        for (java.lang.String str3 : KWHzl(str).getMainIndicatorNames()) {
                            oUG oug2 = this.OLrzqt.AkhnZx().get(chartArea.AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + str2 + JwtUtilsKt.JWT_DELIMITER + str3);
                            if (oug2 != null) {
                                oug2.EZpvd(false);
                            }
                        }
                    }
                }
            }
        }
    }

    public void KWHzl(java.lang.String str, java.util.List<? extends oUO> list) {
        com.okinc.kline.library.data.DataSource dataSource = this.AYXKKw.getDataSources().get(str);
        if (dataSource == null || list == null || list.isEmpty()) {
            return;
        }
        dataSource.AEQbTJ(list);
        oWN own = DCJXGO().get(str);
        if (own != null) {
            own.AEQbTJ(list);
        }
        java.lang.String[] strArr = {com.ibm.icu.text.DateFormat.MINUTE, com.ibm.icu.text.DateFormat.SECOND, "l"};
        for (ChartArea chartArea : this.AYXKKw.getAreas().values()) {
            if (!(chartArea instanceof oVT) && chartArea.copydefault().equals(str)) {
                for (int i = 0; i < 3; i++) {
                    java.lang.String str2 = strArr[i];
                    oUG oug = this.OLrzqt.AkhnZx().get(chartArea.AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + str2);
                    if (oug != null) {
                        oug.EZpvd(false);
                    }
                    if (str2.equals(com.ibm.icu.text.DateFormat.SECOND)) {
                        for (java.lang.String str3 : KWHzl(str).getMainIndicatorNames()) {
                            oUG oug2 = this.OLrzqt.AkhnZx().get(chartArea.AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + str2 + JwtUtilsKt.JWT_DELIMITER + str3);
                            if (oug2 != null) {
                                oug2.EZpvd(false);
                            }
                        }
                    }
                }
            }
        }
        htlTjW();
    }

    public final void htlTjW() {
        if (spnCvw()) {
            this.AYXKKw.setFastKLineMode(false);
            oUO lastCandleItem = this.AYXKKw.getLastCandleItem();
            if (lastCandleItem != null) {
                copydefault("ds0", ImageAnalysis$$ExternalSyntheticBackport3.m(new java.lang.Object[]{lastCandleItem}));
            }
        }
    }

    public void copydefault(java.lang.String str, java.util.List<? extends oUO> list) {
        this.OLrzqt.AEQbTJ(str);
        com.okinc.kline.library.data.DataSource dataSource = this.AYXKKw.getDataSources().get(str);
        if (dataSource == null) {
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (this.AYXKKw.isFastKLineMode()) {
                this.AYXKKw.updateLastCandleItem(list.get(list.size() - 1));
                if (!spnCvw()) {
                    return;
                } else {
                    this.AYXKKw.setFastKLineMode(false);
                }
            }
            if (!dataSource.KWHzl(list) || dataSource.isConnected() == 0) {
                return;
            }
        } else {
            dataSource.KWHzl(1);
        }
        if (dataSource.gEmmrt() <= 0) {
            djBIcL(str);
            return;
        }
        oWN own = DCJXGO().get(str);
        if (own != null) {
            own.zuBGHE();
        }
        java.lang.String[] strArr = {com.ibm.icu.text.DateFormat.MINUTE, com.ibm.icu.text.DateFormat.SECOND, "l"};
        for (ChartArea chartArea : this.AYXKKw.getAreas().values()) {
            if (!(chartArea instanceof oVT) && chartArea.copydefault().equals(str)) {
                for (int i = 0; i < 3; i++) {
                    java.lang.String str2 = strArr[i];
                    oUG oug = this.OLrzqt.AkhnZx().get(chartArea.AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + str2);
                    if (oug != null) {
                        oug.EZpvd(false);
                    }
                    if (str2.equals(com.ibm.icu.text.DateFormat.SECOND)) {
                        for (java.lang.String str3 : KWHzl(str).getMainIndicatorNames()) {
                            oUG oug2 = this.OLrzqt.AkhnZx().get(chartArea.AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + str2 + JwtUtilsKt.JWT_DELIMITER + str3);
                            if (oug2 != null) {
                                oug2.EZpvd(false);
                            }
                        }
                        oUG oug3 = iwGUEr().AkhnZx().get(chartArea.AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + str2 + JwtUtilsKt.JWT_DELIMITER + "compare");
                        if (oug3 != null) {
                            oug3.EZpvd(false);
                        }
                    }
                }
            }
        }
    }

    public void copydefault(java.lang.String str, java.util.List<? extends oUO> list, java.lang.String str2) {
        com.okinc.kline.library.data.DataSource dataSource = this.AYXKKw.getDataSources().get(str);
        if (dataSource == null || list.isEmpty()) {
            return;
        }
        dataSource.AEQbTJ(list, str2);
        java.lang.String[] strArr = {com.ibm.icu.text.DateFormat.SECOND};
        for (ChartArea chartArea : this.AYXKKw.getAreas().values()) {
            if (!(chartArea instanceof oVT) && chartArea.copydefault().equals(str)) {
                java.lang.String str3 = strArr[0];
                oUG oug = this.OLrzqt.AkhnZx().get(chartArea.AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + str3);
                if (oug != null) {
                    oug.EZpvd(true);
                }
                oUG oug2 = iwGUEr().AkhnZx().get(chartArea.AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + str3 + JwtUtilsKt.JWT_DELIMITER + "compare");
                if (oug2 != null) {
                    oug2.EZpvd(false);
                }
            }
        }
    }

    public void djBIcL(java.lang.String str) {
        for (oWN own : DCJXGO().values()) {
            if (own.copydefault().equals(str)) {
                own.KWHzl(true);
            }
        }
        for (oWC owc : this.OLrzqt.QVAiDq().values()) {
            if (owc.copydefault().equals(str)) {
                owc.AEQbTJ(true);
            }
        }
    }

    public void hDKMBd(java.lang.String str) {
        java.lang.String[] strArr = {com.ibm.icu.text.DateFormat.MINUTE, com.ibm.icu.text.DateFormat.SECOND, "l"};
        for (ChartArea chartArea : this.AYXKKw.getAreas().values()) {
            if (!(chartArea instanceof oVT) && chartArea.copydefault().equals(str)) {
                for (int i = 0; i < 3; i++) {
                    java.lang.String str2 = strArr[i];
                    oUG oug = this.OLrzqt.AkhnZx().get(chartArea.AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + str2);
                    if (oug != null) {
                        oug.AYXKKw();
                    }
                    if (str2.equals(com.ibm.icu.text.DateFormat.SECOND)) {
                        for (java.lang.String str3 : KWHzl(str).getMainIndicatorNames()) {
                            oUG oug2 = this.OLrzqt.AkhnZx().get(chartArea.AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + str2 + JwtUtilsKt.JWT_DELIMITER + str3);
                            if (oug2 != null) {
                                oug2.AYXKKw();
                            }
                        }
                    }
                }
                oUG oug3 = this.OLrzqt.AkhnZx().get(chartArea.AEQbTJ() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND + JwtUtilsKt.JWT_DELIMITER + "compare");
                if (oug3 != null) {
                    oug3.AYXKKw();
                }
                oWC owc = this.OLrzqt.QVAiDq().get(chartArea.AEQbTJ());
                if (owc != null) {
                    if (owc.EZpvd().contains("ds0.m")) {
                        if (!pDN.AEQbTJ.EZpvd() && this.AYXKKw.getCurrentMode().equals("YScale")) {
                            this.AYXKKw.setCurrentMode("NORMAL");
                        }
                        owc.AubY();
                    } else {
                        owc.AubY();
                    }
                }
            }
        }
    }

    public void KWHzl(float f, int i) {
        oWC owc = this.OLrzqt.QVAiDq().get("ds0.m");
        if (owc != null) {
            owc.EZpvd(f, owc.AEQbTJ(this), owc.fARcdN(), this.AYXKKw.getChartFromType(), this.AYXKKw.getCurrentMode(), i);
        }
    }

    public void EZpvd(double d, double d2, int i) {
        oWC owc = this.OLrzqt.QVAiDq().get("ds0.m");
        if (owc != null) {
            owc.copydefault(d, d2, owc.AEQbTJ(this), owc.fARcdN(), this.AYXKKw.getChartFromType(), this.AYXKKw.getCurrentMode(), i);
        }
    }

    public void copydefault(float f, int i) {
        oWC owc = this.OLrzqt.QVAiDq().get("ds0.m");
        if (owc != null) {
            owc.AEQbTJ(f, owc.AEQbTJ(this), owc.fARcdN(), this.AYXKKw.getChartFromType(), this.AYXKKw.getCurrentMode(), i);
        }
    }

    public void Ufzxmz() {
        oWC owc = this.OLrzqt.QVAiDq().get("ds0.m");
        if (owc != null) {
            owc.zsXlph();
        }
    }

    public java.util.ArrayList<DrawLineData.DrawLineItem> dxcTrN() {
        return this.AYXKKw.getLinesList();
    }

    public java.util.List<oLS> dNCPSb() {
        return this.AYXKKw.getKlineEventMergeList();
    }

    public void AEQbTJ(java.util.ArrayList<DrawLineData.DrawLineItem> arrayList) {
        this.AYXKKw.setLinesList(arrayList);
    }

    public AbstractC36262oVg OLrzqt(java.lang.String str) {
        oUG oug = copydefault().iwGUEr().AkhnZx().get(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        if (oug == null || !(oug instanceof oUK)) {
            return null;
        }
        return ((oUK) oug).isConnected();
    }

    public AbstractC36262oVg AEQbTJ(java.lang.String str, java.lang.String str2) {
        oUG oug = this.OLrzqt.AkhnZx().get(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND + JwtUtilsKt.JWT_DELIMITER + str2);
        if (oug == null || !(oug instanceof oUK)) {
            return null;
        }
        return ((oUK) oug).isConnected();
    }

    public void KWHzl(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        for (java.lang.String str2 : arrayList) {
            try {
            } catch (java.lang.IllegalArgumentException unused) {
                AYXKKw(str, str2);
            }
            if (!"VOLUME".equals(str2) || this.AYXKKw.getKlinePriceType() == "TYPE_KLINE") {
                if (str2.equals("ENVELOPE") && !pDN.AEQbTJ.OLrzqt()) {
                    AYXKKw(str, "ENVELOPE");
                } else if (str2.equals("VWAP") && !pDN.AEQbTJ.KWHzl()) {
                    AYXKKw(str, "VWAP");
                } else {
                    AhwBna(str, str2);
                }
            }
        }
    }

    public void gEmmrt(java.lang.String str) {
        java.lang.String str2 = str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE;
        java.lang.String str3 = str2 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND + JwtUtilsKt.JWT_DELIMITER + "compare";
        oUG oug = this.OLrzqt.AkhnZx().get(str3);
        if (oug == null || !(oug instanceof oUK)) {
            return;
        }
        this.OLrzqt.AkhnZx().remove(str3);
        this.copydefault.remove(str3);
        ChartArea chartArea = this.AYXKKw.getAreas().get(str2);
        oWC owc = this.OLrzqt.QVAiDq().get(str2);
        if (chartArea == null || owc == null) {
            return;
        }
        chartArea.OLrzqt(true);
        owc.AubY();
    }

    public AbstractC36262oVg EZpvd(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = (str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE) + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND + JwtUtilsKt.JWT_DELIMITER + str2;
        oUK ouk = (oUK) this.OLrzqt.AkhnZx().get(str3);
        if (ouk == null) {
            ouk = new oUK(str3);
        }
        return ouk.isConnected();
    }

    public void AEQbTJ(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        if (list.size() != list2.size() || list.size() > 10) {
            return;
        }
        java.lang.String str2 = str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE;
        if (this.OLrzqt.AkhnZx().get(str2 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE) instanceof oUM) {
            if (((oUM) this.OLrzqt.AkhnZx().get(str2 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE)) == null) {
                return;
            }
        }
        java.lang.String str3 = str2 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND + JwtUtilsKt.JWT_DELIMITER + "compare";
        oUK ouk = (oUK) this.OLrzqt.AkhnZx().get(str3);
        if (ouk == null) {
            ouk = new oUK(str3);
            this.OLrzqt.AkhnZx().put(str3, ouk);
        }
        C36270oVo c36270oVo = new C36270oVo("compare", list);
        for (int i = 0; i < list.size(); i++) {
            c36270oVo.copydefault(i).setIsShow(true);
            c36270oVo.copydefault(i).setName(list2.get(i));
            c36270oVo.EZpvd(i).setName(list.get(i));
        }
        ouk.KWHzl(c36270oVo);
        if (this.copydefault.get(str3) == null) {
            C36295oWm c36295oWm = new C36295oWm(str3);
            this.copydefault.put(c36295oWm.AEQbTJ(), c36295oWm);
        }
        if (this.AYXKKw.getAreas().get(str2) != null) {
            this.AYXKKw.getAreas().get(str2).OLrzqt(true);
        }
    }

    public boolean AhwBna(java.lang.String str, java.lang.String str2) {
        AbstractC36262oVg ovp;
        if (str2.isEmpty()) {
            return false;
        }
        java.lang.String str3 = str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE;
        if (this.OLrzqt.AkhnZx().get(str3 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE) instanceof oUM) {
            if (((oUM) this.OLrzqt.AkhnZx().get(str3 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE)) == null) {
                return false;
            }
        }
        new java.util.ArrayList();
        java.util.ArrayList<Expression.Parameter> arrayListCopydefault = copydefault(str, str2);
        java.lang.String str4 = str3 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND + JwtUtilsKt.JWT_DELIMITER + str2;
        oUK ouk = (oUK) this.OLrzqt.AkhnZx().get(str4);
        java.lang.String strAEQbTJ = C36278oVw.AEQbTJ(str, str2);
        if (!android.text.TextUtils.isEmpty(strAEQbTJ)) {
            str2 = strAEQbTJ;
        }
        if (ouk == null) {
            ouk = new oUK(str4);
            this.OLrzqt.AkhnZx().put(str4, ouk);
        }
        java.lang.String strEjfBZ = new C36260oVe(str2).ejfBZ();
        if (strEjfBZ.equals("MA")) {
            ovp = new oVA(str2);
        } else if (strEjfBZ.equals("EMA")) {
            ovp = new C36272oVq(str2);
        } else if (strEjfBZ.equals("BOLL")) {
            ovp = new C36266oVk(str2);
        } else if (strEjfBZ.equals("SAR")) {
            ovp = new oVI(str2);
        } else if (strEjfBZ.equals("SR")) {
            ovp = new oVK(str2);
        } else if (strEjfBZ.equals("SUPERTREND")) {
            ovp = new oVM(str2);
        } else if (strEjfBZ.equals("ENVELOPE")) {
            ovp = new C36277oVv(str2);
        } else if (strEjfBZ.equals("VWAP")) {
            ovp = new oVQ(str2);
        } else if (strEjfBZ.equals("VOLUME")) {
            ovp = new oVP(str2);
        } else {
            throw new java.lang.IllegalArgumentException();
        }
        if (arrayListCopydefault.size() > 0) {
            ovp.KWHzl(pDS.OLrzqt.EZpvd(ovp.isConnected(), arrayListCopydefault));
        }
        ouk.KWHzl(ovp);
        if (this.copydefault.get(str4) == null) {
            C36295oWm c36295oWm = new C36295oWm(str4);
            this.copydefault.put(c36295oWm.AEQbTJ(), c36295oWm);
        }
        if (strEjfBZ.equals("VOLUME")) {
            OLrzqt(str, str2, arrayListCopydefault);
        }
        if (this.AYXKKw.getAreas().get(str3) != null) {
            this.AYXKKw.getAreas().get(str3).OLrzqt(true);
        }
        return true;
    }

    public boolean OLrzqt(java.lang.String str, AbstractC36262oVg abstractC36262oVg) {
        java.lang.String str2 = str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE;
        java.lang.String str3 = str2 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND + JwtUtilsKt.JWT_DELIMITER + abstractC36262oVg.ejfBZ();
        oUK ouk = (oUK) this.OLrzqt.AkhnZx().get(str3);
        if (ouk == null) {
            ouk = new oUK(str3);
            this.OLrzqt.AkhnZx().put(str3, ouk);
        }
        ouk.KWHzl(abstractC36262oVg);
        if (this.copydefault.get(str3) == null) {
            C36295oWm c36295oWm = new C36295oWm(str3);
            this.copydefault.put(c36295oWm.AEQbTJ(), c36295oWm);
        }
        if (this.AYXKKw.getAreas().get(str2) != null) {
            this.AYXKKw.getAreas().get(str2).OLrzqt(true);
        }
        return true;
    }

    public boolean AEQbTJ(java.lang.String str, AbstractC36262oVg abstractC36262oVg) {
        java.lang.String str2 = (str + ".indic" + abstractC36262oVg.ejfBZ()) + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND;
        oUK ouk = (oUK) this.OLrzqt.AkhnZx().get(str2);
        if (ouk == null) {
            ouk = new oUK(str2);
            this.OLrzqt.AkhnZx().put(str2, ouk);
        }
        ouk.KWHzl(abstractC36262oVg);
        return true;
    }

    public final java.util.ArrayList<Expression.Parameter> copydefault(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList<Expression.Parameter> arrayList = new java.util.ArrayList<>();
        java.lang.String strKWHzl = C36278oVw.KWHzl(str, str2);
        if (android.text.TextUtils.isEmpty(strKWHzl)) {
            return arrayList;
        }
        return (java.util.ArrayList) new Gson().fromJson(strKWHzl, new TypeToken<java.util.ArrayList<Expression.Parameter>>() { // from class: o.oUr.3
        }.getType());
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.util.ArrayList<Expression.Parameter> arrayList) {
        java.lang.String str3 = str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE + "VOLUME";
        oUK ouk = new oUK(str3 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        oVO ovo = new oVO(str2, true);
        if (!arrayList.isEmpty()) {
            ovo.KWHzl(pDS.OLrzqt.EZpvd(ovo.isConnected(), arrayList));
        }
        ouk.KWHzl(ovo);
        this.OLrzqt.AkhnZx().put(ouk.AEQbTJ(), ouk);
        C36295oWm c36295oWm = new C36295oWm(str3 + ".s");
        this.copydefault.put(c36295oWm.AEQbTJ(), c36295oWm);
        if (this.AYXKKw.getAreas().get(str3) != null) {
            this.AYXKKw.getAreas().get(str3).OLrzqt(true);
        }
        AhwBna(str);
    }

    public void copydefault(java.lang.String str, AbstractC36262oVg abstractC36262oVg) {
        java.lang.String str2 = str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE + "VOLUME";
        oUK ouk = new oUK(str2 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        ouk.KWHzl(abstractC36262oVg);
        this.OLrzqt.AkhnZx().put(ouk.AEQbTJ(), ouk);
        C36295oWm c36295oWm = new C36295oWm(str2 + ".s");
        this.copydefault.put(c36295oWm.AEQbTJ(), c36295oWm);
        if (this.AYXKKw.getAreas().get(str2) != null) {
            this.AYXKKw.getAreas().get(str2).OLrzqt(true);
        }
        AhwBna(str);
    }

    public void fetchVPNInfo(java.lang.String str) {
        java.lang.String str2 = str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE + "VOLUME";
        oUG oug = this.OLrzqt.AkhnZx().get(str2 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        if (oug == null || !(oug instanceof oUK)) {
            return;
        }
        this.OLrzqt.AkhnZx().remove(oug.AEQbTJ());
        this.copydefault.remove(oug.AEQbTJ());
        ChartArea chartArea = this.AYXKKw.getAreas().get(str2);
        oWC owc = this.OLrzqt.QVAiDq().get(str2);
        if (chartArea == null || owc == null) {
            return;
        }
        chartArea.OLrzqt(true);
        owc.AubY();
    }

    public void EZpvd(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        java.util.Iterator<java.lang.String> it = arrayList.iterator();
        while (it.hasNext()) {
            AYXKKw(str, it.next());
        }
    }

    public void AYXKKw(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE;
        java.lang.String str4 = str3 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND + JwtUtilsKt.JWT_DELIMITER + str2;
        oUG oug = this.OLrzqt.AkhnZx().get(str4);
        if (oug == null || !(oug instanceof oUK)) {
            return;
        }
        this.OLrzqt.AkhnZx().remove(str4);
        this.copydefault.remove(str4);
        ChartArea chartArea = this.AYXKKw.getAreas().get(str3);
        oWC owc = this.OLrzqt.QVAiDq().get(str3);
        if (chartArea == null || owc == null) {
            return;
        }
        chartArea.OLrzqt(true);
        owc.AubY();
    }

    public void AYXKKw(java.lang.String str) {
        java.lang.String str2 = str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE;
        java.lang.String str3 = str2 + JwtUtilsKt.JWT_DELIMITER + "l";
        oUG oug = this.OLrzqt.AkhnZx().get(str3);
        if (oug == null || !(oug instanceof oUK)) {
            return;
        }
        this.OLrzqt.AkhnZx().remove(str3);
        this.copydefault.remove(str3);
        ChartArea chartArea = this.AYXKKw.getAreas().get(str2);
        oWC owc = this.OLrzqt.QVAiDq().get(str2);
        if (chartArea == null || owc == null) {
            return;
        }
        chartArea.OLrzqt(true);
        owc.AubY();
    }

    public boolean AEQbTJ(java.lang.String str, java.lang.String str2, boolean z) {
        java.lang.String str3;
        ChartArea chartArea = this.AYXKKw.getAreas().get(str);
        if (chartArea == null || chartArea.OLrzqt().KWHzl(1) == com.ibm.icu.text.DateFormat.MINUTE) {
            return false;
        }
        oUK ouk = (oUK) this.OLrzqt.AkhnZx().get(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        if (ouk == null) {
            return false;
        }
        new java.util.ArrayList();
        if (z) {
            str3 = str2;
        } else {
            str3 = str2 + "_sub";
        }
        java.util.ArrayList<Expression.Parameter> arrayListCopydefault = copydefault(chartArea.copydefault(), str3);
        java.lang.String strAEQbTJ = C36278oVw.AEQbTJ(chartArea.copydefault(), str3);
        java.lang.Boolean boolEZpvd = C36278oVw.EZpvd(chartArea.copydefault(), str2);
        if (!android.text.TextUtils.isEmpty(strAEQbTJ)) {
            str2 = strAEQbTJ;
        }
        C36263oVh c36263oVh = new C36263oVh();
        if (!c36263oVh.copydefault(str, str2, c36263oVh, boolEZpvd)) {
            return false;
        }
        this.OLrzqt.AkhnZx().remove(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        this.copydefault.remove(str + ".m");
        this.OLrzqt.QVAiDq().remove(str);
        this.copydefault.remove(str + "Range.d");
        if (arrayListCopydefault.size() > 0) {
            AbstractC36262oVg abstractC36262oVg = c36263oVh.OLrzqt;
            abstractC36262oVg.KWHzl(pDS.OLrzqt.EZpvd(abstractC36262oVg.isConnected(), arrayListCopydefault));
        }
        ouk.KWHzl(c36263oVh.OLrzqt);
        this.OLrzqt.QVAiDq().put(str, c36263oVh.EZpvd);
        c36263oVh.EZpvd.OLrzqt(AbstractC36302oWt.KWHzl(16.0f));
        c36263oVh.EZpvd.KWHzl(AbstractC36302oWt.copydefault(6.0f));
        java.lang.String strEjfBZ = c36263oVh.OLrzqt.ejfBZ();
        if (strEjfBZ.equals("VOLUME")) {
            c36263oVh.EZpvd.KWHzl(1);
        } else if (strEjfBZ.equals("BOLL") || strEjfBZ.equals("SAR")) {
            oUM oum = new oUM(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
            this.OLrzqt.AkhnZx().put(oum.AEQbTJ(), oum);
            oum.EZpvd(false);
            C36304oWv c36304oWv = new C36304oWv(str + ".m");
            this.copydefault.put(c36304oWv.AEQbTJ(), c36304oWv);
        }
        return true;
    }

    public void AEQbTJ(java.lang.String str, java.lang.Boolean bool) {
        ChartArea chartArea = this.AYXKKw.getAreas().get(str);
        if (chartArea == null || chartArea.OLrzqt().KWHzl(1) == com.ibm.icu.text.DateFormat.MINUTE) {
            return;
        }
        oUG oug = this.OLrzqt.AkhnZx().get(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        if (oug == null || !(oug instanceof oUK)) {
            return;
        }
        java.lang.String str2 = str + "Range";
        ChartArea chartArea2 = this.AYXKKw.getAreas().get(str2);
        if (chartArea2 == null) {
            return;
        }
        oVT ovt = (oVT) this.AYXKKw.getAreas().get(chartArea.copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        if (ovt == null) {
            return;
        }
        if (!bool.booleanValue()) {
            chartArea.EZpvd(0);
        }
        ovt.copydefault(chartArea);
        this.AYXKKw.getAreas().remove(str);
        ovt.copydefault(chartArea2);
        this.AYXKKw.getAreas().remove(str2);
        java.util.Iterator<Map.Entry<java.lang.String, oUG>> it = this.OLrzqt.AkhnZx().entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().EZpvd().equals(str)) {
                it.remove();
            }
        }
        java.util.Iterator<Map.Entry<java.lang.String, AbstractC36302oWt>> it2 = this.copydefault.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<java.lang.String, AbstractC36302oWt> next = it2.next();
            if (next.getValue().EZpvd().equals(str)) {
                it2.remove();
            } else if (next.getValue().EZpvd().equals(str2)) {
                it2.remove();
            }
        }
    }

    public boolean valueOf(java.lang.String str, java.lang.String str2) {
        ChartArea chartArea = this.AYXKKw.getAreas().get(str);
        if (chartArea == null || chartArea.OLrzqt().KWHzl(1) == com.ibm.icu.text.DateFormat.MINUTE) {
            return false;
        }
        oUK ouk = (oUK) this.OLrzqt.AkhnZx().get(str + JwtUtilsKt.JWT_DELIMITER + "lt");
        if (ouk == null) {
            return false;
        }
        java.lang.String strAEQbTJ = C36278oVw.AEQbTJ(chartArea.copydefault(), str2);
        java.lang.Boolean boolEZpvd = C36278oVw.EZpvd(chartArea.copydefault(), str2);
        if (!android.text.TextUtils.isEmpty(strAEQbTJ)) {
            str2 = strAEQbTJ;
        }
        C36263oVh c36263oVh = new C36263oVh();
        if (!c36263oVh.copydefault(str, str2, c36263oVh, boolEZpvd)) {
            return false;
        }
        this.OLrzqt.AkhnZx().remove(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
        this.copydefault.remove(str + ".m");
        this.OLrzqt.QVAiDq().remove(str);
        this.copydefault.remove(str + "Range.d");
        ouk.KWHzl(c36263oVh.OLrzqt);
        this.OLrzqt.QVAiDq().put(str, c36263oVh.EZpvd);
        c36263oVh.EZpvd.OLrzqt(AbstractC36302oWt.KWHzl(16.0f));
        c36263oVh.EZpvd.KWHzl(AbstractC36302oWt.copydefault(6.0f));
        java.lang.String strEjfBZ = c36263oVh.OLrzqt.ejfBZ();
        if (strEjfBZ.equals("VOLUME")) {
            c36263oVh.EZpvd.KWHzl(1);
        } else if (strEjfBZ.equals("BOLL") || strEjfBZ.equals("SAR")) {
            oUM oum = new oUM(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE);
            this.OLrzqt.AkhnZx().put(oum.AEQbTJ(), oum);
            oum.EZpvd(false);
            C36304oWv c36304oWv = new C36304oWv(str + ".m");
            this.copydefault.put(c36304oWv.AEQbTJ(), c36304oWv);
        }
        return true;
    }

    public void valueOf(java.lang.String str) {
        ChartArea chartArea = this.AYXKKw.getAreas().get(str);
        if (chartArea == null || chartArea.OLrzqt().KWHzl(1) == com.ibm.icu.text.DateFormat.MINUTE) {
            return;
        }
        oUG oug = this.OLrzqt.AkhnZx().get(str + JwtUtilsKt.JWT_DELIMITER + "lt");
        if (oug == null || !(oug instanceof oUK)) {
            return;
        }
        java.lang.String str2 = str + "Range";
        ChartArea chartArea2 = this.AYXKKw.getAreas().get(str2);
        if (chartArea2 == null) {
            return;
        }
        oVT ovt = (oVT) this.AYXKKw.getAreas().get(chartArea.copydefault() + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        if (ovt == null) {
            return;
        }
        ovt.copydefault(chartArea);
        this.AYXKKw.getAreas().remove(str);
        ovt.copydefault(chartArea2);
        this.AYXKKw.getAreas().remove(str2);
        java.util.Iterator<Map.Entry<java.lang.String, oUG>> it = this.OLrzqt.AkhnZx().entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().EZpvd().equals(str)) {
                it.remove();
            }
        }
        java.util.Iterator<Map.Entry<java.lang.String, AbstractC36302oWt>> it2 = this.copydefault.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<java.lang.String, AbstractC36302oWt> next = it2.next();
            if (next.getValue().EZpvd().equals(str)) {
                it2.remove();
            } else if (next.getValue().EZpvd().equals(str2)) {
                it2.remove();
            }
        }
    }

    public java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        int fieldNames;
        if (this.AYXKKw.getAreas().get(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND) == null) {
            return null;
        }
        oVT ovt = (oVT) this.AYXKKw.getAreas().get(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        if (ovt == null || (fieldNames = ovt.getFieldNames()) < 4) {
            return null;
        }
        for (int i = 2; i < fieldNames; i += 2) {
            if (ovt.AEQbTJ(i).AEQbTJ().endsWith("indic" + str2)) {
                return ovt.AEQbTJ(i).AEQbTJ();
            }
        }
        return null;
    }

    public int copydefault(java.lang.String str) {
        if (this.AYXKKw.getAreas().get(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND) == null) {
            return 0;
        }
        oVT ovt = (oVT) this.AYXKKw.getAreas().get(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        if (ovt == null) {
            return 0;
        }
        int fieldNames = ovt.getFieldNames();
        if (fieldNames - 2 < 4) {
            return 0;
        }
        return (fieldNames - 4) / 2;
    }

    public java.lang.String AEQbTJ(java.lang.String str) {
        if (this.AYXKKw.getAreas().get(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND) == null) {
            return null;
        }
        oVT ovt = (oVT) this.AYXKKw.getAreas().get(str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.SECOND);
        if (ovt != null && ovt.getFieldNames() - 2 >= 4) {
            return ovt.AEQbTJ(4).AEQbTJ();
        }
        return null;
    }

    public int EZpvd(java.lang.String str) {
        java.lang.Integer num = this.AYXKKw.getChartStyles().get(str);
        if (num == null) {
            num = 0;
            this.AYXKKw.getChartStyles().put(str, num);
        }
        return num.intValue();
    }

    public void AEQbTJ(java.lang.String str, int i) {
        if (EZpvd(str) != i || i == 1) {
            java.lang.String str2 = str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE;
            java.lang.String str3 = str2 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE;
            java.lang.String str4 = str2 + ".m";
            if (i == 0) {
                oUG oug = this.OLrzqt.AkhnZx().get(str3);
                if (oug == null || !(oug instanceof oUM)) {
                    oUM oum = new oUM(str3);
                    this.OLrzqt.AkhnZx().put(str3, oum);
                    oum.EZpvd(false);
                }
                copydefault(i, str);
                C36287oWe c36287oWe = new C36287oWe(str4);
                this.copydefault.put(c36287oWe.AEQbTJ(), c36287oWe);
                c36287oWe.KWHzl();
                c36287oWe.OLrzqt(this.AYXKKw.getThemes().get(str));
            } else if (i == 1) {
                oUK ouk = new oUK(str3);
                this.OLrzqt.AkhnZx().put(ouk.AEQbTJ(), ouk);
                if (str.equals("ds0")) {
                    ouk.KWHzl(new oWM("ThumbnailHLC"));
                } else {
                    ouk.KWHzl(new C36276oVu("HLC"));
                }
                copydefault(i, str);
                C36295oWm c36295oWm = new C36295oWm(str4);
                this.copydefault.put(c36295oWm.AEQbTJ(), c36295oWm);
                C36295oWm c36295oWm2 = new C36295oWm(str2 + ".l");
                this.copydefault.put(c36295oWm2.AEQbTJ(), c36295oWm2);
            } else if (i == 2 || i == 3) {
                copydefault(i, str);
                oUK ouk2 = new oUK(str3);
                this.OLrzqt.AkhnZx().put(ouk2.AEQbTJ(), ouk2);
                ouk2.KWHzl(new C36265oVj("CandleHLC"));
                C36295oWm c36295oWm3 = new C36295oWm(str4);
                this.copydefault.put(c36295oWm3.AEQbTJ(), c36295oWm3);
            }
            if (this.AYXKKw.getAreas().get(str2) != null) {
                this.AYXKKw.getAreas().get(str2).OLrzqt(true);
            }
            this.AYXKKw.getChartStyles().put(str, java.lang.Integer.valueOf(i));
        }
    }

    public final void copydefault(int i, java.lang.String str) {
        if (i != 0) {
            if (i == 1) {
                try {
                    if (KWHzl(str).getSPTimeInterval() == -2) {
                        AYXKKw(str);
                    } else {
                        fARcdN(str);
                    }
                    EZpvd(str, KWHzl(str).getMainIndicatorNames());
                    return;
                } catch (java.lang.Exception e) {
                    e.toString();
                    return;
                }
            }
            if (i != 2) {
                return;
            }
        }
        KWHzl(str, KWHzl(str).getMainIndicatorNames());
        AYXKKw(str);
        if (this.AYXKKw.getChartMode() == 2) {
            AYXKKw(str, "VOLUME");
        }
    }

    public boolean KWHzl(java.lang.String str, java.lang.String str2) {
        return KWHzl(str).getMainIndicatorNames().contains(str2);
    }

    public boolean gEmmrt(java.lang.String str, java.lang.String str2) {
        return KWHzl(str).getSideIndicatorNames().contains(str2);
    }

    public final void fARcdN(java.lang.String str) {
        java.lang.String str2 = str + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE;
        if (this.OLrzqt.AkhnZx().get(str2 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE) instanceof oUM) {
            if (((oUM) this.OLrzqt.AkhnZx().get(str2 + JwtUtilsKt.JWT_DELIMITER + com.ibm.icu.text.DateFormat.MINUTE)) == null) {
                return;
            }
        }
        java.lang.String str3 = str2 + JwtUtilsKt.JWT_DELIMITER + "l";
        oUK ouk = (oUK) this.OLrzqt.AkhnZx().get(str3);
        if (ouk == null) {
            ouk = new oUK(str3);
            this.OLrzqt.AkhnZx().put(str3, ouk);
        }
        oVA ova = new oVA("(60,0,0,0,0,0)");
        for (int i = 0; i < ova.values(); i++) {
            if (i > 0) {
                ova.copydefault(i).setIsShow(false);
            }
        }
        ouk.KWHzl(ova);
        if (this.copydefault.get(str3) == null) {
            C36295oWm c36295oWm = new C36295oWm(str3);
            this.copydefault.put(c36295oWm.AEQbTJ(), c36295oWm);
        }
        if (this.AYXKKw.getAreas().get(str2) != null) {
            this.AYXKKw.getAreas().get(str2).OLrzqt(true);
        }
    }

    public boolean fjfviF() {
        C33566myq c33566myq = C33566myq.EZpvd;
        return c33566myq.OLrzqt(this.values) > c33566myq.EZpvd(this.values);
    }

    public DataSource.StateListAnimator finit() {
        com.okinc.kline.library.data.DataSource dataSource = this.AYXKKw.getDataSources().get(this.OLrzqt.hDKMBd());
        if (dataSource == null || dataSource.gEmmrt() < 1) {
            return null;
        }
        return dataSource.AEQbTJ.get(dataSource.DbNXlk() - 1);
    }

    public void KWHzl() {
        OLrzqt();
        AYXKKw();
        for (KlineOpenOrderBean klineOpenOrderBean : this.AYXKKw.getOpenOrderDataList()) {
            klineOpenOrderBean.setLongClick(false);
            klineOpenOrderBean.setSelected(false);
            klineOpenOrderBean.setShowSolid(false);
        }
        for (InterfaceC39510pth interfaceC39510pth : this.AYXKKw.getTradePositionDataList()) {
            interfaceC39510pth.setLongClick(false);
            interfaceC39510pth.setSelected(false);
            interfaceC39510pth.setShowSolid(false);
            interfaceC39510pth.setLiqSelected(false);
            interfaceC39510pth.setShowSolidLiq(false);
            interfaceC39510pth.setShowSolidBE(false);
            interfaceC39510pth.setBeSelected(false);
        }
        this.AYXKKw.getKlineSpotAverageBean().setTSelected(false);
        this.AYXKKw.getKlineSpotAverageBean().setTShowSolid(false);
        this.AYXKKw.getKlineSpotAverageBean().setTLongClick(false);
    }

    public void AYXKKw() {
        this.OLrzqt.djBIcL((RectF) null);
        this.OLrzqt.DTwDnp().clear();
        this.OLrzqt.AxsJAY().clear();
        this.OLrzqt.iwGUEr().clear();
        this.OLrzqt.KWHzl().clear();
        this.OLrzqt.gEmmrt().clear();
        this.OLrzqt.values(null);
        this.OLrzqt.QKVWgx().clear();
        this.OLrzqt.OcIXYQ().clear();
        this.OLrzqt.zuBGHE().clear();
        this.OLrzqt.valueOf().clear();
        this.OLrzqt.djBIcL().clear();
        this.OLrzqt.AhwBna().clear();
        this.OLrzqt.AYXKKw().clear();
        this.OLrzqt.copydefault().clear();
        this.OLrzqt.OLrzqt().clear();
    }

    public void gEmmrt() {
        this.AYXKKw.getOpenOrderDataList().clear();
        this.AYXKKw.getTradePositionDataList().clear();
        this.AYXKKw.getPriceWarningDataList().clear();
        this.AYXKKw.getKlineEventList().clear();
        AEQbTJ(new java.util.ArrayList<>());
        AYXKKw();
    }

    public void djBIcL() {
        java.util.Iterator<oLS> it = this.AYXKKw.getKlineEventMergeList().iterator();
        while (it.hasNext()) {
            it.next().EZpvd(false);
        }
    }

    public void OLrzqt() {
        this.AYXKKw.setBsRect(null);
        this.AYXKKw.setShowPanel(false);
        this.AYXKKw.setStartTime("0");
        this.AYXKKw.setEndTime("0");
        this.OLrzqt.AhwBna(null);
    }

    public void valueOf() {
        synchronized (copydefault().iwGUEr().fetchVPNInfo()) {
            if (copydefault().iwGUEr().fetchVPNInfo() != null && copydefault().iwGUEr().fetchVPNInfo().size() > 0) {
                copydefault().iwGUEr().fetchVPNInfo().evictAll();
            }
        }
    }

    public void isConnected() {
        this.OLrzqt.OLrzqt("");
    }

    public void OLrzqt(long j, int i) {
        this.AYXKKw.setStartTime(java.lang.String.valueOf(j));
        if (i == 0) {
            this.AYXKKw.setEndTime(java.lang.String.valueOf(j + 1000));
        } else if (i == -5 || i == -15 || i == -30) {
            this.AYXKKw.setEndTime(java.lang.String.valueOf(j - (((long) i) * 1000)));
        } else if (i > 0) {
            this.AYXKKw.setEndTime(java.lang.String.valueOf(j + (((long) (i * 60)) * 1000)));
        } else {
            ChartViewOutSideConfig chartViewOutSideConfig = this.AYXKKw;
            chartViewOutSideConfig.setEndTime(chartViewOutSideConfig.getStartTime());
        }
        this.AYXKKw.getStartTime();
        this.AYXKKw.getEndTime();
    }

    public void KWHzl(int i, int i2) {
        this.OLrzqt.isConnected().x = i;
        this.OLrzqt.isConnected().y = i2;
    }

    public android.graphics.Point DTwDnp() {
        return this.OLrzqt.isConnected();
    }

    public void AhwBna() {
        this.OLrzqt.isConnected().x = -1;
        this.OLrzqt.isConnected().y = -1;
    }

    public boolean QSBOWP() {
        java.util.Iterator<DrawLineData.DrawLineItem> it = this.AYXKKw.getLinesList().iterator();
        while (it.hasNext()) {
            if (!it.next().isDelete()) {
                return false;
            }
        }
        return true;
    }

    public void DbNXlk() {
        this.OLrzqt.AkhnZx().clear();
        this.AYXKKw.getAreas().clear();
        this.OLrzqt.values().clear();
        this.OLrzqt.QVAiDq().clear();
        this.copydefault.clear();
        DCJXGO().clear();
    }

    public boolean QXDzTk() {
        return this.AYXKKw.isPortraitChart();
    }

    public int zuBGHE() {
        return (fJNWhG() && DWgRXt()) ? this.fARcdN : this.ejfBZ;
    }

    public ChartArea OLrzqt(float f, float f2) {
        ChartArea chartArea = null;
        for (ChartArea chartArea2 : this.AYXKKw.getAreas().values()) {
            if (chartArea2.EZpvd().contains("indic")) {
                if (chartArea2.fARcdN().contains(f, f2)) {
                    this.AYXKKw.setDragSubIndicatorOrNot(true);
                    chartArea2.AEQbTJ(true);
                    chartArea = chartArea2;
                } else {
                    chartArea2.AEQbTJ(false);
                }
            }
        }
        return chartArea;
    }

    public void AEQbTJ() {
        for (ChartArea chartArea : this.AYXKKw.getAreas().values()) {
            if (chartArea.EZpvd().contains("indic")) {
                chartArea.AEQbTJ(false);
            }
        }
    }

    public boolean DsrFlB() {
        return this.AYXKKw.isSupportDragOrder();
    }

    public boolean spnCvw() {
        DataSource.StateListAnimator stateListAnimatorFinit = finit();
        return (stateListAnimatorFinit == null || this.AYXKKw.getLastCandleItem() == null || (stateListAnimatorFinit.AhwBna() + (DXXBbs() * 2)) - 1 < this.AYXKKw.getLastCandleItem().EZpvd) ? false : true;
    }

    public long DXXBbs() {
        int iODWQjV = ODWQjV();
        if (iODWQjV == -1) {
            return 60000L;
        }
        if (iODWQjV != 0) {
            return 1000 * ((long) (ODWQjV() * 60));
        }
        return 1000L;
    }

    public long AxsJAYsNCnLh() {
        try {
            com.okinc.kline.library.data.DataSource dataSource = sSMYrx().get("ds0");
            if (dataSource == null) {
                return 0L;
            }
            return dataSource.AEQbTJ.get(QbewEr()).AhwBna();
        } catch (java.lang.Exception e) {
            pUU.copydefault("ChartManager", "getScreenLeftFirstCandleTime:" + e);
            return 0L;
        }
    }

    public boolean QSLkRj() {
        return this.AYXKKw.isFastKLineMoveEnd();
    }

    public int QbewEr() {
        oWN own = DCJXGO().get("ds0");
        if (own == null) {
            return 0;
        }
        return own.isConnected();
    }
}

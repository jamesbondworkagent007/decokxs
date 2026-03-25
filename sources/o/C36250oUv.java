package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.View;
import com.okinc.kline.data.BotPendingLineVo;
import com.okinc.kline.data.HistoryOrderData;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineQuickOrderPriceBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.rxutils.RxBus;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.LinkedHashMap;
import o.C32392mcI;
import o.C36327oXr;
import o.pDT;

/* JADX INFO: renamed from: o.oUv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36250oUv extends android.view.View implements InterfaceC36254oUz {
    public long AhwBna;
    public Application AkhnZx;
    public Dialog AuCTel;
    public boolean AuCTelauCTel;
    public boolean AubY;
    public InterfaceC58217yxC AwvSrB;
    public Fragment AxsJAY;
    public ActionBar DbNXlk;
    public android.graphics.Bitmap ejfBZ;
    public android.view.GestureDetector fARcdN;
    public PendingIntent fIwbmz;
    public LoaderManager fJNWhG;
    public TaskDescription fetchVPNInfo;
    public InterfaceC36249oUu gEmmrt;
    public InterfaceC36253oUy gHZMYf;
    public Activity getFieldNames;
    public boolean getNewProxyInstance;
    public android.graphics.Canvas hDKMBd;
    public StateListAnimator isConnected;
    public int iwGUEr;
    public android.animation.ValueAnimator sSMYrx;
    public java.lang.String uzCIH;
    public InterfaceC39500ptX valueOf;
    public ChartViewOutSideConfig values;
    public int wlaJM;
    public boolean zLjUOn;
    public FragmentManager zsXlph;
    public C36312oXc zuBGHE;
    public static final java.lang.String[] djBIcL = {".de", ".dl", ".bo", ".d", ".qop", ".bpl", ".i", ".xlb", ".ylb", ".t", ".fk", ".mask"};
    public static final java.lang.String[] AYXKKw = {".de", ".i", ".dl", ".bo", ".bpl", ".d", ".qop", ".t", ".litet"};
    public static final java.lang.String[] AEQbTJ = {".i", ".dl", ".bo", ".bpl", ".d", ".t", ".litet"};
    public static final java.lang.String[] copydefault = {".b"};
    public static final java.lang.String[] EZpvd = {".et"};
    public static final java.lang.String[] KWHzl = {".b", ".g", ".m", ".mask"};
    public static final java.lang.String[] OLrzqt = {".b", ".g", ".m", ".s", ".l", ".mask"};

    /* JADX INFO: renamed from: o.oUv$ActionBar */
    public interface ActionBar {
        void EZpvd(java.lang.String str);

        default void aI_() {
        }

        default void copydefault(java.lang.Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: o.oUv$Activity */
    public interface Activity {
        void EZpvd();

        void KWHzl(int i);
    }

    /* JADX INFO: renamed from: o.oUv$Application */
    public interface Application {
        void copydefault(AbstractC36302oWt abstractC36302oWt);
    }

    /* JADX INFO: renamed from: o.oUv$Dialog */
    public interface Dialog {
        void AEQbTJ();

        void EZpvd();

        void EZpvd(java.lang.String str);
    }

    /* JADX INFO: renamed from: o.oUv$Fragment */
    public interface Fragment {
        void KWHzl();
    }

    /* JADX INFO: renamed from: o.oUv$FragmentManager */
    public interface FragmentManager {
        void onEventClick(oLS ols);
    }

    /* JADX INFO: renamed from: o.oUv$LoaderManager */
    public interface LoaderManager {
        void AEQbTJ();
    }

    /* JADX INFO: renamed from: o.oUv$PendingIntent */
    public interface PendingIntent {
        void AEQbTJ();
    }

    /* JADX INFO: renamed from: o.oUv$StateListAnimator */
    public interface StateListAnimator {
        void EZpvd();

        void KWHzl();

        void OLrzqt(PriceWarningItemBean priceWarningItemBean, java.lang.String str);
    }

    /* JADX INFO: renamed from: o.oUv$TaskDescription */
    public interface TaskDescription {
        void AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TaskDescription AuCTel() {
        return this.fetchVPNInfo;
    }

    @Override // o.InterfaceC36254oUz
    public void AxsJAY() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StateListAnimator DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OcIXYQ() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String fIwbmz() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ActionBar fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getNewProxyInstance() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int isConnected() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setActionListener(InterfaceC39500ptX interfaceC39500ptX) {
        this.valueOf = interfaceC39500ptX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBotGridDragListener(InterfaceC36249oUu interfaceC36249oUu) {
        this.gEmmrt = interfaceC36249oUu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setChartPortraitType(int i) {
        this.iwGUEr = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setChartSelectionListener(ActionBar actionBar) {
        this.DbNXlk = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setChartStateListener(StateListAnimator stateListAnimator) {
        this.isConnected = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCompareListener(Activity activity) {
        this.getFieldNames = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCurrentStateMachine(C36312oXc c36312oXc) {
        this.zuBGHE = c36312oXc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDrawUpdateListener(Application application) {
        this.AkhnZx = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDrawingFinishListener(TaskDescription taskDescription) {
        this.fetchVPNInfo = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFromType(int i) {
        this.wlaJM = i;
    }

    public void setIndicator(java.lang.String str) {
    }

    @Override // o.InterfaceC36254oUz
    public void setInitUrlListener(@androidx.annotation.NonNull C36327oXr.StateListAnimator stateListAnimator) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setKlineEventClickListener(FragmentManager fragmentManager) {
        this.zsXlph = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setKlineQuickOrderListener(Dialog dialog) {
        this.AuCTel = dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setKlineTradeDragListener(InterfaceC36253oUy interfaceC36253oUy) {
        this.gHZMYf = interfaceC36253oUy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLoadHistoryKlineListener(PendingIntent pendingIntent) {
        this.fIwbmz = pendingIntent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLoadRightHistoryKlineListener(LoaderManager loaderManager) {
        this.fJNWhG = loaderManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setReloadKlineListener(Fragment fragment) {
        this.AxsJAY = fragment;
    }

    /* JADX DEBUG: Method merged with bridge method: zsXlph()Landroid/view/View; */
    @Override // o.InterfaceC36254oUz
    /* JADX INFO: renamed from: zuBGHE, reason: merged with bridge method [inline-methods] */
    public C36250oUv zsXlph() {
        return this;
    }

    public void setIsSupportDoubleClick(boolean z) {
        this.AuCTelauCTel = z;
        C36246oUr.copydefault().iwGUEr().valueOf(z);
    }

    public oWJ valueOf() {
        return new oWH();
    }

    public void setCurrentDataSource(java.lang.String str) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        if (c36246oUrCopydefault.zLjUOn().getThemes().get(this.uzCIH) == null || c36246oUrCopydefault.AxsJAYaxsJAY() != c36246oUrCopydefault.fZBcTu() || c36246oUrCopydefault.fFgQHt()) {
            c36246oUrCopydefault.iwGUEr(c36246oUrCopydefault.fZBcTu());
            c36246oUrCopydefault.fetchVPNInfo(false);
            valueOf().OLrzqt(this.uzCIH, str);
        } else {
            c36246oUrCopydefault.djBIcL(this.uzCIH, str);
        }
        C36246oUr.copydefault().AhwBna(false);
        invalidate();
    }

    public final long getFieldNames() {
        com.okinc.kline.library.data.DataSource dataSource = ejfBZ().get(this.uzCIH);
        if (dataSource == null) {
            pUU.copydefault("ChartView", "getLastDate: dataSource is null for mDataSourceName = " + this.uzCIH);
            return 0L;
        }
        return dataSource.AYXKKw();
    }

    public final long fARcdN() {
        com.okinc.kline.library.data.DataSource dataSource = ejfBZ().get(this.uzCIH);
        if (dataSource == null) {
            pUU.copydefault("ChartView", "getFirstDate: dataSource is null for mDataSourceName = " + this.uzCIH);
            return 0L;
        }
        return dataSource.valueOf();
    }

    public final void setTitle(java.lang.String str) {
        C36246oUr.copydefault().getNewProxyInstance(str);
    }

    public final void setMoneySymbol(java.lang.String str) {
        C36246oUr.copydefault().ejfBZ(str);
    }

    public final void setFutures(boolean z) {
        C36246oUr.copydefault().DbNXlk(z);
    }

    public final void setFuturesWithOutOption(boolean z) {
        C36246oUr.copydefault().gEmmrt(z);
    }

    public final void setConvertCNY(boolean z) {
        C36246oUr.copydefault().AYXKKw(z);
    }

    public final void setUsdCnyRate(double d) {
        C36246oUr.copydefault().KWHzl(d);
    }

    public final void setCoinVol(int i) {
        C36246oUr.copydefault().KWHzl(i);
    }

    public void setChartStyle(int i) {
        C36246oUr.copydefault().AEQbTJ(this.uzCIH, i);
    }

    public void setPriceFractionDigits(int i) {
        C36246oUr.copydefault().DbNXlk(i);
    }

    public TemplateSetting wlaJM() {
        return C36246oUr.copydefault().KWHzl(this.uzCIH);
    }

    public TemplateSetting KWHzl(boolean z) {
        return C36246oUr.copydefault().EZpvd(this.uzCIH, z);
    }

    public boolean djBIcL(java.lang.String str) {
        if (!C36246oUr.copydefault().isConnected(str, this.uzCIH)) {
            return false;
        }
        QfsBiF();
        C36246oUr.copydefault().AhwBna(this.uzCIH);
        invalidate();
        return true;
    }

    public void setLightThemeBackground(@androidx.annotation.ColorInt int i) {
        oWK owkWlaJM;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        oUE oueIwGUEr = c36246oUrCopydefault.iwGUEr();
        if (oueIwGUEr == null || (owkWlaJM = oueIwGUEr.wlaJM()) == null) {
            return;
        }
        owkWlaJM.AEQbTJ(i);
        c36246oUrCopydefault.AhwBna(this.uzCIH);
        invalidate();
    }

    public void setDarkThemeBackground(@androidx.annotation.ColorInt int i) {
        oWK newProxyInstance;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        oUE oueIwGUEr = c36246oUrCopydefault.iwGUEr();
        if (oueIwGUEr == null || (newProxyInstance = oueIwGUEr.getNewProxyInstance()) == null) {
            return;
        }
        newProxyInstance.AEQbTJ(i);
        c36246oUrCopydefault.AhwBna(this.uzCIH);
        invalidate();
    }

    public void QfsBiF() {
        C36246oUr.copydefault().djBIcL(this.uzCIH);
    }

    public C36250oUv(android.content.Context context) {
        super(context);
        this.uzCIH = "ds0";
        this.zuBGHE = C36312oXc.AEQbTJ(this);
        this.AwvSrB = null;
        this.sSMYrx = android.animation.ValueAnimator.ofFloat(0.1f, 1.0f);
        this.AhwBna = 250L;
        this.fetchVPNInfo = null;
        this.fIwbmz = null;
        this.fJNWhG = null;
        this.AxsJAY = null;
        this.AuCTel = null;
        this.gHZMYf = null;
        this.zsXlph = null;
        this.getFieldNames = null;
        this.gEmmrt = null;
        this.isConnected = null;
        this.DbNXlk = null;
        this.AkhnZx = null;
        this.wlaJM = 0;
        this.iwGUEr = 0;
        this.getNewProxyInstance = true;
        this.AubY = true;
        this.zLjUOn = false;
        this.AuCTelauCTel = false;
        this.values = new ChartViewOutSideConfig();
        this.sSMYrx.setDuration(this.AhwBna);
        this.sSMYrx.setInterpolator(new android.view.animation.LinearInterpolator());
        this.sSMYrx.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.oUv.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C36246oUr.copydefault().iwGUEr().EZpvd(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                C36250oUv.this.invalidate();
            }
        });
        this.sSMYrx.addListener(new Animator.AnimatorListener() { // from class: o.oUv.5
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.okinc.kline.library.data.DataSource dataSource = C36250oUv.this.ejfBZ().get(C36250oUv.this.uzCIH);
                if (dataSource != null) {
                    C36246oUr.copydefault().iwGUEr().AEQbTJ(dataSource.AkhnZx());
                }
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: o.oUv.3
            /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (C36250oUv.this.valueOf != null) {
                        C36250oUv.this.valueOf.setViewPagerScroll(false);
                    }
                } else if (action == 1) {
                    if (C36250oUv.this.valueOf != null) {
                        C36250oUv.this.valueOf.setViewPagerScroll(true);
                    }
                    C36250oUv.this.EZpvd(false);
                } else if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                            }
                        }
                    }
                }
                if (C36250oUv.this.ejfBZ().get(C36250oUv.this.uzCIH) == null || C36250oUv.this.ejfBZ().get(C36250oUv.this.uzCIH).AEQbTJ.size() == 0) {
                    return true;
                }
                C36250oUv.this.fARcdN.onTouchEvent(motionEvent);
                return C36250oUv.this.zuBGHE.fARcdN(motionEvent);
            }
        });
        setLongClickable(true);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: o.oUv.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(android.view.View view) {
                return C36250oUv.this.zuBGHE.AEQbTJ();
            }
        });
    }

    public C36250oUv(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.uzCIH = "ds0";
        this.zuBGHE = C36312oXc.AEQbTJ(this);
        this.AwvSrB = null;
        this.sSMYrx = android.animation.ValueAnimator.ofFloat(0.1f, 1.0f);
        this.AhwBna = 250L;
        this.fetchVPNInfo = null;
        this.fIwbmz = null;
        this.fJNWhG = null;
        this.AxsJAY = null;
        this.AuCTel = null;
        this.gHZMYf = null;
        this.zsXlph = null;
        this.getFieldNames = null;
        this.gEmmrt = null;
        this.isConnected = null;
        this.DbNXlk = null;
        this.AkhnZx = null;
        this.wlaJM = 0;
        this.iwGUEr = 0;
        this.getNewProxyInstance = true;
        this.AubY = true;
        this.zLjUOn = false;
        this.AuCTelauCTel = false;
        this.values = new ChartViewOutSideConfig();
        this.sSMYrx.setDuration(this.AhwBna);
        this.sSMYrx.setInterpolator(new android.view.animation.LinearInterpolator());
        this.sSMYrx.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.oUv.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C36246oUr.copydefault().iwGUEr().EZpvd(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
                C36250oUv.this.invalidate();
            }
        });
        this.sSMYrx.addListener(new Animator.AnimatorListener() { // from class: o.oUv.5
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                com.okinc.kline.library.data.DataSource dataSource = C36250oUv.this.ejfBZ().get(C36250oUv.this.uzCIH);
                if (dataSource != null) {
                    C36246oUr.copydefault().iwGUEr().AEQbTJ(dataSource.AkhnZx());
                }
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: o.oUv.3
            /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    if (C36250oUv.this.valueOf != null) {
                        C36250oUv.this.valueOf.setViewPagerScroll(false);
                    }
                } else if (action == 1) {
                    if (C36250oUv.this.valueOf != null) {
                        C36250oUv.this.valueOf.setViewPagerScroll(true);
                    }
                    C36250oUv.this.EZpvd(false);
                } else if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                            }
                        }
                    }
                }
                if (C36250oUv.this.ejfBZ().get(C36250oUv.this.uzCIH) == null || C36250oUv.this.ejfBZ().get(C36250oUv.this.uzCIH).AEQbTJ.size() == 0) {
                    return true;
                }
                C36250oUv.this.fARcdN.onTouchEvent(motionEvent);
                return C36250oUv.this.zuBGHE.fARcdN(motionEvent);
            }
        });
        setLongClickable(true);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: o.oUv.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(android.view.View view) {
                return C36250oUv.this.zuBGHE.AEQbTJ();
            }
        });
        this.fARcdN = new android.view.GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: o.oUv.4
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(@androidx.annotation.NonNull android.view.MotionEvent motionEvent) {
                return super.onSingleTapConfirmed(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(@androidx.annotation.NonNull android.view.MotionEvent motionEvent) {
                RectF rectFSSMYrx = C36246oUr.copydefault().iwGUEr().sSMYrx();
                if (rectFSSMYrx != null && rectFSSMYrx.contains(motionEvent.getX(), motionEvent.getY())) {
                    if (C36246oUr.copydefault().gHZMYf().equals("YScale")) {
                        C36246oUr.copydefault().DbNXlk("NORMAL");
                        java.util.HashMap map = new java.util.HashMap();
                        map.put("reset_type", "double_click");
                        C32866mlf.EZpvd("KLine_Yaxis_Reset_Click", map);
                        C36250oUv.this.invalidate();
                        return true;
                    }
                } else if (C36250oUv.this.AuCTelauCTel && C36246oUr.copydefault().OHqIaq() && DrawLineData.copydefault.OLrzqt() == null) {
                    if (C36250oUv.this.iwGUEr == 0) {
                        C36246oUr.copydefault().AEQbTJ((RectF) null);
                        RxBus.KWHzl("kline_portrait_full_screen_double_click");
                    } else if (C36250oUv.this.iwGUEr == 1 && !(C36250oUv.this.zuBGHE.isConnected() instanceof C36316oXg)) {
                        C36246oUr.copydefault().AEQbTJ((RectF) null);
                        RxBus.KWHzl("kline_portrait_normal_double_click");
                        java.util.HashMap map2 = new java.util.HashMap();
                        map2.put("chart_size_swtich_click", "to_classic_double_click");
                        C32866mlf.EZpvd("KLine_Full_Button_Click", map2);
                    }
                }
                return true;
            }
        });
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C32392mcI.Fragment.EZpvd);
            if (typedArrayObtainStyledAttributes.hasValue(C32392mcI.Fragment.KWHzl)) {
                this.wlaJM = typedArrayObtainStyledAttributes.getInt(C32392mcI.Fragment.KWHzl, 0);
            }
            if (typedArrayObtainStyledAttributes.hasValue(C32392mcI.Fragment.OLrzqt)) {
                this.AubY = typedArrayObtainStyledAttributes.getBoolean(C32392mcI.Fragment.OLrzqt, true);
            }
            if (typedArrayObtainStyledAttributes.hasValue(C32392mcI.Fragment.copydefault)) {
                this.zLjUOn = typedArrayObtainStyledAttributes.getBoolean(C32392mcI.Fragment.copydefault, false);
            }
            if (typedArrayObtainStyledAttributes.hasValue(C32392mcI.Fragment.valueOf)) {
                this.iwGUEr = typedArrayObtainStyledAttributes.getInt(C32392mcI.Fragment.valueOf, 0);
            }
            if (typedArrayObtainStyledAttributes.hasValue(C32392mcI.Fragment.AEQbTJ)) {
                this.getNewProxyInstance = typedArrayObtainStyledAttributes.getBoolean(C32392mcI.Fragment.AEQbTJ, true);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void OLrzqt(ChartViewOutSideConfig chartViewOutSideConfig) {
        if (chartViewOutSideConfig == null) {
            return;
        }
        if (chartViewOutSideConfig.getChartFromType().isEmpty()) {
            if (this.wlaJM == 0) {
                chartViewOutSideConfig.setChartFromType("cefi");
            } else {
                chartViewOutSideConfig.setChartFromType("");
            }
        }
        if (chartViewOutSideConfig.getChartMode() == -1) {
            int i = this.iwGUEr;
            if (i == 0) {
                this.values.setChartYAxisNum(5);
                this.values.setChartMode(0);
                chartViewOutSideConfig.setChartMode(0);
                chartViewOutSideConfig.setChartYAxisNum(5);
                C36246oUr.copydefault().KWHzl(true);
            } else if (i == 1) {
                this.values.setChartYAxisNum(10);
                this.values.setChartMode(1);
                chartViewOutSideConfig.setChartMode(1);
                chartViewOutSideConfig.setChartYAxisNum(10);
                C36246oUr.copydefault().KWHzl(false);
            }
            if (this.zLjUOn) {
                this.values.setChartMode(2);
                chartViewOutSideConfig.setChartMode(2);
            }
        } else if (chartViewOutSideConfig.getChartMode() == 0) {
            C36246oUr.copydefault().KWHzl(true);
        } else if (chartViewOutSideConfig.getChartMode() == 1) {
            C36246oUr.copydefault().KWHzl(false);
        }
        if ((chartViewOutSideConfig.getChartTag().isEmpty() || chartViewOutSideConfig.getMode().isEmpty()) && C34703nhO.AhwBna(getContext())) {
            throw new java.lang.RuntimeException("must set chartTag or mode");
        }
        C36246oUr.copydefault().zsXlph(this.AubY);
        C36246oUr.copydefault().iwGUEr().valueOf(false);
        pDT.StateListAnimator stateListAnimator = pDT.Companion;
        pDT pdtKWHzl = stateListAnimator.KWHzl();
        pEM pem = pEM.AEQbTJ;
        chartViewOutSideConfig.setMCandleRiseColor(pdtKWHzl.copydefault(pem.copydefault()));
        chartViewOutSideConfig.setMCandleDownColor(stateListAnimator.KWHzl().copydefault(pem.KWHzl()));
        C36246oUr.copydefault().copydefault(chartViewOutSideConfig);
        C36246oUr.copydefault().zLjUOn().getChartTag();
        C36246oUr.copydefault().zLjUOn().getMode();
        if (chartViewOutSideConfig.getChartMode() == 2) {
            sSMYrx();
        } else {
            aKErDB();
        }
        if (!chartViewOutSideConfig.getMode().equals("social_trading_mode") && !chartViewOutSideConfig.getMode().equals("nft_mode")) {
            C37883pEf c37883pEf = new C37883pEf(this);
            c37883pEf.AEQbTJ(this, C36246oUr.copydefault().zLjUOn());
            c37883pEf.AEQbTJ(this);
        }
        if (chartViewOutSideConfig.getMode().equals("pro_mode") || chartViewOutSideConfig.getMode().equals("lite_mode")) {
            chartViewOutSideConfig.setSupportDragOrder(true);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C36246oUr.copydefault().iwGUEr().KWHzl(true);
        QfsBiF();
    }

    public void RJOkX() {
        android.graphics.Bitmap bitmap = this.ejfBZ;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.ejfBZ.recycle();
            this.ejfBZ = null;
        }
        this.hDKMBd = null;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (zLjUOn().get(this.uzCIH) != null) {
            zLjUOn().get(this.uzCIH).copydefault(true);
        }
        android.graphics.Bitmap bitmap = this.ejfBZ;
        if (bitmap != null) {
            bitmap.getWidth();
        }
        android.graphics.Bitmap bitmap2 = this.ejfBZ;
        if (bitmap2 != null) {
            bitmap2.getHeight();
        }
        try {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas();
            canvas.setBitmap(bitmapCreateBitmap);
            android.graphics.Bitmap bitmap3 = this.ejfBZ;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (android.graphics.Paint) null);
            }
            this.ejfBZ = bitmapCreateBitmap;
            this.hDKMBd = canvas;
            if (bitmap3 == null || bitmap3.isRecycled()) {
                return;
            }
            bitmap3.recycle();
        } catch (java.lang.Throwable th) {
            this.ejfBZ = null;
            this.hDKMBd = null;
            pUU.KWHzl("ChartView", "onSizeChanged: " + th.toString());
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        if (c36246oUrCopydefault.zLjUOn().getThemes().get(this.uzCIH) == null) {
            pUU.KWHzl("ChartView", "onDraw: mgr.Themes.get(mDataSourceName) == null, mDataSourceName = " + this.uzCIH + "Themes = " + c36246oUrCopydefault.zLjUOn().getThemes());
            return;
        }
        android.graphics.Bitmap bitmap = this.ejfBZ;
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                OLrzqt(this.uzCIH, 0, 0, getWidth(), getHeight());
                canvas.drawBitmap(this.ejfBZ, 0.0f, 0.0f, (android.graphics.Paint) null);
                copydefault(this.uzCIH, canvas);
                KWHzl(this.uzCIH, this.hDKMBd);
                return;
            } catch (java.lang.Exception e) {
                if (ejfBZ().get(this.uzCIH) != null) {
                    ejfBZ().get(this.uzCIH).KWHzl();
                }
                pUU.copydefault("ChartView", "onDraw: " + e.getMessage());
                return;
            }
        }
        OLrzqt(this.uzCIH, 0, 0, getWidth(), getHeight());
        AEQbTJ(this.uzCIH, canvas);
    }

    public void OLrzqt(java.util.List<HistoryOrderData> list, java.lang.Boolean bool) {
        try {
            C36246oUr.copydefault().EZpvd(this.uzCIH, list, bool);
        } catch (java.lang.Exception e) {
            com.okinc.kline.library.data.DataSource dataSource = ejfBZ().get(this.uzCIH);
            if (dataSource != null) {
                dataSource.KWHzl();
            }
            pUU.copydefault("ChartView", "addHistoryOrderData: " + e.toString());
        }
        invalidate();
    }

    public void copydefault(java.util.List<HistoryOrderData> list) {
        try {
            C36246oUr.copydefault().EZpvd(this.uzCIH, list, java.lang.Boolean.FALSE);
        } catch (java.lang.Exception e) {
            com.okinc.kline.library.data.DataSource dataSource = ejfBZ().get(this.uzCIH);
            if (dataSource != null) {
                dataSource.KWHzl();
            }
            pUU.copydefault("ChartView", "refreshHistoryOrderData: " + e.toString());
        }
        invalidate();
    }

    public void EZpvd(java.util.List<oUF> list, java.lang.String str) {
        try {
            C36246oUr.copydefault().KWHzl(this.uzCIH, list, str);
        } catch (java.lang.Exception e) {
            new java.lang.Exception("KlineAPITetException:updateFutureSubIndicator:" + e.getMessage());
            pUU.copydefault("ChartView", "updateFutureSubIndicator: " + e.toString());
        }
        invalidate();
    }

    public void AEQbTJ(java.util.List<? extends oUO> list) {
        if (list == null || list.isEmpty()) {
            invalidate();
            return;
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        try {
            c36246oUrCopydefault.copydefault(this.uzCIH, list);
            QKVWgx();
            if (zLjUOn().get(fIwbmz()).ejfBZ() == zLjUOn().get(fIwbmz()).AuCTel() && c36246oUrCopydefault.iwGUEr().ejfBZ() != ejfBZ().get(this.uzCIH).AkhnZx() && c36246oUrCopydefault.ODWQjV() != 0) {
                this.sSMYrx.cancel();
                this.sSMYrx.start();
            } else {
                C36246oUr.copydefault().iwGUEr().EZpvd(1.0f);
            }
        } catch (java.lang.Exception e) {
            com.okinc.kline.library.data.DataSource dataSource = ejfBZ().get(this.uzCIH);
            if (dataSource != null) {
                dataSource.KWHzl();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("KlineAPITetException:update:");
            sb.append(e.toString());
            sb.append(" mgr.Timelines.size = ");
            sb.append(zLjUOn().size());
            sb.append(" mgr.Timelines = ");
            sb.append(zLjUOn().toString());
            sb.append(" mgr.Timelines.get(getDataSourceName()) == null : ");
            sb.append(zLjUOn().get(fIwbmz()));
            pUU.AEQbTJ("ChartView", java.lang.Boolean.valueOf(sb.toString() == null));
        }
        invalidate();
    }

    public void AEQbTJ(java.lang.String str, java.util.List<? extends oUO> list) {
        try {
            C36246oUr.copydefault().copydefault(this.uzCIH, list, str);
        } catch (java.lang.Exception e) {
            pUU.copydefault("ChartView", "updateCompare: " + e.toString());
        }
    }

    public void KWHzl(java.util.List<? extends oUO> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        try {
            c36246oUrCopydefault.AEQbTJ(this.uzCIH, list);
        } catch (java.lang.Exception e) {
            pUU.copydefault("ChartView", "addHistoryCandlesData: " + e.toString());
        }
        invalidate();
        oWN own = zLjUOn().get(fIwbmz());
        if (own == null || own.isConnected() != 0 || c36246oUrCopydefault.zLjUOn().isHistoryCandlesLoading()) {
            return;
        }
        DTwDnp();
    }

    public void OLrzqt(java.util.List<? extends oUO> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        try {
            c36246oUrCopydefault.KWHzl(this.uzCIH, list);
        } catch (java.lang.Exception e) {
            pUU.copydefault("ChartView", "addRightHistoryCandlesData: " + e);
        }
        invalidate();
        oWN own = zLjUOn().get(fIwbmz());
        if (own == null || own.ejfBZ() != own.AuCTel() || c36246oUrCopydefault.zLjUOn().isRightHistoryCandlesLoading()) {
            return;
        }
        ORxRYg();
    }

    public void EZpvd(boolean z) {
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setMainIndicator(java.lang.String str) {
        try {
            C36246oUr.copydefault().AhwBna(this.uzCIH, str);
        } catch (java.lang.IllegalArgumentException unused) {
            C36246oUr.copydefault().AYXKKw(this.uzCIH, str);
        }
        invalidate();
    }

    public void setCompareIndicator(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        try {
            C36246oUr.copydefault().AEQbTJ(this.uzCIH, list, list2);
        } catch (java.lang.IllegalArgumentException e) {
            C36246oUr.copydefault().gEmmrt(this.uzCIH);
            pUU.copydefault("ChartView", "setCompareIndicator:" + e.getMessage());
        }
        invalidate();
    }

    public void djSkpj() {
        try {
            C36246oUr.copydefault().gEmmrt(this.uzCIH);
        } catch (java.lang.IllegalArgumentException e) {
            pUU.copydefault("ChartView", "removeCompareIndicator:" + e.getMessage());
        }
    }

    public void AEQbTJ(AbstractC36262oVg abstractC36262oVg) {
        C36246oUr.copydefault().OLrzqt(this.uzCIH, abstractC36262oVg);
        invalidate();
    }

    public void OLrzqt(AbstractC36262oVg abstractC36262oVg) {
        C36246oUr.copydefault().AEQbTJ(this.uzCIH, abstractC36262oVg);
        invalidate();
    }

    public void copydefault(AbstractC36262oVg abstractC36262oVg) {
        C36246oUr.copydefault().copydefault(this.uzCIH, abstractC36262oVg);
        invalidate();
    }

    public void dNCPSb() {
        C36246oUr.copydefault().fetchVPNInfo(this.uzCIH);
        invalidate();
    }

    public void OLrzqt(java.lang.String str) {
        C36246oUr.copydefault().AYXKKw(this.uzCIH, str);
        invalidate();
    }

    public void copydefault(java.lang.String str) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        java.lang.String strAEQbTJ = c36246oUrCopydefault.AEQbTJ(this.uzCIH);
        java.lang.String strOLrzqt = c36246oUrCopydefault.OLrzqt(this.uzCIH, str);
        int iCopydefault = c36246oUrCopydefault.copydefault(this.uzCIH);
        if (strOLrzqt == null) {
            if (iCopydefault == oWJ.copydefault) {
                c36246oUrCopydefault.AEQbTJ(strAEQbTJ, java.lang.Boolean.FALSE);
            }
            oWJ.KWHzl(this.uzCIH, str);
            c36246oUrCopydefault.AhwBna(this.uzCIH);
        }
        invalidate();
    }

    public void gEmmrt(java.lang.String str) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        c36246oUrCopydefault.AEQbTJ(c36246oUrCopydefault.OLrzqt(this.uzCIH, str), java.lang.Boolean.FALSE);
        invalidate();
    }

    public void EZpvd(java.lang.String str) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        c36246oUrCopydefault.AEQbTJ(c36246oUrCopydefault.OLrzqt(this.uzCIH, str), java.lang.Boolean.TRUE);
        invalidate();
    }

    public void AwvSrB() {
        EZpvd("VOLUME");
    }

    public void fZBcTu() {
        wlaJM().addSideIndicator("VOLUME");
        copydefault("VOLUME");
    }

    public int copydefault(boolean z) {
        int iMin = java.lang.Math.min(wlaJM().getRealSubIndicators().size(), 4) * C36246oUr.copydefault().accept();
        if (z) {
            gHZMYf();
            sSMYrx();
            setMinimumHeight(getMinimumHeight() - iMin);
        } else {
            QOLQEE();
            setMinimumHeight(getMinimumHeight() + iMin);
        }
        return iMin;
    }

    public void gHZMYf() {
        java.util.ArrayList<java.lang.String> realSubIndicators = wlaJM().getRealSubIndicators();
        if (realSubIndicators == null || realSubIndicators.size() <= 0) {
            return;
        }
        for (int i = 0; i < realSubIndicators.size(); i++) {
            EZpvd(realSubIndicators.get(i));
        }
    }

    public void sSMYrx() {
        if (wlaJM().getRealMainIndicators().contains("VOLUME")) {
            C36246oUr.copydefault().AYXKKw(this.uzCIH, "VOLUME");
        }
    }

    public void aKErDB() {
        if (wlaJM().getMainIndicatorNames().contains("VOLUME")) {
            try {
                C36246oUr.copydefault().AhwBna(this.uzCIH, "VOLUME");
            } catch (java.lang.IllegalArgumentException unused) {
                C36246oUr.copydefault().AYXKKw(this.uzCIH, "VOLUME");
            }
        }
    }

    public void QOLQEE() {
        java.util.ArrayList<java.lang.String> sideIndicatorNames = wlaJM().getSideIndicatorNames();
        if (sideIndicatorNames.size() <= 0) {
            return;
        }
        for (int i = 0; i < sideIndicatorNames.size(); i++) {
            copydefault(sideIndicatorNames.get(i));
        }
    }

    public final void OLrzqt(java.lang.String str, int i, int i2, int i3, int i4) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        oVT ovt = c36246oUrCopydefault.iwGUEr().values().get(str + ".root");
        if (ovt == null) {
            pUU.copydefault("ChartView", "ChartManager:layout: frame = null");
            return;
        }
        ovt.OLrzqt(i3 - i, i4 - i2);
        ovt.EZpvd(i, i2, i3, i4);
        zLjUOn().get(str).gHZMYf();
        c36246oUrCopydefault.hDKMBd(str);
    }

    public void copydefault(java.lang.String str, android.graphics.Canvas canvas) {
        C36246oUr.copydefault();
        for (ChartArea chartArea : values().values()) {
            if ((chartArea instanceof oVT) && chartArea.copydefault().equals(str)) {
                ((oVT) chartArea).OLrzqt(canvas);
            }
        }
        for (ChartArea chartArea2 : values().values()) {
            if (!chartArea2.AEQbTJ().equals("ds0.m") && chartArea2.copydefault().equals(str)) {
                OLrzqt(chartArea2, canvas);
            }
        }
        OLrzqt(values().get("ds0.m"), canvas);
    }

    public final void OLrzqt(ChartArea chartArea, android.graphics.Canvas canvas) {
        if (chartArea == null) {
            return;
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        com.okinc.kline.library.data.DataSource dataSource = ejfBZ().get(chartArea.copydefault());
        oWN own = zLjUOn().get(chartArea.copydefault());
        if (dataSource == null || dataSource.gEmmrt() <= 0 || own == null || own.AuCTel() <= 0) {
            return;
        }
        if (c36246oUrCopydefault.fZBcTu().equals("pro_mode")) {
            copydefault(chartArea.AEQbTJ(), djBIcL, canvas);
        } else if (c36246oUrCopydefault.fZBcTu().equals("lite_mode")) {
            copydefault(chartArea.AEQbTJ(), AYXKKw, canvas);
        } else {
            copydefault(chartArea.AEQbTJ(), AEQbTJ, canvas);
        }
    }

    public final void copydefault(java.lang.String str, java.lang.String[] strArr, android.graphics.Canvas canvas) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        for (java.lang.String str2 : strArr) {
            AbstractC36302oWt abstractC36302oWt = c36246oUrCopydefault.copydefault.get(str + str2);
            if (abstractC36302oWt != null) {
                Application application = this.AkhnZx;
                if (application != null) {
                    application.copydefault(abstractC36302oWt);
                }
                abstractC36302oWt.AEQbTJ(canvas);
            }
            if (str2.equals(".s")) {
                java.util.Iterator<java.lang.String> it = c36246oUrCopydefault.KWHzl(this.uzCIH).getMainIndicatorNames().iterator();
                while (it.hasNext()) {
                    AbstractC36302oWt abstractC36302oWt2 = c36246oUrCopydefault.copydefault.get(str + str2 + JwtUtilsKt.JWT_DELIMITER + it.next());
                    if (abstractC36302oWt2 != null) {
                        Application application2 = this.AkhnZx;
                        if (application2 != null) {
                            application2.copydefault(abstractC36302oWt2);
                        }
                        abstractC36302oWt2.AEQbTJ(canvas);
                    }
                }
                AbstractC36302oWt abstractC36302oWt3 = c36246oUrCopydefault.copydefault.get(str + str2 + ".compare");
                if (abstractC36302oWt3 != null) {
                    abstractC36302oWt3.AEQbTJ(canvas);
                }
            }
        }
    }

    public void KWHzl(java.lang.String str, android.graphics.Canvas canvas) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        for (ChartArea chartArea : values().values()) {
            if (chartArea.copydefault().equals(str)) {
                KWHzl(chartArea, canvas);
                chartArea.OLrzqt(false);
            }
        }
        for (oWC owc : c36246oUrCopydefault.iwGUEr().QVAiDq().values()) {
            if (owc.copydefault().equals(str)) {
                owc.AEQbTJ(false);
            }
        }
        if (zLjUOn().get(str) != null) {
            zLjUOn().get(str).KWHzl(false);
        }
    }

    public final void KWHzl(ChartArea chartArea, android.graphics.Canvas canvas) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        com.okinc.kline.library.data.DataSource dataSource = ejfBZ().get(chartArea.copydefault());
        oWN own = zLjUOn().get(chartArea.copydefault());
        if (dataSource == null || dataSource.gEmmrt() < 1 || own.AuCTel() <= 0) {
            copydefault(chartArea.AEQbTJ(), copydefault, canvas);
            if (c36246oUrCopydefault.DGOPHZ().booleanValue()) {
                copydefault(chartArea.AEQbTJ(), EZpvd, canvas);
            }
        } else if (c36246oUrCopydefault.aUsmxb()) {
            copydefault(chartArea.AEQbTJ(), KWHzl, canvas);
        } else {
            copydefault(chartArea.AEQbTJ(), OLrzqt, canvas);
        }
        chartArea.OLrzqt(false);
    }

    public void AEQbTJ(java.lang.String str, android.graphics.Canvas canvas) {
        copydefault(str, canvas);
        KWHzl(str, canvas);
    }

    public void QKVWgx() {
        InterfaceC58217yxC interfaceC58217yxC = this.AwvSrB;
        if ((interfaceC58217yxC == null || interfaceC58217yxC.isDisposed()) && C36246oUr.copydefault().finit() != null) {
            int sPTimeInterval = wlaJM().getSPTimeInterval();
            if (sPTimeInterval < 0) {
                sPTimeInterval = 1;
            }
            long jDxcTrN = dxcTrN();
            if (jDxcTrN <= 0) {
                return;
            }
            long[] jArr = {C37879pEb.KWHzl.AEQbTJ(sPTimeInterval, jDxcTrN)};
            InterfaceC58217yxC interfaceC58217yxC2 = this.AwvSrB;
            if (interfaceC58217yxC2 != null) {
                interfaceC58217yxC2.dispose();
            }
            long j = jArr[0];
            if (j > 0) {
                KWHzl(j);
                this.AwvSrB = AbstractC58247yxg.interval(0L, 1L, java.util.concurrent.TimeUnit.SECONDS).take(jArr[0]).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt()).subscribe(new InterfaceC58227yxM<java.lang.Long>(sPTimeInterval, jArr) { // from class: o.oUv.6
                    public final /* synthetic */ long[] AEQbTJ;
                    public final /* synthetic */ int OLrzqt;
                    public final int copydefault;

                    /* JADX DEBUG: Incorrect args count in method signature: ()V */
                    {
                        this.OLrzqt = sPTimeInterval;
                        this.AEQbTJ = jArr;
                        this.copydefault = sPTimeInterval;
                    }

                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public void accept(java.lang.Long l) throws java.lang.Exception {
                        if (C36250oUv.this.AwvSrB == null || C36250oUv.this.AwvSrB.isDisposed() || this.copydefault != this.OLrzqt) {
                            return;
                        }
                        long[] jArr2 = this.AEQbTJ;
                        long j2 = jArr2[0] - 1;
                        jArr2[0] = j2;
                        C36250oUv.this.KWHzl(j2);
                        C36250oUv.this.invalidate();
                        if (this.AEQbTJ[0] == 0) {
                            RxBus.KWHzl("KLINE_WS_STATUS");
                        }
                    }
                });
            } else {
                C36246oUr.copydefault().iwGUEr().OLrzqt("00:00");
                invalidate();
            }
        }
    }

    private long dxcTrN() {
        ChartViewOutSideConfig chartViewOutSideConfigZLjUOn = C36246oUr.copydefault().zLjUOn();
        if (chartViewOutSideConfigZLjUOn.isFastKLineMode()) {
            if (chartViewOutSideConfigZLjUOn.getLastCandleItem() != null) {
                return chartViewOutSideConfigZLjUOn.getLastCandleItem().EZpvd;
            }
            return -1L;
        }
        return getFieldNames();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KWHzl(long j) {
        C36246oUr.copydefault().iwGUEr().OLrzqt(C37879pEb.KWHzl.EZpvd(j));
    }

    public void QUSxYX() {
        InterfaceC58217yxC interfaceC58217yxC = this.AwvSrB;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public void RcXXUw() {
        InterfaceC58217yxC interfaceC58217yxC = this.AwvSrB;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
            this.AwvSrB = null;
            C36246oUr.copydefault().isConnected();
        }
    }

    public void OLrzqt() {
        if (this.sSMYrx.isRunning()) {
            this.sSMYrx.cancel();
        }
    }

    public void copydefault(KlineOpenOrderBean klineOpenOrderBean) {
        InterfaceC36253oUy interfaceC36253oUy = this.gHZMYf;
        if (interfaceC36253oUy != null) {
            interfaceC36253oUy.EZpvd(klineOpenOrderBean);
        }
    }

    public void AYXKKw(KlineOpenOrderBean klineOpenOrderBean) {
        InterfaceC36253oUy interfaceC36253oUy = this.gHZMYf;
        if (interfaceC36253oUy != null) {
            interfaceC36253oUy.AhwBna(klineOpenOrderBean);
        }
    }

    public void AEQbTJ(KlineOpenOrderBean klineOpenOrderBean) {
        InterfaceC36253oUy interfaceC36253oUy = this.gHZMYf;
        if (interfaceC36253oUy != null) {
            interfaceC36253oUy.OLrzqt(klineOpenOrderBean);
        }
    }

    public void OLrzqt(KlineOpenOrderBean klineOpenOrderBean) {
        InterfaceC36253oUy interfaceC36253oUy = this.gHZMYf;
        if (interfaceC36253oUy != null) {
            interfaceC36253oUy.AEQbTJ(klineOpenOrderBean);
        }
    }

    public void EZpvd(@androidx.annotation.NonNull KlineOpenOrderBean klineOpenOrderBean) {
        InterfaceC36253oUy interfaceC36253oUy = this.gHZMYf;
        if (interfaceC36253oUy != null) {
            interfaceC36253oUy.KWHzl(klineOpenOrderBean);
        }
    }

    public void KWHzl(@androidx.annotation.NonNull InterfaceC39510pth interfaceC39510pth) {
        InterfaceC36253oUy interfaceC36253oUy = this.gHZMYf;
        if (interfaceC36253oUy != null) {
            interfaceC36253oUy.EZpvd(interfaceC39510pth);
        }
    }

    public void EZpvd(@androidx.annotation.NonNull InterfaceC39510pth interfaceC39510pth) {
        InterfaceC36253oUy interfaceC36253oUy = this.gHZMYf;
        if (interfaceC36253oUy != null) {
            interfaceC36253oUy.AEQbTJ(interfaceC39510pth);
        }
    }

    public void copydefault(@androidx.annotation.NonNull KlineOpenOrderBean klineOpenOrderBean, @androidx.annotation.NonNull java.lang.String str, boolean z, boolean z2, int i) {
        InterfaceC36253oUy interfaceC36253oUy = this.gHZMYf;
        if (interfaceC36253oUy != null) {
            interfaceC36253oUy.AEQbTJ(klineOpenOrderBean, str, z, z2, i);
        }
    }

    public void dvKsVJ() {
        InterfaceC36253oUy interfaceC36253oUy = this.gHZMYf;
        if (interfaceC36253oUy != null) {
            interfaceC36253oUy.AEQbTJ();
        }
    }

    public void KWHzl(@androidx.annotation.NonNull KlineOpenOrderBean klineOpenOrderBean) {
        InterfaceC36253oUy interfaceC36253oUy = this.gHZMYf;
        if (interfaceC36253oUy != null) {
            interfaceC36253oUy.copydefault(klineOpenOrderBean);
        }
    }

    public void QbewEr() {
        Dialog dialog = this.AuCTel;
        if (dialog != null) {
            dialog.EZpvd();
        }
    }

    public void gEmmrt() {
        Activity activity = this.getFieldNames;
        if (activity != null) {
            activity.EZpvd();
        }
    }

    public void KWHzl(int i) {
        Activity activity = this.getFieldNames;
        if (activity != null) {
            activity.KWHzl(i);
        }
    }

    public void KWHzl(@androidx.annotation.NonNull java.lang.String str) {
        Dialog dialog = this.AuCTel;
        if (dialog != null) {
            dialog.EZpvd(str);
        }
    }

    public void QVAiDq() {
        Dialog dialog = this.AuCTel;
        if (dialog != null) {
            dialog.AEQbTJ();
        }
    }

    public void AEQbTJ(@androidx.annotation.NonNull KlineSpotAverageBean klineSpotAverageBean, KlineOpenOrderBean klineOpenOrderBean) {
        InterfaceC36253oUy interfaceC36253oUy = this.gHZMYf;
        if (interfaceC36253oUy != null) {
            interfaceC36253oUy.EZpvd(klineSpotAverageBean, klineOpenOrderBean);
        }
    }

    public void OLrzqt(@androidx.annotation.NonNull KlineSpotAverageBean klineSpotAverageBean, KlineOpenOrderBean klineOpenOrderBean) {
        InterfaceC36253oUy interfaceC36253oUy = this.gHZMYf;
        if (interfaceC36253oUy != null) {
            interfaceC36253oUy.AEQbTJ(klineSpotAverageBean, klineOpenOrderBean);
        }
    }

    public void EZpvd(@androidx.annotation.NonNull KlineSpotAverageBean klineSpotAverageBean) {
        InterfaceC36253oUy interfaceC36253oUy = this.gHZMYf;
        if (interfaceC36253oUy != null) {
            interfaceC36253oUy.copydefault(klineSpotAverageBean);
        }
    }

    public void KWHzl(@androidx.annotation.NonNull oLS ols) {
        FragmentManager fragmentManager = this.zsXlph;
        if (fragmentManager != null) {
            fragmentManager.onEventClick(ols);
        }
    }

    public void KWHzl(java.lang.Float f, boolean z, boolean z2, boolean z3) {
        InterfaceC36249oUu interfaceC36249oUu = this.gEmmrt;
        if (interfaceC36249oUu != null) {
            if (z) {
                interfaceC36249oUu.AEQbTJ(f.floatValue(), z3);
            }
            if (z2) {
                this.gEmmrt.KWHzl(f.floatValue(), z3);
            }
        }
    }

    public void DTwDnp() {
        PendingIntent pendingIntent = this.fIwbmz;
        if (pendingIntent != null) {
            pendingIntent.AEQbTJ();
        }
    }

    public void ORxRYg() {
        LoaderManager loaderManager = this.fJNWhG;
        if (loaderManager != null) {
            loaderManager.AEQbTJ();
        }
    }

    public void UeEOUB() {
        Fragment fragment = this.AxsJAY;
        if (fragment != null) {
            fragment.KWHzl();
        }
    }

    public void setIsShowTimelineAreaGrid(boolean z) {
        C36246oUr.copydefault().zsXlph(z);
    }

    public void setChartHistoryOrder(boolean z) {
        C36246oUr.copydefault().AEQbTJ(z);
    }

    public void AEQbTJ(boolean z) {
        C36246oUr.copydefault().zLjUOn(z);
    }

    public void setPriceWarningDataList(java.util.List<PriceWarningItemBean> list) {
        C36246oUr.copydefault().copydefault(list);
    }

    public void setBotOrdersData(BotPendingLineVo botPendingLineVo) {
        C36246oUr.copydefault().EZpvd(botPendingLineVo);
    }

    public void setGridPriceBean(InterfaceC39506ptd interfaceC39506ptd) {
        C36246oUr.copydefault().EZpvd(interfaceC39506ptd);
    }

    public void setOpenOrderAllList(java.util.List<KlineOpenOrderBean> list) {
        if (list.isEmpty()) {
            C36246oUr.copydefault().AEQbTJ(list);
        } else if (C36246oUr.copydefault().gasjUx().isEmpty()) {
            C36246oUr.copydefault().AEQbTJ(list);
        } else {
            pFN.OLrzqt.EZpvd(list);
        }
    }

    public java.util.List<? extends InterfaceC39510pth> AubY() {
        return C36246oUr.copydefault().DCUTEI();
    }

    public void setTradePositionDataList(java.util.List<? extends InterfaceC39510pth> list) {
        if (list.isEmpty()) {
            C36246oUr.copydefault().EZpvd(list);
        } else if (C36246oUr.copydefault().DCUTEI().isEmpty()) {
            C36246oUr.copydefault().EZpvd(list);
        } else {
            pFN.OLrzqt.AEQbTJ(list);
        }
    }

    public void setQuickOrderPrice(KlineQuickOrderPriceBean klineQuickOrderPriceBean) {
        C36246oUr.copydefault().OLrzqt(klineQuickOrderPriceBean);
    }

    public void setOpenOrderDataList(java.util.List<KlineOpenOrderBean> list) {
        C36246oUr.copydefault().AEQbTJ(list);
    }

    public java.util.List<KlineOpenOrderBean> hDKMBd() {
        return C36246oUr.copydefault().gasjUx();
    }

    public void setShowEmptyUi(boolean z) {
        C36246oUr.copydefault().uzCIH(z);
    }

    public java.lang.String iwGUEr() {
        return C36246oUr.copydefault().zLjUOn().getStartTime();
    }

    public void setStartTime(java.lang.String str) {
        C36246oUr.copydefault().zLjUOn().setStartTime(str);
    }

    public java.lang.String fJNWhG() {
        return C36246oUr.copydefault().zLjUOn().getEndTime();
    }

    public void setEndTime(java.lang.String str) {
        C36246oUr.copydefault().zLjUOn().setEndTime(str);
    }

    public java.util.HashMap<java.lang.String, com.okinc.kline.library.data.DataSource> ejfBZ() {
        return C36246oUr.copydefault().zLjUOn().getDataSources();
    }

    public java.util.HashMap<java.lang.String, oWK> AuCTelauCTel() {
        return C36246oUr.copydefault().zLjUOn().getThemes();
    }

    public LinkedHashMap<java.lang.String, ChartArea> values() {
        return C36246oUr.copydefault().values();
    }

    public java.util.HashMap<java.lang.String, oWN> zLjUOn() {
        return C36246oUr.copydefault().DCJXGO();
    }

    public ChartViewOutSideConfig AkhnZx() {
        return C36246oUr.copydefault().zLjUOn();
    }

    public void djBIcL() {
        AkhnZx().getOpenOrderDataList().clear();
        AkhnZx().getTradePositionDataList().clear();
    }

    public void AhwBna() {
        copydefault();
        AkhnZx().setHistoryCandlesLoading(false);
        AkhnZx().setAmountDisplaySymbol("");
        RcXXUw();
        RJOkX();
    }

    public void AYXKKw() {
        C36246oUr.copydefault().gEmmrt();
    }

    public void copydefault() {
        C36246oUr.copydefault().OLrzqt();
    }

    public void AEQbTJ() {
        C36246oUr.copydefault().KWHzl();
    }

    public AbstractC36262oVg AEQbTJ(java.lang.String str) {
        return C36246oUr.copydefault().OLrzqt(str);
    }

    public AbstractC36262oVg OLrzqt(java.lang.String str, java.lang.String str2) {
        return C36246oUr.copydefault().AEQbTJ(str, str2);
    }

    public void KWHzl() {
        C36246oUr.copydefault().valueOf();
    }

    public void EZpvd() {
        C36246oUr.copydefault().AhwBna();
    }

    public java.lang.Boolean uzCIH() {
        return java.lang.Boolean.valueOf(this.zLjUOn);
    }
}

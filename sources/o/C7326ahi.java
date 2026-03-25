package o;

import com.bytedance.applog.encryptor.IEncryptorType;
import com.immomo.mls.NativeBridge;
import com.immomo.mls.database.MLNDatabase;
import com.immomo.mls.fun.constants.BreakMode;
import com.immomo.mls.fun.constants.ContentMode;
import com.immomo.mls.fun.constants.CrossAxisAlignType;
import com.immomo.mls.fun.constants.DrawStyle;
import com.immomo.mls.fun.constants.EditTextViewFormatterType;
import com.immomo.mls.fun.constants.EditTextViewInputMode;
import com.immomo.mls.fun.constants.FileInfo;
import com.immomo.mls.fun.constants.FillType;
import com.immomo.mls.fun.constants.FontStyle;
import com.immomo.mls.fun.constants.GradientType;
import com.immomo.mls.fun.constants.GravityConstants;
import com.immomo.mls.fun.constants.LineCap;
import com.immomo.mls.fun.constants.LinearType;
import com.immomo.mls.fun.constants.MainAxisAlignType;
import com.immomo.mls.fun.constants.MeasurementType;
import com.immomo.mls.fun.constants.NavigatorAnimType;
import com.immomo.mls.fun.constants.RectCorner;
import com.immomo.mls.fun.constants.ResultType;
import com.immomo.mls.fun.constants.ReturnType;
import com.immomo.mls.fun.constants.SafeAreaConstants;
import com.immomo.mls.fun.constants.ScreenOrientation;
import com.immomo.mls.fun.constants.ScrollDirection;
import com.immomo.mls.fun.constants.StatusBarStyle;
import com.immomo.mls.fun.constants.StatusMode;
import com.immomo.mls.fun.constants.StyleImageAlign;
import com.immomo.mls.fun.constants.TabSegmentAlignment;
import com.immomo.mls.fun.constants.TextAlign;
import com.immomo.mls.fun.constants.UnderlineStyle;
import com.immomo.mls.fun.constants.WrapType;
import com.immomo.mls.fun.globals.UDLuaView;
import com.immomo.mls.fun.java.Alert;
import com.immomo.mls.fun.java.Event;
import com.immomo.mls.fun.java.LuaDialog;
import com.immomo.mls.fun.lt.LTFile;
import com.immomo.mls.fun.lt.LTPreferenceUtils;
import com.immomo.mls.fun.lt.LTPrinter;
import com.immomo.mls.fun.lt.LTStringUtil;
import com.immomo.mls.fun.lt.LTTypeUtils;
import com.immomo.mls.fun.lt.SClipboard;
import com.immomo.mls.fun.lt.SIApplication;
import com.immomo.mls.fun.lt.SICornerRadiusManager;
import com.immomo.mls.fun.lt.SIEventCenter;
import com.immomo.mls.fun.lt.SIGlobalEvent;
import com.immomo.mls.fun.lt.SILoading;
import com.immomo.mls.fun.lt.SINavigator;
import com.immomo.mls.fun.lt.SINetworkReachability;
import com.immomo.mls.fun.lt.SISystem;
import com.immomo.mls.fun.lt.SITimeManager;
import com.immomo.mls.fun.ud.Timer;
import com.immomo.mls.fun.ud.UDArray;
import com.immomo.mls.fun.ud.UDCanvas;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.UDMap;
import com.immomo.mls.fun.ud.UDNativeLoader;
import com.immomo.mls.fun.ud.UDPaint;
import com.immomo.mls.fun.ud.UDPath;
import com.immomo.mls.fun.ud.UDPoint;
import com.immomo.mls.fun.ud.UDRect;
import com.immomo.mls.fun.ud.UDSafeAreaRect;
import com.immomo.mls.fun.ud.UDSize;
import com.immomo.mls.fun.ud.UDStyleString;
import com.immomo.mls.fun.ud.UDTickerView;
import com.immomo.mls.fun.ud.UDVideoPlayerView;
import com.immomo.mls.fun.ud.UDWindowManager;
import com.immomo.mls.fun.ud.anim.InterpolatorType;
import com.immomo.mls.fun.ud.anim.RepeatType;
import com.immomo.mls.fun.ud.anim.UDAnimator;
import com.immomo.mls.fun.ud.anim.ValueType;
import com.immomo.mls.fun.ud.anim.canvasanim.AnimationValueType;
import com.immomo.mls.fun.ud.anim.canvasanim.UDAlphaAnimation;
import com.immomo.mls.fun.ud.anim.canvasanim.UDAnimationSet;
import com.immomo.mls.fun.ud.anim.canvasanim.UDBaseAnimation;
import com.immomo.mls.fun.ud.anim.canvasanim.UDRotateAnimation;
import com.immomo.mls.fun.ud.anim.canvasanim.UDScaleAnimation;
import com.immomo.mls.fun.ud.anim.canvasanim.UDTranslateAnimation;
import com.immomo.mls.fun.ud.audio.UDAudioPlayer;
import com.immomo.mls.fun.ud.net.CachePolicy;
import com.immomo.mls.fun.ud.net.EncType;
import com.immomo.mls.fun.ud.net.ErrorKey;
import com.immomo.mls.fun.ud.net.ResponseKey;
import com.immomo.mls.fun.ud.notification.UDOkStateNotification;
import com.immomo.mls.fun.ud.okhttp.OkUDHttp;
import com.immomo.mls.fun.ud.okhttp.upload.OKMediaUploader;
import com.immomo.mls.fun.ud.socket.OKWsListenerBridge;
import com.immomo.mls.fun.ud.socket.UDWsArgV5;
import com.immomo.mls.fun.ud.socket.UDWsArgV5ForWeb3;
import com.immomo.mls.fun.ud.view.UDAppBarLayout;
import com.immomo.mls.fun.ud.view.UDBaseHVStack;
import com.immomo.mls.fun.ud.view.UDBaseStack;
import com.immomo.mls.fun.ud.view.UDCanvasView;
import com.immomo.mls.fun.ud.view.UDCoordinatorLayout;
import com.immomo.mls.fun.ud.view.UDDatePickView;
import com.immomo.mls.fun.ud.view.UDEditText;
import com.immomo.mls.fun.ud.view.UDEditTextFormatter;
import com.immomo.mls.fun.ud.view.UDHStack;
import com.immomo.mls.fun.ud.view.UDImageTitleViewPager;
import com.immomo.mls.fun.ud.view.UDImageView;
import com.immomo.mls.fun.ud.view.UDLabel;
import com.immomo.mls.fun.ud.view.UDLinearLayout;
import com.immomo.mls.fun.ud.view.UDOKMarketFeedContentView;
import com.immomo.mls.fun.ud.view.UDOKMarketHybridWebView;
import com.immomo.mls.fun.ud.view.UDPieChartView;
import com.immomo.mls.fun.ud.view.UDScrollView;
import com.immomo.mls.fun.ud.view.UDSinglePieChartView;
import com.immomo.mls.fun.ud.view.UDSwipeMenuLayout;
import com.immomo.mls.fun.ud.view.UDSwitch;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ud.view.UDViewPager;
import com.immomo.mls.fun.ud.view.UDWebSvgView;
import com.immomo.mls.fun.ud.view.UDZoomImageView;
import com.immomo.mls.fun.ud.view.recycler.UDBaseNeedHeightAdapter;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout;
import com.immomo.mls.fun.ud.view.recycler.UDCollectionAdapter;
import com.immomo.mls.fun.ud.view.recycler.UDCollectionAutoFitAdapter;
import com.immomo.mls.fun.ud.view.recycler.UDCollectionLayout;
import com.immomo.mls.fun.ud.view.recycler.UDFlexboxAdapter;
import com.immomo.mls.fun.ud.view.recycler.UDFlexboxLayout;
import com.immomo.mls.fun.ud.view.recycler.UDListAdapter;
import com.immomo.mls.fun.ud.view.recycler.UDListAutoFitAdapter;
import com.immomo.mls.fun.ud.view.recycler.UDRecyclerView;
import com.immomo.mls.fun.ud.view.recycler.UDWaterFallAdapter;
import com.immomo.mls.fun.ud.view.recycler.UDWaterFallLayout;
import com.immomo.mls.fun.ud.view.tokenMap.UDTokenData;
import com.immomo.mls.fun.ud.view.tokenMap.UDTokenMapView;
import com.immomo.mls.fun.ud.view.viewpager.UDViewPagerAdapter;
import com.immomo.mls.fun.ui.custom.LoadingView;
import com.immomo.mls.fun.ui.custom.OKLottieAnimationView;
import com.immomo.mls.fun.ui.custom.OkCombinedChart;
import com.immomo.mls.fun.ui.custom.OkImageButton;
import com.immomo.mls.fun.ui.custom.OkSegmentImageTitleLayout;
import com.immomo.mls.fun.ui.custom.OkSegmentLayout;
import com.immomo.mls.fun.ui.custom.chart.OKBarChart;
import com.immomo.mls.fun.ui.custom.chart.OKBarChartDataSet;
import com.immomo.mls.fun.ui.custom.chart.OKLineChartDataSet;
import com.immomo.mls.fun.ui.custom.chart.OKRadarChart;
import com.immomo.mls.fun.ui.custom.chart.OKRadarChartDataSet;
import com.immomo.mls.fun.ui.custom.chart.OKRadarHighlightValue;
import com.immomo.mls.fun.ui.custom.chart.OKStackBarChartDataSet;
import com.immomo.mls.fun.ui.item.MLNOKCryptoCell;
import com.immomo.mls.fun.ui.item.MLNOKRegularCell;
import com.immomo.mls.fun.ui.sort.MLNOKSortBar;
import com.immomo.mls.fun.ui.uilib.MLNOKButton;
import com.immomo.mls.fun.ui.uilib.MLNOKSnackbar;
import com.immomo.mls.fun.ui.uilib.anchor.MLNOKAnchor;
import com.immomo.mls.fun.ui.uilib.banner.MLNOKAlertBanner;
import com.immomo.mls.fun.ui.uilib.banner.MLNOKHorizontalBanner;
import com.immomo.mls.fun.ui.uilib.banner.MLNOKSlider;
import com.immomo.mls.fun.ui.uilib.button.MLNOKCompactButton;
import com.immomo.mls.fun.ui.uilib.checkbox.MLNOKCheckBox;
import com.immomo.mls.fun.ui.uilib.coachmark.MLNOKCoachMark;
import com.immomo.mls.fun.ui.uilib.coachmark.MLNOKCoachMarkItem;
import com.immomo.mls.fun.ui.uilib.dialog.MLNOKDialog;
import com.immomo.mls.fun.ui.uilib.empty.MLNOKEmptyState;
import com.immomo.mls.fun.ui.uilib.filter.MLNOKButtonChip;
import com.immomo.mls.fun.ui.uilib.filter.MLNOKMenuChip;
import com.immomo.mls.fun.ui.uilib.input.MLNOKInput;
import com.immomo.mls.fun.ui.uilib.input.MLNOKSelectInput;
import com.immomo.mls.fun.ui.uilib.keyboard.MLNOKKeypad;
import com.immomo.mls.fun.ui.uilib.keyboard.MLNOKKeypadLabel;
import com.immomo.mls.fun.ui.uilib.loading.MLNOKLoadingView;
import com.immomo.mls.fun.ui.uilib.menu.MLNOKContextMenuPopup;
import com.immomo.mls.fun.ui.uilib.menu.OKContextMenuPopupItemBuilder;
import com.immomo.mls.fun.ui.uilib.progress.MLNOKProgressIndicator;
import com.immomo.mls.fun.ui.uilib.reminder.MLNOKReminder;
import com.immomo.mls.fun.ui.uilib.resultpage.MLNOKResultPage;
import com.immomo.mls.fun.ui.uilib.search.MLNOKSearchBar;
import com.immomo.mls.fun.ui.uilib.search.MLNOKSearchHistoryView;
import com.immomo.mls.fun.ui.uilib.sheet.MLNOKBottomSheet;
import com.immomo.mls.fun.ui.uilib.sheet.MLNOKSelectionCardSheet;
import com.immomo.mls.fun.ui.uilib.switcher.MLNOKSwitch;
import com.immomo.mls.fun.ui.uilib.tab.MLNOKButtonChipGroup;
import com.immomo.mls.fun.ui.uilib.tab.MLNOKDisplayChipGroup;
import com.immomo.mls.fun.ui.uilib.tab.MLNOKSegmentedControl;
import com.immomo.mls.fun.ui.uilib.tab.MLNOKTabs;
import com.immomo.mls.fun.ui.uilib.tag.MLNOKTag;
import com.immomo.mls.fun.ui.uilib.text.MLNOKHelperLabel;
import com.immomo.mls.fun.ui.uilib.text.MLNOKHyperlink;
import com.immomo.mls.fun.ui.uilib.toast.MLNOKHud;
import com.immomo.mls.fun.ui.uilib.values.MLNAppearance;
import com.immomo.mls.fun.ui.uilib.values.MLNSpacing;
import com.immomo.mls.fun.ui.webview.UDWebContentView;
import java.util.Map;
import o.C7318aha;
import o.C7325ahh;
import o.C8010aue;
import org.json.JSONException;
import org.json.JSONObject;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;

/* JADX INFO: renamed from: o.ahi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7326ahi {
    public static final java.util.List<InterfaceC60050zuZ> AEQbTJ;
    public static boolean AYXKKw;
    public static C8010aue AhwBna;
    public static boolean EZpvd;
    public static volatile InterfaceC60037zuM KWHzl;
    public static android.content.Context OLrzqt;
    public static final java.lang.String[] copydefault = {"luajapi", "mlnbridge"};
    public static C7338ahu djBIcL;
    public static java.lang.StringBuilder gEmmrt;
    public static final java.util.Map<java.lang.String, java.lang.Boolean> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.util.List<InterfaceC60050zuZ> AYXKKw() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static android.content.Context OLrzqt() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.Class[] fetchVPNInfo() {
        return new java.lang.Class[]{FontStyle.class, TextAlign.class, BreakMode.class, EditTextViewInputMode.class, ReturnType.class, ContentMode.class, UnderlineStyle.class, CachePolicy.class, ErrorKey.class, ResponseKey.class, InterpolatorType.class, ValueType.class, RepeatType.class, NavigatorAnimType.class, com.immomo.mls.fun.constants.NetworkState.class, RectCorner.class, ScrollDirection.class, EncType.class, ResultType.class, GravityConstants.class, LinearType.class, MeasurementType.class, EditTextViewFormatterType.class, GradientType.class, TabSegmentAlignment.class, StatusBarStyle.class, StatusMode.class, AnimationValueType.class, FileInfo.class, DrawStyle.class, FillType.class, StyleImageAlign.class, com.immomo.mls.fun.constants.MotionEvent.class, SafeAreaConstants.class, MainAxisAlignType.class, CrossAxisAlignType.class, WrapType.class, ScreenOrientation.class, LineCap.class};
    }

    static {
        java.util.HashMap map = new java.util.HashMap(3);
        valueOf = map;
        map.put("lblur", java.lang.Boolean.FALSE);
        AYXKKw = false;
        gEmmrt = new java.lang.StringBuilder();
        AEQbTJ = new java.util.ArrayList();
    }

    public static InterfaceC60037zuM AhwBna() {
        if (KWHzl == null) {
            synchronized (C7326ahi.class) {
                if (KWHzl == null) {
                    KWHzl = new C7322ahe(OLrzqt);
                }
            }
        }
        return KWHzl;
    }

    public static java.lang.String copydefault() {
        return C7788aqT.AEQbTJ().EZpvd();
    }

    public static boolean valueOf() {
        C8010aue c8010aue;
        return C7788aqT.OLrzqt() && (c8010aue = AhwBna) != null && c8010aue.copydefault();
    }

    public static void copydefault(InterfaceC7342ahy interfaceC7342ahy) {
        boolean z = true;
        for (java.lang.String str : copydefault) {
            z = interfaceC7342ahy.OLrzqt(str) && z;
        }
        AYXKKw = z;
    }

    public static void EZpvd(InterfaceC7342ahy interfaceC7342ahy) {
        for (Map.Entry entry : new java.util.HashMap(valueOf).entrySet()) {
            if (!((java.lang.Boolean) entry.getValue()).booleanValue()) {
                valueOf.put((java.lang.String) entry.getKey(), java.lang.Boolean.valueOf(interfaceC7342ahy.OLrzqt((java.lang.String) entry.getKey())));
            }
        }
        if (EZpvd) {
            C7870arw.KWHzl("lua engine load libs:", valueOf);
        }
    }

    public static boolean copydefault(java.lang.String str) {
        java.lang.Boolean bool = valueOf.get(str);
        return bool != null && bool.booleanValue();
    }

    public static C7325ahh copydefault(android.content.Context context, boolean z) {
        return EZpvd(context, C7375aie.KWHzl(), z);
    }

    public static C7325ahh EZpvd(android.content.Context context, @androidx.annotation.NonNull InterfaceC7342ahy interfaceC7342ahy, final boolean z) {
        boolean z2;
        if (!AYXKKw) {
            EZpvd = z;
            copydefault(interfaceC7342ahy);
        }
        if (!AYXKKw) {
            return null;
        }
        if (AhwBna == null) {
            synchronized (C7326ahi.class) {
                if (AhwBna == null) {
                    AhwBna = new C8010aue();
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                EZpvd(interfaceC7342ahy);
                C7318aha.OLrzqt(new C7318aha.ActionBar() { // from class: o.ahi.3
                    @Override // o.C7318aha.ActionBar
                    public void KWHzl(Globals globals, boolean z3) {
                        if (z3) {
                            globals.OLrzqt(C7326ahi.AhwBna());
                            globals.OLrzqt(C7326ahi.copydefault(), false);
                            globals.OLrzqt(C7326ahi.AYXKKw());
                        }
                        C7326ahi.AhwBna.EZpvd(globals, false);
                        if (C7326ahi.AYXKKw) {
                            NativeBridge.OLrzqt(globals);
                        }
                    }

                    @Override // o.C7318aha.ActionBar
                    public boolean EZpvd(java.lang.Throwable th, Globals globals) {
                        return C7320ahc.AEQbTJ(th, globals);
                    }

                    @Override // o.C7318aha.ActionBar
                    public void EZpvd(Globals globals, long j) {
                        if (z) {
                            C7870arw.EZpvd("Lua Gc cast:", java.lang.Long.valueOf(j));
                        }
                    }

                    @Override // o.C7318aha.ActionBar
                    public LuaUserdata KWHzl(long j, @androidx.annotation.NonNull LuaUserdata luaUserdata) {
                        InterfaceC7301ahJ interfaceC7301ahJDjBIcL = C7323ahf.djBIcL();
                        return interfaceC7301ahJDjBIcL != null ? interfaceC7301ahJDjBIcL.copydefault(j, luaUserdata) : luaUserdata;
                    }
                });
                OLrzqt = context;
                EZpvd = z;
                C7318aha.copydefault = z;
                C7864arq.AEQbTJ = z;
                C7320ahc.copydefault = z;
                C7865arr.copydefault(context);
                if (!Globals.AEQbTJ()) {
                    throw new java.lang.RuntimeException("luac library is not loaded! call Globals.isInit()");
                }
                java.io.File parentFile = context.getDatabasePath(IEncryptorType.DEFAULT_ENCRYPTOR).getParentFile();
                if (parentFile.exists() || parentFile.mkdirs()) {
                    Globals.copydefault(parentFile.getAbsolutePath());
                }
                if (z && djBIcL == null) {
                    C7338ahu c7338ahu = new C7338ahu();
                    djBIcL = c7338ahu;
                    C60045zuU.AEQbTJ(c7338ahu);
                }
                AEQbTJ.add(new C7953atZ(context));
                Globals.OLrzqt(context.getAssets());
                return isConnected();
            }
        }
        return new C7325ahh(AhwBna);
    }

    public static C7325ahh isConnected() {
        return new C7325ahh(AhwBna);
    }

    public static void EZpvd(boolean z, android.content.Context context) {
        C7788aqT.EZpvd(z, context);
    }

    public static boolean djBIcL() {
        return C7788aqT.EZpvd();
    }

    public static void AEQbTJ(java.lang.String str) {
        C7788aqT.OLrzqt(str);
    }

    public static java.lang.String AEQbTJ() {
        return C7788aqT.copydefault();
    }

    public static void OLrzqt(int i) {
        C7788aqT.OLrzqt(i);
    }

    public static int EZpvd() {
        return C7788aqT.KWHzl();
    }

    public static C8010aue.AssistContent[] DbNXlk() {
        C8010aue.AssistContent assistContentCopydefault = C8010aue.copydefault("__BaseView", (java.lang.Class<? extends LuaUserdata>) UDView.class, false, UDView.ORxRYg);
        java.lang.String[] strArr = UDViewGroup.dmfpNf;
        java.lang.String str = strArr[0];
        java.lang.String[] strArr2 = UDViewGroup.hrNTAI;
        C8010aue.AssistContent assistContentCopydefault2 = C8010aue.copydefault(str, (java.lang.Class<? extends LuaUserdata>) UDViewGroup.class, false, strArr2);
        C8010aue.AssistContent assistContentCopydefault3 = C8010aue.copydefault(strArr[1], (java.lang.Class<? extends LuaUserdata>) UDViewGroup.class, false, strArr2);
        C8010aue.AssistContent assistContentCopydefault4 = C8010aue.copydefault("__WINDOW", (java.lang.Class<? extends LuaUserdata>) UDLuaView.class, false, UDLuaView.KWHzl);
        C8010aue.AssistContent assistContentCopydefault5 = C8010aue.copydefault("LinearLayout", (java.lang.Class<? extends LuaUserdata>) UDLinearLayout.class, false, new java.lang.String[0]);
        C8010aue.AssistContent assistContentCopydefault6 = C8010aue.copydefault("AppBarLayout", (java.lang.Class<? extends LuaUserdata>) UDAppBarLayout.class, false, new java.lang.String[0]);
        C8010aue.AssistContent assistContentCopydefault7 = C8010aue.copydefault("CoordinatorLayout", (java.lang.Class<? extends LuaUserdata>) UDCoordinatorLayout.class, false, new java.lang.String[0]);
        C8010aue.AssistContent assistContentCopydefault8 = C8010aue.copydefault("LoadingView", (java.lang.Class<? extends LuaUserdata>) LoadingView.class, false, LoadingView.AEQbTJ);
        C8010aue.AssistContent assistContentCopydefault9 = C8010aue.copydefault("Label", (java.lang.Class<? extends LuaUserdata>) UDLabel.class, false, UDLabel.getFieldNames);
        C8010aue.AssistContent assistContentCopydefault10 = C8010aue.copydefault("EditTextView", (java.lang.Class<? extends LuaUserdata>) UDEditText.class, false, UDEditText.KWHzl);
        C8010aue.AssistContent assistContentCopydefault11 = C8010aue.copydefault("ImageView", (java.lang.Class<? extends LuaUserdata>) UDImageView.class, false, UDImageView.EZpvd);
        C8010aue.AssistContent assistContentCopydefault12 = C8010aue.copydefault("ImageButton", (java.lang.Class<? extends LuaUserdata>) OkImageButton.class, false, OkImageButton.OLrzqt);
        C8010aue.AssistContent assistContentCopydefault13 = C8010aue.copydefault("OKButton", (java.lang.Class<? extends LuaUserdata>) MLNOKButton.class, false, MLNOKButton.Companion.KWHzl());
        C8010aue.AssistContent assistContentCopydefault14 = C8010aue.copydefault("OKSelectionCardSheet", (java.lang.Class<? extends LuaUserdata>) MLNOKSelectionCardSheet.class, false, MLNOKSelectionCardSheet.Companion.copydefault());
        C8010aue.AssistContent assistContentCopydefault15 = C8010aue.copydefault("OKTabs", (java.lang.Class<? extends LuaUserdata>) MLNOKTabs.class, false, MLNOKTabs.Companion.EZpvd());
        C8010aue.AssistContent assistContentCopydefault16 = C8010aue.copydefault("OKDisplayChipGroup", (java.lang.Class<? extends LuaUserdata>) MLNOKDisplayChipGroup.class, false, MLNOKDisplayChipGroup.Companion.OLrzqt());
        C8010aue.AssistContent assistContentCopydefault17 = C8010aue.copydefault("OKButtonChipGroup", (java.lang.Class<? extends LuaUserdata>) MLNOKButtonChipGroup.class, false, MLNOKButtonChipGroup.Companion.KWHzl());
        C8010aue.AssistContent assistContentCopydefault18 = C8010aue.copydefault("OKInput", (java.lang.Class<? extends LuaUserdata>) MLNOKInput.class, false, MLNOKInput.Companion.OLrzqt());
        C8010aue.AssistContent assistContentCopydefault19 = C8010aue.copydefault("OKSearchBar", (java.lang.Class<? extends LuaUserdata>) MLNOKSearchBar.class, false, MLNOKSearchBar.Companion.OLrzqt());
        C8010aue.AssistContent assistContentCopydefault20 = C8010aue.copydefault("OKSearchHistoryView", (java.lang.Class<? extends LuaUserdata>) MLNOKSearchHistoryView.class, false, MLNOKSearchHistoryView.Companion.KWHzl());
        C8010aue.AssistContent assistContentCopydefault21 = C8010aue.copydefault("OKAlertDialog", (java.lang.Class<? extends LuaUserdata>) MLNOKDialog.class, false, MLNOKDialog.Companion.copydefault());
        C8010aue.AssistContent assistContentCopydefault22 = C8010aue.copydefault("OKContextMenuPopup", (java.lang.Class<? extends LuaUserdata>) MLNOKContextMenuPopup.class, false, MLNOKContextMenuPopup.Companion.KWHzl());
        C8010aue.AssistContent assistContentCopydefault23 = C8010aue.copydefault("__OKContextMenuPopupItemBuilder", (java.lang.Class<? extends LuaUserdata>) OKContextMenuPopupItemBuilder.class, false, OKContextMenuPopupItemBuilder.Companion.KWHzl());
        C8010aue.AssistContent assistContentCopydefault24 = C8010aue.copydefault("OKResultPage", (java.lang.Class<? extends LuaUserdata>) MLNOKResultPage.class, false, MLNOKResultPage.Companion.OLrzqt());
        C8010aue.AssistContent assistContentCopydefault25 = C8010aue.copydefault("OKButtonChip", (java.lang.Class<? extends LuaUserdata>) MLNOKButtonChip.class, false, MLNOKButtonChip.Companion.OLrzqt());
        C8010aue.AssistContent assistContentCopydefault26 = C8010aue.copydefault("OKCheckBox", (java.lang.Class<? extends LuaUserdata>) MLNOKCheckBox.class, false, MLNOKCheckBox.Companion.OLrzqt());
        C8010aue.AssistContent assistContentCopydefault27 = C8010aue.copydefault("OKReminder", (java.lang.Class<? extends LuaUserdata>) MLNOKReminder.class, false, MLNOKReminder.Companion.OLrzqt());
        C8010aue.AssistContent assistContentCopydefault28 = C8010aue.copydefault("OKTag", (java.lang.Class<? extends LuaUserdata>) MLNOKTag.class, false, MLNOKTag.Companion.EZpvd());
        C8010aue.AssistContent assistContentCopydefault29 = C8010aue.copydefault("OKSegmentedControl", (java.lang.Class<? extends LuaUserdata>) MLNOKSegmentedControl.class, false, MLNOKSegmentedControl.Companion.OLrzqt());
        C8010aue.AssistContent assistContentCopydefault30 = C8010aue.copydefault("OKCoachMark", (java.lang.Class<? extends LuaUserdata>) MLNOKCoachMark.class, false, MLNOKCoachMark.Companion.copydefault());
        C8010aue.AssistContent assistContentCopydefault31 = C8010aue.copydefault(MLNOKCoachMarkItem.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) MLNOKCoachMarkItem.class, false, MLNOKCoachMarkItem.Companion.AEQbTJ());
        C8010aue.AssistContent assistContentCopydefault32 = C8010aue.copydefault("OKBottomSheet", (java.lang.Class<? extends LuaUserdata>) MLNOKBottomSheet.class, false, MLNOKBottomSheet.Companion.KWHzl());
        C8010aue.AssistContent assistContentCopydefault33 = C8010aue.copydefault("OKEmptyState", (java.lang.Class<? extends LuaUserdata>) MLNOKEmptyState.class, false, MLNOKEmptyState.Companion.KWHzl());
        C8010aue.AssistContent assistContentCopydefault34 = C8010aue.copydefault("OKProgressIndicator", (java.lang.Class<? extends LuaUserdata>) MLNOKProgressIndicator.class, false, MLNOKProgressIndicator.Companion.KWHzl());
        C8010aue.AssistContent assistContentCopydefault35 = C8010aue.copydefault("OKLoadingView", (java.lang.Class<? extends LuaUserdata>) MLNOKLoadingView.class, false, MLNOKLoadingView.Companion.EZpvd());
        C8010aue.AssistContent assistContentCopydefault36 = C8010aue.copydefault("OKAnchor", (java.lang.Class<? extends LuaUserdata>) MLNOKAnchor.class, false, MLNOKAnchor.Companion.OLrzqt());
        C8010aue.AssistContent assistContentCopydefault37 = C8010aue.copydefault("OKKeypadLabel", (java.lang.Class<? extends LuaUserdata>) MLNOKKeypadLabel.class, false, MLNOKKeypadLabel.Companion.EZpvd());
        C8010aue.AssistContent assistContentCopydefault38 = C8010aue.copydefault("OKKeypad", (java.lang.Class<? extends LuaUserdata>) MLNOKKeypad.class, false, MLNOKKeypad.Companion.OLrzqt());
        C8010aue.AssistContent assistContentCopydefault39 = C8010aue.copydefault("OKCryptoCell", (java.lang.Class<? extends LuaUserdata>) MLNOKCryptoCell.class, false, MLNOKCryptoCell.Companion.KWHzl());
        C8010aue.AssistContent assistContentCopydefault40 = C8010aue.copydefault("OKSortBar", (java.lang.Class<? extends LuaUserdata>) MLNOKSortBar.class, false, MLNOKSortBar.Companion.KWHzl());
        C8010aue.AssistContent assistContentCopydefault41 = C8010aue.copydefault("OKCompactButton", (java.lang.Class<? extends LuaUserdata>) MLNOKCompactButton.class, false, MLNOKCompactButton.Companion.KWHzl());
        C8010aue.AssistContent assistContentCopydefault42 = C8010aue.copydefault("OKSwitch", (java.lang.Class<? extends LuaUserdata>) MLNOKSwitch.class, false, MLNOKSwitch.Companion.EZpvd());
        C8010aue.AssistContent assistContentCopydefault43 = C8010aue.copydefault("OKHelperLabel", (java.lang.Class<? extends LuaUserdata>) MLNOKHelperLabel.class, false, MLNOKHelperLabel.Companion.KWHzl());
        C8010aue.AssistContent assistContentCopydefault44 = C8010aue.copydefault("OKMenuChip", (java.lang.Class<? extends LuaUserdata>) MLNOKMenuChip.class, false, MLNOKMenuChip.Companion.KWHzl());
        C8010aue.AssistContent assistContentCopydefault45 = C8010aue.copydefault("OKRegularCell", (java.lang.Class<? extends LuaUserdata>) MLNOKRegularCell.class, false, MLNOKRegularCell.Companion.OLrzqt());
        C8010aue.AssistContent assistContentCopydefault46 = C8010aue.copydefault("OKHyperlink", (java.lang.Class<? extends LuaUserdata>) MLNOKHyperlink.class, false, MLNOKHyperlink.Companion.EZpvd());
        C8010aue.AssistContent assistContentCopydefault47 = C8010aue.copydefault("OKAlertBanner", (java.lang.Class<? extends LuaUserdata>) MLNOKAlertBanner.class, false, MLNOKAlertBanner.Companion.copydefault());
        C8010aue.AssistContent assistContentCopydefault48 = C8010aue.copydefault("OKSelectInput", (java.lang.Class<? extends LuaUserdata>) MLNOKSelectInput.class, false, MLNOKSelectInput.Companion.copydefault());
        C8010aue.AssistContent assistContentCopydefault49 = C8010aue.copydefault("OKHorizontalBanner", (java.lang.Class<? extends LuaUserdata>) MLNOKHorizontalBanner.class, false, MLNOKHorizontalBanner.Companion.copydefault());
        C8010aue.AssistContent assistContentCopydefault50 = C8010aue.copydefault("OKSlider", (java.lang.Class<? extends LuaUserdata>) MLNOKSlider.class, false, MLNOKSlider.Companion.copydefault());
        C8010aue.AssistContent assistContentCopydefault51 = C8010aue.copydefault("ScrollView", (java.lang.Class<? extends LuaUserdata>) UDScrollView.class, false, UDScrollView.OLrzqt);
        C8010aue.AssistContent assistContentKWHzl = C8010aue.KWHzl("__BaseRecyclerAdapter", UDBaseRecyclerAdapter.class, false, true, UDBaseRecyclerAdapter.valueOf);
        C8010aue.AssistContent assistContentKWHzl2 = C8010aue.KWHzl("__BaseNeedHeightAdapter", UDBaseNeedHeightAdapter.class, false, true, UDBaseNeedHeightAdapter.copydefault);
        C8010aue.AssistContent assistContentKWHzl3 = C8010aue.KWHzl(UDBaseRecyclerLayout.LUA_CLASS_NAME, UDBaseRecyclerLayout.class, false, true, UDBaseRecyclerLayout.methods);
        java.lang.String[] strArr3 = UDRecyclerView.EZpvd;
        java.lang.String str2 = strArr3[0];
        java.lang.String[] strArr4 = UDRecyclerView.KWHzl;
        return new C8010aue.AssistContent[]{assistContentCopydefault, assistContentCopydefault2, assistContentCopydefault3, assistContentCopydefault4, assistContentCopydefault5, assistContentCopydefault6, assistContentCopydefault7, assistContentCopydefault8, assistContentCopydefault9, assistContentCopydefault10, assistContentCopydefault11, assistContentCopydefault12, assistContentCopydefault13, assistContentCopydefault14, assistContentCopydefault15, assistContentCopydefault16, assistContentCopydefault17, assistContentCopydefault18, assistContentCopydefault19, assistContentCopydefault20, assistContentCopydefault21, assistContentCopydefault22, assistContentCopydefault23, assistContentCopydefault24, assistContentCopydefault25, assistContentCopydefault26, assistContentCopydefault27, assistContentCopydefault28, assistContentCopydefault29, assistContentCopydefault30, assistContentCopydefault31, assistContentCopydefault32, assistContentCopydefault33, assistContentCopydefault34, assistContentCopydefault35, assistContentCopydefault36, assistContentCopydefault37, assistContentCopydefault38, assistContentCopydefault39, assistContentCopydefault40, assistContentCopydefault41, assistContentCopydefault42, assistContentCopydefault43, assistContentCopydefault44, assistContentCopydefault45, assistContentCopydefault46, assistContentCopydefault47, assistContentCopydefault48, assistContentCopydefault49, assistContentCopydefault50, assistContentCopydefault51, assistContentKWHzl, assistContentKWHzl2, assistContentKWHzl3, C8010aue.copydefault(str2, (java.lang.Class<? extends LuaUserdata>) UDRecyclerView.class, false, strArr4), C8010aue.copydefault(strArr3[1], (java.lang.Class<? extends LuaUserdata>) UDRecyclerView.class, false, strArr4), C8010aue.copydefault(strArr3[2], (java.lang.Class<? extends LuaUserdata>) UDRecyclerView.class, false, strArr4), C8010aue.copydefault("OKViewPager", (java.lang.Class<? extends LuaUserdata>) UDViewPager.class, false, UDViewPager.OHqIaq), C8010aue.copydefault("OKImageTitleViewPager", (java.lang.Class<? extends LuaUserdata>) UDImageTitleViewPager.class, false, UDImageTitleViewPager.copydefault), C8010aue.copydefault("OKSegmentView", (java.lang.Class<? extends LuaUserdata>) OkSegmentLayout.class, false, OkSegmentLayout.KWHzl), C8010aue.copydefault("OKIconTitleSegmentView", (java.lang.Class<? extends LuaUserdata>) OkSegmentImageTitleLayout.class, false, OkSegmentImageTitleLayout.AEQbTJ), C8010aue.copydefault("Switch", (java.lang.Class<? extends LuaUserdata>) UDSwitch.class, false, UDSwitch.EZpvd), C8010aue.copydefault("CanvasView", (java.lang.Class<? extends LuaUserdata>) UDCanvasView.class, false, UDCanvasView.KWHzl), C8010aue.copydefault("_BaseStack", (java.lang.Class<? extends LuaUserdata>) UDBaseStack.class, false, UDBaseStack.OLrzqt), C8010aue.copydefault("_BaseHVStack", (java.lang.Class<? extends LuaUserdata>) UDBaseHVStack.class, false, UDBaseHVStack.AEQbTJ), C8010aue.copydefault("HStack", (java.lang.Class<? extends LuaUserdata>) UDHStack.class, false, UDHStack.KWHzl), C8010aue.copydefault("DatePicker", (java.lang.Class<? extends LuaUserdata>) UDDatePickView.class, false, UDDatePickView.KWHzl), C8010aue.copydefault("OKCombinedChart", (java.lang.Class<? extends LuaUserdata>) OkCombinedChart.class, false, OkCombinedChart.EZpvd), C8010aue.copydefault("OKBarChart", (java.lang.Class<? extends LuaUserdata>) OKBarChart.class, false, OKBarChart.KWHzl), C8010aue.copydefault(OKLineChartDataSet.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) OKLineChartDataSet.class, false, OKLineChartDataSet.methods), C8010aue.copydefault(OKBarChartDataSet.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) OKBarChartDataSet.class, false, OKBarChartDataSet.methods), C8010aue.copydefault(OKStackBarChartDataSet.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) OKStackBarChartDataSet.class, false, OKStackBarChartDataSet.methods), C8010aue.copydefault("OKRadarChart", (java.lang.Class<? extends LuaUserdata>) OKRadarChart.class, false, OKRadarChart.AEQbTJ), C8010aue.copydefault(OKRadarChartDataSet.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) OKRadarChartDataSet.class, false, OKRadarChartDataSet.methods), C8010aue.copydefault(OKRadarHighlightValue.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) OKRadarHighlightValue.class, false, OKRadarHighlightValue.methods), C8010aue.KWHzl("TableViewAdapter", UDListAdapter.class, false, true, UDListAdapter.gasjUx), C8010aue.KWHzl("TableViewAutoFitAdapter", UDListAutoFitAdapter.class, false, true, new java.lang.String[0]), C8010aue.KWHzl("CollectionViewAdapter", UDCollectionAdapter.class, false, true, UDCollectionAdapter.OLrzqt), C8010aue.KWHzl("CollectionViewAutoFitAdapter", UDCollectionAutoFitAdapter.class, false, true, UDCollectionAutoFitAdapter.AxsJAYaxsJAY), C8010aue.KWHzl(UDCollectionLayout.LUA_CLASS_NAME, UDCollectionLayout.class, false, true, UDCollectionLayout.methods), C8010aue.KWHzl("WaterfallAdapter", UDWaterFallAdapter.class, false, true, UDWaterFallAdapter.gGvvIC), C8010aue.KWHzl("WaterfallLayout", UDWaterFallLayout.class, false, true, UDWaterFallLayout.EZpvd), C8010aue.KWHzl("ViewPagerAdapter", UDViewPagerAdapter.class, false, true, UDViewPagerAdapter.KWHzl), C8010aue.KWHzl("StyleString", UDStyleString.class, false, true, UDStyleString.EZpvd), C8010aue.KWHzl("Color", UDColor.class, false, true, UDColor.EZpvd), C8010aue.copydefault(UDImageInfo.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDImageInfo.class, false, UDImageInfo.methods), C8010aue.KWHzl(UDEditTextFormatter.LUA_CLASS_NAME, UDEditTextFormatter.class, false, false, UDEditTextFormatter.methods), C8010aue.KWHzl("FlexboxLayoutAdapter", UDFlexboxAdapter.class, false, true, new java.lang.String[0]), C8010aue.KWHzl("FlexboxLayout", UDFlexboxLayout.class, false, true, new java.lang.String[0]), C8010aue.KWHzl("OKVideoPlayerView", UDVideoPlayerView.class, false, true, UDVideoPlayerView.copydefault), C8010aue.KWHzl("OKPieChartView", UDPieChartView.class, false, true, UDPieChartView.OLrzqt), C8010aue.copydefault("OKZoomImageView", (java.lang.Class<? extends LuaUserdata>) UDZoomImageView.class, false, UDZoomImageView.EZpvd), C8010aue.copydefault("OKLottieAnimationView", (java.lang.Class<? extends LuaUserdata>) OKLottieAnimationView.class, false, OKLottieAnimationView.KWHzl), C8010aue.KWHzl("OKWebContentView", UDWebContentView.class, false, true, UDWebContentView.copydefault), C8010aue.KWHzl("OKWebSVGView", UDWebSvgView.class, false, true, UDWebSvgView.copydefault), C8010aue.KWHzl("OKTickerView", UDTickerView.class, false, true, UDTickerView.EZpvd), C8010aue.KWHzl("MLNDatabase", MLNDatabase.class, false, true, MLNDatabase.KWHzl), C8010aue.KWHzl("OKSwipeMenuLayout", UDSwipeMenuLayout.class, false, true, UDSwipeMenuLayout.copydefault), C8010aue.KWHzl("OKTokenMapView", UDTokenMapView.class, false, true, UDTokenMapView.AEQbTJ), C8010aue.KWHzl("OKSinglePieChartView", UDSinglePieChartView.class, false, true, UDSinglePieChartView.copydefault), C8010aue.KWHzl("OKMarketFeedContentView", UDOKMarketFeedContentView.class, false, true, UDOKMarketFeedContentView.Companion.EZpvd()), C8010aue.AEQbTJ("OKSnackbar", MLNOKSnackbar.class, false, false), UDOKMarketHybridWebView.Companion.KWHzl()};
    }

    public static C8010aue.AssistContent[] fARcdN() {
        return new C8010aue.AssistContent[]{C8010aue.copydefault(UDNativeLoader.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDNativeLoader.class, false, UDNativeLoader.methods), C8010aue.copydefault(UDSize.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDSize.class, false, UDSize.methods), C8010aue.copydefault(UDPoint.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDPoint.class, false, UDPoint.methods), C8010aue.copydefault(UDRect.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDRect.class, false, UDRect.methods), C8010aue.KWHzl("ContentWindow", UDWindowManager.class, false, true, UDWindowManager.EZpvd), C8010aue.copydefault(UDPath.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDPath.class, false, UDPath.methods), C8010aue.copydefault(UDPaint.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDPaint.class, false, UDPaint.methods), C8010aue.copydefault("OKTokenData", (java.lang.Class<? extends LuaUserdata>) UDTokenData.class, false, UDTokenData.AEQbTJ), C8010aue.copydefault(UDCanvas.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDCanvas.class, false, UDCanvas.methods), C8010aue.copydefault(UDSafeAreaRect.LUA_CLASS_NAME, (java.lang.Class<? extends LuaUserdata>) UDSafeAreaRect.class, false, UDSafeAreaRect.methods), C8010aue.OLrzqt(OkUDHttp.LUA_CLASS_NAME, OkUDHttp.class, false), C8010aue.OLrzqt("Animator", UDAnimator.class, false), C8010aue.OLrzqt(Timer.LUA_CLASS_NAME, Timer.class, false), C8010aue.OLrzqt("Event", Event.class, false), C8010aue.OLrzqt("Alert", Alert.class, false), C8010aue.AEQbTJ("Dialog", LuaDialog.class, false, true), C8010aue.AEQbTJ("OKMessageToast", UDOkStateNotification.class, false, true), C8010aue.OLrzqt("__CanvasAnimation", UDBaseAnimation.class, false), C8010aue.OLrzqt("AlphaAnimation", UDAlphaAnimation.class, false), C8010aue.OLrzqt("RotateAnimation", UDRotateAnimation.class, false), C8010aue.OLrzqt("ScaleAnimation", UDScaleAnimation.class, false), C8010aue.OLrzqt("TranslateAnimation", UDTranslateAnimation.class, false), C8010aue.OLrzqt("AnimationSet", UDAnimationSet.class, false), C8010aue.OLrzqt("OKMusicPlayer", UDAudioPlayer.class, false), C8010aue.KWHzl(UDWsArgV5.LUA_CLASS_NAME, UDWsArgV5.class, false, false, UDWsArgV5.methods), C8010aue.KWHzl("OKWSSubscribeArgV5ForWeb3", UDWsArgV5ForWeb3.class, false, false, UDWsArgV5ForWeb3.KWHzl), C8010aue.KWHzl(OKWsListenerBridge.LUA_CLASS_NAME, OKWsListenerBridge.class, false, false, OKWsListenerBridge.methods)};
    }

    public static C8010aue.Fragment[] AkhnZx() {
        return new C8010aue.Fragment[]{new C8010aue.Fragment("Array", UDArray.class), new C8010aue.Fragment("Map", UDMap.class)};
    }

    public static C7325ahh.TaskDescription[] values() {
        return new C7325ahh.TaskDescription[]{new C7325ahh.TaskDescription(C7350aiF.class, (InterfaceC8009aud) UDSize.G, true), new C7325ahh.TaskDescription(C7348aiD.class, (InterfaceC8009aud) UDPoint.G, true), new C7325ahh.TaskDescription(C7352aiH.class, (InterfaceC8009aud) UDRect.G, true), new C7325ahh.TaskDescription(UDColor.class, UDColor.OLrzqt, (InterfaceC8009aud) null), new C7325ahh.TaskDescription(UDTokenData.class, (InterfaceC8012aug) UDTokenData.KWHzl, false), new C7325ahh.TaskDescription(java.util.Map.class, UDMap.KWHzl, UDMap.OLrzqt), new C7325ahh.TaskDescription(java.util.List.class, (InterfaceC8009aud) UDArray.AEQbTJ, true), new C7325ahh.TaskDescription(UDAnimator.class), new C7325ahh.TaskDescription(UDBaseAnimation.class, (InterfaceC8009aud) null, true), new C7325ahh.TaskDescription(UDAlphaAnimation.class, (InterfaceC8012aug) null, true), new C7325ahh.TaskDescription(UDRotateAnimation.class, (InterfaceC8012aug) null, true), new C7325ahh.TaskDescription(UDScaleAnimation.class, (InterfaceC8012aug) null, true), new C7325ahh.TaskDescription(UDTranslateAnimation.class, (InterfaceC8012aug) null, true), new C7325ahh.TaskDescription(UDAnimationSet.class, (InterfaceC8012aug) null, true)};
    }

    public static C7325ahh.Application[] ejfBZ() {
        return new C7325ahh.Application[]{new C7325ahh.Application(SISystem.KEY, SISystem.class), new C7325ahh.Application(SITimeManager.KEY, SITimeManager.class), new C7325ahh.Application(SClipboard.KEY, SClipboard.class), new C7325ahh.Application(SIGlobalEvent.LUA_CLASS_NAME, SIGlobalEvent.class), new C7325ahh.Application(SIApplication.LUA_CLASS_NAME, SIApplication.class), new C7325ahh.Application(SIEventCenter.LUA_CLASS_NAME, SIEventCenter.class), new C7325ahh.Application(SINetworkReachability.LUA_CLASS_NAME, SINetworkReachability.class), new C7325ahh.Application(SILoading.LUA_CLASS_NAME, SILoading.class), new C7325ahh.Application(SINavigator.LUA_CLASS_NAME, SINavigator.class, true), new C7325ahh.Application(SICornerRadiusManager.LUA_CLASS_NAME, SICornerRadiusManager.class), new C7325ahh.Application(OKMediaUploader.LUA_CLASS_NAME, OKMediaUploader.class), new C7325ahh.Application(MLNOKHud.LUA_CLASS_NAME, MLNOKHud.class), new C7325ahh.Application("Appearance", MLNAppearance.class)};
    }

    public static C8010aue.LoaderManager[] fIwbmz() {
        return new C8010aue.LoaderManager[]{C8010aue.copydefault("Printer", LTPrinter.class), C8010aue.copydefault("PreferenceUtils", LTPreferenceUtils.class), C8010aue.copydefault("File", LTFile.class), C8010aue.copydefault("StringUtil", LTStringUtil.class), C8010aue.AEQbTJ("TypeUtils", LTTypeUtils.class, LTTypeUtils.EZpvd), C8010aue.AEQbTJ("Spacing", MLNSpacing.class, MLNSpacing.Companion.copydefault())};
    }

    public static java.lang.String gEmmrt() {
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        if (c32979mnm.OLrzqt() == null) {
            return "0";
        }
        try {
            java.lang.String strAEQbTJ = C7788aqT.AEQbTJ().AEQbTJ(c32979mnm.OLrzqt(), "info.json");
            if (strAEQbTJ == null) {
                return "0";
            }
            java.lang.String strCopydefault = new java.io.File(strAEQbTJ).exists() ? C33478mxH.KWHzl.copydefault(strAEQbTJ) : C7791aqW.OLrzqt();
            if (strCopydefault == null) {
                return "0";
            }
            try {
                return new JSONObject(strCopydefault).getString("ver");
            } catch (JSONException e) {
                pUU.copydefault("mln", android.util.Log.getStackTraceString(e));
                return "0";
            }
        } catch (java.lang.Exception unused) {
            return "0";
        }
    }

    public static void OLrzqt(C7325ahh c7325ahh) {
        c7325ahh.AEQbTJ(DbNXlk()).AEQbTJ(fARcdN()).EZpvd(values()).EZpvd(ejfBZ()).AEQbTJ(fIwbmz()).KWHzl(fetchVPNInfo()).KWHzl(AkhnZx());
    }
}

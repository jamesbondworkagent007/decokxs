package com.okinc.trade.experience.bridge;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.exoplayer2.C;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.components.track.ABTestManager;
import com.okinc.core.util.SPUtils;
import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.search.bean.SearchResultContentPo;
import com.okinc.share.api.preview.BasePreviewConfig;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.trade.experience.bridge.UDOKMarketBridge;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractActivityC33041mov;
import o.AbstractC58185ywX;
import o.C27563jxZ;
import o.C32979mnm;
import o.C33050mpD;
import o.C33070mpX;
import o.C33129mqd;
import o.C33487mxQ;
import o.C33492mxV;
import o.C33570myu;
import o.C34929nli;
import o.C35202nqq;
import o.C43248rlh;
import o.C43251rlk;
import o.C48887ueE;
import o.C48891ueI;
import o.C49352umt;
import o.C49385unZ;
import o.C54586xNw;
import o.C54819xWm;
import o.C55298xhM;
import o.C55686xod;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C7322ahe;
import o.C7323ahf;
import o.C7910asj;
import o.InterfaceC43033rhe;
import o.InterfaceC48893ueK;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC60037zuM;
import o.InterfaceC7304ahM;
import o.pTB;
import o.pUU;
import o.qTC;
import o.qZH;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes11.dex */
@LuaClass
public final class UDOKMarketBridge {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final LuaValue[] AEQbTJ;
    public final Globals copydefault;

    public UDOKMarketBridge(Globals globals, LuaValue[] luaValueArr) {
        this.copydefault = globals;
        this.AEQbTJ = luaValueArr;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.trade.experience.bridge.UDOKMarketBridge.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @LuaBridge
    public final LuaNumber a_measureTextHeight(@NotNull LuaValue[] luaValueArr) {
        Context context;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        try {
            Globals globals = this.copydefault;
            InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
            C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
            if (c7322ahe != null && (context = c7322ahe.AEQbTJ) != null) {
                String javaString = ((LuaValue) yDV.AuCTelauCTel(luaValueArr)).toJavaString();
                String javaString2 = luaValueArr[1].toJavaString();
                float f = luaValueArr[2].toFloat();
                int i = luaValueArr[3].toInt();
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(f);
                float fApplyDimension = TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
                InterfaceC7304ahM interfaceC7304ahMEjfBZ = C7323ahf.ejfBZ();
                if (interfaceC7304ahMEjfBZ != null) {
                    textPaint.setTextSize(fApplyDimension);
                    textPaint.setTypeface(interfaceC7304ahMEjfBZ.KWHzl(javaString2));
                }
                StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(javaString, 0, javaString.length(), textPaint, C55298xhM.dpInt$default(i, (Context) null, 1, (Object) null)).setText(javaString).build();
                Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "");
                LuaNumber luaNumberValueOf = LuaNumber.valueOf(C55298xhM.px2dp$default(staticLayoutBuild.getHeight(), (Context) null, 1, (Object) null));
                Intrinsics.checkNotNullExpressionValue(luaNumberValueOf, "");
                return luaNumberValueOf;
            }
            LuaNumber luaNumberValueOf2 = LuaNumber.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(luaNumberValueOf2, "");
            return luaNumberValueOf2;
        } catch (Exception unused) {
            LuaNumber luaNumberValueOf3 = LuaNumber.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(luaNumberValueOf3, "");
            return luaNumberValueOf3;
        }
    }

    @LuaBridge
    public final LuaNumber isKlineThemeMode() {
        String string = SPUtils.getString("kline_theme_type", "kline_dark");
        if (Intrinsics.EZpvd((Object) string, (Object) "kline_white")) {
            LuaNumber luaNumberValueOf = LuaNumber.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(luaNumberValueOf, "");
            return luaNumberValueOf;
        }
        if (Intrinsics.EZpvd((Object) string, (Object) "kline_dark")) {
            LuaNumber luaNumberValueOf2 = LuaNumber.valueOf(1);
            Intrinsics.checkNotNullExpressionValue(luaNumberValueOf2, "");
            return luaNumberValueOf2;
        }
        LuaNumber luaNumberValueOf3 = C33492mxV.OLrzqt() ? LuaNumber.valueOf(1) : LuaNumber.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(luaNumberValueOf3, "");
        return luaNumberValueOf3;
    }

    @LuaBridge
    public final LuaValue getStableCoin() {
        LuaValue luaValueCopydefault = LuaString.copydefault(qTC.copydefault.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(luaValueCopydefault, "");
        return luaValueCopydefault;
    }

    @LuaBridge
    public final LuaValue triggerVibration() {
        Object systemService = C32979mnm.EZpvd.OLrzqt().getSystemService("vibrator");
        Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (i >= 29) {
                if (vibrator != null) {
                    vibrator.vibrate(VibrationEffect.createOneShot(100L, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384));
                }
            } else if (vibrator != null) {
                vibrator.vibrate(VibrationEffect.createOneShot(100L, -1));
            }
        } else if (vibrator != null) {
            vibrator.vibrate(100L);
        }
        LuaValue luaValueNil = LuaValue.Nil();
        Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
        return luaValueNil;
    }

    @LuaBridge
    public final LuaValue getProductABSwitch(@NotNull LuaValue[] luaValueArr) {
        LuaValue luaValueCopydefault;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        if (javaString == null || javaString.length() == 0) {
            LuaValue luaValueCopydefault2 = LuaString.copydefault("");
            Intrinsics.checkNotNullExpressionValue(luaValueCopydefault2, "");
            return luaValueCopydefault2;
        }
        String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, javaString, null, 2, null);
        if (value$default != null && (luaValueCopydefault = LuaString.copydefault(value$default)) != null) {
            return luaValueCopydefault;
        }
        LuaValue luaValueCopydefault3 = LuaString.copydefault("");
        Intrinsics.checkNotNullExpressionValue(luaValueCopydefault3, "");
        return luaValueCopydefault3;
    }

    @LuaBridge
    public final LuaValue getGrayABSwitch(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        if (javaString == null || javaString.length() == 0) {
            LuaValue luaValueAEQbTJ = LuaBoolean.AEQbTJ(false);
            Intrinsics.checkNotNullExpressionValue(luaValueAEQbTJ, "");
            return luaValueAEQbTJ;
        }
        LuaValue luaValueAEQbTJ2 = LuaBoolean.AEQbTJ(C35202nqq.OLrzqt.AEQbTJ(javaString));
        Intrinsics.checkNotNullExpressionValue(luaValueAEQbTJ2, "");
        return luaValueAEQbTJ2;
    }

    @LuaBridge
    public final LuaValue getCurrentUsername(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValueCopydefault = LuaString.copydefault(C55686xod.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(luaValueCopydefault, "");
        return luaValueCopydefault;
    }

    @LuaBridge
    public final LuaValue shareFeedDetail(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        String str = C33129mqd.OLrzqt((CharSequence) javaString) ? javaString : null;
        if (str == null) {
            LuaValue luaValueNil = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
            return luaValueNil;
        }
        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            LuaValue luaValueNil2 = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil2, "");
            return luaValueNil2;
        }
        KWHzl((InterfaceC48893ueK) C43248rlh.KWHzl.OLrzqt(InterfaceC48893ueK.class), str, "", "market_feed_detail", Uri.parse(str).getQueryParameter("deeplink"), activityAEQbTJ);
        LuaValue luaValueNil3 = LuaValue.Nil();
        Intrinsics.checkNotNullExpressionValue(luaValueNil3, "");
        return luaValueNil3;
    }

    @LuaBridge
    public final LuaValue sharePageSnapshot(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        String javaString3 = luaValue != null ? luaValue.toJavaString() : null;
        String str = C33129mqd.OLrzqt((CharSequence) javaString3) ? javaString3 : null;
        if (str == null) {
            LuaValue luaValueNil = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil, "");
            return luaValueNil;
        }
        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            LuaValue luaValueNil2 = LuaValue.Nil();
            Intrinsics.checkNotNullExpressionValue(luaValueNil2, "");
            return luaValueNil2;
        }
        String strKWHzl = KWHzl(str);
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.OLrzqt(InterfaceC48893ueK.class);
        LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        if (luaValue2 == null || (javaString = luaValue2.toJavaString()) == null) {
            javaString = "market_feed_detail";
        }
        String str2 = javaString;
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
        KWHzl(interfaceC48893ueK, str, (luaValue3 == null || (javaString2 = luaValue3.toJavaString()) == null) ? "" : javaString2, str2, strKWHzl, activityAEQbTJ);
        LuaValue luaValueNil3 = LuaValue.Nil();
        Intrinsics.checkNotNullExpressionValue(luaValueNil3, "");
        return luaValueNil3;
    }

    public final String KWHzl(String str) {
        try {
            String strDecode = URLDecoder.decode(StringsKt__StringsKt.substringAfter$default(str, "deeplink=", (String) null, 2, (Object) null), C.UTF8_NAME);
            Intrinsics.copydefault((Object) strDecode);
            return strDecode;
        } catch (Exception e) {
            pUU.AEQbTJ("OKMarketBridge", "parseComplexUrl failed", e);
            return "";
        }
    }

    public final void KWHzl(final InterfaceC48893ueK interfaceC48893ueK, String str, final String str2, final String str3, final String str4, final Activity activity) {
        AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ;
        if (interfaceC48893ueK == null || (abstractC58185ywXAEQbTJ = interfaceC48893ueK.AEQbTJ(str, new C48891ueI(str3, str4, false, null, null, 28, null))) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: o.unW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UDOKMarketBridge.AEQbTJ(activity, str3, this, interfaceC48893ueK, str2, str4, (C48887ueE) obj);
            }
        };
        InterfaceC58227yxM<? super C48887ueE> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.uod
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                UDOKMarketBridge.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.uoa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UDOKMarketBridge.AhwBna((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.uoe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                UDOKMarketBridge.AYXKKw(function12, obj);
            }
        });
        if (interfaceC58217yxCAEQbTJ != null) {
            C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, activity);
        }
    }

    public static final void AhwBna(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(final Activity activity, final String str, UDOKMarketBridge uDOKMarketBridge, final InterfaceC48893ueK interfaceC48893ueK, final String str2, final String str3, final C48887ueE c48887ueE) {
        pUU.EZpvd("OKMarketBridge", "short link created: " + c48887ueE.OLrzqt());
        final C49352umt c49352umt = new C49352umt(activity);
        c49352umt.setFrom(str);
        C33487mxQ.EZpvd(c49352umt, C33570myu.AEQbTJ(), C33570myu.EZpvd());
        uDOKMarketBridge.copydefault(activity, new Function1() { // from class: o.uoi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UDOKMarketBridge.KWHzl(c49352umt, activity, interfaceC48893ueK, str, c48887ueE, str2, str3, (android.graphics.Bitmap) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C49352umt c49352umt, final Activity activity, final InterfaceC48893ueK interfaceC48893ueK, final String str, final C48887ueE c48887ueE, final String str2, final String str3, Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapOLrzqt = C33487mxQ.OLrzqt(bitmap, C33570myu.EZpvd(c49352umt));
            ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
            Intrinsics.copydefault(bitmapOLrzqt);
            Intrinsics.copydefault(activity, "");
            stateListAnimator.copydefault(bitmapOLrzqt, (LifecycleOwner) activity, new Function1() { // from class: o.uob
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDOKMarketBridge.AEQbTJ((java.lang.Throwable) obj);
                }
            }, new Function1() { // from class: o.uoc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDOKMarketBridge.OLrzqt(activity, interfaceC48893ueK, str, c48887ueE, str2, str3, (java.io.File) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.AEQbTJ("OKMarketBridge", "savePendingShareBitmap failed", th);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Activity activity, InterfaceC48893ueK interfaceC48893ueK, final String str, final C48887ueE c48887ueE, final String str2, final String str3, File file) {
        Intrinsics.checkNotNullParameter(file, "");
        pUU.EZpvd("OKMarketBridge", "savePendingShareBitmap ok");
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.KWHzl(absolutePath, new Function1() { // from class: o.uof
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UDOKMarketBridge.KWHzl(str, c48887ueE, str2, str3, (ImageShareParams) obj);
            }
        }), null, 2, null);
        ISharePreviewConfig previewConfig = shareConfigCreate$default.getPreviewConfig();
        BasePreviewConfig basePreviewConfig = previewConfig instanceof BasePreviewConfig ? (BasePreviewConfig) previewConfig : null;
        if (basePreviewConfig != null) {
            basePreviewConfig.setPreviewBottomTips("");
        }
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null) {
            return Unit.INSTANCE;
        }
        interfaceC48893ueK.copydefault(abstractActivityC33041mov, shareConfigCreate$default);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(String str, C48887ueE c48887ueE, String str2, String str3, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom(str);
        imageShareParams.setBody(c48887ueE.OLrzqt());
        if (C33129mqd.OLrzqt((CharSequence) str2)) {
            imageShareParams.getExtras().putBoolean("isEnableIMShare", true);
            pUU.EZpvd("OKMarketBridge", "ccy = " + str2);
            imageShareParams.getExtras().putParcelable("imMessageShare", new IMMessageShareModel(str2 + " " + C33070mpX.AYXKKw(qZH.PendingIntent.accept), C33070mpX.AYXKKw(qZH.PendingIntent.izFvvl), C33070mpX.AYXKKw(qZH.PendingIntent.accept), (String) null, (String) null, str3, c48887ueE.OLrzqt(), C33070mpX.AYXKKw(qZH.PendingIntent.OqFWZa), IMMessageShareModel.CTAType.ViewMore, (Map) null, "okmarket_feed_ai_insight", 536, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(Throwable th) {
        pUU.AEQbTJ("OKMarketBridge", "create short link failed", th);
        return Unit.INSTANCE;
    }

    public final void copydefault(Activity activity, final Function1<? super Bitmap, Unit> function1) {
        try {
            Result.Application application = Result.Companion;
            Window window = activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "");
            View decorView = window.getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "");
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
            int[] iArr = new int[2];
            decorView.getLocationInWindow(iArr);
            int i = iArr[0];
            Rect rect = new Rect(i, iArr[1], decorView.getWidth() + i, iArr[1] + decorView.getHeight());
            if (Build.VERSION.SDK_INT >= 26) {
                PixelCopy.request(window, rect, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: o.uol
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i2) {
                        UDOKMarketBridge.copydefault(function1, bitmapCreateBitmap, i2);
                    }
                }, decorView.getHandler());
            } else {
                function1.invoke(C33570myu.copydefault(decorView, true));
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final void copydefault(Function1 function1, Bitmap bitmap, int i) {
        if (i == 0) {
            function1.invoke(bitmap);
        } else {
            function1.invoke(null);
        }
    }

    @LuaBridge
    public final void filterUserPreFeed(@NotNull LuaValue[] luaValueArr) {
        LuaTable luaTable;
        LuaValue luaValue;
        final LuaFunction luaFunction;
        LuaValue luaValue2;
        String javaString;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue3 == null || (luaTable = luaValue3.toLuaTable()) == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 1)) == null || (luaFunction = luaValue.toLuaFunction()) == null || (luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 2)) == null || (javaString = luaValue2.toJavaString()) == null) {
            return;
        }
        List listCopydefault = C7910asj.copydefault(luaTable);
        Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        Iterator it = listCopydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        Globals globals = this.copydefault;
        InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
        C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        InterfaceC43033rhe interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.copydefault(InterfaceC43033rhe.class);
        AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
        if (abstractActivityC33041mov == null) {
            return;
        }
        interfaceC43033rhe.copydefault(abstractActivityC33041mov, javaString, arrayList, new Function1() { // from class: o.uoo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UDOKMarketBridge.EZpvd(luaFunction, (java.util.List) obj);
            }
        });
    }

    public static final Unit EZpvd(LuaFunction luaFunction, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        Globals globals = luaFunction.getGlobals();
        if (globals == null) {
            return Unit.INSTANCE;
        }
        LuaTable luaTableOLrzqt = C7910asj.OLrzqt(globals, list);
        Intrinsics.checkNotNullExpressionValue(luaTableOLrzqt, "");
        luaFunction.invoke(LuaValue.varargsOf(luaTableOLrzqt));
        return Unit.INSTANCE;
    }

    @LuaBridge
    public final LuaValue showFeedDetailSharingDialog(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        UDOKMarketBridge uDOKMarketBridge;
        final boolean z;
        AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ;
        String javaString3;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        if (luaValue != null && (javaString = luaValue.toJavaString()) != null) {
            final String str = C33129mqd.OLrzqt((CharSequence) javaString) ? javaString : null;
            if (str != null) {
                LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
                final String str2 = (luaValue2 == null || (javaString3 = luaValue2.toJavaString()) == null || !C33129mqd.OLrzqt((CharSequence) javaString3)) ? null : javaString3;
                LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
                if (luaValue3 != null && (javaString2 = luaValue3.toJavaString()) != null) {
                    if (!C33129mqd.OLrzqt((CharSequence) javaString2)) {
                        javaString2 = null;
                    }
                    if (javaString2 != null) {
                        LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 3);
                        if (luaValue4 != null) {
                            z = luaValue4.toBoolean();
                            uDOKMarketBridge = this;
                        } else {
                            uDOKMarketBridge = this;
                            z = true;
                        }
                        Globals globals = uDOKMarketBridge.copydefault;
                        InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
                        C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
                        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
                        AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
                        if (abstractActivityC33041mov == null) {
                            LuaValue luaValueFalse = LuaValue.False();
                            Intrinsics.checkNotNullExpressionValue(luaValueFalse, "");
                            return luaValueFalse;
                        }
                        String queryParameter = Uri.parse(javaString2).getQueryParameter("deeplink");
                        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.OLrzqt(InterfaceC48893ueK.class);
                        if (interfaceC48893ueK != null && (abstractC58185ywXAEQbTJ = interfaceC48893ueK.AEQbTJ(javaString2, new C48891ueI("market_feed_detail", queryParameter, false, null, null, 28, null))) != null) {
                            final String str3 = "market_feed_detail";
                            final AbstractActivityC33041mov abstractActivityC33041mov2 = abstractActivityC33041mov;
                            final Function1 function1 = new Function1() { // from class: o.uok
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return UDOKMarketBridge.KWHzl(abstractActivityC33041mov2, str3, str, str2, z, (C48887ueE) obj);
                                }
                            };
                            InterfaceC58227yxM<? super C48887ueE> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.uom
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58227yxM
                                public final void accept(java.lang.Object obj) {
                                    UDOKMarketBridge.gEmmrt(function1, obj);
                                }
                            };
                            final Function1 function12 = new Function1() { // from class: o.uot
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return UDOKMarketBridge.AYXKKw((java.lang.Throwable) obj);
                                }
                            };
                            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.uop
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58227yxM
                                public final void accept(java.lang.Object obj) {
                                    UDOKMarketBridge.djBIcL(function12, obj);
                                }
                            });
                            if (interfaceC58217yxCAEQbTJ != null) {
                                C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, abstractActivityC33041mov);
                            }
                        }
                        LuaValue luaValueTrue = LuaValue.True();
                        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
                        return luaValueTrue;
                    }
                }
                LuaValue luaValueFalse2 = LuaValue.False();
                Intrinsics.checkNotNullExpressionValue(luaValueFalse2, "");
                return luaValueFalse2;
            }
        }
        LuaValue luaValueFalse3 = LuaValue.False();
        Intrinsics.checkNotNullExpressionValue(luaValueFalse3, "");
        return luaValueFalse3;
    }

    public static final void gEmmrt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, final String str, final String str2, final String str3, final boolean z, final C48887ueE c48887ueE) {
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(ImageShareParams.Companion.OLrzqt(new Function1() { // from class: o.uoq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UDOKMarketBridge.AEQbTJ(c48887ueE, str, str2, str3, z, (ImageShareParams) obj);
            }
        }), new Function1() { // from class: o.unX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UDOKMarketBridge.AEQbTJ((ShareConfig) obj);
            }
        });
        MultiShareConfig multiShareConfigCreate$default = MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, C56402yEa.EZpvd(shareConfigCopydefault), false, 0.0f, false, null, null, 62, null);
        ISharePreviewConfig previewConfig = shareConfigCopydefault.getPreviewConfig();
        ImageCustomPreviewConfig imageCustomPreviewConfig = previewConfig instanceof ImageCustomPreviewConfig ? (ImageCustomPreviewConfig) previewConfig : null;
        if (imageCustomPreviewConfig != null) {
            imageCustomPreviewConfig.setPreviewBottomTips("");
        }
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.OLrzqt(InterfaceC48893ueK.class);
        if (interfaceC48893ueK != null) {
            interfaceC48893ueK.OLrzqt(abstractActivityC33041mov, multiShareConfigCreate$default);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C48887ueE c48887ueE, String str, String str2, String str3, boolean z, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setBody(c48887ueE.OLrzqt());
        imageShareParams.setShareFrom(str);
        imageShareParams.getExtras().putString("id", str2);
        imageShareParams.getExtras().putString("data", str3);
        imageShareParams.getExtras().putBoolean("isFixedSize", z);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageCustomPreviewConfig.Activity.create$default(ImageCustomPreviewConfig.Companion, C34929nli.class, null, null, 6, null));
        shareConfig.getPreviewConfig().setEditable(false);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(Throwable th) {
        pUU.AEQbTJ("OKMarketBridge", "create short link failed", th);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f6  */
    @LuaBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LuaValue showFeedDetailSharingDialogToIM(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        String lowerCase;
        final String str;
        String javaString3;
        final String str2;
        String str3;
        AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ;
        String javaString4;
        String javaString5;
        String javaString6;
        String javaString7;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        if (luaValue != null && (javaString = luaValue.toJavaString()) != null) {
            final String str4 = C33129mqd.OLrzqt((CharSequence) javaString) ? javaString : null;
            if (str4 != null) {
                LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
                final String str5 = (luaValue2 == null || (javaString7 = luaValue2.toJavaString()) == null || !C33129mqd.OLrzqt((CharSequence) javaString7)) ? null : javaString7;
                LuaValue luaValue3 = (LuaValue) yDV.gEmmrt(luaValueArr, 2);
                if (luaValue3 != null && (javaString2 = luaValue3.toJavaString()) != null) {
                    if (!C33129mqd.OLrzqt((CharSequence) javaString2)) {
                        javaString2 = null;
                    }
                    if (javaString2 != null) {
                        LuaValue luaValue4 = (LuaValue) yDV.gEmmrt(luaValueArr, 3);
                        final boolean z = luaValue4 != null ? luaValue4.toBoolean() : true;
                        LuaValue luaValue5 = (LuaValue) yDV.gEmmrt(luaValueArr, 4);
                        if (luaValue5 == null || (javaString6 = luaValue5.toJavaString()) == null) {
                            lowerCase = SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER;
                        } else {
                            if (!C33129mqd.OLrzqt((CharSequence) javaString6)) {
                                javaString6 = null;
                            }
                            if (javaString6 != null) {
                                lowerCase = javaString6.toLowerCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                                if (lowerCase == null) {
                                }
                            }
                        }
                        final String str6 = lowerCase;
                        LuaValue luaValue6 = (LuaValue) yDV.gEmmrt(luaValueArr, 5);
                        if (luaValue6 == null || (javaString5 = luaValue6.toJavaString()) == null) {
                            str = "--";
                        } else {
                            if (!C33129mqd.OLrzqt((CharSequence) javaString5)) {
                                javaString5 = null;
                            }
                            if (javaString5 != null) {
                                str = javaString5;
                            }
                        }
                        LuaValue luaValue7 = (LuaValue) yDV.gEmmrt(luaValueArr, 6);
                        if (luaValue7 == null || (javaString3 = luaValue7.toJavaString()) == null) {
                            javaString3 = "--";
                        } else {
                            if (!C33129mqd.OLrzqt((CharSequence) javaString3)) {
                                javaString3 = null;
                            }
                            if (javaString3 == null) {
                            }
                        }
                        final String string = StringsKt__StringsKt.hDKMBd((CharSequence) new Regex("[\r\n]+|<[^>]+>").replace(javaString3, "")).toString();
                        LuaValue luaValue8 = (LuaValue) yDV.gEmmrt(luaValueArr, 7);
                        if (luaValue8 == null || (javaString4 = luaValue8.toJavaString()) == null) {
                            str2 = "--";
                        } else {
                            if (!C33129mqd.OLrzqt((CharSequence) javaString4)) {
                                javaString4 = null;
                            }
                            if (javaString4 != null) {
                                str2 = javaString4;
                            }
                        }
                        LuaValue luaValue9 = (LuaValue) yDV.gEmmrt(luaValueArr, 8);
                        final boolean z2 = luaValue9 != null ? luaValue9.toBoolean() : true;
                        pUU.EZpvd("OKMarketBridge", "IM sourcePlatform = " + str6 + ", translatedTitle = " + str + " format:" + string + " , translatedContent = " + javaString3 + ", author = " + str2);
                        Globals globals = this.copydefault;
                        InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
                        C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
                        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
                        AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
                        if (abstractActivityC33041mov == null) {
                            LuaValue luaValueFalse = LuaValue.False();
                            Intrinsics.checkNotNullExpressionValue(luaValueFalse, "");
                            return luaValueFalse;
                        }
                        final String queryParameter = Uri.parse(javaString2).getQueryParameter("deeplink");
                        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.OLrzqt(InterfaceC48893ueK.class);
                        if (interfaceC48893ueK == null || (abstractC58185ywXAEQbTJ = interfaceC48893ueK.AEQbTJ(javaString2, new C48891ueI("market_feed_detail", queryParameter, false, null, null, 28, null))) == null) {
                            str3 = "";
                        } else {
                            final String str7 = "market_feed_detail";
                            final AbstractActivityC33041mov abstractActivityC33041mov2 = abstractActivityC33041mov;
                            str3 = "";
                            final Function1 function1 = new Function1() { // from class: o.unV
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return UDOKMarketBridge.copydefault(abstractActivityC33041mov2, str7, str4, str5, z, z2, str6, str2, str, queryParameter, string, (C48887ueE) obj);
                                }
                            };
                            InterfaceC58227yxM<? super C48887ueE> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.unY
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58227yxM
                                public final void accept(java.lang.Object obj) {
                                    UDOKMarketBridge.values(function1, obj);
                                }
                            };
                            final Function1 function12 = new Function1() { // from class: o.uoh
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return UDOKMarketBridge.valueOf((java.lang.Throwable) obj);
                                }
                            };
                            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.uon
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58227yxM
                                public final void accept(java.lang.Object obj) {
                                    UDOKMarketBridge.fetchVPNInfo(function12, obj);
                                }
                            });
                            if (interfaceC58217yxCAEQbTJ != null) {
                                C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, abstractActivityC33041mov);
                            }
                        }
                        LuaValue luaValueTrue = LuaValue.True();
                        Intrinsics.checkNotNullExpressionValue(luaValueTrue, str3);
                        return luaValueTrue;
                    }
                }
                LuaValue luaValueFalse2 = LuaValue.False();
                Intrinsics.checkNotNullExpressionValue(luaValueFalse2, "");
                return luaValueFalse2;
            }
        }
        LuaValue luaValueFalse3 = LuaValue.False();
        Intrinsics.checkNotNullExpressionValue(luaValueFalse3, "");
        return luaValueFalse3;
    }

    public static final void values(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov, final String str, final String str2, final String str3, final boolean z, final boolean z2, final String str4, final String str5, final String str6, final String str7, final String str8, final C48887ueE c48887ueE) {
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(ImageShareParams.Companion.OLrzqt(new Function1() { // from class: o.uog
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UDOKMarketBridge.AEQbTJ(c48887ueE, str, str2, str3, z, z2, str4, str5, str6, str7, str8, (ImageShareParams) obj);
            }
        }), new Function1() { // from class: o.uoj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return UDOKMarketBridge.EZpvd((ShareConfig) obj);
            }
        });
        MultiShareConfig multiShareConfigCreate$default = MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, C56402yEa.EZpvd(shareConfigCopydefault), false, 0.0f, false, null, null, 62, null);
        ISharePreviewConfig previewConfig = shareConfigCopydefault.getPreviewConfig();
        ImageCustomPreviewConfig imageCustomPreviewConfig = previewConfig instanceof ImageCustomPreviewConfig ? (ImageCustomPreviewConfig) previewConfig : null;
        if (imageCustomPreviewConfig != null) {
            imageCustomPreviewConfig.setPreviewBottomTips("");
        }
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43248rlh.KWHzl.OLrzqt(InterfaceC48893ueK.class);
        if (interfaceC48893ueK != null) {
            interfaceC48893ueK.OLrzqt(abstractActivityC33041mov, multiShareConfigCreate$default);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C48887ueE c48887ueE, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setBody(c48887ueE.OLrzqt());
        imageShareParams.setShareFrom(str);
        imageShareParams.getExtras().putString("SHARE_SHORT_LINK", c48887ueE.OLrzqt());
        imageShareParams.getExtras().putString("id", str2);
        imageShareParams.getExtras().putString("data", str3);
        imageShareParams.getExtras().putBoolean("isFixedSize", z);
        imageShareParams.getExtras().putBoolean("showTranslatedContent", z2);
        imageShareParams.getExtras().putBoolean("isEnableIMShare", true);
        String str9 = Intrinsics.EZpvd((Object) str4, (Object) SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER) ? "okmarket_content_twitter_feed" : "okmarket_content_news_feed";
        imageShareParams.getExtras().putParcelable("imMessageShare", new IMMessageShareModel((Intrinsics.EZpvd((Object) str4, (Object) SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER) || Intrinsics.EZpvd((Object) str4, (Object) SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_OKX)) ? str5 : str6, str8, C33070mpX.AYXKKw((Intrinsics.EZpvd((Object) str4, (Object) SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_TWITTER) || Intrinsics.EZpvd((Object) str4, (Object) SearchResultContentPo.SearchResultContentItemPo.SOURCE_PLATFORM_OKX)) ? qZH.PendingIntent.AxsJAYsNCnLh : qZH.PendingIntent.DAIeex), "", (String) null, str7 == null ? "" : str7, (String) null, C33070mpX.AYXKKw(qZH.PendingIntent.OqFWZa), IMMessageShareModel.CTAType.ViewMore, (Map) null, str9, 592, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageCustomPreviewConfig.Activity.create$default(ImageCustomPreviewConfig.Companion, C34929nli.class, null, null, 6, null));
        shareConfig.getPreviewConfig().setEditable(false);
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(Throwable th) {
        pUU.AEQbTJ("OKMarketBridge", "create short link failed", th);
        return Unit.INSTANCE;
    }

    @LuaBridge
    public final LuaValue notifyEvent(@NotNull LuaValue[] luaValueArr) {
        String javaString;
        String javaString2;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        if (luaValue != null && (javaString = luaValue.toJavaString()) != null) {
            String str = null;
            if (!C33129mqd.OLrzqt((CharSequence) javaString)) {
                javaString = null;
            }
            if (javaString != null) {
                LuaValue luaValue2 = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
                if (luaValue2 != null && (javaString2 = luaValue2.toJavaString()) != null && C33129mqd.OLrzqt((CharSequence) javaString2)) {
                    str = javaString2;
                }
                new C49385unZ(javaString, str).AEQbTJ();
                LuaValue luaValueTrue = LuaValue.True();
                Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
                return luaValueTrue;
            }
        }
        LuaValue luaValueFalse = LuaValue.False();
        Intrinsics.checkNotNullExpressionValue(luaValueFalse, "");
        return luaValueFalse;
    }

    @LuaBridge
    public final LuaValue formatQuantity(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        String javaString = luaValue != null ? luaValue.toJavaString() : null;
        if (javaString == null || javaString.length() == 0) {
            LuaValue luaValueCopydefault = LuaString.copydefault("");
            Intrinsics.checkNotNullExpressionValue(luaValueCopydefault, "");
            return luaValueCopydefault;
        }
        LuaValue luaValueCopydefault2 = LuaString.copydefault(pTB.formatLocalized$default(javaString, null, 1, null));
        Intrinsics.checkNotNullExpressionValue(luaValueCopydefault2, "");
        return luaValueCopydefault2;
    }

    @LuaBridge
    public final LuaValue clearViewClick(@NotNull LuaValue[] luaValueArr) {
        View viewF_;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        LuaUserdata userdata = luaValue != null ? luaValue.toUserdata() : null;
        UDView uDView = userdata instanceof UDView ? (UDView) userdata : null;
        if (uDView != null && (viewF_ = uDView.f_()) != null) {
            viewF_.setOnClickListener(null);
            viewF_.setClickable(false);
        }
        LuaValue luaValueTrue = LuaValue.True();
        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
        return luaValueTrue;
    }

    @LuaBridge
    public final LuaValue isMarketEnabledInExplore() {
        LuaValue luaValueTrue = C27563jxZ.OLrzqt.fetchVPNInfo() ? LuaValue.True() : LuaValue.False();
        Intrinsics.checkNotNullExpressionValue(luaValueTrue, "");
        return luaValueTrue;
    }

    @LuaBridge
    public final LuaValue isCedefiBoostEnabledInExplore() {
        LuaValue luaValueFalse;
        String str;
        boolean zEZpvd = C27563jxZ.OLrzqt.EZpvd();
        if (C54586xNw.OLrzqt.EZpvd() && zEZpvd) {
            luaValueFalse = LuaValue.True();
            str = "True(...)";
        } else {
            luaValueFalse = LuaValue.False();
            str = "False(...)";
        }
        Intrinsics.checkNotNullExpressionValue(luaValueFalse, str);
        return luaValueFalse;
    }

    @LuaBridge
    public final LuaValue enableCeDeFiBoost() {
        LuaValue luaValueFalse;
        String str;
        if (C27563jxZ.OLrzqt.EZpvd()) {
            luaValueFalse = LuaValue.True();
            str = "True(...)";
        } else {
            luaValueFalse = LuaValue.False();
            str = "False(...)";
        }
        Intrinsics.checkNotNullExpressionValue(luaValueFalse, str);
        return luaValueFalse;
    }
}

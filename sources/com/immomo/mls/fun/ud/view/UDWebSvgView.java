package com.immomo.mls.fun.ud.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.google.gson.Gson;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.view.UDWebSvgView;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import java.io.File;
import java.io.FileInputStream;
import o.AbstractC58247yxg;
import o.C33610mzh;
import o.C34703nhO;
import o.C58266yxz;
import o.C7323ahf;
import o.C7546alq;
import o.InterfaceC5462Sq;
import o.InterfaceC58217yxC;
import o.InterfaceC58249yxi;
import o.InterfaceC58251yxk;
import o.InterfaceC58256yxp;
import o.InterfaceC60044zuT;
import o.RY;
import o.yBP;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDWebSvgView extends UDViewGroup<FrameLayout> {
    public static final String[] copydefault = {"setImageUrl", "saveImage", "setBase64Image", "loadHTMLContent", "setMaskHidden", "setPlaceholderHidden", "interceptTouchEvent", "callJSFunction", "setupCommonJSHandlerCallback"};
    public float AEQbTJ;
    public String AYXKKw;
    public float AhwBna;
    public float AkhnZx;
    public final float EZpvd;
    public float KWHzl;
    public boolean OLrzqt;
    public ImageView djBIcL;
    public LuaFunction gEmmrt;
    public WebView valueOf;
    public Bitmap values;

    public UDWebSvgView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.EZpvd = 5.0f;
        this.values = null;
        this.OLrzqt = false;
    }

    @InterfaceC60044zuT
    public LuaValue[] setImageUrl(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length != 0) {
            this.AYXKKw = luaValueArr[0].toJavaString();
            if (luaValueArr.length < 2) {
                copydefault((JDImageInfo) null);
            } else {
                copydefault(((UDImageInfo) luaValueArr[1]).EZpvd());
            }
        }
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setBase64Image(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length != 0) {
            final boolean z = false;
            final String javaString = (luaValueArr.length <= 0 || luaValueArr[0].isNil()) ? "" : luaValueArr[0].toJavaString();
            if (luaValueArr.length > 2 && !luaValueArr[1].isNil() && luaValueArr[1].toBoolean()) {
                z = true;
            }
            final UDImageInfo uDImageInfo = (luaValueArr.length <= 3 || luaValueArr[2].isNil()) ? null : (UDImageInfo) luaValueArr[2];
            this.djBIcL.setVisibility(8);
            AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.akm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58249yxi
                public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) throws java.lang.Exception {
                    UDWebSvgView.AEQbTJ(z, javaString, interfaceC58251yxk);
                }
            }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt()).subscribe(new InterfaceC58256yxp<String>() { // from class: com.immomo.mls.fun.ud.view.UDWebSvgView.3
                @Override // o.InterfaceC58256yxp
                public void onComplete() {
                }

                @Override // o.InterfaceC58256yxp
                public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
                }

                /* JADX DEBUG: Method merged with bridge method: onNext(Ljava/lang/Object;)V */
                @Override // o.InterfaceC58256yxp
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public void onNext(String str) {
                    try {
                        UDWebSvgView.this.valueOf.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
                    } catch (Exception unused) {
                        UDImageInfo uDImageInfo2 = uDImageInfo;
                        if (uDImageInfo2 != null) {
                            UDWebSvgView.this.AEQbTJ(uDImageInfo2.EZpvd());
                        }
                    }
                }

                @Override // o.InterfaceC58256yxp
                public void onError(Throwable th) {
                    UDImageInfo uDImageInfo2 = uDImageInfo;
                    if (uDImageInfo2 != null) {
                        UDWebSvgView.this.AEQbTJ(uDImageInfo2.EZpvd());
                    }
                }
            });
        }
        return null;
    }

    public static /* synthetic */ void AEQbTJ(boolean z, String str, InterfaceC58251yxk interfaceC58251yxk) throws Exception {
        interfaceC58251yxk.onNext(String.format(z ? "<html style=\"width:100%%;height:100%%;\"><body style=\"width:100%%;height:100%%;margin:0;\">\n                         <div style=\"width: 100%%;height:100%%;margin:0;\">\n                         <img style=\"width: 100%%; height: 100%%;margin:0;object-fit: contain;\" src=\"data:image/svg+xml;base64, %s\" />\n                         </div>\n                         </body></html>" : "<html style=\"width:100%%;height:100%%;\"><body style=\"width:100%%;height:100%%;margin:0;\">\n                         <div style=\"width:100%%;height:100%%;margin:0;\">\n                         <img style=\"width:100%%;height:100%%;margin:0;object-fit: contain;image-rendering:pixelated;\" src=\"data:image/png;base64,%s\" />\n                         </div>\n                         </body></html>", str));
    }

    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    @InterfaceC60044zuT
    public LuaValue[] saveImage(LuaValue[] luaValueArr) {
        this.valueOf.setDrawingCacheEnabled(true);
        this.values = this.valueOf.getDrawingCache();
        LuaFunction luaFunction = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        if (this.values != null) {
            try {
                AubY().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(C33610mzh.OLrzqt.EZpvd(AubY(), Uri.parse(MediaStore.Images.Media.insertImage(AubY().getContentResolver(), this.values, C34703nhO.OLrzqt(AubY()) + "_" + System.currentTimeMillis(), (String) null)))))));
                if (luaFunction != null) {
                    luaFunction.EZpvd(2.0d);
                }
            } catch (Exception unused) {
                if (luaFunction != null) {
                    luaFunction.EZpvd(1.0d);
                }
            }
        }
        this.valueOf.setDrawingCacheEnabled(false);
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public FrameLayout AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        C7546alq c7546alq = new C7546alq(AubY(), this);
        c7546alq.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WebView webView = new WebView(AubY());
        this.valueOf = webView;
        webView.setBackgroundColor(0);
        c7546alq.addView(this.valueOf, new ViewGroup.LayoutParams(-1, -1));
        this.valueOf.getSettings().setDisplayZoomControls(false);
        this.valueOf.getSettings().setSupportZoom(false);
        this.valueOf.getSettings().setBuiltInZoomControls(false);
        this.valueOf.getSettings().setJavaScriptEnabled(true);
        this.valueOf.getSettings().setDomStorageEnabled(true);
        this.valueOf.addJavascriptInterface(new AnonymousClass5(), "okxCommonJSHandler");
        ImageView imageView = new ImageView(AubY());
        this.djBIcL = imageView;
        c7546alq.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        this.djBIcL.setVisibility(8);
        return c7546alq;
    }

    /* JADX INFO: renamed from: com.immomo.mls.fun.ud.view.UDWebSvgView$5, reason: invalid class name */
    public class AnonymousClass5 {
        public AnonymousClass5() {
        }

        @JavascriptInterface
        public void postMessage(final String str) {
            UDWebSvgView.this.valueOf.post(new Runnable() { // from class: o.ako
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.AEQbTJ.EZpvd(str);
                }
            });
        }

        public final /* synthetic */ void EZpvd(String str) {
            if (UDWebSvgView.this.gEmmrt != null) {
                UDWebSvgView.this.gEmmrt.invoke(LuaValue.rString(str));
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] interceptTouchEvent(LuaValue[] luaValueArr) {
        this.OLrzqt = true;
        this.valueOf.setOnTouchListener(new View.OnTouchListener() { // from class: o.akp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return UDWebSvgView.OLrzqt(view, motionEvent);
            }
        });
        return null;
    }

    public static /* synthetic */ boolean OLrzqt(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 2) {
            return false;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    @InterfaceC60044zuT
    public LuaValue[] loadHTMLContent(LuaValue[] luaValueArr) {
        if (this.valueOf == null || luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        String javaString = luaValueArr[0].toJavaString();
        if (TextUtils.isEmpty(javaString)) {
            return LuaValue.rNil();
        }
        String javaString2 = luaValueArr.length > 1 ? luaValueArr[1].toJavaString() : "";
        WebSettings settings = this.valueOf.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        this.valueOf.loadDataWithBaseURL(javaString2, javaString, "text/html", "utf-8", null);
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] setMaskHidden(LuaValue[] luaValueArr) {
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] setPlaceholderHidden(LuaValue[] luaValueArr) {
        ImageView imageView;
        if (luaValueArr == null || luaValueArr.length == 0 || (imageView = this.djBIcL) == null) {
            return LuaValue.rNil();
        }
        imageView.setVisibility(luaValueArr[0].toBoolean() ? 8 : 0);
        return LuaValue.rNil();
    }

    /* JADX INFO: renamed from: com.immomo.mls.fun.ud.view.UDWebSvgView$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes22.dex */
    public class AnonymousClass2 implements RY<File> {
        public final /* synthetic */ JDImageInfo EZpvd;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass2(JDImageInfo jDImageInfo) {
            this.EZpvd = jDImageInfo;
        }

        @Override // o.RY
        public boolean OLrzqt(@Nullable GlideException glideException, Object obj, InterfaceC5462Sq<File> interfaceC5462Sq, boolean z) {
            UDWebSvgView.this.AEQbTJ(this.EZpvd);
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(final File file, Object obj, InterfaceC5462Sq<File> interfaceC5462Sq, DataSource dataSource, boolean z) {
            if (file == null || file.length() == 0) {
                UDWebSvgView.this.AEQbTJ(this.EZpvd);
                return false;
            }
            UDWebSvgView.this.djBIcL.setVisibility(8);
            AbstractC58247yxg.create(new InterfaceC58249yxi() { // from class: o.akt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58249yxi
                public final void subscribe(InterfaceC58251yxk interfaceC58251yxk) throws java.lang.Exception {
                    this.AEQbTJ.KWHzl(file, interfaceC58251yxk);
                }
            }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt()).subscribe(new InterfaceC58256yxp<String>() { // from class: com.immomo.mls.fun.ud.view.UDWebSvgView.2.2
                @Override // o.InterfaceC58256yxp
                public void onComplete() {
                }

                @Override // o.InterfaceC58256yxp
                public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
                }

                /* JADX DEBUG: Method merged with bridge method: onNext(Ljava/lang/Object;)V */
                @Override // o.InterfaceC58256yxp
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public void onNext(String str) {
                    UDWebSvgView.this.valueOf.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
                }

                @Override // o.InterfaceC58256yxp
                public void onError(Throwable th) {
                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                    UDWebSvgView.this.AEQbTJ(anonymousClass2.EZpvd);
                }
            });
            return false;
        }

        public final /* synthetic */ void KWHzl(File file, InterfaceC58251yxk interfaceC58251yxk) throws Exception {
            interfaceC58251yxk.onNext(String.format(!UDWebSvgView.this.AYXKKw.toLowerCase().endsWith(".svg") ? "<html style=\"width:100%%;height:100%%;\"><body style=\"width:100%%;height:100%%;margin:0;\">\n                         <div style=\"width:100%%;height:100%%;margin:0;\">\n                         <img style=\"width:100%%;height:100%%;margin:0;image-rendering:pixelated;\" src=\"data:image/png;base64,%s\" />\n                         </div>\n                         </body></html>" : "<html style=\"width:100%%;height:100%%;\"><body style=\"width:100%%;height:100%%;margin:0;\">\n                         <div style=\"width: 100%%;height:100%%;margin:0;\">\n                         <img style=\"width: 100%%; height: 100%%;margin:0;object-fit: contain;\" src=\"data:image/svg+xml;base64, %s\" />\n                         </div>\n                         </body></html>", Base64.encodeToString(UDWebSvgView.this.AEQbTJ(file), 0)));
        }
    }

    public final void copydefault(JDImageInfo jDImageInfo) {
        Glide.AEQbTJ(AubY()).EZpvd((Object) this.AYXKKw).OLrzqt((RY<File>) new AnonymousClass2(jDImageInfo)).EZpvd();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] onClick(LuaValue[] luaValueArr) {
        final LuaFunction luaFunction = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        this.valueOf.setOnTouchListener(new View.OnTouchListener() { // from class: o.akn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return this.copydefault.copydefault(luaFunction, view, motionEvent);
            }
        });
        return null;
    }

    public final /* synthetic */ boolean copydefault(LuaFunction luaFunction, View view, MotionEvent motionEvent) {
        if (this.OLrzqt && motionEvent.getAction() == 2) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.AEQbTJ = motionEvent.getX();
            this.KWHzl = motionEvent.getY();
            return false;
        }
        if (action != 1) {
            return false;
        }
        this.AhwBna = motionEvent.getX();
        this.AkhnZx = motionEvent.getY();
        if (Math.abs(this.AhwBna - this.AEQbTJ) >= 5.0f || Math.abs(this.AkhnZx - this.KWHzl) >= 5.0f || luaFunction == null) {
            return false;
        }
        luaFunction.OLrzqt();
        return false;
    }

    @InterfaceC60044zuT
    public LuaValue[] callJSFunction(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        String strValueOf = String.valueOf(luaValueArr[0]);
        final LuaFunction luaFunction = (luaValueArr.length <= 1 || !luaValueArr[1].isFunction()) ? null : luaValueArr[1].toLuaFunction();
        WebView webView = this.valueOf;
        if (webView != null) {
            webView.evaluateJavascript(strValueOf, new ValueCallback() { // from class: o.akq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    UDWebSvgView.EZpvd(luaFunction, (java.lang.String) obj);
                }
            });
        }
        return LuaValue.rNil();
    }

    public static /* synthetic */ void EZpvd(LuaFunction luaFunction, String str) {
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rString(new Gson().toJson(str)));
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setupCommonJSHandlerCallback(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        LuaFunction luaFunction = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        if (luaFunction != null) {
            this.gEmmrt = luaFunction;
        }
        return LuaValue.rNil();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public LuaValue[] onLongPress(LuaValue[] luaValueArr) {
        final LuaFunction luaFunction = luaValueArr[0].isFunction() ? luaValueArr[0].toLuaFunction() : null;
        if (luaFunction != null) {
            this.valueOf.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.immomo.mls.fun.ud.view.UDWebSvgView.1
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    luaFunction.OLrzqt();
                    return false;
                }
            });
        }
        return null;
    }

    public final void AEQbTJ(JDImageInfo jDImageInfo) {
        this.djBIcL.setVisibility(0);
        if (jDImageInfo != null) {
            this.djBIcL.setImageDrawable(C7323ahf.AYXKKw().KWHzl(AubY(), jDImageInfo));
            this.valueOf.setVisibility(8);
        }
    }

    public final byte[] AEQbTJ(File file) throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileInputStream.read(bArr);
                fileInputStream.close();
            } catch (Exception unused2) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return bArr;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void AEQbTJ() {
        super.AEQbTJ();
        WebView webView = this.valueOf;
        if (webView != null) {
            webView.removeJavascriptInterface("okxCommonJSHandler");
        }
    }
}

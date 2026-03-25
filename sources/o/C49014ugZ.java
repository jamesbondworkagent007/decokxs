package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.google.gson.Gson;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.rxutils.RxBus;
import com.okinc.share.bean.H5Base64Image;
import com.okinc.share.bean.H5Image;
import com.okinc.share.bean.H5QRCodeImg;
import com.okinc.share.bean.H5ShareImg;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.WebShareParams;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.image.ImageSource;
import com.okinc.share.bean.link.LinkShareParams;
import com.okinc.share.jsbridge.ShareJSBridgeHandler$showSharePopup$1;
import com.okinc.web.WebActivity;
import com.okinc.web.web.IWebActivityAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C49014ugZ;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ugZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49014ugZ extends AbstractC57329ygP {
    public InterfaceC58217yxC EZpvd;
    public InterfaceC58217yxC KWHzl;
    public InterfaceC58217yxC OLrzqt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.ugZ$ActionBar */
    public static final class ActionBar extends AbstractC5454Si<android.graphics.Bitmap> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.Bitmap bitmap, InterfaceC5460So<? super android.graphics.Bitmap> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(bitmap, "");
        }
    }

    /* JADX INFO: renamed from: o.ugZ$TaskDescription */
    public static final class TaskDescription extends AbstractC5454Si<android.graphics.Bitmap> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.Bitmap bitmap, InterfaceC5460So<? super android.graphics.Bitmap> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(bitmap, "");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57329ygP
    public java.lang.String getSupportJSObjectUri() {
        return "request";
    }

    /* JADX INFO: renamed from: o.ugZ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ugZ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.AbstractC57329ygP
    public java.util.Set<java.lang.String> getSupportJSMethods() {
        return yEE.AhwBna("share", "shareImage", "shareImageBase64", "createImageWithMark", "createQRCodeImage", "shareMultiImage", "nativeShare", "app/showSharePopup");
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [99=8] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.AbstractC57329ygP
    public void performJSMethod(@NotNull com.okinc.jsbridge.Message message, @NotNull InterfaceC57336ygW interfaceC57336ygW) {
        android.app.Activity activityAEQbTJ;
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        java.lang.String str = message.method;
        if (str != null) {
            switch (str.hashCode()) {
                case -1808499524:
                    if (str.equals("shareImage")) {
                        EZpvd(message, interfaceC57336ygW);
                        AEQbTJ(message, interfaceC57336ygW);
                        break;
                    }
                    break;
                case -397572968:
                    if (str.equals("app/showSharePopup")) {
                        valueOf(message, interfaceC57336ygW);
                        break;
                    }
                    break;
                case 109400031:
                    if (str.equals("share")) {
                        OLrzqt(message, interfaceC57336ygW);
                        AEQbTJ(message, interfaceC57336ygW);
                        break;
                    }
                    break;
                case 1487129553:
                    if (str.equals("createQRCodeImage")) {
                        KWHzl(message, interfaceC57336ygW);
                        break;
                    }
                    break;
                case 1739687432:
                    if (str.equals("nativeShare") && (activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ()) != null) {
                        copydefault(activityAEQbTJ);
                    }
                    break;
                case 1790599393:
                    if (str.equals("shareMultiImage")) {
                        AhwBna(message, interfaceC57336ygW);
                        break;
                    }
                    break;
                case 1898416427:
                    if (str.equals("shareImageBase64")) {
                        EZpvd(message);
                        AEQbTJ(message, interfaceC57336ygW);
                        break;
                    }
                    break;
                case 2047468434:
                    if (str.equals("createImageWithMark")) {
                        copydefault(message, interfaceC57336ygW);
                        break;
                    }
                    break;
            }
        }
    }

    public final void copydefault(final android.app.Activity activity) {
        if (activity instanceof WebActivity) {
            WebActivity webActivity = (WebActivity) activity;
            if (webActivity.isDestroyed()) {
                return;
            }
            webActivity.showLoading();
            new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: o.uhq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C49014ugZ.KWHzl(activity, this);
                }
            }, 800L);
        }
    }

    public static final void KWHzl(android.app.Activity activity, C49014ugZ c49014ugZ) {
        WebActivity webActivity = (WebActivity) activity;
        IWebActivityAPI iWebActivityAPIFARcdN = webActivity.fARcdN();
        android.graphics.Bitmap bitmapBuildWebViewDrawCache = iWebActivityAPIFARcdN != null ? iWebActivityAPIFARcdN.buildWebViewDrawCache() : null;
        if (bitmapBuildWebViewDrawCache != null) {
            shareBitmap$default(c49014ugZ, bitmapBuildWebViewDrawCache, (AbstractActivityC33041mov) activity, null, 4, null);
        }
        webActivity.dismissLoading();
    }

    public final void OLrzqt(com.okinc.jsbridge.Message message, InterfaceC57336ygW interfaceC57336ygW) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null || activityAEQbTJ.isDestroyed() || !(activityAEQbTJ instanceof AbstractActivityC33041mov)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(message.data);
        if (android.text.TextUtils.isEmpty(jSONObject.optString("linkUrl"))) {
            java.lang.String strOptString = jSONObject.optString("imageUrl");
            if (!android.text.TextUtils.isEmpty(strOptString)) {
                android.content.Context contextAEQbTJ = interfaceC57336ygW.AEQbTJ();
                Intrinsics.checkNotNullExpressionValue(contextAEQbTJ, "");
                Intrinsics.copydefault((java.lang.Object) strOptString);
                KWHzl(contextAEQbTJ, strOptString, new LoaderManager(interfaceC57336ygW, message, this, activityAEQbTJ));
                return;
            }
            C6777aVl.Companion.EZpvd(new java.lang.IllegalArgumentException("invalid share message: " + message));
            return;
        }
        OLrzqt((AbstractActivityC33041mov) activityAEQbTJ, message);
    }

    /* JADX INFO: renamed from: o.ugZ$LoaderManager */
    public static final class LoaderManager implements RY<android.graphics.Bitmap> {
        public final /* synthetic */ android.app.Activity AEQbTJ;
        public final /* synthetic */ com.okinc.jsbridge.Message EZpvd;
        public final /* synthetic */ InterfaceC57336ygW KWHzl;
        public final /* synthetic */ C49014ugZ OLrzqt;

        public LoaderManager(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, C49014ugZ c49014ugZ, android.app.Activity activity) {
            this.KWHzl = interfaceC57336ygW;
            this.EZpvd = message;
            this.OLrzqt = c49014ugZ;
            this.AEQbTJ = activity;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, boolean z) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(interfaceC5462Sq, "");
            this.KWHzl.copydefault(this.EZpvd, "");
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.Bitmap bitmap, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(interfaceC5462Sq, "");
            Intrinsics.checkNotNullParameter(dataSource, "");
            if (bitmap == null) {
                return true;
            }
            C49014ugZ c49014ugZ = this.OLrzqt;
            AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) this.AEQbTJ;
            final com.okinc.jsbridge.Message message = this.EZpvd;
            c49014ugZ.KWHzl(bitmap, abstractActivityC33041mov, (Function1<? super ImageShareParams, Unit>) new Function1() { // from class: o.uhB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C49014ugZ.LoaderManager.KWHzl(message, (ImageShareParams) obj2);
                }
            });
            return true;
        }

        public static final Unit KWHzl(com.okinc.jsbridge.Message message, ImageShareParams imageShareParams) {
            Intrinsics.checkNotNullParameter(imageShareParams, "");
            WebShareParams.Companion companion = WebShareParams.Companion;
            java.lang.String str = message.data;
            Intrinsics.checkNotNullExpressionValue(str, "");
            WebShareParams webShareParamsOLrzqt = companion.OLrzqt(str);
            if (webShareParamsOLrzqt != null) {
                C48986ufy.KWHzl(webShareParamsOLrzqt, imageShareParams);
            }
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, com.okinc.jsbridge.Message message) {
        try {
            WebShareParams.Companion companion = WebShareParams.Companion;
            java.lang.String str = message.data;
            Intrinsics.checkNotNullExpressionValue(str, "");
            final WebShareParams webShareParamsOLrzqt = companion.OLrzqt(str);
            if (webShareParamsOLrzqt == null) {
                return;
            }
            LinkShareParams linkShareParamsAEQbTJ = LinkShareParams.Companion.AEQbTJ(webShareParamsOLrzqt.getLinkUrl(), new Function1() { // from class: o.uhr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49014ugZ.KWHzl(webShareParamsOLrzqt, (LinkShareParams) obj);
                }
            });
            java.lang.String strFJNWhG = C59442zhC.fJNWhG("\n            " + webShareParamsOLrzqt.getTitle() + "\n            " + webShareParamsOLrzqt.getBody() + "\n            " + webShareParamsOLrzqt.getLinkUrl() + "\n            ");
            linkShareParamsAEQbTJ.setSmsBody(strFJNWhG);
            linkShareParamsAEQbTJ.setEmailBody(strFJNWhG);
            ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).copydefault(abstractActivityC33041mov, ShareConfig.ActionBar.create$default(ShareConfig.Companion, linkShareParamsAEQbTJ, null, 2, null));
        } catch (java.lang.Exception unused) {
        }
    }

    public static final Unit KWHzl(WebShareParams webShareParams, LinkShareParams linkShareParams) {
        Intrinsics.checkNotNullParameter(linkShareParams, "");
        linkShareParams.setShareFrom("webview");
        C48986ufy.KWHzl(webShareParams, linkShareParams);
        linkShareParams.setBody(C49112uiR.AEQbTJ.OLrzqt(webShareParams.getTitle(), webShareParams.getBody(), webShareParams.getLinkUrl()));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ugZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void shareBitmap$default(C49014ugZ c49014ugZ, android.graphics.Bitmap bitmap, AbstractActivityC33041mov abstractActivityC33041mov, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: o.uho
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C49014ugZ.OLrzqt((ImageShareParams) obj2);
                }
            };
        }
        c49014ugZ.KWHzl(bitmap, abstractActivityC33041mov, (Function1<? super ImageShareParams, Unit>) function1);
    }

    public final void KWHzl(android.graphics.Bitmap bitmap, AbstractActivityC33041mov abstractActivityC33041mov, final Function1<? super ImageShareParams, Unit> function1) {
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).copydefault(abstractActivityC33041mov, ShareConfig.ActionBar.create$default(ShareConfig.Companion, ImageShareParams.ActionBar.create$default(ImageShareParams.Companion, abstractActivityC33041mov, bitmap, (ImageSource) null, new Function1() { // from class: o.uhm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49014ugZ.OLrzqt(function1, (ImageShareParams) obj);
            }
        }, 4, (java.lang.Object) null), null, 2, null));
    }

    public static final Unit OLrzqt(Function1 function1, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("webview");
        function1.invoke(imageShareParams);
        return Unit.INSTANCE;
    }

    public final void EZpvd(com.okinc.jsbridge.Message message, InterfaceC57336ygW interfaceC57336ygW) {
        try {
            H5Image h5Image = (H5Image) new Gson().fromJson(message.data, H5Image.class);
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ == null || activityAEQbTJ.isDestroyed() || !(activityAEQbTJ instanceof AbstractActivityC33041mov)) {
                return;
            }
            java.lang.String str = h5Image.imageUrl;
            Intrinsics.checkNotNullExpressionValue(str, "");
            KWHzl(activityAEQbTJ, str, new FragmentManager(activityAEQbTJ));
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    /* JADX INFO: renamed from: o.ugZ$FragmentManager */
    public static final class FragmentManager implements RY<android.graphics.Bitmap> {
        public final /* synthetic */ android.app.Activity EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, boolean z) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(interfaceC5462Sq, "");
            return true;
        }

        public FragmentManager(android.app.Activity activity) {
            this.EZpvd = activity;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.Bitmap bitmap, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(interfaceC5462Sq, "");
            Intrinsics.checkNotNullParameter(dataSource, "");
            if (bitmap == null) {
                return true;
            }
            C49014ugZ.shareBitmap$default(C49014ugZ.this, bitmap, (AbstractActivityC33041mov) this.EZpvd, null, 4, null);
            return true;
        }
    }

    public final void EZpvd(com.okinc.jsbridge.Message message) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null || activityAEQbTJ.isDestroyed() || !(activityAEQbTJ instanceof AbstractActivityC33041mov)) {
            return;
        }
        try {
            H5Base64Image h5Base64Image = (H5Base64Image) new Gson().fromJson(message.data, H5Base64Image.class);
            C49292ulm c49292ulm = C49292ulm.EZpvd;
            java.lang.String str = h5Base64Image.base64Image;
            Intrinsics.checkNotNullExpressionValue(str, "");
            android.graphics.Bitmap bitmapAEQbTJ = c49292ulm.AEQbTJ(str);
            if (bitmapAEQbTJ != null) {
                shareBitmap$default(this, bitmapAEQbTJ, (AbstractActivityC33041mov) activityAEQbTJ, null, 4, null);
            }
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull RY<android.graphics.Bitmap> ry) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(ry, "");
        Glide.AEQbTJ(context).EZpvd().copydefault(str).OLrzqt(ry).OLrzqt(new ActionBar());
    }

    public final void AEQbTJ(final com.okinc.jsbridge.Message message, final InterfaceC57336ygW interfaceC57336ygW) {
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            Intrinsics.copydefault(interfaceC58217yxC);
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C49286ulg.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.uha
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49014ugZ.copydefault(message, interfaceC57336ygW, (C49286ulg) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.uhd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49014ugZ.AkhnZx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.uhj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49014ugZ.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        this.OLrzqt = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.uhk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49014ugZ.values(function12, obj);
            }
        });
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(com.okinc.jsbridge.Message message, InterfaceC57336ygW interfaceC57336ygW, C49286ulg c49286ulg) {
        try {
            java.lang.String json = new Gson().toJson(c49286ulg);
            C33575myz.AEQbTJ("ShareTypeEvent", message + "-" + json);
            interfaceC57336ygW.OLrzqt(message, json);
        } catch (java.lang.Exception e) {
            C33575myz.AEQbTJ("ShareTypeEvent", e.toString());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf(com.okinc.jsbridge.Message message, InterfaceC57336ygW interfaceC57336ygW) {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != 0 && !activityAEQbTJ.isDestroyed() && (activityAEQbTJ instanceof AbstractActivityC33041mov) && (activityAEQbTJ instanceof LifecycleOwner)) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activityAEQbTJ), Dispatchers.getIO(), null, new ShareJSBridgeHandler$showSharePopup$1(message, activityAEQbTJ, interfaceC57336ygW, null), 2, null);
            return;
        }
        interfaceC57336ygW.copydefault(message, "invalid context:" + activityAEQbTJ);
    }

    public final void copydefault(com.okinc.jsbridge.Message message, InterfaceC57336ygW interfaceC57336ygW) {
        H5ShareImg h5ShareImg = (H5ShareImg) new Gson().fromJson(message.data, H5ShareImg.class);
        if (h5ShareImg == null) {
            interfaceC57336ygW.copydefault(message, "invalid json message");
            return;
        }
        android.content.Context contextAEQbTJ = interfaceC57336ygW.AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(contextAEQbTJ, "");
        java.lang.String str = h5ShareImg.url;
        Intrinsics.checkNotNullExpressionValue(str, "");
        EZpvd(contextAEQbTJ, str, h5ShareImg.w, h5ShareImg.h, new StateListAnimator(interfaceC57336ygW, message, h5ShareImg, this));
    }

    /* JADX INFO: renamed from: o.ugZ$StateListAnimator */
    public static final class StateListAnimator implements RY<android.graphics.Bitmap> {
        public final /* synthetic */ H5ShareImg AEQbTJ;
        public final /* synthetic */ C49014ugZ EZpvd;
        public final /* synthetic */ com.okinc.jsbridge.Message KWHzl;
        public final /* synthetic */ InterfaceC57336ygW OLrzqt;

        public StateListAnimator(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, H5ShareImg h5ShareImg, C49014ugZ c49014ugZ) {
            this.OLrzqt = interfaceC57336ygW;
            this.KWHzl = message;
            this.AEQbTJ = h5ShareImg;
            this.EZpvd = c49014ugZ;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, boolean z) {
            java.lang.String message;
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(interfaceC5462Sq, "");
            InterfaceC57336ygW interfaceC57336ygW = this.OLrzqt;
            com.okinc.jsbridge.Message message2 = this.KWHzl;
            if (glideException != null) {
                message = glideException.getMessage();
            } else {
                message = "download resource fail->" + obj;
            }
            interfaceC57336ygW.copydefault(message2, message);
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(final android.graphics.Bitmap bitmap, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(interfaceC5462Sq, "");
            Intrinsics.checkNotNullParameter(dataSource, "");
            java.util.List<H5ShareImg.WaterMark> list = this.AEQbTJ.watermark;
            int size = list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                H5ShareImg.WaterMark waterMark = list.get(i);
                C49014ugZ c49014ugZ = this.EZpvd;
                Intrinsics.copydefault(waterMark);
                arrayList.add(c49014ugZ.copydefault(waterMark));
            }
            if (this.EZpvd.EZpvd != null) {
                InterfaceC58217yxC interfaceC58217yxC = this.EZpvd.EZpvd;
                Intrinsics.copydefault(interfaceC58217yxC);
                interfaceC58217yxC.dispose();
            }
            final java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
            C49014ugZ c49014ugZ2 = this.EZpvd;
            AbstractC58247yxg abstractC58247yxgObserveOn = AbstractC58247yxg.merge(arrayList).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
            final Function1 function1 = new Function1() { // from class: o.uhu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C49014ugZ.StateListAnimator.copydefault(arrayList2, (android.util.Pair) obj2);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.uhx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    C49014ugZ.StateListAnimator.EZpvd(function1, obj2);
                }
            };
            final C49014ugZ c49014ugZ3 = this.EZpvd;
            final InterfaceC57336ygW interfaceC57336ygW = this.OLrzqt;
            final com.okinc.jsbridge.Message message = this.KWHzl;
            final Function1 function12 = new Function1() { // from class: o.uhv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C49014ugZ.StateListAnimator.EZpvd(c49014ugZ3, interfaceC57336ygW, message, (java.lang.Throwable) obj2);
                }
            };
            InterfaceC58227yxM<? super java.lang.Throwable> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.uhw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    C49014ugZ.StateListAnimator.AEQbTJ(function12, obj2);
                }
            };
            final C49014ugZ c49014ugZ4 = this.EZpvd;
            final H5ShareImg h5ShareImg = this.AEQbTJ;
            final com.okinc.jsbridge.Message message2 = this.KWHzl;
            final InterfaceC57336ygW interfaceC57336ygW2 = this.OLrzqt;
            c49014ugZ2.EZpvd = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, interfaceC58227yxM2, new InterfaceC58222yxH() { // from class: o.uht
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58222yxH
                public final void run() {
                    C49014ugZ.StateListAnimator.KWHzl(c49014ugZ4, h5ShareImg, bitmap, arrayList2, message2, interfaceC57336ygW2);
                }
            });
            return true;
        }

        public static final void EZpvd(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit copydefault(java.util.List list, android.util.Pair pair) {
            Intrinsics.copydefault(pair);
            list.add(pair);
            return Unit.INSTANCE;
        }

        public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit EZpvd(C49014ugZ c49014ugZ, InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, java.lang.Throwable th) {
            c49014ugZ.EZpvd = null;
            interfaceC57336ygW.copydefault(message, th.getMessage());
            return Unit.INSTANCE;
        }

        public static final void KWHzl(C49014ugZ c49014ugZ, H5ShareImg h5ShareImg, android.graphics.Bitmap bitmap, java.util.List list, com.okinc.jsbridge.Message message, InterfaceC57336ygW interfaceC57336ygW) {
            c49014ugZ.EZpvd = null;
            c49014ugZ.OLrzqt(message, interfaceC57336ygW, h5ShareImg.outputType, c49014ugZ.EZpvd(h5ShareImg, bitmap, (java.util.List<? extends android.util.Pair<H5ShareImg.WaterMark, android.graphics.Bitmap>>) list));
        }
    }

    public final void OLrzqt(final com.okinc.jsbridge.Message message, final InterfaceC57336ygW interfaceC57336ygW, int i, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            interfaceC57336ygW.copydefault(message, "composite bitmap fail");
            return;
        }
        if (i != 0) {
            if (i == 1) {
                interfaceC57336ygW.OLrzqt(message, C33487mxQ.KWHzl(bitmap));
                return;
            }
            interfaceC57336ygW.copydefault(message, "unknown outputType:" + i);
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            Intrinsics.copydefault(interfaceC58217yxC);
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just(bitmap);
        final Function1 function1 = new Function1() { // from class: o.uhi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49014ugZ.KWHzl((android.graphics.Bitmap) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.uhh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C49014ugZ.AhwBna(function1, obj);
            }
        }).subscribeOn(yBP.AEQbTJ()).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.uhe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49014ugZ.copydefault(interfaceC57336ygW, message, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.uhf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49014ugZ.djBIcL(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.uhg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49014ugZ.copydefault(this.EZpvd, interfaceC57336ygW, message, (java.lang.Throwable) obj);
            }
        };
        this.KWHzl = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.uhn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C49014ugZ.valueOf(function13, obj);
            }
        }, new InterfaceC58222yxH() { // from class: o.uhl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C49014ugZ.AEQbTJ(this.EZpvd);
            }
        });
    }

    public static final java.lang.String AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String KWHzl(android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        java.io.File fileAEQbTJ = ShareFileProvider.Companion.AEQbTJ(bitmap);
        Intrinsics.copydefault(fileAEQbTJ);
        return fileAEQbTJ.getAbsolutePath();
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            interfaceC57336ygW.copydefault(message, "save bitmap failed");
        } else {
            if (android.text.TextUtils.isEmpty(android.net.Uri.parse(str).getScheme())) {
                str = "file://" + str;
            }
            interfaceC57336ygW.OLrzqt(message, str);
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C49014ugZ c49014ugZ, InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, java.lang.Throwable th) {
        c49014ugZ.KWHzl = null;
        interfaceC57336ygW.copydefault(message, th.getMessage());
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C49014ugZ c49014ugZ) {
        c49014ugZ.KWHzl = null;
    }

    public final android.graphics.Bitmap EZpvd(H5ShareImg h5ShareImg, android.graphics.Bitmap bitmap, java.util.List<? extends android.util.Pair<H5ShareImg.WaterMark, android.graphics.Bitmap>> list) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        android.graphics.Bitmap bitmap2;
        android.graphics.Bitmap bitmap3;
        android.graphics.Bitmap bitmap4;
        android.graphics.Bitmap bitmap5 = null;
        try {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(h5ShareImg.w, h5ShareImg.h, Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setAntiAlias(true);
            Intrinsics.copydefault(bitmap);
            canvas.drawBitmap(bitmap, (android.graphics.Rect) null, new android.graphics.Rect(0, 0, h5ShareImg.w, h5ShareImg.h), (android.graphics.Paint) null);
            int size = list.size();
            android.graphics.Bitmap bitmap6 = null;
            int i6 = 0;
            while (i6 < size) {
                try {
                    android.util.Pair<H5ShareImg.WaterMark, android.graphics.Bitmap> pair = list.get(i6);
                    H5ShareImg.WaterMark waterMark = (H5ShareImg.WaterMark) pair.first;
                    switch (waterMark.getPosition()) {
                        case 0:
                            i = waterMark.x;
                            i2 = waterMark.y;
                            break;
                        case 1:
                            i = ((h5ShareImg.w >> 1) + waterMark.x) - (waterMark.w >> 1);
                            i2 = waterMark.y;
                            break;
                        case 2:
                            i = (h5ShareImg.w - waterMark.x) - waterMark.w;
                            i2 = waterMark.y;
                            break;
                        case 3:
                            i = waterMark.x;
                            i3 = (h5ShareImg.h >> 1) + waterMark.y;
                            i4 = waterMark.h;
                            i5 = i4 >> 1;
                            i2 = i3 - i5;
                            break;
                        case 4:
                            i = ((h5ShareImg.w >> 1) + waterMark.x) - (waterMark.w >> 1);
                            i3 = (h5ShareImg.h >> 1) + waterMark.y;
                            i4 = waterMark.h;
                            i5 = i4 >> 1;
                            i2 = i3 - i5;
                            break;
                        case 5:
                            i = (h5ShareImg.w - waterMark.x) - waterMark.w;
                            i3 = (h5ShareImg.h >> 1) + waterMark.y;
                            i4 = waterMark.h;
                            i5 = i4 >> 1;
                            i2 = i3 - i5;
                            break;
                        case 6:
                            i = waterMark.x;
                            i3 = h5ShareImg.h - waterMark.y;
                            i5 = waterMark.h;
                            i2 = i3 - i5;
                            break;
                        case 7:
                            i = ((h5ShareImg.w >> 1) + waterMark.x) - (waterMark.w >> 1);
                            i3 = h5ShareImg.h + waterMark.y;
                            i5 = waterMark.h;
                            i2 = i3 - i5;
                            break;
                        case 8:
                            i = (h5ShareImg.w - waterMark.x) - waterMark.w;
                            i3 = h5ShareImg.h + waterMark.y;
                            i5 = waterMark.h;
                            i2 = i3 - i5;
                            break;
                        default:
                            i = 0;
                            i2 = 0;
                            break;
                    }
                    int type = waterMark.getType();
                    if (type == 1) {
                        bitmap2 = bitmapCreateBitmap;
                        paint.setAlpha((int) (((double) waterMark.t) * 2.55d));
                        android.graphics.Bitmap bitmap7 = (android.graphics.Bitmap) pair.second;
                        if (bitmap7 != null) {
                            bitmap3 = null;
                            canvas.drawBitmap(bitmap7, (android.graphics.Rect) null, new android.graphics.Rect(i, i2, waterMark.w + i, waterMark.h + i2), paint);
                        }
                        bitmap4 = bitmap3;
                        i6++;
                        bitmapCreateBitmap = bitmap2;
                        android.graphics.Bitmap bitmap8 = bitmap3;
                        bitmap6 = bitmap4;
                        bitmap5 = bitmap8;
                    } else if (type != 2) {
                        bitmap2 = bitmapCreateBitmap;
                        android.graphics.Bitmap bitmap9 = bitmap6;
                        bitmap3 = bitmap5;
                        bitmap4 = bitmap9;
                        i6++;
                        bitmapCreateBitmap = bitmap2;
                        android.graphics.Bitmap bitmap82 = bitmap3;
                        bitmap6 = bitmap4;
                        bitmap5 = bitmap82;
                    } else {
                        paint.setColor(Color.parseColor(waterMark.font.color));
                        paint.setTextSize(waterMark.font.size);
                        bitmap2 = bitmapCreateBitmap;
                        try {
                            paint.setAlpha((int) (((double) waterMark.t) * 2.55d));
                            java.lang.String style = waterMark.font.getStyle();
                            if (Intrinsics.EZpvd((java.lang.Object) style, (java.lang.Object) "normal")) {
                                paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 1));
                            } else if (Intrinsics.EZpvd((java.lang.Object) style, (java.lang.Object) "italic")) {
                                paint.setTypeface(android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 2));
                            }
                            if (waterMark.font.weight > 0.5d) {
                                paint.setFakeBoldText(true);
                            }
                            android.graphics.Rect rect = new android.graphics.Rect();
                            java.lang.String str = waterMark.text;
                            paint.getTextBounds(str, 0, str.length(), rect);
                            int iWidth = rect.width();
                            int iHeight = rect.height();
                            switch (waterMark.getPosition()) {
                                case 0:
                                    canvas.drawText(waterMark.text, i, i2 + iHeight, paint);
                                    break;
                                case 1:
                                    canvas.drawText(waterMark.text, i - (iWidth >> 1), i2 + iHeight, paint);
                                    break;
                                case 2:
                                    canvas.drawText(waterMark.text, i - iWidth, i2 + iHeight, paint);
                                    break;
                                case 3:
                                    canvas.drawText(waterMark.text, i, (i2 + (iHeight >> 1)) - 6, paint);
                                    break;
                                case 4:
                                    canvas.drawText(waterMark.text, i - (iWidth >> 1), (i2 + (iHeight >> 1)) - 6, paint);
                                    break;
                                case 5:
                                    canvas.drawText(waterMark.text, i - iWidth, (i2 + (iHeight >> 1)) - 6, paint);
                                    break;
                                case 6:
                                    canvas.drawText(waterMark.text, i, i2 - 6, paint);
                                    break;
                                case 7:
                                    canvas.drawText(waterMark.text, i - (iWidth >> 1), i2 - 6, paint);
                                    break;
                                case 8:
                                    canvas.drawText(waterMark.text, i - (iWidth >> 1), i2, paint);
                                    break;
                            }
                        } catch (java.lang.OutOfMemoryError unused) {
                            bitmap6 = null;
                            return bitmap6;
                        }
                    }
                    bitmap3 = null;
                    bitmap4 = bitmap3;
                    i6++;
                    bitmapCreateBitmap = bitmap2;
                    android.graphics.Bitmap bitmap822 = bitmap3;
                    bitmap6 = bitmap4;
                    bitmap5 = bitmap822;
                } catch (java.lang.OutOfMemoryError unused2) {
                }
            }
            return bitmapCreateBitmap;
        } catch (java.lang.OutOfMemoryError unused3) {
            return null;
        }
    }

    public final void EZpvd(android.content.Context context, java.lang.String str, int i, int i2, RY<android.graphics.Bitmap> ry) {
        Glide.AEQbTJ(context).EZpvd().copydefault(str).OLrzqt((RX<?>) new C5448Sc().copydefault(i, i2)).OLrzqt(ry).OLrzqt(new TaskDescription());
    }

    public final void KWHzl(com.okinc.jsbridge.Message message, InterfaceC57336ygW interfaceC57336ygW) {
        android.content.Context contextAEQbTJ = interfaceC57336ygW.AEQbTJ();
        H5QRCodeImg h5QRCodeImg = (H5QRCodeImg) new Gson().fromJson(message.data, H5QRCodeImg.class);
        if (h5QRCodeImg == null) {
            interfaceC57336ygW.copydefault(message, "invalid json message");
            return;
        }
        Intrinsics.copydefault(contextAEQbTJ);
        C6995aZr c6995aZr = new C6995aZr(contextAEQbTJ);
        C33487mxQ.EZpvd(c6995aZr, h5QRCodeImg.w, h5QRCodeImg.h);
        c6995aZr.setContent(h5QRCodeImg.url, false, 0.0f);
        H5QRCodeImg.Logo logo = h5QRCodeImg.logo;
        if ((logo != null ? logo.url : null) != null) {
            java.lang.String str = logo.url;
            Intrinsics.checkNotNullExpressionValue(str, "");
            EZpvd(contextAEQbTJ, str, logo.w, logo.h, new Application(c6995aZr, logo, this, message, interfaceC57336ygW, h5QRCodeImg, contextAEQbTJ));
            return;
        }
        OLrzqt(message, interfaceC57336ygW, h5QRCodeImg.outputType, C33487mxQ.EZpvd(C33570myu.copydefault((android.view.View) c6995aZr, true), C33052mpF.EZpvd(4, contextAEQbTJ)));
    }

    /* JADX INFO: renamed from: o.ugZ$Application */
    public static final class Application implements RY<android.graphics.Bitmap> {
        public final /* synthetic */ com.okinc.jsbridge.Message AEQbTJ;
        public final /* synthetic */ C6995aZr AhwBna;
        public final /* synthetic */ H5QRCodeImg EZpvd;
        public final /* synthetic */ H5QRCodeImg.Logo KWHzl;
        public final /* synthetic */ android.content.Context OLrzqt;
        public final /* synthetic */ InterfaceC57336ygW copydefault;
        public final /* synthetic */ C49014ugZ valueOf;

        public Application(C6995aZr c6995aZr, H5QRCodeImg.Logo logo, C49014ugZ c49014ugZ, com.okinc.jsbridge.Message message, InterfaceC57336ygW interfaceC57336ygW, H5QRCodeImg h5QRCodeImg, android.content.Context context) {
            this.AhwBna = c6995aZr;
            this.KWHzl = logo;
            this.valueOf = c49014ugZ;
            this.AEQbTJ = message;
            this.copydefault = interfaceC57336ygW;
            this.EZpvd = h5QRCodeImg;
            this.OLrzqt = context;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.Bitmap bitmap, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(interfaceC5462Sq, "");
            Intrinsics.checkNotNullParameter(dataSource, "");
            C6995aZr c6995aZr = this.AhwBna;
            H5QRCodeImg.Logo logo = this.KWHzl;
            c6995aZr.setLogoBitmap(bitmap, logo.w, logo.h);
            android.graphics.Bitmap bitmapCopydefault = C33570myu.copydefault((android.view.View) this.AhwBna, true);
            C49014ugZ c49014ugZ = this.valueOf;
            com.okinc.jsbridge.Message message = this.AEQbTJ;
            InterfaceC57336ygW interfaceC57336ygW = this.copydefault;
            int i = this.EZpvd.outputType;
            android.content.Context context = this.OLrzqt;
            Intrinsics.copydefault(context);
            c49014ugZ.OLrzqt(message, interfaceC57336ygW, i, C33487mxQ.EZpvd(bitmapCopydefault, C33052mpF.EZpvd(4, context)));
            return true;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, boolean z) {
            java.lang.String message;
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(interfaceC5462Sq, "");
            InterfaceC57336ygW interfaceC57336ygW = this.copydefault;
            com.okinc.jsbridge.Message message2 = this.AEQbTJ;
            if (glideException != null) {
                message = glideException.getMessage();
            } else {
                message = "download resource fail->" + obj;
            }
            interfaceC57336ygW.copydefault(message2, message);
            return true;
        }
    }

    public final android.graphics.Bitmap copydefault(java.lang.String str) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.InputStream inputStreamByteStream;
        java.lang.OutOfMemoryError e;
        android.graphics.Bitmap bitmap;
        Response responseExecute = C43280rmM.Companion.copydefault().initClientBuilder().build().newCall(new Request.Builder().url(str).build()).execute();
        java.io.InputStream inputStream = null;
        android.graphics.Bitmap bitmapDecodeStream = null;
        inputStream = null;
        if (responseExecute.code() != 200) {
            return null;
        }
        try {
            try {
                ResponseBody responseBodyBody = responseExecute.body();
                inputStreamByteStream = responseBodyBody != null ? responseBodyBody.byteStream() : null;
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamByteStream);
                    Unit unit = Unit.INSTANCE;
                    if (inputStreamByteStream == null) {
                        return bitmapDecodeStream;
                    }
                    inputStreamByteStream.close();
                    return bitmapDecodeStream;
                } catch (java.lang.OutOfMemoryError e2) {
                    e = e2;
                    android.graphics.Bitmap bitmap2 = bitmapDecodeStream;
                    inputStream = inputStreamByteStream;
                    bitmap = bitmap2;
                    android.util.Log.getStackTraceString(e);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bitmap;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (inputStreamByteStream != null) {
                        inputStreamByteStream.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                inputStreamByteStream = inputStream;
            }
        } catch (java.lang.OutOfMemoryError e3) {
            e = e3;
            bitmap = null;
        }
    }

    public static final android.util.Pair AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (android.util.Pair) function1.invoke(obj);
    }

    public final AbstractC58247yxg<android.util.Pair<H5ShareImg.WaterMark, android.graphics.Bitmap>> copydefault(H5ShareImg.WaterMark waterMark) {
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just(waterMark);
        final Function1 function1 = new Function1() { // from class: o.uhp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49014ugZ.OLrzqt(this.AEQbTJ, (H5ShareImg.WaterMark) obj);
            }
        };
        AbstractC58247yxg<android.util.Pair<H5ShareImg.WaterMark, android.graphics.Bitmap>> map = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.uhs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C49014ugZ.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "");
        return map;
    }

    public static final android.util.Pair OLrzqt(C49014ugZ c49014ugZ, H5ShareImg.WaterMark waterMark) {
        Intrinsics.checkNotNullParameter(waterMark, "");
        if (waterMark.getType() == 1) {
            java.lang.String str = waterMark.url;
            android.net.Uri uri = android.net.Uri.parse(str);
            java.lang.String scheme = uri.getScheme();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) scheme)) {
                Intrinsics.copydefault((java.lang.Object) scheme);
                if (C59449zhJ.startsWith$default(scheme, "http", false, 2, null)) {
                    Intrinsics.copydefault((java.lang.Object) str);
                    return new android.util.Pair(waterMark, c49014ugZ.copydefault(str));
                }
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) scheme)) {
                Intrinsics.copydefault((java.lang.Object) scheme);
                if (C59449zhJ.startsWith$default(scheme, "file", false, 2, null)) {
                    return new android.util.Pair(waterMark, C33611mzi.OLrzqt(C32979mnm.EZpvd.OLrzqt(), uri));
                }
            }
            return new android.util.Pair(waterMark, null);
        }
        return new android.util.Pair(waterMark, null);
    }

    public final void AhwBna(com.okinc.jsbridge.Message message, InterfaceC57336ygW interfaceC57336ygW) {
        C33134mqi.AEQbTJ("Deprecated Method");
    }
}

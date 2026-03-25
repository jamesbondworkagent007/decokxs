package o;

import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.okinc.planet.ext.FragmentExtKt$repeatListenRxEventOnCreate$3;
import com.okinc.rxutils.RxBus;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.platforms.SharePlatform;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o.AbstractC58185ywX;
import o.C46370tRv;
import o.C46408tTf;
import o.C47501trL;
import o.C47813txG;
import o.C56391yDq;
import o.InterfaceC58217yxC;
import o.pUU;
import o.rVN;
import o.tND;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47813txG extends AbstractC48902ueT<ImageCustomPreviewConfig> {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final int AEQbTJ = C47501trL.Application.accept;
    public tND OLrzqt;
    public boolean copydefault;

    /* JADX INFO: renamed from: o.txG$StateListAnimator */
    public static final class StateListAnimator extends C48900ueR {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C48900ueR, o.InterfaceC48898ueP
        public boolean AEQbTJ(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.txG$Application */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.txG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.txG$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity {
        public static final ActionBar Companion = new ActionBar(null);

        @SerializedName("contentId")
        private final java.lang.String contentId;

        @SerializedName("status")
        private final int status;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = activity.contentId;
            }
            if ((i2 & 2) != 0) {
                i = activity.status;
            }
            return activity.copydefault(str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.contentId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.contentId, (java.lang.Object) activity.contentId) && this.status == activity.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.contentId.hashCode() * 31) + java.lang.Integer.hashCode(this.status);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FeedDetailLoadStatus(contentId=" + this.contentId + ", status=" + this.status + ")";
        }

        public Activity(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            this.contentId = str;
            this.status = i;
        }

        /* JADX INFO: renamed from: o.txG$Activity$ActionBar */
        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.txG.Activity.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.OLrzqt = tND.KWHzl(view);
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: o.txI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C47813txG.EZpvd(this.copydefault);
            }
        });
        boolean z = requireShareParams().getExtras().getBoolean("isFixedSize", true);
        tND tnd = this.OLrzqt;
        tND tnd2 = null;
        if (tnd == null) {
            Intrinsics.gEmmrt("");
            tnd = null;
        }
        tnd.OLrzqt.setFixedSize$OKPlanet_ok_feature_planet_impl(z);
        setOnEditMenuClickListener(new StateListAnimator());
        EZpvd();
        notifyPreviewFirstLoaded();
        java.lang.String string = requireShareParams().getExtras().getString("SHARE_SHORT_LINK");
        tND tnd3 = this.OLrzqt;
        if (tnd3 == null) {
            Intrinsics.gEmmrt("");
            tnd3 = null;
        }
        tnd3.AEQbTJ.setTitle(C33070mpX.AYXKKw(C47501trL.Fragment.UJEglR));
        pUU.KWHzl("qjf", "FeedDetailSharingContainerFragment-------shortLink = " + string);
        if (string != null) {
            tND tnd4 = this.OLrzqt;
            if (tnd4 == null) {
                Intrinsics.gEmmrt("");
                tnd4 = null;
            }
            tnd4.AEQbTJ.setSubTitle(new Regex("^(http://|https://)").replace(string, ""));
            tND tnd5 = this.OLrzqt;
            if (tnd5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                tnd2 = tnd5;
            }
            tnd2.AEQbTJ.setQRCode(string);
        }
    }

    public static final void EZpvd(C47813txG c47813txG) {
        if (c47813txG.getParentFragmentManager().isStateSaved()) {
            return;
        }
        c47813txG.getChildFragmentManager().beginTransaction().replace(C47501trL.TaskDescription.DLGVGj, new C47821txO()).commit();
    }

    private final void EZpvd() {
        C46408tTf.Application application = C46408tTf.Companion;
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        final java.lang.String str = "market.feed_detail_load_event";
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.planet.biz_feed_share.FeedDetailSharingContainerFragment$listenLoadingEvent$$inlined$listen$1
            public InterfaceC58217yxC AEQbTJ;

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onCreate(lifecycleOwner);
                AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(C46408tTf.class, new String[0]);
                final String str2 = str;
                final C47813txG c47813txG = this;
                this.AEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new C46370tRv.TaskDescription(new Function1<C46408tTf, Unit>() { // from class: com.okinc.planet.biz_feed_share.FeedDetailSharingContainerFragment$listenLoadingEvent$$inlined$listen$1.2
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(C46408tTf c46408tTf) {
                        EZpvd(c46408tTf);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void EZpvd(C46408tTf c46408tTf) {
                        Object objM7377constructorimpl;
                        C46408tTf c46408tTf2 = c46408tTf;
                        pUU.OLrzqt("OKFeedBridgeEvent listened: " + c46408tTf2);
                        if (Intrinsics.EZpvd((Object) c46408tTf2.OLrzqt(), (Object) str2)) {
                            C46408tTf.Application application2 = C46408tTf.Companion;
                            String strAEQbTJ = c46408tTf2.AEQbTJ();
                            tND tnd = null;
                            if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
                                objM7377constructorimpl = null;
                            } else {
                                try {
                                    Result.Application application3 = Result.Companion;
                                    objM7377constructorimpl = new Gson().fromJson(strAEQbTJ, new TypeToken<C47813txG.Activity>() { // from class: com.okinc.planet.biz_feed_share.FeedDetailSharingContainerFragment$listenLoadingEvent$.inlined.listen.1.2.4
                                    }.getType());
                                } catch (Throwable th) {
                                    Result.Application application4 = Result.Companion;
                                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                                    }
                                }
                            }
                            C47813txG.Activity activity = (C47813txG.Activity) objM7377constructorimpl;
                            String string = c47813txG.requireShareParams().getExtras().getString("id");
                            if (!Intrinsics.EZpvd((Object) string, (Object) (activity != null ? activity.EZpvd() : null))) {
                                pUU.EZpvd(c47813txG.getTag(), "contentId: " + (activity != null ? activity.EZpvd() : null) + " not match, ignore");
                                return;
                            }
                            pUU.EZpvd(c47813txG.getTag(), "FeedDetailLoadStatus listened: " + activity + ", contentId: " + string);
                            Integer numValueOf = activity != null ? Integer.valueOf(activity.OLrzqt()) : null;
                            if (numValueOf != null && numValueOf.intValue() == 0) {
                                tND tnd2 = c47813txG.OLrzqt;
                                if (tnd2 == null) {
                                    Intrinsics.gEmmrt("");
                                } else {
                                    tnd = tnd2;
                                }
                                tnd.OLrzqt.setInterceptTouchEvent$OKPlanet_ok_feature_planet_impl(true);
                                return;
                            }
                            if (numValueOf != null && numValueOf.intValue() == 1) {
                                tND tnd3 = c47813txG.OLrzqt;
                                if (tnd3 == null) {
                                    Intrinsics.gEmmrt("");
                                    tnd3 = null;
                                }
                                tnd3.OLrzqt.setInterceptTouchEvent$OKPlanet_ok_feature_planet_impl(true);
                                if (c47813txG.copydefault) {
                                    return;
                                }
                                c47813txG.copydefault = true;
                                rVN.reportFullyDrawn$default((Fragment) c47813txG, true, (String) null, 2, (Object) null);
                                return;
                            }
                            if (numValueOf != null && numValueOf.intValue() == 2) {
                                tND tnd4 = c47813txG.OLrzqt;
                                if (tnd4 == null) {
                                    Intrinsics.gEmmrt("");
                                    tnd4 = null;
                                }
                                tnd4.OLrzqt.setInterceptTouchEvent$OKPlanet_ok_feature_planet_impl(false);
                                if (c47813txG.copydefault) {
                                    return;
                                }
                                c47813txG.copydefault = true;
                                rVN.reportFullyDrawn$default((Fragment) c47813txG, false, (String) null, 2, (Object) null);
                            }
                        }
                    }
                }), new C46370tRv.TaskDescription(FragmentExtKt$repeatListenRxEventOnCreate$3.ActionBar.OLrzqt));
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                super.onDestroy(lifecycleOwner);
            }
        });
    }

    /* JADX DEBUG: Method merged with bridge method: onRequestPendingShareParams(Lcom/okinc/share/platforms/SharePlatform;)Lcom/okinc/share/api/params/IShareParams; */
    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ImageShareParams onRequestPendingShareParams(@NotNull SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        ImageShareParams imageShareParams = (ImageShareParams) super.onRequestPendingShareParams(sharePlatform);
        java.lang.String pendingShareImagePath = imageShareParams.getPendingShareImagePath();
        if (pendingShareImagePath == null) {
            pendingShareImagePath = copydefault();
        }
        imageShareParams.setPendingShareImagePath(pendingShareImagePath);
        return imageShareParams;
    }

    private static final android.graphics.Bitmap AEQbTJ(android.view.View view) {
        pUU.KWHzl("qjf", "enhanceBuildCompositePreviewImagePath--view.width = " + view.getWidth() + "，view.height=" + view.getHeight());
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        view.draw(new android.graphics.Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    private final java.lang.String copydefault() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            java.io.File fileSavePendingShareBitmapFile = savePendingShareBitmapFile(AEQbTJ(getPreviewContainer()));
            objM7377constructorimpl = Result.m7377constructorimpl(fileSavePendingShareBitmapFile != null ? fileSavePendingShareBitmapFile.getAbsolutePath() : null);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    @Override // o.AbstractC48908ueZ
    public android.graphics.Rect getPreviewBounds() {
        android.graphics.Rect rect = new android.graphics.Rect();
        getPreviewContainer().getDrawingRect(rect);
        rect.offsetTo(0, 0);
        return rect;
    }

    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public android.graphics.Rect getImageBounds() {
        return getPreviewBounds();
    }

    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public android.view.ViewGroup getPreviewContainer() {
        tND tnd = this.OLrzqt;
        if (tnd == null) {
            Intrinsics.gEmmrt("");
            tnd = null;
        }
        C47820txN c47820txN = tnd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c47820txN, "");
        return c47820txN;
    }
}

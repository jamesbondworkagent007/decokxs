package o;

import android.animation.ValueAnimator;
import android.graphics.Outline;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaScannerConnection;
import android.os.Build;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.immomo.mls.view.gallery.TransitionGalleryActivity$saveImage$1;
import com.immomo.mls.view.gallery.image.GalleryImageSource;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.security.MessageDigest;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC7885asK;
import o.C52761wXj;
import o.C7343ahz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.asK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ActivityC7885asK extends ActivityC52757wXf {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final java.lang.String AEQbTJ;
    public wXG AhwBna;
    public final ActivityResultLauncher<java.lang.String> AkhnZx;
    public android.widget.FrameLayout AuCTel;
    public java.lang.String DbNXlk;
    public StateListAnimator OLrzqt;
    public final ColorDrawable djBIcL;
    public ViewPager2 fJNWhG;
    public boolean isConnected;
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.asM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC7885asK.uzCIH(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.asL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(ActivityC7885asK.fARcdN(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.asT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(ActivityC7885asK.fJNWhG(this.copydefault));
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.asR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC7885asK.AuCTel(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.asS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Long.valueOf(ActivityC7885asK.fIwbmz(this.KWHzl));
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.asU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC7885asK.getFieldNames(this.copydefault);
        }
    });
    public final InterfaceC56387yDm ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.asY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC7885asK.hDKMBd(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.asV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ActivityC7885asK.iwGUEr(this.copydefault));
        }
    });

    /* JADX INFO: renamed from: o.asK$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            EZpvd = iArr;
        }
    }

    public ActivityC7885asK() {
        ColorDrawable colorDrawable = new ColorDrawable(ViewCompat.MEASURED_STATE_MASK);
        colorDrawable.setAlpha(0);
        this.djBIcL = colorDrawable;
        java.lang.String str = android.os.Environment.DIRECTORY_PICTURES;
        java.lang.String str2 = java.io.File.separator;
        this.AEQbTJ = str + str2 + "OKX" + str2;
        ActivityResultLauncher<java.lang.String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: o.asW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC7885asK.OLrzqt(this.OLrzqt, (java.lang.Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AkhnZx = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.asK$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.asK.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void OLrzqt(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.util.ArrayList<GalleryImageSource> arrayList, int i, int i2, @NotNull java.lang.String str2, long j, float[] fArr, @NotNull java.util.ArrayList<RectF> arrayList2, boolean z) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC7885asK.class);
            intent.putExtra("extra_from_page", str);
            intent.putParcelableArrayListExtra("extra_image_urls", arrayList);
            intent.putExtra("extra_default_index", i);
            intent.putExtra("extra_corner_radius", i2);
            intent.putExtra("extra_thumb_content_mode", str2);
            intent.putExtra("extra_duration_ms", j);
            if (fArr != null) {
                intent.putExtra("extra_enter_rect_floats", fArr);
            }
            intent.putParcelableArrayListExtra("extra_return_rects", arrayList2);
            intent.putExtra("extra_is_from_web", z);
            activity.startActivity(intent);
            try {
                activity.overridePendingTransition(0, 0);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public final java.util.List<GalleryImageSource> valueOf() {
        return (java.util.List) this.fetchVPNInfo.getValue();
    }

    public static final java.util.List uzCIH(ActivityC7885asK activityC7885asK) {
        java.util.ArrayList parcelableArrayListExtra = activityC7885asK.getIntent().getParcelableArrayListExtra("extra_image_urls");
        return parcelableArrayListExtra != null ? parcelableArrayListExtra : yDY.AhwBna();
    }

    public static final int fARcdN(ActivityC7885asK activityC7885asK) {
        return activityC7885asK.getIntent().getIntExtra("extra_default_index", 0);
    }

    public final int copydefault() {
        return ((java.lang.Number) this.valueOf.getValue()).intValue();
    }

    private final int DbNXlk() {
        return ((java.lang.Number) this.copydefault.getValue()).intValue();
    }

    public static final int fJNWhG(ActivityC7885asK activityC7885asK) {
        return activityC7885asK.getIntent().getIntExtra("extra_corner_radius", 12);
    }

    public static final java.lang.String AuCTel(ActivityC7885asK activityC7885asK) {
        java.lang.String stringExtra = activityC7885asK.getIntent().getStringExtra("extra_thumb_content_mode");
        return stringExtra == null ? "" : stringExtra;
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final long fIwbmz(ActivityC7885asK activityC7885asK) {
        return activityC7885asK.getIntent().getLongExtra("extra_duration_ms", 100L);
    }

    public final long OLrzqt() {
        return ((java.lang.Number) this.gEmmrt.getValue()).longValue();
    }

    public static final float[] getFieldNames(ActivityC7885asK activityC7885asK) {
        return activityC7885asK.getIntent().getFloatArrayExtra("extra_enter_rect_floats");
    }

    public final float[] djBIcL() {
        return (float[]) this.AYXKKw.getValue();
    }

    public static final java.util.ArrayList hDKMBd(ActivityC7885asK activityC7885asK) {
        return activityC7885asK.getIntent().getParcelableArrayListExtra("extra_return_rects");
    }

    public final java.util.ArrayList<RectF> AhwBna() {
        return (java.util.ArrayList) this.ejfBZ.getValue();
    }

    public static final boolean iwGUEr(ActivityC7885asK activityC7885asK) {
        return activityC7885asK.getIntent().getBooleanExtra("extra_is_from_web", false);
    }

    public final boolean AYXKKw() {
        return ((java.lang.Boolean) this.values.getValue()).booleanValue();
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gEmmrt();
        setContentView(C7343ahz.Activity.AEQbTJ);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        this.AuCTel = (android.widget.FrameLayout) findViewById(C7343ahz.TaskDescription.AwvSrB);
        this.fJNWhG = (ViewPager2) findViewById(C7343ahz.TaskDescription.dxcTrN);
        this.AhwBna = (wXG) findViewById(C7343ahz.TaskDescription.values);
        android.widget.FrameLayout frameLayout = this.AuCTel;
        ViewPager2 viewPager2 = null;
        if (frameLayout == null) {
            Intrinsics.gEmmrt("");
            frameLayout = null;
        }
        frameLayout.setBackground(this.djBIcL);
        java.util.List<GalleryImageSource> listValueOf = valueOf();
        Intrinsics.copydefault(listValueOf, "");
        StateListAnimator stateListAnimator = new StateListAnimator(this, (java.util.ArrayList) listValueOf, new Function2() { // from class: o.asQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC7885asK.EZpvd(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (android.view.View) obj2);
            }
        });
        this.OLrzqt = stateListAnimator;
        stateListAnimator.setHasStableIds(true);
        ViewPager2 viewPager22 = this.fJNWhG;
        if (viewPager22 == null) {
            Intrinsics.gEmmrt("");
            viewPager22 = null;
        }
        StateListAnimator stateListAnimator2 = this.OLrzqt;
        if (stateListAnimator2 == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator2 = null;
        }
        viewPager22.setAdapter(stateListAnimator2);
        ViewPager2 viewPager23 = this.fJNWhG;
        if (viewPager23 == null) {
            Intrinsics.gEmmrt("");
            viewPager23 = null;
        }
        viewPager23.setCurrentItem(copydefault(), false);
        wXG wxg = this.AhwBna;
        if (wxg == null) {
            Intrinsics.gEmmrt("");
            wxg = null;
        }
        wxg.setVisibility(valueOf().size() <= 1 ? 8 : 0);
        wXG wxg2 = this.AhwBna;
        if (wxg2 == null) {
            Intrinsics.gEmmrt("");
            wxg2 = null;
        }
        wxg2.setCount(valueOf().size());
        wXG wxg3 = this.AhwBna;
        if (wxg3 == null) {
            Intrinsics.gEmmrt("");
            wxg3 = null;
        }
        ViewPager2 viewPager24 = this.fJNWhG;
        if (viewPager24 == null) {
            Intrinsics.gEmmrt("");
            viewPager24 = null;
        }
        wxg3.setSelectedItem(viewPager24.getCurrentItem());
        ViewPager2 viewPager25 = this.fJNWhG;
        if (viewPager25 == null) {
            Intrinsics.gEmmrt("");
        } else {
            viewPager2 = viewPager25;
        }
        viewPager2.registerOnPageChangeCallback(new Application());
        getOnBackPressedDispatcher().addCallback(this, new Activity());
    }

    public static final Unit EZpvd(ActivityC7885asK activityC7885asK, int i, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        activityC7885asK.KWHzl();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.asK$Application */
    public static final class Application extends ViewPager2.OnPageChangeCallback {
        public Application() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            wXG wxg = ActivityC7885asK.this.AhwBna;
            if (wxg == null) {
                Intrinsics.gEmmrt("");
                wxg = null;
            }
            wxg.setSelectedItem(i);
        }
    }

    /* JADX INFO: renamed from: o.asK$Activity */
    public static final class Activity extends OnBackPressedCallback {
        public Activity() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            ActivityC7885asK.this.KWHzl();
        }
    }

    public final void gEmmrt() {
        getWindow().clearFlags(201326592);
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
    }

    public final void KWHzl() {
        ViewPager2 viewPager2 = this.fJNWhG;
        if (viewPager2 == null) {
            Intrinsics.gEmmrt("");
            viewPager2 = null;
        }
        int currentItem = viewPager2.getCurrentItem();
        StateListAnimator stateListAnimator = this.OLrzqt;
        if (stateListAnimator == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator = null;
        }
        android.view.View viewCopydefault = stateListAnimator.copydefault(currentItem);
        android.widget.ImageView imageView = viewCopydefault instanceof android.widget.ImageView ? (android.widget.ImageView) viewCopydefault : null;
        StateListAnimator stateListAnimator2 = this.OLrzqt;
        if (stateListAnimator2 == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator2 = null;
        }
        GalleryImageSource galleryImageSourceEZpvd = stateListAnimator2.EZpvd(currentItem);
        if (imageView != null && imageView.getDrawable() != null) {
            java.util.ArrayList<RectF> arrayListAhwBna = AhwBna();
            RectF rectF = arrayListAhwBna != null ? (RectF) CollectionsKt___CollectionsKt.AkhnZx(arrayListAhwBna, currentItem) : null;
            if (rectF != null && !rectF.isEmpty()) {
                EZpvd(imageView, rectF, galleryImageSourceEZpvd);
                return;
            }
        }
        AEQbTJ();
    }

    public final void EZpvd(android.widget.ImageView imageView, RectF rectF, GalleryImageSource galleryImageSource) {
        android.view.Window window = getWindow();
        android.widget.FrameLayout frameLayout = null;
        android.view.View decorView = window != null ? window.getDecorView() : null;
        if ((decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null) == null) {
            AEQbTJ();
            return;
        }
        RectF rectFEZpvd = EZpvd(imageView);
        float fCopydefault = C56548yJl.copydefault(r2.getWidth(), 1.0f);
        float fCopydefault2 = C56548yJl.copydefault(r2.getHeight(), 1.0f);
        float fWidth = rectF.height() > 0.0f ? rectF.width() / rectF.height() : 1.0f;
        if (fWidth > fCopydefault / fCopydefault2) {
            fCopydefault2 = fCopydefault / fWidth;
        } else {
            fCopydefault = fCopydefault2 * fWidth;
        }
        float fCenterX = rectFEZpvd.centerX() - (fCopydefault / 2.0f);
        float fCenterY = rectFEZpvd.centerY() - (fCopydefault2 / 2.0f);
        final RectF rectF2 = new RectF(fCenterX, fCenterY, fCopydefault + fCenterX, fCopydefault2 + fCenterY);
        ImageView.ScaleType scaleTypeEZpvd = galleryImageSource.isImageEmpty() ? ImageView.ScaleType.CENTER_INSIDE : EZpvd(rectF);
        float fDp$default = C55298xhM.dp$default(DbNXlk(), (android.content.Context) null, 1, (java.lang.Object) null);
        final android.widget.ImageView imageView2 = new android.widget.ImageView(imageView.getContext());
        imageView2.setLayoutParams(new ViewGroup.LayoutParams((int) rectF2.width(), (int) rectF2.height()));
        imageView2.setScaleType(scaleTypeEZpvd);
        imageView2.setImageDrawable(imageView.getDrawable());
        imageView2.setTranslationX(rectF2.left);
        imageView2.setTranslationY(rectF2.top);
        imageView2.setOutlineProvider(new Dialog(fDp$default));
        imageView2.setClipToOutline(true);
        imageView2.setLayerType(2, null);
        android.widget.FrameLayout frameLayout2 = this.AuCTel;
        if (frameLayout2 == null) {
            Intrinsics.gEmmrt("");
            frameLayout2 = null;
        }
        android.graphics.drawable.Drawable background = frameLayout2.getBackground();
        final float fKWHzl = C56548yJl.KWHzl(((background instanceof ColorDrawable ? (ColorDrawable) background : null) != null ? r4.getAlpha() : 255) / 255.0f, 0.0f, 1.0f);
        final android.view.View view = new android.view.View(imageView.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        view.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        view.setAlpha(fKWHzl);
        android.view.Window window2 = getWindow();
        android.view.View decorView2 = window2 != null ? window2.getDecorView() : null;
        Intrinsics.copydefault(decorView2, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView2;
        viewGroup.addView(view);
        viewGroup.addView(imageView2);
        imageView.setVisibility(4);
        android.widget.FrameLayout frameLayout3 = this.AuCTel;
        if (frameLayout3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            frameLayout = frameLayout3;
        }
        frameLayout.setVisibility(4);
        final float f = rectF.left - rectF2.left;
        final float f2 = rectF.top - rectF2.top;
        float fWidth2 = rectF.width();
        float fWidth3 = rectF2.width();
        float fHeight = rectF.height();
        float fHeight2 = rectF2.height();
        long jMax = java.lang.Math.max(OLrzqt(), (long) (160 + (240 * C56548yJl.KWHzl(((float) java.lang.Math.hypot(f, f2)) / C56548yJl.copydefault((float) java.lang.Math.hypot(viewGroup.getWidth(), viewGroup.getHeight()), 1.0f), 0.0f, 1.0f))));
        android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f);
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(jMax);
        valueAnimatorOfFloat.setInterpolator(pathInterpolator);
        final float f3 = fWidth2 - fWidth3;
        final float f4 = fHeight - fHeight2;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.asN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                ActivityC7885asK.copydefault(rectF2, f, f2, f3, f4, imageView2, fKWHzl, view, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new PendingIntent(imageView2, viewGroup, view, this));
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: o.asK$Dialog */
    public static final class Dialog extends android.view.ViewOutlineProvider {
        public final /* synthetic */ float EZpvd;

        public Dialog(float f) {
            this.EZpvd = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(android.view.View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(outline, "");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.EZpvd);
        }
    }

    public static final void copydefault(RectF rectF, float f, float f2, float f3, float f4, android.widget.ImageView imageView, float f5, android.view.View view, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f6 = rectF.left;
        float f7 = rectF.top;
        float fCopydefault = C56548yJl.copydefault(rectF.width() + (f3 * animatedFraction), 1.0f);
        float fCopydefault2 = C56548yJl.copydefault(rectF.height() + (f4 * animatedFraction), 1.0f);
        imageView.setTranslationX(f6 + (f * animatedFraction));
        imageView.setTranslationY(f7 + (f2 * animatedFraction));
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i = (int) fCopydefault;
        int i2 = (int) fCopydefault2;
        if (layoutParams.width != i || layoutParams.height != i2) {
            layoutParams.width = i;
            layoutParams.height = i2;
            imageView.setLayoutParams(layoutParams);
        }
        imageView.setAlpha(1.0f);
        view.setAlpha(C56548yJl.KWHzl(f5 * (1.0f - animatedFraction), 0.0f, 1.0f));
    }

    /* JADX INFO: renamed from: o.asK$PendingIntent */
    public static final class PendingIntent extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ ActivityC7885asK AEQbTJ;
        public final /* synthetic */ android.view.ViewGroup EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ android.widget.ImageView copydefault;

        public PendingIntent(android.widget.ImageView imageView, android.view.ViewGroup viewGroup, android.view.View view, ActivityC7885asK activityC7885asK) {
            this.copydefault = imageView;
            this.EZpvd = viewGroup;
            this.OLrzqt = view;
            this.AEQbTJ = activityC7885asK;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            android.widget.FrameLayout frameLayout = null;
            this.copydefault.setLayerType(0, null);
            this.EZpvd.removeView(this.copydefault);
            this.EZpvd.removeView(this.OLrzqt);
            android.widget.FrameLayout frameLayout2 = this.AEQbTJ.AuCTel;
            if (frameLayout2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setAlpha(1.0f);
            this.AEQbTJ.AEQbTJ();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            android.widget.FrameLayout frameLayout = null;
            this.copydefault.setLayerType(0, null);
            this.EZpvd.removeView(this.copydefault);
            this.EZpvd.removeView(this.OLrzqt);
            android.widget.FrameLayout frameLayout2 = this.AEQbTJ.AuCTel;
            if (frameLayout2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setAlpha(1.0f);
            this.AEQbTJ.AEQbTJ();
        }
    }

    public final ImageView.ScaleType EZpvd(RectF rectF) {
        if (EZpvd().length() > 0) {
            try {
                return ImageView.ScaleType.valueOf(EZpvd());
            } catch (java.lang.Exception unused) {
                return ImageView.ScaleType.FIT_XY;
            }
        }
        if (AYXKKw()) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (rectF.height() > 400.0f) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public final void AEQbTJ(android.widget.ImageView imageView, RectF rectF, GalleryImageSource galleryImageSource) {
        android.view.Window window = getWindow();
        android.widget.FrameLayout frameLayout = null;
        android.view.View decorView = window != null ? window.getDecorView() : null;
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup == null) {
            return;
        }
        final RectF rectFEZpvd = EZpvd(imageView);
        float fWidth = rectFEZpvd.height() > 0.0f ? rectFEZpvd.width() / rectFEZpvd.height() : 1.0f;
        float fCopydefault = C56548yJl.copydefault(rectF.width(), 1.0f);
        float fCopydefault2 = C56548yJl.copydefault(rectF.height(), 1.0f);
        if (fWidth > fCopydefault / fCopydefault2) {
            fCopydefault2 = fCopydefault / fWidth;
        } else {
            fCopydefault = fCopydefault2 * fWidth;
        }
        float fCenterX = rectF.centerX() - (fCopydefault / 2.0f);
        float fCenterY = rectF.centerY() - (fCopydefault2 / 2.0f);
        final RectF rectF2 = new RectF(fCenterX, fCenterY, fCopydefault + fCenterX, fCopydefault2 + fCenterY);
        final android.widget.ImageView imageView2 = new android.widget.ImageView(imageView.getContext());
        imageView2.setLayoutParams(new ViewGroup.LayoutParams((int) rectF2.width(), (int) rectF2.height()));
        imageView2.setScaleType(galleryImageSource.isImageEmpty() ? ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageDrawable(imageView.getDrawable());
        imageView2.setTranslationX(rectF2.left);
        imageView2.setTranslationY(rectF2.top);
        imageView2.setLayerType(2, null);
        viewGroup.addView(imageView2);
        imageView.setVisibility(4);
        android.widget.FrameLayout frameLayout2 = this.AuCTel;
        if (frameLayout2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            frameLayout = frameLayout2;
        }
        android.graphics.drawable.Drawable background = frameLayout.getBackground();
        final float f = rectFEZpvd.left - rectF2.left;
        final float f2 = rectFEZpvd.top - rectF2.top;
        float fWidth2 = rectFEZpvd.width();
        float fWidth3 = rectF2.width();
        float fHeight = rectFEZpvd.height();
        float fHeight2 = rectF2.height();
        long jMax = java.lang.Math.max(OLrzqt(), (long) (160 + (240 * C56548yJl.KWHzl(((float) java.lang.Math.hypot(f, f2)) / C56548yJl.copydefault((float) java.lang.Math.hypot(viewGroup.getWidth(), viewGroup.getHeight()), 1.0f), 0.0f, 1.0f))));
        android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f);
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(jMax);
        valueAnimatorOfFloat.setInterpolator(pathInterpolator);
        final float f3 = fWidth2 - fWidth3;
        final float f4 = fHeight - fHeight2;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.asP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                ActivityC7885asK.OLrzqt(rectF2, f, f2, f3, f4, imageView2, this, rectFEZpvd, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new Fragment(imageView2, viewGroup, imageView, this, background));
        valueAnimatorOfFloat.start();
    }

    public static final void OLrzqt(RectF rectF, float f, float f2, float f3, float f4, android.widget.ImageView imageView, ActivityC7885asK activityC7885asK, RectF rectF2, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f5 = rectF.left;
        float f6 = rectF.top;
        float fCopydefault = C56548yJl.copydefault(rectF.width() + (f3 * animatedFraction), 1.0f);
        float fCopydefault2 = C56548yJl.copydefault(rectF.height() + (f4 * animatedFraction), 1.0f);
        imageView.setTranslationX(f5 + (f * animatedFraction));
        imageView.setTranslationY(f6 + (f2 * animatedFraction));
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i = (int) fCopydefault;
        if (layoutParams.width != i || layoutParams.height != ((int) fCopydefault2)) {
            layoutParams.width = i;
            layoutParams.height = (int) fCopydefault2;
            imageView.setLayoutParams(layoutParams);
        }
        imageView.setAlpha(1.0f);
        activityC7885asK.djBIcL.setAlpha(C56548yJl.EZpvd((int) (255 * animatedFraction), 0, 255));
        if (animatedFraction >= 0.98f) {
            int iWidth = (int) rectF2.width();
            int iHeight = (int) rectF2.height();
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2.width != iWidth || layoutParams2.height != iHeight) {
                layoutParams2.width = iWidth;
                layoutParams2.height = iHeight;
                imageView.setLayoutParams(layoutParams2);
            }
            imageView.setTranslationX(rectF2.left);
            imageView.setTranslationY(rectF2.top);
        }
    }

    /* JADX INFO: renamed from: o.asK$Fragment */
    public static final class Fragment extends android.animation.AnimatorListenerAdapter {
        public final /* synthetic */ android.view.ViewGroup AEQbTJ;
        public final /* synthetic */ android.graphics.drawable.Drawable EZpvd;
        public final /* synthetic */ ActivityC7885asK KWHzl;
        public final /* synthetic */ android.widget.ImageView OLrzqt;
        public final /* synthetic */ android.widget.ImageView copydefault;

        public Fragment(android.widget.ImageView imageView, android.view.ViewGroup viewGroup, android.widget.ImageView imageView2, ActivityC7885asK activityC7885asK, android.graphics.drawable.Drawable drawable) {
            this.OLrzqt = imageView;
            this.AEQbTJ = viewGroup;
            this.copydefault = imageView2;
            this.KWHzl = activityC7885asK;
            this.EZpvd = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            this.OLrzqt.setLayerType(0, null);
            this.AEQbTJ.removeView(this.OLrzqt);
            this.copydefault.setVisibility(0);
            this.KWHzl.djBIcL.setAlpha(255);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            android.widget.FrameLayout frameLayout = null;
            this.OLrzqt.setLayerType(0, null);
            this.AEQbTJ.removeView(this.OLrzqt);
            this.copydefault.setVisibility(0);
            android.widget.FrameLayout frameLayout2 = this.KWHzl.AuCTel;
            if (frameLayout2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setBackground(this.EZpvd);
        }
    }

    public final RectF EZpvd(android.widget.ImageView imageView) {
        if (imageView.getDrawable() == null) {
            return EZpvd((android.view.View) imageView);
        }
        ImageView.ScaleType scaleType = imageView.getScaleType();
        int i = scaleType == null ? -1 : TaskDescription.EZpvd[scaleType.ordinal()];
        if (i == 1) {
            RectF rectF = new RectF(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
            imageView.getImageMatrix().mapRect(rectF);
            return KWHzl(imageView, rectF);
        }
        if (i == 2) {
            return KWHzl(imageView, copydefault(imageView.getWidth(), imageView.getHeight(), r0.getIntrinsicWidth(), r0.getIntrinsicHeight()));
        }
        if (i == 3 || i == 4) {
            return KWHzl(imageView, OLrzqt(imageView.getWidth(), imageView.getHeight(), r0.getIntrinsicWidth(), r0.getIntrinsicHeight()));
        }
        if (i == 5) {
            return EZpvd((android.view.View) imageView);
        }
        return KWHzl(imageView, OLrzqt(imageView.getWidth(), imageView.getHeight(), r0.getIntrinsicWidth(), r0.getIntrinsicHeight()));
    }

    public final RectF OLrzqt(float f, float f2, float f3, float f4) {
        if (f <= 0.0f || f2 <= 0.0f || f3 <= 0.0f || f4 <= 0.0f) {
            return new RectF(0.0f, 0.0f, f, f2);
        }
        if (f3 / f4 > f / f2) {
            float f5 = f4 * (f / f3);
            float f6 = (f2 - f5) / 2.0f;
            return new RectF(0.0f, f6, f, f5 + f6);
        }
        float f7 = f3 * (f2 / f4);
        float f8 = (f - f7) / 2.0f;
        return new RectF(f8, 0.0f, f7 + f8, f2);
    }

    public final RectF copydefault(float f, float f2, float f3, float f4) {
        if (f <= 0.0f || f2 <= 0.0f || f3 <= 0.0f || f4 <= 0.0f) {
            return new RectF(0.0f, 0.0f, f, f2);
        }
        if (f3 / f4 < f / f2) {
            float f5 = f4 * (f / f3);
            float f6 = (f2 - f5) / 2.0f;
            return new RectF(0.0f, f6, f, f5 + f6);
        }
        float f7 = f3 * (f2 / f4);
        float f8 = (f - f7) / 2.0f;
        return new RectF(f8, 0.0f, f7 + f8, f2);
    }

    public final RectF KWHzl(android.widget.ImageView imageView, RectF rectF) {
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        float f = rectF.left;
        float f2 = iArr[0];
        float f3 = rectF.top;
        float f4 = iArr[1];
        return new RectF(f + f2, f3 + f4, rectF.right + f2, rectF.bottom + f4);
    }

    public final RectF EZpvd(android.view.View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], r1 + view.getWidth(), iArr[1] + view.getHeight());
    }

    public final void AEQbTJ() {
        try {
            finish();
            overridePendingTransition(0, 0);
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: o.asK$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.Adapter<ActionBar> {
        public RecyclerView AEQbTJ;
        public final java.util.ArrayList<GalleryImageSource> KWHzl;
        public final Function2<java.lang.Integer, android.view.View, Unit> OLrzqt;
        public final /* synthetic */ ActivityC7885asK copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.view.View, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull ActivityC7885asK activityC7885asK, @NotNull java.util.ArrayList<GalleryImageSource> arrayList, Function2<? super java.lang.Integer, ? super android.view.View, Unit> function2) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(function2, "");
            this.copydefault = activityC7885asK;
            this.KWHzl = arrayList;
            this.OLrzqt = function2;
        }

        /* JADX INFO: renamed from: o.asK$StateListAnimator$ActionBar */
        public final class ActionBar extends RecyclerView.ViewHolder {
            public final C31696mAn EZpvd;
            public final /* synthetic */ StateListAnimator OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C31696mAn AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull StateListAnimator stateListAnimator, @NotNull C7900asZ c7900asZ, C31696mAn c31696mAn) {
                super(c7900asZ);
                Intrinsics.checkNotNullParameter(c7900asZ, "");
                Intrinsics.checkNotNullParameter(c31696mAn, "");
                this.OLrzqt = stateListAnimator;
                this.EZpvd = c31696mAn;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.content.Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            android.widget.FrameLayout frameLayout = null;
            C7900asZ c7900asZ = new C7900asZ(context, null, 2, null);
            c7900asZ.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            C31696mAn c31696mAn = new C31696mAn(viewGroup.getContext());
            c31696mAn.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            c31696mAn.setScaleType(ImageView.ScaleType.FIT_CENTER);
            c7900asZ.addView(c31696mAn);
            final ActionBar actionBar = new ActionBar(this, c7900asZ, c31696mAn);
            c31696mAn.setOnViewTapListener(new InterfaceC31693mAk() { // from class: o.atb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC31693mAk
                public final void KWHzl(android.view.View view, float f, float f2) {
                    ActivityC7885asK.StateListAnimator.KWHzl(actionBar, this, view, f, f2);
                }
            });
            android.widget.FrameLayout frameLayout2 = this.copydefault.AuCTel;
            if (frameLayout2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                frameLayout = frameLayout2;
            }
            c7900asZ.setBackgroundDimView(frameLayout);
            c7900asZ.setPhotoView(c31696mAn);
            final ActivityC7885asK activityC7885asK = this.copydefault;
            c7900asZ.setOnDismiss(new Function0() { // from class: o.atc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC7885asK.StateListAnimator.AEQbTJ(activityC7885asK);
                }
            });
            return actionBar;
        }

        public static final void KWHzl(ActionBar actionBar, StateListAnimator stateListAnimator, android.view.View view, float f, float f2) {
            int bindingAdapterPosition = actionBar.getBindingAdapterPosition();
            if (bindingAdapterPosition != -1) {
                Function2<java.lang.Integer, android.view.View, Unit> function2 = stateListAnimator.OLrzqt;
                Intrinsics.copydefault(view);
                function2.invoke(java.lang.Integer.valueOf(bindingAdapterPosition), view);
            }
        }

        public static final Unit AEQbTJ(ActivityC7885asK activityC7885asK) {
            activityC7885asK.KWHzl();
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            C31696mAn c31696mAnAEQbTJ = actionBar.AEQbTJ();
            try {
                Glide.KWHzl(c31696mAnAEQbTJ).AEQbTJ(c31696mAnAEQbTJ);
            } catch (java.lang.Throwable unused) {
            }
            java.lang.Object objValueOf = null;
            android.widget.FrameLayout frameLayout = null;
            c31696mAnAEQbTJ.setImageDrawable(null);
            if (this.KWHzl.isEmpty()) {
                OLrzqt(c31696mAnAEQbTJ);
                return;
            }
            if (i < 0 || i >= this.KWHzl.size()) {
                i = actionBar.getBindingAdapterPosition();
            }
            final GalleryImageSource galleryImageSource = (GalleryImageSource) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
            if (galleryImageSource == null) {
                OLrzqt(c31696mAnAEQbTJ);
                android.widget.FrameLayout frameLayout2 = this.copydefault.AuCTel;
                if (frameLayout2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    frameLayout = frameLayout2;
                }
                frameLayout.setBackground(new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
                return;
            }
            java.lang.String httpUrl = galleryImageSource.getHttpUrl();
            if (httpUrl != null && httpUrl.length() != 0) {
                objValueOf = galleryImageSource.getHttpUrl();
            } else if (galleryImageSource.getUri() != null) {
                objValueOf = galleryImageSource.getUri();
            } else if (galleryImageSource.getBitmap() != null) {
                objValueOf = galleryImageSource.getBitmap();
            } else if (galleryImageSource.getResourceId() != 0) {
                objValueOf = java.lang.Integer.valueOf(galleryImageSource.getResourceId());
            }
            C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = Glide.AEQbTJ(c31696mAnAEQbTJ.getContext()).OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.DuR)).OLrzqt((RY<android.graphics.drawable.Drawable>) new C0825StateListAnimator(c31696mAnAEQbTJ, this, i, galleryImageSource));
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            if (objValueOf != null) {
                c31696mAnAEQbTJ.setScaleType(ImageView.ScaleType.FIT_CENTER);
                Glide.AEQbTJ(c31696mAnAEQbTJ.getContext()).KWHzl(objValueOf).AEQbTJ(c5335NtOLrzqt).OLrzqt((RY<android.graphics.drawable.Drawable>) new Application(c31696mAnAEQbTJ, this, i, galleryImageSource)).EZpvd((android.widget.ImageView) c31696mAnAEQbTJ);
            } else {
                c31696mAnAEQbTJ.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                c5335NtOLrzqt.EZpvd((android.widget.ImageView) c31696mAnAEQbTJ);
            }
            final ActivityC7885asK activityC7885asK = this.copydefault;
            c31696mAnAEQbTJ.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.ata
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return ActivityC7885asK.StateListAnimator.AEQbTJ(galleryImageSource, activityC7885asK, view);
                }
            });
        }

        /* JADX INFO: renamed from: o.asK$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0825StateListAnimator implements RY<android.graphics.drawable.Drawable> {
            public final /* synthetic */ int AEQbTJ;
            public final /* synthetic */ C31696mAn KWHzl;
            public final /* synthetic */ StateListAnimator OLrzqt;
            public final /* synthetic */ GalleryImageSource copydefault;

            @Override // o.RY
            public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
                return false;
            }

            public C0825StateListAnimator(C31696mAn c31696mAn, StateListAnimator stateListAnimator, int i, GalleryImageSource galleryImageSource) {
                this.KWHzl = c31696mAn;
                this.OLrzqt = stateListAnimator;
                this.AEQbTJ = i;
                this.copydefault = galleryImageSource;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
            @Override // o.RY
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
                this.KWHzl.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                this.OLrzqt.KWHzl(this.AEQbTJ, this.KWHzl, this.copydefault);
                return false;
            }
        }

        /* JADX INFO: renamed from: o.asK$StateListAnimator$Application */
        public static final class Application implements RY<android.graphics.drawable.Drawable> {
            public final /* synthetic */ int EZpvd;
            public final /* synthetic */ GalleryImageSource KWHzl;
            public final /* synthetic */ C31696mAn OLrzqt;
            public final /* synthetic */ StateListAnimator copydefault;

            @Override // o.RY
            public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
                return false;
            }

            public Application(C31696mAn c31696mAn, StateListAnimator stateListAnimator, int i, GalleryImageSource galleryImageSource) {
                this.OLrzqt = c31696mAn;
                this.copydefault = stateListAnimator;
                this.EZpvd = i;
                this.KWHzl = galleryImageSource;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
            @Override // o.RY
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
                this.OLrzqt.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.copydefault.KWHzl(this.EZpvd, this.OLrzqt, this.KWHzl);
                return false;
            }
        }

        public static final boolean AEQbTJ(final GalleryImageSource galleryImageSource, final ActivityC7885asK activityC7885asK, android.view.View view) {
            java.lang.String httpUrl = galleryImageSource.getHttpUrl();
            if (httpUrl == null || httpUrl.length() == 0) {
                return true;
            }
            C7884asJ c7884asJCopydefault = C7884asJ.Companion.copydefault(new Function0() { // from class: o.atd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC7885asK.StateListAnimator.KWHzl(activityC7885asK, galleryImageSource);
                }
            });
            androidx.fragment.app.FragmentManager supportFragmentManager = activityC7885asK.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c7884asJCopydefault.show(supportFragmentManager);
            return true;
        }

        public static final Unit KWHzl(ActivityC7885asK activityC7885asK, GalleryImageSource galleryImageSource) {
            java.lang.String httpUrl = galleryImageSource.getHttpUrl();
            Intrinsics.copydefault((java.lang.Object) httpUrl);
            activityC7885asK.OLrzqt(httpUrl);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(C31696mAn c31696mAn) {
            c31696mAn.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            Glide.AEQbTJ(c31696mAn.getContext()).OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.DuR)).EZpvd((android.widget.ImageView) c31696mAn);
        }

        public final void KWHzl(int i, C31696mAn c31696mAn, GalleryImageSource galleryImageSource) {
            float[] fArrDjBIcL;
            if (this.copydefault.isConnected || this.copydefault.djBIcL() == null || (fArrDjBIcL = this.copydefault.djBIcL()) == null || fArrDjBIcL.length != 4 || i != this.copydefault.copydefault()) {
                return;
            }
            c31696mAn.setVisibility(4);
            c31696mAn.getViewTreeObserver().addOnPreDrawListener(new TaskDescription(c31696mAn, this.copydefault, galleryImageSource));
        }

        /* JADX INFO: renamed from: o.asK$StateListAnimator$TaskDescription */
        public static final class TaskDescription implements ViewTreeObserver.OnPreDrawListener {
            public final /* synthetic */ GalleryImageSource AEQbTJ;
            public final /* synthetic */ C31696mAn EZpvd;
            public final /* synthetic */ ActivityC7885asK KWHzl;

            public TaskDescription(C31696mAn c31696mAn, ActivityC7885asK activityC7885asK, GalleryImageSource galleryImageSource) {
                this.EZpvd = c31696mAn;
                this.KWHzl = activityC7885asK;
                this.AEQbTJ = galleryImageSource;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                this.EZpvd.getViewTreeObserver().removeOnPreDrawListener(this);
                float[] fArrDjBIcL = this.KWHzl.djBIcL();
                if (fArrDjBIcL != null && fArrDjBIcL.length == 4) {
                    this.KWHzl.AEQbTJ(this.EZpvd, new RectF(fArrDjBIcL[0], fArrDjBIcL[1], fArrDjBIcL[2], fArrDjBIcL[3]), this.AEQbTJ);
                    this.KWHzl.isConnected = true;
                }
                return true;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onAttachedToRecyclerView(recyclerView);
            this.AEQbTJ = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            RecyclerView recyclerView2 = this.AEQbTJ;
            if (recyclerView2 != null) {
                int childCount = recyclerView2.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i));
                    if (childViewHolder instanceof ActionBar) {
                        android.view.View view = ((ActionBar) childViewHolder).itemView;
                        C7900asZ c7900asZ = view instanceof C7900asZ ? (C7900asZ) view : null;
                        if (c7900asZ != null) {
                            c7900asZ.KWHzl();
                        }
                    }
                }
            }
            this.AEQbTJ = null;
            super.onDetachedFromRecyclerView(recyclerView);
        }

        /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(@NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            android.view.View view = actionBar.itemView;
            C7900asZ c7900asZ = view instanceof C7900asZ ? (C7900asZ) view : null;
            if (c7900asZ != null) {
                c7900asZ.KWHzl();
            }
            super.onViewRecycled(actionBar);
        }

        public final android.view.View copydefault(int i) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
            RecyclerView recyclerView = this.AEQbTJ;
            if (recyclerView == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) == null || !(viewHolderFindViewHolderForAdapterPosition instanceof ActionBar)) {
                return null;
            }
            return ((ActionBar) viewHolderFindViewHolderForAdapterPosition).AEQbTJ();
        }

        public final GalleryImageSource EZpvd(int i) {
            GalleryImageSource galleryImageSource = this.KWHzl.get(i);
            Intrinsics.checkNotNullExpressionValue(galleryImageSource, "");
            return galleryImageSource;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.KWHzl.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            GalleryImageSource galleryImageSource = (GalleryImageSource) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
            if (galleryImageSource != null) {
                return C33129mqd.valueOf(java.lang.Integer.valueOf(galleryImageSource.hashCode()));
            }
            return -1L;
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TransitionGalleryActivity$saveImage$1(this, str, null), 3, null);
    }

    public static /* synthetic */ java.lang.String buildDisplayName$default(ActivityC7885asK activityC7885asK, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "jpg";
        }
        return activityC7885asK.EZpvd(str, str2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) throws java.security.NoSuchAlgorithmException {
        java.lang.String lowerCase = StringsKt__StringsKt.AEQbTJ(str, '.', "").toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        switch (lowerCase.hashCode()) {
            case 102340:
                if (lowerCase.equals("gif")) {
                    str2 = !Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "jpeg") ? lowerCase : "jpg";
                }
                break;
            case 105441:
                if (lowerCase.equals("jpg")) {
                }
                break;
            case 111145:
                if (lowerCase.equals("png")) {
                }
                break;
            case 3198679:
                if (lowerCase.equals("heic")) {
                }
                break;
            case 3198682:
                if (lowerCase.equals("heif")) {
                }
                break;
            case 3268712:
                if (lowerCase.equals("jpeg")) {
                }
                break;
            case 3645340:
                if (lowerCase.equals("webp")) {
                }
                break;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        return "okx_" + yDV.joinToString$default(bArrDigest, (java.lang.CharSequence) "", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new Function1() { // from class: o.asX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC7885asK.AEQbTJ(((java.lang.Byte) obj).byteValue());
            }
        }, 30, (java.lang.Object) null) + JwtUtilsKt.JWT_DELIMITER + str2;
    }

    public static final java.lang.CharSequence AEQbTJ(byte b) {
        java.lang.String str = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final android.net.Uri copydefault(java.lang.String str) {
        android.database.Cursor cursorQuery;
        android.net.Uri uriWithAppendedId;
        android.content.ContentResolver contentResolver = getContentResolver();
        if (Build.VERSION.SDK_INT >= 29) {
            android.net.Uri contentUri = MediaStore.Images.Media.getContentUri("external_primary");
            cursorQuery = contentResolver.query(contentUri, new java.lang.String[]{"_id"}, "_display_name=? AND relative_path=?", new java.lang.String[]{str, this.AEQbTJ}, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                uriWithAppendedId = cursorQuery.moveToFirst() ? android.content.ContentUris.withAppendedId(contentUri, cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"))) : null;
                yFA.copydefault(cursorQuery, null);
            } finally {
            }
        } else {
            android.net.Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            cursorQuery = contentResolver.query(uri, new java.lang.String[]{"_id"}, "_display_name=? AND _data LIKE ?", new java.lang.String[]{str, "%" + this.AEQbTJ + "%"}, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                uriWithAppendedId = cursorQuery.moveToFirst() ? android.content.ContentUris.withAppendedId(uri, cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"))) : null;
                yFA.copydefault(cursorQuery, null);
            } finally {
            }
        }
        return uriWithAppendedId;
    }

    public static final void OLrzqt(ActivityC7885asK activityC7885asK, java.lang.Boolean bool) {
        java.lang.String str = activityC7885asK.DbNXlk;
        activityC7885asK.DbNXlk = null;
        if (bool.booleanValue() && str != null) {
            activityC7885asK.AEQbTJ(str);
        } else {
            C33088mpp c33088mpp = C33088mpp.AEQbTJ;
            C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(c33088mpp.EZpvd(), C56423yEv.EZpvd(C56390yDp.OLrzqt("permission_name", C33070mpX.AYXKKw(c33088mpp.AYXKKw())))), 0, 1, (java.lang.Object) null);
        }
    }

    public final void OLrzqt(java.lang.String str) {
        if (Build.VERSION.SDK_INT < 29 && ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this.DbNXlk = str;
            this.AkhnZx.launch("android.permission.WRITE_EXTERNAL_STORAGE");
        } else {
            AEQbTJ(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: R */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.net.Uri KWHzl(java.lang.String str, java.lang.String str2) throws ExecutionException, java.lang.InterruptedException {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((java.io.File) Glide.copydefault((FragmentActivity) this).KWHzl().copydefault(str).AEQbTJ(true).AEQbTJ().get());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.io.File file = (java.io.File) objM7377constructorimpl;
        if (file == null) {
            java.io.File file2 = Glide.copydefault((FragmentActivity) this).KWHzl().copydefault(str).AEQbTJ().get();
            Intrinsics.checkNotNullExpressionValue(file2, "");
            file = file2;
        }
        java.lang.String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return OLrzqt(file, str2, EZpvd(name));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(java.lang.String str) {
        java.lang.String lowerCase = StringsKt__StringsKt.AEQbTJ(str, '.', "").toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        switch (lowerCase.hashCode()) {
            case 102340:
                return !lowerCase.equals("gif") ? "image/jpeg" : "image/gif";
            case 111145:
                if (lowerCase.equals("png")) {
                    return "image/png";
                }
                break;
            case 3198679:
                if (lowerCase.equals("heic")) {
                    return "image/heic";
                }
                break;
            case 3198682:
                if (!lowerCase.equals("heif")) {
                }
                break;
            case 3645340:
                if (lowerCase.equals("webp")) {
                    return "image/webp";
                }
                break;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final android.net.Uri OLrzqt(java.io.File file, java.lang.String str, java.lang.String str2) {
        android.net.Uri contentUri;
        java.io.FileInputStream fileInputStream;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", str2);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            contentValues.put("relative_path", this.AEQbTJ);
            contentValues.put("is_pending", (java.lang.Integer) 1);
        }
        android.content.ContentResolver contentResolver = getContentResolver();
        if (i >= 29) {
            contentUri = MediaStore.Images.Media.getContentUri("external_primary");
        } else {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        try {
            android.net.Uri uriInsert = contentResolver.insert(contentUri, contentValues);
            if (uriInsert == null) {
                return null;
            }
            try {
                java.io.OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                if (outputStreamOpenOutputStream != null) {
                    try {
                        fileInputStream = new java.io.FileInputStream(file);
                    } finally {
                    }
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i2 = fileInputStream.read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                outputStreamOpenOutputStream.write(bArr, 0, i2);
                            }
                            outputStreamOpenOutputStream.flush();
                            Unit unit = Unit.INSTANCE;
                            yFA.copydefault(fileInputStream, null);
                            yFA.copydefault(outputStreamOpenOutputStream, null);
                        } finally {
                        }
                    } catch (java.lang.Throwable th) {
                        Result.Application application = Result.Companion;
                        Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        return null;
                    }
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    android.content.ContentValues contentValues2 = new android.content.ContentValues();
                    contentValues2.put("is_pending", (java.lang.Integer) 0);
                    Unit unit2 = Unit.INSTANCE;
                    contentResolver.update(uriInsert, contentValues2, null, null);
                }
                try {
                    Result.Application application2 = Result.Companion;
                    java.lang.String strCopydefault = copydefault(uriInsert);
                    if (strCopydefault != null && strCopydefault.length() != 0) {
                        MediaScannerConnection.scanFile(this, new java.lang.String[]{strCopydefault}, new java.lang.String[]{str2}, null);
                    }
                    Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (java.lang.Throwable th2) {
                    Result.Application application3 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                }
                return uriInsert;
            } catch (java.lang.Exception unused) {
                Result.Application application4 = Result.Companion;
                Result.m7377constructorimpl(java.lang.Integer.valueOf(contentResolver.delete(uriInsert, null, null)));
                return null;
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.lang.String copydefault(android.net.Uri uri) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        android.database.Cursor cursorQuery = getContentResolver().query(uri, new java.lang.String[]{"_data"}, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            java.lang.String string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
            yFA.copydefault(cursorQuery, null);
            return string;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                yFA.copydefault(cursorQuery, th);
                throw th2;
            }
        }
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

package o;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC55114xdo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wXf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class ActivityC52757wXf extends AppCompatActivity implements InterfaceC55114xdo {
    public static final int $stable = 8;
    private boolean contentAdded;
    protected C33472mxB edgeToEdge;
    private C55378xin topBar;
    private final InterfaceC56387yDm pageStateDelegate$delegate = C56392yDr.copydefault(new Function0() { // from class: o.wXl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC52757wXf.pageStateDelegate_delegate$lambda$0(this.KWHzl);
        }
    });
    private final int brandThemeId = C52761wXj.LoaderManager.fERRXa;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getBrandThemeId() {
        return this.brandThemeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEdgeToEdge(@NotNull C33472mxB c33472mxB) {
        Intrinsics.checkNotNullParameter(c33472mxB, "");
        this.edgeToEdge = c33472mxB;
    }

    public final C33472mxB getEdgeToEdge() {
        C33472mxB c33472mxB = this.edgeToEdge;
        if (c33472mxB != null) {
            return c33472mxB;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "");
        setEdgeToEdge(new C33472mxB(this, window));
    }

    public final InterfaceC55114xdo getPageStateDelegate() {
        return (InterfaceC55114xdo) this.pageStateDelegate$delegate.getValue();
    }

    public static final C55111xdl pageStateDelegate_delegate$lambda$0(ActivityC52757wXf activityC52757wXf) {
        return new C55111xdl(activityC52757wXf);
    }

    @Override // o.InterfaceC55114xdo
    public void showToast(int i, int i2) {
        getPageStateDelegate().showToast(i, i2);
    }

    @Override // o.InterfaceC55114xdo
    public void cancelToast() {
        getPageStateDelegate().cancelToast();
    }

    public void showLoading() {
        getPageStateDelegate().showLoading();
    }

    public void showLoading(long j) {
        getPageStateDelegate().showLoading(j);
    }

    public void dismissLoading() {
        getPageStateDelegate().dismissLoading();
    }

    public void releaseLoading() {
        getPageStateDelegate().releaseLoading();
    }

    public void showLoadingWithLogo() {
        getPageStateDelegate().showLoadingWithLogo();
    }

    public void dismissLoadingWithLogo() {
        getPageStateDelegate().dismissLoadingWithLogo();
    }

    @Override // o.InterfaceC33075mpc
    public void showLoadingWithLogo(long j) {
        getPageStateDelegate().showLoadingWithLogo(j);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getPageStateDelegate().destroy();
    }

    @Override // o.InterfaceC55114xdo
    public void destroy() {
        InterfaceC55114xdo.TaskDescription.OLrzqt(this);
        getPageStateDelegate().destroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view) {
        super.setContentView(wrap(view));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        super.setContentView(wrap(getLayoutInflater().inflate(i, (android.view.ViewGroup) null)));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrap(view), layoutParams);
    }

    public final C55378xin supportOKTopBar() {
        C55378xin c55378xin = this.topBar;
        if (c55378xin != null) {
            return c55378xin;
        }
        C55378xin c55378xinCreateOKTopBar = createOKTopBar();
        this.topBar = c55378xinCreateOKTopBar;
        return c55378xinCreateOKTopBar;
    }

    public final C55378xin createOKTopBar() {
        return new C55378xin(this, null, 0, 6, null);
    }

    public final android.view.View wrap(android.view.View view) {
        if (this.topBar == null) {
            return view;
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.addView(this.topBar, new FrameLayout.LayoutParams(-1, -2));
        if (view != null) {
            linearLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
        return linearLayout;
    }

    public final void setNavigationBarColorSafely(@androidx.annotation.ColorInt int i) {
        getEdgeToEdge().AEQbTJ(i);
    }

    public final void setNavigationBarColor(@androidx.annotation.ColorInt int i) {
        getEdgeToEdge().KWHzl(i);
    }

    public int getColorThemeId() {
        return C33512mxp.AEQbTJ.values();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper
    public void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        super.onApplyThemeResource(theme, i, z);
        if (theme != null) {
            C52759wXh.AEQbTJ.OLrzqt(theme, getBrandThemeId(), getColorThemeId());
        }
        pUU.KWHzl("ConfigTheme", getClass().getCanonicalName() + " is already apply overlay theme.");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.okex.lite.navigation.riskBanner.RiskBannerManager$setupConfigChangeListener$1;
import com.okinc.okex.lite.navigation.riskBanner.RiskBannerManager$tryAddRiskBanner$1;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.C45758swd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.swk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45765swk {
    public static final C45765swk EZpvd = new C45765swk();
    public static final CoroutineExceptionHandler copydefault = new ActionBar(CoroutineExceptionHandler.Key);
    public static final int KWHzl = 8;

    private C45765swk() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(@NotNull android.app.Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof AbstractActivityC33041mov) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity), copydefault, null, new RiskBannerManager$tryAddRiskBanner$1(z, activity, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: o.swk$TaskDescription */
    public static final class TaskDescription implements View.OnLayoutChangeListener {
        public final /* synthetic */ android.widget.FrameLayout EZpvd;
        public final /* synthetic */ C45758swd KWHzl;

        public TaskDescription(android.widget.FrameLayout frameLayout, C45758swd c45758swd) {
            this.EZpvd = frameLayout;
            this.KWHzl = c45758swd;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            int height = view.getHeight();
            android.widget.FrameLayout frameLayout = this.EZpvd;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = height;
                marginLayoutParams = marginLayoutParams2;
            }
            frameLayout.setLayoutParams(marginLayoutParams);
            this.KWHzl.OLrzqt().bringToFront();
        }
    }

    public final void copydefault(AbstractActivityC33041mov abstractActivityC33041mov, C45762swh c45762swh) {
        android.view.View decorView = abstractActivityC33041mov.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "");
        if (decorView instanceof android.view.ViewGroup) {
            KWHzl(abstractActivityC33041mov, (android.view.ViewGroup) decorView, c45762swh);
        }
    }

    /* JADX INFO: renamed from: o.swk$ActionBar */
    public static final class ActionBar extends AbstractC56429yFa implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
        }

        public ActionBar(CoroutineExceptionHandler.Key key) {
            super(key);
        }
    }

    public final void AEQbTJ(@NotNull AppCompatActivity appCompatActivity) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        android.view.View decorView = appCompatActivity.getWindow() == null ? null : appCompatActivity.getWindow().getDecorView();
        if (decorView instanceof android.view.ViewGroup) {
            KWHzl((android.view.ViewGroup) decorView);
        }
    }

    public final void KWHzl(android.view.ViewGroup viewGroup) {
        OKAlertBanner oKAlertBanner = (OKAlertBanner) viewGroup.findViewById(C45758swd.Companion.copydefault());
        if (oKAlertBanner == null) {
            return;
        }
        viewGroup.removeView(oKAlertBanner);
        android.view.View viewFindViewById = viewGroup.findViewById(android.R.id.content);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewFindViewById;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams = marginLayoutParams2;
        }
        frameLayout.setLayoutParams(marginLayoutParams);
    }

    public final void KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, android.view.ViewGroup viewGroup, C45762swh c45762swh) {
        C45758swd.StateListAnimator stateListAnimator = C45758swd.Companion;
        ViewGroup.LayoutParams layoutParams = null;
        if (viewGroup.findViewById(stateListAnimator.copydefault()) == null) {
            android.view.View viewFindViewById = viewGroup.findViewById(android.R.id.content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewFindViewById;
            C45758swd c45758swd = new C45758swd(abstractActivityC33041mov);
            c45758swd.EZpvd(c45762swh.AEQbTJ());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.topMargin = C33570myu.AEQbTJ((android.content.Context) abstractActivityC33041mov);
            viewGroup.addView(c45758swd.OLrzqt(), 0, marginLayoutParams);
            OKAlertBanner oKAlertBannerOLrzqt = c45758swd.OLrzqt();
            if (ViewCompat.isLaidOut(oKAlertBannerOLrzqt) && !oKAlertBannerOLrzqt.isLayoutRequested()) {
                int height = oKAlertBannerOLrzqt.getHeight();
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin = height;
                    layoutParams = marginLayoutParams2;
                }
                frameLayout.setLayoutParams(layoutParams);
                c45758swd.OLrzqt().bringToFront();
            } else {
                oKAlertBannerOLrzqt.addOnLayoutChangeListener(new TaskDescription(frameLayout, c45758swd));
            }
            EZpvd(abstractActivityC33041mov, c45758swd);
            return;
        }
        if (c45762swh.OLrzqt()) {
            return;
        }
        android.view.View viewFindViewById2 = viewGroup.findViewById(stateListAnimator.copydefault());
        OKAlertBanner oKAlertBanner = viewFindViewById2 instanceof OKAlertBanner ? (OKAlertBanner) viewFindViewById2 : null;
        java.lang.Object tag = oKAlertBanner != null ? oKAlertBanner.getTag() : null;
        C45758swd c45758swd2 = tag instanceof C45758swd ? (C45758swd) tag : null;
        if (c45758swd2 != null) {
            c45758swd2.EZpvd(c45762swh.AEQbTJ());
        }
    }

    public final void EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, C45758swd c45758swd) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), copydefault, null, new RiskBannerManager$setupConfigChangeListener$1(c45758swd, null), 2, null);
    }
}

package o;

import android.view.View;
import android.view.WindowManager;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.IntentCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.okinc.business.dexui.main.swap.route.dag.model.DexRouteUIModel;
import com.okinc.business.dexui.main.swap.route.dag.model.PoolInfo;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeKey;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeMeta;
import com.okinc.business.dexui.main.swap.route.dag.ui.DexRoutePoolActivityResultContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.idZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC24423idZ extends AbstractActivityC33013moT {
    public final InterfaceC56387yDm EZpvd;
    public C23390hxN KWHzl;
    public final ActivityResultLauncher<DexRoutePoolActivityResultContract.Input> OLrzqt;
    public boolean copydefault;

    public static final void OLrzqt(Unit unit) {
    }

    public ActivityC24423idZ() {
        ActivityResultLauncher<DexRoutePoolActivityResultContract.Input> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new DexRoutePoolActivityResultContract(), new ActivityResultCallback() { // from class: o.ied
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC24423idZ.OLrzqt((Unit) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.OLrzqt = activityResultLauncherRegisterForActivityResult;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.iee
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC24423idZ.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public final DexRouteUIModel KWHzl() {
        return (DexRouteUIModel) this.EZpvd.getValue();
    }

    public static final DexRouteUIModel AEQbTJ(ActivityC24423idZ activityC24423idZ) {
        android.content.Intent intent = activityC24423idZ.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        DexRouteUIModel dexRouteUIModel = (DexRouteUIModel) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "extra_route_data", DexRouteUIModel.class));
        return dexRouteUIModel == null ? new DexRouteUIModel(yDY.AhwBna()) : dexRouteUIModel;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C23390hxN c23390hxNOLrzqt = C23390hxN.OLrzqt(getLayoutInflater());
        this.KWHzl = c23390hxNOLrzqt;
        C23390hxN c23390hxN = null;
        if (c23390hxNOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c23390hxNOLrzqt = null;
        }
        setContentView(c23390hxNOLrzqt.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(C23274hvD.Application.setRatingType), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.idW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return ActivityC24423idZ.KWHzl(view, windowInsetsCompat);
            }
        });
        C23390hxN c23390hxN2 = this.KWHzl;
        if (c23390hxN2 == null) {
            Intrinsics.gEmmrt("");
            c23390hxN2 = null;
        }
        c23390hxN2.djBIcL.setContentDescription("titleContainer");
        C23390hxN c23390hxN3 = this.KWHzl;
        if (c23390hxN3 == null) {
            Intrinsics.gEmmrt("");
            c23390hxN3 = null;
        }
        c23390hxN3.gEmmrt.setData(KWHzl().getRouterList());
        C23390hxN c23390hxN4 = this.KWHzl;
        if (c23390hxN4 == null) {
            Intrinsics.gEmmrt("");
            c23390hxN4 = null;
        }
        c23390hxN4.gEmmrt.setOnNodeClick(new Function2() { // from class: o.idX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC24423idZ.AEQbTJ(this.KWHzl, (RouteNodeKey) obj, (RouteNodeMeta) obj2);
            }
        });
        C23390hxN c23390hxN5 = this.KWHzl;
        if (c23390hxN5 == null) {
            Intrinsics.gEmmrt("");
            c23390hxN5 = null;
        }
        AppCompatImageView appCompatImageView = c23390hxN5.OLrzqt;
        appCompatImageView.setOnClickListener(new Activity(appCompatImageView, 1000L, this));
        C23390hxN c23390hxN6 = this.KWHzl;
        if (c23390hxN6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23390hxN = c23390hxN6;
        }
        c23390hxN.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.idV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC24423idZ.OLrzqt(this.OLrzqt, view);
            }
        });
        EZpvd(false);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.idY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC24423idZ.KWHzl(this.EZpvd);
            }
        });
    }

    public static final WindowInsetsCompat KWHzl(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    public static final Unit AEQbTJ(ActivityC24423idZ activityC24423idZ, RouteNodeKey routeNodeKey, RouteNodeMeta routeNodeMeta) {
        java.util.List<PoolInfo> arrayList;
        Intrinsics.checkNotNullParameter(routeNodeKey, "");
        ActivityResultLauncher<DexRoutePoolActivityResultContract.Input> activityResultLauncher = activityC24423idZ.OLrzqt;
        if (routeNodeMeta == null || (arrayList = routeNodeMeta.getPools()) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        activityResultLauncher.launch(new DexRoutePoolActivityResultContract.Input(arrayList));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ActivityC24423idZ activityC24423idZ, android.view.View view) {
        activityC24423idZ.AEQbTJ();
    }

    public static final void KWHzl(ActivityC24423idZ activityC24423idZ) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC24423idZ, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.clear();
        super.onSaveInstanceState(bundle);
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        if (C34703nhO.AYXKKw(this)) {
            if (!this.copydefault) {
                setRequestedOrientation(1);
                getWindow().clearFlags(1024);
            } else {
                setRequestedOrientation(0);
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.flags = 1024 | attributes.flags;
                getWindow().setAttributes(attributes);
            }
        }
        EZpvd(this.copydefault);
    }

    public final void AEQbTJ() {
        if (this.copydefault) {
            OLrzqt();
        } else {
            EZpvd();
        }
    }

    private final void OLrzqt() {
        this.copydefault = false;
        C23390hxN c23390hxN = this.KWHzl;
        C23390hxN c23390hxN2 = null;
        if (c23390hxN == null) {
            Intrinsics.gEmmrt("");
            c23390hxN = null;
        }
        AppCompatImageView appCompatImageView = c23390hxN.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(0);
        C23390hxN c23390hxN3 = this.KWHzl;
        if (c23390hxN3 == null) {
            Intrinsics.gEmmrt("");
            c23390hxN3 = null;
        }
        AppCompatTextView appCompatTextView = c23390hxN3.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(0);
        C23390hxN c23390hxN4 = this.KWHzl;
        if (c23390hxN4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23390hxN2 = c23390hxN4;
        }
        c23390hxN2.copydefault.setImageResource(C52761wXj.TaskDescription.RXdAnZ);
        if (C34703nhO.AYXKKw(this)) {
            setRequestedOrientation(1);
        }
        EZpvd(false);
    }

    public final void EZpvd() {
        this.copydefault = true;
        C23390hxN c23390hxN = this.KWHzl;
        C23390hxN c23390hxN2 = null;
        if (c23390hxN == null) {
            Intrinsics.gEmmrt("");
            c23390hxN = null;
        }
        AppCompatImageView appCompatImageView = c23390hxN.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(8);
        C23390hxN c23390hxN3 = this.KWHzl;
        if (c23390hxN3 == null) {
            Intrinsics.gEmmrt("");
            c23390hxN3 = null;
        }
        AppCompatTextView appCompatTextView = c23390hxN3.djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(8);
        C23390hxN c23390hxN4 = this.KWHzl;
        if (c23390hxN4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23390hxN2 = c23390hxN4;
        }
        c23390hxN2.copydefault.setImageResource(C52761wXj.TaskDescription.alsFma);
        if (C34703nhO.AYXKKw(this)) {
            setRequestedOrientation(0);
        }
        EZpvd(true);
    }

    public final void EZpvd(boolean z) {
        C23390hxN c23390hxN = this.KWHzl;
        if (c23390hxN == null) {
            Intrinsics.gEmmrt("");
            c23390hxN = null;
        }
        ConstraintLayout root = c23390hxN.getRoot();
        ConstraintLayout constraintLayout = root instanceof ConstraintLayout ? root : null;
        if (constraintLayout == null) {
            return;
        }
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        if (z) {
            constraintSet.constrainWidth(C23274hvD.Application.onBackPressed, -2);
            constraintSet.connect(C23274hvD.Application.onBackPressed, 4, 0, 4);
            constraintSet.connect(C23274hvD.Application.onBackPressed, 6, 0, 6);
            constraintSet.connect(C23274hvD.Application.onBackPressed, 7, 0, 7);
        } else {
            constraintSet.constrainWidth(C23274hvD.Application.onBackPressed, -1);
            constraintSet.clear(C23274hvD.Application.onBackPressed, 4);
            constraintSet.connect(C23274hvD.Application.onBackPressed, 6, 0, 6);
            constraintSet.connect(C23274hvD.Application.onBackPressed, 7, 0, 7);
        }
        constraintSet.connect(C23274hvD.Application.onBackPressed, 3, C23274hvD.Application.DcMfJKRKUgwx, 4);
        constraintSet.applyTo(constraintLayout);
    }

    /* JADX INFO: renamed from: o.idZ$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC24423idZ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC24423idZ activityC24423idZ) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = activityC24423idZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.finish();
            }
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

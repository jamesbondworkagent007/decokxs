package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.IntentCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexui.main.swap.route.dag.model.PoolInfo;
import com.okinc.business.dexui.main.swap.route.dag.ui.DexRoutePoolActivityResultContract;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;

/* JADX INFO: renamed from: o.idQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC24414idQ extends AbstractActivityC33013moT {
    public C23388hxL EZpvd;
    public C24478ieb OLrzqt;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.idT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC24414idQ.AEQbTJ(this.AEQbTJ);
        }
    });

    public final DexRoutePoolActivityResultContract.Input copydefault() {
        return (DexRoutePoolActivityResultContract.Input) this.copydefault.getValue();
    }

    public static final DexRoutePoolActivityResultContract.Input AEQbTJ(ActivityC24414idQ activityC24414idQ) {
        android.content.Intent intent = activityC24414idQ.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        DexRoutePoolActivityResultContract.Input input = (DexRoutePoolActivityResultContract.Input) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "extra_route_pool_data", DexRoutePoolActivityResultContract.Input.class));
        return input == null ? new DexRoutePoolActivityResultContract.Input(null, 1, null) : input;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C23388hxL c23388hxLKWHzl = C23388hxL.KWHzl(getLayoutInflater());
        this.EZpvd = c23388hxLKWHzl;
        C23388hxL c23388hxL = null;
        if (c23388hxLKWHzl == null) {
            Intrinsics.gEmmrt("");
            c23388hxLKWHzl = null;
        }
        setContentView(c23388hxLKWHzl.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(C23274hvD.Application.getErrorMessage), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.idS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return ActivityC24414idQ.KWHzl(view, windowInsetsCompat);
            }
        });
        C23388hxL c23388hxL2 = this.EZpvd;
        if (c23388hxL2 == null) {
            Intrinsics.gEmmrt("");
            c23388hxL2 = null;
        }
        c23388hxL2.AYXKKw.setText(getString(C23274hvD.Fragment.getCallerContract));
        C23388hxL c23388hxL3 = this.EZpvd;
        if (c23388hxL3 == null) {
            Intrinsics.gEmmrt("");
            c23388hxL3 = null;
        }
        c23388hxL3.AEQbTJ.setContentDescription("web3_dex_swap_provider_sub_route_back_button");
        C23388hxL c23388hxL4 = this.EZpvd;
        if (c23388hxL4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c23388hxL = c23388hxL4;
        }
        AppCompatImageView appCompatImageView = c23388hxL.AEQbTJ;
        appCompatImageView.setOnClickListener(new StateListAnimator(appCompatImageView, 1000L, this));
        EZpvd();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.idU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC24414idQ.OLrzqt(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat KWHzl(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsetsCompat;
    }

    public static final void OLrzqt(ActivityC24414idQ activityC24414idQ) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC24414idQ, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void EZpvd() {
        this.OLrzqt = new C24478ieb(copydefault().getPools(), new Function1() { // from class: o.idR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC24414idQ.EZpvd(this.copydefault, (PoolInfo) obj);
            }
        });
        C23388hxL c23388hxL = this.EZpvd;
        C24478ieb c24478ieb = null;
        if (c23388hxL == null) {
            Intrinsics.gEmmrt("");
            c23388hxL = null;
        }
        RecyclerView recyclerView = c23388hxL.EZpvd;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        C24478ieb c24478ieb2 = this.OLrzqt;
        if (c24478ieb2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c24478ieb = c24478ieb2;
        }
        recyclerView.setAdapter(c24478ieb);
    }

    public static final Unit EZpvd(ActivityC24414idQ activityC24414idQ, PoolInfo poolInfo) {
        Intrinsics.checkNotNullParameter(poolInfo, "");
        activityC24414idQ.AEQbTJ(poolInfo);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(PoolInfo poolInfo) {
        C25352ivB.OLrzqt(this, poolInfo.getOkLinkUrl());
    }

    /* JADX INFO: renamed from: o.idQ$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC24414idQ KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC24414idQ activityC24414idQ) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = activityC24414idQ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.finish();
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

package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fSU extends fTC {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.fSR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return fSU.copydefault(this.KWHzl);
        }
    });
    public C16257egX EZpvd;

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fSU.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, @NotNull ActivateTeeGuideModel activateTeeGuideModel) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(activateTeeGuideModel, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) fSU.class);
            intent.putExtra("tee_account_info", activateTeeGuideModel);
            return intent;
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull ActivateTeeGuideModel activateTeeGuideModel) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(activateTeeGuideModel, "");
            context.startActivity(OLrzqt(context, activateTeeGuideModel));
        }
    }

    public static final class Application extends ActivityResultContract<ActivateTeeGuideModel, ActivityResult> {
        public static final Application OLrzqt = new Application();

        private Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull ActivateTeeGuideModel activateTeeGuideModel) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(activateTeeGuideModel, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) fSU.class);
            intent.putExtra("tee_account_info", activateTeeGuideModel);
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public ActivityResult parseResult(int i, android.content.Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    private final ActivateTeeGuideModel gEmmrt() {
        android.content.Intent intent = getIntent();
        ActivateTeeGuideModel activateTeeGuideModel = intent != null ? (ActivateTeeGuideModel) intent.getParcelableExtra("tee_account_info") : null;
        ActivateTeeGuideModel activateTeeGuideModel2 = activateTeeGuideModel instanceof ActivateTeeGuideModel ? activateTeeGuideModel : null;
        if (activateTeeGuideModel2 != null) {
            return activateTeeGuideModel2;
        }
        throw new java.lang.IllegalArgumentException("Missing input params");
    }

    @Override // o.fTC, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C16257egX c16257egXCopydefault = C16257egX.copydefault(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c16257egXCopydefault, "");
        this.EZpvd = c16257egXCopydefault;
        setContentView(c16257egXCopydefault.getRoot());
        C17922fXg.AEQbTJ(this);
        ViewPager2 viewPager2 = c16257egXCopydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        OLrzqt(viewPager2);
        c16257egXCopydefault.djBIcL.setVisibility(4);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fSQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fSU.OLrzqt(this.KWHzl);
            }
        });
    }

    public static final void OLrzqt(fSU fsu) {
        rVN.reportFullyDrawn$default((android.app.Activity) fsu, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.fTC, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        for (ActivityResultCaller activityResultCaller : AEQbTJ()) {
            if (activityResultCaller instanceof fTD) {
                ((fTD) activityResultCaller).KWHzl();
            }
        }
    }

    /* JADX DEBUG: Possible override for method o.fTC.AEQbTJ()V */
    public final java.util.List<androidx.fragment.app.Fragment> AEQbTJ() {
        return (java.util.List) this.AEQbTJ.getValue();
    }

    public static final java.util.List copydefault(fSU fsu) {
        return C56402yEa.EZpvd(C17818fTk.Companion.AEQbTJ(fsu.gEmmrt()));
    }

    public static final class StateListAnimator extends FragmentStateAdapter {
        public StateListAnimator() {
            super(fSU.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return (androidx.fragment.app.Fragment) fSU.this.AEQbTJ().get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return fSU.this.AEQbTJ().size();
        }
    }

    public final void OLrzqt(ViewPager2 viewPager2) {
        viewPager2.setAdapter(new StateListAnimator());
    }

    @Override // o.fTC, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.fTC, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.fTC, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.fTC, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

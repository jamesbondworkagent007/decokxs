package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$1;
import com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$10;
import com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$2;
import com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$3;
import com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$4;
import com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$5;
import com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$6;
import com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$7;
import com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$8;
import com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$observeViewModelState$9;
import com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC17866fVe;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.fTR;
import o.fWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fVU extends fVW {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public java.lang.Boolean AYXKKw;
    public final ActivityResultLauncher<android.content.Intent> AhwBna;
    public java.lang.String djBIcL;
    public AbstractC16363eiX gEmmrt;
    public final InterfaceC56387yDm valueOf;

    public fVU() {
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(ReNewEnableViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tee.review.ui.ReNewEnableActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.fVX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                fVU.EZpvd(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReNewEnableViewModel gEmmrt() {
        return (ReNewEnableViewModel) this.valueOf.getValue();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fVU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ void startActivity$default(Application application, android.content.Context context, java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                bool = null;
            }
            application.AEQbTJ(context, str, bool);
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.Boolean bool) {
            int i;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) fVU.class);
            intent.putExtra("account_id", str);
            if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
                i = 1;
            } else {
                i = Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE) ? 0 : -1;
            }
            intent.putExtra("auto_renew", i);
            context.startActivity(intent);
        }
    }

    public static final class TaskDescription extends ActivityResultContract<java.lang.String, ActivityResult> {
        public static final TaskDescription copydefault = new TaskDescription();

        private TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) fVU.class);
            intent.putExtra("account_id", str);
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public ActivityResult parseResult(int i, android.content.Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    public static final void EZpvd(fVU fvu, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            fvu.setResult(-1);
            fvu.finish();
            try {
                fVE.Companion.EZpvd().EZpvd(new fWX.TaskStackBuilder());
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("ReNewEnableActivity", "disableLauncher", e);
            }
        }
    }

    @Override // o.fVW, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        Group group;
        super.onCreate(bundle);
        AbstractC16363eiX abstractC16363eiX = (AbstractC16363eiX) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.zuWLRA);
        this.gEmmrt = abstractC16363eiX;
        if (abstractC16363eiX != null && (group = abstractC16363eiX.valueOf) != null) {
            group.setVisibility(4);
        }
        djBIcL();
        AhwBna();
        valueOf();
    }

    private final void djBIcL() {
        this.djBIcL = getIntent().getStringExtra("account_id");
        int intExtra = getIntent().getIntExtra("auto_renew", -1);
        this.AYXKKw = intExtra != 0 ? intExtra != 1 ? null : java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
        ReNewEnableViewModel reNewEnableViewModelGEmmrt = gEmmrt();
        java.lang.String str = this.djBIcL;
        if (str == null) {
            return;
        }
        reNewEnableViewModelGEmmrt.EZpvd(str);
    }

    private final void valueOf() {
        C52794wYp c52794wYp;
        ConstraintLayout constraintLayout;
        AbstractC16363eiX abstractC16363eiX = this.gEmmrt;
        if (abstractC16363eiX != null && (constraintLayout = abstractC16363eiX.fJNWhG) != null) {
            constraintLayout.setOnClickListener(new ActionBar(constraintLayout, 1000L, this));
        }
        AbstractC16363eiX abstractC16363eiX2 = this.gEmmrt;
        if (abstractC16363eiX2 == null || (c52794wYp = abstractC16363eiX2.copydefault) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    public static final class Activity implements yHO<java.lang.Integer, java.lang.Boolean, wXX, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(java.lang.Integer num, java.lang.Boolean bool, wXX wxx) {
            EZpvd(num.intValue(), bool.booleanValue(), wxx);
            return Unit.INSTANCE;
        }

        public final void EZpvd(int i, boolean z, wXX wxx) {
            Intrinsics.checkNotNullParameter(wxx, "");
            fVU.this.AEQbTJ(i, z, wxx);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ fVU KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, fVU fvu) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = fvu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ActivityResultLauncher activityResultLauncher = this.KWHzl.AhwBna;
                ActivityC17866fVe.TaskDescription taskDescription = ActivityC17866fVe.Companion;
                fVU fvu = this.KWHzl;
                java.lang.String str = fvu.djBIcL;
                if (str == null) {
                    return;
                }
                activityResultLauncher.launch(taskDescription.AEQbTJ(fvu, str, this.KWHzl.gEmmrt().copydefault()));
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ fVU OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, fVU fvu) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = fvu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ReNewEnableViewModel.StateListAnimator value = this.OLrzqt.gEmmrt().AYXKKw().getValue();
                fTR.TaskDescription taskDescription = fTR.Companion;
                int i = C13754dXa.FragmentManager.isInitInProgress;
                int i2 = C13754dXa.FragmentManager.DXXBbs;
                int i3 = C13754dXa.FragmentManager.hfFNez;
                java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>(value.KWHzl());
                int iCopydefault = value.copydefault();
                java.lang.Boolean bool = this.OLrzqt.AYXKKw;
                fTR ftrCopydefault = taskDescription.copydefault(i, i2, i3, arrayList, iCopydefault, bool != null ? bool.booleanValue() : value.EZpvd(), this.OLrzqt.new Activity());
                androidx.fragment.app.FragmentManager supportFragmentManager = this.OLrzqt.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                ftrCopydefault.show(supportFragmentManager);
            }
        }
    }

    private final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ReNewEnableActivity$observeViewModelState$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ReNewEnableActivity$observeViewModelState$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ReNewEnableActivity$observeViewModelState$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ReNewEnableActivity$observeViewModelState$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ReNewEnableActivity$observeViewModelState$5(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ReNewEnableActivity$observeViewModelState$6(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ReNewEnableActivity$observeViewModelState$7(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ReNewEnableActivity$observeViewModelState$8(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ReNewEnableActivity$observeViewModelState$9(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ReNewEnableActivity$observeViewModelState$10(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean KWHzl() {
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        return Intrinsics.EZpvd((java.lang.Object) (abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null), (java.lang.Object) this.djBIcL);
    }

    public final void OLrzqt(@NotNull ReNewEnableViewModel.Activity.C0321Activity c0321Activity) {
        C52794wYp c52794wYp;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        Group group;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(c0321Activity, "");
        AbstractC16363eiX abstractC16363eiX = this.gEmmrt;
        if (abstractC16363eiX != null && (imageView = abstractC16363eiX.fetchVPNInfo) != null) {
            imageView.setImageResource(C13754dXa.Activity.DBxZfM);
        }
        AbstractC16363eiX abstractC16363eiX2 = this.gEmmrt;
        if (abstractC16363eiX2 != null && (textView4 = abstractC16363eiX2.zLjUOn) != null) {
            textView4.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.zEkrwr));
        }
        AbstractC16363eiX abstractC16363eiX3 = this.gEmmrt;
        if (abstractC16363eiX3 != null && (textView3 = abstractC16363eiX3.zLjUOn) != null) {
            textView3.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
        }
        AbstractC16363eiX abstractC16363eiX4 = this.gEmmrt;
        if (abstractC16363eiX4 != null && (group = abstractC16363eiX4.values) != null) {
            group.setVisibility(8);
        }
        AbstractC16363eiX abstractC16363eiX5 = this.gEmmrt;
        if (abstractC16363eiX5 != null && (constraintLayout2 = abstractC16363eiX5.ejfBZ) != null) {
            constraintLayout2.setVisibility(8);
        }
        AbstractC16363eiX abstractC16363eiX6 = this.gEmmrt;
        if (abstractC16363eiX6 != null && (constraintLayout = abstractC16363eiX6.fJNWhG) != null) {
            constraintLayout.setVisibility(8);
        }
        AbstractC16363eiX abstractC16363eiX7 = this.gEmmrt;
        if (abstractC16363eiX7 != null && (textView2 = abstractC16363eiX7.AhwBna) != null) {
            textView2.setVisibility(8);
        }
        AbstractC16363eiX abstractC16363eiX8 = this.gEmmrt;
        if (abstractC16363eiX8 != null && (textView = abstractC16363eiX8.AYXKKw) != null) {
            textView.setVisibility(0);
            copydefault(textView, C13754dXa.FragmentManager.zMXLsR, C13754dXa.FragmentManager.SePrCP);
        }
        AbstractC16363eiX abstractC16363eiX9 = this.gEmmrt;
        if (abstractC16363eiX9 == null || (c52794wYp = abstractC16363eiX9.copydefault) == null) {
            return;
        }
        c52794wYp.setVisibility(0);
    }

    public final void EZpvd(@NotNull ReNewEnableViewModel.Activity.TaskDescription taskDescription) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        java.lang.String strAYXKKw;
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        OLrzqt(taskDescription);
        AbstractC16363eiX abstractC16363eiX = this.gEmmrt;
        if (abstractC16363eiX != null && (imageView = abstractC16363eiX.fetchVPNInfo) != null) {
            imageView.setImageResource(C13754dXa.Activity.heceqZ);
        }
        AbstractC16363eiX abstractC16363eiX2 = this.gEmmrt;
        if (abstractC16363eiX2 != null && (textView4 = abstractC16363eiX2.DbNXlk) != null) {
            if (taskDescription.OLrzqt()) {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.dXhJGx);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.haRtnV);
            }
            textView4.setText(strAYXKKw);
        }
        AbstractC16363eiX abstractC16363eiX3 = this.gEmmrt;
        if (abstractC16363eiX3 != null && (textView3 = abstractC16363eiX3.getFieldNames) != null) {
            textView3.setText(taskDescription.copydefault());
        }
        AbstractC16363eiX abstractC16363eiX4 = this.gEmmrt;
        if (abstractC16363eiX4 != null && (textView2 = abstractC16363eiX4.getFieldNames) != null) {
            textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
        }
        AbstractC16363eiX abstractC16363eiX5 = this.gEmmrt;
        if (abstractC16363eiX5 == null || (textView = abstractC16363eiX5.AYXKKw) == null) {
            return;
        }
        copydefault(textView, C13754dXa.FragmentManager.sQOHWT, C13754dXa.FragmentManager.SdSTJp);
    }

    public final void EZpvd(@NotNull ReNewEnableViewModel.Activity.ActionBar actionBar) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        java.lang.String strCopydefault;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(actionBar, "");
        OLrzqt(actionBar);
        AbstractC16363eiX abstractC16363eiX = this.gEmmrt;
        if (abstractC16363eiX != null && (imageView = abstractC16363eiX.fetchVPNInfo) != null) {
            imageView.setImageResource(C13754dXa.Activity.heceqZ);
        }
        AbstractC16363eiX abstractC16363eiX2 = this.gEmmrt;
        if (abstractC16363eiX2 != null && (textView5 = abstractC16363eiX2.getNewProxyInstance) != null) {
            textView5.setVisibility(8);
        }
        AbstractC16363eiX abstractC16363eiX3 = this.gEmmrt;
        if (abstractC16363eiX3 != null && (textView4 = abstractC16363eiX3.DbNXlk) != null) {
            textView4.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.haRtnV));
        }
        AbstractC16363eiX abstractC16363eiX4 = this.gEmmrt;
        if (abstractC16363eiX4 != null && (textView3 = abstractC16363eiX4.getFieldNames) != null) {
            if (actionBar.KWHzl()) {
                strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ikcuIV);
            } else {
                strCopydefault = actionBar.copydefault();
            }
            textView3.setText(strCopydefault);
        }
        AbstractC16363eiX abstractC16363eiX5 = this.gEmmrt;
        if (abstractC16363eiX5 != null && (textView2 = abstractC16363eiX5.getFieldNames) != null) {
            textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        AbstractC16363eiX abstractC16363eiX6 = this.gEmmrt;
        if (abstractC16363eiX6 == null || (textView = abstractC16363eiX6.AYXKKw) == null) {
            return;
        }
        copydefault(textView, C13754dXa.FragmentManager.ScLVFT, C13754dXa.FragmentManager.SePrCP);
    }

    public final void OLrzqt(ReNewEnableViewModel.Activity.ActionBar actionBar) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        C52794wYp c52794wYp;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        Group group;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        java.lang.Integer value = gEmmrt().AkhnZx().getValue();
        if (value != null && value.intValue() == 0) {
            AbstractC16363eiX abstractC16363eiX = this.gEmmrt;
            if (abstractC16363eiX != null && (textView6 = abstractC16363eiX.AYXKKw) != null) {
                textView6.setVisibility(8);
            }
            AbstractC16363eiX abstractC16363eiX2 = this.gEmmrt;
            if (abstractC16363eiX2 != null && (textView5 = abstractC16363eiX2.AhwBna) != null) {
                textView5.setVisibility(0);
            }
        } else {
            AbstractC16363eiX abstractC16363eiX3 = this.gEmmrt;
            if (abstractC16363eiX3 != null && (textView2 = abstractC16363eiX3.AhwBna) != null) {
                textView2.setVisibility(8);
            }
            AbstractC16363eiX abstractC16363eiX4 = this.gEmmrt;
            if (abstractC16363eiX4 != null && (textView = abstractC16363eiX4.AYXKKw) != null) {
                textView.setVisibility(0);
            }
        }
        AbstractC16363eiX abstractC16363eiX5 = this.gEmmrt;
        if (abstractC16363eiX5 != null && (textView4 = abstractC16363eiX5.zLjUOn) != null) {
            textView4.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hQufeQ));
        }
        AbstractC16363eiX abstractC16363eiX6 = this.gEmmrt;
        if (abstractC16363eiX6 != null && (textView3 = abstractC16363eiX6.zLjUOn) != null) {
            textView3.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        }
        AbstractC16363eiX abstractC16363eiX7 = this.gEmmrt;
        if (abstractC16363eiX7 != null && (group = abstractC16363eiX7.values) != null) {
            group.setVisibility(0);
        }
        AbstractC16363eiX abstractC16363eiX8 = this.gEmmrt;
        if (abstractC16363eiX8 != null && (constraintLayout2 = abstractC16363eiX8.fJNWhG) != null) {
            constraintLayout2.setVisibility(0);
        }
        AbstractC16363eiX abstractC16363eiX9 = this.gEmmrt;
        if (abstractC16363eiX9 != null && (constraintLayout = abstractC16363eiX9.ejfBZ) != null) {
            constraintLayout.setVisibility(0);
        }
        AbstractC16363eiX abstractC16363eiX10 = this.gEmmrt;
        if (abstractC16363eiX10 == null || (c52794wYp = abstractC16363eiX10.copydefault) == null) {
            return;
        }
        c52794wYp.setVisibility(8);
    }

    public final void copydefault(android.widget.TextView textView, int i, final int i2) {
        KWHzl(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("learn", C33070mpX.AYXKKw(C13754dXa.FragmentManager.ODWQjV)))), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ODWQjV), textView, C52761wXj.Activity.fdOvFl, new Function0() { // from class: o.fVY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fVU.copydefault(i2, this);
            }
        });
    }

    public static final Unit copydefault(int i, fVU fvu) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf();
        bundleBundleOf.putString("url", C33070mpX.AYXKKw(i));
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, fvu, bundleBundleOf, null, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final int i, final boolean z, final wXX wxx) {
        if (gEmmrt().EZpvd()) {
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            new C14461dlr(supportFragmentManager, "reNewEnableSA", new Function1() { // from class: o.fVV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fVU.KWHzl(wxx, this, i, z, (java.lang.String) obj);
                }
            }, null, null, false, 56, null).EZpvd();
            return;
        }
        C17877fVp.Companion.OLrzqt().copydefault(this, new Function0() { // from class: o.fVZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fVU.gEmmrt(this.AEQbTJ);
            }
        });
    }

    public static final Unit KWHzl(wXX wxx, fVU fvu, final int i, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        wxx.dismissAllowingStateLoss();
        fvu.showLoadingWithLogo();
        C32866mlf.onEvent$default("Web3WalletSmartAccountTEEStatusPage_Button_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.fWa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fVU.OLrzqt(i, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        fvu.gEmmrt().AEQbTJ(i, z);
        fvu.gEmmrt().OLrzqt(str, false);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "web3wallet_smartaccount_renew_days", java.lang.String.valueOf(i), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(fVU fvu) {
        fvu.finish();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.fVU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.CharSequence setFormatStr$default(fVU fvu, int i, int i2, java.lang.String str, android.widget.TextView textView, int i3, Function0 function0, int i4, java.lang.Object obj) {
        if ((i4 & 16) != 0) {
            i3 = C52761wXj.Activity.fdOvFl;
        }
        int i5 = i3;
        if ((i4 & 32) != 0) {
            function0 = null;
        }
        return fvu.copydefault(i, i2, str, textView, i5, function0);
    }

    public final java.lang.CharSequence copydefault(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2, @NotNull java.lang.String str, @NotNull android.widget.TextView textView, int i3, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(textView, "");
        java.lang.String str2 = C33070mpX.AYXKKw(i2) + "\u200b";
        return KWHzl(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(str, str2))) + "\u200b", str2, textView, i3, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.fVU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.CharSequence setFormatStr$default(fVU fvu, int i, java.lang.String str, java.lang.String str2, android.widget.TextView textView, int i2, Function0 function0, int i3, java.lang.Object obj) {
        if ((i3 & 16) != 0) {
            i2 = C52761wXj.Activity.fdOvFl;
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            function0 = null;
        }
        return fvu.KWHzl(i, str, str2, textView, i4, function0);
    }

    public final java.lang.CharSequence KWHzl(@androidx.annotation.StringRes int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull android.widget.TextView textView, int i2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(textView, "");
        java.lang.String str3 = str + "\u200b";
        return KWHzl(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(str2, str3))) + "\u200b", str3, textView, i2, function0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.fVU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.CharSequence setFormatStr$default(fVU fvu, java.lang.String str, java.lang.String str2, android.widget.TextView textView, int i, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            function0 = null;
        }
        return fvu.KWHzl(str, str2, textView, i3, (Function0<Unit>) function0);
    }

    public final java.lang.CharSequence KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull android.widget.TextView textView, final int i, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(textView, "");
        java.lang.CharSequence charSequence = C33574myy.setupSpanStyles$default(str, new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.fWc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fVU.KWHzl(this.EZpvd, i, (java.util.List) obj);
            }
        }, 14, null);
        Intrinsics.copydefault(charSequence, "");
        android.text.SpannableString spannableString = (android.text.SpannableString) charSequence;
        textView.setText(spannableString);
        if (function0 != null) {
            textView.setOnTouchListener(new ViewOnTouchListenerC14460dlq(textView, str, str2, new Function0() { // from class: o.fWb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return fVU.copydefault(function0);
                }
            }));
        }
        return spannableString;
    }

    public static final Unit KWHzl(fVU fvu, int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(fvu, i)));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    @Override // o.fVW, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.fVW, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.fVW, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.fVW, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

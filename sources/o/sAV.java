package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.search.viewmodel.SearchResultArticlesViewModel;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sAV extends AbstractActivityC45846szL {
    public final InterfaceC56387yDm gEmmrt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.sAT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return sAV.AhwBna(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.sAS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return sAV.KWHzl(this.OLrzqt);
        }
    });
    public final boolean copydefault = true;

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public boolean AYXKKw() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public boolean bo_() {
        return this.copydefault;
    }

    public sAV() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(SearchResultArticlesViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.search.ui.SupportAnnouncementsActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.search.ui.SupportAnnouncementsActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.search.ui.SupportAnnouncementsActivity$special$$inlined$viewModels$default$3
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
    }

    public final SearchResultArticlesViewModel KWHzl() {
        return (SearchResultArticlesViewModel) this.gEmmrt.getValue();
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public java.lang.String AwvSrB() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String AhwBna(sAV sav) {
        java.lang.String stringExtra = sav.getIntent().getStringExtra("ARG_PAGE_SOURCE");
        return stringExtra == null ? "" : stringExtra;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sAV.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) sAV.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_PAGE_SOURCE", str)));
            intent.setFlags(603979776);
            return intent;
        }
    }

    /* JADX DEBUG: Possible override for method com.okinc.okex.common.ui.OKSupportBaseActivity.AEQbTJ()V */
    /* JADX DEBUG: Possible override for method o.snZ.AEQbTJ()V */
    /* JADX DEBUG: Possible override for method o.szL.AEQbTJ()V */
    public final AbstractC47282tnB AEQbTJ() {
        return (AbstractC47282tnB) this.EZpvd.getValue();
    }

    public static final AbstractC47282tnB KWHzl(sAV sav) {
        return AbstractC47282tnB.KWHzl(sav.getLayoutInflater());
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public android.view.View AkhnZx() {
        android.view.View root = AEQbTJ().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public void initFrameContent(@NotNull android.view.View view) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(view, "");
        C45363soQ.onSessionIdEvent$default("SupportCenter_Announcements_Article_View", true, null, 2, null);
        AEQbTJ();
        KWHzl(C33070mpX.AYXKKw(C47315tni.PendingIntent.fLIjIY));
        EZpvd(C52761wXj.TaskDescription.UJpkuA, C47315tni.Activity.djBIcL, new View.OnClickListener() { // from class: o.sAU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                sAV.copydefault(this.copydefault, view2);
            }
        });
        try {
            Result.Application application = Result.Companion;
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            C44026sAp c44026sApOLrzqt = C44026sAp.Companion.OLrzqt(CategorySlug.Announcement);
            fragmentTransactionBeginTransaction.replace(C47315tni.TaskDescription.QSBOWP, c44026sApOLrzqt, c44026sApOLrzqt.getTAG());
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Integer.valueOf(fragmentTransactionBeginTransaction.commitAllowingStateLoss()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44760scx.log$default("Failed to load announcement fragment: " + thM7380exceptionOrNullimpl.getMessage(), null, 2, null);
        }
        EZpvd();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.sAW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                sAV.AEQbTJ(this.OLrzqt);
            }
        });
    }

    public static final void copydefault(sAV sav, android.view.View view) {
        C45363soQ.onSessionIdEvent$default("SupportCenter_Announcements_Search_Click", true, null, 2, null);
        sav.startActivity(ActivityC44038sBa.Companion.EZpvd(sav, "announcements_list", "announcements_list"));
    }

    public static final void AEQbTJ(sAV sav) {
        rVN.reportFullyDrawn$default((android.app.Activity) sav, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void EZpvd() {
        SearchResultArticlesViewModel searchResultArticlesViewModelKWHzl = KWHzl();
        searchResultArticlesViewModelKWHzl.AEQbTJ(AwvSrB());
        searchResultArticlesViewModelKWHzl.EZpvd(CategorySlug.Announcement);
    }

    @Override // o.AbstractActivityC45846szL, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        KWHzl().KWHzl();
    }

    @Override // o.AbstractActivityC45846szL, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC45846szL, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC45846szL, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.AbstractActivityC45846szL, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}

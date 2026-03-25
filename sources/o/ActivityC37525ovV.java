package o;

import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.SelectGroupCallMemberActivityViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ovV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC37525ovV extends AbstractActivityC37508ovE<nIO> {
    public final InterfaceC56387yDm isConnected;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AYXKKw = 8;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.ovY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37525ovV.gEmmrt(this.copydefault);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ovX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37525ovV.AEQbTJ(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.ovU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37525ovV.djBIcL(this.OLrzqt);
        }
    });
    public final int djBIcL = C35399nuc.Dialog.AwvSrB;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.djBIcL;
    }

    public ActivityC37525ovV() {
        final Function0 function0 = null;
        this.isConnected = new ViewModelLazy(C56524yIo.AEQbTJ(SelectGroupCallMemberActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SearchAndSelectGroupCallMemberActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SearchAndSelectGroupCallMemberActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SearchAndSelectGroupCallMemberActivity$special$$inlined$viewModels$default$3
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

    public final SelectGroupCallMemberActivityViewModel AYXKKw() {
        return (SelectGroupCallMemberActivityViewModel) this.isConnected.getValue();
    }

    private final java.util.List<java.lang.String> AhwBna() {
        return (java.util.List) this.AhwBna.getValue();
    }

    public static final java.util.List gEmmrt(ActivityC37525ovV activityC37525ovV) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = activityC37525ovV.getIntent().getStringArrayListExtra("ARG_SELECTED_LIST");
        return stringArrayListExtra != null ? stringArrayListExtra : yDY.AhwBna();
    }

    private final java.util.List<java.lang.String> djBIcL() {
        return (java.util.List) this.valueOf.getValue();
    }

    public static final java.util.List AEQbTJ(ActivityC37525ovV activityC37525ovV) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = activityC37525ovV.getIntent().getStringArrayListExtra("ARG_COMPLETED_LIST");
        return stringArrayListExtra != null ? stringArrayListExtra : yDY.AhwBna();
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public static final java.lang.String djBIcL(ActivityC37525ovV activityC37525ovV) {
        return activityC37525ovV.getIntent().getStringExtra("ARG_GROUP_ID");
    }

    /* JADX INFO: renamed from: o.ovV$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ovV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC37525ovV.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_SELECTED_LIST", list), C56390yDp.OLrzqt("ARG_COMPLETED_LIST", list2), C56390yDp.OLrzqt("ARG_GROUP_ID", str)));
            return intent;
        }
    }

    @Override // o.AbstractActivityC37508ovE, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AYXKKw().KWHzl(valueOf(), djBIcL());
        isConnected();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.owc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC37525ovV.valueOf(this.EZpvd);
            }
        });
    }

    public static final void valueOf(ActivityC37525ovV activityC37525ovV) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC37525ovV, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void isConnected() {
        getSupportFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.iCPUKe, C37584owb.Companion.OLrzqt(AhwBna(), valueOf(), djBIcL())).commit();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        setIntent(intent);
        isConnected();
    }

    @Override // o.AbstractActivityC37508ovE, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC37508ovE, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC37508ovE, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC37508ovE, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

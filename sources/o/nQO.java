package o;

import androidx.core.graphics.Insets;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.group.create.CreateGroupActivity$initViewModel$1;
import com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel;
import com.okinc.im.imui.relationlist.model.GroupType;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nQO extends AbstractActivityC34090nRa<AbstractC33847nIa> {
    public final InterfaceC56387yDm EZpvd;
    public final int OLrzqt = C35399nuc.Dialog.AYXKKw;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    public nQO() {
        final Function0 function0 = null;
        this.EZpvd = new ViewModelLazy(C56524yIo.AEQbTJ(CreateGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.create.CreateGroupActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.create.CreateGroupActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.create.CreateGroupActivity$special$$inlined$viewModels$default$3
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

    private final CreateGroupViewModel djBIcL() {
        return (CreateGroupViewModel) this.EZpvd.getValue();
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        public final GroupType AEQbTJ;
        public final java.lang.Integer EZpvd;
        public final java.lang.Double KWHzl;
        public final java.util.List<java.lang.String> OLrzqt;
        public final GroupBillingType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.nQO$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.List list, GroupType groupType, GroupBillingType groupBillingType, java.lang.Double d, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = actionBar.OLrzqt;
            }
            if ((i & 2) != 0) {
                groupType = actionBar.AEQbTJ;
            }
            GroupType groupType2 = groupType;
            if ((i & 4) != 0) {
                groupBillingType = actionBar.copydefault;
            }
            GroupBillingType groupBillingType2 = groupBillingType;
            if ((i & 8) != 0) {
                d = actionBar.KWHzl;
            }
            java.lang.Double d2 = d;
            if ((i & 16) != 0) {
                num = actionBar.EZpvd;
            }
            return actionBar.copydefault(list, groupType2, groupBillingType2, d2, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupType OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupBillingType copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull GroupType groupType, GroupBillingType groupBillingType, java.lang.Double d, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(groupType, "");
            return new ActionBar(list, groupType, groupBillingType, d, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && this.AEQbTJ == actionBar.AEQbTJ && this.copydefault == actionBar.copydefault && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            GroupBillingType groupBillingType = this.copydefault;
            int iHashCode3 = groupBillingType == null ? 0 : groupBillingType.hashCode();
            java.lang.Double d = this.KWHzl;
            int iHashCode4 = d == null ? 0 : d.hashCode();
            java.lang.Integer num = this.EZpvd;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CreateGroupRequest(memberIds=" + this.OLrzqt + ", groupType=" + this.AEQbTJ + ", billingCycle=" + this.copydefault + ", membershipFee=" + this.KWHzl + ", currencyId=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull java.util.List<java.lang.String> list, @NotNull GroupType groupType, GroupBillingType groupBillingType, java.lang.Double d, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(groupType, "");
            this.OLrzqt = list;
            this.AEQbTJ = groupType;
            this.copydefault = groupBillingType;
            this.KWHzl = d;
            this.EZpvd = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r7v0 java.util.List)
  (wrap:com.okinc.im.imui.relationlist.model.GroupType:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.im.imui.relationlist.model.GroupType:0x0004: SGET  A[WRAPPED] (LINE:30) com.okinc.im.imui.relationlist.model.GroupType.STANDARD com.okinc.im.imui.relationlist.model.GroupType) : (r8v0 com.okinc.im.imui.relationlist.model.GroupType))
  (wrap:com.okinc.okimcore.model.im.group.GroupBillingType:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.GroupBillingType) : (r9v0 com.okinc.okimcore.model.im.group.GroupBillingType))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r10v0 java.lang.Double))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
 A[MD:(java.util.List<java.lang.String>, com.okinc.im.imui.relationlist.model.GroupType, com.okinc.okimcore.model.im.group.GroupBillingType, java.lang.Double, java.lang.Integer):void (m)] (LINE:28) call: o.nQO.ActionBar.<init>(java.util.List, com.okinc.im.imui.relationlist.model.GroupType, com.okinc.okimcore.model.im.group.GroupBillingType, java.lang.Double, java.lang.Integer):void type: THIS */
        public /* synthetic */ ActionBar(java.util.List list, GroupType groupType, GroupBillingType groupBillingType, java.lang.Double d, java.lang.Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? GroupType.STANDARD : groupType, (i & 4) != 0 ? null : groupBillingType, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : num);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nQO.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(actionBar, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) nQO.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_MEMBER_IDS", actionBar.KWHzl()), C56390yDp.OLrzqt("KEY_GROUP_TYPE", actionBar.OLrzqt()), C56390yDp.OLrzqt("KEY_BILLING_CYCLE", actionBar.copydefault()), C56390yDp.OLrzqt("KEY_MEMBERSHIP_FEE", actionBar.AEQbTJ()), C56390yDp.OLrzqt("KEY_CURRENCY_ID", actionBar.EZpvd())));
            return intent;
        }
    }

    @Override // o.AbstractActivityC34090nRa, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gEmmrt();
        AYXKKw();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nQL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                nQO.OLrzqt(this.AEQbTJ);
            }
        });
    }

    public static final void OLrzqt(nQO nqo) {
        rVN.reportFullyDrawn$default((android.app.Activity) nqo, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        java.lang.Object objM7377constructorimpl;
        final AbstractC33847nIa abstractC33847nIa = (AbstractC33847nIa) KWHzl();
        ViewCompat.setOnApplyWindowInsetsListener(abstractC33847nIa.getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.nQN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return nQO.copydefault(view, windowInsetsCompat);
            }
        });
        abstractC33847nIa.getRoot().post(new java.lang.Runnable() { // from class: o.nQK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                nQO.EZpvd(abstractC33847nIa);
            }
        });
        androidx.appcompat.widget.Toolbar toolbar = abstractC33847nIa.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        setupActionBarTitle(toolbar, abstractC33847nIa.AEQbTJ, null);
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Integer.valueOf(getSupportFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.DIIpTV, nQQ.Companion.EZpvd()).commitAllowingStateLoss()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44124sEe.AYXKKw("Failed to load create group fragment", thM7380exceptionOrNullimpl);
        }
    }

    public static final WindowInsetsCompat copydefault(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(insets.left, insets.top, insets.right, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ODWQjV));
        return windowInsetsCompat;
    }

    public static final void EZpvd(AbstractC33847nIa abstractC33847nIa) {
        ViewCompat.requestApplyInsets(abstractC33847nIa.getRoot());
    }

    private final void AYXKKw() {
        C37721ozF.collectOnLifecycle$default(djBIcL().EZpvd(), this, (Lifecycle.State) null, new CreateGroupActivity$initViewModel$1(null), 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC34090nRa, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC34090nRa, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC34090nRa, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC34090nRa, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

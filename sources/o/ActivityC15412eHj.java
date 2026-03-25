package o;

import android.view.View;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.defi.wallet.hardware.onekey.HardwareWalletOneKeyPairingType;
import com.okinc.business.defi.wallet.hardware.onekey.OneKeyConnectEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.hardware.api.onekey.OneKeyAuthStage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC15412eHj;
import o.C13754dXa;
import o.C15423eHu;
import o.InterfaceC57039yar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eHj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC15412eHj extends AbstractActivityC33013moT implements InterfaceC57039yar.ActionBar {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.eHi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC15412eHj.DbNXlk();
        }
    });
    public AbstractC16340eiA KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public eGW copydefault;

    /* JADX INFO: renamed from: o.eHj$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OneKeyAuthStage.values().length];
            try {
                iArr[OneKeyAuthStage.WAIT_FOR_PIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OneKeyAuthStage.CLOSE_WINDOW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX INFO: renamed from: o.eHj$LoaderManager */
    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public ActivityC15412eHj() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(C15423eHu.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.hardware.onekey.OneKeySelectAccountActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.hardware.onekey.OneKeySelectAccountActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.hardware.onekey.OneKeySelectAccountActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.eHj$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eHj.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.eHj$StateListAnimator */
    public static final class StateListAnimator {
        public final int AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        public StateListAnimator(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.copydefault = str;
            this.EZpvd = str2;
            this.KWHzl = str3;
            this.OLrzqt = str4;
            this.AEQbTJ = i;
        }
    }

    /* JADX INFO: renamed from: o.eHj$ActionBar */
    public interface ActionBar {

        /* JADX INFO: renamed from: o.eHj$ActionBar$StateListAnimator */
        public static final class StateListAnimator implements ActionBar {
            public static final StateListAnimator AEQbTJ = new StateListAnimator();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success";
            }

            private StateListAnimator() {
            }
        }

        /* JADX INFO: renamed from: o.eHj$ActionBar$Application */
        public static final class Application implements ActionBar {
            public static final Application copydefault = new Application();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Cancelled";
            }

            private Application() {
            }
        }

        /* JADX INFO: renamed from: o.eHj$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0833ActionBar implements ActionBar {
            public final int AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int copydefault() {
                return this.AEQbTJ;
            }

            public C0833ActionBar(@androidx.annotation.StringRes int i) {
                this.AEQbTJ = i;
            }

            public java.lang.String toString() {
                return "Error(message=" + this.AEQbTJ + ")";
            }
        }
    }

    /* JADX INFO: renamed from: o.eHj$Application */
    public static final class Application extends ActivityResultContract<StateListAnimator, ActionBar> {
        public static final Application AEQbTJ = new Application();

        private Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            android.content.Intent intentPutExtra = new android.content.Intent(context, (java.lang.Class<?>) ActivityC15412eHj.class).putExtra("connectId", stateListAnimator.KWHzl()).putExtra("deviceId", stateListAnimator.AEQbTJ()).putExtra("deviceType", stateListAnimator.OLrzqt()).putExtra(OtcExtraKeys.MODE, stateListAnimator.EZpvd()).putExtra("label", stateListAnimator.copydefault());
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public ActionBar parseResult(int i, android.content.Intent intent) {
            if (i != -1) {
                return ActionBar.Application.copydefault;
            }
            if (intent != null && intent.hasExtra("errorMessage")) {
                return new ActionBar.C0833ActionBar(intent.getIntExtra("errorMessage", 0));
            }
            return ActionBar.StateListAnimator.AEQbTJ;
        }
    }

    public final C15423eHu EZpvd() {
        return (C15423eHu) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw DbNXlk() {
        return new C43316rmw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C43316rmw valueOf() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    private final int AhwBna() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getIntExtra(OtcExtraKeys.MODE, 1);
        }
        return 1;
    }

    public final java.lang.String AEQbTJ() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getStringExtra("connectId");
        }
        return null;
    }

    private final InterfaceC57039yar gEmmrt() {
        return ((InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class)).OLrzqt();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC16340eiA abstractC16340eiA = (AbstractC16340eiA) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.RlQdEF);
        this.KWHzl = abstractC16340eiA;
        if (abstractC16340eiA == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA = null;
        }
        C52794wYp c52794wYpCopydefault = abstractC16340eiA.EZpvd.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(false);
        }
        djBIcL();
        AYXKKw();
        fetchVPNInfo();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gEmmrt().AEQbTJ(this);
    }

    private final void djBIcL() {
        AbstractC16340eiA abstractC16340eiA = this.KWHzl;
        AbstractC16340eiA abstractC16340eiA2 = null;
        if (abstractC16340eiA == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA = null;
        }
        abstractC16340eiA.OLrzqt.djBIcL(false);
        AbstractC16340eiA abstractC16340eiA3 = this.KWHzl;
        if (abstractC16340eiA3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA3 = null;
        }
        abstractC16340eiA3.OLrzqt.AhwBna(true);
        AbstractC16340eiA abstractC16340eiA4 = this.KWHzl;
        if (abstractC16340eiA4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA4 = null;
        }
        abstractC16340eiA4.OLrzqt.KWHzl(new InterfaceC57900yrD() { // from class: o.eHr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC15412eHj.AEQbTJ(this.EZpvd, interfaceC57934yrl);
            }
        });
        AbstractC16340eiA abstractC16340eiA5 = this.KWHzl;
        if (abstractC16340eiA5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA5 = null;
        }
        abstractC16340eiA5.copydefault.setHasFixedSize(true);
        AbstractC16340eiA abstractC16340eiA6 = this.KWHzl;
        if (abstractC16340eiA6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA6 = null;
        }
        abstractC16340eiA6.copydefault.setLayoutManager(new LinearLayoutManager(this, 1, false));
        AbstractC16340eiA abstractC16340eiA7 = this.KWHzl;
        if (abstractC16340eiA7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA7 = null;
        }
        abstractC16340eiA7.copydefault.addItemDecoration(new C31703mAu(C55298xhM.copydefault(16.0f, (android.content.Context) this), C55298xhM.copydefault(16.0f, (android.content.Context) this)));
        AbstractC16340eiA abstractC16340eiA8 = this.KWHzl;
        if (abstractC16340eiA8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16340eiA2 = abstractC16340eiA8;
        }
        abstractC16340eiA2.copydefault.setAdapter(valueOf());
        C43316rmw c43316rmwValueOf = valueOf();
        int i = C13754dXa.TaskDescription.v;
        int i2 = dTV.isConnected;
        c43316rmwValueOf.register(C15423eHu.TaskDescription.StateListAnimator.class, new Dialog(i, i2));
        valueOf().register(C15423eHu.TaskDescription.ActionBar.class, new Fragment(C13754dXa.TaskDescription.fTEjYi, i2));
        C33064mpR.OLrzqt(valueOf(), (java.util.List<? extends java.lang.Object>) C56402yEa.EZpvd(C15423eHu.TaskDescription.StateListAnimator.OLrzqt));
    }

    public static final void AEQbTJ(ActivityC15412eHj activityC15412eHj, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        activityC15412eHj.EZpvd().gEmmrt();
    }

    /* JADX INFO: renamed from: o.eHj$Dialog */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Dialog extends C43318rmy<C15423eHu.TaskDescription.StateListAnimator, AbstractC16775eqL> {
        public Dialog(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC43310rmq, o.AbstractC59533zio
        public C43312rms<AbstractC16775eqL> onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C43312rms<AbstractC16775eqL> c43312rmsOnCreateViewHolder = super.onCreateViewHolder(layoutInflater, viewGroup);
            Intrinsics.checkNotNullExpressionValue(c43312rmsOnCreateViewHolder, "");
            AppCompatTextView appCompatTextView = ((AbstractC16775eqL) c43312rmsOnCreateViewHolder.OLrzqt()).KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L));
            return c43312rmsOnCreateViewHolder;
        }

        /* JADX INFO: renamed from: o.eHj$Dialog$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j) {
                this.copydefault = view;
                this.OLrzqt = j;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    android.content.Context context = ((AppCompatTextView) this.copydefault).getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.FullyDrawnReporterKtreportWhenComplete1);
                    ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C13754dXa.FragmentManager.getNotifyChildrenChangedOptions, (View.OnClickListener) null, 2, (java.lang.Object) null);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.eHj$Fragment */
    public static final class Fragment extends C43318rmy<C15423eHu.TaskDescription.ActionBar, AbstractC16864erv> {
        public C15423eHu.TaskDescription.ActionBar copydefault;

        public Fragment(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC16864erv> c43312rms, final C15423eHu.TaskDescription.ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(actionBar, "");
            super.onBindViewHolder((C43312rms) c43312rms, actionBar);
            actionBar.copydefault(Intrinsics.EZpvd(actionBar, this.copydefault));
            ((AbstractC16864erv) c43312rms.OLrzqt()).OLrzqt.setText(actionBar.EZpvd());
            ((AbstractC16864erv) c43312rms.OLrzqt()).AEQbTJ.setText(actionBar.AEQbTJ());
            C55251xgS c55251xgS = ((AbstractC16864erv) c43312rms.OLrzqt()).copydefault;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(actionBar.valueOf() ? 0 : 8);
            AppCompatImageView appCompatImageView = ((AbstractC16864erv) c43312rms.OLrzqt()).KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(actionBar.valueOf() ^ true ? 0 : 8);
            ((AbstractC16864erv) c43312rms.OLrzqt()).KWHzl.setSelected(actionBar.gEmmrt());
            android.view.View root = ((AbstractC16864erv) c43312rms.OLrzqt()).getRoot();
            final ActivityC15412eHj activityC15412eHj = ActivityC15412eHj.this;
            root.setOnClickListener(new View.OnClickListener() { // from class: o.eHo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC15412eHj.Fragment.AEQbTJ(actionBar, this, activityC15412eHj, view);
                }
            });
        }

        public static final void AEQbTJ(C15423eHu.TaskDescription.ActionBar actionBar, Fragment fragment, ActivityC15412eHj activityC15412eHj, android.view.View view) {
            AbstractC16340eiA abstractC16340eiA = null;
            if (actionBar.gEmmrt()) {
                fragment.copydefault = null;
                AbstractC16340eiA abstractC16340eiA2 = activityC15412eHj.KWHzl;
                if (abstractC16340eiA2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16340eiA = abstractC16340eiA2;
                }
                C52794wYp c52794wYpCopydefault = abstractC16340eiA.EZpvd.copydefault();
                if (c52794wYpCopydefault != null) {
                    c52794wYpCopydefault.setEnabled(false);
                }
            } else {
                fragment.copydefault = actionBar;
                AbstractC16340eiA abstractC16340eiA3 = activityC15412eHj.KWHzl;
                if (abstractC16340eiA3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16340eiA = abstractC16340eiA3;
                }
                C52794wYp c52794wYpCopydefault2 = abstractC16340eiA.EZpvd.copydefault();
                if (c52794wYpCopydefault2 != null) {
                    c52794wYpCopydefault2.setEnabled(true);
                }
            }
            activityC15412eHj.valueOf().notifyDataSetChanged();
        }
    }

    private final void AYXKKw() {
        EZpvd().gEmmrt();
        EZpvd().KWHzl().observe(this, new LoaderManager(new Function1() { // from class: o.eHk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15412eHj.KWHzl(this.AEQbTJ, (C15423eHu.Application) obj);
            }
        }));
        EZpvd().AhwBna().observe(this, new LoaderManager(new Function1() { // from class: o.eHl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15412eHj.KWHzl(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit KWHzl(ActivityC15412eHj activityC15412eHj, C15423eHu.Application application) {
        if (application instanceof C15423eHu.Application.TaskDescription) {
            activityC15412eHj.setForceDismiss(false);
            activityC15412eHj.showLoading();
        } else if (application instanceof C15423eHu.Application.StateListAnimator) {
            activityC15412eHj.dismissLoading();
            activityC15412eHj.OLrzqt();
            C33064mpR.OLrzqt(activityC15412eHj.valueOf(), (java.util.List<? extends java.lang.Object>) ((C15423eHu.Application.StateListAnimator) application).KWHzl());
            AbstractC16340eiA abstractC16340eiA = activityC15412eHj.KWHzl;
            if (abstractC16340eiA == null) {
                Intrinsics.gEmmrt("");
                abstractC16340eiA = null;
            }
            abstractC16340eiA.OLrzqt.valueOf();
            rVN.reportFullyDrawn$default((android.app.Activity) activityC15412eHj, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            if (!(application instanceof C15423eHu.Application.C0834Application)) {
                throw new NoWhenBranchMatchedException();
            }
            activityC15412eHj.dismissLoading();
            activityC15412eHj.OLrzqt();
            OneKeyConnectEvent.ShowNotification showNotificationEZpvd = C15406eHd.EZpvd(((C15423eHu.Application.C0834Application) application).KWHzl());
            if (activityC15412eHj.valueOf().getItemCount() <= 1) {
                rVN.reportFullyDrawn$default((android.app.Activity) activityC15412eHj, false, (java.lang.String) null, 2, (java.lang.Object) null);
                activityC15412eHj.setResult(-1, new android.content.Intent().putExtra("errorMessage", showNotificationEZpvd.getTitle()));
                activityC15412eHj.finish();
            } else {
                C15406eHd.KWHzl(activityC15412eHj, showNotificationEZpvd.getTitle());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC15412eHj activityC15412eHj, java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE)) {
            activityC15412eHj.AkhnZx();
        }
        return Unit.INSTANCE;
    }

    private final void AkhnZx() {
        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.launchUnitdefault, 0, 1, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        OLrzqt();
        gEmmrt().EZpvd(this);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.lang.String strAEQbTJ = AEQbTJ();
        if (strAEQbTJ != null) {
            gEmmrt().EZpvd(strAEQbTJ);
        }
    }

    private final void fetchVPNInfo() {
        AbstractC16340eiA abstractC16340eiA = this.KWHzl;
        AbstractC16340eiA abstractC16340eiA2 = null;
        if (abstractC16340eiA == null) {
            Intrinsics.gEmmrt("");
            abstractC16340eiA = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC16340eiA.AEQbTJ);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.eHp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC15412eHj.copydefault(this.KWHzl, obj);
            }
        });
        AbstractC16340eiA abstractC16340eiA3 = this.KWHzl;
        if (abstractC16340eiA3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16340eiA2 = abstractC16340eiA3;
        }
        C52794wYp c52794wYpCopydefault = abstractC16340eiA2.EZpvd.copydefault();
        if (c52794wYpCopydefault == null) {
            return;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst2 = C8003auW.copydefault(c52794wYpCopydefault).throttleFirst(1L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst2, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst2, this).subscribe(new InterfaceC58227yxM() { // from class: o.eHq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC15412eHj.KWHzl(this.AEQbTJ, obj);
            }
        });
    }

    public static final void copydefault(ActivityC15412eHj activityC15412eHj, java.lang.Object obj) {
        activityC15412eHj.finish();
    }

    public static final void KWHzl(ActivityC15412eHj activityC15412eHj, java.lang.Object obj) {
        java.lang.Object next;
        java.util.List<?> items = activityC15412eHj.valueOf().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        java.util.Iterator<T> it = items.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if ((next instanceof C15423eHu.TaskDescription.ActionBar) && ((C15423eHu.TaskDescription.ActionBar) next).gEmmrt()) {
                break;
            }
        }
        C15423eHu.TaskDescription.ActionBar actionBar = (C15423eHu.TaskDescription.ActionBar) next;
        if (actionBar == null) {
            return;
        }
        activityC15412eHj.setResult(-1);
        C15423eHu c15423eHuEZpvd = activityC15412eHj.EZpvd();
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC15412eHj.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c15423eHuEZpvd.copydefault(supportFragmentManager, activityC15412eHj.AhwBna(), activityC15412eHj, actionBar, new Function1() { // from class: o.eHn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ActivityC15412eHj.copydefault((AbstractC12782ctV) obj2);
            }
        });
    }

    public static final Unit copydefault(AbstractC12782ctV abstractC12782ctV) {
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        if (this.copydefault != null) {
            return;
        }
        eGW egwCopydefault = eGW.Companion.copydefault(HardwareWalletOneKeyPairingType.OneKeyUnlocking);
        this.copydefault = egwCopydefault;
        if (egwCopydefault != null) {
            egwCopydefault.show(getSupportFragmentManager(), "PairingDialog");
        }
    }

    public final void OLrzqt() {
        eGW egw = this.copydefault;
        if (egw != null) {
            egw.dismissAllowingStateLoss();
        }
        this.copydefault = null;
    }

    @Override // o.InterfaceC57039yar.ActionBar
    public void EZpvd(@NotNull OneKeyAuthStage oneKeyAuthStage) {
        Intrinsics.checkNotNullParameter(oneKeyAuthStage, "");
        int i = Activity.EZpvd[oneKeyAuthStage.ordinal()];
        if (i == 1) {
            KWHzl();
        } else {
            if (i != 2) {
                return;
            }
            OLrzqt();
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
    public void onStart() {
        super.onStart();
    }
}

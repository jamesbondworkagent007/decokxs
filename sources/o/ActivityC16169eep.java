package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC16104edd;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityC16169eep extends AbstractActivityC33013moT {
    public final InterfaceC56387yDm OLrzqt;
    public AbstractC16256egW copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public final Application djBIcL = new Application();
    public final TaskDescription AhwBna = new TaskDescription();
    public final java.util.List<CustomChainMeta> KWHzl = new java.util.ArrayList();
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.eeq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC16169eep.AYXKKw(this.OLrzqt);
        }
    });
    public boolean AYXKKw = true;

    /* JADX INFO: renamed from: o.eep$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    public ActivityC16169eep() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(C16162eei.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.custom.CustomSelectNetworkActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.ees
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC16169eep.valueOf(this.OLrzqt);
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.custom.CustomSelectNetworkActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final C16162eei EZpvd() {
        return (C16162eei) this.OLrzqt.getValue();
    }

    public static final C16162eei KWHzl(ActivityC16169eep activityC16169eep, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        android.content.Context applicationContext = activityC16169eep.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return new C16162eei(C13458dMb.EZpvd(applicationContext).DTwDnp(), null, 2, null);
    }

    /* JADX INFO: renamed from: o.eep$Application */
    public static final class Application extends android.os.Handler {
        public Application() {
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            java.lang.String string;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(message, "");
            if (message.what == 1) {
                C16162eei c16162eeiEZpvd = ActivityC16169eep.this.EZpvd();
                AbstractC16256egW abstractC16256egW = ActivityC16169eep.this.copydefault;
                if (abstractC16256egW == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16256egW = null;
                }
                java.lang.CharSequence charSequenceAhwBna = abstractC16256egW.AYXKKw.AhwBna();
                if (charSequenceAhwBna != null && (string = charSequenceAhwBna.toString()) != null) {
                    str = string;
                }
                c16162eeiEZpvd.OLrzqt(str, 0);
            }
        }
    }

    /* JADX INFO: renamed from: o.eep$TaskDescription */
    public static final class TaskDescription implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (ActivityC16169eep.this.djBIcL.hasMessages(1)) {
                ActivityC16169eep.this.djBIcL.removeMessages(1);
            }
            ActivityC16169eep.this.djBIcL.sendEmptyMessageDelayed(1, 500L);
        }
    }

    public final C16097edW KWHzl() {
        return (C16097edW) this.EZpvd.getValue();
    }

    public static final C16097edW AYXKKw(ActivityC16169eep activityC16169eep) {
        return new C16097edW(activityC16169eep.KWHzl);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.copydefault = (AbstractC16256egW) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.fARcdN);
        C32866mlf.onEvent$default("Web3WalletSetting_Top_CustomNetwork_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        copydefault();
        AEQbTJ();
        OLrzqt();
    }

    private final void copydefault() {
        AbstractC16256egW abstractC16256egW = this.copydefault;
        AbstractC16256egW abstractC16256egW2 = null;
        if (abstractC16256egW == null) {
            Intrinsics.gEmmrt("");
            abstractC16256egW = null;
        }
        abstractC16256egW.AYXKKw.EZpvd().addTextChangedListener(this.AhwBna);
        AbstractC16256egW abstractC16256egW3 = this.copydefault;
        if (abstractC16256egW3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16256egW3 = null;
        }
        abstractC16256egW3.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.eez
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC16169eep.EZpvd(this.EZpvd, view);
            }
        });
        AbstractC16256egW abstractC16256egW4 = this.copydefault;
        if (abstractC16256egW4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16256egW4 = null;
        }
        RecyclerView recyclerView = abstractC16256egW4.EZpvd;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(KWHzl());
        AbstractC16256egW abstractC16256egW5 = this.copydefault;
        if (abstractC16256egW5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16256egW2 = abstractC16256egW5;
        }
        C8003auW.copydefault(abstractC16256egW2.OLrzqt).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.eew
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC16169eep.AEQbTJ(this.AEQbTJ, obj);
            }
        });
    }

    public static final void EZpvd(ActivityC16169eep activityC16169eep, android.view.View view) {
        activityC16169eep.onBackPressed();
    }

    public static final void AEQbTJ(ActivityC16169eep activityC16169eep, java.lang.Object obj) {
        C16158eee.showCommonDialog$default(C16158eee.KWHzl, activityC16169eep, C33070mpX.AYXKKw(C13754dXa.FragmentManager.createIntent), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DfrfUJ), false, false, null, 56, null);
    }

    private final void AEQbTJ() {
        EZpvd().OLrzqt().observe(this, new ActionBar(new Function1() { // from class: o.eer
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC16169eep.OLrzqt(this.KWHzl, (java.util.List) obj);
            }
        }));
        EZpvd().EZpvd().observe(this, new ActionBar(new Function1() { // from class: o.eeu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC16169eep.EZpvd(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        EZpvd().AEQbTJ().observe(this, new ActionBar(new Function1() { // from class: o.eet
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC16169eep.AEQbTJ(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        showLoadingAtOnceCannotCancel();
        EZpvd().copydefault(0);
    }

    public static final Unit OLrzqt(ActivityC16169eep activityC16169eep, java.util.List list) {
        activityC16169eep.dismissLoading();
        activityC16169eep.KWHzl.clear();
        activityC16169eep.KWHzl().notifyDataSetChanged();
        java.util.List<CustomChainMeta> list2 = activityC16169eep.KWHzl;
        Intrinsics.copydefault(list);
        list2.addAll(list);
        activityC16169eep.KWHzl().notifyDataSetChanged();
        rVN.reportFullyDrawn$default((android.app.Activity) activityC16169eep, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC16169eep activityC16169eep, java.lang.Boolean bool) {
        AbstractC16256egW abstractC16256egW = activityC16169eep.copydefault;
        if (abstractC16256egW == null) {
            Intrinsics.gEmmrt("");
            abstractC16256egW = null;
        }
        C55230xfy c55230xfy = abstractC16256egW.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55230xfy, "");
        c55230xfy.setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC16169eep activityC16169eep, java.lang.Boolean bool) {
        AbstractC16256egW abstractC16256egW = null;
        if (bool.booleanValue()) {
            AbstractC16256egW abstractC16256egW2 = activityC16169eep.copydefault;
            if (abstractC16256egW2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16256egW2 = null;
            }
            abstractC16256egW2.copydefault.getRoot().setVisibility(0);
            AbstractC16256egW abstractC16256egW3 = activityC16169eep.copydefault;
            if (abstractC16256egW3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16256egW = abstractC16256egW3;
            }
            abstractC16256egW.EZpvd.setVisibility(4);
        } else {
            AbstractC16256egW abstractC16256egW4 = activityC16169eep.copydefault;
            if (abstractC16256egW4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16256egW4 = null;
            }
            abstractC16256egW4.copydefault.getRoot().setVisibility(4);
            AbstractC16256egW abstractC16256egW5 = activityC16169eep.copydefault;
            if (abstractC16256egW5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16256egW = abstractC16256egW5;
            }
            abstractC16256egW.EZpvd.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!this.AYXKKw) {
            EZpvd().copydefault(0);
        }
        this.AYXKKw = false;
    }

    private final void OLrzqt() {
        AbstractC16256egW abstractC16256egW = this.copydefault;
        if (abstractC16256egW == null) {
            Intrinsics.gEmmrt("");
            abstractC16256egW = null;
        }
        abstractC16256egW.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.eev
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC16169eep.copydefault(this.OLrzqt, view);
            }
        });
    }

    public static final void copydefault(ActivityC16169eep activityC16169eep, android.view.View view) {
        ActivityC16104edd.TaskDescription.start$default(ActivityC16104edd.Companion, activityC16169eep, null, null, 6, null);
    }

    /* JADX INFO: renamed from: o.eep$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eep.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC16169eep.class));
        }
    }

    public static final ViewModelProvider.Factory valueOf(final ActivityC16169eep activityC16169eep) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C16162eei.class), new Function1() { // from class: o.eex
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC16169eep.KWHzl(this.copydefault, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
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

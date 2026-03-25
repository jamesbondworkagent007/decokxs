package o;

import android.text.InputFilter;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradingbot.impl.order.strategy.dialog.BottomEditStrategyNameDialog$observeEvents$1;
import com.okinc.tradingbot.impl.order.strategy.dialog.EditStrategyNameViewModel;
import com.okinc.uilab.edit.OKEditText;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vNd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50404vNd extends AbstractC50424vNx {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public boolean AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> EZpvd;
    public uPH KWHzl;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function2<java.lang.String, java.lang.Boolean, kotlin.Unit> */
    public final Function2<java.lang.String, java.lang.Boolean, Unit> AEQbTJ() {
        return this.EZpvd;
    }

    public C50404vNd(Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2) {
        this.EZpvd = function2;
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.dialog.BottomEditStrategyNameDialog$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.dialog.BottomEditStrategyNameDialog$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(EditStrategyNameViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.dialog.BottomEditStrategyNameDialog$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.dialog.BottomEditStrategyNameDialog$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.dialog.BottomEditStrategyNameDialog$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vNh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C50404vNd.AYXKKw(this.OLrzqt));
            }
        });
    }

    /* JADX INFO: renamed from: o.vNd$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vNd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C50404vNd AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, boolean z, java.lang.String str3, java.lang.String str4, @NotNull Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function2, "");
            C50404vNd c50404vNd = new C50404vNd(function2);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("dialog_title_key", str);
            bundle.putString("strategy_name", str2);
            bundle.putBoolean("STYLE_KEY", z);
            bundle.putInt("max_length", i);
            if (str3 != null) {
                bundle.putString("reset_dialog_title_key", str3);
            }
            if (str4 != null) {
                bundle.putString("reset_dialog_message_key", str4);
            }
            c50404vNd.setArguments(bundle);
            return c50404vNd;
        }
    }

    /* JADX DEBUG: Possible override for method o.vNx.OLrzqt()V */
    public final EditStrategyNameViewModel OLrzqt() {
        return (EditStrategyNameViewModel) this.AhwBna.getValue();
    }

    private final int fetchVPNInfo() {
        return ((java.lang.Number) this.copydefault.getValue()).intValue();
    }

    public static final int AYXKKw(C50404vNd c50404vNd) {
        android.os.Bundle arguments = c50404vNd.getArguments();
        if (arguments != null) {
            return arguments.getInt("max_length");
        }
        return 40;
    }

    /* JADX INFO: renamed from: o.vNd$Activity */
    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ uPH copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(uPH uph, java.lang.String str) {
            this.copydefault = uph;
            this.EZpvd = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C50404vNd.this.KWHzl();
            C50404vNd.this.AkhnZx();
            if (!Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(this.copydefault.AEQbTJ.getText()), (java.lang.Object) this.EZpvd)) {
                C50404vNd.this.AEQbTJ = true;
            }
            C52794wYp c52794wYpCopydefault = this.copydefault.EZpvd.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setEnabled(java.lang.String.valueOf(this.copydefault.AEQbTJ.getText()).length() > 0);
            }
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.KWHzl = uPH.KWHzl(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, true);
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("strategy_name", "") : null;
        android.os.Bundle arguments2 = getArguments();
        boolean z = arguments2 != null ? arguments2.getBoolean("STYLE_KEY", false) : false;
        uPH uph = this.KWHzl;
        if (uph != null) {
            uph.AEQbTJ.setText(string);
            AkhnZx();
            if (z) {
                C52794wYp c52794wYpAEQbTJ = uph.EZpvd.AEQbTJ();
                if (c52794wYpAEQbTJ != null) {
                    c52794wYpAEQbTJ.setText(C55688xof.Application.OUcgGI);
                }
                C52794wYp c52794wYpAEQbTJ2 = uph.EZpvd.AEQbTJ();
                if (c52794wYpAEQbTJ2 != null) {
                    c52794wYpAEQbTJ2.setOKDSType(260);
                }
                C52794wYp c52794wYpAEQbTJ3 = uph.EZpvd.AEQbTJ();
                if (c52794wYpAEQbTJ3 != null) {
                    c52794wYpAEQbTJ3.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ3, 1000L, this));
                }
            } else {
                C52794wYp c52794wYpAEQbTJ4 = uph.EZpvd.AEQbTJ();
                if (c52794wYpAEQbTJ4 != null) {
                    c52794wYpAEQbTJ4.setText(C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcherKt));
                }
                C52794wYp c52794wYpAEQbTJ5 = uph.EZpvd.AEQbTJ();
                if (c52794wYpAEQbTJ5 != null) {
                    c52794wYpAEQbTJ5.setOKDSType(260);
                }
                C52794wYp c52794wYpAEQbTJ6 = uph.EZpvd.AEQbTJ();
                if (c52794wYpAEQbTJ6 != null) {
                    c52794wYpAEQbTJ6.setOnClickListener(new FragmentManager(c52794wYpAEQbTJ6, 1000L, this));
                }
            }
            C52794wYp c52794wYpCopydefault = uph.EZpvd.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOnClickListener(new Fragment(c52794wYpCopydefault, 1000L, uph, this));
            }
            fIwbmz();
            OKEditText oKEditText = uph.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(oKEditText, "");
            oKEditText.addTextChangedListener(new Activity(uph, string));
            EZpvd();
            KWHzl();
        }
    }

    /* JADX INFO: renamed from: o.vNd$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function2<java.lang.String, java.lang.Boolean, Unit> function2AEQbTJ = C50404vNd.this.AEQbTJ();
            if (function2AEQbTJ != null) {
                function2AEQbTJ.invoke("", java.lang.Boolean.TRUE);
            }
            this.EZpvd.dismiss();
            C50404vNd.this.DbNXlk();
        }
    }

    /* JADX INFO: renamed from: o.vNd$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("dialog_title_key", "") : null;
        java.lang.String str = string != null ? string : "";
        wxq.setStyle(1);
        wxq.setTitle(str);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(false);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new PendingIntent(imageViewKWHzl, 1000L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DbNXlk() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    public final void KWHzl() {
        android.widget.TextView textView;
        OKEditText oKEditText;
        uPH uph = this.KWHzl;
        if (uph == null || (textView = uph.copydefault) == null) {
            return;
        }
        textView.setText(java.lang.String.valueOf((uph == null || (oKEditText = uph.AEQbTJ) == null) ? null : oKEditText.getText()).length() + "/" + fetchVPNInfo());
    }

    /* JADX INFO: renamed from: o.vNd$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ C50404vNd AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ uPH copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, uPH uph, C50404vNd c50404vNd) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = uph;
            this.AEQbTJ = c50404vNd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.OLrzqt().EZpvd(java.lang.String.valueOf(this.copydefault.AEQbTJ.getText()), this.AEQbTJ.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.vNd$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C50404vNd OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C50404vNd c50404vNd) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = c50404vNd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.DbNXlk();
            }
        }
    }

    /* JADX INFO: renamed from: o.vNd$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C50404vNd KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C50404vNd c50404vNd) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c50404vNd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.DbNXlk();
            }
        }
    }

    /* JADX INFO: renamed from: o.vNd$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C50404vNd KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50404vNd c50404vNd) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c50404vNd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String strAYXKKw;
            java.lang.String strAYXKKw2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.os.Bundle arguments = this.KWHzl.getArguments();
                if (arguments == null || (strAYXKKw = arguments.getString("reset_dialog_title_key")) == null) {
                    strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ResultReceiverMyRunnable);
                }
                android.os.Bundle arguments2 = this.KWHzl.getArguments();
                if (arguments2 == null || (strAYXKKw2 = arguments2.getString("reset_dialog_message_key")) == null) {
                    strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.viewModelsdefault);
                }
                android.content.Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(strAYXKKw);
                viewOnClickListenerC54939xaY.EZpvd(strAYXKKw2);
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI), (View.OnClickListener) this.KWHzl.new ActionBar(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcherKt), (View.OnClickListener) new StateListAnimator(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public final void EZpvd() {
        OKEditText oKEditText;
        uPH uph = this.KWHzl;
        if (uph == null || (oKEditText = uph.AEQbTJ) == null) {
            return;
        }
        oKEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(fetchVPNInfo())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.lang.String str) {
        uPH uph = this.KWHzl;
        if (uph != null) {
            uph.OLrzqt.setText(str);
            android.widget.TextView textView = uph.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            uph.AEQbTJ.setActivated(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AkhnZx() {
        uPH uph = this.KWHzl;
        if (uph != null) {
            uph.OLrzqt.setText("");
            android.widget.TextView textView = uph.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            uph.AEQbTJ.setActivated(true);
        }
    }

    private final void fIwbmz() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new BottomEditStrategyNameDialog$observeEvents$1(this, null), 3, null);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        uPH uph = this.KWHzl;
        if (uph != null && C33565myp.EZpvd().KWHzl(activity)) {
            java.lang.Object systemService = activity.getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.toggleSoftInputFromWindow(uph.AEQbTJ.getWindowToken(), 0, 1);
            }
        }
        this.EZpvd = null;
        this.KWHzl = null;
        super.onDismiss(dialogInterface);
    }
}

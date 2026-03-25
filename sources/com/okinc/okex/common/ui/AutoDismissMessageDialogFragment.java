package com.okinc.okex.common.ui;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okex.common.ui.AutoDismissMessageDialogFragment;
import java.io.Serializable;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC47363tod;
import o.C32991mny;
import o.C32995moB;
import o.C33566myq;
import o.C45318snY;
import o.C47315tni;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.rVN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class AutoDismissMessageDialogFragment extends C32995moB {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm EZpvd;
    public AbstractC47363tod KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    public AutoDismissMessageDialogFragment() {
        Function0 function0 = new Function0() { // from class: o.snX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AutoDismissMessageDialogFragment.djBIcL(this.EZpvd);
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.okinc.okex.common.ui.AutoDismissMessageDialogFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okex.common.ui.AutoDismissMessageDialogFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C45318snY.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.common.ui.AutoDismissMessageDialogFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.common.ui.AutoDismissMessageDialogFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.snT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AutoDismissMessageDialogFragment.AhwBna(this.OLrzqt);
            }
        });
    }

    public interface Response {

        public static final class Dismiss implements Response, Serializable {
            public static final int $stable = 0;
            public static final Dismiss INSTANCE = new Dismiss();

            private Dismiss() {
            }
        }

        public static final class Close implements Response, Serializable {
            public static final int $stable = 0;
            public static final Close INSTANCE = new Close();

            private Close() {
            }
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.ui.AutoDismissMessageDialogFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final C45318snY copydefault() {
        return (C45318snY) this.OLrzqt.getValue();
    }

    public static final class StateListAnimator implements ViewModelProvider.Factory {
        public StateListAnimator() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            Bundle arguments = AutoDismissMessageDialogFragment.this.getArguments();
            Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("KEY_TOTAL_OF_SECOND")) : null;
            Bundle arguments2 = AutoDismissMessageDialogFragment.this.getArguments();
            Integer numValueOf2 = arguments2 != null ? Integer.valueOf(arguments2.getInt("KEY_TEXT_KEY_POSITIVE_BUTTON")) : null;
            Bundle arguments3 = AutoDismissMessageDialogFragment.this.getArguments();
            return new C45318snY(numValueOf, numValueOf2, arguments3 != null ? arguments3.getString("KEY_REPLACING_KEY_POSITIVE_BUTTON") : null);
        }
    }

    public static final ViewModelProvider.Factory djBIcL(AutoDismissMessageDialogFragment autoDismissMessageDialogFragment) {
        return autoDismissMessageDialogFragment.new StateListAnimator();
    }

    public final String EZpvd() {
        return (String) this.EZpvd.getValue();
    }

    public static final String AhwBna(AutoDismissMessageDialogFragment autoDismissMessageDialogFragment) {
        String string;
        Bundle arguments = autoDismissMessageDialogFragment.getArguments();
        return (arguments == null || (string = arguments.getString("KEY_REQUEST_ID")) == null) ? "" : string;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC47363tod abstractC47363tod = (AbstractC47363tod) DataBindingUtil.bind(layoutInflater.inflate(C47315tni.ActionBar.getNewProxyInstance, viewGroup, false));
        if (abstractC47363tod == null) {
            return null;
        }
        this.KWHzl = abstractC47363tod;
        return abstractC47363tod.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Window window;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            C33566myq c33566myq = C33566myq.EZpvd;
            Context context = window.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iEZpvd = c33566myq.EZpvd(context);
            Context context2 = window.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            attributes.width = iEZpvd - (C55298xhM.copydefault(48.0f, context2) * 2);
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        copydefault().OLrzqt().observe(this, new C32991mny(new Function1() { // from class: o.snW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AutoDismissMessageDialogFragment.KWHzl(this.EZpvd, (Unit) obj);
            }
        }));
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("KEY_TITLE") : null;
        AbstractC47363tod abstractC47363tod = this.KWHzl;
        if (abstractC47363tod != null && (textView3 = abstractC47363tod.copydefault) != null) {
            textView3.setText(string);
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("KEY_DESCRIPTION") : null;
        AbstractC47363tod abstractC47363tod2 = this.KWHzl;
        if (abstractC47363tod2 != null && (textView2 = abstractC47363tod2.AEQbTJ) != null) {
            textView2.setText(string2);
        }
        copydefault().copydefault().observe(this, new ActionBar(new Function1() { // from class: o.snV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AutoDismissMessageDialogFragment.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        }));
        AbstractC47363tod abstractC47363tod3 = this.KWHzl;
        if (abstractC47363tod3 != null && (textView = abstractC47363tod3.OLrzqt) != null) {
            textView.setOnClickListener(new Activity(textView, 1000L, this));
        }
        view.post(new Runnable() { // from class: o.snU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AutoDismissMessageDialogFragment.KWHzl(this.copydefault);
            }
        });
    }

    public static final Unit KWHzl(AutoDismissMessageDialogFragment autoDismissMessageDialogFragment, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        autoDismissMessageDialogFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AutoDismissMessageDialogFragment autoDismissMessageDialogFragment, String str) {
        TextView textView;
        AbstractC47363tod abstractC47363tod = autoDismissMessageDialogFragment.KWHzl;
        if (abstractC47363tod != null && (textView = abstractC47363tod.OLrzqt) != null) {
            textView.setText(str);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(AutoDismissMessageDialogFragment autoDismissMessageDialogFragment) {
        rVN.reportFullyDrawn$default((Fragment) autoDismissMessageDialogFragment, true, (String) null, 2, (Object) null);
    }

    @Override // o.C32995moB, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        Object obj;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        if (Intrinsics.EZpvd(copydefault().AEQbTJ().getValue(), Boolean.TRUE)) {
            obj = Response.Close.INSTANCE;
        } else {
            obj = Response.Dismiss.INSTANCE;
        }
        getParentFragmentManager().setFragmentResult(EZpvd(), BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_RESPONSE", obj)));
        super.onDismiss(dialogInterface);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ AutoDismissMessageDialogFragment KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, AutoDismissMessageDialogFragment autoDismissMessageDialogFragment) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = autoDismissMessageDialogFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.copydefault().EZpvd();
            }
        }
    }
}

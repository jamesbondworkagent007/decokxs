package com.okinc.auth.impl.twofactorauth.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewGroupKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.account.api.model.security.otp.OtpAction;
import com.okinc.account.api.model.security.otp.OtpState;
import com.okinc.auth.impl.twofactorauth.ui.OtpInputFragment;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC6659aTX;
import o.AbstractC6715aUb;
import o.AbstractC6733aUt;
import o.AbstractC8275azf;
import o.AbstractC8293azx;
import o.C33070mpX;
import o.C33129mqd;
import o.C33548myY;
import o.C52761wXj;
import o.C55001xbh;
import o.C55008xbo;
import o.C55009xbp;
import o.C55296xhK;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.C59454zhO;
import o.C6690aUB;
import o.C6714aUa;
import o.C8206ayP;
import o.InterfaceC47278tmy;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class OtpInputFragment extends AbstractC6715aUb {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public AbstractC8293azx gEmmrt;

    @yCM
    public InterfaceC47278tmy userManager;

    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    public OtpInputFragment() {
        super(C8206ayP.Application.wlaJM);
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C6714aUa.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.twofactorauth.ui.OtpInputFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.twofactorauth.ui.OtpInputFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.twofactorauth.ui.OtpInputFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OtpViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.twofactorauth.ui.OtpInputFragment$special$$inlined$activityViewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.twofactorauth.ui.OtpInputFragment$special$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.twofactorauth.ui.OtpInputFragment$special$$inlined$activityViewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C6714aUa djBIcL() {
        return (C6714aUa) this.AhwBna.getValue();
    }

    public final OtpViewModel AYXKKw() {
        return (OtpViewModel) this.AYXKKw.getValue();
    }

    public final InterfaceC47278tmy AhwBna() {
        InterfaceC47278tmy interfaceC47278tmy = this.userManager;
        if (interfaceC47278tmy != null) {
            return interfaceC47278tmy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC8293azx abstractC8293azxOLrzqt = AbstractC8293azx.OLrzqt(view);
        this.gEmmrt = abstractC8293azxOLrzqt;
        if (abstractC8293azxOLrzqt == null) {
            Intrinsics.gEmmrt("");
            abstractC8293azxOLrzqt = null;
        }
        abstractC8293azxOLrzqt.setLifecycleOwner(getViewLifecycleOwner());
        AbstractC8293azx abstractC8293azx = this.gEmmrt;
        if (abstractC8293azx == null) {
            Intrinsics.gEmmrt("");
            abstractC8293azx = null;
        }
        abstractC8293azx.KWHzl(djBIcL());
        gEmmrt();
        valueOf();
        djBIcL().AEQbTJ().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aUc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OtpInputFragment.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        }));
        getParentFragmentManager().setFragmentResultListener("requestKeyShowSwitchMethod", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.aUd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                OtpInputFragment.AEQbTJ(this.copydefault, str, bundle2);
            }
        });
        C6690aUB.KWHzl(AYXKKw().EZpvd(), this, new AnonymousClass3(null));
    }

    public static final Unit copydefault(OtpInputFragment otpInputFragment, List list) {
        Intrinsics.copydefault(list);
        otpInputFragment.AEQbTJ((List<? extends AbstractC6659aTX>) list);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(OtpInputFragment otpInputFragment, String str, Bundle bundle) {
        View next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        AbstractC8293azx abstractC8293azx = otpInputFragment.gEmmrt;
        if (abstractC8293azx == null) {
            Intrinsics.gEmmrt("");
            abstractC8293azx = null;
        }
        LinearLayout linearLayout = abstractC8293azx.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        Iterator<View> it = ViewGroupKt.getChildren(linearLayout).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd(next.getTag(), (Object) bundle.getString("bundleKeyOtpInputType"))) {
                    break;
                }
            }
        }
        View view = next;
        LinearLayout linearLayout2 = view != null ? (LinearLayout) view.findViewById(C8206ayP.StateListAnimator.fkESqH) : null;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.okinc.auth.impl.twofactorauth.ui.OtpInputFragment$onViewCreated$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                String str = (String) this.L$0;
                if (str != null) {
                    C55326xho.toastWithFailedIcon$default(str, 0, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final class ActionBar implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            OtpInputFragment.this.KWHzl();
        }
    }

    public static final class Activity implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            OtpInputFragment.this.djBIcL().OLrzqt(String.valueOf(editable));
        }
    }

    public static final class Application implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            OtpInputFragment.this.djBIcL().EZpvd(String.valueOf(editable));
        }
    }

    public static final class StateListAnimator implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            OtpInputFragment.this.djBIcL().KWHzl(String.valueOf(editable));
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:89:0x0251 */
    /* JADX DEBUG: Type inference failed for r12v0. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View, o.xbh] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, o.xbo] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, o.myY] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void AEQbTJ(List<? extends AbstractC6659aTX> list) {
        ?? r0;
        AbstractC8293azx abstractC8293azx = this.gEmmrt;
        if (abstractC8293azx == null) {
            Intrinsics.gEmmrt("");
            abstractC8293azx = null;
        }
        LinearLayout linearLayout = abstractC8293azx.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.removeAllViews();
        ?? r02 = 1;
        ?? r13 = 0;
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            AbstractC6659aTX abstractC6659aTX = (AbstractC6659aTX) obj;
            ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(getContext()), C8206ayP.Application.fetchVPNInfo, linearLayout, r13);
            Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
            AbstractC8275azf abstractC8275azf = (AbstractC8275azf) viewDataBindingInflate;
            if (r02 == 0) {
                int iOLrzqt = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.OcIXYQ);
                ViewGroup.LayoutParams layoutParams = abstractC8275azf.getRoot().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = iOLrzqt;
                }
                abstractC8275azf.getRoot().setLayoutParams(marginLayoutParams);
            }
            abstractC8275azf.getRoot().setTag(abstractC6659aTX.copydefault());
            String strAYXKKw = C33070mpX.AYXKKw(abstractC6659aTX.AEQbTJ());
            String strAYXKKw2 = C33070mpX.AYXKKw(abstractC6659aTX.OLrzqt());
            ?? r3 = abstractC8275azf.AEQbTJ;
            r3.setLabelText(strAYXKKw);
            r3.setHintText(strAYXKKw2);
            r3.setLayoutDirection(r13);
            r3.uzCIH().setLayoutDirection(3);
            ?? AkhnZx = r3.AkhnZx();
            if (AkhnZx != 0) {
                AkhnZx.setLayoutDirection(r13);
            }
            C55001xbh c55001xbhAkhnZx = r3.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setTextDirection(3);
            }
            C55001xbh c55001xbhAkhnZx2 = abstractC8275azf.AEQbTJ.AkhnZx();
            if (c55001xbhAkhnZx2 != null) {
                c55001xbhAkhnZx2.addTextChangedListener(new ActionBar());
            }
            C55001xbh c55001xbhAkhnZx3 = abstractC8275azf.AEQbTJ.AkhnZx();
            if (c55001xbhAkhnZx3 != null) {
                c55001xbhAkhnZx3.setInputType(2);
            }
            C55001xbh c55001xbhAkhnZx4 = abstractC8275azf.AEQbTJ.AkhnZx();
            if (c55001xbhAkhnZx4 != null) {
                c55001xbhAkhnZx4.setContentDescription(Web3SecurityTrackEvent.VALUE_INPUT);
            }
            if (abstractC6659aTX instanceof AbstractC6659aTX.TaskDescription) {
                abstractC8275azf.getRoot().setContentDescription("newMobileOtp");
                Boolean value = djBIcL().copydefault().getValue();
                if (value == null) {
                    value = Boolean.FALSE;
                }
                abstractC8275azf.AEQbTJ(value);
                ?? r16 = Intrinsics.EZpvd(djBIcL().copydefault().getValue(), Boolean.TRUE) ? r13 : r02 == true ? 1 : 0;
                C55001xbh c55001xbhAkhnZx5 = abstractC8275azf.AEQbTJ.AkhnZx();
                if (c55001xbhAkhnZx5 != null) {
                    c55001xbhAkhnZx5.addTextChangedListener(new Application());
                }
                View viewCopydefault = copydefault(abstractC8275azf.AEQbTJ.fIwbmz());
                C55009xbp c55009xbpFIwbmz = abstractC8275azf.AEQbTJ.fIwbmz();
                if (c55009xbpFIwbmz != null) {
                    c55009xbpFIwbmz.EZpvd(viewCopydefault);
                }
                final ?? r7 = (C33548myY) viewCopydefault.findViewById(C8206ayP.StateListAnimator.gtCCJH);
                if (((AbstractC6659aTX.TaskDescription) abstractC6659aTX).values()) {
                    r7.setEnabled(r13);
                }
                djBIcL().iwGUEr().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aUg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return OtpInputFragment.OLrzqt(r7, (java.lang.Boolean) obj2);
                    }
                }));
                r7.setOnClickListener(new Dialog(r7, 1000L, this, abstractC6659aTX));
                TextView textView = abstractC8275azf.EZpvd;
                textView.setOnClickListener(new Fragment(textView, 1000L, r7, abstractC6659aTX, this, abstractC8275azf));
                r0 = r16;
            } else if (abstractC6659aTX instanceof AbstractC6659aTX.Activity) {
                abstractC8275azf.getRoot().setContentDescription("newEmailOtp");
                Boolean value2 = djBIcL().EZpvd().getValue();
                if (value2 == null) {
                    value2 = Boolean.FALSE;
                }
                abstractC8275azf.AEQbTJ(value2);
                r0 = r02;
                if (Intrinsics.EZpvd(djBIcL().EZpvd().getValue(), Boolean.TRUE)) {
                    r0 = 0;
                }
                C55001xbh c55001xbhAkhnZx6 = abstractC8275azf.AEQbTJ.AkhnZx();
                if (c55001xbhAkhnZx6 != null) {
                    c55001xbhAkhnZx6.addTextChangedListener(new Activity());
                }
                View viewCopydefault2 = copydefault(abstractC8275azf.AEQbTJ.fIwbmz());
                C55009xbp c55009xbpFIwbmz2 = abstractC8275azf.AEQbTJ.fIwbmz();
                if (c55009xbpFIwbmz2 != null) {
                    c55009xbpFIwbmz2.EZpvd(viewCopydefault2);
                }
                final C33548myY c33548myY = (C33548myY) viewCopydefault2.findViewById(C8206ayP.StateListAnimator.gtCCJH);
                djBIcL().uzCIH().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aUf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return OtpInputFragment.EZpvd(c33548myY, (java.lang.Boolean) obj2);
                    }
                }));
                c33548myY.setOnClickListener(new PendingIntent(c33548myY, 1000L, this));
            } else {
                if (!(abstractC6659aTX instanceof AbstractC6659aTX.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC8275azf.getRoot().setContentDescription("newGoogleOtp");
                Boolean value3 = djBIcL().KWHzl().getValue();
                if (value3 == null) {
                    value3 = Boolean.FALSE;
                }
                abstractC8275azf.AEQbTJ(value3);
                r0 = r02;
                if (Intrinsics.EZpvd(djBIcL().KWHzl().getValue(), Boolean.TRUE)) {
                    r0 = 0;
                }
                C55001xbh c55001xbhAkhnZx7 = abstractC8275azf.AEQbTJ.AkhnZx();
                if (c55001xbhAkhnZx7 != null) {
                    c55001xbhAkhnZx7.addTextChangedListener(new StateListAnimator());
                }
            }
            linearLayout.addView(abstractC8275azf.getRoot());
            i++;
            r13 = 0;
            r02 = r0;
        }
    }

    public static final Unit OLrzqt(C33548myY c33548myY, Boolean bool) {
        c33548myY.setEnabled(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ OtpInputFragment AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ AbstractC6659aTX OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(View view, long j, OtpInputFragment otpInputFragment, AbstractC6659aTX abstractC6659aTX) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = otpInputFragment;
            this.OLrzqt = abstractC6659aTX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                String strIsConnected = this.AEQbTJ.djBIcL().isConnected();
                String value = this.AEQbTJ.djBIcL().fJNWhG().getValue();
                if (value == null) {
                    value = "";
                }
                String str = value;
                if (strIsConnected.length() <= 0 || str.length() <= 0 || this.AEQbTJ.getActivity() == null) {
                    return;
                }
                this.AEQbTJ.getParentFragmentManager().setFragmentResult("requestKeyNewPhoneSendClick", BundleKt.bundleOf());
                AbstractC6733aUt abstractC6733aUtAuCTel = this.AEQbTJ.djBIcL().AuCTel();
                if (abstractC6733aUtAuCTel instanceof AbstractC6733aUt.PendingIntent) {
                    AbstractC6733aUt.PendingIntent pendingIntent = (AbstractC6733aUt.PendingIntent) abstractC6733aUtAuCTel;
                    this.AEQbTJ.AYXKKw().KWHzl(this.AEQbTJ.djBIcL().DbNXlk(), strIsConnected, str, pendingIntent.copydefault(), ((AbstractC6659aTX.TaskDescription) this.OLrzqt).gEmmrt(), OtpAction.NEW, pendingIntent.EZpvd());
                    this.AEQbTJ.EZpvd((AbstractC6659aTX.TaskDescription) this.OLrzqt);
                } else if (abstractC6733aUtAuCTel instanceof AbstractC6733aUt.Application) {
                    AbstractC6733aUt.Application application = (AbstractC6733aUt.Application) abstractC6733aUtAuCTel;
                    this.AEQbTJ.AYXKKw().copydefault(this.AEQbTJ.djBIcL().DbNXlk(), strIsConnected, str, application.KWHzl(), ((AbstractC6659aTX.TaskDescription) this.OLrzqt).gEmmrt(), OtpAction.NEW, application.EZpvd());
                    this.AEQbTJ.EZpvd((AbstractC6659aTX.TaskDescription) this.OLrzqt);
                }
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ C33548myY EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ AbstractC8275azf OLrzqt;
        public final /* synthetic */ AbstractC6659aTX copydefault;
        public final /* synthetic */ OtpInputFragment djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(View view, long j, C33548myY c33548myY, AbstractC6659aTX abstractC6659aTX, OtpInputFragment otpInputFragment, AbstractC8275azf abstractC8275azf) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c33548myY;
            this.copydefault = abstractC6659aTX;
            this.djBIcL = otpInputFragment;
            this.OLrzqt = abstractC8275azf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int iAhwBna;
            int iKWHzl;
            String string;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.EZpvd.KWHzl()) {
                    if (((AbstractC6659aTX.TaskDescription) this.copydefault).gEmmrt() == 1) {
                        string = this.djBIcL.getString(C8206ayP.Dialog.DWgRXt);
                    } else {
                        string = this.djBIcL.getString(C8206ayP.Dialog.DcqEDu);
                    }
                    C55326xho.toast$default(string, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    return;
                }
                this.djBIcL.getParentFragmentManager().setFragmentResult("requestKeyNewPhoneTryOtherWayClick", BundleKt.bundleOf());
                if (this.djBIcL.djBIcL().AuCTel() instanceof AbstractC6733aUt.TaskDescription) {
                    return;
                }
                AbstractC6659aTX.TaskDescription taskDescription = (AbstractC6659aTX.TaskDescription) this.copydefault;
                taskDescription.OLrzqt(taskDescription.gEmmrt() == 1 ? 0 : 1);
                if (((AbstractC6659aTX.TaskDescription) this.copydefault).gEmmrt() == 1) {
                    this.OLrzqt.EZpvd.setText(this.djBIcL.getString(((AbstractC6659aTX.TaskDescription) this.copydefault).djBIcL()));
                    C55008xbo c55008xbo = this.OLrzqt.AEQbTJ;
                    String string2 = this.djBIcL.getString(((AbstractC6659aTX.TaskDescription) this.copydefault).DbNXlk());
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    c55008xbo.setLabelText(string2);
                    this.EZpvd.setSendStr(this.djBIcL.getString(((AbstractC6659aTX.TaskDescription) this.copydefault).KWHzl()));
                    this.EZpvd.setResendStr(this.djBIcL.getString(((AbstractC6659aTX.TaskDescription) this.copydefault).EZpvd()));
                    C33548myY c33548myY = this.EZpvd;
                    OtpInputFragment otpInputFragment = this.djBIcL;
                    if (((AbstractC6659aTX.TaskDescription) this.copydefault).isConnected()) {
                        iKWHzl = ((AbstractC6659aTX.TaskDescription) this.copydefault).EZpvd();
                    } else {
                        iKWHzl = ((AbstractC6659aTX.TaskDescription) this.copydefault).KWHzl();
                    }
                    c33548myY.setText(otpInputFragment.getString(iKWHzl));
                    return;
                }
                this.OLrzqt.EZpvd.setText(this.djBIcL.getString(((AbstractC6659aTX.TaskDescription) this.copydefault).AkhnZx()));
                C55008xbo c55008xbo2 = this.OLrzqt.AEQbTJ;
                String string3 = this.djBIcL.getString(((AbstractC6659aTX.TaskDescription) this.copydefault).fetchVPNInfo());
                Intrinsics.checkNotNullExpressionValue(string3, "");
                c55008xbo2.setLabelText(string3);
                this.EZpvd.setSendStr(this.djBIcL.getString(((AbstractC6659aTX.TaskDescription) this.copydefault).AhwBna()));
                this.EZpvd.setResendStr(this.djBIcL.getString(((AbstractC6659aTX.TaskDescription) this.copydefault).AYXKKw()));
                C33548myY c33548myY2 = this.EZpvd;
                OtpInputFragment otpInputFragment2 = this.djBIcL;
                if (((AbstractC6659aTX.TaskDescription) this.copydefault).AuCTel()) {
                    iAhwBna = ((AbstractC6659aTX.TaskDescription) this.copydefault).AYXKKw();
                } else {
                    iAhwBna = ((AbstractC6659aTX.TaskDescription) this.copydefault).AhwBna();
                }
                c33548myY2.setText(otpInputFragment2.getString(iAhwBna));
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ OtpInputFragment AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(View view, long j, OtpInputFragment otpInputFragment) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = otpInputFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.getParentFragmentManager().setFragmentResult("requestKeyNewEmailSendClick", BundleKt.bundleOf());
                AbstractC6733aUt abstractC6733aUtAuCTel = this.AEQbTJ.djBIcL().AuCTel();
                if (abstractC6733aUtAuCTel instanceof AbstractC6733aUt.PendingIntent) {
                    OtpViewModel otpViewModelAYXKKw = this.AEQbTJ.AYXKKw();
                    int iDbNXlk = this.AEQbTJ.djBIcL().DbNXlk();
                    String value = this.AEQbTJ.djBIcL().values().getValue();
                    AbstractC6733aUt.PendingIntent pendingIntent = (AbstractC6733aUt.PendingIntent) abstractC6733aUtAuCTel;
                    otpViewModelAYXKKw.AEQbTJ(iDbNXlk, value == null ? "" : value, pendingIntent.copydefault(), OtpAction.NEW, pendingIntent.EZpvd());
                    return;
                }
                if (abstractC6733aUtAuCTel instanceof AbstractC6733aUt.Application) {
                    OtpViewModel otpViewModelAYXKKw2 = this.AEQbTJ.AYXKKw();
                    int iDbNXlk2 = this.AEQbTJ.djBIcL().DbNXlk();
                    String value2 = this.AEQbTJ.djBIcL().values().getValue();
                    AbstractC6733aUt.Application application = (AbstractC6733aUt.Application) abstractC6733aUtAuCTel;
                    otpViewModelAYXKKw2.EZpvd(iDbNXlk2, value2 == null ? "" : value2, application.KWHzl(), OtpAction.NEW, application.EZpvd());
                }
            }
        }
    }

    public static final Unit EZpvd(C33548myY c33548myY, Boolean bool) {
        if (!c33548myY.KWHzl()) {
            c33548myY.setEnabled(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        boolean z;
        C55001xbh c55001xbhAkhnZx;
        Editable text;
        AbstractC8293azx abstractC8293azx = this.gEmmrt;
        if (abstractC8293azx == null) {
            Intrinsics.gEmmrt("");
            abstractC8293azx = null;
        }
        LinearLayout linearLayout = abstractC8293azx.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        Iterator<View> it = ViewGroupKt.getChildren(linearLayout).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            View next = it.next();
            if (next.getVisibility() == 0 && (c55001xbhAkhnZx = ((C55008xbo) next.findViewById(C8206ayP.StateListAnimator.fdOvFl)).AkhnZx()) != null && (text = c55001xbhAkhnZx.getText()) != null && text.length() == 0) {
                z = false;
                break;
            }
        }
        djBIcL().OLrzqt(z);
    }

    public final void gEmmrt() {
        SharedFlow<OtpState> sharedFlowOLrzqt = AYXKKw().OLrzqt();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        Lifecycle.State state = Lifecycle.State.STARTED;
        Flow flowOnEach = FlowKt.onEach(FlowExtKt.flowWithLifecycle(sharedFlowOLrzqt, lifecycle, state), new OtpInputFragment$registerOtpStateFlowCollector$1(this, null));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        SharedFlow<OtpState> sharedFlowAEQbTJ = AYXKKw().AEQbTJ();
        Lifecycle lifecycle2 = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle2, "");
        Flow flowOnEach2 = FlowKt.onEach(FlowExtKt.flowWithLifecycle(sharedFlowAEQbTJ, lifecycle2, state), new OtpInputFragment$registerOtpStateFlowCollector$2(this, null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        FlowKt.launchIn(flowOnEach2, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2));
    }

    public final View copydefault(ViewGroup viewGroup) {
        View viewInflate = getLayoutInflater().inflate(C8206ayP.Application.DbNXlk, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return viewInflate;
    }

    public final String OLrzqt(String str) {
        List listAhwBna;
        try {
            String str2 = str.length() > 0 ? str : null;
            if (str2 == null) {
                return str;
            }
            String str3 = str2.charAt(0) + "***@";
            List<String> listSplit = new Regex("@").split(str2, 0);
            if (!listSplit.isEmpty()) {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable) listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listAhwBna = yDY.AhwBna();
            } else {
                listAhwBna = yDY.AhwBna();
            }
            String str4 = str3 + ((String[]) listAhwBna.toArray(new String[0]))[1];
            return str4 == null ? str : str4;
        } catch (Exception unused) {
            return str;
        }
    }

    public final String copydefault(String str) {
        try {
            return C59454zhO.isConnected(str, 4);
        } catch (Exception unused) {
            return str;
        }
    }

    public final void valueOf() {
        djBIcL().AYXKKw().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aUe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OtpInputFragment.djBIcL(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        djBIcL().fetchVPNInfo().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aUk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OtpInputFragment.gEmmrt(this.KWHzl, (java.lang.String) obj);
            }
        }));
        djBIcL().gEmmrt().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aUj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OtpInputFragment.DbNXlk(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        djBIcL().djBIcL().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aUh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OtpInputFragment.isConnected(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        djBIcL().valueOf().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aUl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OtpInputFragment.fetchVPNInfo(this.EZpvd, (java.lang.String) obj);
            }
        }));
        djBIcL().AkhnZx().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.aUi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OtpInputFragment.values(this.KWHzl, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit djBIcL(OtpInputFragment otpInputFragment, String str) {
        AbstractC8293azx abstractC8293azx = otpInputFragment.gEmmrt;
        View view = null;
        if (abstractC8293azx == null) {
            Intrinsics.gEmmrt("");
            abstractC8293azx = null;
        }
        LinearLayout linearLayout = abstractC8293azx.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        Iterator<View> it = ViewGroupKt.getChildren(linearLayout).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            if (Intrinsics.EZpvd(next.getTag(), (Object) "TAG_NEW_MOBILE")) {
                view = next;
                break;
            }
        }
        View view2 = view;
        if (view2 != null) {
            otpInputFragment.OLrzqt(view2, str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(OtpInputFragment otpInputFragment, String str) {
        AbstractC8293azx abstractC8293azx = otpInputFragment.gEmmrt;
        View view = null;
        if (abstractC8293azx == null) {
            Intrinsics.gEmmrt("");
            abstractC8293azx = null;
        }
        LinearLayout linearLayout = abstractC8293azx.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        Iterator<View> it = ViewGroupKt.getChildren(linearLayout).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            if (Intrinsics.EZpvd(next.getTag(), (Object) "TAG_OLD_MOBILE")) {
                view = next;
                break;
            }
        }
        View view2 = view;
        if (view2 != null) {
            otpInputFragment.OLrzqt(view2, str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(OtpInputFragment otpInputFragment, String str) {
        AbstractC8293azx abstractC8293azx = otpInputFragment.gEmmrt;
        View view = null;
        if (abstractC8293azx == null) {
            Intrinsics.gEmmrt("");
            abstractC8293azx = null;
        }
        LinearLayout linearLayout = abstractC8293azx.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        Iterator<View> it = ViewGroupKt.getChildren(linearLayout).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            if (Intrinsics.EZpvd(next.getTag(), (Object) "TAG_NEW_EMAIL")) {
                view = next;
                break;
            }
        }
        View view2 = view;
        if (view2 != null) {
            otpInputFragment.OLrzqt(view2, str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(OtpInputFragment otpInputFragment, String str) {
        AbstractC8293azx abstractC8293azx = otpInputFragment.gEmmrt;
        View view = null;
        if (abstractC8293azx == null) {
            Intrinsics.gEmmrt("");
            abstractC8293azx = null;
        }
        LinearLayout linearLayout = abstractC8293azx.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        Iterator<View> it = ViewGroupKt.getChildren(linearLayout).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            if (Intrinsics.EZpvd(next.getTag(), (Object) "TAG_OLD_EMAIL")) {
                view = next;
                break;
            }
        }
        View view2 = view;
        if (view2 != null) {
            otpInputFragment.OLrzqt(view2, str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(OtpInputFragment otpInputFragment, String str) {
        AbstractC8293azx abstractC8293azx = otpInputFragment.gEmmrt;
        View view = null;
        if (abstractC8293azx == null) {
            Intrinsics.gEmmrt("");
            abstractC8293azx = null;
        }
        LinearLayout linearLayout = abstractC8293azx.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        Iterator<View> it = ViewGroupKt.getChildren(linearLayout).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            if (Intrinsics.EZpvd(next.getTag(), (Object) "TAG_NEW_GOOGLE")) {
                view = next;
                break;
            }
        }
        View view2 = view;
        if (view2 != null) {
            otpInputFragment.OLrzqt(view2, str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit values(OtpInputFragment otpInputFragment, String str) {
        AbstractC8293azx abstractC8293azx = otpInputFragment.gEmmrt;
        View view = null;
        if (abstractC8293azx == null) {
            Intrinsics.gEmmrt("");
            abstractC8293azx = null;
        }
        LinearLayout linearLayout = abstractC8293azx.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        Iterator<View> it = ViewGroupKt.getChildren(linearLayout).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View next = it.next();
            if (Intrinsics.EZpvd(next.getTag(), (Object) "TAG_OLD_GOOGLE")) {
                view = next;
                break;
            }
        }
        View view2 = view;
        if (view2 != null) {
            otpInputFragment.OLrzqt(view2, str);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(View view, String str) {
        if (C33129mqd.OLrzqt((CharSequence) str)) {
            C55008xbo c55008xbo = (C55008xbo) view.findViewById(C8206ayP.StateListAnimator.fdOvFl);
            c55008xbo.setText("");
            if (str == null) {
                c55008xbo.values();
            } else {
                c55008xbo.setErrorText(str);
            }
        }
    }

    public final void EZpvd(AbstractC6659aTX.TaskDescription taskDescription) {
        if (taskDescription.gEmmrt() == 1) {
            taskDescription.EZpvd(true);
        } else {
            taskDescription.OLrzqt(true);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.twofactorauth.ui.OtpInputFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}

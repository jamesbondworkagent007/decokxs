package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.airbnb.lottie.SimpleColorFilter;
import com.okinc.business.market.bean.TokenInfoForAlert;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.C32113mPz;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.teO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46818teO extends AbstractC46804teA {
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.teR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C46818teO.OLrzqt(this.EZpvd));
        }
    });
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AhwBna = 8;

    public C46818teO() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditDialogFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditDialogFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C46817teN.class), new Function0<ViewModelStore>() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditDialogFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditDialogFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditDialogFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: renamed from: o.teO$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.teO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C46818teO OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, AlertRemindPo alertRemindPo, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, TokenInfoForAlert tokenInfoForAlert) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C46818teO c46818teO = new C46818teO();
            c46818teO.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("inst_id", str), C56390yDp.OLrzqt("instType", str2), C56390yDp.OLrzqt("data", alertRemindPo), C56390yDp.OLrzqt("from", str3), C56390yDp.OLrzqt("msg", str4), C56390yDp.OLrzqt("alert_type", str5), C56390yDp.OLrzqt("source_type", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("token_alert_info", tokenInfoForAlert)));
            return c46818teO;
        }
    }

    /* JADX DEBUG: Possible override for method o.teA.AEQbTJ()V */
    public final AlertRemindPo AEQbTJ() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return (AlertRemindPo) arguments.getParcelable("data");
        }
        return null;
    }

    public final java.lang.String valueOf() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("inst_id")) != null) {
            return string;
        }
        AlertRemindPo alertRemindPoAEQbTJ = AEQbTJ();
        return alertRemindPoAEQbTJ != null ? alertRemindPoAEQbTJ.getInstrumentName() : "";
    }

    public final java.lang.String djBIcL() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("instType")) != null) {
            return string;
        }
        AlertRemindPo alertRemindPoAEQbTJ = AEQbTJ();
        return alertRemindPoAEQbTJ != null ? C46846teq.EZpvd.EZpvd(alertRemindPoAEQbTJ.getBizType()) : "";
    }

    public final java.lang.String gEmmrt() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("msg");
        }
        return null;
    }

    private final java.lang.String isConnected() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("from")) == null) ? "" : string;
    }

    private final java.lang.String DbNXlk() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("alert_type")) == null) ? "" : string;
    }

    private final int AkhnZx() {
        return ((java.lang.Number) this.gEmmrt.getValue()).intValue();
    }

    public static final int OLrzqt(C46818teO c46818teO) {
        android.os.Bundle arguments = c46818teO.getArguments();
        if (arguments != null) {
            return arguments.getInt("source_type");
        }
        return 1;
    }

    public final TokenInfoForAlert AhwBna() {
        TokenInfoForAlert tokenInfoForAlert;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (tokenInfoForAlert = (TokenInfoForAlert) arguments.getParcelable("token_alert_info")) == null) ? new TokenInfoForAlert(null, null, null, null, null, null, null, null, false, 0, 1023, null) : tokenInfoForAlert;
    }

    public final C46817teN AYXKKw() {
        return (C46817teN) this.djBIcL.getValue();
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(AEQbTJ() != null ? qZH.PendingIntent.HJWChPQdUnVm : qZH.PendingIntent.QsIRgs));
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.gqOnQv);
        if (drawableKWHzl != null) {
            drawableKWHzl.setBounds(new android.graphics.Rect(0, 0, C33070mpX.OLrzqt(C52761wXj.StateListAnimator.OcIXYQ), C33070mpX.OLrzqt(C52761wXj.StateListAnimator.OcIXYQ)));
            drawableKWHzl.setColorFilter(new SimpleColorFilter(C33070mpX.copydefault(C32113mPz.ActionBar.iwGUEr)));
            Unit unit = Unit.INSTANCE;
        } else {
            drawableKWHzl = null;
        }
        textViewAYXKKw.setCompoundDrawables(null, null, drawableKWHzl, null);
        TextViewCompat.setCompoundDrawableTintList(wxq.AYXKKw(), android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C32113mPz.ActionBar.fetchVPNInfo)));
        wxq.AYXKKw().setCompoundDrawablePadding(C33070mpX.OLrzqt(C52761wXj.StateListAnimator.QOLQEE));
        wxq.AYXKKw().setOnClickListener(new View.OnClickListener() { // from class: o.teW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C46818teO.EZpvd(this.copydefault, view);
            }
        });
        wxq.setStyle(1);
        wxq.setCloseVisibility(true);
        wxq.AEQbTJ().setVisibility(8);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.teS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C46818teO.KWHzl(this.EZpvd, view);
            }
        });
    }

    public static final void EZpvd(C46818teO c46818teO, android.view.View view) {
        C46896tfn c46896tfnEZpvd = C46896tfn.Companion.EZpvd(c46818teO.AkhnZx());
        androidx.fragment.app.FragmentManager childFragmentManager = c46818teO.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c46896tfnEZpvd.show(childFragmentManager);
    }

    public static final void KWHzl(C46818teO c46818teO, android.view.View view) {
        c46818teO.dismiss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        getChildFragmentManager().beginTransaction().add(constraintLayout.getId(), C46825teV.Companion.AEQbTJ(valueOf(), djBIcL(), AEQbTJ(), isConnected(), gEmmrt(), DbNXlk(), AkhnZx(), AhwBna())).commitAllowingStateLoss();
        int paddingTop = constraintLayout.getPaddingTop();
        int paddingLeft = constraintLayout.getPaddingLeft();
        int paddingRight = constraintLayout.getPaddingRight();
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        constraintLayout.setPadding(paddingLeft, paddingTop, paddingRight, C55298xhM.copydefault(20.0f, context));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.teO$StateListAnimator */
    public static final class StateListAnimator implements DialogInterface.OnDismissListener {
        public final /* synthetic */ CancellableContinuation<java.lang.Boolean> EZpvd;
        public final /* synthetic */ C46818teO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(CancellableContinuation<? super java.lang.Boolean> cancellableContinuation, C46818teO c46818teO) {
            this.EZpvd = cancellableContinuation;
            this.copydefault = c46818teO;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(android.content.DialogInterface dialogInterface) {
            if (this.EZpvd.isActive()) {
                CancellableContinuation<java.lang.Boolean> cancellableContinuation = this.EZpvd;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.valueOf(this.copydefault.AYXKKw().KWHzl())));
            }
        }
    }

    public final java.lang.Object OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        java.lang.Object objM7377constructorimpl;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        try {
            Result.Application application = Result.Companion;
            show(fragmentManager);
            setOnDismissListener(new StateListAnimator(cancellableContinuationImpl, this));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null && cancellableContinuationImpl.isActive()) {
            Result.Application application3 = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m7377constructorimpl(C56443yFo.KWHzl(false)));
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}

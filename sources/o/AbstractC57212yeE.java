package o;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yeE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57212yeE extends AbstractC32996moC implements AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity {
    public C57211yeD QbewEr;
    public int RcXXUw;
    public Function1<? super android.view.View, Unit> QfsBiF = new Function1() { // from class: o.yeL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return AbstractC57212yeE.copydefault((android.view.View) obj);
        }
    };
    public Function1<? super android.view.View, Unit> djSkpj = new Function1() { // from class: o.yeK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return AbstractC57212yeE.AEQbTJ((android.view.View) obj);
        }
    };

    public void AEQbTJ(int i, int i2, android.content.Intent intent) {
    }

    public void aB_() {
    }

    public void aC_() {
    }

    public void copydefault(android.os.Bundle bundle) {
    }

    public abstract boolean copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int zLjUOn() {
        return this.RcXXUw;
    }

    public static final Unit copydefault(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        C57211yeD c57211yeD;
        AbstractC57212yeE abstractC57212yeEEZpvd;
        if (getParentFragment() instanceof AbstractDialogInterfaceOnKeyListenerC57208yeA) {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            Intrinsics.copydefault(parentFragment, "");
            AbstractDialogInterfaceOnKeyListenerC57208yeA abstractDialogInterfaceOnKeyListenerC57208yeA = (AbstractDialogInterfaceOnKeyListenerC57208yeA) parentFragment;
            this.QbewEr = abstractDialogInterfaceOnKeyListenerC57208yeA.KWHzl();
            abstractDialogInterfaceOnKeyListenerC57208yeA.EZpvd(this);
        } else if (getParentFragment() instanceof DialogInterfaceOnKeyListenerC14659dpd) {
            androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
            Intrinsics.copydefault(parentFragment2, "");
            DialogInterfaceOnKeyListenerC14659dpd dialogInterfaceOnKeyListenerC14659dpd = (DialogInterfaceOnKeyListenerC14659dpd) parentFragment2;
            this.QbewEr = dialogInterfaceOnKeyListenerC14659dpd.AEQbTJ();
            dialogInterfaceOnKeyListenerC14659dpd.copydefault(this);
        }
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("lastFragmentTag", null) : null;
        if (string != null && string.length() != 0 && (c57211yeD = this.QbewEr) != null && (abstractC57212yeEEZpvd = c57211yeD.EZpvd(string)) != null) {
            abstractC57212yeEEZpvd.aB_();
        }
        super.onCreate(bundle);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.yeG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC57212yeE.KWHzl(this.copydefault);
            }
        });
    }

    public static final void KWHzl(AbstractC57212yeE abstractC57212yeE) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC57212yeE, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.QfsBiF.invoke(view);
        AuCTelauCTel();
    }

    public final void AhwBna(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.djSkpj.invoke(view);
        close$default(this, null, 1, null);
    }

    public final boolean AubY() {
        C57211yeD c57211yeD = this.QbewEr;
        if (c57211yeD == null) {
            return true;
        }
        Intrinsics.copydefault(c57211yeD);
        return c57211yeD.OLrzqt().size() > 1;
    }

    public final void AuCTelauCTel() {
        C57211yeD c57211yeD = this.QbewEr;
        if (c57211yeD != null) {
            Intrinsics.copydefault(c57211yeD);
            if (c57211yeD.OLrzqt().size() <= 1) {
                close$default(this, null, 1, null);
                return;
            } else {
                hDKMBd();
                return;
            }
        }
        hDKMBd();
    }

    public static /* synthetic */ void addFragment$default(AbstractC57212yeE abstractC57212yeE, AbstractC57212yeE abstractC57212yeE2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFragment");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        abstractC57212yeE.AEQbTJ(abstractC57212yeE2, z, z2);
    }

    public final <F extends AbstractC57212yeE> void AEQbTJ(@NotNull F f, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(f, "");
        C57211yeD c57211yeD = this.QbewEr;
        if (c57211yeD != null) {
            c57211yeD.AEQbTJ(this, f, z, z2);
        }
        zsXlph();
    }

    public static /* synthetic */ void addFragmentForResult$default(AbstractC57212yeE abstractC57212yeE, AbstractC57212yeE abstractC57212yeE2, int i, boolean z, boolean z2, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFragmentForResult");
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        abstractC57212yeE.OLrzqt(abstractC57212yeE2, i, z, z2);
    }

    public final <F extends AbstractC57212yeE> void OLrzqt(@NotNull F f, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(f, "");
        f.RcXXUw = i;
        C57211yeD c57211yeD = this.QbewEr;
        if (c57211yeD != null) {
            c57211yeD.AEQbTJ(this, f, z, z2);
        }
        zsXlph();
    }

    public final void zsXlph() {
        FragmentActivity activity = getActivity();
        java.lang.Object systemService = activity != null ? activity.getSystemService("input_method") : null;
        Intrinsics.copydefault(systemService, "");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) systemService;
        android.view.View view = getView();
        inputMethodManager.hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
    }

    public final void hDKMBd() {
        C57211yeD c57211yeD = this.QbewEr;
        if (c57211yeD != null) {
            c57211yeD.OLrzqt(this);
        }
    }

    public static /* synthetic */ void backForResult$default(AbstractC57212yeE abstractC57212yeE, int i, android.content.Intent intent, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: backForResult");
        }
        if ((i2 & 2) != 0) {
            intent = null;
        }
        abstractC57212yeE.OLrzqt(i, intent);
    }

    public final void OLrzqt(int i, android.content.Intent intent) {
        AbstractC57212yeE abstractC57212yeEEZpvd;
        C57211yeD c57211yeD = this.QbewEr;
        if (c57211yeD == null || (abstractC57212yeEEZpvd = c57211yeD.EZpvd(this)) == null) {
            return;
        }
        abstractC57212yeEEZpvd.AEQbTJ(this.RcXXUw, i, intent);
    }

    public static /* synthetic */ void close$default(AbstractC57212yeE abstractC57212yeE, android.os.Bundle bundle, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
        if ((i & 1) != 0) {
            bundle = null;
        }
        abstractC57212yeE.AEQbTJ(bundle);
    }

    public void AEQbTJ(android.os.Bundle bundle) {
        if (getParentFragment() instanceof AbstractDialogInterfaceOnKeyListenerC57208yeA) {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            Intrinsics.copydefault(parentFragment, "");
            ((AbstractDialogInterfaceOnKeyListenerC57208yeA) parentFragment).copydefault(bundle);
        } else if (getParentFragment() instanceof DialogInterfaceOnKeyListenerC14659dpd) {
            androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
            Intrinsics.copydefault(parentFragment2, "");
            ((DialogInterfaceOnKeyListenerC14659dpd) parentFragment2).AEQbTJ(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C57211yeD c57211yeD;
        AbstractC57212yeE abstractC57212yeEEZpvd;
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("lastFragmentTag", null) : null;
        if (string != null && string.length() != 0 && (c57211yeD = this.QbewEr) != null && (abstractC57212yeEEZpvd = c57211yeD.EZpvd(string)) != null) {
            abstractC57212yeEEZpvd.aC_();
        }
        if (getParentFragment() instanceof AbstractDialogInterfaceOnKeyListenerC57208yeA) {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            Intrinsics.copydefault(parentFragment, "");
            ((AbstractDialogInterfaceOnKeyListenerC57208yeA) parentFragment).AEQbTJ(this);
        } else if (getParentFragment() instanceof DialogInterfaceOnKeyListenerC14659dpd) {
            androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
            Intrinsics.copydefault(parentFragment2, "");
            ((DialogInterfaceOnKeyListenerC14659dpd) parentFragment2).OLrzqt(this);
        }
        super.onDestroy();
    }
}

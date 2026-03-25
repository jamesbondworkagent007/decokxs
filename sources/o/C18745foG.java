package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.foG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18745foG extends wXX {
    public InterfaceC18801fpK EZpvd;
    public java.lang.String KWHzl = "";
    public android.widget.EditText copydefault;

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull InterfaceC18801fpK interfaceC18801fpK) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC18801fpK, "");
        this.EZpvd = interfaceC18801fpK;
        fragmentManager.beginTransaction().add(this, (java.lang.String) null).commitAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C13754dXa.LoaderManager.valueOf);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.AYXKKw().setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16552emA.copydefault(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        ConstraintLayout constraintLayout;
        android.view.View rootView;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C54946xaf binding = getBinding();
        if (binding == null || (constraintLayout = binding.AEQbTJ) == null || (rootView = constraintLayout.getRootView()) == null) {
            return;
        }
        android.view.View viewFindViewById = rootView.findViewById(C13754dXa.ActionBar.tIwhY);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        final C52794wYp c52794wYp = (C52794wYp) viewFindViewById;
        android.view.View viewFindViewById2 = rootView.findViewById(C13754dXa.ActionBar.setMediaId);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        final C14775drn c14775drn = (C14775drn) viewFindViewById2;
        this.copydefault = c14775drn.AkhnZx();
        c14775drn.setOnTextChanged(new Function1() { // from class: o.foI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18745foG.AEQbTJ(this.AEQbTJ, c14775drn, c52794wYp, (java.lang.String) obj);
            }
        });
        C8003auW.copydefault(c52794wYp).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.foJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18745foG.EZpvd(c52794wYp, this, c14775drn, obj);
            }
        });
        view.post(new java.lang.Runnable() { // from class: o.foK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C18745foG.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final Unit AEQbTJ(C18745foG c18745foG, C14775drn c14775drn, C52794wYp c52794wYp, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c18745foG.KWHzl) && c18745foG.KWHzl.length() > 0) {
            c14775drn.values();
        }
        c52794wYp.setEnabled(str.length() >= 6);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(final C52794wYp c52794wYp, final C18745foG c18745foG, final C14775drn c14775drn, java.lang.Object obj) {
        InterfaceC18801fpK interfaceC18801fpK = null;
        C52794wYp.startLoading$default(c52794wYp, 0L, 1, null);
        android.widget.EditText editText = c18745foG.copydefault;
        c18745foG.KWHzl = java.lang.String.valueOf(editText != null ? editText.getText() : null);
        InterfaceC18801fpK interfaceC18801fpK2 = c18745foG.EZpvd;
        if (interfaceC18801fpK2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            interfaceC18801fpK = interfaceC18801fpK2;
        }
        interfaceC18801fpK.EZpvd(c18745foG.KWHzl, new Function1() { // from class: o.foH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C18745foG.EZpvd(c52794wYp, c18745foG, c14775drn, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
    }

    public static final Unit EZpvd(C52794wYp c52794wYp, C18745foG c18745foG, C14775drn c14775drn, boolean z) {
        c52794wYp.fIwbmz();
        if (z) {
            c18745foG.dismissAllowingStateLoss();
        } else {
            c14775drn.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getNavigationItemCount));
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C18745foG c18745foG) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c18745foG, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        android.widget.EditText editText = this.copydefault;
        if (editText != null) {
            editText.requestFocusFromTouch();
        }
    }
}

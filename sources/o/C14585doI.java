package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.doI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14585doI extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public C52794wYp AEQbTJ;
    public final ActivityResultLauncher<android.content.Intent> AhwBna;
    public Function1<? super java.lang.String, Unit> KWHzl;
    public android.widget.EditText copydefault;
    public C14775drn gEmmrt;
    public java.lang.String AYXKKw = "";
    public java.lang.String OLrzqt = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    public C14585doI() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.doE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C14585doI.KWHzl(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.doI$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.doI.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C14585doI newInstance$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return stateListAnimator.KWHzl(str);
        }

        public final C14585doI KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C14585doI c14585doI = new C14585doI();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("title", str);
            c14585doI.setArguments(bundle);
            return c14585doI;
        }
    }

    public static final void KWHzl(C14585doI c14585doI, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            c14585doI.dismissAllowingStateLoss();
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        android.view.Window window;
        super.onCreate(bundle);
        setStyle(0, C13754dXa.LoaderManager.valueOf);
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.addFlags(8192);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        ConstraintLayout constraintLayout;
        android.view.View rootView;
        C55001xbh c55001xbhAkhnZx;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C54946xaf binding = getBinding();
        if (binding == null || (constraintLayout = binding.AEQbTJ) == null || (rootView = constraintLayout.getRootView()) == null) {
            return;
        }
        this.AEQbTJ = (C52794wYp) rootView.findViewById(C13754dXa.ActionBar.tIwhY);
        C14775drn c14775drn = (C14775drn) rootView.findViewById(C13754dXa.ActionBar.setMediaId);
        this.gEmmrt = c14775drn;
        C55001xbh c55001xbhAkhnZx2 = c14775drn != null ? c14775drn.AkhnZx() : null;
        this.copydefault = c55001xbhAkhnZx2;
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.setContentDescription("inputPassword");
        }
        C14775drn c14775drn2 = this.gEmmrt;
        if (c14775drn2 != null) {
            c14775drn2.setState(1);
        }
        C14775drn c14775drn3 = this.gEmmrt;
        if (c14775drn3 != null && (c55001xbhAkhnZx = c14775drn3.AkhnZx()) != null) {
            c55001xbhAkhnZx.setActivated(true);
        }
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(C13754dXa.ActionBar.BackHandlerKtBackHandlerbackCallback11);
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("title") : null;
        if (string == null) {
            string = "";
        }
        this.AYXKKw = string;
        java.lang.String strAYXKKw = string.length() == 0 ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.HJWChPDXdlte) : this.AYXKKw;
        C14775drn c14775drn4 = this.gEmmrt;
        if (c14775drn4 != null) {
            c14775drn4.setLabelText(strAYXKKw);
        }
        C14775drn c14775drn5 = this.gEmmrt;
        if (c14775drn5 != null) {
            c14775drn5.setOnTextChanged(new Function1() { // from class: o.doL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14585doI.KWHzl(this.EZpvd, (java.lang.String) obj);
                }
            });
        }
        if (textView != null) {
            textView.setOnClickListener(new Application(textView, 1000L, this));
        }
        C52794wYp c52794wYp = this.AEQbTJ;
        if (c52794wYp != null) {
            AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(c52794wYp).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
            Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
            C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.doJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14585doI.EZpvd(this.OLrzqt, obj);
                }
            });
        }
    }

    public static final Unit KWHzl(C14585doI c14585doI, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c14585doI.OLrzqt = str;
        C52794wYp c52794wYp = c14585doI.AEQbTJ;
        if (c52794wYp != null) {
            c52794wYp.setEnabled(str.length() > 0 && str.length() >= 6);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C14585doI c14585doI, java.lang.Object obj) {
        Function1<? super java.lang.String, Unit> function1 = c14585doI.KWHzl;
        if (function1 != null) {
            function1.invoke(c14585doI.OLrzqt);
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        android.view.Window window;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.clearFlags(8192);
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
        C16546elv.copydefault(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        C55001xbh c55001xbhAkhnZx;
        super.onResume();
        android.widget.EditText editText = this.copydefault;
        if (editText != null) {
            editText.requestFocusFromTouch();
        }
        C14775drn c14775drn = this.gEmmrt;
        if (c14775drn == null || (c55001xbhAkhnZx = c14775drn.AkhnZx()) == null) {
            return;
        }
        c55001xbhAkhnZx.setActivated(true);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C14775drn c14775drn = this.gEmmrt;
        if (c14775drn != null) {
            c14775drn.setErrorText(str);
        }
    }

    /* JADX INFO: renamed from: o.doI$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C14585doI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C14585doI c14585doI) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c14585doI;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                FragmentActivity activity = this.copydefault.getActivity();
                if (activity == null) {
                    return;
                }
                this.copydefault.AhwBna.launch(ActivityC18553fka.Companion.KWHzl(activity));
            }
        }
    }
}

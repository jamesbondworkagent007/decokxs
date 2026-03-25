package o;

import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fjv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18521fjv extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public C52794wYp AkhnZx;
    public android.widget.TextView DbNXlk;
    public android.widget.EditText EZpvd;
    public Function1<? super java.lang.String, Unit> OLrzqt;
    public C55008xbo djBIcL;
    public int fetchVPNInfo;
    public java.lang.String isConnected = "";
    public java.lang.String valueOf = "";
    public java.lang.String copydefault = "";
    public java.lang.String AEQbTJ = "";
    public java.lang.String AYXKKw = "";
    public java.lang.String AhwBna = "";
    public final int gEmmrt = 25;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX INFO: renamed from: o.fjv$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fjv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C18521fjv KWHzl(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            C18521fjv c18521fjv = new C18521fjv();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("title", str2);
            bundle.putString("subtext", str3);
            bundle.putString("hintText", str4);
            bundle.putString("defaulttext", str5);
            bundle.putString("RootWalletId", str);
            bundle.putInt("type", i);
            c18521fjv.setArguments(bundle);
            return c18521fjv;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.String string5;
        super.onCreate(bundle);
        setStyle(0, C13754dXa.LoaderManager.valueOf);
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if (arguments == null || (string = arguments.getString("title", "")) == null) {
            string = "";
        }
        this.isConnected = string;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("subtext", "")) == null) {
            string2 = "";
        }
        this.valueOf = string2;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (string3 = arguments3.getString("hintText", "")) == null) {
            string3 = "";
        }
        this.copydefault = string3;
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 == null || (string4 = arguments4.getString("defaulttext", "")) == null) {
            string4 = "";
        }
        this.AEQbTJ = string4;
        android.os.Bundle arguments5 = getArguments();
        if (arguments5 != null && (string5 = arguments5.getString("RootWalletId", "")) != null) {
            str = string5;
        }
        this.AYXKKw = str;
        android.os.Bundle arguments6 = getArguments();
        this.fetchVPNInfo = arguments6 != null ? arguments6.getInt("type") : 0;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        ConstraintLayout constraintLayout;
        android.view.View rootView;
        android.widget.EditText editText;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C54946xaf binding = getBinding();
        if (binding == null || (constraintLayout = binding.AEQbTJ) == null || (rootView = constraintLayout.getRootView()) == null) {
            return;
        }
        this.AkhnZx = (C52794wYp) rootView.findViewById(C13754dXa.ActionBar.OnBackPressedDispatcherKt);
        C55008xbo c55008xbo = (C55008xbo) rootView.findViewById(C13754dXa.ActionBar.setIconUri);
        this.djBIcL = c55008xbo;
        if (c55008xbo != null) {
            c55008xbo.setState(1);
        }
        C55008xbo c55008xbo2 = this.djBIcL;
        C55001xbh c55001xbhAkhnZx = c55008xbo2 != null ? c55008xbo2.AkhnZx() : null;
        this.EZpvd = c55001xbhAkhnZx;
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setHint(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hwkNQP));
        }
        android.widget.EditText editText2 = this.EZpvd;
        if (editText2 != null) {
            editText2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.gEmmrt)});
        }
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(C13754dXa.ActionBar.invokeSuspendlambda1);
        this.DbNXlk = textView;
        ViewGroup.LayoutParams layoutParams = textView != null ? textView.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            layoutParams2.topMargin = C55298xhM.copydefault(52.0f, contextRequireContext);
        }
        android.widget.EditText editText3 = this.EZpvd;
        if (editText3 != null) {
            editText3.post(new java.lang.Runnable() { // from class: o.fju
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C18521fjv.AhwBna(this.copydefault);
                }
            });
        }
        android.widget.EditText editText4 = this.EZpvd;
        if (editText4 != null) {
            editText4.addTextChangedListener(new Application());
        }
        C55008xbo c55008xbo3 = this.djBIcL;
        if (c55008xbo3 != null) {
            c55008xbo3.setLabelText(this.valueOf);
        }
        if (this.AEQbTJ.length() != 0) {
            android.widget.EditText editText5 = this.EZpvd;
            if (editText5 != null) {
                editText5.setText(this.AEQbTJ);
            }
        } else if (this.copydefault.length() > 0 && (editText = this.EZpvd) != null) {
            editText.setHint(this.copydefault);
        }
        C52794wYp c52794wYp = this.AkhnZx;
        if (c52794wYp != null) {
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.fjx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C18521fjv.EZpvd(this.AEQbTJ, view2);
                }
            });
        }
    }

    public static final void AhwBna(C18521fjv c18521fjv) {
        C55009xbp c55009xbpFIwbmz;
        android.widget.TextView textView = c18521fjv.DbNXlk;
        ViewGroup.LayoutParams layoutParams = textView != null ? textView.getLayoutParams() : null;
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            C55008xbo c55008xbo = c18521fjv.djBIcL;
            int height = (c55008xbo == null || (c55009xbpFIwbmz = c55008xbo.fIwbmz()) == null) ? 0 : c55009xbpFIwbmz.getHeight();
            android.content.Context contextRequireContext = c18521fjv.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            layoutParams2.topMargin = height + C55298xhM.copydefault(12.0f, contextRequireContext);
        }
    }

    /* JADX INFO: renamed from: o.fjv$Application */
    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String string;
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            C52794wYp c52794wYp = C18521fjv.this.AkhnZx;
            if (c52794wYp != null) {
                c52794wYp.setEnabled(string.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) C18521fjv.this.AEQbTJ));
            }
            android.widget.TextView textView = C18521fjv.this.DbNXlk;
            if (textView != null) {
                textView.setText(string.length() + "/" + C18521fjv.this.gEmmrt);
            }
            C55008xbo c55008xbo = C18521fjv.this.djBIcL;
            if (c55008xbo != null) {
                c55008xbo.values();
            }
        }
    }

    public static final void EZpvd(final C18521fjv c18521fjv, android.view.View view) {
        android.widget.EditText editText = c18521fjv.EZpvd;
        c18521fjv.AhwBna = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) java.lang.String.valueOf(editText != null ? editText.getText() : null)).toString();
        if (c18521fjv.fetchVPNInfo == 0) {
            AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, 3, null);
            final Function1 function1 = new Function1() { // from class: o.fjA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18521fjv.OLrzqt(this.AEQbTJ, (java.util.List) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtCopydefault = allRootWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.fjy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C18521fjv.OLrzqt(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            C11607cUn.subscribeOnIO$default(abstractC58260yxtCopydefault, (Function1) null, new Function1() { // from class: o.fjw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18521fjv.copydefault(this.copydefault, (java.lang.Boolean) obj);
                }
            }, 1, (java.lang.Object) null);
            return;
        }
        AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtDjBIcL = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).djBIcL(c18521fjv.AYXKKw);
        final Function1 function12 = new Function1() { // from class: o.fjz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18521fjv.EZpvd(this.copydefault, (AbstractC12784ctX) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault2 = abstractC58260yxtDjBIcL.copydefault(new InterfaceC58229yxO() { // from class: o.fjB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C18521fjv.KWHzl(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        C11607cUn.subscribeOnIO$default(abstractC58260yxtCopydefault2, (Function1) null, new Function1() { // from class: o.fjC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18521fjv.OLrzqt(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final java.lang.Boolean OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean OLrzqt(C18521fjv c18521fjv, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        boolean z = false;
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((AbstractC12784ctX) it.next()).AuCTel(), (java.lang.Object) c18521fjv.AhwBna)) {
                    z = true;
                }
            }
        }
        return java.lang.Boolean.valueOf(z);
    }

    public static final Unit copydefault(C18521fjv c18521fjv, java.lang.Boolean bool) {
        Intrinsics.copydefault(bool);
        c18521fjv.OLrzqt(bool.booleanValue(), c18521fjv.AhwBna);
        return Unit.INSTANCE;
    }

    public static final java.lang.Boolean KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean EZpvd(C18521fjv c18521fjv, AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        boolean z = false;
        if (C33129mqd.KWHzl((java.util.Collection) abstractC12784ctX.KWHzl())) {
            java.util.Iterator<T> it = abstractC12784ctX.KWHzl().iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((AbstractC12782ctV) it.next()).AkhnZx(), (java.lang.Object) c18521fjv.AhwBna)) {
                    z = true;
                }
            }
        }
        return java.lang.Boolean.valueOf(z);
    }

    public static final Unit OLrzqt(C18521fjv c18521fjv, java.lang.Boolean bool) {
        Intrinsics.copydefault(bool);
        c18521fjv.OLrzqt(bool.booleanValue(), c18521fjv.AhwBna);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(boolean z, java.lang.String str) {
        if (z) {
            C55008xbo c55008xbo = this.djBIcL;
            if (c55008xbo != null) {
                c55008xbo.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hNurIN));
            }
            C52794wYp c52794wYp = this.AkhnZx;
            if (c52794wYp != null) {
                c52794wYp.setEnabled(false);
                return;
            }
            return;
        }
        C52794wYp c52794wYp2 = this.AkhnZx;
        if (c52794wYp2 != null) {
            c52794wYp2.setEnabled(true);
        }
        dismissAllowingStateLoss();
        Function1<? super java.lang.String, Unit> function1 = this.OLrzqt;
        if (function1 != null) {
            function1.invoke(str);
        }
        C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.addCancellableCallbackactivity_release), 0, 1, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        android.widget.EditText editText = this.EZpvd;
        if (editText != null) {
            editText.requestFocusFromTouch();
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C33054mpH.OLrzqt(contextRequireContext, this.EZpvd);
        super.onDismiss(dialogInterface);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        java.lang.String strAYXKKw = this.isConnected.length() == 0 ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.DVmcag) : this.isConnected;
        wxq.setStyle(1);
        wxq.setTitle(strAYXKKw);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C16542elr.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
    }
}

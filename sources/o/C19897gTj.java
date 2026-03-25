package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gTj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19897gTj extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public C55001xbh AEQbTJ;
    public wYF EZpvd;
    public final Application KWHzl = new Application();

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.gTj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gTj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C19897gTj copydefault(java.lang.String str) {
            C19897gTj c19897gTj = new C19897gTj();
            c19897gTj.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_STRATEGY_NAME", str)));
            return c19897gTj;
        }
    }

    /* JADX INFO: renamed from: o.gTj$Application */
    public static final class Application implements ViewTreeObserver.OnWindowFocusChangeListener {
        public Application() {
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public void onWindowFocusChanged(boolean z) {
            C55001xbh c55001xbh;
            if (!z || (c55001xbh = C19897gTj.this.AEQbTJ) == null) {
                return;
            }
            C19897gTj.this.copydefault(c55001xbh);
            c55001xbh.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        java.lang.String string = getString(C23274hvD.Fragment.gVEiQJ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        final C23457hyb c23457hybAEQbTJ = C23457hyb.AEQbTJ(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c23457hybAEQbTJ, "");
        C55009xbp c55009xbpFIwbmz = c23457hybAEQbTJ.KWHzl.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.setPaddingRelative(0, c55009xbpFIwbmz.getPaddingTop(), c55009xbpFIwbmz.getPaddingEnd(), c55009xbpFIwbmz.getPaddingBottom());
        }
        final C55001xbh c55001xbhAkhnZx = c23457hybAEQbTJ.KWHzl.AkhnZx();
        this.AEQbTJ = c55001xbhAkhnZx;
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.addTextChangedListener(new ActionBar(c23457hybAEQbTJ, this));
            c55001xbhAkhnZx.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.gTg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    C19897gTj.AEQbTJ(c55001xbhAkhnZx, c23457hybAEQbTJ, view, z);
                }
            });
            TextViewCompat.setTextAppearance(c55001xbhAkhnZx, C52761wXj.LoaderManager.AubY);
            android.os.Bundle arguments = getArguments();
            c55001xbhAkhnZx.setText(arguments != null ? arguments.getString("KEY_STRATEGY_NAME") : null);
            c55001xbhAkhnZx.requestFocus();
            if (c55001xbhAkhnZx.hasWindowFocus()) {
                copydefault(c55001xbhAkhnZx);
            } else {
                c55001xbhAkhnZx.getViewTreeObserver().addOnWindowFocusChangeListener(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.gTj$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        public final /* synthetic */ C19897gTj EZpvd;
        public final /* synthetic */ C23457hyb copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar(C23457hyb c23457hyb, C19897gTj c19897gTj) {
            this.copydefault = c23457hyb;
            this.EZpvd = c19897gTj;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C52794wYp c52794wYpCopydefault;
            boolean z = false;
            int length = editable != null ? editable.length() : 0;
            if (length > 12) {
                this.copydefault.KWHzl.setErrorText(C33069mpW.copydefault(C23274hvD.Fragment.sYcwUD, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "12"))));
            } else {
                this.copydefault.KWHzl.values();
            }
            wYF wyf = this.EZpvd.EZpvd;
            if (wyf == null || (c52794wYpCopydefault = wyf.copydefault()) == null) {
                return;
            }
            if (length > 0 && length <= 12) {
                z = true;
            }
            c52794wYpCopydefault.setEnabled(z);
        }
    }

    public static final void AEQbTJ(C55001xbh c55001xbh, C23457hyb c23457hyb, android.view.View view, boolean z) {
        c23457hyb.KWHzl.setState(c55001xbh.length() > 12 ? 2 : z ? 1 : 0);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.EZpvd = wyf;
        wyf.setType(5);
        wyf.setPrimaryText(getString(C23274hvD.Fragment.QKVWgx));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C59541ziw.EZpvd(fragmentActivityRequireActivity, viewLifecycleOwner, new InterfaceC59496ziD() { // from class: o.gTh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                C19897gTj.AEQbTJ(this.KWHzl, z);
            }
        });
    }

    public static final void AEQbTJ(C19897gTj c19897gTj, boolean z) {
        C55001xbh c55001xbh;
        if (z || (c55001xbh = c19897gTj.AEQbTJ) == null) {
            return;
        }
        c55001xbh.clearFocus();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        getParentFragmentManager().setFragmentResult("CopyTradingEditStrategyNameBottomSheet.requestKey", BundleKt.bundleOf());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        android.view.ViewTreeObserver viewTreeObserver;
        super.onDestroyView();
        C55001xbh c55001xbh = this.AEQbTJ;
        if (c55001xbh != null && (viewTreeObserver = c55001xbh.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener(this.KWHzl);
        }
        this.AEQbTJ = null;
        this.EZpvd = null;
    }

    public final void copydefault(android.view.View view) {
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ContextCompat.getSystemService(context, android.view.inputmethod.InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    /* JADX INFO: renamed from: o.gTj$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C19897gTj AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C19897gTj c19897gTj) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c19897gTj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            android.text.Editable text;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                androidx.fragment.app.FragmentManager parentFragmentManager = this.AEQbTJ.getParentFragmentManager();
                kotlin.Pair[] pairArr = new kotlin.Pair[1];
                C55001xbh c55001xbh = this.AEQbTJ.AEQbTJ;
                pairArr[0] = C56390yDp.OLrzqt("KEY_STRATEGY_NAME", (c55001xbh == null || (text = c55001xbh.getText()) == null) ? null : text.toString());
                parentFragmentManager.setFragmentResult("CopyTradingEditStrategyNameBottomSheet.requestKey", BundleKt.bundleOf(pairArr));
                this.AEQbTJ.dismiss();
            }
        }
    }
}

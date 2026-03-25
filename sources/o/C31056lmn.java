package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.MarginLayoutParamsCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lmn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C31056lmn extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public wYF AEQbTJ;
    public Function1<? super java.lang.String, Unit> EZpvd;
    public java.lang.String KWHzl;
    public C21580hEq copydefault;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.KWHzl = arguments.getString("data");
        }
    }

    /* JADX INFO: renamed from: o.lmn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lmn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C31056lmn copydefault(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            C31056lmn c31056lmn = new C31056lmn();
            c31056lmn.EZpvd = function1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("data", str);
            c31056lmn.setArguments(bundle);
            return c31056lmn;
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(2);
        wxq.setDividerVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.AudioAttributesImplBaseParcelizer));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        C55008xbo c55008xbo2;
        C55001xbh c55001xbhAkhnZx2;
        C55008xbo c55008xbo3;
        C55001xbh c55001xbhAkhnZx3;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C21580hEq c21580hEqKWHzl = C21580hEq.KWHzl(getLayoutInflater(), constraintLayout, true);
        this.copydefault = c21580hEqKWHzl;
        if (c21580hEqKWHzl != null && (c55008xbo3 = c21580hEqKWHzl.AEQbTJ) != null && (c55001xbhAkhnZx3 = c55008xbo3.AkhnZx()) != null) {
            c55001xbhAkhnZx3.setTextAppearance(C32113mPz.Dialog.zLjUOn);
        }
        C21580hEq c21580hEq = this.copydefault;
        if (c21580hEq != null && (c55008xbo2 = c21580hEq.AEQbTJ) != null && (c55001xbhAkhnZx2 = c55008xbo2.AkhnZx()) != null) {
            c55001xbhAkhnZx2.setText(java.lang.String.valueOf(this.KWHzl));
        }
        C21580hEq c21580hEq2 = this.copydefault;
        if (c21580hEq2 == null || (c55008xbo = c21580hEq2.AEQbTJ) == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null) {
            return;
        }
        c55001xbhAkhnZx.addTextChangedListener(new Application());
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        C55008xbo c55008xbo;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C21580hEq c21580hEq = this.copydefault;
        if (c21580hEq != null && (c55008xbo = c21580hEq.AEQbTJ) != null) {
            c55008xbo.postDelayed(new java.lang.Runnable() { // from class: o.lmp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C31056lmn.djBIcL(this.OLrzqt);
                }
            }, 200L);
        }
        view.post(new java.lang.Runnable() { // from class: o.lmq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C31056lmn.AhwBna(this.AEQbTJ);
            }
        });
    }

    /* JADX INFO: renamed from: o.lmn$Application */
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
            C55008xbo c55008xbo;
            C55008xbo c55008xbo2;
            C52794wYp c52794wYpCopydefault;
            wYF wyf = C31056lmn.this.AEQbTJ;
            if (wyf != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
                c52794wYpCopydefault.setEnabled(editable != null && editable.length() > 0 && editable.length() <= 12);
            }
            if (editable == null || editable.length() <= 12) {
                C21580hEq c21580hEq = C31056lmn.this.copydefault;
                if (c21580hEq == null || (c55008xbo = c21580hEq.AEQbTJ) == null) {
                    return;
                }
                c55008xbo.values();
                return;
            }
            C21580hEq c21580hEq2 = C31056lmn.this.copydefault;
            if (c21580hEq2 == null || (c55008xbo2 = c21580hEq2.AEQbTJ) == null) {
                return;
            }
            c55008xbo2.setErrorText(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatCustomActionCallback));
        }
    }

    public static final void djBIcL(C31056lmn c31056lmn) {
        C21580hEq c21580hEq;
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        C55008xbo c55008xbo2;
        C55001xbh c55001xbhAkhnZx2;
        C21580hEq c21580hEq2 = c31056lmn.copydefault;
        if (c21580hEq2 != null && (c55008xbo2 = c21580hEq2.AEQbTJ) != null && (c55001xbhAkhnZx2 = c55008xbo2.AkhnZx()) != null) {
            c55001xbhAkhnZx2.requestFocus();
        }
        java.lang.String str = c31056lmn.KWHzl;
        if (str == null || str.length() <= 0 || (c21580hEq = c31056lmn.copydefault) == null || (c55008xbo = c21580hEq.AEQbTJ) == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null) {
            return;
        }
        java.lang.String str2 = c31056lmn.KWHzl;
        Intrinsics.copydefault((java.lang.Object) str2);
        c55001xbhAkhnZx.setSelection(str2.length());
    }

    public static final void AhwBna(C31056lmn c31056lmn) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c31056lmn, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        this.AEQbTJ = wyf;
        ViewGroup.LayoutParams layoutParams = wyf.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) layoutParams, C7865arr.copydefault(8.0f));
        ViewGroup.LayoutParams layoutParams2 = wyf.getLayoutParams();
        Intrinsics.copydefault(layoutParams2, "");
        MarginLayoutParamsCompat.setMarginEnd((ViewGroup.MarginLayoutParams) layoutParams2, C7865arr.copydefault(8.0f));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.QKVWgx));
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new TaskDescription(c52794wYpCopydefault2, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.lmn$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C31056lmn OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C31056lmn c31056lmn) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c31056lmn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C55008xbo c55008xbo;
            C55001xbh c55001xbhAkhnZx;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C21580hEq c21580hEq = this.OLrzqt.copydefault;
                java.lang.String strIsConnected = (c21580hEq == null || (c55008xbo = c21580hEq.AEQbTJ) == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null) ? null : c55001xbhAkhnZx.isConnected();
                Function1 function1 = this.OLrzqt.EZpvd;
                if (function1 != null) {
                    Intrinsics.copydefault((java.lang.Object) strIsConnected);
                    function1.invoke(strIsConnected);
                }
                this.OLrzqt.dismiss();
            }
        }
    }
}

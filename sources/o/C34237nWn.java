package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.core.view.KeyEventDispatcher;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nWn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C34237nWn extends nVQ {
    public static final Activity Companion = new Activity(null);
    public static final int gEmmrt = 8;
    public java.lang.String AYXKKw = "";
    public java.lang.String AhwBna = "";
    public boolean AkhnZx;
    public nOD djBIcL;
    public wYF valueOf;
    public StateListAnimator values;

    /* JADX INFO: renamed from: o.nWn$StateListAnimator */
    public interface StateListAnimator {
        void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2);
    }

    @Override // o.AbstractC52780wYb
    public java.lang.CharSequence AEQbTJ() {
        java.lang.String string = getString(C35399nuc.LoaderManager.OVMstZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ActivityResultCaller parentFragment = getParentFragment();
        StateListAnimator stateListAnimator = parentFragment instanceof StateListAnimator ? (StateListAnimator) parentFragment : null;
        if (stateListAnimator == null) {
            KeyEventDispatcher.Component activity = getActivity();
            stateListAnimator = activity instanceof StateListAnimator ? (StateListAnimator) activity : null;
        }
        this.values = stateListAnimator;
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("description") : null;
        if (string == null) {
            string = "";
        }
        this.AYXKKw = string;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("group_id") : null;
        this.AhwBna = string2 != null ? string2 : "";
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AYXKKw().setVisibility(8);
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.djBIcL = nOD.copydefault(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        AYXKKw();
    }

    public final void AYXKKw() {
        nOD nod = this.djBIcL;
        if (nod != null) {
            KWHzl(nod);
            copydefault(nod);
            AEQbTJ(nod);
        }
    }

    public final void KWHzl(nOD nod) {
        android.widget.TextView textView = nod.copydefault;
        Intrinsics.copydefault(textView);
        textView.setVisibility(0);
        textView.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.OVMstZ));
    }

    /* JADX INFO: renamed from: o.nWn$Application */
    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            C34237nWn.this.gEmmrt();
            C34237nWn.this.valueOf();
            C34237nWn.this.AEQbTJ(charSequence);
        }
    }

    public final void copydefault(nOD nod) {
        oIW oiw = nod.AEQbTJ;
        oiw.setMaxLength(120);
        oiw.setShowCount(true);
        OLrzqt(nod);
    }

    public final void OLrzqt(nOD nod) {
        C55001xbh c55001xbhCopydefault = nod.AEQbTJ.copydefault();
        if (c55001xbhCopydefault != null) {
            AEQbTJ(c55001xbhCopydefault);
            EZpvd(c55001xbhCopydefault);
        }
    }

    public final void AEQbTJ(android.widget.EditText editText) {
        if (this.AYXKKw.length() > 0) {
            this.AkhnZx = true;
            editText.setText(this.AYXKKw);
            editText.setSelection(this.AYXKKw.length());
            this.AkhnZx = false;
        }
    }

    public final void gEmmrt() {
        C52794wYp c52794wYpCopydefault;
        wYF wyf = this.valueOf;
        if (wyf == null || (c52794wYpCopydefault = wyf.copydefault()) == null) {
            return;
        }
        c52794wYpCopydefault.setEnabled(true);
    }

    public final void valueOf() {
        nOD nod = this.djBIcL;
        if (nod != null) {
            nod.AEQbTJ.setState(0);
            nod.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
    }

    public final void AEQbTJ(java.lang.CharSequence charSequence) {
        java.lang.String string;
        if (this.AkhnZx) {
            return;
        }
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        this.AYXKKw = string;
    }

    public final void AEQbTJ(nOD nod) {
        nod.KWHzl.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.ruDxL), C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, "20"))));
    }

    @Override // o.AbstractC52780wYb
    public void copydefault(@NotNull C54953xam c54953xam) {
        Intrinsics.checkNotNullParameter(c54953xam, "");
        AppCompatTextView appCompatTextView = c54953xam.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(8);
        wYK wyk = c54953xam.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        wyk.setVisibility(8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        C52794wYp c52794wYpCopydefault;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.valueOf = wyf;
        if (wyf != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
            c52794wYpCopydefault.setEnabled(false);
        }
        wyf.setType(5);
        wyf.setPrimaryText(getString(C35399nuc.LoaderManager.AuCTel));
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new ActionBar(c52794wYpCopydefault2, 1000L, this));
        }
    }

    public final boolean values() {
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) this.AYXKKw).toString();
        return string.codePointCount(0, string.length()) >= 2;
    }

    public final void AhwBna() {
        nOD nod = this.djBIcL;
        if (nod != null) {
            nod.AEQbTJ.setState(2);
            nod.KWHzl.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
            C55001xbh c55001xbhCopydefault = nod.AEQbTJ.copydefault();
            if (c55001xbhCopydefault != null) {
                c55001xbhCopydefault.requestFocus();
            }
        }
    }

    /* JADX INFO: renamed from: o.nWn$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C34237nWn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C34237nWn c34237nWn) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c34237nWn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.copydefault.values()) {
                    StateListAnimator stateListAnimator = this.copydefault.values;
                    if (stateListAnimator != null) {
                        stateListAnimator.EZpvd(this.copydefault.AhwBna, StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) this.copydefault.AYXKKw).toString());
                    }
                    this.copydefault.dismiss();
                    return;
                }
                this.copydefault.AhwBna();
            }
        }
    }

    /* JADX INFO: renamed from: o.nWn$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nWn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C34237nWn newInstance$default(Activity activity, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = "";
            }
            return activity.copydefault(str, str2);
        }

        public final C34237nWn copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C34237nWn c34237nWn = new C34237nWn();
            c34237nWn.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("group_id", str), C56390yDp.OLrzqt("description", str2)));
            return c34237nWn;
        }
    }

    public final void EZpvd(android.widget.EditText editText) {
        editText.addTextChangedListener(new Application());
    }
}

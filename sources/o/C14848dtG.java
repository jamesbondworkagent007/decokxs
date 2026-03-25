package o;

import android.content.res.Resources;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.dLX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dtG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14848dtG extends wXX {
    public wYK EZpvd;
    public Function0<Unit> KWHzl;
    public Function1<? super java.lang.Boolean, Unit> copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.dtG$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dtG.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.dtG$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C14848dtG newInstance$default(ActionBar actionBar, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function1 = null;
            }
            if ((i & 2) != 0) {
                function0 = null;
            }
            return actionBar.OLrzqt(function1, function0);
        }

        public final C14848dtG OLrzqt(Function1<? super java.lang.Boolean, Unit> function1, Function0<Unit> function0) {
            C14848dtG c14848dtG = new C14848dtG();
            c14848dtG.copydefault = function1;
            c14848dtG.KWHzl = function0;
            return c14848dtG;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.LayoutInflater.from(getContext()).inflate(dLX.Fragment.EZpvd, (android.view.ViewGroup) constraintLayout, true);
        this.EZpvd = (wYK) constraintLayout.findViewById(dLX.Application.hDKMBd);
        android.widget.TextView textView = (android.widget.TextView) constraintLayout.findViewById(dLX.Application.QXDzTk);
        Intrinsics.copydefault(textView);
        EZpvd(textView);
    }

    public final void EZpvd(android.widget.TextView textView) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(dLX.Dialog.DsrFlB);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(dLX.Dialog.heceqZ);
        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) strAYXKKw2, (java.lang.CharSequence) "{tos}", false, 2, (java.lang.Object) null)) {
            textView.setText(strAYXKKw2);
            return;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strAYXKKw2, "{tos}", 0, false, 6, (java.lang.Object) null);
        java.lang.String strReplace$default = C59449zhJ.replace$default(strAYXKKw2, "{tos}", strAYXKKw, false, 4, (java.lang.Object) null);
        java.lang.Integer numOLrzqt = OLrzqt(C52761wXj.ActionBar.OcIXYQ);
        int iIntValue = numOLrzqt != null ? numOLrzqt.intValue() : ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.dvKsVJ);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strReplace$default);
        spannableStringBuilder.setSpan(new TaskDescription(iIntValue, this), iIndexOf$default, strAYXKKw.length() + iIndexOf$default, 33);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: o.dtG$TaskDescription */
    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ C14848dtG copydefault;

        public TaskDescription(int i, C14848dtG c14848dtG) {
            this.AEQbTJ = i;
            this.copydefault = c14848dtG;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.setColor(this.AEQbTJ);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(dLX.Dialog.OTwTPd);
            WebActivity.TaskDescription taskDescription = WebActivity.Companion;
            android.content.Context contextRequireContext = this.copydefault.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            WebActivity.TaskDescription.openPage$default(taskDescription, contextRequireContext, BundleKt.bundleOf(C56390yDp.OLrzqt("url", strAYXKKw), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
        }
    }

    public final java.lang.Integer OLrzqt(int i) {
        Resources.Theme theme;
        android.util.TypedValue typedValue = new android.util.TypedValue();
        android.content.Context context = getContext();
        if (context == null || (theme = context.getTheme()) == null || !theme.resolveAttribute(i, typedValue, true)) {
            return null;
        }
        return java.lang.Integer.valueOf(typedValue.data);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(7);
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(dLX.Dialog.QKudOq);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new View.OnClickListener() { // from class: o.dtI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C14848dtG.OLrzqt(this.AEQbTJ, view);
                }
            });
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            c52794wYpCopydefault3.setContentDescription("web3_discover_home_dialog_primary_button");
        }
        wyf.setSecondaryText(C33070mpX.AYXKKw(dLX.Dialog.iRxXKY));
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new View.OnClickListener() { // from class: o.dtH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C14848dtG.AEQbTJ(this.copydefault, view);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OLrzqt(C14848dtG c14848dtG, android.view.View view) {
        boolean z;
        wYK wyk = c14848dtG.EZpvd;
        if (wyk != null) {
            z = wyk.isChecked();
        }
        Function1<? super java.lang.Boolean, Unit> function1 = c14848dtG.copydefault;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
        c14848dtG.dismissAllowingStateLoss();
    }

    public static final void AEQbTJ(C14848dtG c14848dtG, android.view.View view) {
        Function0<Unit> function0 = c14848dtG.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
        c14848dtG.dismissAllowingStateLoss();
    }
}

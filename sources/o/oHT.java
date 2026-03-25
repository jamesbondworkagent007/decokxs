package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class oHT extends oHW {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public Function0<Unit> AEQbTJ;
    public final boolean EZpvd = true;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.EZpvd;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oHT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ oHT newInstance$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str3 = null;
            }
            return actionBar.AEQbTJ(str, str2, str3);
        }

        public final oHT AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            oHT oht = new oHT();
            oht.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_TITLE", str), C56390yDp.OLrzqt("KEY_DESC", str2), C56390yDp.OLrzqt("KEY_PRIMARY_BUTTON_TITLE", str3)));
            return oht;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        nJK njkAEQbTJ = nJK.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(njkAEQbTJ, "");
        njkAEQbTJ.EZpvd.setImageResource(C52761wXj.TaskDescription.FdcJU);
        AppCompatTextView appCompatTextView = njkAEQbTJ.KWHzl;
        android.os.Bundle arguments = getArguments();
        appCompatTextView.setText(arguments != null ? arguments.getString("KEY_TITLE") : null);
        AppCompatTextView appCompatTextView2 = njkAEQbTJ.copydefault;
        android.os.Bundle arguments2 = getArguments();
        appCompatTextView2.setText(arguments2 != null ? arguments2.getString("KEY_DESC") : null);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(3);
        ViewGroup.LayoutParams layoutParams = wyf.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        android.content.Context context = wyf.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) layoutParams)).bottomMargin = C55298xhM.OLrzqt(16, context);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("KEY_PRIMARY_BUTTON_TITLE")) == null) {
            string = getString(C35399nuc.LoaderManager.zLjUOn);
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        wyf.setPrimaryText(string);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
        wyf.setType(7);
        wyf.setSecondaryText(getString(C35399nuc.LoaderManager.iwGUEr));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.oHR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    oHT.EZpvd(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void EZpvd(oHT oht, android.view.View view) {
        oht.dismissAllowingStateLoss();
        Function0<Unit> function0 = oht.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ oHT KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, oHT oht) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = oht;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
                Function0 function0 = this.KWHzl.copydefault;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}

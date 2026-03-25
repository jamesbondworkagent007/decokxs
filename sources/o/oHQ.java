package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class oHQ extends oHX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public wYF AEQbTJ;

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        nJG njgAEQbTJ = nJG.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(njgAEQbTJ, "");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        }
        marginLayoutParams.topMargin = C55298xhM.dp2px$default(8.0f, null, 1, null);
        marginLayoutParams.bottomMargin = C55298xhM.dp2px$default(24.0f, null, 1, null);
        marginLayoutParams.leftMargin = C55298xhM.dp2px$default(24.0f, null, 1, null);
        marginLayoutParams.rightMargin = C55298xhM.dp2px$default(24.0f, null, 1, null);
        constraintLayout.setLayoutParams(marginLayoutParams);
        android.widget.TextView textView = njgAEQbTJ.copydefault;
        android.os.Bundle arguments = getArguments();
        textView.setText(arguments != null ? arguments.getString("KEY_TITLE") : null);
        android.widget.TextView textView2 = njgAEQbTJ.OLrzqt;
        android.os.Bundle arguments2 = getArguments();
        textView2.setText(arguments2 != null ? arguments2.getString("KEY_DESC") : null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setCloseVisibility(false);
    }

    @Override // o.wXX
    public void onCreateFooter(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateFooter(constraintLayout);
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        wYF wyf = new wYF(context, null, 2, 0 == true ? 1 : 0);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(getString(C35399nuc.LoaderManager.getFieldNames));
        this.AEQbTJ = wyf;
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
        android.view.View view = this.AEQbTJ;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.topToTop = 0;
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        layoutParams.bottomToBottom = 0;
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(view, layoutParams);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oHQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final oHQ copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            oHQ ohq = new oHQ();
            ohq.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_TITLE", str), C56390yDp.OLrzqt("KEY_DESC", str2)));
            return ohq;
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ oHQ AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, oHQ ohq) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = ohq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.dismiss();
            }
        }
    }
}

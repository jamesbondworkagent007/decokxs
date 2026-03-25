package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tKK extends wXX {
    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(3);
        java.lang.String string = getString(C47501trL.Fragment.DcMfJKsgNvtZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iOLrzqt = C55298xhM.OLrzqt(24, contextRequireContext);
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        int iOLrzqt2 = C55298xhM.OLrzqt(8, contextRequireContext2);
        android.content.Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        int iOLrzqt3 = C55298xhM.OLrzqt(24, contextRequireContext3);
        android.content.Context contextRequireContext4 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
        constraintLayout.setPaddingRelative(iOLrzqt, iOLrzqt2, iOLrzqt3, C55298xhM.OLrzqt(24, contextRequireContext4));
        android.widget.TextView textView = new android.widget.TextView(requireContext());
        setStyle(C52761wXj.LoaderManager.KWHzl, getTheme());
        textView.setTextColor(ContextCompat.getColor(requireContext(), C52761wXj.Activity.Dmq));
        textView.setText(getString(C47501trL.Fragment.DcMfJKfNLfdT));
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.topToTop = 0;
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(textView, layoutParams);
    }
}

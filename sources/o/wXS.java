package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class wXS extends wXX {
    public abstract java.lang.CharSequence copydefault();

    public abstract void copydefault(@NotNull LinearLayoutCompat linearLayoutCompat);

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context context = constraintLayout.getContext();
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(context);
        linearLayoutCompat.setOrientation(1);
        constraintLayout.addView(linearLayoutCompat, new ConstraintLayout.LayoutParams(-1, -2));
        if (C33129mqd.OLrzqt(copydefault())) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(context);
            appCompatTextView.setTypeface(C55051xce.OLrzqt.valueOf());
            appCompatTextView.setText(copydefault());
            appCompatTextView.setTextColor(ContextCompat.getColor(context, C52761wXj.Activity.iOIMNp));
            appCompatTextView.setTextSize(12.0f);
            Intrinsics.copydefault(context);
            TextViewCompat.setLineHeight(appCompatTextView, C55298xhM.djBIcL(20.0f, context));
            appCompatTextView.setGravity(17);
            appCompatTextView.setPaddingRelative(C55298xhM.OLrzqt(40, context), C55298xhM.OLrzqt(20, context), C55298xhM.OLrzqt(40, context), C55298xhM.OLrzqt(12, context));
            linearLayoutCompat.addView(appCompatTextView);
        }
        copydefault(linearLayoutCompat);
    }

    public final android.widget.TextView AEQbTJ(@NotNull LinearLayoutCompat linearLayoutCompat, @NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(linearLayoutCompat, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayoutCompat.getContext());
        appCompatTextView.setTypeface(C55051xce.OLrzqt.OLrzqt());
        appCompatTextView.setTextSize(16.0f);
        appCompatTextView.setTextColor(ContextCompat.getColor(appCompatTextView.getContext(), C52761wXj.Activity.gLWkOL));
        android.content.Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(20, context);
        android.content.Context context2 = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iOLrzqt2 = C55298xhM.OLrzqt(15, context2);
        android.content.Context context3 = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        int iOLrzqt3 = C55298xhM.OLrzqt(20, context3);
        android.content.Context context4 = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        appCompatTextView.setPaddingRelative(iOLrzqt, iOLrzqt2, iOLrzqt3, C55298xhM.OLrzqt(15, context4));
        appCompatTextView.setGravity(17);
        appCompatTextView.setText(charSequence);
        linearLayoutCompat.addView(appCompatTextView);
        return appCompatTextView;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(17);
        C52794wYp c52794wYpOLrzqt = wyf.OLrzqt();
        if (c52794wYpOLrzqt != null) {
            c52794wYpOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.wXZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    wXS.OLrzqt(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void OLrzqt(wXS wxs, android.view.View view) {
        wxs.dismissAllowingStateLoss();
    }
}

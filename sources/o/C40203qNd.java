package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qNd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40203qNd extends AbstractC40515qYs<C41650qun, C42802rdL> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42802rdL AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42802rdL c42802rdLEZpvd = C42802rdL.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42802rdLEZpvd, "");
        return c42802rdLEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40515qYs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C42802rdL c42802rdL, int i, @NotNull C41650qun c41650qun) {
        Intrinsics.checkNotNullParameter(c42802rdL, "");
        Intrinsics.checkNotNullParameter(c41650qun, "");
        AppCompatImageView appCompatImageView = c42802rdL.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        java.lang.String strOLrzqt = c41650qun.OLrzqt();
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        C57659ymb.EZpvd(appCompatImageView, strOLrzqt, qZH.Activity.AhwBna);
        AppCompatTextView appCompatTextView = c42802rdL.KWHzl;
        android.content.Context context = c42802rdL.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        appCompatTextView.setText(C33069mpW.KWHzl(context, qZH.PendingIntent.DGUQLIDGUQLI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", c41650qun.AEQbTJ()))));
        AppCompatTextView appCompatTextView2 = c42802rdL.OLrzqt;
        android.content.Context context2 = c42802rdL.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        appCompatTextView2.setText(C33069mpW.KWHzl(context2, qZH.PendingIntent.gGvvIC, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("value1", c41650qun.AEQbTJ()), C56390yDp.OLrzqt("value2", c41650qun.EZpvd()))));
        ConstraintLayout root = c42802rdL.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, c42802rdL, c41650qun));
    }

    /* JADX INFO: renamed from: o.qNd$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C41650qun AEQbTJ;
        public final /* synthetic */ C42802rdL EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C42802rdL c42802rdL, C41650qun c41650qun) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c42802rdL;
            this.AEQbTJ = c41650qun;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ConstraintLayout root = this.EZpvd.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qPL qplAEQbTJ = qPS.AEQbTJ(root);
                if (qplAEQbTJ != null) {
                    qplAEQbTJ.OLrzqt(this.AEQbTJ.KWHzl().getInstId());
                }
            }
        }
    }
}

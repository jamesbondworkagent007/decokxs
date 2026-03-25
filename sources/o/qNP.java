package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qNP extends AbstractC40510qYn<C40243qOq, C42849reF> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C42849reF AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42849reF c42849reFOLrzqt = C42849reF.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42849reFOLrzqt, "");
        return c42849reFOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42849reF c42849reF, int i, @NotNull C40243qOq c40243qOq) {
        Intrinsics.checkNotNullParameter(c42849reF, "");
        Intrinsics.checkNotNullParameter(c40243qOq, "");
        if (c40243qOq.copydefault().size() == 1) {
            android.widget.LinearLayout root = c42849reF.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(0);
            AppCompatTextView appCompatTextView = c42849reF.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
            OptionsCategoryGroupVo optionsCategoryGroupVo = (OptionsCategoryGroupVo) CollectionsKt___CollectionsKt.AkhnZx(c40243qOq.copydefault(), 0);
            if (optionsCategoryGroupVo != null) {
                AppCompatTextView appCompatTextView2 = c42849reF.OLrzqt;
                appCompatTextView2.setOnClickListener(new Activity(appCompatTextView2, 1000L, c42849reF, optionsCategoryGroupVo));
                c42849reF.OLrzqt.setText(optionsCategoryGroupVo.OLrzqt() + " " + C33070mpX.AYXKKw(qZH.PendingIntent.config));
            }
            AppCompatTextView appCompatTextView3 = c42849reF.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            appCompatTextView3.setVisibility(8);
            AppCompatTextView appCompatTextView4 = c42849reF.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
            appCompatTextView4.setVisibility(8);
            return;
        }
        if (c40243qOq.copydefault().size() >= 2) {
            android.widget.LinearLayout root2 = c42849reF.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            root2.setVisibility(0);
            AppCompatTextView appCompatTextView5 = c42849reF.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView5, "");
            appCompatTextView5.setVisibility(8);
            c42849reF.OLrzqt.setText(C33070mpX.AYXKKw(qZH.PendingIntent.config));
            c42849reF.OLrzqt.setOnClickListener(null);
            AppCompatTextView appCompatTextView6 = c42849reF.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "");
            appCompatTextView6.setVisibility(0);
            AppCompatTextView appCompatTextView7 = c42849reF.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView7, "");
            appCompatTextView7.setVisibility(0);
            OptionsCategoryGroupVo optionsCategoryGroupVo2 = (OptionsCategoryGroupVo) CollectionsKt___CollectionsKt.AkhnZx(c40243qOq.copydefault(), 0);
            if (optionsCategoryGroupVo2 != null) {
                AppCompatTextView appCompatTextView8 = c42849reF.KWHzl;
                appCompatTextView8.setOnClickListener(new Application(appCompatTextView8, 1000L, c42849reF, optionsCategoryGroupVo2));
                c42849reF.KWHzl.setText(optionsCategoryGroupVo2.OLrzqt() + " " + C33070mpX.AYXKKw(qZH.PendingIntent.config));
            }
            OptionsCategoryGroupVo optionsCategoryGroupVo3 = (OptionsCategoryGroupVo) CollectionsKt___CollectionsKt.AkhnZx(c40243qOq.copydefault(), 1);
            if (optionsCategoryGroupVo3 != null) {
                AppCompatTextView appCompatTextView9 = c42849reF.EZpvd;
                appCompatTextView9.setOnClickListener(new TaskDescription(appCompatTextView9, 1000L, c42849reF, optionsCategoryGroupVo3));
                c42849reF.EZpvd.setText(optionsCategoryGroupVo3.OLrzqt() + " " + C33070mpX.AYXKKw(qZH.PendingIntent.config));
                return;
            }
            return;
        }
        android.widget.LinearLayout root3 = c42849reF.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "");
        root3.setVisibility(8);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C42849reF AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ OptionsCategoryGroupVo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C42849reF c42849reF, OptionsCategoryGroupVo optionsCategoryGroupVo) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c42849reF;
            this.copydefault = optionsCategoryGroupVo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.widget.LinearLayout root = this.AEQbTJ.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qPL qplAEQbTJ = qPS.AEQbTJ(root);
                if (qplAEQbTJ != null) {
                    qplAEQbTJ.OLrzqt(this.copydefault.AEQbTJ());
                }
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ OptionsCategoryGroupVo EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C42849reF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C42849reF c42849reF, OptionsCategoryGroupVo optionsCategoryGroupVo) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c42849reF;
            this.EZpvd = optionsCategoryGroupVo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.widget.LinearLayout root = this.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qPL qplAEQbTJ = qPS.AEQbTJ(root);
                if (qplAEQbTJ != null) {
                    qplAEQbTJ.OLrzqt(this.EZpvd.AEQbTJ());
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ OptionsCategoryGroupVo AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C42849reF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C42849reF c42849reF, OptionsCategoryGroupVo optionsCategoryGroupVo) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c42849reF;
            this.AEQbTJ = optionsCategoryGroupVo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.widget.LinearLayout root = this.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                qPL qplAEQbTJ = qPS.AEQbTJ(root);
                if (qplAEQbTJ != null) {
                    qplAEQbTJ.OLrzqt(this.AEQbTJ.AEQbTJ());
                }
            }
        }
    }
}

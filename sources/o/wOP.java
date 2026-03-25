package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wOP extends AbstractC59533zio<wOQ, Activity> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uMF umfOLrzqt = uMF.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(umfOLrzqt, "");
        return new Activity(this, umfOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull wOQ woq) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(woq, "");
        uMF umfEZpvd = activity.EZpvd();
        umfEZpvd.OLrzqt.setText(pTA.format$default(new Date(C33129mqd.valueOf(woq.AEQbTJ())), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null));
        android.widget.TextView textView = umfEZpvd.EZpvd;
        textView.setText(pTB.formatICUNumber$default(C33129mqd.EZpvd(woq.OLrzqt()), null, C38307pTy.Companion.AEQbTJ(woq.KWHzl()), DisplaySign.EXCEPT_ZERO, null, 9, null) + " " + woq.copydefault());
        textView.setTextColor(C56033xvF.OLrzqt((java.lang.Object) woq.OLrzqt()));
    }

    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ wOP OLrzqt;
        public final uMF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uMF EZpvd() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull wOP wop, uMF umf) {
            super(umf.getRoot());
            Intrinsics.checkNotNullParameter(umf, "");
            this.OLrzqt = wop;
            this.copydefault = umf;
        }
    }
}

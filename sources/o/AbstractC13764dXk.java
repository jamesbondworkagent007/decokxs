package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.wallet.approve.ApproveListItem;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dXk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13764dXk extends AbstractC59533zio<ApproveListItem, RecyclerView.ViewHolder> {
    public final boolean copydefault;

    public abstract void KWHzl(@NotNull ApproveListItem approveListItem);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull ApproveListItem approveListItem) {
        Intrinsics.checkNotNullParameter(approveListItem, "");
    }

    public AbstractC13764dXk(boolean z) {
        this.copydefault = z;
    }

    /* JADX INFO: renamed from: o.dXk$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public ActionBar(android.view.View view) {
            super(view);
        }
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new ActionBar(layoutInflater.inflate(C13754dXa.TaskDescription.init, viewGroup, false));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull ApproveListItem approveListItem) {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C52794wYp c52794wYp3;
        java.lang.String string;
        android.widget.ImageView imageView;
        C52794wYp c52794wYp4;
        C55251xgS c55251xgS;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        java.lang.String strDbNXlk;
        android.widget.ImageView imageView2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(approveListItem, "");
        AbstractC16708eoy abstractC16708eoy = (AbstractC16708eoy) DataBindingUtil.bind(viewHolder.itemView);
        if (abstractC16708eoy != null && (imageView2 = abstractC16708eoy.copydefault) != null) {
            java.lang.String strAYXKKw = approveListItem.AYXKKw();
            OLrzqt(imageView2, strAYXKKw != null ? strAYXKKw : "", C13754dXa.Activity.aKErDB);
        }
        if (abstractC16708eoy != null && (textView2 = abstractC16708eoy.djBIcL) != null) {
            if (!this.copydefault || approveListItem.copydefault() == 1) {
                strDbNXlk = approveListItem.DbNXlk();
            } else {
                strDbNXlk = approveListItem.DbNXlk() + " (" + approveListItem.copydefault() + ")";
            }
            textView2.setText(strDbNXlk);
        }
        if (abstractC16708eoy != null && (textView = abstractC16708eoy.AYXKKw) != null) {
            textView.setText(approveListItem.gEmmrt());
        }
        if (abstractC16708eoy != null && (c55251xgS = abstractC16708eoy.EZpvd) != null) {
            c55251xgS.setVisibility(8);
        }
        if (abstractC16708eoy != null && (c52794wYp4 = abstractC16708eoy.OLrzqt) != null) {
            c52794wYp4.setVisibility(this.copydefault ? 0 : 8);
        }
        if (abstractC16708eoy != null && (imageView = abstractC16708eoy.AEQbTJ) != null) {
            imageView.setVisibility(true ^ this.copydefault ? 0 : 8);
        }
        if (abstractC16708eoy != null && (c52794wYp3 = abstractC16708eoy.OLrzqt) != null) {
            if (Intrinsics.EZpvd((java.lang.Object) approveListItem.values(), (java.lang.Object) "1")) {
                string = viewHolder.itemView.getContext().getString(C13754dXa.FragmentManager.AlertController3);
            } else {
                string = viewHolder.itemView.getContext().getString(C13754dXa.FragmentManager.DjwCMv);
            }
            c52794wYp3.setText(string);
        }
        android.view.View view = viewHolder.itemView;
        view.setOnClickListener(new Application(view, 1000L, this, approveListItem));
        if (abstractC16708eoy != null && (c52794wYp2 = abstractC16708eoy.OLrzqt) != null) {
            c52794wYp2.setEnabled(Intrinsics.EZpvd((java.lang.Object) approveListItem.values(), (java.lang.Object) "1"));
        }
        if (abstractC16708eoy == null || (c52794wYp = abstractC16708eoy.OLrzqt) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, approveListItem, this));
    }

    public final void OLrzqt(android.widget.ImageView imageView, java.lang.String str, int i) {
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.KWHzl(imageView).EZpvd(str);
        android.content.Context context = imageView.getContext();
        int i2 = C32113mPz.ActionBar.fJNWhG;
        android.content.Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c5335NtEZpvd.EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(context, 0.5f, C33070mpX.OLrzqt(i2, context2), false, 8, null)).OLrzqt((RX<?>) new C5448Sc().AEQbTJ(i).copydefault(i).KWHzl(i)).EZpvd(imageView);
    }

    /* JADX INFO: renamed from: o.dXk$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ AbstractC13764dXk EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ApproveListItem copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, AbstractC13764dXk abstractC13764dXk, ApproveListItem approveListItem) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = abstractC13764dXk;
            this.copydefault = approveListItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.KWHzl(this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.dXk$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ApproveListItem EZpvd;
        public final /* synthetic */ AbstractC13764dXk OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ApproveListItem approveListItem, AbstractC13764dXk abstractC13764dXk) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = approveListItem;
            this.OLrzqt = abstractC13764dXk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (Intrinsics.EZpvd((java.lang.Object) this.EZpvd.values(), (java.lang.Object) "1")) {
                    this.OLrzqt.copydefault(this.EZpvd);
                }
            }
        }
    }
}

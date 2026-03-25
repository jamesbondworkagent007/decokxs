package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.approve.ApproveListItem;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dXH extends AbstractC59533zio<ApproveListItem, RecyclerView.ViewHolder> {
    public final boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull ApproveListItem approveListItem) {
        Intrinsics.checkNotNullParameter(approveListItem, "");
    }

    public abstract void copydefault(@NotNull ApproveListItem approveListItem);

    public dXH(boolean z) {
        this.KWHzl = z;
    }

    public static final class Application extends RecyclerView.ViewHolder {
        public Application(android.view.View view) {
            super(view);
        }
    }

    @Override // o.AbstractC59533zio
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return new Application(layoutInflater.inflate(C13754dXa.TaskDescription.hOMIpD, viewGroup, false));
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull final ApproveListItem approveListItem) {
        wYK wyk;
        wYK wyk2;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        java.lang.String strDbNXlk;
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(approveListItem, "");
        AbstractC16709eoz abstractC16709eoz = (AbstractC16709eoz) DataBindingUtil.bind(viewHolder.itemView);
        if (abstractC16709eoz != null && (imageView = abstractC16709eoz.KWHzl) != null) {
            java.lang.String strAYXKKw = approveListItem.AYXKKw();
            C57659ymb.KWHzl(imageView, strAYXKKw != null ? strAYXKKw : "", C13754dXa.Activity.aKErDB);
        }
        if (abstractC16709eoz != null && (textView2 = abstractC16709eoz.OLrzqt) != null) {
            if (!this.KWHzl || approveListItem.copydefault() == 1) {
                strDbNXlk = approveListItem.DbNXlk();
            } else {
                strDbNXlk = approveListItem.DbNXlk() + " (" + approveListItem.copydefault() + ")";
            }
            textView2.setText(strDbNXlk);
        }
        if (abstractC16709eoz != null && (textView = abstractC16709eoz.EZpvd) != null) {
            textView.setText(approveListItem.gEmmrt());
        }
        if (abstractC16709eoz != null && (wyk2 = abstractC16709eoz.copydefault) != null) {
            wyk2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.dXL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    dXH.EZpvd(approveListItem, this, compoundButton, z);
                }
            });
        }
        if (abstractC16709eoz != null && (wyk = abstractC16709eoz.copydefault) != null) {
            wyk.setChecked(approveListItem.ejfBZ());
        }
        android.view.View view = viewHolder.itemView;
        view.setOnClickListener(new Activity(view, 1000L, this, approveListItem));
    }

    public static final void EZpvd(ApproveListItem approveListItem, dXH dxh, android.widget.CompoundButton compoundButton, boolean z) {
        approveListItem.OLrzqt(z);
        dxh.KWHzl(approveListItem);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ dXH OLrzqt;
        public final /* synthetic */ ApproveListItem copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, dXH dxh, ApproveListItem approveListItem) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = dxh;
            this.copydefault = approveListItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.copydefault(this.copydefault);
            }
        }
    }
}

package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jDB extends RecyclerView.Adapter<Activity> {
    public final java.util.ArrayList<java.lang.String> AEQbTJ;
    public final Function0<Unit> EZpvd;
    public final java.util.List<jDG> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.String> copydefault() {
        return this.AEQbTJ;
    }

    public jDB(@NotNull java.util.List<jDG> list, @NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = list;
        this.AEQbTJ = arrayList;
        this.EZpvd = function0;
    }

    public final class Activity extends RecyclerView.ViewHolder {
        public final C21628hGk KWHzl;
        public final /* synthetic */ jDB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21628hGk EZpvd() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull jDB jdb, C21628hGk c21628hGk) {
            super(c21628hGk.getRoot());
            Intrinsics.checkNotNullParameter(c21628hGk, "");
            this.copydefault = jdb;
            this.KWHzl = c21628hGk;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21628hGk c21628hGkOLrzqt = C21628hGk.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21628hGkOLrzqt, "");
        return new Activity(this, c21628hGkOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        final jDG jdg = this.OLrzqt.get(activity.getBindingAdapterPosition());
        final C21628hGk c21628hGkEZpvd = activity.EZpvd();
        OKRegularCell oKRegularCell = c21628hGkEZpvd.AEQbTJ;
        android.content.Context context = oKRegularCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        oKRegularCell.setTitle(C33069mpW.KWHzl(context, C23274hvD.Fragment.QfJbVf, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("category", jdg.EZpvd()), C56390yDp.OLrzqt("num", pTB.formatICUNumber$default(java.lang.Integer.valueOf(jdg.KWHzl()), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null)))));
        oKRegularCell.EZpvd().setTypeface(android.graphics.Typeface.create(ResourcesCompat.getFont(oKRegularCell.getContext(), C52761wXj.Dialog.valueOf), 0));
        oKRegularCell.EZpvd().setTextSize(16.0f);
        if (this.AEQbTJ.contains(jdg.copydefault())) {
            c21628hGkEZpvd.KWHzl.setImageDrawable(ContextCompat.getDrawable(oKRegularCell.getContext(), C52761wXj.TaskDescription.fVjYLc));
        } else {
            c21628hGkEZpvd.KWHzl.setImageDrawable(ContextCompat.getDrawable(oKRegularCell.getContext(), C52761wXj.TaskDescription.dbwnZN));
        }
        c21628hGkEZpvd.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.jDD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                jDB.AEQbTJ(this.KWHzl, jdg, c21628hGkEZpvd, view);
            }
        });
    }

    public static final void AEQbTJ(jDB jdb, jDG jdg, C21628hGk c21628hGk, android.view.View view) {
        if (jdb.AEQbTJ.contains(jdg.copydefault())) {
            jdb.AEQbTJ.remove(jdg.copydefault());
            c21628hGk.KWHzl.setImageDrawable(ContextCompat.getDrawable(c21628hGk.AEQbTJ.getContext(), C52761wXj.TaskDescription.dbwnZN));
        } else {
            jdb.AEQbTJ.add(jdg.copydefault());
            c21628hGk.KWHzl.setImageDrawable(ContextCompat.getDrawable(c21628hGk.AEQbTJ.getContext(), C52761wXj.TaskDescription.fVjYLc));
        }
        jdb.EZpvd.invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.OLrzqt.size();
    }
}

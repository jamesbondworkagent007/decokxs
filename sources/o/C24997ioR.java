package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ioR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24997ioR extends RecyclerView.Adapter<ActionBar> {
    public final java.util.List<java.lang.String> AEQbTJ;
    public final Function0<Unit> OLrzqt;

    public C24997ioR(@NotNull java.util.List<java.lang.String> list, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C23417hxo c23417hxoEZpvd = C23417hxo.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23417hxoEZpvd, "");
        return new ActionBar(c23417hxoEZpvd);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return (this.AEQbTJ.size() * 2) - 1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (i % 2 == 0) {
            actionBar.AEQbTJ(this.AEQbTJ.get(i / 2));
        } else {
            actionBar.copydefault();
        }
        android.widget.ImageView root = actionBar.OLrzqt().getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, this));
    }

    /* JADX INFO: renamed from: o.ioR$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final C23417hxo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C23417hxo OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C23417hxo c23417hxo) {
            super(c23417hxo.getRoot());
            Intrinsics.checkNotNullParameter(c23417hxo, "");
            this.OLrzqt = c23417hxo;
        }

        public final void AEQbTJ(@NotNull java.lang.String str) {
            android.graphics.drawable.Drawable drawable;
            android.graphics.drawable.Drawable drawable2;
            Intrinsics.checkNotNullParameter(str, "");
            android.widget.ImageView root = this.OLrzqt.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.gasjUx);
            if (drawableKWHzl != null) {
                drawableKWHzl.setTint(C25382ivf.KWHzl(C23274hvD.StateListAnimator.copydefault));
                Unit unit = Unit.INSTANCE;
                drawable = drawableKWHzl;
            } else {
                drawable = null;
            }
            android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.gasjUx);
            if (drawableKWHzl2 != null) {
                drawableKWHzl2.setTint(C25382ivf.KWHzl(C23274hvD.StateListAnimator.copydefault));
                Unit unit2 = Unit.INSTANCE;
                drawable2 = drawableKWHzl2;
            } else {
                drawable2 = null;
            }
            C25386ivj.KWHzl(root, str, new C25385ivi(drawable, drawable2, 0.0f, 0, 12, null));
        }

        public final void copydefault() {
            android.widget.ImageView root = this.OLrzqt.getRoot();
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.onProviderDisabled);
            Intrinsics.copydefault(drawableKWHzl);
            drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
            root.setImageDrawable(drawableKWHzl);
        }
    }

    /* JADX INFO: renamed from: o.ioR$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C24997ioR OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C24997ioR c24997ioR) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c24997ioR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}

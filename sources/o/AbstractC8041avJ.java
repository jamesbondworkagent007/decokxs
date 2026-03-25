package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: o.avJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8041avJ<T> extends RecyclerView.Adapter<AbstractC8033avB> {
    public android.content.Context AEQbTJ;
    public java.util.List<T> AYXKKw;
    public InterfaceC8040avI EZpvd;
    public Activity KWHzl;
    public StateListAnimator gEmmrt;
    public RecyclerView valueOf;
    public java.util.ArrayList<TaskDescription> copydefault = new java.util.ArrayList<>();
    public java.util.ArrayList<TaskDescription> OLrzqt = new java.util.ArrayList<>();
    public final java.lang.Object AhwBna = new java.lang.Object();
    public boolean djBIcL = true;

    /* JADX INFO: renamed from: o.avJ$Activity */
    public interface Activity {
        void EZpvd(int i);
    }

    /* JADX INFO: renamed from: o.avJ$StateListAnimator */
    public interface StateListAnimator {
        boolean AEQbTJ(int i);
    }

    /* JADX INFO: renamed from: o.avJ$TaskDescription */
    public interface TaskDescription {
        void AEQbTJ(android.view.View view);

        android.view.View copydefault(android.view.ViewGroup viewGroup);
    }

    public abstract AbstractC8033avB KWHzl(android.view.ViewGroup viewGroup, int i);

    public int OLrzqt(int i) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(Activity activity) {
        this.KWHzl = activity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.EZpvd != null;
    }

    public AbstractC8041avJ(android.content.Context context) {
        KWHzl(context, new java.util.ArrayList());
    }

    public final void KWHzl(android.content.Context context, java.util.List<T> list) {
        this.AEQbTJ = context;
        this.AYXKKw = new java.util.ArrayList(list);
    }

    public int KWHzl() {
        return this.copydefault.size();
    }

    public int copydefault() {
        return this.OLrzqt.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.valueOf = recyclerView;
        registerAdapterDataObserver(new C8038avG(recyclerView));
    }

    public void EZpvd(T t) {
        InterfaceC8040avI interfaceC8040avI = this.EZpvd;
        if (interfaceC8040avI != null) {
            interfaceC8040avI.copydefault(t == null ? 0 : 1);
        }
        if (t != null) {
            synchronized (this.AhwBna) {
                this.AYXKKw.add(t);
            }
        }
        if (this.djBIcL) {
            notifyItemInserted(this.copydefault.size() + EZpvd());
        }
        EZpvd("add notifyItemInserted " + (this.copydefault.size() + EZpvd()));
    }

    public void OLrzqt(java.util.Collection<? extends T> collection) {
        InterfaceC8040avI interfaceC8040avI = this.EZpvd;
        if (interfaceC8040avI != null) {
            interfaceC8040avI.copydefault(collection == null ? 0 : collection.size());
        }
        if (collection != null && collection.size() != 0) {
            synchronized (this.AhwBna) {
                this.AYXKKw.addAll(collection);
            }
        }
        int size = collection != null ? collection.size() : 0;
        if (this.djBIcL) {
            notifyItemRangeInserted((this.copydefault.size() + EZpvd()) - size, size);
        }
        EZpvd("addAll notifyItemRangeInserted " + ((this.copydefault.size() + EZpvd()) - size) + "," + size);
    }

    public void copydefault(int i) {
        synchronized (this.AhwBna) {
            this.AYXKKw.remove(i);
        }
        if (this.djBIcL) {
            notifyItemRemoved(this.copydefault.size() + i);
        }
        EZpvd("remove notifyItemRemoved " + (this.copydefault.size() + i));
    }

    public void OLrzqt() {
        int size = this.AYXKKw.size();
        InterfaceC8040avI interfaceC8040avI = this.EZpvd;
        if (interfaceC8040avI != null) {
            interfaceC8040avI.KWHzl();
        }
        synchronized (this.AhwBna) {
            this.AYXKKw.clear();
        }
        if (this.djBIcL) {
            notifyDataSetChanged();
        }
        EZpvd("clear notifyItemRangeRemoved " + this.copydefault.size() + "," + size);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @java.lang.Deprecated
    public final int getItemCount() {
        return this.AYXKKw.size() + this.copydefault.size() + this.OLrzqt.size();
    }

    public int EZpvd() {
        return this.AYXKKw.size();
    }

    public final android.view.View copydefault(android.view.ViewGroup viewGroup, int i) {
        StaggeredGridLayoutManager.LayoutParams layoutParams;
        StaggeredGridLayoutManager.LayoutParams layoutParams2;
        for (TaskDescription taskDescription : this.copydefault) {
            if (taskDescription.hashCode() == i) {
                android.view.View viewCopydefault = taskDescription.copydefault(viewGroup);
                if (viewCopydefault.getLayoutParams() != null) {
                    layoutParams2 = new StaggeredGridLayoutManager.LayoutParams(viewCopydefault.getLayoutParams());
                } else {
                    layoutParams2 = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
                }
                layoutParams2.setFullSpan(true);
                viewCopydefault.setLayoutParams(layoutParams2);
                return viewCopydefault;
            }
        }
        for (TaskDescription taskDescription2 : this.OLrzqt) {
            if (taskDescription2.hashCode() == i) {
                android.view.View viewCopydefault2 = taskDescription2.copydefault(viewGroup);
                if (viewCopydefault2.getLayoutParams() != null) {
                    layoutParams = new StaggeredGridLayoutManager.LayoutParams(viewCopydefault2.getLayoutParams());
                } else {
                    layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
                }
                layoutParams.setFullSpan(true);
                viewCopydefault2.setLayoutParams(layoutParams);
                return viewCopydefault2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public final AbstractC8033avB onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        android.view.View viewCopydefault = copydefault(viewGroup, i);
        if (viewCopydefault != null) {
            return new Application(viewCopydefault);
        }
        final AbstractC8033avB abstractC8033avBKWHzl = KWHzl(viewGroup, i);
        if (this.KWHzl != null) {
            abstractC8033avBKWHzl.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.avJ.2
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    AbstractC8041avJ.this.KWHzl.EZpvd(abstractC8033avBKWHzl.getAdapterPosition() - AbstractC8041avJ.this.copydefault.size());
                }
            });
        }
        if (this.gEmmrt != null) {
            abstractC8033avBKWHzl.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.avJ.4
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(android.view.View view) {
                    return AbstractC8041avJ.this.gEmmrt.AEQbTJ(abstractC8033avBKWHzl.getAdapterPosition() - AbstractC8041avJ.this.copydefault.size());
                }
            });
        }
        return abstractC8033avBKWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(AbstractC8033avB abstractC8033avB, int i) {
        abstractC8033avB.itemView.setId(i);
        if (this.copydefault.size() != 0 && i < this.copydefault.size()) {
            this.copydefault.get(i).AEQbTJ(abstractC8033avB.itemView);
            return;
        }
        int size = (i - this.copydefault.size()) - this.AYXKKw.size();
        if (this.OLrzqt.size() != 0 && size >= 0) {
            this.OLrzqt.get(size).AEQbTJ(abstractC8033avB.itemView);
        } else {
            KWHzl(abstractC8033avB, i - this.copydefault.size());
        }
    }

    public void KWHzl(AbstractC8033avB abstractC8033avB, int i) {
        abstractC8033avB.OLrzqt(AEQbTJ(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @java.lang.Deprecated
    public final int getItemViewType(int i) {
        int size;
        if (this.copydefault.size() != 0 && i < this.copydefault.size()) {
            return this.copydefault.get(i).hashCode();
        }
        if (this.OLrzqt.size() != 0 && (size = (i - this.copydefault.size()) - this.AYXKKw.size()) >= 0) {
            return this.OLrzqt.get(size).hashCode();
        }
        return OLrzqt(i - this.copydefault.size());
    }

    public java.util.List<T> AEQbTJ() {
        return new java.util.ArrayList(this.AYXKKw);
    }

    public T AEQbTJ(int i) {
        return this.AYXKKw.get(i);
    }

    /* JADX INFO: renamed from: o.avJ$Application */
    public class Application extends AbstractC8033avB {
        public Application(android.view.View view) {
            super(view);
        }
    }

    public static void EZpvd(java.lang.String str) {
        boolean z = C8037avF.EZpvd;
    }
}

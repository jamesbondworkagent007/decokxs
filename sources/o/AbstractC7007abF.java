package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.Objects;
import o.AbstractC7007abF.StateListAnimator;
import o.AbstractC7007abF.TaskDescription;

/* JADX INFO: renamed from: o.abF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7007abF<GroupBean extends StateListAnimator<ChildBean>, ChildBean, GroupViewHolder extends TaskDescription, ChildViewHolder extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final java.lang.Object EZpvd = new java.lang.Object();
    public InterfaceC7008abH AEQbTJ;
    public Application<GroupBean, ChildBean> AYXKKw;
    public boolean AhwBna;
    public java.util.Set<GroupBean> KWHzl = new java.util.HashSet();
    public boolean OLrzqt;
    public InterfaceC7008abH copydefault;

    /* JADX INFO: renamed from: o.abF$Application */
    public interface Application<GroupBean extends StateListAnimator, ChildBean> {
        boolean AEQbTJ(GroupBean groupbean, boolean z);

        void EZpvd(GroupBean groupbean);

        void OLrzqt(GroupBean groupbean, ChildBean childbean);

        boolean copydefault(GroupBean groupbean);
    }

    /* JADX INFO: renamed from: o.abF$StateListAnimator */
    public interface StateListAnimator<ChildBean> {
        ChildBean AEQbTJ(int i);

        boolean EZpvd();

        int OLrzqt();
    }

    public int AEQbTJ(GroupBean groupbean, ChildBean childbean) {
        return 0;
    }

    public abstract int EZpvd();

    public abstract void EZpvd(ChildViewHolder childviewholder, GroupBean groupbean, ChildBean childbean);

    public abstract GroupBean KWHzl(int i);

    public abstract void KWHzl(GroupViewHolder groupviewholder, GroupBean groupbean, boolean z);

    public abstract ChildViewHolder OLrzqt(android.view.ViewGroup viewGroup, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Application<GroupBean, ChildBean> application) {
        this.AYXKKw = application;
    }

    public int copydefault(GroupBean groupbean) {
        return 0;
    }

    public abstract GroupViewHolder copydefault(android.view.ViewGroup viewGroup, int i);

    public AbstractC7007abF() {
        registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: o.abF.5
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i = 0; i < AbstractC7007abF.this.EZpvd(); i++) {
                    StateListAnimator stateListAnimatorKWHzl = AbstractC7007abF.this.KWHzl(i);
                    if (AbstractC7007abF.this.KWHzl.contains(stateListAnimatorKWHzl)) {
                        arrayList.add(stateListAnimatorKWHzl);
                    }
                }
                AbstractC7007abF.this.KWHzl.clear();
                AbstractC7007abF.this.KWHzl.addAll(arrayList);
            }
        });
    }

    public void copydefault(GroupViewHolder groupviewholder, GroupBean groupbean, boolean z, java.util.List<java.lang.Object> list) {
        KWHzl(groupviewholder, groupbean, z);
    }

    public void OLrzqt(ChildViewHolder childviewholder, GroupBean groupbean, ChildBean childbean, java.util.List<java.lang.Object> list) {
        EZpvd(childviewholder, groupbean, childbean);
    }

    public final boolean EZpvd(GroupBean groupbean) {
        return this.KWHzl.contains(groupbean);
    }

    public final boolean KWHzl(GroupBean groupbean) {
        if (!groupbean.EZpvd() || EZpvd(groupbean)) {
            return false;
        }
        this.KWHzl.add(groupbean);
        int iEZpvd = EZpvd(OLrzqt(groupbean));
        notifyItemRangeInserted(iEZpvd + 1, groupbean.OLrzqt());
        notifyItemChanged(iEZpvd, EZpvd);
        return true;
    }

    public final boolean AEQbTJ(GroupBean groupbean) {
        if (!this.KWHzl.remove(groupbean)) {
            return false;
        }
        int iEZpvd = EZpvd(OLrzqt(groupbean));
        notifyItemRangeRemoved(iEZpvd + 1, groupbean.OLrzqt());
        notifyItemChanged(iEZpvd, EZpvd);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int iEZpvd = EZpvd();
        if (iEZpvd == 0 && this.AEQbTJ != null) {
            this.OLrzqt = true;
            return (this.copydefault == null || !this.AhwBna) ? 1 : 2;
        }
        this.OLrzqt = false;
        for (GroupBean groupbean : this.KWHzl) {
            if (OLrzqt(groupbean) < 0) {
                Objects.toString(groupbean);
            } else {
                iEZpvd += groupbean.OLrzqt();
            }
        }
        return this.copydefault != null ? iEZpvd + 1 : iEZpvd;
    }

    public final int EZpvd(int i) {
        int iOLrzqt = i;
        for (GroupBean groupbean : this.KWHzl) {
            if (OLrzqt(groupbean) >= 0 && OLrzqt(groupbean) < i) {
                iOLrzqt += groupbean.OLrzqt();
            }
        }
        return this.copydefault != null ? iOLrzqt + 1 : iOLrzqt;
    }

    public final int OLrzqt(@androidx.annotation.NonNull GroupBean groupbean) {
        for (int i = 0; i < EZpvd(); i++) {
            if (groupbean.equals(KWHzl(i))) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.abF<GroupBean extends o.abF$StateListAnimator<ChildBean>, ChildBean, GroupViewHolder extends o.abF$TaskDescription, ChildViewHolder extends androidx.recyclerview.widget.RecyclerView$ViewHolder> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int iAEQbTJ;
        int i2;
        if (this.OLrzqt) {
            return (i == 0 && this.AhwBna && this.copydefault != null) ? 536870912 : 1073741824;
        }
        if (i == 0 && this.copydefault != null) {
            return 536870912;
        }
        int[] iArrOLrzqt = OLrzqt(i);
        StateListAnimator stateListAnimatorKWHzl = KWHzl(iArrOLrzqt[0]);
        int i3 = iArrOLrzqt[1];
        if (i3 < 0) {
            iAEQbTJ = copydefault(stateListAnimatorKWHzl);
            if ((iAEQbTJ & 2013265920) != 0) {
                throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.getDefault(), "GroupType [%d] conflits with MASK [%d]", java.lang.Integer.valueOf(iAEQbTJ), 2013265920));
            }
            i2 = 268435456;
        } else {
            iAEQbTJ = AEQbTJ(stateListAnimatorKWHzl, stateListAnimatorKWHzl.AEQbTJ(i3));
            if ((iAEQbTJ & 2013265920) != 0) {
                throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.getDefault(), "ChildType [%d] conflits with MASK [%d]", java.lang.Integer.valueOf(iAEQbTJ), 2013265920));
            }
            i2 = 134217728;
        }
        return iAEQbTJ | i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        int i2 = 2013265920 & i;
        if (i2 == 134217728) {
            return OLrzqt(viewGroup, i ^ 134217728);
        }
        if (i2 == 268435456) {
            return copydefault(viewGroup, i ^ 268435456);
        }
        if (i2 == 536870912) {
            return this.copydefault.EZpvd(viewGroup);
        }
        if (i2 == 1073741824) {
            return this.AEQbTJ.EZpvd(viewGroup);
        }
        throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.getDefault(), "Illegal view type : viewType[%d]", java.lang.Integer.valueOf(i)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder(viewHolder, i, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.abF<GroupBean extends o.abF$StateListAnimator<ChildBean>, ChildBean, GroupViewHolder extends o.abF$TaskDescription, ChildViewHolder extends androidx.recyclerview.widget.RecyclerView$ViewHolder> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, java.util.List<java.lang.Object> list) {
        int itemViewType = viewHolder.getItemViewType() & 2013265920;
        if (itemViewType == 134217728) {
            int[] iArrOLrzqt = OLrzqt(i);
            StateListAnimator stateListAnimatorKWHzl = KWHzl(iArrOLrzqt[0]);
            AEQbTJ(viewHolder, stateListAnimatorKWHzl, stateListAnimatorKWHzl.AEQbTJ(iArrOLrzqt[1]), list);
        } else {
            if (itemViewType == 268435456) {
                copydefault((TaskDescription) viewHolder, KWHzl(OLrzqt(i)[0]), list);
                return;
            }
            if (itemViewType == 536870912) {
                this.copydefault.OLrzqt(viewHolder);
            } else if (itemViewType == 1073741824) {
                this.AEQbTJ.OLrzqt(viewHolder);
            } else {
                throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.getDefault(), "Illegal view type : position [%d] ,itemViewType[%d]", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(viewHolder.getItemViewType())));
            }
        }
    }

    public void copydefault(final GroupViewHolder groupviewholder, final GroupBean groupbean, java.util.List<java.lang.Object> list) {
        if (list != null && list.size() != 0) {
            if (list.contains(EZpvd)) {
                groupviewholder.KWHzl(this, EZpvd(groupbean));
                if (list.size() == 1) {
                    return;
                }
            }
            copydefault(groupviewholder, groupbean, EZpvd(groupbean), list);
            return;
        }
        groupviewholder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.abF.1
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(android.view.View view) {
                if (AbstractC7007abF.this.AYXKKw != null) {
                    return AbstractC7007abF.this.AYXKKw.copydefault(groupbean);
                }
                return false;
            }
        });
        if (!groupbean.EZpvd()) {
            groupviewholder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.abF.4
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    if (AbstractC7007abF.this.AYXKKw != null) {
                        AbstractC7007abF.this.AYXKKw.EZpvd(groupbean);
                    }
                }
            });
        } else {
            groupviewholder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.abF.3
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    boolean zContains = AbstractC7007abF.this.KWHzl.contains(groupbean);
                    if (AbstractC7007abF.this.AYXKKw == null || !AbstractC7007abF.this.AYXKKw.AEQbTJ(groupbean, zContains)) {
                        int adapterPosition = groupviewholder.getAdapterPosition();
                        groupviewholder.KWHzl(AbstractC7007abF.this, !zContains);
                        if (zContains) {
                            AbstractC7007abF.this.KWHzl.remove(groupbean);
                            AbstractC7007abF.this.notifyItemRangeRemoved(adapterPosition + 1, groupbean.OLrzqt());
                        } else {
                            AbstractC7007abF.this.KWHzl.add(groupbean);
                            AbstractC7007abF.this.notifyItemRangeInserted(adapterPosition + 1, groupbean.OLrzqt());
                        }
                    }
                }
            });
        }
        KWHzl(groupviewholder, groupbean, EZpvd(groupbean));
    }

    public void AEQbTJ(ChildViewHolder childviewholder, final GroupBean groupbean, final ChildBean childbean, java.util.List<java.lang.Object> list) {
        OLrzqt(childviewholder, groupbean, childbean, list);
        childviewholder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.abF.2
            /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: o.abF$Application */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (AbstractC7007abF.this.AYXKKw != null) {
                    AbstractC7007abF.this.AYXKKw.OLrzqt(groupbean, childbean);
                }
            }
        });
    }

    public final int[] OLrzqt(int i) {
        if (this.copydefault != null) {
            i--;
        }
        int[] iArr = {-1, -1};
        int iEZpvd = EZpvd();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= iEZpvd) {
                break;
            }
            if (i3 == i) {
                iArr[0] = i2;
                iArr[1] = -1;
                break;
            }
            StateListAnimator stateListAnimatorKWHzl = KWHzl(i2);
            if (this.KWHzl.contains(stateListAnimatorKWHzl)) {
                int iOLrzqt = stateListAnimatorKWHzl.OLrzqt();
                int i4 = i - i3;
                if (iOLrzqt >= i4) {
                    iArr[0] = i2;
                    iArr[1] = i4 - 1;
                    break;
                }
                i3 += iOLrzqt;
            }
            i3++;
            i2++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: o.abF$TaskDescription */
    public static abstract class TaskDescription extends RecyclerView.ViewHolder {
        public abstract void KWHzl(RecyclerView.Adapter adapter, boolean z);

        public TaskDescription(android.view.View view) {
            super(view);
        }
    }
}

package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import o.C5475Te;

/* JADX INFO: renamed from: o.Tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5472Tb extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int AEQbTJ = C5475Te.ActionBar.OLrzqt;
    public static final int EZpvd = C5475Te.ActionBar.KWHzl;
    public static final int KWHzl = C5475Te.ActionBar.AEQbTJ;
    public static final int copydefault = C5475Te.ActionBar.EZpvd;
    public ActionBar AYXKKw;
    public StateListAnimator AhwBna;
    public boolean AkhnZx;
    public boolean OLrzqt;
    public java.util.ArrayList<C5481Tk> djBIcL;
    public boolean fetchVPNInfo;
    public Activity gEmmrt;
    public int isConnected;
    public android.content.Context valueOf;

    /* JADX INFO: renamed from: o.Tb$ActionBar */
    public interface ActionBar {
        void OLrzqt(AbstractC5472Tb abstractC5472Tb, C5476Tf c5476Tf, int i);
    }

    /* JADX INFO: renamed from: o.Tb$Activity */
    public interface Activity {
        void AEQbTJ(AbstractC5472Tb abstractC5472Tb, C5476Tf c5476Tf, int i);
    }

    /* JADX INFO: renamed from: o.Tb$StateListAnimator */
    public interface StateListAnimator {
        void AEQbTJ(AbstractC5472Tb abstractC5472Tb, C5476Tf c5476Tf, int i, int i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ(int i) {
        return EZpvd;
    }

    public abstract void AEQbTJ(C5476Tf c5476Tf, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AhwBna(int i) {
        return AEQbTJ;
    }

    public abstract boolean DbNXlk(int i);

    public abstract int EZpvd(int i);

    public abstract void EZpvd(C5476Tf c5476Tf, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int KWHzl(int i, int i2) {
        return KWHzl;
    }

    public abstract int OLrzqt(int i);

    public abstract void OLrzqt(C5476Tf c5476Tf, int i, int i2);

    public abstract int copydefault();

    public abstract int copydefault(int i);

    public abstract boolean djBIcL(int i);

    public abstract int gEmmrt(int i);

    public AbstractC5472Tb(android.content.Context context) {
        this(context, false);
    }

    public AbstractC5472Tb(android.content.Context context, boolean z) {
        this.djBIcL = new java.util.ArrayList<>();
        this.fetchVPNInfo = false;
        this.valueOf = context;
        this.AkhnZx = z;
        registerAdapterDataObserver(new TaskDescription());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        OLrzqt();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (copydefault(viewHolder)) {
            copydefault(viewHolder, viewHolder.getLayoutPosition());
        }
    }

    public final boolean copydefault(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams;
    }

    public final void copydefault(RecyclerView.ViewHolder viewHolder, int i) {
        if (values(i) || AkhnZx(i) == AEQbTJ || AkhnZx(i) == EZpvd) {
            ((StaggeredGridLayoutManager.LayoutParams) viewHolder.itemView.getLayoutParams()).setFullSpan(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        if (i == copydefault) {
            return new C5476Tf(AEQbTJ(viewGroup));
        }
        if (this.AkhnZx) {
            return new C5476Tf(DataBindingUtil.inflate(android.view.LayoutInflater.from(this.valueOf), AEQbTJ(this.isConnected, i), viewGroup, false).getRoot());
        }
        return new C5476Tf(android.view.LayoutInflater.from(this.valueOf).inflate(AEQbTJ(this.isConnected, i), viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int i) {
        int iAkhnZx = AkhnZx(i);
        final int iAYXKKw = AYXKKw(i);
        if (iAkhnZx == AEQbTJ) {
            if (this.AYXKKw != null) {
                viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.Tb.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        if (AbstractC5472Tb.this.AYXKKw != null) {
                            int iAYXKKw2 = viewHolder.itemView.getParent() instanceof android.widget.FrameLayout ? iAYXKKw : AbstractC5472Tb.this.AYXKKw(viewHolder.getLayoutPosition());
                            if (iAYXKKw2 < 0 || iAYXKKw2 >= AbstractC5472Tb.this.djBIcL.size()) {
                                return;
                            }
                            AbstractC5472Tb.this.AYXKKw.OLrzqt(AbstractC5472Tb.this, (C5476Tf) viewHolder, iAYXKKw2);
                        }
                    }
                });
            }
            AEQbTJ((C5476Tf) viewHolder, iAYXKKw);
        } else if (iAkhnZx == EZpvd) {
            if (this.gEmmrt != null) {
                viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.Tb.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        int iAYXKKw2;
                        if (AbstractC5472Tb.this.gEmmrt == null || (iAYXKKw2 = AbstractC5472Tb.this.AYXKKw(viewHolder.getLayoutPosition())) < 0 || iAYXKKw2 >= AbstractC5472Tb.this.djBIcL.size()) {
                            return;
                        }
                        AbstractC5472Tb.this.gEmmrt.AEQbTJ(AbstractC5472Tb.this, (C5476Tf) viewHolder, iAYXKKw2);
                    }
                });
            }
            EZpvd((C5476Tf) viewHolder, iAYXKKw);
        } else if (iAkhnZx == KWHzl) {
            int iEZpvd = EZpvd(iAYXKKw, i);
            if (this.AhwBna != null) {
                viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.Tb.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(android.view.View view) {
                        if (AbstractC5472Tb.this.AhwBna != null) {
                            int iAYXKKw2 = AbstractC5472Tb.this.AYXKKw(viewHolder.getLayoutPosition());
                            int iEZpvd2 = AbstractC5472Tb.this.EZpvd(iAYXKKw2, viewHolder.getLayoutPosition());
                            if (iAYXKKw2 < 0 || iAYXKKw2 >= AbstractC5472Tb.this.djBIcL.size() || iEZpvd2 < 0 || iEZpvd2 >= AbstractC5472Tb.this.djBIcL.get(iAYXKKw2).copydefault()) {
                                return;
                            }
                            AbstractC5472Tb.this.AhwBna.AEQbTJ(AbstractC5472Tb.this, (C5476Tf) viewHolder, iAYXKKw2, iEZpvd2);
                        }
                    }
                });
            }
            OLrzqt((C5476Tf) viewHolder, iAYXKKw, iEZpvd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.OLrzqt) {
            OLrzqt();
        }
        int iEZpvd = EZpvd();
        return iEZpvd > 0 ? iEZpvd : this.fetchVPNInfo ? 1 : 0;
    }

    public boolean values(int i) {
        return i == 0 && this.fetchVPNInfo && EZpvd() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (values(i)) {
            return copydefault;
        }
        this.isConnected = i;
        int iAYXKKw = AYXKKw(i);
        int iAkhnZx = AkhnZx(i);
        if (iAkhnZx == AEQbTJ) {
            return AhwBna(iAYXKKw);
        }
        if (iAkhnZx == EZpvd) {
            return AEQbTJ(iAYXKKw);
        }
        if (iAkhnZx == KWHzl) {
            return KWHzl(iAYXKKw, EZpvd(iAYXKKw, i));
        }
        return super.getItemViewType(i);
    }

    public final int AEQbTJ(int i, int i2) {
        int iAkhnZx = AkhnZx(i);
        if (iAkhnZx == AEQbTJ) {
            return gEmmrt(i2);
        }
        if (iAkhnZx == EZpvd) {
            return OLrzqt(i2);
        }
        if (iAkhnZx == KWHzl) {
            return EZpvd(i2);
        }
        return 0;
    }

    public final int EZpvd() {
        return OLrzqt(0, this.djBIcL.size());
    }

    public int AkhnZx(int i) {
        int size = this.djBIcL.size();
        int iCopydefault = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C5481Tk c5481Tk = this.djBIcL.get(i2);
            if (c5481Tk.OLrzqt() && i < (iCopydefault = iCopydefault + 1)) {
                return AEQbTJ;
            }
            iCopydefault += c5481Tk.copydefault();
            if (i < iCopydefault) {
                return KWHzl;
            }
            if (c5481Tk.KWHzl() && i < (iCopydefault = iCopydefault + 1)) {
                return EZpvd;
            }
        }
        return copydefault;
    }

    public final void OLrzqt() {
        this.djBIcL.clear();
        int iCopydefault = copydefault();
        for (int i = 0; i < iCopydefault; i++) {
            this.djBIcL.add(new C5481Tk(DbNXlk(i), djBIcL(i), copydefault(i)));
        }
        this.OLrzqt = false;
    }

    public int AYXKKw(int i) {
        int size = this.djBIcL.size();
        int iKWHzl = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iKWHzl += KWHzl(i2);
            if (i < iKWHzl) {
                return i2;
            }
        }
        return -1;
    }

    public int EZpvd(int i, int i2) {
        if (i < 0 || i >= this.djBIcL.size()) {
            return -1;
        }
        int iOLrzqt = OLrzqt(0, i + 1);
        C5481Tk c5481Tk = this.djBIcL.get(i);
        int iCopydefault = (c5481Tk.copydefault() - (iOLrzqt - i2)) + (c5481Tk.KWHzl() ? 1 : 0);
        if (iCopydefault >= 0) {
            return iCopydefault;
        }
        return -1;
    }

    public int valueOf(int i) {
        if (i < 0 || i >= this.djBIcL.size()) {
            return -1;
        }
        return OLrzqt(0, i);
    }

    public int copydefault(int i, int i2) {
        if (i < 0 || i >= this.djBIcL.size()) {
            return -1;
        }
        C5481Tk c5481Tk = this.djBIcL.get(i);
        if (c5481Tk.copydefault() > i2) {
            return OLrzqt(0, i) + i2 + (c5481Tk.OLrzqt() ? 1 : 0);
        }
        return -1;
    }

    public int KWHzl(int i) {
        if (i < 0 || i >= this.djBIcL.size()) {
            return 0;
        }
        C5481Tk c5481Tk = this.djBIcL.get(i);
        int iCopydefault = (c5481Tk.OLrzqt() ? 1 : 0) + c5481Tk.copydefault();
        return c5481Tk.KWHzl() ? iCopydefault + 1 : iCopydefault;
    }

    public int OLrzqt(int i, int i2) {
        int size = this.djBIcL.size();
        int iKWHzl = 0;
        for (int i3 = i; i3 < size && i3 < i + i2; i3++) {
            iKWHzl += KWHzl(i3);
        }
        return iKWHzl;
    }

    public void KWHzl() {
        this.OLrzqt = true;
        notifyDataSetChanged();
    }

    public void AYXKKw(int i, int i2) {
        int iOLrzqt;
        int iValueOf = valueOf(i);
        int i3 = i2 + i;
        if (i3 <= this.djBIcL.size()) {
            iOLrzqt = OLrzqt(i, i3);
        } else {
            iOLrzqt = OLrzqt(i, this.djBIcL.size());
        }
        if (iValueOf < 0 || iOLrzqt <= 0) {
            return;
        }
        notifyItemRangeChanged(iValueOf, iOLrzqt);
    }

    public void fetchVPNInfo(int i) {
        int iCopydefault;
        if (i >= this.djBIcL.size() || (iCopydefault = copydefault(i, 0)) < 0) {
            return;
        }
        C5481Tk c5481Tk = this.djBIcL.get(i);
        int iCopydefault2 = c5481Tk.copydefault();
        c5481Tk.KWHzl(0);
        notifyItemRangeRemoved(iCopydefault, iCopydefault2);
    }

    public void isConnected(int i) {
        if (i < this.djBIcL.size()) {
            int iOLrzqt = OLrzqt(0, i);
            C5481Tk c5481Tk = this.djBIcL.get(i);
            if (c5481Tk.OLrzqt()) {
                iOLrzqt++;
            }
            int iCopydefault = copydefault(i);
            if (iCopydefault > 0) {
                c5481Tk.KWHzl(iCopydefault);
                notifyItemRangeInserted(iOLrzqt, iCopydefault);
            }
        }
    }

    public android.view.View AEQbTJ(android.view.ViewGroup viewGroup) {
        return android.view.LayoutInflater.from(this.valueOf).inflate(C5475Te.TaskDescription.copydefault, viewGroup, false);
    }

    /* JADX INFO: renamed from: o.Tb$TaskDescription */
    public class TaskDescription extends RecyclerView.AdapterDataObserver {
        public TaskDescription() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            AbstractC5472Tb.this.OLrzqt = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            AbstractC5472Tb.this.OLrzqt = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            onItemRangeChanged(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            AbstractC5472Tb.this.OLrzqt = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            AbstractC5472Tb.this.OLrzqt = true;
        }
    }
}

package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.core.widget.recycler.MaoRefreshView;

/* JADX INFO: renamed from: o.mAp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31698mAp extends RecyclerView {
    public boolean AEQbTJ;
    public android.view.View AYXKKw;
    public java.util.List<android.view.View> AhwBna;
    public TaskDescription AkhnZx;
    public boolean EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public float djBIcL;
    public Application fetchVPNInfo;
    public Activity gEmmrt;
    public MaoRefreshView isConnected;
    public AbstractC31702mAt valueOf;
    public java.util.List<android.view.View> values;

    /* JADX INFO: renamed from: o.mAp$Application */
    public interface Application {
        void EZpvd();

        void OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRecyclerListener(Application application) {
        this.fetchVPNInfo = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRefreshEnable(boolean z) {
        this.KWHzl = z;
    }

    public C31698mAp(android.content.Context context) {
        this(context, null);
    }

    public C31698mAp(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C31698mAp(android.content.Context context, @androidx.annotation.Nullable android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.djBIcL = -1.0f;
        this.values = new java.util.ArrayList();
        this.AhwBna = new java.util.ArrayList();
        this.gEmmrt = new Activity();
        setOverScrollMode(2);
    }

    public void setRefreshView(MaoRefreshView maoRefreshView) {
        if (this.isConnected != null && !this.values.isEmpty()) {
            this.values.remove(0);
        }
        this.KWHzl = true;
        this.values.add(0, maoRefreshView);
        this.isConnected = maoRefreshView;
    }

    public void setLoadMoreView(AbstractC31702mAt abstractC31702mAt) {
        if (this.valueOf != null && !this.AhwBna.isEmpty()) {
            this.AhwBna.remove(0);
        }
        this.copydefault = true;
        this.AhwBna.add(0, abstractC31702mAt);
        this.valueOf = abstractC31702mAt;
    }

    public void EZpvd() {
        MaoRefreshView maoRefreshView = this.isConnected;
        if (maoRefreshView != null) {
            maoRefreshView.DbNXlk();
        }
        this.EZpvd = false;
    }

    public void EZpvd(boolean z) {
        this.OLrzqt = z;
        this.AEQbTJ = false;
        this.valueOf.AEQbTJ(z);
        this.valueOf.EZpvd();
    }

    public void setEmptyView(android.view.View view) {
        this.AYXKKw = view;
        this.gEmmrt.onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        TaskDescription taskDescription = new TaskDescription(adapter);
        this.AkhnZx = taskDescription;
        super.setAdapter(taskDescription);
        adapter.registerAdapterDataObserver(this.gEmmrt);
        this.gEmmrt.onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        if (i != 0 || this.fetchVPNInfo == null || !this.copydefault || this.AEQbTJ || this.OLrzqt) {
            return;
        }
        if (this.EZpvd) {
            this.valueOf.setGone();
            return;
        }
        this.valueOf.setVisiable();
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            int iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            if (layoutManager.getChildCount() <= 0 || layoutManager.getItemCount() <= layoutManager.getChildCount() || iFindLastVisibleItemPosition < layoutManager.getItemCount() - 2) {
                return;
            }
            this.valueOf.copydefault();
            this.fetchVPNInfo.OLrzqt();
            this.AEQbTJ = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        super.onScrolled(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        Application application;
        if (this.djBIcL == -1.0f) {
            this.djBIcL = motionEvent.getRawY();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.djBIcL = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = motionEvent.getRawY() - this.djBIcL;
            if (copydefault() && this.KWHzl && this.isConnected.copydefault(rawY / 3.0f)) {
                return false;
            }
            if (KWHzl() && this.copydefault && this.OLrzqt) {
                this.valueOf.setHeight((-((int) rawY)) / 3);
            }
        } else {
            this.djBIcL = -1.0f;
            if (copydefault() && this.KWHzl && this.isConnected.values() && (application = this.fetchVPNInfo) != null) {
                application.EZpvd();
                this.EZpvd = true;
            }
            if (KWHzl() && this.copydefault && this.OLrzqt) {
                this.valueOf.EZpvd();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    private boolean copydefault() {
        java.util.List<android.view.View> list = this.values;
        return (list == null || list.isEmpty() || this.values.get(0).getParent() == null) ? false : true;
    }

    public final boolean KWHzl() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        return (this.valueOf == null || this.AhwBna.isEmpty() || this.valueOf.getParent() == null || layoutManager.getItemCount() <= layoutManager.getChildCount()) ? false : true;
    }

    /* JADX INFO: renamed from: o.mAp$Activity */
    public class Activity extends RecyclerView.AdapterDataObserver {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            RecyclerView.Adapter adapter = C31698mAp.this.getAdapter();
            if (adapter != null && C31698mAp.this.AYXKKw != null) {
                if ((adapter.getItemCount() - C31698mAp.this.AhwBna.size()) - C31698mAp.this.values.size() <= 0) {
                    C31698mAp.this.AYXKKw.setVisibility(0);
                    C31698mAp.this.setVisibility(8);
                } else {
                    C31698mAp.this.AYXKKw.setVisibility(8);
                    C31698mAp.this.setVisibility(0);
                }
            }
            if (C31698mAp.this.AkhnZx != null) {
                C31698mAp.this.AkhnZx.notifyDataSetChanged();
            }
            if (C31698mAp.this.isConnected != null) {
                C31698mAp.this.isConnected.DbNXlk();
            }
            if (C31698mAp.this.valueOf != null) {
                C31698mAp.this.valueOf.setGone();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            if (C31698mAp.this.AkhnZx == null) {
                return;
            }
            C31698mAp.this.AkhnZx.notifyItemRangeInserted(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            if (C31698mAp.this.AkhnZx == null) {
                return;
            }
            C31698mAp.this.AkhnZx.notifyItemRangeChanged(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            if (C31698mAp.this.AkhnZx == null) {
                return;
            }
            C31698mAp.this.AkhnZx.notifyItemRangeChanged(i, i2, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            if (C31698mAp.this.AkhnZx == null) {
                return;
            }
            C31698mAp.this.AkhnZx.notifyItemRangeRemoved(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            if (C31698mAp.this.AkhnZx == null) {
                return;
            }
            C31698mAp.this.AkhnZx.notifyItemMoved(i, i2);
        }
    }

    /* JADX INFO: renamed from: o.mAp$TaskDescription */
    public class TaskDescription extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        public RecyclerView.Adapter<RecyclerView.ViewHolder> OLrzqt;

        public TaskDescription(RecyclerView.Adapter adapter) {
            this.OLrzqt = adapter;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            super.onViewAttachedToWindow(viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
            if (i >= 3000) {
                return this.OLrzqt.onCreateViewHolder(viewGroup, i - 3000);
            }
            if (i >= 2000) {
                return new StateListAnimator((android.view.View) C31698mAp.this.AhwBna.get(i - 2000));
            }
            if (i >= 1000) {
                return new StateListAnimator((android.view.View) C31698mAp.this.values.get(i - 1000));
            }
            throw new java.lang.IllegalStateException();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (this.OLrzqt == null || getItemViewType(i) < 3000) {
                return;
            }
            this.OLrzqt.onBindViewHolder(viewHolder, i - AEQbTJ());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            int iAEQbTJ = AEQbTJ();
            int iCopydefault = copydefault();
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.OLrzqt;
            return iAEQbTJ + iCopydefault + (adapter != null ? adapter.getItemCount() : 0);
        }

        public int AEQbTJ() {
            return C31698mAp.this.values.size();
        }

        public int copydefault() {
            return C31698mAp.this.AhwBna.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            if (i >= 0 && i < getItemCount()) {
                if (i < AEQbTJ()) {
                    return i + 1000;
                }
                if (i >= getItemCount() - copydefault()) {
                    return ((getItemCount() + 2000) - i) - 1;
                }
                RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.OLrzqt;
                if (adapter != null) {
                    return adapter.getItemViewType(i - AEQbTJ()) + 3000;
                }
            }
            return -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            if (this.OLrzqt == null || i < AEQbTJ() || i >= this.OLrzqt.getItemCount() + AEQbTJ()) {
                return -1L;
            }
            return this.OLrzqt.getItemId(i - AEQbTJ());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.OLrzqt;
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(adapterDataObserver);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            RecyclerView.Adapter<RecyclerView.ViewHolder> adapter = this.OLrzqt;
            if (adapter != null) {
                adapter.registerAdapterDataObserver(adapterDataObserver);
            }
        }

        /* JADX INFO: renamed from: o.mAp$TaskDescription$StateListAnimator */
        public class StateListAnimator extends RecyclerView.ViewHolder {
            public StateListAnimator(android.view.View view) {
                super(view);
            }
        }
    }
}

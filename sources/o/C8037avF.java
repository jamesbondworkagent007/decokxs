package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import o.C8035avD;

/* JADX INFO: renamed from: o.avF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8037avF extends android.widget.FrameLayout {
    public static boolean EZpvd = false;
    public int AEQbTJ;
    public RecyclerView.OnScrollListener AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public C8047avP AuCTel;
    public int DbNXlk;
    public int KWHzl;
    public boolean OLrzqt;
    public android.view.ViewGroup copydefault;
    public RecyclerView.OnScrollListener djBIcL;
    public RecyclerView ejfBZ;
    public SwipeRefreshLayout.OnRefreshListener fARcdN;
    public int fIwbmz;
    public android.view.ViewGroup fJNWhG;
    public int fetchVPNInfo;
    public java.util.ArrayList<RecyclerView.OnScrollListener> gEmmrt;
    public int isConnected;
    public int iwGUEr;
    public android.view.ViewGroup valueOf;
    public int values;

    public static void copydefault(java.lang.String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @java.lang.Deprecated
    public void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        this.djBIcL = onScrollListener;
    }

    public C8037avF(android.content.Context context) {
        super(context);
        this.gEmmrt = new java.util.ArrayList<>();
        EZpvd();
    }

    public C8037avF(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gEmmrt = new java.util.ArrayList<>();
        EZpvd(attributeSet);
        EZpvd();
    }

    public C8037avF(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gEmmrt = new java.util.ArrayList<>();
        EZpvd(attributeSet);
        EZpvd();
    }

    public void EZpvd(android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8035avD.TaskDescription.copydefault);
        try {
            this.OLrzqt = typedArrayObtainStyledAttributes.getBoolean(C8035avD.TaskDescription.AEQbTJ, false);
            this.AhwBna = (int) typedArrayObtainStyledAttributes.getDimension(C8035avD.TaskDescription.valueOf, -1.0f);
            this.isConnected = (int) typedArrayObtainStyledAttributes.getDimension(C8035avD.TaskDescription.djBIcL, 0.0f);
            this.values = (int) typedArrayObtainStyledAttributes.getDimension(C8035avD.TaskDescription.gEmmrt, 0.0f);
            this.AkhnZx = (int) typedArrayObtainStyledAttributes.getDimension(C8035avD.TaskDescription.AYXKKw, 0.0f);
            this.DbNXlk = (int) typedArrayObtainStyledAttributes.getDimension(C8035avD.TaskDescription.AhwBna, 0.0f);
            this.iwGUEr = typedArrayObtainStyledAttributes.getInteger(C8035avD.TaskDescription.AkhnZx, -1);
            this.fIwbmz = typedArrayObtainStyledAttributes.getInteger(C8035avD.TaskDescription.values, -1);
            this.AEQbTJ = typedArrayObtainStyledAttributes.getResourceId(C8035avD.TaskDescription.EZpvd, 0);
            this.fetchVPNInfo = typedArrayObtainStyledAttributes.getResourceId(C8035avD.TaskDescription.KWHzl, 0);
            this.KWHzl = typedArrayObtainStyledAttributes.getResourceId(C8035avD.TaskDescription.OLrzqt, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void EZpvd() {
        if (isInEditMode()) {
            return;
        }
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C8035avD.ActionBar.AEQbTJ, this);
        C8047avP c8047avP = (C8047avP) viewInflate.findViewById(C8035avD.Activity.copydefault);
        this.AuCTel = c8047avP;
        c8047avP.setEnabled(false);
        this.fJNWhG = (android.view.ViewGroup) viewInflate.findViewById(C8035avD.Activity.KWHzl);
        if (this.fetchVPNInfo != 0) {
            android.view.LayoutInflater.from(getContext()).inflate(this.fetchVPNInfo, this.fJNWhG);
        }
        this.copydefault = (android.view.ViewGroup) viewInflate.findViewById(C8035avD.Activity.OLrzqt);
        if (this.AEQbTJ != 0) {
            android.view.LayoutInflater.from(getContext()).inflate(this.AEQbTJ, this.copydefault);
        }
        this.valueOf = (android.view.ViewGroup) viewInflate.findViewById(C8035avD.Activity.AEQbTJ);
        if (this.KWHzl != 0) {
            android.view.LayoutInflater.from(getContext()).inflate(this.KWHzl, this.valueOf);
        }
        copydefault(viewInflate);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return this.AuCTel.dispatchTouchEvent(motionEvent);
    }

    public void setRecyclerPadding(int i, int i2, int i3, int i4) {
        this.AkhnZx = i;
        this.isConnected = i2;
        this.DbNXlk = i3;
        this.values = i4;
        this.ejfBZ.setPadding(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        this.ejfBZ.setClipToPadding(z);
    }

    public void setEmptyView(android.view.View view) {
        this.copydefault.removeAllViews();
        this.copydefault.addView(view);
    }

    public void setProgressView(android.view.View view) {
        this.fJNWhG.removeAllViews();
        this.fJNWhG.addView(view);
    }

    public void setErrorView(android.view.View view) {
        this.valueOf.removeAllViews();
        this.valueOf.addView(view);
    }

    public void setEmptyView(int i) {
        this.copydefault.removeAllViews();
        android.view.LayoutInflater.from(getContext()).inflate(i, this.copydefault);
    }

    public void setProgressView(int i) {
        this.fJNWhG.removeAllViews();
        android.view.LayoutInflater.from(getContext()).inflate(i, this.fJNWhG);
    }

    public void setErrorView(int i) {
        this.valueOf.removeAllViews();
        android.view.LayoutInflater.from(getContext()).inflate(i, this.valueOf);
    }

    public void copydefault(android.view.View view) {
        this.ejfBZ = (RecyclerView) view.findViewById(android.R.id.list);
        setItemAnimator(null);
        RecyclerView recyclerView = this.ejfBZ;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.ejfBZ.setClipToPadding(this.OLrzqt);
            RecyclerView.OnScrollListener onScrollListener = new RecyclerView.OnScrollListener() { // from class: o.avF.5
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView2, int i, int i2) {
                    super.onScrolled(recyclerView2, i, i2);
                    RecyclerView.OnScrollListener onScrollListener2 = C8037avF.this.djBIcL;
                    if (onScrollListener2 != null) {
                        onScrollListener2.onScrolled(recyclerView2, i, i2);
                    }
                    java.util.Iterator<RecyclerView.OnScrollListener> it = C8037avF.this.gEmmrt.iterator();
                    while (it.hasNext()) {
                        it.next().onScrolled(recyclerView2, i, i2);
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                    super.onScrollStateChanged(recyclerView2, i);
                    RecyclerView.OnScrollListener onScrollListener2 = C8037avF.this.djBIcL;
                    if (onScrollListener2 != null) {
                        onScrollListener2.onScrollStateChanged(recyclerView2, i);
                    }
                    java.util.Iterator<RecyclerView.OnScrollListener> it = C8037avF.this.gEmmrt.iterator();
                    while (it.hasNext()) {
                        it.next().onScrollStateChanged(recyclerView2, i);
                    }
                }
            };
            this.AYXKKw = onScrollListener;
            this.ejfBZ.addOnScrollListener(onScrollListener);
            int i = this.AhwBna;
            if (i != -1.0f) {
                this.ejfBZ.setPadding(i, i, i, i);
            } else {
                this.ejfBZ.setPadding(this.AkhnZx, this.isConnected, this.DbNXlk, this.values);
            }
            int i2 = this.iwGUEr;
            if (i2 != -1) {
                this.ejfBZ.setScrollBarStyle(i2);
            }
            int i3 = this.fIwbmz;
            if (i3 == 0) {
                setVerticalScrollBarEnabled(false);
                return;
            }
            if (i3 == 1) {
                setHorizontalScrollBarEnabled(false);
            } else {
                if (i3 != 2) {
                    return;
                }
                setVerticalScrollBarEnabled(false);
                setHorizontalScrollBarEnabled(false);
            }
        }
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z) {
        this.ejfBZ.setVerticalScrollBarEnabled(z);
    }

    @Override // android.view.View
    public void setHorizontalScrollBarEnabled(boolean z) {
        this.ejfBZ.setHorizontalScrollBarEnabled(z);
    }

    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        this.ejfBZ.setLayoutManager(layoutManager);
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        this.ejfBZ.setAdapter(adapter);
        adapter.registerAdapterDataObserver(new C8036avE(this));
        valueOf();
    }

    public void setAdapterWithProgress(RecyclerView.Adapter adapter) {
        this.ejfBZ.setAdapter(adapter);
        adapter.registerAdapterDataObserver(new C8036avE(this));
        if (adapter instanceof AbstractC8041avJ) {
            if (((AbstractC8041avJ) adapter).EZpvd() == 0) {
                OLrzqt();
                return;
            } else {
                valueOf();
                return;
            }
        }
        if (adapter.getItemCount() == 0) {
            OLrzqt();
        } else {
            valueOf();
        }
    }

    public final void copydefault() {
        this.copydefault.setVisibility(8);
        this.fJNWhG.setVisibility(8);
        this.valueOf.setVisibility(8);
        this.AuCTel.setRefreshing(false);
        this.ejfBZ.setVisibility(4);
    }

    public void KWHzl() {
        copydefault("showEmpty");
        if (this.copydefault.getChildCount() > 0) {
            copydefault();
            this.copydefault.setVisibility(0);
        } else {
            valueOf();
        }
    }

    public void OLrzqt() {
        copydefault("showProgress");
        if (this.fJNWhG.getChildCount() > 0) {
            copydefault();
            this.fJNWhG.setVisibility(0);
        } else {
            valueOf();
        }
    }

    public void valueOf() {
        copydefault("showRecycler");
        copydefault();
        this.ejfBZ.setVisibility(0);
    }

    public void setRefreshListener(SwipeRefreshLayout.OnRefreshListener onRefreshListener) {
        this.AuCTel.setEnabled(true);
        this.AuCTel.setOnRefreshListener(onRefreshListener);
        this.fARcdN = onRefreshListener;
    }

    public void setRefreshing(final boolean z) {
        this.AuCTel.post(new java.lang.Runnable() { // from class: o.avF.1
            @Override // java.lang.Runnable
            public void run() {
                C8037avF.this.AuCTel.setRefreshing(z);
            }
        });
    }

    public void setRefreshing(final boolean z, final boolean z2) {
        this.AuCTel.post(new java.lang.Runnable() { // from class: o.avF.4
            @Override // java.lang.Runnable
            public void run() {
                SwipeRefreshLayout.OnRefreshListener onRefreshListener;
                C8037avF.this.AuCTel.setRefreshing(z);
                if (z && z2 && (onRefreshListener = C8037avF.this.fARcdN) != null) {
                    onRefreshListener.onRefresh();
                }
            }
        });
    }

    public void setRefreshingColorResources(@androidx.annotation.ColorRes int... iArr) {
        this.AuCTel.setColorSchemeResources(iArr);
    }

    public void setRefreshingColor(int... iArr) {
        this.AuCTel.setColorSchemeColors(iArr);
    }

    public RecyclerView.Adapter AEQbTJ() {
        return this.ejfBZ.getAdapter();
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.ejfBZ.setOnTouchListener(onTouchListener);
    }

    public void setItemAnimator(RecyclerView.ItemAnimator itemAnimator) {
        this.ejfBZ.setItemAnimator(itemAnimator);
    }
}

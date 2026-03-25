package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import o.InterfaceC7383aim;

/* JADX INFO: renamed from: o.aqM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7781aqM extends RecyclerView implements InterfaceC7951atX {
    public InterfaceC7949atV AEQbTJ;
    public int[] AYXKKw;
    public boolean AhwBna;
    public float EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public InterfaceC7383aim.ActionBar copydefault;
    public int djBIcL;
    public InterfaceC7554aly gEmmrt;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCycleCallback(InterfaceC7383aim.ActionBar actionBar) {
        this.copydefault = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDisallowFling(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLoadThreshold(float f) {
        this.EZpvd = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLoadViewDelegete(InterfaceC7949atV interfaceC7949atV) {
        this.AEQbTJ = interfaceC7949atV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOnLoadListener(InterfaceC7554aly interfaceC7554aly) {
        this.gEmmrt = interfaceC7554aly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setPauseImageRequestsOnFling(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean valueOf() {
        return this.KWHzl;
    }

    public C7781aqM(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.valueOf = false;
        this.OLrzqt = false;
        this.KWHzl = false;
        this.AYXKKw = null;
        this.EZpvd = 0.0f;
        this.AhwBna = true;
        setRecycledViewPool(new C7502akz(C7330ahm.AkhnZx));
        setItemAnimator(null);
        setFocusableInTouchMode(true);
        setOnFlingListener(new RecyclerView.OnFlingListener() { // from class: o.aqM.2
            @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
            public boolean onFling(int i, int i2) {
                return false;
            }
        });
        addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: o.aqM.5
            public int EZpvd = 0;
            public int AEQbTJ = 0;
            public boolean copydefault = false;
            public boolean KWHzl = false;

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                InterfaceC7855arh interfaceC7855arhAYXKKw;
                if (C7330ahm.gEmmrt) {
                    RecyclerView.Adapter adapter = C7781aqM.this.getAdapter();
                    if (adapter instanceof C7393aiw) {
                        ((C7393aiw) adapter).KWHzl(i);
                    }
                }
                this.KWHzl = i == 1;
                if (C7781aqM.this.AhwBna) {
                    if (i == 0) {
                        InterfaceC7855arh interfaceC7855arhAYXKKw2 = C7323ahf.AYXKKw();
                        if (interfaceC7855arhAYXKKw2 != null) {
                            interfaceC7855arhAYXKKw2.EZpvd(recyclerView, recyclerView.getContext());
                            this.copydefault = false;
                        }
                    } else if (this.copydefault && i == 1 && (interfaceC7855arhAYXKKw = C7323ahf.AYXKKw()) != null) {
                        interfaceC7855arhAYXKKw.EZpvd(recyclerView, recyclerView.getContext());
                        this.copydefault = false;
                    }
                }
                OLrzqt(recyclerView, i);
            }

            public final void OLrzqt(RecyclerView recyclerView, int i) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (i == 0 && (layoutManager instanceof StaggeredGridLayoutManager) && !recyclerView.canScrollVertically(-1)) {
                    ((StaggeredGridLayoutManager) layoutManager).invalidateSpanAssignments();
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                boolean z;
                this.EZpvd += i;
                this.AEQbTJ += i2;
                if (C7781aqM.this.AhwBna) {
                    if (!this.copydefault || recyclerView.getLayoutManager() == null) {
                        z = false;
                        if (!this.KWHzl) {
                            int iAbs = java.lang.Math.abs(i2);
                            InterfaceC7855arh interfaceC7855arhAYXKKw = C7323ahf.AYXKKw();
                            if (interfaceC7855arhAYXKKw != null) {
                                boolean z2 = this.copydefault;
                                if (z2 && iAbs < 80) {
                                    interfaceC7855arhAYXKKw.EZpvd(recyclerView, recyclerView.getContext());
                                    this.copydefault = false;
                                } else if (!z2 && 120 < iAbs && !z) {
                                    interfaceC7855arhAYXKKw.KWHzl(recyclerView, recyclerView.getContext());
                                    this.copydefault = true;
                                }
                            }
                        }
                    } else {
                        if ((recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollOffset()) - recyclerView.getHeight() <= recyclerView.getHeight() / 10) {
                            InterfaceC7855arh interfaceC7855arhAYXKKw2 = C7323ahf.AYXKKw();
                            if (interfaceC7855arhAYXKKw2 != null) {
                                interfaceC7855arhAYXKKw2.EZpvd(recyclerView, recyclerView.getContext());
                            }
                            this.copydefault = false;
                            z = true;
                        }
                        if (!this.KWHzl) {
                        }
                    }
                }
                if (C7781aqM.this.OLrzqt) {
                    C7781aqM.this.OLrzqt = false;
                    return;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (C7781aqM.this.EZpvd > 0.0f) {
                    if (C7781aqM.this.AEQbTJ.OLrzqt() && layoutManager.getChildCount() > 0) {
                        if ((recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollOffset()) - recyclerView.getHeight() <= ((int) (C7781aqM.this.EZpvd * recyclerView.getHeight()))) {
                            if (C7781aqM.this.AEQbTJ.OLrzqt(false)) {
                                if (C7781aqM.this.gEmmrt != null) {
                                    C7781aqM.this.gEmmrt.getFieldNames();
                                    return;
                                }
                                return;
                            } else {
                                if ((C7781aqM.this.AEQbTJ.AEQbTJ() == 2 || C7781aqM.this.AEQbTJ.AEQbTJ() == 3) && C7781aqM.this.gEmmrt != null) {
                                    C7781aqM.this.AEQbTJ.gEmmrt();
                                    C7781aqM.this.gEmmrt.getFieldNames();
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                if (C7781aqM.this.EZpvd() == Integer.MIN_VALUE) {
                    C7781aqM.this.OLrzqt = true;
                    if (C7781aqM.this.AEQbTJ.OLrzqt(false) && C7781aqM.this.gEmmrt != null) {
                        C7781aqM.this.gEmmrt.getFieldNames();
                        return;
                    }
                }
                if (C7781aqM.this.AEQbTJ.OLrzqt() && C7781aqM.this.KWHzl() == layoutManager.getItemCount() - 1) {
                    if ((C7781aqM.this.AEQbTJ.AEQbTJ() == 2 || C7781aqM.this.AEQbTJ.AEQbTJ() == 3) && C7781aqM.this.gEmmrt != null) {
                        C7781aqM.this.AEQbTJ.gEmmrt();
                        C7781aqM.this.gEmmrt.getFieldNames();
                    }
                }
            }
        });
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final int EZpvd() {
        int iOLrzqt = OLrzqt();
        if (iOLrzqt != -1) {
            return getAdapter().getItemViewType(iOLrzqt);
        }
        return -1;
    }

    public final int OLrzqt() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        EZpvd(staggeredGridLayoutManager);
        int[] iArrFindLastVisibleItemPositions = staggeredGridLayoutManager.findLastVisibleItemPositions(this.AYXKKw);
        this.AYXKKw = iArrFindLastVisibleItemPositions;
        return AEQbTJ(iArrFindLastVisibleItemPositions);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(@androidx.annotation.Nullable RecyclerView.Adapter adapter) {
        super.setAdapter(adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(@androidx.annotation.Nullable RecyclerView.LayoutManager layoutManager) {
        super.setLayoutManager(layoutManager);
    }

    public final int AEQbTJ(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    @Override // o.InterfaceC7951atX
    public int copydefault() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        EZpvd(staggeredGridLayoutManager);
        int[] iArrFindFirstCompletelyVisibleItemPositions = staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(this.AYXKKw);
        this.AYXKKw = iArrFindFirstCompletelyVisibleItemPositions;
        return iArrFindFirstCompletelyVisibleItemPositions[0];
    }

    @Override // o.InterfaceC7951atX
    public int djBIcL() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getOrientation();
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View view, android.view.View view2) {
        if (view2 instanceof C7781aqM) {
            return;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        if (!this.valueOf) {
            this.valueOf = i > 0 || i2 > 0;
        }
        super.onScrolled(i, i2);
    }

    public void AEQbTJ(boolean z, int i) {
        this.djBIcL = i;
        int iAEQbTJ = AEQbTJ();
        int iKWHzl = KWHzl();
        if (z) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, 0);
                return;
            }
        }
        if (i <= iAEQbTJ) {
            if (z) {
                scrollToPosition(i);
                return;
            } else {
                smoothScrollToPosition(i);
                return;
            }
        }
        if (i > iKWHzl) {
            if (z) {
                scrollToPosition(i);
                return;
            } else {
                smoothScrollToPosition(i);
                return;
            }
        }
        int top = getChildAt(i - iAEQbTJ).getTop();
        if (z) {
            scrollBy(0, top);
        } else {
            smoothScrollBy(0, top);
        }
    }

    public int AEQbTJ() {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        EZpvd(staggeredGridLayoutManager);
        int[] iArrFindFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(this.AYXKKw);
        this.AYXKKw = iArrFindFirstVisibleItemPositions;
        return iArrFindFirstVisibleItemPositions[0];
    }

    public int KWHzl() {
        return OLrzqt();
    }

    public final void EZpvd(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        if (this.AYXKKw == null || staggeredGridLayoutManager.getSpanCount() == this.AYXKKw.length) {
            return;
        }
        this.AYXKKw = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        InterfaceC7383aim.ActionBar actionBar = this.copydefault;
        if (actionBar != null) {
            actionBar.AEQbTJ();
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        if (this.KWHzl) {
            return false;
        }
        return super.fling(i, i2);
    }
}

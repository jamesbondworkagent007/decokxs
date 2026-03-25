package o;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import o.ST;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SS<T, K extends ST> extends RecyclerView.Adapter<K> {
    public java.util.List<T> AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public android.view.animation.Interpolator AkhnZx;
    public SV AuCTel;
    public boolean AuCTelauCTel;
    public int AubY;
    public boolean AwvSrB;
    public boolean AxsJAY;
    public boolean DbNXlk;
    public android.content.Context EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public SR copydefault;
    public android.widget.FrameLayout djBIcL;
    public android.view.LayoutInflater ejfBZ;
    public boolean fARcdN;
    public int fIwbmz;
    public int fJNWhG;
    public android.widget.LinearLayout fetchVPNInfo;
    public int gEmmrt;
    public int gHZMYf;
    public TaskDescription getFieldNames;
    public boolean getNewProxyInstance;
    public ActionBar hDKMBd;
    public boolean isConnected;
    public boolean iwGUEr;
    public StateListAnimator sSMYrx;
    public AbstractC5471Ta<T> uzCIH;
    public boolean valueOf;
    public android.widget.LinearLayout values;
    public SR wlaJM;
    public Application zLjUOn;
    public RecyclerView zsXlph;
    public Activity zuBGHE;

    public interface ActionBar {
        void OLrzqt(SS ss, android.view.View view, int i);
    }

    public interface Activity {
        void copydefault();
    }

    public interface Application {
        void OLrzqt();
    }

    public interface StateListAnimator {
        int OLrzqt(GridLayoutManager gridLayoutManager, int i);
    }

    public interface TaskDescription {
        boolean EZpvd(SS ss, android.view.View view, int i);
    }

    public abstract void AEQbTJ(K k, T t);

    public boolean AEQbTJ(int i) {
        return i == 1365 || i == 273 || i == 819 || i == 546;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AYXKKw() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar AhwBna() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecyclerView djBIcL() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fetchVPNInfo() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.OLrzqt;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaskDescription valueOf() {
        return this.getFieldNames;
    }

    public final void EZpvd(int i) {
        Activity activity;
        if (!fetchVPNInfo() || AkhnZx() || i > this.gHZMYf || (activity = this.zuBGHE) == null) {
            return;
        }
        activity.copydefault();
    }

    public int copydefault() {
        if (this.zLjUOn == null || !this.fARcdN) {
            return 0;
        }
        return ((this.iwGUEr || !this.AuCTel.AYXKKw()) && this.AEQbTJ.size() != 0) ? 1 : 0;
    }

    public int AEQbTJ() {
        return EZpvd() + this.AEQbTJ.size() + OLrzqt();
    }

    public SS(@androidx.annotation.LayoutRes int i, @androidx.annotation.Nullable java.util.List<T> list) {
        this.iwGUEr = false;
        this.fARcdN = false;
        this.getNewProxyInstance = false;
        this.AuCTel = new SY();
        this.valueOf = false;
        this.AhwBna = true;
        this.AuCTelauCTel = false;
        this.AkhnZx = new android.view.animation.LinearInterpolator();
        this.gEmmrt = 300;
        this.fIwbmz = -1;
        this.wlaJM = new SU();
        this.DbNXlk = true;
        this.gHZMYf = 1;
        this.AubY = 1;
        this.AEQbTJ = list == null ? new java.util.ArrayList<>() : list;
        if (i != 0) {
            this.fJNWhG = i;
        }
    }

    public SS(@androidx.annotation.LayoutRes int i) {
        this(i, null);
    }

    public void EZpvd(@androidx.annotation.NonNull java.util.Collection<? extends T> collection) {
        java.util.List<T> list = this.AEQbTJ;
        if (collection != list) {
            list.clear();
            this.AEQbTJ.addAll(collection);
        }
        notifyDataSetChanged();
    }

    public T OLrzqt(@androidx.annotation.IntRange(from = 0) int i) {
        if (i < 0 || i >= this.AEQbTJ.size()) {
            return null;
        }
        return this.AEQbTJ.get(i);
    }

    public int EZpvd() {
        android.widget.LinearLayout linearLayout = this.fetchVPNInfo;
        return (linearLayout == null || linearLayout.getChildCount() == 0) ? 0 : 1;
    }

    public int OLrzqt() {
        android.widget.LinearLayout linearLayout = this.values;
        return (linearLayout == null || linearLayout.getChildCount() == 0) ? 0 : 1;
    }

    public int KWHzl() {
        android.widget.FrameLayout frameLayout = this.djBIcL;
        return (frameLayout == null || frameLayout.getChildCount() == 0 || !this.DbNXlk || this.AEQbTJ.size() != 0) ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = 1;
        if (KWHzl() == 1) {
            if (this.isConnected && EZpvd() != 0) {
                i = 2;
            }
            return (!this.AYXKKw || OLrzqt() == 0) ? i : i + 1;
        }
        return copydefault() + EZpvd() + this.AEQbTJ.size() + OLrzqt();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (KWHzl() == 1) {
            boolean z = this.isConnected && EZpvd() != 0;
            return i != 0 ? i != 1 ? i != 2 ? 1365 : 819 : z ? 1365 : 819 : z ? 273 : 1365;
        }
        int iEZpvd = EZpvd();
        if (i < iEZpvd) {
            return 273;
        }
        int i2 = i - iEZpvd;
        int size = this.AEQbTJ.size();
        if (i2 < size) {
            return copydefault(i2);
        }
        return i2 - size < OLrzqt() ? 819 : 546;
    }

    public int copydefault(int i) {
        AbstractC5471Ta<T> abstractC5471Ta = this.uzCIH;
        if (abstractC5471Ta != null) {
            return abstractC5471Ta.OLrzqt(this.AEQbTJ, i);
        }
        return super.getItemViewType(i);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public K onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        K k;
        android.content.Context context = viewGroup.getContext();
        this.EZpvd = context;
        this.ejfBZ = android.view.LayoutInflater.from(context);
        if (i == 273) {
            k = (K) KWHzl(this.fetchVPNInfo);
        } else if (i == 546) {
            k = (K) EZpvd(viewGroup);
        } else if (i == 819) {
            k = (K) KWHzl(this.values);
        } else if (i == 1365) {
            k = (K) KWHzl(this.djBIcL);
        } else {
            k = (K) copydefault(viewGroup, i);
            KWHzl((ST) k);
        }
        k.OLrzqt(this);
        return k;
    }

    public final K EZpvd(android.view.ViewGroup viewGroup) {
        K k = (K) KWHzl(copydefault(this.AuCTel.OLrzqt(), viewGroup));
        k.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.SS.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                if (SS.this.AuCTel.AEQbTJ() == 3) {
                    SS.this.DbNXlk();
                }
                if (SS.this.valueOf && SS.this.AuCTel.AEQbTJ() == 4) {
                    SS.this.DbNXlk();
                }
            }
        });
        return k;
    }

    public void DbNXlk() {
        if (this.AuCTel.AEQbTJ() == 2) {
            return;
        }
        this.AuCTel.copydefault(1);
        notifyItemChanged(AEQbTJ());
    }

    /* JADX DEBUG: Method merged with bridge method: onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(K k) {
        super.onViewAttachedToWindow(k);
        int itemViewType = k.getItemViewType();
        if (itemViewType == 1365 || itemViewType == 273 || itemViewType == 819 || itemViewType == 546) {
            OLrzqt(k);
        } else {
            KWHzl((RecyclerView.ViewHolder) k);
        }
    }

    public void OLrzqt(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) viewHolder.itemView.getLayoutParams()).setFullSpan(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: o.SS.4
                @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
                public int getSpanSize(int i) {
                    int itemViewType = SS.this.getItemViewType(i);
                    if (itemViewType == 273 && SS.this.gEmmrt()) {
                        return 1;
                    }
                    if (itemViewType == 819 && SS.this.AYXKKw()) {
                        return 1;
                    }
                    if (SS.this.sSMYrx != null) {
                        return SS.this.AEQbTJ(itemViewType) ? gridLayoutManager.getSpanCount() : SS.this.sSMYrx.OLrzqt(gridLayoutManager, i - SS.this.EZpvd());
                    }
                    if (SS.this.AEQbTJ(itemViewType)) {
                        return gridLayoutManager.getSpanCount();
                    }
                    return 1;
                }
            });
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(K k, int i) {
        EZpvd(i);
        KWHzl(i);
        int itemViewType = k.getItemViewType();
        if (itemViewType == 0) {
            AEQbTJ(k, OLrzqt(i - EZpvd()));
            return;
        }
        if (itemViewType != 273) {
            if (itemViewType == 546) {
                this.AuCTel.KWHzl(k);
            } else {
                if (itemViewType == 819 || itemViewType == 1365) {
                    return;
                }
                AEQbTJ(k, OLrzqt(i - EZpvd()));
            }
        }
    }

    public final void KWHzl(final ST st) {
        android.view.View view;
        if (st == null || (view = st.itemView) == null) {
            return;
        }
        if (AhwBna() != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: o.SS.3
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view2) {
                    SS.this.OLrzqt(view2, st.getLayoutPosition() - SS.this.EZpvd());
                }
            });
        }
        if (valueOf() != null) {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.SS.2
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(android.view.View view2) {
                    return SS.this.copydefault(view2, st.getLayoutPosition() - SS.this.EZpvd());
                }
            });
        }
    }

    public void OLrzqt(android.view.View view, int i) {
        AhwBna().OLrzqt(this, view, i);
    }

    public boolean copydefault(android.view.View view, int i) {
        return valueOf().EZpvd(this, view, i);
    }

    public K copydefault(android.view.ViewGroup viewGroup, int i) {
        int iKWHzl = this.fJNWhG;
        AbstractC5471Ta<T> abstractC5471Ta = this.uzCIH;
        if (abstractC5471Ta != null) {
            iKWHzl = abstractC5471Ta.KWHzl(i);
        }
        return (K) AEQbTJ(viewGroup, iKWHzl);
    }

    public K AEQbTJ(android.view.ViewGroup viewGroup, int i) {
        return (K) KWHzl(copydefault(i, viewGroup));
    }

    public K KWHzl(android.view.View view) {
        K k;
        java.lang.Class clsKWHzl = null;
        for (java.lang.Class<?> superclass = getClass(); clsKWHzl == null && superclass != null; superclass = superclass.getSuperclass()) {
            clsKWHzl = KWHzl(superclass);
        }
        if (clsKWHzl == null) {
            k = (K) new ST(view);
        } else {
            k = (K) copydefault(clsKWHzl, view);
        }
        return k != null ? k : (K) new ST(view);
    }

    public final K copydefault(java.lang.Class cls, android.view.View view) {
        try {
            if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
                java.lang.reflect.Constructor<T> declaredConstructor = cls.getDeclaredConstructor(getClass(), android.view.View.class);
                declaredConstructor.setAccessible(true);
                return (K) declaredConstructor.newInstance(this, view);
            }
            java.lang.reflect.Constructor<T> declaredConstructor2 = cls.getDeclaredConstructor(android.view.View.class);
            declaredConstructor2.setAccessible(true);
            return (K) declaredConstructor2.newInstance(view);
        } catch (java.lang.IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (java.lang.InstantiationException e2) {
            e2.printStackTrace();
            return null;
        } catch (java.lang.NoSuchMethodException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public final java.lang.Class KWHzl(java.lang.Class cls) {
        java.lang.reflect.Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return null;
        }
        for (java.lang.reflect.Type type : ((ParameterizedType) genericSuperclass).getActualTypeArguments()) {
            if (type instanceof java.lang.Class) {
                java.lang.Class cls2 = (java.lang.Class) type;
                if (ST.class.isAssignableFrom(cls2)) {
                    return cls2;
                }
            } else if (type instanceof ParameterizedType) {
                java.lang.reflect.Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof java.lang.Class) {
                    java.lang.Class cls3 = (java.lang.Class) rawType;
                    if (ST.class.isAssignableFrom(cls3)) {
                        return cls3;
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        return null;
    }

    public final void KWHzl(int i) {
        if (copydefault() != 0 && i >= getItemCount() - this.AubY && this.AuCTel.AEQbTJ() == 1) {
            this.AuCTel.copydefault(2);
            if (this.getNewProxyInstance) {
                return;
            }
            this.getNewProxyInstance = true;
            if (djBIcL() != null) {
                djBIcL().post(new java.lang.Runnable() { // from class: o.SS.5
                    @Override // java.lang.Runnable
                    public void run() {
                        SS.this.zLjUOn.OLrzqt();
                    }
                });
            } else {
                this.zLjUOn.OLrzqt();
            }
        }
    }

    public final void KWHzl(RecyclerView.ViewHolder viewHolder) {
        if (this.AuCTelauCTel) {
            if (!this.AhwBna || viewHolder.getLayoutPosition() > this.fIwbmz) {
                SR sr = this.copydefault;
                if (sr == null) {
                    sr = this.wlaJM;
                }
                for (android.animation.Animator animator : sr.EZpvd(viewHolder.itemView)) {
                    EZpvd(animator, viewHolder.getLayoutPosition());
                }
                this.fIwbmz = viewHolder.getLayoutPosition();
            }
        }
    }

    public void EZpvd(android.animation.Animator animator, int i) {
        animator.setDuration(this.gEmmrt).start();
        animator.setInterpolator(this.AkhnZx);
    }

    public android.view.View copydefault(@androidx.annotation.LayoutRes int i, android.view.ViewGroup viewGroup) {
        return this.ejfBZ.inflate(i, viewGroup, false);
    }
}

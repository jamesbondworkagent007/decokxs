package o;

import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerAdapter;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: o.aiw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7393aiw extends RecyclerView.Adapter<C7354aiJ> {
    public final InterfaceC7949atV AhwBna;
    public final UDBaseRecyclerAdapter AkhnZx;
    public java.util.List<android.view.View> OLrzqt;
    public android.view.View copydefault;
    public java.util.HashMap<C7354aiJ, java.lang.Integer> djBIcL;
    public boolean AEQbTJ = false;
    public boolean values = false;
    public boolean KWHzl = true;
    public java.util.ArrayList<WeakReference<C7362aiR>> EZpvd = new java.util.ArrayList<>();
    public java.util.ArrayList<WeakReference<C7354aiJ>> valueOf = new java.util.ArrayList<>();
    public boolean gEmmrt = false;
    public java.lang.Runnable AYXKKw = new java.lang.Runnable() { // from class: o.aiw.3
        @Override // java.lang.Runnable
        public void run() {
            java.util.HashMap<C7354aiJ, java.lang.Integer> map = C7393aiw.this.djBIcL;
            if (map == null || map.isEmpty()) {
                return;
            }
            if (C7393aiw.this.AkhnZx.getGlobals().isDestroyed()) {
                C7393aiw.this.djBIcL.clear();
                return;
            }
            for (Map.Entry<C7354aiJ, java.lang.Integer> entry : C7393aiw.this.djBIcL.entrySet()) {
                C7393aiw.this.AkhnZx.EZpvd(entry.getKey().OLrzqt(), entry.getValue().intValue());
            }
            C7393aiw.this.djBIcL.clear();
        }
    };

    public final int AEQbTJ(int i) {
        return (-i) - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UDBaseRecyclerAdapter EZpvd() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.values;
    }

    public C7393aiw(@androidx.annotation.NonNull UDBaseRecyclerAdapter uDBaseRecyclerAdapter, @androidx.annotation.NonNull InterfaceC7949atV interfaceC7949atV) {
        setHasStableIds(true);
        this.AkhnZx = uDBaseRecyclerAdapter;
        if (interfaceC7949atV == null) {
            throw new java.lang.NullPointerException("ILoadViewDelegete is null!");
        }
        this.AhwBna = interfaceC7949atV;
    }

    public void AEQbTJ(boolean z) {
        if (this.AEQbTJ != z) {
            this.AEQbTJ = z;
            if (!z) {
                notifyItemRemoved(getItemCount());
            } else {
                notifyItemInserted(getItemCount() - 1);
            }
            UDBaseRecyclerAdapter uDBaseRecyclerAdapter = this.AkhnZx;
            if (uDBaseRecyclerAdapter != null) {
                uDBaseRecyclerAdapter.AEQbTJ(z);
            }
        }
    }

    public void KWHzl(java.util.Collection<android.view.View> collection) {
        if (this.OLrzqt == null) {
            this.OLrzqt = new java.util.ArrayList();
        }
        int size = this.OLrzqt.size();
        this.OLrzqt.addAll(collection);
        notifyItemRangeInserted(size, collection.size());
    }

    public void copydefault(android.view.View view) {
        if (this.OLrzqt == null) {
            this.OLrzqt = new java.util.ArrayList();
        }
        this.OLrzqt.add(view);
        notifyItemInserted(this.OLrzqt.size() - 1);
    }

    public void AEQbTJ() {
        java.util.List<android.view.View> list = this.OLrzqt;
        if (list != null) {
            int size = list.size();
            this.OLrzqt.clear();
            if (size > 0) {
                notifyItemRangeRemoved(0, size);
            }
        }
    }

    public int KWHzl() {
        java.util.List<android.view.View> list;
        if (this.gEmmrt || (list = this.OLrzqt) == null) {
            return 0;
        }
        return list.size();
    }

    public void EZpvd(boolean z) {
        this.values = z;
        android.view.View view = this.copydefault;
        if (view != null) {
            view.setLayoutParams(this.AkhnZx.OLrzqt(view.getLayoutParams(), z));
        }
    }

    public void KWHzl(int i) {
        boolean z = i != 2;
        this.KWHzl = z;
        if (!z || this.djBIcL == null) {
            return;
        }
        C7840arS.copydefault(this.AYXKKw);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (this.AEQbTJ && i == getItemCount() - 1) {
            return -2L;
        }
        java.util.List<android.view.View> list = this.OLrzqt;
        int size = list != null ? list.size() : 0;
        if (i < size) {
            return -1L;
        }
        return this.AkhnZx.AYXKKw(i - size);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.AEQbTJ && i == getItemCount() - 1) {
            return Integer.MIN_VALUE;
        }
        java.util.List<android.view.View> list = this.OLrzqt;
        int size = list != null ? list.size() : 0;
        return i < size ? -(i + 1) : this.AkhnZx.values(i - size);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C7354aiJ onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        if (i != Integer.MIN_VALUE) {
            if (i < 0) {
                return AEQbTJ(this.OLrzqt.get(AEQbTJ(i)));
            }
            return EZpvd(viewGroup, i);
        }
        android.view.View viewOLrzqt = ((InterfaceC8006aua) this.AhwBna.copydefault()).OLrzqt();
        viewOLrzqt.setOnClickListener(new Application());
        viewOLrzqt.setLayoutParams(this.AkhnZx.OLrzqt(viewOLrzqt.getLayoutParams(), this.values));
        C7354aiJ c7354aiJ = new C7354aiJ(viewOLrzqt);
        c7354aiJ.KWHzl = getItemCount();
        this.copydefault = viewOLrzqt;
        return c7354aiJ;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C7354aiJ c7354aiJ, int i) {
        if (c7354aiJ.copydefault()) {
            c7354aiJ.KWHzl = getItemCount();
            return;
        }
        if (c7354aiJ.KWHzl()) {
            if (this.AkhnZx.ejfBZ()) {
                C7350aiF c7350aiFCopydefault = this.AkhnZx.copydefault(i);
                android.view.View viewEZpvd = c7354aiJ.EZpvd();
                if (viewEZpvd != null) {
                    EZpvd(viewEZpvd, c7350aiFCopydefault);
                }
                this.AkhnZx.AEQbTJ(c7354aiJ.OLrzqt(), i);
                KWHzl(c7354aiJ.EZpvd());
                return;
            }
            return;
        }
        if (this.AkhnZx.OLrzqt()) {
            return;
        }
        int iKWHzl = KWHzl();
        if (this.AkhnZx.copydefault()) {
            C7350aiF c7350aiFKWHzl = this.AkhnZx.KWHzl(i - iKWHzl);
            android.view.View viewEZpvd2 = c7354aiJ.EZpvd();
            if (viewEZpvd2 != null) {
                EZpvd(viewEZpvd2, c7350aiFKWHzl, i);
            }
        }
        if (this.KWHzl || !C7330ahm.gEmmrt) {
            if (C7326ahi.EZpvd) {
                java.lang.System.currentTimeMillis();
                this.AkhnZx.EZpvd(c7354aiJ.OLrzqt(), i - iKWHzl);
            } else {
                this.AkhnZx.EZpvd(c7354aiJ.OLrzqt(), i - iKWHzl);
            }
        } else {
            if (this.djBIcL == null) {
                this.djBIcL = new java.util.HashMap<>();
            }
            this.djBIcL.put(c7354aiJ, java.lang.Integer.valueOf(i - iKWHzl));
        }
        if ((c7354aiJ.itemView instanceof android.widget.LinearLayout) && this.AkhnZx.KWHzl()) {
            if (((android.widget.LinearLayout) c7354aiJ.itemView).getChildCount() > 1) {
                ((android.widget.LinearLayout) c7354aiJ.itemView).removeViewAt(0);
            }
            if (this.AkhnZx.AEQbTJ(i)) {
                int iAkhnZx = this.AkhnZx.AkhnZx(i);
                android.view.View viewEZpvd3 = this.AkhnZx.EZpvd(i);
                if (viewEZpvd3 != null) {
                    ((android.widget.LinearLayout) c7354aiJ.itemView).addView(viewEZpvd3, 0, new ViewGroup.LayoutParams(-1, C7865arr.copydefault(iAkhnZx)));
                }
            }
        }
        int i2 = i - iKWHzl;
        c7354aiJ.KWHzl(this.AkhnZx.KWHzl(c7354aiJ.OLrzqt(), i2));
        c7354aiJ.KWHzl(this.AkhnZx.OLrzqt(c7354aiJ.OLrzqt(), i2));
        KWHzl(c7354aiJ.EZpvd());
        EZpvd(c7354aiJ.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.gEmmrt) {
            return 0;
        }
        int iFIwbmz = this.AkhnZx.fIwbmz();
        if (iFIwbmz < 0) {
            iFIwbmz = 0;
        }
        java.util.List<android.view.View> list = this.OLrzqt;
        return iFIwbmz + (this.AEQbTJ ? 1 : 0) + (list != null ? list.size() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r3v0, types: [o.aiw] */
    public final C7354aiJ EZpvd(android.view.ViewGroup viewGroup, int i) {
        C7322ahe c7322ahe = (C7322ahe) this.AkhnZx.getGlobals().AuCTel();
        if ((c7322ahe != null ? c7322ahe.AEQbTJ : null) == null) {
            return new C7354aiJ(new android.view.View(viewGroup.getContext()));
        }
        C7362aiR c7362aiR = new C7362aiR(this.AkhnZx.getGlobals(), this.AkhnZx);
        this.EZpvd.add(new WeakReference<>(c7362aiR));
        ?? F_ = c7362aiR.f_();
        ?? r0 = F_;
        if (this.AkhnZx.KWHzl()) {
            ?? linearLayout = new android.widget.LinearLayout(EZpvd().valueOf());
            linearLayout.setOrientation(1);
            linearLayout.addView(F_);
            r0 = linearLayout;
        }
        if (C7326ahi.EZpvd) {
            java.lang.System.currentTimeMillis();
            this.AkhnZx.copydefault(c7362aiR.OLrzqt(), i);
        } else {
            this.AkhnZx.copydefault(c7362aiR.OLrzqt(), i);
        }
        AEQbTJ(r0, i);
        C7354aiJ c7354aiJ = new C7354aiJ(r0, c7362aiR);
        KWHzl(r0);
        c7354aiJ.setIsRecyclable(this.AkhnZx.iwGUEr(i));
        return c7354aiJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    public final C7354aiJ AEQbTJ(android.view.View view) {
        C7362aiR c7362aiR = new C7362aiR(this.AkhnZx.getGlobals(), this.AkhnZx);
        this.EZpvd.add(new WeakReference<>(c7362aiR));
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) c7362aiR.f_();
        if (this.AkhnZx.ejfBZ()) {
            this.AkhnZx.copydefault(c7362aiR.OLrzqt());
        }
        viewGroup.addView(view);
        viewGroup.setLayoutParams(this.AkhnZx.OLrzqt((ViewGroup.LayoutParams) null, true));
        C7354aiJ c7354aiJ = new C7354aiJ(viewGroup, c7362aiR);
        KWHzl(viewGroup);
        return c7354aiJ;
    }

    public final void EZpvd(android.view.View view) {
        if (view.getTag() == null) {
            view.setTag(view.getBackground());
        }
        if (this.AkhnZx.AkhnZx()) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            C7808aqn c7808aqn = new C7808aqn();
            if (view.getBackground() instanceof C7808aqn) {
                C7808aqn c7808aqn2 = (C7808aqn) view.getBackground();
                c7808aqn.setStrokeWidth(c7808aqn2.getStrokeWidth());
                float[] radii = c7808aqn2.getRadii();
                if (radii != null && radii.length == 8) {
                    c7808aqn.OLrzqt(radii[0], radii[2], radii[4], radii[6]);
                }
            }
            c7808aqn.setBgColor(this.AkhnZx.values().AEQbTJ().getColor(this.AkhnZx.getGlobals()));
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, c7808aqn);
            view.setClickable(true);
            stateListDrawable.addState(new int[0], view.getBackground());
            view.setBackgroundDrawable(stateListDrawable);
            return;
        }
        if (view.getTag() instanceof android.graphics.drawable.Drawable) {
            view.setBackground((android.graphics.drawable.Drawable) view.getTag());
        }
    }

    public final void AEQbTJ(android.view.View view, int i) {
        EZpvd(view, this.AkhnZx.AhwBna(i));
    }

    public final void EZpvd(android.view.View view, C7350aiF c7350aiF) {
        EZpvd(view, c7350aiF, -1);
    }

    public final void EZpvd(android.view.View view, C7350aiF c7350aiF, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iCopydefault = c7350aiF.copydefault();
        int iAEQbTJ = c7350aiF.AEQbTJ();
        boolean z = true;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iCopydefault, iAEQbTJ);
        } else if (layoutParams.width == iCopydefault && layoutParams.height == iAEQbTJ) {
            z = false;
        } else {
            layoutParams.width = iCopydefault;
            layoutParams.height = iAEQbTJ;
        }
        if (z) {
            view.setLayoutParams(this.AkhnZx.OLrzqt(layoutParams, i));
        }
    }

    public void OLrzqt(C7354aiJ c7354aiJ) {
        if (this.AhwBna.OLrzqt(false)) {
            this.AkhnZx.getFieldNames();
        }
    }

    /* JADX INFO: renamed from: o.aiw$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public final class Application implements View.OnClickListener {
        public Application() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (C7393aiw.this.AhwBna.OLrzqt(true)) {
                if (C7393aiw.this.AhwBna.AEQbTJ() == 2) {
                    C7393aiw.this.AhwBna.gEmmrt();
                }
                C7393aiw.this.AkhnZx.getFieldNames();
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(C7354aiJ c7354aiJ) {
        super.onViewDetachedFromWindow(c7354aiJ);
        if (c7354aiJ.copydefault()) {
            return;
        }
        this.AkhnZx.copydefault(c7354aiJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(C7354aiJ c7354aiJ) {
        super.onViewAttachedToWindow(c7354aiJ);
        if (c7354aiJ.copydefault()) {
            OLrzqt(c7354aiJ);
        } else {
            this.AkhnZx.OLrzqt(c7354aiJ);
        }
    }

    public void KWHzl(android.view.View view) {
        if (C7326ahi.EZpvd) {
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams.leftMargin > 0 || marginLayoutParams.rightMargin > 0 || marginLayoutParams.topMargin > 0 || marginLayoutParams.bottomMargin > 0) {
                    C7833arL.KWHzl("Attention: TableViewAdapter`s contentView is not support Margins.");
                }
            }
        }
    }

    public void OLrzqt() {
        this.gEmmrt = true;
        this.OLrzqt = null;
        java.util.Iterator<WeakReference<C7362aiR>> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            C7362aiR c7362aiR = it.next().get();
            if (c7362aiR != null) {
                c7362aiR.EZpvd();
            }
        }
        this.EZpvd.clear();
        this.EZpvd = null;
        notifyDataSetChanged();
    }
}

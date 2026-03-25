package o;

import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC47982uAp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uAj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C47976uAj<T extends InterfaceC47982uAp> extends FragmentStateAdapter {
    public java.util.List<? extends T> AEQbTJ;
    public java.lang.Object KWHzl;
    public final java.util.HashMap<java.lang.Integer, java.lang.Long> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        this.KWHzl = bundle;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 androidx.fragment.app.FragmentManager)
  (r2v0 java.util.List)
  (r3v0 androidx.lifecycle.Lifecycle)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r4v0 java.lang.Object))
 A[MD:(androidx.fragment.app.FragmentManager, java.util.List<? extends T extends o.uAp>, androidx.lifecycle.Lifecycle, java.lang.Object):void (m)] (LINE:16) call: o.uAj.<init>(androidx.fragment.app.FragmentManager, java.util.List, androidx.lifecycle.Lifecycle, java.lang.Object):void type: THIS */
    public /* synthetic */ C47976uAj(androidx.fragment.app.FragmentManager fragmentManager, java.util.List list, Lifecycle lifecycle, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, list, lifecycle, (i & 8) != 0 ? null : obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47976uAj(androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.List<? extends T> list, @NotNull Lifecycle lifecycle, java.lang.Object obj) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(lifecycle, "");
        Intrinsics.copydefault(fragmentManager);
        this.copydefault = new java.util.HashMap<>();
        this.AEQbTJ = list;
        this.KWHzl = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47976uAj(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.util.List<? extends T> list, java.lang.Object obj) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = new java.util.HashMap<>();
        this.AEQbTJ = list;
        this.KWHzl = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 androidx.fragment.app.Fragment)
  (r2v0 java.util.List)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r3v0 java.lang.Object))
 A[MD:(androidx.fragment.app.Fragment, java.util.List<? extends T extends o.uAp>, java.lang.Object):void (m)] (LINE:25) call: o.uAj.<init>(androidx.fragment.app.Fragment, java.util.List, java.lang.Object):void type: THIS */
    public /* synthetic */ C47976uAj(androidx.fragment.app.Fragment fragment, java.util.List list, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, list, (i & 4) != 0 ? null : obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return this.AEQbTJ.get(i).getFragment(this.KWHzl);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        java.lang.Long lValueOf = this.copydefault.get(java.lang.Integer.valueOf(i));
        if (lValueOf == null) {
            lValueOf = java.lang.Long.valueOf(java.lang.System.nanoTime());
            this.copydefault.put(java.lang.Integer.valueOf(i), lValueOf);
        }
        return lValueOf.longValue();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public boolean containsItem(long j) {
        return this.copydefault.containsValue(java.lang.Long.valueOf(j));
    }

    public final void OLrzqt() {
        this.copydefault.clear();
    }
}

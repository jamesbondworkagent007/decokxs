package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.fDP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class fDJ extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public final java.util.HashMap<java.lang.Class<?>, fDP> AYXKKw;
    public boolean AkhnZx;
    public final fDP DbNXlk;
    public final TaskDescription KWHzl;
    public final java.util.HashMap<java.lang.Class<?>, fDN<java.lang.Object>> djBIcL;
    public final java.util.HashMap<java.lang.Integer, fDP> fARcdN;
    public int fetchVPNInfo;
    public final java.lang.Object gEmmrt;
    public boolean isConnected;
    public final java.util.HashMap<java.lang.Class<?>, java.lang.Integer> valueOf;
    public final java.lang.String AhwBna = fDJ.class.getSimpleName();
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.fDH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return fDJ.EZpvd();
        }
    });
    public final int EZpvd = Integer.MIN_VALUE;
    public final int OLrzqt = 32768;

    public abstract int AEQbTJ();

    public abstract fDL<java.lang.Object> AEQbTJ(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(boolean z) {
        this.isConnected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt(int i) {
        return i < 0 ? this.EZpvd : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.isConnected;
    }

    public fDJ() {
        TaskDescription taskDescription = new TaskDescription();
        this.KWHzl = taskDescription;
        this.DbNXlk = taskDescription;
        this.gEmmrt = new java.lang.Object();
        registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: o.fDJ.2
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int iAEQbTJ = fDJ.this.AEQbTJ();
                for (int i = 0; i < iAEQbTJ; i++) {
                    fDL<java.lang.Object> fdlAEQbTJ = fDJ.this.AEQbTJ(i);
                    if (fDJ.this.AYXKKw().contains(fdlAEQbTJ) || (fDJ.this.OLrzqt() && fdlAEQbTJ.AEQbTJ())) {
                        arrayList.add(fdlAEQbTJ);
                    }
                }
                fDJ.this.AYXKKw().clear();
                fDJ.this.AYXKKw().addAll(arrayList);
            }
        });
        this.AYXKKw = new java.util.HashMap<>();
        this.valueOf = new java.util.HashMap<>();
        this.djBIcL = new java.util.HashMap<>();
        this.fARcdN = new java.util.HashMap<>();
    }

    public final java.util.HashSet<fDL<java.lang.Object>> AYXKKw() {
        return (java.util.HashSet) this.values.getValue();
    }

    public static final java.util.HashSet EZpvd() {
        return new java.util.HashSet();
    }

    public static final class TaskDescription implements fDP {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.fDP
        public void OLrzqt(RecyclerView.ViewHolder viewHolder, java.lang.Object obj, int i) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(obj, "");
        }

        @Override // o.fDP
        public void AEQbTJ(RecyclerView.ViewHolder viewHolder) {
            fDP.Activity.copydefault(this, viewHolder);
        }

        @Override // o.fDP
        public RecyclerView.ViewHolder AEQbTJ(android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new ActionBar(new android.view.View(viewGroup.getContext()));
        }
    }

    public final void AEQbTJ(@NotNull java.lang.Class<?> cls, @NotNull fDP fdp) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(fdp, "");
        this.AYXKKw.put(cls, fdp);
        this.valueOf.put(cls, java.lang.Integer.valueOf(this.fetchVPNInfo));
        this.fARcdN.put(java.lang.Integer.valueOf(this.fetchVPNInfo), fdp);
        this.fetchVPNInfo++;
    }

    public final <T> void EZpvd(@NotNull java.lang.Class<?> cls, @NotNull fDN<T> fdn) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(fdn, "");
        this.djBIcL.put(cls, fdn);
    }

    public final boolean OLrzqt(@NotNull fDL<java.lang.Object> fdl) {
        Intrinsics.checkNotNullParameter(fdl, "");
        return AYXKKw().contains(fdl);
    }

    public final boolean KWHzl(@NotNull fDL<java.lang.Object> fdl) {
        Intrinsics.checkNotNullParameter(fdl, "");
        if (!fdl.AEQbTJ() || OLrzqt(fdl)) {
            return false;
        }
        AYXKKw().add(fdl);
        int iEZpvd = EZpvd(copydefault(fdl));
        notifyItemRangeInserted(iEZpvd + 1, fdl.OLrzqt());
        notifyItemChanged(iEZpvd, this.gEmmrt);
        return true;
    }

    public final int EZpvd(int i) {
        int iOLrzqt = i;
        for (fDL<java.lang.Object> fdl : AYXKKw()) {
            int iCopydefault = copydefault(fdl);
            if (iCopydefault >= 0 && iCopydefault < i) {
                iOLrzqt += fdl.OLrzqt();
            }
        }
        return iOLrzqt;
    }

    public final int copydefault(@NotNull fDL<java.lang.Object> fdl) {
        Intrinsics.checkNotNullParameter(fdl, "");
        int iAEQbTJ = AEQbTJ();
        for (int i = 0; i < iAEQbTJ; i++) {
            if (Intrinsics.EZpvd(fdl, AEQbTJ(i))) {
                return i;
            }
        }
        return -1;
    }

    public final boolean AEQbTJ(@NotNull fDL<java.lang.Object> fdl) {
        Intrinsics.checkNotNullParameter(fdl, "");
        if (!AYXKKw().remove(fdl)) {
            return false;
        }
        int iEZpvd = EZpvd(copydefault(fdl));
        notifyItemRangeRemoved(iEZpvd + 1, fdl.OLrzqt());
        notifyItemChanged(iEZpvd, this.gEmmrt);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        return copydefault(viewGroup, i);
    }

    public final RecyclerView.ViewHolder copydefault(android.view.ViewGroup viewGroup, int i) {
        if (this.fARcdN.containsKey(java.lang.Integer.valueOf(i))) {
            fDP fdp = this.fARcdN.get(java.lang.Integer.valueOf(i));
            Intrinsics.copydefault(fdp);
            return fdp.AEQbTJ(viewGroup, i);
        }
        return this.KWHzl.AEQbTJ(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int iAEQbTJ = AEQbTJ();
        if (iAEQbTJ == 0) {
            this.AkhnZx = true;
            return 0;
        }
        this.AkhnZx = false;
        for (fDL<java.lang.Object> fdl : AYXKKw()) {
            if (copydefault(fdl) < 0) {
                pUU.copydefault(this.AhwBna, "invalid index in expandgroupList : " + fdl);
            } else {
                iAEQbTJ += fdl.OLrzqt();
            }
        }
        return iAEQbTJ;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (this.fARcdN.containsKey(java.lang.Integer.valueOf(viewHolder.getItemViewType()))) {
            fDP fdp = this.fARcdN.get(java.lang.Integer.valueOf(viewHolder.getItemViewType()));
            Intrinsics.copydefault(fdp);
            fdp.OLrzqt(viewHolder, KWHzl(i), i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        super.onViewRecycled(viewHolder);
        fDP fdp = this.fARcdN.get(java.lang.Integer.valueOf(viewHolder.getItemViewType()));
        if (fdp != null) {
            fdp.AEQbTJ(viewHolder);
        }
    }

    public final java.lang.Object KWHzl(int i) {
        int[] iArrCopydefault = copydefault(i);
        fDL<java.lang.Object> fdlAEQbTJ = AEQbTJ(iArrCopydefault[0]);
        int i2 = iArrCopydefault[1];
        return i2 < 0 ? fdlAEQbTJ : fdlAEQbTJ.copydefault(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int[] iArrCopydefault = copydefault(i);
        fDL<java.lang.Object> fdlAEQbTJ = AEQbTJ(iArrCopydefault[0]);
        int i2 = iArrCopydefault[1];
        if (i2 < 0) {
            return OLrzqt(AEQbTJ(fdlAEQbTJ.getClass(), fdlAEQbTJ));
        }
        java.lang.Object objCopydefault = fdlAEQbTJ.copydefault(i2);
        return OLrzqt(AEQbTJ(objCopydefault.getClass(), objCopydefault));
    }

    public final int AEQbTJ(java.lang.Class<?> cls, java.lang.Object obj) {
        if (this.valueOf.containsKey(cls)) {
            java.lang.Integer num = this.valueOf.get(cls);
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
        fDN<java.lang.Object> fdnEZpvd = EZpvd(cls);
        if (fdnEZpvd == null) {
            return -1;
        }
        int iOLrzqt = fdnEZpvd.OLrzqt(obj) + this.OLrzqt;
        this.fARcdN.put(java.lang.Integer.valueOf(iOLrzqt), fdnEZpvd.EZpvd(obj));
        return iOLrzqt;
    }

    public final fDN<java.lang.Object> EZpvd(java.lang.Class<?> cls) {
        while (!Intrinsics.EZpvd(cls, java.lang.Object.class)) {
            if (this.djBIcL.get(cls) != null) {
                fDN<java.lang.Object> fdn = this.djBIcL.get(cls);
                Intrinsics.copydefault(fdn);
                return fdn;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public final int[] copydefault(int i) {
        int[] iArr = {-1, -1};
        int iAEQbTJ = AEQbTJ();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= iAEQbTJ) {
                break;
            }
            if (i3 == i) {
                iArr[0] = i2;
                iArr[1] = -1;
                break;
            }
            fDL<java.lang.Object> fdlAEQbTJ = AEQbTJ(i2);
            if (AYXKKw().contains(fdlAEQbTJ)) {
                int iOLrzqt = fdlAEQbTJ.OLrzqt();
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

    public static final class ActionBar extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
        }
    }
}

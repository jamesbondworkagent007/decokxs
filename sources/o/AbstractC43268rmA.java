package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.okinc.multitype.selection.Selectable;

/* JADX INFO: renamed from: o.rmA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC43268rmA<VH extends RecyclerView.ViewHolder> implements Selectable {
    public Selectable.Mode KWHzl;
    public RecyclerView.Adapter<VH> copydefault;
    public boolean EZpvd = true;
    public java.util.HashSet<java.lang.Integer> OLrzqt = new java.util.HashSet<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<java.lang.Integer> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(Selectable.Mode mode) {
        this.KWHzl = mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Selectable.Mode copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.EZpvd = z;
    }

    public AbstractC43268rmA(Selectable.Mode mode, RecyclerView.Adapter<VH> adapter) {
        this.KWHzl = mode;
        this.copydefault = adapter;
    }

    public boolean AEQbTJ(int i) {
        if (KWHzl(i)) {
            return EZpvd(i, !OLrzqt(i));
        }
        return false;
    }

    public boolean OLrzqt(int i) {
        return this.OLrzqt.contains(java.lang.Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: o.rmA$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[Selectable.Mode.values().length];
            OLrzqt = iArr;
            try {
                iArr[Selectable.Mode.Single.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                OLrzqt[Selectable.Mode.Multiple.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public boolean EZpvd(int i, boolean z) {
        if (!KWHzl(i)) {
            return false;
        }
        int i2 = AnonymousClass1.OLrzqt[copydefault().ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                if (z) {
                    this.OLrzqt.add(java.lang.Integer.valueOf(i));
                } else {
                    this.OLrzqt.remove(java.lang.Integer.valueOf(i));
                }
                AEQbTJ(i, OLrzqt());
            }
        } else {
            if (this.OLrzqt.size() > 1) {
                throw new java.lang.IllegalArgumentException("selected size can not over 1 in Single mode");
            }
            boolean zOLrzqt = OLrzqt();
            if (z) {
                java.util.Iterator<java.lang.Integer> it = this.OLrzqt.iterator();
                while (it.hasNext()) {
                    int iIntValue = it.next().intValue();
                    it.remove();
                    AEQbTJ(iIntValue, zOLrzqt);
                }
                this.OLrzqt.add(java.lang.Integer.valueOf(i));
                AEQbTJ(i, zOLrzqt);
            } else {
                this.OLrzqt.remove(java.lang.Integer.valueOf(i));
                AEQbTJ(i, zOLrzqt);
            }
        }
        return true;
    }

    public void gEmmrt() {
        this.OLrzqt.clear();
        AEQbTJ(0, this.copydefault.getItemCount(), OLrzqt());
    }

    public void KWHzl() {
        if (copydefault() == Selectable.Mode.Multiple) {
            boolean zOLrzqt = OLrzqt();
            int itemCount = this.copydefault.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                if (KWHzl(i)) {
                    this.OLrzqt.add(java.lang.Integer.valueOf(i));
                }
            }
            AEQbTJ(0, itemCount, zOLrzqt);
            return;
        }
        throw new java.lang.UnsupportedOperationException("selectAll can only invoke in multiple mode");
    }

    public final void AEQbTJ(int i, boolean z) {
        if (z) {
            this.copydefault.notifyItemChanged(i);
        }
    }

    public final void AEQbTJ(int i, int i2, boolean z) {
        if (z) {
            this.copydefault.notifyItemRangeChanged(i, i2);
        }
    }

    public int AEQbTJ() {
        return this.OLrzqt.size();
    }
}

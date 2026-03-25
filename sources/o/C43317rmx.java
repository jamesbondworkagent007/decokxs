package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.okinc.multitype.selection.Selectable;

/* JADX INFO: renamed from: o.rmx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43317rmx<VH extends RecyclerView.ViewHolder> extends C43271rmD<VH> implements Selectable {
    public AbstractC43268rmA OLrzqt;

    @Override // com.okinc.multitype.selection.Selectable
    public boolean KWHzl(int i) {
        return true;
    }

    public C43317rmx(RecyclerView.Adapter<VH> adapter, Selectable.Mode mode) {
        super(adapter);
        this.OLrzqt = new AbstractC43268rmA(mode, adapter) { // from class: o.rmx.2
            @Override // com.okinc.multitype.selection.Selectable
            public boolean KWHzl(int i) {
                return C43317rmx.this.KWHzl(i);
            }
        };
    }

    public void OLrzqt(boolean z) {
        this.OLrzqt.copydefault(z);
    }

    public Selectable.Mode OLrzqt() {
        return this.OLrzqt.copydefault();
    }

    public void EZpvd(Selectable.Mode mode) {
        this.OLrzqt.OLrzqt(mode);
    }

    public boolean AEQbTJ(int i) {
        return this.OLrzqt.AEQbTJ(i);
    }

    public boolean OLrzqt(int i) {
        return this.OLrzqt.OLrzqt(i);
    }

    public boolean AEQbTJ(int i, boolean z) {
        return this.OLrzqt.EZpvd(i, z);
    }

    public void AEQbTJ() {
        this.OLrzqt.gEmmrt();
    }

    public void EZpvd() {
        this.OLrzqt.KWHzl();
    }

    public int copydefault() {
        return this.OLrzqt.AEQbTJ();
    }

    public java.util.Set<java.lang.Integer> KWHzl() {
        return this.OLrzqt.EZpvd();
    }
}

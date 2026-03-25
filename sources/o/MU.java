package o;

import com.contrarywind.adapter.WheelAdapter;

/* JADX INFO: loaded from: classes2.dex */
public class MU implements WheelAdapter {
    public int KWHzl;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.contrarywind.adapter.WheelAdapter
    public int getItemsCount() {
        return (this.KWHzl - this.copydefault) + 1;
    }

    public MU(int i, int i2) {
        this.copydefault = i;
        this.KWHzl = i2;
    }

    @Override // com.contrarywind.adapter.WheelAdapter
    public java.lang.Object getItem(int i) {
        if (i >= 0 && i < getItemsCount()) {
            return java.lang.Integer.valueOf(this.copydefault + i);
        }
        return 0;
    }

    @Override // com.contrarywind.adapter.WheelAdapter
    public int indexOf(java.lang.Object obj) {
        try {
            return ((java.lang.Integer) obj).intValue() - this.copydefault;
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }
}

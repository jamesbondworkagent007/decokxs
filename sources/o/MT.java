package o;

import com.contrarywind.adapter.WheelAdapter;

/* JADX INFO: loaded from: classes2.dex */
public class MT<T> implements WheelAdapter {
    public java.util.List<T> EZpvd;

    public MT(java.util.List<T> list) {
        this.EZpvd = list;
    }

    @Override // com.contrarywind.adapter.WheelAdapter
    public java.lang.Object getItem(int i) {
        return (i < 0 || i >= this.EZpvd.size()) ? "" : this.EZpvd.get(i);
    }

    @Override // com.contrarywind.adapter.WheelAdapter
    public int getItemsCount() {
        return this.EZpvd.size();
    }

    @Override // com.contrarywind.adapter.WheelAdapter
    public int indexOf(java.lang.Object obj) {
        return this.EZpvd.indexOf(obj);
    }
}

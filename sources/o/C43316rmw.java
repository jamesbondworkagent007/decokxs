package o;

/* JADX INFO: renamed from: o.rmw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43316rmw extends C59534zip {
    public void AhwBna(java.util.List<?> list) {
        getItems().clear();
        setItems(list);
        notifyDataSetChanged();
    }

    public <T> T AEQbTJ(int i) {
        if (i < 0 || i > getItemCount() - 1) {
            return null;
        }
        return (T) getItems().get(i);
    }
}

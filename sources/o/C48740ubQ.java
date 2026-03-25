package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.referral.mlnservice.view.UDGalleryLayout;

/* JADX INFO: renamed from: o.ubQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C48740ubQ extends C7347aiC {
    public android.content.Context AEQbTJ;
    public int KWHzl;
    public int OLrzqt;

    public C48740ubQ(int i, int i2, UDGalleryLayout uDGalleryLayout, android.content.Context context) {
        super(uDGalleryLayout);
        this.KWHzl = i;
        this.OLrzqt = i2;
        this.AEQbTJ = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@androidx.annotation.NonNull android.graphics.Rect rect, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (recyclerView.getAdapter() != null) {
            int itemCount = recyclerView.getAdapter().getItemCount();
            android.content.Context context = this.AEQbTJ;
            boolean z = context != null ? context.getResources().getConfiguration().getLayoutDirection() == 1 : C7326ahi.OLrzqt().getResources().getConfiguration().getLayoutDirection() == 1;
            if (childAdapterPosition == 0) {
                if (z) {
                    rect.set(this.KWHzl, 0, this.OLrzqt, 0);
                    return;
                } else {
                    rect.set(this.OLrzqt, 0, this.KWHzl, 0);
                    return;
                }
            }
            if (childAdapterPosition != itemCount - 1) {
                int i = this.KWHzl;
                rect.set(i, 0, i, 0);
            } else if (z) {
                rect.set(this.OLrzqt, 0, this.KWHzl, 0);
            } else {
                rect.set(this.KWHzl, 0, this.OLrzqt, 0);
            }
        }
    }
}

package o;

import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aiB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7346aiB extends C7347aiC {
    public C7346aiB(UDBaseRecyclerLayout uDBaseRecyclerLayout) {
        super(uDBaseRecyclerLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@androidx.annotation.NonNull @NotNull android.graphics.Rect rect, @androidx.annotation.NonNull @NotNull android.view.View view, @androidx.annotation.NonNull @NotNull RecyclerView recyclerView, @androidx.annotation.NonNull @NotNull RecyclerView.State state) {
        int iGEmmrt = this.EZpvd.gEmmrt();
        int iDjBIcL = this.EZpvd.djBIcL();
        if (this.EZpvd.AYXKKw() == 1) {
            int i = iGEmmrt / 2;
            rect.left = i;
            rect.right = i;
            rect.top = 0;
            rect.bottom = iDjBIcL;
        } else {
            rect.left = 0;
            rect.right = iGEmmrt;
            int i2 = iDjBIcL / 2;
            rect.top = i2;
            rect.bottom = i2;
        }
        C55296xhK.EZpvd(rect, C55296xhK.AEQbTJ(recyclerView));
    }
}

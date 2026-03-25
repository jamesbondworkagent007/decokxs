package o;

import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55107xdh extends RecyclerView.ItemDecoration {
    public android.content.Context AEQbTJ;
    public int AYXKKw;
    public final android.graphics.Paint AhwBna;
    public final android.graphics.Rect EZpvd;
    public final float KWHzl;
    public int OLrzqt;
    public final boolean copydefault;
    public java.util.List<? extends InterfaceC55105xdf> djBIcL;
    public int fetchVPNInfo;
    public int gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55107xdh EZpvd(int i) {
        this.gEmmrt = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55107xdh EZpvd(@NotNull java.util.List<? extends InterfaceC55105xdf> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.djBIcL = list;
        return this;
    }

    public C55107xdh(@NotNull android.content.Context context, @NotNull java.util.List<? extends InterfaceC55105xdf> list, @androidx.annotation.ColorInt int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = context;
        this.djBIcL = list;
        this.gEmmrt = i;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.AhwBna = paint;
        this.EZpvd = new android.graphics.Rect();
        this.fetchVPNInfo = ContextCompat.getColor(this.AEQbTJ, C52761wXj.Activity.aappFQ);
        this.copydefault = C55296xhK.OLrzqt(this.AEQbTJ);
        this.valueOf = C55298xhM.KWHzl(40.0f, this.AEQbTJ);
        int iKWHzl = C55298xhM.KWHzl(12.0f, this.AEQbTJ);
        this.AYXKKw = iKWHzl;
        paint.setTextSize(iKWHzl);
        paint.setAntiAlias(true);
        this.KWHzl = new C52771wXt(this.AEQbTJ).AEQbTJ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.onDraw(canvas, recyclerView, state);
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            int viewLayoutPosition = layoutParams2.getViewLayoutPosition() - this.OLrzqt;
            if (!this.djBIcL.isEmpty() && viewLayoutPosition <= this.djBIcL.size() - 1 && viewLayoutPosition >= 0 && this.djBIcL.get(viewLayoutPosition).getShowSuspension() && viewLayoutPosition > -1) {
                if (viewLayoutPosition == 0) {
                    if (!android.text.TextUtils.isEmpty(this.djBIcL.get(viewLayoutPosition).getSuspensionTag())) {
                        Intrinsics.copydefault(childAt);
                        EZpvd(canvas, paddingLeft, width, childAt, layoutParams2, viewLayoutPosition);
                    }
                } else if (!android.text.TextUtils.isEmpty(this.djBIcL.get(viewLayoutPosition).getSuspensionTag()) && !Intrinsics.EZpvd((java.lang.Object) this.djBIcL.get(viewLayoutPosition).getSuspensionTag(), (java.lang.Object) this.djBIcL.get(viewLayoutPosition - 1).getSuspensionTag())) {
                    Intrinsics.copydefault(childAt);
                    EZpvd(canvas, paddingLeft, width, childAt, layoutParams2, viewLayoutPosition);
                }
            }
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas, int i, int i2, android.view.View view, RecyclerView.LayoutParams layoutParams, int i3) {
        java.lang.String suspensionTag = this.djBIcL.get(i3).getSuspensionTag();
        if (suspensionTag == null || suspensionTag.length() == 0) {
            return;
        }
        int i4 = this.gEmmrt;
        if (i4 != 0) {
            this.AhwBna.setColor(i4);
            canvas.drawRect(i, (view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.valueOf, i2, view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, this.AhwBna);
        }
        android.graphics.Paint paint = this.AhwBna;
        paint.setColor(this.fetchVPNInfo);
        paint.getTextBounds(suspensionTag, 0, suspensionTag.length(), this.EZpvd);
        float top = (view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - C55298xhM.OLrzqt(8, this.AEQbTJ);
        float fWidth = this.KWHzl;
        java.lang.String suspensionTag2 = this.djBIcL.get(i3).getSuspensionTag();
        Intrinsics.copydefault((java.lang.Object) suspensionTag2);
        if (this.copydefault) {
            fWidth = (i2 - fWidth) - this.EZpvd.width();
        }
        canvas.drawText(suspensionTag2, fWidth, top, this.AhwBna);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        java.lang.String suspensionTag;
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        Intrinsics.copydefault(linearLayoutManager);
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition() - this.OLrzqt;
        if (this.djBIcL.isEmpty()) {
            return;
        }
        boolean z = true;
        if (iFindFirstVisibleItemPosition > this.djBIcL.size() - 1 || iFindFirstVisibleItemPosition < 0 || !this.djBIcL.get(iFindFirstVisibleItemPosition).getShowSuspension() || (suspensionTag = this.djBIcL.get(iFindFirstVisibleItemPosition).getSuspensionTag()) == null || suspensionTag.length() == 0) {
            return;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(this.OLrzqt + iFindFirstVisibleItemPosition);
        Intrinsics.copydefault(viewHolderFindViewHolderForLayoutPosition);
        android.view.View view = viewHolderFindViewHolderForLayoutPosition.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        int i = iFindFirstVisibleItemPosition + 1;
        if (i >= this.djBIcL.size() || Intrinsics.EZpvd((java.lang.Object) suspensionTag, (java.lang.Object) this.djBIcL.get(i).getSuspensionTag()) || view.getHeight() + view.getTop() >= this.valueOf) {
            z = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, (view.getHeight() + view.getTop()) - this.valueOf);
        }
        int i2 = this.gEmmrt;
        if (i2 != 0) {
            this.AhwBna.setColor(i2);
            canvas.drawRect(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getRight() - recyclerView.getPaddingRight(), recyclerView.getPaddingTop() + this.valueOf, this.AhwBna);
        }
        this.AhwBna.setColor(this.fetchVPNInfo);
        this.AhwBna.getTextBounds(suspensionTag, 0, suspensionTag.length(), this.EZpvd);
        float paddingTop = (recyclerView.getPaddingTop() + this.valueOf) - C55298xhM.OLrzqt(8, this.AEQbTJ);
        float width = this.KWHzl;
        if (this.copydefault) {
            width = (recyclerView.getWidth() - width) - this.EZpvd.width();
        }
        canvas.drawText(suspensionTag, width, paddingTop, this.AhwBna);
        if (z) {
            canvas.restore();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.getItemOffsets(rect, view, recyclerView, state);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        int viewLayoutPosition = ((RecyclerView.LayoutParams) layoutParams).getViewLayoutPosition() - this.OLrzqt;
        if (this.djBIcL.isEmpty() || viewLayoutPosition > this.djBIcL.size() - 1 || viewLayoutPosition <= -1) {
            return;
        }
        InterfaceC55105xdf interfaceC55105xdf = this.djBIcL.get(viewLayoutPosition);
        if (!interfaceC55105xdf.getShowSuspension() || android.text.TextUtils.isEmpty(interfaceC55105xdf.getSuspensionTag())) {
            return;
        }
        if (viewLayoutPosition == 0) {
            rect.set(0, this.valueOf, 0, 0);
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) interfaceC55105xdf.getSuspensionTag(), (java.lang.Object) this.djBIcL.get(viewLayoutPosition - 1).getSuspensionTag())) {
                return;
            }
            rect.set(0, this.valueOf, 0, 0);
        }
    }
}

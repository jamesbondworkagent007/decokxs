package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iTy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24074iTy extends AbstractC59533zio<C24073iTx, C24075iTz> {
    public final float EZpvd;
    public final java.lang.String KWHzl;
    public int OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.wXj.TaskDescription.HJWChPRGtXKCDKRTZD int) : (r2v0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (96.0f float) : (r3v0 float))
 A[MD:(java.lang.String, int, float):void (m)] (LINE:14) call: o.iTy.<init>(java.lang.String, int, float):void type: THIS */
    public /* synthetic */ C24074iTy(java.lang.String str, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? C52761wXj.TaskDescription.HJWChPRGtXKCDKRTZD : i, (i2 & 4) != 0 ? 96.0f : f);
    }

    public C24074iTy(@NotNull java.lang.String str, @androidx.annotation.DrawableRes int i, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.OLrzqt = i;
        this.EZpvd = f;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C24075iTz onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.TarCU, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new C24075iTz(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C24075iTz c24075iTz, @NotNull C24073iTx c24073iTx) {
        Intrinsics.checkNotNullParameter(c24075iTz, "");
        Intrinsics.checkNotNullParameter(c24073iTx, "");
        c24075iTz.EZpvd(this.KWHzl);
        c24075iTz.KWHzl(this.OLrzqt);
        ViewGroup.LayoutParams layoutParams = c24075iTz.itemView.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C55298xhM.dp2px$default(this.EZpvd, null, 1, null);
        c24075iTz.itemView.setLayoutParams(layoutParams2);
    }
}

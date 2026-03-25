package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wyo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54145wyo extends AbstractC59533zio<AutoVipProfitInfo, C54147wyq> {
    public final boolean EZpvd;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C54145wyo() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(int, boolean):void (m)] (LINE:11) call: o.wyo.<init>(int, boolean):void type: THIS */
    public /* synthetic */ C54145wyo(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
    }

    public C54145wyo(int i, boolean z) {
        this.copydefault = i;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C54147wyq onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C54154wyx c54154wyx = new C54154wyx(context, null, 0, 6, null);
        c54154wyx.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        int i = this.copydefault;
        if (i > 0) {
            int iDp2px$default = C55298xhM.dp2px$default(i, null, 1, null);
            c54154wyx.setPadding(c54154wyx.getPaddingLeft(), iDp2px$default, c54154wyx.getPaddingRight(), iDp2px$default);
        }
        return new C54147wyq(c54154wyx);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C54147wyq c54147wyq, @NotNull AutoVipProfitInfo autoVipProfitInfo) {
        Intrinsics.checkNotNullParameter(c54147wyq, "");
        Intrinsics.checkNotNullParameter(autoVipProfitInfo, "");
        c54147wyq.OLrzqt().OLrzqt(new AutoVipProfitInfo((java.util.List) autoVipProfitInfo.getAutoEarn(), (java.util.List) autoVipProfitInfo.getAutoStake(), autoVipProfitInfo.getVipLevel(), false, false, 24, (DefaultConstructorMarker) null), (250 & 2) != 0 ? false : false, (250 & 4) != 0 ? false : false, (250 & 8) != 0 ? false : this.EZpvd, (250 & 16) != 0 ? false : false, (250 & 32) == 0 ? false : false, (250 & 64) != 0 ? "" : null, (250 & 128) != 0 ? null : null);
    }
}

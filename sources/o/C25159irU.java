package o;

import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.irU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25159irU extends C43318rmy<TransactionHeaderInfoBean, AbstractC23443hyN> {
    public final boolean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25159irU() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:10) call: o.irU.<init>(boolean):void type: THIS */
    public /* synthetic */ C25159irU(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public C25159irU(boolean z) {
        super(C23274hvD.Activity.gwTjWJ, 0);
        this.EZpvd = z;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC23443hyN> c43312rms, @NotNull TransactionHeaderInfoBean transactionHeaderInfoBean) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(transactionHeaderInfoBean, "");
        ((AbstractC23443hyN) c43312rms.OLrzqt()).AEQbTJ.setViewDataBean(transactionHeaderInfoBean);
        if (this.EZpvd) {
            ((AbstractC23443hyN) c43312rms.OLrzqt()).AEQbTJ.EZpvd().setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
        }
    }
}

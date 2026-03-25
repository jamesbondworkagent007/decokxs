package o;

import com.okinc.web3Uilib.bean.TransactionGeneralInfoBean;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.irT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25158irT extends C43318rmy<TransactionGeneralInfoBean, AbstractC23448hyS> {
    public C25158irT() {
        super(C23274hvD.Activity.RdAHlO, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC23448hyS> c43312rms, @NotNull TransactionGeneralInfoBean transactionGeneralInfoBean) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(transactionGeneralInfoBean, "");
        ((AbstractC23448hyS) c43312rms.OLrzqt()).copydefault.setViewDataBean(transactionGeneralInfoBean);
    }
}

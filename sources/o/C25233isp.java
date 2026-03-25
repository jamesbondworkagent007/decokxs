package o;

import com.okinc.web3Uilib.bean.TransactionAddressInfoBean;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.isp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25233isp extends C43318rmy<TransactionAddressInfoBean, AbstractC23523hzo> {
    public C25233isp() {
        super(C23274hvD.Activity.QSLkRj, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC23523hzo> c43312rms, @NotNull TransactionAddressInfoBean transactionAddressInfoBean) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(transactionAddressInfoBean, "");
        ((AbstractC23523hzo) c43312rms.OLrzqt()).OLrzqt.setViewDataBean(transactionAddressInfoBean);
    }
}

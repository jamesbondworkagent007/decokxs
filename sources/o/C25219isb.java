package o;

import com.okinc.web3Uilib.bean.TransactionGeneralInfoBean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.isb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25219isb extends C43318rmy<C25145irG, AbstractC23510hzb> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AEQbTJ() {
        return "--";
    }

    public C25219isb() {
        super(C23274hvD.Activity.hBpjJd, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC23510hzb> c43312rms, @NotNull C25145irG c25145irG) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c25145irG, "");
        java.lang.String strEZpvd = c25145irG.EZpvd();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
            str = pTB.formatUpToMax$default(C33129mqd.EZpvd(C23313hvq.divCheckS$default(strEZpvd, 60, null, null, null, 14, null)), 0, null, 2, null) + C33070mpX.AYXKKw(C23274hvD.Fragment.gdLjtZ);
        }
        ((AbstractC23510hzb) c43312rms.OLrzqt()).copydefault.setViewDataBean(new TransactionGeneralInfoBean(C33070mpX.AYXKKw(C23274hvD.Fragment.invokespecialaVhqwO), false, C31256lqb.KWHzl(str, (Function0<java.lang.String>) new Function0() { // from class: o.isa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25219isb.AEQbTJ();
            }
        }), null, null, null, null, null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524282, null));
    }
}

package o;

import android.view.View;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.ui.screens.transaction.itembinder.TransactionPathItemBinder$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jhx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26739jhx extends AbstractC27119jpF<InterfaceC24178iXu.VoiceInteractor, iJC> {
    public final boolean KWHzl;
    public final Function1<InvestSubscriptionReceiveInfoUIBean, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C26739jhx(Function1<? super InvestSubscriptionReceiveInfoUIBean, Unit> function1, boolean z) {
        super(TransactionPathItemBinder$1.INSTANCE);
        this.copydefault = function1;
        this.KWHzl = z;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC27119jpF
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull final iJC ijc, @NotNull InterfaceC24178iXu.VoiceInteractor voiceInteractor) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(ijc, "");
        Intrinsics.checkNotNullParameter(voiceInteractor, "");
        InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBeanCopydefault = iCP.copydefault(voiceInteractor);
        ijc.KWHzl.EZpvd(voiceInteractor.djBIcL() == 2, this.KWHzl);
        C27187jqU c27187jqU = ijc.KWHzl;
        if (C25478ixV.AEQbTJ(voiceInteractor.djBIcL())) {
            strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.DQzvGNdrmXxu);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.fTEjYi);
        }
        c27187jqU.setTitle(strAYXKKw);
        ijc.KWHzl.setProcessClickListener(new View.OnClickListener() { // from class: o.jhy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26739jhx.EZpvd(ijc, this, view);
            }
        });
        ijc.KWHzl.setData(investSubscriptionReceiveInfoUIBeanCopydefault);
    }

    public static final void EZpvd(iJC ijc, C26739jhx c26739jhx, android.view.View view) {
        Function1<InvestSubscriptionReceiveInfoUIBean, Unit> function1;
        InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBeanAEQbTJ = ijc.KWHzl.AEQbTJ();
        if (investSubscriptionReceiveInfoUIBeanAEQbTJ == null || (function1 = c26739jhx.copydefault) == null) {
            return;
        }
        function1.invoke(investSubscriptionReceiveInfoUIBeanAEQbTJ);
    }
}

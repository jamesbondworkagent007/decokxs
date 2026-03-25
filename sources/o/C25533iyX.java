package o;

import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseFailedException;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C25493ixk;
import o.InterfaceC25530iyU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iyX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25533iyX implements InterfaceC25527iyR {
    public final C26684jgv OLrzqt;
    public final InterfaceC25466ixJ copydefault;

    public C25533iyX(@NotNull InterfaceC25466ixJ interfaceC25466ixJ, @NotNull C26684jgv c26684jgv) {
        Intrinsics.checkNotNullParameter(interfaceC25466ixJ, "");
        Intrinsics.checkNotNullParameter(c26684jgv, "");
        this.copydefault = interfaceC25466ixJ;
        this.OLrzqt = c26684jgv;
    }

    public final android.app.Activity OLrzqt() {
        InterfaceC25466ixJ interfaceC25466ixJ = (InterfaceC25466ixJ) new WeakReference(this.copydefault).get();
        if (interfaceC25466ixJ != null) {
            return interfaceC25466ixJ.EZpvd();
        }
        return null;
    }

    @Override // o.InterfaceC25527iyR
    public void KWHzl(java.lang.Long l, java.lang.Long l2, InvestAction investAction) {
        this.OLrzqt.copydefault(l, l2, investAction);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: o.ixJ */
    /* JADX DEBUG: Multi-variable search result rejected for r4v11, resolved type: o.ixJ */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: o.ixJ */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC25527iyR
    public void copydefault(@NotNull InterfaceC25530iyU interfaceC25530iyU) {
        Intrinsics.checkNotNullParameter(interfaceC25530iyU, "");
        InterfaceC25466ixJ interfaceC25466ixJ = this.copydefault;
        AbstractC32996moC abstractC32996moC = interfaceC25466ixJ instanceof AbstractC32996moC ? (AbstractC32996moC) interfaceC25466ixJ : null;
        if (abstractC32996moC != null) {
            abstractC32996moC.dismissLoading();
        }
        if (interfaceC25530iyU instanceof InterfaceC25530iyU.ActionBar) {
            EZpvd("confirm_button");
            InterfaceC25530iyU.ActionBar actionBar = (InterfaceC25530iyU.ActionBar) interfaceC25530iyU;
            AEQbTJ(actionBar.copydefault(), actionBar.KWHzl(), actionBar.AEQbTJ());
            InterfaceC25466ixJ interfaceC25466ixJ2 = this.copydefault;
            wXX wxx = interfaceC25466ixJ2 instanceof wXX ? (wXX) interfaceC25466ixJ2 : null;
            if (wxx != null) {
                wxx.dismissAllowingStateLoss();
                return;
            }
            return;
        }
        if (interfaceC25530iyU instanceof InterfaceC25530iyU.Application) {
            InterfaceC25530iyU.Application application = (InterfaceC25530iyU.Application) interfaceC25530iyU;
            if (!application.copydefault()) {
                copydefault(application.KWHzl());
                return;
            }
            pUU.copydefault(application.KWHzl() + " " + application.AEQbTJ());
            return;
        }
        if (interfaceC25530iyU instanceof InterfaceC25530iyU.StateListAnimator) {
            EZpvd(EopTrackEvent.CLOSE);
            return;
        }
        if (!(interfaceC25530iyU instanceof InterfaceC25530iyU.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC25466ixJ interfaceC25466ixJ3 = this.copydefault;
        AbstractC32996moC abstractC32996moC2 = interfaceC25466ixJ3 instanceof AbstractC32996moC ? (AbstractC32996moC) interfaceC25466ixJ3 : null;
        if (abstractC32996moC2 != null) {
            abstractC32996moC2.dismissLoading();
        }
    }

    public final void EZpvd(java.lang.String str) {
        this.OLrzqt.OLrzqt(str);
    }

    public final void AEQbTJ(android.os.Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData, InvestmentKind investmentKind) {
        android.app.Activity activityOLrzqt = OLrzqt();
        if (activityOLrzqt != null) {
            C27508jwX.toTransactionResultPage$default(C27508jwX.AEQbTJ, activityOLrzqt, bundle, transactionResultExtraData, investmentKind.getValue(), null, null, 24, null);
        }
    }

    public final void copydefault(java.lang.Throwable th) {
        java.lang.String str;
        if (th instanceof ResponseFailedException) {
            java.lang.String message = th.getMessage();
            if (message != null) {
                strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV);
                if (message.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) message)) {
                    str = message;
                }
            }
            C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        if (th instanceof OKServerException) {
            java.lang.String message2 = th.getMessage();
            strAYXKKw = C33129mqd.OLrzqt((java.lang.CharSequence) message2) ? message2 : null;
            if (strAYXKKw == null) {
                strAYXKKw = C43422row.OLrzqt();
            }
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.zSsVtY);
        }
        str = strAYXKKw;
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }
}

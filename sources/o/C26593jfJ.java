package o;

import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC26670jgh;
import o.InterfaceC26561jee;
import o.iTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jfJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26593jfJ {
    public final InterfaceC25466ixJ AEQbTJ;
    public final java.lang.String EZpvd;
    public iTU.Application KWHzl;
    public final java.util.List<InvestPageSource> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull iTU.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.KWHzl = application;
    }

    public C26593jfJ(@NotNull InterfaceC25466ixJ interfaceC25466ixJ, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC25466ixJ, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = interfaceC25466ixJ;
        this.EZpvd = str;
        this.OLrzqt = C56402yEa.EZpvd(InvestPageSource.Home);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 o.ixJ)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(o.ixJ, java.lang.String):void (m)] (LINE:13) call: o.jfJ.<init>(o.ixJ, java.lang.String):void type: THIS */
    public /* synthetic */ C26593jfJ(InterfaceC25466ixJ interfaceC25466ixJ, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC25466ixJ, (i & 2) != 0 ? "" : str);
    }

    public final AbstractActivityC33041mov copydefault() {
        return this.AEQbTJ.EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jfJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleTransactionAction$default(C26593jfJ c26593jfJ, InterfaceC26561jee interfaceC26561jee, Function1 function1, int i, java.lang.Object obj) throws java.io.UnsupportedEncodingException {
        if ((i & 2) != 0) {
            function1 = null;
        }
        c26593jfJ.copydefault(interfaceC26561jee, function1);
    }

    public final void copydefault(@NotNull InterfaceC26561jee interfaceC26561jee, Function1<? super TransactionConfig, Unit> function1) throws java.io.UnsupportedEncodingException {
        AbstractActivityC33041mov abstractActivityC33041movCopydefault;
        Intrinsics.checkNotNullParameter(interfaceC26561jee, "");
        if (interfaceC26561jee instanceof InterfaceC26561jee.PendingIntent) {
            if (function1 != null) {
                function1.invoke(null);
            }
            AEQbTJ(((InterfaceC26561jee.PendingIntent) interfaceC26561jee).OLrzqt());
            return;
        }
        if (interfaceC26561jee instanceof InterfaceC26561jee.ActionBar) {
            InterfaceC26561jee.ActionBar actionBar = (InterfaceC26561jee.ActionBar) interfaceC26561jee;
            TransactionConfig transactionConfigOLrzqt = C26595jfL.OLrzqt(actionBar, this.EZpvd);
            if (function1 != null) {
                function1.invoke(transactionConfigOLrzqt);
            }
            if (!this.OLrzqt.contains(actionBar.copydefault()) || (abstractActivityC33041movCopydefault = copydefault()) == null) {
                return;
            }
            abstractActivityC33041movCopydefault.startActivity(ActivityC26670jgh.Activity.intent$default(ActivityC26670jgh.Companion, abstractActivityC33041movCopydefault, transactionConfigOLrzqt, 0, 4, null));
            return;
        }
        if (interfaceC26561jee instanceof InterfaceC26561jee.Application) {
            if (function1 != null) {
                function1.invoke(null);
            }
            iTU.Companion.OLrzqt(null, ((InterfaceC26561jee.Application) interfaceC26561jee).EZpvd(), this.KWHzl).show(this.AEQbTJ.OLrzqt(), iTU.class.getName());
        }
    }

    public final void AEQbTJ(InvestTipInfoVo investTipInfoVo) throws java.io.UnsupportedEncodingException {
        AbstractActivityC33041mov abstractActivityC33041movCopydefault = copydefault();
        if (abstractActivityC33041movCopydefault != null) {
            C27569jxf.OLrzqt.KWHzl(abstractActivityC33041movCopydefault, abstractActivityC33041movCopydefault.getSupportFragmentManager(), investTipInfoVo, (Function0<Unit>) ((24 & 8) != 0 ? null : null), (Function1<? super java.lang.String, Unit>) ((24 & 16) != 0 ? null : null));
        }
    }
}

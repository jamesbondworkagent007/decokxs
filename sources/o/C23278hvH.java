package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.api.bean.ChainListInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23278hvH extends AbstractC43215rlA implements InterfaceC9770bbp {
    public InterfaceC58217yxC AEQbTJ;

    @Override // o.InterfaceC9770bbp
    public void AEQbTJ(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        if (C22416heu.AkhnZx()) {
            return;
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        c22380heK.AEQbTJ("default_trade");
        C22380heK.initWsTools$default(c22380heK, null, null, 3, null);
        OLrzqt(fragmentActivity).OLrzqt();
        AbstractC58185ywX<ChainListInfo> abstractC58185ywXAF_ = c22380heK.copydefault("default_trade").AkhnZx().aF_();
        final Function1 function1 = new Function1() { // from class: o.hvG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23278hvH.EZpvd((ChainListInfo) obj);
            }
        };
        InterfaceC58227yxM<? super ChainListInfo> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hvN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23278hvH.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hvL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23278hvH.copydefault((java.lang.Throwable) obj);
            }
        };
        this.AEQbTJ = abstractC58185ywXAF_.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hvJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23278hvH.EZpvd(function12, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(ChainListInfo chainListInfo) {
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC9770bbp
    public void KWHzl(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        OLrzqt(fragmentActivity).copydefault();
        C22380heK c22380heK = C22380heK.OLrzqt;
        c22380heK.gEmmrt();
        c22380heK.OLrzqt("default_trade");
        this.AEQbTJ = null;
    }

    public final C19706gMh OLrzqt(FragmentActivity fragmentActivity) {
        C58114yvF c58114yvF = C58114yvF.EZpvd;
        return ((InterfaceC19733gNh) C58114yvF.OLrzqt(fragmentActivity, InterfaceC19733gNh.class)).AkhnZx();
    }
}

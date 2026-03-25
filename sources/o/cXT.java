package o;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.wallet.api.WalletAddressSwitchException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cXT extends AbstractC43215rlA implements xWB {
    public final C12827cuN AEQbTJ;
    public final C11205cFp EZpvd;
    public final InterfaceC54823xWq KWHzl;
    public final InterfaceC13844daJ OLrzqt;
    public final C10948byA copydefault;

    public cXT(@NotNull C12827cuN c12827cuN, @NotNull C10948byA c10948byA, @NotNull C11205cFp c11205cFp, @NotNull InterfaceC13844daJ interfaceC13844daJ, @NotNull InterfaceC54823xWq interfaceC54823xWq) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(c11205cFp, "");
        Intrinsics.checkNotNullParameter(interfaceC13844daJ, "");
        Intrinsics.checkNotNullParameter(interfaceC54823xWq, "");
        this.AEQbTJ = c12827cuN;
        this.copydefault = c10948byA;
        this.EZpvd = c11205cFp;
        this.OLrzqt = interfaceC13844daJ;
        this.KWHzl = interfaceC54823xWq;
    }

    @Override // o.xWB
    public void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, long j, @NotNull final InterfaceC9738bbJ interfaceC9738bbJ, @NotNull final xWC xwc) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        Intrinsics.checkNotNullParameter(xwc, "");
        if (!(interfaceC9738bbJ instanceof AbstractC12782ctV)) {
            xwc.OLrzqt(new WalletAddressSwitchException("wallet is not subtype of Wallet type", WalletAddressSwitchException.ErrorType.INVALID_WALLET));
            return;
        }
        final C10854bwM c10854bwMKWHzl = this.copydefault.KWHzl(java.lang.Long.valueOf(j));
        if (c10854bwMKWHzl == null) {
            xwc.OLrzqt(new WalletAddressSwitchException("coinId (" + j + ") is invalid", WalletAddressSwitchException.ErrorType.INVALID_COIN_ID));
            return;
        }
        if (!c10854bwMKWHzl.dxcTrN()) {
            xwc.OLrzqt(new WalletAddressSwitchException("coinId (" + j + ") does not support aggregation addresses", WalletAddressSwitchException.ErrorType.COIN_NOT_SUPPORT_AGGREGATION));
            return;
        }
        this.OLrzqt.AEQbTJ(fragmentManager, j, c10854bwMKWHzl.AEQbTJ(), ((AbstractC12782ctV) interfaceC9738bbJ).DbNXlk(), interfaceC9738bbJ.EZpvd(c10854bwMKWHzl.fetchVPNInfo()), new yHO() { // from class: o.cXS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return cXT.OLrzqt(this.EZpvd, c10854bwMKWHzl, interfaceC9738bbJ, xwc, (java.lang.String) obj, (java.lang.String) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }, new Function0() { // from class: o.cXU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return cXT.AEQbTJ(xwc);
            }
        });
    }

    public static final Unit OLrzqt(cXT cxt, C10854bwM c10854bwM, InterfaceC9738bbJ interfaceC9738bbJ, xWC xwc, java.lang.String str, java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        cxt.EZpvd(c10854bwM.fetchVPNInfo(), c10854bwM.AEQbTJ(), str, i, (AbstractC12782ctV) interfaceC9738bbJ, xwc);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(xWC xwc) {
        xwc.OLrzqt(new WalletAddressSwitchException("address switch cancelled", WalletAddressSwitchException.ErrorType.ADDRESS_SWITCH_CANCELLED));
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public final void EZpvd(final long j, long j2, final java.lang.String str, final int i, final AbstractC12782ctV abstractC12782ctV, final xWC xwc) {
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXOLrzqt = abstractC12782ctV.OLrzqt(j2, str, i);
        final Function1 function1 = new Function1() { // from class: o.cYb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cXT.OLrzqt(this.OLrzqt, abstractC12782ctV, (java.lang.Integer) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXCopydefault = abstractC58185ywXOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cXY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cXT.KWHzl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        C33024moe.subscribeOnIO$default(abstractC58185ywXCopydefault, new Function1() { // from class: o.cXZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cXT.OLrzqt(xwc, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.cXX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cXT.copydefault(this.KWHzl, j, str, xwc, i, (AbstractC12782ctV) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final InterfaceC58261yxu OLrzqt(cXT cxt, AbstractC12782ctV abstractC12782ctV, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return cxt.AEQbTJ.OLrzqt(abstractC12782ctV.DbNXlk(), false);
    }

    public static final Unit OLrzqt(xWC xwc, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        xwc.OLrzqt(th);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(cXT cxt, long j, java.lang.String str, xWC xwc, int i, AbstractC12782ctV abstractC12782ctV) {
        C11205cFp c11205cFp = cxt.EZpvd;
        java.util.ArrayList<ChainAddress> arrayListIsConnected = abstractC12782ctV.isConnected();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListIsConnected, 10));
        java.util.Iterator<T> it = arrayListIsConnected.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChainAddress) it.next()).getAddress());
        }
        c11205cFp.OLrzqt(arrayList);
        InterfaceC54823xWq interfaceC54823xWq = cxt.KWHzl;
        java.util.ArrayList<ChainAddress> arrayListGGvvIC = abstractC12782ctV.gGvvIC();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListGGvvIC) {
            if (((ChainAddress) obj).getChainId() == j) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((ChainAddress) it2.next()).getAddress());
        }
        interfaceC54823xWq.AEQbTJ(new xWY(j, str, arrayList3));
        xwc.KWHzl(str, i);
        return Unit.INSTANCE;
    }
}

package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.htt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23210htt {
    public final java.lang.String AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final java.util.List<C23174htJ> gEmmrt;
    public C58216yxB valueOf;

    public C23210htt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C23174htJ> list, boolean z, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.gEmmrt = list;
        this.OLrzqt = z;
        this.valueOf = new C58216yxB();
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.htw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23210htt.KWHzl(this.OLrzqt);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.htz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C23210htt.OLrzqt(this.OLrzqt, function1);
            }
        });
    }

    public final C57567ykp EZpvd() {
        return (C57567ykp) this.copydefault.getValue();
    }

    public static final C57567ykp KWHzl(C23210htt c23210htt) {
        if (c23210htt.OLrzqt) {
            return C22380heK.OLrzqt.copydefault(c23210htt.AEQbTJ).fARcdN().fetchVPNInfo();
        }
        return C22380heK.OLrzqt.copydefault(c23210htt.AEQbTJ).fARcdN().DbNXlk();
    }

    public final AbstractC57556yke KWHzl() {
        return (AbstractC57556yke) this.EZpvd.getValue();
    }

    public static final AbstractC57556yke OLrzqt(final C23210htt c23210htt, final Function1 function1) {
        return C57554ykc.Companion.AEQbTJ(c23210htt.KWHzl, c23210htt.EZpvd(), c23210htt.OLrzqt(), new Function2() { // from class: o.htB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C23210htt.copydefault(this.copydefault, function1, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
    }

    public static final Unit copydefault(C23210htt c23210htt, Function1 function1, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        try {
            Result.Application application = Result.Companion;
            java.lang.Object payload = oKIncomingData.getPayload();
            Intrinsics.copydefault(payload, "");
            function1.invoke((java.lang.String) payload);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public final java.util.ArrayList<WsArgV5ForWeb3> OLrzqt() {
        java.util.ArrayList<WsArgV5ForWeb3> arrayList = new java.util.ArrayList<>();
        for (C23174htJ c23174htJ : this.gEmmrt) {
            arrayList.add(new WsArgV5ForWeb3(this.KWHzl, null, c23174htJ.OLrzqt(), c23174htJ.EZpvd(), c23174htJ.AEQbTJ(), 2, null));
        }
        return arrayList;
    }

    public final void copydefault() {
        KWHzl().djBIcL();
        this.valueOf.OLrzqt();
    }

    public final void AEQbTJ() {
        if (this.OLrzqt) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXDjBIcL = C22380heK.OLrzqt.copydefault(this.AEQbTJ).fARcdN().djBIcL();
            final Function1 function1 = new Function1() { // from class: o.htA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C23210htt.OLrzqt(this.copydefault, (java.lang.Boolean) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hty
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C23210htt.KWHzl(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.htC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C23210htt.EZpvd(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            };
            this.valueOf.AEQbTJ(abstractC58185ywXDjBIcL.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.htH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C23210htt.OLrzqt(function12, obj);
                }
            }));
            return;
        }
        KWHzl().AhwBna();
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C23210htt c23210htt, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c23210htt.KWHzl().AhwBna();
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C23210htt c23210htt, java.lang.Throwable th) {
        c23210htt.copydefault();
        return Unit.INSTANCE;
    }
}

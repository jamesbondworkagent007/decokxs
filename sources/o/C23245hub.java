package o;

import com.okinc.business.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.business.dexlogic.main.market.bean.DexTokenCandleParam;
import com.okinc.network.okg.response.OKServerException;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23245hub extends AbstractC23178htN {
    public final WeakReference<InterfaceC23254huk> AEQbTJ;
    public InterfaceC58217yxC AYXKKw;
    public final java.lang.String djBIcL;
    public final java.lang.String valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23245hub(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull WeakReference<InterfaceC23254huk> weakReference) {
        super(str, str2);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.djBIcL = str;
        this.valueOf = str2;
        this.AEQbTJ = weakReference;
    }

    @Override // o.AbstractC23178htN
    public void KWHzl(@NotNull java.util.List<CandlesticksBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC23254huk interfaceC23254huk = this.AEQbTJ.get();
        if (interfaceC23254huk != null) {
            interfaceC23254huk.KWHzl(C21950hSi.OLrzqt.AEQbTJ(list), "websocket");
        }
    }

    public final void KWHzl(@NotNull final java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C22416heu.ejfBZ()) {
            return;
        }
        OLrzqt();
        java.lang.String str3 = this.djBIcL;
        java.lang.String str4 = this.valueOf;
        java.lang.String strSubstring = str.substring(6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        AbstractC58185ywX<java.util.List<CandlesticksBean>> abstractC58185ywXCopydefault = copydefault(new DexTokenCandleParam(str3, str4, null, null, strSubstring, "1440", str2, 12, null));
        final Function1 function1 = new Function1() { // from class: o.htY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23245hub.EZpvd(this.AEQbTJ, str, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<CandlesticksBean>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hua
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23245hub.valueOf(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.huc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23245hub.AEQbTJ(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        this.AYXKKw = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.huf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23245hub.gEmmrt(function12, obj);
            }
        });
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C23245hub c23245hub, java.lang.String str, java.util.List list) {
        InterfaceC23254huk interfaceC23254huk = c23245hub.AEQbTJ.get();
        if (interfaceC23254huk != null) {
            C21950hSi c21950hSi = C21950hSi.OLrzqt;
            Intrinsics.copydefault(list);
            interfaceC23254huk.KWHzl(C31187lpL.OLrzqt(c21950hSi.AEQbTJ((java.util.List<CandlesticksBean>) list)), "http");
        }
        c23245hub.OLrzqt();
        c23245hub.AEQbTJ(str);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C23245hub c23245hub, java.lang.Throwable th) {
        InterfaceC23254huk interfaceC23254huk = c23245hub.AEQbTJ.get();
        if (interfaceC23254huk != null) {
            java.lang.String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            interfaceC23254huk.AEQbTJ(message, "http");
        }
        InterfaceC23254huk interfaceC23254huk2 = c23245hub.AEQbTJ.get();
        if (interfaceC23254huk2 != null) {
            OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
            interfaceC23254huk2.KWHzl(C33129mqd.gEmmrt(oKServerException != null ? java.lang.Integer.valueOf(oKServerException.getCode()) : null));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<com.okinc.business.dexlogic.main.market.bean.CandlesticksBean>> */
    public final AbstractC58185ywX<java.util.List<CandlesticksBean>> copydefault(final DexTokenCandleParam dexTokenCandleParam) {
        if (C22416heu.ejfBZ()) {
            AbstractC58185ywX<java.util.List<CandlesticksBean>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(yDY.AhwBna());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<java.util.List<CandlesticksBean>> abstractC58185ywXOLrzqt = C22380heK.OLrzqt.copydefault("default_trade").isConnected().OLrzqt(dexTokenCandleParam);
        final Function1 function1 = new Function1() { // from class: o.hud
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23245hub.KWHzl(dexTokenCandleParam, (java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.hue
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C23245hub.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(DexTokenCandleParam dexTokenCandleParam, final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return C22380heK.OLrzqt.copydefault("default_trade").isConnected().AEQbTJ(DexTokenCandleParam.copy$default(dexTokenCandleParam, null, null, java.lang.String.valueOf(java.lang.System.currentTimeMillis()), null, null, null, null, 115, null));
        }
        return C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hug
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C23245hub.KWHzl(list, interfaceC58184ywW);
            }
        });
    }

    public static final void KWHzl(java.util.List list, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        interfaceC58184ywW.onNext(list);
    }

    public final void EZpvd() {
        InterfaceC58217yxC interfaceC58217yxC = this.AYXKKw;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        OLrzqt();
    }
}

package o;

import com.okinc.dexkline.dexlogic.main.market.bean.CandlesticksBean;
import com.okinc.dexkline.dexlogic.main.market.bean.DexTokenCandleParam;
import com.okinc.network.okg.response.OKServerException;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mRc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32144mRc extends mQS {
    public final java.lang.String AYXKKw;
    public InterfaceC58217yxC AhwBna;
    public final WeakReference<InterfaceC32157mRp> OLrzqt;
    public final java.lang.String djBIcL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32144mRc(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull WeakReference<InterfaceC32157mRp> weakReference) {
        super(str, str2);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(weakReference, "");
        this.djBIcL = str;
        this.AYXKKw = str2;
        this.OLrzqt = weakReference;
    }

    @Override // o.mQS
    public void OLrzqt(@NotNull java.util.List<CandlesticksBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC32157mRp interfaceC32157mRp = this.OLrzqt.get();
        if (interfaceC32157mRp != null) {
            interfaceC32157mRp.OLrzqt(mTT.EZpvd.EZpvd(list), "websocket");
        }
    }

    public final void copydefault(@NotNull final java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt();
        java.lang.String str3 = this.djBIcL;
        java.lang.String str4 = this.AYXKKw;
        java.lang.String strSubstring = str.substring(6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        AbstractC58185ywX<java.util.List<CandlesticksBean>> abstractC58185ywXEZpvd = EZpvd(new DexTokenCandleParam(str3, str4, null, null, strSubstring, "1440", str2, 12, null));
        final Function1 function1 = new Function1() { // from class: o.mRd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32144mRc.EZpvd(this.AEQbTJ, str, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<CandlesticksBean>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.mRf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C32144mRc.AhwBna(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.mRb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32144mRc.KWHzl(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        this.AhwBna = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.mRi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C32144mRc.valueOf(function12, obj);
            }
        });
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C32144mRc c32144mRc, java.lang.String str, java.util.List list) {
        InterfaceC32157mRp interfaceC32157mRp = c32144mRc.OLrzqt.get();
        if (interfaceC32157mRp != null) {
            mTT mtt = mTT.EZpvd;
            Intrinsics.copydefault(list);
            interfaceC32157mRp.OLrzqt(C34650ngB.EZpvd(mtt.EZpvd((java.util.List<CandlesticksBean>) list)), "http");
        }
        c32144mRc.copydefault(str);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C32144mRc c32144mRc, java.lang.Throwable th) {
        InterfaceC32157mRp interfaceC32157mRp = c32144mRc.OLrzqt.get();
        if (interfaceC32157mRp != null) {
            java.lang.String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            interfaceC32157mRp.EZpvd(message, "http");
        }
        InterfaceC32157mRp interfaceC32157mRp2 = c32144mRc.OLrzqt.get();
        if (interfaceC32157mRp2 != null) {
            OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
            interfaceC32157mRp2.EZpvd(C33129mqd.gEmmrt(oKServerException != null ? java.lang.Integer.valueOf(oKServerException.getCode()) : null));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<com.okinc.dexkline.dexlogic.main.market.bean.CandlesticksBean>> */
    public final AbstractC58185ywX<java.util.List<CandlesticksBean>> EZpvd(final DexTokenCandleParam dexTokenCandleParam) {
        AbstractC58185ywX<java.util.List<CandlesticksBean>> abstractC58185ywXOLrzqt = mPY.OLrzqt.copydefault("default_trade").KWHzl().OLrzqt(dexTokenCandleParam);
        final Function1 function1 = new Function1() { // from class: o.mRh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32144mRc.EZpvd(dexTokenCandleParam, (java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.mRg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C32144mRc.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(DexTokenCandleParam dexTokenCandleParam, final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return mPY.OLrzqt.copydefault("default_trade").KWHzl().KWHzl(DexTokenCandleParam.copy$default(dexTokenCandleParam, null, null, java.lang.String.valueOf(java.lang.System.currentTimeMillis()), null, null, null, null, 115, null));
        }
        return C32161mRt.AEQbTJ(new InterfaceC58187ywZ() { // from class: o.mRj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C32144mRc.OLrzqt(list, interfaceC58184ywW);
            }
        });
    }

    public static final void OLrzqt(java.util.List list, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        interfaceC58184ywW.onNext(list);
    }

    public final void OLrzqt() {
        InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        EZpvd();
    }
}

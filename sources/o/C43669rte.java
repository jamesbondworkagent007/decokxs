package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.nft.nftmarket.NFTApiService;
import com.okinc.nft.ui.kline.bean.CandlesticksBean;
import com.okinc.nft.ui.kline.bean.TokenCandleParam;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rte, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43669rte extends AbstractC43609rsX {
    public final InterfaceC43666rtb AkhnZx;
    public final java.lang.String DbNXlk;
    public InterfaceC58217yxC fetchVPNInfo;
    public final java.lang.String valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43669rte(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC43666rtb interfaceC43666rtb) {
        super(str, str2);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC43666rtb, "");
        this.valueOf = str;
        this.DbNXlk = str2;
        this.AkhnZx = interfaceC43666rtb;
    }

    /* JADX INFO: renamed from: o.rte$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rte.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.AbstractC43609rsX
    public void AEQbTJ(@NotNull java.util.List<CandlesticksBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AkhnZx.KWHzl(C43599rsN.copydefault.copydefault(list), "websocket");
    }

    public static /* synthetic */ void initKlineDataAndWsListener$default(C43669rte c43669rte, java.lang.String str, java.lang.String str2, WsArgV5ForWeb3 wsArgV5ForWeb3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            wsArgV5ForWeb3 = null;
        }
        c43669rte.EZpvd(str, str2, wsArgV5ForWeb3);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull final java.lang.String str2, final WsArgV5ForWeb3 wsArgV5ForWeb3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        copydefault();
        java.lang.String str3 = this.valueOf;
        java.lang.String str4 = this.DbNXlk;
        java.lang.String strSubstring = str.substring(6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        AbstractC58185ywX<java.util.List<CandlesticksBean>> abstractC58185ywXOLrzqt = OLrzqt(new TokenCandleParam(str3, str4, null, null, strSubstring, "1440", null, 76, null));
        final Function1 function1 = new Function1() { // from class: o.rtc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43669rte.EZpvd(this.OLrzqt, str2, wsArgV5ForWeb3, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<CandlesticksBean>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rtg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C43669rte.valueOf(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.rtd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43669rte.AEQbTJ(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        this.fetchVPNInfo = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rtf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C43669rte.AhwBna(function12, obj);
            }
        });
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C43669rte c43669rte, java.lang.String str, WsArgV5ForWeb3 wsArgV5ForWeb3, java.util.List list) {
        InterfaceC43666rtb interfaceC43666rtb = c43669rte.AkhnZx;
        C43599rsN c43599rsN = C43599rsN.copydefault;
        Intrinsics.copydefault(list);
        interfaceC43666rtb.KWHzl(C56405yEd.hDKMBd(c43599rsN.copydefault((java.util.List<CandlesticksBean>) list)), "http");
        c43669rte.OLrzqt(str, wsArgV5ForWeb3);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C43669rte c43669rte, java.lang.Throwable th) {
        InterfaceC43666rtb interfaceC43666rtb = c43669rte.AkhnZx;
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        interfaceC43666rtb.AEQbTJ(message, "http");
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<java.util.List<CandlesticksBean>> OLrzqt(TokenCandleParam tokenCandleParam) {
        return KWHzl(tokenCandleParam);
    }

    public final AbstractC58185ywX<java.util.List<CandlesticksBean>> KWHzl(final TokenCandleParam tokenCandleParam) {
        AbstractC58185ywX<ResponseData<java.util.List<java.util.List<java.lang.String>>>> tokenCandles = NFTApiService.Companion.copydefault(C43526rqu.AEQbTJ).getTokenCandles(tokenCandleParam.getChainId(), tokenCandleParam.getAddress(), tokenCandleParam.getAfter(), tokenCandleParam.getBefore(), tokenCandleParam.getBar(), tokenCandleParam.getLimit());
        final Function1 function1 = new Function1() { // from class: o.rtl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43669rte.KWHzl((ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = tokenCandles.AEQbTJ(new InterfaceC58229yxO() { // from class: o.rti
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C43669rte.djBIcL(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.rth
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43669rte.OLrzqt(tokenCandleParam, (java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.rtj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C43669rte.gEmmrt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return C33024moe.KWHzl(abstractC58185ywXKWHzl);
    }

    public static final java.util.List djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(TokenCandleParam tokenCandleParam, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return C43606rsU.EZpvd.OLrzqt(tokenCandleParam);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(list);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public final void AhwBna() {
        InterfaceC58217yxC interfaceC58217yxC = this.fetchVPNInfo;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        copydefault();
    }

    public static final java.util.List KWHzl(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            C43599rsN c43599rsN = C43599rsN.copydefault;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            return c43599rsN.AEQbTJ((java.util.List<? extends java.util.List<java.lang.String>>) data);
        }
        throw new java.lang.Exception(responseData.getMsg());
    }
}

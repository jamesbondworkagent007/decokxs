package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SimpleOptionProduct;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xFk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54357xFk extends xGQ<SimpleOptionProduct> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final C54286xCu AEQbTJ;
    public final AbstractC55716xpG EZpvd;
    public AbstractC57556yke KWHzl;
    public java.lang.String copydefault;
    public final java.lang.String djBIcL;

    @Override // o.xGQ
    public boolean AhwBna() {
        return false;
    }

    @Override // o.xGQ
    public boolean bC_() {
        return false;
    }

    public C54357xFk(@NotNull java.lang.String str, @NotNull AbstractC55716xpG abstractC55716xpG) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55716xpG, "");
        this.djBIcL = str;
        this.EZpvd = abstractC55716xpG;
        this.AEQbTJ = new C54286xCu();
        copydefault();
    }

    /* JADX INFO: renamed from: o.xFk$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xFk.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void copydefault() {
        C54286xCu c54286xCu = this.AEQbTJ;
        java.lang.String strCopydefault = this.EZpvd.copydefault();
        java.util.Locale locale = java.util.Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = strCopydefault.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        c54286xCu.AEQbTJ(upperCase);
        c54286xCu.KWHzl(new Function1() { // from class: o.xFn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54357xFk.AEQbTJ(this.copydefault, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54286xCu, 0L, 1, null);
    }

    public static final Unit AEQbTJ(C54357xFk c54357xFk, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        handleRecommendProductList$default(c54357xFk, responseData, null, 2, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void handleRecommendProductList$default(C54357xFk c54357xFk, ResponseData responseData, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "http";
        }
        c54357xFk.EZpvd((ResponseData<java.util.List<SimpleOptionProduct>>) responseData, str);
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        EZpvd();
        return true;
    }

    public AbstractC57556yke KWHzl() {
        java.lang.String strEZpvd = C56121xwo.copydefault.EZpvd(this.EZpvd.EZpvd());
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, strEZpvd, new WsArgV5(strEZpvd, null, this.EZpvd.copydefault(), null, null, null, null, null, 250, null), (Function1) null, 4, (java.lang.Object) null);
        this.KWHzl = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(2500L);
        pUU.KWHzl("TradeAutoSimpleOptionTask", "----->> subscribe channel --- " + strEZpvd);
        return this.KWHzl;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        OLrzqt(true);
        pUU.KWHzl("TradeAutoSimpleOptionTask", "----->> subscribe onMessage --- " + str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public SimpleOptionProduct bD_() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.copydefault)) {
            SimpleOptionProduct.Companion companion = SimpleOptionProduct.Companion;
            java.lang.String str = this.copydefault;
            Intrinsics.copydefault((java.lang.Object) str);
            SimpleOptionProduct simpleOptionProductOLrzqt = companion.OLrzqt(str);
            return simpleOptionProductOLrzqt == null ? new SimpleOptionProduct((SimpleOptionProduct.SimpleOptionCartItem) null, (SimpleOptionProduct.SimpleOptionCartItem) null, 3, (DefaultConstructorMarker) null) : simpleOptionProductOLrzqt;
        }
        return new SimpleOptionProduct((SimpleOptionProduct.SimpleOptionCartItem) null, (SimpleOptionProduct.SimpleOptionCartItem) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull SimpleOptionProduct simpleOptionProduct) {
        Intrinsics.checkNotNullParameter(simpleOptionProduct, "");
        this.EZpvd.EZpvd(simpleOptionProduct, "WebSocket");
    }

    public final void djBIcL() {
        AbstractC57556yke abstractC57556yke = this.KWHzl;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.AEQbTJ.AYXKKw();
        C54407xHg.Companion.EZpvd(C56121xwo.copydefault.EZpvd(this.EZpvd.EZpvd()), this.KWHzl);
    }

    public void EZpvd() {
        djBIcL();
        pUU.KWHzl("TradeAutoSimpleOptionTask", "----->> subscribe onRelease --- options-simple-recommend");
    }

    public final void EZpvd(ResponseData<java.util.List<SimpleOptionProduct>> responseData, java.lang.String str) {
        SimpleOptionProduct simpleOptionProduct;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            if (responseData.getData() != null && (!r0.isEmpty())) {
                AbstractC55716xpG abstractC55716xpG = this.EZpvd;
                java.util.List<SimpleOptionProduct> data = responseData.getData();
                if (data == null || (simpleOptionProduct = data.get(0)) == null) {
                    simpleOptionProduct = new SimpleOptionProduct((SimpleOptionProduct.SimpleOptionCartItem) null, (SimpleOptionProduct.SimpleOptionCartItem) null, 3, (DefaultConstructorMarker) null);
                }
                abstractC55716xpG.EZpvd(simpleOptionProduct, str);
            } else {
                this.EZpvd.EZpvd(new SimpleOptionProduct((SimpleOptionProduct.SimpleOptionCartItem) null, (SimpleOptionProduct.SimpleOptionCartItem) null, 3, (DefaultConstructorMarker) null), str);
            }
        } else {
            this.EZpvd.copydefault(responseData.getMsg(), str);
        }
        KWHzl();
    }
}

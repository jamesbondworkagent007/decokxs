package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.RFQSData;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xGj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54383xGj extends xGQ<java.util.List<? extends RFQSData>> {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final AbstractC55713xpD AEQbTJ;
    public final java.lang.String AYXKKw;
    public final C54287xCv EZpvd;
    public AbstractC57556yke KWHzl;
    public java.lang.String OLrzqt;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    @Override // o.xGQ
    public boolean bC_() {
        return false;
    }

    public C54383xGj(@NotNull java.lang.String str, @NotNull AbstractC55713xpD abstractC55713xpD) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55713xpD, "");
        this.AYXKKw = str;
        this.AEQbTJ = abstractC55713xpD;
        C54287xCv c54287xCv = new C54287xCv();
        this.EZpvd = c54287xCv;
        c54287xCv.copydefault(abstractC55713xpD.copydefault());
        c54287xCv.KWHzl(new Function1() { // from class: o.xGh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54383xGj.OLrzqt(this.KWHzl, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54287xCv, 0L, 1, null);
    }

    /* JADX INFO: renamed from: o.xGj$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xGj.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final Unit OLrzqt(C54383xGj c54383xGj, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        c54383xGj.AEQbTJ((ResponseData<java.util.List<RFQSData>>) responseData);
        return Unit.INSTANCE;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        copydefault();
        return true;
    }

    public AbstractC57556yke EZpvd() {
        java.lang.String strEZpvd = C56121xwo.copydefault.EZpvd(this.AEQbTJ.EZpvd());
        this.KWHzl = xGQ.getWsListener$default(this, strEZpvd, new WsArgV5(strEZpvd, null, null, null, null, null, null, null, 254, null), (Function1) null, 4, (java.lang.Object) null);
        pUU.KWHzl("TradeBestQuotesTask", "----->> subscribe channel --- " + strEZpvd);
        KWHzl(2500L);
        return this.KWHzl;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        OLrzqt(true);
        pUU.KWHzl("TradeBestQuotesTask", "----->> subscribe onMessage --- " + str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public java.util.List<RFQSData> bD_() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.OLrzqt)) {
            RFQSData.Companion companion = RFQSData.Companion;
            java.lang.String str = this.OLrzqt;
            Intrinsics.copydefault((java.lang.Object) str);
            java.util.List<RFQSData> listEZpvd = companion.EZpvd(str);
            return listEZpvd == null ? new java.util.ArrayList() : listEZpvd;
        }
        return new java.util.ArrayList();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull java.util.List<RFQSData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.EZpvd(list, "WebSocket");
    }

    public final void KWHzl() {
        AbstractC57556yke abstractC57556yke = this.KWHzl;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.EZpvd.AYXKKw();
        C54407xHg.Companion.EZpvd(C56121xwo.copydefault.EZpvd(this.AEQbTJ.EZpvd()), this.KWHzl);
    }

    public void copydefault() {
        KWHzl();
        pUU.KWHzl("TradeBestQuotesTask", "----->> subscribe onRelease --- ");
    }

    public final void AEQbTJ(ResponseData<java.util.List<RFQSData>> responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            AbstractC55713xpD abstractC55713xpD = this.AEQbTJ;
            java.util.List<RFQSData> data = responseData.getData();
            if (data == null) {
                data = new java.util.ArrayList<>();
            }
            AbstractC55755xpt.onResult$default(abstractC55713xpD, data, null, 2, null);
        }
        EZpvd();
    }
}

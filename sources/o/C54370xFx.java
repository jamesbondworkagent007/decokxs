package o;

import com.okinc.unify_trade.biz.BestQuotesData;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xFx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54370xFx extends xGQ<java.util.ArrayList<java.util.List<? extends BestQuotesData>>> {
    public final LinkedBlockingDeque<java.lang.String> EZpvd;
    public AbstractC57556yke KWHzl;
    public final java.util.List<AbstractC55761xpz> OLrzqt;
    public final AbstractC55761xpz copydefault;
    public final java.lang.String gEmmrt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    @Override // o.xGQ
    public boolean bC_() {
        return false;
    }

    public C54370xFx(@NotNull java.lang.String str, @NotNull AbstractC55761xpz abstractC55761xpz) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55761xpz, "");
        this.gEmmrt = str;
        this.copydefault = abstractC55761xpz;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.OLrzqt = arrayList;
        this.EZpvd = new LinkedBlockingDeque<>();
        arrayList.add(abstractC55761xpz);
    }

    /* JADX INFO: renamed from: o.xFx$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xFx.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void OLrzqt(@NotNull AbstractC55761xpz abstractC55761xpz) {
        Intrinsics.checkNotNullParameter(abstractC55761xpz, "");
        this.OLrzqt.add(abstractC55761xpz);
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55761xpz) {
            java.util.Iterator<AbstractC55761xpz> it = this.OLrzqt.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) it.next().AhwBna(), (java.lang.Object) ((AbstractC55761xpz) obj).AhwBna())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                this.OLrzqt.remove(i);
            }
        }
        if (this.OLrzqt.isEmpty()) {
            EZpvd();
        }
        return this.OLrzqt.isEmpty();
    }

    public AbstractC57556yke KWHzl() {
        java.lang.String strEZpvd = C56121xwo.copydefault.EZpvd(this.copydefault.EZpvd());
        this.KWHzl = xGQ.getWsListener$default(this, strEZpvd, new WsArgV5(strEZpvd, null, null, null, null, null, null, null, 254, null), (Function1) null, 4, (java.lang.Object) null);
        pUU.KWHzl("TradeBestQuotesTask", "----->> subscribe channel --- " + strEZpvd);
        KWHzl(500L);
        return this.KWHzl;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.EZpvd.put(str);
        pUU.KWHzl("TradeBestQuotesTask", "----->> subscribe onMessage --- " + str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.ArrayList<java.util.List<BestQuotesData>> bD_() throws java.lang.InterruptedException {
        java.util.ArrayList<java.util.List<BestQuotesData>> arrayList = new java.util.ArrayList<>();
        while (!this.EZpvd.isEmpty()) {
            BestQuotesData.Companion companion = BestQuotesData.Companion;
            java.lang.String strTake = this.EZpvd.take();
            Intrinsics.checkNotNullExpressionValue(strTake, "");
            java.util.List<BestQuotesData> listCopydefault = companion.copydefault(strTake);
            if (listCopydefault != null) {
                arrayList.add(listCopydefault);
            }
        }
        return arrayList;
    }

    public void EZpvd() {
        AbstractC57556yke abstractC57556yke = this.KWHzl;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        C54407xHg.Companion.EZpvd(C56121xwo.copydefault.EZpvd(this.copydefault.EZpvd()), this.KWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull java.util.ArrayList<java.util.List<BestQuotesData>> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            java.util.List list = (java.util.List) it.next();
            java.util.Iterator<T> it2 = this.OLrzqt.iterator();
            while (it2.hasNext()) {
                ((AbstractC55761xpz) it2.next()).EZpvd(list, "WebSocket");
            }
        }
    }
}

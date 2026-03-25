package o;

import com.okinc.unify_trade.biz.PreQuoteInfoData;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xGk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54384xGk extends xGQ<PreQuoteInfoData> {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public AbstractC57556yke AEQbTJ;
    public java.lang.String EZpvd;
    public final java.util.List<AbstractC55759xpx> KWHzl;
    public final AbstractC55759xpx copydefault;
    public final java.lang.String valueOf;

    @Override // o.xGQ
    public boolean bC_() {
        return false;
    }

    public C54384xGk(@NotNull java.lang.String str, @NotNull AbstractC55759xpx abstractC55759xpx) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55759xpx, "");
        this.valueOf = str;
        this.copydefault = abstractC55759xpx;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.KWHzl = arrayList;
        arrayList.add(abstractC55759xpx);
    }

    /* JADX INFO: renamed from: o.xGk$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xGk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void KWHzl(@NotNull AbstractC55759xpx abstractC55759xpx) {
        Intrinsics.checkNotNullParameter(abstractC55759xpx, "");
        this.KWHzl.add(abstractC55759xpx);
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55759xpx) {
            java.util.Iterator<AbstractC55759xpx> it = this.KWHzl.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) it.next().AhwBna(), (java.lang.Object) ((AbstractC55759xpx) obj).AhwBna())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                this.KWHzl.remove(i);
            }
        }
        if (this.KWHzl.isEmpty()) {
            KWHzl();
        }
        return this.KWHzl.isEmpty();
    }

    public AbstractC57556yke copydefault() {
        java.lang.String strEZpvd = C56121xwo.copydefault.EZpvd(this.copydefault.EZpvd());
        this.AEQbTJ = xGQ.getWsListener$default(this, strEZpvd, new WsArgV5(strEZpvd, null, null, null, null, null, null, null, 254, null), (Function1) null, 4, (java.lang.Object) null);
        pUU.KWHzl("TradePreQuoteTask", "----->> subscribe channel --- " + strEZpvd);
        KWHzl(2500L);
        return this.AEQbTJ;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        OLrzqt(true);
        pUU.KWHzl("TradePreQuoteTask", "----->> subscribe onMessage --- " + str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public PreQuoteInfoData bD_() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd)) {
            PreQuoteInfoData.Companion companion = PreQuoteInfoData.Companion;
            java.lang.String str = this.EZpvd;
            Intrinsics.copydefault((java.lang.Object) str);
            java.util.List<PreQuoteInfoData> listKWHzl = companion.KWHzl(str);
            if (listKWHzl != null && !listKWHzl.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listKWHzl) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((PreQuoteInfoData) obj).getInstId(), (java.lang.Object) this.copydefault.copydefault())) {
                        arrayList.add(obj);
                    }
                }
                return (PreQuoteInfoData) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            }
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull PreQuoteInfoData preQuoteInfoData) {
        Intrinsics.checkNotNullParameter(preQuoteInfoData, "");
        java.util.Iterator<AbstractC55759xpx> it = this.KWHzl.iterator();
        while (it.hasNext()) {
            it.next().EZpvd(preQuoteInfoData, "WebSocket");
        }
    }

    public void KWHzl() {
        AbstractC57556yke abstractC57556yke = this.AEQbTJ;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        C54407xHg.Companion.EZpvd(C56121xwo.copydefault.EZpvd(this.copydefault.EZpvd()), this.AEQbTJ);
    }
}

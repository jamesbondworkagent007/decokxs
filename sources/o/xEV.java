package o;

import com.okinc.core.widget.SortTextView;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SimpleOptionsPositionVo;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC55705xow;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xEV extends xGQ<java.util.List<? extends SimpleOptionsPositionVo>> implements InterfaceC55705xow {
    public AbstractC55679xoW AEQbTJ;
    public final java.lang.String AYXKKw;
    public AbstractC57556yke AhwBna;
    public final LinkedBlockingDeque<java.lang.String> EZpvd;
    public java.util.List<SimpleOptionsPositionVo> KWHzl;
    public final java.lang.String OLrzqt;
    public final C54290xCy copydefault;
    public final java.util.List<AbstractC55679xoW> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public final void AEQbTJ2(java.util.List<SimpleOptionsPositionVo> list) {
        this.KWHzl = list;
    }

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    @Override // o.InterfaceC55705xow
    public void EZpvd() {
    }

    public AbstractC57556yke KWHzl() {
        return null;
    }

    @Override // o.InterfaceC55705xow
    public void copydefault(@NotNull java.lang.Object obj) {
        InterfaceC55705xow.Application.EZpvd(this, obj);
    }

    public xEV(@NotNull java.lang.String str, AbstractC55679xoW abstractC55679xoW) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
        this.AEQbTJ = abstractC55679xoW;
        this.OLrzqt = "SimpleOptionPositionsTask";
        this.copydefault = new C54290xCy();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.valueOf = arrayList;
        this.EZpvd = new LinkedBlockingDeque<>();
        copydefault();
        arrayList.add(this.AEQbTJ);
    }

    public static final Unit AEQbTJ(xEV xev, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xev.AEQbTJ((ResponseData<java.util.List<SimpleOptionsPositionVo>>) responseData);
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        C54290xCy c54290xCy = this.copydefault;
        c54290xCy.KWHzl(new Function1() { // from class: o.xEW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xEV.AEQbTJ(this.KWHzl, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54290xCy, 0L, 1, null);
    }

    public final void copydefault(ResponseData<java.util.List<SimpleOptionsPositionVo>> responseData) {
        java.util.List<SimpleOptionsPositionVo> data = responseData.getData();
        if (data == null) {
            data = yDY.AhwBna();
        }
        this.KWHzl = data;
        AbstractC55679xoW abstractC55679xoW = this.AEQbTJ;
        if (abstractC55679xoW != null) {
            Intrinsics.copydefault(data);
            abstractC55679xoW.AEQbTJ(data, "http", java.lang.Boolean.TRUE);
        }
        djBIcL();
    }

    private final void djBIcL() {
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "options-simple-position", new WsArgV5("options-simple-position", null, null, null, null, null, null, null, 254, null), (Function1) null, 4, (java.lang.Object) null);
        this.AhwBna = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
        pUU.KWHzl(this.OLrzqt, "----->> subscribe channel --- options-simple-position");
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(this.OLrzqt, "options-simple-position ----->> subscribe onMessage --- " + str);
        OLrzqt(true);
        this.EZpvd.add(str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public java.util.List<SimpleOptionsPositionVo> bD_() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.EZpvd.isEmpty()) {
            arrayList.add(this.EZpvd.take());
        }
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.util.List<SimpleOptionsPositionVo> listOLrzqt = SimpleOptionsPositionVo.Companion.OLrzqt((java.lang.String) next);
            if (listOLrzqt != null) {
                AEQbTJ2(listOLrzqt);
            }
        }
        return this.KWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.xGQ
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull java.util.List<SimpleOptionsPositionVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        for (AbstractC55679xoW abstractC55679xoW : this.valueOf) {
            if (abstractC55679xoW != null) {
                abstractC55679xoW.AEQbTJ(list, "WebSocket", java.lang.Boolean.TRUE);
            }
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj != null && (obj instanceof AbstractC55679xoW)) {
            java.util.Iterator<AbstractC55679xoW> it = this.valueOf.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                AbstractC55679xoW next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) (next != null ? next.AhwBna() : null), (java.lang.Object) ((AbstractC55679xoW) obj).AhwBna())) {
                    break;
                }
                i++;
            }
            if (i != -1 && Intrinsics.EZpvd(this.valueOf.remove(i), this.AEQbTJ)) {
                this.AEQbTJ = null;
            }
            if (this.valueOf.size() == 0) {
                gEmmrt();
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC55705xow
    public void OLrzqt(SortTextView.SortType sortType) {
        gEmmrt();
        copydefault();
    }

    public final void gEmmrt() {
        C54407xHg.Companion.EZpvd("options-simple-position", this.AhwBna);
        AbstractC57556yke abstractC57556yke = this.AhwBna;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.AhwBna = null;
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
    }

    public final void AEQbTJ(ResponseData<java.util.List<SimpleOptionsPositionVo>> responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            copydefault(responseData);
            return;
        }
        AbstractC55679xoW abstractC55679xoW = this.AEQbTJ;
        if (abstractC55679xoW != null) {
            abstractC55679xoW.AEQbTJ(yDY.AhwBna(), "http", java.lang.Boolean.FALSE);
        }
    }
}

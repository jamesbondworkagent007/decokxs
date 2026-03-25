package o;

import androidx.camera.video.AudioStats;
import com.google.gson.JsonObject;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.core.livelistener.OKWsConnectionState;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.subscribe.TradePositionData;
import com.okinc.unify_trade.biz.subscribe.TradePositionInfo;
import com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo;
import com.okinc.websocket.v5config.WsArgV5;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.xGQ;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xFY extends xGQ<java.util.List<? extends TradePositionData>> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final LinkedBlockingDeque<xGQ.Application> AEQbTJ;
    public boolean AYXKKw;
    public AbstractC57556yke AhwBna;
    public final java.lang.String AkhnZx;
    public java.util.List<TradeUserPositionInfo> EZpvd;
    public boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final CopyOnWriteArrayList<TradePositionData> djBIcL;
    public boolean gEmmrt;
    public final java.util.List<AbstractC55747xpl> isConnected;
    public AbstractC55747xpl valueOf;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xFY.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public xFY(@NotNull java.lang.String str, AbstractC55747xpl abstractC55747xpl) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx = str;
        this.valueOf = abstractC55747xpl;
        this.OLrzqt = "TradePositionTask_" + (abstractC55747xpl != null ? abstractC55747xpl.EZpvd() : null);
        this.djBIcL = new CopyOnWriteArrayList<>();
        this.isConnected = new java.util.ArrayList();
        this.AEQbTJ = new LinkedBlockingDeque<>();
        AbstractC55747xpl abstractC55747xpl2 = this.valueOf;
        if (abstractC55747xpl2 != null) {
            OLrzqt(abstractC55747xpl2);
        }
        gEmmrt();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // o.xGQ
    public /* synthetic */ void AEQbTJ(java.util.List<? extends TradePositionData> list) {
        copydefault((java.util.List<TradePositionData>) list);
    }

    public final java.lang.String EZpvd() {
        AbstractC55747xpl abstractC55747xpl = (AbstractC55747xpl) CollectionsKt___CollectionsKt.firstOrNull(this.isConnected);
        java.lang.String strOLrzqt = abstractC55747xpl != null ? abstractC55747xpl.OLrzqt() : null;
        if (strOLrzqt == null || strOLrzqt.length() == 0) {
            return "ANY";
        }
        if (abstractC55747xpl != null) {
            return abstractC55747xpl.OLrzqt();
        }
        return null;
    }

    public final java.lang.String copydefault() {
        AbstractC55747xpl abstractC55747xpl = (AbstractC55747xpl) CollectionsKt___CollectionsKt.firstOrNull(this.isConnected);
        if (abstractC55747xpl != null) {
            return abstractC55747xpl.AEQbTJ();
        }
        return null;
    }

    public final java.lang.String KWHzl() {
        AbstractC55747xpl abstractC55747xpl = (AbstractC55747xpl) CollectionsKt___CollectionsKt.firstOrNull(this.isConnected);
        if (abstractC55747xpl != null) {
            return abstractC55747xpl.KWHzl();
        }
        return null;
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        AbstractC55747xpl abstractC55747xpl = this.valueOf;
        java.lang.String strEZpvd = abstractC55747xpl != null ? abstractC55747xpl.EZpvd() : null;
        if (strEZpvd == null || strEZpvd.length() == 0) {
            return;
        }
        xVC.OLrzqt.AEQbTJ(str, str2);
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public final C55764xqB AEQbTJ2(java.util.List<TradePositionInfo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (TradePositionInfo tradePositionInfo : list) {
            arrayList2.add(new TradeUserPositionInfo(tradePositionInfo.getAccountName(), tradePositionInfo.getMain(), tradePositionInfo.getAuth()));
            for (TradePositionData tradePositionData : tradePositionInfo.getPositions()) {
                tradePositionData.setPosUserInfo(new TradeUserPositionInfo(tradePositionInfo.getAccountName(), tradePositionInfo.getMain(), tradePositionInfo.getAuth()));
                arrayList.add(tradePositionData);
            }
        }
        return new C55764xqB(arrayList, arrayList2);
    }

    public final void gEmmrt() {
        xOW newProxyInstance;
        xOW newProxyInstance2;
        EZpvd(this.OLrzqt, "loadHttpRequest");
        java.lang.String str = this.OLrzqt;
        C55697xoo c55697xoo = C55697xoo.OLrzqt;
        EZpvd(str, "isLogin :" + c55697xoo.isConnected());
        if (c55697xoo.isConnected()) {
            java.lang.String str2 = this.OLrzqt;
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
            EZpvd(str2, "isShowPositionTabJudgingByHostingInfo :" + ((interfaceC54581xNrOLrzqt == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : java.lang.Boolean.valueOf(newProxyInstance2.fIwbmz())));
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 == null || (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null || newProxyInstance.fIwbmz()) {
                final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                C56179xxt c56179xxt = new C56179xxt();
                EZpvd(this.OLrzqt, "GetPositionsListUseCase");
                c56179xxt.AEQbTJ(C33129mqd.OLrzqt((java.lang.CharSequence) copydefault()) ? null : KWHzl());
                c56179xxt.EZpvd(Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) "ANY") ? null : EZpvd());
                c56179xxt.KWHzl(new Function1() { // from class: o.xGi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return xFY.OLrzqt(this.EZpvd, jCurrentTimeMillis, (ResponseData) obj);
                    }
                });
                xKK.Activity.execute$default(c56179xxt, 0L, 1, null);
            }
        }
    }

    public static final Unit OLrzqt(xFY xfy, long j, ResponseData responseData) {
        AbstractC57556yke abstractC57556ykeDjBIcL;
        Intrinsics.checkNotNullParameter(responseData, "");
        xfy.EZpvd(xfy.OLrzqt, "withResp");
        C54515xLg.OLrzqt.copydefault(j, responseData.getCode() == 0, responseData.getMsg(), java.lang.Integer.valueOf(responseData.getCode()));
        if (responseData.getCode() == 0) {
            xfy.AYXKKw = false;
            java.util.List<TradePositionInfo> listAhwBna = (java.util.List) responseData.getData();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            C55764xqB c55764xqBAEQbTJ2 = xfy.AEQbTJ2(listAhwBna);
            xfy.EZpvd(xfy.OLrzqt, "it.isSucceedAndDataValid:" + (responseData.getCode() == 0));
            if (C33129mqd.KWHzl((java.util.Collection) c55764xqBAEQbTJ2.OLrzqt())) {
                xfy.djBIcL.clear();
                xfy.djBIcL.addAll(c55764xqBAEQbTJ2.OLrzqt());
            }
            xfy.EZpvd = c55764xqBAEQbTJ2.copydefault();
            java.util.List<TradePositionData> listAhwBna2 = xfy.djBIcL;
            if (!(listAhwBna2 instanceof CopyOnWriteArrayList)) {
                listAhwBna2 = null;
            }
            if (listAhwBna2 == null) {
                listAhwBna2 = yDY.AhwBna();
            }
            xfy.EZpvd(listAhwBna2, "http", xfy.EZpvd);
        } else {
            xfy.EZpvd(xfy.OLrzqt, "HttpError");
            xfy.AYXKKw = true;
            xfy.AEQbTJ("http", new BizApiException(responseData.getMsg(), null, null, null, null, 30, null));
        }
        if (responseData.getCode() == 0 && (abstractC57556ykeDjBIcL = xfy.djBIcL()) != null) {
            abstractC57556ykeDjBIcL.AhwBna();
        }
        xfy.KWHzl = true;
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.util.List<TradePositionData> list, java.lang.String str, java.util.List<TradeUserPositionInfo> list2) {
        EZpvd(this.OLrzqt, "onResult origin:" + str + " positionLists:" + list);
        java.util.Iterator<T> it = this.isConnected.iterator();
        while (it.hasNext()) {
            ((AbstractC55747xpl) it.next()).EZpvd(list, str, list2);
        }
    }

    public AbstractC57556yke djBIcL() {
        EZpvd(this.OLrzqt, " taskKey:" + this.AkhnZx + " CHANNEL_POSITION: positions subscribe");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("updateInterval", "2000");
        jsonObject.addProperty("source", "1");
        this.AhwBna = xGQ.getWsListener$default(this, "positions", new WsArgV5("positions", KWHzl(), copydefault(), EZpvd(), null, null, null, jsonObject, WalletImportError.ERROR_CODE_AA_EXIST, null), (Function1) null, 4, (java.lang.Object) null);
        KWHzl(700L);
        return this.AhwBna;
    }

    @Override // o.xGQ
    public boolean bC_() {
        AbstractC55747xpl abstractC55747xpl = this.valueOf;
        if (abstractC55747xpl != null) {
            return abstractC55747xpl.gEmmrt();
        }
        return true;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.AEQbTJ.put(new xGQ.Application(str, false, false, false));
        EZpvd(this.OLrzqt, "onMessage taskKey:" + this.AkhnZx + " ");
    }

    @Override // o.xGQ
    public void KWHzl(@NotNull java.lang.String str, boolean z, boolean z2) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        xGQ.Application application = new xGQ.Application(str, true, z, z2);
        OLrzqt(true);
        this.AEQbTJ.put(application);
        EZpvd(this.OLrzqt, "onTotalDataMessage taskKey:" + this.AkhnZx + " ");
    }

    @Override // o.xGQ
    public boolean q_(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return valueOf(str);
    }

    @Override // o.xGQ
    public InterfaceC58217yxC KWHzl(long j) {
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, j, java.util.concurrent.TimeUnit.MILLISECONDS, yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.xGd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xFY.KWHzl(this.EZpvd, (java.lang.Long) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgInterval.map(new InterfaceC58229yxO() { // from class: o.xGg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return xFY.copydefault(function1, obj);
            }
        }).observeOn(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.xGe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xFY.EZpvd(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        OLrzqt(abstractC58247yxgObserveOn.subscribe(new InterfaceC58227yxM() { // from class: o.xGc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xFY.EZpvd(function12, obj);
            }
        }));
        return iwGUEr();
    }

    public static final kotlin.Pair copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(xFY xfy, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return xfy.getNewProxyInstance() ? new kotlin.Pair(java.lang.Boolean.TRUE, xfy.bD_()) : new kotlin.Pair(java.lang.Boolean.FALSE, null);
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(xFY xfy, kotlin.Pair pair) {
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && pair.getSecond() != null && xfy.gEmmrt) {
            xfy.OLrzqt(false);
            java.lang.Object second = pair.getSecond();
            Intrinsics.copydefault(second);
            xfy.copydefault((java.util.List<TradePositionData>) second);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: fetchVPNInfo, reason: merged with bridge method [inline-methods] */
    public java.util.List<TradePositionData> bD_() {
        DbNXlk();
        return this.djBIcL;
    }

    public void copydefault(@NotNull java.util.List<TradePositionData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        EZpvd(list, "WebSocket", this.EZpvd);
        values();
    }

    public static final void OLrzqt(xFY xfy, java.lang.String str) {
        java.util.List<TradePositionData> listAEQbTJ = TradePositionData.Companion.AEQbTJ(str);
        if (listAEQbTJ != null) {
            xfy.KWHzl(listAEQbTJ);
        }
    }

    private final void DbNXlk() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.AEQbTJ.isEmpty()) {
            arrayList.add(this.AEQbTJ.take());
        }
        java.util.Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((xGQ.Application) it.next()).EZpvd()) {
                break;
            } else {
                i2++;
            }
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (((xGQ.Application) it2.next()).KWHzl()) {
                break;
            } else {
                i++;
            }
        }
        EZpvd(this.OLrzqt, "wsList size:" + arrayList.size() + " totalDataFirstIndex:" + i2 + " totalDataLastIndex:" + i);
        if (i2 != -1) {
            if (i2 <= i) {
                while (true) {
                    if (((xGQ.Application) arrayList.get(i2)).EZpvd()) {
                        this.djBIcL.clear();
                    }
                    this.gEmmrt = ((xGQ.Application) arrayList.get(i2)).KWHzl();
                    java.util.List<TradePositionData> listAEQbTJ = TradePositionData.Companion.AEQbTJ(((xGQ.Application) arrayList.get(i2)).copydefault());
                    if (listAEQbTJ != null) {
                        java.util.Iterator<T> it3 = listAEQbTJ.iterator();
                        while (it3.hasNext()) {
                            this.djBIcL.add((TradePositionData) it3.next());
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            int size = arrayList.size();
            for (int i3 = i + 1; i3 < size; i3++) {
                OLrzqt(this, ((xGQ.Application) arrayList.get(i3)).copydefault());
            }
        } else {
            java.util.Iterator it4 = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it4, "");
            while (it4.hasNext()) {
                java.lang.Object next = it4.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                OLrzqt(this, ((xGQ.Application) next).copydefault());
            }
        }
        EZpvd(this.OLrzqt, "wsList size:" + arrayList.size());
    }

    public final void KWHzl(@NotNull java.util.List<TradePositionData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!this.djBIcL.isEmpty()) {
            for (TradePositionData tradePositionData : list) {
                if (!KWHzl(tradePositionData) && EZpvd(tradePositionData)) {
                    this.djBIcL.add(0, tradePositionData);
                }
            }
            return;
        }
        for (TradePositionData tradePositionData2 : list) {
            if (EZpvd(tradePositionData2)) {
                this.djBIcL.add(tradePositionData2);
            }
        }
    }

    public final boolean EZpvd(@NotNull TradePositionData tradePositionData) {
        Intrinsics.checkNotNullParameter(tradePositionData, "");
        if (Intrinsics.EZpvd((java.lang.Object) tradePositionData.getInstType(), (java.lang.Object) "MARGIN") && C33129mqd.AEQbTJ(tradePositionData.getPos()) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(tradePositionData.getLiab()) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return false;
        }
        return Intrinsics.EZpvd((java.lang.Object) tradePositionData.getInstType(), (java.lang.Object) "MARGIN") || !C33129mqd.OLrzqt((java.lang.Object) tradePositionData.getPos(), (java.lang.Object) 0);
    }

    public final void OLrzqt(@NotNull AbstractC55747xpl abstractC55747xpl) {
        Intrinsics.checkNotNullParameter(abstractC55747xpl, "");
        EZpvd(this.OLrzqt, "addListener:" + abstractC55747xpl + ", this.subKey:" + this.AkhnZx + ",positionListener.taskKey:" + abstractC55747xpl.AhwBna());
        if (Intrinsics.EZpvd((java.lang.Object) abstractC55747xpl.AhwBna(), (java.lang.Object) this.AkhnZx)) {
            copydefault(abstractC55747xpl);
            if (this.KWHzl) {
                if (this.AYXKKw) {
                    gEmmrt();
                } else {
                    abstractC55747xpl.EZpvd(this.djBIcL, "http", this.EZpvd);
                }
            }
            this.isConnected.add(abstractC55747xpl);
            java.lang.String str = this.OLrzqt;
            java.lang.String str2 = this.AkhnZx;
            boolean z = this.isConnected.size() == 1;
            boolean z2 = this.KWHzl;
            boolean z3 = this.AYXKKw;
            java.lang.String strEZpvd = abstractC55747xpl.EZpvd();
            int size = this.isConnected.size();
            java.util.List<AbstractC55747xpl> list = this.isConnected;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC55747xpl) it.next()).EZpvd());
            }
            EZpvd(str, "taskKey:" + str2 + " isFirstAdd:" + z + "; isHttpDataInit:" + z2 + "; isHttpError:" + z3 + "; addListener registeredSource:" + strEZpvd + " positionListeners.size: " + size + " -- positionListeners.names " + arrayList);
        }
    }

    public final void copydefault(AbstractC55747xpl abstractC55747xpl) {
        abstractC55747xpl.EZpvd(fIwbmz());
        abstractC55747xpl.copydefault(ejfBZ());
        abstractC55747xpl.KWHzl(isConnected());
        C55750xpo c55750xpo = C55750xpo.EZpvd;
        c55750xpo.KWHzl(fIwbmz());
        c55750xpo.AEQbTJ(ejfBZ());
        c55750xpo.OLrzqt(isConnected());
    }

    private final Function0<java.lang.Long> isConnected() {
        final WeakReference weakReference = new WeakReference(this);
        return new Function0() { // from class: o.xGf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xFY.OLrzqt(weakReference);
            }
        };
    }

    public static final java.lang.Long OLrzqt(WeakReference weakReference) {
        AbstractC57556yke abstractC57556yke;
        xFY xfy = (xFY) weakReference.get();
        if (xfy == null || (abstractC57556yke = xfy.AhwBna) == null) {
            return null;
        }
        return java.lang.Long.valueOf(abstractC57556yke.copydefault());
    }

    private final Function0<java.lang.String> fIwbmz() {
        final WeakReference weakReference = new WeakReference(this);
        return new Function0() { // from class: o.xGb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xFY.AYXKKw(weakReference);
            }
        };
    }

    public static final java.lang.String AYXKKw(WeakReference weakReference) {
        AbstractC57556yke abstractC57556yke;
        OKWsConnectionState oKWsConnectionStateEZpvd;
        java.lang.String strName;
        xFY xfy = (xFY) weakReference.get();
        if (xfy == null || (abstractC57556yke = xfy.AhwBna) == null || (oKWsConnectionStateEZpvd = abstractC57556yke.EZpvd()) == null || (strName = oKWsConnectionStateEZpvd.name()) == null) {
            return null;
        }
        java.lang.String lowerCase = strName.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    private final Function0<java.lang.String> ejfBZ() {
        final WeakReference weakReference = new WeakReference(this);
        return new Function0() { // from class: o.xGl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xFY.EZpvd(weakReference);
            }
        };
    }

    public static final java.lang.String EZpvd(WeakReference weakReference) {
        AbstractC57556yke abstractC57556yke;
        xFY xfy = (xFY) weakReference.get();
        if (xfy == null || (abstractC57556yke = xfy.AhwBna) == null) {
            return null;
        }
        return abstractC57556yke.AEQbTJ();
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55747xpl) {
            java.util.Iterator<AbstractC55747xpl> it = this.isConnected.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) it.next().valueOf(), (java.lang.Object) ((AbstractC55747xpl) obj).valueOf())) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return false;
            }
            if (Intrinsics.EZpvd(this.isConnected.remove(i), this.valueOf)) {
                this.valueOf = null;
            }
            AbstractC55747xpl abstractC55747xpl = (AbstractC55747xpl) obj;
            abstractC55747xpl.AEQbTJ(true);
            java.lang.String str = this.OLrzqt;
            java.lang.String str2 = this.AkhnZx;
            java.lang.String strEZpvd = abstractC55747xpl.EZpvd();
            int size = this.isConnected.size();
            java.util.List<AbstractC55747xpl> list = this.isConnected;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((AbstractC55747xpl) it2.next()).EZpvd());
            }
            EZpvd(str, "taskKey:" + str2 + " removeListener taskKey:" + str2 + " registeredSource:" + strEZpvd + " -- positionListeners.size " + size + " -- positionListeners.registeredSource " + arrayList);
            if (this.isConnected.size() == 0) {
                valueOf();
                return true;
            }
        }
        return false;
    }

    public final void valueOf() {
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        AbstractC57556yke abstractC57556yke = this.AhwBna;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.valueOf = null;
        C54407xHg.Companion.EZpvd("positions", this.AhwBna);
        EZpvd(this.OLrzqt, "taskKey:" + this.AkhnZx + " CHANNEL_POSITION release ");
    }

    private final void AEQbTJ(java.lang.String str, java.lang.Exception exc) {
        java.util.Iterator<T> it = this.isConnected.iterator();
        while (it.hasNext()) {
            ((AbstractC55747xpl) it.next()).KWHzl(str, exc);
        }
    }

    public final void values() {
        java.util.Iterator<T> it = this.isConnected.iterator();
        while (it.hasNext()) {
            AbstractC55745xpj.stopWsConnectionMonitor$default((AbstractC55747xpl) it.next(), false, 1, null);
        }
    }

    public final boolean KWHzl(@NotNull TradePositionData tradePositionData) {
        Intrinsics.checkNotNullParameter(tradePositionData, "");
        java.util.Iterator<TradePositionData> it = this.djBIcL.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.EZpvd((java.lang.Object) tradePositionData.getPosId(), (java.lang.Object) it.next().getPosId())) {
                break;
            }
            i++;
        }
        EZpvd(this.OLrzqt, "checkItemAndModify index:" + i);
        if (i != -1 && Intrinsics.EZpvd((java.lang.Object) tradePositionData.getInstType(), (java.lang.Object) "MARGIN") && C33129mqd.AEQbTJ(tradePositionData.getPos()) == AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(tradePositionData.getLiab()) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            EZpvd(this.OLrzqt, "index!=-1 && data.instType== TRADE_MARGIN_TYPE &&data.pos.toSafeDouble() == 0.0&&data.liab.toSafeDouble()==0.0");
            this.djBIcL.remove(i);
            RxBus.KWHzl("trade_balance_refresh");
        } else if (i != -1 && !Intrinsics.EZpvd((java.lang.Object) tradePositionData.getInstType(), (java.lang.Object) "MARGIN") && C33129mqd.OLrzqt((java.lang.Object) tradePositionData.getPos(), (java.lang.Object) 0)) {
            EZpvd(this.OLrzqt, "index!=-1&&data.instType!= TRADE_MARGIN_TYPE &&data.pos.eq(0)");
            this.djBIcL.remove(i);
            RxBus.KWHzl("trade_balance_refresh");
        } else if (i != -1) {
            EZpvd(this.OLrzqt, "index!=-1");
            this.djBIcL.set(i, tradePositionData);
        }
        return i != -1;
    }
}

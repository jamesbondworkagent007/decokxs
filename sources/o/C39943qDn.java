package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.market.ranking.core.model.po.SearchHotPo;
import com.okinc.market.search.features.main.recommend.hot.domain.GetPopularSearchDataUseCase$onExecute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qDn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39943qDn extends AbstractC49400uno<C41622quL, java.util.List<? extends C39994qFk>> {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final C41662quz AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC54577xNn KWHzl;
    public final qGQ copydefault;
    public final C39949qDt gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((C41622quL) obj, (Continuation<? super java.util.List<C39994qFk>>) continuation);
    }

    @yCM
    public C39943qDn(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn, @NotNull qGQ qgq, @NotNull C39949qDt c39949qDt, @NotNull C41662quz c41662quz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qgq, "");
        Intrinsics.checkNotNullParameter(c39949qDt, "");
        Intrinsics.checkNotNullParameter(c41662quz, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = interfaceC54577xNn;
        this.copydefault = qgq;
        this.gEmmrt = c39949qDt;
        this.AEQbTJ = c41662quz;
    }

    /* JADX INFO: renamed from: o.qDn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qDn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41622quL c41622quL, @NotNull Continuation<? super java.util.List<C39994qFk>> continuation) throws java.lang.Throwable {
        GetPopularSearchDataUseCase$onExecute$1 getPopularSearchDataUseCase$onExecute$1;
        C39943qDn c39943qDn;
        long j;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        if (continuation instanceof GetPopularSearchDataUseCase$onExecute$1) {
            getPopularSearchDataUseCase$onExecute$1 = (GetPopularSearchDataUseCase$onExecute$1) continuation;
            int i = getPopularSearchDataUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPopularSearchDataUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getPopularSearchDataUseCase$onExecute$1 = new GetPopularSearchDataUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objAYXKKw = getPopularSearchDataUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getPopularSearchDataUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAYXKKw);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("type", c41622quL.copydefault()), C56390yDp.OLrzqt(TypedValues.CycleType.S_WAVE_PERIOD, c41622quL.KWHzl().getInputPara()), C56390yDp.OLrzqt("zone", c41622quL.gEmmrt()));
            C41662quz c41662quz = this.AEQbTJ;
            getPopularSearchDataUseCase$onExecute$1.L$0 = this;
            getPopularSearchDataUseCase$onExecute$1.J$0 = jCurrentTimeMillis;
            getPopularSearchDataUseCase$onExecute$1.label = 1;
            objAYXKKw = c41662quz.AYXKKw(mapGEmmrt, getPopularSearchDataUseCase$onExecute$1);
            if (objAYXKKw == objCopydefault) {
                return objCopydefault;
            }
            c39943qDn = this;
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = getPopularSearchDataUseCase$onExecute$1.J$0;
            c39943qDn = (C39943qDn) getPopularSearchDataUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objAYXKKw);
        }
        java.util.List listAhwBna = (java.util.List) objAYXKKw;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(listAhwBna, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("GetPopularSearchDataUseCase", "repo getMainSearchHotData [cost: " + pairOLrzqt.getSecond() + "ms]");
        java.util.List list = (java.util.List) pairOLrzqt.component1();
        InterfaceC54577xNn interfaceC54577xNn = c39943qDn.KWHzl;
        if (interfaceC54577xNn == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return yDY.AhwBna();
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("SPOT");
        if (abstractC54531xLwOLrzqt == null) {
            return yDY.AhwBna();
        }
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (interfaceC54581xNrOLrzqt.fetchVPNInfo(((SearchHotPo) obj).getInstId())) {
                arrayList.add(obj);
            }
        }
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(c39943qDn.EZpvd(arrayList, abstractC54531xLwOLrzqt, c39943qDn.KWHzl.EZpvd()), C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - jCurrentTimeMillis2));
        C40375qTn.AEQbTJ.copydefault("GetPopularSearchDataUseCase", "updatePriceUseCase [cost: " + pairOLrzqt2.getSecond() + "ms]");
        return (java.util.List) pairOLrzqt2.component1();
    }

    public final java.util.List<C39994qFk> EZpvd(java.util.List<SearchHotPo> list, AbstractC54531xLw abstractC54531xLw, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (SearchHotPo searchHotPo : list) {
            BizInstrument bizInstrumentValueOf = abstractC54531xLw.valueOf(searchHotPo.getInstId());
            if (bizInstrumentValueOf != null) {
                C39994qFk c39994qFk = (C39994qFk) this.copydefault.copydefault((java.lang.Object) bizInstrumentValueOf);
                c39994qFk.EZpvd(searchHotPo);
                this.gEmmrt.copydefault((java.lang.Object) C49380unU.copydefault(C49380unU.OLrzqt(c39994qFk, java.lang.Boolean.valueOf(z)), java.lang.Integer.valueOf(arrayList.size())));
                arrayList.add(c39994qFk);
            }
            if (C33129mqd.copydefault((java.lang.Object) java.lang.Integer.valueOf(arrayList.size()), (java.lang.Object) 20)) {
                break;
            }
        }
        return arrayList;
    }
}

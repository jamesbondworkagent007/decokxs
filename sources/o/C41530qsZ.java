package o;

import com.okinc.market.quotation.domain.spot.GetRawSpotInstrumentsUseCase$onExecute$1;
import com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49404uns;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41530qsZ implements InterfaceC49404uns<RawInstrumentIsolatedStrategy, java.util.List<? extends SpotInstrument>> {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final C41561qtD EZpvd;
    public final InterfaceC54577xNn KWHzl;
    public final C41579qtV OLrzqt;

    @yCM
    public C41530qsZ(InterfaceC54577xNn interfaceC54577xNn, @NotNull C41561qtD c41561qtD, @NotNull C41579qtV c41579qtV) {
        Intrinsics.checkNotNullParameter(c41561qtD, "");
        Intrinsics.checkNotNullParameter(c41579qtV, "");
        this.KWHzl = interfaceC54577xNn;
        this.EZpvd = c41561qtD;
        this.OLrzqt = c41579qtV;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Object copydefault(@NotNull RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy, @NotNull Continuation<? super java.util.List<SpotInstrument>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, rawInstrumentIsolatedStrategy, continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    /* JADX INFO: renamed from: o.qsZ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsZ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy, @NotNull Continuation<? super java.util.List<SpotInstrument>> continuation) throws java.lang.Throwable {
        GetRawSpotInstrumentsUseCase$onExecute$1 getRawSpotInstrumentsUseCase$onExecute$1;
        C41530qsZ c41530qsZ;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLw;
        C41530qsZ c41530qsZ2;
        RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy2;
        AbstractC54531xLw abstractC54531xLw2;
        java.util.List listEZpvd;
        RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy3 = rawInstrumentIsolatedStrategy;
        if (continuation instanceof GetRawSpotInstrumentsUseCase$onExecute$1) {
            getRawSpotInstrumentsUseCase$onExecute$1 = (GetRawSpotInstrumentsUseCase$onExecute$1) continuation;
            int i = getRawSpotInstrumentsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRawSpotInstrumentsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getRawSpotInstrumentsUseCase$onExecute$1 = new GetRawSpotInstrumentsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getRawSpotInstrumentsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRawSpotInstrumentsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C41434qqj c41434qqj = C41434qqj.KWHzl;
            c41434qqj.KWHzl("GetRawSpotInstrumentsUseCase", "get raw spot instruments, strategy=" + rawInstrumentIsolatedStrategy3);
            if (!((java.lang.Boolean) this.EZpvd.OLrzqt("SPOT")).booleanValue()) {
                C41434qqj.w$default(c41434qqj, "GetRawSpotInstrumentsUseCase", "Spot trading is restricted, cannot fetch spot instruments", null, 4, null);
                return null;
            }
            InterfaceC54577xNn interfaceC54577xNn2 = this.KWHzl;
            if (interfaceC54577xNn2 != null) {
                getRawSpotInstrumentsUseCase$onExecute$1.L$0 = this;
                getRawSpotInstrumentsUseCase$onExecute$1.L$1 = rawInstrumentIsolatedStrategy3;
                getRawSpotInstrumentsUseCase$onExecute$1.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn2, false, null, getRawSpotInstrumentsUseCase$onExecute$1, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c41530qsZ = this;
            } else {
                c41530qsZ = this;
                interfaceC54577xNn = c41530qsZ.KWHzl;
                if (interfaceC54577xNn != null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
                    return null;
                }
                interfaceC54581xNrOLrzqt.AxsJAY();
                getRawSpotInstrumentsUseCase$onExecute$1.L$0 = c41530qsZ;
                getRawSpotInstrumentsUseCase$onExecute$1.L$1 = rawInstrumentIsolatedStrategy3;
                getRawSpotInstrumentsUseCase$onExecute$1.label = 2;
                objEZpvd = interfaceC54581xNrOLrzqt.EZpvd("SPOT", getRawSpotInstrumentsUseCase$onExecute$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                abstractC54531xLw = (AbstractC54531xLw) objEZpvd;
                if (abstractC54531xLw != null) {
                }
            }
        } else if (i2 == 1) {
            rawInstrumentIsolatedStrategy3 = (RawInstrumentIsolatedStrategy) getRawSpotInstrumentsUseCase$onExecute$1.L$1;
            c41530qsZ = (C41530qsZ) getRawSpotInstrumentsUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            objM8790ensureInitialize0E7RQCE$default = ((Result) objEZpvd).m7386unboximpl();
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC54531xLw2 = (AbstractC54531xLw) getRawSpotInstrumentsUseCase$onExecute$1.L$2;
                rawInstrumentIsolatedStrategy2 = (RawInstrumentIsolatedStrategy) getRawSpotInstrumentsUseCase$onExecute$1.L$1;
                c41530qsZ2 = (C41530qsZ) getRawSpotInstrumentsUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                java.util.ArrayList<BizInstrument> arrayListEZpvd = abstractC54531xLw2.EZpvd();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : arrayListEZpvd) {
                    if (obj instanceof SpotInstrument) {
                        arrayList.add(obj);
                    }
                }
                listEZpvd = RawInstrumentIsolatedStrategy.Companion.EZpvd(arrayList, rawInstrumentIsolatedStrategy2);
                if (listEZpvd != null) {
                    C41434qqj.w$default(C41434qqj.KWHzl, "GetRawSpotInstrumentsUseCase", "No spot instruments available after applying isolation filter", null, 4, null);
                    return null;
                }
                java.util.List list = (java.util.List) c41530qsZ2.OLrzqt.EZpvd(listEZpvd);
                if (!C33129mqd.KWHzl((java.util.Collection) list)) {
                    list = null;
                }
                if (list == null) {
                    C41434qqj.w$default(C41434qqj.KWHzl, "GetRawSpotInstrumentsUseCase", "No spot instruments available after applying isolation and countdown filters", null, 4, null);
                    return null;
                }
                C41434qqj.KWHzl.KWHzl("GetRawSpotInstrumentsUseCase", "get raw spot instruments result: " + list.size() + " instruments");
                return list;
            }
            rawInstrumentIsolatedStrategy3 = (RawInstrumentIsolatedStrategy) getRawSpotInstrumentsUseCase$onExecute$1.L$1;
            c41530qsZ = (C41530qsZ) getRawSpotInstrumentsUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            abstractC54531xLw = (AbstractC54531xLw) objEZpvd;
            if (abstractC54531xLw != null) {
                return null;
            }
            getRawSpotInstrumentsUseCase$onExecute$1.L$0 = c41530qsZ;
            getRawSpotInstrumentsUseCase$onExecute$1.L$1 = rawInstrumentIsolatedStrategy3;
            getRawSpotInstrumentsUseCase$onExecute$1.L$2 = abstractC54531xLw;
            getRawSpotInstrumentsUseCase$onExecute$1.label = 3;
            if (C55608xnE.copydefault(abstractC54531xLw, getRawSpotInstrumentsUseCase$onExecute$1) == objCopydefault) {
                return objCopydefault;
            }
            c41530qsZ2 = c41530qsZ;
            rawInstrumentIsolatedStrategy2 = rawInstrumentIsolatedStrategy3;
            abstractC54531xLw2 = abstractC54531xLw;
            java.util.ArrayList<BizInstrument> arrayListEZpvd2 = abstractC54531xLw2.EZpvd();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (r1.hasNext()) {
            }
            listEZpvd = RawInstrumentIsolatedStrategy.Companion.EZpvd(arrayList2, rawInstrumentIsolatedStrategy2);
            if (listEZpvd != null) {
            }
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        interfaceC54577xNn = c41530qsZ.KWHzl;
        if (interfaceC54577xNn != null) {
        }
        return null;
    }
}

package o;

import com.okinc.market.quotation.domain.options.GetRawOptionsInstrumentsUseCase$loadOptionsInstrument$1;
import com.okinc.market.quotation.domain.options.GetRawOptionsInstrumentsUseCase$onExecute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.OptionInstrument;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49404uns;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41555qsy implements InterfaceC49404uns<Unit, java.util.List<? extends OptionInstrument>> {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC54577xNn OLrzqt;
    public final C41561qtD copydefault;

    @yCM
    public C41555qsy(InterfaceC54577xNn interfaceC54577xNn, @NotNull C41561qtD c41561qtD) {
        Intrinsics.checkNotNullParameter(c41561qtD, "");
        this.OLrzqt = interfaceC54577xNn;
        this.copydefault = c41561qtD;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return EZpvd((Unit) obj, (Continuation<? super java.util.List<OptionInstrument>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    public /* bridge */ /* synthetic */ java.lang.Object OLrzqt(java.lang.Object obj, Continuation continuation) {
        return OLrzqt((Unit) obj, (Continuation<? super java.util.List<OptionInstrument>>) continuation);
    }

    public java.lang.Object OLrzqt(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<OptionInstrument>> continuation) {
        return InterfaceC49404uns.Activity.EZpvd(this, unit, continuation);
    }

    /* JADX INFO: renamed from: o.qsy$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qsy.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<OptionInstrument>> continuation) throws java.lang.Throwable {
        GetRawOptionsInstrumentsUseCase$onExecute$1 getRawOptionsInstrumentsUseCase$onExecute$1;
        C41555qsy c41555qsy;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        if (continuation instanceof GetRawOptionsInstrumentsUseCase$onExecute$1) {
            getRawOptionsInstrumentsUseCase$onExecute$1 = (GetRawOptionsInstrumentsUseCase$onExecute$1) continuation;
            int i = getRawOptionsInstrumentsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRawOptionsInstrumentsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getRawOptionsInstrumentsUseCase$onExecute$1 = new GetRawOptionsInstrumentsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getRawOptionsInstrumentsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRawOptionsInstrumentsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C41434qqj.KWHzl.KWHzl("GetRawOptionsInstrumentsUseCase", "get raw options instruments");
            InterfaceC54577xNn interfaceC54577xNn2 = this.OLrzqt;
            if (interfaceC54577xNn2 != null) {
                getRawOptionsInstrumentsUseCase$onExecute$1.L$0 = this;
                getRawOptionsInstrumentsUseCase$onExecute$1.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn2, false, null, getRawOptionsInstrumentsUseCase$onExecute$1, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c41555qsy = this;
            } else {
                c41555qsy = this;
                interfaceC54577xNn = c41555qsy.OLrzqt;
                if (interfaceC54577xNn != null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
                    return null;
                }
                interfaceC54581xNrOLrzqt.AxsJAY();
                getRawOptionsInstrumentsUseCase$onExecute$1.L$0 = null;
                getRawOptionsInstrumentsUseCase$onExecute$1.label = 2;
                objEZpvd = c41555qsy.EZpvd(interfaceC54581xNrOLrzqt, getRawOptionsInstrumentsUseCase$onExecute$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                java.util.List list = (java.util.List) objEZpvd;
                if (list != null) {
                }
                C41434qqj.KWHzl.KWHzl("GetRawOptionsInstrumentsUseCase", "get raw options instruments result: " + (list != null ? C56443yFo.AEQbTJ(list.size()) : null) + " instruments");
                return list;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                java.util.List list2 = (java.util.List) objEZpvd;
                C41434qqj.KWHzl.KWHzl("GetRawOptionsInstrumentsUseCase", "get raw options instruments result: " + (list2 != null ? C56443yFo.AEQbTJ(list2.size()) : null) + " instruments");
                return list2;
            }
            c41555qsy = (C41555qsy) getRawOptionsInstrumentsUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            objM8790ensureInitialize0E7RQCE$default = ((Result) objEZpvd).m7386unboximpl();
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        interfaceC54577xNn = c41555qsy.OLrzqt;
        if (interfaceC54577xNn != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(InterfaceC54581xNr interfaceC54581xNr, Continuation<? super java.util.List<OptionInstrument>> continuation) throws java.lang.Throwable {
        GetRawOptionsInstrumentsUseCase$loadOptionsInstrument$1 getRawOptionsInstrumentsUseCase$loadOptionsInstrument$1;
        AbstractC54531xLw abstractC54531xLw;
        java.util.List listFilterMarketInstrument$default;
        if (continuation instanceof GetRawOptionsInstrumentsUseCase$loadOptionsInstrument$1) {
            getRawOptionsInstrumentsUseCase$loadOptionsInstrument$1 = (GetRawOptionsInstrumentsUseCase$loadOptionsInstrument$1) continuation;
            int i = getRawOptionsInstrumentsUseCase$loadOptionsInstrument$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRawOptionsInstrumentsUseCase$loadOptionsInstrument$1.label = i - Integer.MIN_VALUE;
            } else {
                getRawOptionsInstrumentsUseCase$loadOptionsInstrument$1 = new GetRawOptionsInstrumentsUseCase$loadOptionsInstrument$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getRawOptionsInstrumentsUseCase$loadOptionsInstrument$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRawOptionsInstrumentsUseCase$loadOptionsInstrument$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (!((java.lang.Boolean) this.copydefault.OLrzqt("OPTION")).booleanValue()) {
                return null;
            }
            getRawOptionsInstrumentsUseCase$loadOptionsInstrument$1.label = 1;
            objEZpvd = interfaceC54581xNr.EZpvd("OPTION", getRawOptionsInstrumentsUseCase$loadOptionsInstrument$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC54531xLw = (AbstractC54531xLw) getRawOptionsInstrumentsUseCase$loadOptionsInstrument$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                java.util.ArrayList<BizInstrument> arrayListEZpvd = abstractC54531xLw.EZpvd();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : arrayListEZpvd) {
                    if (obj instanceof OptionInstrument) {
                        arrayList.add(obj);
                    }
                }
                listFilterMarketInstrument$default = C41428qqd.filterMarketInstrument$default(C41428qqd.OLrzqt, arrayList, false, 2, null);
                if (listFilterMarketInstrument$default != null) {
                    if (!C33129mqd.KWHzl((java.util.Collection) listFilterMarketInstrument$default)) {
                        listFilterMarketInstrument$default = null;
                    }
                    if (listFilterMarketInstrument$default != null) {
                        return listFilterMarketInstrument$default;
                    }
                }
                return null;
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        abstractC54531xLw = (AbstractC54531xLw) objEZpvd;
        if (abstractC54531xLw == null) {
            return null;
        }
        getRawOptionsInstrumentsUseCase$loadOptionsInstrument$1.L$0 = abstractC54531xLw;
        getRawOptionsInstrumentsUseCase$loadOptionsInstrument$1.label = 2;
        if (C55608xnE.copydefault(abstractC54531xLw, getRawOptionsInstrumentsUseCase$loadOptionsInstrument$1) == objCopydefault) {
            return objCopydefault;
        }
        java.util.ArrayList<BizInstrument> arrayListEZpvd2 = abstractC54531xLw.EZpvd();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (r7.hasNext()) {
        }
        listFilterMarketInstrument$default = C41428qqd.filterMarketInstrument$default(C41428qqd.OLrzqt, arrayList2, false, 2, null);
        if (listFilterMarketInstrument$default != null) {
        }
        return null;
    }
}

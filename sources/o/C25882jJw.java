package o;

import com.okinc.business.market.features.analysis.futures.sub.funding.data.model.FundindFeeRateInfoPo;
import com.okinc.business.market.features.analysis.futures.sub.funding.domain.usecase.HoldFundingFeeUseCase$onExecute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jJw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25882jJw extends AbstractC49400uno<java.util.List<? extends FundindFeeRateInfoPo>, java.util.List<? extends C25907jKu>> {
    public final InterfaceC54577xNn EZpvd;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((java.util.List<FundindFeeRateInfoPo>) obj, (Continuation<? super java.util.List<C25907jKu>>) continuation);
    }

    @yCM
    public C25882jJw(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
        this.EZpvd = interfaceC54577xNn;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.qTt.getTitleByIdAndType$default(o.qTt, java.lang.String, java.lang.String, boolean, boolean, boolean, int, java.lang.Object):java.lang.String */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.List<FundindFeeRateInfoPo> list, @NotNull Continuation<? super java.util.List<C25907jKu>> continuation) throws java.lang.Throwable {
        HoldFundingFeeUseCase$onExecute$1 holdFundingFeeUseCase$onExecute$1;
        java.util.List<FundindFeeRateInfoPo> list2;
        C25882jJw c25882jJw;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.lang.Object objEZpvd;
        java.util.List<FundindFeeRateInfoPo> list3;
        C25882jJw c25882jJw2;
        java.lang.String str;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3;
        BizInstrument suggestedInstrument$default;
        if (continuation instanceof HoldFundingFeeUseCase$onExecute$1) {
            holdFundingFeeUseCase$onExecute$1 = (HoldFundingFeeUseCase$onExecute$1) continuation;
            int i = holdFundingFeeUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                holdFundingFeeUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                holdFundingFeeUseCase$onExecute$1 = new HoldFundingFeeUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = holdFundingFeeUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = holdFundingFeeUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNn2 = this.EZpvd;
            if (interfaceC54577xNn2 != null) {
                xNE xne = new xNE();
                holdFundingFeeUseCase$onExecute$1.L$0 = this;
                list2 = list;
                holdFundingFeeUseCase$onExecute$1.L$1 = list2;
                holdFundingFeeUseCase$onExecute$1.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn2, false, xne, holdFundingFeeUseCase$onExecute$1, 1, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c25882jJw = this;
            } else {
                list2 = list;
                c25882jJw = this;
                interfaceC54577xNn = c25882jJw.EZpvd;
                if (interfaceC54577xNn != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
                    holdFundingFeeUseCase$onExecute$1.L$0 = c25882jJw;
                    holdFundingFeeUseCase$onExecute$1.L$1 = list2;
                    holdFundingFeeUseCase$onExecute$1.label = 2;
                    objEZpvd = interfaceC54581xNrOLrzqt.EZpvd("SWAP", holdFundingFeeUseCase$onExecute$1);
                    if (objEZpvd != objCopydefault) {
                        return objCopydefault;
                    }
                    list3 = list2;
                    obj = objEZpvd;
                    c25882jJw2 = c25882jJw;
                    c25882jJw = c25882jJw2;
                    list2 = list3;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                while (r1.hasNext()) {
                }
                return arrayList;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list3 = (java.util.List) holdFundingFeeUseCase$onExecute$1.L$1;
                c25882jJw2 = (C25882jJw) holdFundingFeeUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                c25882jJw = c25882jJw2;
                list2 = list3;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                for (FundindFeeRateInfoPo fundindFeeRateInfoPo : list2) {
                    InterfaceC54577xNn interfaceC54577xNn3 = c25882jJw.EZpvd;
                    java.lang.String tradeSymbol = (interfaceC54577xNn3 == null || (interfaceC54581xNrOLrzqt3 = interfaceC54577xNn3.OLrzqt()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt3, "SWAP", fundindFeeRateInfoPo.getInstId(), null, null, 12, null)) == null) ? null : suggestedInstrument$default.getTradeSymbol();
                    InterfaceC54577xNn interfaceC54577xNn4 = c25882jJw.EZpvd;
                    if (interfaceC54577xNn4 == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn4.OLrzqt()) == null) {
                        str = "";
                    } else {
                        if (tradeSymbol == null) {
                            tradeSymbol = "";
                        }
                        java.lang.String strValueOf = interfaceC54581xNrOLrzqt2.valueOf(tradeSymbol);
                        if (strValueOf != null) {
                            str = strValueOf;
                        }
                    }
                    arrayList2.add(new C25907jKu(C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, fundindFeeRateInfoPo.getInstId(), "SWAP", false, false, false, 24, null), str, fundindFeeRateInfoPo.getFundingFeeRate(), fundindFeeRateInfoPo.getEstimatedFundingFee(), fundindFeeRateInfoPo.getCcy()));
                }
                return arrayList2;
            }
            java.util.List<FundindFeeRateInfoPo> list4 = (java.util.List) holdFundingFeeUseCase$onExecute$1.L$1;
            c25882jJw = (C25882jJw) holdFundingFeeUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
            list2 = list4;
        }
        Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default);
        interfaceC54577xNn = c25882jJw.EZpvd;
        if (interfaceC54577xNn != null) {
            holdFundingFeeUseCase$onExecute$1.L$0 = c25882jJw;
            holdFundingFeeUseCase$onExecute$1.L$1 = list2;
            holdFundingFeeUseCase$onExecute$1.label = 2;
            objEZpvd = interfaceC54581xNrOLrzqt.EZpvd("SWAP", holdFundingFeeUseCase$onExecute$1);
            if (objEZpvd != objCopydefault) {
            }
        }
        java.util.ArrayList arrayList22 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
        while (r1.hasNext()) {
        }
        return arrayList22;
    }
}

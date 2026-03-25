package o;

import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.models.ChainInfo;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.repository.InvestIndependentCheckFlowService$executeInvestFlow$1;
import com.okinc.business.invest_biz.repository.InvestIndependentCheckFlowService$executeInvestFlowInternal$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.InterfaceC26557jea;
import o.iOY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iPe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23946iPe {
    public final C26536jeF EZpvd;
    public final C26594jfK KWHzl;

    @yCM
    public C23946iPe(@NotNull C26594jfK c26594jfK, @NotNull C26536jeF c26536jeF) {
        Intrinsics.checkNotNullParameter(c26594jfK, "");
        Intrinsics.checkNotNullParameter(c26536jeF, "");
        this.KWHzl = c26594jfK;
        this.EZpvd = c26536jeF;
    }

    public final void KWHzl(@NotNull InterfaceC25466ixJ interfaceC25466ixJ, long j, @NotNull TokenInvestDetail tokenInvestDetail, boolean z, @NotNull InvestPageSource investPageSource, boolean z2, @NotNull Function1<? super iOY, Unit> function1, @NotNull Function1<? super java.lang.Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(interfaceC25466ixJ, "");
        Intrinsics.checkNotNullParameter(tokenInvestDetail, "");
        Intrinsics.checkNotNullParameter(investPageSource, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        BuildersKt__Builders_commonKt.launch$default(interfaceC25466ixJ.KWHzl(), null, null, new InvestIndependentCheckFlowService$executeInvestFlow$1(this, j, tokenInvestDetail, z, z2, function1, function12, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(long j, TokenInvestDetail tokenInvestDetail, boolean z, boolean z2, Continuation<? super iOY> continuation) throws java.lang.Throwable {
        InvestIndependentCheckFlowService$executeInvestFlowInternal$1 investIndependentCheckFlowService$executeInvestFlowInternal$1;
        java.lang.Object objM7377constructorimpl;
        boolean z3;
        java.lang.Object objKWHzl;
        C23946iPe c23946iPe;
        TokenInvestDetail tokenInvestDetail2;
        long j2;
        java.lang.Object objOLrzqt;
        java.lang.Object actionBar;
        if (continuation instanceof InvestIndependentCheckFlowService$executeInvestFlowInternal$1) {
            investIndependentCheckFlowService$executeInvestFlowInternal$1 = (InvestIndependentCheckFlowService$executeInvestFlowInternal$1) continuation;
            int i = investIndependentCheckFlowService$executeInvestFlowInternal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investIndependentCheckFlowService$executeInvestFlowInternal$1.label = i - Integer.MIN_VALUE;
            } else {
                investIndependentCheckFlowService$executeInvestFlowInternal$1 = new InvestIndependentCheckFlowService$executeInvestFlowInternal$1(this, continuation);
            }
        }
        java.lang.Object obj = investIndependentCheckFlowService$executeInvestFlowInternal$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = investIndependentCheckFlowService$executeInvestFlowInternal$1.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            C26536jeF c26536jeF = this.EZpvd;
            ProductDetailsByChain productDetailsByChain = new ProductDetailsByChain(j, InvestmentKind.Default, new ChainInfo(tokenInvestDetail.EZpvd(), "", null, null, null, 28, null), false, null, null, null, false, 248, null);
            investIndependentCheckFlowService$executeInvestFlowInternal$1.L$0 = this;
            investIndependentCheckFlowService$executeInvestFlowInternal$1.L$1 = tokenInvestDetail;
            investIndependentCheckFlowService$executeInvestFlowInternal$1.J$0 = j;
            z3 = z;
            investIndependentCheckFlowService$executeInvestFlowInternal$1.Z$0 = z3;
            investIndependentCheckFlowService$executeInvestFlowInternal$1.label = 1;
            objKWHzl = c26536jeF.KWHzl(productDetailsByChain, z2, investIndependentCheckFlowService$executeInvestFlowInternal$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c23946iPe = this;
            tokenInvestDetail2 = tokenInvestDetail;
            j2 = j;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                C56391yDq.AEQbTJ(objOLrzqt);
                actionBar = new iOY.StateListAnimator((InterfaceC26561jee) objOLrzqt);
                objM7377constructorimpl = Result.m7377constructorimpl(actionBar);
                C56391yDq.AEQbTJ(objM7377constructorimpl);
                return objM7377constructorimpl;
            }
            boolean z4 = investIndependentCheckFlowService$executeInvestFlowInternal$1.Z$0;
            j2 = investIndependentCheckFlowService$executeInvestFlowInternal$1.J$0;
            tokenInvestDetail2 = (TokenInvestDetail) investIndependentCheckFlowService$executeInvestFlowInternal$1.L$1;
            c23946iPe = (C23946iPe) investIndependentCheckFlowService$executeInvestFlowInternal$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
            z3 = z4;
        }
        C56391yDq.AEQbTJ(objKWHzl);
        InterfaceC26557jea interfaceC26557jea = (InterfaceC26557jea) objKWHzl;
        if (!(interfaceC26557jea instanceof InterfaceC26557jea.StateListAnimator)) {
            actionBar = new iOY.ActionBar(interfaceC26557jea);
            objM7377constructorimpl = Result.m7377constructorimpl(actionBar);
            C56391yDq.AEQbTJ(objM7377constructorimpl);
            return objM7377constructorimpl;
        }
        C26594jfK c26594jfK = c23946iPe.KWHzl;
        investIndependentCheckFlowService$executeInvestFlowInternal$1.L$0 = null;
        investIndependentCheckFlowService$executeInvestFlowInternal$1.L$1 = null;
        investIndependentCheckFlowService$executeInvestFlowInternal$1.label = 2;
        objOLrzqt = c26594jfK.OLrzqt(j2, z3, tokenInvestDetail2, investIndependentCheckFlowService$executeInvestFlowInternal$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        actionBar = new iOY.StateListAnimator((InterfaceC26561jee) objOLrzqt);
        objM7377constructorimpl = Result.m7377constructorimpl(actionBar);
        C56391yDq.AEQbTJ(objM7377constructorimpl);
        return objM7377constructorimpl;
    }
}

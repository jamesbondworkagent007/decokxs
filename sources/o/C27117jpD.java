package o;

import androidx.lifecycle.ViewModel;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.models.ChainInfo;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource;
import com.okinc.business.invest_biz.ui.viewmodel.token.DeFiTokenInvestViewModel$executeInvestFlow$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC27123jpJ;
import o.InterfaceC26557jea;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jpD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27117jpD extends ViewModel {
    public final C26594jfK KWHzl;
    public final C26536jeF OLrzqt;

    @yCM
    public C27117jpD(@NotNull C26594jfK c26594jfK, @NotNull C26536jeF c26536jeF) {
        Intrinsics.checkNotNullParameter(c26594jfK, "");
        Intrinsics.checkNotNullParameter(c26536jeF, "");
        this.KWHzl = c26594jfK;
        this.OLrzqt = c26536jeF;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(long j, @NotNull TokenInvestDetail tokenInvestDetail, boolean z, boolean z2, @NotNull InvestPageSource investPageSource, @NotNull Continuation<? super Result<? extends AbstractC27123jpJ>> continuation) {
        DeFiTokenInvestViewModel$executeInvestFlow$1 deFiTokenInvestViewModel$executeInvestFlow$1;
        TokenInvestDetail tokenInvestDetail2;
        long j2;
        boolean z3;
        java.lang.Object objKWHzl;
        C27117jpD c27117jpD;
        java.lang.Object objOLrzqt;
        java.lang.Object application;
        if (continuation instanceof DeFiTokenInvestViewModel$executeInvestFlow$1) {
            deFiTokenInvestViewModel$executeInvestFlow$1 = (DeFiTokenInvestViewModel$executeInvestFlow$1) continuation;
            int i = deFiTokenInvestViewModel$executeInvestFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiTokenInvestViewModel$executeInvestFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiTokenInvestViewModel$executeInvestFlow$1 = new DeFiTokenInvestViewModel$executeInvestFlow$1(this, continuation);
            }
        }
        java.lang.Object obj = deFiTokenInvestViewModel$executeInvestFlow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiTokenInvestViewModel$executeInvestFlow$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application2 = Result.Companion;
                C26536jeF c26536jeF = this.OLrzqt;
                ProductDetailsByChain productDetailsByChain = new ProductDetailsByChain(j, InvestmentKind.Default, new ChainInfo(tokenInvestDetail.EZpvd(), "", null, null, null, 28, null), false, null, null, null, false, 248, null);
                deFiTokenInvestViewModel$executeInvestFlow$1.L$0 = this;
                tokenInvestDetail2 = tokenInvestDetail;
                deFiTokenInvestViewModel$executeInvestFlow$1.L$1 = tokenInvestDetail2;
                j2 = j;
                deFiTokenInvestViewModel$executeInvestFlow$1.J$0 = j2;
                z3 = z;
                deFiTokenInvestViewModel$executeInvestFlow$1.Z$0 = z3;
                deFiTokenInvestViewModel$executeInvestFlow$1.label = 1;
                objKWHzl = c26536jeF.KWHzl(productDetailsByChain, z2, deFiTokenInvestViewModel$executeInvestFlow$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c27117jpD = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objOLrzqt = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objOLrzqt);
                    application = new AbstractC27123jpJ.ActionBar((InterfaceC26561jee) objOLrzqt);
                    return Result.m7377constructorimpl(application);
                }
                boolean z4 = deFiTokenInvestViewModel$executeInvestFlow$1.Z$0;
                long j3 = deFiTokenInvestViewModel$executeInvestFlow$1.J$0;
                TokenInvestDetail tokenInvestDetail3 = (TokenInvestDetail) deFiTokenInvestViewModel$executeInvestFlow$1.L$1;
                C27117jpD c27117jpD2 = (C27117jpD) deFiTokenInvestViewModel$executeInvestFlow$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                z3 = z4;
                c27117jpD = c27117jpD2;
                tokenInvestDetail2 = tokenInvestDetail3;
                j2 = j3;
            }
            C56391yDq.AEQbTJ(objKWHzl);
            InterfaceC26557jea interfaceC26557jea = (InterfaceC26557jea) objKWHzl;
            if (!(interfaceC26557jea instanceof InterfaceC26557jea.StateListAnimator)) {
                application = new AbstractC27123jpJ.Application(interfaceC26557jea);
                return Result.m7377constructorimpl(application);
            }
            C26594jfK c26594jfK = c27117jpD.KWHzl;
            deFiTokenInvestViewModel$executeInvestFlow$1.L$0 = null;
            deFiTokenInvestViewModel$executeInvestFlow$1.L$1 = null;
            deFiTokenInvestViewModel$executeInvestFlow$1.label = 2;
            objOLrzqt = c26594jfK.OLrzqt(j2, z3, tokenInvestDetail2, deFiTokenInvestViewModel$executeInvestFlow$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            application = new AbstractC27123jpJ.ActionBar((InterfaceC26561jee) objOLrzqt);
            return Result.m7377constructorimpl(application);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}

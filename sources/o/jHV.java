package o;

import com.okinc.account.api.model.subaccount.AccountInfo;
import com.okinc.business.market.features.analysis.common.domain.usecase.MarketGetAccountListUseCase$onExecute$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jHV extends AbstractC49400uno<Unit, java.util.List<? extends jHT>> {
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC8103awS copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public jHV(@NotNull InterfaceC8103awS interfaceC8103awS, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC8103awS, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC8103awS;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<jHT>> continuation) throws java.lang.Throwable {
        MarketGetAccountListUseCase$onExecute$1 marketGetAccountListUseCase$onExecute$1;
        java.lang.Object objM7386unboximpl;
        java.util.List list;
        java.lang.Integer num;
        java.lang.String strCopydefault;
        java.lang.String str;
        if (continuation instanceof MarketGetAccountListUseCase$onExecute$1) {
            marketGetAccountListUseCase$onExecute$1 = (MarketGetAccountListUseCase$onExecute$1) continuation;
            int i = marketGetAccountListUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketGetAccountListUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                marketGetAccountListUseCase$onExecute$1 = new MarketGetAccountListUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = marketGetAccountListUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketGetAccountListUseCase$onExecute$1.label;
        int i3 = 1;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                InterfaceC8103awS interfaceC8103awS = this.copydefault;
                marketGetAccountListUseCase$onExecute$1.L$0 = arrayList;
                marketGetAccountListUseCase$onExecute$1.label = 1;
                java.lang.Object objEZpvd = interfaceC8103awS.EZpvd(marketGetAccountListUseCase$onExecute$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl = objEZpvd;
                list = arrayList;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (java.util.List) marketGetAccountListUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            java.util.List<AccountInfo> list2 = (java.util.List) objM7386unboximpl;
            if (list2 != null) {
                for (AccountInfo accountInfo : list2) {
                    if (accountInfo.isMainAccount()) {
                        num = null;
                    } else {
                        java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(i3);
                        i3++;
                        num = numAEQbTJ;
                    }
                    if (accountInfo.isMainAccount()) {
                        strCopydefault = C33069mpW.copydefault(qZH.PendingIntent.AEQbTJ, C56423yEv.EZpvd(C56390yDp.OLrzqt("view", C33070mpX.AYXKKw(qZH.PendingIntent.djBIcL))));
                    } else {
                        strCopydefault = accountInfo.getLoginId() + "/" + C33070mpX.AYXKKw(qZH.PendingIntent.djBIcL);
                    }
                    java.lang.String str2 = strCopydefault;
                    if (accountInfo.isMainAccount()) {
                        str = C33070mpX.AYXKKw(qZH.PendingIntent.apNbdB) + " " + accountInfo.getLoginId();
                    } else {
                        str = C33070mpX.AYXKKw(qZH.PendingIntent.fXHmeK) + num + " " + accountInfo.getLoginId();
                    }
                    list.add(new jHT(accountInfo.getLoginId(), accountInfo.isMainAccount(), accountInfo.getUid(), num, str2, str));
                }
            }
            return list;
        } catch (java.lang.Exception unused) {
            return yDY.AhwBna();
        }
    }
}

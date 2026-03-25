package o;

import com.okinc.business.defi.biz.net.bean.TxSelectType;
import com.okinc.business.defi.biz.net.bean.TxTypes;
import com.okinc.business.defi.wallet.history.usecase.TradeTypesUseCase$getTradeTypes$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eKu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15504eKu {
    public final InterfaceC15501eKr OLrzqt;

    public C15504eKu(@NotNull InterfaceC15501eKr interfaceC15501eKr) {
        Intrinsics.checkNotNullParameter(interfaceC15501eKr, "");
        this.OLrzqt = interfaceC15501eKr;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<C15505eKv>> continuation) throws java.lang.Throwable {
        TradeTypesUseCase$getTradeTypes$1 tradeTypesUseCase$getTradeTypes$1;
        java.util.List<TxSelectType> content;
        if (continuation instanceof TradeTypesUseCase$getTradeTypes$1) {
            tradeTypesUseCase$getTradeTypes$1 = (TradeTypesUseCase$getTradeTypes$1) continuation;
            int i = tradeTypesUseCase$getTradeTypes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradeTypesUseCase$getTradeTypes$1.label = i - Integer.MIN_VALUE;
            } else {
                tradeTypesUseCase$getTradeTypes$1 = new TradeTypesUseCase$getTradeTypes$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = tradeTypesUseCase$getTradeTypes$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = tradeTypesUseCase$getTradeTypes$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            InterfaceC15501eKr interfaceC15501eKr = this.OLrzqt;
            tradeTypesUseCase$getTradeTypes$1.label = 1;
            objCopydefault = interfaceC15501eKr.copydefault(tradeTypesUseCase$getTradeTypes$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        TxTypes txTypes = (TxTypes) ((AbstractC43419rot) objCopydefault).copydefault();
        if (txTypes == null || (content = txTypes.getContent()) == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(content, 10));
        for (TxSelectType txSelectType : content) {
            arrayList.add(new C15505eKv(txSelectType.getGroupType(), txSelectType.getGroupTypeText(), false, 4, null));
        }
        return arrayList;
    }
}

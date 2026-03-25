package com.okinc.business.market.domain;

import com.okinc.business.dexlogic.bean.MarketTokenCheckBeanParams;
import com.okinc.business.dexlogic.main.market.bean.CoinDetailTradeJumpBean;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C25624jAh;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC25627jAk;
import o.InterfaceC27611jyU;
import o.InterfaceC9738bbJ;
import o.kKG;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.domain.MarketTradeUseCase$invoke-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class MarketTradeUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InterfaceC25627jAk.ActionBar>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C25624jAh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketTradeUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, C25624jAh c25624jAh, String str, String str2) {
        super(2, continuation);
        this.this$0 = c25624jAh;
        this.$chainId$inlined = str;
        this.$tokenContractAddress$inlined = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketTradeUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenContractAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends InterfaceC25627jAk.ActionBar>> continuation) {
        return ((MarketTradeUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        InterfaceC9738bbJ interfaceC9738bbJValueOf;
        Object objCopydefault;
        String str;
        Set<String> setCopydefault;
        String str2;
        Object objOLrzqt;
        Object objKWHzl;
        CoinDetailTradeJumpBean coinDetailTradeJumpBean;
        Object objM7386unboximpl;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            interfaceC9738bbJValueOf = this.this$0.AEQbTJ.valueOf();
            String strJoinToString$default = (interfaceC9738bbJValueOf == null || (setCopydefault = interfaceC9738bbJValueOf.copydefault()) == null) ? null : CollectionsKt___CollectionsKt.joinToString$default(setCopydefault, ",", null, null, 0, null, null, 62, null);
            if (strJoinToString$default == null) {
                strJoinToString$default = "";
            }
            kKG kkg = this.this$0.AEQbTJ;
            this.L$0 = interfaceC9738bbJValueOf;
            this.L$1 = strJoinToString$default;
            this.label = 1;
            objCopydefault = kkg.copydefault(this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            str = strJoinToString$default;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coinDetailTradeJumpBean = (CoinDetailTradeJumpBean) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objM7386unboximpl = ((Result) obj).m7386unboximpl();
                    Boolean boolKWHzl = C56443yFo.KWHzl(false);
                    if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                        objM7386unboximpl = boolKWHzl;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(new InterfaceC25627jAk.ActionBar(coinDetailTradeJumpBean, ((Boolean) objM7386unboximpl).booleanValue()));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                String str3 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str2 = str3;
                objOLrzqt = obj;
                CoinDetailTradeJumpBean coinDetailTradeJumpBean2 = (CoinDetailTradeJumpBean) ((AbstractC43419rot) objOLrzqt).AEQbTJ();
                C25624jAh c25624jAh = this.this$0;
                this.L$0 = coinDetailTradeJumpBean2;
                this.label = 3;
                objKWHzl = c25624jAh.KWHzl(str2, coinDetailTradeJumpBean2, this);
                if (objKWHzl != objCopydefault2) {
                    return objCopydefault2;
                }
                coinDetailTradeJumpBean = coinDetailTradeJumpBean2;
                objM7386unboximpl = objKWHzl;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(false);
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(new InterfaceC25627jAk.ActionBar(coinDetailTradeJumpBean, ((Boolean) objM7386unboximpl).booleanValue()));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            String str4 = (String) this.L$1;
            InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) this.L$0;
            C56391yDq.AEQbTJ(obj);
            str = str4;
            interfaceC9738bbJValueOf = interfaceC9738bbJ;
            objCopydefault = obj;
        }
        str2 = (String) objCopydefault;
        String strDbNXlk = interfaceC9738bbJValueOf != null ? interfaceC9738bbJValueOf.DbNXlk() : null;
        MarketTokenCheckBeanParams marketTokenCheckBeanParams = new MarketTokenCheckBeanParams(this.$chainId$inlined, this.$tokenContractAddress$inlined, str, strDbNXlk == null ? "" : strDbNXlk, str2);
        InterfaceC27611jyU interfaceC27611jyU = this.this$0.KWHzl;
        this.L$0 = str2;
        this.L$1 = null;
        this.label = 2;
        objOLrzqt = interfaceC27611jyU.OLrzqt(marketTokenCheckBeanParams, this);
        if (objOLrzqt == objCopydefault2) {
            return objCopydefault2;
        }
        CoinDetailTradeJumpBean coinDetailTradeJumpBean22 = (CoinDetailTradeJumpBean) ((AbstractC43419rot) objOLrzqt).AEQbTJ();
        C25624jAh c25624jAh2 = this.this$0;
        this.L$0 = coinDetailTradeJumpBean22;
        this.label = 3;
        objKWHzl = c25624jAh2.KWHzl(str2, coinDetailTradeJumpBean22, this);
        if (objKWHzl != objCopydefault2) {
        }
    }
}

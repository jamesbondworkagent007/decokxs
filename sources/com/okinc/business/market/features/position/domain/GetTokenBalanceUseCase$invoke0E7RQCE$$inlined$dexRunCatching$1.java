package com.okinc.business.market.features.position.domain;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.network.okg.response.OKServerException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C29129knn;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC29132knq;
import o.InterfaceC9738bbJ;
import o.kKG;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.position.domain.GetTokenBalanceUseCase$invoke-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetTokenBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends DexMultiTokenInfoBean>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $tokenAddress$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C29129knn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, C29129knn c29129knn, String str, String str2) {
        super(2, continuation);
        this.this$0 = c29129knn;
        this.$chainId$inlined = str;
        this.$tokenAddress$inlined = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetTokenBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends DexMultiTokenInfoBean>> continuation) {
        return ((GetTokenBalanceUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String strEZpvd;
        String str;
        String str2;
        String str3;
        InterfaceC29132knq interfaceC29132knq;
        String str4;
        String str5;
        String str6;
        Object objCopydefault = C56442yFn.copydefault();
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
            InterfaceC9738bbJ interfaceC9738bbJValueOf = this.this$0.copydefault.valueOf();
            if (interfaceC9738bbJValueOf == null || (strEZpvd = interfaceC9738bbJValueOf.EZpvd(C33129mqd.valueOf(this.$chainId$inlined))) == null) {
                throw new OKServerException(6, null, null, null, 14, null);
            }
            InterfaceC29132knq interfaceC29132knq2 = this.this$0.OLrzqt;
            str = this.$chainId$inlined;
            str2 = this.$tokenAddress$inlined;
            kKG kkg = this.this$0.copydefault;
            this.L$0 = strEZpvd;
            this.L$1 = str2;
            this.L$2 = str;
            this.L$3 = interfaceC29132knq2;
            this.label = 1;
            Object objCopydefault2 = kkg.copydefault(this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            str3 = strEZpvd;
            obj = objCopydefault2;
            interfaceC29132knq = interfaceC29132knq2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) obj).AEQbTJ());
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                String str7 = (String) this.L$4;
                String str8 = (String) this.L$3;
                interfaceC29132knq = (InterfaceC29132knq) this.L$2;
                str = (String) this.L$1;
                String str9 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str4 = str7;
                str5 = str9;
                str6 = str8;
                InterfaceC29132knq interfaceC29132knq3 = interfaceC29132knq;
                String str10 = str;
                String str11 = str5;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 3;
                obj = interfaceC29132knq3.EZpvd(str10, str11, str6, str4, (String) obj, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) obj).AEQbTJ());
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            InterfaceC29132knq interfaceC29132knq4 = (InterfaceC29132knq) this.L$3;
            String str12 = (String) this.L$2;
            String str13 = (String) this.L$1;
            String str14 = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            interfaceC29132knq = interfaceC29132knq4;
            str3 = str14;
            str2 = str13;
            str = str12;
        }
        String str15 = (String) obj;
        kKG kkg2 = this.this$0.copydefault;
        this.L$0 = str2;
        this.L$1 = str;
        this.L$2 = interfaceC29132knq;
        this.L$3 = str15;
        this.L$4 = str3;
        this.label = 2;
        Object objAEQbTJ = kkg2.AEQbTJ(this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        str4 = str3;
        str5 = str2;
        str6 = str15;
        obj = objAEQbTJ;
        InterfaceC29132knq interfaceC29132knq32 = interfaceC29132knq;
        String str102 = str;
        String str112 = str5;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 3;
        obj = interfaceC29132knq32.EZpvd(str102, str112, str6, str4, (String) obj, this);
        if (obj == objCopydefault) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) obj).AEQbTJ());
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}

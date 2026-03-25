package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.network.okg.response.OKServerException;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28158kRa;
import o.C28196kSl;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28152kQv;
import o.InterfaceC9738bbJ;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedKLineInfoUseCase$getKLineInfo$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends AbstractC43419rot<? extends LatestMarketInfoBean, ? extends OKServerException>>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $tokenAddress$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C28158kRa this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedKLineInfoUseCase$getKLineInfo$$inlined$dexRunCatching$1(Continuation continuation, C28158kRa c28158kRa, String str, String str2) {
        super(2, continuation);
        this.this$0 = c28158kRa;
        this.$chainId$inlined = str;
        this.$tokenAddress$inlined = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedKLineInfoUseCase$getKLineInfo$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends AbstractC43419rot<? extends LatestMarketInfoBean, ? extends OKServerException>>> continuation) {
        return ((AdvancedKLineInfoUseCase$getKLineInfo$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c A[Catch: all -> 0x00b4, CancellationException -> 0x00cb, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00cb, all -> 0x00b4, blocks: (B:7:0x0011, B:37:0x00af, B:12:0x002e, B:26:0x0087, B:28:0x008c, B:34:0x009d, B:15:0x003f, B:22:0x006b, B:18:0x0046), top: B:45:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str;
        InterfaceC28152kQv interfaceC28152kQv;
        String str2;
        String str3;
        InterfaceC28152kQv interfaceC28152kQv2;
        String strEZpvd;
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
            InterfaceC28152kQv interfaceC28152kQv3 = this.this$0.copydefault;
            String str4 = this.$chainId$inlined;
            str = this.$tokenAddress$inlined;
            C28196kSl c28196kSl = this.this$0.AEQbTJ;
            this.L$0 = str;
            this.L$1 = str4;
            this.L$2 = interfaceC28152kQv3;
            this.label = 1;
            Object objOLrzqt = c28196kSl.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            interfaceC28152kQv = interfaceC28152kQv3;
            obj = objOLrzqt;
            str2 = str4;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl(obj);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                String str5 = (String) this.L$3;
                interfaceC28152kQv2 = (InterfaceC28152kQv) this.L$2;
                str2 = (String) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str3 = str5;
                InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
                strEZpvd = interfaceC9738bbJ == null ? interfaceC9738bbJ.EZpvd(Long.parseLong(this.$chainId$inlined)) : null;
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                String str6 = strEZpvd;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                obj = interfaceC28152kQv2.KWHzl(str2, str, str3, str6, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(obj);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            interfaceC28152kQv = (InterfaceC28152kQv) this.L$2;
            str2 = (String) this.L$1;
            str = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String str7 = (String) obj;
        C28196kSl c28196kSl2 = this.this$0.AEQbTJ;
        this.L$0 = str;
        this.L$1 = str2;
        this.L$2 = interfaceC28152kQv;
        this.L$3 = str7;
        this.label = 2;
        Object objEZpvd = c28196kSl2.EZpvd(this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        str3 = str7;
        obj = objEZpvd;
        interfaceC28152kQv2 = interfaceC28152kQv;
        InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) obj;
        if (interfaceC9738bbJ2 == null) {
        }
        if (strEZpvd == null) {
        }
        String str62 = strEZpvd;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 3;
        obj = interfaceC28152kQv2.KWHzl(str2, str, str3, str62, this);
        if (obj == objCopydefault) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(obj);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}

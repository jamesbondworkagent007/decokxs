package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.dex.trade.core.domain.model.limit.PairRateParams;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateRequest;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28160kRc;
import o.C28196kSl;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;
import o.gYO;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.usecase.AdvancedLimitRateUseCase$getLimitPairRate-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedLimitRateUseCase$getLimitPairRategIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TokenPairRateQuote>>, Object> {
    final /* synthetic */ LimitPairRateRequest $request$inlined;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ C28160kRc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedLimitRateUseCase$getLimitPairRategIAlus$$inlined$dexRunCatching$1(Continuation continuation, C28160kRc c28160kRc, LimitPairRateRequest limitPairRateRequest) {
        super(2, continuation);
        this.this$0 = c28160kRc;
        this.$request$inlined = limitPairRateRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedLimitRateUseCase$getLimitPairRategIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$request$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TokenPairRateQuote>> continuation) {
        return ((AdvancedLimitRateUseCase$getLimitPairRategIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0106 A[Catch: all -> 0x013a, CancellationException -> 0x0151, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0151, all -> 0x013a, blocks: (B:7:0x0014, B:38:0x012f, B:12:0x0041, B:27:0x0102, B:29:0x0106, B:35:0x0112, B:13:0x004f, B:19:0x0077, B:21:0x00c2, B:23:0x00d7, B:16:0x0058), top: B:46:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objOLrzqt;
        Object objEZpvd;
        String str;
        gYO gyo;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        long j;
        String strDbNXlk;
        Object objCopydefault;
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
            C28196kSl c28196kSl = this.this$0.djBIcL;
            long jValueOf = C33129mqd.valueOf(C56443yFo.KWHzl(this.$request$inlined.getChainId()));
            this.label = 1;
            objOLrzqt = c28196kSl.OLrzqt(jValueOf, this);
            if (objOLrzqt == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objCopydefault = obj;
                    objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) objCopydefault).AEQbTJ());
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                long j2 = this.J$0;
                gyo = (gYO) this.L$6;
                String str7 = (String) this.L$5;
                String str8 = (String) this.L$4;
                String str9 = (String) this.L$3;
                String str10 = (String) this.L$2;
                String str11 = (String) this.L$1;
                String str12 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str3 = str10;
                str2 = str11;
                str = str12;
                str6 = str7;
                str5 = str8;
                str4 = str9;
                j = j2;
                objEZpvd = obj;
                InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objEZpvd;
                strDbNXlk = interfaceC9738bbJ == null ? interfaceC9738bbJ.DbNXlk() : null;
                if (strDbNXlk == null) {
                    strDbNXlk = "";
                }
                PairRateParams pairRateParams = new PairRateParams(j, str6, str5, str4, str3, str2, str, strDbNXlk);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 3;
                objCopydefault = gyo.copydefault(pairRateParams, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) objCopydefault).AEQbTJ());
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        String strOLrzqt = this.this$0.EZpvd.OLrzqt(C33129mqd.gEmmrt(C56443yFo.KWHzl(this.$request$inlined.getChainId())));
        LimitPairRateRequest limitPairRateRequest = this.$request$inlined;
        LimitPairRateRequest limitPairRateRequestCopy = limitPairRateRequest.copy((47 & 1) != 0 ? limitPairRateRequest.chainId : 0L, (47 & 2) != 0 ? limitPairRateRequest.fromTokenAddress : null, (47 & 4) != 0 ? limitPairRateRequest.toTokenAddress : null, (47 & 8) != 0 ? limitPairRateRequest.fromAmount : null, (47 & 16) != 0 ? limitPairRateRequest.userWalletAddress : (String) objOLrzqt, (47 & 32) != 0 ? limitPairRateRequest.dexIds : null, (47 & 64) != 0 ? limitPairRateRequest.refCode : strOLrzqt);
        gYO gyo2 = this.this$0.OLrzqt;
        long chainId = limitPairRateRequestCopy.getChainId();
        String fromTokenAddress = limitPairRateRequestCopy.getFromTokenAddress();
        String toTokenAddress = limitPairRateRequestCopy.getToTokenAddress();
        String fromAmount = limitPairRateRequestCopy.getFromAmount();
        String userWalletAddress = limitPairRateRequestCopy.getUserWalletAddress();
        List<String> dexIds = limitPairRateRequestCopy.getDexIds();
        String strJoinToString$default = dexIds != null ? CollectionsKt___CollectionsKt.joinToString$default(dexIds, ",", null, null, 0, null, null, 62, null) : null;
        String refCode = limitPairRateRequestCopy.getRefCode();
        C28196kSl c28196kSl2 = this.this$0.djBIcL;
        this.L$0 = refCode;
        this.L$1 = strJoinToString$default;
        this.L$2 = userWalletAddress;
        this.L$3 = fromAmount;
        this.L$4 = toTokenAddress;
        this.L$5 = fromTokenAddress;
        this.L$6 = gyo2;
        this.J$0 = chainId;
        this.label = 2;
        objEZpvd = c28196kSl2.EZpvd(this);
        if (objEZpvd == objCopydefault2) {
            return objCopydefault2;
        }
        str = refCode;
        gyo = gyo2;
        str2 = strJoinToString$default;
        str3 = userWalletAddress;
        str4 = fromAmount;
        str5 = toTokenAddress;
        str6 = fromTokenAddress;
        j = chainId;
        InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) objEZpvd;
        if (interfaceC9738bbJ2 == null) {
        }
        if (strDbNXlk == null) {
        }
        PairRateParams pairRateParams2 = new PairRateParams(j, str6, str5, str4, str3, str2, str, strDbNXlk);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.label = 3;
        objCopydefault = gyo.copydefault(pairRateParams2, this);
        if (objCopydefault == objCopydefault2) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) objCopydefault).AEQbTJ());
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}

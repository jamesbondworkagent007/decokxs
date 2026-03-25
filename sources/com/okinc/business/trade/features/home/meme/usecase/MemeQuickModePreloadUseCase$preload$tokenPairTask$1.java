package com.okinc.business.trade.features.home.meme.usecase;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensResponse;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.kKG;
import o.kVR;
import o.kVU;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeQuickModePreloadUseCase$preload$tokenPairTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Pair<? extends DexMultiTokenInfoBean, ? extends DexMultiTokenInfoBean>>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $currencyTokenAddress;
    final /* synthetic */ String $tokenAddress;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ kVR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeQuickModePreloadUseCase$preload$tokenPairTask$1(kVR kvr, String str, String str2, String str3, Continuation<? super MemeQuickModePreloadUseCase$preload$tokenPairTask$1> continuation) {
        super(2, continuation);
        this.this$0 = kvr;
        this.$chainId = str;
        this.$tokenAddress = str2;
        this.$currencyTokenAddress = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeQuickModePreloadUseCase$preload$tokenPairTask$1(this.this$0, this.$chainId, this.$tokenAddress, this.$currencyTokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Pair<? extends DexMultiTokenInfoBean, ? extends DexMultiTokenInfoBean>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>> continuation) {
        return ((MemeQuickModePreloadUseCase$preload$tokenPairTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        kVU kvu;
        String str2;
        kVU kvu2;
        String str3;
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kVU kvu3 = this.this$0.AYXKKw;
            str = this.$chainId;
            kKG kkg = this.this$0.DbNXlk;
            this.L$0 = kvu3;
            this.L$1 = str;
            this.label = 1;
            Object objAEQbTJ = kkg.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            kvu = kvu3;
            obj = objAEQbTJ;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objOLrzqt = ((Result) obj).m7386unboximpl();
                    if (Result.m7384isSuccessimpl(objOLrzqt)) {
                        Result.Application application = Result.Companion;
                        ValidateTokensResponse validateTokensResponse = (ValidateTokensResponse) objOLrzqt;
                        objOLrzqt = C56390yDp.OLrzqt(validateTokensResponse.getToTokenInfo(), validateTokensResponse.getFromTokenInfo());
                    }
                    return Result.m7376boximpl(Result.m7377constructorimpl(objOLrzqt));
                }
                String str4 = (String) this.L$2;
                String str5 = (String) this.L$1;
                kVU kvu4 = (kVU) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str2 = str4;
                str3 = str5;
                kvu2 = kvu4;
                String str6 = this.$tokenAddress;
                String str7 = this.$currencyTokenAddress;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                objOLrzqt = kvu2.OLrzqt(str3, str2, (String) obj, str6, str7, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7384isSuccessimpl(objOLrzqt)) {
                }
                return Result.m7376boximpl(Result.m7377constructorimpl(objOLrzqt));
            }
            str = (String) this.L$1;
            kvu = (kVU) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String str8 = (String) obj;
        kKG kkg2 = this.this$0.DbNXlk;
        this.L$0 = kvu;
        this.L$1 = str;
        this.L$2 = str8;
        this.label = 2;
        Object objCopydefault2 = kkg2.copydefault(this);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        str2 = str8;
        obj = objCopydefault2;
        kvu2 = kvu;
        str3 = str;
        String str62 = this.$tokenAddress;
        String str72 = this.$currencyTokenAddress;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 3;
        objOLrzqt = kvu2.OLrzqt(str3, str2, (String) obj, str62, str72, this);
        if (objOLrzqt == objCopydefault) {
        }
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
        }
        return Result.m7376boximpl(Result.m7377constructorimpl(objOLrzqt));
    }
}

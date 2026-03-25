package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28182kRy;
import o.C28399kZz;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28156kQz;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.usecase.AdvancedMyAssetsUseCase$getMyPositionList-hUnOzRk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMyAssetsUseCase$getMyPositionListhUnOzRk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends DexMultiTokenInfoBean>>>, Object> {
    final /* synthetic */ String $accountId$inlined;
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ AdvancedAssetsFilter $filters$inlined;
    final /* synthetic */ List $selectedTokens$inlined;
    final /* synthetic */ String $userUniqueId$inlined;
    Object L$0;
    int label;
    final /* synthetic */ C28182kRy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMyAssetsUseCase$getMyPositionListhUnOzRk$$inlined$dexRunCatching$1(Continuation continuation, C28182kRy c28182kRy, String str, String str2, String str3, List list, AdvancedAssetsFilter advancedAssetsFilter) {
        super(2, continuation);
        this.this$0 = c28182kRy;
        this.$userUniqueId$inlined = str;
        this.$accountId$inlined = str2;
        this.$chainId$inlined = str3;
        this.$selectedTokens$inlined = list;
        this.$filters$inlined = advancedAssetsFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMyAssetsUseCase$getMyPositionListhUnOzRk$$inlined$dexRunCatching$1(continuation, this.this$0, this.$userUniqueId$inlined, this.$accountId$inlined, this.$chainId$inlined, this.$selectedTokens$inlined, this.$filters$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends DexMultiTokenInfoBean>>> continuation) {
        return ((AdvancedMyAssetsUseCase$getMyPositionListhUnOzRk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C28399kZz c28399kZz;
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
            c28399kZz = this.this$0.AEQbTJ;
            InterfaceC28156kQz interfaceC28156kQz = this.this$0.copydefault;
            String str = this.$userUniqueId$inlined;
            String str2 = this.$accountId$inlined;
            String str3 = this.$chainId$inlined;
            List<DexMultiTokenInfoBean> list = this.$selectedTokens$inlined;
            AdvancedAssetsFilter advancedAssetsFilter = this.$filters$inlined;
            this.L$0 = c28399kZz;
            this.label = 1;
            obj = interfaceC28156kQz.OLrzqt(str, str2, str3, list, advancedAssetsFilter, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) obj).AEQbTJ());
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            c28399kZz = (C28399kZz) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        this.L$0 = null;
        this.label = 2;
        obj = c28399kZz.EZpvd((AbstractC43419rot) obj, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) obj).AEQbTJ());
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}

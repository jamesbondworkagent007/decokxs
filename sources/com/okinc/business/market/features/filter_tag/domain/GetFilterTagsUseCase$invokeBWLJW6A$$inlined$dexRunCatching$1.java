package com.okinc.business.market.features.filter_tag.domain;

import com.okinc.business.market.features.filter_tag.data.model.FilterTagData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C26211jWa;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.jVY;
import o.jVZ;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.filter_tag.domain.GetFilterTagsUseCase$invoke-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetFilterTagsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends C26211jWa>>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ FilterTagType $filterTagType$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    final /* synthetic */ String $userWalletAddress$inlined;
    int label;
    final /* synthetic */ jVY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFilterTagsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, FilterTagType filterTagType, jVY jvy, String str, String str2, String str3) {
        super(2, continuation);
        this.$filterTagType$inlined = filterTagType;
        this.this$0 = jvy;
        this.$tokenContractAddress$inlined = str;
        this.$userWalletAddress$inlined = str2;
        this.$chainId$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetFilterTagsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(continuation, this.$filterTagType$inlined, this.this$0, this.$tokenContractAddress$inlined, this.$userWalletAddress$inlined, this.$chainId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends C26211jWa>>> continuation) {
        return ((GetFilterTagsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                int i2 = jVY.Activity.copydefault[this.$filterTagType$inlined.ordinal()];
                if (i2 == 1) {
                    jVZ jvz = this.this$0.copydefault;
                    String str = this.$tokenContractAddress$inlined;
                    String str2 = this.$userWalletAddress$inlined;
                    String str3 = this.$chainId$inlined;
                    this.label = 1;
                    obj = jvz.copydefault(str, str2, str3, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC43419rot = (AbstractC43419rot) obj;
                } else if (i2 == 2) {
                    jVZ jvz2 = this.this$0.copydefault;
                    String str4 = this.$tokenContractAddress$inlined;
                    String str5 = this.$userWalletAddress$inlined;
                    String str6 = this.$chainId$inlined;
                    this.label = 2;
                    obj = jvz2.EZpvd(str4, str5, str6, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC43419rot = (AbstractC43419rot) obj;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVZ jvz3 = this.this$0.copydefault;
                    String str7 = this.$tokenContractAddress$inlined;
                    String str8 = this.$userWalletAddress$inlined;
                    String str9 = this.$chainId$inlined;
                    this.label = 3;
                    obj = jvz3.KWHzl(str7, str8, str9, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC43419rot = (AbstractC43419rot) obj;
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
            } else if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
            }
            Iterable<FilterTagData> iterable = (Iterable) abstractC43419rot.AEQbTJ();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
            for (FilterTagData filterTagData : iterable) {
                arrayList.add(new C26211jWa(filterTagData.EZpvd(), filterTagData.KWHzl(), filterTagData.copydefault()));
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}

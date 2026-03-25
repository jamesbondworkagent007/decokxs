package com.okinc.business.market.features.home_favorite_list.domain;

import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28416kaP;
import o.C28424kaX;
import o.C28586kda;
import o.C56391yDq;
import o.C56442yFn;
import o.kKG;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.home_favorite_list.domain.UpdatePinWatchlistUseCase$pinWatchlistItem-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class UpdatePinWatchlistUseCase$pinWatchlistItemBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ int $groupId$inlined;
    final /* synthetic */ String $tokenAddress$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C28416kaP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePinWatchlistUseCase$pinWatchlistItemBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, C28416kaP c28416kaP, String str, String str2, int i) {
        super(2, continuation);
        this.this$0 = c28416kaP;
        this.$chainId$inlined = str;
        this.$tokenAddress$inlined = str2;
        this.$groupId$inlined = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdatePinWatchlistUseCase$pinWatchlistItemBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenAddress$inlined, this.$groupId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return ((UpdatePinWatchlistUseCase$pinWatchlistItemBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objOLrzqt;
        DexUserIdentity dexUserIdentity;
        String str;
        C28424kaX c28424kaX;
        String str2;
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
            C28586kda c28586kda = this.this$0.EZpvd;
            this.label = 1;
            objOLrzqt = c28586kda.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
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
                C28424kaX c28424kaX2 = (C28424kaX) this.L$3;
                String str3 = (String) this.L$2;
                String str4 = (String) this.L$1;
                dexUserIdentity = (DexUserIdentity) this.L$0;
                C56391yDq.AEQbTJ(obj);
                c28424kaX = c28424kaX2;
                str2 = str4;
                str = str3;
                String strEZpvd = dexUserIdentity.EZpvd();
                int i2 = this.$groupId$inlined;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 3;
                obj = c28424kaX.copydefault(str, str2, (String) obj, strEZpvd, i2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) obj).AEQbTJ());
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objOLrzqt);
        dexUserIdentity = (DexUserIdentity) objOLrzqt;
        C28424kaX c28424kaX3 = this.this$0.copydefault;
        String str5 = this.$chainId$inlined;
        String str6 = this.$tokenAddress$inlined;
        kKG kkg = this.this$0.AEQbTJ;
        this.L$0 = dexUserIdentity;
        this.L$1 = str6;
        this.L$2 = str5;
        this.L$3 = c28424kaX3;
        this.label = 2;
        Object objAEQbTJ = kkg.AEQbTJ(this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        str = str5;
        obj = objAEQbTJ;
        c28424kaX = c28424kaX3;
        str2 = str6;
        String strEZpvd2 = dexUserIdentity.EZpvd();
        int i22 = this.$groupId$inlined;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 3;
        obj = c28424kaX.copydefault(str, str2, (String) obj, strEZpvd2, i22, this);
        if (obj == objCopydefault) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(((AbstractC43419rot) obj).AEQbTJ());
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}

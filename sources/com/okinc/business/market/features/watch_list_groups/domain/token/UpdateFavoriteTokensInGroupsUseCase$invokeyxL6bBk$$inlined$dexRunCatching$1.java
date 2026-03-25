package com.okinc.business.market.features.watch_list_groups.domain.token;

import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C27764kCm;
import o.C27770kCs;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28415kaO;
import o.InterfaceC9738bbJ;
import o.kKG;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.watch_list_groups.domain.token.UpdateFavoriteTokensInGroupsUseCase$invoke-yxL6bBk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class UpdateFavoriteTokensInGroupsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InterfaceC28415kaO>>, Object> {
    final /* synthetic */ FavoriteAction $action$inlined;
    final /* synthetic */ List $addedGroupIds$inlined;
    final /* synthetic */ List $removedGroupIds$inlined;
    final /* synthetic */ List $tokens$inlined;
    int label;
    final /* synthetic */ C27770kCs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateFavoriteTokensInGroupsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(Continuation continuation, C27770kCs c27770kCs, List list, List list2, List list3, FavoriteAction favoriteAction) {
        super(2, continuation);
        this.this$0 = c27770kCs;
        this.$addedGroupIds$inlined = list;
        this.$removedGroupIds$inlined = list2;
        this.$tokens$inlined = list3;
        this.$action$inlined = favoriteAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdateFavoriteTokensInGroupsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(continuation, this.this$0, this.$addedGroupIds$inlined, this.$removedGroupIds$inlined, this.$tokens$inlined, this.$action$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends InterfaceC28415kaO>> continuation) {
        return ((UpdateFavoriteTokensInGroupsUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082 A[Catch: all -> 0x00c4, CancellationException -> 0x00db, TryCatch #2 {CancellationException -> 0x00db, all -> 0x00c4, blocks: (B:7:0x0011, B:48:0x00bf, B:11:0x001e, B:31:0x006e, B:34:0x0079, B:36:0x0082, B:37:0x0085, B:39:0x008b, B:41:0x0093, B:43:0x009b, B:44:0x00a3, B:12:0x0028, B:18:0x0046, B:21:0x004d, B:23:0x0051, B:25:0x0057, B:28:0x005e, B:47:0x00bd, B:15:0x0035), top: B:56:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[Catch: all -> 0x00c4, CancellationException -> 0x00db, TryCatch #2 {CancellationException -> 0x00db, all -> 0x00c4, blocks: (B:7:0x0011, B:48:0x00bf, B:11:0x001e, B:31:0x006e, B:34:0x0079, B:36:0x0082, B:37:0x0085, B:39:0x008b, B:41:0x0093, B:43:0x009b, B:44:0x00a3, B:12:0x0028, B:18:0x0046, B:21:0x004d, B:23:0x0051, B:25:0x0057, B:28:0x005e, B:47:0x00bd, B:15:0x0035), top: B:56:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objEZpvd;
        Object objCopydefault;
        List list;
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
            kKG kkg = this.this$0.copydefault;
            this.label = 1;
            objEZpvd = kkg.EZpvd(this);
            if (objEZpvd == objCopydefault2) {
                return objCopydefault2;
            }
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
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                List listAhwBna = yDY.AhwBna();
                if (Result.m7383isFailureimpl(objCopydefault)) {
                    objCopydefault = listAhwBna;
                }
                list = (List) objCopydefault;
                if (!list.isEmpty()) {
                    obj = InterfaceC28415kaO.TaskDescription.AEQbTJ;
                } else if (list.size() > 1 && this.$addedGroupIds$inlined.isEmpty() && this.$removedGroupIds$inlined.isEmpty()) {
                    obj = new InterfaceC28415kaO.Dialog(this.$tokens$inlined);
                } else {
                    UpdateFavoriteTokensInGroupsUseCase$invoke$2$1 updateFavoriteTokensInGroupsUseCase$invoke$2$1 = new UpdateFavoriteTokensInGroupsUseCase$invoke$2$1(this.$tokens$inlined, this.$addedGroupIds$inlined, this.$action$inlined, this.this$0, list, this.$removedGroupIds$inlined, null);
                    this.label = 3;
                    obj = CoroutineScopeKt.coroutineScope(updateFavoriteTokensInGroupsUseCase$invoke$2$1, this);
                    if (obj == objCopydefault2) {
                        return objCopydefault2;
                    }
                }
                objM7377constructorimpl = Result.m7377constructorimpl(obj);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objEZpvd)) {
            objEZpvd = null;
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) objEZpvd;
        if (interfaceC9738bbJ != null && !interfaceC9738bbJ.zsXlph() && !interfaceC9738bbJ.QfsBiF()) {
            C27764kCm c27764kCm = this.this$0.EZpvd;
            this.label = 2;
            objCopydefault = c27764kCm.copydefault(false, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            List listAhwBna2 = yDY.AhwBna();
            if (Result.m7383isFailureimpl(objCopydefault)) {
            }
            list = (List) objCopydefault;
            if (!list.isEmpty()) {
            }
            objM7377constructorimpl = Result.m7377constructorimpl(obj);
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        obj = InterfaceC28415kaO.StateListAnimator.EZpvd;
        objM7377constructorimpl = Result.m7377constructorimpl(obj);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}

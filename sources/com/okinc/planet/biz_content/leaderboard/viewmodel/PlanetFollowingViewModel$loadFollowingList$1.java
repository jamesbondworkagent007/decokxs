package com.okinc.planet.biz_content.leaderboard.viewmodel;

import com.okinc.planet.biz_content.leaderboard.bean.FollowingListResponse;
import com.okinc.planet.biz_content.leaderboard.bean.FollowingUser;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C47662tuO;
import o.C47665tuR;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetFollowingViewModel$loadFollowingList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $size;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C47665tuR this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetFollowingViewModel$loadFollowingList$1(C47665tuR c47665tuR, Integer num, Continuation<? super PlanetFollowingViewModel$loadFollowingList$1> continuation) {
        super(2, continuation);
        this.this$0 = c47665tuR;
        this.$size = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetFollowingViewModel$loadFollowingList$1 planetFollowingViewModel$loadFollowingList$1 = new PlanetFollowingViewModel$loadFollowingList$1(this.this$0, this.$size, continuation);
        planetFollowingViewModel$loadFollowingList$1.L$0 = obj;
        return planetFollowingViewModel$loadFollowingList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetFollowingViewModel$loadFollowingList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        FollowingListResponse followingListResponse;
        MutableSharedFlow mutableSharedFlow;
        List<FollowingUser> followers;
        List<FollowingUser> followers2;
        List<FollowingUser> followers3;
        MutableSharedFlow mutableSharedFlow2;
        Boolean boolKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            MutableSharedFlow mutableSharedFlow3 = this.this$0.OLrzqt;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (mutableSharedFlow3.emit(boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    C56391yDq.AEQbTJ(obj);
                    mutableSharedFlow2 = this.this$0.OLrzqt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.label = 4;
                    if (mutableSharedFlow2.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl((FollowingListResponse) obj);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("PlanetFollowingViewModel", "getFollowingListUseCase failed " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                followingListResponse = (FollowingListResponse) objM7377constructorimpl;
                pUU.EZpvd("PlanetFollowingViewModel", "loadFollowingList response: " + followingListResponse);
                pUU.EZpvd("PlanetFollowingViewModel", "loadFollowingList list size: " + ((followingListResponse != null || (followers3 = followingListResponse.getFollowers()) == null) ? AbstractJsonLexerKt.NULL : C56443yFo.AEQbTJ(followers3.size())));
                if (followingListResponse != null && (followers2 = followingListResponse.getFollowers()) != null) {
                    int i2 = 0;
                    for (Object obj2 : followers2) {
                        if (i2 < 0) {
                            yDY.AYXKKw();
                        }
                        FollowingUser followingUser = (FollowingUser) obj2;
                        pUU.EZpvd("PlanetFollowingViewModel", "User[" + i2 + "] " + followingUser.getNickName() + ": unread=" + followingUser.getUnread() + ", liveStatus=" + followingUser.getLiveStatus());
                        i2++;
                    }
                }
                mutableSharedFlow = this.this$0.AEQbTJ;
                followers = followingListResponse == null ? followingListResponse.getFollowers() : null;
                this.L$0 = null;
                this.label = 3;
                if (mutableSharedFlow.emit(followers, this) == objCopydefault) {
                    return objCopydefault;
                }
                mutableSharedFlow2 = this.this$0.OLrzqt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.label = 4;
                if (mutableSharedFlow2.emit(boolKWHzl, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C47665tuR c47665tuR = this.this$0;
        Integer num = this.$size;
        Result.Application application2 = Result.Companion;
        C47662tuO c47662tuO = c47665tuR.KWHzl;
        this.L$0 = null;
        this.label = 2;
        obj = c47662tuO.AEQbTJ(null, num, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((FollowingListResponse) obj);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
        followingListResponse = (FollowingListResponse) objM7377constructorimpl;
        pUU.EZpvd("PlanetFollowingViewModel", "loadFollowingList response: " + followingListResponse);
        if (followingListResponse != null) {
            pUU.EZpvd("PlanetFollowingViewModel", "loadFollowingList list size: " + ((followingListResponse != null || (followers3 = followingListResponse.getFollowers()) == null) ? AbstractJsonLexerKt.NULL : C56443yFo.AEQbTJ(followers3.size())));
            if (followingListResponse != null) {
                int i22 = 0;
                while (r1.hasNext()) {
                }
            }
            mutableSharedFlow = this.this$0.AEQbTJ;
            if (followingListResponse == null) {
            }
            this.L$0 = null;
            this.label = 3;
            if (mutableSharedFlow.emit(followers, this) == objCopydefault) {
            }
            mutableSharedFlow2 = this.this$0.OLrzqt;
            boolKWHzl = C56443yFo.KWHzl(false);
            this.label = 4;
            if (mutableSharedFlow2.emit(boolKWHzl, this) == objCopydefault) {
            }
        }
        return Unit.INSTANCE;
    }
}

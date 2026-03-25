package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.biz_social_feeds.domain.FetchFollowDynamicDataUseCase$execute$1;
import com.okinc.planet.biz_social_feeds.domain.FollowDynamicData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.tQP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tJo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46147tJo extends AbstractC46360tRl<ActionBar, FollowDynamicData> {
    public final CoroutineDispatcher EZpvd;
    public final tQP copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46147tJo(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull tQP tqp) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(tqp, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = tqp;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC46360tRl
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull ActionBar actionBar, @NotNull Continuation<? super FollowDynamicData> continuation) throws java.lang.Throwable {
        FetchFollowDynamicDataUseCase$execute$1 fetchFollowDynamicDataUseCase$execute$1;
        AbstractC43419rot actionBar2;
        AbstractC43419rot stateListAnimator;
        AbstractC43419rot actionBar3;
        ResponseData responseData;
        if (continuation instanceof FetchFollowDynamicDataUseCase$execute$1) {
            fetchFollowDynamicDataUseCase$execute$1 = (FetchFollowDynamicDataUseCase$execute$1) continuation;
            int i = fetchFollowDynamicDataUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchFollowDynamicDataUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchFollowDynamicDataUseCase$execute$1 = new FetchFollowDynamicDataUseCase$execute$1(this, continuation);
            }
        }
        FetchFollowDynamicDataUseCase$execute$1 fetchFollowDynamicDataUseCase$execute$12 = fetchFollowDynamicDataUseCase$execute$1;
        java.lang.Object objFollowTimelineApi$default = fetchFollowDynamicDataUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchFollowDynamicDataUseCase$execute$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objFollowTimelineApi$default);
                tQP tqp = this.copydefault;
                java.lang.String strOLrzqt = actionBar.OLrzqt();
                fetchFollowDynamicDataUseCase$execute$12.label = 1;
                objFollowTimelineApi$default = tQP.Application.followTimelineApi$default(tqp, strOLrzqt, null, fetchFollowDynamicDataUseCase$execute$12, 2, null);
                if (objFollowTimelineApi$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objFollowTimelineApi$default);
            }
            responseData = (ResponseData) objFollowTimelineApi$default;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar2 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
            if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            }
            return actionBar3.AEQbTJ();
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator = actionBar2;
        if (!(stateListAnimator instanceof AbstractC43419rot.StateListAnimator)) {
            actionBar3 = new AbstractC43419rot.StateListAnimator((FollowDynamicData) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) ((AbstractC43419rot.StateListAnimator) stateListAnimator).KWHzl()));
        } else {
            if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar3 = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) stateListAnimator).KWHzl());
        }
        return actionBar3.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.tJo$ActionBar */
    public static final class ActionBar {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.OLrzqt;
            }
            return actionBar.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(java.lang.String str) {
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((ActionBar) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.OLrzqt;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(after=" + this.OLrzqt + ")";
        }

        public ActionBar(java.lang.String str) {
            this.OLrzqt = str;
        }
    }
}

package o;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.okinc.kline.ui.unlock.data.api.KlineUnlockTokenApi;
import com.okinc.kline.ui.unlock.data.datasource.UnlockEventPageSource$load$1;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenEvent;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pwL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C39647pwL extends PagingSource<java.lang.String, UnlockTokenEvent> {
    public final InterfaceC56387yDm AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String copydefault;

    public C39647pwL(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.EZpvd = str2;
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.pwR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39647pwL.OLrzqt();
            }
        });
    }

    public final KlineUnlockTokenApi copydefault() {
        return (KlineUnlockTokenApi) this.AEQbTJ.getValue();
    }

    public static final KlineUnlockTokenApi OLrzqt() {
        return (KlineUnlockTokenApi) C43417ror.OLrzqt(C56524yIo.AEQbTJ(KlineUnlockTokenApi.class));
    }

    /* JADX DEBUG: Method merged with bridge method: getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Object; */
    @Override // androidx.paging.PagingSource
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.String getRefreshKey(@NotNull PagingState<java.lang.String, UnlockTokenEvent> pagingState) {
        PagingSource.LoadResult.Page<java.lang.String, UnlockTokenEvent> pageClosestPageToPosition;
        Intrinsics.checkNotNullParameter(pagingState, "");
        java.lang.Integer anchorPosition = pagingState.getAnchorPosition();
        if (anchorPosition == null || (pageClosestPageToPosition = pagingState.closestPageToPosition(anchorPosition.intValue())) == null) {
            return null;
        }
        java.lang.String nextKey = pageClosestPageToPosition.getNextKey();
        return nextKey == null ? pageClosestPageToPosition.getPrevKey() : nextKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object load(@NotNull PagingSource.LoadParams<java.lang.String> loadParams, @NotNull Continuation<? super PagingSource.LoadResult<java.lang.String, UnlockTokenEvent>> continuation) throws java.lang.Throwable {
        UnlockEventPageSource$load$1 unlockEventPageSource$load$1;
        java.util.List listAhwBna;
        if (continuation instanceof UnlockEventPageSource$load$1) {
            unlockEventPageSource$load$1 = (UnlockEventPageSource$load$1) continuation;
            int i = unlockEventPageSource$load$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unlockEventPageSource$load$1.label = i - Integer.MIN_VALUE;
            } else {
                unlockEventPageSource$load$1 = new UnlockEventPageSource$load$1(this, continuation);
            }
        }
        UnlockEventPageSource$load$1 unlockEventPageSource$load$12 = unlockEventPageSource$load$1;
        java.lang.Object objQueryTokenEvent$default = unlockEventPageSource$load$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unlockEventPageSource$load$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objQueryTokenEvent$default);
                loadParams.getKey();
                KlineUnlockTokenApi klineUnlockTokenApiCopydefault = copydefault();
                java.lang.String str = this.copydefault;
                java.lang.String str2 = this.EZpvd;
                java.lang.String key = loadParams.getKey();
                java.lang.Long lKWHzl = key != null ? C56443yFo.KWHzl(java.lang.Long.parseLong(key)) : null;
                unlockEventPageSource$load$12.label = 1;
                objQueryTokenEvent$default = KlineUnlockTokenApi.TaskDescription.queryTokenEvent$default(klineUnlockTokenApiCopydefault, str, str2, lKWHzl, 0, unlockEventPageSource$load$12, 8, null);
                if (objQueryTokenEvent$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objQueryTokenEvent$default);
            }
            ResponseData responseData = (ResponseData) objQueryTokenEvent$default;
            if (responseData.getCode() != 0 || responseData.getData() == null || (listAhwBna = (java.util.List) responseData.getData()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            return new PagingSource.LoadResult.Page(listAhwBna, null, null);
        } catch (java.lang.Exception e) {
            return new PagingSource.LoadResult.Error(e);
        }
    }
}

package o;

import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.features.home_favorite_list.domain.FilterFavoriteListUseCase$apply$1;
import com.okinc.business.market.features.home_favorite_list.domain.FilterFavoriteListUseCase$apply0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kaI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28409kaI {
    public final CoroutineDispatcher AEQbTJ;
    public final C25980jNm KWHzl;

    /* JADX INFO: renamed from: o.kaI$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TimeIntervalType.values().length];
            try {
                iArr[TimeIntervalType.FIVE_MIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TimeIntervalType.ONE_HOUR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeIntervalType.FOUR_HOUR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    @yCM
    public C28409kaI(@NotNull C25980jNm c25980jNm, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c25980jNm, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c25980jNm;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.util.List<C28422kaV> list, @NotNull HomeFavoriteListFilter homeFavoriteListFilter, @NotNull Continuation<? super Result<? extends java.util.List<HomeToken>>> continuation) throws java.lang.Throwable {
        FilterFavoriteListUseCase$apply$1 filterFavoriteListUseCase$apply$1;
        if (continuation instanceof FilterFavoriteListUseCase$apply$1) {
            filterFavoriteListUseCase$apply$1 = (FilterFavoriteListUseCase$apply$1) continuation;
            int i = filterFavoriteListUseCase$apply$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                filterFavoriteListUseCase$apply$1.label = i - Integer.MIN_VALUE;
            } else {
                filterFavoriteListUseCase$apply$1 = new FilterFavoriteListUseCase$apply$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = filterFavoriteListUseCase$apply$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = filterFavoriteListUseCase$apply$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            FilterFavoriteListUseCase$apply0E7RQCE$$inlined$dexRunCatching$1 filterFavoriteListUseCase$apply0E7RQCE$$inlined$dexRunCatching$1 = new FilterFavoriteListUseCase$apply0E7RQCE$$inlined$dexRunCatching$1(null, list, homeFavoriteListFilter, this);
            filterFavoriteListUseCase$apply$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, filterFavoriteListUseCase$apply0E7RQCE$$inlined$dexRunCatching$1, filterFavoriteListUseCase$apply$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.lang.String OLrzqt(TimeIntervalType timeIntervalType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        int i = StateListAnimator.KWHzl[timeIntervalType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? str4 : str3 : str2 : str;
    }

    public final HomeToken copydefault(C28422kaV c28422kaV, TimeIntervalType timeIntervalType) {
        return new HomeToken(c28422kaV.EZpvd(), null, c28422kaV.AkhnZx(), c28422kaV.AuCTel(), c28422kaV.ejfBZ(), c28422kaV.copydefault(), c28422kaV.values(), OLrzqt(timeIntervalType, c28422kaV.AhwBna(), c28422kaV.AEQbTJ(), c28422kaV.djBIcL(), c28422kaV.OLrzqt()), "", "", "", "", OLrzqt(timeIntervalType, c28422kaV.hDKMBd(), c28422kaV.fIwbmz(), c28422kaV.getFieldNames(), c28422kaV.fJNWhG()), c28422kaV.isConnected(), c28422kaV.gEmmrt(), c28422kaV.AYXKKw(), true, c28422kaV.fetchVPNInfo(), "", c28422kaV.DbNXlk(), 2, null);
    }
}

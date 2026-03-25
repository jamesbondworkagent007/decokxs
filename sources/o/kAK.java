package o;

import com.okinc.business.market.features.vibes.domain.FetchVibesKolListUseCase$invoke$1;
import com.okinc.business.market.features.vibes.domain.VibesKolData;
import com.okinc.business.market.features.vibes.domain.VibesSortType;
import com.okinc.business.market.features.vibes.domain.VibesTimeRange;
import com.okinc.business.market.features.vibes.domain.VibesTopKolType;
import com.okinc.business.market.features.vibes.ui.VibesKolUiModel;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kAK {
    public final kAP copydefault;

    public kAK(@NotNull kAP kap) {
        Intrinsics.checkNotNullParameter(kap, "");
        this.copydefault = kap;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull VibesSortType vibesSortType, @NotNull VibesTimeRange vibesTimeRange, @NotNull Continuation<? super Result<? extends java.util.List<VibesKolUiModel>>> continuation) {
        FetchVibesKolListUseCase$invoke$1 fetchVibesKolListUseCase$invoke$1;
        java.lang.Object objCopydefault;
        if (continuation instanceof FetchVibesKolListUseCase$invoke$1) {
            fetchVibesKolListUseCase$invoke$1 = (FetchVibesKolListUseCase$invoke$1) continuation;
            int i = fetchVibesKolListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchVibesKolListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchVibesKolListUseCase$invoke$1 = new FetchVibesKolListUseCase$invoke$1(this, continuation);
            }
        }
        FetchVibesKolListUseCase$invoke$1 fetchVibesKolListUseCase$invoke$12 = fetchVibesKolListUseCase$invoke$1;
        java.lang.Object obj = fetchVibesKolListUseCase$invoke$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = fetchVibesKolListUseCase$invoke$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            kAP kap = this.copydefault;
            VibesTopKolType vibesTopKolType = VibesTopKolType.TOP_50;
            fetchVibesKolListUseCase$invoke$12.L$0 = vibesSortType;
            fetchVibesKolListUseCase$invoke$12.label = 1;
            objCopydefault = kap.copydefault(str, str2, vibesSortType, vibesTopKolType, vibesTimeRange, fetchVibesKolListUseCase$invoke$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vibesSortType = (VibesSortType) fetchVibesKolListUseCase$invoke$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        if (!Result.m7384isSuccessimpl(objCopydefault)) {
            return Result.m7377constructorimpl(objCopydefault);
        }
        Result.Application application = Result.Companion;
        java.util.List list = (java.util.List) objCopydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(kBB.copydefault((VibesKolData) it.next(), vibesSortType));
        }
        return Result.m7377constructorimpl(arrayList);
    }
}

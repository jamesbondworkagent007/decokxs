package o;

import com.okinc.planet.biz_content.draft.DraftDataInfo;
import com.okinc.planet.domain.usecase.PlanetPublisherGetDraftDetailUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46356tRh {
    public final tQV copydefault;

    public C46356tRh(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.copydefault = tqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super kotlin.Pair<DraftDataInfo, java.lang.String>> continuation) throws java.lang.Throwable {
        PlanetPublisherGetDraftDetailUseCase$invoke$1 planetPublisherGetDraftDetailUseCase$invoke$1;
        if (continuation instanceof PlanetPublisherGetDraftDetailUseCase$invoke$1) {
            planetPublisherGetDraftDetailUseCase$invoke$1 = (PlanetPublisherGetDraftDetailUseCase$invoke$1) continuation;
            int i = planetPublisherGetDraftDetailUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetPublisherGetDraftDetailUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetPublisherGetDraftDetailUseCase$invoke$1 = new PlanetPublisherGetDraftDetailUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = planetPublisherGetDraftDetailUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetPublisherGetDraftDetailUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                tQV tqv = this.copydefault;
                planetPublisherGetDraftDetailUseCase$invoke$1.label = 1;
                objEZpvd = tqv.EZpvd(str, planetPublisherGetDraftDetailUseCase$invoke$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            return C56390yDp.OLrzqt(((AbstractC43419rot) objEZpvd).AEQbTJ(), null);
        } catch (java.lang.Exception e) {
            return C56390yDp.OLrzqt(null, tRK.EZpvd(e));
        }
    }
}

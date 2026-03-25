package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.biz_content.draft.DraftInfo;
import com.okinc.planet.domain.usecase.PlanetPublisherGetDraftUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46359tRk {
    public final tQV KWHzl;

    public C46359tRk(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.KWHzl = tqv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super kotlin.Pair<DraftInfo, java.lang.Integer>> continuation) throws java.lang.Throwable {
        PlanetPublisherGetDraftUseCase$invoke$1 planetPublisherGetDraftUseCase$invoke$1;
        if (continuation instanceof PlanetPublisherGetDraftUseCase$invoke$1) {
            planetPublisherGetDraftUseCase$invoke$1 = (PlanetPublisherGetDraftUseCase$invoke$1) continuation;
            int i = planetPublisherGetDraftUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetPublisherGetDraftUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetPublisherGetDraftUseCase$invoke$1 = new PlanetPublisherGetDraftUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = planetPublisherGetDraftUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = planetPublisherGetDraftUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                tQV tqv = this.KWHzl;
                planetPublisherGetDraftUseCase$invoke$1.label = 1;
                objCopydefault = tqv.copydefault(str, str2, planetPublisherGetDraftUseCase$invoke$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            return C56390yDp.OLrzqt(((AbstractC43419rot) objCopydefault).AEQbTJ(), C56443yFo.AEQbTJ(0));
        } catch (java.lang.Exception e) {
            return C56390yDp.OLrzqt(null, C56443yFo.AEQbTJ(e instanceof OKServerException ? ((OKServerException) e).getCode() : -1));
        }
    }
}

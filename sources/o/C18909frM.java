package o;

import com.okinc.business.defi.wallet.mine.search.domain.usecase.FetchTagMetaUseCase$invoke$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18909frM {
    public final C18948frz AEQbTJ;

    @yCM
    public C18909frM(@NotNull C18948frz c18948frz) {
        Intrinsics.checkNotNullParameter(c18948frz, "");
        this.AEQbTJ = c18948frz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Result<Unit>> continuation) {
        FetchTagMetaUseCase$invoke$1 fetchTagMetaUseCase$invoke$1;
        java.lang.Object objOLrzqt;
        if (continuation instanceof FetchTagMetaUseCase$invoke$1) {
            fetchTagMetaUseCase$invoke$1 = (FetchTagMetaUseCase$invoke$1) continuation;
            int i = fetchTagMetaUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchTagMetaUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchTagMetaUseCase$invoke$1 = new FetchTagMetaUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = fetchTagMetaUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchTagMetaUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C18948frz c18948frz = this.AEQbTJ;
                fetchTagMetaUseCase$invoke$1.label = 1;
                objOLrzqt = c18948frz.OLrzqt(fetchTagMetaUseCase$invoke$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}

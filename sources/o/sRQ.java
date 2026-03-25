package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.stickers.remote.model.StickerPacksResponse;
import com.okinc.okimcore.stickers.usecase.SyncStickersUseCase$invoke$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sRQ {
    public final sRC AEQbTJ;
    public final sRK OLrzqt;
    public final sRM copydefault;

    @yCM
    public sRQ(@NotNull sRM srm, @NotNull sRK srk, @NotNull sRC src) {
        Intrinsics.checkNotNullParameter(srm, "");
        Intrinsics.checkNotNullParameter(srk, "");
        Intrinsics.checkNotNullParameter(src, "");
        this.copydefault = srm;
        this.OLrzqt = srk;
        this.AEQbTJ = src;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:18:0x0051, B:27:0x0068, B:29:0x0070, B:31:0x0076, B:32:0x0083), top: B:55:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation) throws java.lang.Throwable {
        SyncStickersUseCase$invoke$1 syncStickersUseCase$invoke$1;
        sRQ srq;
        sRQ srq2;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        AbstractC43419rot actionBar2;
        sRC src;
        java.util.List<StickerPacksResponse.StickerPack> listCopydefault;
        if (continuation instanceof SyncStickersUseCase$invoke$1) {
            syncStickersUseCase$invoke$1 = (SyncStickersUseCase$invoke$1) continuation;
            int i = syncStickersUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                syncStickersUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                syncStickersUseCase$invoke$1 = new SyncStickersUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = syncStickersUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = syncStickersUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                sRM srm = this.copydefault;
                syncStickersUseCase$invoke$1.L$0 = this;
                syncStickersUseCase$invoke$1.label = 1;
                objEZpvd = srm.EZpvd(syncStickersUseCase$invoke$1);
            } catch (java.lang.Throwable th) {
                th = th;
                srq = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                srq2 = srq;
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            srq = this;
            responseData = (ResponseData) objEZpvd;
            if (responseData.getCode() != 0) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                srq2 = srq;
                actionBar = actionBar2;
            }
            return new AbstractC43419rot.StateListAnimator(Unit.INSTANCE);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return new AbstractC43419rot.StateListAnimator(Unit.INSTANCE);
            }
            actionBar = (AbstractC43419rot) syncStickersUseCase$invoke$1.L$1;
            srq2 = (sRQ) syncStickersUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            src = srq2.AEQbTJ;
            listCopydefault = ((StickerPacksResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()).EZpvd().copydefault();
            syncStickersUseCase$invoke$1.L$0 = null;
            syncStickersUseCase$invoke$1.L$1 = null;
            syncStickersUseCase$invoke$1.label = 3;
            if (src.OLrzqt(listCopydefault, syncStickersUseCase$invoke$1) == objCopydefault) {
                return objCopydefault;
            }
            return new AbstractC43419rot.StateListAnimator(Unit.INSTANCE);
        }
        srq = (sRQ) syncStickersUseCase$invoke$1.L$0;
        try {
            C56391yDq.AEQbTJ(objEZpvd);
            responseData = (ResponseData) objEZpvd;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar2 = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
            srq2 = srq;
            actionBar = actionBar2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            srq2 = srq;
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            return actionBar;
        }
        if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        sRK srk = srq2.OLrzqt;
        AbstractC43419rot.StateListAnimator stateListAnimator = (AbstractC43419rot.StateListAnimator) actionBar;
        java.util.List<StickerPacksResponse.SavedSticker> listKWHzl = ((StickerPacksResponse) stateListAnimator.KWHzl()).KWHzl();
        java.util.List<StickerPacksResponse.StickerPack> listCopydefault2 = ((StickerPacksResponse) stateListAnimator.KWHzl()).EZpvd().copydefault();
        syncStickersUseCase$invoke$1.L$0 = srq2;
        syncStickersUseCase$invoke$1.L$1 = actionBar;
        syncStickersUseCase$invoke$1.label = 2;
        if (srk.KWHzl(listKWHzl, listCopydefault2, syncStickersUseCase$invoke$1) == objCopydefault) {
            return objCopydefault;
        }
        src = srq2.AEQbTJ;
        listCopydefault = ((StickerPacksResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()).EZpvd().copydefault();
        syncStickersUseCase$invoke$1.L$0 = null;
        syncStickersUseCase$invoke$1.L$1 = null;
        syncStickersUseCase$invoke$1.label = 3;
        if (src.OLrzqt(listCopydefault, syncStickersUseCase$invoke$1) == objCopydefault) {
        }
        return new AbstractC43419rot.StateListAnimator(Unit.INSTANCE);
    }
}

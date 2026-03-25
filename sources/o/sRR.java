package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.stickers.remote.model.SaveStickerRequest;
import com.okinc.okimcore.stickers.remote.model.SaveStickerResponse;
import com.okinc.okimcore.stickers.remote.model.StickerPacksResponse;
import com.okinc.okimcore.stickers.usecase.SaveStickersUseCase$invoke$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sRR {
    public final sRK AEQbTJ;
    public final sRM OLrzqt;

    @yCM
    public sRR(@NotNull sRM srm, @NotNull sRK srk) {
        Intrinsics.checkNotNullParameter(srm, "");
        Intrinsics.checkNotNullParameter(srk, "");
        this.OLrzqt = srm;
        this.AEQbTJ = srk;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:16:0x003d, B:25:0x0059, B:27:0x0061, B:29:0x0067, B:30:0x0074), top: B:47:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation) throws java.lang.Throwable {
        SaveStickersUseCase$invoke$1 saveStickersUseCase$invoke$1;
        java.lang.Throwable th;
        sRR srr;
        java.lang.Object actionBar;
        ResponseData responseData;
        if (continuation instanceof SaveStickersUseCase$invoke$1) {
            saveStickersUseCase$invoke$1 = (SaveStickersUseCase$invoke$1) continuation;
            int i = saveStickersUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                saveStickersUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                saveStickersUseCase$invoke$1 = new SaveStickersUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = saveStickersUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = saveStickersUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            try {
                sRM srm = this.OLrzqt;
                SaveStickerRequest saveStickerRequest = new SaveStickerRequest(set);
                saveStickersUseCase$invoke$1.L$0 = this;
                saveStickersUseCase$invoke$1.label = 1;
                objOLrzqt = srm.OLrzqt(saveStickerRequest, saveStickersUseCase$invoke$1);
            } catch (java.lang.Throwable th2) {
                th = th2;
                srr = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            srr = this;
            responseData = (ResponseData) objOLrzqt;
            if (responseData.getCode() != 0) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
            return new AbstractC43419rot.StateListAnimator(Unit.INSTANCE);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            return new AbstractC43419rot.StateListAnimator(Unit.INSTANCE);
        }
        srr = (sRR) saveStickersUseCase$invoke$1.L$0;
        try {
            C56391yDq.AEQbTJ(objOLrzqt);
            responseData = (ResponseData) objOLrzqt;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            return actionBar;
        }
        if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        sRK srk = srr.AEQbTJ;
        java.util.List<StickerPacksResponse.SavedSticker> listKWHzl = ((SaveStickerResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()).KWHzl();
        saveStickersUseCase$invoke$1.L$0 = null;
        saveStickersUseCase$invoke$1.label = 2;
        if (srk.copydefault(listKWHzl, saveStickersUseCase$invoke$1) == objCopydefault) {
            return objCopydefault;
        }
        return new AbstractC43419rot.StateListAnimator(Unit.INSTANCE);
    }
}

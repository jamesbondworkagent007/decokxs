package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.stickers.remote.model.StickerPacksResponse;
import com.okinc.okimcore.stickers.usecase.UploadStickersUseCase$invoke$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sRP {
    public final sRK OLrzqt;
    public final sRM copydefault;

    @yCM
    public sRP(@NotNull sRM srm, @NotNull sRK srk) {
        Intrinsics.checkNotNullParameter(srm, "");
        Intrinsics.checkNotNullParameter(srk, "");
        this.copydefault = srm;
        this.OLrzqt = srk;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:16:0x0042, B:25:0x0061, B:27:0x0069, B:29:0x006f, B:30:0x007c), top: B:47:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.io.File file, @NotNull Continuation<? super AbstractC43419rot<Unit, OKServerException>> continuation) throws java.lang.Throwable {
        UploadStickersUseCase$invoke$1 uploadStickersUseCase$invoke$1;
        sRP srp;
        java.lang.Object actionBar;
        ResponseData responseData;
        if (continuation instanceof UploadStickersUseCase$invoke$1) {
            uploadStickersUseCase$invoke$1 = (UploadStickersUseCase$invoke$1) continuation;
            int i = uploadStickersUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uploadStickersUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                uploadStickersUseCase$invoke$1 = new UploadStickersUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = uploadStickersUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = uploadStickersUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            try {
                sRM srm = this.copydefault;
                MultipartBody.Part partCopydefault = C44164sFr.copydefault(file, "file");
                uploadStickersUseCase$invoke$1.L$0 = this;
                uploadStickersUseCase$invoke$1.label = 1;
                objAEQbTJ = srm.AEQbTJ(partCopydefault, null, uploadStickersUseCase$invoke$1);
            } catch (java.lang.Throwable th) {
                th = th;
                srp = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            srp = this;
            responseData = (ResponseData) objAEQbTJ;
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
            C56391yDq.AEQbTJ(objAEQbTJ);
            return new AbstractC43419rot.StateListAnimator(Unit.INSTANCE);
        }
        srp = (sRP) uploadStickersUseCase$invoke$1.L$0;
        try {
            C56391yDq.AEQbTJ(objAEQbTJ);
            responseData = (ResponseData) objAEQbTJ;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            return actionBar;
        }
        if (!(actionBar instanceof AbstractC43419rot.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        sRK srk = srp.OLrzqt;
        StickerPacksResponse.SavedSticker savedSticker = (StickerPacksResponse.SavedSticker) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
        uploadStickersUseCase$invoke$1.L$0 = null;
        uploadStickersUseCase$invoke$1.label = 2;
        if (srk.copydefault(savedSticker, uploadStickersUseCase$invoke$1) == objCopydefault) {
            return objCopydefault;
        }
        return new AbstractC43419rot.StateListAnimator(Unit.INSTANCE);
    }
}

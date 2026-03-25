package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.stickers.remote.model.StickerConfigResponse;
import com.okinc.okimcore.stickers.usecase.GetStickerConfigUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.AbstractC43419rot;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sRS {
    public final sRM OLrzqt;

    @yCM
    public sRS(@NotNull sRM srm) {
        Intrinsics.checkNotNullParameter(srm, "");
        this.OLrzqt = srm;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<StickerConfigResponse, OKServerException>> continuation) throws java.lang.Throwable {
        GetStickerConfigUseCase$invoke$1 getStickerConfigUseCase$invoke$1;
        if (continuation instanceof GetStickerConfigUseCase$invoke$1) {
            getStickerConfigUseCase$invoke$1 = (GetStickerConfigUseCase$invoke$1) continuation;
            int i = getStickerConfigUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getStickerConfigUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getStickerConfigUseCase$invoke$1 = new GetStickerConfigUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getStickerConfigUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getStickerConfigUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                sRM srm = this.OLrzqt;
                C59462zhW.Activity activity = C59462zhW.OLrzqt;
                long jDbNXlk = C59462zhW.DbNXlk(C59519zia.EZpvd(1, DurationUnit.HOURS));
                getStickerConfigUseCase$invoke$1.label = 1;
                objEZpvd = srm.EZpvd("FIRST_CACHE", jDbNXlk, getStickerConfigUseCase$invoke$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            ResponseData responseData = (ResponseData) objEZpvd;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }
}

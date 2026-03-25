package o;

import android.graphics.BitmapFactory;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMUploadMediaService;
import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.okimcore.model.remote.UploadImageBody;
import com.okinc.okimcore.model.remote.UploadImageResponse;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sNz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44388sNz {
    public static final AbstractC58185ywX<kotlin.Pair<java.lang.Long, java.lang.String>> copydefault(@NotNull final InHouseIMUploadMediaService inHouseIMUploadMediaService, @NotNull android.net.Uri uri, @NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(inHouseIMUploadMediaService, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(context, "");
        final java.io.File fileEZpvd = C44160sFn.EZpvd(uri, context);
        if (fileEZpvd == null) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Long, java.lang.String>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKIMException("file invalidate or not support!", -1));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.sNx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C44388sNz.EZpvd(fileEZpvd, context, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        final Function1 function1 = new Function1() { // from class: o.sNy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44388sNz.KWHzl(inHouseIMUploadMediaService, (java.io.File) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Long, java.lang.String>> abstractC58185ywXCopydefault = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.sNA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C44388sNz.EZpvd(function1, obj);
            }
        }).copydefault(yBP.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final void EZpvd(java.io.File file, android.content.Context context, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (file.length() > MediaHttpUploader.DEFAULT_CHUNK_SIZE) {
            android.graphics.Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath());
            C33610mzh c33610mzh = C33610mzh.OLrzqt;
            Intrinsics.copydefault(bitmapDecodeFile);
            if (C33610mzh.saveBitmapWithCompression$default(c33610mzh, context, bitmapDecodeFile, 0, 4, null) == null) {
                interfaceC58184ywW.onError(new OKIMException("Save bitmap with compressed failed!", -1));
            } else {
                interfaceC58184ywW.onNext(file);
            }
        } else {
            interfaceC58184ywW.onNext(file);
        }
        interfaceC58184ywW.onComplete();
    }

    public static final InterfaceC60096zvd EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(InHouseIMUploadMediaService inHouseIMUploadMediaService, java.io.File file) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(file, "");
        java.lang.String strEZpvd = C44160sFn.EZpvd(file);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(inHouseIMUploadMediaService.updateGroupAvatar(new UploadImageBody(strEZpvd)), (Function1) null, 1, (java.lang.Object) null);
            final Function1 function1 = new Function1() { // from class: o.sNC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C44388sNz.KWHzl((UploadImageResponse) obj);
                }
            };
            return abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.sNG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C44388sNz.copydefault(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKServerException(0, "upload image byte64 failed ", null, null, 13, null));
    }

    public static final kotlin.Pair copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(UploadImageResponse uploadImageResponse) {
        Intrinsics.checkNotNullParameter(uploadImageResponse, "");
        java.lang.Long imageId = uploadImageResponse.getImageId();
        long jLongValue = imageId != null ? imageId.longValue() : -1L;
        java.lang.String avatar = uploadImageResponse.getAvatar();
        return C56390yDp.OLrzqt(java.lang.Long.valueOf(jLongValue), avatar != null ? avatar : "");
    }
}

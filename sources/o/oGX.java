package o;

import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKShareMessage;
import com.okinc.okimcore.model.im.OKSightMessage;
import com.okinc.okimcore.model.im.OKStickerMessage;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class oGX {
    public static final oGX copydefault = new oGX();

    private oGX() {
    }

    public final void EZpvd(@NotNull android.widget.ImageView imageView, @NotNull OKMessage oKMessage) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        OKMessageContent content = oKMessage.getContent();
        if (content instanceof OKReferenceMessage) {
            content = ((OKReferenceMessage) content).getOriginalOKMessageContent();
        } else if (content instanceof OKShareMessage) {
            content = ((OKShareMessage) content).getImage();
        }
        try {
            Result.Application application = Result.Companion;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (content == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        if ((content instanceof OKGIFMessage) || (content instanceof OKStickerMessage)) {
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            iMImageHelper.copydefault(imageView, nPA.AEQbTJ(content), iMImageHelper.isConnected());
        } else if ((content instanceof OKImageMessage) || (content instanceof OKSightMessage)) {
            IMImageHelper iMImageHelper2 = IMImageHelper.OLrzqt;
            iMImageHelper2.AEQbTJ(imageView, nPA.AEQbTJ(content), iMImageHelper2.isConnected());
        } else {
            IMImageHelper iMImageHelper3 = IMImageHelper.OLrzqt;
            IMImageHelper.loadCacheOnlyImageWithThumbnail$default(iMImageHelper3, imageView, nPA.AEQbTJ(content), iMImageHelper3.isConnected(), false, 8, null);
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("ThumbnailUtil", "Failed to load reference message thumbnail", thM7380exceptionOrNullimpl);
        }
    }
}

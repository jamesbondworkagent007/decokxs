package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.im.imui.glide.model.IMImageModel;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMediaMessageContent;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKSightMessage;
import com.okinc.okimcore.model.im.OKStickerMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nPA {
    public static final IMImageModel AEQbTJ(@NotNull OKMessageContent oKMessageContent) {
        Intrinsics.checkNotNullParameter(oKMessageContent, "");
        if (oKMessageContent instanceof OKImageMessage) {
            OKImageMessage oKImageMessage = (OKImageMessage) oKMessageContent;
            return new IMImageModel(oKImageMessage.getBase64(), oKImageMessage.getThumbUri(), oKImageMessage.getLocalUri(), oKImageMessage.getRemoteUri(), oKImageMessage.getWidth(), oKImageMessage.getHeight(), null, false, 192, null);
        }
        if (oKMessageContent instanceof OKSightMessage) {
            OKSightMessage oKSightMessage = (OKSightMessage) oKMessageContent;
            return new IMImageModel(oKSightMessage.getBase64(), oKSightMessage.getThumbUri(), oKSightMessage.getLocalUri(), oKSightMessage.getRemoteUri(), null, null, null, false, PsExtractor.VIDEO_STREAM_MASK, null);
        }
        if (oKMessageContent instanceof OKStickerMessage) {
            java.lang.String iconUrl = ((OKStickerMessage) oKMessageContent).getIconUrl();
            return new IMImageModel(null, null, null, android.net.Uri.parse(iconUrl != null ? iconUrl : ""), null, null, null, false, PsExtractor.VIDEO_STREAM_MASK, null);
        }
        if (oKMessageContent instanceof OKMediaMessageContent) {
            OKMediaMessageContent oKMediaMessageContent = (OKMediaMessageContent) oKMessageContent;
            return new IMImageModel(null, null, oKMediaMessageContent.getLocalUri(), oKMediaMessageContent.getRemoteUri(), null, null, null, false, 243, null);
        }
        throw new java.lang.IllegalArgumentException("Unsupported message type: " + oKMessageContent);
    }
}

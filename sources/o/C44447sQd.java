package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths;
import com.okinc.okimcore.model.im.inhouseim.ws.VideoMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.VoiceMessageData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sQd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44447sQd {
    public static final C44434sPr OLrzqt(@NotNull ImageMessageData imageMessageData) {
        Intrinsics.checkNotNullParameter(imageMessageData, "");
        java.lang.String fileId = imageMessageData.getFileId();
        MediaUrlPaths urlPaths = imageMessageData.getUrlPaths();
        java.lang.String cn2 = urlPaths != null ? urlPaths.getCN() : null;
        MediaUrlPaths urlPaths2 = imageMessageData.getUrlPaths();
        return new C44434sPr(fileId, cn2, urlPaths2 != null ? urlPaths2.getDefault() : null, imageMessageData.getLocalUri(), imageMessageData.getThumbnail(), imageMessageData.getWidth(), imageMessageData.getHeight(), null, null, null, null, 1920, null);
    }

    public static final C44434sPr EZpvd(@NotNull VideoMessageData videoMessageData) {
        Intrinsics.checkNotNullParameter(videoMessageData, "");
        java.lang.String fileId = videoMessageData.getFileId();
        MediaUrlPaths urlPaths = videoMessageData.getUrlPaths();
        java.lang.String cn2 = urlPaths != null ? urlPaths.getCN() : null;
        MediaUrlPaths urlPaths2 = videoMessageData.getUrlPaths();
        return new C44434sPr(fileId, cn2, urlPaths2 != null ? urlPaths2.getDefault() : null, videoMessageData.getLocalUri(), videoMessageData.getThumbnail(), null, null, videoMessageData.getDuration(), videoMessageData.getSize(), null, null, 1632, null);
    }

    public static final C44434sPr AEQbTJ(@NotNull VoiceMessageData voiceMessageData) {
        Intrinsics.checkNotNullParameter(voiceMessageData, "");
        java.lang.String fileId = voiceMessageData.getFileId();
        MediaUrlPaths urlPaths = voiceMessageData.getUrlPaths();
        java.lang.String cn2 = urlPaths != null ? urlPaths.getCN() : null;
        MediaUrlPaths urlPaths2 = voiceMessageData.getUrlPaths();
        return new C44434sPr(fileId, cn2, urlPaths2 != null ? urlPaths2.getDefault() : null, voiceMessageData.getLocalUri(), null, null, null, voiceMessageData.getDuration(), null, null, null, 1904, null);
    }

    public static final C44434sPr KWHzl(@NotNull MediaMessageData mediaMessageData) {
        Intrinsics.checkNotNullParameter(mediaMessageData, "");
        java.lang.String fileId = mediaMessageData.getFileId();
        MediaUrlPaths urlPaths = mediaMessageData.getUrlPaths();
        java.lang.String cn2 = urlPaths != null ? urlPaths.getCN() : null;
        MediaUrlPaths urlPaths2 = mediaMessageData.getUrlPaths();
        return new C44434sPr(fileId, cn2, urlPaths2 != null ? urlPaths2.getDefault() : null, mediaMessageData.getLocalUri(), null, null, null, null, mediaMessageData.getSize(), mediaMessageData.getFileName(), mediaMessageData.getFileExtension(), PsExtractor.VIDEO_STREAM_MASK, null);
    }
}

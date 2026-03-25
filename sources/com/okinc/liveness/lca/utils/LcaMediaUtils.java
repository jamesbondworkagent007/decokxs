package com.okinc.liveness.lca.utils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import o.C56529yIt;
import o.C59449zhJ;
import o.yFA;
import o.yFB;
import o.yFL;
import o.yHX;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaMediaUtils {
    public static final int $stable = 0;
    public static final LcaMediaUtils INSTANCE = new LcaMediaUtils();

    private LcaMediaUtils() {
    }

    public final String getBestSupportedCodec() {
        List<String> supportedVideoCodecs = getSupportedVideoCodecs();
        List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(MimeTypes.VIDEO_H264);
        listOLrzqt.add(MimeTypes.VIDEO_H265);
        for (String str : C56402yEa.fARcdN(listOLrzqt)) {
            if (supportedVideoCodecs.contains(str)) {
                return str;
            }
        }
        return MimeTypes.VIDEO_H264;
    }

    public final List<String> getSupportedVideoCodecs() {
        ArrayList arrayList = new ArrayList();
        Iterator itEZpvd = yHX.EZpvd(new MediaCodecList(1).getCodecInfos());
        while (itEZpvd.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) itEZpvd.next();
            if (mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                Intrinsics.checkNotNullExpressionValue(supportedTypes, "");
                ArrayList arrayList2 = new ArrayList();
                for (String str : supportedTypes) {
                    Intrinsics.copydefault((Object) str);
                    if (C59449zhJ.startsWith$default(str, "video/", false, 2, null)) {
                        arrayList2.add(str);
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }
        return CollectionsKt___CollectionsKt.QbewEr(arrayList);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String getEncodeCodecStr(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "");
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            try {
                mediaExtractor.setDataSource(file.getPath());
                int trackCount = mediaExtractor.getTrackCount();
                for (int i = 0; i < trackCount; i++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                    Intrinsics.checkNotNullExpressionValue(trackFormat, "");
                    String string = trackFormat.getString("mime");
                    if (string != null && C59449zhJ.startsWith$default(string, "video/", false, 2, null)) {
                        if (string != null) {
                            switch (string.hashCode()) {
                                case -1662735862:
                                    if (string.equals(MimeTypes.VIDEO_AV1)) {
                                        string = "AV1";
                                    }
                                    break;
                                case -1662541442:
                                    if (string.equals(MimeTypes.VIDEO_H265)) {
                                        string = "H.265/HEVC";
                                    }
                                    break;
                                case 1187890754:
                                    if (string.equals(MimeTypes.VIDEO_MP4V)) {
                                        string = "MPEG-4";
                                    }
                                    break;
                                case 1331836730:
                                    if (string.equals(MimeTypes.VIDEO_H264)) {
                                        string = "H.264/AVC";
                                    }
                                    break;
                                case 1599127256:
                                    if (string.equals("video/x-vnd.on2.vp8")) {
                                        string = "VP8";
                                    }
                                    break;
                                case 1599127257:
                                    if (string.equals(MimeTypes.VIDEO_VP9)) {
                                        string = "VP9";
                                    }
                                    break;
                            }
                        }
                        return string;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        } finally {
            mediaExtractor.release();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getBestOutputFormatByEncodeCodec(String str) {
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -1662735862:
                    str2 = MimeTypes.VIDEO_AV1;
                    str.equals(str2);
                    break;
                case -1662541442:
                    str2 = MimeTypes.VIDEO_H265;
                    str.equals(str2);
                    break;
                case 1187890754:
                    str2 = MimeTypes.VIDEO_MP4V;
                    str.equals(str2);
                    break;
                case 1331836730:
                    str2 = MimeTypes.VIDEO_H264;
                    str.equals(str2);
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        return 1;
                    }
                    break;
                case 1599127257:
                    if (!str.equals(MimeTypes.VIDEO_VP9)) {
                    }
                    break;
            }
        }
        return 0;
    }

    public final MediaType getMediaTypeFromFile(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "");
        MediaType.Companion companion = MediaType.Companion;
        String lowerCase = yFL.fetchVPNInfo(file).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return companion.parse("video/" + lowerCase);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getFileExtensionFromEncodeCodec(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1662735862:
                str2 = MimeTypes.VIDEO_AV1;
                str.equals(str2);
            case -1662541442:
                str2 = MimeTypes.VIDEO_H265;
                str.equals(str2);
            case 1187890754:
                str2 = MimeTypes.VIDEO_MP4V;
                str.equals(str2);
            case 1331836730:
                str2 = MimeTypes.VIDEO_H264;
                str.equals(str2);
            case 1599127256:
                return !str.equals("video/x-vnd.on2.vp8") ? "mp4" : "webm";
            case 1599127257:
                if (!str.equals(MimeTypes.VIDEO_VP9)) {
                }
                break;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void saveVideoToGallery(@NotNull Context context, @NotNull File file) throws FileNotFoundException {
        Uri contentUri;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(file, "");
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT >= 29) {
            contentUri = MediaStore.Video.Media.getContentUri("external_primary");
        } else {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", file.getName());
        String lowerCase = yFL.fetchVPNInfo(file).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        contentValues.put("mime_type", "video/" + lowerCase);
        contentValues.put("relative_path", "Movies/MyVideos");
        contentValues.put("is_pending", (Integer) 1);
        Uri uriInsert = contentResolver.insert(contentUri, contentValues);
        if (uriInsert != null) {
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
            if (outputStreamOpenOutputStream != null) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        yFB.copyTo$default(fileInputStream, outputStreamOpenOutputStream, 0, 2, null);
                        yFA.copydefault(fileInputStream, null);
                        yFA.copydefault(outputStreamOpenOutputStream, null);
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        yFA.copydefault(outputStreamOpenOutputStream, th);
                        throw th2;
                    }
                }
            }
            contentValues.clear();
            contentValues.put("is_pending", (Integer) 0);
            contentResolver.update(uriInsert, contentValues, null, null);
        }
    }

    public final long getVideoDuration(@NotNull File file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            return strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : 0L;
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    public final String formatDuration(long j) {
        long j2 = 60;
        long j3 = (j / ((long) 1000)) % j2;
        long j4 = (j / ((long) 60000)) % j2;
        long j5 = j / ((long) 3600000);
        if (j5 > 0) {
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            String str = String.format(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }
        C56529yIt c56529yIt2 = C56529yIt.KWHzl;
        String str2 = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j3)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }
}

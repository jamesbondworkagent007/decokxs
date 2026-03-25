package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.okinc.okimcore.feature.share.repository.ShareContentRepository$sendContent$2;
import com.okinc.okimcore.feature.share.repository.ShareContentRepository$uploadImageFromBytes$1;
import com.okinc.okimcore.feature.share.repository.ShareContentRepository$uploadImageFromBytes$ossResponse$1;
import com.okinc.okimcore.feature.share.repository.ShareContentRepository$uploadImageFromFile$1;
import com.okinc.okimcore.feature.share.repository.ShareContentRepository$uploadImageFromFile$ossResponse$1;
import com.okinc.okimcore.feature.share.repository.remote.IMShareService;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMUploadMediaService;
import com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths;
import com.okinc.okimcore.model.remote.URLS;
import com.okinc.okimcore.model.remote.UploadMediaResponse;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sNt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44382sNt {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final android.content.Context EZpvd;
    public final InHouseIMUploadMediaService KWHzl;
    public final IMShareService copydefault;

    @yCM
    public C44382sNt(@NotNull IMShareService iMShareService, @NotNull InHouseIMUploadMediaService inHouseIMUploadMediaService, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(iMShareService, "");
        Intrinsics.checkNotNullParameter(inHouseIMUploadMediaService, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = iMShareService;
        this.KWHzl = inHouseIMUploadMediaService;
        this.AEQbTJ = coroutineDispatcher;
        this.EZpvd = context;
    }

    public final java.lang.Object AEQbTJ(@NotNull sQX sqx, @NotNull Continuation<? super sQV> continuation) {
        java.lang.String strGEmmrt = sqx.AEQbTJ().gEmmrt();
        java.lang.String strAYXKKw = sqx.AEQbTJ().AYXKKw();
        boolean z = strAYXKKw == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAYXKKw);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("sendContent: Starting share - imagePath: '");
        sb.append(strGEmmrt);
        sb.append("', hasBase64: ");
        sb.append(!z);
        pUU.EZpvd("ShareContentRepo", sb.toString());
        return BuildersKt.withContext(this.AEQbTJ, new ShareContentRepository$sendContent$2(this, sqx, null), continuation);
    }

    public final java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, Continuation<? super ImageMessageData> continuation) {
        java.lang.String strAkhnZx = str != null ? C59454zhO.AkhnZx(str, 50) : null;
        boolean z = str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("uploadImage: imagePath='");
        sb.append(strAkhnZx);
        sb.append("', hasBase64=");
        sb.append(!z);
        pUU.EZpvd("ShareContentRepo", sb.toString());
        if (str != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            java.io.File fileAEQbTJ = C44163sFq.OLrzqt.AEQbTJ(str);
            if (fileAEQbTJ.exists()) {
                pUU.EZpvd("ShareContentRepo", "uploadImage: Using file path - " + fileAEQbTJ.getName());
                return EZpvd(fileAEQbTJ, continuation);
            }
            pUU.valueOf("ShareContentRepo", "uploadImage: File does not exist - " + str);
        }
        if (str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            pUU.valueOf("ShareContentRepo", "uploadImage: No image source available");
            return null;
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairEZpvd = EZpvd(str2);
        java.lang.String strComponent1 = pairEZpvd.component1();
        java.lang.String strComponent2 = pairEZpvd.component2();
        pUU.EZpvd("ShareContentRepo", "uploadImage: Parsed base64 - dataUriMimeType='" + strComponent2 + "', rawBase64Length=" + strComponent1.length());
        try {
            byte[] bArrDecode = android.util.Base64.decode(strComponent1, 0);
            Intrinsics.copydefault(bArrDecode);
            kotlin.Pair<byte[], java.lang.String> pairAEQbTJ = AEQbTJ(bArrDecode, strComponent2);
            byte[] bArrComponent1 = pairAEQbTJ.component1();
            java.lang.String strComponent22 = pairAEQbTJ.component2();
            pUU.EZpvd("ShareContentRepo", "uploadImage: After conversion - size=" + bArrComponent1.length + ", mimeType='" + strComponent22 + "'");
            pUU.EZpvd("ShareContentRepo", "uploadImage: Using direct ByteArray upload");
            return AEQbTJ(bArrComponent1, strComponent22, continuation);
        } catch (java.lang.IllegalArgumentException e) {
            pUU.AEQbTJ("ShareContentRepo", "uploadImage: Failed to decode base64", e);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [162=4] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142 A[Catch: Exception -> 0x021a, TryCatch #0 {Exception -> 0x021a, blocks: (B:15:0x0045, B:63:0x01ec, B:65:0x01f8, B:68:0x0205, B:69:0x020d, B:20:0x0060, B:51:0x0184, B:53:0x01a6, B:55:0x01af, B:57:0x01b5, B:59:0x01be, B:23:0x0073, B:44:0x013e, B:46:0x0142, B:48:0x0148, B:26:0x0080, B:33:0x00e0, B:35:0x00e4, B:38:0x00f0, B:40:0x00fa, B:29:0x00b2), top: B:74:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0148 A[Catch: Exception -> 0x021a, TryCatch #0 {Exception -> 0x021a, blocks: (B:15:0x0045, B:63:0x01ec, B:65:0x01f8, B:68:0x0205, B:69:0x020d, B:20:0x0060, B:51:0x0184, B:53:0x01a6, B:55:0x01af, B:57:0x01b5, B:59:0x01be, B:23:0x0073, B:44:0x013e, B:46:0x0142, B:48:0x0148, B:26:0x0080, B:33:0x00e0, B:35:0x00e4, B:38:0x00f0, B:40:0x00fa, B:29:0x00b2), top: B:74:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a6 A[Catch: Exception -> 0x021a, TryCatch #0 {Exception -> 0x021a, blocks: (B:15:0x0045, B:63:0x01ec, B:65:0x01f8, B:68:0x0205, B:69:0x020d, B:20:0x0060, B:51:0x0184, B:53:0x01a6, B:55:0x01af, B:57:0x01b5, B:59:0x01be, B:23:0x0073, B:44:0x013e, B:46:0x0142, B:48:0x0148, B:26:0x0080, B:33:0x00e0, B:35:0x00e4, B:38:0x00f0, B:40:0x00fa, B:29:0x00b2), top: B:74:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b5 A[Catch: Exception -> 0x021a, TryCatch #0 {Exception -> 0x021a, blocks: (B:15:0x0045, B:63:0x01ec, B:65:0x01f8, B:68:0x0205, B:69:0x020d, B:20:0x0060, B:51:0x0184, B:53:0x01a6, B:55:0x01af, B:57:0x01b5, B:59:0x01be, B:23:0x0073, B:44:0x013e, B:46:0x0142, B:48:0x0148, B:26:0x0080, B:33:0x00e0, B:35:0x00e4, B:38:0x00f0, B:40:0x00fa, B:29:0x00b2), top: B:74:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f8 A[Catch: Exception -> 0x021a, TryCatch #0 {Exception -> 0x021a, blocks: (B:15:0x0045, B:63:0x01ec, B:65:0x01f8, B:68:0x0205, B:69:0x020d, B:20:0x0060, B:51:0x0184, B:53:0x01a6, B:55:0x01af, B:57:0x01b5, B:59:0x01be, B:23:0x0073, B:44:0x013e, B:46:0x0142, B:48:0x0148, B:26:0x0080, B:33:0x00e0, B:35:0x00e4, B:38:0x00f0, B:40:0x00fa, B:29:0x00b2), top: B:74:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0205 A[Catch: Exception -> 0x021a, TryCatch #0 {Exception -> 0x021a, blocks: (B:15:0x0045, B:63:0x01ec, B:65:0x01f8, B:68:0x0205, B:69:0x020d, B:20:0x0060, B:51:0x0184, B:53:0x01a6, B:55:0x01af, B:57:0x01b5, B:59:0x01be, B:23:0x0073, B:44:0x013e, B:46:0x0142, B:48:0x0148, B:26:0x0080, B:33:0x00e0, B:35:0x00e4, B:38:0x00f0, B:40:0x00fa, B:29:0x00b2), top: B:74:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.io.File file, Continuation<? super ImageMessageData> continuation) throws java.lang.Exception {
        ShareContentRepository$uploadImageFromFile$1 shareContentRepository$uploadImageFromFile$1;
        android.net.Uri uri;
        C44382sNt c44382sNt;
        android.net.Uri uri2;
        C44382sNt c44382sNt2;
        C44165sFs c44165sFs;
        MultipartBody.Part part;
        C44165sFs c44165sFs2;
        java.lang.Object base64Thumbnail$default;
        UploadMediaResponse uploadMediaResponse;
        MediaUrlPaths mediaUrlPaths;
        android.net.Uri uri3;
        if (continuation instanceof ShareContentRepository$uploadImageFromFile$1) {
            shareContentRepository$uploadImageFromFile$1 = (ShareContentRepository$uploadImageFromFile$1) continuation;
            int i = shareContentRepository$uploadImageFromFile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                shareContentRepository$uploadImageFromFile$1.label = i - Integer.MIN_VALUE;
            } else {
                shareContentRepository$uploadImageFromFile$1 = new ShareContentRepository$uploadImageFromFile$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = shareContentRepository$uploadImageFromFile$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = shareContentRepository$uploadImageFromFile$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                pUU.EZpvd("ShareContentRepo", "uploadImageFromFile: file='" + file.getName() + "', size=" + file.length() + " bytes");
                android.net.Uri uriOLrzqt = C44164sFr.OLrzqt(file, this.EZpvd);
                pUU.EZpvd("ShareContentRepo", "uploadImageFromFile: Content URI created - " + uriOLrzqt);
                android.content.Context context = this.EZpvd;
                shareContentRepository$uploadImageFromFile$1.L$0 = this;
                shareContentRepository$uploadImageFromFile$1.L$1 = uriOLrzqt;
                shareContentRepository$uploadImageFromFile$1.label = 1;
                java.lang.Object objAYXKKw = sFB.AYXKKw(uriOLrzqt, context, shareContentRepository$uploadImageFromFile$1);
                if (objAYXKKw == objCopydefault) {
                    return objCopydefault;
                }
                uri = uriOLrzqt;
                c44382sNt = this;
                objWithContext = objAYXKKw;
            } else if (i2 == 1) {
                android.net.Uri uri4 = (android.net.Uri) shareContentRepository$uploadImageFromFile$1.L$1;
                C44382sNt c44382sNt3 = (C44382sNt) shareContentRepository$uploadImageFromFile$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                uri = uri4;
                c44382sNt = c44382sNt3;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        MediaUrlPaths mediaUrlPaths2 = (MediaUrlPaths) shareContentRepository$uploadImageFromFile$1.L$3;
                        uploadMediaResponse = (UploadMediaResponse) shareContentRepository$uploadImageFromFile$1.L$2;
                        C44165sFs c44165sFs3 = (C44165sFs) shareContentRepository$uploadImageFromFile$1.L$1;
                        uri3 = (android.net.Uri) shareContentRepository$uploadImageFromFile$1.L$0;
                        C56391yDq.AEQbTJ(objWithContext);
                        c44165sFs2 = c44165sFs3;
                        mediaUrlPaths = mediaUrlPaths2;
                        return new ImageMessageData((java.lang.String) objWithContext, mediaUrlPaths, uri3.toString(), (java.lang.String) null, c44165sFs2 != null ? C56443yFo.AEQbTJ(c44165sFs2.copydefault()) : null, c44165sFs2 == null ? C56443yFo.AEQbTJ(c44165sFs2.KWHzl()) : null, uploadMediaResponse.getFileId(), 8, (DefaultConstructorMarker) null);
                    }
                    c44165sFs = (C44165sFs) shareContentRepository$uploadImageFromFile$1.L$2;
                    uri2 = (android.net.Uri) shareContentRepository$uploadImageFromFile$1.L$1;
                    c44382sNt2 = (C44382sNt) shareContentRepository$uploadImageFromFile$1.L$0;
                    C56391yDq.AEQbTJ(objWithContext);
                    c44165sFs2 = c44165sFs;
                    android.net.Uri uri5 = uri2;
                    UploadMediaResponse uploadMediaResponse2 = (UploadMediaResponse) objWithContext;
                    pUU.EZpvd("ShareContentRepo", "uploadImageFromFile: Success - fileId=" + uploadMediaResponse2.getFileId());
                    URLS urls = uploadMediaResponse2.getUrls();
                    java.lang.String cn2 = urls == null ? urls.getCN() : null;
                    URLS urls2 = uploadMediaResponse2.getUrls();
                    MediaUrlPaths mediaUrlPaths3 = new MediaUrlPaths(cn2, urls2 == null ? urls2.getDefault() : null, (java.lang.String) null, 4, (DefaultConstructorMarker) null);
                    android.content.Context context2 = c44382sNt2.EZpvd;
                    shareContentRepository$uploadImageFromFile$1.L$0 = uri5;
                    shareContentRepository$uploadImageFromFile$1.L$1 = c44165sFs2;
                    shareContentRepository$uploadImageFromFile$1.L$2 = uploadMediaResponse2;
                    shareContentRepository$uploadImageFromFile$1.L$3 = mediaUrlPaths3;
                    shareContentRepository$uploadImageFromFile$1.label = 4;
                    base64Thumbnail$default = sFB.toBase64Thumbnail$default(uri5, context2, 0, 0L, shareContentRepository$uploadImageFromFile$1, 6, null);
                    if (base64Thumbnail$default != objCopydefault) {
                        return objCopydefault;
                    }
                    uploadMediaResponse = uploadMediaResponse2;
                    mediaUrlPaths = mediaUrlPaths3;
                    objWithContext = base64Thumbnail$default;
                    uri3 = uri5;
                    return new ImageMessageData((java.lang.String) objWithContext, mediaUrlPaths, uri3.toString(), (java.lang.String) null, c44165sFs2 != null ? C56443yFo.AEQbTJ(c44165sFs2.copydefault()) : null, c44165sFs2 == null ? C56443yFo.AEQbTJ(c44165sFs2.KWHzl()) : null, uploadMediaResponse.getFileId(), 8, (DefaultConstructorMarker) null);
                }
                c44165sFs = (C44165sFs) shareContentRepository$uploadImageFromFile$1.L$2;
                uri2 = (android.net.Uri) shareContentRepository$uploadImageFromFile$1.L$1;
                c44382sNt2 = (C44382sNt) shareContentRepository$uploadImageFromFile$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                part = (MultipartBody.Part) objWithContext;
                if (part != null) {
                    pUU.copydefault("ShareContentRepo", "uploadImageFromFile: Failed to create multipart body");
                    return null;
                }
                pUU.EZpvd("ShareContentRepo", "uploadImageFromFile: Multipart created - contentType='" + part.body().contentType() + "'");
                pUU.EZpvd("ShareContentRepo", "uploadImageFromFile: Uploading to server...");
                CoroutineDispatcher coroutineDispatcher = c44382sNt2.AEQbTJ;
                ShareContentRepository$uploadImageFromFile$ossResponse$1 shareContentRepository$uploadImageFromFile$ossResponse$1 = new ShareContentRepository$uploadImageFromFile$ossResponse$1(c44382sNt2, part, null);
                shareContentRepository$uploadImageFromFile$1.L$0 = c44382sNt2;
                shareContentRepository$uploadImageFromFile$1.L$1 = uri2;
                shareContentRepository$uploadImageFromFile$1.L$2 = c44165sFs;
                shareContentRepository$uploadImageFromFile$1.label = 3;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, shareContentRepository$uploadImageFromFile$ossResponse$1, shareContentRepository$uploadImageFromFile$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c44165sFs2 = c44165sFs;
                android.net.Uri uri52 = uri2;
                UploadMediaResponse uploadMediaResponse22 = (UploadMediaResponse) objWithContext;
                pUU.EZpvd("ShareContentRepo", "uploadImageFromFile: Success - fileId=" + uploadMediaResponse22.getFileId());
                URLS urls3 = uploadMediaResponse22.getUrls();
                if (urls3 == null) {
                }
                URLS urls22 = uploadMediaResponse22.getUrls();
                MediaUrlPaths mediaUrlPaths32 = new MediaUrlPaths(cn2, urls22 == null ? urls22.getDefault() : null, (java.lang.String) null, 4, (DefaultConstructorMarker) null);
                android.content.Context context22 = c44382sNt2.EZpvd;
                shareContentRepository$uploadImageFromFile$1.L$0 = uri52;
                shareContentRepository$uploadImageFromFile$1.L$1 = c44165sFs2;
                shareContentRepository$uploadImageFromFile$1.L$2 = uploadMediaResponse22;
                shareContentRepository$uploadImageFromFile$1.L$3 = mediaUrlPaths32;
                shareContentRepository$uploadImageFromFile$1.label = 4;
                base64Thumbnail$default = sFB.toBase64Thumbnail$default(uri52, context22, 0, 0L, shareContentRepository$uploadImageFromFile$1, 6, null);
                if (base64Thumbnail$default != objCopydefault) {
                }
            }
            C44165sFs c44165sFs4 = (C44165sFs) objWithContext;
            pUU.EZpvd("ShareContentRepo", "uploadImageFromFile: Dimensions=" + (c44165sFs4 != null ? C56443yFo.AEQbTJ(c44165sFs4.KWHzl()) : null) + "x" + (c44165sFs4 != null ? C56443yFo.AEQbTJ(c44165sFs4.copydefault()) : null));
            android.content.Context context3 = c44382sNt.EZpvd;
            shareContentRepository$uploadImageFromFile$1.L$0 = c44382sNt;
            shareContentRepository$uploadImageFromFile$1.L$1 = uri;
            shareContentRepository$uploadImageFromFile$1.L$2 = c44165sFs4;
            shareContentRepository$uploadImageFromFile$1.label = 2;
            C44382sNt c44382sNt4 = c44382sNt;
            java.lang.Object multipartBodyPart$default = sFB.toMultipartBodyPart$default(uri, context3, "file", null, shareContentRepository$uploadImageFromFile$1, 4, null);
            if (multipartBodyPart$default == objCopydefault) {
                return objCopydefault;
            }
            uri2 = uri;
            c44382sNt2 = c44382sNt4;
            c44165sFs = c44165sFs4;
            objWithContext = multipartBodyPart$default;
            part = (MultipartBody.Part) objWithContext;
            if (part != null) {
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ShareContentRepo", "uploadImageFromFile: Failed", e);
            throw e;
        }
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> EZpvd(java.lang.String str) {
        int iIndexOf$default;
        if (C59449zhJ.startsWith$default(str, "data:", false, 2, null) && (iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, AbstractJsonLexerKt.COMMA, 0, false, 6, (java.lang.Object) null)) != -1) {
            java.lang.String strSubstring = str.substring(5, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            java.lang.String strSubstring2 = str.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            java.lang.String strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(strSubstring, ';', (java.lang.String) null, 2, (java.lang.Object) null);
            java.lang.String str2 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strSubstringBefore$default) ^ true ? strSubstringBefore$default : null;
            pUU.EZpvd("ShareContentRepo", "parseBase64String: Data URI detected - mimeType='" + str2 + "', metadataLength=" + strSubstring.length());
            return C56390yDp.OLrzqt(strSubstring2, str2);
        }
        return C56390yDp.OLrzqt(str, null);
    }

    public final kotlin.Pair<byte[], java.lang.String> AEQbTJ(byte[] bArr, java.lang.String str) {
        java.lang.String strKWHzl = KWHzl(bArr);
        if (str == null) {
            str = strKWHzl;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "image/jpeg") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "image/png")) {
            pUU.EZpvd("ShareContentRepo", "convertToJpegIfNeeded: No conversion needed, already " + str);
            return C56390yDp.OLrzqt(bArr, str);
        }
        pUU.EZpvd("ShareContentRepo", "convertToJpegIfNeeded: Converting from " + str + " to JPEG");
        try {
            android.graphics.Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (bitmapDecodeByteArray == null) {
                pUU.copydefault("ShareContentRepo", "convertToJpegIfNeeded: Failed to decode image, using original");
                return C56390yDp.OLrzqt(bArr, str);
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            boolean zCompress = bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
            bitmapDecodeByteArray.recycle();
            if (zCompress) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                pUU.EZpvd("ShareContentRepo", "convertToJpegIfNeeded: Conversion successful - original=" + bArr.length + " bytes, jpeg=" + byteArray.length + " bytes");
                return C56390yDp.OLrzqt(byteArray, "image/jpeg");
            }
            pUU.copydefault("ShareContentRepo", "convertToJpegIfNeeded: Compression failed, using original");
            return C56390yDp.OLrzqt(bArr, str);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ShareContentRepo", "convertToJpegIfNeeded: Conversion failed", e);
            return C56390yDp.OLrzqt(bArr, str);
        }
    }

    public static /* synthetic */ java.lang.Object uploadImageFromBytes$default(C44382sNt c44382sNt, byte[] bArr, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return c44382sNt.AEQbTJ(bArr, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(byte[] bArr, java.lang.String str, Continuation<? super ImageMessageData> continuation) throws java.lang.Exception {
        ShareContentRepository$uploadImageFromBytes$1 shareContentRepository$uploadImageFromBytes$1;
        java.lang.String str2;
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pair;
        java.lang.String str3;
        if (continuation instanceof ShareContentRepository$uploadImageFromBytes$1) {
            shareContentRepository$uploadImageFromBytes$1 = (ShareContentRepository$uploadImageFromBytes$1) continuation;
            int i = shareContentRepository$uploadImageFromBytes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                shareContentRepository$uploadImageFromBytes$1.label = i - Integer.MIN_VALUE;
            } else {
                shareContentRepository$uploadImageFromBytes$1 = new ShareContentRepository$uploadImageFromBytes$1(this, continuation);
            }
        }
        ShareContentRepository$uploadImageFromBytes$1 shareContentRepository$uploadImageFromBytes$12 = shareContentRepository$uploadImageFromBytes$1;
        java.lang.Object obj = shareContentRepository$uploadImageFromBytes$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = shareContentRepository$uploadImageFromBytes$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.EZpvd("ShareContentRepo", "uploadImageFromBytes: size=" + bArr.length + " bytes, dataUriMimeType='" + str + "'");
                java.lang.String strKWHzl = KWHzl(bArr);
                if (!Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "image/jpeg") || str == null) {
                    str2 = strKWHzl;
                } else {
                    pUU.EZpvd("ShareContentRepo", "uploadImageFromBytes: Using dataUriMimeType hint instead of default");
                    str2 = str;
                }
                java.lang.String strAEQbTJ = AEQbTJ(str2);
                pUU.EZpvd("ShareContentRepo", "uploadImageFromBytes: Detected MIME='" + str2 + "', extension='" + strAEQbTJ + "'");
                kotlin.Pair<java.lang.Integer, java.lang.Integer> pairCopydefault = copydefault(bArr);
                pUU.EZpvd("ShareContentRepo", "uploadImageFromBytes: Dimensions=" + (pairCopydefault != null ? pairCopydefault.getFirst() : null) + "x" + (pairCopydefault != null ? pairCopydefault.getSecond() : null));
                java.lang.String strEZpvd = EZpvd(bArr);
                pUU.EZpvd("ShareContentRepo", "uploadImageFromBytes: Thumbnail length=" + (strEZpvd != null ? strEZpvd.length() : 0));
                RequestBody requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.Companion, bArr, MediaType.Companion.get(str2), 0, 0, 6, (java.lang.Object) null);
                java.lang.String str4 = "share_image_" + java.lang.System.nanoTime() + strAEQbTJ;
                MultipartBody.Part partCreateFormData = MultipartBody.Part.Companion.createFormData("file", str4, requestBodyCreate$default);
                pUU.EZpvd("ShareContentRepo", "uploadImageFromBytes: Multipart created - filename='" + str4 + "', contentType='" + str2 + "', bodyContentType='" + requestBodyCreate$default.contentType() + "', bodyContentLength=" + requestBodyCreate$default.contentLength());
                java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(yDV.KWHzl(bArr, 12), " ", null, null, 0, null, new Function1() { // from class: o.sNu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C44382sNt.EZpvd(((java.lang.Byte) obj2).byteValue());
                    }
                }, 30, null);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("uploadImageFromBytes: Data header bytes: [");
                sb.append(strJoinToString$default);
                sb.append("]");
                pUU.EZpvd("ShareContentRepo", sb.toString());
                pUU.EZpvd("ShareContentRepo", "uploadImageFromBytes: Uploading to server...");
                CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
                ShareContentRepository$uploadImageFromBytes$ossResponse$1 shareContentRepository$uploadImageFromBytes$ossResponse$1 = new ShareContentRepository$uploadImageFromBytes$ossResponse$1(this, partCreateFormData, null);
                shareContentRepository$uploadImageFromBytes$12.L$0 = pairCopydefault;
                shareContentRepository$uploadImageFromBytes$12.L$1 = strEZpvd;
                shareContentRepository$uploadImageFromBytes$12.label = 1;
                java.lang.Object objWithContext = BuildersKt.withContext(coroutineDispatcher, shareContentRepository$uploadImageFromBytes$ossResponse$1, shareContentRepository$uploadImageFromBytes$12);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                pair = pairCopydefault;
                str3 = strEZpvd;
                obj = objWithContext;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str5 = (java.lang.String) shareContentRepository$uploadImageFromBytes$12.L$1;
                pair = (kotlin.Pair) shareContentRepository$uploadImageFromBytes$12.L$0;
                C56391yDq.AEQbTJ(obj);
                str3 = str5;
            }
            UploadMediaResponse uploadMediaResponse = (UploadMediaResponse) obj;
            pUU.EZpvd("ShareContentRepo", "uploadImageFromBytes: Success - fileId=" + uploadMediaResponse.getFileId());
            URLS urls = uploadMediaResponse.getUrls();
            java.lang.String cn2 = urls != null ? urls.getCN() : null;
            URLS urls2 = uploadMediaResponse.getUrls();
            return new ImageMessageData(str3, new MediaUrlPaths(cn2, urls2 != null ? urls2.getDefault() : null, (java.lang.String) null, 4, (DefaultConstructorMarker) null), (java.lang.String) null, (java.lang.String) null, pair != null ? pair.getSecond() : null, pair != null ? pair.getFirst() : null, uploadMediaResponse.getFileId(), 8, (DefaultConstructorMarker) null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ShareContentRepo", "uploadImageFromBytes: Failed", e);
            throw e;
        }
    }

    public static final java.lang.CharSequence EZpvd(byte b) {
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str = java.lang.String.format("%02X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final java.lang.String KWHzl(byte[] bArr) {
        java.lang.String str = "image/jpeg";
        if (bArr.length < 12) {
            pUU.valueOf("ShareContentRepo", "detectMimeType: Bytes too small (" + bArr.length + "), defaulting to JPEG");
            return "image/jpeg";
        }
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(yDV.KWHzl(bArr, 12), " ", null, null, 0, null, new Function1() { // from class: o.sNs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44382sNt.OLrzqt(((java.lang.Byte) obj).byteValue());
            }
        }, 30, null);
        if (AYXKKw(bArr)) {
            str = "image/webp";
        } else if (djBIcL(bArr)) {
            str = "image/png";
        } else if (!valueOf(bArr)) {
            if (OLrzqt(bArr)) {
                str = "image/gif";
            } else if (AEQbTJ(bArr)) {
                str = "image/bmp";
            } else {
                pUU.valueOf("ShareContentRepo", "detectMimeType: Unknown format, defaulting to JPEG");
            }
        }
        pUU.EZpvd("ShareContentRepo", "detectMimeType: Magic bytes [" + strJoinToString$default + "] -> '" + str + "'");
        return str;
    }

    public static final java.lang.CharSequence OLrzqt(byte b) {
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str = java.lang.String.format("%02X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(java.lang.String str) {
        switch (str.hashCode()) {
            case -1487394660:
                str.equals("image/jpeg");
            case -1487018032:
                return str.equals("image/webp") ? ".webp" : ".jpg";
            case -879272239:
                if (str.equals("image/bmp")) {
                    return ".bmp";
                }
                break;
            case -879267568:
                if (str.equals("image/gif")) {
                    return ".gif";
                }
                break;
            case -879258763:
                if (str.equals("image/png")) {
                    return ".png";
                }
                break;
        }
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> copydefault(byte[] bArr) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i = options.outWidth;
        if (i > 0 && options.outHeight > 0) {
            return new kotlin.Pair<>(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(options.outHeight));
        }
        pUU.valueOf("ShareContentRepo", "getImageDimensionsFromBytes: Could not determine dimensions");
        return null;
    }

    public final java.lang.String EZpvd(byte[] bArr) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int iMax = java.lang.Math.max(1, java.lang.Math.max(options.outWidth, options.outHeight) / 100);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = iMax;
            android.graphics.Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
            if (bitmapDecodeByteArray == null) {
                return null;
            }
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
            bitmapDecodeByteArray.recycle();
            return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ShareContentRepo", "generateThumbnailFromBytes: Failed", e);
            return null;
        }
    }

    public final boolean AYXKKw(byte[] bArr) {
        return bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70 && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80;
    }

    public final boolean djBIcL(byte[] bArr) {
        return bArr[0] == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71;
    }

    public final boolean valueOf(byte[] bArr) {
        return bArr[0] == -1 && bArr[1] == -40 && bArr[2] == -1;
    }

    public final boolean OLrzqt(byte[] bArr) {
        return bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70;
    }

    public final boolean AEQbTJ(byte[] bArr) {
        return bArr[0] == 66 && bArr[1] == 77;
    }

    /* JADX INFO: renamed from: o.sNt$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sNt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}

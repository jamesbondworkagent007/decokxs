package o;

import android.media.MediaMetadataRetriever;
import android.view.View;
import androidx.core.content.FileProvider;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.extension.InHouseAndroidXKt$createSendMessageDetailData$1;
import com.okinc.okimcore.extension.InHouseAndroidXKt$createSendMessageDetailData$2;
import com.okinc.okimcore.extension.InHouseAndroidXKt$createSendMessageDetailData$3;
import com.okinc.okimcore.extension.InHouseAndroidXKt$createSendMessageDetailData$4;
import com.okinc.okimcore.extension.InHouseAndroidXKt$createSendMessageDetailData$5;
import com.okinc.okimcore.extension.InHouseAndroidXKt$createSendMessageDetailData$8;
import com.okinc.okimcore.feature.storage.repository.remote.InHouseIMUploadMediaService;
import com.okinc.okimcore.model.exception.MissingMediaPathException;
import com.okinc.okimcore.model.im.MentionedUserInfo;
import com.okinc.okimcore.model.im.OKFileMessage;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKGroupInvitationMessage;
import com.okinc.okimcore.model.im.OKHQVoiceMessage;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMentionedInfo;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKShareMessage;
import com.okinc.okimcore.model.im.OKSightMessage;
import com.okinc.okimcore.model.im.OKStickerMessage;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.im.OKTypingIndicatorMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.InhouseIMAtUser;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaMessageContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths;
import com.okinc.okimcore.model.im.inhouseim.ws.ShareMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta;
import com.okinc.okimcore.model.im.inhouseim.ws.StickerMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.VideoMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.VoiceMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.remote.URLS;
import com.okinc.okimcore.model.remote.UploadMediaResponse;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import com.okinc.okimcore.model.room.inhouseim.MessageStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.JsonElement;
import o.AbstractC43419rot;
import o.sDX;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.sFr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44164sFr {
    public static /* synthetic */ MultipartBody.Part withProgressTracking$default(MultipartBody.Part part, java.lang.String str, long j, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 2) != 0) {
            j = part.body().contentLength();
        }
        return copydefault(part, str, j);
    }

    public static final MultipartBody.Part copydefault(MultipartBody.Part part, final java.lang.String str, long j) throws java.io.IOException {
        if (str == null || str.length() == 0) {
            pUU.EZpvd("FileUploadProgress", "withProgressTracking: skipped (clientMsgId is null/empty)");
            return part;
        }
        long jContentLength = j > 0 ? j : part.body().contentLength();
        pUU.EZpvd("FileUploadProgress", "withProgressTracking: wrapping part for clientMsgId=" + C59454zhO.isConnected(str, 8) + ", knownFileSize=" + j + ", bodyContentLength=" + part.body().contentLength() + ", effectiveTotal=" + jContentLength);
        return MultipartBody.Part.Companion.create(part.headers(), new sNB(part.body(), jContentLength, new Function2() { // from class: o.sFu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C44164sFr.OLrzqt(str, ((java.lang.Long) obj).longValue(), ((java.lang.Long) obj2).longValue());
            }
        }));
    }

    public static final Unit OLrzqt(java.lang.String str, long j, long j2) {
        C44385sNw.KWHzl.KWHzl(str, j, j2);
        return Unit.INSTANCE;
    }

    public static final OKMessageContent AEQbTJ(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity, boolean z) {
        java.lang.String urlPathDefault;
        android.net.Uri uri;
        android.net.Uri uri2;
        OKMessageContent oKMessageContentObtain;
        android.net.Uri uri3;
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        if (z) {
            oKMessageContentObtain = new OKImageMessage();
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) C43386roM.EZpvd.KWHzl(), (java.lang.Object) "CN")) {
                urlPathDefault = inHouseIMMessageEntity.getUrlPathCn();
            } else {
                urlPathDefault = inHouseIMMessageEntity.getUrlPathDefault();
            }
            if (urlPathDefault != null) {
                uri = android.net.Uri.parse(urlPathDefault);
                Intrinsics.checkNotNullExpressionValue(uri, "");
            } else {
                uri = null;
            }
            java.lang.String channelId = inHouseIMMessageEntity.getChannelId();
            long seq = inHouseIMMessageEntity.getSeq();
            java.lang.String localUri = inHouseIMMessageEntity.getLocalUri();
            java.lang.String mediaThumbnail = inHouseIMMessageEntity.getMediaThumbnail();
            C44124sEe.imLogMessageDisplayModel$default(channelId, "[" + seq + "] => [image] => localUri=" + localUri + ", hasThumbnail=" + (mediaThumbnail == null || mediaThumbnail.length() == 0) + ", remoteUri=" + uri, null, 4, null);
            if (inHouseIMMessageEntity.getMediaThumbnail() != null && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) r4))) {
                OKImageMessage oKImageMessage = new OKImageMessage();
                oKImageMessage.setBase64(inHouseIMMessageEntity.getMediaThumbnail());
                java.lang.String localUri2 = inHouseIMMessageEntity.getLocalUri();
                if (localUri2 != null) {
                    uri3 = android.net.Uri.parse(localUri2);
                    Intrinsics.checkNotNullExpressionValue(uri3, "");
                } else {
                    uri3 = null;
                }
                oKImageMessage.setLocalUri(uri3);
                oKImageMessage.setFull(true);
                oKImageMessage.setRemoteUri(uri);
                oKImageMessage.setWidth(inHouseIMMessageEntity.getMediaWidth());
                oKImageMessage.setHeight(inHouseIMMessageEntity.getMediaHeight());
                oKMessageContentObtain = oKImageMessage;
            } else {
                OKGIFMessage.CREATOR creator = OKGIFMessage.CREATOR;
                java.lang.String localUri3 = inHouseIMMessageEntity.getLocalUri();
                if (localUri3 != null) {
                    uri2 = android.net.Uri.parse(localUri3);
                    Intrinsics.checkNotNullExpressionValue(uri2, "");
                } else {
                    uri2 = null;
                }
                oKMessageContentObtain = creator.obtain(uri2, uri);
            }
        }
        if (inHouseIMMessageEntity.getReplySeq() == null) {
            return oKMessageContentObtain;
        }
        InHouseIMMessageEntity quotedMessage = inHouseIMMessageEntity.getQuotedMessage();
        if (quotedMessage != null) {
            java.lang.Integer status = quotedMessage.getStatus();
            int status2 = MessageStatus.Rejected.getStatus();
            if (status != null && status.intValue() == status2) {
                return oKMessageContentObtain;
            }
        }
        OKReferenceMessage.CREATOR creator2 = OKReferenceMessage.CREATOR;
        InHouseIMMessageEntity quotedMessage2 = inHouseIMMessageEntity.getQuotedMessage();
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(quotedMessage2 != null ? quotedMessage2.getSenderUid() : null);
        InHouseIMMessageEntity quotedMessage3 = inHouseIMMessageEntity.getQuotedMessage();
        OKMessageContent oKMessageContent$default = quotedMessage3 != null ? C44169sFw.toOKMessageContent$default(quotedMessage3, false, 1, null) : null;
        InHouseIMMessageEntity quotedMessage4 = inHouseIMMessageEntity.getQuotedMessage();
        OKReferenceMessage oKReferenceMessageObtain = creator2.obtain(strGEmmrt, oKMessageContent$default, quotedMessage4 != null ? C33129mqd.gEmmrt(java.lang.Long.valueOf(quotedMessage4.getSeq())) : null);
        oKReferenceMessageObtain.setOriginalOKMessageContent(oKMessageContentObtain);
        return oKReferenceMessageObtain;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OKMessageContent copydefault(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity, boolean z) {
        ImageMessageData imageMessageDataAhwBna;
        MediaUrlPaths urlPaths;
        java.lang.String str;
        android.net.Uri uri;
        OKImageMessage oKImageMessage;
        JsonElement jsonElementAEQbTJ;
        android.net.Uri uri2;
        ImageMessageData imageMessageDataAhwBna2;
        ImageMessageData imageMessageDataAhwBna3;
        ImageMessageData imageMessageDataAhwBna4;
        ImageMessageData imageMessageDataAhwBna5;
        java.lang.String localUri;
        ImageMessageData imageMessageDataAhwBna6;
        ImageMessageData imageMessageDataAhwBna7;
        ImageMessageData imageMessageDataAhwBna8;
        MediaUrlPaths urlPaths2;
        java.lang.String cn2;
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        java.util.Map<java.lang.String, java.lang.String> mapEZpvd = null;
        mapEZpvd = null;
        if (z) {
            OKShareMessage oKShareMessage = new OKShareMessage();
            ShareMessageData shareMessage = inHouseIMMessageEntity.getShareMessage();
            oKShareMessage.setMessagePreview(shareMessage != null ? shareMessage.AYXKKw() : null);
            return oKShareMessage;
        }
        if (Intrinsics.EZpvd((java.lang.Object) C43386roM.EZpvd.KWHzl(), (java.lang.Object) "CN")) {
            ShareMessageData shareMessage2 = inHouseIMMessageEntity.getShareMessage();
            if (shareMessage2 == null || (imageMessageDataAhwBna8 = shareMessage2.AhwBna()) == null || (urlPaths2 = imageMessageDataAhwBna8.getUrlPaths()) == null || (cn2 = urlPaths2.getCN()) == null) {
                uri = null;
            } else {
                uri = android.net.Uri.parse(cn2);
                Intrinsics.checkNotNullExpressionValue(uri, "");
            }
        } else {
            ShareMessageData shareMessage3 = inHouseIMMessageEntity.getShareMessage();
            if (shareMessage3 != null && (imageMessageDataAhwBna = shareMessage3.AhwBna()) != null && (urlPaths = imageMessageDataAhwBna.getUrlPaths()) != null && (str = urlPaths.getDefault()) != null) {
                uri = android.net.Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(uri, "");
            }
        }
        ShareMessageData shareMessage4 = inHouseIMMessageEntity.getShareMessage();
        java.lang.String thumbnail = (shareMessage4 == null || (imageMessageDataAhwBna7 = shareMessage4.AhwBna()) == null) ? null : imageMessageDataAhwBna7.getThumbnail();
        java.lang.String channelId = inHouseIMMessageEntity.getChannelId();
        long seq = inHouseIMMessageEntity.getSeq();
        ShareMessageData shareMessage5 = inHouseIMMessageEntity.getShareMessage();
        java.lang.String localUri2 = (shareMessage5 == null || (imageMessageDataAhwBna6 = shareMessage5.AhwBna()) == null) ? null : imageMessageDataAhwBna6.getLocalUri();
        boolean z2 = thumbnail == null || thumbnail.length() == 0;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("[");
        sb.append(seq);
        sb.append("] => [share] => localUri=");
        sb.append(localUri2);
        sb.append(", hasThumbnail=");
        sb.append(!z2);
        sb.append(", remoteUri=");
        sb.append(uri);
        C44124sEe.imLogMessageDisplayModel$default(channelId, sb.toString(), null, 4, null);
        if (uri != null) {
            OKImageMessage oKImageMessage2 = new OKImageMessage();
            oKImageMessage2.setBase64(thumbnail);
            ShareMessageData shareMessage6 = inHouseIMMessageEntity.getShareMessage();
            if (shareMessage6 == null || (imageMessageDataAhwBna5 = shareMessage6.AhwBna()) == null || (localUri = imageMessageDataAhwBna5.getLocalUri()) == null) {
                uri2 = null;
            } else {
                uri2 = android.net.Uri.parse(localUri);
                Intrinsics.checkNotNullExpressionValue(uri2, "");
            }
            oKImageMessage2.setLocalUri(uri2);
            oKImageMessage2.setFull(true);
            oKImageMessage2.setRemoteUri(uri);
            ShareMessageData shareMessage7 = inHouseIMMessageEntity.getShareMessage();
            oKImageMessage2.setWidth((shareMessage7 == null || (imageMessageDataAhwBna4 = shareMessage7.AhwBna()) == null) ? null : imageMessageDataAhwBna4.getWidth());
            ShareMessageData shareMessage8 = inHouseIMMessageEntity.getShareMessage();
            oKImageMessage2.setHeight((shareMessage8 == null || (imageMessageDataAhwBna3 = shareMessage8.AhwBna()) == null) ? null : imageMessageDataAhwBna3.getHeight());
            ShareMessageData shareMessage9 = inHouseIMMessageEntity.getShareMessage();
            oKImageMessage2.setUrlPaths((shareMessage9 == null || (imageMessageDataAhwBna2 = shareMessage9.AhwBna()) == null) ? null : imageMessageDataAhwBna2.getUrlPaths());
            oKImageMessage = oKImageMessage2;
        } else {
            oKImageMessage = null;
        }
        OKShareMessage.CREATOR creator = OKShareMessage.CREATOR;
        ShareMessageData shareMessage10 = inHouseIMMessageEntity.getShareMessage();
        java.lang.String strGEmmrt = shareMessage10 != null ? shareMessage10.gEmmrt() : null;
        ShareMessageData shareMessage11 = inHouseIMMessageEntity.getShareMessage();
        java.lang.String strCopydefault = shareMessage11 != null ? shareMessage11.copydefault() : null;
        ShareMessageData shareMessage12 = inHouseIMMessageEntity.getShareMessage();
        java.lang.String strAYXKKw = shareMessage12 != null ? shareMessage12.AYXKKw() : null;
        ShareMessageData shareMessage13 = inHouseIMMessageEntity.getShareMessage();
        java.lang.String strOLrzqt = shareMessage13 != null ? shareMessage13.OLrzqt() : null;
        ShareMessageData shareMessage14 = inHouseIMMessageEntity.getShareMessage();
        java.lang.String strDjBIcL = shareMessage14 != null ? shareMessage14.djBIcL() : null;
        ShareMessageData shareMessage15 = inHouseIMMessageEntity.getShareMessage();
        java.lang.String strValueOf = shareMessage15 != null ? shareMessage15.valueOf() : null;
        ShareMessageData shareMessage16 = inHouseIMMessageEntity.getShareMessage();
        java.lang.Integer numKWHzl = shareMessage16 != null ? shareMessage16.KWHzl() : null;
        ShareMessageData shareMessage17 = inHouseIMMessageEntity.getShareMessage();
        java.lang.String strEZpvd = shareMessage17 != null ? shareMessage17.EZpvd() : null;
        ShareMessageData shareMessage18 = inHouseIMMessageEntity.getShareMessage();
        if (shareMessage18 != null && (jsonElementAEQbTJ = shareMessage18.AEQbTJ()) != null) {
            mapEZpvd = C44170sFx.EZpvd(jsonElementAEQbTJ);
        }
        return creator.obtain(strGEmmrt, strCopydefault, strAYXKKw, oKImageMessage, strOLrzqt, strDjBIcL, strValueOf, numKWHzl, strEZpvd, mapEZpvd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r2.intValue() != r15) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OKMessageContent EZpvd(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity, boolean z) {
        android.net.Uri uri;
        android.net.Uri uri2;
        android.net.Uri uri3;
        java.lang.String localUri;
        android.net.Uri uri4;
        OKSightMessage oKSightMessage;
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        if (inHouseIMMessageEntity.getReplySeq() != null) {
            InHouseIMMessageEntity quotedMessage = inHouseIMMessageEntity.getQuotedMessage();
            if (quotedMessage != null) {
                java.lang.Integer status = quotedMessage.getStatus();
                int status2 = MessageStatus.Rejected.getStatus();
                if (status != null) {
                }
            }
            OKReferenceMessage.CREATOR creator = OKReferenceMessage.CREATOR;
            InHouseIMMessageEntity quotedMessage2 = inHouseIMMessageEntity.getQuotedMessage();
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(quotedMessage2 != null ? quotedMessage2.getSenderUid() : null);
            InHouseIMMessageEntity quotedMessage3 = inHouseIMMessageEntity.getQuotedMessage();
            OKMessageContent oKMessageContent$default = quotedMessage3 != null ? C44169sFw.toOKMessageContent$default(quotedMessage3, false, 1, null) : null;
            InHouseIMMessageEntity quotedMessage4 = inHouseIMMessageEntity.getQuotedMessage();
            OKReferenceMessage oKReferenceMessageObtain = creator.obtain(strGEmmrt, oKMessageContent$default, quotedMessage4 != null ? C33129mqd.gEmmrt(java.lang.Long.valueOf(quotedMessage4.getSeq())) : null);
            if (z) {
                oKSightMessage = new OKSightMessage();
            } else if (!Intrinsics.EZpvd((java.lang.Object) C43386roM.EZpvd.KWHzl(), (java.lang.Object) "CN")) {
                java.lang.String urlPathDefault = inHouseIMMessageEntity.getUrlPathDefault();
                if (urlPathDefault != null) {
                    uri3 = android.net.Uri.parse(urlPathDefault);
                    Intrinsics.checkNotNullExpressionValue(uri3, "");
                }
                java.lang.String channelId = inHouseIMMessageEntity.getChannelId();
                java.lang.String channelId2 = inHouseIMMessageEntity.getChannelId();
                long seq = inHouseIMMessageEntity.getSeq();
                java.lang.String localUri2 = inHouseIMMessageEntity.getLocalUri();
                java.lang.String mediaThumbnail = inHouseIMMessageEntity.getMediaThumbnail();
                if (mediaThumbnail != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("conversation[");
                    sb.append(channelId2);
                    sb.append("][");
                    sb.append(seq);
                    sb.append("] => [Video] => localUri=");
                    sb.append(localUri2);
                    sb.append(", hasThumbnail=");
                    sb.append(!z);
                    sb.append(", remoteUri=");
                    sb.append(uri3);
                    C44124sEe.imLogMessageDisplayModel$default(channelId, sb.toString(), null, 4, null);
                    OKSightMessage oKSightMessage2 = new OKSightMessage();
                    oKSightMessage2.setOriginal(true);
                    oKSightMessage2.setBase64(inHouseIMMessageEntity.getMediaThumbnail());
                    java.lang.Integer mediaDuration = inHouseIMMessageEntity.getMediaDuration();
                    oKSightMessage2.setDuration(mediaDuration == null ? mediaDuration.intValue() : 0);
                    java.lang.Long mediaSize = inHouseIMMessageEntity.getMediaSize();
                    oKSightMessage2.setSize(mediaSize == null ? mediaSize.longValue() : 0L);
                    oKSightMessage2.setRemoteUri(uri3);
                    localUri = inHouseIMMessageEntity.getLocalUri();
                    if (localUri == null) {
                    }
                    oKSightMessage2.setLocalUri(uri4);
                    oKSightMessage = oKSightMessage2;
                }
            } else {
                java.lang.String urlPathCn = inHouseIMMessageEntity.getUrlPathCn();
                if (urlPathCn != null) {
                    uri3 = android.net.Uri.parse(urlPathCn);
                    Intrinsics.checkNotNullExpressionValue(uri3, "");
                } else {
                    uri3 = null;
                }
                java.lang.String channelId3 = inHouseIMMessageEntity.getChannelId();
                java.lang.String channelId22 = inHouseIMMessageEntity.getChannelId();
                long seq2 = inHouseIMMessageEntity.getSeq();
                java.lang.String localUri22 = inHouseIMMessageEntity.getLocalUri();
                java.lang.String mediaThumbnail2 = inHouseIMMessageEntity.getMediaThumbnail();
                boolean z2 = mediaThumbnail2 != null || mediaThumbnail2.length() == 0;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append("conversation[");
                sb2.append(channelId22);
                sb2.append("][");
                sb2.append(seq2);
                sb2.append("] => [Video] => localUri=");
                sb2.append(localUri22);
                sb2.append(", hasThumbnail=");
                sb2.append(!z2);
                sb2.append(", remoteUri=");
                sb2.append(uri3);
                C44124sEe.imLogMessageDisplayModel$default(channelId3, sb2.toString(), null, 4, null);
                OKSightMessage oKSightMessage22 = new OKSightMessage();
                oKSightMessage22.setOriginal(true);
                oKSightMessage22.setBase64(inHouseIMMessageEntity.getMediaThumbnail());
                java.lang.Integer mediaDuration2 = inHouseIMMessageEntity.getMediaDuration();
                oKSightMessage22.setDuration(mediaDuration2 == null ? mediaDuration2.intValue() : 0);
                java.lang.Long mediaSize2 = inHouseIMMessageEntity.getMediaSize();
                oKSightMessage22.setSize(mediaSize2 == null ? mediaSize2.longValue() : 0L);
                oKSightMessage22.setRemoteUri(uri3);
                localUri = inHouseIMMessageEntity.getLocalUri();
                if (localUri == null) {
                    uri4 = android.net.Uri.parse(localUri);
                    Intrinsics.checkNotNullExpressionValue(uri4, "");
                } else {
                    uri4 = null;
                }
                oKSightMessage22.setLocalUri(uri4);
                oKSightMessage = oKSightMessage22;
            }
            oKReferenceMessageObtain.setOriginalOKMessageContent(oKSightMessage);
            return oKReferenceMessageObtain;
        }
        if (z) {
            return new OKSightMessage();
        }
        if (Intrinsics.EZpvd((java.lang.Object) C43386roM.EZpvd.KWHzl(), (java.lang.Object) "CN")) {
            java.lang.String urlPathCn2 = inHouseIMMessageEntity.getUrlPathCn();
            if (urlPathCn2 != null) {
                uri = android.net.Uri.parse(urlPathCn2);
                Intrinsics.checkNotNullExpressionValue(uri, "");
            } else {
                uri = null;
            }
        } else {
            java.lang.String urlPathDefault2 = inHouseIMMessageEntity.getUrlPathDefault();
            if (urlPathDefault2 != null) {
                uri = android.net.Uri.parse(urlPathDefault2);
                Intrinsics.checkNotNullExpressionValue(uri, "");
            }
        }
        java.lang.String channelId4 = inHouseIMMessageEntity.getChannelId();
        java.lang.String channelId5 = inHouseIMMessageEntity.getChannelId();
        long seq3 = inHouseIMMessageEntity.getSeq();
        java.lang.String localUri3 = inHouseIMMessageEntity.getLocalUri();
        java.lang.String mediaThumbnail3 = inHouseIMMessageEntity.getMediaThumbnail();
        boolean z3 = mediaThumbnail3 == null || mediaThumbnail3.length() == 0;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append("conversation[");
        sb3.append(channelId5);
        sb3.append("][");
        sb3.append(seq3);
        sb3.append("] => [Video] => localUri=");
        sb3.append(localUri3);
        sb3.append(", hasThumbnail=");
        sb3.append(!z3);
        sb3.append(", remoteUri=");
        sb3.append(uri);
        C44124sEe.imLogMessageDisplayModel$default(channelId4, sb3.toString(), null, 4, null);
        OKSightMessage oKSightMessage3 = new OKSightMessage();
        oKSightMessage3.setOriginal(true);
        oKSightMessage3.setBase64(inHouseIMMessageEntity.getMediaThumbnail());
        java.lang.Integer mediaDuration3 = inHouseIMMessageEntity.getMediaDuration();
        oKSightMessage3.setDuration(mediaDuration3 != null ? mediaDuration3.intValue() : 0);
        java.lang.Long mediaSize3 = inHouseIMMessageEntity.getMediaSize();
        oKSightMessage3.setSize(mediaSize3 != null ? mediaSize3.longValue() : 0L);
        oKSightMessage3.setRemoteUri(uri);
        java.lang.String localUri4 = inHouseIMMessageEntity.getLocalUri();
        if (localUri4 != null) {
            uri2 = android.net.Uri.parse(localUri4);
            Intrinsics.checkNotNullExpressionValue(uri2, "");
        } else {
            uri2 = null;
        }
        oKSightMessage3.setLocalUri(uri2);
        return oKSightMessage3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OKMessageContent OLrzqt(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity) {
        android.net.Uri uri;
        OKMessageContent oKMessageContent;
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        android.net.Uri uri2 = null;
        if (Intrinsics.EZpvd((java.lang.Object) C43386roM.EZpvd.KWHzl(), (java.lang.Object) "CN")) {
            java.lang.String urlPathCn = inHouseIMMessageEntity.getUrlPathCn();
            if (urlPathCn != null) {
                uri = android.net.Uri.parse(urlPathCn);
                Intrinsics.checkNotNullExpressionValue(uri, "");
            } else {
                uri = null;
            }
        } else {
            java.lang.String urlPathDefault = inHouseIMMessageEntity.getUrlPathDefault();
            if (urlPathDefault != null) {
                uri = android.net.Uri.parse(urlPathDefault);
                Intrinsics.checkNotNullExpressionValue(uri, "");
            }
        }
        java.lang.Integer mediaDuration = inHouseIMMessageEntity.getMediaDuration();
        int iIntValue = mediaDuration != null ? mediaDuration.intValue() : 0;
        C44124sEe.imLogMessageDisplayModel$default(inHouseIMMessageEntity.getChannelId(), "conversation[" + inHouseIMMessageEntity.getChannelId() + "][" + inHouseIMMessageEntity.getSeq() + "] => [Audio] => localUri=" + inHouseIMMessageEntity.getLocalUri() + ", remoteUri=" + uri, null, 4, null);
        if (inHouseIMMessageEntity.getReplySeq() == null) {
            OKHQVoiceMessage oKHQVoiceMessage = new OKHQVoiceMessage();
            oKHQVoiceMessage.setRemoteUri(uri);
            oKHQVoiceMessage.setDuration(iIntValue);
            java.lang.String localUri = inHouseIMMessageEntity.getLocalUri();
            if (localUri != null) {
                uri2 = android.net.Uri.parse(localUri);
                Intrinsics.checkNotNullExpressionValue(uri2, "");
            }
            oKHQVoiceMessage.setLocalUri(uri2);
            oKMessageContent = oKHQVoiceMessage;
        } else {
            OKReferenceMessage.CREATOR creator = OKReferenceMessage.CREATOR;
            InHouseIMMessageEntity quotedMessage = inHouseIMMessageEntity.getQuotedMessage();
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(quotedMessage != null ? quotedMessage.getSenderUid() : null);
            InHouseIMMessageEntity quotedMessage2 = inHouseIMMessageEntity.getQuotedMessage();
            OKMessageContent oKMessageContent$default = quotedMessage2 != null ? C44169sFw.toOKMessageContent$default(quotedMessage2, false, 1, null) : null;
            InHouseIMMessageEntity quotedMessage3 = inHouseIMMessageEntity.getQuotedMessage();
            OKReferenceMessage oKReferenceMessageObtain = creator.obtain(strGEmmrt, oKMessageContent$default, quotedMessage3 != null ? C33129mqd.gEmmrt(java.lang.Long.valueOf(quotedMessage3.getSeq())) : null);
            OKHQVoiceMessage oKHQVoiceMessage2 = new OKHQVoiceMessage();
            oKHQVoiceMessage2.setRemoteUri(uri);
            oKHQVoiceMessage2.setDuration(iIntValue);
            java.lang.String localUri2 = inHouseIMMessageEntity.getLocalUri();
            if (localUri2 != null) {
                uri2 = android.net.Uri.parse(localUri2);
                Intrinsics.checkNotNullExpressionValue(uri2, "");
            }
            oKHQVoiceMessage2.setLocalUri(uri2);
            oKReferenceMessageObtain.setOriginalOKMessageContent(oKHQVoiceMessage2);
            oKMessageContent = oKReferenceMessageObtain;
        }
        return oKMessageContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [257=4] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c1 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #1 {all -> 0x0043, blocks: (B:14:0x003e, B:41:0x01a6, B:43:0x01ae, B:45:0x01b4, B:46:0x01c1), top: B:73:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull WSSendMessageDetailData wSSendMessageDetailData, @NotNull OKGIFMessage oKGIFMessage, InHouseIMUploadMediaService inHouseIMUploadMediaService, boolean z, @NotNull android.content.Context context, @NotNull Continuation<? super WSSendMessageDetailData> continuation) throws java.lang.Throwable {
        InHouseAndroidXKt$createSendMessageDetailData$1 inHouseAndroidXKt$createSendMessageDetailData$1;
        WSSendMessageDetailData wSSendMessageDetailData2;
        InHouseIMUploadMediaService inHouseIMUploadMediaService2;
        android.content.Context context2;
        android.net.Uri uri;
        boolean z2;
        MultipartBody.Part part;
        C44165sFs c44165sFs;
        C44165sFs c44165sFs2;
        WSSendMessageDetailData wSSendMessageDetailData3;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof InHouseAndroidXKt$createSendMessageDetailData$1) {
            inHouseAndroidXKt$createSendMessageDetailData$1 = (InHouseAndroidXKt$createSendMessageDetailData$1) continuation;
            int i = inHouseAndroidXKt$createSendMessageDetailData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseAndroidXKt$createSendMessageDetailData$1.label = i - Integer.MIN_VALUE;
            } else {
                inHouseAndroidXKt$createSendMessageDetailData$1 = new InHouseAndroidXKt$createSendMessageDetailData$1(continuation);
            }
        }
        java.lang.Object objUploadMediaForSocketMessage = inHouseAndroidXKt$createSendMessageDetailData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseAndroidXKt$createSendMessageDetailData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
            android.net.Uri localUri = oKGIFMessage.getLocalUri();
            C44124sEe.imLogSendMessage$default(wSSendMessageDetailData.getChannelId(), "local uri: " + localUri, null, 4, null);
            if (localUri == null) {
                throw new java.lang.Throwable("Null Uri");
            }
            wSSendMessageDetailData2 = wSSendMessageDetailData;
            inHouseAndroidXKt$createSendMessageDetailData$1.L$0 = wSSendMessageDetailData2;
            inHouseAndroidXKt$createSendMessageDetailData$1.L$1 = inHouseIMUploadMediaService;
            inHouseAndroidXKt$createSendMessageDetailData$1.L$2 = context;
            inHouseAndroidXKt$createSendMessageDetailData$1.L$3 = localUri;
            inHouseAndroidXKt$createSendMessageDetailData$1.Z$0 = z;
            inHouseAndroidXKt$createSendMessageDetailData$1.label = 1;
            java.lang.Object multipartBodyPart$default = sFB.toMultipartBodyPart$default(localUri, context, "file", null, inHouseAndroidXKt$createSendMessageDetailData$1, 4, null);
            if (multipartBodyPart$default == objCopydefault) {
                return objCopydefault;
            }
            inHouseIMUploadMediaService2 = inHouseIMUploadMediaService;
            context2 = context;
            uri = localUri;
            objUploadMediaForSocketMessage = multipartBodyPart$default;
            z2 = z;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c44165sFs2 = (C44165sFs) inHouseAndroidXKt$createSendMessageDetailData$1.L$2;
                    uri = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$1.L$1;
                    wSSendMessageDetailData3 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
                        responseData = (ResponseData) objUploadMediaForSocketMessage;
                        if (responseData.getCode() == 0 || responseData.getData() == null) {
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                        } else {
                            java.lang.Object data = responseData.getData();
                            Intrinsics.copydefault(data);
                            actionBar = new AbstractC43419rot.StateListAnimator(data);
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    }
                    WSSendMessageDetailData wSSendMessageDetailData4 = wSSendMessageDetailData3;
                    UploadMediaResponse uploadMediaResponse = (UploadMediaResponse) actionBar.AEQbTJ();
                    InHouseIMContentType inHouseIMContentType = InHouseIMContentType.Image;
                    URLS urls = uploadMediaResponse.getUrls();
                    java.lang.String cn2 = urls == null ? urls.getCN() : null;
                    URLS urls2 = uploadMediaResponse.getUrls();
                    return wSSendMessageDetailData4.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData4.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData4.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData4.contentType : inHouseIMContentType, ((-17039376) & 8) != 0 ? wSSendMessageDetailData4.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData4.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData4.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData4.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData4.imageMessage : new ImageMessageData((java.lang.String) null, new MediaUrlPaths(cn2, urls2 == null ? urls2.getDefault() : null, (java.lang.String) null, 4, (DefaultConstructorMarker) null), uri.toString(), (java.lang.String) null, c44165sFs2 != null ? C56443yFo.AEQbTJ(c44165sFs2.copydefault()) : null, c44165sFs2 == null ? C56443yFo.AEQbTJ(c44165sFs2.KWHzl()) : null, uploadMediaResponse.getFileId(), 8, (DefaultConstructorMarker) null), ((-17039376) & 256) != 0 ? wSSendMessageDetailData4.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData4.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData4.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData4.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData4.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData4.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData4.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData4.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData4.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData4.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData4.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData4.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData4.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData4.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData4.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData4.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData4.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData4.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData4.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData4.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData4.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData4.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData4.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData4.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData4.reactionDisplay : null);
                }
                z2 = inHouseAndroidXKt$createSendMessageDetailData$1.Z$0;
                MultipartBody.Part part2 = (MultipartBody.Part) inHouseAndroidXKt$createSendMessageDetailData$1.L$3;
                android.net.Uri uri2 = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$1.L$2;
                inHouseIMUploadMediaService2 = (InHouseIMUploadMediaService) inHouseAndroidXKt$createSendMessageDetailData$1.L$1;
                WSSendMessageDetailData wSSendMessageDetailData5 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$1.L$0;
                C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
                wSSendMessageDetailData2 = wSSendMessageDetailData5;
                part = part2;
                uri = uri2;
                c44165sFs = (C44165sFs) objUploadMediaForSocketMessage;
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(wSSendMessageDetailData2.getChannelId());
                java.lang.String string = uri.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                trackMetaDataMediaEvent$default(strGEmmrt, part, string, null, 8, null);
                MultipartBody.Part partWithProgressTracking$default = withProgressTracking$default(part, wSSendMessageDetailData2.getClientMsgId(), 0L, 2, null);
                try {
                    java.lang.String channelId = wSSendMessageDetailData2.getChannelId();
                    inHouseAndroidXKt$createSendMessageDetailData$1.L$0 = wSSendMessageDetailData2;
                    inHouseAndroidXKt$createSendMessageDetailData$1.L$1 = uri;
                    inHouseAndroidXKt$createSendMessageDetailData$1.L$2 = c44165sFs;
                    inHouseAndroidXKt$createSendMessageDetailData$1.L$3 = null;
                    inHouseAndroidXKt$createSendMessageDetailData$1.label = 3;
                    objUploadMediaForSocketMessage = inHouseIMUploadMediaService2.uploadMediaForSocketMessage(partWithProgressTracking$default, channelId, z2, inHouseAndroidXKt$createSendMessageDetailData$1);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    c44165sFs2 = c44165sFs;
                    wSSendMessageDetailData3 = wSSendMessageDetailData2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
                if (objUploadMediaForSocketMessage != objCopydefault) {
                    return objCopydefault;
                }
                c44165sFs2 = c44165sFs;
                wSSendMessageDetailData3 = wSSendMessageDetailData2;
                responseData = (ResponseData) objUploadMediaForSocketMessage;
                if (responseData.getCode() == 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
                WSSendMessageDetailData wSSendMessageDetailData42 = wSSendMessageDetailData3;
                UploadMediaResponse uploadMediaResponse2 = (UploadMediaResponse) actionBar.AEQbTJ();
                InHouseIMContentType inHouseIMContentType2 = InHouseIMContentType.Image;
                URLS urls3 = uploadMediaResponse2.getUrls();
                if (urls3 == null) {
                }
                URLS urls22 = uploadMediaResponse2.getUrls();
                if (c44165sFs2 == null) {
                }
                return wSSendMessageDetailData42.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData42.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData42.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData42.contentType : inHouseIMContentType2, ((-17039376) & 8) != 0 ? wSSendMessageDetailData42.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData42.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData42.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData42.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData42.imageMessage : new ImageMessageData((java.lang.String) null, new MediaUrlPaths(cn2, urls22 == null ? urls22.getDefault() : null, (java.lang.String) null, 4, (DefaultConstructorMarker) null), uri.toString(), (java.lang.String) null, c44165sFs2 != null ? C56443yFo.AEQbTJ(c44165sFs2.copydefault()) : null, c44165sFs2 == null ? C56443yFo.AEQbTJ(c44165sFs2.KWHzl()) : null, uploadMediaResponse2.getFileId(), 8, (DefaultConstructorMarker) null), ((-17039376) & 256) != 0 ? wSSendMessageDetailData42.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData42.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData42.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData42.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData42.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData42.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData42.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData42.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData42.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData42.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData42.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData42.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData42.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData42.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData42.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData42.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData42.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData42.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData42.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData42.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData42.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData42.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData42.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData42.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData42.reactionDisplay : null);
            }
            z2 = inHouseAndroidXKt$createSendMessageDetailData$1.Z$0;
            uri = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$1.L$3;
            context2 = (android.content.Context) inHouseAndroidXKt$createSendMessageDetailData$1.L$2;
            inHouseIMUploadMediaService2 = (InHouseIMUploadMediaService) inHouseAndroidXKt$createSendMessageDetailData$1.L$1;
            WSSendMessageDetailData wSSendMessageDetailData6 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$1.L$0;
            C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
            wSSendMessageDetailData2 = wSSendMessageDetailData6;
        }
        MultipartBody.Part part3 = (MultipartBody.Part) objUploadMediaForSocketMessage;
        if (part3 == null) {
            throw new java.lang.Throwable("Null multipart body");
        }
        if (inHouseIMUploadMediaService2 == null) {
            return wSSendMessageDetailData2.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData2.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData2.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData2.contentType : InHouseIMContentType.Image, ((-17039376) & 8) != 0 ? wSSendMessageDetailData2.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData2.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData2.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData2.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData2.imageMessage : new ImageMessageData((java.lang.String) null, (MediaUrlPaths) null, uri.toString(), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, 120, (DefaultConstructorMarker) null), ((-17039376) & 256) != 0 ? wSSendMessageDetailData2.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData2.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData2.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData2.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData2.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData2.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData2.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData2.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData2.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData2.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData2.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData2.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData2.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData2.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData2.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData2.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData2.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData2.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData2.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData2.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData2.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData2.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData2.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData2.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData2.reactionDisplay : null);
        }
        inHouseAndroidXKt$createSendMessageDetailData$1.L$0 = wSSendMessageDetailData2;
        inHouseAndroidXKt$createSendMessageDetailData$1.L$1 = inHouseIMUploadMediaService2;
        inHouseAndroidXKt$createSendMessageDetailData$1.L$2 = uri;
        inHouseAndroidXKt$createSendMessageDetailData$1.L$3 = part3;
        inHouseAndroidXKt$createSendMessageDetailData$1.Z$0 = z2;
        inHouseAndroidXKt$createSendMessageDetailData$1.label = 2;
        java.lang.Object objAYXKKw = sFB.AYXKKw(uri, context2, inHouseAndroidXKt$createSendMessageDetailData$1);
        if (objAYXKKw == objCopydefault) {
            return objCopydefault;
        }
        part = part3;
        objUploadMediaForSocketMessage = objAYXKKw;
        c44165sFs = (C44165sFs) objUploadMediaForSocketMessage;
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(wSSendMessageDetailData2.getChannelId());
        java.lang.String string2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        trackMetaDataMediaEvent$default(strGEmmrt2, part, string2, null, 8, null);
        MultipartBody.Part partWithProgressTracking$default2 = withProgressTracking$default(part, wSSendMessageDetailData2.getClientMsgId(), 0L, 2, null);
        java.lang.String channelId2 = wSSendMessageDetailData2.getChannelId();
        inHouseAndroidXKt$createSendMessageDetailData$1.L$0 = wSSendMessageDetailData2;
        inHouseAndroidXKt$createSendMessageDetailData$1.L$1 = uri;
        inHouseAndroidXKt$createSendMessageDetailData$1.L$2 = c44165sFs;
        inHouseAndroidXKt$createSendMessageDetailData$1.L$3 = null;
        inHouseAndroidXKt$createSendMessageDetailData$1.label = 3;
        objUploadMediaForSocketMessage = inHouseIMUploadMediaService2.uploadMediaForSocketMessage(partWithProgressTracking$default2, channelId2, z2, inHouseAndroidXKt$createSendMessageDetailData$1);
        if (objUploadMediaForSocketMessage != objCopydefault) {
        }
    }

    public static final WSSendMessageDetailData AEQbTJ(@NotNull WSSendMessageDetailData wSSendMessageDetailData, @NotNull OKStickerMessage oKStickerMessage) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        Intrinsics.checkNotNullParameter(oKStickerMessage, "");
        java.lang.String stickerId = oKStickerMessage.getStickerId();
        java.lang.String path = oKStickerMessage.getPath();
        if (stickerId == null) {
            throw new java.lang.Throwable("Null stickerId");
        }
        if (path == null || path.length() == 0) {
            throw new java.lang.Throwable("Null path");
        }
        return wSSendMessageDetailData.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData.contentType : InHouseIMContentType.STICKER, ((-17039376) & 8) != 0 ? wSSendMessageDetailData.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData.stickerMessage : new StickerMessageData(stickerId, path, (java.lang.String) null, 4, (DefaultConstructorMarker) null), ((-17039376) & 65536) != 0 ? wSSendMessageDetailData.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData.reactionDisplay : null);
    }

    public static final WSSendMessageDetailData KWHzl(@NotNull WSSendMessageDetailData wSSendMessageDetailData, @NotNull OKTypingIndicatorMessage oKTypingIndicatorMessage) {
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        Intrinsics.checkNotNullParameter(oKTypingIndicatorMessage, "");
        return wSSendMessageDetailData.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData.contentType : InHouseIMContentType.TypingIndicator, ((-17039376) & 8) != 0 ? wSSendMessageDetailData.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData.reactionDisplay : null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.sFB.toBase64Thumbnail$default(android.net.Uri, android.content.Context, int, long, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [354=7] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0152 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0241 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0264 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #0 {all -> 0x0068, blocks: (B:14:0x0063, B:49:0x0245, B:51:0x024d, B:53:0x0253, B:55:0x0264), top: B:84:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x030d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x038d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(@NotNull WSSendMessageDetailData wSSendMessageDetailData, @NotNull OKImageMessage oKImageMessage, InHouseIMUploadMediaService inHouseIMUploadMediaService, boolean z, @NotNull android.content.Context context, @NotNull Continuation<? super WSSendMessageDetailData> continuation) throws java.lang.Throwable {
        InHouseAndroidXKt$createSendMessageDetailData$2 inHouseAndroidXKt$createSendMessageDetailData$2;
        WSSendMessageDetailData wSSendMessageDetailData2;
        InHouseIMUploadMediaService inHouseIMUploadMediaService2;
        java.lang.Object objCompressToJpg$default;
        android.content.Context context2;
        android.net.Uri uri;
        boolean z2;
        java.lang.Object multipartBodyPart$default;
        InHouseIMUploadMediaService inHouseIMUploadMediaService3;
        android.content.Context context3;
        WSSendMessageDetailData wSSendMessageDetailData3;
        android.net.Uri uri2;
        boolean z3;
        MultipartBody.Part part;
        android.content.Context context4;
        android.net.Uri uri3;
        MultipartBody.Part part2;
        InHouseIMContentType inHouseIMContentType;
        android.net.Uri uri4;
        WSSendMessageDetailData wSSendMessageDetailData4;
        C44165sFs c44165sFs;
        android.content.Context context5;
        C44165sFs c44165sFs2;
        WSSendMessageDetailData wSSendMessageDetailData5;
        AbstractC43419rot actionBar;
        android.net.Uri uri5;
        android.content.Context context6;
        C44165sFs c44165sFs3;
        java.lang.Object base64Thumbnail$default;
        MediaUrlPaths mediaUrlPaths;
        C44165sFs c44165sFs4;
        UploadMediaResponse uploadMediaResponse;
        InHouseIMContentType inHouseIMContentType2;
        WSSendMessageDetailData wSSendMessageDetailData6;
        android.net.Uri uri6;
        ResponseData responseData;
        if (continuation instanceof InHouseAndroidXKt$createSendMessageDetailData$2) {
            inHouseAndroidXKt$createSendMessageDetailData$2 = (InHouseAndroidXKt$createSendMessageDetailData$2) continuation;
            int i = inHouseAndroidXKt$createSendMessageDetailData$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseAndroidXKt$createSendMessageDetailData$2.label = i - Integer.MIN_VALUE;
            } else {
                inHouseAndroidXKt$createSendMessageDetailData$2 = new InHouseAndroidXKt$createSendMessageDetailData$2(continuation);
            }
        }
        java.lang.Object objUploadMediaForSocketMessage = inHouseAndroidXKt$createSendMessageDetailData$2.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        switch (inHouseAndroidXKt$createSendMessageDetailData$2.label) {
            case 0:
                C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
                android.net.Uri localUri = oKImageMessage.getLocalUri();
                C44124sEe.imLogSendMessage$default(wSSendMessageDetailData.getChannelId(), "local uri: " + localUri, null, 4, null);
                if (localUri == null) {
                    throw new java.lang.Throwable("Null Uri");
                }
                boolean zIsFull = oKImageMessage.isFull();
                wSSendMessageDetailData2 = wSSendMessageDetailData;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$0 = wSSendMessageDetailData2;
                inHouseIMUploadMediaService2 = inHouseIMUploadMediaService;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$1 = inHouseIMUploadMediaService2;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$2 = context;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$3 = localUri;
                inHouseAndroidXKt$createSendMessageDetailData$2.Z$0 = z;
                inHouseAndroidXKt$createSendMessageDetailData$2.label = 1;
                objCompressToJpg$default = sFB.compressToJpg$default(localUri, context, 0, zIsFull, inHouseAndroidXKt$createSendMessageDetailData$2, 2, null);
                if (objCompressToJpg$default == objCopydefault) {
                    return objCopydefault;
                }
                context2 = context;
                uri = localUri;
                z2 = z;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$0 = wSSendMessageDetailData2;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$1 = inHouseIMUploadMediaService2;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$2 = context2;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$3 = uri;
                inHouseAndroidXKt$createSendMessageDetailData$2.Z$0 = z2;
                inHouseAndroidXKt$createSendMessageDetailData$2.label = 2;
                android.net.Uri uri7 = uri;
                android.content.Context context7 = context2;
                multipartBodyPart$default = sFB.toMultipartBodyPart$default((android.net.Uri) objCompressToJpg$default, context2, "file", null, inHouseAndroidXKt$createSendMessageDetailData$2, 4, null);
                if (multipartBodyPart$default != objCopydefault) {
                    return objCopydefault;
                }
                inHouseIMUploadMediaService3 = inHouseIMUploadMediaService2;
                context3 = context7;
                wSSendMessageDetailData3 = wSSendMessageDetailData2;
                uri2 = uri7;
                z3 = z2;
                objUploadMediaForSocketMessage = multipartBodyPart$default;
                part = (MultipartBody.Part) objUploadMediaForSocketMessage;
                if (part != null) {
                    throw new java.lang.Throwable("Null multipart body");
                }
                if (inHouseIMUploadMediaService3 == null) {
                    InHouseIMContentType inHouseIMContentType3 = InHouseIMContentType.Image;
                    inHouseAndroidXKt$createSendMessageDetailData$2.L$0 = uri2;
                    inHouseAndroidXKt$createSendMessageDetailData$2.L$1 = wSSendMessageDetailData3;
                    inHouseAndroidXKt$createSendMessageDetailData$2.L$2 = inHouseIMContentType3;
                    inHouseAndroidXKt$createSendMessageDetailData$2.L$3 = null;
                    inHouseAndroidXKt$createSendMessageDetailData$2.label = 3;
                    java.lang.Object base64Thumbnail$default2 = sFB.toBase64Thumbnail$default(uri2, context3, 0, 0L, inHouseAndroidXKt$createSendMessageDetailData$2, 6, null);
                    if (base64Thumbnail$default2 == objCopydefault) {
                        return objCopydefault;
                    }
                    inHouseIMContentType = inHouseIMContentType3;
                    objUploadMediaForSocketMessage = base64Thumbnail$default2;
                    uri4 = uri2;
                    wSSendMessageDetailData4 = wSSendMessageDetailData3;
                    return wSSendMessageDetailData4.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData4.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData4.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData4.contentType : inHouseIMContentType, ((-17039376) & 8) != 0 ? wSSendMessageDetailData4.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData4.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData4.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData4.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData4.imageMessage : new ImageMessageData((java.lang.String) objUploadMediaForSocketMessage, (MediaUrlPaths) null, uri4.toString(), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, 120, (DefaultConstructorMarker) null), ((-17039376) & 256) != 0 ? wSSendMessageDetailData4.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData4.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData4.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData4.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData4.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData4.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData4.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData4.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData4.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData4.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData4.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData4.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData4.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData4.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData4.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData4.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData4.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData4.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData4.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData4.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData4.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData4.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData4.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData4.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData4.reactionDisplay : null);
                }
                inHouseAndroidXKt$createSendMessageDetailData$2.L$0 = wSSendMessageDetailData3;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$1 = inHouseIMUploadMediaService3;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$2 = context3;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$3 = uri2;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$4 = part;
                inHouseAndroidXKt$createSendMessageDetailData$2.Z$0 = z3;
                inHouseAndroidXKt$createSendMessageDetailData$2.label = 4;
                java.lang.Object objAYXKKw = sFB.AYXKKw(uri2, context3, inHouseAndroidXKt$createSendMessageDetailData$2);
                if (objAYXKKw == objCopydefault) {
                    return objCopydefault;
                }
                context4 = context3;
                uri3 = uri2;
                part2 = part;
                objUploadMediaForSocketMessage = objAYXKKw;
                c44165sFs = (C44165sFs) objUploadMediaForSocketMessage;
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(wSSendMessageDetailData3.getChannelId());
                java.lang.String string = uri3.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                trackMetaDataMediaEvent$default(strGEmmrt, part2, string, null, 8, null);
                MultipartBody.Part partWithProgressTracking$default = withProgressTracking$default(part2, wSSendMessageDetailData3.getClientMsgId(), 0L, 2, null);
                try {
                    java.lang.String channelId = wSSendMessageDetailData3.getChannelId();
                    inHouseAndroidXKt$createSendMessageDetailData$2.L$0 = wSSendMessageDetailData3;
                    inHouseAndroidXKt$createSendMessageDetailData$2.L$1 = context4;
                    inHouseAndroidXKt$createSendMessageDetailData$2.L$2 = uri3;
                    inHouseAndroidXKt$createSendMessageDetailData$2.L$3 = c44165sFs;
                    inHouseAndroidXKt$createSendMessageDetailData$2.L$4 = null;
                    inHouseAndroidXKt$createSendMessageDetailData$2.label = 5;
                    objUploadMediaForSocketMessage = inHouseIMUploadMediaService3.uploadMediaForSocketMessage(partWithProgressTracking$default, channelId, z3, inHouseAndroidXKt$createSendMessageDetailData$2);
                    break;
                } catch (java.lang.Throwable th) {
                    th = th;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    uri5 = uri3;
                    context6 = context4;
                    c44165sFs3 = c44165sFs;
                }
                if (objUploadMediaForSocketMessage != objCopydefault) {
                    return objCopydefault;
                }
                context5 = context4;
                c44165sFs2 = c44165sFs;
                wSSendMessageDetailData5 = wSSendMessageDetailData3;
                responseData = (ResponseData) objUploadMediaForSocketMessage;
                if (responseData.getCode() == 0 || responseData.getData() == null) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                } else {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                }
                c44165sFs3 = c44165sFs2;
                uri5 = uri3;
                context6 = context5;
                wSSendMessageDetailData3 = wSSendMessageDetailData5;
                UploadMediaResponse uploadMediaResponse2 = (UploadMediaResponse) actionBar.AEQbTJ();
                InHouseIMContentType inHouseIMContentType4 = InHouseIMContentType.Image;
                URLS urls = uploadMediaResponse2.getUrls();
                java.lang.String cn2 = urls == null ? urls.getCN() : null;
                URLS urls2 = uploadMediaResponse2.getUrls();
                MediaUrlPaths mediaUrlPaths2 = new MediaUrlPaths(cn2, urls2 == null ? urls2.getDefault() : null, (java.lang.String) null, 4, (DefaultConstructorMarker) null);
                inHouseAndroidXKt$createSendMessageDetailData$2.L$0 = uri5;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$1 = c44165sFs3;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$2 = uploadMediaResponse2;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$3 = mediaUrlPaths2;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$4 = wSSendMessageDetailData3;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$5 = inHouseIMContentType4;
                inHouseAndroidXKt$createSendMessageDetailData$2.label = 6;
                base64Thumbnail$default = sFB.toBase64Thumbnail$default(uri5, context6, 0, 0L, inHouseAndroidXKt$createSendMessageDetailData$2, 6, null);
                if (base64Thumbnail$default != objCopydefault) {
                    return objCopydefault;
                }
                mediaUrlPaths = mediaUrlPaths2;
                c44165sFs4 = c44165sFs3;
                uploadMediaResponse = uploadMediaResponse2;
                inHouseIMContentType2 = inHouseIMContentType4;
                wSSendMessageDetailData6 = wSSendMessageDetailData3;
                uri6 = uri5;
                objUploadMediaForSocketMessage = base64Thumbnail$default;
                java.lang.String str = (java.lang.String) objUploadMediaForSocketMessage;
                java.lang.String string2 = uri6.toString();
                java.lang.String fileId = uploadMediaResponse.getFileId();
                return wSSendMessageDetailData6.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData6.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData6.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData6.contentType : inHouseIMContentType2, ((-17039376) & 8) != 0 ? wSSendMessageDetailData6.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData6.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData6.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData6.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData6.imageMessage : new ImageMessageData(str, mediaUrlPaths, string2, (java.lang.String) null, c44165sFs4 != null ? C56443yFo.AEQbTJ(c44165sFs4.copydefault()) : null, c44165sFs4 != null ? C56443yFo.AEQbTJ(c44165sFs4.KWHzl()) : null, fileId, 8, (DefaultConstructorMarker) null), ((-17039376) & 256) != 0 ? wSSendMessageDetailData6.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData6.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData6.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData6.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData6.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData6.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData6.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData6.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData6.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData6.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData6.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData6.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData6.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData6.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData6.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData6.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData6.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData6.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData6.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData6.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData6.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData6.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData6.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData6.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData6.reactionDisplay : null);
            case 1:
                boolean z4 = inHouseAndroidXKt$createSendMessageDetailData$2.Z$0;
                android.net.Uri uri8 = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$2.L$3;
                android.content.Context context8 = (android.content.Context) inHouseAndroidXKt$createSendMessageDetailData$2.L$2;
                InHouseIMUploadMediaService inHouseIMUploadMediaService4 = (InHouseIMUploadMediaService) inHouseAndroidXKt$createSendMessageDetailData$2.L$1;
                WSSendMessageDetailData wSSendMessageDetailData7 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$2.L$0;
                C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
                uri = uri8;
                context2 = context8;
                inHouseIMUploadMediaService2 = inHouseIMUploadMediaService4;
                wSSendMessageDetailData2 = wSSendMessageDetailData7;
                objCompressToJpg$default = objUploadMediaForSocketMessage;
                z2 = z4;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$0 = wSSendMessageDetailData2;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$1 = inHouseIMUploadMediaService2;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$2 = context2;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$3 = uri;
                inHouseAndroidXKt$createSendMessageDetailData$2.Z$0 = z2;
                inHouseAndroidXKt$createSendMessageDetailData$2.label = 2;
                android.net.Uri uri72 = uri;
                android.content.Context context72 = context2;
                multipartBodyPart$default = sFB.toMultipartBodyPart$default((android.net.Uri) objCompressToJpg$default, context2, "file", null, inHouseAndroidXKt$createSendMessageDetailData$2, 4, null);
                if (multipartBodyPart$default != objCopydefault) {
                }
                break;
            case 2:
                z3 = inHouseAndroidXKt$createSendMessageDetailData$2.Z$0;
                android.net.Uri uri9 = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$2.L$3;
                android.content.Context context9 = (android.content.Context) inHouseAndroidXKt$createSendMessageDetailData$2.L$2;
                InHouseIMUploadMediaService inHouseIMUploadMediaService5 = (InHouseIMUploadMediaService) inHouseAndroidXKt$createSendMessageDetailData$2.L$1;
                WSSendMessageDetailData wSSendMessageDetailData8 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$2.L$0;
                C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
                uri2 = uri9;
                context3 = context9;
                wSSendMessageDetailData3 = wSSendMessageDetailData8;
                inHouseIMUploadMediaService3 = inHouseIMUploadMediaService5;
                part = (MultipartBody.Part) objUploadMediaForSocketMessage;
                if (part != null) {
                }
                break;
            case 3:
                InHouseIMContentType inHouseIMContentType5 = (InHouseIMContentType) inHouseAndroidXKt$createSendMessageDetailData$2.L$2;
                WSSendMessageDetailData wSSendMessageDetailData9 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$2.L$1;
                uri4 = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$2.L$0;
                C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
                inHouseIMContentType = inHouseIMContentType5;
                wSSendMessageDetailData4 = wSSendMessageDetailData9;
                return wSSendMessageDetailData4.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData4.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData4.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData4.contentType : inHouseIMContentType, ((-17039376) & 8) != 0 ? wSSendMessageDetailData4.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData4.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData4.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData4.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData4.imageMessage : new ImageMessageData((java.lang.String) objUploadMediaForSocketMessage, (MediaUrlPaths) null, uri4.toString(), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, 120, (DefaultConstructorMarker) null), ((-17039376) & 256) != 0 ? wSSendMessageDetailData4.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData4.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData4.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData4.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData4.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData4.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData4.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData4.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData4.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData4.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData4.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData4.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData4.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData4.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData4.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData4.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData4.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData4.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData4.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData4.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData4.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData4.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData4.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData4.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData4.reactionDisplay : null);
            case 4:
                z3 = inHouseAndroidXKt$createSendMessageDetailData$2.Z$0;
                MultipartBody.Part part3 = (MultipartBody.Part) inHouseAndroidXKt$createSendMessageDetailData$2.L$4;
                android.net.Uri uri10 = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$2.L$3;
                context4 = (android.content.Context) inHouseAndroidXKt$createSendMessageDetailData$2.L$2;
                inHouseIMUploadMediaService3 = (InHouseIMUploadMediaService) inHouseAndroidXKt$createSendMessageDetailData$2.L$1;
                WSSendMessageDetailData wSSendMessageDetailData10 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$2.L$0;
                C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
                wSSendMessageDetailData3 = wSSendMessageDetailData10;
                part2 = part3;
                uri3 = uri10;
                c44165sFs = (C44165sFs) objUploadMediaForSocketMessage;
                java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(wSSendMessageDetailData3.getChannelId());
                java.lang.String string3 = uri3.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "");
                trackMetaDataMediaEvent$default(strGEmmrt2, part2, string3, null, 8, null);
                MultipartBody.Part partWithProgressTracking$default2 = withProgressTracking$default(part2, wSSendMessageDetailData3.getClientMsgId(), 0L, 2, null);
                java.lang.String channelId2 = wSSendMessageDetailData3.getChannelId();
                inHouseAndroidXKt$createSendMessageDetailData$2.L$0 = wSSendMessageDetailData3;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$1 = context4;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$2 = uri3;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$3 = c44165sFs;
                inHouseAndroidXKt$createSendMessageDetailData$2.L$4 = null;
                inHouseAndroidXKt$createSendMessageDetailData$2.label = 5;
                objUploadMediaForSocketMessage = inHouseIMUploadMediaService3.uploadMediaForSocketMessage(partWithProgressTracking$default2, channelId2, z3, inHouseAndroidXKt$createSendMessageDetailData$2);
                if (objUploadMediaForSocketMessage != objCopydefault) {
                }
                break;
            case 5:
                c44165sFs2 = (C44165sFs) inHouseAndroidXKt$createSendMessageDetailData$2.L$3;
                uri3 = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$2.L$2;
                context5 = (android.content.Context) inHouseAndroidXKt$createSendMessageDetailData$2.L$1;
                wSSendMessageDetailData5 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$2.L$0;
                try {
                    C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
                    responseData = (ResponseData) objUploadMediaForSocketMessage;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    c44165sFs = c44165sFs2;
                    wSSendMessageDetailData3 = wSSendMessageDetailData5;
                    context4 = context5;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    uri5 = uri3;
                    context6 = context4;
                    c44165sFs3 = c44165sFs;
                }
                if (responseData.getCode() == 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    c44165sFs3 = c44165sFs2;
                    uri5 = uri3;
                    context6 = context5;
                    wSSendMessageDetailData3 = wSSendMessageDetailData5;
                    UploadMediaResponse uploadMediaResponse22 = (UploadMediaResponse) actionBar.AEQbTJ();
                    InHouseIMContentType inHouseIMContentType42 = InHouseIMContentType.Image;
                    URLS urls3 = uploadMediaResponse22.getUrls();
                    if (urls3 == null) {
                    }
                    URLS urls22 = uploadMediaResponse22.getUrls();
                    MediaUrlPaths mediaUrlPaths22 = new MediaUrlPaths(cn2, urls22 == null ? urls22.getDefault() : null, (java.lang.String) null, 4, (DefaultConstructorMarker) null);
                    inHouseAndroidXKt$createSendMessageDetailData$2.L$0 = uri5;
                    inHouseAndroidXKt$createSendMessageDetailData$2.L$1 = c44165sFs3;
                    inHouseAndroidXKt$createSendMessageDetailData$2.L$2 = uploadMediaResponse22;
                    inHouseAndroidXKt$createSendMessageDetailData$2.L$3 = mediaUrlPaths22;
                    inHouseAndroidXKt$createSendMessageDetailData$2.L$4 = wSSendMessageDetailData3;
                    inHouseAndroidXKt$createSendMessageDetailData$2.L$5 = inHouseIMContentType42;
                    inHouseAndroidXKt$createSendMessageDetailData$2.label = 6;
                    base64Thumbnail$default = sFB.toBase64Thumbnail$default(uri5, context6, 0, 0L, inHouseAndroidXKt$createSendMessageDetailData$2, 6, null);
                    if (base64Thumbnail$default != objCopydefault) {
                    }
                }
                java.lang.String str2 = (java.lang.String) objUploadMediaForSocketMessage;
                java.lang.String string22 = uri6.toString();
                java.lang.String fileId2 = uploadMediaResponse.getFileId();
                if (c44165sFs4 != null) {
                }
                if (c44165sFs4 != null) {
                }
                return wSSendMessageDetailData6.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData6.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData6.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData6.contentType : inHouseIMContentType2, ((-17039376) & 8) != 0 ? wSSendMessageDetailData6.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData6.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData6.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData6.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData6.imageMessage : new ImageMessageData(str2, mediaUrlPaths, string22, (java.lang.String) null, c44165sFs4 != null ? C56443yFo.AEQbTJ(c44165sFs4.copydefault()) : null, c44165sFs4 != null ? C56443yFo.AEQbTJ(c44165sFs4.KWHzl()) : null, fileId2, 8, (DefaultConstructorMarker) null), ((-17039376) & 256) != 0 ? wSSendMessageDetailData6.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData6.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData6.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData6.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData6.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData6.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData6.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData6.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData6.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData6.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData6.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData6.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData6.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData6.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData6.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData6.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData6.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData6.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData6.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData6.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData6.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData6.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData6.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData6.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData6.reactionDisplay : null);
            case 6:
                InHouseIMContentType inHouseIMContentType6 = (InHouseIMContentType) inHouseAndroidXKt$createSendMessageDetailData$2.L$5;
                WSSendMessageDetailData wSSendMessageDetailData11 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$2.L$4;
                mediaUrlPaths = (MediaUrlPaths) inHouseAndroidXKt$createSendMessageDetailData$2.L$3;
                uploadMediaResponse = (UploadMediaResponse) inHouseAndroidXKt$createSendMessageDetailData$2.L$2;
                c44165sFs4 = (C44165sFs) inHouseAndroidXKt$createSendMessageDetailData$2.L$1;
                uri6 = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$2.L$0;
                C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
                inHouseIMContentType2 = inHouseIMContentType6;
                wSSendMessageDetailData6 = wSSendMessageDetailData11;
                java.lang.String str22 = (java.lang.String) objUploadMediaForSocketMessage;
                java.lang.String string222 = uri6.toString();
                java.lang.String fileId22 = uploadMediaResponse.getFileId();
                if (c44165sFs4 != null) {
                }
                if (c44165sFs4 != null) {
                }
                return wSSendMessageDetailData6.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData6.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData6.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData6.contentType : inHouseIMContentType2, ((-17039376) & 8) != 0 ? wSSendMessageDetailData6.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData6.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData6.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData6.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData6.imageMessage : new ImageMessageData(str22, mediaUrlPaths, string222, (java.lang.String) null, c44165sFs4 != null ? C56443yFo.AEQbTJ(c44165sFs4.copydefault()) : null, c44165sFs4 != null ? C56443yFo.AEQbTJ(c44165sFs4.KWHzl()) : null, fileId22, 8, (DefaultConstructorMarker) null), ((-17039376) & 256) != 0 ? wSSendMessageDetailData6.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData6.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData6.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData6.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData6.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData6.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData6.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData6.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData6.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData6.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData6.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData6.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData6.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData6.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData6.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData6.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData6.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData6.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData6.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData6.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData6.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData6.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData6.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData6.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData6.reactionDisplay : null);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [427=4] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0201 A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:18:0x007c, B:47:0x01e2, B:49:0x01ea, B:51:0x01f0, B:53:0x0201), top: B:74:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(@NotNull WSSendMessageDetailData wSSendMessageDetailData, @NotNull OKSightMessage oKSightMessage, InHouseIMUploadMediaService inHouseIMUploadMediaService, boolean z, @NotNull android.content.Context context, @NotNull Continuation<? super WSSendMessageDetailData> continuation) throws java.lang.Throwable {
        InHouseAndroidXKt$createSendMessageDetailData$3 inHouseAndroidXKt$createSendMessageDetailData$3;
        android.net.Uri localUri;
        InHouseIMUploadMediaService inHouseIMUploadMediaService2;
        android.content.Context context2;
        android.net.Uri uri;
        boolean z2;
        WSSendMessageDetailData wSSendMessageDetailData2;
        java.io.File file;
        int iOLrzqt;
        java.lang.Object objUploadMediaForSocketMessage;
        java.io.File file2;
        WSSendMessageDetailData wSSendMessageDetailData3;
        android.net.Uri uri2;
        int i;
        InHouseIMContentType inHouseIMContentType;
        java.io.File file3;
        WSSendMessageDetailData wSSendMessageDetailData4;
        int i2;
        AbstractC43419rot actionBar;
        android.content.Context context3;
        java.lang.Object base64Thumbnail$default;
        java.io.File file4;
        InHouseIMContentType inHouseIMContentType2;
        WSSendMessageDetailData wSSendMessageDetailData5;
        android.net.Uri uri3;
        UploadMediaResponse uploadMediaResponse;
        MediaUrlPaths mediaUrlPaths;
        int i3;
        ResponseData responseData;
        if (continuation instanceof InHouseAndroidXKt$createSendMessageDetailData$3) {
            inHouseAndroidXKt$createSendMessageDetailData$3 = (InHouseAndroidXKt$createSendMessageDetailData$3) continuation;
            int i4 = inHouseAndroidXKt$createSendMessageDetailData$3.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                inHouseAndroidXKt$createSendMessageDetailData$3.label = i4 - Integer.MIN_VALUE;
            } else {
                inHouseAndroidXKt$createSendMessageDetailData$3 = new InHouseAndroidXKt$createSendMessageDetailData$3(continuation);
            }
        }
        InHouseAndroidXKt$createSendMessageDetailData$3 inHouseAndroidXKt$createSendMessageDetailData$32 = inHouseAndroidXKt$createSendMessageDetailData$3;
        java.lang.Object obj = inHouseAndroidXKt$createSendMessageDetailData$32.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i5 = inHouseAndroidXKt$createSendMessageDetailData$32.label;
        if (i5 == 0) {
            C56391yDq.AEQbTJ(obj);
            localUri = oKSightMessage.getLocalUri();
            if (localUri == null) {
                inHouseIMUploadMediaService2 = inHouseIMUploadMediaService;
                context2 = context;
                uri = localUri;
                z2 = z;
                wSSendMessageDetailData2 = wSSendMessageDetailData;
                file = null;
                C44124sEe.imLogSendMessage$default(wSSendMessageDetailData2.getChannelId(), "local uri: " + uri + " and localPath: " + file, null, 4, null);
                if (uri != null || file == null) {
                    throw new java.lang.Throwable("Null multipart body");
                }
                iOLrzqt = OLrzqt(file, false);
                if (inHouseIMUploadMediaService2 == null) {
                    InHouseIMContentType inHouseIMContentType3 = InHouseIMContentType.Video;
                    inHouseAndroidXKt$createSendMessageDetailData$32.L$0 = uri;
                    inHouseAndroidXKt$createSendMessageDetailData$32.L$1 = file;
                    inHouseAndroidXKt$createSendMessageDetailData$32.L$2 = wSSendMessageDetailData2;
                    inHouseAndroidXKt$createSendMessageDetailData$32.L$3 = inHouseIMContentType3;
                    inHouseAndroidXKt$createSendMessageDetailData$32.I$0 = iOLrzqt;
                    inHouseAndroidXKt$createSendMessageDetailData$32.label = 2;
                    java.lang.Object base64Thumbnail$default2 = sFB.toBase64Thumbnail$default(uri, context2, 0, 0L, inHouseAndroidXKt$createSendMessageDetailData$32, 6, null);
                    if (base64Thumbnail$default2 == objCopydefault) {
                        return objCopydefault;
                    }
                    inHouseIMContentType = inHouseIMContentType3;
                    file3 = file;
                    obj = base64Thumbnail$default2;
                    wSSendMessageDetailData4 = wSSendMessageDetailData2;
                    i2 = iOLrzqt;
                    return wSSendMessageDetailData4.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData4.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData4.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData4.contentType : inHouseIMContentType, ((-17039376) & 8) != 0 ? wSSendMessageDetailData4.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData4.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData4.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData4.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData4.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData4.videoMessage : new VideoMessageData((java.lang.String) obj, (MediaUrlPaths) null, C56443yFo.AEQbTJ(i2), C56443yFo.KWHzl(file3.length()), uri.toString(), (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null), ((-17039376) & 512) != 0 ? wSSendMessageDetailData4.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData4.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData4.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData4.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData4.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData4.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData4.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData4.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData4.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData4.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData4.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData4.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData4.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData4.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData4.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData4.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData4.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData4.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData4.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData4.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData4.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData4.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData4.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData4.reactionDisplay : null);
                }
                MultipartBody.Part partCopydefault = copydefault(file, "file");
                java.lang.String path = file.getPath();
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(wSSendMessageDetailData2.getChannelId());
                Intrinsics.copydefault((java.lang.Object) path);
                AEQbTJ(strGEmmrt, partCopydefault, path, C33129mqd.gEmmrt(C56443yFo.AEQbTJ(iOLrzqt)));
                MultipartBody.Part partWithProgressTracking$default = withProgressTracking$default(partCopydefault, wSSendMessageDetailData2.getClientMsgId(), 0L, 2, null);
                try {
                    java.lang.String channelId = wSSendMessageDetailData2.getChannelId();
                    inHouseAndroidXKt$createSendMessageDetailData$32.L$0 = wSSendMessageDetailData2;
                    inHouseAndroidXKt$createSendMessageDetailData$32.L$1 = context2;
                    inHouseAndroidXKt$createSendMessageDetailData$32.L$2 = uri;
                    inHouseAndroidXKt$createSendMessageDetailData$32.L$3 = file;
                    inHouseAndroidXKt$createSendMessageDetailData$32.I$0 = iOLrzqt;
                    inHouseAndroidXKt$createSendMessageDetailData$32.label = 3;
                    objUploadMediaForSocketMessage = inHouseIMUploadMediaService2.uploadMediaForSocketMessage(partWithProgressTracking$default, channelId, z2, inHouseAndroidXKt$createSendMessageDetailData$32);
                } catch (java.lang.Throwable th) {
                    th = th;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    context3 = context2;
                    wSSendMessageDetailData3 = wSSendMessageDetailData2;
                }
                if (objUploadMediaForSocketMessage == objCopydefault) {
                    return objCopydefault;
                }
                file2 = file;
                wSSendMessageDetailData3 = wSSendMessageDetailData2;
                uri2 = uri;
                i = iOLrzqt;
                obj = objUploadMediaForSocketMessage;
                responseData = (ResponseData) obj;
                if (responseData.getCode() == 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    iOLrzqt = i;
                    file = file2;
                    uri = uri2;
                    context3 = context2;
                    UploadMediaResponse uploadMediaResponse2 = (UploadMediaResponse) actionBar.AEQbTJ();
                    InHouseIMContentType inHouseIMContentType4 = InHouseIMContentType.Video;
                    URLS urls = uploadMediaResponse2.getUrls();
                    if (urls == null) {
                    }
                    URLS urls2 = uploadMediaResponse2.getUrls();
                    MediaUrlPaths mediaUrlPaths2 = new MediaUrlPaths(cn, urls2 == null ? urls2.getDefault() : null, (java.lang.String) null, 4, (DefaultConstructorMarker) null);
                    inHouseAndroidXKt$createSendMessageDetailData$32.L$0 = uri;
                    inHouseAndroidXKt$createSendMessageDetailData$32.L$1 = file;
                    inHouseAndroidXKt$createSendMessageDetailData$32.L$2 = uploadMediaResponse2;
                    inHouseAndroidXKt$createSendMessageDetailData$32.L$3 = mediaUrlPaths2;
                    inHouseAndroidXKt$createSendMessageDetailData$32.L$4 = wSSendMessageDetailData3;
                    inHouseAndroidXKt$createSendMessageDetailData$32.L$5 = inHouseIMContentType4;
                    inHouseAndroidXKt$createSendMessageDetailData$32.I$0 = iOLrzqt;
                    inHouseAndroidXKt$createSendMessageDetailData$32.label = 4;
                    base64Thumbnail$default = sFB.toBase64Thumbnail$default(uri, context3, 0, 0L, inHouseAndroidXKt$createSendMessageDetailData$32, 6, null);
                    if (base64Thumbnail$default != objCopydefault) {
                    }
                }
                return wSSendMessageDetailData5.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData5.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData5.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData5.contentType : inHouseIMContentType2, ((-17039376) & 8) != 0 ? wSSendMessageDetailData5.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData5.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData5.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData5.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData5.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData5.videoMessage : new VideoMessageData((java.lang.String) obj, mediaUrlPaths, C56443yFo.AEQbTJ(i3), C56443yFo.KWHzl(file4.length()), uri3.toString(), (java.lang.String) null, uploadMediaResponse.getFileId(), 32, (DefaultConstructorMarker) null), ((-17039376) & 512) != 0 ? wSSendMessageDetailData5.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData5.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData5.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData5.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData5.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData5.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData5.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData5.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData5.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData5.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData5.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData5.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData5.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData5.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData5.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData5.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData5.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData5.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData5.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData5.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData5.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData5.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData5.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData5.reactionDisplay : null);
            }
            inHouseAndroidXKt$createSendMessageDetailData$32.L$0 = wSSendMessageDetailData;
            inHouseIMUploadMediaService2 = inHouseIMUploadMediaService;
            inHouseAndroidXKt$createSendMessageDetailData$32.L$1 = inHouseIMUploadMediaService2;
            inHouseAndroidXKt$createSendMessageDetailData$32.L$2 = context;
            inHouseAndroidXKt$createSendMessageDetailData$32.L$3 = localUri;
            inHouseAndroidXKt$createSendMessageDetailData$32.Z$0 = z;
            inHouseAndroidXKt$createSendMessageDetailData$32.label = 1;
            java.lang.Object objFIwbmz = sFB.fIwbmz(localUri, context, inHouseAndroidXKt$createSendMessageDetailData$32);
            if (objFIwbmz == objCopydefault) {
                return objCopydefault;
            }
            context2 = context;
            z2 = z;
            wSSendMessageDetailData2 = wSSendMessageDetailData;
            obj = objFIwbmz;
        } else {
            if (i5 != 1) {
                if (i5 == 2) {
                    i2 = inHouseAndroidXKt$createSendMessageDetailData$32.I$0;
                    InHouseIMContentType inHouseIMContentType5 = (InHouseIMContentType) inHouseAndroidXKt$createSendMessageDetailData$32.L$3;
                    WSSendMessageDetailData wSSendMessageDetailData6 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$32.L$2;
                    file3 = (java.io.File) inHouseAndroidXKt$createSendMessageDetailData$32.L$1;
                    android.net.Uri uri4 = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$32.L$0;
                    C56391yDq.AEQbTJ(obj);
                    uri = uri4;
                    inHouseIMContentType = inHouseIMContentType5;
                    wSSendMessageDetailData4 = wSSendMessageDetailData6;
                    return wSSendMessageDetailData4.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData4.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData4.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData4.contentType : inHouseIMContentType, ((-17039376) & 8) != 0 ? wSSendMessageDetailData4.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData4.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData4.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData4.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData4.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData4.videoMessage : new VideoMessageData((java.lang.String) obj, (MediaUrlPaths) null, C56443yFo.AEQbTJ(i2), C56443yFo.KWHzl(file3.length()), uri.toString(), (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null), ((-17039376) & 512) != 0 ? wSSendMessageDetailData4.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData4.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData4.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData4.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData4.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData4.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData4.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData4.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData4.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData4.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData4.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData4.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData4.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData4.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData4.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData4.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData4.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData4.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData4.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData4.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData4.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData4.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData4.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData4.reactionDisplay : null);
                }
                if (i5 != 3) {
                    if (i5 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = inHouseAndroidXKt$createSendMessageDetailData$32.I$0;
                    InHouseIMContentType inHouseIMContentType6 = (InHouseIMContentType) inHouseAndroidXKt$createSendMessageDetailData$32.L$5;
                    WSSendMessageDetailData wSSendMessageDetailData7 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$32.L$4;
                    MediaUrlPaths mediaUrlPaths3 = (MediaUrlPaths) inHouseAndroidXKt$createSendMessageDetailData$32.L$3;
                    UploadMediaResponse uploadMediaResponse3 = (UploadMediaResponse) inHouseAndroidXKt$createSendMessageDetailData$32.L$2;
                    file4 = (java.io.File) inHouseAndroidXKt$createSendMessageDetailData$32.L$1;
                    uri3 = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$32.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mediaUrlPaths = mediaUrlPaths3;
                    inHouseIMContentType2 = inHouseIMContentType6;
                    wSSendMessageDetailData5 = wSSendMessageDetailData7;
                    uploadMediaResponse = uploadMediaResponse3;
                    return wSSendMessageDetailData5.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData5.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData5.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData5.contentType : inHouseIMContentType2, ((-17039376) & 8) != 0 ? wSSendMessageDetailData5.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData5.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData5.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData5.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData5.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData5.videoMessage : new VideoMessageData((java.lang.String) obj, mediaUrlPaths, C56443yFo.AEQbTJ(i3), C56443yFo.KWHzl(file4.length()), uri3.toString(), (java.lang.String) null, uploadMediaResponse.getFileId(), 32, (DefaultConstructorMarker) null), ((-17039376) & 512) != 0 ? wSSendMessageDetailData5.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData5.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData5.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData5.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData5.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData5.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData5.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData5.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData5.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData5.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData5.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData5.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData5.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData5.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData5.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData5.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData5.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData5.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData5.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData5.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData5.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData5.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData5.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData5.reactionDisplay : null);
                }
                i = inHouseAndroidXKt$createSendMessageDetailData$32.I$0;
                file2 = (java.io.File) inHouseAndroidXKt$createSendMessageDetailData$32.L$3;
                uri2 = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$32.L$2;
                context2 = (android.content.Context) inHouseAndroidXKt$createSendMessageDetailData$32.L$1;
                wSSendMessageDetailData3 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$32.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    responseData = (ResponseData) obj;
                    if (responseData.getCode() == 0 || responseData.getData() == null) {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    } else {
                        java.lang.Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    }
                    iOLrzqt = i;
                    file = file2;
                    uri = uri2;
                    context3 = context2;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    iOLrzqt = i;
                    file = file2;
                    uri = uri2;
                    wSSendMessageDetailData2 = wSSendMessageDetailData3;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    context3 = context2;
                    wSSendMessageDetailData3 = wSSendMessageDetailData2;
                }
                UploadMediaResponse uploadMediaResponse22 = (UploadMediaResponse) actionBar.AEQbTJ();
                InHouseIMContentType inHouseIMContentType42 = InHouseIMContentType.Video;
                URLS urls3 = uploadMediaResponse22.getUrls();
                java.lang.String cn2 = urls3 == null ? urls3.getCN() : null;
                URLS urls22 = uploadMediaResponse22.getUrls();
                MediaUrlPaths mediaUrlPaths22 = new MediaUrlPaths(cn2, urls22 == null ? urls22.getDefault() : null, (java.lang.String) null, 4, (DefaultConstructorMarker) null);
                inHouseAndroidXKt$createSendMessageDetailData$32.L$0 = uri;
                inHouseAndroidXKt$createSendMessageDetailData$32.L$1 = file;
                inHouseAndroidXKt$createSendMessageDetailData$32.L$2 = uploadMediaResponse22;
                inHouseAndroidXKt$createSendMessageDetailData$32.L$3 = mediaUrlPaths22;
                inHouseAndroidXKt$createSendMessageDetailData$32.L$4 = wSSendMessageDetailData3;
                inHouseAndroidXKt$createSendMessageDetailData$32.L$5 = inHouseIMContentType42;
                inHouseAndroidXKt$createSendMessageDetailData$32.I$0 = iOLrzqt;
                inHouseAndroidXKt$createSendMessageDetailData$32.label = 4;
                base64Thumbnail$default = sFB.toBase64Thumbnail$default(uri, context3, 0, 0L, inHouseAndroidXKt$createSendMessageDetailData$32, 6, null);
                if (base64Thumbnail$default != objCopydefault) {
                    return objCopydefault;
                }
                file4 = file;
                obj = base64Thumbnail$default;
                inHouseIMContentType2 = inHouseIMContentType42;
                wSSendMessageDetailData5 = wSSendMessageDetailData3;
                uri3 = uri;
                uploadMediaResponse = uploadMediaResponse22;
                mediaUrlPaths = mediaUrlPaths22;
                i3 = iOLrzqt;
                return wSSendMessageDetailData5.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData5.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData5.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData5.contentType : inHouseIMContentType2, ((-17039376) & 8) != 0 ? wSSendMessageDetailData5.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData5.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData5.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData5.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData5.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData5.videoMessage : new VideoMessageData((java.lang.String) obj, mediaUrlPaths, C56443yFo.AEQbTJ(i3), C56443yFo.KWHzl(file4.length()), uri3.toString(), (java.lang.String) null, uploadMediaResponse.getFileId(), 32, (DefaultConstructorMarker) null), ((-17039376) & 512) != 0 ? wSSendMessageDetailData5.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData5.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData5.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData5.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData5.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData5.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData5.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData5.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData5.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData5.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData5.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData5.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData5.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData5.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData5.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData5.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData5.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData5.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData5.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData5.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData5.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData5.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData5.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData5.reactionDisplay : null);
            }
            z2 = inHouseAndroidXKt$createSendMessageDetailData$32.Z$0;
            localUri = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$32.L$3;
            context2 = (android.content.Context) inHouseAndroidXKt$createSendMessageDetailData$32.L$2;
            inHouseIMUploadMediaService2 = (InHouseIMUploadMediaService) inHouseAndroidXKt$createSendMessageDetailData$32.L$1;
            wSSendMessageDetailData2 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$32.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        file = (java.io.File) obj;
        uri = localUri;
        C44124sEe.imLogSendMessage$default(wSSendMessageDetailData2.getChannelId(), "local uri: " + uri + " and localPath: " + file, null, 4, null);
        if (uri != null) {
        }
        throw new java.lang.Throwable("Null multipart body");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0193 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:37:0x0177, B:39:0x017f, B:41:0x0185, B:43:0x0193), top: B:59:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(@NotNull WSSendMessageDetailData wSSendMessageDetailData, @NotNull OKHQVoiceMessage oKHQVoiceMessage, InHouseIMUploadMediaService inHouseIMUploadMediaService, boolean z, @NotNull android.content.Context context, @NotNull Continuation<? super WSSendMessageDetailData> continuation) throws java.lang.Throwable {
        InHouseAndroidXKt$createSendMessageDetailData$4 inHouseAndroidXKt$createSendMessageDetailData$4;
        android.net.Uri localUri;
        WSSendMessageDetailData wSSendMessageDetailData2;
        android.net.Uri uri;
        java.io.File file;
        InHouseIMUploadMediaService inHouseIMUploadMediaService2;
        boolean z2;
        WSSendMessageDetailData wSSendMessageDetailData3;
        java.io.File file2;
        android.net.Uri uri2;
        WSSendMessageDetailData wSSendMessageDetailData4;
        AbstractC43419rot actionBar;
        WSSendMessageDetailData wSSendMessageDetailData5;
        ResponseData responseData;
        if (continuation instanceof InHouseAndroidXKt$createSendMessageDetailData$4) {
            inHouseAndroidXKt$createSendMessageDetailData$4 = (InHouseAndroidXKt$createSendMessageDetailData$4) continuation;
            int i = inHouseAndroidXKt$createSendMessageDetailData$4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseAndroidXKt$createSendMessageDetailData$4.label = i - Integer.MIN_VALUE;
            } else {
                inHouseAndroidXKt$createSendMessageDetailData$4 = new InHouseAndroidXKt$createSendMessageDetailData$4(continuation);
            }
        }
        java.lang.Object objUploadMediaForSocketMessage = inHouseAndroidXKt$createSendMessageDetailData$4.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseAndroidXKt$createSendMessageDetailData$4.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
            localUri = oKHQVoiceMessage.getLocalUri();
            if (localUri != null) {
                inHouseAndroidXKt$createSendMessageDetailData$4.L$0 = wSSendMessageDetailData;
                inHouseAndroidXKt$createSendMessageDetailData$4.L$1 = inHouseIMUploadMediaService;
                inHouseAndroidXKt$createSendMessageDetailData$4.L$2 = localUri;
                inHouseAndroidXKt$createSendMessageDetailData$4.Z$0 = z;
                inHouseAndroidXKt$createSendMessageDetailData$4.label = 1;
                java.lang.Object objFIwbmz = sFB.fIwbmz(localUri, context, inHouseAndroidXKt$createSendMessageDetailData$4);
                if (objFIwbmz == objCopydefault) {
                    return objCopydefault;
                }
                wSSendMessageDetailData3 = wSSendMessageDetailData;
                objUploadMediaForSocketMessage = objFIwbmz;
                inHouseIMUploadMediaService2 = inHouseIMUploadMediaService;
                z2 = z;
            } else {
                wSSendMessageDetailData2 = wSSendMessageDetailData;
                uri = localUri;
                file = null;
                inHouseIMUploadMediaService2 = inHouseIMUploadMediaService;
                z2 = z;
                C44124sEe.imLogSendMessage$default(wSSendMessageDetailData2.getChannelId(), "local uri: " + uri + " and localPath: " + file, null, 4, null);
                if (file != null) {
                    throw new java.lang.Throwable("Null multipart body");
                }
                if (inHouseIMUploadMediaService2 == null) {
                    return wSSendMessageDetailData2.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData2.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData2.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData2.contentType : InHouseIMContentType.Voice, ((-17039376) & 8) != 0 ? wSSendMessageDetailData2.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData2.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData2.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData2.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData2.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData2.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData2.voiceMessage : new VoiceMessageData((MediaUrlPaths) null, C56443yFo.AEQbTJ(OLrzqt(file, true)), uri.toString(), (java.lang.String) null, (java.lang.String) null, 24, (DefaultConstructorMarker) null), ((-17039376) & 1024) != 0 ? wSSendMessageDetailData2.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData2.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData2.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData2.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData2.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData2.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData2.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData2.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData2.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData2.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData2.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData2.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData2.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData2.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData2.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData2.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData2.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData2.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData2.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData2.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData2.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData2.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData2.reactionDisplay : null);
                }
                MultipartBody.Part partCopydefault = copydefault(file, "file");
                java.lang.String path = file.getPath();
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(wSSendMessageDetailData2.getChannelId());
                Intrinsics.copydefault((java.lang.Object) path);
                AEQbTJ(strGEmmrt, partCopydefault, path, C33129mqd.gEmmrt(C56443yFo.AEQbTJ(OLrzqt(file, true))));
                MultipartBody.Part partWithProgressTracking$default = withProgressTracking$default(partCopydefault, wSSendMessageDetailData2.getClientMsgId(), 0L, 2, null);
                try {
                    java.lang.String channelId = wSSendMessageDetailData2.getChannelId();
                    inHouseAndroidXKt$createSendMessageDetailData$4.L$0 = wSSendMessageDetailData2;
                    inHouseAndroidXKt$createSendMessageDetailData$4.L$1 = uri;
                    inHouseAndroidXKt$createSendMessageDetailData$4.L$2 = file;
                    inHouseAndroidXKt$createSendMessageDetailData$4.label = 2;
                    objUploadMediaForSocketMessage = inHouseIMUploadMediaService2.uploadMediaForSocketMessage(partWithProgressTracking$default, channelId, z2, inHouseAndroidXKt$createSendMessageDetailData$4);
                } catch (java.lang.Throwable th) {
                    th = th;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    file2 = file;
                    uri2 = uri;
                    wSSendMessageDetailData5 = wSSendMessageDetailData2;
                }
                if (objUploadMediaForSocketMessage == objCopydefault) {
                    return objCopydefault;
                }
                file2 = file;
                uri2 = uri;
                wSSendMessageDetailData4 = wSSendMessageDetailData2;
                responseData = (ResponseData) objUploadMediaForSocketMessage;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    wSSendMessageDetailData5 = wSSendMessageDetailData4;
                }
                UploadMediaResponse uploadMediaResponse = (UploadMediaResponse) actionBar.AEQbTJ();
                InHouseIMContentType inHouseIMContentType = InHouseIMContentType.Voice;
                URLS urls = uploadMediaResponse.getUrls();
                if (urls == null) {
                }
                URLS urls2 = uploadMediaResponse.getUrls();
                return wSSendMessageDetailData5.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData5.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData5.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData5.contentType : inHouseIMContentType, ((-17039376) & 8) != 0 ? wSSendMessageDetailData5.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData5.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData5.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData5.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData5.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData5.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData5.voiceMessage : new VoiceMessageData(new MediaUrlPaths(cn, urls2 != null ? urls2.getDefault() : null, (java.lang.String) null, 4, (DefaultConstructorMarker) null), C56443yFo.AEQbTJ(OLrzqt(file2, true)), uri2.toString(), (java.lang.String) null, uploadMediaResponse.getFileId(), 8, (DefaultConstructorMarker) null), ((-17039376) & 1024) != 0 ? wSSendMessageDetailData5.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData5.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData5.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData5.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData5.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData5.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData5.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData5.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData5.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData5.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData5.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData5.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData5.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData5.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData5.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData5.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData5.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData5.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData5.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData5.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData5.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData5.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData5.reactionDisplay : null);
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file2 = (java.io.File) inHouseAndroidXKt$createSendMessageDetailData$4.L$2;
                uri2 = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$4.L$1;
                wSSendMessageDetailData4 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$4.L$0;
                try {
                    C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
                    responseData = (ResponseData) objUploadMediaForSocketMessage;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        java.lang.Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                    wSSendMessageDetailData5 = wSSendMessageDetailData4;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    wSSendMessageDetailData2 = wSSendMessageDetailData4;
                    file = file2;
                    uri = uri2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    file2 = file;
                    uri2 = uri;
                    wSSendMessageDetailData5 = wSSendMessageDetailData2;
                }
                UploadMediaResponse uploadMediaResponse2 = (UploadMediaResponse) actionBar.AEQbTJ();
                InHouseIMContentType inHouseIMContentType2 = InHouseIMContentType.Voice;
                URLS urls3 = uploadMediaResponse2.getUrls();
                java.lang.String cn2 = urls3 == null ? urls3.getCN() : null;
                URLS urls22 = uploadMediaResponse2.getUrls();
                return wSSendMessageDetailData5.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData5.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData5.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData5.contentType : inHouseIMContentType2, ((-17039376) & 8) != 0 ? wSSendMessageDetailData5.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData5.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData5.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData5.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData5.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData5.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData5.voiceMessage : new VoiceMessageData(new MediaUrlPaths(cn2, urls22 != null ? urls22.getDefault() : null, (java.lang.String) null, 4, (DefaultConstructorMarker) null), C56443yFo.AEQbTJ(OLrzqt(file2, true)), uri2.toString(), (java.lang.String) null, uploadMediaResponse2.getFileId(), 8, (DefaultConstructorMarker) null), ((-17039376) & 1024) != 0 ? wSSendMessageDetailData5.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData5.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData5.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData5.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData5.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData5.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData5.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData5.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData5.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData5.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData5.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData5.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData5.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData5.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData5.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData5.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData5.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData5.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData5.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData5.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData5.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData5.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData5.reactionDisplay : null);
            }
            z2 = inHouseAndroidXKt$createSendMessageDetailData$4.Z$0;
            localUri = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$4.L$2;
            inHouseIMUploadMediaService2 = (InHouseIMUploadMediaService) inHouseAndroidXKt$createSendMessageDetailData$4.L$1;
            wSSendMessageDetailData3 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$4.L$0;
            C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
        }
        wSSendMessageDetailData2 = wSSendMessageDetailData3;
        uri = localUri;
        file = (java.io.File) objUploadMediaForSocketMessage;
        C44124sEe.imLogSendMessage$default(wSSendMessageDetailData2.getChannelId(), "local uri: " + uri + " and localPath: " + file, null, 4, null);
        if (file != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0174 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003b, B:39:0x0158, B:41:0x0160, B:43:0x0166, B:45:0x0174), top: B:63:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(@NotNull WSSendMessageDetailData wSSendMessageDetailData, @NotNull OKFileMessage oKFileMessage, InHouseIMUploadMediaService inHouseIMUploadMediaService, boolean z, @NotNull android.content.Context context, @NotNull Continuation<? super WSSendMessageDetailData> continuation) throws java.lang.Throwable {
        InHouseAndroidXKt$createSendMessageDetailData$5 inHouseAndroidXKt$createSendMessageDetailData$5;
        WSSendMessageDetailData wSSendMessageDetailData2;
        OKFileMessage oKFileMessage2;
        InHouseIMUploadMediaService inHouseIMUploadMediaService2;
        boolean z2;
        android.net.Uri uri;
        android.net.Uri uri2;
        WSSendMessageDetailData wSSendMessageDetailData3;
        OKFileMessage oKFileMessage3;
        AbstractC43419rot actionBar;
        WSSendMessageDetailData wSSendMessageDetailData4;
        ResponseData responseData;
        if (continuation instanceof InHouseAndroidXKt$createSendMessageDetailData$5) {
            inHouseAndroidXKt$createSendMessageDetailData$5 = (InHouseAndroidXKt$createSendMessageDetailData$5) continuation;
            int i = inHouseAndroidXKt$createSendMessageDetailData$5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseAndroidXKt$createSendMessageDetailData$5.label = i - Integer.MIN_VALUE;
            } else {
                inHouseAndroidXKt$createSendMessageDetailData$5 = new InHouseAndroidXKt$createSendMessageDetailData$5(continuation);
            }
        }
        java.lang.Object objUploadMediaForSocketMessage = inHouseAndroidXKt$createSendMessageDetailData$5.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseAndroidXKt$createSendMessageDetailData$5.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
            android.net.Uri localUri = oKFileMessage.getLocalUri();
            if (localUri == null) {
                throw new MissingMediaPathException();
            }
            java.lang.String fileName = oKFileMessage.getFileName();
            wSSendMessageDetailData2 = wSSendMessageDetailData;
            inHouseAndroidXKt$createSendMessageDetailData$5.L$0 = wSSendMessageDetailData2;
            oKFileMessage2 = oKFileMessage;
            inHouseAndroidXKt$createSendMessageDetailData$5.L$1 = oKFileMessage2;
            inHouseIMUploadMediaService2 = inHouseIMUploadMediaService;
            inHouseAndroidXKt$createSendMessageDetailData$5.L$2 = inHouseIMUploadMediaService2;
            inHouseAndroidXKt$createSendMessageDetailData$5.L$3 = localUri;
            z2 = z;
            inHouseAndroidXKt$createSendMessageDetailData$5.Z$0 = z2;
            inHouseAndroidXKt$createSendMessageDetailData$5.label = 1;
            java.lang.Object objAEQbTJ = sFB.AEQbTJ(localUri, context, "file", fileName, inHouseAndroidXKt$createSendMessageDetailData$5);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            uri = localUri;
            objUploadMediaForSocketMessage = objAEQbTJ;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uri2 = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$5.L$2;
                oKFileMessage3 = (OKFileMessage) inHouseAndroidXKt$createSendMessageDetailData$5.L$1;
                wSSendMessageDetailData3 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$5.L$0;
                try {
                    C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
                    responseData = (ResponseData) objUploadMediaForSocketMessage;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        java.lang.Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                    wSSendMessageDetailData4 = wSSendMessageDetailData3;
                } catch (java.lang.Throwable th) {
                    th = th;
                    wSSendMessageDetailData2 = wSSendMessageDetailData3;
                    uri = uri2;
                    oKFileMessage2 = oKFileMessage3;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    uri2 = uri;
                    wSSendMessageDetailData4 = wSSendMessageDetailData2;
                    oKFileMessage3 = oKFileMessage2;
                }
                UploadMediaResponse uploadMediaResponse = (UploadMediaResponse) actionBar.AEQbTJ();
                InHouseIMContentType inHouseIMContentType = InHouseIMContentType.Media;
                URLS urls = uploadMediaResponse.getUrls();
                java.lang.String cn2 = urls == null ? urls.getCN() : null;
                URLS urls2 = uploadMediaResponse.getUrls();
                return wSSendMessageDetailData4.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData4.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData4.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData4.contentType : inHouseIMContentType, ((-17039376) & 8) != 0 ? wSSendMessageDetailData4.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData4.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData4.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData4.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData4.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData4.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData4.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData4.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData4.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData4.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData4.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData4.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData4.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData4.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData4.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData4.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData4.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData4.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData4.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData4.mediaMessage : new MediaMessageData(uploadMediaResponse.getFileId(), oKFileMessage3.getFileName(), oKFileMessage3.getFileSize(), oKFileMessage3.getFileExtension(), C56443yFo.AEQbTJ(MediaMessageContentType.FILE.getApiValue()), new MediaUrlPaths(cn2, urls2 != null ? urls2.getDefault() : null, (java.lang.String) null, 4, (DefaultConstructorMarker) null), uri2.toString(), (java.lang.String) null, 128, (DefaultConstructorMarker) null), ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData4.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData4.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData4.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData4.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData4.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData4.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData4.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData4.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData4.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData4.reactionDisplay : null);
            }
            boolean z3 = inHouseAndroidXKt$createSendMessageDetailData$5.Z$0;
            uri = (android.net.Uri) inHouseAndroidXKt$createSendMessageDetailData$5.L$3;
            InHouseIMUploadMediaService inHouseIMUploadMediaService3 = (InHouseIMUploadMediaService) inHouseAndroidXKt$createSendMessageDetailData$5.L$2;
            oKFileMessage2 = (OKFileMessage) inHouseAndroidXKt$createSendMessageDetailData$5.L$1;
            WSSendMessageDetailData wSSendMessageDetailData5 = (WSSendMessageDetailData) inHouseAndroidXKt$createSendMessageDetailData$5.L$0;
            C56391yDq.AEQbTJ(objUploadMediaForSocketMessage);
            z2 = z3;
            inHouseIMUploadMediaService2 = inHouseIMUploadMediaService3;
            wSSendMessageDetailData2 = wSSendMessageDetailData5;
        }
        MultipartBody.Part part = (MultipartBody.Part) objUploadMediaForSocketMessage;
        if (part == null) {
            throw new MissingMediaPathException();
        }
        if (inHouseIMUploadMediaService2 == null) {
            return wSSendMessageDetailData2.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData2.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData2.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData2.contentType : InHouseIMContentType.Media, ((-17039376) & 8) != 0 ? wSSendMessageDetailData2.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData2.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData2.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData2.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData2.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData2.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData2.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData2.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData2.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData2.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData2.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData2.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData2.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData2.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData2.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData2.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData2.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData2.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData2.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData2.mediaMessage : new MediaMessageData((java.lang.String) null, oKFileMessage2.getFileName(), oKFileMessage2.getFileSize(), oKFileMessage2.getFileExtension(), C56443yFo.AEQbTJ(MediaMessageContentType.FILE.getApiValue()), (MediaUrlPaths) null, uri.toString(), (java.lang.String) null, CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384, (DefaultConstructorMarker) null), ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData2.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData2.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData2.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData2.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData2.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData2.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData2.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData2.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData2.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData2.reactionDisplay : null);
        }
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(wSSendMessageDetailData2.getChannelId());
        java.lang.String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        trackMetaDataMediaEvent$default(strGEmmrt, part, string, null, 8, null);
        java.lang.String clientMsgId = wSSendMessageDetailData2.getClientMsgId();
        java.lang.Long fileSize = oKFileMessage2.getFileSize();
        MultipartBody.Part partCopydefault = copydefault(part, clientMsgId, fileSize != null ? fileSize.longValue() : -1L);
        try {
            java.lang.String channelId = wSSendMessageDetailData2.getChannelId();
            inHouseAndroidXKt$createSendMessageDetailData$5.L$0 = wSSendMessageDetailData2;
            inHouseAndroidXKt$createSendMessageDetailData$5.L$1 = oKFileMessage2;
            inHouseAndroidXKt$createSendMessageDetailData$5.L$2 = uri;
            inHouseAndroidXKt$createSendMessageDetailData$5.L$3 = null;
            inHouseAndroidXKt$createSendMessageDetailData$5.label = 2;
            objUploadMediaForSocketMessage = inHouseIMUploadMediaService2.uploadMediaForSocketMessage(partCopydefault, channelId, z2, inHouseAndroidXKt$createSendMessageDetailData$5);
        } catch (java.lang.Throwable th2) {
            th = th2;
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            uri2 = uri;
            wSSendMessageDetailData4 = wSSendMessageDetailData2;
            oKFileMessage3 = oKFileMessage2;
        }
        if (objUploadMediaForSocketMessage == objCopydefault) {
            return objCopydefault;
        }
        uri2 = uri;
        wSSendMessageDetailData3 = wSSendMessageDetailData2;
        oKFileMessage3 = oKFileMessage2;
        responseData = (ResponseData) objUploadMediaForSocketMessage;
        if (responseData.getCode() != 0) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            wSSendMessageDetailData4 = wSSendMessageDetailData3;
        }
        UploadMediaResponse uploadMediaResponse2 = (UploadMediaResponse) actionBar.AEQbTJ();
        InHouseIMContentType inHouseIMContentType2 = InHouseIMContentType.Media;
        URLS urls3 = uploadMediaResponse2.getUrls();
        if (urls3 == null) {
        }
        URLS urls22 = uploadMediaResponse2.getUrls();
        return wSSendMessageDetailData4.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData4.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData4.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData4.contentType : inHouseIMContentType2, ((-17039376) & 8) != 0 ? wSSendMessageDetailData4.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData4.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData4.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData4.textMessage : null, ((-17039376) & 128) != 0 ? wSSendMessageDetailData4.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData4.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData4.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData4.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData4.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData4.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData4.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData4.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData4.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData4.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData4.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData4.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData4.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData4.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData4.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData4.mediaMessage : new MediaMessageData(uploadMediaResponse2.getFileId(), oKFileMessage3.getFileName(), oKFileMessage3.getFileSize(), oKFileMessage3.getFileExtension(), C56443yFo.AEQbTJ(MediaMessageContentType.FILE.getApiValue()), new MediaUrlPaths(cn2, urls22 != null ? urls22.getDefault() : null, (java.lang.String) null, 4, (DefaultConstructorMarker) null), uri2.toString(), (java.lang.String) null, 128, (DefaultConstructorMarker) null), ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData4.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData4.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData4.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData4.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData4.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData4.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData4.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData4.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData4.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData4.reactionDisplay : null);
    }

    public static final WSSendMessageDetailData OLrzqt(@NotNull WSSendMessageDetailData wSSendMessageDetailData, @NotNull OKMessageContent oKMessageContent) {
        java.util.List listAhwBna;
        java.util.List<MentionedUserInfo> mentionedUserList;
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        Intrinsics.checkNotNullParameter(oKMessageContent, "");
        OKMentionedInfo mentionedInfo = oKMessageContent.getMentionedInfo();
        if (mentionedInfo == null || (mentionedUserList = mentionedInfo.getMentionedUserList()) == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(mentionedUserList, 10));
            for (MentionedUserInfo mentionedUserInfo : mentionedUserList) {
                listAhwBna.add(new InhouseIMAtUser(mentionedUserInfo.getAtUserName(), mentionedUserInfo.getUserId()));
            }
        }
        java.util.List list = listAhwBna;
        sPX spx = sPX.copydefault;
        OKMentionedInfo mentionedInfo2 = oKMessageContent.getMentionedInfo();
        return wSSendMessageDetailData.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailData.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailData.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailData.contentType : null, ((-17039376) & 8) != 0 ? wSSendMessageDetailData.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailData.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailData.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailData.textMessage : new TextMessageData(java.lang.Integer.valueOf(spx.OLrzqt(mentionedInfo2 != null ? mentionedInfo2.getType() : null)), list, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (SiteMeta) null, 120, (DefaultConstructorMarker) null), ((-17039376) & 128) != 0 ? wSSendMessageDetailData.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailData.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailData.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailData.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailData.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailData.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailData.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailData.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailData.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailData.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailData.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailData.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailData.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailData.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailData.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailData.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailData.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailData.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailData.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailData.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailData.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailData.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailData.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailData.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailData.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailData.reactionDisplay : null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData.copy$default(com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData, java.lang.Integer, java.util.List, java.lang.String, java.util.List, java.lang.String, java.util.List, com.okinc.okimcore.model.im.inhouseim.ws.SiteMeta, int, java.lang.Object):com.okinc.okimcore.model.im.inhouseim.ws.TextMessageData */
    public static final WSSendMessageDetailData EZpvd(@NotNull WSSendMessageDetailData wSSendMessageDetailData, @NotNull OKTextMessage oKTextMessage) {
        TextMessageData textMessageDataCopy$default;
        Intrinsics.checkNotNullParameter(wSSendMessageDetailData, "");
        Intrinsics.checkNotNullParameter(oKTextMessage, "");
        WSSendMessageDetailData wSSendMessageDetailDataOLrzqt = OLrzqt(wSSendMessageDetailData, oKTextMessage);
        InHouseIMContentType inHouseIMContentType = InHouseIMContentType.Text;
        TextMessageData textMessage = wSSendMessageDetailDataOLrzqt.getTextMessage();
        if (textMessage != null) {
            java.lang.String content = oKTextMessage.getContent();
            sSQ ssq = sSQ.KWHzl;
            java.lang.String content2 = oKTextMessage.getContent();
            if (content2 == null) {
                content2 = "";
            }
            java.util.List<java.lang.String> listDjBIcL = ssq.djBIcL(content2);
            C44526sTc c44526sTc = C44526sTc.OLrzqt;
            java.lang.String content3 = oKTextMessage.getContent();
            textMessageDataCopy$default = TextMessageData.copy$default(textMessage, null, null, content, listDjBIcL, null, c44526sTc.KWHzl(content3 != null ? content3 : ""), null, 83, null);
        } else {
            textMessageDataCopy$default = null;
        }
        return wSSendMessageDetailDataOLrzqt.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailDataOLrzqt.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailDataOLrzqt.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailDataOLrzqt.contentType : inHouseIMContentType, ((-17039376) & 8) != 0 ? wSSendMessageDetailDataOLrzqt.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailDataOLrzqt.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailDataOLrzqt.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailDataOLrzqt.textMessage : textMessageDataCopy$default, ((-17039376) & 128) != 0 ? wSSendMessageDetailDataOLrzqt.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailDataOLrzqt.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailDataOLrzqt.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailDataOLrzqt.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailDataOLrzqt.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailDataOLrzqt.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailDataOLrzqt.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailDataOLrzqt.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailDataOLrzqt.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailDataOLrzqt.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailDataOLrzqt.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailDataOLrzqt.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailDataOLrzqt.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailDataOLrzqt.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailDataOLrzqt.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailDataOLrzqt.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailDataOLrzqt.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailDataOLrzqt.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailDataOLrzqt.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailDataOLrzqt.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailDataOLrzqt.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailDataOLrzqt.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailDataOLrzqt.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailDataOLrzqt.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailDataOLrzqt.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailDataOLrzqt.reactionDisplay : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object copydefault(@NotNull WSSendMessageDetailData wSSendMessageDetailData, @NotNull OKReferenceMessage oKReferenceMessage, InHouseIMUploadMediaService inHouseIMUploadMediaService, boolean z, @NotNull android.content.Context context, @NotNull Continuation<? super WSSendMessageDetailData> continuation) throws java.lang.Throwable {
        InHouseAndroidXKt$createSendMessageDetailData$8 inHouseAndroidXKt$createSendMessageDetailData$8;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        TextMessageData textMessageDataCopy$default;
        ImageMessageData imageMessage;
        ImageMessageData imageMessage2;
        VideoMessageData videoMessage;
        VoiceMessageData voiceMessage;
        MediaMessageData mediaMessage;
        if (continuation instanceof InHouseAndroidXKt$createSendMessageDetailData$8) {
            inHouseAndroidXKt$createSendMessageDetailData$8 = (InHouseAndroidXKt$createSendMessageDetailData$8) continuation;
            int i = inHouseAndroidXKt$createSendMessageDetailData$8.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                inHouseAndroidXKt$createSendMessageDetailData$8.label = i - Integer.MIN_VALUE;
            } else {
                inHouseAndroidXKt$createSendMessageDetailData$8 = new InHouseAndroidXKt$createSendMessageDetailData$8(continuation);
            }
        }
        InHouseAndroidXKt$createSendMessageDetailData$8 inHouseAndroidXKt$createSendMessageDetailData$82 = inHouseAndroidXKt$createSendMessageDetailData$8;
        java.lang.Object obj = inHouseAndroidXKt$createSendMessageDetailData$82.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = inHouseAndroidXKt$createSendMessageDetailData$82.label;
        if (i2 != 0) {
            if (i2 == 1) {
                str5 = (java.lang.String) inHouseAndroidXKt$createSendMessageDetailData$82.L$0;
                C56391yDq.AEQbTJ(obj);
                WSSendMessageDetailData wSSendMessageDetailData2 = (WSSendMessageDetailData) obj;
                imageMessage = wSSendMessageDetailData2.getImageMessage();
                if (imageMessage != null) {
                    return wSSendMessageDetailData2;
                }
                imageMessage.setQuotedMsgSeq(str5);
                return wSSendMessageDetailData2;
            }
            if (i2 == 2) {
                str4 = (java.lang.String) inHouseAndroidXKt$createSendMessageDetailData$82.L$0;
                C56391yDq.AEQbTJ(obj);
                WSSendMessageDetailData wSSendMessageDetailData3 = (WSSendMessageDetailData) obj;
                imageMessage2 = wSSendMessageDetailData3.getImageMessage();
                if (imageMessage2 != null) {
                    return wSSendMessageDetailData3;
                }
                imageMessage2.setQuotedMsgSeq(str4);
                return wSSendMessageDetailData3;
            }
            if (i2 == 3) {
                str3 = (java.lang.String) inHouseAndroidXKt$createSendMessageDetailData$82.L$0;
                C56391yDq.AEQbTJ(obj);
                WSSendMessageDetailData wSSendMessageDetailData4 = (WSSendMessageDetailData) obj;
                videoMessage = wSSendMessageDetailData4.getVideoMessage();
                if (videoMessage != null) {
                    return wSSendMessageDetailData4;
                }
                videoMessage.setQuotedMsgSeq(str3);
                return wSSendMessageDetailData4;
            }
            if (i2 == 4) {
                str2 = (java.lang.String) inHouseAndroidXKt$createSendMessageDetailData$82.L$0;
                C56391yDq.AEQbTJ(obj);
                WSSendMessageDetailData wSSendMessageDetailData5 = (WSSendMessageDetailData) obj;
                voiceMessage = wSSendMessageDetailData5.getVoiceMessage();
                if (voiceMessage != null) {
                    return wSSendMessageDetailData5;
                }
                voiceMessage.setQuotedMsgSeq(str2);
                return wSSendMessageDetailData5;
            }
            if (i2 != 5) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) inHouseAndroidXKt$createSendMessageDetailData$82.L$0;
            C56391yDq.AEQbTJ(obj);
            WSSendMessageDetailData wSSendMessageDetailData6 = (WSSendMessageDetailData) obj;
            mediaMessage = wSSendMessageDetailData6.getMediaMessage();
            if (mediaMessage != null) {
                return wSSendMessageDetailData6;
            }
            mediaMessage.setQuotedMsgSeq(str);
            return wSSendMessageDetailData6;
        }
        C56391yDq.AEQbTJ(obj);
        java.lang.String referMsgUid = oKReferenceMessage.getReferMsgUid();
        WSSendMessageDetailData wSSendMessageDetailDataOLrzqt = OLrzqt(wSSendMessageDetailData, oKReferenceMessage);
        OKMessageContent originalOKMessageContent = oKReferenceMessage.getOriginalOKMessageContent();
        if (originalOKMessageContent instanceof OKTextMessage) {
            InHouseIMContentType inHouseIMContentType = InHouseIMContentType.Text;
            TextMessageData textMessage = wSSendMessageDetailDataOLrzqt.getTextMessage();
            if (textMessage != null) {
                OKTextMessage oKTextMessage = (OKTextMessage) originalOKMessageContent;
                java.lang.String content = oKTextMessage.getContent();
                sSQ ssq = sSQ.KWHzl;
                java.lang.String content2 = oKTextMessage.getContent();
                if (content2 == null) {
                    content2 = "";
                }
                java.util.List<java.lang.String> listDjBIcL = ssq.djBIcL(content2);
                C44526sTc c44526sTc = C44526sTc.OLrzqt;
                java.lang.String content3 = oKTextMessage.getContent();
                textMessageDataCopy$default = TextMessageData.copy$default(textMessage, null, null, content, listDjBIcL, referMsgUid, c44526sTc.KWHzl(content3 != null ? content3 : ""), null, 67, null);
            } else {
                textMessageDataCopy$default = null;
            }
            return wSSendMessageDetailDataOLrzqt.copy(((-17039376) & 1) != 0 ? wSSendMessageDetailDataOLrzqt.senderUid : null, ((-17039376) & 2) != 0 ? wSSendMessageDetailDataOLrzqt.channelId : null, ((-17039376) & 4) != 0 ? wSSendMessageDetailDataOLrzqt.contentType : inHouseIMContentType, ((-17039376) & 8) != 0 ? wSSendMessageDetailDataOLrzqt.channelType : null, ((-17039376) & 16) != 0 ? wSSendMessageDetailDataOLrzqt.senderPlatformType : null, ((-17039376) & 32) != 0 ? wSSendMessageDetailDataOLrzqt.sendTime : null, ((-17039376) & 64) != 0 ? wSSendMessageDetailDataOLrzqt.textMessage : textMessageDataCopy$default, ((-17039376) & 128) != 0 ? wSSendMessageDetailDataOLrzqt.imageMessage : null, ((-17039376) & 256) != 0 ? wSSendMessageDetailDataOLrzqt.videoMessage : null, ((-17039376) & 512) != 0 ? wSSendMessageDetailDataOLrzqt.voiceMessage : null, ((-17039376) & 1024) != 0 ? wSSendMessageDetailDataOLrzqt.shareMessage : null, ((-17039376) & 2048) != 0 ? wSSendMessageDetailDataOLrzqt.callMessage : null, ((-17039376) & 4096) != 0 ? wSSendMessageDetailDataOLrzqt.quotedMessage : null, ((-17039376) & 8192) != 0 ? wSSendMessageDetailDataOLrzqt.customMessage : null, ((-17039376) & 16384) != 0 ? wSSendMessageDetailDataOLrzqt.systemMessage : null, ((-17039376) & 32768) != 0 ? wSSendMessageDetailDataOLrzqt.stickerMessage : null, ((-17039376) & 65536) != 0 ? wSSendMessageDetailDataOLrzqt.readReceiptMessage : null, ((-17039376) & 131072) != 0 ? wSSendMessageDetailDataOLrzqt.senderRecallMessage : null, ((-17039376) & 262144) != 0 ? wSSendMessageDetailDataOLrzqt.adminRecallMessage : null, ((-17039376) & 524288) != 0 ? wSSendMessageDetailDataOLrzqt.groupInvitationMessage : null, ((-17039376) & 1048576) != 0 ? wSSendMessageDetailDataOLrzqt.streamPlaceholderMessage : null, ((-17039376) & 2097152) != 0 ? wSSendMessageDetailDataOLrzqt.streamMessage : null, ((-17039376) & 4194304) != 0 ? wSSendMessageDetailDataOLrzqt.mediaMessage : null, ((-17039376) & 8388608) != 0 ? wSSendMessageDetailDataOLrzqt.senderName : null, ((-17039376) & 16777216) != 0 ? wSSendMessageDetailDataOLrzqt.seq : null, ((-17039376) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? wSSendMessageDetailDataOLrzqt.extra : null, ((-17039376) & 67108864) != 0 ? wSSendMessageDetailDataOLrzqt.status : null, ((-17039376) & 134217728) != 0 ? wSSendMessageDetailDataOLrzqt.clientMsgId : null, ((-17039376) & 268435456) != 0 ? wSSendMessageDetailDataOLrzqt.messageHandling : null, ((-17039376) & 536870912) != 0 ? wSSendMessageDetailDataOLrzqt.frontendOption : null, ((-17039376) & 1073741824) != 0 ? wSSendMessageDetailDataOLrzqt.lookupSeq : null, ((-17039376) & Integer.MIN_VALUE) != 0 ? wSSendMessageDetailDataOLrzqt.reaction : null, (1 & 1) != 0 ? wSSendMessageDetailDataOLrzqt.reactionDisplay : null);
        }
        if (originalOKMessageContent instanceof OKImageMessage) {
            inHouseAndroidXKt$createSendMessageDetailData$82.L$0 = referMsgUid;
            inHouseAndroidXKt$createSendMessageDetailData$82.label = 1;
            java.lang.Object objEZpvd = EZpvd(wSSendMessageDetailDataOLrzqt, (OKImageMessage) originalOKMessageContent, inHouseIMUploadMediaService, z, context, inHouseAndroidXKt$createSendMessageDetailData$82);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            str5 = referMsgUid;
            obj = objEZpvd;
            WSSendMessageDetailData wSSendMessageDetailData22 = (WSSendMessageDetailData) obj;
            imageMessage = wSSendMessageDetailData22.getImageMessage();
            if (imageMessage != null) {
            }
        } else {
            if (originalOKMessageContent instanceof OKStickerMessage) {
                WSSendMessageDetailData wSSendMessageDetailDataAEQbTJ = AEQbTJ(wSSendMessageDetailDataOLrzqt, (OKStickerMessage) originalOKMessageContent);
                StickerMessageData stickerMessage = wSSendMessageDetailDataAEQbTJ.getStickerMessage();
                if (stickerMessage == null) {
                    return wSSendMessageDetailDataAEQbTJ;
                }
                stickerMessage.setQuotedMsgSeq(referMsgUid);
                return wSSendMessageDetailDataAEQbTJ;
            }
            if (originalOKMessageContent instanceof OKGIFMessage) {
                inHouseAndroidXKt$createSendMessageDetailData$82.L$0 = referMsgUid;
                inHouseAndroidXKt$createSendMessageDetailData$82.label = 2;
                java.lang.Object objCopydefault2 = copydefault(wSSendMessageDetailDataOLrzqt, (OKGIFMessage) originalOKMessageContent, inHouseIMUploadMediaService, z, context, inHouseAndroidXKt$createSendMessageDetailData$82);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                str4 = referMsgUid;
                obj = objCopydefault2;
                WSSendMessageDetailData wSSendMessageDetailData32 = (WSSendMessageDetailData) obj;
                imageMessage2 = wSSendMessageDetailData32.getImageMessage();
                if (imageMessage2 != null) {
                }
            } else if (originalOKMessageContent instanceof OKSightMessage) {
                inHouseAndroidXKt$createSendMessageDetailData$82.L$0 = referMsgUid;
                inHouseAndroidXKt$createSendMessageDetailData$82.label = 3;
                java.lang.Object objEZpvd2 = EZpvd(wSSendMessageDetailDataOLrzqt, (OKSightMessage) originalOKMessageContent, inHouseIMUploadMediaService, z, context, inHouseAndroidXKt$createSendMessageDetailData$82);
                if (objEZpvd2 == objCopydefault) {
                    return objCopydefault;
                }
                str3 = referMsgUid;
                obj = objEZpvd2;
                WSSendMessageDetailData wSSendMessageDetailData42 = (WSSendMessageDetailData) obj;
                videoMessage = wSSendMessageDetailData42.getVideoMessage();
                if (videoMessage != null) {
                }
            } else if (originalOKMessageContent instanceof OKHQVoiceMessage) {
                inHouseAndroidXKt$createSendMessageDetailData$82.L$0 = referMsgUid;
                inHouseAndroidXKt$createSendMessageDetailData$82.label = 4;
                java.lang.Object objAEQbTJ = AEQbTJ(wSSendMessageDetailDataOLrzqt, (OKHQVoiceMessage) originalOKMessageContent, inHouseIMUploadMediaService, z, context, inHouseAndroidXKt$createSendMessageDetailData$82);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                str2 = referMsgUid;
                obj = objAEQbTJ;
                WSSendMessageDetailData wSSendMessageDetailData52 = (WSSendMessageDetailData) obj;
                voiceMessage = wSSendMessageDetailData52.getVoiceMessage();
                if (voiceMessage != null) {
                }
            } else {
                if (!(originalOKMessageContent instanceof OKFileMessage)) {
                    return wSSendMessageDetailDataOLrzqt;
                }
                inHouseAndroidXKt$createSendMessageDetailData$82.L$0 = referMsgUid;
                inHouseAndroidXKt$createSendMessageDetailData$82.label = 5;
                java.lang.Object objOLrzqt = OLrzqt(wSSendMessageDetailDataOLrzqt, (OKFileMessage) originalOKMessageContent, inHouseIMUploadMediaService, z, context, inHouseAndroidXKt$createSendMessageDetailData$82);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                str = referMsgUid;
                obj = objOLrzqt;
                WSSendMessageDetailData wSSendMessageDetailData62 = (WSSendMessageDetailData) obj;
                mediaMessage = wSSendMessageDetailData62.getMediaMessage();
                if (mediaMessage != null) {
                }
            }
        }
    }

    public static final OKMessageContent KWHzl(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity) {
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        java.lang.String invitationId = inHouseIMMessageEntity.getInvitationId();
        java.lang.String groupInvitationGroupId = inHouseIMMessageEntity.getGroupInvitationGroupId();
        return new OKGroupInvitationMessage(invitationId, groupInvitationGroupId != null ? java.lang.Long.valueOf(C33129mqd.valueOf(groupInvitationGroupId)) : null, inHouseIMMessageEntity.getGroupInviteName(), inHouseIMMessageEntity.getGroupInviteAvatar(), inHouseIMMessageEntity.getGroupInviterUid(), inHouseIMMessageEntity.getGroupInviteExpireTime());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0.intValue() != r2) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final OKMessageContent EZpvd(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity) {
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        if (inHouseIMMessageEntity.getStickerId() == null || inHouseIMMessageEntity.getStickerPath() == null) {
            return null;
        }
        if (inHouseIMMessageEntity.getReplySeq() != null) {
            InHouseIMMessageEntity quotedMessage = inHouseIMMessageEntity.getQuotedMessage();
            if (quotedMessage != null) {
                java.lang.Integer status = quotedMessage.getStatus();
                int status2 = MessageStatus.Rejected.getStatus();
                if (status != null) {
                }
            }
            OKReferenceMessage.CREATOR creator = OKReferenceMessage.CREATOR;
            InHouseIMMessageEntity quotedMessage2 = inHouseIMMessageEntity.getQuotedMessage();
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(quotedMessage2 != null ? quotedMessage2.getSenderUid() : null);
            InHouseIMMessageEntity quotedMessage3 = inHouseIMMessageEntity.getQuotedMessage();
            OKMessageContent oKMessageContent$default = quotedMessage3 != null ? C44169sFw.toOKMessageContent$default(quotedMessage3, false, 1, null) : null;
            InHouseIMMessageEntity quotedMessage4 = inHouseIMMessageEntity.getQuotedMessage();
            OKReferenceMessage oKReferenceMessageObtain = creator.obtain(strGEmmrt, oKMessageContent$default, quotedMessage4 != null ? C33129mqd.gEmmrt(java.lang.Long.valueOf(quotedMessage4.getSeq())) : null);
            oKReferenceMessageObtain.setOriginalOKMessageContent(OKStickerMessage.CREATOR.obtain(inHouseIMMessageEntity.getStickerId(), inHouseIMMessageEntity.getStickerPath()));
            return oKReferenceMessageObtain;
        }
        return OKStickerMessage.CREATOR.obtain(inHouseIMMessageEntity.getStickerId(), inHouseIMMessageEntity.getStickerPath());
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.sFw.toOKMessageContent$default(com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity, boolean, int, java.lang.Object):com.okinc.okimcore.model.im.OKMessageContent */
    public static final OKMessageContent AEQbTJ(@NotNull InHouseIMMessageEntity inHouseIMMessageEntity) {
        java.lang.String urlPathDefault;
        android.net.Uri uri;
        android.net.Uri uri2;
        Intrinsics.checkNotNullParameter(inHouseIMMessageEntity, "");
        if (Intrinsics.EZpvd((java.lang.Object) C43386roM.EZpvd.KWHzl(), (java.lang.Object) "CN")) {
            urlPathDefault = inHouseIMMessageEntity.getUrlPathCn();
        } else {
            urlPathDefault = inHouseIMMessageEntity.getUrlPathDefault();
        }
        if (urlPathDefault != null) {
            uri = android.net.Uri.parse(urlPathDefault);
            Intrinsics.checkNotNullExpressionValue(uri, "");
        } else {
            uri = null;
        }
        java.lang.String fileName = inHouseIMMessageEntity.getFileName();
        java.lang.String fileExtension = inHouseIMMessageEntity.getFileExtension();
        java.lang.Long mediaSize = inHouseIMMessageEntity.getMediaSize();
        MediaUrlPaths mediaUrlPaths = new MediaUrlPaths(inHouseIMMessageEntity.getUrlPathCn(), inHouseIMMessageEntity.getUrlPathDefault(), (java.lang.String) null, 4, (DefaultConstructorMarker) null);
        java.lang.String localUri = inHouseIMMessageEntity.getLocalUri();
        if (localUri != null) {
            android.net.Uri uri3 = android.net.Uri.parse(localUri);
            Intrinsics.checkNotNullExpressionValue(uri3, "");
            uri2 = uri3;
        } else {
            uri2 = null;
        }
        OKFileMessage oKFileMessage = new OKFileMessage(fileName, fileExtension, mediaSize, mediaUrlPaths, uri2);
        oKFileMessage.setRemoteUri(uri);
        if (inHouseIMMessageEntity.getReplySeq() == null) {
            return oKFileMessage;
        }
        InHouseIMMessageEntity quotedMessage = inHouseIMMessageEntity.getQuotedMessage();
        if (quotedMessage != null) {
            java.lang.Integer status = quotedMessage.getStatus();
            int status2 = MessageStatus.Rejected.getStatus();
            if (status != null && status.intValue() == status2) {
                return oKFileMessage;
            }
        }
        OKReferenceMessage.CREATOR creator = OKReferenceMessage.CREATOR;
        InHouseIMMessageEntity quotedMessage2 = inHouseIMMessageEntity.getQuotedMessage();
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(quotedMessage2 != null ? quotedMessage2.getSenderUid() : null);
        InHouseIMMessageEntity quotedMessage3 = inHouseIMMessageEntity.getQuotedMessage();
        OKMessageContent oKMessageContent$default = quotedMessage3 != null ? C44169sFw.toOKMessageContent$default(quotedMessage3, false, 1, null) : null;
        InHouseIMMessageEntity quotedMessage4 = inHouseIMMessageEntity.getQuotedMessage();
        OKReferenceMessage oKReferenceMessageObtain = creator.obtain(strGEmmrt, oKMessageContent$default, quotedMessage4 != null ? C33129mqd.gEmmrt(java.lang.Long.valueOf(quotedMessage4.getSeq())) : null);
        oKReferenceMessageObtain.setOriginalOKMessageContent(oKFileMessage);
        return oKReferenceMessageObtain;
    }

    public static final MultipartBody.Part copydefault(@NotNull java.io.File file, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        MultipartBody.Part.Companion companion = MultipartBody.Part.Companion;
        java.lang.String name = file.getName();
        RequestBody.Companion companion2 = RequestBody.Companion;
        java.lang.String strCopydefault = copydefault(file);
        return companion.createFormData(str, name, companion2.create(file, strCopydefault != null ? MediaType.Companion.parse(strCopydefault) : null));
    }

    public static final android.net.Uri OLrzqt(@NotNull java.io.File file, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(context, "");
        android.net.Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
        Intrinsics.checkNotNullExpressionValue(uriForFile, "");
        return uriForFile;
    }

    public static final java.lang.String copydefault(java.io.File file) {
        return android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(yFL.fetchVPNInfo(file));
    }

    public static final int OLrzqt(java.io.File file, boolean z) throws java.io.IOException {
        java.lang.Integer intOrNull;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            java.lang.String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            java.lang.Integer numValueOf = (strExtractMetadata == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(strExtractMetadata)) == null) ? null : java.lang.Integer.valueOf(intOrNull.intValue() / 1000);
            if (numValueOf == null) {
                return 0;
            }
            int iIntValue = 60;
            if (numValueOf.intValue() <= 60 || !z) {
                iIntValue = numValueOf.intValue();
            }
            return iIntValue;
        } catch (java.lang.Exception unused) {
            return 0;
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    public static final void KWHzl(android.content.Context context, java.lang.String str, java.lang.String str2, android.widget.TextView textView) {
        try {
            java.lang.Object systemService = context.getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) systemService;
            if (str == null) {
                str = "";
            }
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(str, str2 != null ? str2 : textView.getText()));
            C55326xho.toastWithSuccessfulIcon$default(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C33070mpX.AYXKKw(sDX.StateListAnimator.KWHzl)).toString(), 0, 1, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static final void copydefault(@NotNull final android.widget.TextView textView, @NotNull final android.content.Context context, final java.lang.String str, final java.lang.String str2, final Function0<Unit> function0, final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(context, "");
        try {
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.sFp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C44164sFr.AEQbTJ(function0, context, str, str2, textView, view);
                }
            });
            textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.sFv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return C44164sFr.copydefault(function02, context, str, str2, textView, view);
                }
            });
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static final void AEQbTJ(Function0 function0, android.content.Context context, java.lang.String str, java.lang.String str2, android.widget.TextView textView, android.view.View view) {
        KWHzl(context, str, str2, textView);
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final boolean copydefault(Function0 function0, android.content.Context context, java.lang.String str, java.lang.String str2, android.widget.TextView textView, android.view.View view) {
        KWHzl(context, str, str2, textView);
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    public static /* synthetic */ void trackMetaDataMediaEvent$default(java.lang.String str, MultipartBody.Part part, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) throws java.io.IOException {
        if ((i & 8) != 0) {
            str3 = null;
        }
        AEQbTJ(str, part, str2, str3);
    }

    public static final void AEQbTJ(@NotNull java.lang.String str, @NotNull MultipartBody.Part part, @NotNull java.lang.String str2, java.lang.String str3) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(part, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(part.body().contentLength()));
        MediaType mediaTypeContentType = part.body().contentType();
        java.lang.String strType = mediaTypeContentType != null ? mediaTypeContentType.type() : null;
        MediaType mediaTypeContentType2 = part.body().contentType();
        sRT.KWHzl.OLrzqt(new sRY(str, strGEmmrt, str3, strType + "/" + (mediaTypeContentType2 != null ? mediaTypeContentType2.subtype() : null), str2));
    }

    public static final OKTextMessage KWHzl(@NotNull OKTextMessage oKTextMessage) {
        Intrinsics.checkNotNullParameter(oKTextMessage, "");
        return sFF.KWHzl.OLrzqt(oKTextMessage);
    }
}

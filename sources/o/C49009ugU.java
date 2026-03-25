package o;

import com.okinc.share.api.params.IShareParams;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.ImagePreviewType;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.image.ImageSource;
import com.okinc.share.bean.link.LinkDefaultPreviewConfig;
import com.okinc.share.bean.link.LinkShareParams;
import com.okinc.share.jsbridge.bean.JSImage;
import com.okinc.share.jsbridge.bean.JSPreviewConfig;
import com.okinc.share.jsbridge.bean.JSShareConfig;
import com.okinc.share.jsbridge.bean.JSShareParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ugU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49009ugU {
    public static final C49009ugU KWHzl = new C49009ugU();

    private C49009ugU() {
    }

    public final MultiShareConfig KWHzl(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.util.List<JSShareConfig> list) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, yDY.AhwBna(), false, 0.0f, false, null, null, 62, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl.AEQbTJ(abstractActivityC33041mov, (JSShareConfig) it.next()));
        }
        return MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, arrayList, false, 0.0f, false, null, null, 62, null);
    }

    public final ShareConfig AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, JSShareConfig jSShareConfig) {
        final ISharePreviewConfig iSharePreviewConfigKWHzl;
        JSShareParams shareParams = jSShareConfig.getShareParams();
        JSPreviewConfig previewConfig = jSShareConfig.getPreviewConfig();
        int contentType = shareParams.getContentType();
        IShareParams iShareParamsCopydefault = copydefault(abstractActivityC33041mov, shareParams);
        if (previewConfig == null) {
            iSharePreviewConfigKWHzl = null;
        } else if (previewConfig.getContentType() == contentType) {
            iSharePreviewConfigKWHzl = KWHzl.KWHzl(iShareParamsCopydefault, previewConfig);
        } else {
            throw new java.lang.IllegalArgumentException("previewConfig.contentType:" + previewConfig.getContentType() + " must same with shareParams' contentType:" + contentType);
        }
        return ShareConfig.Companion.copydefault(iShareParamsCopydefault, new Function1() { // from class: o.uhb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49009ugU.EZpvd(iSharePreviewConfigKWHzl, (ShareConfig) obj);
            }
        });
    }

    public static final Unit EZpvd(ISharePreviewConfig iSharePreviewConfig, ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        if (iSharePreviewConfig != null) {
            shareConfig.setPreviewConfig(iSharePreviewConfig);
        }
        return Unit.INSTANCE;
    }

    public final ISharePreviewConfig KWHzl(IShareParams iShareParams, final JSPreviewConfig jSPreviewConfig) {
        int contentType = jSPreviewConfig.getContentType();
        ISharePreviewConfig iSharePreviewConfigKWHzl = C49285ulf.EZpvd.KWHzl(iShareParams);
        if (contentType != 1) {
            if (contentType == 2) {
                Intrinsics.copydefault(iSharePreviewConfigKWHzl, "");
                final ImageDefaultPreviewConfig imageDefaultPreviewConfig = (ImageDefaultPreviewConfig) iSharePreviewConfigKWHzl;
                java.lang.Integer imagePreviewType = jSPreviewConfig.getImagePreviewType();
                return ImageDefaultPreviewConfig.TaskDescription.create$default(ImageDefaultPreviewConfig.Companion, (imagePreviewType != null && imagePreviewType.intValue() == 1) ? ImagePreviewType.CENTER_CROP : ImagePreviewType.CENTER_INSIDE, true, null, new Function1() { // from class: o.ugW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C49009ugU.OLrzqt(jSPreviewConfig, imageDefaultPreviewConfig, (ImageDefaultPreviewConfig) obj);
                    }
                }, 4, null);
            }
            throw new java.lang.IllegalArgumentException("illegal content type:" + contentType);
        }
        Intrinsics.copydefault(iSharePreviewConfigKWHzl, "");
        LinkDefaultPreviewConfig linkDefaultPreviewConfig = (LinkDefaultPreviewConfig) iSharePreviewConfigKWHzl;
        java.lang.String linkPreviewImage = jSPreviewConfig.getLinkPreviewImage();
        ImageSource imageSourceOLrzqt = linkPreviewImage != null ? ImageSource.Companion.OLrzqt(linkPreviewImage) : null;
        LinkDefaultPreviewConfig.Activity activity = LinkDefaultPreviewConfig.Companion;
        java.lang.String previewTitle = jSPreviewConfig.getPreviewTitle();
        if (previewTitle == null) {
            previewTitle = linkDefaultPreviewConfig.getPreviewTitle();
        }
        java.lang.String previewSubtitle = jSPreviewConfig.getPreviewSubtitle();
        if (previewSubtitle == null) {
            previewSubtitle = linkDefaultPreviewConfig.getPreviewContent();
        }
        java.lang.CharSequence linkPreviewBody = jSPreviewConfig.getLinkPreviewBody();
        if (linkPreviewBody == null) {
            linkPreviewBody = linkDefaultPreviewConfig.getPreviewStyleBody();
        }
        java.lang.CharSequence charSequence = linkPreviewBody;
        if (imageSourceOLrzqt == null) {
            imageSourceOLrzqt = linkDefaultPreviewConfig.getPreviewImage();
        }
        return LinkDefaultPreviewConfig.Activity.create$default(activity, previewTitle, previewSubtitle, null, charSequence, imageSourceOLrzqt, null, 32, null);
    }

    public static final Unit OLrzqt(JSPreviewConfig jSPreviewConfig, ImageDefaultPreviewConfig imageDefaultPreviewConfig, ImageDefaultPreviewConfig imageDefaultPreviewConfig2) {
        Intrinsics.checkNotNullParameter(imageDefaultPreviewConfig2, "");
        java.lang.String previewTitle = jSPreviewConfig.getPreviewTitle();
        if (previewTitle == null) {
            previewTitle = imageDefaultPreviewConfig.getPreviewTitle();
        }
        imageDefaultPreviewConfig2.setPreviewTitle(previewTitle);
        java.lang.String previewSubtitle = jSPreviewConfig.getPreviewSubtitle();
        if (previewSubtitle == null) {
            previewSubtitle = imageDefaultPreviewConfig.getPreviewContent();
        }
        imageDefaultPreviewConfig2.setPreviewContent(previewSubtitle);
        java.lang.CharSequence imageBottomTips = jSPreviewConfig.getImageBottomTips();
        if (imageBottomTips == null) {
            imageBottomTips = imageDefaultPreviewConfig.getPreviewBottomTips();
        }
        imageDefaultPreviewConfig2.setPreviewBottomTips(imageBottomTips);
        return Unit.INSTANCE;
    }

    public final IShareParams copydefault(AbstractActivityC33041mov abstractActivityC33041mov, final JSShareParams jSShareParams) {
        ImageSource imageSourceOLrzqt;
        int contentType = jSShareParams.getContentType();
        if (contentType == 1) {
            LinkShareParams.Activity activity = LinkShareParams.Companion;
            java.lang.String linkUrl = jSShareParams.getLinkUrl();
            if (linkUrl == null) {
                linkUrl = "";
            }
            return activity.AEQbTJ(linkUrl, new Function1() { // from class: o.ugV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49009ugU.AEQbTJ(jSShareParams, (LinkShareParams) obj);
                }
            });
        }
        if (contentType == 2) {
            final JSImage image = jSShareParams.getImage();
            Intrinsics.copydefault(image);
            java.lang.String imageUrl = image.getImageUrl();
            java.lang.String imageBase64 = image.getImageBase64();
            if (imageBase64 != null && imageBase64.length() != 0) {
                android.graphics.Bitmap bitmapAEQbTJ = C49292ulm.EZpvd.AEQbTJ(imageBase64);
                if (bitmapAEQbTJ == null) {
                    throw new java.lang.RuntimeException("base64ToBitmap failed");
                }
                imageSourceOLrzqt = ImageSource.Companion.EZpvd(abstractActivityC33041mov, bitmapAEQbTJ);
            } else if (imageUrl != null && imageUrl.length() != 0) {
                imageSourceOLrzqt = ImageSource.Companion.OLrzqt(imageUrl);
            } else {
                throw new java.lang.IllegalArgumentException("invalid imageUrl:" + imageUrl);
            }
            return ImageShareParams.ActionBar.create$default(ImageShareParams.Companion, imageSourceOLrzqt, null, new Function1() { // from class: o.ugX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49009ugU.EZpvd(jSShareParams, image, (ImageShareParams) obj);
                }
            }, 2, null);
        }
        throw new java.lang.IllegalArgumentException("illegal content type:" + jSShareParams.getContentType());
    }

    public static final Unit AEQbTJ(JSShareParams jSShareParams, LinkShareParams linkShareParams) {
        Intrinsics.checkNotNullParameter(linkShareParams, "");
        java.lang.String title = jSShareParams.getTitle();
        if (title == null) {
            title = "";
        }
        linkShareParams.setTitle(title);
        java.lang.String body = jSShareParams.getBody();
        linkShareParams.setBody(body != null ? body : "");
        linkShareParams.setShareFrom(jSShareParams.getShareFrom());
        JsonObject extras = jSShareParams.getExtras();
        if (extras != null && !extras.isEmpty()) {
            linkShareParams.getExtras().putAll(C49070uhc.OLrzqt(extras));
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(JSShareParams jSShareParams, JSImage jSImage, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        java.lang.String title = jSShareParams.getTitle();
        if (title == null) {
            title = "";
        }
        imageShareParams.setTitle(title);
        java.lang.String body = jSShareParams.getBody();
        imageShareParams.setBody(body != null ? body : "");
        imageShareParams.setShareFrom(jSShareParams.getShareFrom());
        imageShareParams.setImageFooterConfig(jSImage.getFooter());
        JsonObject extras = jSShareParams.getExtras();
        if (extras != null && !extras.isEmpty()) {
            imageShareParams.getExtras().putAll(C49070uhc.OLrzqt(extras));
        }
        return Unit.INSTANCE;
    }
}

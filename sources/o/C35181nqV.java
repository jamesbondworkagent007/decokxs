package o;

import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.okimcore.model.share.IMMessageShareModelV2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35181nqV {
    public static final IMMessageShareModelV2 copydefault(@NotNull IMMessageShareModel iMMessageShareModel) {
        Intrinsics.checkNotNullParameter(iMMessageShareModel, "");
        java.lang.String bizName = iMMessageShareModel.getBizName();
        java.lang.String title = iMMessageShareModel.getTitle();
        java.lang.String content = iMMessageShareModel.getContent();
        java.lang.String messagePreview = iMMessageShareModel.getMessagePreview();
        java.lang.String image = iMMessageShareModel.getImage();
        java.lang.String imageBase64 = iMMessageShareModel.getImageBase64();
        java.lang.String deeplink = iMMessageShareModel.getDeeplink();
        java.lang.String shortLink = iMMessageShareModel.getShortLink();
        java.lang.String tagline = iMMessageShareModel.getTagline();
        IMMessageShareModel.CTAType ctaType = iMMessageShareModel.getCtaType();
        return new IMMessageShareModelV2(bizName, title, content, messagePreview, image, imageBase64, deeplink, shortLink, tagline, ctaType != null ? java.lang.Integer.valueOf(ctaType.getValue()) : null, iMMessageShareModel.getExtra());
    }
}

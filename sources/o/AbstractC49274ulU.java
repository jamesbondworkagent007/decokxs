package o;

import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import com.okinc.share.bean.image.ImageFooterConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.image.ImageSource;
import com.okinc.share.platforms.SharePlatform;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ulU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49274ulU extends AbstractC48902ueT<ImageDefaultPreviewConfig> {
    public android.graphics.Bitmap AhwBna;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.ulX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(AbstractC49274ulU.KWHzl());
        }
    });

    public abstract android.widget.ImageView OLrzqt();

    public abstract android.view.ViewGroup copydefault();

    public static final int KWHzl() {
        return C55298xhM.KWHzl(640.0f, C32979mnm.EZpvd.OLrzqt());
    }

    public final int EZpvd() {
        return ((java.lang.Number) this.djBIcL.getValue()).intValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: P */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String shareFrom;
        Intrinsics.checkNotNullParameter(view, "");
        ImageShareParams imageShareParamsRequireShareParams = requireShareParams();
        ImageDefaultPreviewConfig imageDefaultPreviewConfig = (ImageDefaultPreviewConfig) requirePreviewConfig();
        android.graphics.Rect imagePreviewPadding = imageDefaultPreviewConfig.getImagePreviewPadding();
        if (imagePreviewPadding != null) {
            C49292ulm.EZpvd.KWHzl(copydefault(), java.lang.Integer.valueOf(imagePreviewPadding.left), java.lang.Integer.valueOf(imagePreviewPadding.top), java.lang.Integer.valueOf(imagePreviewPadding.right), java.lang.Integer.valueOf(imagePreviewPadding.bottom));
        }
        ImageSource previewImageSource = imageShareParamsRequireShareParams.getPreviewImageSource();
        if (previewImageSource != null && imageDefaultPreviewConfig.isShowing()) {
            ImageFooterConfig imageFooterConfig = imageShareParamsRequireShareParams.getImageFooterConfig();
            if (imageFooterConfig != null && ((shareFrom = imageFooterConfig.getShareFrom()) == null || shareFrom.length() == 0)) {
                imageFooterConfig.setShareFrom(imageShareParamsRequireShareParams.getShareFrom());
            }
            copydefault(OLrzqt(), previewImageSource, imageFooterConfig);
            return;
        }
        notifyPreviewFirstLoaded();
    }

    /* JADX DEBUG: Method merged with bridge method: onRequestPendingShareParams(Lcom/okinc/share/platforms/SharePlatform;)Lcom/okinc/share/api/params/IShareParams; */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageShareParams onRequestPendingShareParams(@NotNull SharePlatform sharePlatform) {
        ImageShareParams imageShareParams;
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        ImageShareParams imageShareParams2 = (ImageShareParams) super.onRequestPendingShareParams(sharePlatform);
        ImageFooterConfig imageFooterConfig = requireShareParams().getImageFooterConfig();
        java.util.List<InterfaceC48901ueS> listProvideEditMenuList = provideEditMenuList();
        if (!(listProvideEditMenuList instanceof java.util.Collection) || !listProvideEditMenuList.isEmpty()) {
            java.util.Iterator<T> it = listProvideEditMenuList.iterator();
            while (it.hasNext()) {
                if (((InterfaceC48901ueS) it.next()).KWHzl()) {
                    java.lang.String strBuildCompositePreviewImagePath = buildCompositePreviewImagePath();
                    if (strBuildCompositePreviewImagePath != null) {
                        imageShareParams2.setPendingShareImagePath(strBuildCompositePreviewImagePath);
                    } else {
                        C55326xho.OLrzqt("buildPendingShareImagePath failed");
                    }
                }
            }
            if (imageFooterConfig == null) {
                android.graphics.Bitmap bitmap = this.AhwBna;
                if (bitmap != null) {
                    ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
                    Intrinsics.copydefault(bitmap);
                    java.io.File fileAEQbTJ = stateListAnimator.AEQbTJ(bitmap);
                    if (fileAEQbTJ != null) {
                        imageShareParams2.setPendingShareImagePath(fileAEQbTJ.getAbsolutePath());
                    } else {
                        C55326xho.OLrzqt("save image with footer failed");
                    }
                } else {
                    C55326xho.OLrzqt("image with footer is not loaded");
                }
            } else if (!imageShareParams2.hasPendingShareImagePath() && imageShareParams2.hasPendingShareBitmap()) {
                android.graphics.Bitmap pendingShareBitmap = imageShareParams2.getPendingShareBitmap();
                if (pendingShareBitmap != null) {
                    java.io.File fileAEQbTJ2 = ShareFileProvider.Companion.AEQbTJ(pendingShareBitmap);
                    if (fileAEQbTJ2 != null) {
                        imageShareParams2.setPendingShareImagePath(fileAEQbTJ2.getAbsolutePath());
                    } else {
                        C55326xho.OLrzqt("buildPendingShareImagePath from Bitmap failed");
                    }
                }
            } else if (imageShareParams2.hasPendingShareImagePath()) {
                pUU.KWHzl("SharePreviewer", "already exist pendingShareImagePath:" + imageShareParams2.getPendingShareImagePath());
            } else {
                android.graphics.Bitmap bitmap2 = this.AhwBna;
                if (bitmap2 != null) {
                    ShareFileProvider.StateListAnimator stateListAnimator2 = ShareFileProvider.Companion;
                    Intrinsics.copydefault(bitmap2);
                    java.io.File fileAEQbTJ3 = stateListAnimator2.AEQbTJ(bitmap2);
                    if (fileAEQbTJ3 != null) {
                        imageShareParams2.setPendingShareImagePath(fileAEQbTJ3.getAbsolutePath());
                    } else {
                        C55326xho.OLrzqt("buildShareImagePath from Bitmap failed");
                    }
                } else {
                    pUU.copydefault("SharePreviewer", "unknown case when onRequestPendingShareParams->");
                }
            }
        } else if (imageFooterConfig == null) {
        }
        InterfaceC48906ueX pendingShareParamsTransformer = imageShareParams2.getPendingShareParamsTransformer();
        return (pendingShareParamsTransformer == null || (imageShareParams = (ImageShareParams) pendingShareParamsTransformer.copydefault(imageShareParams2, sharePlatform)) == null) ? imageShareParams2 : imageShareParams;
    }

    @Override // o.AbstractC48908ueZ
    public android.graphics.Rect getPreviewBounds() {
        android.view.ViewGroup viewGroupCopydefault = copydefault();
        return new android.graphics.Rect(0, 0, viewGroupCopydefault.getWidth(), viewGroupCopydefault.getHeight());
    }

    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public android.graphics.Rect getImageBounds() {
        return new android.graphics.Rect(0, 0, OLrzqt().getWidth(), OLrzqt().getHeight());
    }

    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public android.view.ViewGroup getPreviewContainer() {
        return copydefault();
    }

    public final void copydefault(android.widget.ImageView imageView, ImageSource imageSource, ImageFooterConfig imageFooterConfig) {
        try {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            C5335Nt<android.graphics.Bitmap> c5335NtEZpvd = Glide.copydefault(fragmentActivityRequireActivity).EZpvd();
            Intrinsics.checkNotNullExpressionValue(c5335NtEZpvd, "");
            int resourceId = imageSource.getResourceId();
            android.net.Uri uri = imageSource.getUri();
            C5335Nt<android.graphics.Bitmap> c5335NtEZpvd2 = null;
            android.graphics.Bitmap bitmap = imageSource.hasBitmap() ? imageSource.getBitmap() : null;
            if (bitmap != null) {
                c5335NtEZpvd2 = c5335NtEZpvd.AEQbTJ(bitmap);
            } else if (resourceId != 0) {
                c5335NtEZpvd2 = c5335NtEZpvd.EZpvd(java.lang.Integer.valueOf(resourceId));
            } else if (uri != null) {
                c5335NtEZpvd2 = c5335NtEZpvd.EZpvd(uri);
            }
            if (c5335NtEZpvd2 != null) {
                c5335NtEZpvd.copydefault(true);
                if (imageFooterConfig != null) {
                    c5335NtEZpvd.OLrzqt((RX<?>) C5448Sc.OLrzqt(DownsampleStrategy.EZpvd));
                    c5335NtEZpvd.copydefault(EZpvd(), EZpvd());
                    c5335NtEZpvd2.copydefault((NN<android.graphics.Bitmap>) new C49279ulZ(fragmentActivityRequireActivity, imageFooterConfig));
                }
                Intrinsics.copydefault(c5335NtEZpvd2.OLrzqt((RY<android.graphics.Bitmap>) new Activity()).EZpvd(imageView));
                return;
            }
            notifyPreviewFirstLoaded();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            C55326xho.OLrzqt("loadPreviewImage->" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: o.ulU$Activity */
    public static final class Activity implements RY<android.graphics.Bitmap> {
        public Activity() {
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, boolean z) {
            AbstractC49274ulU.this.AhwBna = null;
            AbstractC49274ulU.this.notifyPreviewFirstLoaded();
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.Bitmap bitmap, java.lang.Object obj, InterfaceC5462Sq<android.graphics.Bitmap> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            AbstractC49274ulU.this.AhwBna = bitmap;
            AbstractC49274ulU.this.notifyPreviewFirstLoaded();
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AhwBna = null;
    }
}

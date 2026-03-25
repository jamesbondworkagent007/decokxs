package o;

import com.okinc.biz.share.ShareFileProvider;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ueT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48902ueT<P extends ISharePreviewConfig> extends AbstractC48908ueZ<P, ImageShareParams> {
    public static final int $stable = 8;
    private InterfaceC48898ueP mOnEditMenuClickListener;
    private final InterfaceC56387yDm mShareService$delegate = C56392yDr.copydefault(new Function0() { // from class: o.ufc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC48902ueT.mShareService_delegate$lambda$0();
        }
    });
    private final InterfaceC56387yDm mWatermarkMenuItem$delegate = C56392yDr.copydefault(new Function0() { // from class: o.ufa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC48902ueT.mWatermarkMenuItem_delegate$lambda$1();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnEditMenuClickListener(InterfaceC48898ueP interfaceC48898ueP) {
        this.mOnEditMenuClickListener = interfaceC48898ueP;
    }

    public static final InterfaceC48893ueK mShareService_delegate$lambda$0() {
        return (InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class);
    }

    public final InterfaceC48893ueK getMShareService() {
        return (InterfaceC48893ueK) this.mShareService$delegate.getValue();
    }

    public final java.io.File savePendingShareBitmapFile(@NotNull android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        return ShareFileProvider.Companion.AEQbTJ(bitmap);
    }

    /* JADX INFO: renamed from: o.ueT$Activity */
    public static final class Activity extends C48900ueR {
        public final /* synthetic */ java.util.List<InterfaceC48901ueS> EZpvd;
        public final /* synthetic */ AbstractC48902ueT<P> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends o.ueS> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(java.util.List<? extends InterfaceC48901ueS> list, AbstractC48902ueT<P> abstractC48902ueT) {
            this.EZpvd = list;
            this.copydefault = abstractC48902ueT;
        }

        @Override // o.C48900ueR, o.InterfaceC48898ueP
        public boolean AEQbTJ(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            InterfaceC48898ueP interfaceC48898ueP = ((AbstractC48902ueT) this.copydefault).mOnEditMenuClickListener;
            if (interfaceC48898ueP != null) {
                return interfaceC48898ueP.AEQbTJ(view);
            }
            return false;
        }

        @Override // o.C48900ueR, o.InterfaceC48898ueP
        public void OLrzqt(int i, InterfaceC48901ueS interfaceC48901ueS, android.view.View view) {
            Intrinsics.checkNotNullParameter(interfaceC48901ueS, "");
            Intrinsics.checkNotNullParameter(view, "");
            interfaceC48901ueS.EZpvd(this.copydefault);
            InterfaceC48898ueP interfaceC48898ueP = ((AbstractC48902ueT) this.copydefault).mOnEditMenuClickListener;
            if (interfaceC48898ueP != null) {
                interfaceC48898ueP.OLrzqt(i, interfaceC48901ueS, view);
            }
        }

        @Override // o.C48900ueR, o.InterfaceC48898ueP
        public boolean copydefault(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            java.util.List<InterfaceC48901ueS> list = this.EZpvd;
            AbstractC48902ueT<P> abstractC48902ueT = this.copydefault;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC48901ueS) it.next()).copydefault(abstractC48902ueT);
            }
            InterfaceC48898ueP interfaceC48898ueP = ((AbstractC48902ueT) this.copydefault).mOnEditMenuClickListener;
            if (interfaceC48898ueP != null) {
                return interfaceC48898ueP.copydefault(view);
            }
            return false;
        }
    }

    public final void showEditMenu(java.util.List<? extends InterfaceC48901ueS> list) {
        InterfaceC48892ueJ shareDialog = getShareDialog();
        if (shareDialog != null) {
            shareDialog.KWHzl(list, new Activity(list, this));
        }
    }

    public final java.lang.String buildCompositePreviewImagePath() {
        android.graphics.Bitmap bitmapCopydefault;
        java.io.File fileSavePendingShareBitmapFile;
        android.graphics.Rect imageBounds = getImageBounds();
        android.view.ViewGroup previewContainer = getPreviewContainer();
        try {
            android.graphics.Rect previewBounds = getPreviewBounds();
            if (imageBounds != null && !Intrinsics.EZpvd(previewBounds, imageBounds)) {
                bitmapCopydefault = android.graphics.Bitmap.createBitmap(C33570myu.copydefault((android.view.View) previewContainer, true), imageBounds.left, imageBounds.top, imageBounds.width(), imageBounds.height());
            } else {
                bitmapCopydefault = C33570myu.copydefault((android.view.View) previewContainer, true);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            bitmapCopydefault = null;
        } catch (java.lang.OutOfMemoryError e2) {
            e2.printStackTrace();
            bitmapCopydefault = null;
        }
        if (bitmapCopydefault == null || (fileSavePendingShareBitmapFile = savePendingShareBitmapFile(bitmapCopydefault)) == null) {
            return null;
        }
        return fileSavePendingShareBitmapFile.getAbsolutePath();
    }

    public final java.lang.String buildTargetViewImagePath(android.view.View view) {
        android.graphics.Bitmap bitmapAEQbTJ;
        java.io.File fileSavePendingShareBitmapFile;
        if (view == null) {
            return null;
        }
        try {
            bitmapAEQbTJ = C33570myu.AEQbTJ(view, true);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            bitmapAEQbTJ = null;
        } catch (java.lang.OutOfMemoryError e2) {
            e2.printStackTrace();
            bitmapAEQbTJ = null;
        }
        if (bitmapAEQbTJ == null || (fileSavePendingShareBitmapFile = savePendingShareBitmapFile(bitmapAEQbTJ)) == null) {
            return null;
        }
        return fileSavePendingShareBitmapFile.getAbsolutePath();
    }

    public final boolean closeShareDialog() {
        InterfaceC48892ueJ shareDialog = getShareDialog();
        if (shareDialog == null) {
            return false;
        }
        shareDialog.EZpvd().dismiss();
        return true;
    }

    private final InterfaceC48901ueS getMWatermarkMenuItem() {
        return (InterfaceC48901ueS) this.mWatermarkMenuItem$delegate.getValue();
    }

    public static final InterfaceC48901ueS mWatermarkMenuItem_delegate$lambda$1() {
        return ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).copydefault(null, null, null, java.lang.Float.valueOf(0.8f), false);
    }

    @Override // o.AbstractC48908ueZ
    public java.util.List<InterfaceC48901ueS> provideEditMenuList() {
        return C56402yEa.EZpvd(getMWatermarkMenuItem());
    }

    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public void onEditClick() {
        super.onEditClick();
        showEditMenu(provideEditMenuList());
    }
}

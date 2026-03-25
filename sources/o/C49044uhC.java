package o;

import com.okinc.biz.share.ShareFileProvider;
import com.okinc.share.bean.image.ImageCustomLuaPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.platforms.SharePlatform;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uhC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49044uhC extends AbstractC48902ueT<ImageCustomLuaPreviewConfig> {
    public android.view.View EZpvd;
    public C49019uge KWHzl;
    public java.util.List<? extends InterfaceC48901ueS> copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final int OLrzqt = C48931uew.Application.AYXKKw;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.uhA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49044uhC.EZpvd(this.EZpvd);
        }
    });

    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public android.graphics.Rect getImageBounds() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.uhC$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uhC.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C49044uhC OLrzqt() {
            android.os.Bundle bundle = new android.os.Bundle();
            C49044uhC c49044uhC = new C49044uhC();
            c49044uhC.setArguments(bundle);
            return c49044uhC;
        }
    }

    public static final android.widget.FrameLayout EZpvd(C49044uhC c49044uhC) {
        C49019uge c49019uge = c49044uhC.KWHzl;
        if (c49019uge == null) {
            Intrinsics.gEmmrt("");
            c49019uge = null;
        }
        return c49019uge.copydefault;
    }

    private final android.view.ViewGroup OLrzqt() {
        java.lang.Object value = this.AhwBna.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.view.ViewGroup) value;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: P */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C49019uge c49019ugeKWHzl = C49019uge.KWHzl(view);
        Intrinsics.copydefault(c49019ugeKWHzl);
        this.KWHzl = c49019ugeKWHzl;
        ImageCustomLuaPreviewConfig imageCustomLuaPreviewConfig = (ImageCustomLuaPreviewConfig) requirePreviewConfig();
        android.view.View previewLuaView = imageCustomLuaPreviewConfig.getPreviewLuaView();
        this.EZpvd = previewLuaView;
        copydefault(previewLuaView);
        this.copydefault = imageCustomLuaPreviewConfig.getMenuItems();
        notifyPreviewFirstLoaded();
        view.post(new java.lang.Runnable() { // from class: o.uhH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49044uhC.OLrzqt(this.AEQbTJ);
            }
        });
    }

    public static final void OLrzqt(C49044uhC c49044uhC) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c49044uhC, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void copydefault(android.view.View view) {
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            if (parent == null) {
                OLrzqt().addView(view);
            } else {
                if (OLrzqt().indexOfChild(view) != -1) {
                    return;
                }
                ((android.view.ViewGroup) parent).removeView(view);
                OLrzqt().addView(view);
            }
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.ueS>, java.util.List<o.ueS> */
    @Override // o.AbstractC48902ueT, o.AbstractC48908ueZ
    public java.util.List<InterfaceC48901ueS> provideEditMenuList() {
        java.util.List list = this.copydefault;
        return list == null ? yDY.AhwBna() : list;
    }

    /* JADX DEBUG: Method merged with bridge method: onRequestPendingShareParams(Lcom/okinc/share/platforms/SharePlatform;)Lcom/okinc/share/api/params/IShareParams; */
    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ImageShareParams onRequestPendingShareParams(@NotNull SharePlatform sharePlatform) {
        ImageShareParams imageShareParams;
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        ImageShareParams imageShareParams2 = (ImageShareParams) super.onRequestPendingShareParams(sharePlatform);
        java.util.List<InterfaceC48901ueS> listProvideEditMenuList = provideEditMenuList();
        if ((listProvideEditMenuList instanceof java.util.Collection) && listProvideEditMenuList.isEmpty()) {
            if (!imageShareParams2.hasPendingShareImagePath() && imageShareParams2.hasPendingShareBitmap()) {
                android.graphics.Bitmap pendingShareBitmap = imageShareParams2.getPendingShareBitmap();
                if (pendingShareBitmap != null) {
                    java.io.File fileAEQbTJ = ShareFileProvider.Companion.AEQbTJ(pendingShareBitmap);
                    if (fileAEQbTJ != null) {
                        imageShareParams2.setPendingShareImagePath(fileAEQbTJ.getAbsolutePath());
                    } else {
                        C55326xho.OLrzqt("buildPendingShareImagePath from Bitmap failed");
                    }
                }
            } else if (imageShareParams2.hasPendingShareImagePath()) {
                pUU.KWHzl("SharePreviewer", "already exist pendingShareImagePath:" + imageShareParams2.getPendingShareImagePath());
            } else {
                android.view.View view = this.EZpvd;
                if (view != null) {
                    Intrinsics.copydefault(view);
                    java.lang.String strBuildTargetViewImagePath = buildTargetViewImagePath(KWHzl(view));
                    if (strBuildTargetViewImagePath != null) {
                        imageShareParams2.setPendingShareImagePath(strBuildTargetViewImagePath);
                    } else {
                        C55326xho.OLrzqt("buildImagePath of PreViewLuaView failed");
                    }
                    pUU.copydefault("SharePreviewer", "unknown case when onRequestPendingShareParams->");
                } else {
                    java.lang.String strBuildCompositePreviewImagePath = buildCompositePreviewImagePath();
                    if (strBuildCompositePreviewImagePath != null) {
                        imageShareParams2.setPendingShareImagePath(strBuildCompositePreviewImagePath);
                    } else {
                        C55326xho.OLrzqt("buildCompositePreviewImagePath failed");
                    }
                }
            }
        } else {
            java.util.Iterator<T> it = listProvideEditMenuList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((InterfaceC48901ueS) it.next()).KWHzl()) {
                    android.view.View view2 = this.EZpvd;
                    if (view2 != null) {
                        Intrinsics.copydefault(view2);
                        java.lang.String strBuildTargetViewImagePath2 = buildTargetViewImagePath(KWHzl(view2));
                        if (strBuildTargetViewImagePath2 != null) {
                            imageShareParams2.setPendingShareImagePath(strBuildTargetViewImagePath2);
                        } else {
                            C55326xho.OLrzqt("buildTargetViewImagePath failed");
                        }
                    }
                }
            }
        }
        InterfaceC48906ueX pendingShareParamsTransformer = imageShareParams2.getPendingShareParamsTransformer();
        return (pendingShareParamsTransformer == null || (imageShareParams = (ImageShareParams) pendingShareParamsTransformer.copydefault(imageShareParams2, sharePlatform)) == null) ? imageShareParams2 : imageShareParams;
    }

    public final android.view.View KWHzl(android.view.View view) {
        try {
            if (!(view instanceof C7542alm)) {
                return view;
            }
            android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
            android.view.View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
            android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            android.view.View childAt2 = viewGroup2 != null ? viewGroup2.getChildAt(0) : null;
            return childAt2 == null ? view : childAt2;
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "getSnapShootView error->" + e.getMessage());
            return view;
        }
    }

    @Override // o.AbstractC48908ueZ
    public android.graphics.Rect getPreviewBounds() {
        android.view.ViewGroup viewGroupOLrzqt = OLrzqt();
        return new android.graphics.Rect(0, 0, viewGroupOLrzqt.getWidth(), viewGroupOLrzqt.getHeight());
    }

    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public android.view.ViewGroup getPreviewContainer() {
        return OLrzqt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.EZpvd = null;
        this.copydefault = null;
    }
}

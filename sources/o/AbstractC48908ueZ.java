package o;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.Glide;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageSource;
import com.okinc.share.platforms.SharePlatform;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ueZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48908ueZ<P extends ISharePreviewConfig, T extends IShareParams> extends AbstractC32996moC implements InterfaceC48969ufh<T, P> {
    public static final java.lang.String EXTRA_INDEX = "extra_index";
    public static final java.lang.String EXTRA_IS_MULTI_SHARE = "extra_is_multi_share";
    public static final java.lang.String EXTRA_PREVIEW_CONFIG = "extra_preview_config";
    public static final java.lang.String EXTRA_SHARE_PARAMS = "extra_share_params";
    private android.view.View mRootView;
    private final InterfaceC56387yDm shareDialogSharedViewModel$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0() { // from class: o.uff
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C48971ufj.KWHzl(this.copydefault);
        }
    });
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o.ueZ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ueZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void AEQbTJ(@NotNull ShareConfig shareConfig, int i, boolean z, @NotNull androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(shareConfig, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(AbstractC48908ueZ.EXTRA_SHARE_PARAMS, shareConfig.getShareParams());
            bundle.putParcelable(AbstractC48908ueZ.EXTRA_PREVIEW_CONFIG, shareConfig.getPreviewConfig());
            bundle.putInt(AbstractC48908ueZ.EXTRA_INDEX, i);
            bundle.putBoolean(AbstractC48908ueZ.EXTRA_IS_MULTI_SHARE, z);
            fragment.setArguments(bundle);
        }
    }

    public final C48974ufm getShareDialogSharedViewModel() {
        return (C48974ufm) this.shareDialogSharedViewModel$delegate.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.view.View view = this.mRootView;
        if (view == null) {
            android.view.View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
            Intrinsics.copydefault(viewOnCreateView);
            this.mRootView = viewOnCreateView;
            if (viewOnCreateView != null) {
                return viewOnCreateView;
            }
            Intrinsics.gEmmrt("");
        } else {
            if (view != null) {
                return view;
            }
            Intrinsics.gEmmrt("");
        }
        return null;
    }

    @Override // o.InterfaceC48969ufh
    public T requireShareParams() {
        android.os.Parcelable parcelable = requireArguments().getParcelable(EXTRA_SHARE_PARAMS);
        Intrinsics.copydefault(parcelable);
        return (T) parcelable;
    }

    @Override // o.InterfaceC48969ufh
    public int requirePageIndex() {
        return requireArguments().getInt(EXTRA_INDEX, -1);
    }

    @Override // o.InterfaceC48969ufh
    public boolean isMultiShare() {
        return requireArguments().getBoolean(EXTRA_IS_MULTI_SHARE, false);
    }

    public P requirePreviewConfig() {
        android.os.Parcelable parcelable = requireArguments().getParcelable(EXTRA_PREVIEW_CONFIG);
        Intrinsics.copydefault(parcelable);
        return (P) parcelable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: androidx.fragment.app.Fragment */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: androidx.fragment.app.Fragment */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: androidx.fragment.app.Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC48969ufh
    public InterfaceC48892ueJ getShareDialog() {
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        while (parentFragment != 0 && !(parentFragment instanceof InterfaceC48892ueJ)) {
            parentFragment = parentFragment.getParentFragment();
        }
        if (parentFragment instanceof InterfaceC48892ueJ) {
            return (InterfaceC48892ueJ) parentFragment;
        }
        return null;
    }

    public T onRequestPendingShareParams(@NotNull SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        return (T) requireShareParams();
    }

    public android.graphics.Rect getPreviewBounds() {
        throw new java.lang.UnsupportedOperationException("subclass must implementation this method");
    }

    public android.graphics.Rect getImageBounds() {
        throw new java.lang.UnsupportedOperationException("subclass must implementation this method");
    }

    public android.view.ViewGroup getPreviewContainer() {
        throw new java.lang.UnsupportedOperationException("subclass must implementation this method");
    }

    public java.util.List<InterfaceC48901ueS> provideEditMenuList() {
        return yDY.AhwBna();
    }

    public void onEditClick() {
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).OLrzqt(this);
    }

    public final void notifyPreviewFirstLoaded() {
        InterfaceC48892ueJ shareDialog = getShareDialog();
        if (shareDialog != null) {
            shareDialog.AuCTel();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ueZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadImageSource$default(AbstractC48908ueZ abstractC48908ueZ, ImageSource imageSource, android.widget.ImageView imageView, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadImageSource");
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: o.ufd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return AbstractC48908ueZ.loadImageSource$lambda$1((android.graphics.drawable.Drawable) obj2);
                }
            };
        }
        if ((i & 8) != 0) {
            function12 = new Function1() { // from class: o.ufg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return AbstractC48908ueZ.loadImageSource$lambda$2((java.lang.Throwable) obj2);
                }
            };
        }
        abstractC48908ueZ.loadImageSource(imageSource, imageView, function1, function12);
    }

    public static final Unit loadImageSource$lambda$1(android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "");
        return Unit.INSTANCE;
    }

    public static final Unit loadImageSource$lambda$2(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void loadImageSource(@NotNull ImageSource imageSource, android.widget.ImageView imageView, @NotNull Function1<? super android.graphics.drawable.Drawable, Unit> function1, @NotNull Function1<? super java.lang.Throwable, Unit> function12) {
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd;
        Intrinsics.checkNotNullParameter(imageSource, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        try {
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrEZpvd = Glide.EZpvd(this);
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrEZpvd, "");
            int resourceId = imageSource.getResourceId();
            android.net.Uri uri = imageSource.getUri();
            android.graphics.Bitmap bitmap = imageSource.hasBitmap() ? imageSource.getBitmap() : null;
            if (bitmap != null) {
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    android.graphics.drawable.Drawable drawable = imageView.getDrawable();
                    Intrinsics.checkNotNullExpressionValue(drawable, "");
                    function1.invoke(drawable);
                    return;
                }
                function1.invoke(new BitmapDrawable(bitmap));
                return;
            }
            if (resourceId != 0) {
                c5335NtEZpvd = componentCallbacks2C5333NrEZpvd.OLrzqt(java.lang.Integer.valueOf(resourceId));
            } else {
                c5335NtEZpvd = uri != null ? componentCallbacks2C5333NrEZpvd.EZpvd(uri) : null;
            }
            if (c5335NtEZpvd == null) {
                function12.invoke(null);
                Unit unit = Unit.INSTANCE;
            } else if (imageView != null) {
                InterfaceC5462Sq interfaceC5462SqOLrzqt = c5335NtEZpvd.OLrzqt(new ActionBar(imageView, function1));
                Intrinsics.copydefault(interfaceC5462SqOLrzqt);
            } else {
                InterfaceC5462Sq interfaceC5462SqOLrzqt2 = c5335NtEZpvd.OLrzqt(new Application(function1));
                Intrinsics.copydefault(interfaceC5462SqOLrzqt2);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            function12.invoke(e);
        }
    }

    /* JADX INFO: renamed from: o.ueZ$ActionBar */
    public static final class ActionBar extends C5452Sg {
        public final /* synthetic */ Function1<android.graphics.drawable.Drawable, Unit> AYXKKw;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(android.widget.ImageView imageView, Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
            super(imageView);
            this.AYXKKw = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.AbstractC5458Sm, o.InterfaceC5462Sq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            super.copydefault(drawable, interfaceC5460So);
            this.AYXKKw.invoke(drawable);
        }
    }

    /* JADX INFO: renamed from: o.ueZ$Application */
    public static final class Application extends AbstractC5454Si<android.graphics.drawable.Drawable> {
        public final /* synthetic */ Function1<android.graphics.drawable.Drawable, Unit> KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
            this.KWHzl = function1;
        }

        @Override // o.InterfaceC5462Sq
        public /* bridge */ /* synthetic */ void copydefault(java.lang.Object obj, InterfaceC5460So interfaceC5460So) {
            copydefault((android.graphics.drawable.Drawable) obj, (InterfaceC5460So<? super android.graphics.drawable.Drawable>) interfaceC5460So);
        }

        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            this.KWHzl.invoke(drawable);
        }
    }
}

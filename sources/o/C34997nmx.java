package o;

import com.okinc.biz.share.ShareFileProvider;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageShareParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC48895ueM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nmx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34997nmx {
    public static final int EZpvd = AbstractActivityC33041mov.$stable;
    public final AbstractActivityC33041mov KWHzl;

    public C34997nmx(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.KWHzl = abstractActivityC33041mov;
    }

    public final void AEQbTJ(@NotNull final android.view.View view, @NotNull final java.lang.String str) {
        android.view.Display defaultDisplay;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.WindowManager windowManager = this.KWHzl.getWindowManager();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        final int i = displayMetrics.widthPixels;
        final int i2 = displayMetrics.heightPixels;
        final C49352umt c49352umt = new C49352umt(this.KWHzl);
        InterfaceC48895ueM.Application.setSrcFrom$default(c49352umt, null, new Function0() { // from class: o.nmC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34997nmx.OLrzqt(c49352umt, i, i2, view, this, str);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(C49352umt c49352umt, int i, int i2, android.view.View view, final C34997nmx c34997nmx, final java.lang.String str) {
        C33487mxQ.EZpvd(c49352umt, i, i2);
        android.graphics.Bitmap bitmapOLrzqt = C33487mxQ.OLrzqt(view, c49352umt);
        ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
        Intrinsics.copydefault(bitmapOLrzqt);
        stateListAnimator.copydefault(bitmapOLrzqt, c34997nmx.KWHzl, new Function1() { // from class: o.nmv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34997nmx.KWHzl((java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.nmB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34997nmx.AEQbTJ(this.OLrzqt, str, (java.io.File) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C34997nmx c34997nmx, final java.lang.String str, java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        java.lang.String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).copydefault(c34997nmx.KWHzl, ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.KWHzl(absolutePath, new Function1() { // from class: o.nmz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34997nmx.AEQbTJ(str, (ImageShareParams) obj);
            }
        }), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom(str);
        return Unit.INSTANCE;
    }
}

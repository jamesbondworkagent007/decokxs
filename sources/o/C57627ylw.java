package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.okuser.data.User;
import com.okinc.share.bean.ImagePreviewType;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.image.ImageSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C28102kOz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ylw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C57627ylw {
    public static final C57627ylw AEQbTJ = new C57627ylw();

    private C57627ylw() {
    }

    public final void copydefault(@NotNull final FragmentActivity fragmentActivity, boolean z, java.lang.String str, @NotNull final java.lang.String str2, java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, java.lang.Boolean bool) {
        java.lang.String nickname;
        java.lang.String str6 = "";
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        final C57580ylB c57580ylB = new C57580ylB(fragmentActivity, null, 0, 6, null);
        c57580ylB.setLayoutDirection(fragmentActivity.getResources().getConfiguration().getLayoutDirection() != 1 ? 0 : 1);
        User userOLrzqt = ((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB().OLrzqt();
        if (userOLrzqt != null && (nickname = userOLrzqt.getNickname()) != null) {
            str6 = nickname;
        }
        if (str == null || str.length() == 0) {
            str = str6;
        }
        c57580ylB.copydefault(z, str, str2, new Function1() { // from class: o.ylA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57627ylw.AEQbTJ(fragmentActivity, c57580ylB, str4, str2, str5, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AEQbTJ(FragmentActivity fragmentActivity, C57580ylB c57580ylB, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        AEQbTJ.EZpvd(fragmentActivity, c57580ylB, str, str2, str3);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final FragmentActivity fragmentActivity, C57580ylB c57580ylB, final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        android.graphics.Bitmap bitmapAEQbTJ = null;
        C33487mxQ.EZpvd(c57580ylB, C55298xhM.dpInt$default(375, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(750, (android.content.Context) null, 1, (java.lang.Object) null));
        try {
            bitmapAEQbTJ = C33570myu.AEQbTJ((android.view.View) c57580ylB, true);
        } catch (java.lang.Exception e) {
            pUU.KWHzl("WholeSaleShareUtils", "View convert to Bitmap error:" + e.getMessage());
        }
        android.graphics.Bitmap bitmap = bitmapAEQbTJ;
        if (bitmap == null) {
            return;
        }
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(ImageShareParams.ActionBar.create$default(ImageShareParams.Companion, fragmentActivity, bitmap, (ImageSource) null, new Function1() { // from class: o.ylC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57627ylw.OLrzqt(str, fragmentActivity, str2, (ImageShareParams) obj);
            }
        }, 4, (java.lang.Object) null), new Function1() { // from class: o.ylD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57627ylw.KWHzl(str3, fragmentActivity, (ShareConfig) obj);
            }
        });
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43251rlk.OLrzqt(InterfaceC48893ueK.class);
        if (interfaceC48893ueK != null) {
            Intrinsics.copydefault(fragmentActivity, "");
            interfaceC48893ueK.copydefault((AbstractActivityC33041mov) fragmentActivity, shareConfigCopydefault);
        }
    }

    public static final Unit OLrzqt(java.lang.String str, FragmentActivity fragmentActivity, java.lang.String str2, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom(str);
        android.content.res.Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        imageShareParams.setBody(C33069mpW.copydefault(resources, C28102kOz.Fragment.fJNWhG, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("link", str2))));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, final FragmentActivity fragmentActivity, ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageDefaultPreviewConfig.TaskDescription.create$default(ImageDefaultPreviewConfig.Companion, ImagePreviewType.CENTER_INSIDE, true, null, new Function1() { // from class: o.ylz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57627ylw.copydefault(fragmentActivity, (ImageDefaultPreviewConfig) obj);
            }
        }, 4, null));
        shareConfig.getPreviewConfig().setPreviewBottomTips(str);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(FragmentActivity fragmentActivity, ImageDefaultPreviewConfig imageDefaultPreviewConfig) {
        Intrinsics.checkNotNullParameter(imageDefaultPreviewConfig, "");
        imageDefaultPreviewConfig.setPreviewTitle(fragmentActivity.getResources().getString(C28102kOz.Fragment.DbNXlk));
        return Unit.INSTANCE;
    }
}

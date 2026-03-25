package o;

import android.view.View;
import android.view.ViewGroup;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.ImagePreviewType;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.link.LinkShareParams;
import com.okinc.share.bean.text.TextShareParams;
import com.okinc.share.platforms.SharePlatform;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ubp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48765ubp implements InterfaceC7380aij {
    @Override // o.InterfaceC7380aij
    public java.util.Set<java.lang.String> KWHzl() {
        return yEE.AhwBna("GoToReferralPerformShare", "GoToReferralClaimShare", "GoToSubAccount");
    }

    @Override // o.InterfaceC7380aij
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull InterfaceC7379aii interfaceC7379aii) {
        AbstractActivityC33041mov abstractActivityC33041mov;
        InterfaceC8104awT interfaceC8104awT;
        IShareParams iShareParamsEZpvd;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC7379aii, "");
        int iHashCode = str.hashCode();
        if (iHashCode != -531341437) {
            if (iHashCode == -48481840) {
                if (str.equals("GoToSubAccount")) {
                    abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
                    if (abstractActivityC33041mov == null || (interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class)) == null) {
                        return;
                    }
                    interfaceC8104awT.AEQbTJ((android.app.Activity) abstractActivityC33041mov);
                    return;
                }
                return;
            }
            if (iHashCode == 703868798 && str.equals("GoToReferralPerformShare") && map != null) {
                int iAhwBna = C33129mqd.AhwBna(map.get(MTPushConstants.PlatformNode.KEY_PLATFORM));
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(map.get("content"));
                java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(map.get("url"));
                java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(map.get("shareFrom"));
                if (context instanceof AbstractActivityC33041mov) {
                    SharePlatform sharePlatformCopydefault = copydefault(iAhwBna);
                    if (sharePlatformCopydefault == SharePlatform.QRCODE) {
                        iShareParamsEZpvd = copydefault(strGEmmrt2, strGEmmrt3);
                    } else {
                        iShareParamsEZpvd = EZpvd(strGEmmrt, strGEmmrt3);
                    }
                    ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).KWHzl((android.app.Activity) context, iShareParamsEZpvd, sharePlatformCopydefault, null);
                    return;
                }
                return;
            }
            return;
        }
        if (str.equals("GoToReferralClaimShare") && map != null) {
            final java.lang.String str2 = (java.lang.String) map.get("previewTitle");
            final java.lang.String str3 = (java.lang.String) map.get("previewContent");
            final java.lang.String str4 = (java.lang.String) map.get("url");
            final java.lang.String str5 = (java.lang.String) map.get("body");
            final java.lang.String str6 = (java.lang.String) map.get("shareFrom");
            final java.lang.Boolean bool = (java.lang.Boolean) map.get("isEditorEnable");
            java.lang.Boolean bool2 = (java.lang.Boolean) map.get("hasFooter");
            java.lang.Object obj = map.get("shareContentView");
            Intrinsics.copydefault(obj, "");
            android.view.View viewF_ = ((UDViewGroup) obj).f_();
            Intrinsics.copydefault(map.get("width"), "");
            float fKWHzl = C33570myu.KWHzl(context, ((java.lang.Integer) r8).intValue());
            Intrinsics.copydefault(map.get("height"), "");
            C33487mxQ.EZpvd(viewF_, (int) fKWHzl, (int) C33570myu.KWHzl(context, ((java.lang.Integer) r13).intValue()));
            abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
            if (abstractActivityC33041mov != null) {
                if (Intrinsics.EZpvd(bool2, java.lang.Boolean.TRUE)) {
                    Intrinsics.checkNotNullExpressionValue(viewF_, "");
                    viewF_ = AEQbTJ(abstractActivityC33041mov, viewF_, fKWHzl, str6);
                }
                android.graphics.Bitmap bitmapAEQbTJ = C33570myu.AEQbTJ(viewF_, true);
                ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
                Intrinsics.copydefault(bitmapAEQbTJ);
                java.io.File fileAEQbTJ = stateListAnimator.AEQbTJ(bitmapAEQbTJ);
                Intrinsics.copydefault(fileAEQbTJ);
                ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
                java.lang.String absolutePath = fileAEQbTJ.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "");
                ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).copydefault(abstractActivityC33041mov, ShareConfig.Companion.copydefault(actionBar.KWHzl(absolutePath, new Function1() { // from class: o.ubq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C48765ubp.copydefault(str4, str5, str6, (ImageShareParams) obj2);
                    }
                }), new Function1() { // from class: o.ubr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C48765ubp.EZpvd(str2, str3, bool, (ShareConfig) obj2);
                    }
                }));
            }
        }
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        if (str == null) {
            str = "";
        }
        imageShareParams.setSubtitle(str);
        if (str2 == null) {
            str2 = "";
        }
        imageShareParams.setBody(str2);
        if (str3 == null) {
            str3 = "";
        }
        imageShareParams.setShareFrom(str3);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final java.lang.String str, final java.lang.String str2, final java.lang.Boolean bool, ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageDefaultPreviewConfig.TaskDescription.create$default(ImageDefaultPreviewConfig.Companion, ImagePreviewType.CENTER_INSIDE, true, null, new Function1() { // from class: o.ubu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48765ubp.KWHzl(str, str2, bool, (ImageDefaultPreviewConfig) obj);
            }
        }, 4, null));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, ImageDefaultPreviewConfig imageDefaultPreviewConfig) {
        Intrinsics.checkNotNullParameter(imageDefaultPreviewConfig, "");
        imageDefaultPreviewConfig.setPreviewTitle(str);
        imageDefaultPreviewConfig.setPreviewContent(str2);
        imageDefaultPreviewConfig.setEditable(bool != null ? bool.booleanValue() : false);
        return Unit.INSTANCE;
    }

    public final android.view.ViewGroup AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, android.view.View view, float f, java.lang.String str) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(abstractActivityC33041mov);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        C49352umt c49352umt = new C49352umt(abstractActivityC33041mov);
        if (str == null) {
            str = "";
        }
        c49352umt.setFrom(str);
        linearLayout.addView(view);
        linearLayout.addView(c49352umt);
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec((int) f, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        linearLayout.layout(0, 0, linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
        return linearLayout;
    }

    public final LinkShareParams copydefault(java.lang.String str, final java.lang.String str2) {
        return LinkShareParams.Companion.AEQbTJ(str, new Function1() { // from class: o.ubt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48765ubp.AEQbTJ(str2, (LinkShareParams) obj);
            }
        });
    }

    public static final Unit AEQbTJ(java.lang.String str, LinkShareParams linkShareParams) {
        Intrinsics.checkNotNullParameter(linkShareParams, "");
        linkShareParams.setShareFrom(str);
        return Unit.INSTANCE;
    }

    public final TextShareParams EZpvd(final java.lang.String str, final java.lang.String str2) {
        return TextShareParams.Companion.KWHzl("", str, new Function1() { // from class: o.ubs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48765ubp.AEQbTJ(str, str2, (TextShareParams) obj);
            }
        });
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, TextShareParams textShareParams) {
        Intrinsics.checkNotNullParameter(textShareParams, "");
        textShareParams.setSmsBody(str);
        textShareParams.setEmailBody(str);
        textShareParams.setSubtitle(str);
        textShareParams.setShareFrom(str2);
        return Unit.INSTANCE;
    }

    public final SharePlatform copydefault(int i) {
        SharePlatform sharePlatformKWHzl;
        if (i == -1) {
            return SharePlatform.MORE;
        }
        InterfaceC48893ueK interfaceC48893ueK = (InterfaceC48893ueK) C43251rlk.OLrzqt(InterfaceC48893ueK.class);
        return (interfaceC48893ueK == null || (sharePlatformKWHzl = interfaceC48893ueK.KWHzl(i)) == null) ? SharePlatform.MORE : sharePlatformKWHzl;
    }
}

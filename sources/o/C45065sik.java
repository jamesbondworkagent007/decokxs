package o;

import com.okinc.okex.center.bean.PopupAnnouncementInfoBean;
import com.okinc.okex.center.bean.PopupAnnouncementItem;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.SelfServiceTools;
import com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel;
import com.okinc.okex.center.ui.fragment.PopupAnnouncementDialogFragment;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45065sik {
    public static final AnnouncementPopupDisplayModel OLrzqt(@NotNull PopupAnnouncementInfoBean popupAnnouncementInfoBean) {
        java.util.List<SelfServiceToolBean> list;
        java.util.List<SelfServiceToolBean> list2;
        Intrinsics.checkNotNullParameter(popupAnnouncementInfoBean, "");
        if (popupAnnouncementInfoBean.getPopupAnnouncement() == null && (popupAnnouncementInfoBean.getSelfServiceTools() == null || (list2 = popupAnnouncementInfoBean.getSelfServiceTools().getList()) == null || list2.isEmpty())) {
            return null;
        }
        PopupAnnouncementItem popupAnnouncement = popupAnnouncementInfoBean.getPopupAnnouncement();
        java.lang.String title = popupAnnouncement != null ? popupAnnouncement.getTitle() : null;
        if (title == null) {
            title = "";
        }
        PopupAnnouncementItem popupAnnouncement2 = popupAnnouncementInfoBean.getPopupAnnouncement();
        java.lang.String htmlContent = popupAnnouncement2 != null ? popupAnnouncement2.getHtmlContent() : null;
        java.lang.String str = htmlContent != null ? htmlContent : "";
        SelfServiceTools selfServiceTools = popupAnnouncementInfoBean.getSelfServiceTools();
        SelfServiceToolBean selfServiceToolBean = (selfServiceTools == null || (list = selfServiceTools.getList()) == null) ? null : (SelfServiceToolBean) CollectionsKt___CollectionsKt.firstOrNull(list);
        PopupAnnouncementItem popupAnnouncement3 = popupAnnouncementInfoBean.getPopupAnnouncement();
        return new AnnouncementPopupDisplayModel(popupAnnouncement3 != null ? popupAnnouncement3.getId() : null, title, str, selfServiceToolBean);
    }

    public static final void OLrzqt(final AnnouncementPopupDisplayModel announcementPopupDisplayModel, @NotNull final androidx.fragment.app.FragmentManager fragmentManager) {
        java.lang.String content;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (announcementPopupDisplayModel == null) {
            return;
        }
        java.lang.String title = announcementPopupDisplayModel.getTitle();
        if (((title == null || title.length() == 0) && (((content = announcementPopupDisplayModel.getContent()) == null || content.length() == 0) && announcementPopupDisplayModel.getCtaSelfServiceTool() == null)) || fragmentManager.isStateSaved()) {
            return;
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("PopupAnnouncementDialogFragment");
        androidx.fragment.app.DialogFragment dialogFragment = fragmentFindFragmentByTag instanceof androidx.fragment.app.DialogFragment ? (androidx.fragment.app.DialogFragment) fragmentFindFragmentByTag : null;
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
        java.lang.String content2 = announcementPopupDisplayModel.getContent();
        if (content2 == null || content2.length() == 0) {
            try {
                PopupAnnouncementDialogFragment.Companion.AEQbTJ(announcementPopupDisplayModel).show(fragmentManager, "PopupAnnouncementDialogFragment");
                return;
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        try {
            C55137xeK.Companion.KWHzl(content2).OLrzqt(new InterfaceC55228xfw() { // from class: o.sil
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC55228xfw
                public final boolean OLrzqt(java.lang.String str) {
                    return C45065sik.KWHzl(fragmentManager, str);
                }
            }).KWHzl(C32979mnm.EZpvd.OLrzqt(), new Function1() { // from class: o.sin
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45065sik.AEQbTJ(fragmentManager, announcementPopupDisplayModel, (java.lang.CharSequence) obj);
                }
            });
        } catch (java.lang.Throwable unused2) {
            if (fragmentManager.isStateSaved()) {
                return;
            }
            try {
                androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = fragmentManager.findFragmentByTag("PopupAnnouncementDialogFragment");
                androidx.fragment.app.DialogFragment dialogFragment2 = fragmentFindFragmentByTag2 instanceof androidx.fragment.app.DialogFragment ? (androidx.fragment.app.DialogFragment) fragmentFindFragmentByTag2 : null;
                if (dialogFragment2 != null) {
                    dialogFragment2.dismissAllowingStateLoss();
                }
                PopupAnnouncementDialogFragment.Companion.AEQbTJ(announcementPopupDisplayModel).show(fragmentManager, "PopupAnnouncementDialogFragment");
            } catch (java.lang.Throwable unused3) {
            }
        }
    }

    public static final boolean KWHzl(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str) {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("PopupAnnouncementDialogFragment");
        androidx.fragment.app.DialogFragment dialogFragment = fragmentFindFragmentByTag instanceof androidx.fragment.app.DialogFragment ? (androidx.fragment.app.DialogFragment) fragmentFindFragmentByTag : null;
        if (dialogFragment == null) {
            return false;
        }
        dialogFragment.dismissAllowingStateLoss();
        return false;
    }

    public static final Unit AEQbTJ(androidx.fragment.app.FragmentManager fragmentManager, AnnouncementPopupDisplayModel announcementPopupDisplayModel, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (fragmentManager.isStateSaved()) {
            return Unit.INSTANCE;
        }
        try {
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("PopupAnnouncementDialogFragment");
            androidx.fragment.app.DialogFragment dialogFragment = fragmentFindFragmentByTag instanceof androidx.fragment.app.DialogFragment ? (androidx.fragment.app.DialogFragment) fragmentFindFragmentByTag : null;
            if (dialogFragment != null) {
                dialogFragment.dismissAllowingStateLoss();
            }
            PopupAnnouncementDialogFragment popupAnnouncementDialogFragmentAEQbTJ = PopupAnnouncementDialogFragment.Companion.AEQbTJ(announcementPopupDisplayModel);
            popupAnnouncementDialogFragmentAEQbTJ.OLrzqt(charSequence);
            popupAnnouncementDialogFragmentAEQbTJ.show(fragmentManager, "PopupAnnouncementDialogFragment");
        } catch (java.lang.Throwable unused) {
        }
        return Unit.INSTANCE;
    }
}

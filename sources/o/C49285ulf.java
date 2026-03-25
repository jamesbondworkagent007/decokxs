package o;

import com.okinc.share.api.params.IShareParams;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.ImagePreviewType;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import com.okinc.share.bean.link.LinkDefaultPreviewConfig;
import com.okinc.share.bean.link.LinkShareParams;
import com.okinc.share.bean.text.TextDefaultPreviewConfig;
import com.okinc.share.bean.text.TextShareParams;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ulf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49285ulf {
    public static final C49285ulf EZpvd = new C49285ulf();

    /* JADX INFO: renamed from: o.ulf$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ShareType.values().length];
            try {
                iArr[ShareType.SHARE_IMAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ShareType.SHARE_WEBPAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareType.SHARE_TEXT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    private C49285ulf() {
    }

    public final ISharePreviewConfig KWHzl(@NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(iShareParams, "");
        java.lang.String string = C32979mnm.EZpvd.OLrzqt().getResources().getString(C48931uew.Activity.ORxRYg);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i = Application.EZpvd[iShareParams.getShareType().ordinal()];
        if (i == 1) {
            return ImageDefaultPreviewConfig.Companion.AEQbTJ(ImagePreviewType.CENTER_INSIDE, true, string, new Function1() { // from class: o.ulc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49285ulf.copydefault((ImageDefaultPreviewConfig) obj);
                }
            });
        }
        if (i == 2) {
            LinkShareParams linkShareParams = (LinkShareParams) iShareParams;
            java.lang.String linkUrl = C49289ulj.copydefault.copydefault() ? null : linkShareParams.getLinkUrl();
            LinkDefaultPreviewConfig.Activity activity = LinkDefaultPreviewConfig.Companion;
            java.lang.String title = linkShareParams.getTitle();
            return LinkDefaultPreviewConfig.Activity.create$default(activity, title.length() == 0 ? string : title, linkUrl, null, null, null, null, 60, null);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        TextShareParams textShareParams = (TextShareParams) iShareParams;
        TextDefaultPreviewConfig.TaskDescription taskDescription = TextDefaultPreviewConfig.Companion;
        java.lang.String title2 = textShareParams.getTitle();
        return TextDefaultPreviewConfig.TaskDescription.create$default(taskDescription, title2.length() == 0 ? string : title2, textShareParams.getBody(), null, null, 12, null);
    }

    public static final Unit copydefault(ImageDefaultPreviewConfig imageDefaultPreviewConfig) {
        Intrinsics.checkNotNullParameter(imageDefaultPreviewConfig, "");
        return Unit.INSTANCE;
    }
}

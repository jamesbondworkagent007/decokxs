package o;

import com.okinc.okex.uploadlog.view.displaymodels.ExtraFormData;
import com.okinc.okex.uploadlog.view.displaymodels.FormElementDisplayModel;
import com.okinc.okex.uploadlog.view.displaymodels.FormElementViewType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47315tni;
import o.sCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sCP {
    public static final FormElementDisplayModel AEQbTJ(@NotNull sCR scr) {
        Intrinsics.checkNotNullParameter(scr, "");
        if (scr instanceof sCR.ActionBar) {
            sCR.ActionBar actionBar = (sCR.ActionBar) scr;
            return new FormElementDisplayModel(actionBar.AEQbTJ(), FormElementViewType.AttachedFile, false, C33070mpX.AYXKKw(C47315tni.PendingIntent.dmfpNf), null, null, new ExtraFormData.AttachmentInfo(actionBar.copydefault(), "", 0L, actionBar.KWHzl(), ExtraFormData.AttachmentInfo.State.LOADING, null, 32, null), 52, null);
        }
        if (scr instanceof sCR.StateListAnimator) {
            sCR.StateListAnimator stateListAnimator = (sCR.StateListAnimator) scr;
            return new FormElementDisplayModel(stateListAnimator.AEQbTJ(), FormElementViewType.AttachedFile, false, stateListAnimator.AEQbTJ(), null, null, new ExtraFormData.AttachmentInfo(stateListAnimator.EZpvd(), stateListAnimator.OLrzqt(), stateListAnimator.copydefault(), stateListAnimator.KWHzl(), ExtraFormData.AttachmentInfo.State.SUCCESS, null, 32, null), 52, null);
        }
        if (!(scr instanceof sCR.Application)) {
            throw new NoWhenBranchMatchedException();
        }
        sCR.Application application = (sCR.Application) scr;
        java.lang.String strAEQbTJ = application.AEQbTJ();
        FormElementViewType formElementViewType = FormElementViewType.AttachedFile;
        java.lang.String strAEQbTJ2 = application.AEQbTJ();
        android.net.Uri uriKWHzl = application.KWHzl();
        java.lang.String strOLrzqt = application.OLrzqt();
        ExtraFormData.AttachmentInfo.State state = ExtraFormData.AttachmentInfo.State.FAILED;
        java.lang.String message = application.copydefault().getMessage();
        java.lang.String str = message != null ? message : "";
        return new FormElementDisplayModel(strAEQbTJ, formElementViewType, false, strAEQbTJ2, null, null, new ExtraFormData.AttachmentInfo(uriKWHzl, "", 0L, strOLrzqt, state, StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ? C33070mpX.AYXKKw(C47315tni.PendingIntent.OFhtUX) : str), 52, null);
    }
}

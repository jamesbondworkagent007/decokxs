package o;

import com.google.common.net.HttpHeaders;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ObbScanner {
    public static final void copydefault(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull StringDef stringDef) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(stringDef, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ConfigurationSet"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("EmailSendingAccount"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX(HttpHeaders.FROM));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("ReplyToEmailAddress"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("SourceArn"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.String strCopydefault = stringDef.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strCopydefault);
        }
        java.lang.String strEZpvd = stringDef.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strEZpvd);
        }
        RawRes rawResKWHzl = stringDef.KWHzl();
        if (rawResKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et2, rawResKWHzl.EZpvd());
        }
        java.lang.String strAEQbTJ = stringDef.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strAEQbTJ);
        }
        java.lang.String strOLrzqt = stringDef.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
    }
}

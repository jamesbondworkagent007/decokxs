package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.PrintedPdfDocument;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class FrameMetrics {
    public static final PrintedPdfDocument OLrzqt(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        PrintedPdfDocument.TaskDescription taskDescription = new PrintedPdfDocument.TaskDescription();
        AbstractC5105Ex.FragmentManager fragmentManager = AbstractC5105Ex.FragmentManager.AEQbTJ;
        C5101Et c5101Et = new C5101Et(fragmentManager, new EX("BeginOffset"));
        C5101Et c5101Et2 = new C5101Et(fragmentManager, new EX("EndOffset"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("PartOfSpeech"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Text"));
        C5101Et c5101Et5 = new C5101Et(fragmentManager, new EX("TokenId"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.EZpvd(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    taskDescription.copydefault(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        taskDescription.AEQbTJ(JsonWriter.copydefault(interfaceC5095En));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            taskDescription.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                taskDescription.KWHzl(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
                            } else if (numOLrzqt != null) {
                                stateListAnimatorEZpvd.copydefault();
                            } else {
                                taskDescription.AEQbTJ();
                                return taskDescription.OLrzqt();
                            }
                        }
                    }
                }
            }
        }
    }
}

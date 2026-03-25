package o;

import o.AbstractC5105Ex;
import o.C5098Eq;

/* JADX INFO: loaded from: classes21.dex */
public final class NanoAppInstanceInfo {
    public static final byte[] EZpvd(DT dt, BackupAgentHelper backupAgentHelper) {
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("Description"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("GroupName"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("Precedence"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("RoleArn"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("UserPoolId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strCopydefault = backupAgentHelper.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, strCopydefault);
        }
        java.lang.String strAEQbTJ = backupAgentHelper.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strAEQbTJ);
        }
        java.lang.Integer numEZpvd = backupAgentHelper.EZpvd();
        if (numEZpvd != null) {
            ebEZpvd.OLrzqt(c5101Et3, numEZpvd.intValue());
        }
        java.lang.String strOLrzqt = backupAgentHelper.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strOLrzqt);
        }
        java.lang.String strKWHzl = backupAgentHelper.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strKWHzl);
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}

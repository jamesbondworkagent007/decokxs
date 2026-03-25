package o;

import com.onesignal.FocusTimeController;

/* JADX INFO: renamed from: o.yoi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57772yoi {
    public final java.util.HashMap<java.lang.String, FocusTimeController.TaskDescription> AEQbTJ;

    public C57772yoi() {
        java.util.HashMap<java.lang.String, FocusTimeController.TaskDescription> map = new java.util.HashMap<>();
        this.AEQbTJ = map;
        map.put(FocusTimeController.Application.class.getName(), new FocusTimeController.Application());
        map.put(FocusTimeController.Activity.class.getName(), new FocusTimeController.Activity());
    }

    public FocusTimeController.TaskDescription copydefault() {
        FocusTimeController.TaskDescription taskDescriptionAEQbTJ = AEQbTJ();
        java.util.Iterator<C57870yqa> it = taskDescriptionAEQbTJ.EZpvd().iterator();
        while (it.hasNext()) {
            if (it.next().EZpvd().isAttributed()) {
                return taskDescriptionAEQbTJ;
            }
        }
        return EZpvd();
    }

    public FocusTimeController.TaskDescription OLrzqt(java.util.List<C57870yqa> list) {
        java.util.Iterator<C57870yqa> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().EZpvd().isAttributed()) {
                return AEQbTJ();
            }
        }
        return EZpvd();
    }

    public final FocusTimeController.TaskDescription AEQbTJ() {
        return this.AEQbTJ.get(FocusTimeController.Activity.class.getName());
    }

    public final FocusTimeController.TaskDescription EZpvd() {
        return this.AEQbTJ.get(FocusTimeController.Application.class.getName());
    }
}

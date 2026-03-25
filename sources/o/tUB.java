package o;

/* JADX INFO: loaded from: classes10.dex */
public final class tUB {
    public static final tUB copydefault = new tUB();

    private tUB() {
    }

    public final android.view.ViewGroup copydefault() {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            return (android.view.ViewGroup) activityAEQbTJ.findViewById(android.R.id.content);
        }
        return null;
    }

    public final android.view.View EZpvd() {
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        android.view.ViewGroup viewGroup = activityAEQbTJ != null ? (android.view.ViewGroup) activityAEQbTJ.findViewById(android.R.id.content) : null;
        if (viewGroup != null) {
            return viewGroup.getChildAt(0);
        }
        return null;
    }
}

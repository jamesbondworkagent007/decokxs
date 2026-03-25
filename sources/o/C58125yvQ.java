package o;

/* JADX INFO: renamed from: o.yvQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58125yvQ {

    /* JADX INFO: renamed from: o.yvQ$ActionBar */
    public interface ActionBar {
        java.util.Set<java.lang.Boolean> RIuxYh();
    }

    public static boolean copydefault(android.content.Context context) {
        java.util.Set<java.lang.Boolean> setRIuxYh = ((ActionBar) C58114yvF.OLrzqt(context, ActionBar.class)).RIuxYh();
        C58209ywv.copydefault(setRIuxYh.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new java.lang.Object[0]);
        if (setRIuxYh.isEmpty()) {
            return true;
        }
        return setRIuxYh.iterator().next().booleanValue();
    }

    private C58125yvQ() {
    }
}

package o;

/* JADX INFO: renamed from: o.ytK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58013ytK {
    public static ActionBar AEQbTJ;
    public static ActionBar KWHzl;

    /* JADX INFO: renamed from: o.ytK$ActionBar */
    public interface ActionBar {
        void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void EZpvd(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void KWHzl(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void copydefault(java.lang.String str, java.lang.String str2, java.lang.Object... objArr);

        void copydefault(java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.Object... objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void AEQbTJ(ActionBar actionBar) {
        AEQbTJ = actionBar;
    }

    static {
        ActionBar actionBar = new ActionBar() { // from class: o.ytK.3
            @Override // o.C58013ytK.ActionBar
            public void copydefault(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                java.lang.String.format(str2, objArr);
            }

            @Override // o.C58013ytK.ActionBar
            public void EZpvd(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                java.lang.String.format(str2, objArr);
            }

            @Override // o.C58013ytK.ActionBar
            public void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                java.lang.String.format(str2, objArr);
            }

            @Override // o.C58013ytK.ActionBar
            public void KWHzl(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                java.lang.String.format(str2, objArr);
            }

            @Override // o.C58013ytK.ActionBar
            public void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                java.lang.String.format(str2, objArr);
            }

            @Override // o.C58013ytK.ActionBar
            public void copydefault(java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    java.lang.String.format(str2, objArr);
                }
                android.util.Log.getStackTraceString(th);
            }
        };
        KWHzl = actionBar;
        AEQbTJ = actionBar;
    }

    private C58013ytK() {
    }

    public static void KWHzl(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        ActionBar actionBar = AEQbTJ;
        if (actionBar != null) {
            actionBar.copydefault(str, str2, objArr);
        }
    }

    public static void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        ActionBar actionBar = AEQbTJ;
        if (actionBar != null) {
            actionBar.AEQbTJ(str, str2, objArr);
        }
    }

    public static void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        ActionBar actionBar = AEQbTJ;
        if (actionBar != null) {
            actionBar.KWHzl(str, str2, objArr);
        }
    }

    public static void EZpvd(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        ActionBar actionBar = AEQbTJ;
        if (actionBar != null) {
            actionBar.EZpvd(str, str2, objArr);
        }
    }

    public static void copydefault(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        ActionBar actionBar = AEQbTJ;
        if (actionBar != null) {
            actionBar.OLrzqt(str, str2, objArr);
        }
    }

    public static void OLrzqt(java.lang.String str, java.lang.Throwable th, java.lang.String str2, java.lang.Object... objArr) {
        ActionBar actionBar = AEQbTJ;
        if (actionBar != null) {
            actionBar.copydefault(str, th, str2, objArr);
        }
    }
}

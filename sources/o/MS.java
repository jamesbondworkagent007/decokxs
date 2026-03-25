package o;

/* JADX INFO: loaded from: classes2.dex */
public class MS {
    private MS() {
        throw new java.lang.AssertionError();
    }

    public static int copydefault(android.content.Context context, int i) {
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }

    public static int AEQbTJ(android.content.Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}

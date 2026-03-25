package o;

/* JADX INFO: renamed from: o.yFv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56450yFv extends C56451yFw {

    /* JADX INFO: renamed from: o.yFv$Activity */
    public static final class Activity {
        public static final Activity AEQbTJ = new Activity();
        public static final java.lang.Integer OLrzqt;

        private Activity() {
        }

        static {
            java.lang.Object obj;
            java.lang.Integer num = null;
            try {
                obj = java.lang.Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (java.lang.Throwable unused) {
            }
            java.lang.Integer num2 = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            OLrzqt = num;
        }
    }

    public final boolean KWHzl(int i) {
        java.lang.Integer num = Activity.OLrzqt;
        return num == null || num.intValue() >= i;
    }

    @Override // o.C56449yFu
    public kotlin.random.Random OLrzqt() {
        return KWHzl(34) ? new yIS() : super.OLrzqt();
    }
}

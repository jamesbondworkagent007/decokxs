package o;

/* JADX INFO: renamed from: o.yqi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57878yqi implements InterfaceC57874yqe {
    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    @Override // o.InterfaceC57874yqe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String OLrzqt() {
        byte b;
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        language.hashCode();
        int iHashCode = language.hashCode();
        if (iHashCode != 3365) {
            if (iHashCode != 3374) {
                if (iHashCode != 3391) {
                    b = (iHashCode == 3886 && language.equals("zh")) ? (byte) 3 : (byte) -1;
                } else if (language.equals("ji")) {
                    b = 2;
                }
            } else if (language.equals("iw")) {
                b = 1;
            }
        } else if (language.equals("in")) {
            b = 0;
        }
        if (b == 0) {
            return "id";
        }
        if (b == 1) {
            return "he";
        }
        if (b == 2) {
            return "yi";
        }
        if (b != 3) {
            return language;
        }
        return language + "-" + java.util.Locale.getDefault().getCountry();
    }
}

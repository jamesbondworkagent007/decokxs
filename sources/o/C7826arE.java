package o;

/* JADX INFO: renamed from: o.arE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7826arE {
    public static final java.util.Map<java.lang.String, android.graphics.Typeface> EZpvd = new java.util.HashMap();

    public static android.graphics.Typeface EZpvd(android.content.Context context, java.lang.String str) {
        java.util.Map<java.lang.String, android.graphics.Typeface> map = EZpvd;
        android.graphics.Typeface typeface = map.get(str);
        if (typeface == null) {
            java.lang.String strOLrzqt = C7822arA.OLrzqt(str, "ttf");
            android.graphics.Typeface typefaceCopydefault = copydefault(context, strOLrzqt);
            if (typefaceCopydefault == null) {
                typefaceCopydefault = AEQbTJ(strOLrzqt);
            }
            if (typefaceCopydefault == null) {
                typefaceCopydefault = KWHzl(strOLrzqt);
            }
            typeface = typefaceCopydefault;
            if (typeface != null) {
                map.put(str, typeface);
            }
        }
        return typeface;
    }

    public static android.graphics.Typeface KWHzl(java.lang.String str) {
        try {
            android.graphics.Typeface typefaceCreate = android.graphics.Typeface.create(str, 3);
            if (typefaceCreate != null) {
                if (3 == typefaceCreate.getStyle()) {
                    return null;
                }
            }
            return typefaceCreate;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static android.graphics.Typeface copydefault(android.content.Context context, java.lang.String str) {
        try {
            return android.graphics.Typeface.createFromAsset(context.getAssets(), str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static android.graphics.Typeface AEQbTJ(java.lang.String str) {
        try {
            return android.graphics.Typeface.createFromFile(str);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}

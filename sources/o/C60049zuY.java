package o;

import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.core.JsonPointer;

/* JADX INFO: renamed from: o.zuY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60049zuY {
    public static final java.util.HashMap<java.lang.Class, java.lang.String> OLrzqt;
    public static final java.lang.Class[] copydefault;

    static {
        java.util.HashMap<java.lang.Class, java.lang.String> map = new java.util.HashMap<>(9);
        OLrzqt = map;
        map.put(java.lang.Boolean.TYPE, "Z");
        map.put(java.lang.Byte.TYPE, "B");
        map.put(java.lang.Character.TYPE, "C");
        map.put(java.lang.Short.TYPE, ExifInterface.LATITUDE_SOUTH);
        map.put(java.lang.Integer.TYPE, "I");
        map.put(java.lang.Long.TYPE, "J");
        map.put(java.lang.Float.TYPE, "F");
        map.put(java.lang.Double.TYPE, "D");
        map.put(java.lang.Void.TYPE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED);
        copydefault = new java.lang.Class[]{java.lang.Boolean.class, java.lang.Byte.class, java.lang.Character.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Float.class, java.lang.Double.class, java.lang.Void.class};
    }

    public static java.lang.String copydefault(java.lang.Class cls) {
        return C60048zuX.OLrzqt(cls.getName(), '.', JsonPointer.SEPARATOR);
    }
}

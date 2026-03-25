package o;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;

/* JADX INFO: renamed from: o.pJg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38020pJg {
    public static final java.lang.ThreadLocal<java.text.DateFormat> AEQbTJ = new java.lang.ThreadLocal<java.text.DateFormat>() { // from class: o.pJg.1
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.text.DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US);
            simpleDateFormat.setTimeZone(yCN.OLrzqt("UTC"));
            return simpleDateFormat;
        }
    };

    public static void AEQbTJ(java.lang.Object obj) throws JSONException {
        if (obj == null) {
            throw new JSONException("date cannot be null");
        }
    }

    public static java.lang.String EZpvd(Date date) throws JSONException {
        AEQbTJ(date);
        return AEQbTJ.get().format(date);
    }
}

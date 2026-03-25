package o;

import java.util.Collections;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.Pq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5384Pq implements InterfaceC5382Po {
    public final java.util.Map<java.lang.String, java.util.List<InterfaceC5385Pr>> EZpvd;
    public volatile java.util.Map<java.lang.String, java.lang.String> copydefault;

    public C5384Pq(java.util.Map<java.lang.String, java.util.List<InterfaceC5385Pr>> map) {
        this.EZpvd = Collections.unmodifiableMap(map);
    }

    @Override // o.InterfaceC5382Po
    public java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        if (this.copydefault == null) {
            synchronized (this) {
                if (this.copydefault == null) {
                    this.copydefault = Collections.unmodifiableMap(copydefault());
                }
            }
        }
        return this.copydefault;
    }

    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        java.util.HashMap map = new java.util.HashMap();
        for (Map.Entry<java.lang.String, java.util.List<InterfaceC5385Pr>> entry : this.EZpvd.entrySet()) {
            java.lang.String strKWHzl = KWHzl(entry.getValue());
            if (!android.text.TextUtils.isEmpty(strKWHzl)) {
                map.put(entry.getKey(), strKWHzl);
            }
        }
        return map;
    }

    public final java.lang.String KWHzl(@androidx.annotation.NonNull java.util.List<InterfaceC5385Pr> list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.String strCopydefault = list.get(i).copydefault();
            if (!android.text.TextUtils.isEmpty(strCopydefault)) {
                sb.append(strCopydefault);
                if (i != list.size() - 1) {
                    sb.append(AbstractJsonLexerKt.COMMA);
                }
            }
        }
        return sb.toString();
    }

    public java.lang.String toString() {
        return "LazyHeaders{headers=" + this.EZpvd + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5384Pq) {
            return this.EZpvd.equals(((C5384Pq) obj).EZpvd);
        }
        return false;
    }

    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX INFO: renamed from: o.Pq$Activity */
    public static final class Activity {
        public static final java.util.Map<java.lang.String, java.util.List<InterfaceC5385Pr>> AEQbTJ;
        public static final java.lang.String EZpvd;
        public boolean OLrzqt = true;
        public java.util.Map<java.lang.String, java.util.List<InterfaceC5385Pr>> KWHzl = AEQbTJ;
        public boolean copydefault = true;

        static {
            java.lang.String strKWHzl = KWHzl();
            EZpvd = strKWHzl;
            java.util.HashMap map = new java.util.HashMap(2);
            if (!android.text.TextUtils.isEmpty(strKWHzl)) {
                map.put("User-Agent", Collections.singletonList(new StateListAnimator(strKWHzl)));
            }
            AEQbTJ = Collections.unmodifiableMap(map);
        }

        public C5384Pq OLrzqt() {
            this.OLrzqt = true;
            return new C5384Pq(this.KWHzl);
        }

        public static java.lang.String KWHzl() {
            java.lang.String property = java.lang.System.getProperty("http.agent");
            if (android.text.TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: o.Pq$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC5385Pr {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC5385Pr
        public java.lang.String copydefault() {
            return this.OLrzqt;
        }

        public StateListAnimator(@androidx.annotation.NonNull java.lang.String str) {
            this.OLrzqt = str;
        }

        public java.lang.String toString() {
            return "StringHeaderFactory{value='" + this.OLrzqt + '\'' + AbstractJsonLexerKt.END_OBJ;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof StateListAnimator) {
                return this.OLrzqt.equals(((StateListAnimator) obj).OLrzqt);
            }
            return false;
        }

        public int hashCode() {
            return this.OLrzqt.hashCode();
        }
    }
}

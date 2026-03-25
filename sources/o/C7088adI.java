package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.ibm.icu.util.ICUUncheckedIOException;
import java.util.Collections;
import java.util.MissingResourceException;

/* JADX INFO: renamed from: o.adI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7088adI extends AbstractC7089adJ {
    public static final C7088adI copydefault = new C7088adI();
    public java.util.Collection<java.lang.String> AEQbTJ;
    public C7081adB EZpvd = null;
    public java.lang.String KWHzl = null;
    public java.util.Map<java.lang.String, C7081adB> OLrzqt = new java.util.HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C7088adI AEQbTJ() {
        return copydefault;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    private C7088adI() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.InputStream inputStreamAEQbTJ = C7055acc.AEQbTJ(getClass(), "data/index.txt");
        try {
            try {
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStreamAEQbTJ, com.google.android.exoplayer2.C.UTF8_NAME));
                while (true) {
                    java.lang.String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    java.lang.String strTrim = line.trim();
                    if (!strTrim.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER) && strTrim.length() != 0) {
                        arrayList.add(strTrim);
                    }
                }
                bufferedReader.close();
                this.AEQbTJ = Collections.unmodifiableList(arrayList);
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException("IO Error reading data/index.txt: " + e.toString());
            }
        } finally {
            try {
                inputStreamAEQbTJ.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    @Override // o.AbstractC7089adJ
    public C7081adB OLrzqt(java.lang.String str) {
        int iIndexOf = str.indexOf(64);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        synchronized (this) {
            java.lang.String str2 = this.KWHzl;
            if (str2 != null && str2.equals(str)) {
                return this.EZpvd;
            }
            C7081adB c7081adB = this.OLrzqt.get(str);
            if (c7081adB == null) {
                java.lang.String strSubstring = str;
                while (true) {
                    if (!this.AEQbTJ.contains(strSubstring)) {
                        int iLastIndexOf = strSubstring.lastIndexOf("_");
                        if (iLastIndexOf > -1) {
                            strSubstring = strSubstring.substring(0, iLastIndexOf);
                        } else {
                            if ("test".equals(strSubstring)) {
                                strSubstring = null;
                                break;
                            }
                            strSubstring = "test";
                        }
                    } else {
                        break;
                    }
                }
                if (strSubstring != null) {
                    java.lang.String str3 = "data/pfd_" + strSubstring + ".xml";
                    try {
                        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(C7055acc.AEQbTJ(getClass(), str3), com.google.android.exoplayer2.C.UTF8_NAME);
                        C7083adD c7083adDEZpvd = C7083adD.EZpvd(strSubstring, new C7087adH(inputStreamReader));
                        inputStreamReader.close();
                        if (c7083adDEZpvd != null) {
                            c7081adB = new C7081adB(str, c7083adDEZpvd);
                        }
                        this.OLrzqt.put(str, c7081adB);
                    } catch (java.io.UnsupportedEncodingException unused) {
                        throw new MissingResourceException("Unhandled encoding for resource " + str3, str3, "");
                    } catch (java.io.IOException e) {
                        throw new ICUUncheckedIOException("Failed to close() resource " + str3, e);
                    }
                } else {
                    throw new MissingResourceException("Duration data not found for  " + str, "data/", str);
                }
            }
            this.EZpvd = c7081adB;
            this.KWHzl = str;
            return c7081adB;
        }
    }
}

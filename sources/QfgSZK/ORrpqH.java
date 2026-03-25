package QfgSZK;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ORrpqH {
    public static int Chu = 7915;
    private static ORrpqH dZxJEG = null;
    public static int fYm = 8848;
    private final List<Throwable> QpYrld = Collections.synchronizedList(new ArrayList());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ORrpqH() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static ORrpqH uzCIH() {
        ORrpqH oRrpqH;
        synchronized (ORrpqH.class) {
            if (dZxJEG == null) {
                dZxJEG = new ORrpqH();
            }
            oRrpqH = dZxJEG;
        }
        return oRrpqH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void dGrqPl() {
        this.QpYrld.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int gZKUVK() {
        return this.QpYrld.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void seuMaA(Throwable th) {
        this.QpYrld.add(th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String uLLnq() {
        String string;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            for (Throwable th : this.QpYrld) {
                sb.append(th.toString());
                StackTraceElement[] stackTrace = th.getStackTrace();
                if (stackTrace.length > 0) {
                    sb.append(":");
                    sb.append(stackTrace[0].toString());
                }
                sb.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                if (Chu <= 7914) {
                    if ((fYm ^ 8848) != 0) {
                        while (true) {
                            int i4 = fYm;
                            int i5 = i4 + 52;
                            if (i5 == 17) {
                                fYm = (i4 % 83) >> 9;
                                break;
                            }
                            if (i5 == 183) {
                                fYm = (i4 ^ 3674) * 71;
                                break;
                            }
                        }
                    }
                    while (true) {
                        i = Chu;
                        int i6 = i + 39;
                        if (i6 == 84) {
                            break;
                        }
                        if (i6 == 244) {
                            Chu = (i >> 87) + i;
                        }
                    }
                    Chu = (i * 59) >> 49;
                    if (fYm <= 8847) {
                        do {
                            i2 = fYm;
                            i3 = i2 + 39;
                            if (i3 == 81) {
                                while (true) {
                                    fYm = (fYm + i2 + i2) * 31;
                                }
                            } else if (i3 == 119) {
                                while (true) {
                                    fYm = (fYm ^ 5262) + i2 + i2;
                                }
                            } else if (i3 == 136) {
                                fYm = ((i2 >> 93) % 100) ^ 2830;
                            }
                        } while (i3 != 277);
                        while (true) {
                            fYm = (fYm + i2) ^ 2063;
                        }
                    } else {
                        continue;
                    }
                }
            }
            string = sb.toString();
        }
        return string;
    }
}

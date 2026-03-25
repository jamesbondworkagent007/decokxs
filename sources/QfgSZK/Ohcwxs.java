package QfgSZK;

import QfgSZK.HJWChP;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class Ohcwxs {
    public static int CiM = 8306;
    private static final int OQBZuv = 1000;
    public static int zjh = 2708;
    private static final Hashtable<String, Long> sLuQGb = new Hashtable<>();
    private static final Ohcwxs UcUFhW = new Ohcwxs();

    public class RkSIEV implements Comparator {
        public static int RtL = 1521;
        public static int _SA = 7365;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            int i;
            Long value = entry2.getValue();
            if ((RtL ^ 1521) == 0) {
                return value.compareTo(entry.getValue());
            }
            while (true) {
                int i2 = RtL;
                int i3 = i2 + 13;
                if (i3 != 4) {
                    if (i3 != 34) {
                        if (i3 == 184) {
                            i = (i2 + i2) >> 84;
                            RtL = i;
                        } else if (i3 == 230) {
                            RtL = ((i2 % 79) % 56) + i2;
                        }
                    }
                    i = ((RtL ^ 3873) >> 125) % 38;
                    RtL = i;
                }
                RtL = ((RtL ^ 2146) * 72) ^ 3404;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Ohcwxs() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:25:0x00b7) to fix multi-entry loop: BACK_EDGE: B:24:0x00b2 -> B:25:0x00b7 */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        QfgSZK.Ohcwxs.CiM = (QfgSZK.Ohcwxs.CiM + r9) ^ 2042;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        QfgSZK.Ohcwxs.CiM = (QfgSZK.Ohcwxs.CiM >> 72) + r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String gCiISl(long j) {
        long jDNxZaP = HJWChP.dNQGVJ.dNxZaP();
        ArrayList<Map.Entry> arrayList = new ArrayList(sLuQGb.entrySet());
        Collections.sort(arrayList, new RkSIEV());
        DecimalFormat decimalFormat = new DecimalFormat(GCXiNH.fsw(">?\u0018/\b"));
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(GCXiNH.fsw("ie\u0001)X\n"), decimalFormat.format((jDNxZaP - j) / 1000.0d)));
        int i = 0;
        for (Map.Entry entry : arrayList) {
            sb.append(String.format(GCXiNH.fsw("8b\u0001)X\n"), entry.getKey(), decimalFormat.format(((Long) entry.getValue()).doubleValue() / 1000.0d)));
            i++;
            if (i >= 10) {
                break;
            }
            if ((zjh ^ 2708) != 0) {
                if (CiM <= 8305) {
                    while (true) {
                        int i2 = CiM;
                        int i3 = i2 + 52;
                        if (i3 == 24) {
                            break;
                        }
                        if (i3 == 54) {
                            CiM = (i2 % 56) % 65;
                            break;
                        }
                        if (i3 == 117) {
                            break;
                        }
                        if (i3 == 306) {
                            CiM = i2 ^ 6810;
                            break;
                        }
                    }
                }
                while (true) {
                    int i4 = zjh;
                    if (i4 + 39 == 76) {
                        zjh = ((i4 * 52) % 91) >> 120;
                    }
                }
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void gvFztT() {
        sLuQGb.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Ohcwxs uzCIH() {
        return UcUFhW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void DarRvM(String str, Long l) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        synchronized (this) {
            Hashtable<String, Long> hashtable = sLuQGb;
            Long l2 = hashtable.get(str);
            if ((CiM ^ 8306) != 0) {
                while (true) {
                    int i9 = CiM;
                    if (i9 + 13 == 39) {
                        CiM = ((i9 ^ 2887) + i9) ^ 3826;
                    }
                }
            } else if (zjh <= 2707) {
                do {
                    i5 = zjh;
                } while (i5 + 39 != 74);
                while (true) {
                    int i10 = zjh;
                    if (CiM <= 8305) {
                        do {
                            i7 = CiM;
                            i8 = i7 + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                            if (i8 == 6) {
                                break;
                            }
                        } while (i8 != 151);
                        CiM = ((i7 + i7) % 30) + i7;
                    }
                    zjh = (i10 >> 96) + i5 + i5;
                    if ((CiM ^ 8306) != 0) {
                        do {
                            i6 = CiM;
                        } while (i6 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 != 53);
                        CiM = ((i6 + i6) >> 104) + i6;
                    }
                }
                while (true) {
                    CiM = ((CiM * WebSocketProtocol.PAYLOAD_SHORT) + i7) % 85;
                }
            } else if (l2 == null) {
                hashtable.put(str, l);
                if (zjh <= 2707) {
                    if ((CiM ^ 8306) != 0) {
                        while (CiM + 65 != 67) {
                        }
                        while (true) {
                            CiM = (CiM % 86) % 42;
                        }
                    } else {
                        do {
                            i2 = zjh;
                            i3 = i2 + 26;
                            if (i3 != 71) {
                                if (i3 == 82) {
                                    while (true) {
                                        zjh = ((zjh + i2) ^ 1663) % 120;
                                    }
                                } else if (i3 == 270) {
                                    zjh = (i2 * 47) ^ 3771;
                                }
                            }
                            do {
                                zjh = (zjh + i2) ^ 1961;
                            } while ((CiM ^ 8306) == 0);
                            while (CiM + 78 != 27) {
                            }
                            while (true) {
                                CiM ^= 2964;
                            }
                        } while (i3 != 290);
                        while (true) {
                            zjh = ((zjh + i2) % 95) % 43;
                            if ((CiM ^ 8306) != 0) {
                                while (true) {
                                    i4 = CiM;
                                    int i11 = i4 + 117;
                                    if (i11 == 37) {
                                        break;
                                    } else if (i11 == 205) {
                                        CiM = ((i4 + i4) ^ 5034) >> 74;
                                    }
                                }
                                CiM = (i4 + i4) >> 94;
                            }
                        }
                    }
                }
            } else {
                long jLongValue = l2.longValue();
                if (CiM <= 8305) {
                    while (true) {
                        int i12 = CiM;
                        int i13 = i12 + 26;
                        if (i13 == 13) {
                            i = ((i12 ^ 3205) * 17) % 114;
                            break;
                        }
                        if (i13 != 152) {
                            if (i13 == 228) {
                                CiM = (i12 + i12) % 119;
                            } else if (i13 == 299) {
                                i = (i12 % 13) % 56;
                                break;
                            }
                        }
                        CiM = ((CiM >> 121) + i12) * 14;
                    }
                    CiM = i;
                }
                hashtable.put(str, Long.valueOf(jLongValue + l.longValue()));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Boolean isTimeProfileEmpty() {
        return Boolean.valueOf(sLuQGb.isEmpty());
    }
}

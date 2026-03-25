package QfgSZK;

import QfgSZK.DGUQLI;
import QfgSZK.FQMcgE;
import QfgSZK.HJWChP;
import android.content.Context;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.TelephonyManager;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class DGOPHZ {
    public static int CHY = 0;
    private static String DlIaRS = null;
    public static int kpT = 0;
    private static final int shjAbZ = -1;

    /* JADX INFO: renamed from: QfgSZK.DGOPHZ$DGOPHZ, reason: collision with other inner class name */
    /* synthetic */ class C0000DGOPHZ {
        static final /* synthetic */ int[] gTAjfL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            DGUQLI.EnumC0001DGUQLI.sr_ = 4544;
            DGUQLI.EnumC0001DGUQLI.dKE = 3704;
            int[] iArr = new int[DGUQLI.EnumC0001DGUQLI.values().length];
            gTAjfL = iArr;
            try {
                iArr[DGUQLI.EnumC0001DGUQLI.WCDMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                gTAjfL[DGUQLI.EnumC0001DGUQLI.GSM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                gTAjfL[DGUQLI.EnumC0001DGUQLI.LTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                gTAjfL[DGUQLI.EnumC0001DGUQLI.CDMA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        FQMcgE.RQa = 9057;
        kpT = 6547;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        CHY = 9537;
        FQMcgE.usN = 6842;
        GCXiNH.OHr = 2270;
        DlIaRS = FQMcgE.hfdhUn(DGOPHZ.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f6, code lost:
    
        QfgSZK.DGOPHZ.CHY = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, String> DWgRXt(Context context) {
        int i;
        int i2;
        CellSignalStrength cellSignalStrength;
        String string;
        int i3;
        HashMap map = new HashMap();
        List<CellInfo> listUrRBLY = UrRBLY(context);
        if (listUrRBLY != null && !listUrRBLY.isEmpty()) {
            loop0: for (CellInfo cellInfo : listUrRBLY) {
                if (cellInfo.isRegistered()) {
                    int i4 = C0000DGOPHZ.gTAjfL[DcqEDu(cellInfo).ordinal()];
                    if (i4 == 1) {
                        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                        cellSignalStrength = cellInfoWcdma.getCellSignalStrength();
                        string = cellInfoWcdma.getCellIdentity().toString();
                    } else if (i4 != 2) {
                        if (i4 == 3) {
                            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                            heceqZ(cellInfoLte.getCellSignalStrength(), cellInfoLte.getCellIdentity().toString(), map);
                            if ((CHY ^ 9537) != 0) {
                                do {
                                    int i5 = CHY;
                                    i3 = i5 + 39;
                                    if (i3 == 68) {
                                        while (true) {
                                            CHY = ((CHY + i5) + i5) % 50;
                                            if ((kpT ^ 6547) != 0) {
                                                while (true) {
                                                    int i6 = kpT;
                                                    int i7 = i6 + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                                                    if (i7 == 11) {
                                                        kpT = (i6 ^ 5367) * 91;
                                                        break;
                                                    }
                                                    if (i7 == 196) {
                                                        kpT = (i6 % 66) + i6;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } while (i3 != 207);
                                while (true) {
                                    CHY = ((CHY * 24) % 49) % WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                                }
                            }
                        } else if (i4 == 4) {
                            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                            cellSignalStrength = cellInfoCdma.getCellSignalStrength();
                            string = cellInfoCdma.getCellIdentity().toString();
                        }
                        if (map.size() < 3) {
                            return null;
                        }
                    } else {
                        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                        cellSignalStrength = cellInfoGsm.getCellSignalStrength();
                        string = cellInfoGsm.getCellIdentity().toString();
                    }
                    heceqZ(cellSignalStrength, string, map);
                    if (map.size() < 3) {
                    }
                }
                if ((CHY ^ 9537) != 0) {
                    while (true) {
                        int i8 = CHY;
                        int i9 = i8 + 104;
                        if (i9 == 78) {
                            CHY = i8 + i8 + i8;
                            break loop0;
                        }
                        if (i9 == 84) {
                            i2 = ((i8 ^ 3490) >> 78) % 90;
                            break;
                        }
                        if (i9 == 109) {
                            break loop0;
                        }
                        if (i9 == 179) {
                            i2 = ((i8 + i8) * 108) % 36;
                            break;
                        }
                    }
                    do {
                        CHY = (CHY % 14) >> 90;
                    } while (kpT > 6546);
                    do {
                        i = kpT + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                        if (i == 11) {
                            while (true) {
                                kpT = (kpT % 3) ^ 16;
                            }
                        } else if (i == 64) {
                            while (true) {
                                kpT = ((kpT % 115) % 86) * 106;
                            }
                        }
                    } while (i != 247);
                    while (true) {
                        kpT = (kpT % 54) >> 109;
                    }
                }
            }
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static DGUQLI.EnumC0001DGUQLI DcqEDu(CellInfo cellInfo) {
        return (HJWChP.fvRMlC.apHBvG() && (cellInfo instanceof CellInfoWcdma)) ? DGUQLI.EnumC0001DGUQLI.WCDMA : (HJWChP.fvRMlC.dpErvT() && (cellInfo instanceof CellInfoGsm)) ? DGUQLI.EnumC0001DGUQLI.GSM : (HJWChP.fvRMlC.ilfrrN() && (cellInfo instanceof CellInfoLte)) ? DGUQLI.EnumC0001DGUQLI.LTE : (HJWChP.fvRMlC.iOIMNp() && (cellInfo instanceof CellInfoCdma)) ? DGUQLI.EnumC0001DGUQLI.CDMA : DGUQLI.EnumC0001DGUQLI.UNKOWN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static void KDccX(DGUQLI.EnumC0001DGUQLI enumC0001DGUQLI, int i, int i2, int i3, int i4, StringBuilder sb) {
        int i5;
        int i6;
        if (fHqPtx(i, i2, i3, i4)) {
            sb.append(enumC0001DGUQLI);
            sb.append(":");
            if (i != -1) {
                sb.append(i);
                if ((kpT ^ 6547) != 0) {
                    while (true) {
                        int i7 = kpT;
                        int i8 = i7 + 39;
                        if (i8 == 16) {
                            kpT = i7 >> 19;
                        } else if (i8 == 68) {
                            while (true) {
                                kpT = ((kpT % 97) ^ 1175) % 67;
                            }
                        } else if (i8 == 202) {
                            kpT = (i7 ^ 3666) % 84;
                            break;
                        }
                    }
                }
                sb.append(":");
            }
            if (i3 != -1) {
                if (CHY <= 9536) {
                    while (true) {
                        int i9 = CHY;
                        int i10 = i9 + 78;
                        if (i10 == 97) {
                            CHY = (i9 * 30) >> 79;
                            break;
                        }
                        if (i10 != 128) {
                            if (i10 == 278) {
                                break;
                            }
                        } else if ((kpT ^ 6547) != 0) {
                            do {
                                i6 = kpT;
                            } while (i6 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA != 92);
                            while (true) {
                                kpT = (kpT + i6) * 100;
                            }
                        } else {
                            CHY = ((i9 + i9) * 79) % 79;
                        }
                    }
                    while (true) {
                        CHY *= 1305;
                    }
                }
                sb.append(i3);
                sb.append(":");
            }
            if (i2 != -1) {
                sb.append(i2);
                sb.append(":");
            }
            if (kpT <= 6546) {
                do {
                    i5 = kpT;
                } while (i5 + 221 != 94);
                kpT = i5 * 11808;
            }
            if (i4 != -1) {
                sb.append(i4);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static List<CellInfo> UrRBLY(Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (!HJWChP.fvRMlC.sanrWj()) {
            return null;
        }
        try {
            Object systemService = context.getSystemService(GCXiNH.fsw("myTbN"));
            if (systemService instanceof TelephonyManager) {
                return ((TelephonyManager) systemService).getAllCellInfo();
            }
            return null;
        } catch (SecurityException e) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Hb^~\u000bCdxy[G\u0003M[IIB\\ZT\u0012AU]STOHSVV\u0017]x"), e.toString());
            DwQSDd.glVQsU(e);
            ORrpqH.uzCIH().seuMaA(e);
            if (CHY <= 9536) {
                if ((kpT ^ 6547) != 0) {
                    do {
                        i4 = kpT;
                        i5 = i4 + 52;
                        if (i5 == 20) {
                            kpT = (i4 >> 15) ^ 3486;
                        }
                    } while (i5 != 77);
                    while (true) {
                        kpT = ((kpT >> 12) ^ 1368) + i4;
                    }
                }
                do {
                    int i6 = CHY;
                    i = i6 + 39;
                    if (i == 97) {
                        while (true) {
                            CHY = ((CHY >> 50) ^ 4595) >> 84;
                        }
                    } else if (i == 221) {
                        while (true) {
                            CHY = (CHY % 65) * 68;
                        }
                    } else if (i == 371) {
                        while (true) {
                            CHY = (CHY + i6 + i6) * 106;
                            if ((kpT ^ 6547) != 0) {
                                do {
                                    i2 = kpT;
                                    i3 = i2 + 91;
                                    if (i3 == 68) {
                                        break;
                                    }
                                } while (i3 != 86);
                                kpT = i2 + i2 + i2;
                            }
                        }
                        while (true) {
                            kpT = (kpT ^ 2886) % 71;
                        }
                    }
                } while (i != 520);
                while (true) {
                    CHY = ((CHY % 32) ^ 1189) >> 93;
                }
            }
            return null;
        } catch (Exception e2) {
            FQMcgE.OijiEz(DlIaRS, e2.toString());
            ORrpqH.uzCIH().seuMaA(e2);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:29:0x005b) to fix multi-entry loop: BACK_EDGE: B:29:0x005b -> B:30:0x005d */
    /* JADX DEBUG: Duplicate block (B:63:0x00e2) to fix multi-entry loop: BACK_EDGE: B:63:0x00e2 -> B:62:0x00de */
    private static boolean fHqPtx(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (i != Integer.MAX_VALUE) {
            int i9 = kpT ^ 6547;
            if (i9 != 0) {
                do {
                    i8 = kpT;
                } while (i8 + 26 != 17);
                while (true) {
                    kpT = ((kpT * 83) + i8) * 52;
                }
            } else if (i3 != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE && i4 != Integer.MAX_VALUE) {
                if (CHY > 9536) {
                    return true;
                }
                if (i9 != 0) {
                    do {
                        i6 = kpT;
                        i7 = i6 + 52;
                        if (i7 == 51) {
                            kpT = ((i6 % 64) * 71) ^ 1781;
                        } else if (i7 == 217) {
                            kpT = ((i6 >> 64) + i6) >> 119;
                        } else if (i7 != 298) {
                        }
                        while (true) {
                            kpT = (kpT + i6) * 8;
                        }
                    } while (i7 != 470);
                    while (true) {
                        kpT = ((kpT >> 114) * 87) + i6;
                    }
                }
                do {
                    int i10 = CHY;
                    i5 = i10 + 26;
                    if (i5 != 68) {
                        if (i5 == 151) {
                            CHY = i10 + i10 + i10 + i10;
                        } else if (i5 == 293) {
                            CHY = ((i10 * WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) % 23) * 82;
                            if ((kpT ^ 6547) != 0) {
                                while (true) {
                                    int i11 = kpT;
                                    int i12 = i11 + 65;
                                    if (i12 != 76) {
                                        if (i12 == 265) {
                                            break;
                                        }
                                        if (i12 == 431) {
                                            kpT = (i11 >> 55) + i11;
                                        }
                                    }
                                    kpT = ((kpT * 76) ^ 2534) >> 54;
                                }
                                while (true) {
                                    kpT = (kpT % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) % 34;
                                }
                            }
                        }
                    }
                    while (true) {
                        CHY = (CHY ^ 2650) + i10;
                    }
                } while (i5 != 399);
                do {
                    CHY = (CHY % 13) ^ 2125;
                } while ((kpT ^ 6547) == 0);
                while (true) {
                    int i13 = kpT;
                    int i14 = i13 + 104;
                    if (i14 == 8) {
                        break;
                    }
                    if (i14 == 40) {
                        kpT = (i13 >> 30) * 64;
                    }
                }
                while (true) {
                    kpT = ((kpT >> 125) ^ 4574) % 23;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:119:0x022c) to fix multi-entry loop: BACK_EDGE: B:118:0x0226 -> B:119:0x022c */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.String hCLrkq(android.content.Context r15) {
        /*
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.List r15 = UrRBLY(r15)
            QfgSZK.DGUQLI$DGUQLI r0 = QfgSZK.DGUQLI.EnumC0001DGUQLI.LTE
            if (r15 == 0) goto L23c
            boolean r1 = r15.isEmpty()
            if (r1 != 0) goto L23c
            java.util.Iterator r15 = r15.iterator()
            r7 = 1
            r1 = r7
        L19:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L23c
            java.lang.Object r2 = r15.next()
            android.telephony.CellInfo r2 = (android.telephony.CellInfo) r2
            boolean r3 = r2.isRegistered()
            r8 = 124(0x7c, float:1.74E-43)
            r9 = 55
            r10 = 68
            r11 = 116(0x74, float:1.63E-43)
            r12 = 6546(0x1992, float:9.173E-42)
            if (r3 != 0) goto L3d
            int r2 = QfgSZK.DGOPHZ.CHY
            r2 = r2 ^ 9537(0x2541, float:1.3364E-41)
            if (r2 == 0) goto L19
            goto L1b5
        L3d:
            QfgSZK.DGUQLI$DGUQLI r13 = DcqEDu(r2)
            r3 = 125(0x7d, float:1.75E-43)
            if (r1 == 0) goto L7d
            int r0 = QfgSZK.DGOPHZ.CHY
            r0 = r0 ^ 9537(0x2541, float:1.3364E-41)
            if (r0 == 0) goto L7a
        L4b:
            int r0 = QfgSZK.DGOPHZ.CHY
            int r15 = r0 + 65
            if (r15 == r10) goto L52
            goto L4b
        L52:
            int r15 = QfgSZK.DGOPHZ.CHY
            int r15 = r15 + r0
            r15 = r15 ^ 6909(0x1afd, float:9.682E-42)
            QfgSZK.DGOPHZ.CHY = r15
            int r15 = QfgSZK.DGOPHZ.kpT
            if (r15 > r12) goto L52
        L5d:
            int r15 = QfgSZK.DGOPHZ.kpT
            int r0 = r15 + 260
            r1 = 97
            if (r0 == r1) goto L68
            if (r0 == r3) goto L6f
            goto L5d
        L68:
            r0 = r15 ^ 1784(0x6f8, float:2.5E-42)
            int r0 = r0 % 58
            int r0 = r0 + r15
            QfgSZK.DGOPHZ.kpT = r0
        L6f:
            int r15 = QfgSZK.DGOPHZ.kpT
            r15 = r15 ^ 3290(0xcda, float:4.61E-42)
            int r15 = r15 >> 25
            int r15 = r15 * 119
            QfgSZK.DGOPHZ.kpT = r15
            goto L6f
        L7a:
            r0 = 0
            r14 = r0
            goto La7
        L7d:
            int r4 = r0.getPriority()
            int r5 = r13.getPriority()
            if (r4 > r5) goto La6
            int r2 = QfgSZK.DGOPHZ.kpT
            r2 = r2 ^ 6547(0x1993, float:9.174E-42)
            if (r2 == 0) goto L19
        L8d:
            int r15 = QfgSZK.DGOPHZ.kpT
            int r0 = r15 + 39
            if (r0 == r9) goto L9d
            if (r0 == r3) goto L96
            goto L8d
        L96:
            int r0 = QfgSZK.DGOPHZ.kpT
            int r0 = r0 + r15
            int r0 = r0 * r8
            QfgSZK.DGOPHZ.kpT = r0
            goto L96
        L9d:
            int r15 = QfgSZK.DGOPHZ.kpT
            int r15 = r15 >> 94
            r15 = r15 ^ 1524(0x5f4, float:2.136E-42)
            QfgSZK.DGOPHZ.kpT = r15
            goto L9d
        La6:
            r14 = r1
        La7:
            int[] r0 = QfgSZK.DGOPHZ.C0000DGOPHZ.gTAjfL
            int r1 = r13.ordinal()
            r0 = r0[r1]
            if (r0 == r7) goto L156
            r1 = 2
            if (r0 == r1) goto Lf7
            r1 = 3
            if (r0 == r1) goto Lda
            r1 = 4
            if (r0 == r1) goto Lbc
            goto L188
        Lbc:
            android.telephony.CellInfoCdma r2 = (android.telephony.CellInfoCdma) r2
            android.telephony.CellIdentityCdma r0 = r2.getCellIdentity()
            int r1 = r0.getBasestationId()
            int r2 = r0.getSystemId()
            r3 = -1
            int r4 = r0.getNetworkId()
            r0 = r13
            r5 = r6
            KDccX(r0, r1, r2, r3, r4, r5)
            int r0 = QfgSZK.DGOPHZ.kpT
            if (r0 > r12) goto L188
            goto L175
        Lda:
            android.telephony.CellInfoLte r2 = (android.telephony.CellInfoLte) r2
            android.telephony.CellIdentityLte r0 = r2.getCellIdentity()
            int r1 = r0.getCi()
            int r3 = r0.getMcc()
            int r2 = r0.getMnc()
            int r4 = r0.getTac()
            r0 = r13
            r5 = r6
            KDccX(r0, r1, r2, r3, r4, r5)
            goto L188
        Lf7:
            android.telephony.CellInfoGsm r2 = (android.telephony.CellInfoGsm) r2
            android.telephony.CellIdentityGsm r0 = r2.getCellIdentity()
            int r1 = r0.getCid()
            int r3 = r0.getMcc()
            int r2 = r0.getMnc()
            int r4 = r0.getLac()
            r0 = r13
            r5 = r6
            KDccX(r0, r1, r2, r3, r4, r5)
            int r0 = QfgSZK.DGOPHZ.CHY
            r0 = r0 ^ 9537(0x2541, float:1.3364E-41)
            if (r0 == 0) goto L188
            int r15 = QfgSZK.DGOPHZ.kpT
            r15 = r15 ^ 6547(0x1993, float:9.174E-42)
            if (r15 == 0) goto L13b
        L11e:
            int r15 = QfgSZK.DGOPHZ.kpT
            int r0 = r15 + 169
            r1 = 5
            if (r0 == r1) goto L135
            r15 = 71
            if (r0 == r15) goto L12a
            goto L11e
        L12a:
            int r15 = QfgSZK.DGOPHZ.kpT
            int r15 = r15 >> 107
            int r15 = r15 * 41
            r15 = r15 ^ 2088(0x828, float:2.926E-42)
            QfgSZK.DGOPHZ.kpT = r15
            goto L12a
        L135:
            int r0 = r15 + r15
            int r0 = r0 + r15
            QfgSZK.DGOPHZ.kpT = r0
            goto L11e
        L13b:
            int r15 = QfgSZK.DGOPHZ.CHY
            int r0 = r15 + 78
            r1 = 48
            if (r0 == r1) goto L148
            r15 = 181(0xb5, float:2.54E-43)
            if (r0 == r15) goto L14c
            goto L13b
        L148:
            int r15 = r15 * 10208
            QfgSZK.DGOPHZ.CHY = r15
        L14c:
            int r15 = QfgSZK.DGOPHZ.CHY
            int r15 = r15 % 30
            int r15 = r15 >> r11
            r15 = r15 ^ 3398(0xd46, float:4.762E-42)
            QfgSZK.DGOPHZ.CHY = r15
            goto L13b
        L156:
            android.telephony.CellInfoWcdma r2 = (android.telephony.CellInfoWcdma) r2
            android.telephony.CellIdentityWcdma r0 = r2.getCellIdentity()
            int r1 = r0.getCid()
            int r3 = r0.getMcc()
            int r2 = r0.getMnc()
            int r4 = r0.getLac()
            r0 = r13
            r5 = r6
            KDccX(r0, r1, r2, r3, r4, r5)
            int r0 = QfgSZK.DGOPHZ.kpT
            if (r0 > r12) goto L188
        L175:
            int r0 = QfgSZK.DGOPHZ.kpT
            int r15 = r0 + 104
            r1 = 45
            if (r15 == r1) goto L17e
            goto L175
        L17e:
            int r15 = QfgSZK.DGOPHZ.kpT
            int r15 = r15 % 70
            int r15 = r15 >> 93
            int r15 = r15 + r0
            QfgSZK.DGOPHZ.kpT = r15
            goto L17e
        L188:
            int r0 = QfgSZK.DGOPHZ.CHY
            r1 = 9536(0x2540, float:1.3363E-41)
            if (r0 > r1) goto L238
            int r15 = QfgSZK.DGOPHZ.kpT
            r15 = r15 ^ 6547(0x1993, float:9.174E-42)
            if (r15 == 0) goto L1b5
        L194:
            int r15 = QfgSZK.DGOPHZ.kpT
            int r0 = r15 + 52
            r1 = 12
            if (r0 == r1) goto L1ab
            r1 = 175(0xaf, float:2.45E-43)
            if (r0 == r1) goto L1a1
            goto L194
        L1a1:
            int r0 = QfgSZK.DGOPHZ.kpT
            int r0 = r0 >> 83
            r0 = r0 ^ 4919(0x1337, float:6.893E-42)
            int r0 = r0 + r15
            QfgSZK.DGOPHZ.kpT = r0
            goto L1a1
        L1ab:
            int r0 = QfgSZK.DGOPHZ.kpT
            int r0 = r0 % 19
            int r0 = r0 + r15
            int r0 = r0 % 29
            QfgSZK.DGOPHZ.kpT = r0
            goto L1ab
        L1b5:
            int r15 = QfgSZK.DGOPHZ.CHY
            int r0 = r15 + 39
            r1 = 21
            if (r0 == r1) goto L1fb
            if (r0 == r11) goto L22f
            if (r0 == r8) goto L1ef
            r1 = 212(0xd4, float:2.97E-43)
            if (r0 == r1) goto L1c6
            goto L1b5
        L1c6:
            int r0 = r15 * 2090
            QfgSZK.DGOPHZ.CHY = r0
            int r0 = QfgSZK.DGOPHZ.kpT
            r0 = r0 ^ 6547(0x1993, float:9.174E-42)
            if (r0 == 0) goto L1fb
        L1d0:
            int r15 = QfgSZK.DGOPHZ.kpT
            int r0 = r15 + 208
            r1 = 86
            if (r0 == r1) goto L1e7
            r1 = 198(0xc6, float:2.77E-43)
            if (r0 == r1) goto L1dd
            goto L1d0
        L1dd:
            int r0 = QfgSZK.DGOPHZ.kpT
            r0 = r0 ^ 1285(0x505, float:1.8E-42)
            int r0 = r0 + r15
            int r0 = r0 >> 115
            QfgSZK.DGOPHZ.kpT = r0
            goto L1dd
        L1e7:
            int r15 = QfgSZK.DGOPHZ.kpT
            r15 = r15 ^ 2329(0x919, float:3.264E-42)
            int r15 = r15 % r10
            QfgSZK.DGOPHZ.kpT = r15
            goto L1e7
        L1ef:
            int r0 = r15 + r15
            int r0 = r0 % r11
            r0 = r0 ^ 1064(0x428, float:1.491E-42)
            QfgSZK.DGOPHZ.CHY = r0
            int r0 = QfgSZK.DGOPHZ.kpT
            if (r0 > r12) goto L22f
            goto L20b
        L1fb:
            int r0 = QfgSZK.DGOPHZ.CHY
            int r0 = r0 % 54
            int r0 = r0 * 33
            r0 = r0 ^ 3861(0xf15, float:5.41E-42)
            QfgSZK.DGOPHZ.CHY = r0
            int r0 = QfgSZK.DGOPHZ.kpT
            r0 = r0 ^ 6547(0x1993, float:9.174E-42)
            if (r0 == 0) goto L22f
        L20b:
            int r0 = QfgSZK.DGOPHZ.kpT
            int r15 = r0 + 221
            r1 = 18
            if (r15 == r1) goto L21f
            if (r15 == r9) goto L226
            r1 = 102(0x66, float:1.43E-43)
            if (r15 == r1) goto L21a
            goto L20b
        L21a:
            int r15 = r0 * 6
            int r15 = r15 >> 52
            goto L22c
        L21f:
            int r15 = QfgSZK.DGOPHZ.kpT
            int r15 = r15 >> 109
            int r15 = r15 + r0
            QfgSZK.DGOPHZ.kpT = r15
        L226:
            int r15 = QfgSZK.DGOPHZ.kpT
            int r15 = r15 % 7
            r15 = r15 ^ 3769(0xeb9, float:5.281E-42)
        L22c:
            QfgSZK.DGOPHZ.kpT = r15
            goto L21f
        L22f:
            int r0 = QfgSZK.DGOPHZ.CHY
            int r0 = r0 + r15
            int r0 = r0 * 51
            QfgSZK.DGOPHZ.CHY = r0
            goto L1b5
        L238:
            r0 = r13
            r1 = r14
            goto L19
        L23c:
            java.lang.String r15 = r6.toString()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DGOPHZ.hCLrkq(android.content.Context):java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:39:0x00ac) to fix multi-entry loop: BACK_EDGE: B:39:0x00ac -> B:40:0x00b4 */
    /* JADX DEBUG: Duplicate block (B:54:0x00e5) to fix multi-entry loop: BACK_EDGE: B:54:0x00e5 -> B:55:0x00e7 */
    /* JADX DEBUG: Duplicate block (B:68:0x0115) to fix multi-entry loop: BACK_EDGE: B:68:0x0115 -> B:67:0x0113 */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00b4, code lost:
    
        QfgSZK.DGOPHZ.CHY = ((r8 % 46) >> 27) ^ 1281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0113, code lost:
    
        r9 = (QfgSZK.DGOPHZ.kpT + r8) ^ 5061;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[LOOP:5: B:23:0x006d->B:109:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be A[LOOP:3: B:42:0x00be->B:103:0x00be, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void heceqZ(CellSignalStrength cellSignalStrength, String str, Map<String, String> map) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        if (cellSignalStrength.getAsuLevel() != 99) {
            map.put(GCXiNH.fsw("n}dMxd"), String.valueOf(cellSignalStrength.getAsuLevel()));
        }
        String strFsw = GCXiNH.fsw("nbdhi\\");
        int dbm = cellSignalStrength.getDbm();
        if ((CHY ^ 9537) != 0) {
            do {
                i3 = CHY;
                i4 = i3 + 26;
                if (i4 == 37) {
                    int i13 = CHY;
                    int i14 = kpT;
                    if ((i14 ^ 6547) != 0) {
                        if (i14 <= 6546) {
                            while (true) {
                                i5 = kpT;
                                int i15 = i5 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                                if (i15 != 15) {
                                    if (i15 == 144) {
                                        break;
                                    }
                                } else {
                                    kpT = ((i5 % 106) >> 71) ^ 4269;
                                }
                            }
                            kpT = ((i5 >> 18) + i5) * 30;
                            CHY = ((i13 % 46) >> 27) ^ 1281;
                        } else {
                            CHY = ((i13 % 46) >> 27) ^ 1281;
                        }
                        int i16 = CHY;
                        i7 = kpT ^ 6547;
                        if (i7 == 0) {
                            while (true) {
                                i10 = kpT;
                                int i17 = i10 + 130;
                                if (i17 == 22) {
                                    kpT = (i10 >> 204) ^ 4483;
                                    break;
                                }
                                if (i17 == 154) {
                                    i11 = ((i10 * 69) >> 41) ^ 3183;
                                } else if (i17 == 190) {
                                    i11 = ((i10 ^ 3790) >> 61) * 95;
                                } else if (i17 == 372) {
                                    break;
                                }
                                kpT = i11;
                            }
                            while (true) {
                                kpT = (kpT % 1) + i10;
                            }
                        } else {
                            CHY = ((i16 % 106) * 36) % 11;
                            if (i7 != 0) {
                                while (true) {
                                    i8 = kpT;
                                    int i18 = i8 + 65;
                                    if (i18 == 8) {
                                        kpT = i8 >> 289;
                                    } else {
                                        if (i18 == 22) {
                                            i9 = ((i8 % 87) + i8) * 20;
                                            break;
                                        }
                                        if (i18 != 86) {
                                            if (i18 == 158) {
                                                i9 = ((i8 + i8) >> 41) + i8;
                                                break;
                                            }
                                        }
                                        i9 = (kpT + i8) ^ 5061;
                                    }
                                }
                                while (true) {
                                    kpT = i9;
                                    i9 = (kpT + i8) ^ 5061;
                                }
                            }
                            int i132 = CHY;
                            int i142 = kpT;
                            if ((i142 ^ 6547) != 0) {
                                do {
                                    i6 = kpT + 117;
                                    if (i6 == 98) {
                                        while (true) {
                                            kpT = (kpT * 74) % 88;
                                        }
                                    }
                                } while (i6 != 126);
                                while (true) {
                                    kpT ^= 2020;
                                }
                            }
                        }
                    }
                } else if (i4 == 59) {
                    int i162 = CHY;
                    i7 = kpT ^ 6547;
                    if (i7 == 0) {
                    }
                } else if (i4 == 86) {
                    while (true) {
                        CHY = ((CHY >> 41) % 20) ^ 2620;
                    }
                }
            } while (i4 != 154);
            CHY = i3 >> CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256;
            if ((kpT ^ 6547) != 0) {
                do {
                    i12 = kpT;
                } while (i12 + 26 != 58);
                kpT = (i12 * 32) ^ 1083;
            }
        }
        map.put(strFsw, String.valueOf(dbm));
        String strFsw2 = GCXiNH.fsw("n}deEE");
        int level = cellSignalStrength.getLevel();
        if ((kpT ^ 6547) != 0) {
            do {
                i = kpT;
                i2 = i + 52;
                if (i2 == 90) {
                    kpT = (i >> 58) ^ 2046;
                } else if (i2 == 282) {
                    while (true) {
                        kpT = (kpT >> 4) + i;
                    }
                } else if (i2 == 380) {
                    while (true) {
                        kpT = (kpT * 21) ^ 1425;
                    }
                }
            } while (i2 != 559);
            while (true) {
                kpT = ((kpT ^ 3651) % 84) + i;
            }
        }
        map.put(strFsw2, String.valueOf(level));
        map.put(GCXiNH.fsw("~xR"), str);
    }
}

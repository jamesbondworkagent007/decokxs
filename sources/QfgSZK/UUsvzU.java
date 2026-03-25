package QfgSZK;

import QfgSZK.DcMfJK;
import QfgSZK.FQMcgE;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class UUsvzU implements DcMfJK.suEgdN {
    private static String DlIaRS;
    public static int _gq;
    public static int zQl;
    private final hTFPAC AsQfc;
    private final CountDownLatch iseLue;

    public static class hTFPAC implements ServiceConnection {
        public static int C_B;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String RFGdfR;
        public static int RuY;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String fcduTx;
        private final CountDownLatch fazARR;
        private volatile IBinder uVMU = null;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            RuY = 2729;
            C_B = 4741;
            GCXiNH.OHr = 2270;
            DLl(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public hTFPAC(CountDownLatch countDownLatch) {
            this.fazARR = countDownLatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void DLl(boolean z) {
            if (z) {
                DLl(false);
            }
            RFGdfR = GCXiNH.fsw("~~V\"L^ny`M\fBDMZH_Q\u001aT_B\u001eNZN\u0012R^\\VCOcmfp/iPXlveke&NWqbv`ey|ws{R~J}eqLFA");
            fcduTx = GCXiNH.fsw("[pR`NU!jc\bMA^HAI\u0016tPEWCDFMTR\\\u001ap|\u0017]x");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:61:0x00f0) to fix multi-entry loop: BACK_EDGE: B:60:0x00ef -> B:61:0x00f0 */
        /* JADX WARN: Path cross not found for [B:3:0x0008, B:21:0x0055], limit reached: 68 */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String aLnfMH(android.os.IBinder r5) {
            /*
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                java.lang.String r2 = QfgSZK.UUsvzU.hTFPAC.RFGdfR     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
                r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
                r2 = 1
                r3 = 0
                r5.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
                r1.readException()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
                java.lang.String r5 = r1.readString()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
                r1.recycle()
                r0.recycle()
                int r0 = QfgSZK.UUsvzU.hTFPAC.C_B
                r0 = r0 ^ 4741(0x1285, float:6.644E-42)
                if (r0 == 0) goto L124
                int r0 = QfgSZK.UUsvzU.hTFPAC.RuY
                r0 = r0 ^ 2729(0xaa9, float:3.824E-42)
                if (r0 == 0) goto L77
            L2b:
                int r0 = QfgSZK.UUsvzU.hTFPAC.RuY
                int r1 = r0 + 26
                r2 = 71
                if (r1 == r2) goto L44
                r2 = 104(0x68, float:1.46E-43)
                if (r1 == r2) goto L49
                r2 = 124(0x7c, float:1.74E-43)
                if (r1 == r2) goto L3c
                goto L2b
            L3c:
                int r1 = r0 * 68
                int r1 = r1 + r0
                int r1 = r1 % 78
                QfgSZK.UUsvzU.hTFPAC.RuY = r1
                goto L77
            L44:
                r1 = r0 ^ 4366(0x110e, float:6.118E-42)
                int r1 = r1 >> r2
                QfgSZK.UUsvzU.hTFPAC.RuY = r1
            L49:
                int r1 = QfgSZK.UUsvzU.hTFPAC.RuY
                r1 = r1 ^ 1863(0x747, float:2.61E-42)
                int r1 = r1 + r0
                QfgSZK.UUsvzU.hTFPAC.RuY = r1
                goto L2b
            L51:
                r5 = move-exception
                goto L125
            L54:
                r5 = move-exception
                java.lang.String r2 = QfgSZK.UUsvzU.RKDWNf()     // Catch: java.lang.Throwable -> L51
                java.lang.String r3 = QfgSZK.UUsvzU.hTFPAC.fcduTx     // Catch: java.lang.Throwable -> L51
                java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L51
                QfgSZK.FQMcgE.fQMcgE.sIqKDg(r2, r3, r4)     // Catch: java.lang.Throwable -> L51
                QfgSZK.ORrpqH r2 = QfgSZK.ORrpqH.uzCIH()     // Catch: java.lang.Throwable -> L51
                r2.seuMaA(r5)     // Catch: java.lang.Throwable -> L51
                r1.recycle()
                r0.recycle()
                int r5 = QfgSZK.UUsvzU.hTFPAC.C_B
                r5 = r5 ^ 4741(0x1285, float:6.644E-42)
                r0 = 0
                if (r5 == 0) goto L123
                r5 = r0
            L77:
                int r0 = QfgSZK.UUsvzU.hTFPAC.C_B
                int r1 = r0 + 13
                r2 = 99
                if (r1 == r2) goto Lc1
                r2 = 123(0x7b, float:1.72E-43)
                if (r1 == r2) goto L104
                r2 = 134(0x86, float:1.88E-43)
                if (r1 == r2) goto Lfc
                r2 = 211(0xd3, float:2.96E-43)
                if (r1 == r2) goto L8c
                goto L77
            L8c:
                int r0 = r0 + r0
                int r0 = r0 >> 97
                QfgSZK.UUsvzU.hTFPAC.C_B = r0
                int r0 = QfgSZK.UUsvzU.hTFPAC.RuY
                r0 = r0 ^ 2729(0xaa9, float:3.824E-42)
                if (r0 == 0) goto L104
            L97:
                int r0 = QfgSZK.UUsvzU.hTFPAC.RuY
                int r1 = r0 + 52
                r2 = 86
                if (r1 == r2) goto Lb1
                r2 = 106(0x6a, float:1.49E-43)
                if (r1 == r2) goto La8
                r2 = 128(0x80, float:1.794E-43)
                if (r1 == r2) goto Lb7
                goto L97
            La8:
                int r5 = QfgSZK.UUsvzU.hTFPAC.RuY
                int r5 = r5 >> 91
                int r5 = r5 * 81
                QfgSZK.UUsvzU.hTFPAC.RuY = r5
                goto La8
            Lb1:
                r1 = r0 ^ 3323(0xcfb, float:4.657E-42)
                int r1 = r1 >> 68
                QfgSZK.UUsvzU.hTFPAC.RuY = r1
            Lb7:
                int r1 = QfgSZK.UUsvzU.hTFPAC.RuY
                int r1 = r1 + r0
                r0 = r1 ^ 2439(0x987, float:3.418E-42)
                int r0 = r0 * 13
                QfgSZK.UUsvzU.hTFPAC.RuY = r0
                goto L104
            Lc1:
                int r1 = r0 >> 96
                int r1 = r1 % 45
                int r1 = r1 + r0
                QfgSZK.UUsvzU.hTFPAC.C_B = r1
                int r0 = QfgSZK.UUsvzU.hTFPAC.RuY
                r1 = 2728(0xaa8, float:3.823E-42)
                if (r0 > r1) goto Lfc
            Lce:
                int r5 = QfgSZK.UUsvzU.hTFPAC.RuY
                int r0 = r5 + 65
                r1 = 51
                if (r0 == r1) goto Lf3
                r1 = 170(0xaa, float:2.38E-43)
                if (r0 == r1) goto Leb
                r1 = 353(0x161, float:4.95E-43)
                if (r0 == r1) goto Le8
                r1 = 517(0x205, float:7.24E-43)
                if (r0 == r1) goto Le3
                goto Lce
            Le3:
                int r0 = r5 + r5
                int r0 = r0 * 95
                goto Lf0
            Le8:
                int r0 = r5 % 97
                goto Lef
            Leb:
                int r0 = QfgSZK.UUsvzU.hTFPAC.RuY
                r0 = r0 ^ 4176(0x1050, float:5.852E-42)
            Lef:
                int r0 = r0 + r5
            Lf0:
                QfgSZK.UUsvzU.hTFPAC.RuY = r0
                goto Leb
            Lf3:
                int r5 = QfgSZK.UUsvzU.hTFPAC.RuY
                int r5 = r5 * 98
                int r5 = r5 >> 80
                QfgSZK.UUsvzU.hTFPAC.RuY = r5
                goto Lf3
            Lfc:
                int r0 = QfgSZK.UUsvzU.hTFPAC.C_B
                int r0 = r0 % 59
                r0 = r0 ^ 3033(0xbd9, float:4.25E-42)
                QfgSZK.UUsvzU.hTFPAC.C_B = r0
            L104:
                int r0 = QfgSZK.UUsvzU.hTFPAC.C_B
                int r0 = r0 % 62
                int r0 = r0 % 109
                QfgSZK.UUsvzU.hTFPAC.C_B = r0
                int r0 = QfgSZK.UUsvzU.hTFPAC.RuY
                r0 = r0 ^ 2729(0xaa9, float:3.824E-42)
                if (r0 == 0) goto L124
            L112:
                int r0 = QfgSZK.UUsvzU.hTFPAC.RuY
                int r1 = r0 + 13
                r2 = 3
                if (r1 == r2) goto L11a
                goto L112
            L11a:
                int r0 = r0 * 42
                int r0 = r0 % 105
                r0 = r0 ^ 2246(0x8c6, float:3.147E-42)
                QfgSZK.UUsvzU.hTFPAC.RuY = r0
                goto L124
            L123:
                r5 = r0
            L124:
                return r5
            L125:
                r1.recycle()
                r0.recycle()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: QfgSZK.UUsvzU.hTFPAC.aLnfMH(android.os.IBinder):java.lang.String");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String QqiRNA() {
            IBinder iBinder = this.uVMU;
            if ((RuY ^ 2729) == 0) {
                if (iBinder != null) {
                    return aLnfMH(iBinder);
                }
                return null;
            }
            while (true) {
                int i = RuY;
                if (i + 13 == 2) {
                    RuY = (i + i) * 11016;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            int i;
            if (iBinder == null) {
                return;
            }
            if (RuY > 2728) {
                this.uVMU = iBinder;
                this.fazARR.countDown();
                return;
            }
            while (true) {
                i = RuY;
                int i2 = i + 26;
                if (i2 != 84) {
                    if (i2 == 212) {
                        break;
                    }
                    if (i2 == 377) {
                        RuY = (i * 21) + i + i;
                    } else if (i2 != 492) {
                    }
                    RuY = (RuY + i) % 20;
                }
                RuY = ((RuY + i) * 80) % 61;
            }
            while (true) {
                RuY = (RuY ^ 6958) + i;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.uVMU = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        FQMcgE.RQa = 9057;
        _gq = 9640;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.usN = 6842;
        zQl = 1962;
        GCXiNH.OHr = 2270;
        DlIaRS = FQMcgE.hfdhUn(UUsvzU.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UUsvzU() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.iseLue = countDownLatch;
        this.AsQfc = new hTFPAC(countDownLatch);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK.suEgdN
    public boolean bindToGooglePlayService(ZqidTP zqidTP) {
        if (zqidTP == null || zqidTP.Umbazn == null) {
            FQMcgE.DztXDE(DlIaRS, GCXiNH.fsw("SdW`\u000bRnpxMZW"));
            return false;
        }
        Intent intent = new Intent(GCXiNH.fsw("~~V\"L^ny`M\fBDMZH_Q\u001aT_B\u001eNZN\u0012R^\\VCOcmfp/s[^\u007fmho'[SWG@"));
        intent.setPackage(GCXiNH.fsw("~~V\"L^ny`M\fBDMZH_Q\u001aT_B"));
        return zqidTP.Umbazn.bindService(intent, this.AsQfc, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.DcMfJK.suEgdN
    public String getAdvertisingId(int i) {
        int i2;
        try {
            if (this.iseLue.await(i, TimeUnit.MILLISECONDS)) {
                return this.AsQfc.QqiRNA();
            }
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bEF^\toHYRXV\u0012pTY[OHRIPVP\u0006L@/\"UiSI)k~~"));
            return null;
        } catch (InterruptedException e) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bEF^\toHYRXV\u0012pTY[OHRIPVP\u0006L@#y|"), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            if (zQl > 1961) {
                return null;
            }
            do {
                i2 = zQl;
            } while (i2 + 26 != 3);
            zQl = (i2 % 89) * 104;
            return null;
        } catch (Exception e2) {
            FQMcgE.OijiEz(DlIaRS, e2.toString());
            ORrpqH.uzCIH().seuMaA(e2);
            return null;
        }
    }
}

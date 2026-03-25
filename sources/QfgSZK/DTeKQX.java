package QfgSZK;

import QfgSZK.QhsCdE;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class DTeKQX extends QhsCdE {
    public static int CTZ = 2574;
    public static int _Jg = 3239;
    private String hTObJu;
    private int zDxSWq;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DTeKQX(long j, boolean z) {
        super(j, z);
        this.zDxSWq = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:18:0x0042) to fix multi-entry loop: BACK_EDGE: B:18:0x0042 -> B:19:0x0044 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        int i;
        if (map == null) {
            return;
        }
        map.put(AhwBna.DEVICE_ENCRYPTION_STATUS.DbNXlk(), String.valueOf(this.zDxSWq));
        if ((_Jg ^ 3239) != 0) {
            do {
                int i2 = _Jg;
                i = i2 + 26;
                if (i != 86) {
                    if (i == 217) {
                        _Jg = i2 >> CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256;
                    } else if (i == 249) {
                        _Jg = (i2 % 97) ^ 1250;
                    }
                }
                _Jg = ((_Jg % 38) % 105) ^ 2612;
                break;
            } while (i != 411);
            while (true) {
                _Jg = (_Jg >> 4) ^ 4042;
            }
        }
        map.put(AhwBna.DEVICE_DEV_ENABLED_STATUS.DbNXlk(), this.hTObJu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_DEVICE_ENCRYPT_AND_STATUS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        if (qSusPL.aPFruk() == null) {
            return;
        }
        this.zDxSWq = DGUQLI.gSBher(qSusPL.aPFruk());
        if ((_Jg ^ 3239) == 0) {
            this.hTObJu = DGUQLI.fLIjIY(qSusPL.aPFruk());
            if (_Jg <= 3238) {
                while (true) {
                    int i5 = _Jg;
                    int i6 = i5 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                    if (i6 != 23) {
                        if (i6 != 192) {
                            if (i6 == 223) {
                                _Jg = ((i5 + i5) + i5) ^ 2689;
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                _Jg = (_Jg ^ 3824) % 123;
                _Jg = (_Jg >> 89) ^ 533;
            }
            String str = this.hTObJu;
            if (str != null) {
                if (str.compareTo("1") == 0) {
                    if (CTZ <= 2573) {
                        do {
                            i = CTZ;
                            i2 = _Jg;
                            if (i2 <= 3238) {
                                do {
                                    i3 = _Jg;
                                } while (i3 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 != 3);
                                while (true) {
                                    _Jg = ((_Jg % 103) + i3) ^ 4327;
                                }
                            } else {
                                i4 = i + 52;
                                if (i4 == 19) {
                                    if ((i2 ^ 3239) != 0) {
                                        while (true) {
                                            int i7 = _Jg;
                                            int i8 = i7 + 130;
                                            if (i8 == 86) {
                                                _Jg = ((i7 ^ 1693) + i7) % 107;
                                                break;
                                            } else if (i8 == 229) {
                                                _Jg = ((i7 % 9) + i7) ^ 4547;
                                                break;
                                            } else if (i8 == 319) {
                                                _Jg = ((i7 % 20) + i7) * 91;
                                            }
                                        }
                                    }
                                    CTZ = ((i % AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) + i) >> 55;
                                } else if (i4 != 82) {
                                }
                                do {
                                    CTZ = (CTZ + i) >> 5;
                                } while ((_Jg ^ 3239) == 0);
                                while (_Jg + 104 != 30) {
                                }
                                while (true) {
                                    _Jg = (_Jg % 98) ^ 2041;
                                }
                            }
                        } while (i4 != 169);
                        CTZ = (i * 119) ^ 5307;
                        if ((i2 ^ 3239) != 0) {
                            while (true) {
                                int i9 = _Jg;
                                int i10 = i9 + 65;
                                if (i10 != 12) {
                                    if (i10 == 64) {
                                        _Jg = (_Jg + i9 + i9) * 73;
                                    } else if (i10 == 159) {
                                        _Jg = ((i9 % 30) ^ 1473) * 115;
                                    }
                                }
                                _Jg = ((_Jg ^ 3518) >> 119) * 29;
                                _Jg = (_Jg + i9 + i9) * 73;
                            }
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                this.hTObJu = String.valueOf(z);
                return;
            }
            return;
        }
        while (true) {
            int i11 = _Jg;
            if (i11 + 26 == 69) {
                _Jg = (i11 % 68) >> 21;
            }
        }
    }
}

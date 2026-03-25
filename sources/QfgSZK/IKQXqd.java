package QfgSZK;

import QfgSZK.FQMcgE;
import android.util.Base64;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;
import java.util.zip.CRC32;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class IKQXqd {
    private static String DlIaRS = null;
    public static int JYV = 0;
    private static final int OwnqQG = 16;
    static String QqqDBw = null;
    private static final int QrufSa = 16;
    static String aaEhvi = null;
    private static final int adeHTl = 36;
    public static int zPR;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        JYV = 2318;
        GCXiNH.OHr = 2270;
        FQMcgE.usN = 6842;
        zPR = 9721;
        aaEhvi = GCXiNH.fsw("\\Th#heS1\\cap\u001fyICR\\ZT");
        QqqDBw = GCXiNH.fsw("\\Th#heS1BGrBNMAIQ");
        DlIaRS = FQMcgE.hfdhUn(IKQXqd.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private IKQXqd() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String DsfknC(String str, String str2, String str3) {
        if (str != null && !UPbYzn.iSpHlg(str2)) {
            try {
                byte[] bArrDecode = Base64.decode(str, 2);
                if (bArrDecode != null && bArrDecode.length >= 36) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrDecode.length - 36);
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(36);
                    if (DtnWsU(bArrDecode, 36, byteBufferAllocate, byteBufferAllocate2) && byteBufferAllocate.hasArray() && byteBufferAllocate2.hasArray()) {
                        byte[] bArr = new byte[str2.length() + 36];
                        System.arraycopy(byteBufferAllocate2.array(), 0, bArr, 0, 36);
                        Charset charset = StandardCharsets.UTF_8;
                        System.arraycopy(str2.getBytes(charset), 0, bArr, 36, str2.length());
                        byte[] bArrDHEdFZ = UPbYzn.DHEdFZ(bArr);
                        if (bArrDHEdFZ == null) {
                            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("[pR`^Cd$,NCJFLL\u0007BZ\u0014TW_U]_IY\u001bIQY\u0005\u00133$kcrh"));
                            return null;
                        }
                        byte[] bArrIMXFZQ = iMXFZQ(byteBufferAllocate.array(), Arrays.copyOfRange(bArrDHEdFZ, 0, 16), Arrays.copyOfRange(bArrDHEdFZ, 16, bArrDHEdFZ.length), str3);
                        if (bArrIMXFZQ == null) {
                            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("[pR`^Cd$,NCJFLL\u0007BZ\u0014WWRBVNI\u001cOR\\\u0018GG|hlce"));
                            return null;
                        }
                        String str4 = new String(bArrIMXFZQ, charset);
                        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("YtXcOTe>_\\PJDN\u0012\u0007") + str4);
                        return str4;
                    }
                    FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("[pR`^Cd$,NCJFLL\u0007BZ\u0014WWX^[[OPZY\\\u0018EGk`lo!sJ^`jl*ozh{5}}bdd"));
                    return null;
                }
                FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("[pR`^Cd$,LG@EMMC\u0016YQ]\u0012XC\u000fMP]WV\\J\u0017Rmem\"26"));
                return null;
            } catch (ArrayStoreException | IllegalArgumentException | IndexOutOfBoundsException | NullPointerException e) {
                FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("Yt\u0016cIWtmoIVJEG\bbDG[A\u0012X^_KI\u001cL[J\u0018") + str, e);
                ORrpqH.uzCIH().seuMaA(e);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean DtnWsU(byte[] bArr, int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        boolean z;
        if (bArr != null && bArr.length >= i) {
            int length = i * 2;
            try {
                if (bArr.length < length) {
                    length = (bArr.length - i) * 2;
                    z = true;
                } else {
                    z = false;
                }
                int i2 = 0;
                while (i2 < length) {
                    byteBuffer.put(bArr[i2]);
                    byteBuffer2.put(bArr[i2 + 1]);
                    i2 += 2;
                }
                while (i2 < bArr.length) {
                    if (z) {
                        byteBuffer2.put(bArr[i2]);
                    } else {
                        byteBuffer.put(bArr[i2]);
                    }
                    i2++;
                }
                return true;
            } catch (BufferOverflowException | ReadOnlyBufferException e) {
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("mpI\u007fN\u0011dl~GP\u0003\u0007\tKHXA]]GT\u0010"), e.toString());
                ORrpqH.uzCIH().seuMaA(e);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int OCdtug(byte[] bArr, byte[] bArr2) throws IOException, IllegalArgumentException {
        if (bArr == null || bArr2 == null) {
            throw new IllegalArgumentException(GCXiNH.fsw("T}WiLPm>mZEVGLFS\u0016S[A\u0012rbl\r\u000f\u001cP_@"));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(bArr2);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArrayOutputStream.toByteArray());
        return (int) crc32.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:130:0x01c8) to fix multi-entry loop: BACK_EDGE: B:129:0x01c0 -> B:130:0x01c8 */
    /* JADX DEBUG: Duplicate block (B:145:0x0201) to fix multi-entry loop: BACK_EDGE: B:145:0x0201 -> B:146:0x0203 */
    /* JADX DEBUG: Duplicate block (B:170:0x0253) to fix multi-entry loop: BACK_EDGE: B:170:0x0253 -> B:171:0x0255 */
    /* JADX DEBUG: Duplicate block (B:245:0x0377) to fix multi-entry loop: BACK_EDGE: B:245:0x0377 -> B:246:0x037a */
    /* JADX DEBUG: Duplicate block (B:261:0x03a5) to fix multi-entry loop: BACK_EDGE: B:261:0x03a5 -> B:262:0x03a7 */
    /* JADX DEBUG: Duplicate block (B:297:0x0436) to fix multi-entry loop: BACK_EDGE: B:296:0x042e -> B:297:0x0436 */
    /* JADX DEBUG: Duplicate block (B:33:0x006b) to fix multi-entry loop: BACK_EDGE: B:33:0x006b -> B:34:0x006d */
    /* JADX DEBUG: Duplicate block (B:69:0x00dc) to fix multi-entry loop: BACK_EDGE: B:69:0x00dc -> B:70:0x00de */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x03a5, code lost:
    
        QfgSZK.IKQXqd.JYV = (QfgSZK.IKQXqd.JYV ^ 3690) * 87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0203, code lost:
    
        QfgSZK.IKQXqd.JYV = ((QfgSZK.IKQXqd.JYV >> 57) % 9) % 68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f4, code lost:
    
        if (QfgSZK.IKQXqd.JYV <= 2317) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f7, code lost:
    
        r0 = QfgSZK.IKQXqd.zPR;
        r1 = QfgSZK.IKQXqd.JYV;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fb, code lost:
    
        if (r1 > 2317) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00fd, code lost:
    
        r0 = QfgSZK.IKQXqd.JYV;
        r1 = r0 + 260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0103, code lost:
    
        if (r1 == 27) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0107, code lost:
    
        if (r1 == 175) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010a, code lost:
    
        QfgSZK.IKQXqd.JYV *= 2964;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0111, code lost:
    
        QfgSZK.IKQXqd.JYV = ((r0 * 123) + r0) >> 79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0119, code lost:
    
        QfgSZK.IKQXqd.zPR = ((r0 ^ 1113) >> 83) % 76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0122, code lost:
    
        if ((r1 ^ 2318) == 0) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0124, code lost:
    
        r0 = QfgSZK.IKQXqd.JYV;
        r1 = r0 + 221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x012a, code lost:
    
        if (r1 == 19) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x012e, code lost:
    
        if (r1 == 151) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0132, code lost:
    
        if (r1 == 213) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0135, code lost:
    
        QfgSZK.IKQXqd.JYV = ((r0 + r0) * 3) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x013d, code lost:
    
        QfgSZK.IKQXqd.JYV = r0 >> 93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0141, code lost:
    
        QfgSZK.IKQXqd.JYV = ((QfgSZK.IKQXqd.JYV ^ 1463) + r0) >> 100;
     */
    /* JADX WARN: Path cross not found for [B:349:?, B:340:?], limit reached: 462 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0135 -> B:75:0x00f7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] aWJMta(byte[] bArr, byte[] bArr2) {
        int i;
        byte b;
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
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int length = bArr.length;
        int length2 = bArr2.length;
        if (zPR <= 9720) {
            if ((JYV ^ 2318) != 0) {
                while (true) {
                    i21 = JYV;
                    int i23 = i21 + 26;
                    if (i23 == 22) {
                        i22 = (i21 >> 66) * 39;
                        break;
                    }
                    if (i23 != 121) {
                        if (i23 == 129) {
                            i22 = ((i21 + i21) + i21) >> 73;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                JYV = i22;
                JYV = (JYV * 68) + i21;
            }
            while (true) {
                i19 = zPR;
                int i24 = i19 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                if (i24 == 66) {
                    zPR = (i19 >> 85) + i19;
                } else if (i24 == 263) {
                    break;
                }
            }
            zPR = (i19 % 19) + i19;
            if ((JYV ^ 2318) != 0) {
                while (true) {
                    i20 = JYV;
                    int i25 = i20 + 13;
                    if (i25 == 93) {
                        JYV = ((i20 ^ 3026) % 69) * 88;
                        break;
                    }
                    if (i25 == 244) {
                        break;
                    }
                    if (i25 == 250) {
                        JYV = i20 + i20 + i20;
                    }
                }
                while (true) {
                    JYV = ((JYV % 85) + i20) % 79;
                }
            }
        }
        boolean z = length >= length2;
        if (z) {
            i = length2 * 2;
            if ((zPR ^ 9721) != 0) {
                if ((JYV ^ 2318) == 0) {
                    while (true) {
                        int i26 = zPR;
                        int i27 = i26 + 39;
                        if (i27 == 76) {
                            zPR = (i26 * 93) % 5;
                        } else {
                            if (i27 == 126) {
                                break;
                            }
                            if (i27 == 207) {
                                zPR = ((i26 + i26) % 41) >> 73;
                            } else if (i27 != 227) {
                                continue;
                            } else {
                                zPR = i26 * 1050;
                                if ((JYV ^ 2318) != 0) {
                                    break;
                                }
                            }
                        }
                    }
                }
                do {
                    int i28 = JYV;
                    i18 = i28 + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                    if (i18 == 17) {
                        JYV = i28 * 803;
                    } else if (i18 == 158) {
                        while (true) {
                            JYV = ((JYV >> 18) + i28) % 124;
                        }
                    } else if (i18 != 324) {
                    }
                    while (true) {
                        JYV = (JYV * 875) ^ 4088;
                    }
                } while (i18 != 329);
                while (true) {
                    JYV = (JYV * 103) % 6;
                }
            }
        } else {
            i = length * 2;
        }
        if ((JYV ^ 2318) != 0) {
            while (true) {
                i17 = JYV;
                int i29 = i17 + 39;
                if (i29 != 16) {
                    if (i29 != 60) {
                        if (i29 == 82) {
                            JYV = (i17 * 52) + i17;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            JYV = ((JYV + i17) % 104) * 76;
            while (true) {
                JYV = ((JYV % 35) ^ 1054) * 11;
            }
        } else if (zPR <= 9720) {
            while (true) {
                int i30 = zPR;
                int i31 = i30 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                if (i31 == 74) {
                    do {
                        zPR = (zPR + i30) ^ 1763;
                    } while ((JYV ^ 2318) == 0);
                    while (true) {
                        i16 = JYV;
                        int i32 = i16 + 325;
                        if (i32 == 86) {
                            break;
                        }
                        if (i32 == 183) {
                            JYV = i16 >> 94;
                        } else {
                            if (i32 == 190) {
                                JYV = (i16 ^ 2248) * 1960;
                                break;
                            }
                            if (i32 == 273) {
                                break;
                            }
                        }
                    }
                    while (true) {
                        JYV = ((JYV + i16) % 124) % 125;
                    }
                } else if (i31 == 249) {
                    zPR = (i30 % 107) * 118;
                    if ((JYV ^ 2318) != 0) {
                        while (true) {
                            int i33 = JYV;
                            int i34 = i33 + 312;
                            if (i34 == 6) {
                                break;
                            }
                            if (i34 != 133) {
                                if (i34 == 302) {
                                    JYV = i33 ^ 1283;
                                } else if (i34 == 332) {
                                    JYV = (i33 * 33) ^ 1122;
                                    break;
                                }
                            }
                            JYV = ((JYV ^ 4454) % WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) >> 18;
                        }
                        while (true) {
                            JYV = ((JYV * AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) % 4) >> 122;
                        }
                    }
                }
            }
        } else {
            int i35 = z ? length : length2;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + length2);
            if (JYV > 2317) {
                int i36 = 0;
                int i37 = 0;
                while (i36 < i) {
                    if ((JYV ^ 2318) != 0) {
                        while (true) {
                            int i38 = JYV;
                            int i39 = i38 + 65;
                            if (i39 == 33) {
                                JYV = i38 >> 97;
                                break;
                            }
                            if (i39 == 218) {
                                while (true) {
                                    JYV = (JYV ^ 2322) % WebSocketProtocol.PAYLOAD_SHORT;
                                }
                            } else if (i39 == 346) {
                                break;
                            }
                        }
                        while (true) {
                            JYV = ((JYV >> 114) ^ 1539) >> 81;
                        }
                    } else {
                        byteBufferAllocate.put(bArr[i37]);
                        if ((JYV ^ 2318) != 0) {
                            do {
                                i13 = JYV;
                                i14 = i13 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                                if (i14 == 61) {
                                    while (true) {
                                        JYV = (JYV * 55) >> 98;
                                    }
                                }
                            } while (i14 != 230);
                            JYV = (i13 >> 43) % 37;
                        }
                        byteBufferAllocate.put(bArr2[i37]);
                        i37++;
                        i36 += 2;
                        if ((zPR ^ 9721) != 0) {
                            if ((JYV ^ 2318) != 0) {
                                while (true) {
                                    int i40 = JYV;
                                    int i41 = i40 + 403;
                                    if (i41 == 60) {
                                        JYV = (i40 ^ 1276) + i40;
                                        break;
                                    }
                                    if (i41 == 224) {
                                        break;
                                    }
                                }
                                while (true) {
                                    JYV = ((JYV * 34) >> 30) ^ 1342;
                                }
                            } else {
                                do {
                                    i11 = zPR;
                                } while (i11 + 91 != 70);
                                while (true) {
                                    zPR = ((zPR >> 89) * 84) + i11;
                                    if ((JYV ^ 2318) != 0) {
                                        while (true) {
                                            i12 = JYV;
                                            int i42 = i12 + 416;
                                            if (i42 == 82) {
                                                break;
                                            }
                                            if (i42 == 149) {
                                                JYV = ((i12 >> 69) * 16) + i12;
                                            } else if (i42 == 202) {
                                                JYV = (i12 % 115) * 5;
                                                break;
                                            }
                                        }
                                    }
                                }
                                while (true) {
                                    JYV = ((JYV % 67) + i12) ^ 4382;
                                }
                            }
                        }
                    }
                }
                int i43 = i37;
                loop35: while (i43 < i35) {
                    if (z) {
                        b = bArr[i43];
                        if (JYV <= 2317) {
                            do {
                                i9 = JYV;
                                i10 = i9 + 468;
                                if (i10 == 44) {
                                    while (true) {
                                        JYV = ((JYV ^ 5284) * 119) >> 114;
                                    }
                                }
                            } while (i10 != 136);
                            while (true) {
                                JYV = ((JYV + i9) ^ 4415) % 123;
                            }
                        }
                    } else {
                        b = bArr2[i43];
                    }
                    if ((JYV ^ 2318) != 0) {
                        do {
                            i2 = JYV + 533;
                            if (i2 == 43) {
                                while (true) {
                                    JYV = ((JYV * 66) >> 92) % 60;
                                }
                            }
                        } while (i2 != 188);
                        while (true) {
                            JYV *= 24;
                        }
                    } else {
                        byteBufferAllocate.put(b);
                        i43++;
                        int i44 = zPR;
                        int i45 = JYV;
                        if (i45 <= 2317) {
                            while (true) {
                                i3 = JYV;
                                int i46 = i3 + 546;
                                if (i46 == 60) {
                                    JYV = i3 + i3 + i3 + i3;
                                    break;
                                }
                                if (i46 == 214) {
                                    i4 = i3 >> 85;
                                } else if (i46 == 402) {
                                    i4 = i3 + i3;
                                } else if (i46 == 545) {
                                    break;
                                }
                                JYV = i4 + i3;
                            }
                            while (true) {
                                JYV = (JYV % 9) + i3;
                            }
                        } else if ((i44 ^ 9721) != 0) {
                            if (i45 <= 2317) {
                                while (true) {
                                    int i47 = JYV;
                                    int i48 = i47 + 351;
                                    if (i48 != 74) {
                                        if (i48 == 261) {
                                            JYV = (i47 % 29) >> 32;
                                            break loop35;
                                        }
                                        if (i48 == 458) {
                                            JYV = (i47 % 46) ^ 4999;
                                            break;
                                        }
                                        if (i48 == 636) {
                                            break loop35;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                JYV = ((JYV % 24) % 58) * 98;
                            }
                            do {
                                i5 = zPR;
                                i6 = i5 + 78;
                                if (i6 == 98) {
                                    zPR = (i5 % 43) * 8;
                                    if ((JYV ^ 2318) != 0) {
                                        while (true) {
                                            i7 = JYV;
                                            int i49 = i7 + 52;
                                            if (i49 != 1) {
                                                if (i49 == 185) {
                                                    JYV = ((JYV + i7) ^ 4461) % 44;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        while (true) {
                                            JYV = (JYV ^ 4737) % 13;
                                            JYV = ((JYV + i7) ^ 4461) % 44;
                                        }
                                    }
                                } else if (i6 == 281) {
                                    do {
                                        zPR = (zPR + i5) >> 56;
                                    } while ((JYV ^ 2318) == 0);
                                    while (true) {
                                        int i50 = JYV;
                                        int i51 = i50 + 377;
                                        if (i51 != 83) {
                                            if (i51 == 91) {
                                                JYV = (i50 % 68) * 20;
                                            }
                                        }
                                        JYV = ((JYV >> 61) % 72) >> 6;
                                    }
                                }
                            } while (i6 != 469);
                            do {
                                zPR = zPR + i5 + i5;
                            } while ((JYV ^ 2318) == 0);
                            while (true) {
                                i8 = JYV;
                                int i52 = i8 + 390;
                                if (i52 == 66) {
                                    break;
                                }
                                if (i52 == 225) {
                                    JYV = (i8 + i8) >> 22;
                                }
                            }
                            while (true) {
                                JYV = (JYV ^ 2184) + i8;
                            }
                        }
                    }
                }
                return byteBufferAllocate.array();
            }
            do {
                i15 = JYV;
            } while (i15 + 520 != 34);
            while (true) {
                JYV = (JYV % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) + i15;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:37:0x0080) to fix multi-entry loop: BACK_EDGE: B:37:0x0080 -> B:38:0x0082 */
    public static String apLTlu(String str, String str2, String str3) {
        int i;
        int i2;
        int i3;
        UUID uuidRandomUUID = UUID.randomUUID();
        if ((zPR ^ 9721) != 0) {
            if (JYV <= 2317) {
                while (true) {
                    i3 = JYV;
                    int i4 = i3 + 26;
                    if (i4 == 95) {
                        break;
                    }
                    if (i4 == 104) {
                        JYV = ((i3 ^ 2131) % 119) * 42;
                    }
                }
                while (true) {
                    JYV = ((JYV * 39) + i3) ^ 1139;
                }
            } else {
                while (true) {
                    i = zPR;
                    int i5 = i + 13;
                    if (i5 == 24) {
                        zPR = ((i + i) >> 22) + i;
                    } else if (i5 == 157) {
                        break;
                    }
                }
                int i6 = JYV ^ 2318;
                if (i6 != 0) {
                    while (true) {
                        int i7 = JYV;
                        int i8 = i7 + 65;
                        if (i8 == 53) {
                            break;
                        }
                        if (i8 == 127) {
                            JYV = (i7 >> 15) * 99;
                        }
                    }
                    while (true) {
                        JYV = ((JYV * 13) % 84) >> 97;
                    }
                } else {
                    zPR = ((i ^ 4518) * 3) + i;
                    if (i6 != 0) {
                        while (true) {
                            i2 = JYV;
                            int i9 = i2 + 13;
                            if (i9 == 5) {
                                JYV = (i2 + i2) % 14;
                            } else {
                                if (i9 == 186) {
                                    JYV = ((i2 + i2) + i2) ^ 3328;
                                    break;
                                }
                                if (i9 == 354) {
                                    break;
                                }
                            }
                        }
                        while (true) {
                            JYV = ((JYV + i2) ^ 1493) % 20;
                        }
                    }
                }
            }
        }
        return apLTlu(str, str2, uuidRandomUUID.toString(), str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String apLTlu(String str, String str2, String str3, String str4) {
        if (!UPbYzn.iSpHlg(str) && !UPbYzn.iSpHlg(str2) && !UPbYzn.iSpHlg(str3)) {
            try {
                Charset charset = StandardCharsets.UTF_8;
                byte[] bArrDHEdFZ = UPbYzn.DHEdFZ((str3 + str2).getBytes(charset));
                if (bArrDHEdFZ == null) {
                    return null;
                }
                byte[] bytes = str3.getBytes(charset);
                byte[] bArrGwwzsY = gwwzsY(str.getBytes(charset), Arrays.copyOfRange(bArrDHEdFZ, 0, 16), Arrays.copyOfRange(bArrDHEdFZ, 16, bArrDHEdFZ.length), str4);
                if (bArrGwwzsY == null) {
                    FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("[pR`^Cd$,NCJFLL\u0007BZ\u0014V\\RBVNI\u001cOR\\\u0018GG|hlce"));
                    return null;
                }
                byte[] bArrEncode = Base64.encode(aWJMta(bArrGwwzsY, bytes), 2);
                if (bArrEncode != null) {
                    return new String(bArrEncode, charset);
                }
                FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("[pR`^Cd$,jCPO\u001f\u001c\u0007PT]_WU"));
                return null;
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | NullPointerException | BufferOverflowException | ReadOnlyBufferException e) {
                FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("Rs]yXR`jeGL\u0003o[ZHD"), e);
                ORrpqH.uzCIH().seuMaA(e);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static byte[] gwwzsY(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        if (bArr == null || bArr2 == null || bArr3 == null || str == null) {
            return null;
        }
        if (!str.equals(GCXiNH.fsw("\\Th#heS1\\cap\u001fyICR\\ZT")) && !str.equals(GCXiNH.fsw("\\Th#heS1BGrBNMAIQ"))) {
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, GCXiNH.fsw("\\Th"));
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (IllegalArgumentException | IllegalStateException | UnsupportedOperationException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("Rs]yXR`jeGL\u0003o[ZHD"), e);
            ORrpqH.uzCIH().seuMaA(e);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static byte[] iMXFZQ(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        if (bArr == null || bArr2 == null || bArr3 == null || str == null) {
            return null;
        }
        if (!str.equals(GCXiNH.fsw("\\Th#heS1\\cap\u001fyICR\\ZT")) && !str.equals(GCXiNH.fsw("\\Th#heS1BGrBNMAIQ"))) {
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, GCXiNH.fsw("\\Th"));
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("ytX~RAu>iZPLX\u0013\b"), e);
            ORrpqH.uzCIH().seuMaA(e);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String icKaHr(byte[] bArr, String str, String str2) {
        if (bArr != null && !UPbYzn.iSpHlg(str) && !UPbYzn.iSpHlg(str2)) {
            try {
                byte[] bArrDecode = Base64.decode(bArr, 0);
                if (bArrDecode != null && bArrDecode.length >= 32) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrDecode.length - 16);
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
                    if (DtnWsU(bArrDecode, 16, byteBufferAllocate, byteBufferAllocate2) && byteBufferAllocate.hasArray() && byteBufferAllocate2.hasArray()) {
                        byte[] bArrIMXFZQ = iMXFZQ(byteBufferAllocate.array(), sEcTXd(byteBufferAllocate2.array(), str, str2), byteBufferAllocate2.array(), GCXiNH.fsw("\\Th#heS1BGrBNMAIQ"));
                        if (bArrIMXFZQ == null) {
                            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("{pR`NU!jc\bFFI[QWB\u0015@[W\u0011S@P[\u001cI_JHXHva"));
                            return null;
                        }
                        String str3 = new String(bArrIMXFZQ, StandardCharsets.UTF_8);
                        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("~~Uj\u000bCdm|GLPO\t") + str3);
                        return str3;
                    }
                    FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("[pR`^Cd$,NCJFLL\u0007BZ\u0014WWX^[[OPZY\\\u0018YIkgf\"grQA)mez||"));
                }
                return null;
            } catch (IOException | IllegalArgumentException e) {
                FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("YtTnMDr}m\\G\u0003o[ZHD"), e);
                ORrpqH.uzCIH().seuMaA(e);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String jFiva(String str, String str2) {
        UUID uuidRandomUUID = UUID.randomUUID();
        if ((JYV ^ 2318) == 0) {
            return jFiva(str, str2, uuidRandomUUID.toString());
        }
        while (true) {
            int i = JYV;
            if (i + 13 == 6) {
                JYV = (i ^ 4474) % 59;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String jFiva(String str, String str2, String str3) {
        return apLTlu(str, str2, str3, GCXiNH.fsw("\\Th#heS1BGrBNMAIQ"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:17:0x005d) to fix multi-entry loop: BACK_EDGE: B:16:0x0056 -> B:17:0x005d */
    public static byte[] sEcTXd(byte[] bArr, String str, String str2) throws IOException, IllegalArgumentException {
        int i;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        Charset charset = StandardCharsets.UTF_8;
        byteBufferAllocate.putInt(OCdtug(bArr, str2.getBytes(charset)));
        if ((JYV ^ 2318) != 0) {
            while (true) {
                int i2 = JYV;
                if (i2 + 26 == 86) {
                    JYV = (i2 >> AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) + i2;
                }
            }
        } else {
            byteBufferAllocate.putInt(OCdtug(bArr, str.getBytes(charset)));
            byteBufferAllocate.putInt(OCdtug(str2.getBytes(charset), bArr));
            if ((JYV ^ 2318) == 0) {
                byteBufferAllocate.putInt(OCdtug(str.getBytes(charset), bArr));
                return byteBufferAllocate.array();
            }
            while (true) {
                i = JYV;
                int i3 = i + 39;
                if (i3 != 6) {
                    if (i3 == 192) {
                        JYV = ((i + i) + i) >> 40;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                JYV = ((JYV >> 76) + i) ^ 1651;
            }
        }
    }
}

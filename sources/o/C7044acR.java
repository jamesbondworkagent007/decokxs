package o;

import androidx.core.internal.view.SupportMenu;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: renamed from: o.acR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7044acR {
    public static int AEQbTJ(AbstractC7052acZ abstractC7052acZ, AbstractC7052acZ abstractC7052acZ2, C7110ade c7110ade) {
        long jCopydefault;
        long jCopydefault2;
        int i;
        int iValueOf;
        int i2;
        int i3;
        long jCopydefault3;
        int i4;
        int iValueOf2;
        int i5;
        int i6;
        int iValueOf3;
        int i7;
        int i8;
        int i9;
        char c;
        long j;
        int i10;
        int i11;
        int i12;
        long j2;
        long jValueOf;
        int iValueOf4;
        int i13;
        int iValueOf5;
        long j3;
        long j4;
        int i14 = c7110ade.OLrzqt;
        long j5 = (i14 & 12) == 0 ? 0L : c7110ade.AYXKKw + 1;
        boolean z = false;
        while (true) {
            long jAYXKKw = abstractC7052acZ.AYXKKw();
            char c2 = ' ';
            long j6 = jAYXKKw >>> 32;
            if (j6 >= j5 || j6 <= 33554432) {
                jCopydefault = j6;
            } else {
                do {
                    abstractC7052acZ.KWHzl(jAYXKKw & (-4294967296L));
                    while (true) {
                        jAYXKKw = abstractC7052acZ.AYXKKw();
                        j4 = jAYXKKw >>> 32;
                        if (j4 != 0) {
                            break;
                        }
                        abstractC7052acZ.KWHzl(0L);
                    }
                    if (j4 >= j5) {
                        break;
                    }
                } while (j4 > 33554432);
                jCopydefault = j4;
                z = true;
            }
            if (jCopydefault != 0) {
                do {
                    long jAYXKKw2 = abstractC7052acZ2.AYXKKw();
                    long j7 = jAYXKKw2 >>> 32;
                    if (j7 >= j5 || j7 <= 33554432) {
                        jCopydefault2 = j7;
                    } else {
                        do {
                            abstractC7052acZ2.KWHzl(jAYXKKw2 & (-4294967296L));
                            while (true) {
                                jAYXKKw2 = abstractC7052acZ2.AYXKKw();
                                j3 = jAYXKKw2 >>> 32;
                                if (j3 != 0) {
                                    break;
                                }
                                abstractC7052acZ2.KWHzl(0L);
                            }
                            if (j3 >= j5) {
                                break;
                            }
                        } while (j3 > 33554432);
                        jCopydefault2 = j3;
                        z = true;
                    }
                } while (jCopydefault2 == 0);
                if (jCopydefault != jCopydefault2) {
                    if (c7110ade.AhwBna()) {
                        jCopydefault = c7110ade.copydefault(jCopydefault);
                        jCopydefault2 = c7110ade.copydefault(jCopydefault2);
                    }
                    return jCopydefault < jCopydefault2 ? -1 : 1;
                }
                if (jCopydefault == 1) {
                    if (C7110ade.AEQbTJ(i14) >= 1) {
                        if ((i14 & 2048) == 0) {
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                int i17 = i15 + 1;
                                int iValueOf6 = ((int) abstractC7052acZ.valueOf(i15)) >>> 16;
                                if (iValueOf6 != 0) {
                                    while (true) {
                                        i13 = i16 + 1;
                                        iValueOf5 = ((int) abstractC7052acZ2.valueOf(i16)) >>> 16;
                                        if (iValueOf5 != 0) {
                                            break;
                                        }
                                        i16 = i13;
                                    }
                                    if (iValueOf6 != iValueOf5) {
                                        return iValueOf6 < iValueOf5 ? -1 : 1;
                                    }
                                    if (iValueOf6 == 256) {
                                        break;
                                    }
                                    i15 = i17;
                                    i16 = i13;
                                } else {
                                    i15 = i17;
                                }
                            }
                        } else {
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                int i20 = i18;
                                while (true) {
                                    long jValueOf2 = abstractC7052acZ.valueOf(i20) >>> c2;
                                    if (jValueOf2 <= 33554432) {
                                        j2 = 0;
                                        if (jValueOf2 != 0) {
                                            break;
                                        }
                                    }
                                    i20++;
                                    c2 = ' ';
                                }
                                int i21 = i19;
                                while (true) {
                                    jValueOf = abstractC7052acZ2.valueOf(i21) >>> c2;
                                    if (jValueOf <= 33554432 && jValueOf != j2) {
                                        break;
                                    }
                                    i21++;
                                    j2 = 0;
                                    c2 = ' ';
                                }
                                int i22 = i20;
                                int i23 = i21;
                                do {
                                    iValueOf4 = 0;
                                    while (iValueOf4 == 0 && i22 > i18) {
                                        i22--;
                                        iValueOf4 = ((int) abstractC7052acZ.valueOf(i22)) >>> 16;
                                    }
                                    int iValueOf7 = 0;
                                    while (iValueOf7 == 0 && i23 > i19) {
                                        i23--;
                                        iValueOf7 = ((int) abstractC7052acZ2.valueOf(i23)) >>> 16;
                                    }
                                    if (iValueOf4 != iValueOf7) {
                                        return iValueOf4 < iValueOf7 ? -1 : 1;
                                    }
                                } while (iValueOf4 != 0);
                                if (jValueOf == 1) {
                                    break;
                                }
                                i18 = i20 + 1;
                                i19 = i21 + 1;
                                c2 = ' ';
                            }
                        }
                    }
                    if ((i14 & 1024) != 0) {
                        int iAEQbTJ = C7110ade.AEQbTJ(i14);
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            if (iAEQbTJ == 0) {
                                while (true) {
                                    i7 = i24 + 1;
                                    long jValueOf3 = abstractC7052acZ.valueOf(i24);
                                    i9 = (int) jValueOf3;
                                    c = ' ';
                                    j = 0;
                                    if ((jValueOf3 >>> 32) != 0 && i9 != 0) {
                                        break;
                                    }
                                    i24 = i7;
                                }
                                i5 = i9 & 49152;
                                while (true) {
                                    i10 = i25 + 1;
                                    i11 = i9;
                                    long jValueOf4 = abstractC7052acZ2.valueOf(i25);
                                    i12 = (int) jValueOf4;
                                    if ((jValueOf4 >>> c) != j && i12 != 0) {
                                        break;
                                    }
                                    i25 = i10;
                                    i9 = i11;
                                    c = ' ';
                                    j = 0;
                                }
                                i8 = i12 & 49152;
                                i25 = i10;
                                iValueOf2 = i11;
                            } else {
                                while (true) {
                                    i4 = i24 + 1;
                                    iValueOf2 = (int) abstractC7052acZ.valueOf(i24);
                                    if ((iValueOf2 & SupportMenu.CATEGORY_MASK) != 0) {
                                        break;
                                    }
                                    i24 = i4;
                                }
                                i5 = iValueOf2 & 49152;
                                while (true) {
                                    i6 = i25 + 1;
                                    iValueOf3 = (int) abstractC7052acZ2.valueOf(i25);
                                    if ((iValueOf3 & SupportMenu.CATEGORY_MASK) != 0) {
                                        break;
                                    }
                                    i25 = i6;
                                }
                                i7 = i4;
                                i8 = iValueOf3 & 49152;
                                i25 = i6;
                            }
                            if (i5 != i8) {
                                return (i14 & 256) == 0 ? i5 < i8 ? -1 : 1 : i5 < i8 ? 1 : -1;
                            }
                            if ((iValueOf2 >>> 16) == 256) {
                                break;
                            }
                            i24 = i7;
                        }
                    }
                    if (C7110ade.AEQbTJ(i14) <= 1) {
                        return 0;
                    }
                    int iEZpvd = C7110ade.EZpvd(i14);
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (true) {
                        int i29 = i27 + 1;
                        int iValueOf8 = (int) abstractC7052acZ.valueOf(i27);
                        i28 |= iValueOf8;
                        int i30 = iValueOf8 & iEZpvd;
                        if (i30 != 0) {
                            while (true) {
                                i = i26 + 1;
                                iValueOf = (int) abstractC7052acZ2.valueOf(i26);
                                i28 |= iValueOf;
                                i2 = iValueOf & iEZpvd;
                                if (i2 != 0) {
                                    break;
                                }
                                i26 = i;
                            }
                            if (i30 != i2) {
                                if (C7110ade.copydefault(i14)) {
                                    if (i30 > 256) {
                                        i30 = (iValueOf8 & SupportMenu.CATEGORY_MASK) != 0 ? i30 ^ 49152 : i30 + 16384;
                                    }
                                    if (i2 > 256) {
                                        i2 = (iValueOf & SupportMenu.CATEGORY_MASK) != 0 ? i2 ^ 49152 : i2 + 16384;
                                    }
                                }
                                return i30 < i2 ? -1 : 1;
                            }
                            if (i30 != 256) {
                                i27 = i29;
                                i26 = i;
                            } else {
                                if (C7110ade.AEQbTJ(i14) <= 2) {
                                    return 0;
                                }
                                if (!z && (i28 & 192) == 0) {
                                    return 0;
                                }
                                int i31 = 0;
                                int i32 = 0;
                                while (true) {
                                    long jValueOf5 = abstractC7052acZ.valueOf(i32);
                                    long j8 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                    long j9 = jValueOf5 & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                    long jCopydefault4 = j9 <= 256 ? jValueOf5 >>> 32 : j9 | 4294967103L;
                                    if (jCopydefault4 != 0) {
                                        while (true) {
                                            i3 = i31 + 1;
                                            long jValueOf6 = abstractC7052acZ2.valueOf(i31);
                                            long j10 = jValueOf6 & j8;
                                            jCopydefault3 = j10 <= 256 ? jValueOf6 >>> 32 : j10 | 4294967103L;
                                            if (jCopydefault3 != 0) {
                                                break;
                                            }
                                            i31 = i3;
                                            j8 = WebSocketProtocol.PAYLOAD_SHORT_MAX;
                                        }
                                        if (jCopydefault4 != jCopydefault3) {
                                            if (c7110ade.AhwBna()) {
                                                jCopydefault4 = c7110ade.copydefault(jCopydefault4);
                                                jCopydefault3 = c7110ade.copydefault(jCopydefault3);
                                            }
                                            return jCopydefault4 < jCopydefault3 ? -1 : 1;
                                        }
                                        if (jCopydefault4 == 1) {
                                            return 0;
                                        }
                                        i31 = i3;
                                    }
                                    i32++;
                                }
                            }
                        } else {
                            i27 = i29;
                        }
                    }
                }
            }
        }
    }
}

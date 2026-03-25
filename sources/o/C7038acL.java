package o;

import androidx.core.view.InputDeviceCompat;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.ibm.icu.impl.Trie2;
import com.ibm.icu.lang.UScript;
import com.ibm.icu.text.Normalizer2;
import com.ibm.icu.text.UnicodeSet;
import com.ibm.icu.util.CodePointMap;
import com.ibm.icu.util.CodePointTrie;
import com.ibm.icu.util.ICUException;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import java.util.MissingResourceException;
import o.C7024abY;
import o.C7069acq;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.acL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7038acL {
    public static final int[] AYXKKw;
    public static final C7038acL AhwBna;
    public static final int KWHzl;
    public static final int copydefault;
    public static final int gEmmrt;
    public static final int valueOf;
    public int AkhnZx;
    public C7032acF DbNXlk;
    public StateListAnimator[] djBIcL;
    public C7032acF ejfBZ;
    public C7258agT fARcdN;
    public int fIwbmz;
    public char[] fJNWhG;
    public int[] fetchVPNInfo;
    public int isConnected;
    public Activity[] values;
    public static final int OLrzqt = EZpvd(0);
    public static final int AEQbTJ = EZpvd(15);
    public static final int EZpvd = EZpvd(18);

    public static final int AYXKKw(int i) {
        if (i == 0) {
            return 0;
        }
        if (i < 11) {
            return 1;
        }
        return i < 21 ? 2 : 3;
    }

    public static final int EZpvd(int i) {
        return 1 << i;
    }

    public static int copydefault(int i) {
        if (i > 122 && i < 65313) {
            return -1;
        }
        if (i < 65) {
            return -1;
        }
        if ((i > 90 && i < 97) || i > 65370) {
            return -1;
        }
        if (i > 65338 && i < 65345) {
            return -1;
        }
        if (i <= 122) {
            return (i + 10) - (i > 90 ? 97 : 65);
        }
        return i + (i <= 65338 ? -65303 : -65335);
    }

    public static final int djBIcL(int i) {
        return ((i & 3145728) >> 12) | (i & 255);
    }

    public static final int valueOf(int i) {
        return i >> 6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int values(int i) {
        if (i == 0) {
            return this.AkhnZx;
        }
        if (i != 2) {
            return 0;
        }
        return this.fIwbmz;
    }

    /* JADX INFO: renamed from: o.acL$Fragment */
    public static final class Fragment {
        public CodePointTrie AYXKKw;
        public CodePointTrie EZpvd;
        public CodePointTrie OLrzqt;
        public int copydefault;
        public int djBIcL;
        public int gEmmrt;
        public static final Activity KWHzl = new Activity();
        public static final Fragment AEQbTJ = new Fragment();

        /* JADX INFO: renamed from: o.acL$Fragment$Activity */
        public static final class Activity implements C7024abY.ActionBar {
            private Activity() {
            }

            @Override // o.C7024abY.ActionBar
            public boolean AEQbTJ(byte[] bArr) {
                return bArr[0] == 1;
            }
        }

        public Fragment() {
            this.OLrzqt = null;
            this.EZpvd = null;
            this.AYXKKw = null;
            this.copydefault = 0;
            this.gEmmrt = 0;
            this.djBIcL = 0;
            java.nio.ByteBuffer byteBufferCopydefault = C7024abY.copydefault("ulayout.icu");
            try {
                C7024abY.EZpvd(byteBufferCopydefault, 1281456495, KWHzl);
                int iPosition = byteBufferCopydefault.position();
                int i = byteBufferCopydefault.getInt();
                if (i < 12) {
                    throw new ICUUncheckedIOException("Text layout properties data: not enough indexes");
                }
                int[] iArr = new int[i];
                iArr[0] = i;
                for (int i2 = 1; i2 < i; i2++) {
                    iArr[i2] = byteBufferCopydefault.getInt();
                }
                int i3 = iArr[1];
                if (i3 - (i * 4) >= 16) {
                    this.OLrzqt = CodePointTrie.EZpvd(null, null, byteBufferCopydefault);
                }
                C7024abY.EZpvd(byteBufferCopydefault, i3 - (byteBufferCopydefault.position() - iPosition));
                int i4 = iArr[2];
                if (i4 - i3 >= 16) {
                    this.EZpvd = CodePointTrie.EZpvd(null, null, byteBufferCopydefault);
                }
                C7024abY.EZpvd(byteBufferCopydefault, i4 - (byteBufferCopydefault.position() - iPosition));
                int i5 = iArr[3];
                if (i5 - i4 >= 16) {
                    this.AYXKKw = CodePointTrie.EZpvd(null, null, byteBufferCopydefault);
                }
                C7024abY.EZpvd(byteBufferCopydefault, i5 - (byteBufferCopydefault.position() - iPosition));
                int i6 = iArr[9];
                this.copydefault = i6 >>> 24;
                this.gEmmrt = (i6 >> 16) & 255;
                this.djBIcL = (i6 >> 8) & 255;
            } catch (java.io.IOException e) {
                throw new ICUUncheckedIOException(e);
            }
        }

        public UnicodeSet EZpvd(int i, UnicodeSet unicodeSet) {
            CodePointTrie codePointTrie;
            switch (i) {
                case 12:
                    codePointTrie = this.OLrzqt;
                    break;
                case 13:
                    codePointTrie = this.EZpvd;
                    break;
                case 14:
                    codePointTrie = this.AYXKKw;
                    break;
                default:
                    throw new java.lang.IllegalStateException();
            }
            if (codePointTrie == null) {
                throw new MissingResourceException("no data for one of the text layout properties; src=" + i, "LayoutProps", "");
            }
            CodePointMap.StateListAnimator stateListAnimator = new CodePointMap.StateListAnimator();
            for (int iKWHzl = 0; codePointTrie.AEQbTJ(iKWHzl, null, stateListAnimator); iKWHzl = stateListAnimator.KWHzl() + 1) {
                unicodeSet.KWHzl(iKWHzl);
            }
            return unicodeSet;
        }
    }

    public final int fetchVPNInfo(int i) {
        return this.ejfBZ.OLrzqt(i);
    }

    public int KWHzl(int i, int i2) {
        if (i2 >= this.isConnected) {
            return 0;
        }
        return this.fetchVPNInfo[this.DbNXlk.OLrzqt(i) + i2];
    }

    public C7258agT isConnected(int i) {
        int iKWHzl = KWHzl(i, 0);
        return C7258agT.AEQbTJ((iKWHzl >> 28) & 15, (iKWHzl >> 24) & 15, 0, 0);
    }

    static {
        int iEZpvd = EZpvd(12);
        valueOf = iEZpvd;
        int iEZpvd2 = EZpvd(13);
        copydefault = iEZpvd2;
        int iEZpvd3 = EZpvd(14);
        KWHzl = iEZpvd3;
        gEmmrt = iEZpvd | iEZpvd2 | iEZpvd3;
        AYXKKw = new int[]{0, 0, 0, 0, 1, 0, 4, 5, 3, 2};
        try {
            AhwBna = new C7038acL();
        } catch (java.io.IOException e) {
            throw new MissingResourceException(e.getMessage(), "", "");
        }
    }

    public static final boolean AhwBna(int i) {
        return (EZpvd(C7223afl.djBIcL(i)) & (((AEQbTJ | EZpvd) | OLrzqt) | gEmmrt)) == 0;
    }

    /* JADX INFO: renamed from: o.acL$StateListAnimator */
    public class StateListAnimator {
        public int copydefault;
        public int gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            if (this.gEmmrt == 0) {
                return this.copydefault;
            }
            return 2;
        }

        public StateListAnimator(int i, int i2) {
            this.copydefault = i;
            this.gEmmrt = i2;
        }

        public StateListAnimator(int i) {
            this.copydefault = i;
            this.gEmmrt = 0;
        }

        public boolean EZpvd(int i) {
            return (C7038acL.this.KWHzl(i, this.copydefault) & this.gEmmrt) != 0;
        }
    }

    /* JADX INFO: renamed from: o.acL$Application */
    public class Application extends StateListAnimator {
        public int EZpvd;

        public Application(int i) {
            super(4);
            this.EZpvd = i;
        }

        @Override // o.C7038acL.StateListAnimator
        public boolean EZpvd(int i) {
            return C7034acH.OLrzqt.AEQbTJ(i, this.EZpvd);
        }
    }

    /* JADX INFO: renamed from: o.acL$LoaderManager */
    public class LoaderManager extends StateListAnimator {
        public int EZpvd;

        public LoaderManager(int i, int i2) {
            super(i);
            this.EZpvd = i2;
        }

        @Override // o.C7038acL.StateListAnimator
        public boolean EZpvd(int i) {
            return C7067aco.KWHzl(this.EZpvd - 37).OLrzqt(i);
        }
    }

    public boolean AEQbTJ(int i, int i2) {
        if (i2 < 0 || 65 <= i2) {
            return false;
        }
        return this.djBIcL[i2].EZpvd(i);
    }

    public int fARcdN(int i) {
        return fetchVPNInfo(i) & 31;
    }

    /* JADX INFO: renamed from: o.acL$Activity */
    public class Activity {
        public int AYXKKw;
        public int djBIcL;
        public int gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            if (this.djBIcL == 0) {
                return this.AYXKKw;
            }
            return 2;
        }

        public Activity(int i, int i2, int i3) {
            this.AYXKKw = i;
            this.djBIcL = i2;
            this.gEmmrt = i3;
        }

        public Activity(int i) {
            this.AYXKKw = i;
            this.djBIcL = 0;
        }

        public int OLrzqt(int i) {
            return (C7038acL.this.KWHzl(i, this.AYXKKw) & this.djBIcL) >>> this.gEmmrt;
        }

        public int EZpvd(int i) {
            return (C7038acL.this.values(this.AYXKKw) & this.djBIcL) >>> this.gEmmrt;
        }
    }

    /* JADX INFO: renamed from: o.acL$TaskDescription */
    public class TaskDescription extends Activity {
        public TaskDescription() {
            super(5);
        }

        @Override // o.C7038acL.Activity
        public int EZpvd(int i) {
            return C7030acD.KWHzl.AhwBna(i);
        }
    }

    /* JADX INFO: renamed from: o.acL$ActionBar */
    public class ActionBar extends Activity {
        @Override // o.C7038acL.Activity
        public int EZpvd(int i) {
            return 255;
        }

        public ActionBar(int i) {
            super(i);
        }
    }

    /* JADX INFO: renamed from: o.acL$FragmentManager */
    public class FragmentManager extends Activity {
        public int EZpvd;
        public int KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C7038acL.Activity
        public int EZpvd(int i) {
            return this.KWHzl;
        }

        public FragmentManager(int i, int i2, int i3) {
            super(i);
            this.EZpvd = i2;
            this.KWHzl = i3;
        }

        @Override // o.C7038acL.Activity
        public int OLrzqt(int i) {
            return C7067aco.KWHzl(this.EZpvd - 4108).KWHzl(i);
        }
    }

    public int EZpvd(int i, int i2) {
        if (i2 < 4096) {
            if (i2 < 0 || i2 >= 65) {
                return 0;
            }
            return this.djBIcL[i2].EZpvd(i) ? 1 : 0;
        }
        if (i2 < 4121) {
            return this.values[i2 - 4096].OLrzqt(i);
        }
        if (i2 == 8192) {
            return EZpvd(fARcdN(i));
        }
        return 0;
    }

    public int DbNXlk(int i) {
        if (i < 4096) {
            return (i < 0 || i >= 65) ? -1 : 1;
        }
        if (i < 4121) {
            return this.values[i - 4096].EZpvd(i);
        }
        return -1;
    }

    public final int AkhnZx(int i) {
        if (i < 0) {
            return 0;
        }
        if (i < 65) {
            return this.djBIcL[i].OLrzqt();
        }
        if (i < 4096) {
            return 0;
        }
        if (i < 4121) {
            return this.values[i - 4096].AEQbTJ();
        }
        if (i < 16384) {
            return (i == 8192 || i == 12288) ? 1 : 0;
        }
        if (i >= 16398) {
            return i != 28672 ? 0 : 2;
        }
        switch (i) {
            case 16384:
                return 2;
            case 16385:
                return 5;
            case InputDeviceCompat.SOURCE_STYLUS /* 16386 */:
            case 16388:
            case 16390:
            case 16391:
            case 16392:
            case 16393:
            case 16394:
            case 16396:
                return 4;
            case 16387:
            case 16389:
            case 16395:
                return 3;
            default:
                return 0;
        }
    }

    public int gEmmrt(int i) {
        int iValueOf = valueOf(fetchVPNInfo(i)) - 1;
        if (iValueOf <= 9) {
            return iValueOf;
        }
        return -1;
    }

    public double fJNWhG(int i) {
        int i2;
        double d;
        int iValueOf = valueOf(fetchVPNInfo(i));
        if (iValueOf == 0) {
            return -1.23456789E8d;
        }
        if (iValueOf < 11) {
            return iValueOf - 1;
        }
        if (iValueOf < 21) {
            return iValueOf - 11;
        }
        if (iValueOf < 176) {
            return iValueOf - 21;
        }
        if (iValueOf < 480) {
            return ((double) ((iValueOf >> 4) - 12)) / ((double) ((iValueOf & 15) + 1));
        }
        if (iValueOf < 768) {
            int i3 = (iValueOf & 31) + 2;
            double d2 = (iValueOf >> 5) - 14;
            while (i3 >= 4) {
                d2 *= 10000.0d;
                i3 -= 4;
            }
            if (i3 == 1) {
                d = 10.0d;
            } else if (i3 == 2) {
                d = 100.0d;
            } else {
                if (i3 != 3) {
                    return d2;
                }
                d = 1000.0d;
            }
            return d2 * d;
        }
        if (iValueOf >= 804) {
            if (iValueOf < 828) {
                int i4 = iValueOf - 804;
                return ((double) (((i4 & 3) * 2) + 1)) / ((double) (20 << (i4 >> 2)));
            }
            if (iValueOf >= 844) {
                return -1.23456789E8d;
            }
            int i5 = iValueOf - 828;
            return ((double) (((i5 & 3) * 2) + 1)) / ((double) (32 << (i5 >> 2)));
        }
        int i6 = (iValueOf >> 2) - 191;
        int i7 = (iValueOf & 3) + 1;
        if (i7 == 1) {
            i6 *= 60;
        } else if (i7 != 2) {
            if (i7 != 3) {
                i2 = i7 == 4 ? 12960000 : 216000;
            }
            i6 *= i2;
        } else {
            i6 *= IMarketApiService.SIXTY_MINUTES;
        }
        return i6;
    }

    private C7038acL() throws java.io.IOException {
        int i = 1;
        int i2 = 5;
        int i3 = 2;
        int i4 = 8;
        this.djBIcL = new StateListAnimator[]{new StateListAnimator(1, 256), new StateListAnimator(1, 128), new StateListAnimator(i2) { // from class: o.acL.1
            @Override // o.C7038acL.StateListAnimator
            public boolean EZpvd(int i5) {
                return C7030acD.KWHzl.DbNXlk(i5);
            }
        }, new StateListAnimator(i2) { // from class: o.acL.11
            @Override // o.C7038acL.StateListAnimator
            public boolean EZpvd(int i5) {
                return C7030acD.KWHzl.AkhnZx(i5);
            }
        }, new StateListAnimator(1, 2), new StateListAnimator(1, 524288), new StateListAnimator(1, 1048576), new StateListAnimator(1, 1024), new StateListAnimator(1, 2048), new StateListAnimator(i4) { // from class: o.acL.22
            @Override // o.C7038acL.StateListAnimator
            public boolean EZpvd(int i5) {
                C7069acq c7069acq = C7067aco.AEQbTJ().AhwBna;
                return c7069acq.hDKMBd(c7069acq.AkhnZx(i5));
            }
        }, new StateListAnimator(1, 67108864), new StateListAnimator(1, 8192), new StateListAnimator(1, 16384), new StateListAnimator(1, 64), new StateListAnimator(1, 4), new StateListAnimator(1, MediaHttpDownloader.MAXIMUM_CHUNK_SIZE), new StateListAnimator(1, 16777216), new StateListAnimator(1, 512), new StateListAnimator(1, 32768), new StateListAnimator(1, 65536), new StateListAnimator(i2) { // from class: o.acL.23
            @Override // o.C7038acL.StateListAnimator
            public boolean EZpvd(int i5) {
                return C7030acD.KWHzl.fetchVPNInfo(i5);
            }
        }, new StateListAnimator(1, 2097152), new Application(22), new StateListAnimator(1, 32), new StateListAnimator(1, 4096), new StateListAnimator(1, 8), new StateListAnimator(1, 131072), new Application(27), new StateListAnimator(1, 16), new StateListAnimator(1, 262144), new Application(30), new StateListAnimator(1, 1), new StateListAnimator(1, 8388608), new StateListAnimator(1, 4194304), new Application(34), new StateListAnimator(1, 134217728), new StateListAnimator(1, 268435456), new LoaderManager(8, 37), new LoaderManager(9, 38), new LoaderManager(8, 39), new LoaderManager(9, 40), new StateListAnimator(11) { // from class: o.acL.25
            @Override // o.C7038acL.StateListAnimator
            public boolean EZpvd(int i5) {
                return C7067aco.AEQbTJ().AhwBna.AEQbTJ().iwGUEr(i5);
            }
        }, new StateListAnimator(1, 536870912), new StateListAnimator(1, 1073741824), new StateListAnimator(6) { // from class: o.acL.21
            @Override // o.C7038acL.StateListAnimator
            public boolean EZpvd(int i5) {
                return C7223afl.DbNXlk(i5) || C7223afl.gEmmrt(i5);
            }
        }, new StateListAnimator(i) { // from class: o.acL.24
            @Override // o.C7038acL.StateListAnimator
            public boolean EZpvd(int i5) {
                return i5 <= 159 ? i5 == 9 || i5 == 32 : C7223afl.djBIcL(i5) == 12;
            }
        }, new StateListAnimator(i) { // from class: o.acL.28
            @Override // o.C7038acL.StateListAnimator
            public boolean EZpvd(int i5) {
                return C7038acL.AhwBna(i5);
            }
        }, new StateListAnimator(i) { // from class: o.acL.26
            @Override // o.C7038acL.StateListAnimator
            public boolean EZpvd(int i5) {
                return C7223afl.djBIcL(i5) == 12 || C7038acL.AhwBna(i5);
            }
        }, new StateListAnimator(i) { // from class: o.acL.5
            @Override // o.C7038acL.StateListAnimator
            public boolean EZpvd(int i5) {
                return (i5 <= 102 && i5 >= 65 && (i5 <= 70 || i5 >= 97)) || (i5 >= 65313 && i5 <= 65350 && (i5 <= 65318 || i5 >= 65345)) || C7223afl.djBIcL(i5) == 9;
            }
        }, new Application(49), new Application(50), new Application(51), new Application(52), new Application(53), new StateListAnimator(7) { // from class: o.acL.2
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // o.C7038acL.StateListAnimator
            public boolean EZpvd(int i5) {
                java.lang.String strFetchVPNInfo = C7067aco.AEQbTJ().AhwBna.fetchVPNInfo(i5);
                if (strFetchVPNInfo != null) {
                    i5 = strFetchVPNInfo.codePointAt(0);
                    if (java.lang.Character.charCount(i5) != strFetchVPNInfo.length()) {
                        i5 = -1;
                    }
                } else if (i5 < 0) {
                    return false;
                }
                if (i5 >= 0) {
                    C7034acH c7034acH = C7034acH.OLrzqt;
                    java.lang.StringBuilder sb = C7034acH.copydefault;
                    sb.setLength(0);
                    return c7034acH.copydefault(i5, sb, 0) >= 0;
                }
                return !C7223afl.copydefault(strFetchVPNInfo, true).equals(strFetchVPNInfo);
            }
        }, new Application(55), new StateListAnimator(10) { // from class: o.acL.3
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // o.C7038acL.StateListAnimator
            public boolean EZpvd(int i5) {
                C7069acq c7069acq = C7067aco.copydefault().AhwBna;
                java.lang.String strKWHzl = C7242agD.KWHzl(i5);
                c7069acq.copydefault(strKWHzl, 0, strKWHzl.length(), false, true, new C7069acq.StateListAnimator(c7069acq, new java.lang.StringBuilder(), 5));
                return !C7069acq.ActionBar.OLrzqt(r0, strKWHzl);
            }
        }, new StateListAnimator(2, 268435456), new StateListAnimator(2, 536870912), new StateListAnimator(2, 1073741824), new StateListAnimator(2, Integer.MIN_VALUE), new StateListAnimator(2, 134217728), new StateListAnimator(i3) { // from class: o.acL.4
            @Override // o.C7038acL.StateListAnimator
            public boolean EZpvd(int i5) {
                return 127462 <= i5 && i5 <= 127487;
            }
        }, new StateListAnimator(1, Integer.MIN_VALUE), new StateListAnimator(2, 67108864)};
        this.values = new Activity[]{new TaskDescription() { // from class: o.acL.6
            @Override // o.C7038acL.Activity
            public int OLrzqt(int i5) {
                return C7030acD.KWHzl.AEQbTJ(i5);
            }
        }, new Activity(0, 130816, 8), new ActionBar(i4) { // from class: o.acL.8
            @Override // o.C7038acL.Activity
            public int OLrzqt(int i5) {
                return Normalizer2.OLrzqt().AEQbTJ(i5);
            }
        }, new Activity(2, 31, 0), new Activity(0, 917504, 17), new Activity(i) { // from class: o.acL.7
            @Override // o.C7038acL.Activity
            public int EZpvd(int i5) {
                return 29;
            }

            @Override // o.C7038acL.Activity
            public int OLrzqt(int i5) {
                return C7038acL.this.fARcdN(i5);
            }
        }, new TaskDescription() { // from class: o.acL.9
            @Override // o.C7038acL.Activity
            public int OLrzqt(int i5) {
                return C7030acD.KWHzl.gEmmrt(i5);
            }
        }, new TaskDescription() { // from class: o.acL.10
            @Override // o.C7038acL.Activity
            public int OLrzqt(int i5) {
                return C7030acD.KWHzl.AYXKKw(i5);
            }
        }, new Activity(2, 66060288, 20), new Activity(i) { // from class: o.acL.14
            @Override // o.C7038acL.Activity
            public int EZpvd(int i5) {
                return 3;
            }

            @Override // o.C7038acL.Activity
            public int OLrzqt(int i5) {
                return C7038acL.AYXKKw(C7038acL.valueOf(C7038acL.this.fetchVPNInfo(i5)));
            }
        }, new Activity(i3) { // from class: o.acL.15
            @Override // o.C7038acL.Activity
            public int OLrzqt(int i5) {
                return UScript.OLrzqt(i5);
            }

            @Override // o.C7038acL.Activity
            public int EZpvd(int i5) {
                return C7038acL.djBIcL(C7038acL.this.values(0) & 15728895);
            }
        }, new Activity(i3) { // from class: o.acL.12
            @Override // o.C7038acL.Activity
            public int EZpvd(int i5) {
                return 5;
            }

            @Override // o.C7038acL.Activity
            public int OLrzqt(int i5) {
                int iKWHzl = (C7038acL.this.KWHzl(i5, 2) & 992) >>> 5;
                if (iKWHzl < C7038acL.AYXKKw.length) {
                    return C7038acL.AYXKKw[iKWHzl];
                }
                return 0;
            }
        }, new FragmentManager(8, 4108, 1), new FragmentManager(9, 4109, 1), new FragmentManager(8, 4110, 2), new FragmentManager(9, 4111, 2), new ActionBar(i4) { // from class: o.acL.13
            @Override // o.C7038acL.Activity
            public int OLrzqt(int i5) {
                return C7067aco.AEQbTJ().AhwBna.isConnected(i5) >> 8;
            }
        }, new ActionBar(i4) { // from class: o.acL.20
            @Override // o.C7038acL.Activity
            public int OLrzqt(int i5) {
                return C7067aco.AEQbTJ().AhwBna.isConnected(i5) & 255;
            }
        }, new Activity(2, 992, 5), new Activity(2, 1015808, 15), new Activity(2, 31744, 10), new TaskDescription() { // from class: o.acL.17
            @Override // o.C7038acL.Activity
            public int OLrzqt(int i5) {
                return C7030acD.KWHzl.values(i5);
            }
        }, new Activity(12) { // from class: o.acL.19
            @Override // o.C7038acL.Activity
            public int OLrzqt(int i5) {
                CodePointTrie codePointTrie = Fragment.AEQbTJ.OLrzqt;
                if (codePointTrie != null) {
                    return codePointTrie.copydefault(i5);
                }
                return 0;
            }

            @Override // o.C7038acL.Activity
            public int EZpvd(int i5) {
                return Fragment.AEQbTJ.copydefault;
            }
        }, new Activity(13) { // from class: o.acL.18
            @Override // o.C7038acL.Activity
            public int OLrzqt(int i5) {
                CodePointTrie codePointTrie = Fragment.AEQbTJ.EZpvd;
                if (codePointTrie != null) {
                    return codePointTrie.copydefault(i5);
                }
                return 0;
            }

            @Override // o.C7038acL.Activity
            public int EZpvd(int i5) {
                return Fragment.AEQbTJ.gEmmrt;
            }
        }, new Activity(14) { // from class: o.acL.16
            @Override // o.C7038acL.Activity
            public int OLrzqt(int i5) {
                CodePointTrie codePointTrie = Fragment.AEQbTJ.AYXKKw;
                if (codePointTrie != null) {
                    return codePointTrie.copydefault(i5);
                }
                return 0;
            }

            @Override // o.C7038acL.Activity
            public int EZpvd(int i5) {
                return Fragment.AEQbTJ.djBIcL;
            }
        }};
        if (this.djBIcL.length != 65) {
            throw new ICUException("binProps.length!=UProperty.BINARY_LIMIT");
        }
        java.nio.ByteBuffer byteBufferCopydefault = C7024abY.copydefault("uprops.icu");
        this.fARcdN = C7024abY.EZpvd(byteBufferCopydefault, 1431335535, new Dialog());
        int i5 = byteBufferCopydefault.getInt();
        byteBufferCopydefault.getInt();
        byteBufferCopydefault.getInt();
        int i6 = byteBufferCopydefault.getInt();
        int i7 = byteBufferCopydefault.getInt();
        this.isConnected = byteBufferCopydefault.getInt();
        int i8 = byteBufferCopydefault.getInt();
        int i9 = byteBufferCopydefault.getInt();
        byteBufferCopydefault.getInt();
        byteBufferCopydefault.getInt();
        this.AkhnZx = byteBufferCopydefault.getInt();
        this.fIwbmz = byteBufferCopydefault.getInt();
        C7024abY.EZpvd(byteBufferCopydefault, 16);
        C7032acF c7032acFAEQbTJ = C7032acF.AEQbTJ(byteBufferCopydefault);
        this.ejfBZ = c7032acFAEQbTJ;
        int i10 = (i5 - 16) * 4;
        int iEZpvd = c7032acFAEQbTJ.EZpvd();
        if (iEZpvd > i10) {
            throw new java.io.IOException("uprops.icu: not enough bytes for main trie");
        }
        C7024abY.EZpvd(byteBufferCopydefault, i10 - iEZpvd);
        C7024abY.EZpvd(byteBufferCopydefault, (i6 - i5) * 4);
        if (this.isConnected > 0) {
            C7032acF c7032acFAEQbTJ2 = C7032acF.AEQbTJ(byteBufferCopydefault);
            this.DbNXlk = c7032acFAEQbTJ2;
            int i11 = (i7 - i6) * 4;
            int iEZpvd2 = c7032acFAEQbTJ2.EZpvd();
            if (iEZpvd2 > i11) {
                throw new java.io.IOException("uprops.icu: not enough bytes for additional-properties trie");
            }
            C7024abY.EZpvd(byteBufferCopydefault, i11 - iEZpvd2);
            this.fetchVPNInfo = C7024abY.EZpvd(byteBufferCopydefault, i8 - i7, 0);
        }
        int i12 = (i9 - i8) * 2;
        if (i12 > 0) {
            this.fJNWhG = C7024abY.OLrzqt(byteBufferCopydefault, i12, 0);
        }
    }

    /* JADX INFO: renamed from: o.acL$Dialog */
    public static final class Dialog implements C7024abY.ActionBar {
        private Dialog() {
        }

        @Override // o.C7024abY.ActionBar
        public boolean AEQbTJ(byte[] bArr) {
            return bArr[0] == 7;
        }
    }

    public UnicodeSet copydefault(UnicodeSet unicodeSet) {
        for (Trie2.TaskDescription taskDescription : this.ejfBZ) {
            if (taskDescription.EZpvd) {
                break;
            }
            unicodeSet.KWHzl(taskDescription.KWHzl);
        }
        unicodeSet.KWHzl(9);
        unicodeSet.KWHzl(10);
        unicodeSet.KWHzl(14);
        unicodeSet.KWHzl(28);
        unicodeSet.KWHzl(32);
        unicodeSet.KWHzl(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA);
        unicodeSet.KWHzl(134);
        unicodeSet.KWHzl(127);
        unicodeSet.KWHzl(8202);
        unicodeSet.KWHzl(8208);
        unicodeSet.KWHzl(8298);
        unicodeSet.KWHzl(8304);
        unicodeSet.KWHzl(65279);
        unicodeSet.KWHzl(65280);
        unicodeSet.KWHzl(CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256);
        unicodeSet.KWHzl(CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384);
        unicodeSet.KWHzl(8199);
        unicodeSet.KWHzl(JosStatusCodes.RNT_CODE_SERVER_ERROR);
        unicodeSet.KWHzl(8239);
        unicodeSet.KWHzl(8240);
        unicodeSet.KWHzl(12295);
        unicodeSet.KWHzl(12296);
        unicodeSet.KWHzl(19968);
        unicodeSet.KWHzl(19969);
        unicodeSet.KWHzl(20108);
        unicodeSet.KWHzl(20109);
        unicodeSet.KWHzl(19977);
        unicodeSet.KWHzl(19978);
        unicodeSet.KWHzl(22235);
        unicodeSet.KWHzl(22236);
        unicodeSet.KWHzl(20116);
        unicodeSet.KWHzl(20117);
        unicodeSet.KWHzl(20845);
        unicodeSet.KWHzl(20846);
        unicodeSet.KWHzl(19971);
        unicodeSet.KWHzl(19972);
        unicodeSet.KWHzl(20843);
        unicodeSet.KWHzl(20844);
        unicodeSet.KWHzl(20061);
        unicodeSet.KWHzl(20062);
        unicodeSet.KWHzl(97);
        unicodeSet.KWHzl(123);
        unicodeSet.KWHzl(65);
        unicodeSet.KWHzl(91);
        unicodeSet.KWHzl(65345);
        unicodeSet.KWHzl(65371);
        unicodeSet.KWHzl(65313);
        unicodeSet.KWHzl(65339);
        unicodeSet.KWHzl(103);
        unicodeSet.KWHzl(71);
        unicodeSet.KWHzl(65351);
        unicodeSet.KWHzl(65319);
        unicodeSet.KWHzl(8288);
        unicodeSet.KWHzl(65520);
        unicodeSet.KWHzl(65532);
        unicodeSet.KWHzl(917504);
        unicodeSet.KWHzl(921600);
        unicodeSet.KWHzl(847);
        unicodeSet.KWHzl(848);
        return unicodeSet;
    }

    public void KWHzl(UnicodeSet unicodeSet) {
        if (this.isConnected > 0) {
            for (Trie2.TaskDescription taskDescription : this.DbNXlk) {
                if (taskDescription.EZpvd) {
                    return;
                } else {
                    unicodeSet.KWHzl(taskDescription.KWHzl);
                }
            }
        }
    }

    public static UnicodeSet AEQbTJ(int i, UnicodeSet unicodeSet) {
        return Fragment.AEQbTJ.EZpvd(i, unicodeSet);
    }
}

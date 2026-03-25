package o;

import com.fasterxml.jackson.core.JsonPointer;
import com.google.common.primitives.UnsignedBytes;
import com.ibm.icu.impl.CacheValue;
import com.ibm.icu.util.ICUException;
import com.ibm.icu.util.ICUUncheckedIOException;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceTypeMismatchException;
import com.squareup.moshi.Json;
import java.lang.ref.SoftReference;
import java.nio.IntBuffer;
import o.C7024abY;
import o.C7043acQ;

/* JADX INFO: renamed from: o.aci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7061aci {
    public static final TaskDescription OLrzqt;
    public static LoaderManager copydefault;
    public java.nio.CharBuffer AkhnZx;
    public byte[] AuCTel;
    public boolean DbNXlk;
    public int ejfBZ;
    public int fARcdN;
    public C7061aci fIwbmz;
    public boolean fJNWhG;
    public int fetchVPNInfo;
    public int getFieldNames;
    public int getNewProxyInstance;
    public int hDKMBd;
    public boolean iwGUEr;
    public Fragment uzCIH;
    public java.nio.ByteBuffer values;
    public static final java.nio.CharBuffer AEQbTJ = java.nio.CharBuffer.wrap(Json.UNSET_NAME);
    public static final C7061aci AhwBna = new C7061aci();
    public static final byte[] valueOf = new byte[0];
    public static final java.nio.ByteBuffer AYXKKw = java.nio.ByteBuffer.allocate(0).asReadOnlyBuffer();
    public static final char[] djBIcL = new char[0];
    public static final int[] isConnected = new int[0];
    public static final StateListAnimator KWHzl = new StateListAnimator();
    public static final FragmentManager EZpvd = new FragmentManager();
    public static int[] gEmmrt = {0, 1, 2, 3, 2, 2, 0, 7, 8, 8, -1, -1, -1, -1, 14, -1};

    public static int AEQbTJ(int i) {
        return i >>> 28;
    }

    public static boolean EZpvd(int i) {
        return i == 2 || i == 5 || i == 4;
    }

    public static int KWHzl(int i) {
        return (i << 4) >> 4;
    }

    public static boolean OLrzqt(int i) {
        return i == 8 || i == 9;
    }

    public static int copydefault(int i) {
        return i & 268435455;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd() {
        return this.hDKMBd;
    }

    public final int fetchVPNInfo(int i) {
        return i << 2;
    }

    /* JADX INFO: renamed from: o.aci$TaskDescription */
    public static final class TaskDescription implements C7024abY.ActionBar {
        private TaskDescription() {
        }

        @Override // o.C7024abY.ActionBar
        public boolean AEQbTJ(byte[] bArr) {
            byte b = bArr[0];
            return (b == 1 && (bArr[1] & UnsignedBytes.MAX_VALUE) >= 1) || (2 <= b && b <= 3);
        }
    }

    static {
        OLrzqt = new TaskDescription();
        copydefault = new LoaderManager();
    }

    /* JADX INFO: renamed from: o.aci$PendingIntent */
    public static class PendingIntent {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;

        public PendingIntent(java.lang.String str, java.lang.String str2) {
            this.EZpvd = str == null ? "" : str;
            this.AEQbTJ = str2 == null ? "" : str2;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PendingIntent)) {
                return false;
            }
            PendingIntent pendingIntent = (PendingIntent) obj;
            return this.EZpvd.equals(pendingIntent.EZpvd) && this.AEQbTJ.equals(pendingIntent.AEQbTJ);
        }

        public int hashCode() {
            return this.EZpvd.hashCode() ^ this.AEQbTJ.hashCode();
        }
    }

    /* JADX INFO: renamed from: o.aci$LoaderManager */
    public static class LoaderManager extends AbstractC7078acz<PendingIntent, C7061aci, java.lang.ClassLoader> {
        private LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public C7061aci copydefault(PendingIntent pendingIntent, java.lang.ClassLoader classLoader) {
            java.nio.ByteBuffer byteBufferAEQbTJ;
            java.lang.String strEZpvd = C7061aci.EZpvd(pendingIntent.EZpvd, pendingIntent.AEQbTJ);
            try {
                java.lang.String str = pendingIntent.EZpvd;
                if (str != null && str.startsWith("com/ibm/icu/impl/data/icudt68b")) {
                    byteBufferAEQbTJ = C7024abY.OLrzqt(classLoader, strEZpvd, strEZpvd.substring(31));
                    if (byteBufferAEQbTJ == null) {
                        return C7061aci.AhwBna;
                    }
                } else {
                    java.io.InputStream inputStreamKWHzl = C7055acc.KWHzl(classLoader, strEZpvd);
                    if (inputStreamKWHzl == null) {
                        return C7061aci.AhwBna;
                    }
                    byteBufferAEQbTJ = C7024abY.AEQbTJ(inputStreamKWHzl);
                }
                return new C7061aci(byteBufferAEQbTJ, pendingIntent.EZpvd, pendingIntent.AEQbTJ, classLoader);
            } catch (java.io.IOException e) {
                throw new ICUUncheckedIOException("Data file " + strEZpvd + " is corrupt - " + e.getMessage(), e);
            }
        }
    }

    private C7061aci() {
    }

    public C7061aci(java.nio.ByteBuffer byteBuffer, java.lang.String str, java.lang.String str2, java.lang.ClassLoader classLoader) throws java.io.IOException {
        copydefault(byteBuffer);
        if (this.iwGUEr) {
            C7061aci c7061aciCopydefault = copydefault(str, "pool", classLoader);
            this.fIwbmz = c7061aciCopydefault;
            if (c7061aciCopydefault == null || !c7061aciCopydefault.DbNXlk) {
                throw new java.lang.IllegalStateException("pool.res is not a pool bundle");
            }
            if (c7061aciCopydefault.ejfBZ != this.ejfBZ) {
                throw new java.lang.IllegalStateException("pool.res has a different checksum than this bundle");
            }
        }
    }

    public static C7061aci copydefault(java.lang.String str, java.lang.String str2, java.lang.ClassLoader classLoader) {
        C7061aci c7061aciAEQbTJ = copydefault.AEQbTJ(new PendingIntent(str, str2), classLoader);
        if (c7061aciAEQbTJ == AhwBna) {
            return null;
        }
        return c7061aciAEQbTJ;
    }

    public final void copydefault(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        int iValueOf;
        this.fetchVPNInfo = C7024abY.OLrzqt(byteBuffer, 1382380354, OLrzqt);
        byte b = byteBuffer.get(16);
        java.nio.ByteBuffer byteBufferAEQbTJ = C7024abY.AEQbTJ(byteBuffer);
        this.values = byteBufferAEQbTJ;
        int iRemaining = byteBufferAEQbTJ.remaining();
        this.hDKMBd = this.values.getInt(0);
        int iValueOf2 = valueOf(0);
        int i = iValueOf2 & 255;
        if (i <= 4) {
            throw new ICUException("not enough indexes");
        }
        int i2 = i + 1;
        int i3 = i2 << 2;
        if (iRemaining >= i3) {
            int iValueOf3 = valueOf(3);
            if (iRemaining >= (iValueOf3 << 2)) {
                int i4 = iValueOf3 - 1;
                if (b >= 3) {
                    this.getFieldNames = iValueOf2 >>> 8;
                }
                if (i > 5) {
                    int iValueOf4 = valueOf(5);
                    this.fJNWhG = (iValueOf4 & 1) != 0;
                    this.DbNXlk = (iValueOf4 & 2) != 0;
                    this.iwGUEr = (iValueOf4 & 4) != 0;
                    this.getFieldNames |= (61440 & iValueOf4) << 12;
                    this.getNewProxyInstance = iValueOf4 >>> 16;
                }
                int iValueOf5 = valueOf(1);
                if (iValueOf5 > i2) {
                    if (this.DbNXlk) {
                        this.AuCTel = new byte[(iValueOf5 - i2) << 2];
                        this.values.position(i3);
                    } else {
                        int i5 = iValueOf5 << 2;
                        this.fARcdN = i5;
                        this.AuCTel = new byte[i5];
                    }
                    this.values.get(this.AuCTel);
                }
                if (i <= 6 || (iValueOf = valueOf(6)) <= iValueOf5) {
                    this.AkhnZx = AEQbTJ;
                } else {
                    int i6 = (iValueOf - iValueOf5) * 2;
                    this.values.position(iValueOf5 << 2);
                    java.nio.CharBuffer charBufferAsCharBuffer = this.values.asCharBuffer();
                    this.AkhnZx = charBufferAsCharBuffer;
                    charBufferAsCharBuffer.limit(i6);
                    i4 |= i6 - 1;
                }
                if (i > 7) {
                    this.ejfBZ = valueOf(7);
                }
                if (!this.DbNXlk || this.AkhnZx.length() > 1) {
                    this.uzCIH = new Fragment(i4);
                }
                this.values.position(0);
                return;
            }
        }
        throw new ICUException("not enough bytes");
    }

    public final int valueOf(int i) {
        return this.values.getInt((i + 1) << 2);
    }

    public final char[] OLrzqt(int i, int i2) {
        char[] cArr = new char[i2];
        if (i2 <= 16) {
            for (int i3 = 0; i3 < i2; i3++) {
                cArr[i3] = this.values.getChar(i);
                i += 2;
            }
        } else {
            java.nio.CharBuffer charBufferAsCharBuffer = this.values.asCharBuffer();
            charBufferAsCharBuffer.position(i / 2);
            charBufferAsCharBuffer.get(cArr);
        }
        return cArr;
    }

    public final int DbNXlk(int i) {
        return this.values.getInt(i);
    }

    public final int[] copydefault(int i, int i2) {
        int[] iArr = new int[i2];
        if (i2 <= 16) {
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.values.getInt(i);
                i += 4;
            }
        } else {
            IntBuffer intBufferAsIntBuffer = this.values.asIntBuffer();
            intBufferAsIntBuffer.position(i / 4);
            intBufferAsIntBuffer.get(iArr);
        }
        return iArr;
    }

    public final char[] AuCTel(int i) {
        int i2 = i + 1;
        int iCharAt = this.AkhnZx.charAt(i);
        if (iCharAt <= 0) {
            return djBIcL;
        }
        char[] cArr = new char[iCharAt];
        if (iCharAt <= 16) {
            int i3 = 0;
            while (i3 < iCharAt) {
                cArr[i3] = this.AkhnZx.charAt(i2);
                i3++;
                i2++;
            }
        } else {
            java.nio.CharBuffer charBufferDuplicate = this.AkhnZx.duplicate();
            charBufferDuplicate.position(i2);
            charBufferDuplicate.get(cArr);
        }
        return cArr;
    }

    public final char[] iwGUEr(int i) {
        char c = this.values.getChar(i);
        return c > 0 ? OLrzqt(i + 2, c) : djBIcL;
    }

    public final int[] ejfBZ(int i) {
        int iDbNXlk = DbNXlk(i);
        return iDbNXlk > 0 ? copydefault(i + 4, iDbNXlk) : isConnected;
    }

    public static java.lang.String EZpvd(byte[] bArr, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            byte b = bArr[i];
            if (b != 0) {
                i++;
                sb.append((char) b);
            } else {
                return sb.toString();
            }
        }
    }

    public final java.lang.String values(int i) {
        int i2 = this.fARcdN;
        if (i < i2) {
            return EZpvd(this.AuCTel, i);
        }
        return EZpvd(this.fIwbmz.AuCTel, i - i2);
    }

    public final java.lang.String isConnected(int i) {
        if (i >= 0) {
            return EZpvd(this.AuCTel, i);
        }
        return EZpvd(this.fIwbmz.AuCTel, i & Integer.MAX_VALUE);
    }

    public final void AEQbTJ(int i, C7043acQ.Application application) {
        int i2 = this.fARcdN;
        if (i < i2) {
            application.AEQbTJ(this.AuCTel, i);
        } else {
            application.AEQbTJ(this.fIwbmz.AuCTel, i - i2);
        }
    }

    public final void copydefault(int i, C7043acQ.Application application) {
        if (i >= 0) {
            application.AEQbTJ(this.AuCTel, i);
        } else {
            application.AEQbTJ(this.fIwbmz.AuCTel, i & Integer.MAX_VALUE);
        }
    }

    public final int KWHzl(java.lang.CharSequence charSequence, char c) {
        int i = this.fARcdN;
        if (c < i) {
            return C7024abY.AEQbTJ(charSequence, this.AuCTel, c);
        }
        return C7024abY.AEQbTJ(charSequence, this.fIwbmz.AuCTel, c - i);
    }

    public final int EZpvd(java.lang.CharSequence charSequence, int i) {
        if (i >= 0) {
            return C7024abY.AEQbTJ(charSequence, this.AuCTel, i);
        }
        return C7024abY.AEQbTJ(charSequence, this.fIwbmz.AuCTel, i & Integer.MAX_VALUE);
    }

    public java.lang.String fJNWhG(int i) {
        int iCharAt;
        int i2;
        java.lang.String string;
        int iCopydefault = copydefault(i);
        java.lang.Object objAEQbTJ = this.uzCIH.AEQbTJ(i);
        if (objAEQbTJ != null) {
            return (java.lang.String) objAEQbTJ;
        }
        char cCharAt = this.AkhnZx.charAt(iCopydefault);
        if ((cCharAt & 64512) == 56320) {
            if (cCharAt < 57327) {
                iCharAt = cCharAt & 1023;
                i2 = iCopydefault + 1;
            } else if (cCharAt < 57343) {
                iCharAt = ((cCharAt - 57327) << 16) | this.AkhnZx.charAt(iCopydefault + 1);
                i2 = iCopydefault + 2;
            } else {
                iCharAt = (this.AkhnZx.charAt(iCopydefault + 1) << 16) | this.AkhnZx.charAt(iCopydefault + 2);
                i2 = iCopydefault + 3;
            }
            string = this.AkhnZx.subSequence(i2, iCharAt + i2).toString();
        } else {
            if (cCharAt == 0) {
                return "";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cCharAt);
            while (true) {
                iCopydefault++;
                char cCharAt2 = this.AkhnZx.charAt(iCopydefault);
                if (cCharAt2 == 0) {
                    break;
                }
                sb.append(cCharAt2);
            }
            string = sb.toString();
        }
        return (java.lang.String) this.uzCIH.copydefault(i, string, string.length() * 2);
    }

    public final java.lang.String EZpvd(int i, int i2) {
        if (i2 <= 16) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(this.values.getChar(i));
                i += 2;
            }
            return sb.toString();
        }
        int i4 = i / 2;
        return this.values.asCharBuffer().subSequence(i4, i2 + i4).toString();
    }

    public java.lang.String fARcdN(int i) {
        int iCopydefault = copydefault(i);
        if (i != iCopydefault && AEQbTJ(i) != 6) {
            return null;
        }
        if (iCopydefault == 0) {
            return "";
        }
        if (i != iCopydefault) {
            int i2 = this.getFieldNames;
            if (iCopydefault < i2) {
                return this.fIwbmz.fJNWhG(i);
            }
            return fJNWhG(i - i2);
        }
        java.lang.Object objAEQbTJ = this.uzCIH.AEQbTJ(i);
        if (objAEQbTJ != null) {
            return (java.lang.String) objAEQbTJ;
        }
        int iFetchVPNInfo = fetchVPNInfo(iCopydefault);
        java.lang.String strEZpvd = EZpvd(iFetchVPNInfo + 4, DbNXlk(iFetchVPNInfo));
        return (java.lang.String) this.uzCIH.copydefault(i, strEZpvd, strEZpvd.length() * 2);
    }

    public java.lang.String djBIcL(int i) {
        int iCopydefault = copydefault(i);
        if (AEQbTJ(i) != 3) {
            return null;
        }
        if (iCopydefault == 0) {
            return "";
        }
        java.lang.Object objAEQbTJ = this.uzCIH.AEQbTJ(i);
        if (objAEQbTJ != null) {
            return (java.lang.String) objAEQbTJ;
        }
        int iFetchVPNInfo = fetchVPNInfo(iCopydefault);
        int iDbNXlk = DbNXlk(iFetchVPNInfo);
        return (java.lang.String) this.uzCIH.copydefault(i, EZpvd(iFetchVPNInfo + 4, iDbNXlk), iDbNXlk * 2);
    }

    public byte[] EZpvd(int i, byte[] bArr) {
        int iFetchVPNInfo;
        int iDbNXlk;
        int iCopydefault = copydefault(i);
        if (AEQbTJ(i) != 1) {
            return null;
        }
        if (iCopydefault != 0 && (iDbNXlk = DbNXlk((iFetchVPNInfo = fetchVPNInfo(iCopydefault)))) != 0) {
            if (bArr == null || bArr.length != iDbNXlk) {
                bArr = new byte[iDbNXlk];
            }
            int i2 = iFetchVPNInfo + 4;
            if (iDbNXlk <= 16) {
                int i3 = 0;
                while (i3 < iDbNXlk) {
                    bArr[i3] = this.values.get(i2);
                    i3++;
                    i2++;
                }
            } else {
                java.nio.ByteBuffer byteBufferDuplicate = this.values.duplicate();
                byteBufferDuplicate.position(i2);
                byteBufferDuplicate.get(bArr);
            }
            return bArr;
        }
        return valueOf;
    }

    public java.nio.ByteBuffer gEmmrt(int i) {
        int iCopydefault = copydefault(i);
        if (AEQbTJ(i) != 1) {
            return null;
        }
        if (iCopydefault == 0) {
            return AYXKKw.duplicate();
        }
        int iFetchVPNInfo = fetchVPNInfo(iCopydefault);
        int iDbNXlk = DbNXlk(iFetchVPNInfo);
        if (iDbNXlk == 0) {
            return AYXKKw.duplicate();
        }
        int i2 = iFetchVPNInfo + 4;
        java.nio.ByteBuffer byteBufferDuplicate = this.values.duplicate();
        byteBufferDuplicate.position(i2).limit(i2 + iDbNXlk);
        java.nio.ByteBuffer byteBufferAEQbTJ = C7024abY.AEQbTJ(byteBufferDuplicate);
        return !byteBufferAEQbTJ.isReadOnly() ? byteBufferAEQbTJ.asReadOnlyBuffer() : byteBufferAEQbTJ;
    }

    public int[] AkhnZx(int i) {
        int iCopydefault = copydefault(i);
        if (AEQbTJ(i) != 14) {
            return null;
        }
        if (iCopydefault == 0) {
            return isConnected;
        }
        int iFetchVPNInfo = fetchVPNInfo(iCopydefault);
        return copydefault(iFetchVPNInfo + 4, DbNXlk(iFetchVPNInfo));
    }

    public StateListAnimator AYXKKw(int i) {
        int iAEQbTJ = AEQbTJ(i);
        if (!OLrzqt(iAEQbTJ)) {
            return null;
        }
        int iCopydefault = copydefault(i);
        if (iCopydefault == 0) {
            return KWHzl;
        }
        java.lang.Object objAEQbTJ = this.uzCIH.AEQbTJ(i);
        if (objAEQbTJ != null) {
            return (StateListAnimator) objAEQbTJ;
        }
        return (StateListAnimator) this.uzCIH.copydefault(i, iAEQbTJ == 8 ? new Application(this, iCopydefault) : new ActionBar(this, iCopydefault), 0);
    }

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
    public FragmentManager fIwbmz(int i) {
        Activity voiceInteractor;
        int iKWHzl;
        int iKWHzl2;
        int iAEQbTJ = AEQbTJ(i);
        if (!EZpvd(iAEQbTJ)) {
            return null;
        }
        int iCopydefault = copydefault(i);
        if (iCopydefault == 0) {
            return EZpvd;
        }
        java.lang.Object objAEQbTJ = this.uzCIH.AEQbTJ(i);
        if (objAEQbTJ != null) {
            return (FragmentManager) objAEQbTJ;
        }
        if (iAEQbTJ == 2) {
            voiceInteractor = new TaskStackBuilder(this, iCopydefault);
            iKWHzl2 = voiceInteractor.KWHzl();
        } else if (iAEQbTJ == 5) {
            voiceInteractor = new PictureInPictureParams(this, iCopydefault);
            iKWHzl2 = voiceInteractor.KWHzl();
        } else {
            voiceInteractor = new VoiceInteractor(this, iCopydefault);
            iKWHzl = voiceInteractor.KWHzl() * 4;
            return (FragmentManager) this.uzCIH.copydefault(i, voiceInteractor, iKWHzl);
        }
        iKWHzl = iKWHzl2 * 2;
        return (FragmentManager) this.uzCIH.copydefault(i, voiceInteractor, iKWHzl);
    }

    /* JADX INFO: renamed from: o.aci$Dialog */
    public static class Dialog extends C7043acQ.TaskDescription {
        public int AEQbTJ;
        public C7061aci OLrzqt;

        @Override // o.C7043acQ.TaskDescription
        public int AhwBna() {
            return C7061aci.gEmmrt[C7061aci.AEQbTJ(this.AEQbTJ)];
        }

        @Override // o.C7043acQ.TaskDescription
        public java.lang.String djBIcL() {
            java.lang.String strFARcdN = this.OLrzqt.fARcdN(this.AEQbTJ);
            if (strFARcdN != null) {
                return strFARcdN;
            }
            throw new UResourceTypeMismatchException("");
        }

        @Override // o.C7043acQ.TaskDescription
        public java.lang.String AEQbTJ() {
            java.lang.String strDjBIcL = this.OLrzqt.djBIcL(this.AEQbTJ);
            if (strDjBIcL != null) {
                return strDjBIcL;
            }
            throw new UResourceTypeMismatchException("");
        }

        @Override // o.C7043acQ.TaskDescription
        public int KWHzl() {
            if (C7061aci.AEQbTJ(this.AEQbTJ) != 7) {
                throw new UResourceTypeMismatchException("");
            }
            return C7061aci.KWHzl(this.AEQbTJ);
        }

        @Override // o.C7043acQ.TaskDescription
        public int[] copydefault() {
            int[] iArrAkhnZx = this.OLrzqt.AkhnZx(this.AEQbTJ);
            if (iArrAkhnZx != null) {
                return iArrAkhnZx;
            }
            throw new UResourceTypeMismatchException("");
        }

        @Override // o.C7043acQ.TaskDescription
        public java.nio.ByteBuffer EZpvd() {
            java.nio.ByteBuffer byteBufferGEmmrt = this.OLrzqt.gEmmrt(this.AEQbTJ);
            if (byteBufferGEmmrt != null) {
                return byteBufferGEmmrt;
            }
            throw new UResourceTypeMismatchException("");
        }

        @Override // o.C7043acQ.TaskDescription
        public C7043acQ.Activity OLrzqt() {
            StateListAnimator stateListAnimatorAYXKKw = this.OLrzqt.AYXKKw(this.AEQbTJ);
            if (stateListAnimatorAYXKKw != null) {
                return stateListAnimatorAYXKKw;
            }
            throw new UResourceTypeMismatchException("");
        }

        @Override // o.C7043acQ.TaskDescription
        public C7043acQ.StateListAnimator valueOf() {
            FragmentManager fragmentManagerFIwbmz = this.OLrzqt.fIwbmz(this.AEQbTJ);
            if (fragmentManagerFIwbmz != null) {
                return fragmentManagerFIwbmz;
            }
            throw new UResourceTypeMismatchException("");
        }

        @Override // o.C7043acQ.TaskDescription
        public java.lang.String[] gEmmrt() {
            StateListAnimator stateListAnimatorAYXKKw = this.OLrzqt.AYXKKw(this.AEQbTJ);
            if (stateListAnimatorAYXKKw == null) {
                throw new UResourceTypeMismatchException("");
            }
            return copydefault(stateListAnimatorAYXKKw);
        }

        @Override // o.C7043acQ.TaskDescription
        public java.lang.String[] AYXKKw() {
            StateListAnimator stateListAnimatorAYXKKw = this.OLrzqt.AYXKKw(this.AEQbTJ);
            if (stateListAnimatorAYXKKw != null) {
                return copydefault(stateListAnimatorAYXKKw);
            }
            java.lang.String strFARcdN = this.OLrzqt.fARcdN(this.AEQbTJ);
            if (strFARcdN != null) {
                return new java.lang.String[]{strFARcdN};
            }
            throw new UResourceTypeMismatchException("");
        }

        public final java.lang.String[] copydefault(StateListAnimator stateListAnimator) {
            java.lang.String[] strArr = new java.lang.String[stateListAnimator.copydefault];
            for (int i = 0; i < stateListAnimator.copydefault; i++) {
                java.lang.String strFARcdN = this.OLrzqt.fARcdN(stateListAnimator.copydefault(this.OLrzqt, i));
                if (strFARcdN == null) {
                    throw new UResourceTypeMismatchException("");
                }
                strArr[i] = strFARcdN;
            }
            return strArr;
        }
    }

    /* JADX INFO: renamed from: o.aci$Activity */
    public static class Activity {
        public int OLrzqt;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.copydefault;
        }

        public int copydefault(C7061aci c7061aci, int i) {
            return -1;
        }

        public int KWHzl(C7061aci c7061aci, int i) {
            if (i < 0 || this.copydefault <= i) {
                return -1;
            }
            int iCharAt = c7061aci.AkhnZx.charAt(this.OLrzqt + i);
            if (iCharAt >= c7061aci.getNewProxyInstance) {
                iCharAt = (iCharAt - c7061aci.getNewProxyInstance) + c7061aci.getFieldNames;
            }
            return 1610612736 | iCharAt;
        }

        public int OLrzqt(C7061aci c7061aci, int i) {
            if (i < 0 || this.copydefault <= i) {
                return -1;
            }
            return c7061aci.DbNXlk(this.OLrzqt + (i * 4));
        }

        public int KWHzl(C7061aci c7061aci, java.lang.String str) {
            return copydefault(c7061aci, java.lang.Integer.parseInt(str));
        }
    }

    /* JADX INFO: renamed from: o.aci$StateListAnimator */
    public static class StateListAnimator extends Activity implements C7043acQ.Activity {
        @Override // o.C7043acQ.Activity
        public boolean copydefault(int i, C7043acQ.TaskDescription taskDescription) {
            if (i < 0 || i >= this.copydefault) {
                return false;
            }
            Dialog dialog = (Dialog) taskDescription;
            dialog.AEQbTJ = copydefault(dialog.OLrzqt, i);
            return true;
        }
    }

    /* JADX INFO: renamed from: o.aci$Application */
    public static final class Application extends StateListAnimator {
        @Override // o.C7061aci.Activity
        public int copydefault(C7061aci c7061aci, int i) {
            return OLrzqt(c7061aci, i);
        }

        public Application(C7061aci c7061aci, int i) {
            int iFetchVPNInfo = c7061aci.fetchVPNInfo(i);
            this.copydefault = c7061aci.DbNXlk(iFetchVPNInfo);
            this.OLrzqt = iFetchVPNInfo + 4;
        }
    }

    /* JADX INFO: renamed from: o.aci$ActionBar */
    public static final class ActionBar extends StateListAnimator {
        @Override // o.C7061aci.Activity
        public int copydefault(C7061aci c7061aci, int i) {
            return KWHzl(c7061aci, i);
        }

        public ActionBar(C7061aci c7061aci, int i) {
            this.copydefault = c7061aci.AkhnZx.charAt(i);
            this.OLrzqt = i + 1;
        }
    }

    /* JADX INFO: renamed from: o.aci$FragmentManager */
    public static class FragmentManager extends Activity implements C7043acQ.StateListAnimator {
        public char[] EZpvd;
        public int[] KWHzl;

        public java.lang.String AEQbTJ(C7061aci c7061aci, int i) {
            if (i < 0 || this.copydefault <= i) {
                return null;
            }
            char[] cArr = this.EZpvd;
            return cArr != null ? c7061aci.values(cArr[i]) : c7061aci.isConnected(this.KWHzl[i]);
        }

        public int EZpvd(C7061aci c7061aci, java.lang.CharSequence charSequence) {
            int i = this.copydefault;
            int i2 = 0;
            while (i2 < i) {
                int i3 = (i2 + i) >>> 1;
                char[] cArr = this.EZpvd;
                int iKWHzl = cArr != null ? c7061aci.KWHzl(charSequence, cArr[i3]) : c7061aci.EZpvd(charSequence, this.KWHzl[i3]);
                if (iKWHzl < 0) {
                    i = i3;
                } else {
                    if (iKWHzl <= 0) {
                        return i3;
                    }
                    i2 = i3 + 1;
                }
            }
            return -1;
        }

        @Override // o.C7061aci.Activity
        public int KWHzl(C7061aci c7061aci, java.lang.String str) {
            return copydefault(c7061aci, EZpvd(c7061aci, str));
        }

        @Override // o.C7043acQ.StateListAnimator
        public boolean AEQbTJ(int i, C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
            if (i < 0 || i >= this.copydefault) {
                return false;
            }
            Dialog dialog = (Dialog) taskDescription;
            char[] cArr = this.EZpvd;
            if (cArr != null) {
                dialog.OLrzqt.AEQbTJ(cArr[i], application);
            } else {
                dialog.OLrzqt.copydefault(this.KWHzl[i], application);
            }
            dialog.AEQbTJ = copydefault(dialog.OLrzqt, i);
            return true;
        }

        @Override // o.C7043acQ.StateListAnimator
        public boolean copydefault(java.lang.CharSequence charSequence, C7043acQ.TaskDescription taskDescription) {
            Dialog dialog = (Dialog) taskDescription;
            int iEZpvd = EZpvd(dialog.OLrzqt, charSequence);
            if (iEZpvd < 0) {
                return false;
            }
            dialog.AEQbTJ = copydefault(dialog.OLrzqt, iEZpvd);
            return true;
        }
    }

    /* JADX INFO: renamed from: o.aci$TaskStackBuilder */
    public static final class TaskStackBuilder extends FragmentManager {
        @Override // o.C7061aci.Activity
        public int copydefault(C7061aci c7061aci, int i) {
            return OLrzqt(c7061aci, i);
        }

        public TaskStackBuilder(C7061aci c7061aci, int i) {
            int iFetchVPNInfo = c7061aci.fetchVPNInfo(i);
            char[] cArrIwGUEr = c7061aci.iwGUEr(iFetchVPNInfo);
            this.EZpvd = cArrIwGUEr;
            int length = cArrIwGUEr.length;
            this.copydefault = length;
            this.OLrzqt = iFetchVPNInfo + (((length + 2) & (-2)) * 2);
        }
    }

    /* JADX INFO: renamed from: o.aci$PictureInPictureParams */
    public static final class PictureInPictureParams extends FragmentManager {
        @Override // o.C7061aci.Activity
        public int copydefault(C7061aci c7061aci, int i) {
            return KWHzl(c7061aci, i);
        }

        public PictureInPictureParams(C7061aci c7061aci, int i) {
            char[] cArrAuCTel = c7061aci.AuCTel(i);
            this.EZpvd = cArrAuCTel;
            int length = cArrAuCTel.length;
            this.copydefault = length;
            this.OLrzqt = i + 1 + length;
        }
    }

    /* JADX INFO: renamed from: o.aci$VoiceInteractor */
    public static final class VoiceInteractor extends FragmentManager {
        @Override // o.C7061aci.Activity
        public int copydefault(C7061aci c7061aci, int i) {
            return OLrzqt(c7061aci, i);
        }

        public VoiceInteractor(C7061aci c7061aci, int i) {
            int iFetchVPNInfo = c7061aci.fetchVPNInfo(i);
            int[] iArrEjfBZ = c7061aci.ejfBZ(iFetchVPNInfo);
            this.KWHzl = iArrEjfBZ;
            int length = iArrEjfBZ.length;
            this.copydefault = length;
            this.OLrzqt = iFetchVPNInfo + ((length + 1) * 4);
        }
    }

    /* JADX INFO: renamed from: o.aci$Fragment */
    public static final class Fragment {
        public int[] AEQbTJ = new int[32];
        public java.lang.Object[] AYXKKw = new java.lang.Object[32];
        public int EZpvd;
        public int KWHzl;
        public int OLrzqt;
        public Activity copydefault;

        public static boolean EZpvd(int i) {
            return i < 24 || CacheValue.copydefault();
        }

        public static final java.lang.Object AEQbTJ(java.lang.Object[] objArr, int i, java.lang.Object obj, int i2) {
            java.lang.Object obj2 = objArr[i];
            if (!(obj2 instanceof SoftReference)) {
                return obj2;
            }
            java.lang.Object obj3 = ((SoftReference) obj2).get();
            if (obj3 != null) {
                return obj3;
            }
            objArr[i] = CacheValue.copydefault() ? obj : new SoftReference(obj);
            return obj;
        }

        /* JADX INFO: renamed from: o.aci$Fragment$Activity */
        public static final class Activity {
            public java.lang.Object[] AEQbTJ;
            public int[] EZpvd;
            public int KWHzl;
            public int OLrzqt;
            public int copydefault;

            public Activity(int i, int i2) {
                this.OLrzqt = i;
                this.copydefault = i2;
                int i3 = 1 << (i & 15);
                this.KWHzl = i3 - 1;
                this.EZpvd = new int[i3];
                this.AEQbTJ = new java.lang.Object[i3];
            }

            public java.lang.Object EZpvd(int i) {
                Activity activity;
                int i2 = (i >> this.copydefault) & this.KWHzl;
                int i3 = this.EZpvd[i2];
                if (i3 == i) {
                    return this.AEQbTJ[i2];
                }
                if (i3 != 0 || (activity = (Activity) this.AEQbTJ[i2]) == null) {
                    return null;
                }
                return activity.EZpvd(i);
            }

            public java.lang.Object KWHzl(int i, java.lang.Object obj, int i2) {
                int i3 = this.copydefault;
                int i4 = (i >> i3) & this.KWHzl;
                int[] iArr = this.EZpvd;
                int i5 = iArr[i4];
                if (i5 == i) {
                    return Fragment.AEQbTJ(this.AEQbTJ, i4, obj, i2);
                }
                if (i5 == 0) {
                    java.lang.Object[] objArr = this.AEQbTJ;
                    Activity activity = (Activity) objArr[i4];
                    if (activity != null) {
                        return activity.KWHzl(i, obj, i2);
                    }
                    iArr[i4] = i;
                    objArr[i4] = Fragment.EZpvd(i2) ? obj : new SoftReference(obj);
                    return obj;
                }
                int i6 = this.OLrzqt;
                Activity activity2 = new Activity(i6 >> 4, i3 + (i6 & 15));
                int i7 = (i5 >> activity2.copydefault) & activity2.KWHzl;
                activity2.EZpvd[i7] = i5;
                java.lang.Object[] objArr2 = activity2.AEQbTJ;
                java.lang.Object[] objArr3 = this.AEQbTJ;
                objArr2[i7] = objArr3[i4];
                this.EZpvd[i4] = 0;
                objArr3[i4] = activity2;
                return activity2.KWHzl(i, obj, i2);
            }
        }

        public Fragment(int i) {
            int i2;
            int i3 = 28;
            while (true) {
                this.OLrzqt = i3;
                if (i > 134217727) {
                    break;
                }
                i <<= 1;
                i3 = this.OLrzqt - 1;
            }
            int i4 = this.OLrzqt;
            int i5 = i4 + 2;
            if (i5 <= 7) {
                this.KWHzl = i5;
                return;
            }
            if (i5 < 10) {
                i2 = (i4 - 1) | 48;
            } else {
                this.KWHzl = 7;
                int i6 = i4 - 5;
                int i7 = 4;
                while (true) {
                    if (i6 <= 6) {
                        break;
                    }
                    if (i6 < 9) {
                        i6 = (i6 - 3) | 48;
                        break;
                    } else {
                        this.KWHzl = (6 << i7) | this.KWHzl;
                        i6 -= 6;
                        i7 += 4;
                    }
                }
                i2 = (i6 << i7) | this.KWHzl;
            }
            this.KWHzl = i2;
        }

        public final int copydefault(int i) {
            int iAEQbTJ = C7061aci.AEQbTJ(i);
            return C7061aci.copydefault(i) | ((iAEQbTJ == 6 ? 1 : iAEQbTJ == 5 ? 3 : iAEQbTJ == 9 ? 2 : 0) << this.OLrzqt);
        }

        public final int OLrzqt(int i) {
            return java.util.Arrays.binarySearch(this.AEQbTJ, 0, this.EZpvd, i);
        }

        public java.lang.Object AEQbTJ(int i) {
            java.lang.Object objEZpvd;
            synchronized (this) {
                if (this.EZpvd >= 0) {
                    int iOLrzqt = OLrzqt(i);
                    if (iOLrzqt < 0) {
                        return null;
                    }
                    objEZpvd = this.AYXKKw[iOLrzqt];
                } else {
                    objEZpvd = this.copydefault.EZpvd(copydefault(i));
                    if (objEZpvd == null) {
                        return null;
                    }
                }
                if (objEZpvd instanceof SoftReference) {
                    objEZpvd = ((SoftReference) objEZpvd).get();
                }
                return objEZpvd;
            }
        }

        public java.lang.Object copydefault(int i, java.lang.Object obj, int i2) {
            synchronized (this) {
                if (this.EZpvd >= 0) {
                    int iOLrzqt = OLrzqt(i);
                    if (iOLrzqt >= 0) {
                        return AEQbTJ(this.AYXKKw, iOLrzqt, obj, i2);
                    }
                    int i3 = this.EZpvd;
                    if (i3 < 32) {
                        int i4 = ~iOLrzqt;
                        if (i4 < i3) {
                            int[] iArr = this.AEQbTJ;
                            int i5 = i4 + 1;
                            java.lang.System.arraycopy(iArr, i4, iArr, i5, i3 - i4);
                            java.lang.Object[] objArr = this.AYXKKw;
                            java.lang.System.arraycopy(objArr, i4, objArr, i5, this.EZpvd - i4);
                        }
                        this.EZpvd++;
                        this.AEQbTJ[i4] = i;
                        this.AYXKKw[i4] = EZpvd(i2) ? obj : new SoftReference(obj);
                        return obj;
                    }
                    this.copydefault = new Activity(this.KWHzl, 0);
                    for (int i6 = 0; i6 < 32; i6++) {
                        this.copydefault.KWHzl(copydefault(this.AEQbTJ[i6]), this.AYXKKw[i6], 0);
                    }
                    this.AEQbTJ = null;
                    this.AYXKKw = null;
                    this.EZpvd = -1;
                }
                return this.copydefault.KWHzl(copydefault(i), obj, i2);
            }
        }
    }

    public static java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            if (str2.length() == 0) {
                return ULocale.getDefault().toString();
            }
            return str2 + ".res";
        }
        if (str.indexOf(46) == -1) {
            if (str.charAt(str.length() - 1) != '/') {
                return str + "/" + str2 + ".res";
            }
            return str + str2 + ".res";
        }
        java.lang.String strReplace = str.replace('.', JsonPointer.SEPARATOR);
        if (str2.length() == 0) {
            return strReplace + ".res";
        }
        return strReplace + "_" + str2 + ".res";
    }
}

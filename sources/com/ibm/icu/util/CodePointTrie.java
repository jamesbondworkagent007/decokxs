package com.ibm.icu.util;

import androidx.core.view.PointerIconCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.common.primitives.UnsignedBytes;
import com.ibm.icu.util.CodePointMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.C7024abY;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CodePointTrie extends CodePointMap {

    @Deprecated
    public final ActionBar AEQbTJ;
    public final int AYXKKw;
    public final int[] EZpvd;

    @Deprecated
    public final int KWHzl;
    public final int OLrzqt;

    @Deprecated
    public final int copydefault;
    public final int gEmmrt;
    public final char[] valueOf;

    public enum Type {
        FAST,
        SMALL
    }

    public enum ValueWidth {
        BITS_16,
        BITS_32,
        BITS_8
    }

    public abstract Type AEQbTJ();

    @Deprecated
    public abstract int KWHzl(int i);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 char[]), (r2v0 com.ibm.icu.util.CodePointTrie$ActionBar), (r3v0 int), (r4v0 int), (r5v0 int) A[MD:(char[], com.ibm.icu.util.CodePointTrie$ActionBar, int, int, int):void (m)] (LINE:27) call: com.ibm.icu.util.CodePointTrie.<init>(char[], com.ibm.icu.util.CodePointTrie$ActionBar, int, int, int):void type: THIS */
    public /* synthetic */ CodePointTrie(char[] cArr, ActionBar actionBar, int i, int i2, int i3, AnonymousClass4 anonymousClass4) {
        this(cArr, actionBar, i, i2, i3);
    }

    public CodePointTrie(char[] cArr, ActionBar actionBar, int i, int i2, int i3) {
        this.EZpvd = new int[128];
        this.valueOf = cArr;
        this.AEQbTJ = actionBar;
        this.KWHzl = actionBar.OLrzqt();
        this.copydefault = i;
        this.AYXKKw = i2;
        this.OLrzqt = i3;
        for (int i4 = 0; i4 < 128; i4++) {
            this.EZpvd[i4] = actionBar.copydefault(i4);
        }
        int i5 = this.KWHzl;
        this.gEmmrt = actionBar.copydefault(i3 >= i5 ? i5 - 2 : i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [265=4] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7 A[Catch: all -> 0x0139, TryCatch #0 {all -> 0x0139, blocks: (B:3:0x0004, B:5:0x000c, B:16:0x002c, B:19:0x004d, B:23:0x005a, B:27:0x0063, B:32:0x0073, B:40:0x0081, B:42:0x0095, B:46:0x009e, B:48:0x00a1, B:50:0x00a7, B:54:0x00ba, B:56:0x00c2, B:57:0x00cb, B:60:0x00d7, B:61:0x00de, B:62:0x00df, B:64:0x00e7, B:65:0x00f0, B:68:0x00fc, B:70:0x0104, B:71:0x010d, B:74:0x0119, B:75:0x0120, B:43:0x0098, B:45:0x009c, B:47:0x00a0, B:76:0x0121, B:77:0x0128, B:78:0x0129, B:79:0x0130, B:28:0x0066, B:29:0x006d, B:30:0x006e, B:31:0x0071, B:20:0x0050, B:21:0x0057, B:22:0x0058, B:10:0x001b, B:11:0x0022, B:12:0x0023, B:14:0x0027, B:15:0x0029, B:80:0x0131, B:81:0x0138), top: B:85:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0119 A[Catch: all -> 0x0139, TRY_ENTER, TryCatch #0 {all -> 0x0139, blocks: (B:3:0x0004, B:5:0x000c, B:16:0x002c, B:19:0x004d, B:23:0x005a, B:27:0x0063, B:32:0x0073, B:40:0x0081, B:42:0x0095, B:46:0x009e, B:48:0x00a1, B:50:0x00a7, B:54:0x00ba, B:56:0x00c2, B:57:0x00cb, B:60:0x00d7, B:61:0x00de, B:62:0x00df, B:64:0x00e7, B:65:0x00f0, B:68:0x00fc, B:70:0x0104, B:71:0x010d, B:74:0x0119, B:75:0x0120, B:43:0x0098, B:45:0x009c, B:47:0x00a0, B:76:0x0121, B:77:0x0128, B:78:0x0129, B:79:0x0130, B:28:0x0066, B:29:0x006d, B:30:0x006e, B:31:0x0071, B:20:0x0050, B:21:0x0057, B:22:0x0058, B:10:0x001b, B:11:0x0022, B:12:0x0023, B:14:0x0027, B:15:0x0029, B:80:0x0131, B:81:0x0138), top: B:85:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CodePointTrie EZpvd(Type type, ValueWidth valueWidth, ByteBuffer byteBuffer) {
        Type type2;
        ValueWidth valueWidth2;
        int i;
        int i2;
        ByteOrder byteOrderOrder = byteBuffer.order();
        try {
            if (byteBuffer.remaining() < 16) {
                throw new ICUUncheckedIOException("Buffer too short for a CodePointTrie header");
            }
            int i3 = byteBuffer.getInt();
            if (i3 == 862548564) {
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                if (byteOrderOrder == byteOrder) {
                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                }
                byteBuffer.order(byteOrder);
            } else if (i3 != 1416784179) {
                throw new ICUUncheckedIOException("Buffer does not contain a serialized CodePointTrie");
            }
            char c = byteBuffer.getChar();
            char c2 = byteBuffer.getChar();
            char c3 = byteBuffer.getChar();
            char c4 = byteBuffer.getChar();
            char c5 = byteBuffer.getChar();
            char c6 = byteBuffer.getChar();
            int i4 = (c >> 6) & 3;
            if (i4 == 0) {
                type2 = Type.FAST;
            } else {
                if (i4 != 1) {
                    throw new ICUUncheckedIOException("CodePointTrie data header has an unsupported type");
                }
                type2 = Type.SMALL;
            }
            int i5 = c & 7;
            if (i5 == 0) {
                valueWidth2 = ValueWidth.BITS_16;
            } else if (i5 == 1) {
                valueWidth2 = ValueWidth.BITS_32;
            } else {
                if (i5 != 2) {
                    throw new ICUUncheckedIOException("CodePointTrie data header has an unsupported value width");
                }
                valueWidth2 = ValueWidth.BITS_8;
            }
            if ((c & '8') != 0) {
                throw new ICUUncheckedIOException("CodePointTrie data header has unsupported options");
            }
            if (type == null) {
                type = type2;
            }
            if (valueWidth == null) {
                valueWidth = valueWidth2;
            }
            if (type != type2 || valueWidth != valueWidth2) {
                throw new ICUUncheckedIOException("CodePointTrie data header has a different type or value width than required");
            }
            int i6 = c3 | ((61440 & c) << 4);
            int i7 = ((c & 3840) << 8) | c5;
            int i8 = c6 << '\t';
            int i9 = c2 * 2;
            if (valueWidth == ValueWidth.BITS_16) {
                i2 = i6 * 2;
            } else {
                if (valueWidth != ValueWidth.BITS_32) {
                    i = i9 + i6;
                    if (byteBuffer.remaining() >= i) {
                        throw new ICUUncheckedIOException("Buffer too short for the CodePointTrie data");
                    }
                    char[] cArrOLrzqt = C7024abY.OLrzqt(byteBuffer, c2, 0);
                    int i10 = AnonymousClass4.AEQbTJ[valueWidth.ordinal()];
                    if (i10 == 1) {
                        char[] cArrOLrzqt2 = C7024abY.OLrzqt(byteBuffer, i6, 0);
                        return type == Type.FAST ? new FragmentManager(cArrOLrzqt, cArrOLrzqt2, i8, c4, i7) : new LoaderManager(cArrOLrzqt, cArrOLrzqt2, i8, c4, i7);
                    }
                    if (i10 == 2) {
                        int[] iArrEZpvd = C7024abY.EZpvd(byteBuffer, i6, 0);
                        return type == Type.FAST ? new Fragment(cArrOLrzqt, iArrEZpvd, i8, c4, i7) : new PictureInPictureParams(cArrOLrzqt, iArrEZpvd, i8, c4, i7);
                    }
                    if (i10 != 3) {
                        throw new AssertionError("should be unreachable");
                    }
                    byte[] bArrCopydefault = C7024abY.copydefault(byteBuffer, i6, 0);
                    return type == Type.FAST ? new Dialog(cArrOLrzqt, bArrCopydefault, i8, c4, i7) : new TaskStackBuilder(cArrOLrzqt, bArrCopydefault, i8, c4, i7);
                }
                i2 = i6 * 4;
            }
            i = i9 + i2;
            if (byteBuffer.remaining() >= i) {
            }
        } finally {
            byteBuffer.order(byteOrderOrder);
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.util.CodePointTrie$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[ValueWidth.values().length];
            AEQbTJ = iArr;
            try {
                iArr[ValueWidth.BITS_16.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[ValueWidth.BITS_32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[ValueWidth.BITS_8.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public int copydefault(int i) {
        return this.AEQbTJ.copydefault(KWHzl(i));
    }

    public static final int AEQbTJ(int i, int i2, int i3, CodePointMap.ActionBar actionBar) {
        return i == i2 ? i3 : actionBar != null ? actionBar.OLrzqt(i) : i;
    }

    /* JADX DEBUG: Duplicate block (B:84:0x0160) to fix multi-entry loop: BACK_EDGE: B:84:0x0160 -> B:87:0x0167 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:105:0x0167 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:114:? */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0167, code lost:
    
        r11 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0125, code lost:
    
        r26.OLrzqt(r24, r11 - 1, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0163, code lost:
    
        r26.OLrzqt(r24, r11, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0166, code lost:
    
        return r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016a  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // com.ibm.icu.util.CodePointMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AEQbTJ(int i, CodePointMap.ActionBar actionBar, CodePointMap.StateListAnimator stateListAnimator) {
        char c;
        int i2;
        int i3;
        int i4;
        char c2;
        ?? r12;
        int i5;
        char c3;
        int i6;
        boolean z;
        int i7;
        int i8;
        ?? r122;
        Type type;
        if (i < 0 || 1114111 < i) {
            return false;
        }
        ?? r7 = 1;
        if (i >= this.copydefault) {
            int iCopydefault = this.AEQbTJ.copydefault(this.KWHzl - 2);
            if (actionBar != null) {
                iCopydefault = actionBar.OLrzqt(iCopydefault);
            }
            stateListAnimator.OLrzqt(i, 1114111, iCopydefault);
            return true;
        }
        int iOLrzqt = this.gEmmrt;
        if (actionBar != null) {
            iOLrzqt = actionBar.OLrzqt(iOLrzqt);
        }
        Type typeAEQbTJ = AEQbTJ();
        char c4 = 65535;
        int i9 = i;
        int i10 = -1;
        ?? r123 = 0;
        int iAEQbTJ = 0;
        int i11 = 0;
        loop0: while (true) {
            if (i9 > 65535 || (typeAEQbTJ != (type = Type.FAST) && i9 > 4095)) {
                int i12 = i9 >> 14;
                int i13 = typeAEQbTJ == Type.FAST ? i12 + PointerIconCompat.TYPE_GRAB : i12 + 64;
                char[] cArr = this.valueOf;
                c = cArr[cArr[i13] + ((i9 >> 9) & 31)];
                if (c != c4 || i9 - i < 512) {
                    ?? r124 = r123;
                    if (c == this.AYXKKw) {
                        if (r123 == 0) {
                            i11 = this.gEmmrt;
                            iAEQbTJ = iOLrzqt;
                            r124 = r7;
                        } else if (iOLrzqt != iAEQbTJ) {
                            stateListAnimator.OLrzqt(i, i9 - r7, iAEQbTJ);
                            return r7;
                        }
                        i9 = (i9 + 512) & (-512);
                        c4 = c;
                        i5 = this.OLrzqt;
                        r12 = r124;
                    } else {
                        i2 = 32;
                        i3 = 16;
                        i4 = (i9 >> 4) & 31;
                        c2 = c;
                    }
                } else {
                    i9 += 512;
                    i5 = i10;
                    r12 = r123;
                }
                if (i9 >= this.copydefault) {
                    stateListAnimator.OLrzqt(i, AEQbTJ(this.AEQbTJ.copydefault(this.KWHzl + (-2)), this.gEmmrt, iOLrzqt, actionBar) != iAEQbTJ ? i9 - 1 : 1114111, iAEQbTJ);
                    return true;
                }
                r7 = 1;
                i10 = i5;
                r123 = r12;
            } else {
                i2 = typeAEQbTJ == type ? 1024 : 64;
                c2 = c4;
                i4 = i9 >> 6;
                i3 = 64;
                c = 0;
            }
            while (true) {
                if ((c & 32768) == 0) {
                    c3 = c2;
                    i6 = this.valueOf[c + i4];
                } else {
                    int i14 = (c & 32767) + (i4 & (-8)) + (i4 >> 3);
                    int i15 = i4 & 7;
                    c3 = c2;
                    char[] cArr2 = this.valueOf;
                    i6 = ((cArr2[i14] << ((i15 * 2) + 2)) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | cArr2[i14 + 1 + i15];
                }
                if (i6 != i10 || i9 - i < i3) {
                    int i16 = i3 - 1;
                    ?? r125 = r123;
                    if (i6 == this.OLrzqt) {
                        if (r123 == 0) {
                            i11 = this.gEmmrt;
                            iAEQbTJ = iOLrzqt;
                            r125 = 1;
                        } else if (iOLrzqt != iAEQbTJ) {
                            stateListAnimator.OLrzqt(i, i9 - 1, iAEQbTJ);
                            return true;
                        }
                        i7 = (~i16) & (i9 + i3);
                        c2 = c3;
                        r122 = r125;
                    } else {
                        int i17 = (i9 & i16) + i6;
                        char c5 = c;
                        int iCopydefault2 = this.AEQbTJ.copydefault(i17);
                        if (r123 != 0) {
                            if (iCopydefault2 == i11) {
                                z = true;
                                i8 = i16;
                                c = c5;
                            } else {
                                if (actionBar == null || AEQbTJ(iCopydefault2, this.gEmmrt, iOLrzqt, actionBar) != iAEQbTJ) {
                                    break loop0;
                                }
                                i8 = i16;
                                i11 = iCopydefault2;
                                c = c5;
                                z = true;
                            }
                            i16 = i8;
                            r123 = r123;
                            i7 = i9 + 1;
                            if ((i7 & i16) != 0) {
                                i8 = i16;
                                i17++;
                                int iCopydefault3 = this.AEQbTJ.copydefault(i17);
                                if (iCopydefault3 == i11) {
                                    i9 = i7;
                                } else {
                                    if (actionBar == null || AEQbTJ(iCopydefault3, this.gEmmrt, iOLrzqt, actionBar) != iAEQbTJ) {
                                        break loop0;
                                    }
                                    i11 = iCopydefault3;
                                    i9 = i7;
                                }
                                i16 = i8;
                                r123 = r123;
                                i7 = i9 + 1;
                                if ((i7 & i16) != 0) {
                                    c2 = c3;
                                    r122 = r123;
                                }
                            }
                        } else {
                            z = true;
                            i11 = iCopydefault2;
                            iAEQbTJ = AEQbTJ(iCopydefault2, this.gEmmrt, iOLrzqt, actionBar);
                            r123 = 1;
                            c = c5;
                            i7 = i9 + 1;
                            if ((i7 & i16) != 0) {
                            }
                        }
                    }
                    i10 = i6;
                    i9 = i7;
                    r123 = r122;
                } else {
                    i9 += i3;
                    c2 = c3;
                    i10 = i10;
                    r123 = r123;
                }
                int i18 = i4 + 1;
                if (i18 >= i2) {
                    c4 = c2;
                    i5 = i10;
                    r12 = r123;
                    break;
                }
                i4 = i18;
            }
        }
    }

    public static abstract class ActionBar {
        public abstract int OLrzqt();

        public abstract int copydefault(int i);

        private ActionBar() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:600) call: com.ibm.icu.util.CodePointTrie.ActionBar.<init>():void type: THIS */
        public /* synthetic */ ActionBar(AnonymousClass4 anonymousClass4) {
            this();
        }
    }

    public static final class Activity extends ActionBar {
        public char[] copydefault;

        public Activity(char[] cArr) {
            super(null);
            this.copydefault = cArr;
        }

        @Override // com.ibm.icu.util.CodePointTrie.ActionBar
        public int OLrzqt() {
            return this.copydefault.length;
        }

        @Override // com.ibm.icu.util.CodePointTrie.ActionBar
        public int copydefault(int i) {
            return this.copydefault[i];
        }
    }

    public static final class Application extends ActionBar {
        public int[] KWHzl;

        public Application(int[] iArr) {
            super(null);
            this.KWHzl = iArr;
        }

        @Override // com.ibm.icu.util.CodePointTrie.ActionBar
        public int OLrzqt() {
            return this.KWHzl.length;
        }

        @Override // com.ibm.icu.util.CodePointTrie.ActionBar
        public int copydefault(int i) {
            return this.KWHzl[i];
        }
    }

    public static final class TaskDescription extends ActionBar {
        public byte[] AEQbTJ;

        public TaskDescription(byte[] bArr) {
            super(null);
            this.AEQbTJ = bArr;
        }

        @Override // com.ibm.icu.util.CodePointTrie.ActionBar
        public int OLrzqt() {
            return this.AEQbTJ.length;
        }

        @Override // com.ibm.icu.util.CodePointTrie.ActionBar
        public int copydefault(int i) {
            return this.AEQbTJ[i] & UnsignedBytes.MAX_VALUE;
        }
    }

    @Deprecated
    public final int OLrzqt(int i) {
        return this.valueOf[i >> 6] + (i & 63);
    }

    @Deprecated
    public final int AEQbTJ(Type type, int i) {
        return i >= this.copydefault ? this.KWHzl - 2 : EZpvd(type, i);
    }

    public final int EZpvd(Type type, int i) {
        int i2;
        int i3 = i >> 14;
        int i4 = type == Type.FAST ? i3 + PointerIconCompat.TYPE_GRAB : i3 + 64;
        char[] cArr = this.valueOf;
        char c = cArr[cArr[i4] + ((i >> 9) & 31)];
        int i5 = i >> 4;
        int i6 = i5 & 31;
        if ((32768 & c) == 0) {
            i2 = cArr[c + i6];
        } else {
            int i7 = (c & 32767) + (i5 & 24) + (i6 >> 3);
            int i8 = i5 & 7;
            i2 = cArr[i7 + 1 + i8] | ((cArr[i7] << ((i8 * 2) + 2)) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        }
        return i2 + (i & 15);
    }

    public static abstract class StateListAnimator extends CodePointTrie {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 char[]), (r2v0 com.ibm.icu.util.CodePointTrie$ActionBar), (r3v0 int), (r4v0 int), (r5v0 int) A[MD:(char[], com.ibm.icu.util.CodePointTrie$ActionBar, int, int, int):void (m)] (LINE:744) call: com.ibm.icu.util.CodePointTrie.StateListAnimator.<init>(char[], com.ibm.icu.util.CodePointTrie$ActionBar, int, int, int):void type: THIS */
        public /* synthetic */ StateListAnimator(char[] cArr, ActionBar actionBar, int i, int i2, int i3, AnonymousClass4 anonymousClass4) {
            this(cArr, actionBar, i, i2, i3);
        }

        public StateListAnimator(char[] cArr, ActionBar actionBar, int i, int i2, int i3) {
            super(cArr, actionBar, i, i2, i3, null);
        }

        @Override // com.ibm.icu.util.CodePointTrie
        public final Type AEQbTJ() {
            return Type.FAST;
        }

        @Override // com.ibm.icu.util.CodePointTrie
        @Deprecated
        public final int KWHzl(int i) {
            if (i >= 0) {
                if (i <= 65535) {
                    return OLrzqt(i);
                }
                if (i <= 1114111) {
                    return AEQbTJ(Type.FAST, i);
                }
            }
            return this.KWHzl - 1;
        }
    }

    public static abstract class PendingIntent extends CodePointTrie {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 char[]), (r2v0 com.ibm.icu.util.CodePointTrie$ActionBar), (r3v0 int), (r4v0 int), (r5v0 int) A[MD:(char[], com.ibm.icu.util.CodePointTrie$ActionBar, int, int, int):void (m)] (LINE:882) call: com.ibm.icu.util.CodePointTrie.PendingIntent.<init>(char[], com.ibm.icu.util.CodePointTrie$ActionBar, int, int, int):void type: THIS */
        public /* synthetic */ PendingIntent(char[] cArr, ActionBar actionBar, int i, int i2, int i3, AnonymousClass4 anonymousClass4) {
            this(cArr, actionBar, i, i2, i3);
        }

        public PendingIntent(char[] cArr, ActionBar actionBar, int i, int i2, int i3) {
            super(cArr, actionBar, i, i2, i3, null);
        }

        @Override // com.ibm.icu.util.CodePointTrie
        public final Type AEQbTJ() {
            return Type.SMALL;
        }

        @Override // com.ibm.icu.util.CodePointTrie
        @Deprecated
        public final int KWHzl(int i) {
            if (i >= 0) {
                if (i <= 4095) {
                    return OLrzqt(i);
                }
                if (i <= 1114111) {
                    return AEQbTJ(Type.SMALL, i);
                }
            }
            return this.KWHzl - 1;
        }
    }

    public static final class FragmentManager extends StateListAnimator {
        public final char[] djBIcL;

        public FragmentManager(char[] cArr, char[] cArr2, int i, int i2, int i3) {
            super(cArr, new Activity(cArr2), i, i2, i3, null);
            this.djBIcL = cArr2;
        }

        public static FragmentManager AEQbTJ(ByteBuffer byteBuffer) {
            return (FragmentManager) CodePointTrie.EZpvd(Type.FAST, ValueWidth.BITS_16, byteBuffer);
        }

        @Override // com.ibm.icu.util.CodePointTrie
        public final int copydefault(int i) {
            return this.djBIcL[KWHzl(i)];
        }

        public final int EZpvd(int i) {
            return this.djBIcL[OLrzqt(i)];
        }

        public final int AEQbTJ(int i) {
            return this.djBIcL[AEQbTJ(Type.FAST, i)];
        }
    }

    public static final class Fragment extends StateListAnimator {
        public final int[] AhwBna;

        public Fragment(char[] cArr, int[] iArr, int i, int i2, int i3) {
            super(cArr, new Application(iArr), i, i2, i3, null);
            this.AhwBna = iArr;
        }

        @Override // com.ibm.icu.util.CodePointTrie
        public final int copydefault(int i) {
            return this.AhwBna[KWHzl(i)];
        }
    }

    public static final class Dialog extends StateListAnimator {
        public final byte[] djBIcL;

        public Dialog(char[] cArr, byte[] bArr, int i, int i2, int i3) {
            super(cArr, new TaskDescription(bArr), i, i2, i3, null);
            this.djBIcL = bArr;
        }

        @Override // com.ibm.icu.util.CodePointTrie
        public final int copydefault(int i) {
            return this.djBIcL[KWHzl(i)] & UnsignedBytes.MAX_VALUE;
        }
    }

    public static final class LoaderManager extends PendingIntent {
        public LoaderManager(char[] cArr, char[] cArr2, int i, int i2, int i3) {
            super(cArr, new Activity(cArr2), i, i2, i3, null);
        }
    }

    public static final class PictureInPictureParams extends PendingIntent {
        public PictureInPictureParams(char[] cArr, int[] iArr, int i, int i2, int i3) {
            super(cArr, new Application(iArr), i, i2, i3, null);
        }
    }

    public static final class TaskStackBuilder extends PendingIntent {
        public TaskStackBuilder(char[] cArr, byte[] bArr, int i, int i2, int i3) {
            super(cArr, new TaskDescription(bArr), i, i2, i3, null);
        }
    }
}

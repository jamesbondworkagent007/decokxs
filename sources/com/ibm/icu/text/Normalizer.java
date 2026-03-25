package com.ibm.icu.text;

import com.ibm.icu.util.ICUCloneNotSupportedException;
import o.AbstractC7239agA;
import o.C7034acH;
import o.C7067aco;
import o.C7069acq;
import o.C7242agD;
import o.C7265aga;

/* JADX INFO: loaded from: classes3.dex */
public final class Normalizer implements Cloneable {

    @Deprecated
    public static final TaskDescription AEQbTJ;

    @Deprecated
    public static final TaskDescription AYXKKw;

    @Deprecated
    public static final TaskDescription AhwBna;

    @Deprecated
    public static final TaskDescription AkhnZx;
    public static final QuickCheckResult DbNXlk;

    @Deprecated
    public static final TaskDescription EZpvd;

    @Deprecated
    public static final TaskDescription KWHzl;

    @Deprecated
    public static final TaskDescription OLrzqt;

    @Deprecated
    public static final TaskDescription copydefault;

    @Deprecated
    public static final TaskDescription djBIcL;
    public static final QuickCheckResult fetchVPNInfo;

    @Deprecated
    public static final TaskDescription gEmmrt;

    @Deprecated
    public static final TaskDescription isConnected;
    public static final QuickCheckResult valueOf;

    @Deprecated
    public static final TaskDescription values;
    public int AuCTel;
    public TaskDescription ejfBZ;
    public int fARcdN;
    public int fIwbmz;
    public StringBuilder fJNWhG = new StringBuilder();
    public AbstractC7239agA getNewProxyInstance;
    public int iwGUEr;
    public Normalizer2 uzCIH;

    public static final class Dialog {
        public final Normalizer2 EZpvd;

        public Dialog(Normalizer2 normalizer2) {
            this.EZpvd = normalizer2;
        }
    }

    public static final class SharedElementCallback {
        public static final Dialog AEQbTJ = new Dialog(Normalizer2.OLrzqt());

        private SharedElementCallback() {
        }
    }

    public static final class ComponentCallbacks {
        public static final Dialog EZpvd = new Dialog(Normalizer2.AEQbTJ());

        private ComponentCallbacks() {
        }
    }

    public static final class Fragment {
        public static final Dialog EZpvd = new Dialog(Normalizer2.copydefault());

        private Fragment() {
        }
    }

    public static final class VoiceInteractor {
        public static final Dialog copydefault = new Dialog(Normalizer2.EZpvd());

        private VoiceInteractor() {
        }
    }

    public static final class Application {
        public static final Dialog copydefault = new Dialog(C7067aco.KWHzl());

        private Application() {
        }
    }

    public static final class ComponentName {
        public static final UnicodeSet KWHzl = new UnicodeSet("[:age=3.2:]").AYXKKw();

        private ComponentName() {
        }
    }

    public static final class FragmentManager {
        public static final Dialog KWHzl = new Dialog(new C7265aga(Normalizer2.OLrzqt(), ComponentName.KWHzl));

        private FragmentManager() {
        }
    }

    public static final class BroadcastReceiver {
        public static final Dialog copydefault = new Dialog(new C7265aga(Normalizer2.AEQbTJ(), ComponentName.KWHzl));

        private BroadcastReceiver() {
        }
    }

    public static final class LoaderManager {
        public static final Dialog OLrzqt = new Dialog(new C7265aga(Normalizer2.copydefault(), ComponentName.KWHzl));

        private LoaderManager() {
        }
    }

    public static final class TaskStackBuilder {
        public static final Dialog OLrzqt = new Dialog(new C7265aga(Normalizer2.EZpvd(), ComponentName.KWHzl));

        private TaskStackBuilder() {
        }
    }

    public static final class ActionBar {
        public static final Dialog copydefault = new Dialog(new C7265aga(C7067aco.KWHzl(), ComponentName.KWHzl));

        private ActionBar() {
        }
    }

    @Deprecated
    public static abstract class TaskDescription {
        @Deprecated
        public abstract Normalizer2 AEQbTJ(int i);

        @Deprecated
        public TaskDescription() {
        }
    }

    public static final class ClipData extends TaskDescription {
        private ClipData() {
        }

        @Override // com.ibm.icu.text.Normalizer.TaskDescription
        public Normalizer2 AEQbTJ(int i) {
            return C7067aco.EZpvd;
        }
    }

    public static final class AssistContent extends TaskDescription {
        private AssistContent() {
        }

        @Override // com.ibm.icu.text.Normalizer.TaskDescription
        public Normalizer2 AEQbTJ(int i) {
            return ((i & 32) != 0 ? FragmentManager.KWHzl : SharedElementCallback.AEQbTJ).EZpvd;
        }
    }

    public static final class ComponentCallbacks2 extends TaskDescription {
        private ComponentCallbacks2() {
        }

        @Override // com.ibm.icu.text.Normalizer.TaskDescription
        public Normalizer2 AEQbTJ(int i) {
            return ((i & 32) != 0 ? BroadcastReceiver.copydefault : ComponentCallbacks.EZpvd).EZpvd;
        }
    }

    public static final class PendingIntent extends TaskDescription {
        private PendingIntent() {
        }

        @Override // com.ibm.icu.text.Normalizer.TaskDescription
        public Normalizer2 AEQbTJ(int i) {
            return ((i & 32) != 0 ? LoaderManager.OLrzqt : Fragment.EZpvd).EZpvd;
        }
    }

    public static final class PictureInPictureParams extends TaskDescription {
        private PictureInPictureParams() {
        }

        @Override // com.ibm.icu.text.Normalizer.TaskDescription
        public Normalizer2 AEQbTJ(int i) {
            return ((i & 32) != 0 ? TaskStackBuilder.OLrzqt : VoiceInteractor.copydefault).EZpvd;
        }
    }

    public static final class Activity extends TaskDescription {
        private Activity() {
        }

        @Override // com.ibm.icu.text.Normalizer.TaskDescription
        public Normalizer2 AEQbTJ(int i) {
            return ((i & 32) != 0 ? ActionBar.copydefault : Application.copydefault).EZpvd;
        }
    }

    static {
        ClipData clipData = new ClipData();
        values = clipData;
        AssistContent assistContent = new AssistContent();
        AYXKKw = assistContent;
        ComponentCallbacks2 componentCallbacks2 = new ComponentCallbacks2();
        AkhnZx = componentCallbacks2;
        PendingIntent pendingIntent = new PendingIntent();
        gEmmrt = pendingIntent;
        copydefault = pendingIntent;
        PictureInPictureParams pictureInPictureParams = new PictureInPictureParams();
        AhwBna = pictureInPictureParams;
        djBIcL = new Activity();
        isConnected = clipData;
        AEQbTJ = pendingIntent;
        KWHzl = pictureInPictureParams;
        EZpvd = assistContent;
        OLrzqt = componentCallbacks2;
        fetchVPNInfo = new QuickCheckResult(0);
        DbNXlk = new QuickCheckResult(1);
        valueOf = new QuickCheckResult(2);
    }

    public static final class QuickCheckResult {
        private QuickCheckResult(int i) {
        }
    }

    @Deprecated
    public Normalizer(String str, TaskDescription taskDescription, int i) {
        this.getNewProxyInstance = AbstractC7239agA.copydefault(str);
        this.ejfBZ = taskDescription;
        this.iwGUEr = i;
        this.uzCIH = taskDescription.AEQbTJ(i);
    }

    @Deprecated
    public Object clone() {
        try {
            Normalizer normalizer = (Normalizer) super.clone();
            normalizer.getNewProxyInstance = (AbstractC7239agA) this.getNewProxyInstance.clone();
            normalizer.ejfBZ = this.ejfBZ;
            normalizer.iwGUEr = this.iwGUEr;
            normalizer.uzCIH = this.uzCIH;
            normalizer.fJNWhG = new StringBuilder(this.fJNWhG);
            normalizer.AuCTel = this.AuCTel;
            normalizer.fIwbmz = this.fIwbmz;
            normalizer.fARcdN = this.fARcdN;
            return normalizer;
        } catch (CloneNotSupportedException e) {
            throw new ICUCloneNotSupportedException(e);
        }
    }

    @Deprecated
    public static String OLrzqt(String str, TaskDescription taskDescription, int i) {
        return taskDescription.AEQbTJ(i).EZpvd(str);
    }

    @Deprecated
    public static String KWHzl(String str, TaskDescription taskDescription) {
        return OLrzqt(str, taskDescription, 0);
    }

    @Deprecated
    public static QuickCheckResult OLrzqt(String str, TaskDescription taskDescription) {
        return copydefault(str, taskDescription, 0);
    }

    @Deprecated
    public static QuickCheckResult copydefault(String str, TaskDescription taskDescription, int i) {
        return taskDescription.AEQbTJ(i).OLrzqt(str);
    }

    @Deprecated
    public static boolean KWHzl(String str, TaskDescription taskDescription, int i) {
        return taskDescription.AEQbTJ(i).KWHzl(str);
    }

    @Deprecated
    public int KWHzl() {
        if (this.AuCTel >= this.fJNWhG.length() && !djBIcL()) {
            return -1;
        }
        int iCodePointAt = this.fJNWhG.codePointAt(this.AuCTel);
        this.AuCTel += Character.charCount(iCodePointAt);
        return iCodePointAt;
    }

    @Deprecated
    public int AEQbTJ() {
        return this.AuCTel < this.fJNWhG.length() ? this.fIwbmz : this.fARcdN;
    }

    @Deprecated
    public int EZpvd() {
        return this.getNewProxyInstance.AEQbTJ();
    }

    public final void OLrzqt() {
        this.fJNWhG.setLength(0);
        this.AuCTel = 0;
    }

    public final boolean djBIcL() {
        OLrzqt();
        int i = this.fARcdN;
        this.fIwbmz = i;
        this.getNewProxyInstance.copydefault(i);
        int iValueOf = this.getNewProxyInstance.valueOf();
        if (iValueOf < 0) {
            return false;
        }
        StringBuilder sbAppendCodePoint = new StringBuilder().appendCodePoint(iValueOf);
        while (true) {
            int iValueOf2 = this.getNewProxyInstance.valueOf();
            if (iValueOf2 < 0) {
                break;
            }
            if (this.uzCIH.copydefault(iValueOf2)) {
                this.getNewProxyInstance.EZpvd(-1);
                break;
            }
            sbAppendCodePoint.appendCodePoint(iValueOf2);
        }
        this.fARcdN = this.getNewProxyInstance.EZpvd();
        this.uzCIH.copydefault(sbAppendCodePoint, this.fJNWhG);
        return this.fJNWhG.length() != 0;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator {
        public CharSequence OLrzqt;
        public int copydefault;

        private StateListAnimator() {
        }
    }

    public static final StateListAnimator[] copydefault() {
        return new StateListAnimator[]{new StateListAnimator(), new StateListAnimator()};
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0248 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0300 A[PHI: r14
  0x0300: PHI (r14v6 int) = (r14v3 int), (r14v3 int), (r14v3 int), (r14v10 int), (r14v10 int) binds: [B:149:0x029f, B:150:0x02a1, B:152:0x02a7, B:177:0x02fa, B:171:0x02e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x029a A[ADDED_TO_REGION, EDGE_INSN: B:197:0x029a->B:148:0x029a BREAK  A[LOOP:0: B:11:0x0040->B:200:0x0040], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0138 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int AEQbTJ(CharSequence charSequence, CharSequence charSequence2, int i) {
        C7034acH c7034acH;
        StringBuilder sb;
        StringBuilder sb2;
        int i2;
        int i3;
        int i4;
        int i5;
        char c;
        int i6;
        int i7;
        int codePoint;
        char c2;
        int i8;
        int i9;
        int i10;
        char c3;
        int codePoint2;
        C7069acq c7069acq;
        int i11;
        String strFetchVPNInfo;
        int i12;
        int iCopydefault;
        int iCopydefault2;
        StateListAnimator stateListAnimator;
        CharSequence charSequence3;
        StateListAnimator stateListAnimator2;
        CharSequence charSequence4;
        int i13 = 524288 & i;
        C7069acq c7069acq2 = i13 != 0 ? C7067aco.AEQbTJ().AhwBna : null;
        int i14 = 65536 & i;
        if (i14 != 0) {
            c7034acH = C7034acH.OLrzqt;
            sb = new StringBuilder();
            sb2 = new StringBuilder();
        } else {
            c7034acH = null;
            sb = null;
            sb2 = null;
        }
        int iCharAt = -1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int iCharAt2 = -1;
        StateListAnimator[] stateListAnimatorArrCopydefault = null;
        StateListAnimator[] stateListAnimatorArrCopydefault2 = null;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        CharSequence charSequence5 = charSequence;
        CharSequence charSequence6 = charSequence2;
        while (true) {
            if (iCharAt < 0) {
                int i19 = i16;
                while (i19 == length) {
                    if (i15 == 0) {
                        i2 = i19;
                        iCharAt = -1;
                        break;
                    }
                    do {
                        i15--;
                        stateListAnimator2 = stateListAnimatorArrCopydefault[i15];
                        charSequence4 = stateListAnimator2.OLrzqt;
                    } while (charSequence4 == null);
                    i19 = stateListAnimator2.copydefault;
                    length = charSequence4.length();
                    charSequence5 = charSequence4;
                }
                i16 = i19 + 1;
                iCharAt = charSequence5.charAt(i19);
                i2 = i16;
            } else {
                i2 = i16;
            }
            if (iCharAt2 < 0) {
                int i20 = i18;
                while (i20 == length2) {
                    if (i17 == 0) {
                        i4 = i20;
                        i3 = i17;
                        i5 = -1;
                        break;
                    }
                    do {
                        i17--;
                        stateListAnimator = stateListAnimatorArrCopydefault2[i17];
                        charSequence3 = stateListAnimator.OLrzqt;
                    } while (charSequence3 == null);
                    int i21 = stateListAnimator.copydefault;
                    length2 = charSequence3.length();
                    i20 = i21;
                    charSequence6 = charSequence3;
                }
                i18 = i20 + 1;
                iCharAt2 = charSequence6.charAt(i20);
                i3 = i17;
                i4 = i18;
                i5 = iCharAt2;
            } else {
                i3 = i17;
                i4 = i18;
                i5 = iCharAt2;
            }
            if (iCharAt == i5) {
                if (iCharAt < 0) {
                    return 0;
                }
                i16 = i2;
                i17 = i3;
                i18 = i4;
                iCharAt = -1;
                iCharAt2 = -1;
            } else {
                if (iCharAt < 0) {
                    return -1;
                }
                if (i5 < 0) {
                    return 1;
                }
                C7069acq c7069acq3 = c7069acq2;
                c = (char) iCharAt;
                if (C7242agD.EZpvd(c)) {
                    if (C7069acq.ActionBar.EZpvd(iCharAt)) {
                        if (i2 != length) {
                            i6 = length;
                            char cCharAt = charSequence5.charAt(i2);
                            if (Character.isLowSurrogate(cCharAt)) {
                                codePoint = Character.toCodePoint(c, cCharAt);
                                i7 = i13;
                            }
                        }
                        i7 = i13;
                        codePoint = iCharAt;
                    } else {
                        i6 = length;
                        int i22 = i2 - 2;
                        if (i22 >= 0) {
                            char cCharAt2 = charSequence5.charAt(i22);
                            if (Character.isHighSurrogate(cCharAt2)) {
                                codePoint = Character.toCodePoint(cCharAt2, c);
                                i7 = i13;
                            }
                        }
                        i7 = i13;
                        codePoint = iCharAt;
                    }
                    c2 = (char) i5;
                    if (C7242agD.EZpvd(c2)) {
                    }
                    c3 = c2;
                    codePoint2 = i8;
                    if (i15 == 0) {
                    }
                } else {
                    i6 = length;
                    i7 = i13;
                    codePoint = iCharAt;
                    c2 = (char) i5;
                    if (C7242agD.EZpvd(c2)) {
                        i8 = i5;
                        i9 = i4;
                        i10 = length2;
                    } else {
                        if (C7069acq.ActionBar.EZpvd(i5)) {
                            i8 = i5;
                            i9 = i4;
                            i10 = length2;
                            if (i9 != length2) {
                                char cCharAt3 = charSequence6.charAt(i9);
                                if (Character.isLowSurrogate(cCharAt3)) {
                                    codePoint2 = Character.toCodePoint(c2, cCharAt3);
                                    c3 = c2;
                                }
                            }
                        } else {
                            i8 = i5;
                            i9 = i4;
                            i10 = length2;
                            int i23 = i9 - 2;
                            if (i23 >= 0) {
                                char cCharAt4 = charSequence6.charAt(i23);
                                if (Character.isHighSurrogate(cCharAt4)) {
                                    codePoint2 = Character.toCodePoint(cCharAt4, c2);
                                    c3 = c2;
                                }
                            }
                        }
                        if (i15 == 0 && i14 != 0 && (iCopydefault2 = c7034acH.copydefault(codePoint, sb, i)) >= 0) {
                            if (C7242agD.EZpvd(c)) {
                                if (C7069acq.ActionBar.EZpvd(iCharAt)) {
                                    i2++;
                                } else {
                                    char cCharAt5 = charSequence6.charAt(i9 - 2);
                                    i9--;
                                    i8 = cCharAt5;
                                }
                            }
                            if (stateListAnimatorArrCopydefault == null) {
                                stateListAnimatorArrCopydefault = copydefault();
                            }
                            StateListAnimator stateListAnimator3 = stateListAnimatorArrCopydefault[0];
                            stateListAnimator3.OLrzqt = charSequence5;
                            stateListAnimator3.copydefault = i2;
                            if (iCopydefault2 <= 31) {
                                sb.delete(0, sb.length() - iCopydefault2);
                            } else {
                                sb.setLength(0);
                                sb.appendCodePoint(iCopydefault2);
                            }
                            length = sb.length();
                            i15++;
                            charSequence5 = sb;
                            i17 = i3;
                            iCharAt = -1;
                            c7069acq2 = c7069acq3;
                            i13 = i7;
                            length2 = i10;
                            iCharAt2 = i8;
                            i16 = 0;
                        } else if (i3 != 0 && i14 != 0 && (iCopydefault = c7034acH.copydefault(codePoint2, sb2, i)) >= 0) {
                            if (C7242agD.EZpvd(c3)) {
                                if (C7069acq.ActionBar.EZpvd(i8)) {
                                    i9++;
                                } else {
                                    char cCharAt6 = charSequence5.charAt(i2 - 2);
                                    i2--;
                                    iCharAt = cCharAt6;
                                }
                            }
                            if (stateListAnimatorArrCopydefault2 == null) {
                                stateListAnimatorArrCopydefault2 = copydefault();
                            }
                            StateListAnimator stateListAnimator4 = stateListAnimatorArrCopydefault2[0];
                            stateListAnimator4.OLrzqt = charSequence6;
                            stateListAnimator4.copydefault = i9;
                            i17 = i3 + 1;
                            if (iCopydefault <= 31) {
                                sb2.delete(0, sb2.length() - iCopydefault);
                            } else {
                                sb2.setLength(0);
                                sb2.appendCodePoint(iCopydefault);
                            }
                            length2 = sb2.length();
                            i16 = i2;
                            charSequence6 = sb2;
                            length = i6;
                            i13 = i7;
                            i18 = 0;
                            c7069acq2 = c7069acq3;
                            iCharAt2 = -1;
                        } else if (i15 >= 2 && i7 != 0) {
                            c7069acq = c7069acq3;
                            String strFetchVPNInfo2 = c7069acq.fetchVPNInfo(codePoint);
                            if (strFetchVPNInfo2 == null) {
                                if (i3 < 2) {
                                    break;
                                }
                                break;
                            }
                            if (C7242agD.EZpvd(c)) {
                                if (!C7069acq.ActionBar.EZpvd(iCharAt)) {
                                    char cCharAt7 = charSequence6.charAt(i9 - 2);
                                    i9--;
                                    iCharAt2 = cCharAt7;
                                    if (stateListAnimatorArrCopydefault == null) {
                                    }
                                    StateListAnimator stateListAnimator5 = stateListAnimatorArrCopydefault[i15];
                                    stateListAnimator5.OLrzqt = charSequence5;
                                    stateListAnimator5.copydefault = i2;
                                    i12 = i15 + 1;
                                    if (i12 < 2) {
                                    }
                                    c7069acq2 = c7069acq;
                                    i17 = i3;
                                    charSequence5 = strFetchVPNInfo2;
                                    iCharAt = -1;
                                    i13 = i7;
                                    length2 = i10;
                                    i16 = 0;
                                    length = strFetchVPNInfo2.length();
                                } else {
                                    i2++;
                                    iCharAt2 = i8;
                                    if (stateListAnimatorArrCopydefault == null) {
                                    }
                                    StateListAnimator stateListAnimator52 = stateListAnimatorArrCopydefault[i15];
                                    stateListAnimator52.OLrzqt = charSequence5;
                                    stateListAnimator52.copydefault = i2;
                                    i12 = i15 + 1;
                                    if (i12 < 2) {
                                    }
                                    c7069acq2 = c7069acq;
                                    i17 = i3;
                                    charSequence5 = strFetchVPNInfo2;
                                    iCharAt = -1;
                                    i13 = i7;
                                    length2 = i10;
                                    i16 = 0;
                                    length = strFetchVPNInfo2.length();
                                }
                            } else {
                                iCharAt2 = i8;
                                if (stateListAnimatorArrCopydefault == null) {
                                    stateListAnimatorArrCopydefault = copydefault();
                                }
                                StateListAnimator stateListAnimator522 = stateListAnimatorArrCopydefault[i15];
                                stateListAnimator522.OLrzqt = charSequence5;
                                stateListAnimator522.copydefault = i2;
                                i12 = i15 + 1;
                                if (i12 < 2) {
                                    stateListAnimatorArrCopydefault[i12].OLrzqt = null;
                                    i15 += 2;
                                } else {
                                    i15 = i12;
                                }
                                c7069acq2 = c7069acq;
                                i17 = i3;
                                charSequence5 = strFetchVPNInfo2;
                                iCharAt = -1;
                                i13 = i7;
                                length2 = i10;
                                i16 = 0;
                                length = strFetchVPNInfo2.length();
                            }
                        } else {
                            c7069acq = c7069acq3;
                            if (i3 < 2 || i7 == 0 || (strFetchVPNInfo = c7069acq.fetchVPNInfo(codePoint2)) == null) {
                                break;
                            }
                            if (C7242agD.EZpvd(c3)) {
                                if (C7069acq.ActionBar.EZpvd(i8)) {
                                    i9++;
                                } else {
                                    char cCharAt8 = charSequence5.charAt(i2 - 2);
                                    i2--;
                                    iCharAt = cCharAt8;
                                }
                            }
                            if (stateListAnimatorArrCopydefault2 == null) {
                                stateListAnimatorArrCopydefault2 = copydefault();
                            }
                            StateListAnimator stateListAnimator6 = stateListAnimatorArrCopydefault2[i3];
                            stateListAnimator6.OLrzqt = charSequence6;
                            stateListAnimator6.copydefault = i9;
                            int i24 = i3 + 1;
                            if (i24 < 2) {
                                stateListAnimatorArrCopydefault2[i24].OLrzqt = null;
                                i24 = i3 + 2;
                            }
                            i16 = i2;
                            i17 = i24;
                            length2 = strFetchVPNInfo.length();
                            charSequence6 = strFetchVPNInfo;
                            iCharAt2 = -1;
                            length = i6;
                            i18 = 0;
                            c7069acq2 = c7069acq;
                            i13 = i7;
                        }
                        i18 = i9;
                    }
                    c3 = c2;
                    codePoint2 = i8;
                    if (i15 == 0) {
                        if (i3 != 0) {
                        }
                        if (i15 >= 2) {
                        }
                        c7069acq = c7069acq3;
                        if (i3 < 2) {
                        }
                    }
                }
            }
        }
        int i25 = i8;
        if (iCharAt < 55296 || i25 < 55296 || (i & 32768) == 0) {
            i11 = i25;
        } else {
            if ((iCharAt > 56319 || i2 == i6 || !Character.isLowSurrogate(charSequence5.charAt(i2))) && (!Character.isLowSurrogate(c) || i2 - 1 == 0 || !Character.isHighSurrogate(charSequence5.charAt(i2 - 2)))) {
                iCharAt -= 10240;
            }
            if ((i25 > 56319 || i9 == i10 || !Character.isLowSurrogate(charSequence6.charAt(i9))) && (!Character.isLowSurrogate(c3) || i9 - 1 == 0 || !Character.isHighSurrogate(charSequence6.charAt(i9 - 2)))) {
                i11 = i25 - 10240;
            }
        }
        return iCharAt - i11;
    }
}

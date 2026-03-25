package com.ibm.icu.util;

import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C7093adN;
import o.C7095adP;
import o.C7101adV;

/* JADX INFO: loaded from: classes14.dex */
public final class LocaleMatcher {
    public final FavorSubtag AYXKKw;
    public final Direction AhwBna;
    public final C7093adN[] AkhnZx;
    public final int AuCTel;
    public final Map<C7093adN, Integer> DbNXlk;
    public final Locale copydefault;
    public final ULocale djBIcL;
    public final ULocale[] fetchVPNInfo;
    public final int gEmmrt;
    public final int isConnected;
    public final int[] valueOf;
    public final Locale[] values;
    public static final C7093adN OLrzqt = new C7093adN(C.LANGUAGE_UNDETERMINED, "", "", 7);
    public static final ULocale KWHzl = new ULocale(C.LANGUAGE_UNDETERMINED);
    public static final Locale AEQbTJ = new Locale(C.LANGUAGE_UNDETERMINED);
    public static final Locale EZpvd = new Locale("");

    /* JADX INFO: loaded from: classes22.dex */
    public enum Demotion {
        NONE,
        REGION
    }

    /* JADX INFO: loaded from: classes22.dex */
    public enum Direction {
        WITH_ONE_WAY,
        ONLY_TWO_WAY
    }

    /* JADX INFO: loaded from: classes22.dex */
    public enum FavorSubtag {
        LANGUAGE,
        SCRIPT
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static abstract class TaskDescription implements Iterator<C7093adN> {
        public int OLrzqt;

        public abstract void OLrzqt(int i);

        private TaskDescription() {
            this.OLrzqt = -1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class Activity {
        public final int AEQbTJ;
        public final Locale EZpvd;
        public final int KWHzl;
        public final Locale OLrzqt;
        public final ULocale copydefault;
        public final ULocale djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ULocale copydefault() {
            return this.djBIcL;
        }

        public Activity(ULocale uLocale, ULocale uLocale2, Locale locale, Locale locale2, int i, int i2) {
            this.copydefault = uLocale;
            this.djBIcL = uLocale2;
            this.OLrzqt = locale;
            this.EZpvd = locale2;
            this.KWHzl = i;
            this.AEQbTJ = i2;
        }

        public ULocale EZpvd() {
            Locale locale;
            ULocale uLocale = this.copydefault;
            return (uLocale != null || (locale = this.OLrzqt) == null) ? uLocale : ULocale.forLocale(locale);
        }
    }

    public static final class StateListAnimator {
        public Demotion AEQbTJ;
        public boolean AhwBna;
        public FavorSubtag EZpvd;
        public ULocale KWHzl;
        public ULocale OLrzqt;
        public Direction copydefault;
        public ULocale djBIcL;
        public int gEmmrt;
        public List<ULocale> valueOf;

        private StateListAnimator() {
            this.gEmmrt = -1;
            this.AhwBna = true;
        }

        public StateListAnimator OLrzqt(ULocale uLocale) {
            if (this.valueOf == null) {
                this.valueOf = new ArrayList();
            }
            this.valueOf.add(uLocale);
            return this;
        }

        public LocaleMatcher AEQbTJ() {
            return new LocaleMatcher(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("{LocaleMatcher.Builder");
            List<ULocale> list = this.valueOf;
            if (list != null && !list.isEmpty()) {
                sb.append(" supported={");
                sb.append(this.valueOf);
                sb.append(AbstractJsonLexerKt.END_OBJ);
            }
            if (this.KWHzl != null) {
                sb.append(" default=");
                sb.append(this.KWHzl);
            }
            if (this.EZpvd != null) {
                sb.append(" distance=");
                sb.append(this.EZpvd);
            }
            int i = this.gEmmrt;
            if (i >= 0) {
                sb.append(String.format(" threshold=%d", Integer.valueOf(i)));
            }
            if (this.AEQbTJ != null) {
                sb.append(" demotion=");
                sb.append(this.AEQbTJ);
            }
            sb.append(AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }
    }

    public static StateListAnimator EZpvd() {
        return new StateListAnimator();
    }

    public LocaleMatcher(StateListAnimator stateListAnimator) {
        Locale locale;
        C7093adN c7093adNKWHzl;
        int iKWHzl;
        ULocale uLocale = stateListAnimator.KWHzl;
        if (uLocale != null) {
            locale = uLocale.toLocale();
            c7093adNKWHzl = KWHzl(uLocale);
        } else {
            locale = null;
            c7093adNKWHzl = null;
        }
        int i = 0;
        int size = stateListAnimator.valueOf != null ? stateListAnimator.valueOf.size() : 0;
        this.fetchVPNInfo = new ULocale[size];
        this.values = new Locale[size];
        C7093adN[] c7093adNArr = new C7093adN[size];
        if (size > 0) {
            int i2 = 0;
            for (ULocale uLocale2 : stateListAnimator.valueOf) {
                this.fetchVPNInfo[i2] = uLocale2;
                this.values[i2] = uLocale2.toLocale();
                c7093adNArr[i2] = KWHzl(uLocale2);
                i2++;
            }
        }
        this.DbNXlk = new HashMap(size);
        this.AkhnZx = new C7093adN[size];
        this.valueOf = new int[size];
        byte[] bArr = new byte[size];
        ULocale[] uLocaleArr = this.fetchVPNInfo;
        int length = uLocaleArr.length;
        int i3 = 0;
        int iOLrzqt = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            ULocale uLocale3 = uLocaleArr[i3];
            C7093adN c7093adN = c7093adNArr[i4];
            if (c7093adNKWHzl == null && stateListAnimator.AhwBna) {
                Locale locale2 = this.values[i];
                iOLrzqt = OLrzqt(c7093adN, i, iOLrzqt);
                locale = locale2;
                c7093adNKWHzl = c7093adN;
                uLocale = uLocale3;
            } else if (c7093adNKWHzl != null && c7093adN.KWHzl(c7093adNKWHzl)) {
                iOLrzqt = OLrzqt(c7093adN, i4, iOLrzqt);
            } else if (C7095adP.EZpvd.KWHzl(c7093adN)) {
                bArr[i4] = 2;
                i5++;
            } else {
                bArr[i4] = 3;
            }
            i4++;
            i3++;
            i = 0;
        }
        int iOLrzqt2 = iOLrzqt;
        for (int i6 = 0; i6 < size && iOLrzqt2 < i5 + iOLrzqt; i6++) {
            if (bArr[i6] == 2) {
                iOLrzqt2 = OLrzqt(c7093adNArr[i6], i6, iOLrzqt2);
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (bArr[i7] == 3) {
                iOLrzqt2 = OLrzqt(c7093adNArr[i7], i7, iOLrzqt2);
            }
        }
        this.isConnected = iOLrzqt2;
        this.djBIcL = uLocale;
        this.copydefault = locale;
        this.gEmmrt = stateListAnimator.AEQbTJ == Demotion.NONE ? 0 : C7095adP.EZpvd.copydefault();
        FavorSubtag favorSubtag = stateListAnimator.EZpvd;
        this.AYXKKw = favorSubtag;
        Direction direction = stateListAnimator.copydefault;
        this.AhwBna = direction;
        if (stateListAnimator.gEmmrt >= 0) {
            iKWHzl = stateListAnimator.gEmmrt;
        } else if (stateListAnimator.OLrzqt != null) {
            iKWHzl = C7095adP.copydefault(C7095adP.EZpvd.AEQbTJ(KWHzl(stateListAnimator.OLrzqt), new C7093adN[]{KWHzl(stateListAnimator.djBIcL)}, 1, C7095adP.EZpvd(100), favorSubtag, direction)) + 1;
        } else {
            iKWHzl = C7095adP.EZpvd.KWHzl();
        }
        this.AuCTel = iKWHzl;
    }

    public final int OLrzqt(C7093adN c7093adN, int i, int i2) {
        if (this.DbNXlk.containsKey(c7093adN)) {
            return i2;
        }
        this.DbNXlk.put(c7093adN, Integer.valueOf(i));
        this.AkhnZx[i2] = c7093adN;
        this.valueOf[i2] = i;
        return i2 + 1;
    }

    public static final C7093adN KWHzl(ULocale uLocale) {
        return uLocale.equals(KWHzl) ? OLrzqt : C7101adV.AEQbTJ.OLrzqt(uLocale);
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class ActionBar extends TaskDescription {
        public Iterator<ULocale> AEQbTJ;
        public ULocale EZpvd;
        public ULocale copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.ibm.icu.util.LocaleMatcher.TaskDescription
        public void OLrzqt(int i) {
            this.OLrzqt = i;
            this.EZpvd = this.copydefault;
        }

        public ActionBar(Iterator<ULocale> it) {
            super();
            this.AEQbTJ = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.AEQbTJ.hasNext();
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public C7093adN next() {
            ULocale next = this.AEQbTJ.next();
            this.copydefault = next;
            return LocaleMatcher.KWHzl(next);
        }
    }

    public final Activity KWHzl() {
        return new Activity(null, this.djBIcL, null, this.copydefault, -1, -1);
    }

    public final Activity EZpvd(ULocale uLocale, ActionBar actionBar, int i) {
        if (i < 0) {
            return KWHzl();
        }
        if (uLocale != null) {
            return new Activity(uLocale, this.fetchVPNInfo[i], null, this.values[i], 0, i);
        }
        return new Activity(actionBar.EZpvd, this.fetchVPNInfo[i], null, this.values[i], actionBar.OLrzqt, i);
    }

    public Activity AEQbTJ(ULocale uLocale) {
        return EZpvd(uLocale, null, KWHzl(KWHzl(uLocale), null));
    }

    public Activity copydefault(Iterable<ULocale> iterable) {
        Iterator<ULocale> it = iterable.iterator();
        if (!it.hasNext()) {
            return KWHzl();
        }
        ActionBar actionBar = new ActionBar(it);
        return EZpvd(null, actionBar, KWHzl(actionBar.next(), actionBar));
    }

    public final int KWHzl(C7093adN c7093adN, TaskDescription taskDescription) {
        int iEZpvd = C7095adP.EZpvd(this.AuCTel);
        int i = 0;
        C7093adN next = c7093adN;
        int iAEQbTJ = -1;
        while (true) {
            Integer num = this.DbNXlk.get(next);
            if (num != null) {
                int iIntValue = num.intValue();
                if (taskDescription != null) {
                    taskDescription.OLrzqt(i);
                }
                return iIntValue;
            }
            int iAEQbTJ2 = C7095adP.EZpvd.AEQbTJ(next, this.AkhnZx, this.isConnected, iEZpvd, this.AYXKKw, this.AhwBna);
            if (iAEQbTJ2 >= 0) {
                iEZpvd = C7095adP.KWHzl(iAEQbTJ2);
                if (taskDescription != null) {
                    taskDescription.OLrzqt(i);
                }
                iAEQbTJ = C7095adP.AEQbTJ(iAEQbTJ2);
            }
            iEZpvd -= C7095adP.EZpvd(this.gEmmrt);
            if (iEZpvd <= 0 || taskDescription == null || !taskDescription.hasNext()) {
                break;
            }
            next = taskDescription.next();
            i++;
        }
        if (iAEQbTJ < 0) {
            return -1;
        }
        return this.valueOf[iAEQbTJ];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{LocaleMatcher");
        if (this.isConnected > 0) {
            sb.append(" supportedLSRs={");
            sb.append(this.AkhnZx[0]);
            for (int i = 1; i < this.isConnected; i++) {
                sb.append(", ");
                sb.append(this.AkhnZx[i]);
            }
            sb.append(AbstractJsonLexerKt.END_OBJ);
        }
        sb.append(" default=");
        sb.append(this.djBIcL);
        if (this.AYXKKw != null) {
            sb.append(" favor=");
            sb.append(this.AYXKKw);
        }
        if (this.AhwBna != null) {
            sb.append(" direction=");
            sb.append(this.AhwBna);
        }
        int i2 = this.AuCTel;
        if (i2 >= 0) {
            sb.append(String.format(" threshold=%d", Integer.valueOf(i2)));
        }
        sb.append(String.format(" demotion=%d", Integer.valueOf(this.gEmmrt)));
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}

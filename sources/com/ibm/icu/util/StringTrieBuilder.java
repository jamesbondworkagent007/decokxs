package com.ibm.icu.util;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StringTrieBuilder {
    public PendingIntent AYXKKw;
    public State gEmmrt = State.ADDING;

    @Deprecated
    public StringBuilder djBIcL = new StringBuilder();
    public HashMap<PendingIntent, PendingIntent> EZpvd = new HashMap<>();
    public LoaderManager AEQbTJ = new LoaderManager();

    public static abstract class ActionBar extends PendingIntent {
        public int AEQbTJ;
        public int KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public int hashCode() {
            return this.AEQbTJ;
        }
    }

    public enum Option {
        FAST,
        SMALL
    }

    public enum State {
        ADDING,
        BUILDING_FAST,
        BUILDING_SMALL,
        BUILT
    }

    @Deprecated
    public abstract int EZpvd();

    @Deprecated
    public abstract int EZpvd(int i, int i2);

    @Deprecated
    public abstract int EZpvd(boolean z, int i, int i2);

    @Deprecated
    public abstract int KWHzl();

    @Deprecated
    public abstract int KWHzl(int i);

    @Deprecated
    public abstract boolean OLrzqt();

    @Deprecated
    public abstract int copydefault();

    @Deprecated
    public abstract int copydefault(int i);

    @Deprecated
    public abstract int copydefault(int i, boolean z);

    @Deprecated
    public StringTrieBuilder() {
    }

    @Deprecated
    public void OLrzqt(CharSequence charSequence, int i) {
        if (this.gEmmrt != State.ADDING) {
            throw new IllegalStateException("Cannot add (string, value) pairs after build().");
        }
        if (charSequence.length() > 65535) {
            throw new IndexOutOfBoundsException("The maximum string length is 0xffff.");
        }
        PendingIntent pendingIntent = this.AYXKKw;
        if (pendingIntent == null) {
            this.AYXKKw = copydefault(charSequence, 0, i);
        } else {
            this.AYXKKw = pendingIntent.KWHzl(this, charSequence, 0, i);
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.util.StringTrieBuilder$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[State.values().length];
            OLrzqt = iArr;
            try {
                iArr[State.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OLrzqt[State.BUILDING_FAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[State.BUILDING_SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OLrzqt[State.BUILT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Deprecated
    public final void OLrzqt(Option option) {
        int i = AnonymousClass4.OLrzqt[this.gEmmrt.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                throw new IllegalStateException("Builder failed and must be clear()ed.");
            }
            if (i == 4) {
                return;
            }
        } else {
            if (this.AYXKKw == null) {
                throw new IndexOutOfBoundsException("No (string, value) pairs were added.");
            }
            if (option == Option.FAST) {
                this.gEmmrt = State.BUILDING_FAST;
            } else {
                this.gEmmrt = State.BUILDING_SMALL;
            }
        }
        PendingIntent pendingIntentKWHzl = this.AYXKKw.KWHzl(this);
        this.AYXKKw = pendingIntentKWHzl;
        pendingIntentKWHzl.KWHzl(-1);
        this.AYXKKw.EZpvd(this);
        this.gEmmrt = State.BUILT;
    }

    public final PendingIntent EZpvd(PendingIntent pendingIntent) {
        if (this.gEmmrt == State.BUILDING_FAST) {
            return pendingIntent;
        }
        PendingIntent pendingIntent2 = this.EZpvd.get(pendingIntent);
        if (pendingIntent2 != null) {
            return pendingIntent2;
        }
        this.EZpvd.put(pendingIntent, pendingIntent);
        return pendingIntent;
    }

    public final LoaderManager OLrzqt(int i) {
        this.AEQbTJ.OLrzqt(i);
        PendingIntent pendingIntent = this.EZpvd.get(this.AEQbTJ);
        if (pendingIntent != null) {
            return (LoaderManager) pendingIntent;
        }
        LoaderManager loaderManager = new LoaderManager(i);
        this.EZpvd.put(loaderManager, loaderManager);
        return loaderManager;
    }

    public static abstract class PendingIntent {
        public int djBIcL = 0;

        public abstract void EZpvd(StringTrieBuilder stringTrieBuilder);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int KWHzl(int i) {
            if (this.djBIcL == 0) {
                this.djBIcL = i;
            }
            return i;
        }

        public PendingIntent KWHzl(StringTrieBuilder stringTrieBuilder) {
            return this;
        }

        public PendingIntent KWHzl(StringTrieBuilder stringTrieBuilder, CharSequence charSequence, int i, int i2) {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.djBIcL;
        }

        public abstract int hashCode();

        public boolean equals(Object obj) {
            return this == obj || getClass() == obj.getClass();
        }

        public final void copydefault(int i, int i2, StringTrieBuilder stringTrieBuilder) {
            int i3 = this.djBIcL;
            if (i3 < 0) {
                if (i3 < i2 || i < i3) {
                    EZpvd(stringTrieBuilder);
                }
            }
        }
    }

    public static class LoaderManager extends PendingIntent {
        public boolean AYXKKw;
        public int AhwBna;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(int i) {
            this.AYXKKw = true;
            this.AhwBna = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(int i) {
            this.AYXKKw = true;
            this.AhwBna = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public int hashCode() {
            if (this.AYXKKw) {
                return this.AhwBna + 41383797;
            }
            return 1118481;
        }

        public LoaderManager() {
        }

        public LoaderManager(int i) {
            this.AYXKKw = true;
            this.AhwBna = i;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!super.equals(obj)) {
                return false;
            }
            LoaderManager loaderManager = (LoaderManager) obj;
            boolean z = this.AYXKKw;
            return z == loaderManager.AYXKKw && (!z || this.AhwBna == loaderManager.AhwBna);
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public PendingIntent KWHzl(StringTrieBuilder stringTrieBuilder, CharSequence charSequence, int i, int i2) {
            if (i != charSequence.length()) {
                LoaderManager loaderManagerCopydefault = stringTrieBuilder.copydefault(charSequence, i, i2);
                loaderManagerCopydefault.EZpvd(this.AhwBna);
                return loaderManagerCopydefault;
            }
            throw new IllegalArgumentException("Duplicate string.");
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public void EZpvd(StringTrieBuilder stringTrieBuilder) {
            this.djBIcL = stringTrieBuilder.copydefault(this.AhwBna, true);
        }
    }

    public static final class StateListAnimator extends LoaderManager {
        public PendingIntent KWHzl;

        public StateListAnimator(int i, PendingIntent pendingIntent) {
            this.KWHzl = pendingIntent;
            EZpvd(i);
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.LoaderManager, com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public int hashCode() {
            return ((this.AhwBna + 82767594) * 37) + this.KWHzl.hashCode();
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.LoaderManager, com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return super.equals(obj) && this.KWHzl == ((StateListAnimator) obj).KWHzl;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public int KWHzl(int i) {
            if (this.djBIcL != 0) {
                return i;
            }
            int iKWHzl = this.KWHzl.KWHzl(i);
            this.djBIcL = iKWHzl;
            return iKWHzl;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.LoaderManager, com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public void EZpvd(StringTrieBuilder stringTrieBuilder) {
            this.KWHzl.EZpvd(stringTrieBuilder);
            this.djBIcL = stringTrieBuilder.copydefault(this.AhwBna, false);
        }
    }

    public static final class TaskDescription extends LoaderManager {
        public int AEQbTJ;
        public int EZpvd;
        public PendingIntent KWHzl;
        public int OLrzqt;
        public CharSequence copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.ibm.icu.util.StringTrieBuilder.LoaderManager, com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public int hashCode() {
            return this.EZpvd;
        }

        public TaskDescription(CharSequence charSequence, int i, int i2, PendingIntent pendingIntent) {
            this.copydefault = charSequence;
            this.AEQbTJ = i;
            this.OLrzqt = i2;
            this.KWHzl = pendingIntent;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.LoaderManager, com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!super.equals(obj)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            int i = this.OLrzqt;
            if (i != taskDescription.OLrzqt || this.KWHzl != taskDescription.KWHzl) {
                return false;
            }
            int i2 = this.AEQbTJ;
            int i3 = taskDescription.AEQbTJ;
            int i4 = i2;
            while (i4 < i + i2) {
                if (this.copydefault.charAt(i4) != this.copydefault.charAt(i3)) {
                    return false;
                }
                i4++;
                i3++;
            }
            return true;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.LoaderManager, com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public PendingIntent KWHzl(StringTrieBuilder stringTrieBuilder, CharSequence charSequence, int i, int i2) {
            PendingIntent pendingIntent;
            PendingIntent pendingIntent2;
            if (i == charSequence.length()) {
                if (this.AYXKKw) {
                    throw new IllegalArgumentException("Duplicate string.");
                }
                EZpvd(i2);
                return this;
            }
            int i3 = this.AEQbTJ;
            int i4 = this.OLrzqt + i3;
            while (i3 < i4) {
                if (i == charSequence.length()) {
                    int i5 = i3 - this.AEQbTJ;
                    TaskDescription taskDescription = new TaskDescription(this.copydefault, i3, this.OLrzqt - i5, this.KWHzl);
                    taskDescription.EZpvd(i2);
                    this.OLrzqt = i5;
                    this.KWHzl = taskDescription;
                    return this;
                }
                char cCharAt = this.copydefault.charAt(i3);
                char cCharAt2 = charSequence.charAt(i);
                if (cCharAt != cCharAt2) {
                    Application application = new Application();
                    int i6 = this.AEQbTJ;
                    if (i3 == i6) {
                        if (this.AYXKKw) {
                            application.EZpvd(this.AhwBna);
                            this.AhwBna = 0;
                            this.AYXKKw = false;
                        }
                        this.AEQbTJ++;
                        int i7 = this.OLrzqt - 1;
                        this.OLrzqt = i7;
                        pendingIntent2 = i7 > 0 ? this : this.KWHzl;
                        pendingIntent = application;
                    } else if (i3 == i4 - 1) {
                        this.OLrzqt--;
                        pendingIntent2 = this.KWHzl;
                        this.KWHzl = application;
                        pendingIntent = this;
                    } else {
                        int i8 = i3 - i6;
                        TaskDescription taskDescription2 = new TaskDescription(this.copydefault, i3 + 1, this.OLrzqt - (i8 + 1), this.KWHzl);
                        this.OLrzqt = i8;
                        this.KWHzl = application;
                        pendingIntent = this;
                        pendingIntent2 = taskDescription2;
                    }
                    LoaderManager loaderManagerCopydefault = stringTrieBuilder.copydefault(charSequence, i + 1, i2);
                    application.AEQbTJ(cCharAt, pendingIntent2);
                    application.AEQbTJ(cCharAt2, loaderManagerCopydefault);
                    return pendingIntent;
                }
                i3++;
                i++;
            }
            this.KWHzl = this.KWHzl.KWHzl(stringTrieBuilder, charSequence, i, i2);
            return this;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public PendingIntent KWHzl(StringTrieBuilder stringTrieBuilder) {
            PendingIntent stateListAnimator;
            this.KWHzl = this.KWHzl.KWHzl(stringTrieBuilder);
            int iKWHzl = stringTrieBuilder.KWHzl();
            while (true) {
                int i = this.OLrzqt;
                if (i <= iKWHzl) {
                    break;
                }
                int i2 = this.AEQbTJ;
                this.OLrzqt = i - iKWHzl;
                TaskDescription taskDescription = new TaskDescription(this.copydefault, (i2 + i) - iKWHzl, iKWHzl, this.KWHzl);
                taskDescription.AEQbTJ();
                this.KWHzl = stringTrieBuilder.EZpvd(taskDescription);
            }
            if (this.AYXKKw && !stringTrieBuilder.OLrzqt()) {
                int i3 = this.AhwBna;
                this.AhwBna = 0;
                this.AYXKKw = false;
                AEQbTJ();
                stateListAnimator = new StateListAnimator(i3, stringTrieBuilder.EZpvd(this));
            } else {
                AEQbTJ();
                stateListAnimator = this;
            }
            return stringTrieBuilder.EZpvd(stateListAnimator);
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public int KWHzl(int i) {
            if (this.djBIcL != 0) {
                return i;
            }
            int iKWHzl = this.KWHzl.KWHzl(i);
            this.djBIcL = iKWHzl;
            return iKWHzl;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.LoaderManager, com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public void EZpvd(StringTrieBuilder stringTrieBuilder) {
            this.KWHzl.EZpvd(stringTrieBuilder);
            stringTrieBuilder.EZpvd(this.AEQbTJ, this.OLrzqt);
            this.djBIcL = stringTrieBuilder.EZpvd(this.AYXKKw, this.AhwBna, (stringTrieBuilder.copydefault() + this.OLrzqt) - 1);
        }

        public final void AEQbTJ() {
            int iHashCode = ((this.OLrzqt + 124151391) * 37) + this.KWHzl.hashCode();
            this.EZpvd = iHashCode;
            if (this.AYXKKw) {
                this.EZpvd = (iHashCode * 37) + this.AhwBna;
            }
            int i = this.AEQbTJ;
            int i2 = this.OLrzqt;
            for (int i3 = i; i3 < i2 + i; i3++) {
                this.EZpvd = (this.EZpvd * 37) + this.copydefault.charAt(i3);
            }
        }
    }

    public static final class Application extends LoaderManager {
        public StringBuilder AEQbTJ = new StringBuilder();
        public ArrayList<PendingIntent> copydefault = new ArrayList<>();

        public void AEQbTJ(char c, PendingIntent pendingIntent) {
            int iCopydefault = copydefault(c);
            this.AEQbTJ.insert(iCopydefault, c);
            this.copydefault.add(iCopydefault, pendingIntent);
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.LoaderManager, com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public PendingIntent KWHzl(StringTrieBuilder stringTrieBuilder, CharSequence charSequence, int i, int i2) {
            if (i == charSequence.length()) {
                if (this.AYXKKw) {
                    throw new IllegalArgumentException("Duplicate string.");
                }
                EZpvd(i2);
                return this;
            }
            int i3 = i + 1;
            char cCharAt = charSequence.charAt(i);
            int iCopydefault = copydefault(cCharAt);
            if (iCopydefault < this.AEQbTJ.length() && cCharAt == this.AEQbTJ.charAt(iCopydefault)) {
                ArrayList<PendingIntent> arrayList = this.copydefault;
                arrayList.set(iCopydefault, arrayList.get(iCopydefault).KWHzl(stringTrieBuilder, charSequence, i3, i2));
            } else {
                this.AEQbTJ.insert(iCopydefault, cCharAt);
                this.copydefault.add(iCopydefault, stringTrieBuilder.copydefault(charSequence, i3, i2));
            }
            return this;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public PendingIntent KWHzl(StringTrieBuilder stringTrieBuilder) {
            LoaderManager activity = new Activity(this.AEQbTJ.length(), KWHzl(stringTrieBuilder, 0, this.AEQbTJ.length()));
            if (this.AYXKKw) {
                if (stringTrieBuilder.OLrzqt()) {
                    activity.EZpvd(this.AhwBna);
                } else {
                    activity = new StateListAnimator(this.AhwBna, stringTrieBuilder.EZpvd(activity));
                }
            }
            return stringTrieBuilder.EZpvd(activity);
        }

        public final PendingIntent KWHzl(StringTrieBuilder stringTrieBuilder, int i, int i2) {
            int i3 = i2 - i;
            if (i3 > stringTrieBuilder.EZpvd()) {
                int i4 = (i3 / 2) + i;
                return stringTrieBuilder.EZpvd(new FragmentManager(this.AEQbTJ.charAt(i4), KWHzl(stringTrieBuilder, i, i4), KWHzl(stringTrieBuilder, i4, i2)));
            }
            Fragment fragment = new Fragment(i3);
            do {
                char cCharAt = this.AEQbTJ.charAt(i);
                PendingIntent pendingIntent = this.copydefault.get(i);
                if (pendingIntent.getClass() == LoaderManager.class) {
                    fragment.OLrzqt(cCharAt, ((LoaderManager) pendingIntent).AhwBna);
                } else {
                    fragment.EZpvd(cCharAt, pendingIntent.KWHzl(stringTrieBuilder));
                }
                i++;
            } while (i < i2);
            return stringTrieBuilder.EZpvd(fragment);
        }

        public final int copydefault(char c) {
            int length = this.AEQbTJ.length();
            int i = 0;
            while (i < length) {
                int i2 = (i + length) / 2;
                char cCharAt = this.AEQbTJ.charAt(i2);
                if (c < cCharAt) {
                    length = i2;
                } else {
                    if (c == cCharAt) {
                        return i2;
                    }
                    i = i2 + 1;
                }
            }
            return i;
        }
    }

    public static final class Fragment extends ActionBar {
        public int EZpvd;
        public PendingIntent[] OLrzqt;
        public char[] copydefault;
        public int[] gEmmrt;

        public Fragment(int i) {
            this.AEQbTJ = 165535188 + i;
            this.OLrzqt = new PendingIntent[i];
            this.gEmmrt = new int[i];
            this.copydefault = new char[i];
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!super.equals(obj)) {
                return false;
            }
            Fragment fragment = (Fragment) obj;
            for (int i = 0; i < this.EZpvd; i++) {
                if (this.copydefault[i] != fragment.copydefault[i] || this.gEmmrt[i] != fragment.gEmmrt[i] || this.OLrzqt[i] != fragment.OLrzqt[i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.ActionBar, com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public int hashCode() {
            return super.hashCode();
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public int KWHzl(int i) {
            if (this.djBIcL == 0) {
                this.KWHzl = i;
                int i2 = this.EZpvd;
                int i3 = 0;
                while (true) {
                    i2--;
                    PendingIntent pendingIntent = this.OLrzqt[i2];
                    if (pendingIntent != null) {
                        i = pendingIntent.KWHzl(i - i3);
                    }
                    if (i2 <= 0) {
                        break;
                    }
                    i3 = 1;
                }
                this.djBIcL = i;
            }
            return i;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public void EZpvd(StringTrieBuilder stringTrieBuilder) {
            int iCopydefault;
            boolean z;
            int i = this.EZpvd - 1;
            PendingIntent pendingIntent = this.OLrzqt[i];
            int iCopydefault2 = pendingIntent == null ? this.KWHzl : pendingIntent.copydefault();
            do {
                i--;
                PendingIntent pendingIntent2 = this.OLrzqt[i];
                if (pendingIntent2 != null) {
                    pendingIntent2.copydefault(this.KWHzl, iCopydefault2, stringTrieBuilder);
                }
            } while (i > 0);
            int i2 = this.EZpvd - 1;
            if (pendingIntent == null) {
                stringTrieBuilder.copydefault(this.gEmmrt[i2], true);
            } else {
                pendingIntent.EZpvd(stringTrieBuilder);
            }
            this.djBIcL = stringTrieBuilder.copydefault(this.copydefault[i2]);
            while (true) {
                i2--;
                if (i2 < 0) {
                    return;
                }
                PendingIntent pendingIntent3 = this.OLrzqt[i2];
                if (pendingIntent3 == null) {
                    iCopydefault = this.gEmmrt[i2];
                    z = true;
                } else {
                    iCopydefault = this.djBIcL - pendingIntent3.copydefault();
                    z = false;
                }
                stringTrieBuilder.copydefault(iCopydefault, z);
                this.djBIcL = stringTrieBuilder.copydefault(this.copydefault[i2]);
            }
        }

        public void OLrzqt(int i, int i2) {
            char[] cArr = this.copydefault;
            int i3 = this.EZpvd;
            cArr[i3] = (char) i;
            this.OLrzqt[i3] = null;
            this.gEmmrt[i3] = i2;
            this.EZpvd = i3 + 1;
            this.AEQbTJ = (((this.AEQbTJ * 37) + i) * 37) + i2;
        }

        public void EZpvd(int i, PendingIntent pendingIntent) {
            char[] cArr = this.copydefault;
            int i2 = this.EZpvd;
            cArr[i2] = (char) i;
            this.OLrzqt[i2] = pendingIntent;
            this.gEmmrt[i2] = 0;
            this.EZpvd = i2 + 1;
            this.AEQbTJ = (((this.AEQbTJ * 37) + i) * 37) + pendingIntent.hashCode();
        }
    }

    public static final class FragmentManager extends ActionBar {
        public PendingIntent EZpvd;
        public char OLrzqt;
        public PendingIntent copydefault;

        public FragmentManager(char c, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
            this.AEQbTJ = ((((206918985 + c) * 37) + pendingIntent.hashCode()) * 37) + pendingIntent2.hashCode();
            this.OLrzqt = c;
            this.copydefault = pendingIntent;
            this.EZpvd = pendingIntent2;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!super.equals(obj)) {
                return false;
            }
            FragmentManager fragmentManager = (FragmentManager) obj;
            return this.OLrzqt == fragmentManager.OLrzqt && this.copydefault == fragmentManager.copydefault && this.EZpvd == fragmentManager.EZpvd;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.ActionBar, com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public int hashCode() {
            return super.hashCode();
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public int KWHzl(int i) {
            if (this.djBIcL != 0) {
                return i;
            }
            this.KWHzl = i;
            int iKWHzl = this.copydefault.KWHzl(this.EZpvd.KWHzl(i) - 1);
            this.djBIcL = iKWHzl;
            return iKWHzl;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public void EZpvd(StringTrieBuilder stringTrieBuilder) {
            this.copydefault.copydefault(this.KWHzl, this.EZpvd.copydefault(), stringTrieBuilder);
            this.EZpvd.EZpvd(stringTrieBuilder);
            stringTrieBuilder.KWHzl(this.copydefault.copydefault());
            this.djBIcL = stringTrieBuilder.copydefault(this.OLrzqt);
        }
    }

    public static final class Activity extends LoaderManager {
        public int AEQbTJ;
        public PendingIntent KWHzl;

        public Activity(int i, PendingIntent pendingIntent) {
            this.AEQbTJ = i;
            this.KWHzl = pendingIntent;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.LoaderManager, com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public int hashCode() {
            return ((this.AEQbTJ + 248302782) * 37) + this.KWHzl.hashCode();
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.LoaderManager, com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!super.equals(obj)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.AEQbTJ == activity.AEQbTJ && this.KWHzl == activity.KWHzl;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public int KWHzl(int i) {
            if (this.djBIcL != 0) {
                return i;
            }
            int iKWHzl = this.KWHzl.KWHzl(i);
            this.djBIcL = iKWHzl;
            return iKWHzl;
        }

        @Override // com.ibm.icu.util.StringTrieBuilder.LoaderManager, com.ibm.icu.util.StringTrieBuilder.PendingIntent
        public void EZpvd(StringTrieBuilder stringTrieBuilder) {
            this.KWHzl.EZpvd(stringTrieBuilder);
            if (this.AEQbTJ <= stringTrieBuilder.copydefault()) {
                this.djBIcL = stringTrieBuilder.EZpvd(this.AYXKKw, this.AhwBna, this.AEQbTJ - 1);
            } else {
                stringTrieBuilder.copydefault(this.AEQbTJ - 1);
                this.djBIcL = stringTrieBuilder.EZpvd(this.AYXKKw, this.AhwBna, 0);
            }
        }
    }

    public final LoaderManager copydefault(CharSequence charSequence, int i, int i2) {
        LoaderManager loaderManagerOLrzqt = OLrzqt(i2);
        if (i >= charSequence.length()) {
            return loaderManagerOLrzqt;
        }
        int length = this.djBIcL.length();
        this.djBIcL.append(charSequence, i, charSequence.length());
        return new TaskDescription(this.djBIcL, length, charSequence.length() - i, loaderManagerOLrzqt);
    }
}

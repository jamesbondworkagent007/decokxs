package o;

import java.util.LinkedList;

/* JADX INFO: renamed from: o.acC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7029acC<V> {
    public C7029acC<V>.StateListAnimator AEQbTJ = new StateListAnimator();
    public boolean EZpvd;

    /* JADX INFO: renamed from: o.acC$Activity */
    public static class Activity {
        public boolean AEQbTJ;
        public int copydefault;
    }

    /* JADX INFO: renamed from: o.acC$TaskDescription */
    public interface TaskDescription<V> {
        boolean EZpvd(int i, java.util.Iterator<V> it);
    }

    public C7029acC(boolean z) {
        this.EZpvd = z;
    }

    public C7029acC<V> AEQbTJ(java.lang.CharSequence charSequence, V v) {
        this.AEQbTJ.OLrzqt(new ActionBar(charSequence, 0, this.EZpvd), v);
        return this;
    }

    public java.util.Iterator<V> AEQbTJ(java.lang.CharSequence charSequence, int i, Activity activity) {
        Application application = new Application();
        EZpvd(charSequence, i, application, activity);
        if (activity != null) {
            activity.copydefault = application.AEQbTJ();
        }
        return application.copydefault();
    }

    public void EZpvd(java.lang.CharSequence charSequence, int i, TaskDescription<V> taskDescription) {
        EZpvd(charSequence, i, taskDescription, null);
    }

    public final void EZpvd(java.lang.CharSequence charSequence, int i, TaskDescription<V> taskDescription, Activity activity) {
        AEQbTJ(this.AEQbTJ, new ActionBar(charSequence, i, this.EZpvd), taskDescription, activity);
    }

    public final void AEQbTJ(C7029acC<V>.StateListAnimator stateListAnimator, ActionBar actionBar, TaskDescription<V> taskDescription, Activity activity) {
        synchronized (this) {
            java.util.Iterator<V> itCopydefault = stateListAnimator.copydefault();
            if (itCopydefault == null || taskDescription.EZpvd(actionBar.EZpvd(), itCopydefault)) {
                C7029acC<V>.StateListAnimator stateListAnimatorEZpvd = stateListAnimator.EZpvd(actionBar, activity);
                if (stateListAnimatorEZpvd != null) {
                    AEQbTJ(stateListAnimatorEZpvd, actionBar, taskDescription, activity);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.acC$ActionBar */
    public static class ActionBar implements java.util.Iterator<java.lang.Character> {
        public java.lang.Character AEQbTJ;
        public int EZpvd;
        public boolean KWHzl;
        public int OLrzqt;
        public java.lang.CharSequence copydefault;

        public ActionBar(java.lang.CharSequence charSequence, int i, boolean z) {
            this.copydefault = charSequence;
            this.OLrzqt = i;
            this.EZpvd = i;
            this.KWHzl = z;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return (this.EZpvd == this.copydefault.length() && this.AEQbTJ == null) ? false : true;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public java.lang.Character next() {
            if (this.EZpvd == this.copydefault.length() && this.AEQbTJ == null) {
                return null;
            }
            java.lang.Character ch = this.AEQbTJ;
            if (ch != null) {
                this.AEQbTJ = null;
                return ch;
            }
            if (this.KWHzl) {
                int iOLrzqt = C7223afl.OLrzqt(java.lang.Character.codePointAt(this.copydefault, this.EZpvd), true);
                this.EZpvd += java.lang.Character.charCount(iOLrzqt);
                char[] chars = java.lang.Character.toChars(iOLrzqt);
                char c = chars[0];
                if (chars.length == 2) {
                    this.AEQbTJ = java.lang.Character.valueOf(chars[1]);
                }
                return java.lang.Character.valueOf(c);
            }
            java.lang.Character chValueOf = java.lang.Character.valueOf(this.copydefault.charAt(this.EZpvd));
            this.EZpvd++;
            return chValueOf;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("remove() not supproted");
        }

        public int EZpvd() {
            if (this.AEQbTJ == null) {
                return this.EZpvd - this.OLrzqt;
            }
            throw new java.lang.IllegalStateException("In the middle of surrogate pair");
        }
    }

    /* JADX INFO: renamed from: o.acC$Application */
    public static class Application<V> implements TaskDescription<V> {
        public java.util.Iterator<V> EZpvd;
        public int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C7029acC.TaskDescription
        public boolean EZpvd(int i, java.util.Iterator<V> it) {
            if (i <= this.OLrzqt) {
                return true;
            }
            this.OLrzqt = i;
            this.EZpvd = it;
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.util.Iterator<V> copydefault() {
            return this.EZpvd;
        }

        private Application() {
            this.EZpvd = null;
            this.OLrzqt = 0;
        }
    }

    /* JADX INFO: renamed from: o.acC$StateListAnimator */
    public class StateListAnimator {
        public char[] AEQbTJ;
        public java.util.List<C7029acC<V>.StateListAnimator> KWHzl;
        public java.util.List<V> copydefault;

        public StateListAnimator() {
        }

        public StateListAnimator(char[] cArr, java.util.List<V> list, java.util.List<C7029acC<V>.StateListAnimator> list2) {
            this.AEQbTJ = cArr;
            this.copydefault = list;
            this.KWHzl = list2;
        }

        public java.util.Iterator<V> copydefault() {
            java.util.List<V> list = this.copydefault;
            if (list == null) {
                return null;
            }
            return list.iterator();
        }

        public void OLrzqt(ActionBar actionBar, V v) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            while (actionBar.hasNext()) {
                sb.append(actionBar.next());
            }
            copydefault(C7029acC.KWHzl(sb), 0, v);
        }

        public C7029acC<V>.StateListAnimator EZpvd(ActionBar actionBar, Activity activity) {
            if (this.KWHzl == null) {
                return null;
            }
            if (!actionBar.hasNext()) {
                if (activity != null) {
                    activity.AEQbTJ = true;
                }
                return null;
            }
            java.lang.Character next = actionBar.next();
            for (C7029acC<V>.StateListAnimator stateListAnimator : this.KWHzl) {
                if (next.charValue() < stateListAnimator.AEQbTJ[0]) {
                    return null;
                }
                if (next.charValue() == stateListAnimator.AEQbTJ[0]) {
                    if (stateListAnimator.OLrzqt(actionBar, activity)) {
                        return stateListAnimator;
                    }
                    return null;
                }
            }
            return null;
        }

        public final void copydefault(char[] cArr, int i, V v) {
            C7029acC<V>.StateListAnimator next;
            char c;
            char c2;
            if (cArr.length == i) {
                this.copydefault = copydefault(this.copydefault, v);
                return;
            }
            java.util.List<C7029acC<V>.StateListAnimator> list = this.KWHzl;
            if (list == null) {
                this.KWHzl = new LinkedList();
                this.KWHzl.add(new StateListAnimator(C7029acC.KWHzl(cArr, i), copydefault(null, v), null));
                return;
            }
            java.util.ListIterator<C7029acC<V>.StateListAnimator> listIterator = list.listIterator();
            do {
                if (listIterator.hasNext()) {
                    next = listIterator.next();
                    c = cArr[i];
                    c2 = next.AEQbTJ[0];
                    if (c < c2) {
                        listIterator.previous();
                    }
                }
                listIterator.add(new StateListAnimator(C7029acC.KWHzl(cArr, i), copydefault(null, v), null));
                return;
            } while (c != c2);
            int iAEQbTJ = next.AEQbTJ(cArr, i);
            if (iAEQbTJ == next.AEQbTJ.length) {
                next.copydefault(cArr, i + iAEQbTJ, v);
            } else {
                next.KWHzl(iAEQbTJ);
                next.copydefault(cArr, i + iAEQbTJ, v);
            }
        }

        public final boolean OLrzqt(ActionBar actionBar, Activity activity) {
            for (int i = 1; i < this.AEQbTJ.length; i++) {
                if (actionBar.hasNext()) {
                    if (actionBar.next().charValue() == this.AEQbTJ[i]) {
                    }
                } else if (activity != null) {
                    activity.AEQbTJ = true;
                }
                return false;
            }
            return true;
        }

        public final int AEQbTJ(char[] cArr, int i) {
            int length = cArr.length - i;
            char[] cArr2 = this.AEQbTJ;
            if (cArr2.length < length) {
                length = cArr2.length;
            }
            int i2 = 0;
            while (i2 < length && this.AEQbTJ[i2] == cArr[i + i2]) {
                i2++;
            }
            return i2;
        }

        public final void KWHzl(int i) {
            char[] cArrKWHzl = C7029acC.KWHzl(this.AEQbTJ, i);
            this.AEQbTJ = C7029acC.KWHzl(this.AEQbTJ, 0, i);
            StateListAnimator stateListAnimator = new StateListAnimator(cArrKWHzl, this.copydefault, this.KWHzl);
            this.copydefault = null;
            LinkedList linkedList = new LinkedList();
            this.KWHzl = linkedList;
            linkedList.add(stateListAnimator);
        }

        public final java.util.List<V> copydefault(java.util.List<V> list, V v) {
            if (list == null) {
                list = new LinkedList<>();
            }
            list.add(v);
            return list;
        }
    }

    public static char[] KWHzl(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = charSequence.charAt(i);
        }
        return cArr;
    }

    public static char[] KWHzl(char[] cArr, int i) {
        if (i == 0) {
            return cArr;
        }
        int length = cArr.length - i;
        char[] cArr2 = new char[length];
        java.lang.System.arraycopy(cArr, i, cArr2, 0, length);
        return cArr2;
    }

    public static char[] KWHzl(char[] cArr, int i, int i2) {
        if (i == 0 && i2 == cArr.length) {
            return cArr;
        }
        int i3 = i2 - i;
        char[] cArr2 = new char[i3];
        java.lang.System.arraycopy(cArr, i, cArr2, 0, i3);
        return cArr2;
    }
}

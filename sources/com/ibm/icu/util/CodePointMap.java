package com.ibm.icu.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CodePointMap implements Iterable<StateListAnimator> {

    public interface ActionBar {
        int OLrzqt(int i);
    }

    public enum RangeOption {
        NORMAL,
        FIXED_LEAD_SURROGATES,
        FIXED_ALL_SURROGATES
    }

    public abstract boolean AEQbTJ(int i, ActionBar actionBar, StateListAnimator stateListAnimator);

    public static final class StateListAnimator {
        public int KWHzl = -1;
        public int copydefault = -1;
        public int EZpvd = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt(int i, int i2, int i3) {
            this.copydefault = i;
            this.KWHzl = i2;
            this.EZpvd = i3;
        }
    }

    public final class Activity implements Iterator<StateListAnimator> {
        public StateListAnimator AEQbTJ;

        public Activity() {
            this.AEQbTJ = new StateListAnimator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return -1 <= this.AEQbTJ.KWHzl && this.AEQbTJ.KWHzl < 1114111;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public StateListAnimator next() {
            if (CodePointMap.this.AEQbTJ(this.AEQbTJ.KWHzl + 1, null, this.AEQbTJ)) {
                return this.AEQbTJ;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public boolean OLrzqt(int i, RangeOption rangeOption, int i2, ActionBar actionBar, StateListAnimator stateListAnimator) {
        if (!AEQbTJ(i, actionBar, stateListAnimator)) {
            return false;
        }
        if (rangeOption == RangeOption.NORMAL) {
            return true;
        }
        int i3 = rangeOption == RangeOption.FIXED_ALL_SURROGATES ? 57343 : 56319;
        int i4 = stateListAnimator.KWHzl;
        if (i4 >= 55295 && i <= i3) {
            if (stateListAnimator.EZpvd == i2) {
                if (i4 >= i3) {
                    return true;
                }
            } else {
                if (i <= 55295) {
                    stateListAnimator.KWHzl = 55295;
                    return true;
                }
                stateListAnimator.EZpvd = i2;
                if (i4 > i3) {
                    stateListAnimator.KWHzl = i3;
                    return true;
                }
            }
            if (!AEQbTJ(i3 + 1, actionBar, stateListAnimator) || stateListAnimator.EZpvd != i2) {
                stateListAnimator.copydefault = i;
                stateListAnimator.KWHzl = i3;
                stateListAnimator.EZpvd = i2;
            } else {
                stateListAnimator.copydefault = i;
                return true;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<StateListAnimator> iterator() {
        return new Activity();
    }
}

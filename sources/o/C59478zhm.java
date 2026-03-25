package o;

import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59478zhm implements Sequence<kotlin.ranges.IntRange> {
    public final java.lang.CharSequence AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public final Function2<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.CharSequence, ? super java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59478zhm(@NotNull java.lang.CharSequence charSequence, int i, int i2, @NotNull Function2<? super java.lang.CharSequence, ? super java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> function2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = charSequence;
        this.EZpvd = i;
        this.KWHzl = i2;
        this.OLrzqt = function2;
    }

    /* JADX INFO: renamed from: o.zhm$StateListAnimator */
    public static final class StateListAnimator implements java.util.Iterator<kotlin.ranges.IntRange>, InterfaceC56535yIz {
        public int AEQbTJ = -1;
        public int EZpvd;
        public int KWHzl;
        public kotlin.ranges.IntRange OLrzqt;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public StateListAnimator() {
            int iEZpvd = C56548yJl.EZpvd(C59478zhm.this.EZpvd, 0, C59478zhm.this.AEQbTJ.length());
            this.KWHzl = iEZpvd;
            this.copydefault = iEZpvd;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void copydefault() {
            kotlin.Pair pair;
            if (this.copydefault < 0) {
                this.AEQbTJ = 0;
                this.OLrzqt = null;
                return;
            }
            if (C59478zhm.this.KWHzl > 0) {
                int i = this.EZpvd + 1;
                this.EZpvd = i;
                if (i < C59478zhm.this.KWHzl) {
                    if (this.copydefault > C59478zhm.this.AEQbTJ.length() || (pair = (kotlin.Pair) C59478zhm.this.OLrzqt.invoke(C59478zhm.this.AEQbTJ, java.lang.Integer.valueOf(this.copydefault))) == null) {
                        this.OLrzqt = new kotlin.ranges.IntRange(this.KWHzl, StringsKt__StringsKt.fIwbmz(C59478zhm.this.AEQbTJ));
                        this.copydefault = -1;
                    } else {
                        int iIntValue = ((java.lang.Number) pair.component1()).intValue();
                        int iIntValue2 = ((java.lang.Number) pair.component2()).intValue();
                        this.OLrzqt = C56548yJl.AhwBna(this.KWHzl, iIntValue);
                        int i2 = iIntValue + iIntValue2;
                        this.KWHzl = i2;
                        this.copydefault = i2 + (iIntValue2 == 0 ? 1 : 0);
                    }
                } else {
                    this.OLrzqt = new kotlin.ranges.IntRange(this.KWHzl, StringsKt__StringsKt.fIwbmz(C59478zhm.this.AEQbTJ));
                    this.copydefault = -1;
                }
            }
            this.AEQbTJ = 1;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public kotlin.ranges.IntRange next() {
            if (this.AEQbTJ == -1) {
                copydefault();
            }
            if (this.AEQbTJ == 0) {
                throw new NoSuchElementException();
            }
            kotlin.ranges.IntRange intRange = this.OLrzqt;
            Intrinsics.copydefault(intRange, "");
            this.OLrzqt = null;
            this.AEQbTJ = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.AEQbTJ == -1) {
                copydefault();
            }
            return this.AEQbTJ == 1;
        }
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<kotlin.ranges.IntRange> iterator() {
        return new StateListAnimator();
    }
}

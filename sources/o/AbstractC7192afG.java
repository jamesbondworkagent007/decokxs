package o;

import com.ibm.icu.impl.CacheValue;
import com.ibm.icu.util.ICUCloneNotSupportedException;
import com.ibm.icu.util.ULocale;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.MissingResourceException;

/* JADX INFO: renamed from: o.afG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7192afG implements java.lang.Cloneable {
    public static StateListAnimator djBIcL;
    public ULocale AhwBna;
    public ULocale gEmmrt;
    public static final boolean AYXKKw = C7060ach.AEQbTJ("breakiterator");
    public static final CacheValue<?>[] valueOf = new CacheValue[5];

    /* JADX INFO: renamed from: o.afG$StateListAnimator */
    public static abstract class StateListAnimator {
        public abstract AbstractC7192afG KWHzl(ULocale uLocale, int i);
    }

    public abstract int EZpvd();

    public abstract int KWHzl();

    public abstract void OLrzqt(CharacterIterator characterIterator);

    public abstract CharacterIterator copydefault();

    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new ICUCloneNotSupportedException(e);
        }
    }

    public void AEQbTJ(java.lang.String str) {
        OLrzqt(new StringCharacterIterator(str));
    }

    public static AbstractC7192afG KWHzl(ULocale uLocale) {
        return OLrzqt(uLocale, 1);
    }

    public static AbstractC7192afG copydefault(ULocale uLocale) {
        return OLrzqt(uLocale, 3);
    }

    @java.lang.Deprecated
    public static AbstractC7192afG OLrzqt(ULocale uLocale, int i) {
        TaskDescription taskDescription;
        if (uLocale == null) {
            throw new java.lang.NullPointerException("Specified locale is null");
        }
        CacheValue<?>[] cacheValueArr = valueOf;
        CacheValue<?> cacheValue = cacheValueArr[i];
        if (cacheValue != null && (taskDescription = (TaskDescription) cacheValue.AEQbTJ()) != null && taskDescription.KWHzl().equals(uLocale)) {
            return taskDescription.copydefault();
        }
        AbstractC7192afG abstractC7192afGKWHzl = valueOf().KWHzl(uLocale, i);
        cacheValueArr[i] = CacheValue.EZpvd(new TaskDescription(uLocale, abstractC7192afGKWHzl));
        return abstractC7192afGKWHzl;
    }

    /* JADX INFO: renamed from: o.afG$TaskDescription */
    public static final class TaskDescription {
        public AbstractC7192afG OLrzqt;
        public ULocale copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ULocale KWHzl() {
            return this.copydefault;
        }

        public TaskDescription(ULocale uLocale, AbstractC7192afG abstractC7192afG) {
            this.copydefault = uLocale;
            this.OLrzqt = (AbstractC7192afG) abstractC7192afG.clone();
        }

        public AbstractC7192afG copydefault() {
            return (AbstractC7192afG) this.OLrzqt.clone();
        }
    }

    public static StateListAnimator valueOf() {
        if (djBIcL == null) {
            try {
                djBIcL = (StateListAnimator) java.lang.Class.forName("o.afN").newInstance();
            } catch (MissingResourceException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                if (AYXKKw) {
                    e2.printStackTrace();
                }
                throw new java.lang.RuntimeException(e2.getMessage());
            }
        }
        return djBIcL;
    }

    public final void KWHzl(ULocale uLocale, ULocale uLocale2) {
        if ((uLocale == null) != (uLocale2 == null)) {
            throw new java.lang.IllegalArgumentException();
        }
        this.AhwBna = uLocale;
        this.gEmmrt = uLocale2;
    }
}

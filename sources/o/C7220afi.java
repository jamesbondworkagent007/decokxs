package o;

import com.ibm.icu.impl.number.CompactData;
import com.ibm.icu.text.CompactDecimalFormat;
import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.ULocale;
import o.C7175aeq;

/* JADX INFO: renamed from: o.afi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7220afi extends C7230afs {
    public final CompactDecimalFormat.CompactStyle AEQbTJ;
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> OLrzqt;

    public C7220afi(CompactDecimalFormat.CompactStyle compactStyle) {
        this.OLrzqt = null;
        this.AEQbTJ = compactStyle;
    }

    public C7220afi(java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> map) {
        this.AEQbTJ = null;
        this.OLrzqt = map;
    }

    public InterfaceC7171aem EZpvd(ULocale uLocale, java.lang.String str, CompactData.CompactType compactType, PluralRules pluralRules, C7175aeq c7175aeq, boolean z, InterfaceC7171aem interfaceC7171aem) {
        return new StateListAnimator(uLocale, str, compactType, pluralRules, c7175aeq, z, interfaceC7171aem);
    }

    /* JADX INFO: renamed from: o.afi$StateListAnimator */
    public static class StateListAnimator implements InterfaceC7171aem {
        public final CompactData AEQbTJ;
        public final PluralRules EZpvd;
        public final C7175aeq KWHzl;
        public final java.util.Map<java.lang.String, C7175aeq.TaskDescription> OLrzqt;
        public final InterfaceC7171aem copydefault;

        public StateListAnimator(C7220afi c7220afi, ULocale uLocale, java.lang.String str, CompactData.CompactType compactType, PluralRules pluralRules, C7175aeq c7175aeq, boolean z, InterfaceC7171aem interfaceC7171aem) {
            this.EZpvd = pluralRules;
            this.copydefault = interfaceC7171aem;
            CompactData compactData = new CompactData();
            this.AEQbTJ = compactData;
            CompactDecimalFormat.CompactStyle compactStyle = c7220afi.AEQbTJ;
            if (compactStyle != null) {
                compactData.KWHzl(uLocale, str, compactStyle, compactType);
            } else {
                compactData.AEQbTJ(c7220afi.OLrzqt);
            }
            if (!z) {
                this.OLrzqt = null;
                this.KWHzl = c7175aeq;
            } else {
                this.OLrzqt = new java.util.HashMap();
                copydefault(c7175aeq);
                this.KWHzl = null;
            }
        }

        public final void copydefault(C7175aeq c7175aeq) {
            java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet();
            this.AEQbTJ.AEQbTJ(hashSet);
            for (java.lang.String str : hashSet) {
                c7175aeq.EZpvd(C7173aeo.copydefault(str), NumberFormat.Field.COMPACT);
                this.OLrzqt.put(str, c7175aeq.KWHzl());
            }
        }

        @Override // o.InterfaceC7171aem
        public C7169aek EZpvd(InterfaceC7163aee interfaceC7163aee) {
            int iEZpvd;
            C7169aek c7169aekEZpvd = this.copydefault.EZpvd(interfaceC7163aee);
            if (interfaceC7163aee.valueOf()) {
                c7169aekEZpvd.AkhnZx.AEQbTJ(interfaceC7163aee);
                iEZpvd = 0;
            } else {
                iEZpvd = c7169aekEZpvd.AkhnZx.EZpvd(interfaceC7163aee, this.AEQbTJ);
                iAEQbTJ = (interfaceC7163aee.valueOf() ? 0 : interfaceC7163aee.AEQbTJ()) - iEZpvd;
            }
            java.lang.String strCopydefault = this.AEQbTJ.copydefault(iAEQbTJ, interfaceC7163aee.OLrzqt(this.EZpvd));
            if (strCopydefault != null) {
                java.util.Map<java.lang.String, C7175aeq.TaskDescription> map = this.OLrzqt;
                if (map != null) {
                    map.get(strCopydefault).AEQbTJ(c7169aekEZpvd, interfaceC7163aee);
                } else {
                    this.KWHzl.EZpvd(C7173aeo.copydefault(strCopydefault), NumberFormat.Field.COMPACT);
                    this.KWHzl.OLrzqt(interfaceC7163aee.AYXKKw(), null);
                    c7169aekEZpvd.djBIcL = this.KWHzl;
                }
            }
            interfaceC7163aee.KWHzl(iEZpvd * (-1));
            c7169aekEZpvd.AkhnZx = null;
            return c7169aekEZpvd;
        }
    }
}

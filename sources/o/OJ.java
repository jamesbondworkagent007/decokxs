package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.OO;

/* JADX INFO: loaded from: classes2.dex */
public class OJ<K extends OO, V> {
    public final ActionBar<K, V> KWHzl = new ActionBar<>();
    public final java.util.Map<K, ActionBar<K, V>> AEQbTJ = new java.util.HashMap();

    public void copydefault(K k, V v) {
        ActionBar<K, V> actionBar = this.AEQbTJ.get(k);
        if (actionBar == null) {
            actionBar = new ActionBar<>(k);
            EZpvd(actionBar);
            this.AEQbTJ.put(k, actionBar);
        } else {
            k.OLrzqt();
        }
        actionBar.KWHzl(v);
    }

    public V OLrzqt(K k) {
        ActionBar<K, V> actionBar = this.AEQbTJ.get(k);
        if (actionBar == null) {
            actionBar = new ActionBar<>(k);
            this.AEQbTJ.put(k, actionBar);
        } else {
            k.OLrzqt();
        }
        AEQbTJ(actionBar);
        return actionBar.AEQbTJ();
    }

    public V copydefault() {
        for (ActionBar actionBar = this.KWHzl.KWHzl; !actionBar.equals(this.KWHzl); actionBar = actionBar.KWHzl) {
            V v = (V) actionBar.AEQbTJ();
            if (v != null) {
                return v;
            }
            copydefault(actionBar);
            this.AEQbTJ.remove(actionBar.copydefault);
            ((OO) actionBar.copydefault).OLrzqt();
        }
        return null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GroupedLinkedMap( ");
        ActionBar actionBar = this.KWHzl.OLrzqt;
        boolean z = false;
        while (!actionBar.equals(this.KWHzl)) {
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            sb.append(actionBar.copydefault);
            sb.append(AbstractJsonLexerKt.COLON);
            sb.append(actionBar.OLrzqt());
            sb.append("}, ");
            actionBar = actionBar.OLrzqt;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    public final void AEQbTJ(ActionBar<K, V> actionBar) {
        copydefault(actionBar);
        ActionBar<K, V> actionBar2 = this.KWHzl;
        actionBar.KWHzl = actionBar2;
        actionBar.OLrzqt = actionBar2.OLrzqt;
        KWHzl(actionBar);
    }

    public final void EZpvd(ActionBar<K, V> actionBar) {
        copydefault(actionBar);
        ActionBar<K, V> actionBar2 = this.KWHzl;
        actionBar.KWHzl = actionBar2.KWHzl;
        actionBar.OLrzqt = actionBar2;
        KWHzl(actionBar);
    }

    public static <K, V> void KWHzl(ActionBar<K, V> actionBar) {
        actionBar.OLrzqt.KWHzl = actionBar;
        actionBar.KWHzl.OLrzqt = actionBar;
    }

    public static <K, V> void copydefault(ActionBar<K, V> actionBar) {
        ActionBar<K, V> actionBar2 = actionBar.KWHzl;
        actionBar2.OLrzqt = actionBar.OLrzqt;
        actionBar.OLrzqt.KWHzl = actionBar2;
    }

    public static class ActionBar<K, V> {
        public java.util.List<V> AEQbTJ;
        public ActionBar<K, V> KWHzl;
        public ActionBar<K, V> OLrzqt;
        public final K copydefault;

        public ActionBar() {
            this(null);
        }

        public ActionBar(K k) {
            this.KWHzl = this;
            this.OLrzqt = this;
            this.copydefault = k;
        }

        public V AEQbTJ() {
            int iOLrzqt = OLrzqt();
            if (iOLrzqt > 0) {
                return this.AEQbTJ.remove(iOLrzqt - 1);
            }
            return null;
        }

        public int OLrzqt() {
            java.util.List<V> list = this.AEQbTJ;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public void KWHzl(V v) {
            if (this.AEQbTJ == null) {
                this.AEQbTJ = new java.util.ArrayList();
            }
            this.AEQbTJ.add(v);
        }
    }
}

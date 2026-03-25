package o;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class OQ implements OS {
    public static final Bitmap.Config[] AEQbTJ;
    public static final Bitmap.Config[] EZpvd;
    public static final Bitmap.Config[] KWHzl;
    public static final Bitmap.Config[] OLrzqt;
    public static final Bitmap.Config[] copydefault;
    public final Application AhwBna = new Application();
    public final OJ<ActionBar, android.graphics.Bitmap> gEmmrt = new OJ<>();
    public final java.util.Map<Bitmap.Config, NavigableMap<java.lang.Integer, java.lang.Integer>> djBIcL = new java.util.HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) java.util.Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        copydefault = configArr;
        AEQbTJ = configArr;
        EZpvd = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        KWHzl = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        OLrzqt = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    @Override // o.OS
    public void KWHzl(android.graphics.Bitmap bitmap) {
        ActionBar actionBarAEQbTJ = this.AhwBna.AEQbTJ(SI.KWHzl(bitmap), bitmap.getConfig());
        this.gEmmrt.copydefault(actionBarAEQbTJ, bitmap);
        NavigableMap<java.lang.Integer, java.lang.Integer> navigableMapAEQbTJ = AEQbTJ(bitmap.getConfig());
        java.lang.Integer num = navigableMapAEQbTJ.get(java.lang.Integer.valueOf(actionBarAEQbTJ.EZpvd));
        navigableMapAEQbTJ.put(java.lang.Integer.valueOf(actionBarAEQbTJ.EZpvd), java.lang.Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // o.OS
    public android.graphics.Bitmap KWHzl(int i, int i2, Bitmap.Config config) {
        ActionBar actionBarKWHzl = KWHzl(SI.EZpvd(i, i2, config), config);
        android.graphics.Bitmap bitmapOLrzqt = this.gEmmrt.OLrzqt(actionBarKWHzl);
        if (bitmapOLrzqt != null) {
            OLrzqt(java.lang.Integer.valueOf(actionBarKWHzl.EZpvd), bitmapOLrzqt);
            bitmapOLrzqt.reconfigure(i, i2, config);
        }
        return bitmapOLrzqt;
    }

    public final ActionBar KWHzl(int i, Bitmap.Config config) {
        ActionBar actionBarAEQbTJ = this.AhwBna.AEQbTJ(i, config);
        for (Bitmap.Config config2 : OLrzqt(config)) {
            java.lang.Integer numCeilingKey = AEQbTJ(config2).ceilingKey(java.lang.Integer.valueOf(i));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i * 8) {
                if (numCeilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return actionBarAEQbTJ;
                        }
                    } else if (config2.equals(config)) {
                        return actionBarAEQbTJ;
                    }
                }
                this.AhwBna.AEQbTJ(actionBarAEQbTJ);
                return this.AhwBna.AEQbTJ(numCeilingKey.intValue(), config2);
            }
        }
        return actionBarAEQbTJ;
    }

    @Override // o.OS
    public android.graphics.Bitmap copydefault() {
        android.graphics.Bitmap bitmapCopydefault = this.gEmmrt.copydefault();
        if (bitmapCopydefault != null) {
            OLrzqt(java.lang.Integer.valueOf(SI.KWHzl(bitmapCopydefault)), bitmapCopydefault);
        }
        return bitmapCopydefault;
    }

    public final void OLrzqt(java.lang.Integer num, android.graphics.Bitmap bitmap) {
        NavigableMap<java.lang.Integer, java.lang.Integer> navigableMapAEQbTJ = AEQbTJ(bitmap.getConfig());
        java.lang.Integer num2 = navigableMapAEQbTJ.get(num);
        if (num2 == null) {
            throw new java.lang.NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + OLrzqt(bitmap) + ", this: " + this);
        }
        if (num2.intValue() == 1) {
            navigableMapAEQbTJ.remove(num);
        } else {
            navigableMapAEQbTJ.put(num, java.lang.Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final NavigableMap<java.lang.Integer, java.lang.Integer> AEQbTJ(Bitmap.Config config) {
        NavigableMap<java.lang.Integer, java.lang.Integer> navigableMap = this.djBIcL.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.djBIcL.put(config, treeMap);
        return treeMap;
    }

    @Override // o.OS
    public java.lang.String OLrzqt(android.graphics.Bitmap bitmap) {
        return EZpvd(SI.KWHzl(bitmap), bitmap.getConfig());
    }

    @Override // o.OS
    public java.lang.String copydefault(int i, int i2, Bitmap.Config config) {
        return EZpvd(SI.EZpvd(i, i2, config), config);
    }

    @Override // o.OS
    public int AEQbTJ(android.graphics.Bitmap bitmap) {
        return SI.KWHzl(bitmap);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.gEmmrt);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<java.lang.Integer, java.lang.Integer>> entry : this.djBIcL.entrySet()) {
            sb.append(entry.getKey());
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.djBIcL.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    public static class Application extends OE<ActionBar> {
        public ActionBar AEQbTJ(int i, Bitmap.Config config) {
            ActionBar actionBarOLrzqt = OLrzqt();
            actionBarOLrzqt.OLrzqt(i, config);
            return actionBarOLrzqt;
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/OO; */
        @Override // o.OE
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public ActionBar KWHzl() {
            return new ActionBar(this);
        }
    }

    public static final class ActionBar implements OO {
        public Bitmap.Config AEQbTJ;
        public int EZpvd;
        public final Application OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt(int i, Bitmap.Config config) {
            this.EZpvd = i;
            this.AEQbTJ = config;
        }

        public ActionBar(Application application) {
            this.OLrzqt = application;
        }

        @Override // o.OO
        public void OLrzqt() {
            this.OLrzqt.AEQbTJ(this);
        }

        public java.lang.String toString() {
            return OQ.EZpvd(this.EZpvd, this.AEQbTJ);
        }

        public boolean equals(java.lang.Object obj) {
            if (obj instanceof ActionBar) {
                ActionBar actionBar = (ActionBar) obj;
                if (this.EZpvd == actionBar.EZpvd && SI.AEQbTJ(this.AEQbTJ, actionBar.AEQbTJ)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.EZpvd;
            Bitmap.Config config = this.AEQbTJ;
            return (i * 31) + (config != null ? config.hashCode() : 0);
        }
    }

    public static java.lang.String EZpvd(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public static Bitmap.Config[] OLrzqt(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return AEQbTJ;
        }
        int i = AnonymousClass5.copydefault[config.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new Bitmap.Config[]{config} : OLrzqt : KWHzl : EZpvd : copydefault;
    }

    /* JADX INFO: renamed from: o.OQ$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            copydefault = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                copydefault[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                copydefault[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                copydefault[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }
}

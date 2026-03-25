package o;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import java.util.Map;
import o.Sz;

/* JADX INFO: renamed from: o.No, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5330No extends android.content.ContextWrapper {
    public static final AbstractC5334Ns<?, ?> EZpvd = new C5323Nh();
    public final OF AEQbTJ;
    public final int AYXKKw;
    public final C5455Sj AhwBna;
    public final Glide.Application KWHzl;
    public C5448Sc OLrzqt;
    public final java.util.List<RY<java.lang.Object>> copydefault;
    public final C5357Op djBIcL;
    public final C5331Np gEmmrt;
    public final java.util.Map<java.lang.Class<?>, AbstractC5334Ns<?, ?>> valueOf;
    public final Sz.Activity<Registry> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OF EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<RY<java.lang.Object>> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5357Op OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5331Np copydefault() {
        return this.gEmmrt;
    }

    public C5330No(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull OF of, @androidx.annotation.NonNull Sz.Activity<Registry> activity, @androidx.annotation.NonNull C5455Sj c5455Sj, @androidx.annotation.NonNull Glide.Application application, @androidx.annotation.NonNull java.util.Map<java.lang.Class<?>, AbstractC5334Ns<?, ?>> map, @androidx.annotation.NonNull java.util.List<RY<java.lang.Object>> list, @androidx.annotation.NonNull C5357Op c5357Op, @androidx.annotation.NonNull C5331Np c5331Np, int i) {
        super(context.getApplicationContext());
        this.AEQbTJ = of;
        this.AhwBna = c5455Sj;
        this.KWHzl = application;
        this.copydefault = list;
        this.valueOf = map;
        this.djBIcL = c5357Op;
        this.gEmmrt = c5331Np;
        this.AYXKKw = i;
        this.values = Sz.copydefault(activity);
    }

    public C5448Sc AEQbTJ() {
        C5448Sc c5448Sc;
        synchronized (this) {
            if (this.OLrzqt == null) {
                this.OLrzqt = this.KWHzl.EZpvd().QVAiDq();
            }
            c5448Sc = this.OLrzqt;
        }
        return c5448Sc;
    }

    public <T> AbstractC5334Ns<?, T> EZpvd(@androidx.annotation.NonNull java.lang.Class<T> cls) {
        AbstractC5334Ns<?, T> abstractC5334Ns = (AbstractC5334Ns) this.valueOf.get(cls);
        if (abstractC5334Ns == null) {
            for (Map.Entry<java.lang.Class<?>, AbstractC5334Ns<?, ?>> entry : this.valueOf.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    abstractC5334Ns = (AbstractC5334Ns) entry.getValue();
                }
            }
        }
        return abstractC5334Ns == null ? (AbstractC5334Ns<?, T>) EZpvd : abstractC5334Ns;
    }

    public <X> AbstractC5461Sp<android.widget.ImageView, X> OLrzqt(@androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull java.lang.Class<X> cls) {
        return this.AhwBna.EZpvd(imageView, cls);
    }

    public Registry valueOf() {
        return this.values.OLrzqt();
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}

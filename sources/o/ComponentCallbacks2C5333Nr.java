package o;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import java.util.concurrent.CopyOnWriteArrayList;
import o.InterfaceC5432Rm;

/* JADX INFO: renamed from: o.Nr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class ComponentCallbacks2C5333Nr implements android.content.ComponentCallbacks2, InterfaceC5441Rv {
    public final android.content.Context AYXKKw;
    public final Glide AhwBna;
    public C5448Sc DbNXlk;
    public final java.lang.Runnable EZpvd;
    public final InterfaceC5432Rm KWHzl;
    public final CopyOnWriteArrayList<RY<java.lang.Object>> djBIcL;
    public final RI fetchVPNInfo;
    public boolean gEmmrt;
    public final RH isConnected;
    public final InterfaceC5444Ry valueOf;
    public final RF values;
    public static final C5448Sc OLrzqt = C5448Sc.KWHzl((java.lang.Class<?>) android.graphics.Bitmap.class).QVAiDq();
    public static final C5448Sc copydefault = C5448Sc.KWHzl((java.lang.Class<?>) QX.class).QVAiDq();
    public static final C5448Sc AEQbTJ = C5448Sc.OLrzqt(AbstractC5360Os.EZpvd).OLrzqt(Priority.LOW).copydefault(true);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<RY<java.lang.Object>> OLrzqt() {
        return this.djBIcL;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    public ComponentCallbacks2C5333Nr(@androidx.annotation.NonNull Glide glide, @androidx.annotation.NonNull InterfaceC5444Ry interfaceC5444Ry, @androidx.annotation.NonNull RH rh, @androidx.annotation.NonNull android.content.Context context) {
        this(glide, interfaceC5444Ry, rh, new RF(), glide.EZpvd(), context);
    }

    public ComponentCallbacks2C5333Nr(Glide glide, InterfaceC5444Ry interfaceC5444Ry, RH rh, RF rf, InterfaceC5438Rs interfaceC5438Rs, android.content.Context context) {
        this.fetchVPNInfo = new RI();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.Nr.3
            @Override // java.lang.Runnable
            public void run() {
                ComponentCallbacks2C5333Nr componentCallbacks2C5333Nr = ComponentCallbacks2C5333Nr.this;
                componentCallbacks2C5333Nr.valueOf.AEQbTJ(componentCallbacks2C5333Nr);
            }
        };
        this.EZpvd = runnable;
        this.AhwBna = glide;
        this.valueOf = interfaceC5444Ry;
        this.isConnected = rh;
        this.values = rf;
        this.AYXKKw = context;
        InterfaceC5432Rm interfaceC5432RmEZpvd = interfaceC5438Rs.EZpvd(context.getApplicationContext(), new ActionBar(rf));
        this.KWHzl = interfaceC5432RmEZpvd;
        glide.OLrzqt(this);
        if (SI.EZpvd()) {
            SI.copydefault(runnable);
        } else {
            interfaceC5444Ry.AEQbTJ(this);
        }
        interfaceC5444Ry.AEQbTJ(interfaceC5432RmEZpvd);
        this.djBIcL = new CopyOnWriteArrayList<>(glide.valueOf().KWHzl());
        KWHzl(glide.valueOf().AEQbTJ());
    }

    public void KWHzl(@androidx.annotation.NonNull C5448Sc c5448Sc) {
        synchronized (this) {
            this.DbNXlk = c5448Sc.copydefault().AhwBna();
        }
    }

    public boolean djBIcL() {
        boolean zCopydefault;
        synchronized (this) {
            zCopydefault = this.values.copydefault();
        }
        return zCopydefault;
    }

    public void AkhnZx() {
        synchronized (this) {
            this.values.AEQbTJ();
        }
    }

    public void DbNXlk() {
        synchronized (this) {
            this.values.OLrzqt();
        }
    }

    public void values() {
        synchronized (this) {
            DbNXlk();
            java.util.Iterator<ComponentCallbacks2C5333Nr> it = this.isConnected.copydefault().iterator();
            while (it.hasNext()) {
                it.next().DbNXlk();
            }
        }
    }

    public void fetchVPNInfo() {
        synchronized (this) {
            this.values.valueOf();
        }
    }

    @Override // o.InterfaceC5441Rv
    public void AYXKKw() {
        synchronized (this) {
            fetchVPNInfo();
            this.fetchVPNInfo.AYXKKw();
        }
    }

    @Override // o.InterfaceC5441Rv
    public void AhwBna() {
        synchronized (this) {
            AkhnZx();
            this.fetchVPNInfo.AhwBna();
        }
    }

    @Override // o.InterfaceC5441Rv
    public void valueOf() {
        synchronized (this) {
            this.fetchVPNInfo.valueOf();
            java.util.Iterator<InterfaceC5462Sq<?>> it = this.fetchVPNInfo.KWHzl().iterator();
            while (it.hasNext()) {
                EZpvd(it.next());
            }
            this.fetchVPNInfo.AEQbTJ();
            this.values.EZpvd();
            this.valueOf.copydefault(this);
            this.valueOf.copydefault(this.KWHzl);
            SI.KWHzl(this.EZpvd);
            this.AhwBna.EZpvd(this);
        }
    }

    public C5335Nt<android.graphics.Bitmap> EZpvd() {
        return KWHzl(android.graphics.Bitmap.class).OLrzqt((RX<?>) OLrzqt);
    }

    public C5335Nt<QX> copydefault() {
        return KWHzl(QX.class).OLrzqt((RX<?>) copydefault);
    }

    public C5335Nt<android.graphics.drawable.Drawable> AEQbTJ() {
        return KWHzl(android.graphics.drawable.Drawable.class);
    }

    public C5335Nt<android.graphics.drawable.Drawable> copydefault(@androidx.annotation.Nullable android.graphics.Bitmap bitmap) {
        return AEQbTJ().AEQbTJ(bitmap);
    }

    public C5335Nt<android.graphics.drawable.Drawable> AEQbTJ(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        return AEQbTJ().copydefault(drawable);
    }

    public C5335Nt<android.graphics.drawable.Drawable> EZpvd(@androidx.annotation.Nullable java.lang.String str) {
        return AEQbTJ().copydefault(str);
    }

    public C5335Nt<android.graphics.drawable.Drawable> EZpvd(@androidx.annotation.Nullable android.net.Uri uri) {
        return AEQbTJ().EZpvd(uri);
    }

    public C5335Nt<android.graphics.drawable.Drawable> OLrzqt(@androidx.annotation.Nullable java.io.File file) {
        return AEQbTJ().AEQbTJ(file);
    }

    public C5335Nt<android.graphics.drawable.Drawable> OLrzqt(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer num) {
        return AEQbTJ().EZpvd(num);
    }

    public C5335Nt<android.graphics.drawable.Drawable> KWHzl(@androidx.annotation.Nullable byte[] bArr) {
        return AEQbTJ().EZpvd(bArr);
    }

    public C5335Nt<android.graphics.drawable.Drawable> KWHzl(@androidx.annotation.Nullable java.lang.Object obj) {
        return AEQbTJ().copydefault(obj);
    }

    public C5335Nt<java.io.File> KWHzl() {
        return KWHzl(java.io.File.class).OLrzqt((RX<?>) AEQbTJ);
    }

    public C5335Nt<java.io.File> EZpvd(@androidx.annotation.Nullable java.lang.Object obj) {
        return KWHzl().copydefault(obj);
    }

    public <ResourceType> C5335Nt<ResourceType> KWHzl(@androidx.annotation.NonNull java.lang.Class<ResourceType> cls) {
        return new C5335Nt<>(this.AhwBna, this, cls, this.AYXKKw);
    }

    public void AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        EZpvd((InterfaceC5462Sq<?>) new Application(view));
    }

    public void EZpvd(@androidx.annotation.Nullable InterfaceC5462Sq<?> interfaceC5462Sq) {
        if (interfaceC5462Sq == null) {
            return;
        }
        KWHzl(interfaceC5462Sq);
    }

    public final void KWHzl(@androidx.annotation.NonNull InterfaceC5462Sq<?> interfaceC5462Sq) {
        boolean zCopydefault = copydefault(interfaceC5462Sq);
        RV rvOLrzqt = interfaceC5462Sq.OLrzqt();
        if (zCopydefault || this.AhwBna.AEQbTJ(interfaceC5462Sq) || rvOLrzqt == null) {
            return;
        }
        interfaceC5462Sq.AEQbTJ((RV) null);
        rvOLrzqt.KWHzl();
    }

    public boolean copydefault(@androidx.annotation.NonNull InterfaceC5462Sq<?> interfaceC5462Sq) {
        synchronized (this) {
            RV rvOLrzqt = interfaceC5462Sq.OLrzqt();
            if (rvOLrzqt == null) {
                return true;
            }
            if (!this.values.AEQbTJ(rvOLrzqt)) {
                return false;
            }
            this.fetchVPNInfo.OLrzqt(interfaceC5462Sq);
            interfaceC5462Sq.AEQbTJ((RV) null);
            return true;
        }
    }

    public void KWHzl(@androidx.annotation.NonNull InterfaceC5462Sq<?> interfaceC5462Sq, @androidx.annotation.NonNull RV rv) {
        synchronized (this) {
            this.fetchVPNInfo.KWHzl(interfaceC5462Sq);
            this.values.KWHzl(rv);
        }
    }

    public C5448Sc gEmmrt() {
        C5448Sc c5448Sc;
        synchronized (this) {
            c5448Sc = this.DbNXlk;
        }
        return c5448Sc;
    }

    public <T> AbstractC5334Ns<?, T> copydefault(java.lang.Class<T> cls) {
        return this.AhwBna.valueOf().EZpvd(cls);
    }

    public java.lang.String toString() {
        java.lang.String str;
        synchronized (this) {
            str = super.toString() + "{tracker=" + this.values + ", treeNode=" + this.isConnected + "}";
        }
        return str;
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.gEmmrt) {
            values();
        }
    }

    /* JADX INFO: renamed from: o.Nr$ActionBar */
    public class ActionBar implements InterfaceC5432Rm.ActionBar {
        public final RF KWHzl;

        public ActionBar(@androidx.annotation.NonNull RF rf) {
            this.KWHzl = rf;
        }

        @Override // o.InterfaceC5432Rm.ActionBar
        public void KWHzl(boolean z) {
            if (z) {
                synchronized (ComponentCallbacks2C5333Nr.this) {
                    this.KWHzl.KWHzl();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.Nr$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static class Application extends AbstractC5450Se<android.view.View, java.lang.Object> {
        @Override // o.InterfaceC5462Sq
        public void AEQbTJ(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        }

        @Override // o.AbstractC5450Se
        public void OLrzqt(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        }

        @Override // o.InterfaceC5462Sq
        public void copydefault(@androidx.annotation.NonNull java.lang.Object obj, @androidx.annotation.Nullable InterfaceC5460So<? super java.lang.Object> interfaceC5460So) {
        }

        public Application(@androidx.annotation.NonNull android.view.View view) {
            super(view);
        }
    }
}

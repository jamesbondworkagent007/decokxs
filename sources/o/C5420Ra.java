package o;

import android.os.Handler;
import com.bumptech.glide.Glide;

/* JADX INFO: renamed from: o.Ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5420Ra {
    public final java.util.List<StateListAnimator> AEQbTJ;
    public int AYXKKw;
    public boolean AhwBna;
    public Application AkhnZx;
    public boolean DbNXlk;
    public android.graphics.Bitmap EZpvd;
    public int KWHzl;
    public Application OLrzqt;
    public final OG copydefault;
    public final android.os.Handler djBIcL;
    public NN<android.graphics.Bitmap> ejfBZ;
    public final ComponentCallbacks2C5333Nr fARcdN;
    public int fIwbmz;
    public boolean fJNWhG;
    public Application fetchVPNInfo;
    public final InterfaceC5341Nz gEmmrt;
    public C5335Nt<android.graphics.Bitmap> isConnected;
    public boolean valueOf;
    public Activity values;

    /* JADX INFO: renamed from: o.Ra$Activity */
    public interface Activity {
        void AEQbTJ();
    }

    /* JADX INFO: renamed from: o.Ra$StateListAnimator */
    public interface StateListAnimator {
        void AYXKKw();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void DbNXlk() {
        this.DbNXlk = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int gEmmrt() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.graphics.Bitmap valueOf() {
        return this.EZpvd;
    }

    public C5420Ra(Glide glide, InterfaceC5341Nz interfaceC5341Nz, int i, int i2, NN<android.graphics.Bitmap> nn, android.graphics.Bitmap bitmap) {
        this(glide.OLrzqt(), Glide.AEQbTJ(glide.KWHzl()), interfaceC5341Nz, null, KWHzl(Glide.AEQbTJ(glide.KWHzl()), i, i2), nn, bitmap);
    }

    public C5420Ra(OG og, ComponentCallbacks2C5333Nr componentCallbacks2C5333Nr, InterfaceC5341Nz interfaceC5341Nz, android.os.Handler handler, C5335Nt<android.graphics.Bitmap> c5335Nt, NN<android.graphics.Bitmap> nn, android.graphics.Bitmap bitmap) {
        this.AEQbTJ = new java.util.ArrayList();
        this.fARcdN = componentCallbacks2C5333Nr;
        handler = handler == null ? new android.os.Handler(android.os.Looper.getMainLooper(), new TaskDescription()) : handler;
        this.copydefault = og;
        this.djBIcL = handler;
        this.isConnected = c5335Nt;
        this.gEmmrt = interfaceC5341Nz;
        OLrzqt(nn, bitmap);
    }

    public void OLrzqt(NN<android.graphics.Bitmap> nn, android.graphics.Bitmap bitmap) {
        this.ejfBZ = (NN) SE.OLrzqt(nn);
        this.EZpvd = (android.graphics.Bitmap) SE.OLrzqt(bitmap);
        this.isConnected = this.isConnected.OLrzqt((RX<?>) new C5448Sc().EZpvd(nn));
        this.KWHzl = SI.KWHzl(bitmap);
        this.fIwbmz = bitmap.getWidth();
        this.AYXKKw = bitmap.getHeight();
    }

    public void EZpvd(StateListAnimator stateListAnimator) {
        if (this.AhwBna) {
            throw new java.lang.IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.AEQbTJ.contains(stateListAnimator)) {
            throw new java.lang.IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.AEQbTJ.isEmpty();
        this.AEQbTJ.add(stateListAnimator);
        if (zIsEmpty) {
            isConnected();
        }
    }

    public void KWHzl(StateListAnimator stateListAnimator) {
        this.AEQbTJ.remove(stateListAnimator);
        if (this.AEQbTJ.isEmpty()) {
            DbNXlk();
        }
    }

    public int AYXKKw() {
        return this.gEmmrt.EZpvd() + this.KWHzl;
    }

    public int EZpvd() {
        Application application = this.OLrzqt;
        if (application != null) {
            return application.AEQbTJ;
        }
        return -1;
    }

    public java.nio.ByteBuffer AEQbTJ() {
        return this.gEmmrt.copydefault().asReadOnlyBuffer();
    }

    public int AhwBna() {
        return this.gEmmrt.gEmmrt();
    }

    public final void isConnected() {
        if (this.DbNXlk) {
            return;
        }
        this.DbNXlk = true;
        this.AhwBna = false;
        fetchVPNInfo();
    }

    public void KWHzl() {
        this.AEQbTJ.clear();
        AkhnZx();
        DbNXlk();
        Application application = this.OLrzqt;
        if (application != null) {
            this.fARcdN.EZpvd((InterfaceC5462Sq<?>) application);
            this.OLrzqt = null;
        }
        Application application2 = this.fetchVPNInfo;
        if (application2 != null) {
            this.fARcdN.EZpvd((InterfaceC5462Sq<?>) application2);
            this.fetchVPNInfo = null;
        }
        Application application3 = this.AkhnZx;
        if (application3 != null) {
            this.fARcdN.EZpvd((InterfaceC5462Sq<?>) application3);
            this.AkhnZx = null;
        }
        this.gEmmrt.KWHzl();
        this.AhwBna = true;
    }

    public android.graphics.Bitmap OLrzqt() {
        Application application = this.OLrzqt;
        return application != null ? application.EZpvd() : this.EZpvd;
    }

    public final void fetchVPNInfo() {
        if (!this.DbNXlk || this.valueOf) {
            return;
        }
        if (this.fJNWhG) {
            SE.copydefault(this.AkhnZx == null, "Pending target must be null when starting from the first frame");
            this.gEmmrt.djBIcL();
            this.fJNWhG = false;
        }
        Application application = this.AkhnZx;
        if (application != null) {
            this.AkhnZx = null;
            AEQbTJ(application);
            return;
        }
        this.valueOf = true;
        int iAhwBna = this.gEmmrt.AhwBna();
        this.gEmmrt.OLrzqt();
        this.fetchVPNInfo = new Application(this.djBIcL, this.gEmmrt.AEQbTJ(), android.os.SystemClock.uptimeMillis() + ((long) iAhwBna));
        this.isConnected.OLrzqt((RX<?>) C5448Sc.KWHzl(copydefault())).copydefault(this.gEmmrt).OLrzqt(this.fetchVPNInfo);
    }

    public final void AkhnZx() {
        android.graphics.Bitmap bitmap = this.EZpvd;
        if (bitmap != null) {
            this.copydefault.copydefault(bitmap);
            this.EZpvd = null;
        }
    }

    public void AEQbTJ(Application application) {
        Activity activity = this.values;
        if (activity != null) {
            activity.AEQbTJ();
        }
        this.valueOf = false;
        if (this.AhwBna) {
            this.djBIcL.obtainMessage(2, application).sendToTarget();
            return;
        }
        if (!this.DbNXlk) {
            if (this.fJNWhG) {
                this.djBIcL.obtainMessage(2, application).sendToTarget();
                return;
            } else {
                this.AkhnZx = application;
                return;
            }
        }
        if (application.EZpvd() != null) {
            AkhnZx();
            Application application2 = this.OLrzqt;
            this.OLrzqt = application;
            for (int size = this.AEQbTJ.size() - 1; size >= 0; size--) {
                this.AEQbTJ.get(size).AYXKKw();
            }
            if (application2 != null) {
                this.djBIcL.obtainMessage(2, application2).sendToTarget();
            }
        }
        fetchVPNInfo();
    }

    /* JADX INFO: renamed from: o.Ra$TaskDescription */
    public class TaskDescription implements Handler.Callback {
        public TaskDescription() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            int i = message.what;
            if (i == 1) {
                C5420Ra.this.AEQbTJ((Application) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            C5420Ra.this.fARcdN.EZpvd((InterfaceC5462Sq<?>) message.obj);
            return false;
        }
    }

    /* JADX INFO: renamed from: o.Ra$Application */
    public static class Application extends AbstractC5449Sd<android.graphics.Bitmap> {
        public final int AEQbTJ;
        public android.graphics.Bitmap KWHzl;
        public final android.os.Handler OLrzqt;
        public final long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public android.graphics.Bitmap EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC5462Sq
        public void a_(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
            this.KWHzl = null;
        }

        public Application(android.os.Handler handler, int i, long j) {
            this.OLrzqt = handler;
            this.AEQbTJ = i;
            this.copydefault = j;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void copydefault(@androidx.annotation.NonNull android.graphics.Bitmap bitmap, @androidx.annotation.Nullable InterfaceC5460So<? super android.graphics.Bitmap> interfaceC5460So) {
            this.KWHzl = bitmap;
            this.OLrzqt.sendMessageAtTime(this.OLrzqt.obtainMessage(1, this), this.copydefault);
        }
    }

    public static C5335Nt<android.graphics.Bitmap> KWHzl(ComponentCallbacks2C5333Nr componentCallbacks2C5333Nr, int i, int i2) {
        return componentCallbacks2C5333Nr.EZpvd().OLrzqt((RX<?>) C5448Sc.OLrzqt(AbstractC5360Os.KWHzl).KWHzl(true).copydefault(true).copydefault(i, i2));
    }

    public static NH copydefault() {
        return new C5465St(java.lang.Double.valueOf(java.lang.Math.random()));
    }
}

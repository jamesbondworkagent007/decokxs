package o;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class OR implements OG {
    public static final Bitmap.Config AEQbTJ = Bitmap.Config.ARGB_8888;
    public final OS AYXKKw;
    public int AhwBna;
    public final java.util.Set<Bitmap.Config> EZpvd;
    public int KWHzl;
    public long OLrzqt;
    public int copydefault;
    public int djBIcL;
    public final long gEmmrt;
    public final TaskDescription isConnected;
    public long valueOf;

    public static final class Activity implements TaskDescription {
        @Override // o.OR.TaskDescription
        public void AEQbTJ(android.graphics.Bitmap bitmap) {
        }

        @Override // o.OR.TaskDescription
        public void EZpvd(android.graphics.Bitmap bitmap) {
        }
    }

    public interface TaskDescription {
        void AEQbTJ(android.graphics.Bitmap bitmap);

        void EZpvd(android.graphics.Bitmap bitmap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long djBIcL() {
        return this.valueOf;
    }

    public OR(long j, OS os, java.util.Set<Bitmap.Config> set) {
        this.gEmmrt = j;
        this.valueOf = j;
        this.AYXKKw = os;
        this.EZpvd = set;
        this.isConnected = new Activity();
    }

    public OR(long j) {
        this(j, OLrzqt(), copydefault());
    }

    @Override // o.OG
    public void copydefault(android.graphics.Bitmap bitmap) {
        synchronized (this) {
            if (bitmap == null) {
                throw new java.lang.NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new java.lang.IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.AYXKKw.AEQbTJ(bitmap) <= this.valueOf && this.EZpvd.contains(bitmap.getConfig())) {
                int iAEQbTJ = this.AYXKKw.AEQbTJ(bitmap);
                this.AYXKKw.KWHzl(bitmap);
                this.isConnected.EZpvd(bitmap);
                this.AhwBna++;
                this.OLrzqt += (long) iAEQbTJ;
                if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
                    this.AYXKKw.OLrzqt(bitmap);
                }
                KWHzl();
                valueOf();
                return;
            }
            if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
                this.AYXKKw.OLrzqt(bitmap);
                bitmap.isMutable();
                this.EZpvd.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        }
    }

    public final void valueOf() {
        OLrzqt(this.valueOf);
    }

    @Override // o.OG
    public android.graphics.Bitmap copydefault(int i, int i2, Bitmap.Config config) {
        android.graphics.Bitmap bitmapEZpvd = EZpvd(i, i2, config);
        if (bitmapEZpvd != null) {
            bitmapEZpvd.eraseColor(0);
            return bitmapEZpvd;
        }
        return OLrzqt(i, i2, config);
    }

    @Override // o.OG
    public android.graphics.Bitmap KWHzl(int i, int i2, Bitmap.Config config) {
        android.graphics.Bitmap bitmapEZpvd = EZpvd(i, i2, config);
        return bitmapEZpvd == null ? OLrzqt(i, i2, config) : bitmapEZpvd;
    }

    public static android.graphics.Bitmap OLrzqt(int i, int i2, @androidx.annotation.Nullable Bitmap.Config config) {
        if (config == null) {
            config = AEQbTJ;
        }
        return android.graphics.Bitmap.createBitmap(i, i2, config);
    }

    public static void copydefault(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new java.lang.IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    public final android.graphics.Bitmap EZpvd(int i, int i2, @androidx.annotation.Nullable Bitmap.Config config) {
        android.graphics.Bitmap bitmapKWHzl;
        synchronized (this) {
            copydefault(config);
            bitmapKWHzl = this.AYXKKw.KWHzl(i, i2, config != null ? config : AEQbTJ);
            if (bitmapKWHzl == null) {
                if (android.util.Log.isLoggable("LruBitmapPool", 3)) {
                    this.AYXKKw.copydefault(i, i2, config);
                }
                this.djBIcL++;
            } else {
                this.KWHzl++;
                this.OLrzqt -= (long) this.AYXKKw.AEQbTJ(bitmapKWHzl);
                this.isConnected.AEQbTJ(bitmapKWHzl);
                KWHzl(bitmapKWHzl);
            }
            if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
                this.AYXKKw.copydefault(i, i2, config);
            }
            KWHzl();
        }
        return bitmapKWHzl;
    }

    public static void KWHzl(android.graphics.Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        OLrzqt(bitmap);
    }

    public static void OLrzqt(android.graphics.Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    @Override // o.OG
    public void AEQbTJ() {
        OLrzqt(0L);
    }

    @Override // o.OG
    public void KWHzl(int i) {
        android.util.Log.isLoggable("LruBitmapPool", 3);
        if (i >= 40 || i >= 20) {
            AEQbTJ();
        } else if (i >= 20 || i == 15) {
            OLrzqt(djBIcL() / 2);
        }
    }

    public final void OLrzqt(long j) {
        synchronized (this) {
            while (this.OLrzqt > j) {
                android.graphics.Bitmap bitmapCopydefault = this.AYXKKw.copydefault();
                if (bitmapCopydefault == null) {
                    if (android.util.Log.isLoggable("LruBitmapPool", 5)) {
                        EZpvd();
                    }
                    this.OLrzqt = 0L;
                    return;
                } else {
                    this.isConnected.AEQbTJ(bitmapCopydefault);
                    this.OLrzqt -= (long) this.AYXKKw.AEQbTJ(bitmapCopydefault);
                    this.copydefault++;
                    if (android.util.Log.isLoggable("LruBitmapPool", 3)) {
                        this.AYXKKw.OLrzqt(bitmapCopydefault);
                    }
                    KWHzl();
                    bitmapCopydefault.recycle();
                }
            }
        }
    }

    public final void KWHzl() {
        if (android.util.Log.isLoggable("LruBitmapPool", 2)) {
            EZpvd();
        }
    }

    public final void EZpvd() {
        Objects.toString(this.AYXKKw);
    }

    public static OS OLrzqt() {
        return new OQ();
    }

    public static java.util.Set<Bitmap.Config> copydefault() {
        java.util.HashSet hashSet = new java.util.HashSet(java.util.Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }
}

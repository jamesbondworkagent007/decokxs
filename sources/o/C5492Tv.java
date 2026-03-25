package o;

import android.graphics.RectF;
import androidx.camera.video.AudioStats;
import androidx.core.view.ViewCompat;
import o.C5496Tz;

/* JADX INFO: renamed from: o.Tv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5492Tv {
    public long fARcdN;
    public final float[] values = new float[4];
    public final int[] AhwBna = new int[4];
    public final RectF KWHzl = new RectF();
    public int gEmmrt = 0;
    public int isConnected = -1;
    public int OLrzqt = 1291845631;
    public int ejfBZ = 0;
    public int fetchVPNInfo = 0;
    public int AYXKKw = 0;
    public float getFieldNames = 1.0f;
    public float DbNXlk = 1.0f;
    public float AkhnZx = 0.0f;
    public float valueOf = 0.5f;
    public float fIwbmz = 20.0f;
    public boolean djBIcL = true;
    public boolean AEQbTJ = true;
    public boolean EZpvd = true;
    public int fJNWhG = -1;
    public int AuCTel = 1;
    public long copydefault = 1000;

    public int KWHzl(int i) {
        int i2 = this.fetchVPNInfo;
        return i2 > 0 ? i2 : java.lang.Math.round(this.getFieldNames * i);
    }

    public int EZpvd(int i) {
        int i2 = this.AYXKKw;
        return i2 > 0 ? i2 : java.lang.Math.round(this.DbNXlk * i);
    }

    public void OLrzqt() {
        if (this.ejfBZ != 1) {
            int[] iArr = this.AhwBna;
            int i = this.OLrzqt;
            iArr[0] = i;
            int i2 = this.isConnected;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
            return;
        }
        int[] iArr2 = this.AhwBna;
        int i3 = this.isConnected;
        iArr2[0] = i3;
        iArr2[1] = i3;
        int i4 = this.OLrzqt;
        iArr2[2] = i4;
        iArr2[3] = i4;
    }

    public void KWHzl() {
        if (this.ejfBZ != 1) {
            this.values[0] = java.lang.Math.max(((1.0f - this.AkhnZx) - this.valueOf) / 2.0f, 0.0f);
            this.values[1] = java.lang.Math.max(((1.0f - this.AkhnZx) - 0.001f) / 2.0f, 0.0f);
            this.values[2] = java.lang.Math.min(((this.AkhnZx + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.values[3] = java.lang.Math.min(((this.AkhnZx + 1.0f) + this.valueOf) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.values;
        fArr[0] = 0.0f;
        fArr[1] = java.lang.Math.min(this.AkhnZx, 1.0f);
        this.values[2] = java.lang.Math.min(this.AkhnZx + this.valueOf, 1.0f);
        this.values[3] = 1.0f;
    }

    /* JADX INFO: renamed from: o.Tv$TaskDescription */
    public static abstract class TaskDescription<T extends TaskDescription<T>> {
        public final C5492Tv EZpvd = new C5492Tv();

        public abstract T KWHzl();

        public T EZpvd(android.content.res.TypedArray typedArray) {
            if (typedArray.hasValue(C5496Tz.ActionBar.OLrzqt)) {
                KWHzl(typedArray.getBoolean(C5496Tz.ActionBar.OLrzqt, this.EZpvd.djBIcL));
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.copydefault)) {
                AEQbTJ(typedArray.getBoolean(C5496Tz.ActionBar.copydefault, this.EZpvd.AEQbTJ));
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.EZpvd)) {
                EZpvd(typedArray.getFloat(C5496Tz.ActionBar.EZpvd, 0.3f));
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.AkhnZx)) {
                AEQbTJ(typedArray.getFloat(C5496Tz.ActionBar.AkhnZx, 1.0f));
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.AhwBna)) {
                copydefault(typedArray.getInt(C5496Tz.ActionBar.AhwBna, (int) this.EZpvd.copydefault));
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.fJNWhG)) {
                AEQbTJ(typedArray.getInt(C5496Tz.ActionBar.fJNWhG, this.EZpvd.fJNWhG));
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.ejfBZ)) {
                OLrzqt(typedArray.getInt(C5496Tz.ActionBar.ejfBZ, (int) this.EZpvd.fARcdN));
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.fARcdN)) {
                OLrzqt(typedArray.getInt(C5496Tz.ActionBar.fARcdN, this.EZpvd.AuCTel));
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.gEmmrt)) {
                int i = typedArray.getInt(C5496Tz.ActionBar.gEmmrt, this.EZpvd.gEmmrt);
                if (i == 1) {
                    KWHzl(1);
                } else if (i == 2) {
                    KWHzl(2);
                } else if (i != 3) {
                    KWHzl(0);
                } else {
                    KWHzl(3);
                }
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.AuCTel)) {
                if (typedArray.getInt(C5496Tz.ActionBar.AuCTel, this.EZpvd.ejfBZ) != 1) {
                    AhwBna(0);
                } else {
                    AhwBna(1);
                }
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.valueOf)) {
                copydefault(typedArray.getFloat(C5496Tz.ActionBar.valueOf, this.EZpvd.valueOf));
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.isConnected)) {
                EZpvd(typedArray.getDimensionPixelSize(C5496Tz.ActionBar.isConnected, this.EZpvd.fetchVPNInfo));
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.djBIcL)) {
                copydefault(typedArray.getDimensionPixelSize(C5496Tz.ActionBar.djBIcL, this.EZpvd.AYXKKw));
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.fetchVPNInfo)) {
                KWHzl(typedArray.getFloat(C5496Tz.ActionBar.fetchVPNInfo, this.EZpvd.AkhnZx));
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.getNewProxyInstance)) {
                valueOf(typedArray.getFloat(C5496Tz.ActionBar.getNewProxyInstance, this.EZpvd.getFieldNames));
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.DbNXlk)) {
                OLrzqt(typedArray.getFloat(C5496Tz.ActionBar.DbNXlk, this.EZpvd.DbNXlk));
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.fIwbmz)) {
                AhwBna(typedArray.getFloat(C5496Tz.ActionBar.fIwbmz, this.EZpvd.fIwbmz));
            }
            return (T) KWHzl();
        }

        public T KWHzl(int i) {
            this.EZpvd.gEmmrt = i;
            return (T) KWHzl();
        }

        public T AhwBna(int i) {
            this.EZpvd.ejfBZ = i;
            return (T) KWHzl();
        }

        public T EZpvd(@androidx.annotation.Px int i) {
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("Given invalid width: " + i);
            }
            this.EZpvd.fetchVPNInfo = i;
            return (T) KWHzl();
        }

        public T copydefault(@androidx.annotation.Px int i) {
            if (i < 0) {
                throw new java.lang.IllegalArgumentException("Given invalid height: " + i);
            }
            this.EZpvd.AYXKKw = i;
            return (T) KWHzl();
        }

        public T valueOf(float f) {
            if (f < 0.0f) {
                throw new java.lang.IllegalArgumentException("Given invalid width ratio: " + f);
            }
            this.EZpvd.getFieldNames = f;
            return (T) KWHzl();
        }

        public T OLrzqt(float f) {
            if (f < 0.0f) {
                throw new java.lang.IllegalArgumentException("Given invalid height ratio: " + f);
            }
            this.EZpvd.DbNXlk = f;
            return (T) KWHzl();
        }

        public T KWHzl(float f) {
            if (f < 0.0f) {
                throw new java.lang.IllegalArgumentException("Given invalid intensity value: " + f);
            }
            this.EZpvd.AkhnZx = f;
            return (T) KWHzl();
        }

        public T copydefault(float f) {
            if (f < 0.0f) {
                throw new java.lang.IllegalArgumentException("Given invalid dropoff value: " + f);
            }
            this.EZpvd.valueOf = f;
            return (T) KWHzl();
        }

        public T AhwBna(float f) {
            this.EZpvd.fIwbmz = f;
            return (T) KWHzl();
        }

        public T EZpvd(@androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
            int iEZpvd = (int) (EZpvd(0.0f, 1.0f, f) * 255.0f);
            C5492Tv c5492Tv = this.EZpvd;
            c5492Tv.OLrzqt = (iEZpvd << 24) | (c5492Tv.OLrzqt & 16777215);
            return (T) KWHzl();
        }

        public T AEQbTJ(@androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
            int iEZpvd = (int) (EZpvd(0.0f, 1.0f, f) * 255.0f);
            C5492Tv c5492Tv = this.EZpvd;
            c5492Tv.isConnected = (iEZpvd << 24) | (c5492Tv.isConnected & 16777215);
            return (T) KWHzl();
        }

        public T KWHzl(boolean z) {
            this.EZpvd.djBIcL = z;
            return (T) KWHzl();
        }

        public T AEQbTJ(boolean z) {
            this.EZpvd.AEQbTJ = z;
            return (T) KWHzl();
        }

        public T AEQbTJ(int i) {
            this.EZpvd.fJNWhG = i;
            return (T) KWHzl();
        }

        public T OLrzqt(int i) {
            this.EZpvd.AuCTel = i;
            return (T) KWHzl();
        }

        public T OLrzqt(long j) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("Given a negative repeat delay: " + j);
            }
            this.EZpvd.fARcdN = j;
            return (T) KWHzl();
        }

        public T copydefault(long j) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException("Given a negative duration: " + j);
            }
            this.EZpvd.copydefault = j;
            return (T) KWHzl();
        }

        public C5492Tv copydefault() {
            this.EZpvd.OLrzqt();
            this.EZpvd.KWHzl();
            return this.EZpvd;
        }

        public static float EZpvd(float f, float f2, float f3) {
            return java.lang.Math.min(f2, java.lang.Math.max(f, f3));
        }
    }

    /* JADX INFO: renamed from: o.Tv$StateListAnimator */
    public static class StateListAnimator extends TaskDescription<StateListAnimator> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/Tv$TaskDescription; */
        @Override // o.C5492Tv.TaskDescription
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public StateListAnimator KWHzl() {
            return this;
        }

        public StateListAnimator() {
            this.EZpvd.EZpvd = true;
        }
    }

    /* JADX INFO: renamed from: o.Tv$Activity */
    public static class Activity extends TaskDescription<Activity> {
        /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/Tv$TaskDescription; */
        @Override // o.C5492Tv.TaskDescription
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Activity KWHzl() {
            return this;
        }

        public Activity() {
            this.EZpvd.EZpvd = false;
        }

        public Activity AYXKKw(@androidx.annotation.ColorInt int i) {
            this.EZpvd.isConnected = i;
            return KWHzl();
        }

        public Activity djBIcL(@androidx.annotation.ColorInt int i) {
            C5492Tv c5492Tv = this.EZpvd;
            c5492Tv.OLrzqt = (i & 16777215) | (c5492Tv.OLrzqt & ViewCompat.MEASURED_STATE_MASK);
            return KWHzl();
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroid/content/res/TypedArray;)Lo/Tv$TaskDescription; */
        @Override // o.C5492Tv.TaskDescription
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public Activity EZpvd(android.content.res.TypedArray typedArray) {
            super.EZpvd(typedArray);
            if (typedArray.hasValue(C5496Tz.ActionBar.AEQbTJ)) {
                djBIcL(typedArray.getColor(C5496Tz.ActionBar.AEQbTJ, this.EZpvd.OLrzqt));
            }
            if (typedArray.hasValue(C5496Tz.ActionBar.values)) {
                AYXKKw(typedArray.getColor(C5496Tz.ActionBar.values, this.EZpvd.isConnected));
            }
            return KWHzl();
        }
    }
}

package o;

/* JADX INFO: renamed from: o.hrr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC23102hrr {
    public boolean AEQbTJ = true;
    public long AYXKKw;
    public final long KWHzl;
    public android.os.CountDownTimer OLrzqt;
    public final long copydefault;

    public abstract void AEQbTJ(long j);

    public abstract void copydefault();

    public AbstractC23102hrr(long j, long j2) {
        this.KWHzl = j;
        this.copydefault = j2;
        this.AYXKKw = j;
    }

    /* JADX INFO: renamed from: o.hrr$ActionBar */
    public static final class ActionBar extends android.os.CountDownTimer {
        public final /* synthetic */ AbstractC23102hrr KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(long j, AbstractC23102hrr abstractC23102hrr, long j2) {
            super(j, j2);
            this.KWHzl = abstractC23102hrr;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            this.KWHzl.AYXKKw = j;
            this.KWHzl.AEQbTJ(j);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            this.KWHzl.copydefault();
        }
    }

    public final void copydefault(long j) {
        this.OLrzqt = new ActionBar(j, this, this.copydefault);
    }

    public final void EZpvd() {
        if (this.AEQbTJ) {
            copydefault(this.AYXKKw);
        } else {
            copydefault(this.KWHzl);
        }
        android.os.CountDownTimer countDownTimer = this.OLrzqt;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
        this.AEQbTJ = false;
    }

    public final void KWHzl() {
        android.os.CountDownTimer countDownTimer = this.OLrzqt;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.AEQbTJ = true;
    }

    public final void OLrzqt() {
        android.os.CountDownTimer countDownTimer = this.OLrzqt;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.OLrzqt = null;
        this.AEQbTJ = false;
    }
}

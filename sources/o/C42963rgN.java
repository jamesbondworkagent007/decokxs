package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rgN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42963rgN extends AppCompatTextView {
    public boolean AEQbTJ;
    public java.lang.String EZpvd;
    public android.os.CountDownTimer KWHzl;
    public long OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountDown(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountDownEvent(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountDownTimer(android.os.CountDownTimer countDownTimer) {
        this.KWHzl = countDownTimer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeadLine(long j) {
        this.OLrzqt = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42963rgN(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.rgP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42963rgN.copydefault(this.EZpvd);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42963rgN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.rgP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42963rgN.copydefault(this.EZpvd);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42963rgN(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.rgP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42963rgN.copydefault(this.EZpvd);
            }
        });
    }

    public static /* synthetic */ void setContent$default(C42963rgN c42963rgN, boolean z, long j, java.lang.CharSequence charSequence, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            charSequence = null;
        }
        c42963rgN.setContent(z, j, charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setContent(boolean z, long j, java.lang.CharSequence charSequence) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (z) {
            long j2 = j - jCurrentTimeMillis;
            if (j2 > 0) {
                this.OLrzqt = j;
                this.AEQbTJ = true;
                OLrzqt(j2);
            } else {
                android.os.CountDownTimer countDownTimer = this.KWHzl;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                setText(charSequence);
            }
        }
        this.AEQbTJ = z;
    }

    public final java.lang.String EZpvd() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String copydefault(C42963rgN c42963rgN) {
        return c42963rgN.getContext().getString(qZH.PendingIntent.RvdRAu);
    }

    public final java.lang.String copydefault(long j) {
        java.lang.String str;
        java.lang.String strValueOf;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        java.lang.String str2 = timeUnit.toDays(j) + EZpvd();
        long hours = timeUnit.toHours(j) % ((long) 24);
        java.lang.String str3 = "00:";
        if (hours == 0) {
            str = "00:";
        } else if (hours < 10) {
            str = "0" + hours + ":";
        } else {
            str = hours + ":";
        }
        long j2 = 60;
        long minutes = timeUnit.toMinutes(j) % j2;
        if (minutes != 0) {
            if (minutes < 10) {
                str3 = "0" + minutes + ":";
            } else {
                str3 = minutes + ":";
            }
        }
        long seconds = timeUnit.toSeconds(j) % j2;
        if (seconds == 0) {
            strValueOf = "00";
        } else if (seconds < 10) {
            strValueOf = "0" + seconds;
        } else {
            strValueOf = java.lang.String.valueOf(seconds);
        }
        return str2 + str + str3 + strValueOf;
    }

    public final void OLrzqt(long j) {
        if (j <= 0) {
            return;
        }
        android.os.CountDownTimer countDownTimer = this.KWHzl;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        setText(copydefault(this.OLrzqt - java.lang.System.currentTimeMillis()));
        this.KWHzl = new Activity(j, this);
        android.os.CountDownTimer countDownTimer2 = this.KWHzl;
        if (countDownTimer2 != null) {
            countDownTimer2.start();
        }
    }

    /* JADX INFO: renamed from: o.rgN$Activity */
    public static final class Activity extends android.os.CountDownTimer {
        public final /* synthetic */ C42963rgN OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(long j, C42963rgN c42963rgN) {
            super(j, 1000L);
            this.OLrzqt = c42963rgN;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            C42963rgN c42963rgN = this.OLrzqt;
            c42963rgN.setText(c42963rgN.copydefault(c42963rgN.copydefault() - java.lang.System.currentTimeMillis()));
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            C42963rgN c42963rgN = this.OLrzqt;
            c42963rgN.setText(c42963rgN.copydefault(c42963rgN.copydefault() - java.lang.System.currentTimeMillis()));
            java.lang.String strKWHzl = this.OLrzqt.KWHzl();
            if (strKWHzl != null) {
                RxBus.KWHzl(strKWHzl);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.AEQbTJ) {
            OLrzqt(this.OLrzqt - java.lang.System.currentTimeMillis());
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.os.CountDownTimer countDownTimer = this.KWHzl;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void AEQbTJ() {
        android.os.CountDownTimer countDownTimer = this.KWHzl;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        setContent(false, 0L, "");
    }
}

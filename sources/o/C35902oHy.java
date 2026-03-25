package o;

import androidx.core.content.res.ResourcesCompat;
import com.okinc.im.imui.messages.audio.call.model.CallStatus;
import com.okinc.im.widgets.audiocall.AbsOKIMMediaCallFloatingView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oHy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35902oHy extends AbsOKIMMediaCallFloatingView<nKQ> {
    public int AkhnZx;
    public int AuCTel;
    public final int ejfBZ;
    public int fARcdN;
    public int fIwbmz;
    public boolean fJNWhG;

    /* JADX INFO: renamed from: o.oHy$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CallStatus.values().length];
            try {
                iArr[CallStatus.DIALING_OUT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CallStatus.DIALING_IN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CallStatus.CONNECTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[CallStatus.NOT_ON_CALL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[CallStatus.DISCONNECTED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[CallStatus.ERROR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AkhnZx() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.widgets.audiocall.AbsOKIMMediaCallFloatingView
    public int copydefault() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int fetchVPNInfo() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isConnected() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.widgets.audiocall.AbsOKIMMediaCallFloatingView
    public void setDefaultWidth(int i) {
        this.AkhnZx = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.widgets.audiocall.AbsOKIMMediaCallFloatingView
    public void setLeftBg(int i) {
        this.fARcdN = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.widgets.audiocall.AbsOKIMMediaCallFloatingView
    public void setMoveBg(int i) {
        this.fIwbmz = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.im.widgets.audiocall.AbsOKIMMediaCallFloatingView
    public void setRightBg(int i) {
        this.AuCTel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int values() {
        return this.fIwbmz;
    }

    @Override // com.okinc.im.widgets.audiocall.AbsOKIMMediaCallFloatingView
    public void setViewAtRight(boolean z) {
        this.fJNWhG = z;
        if (z) {
            KWHzl().EZpvd.setBackground(getResources().getDrawable(fetchVPNInfo(), null));
        } else {
            KWHzl().EZpvd.setBackground(getResources().getDrawable(AkhnZx(), null));
        }
    }

    @Override // com.okinc.im.widgets.audiocall.AbsOKIMMediaCallFloatingView
    public void setCountingTimeText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl().KWHzl(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35902oHy(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35902oHy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35902oHy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AkhnZx = 84;
        this.ejfBZ = C35399nuc.Dialog.DGOPHZDGOPHZ;
        this.fARcdN = C35399nuc.ActionBar.djBIcL;
        this.AuCTel = C35399nuc.ActionBar.valueOf;
        this.fIwbmz = C35399nuc.ActionBar.gEmmrt;
        valueOf();
    }

    @Override // com.okinc.im.widgets.audiocall.AbsOKIMMediaCallFloatingView
    public void valueOf() {
        super.valueOf();
        setViewAtRight(false);
        KWHzl().copydefault(true);
        KWHzl().KWHzl(getResources().getString(C35399nuc.LoaderManager.apNbdB));
        fJNWhG();
    }

    public void KWHzl(@NotNull CallStatus callStatus, long j) {
        Intrinsics.checkNotNullParameter(callStatus, "");
        switch (StateListAnimator.KWHzl[callStatus.ordinal()]) {
            case 1:
                KWHzl().copydefault(true);
                KWHzl().KWHzl(getResources().getString(C35399nuc.LoaderManager.apNbdB));
                return;
            case 2:
                KWHzl().copydefault(true);
                KWHzl().KWHzl(getResources().getString(C35399nuc.LoaderManager.fXHmeK));
                return;
            case 3:
                KWHzl().copydefault(true);
                setCountTime(java.lang.Long.valueOf(j));
                return;
            case 4:
            case 5:
            case 6:
                DbNXlk();
                KWHzl().copydefault(false);
                KWHzl().KWHzl(getResources().getString(C35399nuc.LoaderManager.sJqpAA));
                postDelayed(new java.lang.Runnable() { // from class: o.oHw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C35902oHy.EZpvd(this.KWHzl);
                    }
                }, 500L);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void EZpvd(C35902oHy c35902oHy) {
        c35902oHy.OLrzqt();
    }

    @Override // com.okinc.im.widgets.audiocall.AbsOKIMMediaCallFloatingView
    public void EZpvd() {
        KWHzl().EZpvd.setBackground(getResources().getDrawable(values(), null));
    }

    public void fJNWhG() {
        int iEZpvd = C33492mxV.EZpvd();
        if (iEZpvd == -1 || iEZpvd == 1) {
            setLeftBg(C35399nuc.ActionBar.djBIcL);
            setRightBg(C35399nuc.ActionBar.valueOf);
            setMoveBg(C35399nuc.ActionBar.gEmmrt);
            if (KWHzl().AEQbTJ()) {
                KWHzl().KWHzl.setTextColor(ResourcesCompat.getColor(getResources(), C52761wXj.Activity.DcMfJKdMCrTj, null));
                android.widget.ImageView imageView = KWHzl().OLrzqt;
                imageView.setImageResource(C52761wXj.TaskDescription.dHguZz);
                imageView.setColorFilter(C33070mpX.copydefault(C52761wXj.Activity.DcMfJKdMCrTj));
            } else {
                KWHzl().KWHzl.setTextColor(ResourcesCompat.getColor(getResources(), C32113mPz.ActionBar.zsXlph, null));
                android.widget.ImageView imageView2 = KWHzl().OLrzqt;
                imageView2.setImageResource(C52761wXj.TaskDescription.dHguZz);
                imageView2.setColorFilter(C33070mpX.copydefault(C32113mPz.ActionBar.zsXlph));
            }
        } else if (iEZpvd == 2) {
            setLeftBg(C35399nuc.ActionBar.djBIcL);
            setRightBg(C35399nuc.ActionBar.valueOf);
            setMoveBg(C35399nuc.ActionBar.gEmmrt);
            if (KWHzl().AEQbTJ()) {
                KWHzl().KWHzl.setTextColor(ResourcesCompat.getColor(getResources(), C52761wXj.Activity.DcMfJKRKUgwx, null));
                android.widget.ImageView imageView3 = KWHzl().OLrzqt;
                imageView3.setImageResource(C52761wXj.TaskDescription.dHguZz);
                imageView3.setColorFilter(C33070mpX.copydefault(C52761wXj.Activity.DcMfJKRKUgwx));
            } else {
                KWHzl().KWHzl.setTextColor(ResourcesCompat.getColor(getResources(), C35399nuc.Application.OLrzqt, null));
                android.widget.ImageView imageView4 = KWHzl().OLrzqt;
                imageView4.setImageResource(C52761wXj.TaskDescription.dHguZz);
                imageView4.setColorFilter(C33070mpX.copydefault(C35399nuc.Application.OLrzqt));
            }
        }
        if (isConnected()) {
            KWHzl().EZpvd.setBackground(getResources().getDrawable(fetchVPNInfo(), null));
        } else {
            KWHzl().EZpvd.setBackground(getResources().getDrawable(AkhnZx(), null));
        }
    }
}

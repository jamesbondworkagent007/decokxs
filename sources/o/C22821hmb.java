package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22821hmb implements InterfaceC22761hlU {
    public final android.content.Context AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final AppCompatImageView KWHzl;
    public final C55113xdn OLrzqt;

    /* JADX INFO: renamed from: o.hmb$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderSubStatus.values().length];
            try {
                iArr[OrderSubStatus.Expired.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSubStatus.Cancelling.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderSubStatus.Cancelled.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderSubStatus.Failed.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderSubStatus.Pending.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderSubStatus.Completed.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[OrderSubStatus.Creating.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[OrderSubStatus.Open.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[OrderSubStatus.Suspended.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            EZpvd = iArr;
        }
    }

    public C22821hmb(@NotNull android.content.Context context, @NotNull AppCompatImageView appCompatImageView, @NotNull AppCompatTextView appCompatTextView, @NotNull C55113xdn c55113xdn) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appCompatImageView, "");
        Intrinsics.checkNotNullParameter(appCompatTextView, "");
        Intrinsics.checkNotNullParameter(c55113xdn, "");
        this.AEQbTJ = context;
        this.KWHzl = appCompatImageView;
        this.EZpvd = appCompatTextView;
        this.OLrzqt = c55113xdn;
    }

    @Override // o.InterfaceC22761hlU
    public void OLrzqt(@NotNull java.lang.String str) {
        OrderSubStatus next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<OrderSubStatus> it = OrderSubStatus.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(next.getStatus()), (java.lang.Object) str)) {
                    break;
                }
            }
        }
        OrderSubStatus orderSubStatus = next;
        switch (orderSubStatus == null ? -1 : TaskDescription.EZpvd[orderSubStatus.ordinal()]) {
            case -1:
                return;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                OLrzqt();
                return;
            case 2:
                KWHzl();
                return;
            case 3:
                copydefault();
                return;
            case 4:
                AEQbTJ();
                return;
            case 5:
                djBIcL();
                return;
            case 6:
                AYXKKw();
                return;
            case 7:
                EZpvd();
                return;
            case 8:
                valueOf();
                return;
            case 9:
                gEmmrt();
                return;
        }
    }

    public final void valueOf() {
        handleMessage$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.aSdHwS), 0, 2, null);
        EZpvd(this.OLrzqt, false);
        handleIconShow$default(this, C23274hvD.ActionBar.QUSxYX, 0, 2, null);
    }

    public final void djBIcL() {
        java.lang.String string = this.AEQbTJ.getString(C23274hvD.Fragment.PlaybackStateCompatShuffleMode);
        Intrinsics.checkNotNullExpressionValue(string, "");
        handleMessage$default(this, string, 0, 2, null);
        EZpvd(this.OLrzqt, true);
        this.KWHzl.setVisibility(8);
    }

    public final void copydefault() {
        handleMessage$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.ahrCSq), 0, 2, null);
        EZpvd(this.OLrzqt, false);
        handleIconShow$default(this, C23274hvD.ActionBar.QVAiDq, 0, 2, null);
    }

    public final void OLrzqt() {
        handleMessage$default(this, C33070mpX.AYXKKw(C23274hvD.Fragment.dPaqAf), 0, 2, null);
        EZpvd(this.OLrzqt, false);
        handleIconShow$default(this, C23274hvD.ActionBar.RJOkX, 0, 2, null);
    }

    public final void AEQbTJ() {
        java.lang.String string = this.AEQbTJ.getString(C23274hvD.Fragment.MediaSessionCompatResultReceiverWrapper);
        Intrinsics.checkNotNullExpressionValue(string, "");
        OLrzqt(string, C52761wXj.Activity.fhUrPt);
        EZpvd(this.OLrzqt, false);
        OLrzqt(C23274hvD.ActionBar.gasjUx, C52761wXj.Activity.fhUrPt);
    }

    public final void AYXKKw() {
        java.lang.String string = this.AEQbTJ.getString(C23274hvD.Fragment.PlaybackStateCompatCustomAction1);
        Intrinsics.checkNotNullExpressionValue(string, "");
        handleMessage$default(this, string, 0, 2, null);
        EZpvd(this.OLrzqt, false);
        handleIconShow$default(this, C52761wXj.TaskDescription.Dmq, 0, 2, null);
    }

    public final void EZpvd() {
        java.lang.String string = this.AEQbTJ.getString(C23274hvD.Fragment.getCustomAction);
        Intrinsics.checkNotNullExpressionValue(string, "");
        handleMessage$default(this, string, 0, 2, null);
        EZpvd(this.OLrzqt, true);
        this.KWHzl.setVisibility(8);
    }

    public final void KWHzl() {
        java.lang.String string = this.AEQbTJ.getString(C23274hvD.Fragment.iflRwn);
        Intrinsics.checkNotNullExpressionValue(string, "");
        handleMessage$default(this, string, 0, 2, null);
        EZpvd(this.OLrzqt, true);
        this.KWHzl.setVisibility(8);
    }

    public final void gEmmrt() {
        java.lang.String string = this.AEQbTJ.getString(C23274hvD.Fragment.IResultReceiver);
        Intrinsics.checkNotNullExpressionValue(string, "");
        handleMessage$default(this, string, 0, 2, null);
        EZpvd(this.OLrzqt, false);
        handleIconShow$default(this, C23274hvD.ActionBar.QVAiDq, 0, 2, null);
    }

    public final void EZpvd(C55113xdn c55113xdn, boolean z) {
        if (z) {
            C55113xdn.showLoading$default(c55113xdn, 0L, 1, null);
        } else {
            c55113xdn.copydefault();
        }
    }

    public static /* synthetic */ void handleIconShow$default(C22821hmb c22821hmb, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = C52761wXj.Activity.DeEinT;
        }
        c22821hmb.OLrzqt(i, i2);
    }

    public final void OLrzqt(int i, int i2) {
        this.KWHzl.setVisibility(0);
        this.KWHzl.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.KWHzl(this.AEQbTJ, i2)));
        this.KWHzl.setImageResource(i);
    }

    public static /* synthetic */ void handleMessage$default(C22821hmb c22821hmb, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = C52761wXj.Activity.DeEinT;
        }
        c22821hmb.OLrzqt(str, i);
    }

    public final void OLrzqt(java.lang.String str, int i) {
        this.EZpvd.setTextColor(C25382ivf.KWHzl(this.AEQbTJ, i));
        this.EZpvd.setText(str);
    }
}

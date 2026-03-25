package o;

import android.view.View;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import java.util.Calendar;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.MW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.axF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC8143axF extends C5325Nj implements View.OnClickListener {
    public C8147axJ fIwbmz;
    public final C8142axE fJNWhG;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AuCTel = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC8143axF(@NotNull C8142axE c8142axE) {
        super(c8142axE.KWHzl);
        Intrinsics.checkNotNullParameter(c8142axE, "");
        this.fJNWhG = c8142axE;
        this.isConnected = c8142axE;
        android.content.Context context = c8142axE.KWHzl;
        Intrinsics.checkNotNullExpressionValue(context, "");
        KWHzl(context);
    }

    private final void KWHzl(android.content.Context context) {
        DbNXlk();
        djBIcL();
        gEmmrt();
        MY my = this.isConnected.AYXKKw;
        if (my == null) {
            android.view.LayoutInflater.from(context).inflate(MW.StateListAnimator.OLrzqt, this.copydefault);
            android.view.View viewAEQbTJ = AEQbTJ(MW.Activity.AkhnZx);
            Intrinsics.copydefault(viewAEQbTJ, "");
            android.widget.TextView textView = (android.widget.TextView) viewAEQbTJ;
            android.view.View viewAEQbTJ2 = AEQbTJ(MW.Activity.AYXKKw);
            Intrinsics.copydefault(viewAEQbTJ2, "");
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) viewAEQbTJ2;
            android.view.View viewAEQbTJ3 = AEQbTJ(MW.Activity.copydefault);
            Intrinsics.copydefault(viewAEQbTJ3, "");
            android.widget.Button button = (android.widget.Button) viewAEQbTJ3;
            android.view.View viewAEQbTJ4 = AEQbTJ(MW.Activity.EZpvd);
            Intrinsics.copydefault(viewAEQbTJ4, "");
            android.widget.Button button2 = (android.widget.Button) viewAEQbTJ4;
            button.setTag("submit");
            button2.setTag(OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
            button.setOnClickListener(this);
            button2.setOnClickListener(this);
            button.setText(android.text.TextUtils.isEmpty(this.isConnected.QUSxYX) ? context.getResources().getString(MW.ActionBar.valueOf) : this.isConnected.QUSxYX);
            button2.setText(android.text.TextUtils.isEmpty(this.isConnected.OcIXYQ) ? context.getResources().getString(MW.ActionBar.EZpvd) : this.isConnected.OcIXYQ);
            textView.setText(android.text.TextUtils.isEmpty(this.isConnected.QVAiDq) ? "" : this.isConnected.QVAiDq);
            button.setTextColor(this.isConnected.QKVWgx);
            button2.setTextColor(this.isConnected.gHZMYf);
            textView.setTextColor(this.isConnected.DTwDnp);
            relativeLayout.setBackgroundColor(this.isConnected.EZpvd);
            button.setTextSize(this.isConnected.QbewEr);
            button2.setTextSize(this.isConnected.QbewEr);
            textView.setTextSize(this.isConnected.RcXXUw);
        } else {
            my.AEQbTJ(android.view.LayoutInflater.from(context).inflate(this.isConnected.zLjUOn, this.copydefault));
        }
        android.view.View viewAEQbTJ5 = AEQbTJ(MW.Activity.DbNXlk);
        Intrinsics.copydefault(viewAEQbTJ5, "");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewAEQbTJ5;
        linearLayout.setBackgroundColor(this.isConnected.AEQbTJ);
        KWHzl(linearLayout);
    }

    private final void KWHzl(android.widget.LinearLayout linearLayout) {
        C8147axJ c8147axJ;
        C8147axJ c8147axJ2;
        int i;
        boolean[] zArr = this.isConnected.UeEOUB;
        Intrinsics.checkNotNullExpressionValue(zArr, "");
        MX mx = this.isConnected;
        C8147axJ c8147axJ3 = new C8147axJ(linearLayout, zArr, mx.QfsBiF, mx.RJOkX, this.fJNWhG.AEQbTJ());
        this.fIwbmz = c8147axJ3;
        if (this.isConnected.dNCPSb != null) {
            c8147axJ3.EZpvd(new InterfaceC5317Nb() { // from class: o.axH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC5317Nb
                public final void AEQbTJ() {
                    ViewOnClickListenerC8143axF.KWHzl(this.KWHzl);
                }
            });
        }
        C8147axJ c8147axJ4 = this.fIwbmz;
        C8147axJ c8147axJ5 = null;
        if (c8147axJ4 == null) {
            Intrinsics.gEmmrt("");
            c8147axJ4 = null;
        }
        c8147axJ4.AEQbTJ(this.isConnected.getFieldNames);
        MX mx2 = this.isConnected;
        int i2 = mx2.zuBGHE;
        if (i2 != 0 && (i = mx2.ejfBZ) != 0 && i2 <= i) {
            AuCTel();
        }
        MX mx3 = this.isConnected;
        Calendar calendar = mx3.sSMYrx;
        if (calendar == null || mx3.DbNXlk == null) {
            if (calendar != null) {
                if (calendar.get(1) < 1900) {
                    throw new java.lang.IllegalArgumentException("The startDate can not as early as 1900".toString());
                }
                fIwbmz();
            } else {
                Calendar calendar2 = mx3.DbNXlk;
                if (calendar2 != null && calendar2.get(1) > 2100) {
                    throw new java.lang.IllegalArgumentException("The endDate should not be later than 2100".toString());
                }
                fIwbmz();
            }
        } else {
            if (calendar.getTimeInMillis() > this.isConnected.DbNXlk.getTimeInMillis()) {
                throw new java.lang.IllegalArgumentException("startDate can't be later than endDate".toString());
            }
            fIwbmz();
        }
        fJNWhG();
        C8147axJ c8147axJ6 = this.fIwbmz;
        if (c8147axJ6 == null) {
            Intrinsics.gEmmrt("");
            c8147axJ = null;
        } else {
            c8147axJ = c8147axJ6;
        }
        MX mx4 = this.isConnected;
        c8147axJ.copydefault(mx4.AuCTelauCTel, mx4.AubY, mx4.iwGUEr, mx4.hDKMBd, mx4.zsXlph, mx4.wlaJM);
        C8147axJ c8147axJ7 = this.fIwbmz;
        if (c8147axJ7 == null) {
            Intrinsics.gEmmrt("");
            c8147axJ2 = null;
        } else {
            c8147axJ2 = c8147axJ7;
        }
        MX mx5 = this.isConnected;
        c8147axJ2.copydefault(mx5.dvKsVJ, mx5.finit, mx5.aKErDB, mx5.fFgQHt, mx5.fZBcTu, mx5.dxcTrN);
        C8147axJ c8147axJ8 = this.fIwbmz;
        if (c8147axJ8 == null) {
            Intrinsics.gEmmrt("");
            c8147axJ8 = null;
        }
        c8147axJ8.EZpvd(this.isConnected.uzCIH);
        C8147axJ c8147axJ9 = this.fIwbmz;
        if (c8147axJ9 == null) {
            Intrinsics.gEmmrt("");
            c8147axJ9 = null;
        }
        c8147axJ9.KWHzl(this.isConnected.fIwbmz);
        KWHzl(this.isConnected.OLrzqt);
        C8147axJ c8147axJ10 = this.fIwbmz;
        if (c8147axJ10 == null) {
            Intrinsics.gEmmrt("");
            c8147axJ10 = null;
        }
        c8147axJ10.copydefault(this.isConnected.gEmmrt);
        C8147axJ c8147axJ11 = this.fIwbmz;
        if (c8147axJ11 == null) {
            Intrinsics.gEmmrt("");
            c8147axJ11 = null;
        }
        c8147axJ11.copydefault(this.isConnected.isConnected);
        C8147axJ c8147axJ12 = this.fIwbmz;
        if (c8147axJ12 == null) {
            Intrinsics.gEmmrt("");
            c8147axJ12 = null;
        }
        c8147axJ12.copydefault(this.isConnected.values);
        C8147axJ c8147axJ13 = this.fIwbmz;
        if (c8147axJ13 == null) {
            Intrinsics.gEmmrt("");
            c8147axJ13 = null;
        }
        c8147axJ13.copydefault(this.isConnected.AwvSrB);
        C8147axJ c8147axJ14 = this.fIwbmz;
        if (c8147axJ14 == null) {
            Intrinsics.gEmmrt("");
            c8147axJ14 = null;
        }
        c8147axJ14.AYXKKw(this.isConnected.QOLQEE);
        C8147axJ c8147axJ15 = this.fIwbmz;
        if (c8147axJ15 == null) {
            Intrinsics.gEmmrt("");
            c8147axJ15 = null;
        }
        c8147axJ15.KWHzl(this.isConnected.ORxRYg);
        C8147axJ c8147axJ16 = this.fIwbmz;
        if (c8147axJ16 == null) {
            Intrinsics.gEmmrt("");
            c8147axJ16 = null;
        }
        c8147axJ16.EZpvd(this.isConnected.fJNWhG);
        C8147axJ c8147axJ17 = this.fIwbmz;
        if (c8147axJ17 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c8147axJ5 = c8147axJ17;
        }
        android.graphics.Typeface typeface = this.isConnected.AuCTel;
        Intrinsics.checkNotNullExpressionValue(typeface, "");
        c8147axJ5.OLrzqt(typeface);
    }

    public static final void KWHzl(ViewOnClickListenerC8143axF viewOnClickListenerC8143axF) {
        try {
            C8147axJ c8147axJ = viewOnClickListenerC8143axF.fIwbmz;
            if (c8147axJ == null) {
                Intrinsics.gEmmrt("");
                c8147axJ = null;
            }
            viewOnClickListenerC8143axF.isConnected.dNCPSb.KWHzl(c8147axJ.EZpvd());
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
    }

    public final void EZpvd(Calendar calendar) {
        this.isConnected.AkhnZx = calendar;
        fJNWhG();
    }

    private final void AuCTel() {
        C8147axJ c8147axJ = this.fIwbmz;
        C8147axJ c8147axJ2 = null;
        if (c8147axJ == null) {
            Intrinsics.gEmmrt("");
            c8147axJ = null;
        }
        c8147axJ.OLrzqt(this.isConnected.zuBGHE);
        C8147axJ c8147axJ3 = this.fIwbmz;
        if (c8147axJ3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c8147axJ2 = c8147axJ3;
        }
        c8147axJ2.AEQbTJ(this.isConnected.ejfBZ);
    }

    private final void fIwbmz() {
        C8147axJ c8147axJ = this.fIwbmz;
        if (c8147axJ == null) {
            Intrinsics.gEmmrt("");
            c8147axJ = null;
        }
        MX mx = this.isConnected;
        c8147axJ.OLrzqt(mx.sSMYrx, mx.DbNXlk);
        ejfBZ();
    }

    private final void ejfBZ() {
        MX mx = this.isConnected;
        Calendar calendar = mx.sSMYrx;
        if (calendar == null || mx.DbNXlk == null) {
            if (calendar != null) {
                mx.AkhnZx = calendar;
                return;
            }
            Calendar calendar2 = mx.DbNXlk;
            if (calendar2 != null) {
                mx.AkhnZx = calendar2;
                return;
            }
            return;
        }
        Calendar calendar3 = mx.AkhnZx;
        if (calendar3 == null || calendar3.getTimeInMillis() < this.isConnected.sSMYrx.getTimeInMillis() || this.isConnected.AkhnZx.getTimeInMillis() > this.isConnected.DbNXlk.getTimeInMillis()) {
            MX mx2 = this.isConnected;
            mx2.AkhnZx = mx2.sSMYrx;
        }
    }

    private final void fJNWhG() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Calendar calendar = Calendar.getInstance(this.fJNWhG.AEQbTJ());
        Calendar calendar2 = this.isConnected.AkhnZx;
        if (calendar2 == null) {
            calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
            i = calendar.get(1);
            i2 = calendar.get(2);
            i3 = calendar.get(5);
            i4 = calendar.get(11);
            i5 = calendar.get(12);
            i6 = calendar.get(13);
        } else {
            i = calendar2.get(1);
            i2 = this.isConnected.AkhnZx.get(2);
            i3 = this.isConnected.AkhnZx.get(5);
            i4 = this.isConnected.AkhnZx.get(11);
            i5 = this.isConnected.AkhnZx.get(12);
            i6 = this.isConnected.AkhnZx.get(13);
        }
        int i7 = i6;
        int i8 = i;
        int i9 = i5;
        int i10 = i4;
        int i11 = i3;
        int i12 = i2;
        C8147axJ c8147axJ = this.fIwbmz;
        if (c8147axJ == null) {
            Intrinsics.gEmmrt("");
            c8147axJ = null;
        }
        c8147axJ.AEQbTJ(i8, i12, i11, i10, i9, i7);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull android.view.View view) {
        View.OnClickListener onClickListener;
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object tag = view.getTag();
        Intrinsics.copydefault(tag, "");
        java.lang.String str = (java.lang.String) tag;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "submit")) {
            fetchVPNInfo();
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) OtpEventTracker.OTP_EVENT_VALUE_CANCEL) && (onClickListener = this.isConnected.copydefault) != null) {
            onClickListener.onClick(view);
        }
        copydefault();
    }

    public final void fetchVPNInfo() {
        if (this.isConnected.djSkpj != null) {
            try {
                C8147axJ c8147axJ = this.fIwbmz;
                if (c8147axJ == null) {
                    Intrinsics.gEmmrt("");
                    c8147axJ = null;
                }
                this.isConnected.djSkpj.copydefault(c8147axJ.EZpvd(), this.OLrzqt);
            } catch (java.text.ParseException e) {
                e.printStackTrace();
            }
        }
    }

    public final float isConnected() {
        C8147axJ c8147axJ = this.fIwbmz;
        if (c8147axJ == null) {
            Intrinsics.gEmmrt("");
            c8147axJ = null;
        }
        return c8147axJ.AEQbTJ();
    }

    @Override // o.C5325Nj
    public boolean valueOf() {
        return this.isConnected.fARcdN;
    }

    /* JADX INFO: renamed from: o.axF$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.axF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}

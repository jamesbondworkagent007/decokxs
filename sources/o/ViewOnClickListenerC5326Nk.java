package o;

import android.view.View;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import java.util.Calendar;
import o.MW;

/* JADX INFO: renamed from: o.Nk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC5326Nk extends C5325Nj implements View.OnClickListener {
    public C5327Nl fJNWhG;

    public ViewOnClickListenerC5326Nk(MX mx) {
        super(mx.KWHzl);
        this.isConnected = mx;
        KWHzl(mx.KWHzl);
    }

    private void KWHzl(android.content.Context context) {
        DbNXlk();
        djBIcL();
        gEmmrt();
        MY my = this.isConnected.AYXKKw;
        if (my == null) {
            android.view.LayoutInflater.from(context).inflate(MW.StateListAnimator.OLrzqt, this.copydefault);
            android.widget.TextView textView = (android.widget.TextView) AEQbTJ(MW.Activity.AkhnZx);
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) AEQbTJ(MW.Activity.AYXKKw);
            android.widget.Button button = (android.widget.Button) AEQbTJ(MW.Activity.copydefault);
            android.widget.Button button2 = (android.widget.Button) AEQbTJ(MW.Activity.EZpvd);
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
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) AEQbTJ(MW.Activity.DbNXlk);
        linearLayout.setBackgroundColor(this.isConnected.AEQbTJ);
        EZpvd(linearLayout);
    }

    public final void EZpvd(android.widget.LinearLayout linearLayout) {
        int i;
        MX mx = this.isConnected;
        C5327Nl c5327Nl = new C5327Nl(linearLayout, mx.UeEOUB, mx.QfsBiF, mx.RJOkX);
        this.fJNWhG = c5327Nl;
        if (this.isConnected.dNCPSb != null) {
            c5327Nl.copydefault(new InterfaceC5317Nb() { // from class: o.Nk.5
                @Override // o.InterfaceC5317Nb
                public void AEQbTJ() {
                    try {
                        ViewOnClickListenerC5326Nk.this.isConnected.dNCPSb.KWHzl(C5327Nl.KWHzl.parse(ViewOnClickListenerC5326Nk.this.fJNWhG.KWHzl()));
                    } catch (java.text.ParseException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        this.fJNWhG.KWHzl(this.isConnected.getFieldNames);
        MX mx2 = this.isConnected;
        int i2 = mx2.zuBGHE;
        if (i2 != 0 && (i = mx2.ejfBZ) != 0 && i2 <= i) {
            fJNWhG();
        }
        MX mx3 = this.isConnected;
        Calendar calendar = mx3.sSMYrx;
        if (calendar == null || mx3.DbNXlk == null) {
            if (calendar != null) {
                if (calendar.get(1) < 1900) {
                    throw new java.lang.IllegalArgumentException("The startDate can not as early as 1900");
                }
                AuCTel();
            } else {
                Calendar calendar2 = mx3.DbNXlk;
                if (calendar2 != null && calendar2.get(1) > 2100) {
                    throw new java.lang.IllegalArgumentException("The endDate should not be later than 2100");
                }
                AuCTel();
            }
        } else {
            if (calendar.getTimeInMillis() > this.isConnected.DbNXlk.getTimeInMillis()) {
                throw new java.lang.IllegalArgumentException("startDate can't be later than endDate");
            }
            AuCTel();
        }
        ejfBZ();
        C5327Nl c5327Nl2 = this.fJNWhG;
        MX mx4 = this.isConnected;
        c5327Nl2.OLrzqt(mx4.AuCTelauCTel, mx4.AubY, mx4.iwGUEr, mx4.hDKMBd, mx4.zsXlph, mx4.wlaJM);
        C5327Nl c5327Nl3 = this.fJNWhG;
        MX mx5 = this.isConnected;
        c5327Nl3.copydefault(mx5.dvKsVJ, mx5.finit, mx5.aKErDB, mx5.fFgQHt, mx5.fZBcTu, mx5.dxcTrN);
        this.fJNWhG.copydefault(this.isConnected.uzCIH);
        this.fJNWhG.copydefault(this.isConnected.fIwbmz);
        KWHzl(this.isConnected.OLrzqt);
        this.fJNWhG.AEQbTJ(this.isConnected.gEmmrt);
        this.fJNWhG.EZpvd(this.isConnected.isConnected);
        this.fJNWhG.copydefault(this.isConnected.values);
        this.fJNWhG.OLrzqt(this.isConnected.AwvSrB);
        this.fJNWhG.AYXKKw(this.isConnected.QOLQEE);
        this.fJNWhG.AEQbTJ(this.isConnected.ORxRYg);
        this.fJNWhG.OLrzqt(this.isConnected.fJNWhG);
    }

    public void AEQbTJ(Calendar calendar) {
        this.isConnected.AkhnZx = calendar;
        ejfBZ();
    }

    public final void fJNWhG() {
        this.fJNWhG.KWHzl(this.isConnected.zuBGHE);
        this.fJNWhG.OLrzqt(this.isConnected.ejfBZ);
    }

    public final void AuCTel() {
        C5327Nl c5327Nl = this.fJNWhG;
        MX mx = this.isConnected;
        c5327Nl.OLrzqt(mx.sSMYrx, mx.DbNXlk);
        isConnected();
    }

    public final void isConnected() {
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

    public final void ejfBZ() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Calendar calendar = Calendar.getInstance();
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
        int i7 = i4;
        int i8 = i3;
        int i9 = i2;
        C5327Nl c5327Nl = this.fJNWhG;
        c5327Nl.EZpvd(i, i9, i8, i7, i5, i6);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        View.OnClickListener onClickListener;
        java.lang.String str = (java.lang.String) view.getTag();
        if (str.equals("submit")) {
            fetchVPNInfo();
        } else if (str.equals(OtpEventTracker.OTP_EVENT_VALUE_CANCEL) && (onClickListener = this.isConnected.copydefault) != null) {
            onClickListener.onClick(view);
        }
        copydefault();
    }

    public void fetchVPNInfo() {
        if (this.isConnected.djSkpj != null) {
            try {
                this.isConnected.djSkpj.copydefault(C5327Nl.KWHzl.parse(this.fJNWhG.KWHzl()), this.OLrzqt);
            } catch (java.text.ParseException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // o.C5325Nj
    public boolean valueOf() {
        return this.isConnected.fARcdN;
    }
}

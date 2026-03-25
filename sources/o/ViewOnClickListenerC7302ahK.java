package o;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.C52761wXj;
import o.C7343ahz;

/* JADX INFO: renamed from: o.ahK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnClickListenerC7302ahK implements View.OnClickListener, View.OnLongClickListener {
    public android.view.View AEQbTJ;
    public android.view.View AYXKKw;
    public android.view.View AhwBna;
    public android.view.View EZpvd;
    public boolean KWHzl;
    public C7328ahk OLrzqt;
    public android.view.ViewGroup copydefault;
    public android.view.View djBIcL;
    public boolean fetchVPNInfo;
    public android.view.ViewGroup gEmmrt;
    public android.view.View valueOf;
    public android.view.View values;

    public ViewOnClickListenerC7302ahK(android.view.ViewGroup viewGroup, C7328ahk c7328ahk) {
        this.copydefault = viewGroup;
        this.OLrzqt = c7328ahk;
    }

    public android.view.ViewGroup OLrzqt() {
        C7930atC c7930atC = new C7930atC(this.copydefault.getContext());
        c7930atC.setLayoutParams(OLrzqt(150.0f, 150.0f));
        return c7930atC;
    }

    public ViewGroup.LayoutParams OLrzqt(float f, float f2) {
        return new ViewGroup.LayoutParams(C7865arr.copydefault(f), C7865arr.copydefault(f2));
    }

    public android.view.View KWHzl() {
        android.widget.ImageView imageView = new android.widget.ImageView(this.copydefault.getContext());
        imageView.setImageResource(C7343ahz.StateListAnimator.EZpvd);
        imageView.setAlpha(0.1f);
        imageView.setLayoutParams(OLrzqt(50.0f, 50.0f));
        return imageView;
    }

    public android.view.View EZpvd() {
        android.widget.ImageView imageView = new android.widget.ImageView(this.copydefault.getContext());
        imageView.setImageResource(C7343ahz.StateListAnimator.KWHzl);
        imageView.setLayoutParams(OLrzqt(35.0f, 35.0f));
        return imageView;
    }

    public android.view.View AYXKKw() {
        android.widget.ImageView imageView = new android.widget.ImageView(this.copydefault.getContext());
        imageView.setImageResource(C7343ahz.StateListAnimator.copydefault);
        imageView.setLayoutParams(OLrzqt(35.0f, 35.0f));
        return imageView;
    }

    public android.view.View copydefault() {
        android.widget.ImageView imageView = new android.widget.ImageView(this.copydefault.getContext());
        imageView.setImageResource(C7343ahz.StateListAnimator.OLrzqt);
        imageView.setLayoutParams(OLrzqt(35.0f, 35.0f));
        return imageView;
    }

    public android.view.View AhwBna() {
        android.widget.ImageView imageView = new android.widget.ImageView(this.copydefault.getContext());
        imageView.setImageResource(C52761wXj.TaskDescription.sIqKDg);
        imageView.setLayoutParams(OLrzqt(35.0f, 35.0f));
        return imageView;
    }

    public android.view.View DbNXlk() {
        android.widget.ImageView imageView = new android.widget.ImageView(this.copydefault.getContext());
        imageView.setImageResource(C7343ahz.StateListAnimator.djBIcL);
        imageView.setLayoutParams(OLrzqt(35.0f, 35.0f));
        return imageView;
    }

    public android.view.View copydefault(boolean z) {
        android.view.ViewGroup viewGroup = this.gEmmrt;
        if (viewGroup != null) {
            return viewGroup;
        }
        this.KWHzl = z;
        this.gEmmrt = OLrzqt();
        android.view.View viewKWHzl = KWHzl();
        this.AEQbTJ = viewKWHzl;
        android.view.ViewGroup viewGroup2 = this.gEmmrt;
        if (viewGroup2 instanceof C7930atC) {
            ((C7930atC) viewGroup2).setCenter(viewKWHzl);
        } else {
            viewGroup2.addView(viewKWHzl);
        }
        android.view.View view = this.AEQbTJ;
        if (view != null) {
            view.setOnTouchListener(new ViewOnTouchListenerC7847arZ(this.gEmmrt, true));
            this.AEQbTJ.setOnClickListener(this);
        }
        if (!z) {
            this.valueOf = EZpvd();
        }
        android.view.View view2 = this.valueOf;
        if (view2 != null) {
            view2.setOnClickListener(this);
            this.gEmmrt.addView(this.valueOf);
            this.OLrzqt.KWHzl(EZpvd(this.copydefault));
        }
        android.view.View viewAYXKKw = AYXKKw();
        this.AYXKKw = viewAYXKKw;
        if (viewAYXKKw != null) {
            viewAYXKKw.setOnClickListener(this.OLrzqt.sSMYrx);
            this.gEmmrt.addView(this.AYXKKw);
        }
        android.view.View viewCopydefault = copydefault();
        this.EZpvd = viewCopydefault;
        if (viewCopydefault != null) {
            viewCopydefault.setOnClickListener(this);
            this.gEmmrt.addView(this.EZpvd);
        }
        android.view.View viewAhwBna = AhwBna();
        this.AhwBna = viewAhwBna;
        if (viewAhwBna != null) {
            viewAhwBna.setOnClickListener(this);
            this.gEmmrt.addView(this.AhwBna);
        }
        android.view.View viewDbNXlk = DbNXlk();
        this.values = viewDbNXlk;
        if (viewDbNXlk != null) {
            viewDbNXlk.setOnLongClickListener(this);
            this.values.setOnClickListener(this);
            this.gEmmrt.addView(this.values);
        }
        this.copydefault.addView(this.gEmmrt);
        AEQbTJ(8, this.valueOf, this.AYXKKw, this.EZpvd, this.djBIcL, this.AhwBna, this.values);
        return this.gEmmrt;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (view == this.AEQbTJ) {
            valueOf();
            return;
        }
        if (view == this.valueOf) {
            gEmmrt();
            return;
        }
        if (view == this.EZpvd) {
            AEQbTJ();
            return;
        }
        if (view == this.AhwBna) {
            djBIcL();
            return;
        }
        if (view == this.values) {
            java.util.HashMap map = new java.util.HashMap();
            if (this.OLrzqt.djBIcL() != null) {
                map.put("packagePath", this.OLrzqt.djBIcL().DbNXlk());
                if (this.OLrzqt.getFieldNames()) {
                    map.put("appId", (java.lang.String) this.OLrzqt.AYXKKw().KWHzl.get("appid"));
                }
            }
            Function2<android.content.Context, java.util.Map<java.lang.String, ? extends java.lang.Object>, Unit> function2OLrzqt = C43047rhs.AEQbTJ.OLrzqt().OLrzqt();
            Objects.requireNonNull(function2OLrzqt);
            function2OLrzqt.invoke(this.copydefault.getContext(), map);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        if (view != this.values) {
            return false;
        }
        EZpvd(view.getContext());
        return false;
    }

    public void valueOf() {
        boolean z = !this.fetchVPNInfo;
        this.fetchVPNInfo = z;
        int i = z ? 0 : 4;
        this.AEQbTJ.setAlpha(z ? 1.0f : 0.1f);
        if (this.KWHzl) {
            AEQbTJ(8, this.valueOf, this.AYXKKw, this.values);
            AEQbTJ(i, this.EZpvd, this.djBIcL, this.AhwBna);
        } else {
            AEQbTJ(i, this.valueOf, this.AYXKKw, this.EZpvd, this.djBIcL, this.AhwBna, this.values);
        }
    }

    public void AEQbTJ(int i, android.view.View... viewArr) {
        for (android.view.View view : viewArr) {
            if (view != null) {
                view.setVisibility(i);
            }
        }
    }

    public void gEmmrt() {
        this.OLrzqt.EZpvd(!r0.uzCIH());
    }

    public void AEQbTJ() {
        C7937atJ c7937atJ = this.OLrzqt.QKVWgx;
        if (c7937atJ == null) {
            return;
        }
        c7937atJ.setLayerInteractionEnabled(!c7937atJ.copydefault());
    }

    public void EZpvd(android.content.Context context) {
        java.lang.String strGEmmrt = C7326ahi.gEmmrt();
        C7323ahf.fIwbmz().copydefault(context.getString(C7343ahz.Fragment.EZpvd) + strGEmmrt + "  " + context.getString(C7343ahz.Fragment.AEQbTJ) + "1.6.0");
    }

    public void djBIcL() {
        ViewOnClickListenerC7394aix viewOnClickListenerC7394aix = new ViewOnClickListenerC7394aix(this.copydefault.getContext(), true, this.KWHzl);
        final boolean zDjBIcL = C7326ahi.djBIcL();
        viewOnClickListenerC7394aix.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.ahK.3
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(android.content.DialogInterface dialogInterface) {
                if (zDjBIcL == C7326ahi.djBIcL() || zDjBIcL) {
                    return;
                }
                ViewOnClickListenerC7302ahK.this.OLrzqt.djBIcL().getFieldNames();
            }
        });
        viewOnClickListenerC7394aix.show();
    }

    public static InterfaceC7854arg EZpvd(android.view.ViewGroup viewGroup) {
        final android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(viewGroup.getContext());
        linearLayout.setBackgroundColor(-1723579324);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setGravity(1);
        android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
        textView.setTextColor(-1);
        textView.setGravity(17);
        int dimension = (int) viewGroup.getContext().getResources().getDimension(C7343ahz.Application.AEQbTJ);
        textView.setPaddingRelative(0, dimension, 0, dimension);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setText(viewGroup.getContext().getResources().getText(C7343ahz.Fragment.iwGUEr));
        android.widget.TextView textView2 = new android.widget.TextView(viewGroup.getContext());
        textView2.setTextColor(-1);
        textView2.setGravity(17);
        viewGroup.getContext().getResources().getDimension(C7343ahz.Application.AEQbTJ);
        textView2.setPaddingRelative(0, dimension, 0, dimension);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView2.setText(viewGroup.getContext().getResources().getText(C7343ahz.Fragment.copydefault));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: o.ahK.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                linearLayout.setVisibility(4);
            }
        });
        final C7794aqZ c7794aqZ = new C7794aqZ(viewGroup.getContext());
        linearLayout.addView(c7794aqZ);
        linearLayout.addView(textView2);
        linearLayout.addView(textView);
        viewGroup.addView(linearLayout);
        linearLayout.setVisibility(8);
        linearLayout.bringToFront();
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.ahK.4
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                c7794aqZ.copydefault();
            }
        });
        textView.setOnTouchListener(new ViewOnTouchListenerC7847arZ(linearLayout, true));
        return c7794aqZ;
    }
}

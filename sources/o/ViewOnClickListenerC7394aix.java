package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatDialog;
import o.C7343ahz;
import org.luaj.vm2.Globals;

/* JADX INFO: renamed from: o.aix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnClickListenerC7394aix extends AppCompatDialog implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    public android.widget.EditText AEQbTJ;
    public boolean AYXKKw;
    public android.widget.EditText EZpvd;
    public android.widget.EditText KWHzl;
    public android.widget.EditText OLrzqt;
    public boolean copydefault;
    public boolean djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
        this.copydefault = z;
    }

    public ViewOnClickListenerC7394aix(android.content.Context context, boolean z, boolean z2) {
        super(context);
        this.AYXKKw = z;
        this.djBIcL = z2;
        KWHzl();
    }

    private void KWHzl() {
        setContentView(C7343ahz.Activity.ejfBZ);
        android.view.View viewFindViewById = findViewById(C7343ahz.TaskDescription.wlaJM);
        android.view.View viewFindViewById2 = findViewById(C7343ahz.TaskDescription.zLjUOn);
        android.view.View viewFindViewById3 = findViewById(C7343ahz.TaskDescription.zsXlph);
        this.OLrzqt = (android.widget.EditText) findViewById(C7343ahz.TaskDescription.AkhnZx);
        this.EZpvd = (android.widget.EditText) findViewById(C7343ahz.TaskDescription.fetchVPNInfo);
        android.widget.Switch r3 = (android.widget.Switch) findViewById(C7343ahz.TaskDescription.RJOkX);
        boolean zDjBIcL = C7326ahi.djBIcL();
        this.copydefault = zDjBIcL;
        r3.setChecked(zDjBIcL);
        r3.setOnCheckedChangeListener(this);
        this.AEQbTJ = (android.widget.EditText) findViewById(C7343ahz.TaskDescription.AuCTel);
        this.KWHzl = (android.widget.EditText) findViewById(C7343ahz.TaskDescription.fIwbmz);
        findViewById(C7343ahz.TaskDescription.KWHzl).setOnClickListener(this);
        findViewById(C7343ahz.TaskDescription.AEQbTJ).setOnClickListener(this);
        findViewById(C7343ahz.TaskDescription.valueOf).setOnClickListener(this);
        findViewById(C7343ahz.TaskDescription.gEmmrt).setOnClickListener(this);
        if (!this.djBIcL) {
            viewFindViewById2.setVisibility(8);
            viewFindViewById3.setVisibility(8);
        } else {
            this.AEQbTJ.setText("" + C7324ahg.AEQbTJ());
            java.lang.String strKWHzl = C7324ahg.KWHzl();
            if ("unknown".equalsIgnoreCase(strKWHzl)) {
                strKWHzl = null;
            }
            this.KWHzl.setText(strKWHzl);
        }
        if (!this.AYXKKw) {
            viewFindViewById.setVisibility(8);
            return;
        }
        this.OLrzqt.setText(C7326ahi.AEQbTJ());
        this.EZpvd.setText(C7326ahi.EZpvd() + "");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int id = view.getId();
        if (id == C7343ahz.TaskDescription.KWHzl) {
            dismiss();
            return;
        }
        if (id == C7343ahz.TaskDescription.AEQbTJ) {
            if (this.AYXKKw) {
                OLrzqt();
            }
            if (this.djBIcL) {
                AEQbTJ();
            }
            dismiss();
            return;
        }
        if (id == C7343ahz.TaskDescription.valueOf) {
            Globals.OLrzqt((char) 0);
            Globals.OLrzqt((char) 3);
        } else if (id == C7343ahz.TaskDescription.gEmmrt) {
            Globals.djBIcL();
        }
    }

    public final void AEQbTJ() {
        try {
            C7324ahg.EZpvd(java.lang.Integer.parseInt(this.AEQbTJ.getText().toString()));
        } catch (java.lang.Throwable unused) {
            C7323ahf.fIwbmz().copydefault(getContext().getString(C7343ahz.Fragment.valueOf));
        }
        android.text.Editable text = this.KWHzl.getText();
        if (text != null) {
            java.lang.String string = text.toString();
            C7324ahg.EZpvd(string);
            C7323ahf.EZpvd().EZpvd("android_serial", string);
        }
    }

    public final void OLrzqt() {
        java.lang.String string = this.OLrzqt.getText().toString();
        java.lang.String string2 = this.EZpvd.getText().toString();
        if (!android.text.TextUtils.isEmpty(string)) {
            C7326ahi.AEQbTJ(string);
        }
        if (!android.text.TextUtils.isEmpty(string2)) {
            C7326ahi.OLrzqt(java.lang.Integer.parseInt(string2));
        }
        C7326ahi.EZpvd(this.copydefault, getContext());
    }
}

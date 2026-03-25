package com.okinc.kline.ui.view.setting;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import o.C35964oKf;
import o.C47244tmQ;
import o.pCO;

/* JADX INFO: loaded from: classes19.dex */
public class SnappingStepper extends RelativeLayout implements View.OnTouchListener {
    public static long AEQbTJ = 300;
    public static long copydefault = 60;
    public Mode AYXKKw;
    public pCO AhwBna;
    public long AkhnZx;
    public int AuCTel;
    public int DbNXlk;
    public ImageView EZpvd;
    public ImageView KWHzl;
    public boolean OLrzqt;
    public TextWatcher djBIcL;
    public ActionBar ejfBZ;
    public int fARcdN;
    public EditText fJNWhG;
    public float fetchVPNInfo;
    public int gEmmrt;
    public boolean isConnected;
    public int valueOf;
    public float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private int OLrzqt() {
        int i = this.DbNXlk;
        if (i == -1) {
            return this.fARcdN - this.AuCTel;
        }
        if (i != 0 && i == 1) {
            return this.fARcdN + this.AuCTel;
        }
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ImageView AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt(int i) {
        int i2 = this.gEmmrt;
        return (i <= i2 && i >= (i2 = this.valueOf)) ? i : i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ImageView copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMaxValue(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMinValue(int i) {
        this.valueOf = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMode(Mode mode) {
        this.AYXKKw = mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOnValueChangeListener(pCO pco) {
        this.AhwBna = pco;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setValueSlowStep(int i) {
        this.AuCTel = i;
    }

    public enum Mode {
        AUTO(0),
        CUSTOM(1);

        private final int value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static Mode valueOf(int i) {
            if (i != 0 && i == 1) {
                return CUSTOM;
            }
            return AUTO;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getValue() {
            return this.value;
        }

        Mode(int i) {
            this.value = i;
        }
    }

    public SnappingStepper(Context context) {
        this(context, null);
    }

    public SnappingStepper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isConnected = false;
        this.AuCTel = 1;
        this.fetchVPNInfo = 0.0f;
        this.values = 0.0f;
        this.OLrzqt = false;
        this.AkhnZx = 0L;
        this.DbNXlk = 0;
        this.AYXKKw = Mode.AUTO;
        this.fARcdN = 0;
        this.valueOf = 0;
        this.gEmmrt = 1000;
        this.djBIcL = new TextWatcher() { // from class: com.okinc.kline.ui.view.setting.SnappingStepper.2
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (i >= 0) {
                    try {
                        int i4 = !TextUtils.isEmpty(charSequence) ? Integer.parseInt(charSequence.toString()) : 0;
                        if (charSequence.toString().length() >= 2 && charSequence.toString().startsWith("0")) {
                            SnappingStepper.this.fJNWhG.setText(charSequence.toString().substring(1));
                            SnappingStepper.this.fJNWhG.setSelection(charSequence.toString().length() - 1);
                            return;
                        }
                        if (i4 > SnappingStepper.this.gEmmrt) {
                            i4 = SnappingStepper.this.gEmmrt;
                            SnappingStepper.this.fJNWhG.setText(String.valueOf(i4));
                        }
                        SnappingStepper.this.fARcdN = i4;
                        if (SnappingStepper.this.AhwBna != null) {
                            pCO pco = SnappingStepper.this.AhwBna;
                            SnappingStepper snappingStepper = SnappingStepper.this;
                            pco.OLrzqt(snappingStepper, snappingStepper.fARcdN);
                        }
                    } catch (NumberFormatException e) {
                        e.toString();
                    }
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                SnappingStepper.this.fJNWhG.setSelection(SnappingStepper.this.fJNWhG.getText().length());
            }
        };
        KWHzl(attributeSet);
    }

    public final void KWHzl(AttributeSet attributeSet) {
        Drawable drawable;
        String string;
        float f;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        LayoutInflater.from(getContext()).inflate(C35964oKf.Application.invokespecialRuDPQV, (ViewGroup) this, true);
        this.fJNWhG = (EditText) findViewById(C35964oKf.StateListAnimator.MediaBrowserCompatSubscriptionCallback);
        this.EZpvd = (ImageView) findViewById(C35964oKf.StateListAnimator.hbZCHz);
        this.KWHzl = (ImageView) findViewById(C35964oKf.StateListAnimator.gVEiQJ);
        int color = getResources().getColor(C35964oKf.TaskDescription.OLrzqt);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C35964oKf.PendingIntent.gHZMYf);
            this.AYXKKw = Mode.valueOf(typedArrayObtainStyledAttributes.getInt(C35964oKf.PendingIntent.zuBGHE, Mode.AUTO.getValue()));
            this.valueOf = typedArrayObtainStyledAttributes.getInt(C35964oKf.PendingIntent.sSMYrx, this.valueOf);
            this.gEmmrt = typedArrayObtainStyledAttributes.getInt(C35964oKf.PendingIntent.AwvSrB, this.gEmmrt);
            this.fARcdN = OLrzqt(typedArrayObtainStyledAttributes.getInt(C35964oKf.PendingIntent.djSkpj, this.fARcdN));
            int i = typedArrayObtainStyledAttributes.getInt(C35964oKf.PendingIntent.QKVWgx, this.AuCTel);
            this.AuCTel = i;
            if (i <= 0) {
                this.AuCTel = 1;
            }
            string = typedArrayObtainStyledAttributes.getString(C35964oKf.PendingIntent.QOLQEE);
            drawable = typedArrayObtainStyledAttributes.getDrawable(C35964oKf.PendingIntent.DTwDnp);
            typedArrayObtainStyledAttributes.getDrawable(C35964oKf.PendingIntent.OcIXYQ);
            drawable2 = typedArrayObtainStyledAttributes.getDrawable(C35964oKf.PendingIntent.RJOkX);
            drawable3 = typedArrayObtainStyledAttributes.getDrawable(C35964oKf.PendingIntent.QUSxYX);
            drawable4 = typedArrayObtainStyledAttributes.getDrawable(C35964oKf.PendingIntent.QbewEr);
            drawable5 = typedArrayObtainStyledAttributes.getDrawable(C35964oKf.PendingIntent.QfsBiF);
            color = typedArrayObtainStyledAttributes.getColor(C35964oKf.PendingIntent.ORxRYg, color);
            f = typedArrayObtainStyledAttributes.getFloat(C35964oKf.PendingIntent.QVAiDq, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            drawable = null;
            string = "";
            f = 0.0f;
            drawable2 = null;
            drawable3 = null;
            drawable4 = null;
            drawable5 = null;
        }
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        } else {
            setBackgroundResource(C47244tmQ.Application.copydefault);
        }
        this.fJNWhG.setTextColor(color);
        if (f > 0.0f) {
            setContentTextSize(f);
        }
        if (drawable4 != null) {
            this.EZpvd.setBackgroundDrawable(drawable4);
        }
        if (drawable5 != null) {
            this.KWHzl.setBackgroundDrawable(drawable5);
        }
        if (drawable2 != null) {
            setLeftButtonResources(drawable2);
        }
        if (drawable3 != null) {
            setRightButtonResources(drawable3);
        }
        if (this.AYXKKw == Mode.AUTO) {
            this.fJNWhG.setText(String.valueOf(this.fARcdN));
        } else {
            this.fJNWhG.setText(string);
        }
        this.EZpvd.setOnTouchListener(this);
        this.KWHzl.setOnTouchListener(this);
        setOnTouchListener(this);
        this.ejfBZ = new ActionBar(this);
        this.fJNWhG.addTextChangedListener(this.djBIcL);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.isConnected = true;
            postDelayed(this.ejfBZ, AEQbTJ);
            EZpvd();
            this.AkhnZx = System.currentTimeMillis();
            ImageView imageView = this.EZpvd;
            if (view == imageView) {
                imageView.setPressed(true);
                this.DbNXlk = -1;
            } else {
                ImageView imageView2 = this.KWHzl;
                if (view == imageView2) {
                    imageView2.setPressed(true);
                    this.DbNXlk = 1;
                }
            }
        } else if (action == 1 || action == 3) {
            this.isConnected = false;
            ImageView imageView3 = this.EZpvd;
            if (view == imageView3) {
                imageView3.setPressed(false);
            } else {
                ImageView imageView4 = this.KWHzl;
                if (view == imageView4) {
                    imageView4.setPressed(false);
                }
            }
        }
        return true;
    }

    public final void EZpvd() {
        if (this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        this.values = this.fJNWhG.getLeft();
    }

    public final void KWHzl() {
        int iOLrzqt = OLrzqt();
        int i = this.valueOf;
        if (iOLrzqt < i) {
            iOLrzqt = i;
        }
        int i2 = this.gEmmrt;
        if (iOLrzqt > i2) {
            iOLrzqt = i2;
        }
        this.fARcdN = iOLrzqt;
        if (this.AYXKKw == Mode.AUTO) {
            this.fJNWhG.setText(String.valueOf(iOLrzqt));
        }
        pCO pco = this.AhwBna;
        if (pco != null) {
            pco.OLrzqt(this, this.fARcdN);
        }
        if (this.isConnected) {
            postDelayed(this.ejfBZ, System.currentTimeMillis() - this.AkhnZx > 1000 ? copydefault : AEQbTJ);
        }
    }

    public static class ActionBar implements Runnable {
        public WeakReference<SnappingStepper> copydefault;

        public ActionBar(SnappingStepper snappingStepper) {
            this.copydefault = new WeakReference<>(snappingStepper);
        }

        @Override // java.lang.Runnable
        public void run() {
            SnappingStepper snappingStepper = this.copydefault.get();
            if (snappingStepper != null) {
                snappingStepper.KWHzl();
            }
        }
    }

    public void setValue(int i) {
        this.fARcdN = OLrzqt(i);
        if (this.AYXKKw == Mode.AUTO) {
            this.fJNWhG.setText(String.valueOf(i));
        }
    }

    public void setText(String str) {
        this.fJNWhG.setText(str);
    }

    public void setContentTextSize(float f) {
        this.fJNWhG.setTextSize(f);
    }

    public void setButtonBackGround(int i) {
        this.EZpvd.setBackgroundResource(i);
        this.KWHzl.setBackgroundResource(i);
    }

    public void setLeftButtonResources(int i) {
        this.EZpvd.setImageResource(i);
    }

    public void setLeftButtonResources(Drawable drawable) {
        this.EZpvd.setImageDrawable(drawable);
    }

    public void setRightButtonResources(int i) {
        this.KWHzl.setImageResource(i);
    }

    public void setRightButtonResources(Drawable drawable) {
        this.KWHzl.setImageDrawable(drawable);
    }
}

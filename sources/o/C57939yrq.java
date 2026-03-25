package o;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import java.text.SimpleDateFormat;
import java.util.Date;
import o.C57923yra;

/* JADX INFO: renamed from: o.yrq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C57939yrq extends AbstractC57948yrz<C57939yrq> implements InterfaceC57933yrk {
    public boolean AkhnZx;
    public java.lang.String AuCTel;
    public android.content.SharedPreferences DbNXlk;
    public java.lang.String ejfBZ;
    public java.lang.String fARcdN;
    public java.lang.String fIwbmz;
    public java.lang.String fJNWhG;
    public java.text.DateFormat fetchVPNInfo;
    public java.lang.String getFieldNames;
    public java.lang.String hDKMBd;
    public Date isConnected;
    public java.lang.String iwGUEr;
    public java.lang.String valueOf;
    public android.widget.TextView values;
    public static final int EZpvd = C57923yra.Activity.AEQbTJ;
    public static java.lang.String AEQbTJ = null;
    public static java.lang.String gEmmrt = null;
    public static java.lang.String copydefault = null;
    public static java.lang.String AYXKKw = null;
    public static java.lang.String OLrzqt = null;
    public static java.lang.String KWHzl = null;
    public static java.lang.String djBIcL = null;
    public static java.lang.String AhwBna = null;

    public C57939yrq(android.content.Context context) {
        this(context, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(48:0|2|(1:4)(2:5|(1:7))|8|(1:10)(2:11|(1:13))|14|(1:16)|17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)(34:30|(0)(1:33)|34|(1:36)(31:38|(0)(1:41)|42|(1:44)(28:46|(0)(1:49)|50|(1:52)(25:54|(0)(1:57)|58|(1:60)(22:62|(0)(1:65)|66|(1:68)(19:70|(0)(1:73)|74|(1:76)(16:78|(0)(1:81)|82|(1:84)(13:86|(0)(1:89)|90|(1:92)(1:93)|94|(1:96)(1:97)|98|(1:100)(1:101)|114|102|(2:108|109)|112|113)|85|90|(0)(0)|94|(0)(0)|98|(0)(0)|114|102|(4:104|106|108|109)|112|113)|77|82|(0)(0)|85|90|(0)(0)|94|(0)(0)|98|(0)(0)|114|102|(0)|112|113)|69|74|(0)(0)|77|82|(0)(0)|85|90|(0)(0)|94|(0)(0)|98|(0)(0)|114|102|(0)|112|113)|61|66|(0)(0)|69|74|(0)(0)|77|82|(0)(0)|85|90|(0)(0)|94|(0)(0)|98|(0)(0)|114|102|(0)|112|113)|53|58|(0)(0)|61|66|(0)(0)|69|74|(0)(0)|77|82|(0)(0)|85|90|(0)(0)|94|(0)(0)|98|(0)(0)|114|102|(0)|112|113)|45|50|(0)(0)|53|58|(0)(0)|61|66|(0)(0)|69|74|(0)(0)|77|82|(0)(0)|85|90|(0)(0)|94|(0)(0)|98|(0)(0)|114|102|(0)|112|113)|37|42|(0)(0)|45|50|(0)(0)|53|58|(0)(0)|61|66|(0)(0)|69|74|(0)(0)|77|82|(0)(0)|85|90|(0)(0)|94|(0)(0)|98|(0)(0)|114|102|(0)|112|113)|29|34|(0)(0)|37|42|(0)(0)|45|50|(0)(0)|53|58|(0)(0)|61|66|(0)(0)|69|74|(0)(0)|77|82|(0)(0)|85|90|(0)(0)|94|(0)(0)|98|(0)(0)|114|102|(0)|112|113) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02e5, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02e6, code lost:
    
        r11.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c9 A[Catch: all -> 0x02e5, TryCatch #0 {all -> 0x02e5, blocks: (B:102:0x02c5, B:104:0x02c9, B:106:0x02d2, B:108:0x02dc), top: B:114:0x02c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C57939yrq(android.content.Context context, android.util.AttributeSet attributeSet) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.String string5;
        java.lang.String string6;
        java.lang.String string7;
        java.lang.String string8;
        androidx.fragment.app.FragmentManager supportFragmentManager;
        super(context, attributeSet, 0);
        this.valueOf = "LAST_UPDATE_TIME";
        this.AkhnZx = true;
        android.view.View.inflate(context, C57923yra.ActionBar.OLrzqt, this);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(C57923yra.Activity.copydefault);
        this.zuBGHE = imageView;
        android.widget.TextView textView = (android.widget.TextView) findViewById(C57923yra.Activity.AEQbTJ);
        this.values = textView;
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(C57923yra.Activity.EZpvd);
        this.OcIXYQ = imageView2;
        this.QfsBiF = (android.widget.TextView) findViewById(C57923yra.Activity.OLrzqt);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57923yra.StateListAnimator.isConnected);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
        new LinearLayout.LayoutParams(-2, -2).topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(C57923yra.StateListAnimator.gHZMYf, InterpolatorC57905yrI.OLrzqt(0.0f));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C57923yra.StateListAnimator.valueOf, InterpolatorC57905yrI.OLrzqt(20.0f));
        layoutParams2.rightMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(C57923yra.StateListAnimator.DbNXlk, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(C57923yra.StateListAnimator.DbNXlk, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(C57923yra.StateListAnimator.AuCTel, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(C57923yra.StateListAnimator.AuCTel, layoutParams2.height);
        layoutParams.width = typedArrayObtainStyledAttributes.getLayoutDimension(C57923yra.StateListAnimator.fJNWhG, layoutParams.width);
        layoutParams.height = typedArrayObtainStyledAttributes.getLayoutDimension(C57923yra.StateListAnimator.fJNWhG, layoutParams.height);
        layoutParams2.width = typedArrayObtainStyledAttributes.getLayoutDimension(C57923yra.StateListAnimator.fJNWhG, layoutParams2.width);
        layoutParams2.height = typedArrayObtainStyledAttributes.getLayoutDimension(C57923yra.StateListAnimator.fJNWhG, layoutParams2.height);
        this.AwvSrB = typedArrayObtainStyledAttributes.getInt(C57923yra.StateListAnimator.fIwbmz, this.AwvSrB);
        this.AkhnZx = typedArrayObtainStyledAttributes.getBoolean(C57923yra.StateListAnimator.ejfBZ, this.AkhnZx);
        this.AuCTelauCTel = C57940yrr.djBIcL[typedArrayObtainStyledAttributes.getInt(C57923yra.StateListAnimator.values, this.AuCTelauCTel.AYXKKw)];
        if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.AkhnZx)) {
            this.zuBGHE.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(C57923yra.StateListAnimator.AkhnZx));
        } else if (this.zuBGHE.getDrawable() == null) {
            C57898yrB c57898yrB = new C57898yrB();
            this.AubY = c57898yrB;
            c57898yrB.copydefault(-10066330);
            this.zuBGHE.setImageDrawable(this.AubY);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.fARcdN)) {
            this.OcIXYQ.setImageDrawable(typedArrayObtainStyledAttributes.getDrawable(C57923yra.StateListAnimator.fARcdN));
        } else if (this.OcIXYQ.getDrawable() == null) {
            C57897yrA c57897yrA = new C57897yrA();
            this.DTwDnp = c57897yrA;
            c57897yrA.copydefault(-10066330);
            this.OcIXYQ.setImageDrawable(this.DTwDnp);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.wlaJM)) {
            this.QfsBiF.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(C57923yra.StateListAnimator.wlaJM, InterpolatorC57905yrI.OLrzqt(16.0f)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.zLjUOn)) {
            this.values.setTextSize(0, typedArrayObtainStyledAttributes.getDimensionPixelSize(C57923yra.StateListAnimator.zLjUOn, InterpolatorC57905yrI.OLrzqt(12.0f)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.hDKMBd)) {
            super.EZpvd(typedArrayObtainStyledAttributes.getColor(C57923yra.StateListAnimator.hDKMBd, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.fetchVPNInfo)) {
            AEQbTJ(typedArrayObtainStyledAttributes.getColor(C57923yra.StateListAnimator.fetchVPNInfo, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.getFieldNames)) {
            string = typedArrayObtainStyledAttributes.getString(C57923yra.StateListAnimator.getFieldNames);
        } else {
            string = AEQbTJ;
            if (string == null) {
                this.fIwbmz = context.getString(C57923yra.Application.djBIcL);
            }
            if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.uzCIH)) {
                string2 = typedArrayObtainStyledAttributes.getString(C57923yra.StateListAnimator.uzCIH);
            } else {
                string2 = copydefault;
                if (string2 == null) {
                    this.fARcdN = context.getString(C57923yra.Application.copydefault);
                }
                if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.AubY)) {
                    string3 = typedArrayObtainStyledAttributes.getString(C57923yra.StateListAnimator.AubY);
                } else {
                    string3 = AYXKKw;
                    if (string3 == null) {
                        this.hDKMBd = context.getString(C57923yra.Application.AhwBna);
                    }
                    if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.iwGUEr)) {
                        string4 = typedArrayObtainStyledAttributes.getString(C57923yra.StateListAnimator.iwGUEr);
                    } else {
                        string4 = OLrzqt;
                        if (string4 == null) {
                            this.fJNWhG = context.getString(C57923yra.Application.KWHzl);
                        }
                        if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.getNewProxyInstance)) {
                            string5 = typedArrayObtainStyledAttributes.getString(C57923yra.StateListAnimator.getNewProxyInstance);
                        } else {
                            string5 = KWHzl;
                            if (string5 == null) {
                                this.AuCTel = context.getString(C57923yra.Application.EZpvd);
                            }
                            if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.zsXlph)) {
                                string6 = typedArrayObtainStyledAttributes.getString(C57923yra.StateListAnimator.zsXlph);
                            } else {
                                string6 = AhwBna;
                                if (string6 == null) {
                                    this.iwGUEr = context.getString(C57923yra.Application.gEmmrt);
                                }
                                if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.AuCTelauCTel)) {
                                    string7 = typedArrayObtainStyledAttributes.getString(C57923yra.StateListAnimator.AuCTelauCTel);
                                } else {
                                    string7 = gEmmrt;
                                    if (string7 == null) {
                                        this.ejfBZ = context.getString(C57923yra.Application.AYXKKw);
                                    }
                                    if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.sSMYrx)) {
                                        string8 = typedArrayObtainStyledAttributes.getString(C57923yra.StateListAnimator.sSMYrx);
                                    } else {
                                        string8 = djBIcL;
                                        if (string8 == null) {
                                            this.getFieldNames = context.getString(C57923yra.Application.valueOf);
                                        }
                                        this.fetchVPNInfo = new SimpleDateFormat(this.getFieldNames, java.util.Locale.getDefault());
                                        typedArrayObtainStyledAttributes.recycle();
                                        imageView2.animate().setInterpolator(null);
                                        textView.setVisibility(this.AkhnZx ? 0 : 8);
                                        this.QfsBiF.setText(isInEditMode() ? this.ejfBZ : this.fIwbmz);
                                        if (isInEditMode()) {
                                            imageView.setVisibility(8);
                                        } else {
                                            imageView2.setVisibility(8);
                                        }
                                        if ((context instanceof FragmentActivity) && (supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager()) != null && supportFragmentManager.getFragments().size() > 0) {
                                            copydefault(new Date());
                                            return;
                                        }
                                        this.valueOf += context.getClass().getName();
                                        this.DbNXlk = context.getSharedPreferences("ClassicsHeader", 0);
                                        copydefault(new Date(this.DbNXlk.getLong(this.valueOf, java.lang.System.currentTimeMillis())));
                                    }
                                    this.getFieldNames = string8;
                                    this.fetchVPNInfo = new SimpleDateFormat(this.getFieldNames, java.util.Locale.getDefault());
                                    typedArrayObtainStyledAttributes.recycle();
                                    imageView2.animate().setInterpolator(null);
                                    textView.setVisibility(this.AkhnZx ? 0 : 8);
                                    this.QfsBiF.setText(isInEditMode() ? this.ejfBZ : this.fIwbmz);
                                    if (isInEditMode()) {
                                    }
                                    if (context instanceof FragmentActivity) {
                                        copydefault(new Date());
                                        return;
                                    }
                                    this.valueOf += context.getClass().getName();
                                    this.DbNXlk = context.getSharedPreferences("ClassicsHeader", 0);
                                    copydefault(new Date(this.DbNXlk.getLong(this.valueOf, java.lang.System.currentTimeMillis())));
                                }
                                this.ejfBZ = string7;
                                if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.sSMYrx)) {
                                }
                                this.getFieldNames = string8;
                                this.fetchVPNInfo = new SimpleDateFormat(this.getFieldNames, java.util.Locale.getDefault());
                                typedArrayObtainStyledAttributes.recycle();
                                imageView2.animate().setInterpolator(null);
                                textView.setVisibility(this.AkhnZx ? 0 : 8);
                                this.QfsBiF.setText(isInEditMode() ? this.ejfBZ : this.fIwbmz);
                                if (isInEditMode()) {
                                }
                                if (context instanceof FragmentActivity) {
                                }
                                this.valueOf += context.getClass().getName();
                                this.DbNXlk = context.getSharedPreferences("ClassicsHeader", 0);
                                copydefault(new Date(this.DbNXlk.getLong(this.valueOf, java.lang.System.currentTimeMillis())));
                            }
                            this.iwGUEr = string6;
                            if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.AuCTelauCTel)) {
                            }
                            this.ejfBZ = string7;
                            if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.sSMYrx)) {
                            }
                            this.getFieldNames = string8;
                            this.fetchVPNInfo = new SimpleDateFormat(this.getFieldNames, java.util.Locale.getDefault());
                            typedArrayObtainStyledAttributes.recycle();
                            imageView2.animate().setInterpolator(null);
                            textView.setVisibility(this.AkhnZx ? 0 : 8);
                            this.QfsBiF.setText(isInEditMode() ? this.ejfBZ : this.fIwbmz);
                            if (isInEditMode()) {
                            }
                            if (context instanceof FragmentActivity) {
                            }
                            this.valueOf += context.getClass().getName();
                            this.DbNXlk = context.getSharedPreferences("ClassicsHeader", 0);
                            copydefault(new Date(this.DbNXlk.getLong(this.valueOf, java.lang.System.currentTimeMillis())));
                        }
                        this.AuCTel = string5;
                        if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.zsXlph)) {
                        }
                        this.iwGUEr = string6;
                        if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.AuCTelauCTel)) {
                        }
                        this.ejfBZ = string7;
                        if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.sSMYrx)) {
                        }
                        this.getFieldNames = string8;
                        this.fetchVPNInfo = new SimpleDateFormat(this.getFieldNames, java.util.Locale.getDefault());
                        typedArrayObtainStyledAttributes.recycle();
                        imageView2.animate().setInterpolator(null);
                        textView.setVisibility(this.AkhnZx ? 0 : 8);
                        this.QfsBiF.setText(isInEditMode() ? this.ejfBZ : this.fIwbmz);
                        if (isInEditMode()) {
                        }
                        if (context instanceof FragmentActivity) {
                        }
                        this.valueOf += context.getClass().getName();
                        this.DbNXlk = context.getSharedPreferences("ClassicsHeader", 0);
                        copydefault(new Date(this.DbNXlk.getLong(this.valueOf, java.lang.System.currentTimeMillis())));
                    }
                    this.fJNWhG = string4;
                    if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.getNewProxyInstance)) {
                    }
                    this.AuCTel = string5;
                    if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.zsXlph)) {
                    }
                    this.iwGUEr = string6;
                    if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.AuCTelauCTel)) {
                    }
                    this.ejfBZ = string7;
                    if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.sSMYrx)) {
                    }
                    this.getFieldNames = string8;
                    this.fetchVPNInfo = new SimpleDateFormat(this.getFieldNames, java.util.Locale.getDefault());
                    typedArrayObtainStyledAttributes.recycle();
                    imageView2.animate().setInterpolator(null);
                    textView.setVisibility(this.AkhnZx ? 0 : 8);
                    this.QfsBiF.setText(isInEditMode() ? this.ejfBZ : this.fIwbmz);
                    if (isInEditMode()) {
                    }
                    if (context instanceof FragmentActivity) {
                    }
                    this.valueOf += context.getClass().getName();
                    this.DbNXlk = context.getSharedPreferences("ClassicsHeader", 0);
                    copydefault(new Date(this.DbNXlk.getLong(this.valueOf, java.lang.System.currentTimeMillis())));
                }
                this.hDKMBd = string3;
                if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.iwGUEr)) {
                }
                this.fJNWhG = string4;
                if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.getNewProxyInstance)) {
                }
                this.AuCTel = string5;
                if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.zsXlph)) {
                }
                this.iwGUEr = string6;
                if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.AuCTelauCTel)) {
                }
                this.ejfBZ = string7;
                if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.sSMYrx)) {
                }
                this.getFieldNames = string8;
                this.fetchVPNInfo = new SimpleDateFormat(this.getFieldNames, java.util.Locale.getDefault());
                typedArrayObtainStyledAttributes.recycle();
                imageView2.animate().setInterpolator(null);
                textView.setVisibility(this.AkhnZx ? 0 : 8);
                this.QfsBiF.setText(isInEditMode() ? this.ejfBZ : this.fIwbmz);
                if (isInEditMode()) {
                }
                if (context instanceof FragmentActivity) {
                }
                this.valueOf += context.getClass().getName();
                this.DbNXlk = context.getSharedPreferences("ClassicsHeader", 0);
                copydefault(new Date(this.DbNXlk.getLong(this.valueOf, java.lang.System.currentTimeMillis())));
            }
            this.fARcdN = string2;
            if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.AubY)) {
            }
            this.hDKMBd = string3;
            if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.iwGUEr)) {
            }
            this.fJNWhG = string4;
            if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.getNewProxyInstance)) {
            }
            this.AuCTel = string5;
            if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.zsXlph)) {
            }
            this.iwGUEr = string6;
            if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.AuCTelauCTel)) {
            }
            this.ejfBZ = string7;
            if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.sSMYrx)) {
            }
            this.getFieldNames = string8;
            this.fetchVPNInfo = new SimpleDateFormat(this.getFieldNames, java.util.Locale.getDefault());
            typedArrayObtainStyledAttributes.recycle();
            imageView2.animate().setInterpolator(null);
            textView.setVisibility(this.AkhnZx ? 0 : 8);
            this.QfsBiF.setText(isInEditMode() ? this.ejfBZ : this.fIwbmz);
            if (isInEditMode()) {
            }
            if (context instanceof FragmentActivity) {
            }
            this.valueOf += context.getClass().getName();
            this.DbNXlk = context.getSharedPreferences("ClassicsHeader", 0);
            copydefault(new Date(this.DbNXlk.getLong(this.valueOf, java.lang.System.currentTimeMillis())));
        }
        this.fIwbmz = string;
        if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.uzCIH)) {
        }
        this.fARcdN = string2;
        if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.AubY)) {
        }
        this.hDKMBd = string3;
        if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.iwGUEr)) {
        }
        this.fJNWhG = string4;
        if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.getNewProxyInstance)) {
        }
        this.AuCTel = string5;
        if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.zsXlph)) {
        }
        this.iwGUEr = string6;
        if (typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.AuCTelauCTel)) {
        }
        this.ejfBZ = string7;
        if (!typedArrayObtainStyledAttributes.hasValue(C57923yra.StateListAnimator.sSMYrx)) {
        }
        this.getFieldNames = string8;
        this.fetchVPNInfo = new SimpleDateFormat(this.getFieldNames, java.util.Locale.getDefault());
        typedArrayObtainStyledAttributes.recycle();
        imageView2.animate().setInterpolator(null);
        textView.setVisibility(this.AkhnZx ? 0 : 8);
        this.QfsBiF.setText(isInEditMode() ? this.ejfBZ : this.fIwbmz);
        if (isInEditMode()) {
        }
        if (context instanceof FragmentActivity) {
        }
        this.valueOf += context.getClass().getName();
        this.DbNXlk = context.getSharedPreferences("ClassicsHeader", 0);
        copydefault(new Date(this.DbNXlk.getLong(this.valueOf, java.lang.System.currentTimeMillis())));
    }

    @Override // o.AbstractC57948yrz, o.AbstractC57946yrx, o.InterfaceC57935yrm
    public int EZpvd(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, boolean z) {
        if (z) {
            this.QfsBiF.setText(this.fJNWhG);
            if (this.isConnected != null) {
                copydefault(new Date());
            }
        } else {
            this.QfsBiF.setText(this.AuCTel);
        }
        return super.EZpvd(interfaceC57934yrl, z);
    }

    /* JADX INFO: renamed from: o.yrq$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[RefreshState.values().length];
            OLrzqt = iArr;
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                OLrzqt[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[RefreshState.Refreshing.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                OLrzqt[RefreshState.RefreshReleased.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                OLrzqt[RefreshState.ReleaseToRefresh.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                OLrzqt[RefreshState.ReleaseToTwoLevel.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                OLrzqt[RefreshState.Loading.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57908yrL
    public void OLrzqt(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, @androidx.annotation.NonNull RefreshState refreshState, @androidx.annotation.NonNull RefreshState refreshState2) {
        android.widget.ImageView imageView = this.zuBGHE;
        android.widget.TextView textView = this.values;
        switch (AnonymousClass3.OLrzqt[refreshState2.ordinal()]) {
            case 1:
                textView.setVisibility(this.AkhnZx ? 0 : 8);
                break;
            case 2:
                break;
            case 3:
            case 4:
                this.QfsBiF.setText(this.ejfBZ);
                imageView.setVisibility(8);
                return;
            case 5:
                this.QfsBiF.setText(this.hDKMBd);
                imageView.animate().rotation(180.0f);
                return;
            case 6:
                this.QfsBiF.setText(this.iwGUEr);
                imageView.animate().rotation(0.0f);
                return;
            case 7:
                imageView.setVisibility(8);
                textView.setVisibility(this.AkhnZx ? 4 : 8);
                this.QfsBiF.setText(this.fARcdN);
                return;
            default:
                return;
        }
        this.QfsBiF.setText(this.fIwbmz);
        imageView.setVisibility(0);
        imageView.animate().rotation(0.0f);
    }

    public C57939yrq copydefault(Date date) {
        this.isConnected = date;
        this.values.setText(this.fetchVPNInfo.format(date));
        if (this.DbNXlk != null && !isInEditMode()) {
            this.DbNXlk.edit().putLong(this.valueOf, date.getTime()).apply();
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(I)Lo/yrz; */
    @Override // o.AbstractC57948yrz
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C57939yrq AEQbTJ(@androidx.annotation.ColorInt int i) {
        this.values.setTextColor((16777215 & i) | (-872415232));
        return (C57939yrq) super.AEQbTJ(i);
    }
}

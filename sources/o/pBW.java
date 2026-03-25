package o;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.ui.view.pricewindow.PriceWindowData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC37822pBz;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class pBW extends C57662yme {
    public C33609mzg AEQbTJ;
    public android.widget.TextView AYXKKw;
    public android.widget.RadioGroup EZpvd;
    public android.widget.TextView KWHzl;
    public android.widget.LinearLayout OLrzqt;
    public ViewOnClickListenerC39801pzG copydefault;
    public AppCompatSeekBar djBIcL;
    public android.widget.TextView valueOf;

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return layoutInflater.inflate(C35964oKf.Application.iwGUEr, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.EZpvd = (android.widget.RadioGroup) view.findViewById(C35964oKf.StateListAnimator.RYPzIz);
        this.KWHzl = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.MediaBrowserCompatMediaItem);
        this.djBIcL = (AppCompatSeekBar) view.findViewById(C35964oKf.StateListAnimator.cancelNotification);
        this.AEQbTJ = (C33609mzg) view.findViewById(C35964oKf.StateListAnimator.OuxcSI);
        this.OLrzqt = (android.widget.LinearLayout) view.findViewById(C35964oKf.StateListAnimator.OGitdB);
        this.valueOf = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.removeQueueItemAt);
        this.copydefault = (ViewOnClickListenerC39801pzG) view.findViewById(C35964oKf.StateListAnimator.RIKbBf);
        this.AYXKKw = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.MediaControllerCompatMediaControllerImplApi21ExtraCallback);
        OLrzqt();
        copydefault();
        android.widget.RadioGroup radioGroup = this.EZpvd;
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.pBV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.RadioGroup radioGroup2, int i) {
                    pBW.AEQbTJ(this.copydefault, radioGroup2, i);
                }
            });
        }
        AppCompatSeekBar appCompatSeekBar = this.djBIcL;
        if (appCompatSeekBar != null) {
            appCompatSeekBar.setOnSeekBarChangeListener(new Activity());
        }
        C33609mzg c33609mzg = this.AEQbTJ;
        if (c33609mzg != null) {
            c33609mzg.setChecked(PriceWindowData.AEQbTJ.djBIcL());
        }
        C33609mzg c33609mzg2 = this.AEQbTJ;
        if (c33609mzg2 != null) {
            c33609mzg2.setOnClickListener(new View.OnClickListener() { // from class: o.pBX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    pBW.OLrzqt(this.copydefault, view2);
                }
            });
        }
        android.widget.LinearLayout linearLayout = this.OLrzqt;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.pBY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    pBW.AEQbTJ(this.OLrzqt, view2);
                }
            });
        }
        android.widget.TextView textView = this.valueOf;
        if (textView != null) {
            textView.setText(PriceWindowData.AEQbTJ.KWHzl() + " " + C33070mpX.AYXKKw(C35964oKf.Fragment.dHguZz));
        }
        PriceWindowData priceWindowData = PriceWindowData.AEQbTJ;
        OLrzqt(priceWindowData.AhwBna());
        ViewOnClickListenerC39801pzG viewOnClickListenerC39801pzG = this.copydefault;
        if (viewOnClickListenerC39801pzG != null) {
            viewOnClickListenerC39801pzG.setLevel(priceWindowData.AhwBna());
        }
        ViewOnClickListenerC39801pzG viewOnClickListenerC39801pzG2 = this.copydefault;
        if (viewOnClickListenerC39801pzG2 != null) {
            viewOnClickListenerC39801pzG2.setOnItemClickListener(new Function1() { // from class: o.pCe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pBW.EZpvd(this.KWHzl, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        view.post(new java.lang.Runnable() { // from class: o.pCd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                pBW.KWHzl(this.OLrzqt);
            }
        });
    }

    public static final void AEQbTJ(pBW pbw, android.widget.RadioGroup radioGroup, int i) {
        pbw.KWHzl(i);
    }

    public static final class Activity implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        }

        public Activity() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean z) {
            android.widget.TextView textView = pBW.this.KWHzl;
            if (textView != null) {
                textView.setText(pBW.this.EZpvd(i));
            }
            SPUtils.put("chart_price_window_alpha", java.lang.Integer.valueOf(i));
            pBO.dxcTrN.copydefault(i);
        }
    }

    public static final void OLrzqt(pBW pbw, android.view.View view) {
        C33609mzg c33609mzg = pbw.AEQbTJ;
        if (c33609mzg != null) {
            if (c33609mzg.isChecked()) {
                c33609mzg.setChecked(false);
                SPUtils.put("chart_price_window_change_percent", java.lang.Boolean.FALSE);
            } else {
                c33609mzg.setChecked(true);
                SPUtils.put("chart_price_window_change_percent", java.lang.Boolean.TRUE);
            }
        }
        pBO.dxcTrN.DbNXlk();
    }

    public static final void AEQbTJ(pBW pbw, android.view.View view) {
        pbw.dismiss();
        androidx.fragment.app.FragmentManager supportFragmentManager = pbw.requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        new pBS().show(supportFragmentManager, pBW.class.getSimpleName());
    }

    public static final Unit EZpvd(pBW pbw, int i) {
        SPUtils.put("chart_price_window_text_level", java.lang.Integer.valueOf(i));
        pBO pbo = pBO.dxcTrN;
        pbo.DbNXlk();
        pbw.OLrzqt(i);
        AbstractC37822pBz.Activity activity = AbstractC37822pBz.Companion;
        java.lang.Integer num = SPUtils.getInt("chart_price_window_zoom_level", activity.KWHzl());
        int iOLrzqt = activity.OLrzqt();
        if (num == null || num.intValue() != iOLrzqt) {
            pbo.AhwBna(i);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(pBW pbw) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) pbw, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt(int i) {
        java.lang.String strAYXKKw;
        if (i == 0) {
            strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.DkGEDn);
        } else if (i == 1) {
            strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.RcLksq);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.aPFruk);
        }
        android.widget.TextView textView = this.AYXKKw;
        if (textView != null) {
            textView.setText(strAYXKKw);
        }
    }

    private final void OLrzqt() {
        AppCompatSeekBar appCompatSeekBar = this.djBIcL;
        if (appCompatSeekBar != null) {
            appCompatSeekBar.setMax(255);
            appCompatSeekBar.setProgress(SPUtils.getInt("chart_price_window_alpha", 255).intValue());
            android.widget.TextView textView = this.KWHzl;
            if (textView != null) {
                textView.setText(EZpvd(appCompatSeekBar.getProgress()));
            }
        }
    }

    public final void copydefault() {
        if (C37825pCb.KWHzl.KWHzl()) {
            android.widget.RadioGroup radioGroup = this.EZpvd;
            if (radioGroup != null) {
                radioGroup.check(C35964oKf.StateListAnimator.HJWChPRGtXKC);
                return;
            }
            return;
        }
        android.widget.RadioGroup radioGroup2 = this.EZpvd;
        if (radioGroup2 != null) {
            radioGroup2.check(C35964oKf.StateListAnimator.DIIpTV);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String EZpvd(int i) {
        return yII.EZpvd((((double) i) / 255.0d) * ((double) 100)) + "%";
    }

    public final void KWHzl(int i) {
        if (i == C35964oKf.StateListAnimator.HJWChPRGtXKC) {
            C37825pCb.KWHzl.gEmmrt();
            pBO pbo = pBO.dxcTrN;
            pbo.KWHzl(true);
            pbo.EZpvd(true);
            return;
        }
        if (i == C35964oKf.StateListAnimator.DIIpTV) {
            C37825pCb.KWHzl.AYXKKw();
            pBO pbo2 = pBO.dxcTrN;
            pbo2.KWHzl(false);
            pbo2.EZpvd(false);
        }
    }
}

package o;

import android.widget.CompoundButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.dns.WebViewConfig;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mPt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C32107mPt extends android.widget.FrameLayout {
    public final java.lang.String EZpvd;
    public AbstractC32039mNf KWHzl;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32107mPt(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32107mPt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32107mPt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = "webviewConfig";
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C31976mKx.Application.zuBGHE, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.KWHzl = (AbstractC32039mNf) viewDataBindingInflate;
        AEQbTJ();
    }

    public final void EZpvd() {
        WebViewConfig webViewConfig = (WebViewConfig) C48787ucK.AEQbTJ.EZpvd(this.EZpvd, WebViewConfig.class);
        android.widget.TextView textView = this.KWHzl.AkhnZx;
        java.lang.String dohOpen = webViewConfig != null ? webViewConfig.getDohOpen() : null;
        textView.setText("Web路由云开关:" + dohOpen + " Result = " + C43324rnD.AEQbTJ.KWHzl());
    }

    public final void AEQbTJ() {
        java.lang.String property = java.lang.System.getProperty("http.proxyHost");
        java.lang.String property2 = java.lang.System.getProperty("http.proxyPort");
        boolean zOLrzqt = C43453rpa.AEQbTJ.OLrzqt();
        this.KWHzl.valueOf.setText(property + " " + property2 + " " + zOLrzqt);
        EZpvd();
        java.lang.String string = SPUtils.getString("sp_web_doh_config_locale", MultiTransferSignData.DEFAULT_INTERVAL);
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != 48) {
                if (iHashCode != 49) {
                    if (iHashCode == 1444 && string.equals(MultiTransferSignData.DEFAULT_INTERVAL)) {
                        this.KWHzl.AYXKKw.setChecked(false);
                    }
                } else if (string.equals("1")) {
                    this.KWHzl.AYXKKw.setChecked(true);
                }
            } else if (string.equals("0")) {
                this.KWHzl.AYXKKw.setChecked(false);
            }
        }
        this.KWHzl.AYXKKw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.mPp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C32107mPt.KWHzl(this.EZpvd, compoundButton, z);
            }
        });
        this.KWHzl.gEmmrt.setText("路由开关:" + C43371rny.OLrzqt.KWHzl() + " " + C33513mxq.EZpvd(getContext()));
        C43372rnz c43372rnz = C43372rnz.copydefault;
        DohTypeEnum dohTypeEnum = DohTypeEnum.HTTP;
        java.lang.String host$default = C43372rnz.getHost$default(c43372rnz, dohTypeEnum, false, null, 4, null);
        java.util.ArrayList<java.lang.String> arrayListKWHzl = host$default != null ? c43372rnz.KWHzl(dohTypeEnum, host$default) : null;
        if (arrayListKWHzl != null) {
            for (java.lang.String str : arrayListKWHzl) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C32094mPg c32094mPg = new C32094mPg(context);
                c32094mPg.setData(host$default, str);
                this.KWHzl.KWHzl.addView(c32094mPg);
            }
        }
        C43372rnz c43372rnz2 = C43372rnz.copydefault;
        DohTypeEnum dohTypeEnum2 = DohTypeEnum.V5;
        java.lang.String host$default2 = C43372rnz.getHost$default(c43372rnz2, dohTypeEnum2, false, null, 4, null);
        java.util.ArrayList<java.lang.String> arrayListKWHzl2 = host$default2 != null ? c43372rnz2.KWHzl(dohTypeEnum2, host$default2) : null;
        if (arrayListKWHzl2 != null) {
            for (java.lang.String str2 : arrayListKWHzl2) {
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                C32094mPg c32094mPg2 = new C32094mPg(context2);
                c32094mPg2.setData(host$default2, str2);
                this.KWHzl.EZpvd.addView(c32094mPg2);
            }
        }
        C43372rnz c43372rnz3 = C43372rnz.copydefault;
        DohTypeEnum dohTypeEnum3 = DohTypeEnum.DEXPRI;
        java.lang.String host$default3 = C43372rnz.getHost$default(c43372rnz3, dohTypeEnum3, false, null, 4, null);
        java.util.ArrayList<java.lang.String> arrayListKWHzl3 = host$default3 != null ? c43372rnz3.KWHzl(dohTypeEnum3, host$default3) : null;
        if (arrayListKWHzl3 != null) {
            for (java.lang.String str3 : arrayListKWHzl3) {
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                C32094mPg c32094mPg3 = new C32094mPg(context3);
                c32094mPg3.setData(host$default3, str3);
                this.KWHzl.OLrzqt.addView(c32094mPg3);
            }
        }
    }

    public static final void KWHzl(C32107mPt c32107mPt, android.widget.CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            if (z) {
                SPUtils.put("sp_web_doh_config_locale", "1");
            } else {
                SPUtils.put("sp_web_doh_config_locale", "0");
            }
            c32107mPt.EZpvd();
        }
    }
}

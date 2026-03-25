package com.okinc.buysell.ui.transaction.convert;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC31570lwX;
import o.C31351lsQ;
import o.C31722mBm;
import o.C33054mpH;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33512mxp;
import o.C52761wXj;
import o.C56390yDp;
import o.C56424yEw;
import o.lTL;
import o.pTA;
import o.pTB;
import o.pUU;
import o.yCM;

/* JADX INFO: loaded from: classes15.dex */
public final class OKXLiteConvertTransactionDetailActivity extends lTL<AbstractC31570lwX> {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;

    @yCM
    public C31722mBm crAssetRepository;
    public String fJNWhG;
    public final int isConnected = C31351lsQ.ActionBar.OBJEWx;
    public String fARcdN = "";
    public String AkhnZx = "";
    public String AuCTel = "";
    public String fetchVPNInfo = "";
    public String DbNXlk = "";
    public String AYXKKw = "";
    public String values = "";
    public String gEmmrt = "";
    public String djBIcL = "";
    public Long valueOf = 0L;
    public Integer AhwBna = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33009moP
    public int bd_() {
        return this.isConnected;
    }

    public final C31722mBm valueOf() {
        C31722mBm c31722mBm = this.crAssetRepository;
        if (c31722mBm != null) {
            return c31722mBm;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.transaction.convert.OKXLiteConvertTransactionDetailActivity.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.lTL, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ImageView backImage = ((AbstractC31570lwX) AhwBna()).OLrzqt.getBackImage();
        if (backImage != null) {
            backImage.setColorFilter(C33070mpX.copydefault(C52761wXj.Activity.HJWChPRGtXKC));
        }
        ((AbstractC31570lwX) AhwBna()).OLrzqt.getTitle().setTextAppearance(C52761wXj.LoaderManager.RJOkX);
        djBIcL();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        Intent intent = getIntent();
        setTitle(intent.getStringExtra("title_key"));
        this.fARcdN = intent.getStringExtra("toCurrencyName_key");
        this.AkhnZx = intent.getStringExtra("toCurrencyFullName_key");
        this.AuCTel = intent.getStringExtra("toCurrencyIcon_key");
        this.fetchVPNInfo = intent.getStringExtra("toAmount_key");
        this.DbNXlk = intent.getStringExtra("fromCurrencyName_key");
        this.AYXKKw = intent.getStringExtra("fromCurrencyFullName_key");
        this.values = intent.getStringExtra("fromCurrencyIcon_key");
        this.gEmmrt = intent.getStringExtra("fromAmount_key");
        this.djBIcL = intent.getStringExtra("convertRate_key");
        this.valueOf = Long.valueOf(intent.getLongExtra("eventTime_key", 0L));
        this.AhwBna = Integer.valueOf(intent.getIntExtra("eventType_key", 0));
        this.fJNWhG = intent.getStringExtra("transactionId_key");
        pUU.EZpvd(getTAG(), "eventType = " + this.AhwBna + " | fromCurrencyName = " + this.DbNXlk + " | toCurrencyName = " + this.fARcdN);
        if (C33129mqd.OLrzqt((CharSequence) this.fJNWhG)) {
            showLoading();
            ((AbstractC31570lwX) AhwBna()).KWHzl.setVisibility(8);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OKXLiteConvertTransactionDetailActivity$initView$2(this, null), 3, null);
            return;
        }
        AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw() {
        String upperCase;
        String upperCase2;
        String upperCase3;
        String upperCase4;
        String localized$default;
        AbstractC31570lwX abstractC31570lwX = (AbstractC31570lwX) AhwBna();
        abstractC31570lwX.AhwBna.setText(OLrzqt());
        ImageView imageView = abstractC31570lwX.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.loadUrl$default(imageView, this.AuCTel, null, 0, 0, 14, null);
        TextView textView = abstractC31570lwX.getNewProxyInstance;
        String str = this.fARcdN;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
        } else {
            upperCase = null;
        }
        textView.setText(upperCase);
        abstractC31570lwX.hDKMBd.setText(this.AkhnZx);
        TextView textView2 = abstractC31570lwX.fJNWhG;
        String str2 = this.fetchVPNInfo;
        textView2.setText("+ " + (str2 != null ? pTB.formatLocalized$default(str2, null, 1, null) : null));
        TextView textView3 = abstractC31570lwX.fIwbmz;
        String str3 = this.fARcdN;
        if (str3 != null) {
            upperCase2 = str3.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        } else {
            upperCase2 = null;
        }
        textView3.setText(upperCase2);
        abstractC31570lwX.gEmmrt.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.AubY));
        ImageView imageView2 = abstractC31570lwX.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C33054mpH.loadUrl$default(imageView2, this.values, null, 0, 0, 14, null);
        TextView textView4 = abstractC31570lwX.isConnected;
        String str4 = this.DbNXlk;
        if (str4 != null) {
            upperCase3 = str4.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "");
        } else {
            upperCase3 = null;
        }
        textView4.setText(upperCase3);
        abstractC31570lwX.AkhnZx.setText(this.AYXKKw);
        TextView textView5 = abstractC31570lwX.valueOf;
        String str5 = this.gEmmrt;
        textView5.setText("- " + (str5 != null ? pTB.formatLocalized$default(str5, null, 1, null) : null));
        TextView textView6 = abstractC31570lwX.values;
        String str6 = this.DbNXlk;
        if (str6 != null) {
            upperCase4 = str6.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase4, "");
        } else {
            upperCase4 = null;
        }
        textView6.setText(upperCase4);
        TextView textView7 = abstractC31570lwX.AYXKKw;
        Long l = this.valueOf;
        textView7.setText(pTA.formatStandardDate$default(new Date(l != null ? l.longValue() : 0L), null, 1, null));
        TextView textView8 = abstractC31570lwX.djBIcL;
        Long l2 = this.valueOf;
        textView8.setText(pTA.formatTime$default(new Date(l2 != null ? l2.longValue() : 0L), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null));
        TextView textView9 = abstractC31570lwX.fARcdN;
        if (C33129mqd.OLrzqt((CharSequence) this.djBIcL)) {
            String str7 = this.djBIcL;
            localized$default = str7 != null ? pTB.formatLocalized$default(str7, null, 1, null) : null;
        } else {
            localized$default = "--";
        }
        textView9.setText(localized$default);
        TextView textView10 = abstractC31570lwX.fJNWhG;
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        textView10.setTextColor(C33512mxp.tradeRiseDefault$default(c33512mxp, this, 0.0f, 2, null));
        abstractC31570lwX.fIwbmz.setTextColor(C33512mxp.tradeRiseDefault$default(c33512mxp, this, 0.0f, 2, null));
        abstractC31570lwX.valueOf.setTextColor(C33512mxp.tradeFallDefault$default(c33512mxp, this, 0.0f, 2, null));
        abstractC31570lwX.values.setTextColor(C33512mxp.tradeFallDefault$default(c33512mxp, this, 0.0f, 2, null));
        abstractC31570lwX.KWHzl.setVisibility(0);
    }

    /* JADX DEBUG: Possible override for method o.lTL.OLrzqt()V */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String OLrzqt() {
        Integer num;
        String upperCase;
        String upperCase2;
        Integer num2 = this.AhwBna;
        String str = "";
        if ((num2 != null && num2.intValue() == 33) || ((num = this.AhwBna) != null && num.intValue() == 34)) {
            int i = C31351lsQ.Activity.wlaJM;
            Pair[] pairArr = new Pair[2];
            String str2 = this.DbNXlk;
            if (str2 != null) {
                upperCase2 = str2.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                if (upperCase2 == null) {
                    upperCase2 = "";
                }
            }
            pairArr[0] = C56390yDp.OLrzqt("fromCrypto", upperCase2);
            String str3 = this.fARcdN;
            if (str3 != null) {
                String upperCase3 = str3.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                if (upperCase3 != null) {
                    str = upperCase3;
                }
            }
            pairArr[1] = C56390yDp.OLrzqt("toCrypto", str);
            return C33069mpW.KWHzl(this, i, (Map<String, ? extends Object>) C56424yEw.gEmmrt(pairArr));
        }
        int i2 = C31351lsQ.Activity.AuCTelauCTel;
        Pair[] pairArr2 = new Pair[2];
        String str4 = this.DbNXlk;
        if (str4 != null) {
            upperCase = str4.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            if (upperCase == null) {
                upperCase = "";
            }
        }
        pairArr2[0] = C56390yDp.OLrzqt("cryptoFrom", upperCase);
        String str5 = this.fARcdN;
        if (str5 != null) {
            String upperCase4 = str5.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase4, "");
            if (upperCase4 != null) {
                str = upperCase4;
            }
        }
        pairArr2[1] = C56390yDp.OLrzqt("cryptoTo", str);
        return C33069mpW.KWHzl(this, i2, (Map<String, ? extends Object>) C56424yEw.gEmmrt(pairArr2));
    }

    @Override // o.lTL, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.lTL, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.lTL, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.lTL, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

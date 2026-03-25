package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.buysell.ui.transaction.convert.view.LiteLimitCoinData;
import com.okinc.buysell.ui.transaction.convert.view.LiteLimitTransactionData;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;

/* JADX INFO: loaded from: classes23.dex */
public final class lTN extends AbstractActivityC33010moQ<AbstractC31470lud> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public java.lang.String fIwbmz;
    public LiteLimitCoinData isConnected;
    public final int DbNXlk = C31351lsQ.ActionBar.AhwBna;
    public final C43316rmw OLrzqt = new C43316rmw();
    public java.util.ArrayList<java.lang.Object> values = new java.util.ArrayList<>();
    public java.lang.String AuCTel = "";
    public java.lang.String fJNWhG = "";
    public java.lang.String fARcdN = "";
    public java.lang.String ejfBZ = "";
    public java.lang.String AYXKKw = "";
    public java.lang.String djBIcL = "";
    public java.lang.String gEmmrt = "";
    public java.lang.String valueOf = "";
    public java.lang.String fetchVPNInfo = "";
    public java.lang.Long EZpvd = 0L;
    public java.lang.String AEQbTJ = "";
    public java.lang.String copydefault = "";
    public java.lang.String AhwBna = "";
    public java.util.ArrayList<LiteLimitTransactionData> AkhnZx = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33009moP
    public int bd_() {
        return this.DbNXlk;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lTN.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.AbstractActivityC33010moQ, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gEmmrt();
    }

    @Override // o.AbstractActivityC33010moQ, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        djBIcL();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        android.content.Intent intent = getIntent();
        this.AuCTel = intent.getStringExtra("lite_limit_detail_to_name");
        this.fJNWhG = intent.getStringExtra("lite_limit_to_detail_full_name");
        this.fARcdN = intent.getStringExtra("lite_limit_detail_to_icon");
        this.ejfBZ = intent.getStringExtra("lite_limit_detail_to_amount");
        this.AYXKKw = intent.getStringExtra("lite_limit_detail_name");
        this.djBIcL = intent.getStringExtra("lite_limit_from_detail_full_name");
        this.gEmmrt = intent.getStringExtra("lite_limit_detail_from_icon");
        this.valueOf = intent.getStringExtra("lite_limit_detail_from_amount");
        this.fIwbmz = intent.getStringExtra("lite_limit_detail_order_id");
        this.fetchVPNInfo = intent.getStringExtra("lite_limit_detail_limit_price");
        this.EZpvd = java.lang.Long.valueOf(intent.getLongExtra("lite_limit_detail_date", 0L));
        this.AEQbTJ = intent.getStringExtra("lite_limit_detail_status");
        this.copydefault = intent.getStringExtra("lite_limit_detail_fee");
        this.AhwBna = intent.getStringExtra("lite_limit_detail_filled_amount");
        ((AbstractC31470lud) AhwBna()).EZpvd.getTitle().setTextAppearance(C52761wXj.LoaderManager.RJOkX);
        AEQbTJ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ() {
        ((AbstractC31470lud) AhwBna()).AEQbTJ.setLayoutManager(new LinearLayoutManager(this));
        ((AbstractC31470lud) AhwBna()).AEQbTJ.setAdapter(this.OLrzqt);
        this.OLrzqt.register(LiteLimitCoinData.class, new lTM(this));
        this.OLrzqt.register(LiteLimitTransactionData.class, new lTS());
        this.OLrzqt.setItems(this.values);
    }

    private final void djBIcL() {
        java.lang.String str = this.gEmmrt;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = this.AYXKKw;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = this.djBIcL;
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String str7 = this.valueOf;
        java.lang.String str8 = str7 == null ? "" : str7;
        java.lang.String str9 = this.fARcdN;
        java.lang.String str10 = str9 == null ? "" : str9;
        java.lang.String str11 = this.AuCTel;
        java.lang.String str12 = str11 == null ? "" : str11;
        java.lang.String str13 = this.fJNWhG;
        java.lang.String str14 = str13 == null ? "" : str13;
        java.lang.String str15 = this.ejfBZ;
        java.lang.String str16 = str15 == null ? "" : str15;
        java.lang.String str17 = this.AhwBna;
        this.isConnected = new LiteLimitCoinData(str2, str4, str6, str8, str10, str12, str14, str16, str17 == null ? "" : str17);
        this.AkhnZx = KWHzl();
        java.util.ArrayList<java.lang.Object> arrayList = this.values;
        LiteLimitCoinData liteLimitCoinData = this.isConnected;
        arrayList.add(liteLimitCoinData != null ? liteLimitCoinData : "");
        java.util.ArrayList<java.lang.Object> arrayList2 = this.values;
        java.util.ArrayList<LiteLimitTransactionData> arrayList3 = this.AkhnZx;
        if (arrayList3 == null) {
            arrayList3 = new java.util.ArrayList<>();
        }
        arrayList2.addAll(arrayList3);
    }

    public final java.util.ArrayList<LiteLimitTransactionData> KWHzl() {
        java.lang.String str;
        java.util.ArrayList<LiteLimitTransactionData> arrayList = new java.util.ArrayList<>();
        java.lang.String string = getString(C31351lsQ.Activity.djBIcL);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str2 = this.AEQbTJ;
        arrayList.add(new LiteLimitTransactionData(string, (java.lang.String) null, str2 == null ? "" : str2, (java.lang.String) null, 10, (DefaultConstructorMarker) null));
        java.lang.String string2 = getString(C31351lsQ.Activity.AEQbTJ);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.Long l = this.EZpvd;
        java.lang.String date$default = pTA.formatDate$default(new Date(l != null ? l.longValue() : 0L), OKDateEnum.DATE_FORMAT_STANDARD, null, null, 6, null);
        java.lang.Long l2 = this.EZpvd;
        arrayList.add(new LiteLimitTransactionData(string2, date$default, (java.lang.String) null, pTA.formatTime$default(new Date(l2 != null ? l2.longValue() : 0L), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null), 4, (DefaultConstructorMarker) null));
        java.lang.String string3 = getString(C31351lsQ.Activity.EZpvd);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        java.lang.String str3 = this.fetchVPNInfo;
        java.lang.String localized$default = "--";
        if (str3 == null || str3.length() == 0) {
            str = "--";
        } else {
            java.lang.String localized$default2 = this.fetchVPNInfo;
            if (localized$default2 == null) {
                localized$default2 = pTB.formatLocalized$default("", null, 1, null);
            }
            str = localized$default2;
        }
        arrayList.add(new LiteLimitTransactionData(string3, str, (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null));
        java.lang.String string4 = getString(C31351lsQ.Activity.KWHzl);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        java.lang.String str4 = this.copydefault;
        if (str4 != null && str4.length() != 0 && (localized$default = this.copydefault) == null) {
            localized$default = pTB.formatLocalized$default("", null, 1, null);
        }
        arrayList.add(new LiteLimitTransactionData(string4, localized$default, (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null));
        return arrayList;
    }

    @Override // o.AbstractActivityC33010moQ, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33010moQ, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33010moQ, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

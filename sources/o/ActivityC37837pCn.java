package o;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.reflect.TypeToken;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.library.indicator.Expression;
import com.okinc.kline.ui.view.model.IndicatorBean;
import com.okinc.kline.ui.view.model.IndicatorDataReq;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC37837pCn;
import o.ActivityC37844pCu;
import o.C32392mcI;
import o.C33565myp;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pCn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC37837pCn extends AbstractActivityC33041mov {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public C39587pvE AYXKKw;
    public RecyclerView DbNXlk;
    public boolean KWHzl;
    public android.widget.TextView copydefault;
    public C52794wYp djBIcL;
    public java.lang.String fetchVPNInfo;
    public AbstractC36262oVg gEmmrt;
    public C52794wYp isConnected;
    public java.util.ArrayList<oLO> OLrzqt = new java.util.ArrayList<>();
    public int AEQbTJ = C55298xhM.dp2px$default(32.0f, null, 1, null);
    public java.util.ArrayList<java.lang.Object> values = new java.util.ArrayList<>();
    public final C59534zip valueOf = new C59534zip();
    public java.lang.String AhwBna = "ds0";
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.pCo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37837pCn.EZpvd(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.pCn$Application */
    public static final class Application extends TypeToken<java.util.ArrayList<Expression.Parameter>> {
    }

    /* JADX INFO: renamed from: o.pCn$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pCn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final LinearLayoutManager KWHzl() {
        return (LinearLayoutManager) this.AkhnZx.getValue();
    }

    public static final LinearLayoutManager EZpvd(ActivityC37837pCn activityC37837pCn) {
        return new LinearLayoutManager(activityC37837pCn, 1, false);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            getDelegate().setLocalNightMode(2);
        } else if (!Intrinsics.EZpvd((java.lang.Object) "kline_white", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark")) && C33492mxV.OLrzqt()) {
            getDelegate().setLocalNightMode(2);
        } else {
            getDelegate().setLocalNightMode(1);
        }
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C35964oKf.Application.EZpvd);
        OLrzqt();
        AYXKKw();
        RecyclerView recyclerView = this.DbNXlk;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(KWHzl());
        RecyclerView recyclerView3 = this.DbNXlk;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recyclerView2 = recyclerView3;
        }
        recyclerView2.setAdapter(this.valueOf);
        copydefault();
        this.valueOf.notifyDataSetChanged();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.pCr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC37837pCn.AYXKKw(this.copydefault);
            }
        });
    }

    public static final void AYXKKw(ActivityC37837pCn activityC37837pCn) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC37837pCn, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final boolean OLrzqt() {
        android.view.View viewFindViewById = findViewById(C35964oKf.StateListAnimator.UfveVb);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        C33537myN c33537myN = (C33537myN) viewFindViewById;
        c33537myN.setTitle(getIntent().getStringExtra("Title"));
        java.lang.String stringExtra = getIntent().getStringExtra("IndicatorName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.fetchVPNInfo = stringExtra;
        c33537myN.setSubTitle("");
        this.DbNXlk = (RecyclerView) findViewById(C35964oKf.StateListAnimator.arDRxL);
        this.djBIcL = (C52794wYp) findViewById(C35964oKf.StateListAnimator.dvKsVJ);
        this.isConnected = (C52794wYp) findViewById(C35964oKf.StateListAnimator.fFgQHt);
        this.copydefault = (android.widget.TextView) findViewById(C35964oKf.StateListAnimator.gwwfep);
        C52794wYp c52794wYp = this.isConnected;
        C52794wYp c52794wYp2 = null;
        if (c52794wYp == null) {
            Intrinsics.gEmmrt("");
            c52794wYp = null;
        }
        c52794wYp.setText(getString(C35964oKf.Fragment.hfeTOA));
        C52794wYp c52794wYp3 = this.isConnected;
        if (c52794wYp3 == null) {
            Intrinsics.gEmmrt("");
            c52794wYp3 = null;
        }
        c52794wYp3.setOnClickListener(new View.OnClickListener() { // from class: o.pCm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC37837pCn.AEQbTJ(this.copydefault, view);
            }
        });
        C52794wYp c52794wYp4 = this.djBIcL;
        if (c52794wYp4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c52794wYp2 = c52794wYp4;
        }
        c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: o.pCp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC37837pCn.OLrzqt(this.copydefault, view);
            }
        });
        C33565myp.EZpvd().copydefault(this, new C33565myp.Application() { // from class: o.pCq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C33565myp.Application
            public final void EZpvd(int i, boolean z) {
                ActivityC37837pCn.OLrzqt(this.AEQbTJ, i, z);
            }
        });
        return true;
    }

    public static final void AEQbTJ(ActivityC37837pCn activityC37837pCn, android.view.View view) {
        AbstractC36262oVg abstractC36262oVg = activityC37837pCn.gEmmrt;
        AbstractC36262oVg abstractC36262oVg2 = null;
        if (abstractC36262oVg == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg = null;
        }
        int iDbNXlk = abstractC36262oVg.DbNXlk();
        for (int i = 0; i < iDbNXlk; i++) {
            AbstractC36262oVg abstractC36262oVg3 = activityC37837pCn.gEmmrt;
            if (abstractC36262oVg3 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg3 = null;
            }
            Expression.Parameter parameterEZpvd = abstractC36262oVg3.EZpvd(i);
            parameterEZpvd.setTempValue(parameterEZpvd.getDefaultValue());
        }
        AbstractC36262oVg abstractC36262oVg4 = activityC37837pCn.gEmmrt;
        if (abstractC36262oVg4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC36262oVg2 = abstractC36262oVg4;
        }
        java.util.ArrayList<Expression.Parameter> arrayListIsConnected = abstractC36262oVg2.isConnected();
        Intrinsics.checkNotNullExpressionValue(arrayListIsConnected, "");
        for (Expression.Parameter parameter : arrayListIsConnected) {
            parameter.setIsShowTemp(parameter.getIsShowDefaultValue());
            parameter.setColorTemp(parameter.getColorDefaultValue());
            parameter.setColorBlkTemp(parameter.getColorBlkDefaultValue());
        }
        activityC37837pCn.valueOf.notifyDataSetChanged();
    }

    public static final void OLrzqt(ActivityC37837pCn activityC37837pCn, android.view.View view) {
        activityC37837pCn.EZpvd();
    }

    public static final void OLrzqt(ActivityC37837pCn activityC37837pCn, int i, boolean z) {
        if (activityC37837pCn.KWHzl && !z) {
            activityC37837pCn.AEQbTJ();
        }
        activityC37837pCn.KWHzl = z;
    }

    private final void AEQbTJ() {
        AbstractC36262oVg abstractC36262oVg = this.gEmmrt;
        if (abstractC36262oVg == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg = null;
        }
        int iDbNXlk = abstractC36262oVg.DbNXlk();
        for (int i = 0; i < iDbNXlk; i++) {
            AbstractC36262oVg abstractC36262oVg2 = this.gEmmrt;
            if (abstractC36262oVg2 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg2 = null;
            }
            Expression.Parameter parameterEZpvd = abstractC36262oVg2.EZpvd(i);
            if (parameterEZpvd.getTempValue() < parameterEZpvd.getMinValue()) {
                parameterEZpvd.setTempValue(parameterEZpvd.getMinValue());
            }
        }
        this.valueOf.notifyDataSetChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [214=5, 233=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void copydefault() {
        java.lang.String str = this.fetchVPNInfo;
        AbstractC36262oVg abstractC36262oVg = null;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        java.lang.String str2 = this.AhwBna;
        java.lang.String str3 = this.fetchVPNInfo;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        }
        java.lang.String strAEQbTJ = C36278oVw.AEQbTJ(str2, KWHzl(str3));
        if (!android.text.TextUtils.isEmpty(strAEQbTJ)) {
            str = strAEQbTJ;
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        java.lang.String str4 = this.AhwBna;
        java.lang.String str5 = this.fetchVPNInfo;
        if (str5 == null) {
            Intrinsics.gEmmrt("");
            str5 = null;
        }
        AbstractC36262oVg abstractC36262oVgOLrzqt = c36246oUrCopydefault.OLrzqt(str4 + ".indic" + str5);
        java.lang.String strEjfBZ = abstractC36262oVgOLrzqt != null ? abstractC36262oVgOLrzqt.ejfBZ() : null;
        java.lang.String str6 = this.fetchVPNInfo;
        if (str6 == null) {
            Intrinsics.gEmmrt("");
            str6 = null;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) strEjfBZ, (java.lang.Object) str6)) {
            java.lang.String str7 = this.fetchVPNInfo;
            if (str7 == null) {
                Intrinsics.gEmmrt("");
                str7 = null;
            }
            switch (str7.hashCode()) {
                case -2040464843:
                    if (str7.equals("LSAcco")) {
                        this.gEmmrt = new C36275oVt(str);
                    }
                    break;
                case 2522:
                    if (str7.equals("OI")) {
                        this.gEmmrt = new oVG(str);
                    }
                    break;
                case 63511234:
                    if (str7.equals("BSVol")) {
                        this.gEmmrt = new C36269oVn(str);
                    }
                    break;
                case 72740685:
                    if (str7.equals("LSPos")) {
                        this.gEmmrt = new C36275oVt(str);
                    }
                    break;
                case 1185755844:
                    if (str7.equals("LSRatio")) {
                        this.gEmmrt = new C36275oVt(str);
                    }
                    break;
            }
        } else {
            this.gEmmrt = abstractC36262oVgOLrzqt;
        }
        java.lang.String str8 = this.fetchVPNInfo;
        if (str8 == null) {
            Intrinsics.gEmmrt("");
            str8 = null;
        }
        switch (str8.hashCode()) {
            case -2040464843:
                if (str8.equals("LSAcco")) {
                    android.widget.TextView textView = this.copydefault;
                    if (textView == null) {
                        Intrinsics.gEmmrt("");
                        textView = null;
                    }
                    textView.setText(C35964oKf.Fragment.HJWChPDXdlte);
                }
                break;
            case 2522:
                if (str8.equals("OI")) {
                    android.widget.TextView textView2 = this.copydefault;
                    if (textView2 == null) {
                        Intrinsics.gEmmrt("");
                        textView2 = null;
                    }
                    textView2.setText(C35964oKf.Fragment.OxbLUn);
                }
                break;
            case 63511234:
                if (str8.equals("BSVol")) {
                    android.widget.TextView textView3 = this.copydefault;
                    if (textView3 == null) {
                        Intrinsics.gEmmrt("");
                        textView3 = null;
                    }
                    textView3.setText(C35964oKf.Fragment.fZc);
                }
                break;
            case 72740685:
                if (str8.equals("LSPos")) {
                    android.widget.TextView textView4 = this.copydefault;
                    if (textView4 == null) {
                        Intrinsics.gEmmrt("");
                        textView4 = null;
                    }
                    textView4.setText(C35964oKf.Fragment.RhjxDW);
                }
                break;
            case 1185755844:
                if (str8.equals("LSRatio")) {
                    android.widget.TextView textView5 = this.copydefault;
                    if (textView5 == null) {
                        Intrinsics.gEmmrt("");
                        textView5 = null;
                    }
                    textView5.setText(C35964oKf.Fragment.aappFQ);
                }
                break;
        }
        AbstractC36262oVg abstractC36262oVg2 = this.gEmmrt;
        if (abstractC36262oVg2 == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg2 = null;
        }
        abstractC36262oVg2.AkhnZx();
        AbstractC36262oVg abstractC36262oVg3 = this.gEmmrt;
        if (abstractC36262oVg3 == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg3 = null;
        }
        int iDbNXlk = abstractC36262oVg3.DbNXlk();
        for (int i = 0; i < iDbNXlk; i++) {
            java.util.HashMap<java.lang.String, java.util.List<java.lang.Integer>> map = pDK.EZpvd;
            java.lang.String str9 = this.fetchVPNInfo;
            if (str9 == null) {
                Intrinsics.gEmmrt("");
                str9 = null;
            }
            if (map.get(str9) == null) {
                java.util.ArrayList<java.lang.Object> arrayList = this.values;
                java.lang.String str10 = this.fetchVPNInfo;
                if (str10 == null) {
                    Intrinsics.gEmmrt("");
                    str10 = null;
                }
                java.lang.String str11 = this.fetchVPNInfo;
                if (str11 == null) {
                    Intrinsics.gEmmrt("");
                    str11 = null;
                }
                arrayList.add(new ActivityC37844pCu.StateListAnimator(str10, str11));
            } else {
                java.util.ArrayList<java.lang.Object> arrayList2 = this.values;
                java.lang.String str12 = this.fetchVPNInfo;
                if (str12 == null) {
                    Intrinsics.gEmmrt("");
                    str12 = null;
                }
                java.util.List<java.lang.Integer> list = map.get(str12);
                Intrinsics.copydefault(list);
                java.lang.Integer num = list.get(i);
                Intrinsics.checkNotNullExpressionValue(num, "");
                java.lang.String string = getString(num.intValue());
                Intrinsics.checkNotNullExpressionValue(string, "");
                java.lang.String str13 = this.fetchVPNInfo;
                if (str13 == null) {
                    Intrinsics.gEmmrt("");
                    str13 = null;
                }
                arrayList2.add(new ActivityC37844pCu.StateListAnimator(string, str13));
            }
        }
        this.valueOf.setItems(this.values);
        this.valueOf.notifyDataSetChanged();
        java.lang.String str14 = this.AhwBna;
        java.lang.String str15 = this.fetchVPNInfo;
        if (str15 == null) {
            Intrinsics.gEmmrt("");
            str15 = null;
        }
        java.lang.String strKWHzl = C36278oVw.KWHzl(str14, KWHzl(str15));
        if (!android.text.TextUtils.isEmpty(strKWHzl)) {
            java.util.ArrayList<Expression.Parameter> arrayList3 = (java.util.ArrayList) new Gson().fromJson(strKWHzl, new Application().getType());
            AbstractC36262oVg abstractC36262oVg4 = this.gEmmrt;
            if (abstractC36262oVg4 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg4 = null;
            }
            pDS pds = pDS.OLrzqt;
            AbstractC36262oVg abstractC36262oVg5 = this.gEmmrt;
            if (abstractC36262oVg5 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg5 = null;
            }
            java.util.ArrayList<Expression.Parameter> arrayListIsConnected = abstractC36262oVg5.isConnected();
            Intrinsics.checkNotNullExpressionValue(arrayListIsConnected, "");
            Intrinsics.copydefault(arrayList3);
            abstractC36262oVg4.KWHzl(pds.EZpvd(arrayListIsConnected, arrayList3));
            AbstractC36262oVg abstractC36262oVg6 = this.gEmmrt;
            if (abstractC36262oVg6 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg6 = null;
            }
            Expression.Parameter parameter = (Expression.Parameter) CollectionsKt___CollectionsKt.firstOrNull(arrayList3);
            abstractC36262oVg6.copydefault(parameter != null ? parameter.getIsShow() : true);
        }
        this.OLrzqt = pDT.Companion.KWHzl().djBIcL();
        AbstractC36262oVg abstractC36262oVg7 = this.gEmmrt;
        if (abstractC36262oVg7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC36262oVg = abstractC36262oVg7;
        }
        abstractC36262oVg.fetchVPNInfo();
    }

    private final void AYXKKw() {
        this.valueOf.register(ActivityC37844pCu.StateListAnimator.class, new TaskDescription());
    }

    /* JADX INFO: renamed from: o.pCn$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public final class TaskDescription extends AbstractC59533zio<ActivityC37844pCu.StateListAnimator, Activity> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        /* JADX INFO: renamed from: o.pCn$TaskDescription$Activity */
        public final class Activity extends RecyclerView.ViewHolder {
            public final /* synthetic */ TaskDescription AEQbTJ;
            public final android.widget.CheckBox EZpvd;
            public final android.widget.ImageView KWHzl;
            public final android.widget.TextView OLrzqt;
            public final android.widget.RelativeLayout copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.CheckBox AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.TextView EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.RelativeLayout KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.ImageView copydefault() {
                return this.KWHzl;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull TaskDescription taskDescription, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.AEQbTJ = taskDescription;
                android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.getVolumeControl);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.OLrzqt = (android.widget.TextView) viewFindViewById;
                android.view.View viewFindViewById2 = view.findViewById(C35964oKf.StateListAnimator.OTwTPd);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                this.EZpvd = (android.widget.CheckBox) viewFindViewById2;
                android.view.View viewFindViewById3 = view.findViewById(C35964oKf.StateListAnimator.extraCallbackWithResult);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
                this.copydefault = (android.widget.RelativeLayout) viewFindViewById3;
                android.view.View viewFindViewById4 = view.findViewById(C35964oKf.StateListAnimator.Dfv);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
                this.KWHzl = (android.widget.ImageView) viewFindViewById4;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.ffGIBT, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new Activity(this, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(@NotNull final Activity activity, @NotNull ActivityC37844pCu.StateListAnimator stateListAnimator) {
            AbstractC36262oVg abstractC36262oVg;
            int layoutPosition;
            java.lang.String colorTemp;
            java.lang.String colorBlkTemp;
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            java.lang.String str = ActivityC37837pCn.this.fetchVPNInfo;
            Unit unit = null;
            if (str == null) {
                Intrinsics.gEmmrt("");
                str = null;
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "BSVol")) {
                abstractC36262oVg = ActivityC37837pCn.this.gEmmrt;
                if (abstractC36262oVg == null) {
                    Intrinsics.gEmmrt("");
                    abstractC36262oVg = null;
                }
                layoutPosition = activity.getLayoutPosition() + 1;
            } else {
                abstractC36262oVg = ActivityC37837pCn.this.gEmmrt;
                if (abstractC36262oVg == null) {
                    Intrinsics.gEmmrt("");
                    abstractC36262oVg = null;
                }
                layoutPosition = activity.getLayoutPosition();
            }
            final Expression.Parameter parameterCopydefault = abstractC36262oVg.copydefault(layoutPosition);
            activity.setIsRecyclable(false);
            activity.EZpvd().setText(stateListAnimator.KWHzl());
            if (Intrinsics.EZpvd((java.lang.Object) stateListAnimator.KWHzl(), (java.lang.Object) ActivityC37837pCn.this.getString(C32392mcI.Dialog.alsFma))) {
                activity.AEQbTJ().setVisibility(0);
                activity.AEQbTJ().setChecked(parameterCopydefault.getIsShowTemp());
            } else {
                activity.AEQbTJ().setVisibility(8);
            }
            android.graphics.drawable.Drawable background = activity.copydefault().getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (parameterCopydefault != null && (colorBlkTemp = parameterCopydefault.getColorBlkTemp()) != null) {
                java.lang.String strCopydefault = pDT.Companion.KWHzl().copydefault(colorBlkTemp);
                if (strCopydefault != null && gradientDrawable != null) {
                    gradientDrawable.setColor(Color.parseColor(strCopydefault));
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                }
            } else if (parameterCopydefault != null && (colorTemp = parameterCopydefault.getColorTemp()) != null && gradientDrawable != null) {
                gradientDrawable.setColor(Color.parseColor(colorTemp));
                Unit unit2 = Unit.INSTANCE;
            }
            android.widget.CheckBox checkBoxAEQbTJ = activity.AEQbTJ();
            final ActivityC37837pCn activityC37837pCn = ActivityC37837pCn.this;
            checkBoxAEQbTJ.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.pCs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    ActivityC37837pCn.TaskDescription.EZpvd(activityC37837pCn, parameterCopydefault, compoundButton, z);
                }
            });
            android.widget.RelativeLayout relativeLayoutKWHzl = activity.KWHzl();
            final ActivityC37837pCn activityC37837pCn2 = ActivityC37837pCn.this;
            relativeLayoutKWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.pCy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC37837pCn.TaskDescription.AEQbTJ(activityC37837pCn2, activity, parameterCopydefault, view);
                }
            });
        }

        public static final void EZpvd(ActivityC37837pCn activityC37837pCn, Expression.Parameter parameter, android.widget.CompoundButton compoundButton, boolean z) {
            AbstractC36262oVg abstractC36262oVg = activityC37837pCn.gEmmrt;
            if (abstractC36262oVg == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg = null;
            }
            abstractC36262oVg.copydefault(z);
            parameter.setIsShowTemp(z);
        }

        public static final void AEQbTJ(ActivityC37837pCn activityC37837pCn, Activity activity, Expression.Parameter parameter, android.view.View view) {
            android.widget.TextView textViewAEQbTJ = activity.AEQbTJ().getVisibility() == 0 ? activity.AEQbTJ() : activity.EZpvd();
            android.widget.ImageView imageViewCopydefault = activity.copydefault();
            Intrinsics.copydefault(parameter);
            activityC37837pCn.AEQbTJ(textViewAEQbTJ, imageViewCopydefault, parameter);
        }
    }

    public final void EZpvd() {
        AbstractC36262oVg abstractC36262oVg = this.gEmmrt;
        if (abstractC36262oVg == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg = null;
        }
        abstractC36262oVg.EZpvd();
        AbstractC36262oVg abstractC36262oVg2 = this.gEmmrt;
        if (abstractC36262oVg2 == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg2 = null;
        }
        abstractC36262oVg2.fJNWhG();
        java.lang.String str = this.AhwBna;
        AbstractC36262oVg abstractC36262oVg3 = this.gEmmrt;
        if (abstractC36262oVg3 == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg3 = null;
        }
        java.lang.String strEjfBZ = abstractC36262oVg3.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(strEjfBZ, "");
        java.lang.String strKWHzl = KWHzl(strEjfBZ);
        AbstractC36262oVg abstractC36262oVg4 = this.gEmmrt;
        if (abstractC36262oVg4 == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg4 = null;
        }
        C36278oVw.KWHzl(str, strKWHzl, abstractC36262oVg4.AuCTel());
        AbstractC36262oVg abstractC36262oVg5 = this.gEmmrt;
        if (abstractC36262oVg5 == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg5 = null;
        }
        AbstractC36262oVg abstractC36262oVg6 = this.gEmmrt;
        if (abstractC36262oVg6 == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg6 = null;
        }
        java.util.ArrayList<Expression.Parameter> arrayListIsConnected = abstractC36262oVg6.isConnected();
        Intrinsics.checkNotNullExpressionValue(arrayListIsConnected, "");
        Expression.Parameter parameter = (Expression.Parameter) CollectionsKt___CollectionsKt.firstOrNull(arrayListIsConnected);
        abstractC36262oVg5.copydefault(parameter != null ? parameter.getIsShow() : true);
        java.lang.String str2 = this.AhwBna;
        java.lang.String str3 = this.fetchVPNInfo;
        if (str3 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        }
        AbstractC36262oVg abstractC36262oVg7 = this.gEmmrt;
        if (abstractC36262oVg7 == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg7 = null;
        }
        C36278oVw.OLrzqt(str2, str3, abstractC36262oVg7.fARcdN());
        AbstractC36262oVg abstractC36262oVg8 = this.gEmmrt;
        if (abstractC36262oVg8 == null) {
            Intrinsics.gEmmrt("");
            abstractC36262oVg8 = null;
        }
        if (abstractC36262oVg8.values() > 0) {
            AbstractC36262oVg abstractC36262oVg9 = this.gEmmrt;
            if (abstractC36262oVg9 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg9 = null;
            }
            abstractC36262oVg9.copydefault();
            java.lang.String str4 = this.AhwBna;
            AbstractC36262oVg abstractC36262oVg10 = this.gEmmrt;
            if (abstractC36262oVg10 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg10 = null;
            }
            java.lang.String strEjfBZ2 = abstractC36262oVg10.ejfBZ();
            Intrinsics.checkNotNullExpressionValue(strEjfBZ2, "");
            java.lang.String strKWHzl2 = KWHzl(strEjfBZ2);
            Gson gson = new Gson();
            AbstractC36262oVg abstractC36262oVg11 = this.gEmmrt;
            if (abstractC36262oVg11 == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg11 = null;
            }
            C36278oVw.copydefault(str4, strKWHzl2, gson.toJson(abstractC36262oVg11.isConnected()));
        }
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null) && C36246oUr.copydefault().RdAHlO()) {
            gEmmrt();
        } else {
            finish();
        }
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        boolean zIsBlackStatusBar = isBlackStatusBar();
        if (zIsBlackStatusBar) {
            zIsBlackStatusBar = !Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"));
        }
        C33567myr.AEQbTJ(this, zIsBlackStatusBar);
        C33494mxX.copydefault.EZpvd(this, zIsBlackStatusBar);
    }

    private final java.lang.String KWHzl(java.lang.String str) {
        return str + "_sub";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(android.view.View view, final android.view.View view2, final Expression.Parameter parameter) {
        this.AYXKKw = new C39587pvE(this, this.OLrzqt, new Function1() { // from class: o.pCt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC37837pCn.KWHzl(this.OLrzqt, view2, parameter, (oLO) obj);
            }
        }, null, null, 24, null);
        int iOLrzqt = C55302xhQ.OLrzqt(this);
        C39587pvE c39587pvE = this.AYXKKw;
        if (c39587pvE != null) {
            iOLrzqt -= c39587pvE.KWHzl() + this.AEQbTJ;
        }
        C39587pvE c39587pvE2 = this.AYXKKw;
        if (c39587pvE2 != null) {
            java.lang.String strCopydefault = pDT.Companion.KWHzl().copydefault(parameter.getColorBlkTemp());
            if (strCopydefault == null) {
                strCopydefault = parameter.getColorTemp();
            }
            Intrinsics.copydefault((java.lang.Object) strCopydefault);
            C39587pvE.setSelectedColorAndPos$default(c39587pvE2, strCopydefault, false, false, false, null, 28, null);
        }
        C39587pvE c39587pvE3 = this.AYXKKw;
        if (c39587pvE3 != null) {
            c39587pvE3.showAsDropDown(view, iOLrzqt, 0, 8388611);
        }
    }

    public static final Unit KWHzl(ActivityC37837pCn activityC37837pCn, android.view.View view, Expression.Parameter parameter, oLO olo) {
        Intrinsics.checkNotNullParameter(olo, "");
        C39587pvE c39587pvE = activityC37837pCn.AYXKKw;
        if (c39587pvE != null) {
            c39587pvE.dismiss();
        }
        activityC37837pCn.AYXKKw = null;
        android.graphics.drawable.Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        java.lang.String strOLrzqt = Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.KWHzl(), (java.lang.Object) "kline_white") ? olo.OLrzqt() : olo.EZpvd();
        if (gradientDrawable != null) {
            gradientDrawable.setColor(Color.parseColor(strOLrzqt));
        }
        parameter.setColorTemp(strOLrzqt);
        parameter.setColorBlkTemp(olo.copydefault());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void gEmmrt() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strOLrzqt;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        java.lang.String str3 = this.AhwBna;
        java.lang.String str4 = this.fetchVPNInfo;
        if (str4 == null) {
            Intrinsics.gEmmrt("");
            str4 = null;
        }
        boolean zGEmmrt = c36246oUrCopydefault.gEmmrt(str3, str4);
        java.lang.String str5 = this.fetchVPNInfo;
        if (str5 == null) {
            Intrinsics.gEmmrt("");
            str5 = null;
        }
        switch (str5.hashCode()) {
            case -2040464843:
                if (!str5.equals("LSAcco")) {
                    str = this.fetchVPNInfo;
                    if (str == null) {
                        Intrinsics.gEmmrt("");
                        str2 = null;
                    }
                } else {
                    str = "ELITE_LSR";
                }
                str2 = str;
                break;
            case 63511234:
                if (str5.equals("BSVol")) {
                    str = "TAKER_BS";
                }
                str2 = str;
                break;
            case 72740685:
                if (str5.equals("LSPos")) {
                    str = "ELITE_OI_LSR";
                }
                str2 = str;
                break;
            case 1185755844:
                if (str5.equals("LSRatio")) {
                    str = "LSR";
                }
                str2 = str;
                break;
        }
        IndicatorBean indicatorBean = new IndicatorBean(str2, false, null, java.lang.Boolean.valueOf(zGEmmrt));
        InterfaceC37953pGv interfaceC37953pGvOLrzqt = C37957pGz.copydefault.OLrzqt(str2);
        if (interfaceC37953pGvOLrzqt != null) {
            AbstractC36262oVg abstractC36262oVg = this.gEmmrt;
            if (abstractC36262oVg == null) {
                Intrinsics.gEmmrt("");
                abstractC36262oVg = null;
            }
            strOLrzqt = interfaceC37953pGvOLrzqt.OLrzqt(abstractC36262oVg, indicatorBean, zGEmmrt);
        } else {
            strOLrzqt = null;
        }
        if (strOLrzqt != null) {
            showLoading();
            IndicatorDataReq indicatorDataReq = new IndicatorDataReq(str2, strOLrzqt, zGEmmrt ? "0" : "1", null, 8, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(indicatorDataReq);
            C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).uploadIndicatorData(arrayList), this), new Function1() { // from class: o.pCk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC37837pCn.AEQbTJ(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.pCl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC37837pCn.AEQbTJ(this.OLrzqt, (ResponseData) obj);
                }
            }, 2, (java.lang.Object) null);
        }
    }

    public static final Unit AEQbTJ(ActivityC37837pCn activityC37837pCn, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        activityC37837pCn.dismissLoading();
        SPUtils.put("kline_indicator_version", responseData.getData());
        Objects.toString(responseData.getData());
        activityC37837pCn.finish();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC37837pCn activityC37837pCn, java.lang.Throwable th) {
        JsonPrimitive asJsonPrimitive;
        Intrinsics.checkNotNullParameter(th, "");
        activityC37837pCn.dismissLoading();
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            int code = oKServerException.getCode();
            JsonObject response = oKServerException.getResponse();
            pUU.copydefault("Indicator", "uploadIndicatorData: code = " + code + " errorMessage = " + ((response == null || (asJsonPrimitive = response.getAsJsonPrimitive(EopTrackEvent.KEY_ERROR_MESSAGE)) == null) ? null : asJsonPrimitive.getAsString()));
        } else {
            pUU.copydefault("Indicator", "uploadIndicatorData: error = " + th.getMessage());
        }
        activityC37837pCn.finish();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C33565myp.EZpvd().OLrzqt();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

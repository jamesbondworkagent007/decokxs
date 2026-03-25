package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager;
import com.okinc.business.defi.biz.net.bean.ApproveItem;
import com.okinc.business.defi.wallet.approve.ApproveListItem;
import com.okinc.business.defi.wallet.approve.ApproveRiskyTagType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.uilab.banner.OKAlertBanner;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import o.C19595gIe;
import o.C52761wXj;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dXh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityC13761dXh extends AbstractActivityC33013moT {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> AEQbTJ;
    public AbstractC16238egE AYXKKw;
    public AbstractC12782ctV AhwBna;
    public ApproveListItem KWHzl;
    public long copydefault = Long.MIN_VALUE;
    public final C59534zip OLrzqt = new C59534zip();

    /* JADX INFO: renamed from: o.dXh$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.dXh$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dXh.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ void startActivity$default(Application application, android.content.Context context, ApproveListItem approveListItem, java.lang.Long l, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                l = Long.MIN_VALUE;
            }
            application.copydefault(context, approveListItem, l);
        }

        public final void copydefault(@NotNull android.content.Context context, @NotNull ApproveListItem approveListItem, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(approveListItem, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC13761dXh.class);
            intent.putExtra("data", approveListItem);
            intent.putExtra("chain_id", l);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ApproveListItem approveListItem;
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent == null || (approveListItem = (ApproveListItem) intent.getParcelableExtra("data")) == null) {
            finish();
            return;
        }
        this.KWHzl = approveListItem;
        AbstractC16238egE abstractC16238egE = null;
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        if (abstractC12782ctV == null) {
            finish();
            return;
        }
        this.AhwBna = abstractC12782ctV;
        android.content.Intent intent2 = getIntent();
        this.copydefault = intent2 != null ? intent2.getLongExtra("chain_id", Long.MIN_VALUE) : Long.MIN_VALUE;
        AbstractC16238egE abstractC16238egECopydefault = AbstractC16238egE.copydefault(getLayoutInflater());
        this.AYXKKw = abstractC16238egECopydefault;
        if (abstractC16238egECopydefault == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egECopydefault = null;
        }
        setContentView(abstractC16238egECopydefault.getRoot());
        AbstractC16238egE abstractC16238egE2 = this.AYXKKw;
        if (abstractC16238egE2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16238egE = abstractC16238egE2;
        }
        abstractC16238egE.fIwbmz.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.dXl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                ActivityC13761dXh.AEQbTJ(this.AEQbTJ, view, i, i2, i3, i4);
            }
        });
        EZpvd();
        OLrzqt();
        KWHzl();
    }

    public static final void AEQbTJ(ActivityC13761dXh activityC13761dXh, android.view.View view, int i, int i2, int i3, int i4) {
        float f = i2;
        AbstractC16238egE abstractC16238egE = activityC13761dXh.AYXKKw;
        AbstractC16238egE abstractC16238egE2 = null;
        if (abstractC16238egE == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE = null;
        }
        if (f >= abstractC16238egE.AEQbTJ.getY()) {
            AbstractC16238egE abstractC16238egE3 = activityC13761dXh.AYXKKw;
            if (abstractC16238egE3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE3 = null;
            }
            abstractC16238egE3.DbNXlk.setAlpha(1.0f);
            AbstractC16238egE abstractC16238egE4 = activityC13761dXh.AYXKKw;
            if (abstractC16238egE4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16238egE2 = abstractC16238egE4;
            }
            abstractC16238egE2.values.setAlpha(1.0f);
            return;
        }
        AbstractC16238egE abstractC16238egE5 = activityC13761dXh.AYXKKw;
        if (abstractC16238egE5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE5 = null;
        }
        abstractC16238egE5.DbNXlk.setAlpha(0.0f);
        AbstractC16238egE abstractC16238egE6 = activityC13761dXh.AYXKKw;
        if (abstractC16238egE6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16238egE2 = abstractC16238egE6;
        }
        abstractC16238egE2.values.setAlpha(0.0f);
    }

    public final void EZpvd() {
        AbstractC16238egE abstractC16238egE = this.AYXKKw;
        AbstractC16238egE abstractC16238egE2 = null;
        if (abstractC16238egE == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE = null;
        }
        abstractC16238egE.OLrzqt.getLayoutParams().height = C33570myu.valueOf(this);
        AbstractC16238egE abstractC16238egE3 = this.AYXKKw;
        if (abstractC16238egE3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE3 = null;
        }
        android.widget.ImageView imageView = abstractC16238egE3.AhwBna;
        imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, this));
        AbstractC16238egE abstractC16238egE4 = this.AYXKKw;
        if (abstractC16238egE4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE4 = null;
        }
        android.widget.ImageView imageView2 = abstractC16238egE4.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        ApproveListItem approveListItem = this.KWHzl;
        if (approveListItem == null) {
            Intrinsics.gEmmrt("");
            approveListItem = null;
        }
        java.lang.String strAYXKKw = approveListItem.AYXKKw();
        if (strAYXKKw == null) {
            strAYXKKw = "";
        }
        C57659ymb.KWHzl(imageView2, strAYXKKw, C13754dXa.Activity.aKErDB);
        AbstractC16238egE abstractC16238egE5 = this.AYXKKw;
        if (abstractC16238egE5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE5 = null;
        }
        android.widget.TextView textView = abstractC16238egE5.iwGUEr;
        ApproveListItem approveListItem2 = this.KWHzl;
        if (approveListItem2 == null) {
            Intrinsics.gEmmrt("");
            approveListItem2 = null;
        }
        textView.setText(approveListItem2.DbNXlk());
        AbstractC16238egE abstractC16238egE6 = this.AYXKKw;
        if (abstractC16238egE6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE6 = null;
        }
        android.widget.ImageView imageView3 = abstractC16238egE6.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        ApproveListItem approveListItem3 = this.KWHzl;
        if (approveListItem3 == null) {
            Intrinsics.gEmmrt("");
            approveListItem3 = null;
        }
        java.lang.String strAYXKKw2 = approveListItem3.AYXKKw();
        if (strAYXKKw2 == null) {
            strAYXKKw2 = "";
        }
        C57659ymb.KWHzl(imageView3, strAYXKKw2, C13754dXa.Activity.aKErDB);
        AbstractC16238egE abstractC16238egE7 = this.AYXKKw;
        if (abstractC16238egE7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE7 = null;
        }
        android.widget.TextView textView2 = abstractC16238egE7.fARcdN;
        ApproveListItem approveListItem4 = this.KWHzl;
        if (approveListItem4 == null) {
            Intrinsics.gEmmrt("");
            approveListItem4 = null;
        }
        textView2.setText(approveListItem4.DbNXlk());
        ApproveListItem approveListItem5 = this.KWHzl;
        if (approveListItem5 == null) {
            Intrinsics.gEmmrt("");
            approveListItem5 = null;
        }
        if (approveListItem5.fetchVPNInfo()) {
            AbstractC16238egE abstractC16238egE8 = this.AYXKKw;
            if (abstractC16238egE8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE8 = null;
            }
            android.view.View view = abstractC16238egE8.KWHzl;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
            AbstractC16238egE abstractC16238egE9 = this.AYXKKw;
            if (abstractC16238egE9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE9 = null;
            }
            ConstraintLayout constraintLayout = abstractC16238egE9.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            AbstractC16238egE abstractC16238egE10 = this.AYXKKw;
            if (abstractC16238egE10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE10 = null;
            }
            android.widget.TextView textView3 = abstractC16238egE10.getFieldNames;
            ApproveListItem approveListItem6 = this.KWHzl;
            if (approveListItem6 == null) {
                Intrinsics.gEmmrt("");
                approveListItem6 = null;
            }
            textView3.setText(approveListItem6.gEmmrt());
            AbstractC16238egE abstractC16238egE11 = this.AYXKKw;
            if (abstractC16238egE11 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE11 = null;
            }
            android.widget.ImageView imageView4 = abstractC16238egE11.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView4, "");
            imageView4.setVisibility(8);
        } else {
            AbstractC16238egE abstractC16238egE12 = this.AYXKKw;
            if (abstractC16238egE12 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE12 = null;
            }
            android.view.View view2 = abstractC16238egE12.KWHzl;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(0);
            AbstractC16238egE abstractC16238egE13 = this.AYXKKw;
            if (abstractC16238egE13 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE13 = null;
            }
            ConstraintLayout constraintLayout2 = abstractC16238egE13.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(0);
            AbstractC16238egE abstractC16238egE14 = this.AYXKKw;
            if (abstractC16238egE14 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE14 = null;
            }
            android.widget.TextView textView4 = abstractC16238egE14.getFieldNames;
            ApproveListItem approveListItem7 = this.KWHzl;
            if (approveListItem7 == null) {
                Intrinsics.gEmmrt("");
                approveListItem7 = null;
            }
            java.lang.String strAkhnZx = approveListItem7.AkhnZx();
            if (strAkhnZx == null) {
                strAkhnZx = "";
            }
            textView4.setText(strAkhnZx);
            AbstractC16238egE abstractC16238egE15 = this.AYXKKw;
            if (abstractC16238egE15 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE15 = null;
            }
            android.widget.ImageView imageView5 = abstractC16238egE15.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView5, "");
            imageView5.setVisibility(0);
            C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
            ApproveListItem approveListItem8 = this.KWHzl;
            if (approveListItem8 == null) {
                Intrinsics.gEmmrt("");
                approveListItem8 = null;
            }
            C10854bwM c10854bwMKWHzl = c10948byAValueOf.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(approveListItem8.djBIcL())));
            C5335Nt c5335NtEZpvd = Glide.copydefault((FragmentActivity) this).EZpvd(c10854bwMKWHzl != null ? c10854bwMKWHzl.copydefault() : null).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(getApplicationContext(), 1.5f, C33070mpX.copydefault(C52761wXj.Activity.copydefault), false, 8, null));
            AbstractC16238egE abstractC16238egE16 = this.AYXKKw;
            if (abstractC16238egE16 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE16 = null;
            }
            Intrinsics.copydefault(c5335NtEZpvd.EZpvd(abstractC16238egE16.valueOf));
        }
        ApproveListItem approveListItem9 = this.KWHzl;
        if (approveListItem9 == null) {
            Intrinsics.gEmmrt("");
            approveListItem9 = null;
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) approveListItem9.AEQbTJ())) {
            AbstractC16238egE abstractC16238egE17 = this.AYXKKw;
            if (abstractC16238egE17 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE17 = null;
            }
            abstractC16238egE17.djBIcL.setVisibility(8);
            AbstractC16238egE abstractC16238egE18 = this.AYXKKw;
            if (abstractC16238egE18 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16238egE2 = abstractC16238egE18;
            }
            abstractC16238egE2.AkhnZx.setVisibility(8);
            return;
        }
        AbstractC16238egE abstractC16238egE19 = this.AYXKKw;
        if (abstractC16238egE19 == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE19 = null;
        }
        android.widget.TextView textView5 = abstractC16238egE19.ejfBZ;
        ApproveListItem approveListItem10 = this.KWHzl;
        if (approveListItem10 == null) {
            Intrinsics.gEmmrt("");
            approveListItem10 = null;
        }
        textView5.setText(approveListItem10.AEQbTJ());
        AbstractC16238egE abstractC16238egE20 = this.AYXKKw;
        if (abstractC16238egE20 == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE20 = null;
        }
        abstractC16238egE20.djBIcL.setVisibility(0);
        AbstractC16238egE abstractC16238egE21 = this.AYXKKw;
        if (abstractC16238egE21 == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE21 = null;
        }
        AppCompatImageView appCompatImageView = abstractC16238egE21.djBIcL;
        appCompatImageView.setOnClickListener(new TaskDescription(appCompatImageView, 1000L, this));
        ApproveListItem approveListItem11 = this.KWHzl;
        if (approveListItem11 == null) {
            Intrinsics.gEmmrt("");
            approveListItem11 = null;
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) approveListItem11.valueOf())) {
            AbstractC16238egE abstractC16238egE22 = this.AYXKKw;
            if (abstractC16238egE22 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16238egE2 = abstractC16238egE22;
            }
            abstractC16238egE2.AkhnZx.setVisibility(8);
            return;
        }
        AbstractC16238egE abstractC16238egE23 = this.AYXKKw;
        if (abstractC16238egE23 == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE23 = null;
        }
        abstractC16238egE23.AkhnZx.setVisibility(0);
        AbstractC16238egE abstractC16238egE24 = this.AYXKKw;
        if (abstractC16238egE24 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16238egE2 = abstractC16238egE24;
        }
        AppCompatImageView appCompatImageView2 = abstractC16238egE2.AkhnZx;
        appCompatImageView2.setOnClickListener(new ActionBar(appCompatImageView2, 1000L, this));
    }

    public final void OLrzqt() {
        java.lang.String strAYXKKw;
        C59534zip c59534zip = this.OLrzqt;
        ApproveListItem approveListItem = this.KWHzl;
        AbstractC16238egE abstractC16238egE = null;
        if (approveListItem == null) {
            Intrinsics.gEmmrt("");
            approveListItem = null;
        }
        AbstractC12782ctV abstractC12782ctV = this.AhwBna;
        if (abstractC12782ctV == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV = null;
        }
        c59534zip.register(dXZ.class, new C13783dYc(approveListItem, abstractC12782ctV));
        C59534zip c59534zip2 = this.OLrzqt;
        AbstractC12782ctV abstractC12782ctV2 = this.AhwBna;
        if (abstractC12782ctV2 == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV2 = null;
        }
        c59534zip2.register(dXY.class, new C13787dYg(abstractC12782ctV2));
        AbstractC16238egE abstractC16238egE2 = this.AYXKKw;
        if (abstractC16238egE2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE2 = null;
        }
        android.widget.TextView textView = abstractC16238egE2.AuCTel;
        ApproveListItem approveListItem2 = this.KWHzl;
        if (approveListItem2 == null) {
            Intrinsics.gEmmrt("");
            approveListItem2 = null;
        }
        if (approveListItem2.fetchVPNInfo()) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setRccState);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.pause);
        }
        textView.setText(strAYXKKw);
        AbstractC16238egE abstractC16238egE3 = this.AYXKKw;
        if (abstractC16238egE3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE3 = null;
        }
        abstractC16238egE3.isConnected.setLayoutManager(new LinearLayoutManager(this));
        AbstractC16238egE abstractC16238egE4 = this.AYXKKw;
        if (abstractC16238egE4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16238egE = abstractC16238egE4;
        }
        abstractC16238egE.isConnected.setAdapter(this.OLrzqt);
        C15523eLm.KWHzl.AEQbTJ().observe(this, new Activity(new Function1() { // from class: o.dXn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC13761dXh.KWHzl(this.AEQbTJ, (java.util.List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o.dXh$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC13761dXh OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC13761dXh activityC13761dXh) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = activityC13761dXh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                WebActivity.TaskDescription taskDescription = WebActivity.Companion;
                ActivityC13761dXh activityC13761dXh = this.OLrzqt;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                ApproveListItem approveListItem = activityC13761dXh.KWHzl;
                if (approveListItem == null) {
                    Intrinsics.gEmmrt("");
                    approveListItem = null;
                }
                pairArr[0] = C56390yDp.OLrzqt("url", approveListItem.valueOf());
                pairArr[1] = C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString());
                WebActivity.TaskDescription.openPage$default(taskDescription, activityC13761dXh, BundleKt.bundleOf(pairArr), null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.dXh$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC13761dXh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC13761dXh activityC13761dXh) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = activityC13761dXh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.dXh$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC13761dXh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC13761dXh activityC13761dXh) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = activityC13761dXh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                java.lang.Object systemService = this.copydefault.getSystemService("clipboard");
                Intrinsics.copydefault(systemService, "");
                android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) systemService;
                ApproveListItem approveListItem = this.copydefault.KWHzl;
                ApproveListItem approveListItem2 = null;
                if (approveListItem == null) {
                    Intrinsics.gEmmrt("");
                    approveListItem = null;
                }
                clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, approveListItem.AEQbTJ()));
                C19595gIe.StateListAnimator stateListAnimator = C19595gIe.Companion;
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.onItemClick);
                ApproveListItem approveListItem3 = this.copydefault.KWHzl;
                if (approveListItem3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    approveListItem2 = approveListItem3;
                }
                java.lang.String strAEQbTJ = approveListItem2.AEQbTJ();
                Intrinsics.copydefault((java.lang.Object) strAEQbTJ);
                stateListAnimator.AEQbTJ(strAYXKKw, strAEQbTJ).KWHzl(this.copydefault);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Unit KWHzl(final ActivityC13761dXh activityC13761dXh, java.util.List list) {
        boolean z;
        java.lang.String string;
        C15523eLm c15523eLm = C15523eLm.KWHzl;
        ApproveListItem approveListItem = activityC13761dXh.KWHzl;
        if (approveListItem == null) {
            Intrinsics.gEmmrt("");
            approveListItem = null;
        }
        java.lang.String strIsConnected = approveListItem.isConnected();
        ApproveListItem approveListItem2 = activityC13761dXh.KWHzl;
        if (approveListItem2 == null) {
            Intrinsics.gEmmrt("");
            approveListItem2 = null;
        }
        java.lang.String strAkhnZx = approveListItem2.AkhnZx();
        ApproveListItem approveListItem3 = activityC13761dXh.KWHzl;
        if (approveListItem3 == null) {
            Intrinsics.gEmmrt("");
            approveListItem3 = null;
        }
        ApproveItem approveItemKWHzl = c15523eLm.KWHzl(strIsConnected, strAkhnZx, approveListItem3.AEQbTJ());
        AbstractC16238egE abstractC16238egE = activityC13761dXh.AYXKKw;
        if (abstractC16238egE == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE = null;
        }
        android.widget.LinearLayout root = abstractC16238egE.copydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(approveItemKWHzl == null ? 0 : 8);
        AbstractC16238egE abstractC16238egE2 = activityC13761dXh.AYXKKw;
        if (abstractC16238egE2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16238egE2 = null;
        }
        RecyclerView recyclerView = abstractC16238egE2.isConnected;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(approveItemKWHzl != null ? 0 : 8);
        if (approveItemKWHzl != null) {
            activityC13761dXh.OLrzqt.setItems(C13757dXd.copydefault.AEQbTJ(approveItemKWHzl, activityC13761dXh.copydefault));
            activityC13761dXh.OLrzqt.notifyDataSetChanged();
        }
        java.util.List<?> items = activityC13761dXh.OLrzqt.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        if ((items instanceof java.util.Collection) && items.isEmpty()) {
            z = false;
        } else {
            for (java.lang.Object obj : items) {
                dXZ dxz = obj instanceof dXZ ? (dXZ) obj : null;
                if (Intrinsics.EZpvd((java.lang.Object) (dxz != null ? dxz.copydefault() : null), (java.lang.Object) activityC13761dXh.getString(C13754dXa.FragmentManager.getLocation))) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        ApproveListItem approveListItem4 = activityC13761dXh.KWHzl;
        if (approveListItem4 == null) {
            Intrinsics.gEmmrt("");
            approveListItem4 = null;
        }
        if (approveListItem4.fARcdN()) {
            AbstractC16238egE abstractC16238egE3 = activityC13761dXh.AYXKKw;
            if (abstractC16238egE3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE3 = null;
            }
            OKAlertBanner oKAlertBanner = abstractC16238egE3.EZpvd;
            Intrinsics.checkNotNullExpressionValue(oKAlertBanner, "");
            oKAlertBanner.setVisibility(0);
            AbstractC16238egE abstractC16238egE4 = activityC13761dXh.AYXKKw;
            if (abstractC16238egE4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE4 = null;
            }
            abstractC16238egE4.EZpvd.setType(2);
            AbstractC16238egE abstractC16238egE5 = activityC13761dXh.AYXKKw;
            if (abstractC16238egE5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE5 = null;
            }
            OKAlertBanner oKAlertBanner2 = abstractC16238egE5.EZpvd;
            ApproveListItem approveListItem5 = activityC13761dXh.KWHzl;
            if (approveListItem5 == null) {
                Intrinsics.gEmmrt("");
                approveListItem5 = null;
            }
            java.lang.Integer numOLrzqt = approveListItem5.OLrzqt();
            int value = ApproveRiskyTagType.MALICIOUS_ADDRESS.getValue();
            if (numOLrzqt != null && numOLrzqt.intValue() == value) {
                string = activityC13761dXh.getString(C13754dXa.FragmentManager.DkIxYv);
            } else {
                int value2 = ApproveRiskyTagType.DISCARDED_CONTRACT.getValue();
                if (numOLrzqt != null && numOLrzqt.intValue() == value2) {
                    string = activityC13761dXh.getString(C13754dXa.FragmentManager.DDNONI);
                } else {
                    int value3 = ApproveRiskyTagType.INACTIVE_APPROVAL.getValue();
                    if (numOLrzqt != null && numOLrzqt.intValue() == value3) {
                        int i = C13754dXa.FragmentManager.UnZVfq;
                        ApproveListItem approveListItem6 = activityC13761dXh.KWHzl;
                        if (approveListItem6 == null) {
                            Intrinsics.gEmmrt("");
                            approveListItem6 = null;
                        }
                        string = C33069mpW.KWHzl(activityC13761dXh, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(approveListItem6.KWHzl()))));
                    } else {
                        string = activityC13761dXh.getString(C13754dXa.FragmentManager.gxJrGF);
                    }
                }
            }
            oKAlertBanner2.setMessage(string);
        } else if (z) {
            AbstractC16238egE abstractC16238egE6 = activityC13761dXh.AYXKKw;
            if (abstractC16238egE6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE6 = null;
            }
            OKAlertBanner oKAlertBanner3 = abstractC16238egE6.EZpvd;
            Intrinsics.checkNotNullExpressionValue(oKAlertBanner3, "");
            oKAlertBanner3.setVisibility(0);
            AbstractC16238egE abstractC16238egE7 = activityC13761dXh.AYXKKw;
            if (abstractC16238egE7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE7 = null;
            }
            abstractC16238egE7.EZpvd.setType(4);
            AbstractC16238egE abstractC16238egE8 = activityC13761dXh.AYXKKw;
            if (abstractC16238egE8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE8 = null;
            }
            abstractC16238egE8.EZpvd.setMessage(activityC13761dXh.getString(C13754dXa.FragmentManager.UvfnWv));
        } else {
            AbstractC16238egE abstractC16238egE9 = activityC13761dXh.AYXKKw;
            if (abstractC16238egE9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16238egE9 = null;
            }
            OKAlertBanner oKAlertBanner4 = abstractC16238egE9.EZpvd;
            Intrinsics.checkNotNullExpressionValue(oKAlertBanner4, "");
            oKAlertBanner4.setVisibility(8);
        }
        ApproveListItem approveListItem7 = activityC13761dXh.KWHzl;
        if (approveListItem7 == null) {
            Intrinsics.gEmmrt("");
            approveListItem7 = null;
        }
        if (approveListItem7.fARcdN()) {
            C32866mlf.onEvent$default("Web3RiskApprove_Pop_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.dXo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ActivityC13761dXh.AEQbTJ(this.AEQbTJ, (EventParamsList) obj2);
                }
            }, 1, (java.lang.Object) null);
        }
        rVN.reportFullyDrawn$default((android.app.Activity) activityC13761dXh, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC13761dXh activityC13761dXh, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC12782ctV abstractC12782ctV = activityC13761dXh.AhwBna;
        ApproveListItem approveListItem = null;
        if (abstractC12782ctV == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV = null;
        }
        eventParamsList.add(new EventParam("wallet_id", abstractC12782ctV.DbNXlk(), false));
        ApproveListItem approveListItem2 = activityC13761dXh.KWHzl;
        if (approveListItem2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            approveListItem = approveListItem2;
        }
        java.lang.String strAEQbTJ = approveListItem.AEQbTJ();
        eventParamsList.add(new EventParam("risk_address", strAEQbTJ != null ? strAEQbTJ : "", false));
        eventParamsList.add(new EventParam("terminal", "android", true));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AEQbTJ();
        this.AEQbTJ = null;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    private final void KWHzl() {
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false), this);
        final Function1 function1 = new Function1() { // from class: o.dXf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC13761dXh.KWHzl(this.copydefault, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dXg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC13761dXh.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.dXi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC13761dXh.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dXj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC13761dXh.copydefault(function12, obj);
            }
        });
        FragmentManager fragmentManager = new FragmentManager(new xZA(0L, 300L, null, 4, null));
        this.AEQbTJ = fragmentManager;
        C11205cFp.EZpvd.AxsJAY().AEQbTJ(fragmentManager);
    }

    public static final Unit KWHzl(ActivityC13761dXh activityC13761dXh, AbstractC12782ctV abstractC12782ctV) {
        activityC13761dXh.AhwBna = abstractC12782ctV;
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.dXh$FragmentManager */
    public static final class FragmentManager extends xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> {
        public FragmentManager(xZA xza) {
            super("TxHistorySub-approveDetail", xza);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletTxHistorySubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ActivityC13761dXh activityC13761dXh = ActivityC13761dXh.this;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                return;
            }
            for (WalletTxHistorySubManager.SubResponse subResponse : list) {
                if (subResponse.isTxTypeAuthorization() || subResponse.isTxTypeEIP7702Authorization()) {
                    AbstractC12782ctV abstractC12782ctV = activityC13761dXh.AhwBna;
                    if (abstractC12782ctV == null) {
                        Intrinsics.gEmmrt("");
                        abstractC12782ctV = null;
                    }
                    java.lang.String address = subResponse.getAddress();
                    if (address == null) {
                        address = "";
                    }
                    if (abstractC12782ctV.DbNXlk(address)) {
                        C15523eLm.refresh$default(C15523eLm.KWHzl, null, false, 2, null);
                        return;
                    }
                }
            }
        }
    }

    private final void AEQbTJ() {
        xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> taskDescription = this.AEQbTJ;
        if (taskDescription != null) {
            C11205cFp.EZpvd.AxsJAY().OLrzqt(taskDescription);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

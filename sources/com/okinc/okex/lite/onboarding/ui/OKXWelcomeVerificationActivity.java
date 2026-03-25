package com.okinc.okex.lite.onboarding.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okex.lite.home.bean.LiteHomeWelcomeData;
import com.okinc.okex.lite.home.bean.OnboardingButtonInfo;
import com.okinc.okex.lite.home.bean.WelcomeStepInfo;
import com.okinc.okex.lite.onboarding.ui.OKXWelcomeVerificationActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC45782sxa;
import o.AbstractC43238rlX;
import o.AbstractC45791sxk;
import o.AbstractC45801sxu;
import o.C32866mlf;
import o.C33054mpH;
import o.C33129mqd;
import o.C33492mxV;
import o.C33570myu;
import o.C43251rlk;
import o.C45716svX;
import o.C45754swS;
import o.C52761wXj;
import o.C52794wYp;
import o.C56392yDr;
import o.InterfaceC33172mrT;
import o.InterfaceC43294rma;
import o.InterfaceC56387yDm;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class OKXWelcomeVerificationActivity extends AbstractActivityC45782sxa {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int valueOf = 8;
    public C52794wYp AYXKKw;
    public RecyclerView AhwBna;
    public LiteHomeWelcomeData isConnected;

    @yCM
    public C45754swS kycManager;
    public TaskDescription values;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.sxi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(OKXWelcomeVerificationActivity.djBIcL());
        }
    });
    public final List<AbstractC45791sxk> DbNXlk = new ArrayList();
    public String djBIcL = "OKXWelcomeVerificationActivity";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public String getTAG() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    public static final boolean djBIcL() {
        return C33492mxV.OLrzqt();
    }

    private final boolean fetchVPNInfo() {
        return ((Boolean) this.gEmmrt.getValue()).booleanValue();
    }

    public final C45754swS AhwBna() {
        C45754swS c45754swS = this.kycManager;
        if (c45754swS != null) {
            return c45754swS;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractActivityC45782sxa, o.AbstractActivityC33008moO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C45716svX.StateListAnimator.AEQbTJ);
        valueOf();
        C32866mlf.onEvent$default("OnboardingRewards_Full_Page_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
    }

    @Override // o.AbstractActivityC45782sxa, o.AbstractActivityC33008moO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        gEmmrt();
    }

    private final void valueOf() {
        this.AhwBna = (RecyclerView) findViewById(C45716svX.ActionBar.QVAiDq);
        this.AYXKKw = (C52794wYp) findViewById(C45716svX.ActionBar.djSkpj);
        final CardView cardView = (CardView) findViewById(C45716svX.ActionBar.EZpvd);
        View viewFindViewById = findViewById(C45716svX.ActionBar.RcXXUw);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        ((MaterialToolbar) viewFindViewById).setNavigationOnClickListener(new View.OnClickListener() { // from class: o.sxd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                OKXWelcomeVerificationActivity.copydefault(this.EZpvd, view);
            }
        });
        RecyclerView recyclerView = this.AhwBna;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.gEmmrt("");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.values = new TaskDescription(this, fetchVPNInfo());
        RecyclerView recyclerView3 = this.AhwBna;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
            recyclerView3 = null;
        }
        TaskDescription taskDescription = this.values;
        if (taskDescription == null) {
            Intrinsics.gEmmrt("");
            taskDescription = null;
        }
        recyclerView3.setAdapter(taskDescription);
        C52794wYp c52794wYp = this.AYXKKw;
        if (c52794wYp == null) {
            Intrinsics.gEmmrt("");
            c52794wYp = null;
        }
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.sxf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                OKXWelcomeVerificationActivity.OLrzqt(this.OLrzqt, view);
            }
        });
        RecyclerView recyclerView4 = this.AhwBna;
        if (recyclerView4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recyclerView2 = recyclerView4;
        }
        recyclerView2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.sxj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                OKXWelcomeVerificationActivity.AEQbTJ(this.EZpvd, cardView, view, i, i2, i3, i4);
            }
        });
    }

    public static final void copydefault(OKXWelcomeVerificationActivity oKXWelcomeVerificationActivity, View view) {
        C32866mlf.onEvent$default("OnboardingRewards_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.sxn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKXWelcomeVerificationActivity.OLrzqt((EventParamsList) obj);
            }
        }, 1, (Object) null);
        oKXWelcomeVerificationActivity.AYXKKw();
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, EopTrackEvent.CLOSE, true);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(OKXWelcomeVerificationActivity oKXWelcomeVerificationActivity, View view) {
        final OnboardingButtonInfo onboardingButtonInfoCopydefault;
        LiteHomeWelcomeData liteHomeWelcomeData = oKXWelcomeVerificationActivity.isConnected;
        if (liteHomeWelcomeData == null || (onboardingButtonInfoCopydefault = liteHomeWelcomeData.copydefault()) == null) {
            return;
        }
        C32866mlf.onEvent$default(onboardingButtonInfoCopydefault.OLrzqt(), (TrackChannel[]) null, new Function1() { // from class: o.sxh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKXWelcomeVerificationActivity.EZpvd(onboardingButtonInfoCopydefault, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        if (onboardingButtonInfoCopydefault.EZpvd() == 0) {
            oKXWelcomeVerificationActivity.AYXKKw();
            oKXWelcomeVerificationActivity.AhwBna().AEQbTJ(oKXWelcomeVerificationActivity);
        } else {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), oKXWelcomeVerificationActivity, onboardingButtonInfoCopydefault.KWHzl(), null, new Function1() { // from class: o.sxg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OKXWelcomeVerificationActivity.copydefault((AbstractC43238rlX) obj);
                }
            }, 4, null);
            if (oKXWelcomeVerificationActivity.OLrzqt(onboardingButtonInfoCopydefault.KWHzl())) {
                oKXWelcomeVerificationActivity.finish();
            }
        }
    }

    public static final Unit EZpvd(OnboardingButtonInfo onboardingButtonInfo, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, onboardingButtonInfo.copydefault(), true);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(OKXWelcomeVerificationActivity oKXWelcomeVerificationActivity, CardView cardView, View view, int i, int i2, int i3, int i4) {
        if (!view.canScrollVertically(1)) {
            Intrinsics.copydefault(cardView);
            oKXWelcomeVerificationActivity.EZpvd(cardView);
        } else {
            Intrinsics.copydefault(cardView);
            oKXWelcomeVerificationActivity.OLrzqt(cardView);
        }
    }

    public final void OLrzqt(CardView cardView) {
        cardView.setCardElevation(C33570myu.KWHzl(this, 7.0f));
    }

    public final void EZpvd(CardView cardView) {
        cardView.setCardElevation(0.0f);
    }

    public final boolean OLrzqt(String str) {
        return StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "kyc", false, 2, (Object) null);
    }

    public final void gEmmrt() {
        showLoading();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OKXWelcomeVerificationActivity$updateContentText$1(this, null), 3, null);
    }

    public final void OLrzqt(LiteHomeWelcomeData liteHomeWelcomeData) {
        this.isConnected = liteHomeWelcomeData;
        C52794wYp c52794wYp = this.AYXKKw;
        if (c52794wYp == null) {
            Intrinsics.gEmmrt("");
            c52794wYp = null;
        }
        c52794wYp.setText(liteHomeWelcomeData.copydefault().AEQbTJ());
        this.DbNXlk.clear();
        this.DbNXlk.add(new AbstractC45791sxk.StateListAnimator(liteHomeWelcomeData.AhwBna(), liteHomeWelcomeData.djBIcL(), liteHomeWelcomeData.KWHzl(), liteHomeWelcomeData.AEQbTJ()));
        List<WelcomeStepInfo> listAYXKKw = liteHomeWelcomeData.AYXKKw();
        if (listAYXKKw != null) {
            int i = 0;
            for (Object obj : listAYXKKw) {
                int i2 = i + 1;
                if (i < 0) {
                    yDY.AYXKKw();
                }
                WelcomeStepInfo welcomeStepInfo = (WelcomeStepInfo) obj;
                int iOLrzqt = liteHomeWelcomeData.OLrzqt() - 1;
                List<AbstractC45791sxk> list = this.DbNXlk;
                String strOLrzqt = welcomeStepInfo.OLrzqt();
                String strAEQbTJ = welcomeStepInfo.AEQbTJ();
                boolean z = i == iOLrzqt;
                boolean z2 = i < iOLrzqt;
                boolean z3 = i == 0;
                List<WelcomeStepInfo> listAYXKKw2 = liteHomeWelcomeData.AYXKKw();
                list.add(new AbstractC45791sxk.Activity(strOLrzqt, strAEQbTJ, z, z2, z3, i == (listAYXKKw2 != null ? listAYXKKw2.size() : 0) - 1, String.valueOf(i2)));
                i = i2;
            }
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OKXWelcomeVerificationActivity$setUpData$2(this, null), 3, null);
    }

    public final void AYXKKw() {
        ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).copydefault(this, new Bundle());
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        AYXKKw();
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription extends AbstractC45801sxu<AbstractC45791sxk, RecyclerView.ViewHolder> {
        public final boolean EZpvd;
        public final int KWHzl;
        public final int copydefault;

        public TaskDescription(@NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            this.EZpvd = z;
            this.KWHzl = ContextCompat.getColor(context, C52761wXj.Activity.dXcUrg);
            this.copydefault = ContextCompat.getColor(context, C52761wXj.Activity.UlJrfe);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            if (i == 0) {
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(C45716svX.StateListAnimator.EZpvd, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "");
                return new ActionBar(viewInflate);
            }
            View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C45716svX.StateListAnimator.KWHzl, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "");
            return new Application(viewInflate2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return AEQbTJ().get(i).EZpvd().ordinal();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            AbstractC45791sxk abstractC45791sxk = AEQbTJ().get(i);
            if (viewHolder instanceof ActionBar) {
                Intrinsics.copydefault(abstractC45791sxk, "");
                ((ActionBar) viewHolder).copydefault((AbstractC45791sxk.StateListAnimator) abstractC45791sxk, this.EZpvd);
            } else {
                Intrinsics.copydefault(abstractC45791sxk, "");
                ((Application) viewHolder).AEQbTJ((AbstractC45791sxk.Activity) abstractC45791sxk, this.copydefault, this.KWHzl);
            }
        }

        public static final class ActionBar extends RecyclerView.ViewHolder {
            public TextView EZpvd;
            public TextView KWHzl;
            public ImageView OLrzqt;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                View viewFindViewById = view.findViewById(C45716svX.ActionBar.dxcTrN);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.EZpvd = (TextView) viewFindViewById;
                View viewFindViewById2 = view.findViewById(C45716svX.ActionBar.finit);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                this.KWHzl = (TextView) viewFindViewById2;
                View viewFindViewById3 = view.findViewById(C45716svX.ActionBar.aKErDB);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
                this.OLrzqt = (ImageView) viewFindViewById3;
            }

            public final void copydefault(@NotNull AbstractC45791sxk.StateListAnimator stateListAnimator, boolean z) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                this.EZpvd.setText(stateListAnimator.KWHzl());
                this.KWHzl.setText(stateListAnimator.copydefault());
                C33054mpH.AEQbTJ(this.OLrzqt, z ? stateListAnimator.AEQbTJ() : stateListAnimator.OLrzqt());
            }
        }

        public static final class Application extends RecyclerView.ViewHolder {
            public final TextView AEQbTJ;
            public final TextView EZpvd;
            public final View KWHzl;
            public final View OLrzqt;
            public final View copydefault;
            public final View djBIcL;
            public final TextView valueOf;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.djBIcL = view.findViewById(C45716svX.ActionBar.QKVWgx);
                this.OLrzqt = view.findViewById(C45716svX.ActionBar.DTwDnp);
                this.valueOf = (TextView) view.findViewById(C45716svX.ActionBar.QUSxYX);
                this.AEQbTJ = (TextView) view.findViewById(C45716svX.ActionBar.RJOkX);
                this.copydefault = view.findViewById(C45716svX.ActionBar.OLrzqt);
                this.EZpvd = (TextView) view.findViewById(C45716svX.ActionBar.QbewEr);
                this.KWHzl = view.findViewById(C45716svX.ActionBar.QfsBiF);
            }

            public final void AEQbTJ(@NotNull AbstractC45791sxk.Activity activity, @ColorInt int i, @ColorInt int i2) {
                Intrinsics.checkNotNullParameter(activity, "");
                View view = this.djBIcL;
                Intrinsics.checkNotNullExpressionValue(view, "");
                view.setVisibility(activity.AhwBna() ^ true ? 0 : 8);
                View view2 = this.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                view2.setVisibility(activity.valueOf() ^ true ? 0 : 8);
                TextView textView = this.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(C33129mqd.OLrzqt((CharSequence) activity.OLrzqt()) ? 0 : 8);
                TextView textView2 = this.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(C33129mqd.OLrzqt((CharSequence) activity.KWHzl()) ? 0 : 8);
                this.valueOf.setText(activity.OLrzqt());
                this.AEQbTJ.setText(activity.KWHzl());
                this.EZpvd.setText(activity.AEQbTJ());
                this.valueOf.setTextAppearance(C52761wXj.LoaderManager.QVAiDq);
                if (activity.copydefault()) {
                    View view3 = this.copydefault;
                    Intrinsics.checkNotNullExpressionValue(view3, "");
                    view3.setVisibility(0);
                    TextView textView3 = this.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(textView3, "");
                    textView3.setVisibility(0);
                    this.valueOf.setTextAppearance(C52761wXj.LoaderManager.QbewEr);
                    this.djBIcL.setBackgroundColor(i);
                    this.OLrzqt.setBackgroundColor(i2);
                    this.KWHzl.setBackground(ContextCompat.getDrawable(this.EZpvd.getContext(), C52761wXj.TaskDescription.OEgNct));
                    TextView textView4 = this.EZpvd;
                    textView4.setBackground(ContextCompat.getDrawable(textView4.getContext(), C52761wXj.TaskDescription.FQMcgE));
                    TextView textView5 = this.EZpvd;
                    textView5.setTextColor(ContextCompat.getColor(textView5.getContext(), C52761wXj.Activity.registerUser));
                    return;
                }
                if (!activity.AYXKKw()) {
                    View view4 = this.copydefault;
                    Intrinsics.checkNotNullExpressionValue(view4, "");
                    view4.setVisibility(8);
                    TextView textView6 = this.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(textView6, "");
                    textView6.setVisibility(0);
                    this.djBIcL.setBackgroundColor(i2);
                    this.OLrzqt.setBackgroundColor(i2);
                    this.KWHzl.setBackground(ContextCompat.getDrawable(this.EZpvd.getContext(), C52761wXj.TaskDescription.OEgNct));
                    TextView textView7 = this.EZpvd;
                    textView7.setBackground(ContextCompat.getDrawable(textView7.getContext(), C52761wXj.TaskDescription.OEgNct));
                    this.EZpvd.setTextColor(i2);
                    return;
                }
                View view5 = this.copydefault;
                Intrinsics.checkNotNullExpressionValue(view5, "");
                view5.setVisibility(0);
                TextView textView8 = this.EZpvd;
                Intrinsics.checkNotNullExpressionValue(textView8, "");
                textView8.setVisibility(8);
                this.KWHzl.setBackground(ContextCompat.getDrawable(this.EZpvd.getContext(), C45716svX.Application.copydefault));
                this.valueOf.setTextColor(i);
                this.OLrzqt.setBackgroundColor(i);
            }
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.onboarding.ui.OKXWelcomeVerificationActivity.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.AbstractActivityC45782sxa, o.AbstractActivityC33008moO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC45782sxa, o.AbstractActivityC33008moO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC45782sxa, o.AbstractActivityC33008moO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}

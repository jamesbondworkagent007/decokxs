package o;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.api.model.tx.signdata.BaseTransferSignData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.wallet.api.bean.WalletRechargeResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.C9225bRa;
import o.InterfaceC54829xWw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gwr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21286gwr extends RecyclerView {
    public final java.util.ArrayList<java.lang.Object> AEQbTJ;
    public C9225bRa.Activity EZpvd;
    public boolean KWHzl;
    public java.lang.Integer OLrzqt;
    public Function1<? super C9225bRa.Activity, Unit> copydefault;
    public AbstractC8564bFB<?, ?> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSelectCryptoFinish(Function1<? super C9225bRa.Activity, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21286gwr(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new java.util.ArrayList<>();
        KWHzl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21286gwr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new java.util.ArrayList<>();
        KWHzl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21286gwr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new java.util.ArrayList<>();
        KWHzl();
    }

    private final void KWHzl() {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(C9225bRa.Activity.class, new Application(C13754dXa.TaskDescription.Dfm, dTV.OLrzqt));
        c59534zip.setItems(this.AEQbTJ);
        setAdapter(c59534zip);
    }

    /* JADX INFO: renamed from: o.gwr$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application extends C43318rmy<C9225bRa.Activity, AbstractC16848erf> {
        public Application(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC16848erf> c43312rms, C9225bRa.Activity activity) {
            InterfaceC9731bbC interfaceC9731bbCCopydefault;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(activity, "");
            C21286gwr c21286gwr = C21286gwr.this;
            AppCompatImageView appCompatImageView = ((AbstractC16848erf) c43312rms.OLrzqt()).AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            c21286gwr.setIconRes(appCompatImageView, activity.copydefault().DbNXlk());
            ((AbstractC16848erf) c43312rms.OLrzqt()).valueOf.setText(activity.copydefault().fJNWhG());
            boolean z = false;
            if (!C21286gwr.this.KWHzl(activity)) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(C33070mpX.AYXKKw(C13754dXa.FragmentManager.createConfigurationContext));
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.HJWChPQdUnVm)), 0, C33070mpX.AYXKKw(C13754dXa.FragmentManager.createConfigurationContext).length(), 33);
                AppCompatTextView appCompatTextView = ((AbstractC16848erf) c43312rms.OLrzqt()).djBIcL;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                appCompatTextView.setVisibility(0);
                ((AbstractC16848erf) c43312rms.OLrzqt()).djBIcL.setText(spannableStringBuilder);
                android.widget.LinearLayout linearLayout = ((AbstractC16848erf) c43312rms.OLrzqt()).KWHzl;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(8);
                android.view.View view = ((AbstractC16848erf) c43312rms.OLrzqt()).OLrzqt;
                Intrinsics.checkNotNullExpressionValue(view, "");
                view.setVisibility(8);
                C52794wYp c52794wYp = ((AbstractC16848erf) c43312rms.OLrzqt()).copydefault;
                Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                c52794wYp.setVisibility(0);
                ((AbstractC16848erf) c43312rms.OLrzqt()).copydefault.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.isElapsedRealtimeNanosAvailable, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", activity.copydefault().fJNWhG()))));
                C57304yfr c57304yfr = C57304yfr.copydefault;
                C52794wYp c52794wYp2 = ((AbstractC16848erf) c43312rms.OLrzqt()).copydefault;
                Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
                c57304yfr.copydefault(c52794wYp2, 70, 70, 70, 70);
                C52794wYp c52794wYp3 = ((AbstractC16848erf) c43312rms.OLrzqt()).copydefault;
                c52794wYp3.setOnClickListener(new Activity(c52794wYp3, 1000L, C21286gwr.this, activity));
            } else {
                C52794wYp c52794wYp4 = ((AbstractC16848erf) c43312rms.OLrzqt()).copydefault;
                Intrinsics.checkNotNullExpressionValue(c52794wYp4, "");
                c52794wYp4.setVisibility(8);
                java.lang.String strEZpvd = C21286gwr.this.EZpvd(activity);
                if (strEZpvd.length() > 0) {
                    AppCompatTextView appCompatTextView2 = ((AbstractC16848erf) c43312rms.OLrzqt()).djBIcL;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                    appCompatTextView2.setVisibility(0);
                    ((AbstractC16848erf) c43312rms.OLrzqt()).djBIcL.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.PickVisualMediaRequestKt, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, activity.AEQbTJ(strEZpvd)))));
                } else {
                    AppCompatTextView appCompatTextView3 = ((AbstractC16848erf) c43312rms.OLrzqt()).djBIcL;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
                    appCompatTextView3.setVisibility(8);
                }
                if (activity.fJNWhG() && activity.KWHzl().length() > 0) {
                    android.widget.LinearLayout linearLayout2 = ((AbstractC16848erf) c43312rms.OLrzqt()).KWHzl;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                    linearLayout2.setVisibility(0);
                    ((AbstractC16848erf) c43312rms.OLrzqt()).AhwBna.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.throwFeatureRequestIfSubDecorInstalled) + ": " + activity.AEQbTJ(activity.KWHzl()));
                    AppCompatImageView appCompatImageView2 = ((AbstractC16848erf) c43312rms.OLrzqt()).EZpvd;
                    appCompatImageView2.setOnClickListener(new StateListAnimator(appCompatImageView2, 1000L, C21286gwr.this));
                } else {
                    android.widget.LinearLayout linearLayout3 = ((AbstractC16848erf) c43312rms.OLrzqt()).KWHzl;
                    Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                    linearLayout3.setVisibility(8);
                }
                C21286gwr c21286gwr2 = C21286gwr.this;
                AppCompatTextView appCompatTextView4 = ((AbstractC16848erf) c43312rms.OLrzqt()).djBIcL;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
                android.widget.LinearLayout linearLayout4 = ((AbstractC16848erf) c43312rms.OLrzqt()).KWHzl;
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
                AppCompatTextView appCompatTextView5 = ((AbstractC16848erf) c43312rms.OLrzqt()).AhwBna;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView5, "");
                android.view.View view2 = ((AbstractC16848erf) c43312rms.OLrzqt()).OLrzqt;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                c21286gwr2.OLrzqt(appCompatTextView4, linearLayout4, appCompatTextView5, view2);
            }
            android.view.View root = ((AbstractC16848erf) c43312rms.OLrzqt()).getRoot();
            root.setOnClickListener(new ViewOnClickListenerC0854Application(root, 1000L, C21286gwr.this, activity));
            android.view.View root2 = ((AbstractC16848erf) c43312rms.OLrzqt()).getRoot();
            C9225bRa.Activity activity2 = C21286gwr.this.EZpvd;
            if (activity2 != null && (interfaceC9731bbCCopydefault = activity2.copydefault()) != null && activity.copydefault().AhwBna() == interfaceC9731bbCCopydefault.AhwBna()) {
                z = true;
            }
            root2.setSelected(z);
            if (C21286gwr.this.KWHzl) {
                C21286gwr.this.KWHzl(c43312rms);
            }
            super.onBindViewHolder((C43312rms) c43312rms, activity);
        }

        /* JADX INFO: renamed from: o.gwr$Application$TaskDescription */
        public static final class TaskDescription implements Function1<WalletRechargeResult, Unit> {
            public static final TaskDescription KWHzl = new TaskDescription();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void copydefault(WalletRechargeResult walletRechargeResult) {
                Intrinsics.checkNotNullParameter(walletRechargeResult, "");
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(WalletRechargeResult walletRechargeResult) {
                copydefault(walletRechargeResult);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: o.gwr$Application$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
                this.AEQbTJ = viewOnClickListenerC54939xaY;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.AEQbTJ.dismiss();
            }
        }

        /* JADX INFO: renamed from: o.gwr$Application$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ C21286gwr OLrzqt;
            public final /* synthetic */ C9225bRa.Activity copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, C21286gwr c21286gwr, C9225bRa.Activity activity) {
                this.AEQbTJ = view;
                this.EZpvd = j;
                this.OLrzqt = c21286gwr;
                this.copydefault = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
                    android.app.Activity activityOLrzqt = C33569myt.OLrzqt(this.OLrzqt.getContext());
                    FragmentActivity fragmentActivity = activityOLrzqt instanceof FragmentActivity ? (FragmentActivity) activityOLrzqt : null;
                    AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivity : null;
                    if (abstractActivityC33041mov == null) {
                        return;
                    }
                    InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, abstractActivityC33041mov, new WalletRechargeBean(C33129mqd.gEmmrt(java.lang.Long.valueOf(this.copydefault.copydefault().fetchVPNInfo())), C33129mqd.gEmmrt(this.copydefault.copydefault().OLrzqt()), "wallet", "gas", yDY.copydefault("dex"), (java.util.ArrayList) null, false, (java.lang.String) null, 0, LivenessCoordinator.TARGET_WIDTH, (DefaultConstructorMarker) null), 0, TaskDescription.KWHzl, 4, null);
                }
            }
        }

        /* JADX INFO: renamed from: o.gwr$Application$Application, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0854Application implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C21286gwr EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ C9225bRa.Activity copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0854Application(android.view.View view, long j, C21286gwr c21286gwr, C9225bRa.Activity activity) {
                this.KWHzl = view;
                this.AEQbTJ = j;
                this.EZpvd = c21286gwr;
                this.copydefault = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    Function1 function1 = this.EZpvd.copydefault;
                    if (function1 != null) {
                        function1.invoke(this.copydefault);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.gwr$Application$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ C21286gwr AEQbTJ;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, C21286gwr c21286gwr) {
                this.copydefault = view;
                this.KWHzl = j;
                this.AEQbTJ = c21286gwr;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    android.content.Context context = this.AEQbTJ.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureWindow));
                    viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.getNotifyChildrenChangedOptions), (View.OnClickListener) new ActionBar(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    public final void OLrzqt(android.widget.TextView textView, android.widget.LinearLayout linearLayout, android.widget.TextView textView2, android.view.View view) {
        int i = 8;
        if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(C33570myu.AEQbTJ() - C55298xhM.dp2px$default(108.0f, null, 1, null)), java.lang.Float.valueOf((textView.getVisibility() == 0 ? textView.getPaint().measureText(C33129mqd.gEmmrt(textView.getText())) : 0.0f) + (linearLayout.getVisibility() == 0 ? textView2.getPaint().measureText(C33129mqd.gEmmrt(textView2.getText())) : 0.0f) + ((textView.getVisibility() == 0 && linearLayout.getVisibility() == 0) ? C55298xhM.dp2px$default(9.0f, null, 1, null) : 0) + (linearLayout.getVisibility() == 0 ? C55298xhM.dp2px$default(18.0f, null, 1, null) : 0)))) {
            view.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            C55296xhK.AEQbTJ(layoutParams, 0, 0, 0, 0);
            layoutParams.addRule(3, textView.getId());
            layoutParams.addRule(20, -1);
            linearLayout.setLayoutParams(layoutParams);
            return;
        }
        if (textView.getVisibility() == 0 && linearLayout.getVisibility() == 0) {
            i = 0;
        }
        view.setVisibility(i);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        C55296xhK.AEQbTJ(layoutParams2, C55298xhM.dp2px$default(4.0f, null, 1, null), 0, 0, 0);
        layoutParams2.addRule(17, view.getId());
        layoutParams2.addRule(6, textView.getId());
        linearLayout.setLayoutParams(layoutParams2);
    }

    public final void setDataList(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull java.util.List<C9225bRa.Activity> list, @NotNull C9225bRa.Activity activity, int i, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(activity, "");
        setHasFixedSize(true);
        setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.valueOf = abstractC8564bFB;
        this.EZpvd = activity;
        this.OLrzqt = java.lang.Integer.valueOf(i);
        this.KWHzl = z;
        this.AEQbTJ.clear();
        this.AEQbTJ.addAll(list);
        RecyclerView.Adapter adapter = getAdapter();
        C59534zip c59534zip = adapter instanceof C59534zip ? (C59534zip) adapter : null;
        if (c59534zip != null) {
            c59534zip.setItems(this.AEQbTJ);
        }
        RecyclerView.Adapter adapter2 = getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }

    public final void setIconRes(android.widget.ImageView imageView, java.lang.Object obj) {
        C5335Nt<android.graphics.drawable.Drawable> c5335NtKWHzl = Glide.KWHzl(imageView).KWHzl(obj);
        C14726dqr c14726dqr = C14726dqr.OLrzqt;
        c5335NtKWHzl.AEQbTJ(c14726dqr.OLrzqt()).copydefault(c14726dqr.OLrzqt()).KWHzl(c14726dqr.OLrzqt()).EZpvd(imageView);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean KWHzl(C9225bRa.Activity activity) {
        java.lang.Object objAEQbTJ;
        AbstractC8564bFB<?, ?> abstractC8564bFB = this.valueOf;
        if (abstractC8564bFB == null) {
            Intrinsics.gEmmrt("");
            abstractC8564bFB = null;
        }
        if (abstractC8564bFB instanceof AbstractC8704bHj) {
            AbstractC8704bHj abstractC8704bHj = (AbstractC8704bHj) abstractC8564bFB;
            if (((BaseTransferSignData) abstractC8704bHj.QVsKAR()).isTransferMaxAmount() && abstractC8704bHj.fHqPtx().AhwBna() == activity.copydefault().AhwBna()) {
                if (activity.fJNWhG()) {
                    objAEQbTJ = C54862xYb.KWHzl(activity.EZpvd(), activity.KWHzl());
                } else {
                    objAEQbTJ = activity.EZpvd();
                }
            } else if (activity.fJNWhG()) {
                objAEQbTJ = C54862xYb.KWHzl(activity.AEQbTJ(), activity.KWHzl());
            } else {
                objAEQbTJ = activity.AEQbTJ();
            }
        }
        java.lang.Integer num = this.OLrzqt;
        return C33129mqd.copydefault(objAEQbTJ, OLrzqt(num != null ? num.intValue() : 32, activity));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.bCW] */
    public final java.lang.String EZpvd(C9225bRa.Activity activity) {
        AbstractC8564bFB<?, ?> abstractC8564bFB = this.valueOf;
        if (abstractC8564bFB == null) {
            Intrinsics.gEmmrt("");
            abstractC8564bFB = null;
        }
        if (abstractC8564bFB instanceof AbstractC8704bHj) {
            AbstractC8704bHj abstractC8704bHj = (AbstractC8704bHj) abstractC8564bFB;
            if (((BaseTransferSignData) abstractC8704bHj.QVsKAR()).isTransferMaxAmount() && abstractC8704bHj.fHqPtx().AhwBna() == activity.copydefault().AhwBna() && abstractC8704bHj.QKudOq().AYXKKw().AhwBna() == activity.copydefault().AhwBna()) {
                java.lang.Integer num = this.OLrzqt;
                java.lang.String strOLrzqt = OLrzqt(num != null ? num.intValue() : 32, activity);
                if (activity.fJNWhG()) {
                    strOLrzqt = C54862xYb.convertToString$default(C54862xYb.AEQbTJ(strOLrzqt, activity.KWHzl()), false, null, null, 7, null);
                    if (C33129mqd.gEmmrt(strOLrzqt, "0")) {
                        strOLrzqt = "0";
                    }
                }
                return C33129mqd.copydefault(activity.EZpvd(), strOLrzqt) ? strOLrzqt : "0";
            }
        }
        return activity.AEQbTJ();
    }

    public final java.lang.String OLrzqt(int i, C9225bRa.Activity activity) {
        switch (i) {
            case 31:
                if (!activity.AuCTel()) {
                    return activity.ejfBZ();
                }
                return "0";
            case 32:
                if (!activity.values()) {
                    return activity.isConnected();
                }
                return "0";
            case 33:
                if (!activity.djBIcL()) {
                    return activity.gEmmrt();
                }
                return "0";
            default:
                if (!activity.values()) {
                    return activity.isConnected();
                }
                return "0";
        }
    }

    public final void KWHzl(C43312rms<AbstractC16848erf> c43312rms) {
        android.animation.AnimatorSet duration = new android.animation.AnimatorSet().setDuration(600L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.animation.ObjectAnimator.ofFloat(((AbstractC16848erf) c43312rms.OLrzqt()).djBIcL, "alpha", 1.0f, 0.0f, 1.0f));
        arrayList.add(android.animation.ObjectAnimator.ofFloat(((AbstractC16848erf) c43312rms.OLrzqt()).AhwBna, "alpha", 1.0f, 0.0f, 1.0f));
        duration.playTogether(arrayList);
        duration.start();
    }
}

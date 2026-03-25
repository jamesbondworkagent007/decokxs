package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.beloo.widget.chipslayoutmanager.SpacingItemDecoration;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.social_trade_api.data.BusinessLine;
import com.okinc.tradingbot.impl.strategy.bean.SignalDetailCard;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.InterfaceC49317umK;
import o.wUE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vxi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52005vxi extends ConstraintLayout {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public AbstractC48626uYj AEQbTJ;
    public java.lang.String KWHzl;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52005vxi(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52005vxi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:42) call: o.vxi.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52005vxi(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52005vxi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = "";
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vxq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52005vxi.copydefault();
            }
        });
        gEmmrt();
        AEQbTJ();
    }

    /* JADX INFO: renamed from: o.vxi$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vxi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final C43316rmw EZpvd() {
        return (C43316rmw) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw copydefault() {
        return new C43316rmw();
    }

    private final void gEmmrt() {
        this.AEQbTJ = (AbstractC48626uYj) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.pXZxY, this, true);
        OLrzqt();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.vxb.setText$default(o.vxb, java.lang.String, int, int, java.lang.Object):void */
    public final void AEQbTJ(@NotNull final SignalDetailCard signalDetailCard, @NotNull final Function1<? super SignalDetailCard, Unit> function1) {
        Intrinsics.checkNotNullParameter(signalDetailCard, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC48626uYj abstractC48626uYj = this.AEQbTJ;
        AbstractC48626uYj abstractC48626uYj2 = null;
        if (abstractC48626uYj == null) {
            Intrinsics.gEmmrt("");
            abstractC48626uYj = null;
        }
        abstractC48626uYj.gEmmrt.setText(signalDetailCard.copydefault());
        AbstractC48626uYj abstractC48626uYj3 = this.AEQbTJ;
        if (abstractC48626uYj3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48626uYj3 = null;
        }
        C51998vxb.setText$default(abstractC48626uYj3.djBIcL, signalDetailCard.KWHzl(), 0, 2, null);
        java.lang.String username = signalDetailCard.AEQbTJ().getUsername();
        wUE wue = wUE.OLrzqt;
        AbstractC48626uYj abstractC48626uYj4 = this.AEQbTJ;
        if (abstractC48626uYj4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48626uYj4 = null;
        }
        android.widget.ImageView imageView = abstractC48626uYj4.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        wue.KWHzl(imageView, wUE.Application.m8784constructorimpl$default(signalDetailCard.AEQbTJ().getAvatar(), null, 2, null));
        AbstractC48626uYj abstractC48626uYj5 = this.AEQbTJ;
        if (abstractC48626uYj5 == null) {
            Intrinsics.gEmmrt("");
            abstractC48626uYj5 = null;
        }
        abstractC48626uYj5.KWHzl.setText(username);
        this.KWHzl = signalDetailCard.AEQbTJ().getTraderUniqueName();
        KWHzl(signalDetailCard);
        C33064mpR.OLrzqt(EZpvd(), (java.util.List<? extends java.lang.Object>) signalDetailCard.OLrzqt());
        AbstractC48626uYj abstractC48626uYj6 = this.AEQbTJ;
        if (abstractC48626uYj6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48626uYj2 = abstractC48626uYj6;
        }
        abstractC48626uYj2.OLrzqt.KWHzl(signalDetailCard.EZpvd(), C33129mqd.AhwBna(signalDetailCard.AEQbTJ().getInstIdsCount()), 5, new Function0() { // from class: o.vxn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52005vxi.EZpvd(function1, signalDetailCard);
            }
        });
    }

    public static final Unit EZpvd(Function1 function1, SignalDetailCard signalDetailCard) {
        function1.invoke(signalDetailCard);
        return Unit.INSTANCE;
    }

    private final void OLrzqt() {
        AbstractC48626uYj abstractC48626uYj = this.AEQbTJ;
        AbstractC48626uYj abstractC48626uYj2 = null;
        if (abstractC48626uYj == null) {
            Intrinsics.gEmmrt("");
            abstractC48626uYj = null;
        }
        abstractC48626uYj.EZpvd.setLayoutManager(new LinearLayoutManager(getContext()));
        AbstractC48626uYj abstractC48626uYj3 = this.AEQbTJ;
        if (abstractC48626uYj3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48626uYj3 = null;
        }
        abstractC48626uYj3.EZpvd.addItemDecoration(new SpacingItemDecoration(0, C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null)));
        AbstractC48626uYj abstractC48626uYj4 = this.AEQbTJ;
        if (abstractC48626uYj4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48626uYj2 = abstractC48626uYj4;
        }
        abstractC48626uYj2.EZpvd.setAdapter(EZpvd());
        EZpvd().register(BotParamItemData.class, new C51263vji());
    }

    private final void AEQbTJ() {
        AbstractC48626uYj abstractC48626uYj = this.AEQbTJ;
        if (abstractC48626uYj == null) {
            Intrinsics.gEmmrt("");
            abstractC48626uYj = null;
        }
        ConstraintLayout constraintLayout = abstractC48626uYj.valueOf;
        constraintLayout.setOnClickListener(new StateListAnimator(constraintLayout, 1000L, this));
    }

    public final void KWHzl(@NotNull SignalDetailCard signalDetailCard) {
        Intrinsics.checkNotNullParameter(signalDetailCard, "");
        java.util.List<java.lang.String> listAhwBna = signalDetailCard.AhwBna();
        AbstractC48626uYj abstractC48626uYj = this.AEQbTJ;
        if (abstractC48626uYj == null) {
            Intrinsics.gEmmrt("");
            abstractC48626uYj = null;
        }
        abstractC48626uYj.AYXKKw.removeAllViews();
        int iDpInt$default = C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
        int i = 0;
        for (java.lang.Object obj : listAhwBna) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            if (i > 0) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                appCompatTextView.setText("/");
                appCompatTextView.setTextAppearance(C52761wXj.LoaderManager.RdAHlO);
                appCompatTextView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dff));
                appCompatTextView.setPaddingRelative(iDpInt$default, 0, iDpInt$default, 0);
                AbstractC48626uYj abstractC48626uYj2 = this.AEQbTJ;
                if (abstractC48626uYj2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC48626uYj2 = null;
                }
                abstractC48626uYj2.AYXKKw.addView(appCompatTextView);
            }
            if (signalDetailCard.AEQbTJ().isSubscribed()) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C55251xgS c55251xgS = new C55251xgS(context, null, 0, 6, null);
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.fdt);
                int iDpInt$default2 = C55298xhM.dpInt$default(14, (android.content.Context) null, 1, (java.lang.Object) null);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setBounds(0, 0, iDpInt$default2, iDpInt$default2);
                }
                c55251xgS.setOKDSSize(-3);
                c55251xgS.setTagIcon(drawableKWHzl);
                c55251xgS.setShowIcon(true);
                c55251xgS.setOKDSStyle(6);
                c55251xgS.setText(C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{" | "}, 0, MatchPattern.CONTAINS, false, new Function1() { // from class: o.vxp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C52005vxi.copydefault((java.util.List) obj2);
                    }
                }, 10, null));
                AbstractC48626uYj abstractC48626uYj3 = this.AEQbTJ;
                if (abstractC48626uYj3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC48626uYj3 = null;
                }
                abstractC48626uYj3.AYXKKw.addView(c55251xgS);
            } else {
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                C55251xgS c55251xgS2 = new C55251xgS(context2, null, 0, 6, null);
                c55251xgS2.setText(str);
                c55251xgS2.setOKDSStyle(7);
                c55251xgS2.setOKDSSize(-3);
                AbstractC48626uYj abstractC48626uYj4 = this.AEQbTJ;
                if (abstractC48626uYj4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC48626uYj4 = null;
                }
                abstractC48626uYj4.AYXKKw.addView(c55251xgS2);
            }
            i++;
        }
    }

    public static final Unit copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vxi$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C52005vxi AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C52005vxi c52005vxi) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c52005vxi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC49317umK interfaceC49317umK = (InterfaceC49317umK) C43251rlk.copydefault(InterfaceC49317umK.class);
                android.content.Context context = this.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                InterfaceC49317umK.Application.navigateToTraderBusinessLinePage$default(interfaceC49317umK, context, this.AEQbTJ.KWHzl, BusinessLine.Signal, "signalDetail", null, 16, null);
            }
        }
    }
}

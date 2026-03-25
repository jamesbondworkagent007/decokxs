package o;

import android.graphics.Color;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.base.TokenDetailEventTrackingInfo;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.overview.ui.widget.VibesRelevance;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC9847bdM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kmX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29060kmX extends android.widget.LinearLayout {
    public TokenDetailEventTrackingInfo EZpvd;
    public final InterfaceC56387yDm KWHzl;

    /* JADX INFO: renamed from: o.kmX$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[VibesRelevance.values().length];
            try {
                iArr[VibesRelevance.HIGH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[VibesRelevance.LIKELY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[VibesRelevance.WEAK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[VibesRelevance.UNRELIABLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29060kmX(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventTrackingInfo(TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo) {
        this.EZpvd = tokenDetailEventTrackingInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:45) call: o.kmX.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C29060kmX(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29060kmX(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.kmY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29060kmX.OLrzqt(context, this);
            }
        });
    }

    private final hEB copydefault() {
        return (hEB) this.KWHzl.getValue();
    }

    public static final hEB OLrzqt(android.content.Context context, C29060kmX c29060kmX) {
        return hEB.copydefault(android.view.LayoutInflater.from(context), c29060kmX, true);
    }

    public final void AEQbTJ(@NotNull C29116kna c29116kna, @NotNull Function0<Unit> function0, @NotNull Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(c29116kna, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        hEB hebCopydefault = copydefault();
        hebCopydefault.fARcdN.setText(C23319hvw.getFormattedNumberICU$default(c29116kna.EZpvd(), null, C38307pTy.Companion.KWHzl(2, 2), null, null, false, false, 61, null));
        int iEZpvd = hSU.EZpvd(Color.parseColor("#3077FF"), C25382ivf.KWHzl(C52761wXj.ActionBar.OBJEWx), C33129mqd.djBIcL(C23313hvq.divCheckS$default(C23313hvq.djBIcL(C23313hvq.AYXKKw(c29116kna.EZpvd(), 0), 100), "100", null, null, null, 14, null)));
        hebCopydefault.fARcdN.setTextColor(iEZpvd);
        android.widget.ImageView imageView = hebCopydefault.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        CDNSourceManager cDNSourceManager = CDNSourceManager.EZpvd;
        CDNSourceManager.ImageSource imageSource = CDNSourceManager.ImageSource.SignalFireAnimation;
        android.content.Context context = copydefault().AYXKKw.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25386ivj.OLrzqt(imageView, cDNSourceManager.OLrzqt(imageSource, context), C52761wXj.TaskDescription.processStrongAuthMessage);
        hebCopydefault.AYXKKw.setColorFilter(iEZpvd);
        hebCopydefault.values.setContentDescription("web3_dex_market_vibes_analysis_entry");
        ConstraintLayout constraintLayout = hebCopydefault.values;
        constraintLayout.setOnClickListener(new StateListAnimator(constraintLayout, 1000L, this, function0));
        android.view.View view = hebCopydefault.OLrzqt;
        view.setOnClickListener(new TaskDescription(view, 1000L, function2, c29116kna, this));
        android.widget.ImageView imageView2 = hebCopydefault.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c29116kna.copydefault()) ? 0 : 8);
        android.widget.ImageView imageView3 = hebCopydefault.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        if (imageView3.getVisibility() == 0) {
            android.view.View view2 = hebCopydefault.EZpvd;
            view2.setOnClickListener(new ActionBar(view2, 1000L, this, c29116kna));
        }
        hebCopydefault.fIwbmz.setText(getContext().getString(KWHzl(c29116kna.OLrzqt())));
        android.widget.TextView textView = hebCopydefault.fIwbmz;
        int iOLrzqt = OLrzqt(c29116kna.OLrzqt());
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView.setTextColor(C25382ivf.copydefault(iOLrzqt, context2));
        hebCopydefault.AuCTel.setText(C23319hvw.getFormattedNumberICU$default(C33129mqd.AYXKKw(c29116kna.KWHzl()), null, null, null, null, false, false, 63, null));
        android.widget.TextView textView2 = hebCopydefault.DbNXlk;
        java.lang.String strValueOf = C25322iuY.OLrzqt.valueOf(c29116kna.AEQbTJ());
        if (strValueOf.length() == 0) {
            strValueOf = "--";
        }
        textView2.setText(strValueOf);
        copydefault(C33129mqd.djBIcL(c29116kna.EZpvd()));
    }

    /* JADX INFO: renamed from: o.kmX$Activity */
    public static final class Activity implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ C29116kna AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(C29116kna c29116kna) {
            this.AEQbTJ = c29116kna;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "token_x_profile", false, 4, null);
            EventParamsList.put$default(eventParamsList, "app_tab_name", "info", false, 4, null);
            java.lang.String strGEmmrt = this.AEQbTJ.gEmmrt();
            if (strGEmmrt == null) {
                strGEmmrt = "none";
            } else {
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt)) {
                    strGEmmrt = null;
                }
                if (strGEmmrt == null) {
                }
            }
            EventParamsList.put$default(eventParamsList, "wallet_id", strGEmmrt, false, 4, null);
        }
    }

    private final void copydefault(float f) {
        if (f <= 0.0f) {
            return;
        }
        android.view.View view = copydefault().iwGUEr;
        Intrinsics.checkNotNullExpressionValue(view, "");
        android.widget.FrameLayout frameLayout = copydefault().copydefault;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        if (frameLayout.getWidth() > 0 && view.getWidth() > 0) {
            AEQbTJ(f);
        } else {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new Dialog(frameLayout, view, this, f));
        }
    }

    /* JADX INFO: renamed from: o.kmX$Dialog */
    public static final class Dialog implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ android.widget.FrameLayout AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ float KWHzl;
        public final /* synthetic */ C29060kmX OLrzqt;

        public Dialog(android.widget.FrameLayout frameLayout, android.view.View view, C29060kmX c29060kmX, float f) {
            this.AEQbTJ = frameLayout;
            this.EZpvd = view;
            this.OLrzqt = c29060kmX;
            this.KWHzl = f;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.AEQbTJ.getViewTreeObserver().removeOnPreDrawListener(this);
            if (this.AEQbTJ.getWidth() <= 0 || this.EZpvd.getWidth() <= 0) {
                return true;
            }
            this.OLrzqt.AEQbTJ(this.KWHzl);
            return true;
        }
    }

    public final void AEQbTJ(float f) {
        android.view.View view = copydefault().iwGUEr;
        Intrinsics.checkNotNullExpressionValue(view, "");
        android.widget.FrameLayout frameLayout = copydefault().copydefault;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        float fKWHzl = C56548yJl.KWHzl(f, 0.0f, 100.0f);
        if (frameLayout.getWidth() <= 0 || view.getWidth() <= 0) {
            return;
        }
        int width = frameLayout.getWidth();
        int width2 = view.getWidth();
        view.setTranslationX(0.0f);
        float f2 = width - width2;
        view.animate().translationX(C56548yJl.KWHzl((fKWHzl / 100.0f) * f2, 0.0f, f2)).setDuration(200L).start();
    }

    public final void AEQbTJ() {
        TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo = this.EZpvd;
        if (tokenDetailEventTrackingInfo != null) {
            C21847hOn.EZpvd(tokenDetailEventTrackingInfo, TokenDetailClickLayer.COMPONENTS, TokenDetailButtonName.INFO_VIBES_CLICK, CoinDetailTabType.INFO);
        }
    }

    /* JADX INFO: renamed from: o.kmX$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C29116kna EZpvd;
        public final /* synthetic */ C29060kmX KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C29060kmX c29060kmX, C29116kna c29116kna) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c29060kmX;
            this.EZpvd = c29116kna;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Token_Page_Click", new TrackChannel[0], new Activity(this.EZpvd), false, 8, null);
                android.content.Context context = this.KWHzl.getContext();
                java.lang.String strCopydefault = this.EZpvd.copydefault();
                Intrinsics.copydefault((java.lang.Object) strCopydefault);
                C25352ivB.KWHzl(context, strCopydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.kmX$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C29060kmX copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C29060kmX c29060kmX, Function0 function0) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c29060kmX;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.AEQbTJ();
                this.AEQbTJ.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.kmX$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C29116kna AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Function2 KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C29060kmX copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function2 function2, C29116kna c29116kna, C29060kmX c29060kmX) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = function2;
            this.AEQbTJ = c29116kna;
            this.copydefault = c29060kmX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.invoke(java.lang.Integer.valueOf(kBG.AEQbTJ.copydefault(this.AEQbTJ.EZpvd())), java.lang.Integer.valueOf(this.copydefault.EZpvd(this.AEQbTJ.OLrzqt())));
            }
        }
    }

    public final int KWHzl(VibesRelevance vibesRelevance) {
        int i = Application.OLrzqt[vibesRelevance.ordinal()];
        if (i == 1) {
            return C23274hvD.Fragment.ContextAwareKtwithContextAvailable2listener1;
        }
        if (i == 2) {
            return C23274hvD.Fragment.ContextAwareKtwithContextAvailable21;
        }
        if (i == 3) {
            return C23274hvD.Fragment.withContextAvailable;
        }
        if (i == 4) {
            return C23274hvD.Fragment.withContextAvailableforInline;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int OLrzqt(VibesRelevance vibesRelevance) {
        int i = Application.OLrzqt[vibesRelevance.ordinal()];
        if (i == 1) {
            return C52761wXj.ActionBar.OBJEWx;
        }
        if (i == 2) {
            return C52761wXj.Activity.gdmIOq;
        }
        if (i == 3) {
            return C52761wXj.Activity.DQzvGN;
        }
        if (i == 4) {
            return C52761wXj.Activity.QwvEab;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int EZpvd(VibesRelevance vibesRelevance) {
        int i = Application.OLrzqt[vibesRelevance.ordinal()];
        if (i == 1) {
            return C23274hvD.Fragment.OnContextAvailableListener;
        }
        if (i == 2) {
            return C23274hvD.Fragment.getResultCode;
        }
        if (i == 3) {
            return C23274hvD.Fragment.resultCodeToString;
        }
        if (i == 4) {
            return C23274hvD.Fragment.ActivityResult;
        }
        throw new NoWhenBranchMatchedException();
    }
}

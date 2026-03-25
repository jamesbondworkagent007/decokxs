package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28431kae extends android.widget.FrameLayout {
    public final InterfaceC56387yDm EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28431kae(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28431kae(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.kae.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28431kae(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28431kae(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.kaa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28431kae.KWHzl(context, this);
            }
        });
    }

    private final C21647hHc OLrzqt() {
        return (C21647hHc) this.EZpvd.getValue();
    }

    public static final C21647hHc KWHzl(android.content.Context context, C28431kae c28431kae) {
        return C21647hHc.AEQbTJ(android.view.LayoutInflater.from(context), c28431kae, true);
    }

    public static final Unit EZpvd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kae */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(C28431kae c28431kae, HolderDetailModel holderDetailModel, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: o.kai
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C28431kae.EZpvd((java.util.List) obj2);
                }
            };
        }
        c28431kae.setData(holderDetailModel, function0, function1);
    }

    public final void setData(@NotNull final HolderDetailModel holderDetailModel, Function0<Unit> function0, @NotNull final Function1<? super java.util.List<TagWrapper>, Unit> function1) {
        Intrinsics.checkNotNullParameter(holderDetailModel, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C21647hHc c21647hHcOLrzqt = OLrzqt();
        AppCompatTextView appCompatTextView = c21647hHcOLrzqt.djBIcL;
        appCompatTextView.setText(holderDetailModel.fARcdN() > 100 ? "100+" : C33129mqd.gEmmrt(java.lang.Integer.valueOf(holderDetailModel.fARcdN())));
        int iFARcdN = holderDetailModel.fARcdN();
        if (1 <= iFARcdN && iFARcdN < 4) {
            appCompatTextView.setTextAppearance(C52761wXj.LoaderManager.sSMYrx);
            appCompatTextView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QKudOq));
        } else {
            appCompatTextView.setTextAppearance(C32113mPz.Dialog.getNewProxyInstance);
            appCompatTextView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
        android.widget.ImageView imageView = c21647hHcOLrzqt.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C25386ivj.loadWalletProfileImage$default(imageView, holderDetailModel.AEQbTJ(), null, holderDetailModel.valueOf(), 0.0f, 8, null);
        java.lang.String strKWHzl = C31256lqb.KWHzl(C31256lqb.KWHzl(holderDetailModel.OLrzqt(), (Function0<java.lang.String>) new Function0() { // from class: o.kad
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28431kae.OLrzqt(holderDetailModel);
            }
        }), (Function0<java.lang.String>) new Function0() { // from class: o.kab
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28431kae.EZpvd(holderDetailModel);
            }
        });
        AppCompatTextView appCompatTextView2 = c21647hHcOLrzqt.AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        C31258lqd.copydefault(appCompatTextView2, strKWHzl, holderDetailModel.KWHzl(), C52761wXj.Activity.fdOvFl);
        c21647hHcOLrzqt.AhwBna.requestLayout();
        wYC wyc = c21647hHcOLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        wyc.setVisibility(holderDetailModel.getNewProxyInstance() ? 0 : 8);
        android.widget.LinearLayout linearLayout = c21647hHcOLrzqt.copydefault;
        linearLayout.setOnClickListener(new StateListAnimator(linearLayout, 1000L, this, holderDetailModel));
        java.lang.String strEZpvd = holderDetailModel.fetchVPNInfo().length() == 0 ? "--" : C25322iuY.OLrzqt.EZpvd(holderDetailModel.fetchVPNInfo());
        C55251xgS c55251xgS = c21647hHcOLrzqt.valueOf;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55251xgS.setText(C33069mpW.KWHzl(context, C23274hvD.Fragment.getLastCustomNonConfigurationInstance, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, strEZpvd))));
        C28067kNr.setTags$default(c21647hHcOLrzqt.OLrzqt, holderDetailModel.ejfBZ(), false, false, null, null, 30, null);
        c21647hHcOLrzqt.OLrzqt.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.kac
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C28431kae.KWHzl(function1, holderDetailModel, view);
            }
        });
        wYC wyc2 = c21647hHcOLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyc2, "");
        wyc2.setVisibility(function0 == null ? 8 : 0);
        wYC wyc3 = c21647hHcOLrzqt.KWHzl;
        wyc3.setOnClickListener(new Application(wyc3, 1000L, function0));
    }

    public static final java.lang.String OLrzqt(HolderDetailModel holderDetailModel) {
        java.lang.String strAEQbTJ = C29694kyV.AEQbTJ.AEQbTJ(holderDetailModel.ejfBZ());
        return strAEQbTJ == null ? "" : strAEQbTJ;
    }

    public static final java.lang.String EZpvd(HolderDetailModel holderDetailModel) {
        return C25352ivB.formatAddress$default(holderDetailModel.valueOf(), 6, 4, null, 4, null);
    }

    public static final boolean KWHzl(Function1 function1, HolderDetailModel holderDetailModel, android.view.View view) {
        function1.invoke(holderDetailModel.ejfBZ());
        return true;
    }

    /* JADX INFO: renamed from: o.kae$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.kae$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ HolderDetailModel AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C28431kae KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C28431kae c28431kae, HolderDetailModel holderDetailModel) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c28431kae;
            this.AEQbTJ = holderDetailModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                int i = C23274hvD.Fragment.playFromMediaId;
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                hSW.copyAddress$default(i, context, this.AEQbTJ.valueOf(), null, null, 24, null);
            }
        }
    }
}

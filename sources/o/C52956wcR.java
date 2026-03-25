package o;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wcR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52956wcR extends AbstractC59533zio<C52894wbI, Activity> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final C38307pTy copydefault = C38307pTy.Companion.AEQbTJ(5);
    public final Function0<java.lang.String> EZpvd;
    public final Function2<java.lang.Integer, C52894wbI, Unit> OLrzqt;

    /* JADX INFO: renamed from: o.wcR$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wcR.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super o.wbI, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52956wcR(@NotNull Function0<java.lang.String> function0, @NotNull Function2<? super java.lang.Integer, ? super C52894wbI, Unit> function2) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = function0;
        this.OLrzqt = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C50835vbe c50835vbeEZpvd = C50835vbe.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c50835vbeEZpvd, "");
        C55021xcA root = c50835vbeEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        android.view.View view = (android.view.View) C59467zhb.zLjUOn(ViewGroupKt.getChildren(root));
        if (view != null) {
            view.setPaddingRelative((int) C33070mpX.EZpvd(C52761wXj.StateListAnimator.QUSxYX), view.getPaddingTop(), (int) C33070mpX.EZpvd(C52761wXj.StateListAnimator.QUSxYX), view.getPaddingBottom());
        }
        int i = C52761wXj.LoaderManager.AwvSrB;
        c50835vbeEZpvd.getRoot().valueOf().setTextAppearance(i);
        c50835vbeEZpvd.getRoot().AYXKKw().setTextAppearance(i);
        c50835vbeEZpvd.getRoot().AEQbTJ().setTextAppearance(i);
        int i2 = C52761wXj.LoaderManager.QOLQEE;
        c50835vbeEZpvd.getRoot().values().setTextAppearance(i2);
        c50835vbeEZpvd.getRoot().EZpvd().setTextAppearance(i2);
        android.widget.TextView textViewKWHzl = c50835vbeEZpvd.getRoot().KWHzl();
        int id = c50835vbeEZpvd.getRoot().KWHzl().getId();
        ViewGroup.LayoutParams layoutParams = textViewKWHzl.getLayoutParams();
        android.content.Context context = c50835vbeEZpvd.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C52964wcZ c52964wcZ = new C52964wcZ(context, null, 0, 6, null);
        c52964wcZ.setId(id);
        c52964wcZ.setTextAppearance(C52761wXj.LoaderManager.QOLQEE);
        c52964wcZ.setTextAppearance(C52761wXj.LoaderManager.QOLQEE);
        c52964wcZ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        android.content.Context context2 = c50835vbeEZpvd.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C55251xgS c55251xgS = new C55251xgS(context2, null, 0, 6, null);
        c55251xgS.setOKDSStyle(8);
        c55251xgS.setOKDSSize(-6);
        c55251xgS.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        c55251xgS.setMaxLines(1);
        c55251xgS.setVisibility(8);
        android.view.ViewParent parent = textViewKWHzl.getParent();
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(textViewKWHzl);
        }
        if (viewGroup2 != null) {
            viewGroup2.addView(c52964wcZ, layoutParams);
        }
        if (viewGroup2 != null) {
            viewGroup2.addView(c55251xgS, layoutParams);
        }
        return new Activity(c50835vbeEZpvd, c52964wcZ, c55251xgS);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull C52894wbI c52894wbI) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c52894wbI, "");
        C55021xcA c55021xcA = activity.EZpvd().KWHzl;
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(c55021xcA.getContext());
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strValueOf = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.valueOf(c52894wbI.AEQbTJ()) : null;
        if (strValueOf == null) {
            strValueOf = "";
        }
        android.content.Context context = activity.EZpvd().getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(32.0f, context);
        android.content.Context context2 = activity.EZpvd().getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, strValueOf, "lfit", iCopydefault, C55298xhM.copydefault(32.0f, context2)).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(c55021xcA.getContext())).fetchVPNInfo().KWHzl(C52761wXj.TaskDescription.aHXSQp).EZpvd((android.widget.ImageView) c55021xcA.gEmmrt());
        C55021xcA.setCryptoText$default(c55021xcA, C33061mpO.KWHzl(c52894wbI.AEQbTJ(), this.EZpvd.invoke(), new Function1() { // from class: o.wcS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52956wcR.OLrzqt((java.util.List) obj);
            }
        }), null, 2, null);
        c55021xcA.setOnClickListener(new TaskDescription(c55021xcA, 1000L, this, activity, c52894wbI));
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c52894wbI.OLrzqt().getStakingApy())) {
            java.lang.String stakingApy = c52894wbI.OLrzqt().getStakingApy();
            if (stakingApy != null) {
                C55251xgS c55251xgSCopydefault = activity.copydefault();
                c55251xgSCopydefault.setText(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) stakingApy) ^ true ? C33069mpW.copydefault(C48033uCm.Fragment.DcMfJKfwDlxl, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.formatPercentWithSymbol$default(xMR.copydefault, stakingApy, 0, 0, RoundingMode.HALF_UP, 6, null)))) : "--");
                c55251xgSCopydefault.setVisibility(0);
            }
        } else {
            activity.copydefault().setVisibility(8);
        }
        android.widget.TextView textViewAYXKKw = activity.EZpvd().KWHzl.AYXKKw();
        xMR xmr = xMR.copydefault;
        java.lang.String apy = c52894wbI.copydefault().getApy();
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        textViewAYXKKw.setText(xMR.formatPercentWithSymbol$default(xmr, apy, 0, 0, roundingMode, 6, null));
        textViewAYXKKw.setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
        textViewAYXKKw.setTextColor(C56033xvF.OLrzqt((java.lang.Object) c52894wbI.copydefault().getApy()));
        android.widget.TextView textViewValues = activity.EZpvd().KWHzl.values();
        int i = C52761wXj.Activity.QwvEab;
        android.content.Context context3 = textViewValues.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        textViewValues.setTextColor(C33070mpX.OLrzqt(i, context3));
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(c52894wbI.copydefault().getFundingRate());
        C38307pTy c38307pTy = copydefault;
        textViewValues.setText(pTB.formatICUPercent$default(bigDecimalEZpvd, null, c38307pTy, null, java.lang.Double.valueOf(100.0d), null, 21, null));
        C55071xcy c55071xcyAEQbTJ = activity.EZpvd().KWHzl.AEQbTJ();
        c55071xcyAEQbTJ.setTextAlignment(6);
        c55071xcyAEQbTJ.setText(xMR.formatPercentWithSymbol$default(xmr, c52894wbI.OLrzqt().getApyAndStakingApy(), 0, 0, roundingMode, 6, null));
        c55071xcyAEQbTJ.setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
        c55071xcyAEQbTJ.setTextColor(C56033xvF.OLrzqt((java.lang.Object) c52894wbI.OLrzqt().getApyAndStakingApy()));
        android.widget.TextView textViewEZpvd = activity.EZpvd().KWHzl.EZpvd();
        textViewEZpvd.setTextAlignment(6);
        int i2 = C52761wXj.Activity.QwvEab;
        android.content.Context context4 = textViewEZpvd.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        textViewEZpvd.setTextColor(C33070mpX.OLrzqt(i2, context4));
        textViewEZpvd.setText(pTB.formatICUPercent$default(C33129mqd.EZpvd(c52894wbI.OLrzqt().getFundingRate()), null, c38307pTy, null, java.lang.Double.valueOf(100.0d), null, 21, null));
        activity.KWHzl().copydefault(c52894wbI.KWHzl());
        activity.KWHzl().setVisibility((activity.copydefault().getVisibility() == 0) ^ true ? 0 : 8);
    }

    public static final Unit OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.BackgroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.iRxXKY)));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.ixgjPv)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wcR$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ Activity EZpvd;
        public final /* synthetic */ C52956wcR KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C52894wbI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C52956wcR c52956wcR, Activity activity, C52894wbI c52894wbI) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c52956wcR;
            this.EZpvd = activity;
            this.copydefault = c52894wbI;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.OLrzqt.invoke(java.lang.Integer.valueOf(this.EZpvd.getAbsoluteAdapterPosition() + 1), this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.wcR$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final C50835vbe EZpvd;
        public final C55251xgS KWHzl;
        public final C52964wcZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C50835vbe EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C52964wcZ KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55251xgS copydefault() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C50835vbe c50835vbe, @NotNull C52964wcZ c52964wcZ, @NotNull C55251xgS c55251xgS) {
            super(c50835vbe.getRoot());
            Intrinsics.checkNotNullParameter(c50835vbe, "");
            Intrinsics.checkNotNullParameter(c52964wcZ, "");
            Intrinsics.checkNotNullParameter(c55251xgS, "");
            this.EZpvd = c50835vbe;
            this.copydefault = c52964wcZ;
            this.KWHzl = c55251xgS;
        }
    }
}

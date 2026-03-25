package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.unify_trade.bot.data.BotToMPRecommend;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wNo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52496wNo extends AbstractC59533zio<BotToMPRecommend, TaskDescription> {
    public final Function1<java.lang.String, Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C52496wNo(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX INFO: renamed from: o.wNo$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public android.widget.TextView AEQbTJ;
        public android.widget.ImageView KWHzl;
        public android.widget.TextView OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C48033uCm.Application.onNothingSelected);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.OLrzqt = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C48033uCm.Application.tryUnwrapContext);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C48033uCm.Application.getActiveNotifications);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.KWHzl = (android.widget.ImageView) viewFindViewById3;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.getLocation, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new TaskDescription(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull BotToMPRecommend botToMPRecommend) {
        java.lang.String strReplaceWrapRtl$default;
        java.lang.String strValueOf;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(botToMPRecommend, "");
        java.lang.String instId = botToMPRecommend.getInstId();
        if (instId != null) {
            java.lang.String upperCase = o.TaskDescription.AEQbTJ(instId).copydefault().toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(taskDescription.itemView.getContext());
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (strValueOf = interfaceC54581xNrOLrzqt.valueOf(upperCase)) == null) {
                strValueOf = "";
            }
            C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, strValueOf, "lfit", 32, 32).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(taskDescription.itemView.getContext())).djBIcL().EZpvd(taskDescription.AEQbTJ());
        }
        java.lang.String instId2 = botToMPRecommend.getInstId();
        java.lang.String percentWithSymbol$default = "--";
        if (instId2 == null || (strReplaceWrapRtl$default = C54798xVs.replaceWrapRtl$default(instId2, "-", "/", false, 4, null)) == null) {
            strReplaceWrapRtl$default = "--";
        }
        java.lang.String sectorName = botToMPRecommend.getSectorName();
        if (sectorName == null) {
            sectorName = "专区";
        }
        taskDescription.OLrzqt().setText(strReplaceWrapRtl$default + " " + sectorName);
        java.lang.String backtestedArp = botToMPRecommend.getBacktestedArp();
        if (backtestedArp != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) backtestedArp)) {
            xMR xmr = xMR.copydefault;
            java.lang.String backtestedArp2 = botToMPRecommend.getBacktestedArp();
            percentWithSymbol$default = xMR.formatPercentWithSymbol$default(xmr, backtestedArp2 == null ? "" : backtestedArp2, 0, 0, RoundingMode.DOWN, 6, null);
        }
        C56068xvo c56068xvo = C56068xvo.copydefault;
        java.lang.String backtestedArp3 = botToMPRecommend.getBacktestedArp();
        if (backtestedArp3 == null) {
            backtestedArp3 = "0";
        }
        java.lang.String strCopydefault = c56068xvo.copydefault(backtestedArp3);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKttrackPipAnimationHintViewflow1attachStateChangeListener1));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        if (C33129mqd.AEQbTJ(strCopydefault, 0)) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = taskDescription.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            android.text.style.ForegroundColorSpan foregroundColorSpan2 = new android.text.style.ForegroundColorSpan(C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null));
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) percentWithSymbol$default);
            spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
        } else if (C33129mqd.gEmmrt(strCopydefault, 0)) {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = taskDescription.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            android.text.style.ForegroundColorSpan foregroundColorSpan3 = new android.text.style.ForegroundColorSpan(C33512mxp.tradeFallGraph$default(c33512mxp2, context2, 0.0f, 2, null));
            int length3 = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) percentWithSymbol$default);
            spannableStringBuilder.setSpan(foregroundColorSpan3, length3, spannableStringBuilder.length(), 17);
        } else {
            android.text.style.ForegroundColorSpan foregroundColorSpan4 = new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            int length4 = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) percentWithSymbol$default);
            spannableStringBuilder.setSpan(foregroundColorSpan4, length4, spannableStringBuilder.length(), 17);
        }
        taskDescription.copydefault().setText(new android.text.SpannedString(spannableStringBuilder));
        android.view.View view = taskDescription.itemView;
        view.setOnClickListener(new Application(view, 1000L, this, botToMPRecommend));
    }

    /* JADX INFO: renamed from: o.wNo$ActionBar */
    public static final class ActionBar implements Function1<AbstractC43238rlX, Unit> {
        public static final ActionBar OLrzqt = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AbstractC43238rlX abstractC43238rlX) {
            KWHzl(abstractC43238rlX);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.wNo$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ BotToMPRecommend OLrzqt;
        public final /* synthetic */ C52496wNo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52496wNo c52496wNo, BotToMPRecommend botToMPRecommend) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c52496wNo;
            this.OLrzqt = botToMPRecommend;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.view.View view2 = this.KWHzl;
                Intrinsics.copydefault(view2);
                android.app.Activity activityKWHzl = C35334ntP.KWHzl(view2);
                if (activityKWHzl != null) {
                    Function1<java.lang.String, Unit> function1Copydefault = this.copydefault.copydefault();
                    java.lang.String underlyingId = this.OLrzqt.getUnderlyingId();
                    if (underlyingId == null) {
                        underlyingId = "";
                    }
                    function1Copydefault.invoke(underlyingId);
                    InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
                    C56071xvr c56071xvr = C56071xvr.gEmmrt;
                    java.lang.String underlyingId2 = this.OLrzqt.getUnderlyingId();
                    InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, activityKWHzl, C56071xvr.getBotToNMPDetailPath$default(c56071xvr, underlyingId2 != null ? underlyingId2 : "", null, 2, null), null, ActionBar.OLrzqt, 4, null);
                }
            }
        }
    }
}

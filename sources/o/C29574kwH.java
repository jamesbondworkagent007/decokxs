package o;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.features.smart_money.signal.ui.model.SignalGemsCardsUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiplierTagType;
import com.okinc.localization.util.format.OKTimeEnum;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kwH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29574kwH {
    public static /* synthetic */ void setData$default(C21596hFf c21596hFf, SignalGemsCardsUiModel signalGemsCardsUiModel, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        OLrzqt(c21596hFf, signalGemsCardsUiModel, function1);
    }

    public static final void OLrzqt(@NotNull C21596hFf c21596hFf, @NotNull SignalGemsCardsUiModel signalGemsCardsUiModel, Function1<? super SignalGemsCardsUiModel, Unit> function1) {
        java.lang.String string;
        kotlin.Pair pair;
        Intrinsics.checkNotNullParameter(c21596hFf, "");
        Intrinsics.checkNotNullParameter(signalGemsCardsUiModel, "");
        android.content.Context context = c21596hFf.getRoot().getContext();
        ConstraintLayout constraintLayout = c21596hFf.gEmmrt;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Intrinsics.copydefault(context);
        gradientDrawable.setCornerRadius(C55298xhM.EZpvd(16.0f, context));
        gradientDrawable.setColors(new int[]{C25382ivf.copydefault(C52761wXj.Activity.invokespecialaKhcqp, context), C25382ivf.copydefault(C52761wXj.Activity.invokespecialaKhcqp, context)});
        constraintLayout.setBackground(gradientDrawable);
        int iCopydefault = C25382ivf.copydefault(C23274hvD.StateListAnimator.QOLQEE, context);
        android.widget.LinearLayout linearLayout = c21596hFf.OLrzqt;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(C55298xhM.EZpvd(4.0f, context));
        gradientDrawable2.setColors(new int[]{iCopydefault, iCopydefault});
        linearLayout.setBackground(gradientDrawable2);
        boolean z = signalGemsCardsUiModel.valueOf().AEQbTJ() == SignalMultiplierTagType.GOLD;
        android.widget.ImageView imageView = c21596hFf.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(z ? 0 : 8);
        if (z) {
            android.widget.ImageView imageView2 = c21596hFf.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C25386ivj.loadSquareImage$default(imageView2, signalGemsCardsUiModel.AYXKKw(), C55298xhM.copydefault(16.0f, context), null, 4, null);
        }
        c21596hFf.AhwBna.setContent(ComposableLambdaKt.composableLambdaInstance(1437284533, true, new TaskDescription(signalGemsCardsUiModel)));
        int iAEQbTJ = AEQbTJ(signalGemsCardsUiModel.copydefault());
        android.widget.TextView textView = c21596hFf.DbNXlk;
        if (iAEQbTJ == 0) {
            string = pTA.formatTime$default(new Date(signalGemsCardsUiModel.copydefault()), OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 14, null);
        } else {
            string = context.getString(C23274hvD.Fragment.setMediaButtonReceiver);
            Intrinsics.copydefault((java.lang.Object) string);
        }
        textView.setText(string);
        c21596hFf.AYXKKw.setData(signalGemsCardsUiModel.AYXKKw(), signalGemsCardsUiModel.OLrzqt(), signalGemsCardsUiModel.valueOf().AEQbTJ());
        c21596hFf.fARcdN.setText(signalGemsCardsUiModel.values());
        c21596hFf.fIwbmz.setText(signalGemsCardsUiModel.fetchVPNInfo());
        c21596hFf.isConnected.setText(C25322iuY.OLrzqt.EZpvd(java.lang.String.valueOf(signalGemsCardsUiModel.AhwBna())));
        android.widget.TextView textView2 = c21596hFf.fetchVPNInfo;
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        java.lang.String strAEQbTJ = signalGemsCardsUiModel.AEQbTJ();
        RoundingMode roundingMode = RoundingMode.DOWN;
        textView2.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, strAEQbTJ, true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
        c21596hFf.AkhnZx.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, signalGemsCardsUiModel.KWHzl(), true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null));
        if (signalGemsCardsUiModel.gEmmrt()) {
            pair = new kotlin.Pair(java.lang.Integer.valueOf(C52761wXj.ActionBar.DCUTEI), java.lang.Integer.valueOf(C52761wXj.TaskDescription.fObYrO));
        } else {
            pair = new kotlin.Pair(java.lang.Integer.valueOf(C52761wXj.ActionBar.OuxcSI), java.lang.Integer.valueOf(C52761wXj.TaskDescription.ddhgMB));
        }
        int iIntValue = ((java.lang.Number) pair.component1()).intValue();
        int iIntValue2 = ((java.lang.Number) pair.component2()).intValue();
        c21596hFf.AkhnZx.setTextColor(C25382ivf.copydefault(iIntValue, context));
        c21596hFf.AEQbTJ.setImageResource(iIntValue2);
        c21596hFf.AEQbTJ.setColorFilter(C25382ivf.copydefault(iIntValue, context));
        ConstraintLayout constraintLayout2 = c21596hFf.gEmmrt;
        constraintLayout2.setOnClickListener(new Application(constraintLayout2, 1000L, function1, signalGemsCardsUiModel));
    }

    /* JADX INFO: renamed from: o.kwH$TaskDescription */
    public static final class TaskDescription implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ SignalGemsCardsUiModel KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(SignalGemsCardsUiModel signalGemsCardsUiModel) {
            this.KWHzl = signalGemsCardsUiModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            EZpvd(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1437284533, i, -1, "com.okinc.business.market.features.smart_money.signal.ui.gems.widget.setData.<anonymous> (SignalGemsItem.kt:72)");
                }
                SignalGemsCardsUiModel signalGemsCardsUiModel = this.KWHzl;
                composer.startReplaceableGroup(733328855);
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf = LayoutKt.materializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                composer.disableReusing();
                Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, density, companion2.getSetDensity());
                Updater.m2790setimpl(composerM2783constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                Updater.m2790setimpl(composerM2783constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
                composer.enableReusing();
                yhoMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                C29332kre.KWHzl((BoxScope) BoxScopeInstance.INSTANCE, signalGemsCardsUiModel.valueOf(), false, composer, 6, 2);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public static final Calendar EZpvd(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        return calendar;
    }

    public static final int AEQbTJ(long j) {
        return (int) ((EZpvd(java.lang.System.currentTimeMillis()).getTimeInMillis() - EZpvd(j).getTimeInMillis()) / ((long) 86400000));
    }

    /* JADX INFO: renamed from: o.kwH$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ SignalGemsCardsUiModel EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ Function1 OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function1 function1, SignalGemsCardsUiModel signalGemsCardsUiModel) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = function1;
            this.EZpvd = signalGemsCardsUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function1 function1 = this.OLrzqt;
                if (function1 != null) {
                    function1.invoke(this.EZpvd);
                }
            }
        }
    }
}

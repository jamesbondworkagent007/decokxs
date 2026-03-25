package o;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class uIJ extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uIJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(str, "");
            uIJ uij = new uIJ();
            uij.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("prompt", str)));
            C49662usl.EZpvd(uij, fragmentManager, "LLMPromptBottomSheet");
        }
    }

    public final java.lang.String copydefault() {
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("prompt") : null;
        return string == null ? "" : string;
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        C55118xds root;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C54946xaf binding = getBinding();
        java.lang.Integer numValueOf = null;
        if (binding != null && (root = binding.getRoot()) != null) {
            numValueOf = java.lang.Integer.valueOf(C55298xhM.px2dp$default(root.OLrzqt(), (android.content.Context) null, 1, (java.lang.Object) null));
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(482865113, true, new ActionBar(numValueOf, this)));
        constraintLayout.addView(composeView);
    }

    public static final class ActionBar implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ uIJ AEQbTJ;
        public final /* synthetic */ java.lang.Integer KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(java.lang.Integer num, uIJ uij) {
            this.KWHzl = num;
            this.AEQbTJ = uij;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            EZpvd(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(Composer composer, int i) {
            float fM5414constructorimpl;
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(482865113, i, -1, "com.okinc.tradingbot.impl.botDetail.ui.llmSignal.LLMPromptBottomSheet.onCreateContent.<anonymous>.<anonymous> (LLMPromptBottomSheet.kt:68)");
                }
                float fM5414constructorimpl2 = androidx.compose.ui.unit.Dp.m5414constructorimpl(((android.content.res.Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp);
                if (this.KWHzl != null) {
                    fM5414constructorimpl = androidx.compose.ui.unit.Dp.m5414constructorimpl(r3.intValue());
                } else {
                    fM5414constructorimpl = androidx.compose.ui.unit.Dp.m5414constructorimpl(fM5414constructorimpl2 - androidx.compose.ui.unit.Dp.m5414constructorimpl(60));
                }
                C48088uEn.copydefault(this.AEQbTJ.copydefault(), WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m675paddingqDBjuR0$default(PaddingKt.m673paddingVpY3zN4$default(ScrollKt.verticalScroll$default(NestedScrollModifierKt.nestedScroll$default(SizeKt.m706heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, fM5414constructorimpl, 1, null), NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer, 0, 1), null, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), PrimitiveResources_androidKt.dimensionResource(C52761wXj.StateListAnimator.QUSxYX, composer, 0), 0.0f, 2, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(8), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(24), 5, null)), composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }
}

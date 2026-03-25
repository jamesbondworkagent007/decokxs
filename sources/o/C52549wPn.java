package o;

import android.view.ViewGroup;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wPn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52549wPn extends AbstractC59533zio<C55793xqe, TaskDescription> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow.INSTANCE);
        return new TaskDescription(composeView);
    }

    /* JADX INFO: renamed from: o.wPn$Activity */
    public static final class Activity implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ C55793xqe copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(C55793xqe c55793xqe) {
            this.copydefault = c55793xqe;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            AEQbTJ(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-72556698, i, -1, "com.okinc.tradingbot.impl.strategy.itembinder.recurring.RecurringPriceRangeHintItemBinder.onBindViewHolder.<anonymous> (RecurringPriceRangeHintItemBinder.kt:42)");
                }
                java.lang.String strKWHzl = this.copydefault.KWHzl();
                TextStyle textStyleOLrzqt = C52698wVa.OLrzqt(C52761wXj.LoaderManager.AYXKKw, null, composer, 0, 2);
                FontWeight w400 = FontWeight.Companion.getW400();
                TextUnitType.Companion companion = TextUnitType.Companion;
                TextKt.m2072Text4IGK_g(strKWHzl, PaddingKt.m675paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(24), 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(C52761wXj.Activity.QwvEab, composer, 0), TextUnitKt.m5607TextUnitanM5pPY(12.0f, companion.m5628getSpUIouoOA()), (FontStyle) null, w400, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.m5607TextUnitanM5pPY(18.0f, companion.m5628getSpUIouoOA()), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleOLrzqt, composer, 196656, 0, 64464);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull C55793xqe c55793xqe) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(c55793xqe, "");
        taskDescription.AEQbTJ().setContent(ComposableLambdaKt.composableLambdaInstance(-72556698, true, new Activity(c55793xqe)));
    }

    /* JADX INFO: renamed from: o.wPn$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public static final int EZpvd = ComposeView.$stable;
        public final ComposeView KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ComposeView AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull ComposeView composeView) {
            super(composeView);
            Intrinsics.checkNotNullParameter(composeView, "");
            this.KWHzl = composeView;
        }
    }
}

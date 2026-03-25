package o;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vfd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51046vfd extends wXX {
    public final boolean EZpvd = true;
    public Function0<Unit> KWHzl = new Function0() { // from class: o.vfg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51046vfd.valueOf();
        }
    };
    public Function0<Unit> OLrzqt = new Function0() { // from class: o.vfh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51046vfd.AhwBna();
        }
    };
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public static final MutableSharedFlow<BalanceDetailInfoDto> AEQbTJ = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.vfd$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vfd.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final MutableSharedFlow<BalanceDetailInfoDto> KWHzl() {
            return C51046vfd.AEQbTJ;
        }

        public final C51046vfd EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull BalanceDetailInfoDto balanceDetailInfoDto, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(balanceDetailInfoDto, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            C51046vfd c51046vfd = new C51046vfd();
            c51046vfd.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(BalanceDetailInfoDto.Key, balanceDetailInfoDto), C56390yDp.OLrzqt("bot_inst_id", str2), C56390yDp.OLrzqt("bot_inst_type", str)));
            c51046vfd.KWHzl = function0;
            c51046vfd.OLrzqt = function02;
            return c51046vfd;
        }
    }

    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna() {
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AEQbTJ().setVisibility(0);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C48033uCm.Fragment.DGUQLIhJrIAr));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.trackPipAnimationHintView));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.vfa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51046vfd.KWHzl(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final void KWHzl(C51046vfd c51046vfd, android.view.View view) {
        c51046vfd.dismissAllowingStateLoss();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        this.OLrzqt.invoke();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        BalanceDetailInfoDto balanceDetailInfoDto = (BalanceDetailInfoDto) BundleCompat.getParcelable(requireArguments(), BalanceDetailInfoDto.Key, BalanceDetailInfoDto.class);
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("bot_inst_id") : null;
        if (string == null) {
            string = "";
        }
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("bot_inst_type") : null;
        if (string2 == null) {
            string2 = "";
        }
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(926167031, true, new Application(balanceDetailInfoDto, string, string2)));
        constraintLayout.addView(composeView);
    }

    /* JADX INFO: renamed from: o.vfd$Application */
    public static final class Application implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ BalanceDetailInfoDto AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(BalanceDetailInfoDto balanceDetailInfoDto, java.lang.String str, java.lang.String str2) {
            this.AEQbTJ = balanceDetailInfoDto;
            this.EZpvd = str;
            this.KWHzl = str2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            OLrzqt(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(926167031, i, -1, "com.okinc.tradingbot.impl.futures_grid.GridProfitBottomSheet.onCreateContent.<anonymous>.<anonymous> (GridProfitBottomSheet.kt:108)");
                }
                MutableSharedFlow<BalanceDetailInfoDto> mutableSharedFlowKWHzl = C51046vfd.Companion.KWHzl();
                BalanceDetailInfoDto balanceDetailInfoDto = this.AEQbTJ;
                int i2 = BalanceDetailInfoDto.$stable;
                C51051vfi.OLrzqt((BalanceDetailInfoDto) SnapshotStateKt.collectAsState(mutableSharedFlowKWHzl, balanceDetailInfoDto, null, composer, i2 << 3, 2).getValue(), this.EZpvd, this.KWHzl, composer, i2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.KWHzl = new Function0() { // from class: o.vff
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51046vfd.EZpvd();
            }
        };
        super.onDestroyView();
    }
}

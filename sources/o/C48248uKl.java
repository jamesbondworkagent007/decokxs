package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.list.CardStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48248uKl;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.uKl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48248uKl extends RecyclerView.ViewHolder {
    public final Function1<java.lang.String, TacticsData> EZpvd;
    public final boolean KWHzl;
    public final uJM OLrzqt;
    public final MutableState copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, com.okinc.unify_trade.bot.data.TacticsData> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C48248uKl(@NotNull ComposeView composeView, @NotNull uJM ujm, boolean z, @NotNull Function1<? super java.lang.String, TacticsData> function1) {
        super(composeView);
        Intrinsics.checkNotNullParameter(composeView, "");
        Intrinsics.checkNotNullParameter(ujm, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = ujm;
        this.KWHzl = z;
        this.EZpvd = function1;
        this.copydefault = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1722852777, true, new AnonymousClass3()));
    }

    /* JADX INFO: renamed from: o.uKl$3, reason: invalid class name */
    public static final class AnonymousClass3 implements Function2<Composer, java.lang.Integer, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3() {
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
                    ComposerKt.traceEventStart(-1722852777, i, -1, "com.okinc.tradingbot.impl.botList.ui.backtest.BacktestViewHolder.<anonymous> (BacktestListAdapter.kt:110)");
                }
                final uJO ujoKWHzl = C48248uKl.this.KWHzl();
                if (ujoKWHzl != null) {
                    final C48248uKl c48248uKl = C48248uKl.this;
                    CardStyle cardStyle = CardStyle.DETAILED;
                    boolean z = c48248uKl.KWHzl;
                    composer.startReplaceableGroup(-1513972100);
                    boolean zChangedInstance = composer.changedInstance(c48248uKl);
                    boolean zChanged = composer.changed(ujoKWHzl);
                    java.lang.Object objRememberedValue = composer.rememberedValue();
                    if ((zChangedInstance | zChanged) || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: o.uKn
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C48248uKl.AnonymousClass3.OLrzqt(c48248uKl, ujoKWHzl);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-1513967702);
                    boolean zChangedInstance2 = composer.changedInstance(c48248uKl);
                    boolean zChanged2 = composer.changed(ujoKWHzl);
                    java.lang.Object objRememberedValue2 = composer.rememberedValue();
                    if ((zChangedInstance2 | zChanged2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: o.uKp
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C48248uKl.AnonymousClass3.KWHzl(c48248uKl, ujoKWHzl);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function02 = (Function0) objRememberedValue2;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-1513965426);
                    boolean zChangedInstance3 = composer.changedInstance(c48248uKl);
                    boolean zChanged3 = composer.changed(ujoKWHzl);
                    java.lang.Object objRememberedValue3 = composer.rememberedValue();
                    if ((zChangedInstance3 | zChanged3) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: o.uKo
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C48248uKl.AnonymousClass3.djBIcL(c48248uKl, ujoKWHzl);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function03 = (Function0) objRememberedValue3;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-1513963008);
                    boolean zChangedInstance4 = composer.changedInstance(c48248uKl);
                    boolean zChanged4 = composer.changed(ujoKWHzl);
                    java.lang.Object objRememberedValue4 = composer.rememberedValue();
                    if ((zChangedInstance4 | zChanged4) || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = new yHO() { // from class: o.uKq
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.yHO
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                return C48248uKl.AnonymousClass3.AEQbTJ(c48248uKl, ujoKWHzl, (java.lang.String) obj, (TacticsData) obj2, (Function0) obj3);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    yHO yho = (yHO) objRememberedValue4;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(-1513958035);
                    boolean zChangedInstance5 = composer.changedInstance(c48248uKl);
                    boolean zChanged5 = composer.changed(ujoKWHzl);
                    java.lang.Object objRememberedValue5 = composer.rememberedValue();
                    if ((zChangedInstance5 | zChanged5) || objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new Function2() { // from class: o.uKu
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return C48248uKl.AnonymousClass3.OLrzqt(c48248uKl, ujoKWHzl, (java.lang.String) obj, (TacticsData) obj2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue5);
                    }
                    composer.endReplaceableGroup();
                    C48261uKy.EZpvd(ujoKWHzl, function0, z, null, false, cardStyle, function02, null, function03, yho, (Function2) objRememberedValue5, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final TacticsData OLrzqt(C48248uKl c48248uKl, uJO ujo) {
            TacticsData tacticsData = (TacticsData) c48248uKl.EZpvd.invoke(ujo.AkhnZx());
            return tacticsData == null ? new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null) : tacticsData;
        }

        public static final Unit KWHzl(C48248uKl c48248uKl, uJO ujo) {
            c48248uKl.OLrzqt.OLrzqt(ujo);
            return Unit.INSTANCE;
        }

        public static final Unit djBIcL(C48248uKl c48248uKl, uJO ujo) {
            c48248uKl.OLrzqt.copydefault(ujo);
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(C48248uKl c48248uKl, uJO ujo, java.lang.String str, TacticsData tacticsData, Function0 function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            c48248uKl.OLrzqt.AEQbTJ(str, ujo.AkhnZx(), function0);
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(C48248uKl c48248uKl, uJO ujo, java.lang.String str, TacticsData tacticsData) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            c48248uKl.OLrzqt.AEQbTJ(str, ujo.AkhnZx());
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl(@NotNull uJO ujo) {
        Intrinsics.checkNotNullParameter(ujo, "");
        AEQbTJ(ujo);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final uJO KWHzl() {
        return (uJO) this.copydefault.getValue();
    }

    public final void AEQbTJ(uJO ujo) {
        this.copydefault.setValue(ujo);
    }
}

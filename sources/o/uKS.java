package o;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes11.dex */
public final class uKS {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(uJO ujo, C48266uLc c48266uLc, uJN ujn, int i, Composer composer, int i2) {
        EZpvd(ujo, c48266uLc, ujn, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void EZpvd(@NotNull final uJO ujo, @NotNull final C48266uLc c48266uLc, @NotNull final uJN ujn, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(ujo, "");
        Intrinsics.checkNotNullParameter(c48266uLc, "");
        Intrinsics.checkNotNullParameter(ujn, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1563442481);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(ujo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(c48266uLc) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changed(ujn) ? 256 : 128;
        }
        if ((i2 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1563442481, i2, -1, "com.okinc.tradingbot.impl.botList.ui.cell.LLMBotMetricsSection (LLMBotMetricsCompose.kt:36)");
            }
            boolean zOLrzqt = ujn.OLrzqt();
            boolean zEZpvd = ujn.EZpvd();
            composerStartRestartGroup.startReplaceableGroup(-337162257);
            boolean z = (i2 & 14) == 4;
            boolean zChanged = composerStartRestartGroup.changed(zOLrzqt);
            boolean zChanged2 = composerStartRestartGroup.changed(zEZpvd);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | zChanged | zChanged2) || objRememberedValue == Composer.Companion.getEmpty()) {
                C48287uLx c48287uLx = new C48287uLx();
                java.lang.String strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.zdxASf, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ujo.fARcdN())));
                java.lang.String strCopydefault2 = C33069mpW.copydefault(C48033uCm.Fragment.ardYFU, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ujo.fARcdN())));
                java.lang.String strFmtPnlPercent$default = C56068xvo.fmtPnlPercent$default(C56068xvo.copydefault, ujo.iwGUEr(), false, 2, null);
                c48287uLx.KWHzl(c48287uLx.AEQbTJ(strCopydefault, uLP.AEQbTJ(ujo.AuCTel())), c48287uLx.AEQbTJ(strCopydefault2, uLP.AEQbTJ(ujo.AwvSrB().KWHzl()) + " (" + strFmtPnlPercent$default + ")").AEQbTJ(c48266uLc.djBIcL()));
                if (zEZpvd) {
                    if (zOLrzqt) {
                        EZpvd(c48287uLx, ujo, c48266uLc, ujn.KWHzl());
                    } else {
                        copydefault(c48287uLx, ujo, c48266uLc);
                    }
                }
                objRememberedValue = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c48287uLx.copydefault());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            C48288uLy.KWHzl((Modifier) null, 0.0f, 0.0f, (java.util.List<? extends java.util.List<? extends InterfaceC48286uLw>>) objRememberedValue, composerStartRestartGroup, 0, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.uKP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return uKS.OLrzqt(ujo, c48266uLc, ujn, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [89=5] */
    public static final void EZpvd(C48287uLx c48287uLx, uJO ujo, C48266uLc c48266uLc, boolean z) {
        c48287uLx.KWHzl(c48287uLx.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.PUZqN), uLP.AEQbTJ(ujo.hDKMBd().KWHzl())).AEQbTJ(c48266uLc.AEQbTJ()).copydefault(uLP.AEQbTJ(ujo.zsXlph().KWHzl())).OLrzqt(c48266uLc.OLrzqt()), c48287uLx.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.vqBjd), uLP.AEQbTJ(ujo.gHZMYf().KWHzl())).AEQbTJ(c48266uLc.EZpvd()), c48287uLx.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.OtZEmZ), uLP.AEQbTJ(ujo.AxsJAY())));
        c48287uLx.KWHzl(c48287uLx.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.fhUrPt), uLP.AEQbTJ(ujo.getNewProxyInstance())), c48287uLx.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.onReceive), uLP.AEQbTJ(ujo.fIwbmz())), c48287uLx.OLrzqt(ComposableLambdaKt.composableLambdaInstance(521275494, true, new StateListAnimator(ujo))));
        if (z) {
            return;
        }
        c48287uLx.KWHzl(c48287uLx.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.addPreRequisiteCollector), uLP.AEQbTJ(ujo.djBIcL())), c48287uLx.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.fWSAZA), uLP.AEQbTJ(ujo.sSMYrx())), c48287uLx.KWHzl());
    }

    public static final class StateListAnimator implements yHT<RowScope, Modifier, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ uJO KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(uJO ujo) {
            this.KWHzl = ujo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHT
        public /* synthetic */ Unit invoke(RowScope rowScope, Modifier modifier, Composer composer, java.lang.Integer num) {
            EZpvd(rowScope, modifier, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(RowScope rowScope, Modifier modifier, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            Intrinsics.checkNotNullParameter(modifier, "");
            if ((i & 48) == 0) {
                i |= composer.changed(modifier) ? 32 : 16;
            }
            if ((i & CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA) == 144 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(521275494, i, -1, "com.okinc.tradingbot.impl.botList.ui.cell.buildHistoricalMetrics.<anonymous> (LLMBotMetricsCompose.kt:102)");
            }
            uKZ.copydefault(this.KWHzl.OLrzqt(), modifier, true, composer, (i & WalletImportError.ERROR_CODE_AA_EXIST) | MLKEMEngine.KyberPolyBytes, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [131=5, 136=5] */
    public static final void copydefault(C48287uLx c48287uLx, uJO ujo, C48266uLc c48266uLc) {
        c48287uLx.KWHzl(c48287uLx.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.PUZqN), uLP.AEQbTJ(ujo.hDKMBd().KWHzl())).AEQbTJ(c48266uLc.AEQbTJ()).copydefault(uLP.AEQbTJ(ujo.zsXlph().KWHzl())).OLrzqt(c48266uLc.OLrzqt()), c48287uLx.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.aChkwz), uLP.AEQbTJ(ujo.values().KWHzl())).AEQbTJ(c48266uLc.copydefault()).copydefault(uLP.AEQbTJ(ujo.fetchVPNInfo().KWHzl())).OLrzqt(c48266uLc.KWHzl()), c48287uLx.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.vqBjd), uLP.AEQbTJ(ujo.gHZMYf().KWHzl())).AEQbTJ(c48266uLc.EZpvd()));
        c48287uLx.KWHzl(c48287uLx.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.OtZEmZ), uLP.AEQbTJ(ujo.AxsJAY())), c48287uLx.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.fhUrPt), uLP.AEQbTJ(ujo.getNewProxyInstance())), c48287uLx.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.onReceive), uLP.AEQbTJ(ujo.fIwbmz())));
        c48287uLx.KWHzl(c48287uLx.OLrzqt(ComposableLambdaKt.composableLambdaInstance(1017087010, true, new ActionBar(ujo))), c48287uLx.KWHzl(), c48287uLx.KWHzl());
    }

    public static final class ActionBar implements yHT<RowScope, Modifier, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ uJO EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(uJO ujo) {
            this.EZpvd = ujo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHT
        public /* synthetic */ Unit invoke(RowScope rowScope, Modifier modifier, Composer composer, java.lang.Integer num) {
            OLrzqt(rowScope, modifier, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(RowScope rowScope, Modifier modifier, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            Intrinsics.checkNotNullParameter(modifier, "");
            if ((i & 48) == 0) {
                i |= composer.changed(modifier) ? 32 : 16;
            }
            if ((i & CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA) == 144 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1017087010, i, -1, "com.okinc.tradingbot.impl.botList.ui.cell.buildOngoingMetrics.<anonymous> (LLMBotMetricsCompose.kt:153)");
            }
            uKZ.copydefault(this.EZpvd.OLrzqt(), modifier, false, composer, (i & WalletImportError.ERROR_CODE_AA_EXIST) | MLKEMEngine.KyberPolyBytes, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}

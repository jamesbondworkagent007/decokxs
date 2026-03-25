package o;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.CardKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.outlined.DeleteKt;
import androidx.compose.material.icons.outlined.StarKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.cruilib.compose.library.revealswipe.RevealDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C31819mFb;

/* JADX INFO: renamed from: o.mFb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31819mFb {
    public static final C31819mFb OLrzqt = new C31819mFb();
    public static yHO<RowScope, Composer, java.lang.Integer, Unit> copydefault = ComposableLambdaKt.composableLambdaInstance(-692433373, false, Activity.copydefault);
    public static yHO<RowScope, Composer, java.lang.Integer, Unit> fetchVPNInfo = ComposableLambdaKt.composableLambdaInstance(-603715524, false, TaskStackBuilder.AEQbTJ);
    public static yHO<RowScope, Composer, java.lang.Integer, Unit> fIwbmz = ComposableLambdaKt.composableLambdaInstance(-281051733, false, ComponentCallbacks.OLrzqt);
    public static yHO<RowScope, Composer, java.lang.Integer, Unit> ejfBZ = ComposableLambdaKt.composableLambdaInstance(-178574740, false, ClipData.AEQbTJ);
    public static Function2<Composer, java.lang.Integer, Unit> iwGUEr = ComposableLambdaKt.composableLambdaInstance(-1121987576, false, ComponentCallbacks2.AEQbTJ);
    public static yHT<Shape, java.lang.Float, Composer, java.lang.Integer, Unit> uzCIH = ComposableLambdaKt.composableLambdaInstance(-403308635, false, ContentResolver.KWHzl);
    public static yHO<LazyItemScope, Composer, java.lang.Integer, Unit> getNewProxyInstance = ComposableLambdaKt.composableLambdaInstance(-2140507305, false, Context.copydefault);
    public static yHO<RowScope, Composer, java.lang.Integer, Unit> hDKMBd = ComposableLambdaKt.composableLambdaInstance(-671131180, false, DialogInterface.AEQbTJ);
    public static yHO<RowScope, Composer, java.lang.Integer, Unit> getFieldNames = ComposableLambdaKt.composableLambdaInstance(-974988715, false, ContextWrapper.AEQbTJ);
    public static Function2<Composer, java.lang.Integer, Unit> AEQbTJ = ComposableLambdaKt.composableLambdaInstance(-1356624655, false, ActionBar.AEQbTJ);
    public static yHT<Shape, java.lang.Float, Composer, java.lang.Integer, Unit> EZpvd = ComposableLambdaKt.composableLambdaInstance(2099070286, false, StateListAnimator.OLrzqt);
    public static yHO<LazyItemScope, Composer, java.lang.Integer, Unit> KWHzl = ComposableLambdaKt.composableLambdaInstance(-901540736, false, TaskDescription.copydefault);
    public static yHO<RowScope, Composer, java.lang.Integer, Unit> valueOf = ComposableLambdaKt.composableLambdaInstance(-1639092109, false, Application.EZpvd);
    public static yHO<RowScope, Composer, java.lang.Integer, Unit> AhwBna = ComposableLambdaKt.composableLambdaInstance(-1942949644, false, LoaderManager.copydefault);
    public static Function2<Composer, java.lang.Integer, Unit> AYXKKw = ComposableLambdaKt.composableLambdaInstance(1970381712, false, Dialog.EZpvd);
    public static yHT<Shape, java.lang.Float, Composer, java.lang.Integer, Unit> djBIcL = ComposableLambdaKt.composableLambdaInstance(1131109357, false, Fragment.copydefault);
    public static yHO<LazyItemScope, Composer, java.lang.Integer, Unit> gEmmrt = ComposableLambdaKt.composableLambdaInstance(-1869501665, false, PendingIntent.EZpvd);
    public static yHO<RowScope, Composer, java.lang.Integer, Unit> DbNXlk = ComposableLambdaKt.composableLambdaInstance(1687914258, false, FragmentManager.OLrzqt);
    public static yHO<RowScope, Composer, java.lang.Integer, Unit> values = ComposableLambdaKt.composableLambdaInstance(1384056723, false, SharedElementCallback.KWHzl);
    public static Function2<Composer, java.lang.Integer, Unit> AkhnZx = ComposableLambdaKt.composableLambdaInstance(1002420783, false, PictureInPictureParams.copydefault);
    public static yHT<Shape, java.lang.Float, Composer, java.lang.Integer, Unit> isConnected = ComposableLambdaKt.composableLambdaInstance(163148428, false, VoiceInteractor.copydefault);
    public static yHO<LazyItemScope, Composer, java.lang.Integer, Unit> fJNWhG = ComposableLambdaKt.composableLambdaInstance(1457504702, false, AssistContent.AEQbTJ);
    public static Function2<Composer, java.lang.Integer, Unit> AuCTel = ComposableLambdaKt.composableLambdaInstance(-966592149, false, BroadcastReceiver.copydefault);
    public static Function2<Composer, java.lang.Integer, Unit> fARcdN = ComposableLambdaKt.composableLambdaInstance(-214921937, false, ComponentName.OLrzqt);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<Composer, java.lang.Integer, Unit> AEQbTJ() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<Composer, java.lang.Integer, Unit> AYXKKw() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<RowScope, Composer, java.lang.Integer, Unit> AhwBna() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHT<Shape, java.lang.Float, Composer, java.lang.Integer, Unit> AkhnZx() {
        return isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<RowScope, Composer, java.lang.Integer, Unit> AuCTel() {
        return fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<RowScope, Composer, java.lang.Integer, Unit> DbNXlk() {
        return fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<RowScope, Composer, java.lang.Integer, Unit> EZpvd() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHT<Shape, java.lang.Float, Composer, java.lang.Integer, Unit> KWHzl() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<RowScope, Composer, java.lang.Integer, Unit> OLrzqt() {
        return valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<LazyItemScope, Composer, java.lang.Integer, Unit> copydefault() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHT<Shape, java.lang.Float, Composer, java.lang.Integer, Unit> djBIcL() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<Composer, java.lang.Integer, Unit> ejfBZ() {
        return iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHT<Shape, java.lang.Float, Composer, java.lang.Integer, Unit> fARcdN() {
        return uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<RowScope, Composer, java.lang.Integer, Unit> fIwbmz() {
        return ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<Composer, java.lang.Integer, Unit> fJNWhG() {
        return AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<RowScope, Composer, java.lang.Integer, Unit> fetchVPNInfo() {
        return values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<RowScope, Composer, java.lang.Integer, Unit> gEmmrt() {
        return DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<LazyItemScope, Composer, java.lang.Integer, Unit> getFieldNames() {
        return getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<RowScope, Composer, java.lang.Integer, Unit> hDKMBd() {
        return hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<LazyItemScope, Composer, java.lang.Integer, Unit> isConnected() {
        return fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<RowScope, Composer, java.lang.Integer, Unit> uzCIH() {
        return getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<LazyItemScope, Composer, java.lang.Integer, Unit> valueOf() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function2<Composer, java.lang.Integer, Unit> values() {
        return AkhnZx;
    }

    /* JADX INFO: renamed from: o.mFb$Activity */
    public static final class Activity implements yHO<RowScope, Composer, java.lang.Integer, Unit> {
        public static final Activity copydefault = new Activity();

        public final void copydefault(RowScope rowScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-692433373, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-1.<anonymous> (RevealSwipe.kt:103)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, java.lang.Integer num) {
            copydefault(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.mFb$TaskStackBuilder */
    public static final class TaskStackBuilder implements yHO<RowScope, Composer, java.lang.Integer, Unit> {
        public static final TaskStackBuilder AEQbTJ = new TaskStackBuilder();

        public final void KWHzl(RowScope rowScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-603715524, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-2.<anonymous> (RevealSwipe.kt:104)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, java.lang.Integer num) {
            KWHzl(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.mFb$ComponentName */
    public static final class ComponentName implements Function2<Composer, java.lang.Integer, Unit> {
        public static final ComponentName OLrzqt = new ComponentName();

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
                    ComposerKt.traceEventStart(-214921937, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-24.<anonymous> (RevealSwipe.kt:618)");
                }
                float f = 400;
                SurfaceKt.m1398SurfaceFjzlyU(SizeKt.m704height3ABfNKs(SizeKt.m723width3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(f)), androidx.compose.ui.unit.Dp.m5414constructorimpl(f)), null, 0L, 0L, null, 0.0f, C31819mFb.OLrzqt.fJNWhG(), composer, 1572870, 62);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$BroadcastReceiver */
    public static final class BroadcastReceiver implements Function2<Composer, java.lang.Integer, Unit> {
        public static final BroadcastReceiver copydefault = new BroadcastReceiver();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            KWHzl(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void KWHzl(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-966592149, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-23.<anonymous> (RevealSwipe.kt:623)");
                }
                PaddingValues paddingValuesM664PaddingValues0680j_4 = PaddingKt.m664PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(10));
                composer.startReplaceableGroup(-975188523);
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.mFc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C31819mFb.BroadcastReceiver.KWHzl((LazyListScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                LazyDslKt.LazyColumn(null, null, paddingValuesM664PaddingValues0680j_4, false, null, null, null, false, (Function1) objRememberedValue, composer, 100663680, 251);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit KWHzl(LazyListScope lazyListScope) {
            Intrinsics.checkNotNullParameter(lazyListScope, "");
            C31819mFb c31819mFb = C31819mFb.OLrzqt;
            LazyListScope.item$default(lazyListScope, null, null, c31819mFb.getFieldNames(), 3, null);
            LazyListScope.item$default(lazyListScope, null, null, c31819mFb.copydefault(), 3, null);
            LazyListScope.item$default(lazyListScope, null, null, c31819mFb.valueOf(), 3, null);
            LazyListScope.item$default(lazyListScope, null, null, c31819mFb.isConnected(), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.mFb$Context */
    public static final class Context implements yHO<LazyItemScope, Composer, java.lang.Integer, Unit> {
        public static final Context copydefault = new Context();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, java.lang.Integer num) {
            OLrzqt(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2140507305, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-7.<anonymous> (RevealSwipe.kt:627)");
                }
                Modifier modifierM673paddingVpY3zN4$default = PaddingKt.m673paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(5), 1, null);
                java.util.Set setAhwBna = yEE.AhwBna(RevealDirection.StartToEnd, RevealDirection.EndToStart);
                C31819mFb c31819mFb = C31819mFb.OLrzqt;
                C31825mFh.AEQbTJ(modifierM673paddingVpY3zN4$default, false, false, null, null, null, "Delete entry", null, "Mark as favorite", null, false, false, false, null, null, 0.0f, 0.0f, false, 0.0f, setAhwBna, 0L, null, 0.0f, 0L, 0L, 0L, null, null, c31819mFb.AuCTel(), c31819mFb.fIwbmz(), c31819mFb.fARcdN(), composer, 102236166, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 905969664, 6, 267910846);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$ClipData */
    public static final class ClipData implements yHO<RowScope, Composer, java.lang.Integer, Unit> {
        public static final ClipData AEQbTJ = new ClipData();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, java.lang.Integer num) {
            AEQbTJ(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(RowScope rowScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-178574740, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-4.<anonymous> (RevealSwipe.kt:638)");
                }
                IconKt.m1317Iconww6aTOc(StarKt.getStar(Icons.Outlined.INSTANCE), (java.lang.String) null, PaddingKt.m673paddingVpY3zN4$default(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(25), 0.0f, 2, null), Color.Companion.m3186getWhite0d7_KjU(), composer, 3504, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$ComponentCallbacks */
    public static final class ComponentCallbacks implements yHO<RowScope, Composer, java.lang.Integer, Unit> {
        public static final ComponentCallbacks OLrzqt = new ComponentCallbacks();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, java.lang.Integer num) {
            OLrzqt(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(RowScope rowScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-281051733, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-3.<anonymous> (RevealSwipe.kt:646)");
                }
                IconKt.m1317Iconww6aTOc(DeleteKt.getDelete(Icons.Outlined.INSTANCE), (java.lang.String) null, PaddingKt.m673paddingVpY3zN4$default(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(25), 0.0f, 2, null), 0L, composer, 432, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$ContentResolver */
    public static final class ContentResolver implements yHT<Shape, java.lang.Float, Composer, java.lang.Integer, Unit> {
        public static final ContentResolver KWHzl = new ContentResolver();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHT
        public /* synthetic */ Unit invoke(Shape shape, java.lang.Float f, Composer composer, java.lang.Integer num) {
            EZpvd(shape, f.floatValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(Shape shape, float f, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(shape, "");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(shape) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & com.ibm.icu.text.DateFormat.RELATIVE_SHORT) != 130 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-403308635, i2, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-6.<anonymous> (RevealSwipe.kt:653)");
                }
                CardKt.m1212CardFjzlyU(SizeKt.m707requiredHeight3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(80)), shape, ColorKt.Color(4283453792L), 0L, null, 0.0f, C31819mFb.OLrzqt.ejfBZ(), composer, 1573254 | ((i2 << 3) & WalletImportError.ERROR_CODE_AA_EXIST), 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 implements Function2<Composer, java.lang.Integer, Unit> {
        public static final ComponentCallbacks2 AEQbTJ = new ComponentCallbacks2();

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
                    ComposerKt.traceEventStart(-1121987576, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-5.<anonymous> (RevealSwipe.kt:660)");
                }
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                composer.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.Companion.getStart(), composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m1458Text4IGK_g("Both directions", PaddingKt.m675paddingqDBjuR0$default(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(20), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 54, 0, 131068);
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

    /* JADX INFO: renamed from: o.mFb$TaskDescription */
    public static final class TaskDescription implements yHO<LazyItemScope, Composer, java.lang.Integer, Unit> {
        public static final TaskDescription copydefault = new TaskDescription();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, java.lang.Integer num) {
            OLrzqt(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-901540736, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-12.<anonymous> (RevealSwipe.kt:672)");
                }
                Modifier modifierM673paddingVpY3zN4$default = PaddingKt.m673paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(5), 1, null);
                java.util.Set setAhwBna = yEE.AhwBna(RevealDirection.StartToEnd, RevealDirection.EndToStart);
                C31819mFb c31819mFb = C31819mFb.OLrzqt;
                C31825mFh.AEQbTJ(modifierM673paddingVpY3zN4$default, false, false, null, null, null, null, null, null, null, false, false, false, null, null, 0.0f, 0.0f, false, 0.0f, setAhwBna, 0L, null, 0.0f, 0L, 0L, 0L, null, null, c31819mFb.hDKMBd(), c31819mFb.uzCIH(), c31819mFb.KWHzl(), composer, 102236166, 805306422, 905969664, 6, 267907774);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$ContextWrapper */
    public static final class ContextWrapper implements yHO<RowScope, Composer, java.lang.Integer, Unit> {
        public static final ContextWrapper AEQbTJ = new ContextWrapper();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, java.lang.Integer num) {
            AEQbTJ(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(RowScope rowScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-974988715, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-9.<anonymous> (RevealSwipe.kt:685)");
                }
                IconKt.m1317Iconww6aTOc(StarKt.getStar(Icons.Outlined.INSTANCE), (java.lang.String) null, PaddingKt.m673paddingVpY3zN4$default(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(25), 0.0f, 2, null), Color.Companion.m3186getWhite0d7_KjU(), composer, 3504, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$DialogInterface */
    public static final class DialogInterface implements yHO<RowScope, Composer, java.lang.Integer, Unit> {
        public static final DialogInterface AEQbTJ = new DialogInterface();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, java.lang.Integer num) {
            KWHzl(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void KWHzl(RowScope rowScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-671131180, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-8.<anonymous> (RevealSwipe.kt:693)");
                }
                IconKt.m1317Iconww6aTOc(DeleteKt.getDelete(Icons.Outlined.INSTANCE), (java.lang.String) null, PaddingKt.m673paddingVpY3zN4$default(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(25), 0.0f, 2, null), 0L, composer, 432, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$StateListAnimator */
    public static final class StateListAnimator implements yHT<Shape, java.lang.Float, Composer, java.lang.Integer, Unit> {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHT
        public /* synthetic */ Unit invoke(Shape shape, java.lang.Float f, Composer composer, java.lang.Integer num) {
            OLrzqt(shape, f.floatValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Shape shape, float f, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(shape, "");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(shape) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & com.ibm.icu.text.DateFormat.RELATIVE_SHORT) != 130 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2099070286, i2, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-11.<anonymous> (RevealSwipe.kt:700)");
                }
                CardKt.m1212CardFjzlyU(SizeKt.m707requiredHeight3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(80)), shape, ColorKt.Color(4285039262L), 0L, null, 0.0f, C31819mFb.OLrzqt.AEQbTJ(), composer, 1573254 | ((i2 << 3) & WalletImportError.ERROR_CODE_AA_EXIST), 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$ActionBar */
    public static final class ActionBar implements Function2<Composer, java.lang.Integer, Unit> {
        public static final ActionBar AEQbTJ = new ActionBar();

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
                    ComposerKt.traceEventStart(-1356624655, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-10.<anonymous> (RevealSwipe.kt:707)");
                }
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                composer.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.Companion.getStart(), composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m1458Text4IGK_g("Both directions.\ncloseOnClick = false", PaddingKt.m675paddingqDBjuR0$default(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(20), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 54, 0, 131068);
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

    /* JADX INFO: renamed from: o.mFb$PendingIntent */
    public static final class PendingIntent implements yHO<LazyItemScope, Composer, java.lang.Integer, Unit> {
        public static final PendingIntent EZpvd = new PendingIntent();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, java.lang.Integer num) {
            EZpvd(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1869501665, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-17.<anonymous> (RevealSwipe.kt:719)");
                }
                Modifier modifierM673paddingVpY3zN4$default = PaddingKt.m673paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(5), 1, null);
                java.util.Set setAEQbTJ = yED.AEQbTJ(RevealDirection.StartToEnd);
                C31819mFb c31819mFb = C31819mFb.OLrzqt;
                C31825mFh.AEQbTJ(modifierM673paddingVpY3zN4$default, false, false, null, null, null, null, null, null, null, false, false, false, null, null, 0.0f, 0.0f, false, 0.0f, setAEQbTJ, 0L, null, 0.0f, 0L, 0L, 0L, null, null, c31819mFb.OLrzqt(), c31819mFb.AhwBna(), c31819mFb.djBIcL(), composer, 102236166, com.google.android.exoplayer2.C.ENCODING_PCM_32BIT, 905969664, 6, 267910846);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$LoaderManager */
    public static final class LoaderManager implements yHO<RowScope, Composer, java.lang.Integer, Unit> {
        public static final LoaderManager copydefault = new LoaderManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, java.lang.Integer num) {
            AEQbTJ(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(RowScope rowScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1942949644, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-14.<anonymous> (RevealSwipe.kt:729)");
                }
                IconKt.m1317Iconww6aTOc(StarKt.getStar(Icons.Outlined.INSTANCE), (java.lang.String) null, PaddingKt.m673paddingVpY3zN4$default(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(25), 0.0f, 2, null), Color.Companion.m3186getWhite0d7_KjU(), composer, 3504, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$Application */
    public static final class Application implements yHO<RowScope, Composer, java.lang.Integer, Unit> {
        public static final Application EZpvd = new Application();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, java.lang.Integer num) {
            EZpvd(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(RowScope rowScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1639092109, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-13.<anonymous> (RevealSwipe.kt:737)");
                }
                IconKt.m1317Iconww6aTOc(DeleteKt.getDelete(Icons.Outlined.INSTANCE), (java.lang.String) null, PaddingKt.m673paddingVpY3zN4$default(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(25), 0.0f, 2, null), 0L, composer, 432, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$Fragment */
    public static final class Fragment implements yHT<Shape, java.lang.Float, Composer, java.lang.Integer, Unit> {
        public static final Fragment copydefault = new Fragment();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHT
        public /* synthetic */ Unit invoke(Shape shape, java.lang.Float f, Composer composer, java.lang.Integer num) {
            copydefault(shape, f.floatValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(Shape shape, float f, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(shape, "");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(shape) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & com.ibm.icu.text.DateFormat.RELATIVE_SHORT) != 130 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1131109357, i2, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-16.<anonymous> (RevealSwipe.kt:744)");
                }
                CardKt.m1212CardFjzlyU(SizeKt.m707requiredHeight3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(80)), shape, ColorKt.Color(4289641784L), 0L, null, 0.0f, C31819mFb.OLrzqt.AYXKKw(), composer, 1573254 | ((i2 << 3) & WalletImportError.ERROR_CODE_AA_EXIST), 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$Dialog */
    public static final class Dialog implements Function2<Composer, java.lang.Integer, Unit> {
        public static final Dialog EZpvd = new Dialog();

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
                    ComposerKt.traceEventStart(1970381712, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-15.<anonymous> (RevealSwipe.kt:751)");
                }
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                composer.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.Companion.getStart(), composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m1458Text4IGK_g("StartToEnd", PaddingKt.m675paddingqDBjuR0$default(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(20), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 54, 0, 131068);
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

    /* JADX INFO: renamed from: o.mFb$AssistContent */
    public static final class AssistContent implements yHO<LazyItemScope, Composer, java.lang.Integer, Unit> {
        public static final AssistContent AEQbTJ = new AssistContent();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, java.lang.Integer num) {
            KWHzl(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void KWHzl(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1457504702, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-22.<anonymous> (RevealSwipe.kt:763)");
                }
                Modifier modifierM673paddingVpY3zN4$default = PaddingKt.m673paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(5), 1, null);
                java.util.Set setAEQbTJ = yED.AEQbTJ(RevealDirection.EndToStart);
                C31819mFb c31819mFb = C31819mFb.OLrzqt;
                C31825mFh.AEQbTJ(modifierM673paddingVpY3zN4$default, false, false, null, null, null, null, null, null, null, false, false, false, null, null, 0.0f, 0.0f, false, 0.0f, setAEQbTJ, 0L, null, 0.0f, 0L, 0L, 0L, null, null, c31819mFb.gEmmrt(), c31819mFb.fetchVPNInfo(), c31819mFb.AkhnZx(), composer, 102236166, 805306752, 905969664, 6, 267906750);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$SharedElementCallback */
    public static final class SharedElementCallback implements yHO<RowScope, Composer, java.lang.Integer, Unit> {
        public static final SharedElementCallback KWHzl = new SharedElementCallback();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, java.lang.Integer num) {
            EZpvd(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(RowScope rowScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1384056723, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-19.<anonymous> (RevealSwipe.kt:774)");
                }
                IconKt.m1317Iconww6aTOc(StarKt.getStar(Icons.Outlined.INSTANCE), (java.lang.String) null, PaddingKt.m673paddingVpY3zN4$default(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(25), 0.0f, 2, null), Color.Companion.m3186getWhite0d7_KjU(), composer, 3504, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$FragmentManager */
    public static final class FragmentManager implements yHO<RowScope, Composer, java.lang.Integer, Unit> {
        public static final FragmentManager OLrzqt = new FragmentManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, java.lang.Integer num) {
            AEQbTJ(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(RowScope rowScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1687914258, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-18.<anonymous> (RevealSwipe.kt:782)");
                }
                IconKt.m1317Iconww6aTOc(DeleteKt.getDelete(Icons.Outlined.INSTANCE), (java.lang.String) null, PaddingKt.m673paddingVpY3zN4$default(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(25), 0.0f, 2, null), 0L, composer, 432, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$VoiceInteractor */
    public static final class VoiceInteractor implements yHT<Shape, java.lang.Float, Composer, java.lang.Integer, Unit> {
        public static final VoiceInteractor copydefault = new VoiceInteractor();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHT
        public /* synthetic */ Unit invoke(Shape shape, java.lang.Float f, Composer composer, java.lang.Integer num) {
            copydefault(shape, f.floatValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(Shape shape, float f, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(shape, "");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(shape) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & com.ibm.icu.text.DateFormat.RELATIVE_SHORT) != 130 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(163148428, i2, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-21.<anonymous> (RevealSwipe.kt:789)");
                }
                CardKt.m1212CardFjzlyU(SizeKt.m707requiredHeight3ABfNKs(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(80)), shape, ColorKt.Color(4284056116L), 0L, null, 0.0f, C31819mFb.OLrzqt.values(), composer, 1573254 | ((i2 << 3) & WalletImportError.ERROR_CODE_AA_EXIST), 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: renamed from: o.mFb$PictureInPictureParams */
    public static final class PictureInPictureParams implements Function2<Composer, java.lang.Integer, Unit> {
        public static final PictureInPictureParams copydefault = new PictureInPictureParams();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            copydefault(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1002420783, i, -1, "com.okinc.cruilib.compose.library.revealswipe.ComposableSingletons$RevealSwipeKt.lambda-20.<anonymous> (RevealSwipe.kt:796)");
                }
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                composer.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.Companion.getStart(), composer, 6);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m1458Text4IGK_g("EndToStart", PaddingKt.m675paddingqDBjuR0$default(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(20), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 54, 0, 131068);
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
}

package o;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.DragInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.FixedThreshold;
import androidx.compose.material.FractionalThreshold;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ResistanceConfig;
import androidx.compose.material.SwipeableKt;
import androidx.compose.material.SwipeableState;
import androidx.compose.material.ThresholdConfig;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.cruilib.compose.library.revealswipe.RevealDirection;
import com.okinc.cruilib.compose.library.revealswipe.RevealSwipeKt$RevealSwipe$backgroundEndClick$1$1$1;
import com.okinc.cruilib.compose.library.revealswipe.RevealSwipeKt$RevealSwipe$backgroundStartClick$1$1$1;
import com.okinc.cruilib.compose.library.revealswipe.RevealSwipeKt$RevealSwipe$closeOnContentClickHandler$1$1$1;
import com.okinc.cruilib.compose.library.revealswipe.RevealSwipeKt$revealSwipable$1$1$1;
import com.okinc.cruilib.compose.library.revealswipe.RevealValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C31825mFh;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mFh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31825mFh {
    public static final boolean KWHzl() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(Modifier modifier, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, java.lang.String str, Function0 function04, java.lang.String str2, Function0 function05, boolean z3, boolean z4, boolean z5, CornerBasedShape cornerBasedShape, Easing easing, float f, float f2, boolean z6, float f3, java.util.Set set, long j, Modifier modifier2, float f4, long j2, long j3, long j4, CoroutineScope coroutineScope, SwipeableState swipeableState, yHO yho, yHO yho2, yHT yht, int i, int i2, int i3, int i4, int i5, Composer composer, int i6) {
        AEQbTJ(modifier, z, z2, function0, function02, function03, str, function04, str2, function05, z3, z4, z5, cornerBasedShape, easing, f, f2, z6, f3, set, j, modifier2, f4, j2, j3, j4, coroutineScope, swipeableState, yho, yho2, yht, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    public static final boolean OLrzqt() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean copydefault(RevealValue revealValue) {
        Intrinsics.checkNotNullParameter(revealValue, "");
        return true;
    }

    public static final <T> T EZpvd(T t, T t2, Function1<? super T, java.lang.Boolean> function1) {
        return function1.invoke(t).booleanValue() ? t2 : t;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0aa3  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0aec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0b29  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0b4e  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0bc1  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0c28  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0c6b  */
    /* JADX WARN: Removed duplicated region for block: B:635:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(Modifier modifier, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, java.lang.String str, Function0<java.lang.Boolean> function04, java.lang.String str2, Function0<java.lang.Boolean> function05, boolean z3, boolean z4, boolean z5, CornerBasedShape cornerBasedShape, Easing easing, float f, float f2, boolean z6, float f3, java.util.Set<? extends RevealDirection> set, long j, Modifier modifier2, float f4, long j2, long j3, long j4, CoroutineScope coroutineScope, SwipeableState<RevealValue> swipeableState, yHO<? super RowScope, ? super Composer, ? super java.lang.Integer, Unit> yho, yHO<? super RowScope, ? super Composer, ? super java.lang.Integer, Unit> yho2, @NotNull final yHT<? super Shape, ? super java.lang.Float, ? super Composer, ? super java.lang.Integer, Unit> yht, Composer composer, final int i, final int i2, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        java.util.Set<? extends RevealDirection> set2;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        Function0<Unit> function06;
        Function0<Unit> function07;
        java.lang.String str3;
        Modifier modifier3;
        Function0<java.lang.Boolean> function08;
        Function0<java.lang.Boolean> function09;
        boolean z7;
        Function0<java.lang.Boolean> function010;
        boolean z8;
        boolean z9;
        CornerBasedShape medium;
        CornerBasedShape cornerBasedShape2;
        java.lang.String str4;
        boolean z10;
        Easing cubicBezierEasing;
        float f5;
        float f6;
        Easing easing2;
        java.util.Set<? extends RevealDirection> setAhwBna;
        long jM3159unboximpl;
        Modifier modifier4;
        java.util.Set<? extends RevealDirection> set3;
        Modifier modifier5;
        float fM5414constructorimpl;
        float f7;
        long jM1239getSecondaryVariant0d7_KjU;
        long j5;
        long jM1238getSecondary0d7_KjU;
        long j6;
        long jM1234getOnSecondary0d7_KjU;
        long j7;
        CoroutineScope coroutineScope2;
        CoroutineScope coroutineScope3;
        float f8;
        SwipeableState<RevealValue> swipeableStateEZpvd;
        boolean z11;
        float f9;
        java.lang.String str5;
        Easing easing3;
        final java.util.Set<? extends RevealDirection> set4;
        Modifier modifier6;
        float f10;
        long j8;
        long j9;
        yHO<? super RowScope, ? super Composer, ? super java.lang.Integer, Unit> yhoEZpvd;
        yHO<? super RowScope, ? super Composer, ? super java.lang.Integer, Unit> yhoDbNXlk;
        int i35;
        boolean z12;
        Function0<Unit> function011;
        float f11;
        Modifier modifier7;
        final Function0<java.lang.Boolean> function012;
        final CoroutineScope coroutineScope4;
        final SwipeableState<RevealValue> swipeableState2;
        float f12;
        int i36;
        final boolean z13;
        final Function0<java.lang.Boolean> function013;
        CornerBasedShape cornerBasedShape3;
        long j10;
        Modifier modifier8;
        Function0<Unit> function014;
        boolean zChanged;
        int i37;
        Modifier modifier9;
        boolean z14;
        java.lang.Object objRememberedValue;
        Function0 function015;
        boolean zChanged2;
        Function0 function016;
        boolean z15;
        boolean z16;
        java.lang.Object objRememberedValue2;
        boolean zChanged3;
        boolean z17;
        boolean z18;
        java.lang.Object objRememberedValue3;
        int currentCompositeKeyHash;
        Composer composerM2783constructorimpl;
        Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash;
        java.lang.Object objRememberedValue4;
        Composer.Companion companion;
        MutableState mutableState;
        Density density;
        boolean zChanged4;
        boolean zChanged5;
        java.lang.Object objRememberedValue5;
        boolean zChanged6;
        boolean zChanged7;
        java.lang.Object objRememberedValue6;
        boolean zChanged8;
        boolean zChanged9;
        java.lang.Object objRememberedValue7;
        boolean zChanged10;
        boolean zChanged11;
        java.lang.Object objRememberedValue8;
        boolean zChangedInstance;
        java.lang.Object objRememberedValue9;
        boolean zChangedInstance2;
        java.lang.Object objRememberedValue10;
        java.lang.Float fValueOf;
        float f13;
        float fFloatValue;
        int iEZpvd;
        BoxScopeInstance boxScopeInstance;
        Modifier modifier10;
        float f14;
        final boolean z19;
        final Function0<Unit> function017;
        final Function0<Unit> function018;
        final Modifier modifier11;
        Easing easing4;
        final Function0<Unit> function019;
        final Function0<java.lang.Boolean> function020;
        final java.lang.String str6;
        final Function0<java.lang.Boolean> function021;
        final float f15;
        final boolean z20;
        final long j11;
        final yHO<? super RowScope, ? super Composer, ? super java.lang.Integer, Unit> yho3;
        final yHO<? super RowScope, ? super Composer, ? super java.lang.Integer, Unit> yho4;
        final boolean z21;
        final float f16;
        final java.util.Set<? extends RevealDirection> set5;
        final boolean z22;
        final SwipeableState<RevealValue> swipeableState3;
        final boolean z23;
        final float f17;
        final CornerBasedShape cornerBasedShape4;
        final float f18;
        final java.lang.String str7;
        final Modifier modifier12;
        final boolean z24;
        final CoroutineScope coroutineScope5;
        final long j12;
        final long j13;
        final long j14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(yht, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-980509963);
        int i38 = i5 & 1;
        if (i38 != 0) {
            i6 = i | 6;
        } else if ((i & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i6 = i;
        }
        int i39 = i5 & 2;
        if (i39 != 0) {
            i6 |= 48;
        } else {
            if ((i & 48) == 0) {
                i6 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= MLKEMEngine.KyberPolyBytes;
            } else {
                if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                    i6 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i6 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    int i40 = 8192;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            i6 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                        }
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i6 |= composerStartRestartGroup.changedInstance(function03) ? 131072 : 65536;
                        }
                        i11 = i5 & 64;
                        if (i11 != 0) {
                            i6 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i6 |= composerStartRestartGroup.changed(str) ? 1048576 : 524288;
                        }
                        i12 = i5 & 128;
                        if (i12 != 0) {
                            i6 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i6 |= composerStartRestartGroup.changedInstance(function04) ? 8388608 : 4194304;
                        }
                        i13 = i5 & 256;
                        if (i13 != 0) {
                            i6 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i6 |= composerStartRestartGroup.changed(str2) ? 67108864 : 33554432;
                        }
                        i14 = i5 & 512;
                        if (i14 != 0) {
                            i6 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                        } else if ((i & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                            i6 |= composerStartRestartGroup.changedInstance(function05) ? 536870912 : 268435456;
                        }
                        i15 = i5 & 1024;
                        if (i15 != 0) {
                            i16 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i16 = i2 | (composerStartRestartGroup.changed(z3) ? 4 : 2);
                        } else {
                            i16 = i2;
                        }
                        i17 = i5 & 2048;
                        if (i17 != 0) {
                            i16 |= 48;
                            i18 = i17;
                        } else if ((i2 & 48) == 0) {
                            i18 = i17;
                            i16 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
                        } else {
                            i18 = i17;
                        }
                        int i41 = i16;
                        i19 = i5 & 4096;
                        if (i19 != 0) {
                            i41 |= MLKEMEngine.KyberPolyBytes;
                            i20 = i19;
                        } else {
                            i20 = i19;
                            if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                                i41 |= composerStartRestartGroup.changed(z5) ? 256 : 128;
                            }
                            if ((i2 & 3072) == 0) {
                                i41 |= ((i5 & 8192) == 0 && composerStartRestartGroup.changed(cornerBasedShape)) ? 2048 : 1024;
                            }
                            i21 = i5 & 16384;
                            if (i21 == 0) {
                                i41 |= 24576;
                                i22 = i21;
                            } else {
                                i22 = i21;
                                if ((i2 & 24576) == 0) {
                                    i41 |= composerStartRestartGroup.changed(easing) ? 16384 : 8192;
                                }
                                i23 = i5 & 32768;
                                if (i23 != 0) {
                                    i41 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i41 |= composerStartRestartGroup.changed(f) ? 131072 : 65536;
                                }
                                if ((i2 & 1572864) == 0) {
                                    i41 |= ((i5 & 65536) == 0 && composerStartRestartGroup.changed(f2)) ? 1048576 : 524288;
                                }
                                i24 = i5 & 131072;
                                if (i24 != 0) {
                                    i41 |= 12582912;
                                } else if ((i2 & 12582912) == 0) {
                                    i41 |= composerStartRestartGroup.changed(z6) ? 8388608 : 4194304;
                                }
                                i25 = i5 & 262144;
                                if (i25 != 0) {
                                    i41 |= 100663296;
                                } else if ((i2 & 100663296) == 0) {
                                    i41 |= composerStartRestartGroup.changed(f3) ? 67108864 : 33554432;
                                }
                                i26 = i5 & 524288;
                                if (i26 != 0) {
                                    i41 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                                    set2 = set;
                                } else {
                                    set2 = set;
                                    if ((i2 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                        i41 |= composerStartRestartGroup.changedInstance(set2) ? 536870912 : 268435456;
                                    }
                                }
                                if ((i3 & 6) == 0) {
                                    if ((i5 & 1048576) == 0) {
                                        i27 = i13;
                                        i28 = i14;
                                        int i42 = composerStartRestartGroup.changed(j) ? 4 : 2;
                                        i29 = i3 | i42;
                                    } else {
                                        i27 = i13;
                                        i28 = i14;
                                    }
                                    i29 = i3 | i42;
                                } else {
                                    i27 = i13;
                                    i28 = i14;
                                    i29 = i3;
                                }
                                if ((i3 & 48) == 0) {
                                    i29 |= ((i5 & 2097152) == 0 && composerStartRestartGroup.changed(modifier2)) ? 32 : 16;
                                }
                                int i43 = i29;
                                i30 = i5 & 4194304;
                                if (i30 == 0) {
                                    if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
                                        i43 |= composerStartRestartGroup.changed(f4) ? 256 : 128;
                                    }
                                    if ((i3 & 3072) != 0) {
                                        if ((i5 & 8388608) == 0) {
                                            i31 = i12;
                                            int i44 = composerStartRestartGroup.changed(j2) ? 2048 : 1024;
                                            i43 |= i44;
                                        } else {
                                            i31 = i12;
                                        }
                                        i43 |= i44;
                                    } else {
                                        i31 = i12;
                                    }
                                    if ((i3 & 24576) == 0) {
                                        if ((16777216 & i5) == 0 && composerStartRestartGroup.changed(j3)) {
                                            i40 = 16384;
                                        }
                                        i43 |= i40;
                                    }
                                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                        i43 |= ((i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0 && composerStartRestartGroup.changed(j4)) ? 131072 : 65536;
                                    }
                                    if ((i3 & 1572864) == 0) {
                                        i43 |= ((i5 & 67108864) == 0 && composerStartRestartGroup.changedInstance(coroutineScope)) ? 1048576 : 524288;
                                    }
                                    if ((i3 & 12582912) == 0) {
                                        i43 |= ((134217728 & i5) == 0 && composerStartRestartGroup.changed(swipeableState)) ? 8388608 : 4194304;
                                    }
                                    i32 = i5 & 268435456;
                                    if (i32 == 0) {
                                        i43 |= 100663296;
                                    } else if ((i3 & 100663296) == 0) {
                                        i43 |= composerStartRestartGroup.changedInstance(yho) ? 67108864 : 33554432;
                                    }
                                    i33 = i5 & 536870912;
                                    if (i33 == 0) {
                                        i43 |= com.google.android.exoplayer2.C.ENCODING_PCM_32BIT;
                                    } else if ((i3 & com.google.android.exoplayer2.C.ENCODING_PCM_32BIT) == 0) {
                                        i43 |= composerStartRestartGroup.changedInstance(yho2) ? 536870912 : 268435456;
                                    }
                                    if ((i5 & 1073741824) == 0) {
                                        i34 = i4 | 6;
                                    } else if ((i4 & 6) == 0) {
                                        i34 = i4 | (composerStartRestartGroup.changedInstance(yht) ? 4 : 2);
                                    } else {
                                        i34 = i4;
                                    }
                                    if ((i6 & 306783379) == 306783378 || (306783379 & i41) != 306783378 || (306783379 & i43) != 306783378 || (i34 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            Modifier modifier13 = i38 == 0 ? Modifier.Companion : modifier;
                                            boolean z25 = i39 == 0 ? true : z;
                                            boolean z26 = i7 == 0 ? true : z2;
                                            function06 = i8 == 0 ? null : function0;
                                            Function0<Unit> function022 = i9 == 0 ? null : function02;
                                            function07 = i10 == 0 ? null : function03;
                                            str3 = i11 == 0 ? null : str;
                                            if (i31 == 0) {
                                                composerStartRestartGroup.startReplaceableGroup(-1687461056);
                                                java.lang.Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                                modifier3 = modifier13;
                                                if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                                                    objRememberedValue11 = new Function0() { // from class: o.mFi
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final java.lang.Object invoke() {
                                                            return java.lang.Boolean.valueOf(C31825mFh.KWHzl());
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                                }
                                                function08 = (Function0) objRememberedValue11;
                                                composerStartRestartGroup.endReplaceableGroup();
                                            } else {
                                                modifier3 = modifier13;
                                                function08 = function04;
                                            }
                                            java.lang.String str8 = i27 == 0 ? null : str2;
                                            if (i28 == 0) {
                                                function09 = function08;
                                                composerStartRestartGroup.startReplaceableGroup(-1687457920);
                                                java.lang.Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                                z7 = z25;
                                                if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                                                    objRememberedValue12 = new Function0() { // from class: o.mFf
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final java.lang.Object invoke() {
                                                            return java.lang.Boolean.valueOf(C31825mFh.OLrzqt());
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                                                }
                                                function010 = (Function0) objRememberedValue12;
                                                composerStartRestartGroup.endReplaceableGroup();
                                            } else {
                                                function09 = function08;
                                                z7 = z25;
                                                function010 = function05;
                                            }
                                            boolean z27 = i15 == 0 ? true : z3;
                                            boolean z28 = i18 == 0 ? true : z4;
                                            z8 = i20 == 0 ? true : z5;
                                            Function0<java.lang.Boolean> function023 = function010;
                                            if ((i5 & 8192) == 0) {
                                                z9 = z27;
                                                medium = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium();
                                                i41 &= -7169;
                                            } else {
                                                z9 = z27;
                                                medium = cornerBasedShape;
                                            }
                                            if (i22 == 0) {
                                                cornerBasedShape2 = medium;
                                                str4 = str8;
                                                z10 = z26;
                                                cubicBezierEasing = new CubicBezierEasing(0.4f, 0.4f, 0.17f, 0.9f);
                                            } else {
                                                cornerBasedShape2 = medium;
                                                str4 = str8;
                                                z10 = z26;
                                                cubicBezierEasing = easing;
                                            }
                                            float fM5414constructorimpl2 = i23 == 0 ? androidx.compose.ui.unit.Dp.m5414constructorimpl(75) : f;
                                            if ((i5 & 65536) == 0) {
                                                i41 = (-3670017) & i41;
                                                f5 = fM5414constructorimpl2;
                                            } else {
                                                f5 = f2;
                                            }
                                            boolean z29 = i24 == 0 ? false : z6;
                                            float fM5414constructorimpl3 = i25 == 0 ? androidx.compose.ui.unit.Dp.m5414constructorimpl(250) : f3;
                                            if (i26 == 0) {
                                                f6 = fM5414constructorimpl2;
                                                easing2 = cubicBezierEasing;
                                                setAhwBna = yEE.AhwBna(RevealDirection.StartToEnd, RevealDirection.EndToStart);
                                            } else {
                                                f6 = fM5414constructorimpl2;
                                                easing2 = cubicBezierEasing;
                                                setAhwBna = set;
                                            }
                                            if ((i5 & 1048576) == 0) {
                                                jM3159unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m3159unboximpl();
                                                i43 &= -15;
                                            } else {
                                                jM3159unboximpl = j;
                                            }
                                            if ((2097152 & i5) == 0) {
                                                i43 &= -113;
                                                modifier4 = modifier3;
                                            } else {
                                                modifier4 = modifier2;
                                            }
                                            if (i30 == 0) {
                                                set3 = setAhwBna;
                                                modifier5 = modifier4;
                                                fM5414constructorimpl = androidx.compose.ui.unit.Dp.m5414constructorimpl(0);
                                            } else {
                                                set3 = setAhwBna;
                                                modifier5 = modifier4;
                                                fM5414constructorimpl = f4;
                                            }
                                            if ((i5 & 8388608) == 0) {
                                                f7 = fM5414constructorimpl;
                                                jM1239getSecondaryVariant0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1239getSecondaryVariant0d7_KjU();
                                                i43 &= -7169;
                                            } else {
                                                f7 = fM5414constructorimpl;
                                                jM1239getSecondaryVariant0d7_KjU = j2;
                                            }
                                            if ((i5 & 16777216) == 0) {
                                                j5 = jM1239getSecondaryVariant0d7_KjU;
                                                jM1238getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1238getSecondary0d7_KjU();
                                                i43 &= -57345;
                                            } else {
                                                j5 = jM1239getSecondaryVariant0d7_KjU;
                                                jM1238getSecondary0d7_KjU = j3;
                                            }
                                            if ((i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
                                                j6 = jM1238getSecondary0d7_KjU;
                                                jM1234getOnSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1234getOnSecondary0d7_KjU();
                                                i43 &= -458753;
                                            } else {
                                                j6 = jM1238getSecondary0d7_KjU;
                                                jM1234getOnSecondary0d7_KjU = j4;
                                            }
                                            if ((i5 & 67108864) == 0) {
                                                j7 = jM1234getOnSecondary0d7_KjU;
                                                composerStartRestartGroup.startReplaceableGroup(773894976);
                                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                                java.lang.Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue13 == Composer.Companion.getEmpty()) {
                                                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                    objRememberedValue13 = compositionScopedCoroutineScopeCanceller;
                                                }
                                                composerStartRestartGroup.endReplaceableGroup();
                                                coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue13).getCoroutineScope();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                i43 &= -3670017;
                                            } else {
                                                j7 = jM1234getOnSecondary0d7_KjU;
                                                coroutineScope2 = coroutineScope;
                                            }
                                            if ((134217728 & i5) == 0) {
                                                coroutineScope3 = coroutineScope2;
                                                f8 = f5;
                                                swipeableStateEZpvd = EZpvd(null, null, composerStartRestartGroup, 0, 3);
                                                i43 = (-29360129) & i43;
                                            } else {
                                                coroutineScope3 = coroutineScope2;
                                                f8 = f5;
                                                swipeableStateEZpvd = swipeableState;
                                            }
                                            z11 = z9;
                                            f9 = f6;
                                            str5 = str4;
                                            easing3 = easing2;
                                            set4 = set3;
                                            modifier6 = modifier5;
                                            f10 = f7;
                                            j8 = j5;
                                            j9 = j7;
                                            yhoEZpvd = i32 == 0 ? C31819mFb.OLrzqt.EZpvd() : yho;
                                            yhoDbNXlk = i33 == 0 ? C31819mFb.OLrzqt.DbNXlk() : yho2;
                                            i35 = i43;
                                            z12 = z29;
                                            function011 = function022;
                                            f11 = f8;
                                            modifier7 = modifier3;
                                            function012 = function023;
                                            coroutineScope4 = coroutineScope3;
                                            swipeableState2 = swipeableStateEZpvd;
                                            f12 = fM5414constructorimpl3;
                                            i36 = i41;
                                            z13 = z28;
                                            function013 = function09;
                                            cornerBasedShape3 = cornerBasedShape2;
                                            j10 = j6;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i5 & 8192) != 0) {
                                                i41 &= -7169;
                                            }
                                            if ((i5 & 65536) != 0) {
                                                i41 &= -3670017;
                                            }
                                            if ((i5 & 1048576) != 0) {
                                                i43 &= -15;
                                            }
                                            if ((2097152 & i5) != 0) {
                                                i43 &= -113;
                                            }
                                            if ((i5 & 8388608) != 0) {
                                                i43 &= -7169;
                                            }
                                            if ((16777216 & i5) != 0) {
                                                i43 &= -57345;
                                            }
                                            if ((i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0) {
                                                i43 &= -458753;
                                            }
                                            if ((i5 & 67108864) != 0) {
                                                i43 &= -3670017;
                                            }
                                            if ((134217728 & i5) != 0) {
                                                i43 &= -29360129;
                                            }
                                            modifier7 = modifier;
                                            z7 = z;
                                            z10 = z2;
                                            function06 = function0;
                                            function07 = function03;
                                            str3 = str;
                                            function013 = function04;
                                            z8 = z5;
                                            easing3 = easing;
                                            f9 = f;
                                            f11 = f2;
                                            z12 = z6;
                                            f12 = f3;
                                            jM3159unboximpl = j;
                                            modifier6 = modifier2;
                                            f10 = f4;
                                            j8 = j2;
                                            j10 = j3;
                                            j9 = j4;
                                            coroutineScope4 = coroutineScope;
                                            swipeableState2 = swipeableState;
                                            yhoEZpvd = yho;
                                            yhoDbNXlk = yho2;
                                            i35 = i43;
                                            set4 = set2;
                                            i36 = i41;
                                            function011 = function02;
                                            str5 = str2;
                                            function012 = function05;
                                            z11 = z3;
                                            z13 = z4;
                                            cornerBasedShape3 = cornerBasedShape;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            modifier8 = modifier7;
                                            function014 = function06;
                                        } else {
                                            function014 = function06;
                                            modifier8 = modifier7;
                                            ComposerKt.traceEventStart(-980509963, i6, i36, "com.okinc.cruilib.compose.library.revealswipe.RevealSwipe (RevealSwipe.kt:106)");
                                        }
                                        composerStartRestartGroup.startReplaceableGroup(-1687418407);
                                        zChanged = composerStartRestartGroup.changed(coroutineScope4);
                                        i37 = (i35 & 29360128) ^ 12582912;
                                        int i45 = i36;
                                        if (i37 > 8388608 || !composerStartRestartGroup.changed(swipeableState2)) {
                                            modifier9 = modifier6;
                                            if ((i35 & 12582912) != 8388608) {
                                                z14 = false;
                                            }
                                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if ((zChanged | z14) || objRememberedValue == Composer.Companion.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: o.mFg
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final java.lang.Object invoke() {
                                                        return C31825mFh.KWHzl(swipeableState2, coroutineScope4);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            function015 = (Function0) objRememberedValue;
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.startReplaceableGroup(-1687409996);
                                            zChanged2 = composerStartRestartGroup.changed(coroutineScope4);
                                            if (i37 > 8388608 || !composerStartRestartGroup.changed(swipeableState2)) {
                                                function016 = function015;
                                                if ((i35 & 12582912) != 8388608) {
                                                    z15 = false;
                                                }
                                                Easing easing5 = easing3;
                                                z16 = (i6 & 29360128) == 8388608;
                                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                if ((z15 | zChanged2 | z16) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                                                    objRememberedValue2 = new Function0() { // from class: o.mFj
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final java.lang.Object invoke() {
                                                            return java.lang.Boolean.valueOf(C31825mFh.OLrzqt(swipeableState2, z13, coroutineScope4, function013));
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                }
                                                Function0 function024 = (Function0) objRememberedValue2;
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.startReplaceableGroup(-1687396844);
                                                zChanged3 = composerStartRestartGroup.changed(coroutineScope4);
                                                z17 = (i37 <= 8388608 && composerStartRestartGroup.changed(swipeableState2)) || (i35 & 12582912) == 8388608;
                                                z18 = (i6 & 1879048192) == 536870912;
                                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                if ((z18 | z17 | zChanged3) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                                                    objRememberedValue3 = new Function0() { // from class: o.mFo
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final java.lang.Object invoke() {
                                                            return java.lang.Boolean.valueOf(C31825mFh.KWHzl(swipeableState2, z13, coroutineScope4, function012));
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                                }
                                                Function0 function025 = (Function0) objRememberedValue3;
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.startReplaceableGroup(733328855);
                                                Modifier.Companion companion2 = Modifier.Companion;
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composerStartRestartGroup, 0);
                                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                                CoroutineScope coroutineScope6 = coroutineScope4;
                                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
                                                boolean z30 = z13;
                                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composerStartRestartGroup.startReusableNode();
                                                if (!composerStartRestartGroup.getInserting()) {
                                                    composerStartRestartGroup.createNode(constructor);
                                                } else {
                                                    composerStartRestartGroup.useNode();
                                                }
                                                composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                                                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                if (!composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                composerStartRestartGroup.startReplaceableGroup(-842580064);
                                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                companion = Composer.Companion;
                                                if (objRememberedValue4 != companion.getEmpty()) {
                                                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Size.m2967boximpl(SizeKt.Size(0.0f, 0.0f)), null, 2, null);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                }
                                                mutableState = (MutableState) objRememberedValue4;
                                                composerStartRestartGroup.endReplaceableGroup();
                                                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                                long jOLrzqt = OLrzqt(mutableState);
                                                Function0<java.lang.Boolean> function026 = function012;
                                                composerStartRestartGroup.startReplaceableGroup(-842576007);
                                                zChanged4 = composerStartRestartGroup.changed(jOLrzqt);
                                                zChanged5 = composerStartRestartGroup.changed(density);
                                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                                if (!(zChanged4 | zChanged5) || objRememberedValue5 == companion.getEmpty()) {
                                                    objRememberedValue5 = java.lang.Float.valueOf(cornerBasedShape3.getBottomEnd().mo915toPxTmRCtEA(OLrzqt(mutableState), density));
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                                }
                                                float fFloatValue2 = ((java.lang.Number) objRememberedValue5).floatValue();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                long jOLrzqt2 = OLrzqt(mutableState);
                                                Function0<java.lang.Boolean> function027 = function013;
                                                composerStartRestartGroup.startReplaceableGroup(-842569738);
                                                zChanged6 = composerStartRestartGroup.changed(jOLrzqt2);
                                                zChanged7 = composerStartRestartGroup.changed(density);
                                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                                if (!(zChanged6 | zChanged7) || objRememberedValue6 == companion.getEmpty()) {
                                                    objRememberedValue6 = java.lang.Float.valueOf(cornerBasedShape3.getTopEnd().mo915toPxTmRCtEA(OLrzqt(mutableState), density));
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                                }
                                                float fFloatValue3 = ((java.lang.Number) objRememberedValue6).floatValue();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                long jOLrzqt3 = OLrzqt(mutableState);
                                                composerStartRestartGroup.startReplaceableGroup(-842563365);
                                                zChanged8 = composerStartRestartGroup.changed(jOLrzqt3);
                                                zChanged9 = composerStartRestartGroup.changed(density);
                                                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                                if (!(zChanged8 | zChanged9) || objRememberedValue7 == companion.getEmpty()) {
                                                    objRememberedValue7 = java.lang.Float.valueOf(cornerBasedShape3.getBottomStart().mo915toPxTmRCtEA(OLrzqt(mutableState), density));
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                                }
                                                float fFloatValue4 = ((java.lang.Number) objRememberedValue7).floatValue();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                long jOLrzqt4 = OLrzqt(mutableState);
                                                composerStartRestartGroup.startReplaceableGroup(-842556968);
                                                zChanged10 = composerStartRestartGroup.changed(jOLrzqt4);
                                                zChanged11 = composerStartRestartGroup.changed(density);
                                                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                                if (!(zChanged10 | zChanged11) || objRememberedValue8 == companion.getEmpty()) {
                                                    objRememberedValue8 = java.lang.Float.valueOf(cornerBasedShape3.getTopStart().mo915toPxTmRCtEA(OLrzqt(mutableState), density));
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                                }
                                                float fFloatValue5 = ((java.lang.Number) objRememberedValue8).floatValue();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                float fMax = java.lang.Math.max(fFloatValue3, fFloatValue2);
                                                float fFloatValue6 = swipeableState2.getOffset().getValue().floatValue();
                                                SwipeableState<RevealValue> swipeableState4 = swipeableState2;
                                                float fKWHzl = C56548yJl.KWHzl(copydefault((-fFloatValue6) / fMax), 0.0f, 1.0f);
                                                composerStartRestartGroup.startReplaceableGroup(-842542260);
                                                zChangedInstance = composerStartRestartGroup.changedInstance(set4);
                                                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                                if (!zChangedInstance || objRememberedValue9 == companion.getEmpty()) {
                                                    objRememberedValue9 = new Function1() { // from class: o.mFn
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                                            return java.lang.Boolean.valueOf(C31825mFh.EZpvd(set4, ((java.lang.Float) obj).floatValue()));
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                                }
                                                composerStartRestartGroup.endReplaceableGroup();
                                                float f19 = f11;
                                                float fFloatValue7 = ((java.lang.Number) EZpvd(java.lang.Float.valueOf(fKWHzl), java.lang.Float.valueOf(0.0f), (Function1) objRememberedValue9)).floatValue();
                                                float fKWHzl2 = C56548yJl.KWHzl(copydefault(fFloatValue6 / fMax), 0.0f, 1.0f);
                                                composerStartRestartGroup.startReplaceableGroup(-842534324);
                                                zChangedInstance2 = composerStartRestartGroup.changedInstance(set4);
                                                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                                if (!zChangedInstance2 || objRememberedValue10 == companion.getEmpty()) {
                                                    objRememberedValue10 = new Function1() { // from class: o.mFl
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                                            return java.lang.Boolean.valueOf(C31825mFh.AEQbTJ(set4, ((java.lang.Float) obj).floatValue()));
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                                }
                                                composerStartRestartGroup.endReplaceableGroup();
                                                float fFloatValue8 = ((java.lang.Number) EZpvd(java.lang.Float.valueOf(fKWHzl2), java.lang.Float.valueOf(0.0f), (Function1) objRememberedValue10)).floatValue();
                                                CornerBasedShape cornerBasedShapeCopy = cornerBasedShape3.copy(CornerSizeKt.CornerSize(MathHelpersKt.lerp(fFloatValue5, 0.0f, fFloatValue8)), CornerSizeKt.CornerSize(MathHelpersKt.lerp(fFloatValue3, 0.0f, fFloatValue7)), CornerSizeKt.CornerSize(MathHelpersKt.lerp(fFloatValue2, 0.0f, fFloatValue7)), CornerSizeKt.CornerSize(MathHelpersKt.lerp(fFloatValue4, 0.0f, fFloatValue8)));
                                                fValueOf = java.lang.Float.valueOf(density.mo516toPx0680j_4(f9));
                                                if (fValueOf.floatValue() <= 0.0f) {
                                                    fValueOf = null;
                                                }
                                                float fFloatValue9 = fValueOf == null ? fValueOf.floatValue() : 75.0f;
                                                if (!z12) {
                                                    RevealDirection revealDirection = RevealDirection.StartToEnd;
                                                    if ((!set4.contains(revealDirection) || set4.contains(RevealDirection.EndToStart)) && (!set4.contains(RevealDirection.EndToStart) || set4.contains(revealDirection))) {
                                                        f13 = f19;
                                                    } else {
                                                        f13 = f19;
                                                        java.lang.Float fValueOf2 = java.lang.Float.valueOf(density.mo516toPx0680j_4(f13));
                                                        if (fValueOf2.floatValue() <= 0.0f) {
                                                            fValueOf2 = null;
                                                        }
                                                        if (fValueOf2 != null) {
                                                            fFloatValue = fValueOf2.floatValue();
                                                        }
                                                        float fTransform = easing5.transform(C56548yJl.KWHzl(java.lang.Math.abs(fFloatValue6) / java.lang.Math.abs(fFloatValue9), 0.0f, 1.0f));
                                                        long jM3148copywmQWz5c$default = (0.0f <= fTransform || fTransform > 1.0f || !z8) ? j10 : Color.m3148copywmQWz5c$default(j10, fTransform, 0.0f, 0.0f, 0.0f, 14, null);
                                                        long jM3148copywmQWz5c$default2 = (0.0f <= fTransform || fTransform > 1.0f || !z8) ? j8 : Color.m3148copywmQWz5c$default(j8, fTransform, 0.0f, 0.0f, 0.0f, 14, null);
                                                        iEZpvd = yII.EZpvd(copydefault(fFloatValue6));
                                                        composerStartRestartGroup.startReplaceableGroup(-842448215);
                                                        if (iEZpvd == 0) {
                                                            boxScopeInstance = boxScopeInstance2;
                                                            modifier10 = modifier9;
                                                            f14 = f13;
                                                            CardKt.m1212CardFjzlyU(boxScopeInstance.matchParentSize(modifier10), cornerBasedShape3, Color.Companion.m3184getTransparent0d7_KjU(), j9, null, f10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1724675471, true, new ActionBar(fTransform, set4, z10, fFloatValue, iEZpvd, jM3148copywmQWz5c$default2, function024, yhoDbNXlk, jM3148copywmQWz5c$default, function025, yhoEZpvd)), composerStartRestartGroup, ((i35 >> 6) & 7168) | ((i45 >> 6) & WalletImportError.ERROR_CODE_AA_EXIST) | 1573248 | ((i35 << 9) & 458752), 16);
                                                        } else {
                                                            boxScopeInstance = boxScopeInstance2;
                                                            modifier10 = modifier9;
                                                            f14 = f13;
                                                        }
                                                        composerStartRestartGroup.endReplaceableGroup();
                                                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3139boximpl(jM3159unboximpl))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1545365777, true, new Activity(modifier8, iEZpvd, z7, fFloatValue9, fFloatValue, f12, set4, function014, function011, swipeableState4, str3, function027, str5, function026, function07, z11, function016, boxScopeInstance, yht, cornerBasedShapeCopy, fTransform, mutableState)), composerStartRestartGroup, 48);
                                                        composerStartRestartGroup.endReplaceableGroup();
                                                        composerStartRestartGroup.endNode();
                                                        composerStartRestartGroup.endReplaceableGroup();
                                                        composerStartRestartGroup.endReplaceableGroup();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        z19 = z11;
                                                        function017 = function011;
                                                        function018 = function014;
                                                        modifier11 = modifier8;
                                                        easing4 = easing5;
                                                        function019 = function07;
                                                        function020 = function026;
                                                        str6 = str3;
                                                        function021 = function027;
                                                        f15 = f12;
                                                        z20 = z10;
                                                        j11 = jM3159unboximpl;
                                                        yho3 = yhoEZpvd;
                                                        yho4 = yhoDbNXlk;
                                                        z21 = z7;
                                                        f16 = f9;
                                                        set5 = set4;
                                                        z22 = z12;
                                                        swipeableState3 = swipeableState4;
                                                        z23 = z30;
                                                        f17 = f14;
                                                        cornerBasedShape4 = cornerBasedShape3;
                                                        f18 = f10;
                                                        str7 = str5;
                                                        modifier12 = modifier10;
                                                        z24 = z8;
                                                        coroutineScope5 = coroutineScope6;
                                                        j12 = j8;
                                                        j13 = j10;
                                                        j14 = j9;
                                                    }
                                                    fFloatValue = fFloatValue9;
                                                    float fTransform2 = easing5.transform(C56548yJl.KWHzl(java.lang.Math.abs(fFloatValue6) / java.lang.Math.abs(fFloatValue9), 0.0f, 1.0f));
                                                    if (0.0f <= fTransform2) {
                                                        if (0.0f <= fTransform2) {
                                                            iEZpvd = yII.EZpvd(copydefault(fFloatValue6));
                                                            composerStartRestartGroup.startReplaceableGroup(-842448215);
                                                            if (iEZpvd == 0) {
                                                            }
                                                            composerStartRestartGroup.endReplaceableGroup();
                                                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3139boximpl(jM3159unboximpl))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1545365777, true, new Activity(modifier8, iEZpvd, z7, fFloatValue9, fFloatValue, f12, set4, function014, function011, swipeableState4, str3, function027, str5, function026, function07, z11, function016, boxScopeInstance, yht, cornerBasedShapeCopy, fTransform2, mutableState)), composerStartRestartGroup, 48);
                                                            composerStartRestartGroup.endReplaceableGroup();
                                                            composerStartRestartGroup.endNode();
                                                            composerStartRestartGroup.endReplaceableGroup();
                                                            composerStartRestartGroup.endReplaceableGroup();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            z19 = z11;
                                                            function017 = function011;
                                                            function018 = function014;
                                                            modifier11 = modifier8;
                                                            easing4 = easing5;
                                                            function019 = function07;
                                                            function020 = function026;
                                                            str6 = str3;
                                                            function021 = function027;
                                                            f15 = f12;
                                                            z20 = z10;
                                                            j11 = jM3159unboximpl;
                                                            yho3 = yhoEZpvd;
                                                            yho4 = yhoDbNXlk;
                                                            z21 = z7;
                                                            f16 = f9;
                                                            set5 = set4;
                                                            z22 = z12;
                                                            swipeableState3 = swipeableState4;
                                                            z23 = z30;
                                                            f17 = f14;
                                                            cornerBasedShape4 = cornerBasedShape3;
                                                            f18 = f10;
                                                            str7 = str5;
                                                            modifier12 = modifier10;
                                                            z24 = z8;
                                                            coroutineScope5 = coroutineScope6;
                                                            j12 = j8;
                                                            j13 = j10;
                                                            j14 = j9;
                                                        }
                                                    }
                                                }
                                            } else {
                                                function016 = function015;
                                            }
                                            z15 = true;
                                            Easing easing52 = easing3;
                                            if ((i6 & 29360128) == 8388608) {
                                            }
                                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                            if (z15 | zChanged2 | z16) {
                                                objRememberedValue2 = new Function0() { // from class: o.mFj
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final java.lang.Object invoke() {
                                                        return java.lang.Boolean.valueOf(C31825mFh.OLrzqt(swipeableState2, z13, coroutineScope4, function013));
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                Function0 function0242 = (Function0) objRememberedValue2;
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.startReplaceableGroup(-1687396844);
                                                zChanged3 = composerStartRestartGroup.changed(coroutineScope4);
                                                if (i37 <= 8388608) {
                                                    if ((i6 & 1879048192) == 536870912) {
                                                    }
                                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                    if (z18 | z17 | zChanged3) {
                                                        objRememberedValue3 = new Function0() { // from class: o.mFo
                                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final java.lang.Object invoke() {
                                                                return java.lang.Boolean.valueOf(C31825mFh.KWHzl(swipeableState2, z13, coroutineScope4, function012));
                                                            }
                                                        };
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                                        Function0 function0252 = (Function0) objRememberedValue3;
                                                        composerStartRestartGroup.endReplaceableGroup();
                                                        composerStartRestartGroup.startReplaceableGroup(733328855);
                                                        Modifier.Companion companion22 = Modifier.Companion;
                                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composerStartRestartGroup, 0);
                                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                        ComposeUiNode.Companion companion32 = ComposeUiNode.Companion;
                                                        CoroutineScope coroutineScope62 = coroutineScope4;
                                                        Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                                                        yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion22);
                                                        boolean z302 = z13;
                                                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                                        }
                                                        composerStartRestartGroup.startReusableNode();
                                                        if (!composerStartRestartGroup.getInserting()) {
                                                        }
                                                        composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                                                        Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                                                        Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                                                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                                        if (!composerM2783constructorimpl.getInserting()) {
                                                            composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                                            composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                                                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                                            composerStartRestartGroup.startReplaceableGroup(-842580064);
                                                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                            companion = Composer.Companion;
                                                            if (objRememberedValue4 != companion.getEmpty()) {
                                                            }
                                                            mutableState = (MutableState) objRememberedValue4;
                                                            composerStartRestartGroup.endReplaceableGroup();
                                                            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                                            long jOLrzqt5 = OLrzqt(mutableState);
                                                            Function0<java.lang.Boolean> function0262 = function012;
                                                            composerStartRestartGroup.startReplaceableGroup(-842576007);
                                                            zChanged4 = composerStartRestartGroup.changed(jOLrzqt5);
                                                            zChanged5 = composerStartRestartGroup.changed(density);
                                                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                                            if (!(zChanged4 | zChanged5)) {
                                                                objRememberedValue5 = java.lang.Float.valueOf(cornerBasedShape3.getBottomEnd().mo915toPxTmRCtEA(OLrzqt(mutableState), density));
                                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                                                float fFloatValue22 = ((java.lang.Number) objRememberedValue5).floatValue();
                                                                composerStartRestartGroup.endReplaceableGroup();
                                                                long jOLrzqt22 = OLrzqt(mutableState);
                                                                Function0<java.lang.Boolean> function0272 = function013;
                                                                composerStartRestartGroup.startReplaceableGroup(-842569738);
                                                                zChanged6 = composerStartRestartGroup.changed(jOLrzqt22);
                                                                zChanged7 = composerStartRestartGroup.changed(density);
                                                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                                                if (!(zChanged6 | zChanged7)) {
                                                                    objRememberedValue6 = java.lang.Float.valueOf(cornerBasedShape3.getTopEnd().mo915toPxTmRCtEA(OLrzqt(mutableState), density));
                                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                                                    float fFloatValue32 = ((java.lang.Number) objRememberedValue6).floatValue();
                                                                    composerStartRestartGroup.endReplaceableGroup();
                                                                    long jOLrzqt32 = OLrzqt(mutableState);
                                                                    composerStartRestartGroup.startReplaceableGroup(-842563365);
                                                                    zChanged8 = composerStartRestartGroup.changed(jOLrzqt32);
                                                                    zChanged9 = composerStartRestartGroup.changed(density);
                                                                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                                                    if (!(zChanged8 | zChanged9)) {
                                                                        objRememberedValue7 = java.lang.Float.valueOf(cornerBasedShape3.getBottomStart().mo915toPxTmRCtEA(OLrzqt(mutableState), density));
                                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                                                        float fFloatValue42 = ((java.lang.Number) objRememberedValue7).floatValue();
                                                                        composerStartRestartGroup.endReplaceableGroup();
                                                                        long jOLrzqt42 = OLrzqt(mutableState);
                                                                        composerStartRestartGroup.startReplaceableGroup(-842556968);
                                                                        zChanged10 = composerStartRestartGroup.changed(jOLrzqt42);
                                                                        zChanged11 = composerStartRestartGroup.changed(density);
                                                                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                                                        if (!(zChanged10 | zChanged11)) {
                                                                            objRememberedValue8 = java.lang.Float.valueOf(cornerBasedShape3.getTopStart().mo915toPxTmRCtEA(OLrzqt(mutableState), density));
                                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                                                            float fFloatValue52 = ((java.lang.Number) objRememberedValue8).floatValue();
                                                                            composerStartRestartGroup.endReplaceableGroup();
                                                                            float fMax2 = java.lang.Math.max(fFloatValue32, fFloatValue22);
                                                                            float fFloatValue62 = swipeableState2.getOffset().getValue().floatValue();
                                                                            SwipeableState<RevealValue> swipeableState42 = swipeableState2;
                                                                            float fKWHzl3 = C56548yJl.KWHzl(copydefault((-fFloatValue62) / fMax2), 0.0f, 1.0f);
                                                                            composerStartRestartGroup.startReplaceableGroup(-842542260);
                                                                            zChangedInstance = composerStartRestartGroup.changedInstance(set4);
                                                                            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                                                            if (!zChangedInstance) {
                                                                                objRememberedValue9 = new Function1() { // from class: o.mFn
                                                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                                                                        return java.lang.Boolean.valueOf(C31825mFh.EZpvd(set4, ((java.lang.Float) obj).floatValue()));
                                                                                    }
                                                                                };
                                                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                                                                composerStartRestartGroup.endReplaceableGroup();
                                                                                float f192 = f11;
                                                                                float fFloatValue72 = ((java.lang.Number) EZpvd(java.lang.Float.valueOf(fKWHzl3), java.lang.Float.valueOf(0.0f), (Function1) objRememberedValue9)).floatValue();
                                                                                float fKWHzl22 = C56548yJl.KWHzl(copydefault(fFloatValue62 / fMax2), 0.0f, 1.0f);
                                                                                composerStartRestartGroup.startReplaceableGroup(-842534324);
                                                                                zChangedInstance2 = composerStartRestartGroup.changedInstance(set4);
                                                                                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                                                                if (!zChangedInstance2) {
                                                                                    objRememberedValue10 = new Function1() { // from class: o.mFl
                                                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                                                                            return java.lang.Boolean.valueOf(C31825mFh.AEQbTJ(set4, ((java.lang.Float) obj).floatValue()));
                                                                                        }
                                                                                    };
                                                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                                                                    composerStartRestartGroup.endReplaceableGroup();
                                                                                    float fFloatValue82 = ((java.lang.Number) EZpvd(java.lang.Float.valueOf(fKWHzl22), java.lang.Float.valueOf(0.0f), (Function1) objRememberedValue10)).floatValue();
                                                                                    CornerBasedShape cornerBasedShapeCopy2 = cornerBasedShape3.copy(CornerSizeKt.CornerSize(MathHelpersKt.lerp(fFloatValue52, 0.0f, fFloatValue82)), CornerSizeKt.CornerSize(MathHelpersKt.lerp(fFloatValue32, 0.0f, fFloatValue72)), CornerSizeKt.CornerSize(MathHelpersKt.lerp(fFloatValue22, 0.0f, fFloatValue72)), CornerSizeKt.CornerSize(MathHelpersKt.lerp(fFloatValue42, 0.0f, fFloatValue82)));
                                                                                    fValueOf = java.lang.Float.valueOf(density.mo516toPx0680j_4(f9));
                                                                                    if (fValueOf.floatValue() <= 0.0f) {
                                                                                    }
                                                                                    if (fValueOf == null) {
                                                                                    }
                                                                                    if (!z12) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if ((i6 & 1879048192) == 536870912) {
                                                    }
                                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                    if (z18 | z17 | zChanged3) {
                                                    }
                                                }
                                            }
                                        } else {
                                            modifier9 = modifier6;
                                        }
                                        z14 = true;
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (zChanged | z14) {
                                            objRememberedValue = new Function0() { // from class: o.mFg
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Object invoke() {
                                                    return C31825mFh.KWHzl(swipeableState2, coroutineScope4);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            function015 = (Function0) objRememberedValue;
                                            composerStartRestartGroup.endReplaceableGroup();
                                            composerStartRestartGroup.startReplaceableGroup(-1687409996);
                                            zChanged2 = composerStartRestartGroup.changed(coroutineScope4);
                                            if (i37 > 8388608) {
                                                function016 = function015;
                                                if ((i35 & 12582912) != 8388608) {
                                                    z15 = true;
                                                }
                                                Easing easing522 = easing3;
                                                if ((i6 & 29360128) == 8388608) {
                                                }
                                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                if (z15 | zChanged2 | z16) {
                                                }
                                            }
                                        }
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        modifier11 = modifier;
                                        z21 = z;
                                        z20 = z2;
                                        function018 = function0;
                                        function017 = function02;
                                        function019 = function03;
                                        function021 = function04;
                                        str7 = str2;
                                        function020 = function05;
                                        z19 = z3;
                                        z23 = z4;
                                        z24 = z5;
                                        cornerBasedShape4 = cornerBasedShape;
                                        easing4 = easing;
                                        f16 = f;
                                        f17 = f2;
                                        z22 = z6;
                                        f15 = f3;
                                        j11 = j;
                                        modifier12 = modifier2;
                                        f18 = f4;
                                        j12 = j2;
                                        j13 = j3;
                                        j14 = j4;
                                        coroutineScope5 = coroutineScope;
                                        swipeableState3 = swipeableState;
                                        yho3 = yho;
                                        yho4 = yho2;
                                        set5 = set2;
                                        str6 = str;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        final Easing easing6 = easing4;
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.mFm
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                                return C31825mFh.OLrzqt(modifier11, z21, z20, function018, function017, function019, str6, function021, str7, function020, z19, z23, z24, cornerBasedShape4, easing6, f16, f17, z22, f15, set5, j11, modifier12, f18, j12, j13, j14, coroutineScope5, swipeableState3, yho3, yho4, yht, i, i2, i3, i4, i5, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i43 |= MLKEMEngine.KyberPolyBytes;
                                if ((i3 & 3072) != 0) {
                                }
                                if ((i3 & 24576) == 0) {
                                }
                                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                }
                                if ((i3 & 1572864) == 0) {
                                }
                                if ((i3 & 12582912) == 0) {
                                }
                                i32 = i5 & 268435456;
                                if (i32 == 0) {
                                }
                                i33 = i5 & 536870912;
                                if (i33 == 0) {
                                }
                                if ((i5 & 1073741824) == 0) {
                                }
                                if ((i6 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0) {
                                        if (i38 == 0) {
                                        }
                                        if (i39 == 0) {
                                        }
                                        if (i7 == 0) {
                                        }
                                        if (i8 == 0) {
                                        }
                                        if (i9 == 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if (i11 == 0) {
                                        }
                                        if (i31 == 0) {
                                        }
                                        if (i27 == 0) {
                                        }
                                        if (i28 == 0) {
                                        }
                                        if (i15 == 0) {
                                        }
                                        if (i18 == 0) {
                                        }
                                        if (i20 == 0) {
                                        }
                                        Function0<java.lang.Boolean> function0232 = function010;
                                        if ((i5 & 8192) == 0) {
                                        }
                                        if (i22 == 0) {
                                        }
                                        if (i23 == 0) {
                                        }
                                        if ((i5 & 65536) == 0) {
                                        }
                                        if (i24 == 0) {
                                        }
                                        if (i25 == 0) {
                                        }
                                        if (i26 == 0) {
                                        }
                                        if ((i5 & 1048576) == 0) {
                                        }
                                        if ((2097152 & i5) == 0) {
                                        }
                                        if (i30 == 0) {
                                        }
                                        if ((i5 & 8388608) == 0) {
                                        }
                                        if ((i5 & 16777216) == 0) {
                                        }
                                        if ((i5 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
                                        }
                                        if ((i5 & 67108864) == 0) {
                                        }
                                        if ((134217728 & i5) == 0) {
                                        }
                                        if (i32 == 0) {
                                        }
                                        z11 = z9;
                                        f9 = f6;
                                        str5 = str4;
                                        easing3 = easing2;
                                        set4 = set3;
                                        modifier6 = modifier5;
                                        f10 = f7;
                                        j8 = j5;
                                        j9 = j7;
                                        yhoEZpvd = i32 == 0 ? C31819mFb.OLrzqt.EZpvd() : yho;
                                        yhoDbNXlk = i33 == 0 ? C31819mFb.OLrzqt.DbNXlk() : yho2;
                                        i35 = i43;
                                        z12 = z29;
                                        function011 = function022;
                                        f11 = f8;
                                        modifier7 = modifier3;
                                        function012 = function0232;
                                        coroutineScope4 = coroutineScope3;
                                        swipeableState2 = swipeableStateEZpvd;
                                        f12 = fM5414constructorimpl3;
                                        i36 = i41;
                                        z13 = z28;
                                        function013 = function09;
                                        cornerBasedShape3 = cornerBasedShape2;
                                        j10 = j6;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        composerStartRestartGroup.startReplaceableGroup(-1687418407);
                                        zChanged = composerStartRestartGroup.changed(coroutineScope4);
                                        i37 = (i35 & 29360128) ^ 12582912;
                                        int i452 = i36;
                                        if (i37 > 8388608) {
                                            modifier9 = modifier6;
                                            if ((i35 & 12582912) != 8388608) {
                                                z14 = true;
                                            }
                                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (zChanged | z14) {
                                            }
                                        }
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i23 = i5 & 32768;
                            if (i23 != 0) {
                            }
                            if ((i2 & 1572864) == 0) {
                            }
                            i24 = i5 & 131072;
                            if (i24 != 0) {
                            }
                            i25 = i5 & 262144;
                            if (i25 != 0) {
                            }
                            i26 = i5 & 524288;
                            if (i26 != 0) {
                            }
                            if ((i3 & 6) == 0) {
                            }
                            if ((i3 & 48) == 0) {
                            }
                            int i432 = i29;
                            i30 = i5 & 4194304;
                            if (i30 == 0) {
                            }
                            if ((i3 & 3072) != 0) {
                            }
                            if ((i3 & 24576) == 0) {
                            }
                            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            }
                            if ((i3 & 1572864) == 0) {
                            }
                            if ((i3 & 12582912) == 0) {
                            }
                            i32 = i5 & 268435456;
                            if (i32 == 0) {
                            }
                            i33 = i5 & 536870912;
                            if (i33 == 0) {
                            }
                            if ((i5 & 1073741824) == 0) {
                            }
                            if ((i6 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        if ((i2 & 3072) == 0) {
                        }
                        i21 = i5 & 16384;
                        if (i21 == 0) {
                        }
                        i23 = i5 & 32768;
                        if (i23 != 0) {
                        }
                        if ((i2 & 1572864) == 0) {
                        }
                        i24 = i5 & 131072;
                        if (i24 != 0) {
                        }
                        i25 = i5 & 262144;
                        if (i25 != 0) {
                        }
                        i26 = i5 & 524288;
                        if (i26 != 0) {
                        }
                        if ((i3 & 6) == 0) {
                        }
                        if ((i3 & 48) == 0) {
                        }
                        int i4322 = i29;
                        i30 = i5 & 4194304;
                        if (i30 == 0) {
                        }
                        if ((i3 & 3072) != 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        }
                        if ((i3 & 1572864) == 0) {
                        }
                        if ((i3 & 12582912) == 0) {
                        }
                        i32 = i5 & 268435456;
                        if (i32 == 0) {
                        }
                        i33 = i5 & 536870912;
                        if (i33 == 0) {
                        }
                        if ((i5 & 1073741824) == 0) {
                        }
                        if ((i6 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i5 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i5 & 1024;
                    if (i15 != 0) {
                    }
                    i17 = i5 & 2048;
                    if (i17 != 0) {
                    }
                    int i412 = i16;
                    i19 = i5 & 4096;
                    if (i19 != 0) {
                    }
                    if ((i2 & 3072) == 0) {
                    }
                    i21 = i5 & 16384;
                    if (i21 == 0) {
                    }
                    i23 = i5 & 32768;
                    if (i23 != 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    i24 = i5 & 131072;
                    if (i24 != 0) {
                    }
                    i25 = i5 & 262144;
                    if (i25 != 0) {
                    }
                    i26 = i5 & 524288;
                    if (i26 != 0) {
                    }
                    if ((i3 & 6) == 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    int i43222 = i29;
                    i30 = i5 & 4194304;
                    if (i30 == 0) {
                    }
                    if ((i3 & 3072) != 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    if ((i3 & 1572864) == 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    i32 = i5 & 268435456;
                    if (i32 == 0) {
                    }
                    i33 = i5 & 536870912;
                    if (i33 == 0) {
                    }
                    if ((i5 & 1073741824) == 0) {
                    }
                    if ((i6 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i9 = i5 & 16;
                int i402 = 8192;
                if (i9 == 0) {
                }
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                }
                i13 = i5 & 256;
                if (i13 != 0) {
                }
                i14 = i5 & 512;
                if (i14 != 0) {
                }
                i15 = i5 & 1024;
                if (i15 != 0) {
                }
                i17 = i5 & 2048;
                if (i17 != 0) {
                }
                int i4122 = i16;
                i19 = i5 & 4096;
                if (i19 != 0) {
                }
                if ((i2 & 3072) == 0) {
                }
                i21 = i5 & 16384;
                if (i21 == 0) {
                }
                i23 = i5 & 32768;
                if (i23 != 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                i24 = i5 & 131072;
                if (i24 != 0) {
                }
                i25 = i5 & 262144;
                if (i25 != 0) {
                }
                i26 = i5 & 524288;
                if (i26 != 0) {
                }
                if ((i3 & 6) == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i432222 = i29;
                i30 = i5 & 4194304;
                if (i30 == 0) {
                }
                if ((i3 & 3072) != 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i3 & 1572864) == 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                i32 = i5 & 268435456;
                if (i32 == 0) {
                }
                i33 = i5 & 536870912;
                if (i33 == 0) {
                }
                if ((i5 & 1073741824) == 0) {
                }
                if ((i6 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            i9 = i5 & 16;
            int i4022 = 8192;
            if (i9 == 0) {
            }
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            i12 = i5 & 128;
            if (i12 != 0) {
            }
            i13 = i5 & 256;
            if (i13 != 0) {
            }
            i14 = i5 & 512;
            if (i14 != 0) {
            }
            i15 = i5 & 1024;
            if (i15 != 0) {
            }
            i17 = i5 & 2048;
            if (i17 != 0) {
            }
            int i41222 = i16;
            i19 = i5 & 4096;
            if (i19 != 0) {
            }
            if ((i2 & 3072) == 0) {
            }
            i21 = i5 & 16384;
            if (i21 == 0) {
            }
            i23 = i5 & 32768;
            if (i23 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i24 = i5 & 131072;
            if (i24 != 0) {
            }
            i25 = i5 & 262144;
            if (i25 != 0) {
            }
            i26 = i5 & 524288;
            if (i26 != 0) {
            }
            if ((i3 & 6) == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i4322222 = i29;
            i30 = i5 & 4194304;
            if (i30 == 0) {
            }
            if ((i3 & 3072) != 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            i32 = i5 & 268435456;
            if (i32 == 0) {
            }
            i33 = i5 & 536870912;
            if (i33 == 0) {
            }
            if ((i5 & 1073741824) == 0) {
            }
            if ((i6 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        i9 = i5 & 16;
        int i40222 = 8192;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        i12 = i5 & 128;
        if (i12 != 0) {
        }
        i13 = i5 & 256;
        if (i13 != 0) {
        }
        i14 = i5 & 512;
        if (i14 != 0) {
        }
        i15 = i5 & 1024;
        if (i15 != 0) {
        }
        i17 = i5 & 2048;
        if (i17 != 0) {
        }
        int i412222 = i16;
        i19 = i5 & 4096;
        if (i19 != 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        i21 = i5 & 16384;
        if (i21 == 0) {
        }
        i23 = i5 & 32768;
        if (i23 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i24 = i5 & 131072;
        if (i24 != 0) {
        }
        i25 = i5 & 262144;
        if (i25 != 0) {
        }
        i26 = i5 & 524288;
        if (i26 != 0) {
        }
        if ((i3 & 6) == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i43222222 = i29;
        i30 = i5 & 4194304;
        if (i30 == 0) {
        }
        if ((i3 & 3072) != 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if ((i3 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        i32 = i5 & 268435456;
        if (i32 == 0) {
        }
        i33 = i5 & 536870912;
        if (i33 == 0) {
        }
        if ((i5 & 1073741824) == 0) {
        }
        if ((i6 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final Unit KWHzl(SwipeableState swipeableState, CoroutineScope coroutineScope) {
        if (swipeableState.getTargetValue() != RevealValue.Default) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new RevealSwipeKt$RevealSwipe$closeOnContentClickHandler$1$1$1(swipeableState, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final boolean OLrzqt(SwipeableState swipeableState, boolean z, CoroutineScope coroutineScope, Function0 function0) {
        if ((swipeableState.getTargetValue() == RevealValue.FullyRevealedEnd || swipeableState.getTargetValue() == RevealValue.PartiallyRevealedEnd) && z) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new RevealSwipeKt$RevealSwipe$backgroundStartClick$1$1$1(swipeableState, null), 3, null);
        }
        return ((java.lang.Boolean) function0.invoke()).booleanValue();
    }

    public static final boolean KWHzl(SwipeableState swipeableState, boolean z, CoroutineScope coroutineScope, Function0 function0) {
        if ((swipeableState.getTargetValue() == RevealValue.FullyRevealedStart || swipeableState.getTargetValue() == RevealValue.PartiallyRevealedStart) && z) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new RevealSwipeKt$RevealSwipe$backgroundEndClick$1$1$1(swipeableState, null), 3, null);
        }
        return ((java.lang.Boolean) function0.invoke()).booleanValue();
    }

    public static final void KWHzl(MutableState<androidx.compose.ui.geometry.Size> mutableState, long j) {
        mutableState.setValue(androidx.compose.ui.geometry.Size.m2967boximpl(j));
    }

    public static final boolean EZpvd(java.util.Set set, float f) {
        return !set.contains(RevealDirection.EndToStart);
    }

    public static final boolean AEQbTJ(java.util.Set set, float f) {
        return !set.contains(RevealDirection.StartToEnd);
    }

    /* JADX INFO: renamed from: o.mFh$ActionBar */
    public static final class ActionBar implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ Function0<java.lang.Boolean> AEQbTJ;
        public final /* synthetic */ boolean AYXKKw;
        public final /* synthetic */ java.util.Set<RevealDirection> AhwBna;
        public final /* synthetic */ int DbNXlk;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ float KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ Function0<java.lang.Boolean> copydefault;
        public final /* synthetic */ yHO<RowScope, Composer, java.lang.Integer, Unit> djBIcL;
        public final /* synthetic */ yHO<RowScope, Composer, java.lang.Integer, Unit> gEmmrt;
        public final /* synthetic */ float valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: o.yHO<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Set<? extends com.okinc.cruilib.compose.library.revealswipe.RevealDirection> */
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.yHO<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(float f, java.util.Set<? extends RevealDirection> set, boolean z, float f2, int i, long j, Function0<java.lang.Boolean> function0, yHO<? super RowScope, ? super Composer, ? super java.lang.Integer, Unit> yho, long j2, Function0<java.lang.Boolean> function02, yHO<? super RowScope, ? super Composer, ? super java.lang.Integer, Unit> yho2) {
            this.KWHzl = f;
            this.AhwBna = set;
            this.AYXKKw = z;
            this.valueOf = f2;
            this.DbNXlk = i;
            this.OLrzqt = j;
            this.AEQbTJ = function0;
            this.gEmmrt = yho;
            this.EZpvd = j2;
            this.copydefault = function02;
            this.djBIcL = yho2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            AEQbTJ(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Composer composer, int i) {
            Function0<java.lang.Boolean> function0;
            Modifier modifierOffset;
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1724675471, i, -1, "com.okinc.cruilib.compose.library.revealswipe.RevealSwipe.<anonymous>.<anonymous> (RevealSwipe.kt:260)");
                }
                Modifier modifierOffset2 = Modifier.Companion;
                Modifier modifierAlpha = AlphaKt.alpha(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifierOffset2, 0.0f, 1, null), this.KWHzl);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Horizontal end = arrangement.getEnd();
                Alignment.Companion companion = Alignment.Companion;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                java.util.Set<RevealDirection> set = this.AhwBna;
                boolean z = this.AYXKKw;
                final float f = this.valueOf;
                final int i2 = this.DbNXlk;
                long j = this.OLrzqt;
                final Function0<java.lang.Boolean> function02 = this.AEQbTJ;
                yHO<RowScope, Composer, java.lang.Integer, Unit> yho = this.gEmmrt;
                long jM3184getTransparent0d7_KjU = j;
                long j2 = this.EZpvd;
                Function0<java.lang.Boolean> function03 = this.copydefault;
                yHO<RowScope, Composer, java.lang.Integer, Unit> yho2 = this.djBIcL;
                composer.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlpha);
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
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer.startReplaceableGroup(-41118818);
                RevealDirection revealDirection = RevealDirection.StartToEnd;
                if (set.contains(revealDirection)) {
                    function0 = function03;
                    Modifier modifierFillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifierOffset2, 0.5f), 0.0f, 1, null);
                    composer.startReplaceableGroup(-41110010);
                    if (z && set.contains(revealDirection)) {
                        composer.startReplaceableGroup(-41103415);
                        boolean zChanged = composer.changed(f);
                        boolean zChanged2 = composer.changed(i2);
                        java.lang.Object objRememberedValue = composer.rememberedValue();
                        if ((zChanged | zChanged2) || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: o.mFq
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C31825mFh.ActionBar.AEQbTJ(f, i2, (Density) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceableGroup();
                        modifierOffset = OffsetKt.offset(modifierOffset2, (Function1) objRememberedValue);
                    } else {
                        modifierOffset = modifierOffset2;
                    }
                    composer.endReplaceableGroup();
                    Modifier modifierThen = modifierFillMaxHeight$default.then(modifierOffset);
                    if (!set.contains(revealDirection)) {
                        jM3184getTransparent0d7_KjU = Color.Companion.m3184getTransparent0d7_KjU();
                    }
                    Modifier modifierM350backgroundbw27NRU$default = BackgroundKt.m350backgroundbw27NRU$default(modifierThen, jM3184getTransparent0d7_KjU, null, 2, null);
                    composer.startReplaceableGroup(-41070929);
                    boolean zChanged3 = composer.changed(function02);
                    java.lang.Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: o.mFs
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C31825mFh.ActionBar.AEQbTJ(function02);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    Modifier modifierM383clickableXHw0xAI$default = ClickableKt.m383clickableXHw0xAI$default(modifierM350backgroundbw27NRU$default, false, null, null, (Function0) objRememberedValue2, 7, null);
                    Arrangement.Horizontal start = arrangement.getStart();
                    Alignment.Vertical centerVertically2 = companion.getCenterVertically();
                    composer.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(start, centerVertically2, composer, 54);
                    composer.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM383clickableXHw0xAI$default);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composer);
                    Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM2783constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                        composerM2783constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                    composer.startReplaceableGroup(2058660585);
                    yho.invoke(rowScopeInstance, composer, 6);
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                } else {
                    function0 = function03;
                }
                composer.endReplaceableGroup();
                Modifier modifierFillMaxHeight$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifierOffset2, 1.0f), 0.0f, 1, null);
                composer.startReplaceableGroup(-41053966);
                if (z && set.contains(RevealDirection.EndToStart)) {
                    composer.startReplaceableGroup(-41047731);
                    boolean zChanged4 = composer.changed(f);
                    boolean zChanged5 = composer.changed(i2);
                    java.lang.Object objRememberedValue3 = composer.rememberedValue();
                    if ((zChanged4 | zChanged5) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: o.mFr
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C31825mFh.ActionBar.EZpvd(f, i2, (Density) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceableGroup();
                    modifierOffset2 = OffsetKt.offset(modifierOffset2, (Function1) objRememberedValue3);
                }
                composer.endReplaceableGroup();
                Modifier modifierM350backgroundbw27NRU$default2 = BackgroundKt.m350backgroundbw27NRU$default(modifierFillMaxHeight$default2.then(modifierOffset2), set.contains(RevealDirection.EndToStart) ? j2 : Color.Companion.m3184getTransparent0d7_KjU(), null, 2, null);
                composer.startReplaceableGroup(-41017715);
                final Function0<java.lang.Boolean> function04 = function0;
                boolean zChanged6 = composer.changed(function04);
                java.lang.Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged6 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: o.mFp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C31825mFh.ActionBar.KWHzl(function04);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                Modifier modifierM383clickableXHw0xAI$default2 = ClickableKt.m383clickableXHw0xAI$default(modifierM350backgroundbw27NRU$default2, false, null, null, (Function0) objRememberedValue4, 7, null);
                Arrangement.Horizontal end2 = arrangement.getEnd();
                Alignment.Vertical centerVertically3 = companion.getCenterVertically();
                composer.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(end2, centerVertically3, composer, 54);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM383clickableXHw0xAI$default2);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                Composer composerM2783constructorimpl3 = Updater.m2783constructorimpl(composer);
                Updater.m2790setimpl(composerM2783constructorimpl3, measurePolicyRowMeasurePolicy3, companion2.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (composerM2783constructorimpl3.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM2783constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                    composerM2783constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                yhoModifierMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                yho2.invoke(rowScopeInstance, composer, 6);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
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

        public static final IntOffset AEQbTJ(float f, int i, Density density) {
            Intrinsics.checkNotNullParameter(density, "");
            return IntOffset.m5523boximpl(IntOffsetKt.IntOffset(java.lang.Math.min(i - yII.EZpvd(f), 0), 0));
        }

        public static final Unit AEQbTJ(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        public static final IntOffset EZpvd(float f, int i, Density density) {
            Intrinsics.checkNotNullParameter(density, "");
            return IntOffset.m5523boximpl(IntOffsetKt.IntOffset(java.lang.Math.max(yII.EZpvd(f) + i, 0), 0));
        }

        public static final Unit KWHzl(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.mFh$Activity */
    public static final class Activity implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ Function0<Unit> AYXKKw;
        public final /* synthetic */ float AhwBna;
        public final /* synthetic */ float AkhnZx;
        public final /* synthetic */ MutableState<androidx.compose.ui.geometry.Size> AuCTel;
        public final /* synthetic */ float DbNXlk;
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ float KWHzl;
        public final /* synthetic */ CornerBasedShape OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;
        public final /* synthetic */ boolean djBIcL;
        public final /* synthetic */ Function0<Unit> ejfBZ;
        public final /* synthetic */ Function0<Unit> fARcdN;
        public final /* synthetic */ Function0<Unit> fIwbmz;
        public final /* synthetic */ SwipeableState<RevealValue> fJNWhG;
        public final /* synthetic */ Function0<java.lang.Boolean> fetchVPNInfo;
        public final /* synthetic */ yHT<Shape, java.lang.Float, Composer, java.lang.Integer, Unit> gEmmrt;
        public final /* synthetic */ int getNewProxyInstance;
        public final /* synthetic */ Modifier isConnected;
        public final /* synthetic */ BoxScope uzCIH;
        public final /* synthetic */ java.util.Set<RevealDirection> valueOf;
        public final /* synthetic */ Function0<java.lang.Boolean> values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r21v0, resolved type: o.yHT<? super androidx.compose.ui.graphics.Shape, ? super java.lang.Float, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.Set<? extends com.okinc.cruilib.compose.library.revealswipe.RevealDirection> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(Modifier modifier, int i, boolean z, float f, float f2, float f3, java.util.Set<? extends RevealDirection> set, Function0<Unit> function0, Function0<Unit> function02, SwipeableState<RevealValue> swipeableState, java.lang.String str, Function0<java.lang.Boolean> function03, java.lang.String str2, Function0<java.lang.Boolean> function04, Function0<Unit> function05, boolean z2, Function0<Unit> function06, BoxScope boxScope, yHT<? super Shape, ? super java.lang.Float, ? super Composer, ? super java.lang.Integer, Unit> yht, CornerBasedShape cornerBasedShape, float f4, MutableState<androidx.compose.ui.geometry.Size> mutableState) {
            this.isConnected = modifier;
            this.getNewProxyInstance = i;
            this.djBIcL = z;
            this.AkhnZx = f;
            this.AhwBna = f2;
            this.DbNXlk = f3;
            this.valueOf = set;
            this.fIwbmz = function0;
            this.fARcdN = function02;
            this.fJNWhG = swipeableState;
            this.copydefault = str;
            this.fetchVPNInfo = function03;
            this.AEQbTJ = str2;
            this.values = function04;
            this.ejfBZ = function05;
            this.EZpvd = z2;
            this.AYXKKw = function06;
            this.uzCIH = boxScope;
            this.gEmmrt = yht;
            this.OLrzqt = cornerBasedShape;
            this.KWHzl = f4;
            this.AuCTel = mutableState;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            copydefault(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(Composer composer, int i) {
            Modifier modifierSemantics$default;
            Modifier modifierM381clickableO2vRcR0$default;
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1545365777, i, -1, "com.okinc.cruilib.compose.library.revealswipe.RevealSwipe.<anonymous>.<anonymous> (RevealSwipe.kt:340)");
                }
                Modifier modifier = this.isConnected;
                composer.startReplaceableGroup(1762523034);
                boolean zChanged = composer.changed(this.getNewProxyInstance);
                final int i2 = this.getNewProxyInstance;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.mFt
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C31825mFh.Activity.AEQbTJ(i2, (Density) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierOffset = OffsetKt.offset(modifier, (Function1) objRememberedValue);
                composer.startReplaceableGroup(1762531790);
                if (this.djBIcL) {
                    Modifier.Companion companion = Modifier.Companion;
                    float f = this.AkhnZx;
                    float f2 = this.AhwBna;
                    float f3 = this.DbNXlk;
                    java.util.Set<RevealDirection> set = this.valueOf;
                    composer.startReplaceableGroup(1762543257);
                    boolean zChanged2 = composer.changed(this.fIwbmz);
                    boolean zChanged3 = composer.changed(this.fARcdN);
                    final Function0<Unit> function0 = this.fIwbmz;
                    final Function0<Unit> function02 = this.fARcdN;
                    java.lang.Object objRememberedValue2 = composer.rememberedValue();
                    if ((zChanged2 | zChanged3) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: o.mFu
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C31825mFh.Activity.AEQbTJ(function0, function02, ((java.lang.Boolean) obj).booleanValue());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    Modifier modifierKWHzl = C31825mFh.KWHzl(companion, f, f2, f3, set, (Function1) objRememberedValue2, this.fJNWhG);
                    composer.startReplaceableGroup(1762557765);
                    boolean zChanged4 = composer.changed(this.copydefault);
                    boolean zChanged5 = composer.changed(this.fetchVPNInfo);
                    boolean zChanged6 = composer.changed(this.AEQbTJ);
                    boolean zChanged7 = composer.changed(this.values);
                    final java.lang.String str = this.copydefault;
                    final java.lang.String str2 = this.AEQbTJ;
                    final Function0<java.lang.Boolean> function03 = this.fetchVPNInfo;
                    final Function0<java.lang.Boolean> function04 = this.values;
                    java.lang.Object objRememberedValue3 = composer.rememberedValue();
                    if ((zChanged4 | zChanged5 | zChanged6 | zChanged7) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: o.mFx
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C31825mFh.Activity.OLrzqt(str, str2, function03, function04, (SemanticsPropertyReceiver) obj);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceableGroup();
                    modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierKWHzl, false, (Function1) objRememberedValue3, 1, null);
                } else {
                    modifierSemantics$default = Modifier.Companion;
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = modifierOffset.then(modifierSemantics$default);
                Function0<Unit> function05 = this.ejfBZ;
                if (function05 != null && !this.EZpvd) {
                    composer.startReplaceableGroup(-1194028631);
                    composer.endReplaceableGroup();
                    modifierM381clickableO2vRcR0$default = ClickableKt.m383clickableXHw0xAI$default(Modifier.Companion, false, null, null, this.ejfBZ, 7, null);
                } else if (function05 == null && this.EZpvd) {
                    composer.startReplaceableGroup(-1193801277);
                    Modifier.Companion companion2 = Modifier.Companion;
                    composer.startReplaceableGroup(1762616733);
                    java.lang.Object objRememberedValue4 = composer.rememberedValue();
                    if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    composer.endReplaceableGroup();
                    modifierM381clickableO2vRcR0$default = ClickableKt.m381clickableO2vRcR0$default(companion2, (MutableInteractionSource) objRememberedValue4, null, false, null, null, this.AYXKKw, 28, null);
                    composer.endReplaceableGroup();
                } else if (function05 != null) {
                    composer.startReplaceableGroup(-1193293776);
                    Modifier.Companion companion3 = Modifier.Companion;
                    composer.startReplaceableGroup(1762649317);
                    Indication indication = this.fJNWhG.getTargetValue() == RevealValue.Default ? (Indication) composer.consume(IndicationKt.getLocalIndication()) : null;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(1762653533);
                    java.lang.Object objRememberedValue5 = composer.rememberedValue();
                    Composer.Companion companion4 = Composer.Companion;
                    if (objRememberedValue5 == companion4.getEmpty()) {
                        objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue5);
                    }
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue5;
                    composer.endReplaceableGroup();
                    composer.startReplaceableGroup(1762631394);
                    boolean zChanged8 = composer.changed(this.fJNWhG);
                    boolean zChanged9 = composer.changed(this.AYXKKw);
                    boolean zChanged10 = composer.changed(this.ejfBZ);
                    final SwipeableState<RevealValue> swipeableState = this.fJNWhG;
                    final Function0<Unit> function06 = this.AYXKKw;
                    final Function0<Unit> function07 = this.ejfBZ;
                    java.lang.Object objRememberedValue6 = composer.rememberedValue();
                    if ((zChanged8 | zChanged9 | zChanged10) || objRememberedValue6 == companion4.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: o.mFy
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C31825mFh.Activity.KWHzl(swipeableState, function06, function07);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue6);
                    }
                    composer.endReplaceableGroup();
                    modifierM381clickableO2vRcR0$default = ClickableKt.m381clickableO2vRcR0$default(companion3, mutableInteractionSource, indication, false, null, null, (Function0) objRememberedValue6, 28, null);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-1192213364);
                    composer.endReplaceableGroup();
                    modifierM381clickableO2vRcR0$default = Modifier.Companion;
                }
                Modifier modifierThen2 = modifierThen.then(modifierM381clickableO2vRcR0$default);
                yHT<Shape, java.lang.Float, Composer, java.lang.Integer, Unit> yht = this.gEmmrt;
                CornerBasedShape cornerBasedShape = this.OLrzqt;
                float f4 = this.KWHzl;
                composer.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion5.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen2);
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
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, java.lang.Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                yht.invoke(cornerBasedShape, java.lang.Float.valueOf(f4), composer, 0);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                Modifier modifierMatchParentSize = this.uzCIH.matchParentSize(Modifier.Companion);
                final MutableState<androidx.compose.ui.geometry.Size> mutableState = this.AuCTel;
                BoxWithConstraintsKt.BoxWithConstraints(modifierMatchParentSize, null, false, ComposableLambdaKt.composableLambda(composer, -881750695, true, new yHO<BoxWithConstraintsScope, Composer, java.lang.Integer, Unit>() { // from class: o.mFh.Activity.5
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // o.yHO
                    public /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, java.lang.Integer num) {
                        EZpvd(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void EZpvd(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, int i3) {
                        Intrinsics.checkNotNullParameter(boxWithConstraintsScope, "");
                        if ((i3 & 6) == 0) {
                            i3 |= composer2.changed(boxWithConstraintsScope) ? 4 : 2;
                        }
                        if ((i3 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-881750695, i3, -1, "com.okinc.cruilib.compose.library.revealswipe.RevealSwipe.<anonymous>.<anonymous>.<anonymous> (RevealSwipe.kt:429)");
                        }
                        C31825mFh.KWHzl(mutableState, SizeKt.Size(Constraints.m5370getMaxWidthimpl(boxWithConstraintsScope.mo609getConstraintsmsEJaDk()), Constraints.m5369getMaxHeightimpl(boxWithConstraintsScope.mo609getConstraintsmsEJaDk())));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final IntOffset AEQbTJ(int i, Density density) {
            Intrinsics.checkNotNullParameter(density, "");
            return IntOffset.m5523boximpl(IntOffsetKt.IntOffset(i, 0));
        }

        public static final Unit AEQbTJ(Function0 function0, Function0 function02, boolean z) {
            if (z) {
                if (function0 != null) {
                    function0.invoke();
                }
            } else if (function02 != null) {
                function02.invoke();
            }
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, Function0 function0, Function0 function02, SemanticsPropertyReceiver semanticsPropertyReceiver) {
            Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            if (str != null) {
                listOLrzqt.add(new CustomAccessibilityAction(str, function0));
            }
            if (str2 != null) {
                listOLrzqt.add(new CustomAccessibilityAction(str2, function02));
            }
            SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, C56402yEa.fARcdN(listOLrzqt));
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(SwipeableState swipeableState, Function0 function0, Function0 function02) {
            if (swipeableState.getTargetValue() != RevealValue.Default) {
                function0.invoke();
            } else {
                function02.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.mFh$TaskDescription */
    public static final class TaskDescription implements yHO<Modifier, Composer, java.lang.Integer, Modifier> {
        public final /* synthetic */ float AEQbTJ;
        public final /* synthetic */ SwipeableState<RevealValue> AhwBna;
        public final /* synthetic */ float EZpvd;
        public final /* synthetic */ float KWHzl;
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> OLrzqt;
        public final /* synthetic */ java.util.Set<RevealDirection> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Set<? extends com.okinc.cruilib.compose.library.revealswipe.RevealDirection> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(java.util.Set<? extends RevealDirection> set, float f, float f2, Function1<? super java.lang.Boolean, Unit> function1, SwipeableState<RevealValue> swipeableState, float f3) {
            this.copydefault = set;
            this.KWHzl = f;
            this.EZpvd = f2;
            this.OLrzqt = function1;
            this.AhwBna = swipeableState;
            this.AEQbTJ = f3;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, java.lang.Integer num) {
            return KWHzl(modifier, composer, num.intValue());
        }

        public final Modifier KWHzl(Modifier modifier, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(modifier, "");
            composer.startReplaceableGroup(254559312);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(254559312, i, -1, "com.okinc.cruilib.compose.library.revealswipe.revealSwipable.<anonymous> (RevealSwipe.kt:444)");
            }
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            java.lang.Float fValueOf = java.lang.Float.valueOf(density.mo516toPx0680j_4(this.AEQbTJ));
            if (fValueOf.floatValue() <= 0.0f) {
                fValueOf = null;
            }
            float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 75.0f;
            final float fMo516toPx0680j_4 = density.mo516toPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(36));
            final float fMo516toPx0680j_42 = density.mo516toPx0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(250));
            java.util.Map mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt(java.lang.Float.valueOf(0.0f), RevealValue.Default));
            java.util.Set<RevealDirection> set = this.copydefault;
            RevealDirection revealDirection = RevealDirection.StartToEnd;
            if (set.contains(revealDirection)) {
                kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(java.lang.Float.valueOf(this.KWHzl), RevealValue.PartiallyRevealedEnd);
                mapDjBIcL.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                if (!mapDjBIcL.containsKey(java.lang.Float.valueOf(this.EZpvd))) {
                    kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(java.lang.Float.valueOf(this.EZpvd), RevealValue.FullyRevealedEnd);
                    mapDjBIcL.put(pairOLrzqt2.getFirst(), pairOLrzqt2.getSecond());
                }
            }
            java.util.Set<RevealDirection> set2 = this.copydefault;
            RevealDirection revealDirection2 = RevealDirection.EndToStart;
            if (set2.contains(revealDirection2)) {
                if (!mapDjBIcL.containsKey(java.lang.Float.valueOf(-this.KWHzl))) {
                    kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt(java.lang.Float.valueOf(-this.KWHzl), RevealValue.PartiallyRevealedStart);
                    mapDjBIcL.put(pairOLrzqt3.getFirst(), pairOLrzqt3.getSecond());
                }
                if (!mapDjBIcL.containsKey(java.lang.Float.valueOf(-this.EZpvd))) {
                    kotlin.Pair pairOLrzqt4 = C56390yDp.OLrzqt(java.lang.Float.valueOf(-this.EZpvd), RevealValue.FullyRevealedStart);
                    mapDjBIcL.put(pairOLrzqt4.getFirst(), pairOLrzqt4.getSecond());
                }
            }
            composer.startReplaceableGroup(-846025629);
            boolean zChanged = composer.changed(density);
            boolean zChanged2 = composer.changed(fMo516toPx0680j_4);
            boolean zChanged3 = composer.changed(fMo516toPx0680j_42);
            boolean zChanged4 = composer.changed(this.KWHzl);
            final float f = this.KWHzl;
            java.lang.Object objRememberedValue = composer.rememberedValue();
            if ((zChanged | zChanged2 | zChanged3 | zChanged4) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function2() { // from class: o.mFv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C31825mFh.TaskDescription.AEQbTJ(density, fMo516toPx0680j_4, fMo516toPx0680j_42, f, (RevealValue) obj, (RevealValue) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function2 function2 = (Function2) objRememberedValue;
            composer.endReplaceableGroup();
            float f2 = this.copydefault.contains(revealDirection2) ? 10.0f : 20.0f;
            float f3 = this.copydefault.contains(revealDirection) ? 10.0f : 20.0f;
            composer.startReplaceableGroup(-845972083);
            java.lang.Object objRememberedValue2 = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue2);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue2;
            composer.endReplaceableGroup();
            androidx.compose.runtime.State<java.lang.Boolean> stateCollectIsDraggedAsState = DragInteractionKt.collectIsDraggedAsState(mutableInteractionSource, composer, 6);
            java.lang.Boolean value = stateCollectIsDraggedAsState.getValue();
            composer.startReplaceableGroup(-845967243);
            boolean zChanged5 = composer.changed(this.OLrzqt);
            boolean zChanged6 = composer.changed(stateCollectIsDraggedAsState);
            Function1<java.lang.Boolean, Unit> function1 = this.OLrzqt;
            java.lang.Object objRememberedValue3 = composer.rememberedValue();
            if ((zChanged5 | zChanged6) || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new RevealSwipeKt$revealSwipable$1$1$1(function1, stateCollectIsDraggedAsState, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            EffectsKt.LaunchedEffect(value, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue3, composer, 0);
            Modifier modifierM1408swipeablepPrIpRY = SwipeableKt.m1408swipeablepPrIpRY(Modifier.Companion, this.AhwBna, mapDjBIcL, Orientation.Horizontal, true, composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == androidx.compose.ui.unit.LayoutDirection.Rtl, mutableInteractionSource, function2, new ResistanceConfig(fFloatValue, f2, f3), androidx.compose.ui.unit.Dp.m5414constructorimpl(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierM1408swipeablepPrIpRY;
        }

        public static final ThresholdConfig AEQbTJ(Density density, float f, float f2, float f3, RevealValue revealValue, RevealValue revealValue2) {
            RevealValue revealValue3;
            Intrinsics.checkNotNullParameter(revealValue, "");
            Intrinsics.checkNotNullParameter(revealValue2, "");
            RevealValue revealValue4 = RevealValue.Default;
            if (revealValue == revealValue4 && (revealValue2 == RevealValue.PartiallyRevealedEnd || revealValue2 == RevealValue.PartiallyRevealedStart)) {
                return new FixedThreshold(density.mo512toDpu2uoSUM(f), null);
            }
            RevealValue revealValue5 = RevealValue.PartiallyRevealedEnd;
            if ((revealValue == revealValue5 && revealValue2 == RevealValue.FullyRevealedEnd) || (revealValue == (revealValue3 = RevealValue.PartiallyRevealedStart) && revealValue2 == RevealValue.FullyRevealedStart)) {
                return new FixedThreshold(density.mo512toDpu2uoSUM(f2 - f3), null);
            }
            if ((revealValue == revealValue5 || revealValue == revealValue3 || revealValue == RevealValue.FullyRevealedEnd || revealValue == RevealValue.FullyRevealedStart) && revealValue2 == revealValue4) {
                return new FixedThreshold(density.mo512toDpu2uoSUM(f), null);
            }
            return new FractionalThreshold(0.5f);
        }
    }

    public static final Modifier KWHzl(Modifier modifier, float f, float f2, float f3, java.util.Set<? extends RevealDirection> set, Function1<? super java.lang.Boolean, Unit> function1, SwipeableState<RevealValue> swipeableState) {
        return ComposedModifierKt.composed$default(modifier, null, new TaskDescription(set, f, f2, function1, swipeableState, f3), 1, null);
    }

    public static final float copydefault(float f) {
        if (java.lang.Float.isNaN(f)) {
            return 0.0f;
        }
        return f;
    }

    public static final SwipeableState<RevealValue> EZpvd(RevealValue revealValue, Function1<? super RevealValue, java.lang.Boolean> function1, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1939896151);
        if ((i2 & 1) != 0) {
            revealValue = RevealValue.Default;
        }
        RevealValue revealValue2 = revealValue;
        if ((i2 & 2) != 0) {
            composer.startReplaceableGroup(-655455798);
            java.lang.Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.mFk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(C31825mFh.copydefault((RevealValue) obj));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
            composer.endReplaceableGroup();
        }
        Function1<? super RevealValue, java.lang.Boolean> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1939896151, i, -1, "com.okinc.cruilib.compose.library.revealswipe.rememberRevealState (RevealSwipe.kt:588)");
        }
        SwipeableState<RevealValue> swipeableStateRememberSwipeableState = SwipeableKt.rememberSwipeableState(revealValue2, null, function12, composer, (i & 14) | ((i << 3) & FaceDetector.NUM_BOXES), 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableStateRememberSwipeableState;
    }

    public static final java.lang.Object KWHzl(@NotNull SwipeableState<RevealValue> swipeableState, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objAnimateTo$default = SwipeableState.animateTo$default(swipeableState, RevealValue.Default, null, continuation, 2, null);
        return objAnimateTo$default == C56442yFn.copydefault() ? objAnimateTo$default : Unit.INSTANCE;
    }

    public static final java.lang.Object OLrzqt(@NotNull SwipeableState<RevealValue> swipeableState, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objSnapTo = swipeableState.snapTo(RevealValue.Default, continuation);
        return objSnapTo == C56442yFn.copydefault() ? objSnapTo : Unit.INSTANCE;
    }

    public static final long OLrzqt(MutableState<androidx.compose.ui.geometry.Size> mutableState) {
        return mutableState.getValue().m2984unboximpl();
    }
}

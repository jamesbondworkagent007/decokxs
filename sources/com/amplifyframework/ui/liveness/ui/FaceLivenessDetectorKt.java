package com.amplifyframework.ui.liveness.ui;

import android.content.Context;
import android.graphics.RectF;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.LifecycleOwner;
import androidx.profileinstaller.ProfileVerifier;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.AWSCredentialsProvider;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.predictions.aws.models.ColorChallenge;
import com.amplifyframework.predictions.aws.models.ColorDisplayInformation;
import com.amplifyframework.predictions.aws.models.RgbColor;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.amplifyframework.ui.liveness.camera.PreviewTextureView;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException;
import com.amplifyframework.ui.liveness.model.LivenessCheckState;
import com.amplifyframework.ui.liveness.state.LivenessState;
import com.amplifyframework.ui.liveness.ui.helper.VideoViewportSize;
import com.amplifyframework.ui.liveness.util.ExtensionsKt;
import com.google.android.exoplayer2.C;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.yHO;
import o.yHT;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FaceLivenessDetectorKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChallengeView$lambda$24(Object obj, String str, String str2, AWSCredentialsProvider aWSCredentialsProvider, boolean z, Function0 function0, Consumer consumer, boolean z2, String str3, String str4, int i, Composer composer, int i2) {
        ChallengeView(obj, str, str2, aWSCredentialsProvider, z, function0, consumer, z2, str3, str4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChallengeView$lambda$54(Object obj, String str, String str2, AWSCredentialsProvider aWSCredentialsProvider, boolean z, Function0 function0, Consumer consumer, boolean z2, String str3, String str4, int i, Composer composer, int i2) {
        ChallengeView(obj, str, str2, aWSCredentialsProvider, z, function0, consumer, z2, str3, str4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FaceLivenessDetector$lambda$11(String str, String str2, AWSCredentialsProvider aWSCredentialsProvider, boolean z, Action action, Consumer consumer, boolean z2, String str3, String str4, int i, int i2, Composer composer, int i3) {
        FaceLivenessDetector(str, str2, aWSCredentialsProvider, z, action, consumer, z2, str3, str4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FaceLivenessDetector$lambda$12(String str, String str2, AWSCredentialsProvider aWSCredentialsProvider, boolean z, Action action, Consumer consumer, boolean z2, String str3, String str4, int i, int i2, Composer composer, int i3) {
        FaceLivenessDetector(str, str2, aWSCredentialsProvider, z, action, consumer, z2, str3, str4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FaceLivenessDetector$lambda$9(String str, String str2, AWSCredentialsProvider aWSCredentialsProvider, boolean z, Action action, Consumer consumer, boolean z2, String str3, String str4, int i, int i2, Composer composer, int i3) {
        FaceLivenessDetector(str, str2, aWSCredentialsProvider, z, action, consumer, z2, str3, str4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FaceLivenessDetector(@NotNull final String str, @NotNull final String str2, AWSCredentialsProvider<? extends AWSCredentials> aWSCredentialsProvider, boolean z, @NotNull final Action action, @NotNull final Consumer<FaceLivenessDetectionException> consumer, final boolean z2, @NotNull final String str3, final String str4, Composer composer, final int i, final int i2) {
        int i3;
        final AWSCredentialsProvider<? extends AWSCredentials> aWSCredentialsProvider2;
        int i4;
        boolean z3;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChanged2;
        Object objRememberedValue3;
        Composer composer2;
        final boolean z4;
        final AWSCredentialsProvider<? extends AWSCredentials> aWSCredentialsProvider3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(action, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1572160078);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else {
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                aWSCredentialsProvider2 = aWSCredentialsProvider;
                i3 |= composerStartRestartGroup.changedInstance(aWSCredentialsProvider2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z3 = z;
                    i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(action) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(consumer) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else {
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(str3) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) != 0) {
                        if ((i & 100663296) == 0) {
                            i3 |= composerStartRestartGroup.changed(str4) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        }
                        if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            if (i5 != 0) {
                                aWSCredentialsProvider2 = null;
                            }
                            boolean z5 = i4 == 0 ? false : z3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1572160078, i3, -1, "com.amplifyframework.ui.liveness.ui.FaceLivenessDetector (FaceLivenessDetector.kt:86)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(773894976);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.Companion;
                            if (objRememberedValue == companion.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            final Triple triple = new Triple(str, str2, aWSCredentialsProvider2);
                            composerStartRestartGroup.startReplaceableGroup(-547355553);
                            zChanged = composerStartRestartGroup.changed(triple);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            final MutableState mutableState = (MutableState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-547353601);
                            zChanged2 = composerStartRestartGroup.changed(triple);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            final MutableState mutableState2 = (MutableState) objRememberedValue3;
                            composerStartRestartGroup.endReplaceableGroup();
                            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(action, composerStartRestartGroup, (i3 >> 12) & 14);
                            final State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(consumer, composerStartRestartGroup, (i3 >> 15) & 14);
                            composerStartRestartGroup.startReplaceableGroup(-547344503);
                            if (ExtensionsKt.hasCameraPermission((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))) {
                                composerStartRestartGroup.startReplaceableGroup(-547342075);
                                boolean zChanged3 = composerStartRestartGroup.changed(mutableState);
                                boolean zChanged4 = composerStartRestartGroup.changed(stateRememberUpdatedState2);
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if ((zChanged3 | zChanged4) || objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new FaceLivenessDetectorKt$FaceLivenessDetector$1$1(mutableState, stateRememberUpdatedState2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.LaunchedEffect(triple, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup2 != null) {
                                    final AWSCredentialsProvider<? extends AWSCredentials> aWSCredentialsProvider4 = aWSCredentialsProvider2;
                                    final boolean z6 = z5;
                                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda0
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return FaceLivenessDetectorKt.FaceLivenessDetector$lambda$9(str, str2, aWSCredentialsProvider4, z6, action, consumer, z2, str3, str4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-547335099);
                            if (StringsKt__StringsKt.fARcdN((CharSequence) str)) {
                                composerStartRestartGroup.startReplaceableGroup(-547333415);
                                boolean zChanged5 = composerStartRestartGroup.changed(mutableState);
                                boolean zChanged6 = composerStartRestartGroup.changed(stateRememberUpdatedState2);
                                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if ((zChanged5 | zChanged6) || objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = new FaceLivenessDetectorKt$FaceLivenessDetector$3$1(mutableState, stateRememberUpdatedState2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.LaunchedEffect(triple, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup3 != null) {
                                    final AWSCredentialsProvider<? extends AWSCredentials> aWSCredentialsProvider5 = aWSCredentialsProvider2;
                                    final boolean z7 = z5;
                                    scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda1
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return FaceLivenessDetectorKt.FaceLivenessDetector$lambda$11(str, str2, aWSCredentialsProvider5, z7, action, consumer, z2, str3, str4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            AWSCredentialsProvider<? extends AWSCredentials> aWSCredentialsProvider6 = aWSCredentialsProvider2;
                            final boolean z8 = z5;
                            composer2 = composerStartRestartGroup;
                            LockPortraitOrientationKt.LockPortraitOrientation(ComposableLambdaKt.composableLambda(composer2, -1547359693, true, new yHO<Function0<? extends Unit>, Composer, Integer, Unit>() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt.FaceLivenessDetector.5

                                /* JADX INFO: renamed from: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$FaceLivenessDetector$5$1, reason: invalid class name */
                                public static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ AWSCredentialsProvider<AWSCredentials> $credentialsProvider;
                                    final /* synthetic */ State<Action> $currentOnComplete$delegate;
                                    final /* synthetic */ State<Consumer<FaceLivenessDetectionException>> $currentOnError$delegate;
                                    final /* synthetic */ boolean $disableStartView;
                                    final /* synthetic */ MutableState<Boolean> $isFinished$delegate;
                                    final /* synthetic */ MutableState<Boolean> $isSuccess$delegate;
                                    final /* synthetic */ Triple<String, String, AWSCredentialsProvider<AWSCredentials>> $key;
                                    final /* synthetic */ boolean $needProxy;
                                    final /* synthetic */ String $region;
                                    final /* synthetic */ Function0<Unit> $resetOrientation;
                                    final /* synthetic */ CoroutineScope $scope;
                                    final /* synthetic */ String $sessionId;
                                    final /* synthetic */ String $subdomainStrategy;
                                    final /* synthetic */ String $wssProxyPath;

                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: androidx.compose.runtime.State<? extends com.amplifyframework.core.Action> */
                                    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: androidx.compose.runtime.State<? extends com.amplifyframework.core.Consumer<com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException>> */
                                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.Triple<java.lang.String, java.lang.String, ? extends com.amplifyframework.auth.AWSCredentialsProvider<? extends com.amplifyframework.auth.AWSCredentials>> */
                                    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.amplifyframework.auth.AWSCredentialsProvider<? extends com.amplifyframework.auth.AWSCredentials> */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public AnonymousClass1(Triple<String, String, ? extends AWSCredentialsProvider<? extends AWSCredentials>> triple, String str, String str2, AWSCredentialsProvider<? extends AWSCredentials> aWSCredentialsProvider, boolean z, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Function0<Unit> function0, State<? extends Action> state, State<? extends Consumer<FaceLivenessDetectionException>> state2, boolean z2, String str3, String str4) {
                                        this.$key = triple;
                                        this.$sessionId = str;
                                        this.$region = str2;
                                        this.$credentialsProvider = aWSCredentialsProvider;
                                        this.$disableStartView = z;
                                        this.$scope = coroutineScope;
                                        this.$isFinished$delegate = mutableState;
                                        this.$isSuccess$delegate = mutableState2;
                                        this.$resetOrientation = function0;
                                        this.$currentOnComplete$delegate = state;
                                        this.$currentOnError$delegate = state2;
                                        this.$needProxy = z2;
                                        this.$wssProxyPath = str3;
                                        this.$subdomainStrategy = str4;
                                    }

                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v7 ??, still in use, count: 1, list:
                                          (r6v7 ?? I:java.lang.Object) from 0x0082: INVOKE (r19v0 ?? I:androidx.compose.runtime.Composer), (r6v7 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:415)
                                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                                        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
                                        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
                                        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                                        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
                                        */
                                    public final void invoke(
                                    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v7 ??, still in use, count: 1, list:
                                          (r6v7 ?? I:java.lang.Object) from 0x0082: INVOKE (r19v0 ?? I:androidx.compose.runtime.Composer), (r6v7 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:415)
                                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                                        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
                                        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
                                        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
                                        */
                                    /*  JADX ERROR: Method generation error
                                        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 ??
                                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
                                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        */

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, Function0 function0, MutableState mutableState, MutableState mutableState2, State state) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FaceLivenessDetectorKt$FaceLivenessDetector$5$1$1$1$1(function0, mutableState, mutableState2, state, null), 3, null);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final void invoke$lambda$3$lambda$2(CoroutineScope coroutineScope, Function0 function0, MutableState mutableState, State state, FaceLivenessDetectionException faceLivenessDetectionException) {
                                        Intrinsics.checkNotNullParameter(faceLivenessDetectionException, "");
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FaceLivenessDetectorKt$FaceLivenessDetector$5$1$2$1$1(function0, faceLivenessDetectionException, mutableState, state, null), 3, null);
                                    }
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                @Override // o.yHO
                                public /* synthetic */ Unit invoke(Function0<? extends Unit> function0, Composer composer3, Integer num) {
                                    invoke((Function0<Unit>) function0, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Function0<Unit> function0, Composer composer3, int i6) {
                                    int i7;
                                    Intrinsics.checkNotNullParameter(function0, "");
                                    if ((i6 & 6) == 0) {
                                        i7 = i6 | (composer3.changedInstance(function0) ? 4 : 2);
                                    } else {
                                        i7 = i6;
                                    }
                                    if ((i7 & 19) != 18 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1547359693, i7, -1, "com.amplifyframework.ui.liveness.ui.FaceLivenessDetector.<anonymous> (FaceLivenessDetector.kt:120)");
                                        }
                                        SurfaceKt.m1994SurfaceT9BRK9s(null, null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).m1554getBackground0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composer3, 290169358, true, new AnonymousClass1(triple, str, str2, aWSCredentialsProvider2, z8, coroutineScope, mutableState, mutableState2, function0, stateRememberUpdatedState, stateRememberUpdatedState2, z2, str3, str4)), composer3, 12582912, 123);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z4 = z5;
                            aWSCredentialsProvider3 = aWSCredentialsProvider6;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            aWSCredentialsProvider3 = aWSCredentialsProvider2;
                            z4 = z3;
                            composer2 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda2
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return FaceLivenessDetectorKt.FaceLivenessDetector$lambda$12(str, str2, aWSCredentialsProvider3, z4, action, consumer, z2, str3, str4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 100663296;
                    if ((i3 & 38347923) != 38347922) {
                        if (i5 != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(773894976);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.Companion;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        final Triple<String, String, ? extends AWSCredentialsProvider<? extends AWSCredentials>> triple2 = new Triple(str, str2, aWSCredentialsProvider2);
                        composerStartRestartGroup.startReplaceableGroup(-547355553);
                        zChanged = composerStartRestartGroup.changed(triple2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            final MutableState<Boolean> mutableState3 = (MutableState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-547353601);
                            zChanged2 = composerStartRestartGroup.changed(triple2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                final MutableState<Boolean> mutableState22 = (MutableState) objRememberedValue3;
                                composerStartRestartGroup.endReplaceableGroup();
                                final State<? extends Action> stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(action, composerStartRestartGroup, (i3 >> 12) & 14);
                                final State<? extends Consumer<FaceLivenessDetectionException>> stateRememberUpdatedState22 = SnapshotStateKt.rememberUpdatedState(consumer, composerStartRestartGroup, (i3 >> 15) & 14);
                                composerStartRestartGroup.startReplaceableGroup(-547344503);
                                if (ExtensionsKt.hasCameraPermission((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))) {
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) != 0) {
                }
                if ((i3 & 38347923) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) != 0) {
            }
            if ((i3 & 38347923) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        aWSCredentialsProvider2 = aWSCredentialsProvider;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        if ((i3 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:272:0x0c07  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChallengeView(@NotNull final Object obj, @NotNull final String str, @NotNull final String str2, final AWSCredentialsProvider<? extends AWSCredentials> aWSCredentialsProvider, final boolean z, @NotNull final Function0<Unit> function0, @NotNull final Consumer<FaceLivenessDetectionException> consumer, final boolean z2, @NotNull final String str3, final String str4, Composer composer, final int i) {
        int i2;
        int i3;
        final Context context;
        Composer composer2;
        long jM3186getWhite0d7_KjU;
        Composer composer3;
        int i4;
        float f;
        BoxScopeInstance boxScopeInstance;
        Modifier.Companion companion;
        Composer composer4;
        LivenessState livenessState;
        Object obj2;
        int i5;
        RectF rectF;
        final MutableState mutableState;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-87580178);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(aWSCredentialsProvider) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(consumer) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
        }
        if ((i & C.ENCODING_PCM_32BIT) == 0) {
            i2 |= composerStartRestartGroup.changed(str4) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-87580178, i2, -1, "com.amplifyframework.ui.liveness.ui.ChallengeView (FaceLivenessDetector.kt:166)");
            }
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceableGroup(912496621);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i2 >> 15) & 14);
            final State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(consumer, composerStartRestartGroup, (i2 >> 18) & 14);
            composerStartRestartGroup.startReplaceableGroup(912504536);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(912507361);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context2);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(lifecycleOwner);
            boolean z3 = (i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            boolean z4 = (i2 & FaceDetector.NUM_BOXES) == 256;
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(aWSCredentialsProvider);
            boolean z5 = (i2 & 57344) == 16384;
            boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
            boolean zChanged2 = composerStartRestartGroup.changed(stateRememberUpdatedState2);
            boolean z6 = (i2 & 29360128) == 8388608;
            boolean z7 = (234881024 & i2) == 67108864;
            int i6 = i2;
            boolean z8 = (1879048192 & i2) == 536870912;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (((z3 | zChangedInstance | zChangedInstance2 | z4 | zChangedInstance3 | z5 | zChanged | zChanged2 | z6 | z7) || z8) || objRememberedValue3 == companion2.getEmpty()) {
                i3 = i6;
                context = context2;
                composer2 = composerStartRestartGroup;
                Function1 function1 = new Function1() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda3
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return FaceLivenessDetectorKt.ChallengeView$lambda$23$lambda$22(context2, lifecycleOwner, str, str2, aWSCredentialsProvider, z, z2, str3, str4, stateRememberUpdatedState, stateRememberUpdatedState2, mutableState2, (DisposableEffectScope) obj3);
                    }
                };
                composer2.updateRememberedValue(function1);
                objRememberedValue3 = function1;
            } else {
                context = context2;
                composer2 = composerStartRestartGroup;
                i3 = i6;
            }
            composer2.endReplaceableGroup();
            int i7 = i3 & 14;
            EffectsKt.DisposableEffect(obj, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer2, i7);
            final LivenessCoordinator livenessCoordinatorChallengeView$lambda$14 = ChallengeView$lambda$14(mutableState2);
            if (livenessCoordinatorChallengeView$lambda$14 == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda5
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            return FaceLivenessDetectorKt.ChallengeView$lambda$24(obj, str, str2, aWSCredentialsProvider, z, function0, consumer, z2, str3, str4, i, (Composer) obj3, ((Integer) obj4).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            final LivenessState livenessState2 = livenessCoordinatorChallengeView$lambda$14.getLivenessState();
            final Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            composer2.startReplaceableGroup(912540537);
            if (livenessState2.getShowingStartView()) {
                jM3186getWhite0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m1554getBackground0d7_KjU();
            } else if (livenessState2.getFaceGuideRect() != null) {
                jM3186getWhite0d7_KjU = Color.Companion.m3186getWhite0d7_KjU();
            } else {
                jM3186getWhite0d7_KjU = Color.Companion.m3186getWhite0d7_KjU();
            }
            long j = jM3186getWhite0d7_KjU;
            composer2.endReplaceableGroup();
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierM350backgroundbw27NRU$default = BackgroundKt.m350backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), j, null, 2, null);
            composer2.startReplaceableGroup(912551218);
            boolean zChangedInstance4 = composer2.changedInstance(livenessState2);
            boolean zChanged3 = composer2.changed(density);
            Object objRememberedValue4 = composer2.rememberedValue();
            if ((zChangedInstance4 | zChanged3) || objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda6
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return FaceLivenessDetectorKt.ChallengeView$lambda$26$lambda$25(livenessState2, density, (LayoutCoordinates) obj3);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM350backgroundbw27NRU$default, (Function1) objRememberedValue4);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf = LayoutKt.materializerOf(modifierOnGloballyPositioned);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer2);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, density2, companion5.getSetDensity());
            Updater.m2790setimpl(composerM2783constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
            Updater.m2790setimpl(composerM2783constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
            composer2.enableReusing();
            yhoMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            VideoViewportSize videoViewportSize = livenessState2.getVideoViewportSize();
            composer2.startReplaceableGroup(-1684633055);
            if (videoViewportSize != null) {
                Modifier modifierAlign = boxScopeInstance2.align(SizeKt.m719size6HolHcs(companion3, videoViewportSize.m6099getViewportDpSizeMYxV2XQ()), companion4.getCenter());
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf2 = LayoutKt.materializerOf(modifierAlign);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composer2);
                Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl2, density3, companion5.getSetDensity());
                Updater.m2790setimpl(composerM2783constructorimpl2, layoutDirection2, companion5.getSetLayoutDirection());
                Updater.m2790setimpl(composerM2783constructorimpl2, viewConfiguration2, companion5.getSetViewConfiguration());
                composer2.enableReusing();
                yhoMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                composer2.startReplaceableGroup(-109320706);
                boolean zChangedInstance5 = composer2.changedInstance(livenessCoordinatorChallengeView$lambda$14);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == companion2.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda7
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return FaceLivenessDetectorKt.ChallengeView$lambda$53$lambda$29$lambda$28$lambda$27(livenessCoordinatorChallengeView$lambda$14, (Context) obj3);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceableGroup();
                AndroidView_androidKt.AndroidView((Function1) objRememberedValue5, boxScopeInstance2.align(SizeKt.m719size6HolHcs(companion3, videoViewportSize.m6099getViewportDpSizeMYxV2XQ()), companion4.getCenter()), null, composer2, 0, 4);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (livenessState2.getShowingStartView()) {
                    composer2.startReplaceableGroup(-683683870);
                    FaceGuideKt.m6073FaceGuideww6aTOc(boxScopeInstance2.align(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), companion4.getCenter()), new RectF(120.0f, 126.0f, 360.0f, 514.0f), videoViewportSize, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).m1554getBackground0d7_KjU(), composer2, 0, 0);
                    float f2 = 16;
                    Modifier modifierAlign2 = boxScopeInstance2.align(PaddingKt.m671padding3ABfNKs(companion3, Dp.m5414constructorimpl(f2)), companion4.getTopCenter());
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(Dp.m5414constructorimpl(8));
                    Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_4, centerHorizontally, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density4 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf3 = LayoutKt.materializerOf(modifierAlign2);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM2783constructorimpl3 = Updater.m2783constructorimpl(composer2);
                    Updater.m2790setimpl(composerM2783constructorimpl3, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl3, density4, companion5.getSetDensity());
                    Updater.m2790setimpl(composerM2783constructorimpl3, layoutDirection3, companion5.getSetLayoutDirection());
                    Updater.m2790setimpl(composerM2783constructorimpl3, viewConfiguration3, companion5.getSetViewConfiguration());
                    composer2.enableReusing();
                    yhoMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(-109285526);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (objRememberedValue6 == companion2.getEmpty()) {
                        mutableState = mutableState3;
                        objRememberedValue6 = new Function0() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda8
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FaceLivenessDetectorKt.ChallengeView$lambda$53$lambda$32$lambda$31$lambda$30(mutableState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue6);
                    } else {
                        mutableState = mutableState3;
                    }
                    composer2.endReplaceableGroup();
                    PhotosensitivityViewKt.PhotosensitivityView((Function0) objRememberedValue6, composer2, 6);
                    InstructionMessageKt.InstructionMessage(LivenessCheckState.Initial.Companion.withStartViewMessage(), composer2, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM671padding3ABfNKs = PaddingKt.m671padding3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance2.align(companion3, companion4.getBottomCenter()), 0.0f, 1, null), Dp.m5414constructorimpl(f2));
                    Alignment bottomCenter = companion4.getBottomCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(bottomCenter, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    Density density5 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection4 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration4 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf4 = LayoutKt.materializerOf(modifierM671padding3ABfNKs);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM2783constructorimpl4 = Updater.m2783constructorimpl(composer2);
                    Updater.m2790setimpl(composerM2783constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion5.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl4, density5, companion5.getSetDensity());
                    Updater.m2790setimpl(composerM2783constructorimpl4, layoutDirection4, companion5.getSetLayoutDirection());
                    Updater.m2790setimpl(composerM2783constructorimpl4, viewConfiguration4, companion5.getSetViewConfiguration());
                    composer2.enableReusing();
                    yhoMaterializerOf4.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    composer2.startReplaceableGroup(-109266385);
                    boolean zChangedInstance6 = composer2.changedInstance(livenessState2);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (zChangedInstance6 || objRememberedValue7 == companion2.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda9
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FaceLivenessDetectorKt.ChallengeView$lambda$53$lambda$35$lambda$34$lambda$33(livenessState2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceableGroup();
                    ButtonKt.Button((Function0) objRememberedValue7, modifierFillMaxWidth$default, false, null, null, null, null, null, null, ComposableSingletons$FaceLivenessDetectorKt.INSTANCE.m6058getLambda1$OKCompliance_ok_compliance_dynamic_aws_impl(), composer2, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (((Boolean) mutableState.getValue()).booleanValue()) {
                        composer2.startReplaceableGroup(-1684567156);
                        Object objRememberedValue8 = composer2.rememberedValue();
                        if (objRememberedValue8 == companion2.getEmpty()) {
                            objRememberedValue8 = new Function0() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda10
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FaceLivenessDetectorKt.ChallengeView$lambda$53$lambda$37$lambda$36(mutableState);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue8);
                        }
                        composer2.endReplaceableGroup();
                        PhotosensitivityViewKt.PhotosensitivityAlert((Function0) objRememberedValue8, composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    composer3 = composer2;
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.startReplaceableGroup(-681684153);
                    RectF faceGuideRect = livenessState2.getFaceGuideRect();
                    composer2.startReplaceableGroup(-1684561384);
                    if (faceGuideRect == null) {
                        i4 = 733328855;
                    } else {
                        i4 = 733328855;
                        FaceGuideKt.m6073FaceGuideww6aTOc(boxScopeInstance2.align(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null), companion4.getCenter()), faceGuideRect, videoViewportSize, 0L, composer2, 0, 8);
                        Unit unit = Unit.INSTANCE;
                    }
                    composer2.endReplaceableGroup();
                    if (livenessState2.getRunningFreshness()) {
                        composer2.startReplaceableGroup(-681406114);
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                        ColorChallenge colorChallenge = livenessState2.getColorChallenge();
                        Intrinsics.copydefault(colorChallenge);
                        List<ColorDisplayInformation> challengeColors = colorChallenge.getChallengeColors();
                        composer2.startReplaceableGroup(-1684541144);
                        boolean zChangedInstance7 = composer2.changedInstance(livenessCoordinatorChallengeView$lambda$14);
                        Object objRememberedValue9 = composer2.rememberedValue();
                        if (zChangedInstance7 || objRememberedValue9 == companion2.getEmpty()) {
                            objRememberedValue9 = new yHT() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda11
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.yHT
                                public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                    return FaceLivenessDetectorKt.ChallengeView$lambda$53$lambda$40$lambda$39(livenessCoordinatorChallengeView$lambda$14, (RgbColor) obj3, (RgbColor) obj4, ((Integer) obj5).intValue(), ((Long) obj6).longValue());
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue9);
                        }
                        yHT yht = (yHT) objRememberedValue9;
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(-1684528284);
                        boolean zChangedInstance8 = composer2.changedInstance(livenessCoordinatorChallengeView$lambda$14);
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (zChangedInstance8 || objRememberedValue10 == companion2.getEmpty()) {
                            objRememberedValue10 = new Function0() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda12
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FaceLivenessDetectorKt.ChallengeView$lambda$53$lambda$42$lambda$41(livenessCoordinatorChallengeView$lambda$14);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue10);
                        }
                        composer2.endReplaceableGroup();
                        f = 0.0f;
                        boxScopeInstance = boxScopeInstance2;
                        companion = companion3;
                        i5 = 1;
                        composer4 = composer2;
                        livenessState = livenessState2;
                        obj2 = null;
                        FreshnessChallengeKt.FreshnessChallenge(obj, modifierFillMaxSize$default, challengeColors, yht, (Function0) objRememberedValue10, composer2, i7 | 48);
                        composer4.endReplaceableGroup();
                    } else {
                        f = 0.0f;
                        boxScopeInstance = boxScopeInstance2;
                        companion = companion3;
                        composer4 = composer2;
                        livenessState = livenessState2;
                        obj2 = null;
                        i5 = 1;
                        composer4.startReplaceableGroup(-680609414);
                        composer4.startReplaceableGroup(-1684521398);
                        boolean zChangedInstance9 = composer4.changedInstance(context);
                        Object objRememberedValue11 = composer4.rememberedValue();
                        if (zChangedInstance9 || objRememberedValue11 == companion2.getEmpty()) {
                            objRememberedValue11 = new Function1() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda13
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return FaceLivenessDetectorKt.ChallengeView$lambda$53$lambda$45$lambda$44(context, (Context) obj3);
                                }
                            };
                            composer4.updateRememberedValue(objRememberedValue11);
                        }
                        composer4.endReplaceableGroup();
                        AndroidView_androidKt.AndroidView((Function1) objRememberedValue11, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, composer4, 48, 4);
                        composer4.endReplaceableGroup();
                    }
                    Modifier modifierAlign3 = boxScopeInstance.align(SizeKt.m719size6HolHcs(companion, videoViewportSize.m6099getViewportDpSizeMYxV2XQ()), companion4.getCenter());
                    composer4.startReplaceableGroup(i4);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer4, 0);
                    composer4.startReplaceableGroup(-1323940314);
                    Density density6 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection5 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration5 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf5 = LayoutKt.materializerOf(modifierAlign3);
                    if (!(composer4.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor5);
                    } else {
                        composer4.useNode();
                    }
                    composer4.disableReusing();
                    Composer composerM2783constructorimpl5 = Updater.m2783constructorimpl(composer4);
                    Updater.m2790setimpl(composerM2783constructorimpl5, measurePolicyRememberBoxMeasurePolicy4, companion5.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl5, density6, companion5.getSetDensity());
                    Updater.m2790setimpl(composerM2783constructorimpl5, layoutDirection5, companion5.getSetLayoutDirection());
                    Updater.m2790setimpl(composerM2783constructorimpl5, viewConfiguration5, companion5.getSetViewConfiguration());
                    composer4.enableReusing();
                    yhoMaterializerOf5.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer4)), composer4, 0);
                    composer4.startReplaceableGroup(2058660585);
                    if (livenessState.getFaceGuideRect() != null) {
                        composer4.startReplaceableGroup(910714627);
                        Modifier modifierM671padding3ABfNKs2 = PaddingKt.m671padding3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion4.getTopCenter()), f, i5, obj2), Dp.m5414constructorimpl(24));
                        Alignment topCenter = companion4.getTopCenter();
                        composer4.startReplaceableGroup(i4);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(topCenter, false, composer4, 6);
                        composer4.startReplaceableGroup(-1323940314);
                        Density density7 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection6 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration6 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        Function0<ComposeUiNode> constructor6 = companion5.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf6 = LayoutKt.materializerOf(modifierM671padding3ABfNKs2);
                        if (!(composer4.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor6);
                        } else {
                            composer4.useNode();
                        }
                        composer4.disableReusing();
                        Composer composerM2783constructorimpl6 = Updater.m2783constructorimpl(composer4);
                        Updater.m2790setimpl(composerM2783constructorimpl6, measurePolicyRememberBoxMeasurePolicy5, companion5.getSetMeasurePolicy());
                        Updater.m2790setimpl(composerM2783constructorimpl6, density7, companion5.getSetDensity());
                        Updater.m2790setimpl(composerM2783constructorimpl6, layoutDirection6, companion5.getSetLayoutDirection());
                        Updater.m2790setimpl(composerM2783constructorimpl6, viewConfiguration6, companion5.getSetViewConfiguration());
                        composer4.enableReusing();
                        yhoMaterializerOf6.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer4)), composer4, 0);
                        composer4.startReplaceableGroup(2058660585);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = Arrangement.INSTANCE.m582spacedBy0680j_4(Dp.m5414constructorimpl(5));
                        Alignment.Horizontal centerHorizontally2 = companion4.getCenterHorizontally();
                        composer4.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_42, centerHorizontally2, composer4, 54);
                        composer4.startReplaceableGroup(-1323940314);
                        Density density8 = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection7 = (LayoutDirection) composer4.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration7 = (ViewConfiguration) composer4.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        Function0<ComposeUiNode> constructor7 = companion5.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf7 = LayoutKt.materializerOf(companion);
                        if (!(composer4.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor7);
                        } else {
                            composer4.useNode();
                        }
                        composer4.disableReusing();
                        Composer composerM2783constructorimpl7 = Updater.m2783constructorimpl(composer4);
                        Updater.m2790setimpl(composerM2783constructorimpl7, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                        Updater.m2790setimpl(composerM2783constructorimpl7, density8, companion5.getSetDensity());
                        Updater.m2790setimpl(composerM2783constructorimpl7, layoutDirection7, companion5.getSetLayoutDirection());
                        Updater.m2790setimpl(composerM2783constructorimpl7, viewConfiguration7, companion5.getSetViewConfiguration());
                        composer4.enableReusing();
                        yhoMaterializerOf7.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer4)), composer4, 0);
                        composer4.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        InstructionMessageKt.InstructionMessage(livenessState.getLivenessCheckState().getValue(), composer4, 0);
                        composer4.startReplaceableGroup(-652564160);
                        Integer instructionId = livenessState.getLivenessCheckState().getValue().getInstructionId();
                        int instructionStringRes = FaceDetector.FaceOvalPosition.TOO_FAR.getInstructionStringRes();
                        if (instructionId != null && instructionId.intValue() == instructionStringRes) {
                            RectF faceGuideRect2 = livenessState.getFaceGuideRect();
                            if (faceGuideRect2 == null || (rectF = videoViewportSize.getScaledBoundingRect(faceGuideRect2)) == null) {
                                rectF = new RectF();
                            }
                            float fMo512toDpu2uoSUM = ((Density) composer4.consume(CompositionLocalsKt.getLocalDensity())).mo512toDpu2uoSUM((rectF.right - rectF.left) * 0.6f);
                            float faceMatchPercentage = livenessState.getFaceMatchPercentage();
                            Modifier modifierM704height3ABfNKs = SizeKt.m704height3ABfNKs(SizeKt.m723width3ABfNKs(ClipKt.clip(companion, MaterialTheme.INSTANCE.getShapes(composer4, MaterialTheme.$stable).getSmall()), fMo512toDpu2uoSUM), Dp.m5414constructorimpl(12));
                            Color.Companion companion6 = Color.Companion;
                            composer3 = composer4;
                            ProgressIndicatorKt.m1858LinearProgressIndicator_5eSRE(faceMatchPercentage, modifierM704height3ABfNKs, companion6.m3175getBlack0d7_KjU(), companion6.m3186getWhite0d7_KjU(), 0, composer3, 3456, 16);
                        } else {
                            composer3 = composer4;
                        }
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                    } else {
                        composer3 = composer4;
                        composer3.startReplaceableGroup(912845009);
                        float f3 = 16;
                        Modifier modifierM671padding3ABfNKs3 = PaddingKt.m671padding3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion4.getTopCenter()), f, i5, obj2), Dp.m5414constructorimpl(f3));
                        Alignment topCenter2 = companion4.getTopCenter();
                        composer3.startReplaceableGroup(i4);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(topCenter2, false, composer3, 6);
                        composer3.startReplaceableGroup(-1323940314);
                        Density density9 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection8 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration8 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        Function0<ComposeUiNode> constructor8 = companion5.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf8 = LayoutKt.materializerOf(modifierM671padding3ABfNKs3);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor8);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer composerM2783constructorimpl8 = Updater.m2783constructorimpl(composer3);
                        Updater.m2790setimpl(composerM2783constructorimpl8, measurePolicyRememberBoxMeasurePolicy6, companion5.getSetMeasurePolicy());
                        Updater.m2790setimpl(composerM2783constructorimpl8, density9, companion5.getSetDensity());
                        Updater.m2790setimpl(composerM2783constructorimpl8, layoutDirection8, companion5.getSetLayoutDirection());
                        Updater.m2790setimpl(composerM2783constructorimpl8, viewConfiguration8, companion5.getSetViewConfiguration());
                        composer3.enableReusing();
                        yhoMaterializerOf8.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_43 = Arrangement.INSTANCE.m582spacedBy0680j_4(Dp.m5414constructorimpl(f3));
                        Alignment.Horizontal centerHorizontally3 = companion4.getCenterHorizontally();
                        composer3.startReplaceableGroup(-483455358);
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM582spacedBy0680j_43, centerHorizontally3, composer3, 54);
                        composer3.startReplaceableGroup(-1323940314);
                        Density density10 = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection9 = (LayoutDirection) composer3.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration9 = (ViewConfiguration) composer3.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        Function0<ComposeUiNode> constructor9 = companion5.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoMaterializerOf9 = LayoutKt.materializerOf(companion);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor9);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer composerM2783constructorimpl9 = Updater.m2783constructorimpl(composer3);
                        Updater.m2790setimpl(composerM2783constructorimpl9, measurePolicyColumnMeasurePolicy3, companion5.getSetMeasurePolicy());
                        Updater.m2790setimpl(composerM2783constructorimpl9, density10, companion5.getSetDensity());
                        Updater.m2790setimpl(composerM2783constructorimpl9, layoutDirection9, companion5.getSetLayoutDirection());
                        Updater.m2790setimpl(composerM2783constructorimpl9, viewConfiguration9, companion5.getSetViewConfiguration());
                        composer3.enableReusing();
                        yhoMaterializerOf9.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                        InstructionMessageKt.InstructionMessage(livenessState.getLivenessCheckState().getValue(), composer3, 0);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                    }
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            } else {
                composer3 = composer2;
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                composer3.endNode();
                composer3.endReplaceableGroup();
                composer3.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return FaceLivenessDetectorKt.ChallengeView$lambda$54(obj, str, str2, aWSCredentialsProvider, z, function0, consumer, z2, str3, str4, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ChallengeView$lambda$23$lambda$22(final Context context, LifecycleOwner lifecycleOwner, String str, String str2, AWSCredentialsProvider aWSCredentialsProvider, boolean z, boolean z2, String str3, String str4, final State state, final State state2, final MutableState mutableState, DisposableEffectScope disposableEffectScope) {
        Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        try {
            try {
                mutableState.setValue(new LivenessCoordinator(context, lifecycleOwner, str, str2, aWSCredentialsProvider, z, new Function0() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda14
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FaceLivenessDetectorKt.ChallengeView$lambda$23$lambda$22$lambda$19(state);
                    }
                }, new Consumer() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$$ExternalSyntheticLambda15
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.amplifyframework.core.Consumer
                    public final void accept(Object obj) {
                        FaceLivenessDetectorKt.ChallengeView$lambda$23$lambda$22$lambda$20(state2, (FaceLivenessDetectionException) obj);
                    }
                }, z2, str3, str4));
            } catch (Exception e) {
                e = e;
                ChallengeView$lambda$17(state2).accept(new FaceLivenessDetectionException("Failed to initialize video components required for Liveness check.", null, e, null, null, 26, null));
            }
        } catch (Exception e2) {
            e = e2;
        }
        return new DisposableEffectResult() { // from class: com.amplifyframework.ui.liveness.ui.FaceLivenessDetectorKt$ChallengeView$lambda$23$lambda$22$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LivenessCoordinator livenessCoordinatorChallengeView$lambda$14 = FaceLivenessDetectorKt.ChallengeView$lambda$14(mutableState);
                if (livenessCoordinatorChallengeView$lambda$14 != null) {
                    livenessCoordinatorChallengeView$lambda$14.destroy(context);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChallengeView$lambda$23$lambda$22$lambda$19(State state) {
        ChallengeView$lambda$16(state).invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChallengeView$lambda$23$lambda$22$lambda$20(State state, FaceLivenessDetectionException faceLivenessDetectionException) {
        Intrinsics.checkNotNullParameter(faceLivenessDetectionException, "");
        ChallengeView$lambda$17(state).accept(faceLivenessDetectionException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChallengeView$lambda$26$lambda$25(LivenessState livenessState, Density density, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "");
        livenessState.updateVideoViewportSize(VideoViewportSize.Companion.m6101createviCIZxY(layoutCoordinates.mo4392getSizeYbymL2g(), density));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreviewTextureView ChallengeView$lambda$53$lambda$29$lambda$28$lambda$27(LivenessCoordinator livenessCoordinator, Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return livenessCoordinator.getPreviewTextureView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChallengeView$lambda$53$lambda$32$lambda$31$lambda$30(MutableState mutableState) {
        mutableState.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChallengeView$lambda$53$lambda$35$lambda$34$lambda$33(LivenessState livenessState) {
        livenessState.onStartViewComplete();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChallengeView$lambda$53$lambda$37$lambda$36(MutableState mutableState) {
        mutableState.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChallengeView$lambda$53$lambda$40$lambda$39(LivenessCoordinator livenessCoordinator, RgbColor rgbColor, RgbColor rgbColor2, int i, long j) {
        Intrinsics.checkNotNullParameter(rgbColor, "");
        Intrinsics.checkNotNullParameter(rgbColor2, "");
        livenessCoordinator.processColorDisplayed(rgbColor, rgbColor2, i, j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChallengeView$lambda$53$lambda$42$lambda$41(LivenessCoordinator livenessCoordinator) {
        livenessCoordinator.processFreshnessChallengeComplete();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AwsAppbarView ChallengeView$lambda$53$lambda$45$lambda$44(Context context, Context context2) {
        Intrinsics.checkNotNullParameter(context2, "");
        return new AwsAppbarView(context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FaceLivenessDetector$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FaceLivenessDetector$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FaceLivenessDetector$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Action FaceLivenessDetector$lambda$6(State<? extends Action> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Consumer<FaceLivenessDetectionException> FaceLivenessDetector$lambda$7(State<? extends Consumer<FaceLivenessDetectionException>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LivenessCoordinator ChallengeView$lambda$14(MutableState<LivenessCoordinator> mutableState) {
        return mutableState.getValue();
    }

    private static final Function0<Unit> ChallengeView$lambda$16(State<? extends Function0<Unit>> state) {
        return state.getValue();
    }

    private static final Consumer<FaceLivenessDetectionException> ChallengeView$lambda$17(State<? extends Consumer<FaceLivenessDetectionException>> state) {
        return state.getValue();
    }
}

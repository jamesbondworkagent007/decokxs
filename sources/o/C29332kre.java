package o;

import android.text.TextUtils;
import android.widget.ImageView;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.viewpager2.widget.ViewPager2;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.market.features.scanner.surge.ui.SignalGemsComposableKt$ExpandedGemsView$1$1;
import com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiplierTagType;
import com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiplierTagUiModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C29295kqu;
import o.C29332kre;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.kre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29332kre {

    /* JADX INFO: renamed from: o.kre$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SignalMultiplierTagType.values().length];
            try {
                iArr[SignalMultiplierTagType.GOLD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SignalMultiplierTagType.SILVER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SignalMultiplierTagType.BRONZE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(java.util.List list, Function1 function1, float f, int i, int i2, Composer composer, int i3) {
        KWHzl((java.util.List<C29295kqu>) list, (Function1<? super TokenBase, Unit>) function1, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(BoxScope boxScope, SignalMultiplierTagUiModel signalMultiplierTagUiModel, boolean z, int i, int i2, Composer composer, int i3) {
        KWHzl(boxScope, signalMultiplierTagUiModel, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(Modifier modifier, C29295kqu c29295kqu, Function1 function1, float f, int i, int i2, Composer composer, int i3) {
        KWHzl(modifier, c29295kqu, (Function1<? super TokenBase, Unit>) function1, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(@NotNull final java.util.List<C29295kqu> list, @NotNull final Function1<? super TokenBase, Unit> function1, float f, Composer composer, final int i, final int i2) {
        int i3;
        float f2;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        boolean zChanged;
        java.lang.Object next;
        boolean zChangedInstance;
        boolean zChangedInstance2;
        java.lang.Object objRememberedValue2;
        boolean zChangedInstance3;
        boolean z;
        boolean z2;
        java.lang.Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1497910246);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
            }
            if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) == 146 || !composerStartRestartGroup.getSkipping()) {
                final float f3 = i4 == 0 ? 1.0f : f2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1497910246, i3, -1, "com.okinc.business.market.features.scanner.surge.ui.ExpandedGemsView (SignalGemsComposable.kt:73)");
                }
                android.view.View view = (android.view.View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-1053021869);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = java.lang.Integer.valueOf(android.view.ViewConfiguration.get(context).getScaledTouchSlop());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int iIntValue = ((java.lang.Number) objRememberedValue).intValue();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1053019036);
                zChanged = composerStartRestartGroup.changed(view);
                java.lang.Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    java.lang.Object obj = objRememberedValue4;
                    if (objRememberedValue4 == companion.getEmpty()) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (android.view.ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                            arrayList.add(parent);
                            if (parent instanceof ViewPager2) {
                                break;
                            }
                        }
                        composerStartRestartGroup.updateRememberedValue(arrayList);
                        obj = arrayList;
                    }
                    java.util.List list2 = (java.util.List) obj;
                    composerStartRestartGroup.endReplaceableGroup();
                    java.util.Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((android.view.ViewParent) next) instanceof ViewPager2) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ViewPager2 viewPager2 = next instanceof ViewPager2 ? (ViewPager2) next : null;
                    if (viewPager2 != null) {
                        InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
                        if (!(!(interfaceC25414iwK != null && interfaceC25414iwK.AYXKKw()))) {
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                        java.lang.Object[] objArr = {viewPager2, java.lang.Integer.valueOf(iIntValue), list2};
                        composerStartRestartGroup.startReplaceableGroup(-1052997250);
                        zChangedInstance = composerStartRestartGroup.changedInstance(list2);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(viewPager2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(zChangedInstance | zChangedInstance2)) {
                            objRememberedValue2 = new SignalGemsComposableKt$ExpandedGemsView$1$1(list2, iIntValue, viewPager2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxWidth$default, objArr, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue2);
                            PaddingValues paddingValuesM666PaddingValuesYgX7TsA$default = PaddingKt.m666PaddingValuesYgX7TsA$default(androidx.compose.ui.unit.Dp.m5414constructorimpl(24.0f), 0.0f, 2, null);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(16.0f));
                            composerStartRestartGroup.startReplaceableGroup(-1052928912);
                            zChangedInstance3 = composerStartRestartGroup.changedInstance(list);
                            if ((i3 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                            }
                            if ((i3 & FaceDetector.NUM_BOXES) != 256) {
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!(z2 | zChangedInstance3 | z)) {
                                objRememberedValue3 = new Function1() { // from class: o.krj
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return C29332kre.OLrzqt(list, function1, f3, (LazyListScope) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceableGroup();
                                float f4 = f3;
                                LazyDslKt.LazyRow(modifierPointerInput, null, paddingValuesM666PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM582spacedBy0680j_4, null, null, false, (Function1) objRememberedValue3, composerStartRestartGroup, 24960, 234);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f2 = f4;
                            }
                        }
                    } else {
                        viewPager2 = null;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                        java.lang.Object[] objArr2 = {viewPager2, java.lang.Integer.valueOf(iIntValue), list2};
                        composerStartRestartGroup.startReplaceableGroup(-1052997250);
                        zChangedInstance = composerStartRestartGroup.changedInstance(list2);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(viewPager2);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!(zChangedInstance | zChangedInstance2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                            objRememberedValue2 = new SignalGemsComposableKt$ExpandedGemsView$1$1(list2, iIntValue, viewPager2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxWidth$default2, objArr2, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue2);
                        PaddingValues paddingValuesM666PaddingValuesYgX7TsA$default2 = PaddingKt.m666PaddingValuesYgX7TsA$default(androidx.compose.ui.unit.Dp.m5414constructorimpl(24.0f), 0.0f, 2, null);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_42 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(16.0f));
                        composerStartRestartGroup.startReplaceableGroup(-1052928912);
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(list);
                        z = (i3 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                        z2 = (i3 & FaceDetector.NUM_BOXES) != 256;
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!(z2 | zChangedInstance3 | z) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: o.krj
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return C29332kre.OLrzqt(list, function1, f3, (LazyListScope) obj2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        float f42 = f3;
                        LazyDslKt.LazyRow(modifierPointerInput2, null, paddingValuesM666PaddingValuesYgX7TsA$default2, false, horizontalOrVerticalM582spacedBy0680j_42, null, null, false, (Function1) objRememberedValue3, composerStartRestartGroup, 24960, 234);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f2 = f42;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final float f5 = f2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.kri
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return C29332kre.EZpvd(list, function1, f5, i, i2, (Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= MLKEMEngine.KyberPolyBytes;
        f2 = f;
        if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            android.view.View view2 = (android.view.View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            android.content.Context context2 = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(-1053021869);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
            }
            int iIntValue2 = ((java.lang.Number) objRememberedValue).intValue();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1053019036);
            zChanged = composerStartRestartGroup.changed(view2);
            java.lang.Object objRememberedValue42 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final kotlin.Pair<Color, Color> copydefault(SignalMultiplierTagType signalMultiplierTagType, Composer composer, int i) {
        kotlin.Pair<Color, Color> pairOLrzqt;
        composer.startReplaceableGroup(2109941836);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2109941836, i, -1, "com.okinc.business.market.features.scanner.surge.ui.rememberBadgeColors (SignalGemsComposable.kt:149)");
        }
        int i2 = StateListAnimator.EZpvd[signalMultiplierTagType.ordinal()];
        if (i2 == 1) {
            composer.startReplaceableGroup(-27041540);
            pairOLrzqt = C56390yDp.OLrzqt(Color.m3139boximpl(ColorResources_androidKt.colorResource(C23274hvD.StateListAnimator.zLjUOn, composer, 0)), Color.m3139boximpl(ColorResources_androidKt.colorResource(C23274hvD.StateListAnimator.iwGUEr, composer, 0)));
            composer.endReplaceableGroup();
        } else if (i2 == 2) {
            composer.startReplaceableGroup(-27036704);
            pairOLrzqt = C56390yDp.OLrzqt(Color.m3139boximpl(ColorResources_androidKt.colorResource(C23274hvD.StateListAnimator.AubY, composer, 0)), Color.m3139boximpl(ColorResources_androidKt.colorResource(C23274hvD.StateListAnimator.AuCTelauCTel, composer, 0)));
            composer.endReplaceableGroup();
        } else {
            if (i2 != 3) {
                composer.startReplaceableGroup(-27042991);
                composer.endReplaceableGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceableGroup(-27031744);
            pairOLrzqt = C56390yDp.OLrzqt(Color.m3139boximpl(ColorResources_androidKt.colorResource(C23274hvD.StateListAnimator.getFieldNames, composer, 0)), Color.m3139boximpl(ColorResources_androidKt.colorResource(C23274hvD.StateListAnimator.uzCIH, composer, 0)));
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pairOLrzqt;
    }

    public static final long EZpvd(SignalMultiplierTagType signalMultiplierTagType, Composer composer, int i) {
        int i2;
        composer.startReplaceableGroup(101462856);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(101462856, i, -1, "com.okinc.business.market.features.scanner.surge.ui.rememberBadgeBorderColor (SignalGemsComposable.kt:158)");
        }
        int i3 = StateListAnimator.EZpvd[signalMultiplierTagType.ordinal()];
        if (i3 == 1) {
            i2 = C23274hvD.StateListAnimator.hDKMBd;
        } else if (i3 == 2) {
            i2 = C23274hvD.StateListAnimator.zsXlph;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = C23274hvD.StateListAnimator.ejfBZ;
        }
        long jColorResource = ColorResources_androidKt.colorResource(i2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jColorResource;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(final Modifier modifier, final C29295kqu c29295kqu, final Function1<? super TokenBase, Unit> function1, float f, Composer composer, final int i, final int i2) {
        int i3;
        float f2;
        int i4;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        java.lang.Object objRememberedValue2;
        java.lang.Object objRememberedValue3;
        java.lang.Object objRememberedValue4;
        java.lang.Object objRememberedValue5;
        java.lang.Object objRememberedValue6;
        boolean z;
        int i5;
        boolean z2;
        java.lang.Object objRememberedValue7;
        java.lang.Object objRememberedValue8;
        final C29295kqu c29295kqu2;
        boolean z3;
        java.lang.Object objRememberedValue9;
        boolean z4;
        java.lang.Object objRememberedValue10;
        final float f3;
        java.lang.Object objRememberedValue11;
        boolean z5;
        java.lang.Object objRememberedValue12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-219061798);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(c29295kqu) : composerStartRestartGroup.changedInstance(c29295kqu) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 3072) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                float f4 = i6 == 0 ? 1.0f : f2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-219061798, i4, -1, "com.okinc.business.market.features.scanner.surge.ui.ExpandedGemItem (SignalGemsComposable.kt:174)");
                }
                kotlin.Pair<Color, Color> pairCopydefault = copydefault(c29295kqu.AEQbTJ().AEQbTJ(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(1008204918);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = androidx.compose.ui.unit.Dp.m5412boximpl(androidx.compose.ui.unit.Dp.m5414constructorimpl(56.0f));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                float fM5428unboximpl = ((androidx.compose.ui.unit.Dp) objRememberedValue).m5428unboximpl();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1008206741);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = androidx.compose.ui.unit.Dp.m5412boximpl(androidx.compose.ui.unit.Dp.m5414constructorimpl(76.0f));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                float fM5428unboximpl2 = ((androidx.compose.ui.unit.Dp) objRememberedValue2).m5428unboximpl();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1008208767);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = androidx.compose.ui.unit.Dp.m5412boximpl(androidx.compose.ui.unit.Dp.m5414constructorimpl(12.0f));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                float fM5428unboximpl3 = ((androidx.compose.ui.unit.Dp) objRememberedValue3).m5428unboximpl();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1008211070);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = androidx.compose.ui.unit.Dp.m5412boximpl(androidx.compose.ui.unit.Dp.m5414constructorimpl(2.4f));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                float fM5428unboximpl4 = ((androidx.compose.ui.unit.Dp) objRememberedValue4).m5428unboximpl();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1008214776);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(fM5428unboximpl3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                RoundedCornerShape roundedCornerShape = (RoundedCornerShape) objRememberedValue5;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1008217906);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(fM5428unboximpl3 - androidx.compose.ui.unit.Dp.m5414constructorimpl(fM5428unboximpl4)));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                RoundedCornerShape roundedCornerShape2 = (RoundedCornerShape) objRememberedValue6;
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM704height3ABfNKs = SizeKt.m704height3ABfNKs(SizeKt.m723width3ABfNKs(modifier, fM5428unboximpl), fM5428unboximpl2);
                composerStartRestartGroup.startReplaceableGroup(1008226233);
                z = (i4 & FaceDetector.NUM_BOXES) != 256;
                i5 = i4 & WalletImportError.ERROR_CODE_AA_EXIST;
                z2 = i5 != 32 || ((i4 & 64) != 0 && composerStartRestartGroup.changedInstance(c29295kqu));
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!(z | z2) || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: o.krh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C29332kre.EZpvd(function1, c29295kqu);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierNoHighlightClickable$default = C29347krt.noHighlightClickable$default(modifierM704height3ABfNKs, false, (Function0) objRememberedValue7, 1, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf = LayoutKt.materializerOf(modifierNoHighlightClickable$default);
                float f5 = f4;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, density, companion3.getSetDensity());
                Updater.m2790setimpl(composerM2783constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                Updater.m2790setimpl(composerM2783constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                yhoMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion4 = Modifier.Companion;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                Alignment topStart = companion2.getTopStart();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(topStart, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf2 = LayoutKt.materializerOf(modifierFillMaxSize$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl2, density2, companion3.getSetDensity());
                Updater.m2790setimpl(composerM2783constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                Updater.m2790setimpl(composerM2783constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                yhoMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                Modifier modifierM361borderxT4_qwU = BorderKt.m361borderxT4_qwU(ClipKt.clip(SizeKt.m718size3ABfNKs(companion4, fM5428unboximpl), roundedCornerShape), androidx.compose.ui.unit.Dp.m5414constructorimpl(1.2f), pairCopydefault.getSecond().m3159unboximpl(), roundedCornerShape);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration3 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf3 = LayoutKt.materializerOf(modifierM361borderxT4_qwU);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2783constructorimpl3 = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl3, measurePolicyRememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl3, density3, companion3.getSetDensity());
                Updater.m2790setimpl(composerM2783constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
                Updater.m2790setimpl(composerM2783constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                yhoMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                Modifier modifierClip = ClipKt.clip(PaddingKt.m671padding3ABfNKs(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), fM5428unboximpl4), roundedCornerShape2);
                composerStartRestartGroup.startReplaceableGroup(-1152053721);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: o.krn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C29332kre.EZpvd((android.content.Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                Function1 function12 = (Function1) objRememberedValue8;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1152046809);
                if (i5 == 32) {
                    c29295kqu2 = c29295kqu;
                    if ((i4 & 64) == 0 || !composerStartRestartGroup.changedInstance(c29295kqu2)) {
                        z3 = false;
                    }
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = new Function1() { // from class: o.krp
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C29332kre.OLrzqt(c29295kqu2, (android.widget.ImageView) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function12, modifierClip, (Function1) objRememberedValue9, composerStartRestartGroup, 54, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    KWHzl((BoxScope) boxScopeInstance, c29295kqu.AEQbTJ(), true, composerStartRestartGroup, 390, 0);
                    Modifier modifierAlign = boxScopeInstance.align(companion4, companion2.getBottomCenter());
                    composerStartRestartGroup.startReplaceableGroup(1515068808);
                    z4 = (i4 & 7168) != 2048;
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (!z4 || objRememberedValue10 == companion.getEmpty()) {
                        f3 = f5;
                        objRememberedValue10 = new Function1() { // from class: o.kro
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C29332kre.KWHzl(f3, (GraphicsLayerScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    } else {
                        f3 = f5;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierAlign, (Function1) objRememberedValue10);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    androidx.compose.ui.unit.LayoutDirection layoutDirection4 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration4 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf4 = LayoutKt.materializerOf(modifierGraphicsLayer);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2783constructorimpl4 = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl4, measurePolicyRememberBoxMeasurePolicy4, companion3.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl4, density4, companion3.getSetDensity());
                    Updater.m2790setimpl(composerM2783constructorimpl4, layoutDirection4, companion3.getSetLayoutDirection());
                    Updater.m2790setimpl(composerM2783constructorimpl4, viewConfiguration4, companion3.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    yhoMaterializerOf4.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-1152021516);
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue11 == companion.getEmpty()) {
                        objRememberedValue11 = new Function1() { // from class: o.krl
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C29332kre.copydefault((android.content.Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    Function1 function13 = (Function1) objRememberedValue11;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1152007412);
                    z5 = i5 != 32 || ((i4 & 64) != 0 && composerStartRestartGroup.changedInstance(c29295kqu2));
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (!z5 || objRememberedValue12 == companion.getEmpty()) {
                        objRememberedValue12 = new Function1() { // from class: o.krm
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C29332kre.EZpvd(c29295kqu2, (android.widget.TextView) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function13, null, (Function1) objRememberedValue12, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f2 = f3;
                } else {
                    c29295kqu2 = c29295kqu;
                }
                z3 = true;
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (z3) {
                    objRememberedValue9 = new Function1() { // from class: o.krp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C29332kre.OLrzqt(c29295kqu2, (android.widget.ImageView) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function12, modifierClip, (Function1) objRememberedValue9, composerStartRestartGroup, 54, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    KWHzl((BoxScope) boxScopeInstance, c29295kqu.AEQbTJ(), true, composerStartRestartGroup, 390, 0);
                    Modifier modifierAlign2 = boxScopeInstance.align(companion4, companion2.getBottomCenter());
                    composerStartRestartGroup.startReplaceableGroup(1515068808);
                    if ((i4 & 7168) != 2048) {
                    }
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (z4) {
                        f3 = f5;
                        objRememberedValue10 = new Function1() { // from class: o.kro
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C29332kre.KWHzl(f3, (GraphicsLayerScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(modifierAlign2, (Function1) objRememberedValue10);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy42 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        Density density42 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        androidx.compose.ui.unit.LayoutDirection layoutDirection42 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration42 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        Function0<ComposeUiNode> constructor42 = companion3.getConstructor();
                        yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf42 = LayoutKt.materializerOf(modifierGraphicsLayer2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM2783constructorimpl42 = Updater.m2783constructorimpl(composerStartRestartGroup);
                        Updater.m2790setimpl(composerM2783constructorimpl42, measurePolicyRememberBoxMeasurePolicy42, companion3.getSetMeasurePolicy());
                        Updater.m2790setimpl(composerM2783constructorimpl42, density42, companion3.getSetDensity());
                        Updater.m2790setimpl(composerM2783constructorimpl42, layoutDirection42, companion3.getSetLayoutDirection());
                        Updater.m2790setimpl(composerM2783constructorimpl42, viewConfiguration42, companion3.getSetViewConfiguration());
                        composerStartRestartGroup.enableReusing();
                        yhoMaterializerOf42.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        composerStartRestartGroup.startReplaceableGroup(-1152021516);
                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue11 == companion.getEmpty()) {
                        }
                        Function1 function132 = (Function1) objRememberedValue11;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1152007412);
                        if (i5 != 32) {
                            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                            if (!z5) {
                                objRememberedValue12 = new Function1() { // from class: o.krm
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return C29332kre.EZpvd(c29295kqu2, (android.widget.TextView) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                                composerStartRestartGroup.endReplaceableGroup();
                                AndroidView_androidKt.AndroidView(function132, null, (Function1) objRememberedValue12, composerStartRestartGroup, 6, 2);
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f2 = f3;
                            }
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final float f6 = f2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.krq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C29332kre.OLrzqt(modifier, c29295kqu, function1, f6, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        f2 = f;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            kotlin.Pair<Color, Color> pairCopydefault2 = copydefault(c29295kqu.AEQbTJ().AEQbTJ(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1008204918);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
            }
            float fM5428unboximpl5 = ((androidx.compose.ui.unit.Dp) objRememberedValue).m5428unboximpl();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1008206741);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            float fM5428unboximpl22 = ((androidx.compose.ui.unit.Dp) objRememberedValue2).m5428unboximpl();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1008208767);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            float fM5428unboximpl32 = ((androidx.compose.ui.unit.Dp) objRememberedValue3).m5428unboximpl();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1008211070);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            float fM5428unboximpl42 = ((androidx.compose.ui.unit.Dp) objRememberedValue4).m5428unboximpl();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1008214776);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
            }
            RoundedCornerShape roundedCornerShape3 = (RoundedCornerShape) objRememberedValue5;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1008217906);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
            }
            RoundedCornerShape roundedCornerShape22 = (RoundedCornerShape) objRememberedValue6;
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM704height3ABfNKs2 = SizeKt.m704height3ABfNKs(SizeKt.m723width3ABfNKs(modifier, fM5428unboximpl5), fM5428unboximpl22);
            composerStartRestartGroup.startReplaceableGroup(1008226233);
            if ((i4 & FaceDetector.NUM_BOXES) != 256) {
            }
            i5 = i4 & WalletImportError.ERROR_CODE_AA_EXIST;
            if (i5 != 32) {
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!(z | z2)) {
                    objRememberedValue7 = new Function0() { // from class: o.krh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C29332kre.EZpvd(function1, c29295kqu);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierNoHighlightClickable$default2 = C29347krt.noHighlightClickable$default(modifierM704height3ABfNKs2, false, (Function0) objRememberedValue7, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion22 = Alignment.Companion;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion22.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    androidx.compose.ui.unit.LayoutDirection layoutDirection5 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration5 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion32 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor5 = companion32.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf5 = LayoutKt.materializerOf(modifierNoHighlightClickable$default2);
                    float f52 = f4;
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2783constructorimpl5 = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl5, measurePolicyRememberBoxMeasurePolicy5, companion32.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl5, density5, companion32.getSetDensity());
                    Updater.m2790setimpl(composerM2783constructorimpl5, layoutDirection5, companion32.getSetLayoutDirection());
                    Updater.m2790setimpl(composerM2783constructorimpl5, viewConfiguration5, companion32.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    yhoMaterializerOf5.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion42 = Modifier.Companion;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null);
                    Alignment topStart2 = companion22.getTopStart();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(topStart2, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density22 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    androidx.compose.ui.unit.LayoutDirection layoutDirection22 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration22 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf22 = LayoutKt.materializerOf(modifierFillMaxSize$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2783constructorimpl22 = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl22, measurePolicyRememberBoxMeasurePolicy22, companion32.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl22, density22, companion32.getSetDensity());
                    Updater.m2790setimpl(composerM2783constructorimpl22, layoutDirection22, companion32.getSetLayoutDirection());
                    Updater.m2790setimpl(composerM2783constructorimpl22, viewConfiguration22, companion32.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    yhoMaterializerOf22.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    Modifier modifierM361borderxT4_qwU2 = BorderKt.m361borderxT4_qwU(ClipKt.clip(SizeKt.m718size3ABfNKs(companion42, fM5428unboximpl5), roundedCornerShape3), androidx.compose.ui.unit.Dp.m5414constructorimpl(1.2f), pairCopydefault2.getSecond().m3159unboximpl(), roundedCornerShape3);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy32 = BoxKt.rememberBoxMeasurePolicy(companion22.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density32 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    androidx.compose.ui.unit.LayoutDirection layoutDirection32 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration32 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf32 = LayoutKt.materializerOf(modifierM361borderxT4_qwU2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2783constructorimpl32 = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl32, measurePolicyRememberBoxMeasurePolicy32, companion32.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl32, density32, companion32.getSetDensity());
                    Updater.m2790setimpl(composerM2783constructorimpl32, layoutDirection32, companion32.getSetLayoutDirection());
                    Updater.m2790setimpl(composerM2783constructorimpl32, viewConfiguration32, companion32.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    yhoMaterializerOf32.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    Modifier modifierClip2 = ClipKt.clip(PaddingKt.m671padding3ABfNKs(SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null), fM5428unboximpl42), roundedCornerShape22);
                    composerStartRestartGroup.startReplaceableGroup(-1152053721);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                    }
                    Function1 function122 = (Function1) objRememberedValue8;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1152046809);
                    if (i5 == 32) {
                    }
                    z3 = true;
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (z3) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final Unit EZpvd(Function1 function1, C29295kqu c29295kqu) {
        function1.invoke(c29295kqu.copydefault());
        return Unit.INSTANCE;
    }

    public static final android.widget.ImageView EZpvd(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    public static final Unit OLrzqt(C29295kqu c29295kqu, android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "");
        C57659ymb.EZpvd(imageView, c29295kqu.valueOf(), C52761wXj.TaskDescription.dzCpvv);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(float f, GraphicsLayerScope graphicsLayerScope) {
        Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setAlpha(f);
        return Unit.INSTANCE;
    }

    public static final android.widget.TextView copydefault(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextAppearance(C52761wXj.LoaderManager.QOLQEE);
        textView.setTextColor(C25382ivf.copydefault(C52761wXj.Activity.Dmq, context));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        return textView;
    }

    public static final Unit EZpvd(C29295kqu c29295kqu, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        textView.setText(c29295kqu.gEmmrt());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x030f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(@NotNull final BoxScope boxScope, @NotNull final SignalMultiplierTagUiModel signalMultiplierTagUiModel, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        final boolean z3;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        final int i4;
        int i5;
        float f;
        boolean z4;
        java.lang.Object objRememberedValue2;
        boolean zChanged;
        boolean z5;
        java.lang.Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(boxScope, "");
        Intrinsics.checkNotNullParameter(signalMultiplierTagUiModel, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(513891019);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(signalMultiplierTagUiModel) ? 32 : 16;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
            }
            if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) == 146 || !composerStartRestartGroup.getSkipping()) {
                z3 = i6 == 0 ? false : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(513891019, i3, -1, "com.okinc.business.market.features.scanner.surge.ui.ExpandedGemBadge (SignalGemsComposable.kt:254)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1280443856);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = RoundedCornerShapeKt.m926RoundedCornerShapea9UjIt4$default(0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(z3 ? 8 : 12), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(z3 ? 8 : 12), 5, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                RoundedCornerShape roundedCornerShape = (RoundedCornerShape) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                long jEZpvd = EZpvd(signalMultiplierTagUiModel.AEQbTJ(), composerStartRestartGroup, 0);
                kotlin.Pair<Color, Color> pairCopydefault = copydefault(signalMultiplierTagUiModel.AEQbTJ(), composerStartRestartGroup, 0);
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier modifierM725widthInVpY3zN4$default = SizeKt.m725widthInVpY3zN4$default(SizeKt.m704height3ABfNKs(companion2, androidx.compose.ui.unit.Dp.m5414constructorimpl(!z3 ? 13 : 16)), androidx.compose.ui.unit.Dp.m5414constructorimpl(!z3 ? 29 : 36), 0.0f, 2, null);
                Alignment.Companion companion3 = Alignment.Companion;
                Modifier modifierAlign = boxScope.align(modifierM725widthInVpY3zN4$default, companion3.getTopEnd());
                float fM5414constructorimpl = androidx.compose.ui.unit.Dp.m5414constructorimpl(1);
                Brush.Companion companion4 = Brush.Companion;
                Modifier modifierBackground$default = BackgroundKt.background$default(ClipKt.clip(BorderKt.m363borderziNgDLE(modifierAlign, fM5414constructorimpl, Brush.Companion.m3098horizontalGradient8A3gB4$default(companion4, yDY.gEmmrt(Color.m3139boximpl(Color.m3148copywmQWz5c$default(jEZpvd, 1.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3139boximpl(Color.m3148copywmQWz5c$default(jEZpvd, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (java.lang.Object) null), roundedCornerShape), roundedCornerShape), Brush.Companion.m3098horizontalGradient8A3gB4$default(companion4, yDY.gEmmrt(pairCopydefault.getFirst(), pairCopydefault.getSecond()), 0.0f, 0.0f, 0, 14, (java.lang.Object) null), null, 0.0f, 6, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion5.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf = LayoutKt.materializerOf(modifierBackground$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, density, companion5.getSetDensity());
                Updater.m2790setimpl(composerM2783constructorimpl, layoutDirection, companion5.getSetLayoutDirection());
                Updater.m2790setimpl(composerM2783constructorimpl, viewConfiguration, companion5.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                yhoMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                i4 = C23274hvD.StateListAnimator.QKVWgx;
                Modifier modifierAlign2 = boxScopeInstance.align(companion2, companion3.getCenter());
                if (z3) {
                    i5 = 4;
                    f = 8;
                } else {
                    i5 = 4;
                    f = 4;
                }
                float fM5414constructorimpl2 = androidx.compose.ui.unit.Dp.m5414constructorimpl(f);
                if (!z3) {
                    i5 = 6;
                }
                float f2 = (float) 1.5d;
                Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(PaddingKt.m674paddingqDBjuR0(modifierAlign2, fM5414constructorimpl2, androidx.compose.ui.unit.Dp.m5414constructorimpl(f2), androidx.compose.ui.unit.Dp.m5414constructorimpl(i5), androidx.compose.ui.unit.Dp.m5414constructorimpl(f2)), null, false, 3, null);
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf2 = LayoutKt.materializerOf(modifierWrapContentWidth$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl2, density2, companion5.getSetDensity());
                Updater.m2790setimpl(composerM2783constructorimpl2, layoutDirection2, companion5.getSetLayoutDirection());
                Updater.m2790setimpl(composerM2783constructorimpl2, viewConfiguration2, companion5.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                yhoMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(1306783652);
                z4 = (i3 & FaceDetector.NUM_BOXES) != 256;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z4 || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: o.kru
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C29332kre.KWHzl(z3, (android.content.Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1306795872);
                zChanged = composerStartRestartGroup.changed(i4);
                z5 = (i3 & WalletImportError.ERROR_CODE_AA_EXIST) != 32;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(zChanged | z5) || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: o.krk
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C29332kre.EZpvd(i4, signalMultiplierTagUiModel, (android.widget.TextView) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function1, null, (Function1) objRememberedValue3, composerStartRestartGroup, 0, 2);
                ImageKt.Image(PainterResources_androidKt.painterResource(C23274hvD.ActionBar.fvQaOB, composerStartRestartGroup, 0), (java.lang.String) null, SizeKt.m718size3ABfNKs(companion2, androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 8.5d)), (Alignment) null, ContentScale.Companion.getFillHeight(), 0.0f, ColorFilter.Companion.m3193tintxETnrds(ColorResources_androidKt.colorResource(i4, composerStartRestartGroup, 0), BlendMode.Companion.m3091getSrcIn0nO6VwU()), composerStartRestartGroup, 25008, 40);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z2 = z3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final boolean z6 = z2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.krg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C29332kre.OLrzqt(boxScope, signalMultiplierTagUiModel, z6, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= MLKEMEngine.KyberPolyBytes;
        z2 = z;
        if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceableGroup(-1280443856);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
            }
            RoundedCornerShape roundedCornerShape2 = (RoundedCornerShape) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            long jEZpvd2 = EZpvd(signalMultiplierTagUiModel.AEQbTJ(), composerStartRestartGroup, 0);
            kotlin.Pair<Color, Color> pairCopydefault2 = copydefault(signalMultiplierTagUiModel.AEQbTJ(), composerStartRestartGroup, 0);
            Modifier.Companion companion22 = Modifier.Companion;
            Modifier modifierM725widthInVpY3zN4$default2 = SizeKt.m725widthInVpY3zN4$default(SizeKt.m704height3ABfNKs(companion22, androidx.compose.ui.unit.Dp.m5414constructorimpl(!z3 ? 13 : 16)), androidx.compose.ui.unit.Dp.m5414constructorimpl(!z3 ? 29 : 36), 0.0f, 2, null);
            Alignment.Companion companion32 = Alignment.Companion;
            Modifier modifierAlign3 = boxScope.align(modifierM725widthInVpY3zN4$default2, companion32.getTopEnd());
            float fM5414constructorimpl3 = androidx.compose.ui.unit.Dp.m5414constructorimpl(1);
            Brush.Companion companion42 = Brush.Companion;
            Modifier modifierBackground$default2 = BackgroundKt.background$default(ClipKt.clip(BorderKt.m363borderziNgDLE(modifierAlign3, fM5414constructorimpl3, Brush.Companion.m3098horizontalGradient8A3gB4$default(companion42, yDY.gEmmrt(Color.m3139boximpl(Color.m3148copywmQWz5c$default(jEZpvd2, 1.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3139boximpl(Color.m3148copywmQWz5c$default(jEZpvd2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (java.lang.Object) null), roundedCornerShape2), roundedCornerShape2), Brush.Companion.m3098horizontalGradient8A3gB4$default(companion42, yDY.gEmmrt(pairCopydefault2.getFirst(), pairCopydefault2.getSecond()), 0.0f, 0.0f, 0, 14, (java.lang.Object) null), null, 0.0f, 6, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion32.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration3 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion52 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor3 = companion52.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf3 = LayoutKt.materializerOf(modifierBackground$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2783constructorimpl3 = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion52.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl3, density3, companion52.getSetDensity());
            Updater.m2790setimpl(composerM2783constructorimpl3, layoutDirection3, companion52.getSetLayoutDirection());
            Updater.m2790setimpl(composerM2783constructorimpl3, viewConfiguration3, companion52.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            yhoMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            i4 = C23274hvD.StateListAnimator.QKVWgx;
            Modifier modifierAlign22 = boxScopeInstance2.align(companion22, companion32.getCenter());
            if (z3) {
            }
            float fM5414constructorimpl22 = androidx.compose.ui.unit.Dp.m5414constructorimpl(f);
            if (!z3) {
            }
            float f22 = (float) 1.5d;
            Modifier modifierWrapContentWidth$default2 = SizeKt.wrapContentWidth$default(PaddingKt.m674paddingqDBjuR0(modifierAlign22, fM5414constructorimpl22, androidx.compose.ui.unit.Dp.m5414constructorimpl(f22), androidx.compose.ui.unit.Dp.m5414constructorimpl(i5), androidx.compose.ui.unit.Dp.m5414constructorimpl(f22)), null, false, 3, null);
            Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically2 = companion32.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center2, centerVertically2, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density22 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            androidx.compose.ui.unit.LayoutDirection layoutDirection22 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration22 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor22 = companion52.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf22 = LayoutKt.materializerOf(modifierWrapContentWidth$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2783constructorimpl22 = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl22, measurePolicyRowMeasurePolicy2, companion52.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl22, density22, companion52.getSetDensity());
            Updater.m2790setimpl(composerM2783constructorimpl22, layoutDirection22, companion52.getSetLayoutDirection());
            Updater.m2790setimpl(composerM2783constructorimpl22, viewConfiguration22, companion52.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            yhoMaterializerOf22.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(1306783652);
            if ((i3 & FaceDetector.NUM_BOXES) != 256) {
            }
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!z4) {
                objRememberedValue2 = new Function1() { // from class: o.kru
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29332kre.KWHzl(z3, (android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                Function1 function12 = (Function1) objRememberedValue2;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1306795872);
                zChanged = composerStartRestartGroup.changed(i4);
                if ((i3 & WalletImportError.ERROR_CODE_AA_EXIST) != 32) {
                }
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(zChanged | z5)) {
                    objRememberedValue3 = new Function1() { // from class: o.krk
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C29332kre.EZpvd(i4, signalMultiplierTagUiModel, (android.widget.TextView) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView(function12, null, (Function1) objRememberedValue3, composerStartRestartGroup, 0, 2);
                    ImageKt.Image(PainterResources_androidKt.painterResource(C23274hvD.ActionBar.fvQaOB, composerStartRestartGroup, 0), (java.lang.String) null, SizeKt.m718size3ABfNKs(companion22, androidx.compose.ui.unit.Dp.m5414constructorimpl((float) 8.5d)), (Alignment) null, ContentScale.Companion.getFillHeight(), 0.0f, ColorFilter.Companion.m3193tintxETnrds(ColorResources_androidKt.colorResource(i4, composerStartRestartGroup, 0), BlendMode.Companion.m3091getSrcIn0nO6VwU()), composerStartRestartGroup, 25008, 40);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z2 = z3;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final android.widget.TextView KWHzl(boolean z, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextAppearance(C52761wXj.LoaderManager.QKVWgx);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextSize(z ? 8.0f : 10.0f);
        return textView;
    }

    public static final Unit EZpvd(int i, SignalMultiplierTagUiModel signalMultiplierTagUiModel, android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setTextColor(C25382ivf.copydefault(i, context));
        android.content.Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView.setText(C33069mpW.KWHzl(context2, C23274hvD.Fragment.DcMfJKfNLfdT, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", signalMultiplierTagUiModel.KWHzl()))));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final java.util.List list, final Function1 function1, final float f, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "");
        lazyListScope.items(list.size(), null, new Function1<java.lang.Integer, java.lang.Object>() { // from class: com.okinc.business.market.features.scanner.surge.ui.SignalGemsComposableKt$ExpandedGemsView$lambda$7$lambda$6$$inlined$itemsIndexed$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new yHT<LazyItemScope, java.lang.Integer, Composer, java.lang.Integer, Unit>() { // from class: com.okinc.business.market.features.scanner.surge.ui.SignalGemsComposableKt$ExpandedGemsView$lambda$7$lambda$6$$inlined$itemsIndexed$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHT
            public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(lazyItemScope, "");
                if ((i2 & 14) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & 731) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                }
                C29295kqu c29295kqu = (C29295kqu) list.get(i);
                composer.startReplaceableGroup(307801665);
                C29332kre.KWHzl(ZIndexModifierKt.zIndex(Modifier.Companion, i), c29295kqu, (Function1<? super TokenBase, Unit>) function1, f, composer, TokenBase.$stable << 3, 0);
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}

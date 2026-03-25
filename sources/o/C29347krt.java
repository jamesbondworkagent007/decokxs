package o;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.data.model.common.ChainInfoData;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType;
import com.okinc.business.market.features.scanner.surge.trending.data.TrendingConfigData;
import com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter;
import com.okinc.business.market.features.scanner.surge.ui.FilterType;
import com.okinc.business.market.features.scanner.surge.ui.SurgeTabComposableKt$SurgeScreen$10$1$1;
import com.okinc.business.market.features.scanner.surge.ui.SurgeTabComposableKt$SurgeScreen$9$1;
import com.okinc.business.market.features.scanner.surge.ui.SurgeTabComposableKt$TrendingSection$1$2$1;
import com.okinc.business.market.features.scanner.surge.ui.SurgeTabViewModel;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneyConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC22421hez;
import o.C23274hvD;
import o.C29347krt;
import o.C52761wXj;
import o.C57406yhn;
import o.InterfaceC29359ksE;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.krt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29347krt {

    /* JADX INFO: renamed from: o.krt$AssistContent */
    public final /* synthetic */ class AssistContent {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[FilterType.values().length];
            try {
                iArr2[FilterType.TOKEN_AGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[FilterType.VOLUME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[FilterType.MARKET_CAP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[FilterType.KEYWORD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(java.lang.String str, Function0 function0, int i, Composer composer, int i2) {
        OLrzqt(str, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(java.util.List list, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, Composer composer, int i2) {
        KWHzl((java.util.List<C29250kqB>) list, (Function1<? super TokenBase, Unit>) function1, (Function1<? super C29250kqB, Unit>) function12, (Function1<? super C29250kqB, Unit>) function13, (Function1<? super TokenBase, Unit>) function14, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(Function0 function0, int i, Composer composer, int i2) {
        AEQbTJ((Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(boolean z, int i, int i2, Composer composer, int i3) {
        EZpvd(z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit AEQbTJ(boolean z, Function0 function0, int i, Composer composer, int i2) {
        copydefault(z, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final boolean AEQbTJ(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit EZpvd(TrendingFilter trendingFilter, Function1 function1, int i, Composer composer, int i2) {
        AEQbTJ(trendingFilter, (Function1<? super FilterType, Unit>) function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(RowScope rowScope, int i, Composer composer, int i2) {
        KWHzl(rowScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(SurgeTabViewModel surgeTabViewModel, Function0 function0, Function0 function02, Function1 function1, Function1 function12, Function0 function03, Function2 function2, Function0 function04, int i, int i2, Composer composer, int i3) {
        AEQbTJ(surgeTabViewModel, function0, function02, function1, function12, function03, function2, function04, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, Function0 function0, int i, int i2, Composer composer, int i3) {
        EZpvd(str, str2, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(SurgeTabViewModel surgeTabViewModel, Function0 function0, Function0 function02, Function1 function1, Function2 function2, int i, Composer composer, int i2) {
        KWHzl(surgeTabViewModel, (Function0<Unit>) function0, (Function0<Unit>) function02, (Function1<? super TokenBase, Unit>) function1, (Function2<? super C29250kqB, ? super TokenDetailTabType, Unit>) function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(java.lang.String str, Function0 function0, int i, Composer composer, int i2) {
        KWHzl(str, (Function0<Unit>) function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final boolean OLrzqt(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit copydefault(int i, Composer composer, int i2) {
        KWHzl(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.krt$Dialog */
    public static final class Dialog implements DisposableEffectResult {
        public final /* synthetic */ MutableState EZpvd;

        public Dialog(MutableState mutableState) {
            this.EZpvd = mutableState;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            android.view.View viewOLrzqt = C29347krt.OLrzqt((MutableState<android.view.View>) this.EZpvd);
            if (viewOLrzqt != null) {
                C55418xja.EZpvd(viewOLrzqt);
            }
            C29347krt.OLrzqt((MutableState<android.view.View>) this.EZpvd, (android.view.View) null);
        }
    }

    /* JADX INFO: renamed from: o.krt$PendingIntent */
    public static final class PendingIntent implements DisposableEffectResult {
        public final /* synthetic */ LifecycleOwner EZpvd;
        public final /* synthetic */ LifecycleEventObserver OLrzqt;

        public PendingIntent(LifecycleOwner lifecycleOwner, LifecycleEventObserver lifecycleEventObserver) {
            this.EZpvd = lifecycleOwner;
            this.OLrzqt = lifecycleEventObserver;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.EZpvd.getLifecycle().removeObserver(this.OLrzqt);
        }
    }

    /* JADX INFO: renamed from: o.krt$TaskStackBuilder */
    public static final class TaskStackBuilder implements DisposableEffectResult {
        public final /* synthetic */ MutableState EZpvd;

        public TaskStackBuilder(MutableState mutableState) {
            this.EZpvd = mutableState;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            android.view.View viewEZpvd = C29347krt.EZpvd((MutableState<android.view.View>) this.EZpvd);
            if (viewEZpvd != null) {
                C55418xja.EZpvd(viewEZpvd);
            }
            C29347krt.copydefault((MutableState<android.view.View>) this.EZpvd, (android.view.View) null);
        }
    }

    public static final Unit gEmmrt() {
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL() {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(boolean z) {
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna() {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C29250kqB c29250kqB, TokenDetailTabType tokenDetailTabType) {
        Intrinsics.checkNotNullParameter(c29250kqB, "");
        Intrinsics.checkNotNullParameter(tokenDetailTabType, "");
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x02e2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(@NotNull final SurgeTabViewModel surgeTabViewModel, Function0<Unit> function0, Function0<Unit> function02, Function1<? super TokenBase, Unit> function1, Function1<? super java.lang.Boolean, Unit> function12, Function0<Unit> function03, Function2<? super C29250kqB, ? super TokenDetailTabType, Unit> function2, Function0<Unit> function04, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function05;
        int i4;
        Function0<Unit> function06;
        int i5;
        Function1<? super TokenBase, Unit> function13;
        int i6;
        int i7;
        final Function0<Unit> function07;
        int i8;
        Function2<? super C29250kqB, ? super TokenDetailTabType, Unit> function22;
        int i9;
        java.lang.String str;
        Function1<? super java.lang.Boolean, Unit> function14;
        Function0<Unit> function08;
        Function2<? super C29250kqB, ? super TokenDetailTabType, Unit> function23;
        Function0<Unit> function09;
        final LifecycleOwner lifecycleOwner;
        boolean zChangedInstance;
        boolean zChangedInstance2;
        java.lang.Object objRememberedValue;
        ScrollState scrollStateRememberScrollState;
        android.view.View view;
        java.lang.Object objRememberedValue2;
        Composer.Companion companion;
        int iIntValue;
        boolean zChanged;
        java.lang.Object objRememberedValue3;
        android.view.ViewParent parent;
        boolean z;
        boolean z2;
        ViewPager2 viewPager2;
        androidx.compose.runtime.State stateCollectAsState;
        androidx.compose.runtime.State stateCollectAsState2;
        java.util.List<C29295kqu> listOLrzqt;
        Function0<Unit> function010;
        boolean z3;
        boolean zChanged2;
        java.lang.Object objRememberedValue4;
        java.lang.Object obj;
        Modifier.Companion companion2;
        Alignment.Companion companion3;
        ComposeUiNode.Companion companion4;
        Function0<Unit> function011;
        boolean zChangedInstance3;
        java.lang.Object objRememberedValue5;
        Arrangement arrangement;
        MarketChainBean marketChainBean;
        java.util.List<MarketChainBean> listCopydefault;
        java.lang.Object next;
        final Function2<? super C29250kqB, ? super TokenDetailTabType, Unit> function24;
        final Function0<Unit> function012;
        final Function1<? super TokenBase, Unit> function15;
        final Function1<? super java.lang.Boolean, Unit> function16;
        final Function0<Unit> function013;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(surgeTabViewModel, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1921776229);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(surgeTabViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function05 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function05) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else {
                if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                    function06 = function02;
                    i3 |= composerStartRestartGroup.changedInstance(function06) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function13 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function13) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            function07 = function03;
                        } else {
                            function07 = function03;
                            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function07) ? 131072 : 65536;
                            }
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                            function22 = function2;
                        } else {
                            function22 = function2;
                            if ((i & 1572864) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                            }
                        }
                        i9 = i2 & 128;
                        if (i9 == 0) {
                            if ((i & 12582912) == 0) {
                                str = "";
                                i3 |= composerStartRestartGroup.changedInstance(function04) ? 8388608 : 4194304;
                            }
                            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                if (i10 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(59034886);
                                    java.lang.Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue6 == Composer.Companion.getEmpty()) {
                                        objRememberedValue6 = new Function0() { // from class: o.krG
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return C29347krt.gEmmrt();
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    function05 = (Function0) objRememberedValue6;
                                }
                                if (i4 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(59036038);
                                    java.lang.Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue7 == Composer.Companion.getEmpty()) {
                                        objRememberedValue7 = new Function0() { // from class: o.krF
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return C29347krt.djBIcL();
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    function06 = (Function0) objRememberedValue7;
                                }
                                if (i5 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(59037542);
                                    java.lang.Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue8 == Composer.Companion.getEmpty()) {
                                        objRememberedValue8 = new Function1() { // from class: o.krI
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                                return C29347krt.KWHzl((TokenBase) obj2);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    function13 = (Function1) objRememberedValue8;
                                }
                                if (i6 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(59039238);
                                    java.lang.Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue9 == Composer.Companion.getEmpty()) {
                                        objRememberedValue9 = new Function1() { // from class: o.krL
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                                return C29347krt.EZpvd(((java.lang.Boolean) obj2).booleanValue());
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                    }
                                    function14 = (Function1) objRememberedValue9;
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    function14 = function12;
                                }
                                if (i7 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(59040422);
                                    java.lang.Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue10 == Composer.Companion.getEmpty()) {
                                        objRememberedValue10 = new Function0() { // from class: o.krM
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return C29347krt.AhwBna();
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                    }
                                    function08 = (Function0) objRememberedValue10;
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    function08 = function07;
                                }
                                if (i8 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(59043343);
                                    java.lang.Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue11 == Composer.Companion.getEmpty()) {
                                        objRememberedValue11 = new Function2() { // from class: o.krK
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                                return C29347krt.copydefault((C29250kqB) obj2, (TokenDetailTabType) obj3);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                    }
                                    function23 = (Function2) objRememberedValue11;
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    function23 = function22;
                                }
                                if (i9 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(59045126);
                                    java.lang.Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue12 == Composer.Companion.getEmpty()) {
                                        objRememberedValue12 = new Function0() { // from class: o.krO
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return C29347krt.AYXKKw();
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                                    }
                                    function09 = (Function0) objRememberedValue12;
                                    composerStartRestartGroup.endReplaceableGroup();
                                } else {
                                    function09 = function04;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1921776229, i3, -1, "com.okinc.business.market.features.scanner.surge.ui.SurgeScreen (SurgeTabComposable.kt:121)");
                                }
                                lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                                composerStartRestartGroup.startReplaceableGroup(59049159);
                                zChangedInstance = composerStartRestartGroup.changedInstance(surgeTabViewModel);
                                zChangedInstance2 = composerStartRestartGroup.changedInstance(lifecycleOwner);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!(zChangedInstance | zChangedInstance2) || objRememberedValue == Composer.Companion.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: o.krN
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj2) {
                                            return C29347krt.copydefault(lifecycleOwner, surgeTabViewModel, (DisposableEffectScope) obj2);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                                final android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                view = (android.view.View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                                composerStartRestartGroup.startReplaceableGroup(59093087);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                companion = Composer.Companion;
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = java.lang.Integer.valueOf(android.view.ViewConfiguration.get(context).getScaledTouchSlop());
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                iIntValue = ((java.lang.Number) objRememberedValue2).intValue();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(59096110);
                                zChanged = composerStartRestartGroup.changed(view);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                                    parent = view.getParent();
                                    while (true) {
                                        if (parent != null) {
                                            objRememberedValue3 = null;
                                            break;
                                        }
                                        if (parent instanceof ViewPager2) {
                                            InterfaceC25414iwK interfaceC25414iwK = (InterfaceC25414iwK) C43248rlh.KWHzl.OLrzqt(InterfaceC25414iwK.class);
                                            if (interfaceC25414iwK != null) {
                                                z = true;
                                                z2 = interfaceC25414iwK.AYXKKw();
                                                if (!(z2 ^ z)) {
                                                    parent = null;
                                                }
                                                objRememberedValue3 = (ViewPager2) parent;
                                            } else {
                                                z = true;
                                            }
                                            if (!(z2 ^ z)) {
                                            }
                                            objRememberedValue3 = (ViewPager2) parent;
                                        } else {
                                            parent = parent.getParent();
                                        }
                                    }
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                viewPager2 = (ViewPager2) objRememberedValue3;
                                composerStartRestartGroup.endReplaceableGroup();
                                Function2<? super C29250kqB, ? super TokenDetailTabType, Unit> function25 = function23;
                                stateCollectAsState = SnapshotStateKt.collectAsState(surgeTabViewModel.djBIcL(), null, composerStartRestartGroup, 0, 1);
                                Function1<? super TokenBase, Unit> function17 = function13;
                                stateCollectAsState2 = SnapshotStateKt.collectAsState(surgeTabViewModel.gEmmrt(), null, composerStartRestartGroup, 0, 1);
                                C29297kqw c29297kqwCopydefault = copydefault((androidx.compose.runtime.State<C29297kqw>) stateCollectAsState2);
                                listOLrzqt = c29297kqwCopydefault == null ? c29297kqwCopydefault.OLrzqt() : null;
                                if (listOLrzqt == null) {
                                    listOLrzqt = yDY.AhwBna();
                                }
                                int value = scrollStateRememberScrollState.getValue();
                                composerStartRestartGroup.startReplaceableGroup(59114211);
                                function010 = function06;
                                z3 = (57344 & i3) != 16384;
                                zChanged2 = composerStartRestartGroup.changed(scrollStateRememberScrollState);
                                Function0<Unit> function014 = function05;
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if ((!z3 && !zChanged2) || objRememberedValue4 == Composer.Companion.getEmpty()) {
                                    obj = null;
                                    objRememberedValue4 = new SurgeTabComposableKt$SurgeScreen$9$1(function14, scrollStateRememberScrollState, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                } else {
                                    obj = null;
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.LaunchedEffect(java.lang.Integer.valueOf(value), (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue4, composerStartRestartGroup, 0);
                                companion2 = Modifier.Companion;
                                Modifier modifierM350backgroundbw27NRU$default = BackgroundKt.m350backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, obj), ColorResources_androidKt.colorResource(C52761wXj.Activity.EZpvd, composerStartRestartGroup, 0), null, 2, null);
                                composerStartRestartGroup.startReplaceableGroup(733328855);
                                companion3 = Alignment.Companion;
                                Function1<? super java.lang.Boolean, Unit> function18 = function14;
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                Function0<Unit> function015 = function09;
                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                companion4 = ComposeUiNode.Companion;
                                java.util.List<C29295kqu> list = listOLrzqt;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf = LayoutKt.materializerOf(modifierM350backgroundbw27NRU$default);
                                function011 = function08;
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
                                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m2790setimpl(composerM2783constructorimpl, density, companion4.getSetDensity());
                                Updater.m2790setimpl(composerM2783constructorimpl, layoutDirection, companion4.getSetLayoutDirection());
                                Updater.m2790setimpl(composerM2783constructorimpl, viewConfiguration, companion4.getSetViewConfiguration());
                                composerStartRestartGroup.enableReusing();
                                yhoMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                composerStartRestartGroup.startReplaceableGroup(622592242);
                                zChangedInstance3 = composerStartRestartGroup.changedInstance(viewPager2);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                                    objRememberedValue5 = new SurgeTabComposableKt$SurgeScreen$10$1$1(viewPager2, iIntValue, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxSize$default, viewPager2, java.lang.Integer.valueOf(iIntValue), (Function2) objRememberedValue5), scrollStateRememberScrollState, false, null, false, 14, null);
                                composerStartRestartGroup.startReplaceableGroup(-483455358);
                                arrangement = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf2 = LayoutKt.materializerOf(modifierVerticalScroll$default);
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
                                Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m2790setimpl(composerM2783constructorimpl2, density2, companion4.getSetDensity());
                                Updater.m2790setimpl(composerM2783constructorimpl2, layoutDirection2, companion4.getSetLayoutDirection());
                                Updater.m2790setimpl(composerM2783constructorimpl2, viewConfiguration2, companion4.getSetViewConfiguration());
                                composerStartRestartGroup.enableReusing();
                                yhoMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                if (OLrzqt((androidx.compose.runtime.State<SmartMoneyConfig>) stateCollectAsState) != null && copydefault((androidx.compose.runtime.State<C29297kqw>) stateCollectAsState2) == null) {
                                    composerStartRestartGroup.startReplaceableGroup(836581529);
                                    EZpvd(true, composerStartRestartGroup, 6, 0);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    function07 = function011;
                                } else {
                                    composerStartRestartGroup.startReplaceableGroup(836716596);
                                    Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, false, 3, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(8), 0.0f, 0.0f, 13, null);
                                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                    Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration3 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf3 = LayoutKt.materializerOf(modifierM675paddingqDBjuR0$default);
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
                                    Updater.m2790setimpl(composerM2783constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                                    Updater.m2790setimpl(composerM2783constructorimpl3, density3, companion4.getSetDensity());
                                    Updater.m2790setimpl(composerM2783constructorimpl3, layoutDirection3, companion4.getSetLayoutDirection());
                                    Updater.m2790setimpl(composerM2783constructorimpl3, viewConfiguration3, companion4.getSetViewConfiguration());
                                    composerStartRestartGroup.enableReusing();
                                    yhoMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                    Modifier modifierM673paddingVpY3zN4$default = PaddingKt.m673paddingVpY3zN4$default(SizeKt.m704height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(48)), androidx.compose.ui.unit.Dp.m5414constructorimpl(24), 0.0f, 2, null);
                                    Alignment centerStart = companion3.getCenterStart();
                                    composerStartRestartGroup.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
                                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                    Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection4 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration4 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                    Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf4 = LayoutKt.materializerOf(modifierM673paddingVpY3zN4$default);
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
                                    Updater.m2790setimpl(composerM2783constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                                    Updater.m2790setimpl(composerM2783constructorimpl4, density4, companion4.getSetDensity());
                                    Updater.m2790setimpl(composerM2783constructorimpl4, layoutDirection4, companion4.getSetLayoutDirection());
                                    Updater.m2790setimpl(composerM2783constructorimpl4, viewConfiguration4, companion4.getSetViewConfiguration());
                                    composerStartRestartGroup.enableReusing();
                                    yhoMaterializerOf4.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                                    int i11 = i3 >> 15;
                                    function07 = function011;
                                    AEQbTJ(function07, composerStartRestartGroup, i11 & 14);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    if (copydefault((androidx.compose.runtime.State<C29297kqw>) stateCollectAsState2) != null) {
                                        composerStartRestartGroup.startReplaceableGroup(-1101583103);
                                        EZpvd(false, composerStartRestartGroup, 6, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else if (list.isEmpty()) {
                                        composerStartRestartGroup.startReplaceableGroup(-1101431234);
                                        SmartMoneyConfig smartMoneyConfigOLrzqt = OLrzqt((androidx.compose.runtime.State<SmartMoneyConfig>) stateCollectAsState);
                                        if (smartMoneyConfigOLrzqt == null || (listCopydefault = smartMoneyConfigOLrzqt.copydefault()) == null) {
                                            marketChainBean = null;
                                        } else {
                                            java.util.Iterator<T> it = listCopydefault.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it.next();
                                                java.lang.String chainId = ((MarketChainBean) next).getChainId();
                                                SmartMoneyConfig smartMoneyConfigOLrzqt2 = OLrzqt((androidx.compose.runtime.State<SmartMoneyConfig>) stateCollectAsState);
                                                if (Intrinsics.EZpvd((java.lang.Object) chainId, (java.lang.Object) (smartMoneyConfigOLrzqt2 != null ? smartMoneyConfigOLrzqt2.KWHzl() : null))) {
                                                    break;
                                                }
                                            }
                                            marketChainBean = (MarketChainBean) next;
                                        }
                                        java.lang.String chainCustomLogo = marketChainBean != null ? marketChainBean.getChainCustomLogo() : null;
                                        if (chainCustomLogo == null) {
                                            chainCustomLogo = str;
                                        }
                                        java.lang.String chainName = marketChainBean != null ? marketChainBean.getChainName() : null;
                                        if (chainName != null) {
                                            str = chainName;
                                        }
                                        EZpvd(chainCustomLogo, str, function015, composerStartRestartGroup, i11 & FaceDetector.NUM_BOXES, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceableGroup(-1100861330);
                                        SpacerKt.Spacer(SizeKt.m704height3ABfNKs(companion2, androidx.compose.ui.unit.Dp.m5414constructorimpl(4)), composerStartRestartGroup, 6);
                                        composerStartRestartGroup.startReplaceableGroup(-174052615);
                                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(context);
                                        java.lang.Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance4 || objRememberedValue13 == Composer.Companion.getEmpty()) {
                                            objRememberedValue13 = new Function1() { // from class: o.krT
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                @Override // kotlin.jvm.functions.Function1
                                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                                    return C29347krt.OLrzqt(context, (TokenBase) obj2);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        C29332kre.KWHzl(list, (Function1<? super TokenBase, Unit>) objRememberedValue13, 1.0f, composerStartRestartGroup, MLKEMEngine.KyberPolyBytes, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                    }
                                    composerStartRestartGroup.startReplaceableGroup(-174045968);
                                    if (copydefault((androidx.compose.runtime.State<C29297kqw>) stateCollectAsState2) != null) {
                                        SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(16)), composerStartRestartGroup, 6);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                    composerStartRestartGroup.endReplaceableGroup();
                                }
                                KWHzl(surgeTabViewModel, function014, function010, function17, function25, composerStartRestartGroup, (i3 & 14) | (i3 & WalletImportError.ERROR_CODE_AA_EXIST) | (i3 & FaceDetector.NUM_BOXES) | (i3 & 7168) | (57344 & (i3 >> 6)));
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
                                function24 = function25;
                                function012 = function014;
                                function15 = function17;
                                function16 = function18;
                                function013 = function015;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                function16 = function12;
                                function24 = function22;
                                function012 = function05;
                                function010 = function06;
                                function15 = function13;
                                function013 = function04;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final Function0<Unit> function016 = function010;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.krS
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                        return C29347krt.KWHzl(surgeTabViewModel, function012, function016, function15, function16, function07, function24, function013, i, i2, (Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        str = "";
                        if ((i3 & 4793491) == 4793490) {
                            if (i10 != 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                            composerStartRestartGroup.startReplaceableGroup(59049159);
                            zChangedInstance = composerStartRestartGroup.changedInstance(surgeTabViewModel);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(lifecycleOwner);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!(zChangedInstance | zChangedInstance2)) {
                                objRememberedValue = new Function1() { // from class: o.krN
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return C29347krt.copydefault(lifecycleOwner, surgeTabViewModel, (DisposableEffectScope) obj2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                                final android.content.Context context2 = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                view = (android.view.View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                                composerStartRestartGroup.startReplaceableGroup(59093087);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                companion = Composer.Companion;
                                if (objRememberedValue2 == companion.getEmpty()) {
                                }
                                iIntValue = ((java.lang.Number) objRememberedValue2).intValue();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(59096110);
                                zChanged = composerStartRestartGroup.changed(view);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged) {
                                    parent = view.getParent();
                                    while (true) {
                                        if (parent != null) {
                                        }
                                        parent = parent.getParent();
                                    }
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    viewPager2 = (ViewPager2) objRememberedValue3;
                                    composerStartRestartGroup.endReplaceableGroup();
                                    Function2<? super C29250kqB, ? super TokenDetailTabType, Unit> function252 = function23;
                                    stateCollectAsState = SnapshotStateKt.collectAsState(surgeTabViewModel.djBIcL(), null, composerStartRestartGroup, 0, 1);
                                    Function1<? super TokenBase, Unit> function172 = function13;
                                    stateCollectAsState2 = SnapshotStateKt.collectAsState(surgeTabViewModel.gEmmrt(), null, composerStartRestartGroup, 0, 1);
                                    C29297kqw c29297kqwCopydefault2 = copydefault((androidx.compose.runtime.State<C29297kqw>) stateCollectAsState2);
                                    if (c29297kqwCopydefault2 == null) {
                                    }
                                    if (listOLrzqt == null) {
                                    }
                                    int value2 = scrollStateRememberScrollState.getValue();
                                    composerStartRestartGroup.startReplaceableGroup(59114211);
                                    function010 = function06;
                                    if ((57344 & i3) != 16384) {
                                    }
                                    zChanged2 = composerStartRestartGroup.changed(scrollStateRememberScrollState);
                                    Function0<Unit> function0142 = function05;
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!(z3 | zChanged2)) {
                                        obj = null;
                                        objRememberedValue4 = new SurgeTabComposableKt$SurgeScreen$9$1(function14, scrollStateRememberScrollState, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        EffectsKt.LaunchedEffect(java.lang.Integer.valueOf(value2), (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object>) objRememberedValue4, composerStartRestartGroup, 0);
                                        companion2 = Modifier.Companion;
                                        Modifier modifierM350backgroundbw27NRU$default2 = BackgroundKt.m350backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, obj), ColorResources_androidKt.colorResource(C52761wXj.Activity.EZpvd, composerStartRestartGroup, 0), null, 2, null);
                                        composerStartRestartGroup.startReplaceableGroup(733328855);
                                        companion3 = Alignment.Companion;
                                        Function1<? super java.lang.Boolean, Unit> function182 = function14;
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                        Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                        androidx.compose.ui.unit.LayoutDirection layoutDirection5 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                        Function0<Unit> function0152 = function09;
                                        androidx.compose.ui.platform.ViewConfiguration viewConfiguration5 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                        companion4 = ComposeUiNode.Companion;
                                        java.util.List<C29295kqu> list2 = listOLrzqt;
                                        Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
                                        yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf5 = LayoutKt.materializerOf(modifierM350backgroundbw27NRU$default2);
                                        function011 = function08;
                                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                        }
                                        composerStartRestartGroup.disableReusing();
                                        Composer composerM2783constructorimpl5 = Updater.m2783constructorimpl(composerStartRestartGroup);
                                        Updater.m2790setimpl(composerM2783constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion4.getSetMeasurePolicy());
                                        Updater.m2790setimpl(composerM2783constructorimpl5, density5, companion4.getSetDensity());
                                        Updater.m2790setimpl(composerM2783constructorimpl5, layoutDirection5, companion4.getSetLayoutDirection());
                                        Updater.m2790setimpl(composerM2783constructorimpl5, viewConfiguration5, companion4.getSetViewConfiguration());
                                        composerStartRestartGroup.enableReusing();
                                        yhoMaterializerOf5.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                        composerStartRestartGroup.startReplaceableGroup(622592242);
                                        zChangedInstance3 = composerStartRestartGroup.changedInstance(viewPager2);
                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (!zChangedInstance3) {
                                            objRememberedValue5 = new SurgeTabComposableKt$SurgeScreen$10$1$1(viewPager2, iIntValue, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                            composerStartRestartGroup.endReplaceableGroup();
                                            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(SuspendingPointerInputFilterKt.pointerInput(modifierFillMaxSize$default2, viewPager2, java.lang.Integer.valueOf(iIntValue), (Function2) objRememberedValue5), scrollStateRememberScrollState, false, null, false, 14, null);
                                            composerStartRestartGroup.startReplaceableGroup(-483455358);
                                            arrangement = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                            Density density22 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                            androidx.compose.ui.unit.LayoutDirection layoutDirection22 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration22 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                            Function0<ComposeUiNode> constructor22 = companion4.getConstructor();
                                            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf22 = LayoutKt.materializerOf(modifierVerticalScroll$default2);
                                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (!composerStartRestartGroup.getInserting()) {
                                            }
                                            composerStartRestartGroup.disableReusing();
                                            Composer composerM2783constructorimpl22 = Updater.m2783constructorimpl(composerStartRestartGroup);
                                            Updater.m2790setimpl(composerM2783constructorimpl22, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
                                            Updater.m2790setimpl(composerM2783constructorimpl22, density22, companion4.getSetDensity());
                                            Updater.m2790setimpl(composerM2783constructorimpl22, layoutDirection22, companion4.getSetLayoutDirection());
                                            Updater.m2790setimpl(composerM2783constructorimpl22, viewConfiguration22, companion4.getSetViewConfiguration());
                                            composerStartRestartGroup.enableReusing();
                                            yhoMaterializerOf22.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                            if (OLrzqt((androidx.compose.runtime.State<SmartMoneyConfig>) stateCollectAsState) != null) {
                                                composerStartRestartGroup.startReplaceableGroup(836716596);
                                                Modifier modifierM675paddingqDBjuR0$default2 = PaddingKt.m675paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, false, 3, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(8), 0.0f, 0.0f, 13, null);
                                                composerStartRestartGroup.startReplaceableGroup(-483455358);
                                                MeasurePolicy measurePolicyColumnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                                Density density32 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                                androidx.compose.ui.unit.LayoutDirection layoutDirection32 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration32 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                Function0<ComposeUiNode> constructor32 = companion4.getConstructor();
                                                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf32 = LayoutKt.materializerOf(modifierM675paddingqDBjuR0$default2);
                                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                composerStartRestartGroup.startReusableNode();
                                                if (!composerStartRestartGroup.getInserting()) {
                                                }
                                                composerStartRestartGroup.disableReusing();
                                                Composer composerM2783constructorimpl32 = Updater.m2783constructorimpl(composerStartRestartGroup);
                                                Updater.m2790setimpl(composerM2783constructorimpl32, measurePolicyColumnMeasurePolicy22, companion4.getSetMeasurePolicy());
                                                Updater.m2790setimpl(composerM2783constructorimpl32, density32, companion4.getSetDensity());
                                                Updater.m2790setimpl(composerM2783constructorimpl32, layoutDirection32, companion4.getSetLayoutDirection());
                                                Updater.m2790setimpl(composerM2783constructorimpl32, viewConfiguration32, companion4.getSetViewConfiguration());
                                                composerStartRestartGroup.enableReusing();
                                                yhoMaterializerOf32.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                                Modifier modifierM673paddingVpY3zN4$default2 = PaddingKt.m673paddingVpY3zN4$default(SizeKt.m704height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(48)), androidx.compose.ui.unit.Dp.m5414constructorimpl(24), 0.0f, 2, null);
                                                Alignment centerStart2 = companion3.getCenterStart();
                                                composerStartRestartGroup.startReplaceableGroup(733328855);
                                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy22 = BoxKt.rememberBoxMeasurePolicy(centerStart2, false, composerStartRestartGroup, 6);
                                                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                                Density density42 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                                androidx.compose.ui.unit.LayoutDirection layoutDirection42 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                                                androidx.compose.ui.platform.ViewConfiguration viewConfiguration42 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                                                Function0<ComposeUiNode> constructor42 = companion4.getConstructor();
                                                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf42 = LayoutKt.materializerOf(modifierM673paddingVpY3zN4$default2);
                                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                composerStartRestartGroup.startReusableNode();
                                                if (!composerStartRestartGroup.getInserting()) {
                                                }
                                                composerStartRestartGroup.disableReusing();
                                                Composer composerM2783constructorimpl42 = Updater.m2783constructorimpl(composerStartRestartGroup);
                                                Updater.m2790setimpl(composerM2783constructorimpl42, measurePolicyRememberBoxMeasurePolicy22, companion4.getSetMeasurePolicy());
                                                Updater.m2790setimpl(composerM2783constructorimpl42, density42, companion4.getSetDensity());
                                                Updater.m2790setimpl(composerM2783constructorimpl42, layoutDirection42, companion4.getSetLayoutDirection());
                                                Updater.m2790setimpl(composerM2783constructorimpl42, viewConfiguration42, companion4.getSetViewConfiguration());
                                                composerStartRestartGroup.enableReusing();
                                                yhoMaterializerOf42.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                                                composerStartRestartGroup.startReplaceableGroup(2058660585);
                                                int i112 = i3 >> 15;
                                                function07 = function011;
                                                AEQbTJ(function07, composerStartRestartGroup, i112 & 14);
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endNode();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                if (copydefault((androidx.compose.runtime.State<C29297kqw>) stateCollectAsState2) != null) {
                                                }
                                                composerStartRestartGroup.startReplaceableGroup(-174045968);
                                                if (copydefault((androidx.compose.runtime.State<C29297kqw>) stateCollectAsState2) != null) {
                                                }
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endNode();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                composerStartRestartGroup.endReplaceableGroup();
                                                KWHzl(surgeTabViewModel, function0142, function010, function172, function252, composerStartRestartGroup, (i3 & 14) | (i3 & WalletImportError.ERROR_CODE_AA_EXIST) | (i3 & FaceDetector.NUM_BOXES) | (i3 & 7168) | (57344 & (i3 >> 6)));
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
                                                function24 = function252;
                                                function012 = function0142;
                                                function15 = function172;
                                                function16 = function182;
                                                function013 = function0152;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 == 0) {
                    }
                    str = "";
                    if ((i3 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function13 = function1;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                str = "";
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function06 = function02;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function13 = function1;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & 128;
            if (i9 == 0) {
            }
            str = "";
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function05 = function0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function06 = function02;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function13 = function1;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        str = "";
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final DisposableEffectResult copydefault(LifecycleOwner lifecycleOwner, final SurgeTabViewModel surgeTabViewModel, DisposableEffectScope disposableEffectScope) {
        Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.okinc.business.market.features.scanner.surge.ui.SurgeTabComposableKt$$ExternalSyntheticLambda19
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                C29347krt.OLrzqt(surgeTabViewModel, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new PendingIntent(lifecycleOwner, lifecycleEventObserver);
    }

    public static final void OLrzqt(SurgeTabViewModel surgeTabViewModel, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(event, "");
        int i = AssistContent.copydefault[event.ordinal()];
        if (i == 1) {
            surgeTabViewModel.AEQbTJ();
            return;
        }
        if (i == 2) {
            surgeTabViewModel.isConnected();
            surgeTabViewModel.values();
        } else {
            if (i != 3) {
                return;
            }
            if (surgeTabViewModel.AhwBna() != null) {
                surgeTabViewModel.EZpvd(false);
                SurgeTabViewModel.fetchSignalSection$default(surgeTabViewModel, false, 1, null);
            }
            C29229kph.AEQbTJ();
        }
    }

    /* JADX INFO: renamed from: o.krt$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ Function0 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.krt$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.krt$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ Function0 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.invoke();
            }
        }
    }

    public static final Unit OLrzqt(android.content.Context context, TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        OLrzqt(context, tokenBase, "signal_detail");
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1719379970);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1719379970, i2, -1, "com.okinc.business.market.features.scanner.surge.ui.SignalTitle (SurgeTabComposable.kt:295)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-1689506766);
            boolean z = (i2 & 14) == 4;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: o.krQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C29347krt.copydefault(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierNoHighlightClickable$default = noHighlightClickable$default(modifierFillMaxWidth$default, false, (Function0) objRememberedValue, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf = LayoutKt.materializerOf(modifierNoHighlightClickable$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, density, companion2.getSetDensity());
            Updater.m2790setimpl(composerM2783constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m2790setimpl(composerM2783constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            yhoMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(85590072);
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.krR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.copydefault((android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, null, null, composerStartRestartGroup, 6, 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(C52761wXj.TaskDescription.DGUQLI, composerStartRestartGroup, 0), (java.lang.String) null, SizeKt.m718size3ABfNKs(companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m3190tintxETnrds$default(ColorFilter.Companion, ColorResources_androidKt.colorResource(C52761wXj.Activity.fdOvFl, composerStartRestartGroup, 0), 0, 2, null), composerStartRestartGroup, 432, 56);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.krU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29347krt.AEQbTJ(function0, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit copydefault(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final android.widget.TextView copydefault(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextAppearance(C52761wXj.LoaderManager.DGOPHZ);
        textView.setTextColor(C25382ivf.copydefault(C52761wXj.Activity.fdOvFl, context));
        textView.setText(context.getString(C23274hvD.Fragment.ZpNRhN));
        return textView;
    }

    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(final java.lang.String str, final java.lang.String str2, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        Function0<Unit> function03;
        final androidx.compose.runtime.State stateRememberUpdatedState;
        java.lang.Object objRememberedValue;
        Composer.Companion companion;
        boolean z;
        boolean z2;
        boolean zChanged;
        java.lang.Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1301089000);
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
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i4 == 0) {
                    composerStartRestartGroup.startReplaceableGroup(1037084854);
                    java.lang.Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: o.krV
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C29347krt.valueOf();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function03 = (Function0) objRememberedValue3;
                } else {
                    function03 = function02;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1301089000, i3, -1, "com.okinc.business.market.features.scanner.surge.ui.SignalEmptyView (SurgeTabComposable.kt:325)");
                }
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function03, composerStartRestartGroup, (i3 >> 6) & 14);
                float f = 24;
                Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, 3, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(f), androidx.compose.ui.unit.Dp.m5414constructorimpl(4), androidx.compose.ui.unit.Dp.m5414constructorimpl(f), 0.0f, 8, null);
                composerStartRestartGroup.startReplaceableGroup(1037096512);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.ksc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C29347krt.AEQbTJ((android.content.Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1037105220);
                z = (i3 & 14) != 4;
                z2 = (i3 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
                zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!(zChanged | z | z2) || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: o.ksa
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C29347krt.EZpvd(str2, str, stateRememberUpdatedState, (ConstraintLayout) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function1, modifierM675paddingqDBjuR0$default, (Function1) objRememberedValue2, composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function03 = function02;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function0<Unit> function04 = function03;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.ksd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C29347krt.KWHzl(str, str2, function04, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= MLKEMEngine.KyberPolyBytes;
        function02 = function0;
        if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function03, composerStartRestartGroup, (i3 >> 6) & 14);
            float f2 = 24;
            Modifier modifierM675paddingqDBjuR0$default2 = PaddingKt.m675paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, 3, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(f2), androidx.compose.ui.unit.Dp.m5414constructorimpl(4), androidx.compose.ui.unit.Dp.m5414constructorimpl(f2), 0.0f, 8, null);
            composerStartRestartGroup.startReplaceableGroup(1037096512);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
            }
            Function1 function12 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1037105220);
            if ((i3 & 14) != 4) {
            }
            if ((i3 & WalletImportError.ERROR_CODE_AA_EXIST) == 32) {
            }
            zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!(zChanged | z | z2)) {
                objRememberedValue2 = new Function1() { // from class: o.ksa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.EZpvd(str2, str, stateRememberUpdatedState, (ConstraintLayout) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceableGroup();
                AndroidView_androidKt.AndroidView(function12, modifierM675paddingqDBjuR0$default2, (Function1) objRememberedValue2, composerStartRestartGroup, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final ConstraintLayout AEQbTJ(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C21557hDu.copydefault(android.view.LayoutInflater.from(context)).getRoot();
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, androidx.compose.runtime.State state, ConstraintLayout constraintLayout) {
        int iOLrzqt;
        int iKWHzl;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        C21557hDu c21557hDuKWHzl = C21557hDu.KWHzl(constraintLayout);
        Intrinsics.checkNotNullExpressionValue(c21557hDuKWHzl, "");
        android.content.Context context = constraintLayout.getContext();
        c21557hDuKWHzl.copydefault.removeAllViews();
        Intrinsics.copydefault(context);
        int iOLrzqt2 = C55298xhM.OLrzqt(8, context);
        int i = 0;
        while (i < 5) {
            boolean z = i == 2;
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            if (z) {
                iOLrzqt = C55298xhM.OLrzqt(56, context);
            } else {
                iOLrzqt = C55298xhM.OLrzqt(48, context);
            }
            imageView.setLayoutParams(new LinearLayout.LayoutParams(iOLrzqt, iOLrzqt));
            if (z) {
                iKWHzl = C55298xhM.KWHzl(2.4f, context);
            } else {
                iKWHzl = C55298xhM.KWHzl(2.06f, context);
            }
            float f = iKWHzl;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C55298xhM.OLrzqt(12, context));
            gradientDrawable.setStroke(C55298xhM.OLrzqt(1, context), C25382ivf.copydefault(C52761wXj.Activity.ORxRYg, context), f, f);
            gradientDrawable.setColor(0);
            imageView.setBackground(gradientDrawable);
            imageView.setPadding(iOLrzqt2, iOLrzqt2, iOLrzqt2, iOLrzqt2);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            if (!z) {
                imageView.setColorFilter(C25382ivf.copydefault(C52761wXj.Activity.invokespecialODCBUN, context));
            }
            C33054mpH.AEQbTJ(imageView, str2);
            c21557hDuKWHzl.copydefault.addView(imageView);
            if (i < 4) {
                android.widget.Space space = new android.widget.Space(context);
                space.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
                c21557hDuKWHzl.copydefault.addView(space);
            }
            i++;
        }
        java.lang.String strKWHzl = C33069mpW.KWHzl(context, C23274hvD.Fragment.zlzhuY, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("network", str)));
        java.lang.String string = context.getString(C23274hvD.Fragment.OCdtug);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String str3 = strKWHzl + " " + string;
        android.text.SpannableString spannableString = new android.text.SpannableString(str3);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str3, string, 0, false, 6, (java.lang.Object) null);
        spannableString.setSpan(new LoaderManager(state, context), iIndexOf$default, string.length() + iIndexOf$default, 33);
        android.widget.TextView textView = c21557hDuKWHzl.OLrzqt;
        textView.setText(spannableString);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.krt$LoaderManager */
    public static final class LoaderManager extends android.text.style.ClickableSpan {
        public final /* synthetic */ androidx.compose.runtime.State<Function0<Unit>> EZpvd;
        public final /* synthetic */ android.content.Context copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> */
        /* JADX WARN: Multi-variable type inference failed */
        public LoaderManager(androidx.compose.runtime.State<? extends Function0<Unit>> state, android.content.Context context) {
            this.EZpvd = state;
            this.copydefault = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C29347krt.KWHzl(this.EZpvd).invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            int i = C52761wXj.Activity.Dmq;
            android.content.Context context = this.copydefault;
            Intrinsics.copydefault(context);
            textPaint.setColor(C25382ivf.copydefault(i, context));
            textPaint.setUnderlineText(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x034b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(final SurgeTabViewModel surgeTabViewModel, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super TokenBase, Unit> function1, final Function2<? super C29250kqB, ? super TokenDetailTabType, Unit> function2, Composer composer, final int i) {
        int i2;
        kotlin.Pair pairOLrzqt;
        final SurgeTabViewModel surgeTabViewModel2;
        final Function2<? super C29250kqB, ? super TokenDetailTabType, Unit> function22;
        java.lang.String strKWHzl;
        java.util.List<ChainInfoData> listCopydefault;
        java.lang.Object next;
        Composer composerStartRestartGroup = composer.startRestartGroup(141222086);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(surgeTabViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(141222086, i2, -1, "com.okinc.business.market.features.scanner.surge.ui.TrendingSection (SurgeTabComposable.kt:437)");
            }
            final android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            androidx.compose.runtime.State stateCollectAsState = SnapshotStateKt.collectAsState(surgeTabViewModel.valueOf(), null, composerStartRestartGroup, 0, 1);
            boolean z = AEQbTJ((androidx.compose.runtime.State<? extends InterfaceC29359ksE>) stateCollectAsState) instanceof InterfaceC29359ksE.Application;
            boolean z2 = AEQbTJ((androidx.compose.runtime.State<? extends InterfaceC29359ksE>) stateCollectAsState) instanceof InterfaceC29359ksE.StateListAnimator;
            boolean z3 = AEQbTJ((androidx.compose.runtime.State<? extends InterfaceC29359ksE>) stateCollectAsState) instanceof InterfaceC29359ksE.Activity;
            InterfaceC29359ksE interfaceC29359ksEAEQbTJ = AEQbTJ((androidx.compose.runtime.State<? extends InterfaceC29359ksE>) stateCollectAsState);
            if (interfaceC29359ksEAEQbTJ instanceof InterfaceC29359ksE.Application) {
                InterfaceC29359ksE.Application application = (InterfaceC29359ksE.Application) interfaceC29359ksEAEQbTJ;
                pairOLrzqt = C56390yDp.OLrzqt(application.KWHzl(), application.OLrzqt());
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(yDY.AhwBna(), null);
            }
            java.util.List list = (java.util.List) pairOLrzqt.component1();
            C29346krs c29346krs = (C29346krs) pairOLrzqt.component2();
            composerStartRestartGroup.startReplaceableGroup(1639816843);
            boolean zChanged = composerStartRestartGroup.changed(c29346krs);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = java.lang.Boolean.valueOf(c29346krs != null && KWHzl(c29346krs));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            boolean zBooleanValue = ((java.lang.Boolean) objRememberedValue).booleanValue();
            composerStartRestartGroup.endReplaceableGroup();
            if (z2) {
                composerStartRestartGroup.startReplaceableGroup(-705170128);
                KWHzl(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-704948881);
                Modifier.Companion companion = Modifier.Companion;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf = LayoutKt.materializerOf(modifierFillMaxWidth$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, density, companion3.getSetDensity());
                Updater.m2790setimpl(composerM2783constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
                Updater.m2790setimpl(composerM2783constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                yhoMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f = 48;
                float f2 = 24;
                Modifier modifierM673paddingVpY3zN4$default = PaddingKt.m673paddingVpY3zN4$default(SizeKt.m704height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m5414constructorimpl(f)), androidx.compose.ui.unit.Dp.m5414constructorimpl(f2), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composerStartRestartGroup, 54);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf2 = LayoutKt.materializerOf(modifierM673paddingVpY3zN4$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composerStartRestartGroup);
                Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl2, density2, companion3.getSetDensity());
                Updater.m2790setimpl(composerM2783constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                Updater.m2790setimpl(composerM2783constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                yhoMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                KWHzl(RowScopeInstance.INSTANCE, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1108897718);
                if (z) {
                    TrendingConfigData trendingConfigDataAhwBna = surgeTabViewModel.AhwBna();
                    composerStartRestartGroup.startReplaceableGroup(-1108896455);
                    boolean zChanged2 = composerStartRestartGroup.changed(trendingConfigDataAhwBna);
                    java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = surgeTabViewModel.OLrzqt();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    java.lang.String str = (java.lang.String) objRememberedValue2;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1108891071);
                    boolean zChanged3 = composerStartRestartGroup.changed(c29346krs);
                    boolean zChanged4 = composerStartRestartGroup.changed(str);
                    java.lang.Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if ((zChanged3 | zChanged4) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = java.lang.Boolean.valueOf(c29346krs != null ? KWHzl(c29346krs, str) : false);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    boolean zBooleanValue2 = ((java.lang.Boolean) objRememberedValue3).booleanValue();
                    composerStartRestartGroup.endReplaceableGroup();
                    TrendingConfigData trendingConfigDataAhwBna2 = surgeTabViewModel.AhwBna();
                    java.lang.String strCopydefault = surgeTabViewModel.copydefault();
                    composerStartRestartGroup.startReplaceableGroup(-1108883552);
                    boolean zChanged5 = composerStartRestartGroup.changed(trendingConfigDataAhwBna2);
                    boolean zChanged6 = composerStartRestartGroup.changed(strCopydefault);
                    java.lang.Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if ((zChanged5 | zChanged6) || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        TrendingConfigData trendingConfigDataAhwBna3 = surgeTabViewModel.AhwBna();
                        if (trendingConfigDataAhwBna3 != null && (listCopydefault = trendingConfigDataAhwBna3.copydefault()) != null) {
                            java.util.Iterator<T> it = listCopydefault.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                } else {
                                    next = it.next();
                                    if (Intrinsics.EZpvd((java.lang.Object) ((ChainInfoData) next).EZpvd(), (java.lang.Object) surgeTabViewModel.copydefault())) {
                                        break;
                                    }
                                }
                            }
                            ChainInfoData chainInfoData = (ChainInfoData) next;
                            if (chainInfoData != null) {
                                strKWHzl = chainInfoData.KWHzl();
                            }
                            composerStartRestartGroup.updateRememberedValue(strKWHzl);
                            objRememberedValue4 = strKWHzl;
                        } else {
                            strKWHzl = null;
                            composerStartRestartGroup.updateRememberedValue(strKWHzl);
                            objRememberedValue4 = strKWHzl;
                        }
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    OLrzqt((java.lang.String) objRememberedValue4, function0, composerStartRestartGroup, i2 & WalletImportError.ERROR_CODE_AA_EXIST);
                    SpacerKt.Spacer(SizeKt.m723width3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(12)), composerStartRestartGroup, 6);
                    copydefault(zBooleanValue2, function02, composerStartRestartGroup, (i2 >> 3) & WalletImportError.ERROR_CODE_AA_EXIST);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1119289433);
                if (zBooleanValue) {
                    Intrinsics.copydefault(c29346krs);
                    TrendingFilter trendingFilterOLrzqt = c29346krs.OLrzqt();
                    composerStartRestartGroup.startReplaceableGroup(1119294210);
                    surgeTabViewModel2 = surgeTabViewModel;
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(surgeTabViewModel2);
                    java.lang.Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = new SurgeTabComposableKt$TrendingSection$1$2$1(surgeTabViewModel2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AEQbTJ(trendingFilterOLrzqt, (Function1<? super FilterType, Unit>) ((InterfaceC56555yJs) objRememberedValue5), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(12)), composerStartRestartGroup, 6);
                } else {
                    surgeTabViewModel2 = surgeTabViewModel;
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (z3) {
                    composerStartRestartGroup.startReplaceableGroup(338608661);
                    Modifier.Companion companion4 = Modifier.Companion;
                    Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), null, false, 3, null), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(60), 0.0f, 0.0f, 13, null);
                    Alignment topCenter = Alignment.Companion.getTopCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topCenter, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration3 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf3 = LayoutKt.materializerOf(modifierM675paddingqDBjuR0$default);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2783constructorimpl3 = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl3, measurePolicyRememberBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl3, density3, companion5.getSetDensity());
                    Updater.m2790setimpl(composerM2783constructorimpl3, layoutDirection3, companion5.getSetLayoutDirection());
                    Updater.m2790setimpl(composerM2783constructorimpl3, viewConfiguration3, companion5.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    yhoMaterializerOf3.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1108842277);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(surgeTabViewModel2);
                    java.lang.Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                        objRememberedValue6 = new Function1() { // from class: o.ksb
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C29347krt.KWHzl(surgeTabViewModel2, (android.content.Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue6, SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), null, false, 3, null), null, composerStartRestartGroup, 48, 4);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (list.isEmpty()) {
                    composerStartRestartGroup.startReplaceableGroup(339803215);
                    Modifier.Companion companion6 = Modifier.Companion;
                    Modifier modifierM675paddingqDBjuR0$default2 = PaddingKt.m675paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, 3, null), 0.0f, zBooleanValue ? androidx.compose.ui.unit.Dp.m5414constructorimpl(f) : androidx.compose.ui.unit.Dp.m5414constructorimpl(60), 0.0f, androidx.compose.ui.unit.Dp.m5414constructorimpl(f2), 5, null);
                    Alignment topCenter2 = Alignment.Companion.getTopCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(topCenter2, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    androidx.compose.ui.unit.LayoutDirection layoutDirection4 = (androidx.compose.ui.unit.LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration4 = (androidx.compose.ui.platform.ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
                    yHO<SkippableUpdater<ComposeUiNode>, Composer, java.lang.Integer, Unit> yhoMaterializerOf4 = LayoutKt.materializerOf(modifierM675paddingqDBjuR0$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2783constructorimpl4 = Updater.m2783constructorimpl(composerStartRestartGroup);
                    Updater.m2790setimpl(composerM2783constructorimpl4, measurePolicyRememberBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                    Updater.m2790setimpl(composerM2783constructorimpl4, density4, companion7.getSetDensity());
                    Updater.m2790setimpl(composerM2783constructorimpl4, layoutDirection4, companion7.getSetLayoutDirection());
                    Updater.m2790setimpl(composerM2783constructorimpl4, viewConfiguration4, companion7.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    yhoMaterializerOf4.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-1108802131);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(surgeTabViewModel2);
                    java.lang.Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue7 == Composer.Companion.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: o.ksh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C29347krt.copydefault(surgeTabViewModel2, (android.content.Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue7, SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), null, false, 3, null), null, composerStartRestartGroup, 48, 4);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(341050159);
                    composerStartRestartGroup.startReplaceableGroup(1119383481);
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(context);
                    java.lang.Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue8 == Composer.Companion.getEmpty()) {
                        objRememberedValue8 = new Function1() { // from class: o.kse
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C29347krt.AEQbTJ(context, (TokenBase) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    Function1 function12 = (Function1) objRememberedValue8;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(1119391620);
                    int i3 = 57344 & i2;
                    boolean z4 = i3 == 16384;
                    java.lang.Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (z4 || objRememberedValue9 == Composer.Companion.getEmpty()) {
                        function22 = function2;
                        objRememberedValue9 = new Function1() { // from class: o.ksg
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C29347krt.OLrzqt(function22, (C29250kqB) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        function22 = function2;
                    }
                    Function1 function13 = (Function1) objRememberedValue9;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(1119402181);
                    boolean z5 = i3 == 16384;
                    java.lang.Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (z5 || objRememberedValue10 == Composer.Companion.getEmpty()) {
                        objRememberedValue10 = new Function1() { // from class: o.ksi
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C29347krt.KWHzl(function22, (C29250kqB) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    Function1 function14 = (Function1) objRememberedValue10;
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(1119412630);
                    boolean z6 = (i2 & 7168) == 2048;
                    java.lang.Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (z6 || objRememberedValue11 == Composer.Companion.getEmpty()) {
                        objRememberedValue11 = new Function1() { // from class: o.ksf
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C29347krt.OLrzqt(function1, (TokenBase) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    KWHzl((java.util.List<C29250kqB>) list, (Function1<? super TokenBase, Unit>) function12, (Function1<? super C29250kqB, Unit>) function13, (Function1<? super C29250kqB, Unit>) function14, (Function1<? super TokenBase, Unit>) objRememberedValue11, composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m704height3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(f2)), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.ksk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29347krt.OLrzqt(surgeTabViewModel, function0, function02, function1, function2, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final C55173xeu KWHzl(final SurgeTabViewModel surgeTabViewModel, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C55173xeu c55173xeu = new C55173xeu(context, null, 0, 6, null);
        c55173xeu.setEmptyTypeImage(8);
        java.lang.String string = context.getString(C23274hvD.Fragment.UscePu);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        java.lang.String string2 = context.getString(C23274hvD.Fragment.EZpvd);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setRetry(string2);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.krZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29347krt.EZpvd(surgeTabViewModel, view);
            }
        });
        return c55173xeu;
    }

    public static final void EZpvd(SurgeTabViewModel surgeTabViewModel, android.view.View view) {
        surgeTabViewModel.AEQbTJ();
    }

    public static final C55173xeu copydefault(final SurgeTabViewModel surgeTabViewModel, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C55173xeu c55173xeu = new C55173xeu(context, null, 0, 6, null);
        c55173xeu.setEmptyTypeImage(6);
        java.lang.String string = context.getString(C23274hvD.Fragment.isCurrent);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        java.lang.String string2 = context.getString(C23274hvD.Fragment.MediaControllerCompatApi21Callback);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setRetry(string2);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.ksj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29347krt.OLrzqt(surgeTabViewModel, view);
            }
        });
        return c55173xeu;
    }

    public static final void OLrzqt(SurgeTabViewModel surgeTabViewModel, android.view.View view) {
        surgeTabViewModel.fetchVPNInfo();
    }

    public static final Unit AEQbTJ(android.content.Context context, TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.TaskStackBuilder.copydefault);
        OLrzqt(context, tokenBase, "trending_token_detail");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function2 function2, C29250kqB c29250kqB) {
        Intrinsics.checkNotNullParameter(c29250kqB, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.VoiceInteractor.EZpvd);
        C29229kph.KWHzl("trending_picture");
        function2.invoke(c29250kqB, TokenDetailTabType.TOKEN);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(Function2 function2, C29250kqB c29250kqB) {
        Intrinsics.checkNotNullParameter(c29250kqB, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.VoiceInteractor.EZpvd);
        C29229kph.KWHzl("trending_socials_twitter");
        function2.invoke(c29250kqB, TokenDetailTabType.SOCIAL);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function1 function1, TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.VoiceInteractor.EZpvd);
        C29229kph.KWHzl("quick_buy_button");
        function1.invoke(tokenBase);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(final RowScope rowScope, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1454704167);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1454704167, i2, -1, "com.okinc.business.market.features.scanner.surge.ui.TrendingTitle (SurgeTabComposable.kt:575)");
            }
            composerStartRestartGroup.startReplaceableGroup(-839215034);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.krH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.AhwBna((android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue, RowScope.weight$default(rowScope, Modifier.Companion, 1.0f, false, 2, null), null, composerStartRestartGroup, 6, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.krP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29347krt.KWHzl(rowScope, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final android.widget.TextView AhwBna(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextAppearance(C52761wXj.LoaderManager.DGOPHZ);
        textView.setTextColor(C25382ivf.copydefault(C52761wXj.Activity.fdOvFl, context));
        textView.setText(context.getString(C23274hvD.Fragment.createCallback));
        return textView;
    }

    public static final void OLrzqt(final java.lang.String str, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1799492048);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1799492048, i2, -1, "com.okinc.business.market.features.scanner.surge.ui.ChainPicker (SurgeTabComposable.kt:589)");
            }
            Modifier modifierM718size3ABfNKs = SizeKt.m718size3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(20));
            composerStartRestartGroup.startReplaceableGroup(-543058667);
            boolean z = (i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.ksp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.OLrzqt(function0, (android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-543051975);
            boolean z2 = (i2 & 14) == 4;
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.ksr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.copydefault(str, (android.widget.ImageView) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(function1, modifierM718size3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.krv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29347krt.AEQbTJ(str, function0, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final android.widget.ImageView OLrzqt(Function0 function0, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new Application(imageView, 1000L, function0));
        return imageView;
    }

    public static final Unit copydefault(java.lang.String str, android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (str != null && str.length() != 0) {
            C33054mpH.AEQbTJ(imageView, str);
        } else {
            imageView.setImageResource(C57406yhn.Activity.QKVWgx);
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(final boolean z, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1665511820);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1665511820, i2, -1, "com.okinc.business.market.features.scanner.surge.ui.FilterPicker (SurgeTabComposable.kt:609)");
            }
            Modifier modifierM718size3ABfNKs = SizeKt.m718size3ABfNKs(Modifier.Companion, androidx.compose.ui.unit.Dp.m5414constructorimpl(20));
            composerStartRestartGroup.startReplaceableGroup(-2026383998);
            boolean z2 = (i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.ksm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.AYXKKw(function0, (android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-2026373967);
            boolean z3 = (i2 & 14) == 4;
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.ksl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.KWHzl(z, (android.widget.ImageView) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(function1, modifierM718size3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.ksq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29347krt.AEQbTJ(z, function0, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final android.widget.ImageView AYXKKw(Function0 function0, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setContentDescription("web3_dex_scanner_surge_filter_btn");
        imageView.setColorFilter(C25382ivf.copydefault(C52761wXj.Activity.fdOvFl, context));
        imageView.setOnClickListener(new FragmentManager(imageView, 1000L, function0));
        return imageView;
    }

    public static final Unit KWHzl(boolean z, android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "");
        int i = z ? C52761wXj.TaskDescription.GVpNrs : C52761wXj.TaskDescription.fVBECu;
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        imageView.setImageDrawable(C33070mpX.EZpvd(i, context));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(final TrendingFilter trendingFilter, final Function1<? super FilterType, Unit> function1, Composer composer, final int i) {
        int i2;
        java.util.List listSplit$default;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1674060591);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(trendingFilter) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1674060591, i2, -1, "com.okinc.business.market.features.scanner.surge.ui.FilterChipContainer (SurgeTabComposable.kt:635)");
            }
            android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            java.lang.String strOLrzqt = trendingFilter.OLrzqt();
            java.lang.String strAEQbTJ = trendingFilter.AEQbTJ();
            composerStartRestartGroup.startReplaceableGroup(1685353192);
            boolean zChanged = composerStartRestartGroup.changed(strOLrzqt);
            boolean zChanged2 = composerStartRestartGroup.changed(strAEQbTJ);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChanged | zChanged2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = getFilterChipText$default(context, FilterType.MARKET_CAP, trendingFilter.OLrzqt(), trendingFilter.AEQbTJ(), true, null, 32, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final java.lang.String str = (java.lang.String) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            java.lang.String strGEmmrt = trendingFilter.gEmmrt();
            java.lang.String strValueOf = trendingFilter.valueOf();
            composerStartRestartGroup.startReplaceableGroup(1685363384);
            boolean zChanged3 = composerStartRestartGroup.changed(strGEmmrt);
            boolean zChanged4 = composerStartRestartGroup.changed(strValueOf);
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((zChanged3 | zChanged4) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = getFilterChipText$default(context, FilterType.VOLUME, trendingFilter.gEmmrt(), trendingFilter.valueOf(), true, null, 32, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final java.lang.String str2 = (java.lang.String) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            java.lang.String strDjBIcL = trendingFilter.djBIcL();
            java.lang.String strCopydefault = trendingFilter.copydefault();
            TokenAgeType tokenAgeTypeAYXKKw = trendingFilter.AYXKKw();
            composerStartRestartGroup.startReplaceableGroup(1685373546);
            boolean zChanged5 = composerStartRestartGroup.changed(strDjBIcL);
            boolean zChanged6 = composerStartRestartGroup.changed(strCopydefault);
            boolean zChanged7 = composerStartRestartGroup.changed(tokenAgeTypeAYXKKw);
            java.lang.Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if ((zChanged5 | zChanged6 | zChanged7) || objRememberedValue3 == Composer.Companion.getEmpty()) {
                FilterType filterType = FilterType.TOKEN_AGE;
                java.lang.String strDjBIcL2 = trendingFilter.djBIcL();
                java.lang.String strCopydefault2 = trendingFilter.copydefault();
                java.lang.String string = context.getString(trendingFilter.AYXKKw().toDisplayString());
                Intrinsics.checkNotNullExpressionValue(string, "");
                objRememberedValue3 = KWHzl(context, filterType, strDjBIcL2, strCopydefault2, false, string);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final java.lang.String str3 = (java.lang.String) objRememberedValue3;
            composerStartRestartGroup.endReplaceableGroup();
            java.lang.String strKWHzl = trendingFilter.KWHzl();
            composerStartRestartGroup.startReplaceableGroup(1685387751);
            boolean zChanged8 = composerStartRestartGroup.changed(strKWHzl);
            java.lang.Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged8 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                java.lang.String strKWHzl2 = trendingFilter.KWHzl();
                java.lang.String str4 = C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl2) ? strKWHzl2 : null;
                if (str4 != null && (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str4, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        java.lang.String string2 = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) it.next()).toString();
                        if (string2.length() <= 0) {
                            string2 = null;
                        }
                        if (string2 != null) {
                            arrayList.add(string2);
                        }
                    }
                    java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "、", null, null, 0, null, null, 62, null);
                    if (strJoinToString$default != null && strJoinToString$default.length() > 0) {
                        objRememberedValue4 = strJoinToString$default;
                    }
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    objRememberedValue4 = null;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
            }
            final java.lang.String str5 = (java.lang.String) objRememberedValue4;
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            PaddingValues paddingValuesM666PaddingValuesYgX7TsA$default = PaddingKt.m666PaddingValuesYgX7TsA$default(androidx.compose.ui.unit.Dp.m5414constructorimpl(24), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM582spacedBy0680j_4 = Arrangement.INSTANCE.m582spacedBy0680j_4(androidx.compose.ui.unit.Dp.m5414constructorimpl(8));
            composerStartRestartGroup.startReplaceableGroup(1685403675);
            boolean zChanged9 = composerStartRestartGroup.changed(str);
            boolean z = (i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            boolean zChanged10 = composerStartRestartGroup.changed(str2);
            boolean zChanged11 = composerStartRestartGroup.changed(str3);
            boolean zChanged12 = composerStartRestartGroup.changed(str5);
            java.lang.Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if ((zChanged9 | z | zChanged10 | zChanged11 | zChanged12) || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: o.krx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.EZpvd(str, str2, str3, str5, function1, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyRow(modifierFillMaxWidth$default, null, paddingValuesM666PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM582spacedBy0680j_4, null, null, false, (Function1) objRememberedValue5, composer2, 24966, 234);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.krw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29347krt.EZpvd(trendingFilter, function1, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.krt$StateListAnimator */
    public static final class StateListAnimator implements yHO<LazyItemScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ Function1<FilterType, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.scanner.surge.ui.FilterType, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(java.lang.String str, Function1<? super FilterType, Unit> function1) {
            this.EZpvd = str;
            this.copydefault = function1;
        }

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
                    ComposerKt.traceEventStart(-1010772052, i, -1, "com.okinc.business.market.features.scanner.surge.ui.FilterChipContainer.<anonymous>.<anonymous>.<anonymous> (SurgeTabComposable.kt:682)");
                }
                java.lang.String str = this.EZpvd;
                composer.startReplaceableGroup(-880125875);
                boolean zChanged = composer.changed(this.copydefault);
                final Function1<FilterType, Unit> function1 = this.copydefault;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: o.kst
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C29347krt.StateListAnimator.AEQbTJ(function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                C29347krt.KWHzl(str, (Function0<Unit>) objRememberedValue, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit AEQbTJ(Function1 function1) {
            function1.invoke(FilterType.MARKET_CAP);
            return Unit.INSTANCE;
        }
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Function1 function1, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "");
        if (str.length() > 0) {
            LazyListScope.item$default(lazyListScope, "market_cap", null, ComposableLambdaKt.composableLambdaInstance(-1010772052, true, new StateListAnimator(str, function1)), 2, null);
        }
        if (str2.length() > 0) {
            LazyListScope.item$default(lazyListScope, "volume", null, ComposableLambdaKt.composableLambdaInstance(633856035, true, new TaskDescription(str2, function1)), 2, null);
        }
        if (str3.length() > 0) {
            LazyListScope.item$default(lazyListScope, "token_age", null, ComposableLambdaKt.composableLambdaInstance(-406435804, true, new ActionBar(str3, function1)), 2, null);
        }
        if (str4 != null) {
            LazyListScope.item$default(lazyListScope, "keyword", null, ComposableLambdaKt.composableLambdaInstance(-1446727643, true, new Fragment(str4, function1)), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.krt$TaskDescription */
    public static final class TaskDescription implements yHO<LazyItemScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ Function1<FilterType, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.scanner.surge.ui.FilterType, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(java.lang.String str, Function1<? super FilterType, Unit> function1) {
            this.AEQbTJ = str;
            this.copydefault = function1;
        }

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
                    ComposerKt.traceEventStart(633856035, i, -1, "com.okinc.business.market.features.scanner.surge.ui.FilterChipContainer.<anonymous>.<anonymous>.<anonymous> (SurgeTabComposable.kt:690)");
                }
                java.lang.String str = this.AEQbTJ;
                composer.startReplaceableGroup(-880117079);
                boolean zChanged = composer.changed(this.copydefault);
                final Function1<FilterType, Unit> function1 = this.copydefault;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: o.ksw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C29347krt.TaskDescription.copydefault(function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                C29347krt.KWHzl(str, (Function0<Unit>) objRememberedValue, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit copydefault(Function1 function1) {
            function1.invoke(FilterType.VOLUME);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.krt$ActionBar */
    public static final class ActionBar implements yHO<LazyItemScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ Function1<FilterType, Unit> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.scanner.surge.ui.FilterType, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(java.lang.String str, Function1<? super FilterType, Unit> function1) {
            this.AEQbTJ = str;
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, java.lang.Integer num) {
            copydefault(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(LazyItemScope lazyItemScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(lazyItemScope, "");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-406435804, i, -1, "com.okinc.business.market.features.scanner.surge.ui.FilterChipContainer.<anonymous>.<anonymous>.<anonymous> (SurgeTabComposable.kt:698)");
                }
                java.lang.String str = this.AEQbTJ;
                composer.startReplaceableGroup(-880108180);
                boolean zChanged = composer.changed(this.KWHzl);
                final Function1<FilterType, Unit> function1 = this.KWHzl;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: o.ksv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C29347krt.ActionBar.KWHzl(function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                C29347krt.KWHzl(str, (Function0<Unit>) objRememberedValue, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KWHzl(Function1 function1) {
            function1.invoke(FilterType.TOKEN_AGE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.krt$Fragment */
    public static final class Fragment implements yHO<LazyItemScope, Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ Function1<FilterType, Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.scanner.surge.ui.FilterType, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Fragment(java.lang.String str, Function1<? super FilterType, Unit> function1) {
            this.AEQbTJ = str;
            this.OLrzqt = function1;
        }

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
                    ComposerKt.traceEventStart(-1446727643, i, -1, "com.okinc.business.market.features.scanner.surge.ui.FilterChipContainer.<anonymous>.<anonymous>.<anonymous> (SurgeTabComposable.kt:706)");
                }
                java.lang.String str = this.AEQbTJ;
                composer.startReplaceableGroup(-880099670);
                boolean zChanged = composer.changed(this.OLrzqt);
                final Function1<FilterType, Unit> function1 = this.OLrzqt;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: o.ksx
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C29347krt.Fragment.KWHzl(function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                C29347krt.KWHzl(str, (Function0<Unit>) objRememberedValue, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KWHzl(Function1 function1) {
            function1.invoke(FilterType.KEYWORD);
            return Unit.INSTANCE;
        }
    }

    public static final void KWHzl(final java.util.List<C29250kqB> list, final Function1<? super TokenBase, Unit> function1, final Function1<? super C29250kqB, Unit> function12, final Function1<? super C29250kqB, Unit> function13, final Function1<? super TokenBase, Unit> function14, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-313170411);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function13) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function14) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-313170411, i2, -1, "com.okinc.business.market.features.scanner.surge.ui.TrendingTokensRecyclerView (SurgeTabComposable.kt:722)");
            }
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, 3, null);
            composerStartRestartGroup.startReplaceableGroup(-690030548);
            boolean z = (i2 & FaceDetector.NUM_BOXES) == 256;
            boolean z2 = (i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            boolean z3 = (i2 & 7168) == 2048;
            boolean z4 = (i2 & 57344) == 16384;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2 | z3 | z4) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.krC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.copydefault(function12, function1, function13, function14, (android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function15 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-689985597);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list);
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.krA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.copydefault(list, (RecyclerView) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(function15, modifierWrapContentHeight$default, (Function1) objRememberedValue2, composerStartRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.krE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29347krt.AEQbTJ(list, function1, function12, function13, function14, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final RecyclerView copydefault(Function1 function1, Function1 function12, Function1 function13, Function1 function14, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        kMM kmm = new kMM();
        kmm.register(C29250kqB.class, new C29251kqC(function1, function12, function12, function13, function14));
        recyclerView.setAdapter(kmm);
        recyclerView.addItemDecoration(new SharedElementCallback(context));
        return recyclerView;
    }

    /* JADX INFO: renamed from: o.krt$SharedElementCallback */
    public static final class SharedElementCallback extends RecyclerView.ItemDecoration {
        public final /* synthetic */ android.content.Context AEQbTJ;

        public SharedElementCallback(android.content.Context context) {
            this.AEQbTJ = context;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.top = C55298xhM.copydefault(4.0f, this.AEQbTJ);
            } else {
                rect.top = C55298xhM.copydefault(12.0f, this.AEQbTJ);
            }
        }
    }

    public static final Unit copydefault(java.util.List list, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        kMM kmm = adapter instanceof kMM ? (kMM) adapter : null;
        if (kmm != null) {
            kMM.setData$default(kmm, list, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String getFilterChipText$default(android.content.Context context, FilterType filterType, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            str3 = "";
        }
        return KWHzl(context, filterType, str, str2, z, str3);
    }

    public static final java.lang.String KWHzl(android.content.Context context, FilterType filterType, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3) {
        java.lang.String scientificCurrency$default;
        java.lang.String scientificCurrency$default2;
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) str);
        boolean zOLrzqt2 = C33129mqd.OLrzqt((java.lang.CharSequence) str2);
        if (!zOLrzqt && !zOLrzqt2) {
            return "";
        }
        if (!zOLrzqt || !z || str == null || (scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, null, false, false, false, false, null, true, false, 382, null)) == null) {
            scientificCurrency$default = str;
        }
        if (!zOLrzqt2 || !z || str2 == null || (scientificCurrency$default2 = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str2, true, null, false, false, false, false, null, true, false, 382, null)) == null) {
            scientificCurrency$default2 = str2;
        }
        java.lang.String str4 = str3.length() != 0 ? str3 : "";
        if (zOLrzqt && zOLrzqt2) {
            int i = AssistContent.OLrzqt[filterType.ordinal()];
            return C33069mpW.KWHzl(context, i != 1 ? i != 2 ? C23274hvD.Fragment.skipToNext : C23274hvD.Fragment.fromToken : C23274hvD.Fragment.getCurrentVolume, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("min", scientificCurrency$default + str4), C56390yDp.OLrzqt("max", scientificCurrency$default2 + str4)));
        }
        if (zOLrzqt) {
            int i2 = AssistContent.OLrzqt[filterType.ordinal()];
            return C33069mpW.KWHzl(context, i2 != 1 ? i2 != 2 ? C23274hvD.Fragment.skipToPrevious : C23274hvD.Fragment.MediaControllerCompatTransportControlsBase : C23274hvD.Fragment.setRating, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", scientificCurrency$default + str4)));
        }
        int i3 = AssistContent.OLrzqt[filterType.ordinal()];
        return C33069mpW.KWHzl(context, i3 != 1 ? i3 != 2 ? C23274hvD.Fragment.MediaControllerCompatTransportControlsApi21 : C23274hvD.Fragment.MediaControllerCompatApi21 : C23274hvD.Fragment.MediaControllerCompatTransportControlsApi23, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", scientificCurrency$default2 + str4)));
    }

    public static final void KWHzl(final java.lang.String str, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-57509102);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-57509102, i2, -1, "com.okinc.business.market.features.scanner.surge.ui.FilterChipComposable (SurgeTabComposable.kt:823)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1944044485);
            boolean z = (i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 32;
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: o.kry
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.copydefault(function0, (android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1944006487);
            boolean z2 = (i2 & 14) == 4;
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.krz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.OLrzqt(str, (C54989xbV) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(function1, null, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.krD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29347krt.OLrzqt(str, function0, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final C54989xbV copydefault(Function0 function0, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C54989xbV c54989xbV = new C54989xbV(context, null, 0, 6, null);
        c54989xbV.setStyle(2);
        c54989xbV.setOKDSSize(-6);
        android.widget.TextView textViewEZpvd = c54989xbV.EZpvd();
        textViewEZpvd.setIncludeFontPadding(false);
        textViewEZpvd.setTextColor(C25382ivf.copydefault(C52761wXj.Activity.DCUTEIddSDPG, context));
        textViewEZpvd.setPaddingRelative(0, 0, C55298xhM.OLrzqt(4, context), 0);
        android.widget.ImageView imageViewOLrzqt = c54989xbV.OLrzqt();
        imageViewOLrzqt.setVisibility(0);
        imageViewOLrzqt.setImageTintList(android.content.res.ColorStateList.valueOf(C25382ivf.copydefault(C52761wXj.Activity.Dmq, context)));
        imageViewOLrzqt.setImageResource(C52761wXj.TaskDescription.TarCU);
        ViewGroup.LayoutParams layoutParams = imageViewOLrzqt.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = C55298xhM.OLrzqt(16, context);
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = C55298xhM.OLrzqt(16, context);
            imageViewOLrzqt.setTop(C55298xhM.OLrzqt(4, context));
            imageViewOLrzqt.setBottom(C55298xhM.OLrzqt(4, context));
            imageViewOLrzqt.setLayoutParams(layoutParams2);
            imageViewOLrzqt.setOnClickListener(new Activity(imageViewOLrzqt, 1000L, function0));
            return c54989xbV;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public static final Unit OLrzqt(java.lang.String str, C54989xbV c54989xbV) {
        Intrinsics.checkNotNullParameter(c54989xbV, "");
        c54989xbV.EZpvd().setText(str);
        return Unit.INSTANCE;
    }

    public static final boolean KWHzl(C29346krs c29346krs) {
        TrendingFilter trendingFilterOLrzqt = c29346krs.OLrzqt();
        return C33129mqd.OLrzqt((java.lang.CharSequence) trendingFilterOLrzqt.OLrzqt()) || C33129mqd.OLrzqt((java.lang.CharSequence) trendingFilterOLrzqt.AEQbTJ()) || C33129mqd.OLrzqt((java.lang.CharSequence) trendingFilterOLrzqt.gEmmrt()) || C33129mqd.OLrzqt((java.lang.CharSequence) trendingFilterOLrzqt.valueOf()) || C33129mqd.OLrzqt((java.lang.CharSequence) trendingFilterOLrzqt.djBIcL()) || C33129mqd.OLrzqt((java.lang.CharSequence) trendingFilterOLrzqt.copydefault()) || C33129mqd.OLrzqt((java.lang.CharSequence) trendingFilterOLrzqt.KWHzl());
    }

    public static final boolean KWHzl(C29346krs c29346krs, java.lang.String str) {
        return !Intrinsics.EZpvd((java.lang.Object) c29346krs.copydefault(), (java.lang.Object) str) || !Intrinsics.EZpvd(c29346krs.AEQbTJ().KWHzl(), c29346krs.AEQbTJ().OLrzqt()) || c29346krs.OLrzqt().EZpvd() || KWHzl(c29346krs);
    }

    public static final void AEQbTJ(SurgeTabViewModel surgeTabViewModel, FilterType filterType) {
        TrendingFilter trendingFilterCopydefault;
        C29346krs c29346krsEZpvd = surgeTabViewModel.EZpvd();
        int i = AssistContent.OLrzqt[filterType.ordinal()];
        if (i == 1) {
            TrendingFilter trendingFilterOLrzqt = c29346krsEZpvd.OLrzqt();
            trendingFilterCopydefault = trendingFilterOLrzqt.copydefault((TypedValues.PositionType.TYPE_CURVE_FIT & 1) != 0 ? trendingFilterOLrzqt.OLrzqt : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 2) != 0 ? trendingFilterOLrzqt.AEQbTJ : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 4) != 0 ? trendingFilterOLrzqt.gEmmrt : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 8) != 0 ? trendingFilterOLrzqt.djBIcL : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 16) != 0 ? trendingFilterOLrzqt.AhwBna : "", (TypedValues.PositionType.TYPE_CURVE_FIT & 32) != 0 ? trendingFilterOLrzqt.KWHzl : "", (TypedValues.PositionType.TYPE_CURVE_FIT & 64) != 0 ? trendingFilterOLrzqt.AYXKKw : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 128) != 0 ? trendingFilterOLrzqt.EZpvd : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 256) != 0 ? trendingFilterOLrzqt.copydefault : false);
        } else if (i == 2) {
            TrendingFilter trendingFilterOLrzqt2 = c29346krsEZpvd.OLrzqt();
            trendingFilterCopydefault = trendingFilterOLrzqt2.copydefault((TypedValues.PositionType.TYPE_CURVE_FIT & 1) != 0 ? trendingFilterOLrzqt2.OLrzqt : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 2) != 0 ? trendingFilterOLrzqt2.AEQbTJ : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 4) != 0 ? trendingFilterOLrzqt2.gEmmrt : "", (TypedValues.PositionType.TYPE_CURVE_FIT & 8) != 0 ? trendingFilterOLrzqt2.djBIcL : "", (TypedValues.PositionType.TYPE_CURVE_FIT & 16) != 0 ? trendingFilterOLrzqt2.AhwBna : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 32) != 0 ? trendingFilterOLrzqt2.KWHzl : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 64) != 0 ? trendingFilterOLrzqt2.AYXKKw : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 128) != 0 ? trendingFilterOLrzqt2.EZpvd : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 256) != 0 ? trendingFilterOLrzqt2.copydefault : false);
        } else if (i == 3) {
            TrendingFilter trendingFilterOLrzqt3 = c29346krsEZpvd.OLrzqt();
            trendingFilterCopydefault = trendingFilterOLrzqt3.copydefault((TypedValues.PositionType.TYPE_CURVE_FIT & 1) != 0 ? trendingFilterOLrzqt3.OLrzqt : "", (TypedValues.PositionType.TYPE_CURVE_FIT & 2) != 0 ? trendingFilterOLrzqt3.AEQbTJ : "", (TypedValues.PositionType.TYPE_CURVE_FIT & 4) != 0 ? trendingFilterOLrzqt3.gEmmrt : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 8) != 0 ? trendingFilterOLrzqt3.djBIcL : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 16) != 0 ? trendingFilterOLrzqt3.AhwBna : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 32) != 0 ? trendingFilterOLrzqt3.KWHzl : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 64) != 0 ? trendingFilterOLrzqt3.AYXKKw : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 128) != 0 ? trendingFilterOLrzqt3.EZpvd : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 256) != 0 ? trendingFilterOLrzqt3.copydefault : false);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            TrendingFilter trendingFilterOLrzqt4 = c29346krsEZpvd.OLrzqt();
            trendingFilterCopydefault = trendingFilterOLrzqt4.copydefault((TypedValues.PositionType.TYPE_CURVE_FIT & 1) != 0 ? trendingFilterOLrzqt4.OLrzqt : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 2) != 0 ? trendingFilterOLrzqt4.AEQbTJ : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 4) != 0 ? trendingFilterOLrzqt4.gEmmrt : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 8) != 0 ? trendingFilterOLrzqt4.djBIcL : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 16) != 0 ? trendingFilterOLrzqt4.AhwBna : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 32) != 0 ? trendingFilterOLrzqt4.KWHzl : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 64) != 0 ? trendingFilterOLrzqt4.AYXKKw : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 128) != 0 ? trendingFilterOLrzqt4.EZpvd : "", (TypedValues.PositionType.TYPE_CURVE_FIT & 256) != 0 ? trendingFilterOLrzqt4.copydefault : false);
        }
        surgeTabViewModel.AEQbTJ(trendingFilterCopydefault, c29346krsEZpvd.AEQbTJ().KWHzl());
    }

    public static final void OLrzqt(android.content.Context context, TokenBase tokenBase, java.lang.String str) {
        C29229kph.KWHzl(str);
        C25352ivB.openMarketDetailPage$default(context, "default_trade", tokenBase, "scanner_surge", null, new int[0], 8, null);
    }

    public static /* synthetic */ Modifier noHighlightClickable$default(Modifier modifier, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return EZpvd(modifier, z, (Function0<Unit>) function0);
    }

    /* JADX INFO: renamed from: o.krt$VoiceInteractor */
    public static final class VoiceInteractor implements yHO<Modifier, Composer, java.lang.Integer, Modifier> {
        public final /* synthetic */ Function0<Unit> AEQbTJ;
        public final /* synthetic */ boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(boolean z, Function0<Unit> function0) {
            this.OLrzqt = z;
            this.AEQbTJ = function0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, java.lang.Integer num) {
            return KWHzl(modifier, composer, num.intValue());
        }

        public final Modifier KWHzl(Modifier modifier, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(modifier, "");
            composer.startReplaceableGroup(-3135691);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-3135691, i, -1, "com.okinc.business.market.features.scanner.surge.ui.noHighlightClickable.<anonymous> (SurgeTabComposable.kt:943)");
            }
            composer.startReplaceableGroup(-1667198389);
            java.lang.Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier modifierM381clickableO2vRcR0$default = ClickableKt.m381clickableO2vRcR0$default(modifier, (MutableInteractionSource) objRememberedValue, null, this.OLrzqt, null, null, this.AEQbTJ, 24, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierM381clickableO2vRcR0$default;
        }
    }

    public static final Modifier EZpvd(@NotNull Modifier modifier, boolean z, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(modifier, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return ComposedModifierKt.composed$default(modifier, null, new VoiceInteractor(z, function0), 1, null);
    }

    public static final void EZpvd(final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(668942779);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                z = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(668942779, i3, -1, "com.okinc.business.market.features.scanner.surge.ui.SignalSkeletonScreen (SurgeTabComposable.kt:953)");
            }
            composerStartRestartGroup.startReplaceableGroup(401497720);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(401499732);
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.krY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.OLrzqt(mutableState, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 54);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(401505827);
            boolean z2 = (i3 & 14) == 4;
            java.lang.Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: o.krW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.copydefault(z, mutableState, (android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue3, modifierFillMaxSize$default, null, composerStartRestartGroup, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.krX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29347krt.AEQbTJ(z, i, i2, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final android.widget.LinearLayout copydefault(boolean z, MutableState mutableState, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C21558hDv c21558hDvOLrzqt = C21558hDv.OLrzqt(android.view.LayoutInflater.from(context), linearLayout, false);
        c21558hDvOLrzqt.copydefault.setOnTouchListener(new View.OnTouchListener() { // from class: o.krB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return C29347krt.OLrzqt(view, motionEvent);
            }
        });
        android.view.View view = c21558hDvOLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(z ? 0 : 8);
        OLrzqt((MutableState<android.view.View>) mutableState, c21558hDvOLrzqt.getRoot());
        android.view.View viewOLrzqt = OLrzqt((MutableState<android.view.View>) mutableState);
        if (viewOLrzqt != null) {
            C55418xja.AEQbTJ(viewOLrzqt);
        }
        Intrinsics.checkNotNullExpressionValue(c21558hDvOLrzqt, "");
        return c21558hDvOLrzqt.getRoot();
    }

    public static final void KWHzl(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(517054760);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(517054760, i, -1, "com.okinc.business.market.features.scanner.surge.ui.TrendingSkeletonScreen (SurgeTabComposable.kt:988)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1824710571);
            java.lang.Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1824708559);
            java.lang.Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.ksn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.copydefault(mutableState, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 54);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-1824702517);
            java.lang.Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: o.kss
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C29347krt.copydefault(mutableState, (android.content.Context) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue3, modifierFillMaxSize$default, null, composerStartRestartGroup, 54, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.kso
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C29347krt.copydefault(i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final android.widget.LinearLayout copydefault(MutableState mutableState, android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        hDC hdcOLrzqt = hDC.OLrzqt(android.view.LayoutInflater.from(context), linearLayout, false);
        hdcOLrzqt.copydefault.setOnTouchListener(new View.OnTouchListener() { // from class: o.krJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return C29347krt.AEQbTJ(view, motionEvent);
            }
        });
        copydefault((MutableState<android.view.View>) mutableState, hdcOLrzqt.getRoot());
        android.view.View viewEZpvd = EZpvd((MutableState<android.view.View>) mutableState);
        if (viewEZpvd != null) {
            C55418xja.AEQbTJ(viewEZpvd);
        }
        Intrinsics.checkNotNullExpressionValue(hdcOLrzqt, "");
        return hdcOLrzqt.getRoot();
    }

    public static final SmartMoneyConfig OLrzqt(androidx.compose.runtime.State<SmartMoneyConfig> state) {
        return state.getValue();
    }

    public static final C29297kqw copydefault(androidx.compose.runtime.State<C29297kqw> state) {
        return state.getValue();
    }

    public static final Function0<Unit> KWHzl(androidx.compose.runtime.State<? extends Function0<Unit>> state) {
        return state.getValue();
    }

    public static final InterfaceC29359ksE AEQbTJ(androidx.compose.runtime.State<? extends InterfaceC29359ksE> state) {
        return state.getValue();
    }

    public static final android.view.View OLrzqt(MutableState<android.view.View> mutableState) {
        return mutableState.getValue();
    }

    public static final void OLrzqt(MutableState<android.view.View> mutableState, android.view.View view) {
        mutableState.setValue(view);
    }

    public static final DisposableEffectResult OLrzqt(MutableState mutableState, DisposableEffectScope disposableEffectScope) {
        Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new Dialog(mutableState);
    }

    public static final android.view.View EZpvd(MutableState<android.view.View> mutableState) {
        return mutableState.getValue();
    }

    public static final void copydefault(MutableState<android.view.View> mutableState, android.view.View view) {
        mutableState.setValue(view);
    }

    public static final DisposableEffectResult copydefault(MutableState mutableState, DisposableEffectScope disposableEffectScope) {
        Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new TaskStackBuilder(mutableState);
    }
}

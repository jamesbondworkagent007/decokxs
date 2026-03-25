package o;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import com.google.android.material.appbar.MaterialToolbar;
import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import com.okinc.tradingbot.impl.aiBot.domain.model.ParamSpecUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.model.ParamType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC48051uDd;
import o.C48033uCm;
import o.uCF;

/* JADX INFO: renamed from: o.uDd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ActivityC48051uDd extends AbstractActivityC33041mov {
    public int AEQbTJ;
    public int EZpvd = 6;
    public final SnapshotStateList<C48068uDu> OLrzqt = SnapshotStateKt.mutableStateListOf();
    public Indicator copydefault;

    /* JADX INFO: renamed from: o.uDd$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ParamType.values().length];
            try {
                iArr[ParamType.INTEGER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ParamType.DECIMAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    public final boolean KWHzl() {
        Indicator indicator = this.copydefault;
        if (indicator != null) {
            return valueOf(indicator);
        }
        return false;
    }

    public final boolean copydefault() {
        Indicator indicator = this.copydefault;
        if (indicator != null) {
            return copydefault(indicator);
        }
        return false;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C48306uMp c48306uMpAEQbTJ = C48306uMp.AEQbTJ(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c48306uMpAEQbTJ, "");
        setContentView(c48306uMpAEQbTJ.getRoot());
        android.widget.LinearLayout root = c48306uMpAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        C52712wVo.AEQbTJ(root);
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null) {
            extras = BundleKt.bundleOf();
        }
        this.copydefault = (Indicator) BundleCompat.getParcelable(extras, "extra_indicator", Indicator.class);
        this.AEQbTJ = getIntent().getIntExtra("extra_remaining_slots", 0);
        this.EZpvd = getIntent().getIntExtra("extra_max_indicators", 6);
        Indicator indicator = this.copydefault;
        if (indicator == null) {
            finish();
            return;
        }
        EZpvd(indicator);
        MaterialToolbar materialToolbar = c48306uMpAEQbTJ.KWHzl;
        materialToolbar.setTitle(indicator.djBIcL());
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.uDb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC48051uDd.OLrzqt(this.AEQbTJ, view);
            }
        });
        c48306uMpAEQbTJ.EZpvd.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        c48306uMpAEQbTJ.EZpvd.setContent(ComposableLambdaKt.composableLambdaInstance(-1329499203, true, new Activity(indicator, this, c48306uMpAEQbTJ)));
        wYF wyf = c48306uMpAEQbTJ.copydefault;
        if (!copydefault()) {
            Intrinsics.copydefault(wyf);
            wyf.setVisibility(8);
            android.widget.TextView textView = c48306uMpAEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            return;
        }
        if (KWHzl()) {
            KWHzl(c48306uMpAEQbTJ, indicator);
            OLrzqt(c48306uMpAEQbTJ);
        } else {
            EZpvd(c48306uMpAEQbTJ, indicator);
            android.widget.TextView textView2 = c48306uMpAEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        }
    }

    public static final void OLrzqt(ActivityC48051uDd activityC48051uDd, android.view.View view) {
        activityC48051uDd.onBackPressed();
    }

    /* JADX INFO: renamed from: o.uDd$Activity */
    public static final class Activity implements Function2<Composer, java.lang.Integer, Unit> {
        public final /* synthetic */ Indicator AEQbTJ;
        public final /* synthetic */ C48306uMp KWHzl;
        public final /* synthetic */ ActivityC48051uDd copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Indicator indicator, ActivityC48051uDd activityC48051uDd, C48306uMp c48306uMp) {
            this.AEQbTJ = indicator;
            this.copydefault = activityC48051uDd;
            this.KWHzl = c48306uMp;
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
                    ComposerKt.traceEventStart(-1329499203, i, -1, "com.okinc.tradingbot.impl.aiBot.ui.indicators.IndicatorSettingsActivity.onCreate.<anonymous> (IndicatorSettingsActivity.kt:89)");
                }
                Indicator indicator = this.AEQbTJ;
                SnapshotStateList snapshotStateList = this.copydefault.OLrzqt;
                boolean zKWHzl = this.copydefault.KWHzl();
                boolean zCopydefault = this.copydefault.copydefault();
                composer.startReplaceableGroup(1772413551);
                boolean zChangedInstance = composer.changedInstance(this.copydefault);
                boolean zChangedInstance2 = composer.changedInstance(this.KWHzl);
                final ActivityC48051uDd activityC48051uDd = this.copydefault;
                final C48306uMp c48306uMp = this.KWHzl;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if ((zChangedInstance | zChangedInstance2) || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.uDj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ActivityC48051uDd.Activity.OLrzqt(activityC48051uDd, c48306uMp, (C48068uDu) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                C48054uDg.OLrzqt(indicator, snapshotStateList, zKWHzl, zCopydefault, (Function1) objRememberedValue, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit OLrzqt(ActivityC48051uDd activityC48051uDd, C48306uMp c48306uMp, C48068uDu c48068uDu) {
            Intrinsics.checkNotNullParameter(c48068uDu, "");
            if (activityC48051uDd.OLrzqt.size() > 1) {
                activityC48051uDd.OLrzqt.remove(c48068uDu);
                activityC48051uDd.copydefault(c48306uMp);
            }
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl(final C48306uMp c48306uMp, final Indicator indicator) {
        wYF wyf = c48306uMp.copydefault;
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.DcNNRp));
        wyf.setSecondaryText(C33069mpW.copydefault(C48033uCm.Fragment.gasjUx, C56423yEv.EZpvd(C56390yDp.OLrzqt("indicator", indicator.djBIcL()))));
        copydefault(c48306uMp);
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new View.OnClickListener() { // from class: o.uDe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC48051uDd.AEQbTJ(indicator, this, c48306uMp, view);
                }
            });
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.uDa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC48051uDd.gEmmrt(this.EZpvd, indicator, view);
                }
            });
        }
    }

    public static final void AEQbTJ(Indicator indicator, ActivityC48051uDd activityC48051uDd, C48306uMp c48306uMp, android.view.View view) {
        java.lang.Object next;
        java.util.Iterator<T> it = indicator.AYXKKw().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ParamSpecUiModel) next).AEQbTJ()) {
                    break;
                }
            }
        }
        ParamSpecUiModel paramSpecUiModel = (ParamSpecUiModel) next;
        if (paramSpecUiModel != null && activityC48051uDd.OLrzqt.size() - activityC48051uDd.AEQbTJ(indicator) < activityC48051uDd.AEQbTJ) {
            activityC48051uDd.OLrzqt.add(activityC48051uDd.copydefault(indicator, paramSpecUiModel));
            activityC48051uDd.copydefault(c48306uMp);
        }
    }

    public static final void gEmmrt(ActivityC48051uDd activityC48051uDd, Indicator indicator, android.view.View view) {
        if (activityC48051uDd.OLrzqt()) {
            activityC48051uDd.AhwBna(activityC48051uDd.KWHzl(indicator));
        }
    }

    public final void EZpvd(C48306uMp c48306uMp, final Indicator indicator) {
        wYF wyf = c48306uMp.copydefault;
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.DcNNRp));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.ODXsMY));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new View.OnClickListener() { // from class: o.uDf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC48051uDd.AEQbTJ(this.AEQbTJ, indicator, view);
                }
            });
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.uDh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC48051uDd.KWHzl(this.AEQbTJ, indicator, view);
                }
            });
        }
    }

    public static final void AEQbTJ(ActivityC48051uDd activityC48051uDd, Indicator indicator, android.view.View view) {
        activityC48051uDd.EZpvd(indicator);
    }

    public static final void KWHzl(ActivityC48051uDd activityC48051uDd, Indicator indicator, android.view.View view) {
        if (activityC48051uDd.OLrzqt()) {
            activityC48051uDd.AhwBna(activityC48051uDd.KWHzl(indicator));
        }
    }

    public final void copydefault(C48306uMp c48306uMp) {
        Indicator indicator = this.copydefault;
        if (indicator == null) {
            return;
        }
        boolean z = this.OLrzqt.size() - AEQbTJ(indicator) < this.AEQbTJ;
        C52794wYp c52794wYpAEQbTJ = c48306uMp.copydefault.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setEnabled(z);
        }
        OLrzqt(c48306uMp);
    }

    public final void OLrzqt(C48306uMp c48306uMp) {
        if (!KWHzl()) {
            android.widget.TextView textView = c48306uMp.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            return;
        }
        Indicator indicator = this.copydefault;
        if (indicator == null) {
            return;
        }
        if (this.OLrzqt.size() - AEQbTJ(indicator) >= this.AEQbTJ) {
            c48306uMp.AEQbTJ.setText(C33069mpW.copydefault(C48033uCm.Fragment.AxsJAYaxsJAY, C56423yEv.EZpvd(C56390yDp.OLrzqt("max", java.lang.String.valueOf(this.EZpvd)))));
            android.widget.TextView textView2 = c48306uMp.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            return;
        }
        android.widget.TextView textView3 = c48306uMp.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(8);
    }

    public final boolean valueOf(Indicator indicator) {
        java.util.List<ParamSpecUiModel> listAYXKKw = indicator.AYXKKw();
        if (!(listAYXKKw instanceof java.util.Collection) || !listAYXKKw.isEmpty()) {
            java.util.Iterator<T> it = listAYXKKw.iterator();
            while (it.hasNext()) {
                if (((ParamSpecUiModel) it.next()).AEQbTJ()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean copydefault(Indicator indicator) {
        return !indicator.AYXKKw().isEmpty();
    }

    public final int AEQbTJ(Indicator indicator) {
        if (indicator instanceof Indicator.MultiValue) {
            return ((Indicator.MultiValue) indicator).AhwBna().size();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: o.uDd */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(Indicator indicator) {
        java.util.Map mapKWHzl;
        this.OLrzqt.clear();
        if (indicator.AYXKKw().isEmpty()) {
            return;
        }
        if (indicator.gEmmrt()) {
            java.util.Map<java.lang.String, java.lang.Object> mapAEQbTJ = indicator.AEQbTJ();
            mapKWHzl = new LinkedHashMap(C56423yEv.copydefault(mapAEQbTJ.size()));
            java.util.Iterator<T> it = mapAEQbTJ.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                java.lang.Object key = entry.getKey();
                java.lang.Object value = entry.getValue();
                mapKWHzl.put(key, value instanceof java.util.List ? CollectionsKt___CollectionsKt.joinToString$default((java.lang.Iterable) value, ",", null, null, 0, null, new Function1() { // from class: o.uDi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC48051uDd.AEQbTJ(obj);
                    }
                }, 30, null) : value.toString());
            }
        } else {
            mapKWHzl = C56424yEw.KWHzl();
        }
        for (ParamSpecUiModel paramSpecUiModel : indicator.AYXKKw()) {
            if (paramSpecUiModel.AEQbTJ()) {
                AEQbTJ(indicator, paramSpecUiModel, (java.util.Map<java.lang.String, java.lang.String>) mapKWHzl);
            } else {
                SnapshotStateList<C48068uDu> snapshotStateList = this.OLrzqt;
                java.lang.String strOLrzqt = paramSpecUiModel.OLrzqt();
                java.lang.String str = (java.lang.String) mapKWHzl.get(paramSpecUiModel.OLrzqt());
                if (str == null) {
                    str = "";
                }
                snapshotStateList.add(copydefault(strOLrzqt, str, paramSpecUiModel));
            }
        }
    }

    public static final java.lang.CharSequence AEQbTJ(java.lang.Object obj) {
        return java.lang.String.valueOf(obj);
    }

    public final void AEQbTJ(Indicator indicator, ParamSpecUiModel paramSpecUiModel, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str = map.get(paramSpecUiModel.OLrzqt());
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            this.OLrzqt.add(copydefault(indicator, paramSpecUiModel));
            return;
        }
        int i = 0;
        for (java.lang.Object obj : StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            this.OLrzqt.add(KWHzl(indicator, paramSpecUiModel, StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) obj).toString()));
            i++;
        }
    }

    public final C48068uDu KWHzl(Indicator indicator, ParamSpecUiModel paramSpecUiModel, java.lang.String str) {
        java.util.List<java.lang.Integer> listEZpvd = paramSpecUiModel.EZpvd();
        java.lang.String strAEQbTJ = AEQbTJ(str, paramSpecUiModel.gEmmrt());
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (it.hasNext()) {
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            snapshotStateList.add(new wVQ(pTB.formatICUNumber$default(java.lang.Integer.valueOf(iIntValue), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null), iIntValue == C33129mqd.AhwBna(strAEQbTJ), true));
        }
        return new C48068uDu(null, indicator.djBIcL(), SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(strAEQbTJ, null, 2, null), SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null), snapshotStateList, paramSpecUiModel, true, 1, null);
    }

    public final C48068uDu copydefault(Indicator indicator, ParamSpecUiModel paramSpecUiModel) {
        java.util.List<java.lang.Integer> listEZpvd = paramSpecUiModel.EZpvd();
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (it.hasNext()) {
            snapshotStateList.add(new wVQ(pTB.formatICUNumber$default(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue()), null, C38307pTy.Companion.AEQbTJ(2), null, null, 13, null), false, true));
        }
        return new C48068uDu(null, indicator.djBIcL(), SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null), SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null), snapshotStateList, paramSpecUiModel, true, 1, null);
    }

    public final C48068uDu copydefault(java.lang.String str, java.lang.String str2, ParamSpecUiModel paramSpecUiModel) {
        return new C48068uDu(null, str, SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AEQbTJ(str2, paramSpecUiModel.gEmmrt()), null, 2, null), SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null), new SnapshotStateList(), paramSpecUiModel, false, 1, null);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, ParamType paramType) {
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return str;
        }
        int i = Application.KWHzl[paramType.ordinal()];
        if (i == 1) {
            return java.lang.String.valueOf(C33129mqd.AhwBna(str));
        }
        if (i == 2) {
            return str;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean OLrzqt() {
        boolean z = true;
        if (this.OLrzqt.isEmpty()) {
            return true;
        }
        for (C48068uDu c48068uDu : this.OLrzqt) {
            java.lang.String value = c48068uDu.djBIcL().getValue();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) value)) {
                MutableState<java.lang.String> mutableStateAEQbTJ = c48068uDu.AEQbTJ();
                ParamSpecUiModel paramSpecUiModelOLrzqt = c48068uDu.OLrzqt();
                mutableStateAEQbTJ.setValue(paramSpecUiModelOLrzqt != null ? paramSpecUiModelOLrzqt.KWHzl() : null);
            } else {
                double dAEQbTJ = C33129mqd.AEQbTJ(value);
                ParamSpecUiModel paramSpecUiModelOLrzqt2 = c48068uDu.OLrzqt();
                if (paramSpecUiModelOLrzqt2 != null) {
                    uCF ucfEZpvd = paramSpecUiModelOLrzqt2.EZpvd(dAEQbTJ);
                    if (ucfEZpvd instanceof uCF.TaskDescription) {
                        c48068uDu.AEQbTJ().setValue(((uCF.TaskDescription) ucfEZpvd).KWHzl());
                    } else {
                        c48068uDu.AEQbTJ().setValue(null);
                    }
                }
            }
            z = false;
        }
        return z;
    }

    public final Indicator KWHzl(Indicator indicator) {
        if (!(indicator instanceof Indicator.MultiValue)) {
            if (indicator instanceof Indicator.FixedParams) {
                java.util.List<java.lang.Number> listOLrzqt = OLrzqt(indicator);
                if (listOLrzqt != null && (!listOLrzqt.isEmpty())) {
                    return ((Indicator.FixedParams) indicator).copydefault(listOLrzqt).KWHzl(true);
                }
                return ((Indicator.FixedParams) indicator).KWHzl(false);
            }
            if (indicator instanceof Indicator.NoParams) {
                return indicator;
            }
            throw new NoWhenBranchMatchedException();
        }
        SnapshotStateList<C48068uDu> snapshotStateList = this.OLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<C48068uDu> it = snapshotStateList.iterator();
        while (it.hasNext()) {
            java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(it.next().djBIcL().getValue());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        if (!arrayList.isEmpty()) {
            return ((Indicator.MultiValue) indicator).copydefault(arrayList).KWHzl(true);
        }
        return ((Indicator.MultiValue) indicator).KWHzl(false);
    }

    public final java.util.List<java.lang.Number> OLrzqt(Indicator indicator) {
        java.lang.Object intOrNull;
        if (this.OLrzqt.size() != indicator.AYXKKw().size()) {
            return null;
        }
        java.util.List<kotlin.Pair> listValues = CollectionsKt___CollectionsKt.values(this.OLrzqt, indicator.AYXKKw());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.Pair pair : listValues) {
            C48068uDu c48068uDu = (C48068uDu) pair.component1();
            ParamSpecUiModel paramSpecUiModel = (ParamSpecUiModel) pair.component2();
            java.lang.String value = c48068uDu.djBIcL().getValue();
            int i = Application.KWHzl[paramSpecUiModel.gEmmrt().ordinal()];
            if (i == 1) {
                intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(value);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                intOrNull = C59443zhD.AuCTel(value);
            }
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        return arrayList;
    }

    public final void AhwBna(Indicator indicator) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("extra_indicator", indicator);
        setResult(-1, intent);
        finish();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

package o;

import android.graphics.drawable.DrawableWrapper;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.setting.SettingType;
import com.okinc.business.defi.biz.setting.SwitchType;
import com.okinc.business.defi.wallet.mine.WalletPreferencesActivity$updateUI$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.DebugKt;
import o.ActivityC18663fme;
import o.C13754dXa;
import o.C52761wXj;
import o.xWJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fme, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18663fme extends AbstractActivityC18528fkB {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public C16405ejM djBIcL;
    public boolean fetchVPNInfo;
    public final C43316rmw AhwBna = new C43316rmw();
    public final java.util.ArrayList<java.lang.Object> DbNXlk = new java.util.ArrayList<>();
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.fmp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC18663fme.gEmmrt();
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.fmo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC18663fme.AhwBna();
        }
    });
    public final java.lang.String isConnected = "setting_model";
    public final java.lang.String valueOf = "currency_model";
    public final java.lang.String AYXKKw = "language_model";

    /* JADX INFO: renamed from: o.fme$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SwitchType.values().length];
            try {
                iArr[SwitchType.TOUCH_SWITCH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SwitchType.HIDE_SMALL_ASSETS_AND_RISKY_TRANSACTION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SwitchType.HIDE_LOW_VALUE_ASSET.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SwitchType.SHOW_DEX_POSITIONS_WIDGET.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[SwitchType.HIDE_SMALL_ASSET.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[SettingType.values().length];
            try {
                iArr2[SettingType.FIAT_SWITCH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[SettingType.SELECT_LANG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[SettingType.NIGHT_MODE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[SettingType.RISE_FALL_COLOR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[SettingType.INTERACTION_PRIVACY_RULES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[SettingType.HIDE_LOW_VALUE_ASSET_TINY_THRESHOLD.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            AEQbTJ = iArr2;
        }
    }

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33507mxk
    public boolean needChangeUpDownColor() {
        return false;
    }

    public final xWJ DbNXlk() {
        return (xWJ) this.AkhnZx.getValue();
    }

    public static final xWJ gEmmrt() {
        return (xWJ) C43251rlk.copydefault(xWJ.class);
    }

    /* JADX DEBUG: Possible override for method o.fkB.valueOf()V */
    public final gKN valueOf() {
        return (gKN) this.gEmmrt.getValue();
    }

    public static final gKN AhwBna() {
        return (gKN) C43251rlk.copydefault(gKN.class);
    }

    /* JADX INFO: renamed from: o.fme$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fme.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void EZpvd(@NotNull android.content.Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18663fme.class);
            intent.putExtra("night_mode", z);
            context.startActivity(intent);
        }
    }

    private final void fIwbmz() {
        android.content.Intent intent = getIntent();
        this.fetchVPNInfo = intent != null ? intent.getBooleanExtra("night_mode", false) : false;
    }

    @Override // o.AbstractActivityC18528fkB, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C16405ejM c16405ejMEZpvd = C16405ejM.EZpvd(getLayoutInflater());
        this.djBIcL = c16405ejMEZpvd;
        if (c16405ejMEZpvd == null) {
            Intrinsics.gEmmrt("");
            c16405ejMEZpvd = null;
        }
        setContentView(c16405ejMEZpvd.getRoot());
        fIwbmz();
        ejfBZ();
    }

    private final void ejfBZ() {
        C32866mlf.KWHzl("preference_settings_model", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.fmi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18663fme.AhwBna(this.KWHzl, (EventParamsList) obj);
            }
        });
        C16405ejM c16405ejM = this.djBIcL;
        C16405ejM c16405ejM2 = null;
        if (c16405ejM == null) {
            Intrinsics.gEmmrt("");
            c16405ejM = null;
        }
        c16405ejM.OLrzqt.setTitleTypeface("harmony_sans_bold.ttf");
        C16405ejM c16405ejM3 = this.djBIcL;
        if (c16405ejM3 == null) {
            Intrinsics.gEmmrt("");
            c16405ejM3 = null;
        }
        c16405ejM3.KWHzl.setLayoutManager(new LinearLayoutManager(this, 1, false));
        C16405ejM c16405ejM4 = this.djBIcL;
        if (c16405ejM4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16405ejM2 = c16405ejM4;
        }
        c16405ejM2.KWHzl.setAdapter(this.AhwBna);
        AYXKKw();
        fetchVPNInfo();
    }

    public static final Unit AhwBna(ActivityC18663fme activityC18663fme, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(activityC18663fme.isConnected, "0", true);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC18528fkB, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        fetchVPNInfo();
    }

    private final void fetchVPNInfo() {
        isConnected();
        values();
        getSupportFragmentManager().setFragmentResultListener("hide_asset_value_request_key", this, new FragmentResultListener() { // from class: o.fmj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC18663fme.EZpvd(this.KWHzl, str, bundle);
            }
        });
    }

    public static final void EZpvd(ActivityC18663fme activityC18663fme, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        final java.lang.String string = bundle.getString("hide_asset_value_result_key", "1");
        xWV xwv = (xWV) C43251rlk.copydefault(xWV.class);
        Intrinsics.copydefault((java.lang.Object) string);
        xwv.copydefault(string);
        RxBus.AEQbTJ(new xXS(true));
        activityC18663fme.isConnected();
        C32866mlf.onEvent$default("Preferences_HideLowValueAssets_Popup_Click", (TrackChannel[]) null, new Function1() { // from class: o.fml
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18663fme.EZpvd(string, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Intrinsics.copydefault((java.lang.Object) str);
        EventParamsList.put$default(eventParamsList, "number_of_threshold", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        this.AhwBna.register(java.lang.String.class, new TaskDescription());
        this.AhwBna.register(C13905dbR.class, new Application());
        this.AhwBna.register(C13910dbW.class, new StateListAnimator());
        this.AhwBna.register(C13908dbU.class, new Fragment());
    }

    /* JADX INFO: renamed from: o.fme$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription extends AbstractC59533zio<java.lang.String, RecyclerView.ViewHolder> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, java.lang.String str) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(str, "");
        }

        /* JADX INFO: renamed from: o.fme$TaskDescription$ActionBar */
        public static final class ActionBar extends RecyclerView.ViewHolder {
            public ActionBar(android.view.View view) {
                super(view);
            }
        }

        @Override // o.AbstractC59533zio
        public RecyclerView.ViewHolder onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new ActionBar(layoutInflater.inflate(C13754dXa.TaskDescription.isScanInProgress, viewGroup, false));
        }
    }

    /* JADX INFO: renamed from: o.fme$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application extends AbstractC59533zio<C13905dbR, RecyclerView.ViewHolder> {
        public Application() {
        }

        /* JADX INFO: renamed from: o.fme$Application$Activity */
        public static final class Activity extends RecyclerView.ViewHolder {
            public Activity(android.view.View view) {
                super(view);
            }
        }

        @Override // o.AbstractC59533zio
        public RecyclerView.ViewHolder onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new Activity(layoutInflater.inflate(C13754dXa.TaskDescription.sJPPOI, viewGroup, false));
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final C13905dbR c13905dbR) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(c13905dbR, "");
            android.view.View view = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            OKRegularCell oKRegularCell = (OKRegularCell) C33054mpH.copydefault(view, C13754dXa.ActionBar.OEsIKP);
            oKRegularCell.setTitle(c13905dbR.valueOf());
            oKRegularCell.EZpvd().setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
            android.view.View view2 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            C55068xcv c55068xcv = (C55068xcv) C33054mpH.copydefault(view2, C13754dXa.ActionBar.sSMYrx);
            java.lang.CharSequence charSequenceCopydefault = c13905dbR.copydefault();
            if (charSequenceCopydefault == null) {
                charSequenceCopydefault = c13905dbR.OLrzqt();
            }
            c55068xcv.setText(charSequenceCopydefault);
            android.view.View view3 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "");
            java.lang.Integer num = null;
            ((C55068xcv) C33054mpH.copydefault(view3, C13754dXa.ActionBar.sSMYrx)).setIcon(c13905dbR.djBIcL() ? ActivityC18663fme.this.AkhnZx() : null);
            android.view.View view4 = viewHolder.itemView;
            final ActivityC18663fme activityC18663fme = ActivityC18663fme.this;
            view4.setOnClickListener(new View.OnClickListener() { // from class: o.fmu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view5) {
                    ActivityC18663fme.Application.AEQbTJ(activityC18663fme, c13905dbR, view5);
                }
            });
            java.lang.Integer numAEQbTJ = c13905dbR.AEQbTJ();
            if (numAEQbTJ != null && numAEQbTJ.intValue() != 0) {
                num = numAEQbTJ;
            }
            android.view.View view5 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view5, "");
            android.widget.ImageView imageView = (android.widget.ImageView) C33054mpH.copydefault(view5, C13754dXa.ActionBar.dYepVG);
            if (num != null) {
                Intrinsics.copydefault(imageView);
                imageView.setVisibility(0);
                imageView.setImageResource(num.intValue());
            } else {
                Intrinsics.copydefault(imageView);
                imageView.setVisibility(8);
            }
            java.lang.String strEZpvd = c13905dbR.EZpvd();
            imageView.setContentDescription(strEZpvd != null ? strEZpvd : "");
        }

        public static final void AEQbTJ(ActivityC18663fme activityC18663fme, C13905dbR c13905dbR, android.view.View view) {
            activityC18663fme.OLrzqt(c13905dbR.KWHzl());
        }
    }

    /* JADX INFO: renamed from: o.fme$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator extends AbstractC59533zio<C13910dbW, RecyclerView.ViewHolder> {
        public StateListAnimator() {
        }

        /* JADX INFO: renamed from: o.fme$StateListAnimator$ActionBar */
        public static final class ActionBar extends RecyclerView.ViewHolder {
            public ActionBar(android.view.View view) {
                super(view);
            }
        }

        @Override // o.AbstractC59533zio
        public RecyclerView.ViewHolder onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new ActionBar(layoutInflater.inflate(C13754dXa.TaskDescription.OqhRBMiKdSzF, viewGroup, false));
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final C13910dbW c13910dbW) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(c13910dbW, "");
            android.view.View view = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "");
            android.view.View viewCopydefault = C33054mpH.copydefault(view, C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplApi21ExtraSession);
            final ActivityC18663fme activityC18663fme = ActivityC18663fme.this;
            C55239xgG c55239xgG = (C55239xgG) viewCopydefault;
            c55239xgG.setOnClickListener(new View.OnClickListener() { // from class: o.fmt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    ActivityC18663fme.StateListAnimator.KWHzl(activityC18663fme, c13910dbW, view2);
                }
            });
            c55239xgG.setChecked(c13910dbW.KWHzl());
            android.view.View view2 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            OKRegularCell oKRegularCell = (OKRegularCell) C33054mpH.copydefault(view2, C13754dXa.ActionBar.RgLUBD);
            oKRegularCell.EZpvd().setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
            if (c13910dbW.copydefault()) {
                java.lang.String strOLrzqt = c13910dbW.OLrzqt();
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strOLrzqt);
                android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(ActivityC18663fme.this, C52761wXj.TaskDescription.GGlJim);
                if (drawable != null) {
                    ActivityC18663fme activityC18663fme2 = ActivityC18663fme.this;
                    drawable.setBounds(0, 0, (int) C55298xhM.dp$default(20.0f, (android.content.Context) null, 1, (java.lang.Object) null), (int) C55298xhM.dp$default(20.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                    drawable.setLayoutDirection(activityC18663fme2.getResources().getConfiguration().getLayoutDirection());
                    DrawableCompat.setTint(drawable, ContextCompat.getColor(activityC18663fme2, C52761wXj.Activity.QwvEab));
                    C57306yft c57306yft = new C57306yft(drawable, (int) C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null), (int) C55298xhM.dp$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                    spannableStringBuilder.append((java.lang.CharSequence) "h");
                    spannableStringBuilder.setSpan(c57306yft, strOLrzqt.length(), strOLrzqt.length() + 1, 33);
                }
                final ActivityC18663fme activityC18663fme3 = ActivityC18663fme.this;
                oKRegularCell.setTitle(spannableStringBuilder);
                oKRegularCell.EZpvd().setOnClickListener(new View.OnClickListener() { // from class: o.fmq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view3) {
                        ActivityC18663fme.StateListAnimator.copydefault(activityC18663fme3, c13910dbW, view3);
                    }
                });
                return;
            }
            if (c13910dbW.AEQbTJ() == SwitchType.HIDE_SMALL_ASSETS_AND_RISKY_TRANSACTION || c13910dbW.AEQbTJ() == SwitchType.HIDE_LOW_VALUE_ASSET) {
                oKRegularCell.setTitle(c13910dbW.OLrzqt());
            } else {
                oKRegularCell.setTitle(c13910dbW.OLrzqt());
                oKRegularCell.EZpvd().setTextAppearance(C52761wXj.LoaderManager.run);
            }
        }

        public static final void KWHzl(ActivityC18663fme activityC18663fme, C13910dbW c13910dbW, android.view.View view) {
            activityC18663fme.AEQbTJ(c13910dbW.AEQbTJ(), !c13910dbW.KWHzl());
        }

        public static final void copydefault(ActivityC18663fme activityC18663fme, C13910dbW c13910dbW, android.view.View view) {
            activityC18663fme.EZpvd(c13910dbW.AEQbTJ());
        }
    }

    /* JADX INFO: renamed from: o.fme$Fragment */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Fragment extends AbstractC59533zio<C13908dbU, RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: o.fme$Fragment$Activity */
        public static final class Activity extends RecyclerView.ViewHolder {
            public Activity(android.view.View view) {
                super(view);
            }
        }

        @Override // o.AbstractC59533zio
        public RecyclerView.ViewHolder onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new Activity(layoutInflater.inflate(C13754dXa.TaskDescription.finishInit, viewGroup, false));
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, C13908dbU c13908dbU) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(c13908dbU, "");
            ((android.widget.TextView) viewHolder.itemView.findViewById(C13754dXa.ActionBar.PlaybackStateCompatBuilder)).setText(c13908dbU.AEQbTJ());
        }
    }

    public final void AEQbTJ(SwitchType switchType, final boolean z) {
        C14724dqp.EZpvd.AEQbTJ(100L);
        int i = ActionBar.KWHzl[switchType.ordinal()];
        if (i == 1) {
            DbNXlk().copydefault(z);
            isConnected();
            C32866mlf.onEvent$default("Web3Settings_Preference_TactileFeedback_Click", (TrackChannel[]) null, new Function1() { // from class: o.fmb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18663fme.KWHzl(z, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            return;
        }
        if (i == 2) {
            ((xWV) C43251rlk.copydefault(xWV.class)).OLrzqt(z);
            isConnected();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            valueOf().KWHzl(this, z);
            isConnected();
            return;
        }
        final xWV xwv = (xWV) C43251rlk.copydefault(xWV.class);
        xwv.KWHzl(z);
        RxBus.AEQbTJ(new xXS(z));
        isConnected();
        C32866mlf.onEvent$default("Preferences_HideLowValueAssets_Switch_Click", (TrackChannel[]) null, new Function1() { // from class: o.fmf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18663fme.OLrzqt(z, xwv, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button", z ? DebugKt.DEBUG_PROPERTY_VALUE_ON : DebugKt.DEBUG_PROPERTY_VALUE_OFF, true);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(boolean z, xWV xwv, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("status", z ? "On" : "Off", true);
        EventParamsList.put$default(eventParamsList, "number_of_threshold", xwv.AEQbTJ(), false, 4, null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(SwitchType switchType) {
        int i = ActionBar.KWHzl[switchType.ordinal()];
        if (i == 4) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
            viewOnClickListenerC54939xaY.setTitle(getString(C13754dXa.FragmentManager.ActionBarOnMenuVisibilityListener));
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActionBarOnNavigationListener));
            viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.DarRvM, new View.OnClickListener() { // from class: o.fmm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC18663fme.KWHzl(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
            return;
        }
        if (i != 5) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY2.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.startSupportActionMode));
        viewOnClickListenerC54939xaY2.EZpvd(C13754dXa.FragmentManager.DarRvM, new View.OnClickListener() { // from class: o.fmn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18663fme.OLrzqt(viewOnClickListenerC54939xaY2, view);
            }
        });
        viewOnClickListenerC54939xaY2.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void isConnected() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletPreferencesActivity$updateUI$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(java.lang.String str) {
        java.lang.String string;
        java.lang.String str2;
        xWV xwv;
        java.lang.Object objM7377constructorimpl;
        this.DbNXlk.clear();
        if (android.text.TextUtils.isEmpty(str)) {
            java.util.ArrayList<java.lang.Object> arrayList = this.DbNXlk;
            SettingType settingType = SettingType.SELECT_LANG;
            java.lang.String string2 = getString(C13754dXa.FragmentManager.gEmmrt);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            arrayList.add(new C13905dbR(settingType, string2, true, "", null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "한국어")) {
                str = "English";
            }
            java.lang.String str3 = str;
            java.util.ArrayList<java.lang.Object> arrayList2 = this.DbNXlk;
            SettingType settingType2 = SettingType.SELECT_LANG;
            java.lang.String string3 = getString(C13754dXa.FragmentManager.gEmmrt);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            arrayList2.add(new C13905dbR(settingType2, string3, true, str3, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        }
        java.util.ArrayList<java.lang.Object> arrayList3 = this.DbNXlk;
        SettingType settingType3 = SettingType.FIAT_SWITCH;
        java.lang.String string4 = getString(C13754dXa.FragmentManager.AhwBna);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        arrayList3.add(new C13905dbR(settingType3, string4, true, ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).QVAiDq(), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        int iEZpvd = C33492mxV.EZpvd();
        if (iEZpvd == -1) {
            string = getString(C13754dXa.FragmentManager.djBIcL);
        } else if (iEZpvd == 1) {
            string = getString(C13754dXa.FragmentManager.DbNXlk);
        } else {
            if (iEZpvd != 2) {
                str2 = "";
                Intrinsics.copydefault((java.lang.Object) str2);
                java.util.ArrayList<java.lang.Object> arrayList4 = this.DbNXlk;
                SettingType settingType4 = SettingType.NIGHT_MODE;
                java.lang.String string5 = getString(C13754dXa.FragmentManager.valueOf);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                arrayList4.add(new C13905dbR(settingType4, string5, true, str2, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
                java.util.ArrayList<java.lang.Object> arrayList5 = this.DbNXlk;
                SettingType settingType5 = SettingType.RISE_FALL_COLOR;
                java.lang.String string6 = getString(C13754dXa.FragmentManager.ActionBarNavigationMode);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                arrayList5.add(new C13905dbR(settingType5, string6, true, null, null, java.lang.Integer.valueOf(DbNXlk().copydefault()), DbNXlk().AhwBna(), 24, null));
                java.util.ArrayList<java.lang.Object> arrayList6 = this.DbNXlk;
                SettingType settingType6 = SettingType.INTERACTION_PRIVACY_RULES;
                java.lang.String string7 = getString(C13754dXa.FragmentManager.show);
                Intrinsics.checkNotNullExpressionValue(string7, "");
                arrayList6.add(new C13905dbR(settingType6, string7, true, null, null, null, null, 120, null));
                java.util.ArrayList<java.lang.Object> arrayList7 = this.DbNXlk;
                SwitchType switchType = SwitchType.SHOW_DEX_POSITIONS_WIDGET;
                java.lang.String string8 = getString(C13754dXa.FragmentManager.onMenuVisibilityChanged);
                Intrinsics.checkNotNullExpressionValue(string8, "");
                arrayList7.add(new C13910dbW(switchType, string8, valueOf().EZpvd(), true, null, 16, null));
                this.DbNXlk.add("");
                xwv = (xWV) C43251rlk.copydefault(xWV.class);
                java.util.ArrayList<java.lang.Object> arrayList8 = this.DbNXlk;
                SwitchType switchType2 = SwitchType.HIDE_SMALL_ASSETS_AND_RISKY_TRANSACTION;
                java.lang.String string9 = getString(C13754dXa.FragmentManager.ActionBarTabListener);
                Intrinsics.checkNotNullExpressionValue(string9, "");
                arrayList8.add(new C13910dbW(switchType2, string9, xwv.OLrzqt(), false, null, 16, null));
                java.util.ArrayList<java.lang.Object> arrayList9 = this.DbNXlk;
                SwitchType switchType3 = SwitchType.HIDE_LOW_VALUE_ASSET;
                java.lang.String string10 = getString(C13754dXa.FragmentManager.setTag);
                Intrinsics.checkNotNullExpressionValue(string10, "");
                arrayList9.add(new C13910dbW(switchType3, string10, xwv.KWHzl(), false, null, 16, null));
                if (xwv.KWHzl()) {
                    return;
                }
                java.lang.String strAEQbTJ = xwv.AEQbTJ();
                java.lang.String string11 = getString(C13754dXa.FragmentManager.sendRepeatMode);
                Intrinsics.checkNotNullExpressionValue(string11, "");
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C54862xYb.formatAmtWithSymbol$default(C33129mqd.EZpvd(strAEQbTJ), C38307pTy.Companion.AEQbTJ(2), string11, false, null, 8, null));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                java.lang.String amtWithSymbol$default = (java.lang.String) objM7377constructorimpl;
                if (amtWithSymbol$default == null) {
                    amtWithSymbol$default = C54862xYb.formatAmtWithSymbol$default(C33129mqd.EZpvd("1"), C38307pTy.Companion.AEQbTJ(2), string11, false, null, 8, null);
                }
                pUU.copydefault("zqh", "display tinyThresholdMap = " + strAEQbTJ);
                java.util.ArrayList<java.lang.Object> arrayList10 = this.DbNXlk;
                SettingType settingType7 = SettingType.HIDE_LOW_VALUE_ASSET_TINY_THRESHOLD;
                java.lang.String string12 = getString(C13754dXa.FragmentManager.onTabSelected);
                Intrinsics.checkNotNullExpressionValue(string12, "");
                arrayList10.add(new C13905dbR(settingType7, string12, false, amtWithSymbol$default, null, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
                return;
            }
            string = getString(C13754dXa.FragmentManager.AYXKKw);
        }
        str2 = string;
        Intrinsics.copydefault((java.lang.Object) str2);
        java.util.ArrayList<java.lang.Object> arrayList42 = this.DbNXlk;
        SettingType settingType42 = SettingType.NIGHT_MODE;
        java.lang.String string52 = getString(C13754dXa.FragmentManager.valueOf);
        Intrinsics.checkNotNullExpressionValue(string52, "");
        arrayList42.add(new C13905dbR(settingType42, string52, true, str2, null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null));
        java.util.ArrayList<java.lang.Object> arrayList52 = this.DbNXlk;
        SettingType settingType52 = SettingType.RISE_FALL_COLOR;
        java.lang.String string62 = getString(C13754dXa.FragmentManager.ActionBarNavigationMode);
        Intrinsics.checkNotNullExpressionValue(string62, "");
        arrayList52.add(new C13905dbR(settingType52, string62, true, null, null, java.lang.Integer.valueOf(DbNXlk().copydefault()), DbNXlk().AhwBna(), 24, null));
        java.util.ArrayList<java.lang.Object> arrayList62 = this.DbNXlk;
        SettingType settingType62 = SettingType.INTERACTION_PRIVACY_RULES;
        java.lang.String string72 = getString(C13754dXa.FragmentManager.show);
        Intrinsics.checkNotNullExpressionValue(string72, "");
        arrayList62.add(new C13905dbR(settingType62, string72, true, null, null, null, null, 120, null));
        java.util.ArrayList<java.lang.Object> arrayList72 = this.DbNXlk;
        SwitchType switchType4 = SwitchType.SHOW_DEX_POSITIONS_WIDGET;
        java.lang.String string82 = getString(C13754dXa.FragmentManager.onMenuVisibilityChanged);
        Intrinsics.checkNotNullExpressionValue(string82, "");
        arrayList72.add(new C13910dbW(switchType4, string82, valueOf().EZpvd(), true, null, 16, null));
        this.DbNXlk.add("");
        xwv = (xWV) C43251rlk.copydefault(xWV.class);
        java.util.ArrayList<java.lang.Object> arrayList82 = this.DbNXlk;
        SwitchType switchType22 = SwitchType.HIDE_SMALL_ASSETS_AND_RISKY_TRANSACTION;
        java.lang.String string92 = getString(C13754dXa.FragmentManager.ActionBarTabListener);
        Intrinsics.checkNotNullExpressionValue(string92, "");
        arrayList82.add(new C13910dbW(switchType22, string92, xwv.OLrzqt(), false, null, 16, null));
        java.util.ArrayList<java.lang.Object> arrayList92 = this.DbNXlk;
        SwitchType switchType32 = SwitchType.HIDE_LOW_VALUE_ASSET;
        java.lang.String string102 = getString(C13754dXa.FragmentManager.setTag);
        Intrinsics.checkNotNullExpressionValue(string102, "");
        arrayList92.add(new C13910dbW(switchType32, string102, xwv.KWHzl(), false, null, 16, null));
        if (xwv.KWHzl()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fJNWhG() {
        this.AhwBna.setItems(this.DbNXlk);
        try {
            this.AhwBna.notifyDataSetChanged();
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }

    public final void OLrzqt(SettingType settingType) {
        switch (ActionBar.AEQbTJ[settingType.ordinal()]) {
            case 1:
                C32866mlf.KWHzl("preference_settings_currency_model", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.fmd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC18663fme.KWHzl(this.AEQbTJ, (EventParamsList) obj);
                    }
                });
                DbNXlk().copydefault(this, 0);
                break;
            case 2:
                C32866mlf.KWHzl("preference_settings_language_model", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.fmc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC18663fme.OLrzqt(this.EZpvd, (EventParamsList) obj);
                    }
                });
                xWJ.Application.routeUpdateLanguage$default(DbNXlk(), this, null, null, 6, null);
                break;
            case 3:
                xWJ xwjDbNXlk = DbNXlk();
                androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                xwjDbNXlk.OLrzqt(supportFragmentManager);
                break;
            case 4:
                C32866mlf.onEvent$default("Web3Settings_Preference_ColorPreference_Click", (TrackChannel[]) null, new Function1() { // from class: o.fmk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC18663fme.EZpvd((EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                xWJ xwjDbNXlk2 = DbNXlk();
                androidx.fragment.app.FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                xwjDbNXlk2.copydefault(supportFragmentManager2, false, this, new Function0() { // from class: o.fmg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ActivityC18663fme.KWHzl(this.EZpvd);
                    }
                });
                break;
            case 5:
                C32866mlf.onEvent$default("Web3Settings_Preference_InteractionPrivacy_Click", (TrackChannel[]) null, new Function1() { // from class: o.fmh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC18663fme.copydefault((EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                ActivityC18874fqe.Companion.copydefault(this);
                break;
            case 6:
                C18576fkx c18576fkxOLrzqt = C18576fkx.Companion.OLrzqt(((xWV) C43251rlk.copydefault(xWV.class)).AEQbTJ());
                androidx.fragment.app.FragmentManager supportFragmentManager3 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
                c18576fkxOLrzqt.show(supportFragmentManager3);
                break;
        }
    }

    public static final Unit KWHzl(ActivityC18663fme activityC18663fme, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(activityC18663fme.valueOf, "0", true);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC18663fme activityC18663fme, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(activityC18663fme.AYXKKw, "0", true);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC18663fme activityC18663fme) {
        activityC18663fme.isConnected();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.graphics.drawable.Drawable AkhnZx() {
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.DGOPHZDGOPHZ);
        if (drawableKWHzl == null) {
            return null;
        }
        DrawableCompat.setTint(drawableKWHzl, C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
        int i = (int) (20 * getResources().getDisplayMetrics().density);
        return new FragmentManager(drawableKWHzl, (int) (i * (drawableKWHzl.getIntrinsicWidth() / drawableKWHzl.getIntrinsicHeight())), i);
    }

    /* JADX INFO: renamed from: o.fme$FragmentManager */
    public static final class FragmentManager extends DrawableWrapper {
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public int getIntrinsicHeight() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(android.graphics.drawable.Drawable drawable, int i, int i2) {
            super(drawable);
            this.KWHzl = i;
            this.OLrzqt = i2;
        }
    }

    public final void values() {
        java.util.ArrayList<java.lang.Object> arrayList = this.DbNXlk;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (java.lang.Object obj : arrayList) {
            if (obj instanceof C13905dbR) {
                C13905dbR c13905dbR = (C13905dbR) obj;
                if (c13905dbR.KWHzl() == SettingType.FIAT_SWITCH) {
                    c13905dbR.AEQbTJ(((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).QVAiDq());
                }
            }
            arrayList2.add(Unit.INSTANCE);
        }
        C33064mpR.OLrzqt(this.AhwBna, (java.util.List<? extends java.lang.Object>) this.DbNXlk);
    }

    @Override // o.AbstractActivityC18528fkB, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC18528fkB, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC18528fkB, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

package o;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.google.android.material.tabs.TabLayout;
import com.okinc.biz.TacticsType;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.tradingbot.impl.common.remoteimage.CoinRemoteImage;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.uilab.stateful.StatefulView;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ContractGridVo;
import com.okinc.unify_trade.biz.MarginPerCcyVo;
import com.okinc.unify_trade.biz.ProfitMarginPerCcyVo;
import com.okinc.unify_trade.biz.SlippageVo;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.UnitDisplayVo;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.MpStgyCopyProfitChangeData;
import com.okinc.unify_trade.bot.data.SwapCoinMProfitSwitchUiModel;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsListLabelLeverPrincipalData;
import com.okinc.unify_trade.bot.data.TacticsListLabelUiData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVipProfitData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVoucherData;
import com.okinc.unify_trade.bot.list.CardStyle;
import com.okinc.unify_trade.bot.mapper.CoinMarginedCcyDisplay;
import com.okinc.unify_trade.bot.util.TacticsListButtonItem;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C54066wxO;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wOi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52517wOi extends AbstractC59533zio<TacticsData, C52515wOg> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public int AEQbTJ;
    public final boolean AhwBna;
    public final java.lang.Integer EZpvd;
    public final WeakReference<androidx.fragment.app.FragmentManager> OLrzqt;
    public final WeakReference<C52499wNr> copydefault;

    public C52517wOi(@NotNull C52499wNr c52499wNr, androidx.fragment.app.FragmentManager fragmentManager, boolean z, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(c52499wNr, "");
        this.AhwBna = z;
        this.EZpvd = num;
        this.OLrzqt = new WeakReference<>(fragmentManager);
        this.copydefault = new WeakReference<>(c52499wNr);
        this.AEQbTJ = C48033uCm.ActionBar.AuCTelauCTel;
    }

    /* JADX INFO: renamed from: o.wOi$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wOi.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C52515wOg onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.hPlhRW, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        C52515wOg c52515wOg = new C52515wOg(viewInflate);
        c52515wOg.iwGUEr().djBIcL(C48033uCm.Activity.svY);
        return c52515wOg;
    }

    /* JADX INFO: renamed from: o.wOi$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ TacticsData OLrzqt;
        public final /* synthetic */ C52517wOi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C52517wOi c52517wOi, TacticsData tacticsData) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = c52517wOi;
            this.OLrzqt = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function1<TacticsData, Unit> function1KWHzl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C52499wNr c52499wNr = (C52499wNr) this.copydefault.copydefault.get();
                if (c52499wNr == null || (function1KWHzl = c52499wNr.KWHzl()) == null) {
                    return;
                }
                function1KWHzl.invoke(this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.wOi$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ TacticsData EZpvd;
        public final /* synthetic */ C52515wOg KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C52515wOg c52515wOg, TacticsData tacticsData) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c52515wOg;
            this.EZpvd = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C50252vHn c50252vHn = C50252vHn.OLrzqt;
                android.content.Context context = this.KWHzl.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c50252vHn.KWHzl(context, this.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.wOi$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ TacticsData AEQbTJ;
        public final /* synthetic */ C52515wOg EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C52517wOi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C52515wOg c52515wOg, C52517wOi c52517wOi, TacticsData tacticsData) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c52515wOg;
            this.copydefault = c52517wOi;
            this.AEQbTJ = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.EZpvd.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.createHandler));
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.ActivityViewModelLazyKt));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.fetchVPNInfo), (View.OnClickListener) this.copydefault.new ActionBar(this.AEQbTJ, viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcherKt), (View.OnClickListener) new Application(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.wOi$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ TacticsData EZpvd;
        public final /* synthetic */ C52515wOg KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C52515wOg c52515wOg, TacticsData tacticsData) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c52515wOg;
            this.EZpvd = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.setMetadata));
                viewOnClickListenerC54939xaY.EZpvd(this.EZpvd.getCTime());
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), (View.OnClickListener) new LoaderManager(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.wOi$PictureInPictureParams */
    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ TacticsListLabelUiData AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C52517wOi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(android.view.View view, long j, C52517wOi c52517wOi, TacticsListLabelUiData tacticsListLabelUiData) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c52517wOi;
            this.AEQbTJ = tacticsListLabelUiData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                androidx.fragment.app.FragmentManager fragmentManager = (androidx.fragment.app.FragmentManager) this.copydefault.OLrzqt.get();
                if (fragmentManager != null) {
                    C54066wxO.ActionBar actionBar = C54066wxO.Companion;
                    java.lang.String strKWHzl = ((TacticsListLabelVipProfitData) this.AEQbTJ).EZpvd().KWHzl();
                    if (strKWHzl == null) {
                        strKWHzl = "";
                    }
                    actionBar.AEQbTJ(fragmentManager, strKWHzl, (56 & 4) != 0 ? null : null, (56 & 8) != 0 ? null : ((TacticsListLabelVipProfitData) this.AEQbTJ).EZpvd(), (56 & 16) != 0 ? false : false, (56 & 32) != 0 ? 0 : 0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wOi$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ TacticsListLabelUiData EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C52517wOi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, C52517wOi c52517wOi, TacticsListLabelUiData tacticsListLabelUiData) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c52517wOi;
            this.EZpvd = tacticsListLabelUiData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                androidx.fragment.app.FragmentManager fragmentManager = (androidx.fragment.app.FragmentManager) this.copydefault.OLrzqt.get();
                if (fragmentManager != null) {
                    new C51972vxB(((TacticsListLabelLeverPrincipalData) this.EZpvd).djBIcL(), ((TacticsListLabelLeverPrincipalData) this.EZpvd).gEmmrt(), ((TacticsListLabelLeverPrincipalData) this.EZpvd).EZpvd()).show(fragmentManager);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wOi$TaskStackBuilder */
    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ TacticsData AEQbTJ;
        public final /* synthetic */ TacticsListLabelUiData EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C52517wOi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.view.View view, long j, C52517wOi c52517wOi, TacticsListLabelUiData tacticsListLabelUiData, TacticsData tacticsData) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c52517wOi;
            this.EZpvd = tacticsListLabelUiData;
            this.AEQbTJ = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            yHO<TacticsVoucherInfo, TacticsType, java.lang.Boolean, Unit> yhoDbNXlk;
            AbstractC54531xLw abstractC54531xLwOLrzqt;
            BizInstrument bizInstrumentValueOf;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C52499wNr c52499wNr = (C52499wNr) this.copydefault.copydefault.get();
                if (c52499wNr == null || (yhoDbNXlk = c52499wNr.DbNXlk()) == null) {
                    return;
                }
                TacticsVoucherInfo tacticsVoucherInfoEZpvd = ((TacticsListLabelVoucherData) this.EZpvd).EZpvd();
                TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(this.AEQbTJ.getOrderType());
                InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
                yhoDbNXlk.invoke(tacticsVoucherInfoEZpvd, tacticsTypeAEQbTJ, java.lang.Boolean.valueOf((interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(this.AEQbTJ.getInstType())) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(this.AEQbTJ.getInstId())) == null) ? false : Intrinsics.EZpvd(bizInstrumentValueOf.isNegativeContract(), java.lang.Boolean.TRUE)));
            }
        }
    }

    /* JADX INFO: renamed from: o.wOi$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ TacticsData OLrzqt;
        public final /* synthetic */ C52517wOi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C52517wOi c52517wOi, TacticsData tacticsData) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c52517wOi;
            this.OLrzqt = tacticsData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function1<TacticsData, Unit> function1KWHzl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C52499wNr c52499wNr = (C52499wNr) this.copydefault.copydefault.get();
                if (c52499wNr == null || (function1KWHzl = c52499wNr.KWHzl()) == null) {
                    return;
                }
                function1KWHzl.invoke(this.OLrzqt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [344=6] */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r12v4, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r12v5, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r12v6, resolved type: boolean */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0503 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0612 A[PHI: r2 r3 r5
  0x0612: PHI (r2v7 int) = (r2v4 int), (r2v5 int), (r2v6 int), (r2v8 int) binds: [B:164:0x045a, B:243:0x05f5, B:232:0x05aa, B:228:0x0589] A[DONT_GENERATE, DONT_INLINE]
  0x0612: PHI (r3v14 com.okinc.unify_trade.bot.data.TacticsData) = 
  (r3v11 com.okinc.unify_trade.bot.data.TacticsData)
  (r3v12 com.okinc.unify_trade.bot.data.TacticsData)
  (r3v13 com.okinc.unify_trade.bot.data.TacticsData)
  (r3v15 com.okinc.unify_trade.bot.data.TacticsData)
 binds: [B:164:0x045a, B:243:0x05f5, B:232:0x05aa, B:228:0x0589] A[DONT_GENERATE, DONT_INLINE]
  0x0612: PHI (r5v7 int) = (r5v4 int), (r5v5 int), (r5v6 int), (r5v8 int) binds: [B:164:0x045a, B:243:0x05f5, B:232:0x05aa, B:228:0x0589] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x064f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull C52515wOg c52515wOg, @NotNull final TacticsData tacticsData) {
        java.lang.String tvTitle;
        BotCommon common;
        BotCommon common2;
        int i;
        final TacticsData tacticsData2;
        SlippageVo slippageVo;
        char c;
        java.lang.String orderType;
        int i2;
        final TacticsData tacticsData3;
        int i3;
        ConstraintLayout fieldNames;
        char c2;
        wSY wsy;
        boolean zEZpvd;
        BotVo bot;
        BotCommon common3;
        ContractGridVo contractGrid;
        xOR xorCopydefault;
        BotVo bot2;
        BotCommon common4;
        java.lang.Object obj;
        BotCommon common5;
        java.lang.String tvTitle2;
        BotCommon common6;
        BotCommon common7;
        yHO<java.lang.Integer, java.lang.String, java.lang.String, Unit> yhoValueOf;
        Intrinsics.checkNotNullParameter(c52515wOg, "");
        Intrinsics.checkNotNullParameter(tacticsData, "");
        C52499wNr c52499wNr = this.copydefault.get();
        if (c52499wNr != null && (yhoValueOf = c52499wNr.valueOf()) != null) {
            yhoValueOf.invoke(java.lang.Integer.valueOf(c52515wOg.getBindingAdapterPosition()), tacticsData.getAlgoId(), tacticsData.getOrderType());
            Unit unit = Unit.INSTANCE;
        }
        if (!AEQbTJ(tacticsData)) {
            c52515wOg.djBIcL().setVisibility(8);
            Unit unit2 = Unit.INSTANCE;
            return;
        }
        c52515wOg.djBIcL().setVisibility(0);
        wOC.KWHzl(c52515wOg, this.AhwBna, c52515wOg.getBindingAdapterPosition() == 0 ? this.EZpvd : null);
        BotVo bot3 = tacticsData.getBot();
        if (bot3 == null || (common5 = bot3.getCommon()) == null || !common5.isPinned() || tacticsData.getHistory()) {
            android.widget.TextView textViewEjfBZ = c52515wOg.ejfBZ();
            BotVo bot4 = tacticsData.getBot();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((bot4 == null || (common2 = bot4.getCommon()) == null) ? null : common2.getStgyName()))) {
                BotVo bot5 = tacticsData.getBot();
                tvTitle = (bot5 == null || (common = bot5.getCommon()) == null) ? null : common.getStgyName();
            } else {
                tvTitle = tacticsData.getTvTitle();
            }
            textViewEjfBZ.setText(tvTitle);
            android.widget.TextView textViewEjfBZ2 = c52515wOg.ejfBZ();
            textViewEjfBZ2.setOnClickListener(new Dialog(textViewEjfBZ2, 1000L, this, tacticsData));
        } else {
            android.widget.TextView textViewEjfBZ3 = c52515wOg.ejfBZ();
            BotVo bot6 = tacticsData.getBot();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((bot6 == null || (common7 = bot6.getCommon()) == null) ? null : common7.getStgyName()))) {
                BotVo bot7 = tacticsData.getBot();
                tvTitle2 = (bot7 == null || (common6 = bot7.getCommon()) == null) ? null : common6.getStgyName();
            } else {
                tvTitle2 = tacticsData.getTvTitle();
            }
            wPQ.setTextWithDrawable$default(textViewEjfBZ3, tvTitle2 == null ? "" : tvTitle2, C48033uCm.ActionBar.AuCTel, 17.0f, 0, 8, null);
            android.widget.TextView textViewEjfBZ4 = c52515wOg.ejfBZ();
            textViewEjfBZ4.setOnClickListener(new FragmentManager(textViewEjfBZ4, 1000L, c52515wOg, this, tacticsData));
        }
        copydefault(c52515wOg, tacticsData);
        c52515wOg.AEQbTJ().setVisibility(0);
        wMT wmt = wMT.OLrzqt;
        android.content.Context context = c52515wOg.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.view.ViewGroup viewGroupAEQbTJ = c52515wOg.AEQbTJ();
        java.util.ArrayList<TacticsInsideItemData> subData = tacticsData.getSubData();
        Function0<Unit> function0 = new Function0() { // from class: o.wOu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52517wOi.fIwbmz(this.KWHzl, tacticsData);
            }
        };
        C52499wNr c52499wNr2 = this.copydefault.get();
        Function1<Triple<java.lang.String, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function1AEQbTJ = c52499wNr2 != null ? c52499wNr2.AEQbTJ() : null;
        C52499wNr c52499wNr3 = this.copydefault.get();
        Function1<Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>, Unit> function1Values = c52499wNr3 != null ? c52499wNr3.values() : null;
        java.lang.String orderType2 = tacticsData.getOrderType();
        wmt.OLrzqt(context, viewGroupAEQbTJ, subData, tacticsData, function0, function1AEQbTJ, function1Values, (Intrinsics.EZpvd((java.lang.Object) orderType2, (java.lang.Object) "twap") || Intrinsics.EZpvd((java.lang.Object) orderType2, (java.lang.Object) "smart_iceberg")) ? false : true);
        c52515wOg.isConnected().setVisibility(wOC.OLrzqt(c52515wOg, this.AhwBna));
        wPY wpyAYXKKw = c52515wOg.AYXKKw();
        java.util.List<TacticsListButtonItem> operateList = tacticsData.getOperateList();
        if (operateList == null) {
            operateList = yDY.AhwBna();
        }
        wpyAYXKKw.setData(operateList, tacticsData, new yHO() { // from class: o.wOl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return C52517wOi.OLrzqt(this.copydefault, (java.lang.String) obj2, (TacticsData) obj3, (Function0) obj4);
            }
        }, new Function2() { // from class: o.wOn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return C52517wOi.copydefault(this.copydefault, (java.lang.String) obj2, (TacticsData) obj3);
            }
        });
        KWHzl(c52515wOg, tacticsData);
        c52515wOg.AkhnZx().setVisibility(8);
        if (tacticsData.getHistory() && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tacticsData.getStopOrangeHint()))) {
            OKReminder oKReminderAkhnZx = c52515wOg.AkhnZx();
            oKReminderAkhnZx.setTitle((java.lang.CharSequence) null);
            oKReminderAkhnZx.setMessage(tacticsData.getStopOrangeHint());
            oKReminderAkhnZx.setCloseIconVisibility(false);
            oKReminderAkhnZx.setStyle(2);
            Unit unit3 = Unit.INSTANCE;
            c52515wOg.AkhnZx().setVisibility(0);
        }
        c52515wOg.uzCIH().setVisibility(8);
        OKReminder newProxyInstance = c52515wOg.getNewProxyInstance();
        c52515wOg.getNewProxyInstance().setVisibility(8);
        newProxyInstance.setTitle((java.lang.CharSequence) null);
        newProxyInstance.setMessage((java.lang.String) null);
        newProxyInstance.setPrimaryAction(null, null);
        c52515wOg.EZpvd();
        SwapCoinMProfitSwitchUiModel swapCoinMProfitSwitchUiModel = tacticsData.getSwapCoinMProfitSwitchUiModel();
        if (swapCoinMProfitSwitchUiModel != null) {
            boolean z = swapCoinMProfitSwitchUiModel.isCoinM();
            c52515wOg.valueOf().setVisibility(z ? 0 : 8);
            if (z) {
                C55258xgZ c55258xgZDbNXlk = c52515wOg.DbNXlk();
                i = 8;
                tacticsData2 = tacticsData;
                slippageVo = null;
                c = 1;
                c55258xgZDbNXlk.setOnClickListener(new Fragment(c55258xgZDbNXlk, 1000L, c52515wOg, tacticsData));
                C55249xgQ c55249xgQGEmmrt = c52515wOg.gEmmrt();
                if (c55249xgQGEmmrt.getTabCount() != 2) {
                    c55249xgQGEmmrt.removeAllTabs();
                    TabLayout.Tab tag = c55249xgQGEmmrt.newTab().setTag("base_ccy");
                    CoinRemoteImage.StateListAnimator stateListAnimator = CoinRemoteImage.Companion;
                    Intrinsics.copydefault(tag);
                    CoinRemoteImage.StateListAnimator.loadRemoteCoinImage$default(stateListAnimator, tag, swapCoinMProfitSwitchUiModel.getCcy(), null, 2, null);
                    Intrinsics.checkNotNullExpressionValue(tag, "");
                    TabLayout.Tab tag2 = c55249xgQGEmmrt.newTab().setTag("usdt_ccy");
                    Intrinsics.copydefault(tag2);
                    stateListAnimator.KWHzl(tag2, "USDT", C33070mpX.KWHzl(C52761wXj.TaskDescription.zCTncp));
                    Intrinsics.checkNotNullExpressionValue(tag2, "");
                    c55249xgQGEmmrt.addTab(tag, CoinMarginedCcyDisplay.COIN.getIndex());
                    c55249xgQGEmmrt.addTab(tag2, CoinMarginedCcyDisplay.USDT.getIndex());
                    Unit unit4 = Unit.INSTANCE;
                } else {
                    TabLayout.Tab tabAt = c55249xgQGEmmrt.getTabAt(CoinMarginedCcyDisplay.COIN.getIndex());
                    if (tabAt != null) {
                        CoinRemoteImage.StateListAnimator.loadRemoteCoinImage$default(CoinRemoteImage.Companion, tabAt, swapCoinMProfitSwitchUiModel.getCcy(), null, 2, null);
                    }
                }
                TabLayout.Tab tabAt2 = c55249xgQGEmmrt.getTabAt(swapCoinMProfitSwitchUiModel.getSelectedIndex());
                if (tabAt2 != null) {
                    if ((c55249xgQGEmmrt.getSelectedTabPosition() >= 0 ? c55249xgQGEmmrt.getSelectedTabPosition() : -1) != swapCoinMProfitSwitchUiModel.getSelectedIndex()) {
                        c55249xgQGEmmrt.selectTab(tabAt2);
                    }
                }
                TaskDescription taskDescription = new TaskDescription(tacticsData2);
                c52515wOg.KWHzl(taskDescription);
                c55249xgQGEmmrt.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) taskDescription);
                obj = c55249xgQGEmmrt;
            } else {
                i = 8;
                tacticsData2 = tacticsData;
                slippageVo = null;
                c = 1;
                c52515wOg.wlaJM();
                obj = Unit.INSTANCE;
            }
            if (obj == null) {
            }
            orderType = tacticsData.getOrderType();
            switch (orderType.hashCode()) {
                case -1831183611:
                    i2 = i;
                    tacticsData3 = tacticsData2;
                    i3 = 0;
                    if (!orderType.equals("spot_dca")) {
                        c52515wOg.getNewProxyInstance().setVisibility(i2);
                        fieldNames = c52515wOg.getFieldNames();
                        if (fieldNames != null) {
                            fieldNames.setVisibility(i2);
                            Unit unit5 = Unit.INSTANCE;
                        }
                    } else {
                        wSY.OLrzqt.KWHzl(tacticsData3, c52515wOg.getNewProxyInstance(), new Function0() { // from class: o.wOx
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C52517wOi.ejfBZ(this.EZpvd, tacticsData3);
                            }
                        });
                        ConstraintLayout fieldNames2 = c52515wOg.getFieldNames();
                        if (fieldNames2 != null) {
                            fieldNames2.setVisibility(i2);
                            Unit unit6 = Unit.INSTANCE;
                        }
                    }
                    break;
                case -1402017003:
                    i2 = i;
                    tacticsData3 = tacticsData2;
                    i3 = 0;
                    if (orderType.equals("contract_dca")) {
                        OKReminder newProxyInstance2 = c52515wOg.getNewProxyInstance();
                        newProxyInstance2.setVisibility(Intrinsics.EZpvd((java.lang.Object) tacticsData.isPostWarning(), (java.lang.Object) "true") ? 0 : i2);
                        newProxyInstance2.setMessage(C33070mpX.AYXKKw(C55688xof.Application.bindToGooglePlayService));
                        newProxyInstance2.setCloseIconVisibility(false);
                        newProxyInstance2.setStyle(0);
                        Unit unit7 = Unit.INSTANCE;
                        ConstraintLayout fieldNames3 = c52515wOg.getFieldNames();
                        if (fieldNames3 != null) {
                            fieldNames3.setVisibility(i2);
                        }
                        wSY.OLrzqt.KWHzl(tacticsData3, c52515wOg.uzCIH(), new Function0() { // from class: o.wOs
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C52517wOi.fJNWhG(this.OLrzqt, tacticsData3);
                            }
                        });
                        break;
                    }
                    break;
                case -557961837:
                    i2 = i;
                    tacticsData3 = tacticsData2;
                    i3 = 0;
                    if (orderType.equals("smart_arbitrage")) {
                        wSY.OLrzqt.AEQbTJ(tacticsData3, c52515wOg.getNewProxyInstance(), c52515wOg.getFieldNames(), new Function0() { // from class: o.wOv
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C52517wOi.AuCTel(this.KWHzl, tacticsData3);
                            }
                        });
                        break;
                    }
                    break;
                case -512749997:
                    if (orderType.equals("contract_grid")) {
                        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                        char c3 = (interfaceC54581xNrOLrzqt == null || (xorCopydefault = interfaceC54581xNrOLrzqt.copydefault()) == null || xorCopydefault.AYXKKw()) ? (char) 0 : c;
                        BotVo bot8 = tacticsData.getBot();
                        SlippageVo slippage = (bot8 == null || (contractGrid = bot8.getContractGrid()) == null) ? slippageVo : contractGrid.getSlippage();
                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                        pairArr[0] = C56390yDp.OLrzqt(slippage != null ? slippage.getOpenPosSlippage() : slippageVo, "starting");
                        pairArr[c] = C56390yDp.OLrzqt(slippage != null ? slippage.getClosePosSlippage() : slippageVo, "stopping");
                        java.util.List listGEmmrt = yDY.gEmmrt(pairArr);
                        if ((listGEmmrt instanceof java.util.Collection) && listGEmmrt.isEmpty()) {
                            c2 = 0;
                            wsy = wSY.OLrzqt;
                            java.lang.String orderType3 = tacticsData.getOrderType();
                            boolean outOfRange = tacticsData.getOutOfRange();
                            if (c3 == 0) {
                            }
                        } else {
                            java.util.Iterator it = listGEmmrt.iterator();
                            while (it.hasNext()) {
                                java.lang.String str = (java.lang.String) ((kotlin.Pair) it.next()).component1();
                                if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getState(), r1.component2()) && str != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) && C33129mqd.AEQbTJ(str, "0")) {
                                    c2 = c;
                                    wsy = wSY.OLrzqt;
                                    java.lang.String orderType32 = tacticsData.getOrderType();
                                    boolean outOfRange2 = tacticsData.getOutOfRange();
                                    boolean z2 = (c3 == 0 || c2 == 0) ? 0 : c;
                                    BotVo bot9 = tacticsData.getBot();
                                    i2 = i;
                                    i3 = 0;
                                    tacticsData3 = tacticsData2;
                                    zEZpvd = wsy.EZpvd(orderType32, outOfRange2, z2, bot9 == null ? bot9.getContractGrid() : slippageVo, tacticsData, tacticsData.getSourceCcy(), tacticsData.getState(), c52515wOg.getNewProxyInstance(), tacticsData.getForbidden(), new Function0() { // from class: o.wOt
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return C52517wOi.values(this.OLrzqt, tacticsData2);
                                        }
                                    });
                                    c52515wOg.getFieldNames().setVisibility(i2);
                                    if (!zEZpvd) {
                                        wsy.EZpvd(tacticsData3, c52515wOg.getNewProxyInstance(), new Function0() { // from class: o.wOq
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return C52517wOi.DbNXlk(this.AEQbTJ, tacticsData3);
                                            }
                                        });
                                    }
                                    if (!wsy.copydefault(tacticsData3, c52515wOg.uzCIH(), new Function0() { // from class: o.wOr
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return C52517wOi.AkhnZx(this.copydefault, tacticsData3);
                                        }
                                    }) && (bot = tacticsData.getBot()) != null && (common3 = bot.getCommon()) != null && Intrinsics.EZpvd(common3.getSyncParamFailed(), java.lang.Boolean.TRUE)) {
                                        copydefault(tacticsData3, c52515wOg.uzCIH());
                                    }
                                    Unit unit8 = Unit.INSTANCE;
                                    break;
                                }
                            }
                            c2 = 0;
                            wsy = wSY.OLrzqt;
                            java.lang.String orderType322 = tacticsData.getOrderType();
                            boolean outOfRange22 = tacticsData.getOutOfRange();
                            if (c3 == 0) {
                                BotVo bot92 = tacticsData.getBot();
                                i2 = i;
                                i3 = 0;
                                tacticsData3 = tacticsData2;
                                zEZpvd = wsy.EZpvd(orderType322, outOfRange22, z2, bot92 == null ? bot92.getContractGrid() : slippageVo, tacticsData, tacticsData.getSourceCcy(), tacticsData.getState(), c52515wOg.getNewProxyInstance(), tacticsData.getForbidden(), new Function0() { // from class: o.wOt
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return C52517wOi.values(this.OLrzqt, tacticsData2);
                                    }
                                });
                                c52515wOg.getFieldNames().setVisibility(i2);
                                if (!zEZpvd) {
                                }
                                if (!wsy.copydefault(tacticsData3, c52515wOg.uzCIH(), new Function0() { // from class: o.wOr
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return C52517wOi.AkhnZx(this.copydefault, tacticsData3);
                                    }
                                })) {
                                    copydefault(tacticsData3, c52515wOg.uzCIH());
                                }
                                Unit unit82 = Unit.INSTANCE;
                                break;
                            }
                        }
                    }
                    i2 = i;
                    tacticsData3 = tacticsData2;
                    i3 = 0;
                    c52515wOg.getNewProxyInstance().setVisibility(i2);
                    fieldNames = c52515wOg.getFieldNames();
                    if (fieldNames != null) {
                    }
                    break;
                case 3181382:
                    if (orderType.equals("grid")) {
                        wSY wsy2 = wSY.OLrzqt;
                        java.lang.String state = tacticsData.getState();
                        BotVo bot10 = tacticsData.getBot();
                        if (!wsy2.copydefault(state, bot10 != null ? bot10.getCompliancePauseDisplayType() : slippageVo, c52515wOg.getNewProxyInstance(), new Function1() { // from class: o.wOk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return C52517wOi.EZpvd(this.AEQbTJ, tacticsData2, ((java.lang.Boolean) obj2).booleanValue());
                            }
                        })) {
                            wsy2.EZpvd((284 & 1) != 0 ? "" : tacticsData.getOrderType(), (284 & 2) != 0 ? false : tacticsData.getOutOfRange(), (284 & 4) != 0 ? false : false, (284 & 8) != 0 ? null : null, (284 & 16) != 0 ? null : null, (284 & 32) != 0 ? "" : tacticsData.getSourceCcy(), (284 & 64) != 0 ? "" : tacticsData.getState(), c52515wOg.getNewProxyInstance(), (284 & 256) != 0 ? new java.util.ArrayList() : null, new Function0() { // from class: o.wOm
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return C52517wOi.isConnected(this.copydefault, tacticsData2);
                                }
                            });
                            ConstraintLayout fieldNames4 = c52515wOg.getFieldNames();
                            if (fieldNames4 != null) {
                                fieldNames4.setVisibility(i);
                                Unit unit9 = Unit.INSTANCE;
                            }
                            if (!wsy2.KWHzl(tacticsData.getPerMinProfitRate(), c52515wOg.uzCIH(), new Function0() { // from class: o.wOo
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return C52517wOi.fetchVPNInfo(this.copydefault, tacticsData2);
                                }
                            }) && (bot2 = tacticsData.getBot()) != null && (common4 = bot2.getCommon()) != null && Intrinsics.EZpvd(common4.getSyncParamFailed(), java.lang.Boolean.TRUE)) {
                                copydefault(tacticsData2, c52515wOg.uzCIH());
                            }
                        }
                        Unit unit10 = Unit.INSTANCE;
                        i2 = i;
                        tacticsData3 = tacticsData2;
                        i3 = 0;
                    }
                    i2 = i;
                    tacticsData3 = tacticsData2;
                    i3 = 0;
                    c52515wOg.getNewProxyInstance().setVisibility(i2);
                    fieldNames = c52515wOg.getFieldNames();
                    if (fieldNames != null) {
                    }
                    break;
                case 1485620813:
                    if (orderType.equals("dcd_bot")) {
                        OKReminder newProxyInstance3 = c52515wOg.getNewProxyInstance();
                        newProxyInstance3.setVisibility(((Intrinsics.EZpvd((java.lang.Object) tacticsData.getDcdState(), (java.lang.Object) "dip_snipping") || Intrinsics.EZpvd((java.lang.Object) tacticsData.getDcdState(), (java.lang.Object) "profit_snipping") || Intrinsics.EZpvd((java.lang.Object) tacticsData.getDcdState(), (java.lang.Object) "pending_matching")) && !tacticsData.getReinvestment()) ? 0 : i);
                        newProxyInstance3.setMessage(C33069mpW.copydefault(C55688xof.Application.awiJhF, C56423yEv.EZpvd(C56390yDp.OLrzqt("dateTime", StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tacticsData.getLastTradeExpireTime()) ? "--" : pTA.format$default(new Date(C33129mqd.valueOf(tacticsData.getLastTradeExpireTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null)))));
                        newProxyInstance3.setPrimaryAction(C33070mpX.AYXKKw(C55688xof.Application.zSsVtY), new Function0() { // from class: o.wOA
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C52517wOi.fARcdN(this.KWHzl, tacticsData2);
                            }
                        });
                        newProxyInstance3.setCloseIconVisibility(false);
                        newProxyInstance3.setStyle(0);
                        Unit unit11 = Unit.INSTANCE;
                        ConstraintLayout fieldNames5 = c52515wOg.getFieldNames();
                        if (fieldNames5 != null) {
                            fieldNames5.setVisibility(i);
                        }
                        i2 = i;
                        tacticsData3 = tacticsData2;
                        i3 = 0;
                    }
                    i2 = i;
                    tacticsData3 = tacticsData2;
                    i3 = 0;
                    c52515wOg.getNewProxyInstance().setVisibility(i2);
                    fieldNames = c52515wOg.getFieldNames();
                    if (fieldNames != null) {
                    }
                    break;
                default:
                    i2 = i;
                    tacticsData3 = tacticsData2;
                    i3 = 0;
                    c52515wOg.getNewProxyInstance().setVisibility(i2);
                    fieldNames = c52515wOg.getFieldNames();
                    if (fieldNames != null) {
                    }
                    break;
            }
            int adapterPosition = c52515wOg.getAdapterPosition();
            if (!yDY.gEmmrt("iceberg", "smart_iceberg", "twap", "arbitrage").contains(tacticsData.getOrderType())) {
                c52515wOg.copydefault().setVisibility(i2);
                c52515wOg.KWHzl().setVisibility(i2);
                return;
            }
            c52515wOg.copydefault().setVisibility(i3);
            c52515wOg.KWHzl().setVisibility(i2);
            c52515wOg.OLrzqt().setVisibility(i2);
            c52515wOg.iwGUEr().setVisibility(i3);
            EZpvd(c52515wOg, tacticsData3, adapterPosition, c52515wOg);
            return;
        }
        i = 8;
        tacticsData2 = tacticsData;
        slippageVo = null;
        c = 1;
        c52515wOg.valueOf().setVisibility(i);
        c52515wOg.wlaJM();
        Unit unit12 = Unit.INSTANCE;
        orderType = tacticsData.getOrderType();
        switch (orderType.hashCode()) {
            case -1831183611:
                break;
            case -1402017003:
                break;
            case -557961837:
                break;
            case -512749997:
                break;
            case 3181382:
                break;
            case 1485620813:
                break;
        }
        int adapterPosition2 = c52515wOg.getAdapterPosition();
        if (!yDY.gEmmrt("iceberg", "smart_iceberg", "twap", "arbitrage").contains(tacticsData.getOrderType())) {
        }
    }

    /* JADX INFO: renamed from: o.wOi$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ TacticsData KWHzl;
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(TacticsData tacticsData, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = tacticsData;
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function2<java.lang.String, java.lang.Boolean, Unit> function2AYXKKw;
            C52499wNr c52499wNr = (C52499wNr) C52517wOi.this.copydefault.get();
            if (c52499wNr != null && (function2AYXKKw = c52499wNr.AYXKKw()) != null) {
                function2AYXKKw.invoke(this.KWHzl.getAlgoId(), java.lang.Boolean.FALSE);
            }
            this.OLrzqt.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.wOi$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    public static final Unit fIwbmz(C52517wOi c52517wOi, TacticsData tacticsData) {
        Function1<TacticsData, Unit> function1Copydefault;
        C52499wNr c52499wNr = c52517wOi.copydefault.get();
        if (c52499wNr != null && (function1Copydefault = c52499wNr.copydefault()) != null) {
            function1Copydefault.invoke(tacticsData);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52517wOi c52517wOi, java.lang.String str, TacticsData tacticsData, Function0 function0) {
        Function2<kotlin.Pair<java.lang.String, TacticsData>, Function0<Unit>, Unit> function2OLrzqt;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        C52499wNr c52499wNr = c52517wOi.copydefault.get();
        if (c52499wNr != null && (function2OLrzqt = c52499wNr.OLrzqt()) != null) {
            function2OLrzqt.invoke(new kotlin.Pair<>(str, tacticsData), function0);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C52517wOi c52517wOi, java.lang.String str, TacticsData tacticsData) {
        Function1<kotlin.Pair<java.lang.String, TacticsData>, Unit> function1EZpvd;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        C52499wNr c52499wNr = c52517wOi.copydefault.get();
        if (c52499wNr != null && (function1EZpvd = c52499wNr.EZpvd()) != null) {
            function1EZpvd.invoke(new kotlin.Pair<>(str, tacticsData));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wOi$TaskDescription */
    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ TacticsData copydefault;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public TaskDescription(TacticsData tacticsData) {
            this.copydefault = tacticsData;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Function2<TacticsData, java.lang.Integer, Unit> function2GEmmrt;
            if (tab != null) {
                int position = tab.getPosition();
                C52517wOi c52517wOi = C52517wOi.this;
                TacticsData tacticsData = this.copydefault;
                C52499wNr c52499wNr = (C52499wNr) c52517wOi.copydefault.get();
                if (c52499wNr == null || (function2GEmmrt = c52499wNr.gEmmrt()) == null) {
                    return;
                }
                function2GEmmrt.invoke(tacticsData, java.lang.Integer.valueOf(position));
            }
        }
    }

    public static final Unit EZpvd(C52517wOi c52517wOi, TacticsData tacticsData, boolean z) {
        yHO<TacticsData, java.lang.Boolean, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>, Unit> yhoAhwBna;
        C52499wNr c52499wNr = c52517wOi.copydefault.get();
        if (c52499wNr != null && (yhoAhwBna = c52499wNr.AhwBna()) != null) {
            yhoAhwBna.invoke(tacticsData, java.lang.Boolean.FALSE, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(C52517wOi c52517wOi, TacticsData tacticsData) {
        yHO<TacticsData, java.lang.Boolean, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>, Unit> yhoAhwBna;
        C52499wNr c52499wNr = c52517wOi.copydefault.get();
        if (c52499wNr != null && (yhoAhwBna = c52499wNr.AhwBna()) != null) {
            yhoAhwBna.invoke(tacticsData, java.lang.Boolean.FALSE, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C52517wOi c52517wOi, TacticsData tacticsData) {
        Function1<TacticsData, Unit> function1IsConnected;
        C52499wNr c52499wNr = c52517wOi.copydefault.get();
        if (c52499wNr != null && (function1IsConnected = c52499wNr.isConnected()) != null) {
            function1IsConnected.invoke(tacticsData);
        }
        return Unit.INSTANCE;
    }

    public static final Unit values(C52517wOi c52517wOi, TacticsData tacticsData) {
        yHO<TacticsData, java.lang.Boolean, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>, Unit> yhoAhwBna;
        C52499wNr c52499wNr = c52517wOi.copydefault.get();
        if (c52499wNr != null && (yhoAhwBna = c52499wNr.AhwBna()) != null) {
            yhoAhwBna.invoke(tacticsData, java.lang.Boolean.FALSE, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(C52517wOi c52517wOi, TacticsData tacticsData) {
        yHO<TacticsData, java.lang.Boolean, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>, Unit> yhoAhwBna;
        C52499wNr c52499wNr = c52517wOi.copydefault.get();
        if (c52499wNr != null && (yhoAhwBna = c52499wNr.AhwBna()) != null) {
            yhoAhwBna.invoke(tacticsData, java.lang.Boolean.FALSE, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(C52517wOi c52517wOi, TacticsData tacticsData) {
        Function2<kotlin.Pair<java.lang.String, TacticsData>, Function0<Unit>, Unit> function2OLrzqt;
        C52499wNr c52499wNr = c52517wOi.copydefault.get();
        if (c52499wNr != null && (function2OLrzqt = c52499wNr.OLrzqt()) != null) {
            function2OLrzqt.invoke(C56390yDp.OLrzqt("strategy_button_adjust_margin", tacticsData), null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(C52517wOi c52517wOi, TacticsData tacticsData) {
        Function1<TacticsData, Unit> function1Copydefault;
        C52499wNr c52499wNr = c52517wOi.copydefault.get();
        if (c52499wNr != null && (function1Copydefault = c52499wNr.copydefault()) != null) {
            function1Copydefault.invoke(tacticsData);
        }
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(C52517wOi c52517wOi, TacticsData tacticsData) {
        Function1<TacticsData, Unit> function1Copydefault;
        C52499wNr c52499wNr = c52517wOi.copydefault.get();
        if (c52499wNr != null && (function1Copydefault = c52499wNr.copydefault()) != null) {
            function1Copydefault.invoke(tacticsData);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(C52517wOi c52517wOi, TacticsData tacticsData) {
        yHO<TacticsData, java.lang.Boolean, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>, Unit> yhoAhwBna;
        C52499wNr c52499wNr = c52517wOi.copydefault.get();
        if (c52499wNr != null && (yhoAhwBna = c52499wNr.AhwBna()) != null) {
            yhoAhwBna.invoke(tacticsData, java.lang.Boolean.FALSE, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(C52517wOi c52517wOi, TacticsData tacticsData) {
        yHO<TacticsData, java.lang.Boolean, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>, Unit> yhoAhwBna;
        C52499wNr c52499wNr = c52517wOi.copydefault.get();
        if (c52499wNr != null && (yhoAhwBna = c52499wNr.AhwBna()) != null) {
            yhoAhwBna.invoke(tacticsData, java.lang.Boolean.FALSE, null);
        }
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(TacticsData tacticsData) {
        return C33129mqd.OLrzqt((java.lang.CharSequence) tacticsData.getOrderType()) && C33129mqd.OLrzqt((java.lang.CharSequence) tacticsData.getState());
    }

    public final void copydefault(final TacticsData tacticsData, final OKReminder oKReminder) {
        yHO<TacticsData, java.lang.Boolean, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>, Unit> yhoAhwBna;
        BotCommon common;
        BotCommon common2;
        BotVo bot = tacticsData.getBot();
        java.lang.String syncParamLeader = null;
        java.lang.String syncParamLeader2 = (bot == null || (common2 = bot.getCommon()) == null) ? null : common2.getSyncParamLeader();
        if (syncParamLeader2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) syncParamLeader2)) {
            C52499wNr c52499wNr = this.copydefault.get();
            if (c52499wNr == null || (yhoAhwBna = c52499wNr.AhwBna()) == null) {
                return;
            }
            yhoAhwBna.invoke(tacticsData, java.lang.Boolean.TRUE, new Function2() { // from class: o.wOp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C52517wOi.copydefault(tacticsData, oKReminder, this, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                }
            });
            return;
        }
        wSY wsy = wSY.OLrzqt;
        BotVo bot2 = tacticsData.getBot();
        if (bot2 != null && (common = bot2.getCommon()) != null) {
            syncParamLeader = common.getSyncParamLeader();
        }
        wsy.AEQbTJ(tacticsData, true, syncParamLeader, oKReminder, new Function1() { // from class: o.wOy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52517wOi.copydefault(this.EZpvd, tacticsData, (java.lang.Boolean) obj);
            }
        });
    }

    public static final Unit copydefault(final TacticsData tacticsData, OKReminder oKReminder, final C52517wOi c52517wOi, boolean z, java.lang.String str) {
        BotCommon common;
        Intrinsics.checkNotNullParameter(str, "");
        BotVo bot = tacticsData.getBot();
        if (bot != null && (common = bot.getCommon()) != null) {
            common.setSyncParamLeader(str);
        }
        wSY.OLrzqt.AEQbTJ(tacticsData, true, str, oKReminder, new Function1() { // from class: o.wOf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52517wOi.AEQbTJ(this.OLrzqt, tacticsData, (java.lang.Boolean) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C52517wOi c52517wOi, TacticsData tacticsData, java.lang.Boolean bool) {
        yHO<TacticsData, java.lang.Boolean, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>, Unit> yhoAhwBna;
        C52499wNr c52499wNr = c52517wOi.copydefault.get();
        if (c52499wNr != null && (yhoAhwBna = c52499wNr.AhwBna()) != null) {
            yhoAhwBna.invoke(tacticsData, java.lang.Boolean.FALSE, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C52517wOi c52517wOi, TacticsData tacticsData, java.lang.Boolean bool) {
        yHO<TacticsData, java.lang.Boolean, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit>, Unit> yhoAhwBna;
        C52499wNr c52499wNr = c52517wOi.copydefault.get();
        if (c52499wNr != null && (yhoAhwBna = c52499wNr.AhwBna()) != null) {
            yhoAhwBna.invoke(tacticsData, java.lang.Boolean.FALSE, null);
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(C52515wOg c52515wOg, TacticsData tacticsData, int i, C52515wOg c52515wOg2) {
        java.lang.String pnlRatio;
        ProfitMarginPerCcyVo profitMarginPerCcyVo;
        java.lang.Object objM7377constructorimpl;
        MpStgyCopyProfitChangeData profitData;
        SwapCoinMProfitSwitchUiModel swapCoinMProfitSwitchUiModel;
        SwapCoinMProfitSwitchUiModel swapCoinMProfitSwitchUiModel2 = tacticsData.getSwapCoinMProfitSwitchUiModel();
        boolean z = swapCoinMProfitSwitchUiModel2 != null && swapCoinMProfitSwitchUiModel2.isCoinM() && (swapCoinMProfitSwitchUiModel = tacticsData.getSwapCoinMProfitSwitchUiModel()) != null && swapCoinMProfitSwitchUiModel.isUsdtSelected();
        if ((tacticsData.getProfitData() == null || (profitData = tacticsData.getProfitData()) == null || profitData.getUseUsdtMargin() != z) && tacticsData.getProfitSnapshots() != null) {
            java.util.List<StrategyProfitResponse> profitSnapshots = tacticsData.getProfitSnapshots();
            if (profitSnapshots == null) {
                StrategyProfitResponse[] strategyProfitResponseArr = new StrategyProfitResponse[1];
                StrategyProfitResponse latestProfitData = tacticsData.getLatestProfitData();
                if (latestProfitData == null) {
                    latestProfitData = new StrategyProfitResponse((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 1023, (DefaultConstructorMarker) null);
                }
                strategyProfitResponseArr[0] = latestProfitData;
                profitSnapshots = yDY.AhwBna(strategyProfitResponseArr);
            }
            StrategyProfitResponse strategyProfitResponse = (StrategyProfitResponse) CollectionsKt___CollectionsKt.firstOrNull(profitSnapshots);
            if (strategyProfitResponse == null) {
                strategyProfitResponse = new StrategyProfitResponse((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 1023, (DefaultConstructorMarker) null);
            }
            if (!z || (profitMarginPerCcyVo = strategyProfitResponse.getMarginPerCcy().get("USDT")) == null || (pnlRatio = profitMarginPerCcyVo.getPnlRatio()) == null) {
                pnlRatio = strategyProfitResponse.getPnlRatio();
            }
            tacticsData.setProfitData(new MpStgyCopyProfitChangeData(new kotlin.Pair(C56033xvF.fmtBotPnlPercent$default(pnlRatio, true, 0, 4, null), java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) pnlRatio))), (java.lang.String) null, CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) profitSnapshots), tacticsData.getAlgoId(), false, z, 18, (DefaultConstructorMarker) null));
        }
        if (this.AhwBna || C55875xsG.copydefault.KWHzl() != CardStyle.DETAILED) {
            wOC.AEQbTJ(c52515wOg2);
            return;
        }
        java.lang.String algoId = tacticsData.getAlgoId();
        MpStgyCopyProfitChangeData profitData2 = tacticsData.getProfitData();
        if (Intrinsics.EZpvd((java.lang.Object) algoId, (java.lang.Object) (profitData2 != null ? profitData2.getAlgoId() : null))) {
            MpStgyCopyProfitChangeData profitData3 = tacticsData.getProfitData();
            if (C33129mqd.KWHzl((java.util.Collection) (profitData3 != null ? profitData3.getProfitList() : null))) {
                c52515wOg.copydefault().setVisibility(0);
                c52515wOg.iwGUEr().setVisibility(0);
                AEQbTJ(c52515wOg2);
                MpStgyCopyProfitChangeData profitData4 = tacticsData.getProfitData();
                if (profitData4 != null) {
                    copydefault(c52515wOg, profitData4, tacticsData);
                    c52515wOg2.AhwBna().invalidate();
                }
                java.util.List<T> dataSets = c52515wOg2.AhwBna().getLineData().getDataSets();
                if ((dataSets != 0 ? (ILineDataSet) CollectionsKt___CollectionsKt.firstOrNull(dataSets) : null) == null || c52515wOg2.AhwBna().getHighlighted() == null) {
                    return;
                }
                Highlight[] highlighted = c52515wOg2.AhwBna().getHighlighted();
                Intrinsics.checkNotNullExpressionValue(highlighted, "");
                if (!(highlighted.length == 0)) {
                    try {
                        Result.Application application = Result.Companion;
                        c52515wOg2.AhwBna().highlightValue(c52515wOg2.AhwBna().getHighlighted()[0]);
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    } catch (java.lang.Throwable th) {
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                        pUU.copydefault("TacticsListItemBinder", "marker refresh error");
                        return;
                    }
                    return;
                }
                return;
            }
        }
        c52515wOg.copydefault().setVisibility(0);
        c52515wOg.iwGUEr().setVisibility(0);
        KWHzl(c52515wOg2);
    }

    public final void AEQbTJ() {
        this.OLrzqt.clear();
        this.copydefault.clear();
    }

    public final void KWHzl(C52515wOg c52515wOg, TacticsData tacticsData) {
        C52517wOi c52517wOi;
        boolean z;
        android.view.ViewGroup viewGroupAuCTel;
        BotCommon common;
        C55251xgS c55251xgS;
        TacticsListLabelUiData tacticsListLabelUiData;
        c52515wOg.fIwbmz().copydefault(tacticsData);
        if (c52515wOg.fIwbmz().OLrzqt(tacticsData)) {
            C55372xih c55372xihFJNWhG = c52515wOg.fJNWhG();
            c55372xihFJNWhG.setOnClickListener(new PendingIntent(c55372xihFJNWhG, 1000L, c52515wOg, tacticsData));
        } else {
            c52515wOg.fJNWhG().setOnClickListener(null);
        }
        java.util.ArrayList<TacticsListLabelUiData> labelList = tacticsData.getLabelList();
        if (labelList != null && !labelList.isEmpty()) {
            c52515wOg.fARcdN().removeAllViews();
            c52515wOg.AuCTel().removeAllViews();
            java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList();
            java.util.ArrayList<TacticsListLabelUiData> labelList2 = tacticsData.getLabelList();
            float fCopydefault = 0.0f;
            if (labelList2 != null) {
                for (TacticsListLabelUiData tacticsListLabelUiData2 : labelList2) {
                    tacticsListLabelUiData2.EZpvd(-5);
                    C52534wOz c52534wOz = C52534wOz.KWHzl;
                    android.content.Context context = c52515wOg.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    C55251xgS c55251xgSCopydefault = c52534wOz.copydefault(context, tacticsListLabelUiData2);
                    if (tacticsListLabelUiData2 instanceof TacticsListLabelVoucherData) {
                        c55251xgS = c55251xgSCopydefault;
                        tacticsListLabelUiData = tacticsListLabelUiData2;
                        c55251xgS.setOnClickListener(new TaskStackBuilder(c55251xgSCopydefault, 1000L, this, tacticsListLabelUiData2, tacticsData));
                    } else {
                        c55251xgS = c55251xgSCopydefault;
                        tacticsListLabelUiData = tacticsListLabelUiData2;
                    }
                    if (tacticsListLabelUiData instanceof TacticsListLabelLeverPrincipalData) {
                        c55251xgS.setOnClickListener(new SharedElementCallback(c55251xgS, 1000L, this, tacticsListLabelUiData));
                    }
                    if (tacticsListLabelUiData instanceof TacticsListLabelVipProfitData) {
                        c55251xgS.setOnClickListener(new PictureInPictureParams(c55251xgS, 1000L, this, tacticsListLabelUiData));
                    }
                    arrayList.add(c55251xgS);
                    java.lang.String string = c55251xgS.getText().toString();
                    Intrinsics.checkNotNullExpressionValue(c52515wOg.itemView.getContext(), "");
                    float fOLrzqt = wOC.OLrzqt(c55251xgS, string, C55298xhM.copydefault(4.0f, r7) * 2.0f);
                    Intrinsics.checkNotNullExpressionValue(c52515wOg.itemView.getContext(), "");
                    fCopydefault += fOLrzqt + C55298xhM.copydefault(4.0f, r4);
                }
            }
            android.content.Context context2 = c52515wOg.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            BotVo bot = tacticsData.getBot();
            if (bot == null || (common = bot.getCommon()) == null || !common.isPinned()) {
                c52517wOi = this;
                z = false;
            } else {
                c52517wOi = this;
                z = true;
            }
            if (c52517wOi.KWHzl(c52515wOg, context2, fCopydefault, z)) {
                c52515wOg.fARcdN().setVisibility(0);
                c52515wOg.AuCTel().setVisibility(8);
                viewGroupAuCTel = c52515wOg.fARcdN();
            } else {
                c52515wOg.fARcdN().setVisibility(8);
                c52515wOg.AuCTel().setVisibility(0);
                viewGroupAuCTel = c52515wOg.AuCTel();
            }
            for (android.view.View view : arrayList) {
                if (viewGroupAuCTel instanceof LinearLayoutCompat) {
                    LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, C55298xhM.dp2px$default(16.0f, null, 1, null));
                    ((LinearLayout.LayoutParams) layoutParams).topMargin = C55298xhM.dp2px$default(0.5f, null, 1, null);
                    layoutParams.setMarginStart(C55298xhM.dp2px$default(4.0f, null, 1, null));
                    view.setLayoutParams(layoutParams);
                    viewGroupAuCTel.addView(view);
                } else {
                    viewGroupAuCTel.addView(view);
                }
            }
            return;
        }
        c52515wOg.fARcdN().setVisibility(8);
        c52515wOg.AuCTel().setVisibility(8);
    }

    /* JADX INFO: renamed from: o.wOi$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    public final boolean KWHzl(C52515wOg c52515wOg, android.content.Context context, float f, boolean z) {
        return ((float) (((C33570myu.AEQbTJ() - (C56071xvr.gEmmrt.DbNXlk() * 2)) - C55298xhM.copydefault(48.0f, context)) - C55298xhM.copydefault(8.0f, context))) - (wOC.OLrzqt(c52515wOg.ejfBZ(), c52515wOg.ejfBZ().getText().toString(), 0.0f) + (z ? C55298xhM.dp2pxFloat$default(24.0f, null, 1, null) : 0.0f)) > f;
    }

    public final void copydefault(C52515wOg c52515wOg, TacticsData tacticsData) {
        c52515wOg.fetchVPNInfo().AEQbTJ(tacticsData);
        C51601vqB c51601vqBFetchVPNInfo = c52515wOg.fetchVPNInfo();
        c51601vqBFetchVPNInfo.setOnClickListener(new VoiceInteractor(c51601vqBFetchVPNInfo, 1000L, this, tacticsData));
    }

    public final void KWHzl(@NotNull C52515wOg c52515wOg) {
        Intrinsics.checkNotNullParameter(c52515wOg, "");
        c52515wOg.iwGUEr().setLoadingDelayedTime(0L);
        StatefulView.Status statusOLrzqt = c52515wOg.iwGUEr().OLrzqt();
        StatefulView.Status status = StatefulView.Status.Loading;
        if (statusOLrzqt != status) {
            c52515wOg.iwGUEr().setStatus(status, true);
        }
    }

    public final void AEQbTJ(@NotNull C52515wOg c52515wOg) {
        Intrinsics.checkNotNullParameter(c52515wOg, "");
        StatefulView.Status statusOLrzqt = c52515wOg.iwGUEr().OLrzqt();
        StatefulView.Status status = StatefulView.Status.Content;
        if (statusOLrzqt != status) {
            c52515wOg.iwGUEr().setStatus(status);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wOi */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showInvalid$default(C52517wOi c52517wOi, C52515wOg c52515wOg, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        c52517wOi.OLrzqt(c52515wOg, str, (Function0<Unit>) function0);
    }

    public final void OLrzqt(C52515wOg c52515wOg, java.lang.String str, final Function0<Unit> function0) {
        C55237xgE c55237xgEIwGUEr = c52515wOg.iwGUEr();
        if (str != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            C49953uyK.KWHzl(c55237xgEIwGUEr, (21 & 1) != 0 ? false : false, (21 & 2) != 0 ? c55237xgEIwGUEr.getContext().getString(C55688xof.Application.putInt) : "", (21 & 4) != 0 ? false : false, (21 & 8) != 0 ? 0 : 40, (21 & 16) != 0 ? false : true, new Function0() { // from class: o.wOw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C52517wOi.KWHzl(function0);
                }
            });
        } else {
            C49953uyK.showNormalEmpty$default(c55237xgEIwGUEr, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), false, null, false, 20, true, 12, null);
        }
    }

    public static final Unit KWHzl(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(C52515wOg c52515wOg, MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, TacticsData tacticsData) {
        java.lang.String totalPnl;
        ContractGridVo contractGrid;
        UnitDisplayVo unitDisplayVO;
        java.util.Map<java.lang.String, MarginPerCcyVo> marginPerCcy;
        MarginPerCcyVo marginPerCcyVo;
        BotVo bot = tacticsData.getBot();
        if (bot == null || (contractGrid = bot.getContractGrid()) == null || (unitDisplayVO = contractGrid.getUnitDisplayVO()) == null || (marginPerCcy = unitDisplayVO.getMarginPerCcy()) == null || (marginPerCcyVo = marginPerCcy.get("USDT")) == null || (totalPnl = marginPerCcyVo.getTotalPnl()) == null) {
            totalPnl = tacticsData.getTotalPnl();
        }
        java.lang.String str = totalPnl;
        OLrzqt(c52515wOg);
        copydefault(c52515wOg);
        EZpvd(c52515wOg);
        copydefault(c52515wOg, mpStgyCopyProfitChangeData, str, tacticsData);
        java.util.List<StrategyProfitResponse> profitList = mpStgyCopyProfitChangeData.getProfitList();
        boolean zValueOf = C33129mqd.valueOf(profitList != null ? java.lang.Integer.valueOf(profitList.size()) : null, 0);
        c52515wOg.AhwBna().setVisibility(zValueOf ^ true ? 0 : 8);
        if (zValueOf) {
            return;
        }
        java.util.List<StrategyProfitResponse> profitList2 = mpStgyCopyProfitChangeData.getProfitList();
        Intrinsics.copydefault(profitList2);
        OLrzqt(c52515wOg, mpStgyCopyProfitChangeData, tacticsData, str, this, (java.util.List<StrategyProfitResponse>) C56405yEd.zLjUOn(profitList2));
        java.util.List<StrategyProfitResponse> profitList3 = mpStgyCopyProfitChangeData.getProfitList();
        Intrinsics.copydefault(profitList3);
        copydefault(c52515wOg, (java.util.List<StrategyProfitResponse>) C56405yEd.zLjUOn(profitList3));
    }

    public static /* synthetic */ int setChart$getThemeColor$default(MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, java.lang.String str, TacticsData tacticsData, C52515wOg c52515wOg, boolean z, float f, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            f = 1.0f;
        }
        return OLrzqt(mpStgyCopyProfitChangeData, str, tacticsData, c52515wOg, z, f);
    }

    public static final int OLrzqt(MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, java.lang.String str, TacticsData tacticsData, C52515wOg c52515wOg, boolean z, float f) {
        if (!mpStgyCopyProfitChangeData.getUseUsdtMargin()) {
            str = tacticsData.getTotalPnl();
        }
        if (C33129mqd.copydefault((java.lang.Object) str, (java.lang.Object) 0)) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = c52515wOg.AhwBna().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return c33512mxp.zLjUOn(context, f);
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = c52515wOg.AhwBna().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return c33512mxp2.isConnected(context2, f);
    }

    public static /* synthetic */ android.graphics.drawable.Drawable setChart$updateDrawableFill$default(MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, java.lang.String str, TacticsData tacticsData, C52515wOg c52515wOg, float f, float f2, float f3, int i, java.lang.Object obj) {
        if ((i & 64) != 0) {
            f3 = 0.45f;
        }
        return OLrzqt(mpStgyCopyProfitChangeData, str, tacticsData, c52515wOg, f, f2, f3);
    }

    public static final android.graphics.drawable.Drawable OLrzqt(MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, java.lang.String str, TacticsData tacticsData, C52515wOg c52515wOg, float f, float f2, float f3) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iOLrzqt = OLrzqt(mpStgyCopyProfitChangeData, str, tacticsData, c52515wOg, false, 0.0f);
        int iOLrzqt2 = OLrzqt(mpStgyCopyProfitChangeData, str, tacticsData, c52515wOg, false, f3);
        float f4 = f2 - f;
        if (java.lang.Math.abs(f4) < 1.0E-7f) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            arrayList.add(java.lang.Integer.valueOf(iOLrzqt2));
            arrayList.add(java.lang.Integer.valueOf(iOLrzqt));
            return new GradientDrawable(orientation, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList));
        }
        if (f > 0.0f) {
            GradientDrawable.Orientation orientation2 = GradientDrawable.Orientation.TOP_BOTTOM;
            arrayList.add(java.lang.Integer.valueOf(iOLrzqt2));
            arrayList.add(java.lang.Integer.valueOf(iOLrzqt));
            return new GradientDrawable(orientation2, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList));
        }
        if (f2 < 0.0f) {
            GradientDrawable.Orientation orientation3 = GradientDrawable.Orientation.TOP_BOTTOM;
            arrayList.add(java.lang.Integer.valueOf(iOLrzqt));
            arrayList.add(java.lang.Integer.valueOf(iOLrzqt2));
            return new GradientDrawable(orientation3, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList));
        }
        arrayList.add(java.lang.Integer.valueOf(iOLrzqt2));
        arrayList.add(java.lang.Integer.valueOf(iOLrzqt));
        arrayList.add(java.lang.Integer.valueOf(iOLrzqt2));
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = 0.5f;
        if (f2 != f) {
            floatRef.element = f2 / java.lang.Math.abs(f4);
        }
        ComponentName componentName = new ComponentName(arrayList, floatRef);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(componentName);
        return paintDrawable;
    }

    /* JADX INFO: renamed from: o.wOi$ComponentName */
    public static final class ComponentName extends ShapeDrawable.ShaderFactory {
        public final /* synthetic */ java.util.ArrayList<java.lang.Integer> AEQbTJ;
        public final /* synthetic */ Ref.FloatRef copydefault;

        public ComponentName(java.util.ArrayList<java.lang.Integer> arrayList, Ref.FloatRef floatRef) {
            this.AEQbTJ = arrayList;
            this.copydefault = floatRef;
        }

        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public Shader resize(int i, int i2) {
            return new LinearGradient(0.0f, 0.0f, 0.0f, i2 * 1.0f, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) this.AEQbTJ), new float[]{0.0f, this.copydefault.element, 1.0f}, Shader.TileMode.REPEAT);
        }
    }

    public static final Activity AEQbTJ(java.util.List<java.lang.String> list) {
        if (list.isEmpty()) {
            return null;
        }
        int size = list.size();
        int i = -1;
        int i2 = -1;
        double d = -1.7976931348623157E308d;
        double d2 = Double.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            java.lang.Double dAuCTel = C59443zhD.AuCTel(list.get(i3));
            if (dAuCTel != null) {
                double dDoubleValue = dAuCTel.doubleValue();
                if (dDoubleValue < d2) {
                    i = i3;
                    d2 = dDoubleValue;
                }
                if (dDoubleValue > d) {
                    i2 = i3;
                    d = dDoubleValue;
                }
            }
        }
        if (i == -1 || i2 == -1) {
            return null;
        }
        return new Activity(d2, d, i, i2);
    }

    public static final android.graphics.drawable.Drawable EZpvd(MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, C52517wOi c52517wOi, java.lang.String str, TacticsData tacticsData, C52515wOg c52515wOg, boolean z) {
        java.util.ArrayList arrayList;
        java.lang.String pnlRatio;
        java.util.List<StrategyProfitResponse> profitList = mpStgyCopyProfitChangeData.getProfitList();
        if (profitList != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(profitList, 10));
            for (StrategyProfitResponse strategyProfitResponse : profitList) {
                if (mpStgyCopyProfitChangeData.getUseUsdtMargin()) {
                    ProfitMarginPerCcyVo profitMarginPerCcyVo = strategyProfitResponse.getMarginPerCcy().get("USDT");
                    if (profitMarginPerCcyVo == null || (pnlRatio = profitMarginPerCcyVo.getPnlRatio()) == null) {
                        pnlRatio = strategyProfitResponse.getPnlRatio();
                    }
                } else {
                    pnlRatio = strategyProfitResponse.getPnlRatio();
                }
                arrayList.add(pnlRatio);
            }
        } else {
            arrayList = null;
        }
        Activity activityAEQbTJ = arrayList != null ? AEQbTJ(arrayList) : null;
        double dCopydefault = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dEZpvd = activityAEQbTJ != null ? activityAEQbTJ.EZpvd() : 0.0d;
        if (activityAEQbTJ != null) {
            dCopydefault = activityAEQbTJ.copydefault();
        }
        android.graphics.drawable.Drawable chart$updateDrawableFill$default = setChart$updateDrawableFill$default(mpStgyCopyProfitChangeData, str, tacticsData, c52515wOg, (float) dEZpvd, (float) dCopydefault, 0.0f, 64, null);
        return chart$updateDrawableFill$default == null ? C33070mpX.KWHzl(c52517wOi.AEQbTJ) : chart$updateDrawableFill$default;
    }

    public static final LineDataSet AEQbTJ(C52515wOg c52515wOg, MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, java.lang.String str, TacticsData tacticsData, C52517wOi c52517wOi, java.util.List<? extends Entry> list) {
        boolean zCopydefault;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                zCopydefault = true;
                break;
            }
            Entry entry = list.get(i);
            if (entry.getData() != null) {
                zCopydefault = C33129mqd.copydefault((java.lang.Object) java.lang.Float.valueOf(entry.getY()), (java.lang.Object) 0);
                break;
            }
            i++;
        }
        LineDataSet lineDataSet = new LineDataSet(list, "");
        lineDataSet.setColor(setChart$getThemeColor$default(mpStgyCopyProfitChangeData, str, tacticsData, c52515wOg, zCopydefault, 0.0f, 32, null));
        lineDataSet.setLineWidth(1.0f);
        lineDataSet.setDrawFilled(true);
        android.graphics.drawable.Drawable drawableEZpvd = EZpvd(mpStgyCopyProfitChangeData, c52517wOi, str, tacticsData, c52515wOg, zCopydefault);
        if (drawableEZpvd == null) {
            lineDataSet.setDrawFilled(false);
        } else {
            lineDataSet.setDrawFilled(true);
            lineDataSet.setFillDrawable(drawableEZpvd);
        }
        lineDataSet.setDrawCircles(false);
        if (list.size() <= 18) {
            lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        } else {
            lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
            lineDataSet.setCubicIntensity(0.2f);
        }
        lineDataSet.setHighlightEnabled(true);
        lineDataSet.enableDashedHighlightLine(C33518mxv.EZpvd(c52515wOg.AhwBna().getContext(), 5.0f), C33518mxv.EZpvd(c52515wOg.AhwBna().getContext(), 2.0f), 0.0f);
        lineDataSet.setHighlightLineWidth(C33518mxv.EZpvd(c52515wOg.AhwBna().getContext(), 1.0E-6f));
        lineDataSet.setHighLightColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
        lineDataSet.setDrawHorizontalHighlightIndicator(true);
        lineDataSet.setDrawVerticalHighlightIndicator(true);
        lineDataSet.setDrawCircles(false);
        return lineDataSet;
    }

    public static final java.util.List<ILineDataSet> copydefault(C52515wOg c52515wOg, MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, java.lang.String str, TacticsData tacticsData, C52517wOi c52517wOi, java.util.List<? extends Entry> list) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int i = 0;
        java.util.ArrayList arrayList4 = arrayList3;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            Entry entry = (Entry) obj;
            arrayList4.add(entry);
            if (entry.getData() == null) {
                arrayList2.add(AEQbTJ(c52515wOg, mpStgyCopyProfitChangeData, str, tacticsData, c52517wOi, arrayList4));
                arrayList = new java.util.ArrayList();
                arrayList.add(entry);
            } else {
                arrayList = arrayList4;
            }
            if (i == list.size() - 1) {
                arrayList2.add(AEQbTJ(c52515wOg, mpStgyCopyProfitChangeData, str, tacticsData, c52517wOi, arrayList));
            }
            i++;
            arrayList4 = arrayList;
        }
        return arrayList2;
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) && StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "/", false, 2, (java.lang.Object) null)) {
            try {
                return StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null).get(1) + "/";
            } catch (java.lang.Exception unused) {
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: o.wOi$ComponentCallbacks */
    public static final class ComponentCallbacks extends ValueFormatter {
        public final /* synthetic */ java.util.List<StrategyProfitResponse> EZpvd;

        public ComponentCallbacks(java.util.List<StrategyProfitResponse> list) {
            this.EZpvd = list;
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            int i = (int) f;
            if (i <= 0 || i >= this.EZpvd.size()) {
                return "";
            }
            StrategyProfitResponse strategyProfitResponse = this.EZpvd.get(i);
            if (Intrinsics.EZpvd((java.lang.Object) strategyProfitResponse.getTimeUnit(), (java.lang.Object) "hour")) {
                return C52517wOi.OLrzqt(pTA.formatDate$default(new Date(C33129mqd.valueOf(strategyProfitResponse.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null)) + pTA.formatTime$default(new Date(C33129mqd.valueOf(strategyProfitResponse.getCTime())), OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null);
            }
            return pTA.formatDate$default(new Date(C33129mqd.valueOf(strategyProfitResponse.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE_MD, null, null, 6, null);
        }
    }

    public static final void copydefault(C52515wOg c52515wOg, java.util.List<StrategyProfitResponse> list) {
        c52515wOg.AhwBna().getXAxis().setValueFormatter(new ComponentCallbacks(list));
    }

    public static final java.util.List<StrategyProfitResponse> OLrzqt(C52515wOg c52515wOg, MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, TacticsData tacticsData, java.lang.String str, C52517wOi c52517wOi, java.util.List<StrategyProfitResponse> list) {
        double dAEQbTJ;
        java.lang.String pnlRatio;
        float f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            StrategyProfitResponse strategyProfitResponse = (StrategyProfitResponse) obj;
            if (mpStgyCopyProfitChangeData.getUseUsdtMargin()) {
                ProfitMarginPerCcyVo profitMarginPerCcyVo = strategyProfitResponse.getMarginPerCcy().get("USDT");
                if (profitMarginPerCcyVo == null || (pnlRatio = profitMarginPerCcyVo.getPnlRatio()) == null) {
                    pnlRatio = strategyProfitResponse.getPnlRatio();
                }
            } else {
                pnlRatio = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyProfitResponse.getSourceCcy()) ? strategyProfitResponse.getPnlRatio() : strategyProfitResponse.getPnlRatioInSourceCcy();
            }
            float f2 = i;
            try {
                f = java.lang.Float.parseFloat(pnlRatio);
            } catch (java.lang.Exception unused) {
                f = 0.0f;
            }
            arrayList2.add(new Entry(f2, f, strategyProfitResponse));
            i++;
        }
        C51348vlN c51348vlNAhwBna = c52515wOg.AhwBna();
        if (c52515wOg.hDKMBd() == null) {
            android.content.Context context = c51348vlNAhwBna.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c52515wOg.KWHzl(new C52580wQr(context));
        }
        java.lang.String instId = tacticsData.getInstId();
        java.lang.String instType = tacticsData.getInstType();
        java.lang.String tradeQuoteCcy = tacticsData.getTradeQuoteCcy();
        C55887xsS c55887xsS = new C55887xsS(instType, instId);
        c55887xsS.gEmmrt(tradeQuoteCcy);
        java.lang.String strAEQbTJ = c55887xsS.AEQbTJ(tacticsData.getOrderType());
        C52580wQr c52580wQrHDKMBd = c52515wOg.hDKMBd();
        if (c52580wQrHDKMBd != null) {
            java.lang.String instId2 = tacticsData.getInstId();
            java.lang.String instType2 = tacticsData.getInstType();
            java.lang.String orderType = tacticsData.getOrderType();
            if (mpStgyCopyProfitChangeData.getUseUsdtMargin()) {
                dAEQbTJ = C33129mqd.AEQbTJ(str);
            } else {
                dAEQbTJ = C33129mqd.AEQbTJ(tacticsData.getTotalPnl());
            }
            c52580wQrHDKMBd.copydefault(instId2, instType2, strAEQbTJ, orderType, dAEQbTJ, mpStgyCopyProfitChangeData.getUseUsdtMargin());
        }
        C52580wQr c52580wQrHDKMBd2 = c52515wOg.hDKMBd();
        if (c52580wQrHDKMBd2 != null) {
            c52580wQrHDKMBd2.setChartView(c51348vlNAhwBna);
        }
        c51348vlNAhwBna.setMarker(c52515wOg.hDKMBd());
        c51348vlNAhwBna.getAxisLeft().setValueFormatter(new ClipData());
        LineData lineData = new LineData(copydefault(c52515wOg, mpStgyCopyProfitChangeData, str, tacticsData, c52517wOi, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2)));
        lineData.setDrawValues(false);
        c51348vlNAhwBna.setData(lineData);
        return arrayList;
    }

    /* JADX INFO: renamed from: o.wOi$ClipData */
    public static final class ClipData extends ValueFormatter {
        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public java.lang.String getAxisLabel(float f, AxisBase axisBase) {
            return pTB.formatPercent$default(xMR.copydefault.OLrzqt((java.lang.Object) java.lang.String.valueOf(f)), 2, 2, RoundingMode.DOWN, null, 8, null);
        }
    }

    public static final void OLrzqt(C52515wOg c52515wOg) {
        C51348vlN c51348vlNAhwBna = c52515wOg.AhwBna();
        c51348vlNAhwBna.getLegend().setEnabled(false);
        c51348vlNAhwBna.setScaleEnabled(false);
        c51348vlNAhwBna.getDescription().setEnabled(false);
        c51348vlNAhwBna.setTouchEnabled(true);
        c51348vlNAhwBna.setDragEnabled(true);
        c51348vlNAhwBna.setNestedScrollingEnabled(false);
        c51348vlNAhwBna.setHighlightPerDragEnabled(true);
        c51348vlNAhwBna.setMinOffset(0.0f);
        c51348vlNAhwBna.setExtraTopOffset(30.0f);
        c51348vlNAhwBna.setExtraRightOffset(0.0f);
        c51348vlNAhwBna.setOnChartValueSelectedListener(new AssistContent(c52515wOg));
        c51348vlNAhwBna.setHighlightPerTapEnabled(true);
        c51348vlNAhwBna.setOnChartGestureListener(new BroadcastReceiver(c52515wOg));
        c52515wOg.AhwBna().setNoDataText(C33070mpX.AYXKKw(C55688xof.Application.hErYDe));
        c52515wOg.AhwBna().setNoDataTextColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
    }

    /* JADX INFO: renamed from: o.wOi$AssistContent */
    public static final class AssistContent implements OnChartValueSelectedListener {
        public final /* synthetic */ C52515wOg EZpvd;

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public AssistContent(C52515wOg c52515wOg) {
            this.EZpvd = c52515wOg;
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            wPO.m8782vibrategIAlus$default(wPO.EZpvd, this.EZpvd.AhwBna(), 0L, 2, null);
        }
    }

    /* JADX INFO: renamed from: o.wOi$BroadcastReceiver */
    public static final class BroadcastReceiver implements OnChartGestureListener {
        public final /* synthetic */ C52515wOg AEQbTJ;

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartDoubleTapped(android.view.MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureStart(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartScale(android.view.MotionEvent motionEvent, float f, float f2) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartSingleTapped(android.view.MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartTranslate(android.view.MotionEvent motionEvent, float f, float f2) {
        }

        public BroadcastReceiver(C52515wOg c52515wOg) {
            this.AEQbTJ = c52515wOg;
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureEnd(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            android.view.ViewParent parent = this.AEQbTJ.AhwBna().getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartLongPressed(android.view.MotionEvent motionEvent) {
            wPO.m8782vibrategIAlus$default(wPO.EZpvd, this.AEQbTJ.AhwBna(), 0L, 2, null);
            android.view.ViewParent parent = this.AEQbTJ.AhwBna().getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public static final void copydefault(C52515wOg c52515wOg) {
        C51348vlN c51348vlNAhwBna = c52515wOg.AhwBna();
        c51348vlNAhwBna.getRenderer().getPaintRender().setStrokeCap(Paint.Cap.ROUND);
        c51348vlNAhwBna.getRenderer().getPaintRender().setStrokeJoin(Paint.Join.ROUND);
    }

    public static final void copydefault(C52515wOg c52515wOg, MpStgyCopyProfitChangeData mpStgyCopyProfitChangeData, java.lang.String str, TacticsData tacticsData) {
        C51348vlN c51348vlNAhwBna = c52515wOg.AhwBna();
        c51348vlNAhwBna.getAxisRight().setEnabled(false);
        c51348vlNAhwBna.getAxisLeft().setEnabled(true);
        YAxis axisLeft = c51348vlNAhwBna.getAxisLeft();
        axisLeft.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART);
        axisLeft.setGranularity(1.0f);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawGridLines(false);
        axisLeft.setLabelCount(3, true);
        axisLeft.setTextColor(ContextCompat.getColor(c51348vlNAhwBna.getContext(), C52761wXj.Activity.QwvEab));
        axisLeft.setTextSize(10.0f);
        axisLeft.setTypeface(C55051xce.OLrzqt.valueOf());
        axisLeft.setXOffset(4.0f);
        axisLeft.setDrawZeroLine(true);
        axisLeft.setZeroLineWidth(0.5f);
        axisLeft.setGridColor(ContextCompat.getColor(c51348vlNAhwBna.getContext(), C52761wXj.Activity.fZc));
        axisLeft.setZeroLineColor(setChart$getThemeColor$default(mpStgyCopyProfitChangeData, str, tacticsData, c52515wOg, true, 0.0f, 32, null));
    }

    public static final void EZpvd(C52515wOg c52515wOg) {
        C51348vlN c51348vlNAhwBna = c52515wOg.AhwBna();
        XAxis xAxis = c51348vlNAhwBna.getXAxis();
        xAxis.setEnabled(true);
        xAxis.setTextColor(ContextCompat.getColor(c51348vlNAhwBna.getContext(), C52761wXj.Activity.QwvEab));
        xAxis.setTextSize(10.0f);
        xAxis.setTypeface(C55051xce.OLrzqt.valueOf());
        xAxis.setYOffset(8.0f);
        c51348vlNAhwBna.setExtraBottomOffset(10.0f);
        c51348vlNAhwBna.setExtraRightOffset(3.0f);
        c51348vlNAhwBna.setExtraLeftOffset(3.0f);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(false);
        xAxis.setLabelCount(5, true);
        xAxis.setGranularityEnabled(true);
        xAxis.setGranularity(1.0f);
        xAxis.setAvoidFirstLastClipping(true);
    }

    /* JADX INFO: renamed from: o.wOi$Activity */
    public static final class Activity {
        public final double EZpvd;
        public final int KWHzl;
        public final int OLrzqt;
        public final double copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, double d, double d2, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                d = activity.copydefault;
            }
            double d3 = d;
            if ((i3 & 2) != 0) {
                d2 = activity.EZpvd;
            }
            double d4 = d2;
            if ((i3 & 4) != 0) {
                i = activity.OLrzqt;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = activity.KWHzl;
            }
            return activity.KWHzl(d3, d4, i4, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(double d, double d2, int i, int i2) {
            return new Activity(d, d2, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return java.lang.Double.compare(this.copydefault, activity.copydefault) == 0 && java.lang.Double.compare(this.EZpvd, activity.EZpvd) == 0 && this.OLrzqt == activity.OLrzqt && this.KWHzl == activity.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Double.hashCode(this.copydefault) * 31) + java.lang.Double.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MinMax(min=" + this.copydefault + ", max=" + this.EZpvd + ", minIndex=" + this.OLrzqt + ", maxIndex=" + this.KWHzl + ")";
        }

        public Activity(double d, double d2, int i, int i2) {
            this.copydefault = d;
            this.EZpvd = d2;
            this.OLrzqt = i;
            this.KWHzl = i2;
        }
    }
}

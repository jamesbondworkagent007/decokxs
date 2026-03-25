package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.market.common.bean.PreMarketLandingBean;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55688xof;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kOc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C28079kOc extends AbstractC59533zio<PreMarketLandingBean, TaskDescription> {
    public boolean EZpvd;
    public final Function1<PreMarketLandingBean, Unit> KWHzl;
    public final Function2<PreMarketLandingBean, android.graphics.drawable.Drawable, Unit> copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        if (this.EZpvd != z) {
            this.EZpvd = z;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<PreMarketLandingBean, Unit> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.market.common.bean.PreMarketLandingBean, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.market.common.bean.PreMarketLandingBean, ? super android.graphics.drawable.Drawable, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C28079kOc(@NotNull Function1<? super PreMarketLandingBean, Unit> function1, @NotNull Function2<? super PreMarketLandingBean, ? super android.graphics.drawable.Drawable, Unit> function2) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.KWHzl = function1;
        this.copydefault = function2;
    }

    /* JADX INFO: renamed from: o.kOc$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kOc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.kOc$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final android.widget.TextView AYXKKw;
        public final android.widget.ImageView AhwBna;
        public final android.widget.ImageView AkhnZx;
        public final kOD DbNXlk;
        public final android.widget.TextView EZpvd;
        public final android.widget.ImageView KWHzl;
        public final android.widget.ImageView OLrzqt;
        public final android.widget.TextView copydefault;
        public final android.widget.TextView djBIcL;
        public final android.widget.TextView fetchVPNInfo;
        public final android.widget.ImageView gEmmrt;
        public final C52794wYp isConnected;
        public final android.widget.TextView valueOf;
        public final android.widget.ImageView values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C52794wYp AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final kOD DbNXlk() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView fetchVPNInfo() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView isConnected() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView valueOf() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView values() {
            return this.values;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl = (android.widget.ImageView) view.findViewById(qZH.StateListAnimator.fVjYLc);
            this.copydefault = (android.widget.TextView) view.findViewById(qZH.StateListAnimator.hErYDe);
            this.AEQbTJ = (android.widget.TextView) view.findViewById(qZH.StateListAnimator.getUriFromString);
            this.DbNXlk = (kOD) view.findViewById(qZH.StateListAnimator.QjzqRB);
            this.djBIcL = (android.widget.TextView) view.findViewById(qZH.StateListAnimator.OEsIKP);
            this.EZpvd = (android.widget.TextView) view.findViewById(qZH.StateListAnimator.dTTfOR);
            this.AYXKKw = (android.widget.TextView) view.findViewById(qZH.StateListAnimator.onTransact);
            this.fetchVPNInfo = (android.widget.TextView) view.findViewById(qZH.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi23);
            this.AhwBna = (android.widget.ImageView) view.findViewById(qZH.StateListAnimator.v);
            this.values = (android.widget.ImageView) view.findViewById(qZH.StateListAnimator.sIqKDg);
            this.AkhnZx = (android.widget.ImageView) view.findViewById(qZH.StateListAnimator.DzkRMH);
            this.isConnected = (C52794wYp) view.findViewById(qZH.StateListAnimator.addPreRequisiteCollector);
            this.gEmmrt = (android.widget.ImageView) view.findViewById(qZH.StateListAnimator.xxhdY);
            this.valueOf = (android.widget.TextView) view.findViewById(qZH.StateListAnimator.getValue);
            this.OLrzqt = (android.widget.ImageView) view.findViewById(qZH.StateListAnimator.scanPackages);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.gkJEwt, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new TaskDescription(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019d  */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull final TaskDescription taskDescription, @NotNull final PreMarketLandingBean preMarketLandingBean) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(preMarketLandingBean, "");
        final android.content.Context context = taskDescription.itemView.getContext();
        java.lang.String bigIcon = C33129mqd.OLrzqt((java.lang.CharSequence) preMarketLandingBean.getBigIcon()) ? preMarketLandingBean.getBigIcon() : preMarketLandingBean.getIcon();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) bigIcon)) {
            Intrinsics.copydefault(Glide.AEQbTJ(context).EZpvd(bigIcon).KWHzl(qZH.Activity.AhwBna).djBIcL().EZpvd(taskDescription.copydefault()));
        } else {
            taskDescription.copydefault().setImageResource(qZH.Activity.AhwBna);
        }
        taskDescription.OLrzqt().setText(preMarketLandingBean.getCcy());
        taskDescription.EZpvd().setText(preMarketLandingBean.getFullName());
        android.widget.TextView textViewEZpvd = taskDescription.EZpvd();
        Intrinsics.checkNotNullExpressionValue(textViewEZpvd, "");
        textViewEZpvd.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) preMarketLandingBean.getFullName()) ? 0 : 8);
        taskDescription.DbNXlk().setSelected(Intrinsics.EZpvd((java.lang.Object) preMarketLandingBean.getState(), (java.lang.Object) "live"));
        android.widget.TextView textViewGEmmrt = taskDescription.gEmmrt();
        Intrinsics.checkNotNullExpressionValue(textViewGEmmrt, "");
        java.lang.String ruleType = preMarketLandingBean.getRuleType();
        textViewGEmmrt.setVisibility((ruleType == null || !C59449zhJ.gEmmrt(ruleType, "rebase_contract", true)) ? 8 : 0);
        java.lang.String state = preMarketLandingBean.getState();
        if (state != null) {
            switch (state.hashCode()) {
                case -349730414:
                    if (state.equals("converted")) {
                        kOD kodDbNXlk = taskDescription.DbNXlk();
                        Intrinsics.checkNotNullExpressionValue(kodDbNXlk, "");
                        kodDbNXlk.setVisibility(0);
                        taskDescription.DbNXlk().setTagStyle("live", false);
                        C52794wYp c52794wYpAkhnZx = taskDescription.AkhnZx();
                        Intrinsics.checkNotNullExpressionValue(c52794wYpAkhnZx, "");
                        c52794wYpAkhnZx.setVisibility(0);
                        taskDescription.AkhnZx().setText(qZH.PendingIntent.OzhFjl);
                        taskDescription.AkhnZx().setEnabled(true);
                    } else {
                        kOD kodDbNXlk2 = taskDescription.DbNXlk();
                        Intrinsics.checkNotNullExpressionValue(kodDbNXlk2, "");
                        kodDbNXlk2.setVisibility(8);
                    }
                    break;
                case -318386323:
                    if (state.equals("preopen")) {
                        kOD kodDbNXlk3 = taskDescription.DbNXlk();
                        Intrinsics.checkNotNullExpressionValue(kodDbNXlk3, "");
                        kodDbNXlk3.setVisibility(0);
                        taskDescription.DbNXlk().setTagStyle("preopen", false);
                        C52794wYp c52794wYpAkhnZx2 = taskDescription.AkhnZx();
                        Intrinsics.checkNotNullExpressionValue(c52794wYpAkhnZx2, "");
                        c52794wYpAkhnZx2.setVisibility(0);
                        taskDescription.AkhnZx().setEnabled(false);
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) preMarketLandingBean.getListTime())) {
                            taskDescription.AkhnZx().setText(C33069mpW.copydefault(qZH.PendingIntent.HJWChPURsaBn, C56423yEv.EZpvd(C56390yDp.OLrzqt("dateTime", pTA.format$default(new Date(C33129mqd.valueOf(preMarketLandingBean.getListTime())), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_STANDARD, null, null, false, 28, null)))));
                        } else {
                            taskDescription.AkhnZx().setText(qZH.PendingIntent.HJWChPzRXNTw);
                        }
                        break;
                    }
                    break;
                case 3322092:
                    if (state.equals("live")) {
                    }
                    break;
                case 94756344:
                    if (state.equals(EopTrackEvent.CLOSE)) {
                        kOD kodDbNXlk4 = taskDescription.DbNXlk();
                        Intrinsics.checkNotNullExpressionValue(kodDbNXlk4, "");
                        kodDbNXlk4.setVisibility(0);
                        taskDescription.DbNXlk().setTagStyle(EopTrackEvent.CLOSE, false);
                        C52794wYp c52794wYpAkhnZx3 = taskDescription.AkhnZx();
                        Intrinsics.checkNotNullExpressionValue(c52794wYpAkhnZx3, "");
                        c52794wYpAkhnZx3.setVisibility(8);
                        break;
                    }
                    break;
            }
        }
        taskDescription.AYXKKw().setOnClickListener(new View.OnClickListener() { // from class: o.kOh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C28079kOc.OLrzqt(this.AEQbTJ, preMarketLandingBean, taskDescription, view);
            }
        });
        xUW xuw = xUW.KWHzl;
        java.lang.String instId = preMarketLandingBean.getInstId();
        if (instId == null) {
            instId = "";
        }
        java.lang.String upperCase = o.TaskDescription.AEQbTJ(xuw.AEQbTJ(instId)).AEQbTJ().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        taskDescription.KWHzl().setText(preMarketLandingBean.getIntroduce());
        taskDescription.KWHzl().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.kOj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C28079kOc.KWHzl(taskDescription, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        taskDescription.AhwBna().setOnClickListener(new View.OnClickListener() { // from class: o.kOi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C28079kOc.copydefault(this.KWHzl, taskDescription, context, preMarketLandingBean, view);
            }
        });
        taskDescription.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.kOf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C28079kOc.EZpvd(this.AEQbTJ, taskDescription, context, preMarketLandingBean, view);
            }
        });
        taskDescription.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.kOg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C28079kOc.gEmmrt(this.KWHzl, taskDescription, context, preMarketLandingBean, view);
            }
        });
        java.lang.String introduce = preMarketLandingBean.getIntroduce();
        if (introduce != null && introduce.length() > 100) {
            taskDescription.AhwBna().setVisibility(0);
            taskDescription.AEQbTJ().setVisibility(0);
        } else {
            taskDescription.AhwBna().setVisibility(8);
            taskDescription.AEQbTJ().setVisibility(8);
        }
        android.widget.TextView textViewDjBIcL = taskDescription.djBIcL();
        xMR xmr = xMR.copydefault;
        java.lang.String lastPrice = preMarketLandingBean.getLastPrice();
        if (lastPrice == null) {
            lastPrice = "";
        }
        textViewDjBIcL.setText(xmr.copydefault(lastPrice) + " " + upperCase);
        C54536xML c54536xML = new C54536xML();
        java.lang.String totalVolume = preMarketLandingBean.getTotalVolume();
        if (totalVolume == null) {
            totalVolume = "";
        }
        java.lang.String strOLrzqt = c54536xML.OLrzqt(totalVolume);
        taskDescription.isConnected().setText(strOLrzqt + " " + upperCase);
        android.widget.ImageView imageViewValueOf = taskDescription.valueOf();
        Intrinsics.checkNotNullExpressionValue(imageViewValueOf, "");
        imageViewValueOf.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) preMarketLandingBean.getOfficialUrl()) ? 0 : 8);
        android.widget.ImageView imageViewValues = taskDescription.values();
        Intrinsics.checkNotNullExpressionValue(imageViewValues, "");
        imageViewValues.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) preMarketLandingBean.getTwitter()) ? 0 : 8);
        android.widget.ImageView imageViewFetchVPNInfo = taskDescription.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(imageViewFetchVPNInfo, "");
        imageViewFetchVPNInfo.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) preMarketLandingBean.getTelegram()) ? 0 : 8);
        android.widget.ImageView imageViewValueOf2 = taskDescription.valueOf();
        imageViewValueOf2.setOnClickListener(new Activity(imageViewValueOf2, 1000L, this, context, preMarketLandingBean));
        android.widget.ImageView imageViewValues2 = taskDescription.values();
        imageViewValues2.setOnClickListener(new StateListAnimator(imageViewValues2, 1000L, this, context, preMarketLandingBean));
        android.widget.ImageView imageViewFetchVPNInfo2 = taskDescription.fetchVPNInfo();
        imageViewFetchVPNInfo2.setOnClickListener(new Application(imageViewFetchVPNInfo2, 1000L, this, context, preMarketLandingBean));
        C52794wYp c52794wYpAkhnZx4 = taskDescription.AkhnZx();
        c52794wYpAkhnZx4.setOnClickListener(new FragmentManager(c52794wYpAkhnZx4, 1000L, this, preMarketLandingBean));
    }

    public static final void OLrzqt(C28079kOc c28079kOc, PreMarketLandingBean preMarketLandingBean, TaskDescription taskDescription, android.view.View view) {
        Function2<PreMarketLandingBean, android.graphics.drawable.Drawable, Unit> function2 = c28079kOc.copydefault;
        android.graphics.drawable.Drawable drawable = taskDescription.copydefault().getDrawable();
        Intrinsics.checkNotNullExpressionValue(drawable, "");
        function2.invoke(preMarketLandingBean, drawable);
    }

    public static final void KWHzl(TaskDescription taskDescription, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        android.widget.TextView textViewKWHzl;
        android.text.Layout layout;
        android.widget.TextView textViewKWHzl2 = taskDescription.KWHzl();
        int lineCount = (textViewKWHzl2 != null ? textViewKWHzl2.getLineCount() : 0) - 1;
        if (lineCount >= 0) {
            if (lineCount >= 4 || ((textViewKWHzl = taskDescription.KWHzl()) != null && (layout = textViewKWHzl.getLayout()) != null && layout.getEllipsisCount(lineCount) > 0)) {
                taskDescription.AhwBna().setVisibility(0);
                android.widget.ImageView imageViewAEQbTJ = taskDescription.AEQbTJ();
                if (imageViewAEQbTJ != null) {
                    imageViewAEQbTJ.setVisibility(0);
                    return;
                }
                return;
            }
            taskDescription.AhwBna().setVisibility(8);
            android.widget.ImageView imageViewAEQbTJ2 = taskDescription.AEQbTJ();
            if (imageViewAEQbTJ2 != null) {
                imageViewAEQbTJ2.setVisibility(8);
            }
        }
    }

    public static final void copydefault(C28079kOc c28079kOc, TaskDescription taskDescription, android.content.Context context, PreMarketLandingBean preMarketLandingBean, android.view.View view) {
        Intrinsics.copydefault(context);
        c28079kOc.KWHzl(taskDescription, context, preMarketLandingBean);
    }

    public static final void EZpvd(C28079kOc c28079kOc, TaskDescription taskDescription, android.content.Context context, PreMarketLandingBean preMarketLandingBean, android.view.View view) {
        Intrinsics.copydefault(context);
        c28079kOc.KWHzl(taskDescription, context, preMarketLandingBean);
    }

    public static final void gEmmrt(C28079kOc c28079kOc, TaskDescription taskDescription, android.content.Context context, PreMarketLandingBean preMarketLandingBean, android.view.View view) {
        Intrinsics.copydefault(context);
        c28079kOc.KWHzl(taskDescription, context, preMarketLandingBean);
    }

    /* JADX INFO: renamed from: o.kOc$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ PreMarketLandingBean EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C28079kOc OLrzqt;
        public final /* synthetic */ android.content.Context copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C28079kOc c28079kOc, android.content.Context context, PreMarketLandingBean preMarketLandingBean) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c28079kOc;
            this.copydefault = context;
            this.EZpvd = preMarketLandingBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C28079kOc c28079kOc = this.OLrzqt;
                Intrinsics.copydefault(this.copydefault);
                c28079kOc.EZpvd(this.copydefault, this.EZpvd.getOfficialUrl());
            }
        }
    }

    /* JADX INFO: renamed from: o.kOc$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C28079kOc KWHzl;
        public final /* synthetic */ android.content.Context OLrzqt;
        public final /* synthetic */ PreMarketLandingBean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C28079kOc c28079kOc, android.content.Context context, PreMarketLandingBean preMarketLandingBean) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c28079kOc;
            this.OLrzqt = context;
            this.copydefault = preMarketLandingBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C28079kOc c28079kOc = this.KWHzl;
                Intrinsics.copydefault(this.OLrzqt);
                c28079kOc.EZpvd(this.OLrzqt, this.copydefault.getTelegram());
            }
        }
    }

    /* JADX INFO: renamed from: o.kOc$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C28079kOc KWHzl;
        public final /* synthetic */ PreMarketLandingBean OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C28079kOc c28079kOc, PreMarketLandingBean preMarketLandingBean) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c28079kOc;
            this.OLrzqt = preMarketLandingBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.copydefault().invoke(this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.kOc$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ PreMarketLandingBean EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C28079kOc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C28079kOc c28079kOc, android.content.Context context, PreMarketLandingBean preMarketLandingBean) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c28079kOc;
            this.AEQbTJ = context;
            this.EZpvd = preMarketLandingBean;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C28079kOc c28079kOc = this.copydefault;
                Intrinsics.copydefault(this.AEQbTJ);
                c28079kOc.EZpvd(this.AEQbTJ, this.EZpvd.getTwitter());
            }
        }
    }

    public final void KWHzl(TaskDescription taskDescription, android.content.Context context, PreMarketLandingBean preMarketLandingBean) {
        KWHzl(!this.EZpvd);
        if (!this.EZpvd) {
            taskDescription.AhwBna().setText(context.getString(qZH.PendingIntent.AwvSrB));
            taskDescription.AEQbTJ().setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) preMarketLandingBean.getIntroduce())) {
                taskDescription.KWHzl().setMaxLines(4);
                return;
            }
            return;
        }
        taskDescription.KWHzl().setMaxLines(Integer.MAX_VALUE);
        taskDescription.AhwBna().setText(context.getString(C55688xof.Application.MediaBrowserCompatSubscription));
        taskDescription.AEQbTJ().setImageResource(C52761wXj.TaskDescription.DNMMPQ);
    }

    public final void EZpvd(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(android.net.Uri.parse(str));
        try {
            context.startActivity(intent);
        } catch (java.lang.Exception e) {
            android.util.Log.getStackTraceString(e);
        }
    }
}

package o;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.business.defi.api.model.tx.signdata.IntervalMode;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.TransferAddressData;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC10049bhC;
import o.ActivityC20438ggr;
import o.C13754dXa;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.ggr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC20438ggr extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public static final java.util.HashMap<java.lang.String, OKWBaseMultiTransfer<?, ?>> OLrzqt = new java.util.HashMap<>(1);
    public AbstractC16352eiM AhwBna;
    public OKWBaseMultiTransfer<?, ?> djBIcL;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.ggp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC20438ggr.valueOf(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.ggv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC20438ggr.valueOf();
        }
    });
    public final java.util.Set<java.lang.String> gEmmrt = new LinkedHashSet();
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ggx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC20438ggr.djBIcL(this.AEQbTJ);
        }
    });
    public boolean EZpvd = true;

    /* JADX INFO: renamed from: o.ggr$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[IntervalMode.values().length];
            try {
                iArr[IntervalMode.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[IntervalMode.RANGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX INFO: renamed from: o.ggr$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ggr.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransfer) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(oKWBaseMultiTransfer, "");
            java.lang.String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            ActivityC20438ggr.OLrzqt.put(string, oKWBaseMultiTransfer);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC20438ggr.class);
            intent.putExtra("uniqueKey", string);
            context.startActivity(intent);
        }
    }

    public final AbstractC17076evv copydefault() {
        return (AbstractC17076evv) this.copydefault.getValue();
    }

    public static final AbstractC17076evv valueOf(ActivityC20438ggr activityC20438ggr) {
        AbstractC17076evv abstractC17076evvAEQbTJ = AbstractC17076evv.AEQbTJ(activityC20438ggr.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(abstractC17076evvAEQbTJ, "");
        return abstractC17076evvAEQbTJ;
    }

    private final C43316rmw gEmmrt() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw valueOf() {
        return new C43316rmw();
    }

    /* JADX INFO: renamed from: o.ggr$TaskDescription */
    public static final class TaskDescription implements OKWBaseMultiTransfer.Application {
        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.Application
        public void AEQbTJ() {
        }

        public TaskDescription() {
        }

        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.Application
        public void KWHzl(int i) {
            if (i == 3) {
                ActivityC20438ggr.this.AhwBna();
            }
        }

        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.Application
        public void KWHzl() {
            java.lang.Object next;
            OKWBaseMultiTransfer oKWBaseMultiTransfer = ActivityC20438ggr.this.djBIcL;
            if (oKWBaseMultiTransfer != null) {
                ActivityC20438ggr activityC20438ggr = ActivityC20438ggr.this;
                java.util.Iterator<T> it = oKWBaseMultiTransfer.gHZMYf().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    OKWBaseMultiTransfer.TransactionInfo transactionInfo = (OKWBaseMultiTransfer.TransactionInfo) next;
                    if (transactionInfo.getTxStatus() == 4 || transactionInfo.getTxStatus() == 3) {
                        if (!activityC20438ggr.gEmmrt.contains(transactionInfo.getTxHash())) {
                            break;
                        }
                    }
                }
                OKWBaseMultiTransfer.TransactionInfo transactionInfo2 = (OKWBaseMultiTransfer.TransactionInfo) next;
                if (transactionInfo2 != null) {
                    activityC20438ggr.gEmmrt.add(transactionInfo2.getTxHash());
                    activityC20438ggr.KWHzl(oKWBaseMultiTransfer, transactionInfo2);
                }
            }
        }
    }

    public final OKWBaseMultiTransfer.Application EZpvd() {
        return (OKWBaseMultiTransfer.Application) this.valueOf.getValue();
    }

    public static final TaskDescription djBIcL(ActivityC20438ggr activityC20438ggr) {
        return activityC20438ggr.new TaskDescription();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransfer = (OKWBaseMultiTransfer) C56532yIw.AEQbTJ(OLrzqt).remove(getIntent().getStringExtra("uniqueKey"));
        if (oKWBaseMultiTransfer == null) {
            finish();
            return;
        }
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(128);
        }
        this.djBIcL = oKWBaseMultiTransfer;
        oKWBaseMultiTransfer.copydefault(EZpvd());
        AbstractC16352eiM abstractC16352eiMKWHzl = AbstractC16352eiM.KWHzl(getLayoutInflater());
        this.AhwBna = abstractC16352eiMKWHzl;
        if (abstractC16352eiMKWHzl == null) {
            Intrinsics.gEmmrt("");
            abstractC16352eiMKWHzl = null;
        }
        setContentView(abstractC16352eiMKWHzl.getRoot());
        AEQbTJ();
        C32866mlf.onEvent$default("AppMultisender_Status_Status_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.ggu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC20438ggr.AhwBna(this.copydefault);
            }
        });
    }

    public static final void AhwBna(ActivityC20438ggr activityC20438ggr) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC20438ggr, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.EZpvd) {
            this.EZpvd = false;
            return;
        }
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransfer = this.djBIcL;
        if (oKWBaseMultiTransfer != null) {
            oKWBaseMultiTransfer.dvKsVJ();
        }
    }

    public final void AEQbTJ() {
        AbstractC16352eiM abstractC16352eiM = this.AhwBna;
        if (abstractC16352eiM == null) {
            Intrinsics.gEmmrt("");
            abstractC16352eiM = null;
        }
        C55178xez c55178xez = abstractC16352eiM.KWHzl;
        c55178xez.setStatus(6);
        C52794wYp c52794wYpAEQbTJ = c55178xez.OLrzqt().AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(8);
        }
        C52794wYp c52794wYpCopydefault = c55178xez.OLrzqt().copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ReportDrawnCompositioncheckReporter1));
            c52794wYpCopydefault.setOnClickListener(new LoaderManager(c52794wYpCopydefault, 1000L, this));
        }
        android.widget.ImageView imageViewAEQbTJ = c55178xez.AEQbTJ();
        imageViewAEQbTJ.setOnClickListener(new ActionBar(imageViewAEQbTJ, 1000L, this));
        android.view.View root = copydefault().getRoot();
        root.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        c55178xez.setAdvancedView(root);
        AppCompatTextView appCompatTextView = new AppCompatTextView(c55178xez.getContext());
        appCompatTextView.setText(C13754dXa.FragmentManager.r8lambda7lLdjm1L5OSJIz1pWP4kzityPws);
        TextViewCompat.setTextAppearance(appCompatTextView, C32113mPz.Dialog.fIwbmz);
        appCompatTextView.setTextColor(ContextCompat.getColor(appCompatTextView.getContext(), C52761wXj.Activity.fdOvFl));
        c55178xez.setOptionalView(appCompatTextView);
        gEmmrt().register(OKWBaseMultiTransfer.TransactionInfo.class, new Application());
        copydefault().OLrzqt.setAdapter(gEmmrt());
        AhwBna();
    }

    /* JADX INFO: renamed from: o.ggr$Application */
    public final class Application extends AbstractC43310rmq<OKWBaseMultiTransfer.TransactionInfo, AbstractC16785eqV> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C13754dXa.TaskDescription.fMBJsc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return dTV.isConnected;
        }

        /* JADX INFO: renamed from: o.ggr$Application$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ C10854bwM EZpvd;
            public final /* synthetic */ OKWBaseMultiTransfer.TransactionInfo OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, OKWBaseMultiTransfer.TransactionInfo transactionInfo, C10854bwM c10854bwM) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.OLrzqt = transactionInfo;
                this.EZpvd = c10854bwM;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    android.view.View view2 = this.AEQbTJ;
                    ActivityC10049bhC.ActionBar actionBar = ActivityC10049bhC.Companion;
                    android.content.Context context = view2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    actionBar.KWHzl(context, (1544 & 2) != 0 ? "" : this.OLrzqt.getTxId(), (1544 & 4) != 0 ? "" : this.OLrzqt.getTxHash(), (1544 & 8) != 0 ? "" : null, this.OLrzqt.getFromAddress(), this.OLrzqt.getWalletId(), this.OLrzqt.getOrderId(), (1544 & 128) != 0 ? 0L : this.EZpvd.AhwBna(), "", (1544 & 512) != 0 ? false : false, (1544 & 1024) != 0 ? "" : null);
                }
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC43310rmq, o.AbstractC59533zio
        public C43312rms<AbstractC16785eqV> onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C43312rms<AbstractC16785eqV> c43312rmsOnCreateViewHolder = super.onCreateViewHolder(layoutInflater, viewGroup);
            ((AbstractC16785eqV) c43312rmsOnCreateViewHolder.OLrzqt()).AEQbTJ.setGravity(C55296xhK.OLrzqt(ActivityC20438ggr.this) ? TextAlign.RIGHT : TextAlign.LEFT);
            Intrinsics.checkNotNullExpressionValue(c43312rmsOnCreateViewHolder, "");
            return c43312rmsOnCreateViewHolder;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC16785eqV> c43312rms, @NotNull OKWBaseMultiTransfer.TransactionInfo transactionInfo) {
            C10854bwM c10854bwMFHqPtx;
            java.lang.StringBuilder sb;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(transactionInfo, "");
            super.onBindViewHolder((C43312rms) c43312rms, transactionInfo);
            OKWBaseMultiTransfer oKWBaseMultiTransfer = ActivityC20438ggr.this.djBIcL;
            if (oKWBaseMultiTransfer == null || (c10854bwMFHqPtx = oKWBaseMultiTransfer.fHqPtx()) == null) {
                return;
            }
            java.lang.String strEZpvd = C54870xYj.EZpvd(transactionInfo.getAmount(), c10854bwMFHqPtx.valueOf(), c10854bwMFHqPtx.DTwDnp(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            if (C55296xhK.OLrzqt(ActivityC20438ggr.this)) {
                java.lang.String strFJNWhG = c10854bwMFHqPtx.fJNWhG();
                sb = new java.lang.StringBuilder();
                sb.append(strFJNWhG);
                sb.append(" +");
                sb.append(strEZpvd);
            } else {
                java.lang.String strFJNWhG2 = c10854bwMFHqPtx.fJNWhG();
                sb = new java.lang.StringBuilder();
                sb.append(Marker.ANY_NON_NULL_MARKER);
                sb.append(strEZpvd);
                sb.append(" ");
                sb.append(strFJNWhG2);
            }
            ((AbstractC16785eqV) c43312rms.OLrzqt()).AEQbTJ.setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(sb.toString(), new java.lang.String[]{Marker.ANY_NON_NULL_MARKER + strEZpvd}, 0, null, false, new Function1() { // from class: o.ggt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC20438ggr.Application.AEQbTJ((java.util.List) obj);
                }
            }, 14, null), new java.lang.String[]{c10854bwMFHqPtx.fJNWhG()}, 0, null, false, new Function1() { // from class: o.ggw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC20438ggr.Application.OLrzqt((java.util.List) obj);
                }
            }, 14, null));
            int txStatus = transactionInfo.getTxStatus();
            if (txStatus == 3) {
                ((AbstractC16785eqV) c43312rms.OLrzqt()).EZpvd.setImageDrawable(C57304yfr.copydefault.OLrzqt(c43312rms.itemView.getContext(), C52761wXj.TaskDescription.RKcVTr, C52761wXj.Activity.DQzvGN));
            } else if (txStatus == 4) {
                ((AbstractC16785eqV) c43312rms.OLrzqt()).EZpvd.setImageDrawable(C57304yfr.copydefault.EZpvd(c43312rms.itemView.getContext(), C52761wXj.TaskDescription.Dmq, C52761wXj.ActionBar.DNMMPQ));
            } else {
                ((AbstractC16785eqV) c43312rms.OLrzqt()).EZpvd.setImageDrawable(C57304yfr.copydefault.OLrzqt(c43312rms.itemView.getContext(), C52761wXj.TaskDescription.Dmq, C52761wXj.Activity.UlJrfe));
                android.widget.ImageView imageView = ((AbstractC16785eqV) c43312rms.OLrzqt()).KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(4);
            }
            if (transactionInfo.getTxId().length() > 0) {
                android.widget.ImageView imageView2 = ((AbstractC16785eqV) c43312rms.OLrzqt()).KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(0);
                android.view.View view = c43312rms.itemView;
                view.setOnClickListener(new TaskDescription(view, 1000L, transactionInfo, c10854bwMFHqPtx));
                return;
            }
            android.widget.ImageView imageView3 = ((AbstractC16785eqV) c43312rms.OLrzqt()).KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(4);
        }

        public static final Unit AEQbTJ(java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.ggr$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC20438ggr KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC20438ggr activityC20438ggr) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = activityC20438ggr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.ggr$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ ActivityC20438ggr AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, ActivityC20438ggr activityC20438ggr) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = activityC20438ggr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        int i;
        int i2;
        java.util.ArrayList<OKWBaseMultiTransfer.TransactionInfo> arrayListGHZMYf;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransfer = this.djBIcL;
        int i3 = 0;
        if (oKWBaseMultiTransfer == null || (arrayListGHZMYf = oKWBaseMultiTransfer.gHZMYf()) == null) {
            i = 0;
            i2 = 0;
        } else {
            java.util.Iterator<T> it = arrayListGHZMYf.iterator();
            i = 0;
            i2 = 0;
            while (it.hasNext()) {
                i++;
                int txStatus = ((OKWBaseMultiTransfer.TransactionInfo) it.next()).getTxStatus();
                if (txStatus == 3) {
                    i2++;
                } else if (txStatus == 4) {
                    i3++;
                }
            }
        }
        copydefault().KWHzl.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.ActivityResultCallerLauncher, C56424yEw.gEmmrt(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i3)), C56390yDp.OLrzqt("total", java.lang.String.valueOf(i)))));
        C43316rmw c43316rmwGEmmrt = gEmmrt();
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransfer2 = this.djBIcL;
        AbstractC16352eiM abstractC16352eiM = null;
        java.util.List listGHZMYf = oKWBaseMultiTransfer2 != null ? oKWBaseMultiTransfer2.gHZMYf() : null;
        if (listGHZMYf == null) {
            listGHZMYf = yDY.AhwBna();
        }
        C33064mpR.OLrzqt(c43316rmwGEmmrt, (java.util.List<? extends java.lang.Object>) listGHZMYf);
        if (i3 == i) {
            AbstractC16352eiM abstractC16352eiM2 = this.AhwBna;
            if (abstractC16352eiM2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16352eiM = abstractC16352eiM2;
            }
            abstractC16352eiM.KWHzl.setStatus(4);
            return;
        }
        if (i2 != 0) {
            AbstractC16352eiM abstractC16352eiM3 = this.AhwBna;
            if (abstractC16352eiM3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16352eiM = abstractC16352eiM3;
            }
            abstractC16352eiM.KWHzl.setStatus(3);
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.view.Window window = getWindow();
        if (window != null) {
            window.clearFlags(128);
        }
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransfer = this.djBIcL;
        if (oKWBaseMultiTransfer != null) {
            oKWBaseMultiTransfer.KWHzl(EZpvd());
        }
    }

    public final void KWHzl(final OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransfer, final OKWBaseMultiTransfer.TransactionInfo transactionInfo) {
        C32866mlf.onEvent$default("AppMultisender_Status_Status_Result", (TrackChannel[]) null, new Function1() { // from class: o.ggq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC20438ggr.copydefault(oKWBaseMultiTransfer, transactionInfo, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v15, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v20, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v24, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v37, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v43, resolved type: Fee */
    /* JADX DEBUG: Multi-variable search result rejected for r2v56, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(OKWBaseMultiTransfer oKWBaseMultiTransfer, OKWBaseMultiTransfer.TransactionInfo transactionInfo, EventParamsList eventParamsList) {
        java.lang.Object next;
        java.lang.String str;
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        int transferType = ((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getTransferType();
        eventParamsList.put("transaction_type", transferType != 1 ? transferType != 2 ? "many_to_many" : "many_to_one" : "one_to_many", true);
        eventParamsList.put("token", oKWBaseMultiTransfer.fHqPtx().fJNWhG(), false);
        eventParamsList.put("chain", oKWBaseMultiTransfer.dHguZz().djBIcL(), false);
        eventParamsList.put("sending_amount", oKWBaseMultiTransfer.AubY(), false);
        eventParamsList.put("sending_address_count", java.lang.String.valueOf(((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getFromAddress().size()), false);
        eventParamsList.put("receiving_address_count", java.lang.String.valueOf(((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getToAddress().size()), false);
        java.util.Iterator<T> it = ((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getToAddress().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((TransferAddressData) next).getOkexAccount())) {
                break;
            }
        }
        TransferAddressData transferAddressData = (TransferAddressData) next;
        if (transferAddressData != null) {
            eventParamsList.put("receiving_address_cefi", transferAddressData.getAddress(), false);
        }
        java.util.ArrayList<TransferAddressData> toAddress = ((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getToAddress();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : toAddress) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((TransferAddressData) obj).getMemo())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            java.util.ArrayList<TransferAddressData> toAddress2 = ((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getToAddress();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : toAddress2) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((TransferAddressData) obj2).getMemo())) {
                    arrayList2.add(obj2);
                }
            }
            eventParamsList.put("ton_memo", CollectionsKt___CollectionsKt.joinToString$default(arrayList2, null, null, null, 0, null, null, 63, null), false);
        }
        eventParamsList.put("tom_memo_counts", java.lang.String.valueOf(arrayList.size()), false);
        java.lang.String str3 = "range";
        if (oKWBaseMultiTransfer.ORxRYg()) {
            str = "max";
        } else {
            str = oKWBaseMultiTransfer.DTwDnp() ? "specific_amount" : "range";
        }
        eventParamsList.put("sending_amount_type", str, true);
        int i = StateListAnimator.copydefault[((MultiTransferSignData) oKWBaseMultiTransfer.QVsKAR()).getIntervalMode().ordinal()];
        if (i == 1) {
            str3 = "no_interval";
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        eventParamsList.put("interval_setting", str3, true);
        Fee feeQKudOq = oKWBaseMultiTransfer.QKudOq();
        if (feeQKudOq instanceof AbstractC8485bDc) {
            switch (((AbstractC8485bDc) feeQKudOq).DbNXlk()) {
                case 31:
                    str2 = "slow";
                    break;
                case 32:
                    str2 = "average";
                    break;
                case 33:
                    str2 = "fast";
                    break;
                default:
                    str2 = "custom";
                    break;
            }
        }
        eventParamsList.put("gas_level", str2, true);
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        eventParamsList.put("transaction_id", string, false);
        eventParamsList.put("success_fail", transactionInfo.getTxStatus() == 4 ? "succeed" : "fail", true);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

package o;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.components.track.TrackChannel;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC18768fod;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fod, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18768fod extends AbstractActivityC33013moT {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public AbstractC16240egG AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.fog
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC18768fod.AEQbTJ();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final C59534zip AEQbTJ() {
        return new C59534zip();
    }

    private final C59534zip EZpvd() {
        return (C59534zip) this.EZpvd.getValue();
    }

    /* JADX INFO: renamed from: o.fod$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fod.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC18768fod.class));
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        RecyclerView recyclerView;
        C33537myN c33537myN;
        super.onCreate(bundle);
        this.AEQbTJ = (AbstractC16240egG) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.gEmmrt);
        C32866mlf.onEvent$default("Web3WalletSecure_WalletSecurity_Backup_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        AbstractC16240egG abstractC16240egG = this.AEQbTJ;
        if (abstractC16240egG != null && (c33537myN = abstractC16240egG.AEQbTJ) != null) {
            c33537myN.setTitleTypeface("harmony_sans_bold.ttf");
        }
        AbstractC16240egG abstractC16240egG2 = this.AEQbTJ;
        if (abstractC16240egG2 != null && (recyclerView = abstractC16240egG2.copydefault) != null) {
            recyclerView.setAdapter(EZpvd());
        }
        EZpvd().register(AbstractC12784ctX.class, new TaskDescription());
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        KWHzl();
    }

    private final void KWHzl() {
        C11607cUn.subscribeOnIO$default(C58156yvv.KWHzl(C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, 3, null), this), (Function1) null, new Function1() { // from class: o.foe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18768fod.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.fod$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public final class TaskDescription extends AbstractC43310rmq<AbstractC12784ctX, AbstractC16792eqc> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C13754dXa.TaskDescription.gGNlxh;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return dTV.isConnected;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC16792eqc> c43312rms, @NotNull final AbstractC12784ctX abstractC12784ctX) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
            super.onBindViewHolder((C43312rms) c43312rms, abstractC12784ctX);
            OKRegularCell oKRegularCell = ((AbstractC16792eqc) c43312rms.OLrzqt()).OLrzqt;
            oKRegularCell.setTitle(abstractC12784ctX.AuCTel());
            android.widget.TextView textViewEZpvd = oKRegularCell.EZpvd();
            textViewEZpvd.setSingleLine();
            textViewEZpvd.setEllipsize(TextUtils.TruncateAt.END);
            textViewEZpvd.setTextAppearance(C52761wXj.LoaderManager.DGOPHZ);
            android.widget.TextView textView = ((AbstractC16792eqc) c43312rms.OLrzqt()).KWHzl;
            if (abstractC12784ctX.AEQbTJ()) {
                textView.setText("");
                textView.setCompoundDrawablePadding(C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                textView.setCompoundDrawablesRelative(null, null, null, null);
            } else {
                textView.setText(textView.getContext().getString(C13754dXa.FragmentManager.getMetadata));
                textView.setCompoundDrawablePadding(C55298xhM.dpInt$default(4.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(C55298xhM.dp2pxFloat$default(6.0f, null, 1, null));
                gradientDrawable.setColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DQzvGN));
                gradientDrawable.setBounds(0, 0, C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null));
                textView.setCompoundDrawablesRelative(gradientDrawable, null, null, null);
                textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DQzvGN));
            }
            android.view.View view = c43312rms.itemView;
            final ActivityC18768fod activityC18768fod = ActivityC18768fod.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.fok
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    ActivityC18768fod.TaskDescription.OLrzqt(abstractC12784ctX, activityC18768fod, view2);
                }
            });
        }

        public static final void OLrzqt(AbstractC12784ctX abstractC12784ctX, ActivityC18768fod activityC18768fod, android.view.View view) {
            if (abstractC12784ctX.fJNWhG() == WalletType.KeyWallet) {
                eAL.Companion.AEQbTJ(activityC18768fod, abstractC12784ctX.EZpvd());
            } else {
                eAZ.Companion.copydefault(activityC18768fod, abstractC12784ctX.EZpvd());
            }
        }
    }

    public static final Unit KWHzl(ActivityC18768fod activityC18768fod, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) obj;
            if (abstractC12784ctX.fJNWhG() == WalletType.HDWallet || abstractC12784ctX.fJNWhG() == WalletType.KeyWallet || abstractC12784ctX.fJNWhG() == WalletType.TonWallet) {
                arrayList.add(obj);
            }
        }
        C33064mpR.OLrzqt(activityC18768fod.EZpvd(), arrayList);
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18768fod, true, (java.lang.String) null, 2, (java.lang.Object) null);
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

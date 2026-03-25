package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.debug.WalletDebugSettingType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC17154exT;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.exT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC17154exT extends AbstractActivityC33013moT {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public AbstractC16436ejr copydefault;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.exU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC17154exT.EZpvd();
        }
    });
    public final java.util.ArrayList<C17227eyn> EZpvd = new java.util.ArrayList<>();

    /* JADX INFO: renamed from: o.exT$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.exT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void AEQbTJ(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) ActivityC17154exT.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C59534zip EZpvd() {
        return new C59534zip();
    }

    private final C59534zip copydefault() {
        return (C59534zip) this.KWHzl.getValue();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC16436ejr abstractC16436ejr = (AbstractC16436ejr) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.QVsKAR);
        this.copydefault = abstractC16436ejr;
        AbstractC16436ejr abstractC16436ejr2 = null;
        if (abstractC16436ejr == null) {
            Intrinsics.gEmmrt("");
            abstractC16436ejr = null;
        }
        abstractC16436ejr.AEQbTJ.setTitle("MPC云备份诊断(wallet tools)");
        AbstractC16436ejr abstractC16436ejr3 = this.copydefault;
        if (abstractC16436ejr3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16436ejr2 = abstractC16436ejr3;
        }
        RecyclerView recyclerView = abstractC16436ejr2.KWHzl;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(copydefault());
        copydefault().register(C17227eyn.class, new Activity());
        KWHzl();
    }

    public final void KWHzl() {
        this.EZpvd.clear();
        C14392dkb c14392dkb = C14392dkb.AEQbTJ;
        if (c14392dkb.OLrzqt()) {
            InterfaceC14373dkI interfaceC14373dkIEZpvd = c14392dkb.EZpvd(this, 1);
            if (interfaceC14373dkIEZpvd != null) {
                copydefault(interfaceC14373dkIEZpvd);
                return;
            }
            return;
        }
        AbstractC16436ejr abstractC16436ejr = this.copydefault;
        if (abstractC16436ejr == null) {
            Intrinsics.gEmmrt("");
            abstractC16436ejr = null;
        }
        abstractC16436ejr.KWHzl.post(new java.lang.Runnable() { // from class: o.exW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC17154exT.copydefault(this.EZpvd);
            }
        });
    }

    public static final void copydefault(final ActivityC17154exT activityC17154exT) {
        C14571dnv c14571dnvOLrzqt = C14571dnv.Companion.OLrzqt();
        c14571dnvOLrzqt.AEQbTJ(new Function1() { // from class: o.exY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17154exT.EZpvd(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        });
        c14571dnvOLrzqt.show(activityC17154exT.getSupportFragmentManager(), "MPCIdListActivity");
    }

    public static final Unit EZpvd(ActivityC17154exT activityC17154exT, int i) {
        InterfaceC14373dkI interfaceC14373dkIEZpvd = C14392dkb.AEQbTJ.EZpvd(activityC17154exT, i);
        if (interfaceC14373dkIEZpvd != null) {
            activityC17154exT.copydefault(interfaceC14373dkIEZpvd);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(final InterfaceC14373dkI interfaceC14373dkI) {
        showLoadingAtOnceCannotCancel();
        interfaceC14373dkI.copydefault(this, new Function1() { // from class: o.exX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17154exT.OLrzqt(interfaceC14373dkI, this, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit OLrzqt(final InterfaceC14373dkI interfaceC14373dkI, final ActivityC17154exT activityC17154exT, boolean z) {
        AbstractC58260yxt<java.util.ArrayList<java.lang.String>> abstractC58260yxtOLrzqt = interfaceC14373dkI.OLrzqt().OLrzqt(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        AbstractC58260yxt abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(abstractC58260yxtOLrzqt, activityC17154exT, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.exS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17154exT.OLrzqt(this.KWHzl, (java.util.ArrayList) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.exR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17154exT.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.exZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17154exT.KWHzl(this.copydefault, interfaceC14373dkI, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eya
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17154exT.KWHzl(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC17154exT activityC17154exT, java.util.ArrayList arrayList) {
        activityC17154exT.EZpvd.clear();
        Intrinsics.copydefault(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            activityC17154exT.EZpvd.add(new C17227eyn(WalletDebugSettingType.MPC_CLOUD_BACKUP, str, str));
        }
        C33064mpR.OLrzqt(activityC17154exT.copydefault(), activityC17154exT.EZpvd);
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17154exT, true, (java.lang.String) null, 2, (java.lang.Object) null);
        activityC17154exT.dismissLoading();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ActivityC17154exT activityC17154exT, InterfaceC14373dkI interfaceC14373dkI, java.lang.Throwable th) {
        activityC17154exT.dismissLoading();
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17154exT, false, (java.lang.String) null, 2, (java.lang.Object) null);
        java.lang.String message = th.getMessage();
        if (message != null) {
            if (interfaceC14373dkI instanceof C14372dkH) {
                C55326xho.toast$default(C11572cTf.copydefault.EZpvd(message), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            } else {
                C55326xho.toast$default(C11580cTn.EZpvd.KWHzl(message), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.exT$Activity */
    public final class Activity extends AbstractC43310rmq<C17227eyn, AbstractC16921esz> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C13754dXa.TaskDescription.resume;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return dTV.isConnected;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC16921esz> c43312rms, @NotNull final C17227eyn c17227eyn) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c17227eyn, "");
            super.onBindViewHolder((C43312rms) c43312rms, c17227eyn);
            ((AbstractC16921esz) c43312rms.OLrzqt()).OLrzqt.setText(c17227eyn.copydefault());
            c43312rms.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.eye
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC17154exT.Activity.OLrzqt(c17227eyn, view);
                }
            });
        }

        public static final void OLrzqt(C17227eyn c17227eyn, android.view.View view) {
            C55326xho.toast$default(c17227eyn.copydefault(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
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
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

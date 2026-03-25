package o;

import android.animation.Animator;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C57032yak;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eDT extends AbstractActivityC33013moT implements C57032yak.Activity, InterfaceC57025yad, C57032yak.TaskDescription {
    public android.app.Dialog EZpvd;
    public AbstractC16369eid OLrzqt;
    public android.app.Dialog copydefault;
    public InterfaceC58217yxC valueOf;
    public final C59534zip KWHzl = new C59534zip();
    public final java.util.List<BluetoothDeviceModel> AEQbTJ = new java.util.ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C57032yak.TaskDescription
    public void OLrzqt(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        this.OLrzqt = (AbstractC16369eid) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.dvKsVJ);
        this.KWHzl.register(eFH.class, new eFV(C13754dXa.TaskDescription.aBDePw, new Function1() { // from class: o.eDU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eDT.KWHzl(this.OLrzqt, (BluetoothDeviceModel) obj);
            }
        }));
        AbstractC16369eid abstractC16369eid = this.OLrzqt;
        AbstractC16369eid abstractC16369eid2 = null;
        if (abstractC16369eid == null) {
            Intrinsics.gEmmrt("");
            abstractC16369eid = null;
        }
        abstractC16369eid.copydefault.setAdapter(this.KWHzl);
        AbstractC16369eid abstractC16369eid3 = this.OLrzqt;
        if (abstractC16369eid3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16369eid3 = null;
        }
        abstractC16369eid3.copydefault.setLayoutManager(new LinearLayoutManager(this, 1, false));
        AbstractC16369eid abstractC16369eid4 = this.OLrzqt;
        if (abstractC16369eid4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16369eid4 = null;
        }
        abstractC16369eid4.KWHzl.setAnimation(C13754dXa.Fragment.copydefault);
        AbstractC16369eid abstractC16369eid5 = this.OLrzqt;
        if (abstractC16369eid5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16369eid5 = null;
        }
        abstractC16369eid5.AEQbTJ.setAnimation(C13754dXa.Fragment.KWHzl);
        AbstractC16369eid abstractC16369eid6 = this.OLrzqt;
        if (abstractC16369eid6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16369eid6 = null;
        }
        abstractC16369eid6.KWHzl.playAnimation();
        AbstractC16369eid abstractC16369eid7 = this.OLrzqt;
        if (abstractC16369eid7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16369eid7 = null;
        }
        abstractC16369eid7.KWHzl.addAnimatorListener(new Activity());
        AbstractC16369eid abstractC16369eid8 = this.OLrzqt;
        if (abstractC16369eid8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16369eid2 = abstractC16369eid8;
        }
        abstractC16369eid2.AEQbTJ.addAnimatorListener(new TaskDescription());
        C57032yak c57032yak = C57032yak.AEQbTJ;
        c57032yak.copydefault((C57032yak.Activity) this);
        c57032yak.EZpvd(this);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eEd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eDT.values(this.OLrzqt);
            }
        });
    }

    public static final Unit KWHzl(eDT edt, BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        if (C57032yak.AEQbTJ.EZpvd(edt, bluetoothDeviceModel)) {
            ActivityC15318eDx.Companion.KWHzl(edt, bluetoothDeviceModel, false);
        } else {
            eDC.Companion.KWHzl(edt, bluetoothDeviceModel, true, false);
        }
        return Unit.INSTANCE;
    }

    public static final class Activity implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Activity() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            AbstractC16369eid abstractC16369eid = eDT.this.OLrzqt;
            AbstractC16369eid abstractC16369eid2 = null;
            if (abstractC16369eid == null) {
                Intrinsics.gEmmrt("");
                abstractC16369eid = null;
            }
            abstractC16369eid.KWHzl.setVisibility(4);
            AbstractC16369eid abstractC16369eid3 = eDT.this.OLrzqt;
            if (abstractC16369eid3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16369eid3 = null;
            }
            abstractC16369eid3.AEQbTJ.setVisibility(0);
            AbstractC16369eid abstractC16369eid4 = eDT.this.OLrzqt;
            if (abstractC16369eid4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16369eid4 = null;
            }
            abstractC16369eid4.AEQbTJ.setMaxFrame(191);
            AbstractC16369eid abstractC16369eid5 = eDT.this.OLrzqt;
            if (abstractC16369eid5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16369eid2 = abstractC16369eid5;
            }
            abstractC16369eid2.AEQbTJ.playAnimation();
        }
    }

    public static final class TaskDescription implements Animator.AnimatorListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public TaskDescription() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            AbstractC16369eid abstractC16369eid = eDT.this.OLrzqt;
            AbstractC16369eid abstractC16369eid2 = null;
            if (abstractC16369eid == null) {
                Intrinsics.gEmmrt("");
                abstractC16369eid = null;
            }
            abstractC16369eid.AEQbTJ.removeAnimatorListener(this);
            AbstractC16369eid abstractC16369eid3 = eDT.this.OLrzqt;
            if (abstractC16369eid3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16369eid3 = null;
            }
            abstractC16369eid3.AEQbTJ.setMinAndMaxFrame(69, 191);
            AbstractC16369eid abstractC16369eid4 = eDT.this.OLrzqt;
            if (abstractC16369eid4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16369eid4 = null;
            }
            abstractC16369eid4.AEQbTJ.setRepeatCount(-1);
            AbstractC16369eid abstractC16369eid5 = eDT.this.OLrzqt;
            if (abstractC16369eid5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16369eid2 = abstractC16369eid5;
            }
            abstractC16369eid2.AEQbTJ.playAnimation();
        }
    }

    public static final void values(eDT edt) {
        rVN.reportFullyDrawn$default((android.app.Activity) edt, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C57032yak c57032yak = C57032yak.AEQbTJ;
        c57032yak.OLrzqt(this);
        c57032yak.KWHzl(this);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C57032yak.AEQbTJ.copydefault((InterfaceC57025yad) this);
        if (this.copydefault == null) {
            C57026yae.copydefault.AEQbTJ(this, new Function0() { // from class: o.eDY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eDT.AkhnZx(this.KWHzl);
                }
            }, new Function0() { // from class: o.eDW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eDT.DbNXlk(this.KWHzl);
                }
            });
        }
    }

    public static final Unit AkhnZx(eDT edt) {
        android.app.Dialog dialog = edt.EZpvd;
        if (dialog != null) {
            dialog.dismiss();
        }
        edt.EZpvd = null;
        edt.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(final eDT edt) {
        if (edt.EZpvd != null) {
            return Unit.INSTANCE;
        }
        edt.EZpvd = eCM.KWHzl.copydefault(edt, new Function0() { // from class: o.eDS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eDT.fetchVPNInfo(this.OLrzqt);
            }
        }, new Function0() { // from class: o.eDP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eDT.isConnected(this.OLrzqt);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(eDT edt) {
        edt.EZpvd = null;
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(eDT edt) {
        edt.EZpvd = null;
        edt.finish();
        return Unit.INSTANCE;
    }

    private final void copydefault() {
        C57026yae.copydefault.OLrzqt(this, new Function0() { // from class: o.eDR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eDT.ejfBZ(this.EZpvd);
            }
        }, new Function0() { // from class: o.eDX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eDT.fARcdN(this.AEQbTJ);
            }
        });
    }

    public static final Unit ejfBZ(eDT edt) {
        edt.AEQbTJ(12);
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(eDT edt) {
        edt.EZpvd();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C57032yak c57032yak = C57032yak.AEQbTJ;
        c57032yak.AYXKKw();
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        c57032yak.AEQbTJ(this);
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.AEQbTJ.clear();
        this.KWHzl.setItems(yDY.AhwBna());
        this.KWHzl.notifyDataSetChanged();
        AbstractC16369eid abstractC16369eid = this.OLrzqt;
        if (abstractC16369eid == null) {
            Intrinsics.gEmmrt("");
            abstractC16369eid = null;
        }
        abstractC16369eid.EZpvd.setVisibility(4);
    }

    public static final void EZpvd(eDT edt, java.lang.Long l) {
        if (edt.AEQbTJ.isEmpty()) {
            eDA.Companion.copydefault(edt, 3, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, false);
        }
    }

    @Override // o.InterfaceC57025yad
    public void AEQbTJ(int i) {
        if (i == 11) {
            android.app.Dialog dialog = this.copydefault;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.copydefault = null;
            return;
        }
        if (i == 12) {
            android.app.Dialog dialog2 = this.copydefault;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            this.copydefault = null;
            C57032yak.AEQbTJ.AhwBna();
            InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            this.valueOf = AbstractC58260yxt.copydefault(1L, java.util.concurrent.TimeUnit.MINUTES).copydefault(new InterfaceC58227yxM() { // from class: o.eDV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    eDT.EZpvd(this.OLrzqt, (java.lang.Long) obj);
                }
            });
            return;
        }
        EZpvd();
    }

    private final void EZpvd() {
        if (this.copydefault == null) {
            C57032yak.AEQbTJ.AYXKKw();
            InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            this.AEQbTJ.clear();
            this.KWHzl.setItems(yDY.AhwBna());
            this.KWHzl.notifyDataSetChanged();
            AbstractC16369eid abstractC16369eid = this.OLrzqt;
            if (abstractC16369eid == null) {
                Intrinsics.gEmmrt("");
                abstractC16369eid = null;
            }
            abstractC16369eid.EZpvd.setVisibility(4);
            this.copydefault = eCM.KWHzl.OLrzqt(this, new Function0() { // from class: o.eEc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eDT.fIwbmz(this.EZpvd);
                }
            }, new Function0() { // from class: o.eDQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eDT.fJNWhG(this.EZpvd);
                }
            });
        }
    }

    public static final Unit fIwbmz(eDT edt) {
        edt.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(eDT edt) {
        edt.copydefault = null;
        edt.finish();
        return Unit.INSTANCE;
    }

    @Override // o.C57032yak.Activity
    public void KWHzl(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        if (this.AEQbTJ.contains(bluetoothDeviceModel)) {
            return;
        }
        this.AEQbTJ.add(bluetoothDeviceModel);
        C59534zip c59534zip = this.KWHzl;
        java.util.List<BluetoothDeviceModel> list = this.AEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (BluetoothDeviceModel bluetoothDeviceModel2 : list) {
            arrayList.add(new eFH(bluetoothDeviceModel, false));
        }
        c59534zip.setItems(arrayList);
        this.KWHzl.notifyItemInserted(this.AEQbTJ.size() - 1);
        AbstractC16369eid abstractC16369eid = this.OLrzqt;
        if (abstractC16369eid == null) {
            Intrinsics.gEmmrt("");
            abstractC16369eid = null;
        }
        abstractC16369eid.EZpvd.setVisibility(0);
    }

    @Override // o.C57032yak.TaskDescription
    public void copydefault(@NotNull InterfaceC57036yao interfaceC57036yao) {
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
        setResult(-1);
        finish();
    }

    @Override // o.C57032yak.TaskDescription
    public void EZpvd(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        C13992dcz.AEQbTJ.EZpvd(bluetoothDeviceModel);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

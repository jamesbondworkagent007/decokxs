package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C57032yak;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eDh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC15302eDh extends AbstractActivityC33013moT implements C57032yak.TaskDescription {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public android.app.Dialog AEQbTJ;
    public InterfaceC58217yxC KWHzl;
    public final C59534zip OLrzqt = new C59534zip();
    public C16375eij copydefault;
    public android.app.Dialog djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C57032yak.TaskDescription
    public void OLrzqt(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
    }

    /* JADX INFO: renamed from: o.eDh$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eDh.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC15302eDh.class));
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C16375eij c16375eijCopydefault = C16375eij.copydefault(getLayoutInflater());
        this.copydefault = c16375eijCopydefault;
        C16375eij c16375eij = null;
        if (c16375eijCopydefault == null) {
            Intrinsics.gEmmrt("");
            c16375eijCopydefault = null;
        }
        setContentView(c16375eijCopydefault.getRoot());
        C16375eij c16375eij2 = this.copydefault;
        if (c16375eij2 == null) {
            Intrinsics.gEmmrt("");
            c16375eij2 = null;
        }
        c16375eij2.KWHzl.setTitleTypeface("harmony_sans_bold.ttf");
        C16375eij c16375eij3 = this.copydefault;
        if (c16375eij3 == null) {
            Intrinsics.gEmmrt("");
            c16375eij3 = null;
        }
        c16375eij3.OLrzqt.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.OLrzqt.register(java.lang.String.class, new C15378eGc());
        this.OLrzqt.register(eFH.class, new eFV(C13754dXa.TaskDescription.aBDePw, new Function1() { // from class: o.eDw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15302eDh.AYXKKw(this.AEQbTJ, (BluetoothDeviceModel) obj);
            }
        }));
        this.OLrzqt.setItems(KWHzl());
        C16375eij c16375eij4 = this.copydefault;
        if (c16375eij4 == null) {
            Intrinsics.gEmmrt("");
            c16375eij4 = null;
        }
        c16375eij4.OLrzqt.setAdapter(this.OLrzqt);
        C16375eij c16375eij5 = this.copydefault;
        if (c16375eij5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16375eij = c16375eij5;
        }
        C52794wYp c52794wYp = c16375eij.AEQbTJ;
        c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendSessionDestroyed));
        C8003auW.copydefault(c52794wYp).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.eDv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC15302eDh.OLrzqt(this.KWHzl, obj);
            }
        });
        C57032yak.AEQbTJ.EZpvd(this);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eDk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC15302eDh.AhwBna(this.KWHzl);
            }
        });
    }

    public static final Unit AYXKKw(final ActivityC15302eDh activityC15302eDh, final BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        C57032yak c57032yak = C57032yak.AEQbTJ;
        if (c57032yak.copydefault()) {
            activityC15302eDh.AEQbTJ(bluetoothDeviceModel);
        } else {
            InterfaceC58217yxC interfaceC58217yxC = activityC15302eDh.KWHzl;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            activityC15302eDh.showLoading();
            AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtKWHzl = c57032yak.KWHzl();
            final Function1 function1 = new Function1() { // from class: o.eDs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC15302eDh.copydefault(this.copydefault, bluetoothDeviceModel, (java.lang.Boolean) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eDr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC15302eDh.EZpvd(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.eDu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC15302eDh.KWHzl(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eDq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC15302eDh.AEQbTJ(function12, obj);
                }
            });
            activityC15302eDh.KWHzl = interfaceC58217yxCAEQbTJ;
            activityC15302eDh.addDisposable(interfaceC58217yxCAEQbTJ);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC15302eDh activityC15302eDh, BluetoothDeviceModel bluetoothDeviceModel, java.lang.Boolean bool) {
        activityC15302eDh.dismissLoading();
        if (bool.booleanValue()) {
            activityC15302eDh.AEQbTJ(bluetoothDeviceModel);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ActivityC15302eDh activityC15302eDh, java.lang.Throwable th) {
        activityC15302eDh.dismissLoading();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ActivityC15302eDh activityC15302eDh, java.lang.Object obj) {
        activityC15302eDh.startActivity(new android.content.Intent(activityC15302eDh, (java.lang.Class<?>) eDT.class));
    }

    public static final void AhwBna(ActivityC15302eDh activityC15302eDh) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC15302eDh, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final java.util.List<java.lang.Object> KWHzl() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList<BluetoothDeviceModel> arrayListCopydefault = C13992dcz.AEQbTJ.copydefault();
        InterfaceC57036yao interfaceC57036yaoAEQbTJ = C57032yak.AEQbTJ.AEQbTJ();
        BluetoothDeviceModel bluetoothDeviceModelOLrzqt = interfaceC57036yaoAEQbTJ != null ? interfaceC57036yaoAEQbTJ.OLrzqt() : null;
        if (bluetoothDeviceModelOLrzqt != null && arrayListCopydefault.remove(bluetoothDeviceModelOLrzqt)) {
            arrayList.add(C33070mpX.AYXKKw(C13754dXa.FragmentManager.PlaybackStateCompat));
            arrayList.add(new eFH(bluetoothDeviceModelOLrzqt, true));
        }
        if (!arrayListCopydefault.isEmpty()) {
            arrayList.add(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fromPlaybackState));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListCopydefault, 10));
            java.util.Iterator<T> it = arrayListCopydefault.iterator();
            while (it.hasNext()) {
                arrayList2.add(new eFH((BluetoothDeviceModel) it.next(), false));
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public final void AEQbTJ(final BluetoothDeviceModel bluetoothDeviceModel) {
        C57026yae.copydefault.AEQbTJ(this, new Function0() { // from class: o.eDl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC15302eDh.valueOf(this.copydefault, bluetoothDeviceModel);
            }
        }, new Function0() { // from class: o.eDm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC15302eDh.djBIcL(this.KWHzl);
            }
        });
    }

    public static final Unit valueOf(final ActivityC15302eDh activityC15302eDh, final BluetoothDeviceModel bluetoothDeviceModel) {
        android.app.Dialog dialog = activityC15302eDh.djBIcL;
        if (dialog != null) {
            dialog.dismiss();
        }
        activityC15302eDh.djBIcL = null;
        C57026yae.copydefault.OLrzqt(activityC15302eDh, new Function0() { // from class: o.eDj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC15302eDh.gEmmrt(this.AEQbTJ, bluetoothDeviceModel);
            }
        }, new Function0() { // from class: o.eDi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC15302eDh.djBIcL(this.KWHzl, bluetoothDeviceModel);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(ActivityC15302eDh activityC15302eDh, BluetoothDeviceModel bluetoothDeviceModel) {
        activityC15302eDh.copydefault(bluetoothDeviceModel);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(ActivityC15302eDh activityC15302eDh, BluetoothDeviceModel bluetoothDeviceModel) {
        activityC15302eDh.KWHzl(bluetoothDeviceModel);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(final ActivityC15302eDh activityC15302eDh) {
        if (activityC15302eDh.djBIcL != null) {
            return Unit.INSTANCE;
        }
        activityC15302eDh.djBIcL = eCM.KWHzl.copydefault(activityC15302eDh, new Function0() { // from class: o.eDo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC15302eDh.valueOf(this.EZpvd);
            }
        }, new Function0() { // from class: o.eDn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC15302eDh.AYXKKw(this.copydefault);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ActivityC15302eDh activityC15302eDh) {
        activityC15302eDh.djBIcL = null;
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(ActivityC15302eDh activityC15302eDh) {
        activityC15302eDh.djBIcL = null;
        return Unit.INSTANCE;
    }

    public final void copydefault(BluetoothDeviceModel bluetoothDeviceModel) {
        C57032yak c57032yak = C57032yak.AEQbTJ;
        InterfaceC57036yao interfaceC57036yaoAEQbTJ = c57032yak.AEQbTJ();
        if (Intrinsics.EZpvd(interfaceC57036yaoAEQbTJ != null ? interfaceC57036yaoAEQbTJ.OLrzqt() : null, bluetoothDeviceModel)) {
            c57032yak.OLrzqt(bluetoothDeviceModel);
        } else if (c57032yak.EZpvd(this, bluetoothDeviceModel)) {
            startActivity(new android.content.Intent(this, (java.lang.Class<?>) eDT.class));
        } else {
            eDC.Companion.KWHzl(this, bluetoothDeviceModel, true, false);
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C57032yak.AEQbTJ.KWHzl(this);
    }

    public final void KWHzl(final BluetoothDeviceModel bluetoothDeviceModel) {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = eCM.KWHzl.OLrzqt(this, new Function0() { // from class: o.eDg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC15302eDh.values(this.AEQbTJ, bluetoothDeviceModel);
                }
            }, new Function0() { // from class: o.eDp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC15302eDh.AkhnZx(this.AEQbTJ);
                }
            });
        }
    }

    public static final Unit values(final ActivityC15302eDh activityC15302eDh, final BluetoothDeviceModel bluetoothDeviceModel) {
        C57026yae.copydefault.OLrzqt(activityC15302eDh, new Function0() { // from class: o.eDt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC15302eDh.AkhnZx(this.AEQbTJ, bluetoothDeviceModel);
            }
        }, new Function0() { // from class: o.eDy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC15302eDh.isConnected(this.OLrzqt);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(ActivityC15302eDh activityC15302eDh, BluetoothDeviceModel bluetoothDeviceModel) {
        activityC15302eDh.AEQbTJ = null;
        activityC15302eDh.copydefault(bluetoothDeviceModel);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(ActivityC15302eDh activityC15302eDh) {
        activityC15302eDh.AEQbTJ = null;
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(ActivityC15302eDh activityC15302eDh) {
        activityC15302eDh.AEQbTJ = null;
        return Unit.INSTANCE;
    }

    @Override // o.C57032yak.TaskDescription
    public void copydefault(@NotNull InterfaceC57036yao interfaceC57036yao) {
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
        finish();
    }

    @Override // o.C57032yak.TaskDescription
    public void EZpvd(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        C13992dcz.AEQbTJ.EZpvd(bluetoothDeviceModel);
        C33064mpR.OLrzqt(this.OLrzqt, (java.util.List<? extends java.lang.Object>) KWHzl());
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

package o;

import androidx.core.content.ContextCompat;
import com.google.android.exoplayer2.util.MimeTypes;
import com.okinc.business.defi.wallet.hardware.bean.HardWareConnectGuide;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.C57032yak;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eEY extends eCI implements C57032yak.TaskDescription {
    public android.app.Dialog AhwBna;
    public InterfaceC58217yxC KWHzl;
    public boolean djBIcL;
    public android.app.Dialog valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public int gEmmrt = 1;
    public java.lang.String OLrzqt = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C57032yak.TaskDescription
    public void OLrzqt(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eEY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ void startActivity$default(StateListAnimator stateListAnimator, android.content.Context context, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                i = 1;
            }
            if ((i2 & 4) != 0) {
                str = "";
            }
            stateListAnimator.copydefault(context, i, str);
        }

        public final void copydefault(@NotNull android.content.Context context, int i, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) eEY.class);
            intent.putExtra(OtcExtraKeys.MODE, i);
            intent.putExtra("from", str);
            context.startActivity(intent);
        }
    }

    private final void AYXKKw() {
        android.content.Intent intent = getIntent();
        if (intent != null && intent.hasExtra(OtcExtraKeys.MODE)) {
            android.content.Intent intent2 = getIntent();
            this.gEmmrt = intent2 != null ? intent2.getIntExtra(OtcExtraKeys.MODE, 1) : 1;
        }
        android.content.Intent intent3 = getIntent();
        if (intent3 == null || !intent3.hasExtra("from")) {
            return;
        }
        android.content.Intent intent4 = getIntent();
        java.lang.String stringExtra = intent4 != null ? intent4.getStringExtra("from") : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.OLrzqt = stringExtra;
    }

    @Override // o.eCI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AYXKKw();
        if (!((InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class)).copydefault()) {
            C55326xho.toast$default(C13754dXa.FragmentManager.MediaSessionCompatApi24, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            finish();
        } else {
            C57032yak.AEQbTJ.EZpvd(this);
        }
    }

    @Override // o.eCI
    public void copydefault(@NotNull eFL efl) {
        Intrinsics.checkNotNullParameter(efl, "");
        pUU.copydefault("Ledger", "connect");
        C57032yak c57032yak = C57032yak.AEQbTJ;
        if (c57032yak.copydefault()) {
            EZpvd();
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        showLoading();
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtKWHzl = c57032yak.KWHzl();
        final Function1 function1 = new Function1() { // from class: o.eFj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eEY.copydefault(this.KWHzl, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eFk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eEY.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eFi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eEY.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eFp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eEY.valueOf(function12, obj);
            }
        });
        this.KWHzl = interfaceC58217yxCAEQbTJ;
        addDisposable(interfaceC58217yxCAEQbTJ);
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(eEY eey, java.lang.Boolean bool) {
        eey.dismissLoading();
        pUU.copydefault("Ledger", "downloadResult " + bool);
        if (bool.booleanValue()) {
            eey.EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(eEY eey, java.lang.Throwable th) {
        pUU.copydefault("Ledger", "downloadResult " + th.getMessage());
        eey.dismissLoading();
        return Unit.INSTANCE;
    }

    @Override // o.eCI
    public eFN KWHzl() {
        return new eFN("images/web3_wallet/ledger_introduction.png", C33069mpW.copydefault(C13754dXa.FragmentManager.DTeKQX, C56423yEv.EZpvd(C56390yDp.OLrzqt("hardwarename", C33070mpX.AYXKKw(C13754dXa.FragmentManager.sbu)))), false, yDY.AhwBna(new eFL(C13754dXa.Activity.gGvvIC, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getCustomAction), null, 4, null)));
    }

    public final void EZpvd() {
        C57026yae.copydefault.AEQbTJ(this, new Function0() { // from class: o.eFb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eEY.djBIcL(this.KWHzl);
            }
        }, new Function0() { // from class: o.eEZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eEY.values(this.OLrzqt);
            }
        });
    }

    public static final Unit djBIcL(eEY eey) {
        android.app.Dialog dialog = eey.valueOf;
        if (dialog != null) {
            dialog.dismiss();
        }
        eey.valueOf = null;
        eey.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit values(final eEY eey) {
        if (eey.valueOf != null) {
            return Unit.INSTANCE;
        }
        eey.valueOf = eCM.KWHzl.copydefault(eey, new Function0() { // from class: o.eFd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eEY.isConnected(this.OLrzqt);
            }
        }, new Function0() { // from class: o.eFc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eEY.AkhnZx(this.KWHzl);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(eEY eey) {
        eey.valueOf = null;
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(eEY eey) {
        eey.valueOf = null;
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        C57026yae.copydefault.OLrzqt(this, new Function0() { // from class: o.eFm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eEY.DbNXlk(this.OLrzqt);
            }
        }, new Function0() { // from class: o.eFq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eEY.ejfBZ(this.KWHzl);
            }
        });
    }

    public static final Unit DbNXlk(eEY eey) {
        android.app.Dialog dialog = eey.AhwBna;
        if (dialog != null) {
            dialog.dismiss();
        }
        eey.AhwBna = null;
        eey.gEmmrt();
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(eEY eey) {
        eey.djBIcL();
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        if (this.AhwBna == null) {
            this.AhwBna = eCM.KWHzl.OLrzqt(this, new Function0() { // from class: o.eFh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eEY.AuCTel(this.EZpvd);
                }
            }, new Function0() { // from class: o.eFl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eEY.fJNWhG(this.KWHzl);
                }
            });
        }
    }

    public static final Unit AuCTel(eEY eey) {
        eey.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(eEY eey) {
        eey.AhwBna = null;
        return Unit.INSTANCE;
    }

    private final java.util.ArrayList<HardWareConnectGuide> valueOf() {
        java.lang.Boolean bool = null;
        java.lang.CharSequence charSequence = C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C13754dXa.FragmentManager.PlaybackStateCompat1, C56423yEv.EZpvd(C56390yDp.OLrzqt("seedphrase", C33070mpX.AYXKKw(C13754dXa.FragmentManager.setBufferedPosition)))), new java.lang.String[]{C33070mpX.AYXKKw(C13754dXa.FragmentManager.setBufferedPosition)}, 0, null, false, new Function1() { // from class: o.eFf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eEY.AEQbTJ(this.copydefault, (java.util.List) obj);
            }
        }, 14, null);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.toBundle);
        java.lang.Float fValueOf = java.lang.Float.valueOf(20.0f);
        int i = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        return yDY.copydefault(new HardWareConnectGuide("images/web3_wallet/ledger_guide1.png", charSequence, strAYXKKw, (java.lang.Boolean) null, fValueOf, "1:1", 8, (DefaultConstructorMarker) null), new HardWareConnectGuide("images/web3_wallet/ledger_guide2.png", C33070mpX.AYXKKw(C13754dXa.FragmentManager.getActions), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatToken1), bool, fValueOf, "1:1", i, (DefaultConstructorMarker) null), new HardWareConnectGuide("images/web3_wallet/ledger_guide3.png", C33070mpX.AYXKKw(C13754dXa.FragmentManager.setErrorMessage), C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatApi21CallbackProxy), bool, fValueOf, "1:1", i, defaultConstructorMarker), new HardWareConnectGuide("images/web3_wallet/ledger_guide4.png", C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C13754dXa.FragmentManager.ParcelableVolumeInfo, C56423yEv.EZpvd(C56390yDp.OLrzqt(MimeTypes.BASE_TYPE_APPLICATION, C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatApi24CallbackProxy)))), new java.lang.String[]{C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatApi24CallbackProxy)}, 0, null, false, new Function1() { // from class: o.eFg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eEY.EZpvd(this.EZpvd, (java.util.List) obj);
            }
        }, 14, null), C33070mpX.AYXKKw(C13754dXa.FragmentManager.equals), bool, fValueOf, "1:1", i, defaultConstructorMarker));
    }

    public static final Unit AEQbTJ(eEY eey, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(eey, C52761wXj.Activity.GiPPlLRPuVlr)));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(eEY eey, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(eey, C13754dXa.StateListAnimator.OLrzqt)));
        return Unit.INSTANCE;
    }

    private final void gEmmrt() {
        C13992dcz c13992dcz = C13992dcz.AEQbTJ;
        if (c13992dcz.AYXKKw()) {
            c13992dcz.EZpvd();
            eEB eebEZpvd = eEB.Companion.EZpvd(valueOf());
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            eebEZpvd.AEQbTJ(supportFragmentManager, new Function0() { // from class: o.eFe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eEY.fetchVPNInfo(this.OLrzqt);
                }
            });
            return;
        }
        if (c13992dcz.OLrzqt()) {
            startActivity(new android.content.Intent(this, (java.lang.Class<?>) ActivityC15302eDh.class));
        } else {
            startActivity(new android.content.Intent(this, (java.lang.Class<?>) eDT.class));
        }
    }

    public static final Unit fetchVPNInfo(eEY eey) {
        eey.startActivity(new android.content.Intent(eey, (java.lang.Class<?>) eDT.class));
        return Unit.INSTANCE;
    }

    @Override // o.eCI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.djBIcL) {
            pUU.OLrzqt(">>>ledger HardwareWalletSelectNetworkActivity.startActivity mode:" + this.gEmmrt + " - from:" + this.OLrzqt);
            ActivityC15363eFo.Companion.KWHzl(this, this.gEmmrt, this.OLrzqt);
            finish();
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C57032yak.AEQbTJ.KWHzl(this);
    }

    @Override // o.C57032yak.TaskDescription
    public void copydefault(@NotNull InterfaceC57036yao interfaceC57036yao) {
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
        this.djBIcL = true;
        pUU.OLrzqt(">>>ledger HardwareWalletSelectNetworkActivity onDeviceConnected");
    }

    @Override // o.C57032yak.TaskDescription
    public void EZpvd(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        C13992dcz.AEQbTJ.EZpvd(bluetoothDeviceModel);
        this.djBIcL = false;
    }

    @Override // o.eCI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.eCI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.eCI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

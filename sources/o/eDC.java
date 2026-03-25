package o;

import android.animation.Animator;
import androidx.databinding.DataBindingUtil;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C32113mPz;
import o.C52761wXj;
import o.C57032yak;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eDC extends AbstractActivityC33013moT implements InterfaceC57025yad, C57032yak.TaskDescription {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public BluetoothDeviceModel EZpvd;
    public AbstractC16373eih KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov, o.InterfaceC33019moZ
    public boolean animOpen() {
        return !this.AEQbTJ;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eDC.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void KWHzl(@NotNull android.app.Activity activity, @NotNull BluetoothDeviceModel bluetoothDeviceModel, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) eDC.class);
            intent.putExtra("bluetoothDeviceModel", bluetoothDeviceModel);
            intent.putExtra("connect", z);
            intent.putExtra("startFromDialog", z2);
            activity.startActivity(intent);
            if (z2) {
                activity.overridePendingTransition(com.google.android.material.R.anim.design_bottom_sheet_slide_in, C52761wXj.Application.fetchVPNInfo);
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        if (this.AEQbTJ) {
            overridePendingTransition(C52761wXj.Application.fetchVPNInfo, com.google.android.material.R.anim.design_bottom_sheet_slide_out);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.AEQbTJ = getIntent().getBooleanExtra("startFromDialog", false);
        super.onCreate(bundle);
        this.KWHzl = (AbstractC16373eih) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.dxcTrN);
        BluetoothDeviceModel bluetoothDeviceModel = (BluetoothDeviceModel) getIntent().getParcelableExtra("bluetoothDeviceModel");
        if (bluetoothDeviceModel == null) {
            return;
        }
        this.EZpvd = bluetoothDeviceModel;
        AbstractC16373eih abstractC16373eih = null;
        BluetoothDeviceModel bluetoothDeviceModel2 = null;
        if (this.AEQbTJ) {
            AbstractC16373eih abstractC16373eih2 = this.KWHzl;
            if (abstractC16373eih2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16373eih2 = null;
            }
            abstractC16373eih2.KWHzl.setBackImage(C32113mPz.TaskDescription.copydefault);
        }
        AbstractC16373eih abstractC16373eih3 = this.KWHzl;
        if (abstractC16373eih3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16373eih3 = null;
        }
        android.widget.TextView textView = abstractC16373eih3.copydefault;
        BluetoothDeviceModel bluetoothDeviceModel3 = this.EZpvd;
        if (bluetoothDeviceModel3 == null) {
            Intrinsics.gEmmrt("");
            bluetoothDeviceModel3 = null;
        }
        java.lang.String name = bluetoothDeviceModel3.getName();
        if (name == null) {
            name = "";
        }
        textView.setText(name + " " + C33070mpX.AYXKKw(C13754dXa.FragmentManager.getBufferedPosition));
        AbstractC16373eih abstractC16373eih4 = this.KWHzl;
        if (abstractC16373eih4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16373eih4 = null;
        }
        abstractC16373eih4.EZpvd.setAnimation(C13754dXa.Fragment.AhwBna);
        AbstractC16373eih abstractC16373eih5 = this.KWHzl;
        if (abstractC16373eih5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16373eih5 = null;
        }
        abstractC16373eih5.AEQbTJ.setAnimation(C13754dXa.Fragment.gEmmrt);
        AbstractC16373eih abstractC16373eih6 = this.KWHzl;
        if (abstractC16373eih6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16373eih6 = null;
        }
        abstractC16373eih6.EZpvd.playAnimation();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eDE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eDC.AEQbTJ(this.EZpvd);
            }
        });
        if (!getIntent().getBooleanExtra("connect", false)) {
            AbstractC16373eih abstractC16373eih7 = this.KWHzl;
            if (abstractC16373eih7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16373eih = abstractC16373eih7;
            }
            abstractC16373eih.EZpvd.addAnimatorListener(new TaskDescription());
            return;
        }
        AbstractC16373eih abstractC16373eih8 = this.KWHzl;
        if (abstractC16373eih8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16373eih8 = null;
        }
        abstractC16373eih8.EZpvd.setRepeatCount(-1);
        if (!C57026yae.copydefault.EZpvd(this)) {
            eDA.Companion.copydefault(this, 2, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, this.AEQbTJ);
            finish();
            return;
        }
        C57032yak c57032yak = C57032yak.AEQbTJ;
        c57032yak.EZpvd(this);
        c57032yak.copydefault(this);
        BluetoothDeviceModel bluetoothDeviceModel4 = this.EZpvd;
        if (bluetoothDeviceModel4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            bluetoothDeviceModel2 = bluetoothDeviceModel4;
        }
        c57032yak.OLrzqt(bluetoothDeviceModel2);
    }

    public static final void AEQbTJ(eDC edc) {
        rVN.reportFullyDrawn$default((android.app.Activity) edc, true, (java.lang.String) null, 2, (java.lang.Object) null);
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
            eDC.this.AEQbTJ();
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C57032yak c57032yak = C57032yak.AEQbTJ;
        c57032yak.KWHzl(this);
        c57032yak.AEQbTJ(this);
    }

    @Override // o.InterfaceC57025yad
    public void AEQbTJ(int i) {
        if (isFinishing() || i == 11) {
            return;
        }
        eDA.Companion.copydefault(this, 2, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, false);
        finish();
    }

    @Override // o.C57032yak.TaskDescription
    public void copydefault(@NotNull InterfaceC57036yao interfaceC57036yao) {
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
        C13992dcz.AEQbTJ.OLrzqt(interfaceC57036yao.OLrzqt());
        if (isFinishing()) {
            return;
        }
        AbstractC16373eih abstractC16373eih = this.KWHzl;
        if (abstractC16373eih == null) {
            Intrinsics.gEmmrt("");
            abstractC16373eih = null;
        }
        abstractC16373eih.EZpvd.cancelAnimation();
        AEQbTJ();
    }

    public final void AEQbTJ() {
        AbstractC16373eih abstractC16373eih = this.KWHzl;
        AbstractC16373eih abstractC16373eih2 = null;
        if (abstractC16373eih == null) {
            Intrinsics.gEmmrt("");
            abstractC16373eih = null;
        }
        abstractC16373eih.EZpvd.setVisibility(4);
        AbstractC16373eih abstractC16373eih3 = this.KWHzl;
        if (abstractC16373eih3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16373eih3 = null;
        }
        abstractC16373eih3.AEQbTJ.setVisibility(0);
        AbstractC16373eih abstractC16373eih4 = this.KWHzl;
        if (abstractC16373eih4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16373eih4 = null;
        }
        abstractC16373eih4.AEQbTJ.playAnimation();
        AbstractC16373eih abstractC16373eih5 = this.KWHzl;
        if (abstractC16373eih5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16373eih5 = null;
        }
        android.widget.TextView textView = abstractC16373eih5.copydefault;
        BluetoothDeviceModel bluetoothDeviceModel = this.EZpvd;
        if (bluetoothDeviceModel == null) {
            Intrinsics.gEmmrt("");
            bluetoothDeviceModel = null;
        }
        textView.setText(bluetoothDeviceModel.getName() + " " + C33070mpX.AYXKKw(C13754dXa.FragmentManager.toKeyCode));
        AbstractC16373eih abstractC16373eih6 = this.KWHzl;
        if (abstractC16373eih6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16373eih6 = null;
        }
        abstractC16373eih6.AEQbTJ.addAnimatorListener(new Activity());
        AbstractC16373eih abstractC16373eih7 = this.KWHzl;
        if (abstractC16373eih7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16373eih2 = abstractC16373eih7;
        }
        abstractC16373eih2.AEQbTJ.playAnimation();
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
            eDC.this.finish();
        }
    }

    @Override // o.C57032yak.TaskDescription
    public void OLrzqt(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        if (isFinishing()) {
            return;
        }
        eDA.Companion.copydefault(this, 4, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, false);
        finish();
    }

    @Override // o.C57032yak.TaskDescription
    public void EZpvd(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        if (isFinishing()) {
            return;
        }
        eDA.Companion.copydefault(this, 4, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, false);
        finish();
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

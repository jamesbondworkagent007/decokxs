package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.IntervalMode;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C14638dpI;
import o.C20422ggb;
import o.C52761wXj;
import o.fXY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ggb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20422ggb extends AbstractC32996moC {
    public InterfaceC58217yxC AEQbTJ;
    public fXM<?> AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public AbstractC16631ena EZpvd;
    public C14638dpI KWHzl;
    public final ActivityResultLauncher<android.content.Intent> OLrzqt;
    public InterfaceC58217yxC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.DQzvGNdrmXxu;
    }

    public C20422ggb() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.ggc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C20422ggb.EZpvd(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.OLrzqt = activityResultLauncherRegisterForActivityResult;
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.ggd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20422ggb.DbNXlk(this.EZpvd);
            }
        });
    }

    public static final void EZpvd(C20422ggb c20422ggb, ActivityResult activityResult) {
        FragmentActivity activity;
        if (activityResult.getResultCode() != -1 || (activity = c20422ggb.getActivity()) == null) {
            return;
        }
        activity.setResult(activityResult.getResultCode(), activityResult.getData());
        activity.finish();
    }

    /* JADX INFO: renamed from: o.ggb$FragmentManager */
    public static final class FragmentManager implements OKWBaseMultiTransfer.Application {
        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.Application
        public void AEQbTJ() {
        }

        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.Application
        public void KWHzl() {
        }

        public FragmentManager() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: SignData */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.Application
        public void KWHzl(int i) {
            MultiTransferSignData multiTransferSignData;
            if (i == 1) {
                OKWBaseMultiTransfer oKWBaseMultiTransferValueOf = C20422ggb.this.valueOf();
                if (((oKWBaseMultiTransferValueOf == null || (multiTransferSignData = (MultiTransferSignData) oKWBaseMultiTransferValueOf.QVsKAR()) == null) ? null : multiTransferSignData.getIntervalMode()) == IntervalMode.NONE) {
                    C20422ggb.this.AhwBna();
                } else {
                    C20422ggb.this.djBIcL();
                }
            }
        }
    }

    private final OKWBaseMultiTransfer.Application gEmmrt() {
        return (OKWBaseMultiTransfer.Application) this.AhwBna.getValue();
    }

    public static final FragmentManager DbNXlk(C20422ggb c20422ggb) {
        return c20422ggb.new FragmentManager();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.EZpvd = (AbstractC16631ena) viewDataBindingBind;
        C20690gle c20690gle = C20690gle.OLrzqt;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        this.AYXKKw = (fXM) C20690gle.getOKTransferViewModel$default(c20690gle, activity, fXM.class, false, 4, null);
        AEQbTJ();
        copydefault();
        EZpvd();
        OLrzqt();
        C32866mlf.onEvent$default("AppMultisender_AmountInput_Interval_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        view.post(new java.lang.Runnable() { // from class: o.ggg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C20422ggb.AYXKKw(this.OLrzqt);
            }
        });
    }

    public static final void AYXKKw(C20422ggb c20422ggb) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c20422ggb, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OKWBaseMultiTransfer<?, ?> valueOf() {
        fXM<?> fxm = this.AYXKKw;
        if (fxm == null) {
            Intrinsics.gEmmrt("");
            fxm = null;
        }
        OKWBaseTransaction oKWBaseTransactionAEQbTJ = fxm.AEQbTJ();
        if (oKWBaseTransactionAEQbTJ instanceof OKWBaseMultiTransfer) {
            return (OKWBaseMultiTransfer) oKWBaseTransactionAEQbTJ;
        }
        return null;
    }

    public final void copydefault() {
        MultiTransferSignData multiTransferSignData;
        AbstractC16631ena abstractC16631ena = this.EZpvd;
        IntervalMode intervalMode = null;
        if (abstractC16631ena == null) {
            Intrinsics.gEmmrt("");
            abstractC16631ena = null;
        }
        AppCompatTextView appCompatTextView = abstractC16631ena.valueOf;
        appCompatTextView.setOnClickListener(new StateListAnimator(appCompatTextView, 1000L, this));
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferValueOf = valueOf();
        if (oKWBaseMultiTransferValueOf != null && (multiTransferSignData = (MultiTransferSignData) oKWBaseMultiTransferValueOf.QVsKAR()) != null) {
            intervalMode = multiTransferSignData.getIntervalMode();
        }
        if (intervalMode == IntervalMode.NONE) {
            AhwBna();
        } else {
            djBIcL();
        }
    }

    /* JADX INFO: renamed from: o.ggb$TaskDescription */
    public static final class TaskDescription implements DialogInterface.OnDismissListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(android.content.DialogInterface dialogInterface) {
            AbstractC16631ena abstractC16631ena = C20422ggb.this.EZpvd;
            if (abstractC16631ena == null) {
                Intrinsics.gEmmrt("");
                abstractC16631ena = null;
            }
            abstractC16631ena.copydefault.setImageResource(C52761wXj.TaskDescription.QSLkRj);
        }
    }

    /* JADX INFO: renamed from: o.ggb$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXE_;
            try {
                InterfaceC58217yxC interfaceC58217yxCAEQbTJ = null;
                AbstractC16631ena abstractC16631ena = null;
                AbstractC16631ena abstractC16631ena2 = null;
                AbstractC16631ena abstractC16631ena3 = null;
                interfaceC58217yxCAEQbTJ = null;
                if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(C33129mqd.AhwBna(editable)), (java.lang.Object) 0)) {
                    if (C33129mqd.AEQbTJ(editable != null ? java.lang.Integer.valueOf(editable.length()) : null, 1)) {
                        AbstractC16631ena abstractC16631ena4 = C20422ggb.this.EZpvd;
                        if (abstractC16631ena4 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16631ena4 = null;
                        }
                        abstractC16631ena4.OLrzqt.setText("0");
                        AbstractC16631ena abstractC16631ena5 = C20422ggb.this.EZpvd;
                        if (abstractC16631ena5 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC16631ena = abstractC16631ena5;
                        }
                        C55001xbh c55001xbhAkhnZx = abstractC16631ena.OLrzqt.AkhnZx();
                        if (c55001xbhAkhnZx != null) {
                            c55001xbhAkhnZx.setSelection(1);
                            return;
                        }
                        return;
                    }
                }
                if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(C33129mqd.AhwBna(editable)), 0) || editable == null || !StringsKt__StringsKt.startsWith$default((java.lang.CharSequence) editable, (java.lang.CharSequence) "0", false, 2, (java.lang.Object) null)) {
                    if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(C33129mqd.AhwBna(editable)), MultiTransferSignData.MAX_INTERVAL)) {
                        AbstractC16631ena abstractC16631ena6 = C20422ggb.this.EZpvd;
                        if (abstractC16631ena6 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16631ena6 = null;
                        }
                        abstractC16631ena6.OLrzqt.setText(MultiTransferSignData.MAX_INTERVAL);
                        AbstractC16631ena abstractC16631ena7 = C20422ggb.this.EZpvd;
                        if (abstractC16631ena7 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC16631ena3 = abstractC16631ena7;
                        }
                        C55001xbh c55001xbhAkhnZx2 = abstractC16631ena3.OLrzqt.AkhnZx();
                        if (c55001xbhAkhnZx2 != null) {
                            c55001xbhAkhnZx2.setSelection(3);
                            return;
                        }
                        return;
                    }
                    C20422ggb.this.copydefault(true);
                    InterfaceC58217yxC interfaceC58217yxC = C20422ggb.this.copydefault;
                    if (interfaceC58217yxC != null) {
                        interfaceC58217yxC.dispose();
                    }
                    C20422ggb c20422ggb = C20422ggb.this;
                    OKWBaseMultiTransfer oKWBaseMultiTransferValueOf = c20422ggb.valueOf();
                    if (oKWBaseMultiTransferValueOf != null && (abstractC58185ywXE_ = oKWBaseMultiTransferValueOf.e_(C33129mqd.gEmmrt(editable))) != null) {
                        final C20422ggb c20422ggb2 = C20422ggb.this;
                        final Function1 function1 = new Function1() { // from class: o.ggf
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C20422ggb.ActionBar.EZpvd(c20422ggb2, (kotlin.Pair) obj);
                            }
                        };
                        InterfaceC58227yxM<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ggm
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) {
                                C20422ggb.ActionBar.AEQbTJ(function1, obj);
                            }
                        };
                        final C20422ggb c20422ggb3 = C20422ggb.this;
                        final Function1 function12 = new Function1() { // from class: o.ggk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C20422ggb.ActionBar.OLrzqt(c20422ggb3, (java.lang.Throwable) obj);
                            }
                        };
                        interfaceC58217yxCAEQbTJ = abstractC58185ywXE_.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ggn
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) {
                                C20422ggb.ActionBar.KWHzl(function12, obj);
                            }
                        });
                    }
                    c20422ggb.copydefault = interfaceC58217yxCAEQbTJ;
                    return;
                }
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(StringsKt__StringsKt.valueOf(editable, "0"));
                AbstractC16631ena abstractC16631ena8 = C20422ggb.this.EZpvd;
                if (abstractC16631ena8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16631ena8 = null;
                }
                abstractC16631ena8.OLrzqt.setText(strGEmmrt);
                AbstractC16631ena abstractC16631ena9 = C20422ggb.this.EZpvd;
                if (abstractC16631ena9 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16631ena2 = abstractC16631ena9;
                }
                C55001xbh c55001xbhAkhnZx3 = abstractC16631ena2.OLrzqt.AkhnZx();
                if (c55001xbhAkhnZx3 != null) {
                    c55001xbhAkhnZx3.setSelection(strGEmmrt.length());
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault(java.lang.String.valueOf(e.getMessage()));
            }
        }

        public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit EZpvd(C20422ggb c20422ggb, kotlin.Pair pair) {
            c20422ggb.copydefault(false);
            return Unit.INSTANCE;
        }

        public static final void KWHzl(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit OLrzqt(C20422ggb c20422ggb, java.lang.Throwable th) {
            c20422ggb.copydefault(false);
            return Unit.INSTANCE;
        }
    }

    public final void AEQbTJ() {
        AbstractC16631ena abstractC16631ena = this.EZpvd;
        AbstractC16631ena abstractC16631ena2 = null;
        if (abstractC16631ena == null) {
            Intrinsics.gEmmrt("");
            abstractC16631ena = null;
        }
        C55001xbh c55001xbhAkhnZx = abstractC16631ena.OLrzqt.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.addTextChangedListener(new ActionBar());
        }
        AbstractC16631ena abstractC16631ena3 = this.EZpvd;
        if (abstractC16631ena3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16631ena2 = abstractC16631ena3;
        }
        C55001xbh c55001xbhAkhnZx2 = abstractC16631ena2.KWHzl.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.addTextChangedListener(new Activity());
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C14638dpI c14638dpI = new C14638dpI(fragmentActivityRequireActivity);
        this.KWHzl = c14638dpI;
        c14638dpI.copydefault(new Fragment());
    }

    /* JADX INFO: renamed from: o.ggb$Activity */
    public static final class Activity implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl;
            try {
                InterfaceC58217yxC interfaceC58217yxCAEQbTJ = null;
                AbstractC16631ena abstractC16631ena = null;
                AbstractC16631ena abstractC16631ena2 = null;
                AbstractC16631ena abstractC16631ena3 = null;
                interfaceC58217yxCAEQbTJ = null;
                if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(C33129mqd.AhwBna(editable)), (java.lang.Object) 0)) {
                    if (C33129mqd.AEQbTJ(editable != null ? java.lang.Integer.valueOf(editable.length()) : null, 1)) {
                        AbstractC16631ena abstractC16631ena4 = C20422ggb.this.EZpvd;
                        if (abstractC16631ena4 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16631ena4 = null;
                        }
                        abstractC16631ena4.KWHzl.setText("0");
                        AbstractC16631ena abstractC16631ena5 = C20422ggb.this.EZpvd;
                        if (abstractC16631ena5 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC16631ena = abstractC16631ena5;
                        }
                        C55001xbh c55001xbhAkhnZx = abstractC16631ena.KWHzl.AkhnZx();
                        if (c55001xbhAkhnZx != null) {
                            c55001xbhAkhnZx.setSelection(1);
                            return;
                        }
                        return;
                    }
                }
                if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(C33129mqd.AhwBna(editable)), 0) || editable == null || !StringsKt__StringsKt.startsWith$default((java.lang.CharSequence) editable, (java.lang.CharSequence) "0", false, 2, (java.lang.Object) null)) {
                    if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(C33129mqd.AhwBna(editable)), MultiTransferSignData.MAX_INTERVAL)) {
                        AbstractC16631ena abstractC16631ena6 = C20422ggb.this.EZpvd;
                        if (abstractC16631ena6 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16631ena6 = null;
                        }
                        abstractC16631ena6.KWHzl.setText(MultiTransferSignData.MAX_INTERVAL);
                        AbstractC16631ena abstractC16631ena7 = C20422ggb.this.EZpvd;
                        if (abstractC16631ena7 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC16631ena3 = abstractC16631ena7;
                        }
                        C55001xbh c55001xbhAkhnZx2 = abstractC16631ena3.KWHzl.AkhnZx();
                        if (c55001xbhAkhnZx2 != null) {
                            c55001xbhAkhnZx2.setSelection(3);
                            return;
                        }
                        return;
                    }
                    C20422ggb.this.copydefault(true);
                    InterfaceC58217yxC interfaceC58217yxC = C20422ggb.this.AEQbTJ;
                    if (interfaceC58217yxC != null) {
                        interfaceC58217yxC.dispose();
                    }
                    C20422ggb c20422ggb = C20422ggb.this;
                    OKWBaseMultiTransfer oKWBaseMultiTransferValueOf = c20422ggb.valueOf();
                    if (oKWBaseMultiTransferValueOf != null && (abstractC58185ywXKWHzl = oKWBaseMultiTransferValueOf.KWHzl(C33129mqd.gEmmrt(editable))) != null) {
                        final C20422ggb c20422ggb2 = C20422ggb.this;
                        final Function1 function1 = new Function1() { // from class: o.ggl
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C20422ggb.Activity.OLrzqt(c20422ggb2, (kotlin.Pair) obj);
                            }
                        };
                        InterfaceC58227yxM<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ggj
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) {
                                C20422ggb.Activity.OLrzqt(function1, obj);
                            }
                        };
                        final C20422ggb c20422ggb3 = C20422ggb.this;
                        final Function1 function12 = new Function1() { // from class: o.ggo
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C20422ggb.Activity.EZpvd(c20422ggb3, (java.lang.Throwable) obj);
                            }
                        };
                        interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ggs
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj) {
                                C20422ggb.Activity.copydefault(function12, obj);
                            }
                        });
                    }
                    c20422ggb.AEQbTJ = interfaceC58217yxCAEQbTJ;
                    return;
                }
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(StringsKt__StringsKt.valueOf(editable, "0"));
                AbstractC16631ena abstractC16631ena8 = C20422ggb.this.EZpvd;
                if (abstractC16631ena8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16631ena8 = null;
                }
                abstractC16631ena8.KWHzl.setText(strGEmmrt);
                AbstractC16631ena abstractC16631ena9 = C20422ggb.this.EZpvd;
                if (abstractC16631ena9 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16631ena2 = abstractC16631ena9;
                }
                C55001xbh c55001xbhAkhnZx3 = abstractC16631ena2.KWHzl.AkhnZx();
                if (c55001xbhAkhnZx3 != null) {
                    c55001xbhAkhnZx3.setSelection(strGEmmrt.length());
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault(java.lang.String.valueOf(e.getMessage()));
            }
        }

        public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit OLrzqt(C20422ggb c20422ggb, kotlin.Pair pair) {
            c20422ggb.copydefault(false);
            return Unit.INSTANCE;
        }

        public static final void copydefault(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit EZpvd(C20422ggb c20422ggb, java.lang.Throwable th) {
            c20422ggb.copydefault(false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.ggb$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C20422ggb OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C20422ggb c20422ggb) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c20422ggb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                AbstractC16631ena abstractC16631ena = this.OLrzqt.EZpvd;
                if (abstractC16631ena == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16631ena = null;
                }
                if (abstractC16631ena.EZpvd.fJNWhG()) {
                    return;
                }
                ActivityResultLauncher activityResultLauncher = this.OLrzqt.OLrzqt;
                fXY.Application application = fXY.Companion;
                FragmentActivity fragmentActivityRequireActivity = this.OLrzqt.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                OKWBaseMultiTransfer oKWBaseMultiTransferValueOf = this.OLrzqt.valueOf();
                if (oKWBaseMultiTransferValueOf == null) {
                    return;
                }
                activityResultLauncher.launch(application.copydefault(fragmentActivityRequireActivity, oKWBaseMultiTransferValueOf));
            }
        }
    }

    /* JADX INFO: renamed from: o.ggb$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C20422ggb AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C20422ggb c20422ggb) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c20422ggb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C33570myu.copydefault((android.app.Activity) this.AEQbTJ.requireActivity());
                AbstractC16631ena abstractC16631ena = this.AEQbTJ.EZpvd;
                if (abstractC16631ena == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16631ena = null;
                }
                abstractC16631ena.copydefault.setImageResource(C52761wXj.TaskDescription.dUDNAs);
                C20381gfn c20381gfn = new C20381gfn();
                c20381gfn.setOnDismissListener(this.AEQbTJ.new TaskDescription());
                androidx.fragment.app.FragmentManager parentFragmentManager = this.AEQbTJ.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                c20381gfn.show(parentFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.ggb$Fragment */
    public static final class Fragment implements C14638dpI.Application {
        public int copydefault;

        public Fragment() {
        }

        @Override // o.C14638dpI.Application
        public void AEQbTJ(boolean z, int i) {
            if (this.copydefault == i) {
                return;
            }
            this.copydefault = i;
            if (z) {
                return;
            }
            AbstractC16631ena abstractC16631ena = C20422ggb.this.EZpvd;
            AbstractC16631ena abstractC16631ena2 = null;
            if (abstractC16631ena == null) {
                Intrinsics.gEmmrt("");
                abstractC16631ena = null;
            }
            abstractC16631ena.OLrzqt.clearFocus();
            AbstractC16631ena abstractC16631ena3 = C20422ggb.this.EZpvd;
            if (abstractC16631ena3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16631ena2 = abstractC16631ena3;
            }
            abstractC16631ena2.KWHzl.clearFocus();
        }
    }

    public final void EZpvd() {
        AbstractC16631ena abstractC16631ena = this.EZpvd;
        if (abstractC16631ena == null) {
            Intrinsics.gEmmrt("");
            abstractC16631ena = null;
        }
        C52794wYp c52794wYp = abstractC16631ena.EZpvd;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
    }

    public final void OLrzqt() {
        C8497bDo c8497bDoUlJrfe;
        AbstractC58185ywX<java.util.Collection<AbstractC9832bcy>> abstractC58185ywXAEQbTJ;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferValueOf = valueOf();
        if (oKWBaseMultiTransferValueOf != null && (c8497bDoUlJrfe = oKWBaseMultiTransferValueOf.UlJrfe()) != null && (abstractC58185ywXAEQbTJ = c8497bDoUlJrfe.AEQbTJ()) != null) {
            final Function1 function1 = new Function1() { // from class: o.gge
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20422ggb.KWHzl(this.OLrzqt, (java.util.Collection) obj);
                }
            };
            abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.ggh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20422ggb.AEQbTJ(function1, obj);
                }
            });
        }
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferValueOf2 = valueOf();
        if (oKWBaseMultiTransferValueOf2 != null) {
            oKWBaseMultiTransferValueOf2.copydefault(gEmmrt());
        }
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C20422ggb c20422ggb, java.util.Collection collection) {
        c20422ggb.KWHzl();
        c20422ggb.AYXKKw();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        MultiTransferSignData multiTransferSignData;
        MultiTransferSignData multiTransferSignData2;
        MultiTransferSignData multiTransferSignData3;
        MultiTransferSignData multiTransferSignData4;
        AbstractC16631ena abstractC16631ena = this.EZpvd;
        AbstractC16631ena abstractC16631ena2 = null;
        if (abstractC16631ena == null) {
            Intrinsics.gEmmrt("");
            abstractC16631ena = null;
        }
        abstractC16631ena.valueOf.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ContextAware));
        AbstractC16631ena abstractC16631ena3 = this.EZpvd;
        if (abstractC16631ena3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16631ena3 = null;
        }
        abstractC16631ena3.OLrzqt.setState(1);
        AbstractC16631ena abstractC16631ena4 = this.EZpvd;
        if (abstractC16631ena4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16631ena4 = null;
        }
        abstractC16631ena4.KWHzl.setState(0);
        KWHzl();
        AYXKKw();
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferValueOf = valueOf();
        if (C33129mqd.copydefault((java.lang.Object) ((oKWBaseMultiTransferValueOf == null || (multiTransferSignData4 = (MultiTransferSignData) oKWBaseMultiTransferValueOf.QVsKAR()) == null) ? null : multiTransferSignData4.getMaxInterval()), (java.lang.Object) 0)) {
            AbstractC16631ena abstractC16631ena5 = this.EZpvd;
            if (abstractC16631ena5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16631ena5 = null;
            }
            C55008xbo c55008xbo = abstractC16631ena5.KWHzl;
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferValueOf2 = valueOf();
            c55008xbo.setText((oKWBaseMultiTransferValueOf2 == null || (multiTransferSignData3 = (MultiTransferSignData) oKWBaseMultiTransferValueOf2.QVsKAR()) == null) ? null : multiTransferSignData3.getMaxInterval());
        }
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferValueOf3 = valueOf();
        if (C33129mqd.copydefault((java.lang.Object) ((oKWBaseMultiTransferValueOf3 == null || (multiTransferSignData2 = (MultiTransferSignData) oKWBaseMultiTransferValueOf3.QVsKAR()) == null) ? null : multiTransferSignData2.getMinInterval()), (java.lang.Object) 0)) {
            AbstractC16631ena abstractC16631ena6 = this.EZpvd;
            if (abstractC16631ena6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16631ena6 = null;
            }
            C55008xbo c55008xbo2 = abstractC16631ena6.OLrzqt;
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferValueOf4 = valueOf();
            c55008xbo2.setText((oKWBaseMultiTransferValueOf4 == null || (multiTransferSignData = (MultiTransferSignData) oKWBaseMultiTransferValueOf4.QVsKAR()) == null) ? null : multiTransferSignData.getMinInterval());
        }
        AbstractC16631ena abstractC16631ena7 = this.EZpvd;
        if (abstractC16631ena7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16631ena2 = abstractC16631ena7;
        }
        final C55001xbh c55001xbhAkhnZx = abstractC16631ena2.OLrzqt.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.postDelayed(new java.lang.Runnable() { // from class: o.ggi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C20422ggb.AEQbTJ(c55001xbhAkhnZx);
                }
            }, 200L);
        }
    }

    public static final void AEQbTJ(C55001xbh c55001xbh) {
        android.text.Editable text = c55001xbh.getText();
        c55001xbh.setSelection(C11600cUg.copydefault(text != null ? java.lang.Integer.valueOf(text.length()) : null));
        C33570myu.AEQbTJ(c55001xbh.getContext(), (android.widget.EditText) c55001xbh);
    }

    public final void AhwBna() {
        AbstractC16631ena abstractC16631ena = this.EZpvd;
        AbstractC16631ena abstractC16631ena2 = null;
        if (abstractC16631ena == null) {
            Intrinsics.gEmmrt("");
            abstractC16631ena = null;
        }
        abstractC16631ena.valueOf.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ContextAwareKt));
        AbstractC16631ena abstractC16631ena3 = this.EZpvd;
        if (abstractC16631ena3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16631ena3 = null;
        }
        C55001xbh c55001xbhAkhnZx = abstractC16631ena3.OLrzqt.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setText("");
        }
        AbstractC16631ena abstractC16631ena4 = this.EZpvd;
        if (abstractC16631ena4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16631ena4 = null;
        }
        abstractC16631ena4.OLrzqt.setState(3);
        AbstractC16631ena abstractC16631ena5 = this.EZpvd;
        if (abstractC16631ena5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16631ena5 = null;
        }
        C55001xbh c55001xbhAkhnZx2 = abstractC16631ena5.KWHzl.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.setText("");
        }
        AbstractC16631ena abstractC16631ena6 = this.EZpvd;
        if (abstractC16631ena6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16631ena2 = abstractC16631ena6;
        }
        abstractC16631ena2.KWHzl.setState(3);
        KWHzl();
        AYXKKw();
    }

    public final void KWHzl() {
        MultiTransferSignData multiTransferSignData;
        C8497bDo c8497bDoUlJrfe;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferValueOf = valueOf();
        AbstractC16631ena abstractC16631ena = null;
        if (((oKWBaseMultiTransferValueOf == null || (c8497bDoUlJrfe = oKWBaseMultiTransferValueOf.UlJrfe()) == null) ? null : c8497bDoUlJrfe.AEQbTJ(2)) instanceof C9807bcZ) {
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferValueOf2 = valueOf();
            if (!Intrinsics.EZpvd((java.lang.Object) ((oKWBaseMultiTransferValueOf2 == null || (multiTransferSignData = (MultiTransferSignData) oKWBaseMultiTransferValueOf2.QVsKAR()) == null) ? null : multiTransferSignData.getMaxInterval()), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
                AbstractC16631ena abstractC16631ena2 = this.EZpvd;
                if (abstractC16631ena2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16631ena2 = null;
                }
                abstractC16631ena2.OLrzqt.setErrorText("");
                AbstractC16631ena abstractC16631ena3 = this.EZpvd;
                if (abstractC16631ena3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16631ena3 = null;
                }
                abstractC16631ena3.KWHzl.setErrorText("");
                AbstractC16631ena abstractC16631ena4 = this.EZpvd;
                if (abstractC16631ena4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16631ena = abstractC16631ena4;
                }
                abstractC16631ena.AhwBna.setVisibility(0);
                return;
            }
        }
        AbstractC16631ena abstractC16631ena5 = this.EZpvd;
        if (abstractC16631ena5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16631ena5 = null;
        }
        abstractC16631ena5.OLrzqt.values();
        AbstractC16631ena abstractC16631ena6 = this.EZpvd;
        if (abstractC16631ena6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16631ena6 = null;
        }
        abstractC16631ena6.KWHzl.values();
        AbstractC16631ena abstractC16631ena7 = this.EZpvd;
        if (abstractC16631ena7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16631ena = abstractC16631ena7;
        }
        abstractC16631ena.AhwBna.setVisibility(8);
    }

    private final void AYXKKw() {
        C8497bDo c8497bDoUlJrfe;
        AbstractC16631ena abstractC16631ena = this.EZpvd;
        if (abstractC16631ena == null) {
            Intrinsics.gEmmrt("");
            abstractC16631ena = null;
        }
        C52794wYp c52794wYp = abstractC16631ena.EZpvd;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferValueOf = valueOf();
        c52794wYp.setEnabled(!((oKWBaseMultiTransferValueOf == null || (c8497bDoUlJrfe = oKWBaseMultiTransferValueOf.UlJrfe()) == null || !c8497bDoUlJrfe.AEQbTJ(C56524yIo.AEQbTJ(C9807bcZ.class))) ? false : true));
    }

    public final void copydefault(boolean z) {
        AbstractC16631ena abstractC16631ena = null;
        if (z) {
            AbstractC16631ena abstractC16631ena2 = this.EZpvd;
            if (abstractC16631ena2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16631ena2 = null;
            }
            C52794wYp.startLoading$default(abstractC16631ena2.EZpvd, 0L, 1, null);
            return;
        }
        AbstractC16631ena abstractC16631ena3 = this.EZpvd;
        if (abstractC16631ena3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16631ena = abstractC16631ena3;
        }
        abstractC16631ena.EZpvd.fIwbmz();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.AEQbTJ;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        C14638dpI c14638dpI = this.KWHzl;
        if (c14638dpI != null) {
            c14638dpI.EZpvd();
        }
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferValueOf = valueOf();
        if (oKWBaseMultiTransferValueOf != null) {
            oKWBaseMultiTransferValueOf.KWHzl(gEmmrt());
        }
    }
}

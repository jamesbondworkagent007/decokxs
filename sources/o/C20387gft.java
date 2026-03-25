package o;

import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.business.defi.api.model.tx.signdata.AmountMode;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.components.track.TrackChannel;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC20367gfZ;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20387gft extends AbstractC32996moC implements InterfaceC33040mou {
    public InterfaceC58217yxC AYXKKw;
    public InterfaceC58217yxC AhwBna;
    public fXM<?> DbNXlk;
    public final Function2<C55033xcM, java.lang.CharSequence, Unit> EZpvd;
    public int KWHzl = 1;
    public AbstractC16572emU OLrzqt;
    public final ActivityResultLauncher<android.content.Intent> copydefault;
    public final Function2<C55033xcM, java.lang.CharSequence, Unit> djBIcL;
    public final Function2<C55033xcM, java.lang.CharSequence, Unit> fetchVPNInfo;
    public InterfaceC58217yxC gEmmrt;
    public InterfaceC58217yxC valueOf;
    public final InterfaceC56387yDm values;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.gft$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.gdmIOq;
    }

    public C20387gft() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.gfE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C20387gft.AEQbTJ(this.KWHzl, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.copydefault = activityResultLauncherRegisterForActivityResult;
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.gfH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20387gft.fJNWhG(this.KWHzl);
            }
        });
        this.djBIcL = new Function2() { // from class: o.gfF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20387gft.copydefault(this.KWHzl, (C55033xcM) obj, (java.lang.CharSequence) obj2);
            }
        };
        this.EZpvd = new Function2() { // from class: o.gfI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20387gft.OLrzqt(this.AEQbTJ, (C55033xcM) obj, (java.lang.CharSequence) obj2);
            }
        };
        this.fetchVPNInfo = new Function2() { // from class: o.gfJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C20387gft.AYXKKw(this.OLrzqt, (C55033xcM) obj, (java.lang.CharSequence) obj2);
            }
        };
    }

    /* JADX INFO: renamed from: o.gft$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gft.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C20387gft KWHzl(android.os.Bundle bundle) {
            C20387gft c20387gft = new C20387gft();
            c20387gft.setArguments(bundle);
            return c20387gft;
        }
    }

    public static final void AEQbTJ(C20387gft c20387gft, ActivityResult activityResult) {
        FragmentActivity activity;
        if (activityResult.getResultCode() != -1 || (activity = c20387gft.getActivity()) == null) {
            return;
        }
        activity.setResult(activityResult.getResultCode(), activityResult.getData());
        activity.finish();
    }

    /* JADX INFO: renamed from: o.gft$PictureInPictureParams */
    public static final class PictureInPictureParams implements OKWBaseMultiTransfer.Application {
        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.Application
        public void AEQbTJ() {
        }

        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.Application
        public void KWHzl() {
        }

        public PictureInPictureParams() {
        }

        @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseMultiTransfer.Application
        public void KWHzl(int i) {
            if (i == 2) {
                OKWBaseMultiTransfer oKWBaseMultiTransferAEQbTJ = C20387gft.this.AEQbTJ();
                if (oKWBaseMultiTransferAEQbTJ == null || !oKWBaseMultiTransferAEQbTJ.DTwDnp()) {
                    C20387gft.this.uzCIH();
                    return;
                } else {
                    C20387gft.this.hDKMBd();
                    return;
                }
            }
            if (i == 4 || i == 5 || i == 6 || i == 7) {
                C20387gft.this.wlaJM();
                C20387gft.this.EZpvd(false);
                C20387gft.this.zsXlph();
                C20387gft.this.AubY();
                C20387gft.this.getFieldNames();
                C20387gft.this.getNewProxyInstance();
            }
        }
    }

    private final OKWBaseMultiTransfer.Application AuCTelauCTel() {
        return (OKWBaseMultiTransfer.Application) this.values.getValue();
    }

    public static final PictureInPictureParams fJNWhG(C20387gft c20387gft) {
        return c20387gft.new PictureInPictureParams();
    }

    public static final Unit copydefault(final C20387gft c20387gft, C55033xcM c55033xcM, java.lang.CharSequence charSequence) {
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ;
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXD_;
        C10854bwM c10854bwMFHqPtx;
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (c55033xcM.AEQbTJ() != 0) {
            java.lang.String strValueOf = c55033xcM.valueOf();
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = c20387gft.AEQbTJ();
            java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(C54870xYj.KWHzl(strValueOf, C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx.valueOf()))), true, (RoundingMode) null, 2, (java.lang.Object) null);
            c20387gft.OLrzqt(true);
            InterfaceC58217yxC interfaceC58217yxC = c20387gft.AYXKKw;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = c20387gft.AEQbTJ();
            if (oKWBaseMultiTransferAEQbTJ2 == null || (abstractC58185ywXD_ = oKWBaseMultiTransferAEQbTJ2.d_(strConvertToBigIntegerString$default)) == null) {
                interfaceC58217yxCAEQbTJ = null;
            } else {
                final Function1 function1 = new Function1() { // from class: o.gfL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20387gft.djBIcL(this.KWHzl, (kotlin.Pair) obj);
                    }
                };
                InterfaceC58227yxM<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gfN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C20387gft.gEmmrt(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.gfK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20387gft.EZpvd(this.AEQbTJ, (java.lang.Throwable) obj);
                    }
                };
                interfaceC58217yxCAEQbTJ = abstractC58185ywXD_.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gfM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C20387gft.fetchVPNInfo(function12, obj);
                    }
                });
            }
            c20387gft.AYXKKw = interfaceC58217yxCAEQbTJ;
            AbstractC16572emU abstractC16572emU = c20387gft.OLrzqt;
            if (abstractC16572emU == null) {
                Intrinsics.gEmmrt("");
                abstractC16572emU = null;
            }
            C57461yip c57461yip = abstractC16572emU.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c57461yip, "");
            c20387gft.OLrzqt(c57461yip, charSequence);
            AbstractC16572emU abstractC16572emU2 = c20387gft.OLrzqt;
            if (abstractC16572emU2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16572emU2 = null;
            }
            AppCompatTextView appCompatTextView = abstractC16572emU2.uzCIH;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ3 = c20387gft.AEQbTJ();
            java.lang.String strValues = oKWBaseMultiTransferAEQbTJ3 != null ? oKWBaseMultiTransferAEQbTJ3.values(strConvertToBigIntegerString$default) : null;
            c20387gft.KWHzl(appCompatTextView, strValues != null ? strValues : "");
            c20387gft.AubY();
            c20387gft.getNewProxyInstance();
        }
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(C20387gft c20387gft, kotlin.Pair pair) {
        c20387gft.OLrzqt(false);
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C20387gft c20387gft, java.lang.Throwable th) {
        c20387gft.OLrzqt(false);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final C20387gft c20387gft, C55033xcM c55033xcM, java.lang.CharSequence charSequence) {
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ;
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOLrzqt;
        C10854bwM c10854bwMFHqPtx;
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (c55033xcM.AEQbTJ() != 0) {
            java.lang.String strValueOf = c55033xcM.valueOf();
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = c20387gft.AEQbTJ();
            java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(C54870xYj.KWHzl(strValueOf, C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx.valueOf()))), true, (RoundingMode) null, 2, (java.lang.Object) null);
            c20387gft.OLrzqt(true);
            InterfaceC58217yxC interfaceC58217yxC = c20387gft.gEmmrt;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = c20387gft.AEQbTJ();
            if (oKWBaseMultiTransferAEQbTJ2 == null || (abstractC58185ywXOLrzqt = oKWBaseMultiTransferAEQbTJ2.OLrzqt(strConvertToBigIntegerString$default)) == null) {
                interfaceC58217yxCAEQbTJ = null;
            } else {
                final Function1 function1 = new Function1() { // from class: o.gfs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20387gft.AYXKKw(this.EZpvd, (kotlin.Pair) obj);
                    }
                };
                InterfaceC58227yxM<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gfu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C20387gft.AYXKKw(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.gfC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20387gft.OLrzqt(this.copydefault, (java.lang.Throwable) obj);
                    }
                };
                interfaceC58217yxCAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gfG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C20387gft.valueOf(function12, obj);
                    }
                });
            }
            c20387gft.gEmmrt = interfaceC58217yxCAEQbTJ;
            AbstractC16572emU abstractC16572emU = c20387gft.OLrzqt;
            if (abstractC16572emU == null) {
                Intrinsics.gEmmrt("");
                abstractC16572emU = null;
            }
            C57461yip c57461yip = abstractC16572emU.copydefault;
            Intrinsics.checkNotNullExpressionValue(c57461yip, "");
            c20387gft.OLrzqt(c57461yip, charSequence);
            AbstractC16572emU abstractC16572emU2 = c20387gft.OLrzqt;
            if (abstractC16572emU2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16572emU2 = null;
            }
            AppCompatTextView appCompatTextView = abstractC16572emU2.getFieldNames;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ3 = c20387gft.AEQbTJ();
            java.lang.String strValues = oKWBaseMultiTransferAEQbTJ3 != null ? oKWBaseMultiTransferAEQbTJ3.values(strConvertToBigIntegerString$default) : null;
            c20387gft.KWHzl(appCompatTextView, strValues != null ? strValues : "");
            c20387gft.AubY();
            c20387gft.getNewProxyInstance();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gft$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ C20387gft AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C20387gft c20387gft) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c20387gft;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl(3);
                this.AEQbTJ.KWHzl(true);
                this.AEQbTJ.getNewProxyInstance();
            }
        }
    }

    /* JADX INFO: renamed from: o.gft$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C20387gft KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C20387gft c20387gft) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c20387gft;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.KWHzl(2);
                this.KWHzl.KWHzl(true);
                this.KWHzl.getNewProxyInstance();
            }
        }
    }

    /* JADX INFO: renamed from: o.gft$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C20387gft OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C20387gft c20387gft) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c20387gft;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                AbstractC16572emU abstractC16572emU = this.OLrzqt.OLrzqt;
                AbstractC16572emU abstractC16572emU2 = null;
                if (abstractC16572emU == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16572emU = null;
                }
                if (abstractC16572emU.KWHzl.fJNWhG()) {
                    return;
                }
                if (!this.OLrzqt.EZpvd(true)) {
                    AbstractC16572emU abstractC16572emU3 = this.OLrzqt.OLrzqt;
                    if (abstractC16572emU3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC16572emU2 = abstractC16572emU3;
                    }
                    abstractC16572emU2.KWHzl.setEnabled(false);
                    return;
                }
                if (this.OLrzqt.AuCTel()) {
                    this.OLrzqt.KWHzl(false);
                    this.OLrzqt.gEmmrt();
                    this.OLrzqt.AYXKKw();
                    this.OLrzqt.djBIcL();
                    this.OLrzqt.getNewProxyInstance();
                    return;
                }
                ActivityResultLauncher activityResultLauncher = this.OLrzqt.copydefault;
                ActivityC20367gfZ.TaskDescription taskDescription = ActivityC20367gfZ.Companion;
                FragmentActivity fragmentActivityRequireActivity = this.OLrzqt.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                activityResultLauncher.launch(taskDescription.KWHzl(fragmentActivityRequireActivity));
            }
        }
    }

    /* JADX INFO: renamed from: o.gft$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C20387gft KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C20387gft c20387gft) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c20387gft;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.KWHzl(1);
                this.KWHzl.KWHzl(true);
                this.KWHzl.getNewProxyInstance();
            }
        }
    }

    /* JADX INFO: renamed from: o.gft$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C20387gft EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C20387gft c20387gft) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c20387gft;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C10854bwM c10854bwMFHqPtx;
            C10854bwM c10854bwMFHqPtx2;
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXGiSNqX;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.OLrzqt(true);
                InterfaceC58217yxC interfaceC58217yxC = this.EZpvd.valueOf;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                C20387gft c20387gft = this.EZpvd;
                OKWBaseMultiTransfer oKWBaseMultiTransferAEQbTJ = c20387gft.AEQbTJ();
                c20387gft.valueOf = (oKWBaseMultiTransferAEQbTJ == null || (abstractC58185ywXGiSNqX = oKWBaseMultiTransferAEQbTJ.giSNqX()) == null) ? null : abstractC58185ywXGiSNqX.AEQbTJ(new InterfaceC58227yxM(this.EZpvd.new Application()) { // from class: o.gft.SharedElementCallback
                    public final /* synthetic */ Function1 KWHzl;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.KWHzl = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.KWHzl.invoke(obj);
                    }
                }, new InterfaceC58227yxM(this.EZpvd.new ActionBar()) { // from class: o.gft.SharedElementCallback
                    public final /* synthetic */ Function1 KWHzl;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.KWHzl = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.KWHzl.invoke(obj);
                    }
                });
                OKWBaseMultiTransfer oKWBaseMultiTransferAEQbTJ2 = this.EZpvd.AEQbTJ();
                java.lang.String transferAmount$default = oKWBaseMultiTransferAEQbTJ2 != null ? AbstractC8704bHj.getTransferAmount$default(oKWBaseMultiTransferAEQbTJ2, false, false, 3, null) : null;
                if (transferAmount$default == null) {
                    transferAmount$default = "";
                }
                OKWBaseMultiTransfer oKWBaseMultiTransferAEQbTJ3 = this.EZpvd.AEQbTJ();
                if (oKWBaseMultiTransferAEQbTJ3 == null || !oKWBaseMultiTransferAEQbTJ3.U_()) {
                    AbstractC16572emU abstractC16572emU = this.EZpvd.OLrzqt;
                    if (abstractC16572emU == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16572emU = null;
                    }
                    abstractC16572emU.EZpvd.setPlainNumericText("0");
                    C20387gft c20387gft2 = this.EZpvd;
                    AbstractC16572emU abstractC16572emU2 = c20387gft2.OLrzqt;
                    if (abstractC16572emU2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16572emU2 = null;
                    }
                    C57461yip c57461yip = abstractC16572emU2.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c57461yip, "");
                    c20387gft2.OLrzqt(c57461yip, C33070mpX.AYXKKw(C13754dXa.FragmentManager.dvKsVJ));
                } else {
                    OKWBaseMultiTransfer oKWBaseMultiTransferAEQbTJ4 = this.EZpvd.AEQbTJ();
                    BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(C54870xYj.AEQbTJ(transferAmount$default, C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ4 == null || (c10854bwMFHqPtx2 = oKWBaseMultiTransferAEQbTJ4.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx2.valueOf()))));
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    OKWBaseMultiTransfer oKWBaseMultiTransferAEQbTJ5 = this.EZpvd.AEQbTJ();
                    java.lang.String strKWHzl = C54862xYb.KWHzl(bigDecimalEZpvd, false, (oKWBaseMultiTransferAEQbTJ5 == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ5.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx.DTwDnp()), roundingMode);
                    AbstractC16572emU abstractC16572emU3 = this.EZpvd.OLrzqt;
                    if (abstractC16572emU3 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16572emU3 = null;
                    }
                    abstractC16572emU3.EZpvd.setPlainNumericText(strKWHzl);
                    C20387gft c20387gft3 = this.EZpvd;
                    AbstractC16572emU abstractC16572emU4 = c20387gft3.OLrzqt;
                    if (abstractC16572emU4 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16572emU4 = null;
                    }
                    C57461yip c57461yip2 = abstractC16572emU4.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c57461yip2, "");
                    c20387gft3.OLrzqt(c57461yip2, pTB.formatLocalized$default(strKWHzl, null, 1, null));
                }
                C20387gft c20387gft4 = this.EZpvd;
                AbstractC16572emU abstractC16572emU5 = c20387gft4.OLrzqt;
                if (abstractC16572emU5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16572emU5 = null;
                }
                AppCompatTextView appCompatTextView = abstractC16572emU5.iwGUEr;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                OKWBaseMultiTransfer oKWBaseMultiTransferAEQbTJ6 = this.EZpvd.AEQbTJ();
                java.lang.String strValues = oKWBaseMultiTransferAEQbTJ6 != null ? oKWBaseMultiTransferAEQbTJ6.values(transferAmount$default) : null;
                c20387gft4.KWHzl(appCompatTextView, strValues != null ? strValues : "");
                this.EZpvd.AubY();
                this.EZpvd.getNewProxyInstance();
            }
        }
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(C20387gft c20387gft, kotlin.Pair pair) {
        c20387gft.OLrzqt(false);
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C20387gft c20387gft, java.lang.Throwable th) {
        c20387gft.OLrzqt(false);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(final C20387gft c20387gft, C55033xcM c55033xcM, java.lang.CharSequence charSequence) {
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ;
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAhwBna;
        C10854bwM c10854bwMFHqPtx;
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (c55033xcM.AEQbTJ() != 0) {
            java.lang.String strValueOf = c55033xcM.valueOf();
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = c20387gft.AEQbTJ();
            java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(C54870xYj.KWHzl(strValueOf, C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx.valueOf()))), true, (RoundingMode) null, 2, (java.lang.Object) null);
            c20387gft.OLrzqt(true);
            InterfaceC58217yxC interfaceC58217yxC = c20387gft.AhwBna;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = c20387gft.AEQbTJ();
            if (oKWBaseMultiTransferAEQbTJ2 == null || (abstractC58185ywXAhwBna = oKWBaseMultiTransferAEQbTJ2.AhwBna(strConvertToBigIntegerString$default)) == null) {
                interfaceC58217yxCAEQbTJ = null;
            } else {
                final Function1 function1 = new Function1() { // from class: o.gfy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20387gft.AhwBna(this.EZpvd, (kotlin.Pair) obj);
                    }
                };
                InterfaceC58227yxM<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gfw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C20387gft.AkhnZx(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.gfz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C20387gft.AYXKKw(this.EZpvd, (java.lang.Throwable) obj);
                    }
                };
                interfaceC58217yxCAEQbTJ = abstractC58185ywXAhwBna.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gfx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C20387gft.DbNXlk(function12, obj);
                    }
                });
            }
            c20387gft.AhwBna = interfaceC58217yxCAEQbTJ;
            AbstractC16572emU abstractC16572emU = c20387gft.OLrzqt;
            if (abstractC16572emU == null) {
                Intrinsics.gEmmrt("");
                abstractC16572emU = null;
            }
            C57461yip c57461yip = abstractC16572emU.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c57461yip, "");
            c20387gft.OLrzqt(c57461yip, charSequence);
            AbstractC16572emU abstractC16572emU2 = c20387gft.OLrzqt;
            if (abstractC16572emU2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16572emU2 = null;
            }
            AppCompatTextView appCompatTextView = abstractC16572emU2.iwGUEr;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ3 = c20387gft.AEQbTJ();
            java.lang.String strValues = oKWBaseMultiTransferAEQbTJ3 != null ? oKWBaseMultiTransferAEQbTJ3.values(strConvertToBigIntegerString$default) : null;
            c20387gft.KWHzl(appCompatTextView, strValues != null ? strValues : "");
            c20387gft.AubY();
            c20387gft.getNewProxyInstance();
        }
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(C20387gft c20387gft, kotlin.Pair pair) {
        c20387gft.OLrzqt(false);
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(C20387gft c20387gft, java.lang.Throwable th) {
        c20387gft.OLrzqt(false);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ != null) {
            oKWBaseMultiTransferAEQbTJ.flVtFt();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ != null) {
            oKWBaseMultiTransferAEQbTJ.gasjUx();
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.OLrzqt = (AbstractC16572emU) viewDataBindingBind;
        C20690gle c20690gle = C20690gle.OLrzqt;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        fXM<?> fxm = (fXM) c20690gle.EZpvd((ComponentActivity) activity, fXM.class, true);
        this.DbNXlk = fxm;
        if (fxm == null) {
            Intrinsics.gEmmrt("");
            fxm = null;
        }
        fxm.EZpvd().observe(this, new PendingIntent(new Function1() { // from class: o.gfr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20387gft.KWHzl(this.OLrzqt, (kotlin.Pair) obj);
            }
        }));
        fJNWhG();
        C32866mlf.onEvent$default("AppMultisender_AmountInput_Amount_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public static final Unit KWHzl(C20387gft c20387gft, kotlin.Pair pair) {
        OKWBaseTransaction oKWBaseTransaction = (OKWBaseTransaction) pair.component1();
        java.lang.String str = (java.lang.String) pair.component2();
        c20387gft.dismissLoadingWithLogo();
        if (oKWBaseTransaction != null) {
            c20387gft.fARcdN();
        } else {
            pUU.copydefault("MultiAmountFragment", "errMsg: " + str);
            c20387gft.EZpvd(true, str);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC33040mou
    public boolean AhwBna() {
        if (!AuCTel()) {
            KWHzl(true);
            KWHzl(this.KWHzl);
            getNewProxyInstance();
            return true;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            android.content.Intent intent = activity.getIntent();
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
            intent.putExtra("data", oKWBaseMultiTransferAEQbTJ != null ? (MultiTransferSignData) oKWBaseMultiTransferAEQbTJ.QVsKAR() : null);
            Unit unit = Unit.INSTANCE;
            activity.setResult(0, intent);
        }
        return false;
    }

    public final void fJNWhG() {
        showLoadingWithLogo();
        android.os.Bundle arguments = getArguments();
        fXM<?> fxm = null;
        MultiTransferSignData multiTransferSignData = arguments != null ? (MultiTransferSignData) arguments.getParcelable("data") : null;
        C10854bwM c10854bwMCopydefault = C11627cVg.KWHzl.copydefault(multiTransferSignData != null ? java.lang.Long.valueOf(multiTransferSignData.getCoinId()) : null, false);
        if (multiTransferSignData == null || c10854bwMCopydefault == null) {
            java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("wrong sign data " + new Gson().toJson(multiTransferSignData));
            C6777aVl.Companion.EZpvd(illegalArgumentException);
            dismissLoadingWithLogo();
            EZpvd(false, C10857bwP.KWHzl("OKWMultiTransferAmountFragment", illegalArgumentException));
            return;
        }
        fXM<?> fxm2 = this.DbNXlk;
        if (fxm2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            fxm = fxm2;
        }
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(multiTransferSignData.getWalletId());
        fxm.copydefault(new SignDataArgs<>(str == null ? "" : str, null, c10854bwMCopydefault.fetchVPNInfo(), multiTransferSignData, null, null, null, null, null, null, 1, 12, null, null, null, null, null, false, false, null, false, false, false, false, 16774130, null), false, false);
    }

    public final OKWBaseMultiTransfer<?, ?> AEQbTJ() {
        fXM<?> fxm = this.DbNXlk;
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

    public final void fARcdN() {
        valueOf();
        ejfBZ();
        fetchVPNInfo();
        isConnected();
        DbNXlk();
        values();
        AkhnZx();
        getNewProxyInstance();
        zuBGHE();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void valueOf() {
        AbstractC16572emU abstractC16572emU = this.OLrzqt;
        if (abstractC16572emU == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU = null;
        }
        C55249xgQ c55249xgQ = abstractC16572emU.AEQbTJ;
        c55249xgQ.addTab(c55249xgQ.newTab().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResult1)));
        c55249xgQ.addTab(c55249xgQ.newTab().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getResultCode)));
        c55249xgQ.setVisibility(0);
        c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new StateListAnimator());
    }

    /* JADX INFO: renamed from: o.gft$StateListAnimator */
    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab == null || tab.getPosition() != 0) {
                OKWBaseMultiTransfer oKWBaseMultiTransferAEQbTJ = C20387gft.this.AEQbTJ();
                if (oKWBaseMultiTransferAEQbTJ != null) {
                    oKWBaseMultiTransferAEQbTJ.EZpvd(AmountMode.RANGE);
                    return;
                }
                return;
            }
            OKWBaseMultiTransfer oKWBaseMultiTransferAEQbTJ2 = C20387gft.this.AEQbTJ();
            if (oKWBaseMultiTransferAEQbTJ2 != null) {
                oKWBaseMultiTransferAEQbTJ2.EZpvd(AmountMode.SPECIFIED);
            }
        }
    }

    public final void hDKMBd() {
        KWHzl(1);
        KWHzl(true);
        AbstractC16572emU abstractC16572emU = this.OLrzqt;
        AbstractC16572emU abstractC16572emU2 = null;
        if (abstractC16572emU == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU = null;
        }
        AppCompatTextView appCompatTextView = abstractC16572emU.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        KWHzl(appCompatTextView, "0");
        AubY();
        getNewProxyInstance();
        AbstractC16572emU abstractC16572emU3 = this.OLrzqt;
        if (abstractC16572emU3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU3 = null;
        }
        abstractC16572emU3.AkhnZx.setVisibility(4);
        AbstractC16572emU abstractC16572emU4 = this.OLrzqt;
        if (abstractC16572emU4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU4 = null;
        }
        abstractC16572emU4.values.setVisibility(0);
        AbstractC16572emU abstractC16572emU5 = this.OLrzqt;
        if (abstractC16572emU5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16572emU2 = abstractC16572emU5;
        }
        abstractC16572emU2.hDKMBd.setVisibility(0);
    }

    public final void uzCIH() {
        KWHzl(2);
        AYXKKw();
        KWHzl(true);
        AbstractC16572emU abstractC16572emU = this.OLrzqt;
        AbstractC16572emU abstractC16572emU2 = null;
        if (abstractC16572emU == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU = null;
        }
        AppCompatTextView appCompatTextView = abstractC16572emU.uzCIH;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        KWHzl(appCompatTextView, "0");
        AbstractC16572emU abstractC16572emU3 = this.OLrzqt;
        if (abstractC16572emU3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU3 = null;
        }
        AppCompatTextView appCompatTextView2 = abstractC16572emU3.getFieldNames;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        KWHzl(appCompatTextView2, "0");
        AubY();
        getNewProxyInstance();
        AbstractC16572emU abstractC16572emU4 = this.OLrzqt;
        if (abstractC16572emU4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU4 = null;
        }
        abstractC16572emU4.values.setVisibility(4);
        AbstractC16572emU abstractC16572emU5 = this.OLrzqt;
        if (abstractC16572emU5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU5 = null;
        }
        abstractC16572emU5.AkhnZx.setVisibility(0);
        AbstractC16572emU abstractC16572emU6 = this.OLrzqt;
        if (abstractC16572emU6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16572emU2 = abstractC16572emU6;
        }
        abstractC16572emU2.hDKMBd.setVisibility(8);
    }

    public final void ejfBZ() {
        C10854bwM c10854bwMFHqPtx;
        C10854bwM c10854bwMFHqPtx2;
        AbstractC16572emU abstractC16572emU = this.OLrzqt;
        java.lang.String strDbNXlk = null;
        if (abstractC16572emU == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU = null;
        }
        C57458yim c57458yim = abstractC16572emU.fetchVPNInfo;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultCallerLauncherresultContract21);
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        java.lang.String strDbNXlk2 = (oKWBaseMultiTransferAEQbTJ == null || (c10854bwMFHqPtx2 = oKWBaseMultiTransferAEQbTJ.fHqPtx()) == null) ? null : c10854bwMFHqPtx2.DbNXlk();
        if (strDbNXlk2 == null) {
            strDbNXlk2 = "";
        }
        c57458yim.setIcon(strAYXKKw, strDbNXlk2, C52761wXj.TaskDescription.aHXSQp);
        AubY();
        AbstractC16572emU abstractC16572emU2 = this.OLrzqt;
        if (abstractC16572emU2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU2 = null;
        }
        abstractC16572emU2.fetchVPNInfo.setVisibility(0);
        AbstractC16572emU abstractC16572emU3 = this.OLrzqt;
        if (abstractC16572emU3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU3 = null;
        }
        C57458yim c57458yim2 = abstractC16572emU3.DbNXlk;
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultCallerLauncherresultContract21);
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ2 != null && (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ2.fHqPtx()) != null) {
            strDbNXlk = c10854bwMFHqPtx.DbNXlk();
        }
        c57458yim2.setIcon(strAYXKKw2, strDbNXlk != null ? strDbNXlk : "", C52761wXj.TaskDescription.aHXSQp);
    }

    public final void fetchVPNInfo() {
        AbstractC16572emU abstractC16572emU = this.OLrzqt;
        AbstractC16572emU abstractC16572emU2 = null;
        if (abstractC16572emU == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU = null;
        }
        ConstraintLayout constraintLayout = abstractC16572emU.valueOf;
        AbstractC16572emU abstractC16572emU3 = this.OLrzqt;
        if (abstractC16572emU3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU3 = null;
        }
        abstractC16572emU3.hDKMBd.getPaint().setFlags(8);
        AbstractC16572emU abstractC16572emU4 = this.OLrzqt;
        if (abstractC16572emU4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU4 = null;
        }
        abstractC16572emU4.hDKMBd.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fZBcTu));
        AbstractC16572emU abstractC16572emU5 = this.OLrzqt;
        if (abstractC16572emU5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16572emU2 = abstractC16572emU5;
        }
        android.widget.TextView textView = abstractC16572emU2.hDKMBd;
        textView.setOnClickListener(new TaskDescription(textView, 1000L, this));
        getFieldNames();
        constraintLayout.setVisibility(0);
    }

    /* JADX INFO: renamed from: o.gft$ActionBar */
    public static final class ActionBar implements Function1<java.lang.Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            copydefault(th);
            return Unit.INSTANCE;
        }

        public final void copydefault(java.lang.Throwable th) {
            C20387gft.this.OLrzqt(false);
        }
    }

    /* JADX INFO: renamed from: o.gft$Application */
    public static final class Application implements Function1<kotlin.Pair<? extends java.lang.Boolean, ? extends java.lang.String>, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(kotlin.Pair<? extends java.lang.Boolean, ? extends java.lang.String> pair) {
            OLrzqt(pair);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(kotlin.Pair<java.lang.Boolean, java.lang.String> pair) {
            C20387gft.this.OLrzqt(false);
        }
    }

    public final void isConnected() {
        C10854bwM c10854bwMFHqPtx;
        AbstractC16572emU abstractC16572emU = this.OLrzqt;
        AbstractC16572emU abstractC16572emU2 = null;
        if (abstractC16572emU == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU = null;
        }
        abstractC16572emU.OLrzqt.setGravity(TextAlign.LEFT);
        AbstractC16572emU abstractC16572emU3 = this.OLrzqt;
        if (abstractC16572emU3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU3 = null;
        }
        abstractC16572emU3.OLrzqt.setTypeface(ResourcesCompat.getFont(requireContext(), C52761wXj.Dialog.EZpvd));
        AbstractC16572emU abstractC16572emU4 = this.OLrzqt;
        if (abstractC16572emU4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU4 = null;
        }
        abstractC16572emU4.OLrzqt.setOnTextWillChange(this.djBIcL);
        AbstractC16572emU abstractC16572emU5 = this.OLrzqt;
        if (abstractC16572emU5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU5 = null;
        }
        C57461yip c57461yip = abstractC16572emU5.OLrzqt;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        c57461yip.setMaxDecimalValue(C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx.DTwDnp())));
        AbstractC16572emU abstractC16572emU6 = this.OLrzqt;
        if (abstractC16572emU6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU6 = null;
        }
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(abstractC16572emU6.OLrzqt, 2, 24, 2, 2);
        AbstractC16572emU abstractC16572emU7 = this.OLrzqt;
        if (abstractC16572emU7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16572emU2 = abstractC16572emU7;
        }
        ConstraintLayout constraintLayout = abstractC16572emU2.djBIcL;
        constraintLayout.setOnClickListener(new Fragment(constraintLayout, 1000L, this));
    }

    public final void DbNXlk() {
        C10854bwM c10854bwMFHqPtx;
        AbstractC16572emU abstractC16572emU = this.OLrzqt;
        AbstractC16572emU abstractC16572emU2 = null;
        if (abstractC16572emU == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU = null;
        }
        abstractC16572emU.copydefault.setGravity(TextAlign.LEFT);
        AbstractC16572emU abstractC16572emU3 = this.OLrzqt;
        if (abstractC16572emU3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU3 = null;
        }
        abstractC16572emU3.copydefault.setTypeface(ResourcesCompat.getFont(requireContext(), C52761wXj.Dialog.EZpvd));
        AbstractC16572emU abstractC16572emU4 = this.OLrzqt;
        if (abstractC16572emU4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU4 = null;
        }
        abstractC16572emU4.copydefault.setOnTextWillChange(this.EZpvd);
        AbstractC16572emU abstractC16572emU5 = this.OLrzqt;
        if (abstractC16572emU5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU5 = null;
        }
        C57461yip c57461yip = abstractC16572emU5.copydefault;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        c57461yip.setMaxDecimalValue(C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx.DTwDnp())));
        AbstractC16572emU abstractC16572emU6 = this.OLrzqt;
        if (abstractC16572emU6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU6 = null;
        }
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(abstractC16572emU6.copydefault, 2, 24, 2, 2);
        AbstractC16572emU abstractC16572emU7 = this.OLrzqt;
        if (abstractC16572emU7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16572emU2 = abstractC16572emU7;
        }
        ConstraintLayout constraintLayout = abstractC16572emU2.gEmmrt;
        constraintLayout.setOnClickListener(new Dialog(constraintLayout, 1000L, this));
    }

    public final void values() {
        C10854bwM c10854bwMFHqPtx;
        AbstractC16572emU abstractC16572emU = this.OLrzqt;
        AbstractC16572emU abstractC16572emU2 = null;
        if (abstractC16572emU == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU = null;
        }
        abstractC16572emU.EZpvd.setGravity(TextAlign.LEFT);
        AbstractC16572emU abstractC16572emU3 = this.OLrzqt;
        if (abstractC16572emU3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU3 = null;
        }
        abstractC16572emU3.EZpvd.setTypeface(ResourcesCompat.getFont(requireContext(), C52761wXj.Dialog.EZpvd));
        AbstractC16572emU abstractC16572emU4 = this.OLrzqt;
        if (abstractC16572emU4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU4 = null;
        }
        abstractC16572emU4.EZpvd.setOnTextWillChange(this.fetchVPNInfo);
        AbstractC16572emU abstractC16572emU5 = this.OLrzqt;
        if (abstractC16572emU5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU5 = null;
        }
        C57461yip c57461yip = abstractC16572emU5.EZpvd;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        c57461yip.setMaxDecimalValue(C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx.DTwDnp())));
        AbstractC16572emU abstractC16572emU6 = this.OLrzqt;
        if (abstractC16572emU6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU6 = null;
        }
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(abstractC16572emU6.EZpvd, 2, 48, 2, 2);
        AbstractC16572emU abstractC16572emU7 = this.OLrzqt;
        if (abstractC16572emU7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU7 = null;
        }
        LinearLayoutCompat linearLayoutCompat = abstractC16572emU7.values;
        linearLayoutCompat.setOnClickListener(new LoaderManager(linearLayoutCompat, 1000L, this));
        KWHzl(1);
        AbstractC16572emU abstractC16572emU8 = this.OLrzqt;
        if (abstractC16572emU8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16572emU2 = abstractC16572emU8;
        }
        AppCompatTextView appCompatTextView = abstractC16572emU2.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        KWHzl(appCompatTextView, "0");
    }

    public final void AkhnZx() {
        AbstractC16572emU abstractC16572emU = this.OLrzqt;
        if (abstractC16572emU == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU = null;
        }
        C52794wYp c52794wYp = abstractC16572emU.KWHzl;
        c52794wYp.setOnClickListener(new FragmentManager(c52794wYp, 1000L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    private final void zuBGHE() {
        C8497bDo c8497bDoUlJrfe;
        AbstractC58185ywX<java.util.Collection<AbstractC9832bcy>> abstractC58185ywXAEQbTJ;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ != null && (c8497bDoUlJrfe = oKWBaseMultiTransferAEQbTJ.UlJrfe()) != null && (abstractC58185ywXAEQbTJ = c8497bDoUlJrfe.AEQbTJ()) != null) {
            final Function1 function1 = new Function1() { // from class: o.gfD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20387gft.AEQbTJ(this.EZpvd, (java.util.Collection) obj);
                }
            };
            abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.gfB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C20387gft.values(function1, obj);
                }
            });
        }
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ2 != null) {
            oKWBaseMultiTransferAEQbTJ2.copydefault(AuCTelauCTel());
        }
    }

    public static final Unit AEQbTJ(C20387gft c20387gft, java.util.Collection collection) {
        c20387gft.wlaJM();
        c20387gft.EZpvd(false);
        c20387gft.zsXlph();
        c20387gft.AubY();
        c20387gft.getFieldNames();
        c20387gft.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    public final void getNewProxyInstance() {
        java.lang.String strAYXKKw;
        AbstractC16572emU abstractC16572emU = this.OLrzqt;
        AbstractC16572emU abstractC16572emU2 = null;
        if (abstractC16572emU == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU = null;
        }
        abstractC16572emU.KWHzl.setEnabled(!zLjUOn());
        AbstractC16572emU abstractC16572emU3 = this.OLrzqt;
        if (abstractC16572emU3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16572emU2 = abstractC16572emU3;
        }
        C52794wYp c52794wYp = abstractC16572emU2.KWHzl;
        if (AuCTel()) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.FHvxmb);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DXXBbs);
        }
        c52794wYp.setText(strAYXKKw);
    }

    public final void OLrzqt(boolean z) {
        AbstractC16572emU abstractC16572emU = null;
        if (z) {
            AbstractC16572emU abstractC16572emU2 = this.OLrzqt;
            if (abstractC16572emU2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16572emU2 = null;
            }
            C52794wYp.startLoading$default(abstractC16572emU2.KWHzl, 0L, 1, null);
            return;
        }
        AbstractC16572emU abstractC16572emU3 = this.OLrzqt;
        if (abstractC16572emU3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16572emU = abstractC16572emU3;
        }
        abstractC16572emU.KWHzl.fIwbmz();
    }

    public final void KWHzl(boolean z) {
        AbstractC16572emU abstractC16572emU = null;
        if (z) {
            AbstractC16572emU abstractC16572emU2 = this.OLrzqt;
            if (abstractC16572emU2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16572emU2 = null;
            }
            abstractC16572emU2.getNewProxyInstance.setVisibility(8);
            AbstractC16572emU abstractC16572emU3 = this.OLrzqt;
            if (abstractC16572emU3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16572emU3 = null;
            }
            abstractC16572emU3.DbNXlk.setVisibility(8);
            AbstractC16572emU abstractC16572emU4 = this.OLrzqt;
            if (abstractC16572emU4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16572emU = abstractC16572emU4;
            }
            abstractC16572emU.AhwBna.setVisibility(0);
            return;
        }
        AbstractC16572emU abstractC16572emU5 = this.OLrzqt;
        if (abstractC16572emU5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU5 = null;
        }
        abstractC16572emU5.AhwBna.setVisibility(8);
        AbstractC16572emU abstractC16572emU6 = this.OLrzqt;
        if (abstractC16572emU6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU6 = null;
        }
        abstractC16572emU6.DbNXlk.setVisibility(0);
        AbstractC16572emU abstractC16572emU7 = this.OLrzqt;
        if (abstractC16572emU7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16572emU = abstractC16572emU7;
        }
        abstractC16572emU.getNewProxyInstance.setVisibility(0);
    }

    public final boolean AuCTel() {
        AbstractC16572emU abstractC16572emU = this.OLrzqt;
        if (abstractC16572emU == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU = null;
        }
        return abstractC16572emU.AYXKKw.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean EZpvd(boolean z) {
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ;
        C10854bwM c10854bwMFHqPtx;
        java.lang.String strN_;
        C8497bDo c8497bDoUlJrfe;
        java.util.HashMap<java.lang.Integer, AbstractC9832bcy> mapCopydefault;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ3;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ4;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ5 = AEQbTJ();
        java.lang.String strFJNWhG = null;
        if (C33129mqd.valueOf(oKWBaseMultiTransferAEQbTJ5 != null ? AbstractC8704bHj.getTransferAmount$default(oKWBaseMultiTransferAEQbTJ5, false, false, 3, null) : null, 0) && (oKWBaseMultiTransferAEQbTJ2 = AEQbTJ()) != null && oKWBaseMultiTransferAEQbTJ2.DTwDnp()) {
            if (!z && (((oKWBaseMultiTransferAEQbTJ3 = AEQbTJ()) == null || !oKWBaseMultiTransferAEQbTJ3.ORxRYg()) && ((oKWBaseMultiTransferAEQbTJ4 = AEQbTJ()) == null || !oKWBaseMultiTransferAEQbTJ4.fvQaOB()))) {
                setErrorInfo$default(this, false, null, null, 6, null);
                return true;
            }
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ6 = AEQbTJ();
            if (oKWBaseMultiTransferAEQbTJ6 == null || !oKWBaseMultiTransferAEQbTJ6.fvQaOB()) {
                java.lang.String string = getString(C13754dXa.FragmentManager.ReportDrawnKtReportDrawn1);
                Intrinsics.checkNotNullExpressionValue(string, "");
                setErrorInfo$default(this, true, string, null, 4, null);
                return false;
            }
        }
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ7 = AEQbTJ();
        AbstractC9832bcy abstractC9832bcy = (oKWBaseMultiTransferAEQbTJ7 == null || (c8497bDoUlJrfe = oKWBaseMultiTransferAEQbTJ7.UlJrfe()) == null || (mapCopydefault = c8497bDoUlJrfe.copydefault()) == null) ? null : mapCopydefault.get(1);
        if (abstractC9832bcy instanceof C9799bcR) {
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ8 = AEQbTJ();
            boolean z2 = oKWBaseMultiTransferAEQbTJ8 != null && oKWBaseMultiTransferAEQbTJ8.DTwDnp();
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ9 = AEQbTJ();
            java.lang.String strAYXKKw = ((oKWBaseMultiTransferAEQbTJ9 == null || !oKWBaseMultiTransferAEQbTJ9.U_()) && ((oKWBaseMultiTransferAEQbTJ = AEQbTJ()) == null || !oKWBaseMultiTransferAEQbTJ.T_())) ? "" : C33070mpX.AYXKKw(C13754dXa.FragmentManager.OqFWZa);
            int i = z2 ? C13754dXa.FragmentManager.ReportDrawn : C13754dXa.FragmentManager.ReportDrawnKtReportDrawnAfter2;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ10 = AEQbTJ();
            java.lang.String localized$default = (oKWBaseMultiTransferAEQbTJ10 == null || (strN_ = oKWBaseMultiTransferAEQbTJ10.N_()) == null) ? null : pTB.formatLocalized$default(strN_, null, 1, null);
            if (localized$default == null) {
                localized$default = "";
            }
            pairArr[0] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, localized$default);
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ11 = AEQbTJ();
            if (oKWBaseMultiTransferAEQbTJ11 != null && (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ11.fHqPtx()) != null) {
                strFJNWhG = c10854bwMFHqPtx.fJNWhG();
            }
            pairArr[1] = C56390yDp.OLrzqt("token", strFJNWhG != null ? strFJNWhG : "");
            copydefault(true, C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)), strAYXKKw);
            return false;
        }
        if (abstractC9832bcy instanceof C9801bcT) {
            iwGUEr();
            return false;
        }
        if (abstractC9832bcy instanceof C9803bcV) {
            iwGUEr();
            return false;
        }
        if (abstractC9832bcy instanceof C9804bcW) {
            iwGUEr();
            return false;
        }
        if (abstractC9832bcy instanceof C9805bcX) {
            setErrorInfo$default(this, !fIwbmz(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ReportDrawnKtReportDrawn2), null, 4, null);
            return false;
        }
        setErrorInfo$default(this, false, null, null, 6, null);
        return true;
    }

    public final void iwGUEr() {
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ;
        java.lang.String strAYXKKw;
        C10854bwM c10854bwMFHqPtx;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = AEQbTJ();
        boolean z = (oKWBaseMultiTransferAEQbTJ2 != null && oKWBaseMultiTransferAEQbTJ2.QOLQEE()) || ((oKWBaseMultiTransferAEQbTJ = AEQbTJ()) != null && oKWBaseMultiTransferAEQbTJ.T_());
        java.lang.String strAYXKKw2 = z ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.OqFWZa) : "";
        if (z) {
            int i = C13754dXa.FragmentManager.ReportDrawnKtReportDrawnAfterfullyDrawnReporter1;
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ3 = AEQbTJ();
            java.lang.String strFJNWhG = (oKWBaseMultiTransferAEQbTJ3 == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ3.fHqPtx()) == null) ? null : c10854bwMFHqPtx.fJNWhG();
            strAYXKKw = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", strFJNWhG != null ? strFJNWhG : "")));
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setRecycleOnMeasureEnabled);
        }
        copydefault(true, strAYXKKw, strAYXKKw2);
    }

    public static /* synthetic */ void setErrorInfo$default(C20387gft c20387gft, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        c20387gft.copydefault(z, str, str2);
    }

    public final void copydefault(boolean z, java.lang.String str, java.lang.String str2) {
        AbstractC16572emU abstractC16572emU = null;
        if (!z) {
            AbstractC16572emU abstractC16572emU2 = this.OLrzqt;
            if (abstractC16572emU2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16572emU = abstractC16572emU2;
            }
            abstractC16572emU.AuCTel.setVisibility(8);
            return;
        }
        AbstractC16572emU abstractC16572emU3 = this.OLrzqt;
        if (abstractC16572emU3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU3 = null;
        }
        AppCompatTextView appCompatTextView = abstractC16572emU3.AuCTel;
        C14731dqw c14731dqw = C14731dqw.AEQbTJ;
        AbstractC16572emU abstractC16572emU4 = this.OLrzqt;
        if (abstractC16572emU4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU4 = null;
        }
        AppCompatTextView appCompatTextView2 = abstractC16572emU4.AuCTel;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView.setText(c14731dqw.AEQbTJ(appCompatTextView2, str, str2, new Function0() { // from class: o.gfv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C20387gft.fARcdN(this.KWHzl);
            }
        }));
        AbstractC16572emU abstractC16572emU5 = this.OLrzqt;
        if (abstractC16572emU5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16572emU = abstractC16572emU5;
        }
        abstractC16572emU.AuCTel.setVisibility(0);
    }

    public static final Unit fARcdN(C20387gft c20387gft) {
        c20387gft.KWHzl(false);
        c20387gft.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    public final void AubY() {
        java.lang.String strC_;
        java.lang.String str;
        C10854bwM c10854bwMFHqPtx;
        C10854bwM c10854bwMFHqPtx2;
        C10854bwM c10854bwMFHqPtx3;
        C10854bwM c10854bwMFHqPtx4;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        AbstractC16572emU abstractC16572emU = null;
        java.lang.String strAubY = oKWBaseMultiTransferAEQbTJ != null ? oKWBaseMultiTransferAEQbTJ.AubY() : null;
        if (strAubY == null) {
            strAubY = "";
        }
        C17946fYd c17946fYd = C17946fYd.AEQbTJ;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ2 == null) {
            return;
        }
        if (c17946fYd.AEQbTJ(oKWBaseMultiTransferAEQbTJ2)) {
            str = "--";
        } else {
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ3 = AEQbTJ();
            int iCopydefault = C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ3 == null || (c10854bwMFHqPtx4 = oKWBaseMultiTransferAEQbTJ3.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx4.valueOf()));
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ4 = AEQbTJ();
            int iCopydefault2 = C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ4 == null || (c10854bwMFHqPtx3 = oKWBaseMultiTransferAEQbTJ4.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx3.AkhnZx()));
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ5 = AEQbTJ();
            java.lang.String strFJNWhG = (oKWBaseMultiTransferAEQbTJ5 == null || (c10854bwMFHqPtx2 = oKWBaseMultiTransferAEQbTJ5.fHqPtx()) == null) ? null : c10854bwMFHqPtx2.fJNWhG();
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ6 = AEQbTJ();
            java.lang.String strEZpvd = C54870xYj.EZpvd(strAubY, iCopydefault, iCopydefault2, strFJNWhG, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : (oKWBaseMultiTransferAEQbTJ6 == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ6.fHqPtx()) == null) ? null : java.lang.Boolean.valueOf(c10854bwMFHqPtx.getNewProxyInstance()), (248 & 64) != 0 ? false : true, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ7 = AEQbTJ();
            if (oKWBaseMultiTransferAEQbTJ7 != null) {
                OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ8 = AEQbTJ();
                java.lang.String strValues = oKWBaseMultiTransferAEQbTJ8 != null ? oKWBaseMultiTransferAEQbTJ8.values(strAubY) : null;
                if (strValues == null) {
                    strValues = "";
                }
                strC_ = oKWBaseMultiTransferAEQbTJ7.c_(strValues);
            } else {
                strC_ = null;
            }
            str = strEZpvd + " (" + strC_ + ")";
        }
        AbstractC16572emU abstractC16572emU2 = this.OLrzqt;
        if (abstractC16572emU2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU2 = null;
        }
        abstractC16572emU2.fetchVPNInfo.setAmount(str);
        AbstractC16572emU abstractC16572emU3 = this.OLrzqt;
        if (abstractC16572emU3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16572emU = abstractC16572emU3;
        }
        abstractC16572emU.DbNXlk.setAmount(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getFieldNames() {
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ;
        int iCopydefault;
        java.lang.String strWlaJM;
        C10854bwM c10854bwMFHqPtx;
        C10854bwM c10854bwMFHqPtx2;
        C10854bwM c10854bwMFHqPtx3;
        C10854bwM c10854bwMFHqPtx4;
        C8497bDo c8497bDoUlJrfe;
        java.util.HashMap<java.lang.Integer, AbstractC9832bcy> mapCopydefault;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = AEQbTJ();
        boolean z = true;
        java.lang.String strEZpvd = null;
        boolValueOf = null;
        java.lang.Boolean boolValueOf = null;
        strEZpvd = null;
        AbstractC9832bcy abstractC9832bcy = (oKWBaseMultiTransferAEQbTJ2 == null || (c8497bDoUlJrfe = oKWBaseMultiTransferAEQbTJ2.UlJrfe()) == null || (mapCopydefault = c8497bDoUlJrfe.copydefault()) == null) ? null : mapCopydefault.get(1);
        if ((abstractC9832bcy instanceof C9801bcT) || (abstractC9832bcy instanceof C9803bcV) || (abstractC9832bcy instanceof C9804bcW)) {
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ3 = AEQbTJ();
            if (oKWBaseMultiTransferAEQbTJ3 != null && oKWBaseMultiTransferAEQbTJ3.DTwDnp() && ((oKWBaseMultiTransferAEQbTJ = AEQbTJ()) == null || !oKWBaseMultiTransferAEQbTJ.fvQaOB())) {
                OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ4 = AEQbTJ();
                if (C33129mqd.valueOf(oKWBaseMultiTransferAEQbTJ4 != null ? AbstractC8704bHj.getTransferAmount$default(oKWBaseMultiTransferAEQbTJ4, false, false, 3, null) : null, 0)) {
                    z = false;
                }
            }
        }
        AbstractC16572emU abstractC16572emU = this.OLrzqt;
        if (abstractC16572emU == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU = null;
        }
        android.widget.TextView textView = abstractC16572emU.fARcdN;
        if (z) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.DQzvGN);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        textView.setTextColor(iCopydefault);
        AbstractC16572emU abstractC16572emU2 = this.OLrzqt;
        if (abstractC16572emU2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU2 = null;
        }
        android.widget.TextView textView2 = abstractC16572emU2.fARcdN;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ5 = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ5 != null && (strWlaJM = oKWBaseMultiTransferAEQbTJ5.wlaJM()) != null) {
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ6 = AEQbTJ();
            int iCopydefault2 = C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ6 == null || (c10854bwMFHqPtx4 = oKWBaseMultiTransferAEQbTJ6.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx4.valueOf()));
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ7 = AEQbTJ();
            int iCopydefault3 = C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ7 == null || (c10854bwMFHqPtx3 = oKWBaseMultiTransferAEQbTJ7.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx3.AkhnZx()));
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ8 = AEQbTJ();
            java.lang.String strFJNWhG = (oKWBaseMultiTransferAEQbTJ8 == null || (c10854bwMFHqPtx2 = oKWBaseMultiTransferAEQbTJ8.fHqPtx()) == null) ? null : c10854bwMFHqPtx2.fJNWhG();
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ9 = AEQbTJ();
            if (oKWBaseMultiTransferAEQbTJ9 != null && (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ9.fHqPtx()) != null) {
                boolValueOf = java.lang.Boolean.valueOf(c10854bwMFHqPtx.getNewProxyInstance());
            }
            strEZpvd = C54870xYj.EZpvd(strWlaJM, iCopydefault2, iCopydefault3, strFJNWhG, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : boolValueOf, (248 & 64) != 0 ? false : true, (248 & 128) != 0 ? RoundingMode.DOWN : null);
        }
        textView2.setText(strEZpvd);
    }

    public final void zsXlph() {
        AbstractC16572emU abstractC16572emU = this.OLrzqt;
        if (abstractC16572emU == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU = null;
        }
        C57460yio c57460yio = abstractC16572emU.getNewProxyInstance;
        c57460yio.setDeleteCallback(new Function1() { // from class: o.gfA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20387gft.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        });
        C17946fYd c17946fYd = C17946fYd.AEQbTJ;
        android.content.Context context = c57460yio.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ == null) {
            return;
        }
        c57460yio.setBean(c17946fYd.copydefault(context, true, oKWBaseMultiTransferAEQbTJ));
    }

    public static final Unit copydefault(C20387gft c20387gft, int i) {
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = c20387gft.AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ != null) {
            oKWBaseMultiTransferAEQbTJ.AEQbTJ(i);
        }
        c20387gft.zsXlph();
        c20387gft.AubY();
        return Unit.INSTANCE;
    }

    public final void KWHzl(int i) {
        java.lang.String strAEQbTJ;
        MultiTransferSignData multiTransferSignData;
        java.lang.String minAmount;
        C10854bwM c10854bwMFHqPtx;
        this.KWHzl = i;
        AbstractC16572emU abstractC16572emU = null;
        if (i == 1) {
            AbstractC16572emU abstractC16572emU2 = this.OLrzqt;
            if (abstractC16572emU2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16572emU2 = null;
            }
            C55030xcJ c55030xcJ = abstractC16572emU2.AYXKKw;
            AbstractC16572emU abstractC16572emU3 = this.OLrzqt;
            if (abstractC16572emU3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16572emU3 = null;
            }
            c55030xcJ.setEditable(abstractC16572emU3.EZpvd.KWHzl());
            AbstractC16572emU abstractC16572emU4 = this.OLrzqt;
            if (abstractC16572emU4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16572emU4 = null;
            }
            abstractC16572emU4.EZpvd.setPlainNumericText(OLrzqt());
            AbstractC16572emU abstractC16572emU5 = this.OLrzqt;
            if (abstractC16572emU5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16572emU = abstractC16572emU5;
            }
            C57461yip c57461yip = abstractC16572emU.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c57461yip, "");
            OLrzqt(c57461yip, KWHzl());
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            AbstractC16572emU abstractC16572emU6 = this.OLrzqt;
            if (abstractC16572emU6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16572emU6 = null;
            }
            C55030xcJ c55030xcJ2 = abstractC16572emU6.AYXKKw;
            AbstractC16572emU abstractC16572emU7 = this.OLrzqt;
            if (abstractC16572emU7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16572emU7 = null;
            }
            c55030xcJ2.setEditable(abstractC16572emU7.copydefault.KWHzl());
            AbstractC16572emU abstractC16572emU8 = this.OLrzqt;
            if (abstractC16572emU8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16572emU8 = null;
            }
            abstractC16572emU8.copydefault.setPlainNumericText(copydefault());
            gEmmrt();
            AbstractC16572emU abstractC16572emU9 = this.OLrzqt;
            if (abstractC16572emU9 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16572emU = abstractC16572emU9;
            }
            C57461yip c57461yip2 = abstractC16572emU.copydefault;
            Intrinsics.checkNotNullExpressionValue(c57461yip2, "");
            OLrzqt(c57461yip2, EZpvd());
            return;
        }
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ == null || (multiTransferSignData = (MultiTransferSignData) oKWBaseMultiTransferAEQbTJ.QVsKAR()) == null || (minAmount = multiTransferSignData.getMinAmount()) == null) {
            strAEQbTJ = null;
        } else {
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = AEQbTJ();
            strAEQbTJ = C54870xYj.AEQbTJ(minAmount, C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ2 == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ2.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx.valueOf())));
        }
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        AbstractC16572emU abstractC16572emU10 = this.OLrzqt;
        if (abstractC16572emU10 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU10 = null;
        }
        C55030xcJ c55030xcJ3 = abstractC16572emU10.AYXKKw;
        AbstractC16572emU abstractC16572emU11 = this.OLrzqt;
        if (abstractC16572emU11 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU11 = null;
        }
        c55030xcJ3.setEditable(abstractC16572emU11.OLrzqt.KWHzl());
        AbstractC16572emU abstractC16572emU12 = this.OLrzqt;
        if (abstractC16572emU12 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU12 = null;
        }
        abstractC16572emU12.OLrzqt.setPlainNumericText(strAEQbTJ);
        AYXKKw();
        AbstractC16572emU abstractC16572emU13 = this.OLrzqt;
        if (abstractC16572emU13 == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU13 = null;
        }
        C57461yip c57461yip3 = abstractC16572emU13.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c57461yip3, "");
        OLrzqt(c57461yip3, pTB.formatLocalized$default(strAEQbTJ, null, 1, null));
    }

    public final void wlaJM() {
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ2 == null || !oKWBaseMultiTransferAEQbTJ2.ORxRYg() || (oKWBaseMultiTransferAEQbTJ = AEQbTJ()) == null || !oKWBaseMultiTransferAEQbTJ.U_()) {
            return;
        }
        AbstractC16572emU abstractC16572emU = this.OLrzqt;
        AbstractC16572emU abstractC16572emU2 = null;
        if (abstractC16572emU == null) {
            Intrinsics.gEmmrt("");
            abstractC16572emU = null;
        }
        abstractC16572emU.EZpvd.setPlainNumericText(OLrzqt());
        if (AuCTel()) {
            AbstractC16572emU abstractC16572emU3 = this.OLrzqt;
            if (abstractC16572emU3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16572emU2 = abstractC16572emU3;
            }
            C57461yip c57461yip = abstractC16572emU2.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c57461yip, "");
            OLrzqt(c57461yip, KWHzl());
            return;
        }
        djBIcL();
    }

    public final void OLrzqt(C57461yip c57461yip, java.lang.CharSequence charSequence) {
        C10854bwM c10854bwMFHqPtx;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        java.lang.String strFJNWhG = (oKWBaseMultiTransferAEQbTJ == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ.fHqPtx()) == null) ? null : c10854bwMFHqPtx.fJNWhG();
        if (strFJNWhG == null) {
            strFJNWhG = "";
        }
        java.lang.String str = strFJNWhG;
        c57461yip.setAmountAndSymbol(charSequence, C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.gfq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20387gft.KWHzl((java.util.List) obj);
            }
        }, 14, null));
    }

    public static final Unit KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)));
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        C10854bwM c10854bwMFHqPtx;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        AbstractC16572emU abstractC16572emU = null;
        java.lang.String strFJNWhG = (oKWBaseMultiTransferAEQbTJ == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ.fHqPtx()) == null) ? null : c10854bwMFHqPtx.fJNWhG();
        if (strFJNWhG == null) {
            strFJNWhG = "";
        }
        java.lang.String strKWHzl = KWHzl();
        java.lang.String str = strKWHzl + " " + strFJNWhG;
        AbstractC16572emU abstractC16572emU2 = this.OLrzqt;
        if (abstractC16572emU2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16572emU = abstractC16572emU2;
        }
        C57461yip c57461yip = abstractC16572emU.EZpvd;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, strKWHzl.length(), 17);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), str.length() - strFJNWhG.length(), str.length(), 17);
        c57461yip.setTextByAnimation(new android.text.SpannedString(spannableStringBuilder));
    }

    public final java.lang.String OLrzqt() {
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ;
        java.lang.String strAEQbTJ;
        C10854bwM c10854bwMFHqPtx;
        java.lang.String transferAmount$default;
        C10854bwM c10854bwMFHqPtx2;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = AEQbTJ();
        if ((oKWBaseMultiTransferAEQbTJ2 == null || !oKWBaseMultiTransferAEQbTJ2.U_()) && (oKWBaseMultiTransferAEQbTJ = AEQbTJ()) != null && oKWBaseMultiTransferAEQbTJ.ORxRYg()) {
            return "0";
        }
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ3 = AEQbTJ();
        java.lang.Integer numValueOf = null;
        if (oKWBaseMultiTransferAEQbTJ3 == null || (transferAmount$default = AbstractC8704bHj.getTransferAmount$default(oKWBaseMultiTransferAEQbTJ3, false, false, 3, null)) == null) {
            strAEQbTJ = null;
        } else {
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ4 = AEQbTJ();
            strAEQbTJ = C54870xYj.AEQbTJ(transferAmount$default, C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ4 == null || (c10854bwMFHqPtx2 = oKWBaseMultiTransferAEQbTJ4.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx2.valueOf())));
        }
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(strAEQbTJ);
        RoundingMode roundingMode = RoundingMode.DOWN;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ5 = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ5 != null && (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ5.fHqPtx()) != null) {
            numValueOf = java.lang.Integer.valueOf(c10854bwMFHqPtx.DTwDnp());
        }
        return C54862xYb.KWHzl(bigDecimalEZpvd, false, numValueOf, roundingMode);
    }

    public final java.lang.String KWHzl() {
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ;
        java.lang.String strAEQbTJ;
        C10854bwM c10854bwMFHqPtx;
        java.lang.String transferAmount$default;
        C10854bwM c10854bwMFHqPtx2;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = AEQbTJ();
        if ((oKWBaseMultiTransferAEQbTJ2 == null || !oKWBaseMultiTransferAEQbTJ2.U_()) && (oKWBaseMultiTransferAEQbTJ = AEQbTJ()) != null && oKWBaseMultiTransferAEQbTJ.ORxRYg()) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.dvKsVJ);
        }
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ3 = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ3 == null || (transferAmount$default = AbstractC8704bHj.getTransferAmount$default(oKWBaseMultiTransferAEQbTJ3, false, false, 3, null)) == null) {
            strAEQbTJ = null;
        } else {
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ4 = AEQbTJ();
            strAEQbTJ = C54870xYj.AEQbTJ(transferAmount$default, C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ4 == null || (c10854bwMFHqPtx2 = oKWBaseMultiTransferAEQbTJ4.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx2.valueOf())));
        }
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(strAEQbTJ);
        RoundingMode roundingMode = RoundingMode.DOWN;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ5 = AEQbTJ();
        return pTB.formatLocalized$default(C54862xYb.KWHzl(bigDecimalEZpvd, false, (oKWBaseMultiTransferAEQbTJ5 == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ5.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx.DTwDnp()), roundingMode), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gEmmrt() {
        java.lang.String localized$default;
        MultiTransferSignData multiTransferSignData;
        java.lang.String minAmount;
        C10854bwM c10854bwMFHqPtx;
        C10854bwM c10854bwMFHqPtx2;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        AbstractC16572emU abstractC16572emU = null;
        java.lang.String strFJNWhG = (oKWBaseMultiTransferAEQbTJ == null || (c10854bwMFHqPtx2 = oKWBaseMultiTransferAEQbTJ.fHqPtx()) == null) ? null : c10854bwMFHqPtx2.fJNWhG();
        if (strFJNWhG == null) {
            strFJNWhG = "";
        }
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ2 == null || (multiTransferSignData = (MultiTransferSignData) oKWBaseMultiTransferAEQbTJ2.QVsKAR()) == null || (minAmount = multiTransferSignData.getMinAmount()) == null) {
            localized$default = null;
        } else {
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ3 = AEQbTJ();
            java.lang.String strAEQbTJ = C54870xYj.AEQbTJ(minAmount, C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ3 == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ3.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx.valueOf())));
            if (strAEQbTJ != null) {
                localized$default = pTB.formatLocalized$default(strAEQbTJ, null, 1, null);
            }
        }
        if (localized$default == null) {
            localized$default = "";
        }
        java.lang.String str = localized$default + " " + strFJNWhG;
        AbstractC16572emU abstractC16572emU2 = this.OLrzqt;
        if (abstractC16572emU2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16572emU = abstractC16572emU2;
        }
        C57461yip c57461yip = abstractC16572emU.OLrzqt;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, localized$default.length(), 17);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), str.length() - strFJNWhG.length(), str.length(), 17);
        c57461yip.setTextByAnimation(new android.text.SpannedString(spannableStringBuilder));
    }

    public final void AYXKKw() {
        C10854bwM c10854bwMFHqPtx;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        AbstractC16572emU abstractC16572emU = null;
        java.lang.String strFJNWhG = (oKWBaseMultiTransferAEQbTJ == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ.fHqPtx()) == null) ? null : c10854bwMFHqPtx.fJNWhG();
        if (strFJNWhG == null) {
            strFJNWhG = "";
        }
        java.lang.String strEZpvd = EZpvd();
        java.lang.String str = strEZpvd + " " + strFJNWhG;
        AbstractC16572emU abstractC16572emU2 = this.OLrzqt;
        if (abstractC16572emU2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16572emU = abstractC16572emU2;
        }
        C57461yip c57461yip = abstractC16572emU.copydefault;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, strEZpvd.length(), 17);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), str.length() - strFJNWhG.length(), str.length(), 17);
        c57461yip.setTextByAnimation(new android.text.SpannedString(spannableStringBuilder));
    }

    public final java.lang.String copydefault() {
        java.lang.String strAEQbTJ;
        MultiTransferSignData multiTransferSignData;
        java.lang.String maxAmount;
        C10854bwM c10854bwMFHqPtx;
        if (fIwbmz()) {
            return "0";
        }
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        java.lang.Integer numValueOf = null;
        if (oKWBaseMultiTransferAEQbTJ == null || (multiTransferSignData = (MultiTransferSignData) oKWBaseMultiTransferAEQbTJ.QVsKAR()) == null || (maxAmount = multiTransferSignData.getMaxAmount()) == null) {
            strAEQbTJ = null;
        } else {
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = AEQbTJ();
            if (oKWBaseMultiTransferAEQbTJ2 != null && (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ2.fHqPtx()) != null) {
                numValueOf = java.lang.Integer.valueOf(c10854bwMFHqPtx.valueOf());
            }
            strAEQbTJ = C54870xYj.AEQbTJ(maxAmount, C11600cUg.copydefault(numValueOf));
        }
        return strAEQbTJ == null ? "" : strAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd() {
        java.lang.String localized$default;
        MultiTransferSignData multiTransferSignData;
        java.lang.String maxAmount;
        C10854bwM c10854bwMFHqPtx;
        if (fIwbmz()) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.fZBcTu);
        }
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ == null || (multiTransferSignData = (MultiTransferSignData) oKWBaseMultiTransferAEQbTJ.QVsKAR()) == null || (maxAmount = multiTransferSignData.getMaxAmount()) == null) {
            localized$default = null;
        } else {
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = AEQbTJ();
            java.lang.String strAEQbTJ = C54870xYj.AEQbTJ(maxAmount, C11600cUg.copydefault((oKWBaseMultiTransferAEQbTJ2 == null || (c10854bwMFHqPtx = oKWBaseMultiTransferAEQbTJ2.fHqPtx()) == null) ? null : java.lang.Integer.valueOf(c10854bwMFHqPtx.valueOf())));
            if (strAEQbTJ != null) {
                localized$default = pTB.formatLocalized$default(strAEQbTJ, null, 1, null);
            }
        }
        return localized$default == null ? "" : localized$default;
    }

    public final void KWHzl(android.widget.TextView textView, java.lang.String str) {
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ;
        java.lang.String strAYXKKw;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = AEQbTJ();
        if ((oKWBaseMultiTransferAEQbTJ2 == null || !oKWBaseMultiTransferAEQbTJ2.U_()) && (oKWBaseMultiTransferAEQbTJ = AEQbTJ()) != null && oKWBaseMultiTransferAEQbTJ.ORxRYg()) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getCallerInput);
        } else {
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ3 = AEQbTJ();
            strAYXKKw = oKWBaseMultiTransferAEQbTJ3 != null ? oKWBaseMultiTransferAEQbTJ3.c_(str) : null;
        }
        textView.setText(strAYXKKw);
    }

    private final boolean zLjUOn() {
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ;
        C8497bDo c8497bDoUlJrfe;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = AEQbTJ();
        AbstractC9832bcy abstractC9832bcyAEQbTJ = (oKWBaseMultiTransferAEQbTJ2 == null || (c8497bDoUlJrfe = oKWBaseMultiTransferAEQbTJ2.UlJrfe()) == null) ? null : c8497bDoUlJrfe.AEQbTJ(1);
        if ((abstractC9832bcyAEQbTJ instanceof C9799bcR) || (abstractC9832bcyAEQbTJ instanceof C9801bcT) || (abstractC9832bcyAEQbTJ instanceof C9803bcV) || (abstractC9832bcyAEQbTJ instanceof C9804bcW) || (abstractC9832bcyAEQbTJ instanceof C9805bcX)) {
            return true;
        }
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ3 = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ3 != null && oKWBaseMultiTransferAEQbTJ3.DTwDnp() && ((oKWBaseMultiTransferAEQbTJ = AEQbTJ()) == null || !oKWBaseMultiTransferAEQbTJ.fvQaOB())) {
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ4 = AEQbTJ();
            if (C33129mqd.valueOf(oKWBaseMultiTransferAEQbTJ4 != null ? AbstractC8704bHj.getTransferAmount$default(oKWBaseMultiTransferAEQbTJ4, false, false, 3, null) : null, 0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean fIwbmz() {
        MultiTransferSignData multiTransferSignData;
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ == null || !oKWBaseMultiTransferAEQbTJ.DTwDnp()) {
            OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ2 = AEQbTJ();
            if (Intrinsics.EZpvd((java.lang.Object) ((oKWBaseMultiTransferAEQbTJ2 == null || (multiTransferSignData = (MultiTransferSignData) oKWBaseMultiTransferAEQbTJ2.QVsKAR()) == null) ? null : multiTransferSignData.getMaxAmount()), (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
                return true;
            }
        }
        return false;
    }

    private final void EZpvd(boolean z, java.lang.String str) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setHomeButtonEnabled);
        if (str == null || str.length() == 0) {
            str = strAYXKKw;
        }
        viewOnClickListenerC54939xaY.EZpvd(str);
        if (z) {
            viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.DGUQLIdZmdUa, new View.OnClickListener() { // from class: o.gfO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C20387gft.KWHzl(viewOnClickListenerC54939xaY, this, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.keySet, new View.OnClickListener() { // from class: o.gfP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C20387gft.AEQbTJ(viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C20387gft c20387gft, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        c20387gft.fJNWhG();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C20387gft c20387gft, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        FragmentActivity activity = c20387gft.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC58217yxC interfaceC58217yxC = this.AhwBna;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.valueOf;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC3 = this.AYXKKw;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC4 = this.gEmmrt;
        if (interfaceC58217yxC4 != null) {
            interfaceC58217yxC4.dispose();
        }
        OKWBaseMultiTransfer<?, ?> oKWBaseMultiTransferAEQbTJ = AEQbTJ();
        if (oKWBaseMultiTransferAEQbTJ != null) {
            oKWBaseMultiTransferAEQbTJ.KWHzl(AuCTelauCTel());
        }
    }
}

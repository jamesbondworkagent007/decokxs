package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.biz.core.error.FingerprintLog;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18553fka extends AbstractActivityC33013moT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public AbstractC16321ehi AEQbTJ;
    public final C17230eyq EZpvd;
    public java.util.List<java.lang.String> KWHzl;
    public final C59534zip OLrzqt;

    public ActivityC18553fka() {
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        this.KWHzl = arrayList;
        this.OLrzqt = new C59534zip(arrayList);
        this.EZpvd = new C17230eyq(null, 1, null);
    }

    /* JADX INFO: renamed from: o.fka$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fka.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void AEQbTJ(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            activity.startActivity(KWHzl(activity));
        }

        public final android.content.Intent KWHzl(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            return new android.content.Intent(activity, (java.lang.Class<?>) ActivityC18553fka.class);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC16321ehi abstractC16321ehi = (AbstractC16321ehi) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.getFieldNames);
        this.AEQbTJ = abstractC16321ehi;
        AbstractC16321ehi abstractC16321ehi2 = null;
        if (abstractC16321ehi == null) {
            Intrinsics.gEmmrt("");
            abstractC16321ehi = null;
        }
        abstractC16321ehi.AEQbTJ.setTitleTypeface("harmony_sans_bold.ttf");
        AbstractC16321ehi abstractC16321ehi3 = this.AEQbTJ;
        if (abstractC16321ehi3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16321ehi3 = null;
        }
        abstractC16321ehi3.OLrzqt.setLayoutManager(new LinearLayoutManager(this));
        AbstractC16321ehi abstractC16321ehi4 = this.AEQbTJ;
        if (abstractC16321ehi4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16321ehi2 = abstractC16321ehi4;
        }
        abstractC16321ehi2.OLrzqt.setAdapter(this.OLrzqt);
        EZpvd();
        AEQbTJ();
        copydefault();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fkc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18553fka.copydefault(this.KWHzl);
            }
        });
    }

    public static final void copydefault(ActivityC18553fka activityC18553fka) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18553fka, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void copydefault() {
        AbstractC16321ehi abstractC16321ehi = this.AEQbTJ;
        if (abstractC16321ehi == null) {
            Intrinsics.gEmmrt("");
            abstractC16321ehi = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(abstractC16321ehi.KWHzl).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.fkh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18553fka.KWHzl(this.KWHzl, obj);
            }
        });
    }

    public static final void KWHzl(ActivityC18553fka activityC18553fka, java.lang.Object obj) {
        activityC18553fka.KWHzl();
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void OLrzqt() {
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.fkg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18553fka.KWHzl(this.OLrzqt, (java.util.List) obj);
            }
        };
        addDisposable(abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58227yxM() { // from class: o.fkj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18553fka.AEQbTJ(function1, obj);
            }
        }));
        AbstractC58177ywP abstractC58177ywPOLrzqt = C10337bmZ.KWHzl.OLrzqt();
        InterfaceC58222yxH interfaceC58222yxH = new InterfaceC58222yxH() { // from class: o.fki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                ActivityC18553fka.KWHzl(this.KWHzl);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fkl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18553fka.OLrzqt(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCCopydefault = abstractC58177ywPOLrzqt.copydefault(interfaceC58222yxH, new InterfaceC58227yxM() { // from class: o.fko
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18553fka.copydefault(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCCopydefault, "");
        addDisposable(interfaceC58217yxCCopydefault);
    }

    public static final Unit KWHzl(ActivityC18553fka activityC18553fka, java.util.List list) {
        C17230eyq c17230eyq = activityC18553fka.EZpvd;
        Intrinsics.copydefault(list);
        c17230eyq.AEQbTJ(list);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ActivityC18553fka activityC18553fka) {
        C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).EZpvd(WalletStatus.NoWallet);
        C21256gwN.Companion.OLrzqt();
        RxBus.AEQbTJ(new xXO());
        RxBus.AEQbTJ(new xXM());
        C13912dbY.copydefault.AEQbTJ(true);
        fPD fpd = fPD.copydefault;
        fpd.copydefault(true);
        fpd.OLrzqt(true);
        C10856bwO.EZpvd(activityC18553fka.getTAG(), new FingerprintLog("delFingerprint forgot reset"));
        C14471dmA.EZpvd.EZpvd();
        activityC18553fka.setResult(-1);
        activityC18553fka.finish();
        dZK.AEQbTJ.AEQbTJ(activityC18553fka, new EnterWalletMainBean(java.lang.Boolean.TRUE, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null));
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC18553fka activityC18553fka, java.lang.Throwable th) {
        C6777aVl.Companion.EZpvd(new java.lang.Throwable("Defi: reset wallet failed. Message: " + th.getMessage()));
        pUU.copydefault(activityC18553fka.getTAG(), "handleResetWallet error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    private final void AEQbTJ() {
        AbstractC16321ehi abstractC16321ehi = this.AEQbTJ;
        if (abstractC16321ehi == null) {
            Intrinsics.gEmmrt("");
            abstractC16321ehi = null;
        }
        android.widget.ImageView imageView = abstractC16321ehi.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/web3_wallet/android/ic_reset_wallet_tip.webp", this, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : C52761wXj.TaskDescription.QTtQrx, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        java.util.List<java.lang.String> list = this.KWHzl;
        java.lang.String string = getString(C13754dXa.FragmentManager.isGmsPickerAvailableactivity_release);
        Intrinsics.checkNotNullExpressionValue(string, "");
        list.add(string);
        java.util.List<java.lang.String> list2 = this.KWHzl;
        java.lang.String string2 = getString(C13754dXa.FragmentManager.getACTION_SYSTEM_FALLBACK_PICK_IMAGESannotations);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        list2.add(string2);
        java.util.List<java.lang.String> list3 = this.KWHzl;
        java.lang.String string3 = getString(C13754dXa.FragmentManager.getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAXannotations);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        list3.add(string3);
        C33064mpR.OLrzqt(this.OLrzqt, this.KWHzl);
    }

    private final void EZpvd() {
        this.OLrzqt.register(java.lang.String.class, new C18805fpO(new Function1() { // from class: o.fkf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18553fka.KWHzl(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        }));
    }

    public static final Unit KWHzl(ActivityC18553fka activityC18553fka, int i) {
        AbstractC16321ehi abstractC16321ehi = activityC18553fka.AEQbTJ;
        if (abstractC16321ehi == null) {
            Intrinsics.gEmmrt("");
            abstractC16321ehi = null;
        }
        abstractC16321ehi.KWHzl.setEnabled(i == 3);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, android.view.View] */
    private final void KWHzl() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? Inflate = android.view.LayoutInflater.from(this).inflate(C13754dXa.TaskDescription.isTimeProfileEmpty, (android.view.ViewGroup) null);
        objectRef.element = Inflate;
        android.view.View viewFindViewById = Inflate.findViewById(C13754dXa.ActionBar.DQnQnb);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        T t = objectRef.element;
        Intrinsics.checkNotNullExpressionValue(t, "");
        viewOnClickListenerC54939xaY.EZpvd((android.view.View) t);
        ((android.widget.EditText) viewFindViewById).addTextChangedListener(new TaskDescription(objectRef2, viewOnClickListenerC54939xaY));
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AnyThread));
        viewOnClickListenerC54939xaY.EZpvd(C33061mpO.setupSpanStyles$default(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaVideoOnly), C56423yEv.EZpvd(C56390yDp.OLrzqt("text", C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsRequestMultiplePermissions)))), new java.lang.String[]{C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsRequestMultiplePermissions)}, 0, null, false, new Function1() { // from class: o.fkk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18553fka.OLrzqt(objectRef, (java.util.List) obj);
            }
        }, 14, null));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickContact), new View.OnClickListener() { // from class: o.fkn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18553fka.AEQbTJ(viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsOpenDocument), new View.OnClickListener() { // from class: o.fkm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18553fka.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        android.widget.TextView textViewEZpvd = viewOnClickListenerC54939xaY.EZpvd();
        if (textViewEZpvd != null) {
            textViewEZpvd.setEnabled(false);
        }
        android.widget.TextView textViewEZpvd2 = viewOnClickListenerC54939xaY.EZpvd();
        if (textViewEZpvd2 != null) {
            textViewEZpvd2.setAlpha(0.2f);
        }
        android.widget.TextView textViewEZpvd3 = viewOnClickListenerC54939xaY.EZpvd();
        if (textViewEZpvd3 != null) {
            textViewEZpvd3.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPRGtXKCDKRTZD));
        }
        if (C33492mxV.OLrzqt()) {
            android.view.Window window = getWindow();
            if (window != null) {
                window.setDimAmount(0.85f);
                return;
            }
            return;
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.4f);
        }
    }

    /* JADX INFO: renamed from: o.fka$TaskDescription */
    public static final class TaskDescription implements android.text.TextWatcher {
        public final /* synthetic */ Ref.ObjectRef<java.lang.String> AEQbTJ;
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription(Ref.ObjectRef<java.lang.String> objectRef, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = objectRef;
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v14, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void afterTextChanged(android.text.Editable editable) {
            T t;
            Ref.ObjectRef<java.lang.String> objectRef = this.AEQbTJ;
            if (editable != null) {
                java.lang.String string = editable.toString();
                t = string;
                if (string == null) {
                    t = "";
                }
            }
            objectRef.element = t;
            if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ.element, (java.lang.Object) C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsRequestMultiplePermissions))) {
                android.widget.TextView textViewEZpvd = this.EZpvd.EZpvd();
                if (textViewEZpvd != null) {
                    textViewEZpvd.setAlpha(1.0f);
                }
            } else {
                android.widget.TextView textViewEZpvd2 = this.EZpvd.EZpvd();
                if (textViewEZpvd2 != null) {
                    textViewEZpvd2.setAlpha(0.2f);
                }
            }
            android.widget.TextView textViewEZpvd3 = this.EZpvd.EZpvd();
            if (textViewEZpvd3 != null) {
                textViewEZpvd3.setEnabled(Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ.element, (java.lang.Object) C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsRequestMultiplePermissions)));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(Ref.ObjectRef objectRef, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(((android.view.View) objectRef.element).getContext(), C13754dXa.LoaderManager.fIwbmz));
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, ActivityC18553fka activityC18553fka, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        activityC18553fka.OLrzqt();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
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

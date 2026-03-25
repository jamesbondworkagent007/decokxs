package o;

import android.view.View;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.ActivityC18691fnF;
import o.ActivityC18750foL;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC32801mkT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fjK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18484fjK extends AbstractActivityC33013moT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final C17237eyx AEQbTJ;
    public java.lang.String AYXKKw;
    public int EZpvd;
    public ViewOnClickListenerC54939xaY KWHzl;
    public C16318ehf OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    public ActivityC18484fjK() {
        C12827cuN.Application application = C12827cuN.Companion;
        this.AEQbTJ = new C17237eyx(new C17262ezV(C12827cuN.Application.getInstance$default(application, null, 1, null), null, null, 6, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, new C17241ezA(new C17262ezV(C12827cuN.Application.getInstance$default(application, null, 1, null), null, null, 6, null)), 0 == true ? 1 : 0, 22, null);
        this.EZpvd = 1;
    }

    /* JADX INFO: renamed from: o.fjK$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fjK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ void startActivity$default(StateListAnimator stateListAnimator, android.content.Context context, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 4) != 0) {
                str = null;
            }
            stateListAnimator.KWHzl(context, i, str);
        }

        public final void KWHzl(@NotNull android.content.Context context, int i, java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18484fjK.class);
            if (str != null) {
                intent.putExtra("id", str);
            }
            intent.putExtra("type", i);
            context.startActivity(intent);
        }
    }

    private final void copydefault() {
        android.content.Intent intent = getIntent();
        this.EZpvd = intent != null ? intent.getIntExtra("type", 1) : 1;
        android.content.Intent intent2 = getIntent();
        if (intent2 == null || !intent2.hasExtra("id")) {
            return;
        }
        android.content.Intent intent3 = getIntent();
        this.AYXKKw = intent3 != null ? intent3.getStringExtra("id") : null;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        copydefault();
        C16318ehf c16318ehfAEQbTJ = C16318ehf.AEQbTJ(getLayoutInflater());
        this.OLrzqt = c16318ehfAEQbTJ;
        if (c16318ehfAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c16318ehfAEQbTJ = null;
        }
        setContentView(c16318ehfAEQbTJ.getRoot());
        KWHzl();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fjU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18484fjK.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final void AEQbTJ(ActivityC18484fjK activityC18484fjK) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18484fjK, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void KWHzl() {
        C16318ehf c16318ehf = this.OLrzqt;
        C16318ehf c16318ehf2 = null;
        if (c16318ehf == null) {
            Intrinsics.gEmmrt("");
            c16318ehf = null;
        }
        android.widget.ImageView imageView = c16318ehf.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C14677dpv.OLrzqt(imageView, CDNSourceManager.ImageSource.ImportSecurityIcon);
        C16318ehf c16318ehf3 = this.OLrzqt;
        if (c16318ehf3 == null) {
            Intrinsics.gEmmrt("");
            c16318ehf3 = null;
        }
        c16318ehf3.OLrzqt.setAppBarTitle(getString(C13754dXa.FragmentManager.ActivityResultContractsOpenDocumentTree));
        C16318ehf c16318ehf4 = this.OLrzqt;
        if (c16318ehf4 == null) {
            Intrinsics.gEmmrt("");
            c16318ehf4 = null;
        }
        c16318ehf4.OLrzqt.setTitleTypeface("harmony_sans_bold.ttf");
        C16318ehf c16318ehf5 = this.OLrzqt;
        if (c16318ehf5 == null) {
            Intrinsics.gEmmrt("");
            c16318ehf5 = null;
        }
        c16318ehf5.AhwBna.setText(getString(C13754dXa.FragmentManager.OStAOF));
        if (this.EZpvd == 2) {
            C16318ehf c16318ehf6 = this.OLrzqt;
            if (c16318ehf6 == null) {
                Intrinsics.gEmmrt("");
                c16318ehf6 = null;
            }
            c16318ehf6.EZpvd.setText(getString(C13754dXa.FragmentManager.ActivityResultContractsGetMultipleContentsCompanion));
            C16318ehf c16318ehf7 = this.OLrzqt;
            if (c16318ehf7 == null) {
                Intrinsics.gEmmrt("");
                c16318ehf7 = null;
            }
            C52794wYp c52794wYp = c16318ehf7.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(0);
        } else {
            C16318ehf c16318ehf8 = this.OLrzqt;
            if (c16318ehf8 == null) {
                Intrinsics.gEmmrt("");
                c16318ehf8 = null;
            }
            c16318ehf8.EZpvd.setText(getString(C13754dXa.FragmentManager.ActivityResultContractsOpenDocument));
            C16318ehf c16318ehf9 = this.OLrzqt;
            if (c16318ehf9 == null) {
                Intrinsics.gEmmrt("");
                c16318ehf9 = null;
            }
            C52794wYp c52794wYp2 = c16318ehf9.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(8);
        }
        C16318ehf c16318ehf10 = this.OLrzqt;
        if (c16318ehf10 == null) {
            Intrinsics.gEmmrt("");
            c16318ehf10 = null;
        }
        C52794wYp c52794wYp3 = c16318ehf10.AEQbTJ;
        c52794wYp3.setOnClickListener(new Application(c52794wYp3, 1000L, this));
        InterfaceC32801mkT interfaceC32801mkT = (InterfaceC32801mkT) C43251rlk.copydefault(InterfaceC32801mkT.class);
        C16318ehf c16318ehf11 = this.OLrzqt;
        if (c16318ehf11 == null) {
            Intrinsics.gEmmrt("");
            c16318ehf11 = null;
        }
        C52794wYp c52794wYp4 = c16318ehf11.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c52794wYp4, "");
        InterfaceC32801mkT.ActionBar.setupClickProtection$default(interfaceC32801mkT, c52794wYp4, null, this, null, null, 26, null);
        C16318ehf c16318ehf12 = this.OLrzqt;
        if (c16318ehf12 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16318ehf2 = c16318ehf12;
        }
        C52794wYp c52794wYp5 = c16318ehf2.EZpvd;
        c52794wYp5.setOnClickListener(new Activity(c52794wYp5, 1000L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ() {
        if (C13912dbY.copydefault.gEmmrt()) {
            ActivityC18750foL.StateListAnimator.startActivity$default(ActivityC18750foL.Companion, this, null, "route_backup_wallet_list", 0, 10, null);
        } else {
            ActivityC18691fnF.Activity.startActivity$default(ActivityC18691fnF.Companion, this, null, "route_backup_wallet_list", 0, 10, null);
        }
    }

    public final void EZpvd() {
        final android.view.View viewInflate = android.view.LayoutInflater.from(this).inflate(C13754dXa.TaskDescription.isTimeProfileEmpty, (android.view.ViewGroup) null);
        android.widget.EditText editText = (android.widget.EditText) viewInflate.findViewById(C13754dXa.ActionBar.DQnQnb);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.KWHzl;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(this);
        Intrinsics.copydefault(viewInflate);
        viewOnClickListenerC54939xaY2.EZpvd(viewInflate);
        editText.addTextChangedListener(new ActionBar(objectRef, viewOnClickListenerC54939xaY2));
        viewOnClickListenerC54939xaY2.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AnyThread));
        viewOnClickListenerC54939xaY2.EZpvd(C33061mpO.setupSpanStyles$default(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickVisualMediaVideoOnly), C56423yEv.EZpvd(C56390yDp.OLrzqt("text", C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsRequestMultiplePermissions)))), new java.lang.String[]{C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsRequestMultiplePermissions)}, 0, null, false, new Function1() { // from class: o.fjL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18484fjK.EZpvd(viewInflate, (java.util.List) obj);
            }
        }, 14, null));
        viewOnClickListenerC54939xaY2.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickContact), new View.OnClickListener() { // from class: o.fjO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18484fjK.KWHzl(viewOnClickListenerC54939xaY2, this, view);
            }
        });
        viewOnClickListenerC54939xaY2.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsOpenDocument), new View.OnClickListener() { // from class: o.fjN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18484fjK.copydefault(viewOnClickListenerC54939xaY2, view);
            }
        });
        viewOnClickListenerC54939xaY2.show();
        android.widget.TextView textViewEZpvd = viewOnClickListenerC54939xaY2.EZpvd();
        if (textViewEZpvd != null) {
            textViewEZpvd.setEnabled(false);
        }
        android.widget.TextView textViewEZpvd2 = viewOnClickListenerC54939xaY2.EZpvd();
        if (textViewEZpvd2 != null) {
            textViewEZpvd2.setAlpha(0.2f);
        }
        android.widget.TextView textViewEZpvd3 = viewOnClickListenerC54939xaY2.EZpvd();
        if (textViewEZpvd3 != null) {
            textViewEZpvd3.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPRGtXKCDKRTZD));
        }
        this.KWHzl = viewOnClickListenerC54939xaY2;
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

    /* JADX INFO: renamed from: o.fjK$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        public final /* synthetic */ Ref.ObjectRef<java.lang.String> EZpvd;
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar(Ref.ObjectRef<java.lang.String> objectRef, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = objectRef;
            this.KWHzl = viewOnClickListenerC54939xaY;
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
            Ref.ObjectRef<java.lang.String> objectRef = this.EZpvd;
            if (editable != null) {
                java.lang.String string = editable.toString();
                t = string;
                if (string == null) {
                    t = "";
                }
            }
            objectRef.element = t;
            if (Intrinsics.EZpvd((java.lang.Object) this.EZpvd.element, (java.lang.Object) C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsRequestMultiplePermissions))) {
                android.widget.TextView textViewEZpvd = this.KWHzl.EZpvd();
                if (textViewEZpvd != null) {
                    textViewEZpvd.setAlpha(1.0f);
                }
            } else {
                android.widget.TextView textViewEZpvd2 = this.KWHzl.EZpvd();
                if (textViewEZpvd2 != null) {
                    textViewEZpvd2.setAlpha(0.2f);
                }
            }
            android.widget.TextView textViewEZpvd3 = this.KWHzl.EZpvd();
            if (textViewEZpvd3 != null) {
                textViewEZpvd3.setEnabled(Intrinsics.EZpvd((java.lang.Object) this.EZpvd.element, (java.lang.Object) C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsRequestMultiplePermissions)));
            }
        }
    }

    /* JADX INFO: renamed from: o.fjK$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ActivityC18484fjK EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC18484fjK activityC18484fjK) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = activityC18484fjK;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (this.EZpvd.OLrzqt() == 2) {
                    this.EZpvd.AEQbTJ();
                } else if (this.EZpvd.OLrzqt() == 3) {
                    this.EZpvd.finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.fjK$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC18484fjK KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC18484fjK activityC18484fjK) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = activityC18484fjK;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.EZpvd();
            }
        }
    }

    public static final Unit EZpvd(android.view.View view, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(view.getContext(), C13754dXa.LoaderManager.fIwbmz));
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, ActivityC18484fjK activityC18484fjK, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        activityC18484fjK.AEQbTJ.AEQbTJ(new C17260ezT(activityC18484fjK, "DefiDeleteWalletActivity", activityC18484fjK.EZpvd == 2, null, 8, null));
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.EZpvd == 2) {
            AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null);
            final Function1 function1 = new Function1() { // from class: o.fjI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18484fjK.copydefault((java.util.List) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.fjG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ActivityC18484fjK.copydefault(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtCopydefault);
            final Function1 function12 = new Function1() { // from class: o.fjM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18484fjK.AEQbTJ(this.KWHzl, (java.util.ArrayList) obj);
                }
            };
            addDisposable(abstractC58260yxtValueOf.copydefault(new InterfaceC58227yxM() { // from class: o.fjP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC18484fjK.OLrzqt(function12, obj);
                }
            }));
        }
    }

    public static final java.util.ArrayList copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) it.next();
            if (!abstractC12782ctV.zLjUOn()) {
                arrayList.add(abstractC12782ctV);
            }
        }
        return arrayList;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ActivityC18484fjK activityC18484fjK, java.util.ArrayList arrayList) {
        C16318ehf c16318ehf = null;
        if (arrayList.isEmpty()) {
            C16318ehf c16318ehf2 = activityC18484fjK.OLrzqt;
            if (c16318ehf2 == null) {
                Intrinsics.gEmmrt("");
                c16318ehf2 = null;
            }
            C52794wYp c52794wYp = c16318ehf2.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
            C16318ehf c16318ehf3 = activityC18484fjK.OLrzqt;
            if (c16318ehf3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16318ehf = c16318ehf3;
            }
            c16318ehf.AEQbTJ.setStyleStability(true);
            activityC18484fjK.EZpvd = 3;
        } else {
            C16318ehf c16318ehf4 = activityC18484fjK.OLrzqt;
            if (c16318ehf4 == null) {
                Intrinsics.gEmmrt("");
                c16318ehf4 = null;
            }
            C52794wYp c52794wYp2 = c16318ehf4.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(0);
            C16318ehf c16318ehf5 = activityC18484fjK.OLrzqt;
            if (c16318ehf5 == null) {
                Intrinsics.gEmmrt("");
                c16318ehf5 = null;
            }
            c16318ehf5.EZpvd.setText(activityC18484fjK.getString(C13754dXa.FragmentManager.ActivityResultContractsGetMultipleContentsCompanion));
            C16318ehf c16318ehf6 = activityC18484fjK.OLrzqt;
            if (c16318ehf6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16318ehf = c16318ehf6;
            }
            c16318ehf.AEQbTJ.setStyleStability(true);
            activityC18484fjK.EZpvd = 2;
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.KWHzl;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        this.KWHzl = null;
        super.onDestroy();
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

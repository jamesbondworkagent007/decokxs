package o;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.core.util.SPUtils;
import com.okinc.core.widget.OKSlidingTabLayout;
import com.okinc.debugbox.FloatWindowManager$handWsMsg$2;
import com.okinc.debugbox.bean.WsMsg;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.C31976mKx;
import o.C52761wXj;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mJK {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public static mJK KWHzl;
    public final java.lang.String AEQbTJ;
    public AppCompatDialog AYXKKw;
    public java.lang.String AhwBna;
    public android.widget.TextView AkhnZx;
    public android.widget.LinearLayout AuCTel;
    public android.widget.TextView AuCTelauCTel;
    public mJG AubY;
    public android.widget.RelativeLayout DbNXlk;
    public android.widget.ImageView OLrzqt;
    public final android.app.Application copydefault;
    public InterfaceC58217yxC djBIcL;
    public final Activity ejfBZ;
    public final TaskDescription fARcdN;
    public android.os.Handler fIwbmz;
    public boolean fJNWhG;
    public C32110mPw fetchVPNInfo;
    public OKSlidingTabLayout gEmmrt;
    public android.widget.TextView getFieldNames;
    public android.widget.TextView getNewProxyInstance;
    public android.widget.TextView hDKMBd;
    public android.widget.LinearLayout isConnected;
    public android.widget.TextView iwGUEr;
    public java.util.ArrayList<android.view.View> uzCIH;
    public java.lang.String valueOf;
    public ViewPager values;
    public C32112mPy wlaJM;
    public android.widget.RelativeLayout zLjUOn;
    public android.widget.LinearLayout zsXlph;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mJK.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ mJK(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.fJNWhG;
    }

    private mJK() {
        this.AEQbTJ = "FloatWindow";
        this.copydefault = C43246rlf.OLrzqt.valueOf();
        this.uzCIH = new java.util.ArrayList<>();
        android.view.View viewInflate = android.view.LayoutInflater.from(C52759wXh.AEQbTJ.OLrzqt(C52761wXj.LoaderManager.fvQaOB)).inflate(C31976mKx.Application.fJNWhG, (android.view.ViewGroup) null);
        Intrinsics.copydefault(viewInflate, "");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewInflate;
        this.AuCTel = linearLayout;
        KWHzl(linearLayout);
        djBIcL();
        AhwBna();
        this.AhwBna = "";
        this.valueOf = "";
        this.ejfBZ = new Activity();
        this.fARcdN = new TaskDescription();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mJK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final mJK EZpvd() {
            mJK mjk;
            synchronized (this) {
                if (mJK.KWHzl == null) {
                    mJK.KWHzl = new mJK(null);
                }
                mjk = mJK.KWHzl;
                Intrinsics.copydefault(mjk);
            }
            return mjk;
        }
    }

    public final void AhwBna() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("childThread");
        handlerThread.start();
        android.os.Looper looper = handlerThread.getLooper();
        android.os.Handler handler = looper != null ? new android.os.Handler(looper, new Handler.Callback() { // from class: o.mJP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return mJK.EZpvd(this.OLrzqt, message);
            }
        }) : null;
        this.fIwbmz = handler;
        if (handler != null) {
            C31969mKq c31969mKqOLrzqt = C31969mKq.Companion.OLrzqt();
            android.os.Handler handler2 = this.fIwbmz;
            Intrinsics.copydefault(handler2);
            c31969mKqOLrzqt.KWHzl(handler2);
        }
    }

    public static final boolean EZpvd(mJK mjk, android.os.Message message) {
        Intrinsics.checkNotNullParameter(message, "");
        int i = message.what;
        if (i == 3) {
            java.lang.Object obj = message.obj;
            Intrinsics.copydefault(obj, "");
            mjk.OLrzqt((WsMsg) obj);
        } else {
            if (i != 5) {
                return false;
            }
            C32112mPy c32112mPy = mjk.wlaJM;
            if (c32112mPy != null) {
                java.lang.String str = mjk.AhwBna;
                Intrinsics.copydefault((java.lang.Object) str);
                c32112mPy.setFilterText(str);
            }
        }
        return true;
    }

    public final void KWHzl(android.widget.LinearLayout linearLayout) {
        linearLayout.findViewById(C31976mKx.Activity.gkJEwt).setOnClickListener(new View.OnClickListener() { // from class: o.mKc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mJK.DbNXlk(this.copydefault, view);
            }
        });
        linearLayout.findViewById(C31976mKx.Activity.QKudOq).setOnClickListener(new View.OnClickListener() { // from class: o.mKe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mJK.KWHzl(view);
            }
        });
        linearLayout.findViewById(C31976mKx.Activity.gasjUx).setOnClickListener(new View.OnClickListener() { // from class: o.mJM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mJK.fetchVPNInfo(this.KWHzl, view);
            }
        });
        this.gEmmrt = (OKSlidingTabLayout) linearLayout.findViewById(C31976mKx.Activity.fFgQHt);
        this.values = (ViewPager) linearLayout.findViewById(C31976mKx.Activity.dvKsVJ);
        this.iwGUEr = (android.widget.TextView) linearLayout.findViewById(C31976mKx.Activity.DBxZfM);
        this.getNewProxyInstance = (android.widget.TextView) linearLayout.findViewById(C31976mKx.Activity.ULRxlR);
        this.hDKMBd = (android.widget.TextView) linearLayout.findViewById(C31976mKx.Activity.RKcVTr);
        this.getFieldNames = (android.widget.TextView) linearLayout.findViewById(C31976mKx.Activity.DCUTEIddSDPG);
        this.AkhnZx = (android.widget.TextView) linearLayout.findViewById(C31976mKx.Activity.dxcTrN);
        this.AuCTelauCTel = (android.widget.TextView) linearLayout.findViewById(C31976mKx.Activity.Ufzxmz);
        this.DbNXlk = (android.widget.RelativeLayout) linearLayout.findViewById(C31976mKx.Activity.finit);
        this.zLjUOn = (android.widget.RelativeLayout) linearLayout.findViewById(C31976mKx.Activity.UscePu);
        this.zsXlph = (android.widget.LinearLayout) linearLayout.findViewById(C31976mKx.Activity.RXzakW);
        this.isConnected = (android.widget.LinearLayout) linearLayout.findViewById(C31976mKx.Activity.fZBcTu);
        mJG mjg = new mJG(valueOf());
        this.AubY = mjg;
        ViewPager viewPager = this.values;
        if (viewPager != null) {
            viewPager.setAdapter(mjg);
        }
        OKSlidingTabLayout oKSlidingTabLayout = this.gEmmrt;
        if (oKSlidingTabLayout != null) {
            oKSlidingTabLayout.setViewPager(this.values);
        }
        OKSlidingTabLayout oKSlidingTabLayout2 = this.gEmmrt;
        if (oKSlidingTabLayout2 != null) {
            oKSlidingTabLayout2.setCurrentTab(0);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) linearLayout.findViewById(C31976mKx.Activity.hUfVAv);
        this.OLrzqt = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.mJL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mJK.values(this.KWHzl, view);
                }
            });
        }
    }

    public static final void DbNXlk(mJK mjk, android.view.View view) {
        C32112mPy c32112mPy = mjk.wlaJM;
        if (c32112mPy != null) {
            c32112mPy.AEQbTJ();
        }
        C32110mPw c32110mPw = mjk.fetchVPNInfo;
        if (c32110mPw != null) {
            c32110mPw.KWHzl();
        }
    }

    public static final void KWHzl(android.view.View view) {
        mNF mnfOLrzqt = mND.OLrzqt(RemoteMessageConst.Notification.ICON);
        if (mnfOLrzqt != null) {
            mnfOLrzqt.isConnected();
        }
        mNF mnfOLrzqt2 = mND.OLrzqt("detail");
        if (mnfOLrzqt2 != null) {
            mnfOLrzqt2.djBIcL();
        }
    }

    public static final void fetchVPNInfo(mJK mjk, android.view.View view) {
        mjk.copydefault();
    }

    public static final void values(mJK mjk, android.view.View view) {
        OKSlidingTabLayout oKSlidingTabLayout = mjk.gEmmrt;
        if (oKSlidingTabLayout != null && oKSlidingTabLayout.AEQbTJ() == 0) {
            mjk.EZpvd();
        } else {
            mjk.KWHzl();
        }
    }

    public final void EZpvd() {
        C32110mPw c32110mPw = this.fetchVPNInfo;
        java.util.List<java.lang.String> listOLrzqt = c32110mPw != null ? c32110mPw.OLrzqt() : null;
        if (listOLrzqt != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Iterator<java.lang.String> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append("\n");
            }
            java.lang.Object systemService = this.copydefault.getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("Request http details", sb.toString()));
            android.widget.Toast.makeText(this.copydefault, "Copied", 0).show();
        }
    }

    public final void KWHzl() {
        java.lang.String strKWHzl = C57553ykb.AEQbTJ.KWHzl();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
            java.lang.Object systemService = this.copydefault.getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("Request ws details", strKWHzl));
            android.widget.Toast.makeText(this.copydefault, "Copied", 0).show();
        }
    }

    public final void copydefault(final java.lang.String str) {
        android.view.ViewGroup viewGroup;
        android.view.Window window;
        android.view.Window window2;
        android.view.Window window3;
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null || this.AYXKKw != null || (viewGroup = (android.view.ViewGroup) android.view.View.inflate(activityAEQbTJ, C31976mKx.Application.ejfBZ, null)) == null) {
            return;
        }
        AppCompatDialog appCompatDialog = new AppCompatDialog(activityAEQbTJ);
        appCompatDialog.setContentView(viewGroup);
        appCompatDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.mJT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                mJK.AEQbTJ(this.AEQbTJ, dialogInterface);
            }
        });
        this.AYXKKw = appCompatDialog;
        appCompatDialog.setCanceledOnTouchOutside(false);
        AppCompatDialog appCompatDialog2 = this.AYXKKw;
        if (appCompatDialog2 != null && (window3 = appCompatDialog2.getWindow()) != null) {
            window3.setGravity(80);
        }
        AppCompatDialog appCompatDialog3 = this.AYXKKw;
        if (appCompatDialog3 != null && (window2 = appCompatDialog3.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        AppCompatDialog appCompatDialog4 = this.AYXKKw;
        if (appCompatDialog4 != null && (window = appCompatDialog4.getWindow()) != null) {
            window.setLayout(-1, -2);
        }
        final android.widget.EditText editText = (android.widget.EditText) viewGroup.findViewById(C31976mKx.Activity.DcqEDu);
        android.view.View viewFindViewById = viewGroup.findViewById(C31976mKx.Activity.RKDWNf);
        Intrinsics.copydefault(viewFindViewById, "");
        ((android.widget.TextView) viewFindViewById).setOnClickListener(new View.OnClickListener() { // from class: o.mJU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mJK.copydefault(str, this, editText, view);
            }
        });
        android.view.View viewFindViewById2 = viewGroup.findViewById(C31976mKx.Activity.AxsJAYaxsJAY);
        Intrinsics.copydefault(viewFindViewById2, "");
        ((android.widget.ImageView) viewFindViewById2).setOnClickListener(new View.OnClickListener() { // from class: o.mJR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mJK.AuCTel(this.AEQbTJ, view);
            }
        });
        AppCompatDialog appCompatDialog5 = this.AYXKKw;
        if (appCompatDialog5 != null) {
            appCompatDialog5.show();
        }
    }

    public static final void AEQbTJ(mJK mjk, android.content.DialogInterface dialogInterface) {
        mjk.AYXKKw = null;
    }

    public static final void copydefault(java.lang.String str, mJK mjk, android.widget.EditText editText, android.view.View view) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
            android.widget.TextView textView = mjk.iwGUEr;
            if (textView != null) {
                textView.setText(java.lang.String.valueOf(editText != null ? editText.getEditableText() : null));
            }
            mjk.OLrzqt(java.lang.String.valueOf(editText != null ? editText.getEditableText() : null));
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "2")) {
            android.widget.TextView textView2 = mjk.getNewProxyInstance;
            if (textView2 != null) {
                textView2.setText(java.lang.String.valueOf(editText != null ? editText.getEditableText() : null));
            }
            mjk.KWHzl(java.lang.String.valueOf(editText != null ? editText.getEditableText() : null));
        }
        mjk.OLrzqt();
    }

    public static final void AuCTel(mJK mjk, android.view.View view) {
        mjk.OLrzqt();
    }

    public final void OLrzqt() {
        try {
            AppCompatDialog appCompatDialog = this.AYXKKw;
            if (appCompatDialog != null) {
                Intrinsics.copydefault(appCompatDialog);
                if (appCompatDialog.isShowing()) {
                    AppCompatDialog appCompatDialog2 = this.AYXKKw;
                    Intrinsics.copydefault(appCompatDialog2);
                    appCompatDialog2.dismiss();
                }
                this.AYXKKw = null;
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }

    public static final class Application implements OKSlidingTabLayout.TaskDescription {
        public Application() {
        }

        @Override // com.okinc.core.widget.OKSlidingTabLayout.TaskDescription
        public void KWHzl(int i) {
            if (i == 0) {
                android.widget.RelativeLayout relativeLayout = mJK.this.DbNXlk;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(0);
                }
                android.widget.RelativeLayout relativeLayout2 = mJK.this.zLjUOn;
                if (relativeLayout2 != null) {
                    relativeLayout2.setVisibility(8);
                }
                android.widget.TextView textView = mJK.this.getFieldNames;
                if (textView != null) {
                    textView.setVisibility(4);
                }
                android.widget.TextView textView2 = mJK.this.hDKMBd;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    return;
                }
                return;
            }
            android.widget.RelativeLayout relativeLayout3 = mJK.this.DbNXlk;
            if (relativeLayout3 != null) {
                relativeLayout3.setVisibility(8);
            }
            android.widget.RelativeLayout relativeLayout4 = mJK.this.zLjUOn;
            if (relativeLayout4 != null) {
                relativeLayout4.setVisibility(0);
            }
            android.widget.TextView textView3 = mJK.this.getFieldNames;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            android.widget.TextView textView4 = mJK.this.hDKMBd;
            if (textView4 != null) {
                textView4.setVisibility(4);
            }
        }
    }

    public final void djBIcL() {
        OKSlidingTabLayout oKSlidingTabLayout = this.gEmmrt;
        if (oKSlidingTabLayout != null) {
            oKSlidingTabLayout.OLrzqt(new Application());
        }
        android.widget.LinearLayout linearLayout = this.isConnected;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.mJI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mJK.AhwBna(this.KWHzl, view);
                }
            });
        }
        android.widget.LinearLayout linearLayout2 = this.zsXlph;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.mJO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mJK.valueOf(this.copydefault, view);
                }
            });
        }
        InterfaceC58217yxC interfaceC58217yxC = this.djBIcL;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(mMR.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.mJV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mJK.copydefault(this.copydefault, (mMR) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.mJX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mJK.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.mJY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mJK.EZpvd((java.lang.Throwable) obj);
            }
        };
        this.djBIcL = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.mJW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mJK.AEQbTJ(function12, obj);
            }
        });
        android.widget.TextView textView = this.AkhnZx;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.mJZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mJK.isConnected(this.copydefault, view);
                }
            });
        }
        android.widget.TextView textView2 = this.AuCTelauCTel;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.mKd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mJK.AkhnZx(this.KWHzl, view);
                }
            });
        }
    }

    public static final void AhwBna(mJK mjk, android.view.View view) {
        mjk.copydefault("1");
    }

    public static final void valueOf(mJK mjk, android.view.View view) {
        mjk.copydefault("2");
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(mJK mjk, mMR mmr) {
        if (mmr.copydefault().equals("1")) {
            android.widget.TextView textView = mjk.iwGUEr;
            if (textView != null) {
                textView.setText(mmr.EZpvd());
            }
            java.lang.String strEZpvd = mmr.EZpvd();
            Intrinsics.checkNotNullExpressionValue(strEZpvd, "");
            mjk.OLrzqt(strEZpvd);
        } else if (mmr.copydefault().equals("2")) {
            android.widget.TextView textView2 = mjk.getNewProxyInstance;
            if (textView2 != null) {
                textView2.setText(mmr.EZpvd());
            }
            java.lang.String strEZpvd2 = mmr.EZpvd();
            Intrinsics.checkNotNullExpressionValue(strEZpvd2, "");
            mjk.KWHzl(strEZpvd2);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void isConnected(mJK mjk, android.view.View view) {
        android.widget.TextView textView = mjk.iwGUEr;
        if (textView != null) {
            textView.setText("");
        }
        mjk.OLrzqt("");
    }

    public static final void AkhnZx(mJK mjk, android.view.View view) {
        android.widget.TextView textView = mjk.getNewProxyInstance;
        if (textView != null) {
            textView.setText("");
        }
        mjk.KWHzl("");
    }

    public final java.util.ArrayList<android.view.View> valueOf() {
        java.util.ArrayList<android.view.View> arrayList = this.uzCIH;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (this.fetchVPNInfo == null) {
            this.fetchVPNInfo = new C32110mPw(this.copydefault);
        }
        java.util.ArrayList<android.view.View> arrayList2 = this.uzCIH;
        if (arrayList2 != null) {
            C32110mPw c32110mPw = this.fetchVPNInfo;
            Intrinsics.copydefault(c32110mPw, "");
            arrayList2.add(c32110mPw);
        }
        if (this.wlaJM == null) {
            this.wlaJM = new C32112mPy(this.copydefault);
        }
        java.util.ArrayList<android.view.View> arrayList3 = this.uzCIH;
        if (arrayList3 != null) {
            C32112mPy c32112mPy = this.wlaJM;
            Intrinsics.copydefault(c32112mPy, "");
            arrayList3.add(c32112mPy);
        }
        java.util.ArrayList<android.view.View> arrayList4 = this.uzCIH;
        Intrinsics.copydefault(arrayList4);
        return arrayList4;
    }

    public final void KWHzl(java.lang.String str) {
        this.AhwBna = str;
        android.os.Handler handler = this.fIwbmz;
        if (handler != null) {
            handler.sendEmptyMessage(5);
        }
    }

    public final void OLrzqt(java.lang.String str) {
        this.valueOf = str;
        C32110mPw c32110mPw = this.fetchVPNInfo;
        if (c32110mPw != null) {
            c32110mPw.setFilterText(str);
        }
    }

    public final void AEQbTJ(@NotNull Request request, @NotNull Response response, @NotNull ResponseBody responseBody) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(request, "");
            Intrinsics.checkNotNullParameter(response, "");
            Intrinsics.checkNotNullParameter(responseBody, "");
            C31966mKn c31966mKnCopydefault = C31966mKn.Companion.copydefault();
            if (c31966mKnCopydefault != null) {
                c31966mKnCopydefault.OLrzqt(request, response, responseBody, new Function1() { // from class: o.mJS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return mJK.EZpvd(this.EZpvd, (mMQ) obj);
                    }
                });
            }
        }
    }

    public static final Unit EZpvd(mJK mjk, mMQ mmq) {
        Intrinsics.checkNotNullParameter(mmq, "");
        mjk.EZpvd(mmq);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull Request request, @NotNull java.lang.Exception exc) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(request, "");
            Intrinsics.checkNotNullParameter(exc, "");
            C31966mKn c31966mKnCopydefault = C31966mKn.Companion.copydefault();
            if (c31966mKnCopydefault != null) {
                c31966mKnCopydefault.AEQbTJ(request, exc, new Function1() { // from class: o.mJQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return mJK.copydefault(this.AEQbTJ, (mMQ) obj);
                    }
                });
            }
        }
    }

    public static final Unit copydefault(mJK mjk, mMQ mmq) {
        Intrinsics.checkNotNullParameter(mmq, "");
        mjk.EZpvd(mmq);
        return Unit.INSTANCE;
    }

    public static final class Activity implements mNK {
        public Activity() {
        }

        @Override // o.mNK
        public void bj_() {
            pUU.EZpvd(mJK.this.AEQbTJ, "onSuccess");
        }

        @Override // o.mNK
        public void AEQbTJ() {
            pUU.EZpvd(mJK.this.AEQbTJ, "onFail");
        }
    }

    public static final class TaskDescription implements mNN {
        public TaskDescription() {
        }

        @Override // o.mNN
        public void OLrzqt(int i, int i2) {
            pUU.EZpvd(mJK.this.AEQbTJ, "onPositionUpdate: x=" + i + " y=" + i2);
        }

        @Override // o.mNN
        public void AYXKKw() {
            pUU.EZpvd(mJK.this.AEQbTJ, "onShow");
        }

        @Override // o.mNN
        public void KWHzl() {
            pUU.EZpvd(mJK.this.AEQbTJ, "onHide");
        }

        @Override // o.mNN
        public void OLrzqt() {
            pUU.EZpvd(mJK.this.AEQbTJ, "onDismiss");
        }

        @Override // o.mNN
        public void copydefault() {
            pUU.EZpvd(mJK.this.AEQbTJ, "onMoveAnimStart");
        }

        @Override // o.mNN
        public void bi_() {
            pUU.EZpvd(mJK.this.AEQbTJ, "onMoveAnimEnd");
        }

        @Override // o.mNN
        public void EZpvd() {
            pUU.EZpvd(mJK.this.AEQbTJ, "onBackToDesktop");
        }
    }

    public static /* synthetic */ void showFloatWindow$default(mJK mjk, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        mjk.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        this.fJNWhG = true;
        SPUtils.put("sp_http_floatwindow_enable", java.lang.Boolean.TRUE);
        C43292rmY.OLrzqt.gEmmrt(true);
        android.widget.ImageView imageView = new android.widget.ImageView(this.copydefault);
        imageView.setImageResource(C31976mKx.ActionBar.AYXKKw);
        mND.KWHzl(this.copydefault).EZpvd(imageView).AEQbTJ(RemoteMessageConst.Notification.ICON).copydefault(0).AEQbTJ(1, 0.7f).KWHzl(3).EZpvd(this.fARcdN).AEQbTJ(this.ejfBZ).KWHzl(true).KWHzl();
        mND.KWHzl(this.copydefault).EZpvd(this.AuCTel).AEQbTJ("detail").copydefault(0, 1.0f).OLrzqt(0, 0.0f).AEQbTJ(1, 0.2f).KWHzl(3).EZpvd(this.fARcdN).AEQbTJ(this.ejfBZ).KWHzl(true).KWHzl();
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.mJN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mJK.OLrzqt(view);
            }
        });
        if (z) {
            mNF mnfOLrzqt = mND.OLrzqt(RemoteMessageConst.Notification.ICON);
            if (mnfOLrzqt != null) {
                mnfOLrzqt.djBIcL();
            }
            mNF mnfOLrzqt2 = mND.OLrzqt("detail");
            if (mnfOLrzqt2 != null) {
                mnfOLrzqt2.isConnected();
                return;
            }
            return;
        }
        mNF mnfOLrzqt3 = mND.OLrzqt(RemoteMessageConst.Notification.ICON);
        if (mnfOLrzqt3 != null) {
            mnfOLrzqt3.isConnected();
        }
        mNF mnfOLrzqt4 = mND.OLrzqt("detail");
        if (mnfOLrzqt4 != null) {
            mnfOLrzqt4.djBIcL();
        }
    }

    public static final void OLrzqt(android.view.View view) {
        mNF mnfOLrzqt = mND.OLrzqt(RemoteMessageConst.Notification.ICON);
        if (mnfOLrzqt != null) {
            mnfOLrzqt.djBIcL();
        }
        mNF mnfOLrzqt2 = mND.OLrzqt("detail");
        if (mnfOLrzqt2 != null) {
            mnfOLrzqt2.isConnected();
        }
    }

    public final void copydefault() {
        this.fJNWhG = false;
        SPUtils.put("sp_http_floatwindow_enable", java.lang.Boolean.FALSE);
        C43292rmY.OLrzqt.gEmmrt(false);
        if (mND.OLrzqt(RemoteMessageConst.Notification.ICON) != null) {
            mND.OLrzqt(RemoteMessageConst.Notification.ICON).isConnected();
            mND.EZpvd(RemoteMessageConst.Notification.ICON);
            mND.OLrzqt("detail").isConnected();
            mND.EZpvd("detail");
        }
        C31966mKn c31966mKnCopydefault = C31966mKn.Companion.copydefault();
        if (c31966mKnCopydefault != null) {
            c31966mKnCopydefault.EZpvd();
        }
        C31969mKq.Companion.OLrzqt().valueOf();
        C32110mPw c32110mPw = this.fetchVPNInfo;
        if (c32110mPw != null) {
            c32110mPw.KWHzl();
        }
        C32112mPy c32112mPy = this.wlaJM;
        if (c32112mPy != null) {
            c32112mPy.AEQbTJ();
        }
        OLrzqt();
        KWHzl = null;
        C57553ykb.AEQbTJ.OLrzqt();
    }

    public final void EZpvd(mMQ mmq) {
        synchronized (this) {
            mmq.KWHzl(this.valueOf);
            C32110mPw c32110mPw = this.fetchVPNInfo;
            if (c32110mPw != null) {
                c32110mPw.KWHzl(mmq, this.valueOf);
            }
        }
    }

    public final void OLrzqt(@NotNull WsMsg wsMsg) {
        C32112mPy c32112mPy;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(wsMsg, "");
            wsMsg.setFilterText(java.lang.String.valueOf(this.AhwBna));
            java.lang.String str = this.AhwBna;
            if (str != null && (c32112mPy = this.wlaJM) != null) {
                c32112mPy.EZpvd(wsMsg, str);
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new FloatWindowManager$handWsMsg$2(this, C57553ykb.AEQbTJ.copydefault(), null), 3, null);
        }
    }
}

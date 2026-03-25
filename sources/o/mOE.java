package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.firebase.messaging.Constants;
import com.okinc.core.util.SPUtils;
import io.reactivex.BackpressureStrategy;
import java.net.InetSocketAddress;
import java.net.Socket;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mOE extends android.widget.FrameLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public AbstractC32035mNb AEQbTJ;
    public Function0<Unit> KWHzl;
    public Function1<? super java.lang.Integer, Unit> OLrzqt;
    public InterfaceC58217yxC copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(Function1<? super java.lang.Integer, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDohConfigCallback(Function0<Unit> function0) {
        this.KWHzl = function0;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mOE.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mOE(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mOE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mOE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C31976mKx.Application.AxsJAY, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC32035mNb) viewDataBindingInflate;
        AEQbTJ();
    }

    public final void AEQbTJ() {
        this.AEQbTJ.DbNXlk.setChecked(SPUtils.getBoolean("doh_debug_sp_key", false));
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(this.AEQbTJ.DbNXlk);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.mOK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mOE.EZpvd(this.EZpvd, obj);
            }
        });
        C43368rnv c43368rnv = C43368rnv.copydefault;
        final java.lang.String string = SPUtils.getString(c43368rnv.copydefault("doh_debug_http_", true), "");
        Intrinsics.copydefault((java.lang.Object) string);
        java.lang.String string2 = SPUtils.getString(c43368rnv.EZpvd(string), "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) string) && C33129mqd.OLrzqt((java.lang.CharSequence) string2)) {
            this.AEQbTJ.fIwbmz.setText(string + "-" + string2);
        }
        this.AEQbTJ.fIwbmz.setOnClickListener(new View.OnClickListener() { // from class: o.mOP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mOE.AhwBna(this.OLrzqt, view);
            }
        });
        final java.lang.String string3 = SPUtils.getString(c43368rnv.copydefault("doh_debug_v5_", true), "");
        Intrinsics.copydefault((java.lang.Object) string3);
        java.lang.String string4 = SPUtils.getString(c43368rnv.EZpvd(string3), "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) string3) && C33129mqd.OLrzqt((java.lang.CharSequence) string4)) {
            this.AEQbTJ.fJNWhG.setText(string3 + "-" + string4);
        }
        this.AEQbTJ.fJNWhG.setOnClickListener(new View.OnClickListener() { // from class: o.mOM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mOE.gEmmrt(this.OLrzqt, view);
            }
        });
        final java.lang.String string5 = SPUtils.getString(c43368rnv.copydefault("doh_debug_http_", false), "");
        Intrinsics.copydefault((java.lang.Object) string5);
        java.lang.String string6 = SPUtils.getString(c43368rnv.EZpvd(string5), "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) string5) && C33129mqd.OLrzqt((java.lang.CharSequence) string6)) {
            this.AEQbTJ.djBIcL.setText(string5 + "-" + string6);
        }
        this.AEQbTJ.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.mOL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mOE.djBIcL(this.KWHzl, view);
            }
        });
        final java.lang.String string7 = SPUtils.getString(c43368rnv.copydefault("doh_debug_v5_", false), "");
        Intrinsics.copydefault((java.lang.Object) string7);
        java.lang.String string8 = SPUtils.getString(c43368rnv.EZpvd(string7), "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) string7) && C33129mqd.OLrzqt((java.lang.CharSequence) string8)) {
            this.AEQbTJ.valueOf.setText(string7 + "-" + string8);
        }
        this.AEQbTJ.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.mOO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mOE.valueOf(this.AEQbTJ, view);
            }
        });
        final java.lang.String string9 = SPUtils.getString(c43368rnv.copydefault("doh_debug_dexpri_", true), "");
        Intrinsics.copydefault((java.lang.Object) string9);
        java.lang.String string10 = SPUtils.getString(c43368rnv.EZpvd(string9), "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) string9) && C33129mqd.OLrzqt((java.lang.CharSequence) string10)) {
            this.AEQbTJ.AuCTel.setText(string9 + "-" + string10);
        }
        this.AEQbTJ.AuCTel.setOnClickListener(new View.OnClickListener() { // from class: o.mOT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mOE.isConnected(this.AEQbTJ, view);
            }
        });
        this.AEQbTJ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.mOU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mOE.fetchVPNInfo(this.EZpvd, view);
            }
        });
        C8003auW.copydefault(this.AEQbTJ.AhwBna).throttleFirst(2L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.mOR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mOE.djBIcL(string, this, obj);
            }
        });
        C8003auW.copydefault(this.AEQbTJ.gEmmrt).throttleFirst(2L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.mOQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mOE.valueOf(string3, this, obj);
            }
        });
        C8003auW.copydefault(this.AEQbTJ.KWHzl).throttleFirst(2L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.mOZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mOE.gEmmrt(string5, this, obj);
            }
        });
        C8003auW.copydefault(this.AEQbTJ.copydefault).throttleFirst(2L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.mOG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mOE.AYXKKw(string7, this, obj);
            }
        });
        C8003auW.copydefault(this.AEQbTJ.AYXKKw).throttleFirst(2L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.mON
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mOE.AhwBna(string9, this, obj);
            }
        });
    }

    public static final void EZpvd(mOE moe, java.lang.Object obj) {
        moe.AEQbTJ.DbNXlk.setChecked(!r2.isChecked());
        SPUtils.put("doh_debug_sp_key", java.lang.Boolean.valueOf(moe.AEQbTJ.DbNXlk.isChecked()));
    }

    public static final void AhwBna(mOE moe, android.view.View view) {
        Function1<? super java.lang.Integer, Unit> function1 = moe.OLrzqt;
        if (function1 != null) {
            function1.invoke(1);
        }
    }

    public static final void gEmmrt(mOE moe, android.view.View view) {
        Function1<? super java.lang.Integer, Unit> function1 = moe.OLrzqt;
        if (function1 != null) {
            function1.invoke(2);
        }
    }

    public static final void djBIcL(mOE moe, android.view.View view) {
        Function1<? super java.lang.Integer, Unit> function1 = moe.OLrzqt;
        if (function1 != null) {
            function1.invoke(3);
        }
    }

    public static final void valueOf(mOE moe, android.view.View view) {
        Function1<? super java.lang.Integer, Unit> function1 = moe.OLrzqt;
        if (function1 != null) {
            function1.invoke(4);
        }
    }

    public static final void isConnected(mOE moe, android.view.View view) {
        Function1<? super java.lang.Integer, Unit> function1 = moe.OLrzqt;
        if (function1 != null) {
            function1.invoke(5);
        }
    }

    public static final void fetchVPNInfo(mOE moe, android.view.View view) {
        Function0<Unit> function0 = moe.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void djBIcL(java.lang.String str, final mOE moe, java.lang.Object obj) {
        C43368rnv c43368rnv = C43368rnv.copydefault;
        Intrinsics.copydefault((java.lang.Object) str);
        java.lang.String string = SPUtils.getString(c43368rnv.EZpvd(str), "");
        if (string == null || string.length() == 0) {
            return;
        }
        moe.KWHzl(string, new Function1() { // from class: o.mPe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return mOE.djBIcL(this.copydefault, (java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.mPb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return mOE.djBIcL(this.KWHzl, (java.lang.Throwable) obj2);
            }
        });
    }

    public static final Unit djBIcL(mOE moe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        moe.AEQbTJ.AhwBna.setText(str + " ms");
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(mOE moe, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C33134mqi.AEQbTJ(th.getMessage());
        moe.AEQbTJ.AhwBna.setText(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        return Unit.INSTANCE;
    }

    public static final void valueOf(java.lang.String str, final mOE moe, java.lang.Object obj) {
        C43368rnv c43368rnv = C43368rnv.copydefault;
        Intrinsics.copydefault((java.lang.Object) str);
        java.lang.String string = SPUtils.getString(c43368rnv.EZpvd(str), "");
        if (string == null || string.length() == 0) {
            return;
        }
        moe.KWHzl(string, new Function1() { // from class: o.mPj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return mOE.valueOf(this.copydefault, (java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.mOH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return mOE.gEmmrt(this.OLrzqt, (java.lang.Throwable) obj2);
            }
        });
    }

    public static final Unit valueOf(mOE moe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        moe.AEQbTJ.gEmmrt.setText(str + " ms");
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(mOE moe, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C33134mqi.AEQbTJ(th.getMessage());
        moe.AEQbTJ.gEmmrt.setText(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(java.lang.String str, final mOE moe, java.lang.Object obj) {
        C43368rnv c43368rnv = C43368rnv.copydefault;
        Intrinsics.copydefault((java.lang.Object) str);
        java.lang.String string = SPUtils.getString(c43368rnv.EZpvd(str), "");
        if (string == null || string.length() == 0) {
            return;
        }
        moe.KWHzl(string, new Function1() { // from class: o.mOY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return mOE.AYXKKw(this.AEQbTJ, (java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.mOX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return mOE.AhwBna(this.KWHzl, (java.lang.Throwable) obj2);
            }
        });
    }

    public static final Unit AYXKKw(mOE moe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        moe.AEQbTJ.KWHzl.setText(str + " ms");
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(mOE moe, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C33134mqi.AEQbTJ(th.getMessage());
        moe.AEQbTJ.KWHzl.setText(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(java.lang.String str, final mOE moe, java.lang.Object obj) {
        C43368rnv c43368rnv = C43368rnv.copydefault;
        Intrinsics.copydefault((java.lang.Object) str);
        java.lang.String string = SPUtils.getString(c43368rnv.EZpvd(str), "");
        if (string == null || string.length() == 0) {
            return;
        }
        moe.KWHzl(string, new Function1() { // from class: o.mOV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return mOE.gEmmrt(this.OLrzqt, (java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.mOW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return mOE.valueOf(this.AEQbTJ, (java.lang.Throwable) obj2);
            }
        });
    }

    public static final Unit gEmmrt(mOE moe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        moe.AEQbTJ.copydefault.setText(str + " ms");
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(mOE moe, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C33134mqi.AEQbTJ(th.getMessage());
        moe.AEQbTJ.copydefault.setText(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(java.lang.String str, final mOE moe, java.lang.Object obj) {
        C43368rnv c43368rnv = C43368rnv.copydefault;
        Intrinsics.copydefault((java.lang.Object) str);
        java.lang.String string = SPUtils.getString(c43368rnv.EZpvd(str), "");
        if (string == null || string.length() == 0) {
            return;
        }
        moe.KWHzl(string, new Function1() { // from class: o.mPa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return mOE.AhwBna(this.copydefault, (java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.mPf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return mOE.AYXKKw(this.EZpvd, (java.lang.Throwable) obj2);
            }
        });
    }

    public static final Unit AhwBna(mOE moe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        moe.AEQbTJ.AYXKKw.setText(str + " ms");
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(mOE moe, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C33134mqi.AEQbTJ(th.getMessage());
        moe.AEQbTJ.AYXKKw.setText(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        return Unit.INSTANCE;
    }

    public final void setDebugInfo(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i == 1) {
            this.AEQbTJ.fIwbmz.setText(str);
            return;
        }
        if (i == 2) {
            this.AEQbTJ.fJNWhG.setText(str);
            return;
        }
        if (i == 3) {
            this.AEQbTJ.djBIcL.setText(str);
        } else if (i == 4) {
            this.AEQbTJ.valueOf.setText(str);
        } else {
            if (i != 5) {
                return;
            }
            this.AEQbTJ.AuCTel.setText(str);
        }
    }

    public final void OLrzqt() {
        AEQbTJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final void KWHzl(final java.lang.String str, final Function1<? super java.lang.String, Unit> function1, final Function1<? super java.lang.Throwable, Unit> function12) {
        InterfaceC58217yxC interfaceC58217yxC = this.copydefault;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.mOJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                mOE.copydefault(str, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.mOI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mOE.KWHzl(function1, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.mOS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mOE.AEQbTJ(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.mPc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mOE.OLrzqt(function12, (java.lang.Throwable) obj);
            }
        };
        this.copydefault = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.mPd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                mOE.copydefault(function14, obj);
            }
        });
    }

    public static final void copydefault(java.lang.String str, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        Socket socket = new Socket();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(str, 443);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            socket.connect(inetSocketAddress, 3000);
            interfaceC58184ywW.onNext(java.lang.String.valueOf(java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (java.lang.Exception e) {
            interfaceC58184ywW.onError(e);
        }
        interfaceC58184ywW.onComplete();
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function1 function1, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        function1.invoke(th);
        return Unit.INSTANCE;
    }
}

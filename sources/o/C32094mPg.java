package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.firebase.messaging.Constants;
import io.reactivex.BackpressureStrategy;
import java.net.InetSocketAddress;
import java.net.Socket;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mPg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C32094mPg extends android.widget.FrameLayout {
    public AbstractC32041mNh AEQbTJ;
    public InterfaceC58217yxC EZpvd;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32094mPg(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32094mPg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32094mPg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C31976mKx.Application.DTwDnp, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC32041mNh) viewDataBindingInflate;
    }

    public final void setData(@NotNull java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ.AEQbTJ.setText(str + "-" + str2);
        C8003auW.copydefault(this.AEQbTJ.EZpvd).throttleFirst(2L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.mPh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C32094mPg.setData$lambda$2(str2, this, obj);
            }
        });
    }

    public static final void setData$lambda$2(java.lang.String str, final C32094mPg c32094mPg, java.lang.Object obj) {
        if (str.length() == 0) {
            return;
        }
        c32094mPg.AEQbTJ(str, new Function1() { // from class: o.mPi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C32094mPg.AEQbTJ(this.KWHzl, (java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.mPk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C32094mPg.copydefault(this.KWHzl, (java.lang.Throwable) obj2);
            }
        });
    }

    public static final Unit AEQbTJ(C32094mPg c32094mPg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c32094mPg.AEQbTJ.EZpvd.setText(str + " ms");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C32094mPg c32094mPg, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C55326xho.AEQbTJ(th.getMessage());
        c32094mPg.AEQbTJ.EZpvd.setText(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final void AEQbTJ(final java.lang.String str, final Function1<? super java.lang.String, Unit> function1, final Function1<? super java.lang.Throwable, Unit> function12) {
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.mPn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C32094mPg.KWHzl(str, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.mPo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32094mPg.EZpvd(function1, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.mPl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C32094mPg.OLrzqt(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.mPm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32094mPg.OLrzqt(function12, (java.lang.Throwable) obj);
            }
        };
        this.EZpvd = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.mPs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C32094mPg.EZpvd(function14, obj);
            }
        });
    }

    public static final void KWHzl(java.lang.String str, InterfaceC58184ywW interfaceC58184ywW) {
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

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        function1.invoke(th);
        return Unit.INSTANCE;
    }
}

package o;

import androidx.lifecycle.Lifecycle;
import com.okinc.business.defi.biz.core.tx.check.ChainCheckType;
import com.okinc.business.defi.biz.core.tx.check.ChainStatus;
import com.okinc.business.defi.biz.core.tx.check.ChainStatusChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bfZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9966bfZ extends AbstractC32996moC {
    public Function1<? super java.lang.Boolean, Unit> AEQbTJ;

    /* JADX INFO: renamed from: o.bfZ$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChainStatus.values().length];
            try {
                iArr[ChainStatus.REGISTERING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChainStatus.UNREGISTERED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    public final boolean EZpvd(@NotNull C10525bqB c10525bqB, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(c10525bqB, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
        if (c10525bqB.values().AhwBna(java.lang.Long.valueOf(c10525bqB.AEQbTJ()))) {
            return false;
        }
        KWHzl(c10525bqB.OLrzqt());
        return true;
    }

    public final void KWHzl(long j) {
        C9930beq c9930beqEZpvd = C9930beq.Companion.EZpvd(j);
        c9930beqEZpvd.copydefault(new Function1() { // from class: o.bgd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC9966bfZ.AEQbTJ(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        c9930beqEZpvd.show(getChildFragmentManager(), getTAG());
    }

    public static final Unit AEQbTJ(AbstractC9966bfZ abstractC9966bfZ, boolean z) {
        Function1<? super java.lang.Boolean, Unit> function1 = abstractC9966bfZ.AEQbTJ;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final C10525bqB c10525bqB) {
        if (c10525bqB != null && c10525bqB.values().djSkpj() && c10525bqB.KWHzl().DBxZfM()) {
            showLoadingAtOnce();
            AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(ChainStatusChecker.OLrzqt.OLrzqt(c10525bqB.OLrzqt(), c10525bqB.zuBGHE(), c10525bqB.KWHzl().OLrzqt(), C56402yEa.EZpvd(ChainCheckType.CHECK_REGISTER)), this, Lifecycle.Event.ON_DESTROY);
            final Function1 function1 = new Function1() { // from class: o.bga
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC9966bfZ.OLrzqt(this.copydefault, c10525bqB, (ChainStatus) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bgc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC9966bfZ.copydefault(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.bge
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC9966bfZ.AEQbTJ(this.OLrzqt, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bgb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC9966bfZ.EZpvd(function12, obj);
                }
            });
        }
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(AbstractC9966bfZ abstractC9966bfZ, C10525bqB c10525bqB, ChainStatus chainStatus) {
        abstractC9966bfZ.dismissLoading();
        int i = chainStatus == null ? -1 : Application.AEQbTJ[chainStatus.ordinal()];
        if (i == 1) {
            C14083dek.OLrzqt.KWHzl();
        } else if (i == 2) {
            C14083dek c14083dek = C14083dek.OLrzqt;
            android.content.Context context = abstractC9966bfZ.getContext();
            if (context == null) {
                return Unit.INSTANCE;
            }
            androidx.fragment.app.FragmentManager childFragmentManager = abstractC9966bfZ.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C14083dek.handleUnregisteredStatus$default(c14083dek, context, childFragmentManager, c10525bqB.values().DbNXlk(), c10525bqB.OLrzqt(), null, 16, null);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractC9966bfZ abstractC9966bfZ, java.lang.Throwable th) {
        abstractC9966bfZ.dismissLoading();
        java.lang.String message = th.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }
}

package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.net.bean.AAStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fyg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19300fyg extends AbstractC33073mpa {
    public final MutableLiveData<AAStatus> OLrzqt = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<AAStatus> EZpvd() {
        return this.OLrzqt;
    }

    public static /* synthetic */ void homeCheckAAOwner$default(C19300fyg c19300fyg, java.lang.String str, java.lang.String str2, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        c19300fyg.EZpvd(str, str2, l);
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58185ywX<AAStatus> abstractC58185ywXKWHzl = fNC.OLrzqt.KWHzl(str, str2, l);
        final Function1 function1 = new Function1() { // from class: o.fye
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19300fyg.EZpvd(this.copydefault, (AAStatus) obj);
            }
        };
        InterfaceC58227yxM<? super AAStatus> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fyc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19300fyg.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fyd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19300fyg.copydefault((java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fyf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19300fyg.KWHzl(function12, obj);
            }
        }));
    }

    public static final Unit EZpvd(C19300fyg c19300fyg, AAStatus aAStatus) {
        c19300fyg.OLrzqt.setValue(aAStatus);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }
}
